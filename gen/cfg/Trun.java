// Generated from C:/Users/Abiram Mohanaraj/Documents/GitHub/CFG/src/cfg\Trun.g4 by ANTLR 4.7.2
package cfg;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

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
		public TerminalNode EOF() { return getToken(Trun.EOF, 0); }
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
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
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
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
		public TerminalNode EOF() { return getToken(Trun.EOF, 0); }
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
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTDCL:
			case FLOATDCL:
			case TRUTHDCL:
			case TEXTDCL:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(102);
				arrdcl();
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(103);
						match(EOL);
						setState(104);
						arrdclblock();
						}
						} 
					}
					setState(109);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
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
				setState(111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(110);
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
		public TerminalNode EOF() { return getToken(Trun.EOF, 0); }
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
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(115);
				functiondcl();
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(116);
						match(EOL);
						setState(117);
						functiondclblock();
						}
						} 
					}
					setState(122);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
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
				setState(124);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(123);
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
		public TerminalNode EOF() { return getToken(Trun.EOF, 0); }
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
			setState(139);
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
				setState(128);
				stmt();
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(129);
						match(EOL);
						setState(130);
						stmtstartblock();
						}
						} 
					}
					setState(135);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				}
				break;
			case EOF:
			case RCB:
			case EOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(136);
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
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				ifstmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				whilestmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				returnstmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				functioncall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				repeatuntilstmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(146);
				fromstmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(147);
				assignment();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(148);
				arradd();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(149);
				arrindex();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(150);
				drive();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(151);
				turnleft();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(152);
				turnright();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(153);
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
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(FUNCTION);
				setState(157);
				match(ID);
				setState(158);
				match(RETURNS);
				setState(159);
				type();
				setState(160);
				match(LPAR);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTDCL) | (1L << FLOATDCL) | (1L << TRUTHDCL) | (1L << TEXTDCL))) != 0)) {
					{
					setState(161);
					param();
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(162);
						match(COMMA);
						setState(163);
						param();
						}
						}
						setState(168);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(171);
				match(RPAR);
				setState(172);
				stmtblock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(FUNCTION);
				setState(175);
				match(ID);
				setState(176);
				match(LPAR);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTDCL) | (1L << FLOATDCL) | (1L << TRUTHDCL) | (1L << TEXTDCL))) != 0)) {
					{
					setState(177);
					param();
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(178);
						match(COMMA);
						setState(179);
						param();
						}
						}
						setState(184);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(187);
				match(RPAR);
				setState(188);
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
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTDCL:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(INTDCL);
				setState(192);
				match(ID);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(193);
					dclValue();
					}
				}

				}
				break;
			case FLOATDCL:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(FLOATDCL);
				setState(197);
				match(ID);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(198);
					dclValue();
					}
				}

				}
				break;
			case TEXTDCL:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				match(TEXTDCL);
				setState(202);
				match(ID);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(203);
					dclValue();
					}
				}

				}
				break;
			case TRUTHDCL:
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				match(TRUTHDCL);
				setState(207);
				match(ID);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(208);
					match(ASSIGN);
					setState(209);
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
			setState(214);
			type();
			setState(215);
			match(ARRDCL);
			setState(216);
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
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(218);
				match(ASSIGN);
				setState(219);
				value();
				}
				break;
			case 2:
				{
				setState(220);
				match(ASSIGN);
				setState(221);
				match(TEXT);
				}
				break;
			case 3:
				{
				setState(222);
				match(ASSIGN);
				setState(223);
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
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTDCL:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(INTDCL);
				setState(227);
				match(ID);
				}
				break;
			case FLOATDCL:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(FLOATDCL);
				setState(229);
				match(ID);
				}
				break;
			case TEXTDCL:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(TEXTDCL);
				setState(231);
				match(ID);
				}
				break;
			case TRUTHDCL:
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				match(TRUTHDCL);
				setState(233);
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
			setState(236);
			match(ID);
			setState(237);
			match(LPAR);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << MINUS) | (1L << NOT) | (1L << TRUTHVAL) | (1L << FNUM) | (1L << INUM) | (1L << ID) | (1L << TEXT))) != 0)) {
				{
				setState(238);
				arg();
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(239);
					match(COMMA);
					setState(240);
					arg();
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(248);
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
			setState(250);
			match(IF);
			setState(251);
			truthpar();
			setState(252);
			match(THEN);
			setState(253);
			stmtblock();
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(254);
					match(EOL);
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(260);
					match(ELSE);
					setState(261);
					match(IF);
					setState(262);
					truthpar();
					setState(263);
					match(THEN);
					setState(264);
					stmtblock();
					setState(268);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(265);
							match(EOL);
							}
							} 
						}
						setState(270);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
					}
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(276);
				match(ELSE);
				setState(277);
				match(THEN);
				setState(278);
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
			setState(281);
			match(WHILE);
			setState(282);
			truthpar();
			setState(283);
			match(DO);
			setState(284);
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
			setState(286);
			match(REPEAT);
			setState(287);
			stmtblock();
			setState(288);
			match(UNTIL);
			setState(289);
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
			setState(291);
			match(FROM);
			setState(292);
			match(LPAR);
			setState(293);
			valueorfunctioncallortext();
			setState(294);
			_la = _input.LA(1);
			if ( !(_la==UPTO || _la==DOWNTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(295);
			valueorfunctioncallortext();
			setState(296);
			match(RPAR);
			setState(297);
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
			setState(299);
			match(RETURN);
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(300);
				valueorfunctioncallortext();
				}
				break;
			case 2:
				{
				setState(301);
				truthexpr();
				}
				break;
			}
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(304);
					match(EOL);
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
			setState(310);
			match(ID);
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(311);
				match(ASSIGN);
				setState(312);
				valueorfunctioncallortext();
				}
				break;
			case 2:
				{
				setState(313);
				match(ASSIGN);
				setState(314);
				match(TEXT);
				}
				break;
			case 3:
				{
				setState(315);
				match(ASSIGN);
				setState(316);
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
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				arithmexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				arrindex();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
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
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				functioncall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
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
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				arithmexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				truthexpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
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
			setState(334);
			multexpr();
			setState(339);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(335);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(336);
					multexpr();
					}
					} 
				}
				setState(341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
			setState(342);
			unaryminus();
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(343);
					_la = _input.LA(1);
					if ( !(_la==TIMES || _la==DIVIDES) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(344);
					unaryminus();
					}
					} 
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(350);
				match(MINUS);
				}
			}

			setState(353);
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
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				nums();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				functioncall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
				arrindex();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(358);
				match(LPAR);
				setState(359);
				arithmexpr();
				setState(360);
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
			setState(364);
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
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(366);
				match(NOT);
				}
			}

			setState(369);
			relationalexpr();
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(370);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(371);
					match(NOT);
					}
				}

				setState(374);
				relationalexpr();
				}
				}
				setState(379);
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
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				valueorfunctioncallortext();
				{
				setState(381);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << GRTHAN) | (1L << LESSTHAN))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(382);
				valueorfunctioncallortext();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				match(LPAR);
				setState(385);
				logicalexpr();
				setState(386);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				truth();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(389);
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
			setState(392);
			textorid();
			setState(393);
			match(APPEND);
			setState(394);
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
			setState(396);
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
			setState(398);
			match(ID);
			setState(399);
			match(ELEMENT);
			setState(400);
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
			setState(402);
			match(ID);
			setState(403);
			match(ELEMENT);
			setState(404);
			arithmexpr();
			setState(405);
			match(ASSIGN);
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(406);
				expr();
				}
				break;
			case 2:
				{
				setState(407);
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
			setState(410);
			match(DRIVE);
			setState(411);
			match(LPAR);
			setState(412);
			valueorfunctioncallortext();
			setState(413);
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
			setState(415);
			match(TURNLEFT);
			setState(416);
			match(LPAR);
			setState(417);
			valueorfunctioncallortext();
			setState(418);
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
			setState(420);
			match(TURNRIGHT);
			setState(421);
			match(LPAR);
			setState(422);
			valueorfunctioncallortext();
			setState(423);
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
			setState(425);
			match(PAUSE);
			setState(426);
			match(LPAR);
			setState(427);
			valueorfunctioncallortext();
			setState(428);
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
			setState(430);
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
			setState(432);
			match(LCB);
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL) {
				{
				{
				setState(433);
				match(EOL);
				}
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(439);
			dclblock();
			setState(440);
			stmtstartblock();
			setState(441);
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
			setState(443);
			match(LPAR);
			setState(444);
			truthexpr();
			setState(445);
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
			setState(447);
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
			setState(449);
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
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				nums();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				match(TEXT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(454);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u01cc\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3_\n\3\f\3\16\3b\13\3\3\3\5\3e\n\3\5"+
		"\3g\n\3\3\4\3\4\3\4\7\4l\n\4\f\4\16\4o\13\4\3\4\5\4r\n\4\5\4t\n\4\3\5"+
		"\3\5\3\5\7\5y\n\5\f\5\16\5|\13\5\3\5\5\5\177\n\5\5\5\u0081\n\5\3\6\3\6"+
		"\3\6\7\6\u0086\n\6\f\6\16\6\u0089\13\6\3\6\5\6\u008c\n\6\5\6\u008e\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009d\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00a7\n\b\f\b\16\b\u00aa\13\b\5\b\u00ac"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00b7\n\b\f\b\16\b\u00ba"+
		"\13\b\5\b\u00bc\n\b\3\b\3\b\5\b\u00c0\n\b\3\t\3\t\3\t\5\t\u00c5\n\t\3"+
		"\t\3\t\3\t\5\t\u00ca\n\t\3\t\3\t\3\t\5\t\u00cf\n\t\3\t\3\t\3\t\3\t\5\t"+
		"\u00d5\n\t\5\t\u00d7\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00e3\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ed\n\f\3\r\3\r"+
		"\3\r\3\r\3\r\7\r\u00f4\n\r\f\r\16\r\u00f7\13\r\5\r\u00f9\n\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\7\16\u0102\n\16\f\16\16\16\u0105\13\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\7\16\u010d\n\16\f\16\16\16\u0110\13\16\7\16\u0112"+
		"\n\16\f\16\16\16\u0115\13\16\3\16\3\16\3\16\5\16\u011a\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\5\22\u0131\n\22\3\22\7\22\u0134\n\22\f\22\16"+
		"\22\u0137\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0140\n\23\3\24"+
		"\3\24\3\24\5\24\u0145\n\24\3\25\3\25\3\25\5\25\u014a\n\25\3\26\3\26\3"+
		"\26\5\26\u014f\n\26\3\27\3\27\3\27\7\27\u0154\n\27\f\27\16\27\u0157\13"+
		"\27\3\30\3\30\3\30\7\30\u015c\n\30\f\30\16\30\u015f\13\30\3\31\5\31\u0162"+
		"\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u016d\n\32\3\33"+
		"\3\33\3\34\5\34\u0172\n\34\3\34\3\34\3\34\5\34\u0177\n\34\3\34\7\34\u017a"+
		"\n\34\f\34\16\34\u017d\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\5\35\u0189\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3!"+
		"\3!\3!\3!\3!\3!\5!\u019b\n!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\7\'\u01b5\n\'\f\'\16\'\u01b8\13\'"+
		"\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\5+\u01ca\n+\3+\2"+
		"\2,\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRT\2\13\3\2\35\36\3\2\f\r\3\2\n\13\3\2\16\17\3\2\22\24\3\2/\60"+
		"\3\2-/\4\2\21\21//\3\2\3\6\2\u01eb\2V\3\2\2\2\4f\3\2\2\2\6s\3\2\2\2\b"+
		"\u0080\3\2\2\2\n\u008d\3\2\2\2\f\u009c\3\2\2\2\16\u00bf\3\2\2\2\20\u00d6"+
		"\3\2\2\2\22\u00d8\3\2\2\2\24\u00e2\3\2\2\2\26\u00ec\3\2\2\2\30\u00ee\3"+
		"\2\2\2\32\u00fc\3\2\2\2\34\u011b\3\2\2\2\36\u0120\3\2\2\2 \u0125\3\2\2"+
		"\2\"\u012d\3\2\2\2$\u0138\3\2\2\2&\u0144\3\2\2\2(\u0149\3\2\2\2*\u014e"+
		"\3\2\2\2,\u0150\3\2\2\2.\u0158\3\2\2\2\60\u0161\3\2\2\2\62\u016c\3\2\2"+
		"\2\64\u016e\3\2\2\2\66\u0171\3\2\2\28\u0188\3\2\2\2:\u018a\3\2\2\2<\u018e"+
		"\3\2\2\2>\u0190\3\2\2\2@\u0194\3\2\2\2B\u019c\3\2\2\2D\u01a1\3\2\2\2F"+
		"\u01a6\3\2\2\2H\u01ab\3\2\2\2J\u01b0\3\2\2\2L\u01b2\3\2\2\2N\u01bd\3\2"+
		"\2\2P\u01c1\3\2\2\2R\u01c3\3\2\2\2T\u01c9\3\2\2\2VW\5\4\3\2WX\5\6\4\2"+
		"XY\5\b\5\2YZ\5\n\6\2Z\3\3\2\2\2[`\5\20\t\2\\]\7,\2\2]_\5\4\3\2^\\\3\2"+
		"\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ag\3\2\2\2b`\3\2\2\2ce\7\2\2\3dc\3\2"+
		"\2\2de\3\2\2\2eg\3\2\2\2f[\3\2\2\2fd\3\2\2\2g\5\3\2\2\2hm\5\22\n\2ij\7"+
		",\2\2jl\5\6\4\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2nt\3\2\2\2om\3"+
		"\2\2\2pr\7\2\2\3qp\3\2\2\2qr\3\2\2\2rt\3\2\2\2sh\3\2\2\2sq\3\2\2\2t\7"+
		"\3\2\2\2uz\5\16\b\2vw\7,\2\2wy\5\b\5\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z"+
		"{\3\2\2\2{\u0081\3\2\2\2|z\3\2\2\2}\177\7\2\2\3~}\3\2\2\2~\177\3\2\2\2"+
		"\177\u0081\3\2\2\2\u0080u\3\2\2\2\u0080~\3\2\2\2\u0081\t\3\2\2\2\u0082"+
		"\u0087\5\f\7\2\u0083\u0084\7,\2\2\u0084\u0086\5\n\6\2\u0085\u0083\3\2"+
		"\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u008e\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008c\7\2\2\3\u008b\u008a\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u0082\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\13\3\2\2\2\u008f\u009d\5\32\16\2\u0090\u009d\5\34"+
		"\17\2\u0091\u009d\5\"\22\2\u0092\u009d\5\30\r\2\u0093\u009d\5\36\20\2"+
		"\u0094\u009d\5 \21\2\u0095\u009d\5$\23\2\u0096\u009d\5@!\2\u0097\u009d"+
		"\5> \2\u0098\u009d\5B\"\2\u0099\u009d\5D#\2\u009a\u009d\5F$\2\u009b\u009d"+
		"\5H%\2\u009c\u008f\3\2\2\2\u009c\u0090\3\2\2\2\u009c\u0091\3\2\2\2\u009c"+
		"\u0092\3\2\2\2\u009c\u0093\3\2\2\2\u009c\u0094\3\2\2\2\u009c\u0095\3\2"+
		"\2\2\u009c\u0096\3\2\2\2\u009c\u0097\3\2\2\2\u009c\u0098\3\2\2\2\u009c"+
		"\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\r\3\2\2\2"+
		"\u009e\u009f\7\"\2\2\u009f\u00a0\7/\2\2\u00a0\u00a1\7!\2\2\u00a1\u00a2"+
		"\5R*\2\u00a2\u00ab\7\b\2\2\u00a3\u00a8\5\26\f\2\u00a4\u00a5\7\37\2\2\u00a5"+
		"\u00a7\5\26\f\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3"+
		"\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00a3\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\t"+
		"\2\2\u00ae\u00af\5L\'\2\u00af\u00c0\3\2\2\2\u00b0\u00b1\7\"\2\2\u00b1"+
		"\u00b2\7/\2\2\u00b2\u00bb\7\b\2\2\u00b3\u00b8\5\26\f\2\u00b4\u00b5\7\37"+
		"\2\2\u00b5\u00b7\5\26\f\2\u00b6\u00b4\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00bb\u00b3\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00be\7\t\2\2\u00be\u00c0\5L\'\2\u00bf\u009e\3\2\2\2\u00bf\u00b0\3\2"+
		"\2\2\u00c0\17\3\2\2\2\u00c1\u00c2\7\3\2\2\u00c2\u00c4\7/\2\2\u00c3\u00c5"+
		"\5\24\13\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00d7\3\2\2\2"+
		"\u00c6\u00c7\7\4\2\2\u00c7\u00c9\7/\2\2\u00c8\u00ca\5\24\13\2\u00c9\u00c8"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00d7\3\2\2\2\u00cb\u00cc\7\6\2\2\u00cc"+
		"\u00ce\7/\2\2\u00cd\u00cf\5\24\13\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3"+
		"\2\2\2\u00cf\u00d7\3\2\2\2\u00d0\u00d1\7\5\2\2\u00d1\u00d4\7/\2\2\u00d2"+
		"\u00d3\7$\2\2\u00d3\u00d5\5\64\33\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3"+
		"\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00c1\3\2\2\2\u00d6\u00c6\3\2\2\2\u00d6"+
		"\u00cb\3\2\2\2\u00d6\u00d0\3\2\2\2\u00d7\21\3\2\2\2\u00d8\u00d9\5R*\2"+
		"\u00d9\u00da\7\7\2\2\u00da\u00db\7/\2\2\u00db\23\3\2\2\2\u00dc\u00dd\7"+
		"$\2\2\u00dd\u00e3\5&\24\2\u00de\u00df\7$\2\2\u00df\u00e3\7\60\2\2\u00e0"+
		"\u00e1\7$\2\2\u00e1\u00e3\5*\26\2\u00e2\u00dc\3\2\2\2\u00e2\u00de\3\2"+
		"\2\2\u00e2\u00e0\3\2\2\2\u00e3\25\3\2\2\2\u00e4\u00e5\7\3\2\2\u00e5\u00ed"+
		"\7/\2\2\u00e6\u00e7\7\4\2\2\u00e7\u00ed\7/\2\2\u00e8\u00e9\7\6\2\2\u00e9"+
		"\u00ed\7/\2\2\u00ea\u00eb\7\5\2\2\u00eb\u00ed\7/\2\2\u00ec\u00e4\3\2\2"+
		"\2\u00ec\u00e6\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\27"+
		"\3\2\2\2\u00ee\u00ef\7/\2\2\u00ef\u00f8\7\b\2\2\u00f0\u00f5\5T+\2\u00f1"+
		"\u00f2\7\37\2\2\u00f2\u00f4\5T+\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u00f0\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u00fb\7\t\2\2\u00fb\31\3\2\2\2\u00fc\u00fd\7\25\2\2\u00fd\u00fe"+
		"\5N(\2\u00fe\u00ff\7\34\2\2\u00ff\u0103\5L\'\2\u0100\u0102\7,\2\2\u0101"+
		"\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0113\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7\26\2\2\u0107"+
		"\u0108\7\25\2\2\u0108\u0109\5N(\2\u0109\u010a\7\34\2\2\u010a\u010e\5L"+
		"\'\2\u010b\u010d\7,\2\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0111\u0106\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0119\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7\26"+
		"\2\2\u0117\u0118\7\34\2\2\u0118\u011a\5L\'\2\u0119\u0116\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\33\3\2\2\2\u011b\u011c\7\27\2\2\u011c\u011d\5N(\2"+
		"\u011d\u011e\7\30\2\2\u011e\u011f\5L\'\2\u011f\35\3\2\2\2\u0120\u0121"+
		"\7\32\2\2\u0121\u0122\5L\'\2\u0122\u0123\7\33\2\2\u0123\u0124\5N(\2\u0124"+
		"\37\3\2\2\2\u0125\u0126\7\31\2\2\u0126\u0127\7\b\2\2\u0127\u0128\5(\25"+
		"\2\u0128\u0129\t\2\2\2\u0129\u012a\5(\25\2\u012a\u012b\7\t\2\2\u012b\u012c"+
		"\5L\'\2\u012c!\3\2\2\2\u012d\u0130\7 \2\2\u012e\u0131\5(\25\2\u012f\u0131"+
		"\5\64\33\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131\u0135\3\2\2\2"+
		"\u0132\u0134\7,\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133"+
		"\3\2\2\2\u0135\u0136\3\2\2\2\u0136#\3\2\2\2\u0137\u0135\3\2\2\2\u0138"+
		"\u013f\7/\2\2\u0139\u013a\7$\2\2\u013a\u0140\5(\25\2\u013b\u013c\7$\2"+
		"\2\u013c\u0140\7\60\2\2\u013d\u013e\7$\2\2\u013e\u0140\5*\26\2\u013f\u0139"+
		"\3\2\2\2\u013f\u013b\3\2\2\2\u013f\u013d\3\2\2\2\u0140%\3\2\2\2\u0141"+
		"\u0145\5,\27\2\u0142\u0145\5> \2\u0143\u0145\7/\2\2\u0144\u0141\3\2\2"+
		"\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145\'\3\2\2\2\u0146\u014a"+
		"\5&\24\2\u0147\u014a\5\30\r\2\u0148\u014a\7\60\2\2\u0149\u0146\3\2\2\2"+
		"\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014a)\3\2\2\2\u014b\u014f\5"+
		",\27\2\u014c\u014f\5\64\33\2\u014d\u014f\5:\36\2\u014e\u014b\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f+\3\2\2\2\u0150\u0155\5.\30\2"+
		"\u0151\u0152\t\3\2\2\u0152\u0154\5.\30\2\u0153\u0151\3\2\2\2\u0154\u0157"+
		"\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156-\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0158\u015d\5\60\31\2\u0159\u015a\t\4\2\2\u015a\u015c\5"+
		"\60\31\2\u015b\u0159\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e/\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0162\7\r\2\2"+
		"\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164"+
		"\5\62\32\2\u0164\61\3\2\2\2\u0165\u016d\5J&\2\u0166\u016d\5\30\r\2\u0167"+
		"\u016d\5> \2\u0168\u0169\7\b\2\2\u0169\u016a\5,\27\2\u016a\u016b\7\t\2"+
		"\2\u016b\u016d\3\2\2\2\u016c\u0165\3\2\2\2\u016c\u0166\3\2\2\2\u016c\u0167"+
		"\3\2\2\2\u016c\u0168\3\2\2\2\u016d\63\3\2\2\2\u016e\u016f\5\66\34\2\u016f"+
		"\65\3\2\2\2\u0170\u0172\7\20\2\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2"+
		"\2\u0172\u0173\3\2\2\2\u0173\u017b\58\35\2\u0174\u0176\t\5\2\2\u0175\u0177"+
		"\7\20\2\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2\2\2"+
		"\u0178\u017a\58\35\2\u0179\u0174\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179"+
		"\3\2\2\2\u017b\u017c\3\2\2\2\u017c\67\3\2\2\2\u017d\u017b\3\2\2\2\u017e"+
		"\u017f\5(\25\2\u017f\u0180\t\6\2\2\u0180\u0181\5(\25\2\u0181\u0189\3\2"+
		"\2\2\u0182\u0183\7\b\2\2\u0183\u0184\5\66\34\2\u0184\u0185\7\t\2\2\u0185"+
		"\u0189\3\2\2\2\u0186\u0189\5P)\2\u0187\u0189\5\30\r\2\u0188\u017e\3\2"+
		"\2\2\u0188\u0182\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0187\3\2\2\2\u0189"+
		"9\3\2\2\2\u018a\u018b\5<\37\2\u018b\u018c\7+\2\2\u018c\u018d\5<\37\2\u018d"+
		";\3\2\2\2\u018e\u018f\t\7\2\2\u018f=\3\2\2\2\u0190\u0191\7/\2\2\u0191"+
		"\u0192\7#\2\2\u0192\u0193\5,\27\2\u0193?\3\2\2\2\u0194\u0195\7/\2\2\u0195"+
		"\u0196\7#\2\2\u0196\u0197\5,\27\2\u0197\u019a\7$\2\2\u0198\u019b\5*\26"+
		"\2\u0199\u019b\7\60\2\2\u019a\u0198\3\2\2\2\u019a\u0199\3\2\2\2\u019b"+
		"A\3\2\2\2\u019c\u019d\7\'\2\2\u019d\u019e\7\b\2\2\u019e\u019f\5(\25\2"+
		"\u019f\u01a0\7\t\2\2\u01a0C\3\2\2\2\u01a1\u01a2\7(\2\2\u01a2\u01a3\7\b"+
		"\2\2\u01a3\u01a4\5(\25\2\u01a4\u01a5\7\t\2\2\u01a5E\3\2\2\2\u01a6\u01a7"+
		"\7)\2\2\u01a7\u01a8\7\b\2\2\u01a8\u01a9\5(\25\2\u01a9\u01aa\7\t\2\2\u01aa"+
		"G\3\2\2\2\u01ab\u01ac\7*\2\2\u01ac\u01ad\7\b\2\2\u01ad\u01ae\5(\25\2\u01ae"+
		"\u01af\7\t\2\2\u01afI\3\2\2\2\u01b0\u01b1\t\b\2\2\u01b1K\3\2\2\2\u01b2"+
		"\u01b6\7%\2\2\u01b3\u01b5\7,\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b8\3\2\2"+
		"\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01b6"+
		"\3\2\2\2\u01b9\u01ba\5\4\3\2\u01ba\u01bb\5\n\6\2\u01bb\u01bc\7&\2\2\u01bc"+
		"M\3\2\2\2\u01bd\u01be\7\b\2\2\u01be\u01bf\5\64\33\2\u01bf\u01c0\7\t\2"+
		"\2\u01c0O\3\2\2\2\u01c1\u01c2\t\t\2\2\u01c2Q\3\2\2\2\u01c3\u01c4\t\n\2"+
		"\2\u01c4S\3\2\2\2\u01c5\u01ca\5J&\2\u01c6\u01ca\5*\26\2\u01c7\u01ca\7"+
		"\60\2\2\u01c8\u01ca\7\21\2\2\u01c9\u01c5\3\2\2\2\u01c9\u01c6\3\2\2\2\u01c9"+
		"\u01c7\3\2\2\2\u01c9\u01c8\3\2\2\2\u01caU\3\2\2\2\62`dfmqsz~\u0080\u0087"+
		"\u008b\u008d\u009c\u00a8\u00ab\u00b8\u00bb\u00bf\u00c4\u00c9\u00ce\u00d4"+
		"\u00d6\u00e2\u00ec\u00f5\u00f8\u0103\u010e\u0113\u0119\u0130\u0135\u013f"+
		"\u0144\u0149\u014e\u0155\u015d\u0161\u016c\u0171\u0176\u017b\u0188\u019a"+
		"\u01b6\u01c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}