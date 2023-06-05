// Generated from C:/Users/Usuario/IdeaProjects/QuickTypes/grammar\MiLenguaje.g4 by ANTLR 4.12.0
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
		T__38=39, T__39=40, T__40=41, T__41=42, NEW=43, GENERATE=44, ENTITY=45, 
		DTO=46, PROPERTIES=47, RELATIONS=48, BOOLEAN=49, STRING=50, INT=51, NUMBER=52, 
		NAME=53, WS=54;
	public static final int
		RULE_start = 0, RULE_generation = 1, RULE_definition = 2, RULE_definables = 3, 
		RULE_dtoDef = 4, RULE_dtoDefRecursion = 5, RULE_dtoOptions = 6, RULE_dtoOpc = 7, 
		RULE_entityDef = 8, RULE_relDef = 9, RULE_relDefRecursion = 10, RULE_relObj = 11, 
		RULE_relPairs = 12, RULE_onDeleteTypes = 13, RULE_relationTypes = 14, 
		RULE_propDef = 15, RULE_propDefRecursion = 16, RULE_propObj = 17, RULE_propPairs = 18, 
		RULE_validationObj = 19, RULE_validationPairs = 20, RULE_types = 21, RULE_obj = 22, 
		RULE_pair = 23, RULE_arr = 24, RULE_value = 25, RULE_basicValues = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "generation", "definition", "definables", "dtoDef", "dtoDefRecursion", 
			"dtoOptions", "dtoOpc", "entityDef", "relDef", "relDefRecursion", "relObj", 
			"relPairs", "onDeleteTypes", "relationTypes", "propDef", "propDefRecursion", 
			"propObj", "propPairs", "validationObj", "validationPairs", "types", 
			"obj", "pair", "arr", "value", "basicValues"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "':'", "','", "'strict'", "'flexible'", "'none'", 
			"'('", "')'", "'onDelete'", "'nullable'", "'restrict'", "'cascade'", 
			"'setNull'", "'OneToOne'", "'OneToMany'", "'ManyToOne'", "'ManyToMany'", 
			"'length'", "'default'", "'generated'", "'unique'", "'validate'", "'primary'", 
			"'IsEmail'", "'Max'", "'Min'", "'IsPositive'", "'IsNegative'", "'IsBooleanString'", 
			"'IsDateString'", "'IsNumberString'", "'IsAlpha'", "'IsAlphanumeric'", 
			"'MinLength'", "'MaxLength'", "'number'", "'string'", "'boolean'", "'['", 
			"']'", "'null'", "'New'", "'Generate'", "'Entity'", "'DTO'", "'properties'", 
			"'relations'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "NEW", "GENERATE", "ENTITY", 
			"DTO", "PROPERTIES", "RELATIONS", "BOOLEAN", "STRING", "INT", "NUMBER", 
			"NAME", "WS"
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
		public GenerationContext generation() {
			return getRuleContext(GenerationContext.class,0);
		}
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
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
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GENERATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				generation();
				setState(55);
				start();
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				definition();
				setState(58);
				start();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
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
	public static class GenerationContext extends ParserRuleContext {
		public TerminalNode GENERATE() { return getToken(MiLenguajeParser.GENERATE, 0); }
		public TerminalNode ENTITY() { return getToken(MiLenguajeParser.ENTITY, 0); }
		public List<TerminalNode> NAME() { return getTokens(MiLenguajeParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(MiLenguajeParser.NAME, i);
		}
		public TerminalNode DTO() { return getToken(MiLenguajeParser.DTO, 0); }
		public GenerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterGeneration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitGeneration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitGeneration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenerationContext generation() throws RecognitionException {
		GenerationContext _localctx = new GenerationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_generation);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(GENERATE);
				setState(64);
				match(ENTITY);
				setState(65);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(GENERATE);
				setState(67);
				match(NAME);
				setState(68);
				match(DTO);
				setState(69);
				match(NAME);
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
		enterRule(_localctx, 4, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(NEW);
			setState(73);
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
		enterRule(_localctx, 6, RULE_definables);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTITY:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(ENTITY);
				setState(76);
				match(NAME);
				setState(77);
				match(T__0);
				setState(78);
				entityDef();
				setState(79);
				match(T__1);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(NAME);
				setState(82);
				match(DTO);
				setState(83);
				match(NAME);
				setState(84);
				match(T__0);
				setState(85);
				dtoDef();
				setState(86);
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
		public TerminalNode NAME() { return getToken(MiLenguajeParser.NAME, 0); }
		public DtoOptionsContext dtoOptions() {
			return getRuleContext(DtoOptionsContext.class,0);
		}
		public DtoDefRecursionContext dtoDefRecursion() {
			return getRuleContext(DtoDefRecursionContext.class,0);
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
		enterRule(_localctx, 8, RULE_dtoDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			dtoOpc();
			setState(91);
			match(NAME);
			setState(92);
			match(T__2);
			setState(93);
			dtoOptions();
			setState(94);
			dtoDefRecursion();
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
	public static class DtoDefRecursionContext extends ParserRuleContext {
		public DtoDefContext dtoDef() {
			return getRuleContext(DtoDefContext.class,0);
		}
		public DtoDefRecursionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtoDefRecursion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDtoDefRecursion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDtoDefRecursion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDtoDefRecursion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtoDefRecursionContext dtoDefRecursion() throws RecognitionException {
		DtoDefRecursionContext _localctx = new DtoDefRecursionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dtoDefRecursion);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(T__3);
				setState(97);
				dtoDef();
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
	public static class DtoOptionsContext extends ParserRuleContext {
		public List<ValidationPairsContext> validationPairs() {
			return getRuleContexts(ValidationPairsContext.class);
		}
		public ValidationPairsContext validationPairs(int i) {
			return getRuleContext(ValidationPairsContext.class,i);
		}
		public DtoOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtoOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDtoOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDtoOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDtoOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtoOptionsContext dtoOptions() throws RecognitionException {
		DtoOptionsContext _localctx = new DtoOptionsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dtoOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__0);
			setState(102);
			validationPairs();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(103);
				match(T__3);
				setState(104);
				validationPairs();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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
		enterRule(_localctx, 14, RULE_dtoOpc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) ) {
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
		enterRule(_localctx, 16, RULE_entityDef);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(PROPERTIES);
				setState(115);
				match(T__0);
				setState(116);
				propDef();
				setState(117);
				match(T__1);
				setState(118);
				match(RELATIONS);
				setState(119);
				match(T__0);
				setState(120);
				relDef();
				setState(121);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(PROPERTIES);
				setState(124);
				match(T__0);
				setState(125);
				propDef();
				setState(126);
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
		public RelationTypesContext relationTypes() {
			return getRuleContext(RelationTypesContext.class,0);
		}
		public List<TerminalNode> NAME() { return getTokens(MiLenguajeParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(MiLenguajeParser.NAME, i);
		}
		public RelObjContext relObj() {
			return getRuleContext(RelObjContext.class,0);
		}
		public RelDefRecursionContext relDefRecursion() {
			return getRuleContext(RelDefRecursionContext.class,0);
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
		enterRule(_localctx, 18, RULE_relDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			relationTypes();
			setState(131);
			match(NAME);
			setState(132);
			match(T__7);
			setState(133);
			match(NAME);
			setState(134);
			match(T__3);
			setState(135);
			match(NAME);
			setState(136);
			match(T__8);
			setState(137);
			match(T__2);
			setState(138);
			relObj();
			setState(139);
			relDefRecursion();
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
	public static class RelDefRecursionContext extends ParserRuleContext {
		public RelDefContext relDef() {
			return getRuleContext(RelDefContext.class,0);
		}
		public RelDefRecursionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relDefRecursion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterRelDefRecursion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitRelDefRecursion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitRelDefRecursion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelDefRecursionContext relDefRecursion() throws RecognitionException {
		RelDefRecursionContext _localctx = new RelDefRecursionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_relDefRecursion);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(T__3);
				setState(142);
				relDef();
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
		enterRule(_localctx, 22, RULE_relObj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__0);
			setState(147);
			relPairs();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(148);
				match(T__3);
				setState(149);
				relPairs();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
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
		public OnDeleteTypesContext onDeleteTypes() {
			return getRuleContext(OnDeleteTypesContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_relPairs);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(T__9);
				setState(158);
				match(T__2);
				setState(159);
				onDeleteTypes();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(T__10);
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
		enterRule(_localctx, 26, RULE_onDeleteTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) ) {
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
		enterRule(_localctx, 28, RULE_relationTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 491520L) != 0)) ) {
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
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode NAME() { return getToken(MiLenguajeParser.NAME, 0); }
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
		enterRule(_localctx, 30, RULE_propDef);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				types();
				setState(168);
				match(NAME);
				setState(169);
				propDefRecursion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				types();
				setState(172);
				match(NAME);
				setState(173);
				match(T__2);
				setState(174);
				propObj();
				setState(175);
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
		enterRule(_localctx, 32, RULE_propDefRecursion);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(T__3);
				setState(180);
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
		enterRule(_localctx, 34, RULE_propObj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__0);
			setState(185);
			propPairs();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(186);
				match(T__3);
				setState(187);
				propPairs();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
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
		enterRule(_localctx, 36, RULE_propPairs);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(T__18);
				setState(196);
				match(T__2);
				setState(197);
				match(INT);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(T__10);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				match(T__19);
				setState(200);
				match(T__2);
				setState(201);
				basicValues();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				match(T__20);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 6);
				{
				setState(204);
				match(T__22);
				setState(205);
				match(T__2);
				setState(206);
				validationObj();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 7);
				{
				setState(207);
				match(T__23);
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
		enterRule(_localctx, 38, RULE_validationObj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__0);
			setState(211);
			validationPairs();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(212);
				match(T__3);
				setState(213);
				validationPairs();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
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
		enterRule(_localctx, 40, RULE_validationPairs);
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(T__24);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(T__25);
				setState(223);
				match(T__2);
				setState(224);
				match(INT);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				match(T__26);
				setState(226);
				match(T__2);
				setState(227);
				match(INT);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				match(T__27);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 5);
				{
				setState(229);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 6);
				{
				setState(230);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 7);
				{
				setState(231);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 8);
				{
				setState(232);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 9);
				{
				setState(233);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 10);
				{
				setState(234);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 11);
				{
				setState(235);
				match(T__34);
				setState(236);
				match(T__2);
				setState(237);
				match(INT);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 12);
				{
				setState(238);
				match(T__35);
				setState(239);
				match(T__2);
				setState(240);
				match(INT);
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
		enterRule(_localctx, 42, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
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
		enterRule(_localctx, 44, RULE_obj);
		int _la;
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(T__0);
				setState(246);
				pair();
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(247);
					match(T__3);
					setState(248);
					pair();
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(254);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(T__0);
				setState(257);
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
		enterRule(_localctx, 46, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(NAME);
			setState(261);
			match(T__2);
			setState(262);
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
		enterRule(_localctx, 48, RULE_arr);
		int _la;
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(T__39);
				setState(265);
				value();
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(266);
					match(T__3);
					setState(267);
					value();
					}
					}
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(273);
				match(T__40);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(T__39);
				setState(276);
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
		enterRule(_localctx, 50, RULE_value);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case STRING:
			case INT:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				basicValues();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				obj();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				arr();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 4);
				{
				setState(282);
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
		enterRule(_localctx, 52, RULE_basicValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8444249301319680L) != 0)) ) {
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
		"\u0004\u00016\u0120\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		">\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001G\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003Y\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005d\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006j\b\u0006\n\u0006\f\u0006m\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u0081\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\n\u0091"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0097"+
		"\b\u000b\n\u000b\f\u000b\u009a\t\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u00a2\b\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00b2\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00b7\b"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00bd"+
		"\b\u0011\n\u0011\f\u0011\u00c0\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u00d1\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u00d7\b\u0013\n\u0013\f\u0013\u00da\t\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00f2\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00fa"+
		"\b\u0016\n\u0016\f\u0016\u00fd\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0103\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u010d\b\u0018\n\u0018\f\u0018\u0110\t\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u0116\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u011c\b\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0000\u0000\u001b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.024\u0000\u0005\u0001\u0000"+
		"\u0005\u0007\u0001\u0000\f\u000e\u0001\u0000\u000f\u0012\u0001\u0000%"+
		"\'\u0001\u000014\u012a\u0000=\u0001\u0000\u0000\u0000\u0002F\u0001\u0000"+
		"\u0000\u0000\u0004H\u0001\u0000\u0000\u0000\u0006X\u0001\u0000\u0000\u0000"+
		"\bZ\u0001\u0000\u0000\u0000\nc\u0001\u0000\u0000\u0000\fe\u0001\u0000"+
		"\u0000\u0000\u000ep\u0001\u0000\u0000\u0000\u0010\u0080\u0001\u0000\u0000"+
		"\u0000\u0012\u0082\u0001\u0000\u0000\u0000\u0014\u0090\u0001\u0000\u0000"+
		"\u0000\u0016\u0092\u0001\u0000\u0000\u0000\u0018\u00a1\u0001\u0000\u0000"+
		"\u0000\u001a\u00a3\u0001\u0000\u0000\u0000\u001c\u00a5\u0001\u0000\u0000"+
		"\u0000\u001e\u00b1\u0001\u0000\u0000\u0000 \u00b6\u0001\u0000\u0000\u0000"+
		"\"\u00b8\u0001\u0000\u0000\u0000$\u00d0\u0001\u0000\u0000\u0000&\u00d2"+
		"\u0001\u0000\u0000\u0000(\u00f1\u0001\u0000\u0000\u0000*\u00f3\u0001\u0000"+
		"\u0000\u0000,\u0102\u0001\u0000\u0000\u0000.\u0104\u0001\u0000\u0000\u0000"+
		"0\u0115\u0001\u0000\u0000\u00002\u011b\u0001\u0000\u0000\u00004\u011d"+
		"\u0001\u0000\u0000\u000067\u0003\u0002\u0001\u000078\u0003\u0000\u0000"+
		"\u00008>\u0001\u0000\u0000\u00009:\u0003\u0004\u0002\u0000:;\u0003\u0000"+
		"\u0000\u0000;>\u0001\u0000\u0000\u0000<>\u0005\u0000\u0000\u0001=6\u0001"+
		"\u0000\u0000\u0000=9\u0001\u0000\u0000\u0000=<\u0001\u0000\u0000\u0000"+
		">\u0001\u0001\u0000\u0000\u0000?@\u0005,\u0000\u0000@A\u0005-\u0000\u0000"+
		"AG\u00055\u0000\u0000BC\u0005,\u0000\u0000CD\u00055\u0000\u0000DE\u0005"+
		".\u0000\u0000EG\u00055\u0000\u0000F?\u0001\u0000\u0000\u0000FB\u0001\u0000"+
		"\u0000\u0000G\u0003\u0001\u0000\u0000\u0000HI\u0005+\u0000\u0000IJ\u0003"+
		"\u0006\u0003\u0000J\u0005\u0001\u0000\u0000\u0000KL\u0005-\u0000\u0000"+
		"LM\u00055\u0000\u0000MN\u0005\u0001\u0000\u0000NO\u0003\u0010\b\u0000"+
		"OP\u0005\u0002\u0000\u0000PY\u0001\u0000\u0000\u0000QR\u00055\u0000\u0000"+
		"RS\u0005.\u0000\u0000ST\u00055\u0000\u0000TU\u0005\u0001\u0000\u0000U"+
		"V\u0003\b\u0004\u0000VW\u0005\u0002\u0000\u0000WY\u0001\u0000\u0000\u0000"+
		"XK\u0001\u0000\u0000\u0000XQ\u0001\u0000\u0000\u0000Y\u0007\u0001\u0000"+
		"\u0000\u0000Z[\u0003\u000e\u0007\u0000[\\\u00055\u0000\u0000\\]\u0005"+
		"\u0003\u0000\u0000]^\u0003\f\u0006\u0000^_\u0003\n\u0005\u0000_\t\u0001"+
		"\u0000\u0000\u0000`a\u0005\u0004\u0000\u0000ad\u0003\b\u0004\u0000bd\u0001"+
		"\u0000\u0000\u0000c`\u0001\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000"+
		"d\u000b\u0001\u0000\u0000\u0000ef\u0005\u0001\u0000\u0000fk\u0003(\u0014"+
		"\u0000gh\u0005\u0004\u0000\u0000hj\u0003(\u0014\u0000ig\u0001\u0000\u0000"+
		"\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000no\u0005"+
		"\u0002\u0000\u0000o\r\u0001\u0000\u0000\u0000pq\u0007\u0000\u0000\u0000"+
		"q\u000f\u0001\u0000\u0000\u0000rs\u0005/\u0000\u0000st\u0005\u0001\u0000"+
		"\u0000tu\u0003\u001e\u000f\u0000uv\u0005\u0002\u0000\u0000vw\u00050\u0000"+
		"\u0000wx\u0005\u0001\u0000\u0000xy\u0003\u0012\t\u0000yz\u0005\u0002\u0000"+
		"\u0000z\u0081\u0001\u0000\u0000\u0000{|\u0005/\u0000\u0000|}\u0005\u0001"+
		"\u0000\u0000}~\u0003\u001e\u000f\u0000~\u007f\u0005\u0002\u0000\u0000"+
		"\u007f\u0081\u0001\u0000\u0000\u0000\u0080r\u0001\u0000\u0000\u0000\u0080"+
		"{\u0001\u0000\u0000\u0000\u0081\u0011\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0003\u001c\u000e\u0000\u0083\u0084\u00055\u0000\u0000\u0084\u0085\u0005"+
		"\b\u0000\u0000\u0085\u0086\u00055\u0000\u0000\u0086\u0087\u0005\u0004"+
		"\u0000\u0000\u0087\u0088\u00055\u0000\u0000\u0088\u0089\u0005\t\u0000"+
		"\u0000\u0089\u008a\u0005\u0003\u0000\u0000\u008a\u008b\u0003\u0016\u000b"+
		"\u0000\u008b\u008c\u0003\u0014\n\u0000\u008c\u0013\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0005\u0004\u0000\u0000\u008e\u0091\u0003\u0012\t\u0000\u008f"+
		"\u0091\u0001\u0000\u0000\u0000\u0090\u008d\u0001\u0000\u0000\u0000\u0090"+
		"\u008f\u0001\u0000\u0000\u0000\u0091\u0015\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0005\u0001\u0000\u0000\u0093\u0098\u0003\u0018\f\u0000\u0094\u0095"+
		"\u0005\u0004\u0000\u0000\u0095\u0097\u0003\u0018\f\u0000\u0096\u0094\u0001"+
		"\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009b\u0001"+
		"\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		"\u0002\u0000\u0000\u009c\u0017\u0001\u0000\u0000\u0000\u009d\u009e\u0005"+
		"\n\u0000\u0000\u009e\u009f\u0005\u0003\u0000\u0000\u009f\u00a2\u0003\u001a"+
		"\r\u0000\u00a0\u00a2\u0005\u000b\u0000\u0000\u00a1\u009d\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u0019\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0007\u0001\u0000\u0000\u00a4\u001b\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0007\u0002\u0000\u0000\u00a6\u001d\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0003*\u0015\u0000\u00a8\u00a9\u00055\u0000\u0000\u00a9"+
		"\u00aa\u0003 \u0010\u0000\u00aa\u00b2\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0003*\u0015\u0000\u00ac\u00ad\u00055\u0000\u0000\u00ad\u00ae\u0005\u0003"+
		"\u0000\u0000\u00ae\u00af\u0003\"\u0011\u0000\u00af\u00b0\u0003 \u0010"+
		"\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00a7\u0001\u0000\u0000"+
		"\u0000\u00b1\u00ab\u0001\u0000\u0000\u0000\u00b2\u001f\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0005\u0004\u0000\u0000\u00b4\u00b7\u0003\u001e\u000f"+
		"\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7!\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0005\u0001\u0000\u0000\u00b9\u00be\u0003$\u0012\u0000\u00ba"+
		"\u00bb\u0005\u0004\u0000\u0000\u00bb\u00bd\u0003$\u0012\u0000\u00bc\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0005\u0002\u0000\u0000\u00c2#\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005"+
		"\u0013\u0000\u0000\u00c4\u00c5\u0005\u0003\u0000\u0000\u00c5\u00d1\u0005"+
		"3\u0000\u0000\u00c6\u00d1\u0005\u000b\u0000\u0000\u00c7\u00c8\u0005\u0014"+
		"\u0000\u0000\u00c8\u00c9\u0005\u0003\u0000\u0000\u00c9\u00d1\u00034\u001a"+
		"\u0000\u00ca\u00d1\u0005\u0015\u0000\u0000\u00cb\u00d1\u0005\u0016\u0000"+
		"\u0000\u00cc\u00cd\u0005\u0017\u0000\u0000\u00cd\u00ce\u0005\u0003\u0000"+
		"\u0000\u00ce\u00d1\u0003&\u0013\u0000\u00cf\u00d1\u0005\u0018\u0000\u0000"+
		"\u00d0\u00c3\u0001\u0000\u0000\u0000\u00d0\u00c6\u0001\u0000\u0000\u0000"+
		"\u00d0\u00c7\u0001\u0000\u0000\u0000\u00d0\u00ca\u0001\u0000\u0000\u0000"+
		"\u00d0\u00cb\u0001\u0000\u0000\u0000\u00d0\u00cc\u0001\u0000\u0000\u0000"+
		"\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1%\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0005\u0001\u0000\u0000\u00d3\u00d8\u0003(\u0014\u0000\u00d4\u00d5"+
		"\u0005\u0004\u0000\u0000\u00d5\u00d7\u0003(\u0014\u0000\u00d6\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00db\u0001"+
		"\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00dc\u0005"+
		"\u0002\u0000\u0000\u00dc\'\u0001\u0000\u0000\u0000\u00dd\u00f2\u0005\u0019"+
		"\u0000\u0000\u00de\u00df\u0005\u001a\u0000\u0000\u00df\u00e0\u0005\u0003"+
		"\u0000\u0000\u00e0\u00f2\u00053\u0000\u0000\u00e1\u00e2\u0005\u001b\u0000"+
		"\u0000\u00e2\u00e3\u0005\u0003\u0000\u0000\u00e3\u00f2\u00053\u0000\u0000"+
		"\u00e4\u00f2\u0005\u001c\u0000\u0000\u00e5\u00f2\u0005\u001d\u0000\u0000"+
		"\u00e6\u00f2\u0005\u001e\u0000\u0000\u00e7\u00f2\u0005\u001f\u0000\u0000"+
		"\u00e8\u00f2\u0005 \u0000\u0000\u00e9\u00f2\u0005!\u0000\u0000\u00ea\u00f2"+
		"\u0005\"\u0000\u0000\u00eb\u00ec\u0005#\u0000\u0000\u00ec\u00ed\u0005"+
		"\u0003\u0000\u0000\u00ed\u00f2\u00053\u0000\u0000\u00ee\u00ef\u0005$\u0000"+
		"\u0000\u00ef\u00f0\u0005\u0003\u0000\u0000\u00f0\u00f2\u00053\u0000\u0000"+
		"\u00f1\u00dd\u0001\u0000\u0000\u0000\u00f1\u00de\u0001\u0000\u0000\u0000"+
		"\u00f1\u00e1\u0001\u0000\u0000\u0000\u00f1\u00e4\u0001\u0000\u0000\u0000"+
		"\u00f1\u00e5\u0001\u0000\u0000\u0000\u00f1\u00e6\u0001\u0000\u0000\u0000"+
		"\u00f1\u00e7\u0001\u0000\u0000\u0000\u00f1\u00e8\u0001\u0000\u0000\u0000"+
		"\u00f1\u00e9\u0001\u0000\u0000\u0000\u00f1\u00ea\u0001\u0000\u0000\u0000"+
		"\u00f1\u00eb\u0001\u0000\u0000\u0000\u00f1\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f2)\u0001\u0000\u0000\u0000\u00f3\u00f4\u0007\u0003\u0000\u0000\u00f4"+
		"+\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005\u0001\u0000\u0000\u00f6\u00fb"+
		"\u0003.\u0017\u0000\u00f7\u00f8\u0005\u0004\u0000\u0000\u00f8\u00fa\u0003"+
		".\u0017\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0005\u0002\u0000\u0000\u00ff\u0103\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u0005\u0001\u0000\u0000\u0101\u0103\u0005\u0002"+
		"\u0000\u0000\u0102\u00f5\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000"+
		"\u0000\u0000\u0103-\u0001\u0000\u0000\u0000\u0104\u0105\u00055\u0000\u0000"+
		"\u0105\u0106\u0005\u0003\u0000\u0000\u0106\u0107\u00032\u0019\u0000\u0107"+
		"/\u0001\u0000\u0000\u0000\u0108\u0109\u0005(\u0000\u0000\u0109\u010e\u0003"+
		"2\u0019\u0000\u010a\u010b\u0005\u0004\u0000\u0000\u010b\u010d\u00032\u0019"+
		"\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u0110\u0001\u0000\u0000"+
		"\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000"+
		"\u0000\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0005)\u0000\u0000\u0112\u0116\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0005(\u0000\u0000\u0114\u0116\u0005)\u0000\u0000\u0115\u0108"+
		"\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u01161\u0001"+
		"\u0000\u0000\u0000\u0117\u011c\u00034\u001a\u0000\u0118\u011c\u0003,\u0016"+
		"\u0000\u0119\u011c\u00030\u0018\u0000\u011a\u011c\u0005*\u0000\u0000\u011b"+
		"\u0117\u0001\u0000\u0000\u0000\u011b\u0118\u0001\u0000\u0000\u0000\u011b"+
		"\u0119\u0001\u0000\u0000\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011c"+
		"3\u0001\u0000\u0000\u0000\u011d\u011e\u0007\u0004\u0000\u0000\u011e5\u0001"+
		"\u0000\u0000\u0000\u0014=FXck\u0080\u0090\u0098\u00a1\u00b1\u00b6\u00be"+
		"\u00d0\u00d8\u00f1\u00fb\u0102\u010e\u0115\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}