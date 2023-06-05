import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CRUDGen {
    String entityName;
    ArrayList<String[]> entityDefinedDict;

    ArrayList<String[]> primaries;

    HashSet<String> nullables;

    HashSet<String> generated;

    HashSet<String> validationImport;

    String primaryUrl;
    String primaryParams;
    String primaryString;

    String primaryParsedParams;
    String entityFileName ;

    Map<String,String> templates  = Map.ofEntries(
            Map.entry("routesHeader", "import express from \"express\";\n" +
                    "\n" +
                    "import %1$sController from \"../controllers/%2$s.controller\";\n" +
                    "import { %1$sCreationDTO, %1$sUpdateDTO } from \"../dtos/%2$s.baseDto\";\n" +
                    "import dtoValidationMiddleware from \"../middlewares/dtoValidation.middleware\";\n" +
                    "\n" +
                    "const router = express.Router();"),
            Map.entry("createRoute", "router.post(\"/\", dtoValidationMiddleware(%1$sCreationDTO), %1$sController.create);"),
            Map.entry("readRoute", "router.get(\"%2$s\", %1$sController.get);"),
            Map.entry("updateRoute", "router.put(\"%2$s\", dtoValidationMiddleware(%1$sUpdateDTO), %1$sController.update);"),
            Map.entry("deleteRoute", "router.delete(\"%2$s\", %1$sController.delete);"),
            Map.entry("controllerHeader", "import { NextFunction, Request, Response } from \"express\";\n" +
                    "\n" +
                    "import %1$sFacade from \"../facades/%2$s.facade\";\n" +
                    "\n" +
                    "class %1$sController {"),
            Map.entry("createController", "async create(req: Request, res: Response, next: NextFunction): Promise<void> {\n" +
                    "\t\tres.json(await %1$sFacade.create(req.body)).status(200);\n" +
                    "\t}"),
            Map.entry("readController", "async get(req: Request, res: Response, next: NextFunction): Promise<void> {\n" +
                    "\t\tres\n" +
                    "\t\t\t.json(await %1$sFacade.get(%2$s))\n" +
                    "\t\t\t.status(200);\n" +
                    "\t}"),
            Map.entry("updateController", "async update(req: Request, res: Response, next: NextFunction): Promise<void> {\n" +
                    "\t\tres\n" +
                    "\t\t\t.json(await %1$sFacade.update(%2$s req.body))\n" +
                    "\t\t\t.status(200);\n" +
                    "\t}"),
            Map.entry("deleteController","async delete(req: Request, res: Response, next: NextFunction): Promise<void> {\n" +
                    "\t\tres\n" +
                    "\t\t\t.json(await %1$sFacade.delete(%2$s))\n" +
                    "\t\t\t.status(200);\n" +
                    "\t}"),
            Map.entry("facadeHeader",  "import { GenericResponse } from \"../dtos/genericResponse.dto\";\n" +
                    "import { %1$sCreationDTO, %1$sUpdateDTO } from \"../dtos/%2$s.baseDto\";\n" +
                    "import { %1$s } from \"../entities/%2$s.entity\";\n" +
                    "import %1$sService from \"../services/%2$s.service\";\n" +
                    "\n" +
                    "class %1$sFacade {"),
            Map.entry("createFacade", "async create(%1$sData: %1$sCreationDTO): Promise<GenericResponse<string>> {\n" +
                    "\t\tawait %1$sService.create(%1$sData);\n" +
                    "\t\treturn {\n" +
                    "\t\t\tdata: \"%1$s created\",\n" +
                    "\t\t};\n" +
                    "\t}"),
            Map.entry("readFacade", "async get(%2$s): Promise<GenericResponse<%1$s>> {\n" +
                    "\t\treturn {\n" +
                    "\t\t\tdata: await %1$sService.get({ %3$s }),\n" +
                    "\t\t};\n" +
                    "\t}" ),
            Map.entry("updateFacade", "async update(\n" +
                    "\t\t%2$s\n" +
                    "\t\t%1$sData: %1$sUpdateDTO,\n" +
                    "\t): Promise<GenericResponse<string>> {\n" +
                    "\t\tawait %1$sService.update({ %3$s }, %1$sData);\n" +
                    "\t\treturn {\n" +
                    "\t\t\tdata: \"%1$s updated\",\n" +
                    "\t\t};\n" +
                    "\t}" ),
            Map.entry("deleteFacade", "async delete(%2$s): Promise<GenericResponse<string>> {\n" +
                    "\t\tawait %1$sService.delete({ %3$s });\n" +
                    "\t\treturn {\n" +
                    "\t\t\tdata: \"%1$s deleted\",\n" +
                    "\t\t};\n" +
                    "\t}"),
            Map.entry("service", "import { %1$s } from \"../entities/%2$s.entity\";\n" +
                    "import BaseService from \"./base.service\";\n" +
                    "\n" +
                    "class %1$sService extends BaseService<%1$s> {\n" +
                    "\tconstructor() {\n" +
                    "\t\tsuper(%1$s);\n" +
                    "\t}\n" +
                    "\n" +
                    "\t// Here you can add additional methods for the %1$s Service\n" +
                    "}\n" +
                    "\n" +
                    "export default new %1$sService();")


    );

    FileWriter routesFile;
    FileWriter controllerFile;

    FileWriter dtoFile;

    FileWriter facadeFile;

    HashMap<String, HashSet<String>> validations;



    CRUDGen(String entityName, ArrayList<String[]> entityDefinedDict, HashMap<String, HashSet<String>> validations ){
        this.entityName = entityName;
        this.entityFileName = Character.toLowerCase(entityName.charAt(0)) + entityName.substring(1);
        this.entityDefinedDict = entityDefinedDict;
        this.primaryUrl = "";
        this.primaryParams="";
        this.primaryString ="";
        this.primaryParsedParams="";
        this.primaries = new ArrayList<>();
        this.nullables = new HashSet<>();
        this.generated = new HashSet<>();
        this.validations = validations;
        this.validationImport = new HashSet<>();
        for (String[] element : entityDefinedDict) {
            if (element[6].equals("true")) {
                this.primaries.add( new String[]{element[0], element[7]});
            }
            if (element[2].equals("true")){
                this.nullables.add(element[0]);
            }
            if (element[4].equals("true")){
                this.generated.add(element[0]);
            }
        }
        for (String[] element : primaries) {

            this.primaryUrl += "/:"+element[0];
            this.primaryParams += element[0] + " : "+ element[1] + ", ";
            switch (element[1]){
                case "string":
                    primaryParsedParams += "req.params." + element[0] ;
                    break;
                case "boolean":
                    primaryParsedParams += "req.params." + element[0] + "=== 'true'";
                    break;
                case "number":
                    primaryParsedParams += "parseInt(req.params."+ element[0] +  "), ";
                    break;

            }
            this.primaryString += element[0] + ", ";
        }

    }

    public enum SERVICE
    {
        CREATE, READ, UPDATE, DELETE
    }


    public static void copyFile( File from, File to ) throws IOException {
        Files.copy( from.toPath(), to.toPath(), StandardCopyOption.REPLACE_EXISTING  );
    }


    public void copyBaseFilesIntoGenFolder(){
        try{
            copyFile(new File("extraTSFiles/base.service.ts"), new File("tsGen/services/base.service.ts"));
            copyFile(new File("extraTSFiles/dtoValidation.middleware.ts"), new File("tsGen/middlewares/dtoValidation.middleware.ts"));
            copyFile(new File("extraTSFiles/genericResponse.dto.ts"), new File("tsGen/dtos/genericResponse.dto.ts"));

        }catch (Exception err){
            System.out.println("Error al copiar archivos base");

        }


    }

    public void generate(Set<SERVICE> services) {
        if (services.contains(SERVICE.CREATE)){
            if(!(entityDefinedDict.size() == Stream.concat(nullables.stream(), generated.stream())
                    .collect(Collectors.toSet()).size())){
                validationImport.add("IsNotEmpty");
            }
            if (!nullables.isEmpty()){
                validationImport.add("IsOptional");
            }
        }
        if (services.contains(SERVICE.UPDATE)){
            validationImport.add("IsOptional");
        }
        initFiles();

        if (services.contains(SERVICE.CREATE)){
            generateCreate();
        }
        if (services.contains(SERVICE.READ)){
            generateRead();
        }
        if (services.contains(SERVICE.UPDATE)){
            generateUpdate();
        }
        if (services.contains(SERVICE.DELETE)){
            generateDelete();
        }
        endFiles();


    }

    public void initFiles(){
        try {
            copyBaseFilesIntoGenFolder();

            //Init routeFile
            PrintWriter routeInit = new PrintWriter("tsGen/routes/" + entityFileName + ".routes.ts", "UTF-8");
            routeInit.println(String.format(templates.get("routesHeader"),entityName, entityFileName));
            routeInit.close();

            //Init controller file
            PrintWriter controllerInit = new PrintWriter("tsGen/controllers/" + entityFileName + ".controller.ts", "UTF-8");
            controllerInit.println(String.format(templates.get("controllerHeader"),entityName, entityFileName));
            controllerInit.close();
            //Init baseDto file
            PrintWriter baseDtoInit = new PrintWriter("tsGen/dtos/" + entityFileName + ".baseDto.ts", "UTF-8");
            baseDtoInit.println("import { Expose } from \"class-transformer\";");
            baseDtoInit.println("import {");
            Pattern p = Pattern.compile("@([A-Za-z]*)\\([^)]*\\)");

            for (String element : validations.keySet()){
                for (String validation : validations.get(element)){

                    Matcher m = p.matcher(validation);
                    if (m.find() && !generated.contains(element)){
                        validationImport.add(m.group(1));
                    }
                }
            }
            for (String validation : validationImport){
                baseDtoInit.println(validation + ",");
            }

            baseDtoInit.println("} from \"class-validator\";");

            baseDtoInit.close();

            //Init facade file
            PrintWriter facadeInit = new PrintWriter("tsGen/facades/" + entityFileName + ".facade.ts", "UTF-8");
            facadeInit.println(String.format(templates.get("facadeHeader"),entityName, entityFileName));
            facadeInit.close();

            //Create Service file
            PrintWriter serviceInit = new PrintWriter("tsGen/services/" + entityFileName + ".service.ts", "UTF-8");
            serviceInit.println(String.format(templates.get("service"),entityName, entityFileName));
            serviceInit.close();





            //Inicializa la variable del archivo
            this.routesFile  = new FileWriter("tsGen/routes/" + entityFileName + ".routes.ts", true);
            this.controllerFile  = new FileWriter("tsGen/controllers/" + entityFileName + ".controller.ts", true);
            this.dtoFile = new FileWriter("tsGen/dtos/" + entityFileName + ".baseDto.ts", true);
            this.facadeFile = new FileWriter("tsGen/facades/" + entityFileName + ".facade.ts", true);
        } catch (Exception err){
            System.out.println("The files couldn't be initialized: " +  err);

        }


    }

    public void endFiles(){
        try {
            PrintWriter routeEnd = new PrintWriter(routesFile);
            routeEnd.println("export default router;");
            routeEnd.close();
            PrintWriter controllerEnd = new PrintWriter(controllerFile);
            controllerEnd.println(String.format("}\n" +
                    "\n" +
                    "export default new %sController();",entityName));
            controllerEnd.close();

            PrintWriter facadeEnd= new PrintWriter(facadeFile);
            facadeEnd.println(String.format("}\n" +
                    "\n" +
                    "export default new %sFacade();",entityName));
            facadeEnd.close();
            routesFile.close();
            controllerFile.close();
            dtoFile.close();
            facadeFile.close();


        } catch (Exception err){
            System.out.println("The files couldn't be initialized: " +  err);

        }


    }

    private void generateDTO(SERVICE service){
        PrintWriter dtoWriter = new PrintWriter(dtoFile);
        switch (service){
            case CREATE:
                dtoWriter.println("export class "+ entityName + "CreationDTO {");
                for (String element : validations.keySet()){
                    if (generated.contains(element)){
                        continue;
                    }
                    if (nullables.contains(element)){
                        dtoWriter.println("\t@IsOptional()");
                    }
                    else{
                        dtoWriter.println("\t@IsNotEmpty()");
                    }
                    for (String validation : validations.get(element)){
                        dtoWriter.println("\t"+ validation);
                    }
                    for (String[] opts : entityDefinedDict){
                        if (element.equals(opts[0])){

                            dtoWriter.println("\t@Expose()" );
                            dtoWriter.println("\t"+ element + " : " + opts[7] + "\n");
                        }
                    }




                }

                break;
            case UPDATE:
                dtoWriter.println("export class "+ entityName + "UpdateDTO {");
                for (String element : validations.keySet()){

                    if (generated.contains(element)){
                        continue;
                    }


                    dtoWriter.println("\t@IsOptional()");
                    for (String validation : validations.get(element)){
                        dtoWriter.println("\t"+ validation);
                    }
                    for (String[] opts : entityDefinedDict){
                        if (element.equals(opts[0])){

                            dtoWriter.println("\t@Expose()" );
                            dtoWriter.println("\t"+ element + " : " + opts[7] + "\n");
                        }
                    }

                }

                break;

        }
        dtoWriter.println("}");

    }

    private void generateCreate() {

        generateRoute(SERVICE.CREATE);
        generateController(SERVICE.CREATE);
        generateDTO(SERVICE.CREATE);
        generateFacade(SERVICE.CREATE);


    }

    private void generateRead() {
        generateRoute(SERVICE.READ);
        generateController(SERVICE.READ);
        generateFacade(SERVICE.READ);

    }

    private void generateUpdate() {

        generateRoute( SERVICE.UPDATE);
        generateController(SERVICE.UPDATE);
        generateDTO(SERVICE.UPDATE);
        generateFacade(SERVICE.UPDATE);

    }

    private void generateDelete() {

        generateRoute(SERVICE.DELETE);
        generateController(SERVICE.DELETE);
        generateFacade(SERVICE.DELETE);

    }

    private void generateRoute( SERVICE service) {

        PrintWriter writer = new PrintWriter(routesFile);

        switch (service) {
            case CREATE:
                writer.println(String.format(templates.get("createRoute"), entityName));

                break;
            case READ:
                writer.println(String.format(templates.get("readRoute"), entityName, primaryUrl));
                break;
            case UPDATE:
                writer.println(String.format(templates.get("updateRoute"), entityName, primaryUrl));
                break;
            case DELETE:
                writer.println(String.format(templates.get("deleteRoute"), entityName, primaryUrl));
                break;

        }



    }

    private void generateController( SERVICE service) {

        PrintWriter writer = new PrintWriter(controllerFile);
        switch (service){
            case CREATE:
                writer.println(String.format(templates.get("createController"),entityName));
                break;
            case READ:
                writer.println(String.format(templates.get("readController"),entityName, primaryParsedParams));
                break;
            case UPDATE:
                writer.println(String.format(templates.get("updateController"),entityName, primaryParsedParams));
                break;

            case DELETE:
                writer.println(String.format(templates.get("deleteController"),entityName, primaryParsedParams));
                break;

        }

    }

    private void generateFacade( SERVICE service) {
        PrintWriter writer = new PrintWriter(facadeFile);



        switch (service) {
            case CREATE:
                writer.println(String.format(templates.get("createFacade"), entityName));
                break;
            case READ:
                writer.println(String.format(templates.get("readFacade"), entityName, primaryParams, primaryString));
                break;
            case UPDATE:
                writer.println(String.format(templates.get("updateFacade"), entityName, primaryParams, primaryString));
                break;
            case DELETE:
                writer.println(String.format(templates.get("deleteFacade"), entityName, primaryParams, primaryString));
                break;
        }

    }




}
