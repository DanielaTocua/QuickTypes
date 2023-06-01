import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.util.*;

public class EntityGen extends MiLenguajeBaseListener {
    Map<String, ArrayList<String[]>> entityDict = new HashMap<String, ArrayList<String[]>>();

    Map <String, Set<String>> entityImports = new HashMap<String, Set<String>>();

    String entityName;
    String text  = "";

    String propPairValues[] = new String[9];
    String columnName = "";

    Integer indentCounter = 0;
    public void indent(Boolean add){
        if (add){
            indentCounter ++;
        }  else {
            indentCounter --;
        }
    }

    public void addText(String textToAdd){
        text = text + "\t".repeat(indentCounter)+ textToAdd;

    }

    public void addPropertyToDict(){
        entityDict.get(entityName).add(propPairValues);
        propPairValues = new String[9];
        Arrays.fill(propPairValues, "");
    }

    public void generateEntity(String genEntityName)  {
        // Imports
        addText("import {\n");
        indent(true);
        addText("BaseEntity,\n");
        addText("Entity,\n");
        addText( String.join(",\n"+ "\t".repeat(indentCounter), entityImports.get(genEntityName))+ "\n");
        indent(false);
        addText("} from \"typeorm\"\n");


        // Entity Declaration
        addText("@Entity(\"" + genEntityName.toLowerCase()  + "\")\n");
        addText("export class " + genEntityName + " extends BaseEntity {\n");
        indent(true);

        // Start of Entity Logic
        ArrayList <String[]> entityList = entityDict.get(genEntityName);
        for (int i = 0; i <entityList.size(); i++ ) {
            String columnString = "@";
            String[] genPropPairValues = entityList.get(i);
            if (genPropPairValues[6].equals("true")) {
                columnString+= "Primary";
            }
            if (genPropPairValues[4].equals("true")){
                columnString+= "Generated";
            }
            columnString += "Column({";
            columnString+=((genPropPairValues[1].isBlank()) ? "" : "length : "+  genPropPairValues[1] + ","); ;
            columnString+=((genPropPairValues[2].isBlank()) ? "" : "nullable : true");
            columnString+=((genPropPairValues[3].isBlank()) ? "" : "default : " + genPropPairValues[3] + ",");
            columnString+=((genPropPairValues[5].isBlank()) ? "" : "unique : true");
            columnString+=("})\n");
            addText(columnString);
            addText( genPropPairValues[0] + " : " + genPropPairValues[7] + "\n");

        }

        // End of Entity Logic
        indent(false);
        addText("}\n");


        // File Creation
        try{
            PrintWriter writer = new PrintWriter("tsGen/entities/" +  genEntityName + ".entity.ts", "UTF-8");
            writer.println(text);
            writer.close();
            // Resets used values
            text  = "";
        } catch (Exception err){
            System.out.println("File could not be created:  " + err);

        }

    }



    @Override public void enterDefinables(MiLenguajeParser.DefinablesContext ctx){
        if (ctx.ENTITY() != null){
            entityName = ctx.NAME(0).getText();
            entityDict.put(entityName, new ArrayList<>());
            entityImports.put(entityName, new HashSet<>());
        }
    }

    @Override public void exitDefinables(MiLenguajeParser.DefinablesContext ctx){

        if (ctx.ENTITY() != null){
            generateEntity(entityName);
            entityName = "";
        }
    }

    @Override public void enterPropPairs(MiLenguajeParser.PropPairsContext ctx) {
        String key = ctx.getChild(0).getText();
        switch (key) {
            case "type":
                propPairValues[7] = ctx.types().getText();
                break;
            case "length":
                propPairValues[1] = ctx.INT().getText();
                break;
            case "nullable":
                propPairValues[2] = "true";
                break;
            case "default":
                propPairValues[3] = ctx.basicValues().getText();
                break;
            case "generated":
                propPairValues[4] = "true";
                break;
            case "unique":
                propPairValues[5] = ctx.basicValues().getText();
                break;
            case "primary":
                propPairValues[6] = "true";
                break;

            }

        }




    @Override public void enterPropDef(MiLenguajeParser.PropDefContext ctx) {
        Arrays.fill(propPairValues,"");
        columnName = ctx.NAME().getText();
        propPairValues[0] = ctx.NAME().getText().toLowerCase();
        if (ctx.types() != null) {
            propPairValues[7] = ctx.types().getText();
        }

    }

    @Override public void enterPropDefRecursion(MiLenguajeParser.PropDefRecursionContext ctx) {
        String columnStringImport = "";
        if (propPairValues[6].equals("true")){
            columnStringImport += "Primary";
        }
        if (propPairValues[4].equals("true")){
            columnStringImport += "Generated";
        }
        columnStringImport+= "Column";
        entityImports.get(entityName).add(columnStringImport);
        addPropertyToDict();
    }




}


