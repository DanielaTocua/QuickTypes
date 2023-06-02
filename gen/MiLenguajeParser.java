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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, NEW=43, ENTITY=44, DTO=45, PROPERTIES=46, 
		RELATIONS=47, BOOLEAN=48, STRING=49, INT=50, NUMBER=51, NAME=52, WS=53;
	public static final int
		RULE_start = 0, RULE_definition = 1, RULE_definables = 2, RULE_dtoDef = 3, 
		RULE_dtoOpc = 4, RULE_entityDef = 5, RULE_relDef = 6, RULE_relObj = 7, 
		RULE_relPairs = 8, RULE_onDeleteTypes = 9, RULE_relationTypes = 10, RULE_propDef = 11, 
		RULE_propDefRecursion = 12, RULE_propObj = 13, RULE_propPairs = 14, RULE_validationObj = 15, 
		RULE_validationPairs = 16, RULE_types = 17, RULE_obj = 18, RULE_pair = 19, 
		RULE_arr = 20, RULE_value = 21, RULE_basicValues = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "definition", "definables", "dtoDef", "dtoOpc", "entityDef", 
			"relDef", "relObj", "relPairs", "onDeleteTypes", "relationTypes", "propDef", 
			"propDefRecursion", "propObj", "propPairs", "validationObj", "validationPairs", 
			"types", "obj", "pair", "arr", "value", "basicValues"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'for'", "'base'", "':'", "'strict'", "'flexible'", 
			"'none'", "','", "'relation'", "'onDelete'", "'nullable'", "'restrict'", 
			"'cascade'", "'setNull'", "'OneToOne'", "'OneToMany'", "'ManyToOne'", 
			"'ManyToMany'", "'type'", "'length'", "'default'", "'generated'", "'unique'", 
			"'validate'", "'primary'", "'IsEmail'", "'Max'", "'Min'", "'IsPositive'", 
			"'IsNegative'", "'IsBooleanString'", "'IsDateString'", "'IsNumberString'", 
			"'IsAlpha'", "'IsAlphanumeric'", "'number'", "'string'", "'boolean'", 
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
			null, null, null, null, null, null, null, "NEW", "ENTITY", "DTO", "PROPERTIES", 
			"RELATIONS", "BOOLEAN", "STRING", "INT", "NUMBER", "NAME", "WS"
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
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
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
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				definition();
				setState(47);
				start();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(EOF);
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
			setState(52);
			match(NEW);
			setState(53);
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
		public List<TerminalNode> NAME() { return getTokens(MiLenguajeParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(MiLenguajeParser.NAME, i);
		}
		public EntityDefContext entityDef() {
			return getRuleContext(EntityDefContext.class,0);
		}
		public TerminalNode DTO() { return getToken(MiLenguajeParser.DTO, 0); }
		public DtoDefContext dtoDef() {
			return getRuleContext(DtoDefContext.class,0);
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
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTITY:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(ENTITY);
				setState(56);
				match(NAME);
				setState(57);
				match(T__0);
				setState(58);
				entityDef();
				setState(59);
				match(T__1);
				}
				break;
			case DTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(DTO);
				setState(62);
				match(T__2);
				setState(63);
				match(NAME);
				setState(64);
				match(NAME);
				setState(65);
				match(T__0);
				setState(66);
				dtoDef();
				setState(67);
				match(T__1);
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
	public static class DtoDefContext extends ParserRuleContext {
		public DtoOpcContext dtoOpc() {
			return getRuleContext(DtoOpcContext.class,0);
		}
		public DtoDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtoDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDtoDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDtoDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDtoDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtoDefContext dtoDef() throws RecognitionException {
		DtoDefContext _localctx = new DtoDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dtoDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__3);
			setState(72);
			match(T__4);
			setState(73);
			dtoOpc();
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
	public static class DtoOpcContext extends ParserRuleContext {
		public DtoOpcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtoOpc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDtoOpc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDtoOpc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDtoOpc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtoOpcContext dtoOpc() throws RecognitionException {
		DtoOpcContext _localctx = new DtoOpcContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dtoOpc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0)) ) {
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
		enterRule(_localctx, 10, RULE_entityDef);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(PROPERTIES);
				setState(78);
				match(T__0);
				setState(79);
				propDef();
				setState(80);
				match(T__1);
				setState(81);
				match(RELATIONS);
				setState(82);
				relDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(PROPERTIES);
				setState(85);
				match(T__0);
				setState(86);
				propDef();
				setState(87);
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
		enterRule(_localctx, 12, RULE_relDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__0);
			setState(92);
			match(NAME);
			setState(93);
			match(T__4);
			setState(94);
			relObj();
			setState(95);
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
		enterRule(_localctx, 14, RULE_relObj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__0);
			setState(98);
			relPairs();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(99);
				match(T__8);
				setState(100);
				relPairs();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
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
		enterRule(_localctx, 16, RULE_relPairs);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(T__9);
				setState(109);
				match(T__4);
				setState(110);
				relationTypes();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(T__10);
				setState(112);
				match(T__4);
				setState(113);
				onDeleteTypes();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(T__11);
				setState(115);
				match(T__4);
				setState(116);
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
		enterRule(_localctx, 18, RULE_onDeleteTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) ) {
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
		enterRule(_localctx, 20, RULE_relationTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 983040L) != 0)) ) {
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
		enterRule(_localctx, 22, RULE_propDef);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(NAME);
				setState(124);
				match(T__4);
				setState(125);
				types();
				setState(126);
				propDefRecursion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(NAME);
				setState(129);
				match(T__4);
				setState(130);
				propObj();
				setState(131);
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
		enterRule(_localctx, 24, RULE_propDefRecursion);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(T__8);
				setState(136);
				propDef();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
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
		enterRule(_localctx, 26, RULE_propObj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__0);
			setState(141);
			propPairs();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(142);
				match(T__8);
				setState(143);
				propPairs();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
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
		public TerminalNode INT() { return getToken(MiLenguajeParser.INT, 0); }
		public BasicValuesContext basicValues() {
			return getRuleContext(BasicValuesContext.class,0);
		}
		public ValidationObjContext validationObj() {
			return getRuleContext(ValidationObjContext.class,0);
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
		enterRule(_localctx, 28, RULE_propPairs);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(T__19);
				setState(152);
				match(T__4);
				setState(153);
				types();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(T__20);
				setState(155);
				match(T__4);
				setState(156);
				match(INT);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(T__11);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				match(T__21);
				setState(159);
				match(T__4);
				setState(160);
				basicValues();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				match(T__22);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 6);
				{
				setState(162);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 7);
				{
				setState(163);
				match(T__24);
				setState(164);
				match(T__4);
				setState(165);
				validationObj();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 8);
				{
				setState(166);
				match(T__25);
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
		enterRule(_localctx, 30, RULE_validationObj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__0);
			setState(170);
			validationPairs();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(171);
				match(T__8);
				setState(172);
				validationPairs();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
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
		enterRule(_localctx, 32, RULE_validationPairs);
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(T__27);
				setState(182);
				match(T__4);
				setState(183);
				match(INT);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				match(T__28);
				setState(185);
				match(T__4);
				setState(186);
				match(INT);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 5);
				{
				setState(188);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 6);
				{
				setState(189);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 7);
				{
				setState(190);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 8);
				{
				setState(191);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 9);
				{
				setState(192);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 10);
				{
				setState(193);
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
		enterRule(_localctx, 34, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 962072674304L) != 0)) ) {
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
		enterRule(_localctx, 36, RULE_obj);
		int _la;
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(T__0);
				setState(199);
				pair();
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(200);
					match(T__8);
					setState(201);
					pair();
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(207);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(T__0);
				setState(210);
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
		enterRule(_localctx, 38, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(NAME);
			setState(214);
			match(T__4);
			setState(215);
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
		enterRule(_localctx, 40, RULE_arr);
		int _la;
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(T__39);
				setState(218);
				value();
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(219);
					match(T__8);
					setState(220);
					value();
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(226);
				match(T__40);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(T__39);
				setState(229);
				match(T__40);
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
		enterRule(_localctx, 42, RULE_value);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case STRING:
			case INT:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				basicValues();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				obj();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				arr();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				match(T__41);
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
		enterRule(_localctx, 44, RULE_basicValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4222124650659840L) != 0)) ) {
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
		"\u0004\u00015\u00f1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u00003\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002F\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005Z\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007f\b\u0007\n\u0007\f\u0007"+
		"i\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bv\b\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0086\b\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u008b\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0005\r\u0091\b\r\n\r\f\r\u0094\t\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00a8\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00ae\b\u000f"+
		"\n\u000f\f\u000f\u00b1\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00c3\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00cb\b\u0012\n\u0012\f\u0012"+
		"\u00ce\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00d4\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00de\b\u0014\n\u0014"+
		"\f\u0014\u00e1\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u00e7\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u00ed\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0000\u0000"+
		"\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,\u0000\u0005\u0001\u0000\u0006\b\u0001\u0000"+
		"\r\u000f\u0001\u0000\u0010\u0013\u0001\u0000%\'\u0001\u000003\u00fa\u0000"+
		"2\u0001\u0000\u0000\u0000\u00024\u0001\u0000\u0000\u0000\u0004E\u0001"+
		"\u0000\u0000\u0000\u0006G\u0001\u0000\u0000\u0000\bK\u0001\u0000\u0000"+
		"\u0000\nY\u0001\u0000\u0000\u0000\f[\u0001\u0000\u0000\u0000\u000ea\u0001"+
		"\u0000\u0000\u0000\u0010u\u0001\u0000\u0000\u0000\u0012w\u0001\u0000\u0000"+
		"\u0000\u0014y\u0001\u0000\u0000\u0000\u0016\u0085\u0001\u0000\u0000\u0000"+
		"\u0018\u008a\u0001\u0000\u0000\u0000\u001a\u008c\u0001\u0000\u0000\u0000"+
		"\u001c\u00a7\u0001\u0000\u0000\u0000\u001e\u00a9\u0001\u0000\u0000\u0000"+
		" \u00c2\u0001\u0000\u0000\u0000\"\u00c4\u0001\u0000\u0000\u0000$\u00d3"+
		"\u0001\u0000\u0000\u0000&\u00d5\u0001\u0000\u0000\u0000(\u00e6\u0001\u0000"+
		"\u0000\u0000*\u00ec\u0001\u0000\u0000\u0000,\u00ee\u0001\u0000\u0000\u0000"+
		"./\u0003\u0002\u0001\u0000/0\u0003\u0000\u0000\u000003\u0001\u0000\u0000"+
		"\u000013\u0005\u0000\u0000\u00012.\u0001\u0000\u0000\u000021\u0001\u0000"+
		"\u0000\u00003\u0001\u0001\u0000\u0000\u000045\u0005+\u0000\u000056\u0003"+
		"\u0004\u0002\u00006\u0003\u0001\u0000\u0000\u000078\u0005,\u0000\u0000"+
		"89\u00054\u0000\u00009:\u0005\u0001\u0000\u0000:;\u0003\n\u0005\u0000"+
		";<\u0005\u0002\u0000\u0000<F\u0001\u0000\u0000\u0000=>\u0005-\u0000\u0000"+
		">?\u0005\u0003\u0000\u0000?@\u00054\u0000\u0000@A\u00054\u0000\u0000A"+
		"B\u0005\u0001\u0000\u0000BC\u0003\u0006\u0003\u0000CD\u0005\u0002\u0000"+
		"\u0000DF\u0001\u0000\u0000\u0000E7\u0001\u0000\u0000\u0000E=\u0001\u0000"+
		"\u0000\u0000F\u0005\u0001\u0000\u0000\u0000GH\u0005\u0004\u0000\u0000"+
		"HI\u0005\u0005\u0000\u0000IJ\u0003\b\u0004\u0000J\u0007\u0001\u0000\u0000"+
		"\u0000KL\u0007\u0000\u0000\u0000L\t\u0001\u0000\u0000\u0000MN\u0005.\u0000"+
		"\u0000NO\u0005\u0001\u0000\u0000OP\u0003\u0016\u000b\u0000PQ\u0005\u0002"+
		"\u0000\u0000QR\u0005/\u0000\u0000RS\u0003\f\u0006\u0000SZ\u0001\u0000"+
		"\u0000\u0000TU\u0005.\u0000\u0000UV\u0005\u0001\u0000\u0000VW\u0003\u0016"+
		"\u000b\u0000WX\u0005\u0002\u0000\u0000XZ\u0001\u0000\u0000\u0000YM\u0001"+
		"\u0000\u0000\u0000YT\u0001\u0000\u0000\u0000Z\u000b\u0001\u0000\u0000"+
		"\u0000[\\\u0005\u0001\u0000\u0000\\]\u00054\u0000\u0000]^\u0005\u0005"+
		"\u0000\u0000^_\u0003\u000e\u0007\u0000_`\u0005\u0002\u0000\u0000`\r\u0001"+
		"\u0000\u0000\u0000ab\u0005\u0001\u0000\u0000bg\u0003\u0010\b\u0000cd\u0005"+
		"\t\u0000\u0000df\u0003\u0010\b\u0000ec\u0001\u0000\u0000\u0000fi\u0001"+
		"\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000"+
		"hj\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u0005\u0002\u0000"+
		"\u0000k\u000f\u0001\u0000\u0000\u0000lm\u0005\n\u0000\u0000mn\u0005\u0005"+
		"\u0000\u0000nv\u0003\u0014\n\u0000op\u0005\u000b\u0000\u0000pq\u0005\u0005"+
		"\u0000\u0000qv\u0003\u0012\t\u0000rs\u0005\f\u0000\u0000st\u0005\u0005"+
		"\u0000\u0000tv\u00050\u0000\u0000ul\u0001\u0000\u0000\u0000uo\u0001\u0000"+
		"\u0000\u0000ur\u0001\u0000\u0000\u0000v\u0011\u0001\u0000\u0000\u0000"+
		"wx\u0007\u0001\u0000\u0000x\u0013\u0001\u0000\u0000\u0000yz\u0007\u0002"+
		"\u0000\u0000z\u0015\u0001\u0000\u0000\u0000{|\u00054\u0000\u0000|}\u0005"+
		"\u0005\u0000\u0000}~\u0003\"\u0011\u0000~\u007f\u0003\u0018\f\u0000\u007f"+
		"\u0086\u0001\u0000\u0000\u0000\u0080\u0081\u00054\u0000\u0000\u0081\u0082"+
		"\u0005\u0005\u0000\u0000\u0082\u0083\u0003\u001a\r\u0000\u0083\u0084\u0003"+
		"\u0018\f\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085{\u0001\u0000"+
		"\u0000\u0000\u0085\u0080\u0001\u0000\u0000\u0000\u0086\u0017\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0005\t\u0000\u0000\u0088\u008b\u0003\u0016\u000b"+
		"\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0087\u0001\u0000\u0000"+
		"\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u0019\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005\u0001\u0000\u0000\u008d\u0092\u0003\u001c\u000e"+
		"\u0000\u008e\u008f\u0005\t\u0000\u0000\u008f\u0091\u0003\u001c\u000e\u0000"+
		"\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000"+
		"\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005\u0002\u0000\u0000\u0096\u001b\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0005\u0014\u0000\u0000\u0098\u0099\u0005\u0005\u0000\u0000"+
		"\u0099\u00a8\u0003\"\u0011\u0000\u009a\u009b\u0005\u0015\u0000\u0000\u009b"+
		"\u009c\u0005\u0005\u0000\u0000\u009c\u00a8\u00052\u0000\u0000\u009d\u00a8"+
		"\u0005\f\u0000\u0000\u009e\u009f\u0005\u0016\u0000\u0000\u009f\u00a0\u0005"+
		"\u0005\u0000\u0000\u00a0\u00a8\u0003,\u0016\u0000\u00a1\u00a8\u0005\u0017"+
		"\u0000\u0000\u00a2\u00a8\u0005\u0018\u0000\u0000\u00a3\u00a4\u0005\u0019"+
		"\u0000\u0000\u00a4\u00a5\u0005\u0005\u0000\u0000\u00a5\u00a8\u0003\u001e"+
		"\u000f\u0000\u00a6\u00a8\u0005\u001a\u0000\u0000\u00a7\u0097\u0001\u0000"+
		"\u0000\u0000\u00a7\u009a\u0001\u0000\u0000\u0000\u00a7\u009d\u0001\u0000"+
		"\u0000\u0000\u00a7\u009e\u0001\u0000\u0000\u0000\u00a7\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a2\u0001\u0000\u0000\u0000\u00a7\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u001d\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0005\u0001\u0000\u0000\u00aa\u00af\u0003 \u0010"+
		"\u0000\u00ab\u00ac\u0005\t\u0000\u0000\u00ac\u00ae\u0003 \u0010\u0000"+
		"\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000"+
		"\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0005\u0002\u0000\u0000\u00b3\u001f\u0001\u0000\u0000\u0000"+
		"\u00b4\u00c3\u0005\u001b\u0000\u0000\u00b5\u00b6\u0005\u001c\u0000\u0000"+
		"\u00b6\u00b7\u0005\u0005\u0000\u0000\u00b7\u00c3\u00052\u0000\u0000\u00b8"+
		"\u00b9\u0005\u001d\u0000\u0000\u00b9\u00ba\u0005\u0005\u0000\u0000\u00ba"+
		"\u00c3\u00052\u0000\u0000\u00bb\u00c3\u0005\u001e\u0000\u0000\u00bc\u00c3"+
		"\u0005\u001f\u0000\u0000\u00bd\u00c3\u0005 \u0000\u0000\u00be\u00c3\u0005"+
		"!\u0000\u0000\u00bf\u00c3\u0005\"\u0000\u0000\u00c0\u00c3\u0005#\u0000"+
		"\u0000\u00c1\u00c3\u0005$\u0000\u0000\u00c2\u00b4\u0001\u0000\u0000\u0000"+
		"\u00c2\u00b5\u0001\u0000\u0000\u0000\u00c2\u00b8\u0001\u0000\u0000\u0000"+
		"\u00c2\u00bb\u0001\u0000\u0000\u0000\u00c2\u00bc\u0001\u0000\u0000\u0000"+
		"\u00c2\u00bd\u0001\u0000\u0000\u0000\u00c2\u00be\u0001\u0000\u0000\u0000"+
		"\u00c2\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3!\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0007\u0003\u0000\u0000\u00c5#\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0005\u0001\u0000\u0000\u00c7\u00cc\u0003&\u0013\u0000\u00c8\u00c9\u0005"+
		"\t\u0000\u0000\u00c9\u00cb\u0003&\u0013\u0000\u00ca\u00c8\u0001\u0000"+
		"\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cf\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u0002"+
		"\u0000\u0000\u00d0\u00d4\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005\u0001"+
		"\u0000\u0000\u00d2\u00d4\u0005\u0002\u0000\u0000\u00d3\u00c6\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4%\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u00054\u0000\u0000\u00d6\u00d7\u0005\u0005\u0000\u0000"+
		"\u00d7\u00d8\u0003*\u0015\u0000\u00d8\'\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0005(\u0000\u0000\u00da\u00df\u0003*\u0015\u0000\u00db\u00dc\u0005"+
		"\t\u0000\u0000\u00dc\u00de\u0003*\u0015\u0000\u00dd\u00db\u0001\u0000"+
		"\u0000\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005)\u0000"+
		"\u0000\u00e3\u00e7\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005(\u0000\u0000"+
		"\u00e5\u00e7\u0005)\u0000\u0000\u00e6\u00d9\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e7)\u0001\u0000\u0000\u0000\u00e8\u00ed"+
		"\u0003,\u0016\u0000\u00e9\u00ed\u0003$\u0012\u0000\u00ea\u00ed\u0003("+
		"\u0014\u0000\u00eb\u00ed\u0005*\u0000\u0000\u00ec\u00e8\u0001\u0000\u0000"+
		"\u0000\u00ec\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed+\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u0007\u0004\u0000\u0000\u00ef-\u0001\u0000\u0000\u0000\u0010"+
		"2EYgu\u0085\u008a\u0092\u00a7\u00af\u00c2\u00cc\u00d3\u00df\u00e6\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}