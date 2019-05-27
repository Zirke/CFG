// Generated from C:/Users/Abiram Mohanaraj/Documents/GitHub/CFG/src/cfg\Trun.g4 by ANTLR 4.7.2
package cfg;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Trun extends Parser {
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
	public static final int
		RULE_start = 0, RULE_dclblock = 1, RULE_arrdclblock = 2, RULE_functiondclblock = 3, 
		RULE_stmtstartblock = 4, RULE_stmt = 5, RULE_functiondcl = 6, RULE_dcl = 7, 
		RULE_arrdcl = 8, RULE_dclValue = 9, RULE_param = 10, RULE_functioncall = 11, 
		RULE_ifstmt = 12, RULE_whilestmt = 13, RULE_repeatuntilstmt = 14, RULE_fromstmt = 15, 
		RULE_returnstmt = 16, RULE_assignment = 17, RULE_value = 18, RULE_valueorfunctioncallortext = 19, 
		RULE_expr = 20, RULE_arithmexpr = 21, RULE_multexpr = 22, RULE_unaryminus = 23, 
		RULE_parexpr = 24, RULE_truthexpr = 25, RULE_logicalexpr = 26, RULE_relationalexpr = 27, 
		RULE_append = 28, RULE_textorid = 29, RULE_arrindex = 30, RULE_arradd = 31, 
		RULE_drive = 32, RULE_turnleft = 33, RULE_turnright = 34, RULE_pause = 35, 
		RULE_nums = 36, RULE_stmtblock = 37, RULE_truthpar = 38, RULE_truth = 39, 
		RULE_type = 40, RULE_arg = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "dclblock", "arrdclblock", "functiondclblock", "stmtstartblock", 
			"stmt", "functiondcl", "dcl", "arrdcl", "dclValue", "param", "functioncall", 
			"ifstmt", "whilestmt", "repeatuntilstmt", "fromstmt", "returnstmt", "assignment", 
			"value", "valueorfunctioncallortext", "expr", "arithmexpr", "multexpr", 
			"unaryminus", "parexpr", "truthexpr", "logicalexpr", "relationalexpr", 
			"append", "textorid", "arrindex", "arradd", "drive", "turnleft", "turnright", 
			"pause", "nums", "stmtblock", "truthpar", "truth", "type", "arg"
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

	@Override
	public String getGrammarFileName() { return "Trun.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Trun(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public DclblockContext dclblock() {
			return getRuleContext(DclblockContext.class,0);
		}
		public ArrdclblockContext arrdclblock() {
			return getRuleContext(ArrdclblockContext.class,0);
		}
		public FunctiondclblockContext functiondclblock() {
			return getRuleContext(FunctiondclblockContext.class,0);
		}
		public StmtstartblockContext stmtstartblock() {
			return getRuleContext(StmtstartblockContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			dclblock();
			setState(85);
			arrdclblock();
			setState(86);
			functiondclblock();
			setState(87);
			stmtstartblock();
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

	public static class DclblockContext extends ParserRuleContext {
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Trun.EOF, 0); }
		public List<TerminalNode> EOL() { return getTokens(Trun.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(Trun.EOL, i);
		}
		public List<DclblockContext> dclblock() {
			return getRuleContexts(DclblockContext.class);
		}
		public DclblockContext dclblock(int i) {
			return getRuleContext(DclblockContext.class,i);
		}
		public DclblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dclblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterDclblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitDclblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitDclblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclblockContext dclblock() throws RecognitionException {
		DclblockContext _localctx = new DclblockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dclblock);
		try {
			int _alt;
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(89);
				dcl();
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(90);
						match(EOL);
						setState(91);
						dclblock();
						}
						} 
					}
					setState(96);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				}
				setState(98);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(97);
					match(EOF);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(100);
					match(EOF);
					}
					break;
				}
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

	public static class ArrdclblockContext extends ParserRuleContext {
		public ArrdclContext arrdcl() {
			return getRuleContext(ArrdclContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Trun.EOF, 0); }
		public List<TerminalNode> EOL() { return getTokens(Trun.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(Trun.EOL, i);
		}
		public List<ArrdclblockContext> arrdclblock() {
			return getRuleContexts(ArrdclblockContext.class);
		}
		public ArrdclblockContext arrdclblock(int i) {
			return getRuleContext(ArrdclblockContext.class,i);
		}
		public ArrdclblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrdclblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterArrdclblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitArrdclblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitArrdclblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrdclblockContext arrdclblock() throws RecognitionException {
		ArrdclblockContext _localctx = new ArrdclblockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arrdclblock);
		try {
			int _alt;
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTDCL:
			case FLOATDCL:
			case TRUTHDCL:
			case TEXTDCL:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(105);
				arrdcl();
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(106);
						match(EOL);
						setState(107);
						arrdclblock();
						}
						} 
					}
					setState(112);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				setState(114);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(113);
					match(EOF);
					}
					break;
				}
				}
				break;
			case EOF:
			case IF:
			case WHILE:
			case FROM:
			case REPEAT:
			case RETURN:
			case FUNCTION:
			case DRIVE:
			case TURNLEFT:
			case TURNRIGHT:
			case PAUSE:
			case EOL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(116);
					match(EOF);
					}
					break;
				}
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

	public static class FunctiondclblockContext extends ParserRuleContext {
		public FunctiondclContext functiondcl() {
			return getRuleContext(FunctiondclContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Trun.EOF, 0); }
		public List<TerminalNode> EOL() { return getTokens(Trun.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(Trun.EOL, i);
		}
		public List<FunctiondclblockContext> functiondclblock() {
			return getRuleContexts(FunctiondclblockContext.class);
		}
		public FunctiondclblockContext functiondclblock(int i) {
			return getRuleContext(FunctiondclblockContext.class,i);
		}
		public FunctiondclblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondclblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterFunctiondclblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitFunctiondclblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitFunctiondclblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondclblockContext functiondclblock() throws RecognitionException {
		FunctiondclblockContext _localctx = new FunctiondclblockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functiondclblock);
		try {
			int _alt;
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(121);
				functiondcl();
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(122);
						match(EOL);
						setState(123);
						functiondclblock();
						}
						} 
					}
					setState(128);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				setState(130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(129);
					match(EOF);
					}
					break;
				}
				}
				break;
			case EOF:
			case IF:
			case WHILE:
			case FROM:
			case REPEAT:
			case RETURN:
			case DRIVE:
			case TURNLEFT:
			case TURNRIGHT:
			case PAUSE:
			case EOL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(132);
					match(EOF);
					}
					break;
				}
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

	public static class StmtstartblockContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Trun.EOF, 0); }
		public List<TerminalNode> EOL() { return getTokens(Trun.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(Trun.EOL, i);
		}
		public List<StmtstartblockContext> stmtstartblock() {
			return getRuleContexts(StmtstartblockContext.class);
		}
		public StmtstartblockContext stmtstartblock(int i) {
			return getRuleContext(StmtstartblockContext.class,i);
		}
		public StmtstartblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtstartblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterStmtstartblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitStmtstartblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitStmtstartblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtstartblockContext stmtstartblock() throws RecognitionException {
		StmtstartblockContext _localctx = new StmtstartblockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmtstartblock);
		try {
			int _alt;
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case WHILE:
			case FROM:
			case REPEAT:
			case RETURN:
			case DRIVE:
			case TURNLEFT:
			case TURNRIGHT:
			case PAUSE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(137);
				stmt();
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(138);
						match(EOL);
						setState(139);
						stmtstartblock();
						}
						} 
					}
					setState(144);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				setState(146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(145);
					match(EOF);
					}
					break;
				}
				}
				break;
			case EOF:
			case RCB:
			case EOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(148);
					match(EOF);
					}
					break;
				}
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

	public static class StmtContext extends ParserRuleContext {
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public WhilestmtContext whilestmt() {
			return getRuleContext(WhilestmtContext.class,0);
		}
		public ReturnstmtContext returnstmt() {
			return getRuleContext(ReturnstmtContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public RepeatuntilstmtContext repeatuntilstmt() {
			return getRuleContext(RepeatuntilstmtContext.class,0);
		}
		public FromstmtContext fromstmt() {
			return getRuleContext(FromstmtContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ArraddContext arradd() {
			return getRuleContext(ArraddContext.class,0);
		}
		public ArrindexContext arrindex() {
			return getRuleContext(ArrindexContext.class,0);
		}
		public DriveContext drive() {
			return getRuleContext(DriveContext.class,0);
		}
		public TurnleftContext turnleft() {
			return getRuleContext(TurnleftContext.class,0);
		}
		public TurnrightContext turnright() {
			return getRuleContext(TurnrightContext.class,0);
		}
		public PauseContext pause() {
			return getRuleContext(PauseContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmt);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				ifstmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				whilestmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				returnstmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				functioncall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				repeatuntilstmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				fromstmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(159);
				assignment();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(160);
				arradd();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(161);
				arrindex();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(162);
				drive();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(163);
				turnleft();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(164);
				turnright();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(165);
				pause();
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

	public static class FunctiondclContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(Trun.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(Trun.ID, 0); }
		public TerminalNode RETURNS() { return getToken(Trun.RETURNS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(Trun.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(Trun.RPAR, 0); }
		public StmtblockContext stmtblock() {
			return getRuleContext(StmtblockContext.class,0);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Trun.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Trun.COMMA, i);
		}
		public FunctiondclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterFunctiondcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitFunctiondcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitFunctiondcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondclContext functiondcl() throws RecognitionException {
		FunctiondclContext _localctx = new FunctiondclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functiondcl);
		int _la;
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(FUNCTION);
				setState(169);
				match(ID);
				setState(170);
				match(RETURNS);
				setState(171);
				type();
				setState(172);
				match(LPAR);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTDCL) | (1L << FLOATDCL) | (1L << TRUTHDCL) | (1L << TEXTDCL))) != 0)) {
					{
					setState(173);
					param();
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(174);
						match(COMMA);
						setState(175);
						param();
						}
						}
						setState(180);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(183);
				match(RPAR);
				setState(184);
				stmtblock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(FUNCTION);
				setState(187);
				match(ID);
				setState(188);
				match(LPAR);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTDCL) | (1L << FLOATDCL) | (1L << TRUTHDCL) | (1L << TEXTDCL))) != 0)) {
					{
					setState(189);
					param();
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(190);
						match(COMMA);
						setState(191);
						param();
						}
						}
						setState(196);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(199);
				match(RPAR);
				setState(200);
				stmtblock();
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

	public static class DclContext extends ParserRuleContext {
		public TerminalNode INTDCL() { return getToken(Trun.INTDCL, 0); }
		public TerminalNode ID() { return getToken(Trun.ID, 0); }
		public DclValueContext dclValue() {
			return getRuleContext(DclValueContext.class,0);
		}
		public TerminalNode FLOATDCL() { return getToken(Trun.FLOATDCL, 0); }
		public TerminalNode TEXTDCL() { return getToken(Trun.TEXTDCL, 0); }
		public TerminalNode TRUTHDCL() { return getToken(Trun.TRUTHDCL, 0); }
		public TerminalNode ASSIGN() { return getToken(Trun.ASSIGN, 0); }
		public TruthexprContext truthexpr() {
			return getRuleContext(TruthexprContext.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dcl);
		int _la;
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTDCL:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(INTDCL);
				setState(204);
				match(ID);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(205);
					dclValue();
					}
				}

				}
				break;
			case FLOATDCL:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(FLOATDCL);
				setState(209);
				match(ID);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(210);
					dclValue();
					}
				}

				}
				break;
			case TEXTDCL:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(TEXTDCL);
				setState(214);
				match(ID);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(215);
					dclValue();
					}
				}

				}
				break;
			case TRUTHDCL:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				match(TRUTHDCL);
				setState(219);
				match(ID);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(220);
					match(ASSIGN);
					setState(221);
					truthexpr();
					}
				}

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

	public static class ArrdclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ARRDCL() { return getToken(Trun.ARRDCL, 0); }
		public TerminalNode ID() { return getToken(Trun.ID, 0); }
		public ArrdclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrdcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterArrdcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitArrdcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitArrdcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrdclContext arrdcl() throws RecognitionException {
		ArrdclContext _localctx = new ArrdclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arrdcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			type();
			setState(227);
			match(ARRDCL);
			setState(228);
			match(ID);
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

	public static class DclValueContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(Trun.ASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(Trun.TEXT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DclValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dclValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterDclValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitDclValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitDclValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclValueContext dclValue() throws RecognitionException {
		DclValueContext _localctx = new DclValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dclValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(230);
				match(ASSIGN);
				setState(231);
				value();
				}
				break;
			case 2:
				{
				setState(232);
				match(ASSIGN);
				setState(233);
				match(TEXT);
				}
				break;
			case 3:
				{
				setState(234);
				match(ASSIGN);
				setState(235);
				expr();
				}
				break;
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode INTDCL() { return getToken(Trun.INTDCL, 0); }
		public TerminalNode ID() { return getToken(Trun.ID, 0); }
		public TerminalNode FLOATDCL() { return getToken(Trun.FLOATDCL, 0); }
		public TerminalNode TEXTDCL() { return getToken(Trun.TEXTDCL, 0); }
		public TerminalNode TRUTHDCL() { return getToken(Trun.TRUTHDCL, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_param);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTDCL:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(INTDCL);
				setState(239);
				match(ID);
				}
				break;
			case FLOATDCL:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(FLOATDCL);
				setState(241);
				match(ID);
				}
				break;
			case TEXTDCL:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(TEXTDCL);
				setState(243);
				match(ID);
				}
				break;
			case TRUTHDCL:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				match(TRUTHDCL);
				setState(245);
				match(ID);
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

	public static class FunctioncallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Trun.ID, 0); }
		public TerminalNode LPAR() { return getToken(Trun.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(Trun.RPAR, 0); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Trun.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Trun.COMMA, i);
		}
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitFunctioncall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functioncall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(ID);
			setState(249);
			match(LPAR);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << MINUS) | (1L << NOT) | (1L << TRUTHVAL) | (1L << FNUM) | (1L << INUM) | (1L << ID) | (1L << TEXT))) != 0)) {
				{
				setState(250);
				arg();
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(251);
					match(COMMA);
					setState(252);
					arg();
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(260);
			match(RPAR);
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

	public static class IfstmtContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(Trun.IF); }
		public TerminalNode IF(int i) {
			return getToken(Trun.IF, i);
		}
		public List<TruthparContext> truthpar() {
			return getRuleContexts(TruthparContext.class);
		}
		public TruthparContext truthpar(int i) {
			return getRuleContext(TruthparContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(Trun.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(Trun.THEN, i);
		}
		public List<StmtblockContext> stmtblock() {
			return getRuleContexts(StmtblockContext.class);
		}
		public StmtblockContext stmtblock(int i) {
			return getRuleContext(StmtblockContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(Trun.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(Trun.EOL, i);
		}
		public List<TerminalNode> ELSE() { return getTokens(Trun.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(Trun.ELSE, i);
		}
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitIfstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitIfstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifstmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(IF);
			setState(263);
			truthpar();
			setState(264);
			match(THEN);
			setState(265);
			stmtblock();
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(266);
					match(EOL);
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(272);
					match(ELSE);
					setState(273);
					match(IF);
					setState(274);
					truthpar();
					setState(275);
					match(THEN);
					setState(276);
					stmtblock();
					setState(280);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(277);
							match(EOL);
							}
							} 
						}
						setState(282);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
					}
					}
					} 
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(288);
				match(ELSE);
				setState(289);
				match(THEN);
				setState(290);
				stmtblock();
				}
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

	public static class WhilestmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Trun.WHILE, 0); }
		public TruthparContext truthpar() {
			return getRuleContext(TruthparContext.class,0);
		}
		public TerminalNode DO() { return getToken(Trun.DO, 0); }
		public StmtblockContext stmtblock() {
			return getRuleContext(StmtblockContext.class,0);
		}
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterWhilestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitWhilestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitWhilestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(WHILE);
			setState(294);
			truthpar();
			setState(295);
			match(DO);
			setState(296);
			stmtblock();
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

	public static class RepeatuntilstmtContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(Trun.REPEAT, 0); }
		public StmtblockContext stmtblock() {
			return getRuleContext(StmtblockContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(Trun.UNTIL, 0); }
		public TruthparContext truthpar() {
			return getRuleContext(TruthparContext.class,0);
		}
		public RepeatuntilstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatuntilstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterRepeatuntilstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitRepeatuntilstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitRepeatuntilstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatuntilstmtContext repeatuntilstmt() throws RecognitionException {
		RepeatuntilstmtContext _localctx = new RepeatuntilstmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_repeatuntilstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(REPEAT);
			setState(299);
			stmtblock();
			setState(300);
			match(UNTIL);
			setState(301);
			truthpar();
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

	public static class FromstmtContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(Trun.FROM, 0); }
		public TerminalNode LPAR() { return getToken(Trun.LPAR, 0); }
		public List<ValueorfunctioncallortextContext> valueorfunctioncallortext() {
			return getRuleContexts(ValueorfunctioncallortextContext.class);
		}
		public ValueorfunctioncallortextContext valueorfunctioncallortext(int i) {
			return getRuleContext(ValueorfunctioncallortextContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(Trun.RPAR, 0); }
		public StmtblockContext stmtblock() {
			return getRuleContext(StmtblockContext.class,0);
		}
		public TerminalNode UPTO() { return getToken(Trun.UPTO, 0); }
		public TerminalNode DOWNTO() { return getToken(Trun.DOWNTO, 0); }
		public FromstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterFromstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitFromstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitFromstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromstmtContext fromstmt() throws RecognitionException {
		FromstmtContext _localctx = new FromstmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fromstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(FROM);
			setState(304);
			match(LPAR);
			setState(305);
			valueorfunctioncallortext();
			setState(306);
			_la = _input.LA(1);
			if ( !(_la==UPTO || _la==DOWNTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(307);
			valueorfunctioncallortext();
			setState(308);
			match(RPAR);
			setState(309);
			stmtblock();
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

	public static class ReturnstmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(Trun.RETURN, 0); }
		public ValueorfunctioncallortextContext valueorfunctioncallortext() {
			return getRuleContext(ValueorfunctioncallortextContext.class,0);
		}
		public TruthexprContext truthexpr() {
			return getRuleContext(TruthexprContext.class,0);
		}
		public List<TerminalNode> EOL() { return getTokens(Trun.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(Trun.EOL, i);
		}
		public ReturnstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterReturnstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitReturnstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitReturnstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnstmtContext returnstmt() throws RecognitionException {
		ReturnstmtContext _localctx = new ReturnstmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returnstmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(RETURN);
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(312);
				valueorfunctioncallortext();
				}
				break;
			case 2:
				{
				setState(313);
				truthexpr();
				}
				break;
			}
			setState(319);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(316);
					match(EOL);
					}
					} 
				}
				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Trun.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Trun.ASSIGN, 0); }
		public ValueorfunctioncallortextContext valueorfunctioncallortext() {
			return getRuleContext(ValueorfunctioncallortextContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(Trun.TEXT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(ID);
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(323);
				match(ASSIGN);
				setState(324);
				valueorfunctioncallortext();
				}
				break;
			case 2:
				{
				setState(325);
				match(ASSIGN);
				setState(326);
				match(TEXT);
				}
				break;
			case 3:
				{
				setState(327);
				match(ASSIGN);
				setState(328);
				expr();
				}
				break;
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

	public static class ValueContext extends ParserRuleContext {
		public ArithmexprContext arithmexpr() {
			return getRuleContext(ArithmexprContext.class,0);
		}
		public ArrindexContext arrindex() {
			return getRuleContext(ArrindexContext.class,0);
		}
		public TerminalNode ID() { return getToken(Trun.ID, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_value);
		try {
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				arithmexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				arrindex();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				match(ID);
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

	public static class ValueorfunctioncallortextContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(Trun.TEXT, 0); }
		public ValueorfunctioncallortextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueorfunctioncallortext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterValueorfunctioncallortext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitValueorfunctioncallortext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitValueorfunctioncallortext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueorfunctioncallortextContext valueorfunctioncallortext() throws RecognitionException {
		ValueorfunctioncallortextContext _localctx = new ValueorfunctioncallortextContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_valueorfunctioncallortext);
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				functioncall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				match(TEXT);
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

	public static class ExprContext extends ParserRuleContext {
		public ArithmexprContext arithmexpr() {
			return getRuleContext(ArithmexprContext.class,0);
		}
		public TruthexprContext truthexpr() {
			return getRuleContext(TruthexprContext.class,0);
		}
		public AppendContext append() {
			return getRuleContext(AppendContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				arithmexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				truthexpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(343);
				append();
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

	public static class ArithmexprContext extends ParserRuleContext {
		public List<MultexprContext> multexpr() {
			return getRuleContexts(MultexprContext.class);
		}
		public MultexprContext multexpr(int i) {
			return getRuleContext(MultexprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(Trun.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(Trun.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(Trun.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(Trun.MINUS, i);
		}
		public ArithmexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterArithmexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitArithmexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitArithmexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmexprContext arithmexpr() throws RecognitionException {
		ArithmexprContext _localctx = new ArithmexprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arithmexpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			multexpr();
			setState(351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(347);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(348);
					multexpr();
					}
					} 
				}
				setState(353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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

	public static class MultexprContext extends ParserRuleContext {
		public List<UnaryminusContext> unaryminus() {
			return getRuleContexts(UnaryminusContext.class);
		}
		public UnaryminusContext unaryminus(int i) {
			return getRuleContext(UnaryminusContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(Trun.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(Trun.TIMES, i);
		}
		public List<TerminalNode> DIVIDES() { return getTokens(Trun.DIVIDES); }
		public TerminalNode DIVIDES(int i) {
			return getToken(Trun.DIVIDES, i);
		}
		public MultexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterMultexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitMultexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitMultexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultexprContext multexpr() throws RecognitionException {
		MultexprContext _localctx = new MultexprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_multexpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			unaryminus();
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(355);
					_la = _input.LA(1);
					if ( !(_la==TIMES || _la==DIVIDES) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(356);
					unaryminus();
					}
					} 
				}
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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

	public static class UnaryminusContext extends ParserRuleContext {
		public ParexprContext parexpr() {
			return getRuleContext(ParexprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(Trun.MINUS, 0); }
		public UnaryminusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryminus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterUnaryminus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitUnaryminus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitUnaryminus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryminusContext unaryminus() throws RecognitionException {
		UnaryminusContext _localctx = new UnaryminusContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_unaryminus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(362);
				match(MINUS);
				}
			}

			setState(365);
			parexpr();
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

	public static class ParexprContext extends ParserRuleContext {
		public NumsContext nums() {
			return getRuleContext(NumsContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public ArrindexContext arrindex() {
			return getRuleContext(ArrindexContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(Trun.LPAR, 0); }
		public ArithmexprContext arithmexpr() {
			return getRuleContext(ArithmexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Trun.RPAR, 0); }
		public ParexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterParexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitParexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitParexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParexprContext parexpr() throws RecognitionException {
		ParexprContext _localctx = new ParexprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parexpr);
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				nums();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				functioncall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(369);
				arrindex();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(370);
				match(LPAR);
				setState(371);
				arithmexpr();
				setState(372);
				match(RPAR);
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

	public static class TruthexprContext extends ParserRuleContext {
		public LogicalexprContext logicalexpr() {
			return getRuleContext(LogicalexprContext.class,0);
		}
		public TruthexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truthexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterTruthexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitTruthexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitTruthexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruthexprContext truthexpr() throws RecognitionException {
		TruthexprContext _localctx = new TruthexprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_truthexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			logicalexpr();
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

	public static class LogicalexprContext extends ParserRuleContext {
		public List<RelationalexprContext> relationalexpr() {
			return getRuleContexts(RelationalexprContext.class);
		}
		public RelationalexprContext relationalexpr(int i) {
			return getRuleContext(RelationalexprContext.class,i);
		}
		public List<TerminalNode> NOT() { return getTokens(Trun.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(Trun.NOT, i);
		}
		public List<TerminalNode> OR() { return getTokens(Trun.OR); }
		public TerminalNode OR(int i) {
			return getToken(Trun.OR, i);
		}
		public List<TerminalNode> AND() { return getTokens(Trun.AND); }
		public TerminalNode AND(int i) {
			return getToken(Trun.AND, i);
		}
		public LogicalexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterLogicalexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitLogicalexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitLogicalexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalexprContext logicalexpr() throws RecognitionException {
		LogicalexprContext _localctx = new LogicalexprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_logicalexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(378);
				match(NOT);
				}
			}

			setState(381);
			relationalexpr();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(382);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(383);
					match(NOT);
					}
				}

				setState(386);
				relationalexpr();
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class RelationalexprContext extends ParserRuleContext {
		public List<ValueorfunctioncallortextContext> valueorfunctioncallortext() {
			return getRuleContexts(ValueorfunctioncallortextContext.class);
		}
		public ValueorfunctioncallortextContext valueorfunctioncallortext(int i) {
			return getRuleContext(ValueorfunctioncallortextContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(Trun.EQUALS, 0); }
		public TerminalNode GRTHAN() { return getToken(Trun.GRTHAN, 0); }
		public TerminalNode LESSTHAN() { return getToken(Trun.LESSTHAN, 0); }
		public TerminalNode LPAR() { return getToken(Trun.LPAR, 0); }
		public LogicalexprContext logicalexpr() {
			return getRuleContext(LogicalexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Trun.RPAR, 0); }
		public TruthContext truth() {
			return getRuleContext(TruthContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public RelationalexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterRelationalexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitRelationalexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitRelationalexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalexprContext relationalexpr() throws RecognitionException {
		RelationalexprContext _localctx = new RelationalexprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_relationalexpr);
		int _la;
		try {
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				valueorfunctioncallortext();
				{
				setState(393);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << GRTHAN) | (1L << LESSTHAN))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(394);
				valueorfunctioncallortext();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				match(LPAR);
				setState(397);
				logicalexpr();
				setState(398);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(400);
				truth();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(401);
				functioncall();
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

	public static class AppendContext extends ParserRuleContext {
		public List<TextoridContext> textorid() {
			return getRuleContexts(TextoridContext.class);
		}
		public TextoridContext textorid(int i) {
			return getRuleContext(TextoridContext.class,i);
		}
		public TerminalNode APPEND() { return getToken(Trun.APPEND, 0); }
		public AppendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_append; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterAppend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitAppend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitAppend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendContext append() throws RecognitionException {
		AppendContext _localctx = new AppendContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_append);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			textorid();
			setState(405);
			match(APPEND);
			setState(406);
			textorid();
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

	public static class TextoridContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(Trun.TEXT, 0); }
		public TerminalNode ID() { return getToken(Trun.ID, 0); }
		public TextoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textorid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterTextorid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitTextorid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitTextorid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextoridContext textorid() throws RecognitionException {
		TextoridContext _localctx = new TextoridContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_textorid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==TEXT) ) {
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

	public static class ArrindexContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Trun.ID, 0); }
		public TerminalNode ELEMENT() { return getToken(Trun.ELEMENT, 0); }
		public ArithmexprContext arithmexpr() {
			return getRuleContext(ArithmexprContext.class,0);
		}
		public ArrindexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrindex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterArrindex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitArrindex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitArrindex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrindexContext arrindex() throws RecognitionException {
		ArrindexContext _localctx = new ArrindexContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arrindex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(ID);
			setState(411);
			match(ELEMENT);
			setState(412);
			arithmexpr();
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

	public static class ArraddContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Trun.ID, 0); }
		public TerminalNode ELEMENT() { return getToken(Trun.ELEMENT, 0); }
		public ArithmexprContext arithmexpr() {
			return getRuleContext(ArithmexprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Trun.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(Trun.TEXT, 0); }
		public ArraddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arradd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterArradd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitArradd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitArradd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraddContext arradd() throws RecognitionException {
		ArraddContext _localctx = new ArraddContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arradd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(ID);
			setState(415);
			match(ELEMENT);
			setState(416);
			arithmexpr();
			setState(417);
			match(ASSIGN);
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(418);
				expr();
				}
				break;
			case 2:
				{
				setState(419);
				match(TEXT);
				}
				break;
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

	public static class DriveContext extends ParserRuleContext {
		public TerminalNode DRIVE() { return getToken(Trun.DRIVE, 0); }
		public TerminalNode LPAR() { return getToken(Trun.LPAR, 0); }
		public ValueorfunctioncallortextContext valueorfunctioncallortext() {
			return getRuleContext(ValueorfunctioncallortextContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Trun.RPAR, 0); }
		public DriveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterDrive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitDrive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitDrive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DriveContext drive() throws RecognitionException {
		DriveContext _localctx = new DriveContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_drive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(DRIVE);
			setState(423);
			match(LPAR);
			setState(424);
			valueorfunctioncallortext();
			setState(425);
			match(RPAR);
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

	public static class TurnleftContext extends ParserRuleContext {
		public TerminalNode TURNLEFT() { return getToken(Trun.TURNLEFT, 0); }
		public TerminalNode LPAR() { return getToken(Trun.LPAR, 0); }
		public ValueorfunctioncallortextContext valueorfunctioncallortext() {
			return getRuleContext(ValueorfunctioncallortextContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Trun.RPAR, 0); }
		public TurnleftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turnleft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterTurnleft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitTurnleft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitTurnleft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TurnleftContext turnleft() throws RecognitionException {
		TurnleftContext _localctx = new TurnleftContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_turnleft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(TURNLEFT);
			setState(428);
			match(LPAR);
			setState(429);
			valueorfunctioncallortext();
			setState(430);
			match(RPAR);
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

	public static class TurnrightContext extends ParserRuleContext {
		public TerminalNode TURNRIGHT() { return getToken(Trun.TURNRIGHT, 0); }
		public TerminalNode LPAR() { return getToken(Trun.LPAR, 0); }
		public ValueorfunctioncallortextContext valueorfunctioncallortext() {
			return getRuleContext(ValueorfunctioncallortextContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Trun.RPAR, 0); }
		public TurnrightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turnright; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterTurnright(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitTurnright(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitTurnright(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TurnrightContext turnright() throws RecognitionException {
		TurnrightContext _localctx = new TurnrightContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_turnright);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(TURNRIGHT);
			setState(433);
			match(LPAR);
			setState(434);
			valueorfunctioncallortext();
			setState(435);
			match(RPAR);
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

	public static class PauseContext extends ParserRuleContext {
		public TerminalNode PAUSE() { return getToken(Trun.PAUSE, 0); }
		public TerminalNode LPAR() { return getToken(Trun.LPAR, 0); }
		public ValueorfunctioncallortextContext valueorfunctioncallortext() {
			return getRuleContext(ValueorfunctioncallortextContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Trun.RPAR, 0); }
		public PauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterPause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitPause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitPause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PauseContext pause() throws RecognitionException {
		PauseContext _localctx = new PauseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_pause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(PAUSE);
			setState(438);
			match(LPAR);
			setState(439);
			valueorfunctioncallortext();
			setState(440);
			match(RPAR);
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

	public static class NumsContext extends ParserRuleContext {
		public TerminalNode INUM() { return getToken(Trun.INUM, 0); }
		public TerminalNode FNUM() { return getToken(Trun.FNUM, 0); }
		public TerminalNode ID() { return getToken(Trun.ID, 0); }
		public NumsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nums; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterNums(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitNums(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitNums(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumsContext nums() throws RecognitionException {
		NumsContext _localctx = new NumsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_nums);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FNUM) | (1L << INUM) | (1L << ID))) != 0)) ) {
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

	public static class StmtblockContext extends ParserRuleContext {
		public TerminalNode LCB() { return getToken(Trun.LCB, 0); }
		public DclblockContext dclblock() {
			return getRuleContext(DclblockContext.class,0);
		}
		public StmtstartblockContext stmtstartblock() {
			return getRuleContext(StmtstartblockContext.class,0);
		}
		public TerminalNode RCB() { return getToken(Trun.RCB, 0); }
		public List<TerminalNode> EOL() { return getTokens(Trun.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(Trun.EOL, i);
		}
		public StmtblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterStmtblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitStmtblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitStmtblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtblockContext stmtblock() throws RecognitionException {
		StmtblockContext _localctx = new StmtblockContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_stmtblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(LCB);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL) {
				{
				{
				setState(445);
				match(EOL);
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451);
			dclblock();
			setState(452);
			stmtstartblock();
			setState(453);
			match(RCB);
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

	public static class TruthparContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(Trun.LPAR, 0); }
		public TruthexprContext truthexpr() {
			return getRuleContext(TruthexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Trun.RPAR, 0); }
		public TruthparContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truthpar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterTruthpar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitTruthpar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitTruthpar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruthparContext truthpar() throws RecognitionException {
		TruthparContext _localctx = new TruthparContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_truthpar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(LPAR);
			setState(456);
			truthexpr();
			setState(457);
			match(RPAR);
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

	public static class TruthContext extends ParserRuleContext {
		public TerminalNode TRUTHVAL() { return getToken(Trun.TRUTHVAL, 0); }
		public TerminalNode ID() { return getToken(Trun.ID, 0); }
		public TruthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterTruth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitTruth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitTruth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruthContext truth() throws RecognitionException {
		TruthContext _localctx = new TruthContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_truth);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_la = _input.LA(1);
			if ( !(_la==TRUTHVAL || _la==ID) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTDCL() { return getToken(Trun.INTDCL, 0); }
		public TerminalNode FLOATDCL() { return getToken(Trun.FLOATDCL, 0); }
		public TerminalNode TRUTHDCL() { return getToken(Trun.TRUTHDCL, 0); }
		public TerminalNode TEXTDCL() { return getToken(Trun.TEXTDCL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTDCL) | (1L << FLOATDCL) | (1L << TRUTHDCL) | (1L << TEXTDCL))) != 0)) ) {
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

	public static class ArgContext extends ParserRuleContext {
		public NumsContext nums() {
			return getRuleContext(NumsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(Trun.TEXT, 0); }
		public TerminalNode TRUTHVAL() { return getToken(Trun.TRUTHVAL, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrunListener ) ((TrunListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrunVisitor ) return ((TrunVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_arg);
		try {
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				nums();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				match(TEXT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(466);
				match(TRUTHVAL);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u01d8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3_\n\3\f\3\16\3b\13\3\3\3\5\3e\n\3\3"+
		"\3\5\3h\n\3\5\3j\n\3\3\4\3\4\3\4\7\4o\n\4\f\4\16\4r\13\4\3\4\5\4u\n\4"+
		"\3\4\5\4x\n\4\5\4z\n\4\3\5\3\5\3\5\7\5\177\n\5\f\5\16\5\u0082\13\5\3\5"+
		"\5\5\u0085\n\5\3\5\5\5\u0088\n\5\5\5\u008a\n\5\3\6\3\6\3\6\7\6\u008f\n"+
		"\6\f\6\16\6\u0092\13\6\3\6\5\6\u0095\n\6\3\6\5\6\u0098\n\6\5\6\u009a\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a9\n\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00b3\n\b\f\b\16\b\u00b6\13\b\5\b\u00b8"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00c3\n\b\f\b\16\b\u00c6"+
		"\13\b\5\b\u00c8\n\b\3\b\3\b\5\b\u00cc\n\b\3\t\3\t\3\t\5\t\u00d1\n\t\3"+
		"\t\3\t\3\t\5\t\u00d6\n\t\3\t\3\t\3\t\5\t\u00db\n\t\3\t\3\t\3\t\3\t\5\t"+
		"\u00e1\n\t\5\t\u00e3\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00ef\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f9\n\f\3\r\3\r"+
		"\3\r\3\r\3\r\7\r\u0100\n\r\f\r\16\r\u0103\13\r\5\r\u0105\n\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\7\16\u010e\n\16\f\16\16\16\u0111\13\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\7\16\u0119\n\16\f\16\16\16\u011c\13\16\7\16\u011e"+
		"\n\16\f\16\16\16\u0121\13\16\3\16\3\16\3\16\5\16\u0126\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\5\22\u013d\n\22\3\22\7\22\u0140\n\22\f\22\16"+
		"\22\u0143\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u014c\n\23\3\24"+
		"\3\24\3\24\5\24\u0151\n\24\3\25\3\25\3\25\5\25\u0156\n\25\3\26\3\26\3"+
		"\26\5\26\u015b\n\26\3\27\3\27\3\27\7\27\u0160\n\27\f\27\16\27\u0163\13"+
		"\27\3\30\3\30\3\30\7\30\u0168\n\30\f\30\16\30\u016b\13\30\3\31\5\31\u016e"+
		"\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0179\n\32\3\33"+
		"\3\33\3\34\5\34\u017e\n\34\3\34\3\34\3\34\5\34\u0183\n\34\3\34\7\34\u0186"+
		"\n\34\f\34\16\34\u0189\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\5\35\u0195\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3!"+
		"\3!\3!\3!\3!\3!\5!\u01a7\n!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\7\'\u01c1\n\'\f\'\16\'\u01c4\13\'"+
		"\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\5+\u01d6\n+\3+\2"+
		"\2,\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRT\2\13\3\2\35\36\3\2\f\r\3\2\n\13\3\2\16\17\3\2\22\24\3\2/\60"+
		"\3\2-/\4\2\21\21//\3\2\3\6\2\u01fb\2V\3\2\2\2\4i\3\2\2\2\6y\3\2\2\2\b"+
		"\u0089\3\2\2\2\n\u0099\3\2\2\2\f\u00a8\3\2\2\2\16\u00cb\3\2\2\2\20\u00e2"+
		"\3\2\2\2\22\u00e4\3\2\2\2\24\u00ee\3\2\2\2\26\u00f8\3\2\2\2\30\u00fa\3"+
		"\2\2\2\32\u0108\3\2\2\2\34\u0127\3\2\2\2\36\u012c\3\2\2\2 \u0131\3\2\2"+
		"\2\"\u0139\3\2\2\2$\u0144\3\2\2\2&\u0150\3\2\2\2(\u0155\3\2\2\2*\u015a"+
		"\3\2\2\2,\u015c\3\2\2\2.\u0164\3\2\2\2\60\u016d\3\2\2\2\62\u0178\3\2\2"+
		"\2\64\u017a\3\2\2\2\66\u017d\3\2\2\28\u0194\3\2\2\2:\u0196\3\2\2\2<\u019a"+
		"\3\2\2\2>\u019c\3\2\2\2@\u01a0\3\2\2\2B\u01a8\3\2\2\2D\u01ad\3\2\2\2F"+
		"\u01b2\3\2\2\2H\u01b7\3\2\2\2J\u01bc\3\2\2\2L\u01be\3\2\2\2N\u01c9\3\2"+
		"\2\2P\u01cd\3\2\2\2R\u01cf\3\2\2\2T\u01d5\3\2\2\2VW\5\4\3\2WX\5\6\4\2"+
		"XY\5\b\5\2YZ\5\n\6\2Z\3\3\2\2\2[`\5\20\t\2\\]\7,\2\2]_\5\4\3\2^\\\3\2"+
		"\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ad\3\2\2\2b`\3\2\2\2ce\7\2\2\3dc\3\2"+
		"\2\2de\3\2\2\2ej\3\2\2\2fh\7\2\2\3gf\3\2\2\2gh\3\2\2\2hj\3\2\2\2i[\3\2"+
		"\2\2ig\3\2\2\2j\5\3\2\2\2kp\5\22\n\2lm\7,\2\2mo\5\6\4\2nl\3\2\2\2or\3"+
		"\2\2\2pn\3\2\2\2pq\3\2\2\2qt\3\2\2\2rp\3\2\2\2su\7\2\2\3ts\3\2\2\2tu\3"+
		"\2\2\2uz\3\2\2\2vx\7\2\2\3wv\3\2\2\2wx\3\2\2\2xz\3\2\2\2yk\3\2\2\2yw\3"+
		"\2\2\2z\7\3\2\2\2{\u0080\5\16\b\2|}\7,\2\2}\177\5\b\5\2~|\3\2\2\2\177"+
		"\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0084\3\2\2\2"+
		"\u0082\u0080\3\2\2\2\u0083\u0085\7\2\2\3\u0084\u0083\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u008a\3\2\2\2\u0086\u0088\7\2\2\3\u0087\u0086\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089{\3\2\2\2\u0089\u0087\3\2\2\2"+
		"\u008a\t\3\2\2\2\u008b\u0090\5\f\7\2\u008c\u008d\7,\2\2\u008d\u008f\5"+
		"\n\6\2\u008e\u008c\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0095\7\2"+
		"\2\3\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u009a\3\2\2\2\u0096"+
		"\u0098\7\2\2\3\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2"+
		"\2\2\u0099\u008b\3\2\2\2\u0099\u0097\3\2\2\2\u009a\13\3\2\2\2\u009b\u00a9"+
		"\5\32\16\2\u009c\u00a9\5\34\17\2\u009d\u00a9\5\"\22\2\u009e\u00a9\5\30"+
		"\r\2\u009f\u00a9\5\36\20\2\u00a0\u00a9\5 \21\2\u00a1\u00a9\5$\23\2\u00a2"+
		"\u00a9\5@!\2\u00a3\u00a9\5> \2\u00a4\u00a9\5B\"\2\u00a5\u00a9\5D#\2\u00a6"+
		"\u00a9\5F$\2\u00a7\u00a9\5H%\2\u00a8\u009b\3\2\2\2\u00a8\u009c\3\2\2\2"+
		"\u00a8\u009d\3\2\2\2\u00a8\u009e\3\2\2\2\u00a8\u009f\3\2\2\2\u00a8\u00a0"+
		"\3\2\2\2\u00a8\u00a1\3\2\2\2\u00a8\u00a2\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a8"+
		"\u00a4\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2"+
		"\2\2\u00a9\r\3\2\2\2\u00aa\u00ab\7\"\2\2\u00ab\u00ac\7/\2\2\u00ac\u00ad"+
		"\7!\2\2\u00ad\u00ae\5R*\2\u00ae\u00b7\7\b\2\2\u00af\u00b4\5\26\f\2\u00b0"+
		"\u00b1\7\37\2\2\u00b1\u00b3\5\26\f\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3"+
		"\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b7\u00af\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00ba\7\t\2\2\u00ba\u00bb\5L\'\2\u00bb\u00cc\3\2\2\2\u00bc"+
		"\u00bd\7\"\2\2\u00bd\u00be\7/\2\2\u00be\u00c7\7\b\2\2\u00bf\u00c4\5\26"+
		"\f\2\u00c0\u00c1\7\37\2\2\u00c1\u00c3\5\26\f\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c8\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00bf\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\7\t\2\2\u00ca\u00cc\5L\'\2\u00cb\u00aa\3\2"+
		"\2\2\u00cb\u00bc\3\2\2\2\u00cc\17\3\2\2\2\u00cd\u00ce\7\3\2\2\u00ce\u00d0"+
		"\7/\2\2\u00cf\u00d1\5\24\13\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2"+
		"\u00d1\u00e3\3\2\2\2\u00d2\u00d3\7\4\2\2\u00d3\u00d5\7/\2\2\u00d4\u00d6"+
		"\5\24\13\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00e3\3\2\2\2"+
		"\u00d7\u00d8\7\6\2\2\u00d8\u00da\7/\2\2\u00d9\u00db\5\24\13\2\u00da\u00d9"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00e3\3\2\2\2\u00dc\u00dd\7\5\2\2\u00dd"+
		"\u00e0\7/\2\2\u00de\u00df\7$\2\2\u00df\u00e1\5\64\33\2\u00e0\u00de\3\2"+
		"\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00cd\3\2\2\2\u00e2"+
		"\u00d2\3\2\2\2\u00e2\u00d7\3\2\2\2\u00e2\u00dc\3\2\2\2\u00e3\21\3\2\2"+
		"\2\u00e4\u00e5\5R*\2\u00e5\u00e6\7\7\2\2\u00e6\u00e7\7/\2\2\u00e7\23\3"+
		"\2\2\2\u00e8\u00e9\7$\2\2\u00e9\u00ef\5&\24\2\u00ea\u00eb\7$\2\2\u00eb"+
		"\u00ef\7\60\2\2\u00ec\u00ed\7$\2\2\u00ed\u00ef\5*\26\2\u00ee\u00e8\3\2"+
		"\2\2\u00ee\u00ea\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\25\3\2\2\2\u00f0\u00f1"+
		"\7\3\2\2\u00f1\u00f9\7/\2\2\u00f2\u00f3\7\4\2\2\u00f3\u00f9\7/\2\2\u00f4"+
		"\u00f5\7\6\2\2\u00f5\u00f9\7/\2\2\u00f6\u00f7\7\5\2\2\u00f7\u00f9\7/\2"+
		"\2\u00f8\u00f0\3\2\2\2\u00f8\u00f2\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f8\u00f6"+
		"\3\2\2\2\u00f9\27\3\2\2\2\u00fa\u00fb\7/\2\2\u00fb\u0104\7\b\2\2\u00fc"+
		"\u0101\5T+\2\u00fd\u00fe\7\37\2\2\u00fe\u0100\5T+\2\u00ff\u00fd\3\2\2"+
		"\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0105"+
		"\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u00fc\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0107\7\t\2\2\u0107\31\3\2\2\2\u0108\u0109\7\25\2"+
		"\2\u0109\u010a\5N(\2\u010a\u010b\7\34\2\2\u010b\u010f\5L\'\2\u010c\u010e"+
		"\7,\2\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u011f\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\7\26"+
		"\2\2\u0113\u0114\7\25\2\2\u0114\u0115\5N(\2\u0115\u0116\7\34\2\2\u0116"+
		"\u011a\5L\'\2\u0117\u0119\7,\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2"+
		"\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a"+
		"\3\2\2\2\u011d\u0112\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0125\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123\7\26"+
		"\2\2\u0123\u0124\7\34\2\2\u0124\u0126\5L\'\2\u0125\u0122\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\33\3\2\2\2\u0127\u0128\7\27\2\2\u0128\u0129\5N(\2"+
		"\u0129\u012a\7\30\2\2\u012a\u012b\5L\'\2\u012b\35\3\2\2\2\u012c\u012d"+
		"\7\32\2\2\u012d\u012e\5L\'\2\u012e\u012f\7\33\2\2\u012f\u0130\5N(\2\u0130"+
		"\37\3\2\2\2\u0131\u0132\7\31\2\2\u0132\u0133\7\b\2\2\u0133\u0134\5(\25"+
		"\2\u0134\u0135\t\2\2\2\u0135\u0136\5(\25\2\u0136\u0137\7\t\2\2\u0137\u0138"+
		"\5L\'\2\u0138!\3\2\2\2\u0139\u013c\7 \2\2\u013a\u013d\5(\25\2\u013b\u013d"+
		"\5\64\33\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2\2\2\u013d\u0141\3\2\2\2"+
		"\u013e\u0140\7,\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f"+
		"\3\2\2\2\u0141\u0142\3\2\2\2\u0142#\3\2\2\2\u0143\u0141\3\2\2\2\u0144"+
		"\u014b\7/\2\2\u0145\u0146\7$\2\2\u0146\u014c\5(\25\2\u0147\u0148\7$\2"+
		"\2\u0148\u014c\7\60\2\2\u0149\u014a\7$\2\2\u014a\u014c\5*\26\2\u014b\u0145"+
		"\3\2\2\2\u014b\u0147\3\2\2\2\u014b\u0149\3\2\2\2\u014c%\3\2\2\2\u014d"+
		"\u0151\5,\27\2\u014e\u0151\5> \2\u014f\u0151\7/\2\2\u0150\u014d\3\2\2"+
		"\2\u0150\u014e\3\2\2\2\u0150\u014f\3\2\2\2\u0151\'\3\2\2\2\u0152\u0156"+
		"\5&\24\2\u0153\u0156\5\30\r\2\u0154\u0156\7\60\2\2\u0155\u0152\3\2\2\2"+
		"\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156)\3\2\2\2\u0157\u015b\5"+
		",\27\2\u0158\u015b\5\64\33\2\u0159\u015b\5:\36\2\u015a\u0157\3\2\2\2\u015a"+
		"\u0158\3\2\2\2\u015a\u0159\3\2\2\2\u015b+\3\2\2\2\u015c\u0161\5.\30\2"+
		"\u015d\u015e\t\3\2\2\u015e\u0160\5.\30\2\u015f\u015d\3\2\2\2\u0160\u0163"+
		"\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162-\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0164\u0169\5\60\31\2\u0165\u0166\t\4\2\2\u0166\u0168\5"+
		"\60\31\2\u0167\u0165\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a/\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016e\7\r\2\2"+
		"\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170"+
		"\5\62\32\2\u0170\61\3\2\2\2\u0171\u0179\5J&\2\u0172\u0179\5\30\r\2\u0173"+
		"\u0179\5> \2\u0174\u0175\7\b\2\2\u0175\u0176\5,\27\2\u0176\u0177\7\t\2"+
		"\2\u0177\u0179\3\2\2\2\u0178\u0171\3\2\2\2\u0178\u0172\3\2\2\2\u0178\u0173"+
		"\3\2\2\2\u0178\u0174\3\2\2\2\u0179\63\3\2\2\2\u017a\u017b\5\66\34\2\u017b"+
		"\65\3\2\2\2\u017c\u017e\7\20\2\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2"+
		"\2\u017e\u017f\3\2\2\2\u017f\u0187\58\35\2\u0180\u0182\t\5\2\2\u0181\u0183"+
		"\7\20\2\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2"+
		"\u0184\u0186\58\35\2\u0185\u0180\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185"+
		"\3\2\2\2\u0187\u0188\3\2\2\2\u0188\67\3\2\2\2\u0189\u0187\3\2\2\2\u018a"+
		"\u018b\5(\25\2\u018b\u018c\t\6\2\2\u018c\u018d\5(\25\2\u018d\u0195\3\2"+
		"\2\2\u018e\u018f\7\b\2\2\u018f\u0190\5\66\34\2\u0190\u0191\7\t\2\2\u0191"+
		"\u0195\3\2\2\2\u0192\u0195\5P)\2\u0193\u0195\5\30\r\2\u0194\u018a\3\2"+
		"\2\2\u0194\u018e\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0193\3\2\2\2\u0195"+
		"9\3\2\2\2\u0196\u0197\5<\37\2\u0197\u0198\7+\2\2\u0198\u0199\5<\37\2\u0199"+
		";\3\2\2\2\u019a\u019b\t\7\2\2\u019b=\3\2\2\2\u019c\u019d\7/\2\2\u019d"+
		"\u019e\7#\2\2\u019e\u019f\5,\27\2\u019f?\3\2\2\2\u01a0\u01a1\7/\2\2\u01a1"+
		"\u01a2\7#\2\2\u01a2\u01a3\5,\27\2\u01a3\u01a6\7$\2\2\u01a4\u01a7\5*\26"+
		"\2\u01a5\u01a7\7\60\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7"+
		"A\3\2\2\2\u01a8\u01a9\7\'\2\2\u01a9\u01aa\7\b\2\2\u01aa\u01ab\5(\25\2"+
		"\u01ab\u01ac\7\t\2\2\u01acC\3\2\2\2\u01ad\u01ae\7(\2\2\u01ae\u01af\7\b"+
		"\2\2\u01af\u01b0\5(\25\2\u01b0\u01b1\7\t\2\2\u01b1E\3\2\2\2\u01b2\u01b3"+
		"\7)\2\2\u01b3\u01b4\7\b\2\2\u01b4\u01b5\5(\25\2\u01b5\u01b6\7\t\2\2\u01b6"+
		"G\3\2\2\2\u01b7\u01b8\7*\2\2\u01b8\u01b9\7\b\2\2\u01b9\u01ba\5(\25\2\u01ba"+
		"\u01bb\7\t\2\2\u01bbI\3\2\2\2\u01bc\u01bd\t\b\2\2\u01bdK\3\2\2\2\u01be"+
		"\u01c2\7%\2\2\u01bf\u01c1\7,\2\2\u01c0\u01bf\3\2\2\2\u01c1\u01c4\3\2\2"+
		"\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c2"+
		"\3\2\2\2\u01c5\u01c6\5\4\3\2\u01c6\u01c7\5\n\6\2\u01c7\u01c8\7&\2\2\u01c8"+
		"M\3\2\2\2\u01c9\u01ca\7\b\2\2\u01ca\u01cb\5\64\33\2\u01cb\u01cc\7\t\2"+
		"\2\u01ccO\3\2\2\2\u01cd\u01ce\t\t\2\2\u01ceQ\3\2\2\2\u01cf\u01d0\t\n\2"+
		"\2\u01d0S\3\2\2\2\u01d1\u01d6\5J&\2\u01d2\u01d6\5*\26\2\u01d3\u01d6\7"+
		"\60\2\2\u01d4\u01d6\7\21\2\2\u01d5\u01d1\3\2\2\2\u01d5\u01d2\3\2\2\2\u01d5"+
		"\u01d3\3\2\2\2\u01d5\u01d4\3\2\2\2\u01d6U\3\2\2\2\66`dgiptwy\u0080\u0084"+
		"\u0087\u0089\u0090\u0094\u0097\u0099\u00a8\u00b4\u00b7\u00c4\u00c7\u00cb"+
		"\u00d0\u00d5\u00da\u00e0\u00e2\u00ee\u00f8\u0101\u0104\u010f\u011a\u011f"+
		"\u0125\u013c\u0141\u014b\u0150\u0155\u015a\u0161\u0169\u016d\u0178\u017d"+
		"\u0182\u0187\u0194\u01a6\u01c2\u01d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}