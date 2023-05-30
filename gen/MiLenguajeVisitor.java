// Generated from C:/Users/danie/IdeaProjects/QuickTypes/grammar\MiLenguaje.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiLenguajeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiLenguajeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(MiLenguajeParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(MiLenguajeParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#definables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinables(MiLenguajeParser.DefinablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#entityDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityDef(MiLenguajeParser.EntityDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#generation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneration(MiLenguajeParser.GenerationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(MiLenguajeParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#qtobject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQtobject(MiLenguajeParser.QtobjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj(MiLenguajeParser.ObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(MiLenguajeParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#arr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr(MiLenguajeParser.ArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(MiLenguajeParser.ValueContext ctx);
}