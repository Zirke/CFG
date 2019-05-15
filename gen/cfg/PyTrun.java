// Generated from C:/Users/Abiram Mohanaraj/Documents/GitHub/CFG/src/cfg\PyTrun.g4 by ANTLR 4.7.2
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
public class PyTrun extends Parser {
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
		TURNLEFT=38, TURNRIGHT=39, PAUSE=40, EOL=41, FNUM=42, INUM=43, ID=44, 
		TEXT=45, WS=46, COMMENT=47, LINE_COMMENT=48;
	public static final int
		RULE_start = 0, RULE_stmts = 1, RULE_stmt = 2, RULE_functiondcl = 3, RULE_dcl = 4, 
		RULE_arrdcl = 5, RULE_dclValue = 6, RULE_truedcl = 7, RULE_functioncall = 8, 
		RULE_ifstmt = 9, RULE_whilestmt = 10, RULE_repeatuntilstmt = 11, RULE_fromstmt = 12, 
		RULE_returnstmt = 13, RULE_assignment = 14, RULE_value = 15, RULE_valueorfunctioncall = 16, 
		RULE_expr = 17, RULE_arithmexpr = 18, RULE_multexpr = 19, RULE_unaryminus = 20, 
		RULE_parexpr = 21, RULE_truthexpr = 22, RULE_logicalexpr = 23, RULE_relationalexpr = 24, 
		RULE_append = 25, RULE_arrindex = 26, RULE_arradd = 27, RULE_drive = 28, 
		RULE_turnleft = 29, RULE_turnright = 30, RULE_pause = 31, RULE_nums = 32, 
		RULE_stmtblock = 33, RULE_truthpar = 34, RULE_truth = 35, RULE_type = 36, 
		RULE_types = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "stmts", "stmt", "functiondcl", "dcl", "arrdcl", "dclValue", 
			"truedcl", "functioncall", "ifstmt", "whilestmt", "repeatuntilstmt", 
			"fromstmt", "returnstmt", "assignment", "value", "valueorfunctioncall", 
			"expr", "arithmexpr", "multexpr", "unaryminus", "parexpr", "truthexpr", 
			"logicalexpr", "relationalexpr", "append", "arrindex", "arradd", "drive", 
			"turnleft", "turnright", "pause", "nums", "stmtblock", "truthpar", "truth", 
			"type", "types"
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
			"'turnright'", "'pause'"
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
			"PAUSE", "EOL", "FNUM", "INUM", "ID", "TEXT", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "PyTrun.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PyTrun(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PyTrun.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			stmts();
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(77);
				match(EOF);
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

	public static class StmtsContext extends ParserRuleContext {
		public List<TerminalNode> EOL() { return getTokens(PyTrun.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(PyTrun.EOL, i);
		}
		public List<DclContext> dcl() {
			return getRuleContexts(DclContext.class);
		}
		public DclContext dcl(int i) {
			return getRuleContext(DclContext.class,i);
		}
		public List<ArrdclContext> arrdcl() {
			return getRuleContexts(ArrdclContext.class);
		}
		public ArrdclContext arrdcl(int i) {
			return getRuleContext(ArrdclContext.class,i);
		}
		public List<FunctiondclContext> functiondcl() {
			return getRuleContexts(FunctiondclContext.class);
		}
		public FunctiondclContext functiondcl(int i) {
			return getRuleContext(FunctiondclContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmts);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80);
					match(EOL);
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86);
					dcl();
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92);
					arrdcl();
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(98);
				functiondcl();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FROM) | (1L << REPEAT) | (1L << RETURN) | (1L << DRIVE) | (1L << TURNLEFT) | (1L << TURNRIGHT) | (1L << PAUSE) | (1L << EOL) | (1L << ID))) != 0)) {
				{
				{
				setState(104);
				stmt();
				}
				}
				setState(109);
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
		public TerminalNode EOL() { return getToken(PyTrun.EOL, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				ifstmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				whilestmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				returnstmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				functioncall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				repeatuntilstmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				fromstmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(116);
				assignment();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(117);
				arradd();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(118);
				arrindex();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(119);
				drive();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(120);
				turnleft();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(121);
				turnright();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(122);
				pause();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(123);
				match(EOL);
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
		public TerminalNode FUNCTION() { return getToken(PyTrun.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(PyTrun.ID, 0); }
		public TerminalNode RETURNS() { return getToken(PyTrun.RETURNS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(PyTrun.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PyTrun.RPAR, 0); }
		public StmtblockContext stmtblock() {
			return getRuleContext(StmtblockContext.class,0);
		}
		public List<TruedclContext> truedcl() {
			return getRuleContexts(TruedclContext.class);
		}
		public TruedclContext truedcl(int i) {
			return getRuleContext(TruedclContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PyTrun.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PyTrun.COMMA, i);
		}
		public FunctiondclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterFunctiondcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitFunctiondcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitFunctiondcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondclContext functiondcl() throws RecognitionException {
		FunctiondclContext _localctx = new FunctiondclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functiondcl);
		int _la;
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(FUNCTION);
				setState(127);
				match(ID);
				setState(128);
				match(RETURNS);
				setState(129);
				type();
				setState(130);
				match(LPAR);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTDCL) | (1L << FLOATDCL) | (1L << TRUTHDCL) | (1L << TEXTDCL))) != 0)) {
					{
					setState(131);
					truedcl();
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(132);
						match(COMMA);
						setState(133);
						truedcl();
						}
						}
						setState(138);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(141);
				match(RPAR);
				setState(142);
				stmtblock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(FUNCTION);
				setState(145);
				match(ID);
				setState(146);
				match(LPAR);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTDCL) | (1L << FLOATDCL) | (1L << TRUTHDCL) | (1L << TEXTDCL))) != 0)) {
					{
					setState(147);
					truedcl();
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(148);
						match(COMMA);
						setState(149);
						truedcl();
						}
						}
						setState(154);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(157);
				match(RPAR);
				setState(158);
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
		public TerminalNode INTDCL() { return getToken(PyTrun.INTDCL, 0); }
		public TerminalNode ID() { return getToken(PyTrun.ID, 0); }
		public DclValueContext dclValue() {
			return getRuleContext(DclValueContext.class,0);
		}
		public TerminalNode FLOATDCL() { return getToken(PyTrun.FLOATDCL, 0); }
		public TerminalNode TEXTDCL() { return getToken(PyTrun.TEXTDCL, 0); }
		public TerminalNode TRUTHDCL() { return getToken(PyTrun.TRUTHDCL, 0); }
		public TerminalNode ASSIGN() { return getToken(PyTrun.ASSIGN, 0); }
		public TruthexprContext truthexpr() {
			return getRuleContext(TruthexprContext.class,0);
		}
		public TerminalNode EOL() { return getToken(PyTrun.EOL, 0); }
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dcl);
		int _la;
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTDCL:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(INTDCL);
				setState(162);
				match(ID);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(163);
					dclValue();
					}
				}

				}
				break;
			case FLOATDCL:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(FLOATDCL);
				setState(167);
				match(ID);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(168);
					dclValue();
					}
				}

				}
				break;
			case TEXTDCL:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(TEXTDCL);
				setState(172);
				match(ID);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(173);
					dclValue();
					}
				}

				}
				break;
			case TRUTHDCL:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				match(TRUTHDCL);
				setState(177);
				match(ID);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(178);
					match(ASSIGN);
					setState(179);
					truthexpr();
					}
				}

				}
				break;
			case EOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				match(EOL);
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
		public TerminalNode ARRDCL() { return getToken(PyTrun.ARRDCL, 0); }
		public TerminalNode ID() { return getToken(PyTrun.ID, 0); }
		public TerminalNode EOL() { return getToken(PyTrun.EOL, 0); }
		public ArrdclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrdcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterArrdcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitArrdcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitArrdcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrdclContext arrdcl() throws RecognitionException {
		ArrdclContext _localctx = new ArrdclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrdcl);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTDCL:
			case FLOATDCL:
			case TRUTHDCL:
			case TEXTDCL:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				type();
				setState(186);
				match(ARRDCL);
				setState(187);
				match(ID);
				}
				break;
			case EOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(EOL);
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

	public static class DclValueContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(PyTrun.ASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(PyTrun.TEXT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DclValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dclValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterDclValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitDclValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitDclValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclValueContext dclValue() throws RecognitionException {
		DclValueContext _localctx = new DclValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dclValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(192);
				match(ASSIGN);
				setState(193);
				value();
				}
				break;
			case 2:
				{
				setState(194);
				match(ASSIGN);
				setState(195);
				match(TEXT);
				}
				break;
			case 3:
				{
				setState(196);
				match(ASSIGN);
				setState(197);
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

	public static class TruedclContext extends ParserRuleContext {
		public TerminalNode INTDCL() { return getToken(PyTrun.INTDCL, 0); }
		public TerminalNode ID() { return getToken(PyTrun.ID, 0); }
		public TerminalNode FLOATDCL() { return getToken(PyTrun.FLOATDCL, 0); }
		public TerminalNode TEXTDCL() { return getToken(PyTrun.TEXTDCL, 0); }
		public TerminalNode TRUTHDCL() { return getToken(PyTrun.TRUTHDCL, 0); }
		public TruedclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truedcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterTruedcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitTruedcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitTruedcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruedclContext truedcl() throws RecognitionException {
		TruedclContext _localctx = new TruedclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_truedcl);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTDCL:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(INTDCL);
				setState(201);
				match(ID);
				}
				break;
			case FLOATDCL:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(FLOATDCL);
				setState(203);
				match(ID);
				}
				break;
			case TEXTDCL:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(TEXTDCL);
				setState(205);
				match(ID);
				}
				break;
			case TRUTHDCL:
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				match(TRUTHDCL);
				setState(207);
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
		public TerminalNode ID() { return getToken(PyTrun.ID, 0); }
		public TerminalNode LPAR() { return getToken(PyTrun.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PyTrun.RPAR, 0); }
		public List<TypesContext> types() {
			return getRuleContexts(TypesContext.class);
		}
		public TypesContext types(int i) {
			return getRuleContext(TypesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PyTrun.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PyTrun.COMMA, i);
		}
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitFunctioncall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functioncall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(ID);
			setState(211);
			match(LPAR);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUTHVAL) | (1L << FNUM) | (1L << INUM) | (1L << ID) | (1L << TEXT))) != 0)) {
				{
				setState(212);
				types();
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(213);
					match(COMMA);
					setState(214);
					types();
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(222);
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
		public List<TerminalNode> IF() { return getTokens(PyTrun.IF); }
		public TerminalNode IF(int i) {
			return getToken(PyTrun.IF, i);
		}
		public List<TruthparContext> truthpar() {
			return getRuleContexts(TruthparContext.class);
		}
		public TruthparContext truthpar(int i) {
			return getRuleContext(TruthparContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(PyTrun.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(PyTrun.THEN, i);
		}
		public List<StmtblockContext> stmtblock() {
			return getRuleContexts(StmtblockContext.class);
		}
		public StmtblockContext stmtblock(int i) {
			return getRuleContext(StmtblockContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(PyTrun.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(PyTrun.EOL, i);
		}
		public List<TerminalNode> ELSE() { return getTokens(PyTrun.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(PyTrun.ELSE, i);
		}
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitIfstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitIfstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifstmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(IF);
			setState(225);
			truthpar();
			setState(226);
			match(THEN);
			setState(227);
			stmtblock();
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(228);
					match(EOL);
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(234);
					match(ELSE);
					setState(235);
					match(IF);
					setState(236);
					truthpar();
					setState(237);
					match(THEN);
					setState(238);
					stmtblock();
					setState(242);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(239);
							match(EOL);
							}
							} 
						}
						setState(244);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					}
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(250);
				match(ELSE);
				setState(251);
				match(THEN);
				setState(252);
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
		public TerminalNode WHILE() { return getToken(PyTrun.WHILE, 0); }
		public TruthparContext truthpar() {
			return getRuleContext(TruthparContext.class,0);
		}
		public TerminalNode DO() { return getToken(PyTrun.DO, 0); }
		public StmtblockContext stmtblock() {
			return getRuleContext(StmtblockContext.class,0);
		}
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterWhilestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitWhilestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitWhilestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(WHILE);
			setState(256);
			truthpar();
			setState(257);
			match(DO);
			setState(258);
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
		public TerminalNode REPEAT() { return getToken(PyTrun.REPEAT, 0); }
		public StmtblockContext stmtblock() {
			return getRuleContext(StmtblockContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(PyTrun.UNTIL, 0); }
		public TruthparContext truthpar() {
			return getRuleContext(TruthparContext.class,0);
		}
		public RepeatuntilstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatuntilstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterRepeatuntilstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitRepeatuntilstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitRepeatuntilstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatuntilstmtContext repeatuntilstmt() throws RecognitionException {
		RepeatuntilstmtContext _localctx = new RepeatuntilstmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_repeatuntilstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(REPEAT);
			setState(261);
			stmtblock();
			setState(262);
			match(UNTIL);
			setState(263);
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
		public TerminalNode FROM() { return getToken(PyTrun.FROM, 0); }
		public TerminalNode LPAR() { return getToken(PyTrun.LPAR, 0); }
		public List<ValueorfunctioncallContext> valueorfunctioncall() {
			return getRuleContexts(ValueorfunctioncallContext.class);
		}
		public ValueorfunctioncallContext valueorfunctioncall(int i) {
			return getRuleContext(ValueorfunctioncallContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(PyTrun.RPAR, 0); }
		public StmtblockContext stmtblock() {
			return getRuleContext(StmtblockContext.class,0);
		}
		public TerminalNode UPTO() { return getToken(PyTrun.UPTO, 0); }
		public TerminalNode DOWNTO() { return getToken(PyTrun.DOWNTO, 0); }
		public FromstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterFromstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitFromstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitFromstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromstmtContext fromstmt() throws RecognitionException {
		FromstmtContext _localctx = new FromstmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fromstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(FROM);
			setState(266);
			match(LPAR);
			setState(267);
			valueorfunctioncall();
			setState(268);
			_la = _input.LA(1);
			if ( !(_la==UPTO || _la==DOWNTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(269);
			valueorfunctioncall();
			setState(270);
			match(RPAR);
			setState(271);
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
		public TerminalNode RETURN() { return getToken(PyTrun.RETURN, 0); }
		public ValueorfunctioncallContext valueorfunctioncall() {
			return getRuleContext(ValueorfunctioncallContext.class,0);
		}
		public TruthexprContext truthexpr() {
			return getRuleContext(TruthexprContext.class,0);
		}
		public List<TerminalNode> EOL() { return getTokens(PyTrun.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(PyTrun.EOL, i);
		}
		public ReturnstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterReturnstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitReturnstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitReturnstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnstmtContext returnstmt() throws RecognitionException {
		ReturnstmtContext _localctx = new ReturnstmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnstmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(RETURN);
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(274);
				valueorfunctioncall();
				}
				break;
			case 2:
				{
				setState(275);
				truthexpr();
				}
				break;
			}
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(278);
					match(EOL);
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		public TerminalNode ID() { return getToken(PyTrun.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(PyTrun.ASSIGN, 0); }
		public ValueorfunctioncallContext valueorfunctioncall() {
			return getRuleContext(ValueorfunctioncallContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(PyTrun.TEXT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(ID);
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(285);
				match(ASSIGN);
				setState(286);
				valueorfunctioncall();
				}
				break;
			case 2:
				{
				setState(287);
				match(ASSIGN);
				setState(288);
				match(TEXT);
				}
				break;
			case 3:
				{
				setState(289);
				match(ASSIGN);
				setState(290);
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
		public TerminalNode ID() { return getToken(PyTrun.ID, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_value);
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				arithmexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				arrindex();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
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

	public static class ValueorfunctioncallContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(PyTrun.TEXT, 0); }
		public ValueorfunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueorfunctioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterValueorfunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitValueorfunctioncall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitValueorfunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueorfunctioncallContext valueorfunctioncall() throws RecognitionException {
		ValueorfunctioncallContext _localctx = new ValueorfunctioncallContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_valueorfunctioncall);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				functioncall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
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
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr);
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				arithmexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				truthexpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
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
		public List<TerminalNode> PLUS() { return getTokens(PyTrun.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(PyTrun.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(PyTrun.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(PyTrun.MINUS, i);
		}
		public ArithmexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterArithmexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitArithmexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitArithmexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmexprContext arithmexpr() throws RecognitionException {
		ArithmexprContext _localctx = new ArithmexprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arithmexpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			multexpr();
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(309);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(310);
					multexpr();
					}
					} 
				}
				setState(315);
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

	public static class MultexprContext extends ParserRuleContext {
		public List<UnaryminusContext> unaryminus() {
			return getRuleContexts(UnaryminusContext.class);
		}
		public UnaryminusContext unaryminus(int i) {
			return getRuleContext(UnaryminusContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(PyTrun.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(PyTrun.TIMES, i);
		}
		public List<TerminalNode> DIVIDES() { return getTokens(PyTrun.DIVIDES); }
		public TerminalNode DIVIDES(int i) {
			return getToken(PyTrun.DIVIDES, i);
		}
		public MultexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterMultexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitMultexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitMultexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultexprContext multexpr() throws RecognitionException {
		MultexprContext _localctx = new MultexprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multexpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			unaryminus();
			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(317);
					_la = _input.LA(1);
					if ( !(_la==TIMES || _la==DIVIDES) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(318);
					unaryminus();
					}
					} 
				}
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		public TerminalNode MINUS() { return getToken(PyTrun.MINUS, 0); }
		public UnaryminusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryminus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterUnaryminus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitUnaryminus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitUnaryminus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryminusContext unaryminus() throws RecognitionException {
		UnaryminusContext _localctx = new UnaryminusContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unaryminus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(324);
				match(MINUS);
				}
			}

			setState(327);
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
		public TerminalNode LPAR() { return getToken(PyTrun.LPAR, 0); }
		public ArithmexprContext arithmexpr() {
			return getRuleContext(ArithmexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PyTrun.RPAR, 0); }
		public ParexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterParexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitParexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitParexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParexprContext parexpr() throws RecognitionException {
		ParexprContext _localctx = new ParexprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parexpr);
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				nums();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				functioncall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				arrindex();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(332);
				match(LPAR);
				setState(333);
				arithmexpr();
				setState(334);
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
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterTruthexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitTruthexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitTruthexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruthexprContext truthexpr() throws RecognitionException {
		TruthexprContext _localctx = new TruthexprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_truthexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
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
		public List<TerminalNode> NOT() { return getTokens(PyTrun.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(PyTrun.NOT, i);
		}
		public List<TerminalNode> OR() { return getTokens(PyTrun.OR); }
		public TerminalNode OR(int i) {
			return getToken(PyTrun.OR, i);
		}
		public List<TerminalNode> AND() { return getTokens(PyTrun.AND); }
		public TerminalNode AND(int i) {
			return getToken(PyTrun.AND, i);
		}
		public LogicalexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterLogicalexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitLogicalexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitLogicalexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalexprContext logicalexpr() throws RecognitionException {
		LogicalexprContext _localctx = new LogicalexprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_logicalexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(340);
				match(NOT);
				}
			}

			setState(343);
			relationalexpr();
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(344);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(345);
					match(NOT);
					}
				}

				setState(348);
				relationalexpr();
				}
				}
				setState(353);
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
		public List<ValueorfunctioncallContext> valueorfunctioncall() {
			return getRuleContexts(ValueorfunctioncallContext.class);
		}
		public ValueorfunctioncallContext valueorfunctioncall(int i) {
			return getRuleContext(ValueorfunctioncallContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(PyTrun.EQUALS, 0); }
		public TerminalNode GRTHAN() { return getToken(PyTrun.GRTHAN, 0); }
		public TerminalNode LESSTHAN() { return getToken(PyTrun.LESSTHAN, 0); }
		public TerminalNode LPAR() { return getToken(PyTrun.LPAR, 0); }
		public LogicalexprContext logicalexpr() {
			return getRuleContext(LogicalexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PyTrun.RPAR, 0); }
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
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterRelationalexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitRelationalexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitRelationalexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalexprContext relationalexpr() throws RecognitionException {
		RelationalexprContext _localctx = new RelationalexprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_relationalexpr);
		int _la;
		try {
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				valueorfunctioncall();
				{
				setState(355);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << GRTHAN) | (1L << LESSTHAN))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(356);
				valueorfunctioncall();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				match(LPAR);
				setState(359);
				logicalexpr();
				setState(360);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
				truth();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
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
		public TerminalNode PLUS() { return getToken(PyTrun.PLUS, 0); }
		public List<TerminalNode> TEXT() { return getTokens(PyTrun.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(PyTrun.TEXT, i);
		}
		public List<TerminalNode> ID() { return getTokens(PyTrun.ID); }
		public TerminalNode ID(int i) {
			return getToken(PyTrun.ID, i);
		}
		public AppendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_append; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterAppend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitAppend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitAppend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendContext append() throws RecognitionException {
		AppendContext _localctx = new AppendContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_append);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(367);
			match(PLUS);
			setState(368);
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
		public TerminalNode ID() { return getToken(PyTrun.ID, 0); }
		public TerminalNode ELEMENT() { return getToken(PyTrun.ELEMENT, 0); }
		public ArithmexprContext arithmexpr() {
			return getRuleContext(ArithmexprContext.class,0);
		}
		public ArrindexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrindex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterArrindex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitArrindex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitArrindex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrindexContext arrindex() throws RecognitionException {
		ArrindexContext _localctx = new ArrindexContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arrindex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(ID);
			setState(371);
			match(ELEMENT);
			setState(372);
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
		public TerminalNode ID() { return getToken(PyTrun.ID, 0); }
		public TerminalNode ELEMENT() { return getToken(PyTrun.ELEMENT, 0); }
		public ArithmexprContext arithmexpr() {
			return getRuleContext(ArithmexprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PyTrun.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArraddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arradd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterArradd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitArradd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitArradd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraddContext arradd() throws RecognitionException {
		ArraddContext _localctx = new ArraddContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arradd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(ID);
			setState(375);
			match(ELEMENT);
			setState(376);
			arithmexpr();
			setState(377);
			match(ASSIGN);
			setState(378);
			expr();
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
		public TerminalNode DRIVE() { return getToken(PyTrun.DRIVE, 0); }
		public TerminalNode LPAR() { return getToken(PyTrun.LPAR, 0); }
		public ValueorfunctioncallContext valueorfunctioncall() {
			return getRuleContext(ValueorfunctioncallContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PyTrun.RPAR, 0); }
		public DriveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterDrive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitDrive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitDrive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DriveContext drive() throws RecognitionException {
		DriveContext _localctx = new DriveContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_drive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(DRIVE);
			setState(381);
			match(LPAR);
			setState(382);
			valueorfunctioncall();
			setState(383);
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
		public TerminalNode TURNLEFT() { return getToken(PyTrun.TURNLEFT, 0); }
		public TerminalNode LPAR() { return getToken(PyTrun.LPAR, 0); }
		public ValueorfunctioncallContext valueorfunctioncall() {
			return getRuleContext(ValueorfunctioncallContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PyTrun.RPAR, 0); }
		public TurnleftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turnleft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterTurnleft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitTurnleft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitTurnleft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TurnleftContext turnleft() throws RecognitionException {
		TurnleftContext _localctx = new TurnleftContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_turnleft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(TURNLEFT);
			setState(386);
			match(LPAR);
			setState(387);
			valueorfunctioncall();
			setState(388);
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
		public TerminalNode TURNRIGHT() { return getToken(PyTrun.TURNRIGHT, 0); }
		public TerminalNode LPAR() { return getToken(PyTrun.LPAR, 0); }
		public ValueorfunctioncallContext valueorfunctioncall() {
			return getRuleContext(ValueorfunctioncallContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PyTrun.RPAR, 0); }
		public TurnrightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turnright; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterTurnright(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitTurnright(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitTurnright(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TurnrightContext turnright() throws RecognitionException {
		TurnrightContext _localctx = new TurnrightContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_turnright);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(TURNRIGHT);
			setState(391);
			match(LPAR);
			setState(392);
			valueorfunctioncall();
			setState(393);
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
		public TerminalNode PAUSE() { return getToken(PyTrun.PAUSE, 0); }
		public TerminalNode LPAR() { return getToken(PyTrun.LPAR, 0); }
		public ValueorfunctioncallContext valueorfunctioncall() {
			return getRuleContext(ValueorfunctioncallContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PyTrun.RPAR, 0); }
		public PauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterPause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitPause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitPause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PauseContext pause() throws RecognitionException {
		PauseContext _localctx = new PauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_pause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(PAUSE);
			setState(396);
			match(LPAR);
			setState(397);
			valueorfunctioncall();
			setState(398);
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
		public TerminalNode INUM() { return getToken(PyTrun.INUM, 0); }
		public TerminalNode FNUM() { return getToken(PyTrun.FNUM, 0); }
		public TerminalNode ID() { return getToken(PyTrun.ID, 0); }
		public NumsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nums; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterNums(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitNums(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitNums(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumsContext nums() throws RecognitionException {
		NumsContext _localctx = new NumsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_nums);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
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
		public TerminalNode LCB() { return getToken(PyTrun.LCB, 0); }
		public TerminalNode RCB() { return getToken(PyTrun.RCB, 0); }
		public List<TerminalNode> EOL() { return getTokens(PyTrun.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(PyTrun.EOL, i);
		}
		public List<DclContext> dcl() {
			return getRuleContexts(DclContext.class);
		}
		public DclContext dcl(int i) {
			return getRuleContext(DclContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterStmtblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitStmtblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitStmtblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtblockContext stmtblock() throws RecognitionException {
		StmtblockContext _localctx = new StmtblockContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_stmtblock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(LCB);
			setState(406);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(403);
					match(EOL);
					}
					} 
				}
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			setState(412);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(409);
					dcl();
					}
					} 
				}
				setState(414);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FROM) | (1L << REPEAT) | (1L << RETURN) | (1L << DRIVE) | (1L << TURNLEFT) | (1L << TURNRIGHT) | (1L << PAUSE) | (1L << EOL) | (1L << ID))) != 0)) {
				{
				{
				setState(415);
				stmt();
				}
				}
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(421);
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
		public TerminalNode LPAR() { return getToken(PyTrun.LPAR, 0); }
		public TruthexprContext truthexpr() {
			return getRuleContext(TruthexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PyTrun.RPAR, 0); }
		public TruthparContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truthpar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterTruthpar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitTruthpar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitTruthpar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruthparContext truthpar() throws RecognitionException {
		TruthparContext _localctx = new TruthparContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_truthpar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(LPAR);
			setState(424);
			truthexpr();
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

	public static class TruthContext extends ParserRuleContext {
		public TerminalNode TRUTHVAL() { return getToken(PyTrun.TRUTHVAL, 0); }
		public TerminalNode ID() { return getToken(PyTrun.ID, 0); }
		public TruthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterTruth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitTruth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitTruth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruthContext truth() throws RecognitionException {
		TruthContext _localctx = new TruthContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_truth);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
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
		public TerminalNode INTDCL() { return getToken(PyTrun.INTDCL, 0); }
		public TerminalNode FLOATDCL() { return getToken(PyTrun.FLOATDCL, 0); }
		public TerminalNode TRUTHDCL() { return getToken(PyTrun.TRUTHDCL, 0); }
		public TerminalNode TEXTDCL() { return getToken(PyTrun.TEXTDCL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
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

	public static class TypesContext extends ParserRuleContext {
		public NumsContext nums() {
			return getRuleContext(NumsContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(PyTrun.TEXT, 0); }
		public TerminalNode TRUTHVAL() { return getToken(PyTrun.TRUTHVAL, 0); }
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_types);
		try {
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FNUM:
			case INUM:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				nums();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				match(TEXT);
				}
				break;
			case TRUTHVAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(433);
				match(TRUTHVAL);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u01b7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\5\2Q\n\2\3\3\7\3T"+
		"\n\3\f\3\16\3W\13\3\3\3\7\3Z\n\3\f\3\16\3]\13\3\3\3\7\3`\n\3\f\3\16\3"+
		"c\13\3\3\3\7\3f\n\3\f\3\16\3i\13\3\3\3\7\3l\n\3\f\3\16\3o\13\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\177\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5\u0089\n\5\f\5\16\5\u008c\13\5\5\5\u008e\n\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0099\n\5\f\5\16\5\u009c\13\5"+
		"\5\5\u009e\n\5\3\5\3\5\5\5\u00a2\n\5\3\6\3\6\3\6\5\6\u00a7\n\6\3\6\3\6"+
		"\3\6\5\6\u00ac\n\6\3\6\3\6\3\6\5\6\u00b1\n\6\3\6\3\6\3\6\3\6\5\6\u00b7"+
		"\n\6\3\6\5\6\u00ba\n\6\3\7\3\7\3\7\3\7\3\7\5\7\u00c1\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u00c9\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d3\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\7\n\u00da\n\n\f\n\16\n\u00dd\13\n\5\n\u00df\n\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u00e8\n\13\f\13\16\13\u00eb\13\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00f3\n\13\f\13\16\13\u00f6\13\13"+
		"\7\13\u00f8\n\13\f\13\16\13\u00fb\13\13\3\13\3\13\3\13\5\13\u0100\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\5\17\u0117\n\17\3\17\7\17\u011a\n\17\f\17\16"+
		"\17\u011d\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0126\n\20\3\21"+
		"\3\21\3\21\5\21\u012b\n\21\3\22\3\22\3\22\5\22\u0130\n\22\3\23\3\23\3"+
		"\23\5\23\u0135\n\23\3\24\3\24\3\24\7\24\u013a\n\24\f\24\16\24\u013d\13"+
		"\24\3\25\3\25\3\25\7\25\u0142\n\25\f\25\16\25\u0145\13\25\3\26\5\26\u0148"+
		"\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0153\n\27\3\30"+
		"\3\30\3\31\5\31\u0158\n\31\3\31\3\31\3\31\5\31\u015d\n\31\3\31\7\31\u0160"+
		"\n\31\f\31\16\31\u0163\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\5\32\u016f\n\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3#\3#\7#\u0197\n#\f#\16#\u019a"+
		"\13#\3#\7#\u019d\n#\f#\16#\u01a0\13#\3#\7#\u01a3\n#\f#\16#\u01a6\13#\3"+
		"#\3#\3$\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\5\'\u01b5\n\'\3\'\2\2(\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\13"+
		"\3\2\35\36\3\2\f\r\3\2\n\13\3\2\16\17\3\2\22\24\3\2./\3\2,.\4\2\21\21"+
		"..\3\2\3\6\2\u01d7\2N\3\2\2\2\4U\3\2\2\2\6~\3\2\2\2\b\u00a1\3\2\2\2\n"+
		"\u00b9\3\2\2\2\f\u00c0\3\2\2\2\16\u00c8\3\2\2\2\20\u00d2\3\2\2\2\22\u00d4"+
		"\3\2\2\2\24\u00e2\3\2\2\2\26\u0101\3\2\2\2\30\u0106\3\2\2\2\32\u010b\3"+
		"\2\2\2\34\u0113\3\2\2\2\36\u011e\3\2\2\2 \u012a\3\2\2\2\"\u012f\3\2\2"+
		"\2$\u0134\3\2\2\2&\u0136\3\2\2\2(\u013e\3\2\2\2*\u0147\3\2\2\2,\u0152"+
		"\3\2\2\2.\u0154\3\2\2\2\60\u0157\3\2\2\2\62\u016e\3\2\2\2\64\u0170\3\2"+
		"\2\2\66\u0174\3\2\2\28\u0178\3\2\2\2:\u017e\3\2\2\2<\u0183\3\2\2\2>\u0188"+
		"\3\2\2\2@\u018d\3\2\2\2B\u0192\3\2\2\2D\u0194\3\2\2\2F\u01a9\3\2\2\2H"+
		"\u01ad\3\2\2\2J\u01af\3\2\2\2L\u01b4\3\2\2\2NP\5\4\3\2OQ\7\2\2\3PO\3\2"+
		"\2\2PQ\3\2\2\2Q\3\3\2\2\2RT\7+\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2"+
		"\2\2V[\3\2\2\2WU\3\2\2\2XZ\5\n\6\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3"+
		"\2\2\2\\a\3\2\2\2][\3\2\2\2^`\5\f\7\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab"+
		"\3\2\2\2bg\3\2\2\2ca\3\2\2\2df\5\b\5\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2g"+
		"h\3\2\2\2hm\3\2\2\2ig\3\2\2\2jl\5\6\4\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2"+
		"mn\3\2\2\2n\5\3\2\2\2om\3\2\2\2p\177\5\24\13\2q\177\5\26\f\2r\177\5\34"+
		"\17\2s\177\5\22\n\2t\177\5\30\r\2u\177\5\32\16\2v\177\5\36\20\2w\177\5"+
		"8\35\2x\177\5\66\34\2y\177\5:\36\2z\177\5<\37\2{\177\5> \2|\177\5@!\2"+
		"}\177\7+\2\2~p\3\2\2\2~q\3\2\2\2~r\3\2\2\2~s\3\2\2\2~t\3\2\2\2~u\3\2\2"+
		"\2~v\3\2\2\2~w\3\2\2\2~x\3\2\2\2~y\3\2\2\2~z\3\2\2\2~{\3\2\2\2~|\3\2\2"+
		"\2~}\3\2\2\2\177\7\3\2\2\2\u0080\u0081\7\"\2\2\u0081\u0082\7.\2\2\u0082"+
		"\u0083\7!\2\2\u0083\u0084\5J&\2\u0084\u008d\7\b\2\2\u0085\u008a\5\20\t"+
		"\2\u0086\u0087\7\37\2\2\u0087\u0089\5\20\t\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008e\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008d\u0085\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\7\t\2\2\u0090\u0091\5D#\2\u0091\u00a2\3\2\2"+
		"\2\u0092\u0093\7\"\2\2\u0093\u0094\7.\2\2\u0094\u009d\7\b\2\2\u0095\u009a"+
		"\5\20\t\2\u0096\u0097\7\37\2\2\u0097\u0099\5\20\t\2\u0098\u0096\3\2\2"+
		"\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009e"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u0095\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a0\7\t\2\2\u00a0\u00a2\5D#\2\u00a1\u0080\3\2\2"+
		"\2\u00a1\u0092\3\2\2\2\u00a2\t\3\2\2\2\u00a3\u00a4\7\3\2\2\u00a4\u00a6"+
		"\7.\2\2\u00a5\u00a7\5\16\b\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00ba\3\2\2\2\u00a8\u00a9\7\4\2\2\u00a9\u00ab\7.\2\2\u00aa\u00ac\5\16"+
		"\b\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ba\3\2\2\2\u00ad"+
		"\u00ae\7\6\2\2\u00ae\u00b0\7.\2\2\u00af\u00b1\5\16\b\2\u00b0\u00af\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00ba\3\2\2\2\u00b2\u00b3\7\5\2\2\u00b3"+
		"\u00b6\7.\2\2\u00b4\u00b5\7$\2\2\u00b5\u00b7\5.\30\2\u00b6\u00b4\3\2\2"+
		"\2\u00b6\u00b7\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00ba\7+\2\2\u00b9\u00a3"+
		"\3\2\2\2\u00b9\u00a8\3\2\2\2\u00b9\u00ad\3\2\2\2\u00b9\u00b2\3\2\2\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\13\3\2\2\2\u00bb\u00bc\5J&\2\u00bc\u00bd\7\7\2\2"+
		"\u00bd\u00be\7.\2\2\u00be\u00c1\3\2\2\2\u00bf\u00c1\7+\2\2\u00c0\u00bb"+
		"\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\r\3\2\2\2\u00c2\u00c3\7$\2\2\u00c3"+
		"\u00c9\5 \21\2\u00c4\u00c5\7$\2\2\u00c5\u00c9\7/\2\2\u00c6\u00c7\7$\2"+
		"\2\u00c7\u00c9\5$\23\2\u00c8\u00c2\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c8\u00c6"+
		"\3\2\2\2\u00c9\17\3\2\2\2\u00ca\u00cb\7\3\2\2\u00cb\u00d3\7.\2\2\u00cc"+
		"\u00cd\7\4\2\2\u00cd\u00d3\7.\2\2\u00ce\u00cf\7\6\2\2\u00cf\u00d3\7.\2"+
		"\2\u00d0\u00d1\7\5\2\2\u00d1\u00d3\7.\2\2\u00d2\u00ca\3\2\2\2\u00d2\u00cc"+
		"\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\21\3\2\2\2\u00d4"+
		"\u00d5\7.\2\2\u00d5\u00de\7\b\2\2\u00d6\u00db\5L\'\2\u00d7\u00d8\7\37"+
		"\2\2\u00d8\u00da\5L\'\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00de\u00d6\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\7\t\2\2\u00e1\23\3\2\2\2\u00e2\u00e3\7\25\2\2\u00e3\u00e4\5F$\2"+
		"\u00e4\u00e5\7\34\2\2\u00e5\u00e9\5D#\2\u00e6\u00e8\7+\2\2\u00e7\u00e6"+
		"\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00f9\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\7\26\2\2\u00ed\u00ee\7"+
		"\25\2\2\u00ee\u00ef\5F$\2\u00ef\u00f0\7\34\2\2\u00f0\u00f4\5D#\2\u00f1"+
		"\u00f3\7+\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7"+
		"\u00ec\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u00ff\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\7\26\2\2\u00fd"+
		"\u00fe\7\34\2\2\u00fe\u0100\5D#\2\u00ff\u00fc\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\25\3\2\2\2\u0101\u0102\7\27\2\2\u0102\u0103\5F$\2\u0103\u0104"+
		"\7\30\2\2\u0104\u0105\5D#\2\u0105\27\3\2\2\2\u0106\u0107\7\32\2\2\u0107"+
		"\u0108\5D#\2\u0108\u0109\7\33\2\2\u0109\u010a\5F$\2\u010a\31\3\2\2\2\u010b"+
		"\u010c\7\31\2\2\u010c\u010d\7\b\2\2\u010d\u010e\5\"\22\2\u010e\u010f\t"+
		"\2\2\2\u010f\u0110\5\"\22\2\u0110\u0111\7\t\2\2\u0111\u0112\5D#\2\u0112"+
		"\33\3\2\2\2\u0113\u0116\7 \2\2\u0114\u0117\5\"\22\2\u0115\u0117\5.\30"+
		"\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117\u011b\3\2\2\2\u0118\u011a"+
		"\7+\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\35\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0125\7.\2\2"+
		"\u011f\u0120\7$\2\2\u0120\u0126\5\"\22\2\u0121\u0122\7$\2\2\u0122\u0126"+
		"\7/\2\2\u0123\u0124\7$\2\2\u0124\u0126\5$\23\2\u0125\u011f\3\2\2\2\u0125"+
		"\u0121\3\2\2\2\u0125\u0123\3\2\2\2\u0126\37\3\2\2\2\u0127\u012b\5&\24"+
		"\2\u0128\u012b\5\66\34\2\u0129\u012b\7.\2\2\u012a\u0127\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b!\3\2\2\2\u012c\u0130\5 \21\2"+
		"\u012d\u0130\5\22\n\2\u012e\u0130\7/\2\2\u012f\u012c\3\2\2\2\u012f\u012d"+
		"\3\2\2\2\u012f\u012e\3\2\2\2\u0130#\3\2\2\2\u0131\u0135\5&\24\2\u0132"+
		"\u0135\5.\30\2\u0133\u0135\5\64\33\2\u0134\u0131\3\2\2\2\u0134\u0132\3"+
		"\2\2\2\u0134\u0133\3\2\2\2\u0135%\3\2\2\2\u0136\u013b\5(\25\2\u0137\u0138"+
		"\t\3\2\2\u0138\u013a\5(\25\2\u0139\u0137\3\2\2\2\u013a\u013d\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\'\3\2\2\2\u013d\u013b\3\2\2\2"+
		"\u013e\u0143\5*\26\2\u013f\u0140\t\4\2\2\u0140\u0142\5*\26\2\u0141\u013f"+
		"\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		")\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0148\7\r\2\2\u0147\u0146\3\2\2\2"+
		"\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\5,\27\2\u014a+\3"+
		"\2\2\2\u014b\u0153\5B\"\2\u014c\u0153\5\22\n\2\u014d\u0153\5\66\34\2\u014e"+
		"\u014f\7\b\2\2\u014f\u0150\5&\24\2\u0150\u0151\7\t\2\2\u0151\u0153\3\2"+
		"\2\2\u0152\u014b\3\2\2\2\u0152\u014c\3\2\2\2\u0152\u014d\3\2\2\2\u0152"+
		"\u014e\3\2\2\2\u0153-\3\2\2\2\u0154\u0155\5\60\31\2\u0155/\3\2\2\2\u0156"+
		"\u0158\7\20\2\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3"+
		"\2\2\2\u0159\u0161\5\62\32\2\u015a\u015c\t\5\2\2\u015b\u015d\7\20\2\2"+
		"\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160"+
		"\5\62\32\2\u015f\u015a\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2"+
		"\u0161\u0162\3\2\2\2\u0162\61\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165"+
		"\5\"\22\2\u0165\u0166\t\6\2\2\u0166\u0167\5\"\22\2\u0167\u016f\3\2\2\2"+
		"\u0168\u0169\7\b\2\2\u0169\u016a\5\60\31\2\u016a\u016b\7\t\2\2\u016b\u016f"+
		"\3\2\2\2\u016c\u016f\5H%\2\u016d\u016f\5\22\n\2\u016e\u0164\3\2\2\2\u016e"+
		"\u0168\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016d\3\2\2\2\u016f\63\3\2\2"+
		"\2\u0170\u0171\t\7\2\2\u0171\u0172\7\f\2\2\u0172\u0173\t\7\2\2\u0173\65"+
		"\3\2\2\2\u0174\u0175\7.\2\2\u0175\u0176\7#\2\2\u0176\u0177\5&\24\2\u0177"+
		"\67\3\2\2\2\u0178\u0179\7.\2\2\u0179\u017a\7#\2\2\u017a\u017b\5&\24\2"+
		"\u017b\u017c\7$\2\2\u017c\u017d\5$\23\2\u017d9\3\2\2\2\u017e\u017f\7\'"+
		"\2\2\u017f\u0180\7\b\2\2\u0180\u0181\5\"\22\2\u0181\u0182\7\t\2\2\u0182"+
		";\3\2\2\2\u0183\u0184\7(\2\2\u0184\u0185\7\b\2\2\u0185\u0186\5\"\22\2"+
		"\u0186\u0187\7\t\2\2\u0187=\3\2\2\2\u0188\u0189\7)\2\2\u0189\u018a\7\b"+
		"\2\2\u018a\u018b\5\"\22\2\u018b\u018c\7\t\2\2\u018c?\3\2\2\2\u018d\u018e"+
		"\7*\2\2\u018e\u018f\7\b\2\2\u018f\u0190\5\"\22\2\u0190\u0191\7\t\2\2\u0191"+
		"A\3\2\2\2\u0192\u0193\t\b\2\2\u0193C\3\2\2\2\u0194\u0198\7%\2\2\u0195"+
		"\u0197\7+\2\2\u0196\u0195\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2"+
		"\2\2\u0198\u0199\3\2\2\2\u0199\u019e\3\2\2\2\u019a\u0198\3\2\2\2\u019b"+
		"\u019d\5\n\6\2\u019c\u019b\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2"+
		"\2\2\u019e\u019f\3\2\2\2\u019f\u01a4\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1"+
		"\u01a3\5\6\4\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2"+
		"\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7"+
		"\u01a8\7&\2\2\u01a8E\3\2\2\2\u01a9\u01aa\7\b\2\2\u01aa\u01ab\5.\30\2\u01ab"+
		"\u01ac\7\t\2\2\u01acG\3\2\2\2\u01ad\u01ae\t\t\2\2\u01aeI\3\2\2\2\u01af"+
		"\u01b0\t\n\2\2\u01b0K\3\2\2\2\u01b1\u01b5\5B\"\2\u01b2\u01b5\7/\2\2\u01b3"+
		"\u01b5\7\21\2\2\u01b4\u01b1\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b3\3"+
		"\2\2\2\u01b5M\3\2\2\2.PU[agm~\u008a\u008d\u009a\u009d\u00a1\u00a6\u00ab"+
		"\u00b0\u00b6\u00b9\u00c0\u00c8\u00d2\u00db\u00de\u00e9\u00f4\u00f9\u00ff"+
		"\u0116\u011b\u0125\u012a\u012f\u0134\u013b\u0143\u0147\u0152\u0157\u015c"+
		"\u0161\u016e\u0198\u019e\u01a4\u01b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}