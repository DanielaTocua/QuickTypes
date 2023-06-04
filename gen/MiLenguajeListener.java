// Generated from C:/Users/Usuario/IdeaProjects/QuickTypes/grammar\MiLenguaje.g4 by ANTLR 4.12.0
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
	 * Enter a parse tree produced by {@link MiLenguajeParser#dtoDef}.
	 * @param ctx the parse tree
	 */
	void enterDtoDef(MiLenguajeParser.DtoDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#dtoDef}.
	 * @param ctx the parse tree
	 */
	void exitDtoDef(MiLenguajeParser.DtoDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#dtoDefRecursion}.
	 * @param ctx the parse tree
	 */
	void enterDtoDefRecursion(MiLenguajeParser.DtoDefRecursionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#dtoDefRecursion}.
	 * @param ctx the parse tree
	 */
	void exitDtoDefRecursion(MiLenguajeParser.DtoDefRecursionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#dtoOptions}.
	 * @param ctx the parse tree
	 */
	void enterDtoOptions(MiLenguajeParser.DtoOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#dtoOptions}.
	 * @param ctx the parse tree
	 */
	void exitDtoOptions(MiLenguajeParser.DtoOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#dtoOpc}.
	 * @param ctx the parse tree
	 */
	void enterDtoOpc(MiLenguajeParser.DtoOpcContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#dtoOpc}.
	 * @param ctx the parse tree
	 */
	void exitDtoOpc(MiLenguajeParser.DtoOpcContext ctx);
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
	 * Enter a parse tree produced by {@link MiLenguajeParser#relDef}.
	 * @param ctx the parse tree
	 */
	void enterRelDef(MiLenguajeParser.RelDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#relDef}.
	 * @param ctx the parse tree
	 */
	void exitRelDef(MiLenguajeParser.RelDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#relDefRecursion}.
	 * @param ctx the parse tree
	 */
	void enterRelDefRecursion(MiLenguajeParser.RelDefRecursionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#relDefRecursion}.
	 * @param ctx the parse tree
	 */
	void exitRelDefRecursion(MiLenguajeParser.RelDefRecursionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#relObj}.
	 * @param ctx the parse tree
	 */
	void enterRelObj(MiLenguajeParser.RelObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#relObj}.
	 * @param ctx the parse tree
	 */
	void exitRelObj(MiLenguajeParser.RelObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#relPairs}.
	 * @param ctx the parse tree
	 */
	void enterRelPairs(MiLenguajeParser.RelPairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#relPairs}.
	 * @param ctx the parse tree
	 */
	void exitRelPairs(MiLenguajeParser.RelPairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#onDeleteTypes}.
	 * @param ctx the parse tree
	 */
	void enterOnDeleteTypes(MiLenguajeParser.OnDeleteTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#onDeleteTypes}.
	 * @param ctx the parse tree
	 */
	void exitOnDeleteTypes(MiLenguajeParser.OnDeleteTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#relationTypes}.
	 * @param ctx the parse tree
	 */
	void enterRelationTypes(MiLenguajeParser.RelationTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#relationTypes}.
	 * @param ctx the parse tree
	 */
	void exitRelationTypes(MiLenguajeParser.RelationTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#propDef}.
	 * @param ctx the parse tree
	 */
	void enterPropDef(MiLenguajeParser.PropDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#propDef}.
	 * @param ctx the parse tree
	 */
	void exitPropDef(MiLenguajeParser.PropDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#propDefRecursion}.
	 * @param ctx the parse tree
	 */
	void enterPropDefRecursion(MiLenguajeParser.PropDefRecursionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#propDefRecursion}.
	 * @param ctx the parse tree
	 */
	void exitPropDefRecursion(MiLenguajeParser.PropDefRecursionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#propObj}.
	 * @param ctx the parse tree
	 */
	void enterPropObj(MiLenguajeParser.PropObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#propObj}.
	 * @param ctx the parse tree
	 */
	void exitPropObj(MiLenguajeParser.PropObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#propPairs}.
	 * @param ctx the parse tree
	 */
	void enterPropPairs(MiLenguajeParser.PropPairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#propPairs}.
	 * @param ctx the parse tree
	 */
	void exitPropPairs(MiLenguajeParser.PropPairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#validationObj}.
	 * @param ctx the parse tree
	 */
	void enterValidationObj(MiLenguajeParser.ValidationObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#validationObj}.
	 * @param ctx the parse tree
	 */
	void exitValidationObj(MiLenguajeParser.ValidationObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#validationPairs}.
	 * @param ctx the parse tree
	 */
	void enterValidationPairs(MiLenguajeParser.ValidationPairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#validationPairs}.
	 * @param ctx the parse tree
	 */
	void exitValidationPairs(MiLenguajeParser.ValidationPairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(MiLenguajeParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(MiLenguajeParser.TypesContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#basicValues}.
	 * @param ctx the parse tree
	 */
	void enterBasicValues(MiLenguajeParser.BasicValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#basicValues}.
	 * @param ctx the parse tree
	 */
	void exitBasicValues(MiLenguajeParser.BasicValuesContext ctx);
}