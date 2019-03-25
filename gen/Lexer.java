// Generated from S:/JavaProjects/CFG/src\Lexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Lexer extends Lexer {
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
			"')'", "'*'", "'/'", "'+'", "'-'", "'and'", "'or'", "'!'", null, "'='", 
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


	public Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u014d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u009d\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\6&\u0103\n&\r&\16&\u0104\3"+
		"\'\6\'\u0108\n\'\r\'\16\'\u0109\3\'\3\'\6\'\u010e\n\'\r\'\16\'\u010f\3"+
		"(\6(\u0113\n(\r(\16(\u0114\3)\6)\u0118\n)\r)\16)\u0119\3)\7)\u011d\n)"+
		"\f)\16)\u0120\13)\3*\3*\7*\u0124\n*\f*\16*\u0127\13*\3*\3*\3*\7*\u012c"+
		"\n*\f*\16*\u012f\13*\3*\5*\u0132\n*\3+\3+\7+\u0136\n+\f+\16+\u0139\13"+
		"+\3+\3+\3+\3+\3+\3,\6,\u0141\n,\r,\16,\u0142\3,\3,\3-\3-\3.\3.\3.\5.\u014c"+
		"\n.\3\u0137\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y\2[\2\3\2\t\3\2\62;\4\2C"+
		"\\c|\5\2\62;C\\c|\5\2\f\f\17\17$$\5\2\f\f\17\17))\5\2\13\13\16\16\"\""+
		"\4\2\f\f\17\17\2\u0157\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3]\3\2\2\2\5e\3\2\2\2\7m\3"+
		"\2\2\2\ts\3\2\2\2\13x\3\2\2\2\r~\3\2\2\2\17\u0080\3\2\2\2\21\u0082\3\2"+
		"\2\2\23\u0084\3\2\2\2\25\u0086\3\2\2\2\27\u0088\3\2\2\2\31\u008a\3\2\2"+
		"\2\33\u008e\3\2\2\2\35\u0091\3\2\2\2\37\u009c\3\2\2\2!\u009e\3\2\2\2#"+
		"\u00a0\3\2\2\2%\u00a2\3\2\2\2\'\u00a4\3\2\2\2)\u00a7\3\2\2\2+\u00ac\3"+
		"\2\2\2-\u00b2\3\2\2\2/\u00b5\3\2\2\2\61\u00ba\3\2\2\2\63\u00c1\3\2\2\2"+
		"\65\u00c7\3\2\2\2\67\u00cc\3\2\2\29\u00d1\3\2\2\2;\u00d8\3\2\2\2=\u00da"+
		"\3\2\2\2?\u00e1\3\2\2\2A\u00e9\3\2\2\2C\u00f2\3\2\2\2E\u00fa\3\2\2\2G"+
		"\u00fd\3\2\2\2I\u00ff\3\2\2\2K\u0102\3\2\2\2M\u0107\3\2\2\2O\u0112\3\2"+
		"\2\2Q\u0117\3\2\2\2S\u0131\3\2\2\2U\u0133\3\2\2\2W\u0140\3\2\2\2Y\u0146"+
		"\3\2\2\2[\u014b\3\2\2\2]^\7k\2\2^_\7p\2\2_`\7v\2\2`a\7g\2\2ab\7i\2\2b"+
		"c\7g\2\2cd\7t\2\2d\4\3\2\2\2ef\7f\2\2fg\7g\2\2gh\7e\2\2hi\7k\2\2ij\7o"+
		"\2\2jk\7c\2\2kl\7n\2\2l\6\3\2\2\2mn\7v\2\2no\7t\2\2op\7w\2\2pq\7v\2\2"+
		"qr\7j\2\2r\b\3\2\2\2st\7v\2\2tu\7g\2\2uv\7z\2\2vw\7v\2\2w\n\3\2\2\2xy"+
		"\7c\2\2yz\7t\2\2z{\7t\2\2{|\7c\2\2|}\7{\2\2}\f\3\2\2\2~\177\7*\2\2\177"+
		"\16\3\2\2\2\u0080\u0081\7+\2\2\u0081\20\3\2\2\2\u0082\u0083\7,\2\2\u0083"+
		"\22\3\2\2\2\u0084\u0085\7\61\2\2\u0085\24\3\2\2\2\u0086\u0087\7-\2\2\u0087"+
		"\26\3\2\2\2\u0088\u0089\7/\2\2\u0089\30\3\2\2\2\u008a\u008b\7c\2\2\u008b"+
		"\u008c\7p\2\2\u008c\u008d\7f\2\2\u008d\32\3\2\2\2\u008e\u008f\7q\2\2\u008f"+
		"\u0090\7t\2\2\u0090\34\3\2\2\2\u0091\u0092\7#\2\2\u0092\36\3\2\2\2\u0093"+
		"\u0094\7v\2\2\u0094\u0095\7t\2\2\u0095\u0096\7w\2\2\u0096\u009d\7g\2\2"+
		"\u0097\u0098\7h\2\2\u0098\u0099\7c\2\2\u0099\u009a\7n\2\2\u009a\u009b"+
		"\7u\2\2\u009b\u009d\7g\2\2\u009c\u0093\3\2\2\2\u009c\u0097\3\2\2\2\u009d"+
		" \3\2\2\2\u009e\u009f\7?\2\2\u009f\"\3\2\2\2\u00a0\u00a1\7@\2\2\u00a1"+
		"$\3\2\2\2\u00a2\u00a3\7>\2\2\u00a3&\3\2\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6"+
		"\7h\2\2\u00a6(\3\2\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa"+
		"\7u\2\2\u00aa\u00ab\7g\2\2\u00ab*\3\2\2\2\u00ac\u00ad\7y\2\2\u00ad\u00ae"+
		"\7j\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7g\2\2\u00b1"+
		",\3\2\2\2\u00b2\u00b3\7f\2\2\u00b3\u00b4\7q\2\2\u00b4.\3\2\2\2\u00b5\u00b6"+
		"\7h\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7o\2\2\u00b9"+
		"\60\3\2\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7r\2\2\u00bd"+
		"\u00be\7g\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7v\2\2\u00c0\62\3\2\2\2\u00c1"+
		"\u00c2\7w\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7k\2\2"+
		"\u00c5\u00c6\7n\2\2\u00c6\64\3\2\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7"+
		"j\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7p\2\2\u00cb\66\3\2\2\2\u00cc\u00cd"+
		"\7w\2\2\u00cd\u00ce\7r\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7q\2\2\u00d0"+
		"8\3\2\2\2\u00d1\u00d2\7f\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7y\2\2\u00d4"+
		"\u00d5\7p\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7q\2\2\u00d7:\3\2\2\2\u00d8"+
		"\u00d9\7.\2\2\u00d9<\3\2\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7g\2\2\u00dc"+
		"\u00dd\7v\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7p\2\2"+
		"\u00e0>\3\2\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7v\2"+
		"\2\u00e4\u00e5\7w\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8"+
		"\7u\2\2\u00e8@\3\2\2\2\u00e9\u00ea\7h\2\2\u00ea\u00eb\7w\2\2\u00eb\u00ec"+
		"\7p\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7k\2\2\u00ef"+
		"\u00f0\7q\2\2\u00f0\u00f1\7p\2\2\u00f1B\3\2\2\2\u00f2\u00f3\7g\2\2\u00f3"+
		"\u00f4\7n\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7o\2\2\u00f6\u00f7\7g\2\2"+
		"\u00f7\u00f8\7p\2\2\u00f8\u00f9\7v\2\2\u00f9D\3\2\2\2\u00fa\u00fb\7k\2"+
		"\2\u00fb\u00fc\7u\2\2\u00fcF\3\2\2\2\u00fd\u00fe\7}\2\2\u00feH\3\2\2\2"+
		"\u00ff\u0100\7\177\2\2\u0100J\3\2\2\2\u0101\u0103\5[.\2\u0102\u0101\3"+
		"\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"L\3\2\2\2\u0106\u0108\t\2\2\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2"+
		"\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d"+
		"\7\60\2\2\u010c\u010e\t\2\2\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2"+
		"\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110N\3\2\2\2\u0111\u0113\t"+
		"\2\2\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0112\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115P\3\2\2\2\u0116\u0118\t\3\2\2\u0117\u0116\3\2\2\2"+
		"\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011e"+
		"\3\2\2\2\u011b\u011d\t\4\2\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011fR\3\2\2\2\u0120\u011e\3\2\2\2"+
		"\u0121\u0125\7$\2\2\u0122\u0124\n\5\2\2\u0123\u0122\3\2\2\2\u0124\u0127"+
		"\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0128\u0132\7$\2\2\u0129\u012d\7)\2\2\u012a\u012c\n\6\2"+
		"\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e"+
		"\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0132\7)\2\2\u0131"+
		"\u0121\3\2\2\2\u0131\u0129\3\2\2\2\u0132T\3\2\2\2\u0133\u0137\7%\2\2\u0134"+
		"\u0136\13\2\2\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0138\3"+
		"\2\2\2\u0137\u0135\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a"+
		"\u013b\7%\2\2\u013b\u013c\5K&\2\u013c\u013d\3\2\2\2\u013d\u013e\b+\2\2"+
		"\u013eV\3\2\2\2\u013f\u0141\t\7\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3"+
		"\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0145\b,\2\2\u0145X\3\2\2\2\u0146\u0147\4\2\u0101\2\u0147Z\3\2\2\2\u0148"+
		"\u0149\7\17\2\2\u0149\u014c\7\f\2\2\u014a\u014c\t\b\2\2\u014b\u0148\3"+
		"\2\2\2\u014b\u014a\3\2\2\2\u014c\\\3\2\2\2\20\2\u009c\u0104\u0109\u010f"+
		"\u0114\u0119\u011e\u0125\u012d\u0131\u0137\u0142\u014b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}