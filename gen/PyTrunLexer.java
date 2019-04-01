// Generated from C:\Users\Zirke\Documents\JavaProjects\CFG\src\PyTrunLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PyTrunLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTDCL=1, FLOATDCL=2, TRUTHDCL=3, TEXTDCL=4, ARRDCL=5, LPAR=6, RPAR=7, 
		TIMES=8, DIVIDES=9, PLUS=10, MINUS=11, AND=12, OR=13, NOT=14, TRUTHID=15, 
		EQUALS=16, GRTHAN=17, LESSTHAN=18, IF=19, ELSE=20, WHILE=21, DO=22, FROM=23, 
		REPEAT=24, UNTIL=25, THEN=26, UPTO=27, DOWNTO=28, COMMA=29, RETURN=30, 
		RETURNS=31, FUNCTION=32, ELEMENT=33, ASSIGN=34, LCB=35, RCB=36, EOL=37, 
		FNUM=38, INUM=39, ID=40, TEXT=41, BLOCKCOMMENT=42, WS=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INTDCL", "FLOATDCL", "TRUTHDCL", "TEXTDCL", "ARRDCL", "LPAR", "RPAR", 
			"TIMES", "DIVIDES", "PLUS", "MINUS", "AND", "OR", "NOT", "TRUTHID", "EQUALS", 
			"GRTHAN", "LESSTHAN", "IF", "ELSE", "WHILE", "DO", "FROM", "REPEAT", 
			"UNTIL", "THEN", "UPTO", "DOWNTO", "COMMA", "RETURN", "RETURNS", "FUNCTION", 
			"ELEMENT", "ASSIGN", "LCB", "RCB", "EOL", "FNUM", "INUM", "ID", "TEXT", 
			"BLOCKCOMMENT", "WS", "UNICODE", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'integer'", "'decimal'", "'truth'", "'text'", "'array'", "'('", 
			"')'", "'*'", "'/'", "'+'", "'-'", "'AND'", "'OR'", "'NOT'", null, "'='", 
			"'>'", "'<'", "'if'", "'else'", "'while'", "'do'", "'from'", "'repeat'", 
			"'until'", "'then'", "'upto'", "'downto'", "','", "'return'", "'returns'", 
			"'function'", "'element'", "'is'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INTDCL", "FLOATDCL", "TRUTHDCL", "TEXTDCL", "ARRDCL", "LPAR", 
			"RPAR", "TIMES", "DIVIDES", "PLUS", "MINUS", "AND", "OR", "NOT", "TRUTHID", 
			"EQUALS", "GRTHAN", "LESSTHAN", "IF", "ELSE", "WHILE", "DO", "FROM", 
			"REPEAT", "UNTIL", "THEN", "UPTO", "DOWNTO", "COMMA", "RETURN", "RETURNS", 
			"FUNCTION", "ELEMENT", "ASSIGN", "LCB", "RCB", "EOL", "FNUM", "INUM", 
			"ID", "TEXT", "BLOCKCOMMENT", "WS"
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


	public PyTrunLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PyTrunLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u014f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u009f\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\6&\u0105\n&\r&\16"+
		"&\u0106\3\'\6\'\u010a\n\'\r\'\16\'\u010b\3\'\3\'\6\'\u0110\n\'\r\'\16"+
		"\'\u0111\3(\6(\u0115\n(\r(\16(\u0116\3)\6)\u011a\n)\r)\16)\u011b\3)\7"+
		")\u011f\n)\f)\16)\u0122\13)\3*\3*\7*\u0126\n*\f*\16*\u0129\13*\3*\3*\3"+
		"*\7*\u012e\n*\f*\16*\u0131\13*\3*\5*\u0134\n*\3+\3+\7+\u0138\n+\f+\16"+
		"+\u013b\13+\3+\3+\3+\3+\3+\3,\6,\u0143\n,\r,\16,\u0144\3,\3,\3-\3-\3."+
		"\3.\3.\5.\u014e\n.\3\u0139\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y\2[\2\3\2"+
		"\t\3\2\62;\4\2C\\c|\5\2\62;C\\c|\5\2\f\f\17\17$$\5\2\f\f\17\17))\5\2\13"+
		"\13\16\16\"\"\4\2\f\f\17\17\2\u0159\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3]\3\2\2\2\5e"+
		"\3\2\2\2\7m\3\2\2\2\ts\3\2\2\2\13x\3\2\2\2\r~\3\2\2\2\17\u0080\3\2\2\2"+
		"\21\u0082\3\2\2\2\23\u0084\3\2\2\2\25\u0086\3\2\2\2\27\u0088\3\2\2\2\31"+
		"\u008a\3\2\2\2\33\u008e\3\2\2\2\35\u0091\3\2\2\2\37\u009e\3\2\2\2!\u00a0"+
		"\3\2\2\2#\u00a2\3\2\2\2%\u00a4\3\2\2\2\'\u00a6\3\2\2\2)\u00a9\3\2\2\2"+
		"+\u00ae\3\2\2\2-\u00b4\3\2\2\2/\u00b7\3\2\2\2\61\u00bc\3\2\2\2\63\u00c3"+
		"\3\2\2\2\65\u00c9\3\2\2\2\67\u00ce\3\2\2\29\u00d3\3\2\2\2;\u00da\3\2\2"+
		"\2=\u00dc\3\2\2\2?\u00e3\3\2\2\2A\u00eb\3\2\2\2C\u00f4\3\2\2\2E\u00fc"+
		"\3\2\2\2G\u00ff\3\2\2\2I\u0101\3\2\2\2K\u0104\3\2\2\2M\u0109\3\2\2\2O"+
		"\u0114\3\2\2\2Q\u0119\3\2\2\2S\u0133\3\2\2\2U\u0135\3\2\2\2W\u0142\3\2"+
		"\2\2Y\u0148\3\2\2\2[\u014d\3\2\2\2]^\7k\2\2^_\7p\2\2_`\7v\2\2`a\7g\2\2"+
		"ab\7i\2\2bc\7g\2\2cd\7t\2\2d\4\3\2\2\2ef\7f\2\2fg\7g\2\2gh\7e\2\2hi\7"+
		"k\2\2ij\7o\2\2jk\7c\2\2kl\7n\2\2l\6\3\2\2\2mn\7v\2\2no\7t\2\2op\7w\2\2"+
		"pq\7v\2\2qr\7j\2\2r\b\3\2\2\2st\7v\2\2tu\7g\2\2uv\7z\2\2vw\7v\2\2w\n\3"+
		"\2\2\2xy\7c\2\2yz\7t\2\2z{\7t\2\2{|\7c\2\2|}\7{\2\2}\f\3\2\2\2~\177\7"+
		"*\2\2\177\16\3\2\2\2\u0080\u0081\7+\2\2\u0081\20\3\2\2\2\u0082\u0083\7"+
		",\2\2\u0083\22\3\2\2\2\u0084\u0085\7\61\2\2\u0085\24\3\2\2\2\u0086\u0087"+
		"\7-\2\2\u0087\26\3\2\2\2\u0088\u0089\7/\2\2\u0089\30\3\2\2\2\u008a\u008b"+
		"\7C\2\2\u008b\u008c\7P\2\2\u008c\u008d\7F\2\2\u008d\32\3\2\2\2\u008e\u008f"+
		"\7Q\2\2\u008f\u0090\7T\2\2\u0090\34\3\2\2\2\u0091\u0092\7P\2\2\u0092\u0093"+
		"\7Q\2\2\u0093\u0094\7V\2\2\u0094\36\3\2\2\2\u0095\u0096\7v\2\2\u0096\u0097"+
		"\7t\2\2\u0097\u0098\7w\2\2\u0098\u009f\7g\2\2\u0099\u009a\7h\2\2\u009a"+
		"\u009b\7c\2\2\u009b\u009c\7n\2\2\u009c\u009d\7u\2\2\u009d\u009f\7g\2\2"+
		"\u009e\u0095\3\2\2\2\u009e\u0099\3\2\2\2\u009f \3\2\2\2\u00a0\u00a1\7"+
		"?\2\2\u00a1\"\3\2\2\2\u00a2\u00a3\7@\2\2\u00a3$\3\2\2\2\u00a4\u00a5\7"+
		">\2\2\u00a5&\3\2\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7h\2\2\u00a8(\3\2"+
		"\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7u\2\2\u00ac\u00ad"+
		"\7g\2\2\u00ad*\3\2\2\2\u00ae\u00af\7y\2\2\u00af\u00b0\7j\2\2\u00b0\u00b1"+
		"\7k\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7g\2\2\u00b3,\3\2\2\2\u00b4\u00b5"+
		"\7f\2\2\u00b5\u00b6\7q\2\2\u00b6.\3\2\2\2\u00b7\u00b8\7h\2\2\u00b8\u00b9"+
		"\7t\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7o\2\2\u00bb\60\3\2\2\2\u00bc\u00bd"+
		"\7t\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7r\2\2\u00bf\u00c0\7g\2\2\u00c0"+
		"\u00c1\7c\2\2\u00c1\u00c2\7v\2\2\u00c2\62\3\2\2\2\u00c3\u00c4\7w\2\2\u00c4"+
		"\u00c5\7p\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7n\2\2"+
		"\u00c8\64\3\2\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7j\2\2\u00cb\u00cc\7"+
		"g\2\2\u00cc\u00cd\7p\2\2\u00cd\66\3\2\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0"+
		"\7r\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7q\2\2\u00d28\3\2\2\2\u00d3\u00d4"+
		"\7f\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7y\2\2\u00d6\u00d7\7p\2\2\u00d7"+
		"\u00d8\7v\2\2\u00d8\u00d9\7q\2\2\u00d9:\3\2\2\2\u00da\u00db\7.\2\2\u00db"+
		"<\3\2\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7v\2\2\u00df"+
		"\u00e0\7w\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7p\2\2\u00e2>\3\2\2\2\u00e3"+
		"\u00e4\7t\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7w\2\2"+
		"\u00e7\u00e8\7t\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7u\2\2\u00ea@\3\2\2"+
		"\2\u00eb\u00ec\7h\2\2\u00ec\u00ed\7w\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef"+
		"\7e\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7q\2\2\u00f2"+
		"\u00f3\7p\2\2\u00f3B\3\2\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7n\2\2\u00f6"+
		"\u00f7\7g\2\2\u00f7\u00f8\7o\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7p\2\2"+
		"\u00fa\u00fb\7v\2\2\u00fbD\3\2\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7u\2"+
		"\2\u00feF\3\2\2\2\u00ff\u0100\7}\2\2\u0100H\3\2\2\2\u0101\u0102\7\177"+
		"\2\2\u0102J\3\2\2\2\u0103\u0105\5[.\2\u0104\u0103\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107L\3\2\2\2\u0108"+
		"\u010a\t\2\2\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\7\60\2\2\u010e"+
		"\u0110\t\2\2\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2"+
		"\2\2\u0111\u0112\3\2\2\2\u0112N\3\2\2\2\u0113\u0115\t\2\2\2\u0114\u0113"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"P\3\2\2\2\u0118\u011a\t\3\2\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2"+
		"\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u0120\3\2\2\2\u011d\u011f"+
		"\t\4\2\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121R\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0127\7$\2\2\u0124"+
		"\u0126\n\5\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2"+
		"\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a"+
		"\u0134\7$\2\2\u012b\u012f\7)\2\2\u012c\u012e\n\6\2\2\u012d\u012c\3\2\2"+
		"\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132"+
		"\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0134\7)\2\2\u0133\u0123\3\2\2\2\u0133"+
		"\u012b\3\2\2\2\u0134T\3\2\2\2\u0135\u0139\7%\2\2\u0136\u0138\13\2\2\2"+
		"\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u013a\3\2\2\2\u0139\u0137"+
		"\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7%\2\2\u013d"+
		"\u013e\5K&\2\u013e\u013f\3\2\2\2\u013f\u0140\b+\2\2\u0140V\3\2\2\2\u0141"+
		"\u0143\t\7\2\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\b,\2\2\u0147"+
		"X\3\2\2\2\u0148\u0149\4\2\u0101\2\u0149Z\3\2\2\2\u014a\u014b\7\17\2\2"+
		"\u014b\u014e\7\f\2\2\u014c\u014e\t\b\2\2\u014d\u014a\3\2\2\2\u014d\u014c"+
		"\3\2\2\2\u014e\\\3\2\2\2\20\2\u009e\u0106\u010b\u0111\u0116\u011b\u0120"+
		"\u0127\u012f\u0133\u0139\u0144\u014d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}