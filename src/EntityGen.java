import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.io.FileWriter;

import java.util.*;

public class EntityGen extends MiLenguajeBaseListener {
    // Entities (k1 = entityName, <entityColumns>, [propertiesOfColumns]
    Map<String, ArrayList<String[]>> entityDict = new HashMap<String, ArrayList<String[]>>();

    Map<String, HashMap<String, String[]>>  entityRelations = new HashMap<>();

    // Generación de entidades
    Map <String, HashSet<String>[]> entityImports = new HashMap<>();

    //DTOs (k1 = entityName, k2 = columnName, v = set de validaciones)
    Map <String, HashMap<String, HashSet<String>>> entityValidations = new HashMap<String, HashMap<String, HashSet<String>>>();

    // DTOs (k1 = entityName, k2 = DTO name, k3 = DTO properties)
    Map <String, HashMap<String, ArrayList<String[]>>> entityDTOs = new HashMap<String, HashMap<String, ArrayList<String[]>>>();
    Map <String, HashMap<String, HashSet<String>>> DTOsImports = new HashMap<String, HashMap<String, HashSet<String>>>();

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

        // Imports
        /*addText("import {\n");
        indent(true);
        addText("Expose,\n");
        //addText( String.join(",\n"+ "\t".repeat(indentCounter), entityImports.get(genEntityName)[0])+ "\n");
        indent(false);
        addText("} from \" class-transformer \"\n");*/

        //

        addText("export class "+entityName+dtoName+"DTO {\n");
        indent(true);

        for (int a = 0; a < entityDTOs.get(entityName).get(dtoName).size(); a++) {
            String[] dtoProperties  = entityDTOs.get(entityName).get(dtoName).get(a);
            for (int i = 0; i < dtoProperties.length ; i++ ){
                String dtoProperty = dtoProperties[i];
            if (i == 0){
                addText("@Expose()\n");
                if (dtoProperty.equals("strict")) {
                    addText("@IsNotEmpty()\n");
                    HashMap<String, HashSet<String>> innerMap = entityValidations.get(entityName);
                    if (innerMap != null) {
                        HashSet<String> innerSet = innerMap.get(dtoName);
                        if (innerSet != null) {
                            for (String value : innerSet) {
                                addText(value + "\n");
                            }
                        }
                    }

                }
                if (dtoProperty.equals("flexible")) {
                    addText("@IsOptional()\n");
                    HashMap<String, HashSet<String>> innerMap = entityValidations.get(entityName);
                    if (innerMap != null) {
                        HashSet<String> innerSet = innerMap.get(dtoName);
                        if (innerSet != null) {
                            for (String value : innerSet) {
                                addText(value + "\n");
                            }
                        }
                    }

                }
            }
            else if (i == 2){
                addText("@Max("+dtoProperty+")\n");
            }else if (i == 3){
                addText("@Min("+dtoProperty+")\n");
            }else if (i == 11){
                for (String[] genPropPairValues:entityDict.get(entityName)){
                    if (genPropPairValues[0].equals(dtoProperty)){
                        switch (genPropPairValues[7]){
                            case "string":
                                addText("@IsString()\n");
                                break;
                            case "number":
                                addText("@IsNumber()\n");
                                break;
                            case "boolean":
                                addText("@IsBoolean()\n");
                                break;
                        }
                        addText(dtoProperty + " : " + genPropPairValues[7] + ";\n\n");
                    }

                }
                //addText( genPropPairValues[0] + " : " + genPropPairValues[7] + "\n");


            }else if (dtoProperty!=""){
                addText("@"+dtoProperty+"()\n");
            }
        }
        }
        indent(false);
        addText("}");

        try{
            File file = new File("tsGen/dtos/" + genDTOName + ".dto.ts");
            if (!file.exists()){
                //System.out.println("no existe");
                PrintWriter writer = new PrintWriter(new FileWriter("tsGen/dtos/" + genDTOName + ".dto.ts", true));
                writer.print("imports");
            }else{
                //System.out.println("existe");
            }
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
            //addText( "export class "+ctx.getChild(0).getText()+ctx.getChild(2).getText()+ctx.getChild(1).getText()+" {\n");
            entityName = ctx.NAME(0).getText();
            dtoName = ctx.NAME(1).getText();
            //dtoName = ctx.getChild(0).getText();
            // entityName : {}
            entityDTOs.put(entityName, new HashMap<>());
            entityDTOs.get(entityName).put(dtoName, new ArrayList<>());
            //entityDTOs.get(entityName).put(dtoName,new String[12]);

        }
    }
    @Override public void enterDtoDef(MiLenguajeParser.DtoDefContext ctx) {
        String dtoPropertyName = ctx.NAME().getText();
        entityDTOs.get(entityName).get(dtoName).add(new String[12]);
        String[] dtoProperties  = entityDTOs.get(entityName).get(dtoName).get(entityDTOs.get(entityName).get(dtoName).size() - 1);
        Arrays.fill(dtoProperties,"");
        dtoProperties[0] = ctx.dtoOpc().getText();
        dtoProperties[11] = dtoPropertyName;


    }

    @Override public void exitDefinables(MiLenguajeParser.DefinablesContext ctx){

        if (ctx.ENTITY() != null){
            generateEntity(entityName);
            CRUDGen newGen = new CRUDGen(entityName, entityDict.get(entityName), entityValidations.get(entityName));
            newGen.generate(Set.of(CRUDGen.SERVICE.CREATE, CRUDGen.SERVICE.READ, CRUDGen.SERVICE.UPDATE, CRUDGen.SERVICE.DELETE));
            entityName = "";

        }
        if(ctx.DTO()!=null){
            generateDTO(ctx.NAME(0).getText());
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
                propPairValues[5] ="true";
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
            String validation = ctx.getChild(0).getText();
            String[] dtoProperties  = entityDTOs.get(entityName).get(dtoName).get(entityDTOs.get(entityName).get(dtoName).size() - 1);

            String toAdd = "";
            int index = 1;

            switch (validation){
                case "IsEmail":
                    index = 1;

                    break;
                case "Max":
                    index = 2;
                    toAdd = ctx.INT().getText();
                    break;
                case "Min":
                    index = 3;
                    toAdd = ctx.INT().getText();
                    break;
                case "IsPositive":
                    index = 4;
                    break;
                case "IsNegative":
                    index = 5;
                    break;
                case "IsBooleanString":
                    index = 6;
                    break;
                case "IsDateString":
                    index = 7;
                    break;
                case "IsNumberString":
                    index = 8;
                    break;
                case "IsAlpha":
                    index = 9;
                    break;
                case "IsAlphanumeric":
                    index = 10;
                    break;
            }
            dtoProperties[index] = toAdd == "" ? validation : toAdd;

            //addText("@" + ctx.getChild(0) + "(" + (ctx.getChild(2)==null ? "" : ctx.getChild(2).getText())+") \n");


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


