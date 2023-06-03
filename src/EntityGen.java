import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.io.FileWriter;

import java.util.*;

public class EntityGen extends MiLenguajeBaseListener {
    Map<String, ArrayList<String[]>> entityDict = new HashMap<String, ArrayList<String[]>>();

    Map<String, HashMap<String, String[]>>  entityRelations = new HashMap<>();

    // Generación de entidades
    Map <String, HashSet<String>[]> entityImports = new HashMap<>();

    //DTOs (k1 = entityName, k2 = columnName, v = set de validaciones)
    Map <String, HashMap<String, HashSet<String>>> entityValidations = new HashMap<String, HashMap<String, HashSet<String>>>();


    String entityName;
    String dtoName;
    String dtoName2;
    String text  = "";
    String columnName = "";

    String relationName;
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


    public void generateEntity(String genEntityName)  {
        // Imports
        addText("import {\n");
        indent(true);
        addText("BaseEntity,\n");
        addText("Entity,\n");
        addText( String.join(",\n"+ "\t".repeat(indentCounter), entityImports.get(genEntityName)[0])+ "\n");
        indent(false);
        addText("} from \"typeorm\"\n");

        // Imports Entities for relations
        for (String entityToImport : entityImports.get(genEntityName)[1]){
            addText("import { "  + entityToImport + "} from \"./" + entityToImport+ ".entity\"\n");

        }


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

        addText("\n");

        for (String entityToRelate : entityRelations.get(entityName).keySet()){
            String[] relConfig = entityRelations.get(entityName).get(entityToRelate);
            String configString  = "";
            if( relConfig[3] != null){
                configString += "onDelete :  \""  + relConfig[3] + "\" , ";
            }
            if (relConfig[4] != null){
                configString += "nullable : true";
            }
            addText("@"+ relConfig[0] + "((type) =>" + entityToRelate + ", {" + configString + "})\n" );
            addText("@JoinColumn({ name: \""   + relConfig[1] +   "\", referencedColumnName: \"" + relConfig[2] +"\" })\n");
            addText(entityToRelate.toLowerCase() + " : " + entityToRelate +"\n");
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
    public void generateDTO(String genDTOName)  {
        try{
            PrintWriter writer = new PrintWriter(new FileWriter("tsGen/dtos/" + genDTOName + ".dto.ts", true));
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
            entityRelations.put(entityName, new HashMap<>());
            entityImports.put(entityName, new HashSet[2]);
            entityImports.get(entityName)[0] = new HashSet<String>();
            entityImports.get(entityName)[1] = new HashSet<String>();
            entityValidations.put(entityName, new HashMap<>());

        }
        if(ctx.DTO() != null){
            addText( "export class "+ctx.getChild(0).getText()+ctx.getChild(2).getText()+ctx.getChild(1).getText()+" {\n");
            dtoName=ctx.getChild(0).getText();
        }
    }
    @Override public void enterDtoDef(MiLenguajeParser.DtoDefContext ctx) {
   dtoName2=ctx.NAME().getText();

    }

    @Override public void exitDtoDef(MiLenguajeParser.DtoDefContext ctx) {


    }

    @Override public void enterDtoOpc(MiLenguajeParser.DtoOpcContext ctx) {

        addText("@Expose()\n");
        if (ctx.getText().equals("strict")) {
            addText("@IsNotEmpty\n");
            HashMap<String, HashSet<String>> innerMap = entityValidations.get(dtoName);

            if (innerMap != null) {

                HashSet<String> innerSet = innerMap.get(dtoName2);

                if (innerSet != null) {

                    for (String value : innerSet) {
                        addText(value + "\n");
                    }
                }
            }

        }
        if (ctx.getText().equals("flexible")) {
            addText("@IsOptional\n");
            HashMap<String, HashSet<String>> innerMap = entityValidations.get(dtoName);

            if (innerMap != null) {

                HashSet<String> innerSet = innerMap.get(dtoName2);

                if (innerSet != null) {

                    for (String value : innerSet) {
                        addText(value + "\n");
                    }
                }
            }

        }
    }
    @Override public void enterDtoDefRecursion(MiLenguajeParser.DtoDefRecursionContext ctx) {
        ArrayList<String[]> innerList = entityDict.get(dtoName);
        for (int i = 0; i < innerList.size(); i++)
            if (innerList.get(i)[0].equals(dtoName2)) {
                if(innerList.get(i)[7].equals("string")){
                    addText("@IsString\n");
                }
                addText(dtoName2 + ": " + innerList.get(i)[7]+";\n");
            }
        if(ctx.dtoDef()!=null){
            addText("\n\n");
        }

    }
    @Override public void exitDtoOptions(MiLenguajeParser.DtoOptionsContext ctx) {

    }

    @Override public void exitDefinables(MiLenguajeParser.DefinablesContext ctx){

        if (ctx.ENTITY() != null){
            generateEntity(entityName);
            entityName = "";
        }
        if(ctx.DTO()!=null){
            addText("}");
            generateDTO(ctx.getChild(0).getText());
        }
    }

    @Override public void enterPropPairs(MiLenguajeParser.PropPairsContext ctx) {
        String key = ctx.getChild(0).getText();
        ArrayList<String[]> entityColumns =  entityDict.get(entityName);
        String[] propPairValues  = entityColumns.get(entityColumns.size()-1);
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


    @Override public void enterValidationPairs(MiLenguajeParser.ValidationPairsContext ctx) {
        if (MiLenguajeParser.ruleNames[ctx.getParent().getParent().getRuleIndex()].equals("propPairs")){
            entityValidations.get(entityName).get(columnName).add("@" + ctx.getChild(0) + "(" + (ctx.getChild(2)==null ? "" : ctx.getChild(2).getText())+") ");

        }else{
            addText("@" + ctx.getChild(0) + "(" + (ctx.getChild(2)==null ? "" : ctx.getChild(2).getText())+") \n");

        }



    }





    @Override public void enterPropDef(MiLenguajeParser.PropDefContext ctx) {
        columnName = ctx.NAME().getText();
        ArrayList<String[]> entityColumns =  entityDict.get(entityName);
        String[] propPairValues  = new String[8];
        entityColumns.add(propPairValues);
        Arrays.fill(propPairValues, "");
        propPairValues[0] = ctx.NAME().getText().toLowerCase();
        entityValidations.get(entityName).put(columnName, new HashSet<>());
        if (ctx.types() != null) {
            propPairValues[7] = ctx.types().getText();
        }

    }

    @Override public void enterPropDefRecursion(MiLenguajeParser.PropDefRecursionContext ctx) {
        String columnStringImport = "";
        ArrayList<String[]> entityColumns =  entityDict.get(entityName);
        String[] propPairValues  = entityColumns.get(entityColumns.size()-1);
        if (propPairValues[6].equals("true")){
            columnStringImport += "Primary";
        }
        if (propPairValues[4].equals("true")){
            columnStringImport += "Generated";
        }
        columnStringImport+= "Column";
        entityImports.get(entityName)[0].add(columnStringImport);
    }


    @Override public void enterRelDef(MiLenguajeParser.RelDefContext ctx) {
        relationName = ctx.NAME(0).getText();
        entityRelations.get(entityName).put(relationName, new String[5]);

        // Add Imports (Typeorm and related entity)
        entityImports.get(entityName)[0].add("JoinColumn");
        entityImports.get(entityName)[0].add(ctx.relationTypes().getText());
        entityImports.get(entityName)[1].add(relationName);

        // Add column name and related column name to relation array
        entityRelations.get(entityName).get(relationName)[0] = ctx.relationTypes().getText();
        entityRelations.get(entityName).get(relationName)[1] = ctx.NAME(1).getText();
        entityRelations.get(entityName).get(relationName)[2] = ctx.NAME(2).getText();

    }

    @Override public void enterRelPairs(MiLenguajeParser.RelPairsContext ctx) {
        String key = ctx.getChild(0).getText();
        String[] relPairValues = entityRelations.get(entityName).get(relationName);
        switch (key) {
            case "onDelete":
                relPairValues[3] = ctx.onDeleteTypes().getText().toUpperCase();
                break;
            case "nullable":
                relPairValues[4] = "true";
                break;
        }









    }




}


