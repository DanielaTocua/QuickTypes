// Generated from C:/Users/junio/QuickTypes/grammar\MiLenguaje.g4 by ANTLR 4.12.0
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
	 * Visit a parse tree produced by {@link MiLenguajeParser#dtoDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtoDef(MiLenguajeParser.DtoDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#dtoDefRecursion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtoDefRecursion(MiLenguajeParser.DtoDefRecursionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#dtoOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtoOptions(MiLenguajeParser.DtoOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#dtoOpc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtoOpc(MiLenguajeParser.DtoOpcContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#entityDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityDef(MiLenguajeParser.EntityDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#relDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelDef(MiLenguajeParser.RelDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#relDefRecursion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelDefRecursion(MiLenguajeParser.RelDefRecursionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#relObj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelObj(MiLenguajeParser.RelObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#relPairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelPairs(MiLenguajeParser.RelPairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#onDeleteTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnDeleteTypes(MiLenguajeParser.OnDeleteTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#relationTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationTypes(MiLenguajeParser.RelationTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#propDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropDef(MiLenguajeParser.PropDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#propDefRecursion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropDefRecursion(MiLenguajeParser.PropDefRecursionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#propObj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropObj(MiLenguajeParser.PropObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#propPairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropPairs(MiLenguajeParser.PropPairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#validationObj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidationObj(MiLenguajeParser.ValidationObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#validationPairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidationPairs(MiLenguajeParser.ValidationPairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(MiLenguajeParser.TypesContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#basicValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicValues(MiLenguajeParser.BasicValuesContext ctx);
}