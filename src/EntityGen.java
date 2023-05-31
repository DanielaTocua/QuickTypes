import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.util.*;

public class EntityGen extends MiLenguajeBaseListener {
    Map<String, ArrayList<String[]>> entityDict = new HashMap<String, ArrayList<String[]>>();

    Set <String>  importList = new HashSet<String>();
    String entityName;
    String entityText  = "";

    String propPairValues[] = new String[9];
    String columnName = "";

    public void addText(String textToAdd){
        entityText = entityText + textToAdd;

    }

    public void addPropertyToDict(){
        entityDict.get(entityName).add(propPairValues);
        propPairValues = new String[9];
        Arrays.fill(propPairValues, "");
    }

    @Override public void exitStart(MiLenguajeParser.StartContext ctx) {
        entityDict.forEach((key, value) -> System.out.println(key + ":" + Arrays.toString(value.get(4))));
    }

    public void generateEntity( MiLenguajeParser.DefinablesContext ctx)  {
        entityName = ctx.getChild(1).getText();
        addText("@Entity(\"" + entityName.toLowerCase()  + "\")\n");
        addText("export class " + entityName + " extends BaseEntity {\n");
        // Entity Logic
        entityDict.put(entityName, new ArrayList<>());
    }

    @Override public void enterDefinables(MiLenguajeParser.DefinablesContext ctx){
        if (ctx.ENTITY() != null){
            generateEntity(ctx);
        }
    }

    @Override public void exitDefinables(MiLenguajeParser.DefinablesContext ctx){

        if (ctx.ENTITY() != null){
            // End of Entity Logic
            addText("}\n");


            // File Creation
            try{
                PrintWriter writer = new PrintWriter("tsGen/entities/" +  entityName + ".entity.ts", "UTF-8");
                writer.println(entityText);
                writer.close();
            } catch (Exception err){
                System.out.println("File could not be created:  " + err);

            }
            importList = new HashSet<String>();
            entityName = "";
            entityText  = "";

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

    @Override public void exitPropObj(MiLenguajeParser.PropObjContext ctx) {
        addText("@");

        if (propPairValues[6].equals("true")) {
            addText("Primary");
        }
        if (propPairValues[4].equals("true")){
            addText("Generated");
        }
        addText("Column({");
        addText((propPairValues[1].isBlank()) ? "" : "length : "+  propPairValues[1] + ","); ;
        addText((propPairValues[2].isBlank()) ? "" : "nullable : true");
        addText((propPairValues[3].isBlank()) ? "" : "default : " + propPairValues[3] + ",");
        addText((propPairValues[5].isBlank()) ? "" : "unique : true");
        addText("})\n");
        addText("\t"+ columnName.toLowerCase() + ":" + propPairValues[7] + "\n");
        propPairValues[0] = columnName.toLowerCase();
        addPropertyToDict();

    }


    @Override public void exitPropDef(MiLenguajeParser.PropDefContext ctx) {
        if (ctx.types() != null){
            propPairValues[0] = ctx.NAME().getText().toLowerCase();
            propPairValues[7] = ctx.types().getText();
            addPropertyToDict();
            addText("@Column()\n");
            addText("\t"+ ctx.NAME().getText() + ":" + ctx.types().getText() + "\n");
        }

    }

    @Override public void exitPropDefRecursion(MiLenguajeParser.PropDefRecursionContext ctx) {
        if (ctx.types() != null){
            propPairValues[0] = ctx.NAME().getText().toLowerCase();
            propPairValues[7] = ctx.types().getText();
            addPropertyToDict();
            addText("@Column()\n");
            addText("\t"+ ctx.NAME().getText() + ":" + ctx.types().getText() + "\n");
        }

    }

    @Override public void enterPropDef(MiLenguajeParser.PropDefContext ctx) {
        columnName = ctx.NAME().getText();
        Arrays.fill(propPairValues, "");

    }

    @Override public void enterPropDefRecursion(MiLenguajeParser.PropDefRecursionContext ctx) {
        if (ctx.NAME() != null) {
            columnName = ctx.NAME().getText();
        }


    }




}


