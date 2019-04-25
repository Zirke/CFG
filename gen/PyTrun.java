// Generated from C:/Users/Abiram Mohanaraj/Documents/GitHub/CFG/src\PyTrun.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

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
		TURNLEFT=38, TURNRIGHT=39, EOL=40, FNUM=41, INUM=42, ID=43, TEXT=44, WS=45, 
		COMMENT=46, LINE_COMMENT=47;
	public static final int
		RULE_start = 0, RULE_stmts = 1, RULE_stmt = 2, RULE_functiondcl = 3, RULE_dcl = 4, 
		RULE_dclValue = 5, RULE_truedcl = 6, RULE_functioncall = 7, RULE_ifstmt = 8, 
		RULE_whilestmt = 9, RULE_repeatuntilstmt = 10, RULE_fromstmt = 11, RULE_returnstmt = 12, 
		RULE_assignment = 13, RULE_value = 14, RULE_expr = 15, RULE_arithmexpr = 16, 
		RULE_multexpr = 17, RULE_parexpr = 18, RULE_truthexpr = 19, RULE_logicalexpr = 20, 
		RULE_relationalexpr = 21, RULE_append = 22, RULE_arrindex = 23, RULE_arradd = 24, 
		RULE_drive = 25, RULE_turnleft = 26, RULE_turnright = 27, RULE_nums = 28, 
		RULE_stmtblock = 29, RULE_truthpar = 30, RULE_truth = 31, RULE_type = 32, 
		RULE_types = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "stmts", "stmt", "functiondcl", "dcl", "dclValue", "truedcl", 
			"functioncall", "ifstmt", "whilestmt", "repeatuntilstmt", "fromstmt", 
			"returnstmt", "assignment", "value", "expr", "arithmexpr", "multexpr", 
			"parexpr", "truthexpr", "logicalexpr", "relationalexpr", "append", "arrindex", 
			"arradd", "drive", "turnleft", "turnright", "nums", "stmtblock", "truthpar", 
			"truth", "type", "types"
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
			"EOL", "FNUM", "INUM", "ID", "TEXT", "WS", "COMMENT", "LINE_COMMENT"
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
		public List<TerminalNode> EOL() { return getTokens(PyTrun.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(PyTrun.EOL, i);
		}
		public List<StmtsContext> stmts() {
			return getRuleContexts(StmtsContext.class);
		}
		public StmtsContext stmts(int i) {
			return getRuleContext(StmtsContext.class,i);
		}
		public List<FunctiondclContext> functiondcl() {
			return getRuleContexts(FunctiondclContext.class);
		}
		public FunctiondclContext functiondcl(int i) {
			return getRuleContext(FunctiondclContext.class,i);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(68);
					match(EOL);
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(76);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INTDCL:
					case FLOATDCL:
					case TRUTHDCL:
					case TEXTDCL:
					case IF:
					case WHILE:
					case FROM:
					case REPEAT:
					case RETURN:
					case DRIVE:
					case TURNLEFT:
					case TURNRIGHT:
					case EOL:
					case ID:
						{
						setState(74);
						stmts();
						}
						break;
					case FUNCTION:
						{
						setState(75);
						functiondcl();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL) {
				{
				{
				setState(81);
				match(EOL);
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(87);
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
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(PyTrun.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(PyTrun.EOL, i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			stmt();
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(91);
					match(EOL);
					setState(92);
					stmt();
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
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
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				dcl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				ifstmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				whilestmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				returnstmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				functioncall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(103);
				repeatuntilstmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(104);
				fromstmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(105);
				assignment();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(106);
				arradd();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(107);
				arrindex();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(108);
				drive();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(109);
				turnleft();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(110);
				turnright();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(111);
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
		public TerminalNode LPAR() { return getToken(PyTrun.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PyTrun.RPAR, 0); }
		public TerminalNode LCB() { return getToken(PyTrun.LCB, 0); }
		public TerminalNode RCB() { return getToken(PyTrun.RCB, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ARRDCL() { return getToken(PyTrun.ARRDCL, 0); }
		public List<TruedclContext> truedcl() {
			return getRuleContexts(TruedclContext.class);
		}
		public TruedclContext truedcl(int i) {
			return getRuleContext(TruedclContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
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
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(FUNCTION);
				setState(115);
				match(ID);
				setState(116);
				match(RETURNS);
				setState(119);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTDCL:
				case FLOATDCL:
				case TRUTHDCL:
				case TEXTDCL:
					{
					setState(117);
					type();
					}
					break;
				case ARRDCL:
					{
					setState(118);
					match(ARRDCL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(121);
				match(LPAR);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTDCL) | (1L << FLOATDCL) | (1L << TRUTHDCL) | (1L << TEXTDCL))) != 0)) {
					{
					{
					setState(122);
					truedcl();
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(123);
						match(COMMA);
						setState(124);
						truedcl();
						}
						}
						setState(129);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				match(RPAR);
				setState(136);
				match(LCB);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTDCL) | (1L << FLOATDCL) | (1L << TRUTHDCL) | (1L << TEXTDCL) | (1L << IF) | (1L << WHILE) | (1L << FROM) | (1L << REPEAT) | (1L << RETURN) | (1L << DRIVE) | (1L << TURNLEFT) | (1L << TURNRIGHT) | (1L << EOL) | (1L << ID))) != 0)) {
					{
					{
					setState(137);
					stmt();
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				match(RCB);
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
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTDCL) | (1L << FLOATDCL) | (1L << TRUTHDCL) | (1L << TEXTDCL))) != 0)) {
					{
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
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160);
				match(RPAR);
				setState(161);
				match(LCB);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTDCL) | (1L << FLOATDCL) | (1L << TRUTHDCL) | (1L << TEXTDCL) | (1L << IF) | (1L << WHILE) | (1L << FROM) | (1L << REPEAT) | (1L << RETURN) | (1L << DRIVE) | (1L << TURNLEFT) | (1L << TURNRIGHT) | (1L << EOL) | (1L << ID))) != 0)) {
					{
					{
					setState(162);
					stmt();
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(168);
				match(RCB);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ARRDCL() { return getToken(PyTrun.ARRDCL, 0); }
		public TerminalNode LCB() { return getToken(PyTrun.LCB, 0); }
		public TerminalNode RCB() { return getToken(PyTrun.RCB, 0); }
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
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
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(INTDCL);
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
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(FLOATDCL);
				setState(177);
				match(ID);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(178);
					dclValue();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(TEXTDCL);
				setState(182);
				match(ID);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(183);
					dclValue();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				match(TRUTHDCL);
				setState(187);
				match(ID);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(188);
					match(ASSIGN);
					setState(189);
					truthexpr();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
				type();
				setState(193);
				match(ARRDCL);
				setState(194);
				match(ID);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(195);
					match(ASSIGN);
					setState(212);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						{
						setState(196);
						functioncall();
						}
						}
						break;
					case LCB:
						{
						setState(197);
						match(LCB);
						setState(208);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUTHVAL) | (1L << FNUM) | (1L << INUM) | (1L << ID) | (1L << TEXT))) != 0)) {
							{
							{
							setState(198);
							types();
							setState(203);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(199);
								match(COMMA);
								setState(200);
								types();
								}
								}
								setState(205);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							}
							setState(210);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(211);
						match(RCB);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
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
		enterRule(_localctx, 10, RULE_dclValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
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
		enterRule(_localctx, 12, RULE_truedcl);
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
		enterRule(_localctx, 14, RULE_functioncall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(ID);
			setState(237);
			match(LPAR);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUTHVAL) | (1L << FNUM) | (1L << INUM) | (1L << ID) | (1L << TEXT))) != 0)) {
				{
				{
				setState(238);
				types();
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(239);
					match(COMMA);
					setState(240);
					types();
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
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
		enterRule(_localctx, 16, RULE_ifstmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(IF);
			setState(254);
			truthpar();
			setState(255);
			match(THEN);
			setState(256);
			stmtblock();
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(257);
					match(EOL);
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(263);
					match(ELSE);
					setState(264);
					match(IF);
					setState(265);
					truthpar();
					setState(266);
					match(THEN);
					setState(267);
					stmtblock();
					setState(271);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(268);
							match(EOL);
							}
							} 
						}
						setState(273);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					}
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(279);
				match(ELSE);
				setState(280);
				match(THEN);
				setState(281);
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
		enterRule(_localctx, 18, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(WHILE);
			setState(285);
			truthpar();
			setState(286);
			match(DO);
			setState(287);
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
		enterRule(_localctx, 20, RULE_repeatuntilstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(REPEAT);
			setState(290);
			stmtblock();
			setState(291);
			match(UNTIL);
			setState(292);
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
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
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
		enterRule(_localctx, 22, RULE_fromstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(FROM);
			setState(295);
			match(LPAR);
			setState(296);
			value();
			setState(297);
			_la = _input.LA(1);
			if ( !(_la==UPTO || _la==DOWNTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(298);
			value();
			setState(299);
			match(RPAR);
			setState(300);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		enterRule(_localctx, 24, RULE_returnstmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(RETURN);
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(303);
				value();
				}
				break;
			case 2:
				{
				setState(304);
				truthexpr();
				}
				break;
			}
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(307);
					match(EOL);
					}
					} 
				}
				setState(312);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PyTrun.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(PyTrun.ASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ELEMENT() { return getToken(PyTrun.ELEMENT, 0); }
		public TerminalNode INUM() { return getToken(PyTrun.INUM, 0); }
		public TerminalNode TEXT() { return getToken(PyTrun.TEXT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LCB() { return getToken(PyTrun.LCB, 0); }
		public TerminalNode RCB() { return getToken(PyTrun.RCB, 0); }
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
		enterRule(_localctx, 26, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(ID);
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(314);
				match(ASSIGN);
				setState(315);
				value();
				}
				break;
			case 2:
				{
				setState(316);
				match(ELEMENT);
				setState(317);
				match(INUM);
				setState(318);
				match(ASSIGN);
				setState(319);
				value();
				}
				break;
			case 3:
				{
				setState(320);
				match(ASSIGN);
				setState(321);
				match(TEXT);
				}
				break;
			case 4:
				{
				setState(322);
				match(ASSIGN);
				setState(323);
				expr();
				}
				break;
			case 5:
				{
				setState(324);
				match(ASSIGN);
				setState(325);
				match(LCB);
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUTHVAL) | (1L << FNUM) | (1L << INUM) | (1L << ID) | (1L << TEXT))) != 0)) {
					{
					{
					setState(326);
					types();
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(327);
						match(COMMA);
						setState(328);
						types();
						}
						}
						setState(333);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(339);
				match(RCB);
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
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
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
		enterRule(_localctx, 28, RULE_value);
		try {
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				arithmexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				functioncall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				arrindex();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(345);
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
		enterRule(_localctx, 30, RULE_expr);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				arithmexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				truthexpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
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
		enterRule(_localctx, 32, RULE_arithmexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			multexpr();
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(354);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(355);
				multexpr();
				}
				}
				setState(360);
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

	public static class MultexprContext extends ParserRuleContext {
		public List<ParexprContext> parexpr() {
			return getRuleContexts(ParexprContext.class);
		}
		public ParexprContext parexpr(int i) {
			return getRuleContext(ParexprContext.class,i);
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
		enterRule(_localctx, 34, RULE_multexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			parexpr();
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIMES || _la==DIVIDES) {
				{
				{
				setState(362);
				_la = _input.LA(1);
				if ( !(_la==TIMES || _la==DIVIDES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(363);
				parexpr();
				}
				}
				setState(368);
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

	public static class ParexprContext extends ParserRuleContext {
		public NumsContext nums() {
			return getRuleContext(NumsContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
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
		enterRule(_localctx, 36, RULE_parexpr);
		try {
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				nums();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				functioncall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				match(LPAR);
				setState(372);
				arithmexpr();
				setState(373);
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
		enterRule(_localctx, 38, RULE_truthexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
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
		enterRule(_localctx, 40, RULE_logicalexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(379);
				match(NOT);
				}
			}

			setState(382);
			relationalexpr();
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(383);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(384);
					match(NOT);
					}
				}

				setState(387);
				relationalexpr();
				}
				}
				setState(392);
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
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
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
		enterRule(_localctx, 42, RULE_relationalexpr);
		int _la;
		try {
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				value();
				{
				setState(394);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << GRTHAN) | (1L << LESSTHAN))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(395);
				value();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				match(LPAR);
				setState(398);
				logicalexpr();
				setState(399);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(401);
				truth();
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
		enterRule(_localctx, 44, RULE_append);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(405);
			match(PLUS);
			setState(406);
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
		public List<TerminalNode> ID() { return getTokens(PyTrun.ID); }
		public TerminalNode ID(int i) {
			return getToken(PyTrun.ID, i);
		}
		public TerminalNode ELEMENT() { return getToken(PyTrun.ELEMENT, 0); }
		public TerminalNode INUM() { return getToken(PyTrun.INUM, 0); }
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
		enterRule(_localctx, 46, RULE_arrindex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(ID);
			setState(409);
			match(ELEMENT);
			setState(410);
			_la = _input.LA(1);
			if ( !(_la==INUM || _la==ID) ) {
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

	public static class ArraddContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PyTrun.ID); }
		public TerminalNode ID(int i) {
			return getToken(PyTrun.ID, i);
		}
		public TerminalNode ELEMENT() { return getToken(PyTrun.ELEMENT, 0); }
		public TerminalNode ASSIGN() { return getToken(PyTrun.ASSIGN, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode INUM() { return getToken(PyTrun.INUM, 0); }
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
		enterRule(_localctx, 48, RULE_arradd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(ID);
			setState(413);
			match(ELEMENT);
			setState(414);
			_la = _input.LA(1);
			if ( !(_la==INUM || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(415);
			match(ASSIGN);
			setState(416);
			types();
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		enterRule(_localctx, 50, RULE_drive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(DRIVE);
			setState(419);
			match(LPAR);
			setState(420);
			value();
			setState(421);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		enterRule(_localctx, 52, RULE_turnleft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(TURNLEFT);
			setState(424);
			match(LPAR);
			setState(425);
			value();
			setState(426);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		enterRule(_localctx, 54, RULE_turnright);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(TURNRIGHT);
			setState(429);
			match(LPAR);
			setState(430);
			value();
			setState(431);
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
		enterRule(_localctx, 56, RULE_nums);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
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
		enterRule(_localctx, 58, RULE_stmtblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(LCB);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTDCL) | (1L << FLOATDCL) | (1L << TRUTHDCL) | (1L << TEXTDCL) | (1L << IF) | (1L << WHILE) | (1L << FROM) | (1L << REPEAT) | (1L << RETURN) | (1L << DRIVE) | (1L << TURNLEFT) | (1L << TURNRIGHT) | (1L << EOL) | (1L << ID))) != 0)) {
				{
				{
				setState(436);
				stmt();
				}
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(442);
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
		enterRule(_localctx, 60, RULE_truthpar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(LPAR);
			setState(445);
			truthexpr();
			setState(446);
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
		enterRule(_localctx, 62, RULE_truth);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
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
		enterRule(_localctx, 64, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
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
		enterRule(_localctx, 66, RULE_types);
		try {
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FNUM:
			case INUM:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				nums();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				match(TEXT);
				}
				break;
			case TRUTHVAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(454);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u01cc\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\3\2\7\2O\n\2\f\2\16"+
		"\2R\13\2\3\2\7\2U\n\2\f\2\16\2X\13\2\3\2\5\2[\n\2\3\3\3\3\3\3\7\3`\n\3"+
		"\f\3\16\3c\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4s\n\4\3\5\3\5\3\5\3\5\3\5\5\5z\n\5\3\5\3\5\3\5\3\5\7\5\u0080\n\5"+
		"\f\5\16\5\u0083\13\5\7\5\u0085\n\5\f\5\16\5\u0088\13\5\3\5\3\5\3\5\7\5"+
		"\u008d\n\5\f\5\16\5\u0090\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0099\n"+
		"\5\f\5\16\5\u009c\13\5\7\5\u009e\n\5\f\5\16\5\u00a1\13\5\3\5\3\5\3\5\7"+
		"\5\u00a6\n\5\f\5\16\5\u00a9\13\5\3\5\5\5\u00ac\n\5\3\6\3\6\3\6\5\6\u00b1"+
		"\n\6\3\6\3\6\3\6\5\6\u00b6\n\6\3\6\3\6\3\6\5\6\u00bb\n\6\3\6\3\6\3\6\3"+
		"\6\5\6\u00c1\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00cc\n\6\f\6"+
		"\16\6\u00cf\13\6\7\6\u00d1\n\6\f\6\16\6\u00d4\13\6\3\6\5\6\u00d7\n\6\5"+
		"\6\u00d9\n\6\5\6\u00db\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00e3\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ed\n\b\3\t\3\t\3\t\3\t\3\t\7\t\u00f4"+
		"\n\t\f\t\16\t\u00f7\13\t\7\t\u00f9\n\t\f\t\16\t\u00fc\13\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\7\n\u0105\n\n\f\n\16\n\u0108\13\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\7\n\u0110\n\n\f\n\16\n\u0113\13\n\7\n\u0115\n\n\f\n\16\n\u0118\13"+
		"\n\3\n\3\n\3\n\5\n\u011d\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u0134\n\16\3"+
		"\16\7\16\u0137\n\16\f\16\16\16\u013a\13\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u014c\n\17"+
		"\f\17\16\17\u014f\13\17\7\17\u0151\n\17\f\17\16\17\u0154\13\17\3\17\5"+
		"\17\u0157\n\17\3\20\3\20\3\20\3\20\5\20\u015d\n\20\3\21\3\21\3\21\5\21"+
		"\u0162\n\21\3\22\3\22\3\22\7\22\u0167\n\22\f\22\16\22\u016a\13\22\3\23"+
		"\3\23\3\23\7\23\u016f\n\23\f\23\16\23\u0172\13\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u017a\n\24\3\25\3\25\3\26\5\26\u017f\n\26\3\26\3\26\3"+
		"\26\5\26\u0184\n\26\3\26\7\26\u0187\n\26\f\26\16\26\u018a\13\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0195\n\27\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\7\37\u01b8\n\37\f\37\16\37\u01bb\13\37\3\37\3\37\3 \3 \3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3#\5#\u01ca\n#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\f\3\2\35\36\3\2\f\r\3\2\n\13"+
		"\3\2\16\17\3\2\22\24\3\2-.\3\2,-\3\2+-\4\2\21\21--\3\2\3\6\2\u01f4\2I"+
		"\3\2\2\2\4\\\3\2\2\2\6r\3\2\2\2\b\u00ab\3\2\2\2\n\u00da\3\2\2\2\f\u00e2"+
		"\3\2\2\2\16\u00ec\3\2\2\2\20\u00ee\3\2\2\2\22\u00ff\3\2\2\2\24\u011e\3"+
		"\2\2\2\26\u0123\3\2\2\2\30\u0128\3\2\2\2\32\u0130\3\2\2\2\34\u013b\3\2"+
		"\2\2\36\u015c\3\2\2\2 \u0161\3\2\2\2\"\u0163\3\2\2\2$\u016b\3\2\2\2&\u0179"+
		"\3\2\2\2(\u017b\3\2\2\2*\u017e\3\2\2\2,\u0194\3\2\2\2.\u0196\3\2\2\2\60"+
		"\u019a\3\2\2\2\62\u019e\3\2\2\2\64\u01a4\3\2\2\2\66\u01a9\3\2\2\28\u01ae"+
		"\3\2\2\2:\u01b3\3\2\2\2<\u01b5\3\2\2\2>\u01be\3\2\2\2@\u01c2\3\2\2\2B"+
		"\u01c4\3\2\2\2D\u01c9\3\2\2\2FH\7*\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2I"+
		"J\3\2\2\2JP\3\2\2\2KI\3\2\2\2LO\5\4\3\2MO\5\b\5\2NL\3\2\2\2NM\3\2\2\2"+
		"OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QV\3\2\2\2RP\3\2\2\2SU\7*\2\2TS\3\2\2\2"+
		"UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WZ\3\2\2\2XV\3\2\2\2Y[\7\2\2\3ZY\3\2\2\2"+
		"Z[\3\2\2\2[\3\3\2\2\2\\a\5\6\4\2]^\7*\2\2^`\5\6\4\2_]\3\2\2\2`c\3\2\2"+
		"\2a_\3\2\2\2ab\3\2\2\2b\5\3\2\2\2ca\3\2\2\2ds\5\n\6\2es\5\22\n\2fs\5\24"+
		"\13\2gs\5\32\16\2hs\5\20\t\2is\5\26\f\2js\5\30\r\2ks\5\34\17\2ls\5\62"+
		"\32\2ms\5\60\31\2ns\5\64\33\2os\5\66\34\2ps\58\35\2qs\7*\2\2rd\3\2\2\2"+
		"re\3\2\2\2rf\3\2\2\2rg\3\2\2\2rh\3\2\2\2ri\3\2\2\2rj\3\2\2\2rk\3\2\2\2"+
		"rl\3\2\2\2rm\3\2\2\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\7\3\2\2"+
		"\2tu\7\"\2\2uv\7-\2\2vy\7!\2\2wz\5B\"\2xz\7\7\2\2yw\3\2\2\2yx\3\2\2\2"+
		"z{\3\2\2\2{\u0086\7\b\2\2|\u0081\5\16\b\2}~\7\37\2\2~\u0080\5\16\b\2\177"+
		"}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0084|\3\2\2\2\u0085\u0088\3\2\2\2"+
		"\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0089\u008a\7\t\2\2\u008a\u008e\7%\2\2\u008b\u008d\5\6\4\2\u008c"+
		"\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u00ac\7&\2\2\u0092"+
		"\u0093\7\"\2\2\u0093\u0094\7-\2\2\u0094\u009f\7\b\2\2\u0095\u009a\5\16"+
		"\b\2\u0096\u0097\7\37\2\2\u0097\u0099\5\16\b\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009e\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009d\u0095\3\2\2\2\u009e\u00a1\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a2\u00a3\7\t\2\2\u00a3\u00a7\7%\2\2\u00a4\u00a6\5\6\4\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ac\7&\2\2\u00ab"+
		"t\3\2\2\2\u00ab\u0092\3\2\2\2\u00ac\t\3\2\2\2\u00ad\u00ae\7\3\2\2\u00ae"+
		"\u00b0\7-\2\2\u00af\u00b1\5\f\7\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00db\3\2\2\2\u00b2\u00b3\7\4\2\2\u00b3\u00b5\7-\2\2\u00b4"+
		"\u00b6\5\f\7\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00db\3\2"+
		"\2\2\u00b7\u00b8\7\6\2\2\u00b8\u00ba\7-\2\2\u00b9\u00bb\5\f\7\2\u00ba"+
		"\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00db\3\2\2\2\u00bc\u00bd\7\5"+
		"\2\2\u00bd\u00c0\7-\2\2\u00be\u00bf\7$\2\2\u00bf\u00c1\5(\25\2\u00c0\u00be"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00db\3\2\2\2\u00c2\u00c3\5B\"\2\u00c3"+
		"\u00c4\7\7\2\2\u00c4\u00d8\7-\2\2\u00c5\u00d6\7$\2\2\u00c6\u00d7\5\20"+
		"\t\2\u00c7\u00d2\7%\2\2\u00c8\u00cd\5D#\2\u00c9\u00ca\7\37\2\2\u00ca\u00cc"+
		"\5D#\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00c8\3\2"+
		"\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d7\7&\2\2\u00d6\u00c6\3\2"+
		"\2\2\u00d6\u00c7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00c5\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00ad\3\2\2\2\u00da\u00b2\3\2"+
		"\2\2\u00da\u00b7\3\2\2\2\u00da\u00bc\3\2\2\2\u00da\u00c2\3\2\2\2\u00db"+
		"\13\3\2\2\2\u00dc\u00dd\7$\2\2\u00dd\u00e3\5\36\20\2\u00de\u00df\7$\2"+
		"\2\u00df\u00e3\7.\2\2\u00e0\u00e1\7$\2\2\u00e1\u00e3\5 \21\2\u00e2\u00dc"+
		"\3\2\2\2\u00e2\u00de\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\r\3\2\2\2\u00e4"+
		"\u00e5\7\3\2\2\u00e5\u00ed\7-\2\2\u00e6\u00e7\7\4\2\2\u00e7\u00ed\7-\2"+
		"\2\u00e8\u00e9\7\6\2\2\u00e9\u00ed\7-\2\2\u00ea\u00eb\7\5\2\2\u00eb\u00ed"+
		"\7-\2\2\u00ec\u00e4\3\2\2\2\u00ec\u00e6\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\17\3\2\2\2\u00ee\u00ef\7-\2\2\u00ef\u00fa\7\b\2\2"+
		"\u00f0\u00f5\5D#\2\u00f1\u00f2\7\37\2\2\u00f2\u00f4\5D#\2\u00f3\u00f1"+
		"\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f0\3\2\2\2\u00f9\u00fc\3\2"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fd\u00fe\7\t\2\2\u00fe\21\3\2\2\2\u00ff\u0100\7\25\2"+
		"\2\u0100\u0101\5> \2\u0101\u0102\7\34\2\2\u0102\u0106\5<\37\2\u0103\u0105"+
		"\7*\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0116\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\7\26"+
		"\2\2\u010a\u010b\7\25\2\2\u010b\u010c\5> \2\u010c\u010d\7\34\2\2\u010d"+
		"\u0111\5<\37\2\u010e\u0110\7*\2\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2"+
		"\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0115\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0114\u0109\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\u011c\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011a\7\26\2\2\u011a\u011b\7\34\2\2\u011b\u011d\5<\37\2\u011c\u0119\3"+
		"\2\2\2\u011c\u011d\3\2\2\2\u011d\23\3\2\2\2\u011e\u011f\7\27\2\2\u011f"+
		"\u0120\5> \2\u0120\u0121\7\30\2\2\u0121\u0122\5<\37\2\u0122\25\3\2\2\2"+
		"\u0123\u0124\7\32\2\2\u0124\u0125\5<\37\2\u0125\u0126\7\33\2\2\u0126\u0127"+
		"\5> \2\u0127\27\3\2\2\2\u0128\u0129\7\31\2\2\u0129\u012a\7\b\2\2\u012a"+
		"\u012b\5\36\20\2\u012b\u012c\t\2\2\2\u012c\u012d\5\36\20\2\u012d\u012e"+
		"\7\t\2\2\u012e\u012f\5<\37\2\u012f\31\3\2\2\2\u0130\u0133\7 \2\2\u0131"+
		"\u0134\5\36\20\2\u0132\u0134\5(\25\2\u0133\u0131\3\2\2\2\u0133\u0132\3"+
		"\2\2\2\u0134\u0138\3\2\2\2\u0135\u0137\7*\2\2\u0136\u0135\3\2\2\2\u0137"+
		"\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\33\3\2\2"+
		"\2\u013a\u0138\3\2\2\2\u013b\u0156\7-\2\2\u013c\u013d\7$\2\2\u013d\u0157"+
		"\5\36\20\2\u013e\u013f\7#\2\2\u013f\u0140\7,\2\2\u0140\u0141\7$\2\2\u0141"+
		"\u0157\5\36\20\2\u0142\u0143\7$\2\2\u0143\u0157\7.\2\2\u0144\u0145\7$"+
		"\2\2\u0145\u0157\5 \21\2\u0146\u0147\7$\2\2\u0147\u0152\7%\2\2\u0148\u014d"+
		"\5D#\2\u0149\u014a\7\37\2\2\u014a\u014c\5D#\2\u014b\u0149\3\2\2\2\u014c"+
		"\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0151\3\2"+
		"\2\2\u014f\u014d\3\2\2\2\u0150\u0148\3\2\2\2\u0151\u0154\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2"+
		"\2\2\u0155\u0157\7&\2\2\u0156\u013c\3\2\2\2\u0156\u013e\3\2\2\2\u0156"+
		"\u0142\3\2\2\2\u0156\u0144\3\2\2\2\u0156\u0146\3\2\2\2\u0157\35\3\2\2"+
		"\2\u0158\u015d\5\"\22\2\u0159\u015d\5\20\t\2\u015a\u015d\5\60\31\2\u015b"+
		"\u015d\7-\2\2\u015c\u0158\3\2\2\2\u015c\u0159\3\2\2\2\u015c\u015a\3\2"+
		"\2\2\u015c\u015b\3\2\2\2\u015d\37\3\2\2\2\u015e\u0162\5\"\22\2\u015f\u0162"+
		"\5(\25\2\u0160\u0162\5.\30\2\u0161\u015e\3\2\2\2\u0161\u015f\3\2\2\2\u0161"+
		"\u0160\3\2\2\2\u0162!\3\2\2\2\u0163\u0168\5$\23\2\u0164\u0165\t\3\2\2"+
		"\u0165\u0167\5$\23\2\u0166\u0164\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166"+
		"\3\2\2\2\u0168\u0169\3\2\2\2\u0169#\3\2\2\2\u016a\u0168\3\2\2\2\u016b"+
		"\u0170\5&\24\2\u016c\u016d\t\4\2\2\u016d\u016f\5&\24\2\u016e\u016c\3\2"+
		"\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"%\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u017a\5:\36\2\u0174\u017a\5\20\t\2"+
		"\u0175\u0176\7\b\2\2\u0176\u0177\5\"\22\2\u0177\u0178\7\t\2\2\u0178\u017a"+
		"\3\2\2\2\u0179\u0173\3\2\2\2\u0179\u0174\3\2\2\2\u0179\u0175\3\2\2\2\u017a"+
		"\'\3\2\2\2\u017b\u017c\5*\26\2\u017c)\3\2\2\2\u017d\u017f\7\20\2\2\u017e"+
		"\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0188\5,"+
		"\27\2\u0181\u0183\t\5\2\2\u0182\u0184\7\20\2\2\u0183\u0182\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\5,\27\2\u0186\u0181\3\2"+
		"\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"+\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018c\5\36\20\2\u018c\u018d\t\6\2"+
		"\2\u018d\u018e\5\36\20\2\u018e\u0195\3\2\2\2\u018f\u0190\7\b\2\2\u0190"+
		"\u0191\5*\26\2\u0191\u0192\7\t\2\2\u0192\u0195\3\2\2\2\u0193\u0195\5@"+
		"!\2\u0194\u018b\3\2\2\2\u0194\u018f\3\2\2\2\u0194\u0193\3\2\2\2\u0195"+
		"-\3\2\2\2\u0196\u0197\t\7\2\2\u0197\u0198\7\f\2\2\u0198\u0199\t\7\2\2"+
		"\u0199/\3\2\2\2\u019a\u019b\7-\2\2\u019b\u019c\7#\2\2\u019c\u019d\t\b"+
		"\2\2\u019d\61\3\2\2\2\u019e\u019f\7-\2\2\u019f\u01a0\7#\2\2\u01a0\u01a1"+
		"\t\b\2\2\u01a1\u01a2\7$\2\2\u01a2\u01a3\5D#\2\u01a3\63\3\2\2\2\u01a4\u01a5"+
		"\7\'\2\2\u01a5\u01a6\7\b\2\2\u01a6\u01a7\5\36\20\2\u01a7\u01a8\7\t\2\2"+
		"\u01a8\65\3\2\2\2\u01a9\u01aa\7(\2\2\u01aa\u01ab\7\b\2\2\u01ab\u01ac\5"+
		"\36\20\2\u01ac\u01ad\7\t\2\2\u01ad\67\3\2\2\2\u01ae\u01af\7)\2\2\u01af"+
		"\u01b0\7\b\2\2\u01b0\u01b1\5\36\20\2\u01b1\u01b2\7\t\2\2\u01b29\3\2\2"+
		"\2\u01b3\u01b4\t\t\2\2\u01b4;\3\2\2\2\u01b5\u01b9\7%\2\2\u01b6\u01b8\5"+
		"\6\4\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01bd\7&"+
		"\2\2\u01bd=\3\2\2\2\u01be\u01bf\7\b\2\2\u01bf\u01c0\5(\25\2\u01c0\u01c1"+
		"\7\t\2\2\u01c1?\3\2\2\2\u01c2\u01c3\t\n\2\2\u01c3A\3\2\2\2\u01c4\u01c5"+
		"\t\13\2\2\u01c5C\3\2\2\2\u01c6\u01ca\5:\36\2\u01c7\u01ca\7.\2\2\u01c8"+
		"\u01ca\7\21\2\2\u01c9\u01c6\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01c8\3"+
		"\2\2\2\u01caE\3\2\2\2\62INPVZary\u0081\u0086\u008e\u009a\u009f\u00a7\u00ab"+
		"\u00b0\u00b5\u00ba\u00c0\u00cd\u00d2\u00d6\u00d8\u00da\u00e2\u00ec\u00f5"+
		"\u00fa\u0106\u0111\u0116\u011c\u0133\u0138\u014d\u0152\u0156\u015c\u0161"+
		"\u0168\u0170\u0179\u017e\u0183\u0188\u0194\u01b9\u01c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}