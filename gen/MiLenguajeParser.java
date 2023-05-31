// Generated from C:/Users/danie/IdeaProjects/QuickTypes/grammar\MiLenguaje.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiLenguajeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, NEW=37, ENTITY=38, DTO=39, 
		PROPERTIES=40, RELATIONS=41, BOOLEAN=42, STRING=43, INT=44, NUMBER=45, 
		NAME=46, WS=47;
	public static final int
		RULE_start = 0, RULE_definition = 1, RULE_definables = 2, RULE_entityDef = 3, 
		RULE_relDef = 4, RULE_relObj = 5, RULE_relPairs = 6, RULE_onDeleteTypes = 7, 
		RULE_relationTypes = 8, RULE_propDef = 9, RULE_propDefRecursion = 10, 
		RULE_propObj = 11, RULE_propPairs = 12, RULE_validationObj = 13, RULE_validationPairs = 14, 
		RULE_types = 15, RULE_obj = 16, RULE_pair = 17, RULE_arr = 18, RULE_value = 19, 
		RULE_basicValues = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "definition", "definables", "entityDef", "relDef", "relObj", 
			"relPairs", "onDeleteTypes", "relationTypes", "propDef", "propDefRecursion", 
			"propObj", "propPairs", "validationObj", "validationPairs", "types", 
			"obj", "pair", "arr", "value", "basicValues"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "':'", "','", "'relation'", "'onDelete'", "'nullable'", 
			"'restrict'", "'cascade'", "'setNull'", "'OneToOne'", "'OneToMany'", 
			"'ManyToOne'", "'ManyToMany'", "'type'", "'validate'", "'length'", "'primary'", 
			"'default'", "'generated'", "'isEmail'", "'max'", "'min'", "'isPositive'", 
			"'isNegative'", "'isBooleanString'", "'isDateString'", "'isNumberString'", 
			"'isAlpha'", "'isAlphanumeric'", "'number'", "'string'", "'boolean'", 
			"'['", "']'", "'null'", "'New'", "'Entity'", "'DTO'", "'properties'", 
			"'relations'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "NEW", "ENTITY", "DTO", "PROPERTIES", "RELATIONS", "BOOLEAN", "STRING", 
			"INT", "NUMBER", "NAME", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MiLenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiLenguajeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiLenguajeParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			definition();
			setState(43);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(MiLenguajeParser.NEW, 0); }
		public DefinablesContext definables() {
			return getRuleContext(DefinablesContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(NEW);
			setState(46);
			definables();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinablesContext extends ParserRuleContext {
		public TerminalNode ENTITY() { return getToken(MiLenguajeParser.ENTITY, 0); }
		public TerminalNode NAME() { return getToken(MiLenguajeParser.NAME, 0); }
		public EntityDefContext entityDef() {
			return getRuleContext(EntityDefContext.class,0);
		}
		public DefinablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDefinables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDefinables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDefinables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinablesContext definables() throws RecognitionException {
		DefinablesContext _localctx = new DefinablesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(ENTITY);
			setState(49);
			match(NAME);
			setState(50);
			match(T__0);
			setState(51);
			entityDef();
			setState(52);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EntityDefContext extends ParserRuleContext {
		public TerminalNode PROPERTIES() { return getToken(MiLenguajeParser.PROPERTIES, 0); }
		public PropDefContext propDef() {
			return getRuleContext(PropDefContext.class,0);
		}
		public TerminalNode RELATIONS() { return getToken(MiLenguajeParser.RELATIONS, 0); }
		public RelDefContext relDef() {
			return getRuleContext(RelDefContext.class,0);
		}
		public EntityDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterEntityDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitEntityDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitEntityDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityDefContext entityDef() throws RecognitionException {
		EntityDefContext _localctx = new EntityDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_entityDef);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(PROPERTIES);
				setState(55);
				match(T__0);
				setState(56);
				propDef();
				setState(57);
				match(T__1);
				setState(58);
				match(RELATIONS);
				setState(59);
				relDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(PROPERTIES);
				setState(62);
				match(T__0);
				setState(63);
				propDef();
				setState(64);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelDefContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(MiLenguajeParser.NAME, 0); }
		public RelObjContext relObj() {
			return getRuleContext(RelObjContext.class,0);
		}
		public RelDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterRelDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitRelDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitRelDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelDefContext relDef() throws RecognitionException {
		RelDefContext _localctx = new RelDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_relDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__0);
			setState(69);
			match(NAME);
			setState(70);
			match(T__2);
			setState(71);
			relObj();
			setState(72);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelObjContext extends ParserRuleContext {
		public List<RelPairsContext> relPairs() {
			return getRuleContexts(RelPairsContext.class);
		}
		public RelPairsContext relPairs(int i) {
			return getRuleContext(RelPairsContext.class,i);
		}
		public RelObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relObj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterRelObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitRelObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitRelObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelObjContext relObj() throws RecognitionException {
		RelObjContext _localctx = new RelObjContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_relObj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__0);
			setState(75);
			relPairs();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(76);
				match(T__3);
				setState(77);
				relPairs();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelPairsContext extends ParserRuleContext {
		public RelationTypesContext relationTypes() {
			return getRuleContext(RelationTypesContext.class,0);
		}
		public OnDeleteTypesContext onDeleteTypes() {
			return getRuleContext(OnDeleteTypesContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(MiLenguajeParser.BOOLEAN, 0); }
		public RelPairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relPairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterRelPairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitRelPairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitRelPairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelPairsContext relPairs() throws RecognitionException {
		RelPairsContext _localctx = new RelPairsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_relPairs);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(T__4);
				setState(86);
				match(T__2);
				setState(87);
				relationTypes();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(T__5);
				setState(89);
				match(T__2);
				setState(90);
				onDeleteTypes();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(T__6);
				setState(92);
				match(T__2);
				setState(93);
				match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OnDeleteTypesContext extends ParserRuleContext {
		public OnDeleteTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onDeleteTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterOnDeleteTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitOnDeleteTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitOnDeleteTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnDeleteTypesContext onDeleteTypes() throws RecognitionException {
		OnDeleteTypesContext _localctx = new OnDeleteTypesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_onDeleteTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationTypesContext extends ParserRuleContext {
		public RelationTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterRelationTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitRelationTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitRelationTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationTypesContext relationTypes() throws RecognitionException {
		RelationTypesContext _localctx = new RelationTypesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_relationTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30720L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropDefContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(MiLenguajeParser.NAME, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public PropDefRecursionContext propDefRecursion() {
			return getRuleContext(PropDefRecursionContext.class,0);
		}
		public PropObjContext propObj() {
			return getRuleContext(PropObjContext.class,0);
		}
		public PropDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterPropDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitPropDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitPropDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropDefContext propDef() throws RecognitionException {
		PropDefContext _localctx = new PropDefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_propDef);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(NAME);
				setState(101);
				match(T__2);
				setState(102);
				types();
				setState(103);
				propDefRecursion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(NAME);
				setState(106);
				match(T__2);
				setState(107);
				propObj();
				setState(108);
				propDefRecursion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropDefRecursionContext extends ParserRuleContext {
		public PropDefContext propDef() {
			return getRuleContext(PropDefContext.class,0);
		}
		public TerminalNode NAME() { return getToken(MiLenguajeParser.NAME, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public PropObjContext propObj() {
			return getRuleContext(PropObjContext.class,0);
		}
		public PropDefRecursionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propDefRecursion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterPropDefRecursion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitPropDefRecursion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitPropDefRecursion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropDefRecursionContext propDefRecursion() throws RecognitionException {
		PropDefRecursionContext _localctx = new PropDefRecursionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_propDefRecursion);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(T__3);
				setState(113);
				propDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(NAME);
				setState(115);
				match(T__2);
				setState(116);
				types();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(NAME);
				setState(118);
				match(T__2);
				setState(119);
				propObj();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropObjContext extends ParserRuleContext {
		public List<PropPairsContext> propPairs() {
			return getRuleContexts(PropPairsContext.class);
		}
		public PropPairsContext propPairs(int i) {
			return getRuleContext(PropPairsContext.class,i);
		}
		public PropObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propObj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterPropObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitPropObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitPropObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropObjContext propObj() throws RecognitionException {
		PropObjContext _localctx = new PropObjContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_propObj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__0);
			setState(124);
			propPairs();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(125);
				match(T__3);
				setState(126);
				propPairs();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropPairsContext extends ParserRuleContext {
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public ValidationObjContext validationObj() {
			return getRuleContext(ValidationObjContext.class,0);
		}
		public TerminalNode INT() { return getToken(MiLenguajeParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(MiLenguajeParser.BOOLEAN, 0); }
		public BasicValuesContext basicValues() {
			return getRuleContext(BasicValuesContext.class,0);
		}
		public PropPairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propPairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterPropPairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitPropPairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitPropPairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropPairsContext propPairs() throws RecognitionException {
		PropPairsContext _localctx = new PropPairsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_propPairs);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(T__14);
				setState(135);
				match(T__2);
				setState(136);
				types();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(T__15);
				setState(138);
				match(T__2);
				setState(139);
				validationObj();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(T__16);
				setState(141);
				match(T__2);
				setState(142);
				match(INT);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				match(T__17);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				match(T__6);
				setState(145);
				match(T__2);
				setState(146);
				match(BOOLEAN);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 6);
				{
				setState(147);
				match(T__18);
				setState(148);
				match(T__2);
				setState(149);
				basicValues();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 7);
				{
				setState(150);
				match(T__19);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValidationObjContext extends ParserRuleContext {
		public List<ValidationPairsContext> validationPairs() {
			return getRuleContexts(ValidationPairsContext.class);
		}
		public ValidationPairsContext validationPairs(int i) {
			return getRuleContext(ValidationPairsContext.class,i);
		}
		public ValidationObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validationObj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterValidationObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitValidationObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitValidationObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValidationObjContext validationObj() throws RecognitionException {
		ValidationObjContext _localctx = new ValidationObjContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_validationObj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__0);
			setState(154);
			validationPairs();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(155);
				match(T__3);
				setState(156);
				validationPairs();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValidationPairsContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MiLenguajeParser.INT, 0); }
		public ValidationPairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validationPairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterValidationPairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitValidationPairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitValidationPairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValidationPairsContext validationPairs() throws RecognitionException {
		ValidationPairsContext _localctx = new ValidationPairsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_validationPairs);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(T__20);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(T__21);
				setState(166);
				match(T__2);
				setState(167);
				match(INT);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(T__22);
				setState(169);
				match(T__2);
				setState(170);
				match(INT);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				match(T__24);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				match(T__25);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 7);
				{
				setState(174);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 8);
				{
				setState(175);
				match(T__27);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 9);
				{
				setState(176);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 10);
				{
				setState(177);
				match(T__29);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypesContext extends ParserRuleContext {
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15032385536L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjContext extends ParserRuleContext {
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_obj);
		int _la;
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(T__0);
				setState(183);
				pair();
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(184);
					match(T__3);
					setState(185);
					pair();
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(191);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(T__0);
				setState(194);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PairContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(MiLenguajeParser.NAME, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(NAME);
			setState(198);
			match(T__2);
			setState(199);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrContext arr() throws RecognitionException {
		ArrContext _localctx = new ArrContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arr);
		int _la;
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(T__33);
				setState(202);
				value();
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(203);
					match(T__3);
					setState(204);
					value();
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(210);
				match(T__34);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(T__33);
				setState(213);
				match(T__34);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public BasicValuesContext basicValues() {
			return getRuleContext(BasicValuesContext.class,0);
		}
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_value);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case STRING:
			case INT:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				basicValues();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				obj();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				arr();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				match(T__35);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BasicValuesContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MiLenguajeParser.STRING, 0); }
		public TerminalNode INT() { return getToken(MiLenguajeParser.INT, 0); }
		public TerminalNode NUMBER() { return getToken(MiLenguajeParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(MiLenguajeParser.BOOLEAN, 0); }
		public BasicValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBasicValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBasicValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBasicValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicValuesContext basicValues() throws RecognitionException {
		BasicValuesContext _localctx = new BasicValuesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_basicValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 65970697666560L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001/\u00e1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003C\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005O\b\u0005"+
		"\n\u0005\f\u0005R\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006_\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\to\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\nz\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u0080\b\u000b\n\u000b\f\u000b\u0083\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u0098\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u009e\b\r\n\r\f\r\u00a1\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00b3\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u00bb\b\u0010\n\u0010\f\u0010\u00be"+
		"\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00c4"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00ce\b\u0012\n\u0012\f\u0012"+
		"\u00d1\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00d7\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u00dd\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0000\u0000\u0015\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(\u0000\u0004\u0001\u0000\b\n\u0001\u0000\u000b\u000e\u0001"+
		"\u0000\u001f!\u0001\u0000*-\u00eb\u0000*\u0001\u0000\u0000\u0000\u0002"+
		"-\u0001\u0000\u0000\u0000\u00040\u0001\u0000\u0000\u0000\u0006B\u0001"+
		"\u0000\u0000\u0000\bD\u0001\u0000\u0000\u0000\nJ\u0001\u0000\u0000\u0000"+
		"\f^\u0001\u0000\u0000\u0000\u000e`\u0001\u0000\u0000\u0000\u0010b\u0001"+
		"\u0000\u0000\u0000\u0012n\u0001\u0000\u0000\u0000\u0014y\u0001\u0000\u0000"+
		"\u0000\u0016{\u0001\u0000\u0000\u0000\u0018\u0097\u0001\u0000\u0000\u0000"+
		"\u001a\u0099\u0001\u0000\u0000\u0000\u001c\u00b2\u0001\u0000\u0000\u0000"+
		"\u001e\u00b4\u0001\u0000\u0000\u0000 \u00c3\u0001\u0000\u0000\u0000\""+
		"\u00c5\u0001\u0000\u0000\u0000$\u00d6\u0001\u0000\u0000\u0000&\u00dc\u0001"+
		"\u0000\u0000\u0000(\u00de\u0001\u0000\u0000\u0000*+\u0003\u0002\u0001"+
		"\u0000+,\u0005\u0000\u0000\u0001,\u0001\u0001\u0000\u0000\u0000-.\u0005"+
		"%\u0000\u0000./\u0003\u0004\u0002\u0000/\u0003\u0001\u0000\u0000\u0000"+
		"01\u0005&\u0000\u000012\u0005.\u0000\u000023\u0005\u0001\u0000\u00003"+
		"4\u0003\u0006\u0003\u000045\u0005\u0002\u0000\u00005\u0005\u0001\u0000"+
		"\u0000\u000067\u0005(\u0000\u000078\u0005\u0001\u0000\u000089\u0003\u0012"+
		"\t\u00009:\u0005\u0002\u0000\u0000:;\u0005)\u0000\u0000;<\u0003\b\u0004"+
		"\u0000<C\u0001\u0000\u0000\u0000=>\u0005(\u0000\u0000>?\u0005\u0001\u0000"+
		"\u0000?@\u0003\u0012\t\u0000@A\u0005\u0002\u0000\u0000AC\u0001\u0000\u0000"+
		"\u0000B6\u0001\u0000\u0000\u0000B=\u0001\u0000\u0000\u0000C\u0007\u0001"+
		"\u0000\u0000\u0000DE\u0005\u0001\u0000\u0000EF\u0005.\u0000\u0000FG\u0005"+
		"\u0003\u0000\u0000GH\u0003\n\u0005\u0000HI\u0005\u0002\u0000\u0000I\t"+
		"\u0001\u0000\u0000\u0000JK\u0005\u0001\u0000\u0000KP\u0003\f\u0006\u0000"+
		"LM\u0005\u0004\u0000\u0000MO\u0003\f\u0006\u0000NL\u0001\u0000\u0000\u0000"+
		"OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000ST\u0005\u0002"+
		"\u0000\u0000T\u000b\u0001\u0000\u0000\u0000UV\u0005\u0005\u0000\u0000"+
		"VW\u0005\u0003\u0000\u0000W_\u0003\u0010\b\u0000XY\u0005\u0006\u0000\u0000"+
		"YZ\u0005\u0003\u0000\u0000Z_\u0003\u000e\u0007\u0000[\\\u0005\u0007\u0000"+
		"\u0000\\]\u0005\u0003\u0000\u0000]_\u0005*\u0000\u0000^U\u0001\u0000\u0000"+
		"\u0000^X\u0001\u0000\u0000\u0000^[\u0001\u0000\u0000\u0000_\r\u0001\u0000"+
		"\u0000\u0000`a\u0007\u0000\u0000\u0000a\u000f\u0001\u0000\u0000\u0000"+
		"bc\u0007\u0001\u0000\u0000c\u0011\u0001\u0000\u0000\u0000de\u0005.\u0000"+
		"\u0000ef\u0005\u0003\u0000\u0000fg\u0003\u001e\u000f\u0000gh\u0003\u0014"+
		"\n\u0000ho\u0001\u0000\u0000\u0000ij\u0005.\u0000\u0000jk\u0005\u0003"+
		"\u0000\u0000kl\u0003\u0016\u000b\u0000lm\u0003\u0014\n\u0000mo\u0001\u0000"+
		"\u0000\u0000nd\u0001\u0000\u0000\u0000ni\u0001\u0000\u0000\u0000o\u0013"+
		"\u0001\u0000\u0000\u0000pq\u0005\u0004\u0000\u0000qz\u0003\u0012\t\u0000"+
		"rs\u0005.\u0000\u0000st\u0005\u0003\u0000\u0000tz\u0003\u001e\u000f\u0000"+
		"uv\u0005.\u0000\u0000vw\u0005\u0003\u0000\u0000wz\u0003\u0016\u000b\u0000"+
		"xz\u0001\u0000\u0000\u0000yp\u0001\u0000\u0000\u0000yr\u0001\u0000\u0000"+
		"\u0000yu\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z\u0015\u0001"+
		"\u0000\u0000\u0000{|\u0005\u0001\u0000\u0000|\u0081\u0003\u0018\f\u0000"+
		"}~\u0005\u0004\u0000\u0000~\u0080\u0003\u0018\f\u0000\u007f}\u0001\u0000"+
		"\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0084\u0001\u0000"+
		"\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0002"+
		"\u0000\u0000\u0085\u0017\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u000f"+
		"\u0000\u0000\u0087\u0088\u0005\u0003\u0000\u0000\u0088\u0098\u0003\u001e"+
		"\u000f\u0000\u0089\u008a\u0005\u0010\u0000\u0000\u008a\u008b\u0005\u0003"+
		"\u0000\u0000\u008b\u0098\u0003\u001a\r\u0000\u008c\u008d\u0005\u0011\u0000"+
		"\u0000\u008d\u008e\u0005\u0003\u0000\u0000\u008e\u0098\u0005,\u0000\u0000"+
		"\u008f\u0098\u0005\u0012\u0000\u0000\u0090\u0091\u0005\u0007\u0000\u0000"+
		"\u0091\u0092\u0005\u0003\u0000\u0000\u0092\u0098\u0005*\u0000\u0000\u0093"+
		"\u0094\u0005\u0013\u0000\u0000\u0094\u0095\u0005\u0003\u0000\u0000\u0095"+
		"\u0098\u0003(\u0014\u0000\u0096\u0098\u0005\u0014\u0000\u0000\u0097\u0086"+
		"\u0001\u0000\u0000\u0000\u0097\u0089\u0001\u0000\u0000\u0000\u0097\u008c"+
		"\u0001\u0000\u0000\u0000\u0097\u008f\u0001\u0000\u0000\u0000\u0097\u0090"+
		"\u0001\u0000\u0000\u0000\u0097\u0093\u0001\u0000\u0000\u0000\u0097\u0096"+
		"\u0001\u0000\u0000\u0000\u0098\u0019\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0005\u0001\u0000\u0000\u009a\u009f\u0003\u001c\u000e\u0000\u009b\u009c"+
		"\u0005\u0004\u0000\u0000\u009c\u009e\u0003\u001c\u000e\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0005\u0002\u0000\u0000\u00a3\u001b\u0001\u0000\u0000\u0000\u00a4\u00b3"+
		"\u0005\u0015\u0000\u0000\u00a5\u00a6\u0005\u0016\u0000\u0000\u00a6\u00a7"+
		"\u0005\u0003\u0000\u0000\u00a7\u00b3\u0005,\u0000\u0000\u00a8\u00a9\u0005"+
		"\u0017\u0000\u0000\u00a9\u00aa\u0005\u0003\u0000\u0000\u00aa\u00b3\u0005"+
		",\u0000\u0000\u00ab\u00b3\u0005\u0018\u0000\u0000\u00ac\u00b3\u0005\u0019"+
		"\u0000\u0000\u00ad\u00b3\u0005\u001a\u0000\u0000\u00ae\u00b3\u0005\u001b"+
		"\u0000\u0000\u00af\u00b3\u0005\u001c\u0000\u0000\u00b0\u00b3\u0005\u001d"+
		"\u0000\u0000\u00b1\u00b3\u0005\u001e\u0000\u0000\u00b2\u00a4\u0001\u0000"+
		"\u0000\u0000\u00b2\u00a5\u0001\u0000\u0000\u0000\u00b2\u00a8\u0001\u0000"+
		"\u0000\u0000\u00b2\u00ab\u0001\u0000\u0000\u0000\u00b2\u00ac\u0001\u0000"+
		"\u0000\u0000\u00b2\u00ad\u0001\u0000\u0000\u0000\u00b2\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b2\u00af\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u001d\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0007\u0002\u0000\u0000\u00b5\u001f\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0005\u0001\u0000\u0000\u00b7\u00bc\u0003\"\u0011"+
		"\u0000\u00b8\u00b9\u0005\u0004\u0000\u0000\u00b9\u00bb\u0003\"\u0011\u0000"+
		"\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000"+
		"\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0005\u0002\u0000\u0000\u00c0\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c2\u0005\u0001\u0000\u0000\u00c2\u00c4\u0005\u0002\u0000\u0000"+
		"\u00c3\u00b6\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c4!\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005.\u0000\u0000\u00c6\u00c7"+
		"\u0005\u0003\u0000\u0000\u00c7\u00c8\u0003&\u0013\u0000\u00c8#\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0005\"\u0000\u0000\u00ca\u00cf\u0003&\u0013"+
		"\u0000\u00cb\u00cc\u0005\u0004\u0000\u0000\u00cc\u00ce\u0003&\u0013\u0000"+
		"\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000"+
		"\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0005#\u0000\u0000\u00d3\u00d7\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0005\"\u0000\u0000\u00d5\u00d7\u0005#\u0000\u0000\u00d6\u00c9"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7%\u0001"+
		"\u0000\u0000\u0000\u00d8\u00dd\u0003(\u0014\u0000\u00d9\u00dd\u0003 \u0010"+
		"\u0000\u00da\u00dd\u0003$\u0012\u0000\u00db\u00dd\u0005$\u0000\u0000\u00dc"+
		"\u00d8\u0001\u0000\u0000\u0000\u00dc\u00d9\u0001\u0000\u0000\u0000\u00dc"+
		"\u00da\u0001\u0000\u0000\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dd"+
		"\'\u0001\u0000\u0000\u0000\u00de\u00df\u0007\u0003\u0000\u0000\u00df)"+
		"\u0001\u0000\u0000\u0000\u000eBP^ny\u0081\u0097\u009f\u00b2\u00bc\u00c3"+
		"\u00cf\u00d6\u00dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}