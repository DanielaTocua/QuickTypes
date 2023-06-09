import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.io.FileWriter;


import java.util.*;

public class EntityGen extends MiLenguajeBaseListener {
    // Entities (k1 = entityName, <entityColumns>, [propertiesOfColumns]
    Map<String, ArrayList<String[]>> entityDict = new HashMap<String, ArrayList<String[]>>();

    Map<String, HashMap<String, String[]>> entityRelations = new HashMap<>();

    // Generación de entidades
    Map<String, HashSet<String>[]> entityImports = new HashMap<>();

    //DTOs (k1 = entityName, k2 = columnName, v = set de validaciones)
    Map<String, HashMap<String, HashSet<String>>> entityValidations = new HashMap<String, HashMap<String, HashSet<String>>>();

    // DTOs (k1 = entityName, k2 = DTO name, k3 = DTO properties)
    Map<String, HashMap<String, ArrayList<String[]>>> entityDTOs = new HashMap<String, HashMap<String, ArrayList<String[]>>>();
    Map<String, HashSet<String>> DTOsImports = new HashMap<String, HashSet<String>>();

    String entityName;
    String dtoName;
    String dtoName2;
    String text = "";
    String columnName = "";
    String relationName;
    Integer indentCounter = 0;


    public void indent(Boolean add) {
        if (add) {
            indentCounter++;
        } else {
            indentCounter--;
        }
    }

    public void addText(String textToAdd) {
        text = text + "\t".repeat(indentCounter) + textToAdd;

    }

    public void enterGeneration(MiLenguajeParser.GenerationContext ctx) {
        if (ctx.ENTITY() != null){
            generateEntity(ctx.NAME(0).getText());
        }
        if (ctx.DTO() != null){
            generateDTO(ctx.NAME(0).getText(), ctx.NAME(1).getText());
        }

    }
    public void generateEntity(String genEntityName) {
        // Imports
        addText("import {\n");
        indent(true);
        addText("BaseEntity,\n");
        addText("Entity,\n");
        addText(String.join(",\n" + "\t".repeat(indentCounter), entityImports.get(genEntityName)[0]) + "\n");
        indent(false);
        addText("} from \"typeorm\"\n");

        // Imports Entities for relations

        for (String entityToImport : entityImports.get(genEntityName)[1]){
            if (entityDict.containsKey(entityToImport)) {
                addText("import { "  + entityToImport + "} from \"./" + Character.toLowerCase(entityToImport.charAt(0)) + entityToImport.substring(1)+ ".entity\"\n");
            }

        }

        // Entity Declaration
        addText("@Entity(\"" + genEntityName.toLowerCase() + "\")\n");
        addText("export class " + genEntityName + " extends BaseEntity {\n");
        indent(true);

        // Start of Entity Logic
        ArrayList<String[]> entityList = entityDict.get(genEntityName);
        for (int i = 0; i < entityList.size(); i++) {
            String columnString = "@";
            String[] genPropPairValues = entityList.get(i);
            if (genPropPairValues[6].equals("true")) {
                columnString += "Primary";
            }
            if (genPropPairValues[4].equals("true")) {
                columnString += "Generated";
            }
            columnString += "Column({";
            columnString+=((genPropPairValues[1].isBlank()) ? "" : "length : "+  genPropPairValues[1] + ","); ;
            columnString+=((genPropPairValues[2].isBlank()) ? "" : "nullable : true");
            columnString+=((genPropPairValues[3].isBlank()) ? "" : "default : " + genPropPairValues[3] + ",");
            columnString+=((genPropPairValues[5].isBlank()) ? "" : "unique : true");
            columnString+=("})\n");
            addText(columnString);
            addText(genPropPairValues[0] + " : " + genPropPairValues[7] + "\n");

        }

        addText("\n");

        for (String entityToRelate : entityRelations.get(genEntityName).keySet()) {
            String[] relConfig = entityRelations.get(genEntityName).get(entityToRelate);
            String configString = "";
            if (relConfig[3] != null) {
                configString += "onDelete :  \"" + relConfig[3] + "\" , ";
            }
            if (relConfig[4] != null) {
                configString += "nullable : true";
            }
            if (entityDict.containsKey(entityToRelate)){
                addText("@" + relConfig[0] + "((type) =>" + entityToRelate + ", {" + configString + "})\n");
                addText("@JoinColumn({ name: \"" + relConfig[1] + "\", referencedColumnName: \"" + relConfig[2] + "\" })\n");
                addText(entityToRelate.toLowerCase() + " : " + entityToRelate + "\n");
            }
        }

        // End of Entity Logic
        indent(false);
        addText("}\n");


        // File Creation
        try{
            PrintWriter writer = new PrintWriter("tsGen/entities/" +  Character.toLowerCase(genEntityName.charAt(0)) + genEntityName.substring(1)+ ".entity.ts", "UTF-8");
            writer.println(text);
            writer.close();
            // Resets used values
            text = "";
        } catch (Exception err) {
            System.out.println("File could not be created:  " + err);

        }

    }

    public void generateDTO(String genDTOName, String iterDtoName) {

        if (entityDict.containsKey(genDTOName)) {
            addText("export class " + genDTOName + iterDtoName + "DTO {\n");
            indent(true);

            for (int a = 0; a < entityDTOs.get(genDTOName).get(iterDtoName).size(); a++) {
                String[] dtoProperties = entityDTOs.get(genDTOName).get(iterDtoName).get(a);
                for (int i = 0; i < dtoProperties.length; i++) {
                    String dtoProperty = dtoProperties[i];
                    if (i == 0) {
                        addText("@Expose()\n");
                        if (dtoProperty.equals("strict")) {
                            addText("@IsNotEmpty()\n");
                            HashMap<String, HashSet<String>> innerMap = entityValidations.get(genDTOName);
                            if (innerMap != null) {
                                HashSet<String> innerSet = innerMap.get(iterDtoName);
                                if (innerSet != null) {
                                    for (String value : innerSet) {
                                        addText(value + "\n");
                                    }
                                }
                            }

                        }
                        if (dtoProperty.equals("flexible")) {
                            addText("@IsOptional()\n");
                            HashMap<String, HashSet<String>> innerMap = entityValidations.get(genDTOName);
                            if (innerMap != null) {
                                HashSet<String> innerSet = innerMap.get(iterDtoName);
                                if (innerSet != null) {
                                    for (String value : innerSet) {
                                        addText(value + "\n");
                                    }
                                }
                            }

                        }
                    } else if (i == 2 && dtoProperty != "") {
                        addText("@Max(" + dtoProperty + ")\n");
                    } else if (i == 3 && dtoProperty != "") {
                        addText("@Min(" + dtoProperty + ")\n");
                    } else if (i == 11) {
                        for (String[] genPropPairValues : entityDict.get(genDTOName)) {
                            if (genPropPairValues[0].equals(dtoProperty)) {
                                switch (genPropPairValues[7]) {
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

                    } else if (dtoProperty != "") {
                        addText("@" + dtoProperty + "()\n");
                    }
                }
            }
            indent(false);
            addText("}");

        try {
            File file = new File("tsGen/dtos/" + genDTOName + ".dto.ts");
            FileWriter fileWriter = null;
            if (!file.exists()) {
                fileWriter = new FileWriter("tsGen/dtos/" + genDTOName + ".dto.ts", true);
                PrintWriter writer = new PrintWriter(fileWriter);

                // Imports
                writer.println("import {");
                writer.println("\tExpose,");
                writer.println("} from \"class-transformer\"\n");

                writer.println("import {");
                Object[] classValidatorimportsArray = DTOsImports.get(genDTOName).toArray();
                for (int i = 0; i < classValidatorimportsArray.length; i++) {
                    writer.println("\t" + classValidatorimportsArray[i] + ",");
                }
                writer.println("} from \"class-validator\"\n");
            }
            if (fileWriter == null) {
                fileWriter = new FileWriter("tsGen/dtos/" + genDTOName + ".dto.ts", true);
            }
            PrintWriter writer = new PrintWriter(fileWriter);
            writer.println(text);
            writer.close();
            // Resets used values
            text = "";
        } catch (Exception err) {
            System.out.println("File could not be created:  " + err);

        }}
    }

    @Override
    public void enterStart(MiLenguajeParser.StartContext ctx) {
        if (ctx.EOF() != null) {
            for (Map.Entry<String, HashMap<String, ArrayList<String[]>>> entry : entityDTOs.entrySet()) {
                String claveExterna = entry.getKey();
                HashMap<String, ArrayList<String[]>> mapaInterno = entry.getValue();
                // System.out.println("Clave Externa: " + claveExterna);
                for (Map.Entry<String, ArrayList<String[]>> innerEntry : mapaInterno.entrySet()) {
                    String claveInterna = innerEntry.getKey();
                    //generateDTO(claveExterna,claveInterna);
                }
            }
        } else if (ctx.definition() != null){
            if (ctx.definition().definables().dtoDef()!=null) {
            entityName = ctx.definition().definables().NAME(0).getText();
                if (!entityDTOs.containsKey(entityName)){
                    entityDTOs.put(entityName, new HashMap<>());
                    DTOsImports.put(entityName, new HashSet<>());
                }
            }
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
            entityName = ctx.NAME(0).getText();
            dtoName = ctx.NAME(1).getText();
            // entityName : {}
            entityDTOs.get(entityName).put(dtoName, new ArrayList<>());
        }
    }
    @Override public void enterDtoDef(MiLenguajeParser.DtoDefContext ctx) {
        String dtoPropertyName = ctx.NAME().getText();
        entityDTOs.get(entityName).get(dtoName).add(new String[12]);
        String[] dtoProperties  = entityDTOs.get(entityName).get(dtoName).get(entityDTOs.get(entityName).get(dtoName).size() - 1);
        Arrays.fill(dtoProperties,"");
        dtoProperties[0] = ctx.dtoOpc().getText();

        if (dtoProperties[0].equals("strict")){
            DTOsImports.get(entityName).add("IsNotEmpty");
        } else if (dtoProperties[0].equals("flexible")) {
            DTOsImports.get(entityName).add("IsOptional");
        }

        dtoProperties[11] = dtoPropertyName;
        for (String[] genPropPairValues : entityDict.get(entityName)){
            if (genPropPairValues[0].equals(dtoPropertyName)) {
                switch (genPropPairValues[7]) {
                    case "string":
                        DTOsImports.get(entityName).add("IsString");
                        break;
                    case "number":
                        DTOsImports.get(entityName).add("IsNumber");
                        break;
                    case "boolean":
                        DTOsImports.get(entityName).add("IsBoolean");
                        break;
                }
            }
        }
    }


    @Override public void exitDefinables(MiLenguajeParser.DefinablesContext ctx){

        if (ctx.ENTITY() != null){
            //generateEntity(entityName);
            CRUDGen newGen = new CRUDGen(entityName, entityDict.get(entityName), entityValidations.get(entityName));
            newGen.generate(Set.of(CRUDGen.SERVICE.CREATE, CRUDGen.SERVICE.READ, CRUDGen.SERVICE.UPDATE, CRUDGen.SERVICE.DELETE));
            entityName = "";

        }
    }

    @Override public void enterPropPairs(MiLenguajeParser.PropPairsContext ctx) {
        String key = ctx.getChild(0).getText();
        ArrayList<String[]> entityColumns =  entityDict.get(entityName);
        String[] propPairValues  = entityColumns.get(entityColumns.size()-1);
        switch (key) {
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
            DTOsImports.get(entityName).add(validation);
        }
    }

    @Override public void enterPropDef(MiLenguajeParser.PropDefContext ctx) {
        columnName = ctx.NAME().getText();
        ArrayList<String[]> entityColumns =  entityDict.get(entityName);
        String[] propPairValues  = new String[8];
        entityColumns.add(propPairValues);
        Arrays.fill(propPairValues, "");
        propPairValues[0] = ctx.NAME().getText().toLowerCase();
        propPairValues[7] = ctx.types().getText();
        entityValidations.get(entityName).put(columnName, new HashSet<>());
        switch ( ctx.types().getText()){
            case "string":
                entityValidations.get(entityName).get(columnName).add("@IsString()");
                break;
            case "number":
                entityValidations.get(entityName).get(columnName).add("@IsNumber()");
                break;
            case "boolean":
                entityValidations.get(entityName).get(columnName).add("@IsBoolean()");
                break;
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


