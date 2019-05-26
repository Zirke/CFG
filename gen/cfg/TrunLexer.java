// Generated from C:\Users\Abiram Mohanaraj\Documents\GitHub\CFG\src\cfg\TrunLexer.g4 by ANTLR 4.7.2
package cfg;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TrunLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTDCL=1, FLOATDCL=2, TRUTHDCL=3, TEXTDCL=4, ARRDCL=5, LPAR=6, RPAR=7, 
		TIMES=8, DIVIDES=9, PLUS=10, MINUS=11, AND=12, OR=13, NOT=14, TRUTHVAL=15, 
		EQUALS=16, GRTHAN=17, LESSTHAN=18, IF=19, ELSE=20, WHILE=21, DO=22, FROM=23, 
		REPEAT=24, UNTIL=25, THEN=26, UPTO=27, DOWNTO=28, COMMA=29, RETURN=30, 
		RETURNS=31, FUNCTION=32, ELEMENT=33, ASSIGN=34, LCB=35, RCB=36, DRIVE=37, 
		TURNLEFT=38, TURNRIGHT=39, PAUSE=40, APPEND=41, EOL=42, FNUM=43, INUM=44, 
		ID=45, TEXT=46, WS=47, COMMENT=48, LINE_COMMENT=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INTDCL", "FLOATDCL", "TRUTHDCL", "TEXTDCL", "ARRDCL", "LPAR", "RPAR", 
			"TIMES", "DIVIDES", "PLUS", "MINUS", "AND", "OR", "NOT", "TRUTHVAL", 
			"EQUALS", "GRTHAN", "LESSTHAN", "IF", "ELSE", "WHILE", "DO", "FROM", 
			"REPEAT", "UNTIL", "THEN", "UPTO", "DOWNTO", "COMMA", "RETURN", "RETURNS", 
			"FUNCTION", "ELEMENT", "ASSIGN", "LCB", "RCB", "DRIVE", "TURNLEFT", "TURNRIGHT", 
			"PAUSE", "APPEND", "EOL", "FNUM", "INUM", "ID", "TEXT", "WS", "COMMENT", 
			"LINE_COMMENT", "UNICODE", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'integer'", "'decimal'", "'truth'", "'text'", "'array'", "'('", 
			"')'", "'*'", "'/'", "'+'", "'-'", "'AND'", "'OR'", "'NOT'", null, "'='", 
			"'>'", "'<'", "'if'", "'else'", "'while'", "'do'", "'from'", "'repeat'", 
			"'until'", "'then'", "'upto'", "'downto'", "','", "'return'", "'returns'", 
			"'function'", "'element'", "'is'", "'{'", "'}'", "'drive'", "'turnleft'", 
			"'turnright'", "'pause'", "'append'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INTDCL", "FLOATDCL", "TRUTHDCL", "TEXTDCL", "ARRDCL", "LPAR", 
			"RPAR", "TIMES", "DIVIDES", "PLUS", "MINUS", "AND", "OR", "NOT", "TRUTHVAL", 
			"EQUALS", "GRTHAN", "LESSTHAN", "IF", "ELSE", "WHILE", "DO", "FROM", 
			"REPEAT", "UNTIL", "THEN", "UPTO", "DOWNTO", "COMMA", "RETURN", "RETURNS", 
			"FUNCTION", "ELEMENT", "ASSIGN", "LCB", "RCB", "DRIVE", "TURNLEFT", "TURNRIGHT", 
			"PAUSE", "APPEND", "EOL", "FNUM", "INUM", "ID", "TEXT", "WS", "COMMENT", 
			"LINE_COMMENT"
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


	public TrunLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TrunLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u018e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00ab\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)"+
		"\3)\3*\3*\3*\3*\3*\3*\3*\3+\6+\u0137\n+\r+\16+\u0138\3,\6,\u013c\n,\r"+
		",\16,\u013d\3,\3,\6,\u0142\n,\r,\16,\u0143\3-\6-\u0147\n-\r-\16-\u0148"+
		"\3.\6.\u014c\n.\r.\16.\u014d\3.\7.\u0151\n.\f.\16.\u0154\13.\3/\3/\7/"+
		"\u0158\n/\f/\16/\u015b\13/\3/\3/\3/\7/\u0160\n/\f/\16/\u0163\13/\3/\5"+
		"/\u0166\n/\3\60\6\60\u0169\n\60\r\60\16\60\u016a\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\7\61\u0173\n\61\f\61\16\61\u0176\13\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\62\3\62\7\62\u017f\n\62\f\62\16\62\u0182\13\62\3\62\3\62\3\62\3"+
		"\62\3\63\3\63\3\64\3\64\3\64\5\64\u018d\n\64\4\u0174\u0180\2\65\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\2g\2\3\2\t\3\2\62;\5\2"+
		"C\\aac|\7\2//\62;C\\aac|\5\2\f\f\17\17$$\5\2\f\f\17\17))\5\2\13\13\16"+
		"\16\"\"\4\2\f\f\17\17\2\u0199\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3i\3\2\2\2\5q\3\2\2\2\7"+
		"y\3\2\2\2\t\177\3\2\2\2\13\u0084\3\2\2\2\r\u008a\3\2\2\2\17\u008c\3\2"+
		"\2\2\21\u008e\3\2\2\2\23\u0090\3\2\2\2\25\u0092\3\2\2\2\27\u0094\3\2\2"+
		"\2\31\u0096\3\2\2\2\33\u009a\3\2\2\2\35\u009d\3\2\2\2\37\u00aa\3\2\2\2"+
		"!\u00ac\3\2\2\2#\u00ae\3\2\2\2%\u00b0\3\2\2\2\'\u00b2\3\2\2\2)\u00b5\3"+
		"\2\2\2+\u00ba\3\2\2\2-\u00c0\3\2\2\2/\u00c3\3\2\2\2\61\u00c8\3\2\2\2\63"+
		"\u00cf\3\2\2\2\65\u00d5\3\2\2\2\67\u00da\3\2\2\29\u00df\3\2\2\2;\u00e6"+
		"\3\2\2\2=\u00e8\3\2\2\2?\u00ef\3\2\2\2A\u00f7\3\2\2\2C\u0100\3\2\2\2E"+
		"\u0108\3\2\2\2G\u010b\3\2\2\2I\u010d\3\2\2\2K\u010f\3\2\2\2M\u0115\3\2"+
		"\2\2O\u011e\3\2\2\2Q\u0128\3\2\2\2S\u012e\3\2\2\2U\u0136\3\2\2\2W\u013b"+
		"\3\2\2\2Y\u0146\3\2\2\2[\u014b\3\2\2\2]\u0165\3\2\2\2_\u0168\3\2\2\2a"+
		"\u016e\3\2\2\2c\u017c\3\2\2\2e\u0187\3\2\2\2g\u018c\3\2\2\2ij\7k\2\2j"+
		"k\7p\2\2kl\7v\2\2lm\7g\2\2mn\7i\2\2no\7g\2\2op\7t\2\2p\4\3\2\2\2qr\7f"+
		"\2\2rs\7g\2\2st\7e\2\2tu\7k\2\2uv\7o\2\2vw\7c\2\2wx\7n\2\2x\6\3\2\2\2"+
		"yz\7v\2\2z{\7t\2\2{|\7w\2\2|}\7v\2\2}~\7j\2\2~\b\3\2\2\2\177\u0080\7v"+
		"\2\2\u0080\u0081\7g\2\2\u0081\u0082\7z\2\2\u0082\u0083\7v\2\2\u0083\n"+
		"\3\2\2\2\u0084\u0085\7c\2\2\u0085\u0086\7t\2\2\u0086\u0087\7t\2\2\u0087"+
		"\u0088\7c\2\2\u0088\u0089\7{\2\2\u0089\f\3\2\2\2\u008a\u008b\7*\2\2\u008b"+
		"\16\3\2\2\2\u008c\u008d\7+\2\2\u008d\20\3\2\2\2\u008e\u008f\7,\2\2\u008f"+
		"\22\3\2\2\2\u0090\u0091\7\61\2\2\u0091\24\3\2\2\2\u0092\u0093\7-\2\2\u0093"+
		"\26\3\2\2\2\u0094\u0095\7/\2\2\u0095\30\3\2\2\2\u0096\u0097\7C\2\2\u0097"+
		"\u0098\7P\2\2\u0098\u0099\7F\2\2\u0099\32\3\2\2\2\u009a\u009b\7Q\2\2\u009b"+
		"\u009c\7T\2\2\u009c\34\3\2\2\2\u009d\u009e\7P\2\2\u009e\u009f\7Q\2\2\u009f"+
		"\u00a0\7V\2\2\u00a0\36\3\2\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7t\2\2\u00a3"+
		"\u00a4\7w\2\2\u00a4\u00ab\7g\2\2\u00a5\u00a6\7h\2\2\u00a6\u00a7\7c\2\2"+
		"\u00a7\u00a8\7n\2\2\u00a8\u00a9\7u\2\2\u00a9\u00ab\7g\2\2\u00aa\u00a1"+
		"\3\2\2\2\u00aa\u00a5\3\2\2\2\u00ab \3\2\2\2\u00ac\u00ad\7?\2\2\u00ad\""+
		"\3\2\2\2\u00ae\u00af\7@\2\2\u00af$\3\2\2\2\u00b0\u00b1\7>\2\2\u00b1&\3"+
		"\2\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7h\2\2\u00b4(\3\2\2\2\u00b5\u00b6"+
		"\7g\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7g\2\2\u00b9"+
		"*\3\2\2\2\u00ba\u00bb\7y\2\2\u00bb\u00bc\7j\2\2\u00bc\u00bd\7k\2\2\u00bd"+
		"\u00be\7n\2\2\u00be\u00bf\7g\2\2\u00bf,\3\2\2\2\u00c0\u00c1\7f\2\2\u00c1"+
		"\u00c2\7q\2\2\u00c2.\3\2\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5\7t\2\2\u00c5"+
		"\u00c6\7q\2\2\u00c6\u00c7\7o\2\2\u00c7\60\3\2\2\2\u00c8\u00c9\7t\2\2\u00c9"+
		"\u00ca\7g\2\2\u00ca\u00cb\7r\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7c\2\2"+
		"\u00cd\u00ce\7v\2\2\u00ce\62\3\2\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1\7"+
		"p\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7n\2\2\u00d4\64"+
		"\3\2\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7j\2\2\u00d7\u00d8\7g\2\2\u00d8"+
		"\u00d9\7p\2\2\u00d9\66\3\2\2\2\u00da\u00db\7w\2\2\u00db\u00dc\7r\2\2\u00dc"+
		"\u00dd\7v\2\2\u00dd\u00de\7q\2\2\u00de8\3\2\2\2\u00df\u00e0\7f\2\2\u00e0"+
		"\u00e1\7q\2\2\u00e1\u00e2\7y\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7v\2\2"+
		"\u00e4\u00e5\7q\2\2\u00e5:\3\2\2\2\u00e6\u00e7\7.\2\2\u00e7<\3\2\2\2\u00e8"+
		"\u00e9\7t\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7w\2\2"+
		"\u00ec\u00ed\7t\2\2\u00ed\u00ee\7p\2\2\u00ee>\3\2\2\2\u00ef\u00f0\7t\2"+
		"\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4"+
		"\7t\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7u\2\2\u00f6@\3\2\2\2\u00f7\u00f8"+
		"\7h\2\2\u00f8\u00f9\7w\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7e\2\2\u00fb"+
		"\u00fc\7v\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7p\2\2"+
		"\u00ffB\3\2\2\2\u0100\u0101\7g\2\2\u0101\u0102\7n\2\2\u0102\u0103\7g\2"+
		"\2\u0103\u0104\7o\2\2\u0104\u0105\7g\2\2\u0105\u0106\7p\2\2\u0106\u0107"+
		"\7v\2\2\u0107D\3\2\2\2\u0108\u0109\7k\2\2\u0109\u010a\7u\2\2\u010aF\3"+
		"\2\2\2\u010b\u010c\7}\2\2\u010cH\3\2\2\2\u010d\u010e\7\177\2\2\u010eJ"+
		"\3\2\2\2\u010f\u0110\7f\2\2\u0110\u0111\7t\2\2\u0111\u0112\7k\2\2\u0112"+
		"\u0113\7x\2\2\u0113\u0114\7g\2\2\u0114L\3\2\2\2\u0115\u0116\7v\2\2\u0116"+
		"\u0117\7w\2\2\u0117\u0118\7t\2\2\u0118\u0119\7p\2\2\u0119\u011a\7n\2\2"+
		"\u011a\u011b\7g\2\2\u011b\u011c\7h\2\2\u011c\u011d\7v\2\2\u011dN\3\2\2"+
		"\2\u011e\u011f\7v\2\2\u011f\u0120\7w\2\2\u0120\u0121\7t\2\2\u0121\u0122"+
		"\7p\2\2\u0122\u0123\7t\2\2\u0123\u0124\7k\2\2\u0124\u0125\7i\2\2\u0125"+
		"\u0126\7j\2\2\u0126\u0127\7v\2\2\u0127P\3\2\2\2\u0128\u0129\7r\2\2\u0129"+
		"\u012a\7c\2\2\u012a\u012b\7w\2\2\u012b\u012c\7u\2\2\u012c\u012d\7g\2\2"+
		"\u012dR\3\2\2\2\u012e\u012f\7c\2\2\u012f\u0130\7r\2\2\u0130\u0131\7r\2"+
		"\2\u0131\u0132\7g\2\2\u0132\u0133\7p\2\2\u0133\u0134\7f\2\2\u0134T\3\2"+
		"\2\2\u0135\u0137\5g\64\2\u0136\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139V\3\2\2\2\u013a\u013c\t\2\2\2"+
		"\u013b\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\7\60\2\2\u0140\u0142\t\2\2\2"+
		"\u0141\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144"+
		"\3\2\2\2\u0144X\3\2\2\2\u0145\u0147\t\2\2\2\u0146\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149Z\3\2\2\2"+
		"\u014a\u014c\t\3\2\2\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014b"+
		"\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0152\3\2\2\2\u014f\u0151\t\4\2\2\u0150"+
		"\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2"+
		"\2\2\u0153\\\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0159\7$\2\2\u0156\u0158"+
		"\n\5\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u0166\7$"+
		"\2\2\u015d\u0161\7)\2\2\u015e\u0160\n\6\2\2\u015f\u015e\3\2\2\2\u0160"+
		"\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2"+
		"\2\2\u0163\u0161\3\2\2\2\u0164\u0166\7)\2\2\u0165\u0155\3\2\2\2\u0165"+
		"\u015d\3\2\2\2\u0166^\3\2\2\2\u0167\u0169\t\7\2\2\u0168\u0167\3\2\2\2"+
		"\u0169\u016a\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c"+
		"\3\2\2\2\u016c\u016d\b\60\2\2\u016d`\3\2\2\2\u016e\u016f\7\61\2\2\u016f"+
		"\u0170\7%\2\2\u0170\u0174\3\2\2\2\u0171\u0173\13\2\2\2\u0172\u0171\3\2"+
		"\2\2\u0173\u0176\3\2\2\2\u0174\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175"+
		"\u0177\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0178\7%\2\2\u0178\u0179\7\61"+
		"\2\2\u0179\u017a\3\2\2\2\u017a\u017b\b\61\2\2\u017bb\3\2\2\2\u017c\u0180"+
		"\7%\2\2\u017d\u017f\13\2\2\2\u017e\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0180\3\2"+
		"\2\2\u0183\u0184\5g\64\2\u0184\u0185\3\2\2\2\u0185\u0186\b\62\2\2\u0186"+
		"d\3\2\2\2\u0187\u0188\4#\u0080\2\u0188f\3\2\2\2\u0189\u018a\7\17\2\2\u018a"+
		"\u018d\7\f\2\2\u018b\u018d\t\b\2\2\u018c\u0189\3\2\2\2\u018c\u018b\3\2"+
		"\2\2\u018dh\3\2\2\2\21\2\u00aa\u0138\u013d\u0143\u0148\u014d\u0152\u0159"+
		"\u0161\u0165\u016a\u0174\u0180\u018c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}