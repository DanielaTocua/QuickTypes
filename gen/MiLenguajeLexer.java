// Generated from C:/Users/danie/IdeaProjects/QuickTypes/grammar\MiLenguaje.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiLenguajeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, NEW=12, ENTITY=13, DTO=14, PROPERTIES=15, RELATIONS=16, 
		STRING=17, NUMBER=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "NEW", "ENTITY", "DTO", "PROPERTIES", "RELATIONS", "STRING", 
			"ESC", "UNICODE", "HEX", "SAFECODEPOINT", "NUMBER", "INT", "EXP", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'Generate'", "'Migration'", "','", "':'", "'['", 
			"']'", "'true'", "'false'", "'null'", "'New'", "'Entity'", "'DTO'", "'properties'", 
			"'relations'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NEW", "ENTITY", "DTO", "PROPERTIES", "RELATIONS", "STRING", "NUMBER", 
			"WS"
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


	public MiLenguajeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiLenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0013\u00c8\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u008a\b\u0010\n\u0010\f\u0010\u008d\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0094"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0003"+
		"\u0015\u00a1\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0004\u0015\u00a6"+
		"\b\u0015\u000b\u0015\f\u0015\u00a7\u0003\u0015\u00aa\b\u0015\u0001\u0015"+
		"\u0003\u0015\u00ad\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u00b2\b\u0016\n\u0016\f\u0016\u00b5\t\u0016\u0003\u0016\u00b7\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u00bb\b\u0017\u0001\u0017\u0004\u0017"+
		"\u00be\b\u0017\u000b\u0017\f\u0017\u00bf\u0001\u0018\u0004\u0018\u00c3"+
		"\b\u0018\u000b\u0018\f\u0018\u00c4\u0001\u0018\u0001\u0018\u0000\u0000"+
		"\u0019\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0000%\u0000\'\u0000)\u0000+\u0012-\u0000"+
		"/\u00001\u0013\u0001\u0000\b\b\u0000\"\"//\\\\bbffnnrrtt\u0003\u00000"+
		"9AFaf\u0003\u0000\u0000\u001f\"\"\\\\\u0001\u000009\u0001\u000019\u0002"+
		"\u0000EEee\u0002\u0000++--\u0003\u0000\t\n\r\r  \u00cd\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00013"+
		"\u0001\u0000\u0000\u0000\u00035\u0001\u0000\u0000\u0000\u00057\u0001\u0000"+
		"\u0000\u0000\u0007@\u0001\u0000\u0000\u0000\tJ\u0001\u0000\u0000\u0000"+
		"\u000bL\u0001\u0000\u0000\u0000\rN\u0001\u0000\u0000\u0000\u000fP\u0001"+
		"\u0000\u0000\u0000\u0011R\u0001\u0000\u0000\u0000\u0013W\u0001\u0000\u0000"+
		"\u0000\u0015]\u0001\u0000\u0000\u0000\u0017b\u0001\u0000\u0000\u0000\u0019"+
		"f\u0001\u0000\u0000\u0000\u001bm\u0001\u0000\u0000\u0000\u001dq\u0001"+
		"\u0000\u0000\u0000\u001f|\u0001\u0000\u0000\u0000!\u0086\u0001\u0000\u0000"+
		"\u0000#\u0090\u0001\u0000\u0000\u0000%\u0095\u0001\u0000\u0000\u0000\'"+
		"\u009b\u0001\u0000\u0000\u0000)\u009d\u0001\u0000\u0000\u0000+\u00a0\u0001"+
		"\u0000\u0000\u0000-\u00b6\u0001\u0000\u0000\u0000/\u00b8\u0001\u0000\u0000"+
		"\u00001\u00c2\u0001\u0000\u0000\u000034\u0005{\u0000\u00004\u0002\u0001"+
		"\u0000\u0000\u000056\u0005}\u0000\u00006\u0004\u0001\u0000\u0000\u0000"+
		"78\u0005G\u0000\u000089\u0005e\u0000\u00009:\u0005n\u0000\u0000:;\u0005"+
		"e\u0000\u0000;<\u0005r\u0000\u0000<=\u0005a\u0000\u0000=>\u0005t\u0000"+
		"\u0000>?\u0005e\u0000\u0000?\u0006\u0001\u0000\u0000\u0000@A\u0005M\u0000"+
		"\u0000AB\u0005i\u0000\u0000BC\u0005g\u0000\u0000CD\u0005r\u0000\u0000"+
		"DE\u0005a\u0000\u0000EF\u0005t\u0000\u0000FG\u0005i\u0000\u0000GH\u0005"+
		"o\u0000\u0000HI\u0005n\u0000\u0000I\b\u0001\u0000\u0000\u0000JK\u0005"+
		",\u0000\u0000K\n\u0001\u0000\u0000\u0000LM\u0005:\u0000\u0000M\f\u0001"+
		"\u0000\u0000\u0000NO\u0005[\u0000\u0000O\u000e\u0001\u0000\u0000\u0000"+
		"PQ\u0005]\u0000\u0000Q\u0010\u0001\u0000\u0000\u0000RS\u0005t\u0000\u0000"+
		"ST\u0005r\u0000\u0000TU\u0005u\u0000\u0000UV\u0005e\u0000\u0000V\u0012"+
		"\u0001\u0000\u0000\u0000WX\u0005f\u0000\u0000XY\u0005a\u0000\u0000YZ\u0005"+
		"l\u0000\u0000Z[\u0005s\u0000\u0000[\\\u0005e\u0000\u0000\\\u0014\u0001"+
		"\u0000\u0000\u0000]^\u0005n\u0000\u0000^_\u0005u\u0000\u0000_`\u0005l"+
		"\u0000\u0000`a\u0005l\u0000\u0000a\u0016\u0001\u0000\u0000\u0000bc\u0005"+
		"N\u0000\u0000cd\u0005e\u0000\u0000de\u0005w\u0000\u0000e\u0018\u0001\u0000"+
		"\u0000\u0000fg\u0005E\u0000\u0000gh\u0005n\u0000\u0000hi\u0005t\u0000"+
		"\u0000ij\u0005i\u0000\u0000jk\u0005t\u0000\u0000kl\u0005y\u0000\u0000"+
		"l\u001a\u0001\u0000\u0000\u0000mn\u0005D\u0000\u0000no\u0005T\u0000\u0000"+
		"op\u0005O\u0000\u0000p\u001c\u0001\u0000\u0000\u0000qr\u0005p\u0000\u0000"+
		"rs\u0005r\u0000\u0000st\u0005o\u0000\u0000tu\u0005p\u0000\u0000uv\u0005"+
		"e\u0000\u0000vw\u0005r\u0000\u0000wx\u0005t\u0000\u0000xy\u0005i\u0000"+
		"\u0000yz\u0005e\u0000\u0000z{\u0005s\u0000\u0000{\u001e\u0001\u0000\u0000"+
		"\u0000|}\u0005r\u0000\u0000}~\u0005e\u0000\u0000~\u007f\u0005l\u0000\u0000"+
		"\u007f\u0080\u0005a\u0000\u0000\u0080\u0081\u0005t\u0000\u0000\u0081\u0082"+
		"\u0005i\u0000\u0000\u0082\u0083\u0005o\u0000\u0000\u0083\u0084\u0005n"+
		"\u0000\u0000\u0084\u0085\u0005s\u0000\u0000\u0085 \u0001\u0000\u0000\u0000"+
		"\u0086\u008b\u0005\"\u0000\u0000\u0087\u008a\u0003#\u0011\u0000\u0088"+
		"\u008a\u0003)\u0014\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u0088"+
		"\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008e"+
		"\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0005\"\u0000\u0000\u008f\"\u0001\u0000\u0000\u0000\u0090\u0093\u0005"+
		"\\\u0000\u0000\u0091\u0094\u0007\u0000\u0000\u0000\u0092\u0094\u0003%"+
		"\u0012\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0092\u0001\u0000"+
		"\u0000\u0000\u0094$\u0001\u0000\u0000\u0000\u0095\u0096\u0005u\u0000\u0000"+
		"\u0096\u0097\u0003\'\u0013\u0000\u0097\u0098\u0003\'\u0013\u0000\u0098"+
		"\u0099\u0003\'\u0013\u0000\u0099\u009a\u0003\'\u0013\u0000\u009a&\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0007\u0001\u0000\u0000\u009c(\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\b\u0002\u0000\u0000\u009e*\u0001\u0000\u0000"+
		"\u0000\u009f\u00a1\u0005-\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a9\u0003-\u0016\u0000\u00a3\u00a5\u0005.\u0000\u0000\u00a4\u00a6"+
		"\u0007\u0003\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ad\u0003/\u0017\u0000\u00ac\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad,\u0001\u0000"+
		"\u0000\u0000\u00ae\u00b7\u00050\u0000\u0000\u00af\u00b3\u0007\u0004\u0000"+
		"\u0000\u00b0\u00b2\u0007\u0003\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b6\u00af\u0001\u0000\u0000\u0000\u00b7.\u0001\u0000\u0000\u0000"+
		"\u00b8\u00ba\u0007\u0005\u0000\u0000\u00b9\u00bb\u0007\u0006\u0000\u0000"+
		"\u00ba\u00b9\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00be\u0007\u0003\u0000\u0000"+
		"\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000"+
		"\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c00\u0001\u0000\u0000\u0000\u00c1\u00c3\u0007\u0007\u0000\u0000\u00c2"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0006\u0018\u0000\u0000\u00c7"+
		"2\u0001\u0000\u0000\u0000\r\u0000\u0089\u008b\u0093\u00a0\u00a7\u00a9"+
		"\u00ac\u00b3\u00b6\u00ba\u00bf\u00c4\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}