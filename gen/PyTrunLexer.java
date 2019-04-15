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
		TIMES=8, DIVIDES=9, PLUS=10, MINUS=11, AND=12, OR=13, NOT=14, TRUTHVAL=15, 
		EQUALS=16, GRTHAN=17, LESSTHAN=18, IF=19, ELSE=20, WHILE=21, DO=22, FROM=23, 
		REPEAT=24, UNTIL=25, THEN=26, UPTO=27, DOWNTO=28, COMMA=29, RETURN=30, 
		RETURNS=31, FUNCTION=32, ELEMENT=33, ASSIGN=34, LCB=35, RCB=36, DRIVE=37, 
		TURNLEFT=38, TURNRIGHT=39, EOL=40, FNUM=41, INUM=42, ID=43, TEXT=44, BLOCKCOMMENT=45, 
		WS=46;
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
			"EOL", "FNUM", "INUM", "ID", "TEXT", "BLOCKCOMMENT", "WS", "UNICODE", 
			"NEWLINE"
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
			"'turnright'"
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
			"EOL", "FNUM", "INUM", "ID", "TEXT", "BLOCKCOMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u016e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a5\n\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3)\6)\u0124\n)\r)\16)\u0125\3*\6*\u0129\n*\r"+
		"*\16*\u012a\3*\3*\6*\u012f\n*\r*\16*\u0130\3+\6+\u0134\n+\r+\16+\u0135"+
		"\3,\6,\u0139\n,\r,\16,\u013a\3,\7,\u013e\n,\f,\16,\u0141\13,\3-\3-\7-"+
		"\u0145\n-\f-\16-\u0148\13-\3-\3-\3-\7-\u014d\n-\f-\16-\u0150\13-\3-\5"+
		"-\u0153\n-\3.\3.\7.\u0157\n.\f.\16.\u015a\13.\3.\3.\3.\3.\3.\3/\6/\u0162"+
		"\n/\r/\16/\u0163\3/\3/\3\60\3\60\3\61\3\61\3\61\5\61\u016d\n\61\3\u0158"+
		"\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\2a\2\3\2\t\3\2\62;\4\2C\\"+
		"c|\5\2\62;C\\c|\5\2\f\f\17\17$$\5\2\f\f\17\17))\5\2\13\13\16\16\"\"\4"+
		"\2\f\f\17\17\2\u0178\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\3c\3\2\2\2\5k\3\2\2\2\7s\3\2\2\2\ty\3\2\2\2\13~\3\2\2\2\r\u0084\3"+
		"\2\2\2\17\u0086\3\2\2\2\21\u0088\3\2\2\2\23\u008a\3\2\2\2\25\u008c\3\2"+
		"\2\2\27\u008e\3\2\2\2\31\u0090\3\2\2\2\33\u0094\3\2\2\2\35\u0097\3\2\2"+
		"\2\37\u00a4\3\2\2\2!\u00a6\3\2\2\2#\u00a8\3\2\2\2%\u00aa\3\2\2\2\'\u00ac"+
		"\3\2\2\2)\u00af\3\2\2\2+\u00b4\3\2\2\2-\u00ba\3\2\2\2/\u00bd\3\2\2\2\61"+
		"\u00c2\3\2\2\2\63\u00c9\3\2\2\2\65\u00cf\3\2\2\2\67\u00d4\3\2\2\29\u00d9"+
		"\3\2\2\2;\u00e0\3\2\2\2=\u00e2\3\2\2\2?\u00e9\3\2\2\2A\u00f1\3\2\2\2C"+
		"\u00fa\3\2\2\2E\u0102\3\2\2\2G\u0105\3\2\2\2I\u0107\3\2\2\2K\u0109\3\2"+
		"\2\2M\u010f\3\2\2\2O\u0118\3\2\2\2Q\u0123\3\2\2\2S\u0128\3\2\2\2U\u0133"+
		"\3\2\2\2W\u0138\3\2\2\2Y\u0152\3\2\2\2[\u0154\3\2\2\2]\u0161\3\2\2\2_"+
		"\u0167\3\2\2\2a\u016c\3\2\2\2cd\7k\2\2de\7p\2\2ef\7v\2\2fg\7g\2\2gh\7"+
		"i\2\2hi\7g\2\2ij\7t\2\2j\4\3\2\2\2kl\7f\2\2lm\7g\2\2mn\7e\2\2no\7k\2\2"+
		"op\7o\2\2pq\7c\2\2qr\7n\2\2r\6\3\2\2\2st\7v\2\2tu\7t\2\2uv\7w\2\2vw\7"+
		"v\2\2wx\7j\2\2x\b\3\2\2\2yz\7v\2\2z{\7g\2\2{|\7z\2\2|}\7v\2\2}\n\3\2\2"+
		"\2~\177\7c\2\2\177\u0080\7t\2\2\u0080\u0081\7t\2\2\u0081\u0082\7c\2\2"+
		"\u0082\u0083\7{\2\2\u0083\f\3\2\2\2\u0084\u0085\7*\2\2\u0085\16\3\2\2"+
		"\2\u0086\u0087\7+\2\2\u0087\20\3\2\2\2\u0088\u0089\7,\2\2\u0089\22\3\2"+
		"\2\2\u008a\u008b\7\61\2\2\u008b\24\3\2\2\2\u008c\u008d\7-\2\2\u008d\26"+
		"\3\2\2\2\u008e\u008f\7/\2\2\u008f\30\3\2\2\2\u0090\u0091\7C\2\2\u0091"+
		"\u0092\7P\2\2\u0092\u0093\7F\2\2\u0093\32\3\2\2\2\u0094\u0095\7Q\2\2\u0095"+
		"\u0096\7T\2\2\u0096\34\3\2\2\2\u0097\u0098\7P\2\2\u0098\u0099\7Q\2\2\u0099"+
		"\u009a\7V\2\2\u009a\36\3\2\2\2\u009b\u009c\7v\2\2\u009c\u009d\7t\2\2\u009d"+
		"\u009e\7w\2\2\u009e\u00a5\7g\2\2\u009f\u00a0\7h\2\2\u00a0\u00a1\7c\2\2"+
		"\u00a1\u00a2\7n\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a5\7g\2\2\u00a4\u009b"+
		"\3\2\2\2\u00a4\u009f\3\2\2\2\u00a5 \3\2\2\2\u00a6\u00a7\7?\2\2\u00a7\""+
		"\3\2\2\2\u00a8\u00a9\7@\2\2\u00a9$\3\2\2\2\u00aa\u00ab\7>\2\2\u00ab&\3"+
		"\2\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7h\2\2\u00ae(\3\2\2\2\u00af\u00b0"+
		"\7g\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7g\2\2\u00b3"+
		"*\3\2\2\2\u00b4\u00b5\7y\2\2\u00b5\u00b6\7j\2\2\u00b6\u00b7\7k\2\2\u00b7"+
		"\u00b8\7n\2\2\u00b8\u00b9\7g\2\2\u00b9,\3\2\2\2\u00ba\u00bb\7f\2\2\u00bb"+
		"\u00bc\7q\2\2\u00bc.\3\2\2\2\u00bd\u00be\7h\2\2\u00be\u00bf\7t\2\2\u00bf"+
		"\u00c0\7q\2\2\u00c0\u00c1\7o\2\2\u00c1\60\3\2\2\2\u00c2\u00c3\7t\2\2\u00c3"+
		"\u00c4\7g\2\2\u00c4\u00c5\7r\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7c\2\2"+
		"\u00c7\u00c8\7v\2\2\u00c8\62\3\2\2\2\u00c9\u00ca\7w\2\2\u00ca\u00cb\7"+
		"p\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7n\2\2\u00ce\64"+
		"\3\2\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7j\2\2\u00d1\u00d2\7g\2\2\u00d2"+
		"\u00d3\7p\2\2\u00d3\66\3\2\2\2\u00d4\u00d5\7w\2\2\u00d5\u00d6\7r\2\2\u00d6"+
		"\u00d7\7v\2\2\u00d7\u00d8\7q\2\2\u00d88\3\2\2\2\u00d9\u00da\7f\2\2\u00da"+
		"\u00db\7q\2\2\u00db\u00dc\7y\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7v\2\2"+
		"\u00de\u00df\7q\2\2\u00df:\3\2\2\2\u00e0\u00e1\7.\2\2\u00e1<\3\2\2\2\u00e2"+
		"\u00e3\7t\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7w\2\2"+
		"\u00e6\u00e7\7t\2\2\u00e7\u00e8\7p\2\2\u00e8>\3\2\2\2\u00e9\u00ea\7t\2"+
		"\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7w\2\2\u00ed\u00ee"+
		"\7t\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7u\2\2\u00f0@\3\2\2\2\u00f1\u00f2"+
		"\7h\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7e\2\2\u00f5"+
		"\u00f6\7v\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7p\2\2"+
		"\u00f9B\3\2\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7n\2\2\u00fc\u00fd\7g\2"+
		"\2\u00fd\u00fe\7o\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7p\2\2\u0100\u0101"+
		"\7v\2\2\u0101D\3\2\2\2\u0102\u0103\7k\2\2\u0103\u0104\7u\2\2\u0104F\3"+
		"\2\2\2\u0105\u0106\7}\2\2\u0106H\3\2\2\2\u0107\u0108\7\177\2\2\u0108J"+
		"\3\2\2\2\u0109\u010a\7f\2\2\u010a\u010b\7t\2\2\u010b\u010c\7k\2\2\u010c"+
		"\u010d\7x\2\2\u010d\u010e\7g\2\2\u010eL\3\2\2\2\u010f\u0110\7v\2\2\u0110"+
		"\u0111\7w\2\2\u0111\u0112\7t\2\2\u0112\u0113\7p\2\2\u0113\u0114\7n\2\2"+
		"\u0114\u0115\7g\2\2\u0115\u0116\7h\2\2\u0116\u0117\7v\2\2\u0117N\3\2\2"+
		"\2\u0118\u0119\7v\2\2\u0119\u011a\7w\2\2\u011a\u011b\7t\2\2\u011b\u011c"+
		"\7p\2\2\u011c\u011d\7t\2\2\u011d\u011e\7k\2\2\u011e\u011f\7i\2\2\u011f"+
		"\u0120\7j\2\2\u0120\u0121\7v\2\2\u0121P\3\2\2\2\u0122\u0124\5a\61\2\u0123"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126R\3\2\2\2\u0127\u0129\t\2\2\2\u0128\u0127\3\2\2\2\u0129\u012a"+
		"\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012e\7\60\2\2\u012d\u012f\t\2\2\2\u012e\u012d\3\2\2\2\u012f\u0130\3"+
		"\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131T\3\2\2\2\u0132\u0134"+
		"\t\2\2\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136V\3\2\2\2\u0137\u0139\t\3\2\2\u0138\u0137\3\2\2\2"+
		"\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013f"+
		"\3\2\2\2\u013c\u013e\t\4\2\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140X\3\2\2\2\u0141\u013f\3\2\2\2"+
		"\u0142\u0146\7$\2\2\u0143\u0145\n\5\2\2\u0144\u0143\3\2\2\2\u0145\u0148"+
		"\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0149\u0153\7$\2\2\u014a\u014e\7)\2\2\u014b\u014d\n\6\2"+
		"\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f"+
		"\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0153\7)\2\2\u0152"+
		"\u0142\3\2\2\2\u0152\u014a\3\2\2\2\u0153Z\3\2\2\2\u0154\u0158\7%\2\2\u0155"+
		"\u0157\13\2\2\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0159\3"+
		"\2\2\2\u0158\u0156\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b"+
		"\u015c\7%\2\2\u015c\u015d\5Q)\2\u015d\u015e\3\2\2\2\u015e\u015f\b.\2\2"+
		"\u015f\\\3\2\2\2\u0160\u0162\t\7\2\2\u0161\u0160\3\2\2\2\u0162\u0163\3"+
		"\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0166\b/\2\2\u0166^\3\2\2\2\u0167\u0168\4\2\u0101\2\u0168`\3\2\2\2\u0169"+
		"\u016a\7\17\2\2\u016a\u016d\7\f\2\2\u016b\u016d\t\b\2\2\u016c\u0169\3"+
		"\2\2\2\u016c\u016b\3\2\2\2\u016db\3\2\2\2\20\2\u00a4\u0125\u012a\u0130"+
		"\u0135\u013a\u013f\u0146\u014e\u0152\u0158\u0163\u016c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}