import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            // crear un analizador léxico a partir de la entrada (archivo  o consola)
            MiLenguajeLexer lexer;
            // Generar carpetas base
            Boolean a = new File("tsGen").mkdir();

            String carpetas[] = {"entities", "dtos"};
            for (int i = 0; i < carpetas.length; i++){
                File dir = new File("tsGen/" + carpetas[i]);
                dir.mkdir();
            }



            if (args.length>0) {
                lexer = new MiLenguajeLexer(CharStreams.fromFileName(args[0]));
                System.out.println("entered file");
            }
            else {
                lexer = new MiLenguajeLexer(CharStreams.fromStream(System.in));
            }
            // Identificar al analizador léxico como fuente de tokens para el sintactico
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // Crear el objeto del analizador sintáctico a partir del buffer de tokens
            MiLenguajeParser parser = new MiLenguajeParser(tokens);
            ParseTree tree = parser.start(); // Iniciar el analisis sintáctico en la regla inicial: start
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new EntityGen(), tree);
            System.out.println();
        } catch (Exception e){
            System.err.println("Error (Test): " + e);
        }
    }

}

