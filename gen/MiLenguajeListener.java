// Generated from C:/Users/danie/IdeaProjects/QuickTypes/grammar\MiLenguaje.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiLenguajeParser}.
 */
public interface MiLenguajeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(MiLenguajeParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(MiLenguajeParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(MiLenguajeParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(MiLenguajeParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#definables}.
	 * @param ctx the parse tree
	 */
	void enterDefinables(MiLenguajeParser.DefinablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#definables}.
	 * @param ctx the parse tree
	 */
	void exitDefinables(MiLenguajeParser.DefinablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#entityDef}.
	 * @param ctx the parse tree
	 */
	void enterEntityDef(MiLenguajeParser.EntityDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#entityDef}.
	 * @param ctx the parse tree
	 */
	void exitEntityDef(MiLenguajeParser.EntityDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#generation}.
	 * @param ctx the parse tree
	 */
	void enterGeneration(MiLenguajeParser.GenerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#generation}.
	 * @param ctx the parse tree
	 */
	void exitGeneration(MiLenguajeParser.GenerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(MiLenguajeParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(MiLenguajeParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#qtobject}.
	 * @param ctx the parse tree
	 */
	void enterQtobject(MiLenguajeParser.QtobjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#qtobject}.
	 * @param ctx the parse tree
	 */
	void exitQtobject(MiLenguajeParser.QtobjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#obj}.
	 * @param ctx the parse tree
	 */
	void enterObj(MiLenguajeParser.ObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#obj}.
	 * @param ctx the parse tree
	 */
	void exitObj(MiLenguajeParser.ObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(MiLenguajeParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(MiLenguajeParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#arr}.
	 * @param ctx the parse tree
	 */
	void enterArr(MiLenguajeParser.ArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#arr}.
	 * @param ctx the parse tree
	 */
	void exitArr(MiLenguajeParser.ArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MiLenguajeParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MiLenguajeParser.ValueContext ctx);
}