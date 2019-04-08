// Generated from C:/Users/Abiram Mohanaraj/Documents/GitHub/CFG/src\PyTrun.g4 by ANTLR 4.7.2
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
		RETURNS=31, FUNCTION=32, ELEMENT=33, ASSIGN=34, LCB=35, RCB=36, EOL=37, 
		FNUM=38, INUM=39, ID=40, TEXT=41, BLOCKCOMMENT=42, WS=43;
	public static final int
		RULE_start = 0, RULE_stmts = 1, RULE_stmt = 2, RULE_functiondcl = 3, RULE_dcl = 4, 
		RULE_truedcl = 5, RULE_functioncall = 6, RULE_args = 7, RULE_ifstmt = 8, 
		RULE_whilestmt = 9, RULE_repeatuntilstmt = 10, RULE_fromstmt = 11, RULE_returnstmt = 12, 
		RULE_assignment = 13, RULE_value = 14, RULE_expr = 15, RULE_arithmexpr = 16, 
		RULE_multexpr = 17, RULE_parexpr = 18, RULE_truthexpr = 19, RULE_logicalexpr = 20, 
		RULE_relationalexpr = 21, RULE_append = 22, RULE_arrelems = 23, RULE_arrindex = 24, 
		RULE_arradd = 25, RULE_nums = 26, RULE_paramlist = 27, RULE_stmtblock = 28, 
		RULE_truthpar = 29, RULE_truth = 30, RULE_type = 31, RULE_types = 32, 
		RULE_stmtend = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "stmts", "stmt", "functiondcl", "dcl", "truedcl", "functioncall", 
			"args", "ifstmt", "whilestmt", "repeatuntilstmt", "fromstmt", "returnstmt", 
			"assignment", "value", "expr", "arithmexpr", "multexpr", "parexpr", "truthexpr", 
			"logicalexpr", "relationalexpr", "append", "arrelems", "arrindex", "arradd", 
			"nums", "paramlist", "stmtblock", "truthpar", "truth", "type", "types", 
			"stmtend"
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
			"RPAR", "TIMES", "DIVIDES", "PLUS", "MINUS", "AND", "OR", "NOT", "TRUTHVAL", 
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
			setState(68);
			stmts();
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(69);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			stmt();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL) {
				{
				{
				setState(73);
				match(EOL);
				setState(74);
				stmt();
				}
				}
				setState(79);
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
		public FunctiondclContext functiondcl() {
			return getRuleContext(FunctiondclContext.class,0);
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
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				dcl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				ifstmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				whilestmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				returnstmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				functioncall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				repeatuntilstmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				fromstmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(87);
				assignment();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(88);
				arradd();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(89);
				arrindex();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(90);
				functiondcl();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(91);
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
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PyTrun.RPAR, 0); }
		public TerminalNode LCB() { return getToken(PyTrun.LCB, 0); }
		public ReturnstmtContext returnstmt() {
			return getRuleContext(ReturnstmtContext.class,0);
		}
		public TerminalNode RCB() { return getToken(PyTrun.RCB, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtblockContext stmtblock() {
			return getRuleContext(StmtblockContext.class,0);
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
		try {
			int _alt;
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(FUNCTION);
				setState(95);
				match(ID);
				setState(96);
				match(RETURNS);
				setState(97);
				type();
				setState(98);
				match(LPAR);
				setState(99);
				paramlist();
				setState(100);
				match(RPAR);
				setState(101);
				match(LCB);
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(102);
						stmt();
						}
						} 
					}
					setState(107);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(108);
				returnstmt();
				setState(109);
				match(RCB);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(FUNCTION);
				setState(112);
				match(ID);
				setState(113);
				match(LPAR);
				setState(114);
				paramlist();
				setState(115);
				match(RPAR);
				setState(116);
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode FLOATDCL() { return getToken(PyTrun.FLOATDCL, 0); }
		public TerminalNode TEXTDCL() { return getToken(PyTrun.TEXTDCL, 0); }
		public TerminalNode TRUTHDCL() { return getToken(PyTrun.TRUTHDCL, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(PyTrun.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(PyTrun.ASSIGN, i);
		}
		public TruthexprContext truthexpr() {
			return getRuleContext(TruthexprContext.class,0);
		}
		public ArrindexContext arrindex() {
			return getRuleContext(ArrindexContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ARRDCL() { return getToken(PyTrun.ARRDCL, 0); }
		public TerminalNode LCB() { return getToken(PyTrun.LCB, 0); }
		public ArrelemsContext arrelems() {
			return getRuleContext(ArrelemsContext.class,0);
		}
		public TerminalNode RCB() { return getToken(PyTrun.RCB, 0); }
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
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(INTDCL);
				setState(121);
				match(ID);
				setState(123);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(122);
					assignment();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(FLOATDCL);
				setState(126);
				match(ID);
				setState(128);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(127);
					assignment();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				match(TEXTDCL);
				setState(131);
				match(ID);
				setState(133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(132);
					assignment();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				match(TRUTHDCL);
				setState(136);
				match(ID);
				setState(139);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(137);
					match(ASSIGN);
					{
					setState(138);
					truthexpr();
					}
					}
					break;
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(141);
					match(ASSIGN);
					{
					setState(142);
					arrindex();
					}
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				type();
				setState(146);
				match(ARRDCL);
				setState(147);
				match(ID);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(148);
					match(ASSIGN);
					setState(149);
					match(LCB);
					setState(150);
					arrelems();
					setState(151);
					match(RCB);
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
		enterRule(_localctx, 10, RULE_truedcl);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTDCL:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(INTDCL);
				setState(158);
				match(ID);
				}
				break;
			case FLOATDCL:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(FLOATDCL);
				setState(160);
				match(ID);
				}
				break;
			case TEXTDCL:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(TEXTDCL);
				setState(162);
				match(ID);
				}
				break;
			case TRUTHDCL:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				match(TRUTHDCL);
				setState(164);
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
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PyTrun.RPAR, 0); }
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
		enterRule(_localctx, 12, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(ID);
			setState(168);
			match(LPAR);
			setState(169);
			args();
			setState(170);
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

	public static class ArgsContext extends ParserRuleContext {
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
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUTHVAL) | (1L << FNUM) | (1L << INUM) | (1L << ID) | (1L << TEXT))) != 0)) {
				{
				{
				setState(172);
				types();
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(173);
					match(COMMA);
					setState(174);
					types();
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(184);
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
			setState(185);
			match(IF);
			setState(186);
			truthpar();
			setState(187);
			match(THEN);
			setState(188);
			stmtblock();
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(189);
					match(EOL);
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(195);
					match(ELSE);
					setState(196);
					match(IF);
					setState(197);
					truthpar();
					setState(198);
					match(THEN);
					setState(199);
					stmtblock();
					setState(203);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(200);
							match(EOL);
							}
							} 
						}
						setState(205);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					}
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(211);
				match(ELSE);
				setState(212);
				match(THEN);
				setState(213);
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
			setState(216);
			match(WHILE);
			setState(217);
			truthpar();
			setState(218);
			match(DO);
			setState(219);
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
			setState(221);
			match(REPEAT);
			setState(222);
			stmtblock();
			setState(223);
			match(UNTIL);
			setState(224);
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
			setState(226);
			match(FROM);
			setState(227);
			match(LPAR);
			setState(228);
			value();
			setState(229);
			_la = _input.LA(1);
			if ( !(_la==UPTO || _la==DOWNTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(230);
			value();
			setState(231);
			match(RPAR);
			setState(232);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(RETURN);
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(235);
				value();
				}
				break;
			case 2:
				{
				setState(236);
				truthexpr();
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PyTrun.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(PyTrun.ASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArrindexContext arrindex() {
			return getRuleContext(ArrindexContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(PyTrun.TEXT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LCB() { return getToken(PyTrun.LCB, 0); }
		public ArrelemsContext arrelems() {
			return getRuleContext(ArrelemsContext.class,0);
		}
		public TerminalNode RCB() { return getToken(PyTrun.RCB, 0); }
		public TerminalNode EOL() { return getToken(PyTrun.EOL, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(239);
				match(ID);
				setState(240);
				match(ASSIGN);
				setState(241);
				value();
				}
				break;
			case 2:
				{
				setState(242);
				match(ID);
				setState(243);
				match(ASSIGN);
				setState(244);
				arrindex();
				}
				break;
			case 3:
				{
				setState(245);
				match(ID);
				setState(246);
				match(ASSIGN);
				setState(247);
				match(TEXT);
				}
				break;
			case 4:
				{
				setState(248);
				match(ID);
				setState(249);
				match(ASSIGN);
				setState(250);
				expr();
				}
				break;
			case 5:
				{
				setState(251);
				match(ID);
				setState(252);
				match(ASSIGN);
				setState(253);
				match(LCB);
				setState(254);
				arrelems();
				setState(255);
				match(RCB);
				}
				break;
			}
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(259);
				match(EOL);
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
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				arithmexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				functioncall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
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
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				arithmexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				truthexpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
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
			setState(272);
			multexpr();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(273);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(274);
				multexpr();
				}
				}
				setState(279);
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
			setState(280);
			parexpr();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIMES || _la==DIVIDES) {
				{
				{
				setState(281);
				_la = _input.LA(1);
				if ( !(_la==TIMES || _la==DIVIDES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(282);
				parexpr();
				}
				}
				setState(287);
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
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				nums();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				functioncall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				match(LPAR);
				setState(291);
				arithmexpr();
				setState(292);
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
			setState(296);
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
		public TruthContext truth() {
			return getRuleContext(TruthContext.class,0);
		}
		public List<TerminalNode> OR() { return getTokens(PyTrun.OR); }
		public TerminalNode OR(int i) {
			return getToken(PyTrun.OR, i);
		}
		public List<LogicalexprContext> logicalexpr() {
			return getRuleContexts(LogicalexprContext.class);
		}
		public LogicalexprContext logicalexpr(int i) {
			return getRuleContext(LogicalexprContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(PyTrun.AND); }
		public TerminalNode AND(int i) {
			return getToken(PyTrun.AND, i);
		}
		public TerminalNode NOT() { return getToken(PyTrun.NOT, 0); }
		public RelationalexprContext relationalexpr() {
			return getRuleContext(RelationalexprContext.class,0);
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
			int _alt;
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				truth();
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(303);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case OR:
							{
							setState(299);
							match(OR);
							setState(300);
							logicalexpr();
							}
							break;
						case AND:
							{
							setState(301);
							match(AND);
							setState(302);
							logicalexpr();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(307);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(308);
					match(NOT);
					}
				}

				setState(311);
				truth();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				relationalexpr();
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

	public static class RelationalexprContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(PyTrun.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(PyTrun.EQUALS, i);
		}
		public List<TerminalNode> GRTHAN() { return getTokens(PyTrun.GRTHAN); }
		public TerminalNode GRTHAN(int i) {
			return getToken(PyTrun.GRTHAN, i);
		}
		public List<TerminalNode> LESSTHAN() { return getTokens(PyTrun.LESSTHAN); }
		public TerminalNode LESSTHAN(int i) {
			return getToken(PyTrun.LESSTHAN, i);
		}
		public TerminalNode LPAR() { return getToken(PyTrun.LPAR, 0); }
		public LogicalexprContext logicalexpr() {
			return getRuleContext(LogicalexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PyTrun.RPAR, 0); }
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
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				value();
				setState(318); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(316);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << GRTHAN) | (1L << LESSTHAN))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(317);
					value();
					}
					}
					setState(320); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << GRTHAN) | (1L << LESSTHAN))) != 0) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(LPAR);
				setState(323);
				logicalexpr();
				setState(324);
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
			setState(328);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(329);
			match(PLUS);
			setState(330);
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

	public static class ArrelemsContext extends ParserRuleContext {
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
		public ArrelemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrelems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterArrelems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitArrelems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitArrelems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrelemsContext arrelems() throws RecognitionException {
		ArrelemsContext _localctx = new ArrelemsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arrelems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUTHVAL) | (1L << FNUM) | (1L << INUM) | (1L << ID) | (1L << TEXT))) != 0)) {
				{
				{
				setState(332);
				types();
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(333);
					match(COMMA);
					setState(334);
					types();
					}
					}
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(344);
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

	public static class ArrindexContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PyTrun.ID, 0); }
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
		enterRule(_localctx, 48, RULE_arrindex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(ID);
			setState(346);
			match(ELEMENT);
			setState(347);
			match(INUM);
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
		public TerminalNode INUM() { return getToken(PyTrun.INUM, 0); }
		public TerminalNode ASSIGN() { return getToken(PyTrun.ASSIGN, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
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
		enterRule(_localctx, 50, RULE_arradd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(ID);
			setState(350);
			match(ELEMENT);
			setState(351);
			match(INUM);
			setState(352);
			match(ASSIGN);
			setState(353);
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
		enterRule(_localctx, 52, RULE_nums);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
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

	public static class ParamlistContext extends ParserRuleContext {
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
		public ParamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterParamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitParamlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitParamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamlistContext paramlist() throws RecognitionException {
		ParamlistContext _localctx = new ParamlistContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_paramlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTDCL) | (1L << FLOATDCL) | (1L << TRUTHDCL) | (1L << TEXTDCL))) != 0)) {
				{
				{
				setState(357);
				truedcl();
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(358);
					match(COMMA);
					setState(359);
					truedcl();
					}
					}
					setState(364);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(369);
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
		enterRule(_localctx, 56, RULE_stmtblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(LCB);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTDCL) | (1L << FLOATDCL) | (1L << TRUTHDCL) | (1L << TEXTDCL) | (1L << IF) | (1L << WHILE) | (1L << FROM) | (1L << REPEAT) | (1L << RETURN) | (1L << FUNCTION) | (1L << EOL) | (1L << ID))) != 0)) {
				{
				{
				setState(371);
				stmt();
				}
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(377);
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
		enterRule(_localctx, 58, RULE_truthpar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(LPAR);
			setState(380);
			truthexpr();
			setState(381);
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
		enterRule(_localctx, 60, RULE_truth);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
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
		enterRule(_localctx, 62, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
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
		enterRule(_localctx, 64, RULE_types);
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FNUM:
			case INUM:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				nums();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				match(TEXT);
				}
				break;
			case TRUTHVAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(389);
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

	public static class StmtendContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(PyTrun.EOL, 0); }
		public TerminalNode EOF() { return getToken(PyTrun.EOF, 0); }
		public StmtendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).enterStmtend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyTrunListener ) ((PyTrunListener)listener).exitStmtend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyTrunVisitor ) return ((PyTrunVisitor<? extends T>)visitor).visitStmtend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtendContext stmtend() throws RecognitionException {
		StmtendContext _localctx = new StmtendContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_stmtend);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==EOL) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u018d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\5\2I\n\2\3\3\3\3\3\3\7\3N\n\3\f\3\16\3Q\13\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4_\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\7\5j\n\5\f\5\16\5m\13\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5y\n\5\3\6\3\6\3\6\5\6~\n\6\3\6\3\6\3\6\5\6\u0083"+
		"\n\6\3\6\3\6\3\6\5\6\u0088\n\6\3\6\3\6\3\6\3\6\5\6\u008e\n\6\3\6\3\6\5"+
		"\6\u0092\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009c\n\6\5\6\u009e\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a8\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\7\t\u00b2\n\t\f\t\16\t\u00b5\13\t\7\t\u00b7\n\t\f\t\16\t\u00ba"+
		"\13\t\3\n\3\n\3\n\3\n\3\n\7\n\u00c1\n\n\f\n\16\n\u00c4\13\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\7\n\u00cc\n\n\f\n\16\n\u00cf\13\n\7\n\u00d1\n\n\f\n\16"+
		"\n\u00d4\13\n\3\n\3\n\3\n\5\n\u00d9\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u00f0"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u0104\n\17\3\17\5\17\u0107\n\17\3\20\3"+
		"\20\3\20\5\20\u010c\n\20\3\21\3\21\3\21\5\21\u0111\n\21\3\22\3\22\3\22"+
		"\7\22\u0116\n\22\f\22\16\22\u0119\13\22\3\23\3\23\3\23\7\23\u011e\n\23"+
		"\f\23\16\23\u0121\13\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0129\n\24"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\7\26\u0132\n\26\f\26\16\26\u0135\13"+
		"\26\3\26\5\26\u0138\n\26\3\26\3\26\5\26\u013c\n\26\3\27\3\27\3\27\6\27"+
		"\u0141\n\27\r\27\16\27\u0142\3\27\3\27\3\27\3\27\5\27\u0149\n\27\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\7\31\u0152\n\31\f\31\16\31\u0155\13\31"+
		"\7\31\u0157\n\31\f\31\16\31\u015a\13\31\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\7\35\u016b\n\35\f\35\16"+
		"\35\u016e\13\35\7\35\u0170\n\35\f\35\16\35\u0173\13\35\3\36\3\36\7\36"+
		"\u0177\n\36\f\36\16\36\u017a\13\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3\"\5\"\u0189\n\"\3#\3#\3#\2\2$\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\13\3\2\35\36\3\2\f\r\3\2"+
		"\n\13\3\2\22\24\3\2*+\3\2(*\4\2\21\21**\3\2\3\6\3\3\'\'\2\u01a8\2F\3\2"+
		"\2\2\4J\3\2\2\2\6^\3\2\2\2\bx\3\2\2\2\n\u009d\3\2\2\2\f\u00a7\3\2\2\2"+
		"\16\u00a9\3\2\2\2\20\u00b8\3\2\2\2\22\u00bb\3\2\2\2\24\u00da\3\2\2\2\26"+
		"\u00df\3\2\2\2\30\u00e4\3\2\2\2\32\u00ec\3\2\2\2\34\u0103\3\2\2\2\36\u010b"+
		"\3\2\2\2 \u0110\3\2\2\2\"\u0112\3\2\2\2$\u011a\3\2\2\2&\u0128\3\2\2\2"+
		"(\u012a\3\2\2\2*\u013b\3\2\2\2,\u0148\3\2\2\2.\u014a\3\2\2\2\60\u0158"+
		"\3\2\2\2\62\u015b\3\2\2\2\64\u015f\3\2\2\2\66\u0165\3\2\2\28\u0171\3\2"+
		"\2\2:\u0174\3\2\2\2<\u017d\3\2\2\2>\u0181\3\2\2\2@\u0183\3\2\2\2B\u0188"+
		"\3\2\2\2D\u018a\3\2\2\2FH\5\4\3\2GI\7\2\2\3HG\3\2\2\2HI\3\2\2\2I\3\3\2"+
		"\2\2JO\5\6\4\2KL\7\'\2\2LN\5\6\4\2MK\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2"+
		"\2\2P\5\3\2\2\2QO\3\2\2\2R_\5\n\6\2S_\5\22\n\2T_\5\24\13\2U_\5\32\16\2"+
		"V_\5\16\b\2W_\5\26\f\2X_\5\30\r\2Y_\5\34\17\2Z_\5\64\33\2[_\5\62\32\2"+
		"\\_\5\b\5\2]_\7\'\2\2^R\3\2\2\2^S\3\2\2\2^T\3\2\2\2^U\3\2\2\2^V\3\2\2"+
		"\2^W\3\2\2\2^X\3\2\2\2^Y\3\2\2\2^Z\3\2\2\2^[\3\2\2\2^\\\3\2\2\2^]\3\2"+
		"\2\2_\7\3\2\2\2`a\7\"\2\2ab\7*\2\2bc\7!\2\2cd\5@!\2de\7\b\2\2ef\58\35"+
		"\2fg\7\t\2\2gk\7%\2\2hj\5\6\4\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2"+
		"\2ln\3\2\2\2mk\3\2\2\2no\5\32\16\2op\7&\2\2py\3\2\2\2qr\7\"\2\2rs\7*\2"+
		"\2st\7\b\2\2tu\58\35\2uv\7\t\2\2vw\5:\36\2wy\3\2\2\2x`\3\2\2\2xq\3\2\2"+
		"\2y\t\3\2\2\2z{\7\3\2\2{}\7*\2\2|~\5\34\17\2}|\3\2\2\2}~\3\2\2\2~\u009e"+
		"\3\2\2\2\177\u0080\7\4\2\2\u0080\u0082\7*\2\2\u0081\u0083\5\34\17\2\u0082"+
		"\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u009e\3\2\2\2\u0084\u0085\7\6"+
		"\2\2\u0085\u0087\7*\2\2\u0086\u0088\5\34\17\2\u0087\u0086\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u009e\3\2\2\2\u0089\u008a\7\5\2\2\u008a\u008d\7*"+
		"\2\2\u008b\u008c\7$\2\2\u008c\u008e\5(\25\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u0090\7$\2\2\u0090\u0092\5\62"+
		"\32\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u009e\3\2\2\2\u0093"+
		"\u0094\5@!\2\u0094\u0095\7\7\2\2\u0095\u009b\7*\2\2\u0096\u0097\7$\2\2"+
		"\u0097\u0098\7%\2\2\u0098\u0099\5\60\31\2\u0099\u009a\7&\2\2\u009a\u009c"+
		"\3\2\2\2\u009b\u0096\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d"+
		"z\3\2\2\2\u009d\177\3\2\2\2\u009d\u0084\3\2\2\2\u009d\u0089\3\2\2\2\u009d"+
		"\u0093\3\2\2\2\u009e\13\3\2\2\2\u009f\u00a0\7\3\2\2\u00a0\u00a8\7*\2\2"+
		"\u00a1\u00a2\7\4\2\2\u00a2\u00a8\7*\2\2\u00a3\u00a4\7\6\2\2\u00a4\u00a8"+
		"\7*\2\2\u00a5\u00a6\7\5\2\2\u00a6\u00a8\7*\2\2\u00a7\u009f\3\2\2\2\u00a7"+
		"\u00a1\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\r\3\2\2\2"+
		"\u00a9\u00aa\7*\2\2\u00aa\u00ab\7\b\2\2\u00ab\u00ac\5\20\t\2\u00ac\u00ad"+
		"\7\t\2\2\u00ad\17\3\2\2\2\u00ae\u00b3\5B\"\2\u00af\u00b0\7\37\2\2\u00b0"+
		"\u00b2\5B\"\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6"+
		"\u00ae\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\21\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7\25\2\2\u00bc\u00bd"+
		"\5<\37\2\u00bd\u00be\7\34\2\2\u00be\u00c2\5:\36\2\u00bf\u00c1\7\'\2\2"+
		"\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00d2\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7\26\2\2"+
		"\u00c6\u00c7\7\25\2\2\u00c7\u00c8\5<\37\2\u00c8\u00c9\7\34\2\2\u00c9\u00cd"+
		"\5:\36\2\u00ca\u00cc\7\'\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00d0\u00c5\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d8\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7\26"+
		"\2\2\u00d6\u00d7\7\34\2\2\u00d7\u00d9\5:\36\2\u00d8\u00d5\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\23\3\2\2\2\u00da\u00db\7\27\2\2\u00db\u00dc\5<\37"+
		"\2\u00dc\u00dd\7\30\2\2\u00dd\u00de\5:\36\2\u00de\25\3\2\2\2\u00df\u00e0"+
		"\7\32\2\2\u00e0\u00e1\5:\36\2\u00e1\u00e2\7\33\2\2\u00e2\u00e3\5<\37\2"+
		"\u00e3\27\3\2\2\2\u00e4\u00e5\7\31\2\2\u00e5\u00e6\7\b\2\2\u00e6\u00e7"+
		"\5\36\20\2\u00e7\u00e8\t\2\2\2\u00e8\u00e9\5\36\20\2\u00e9\u00ea\7\t\2"+
		"\2\u00ea\u00eb\5:\36\2\u00eb\31\3\2\2\2\u00ec\u00ef\7 \2\2\u00ed\u00f0"+
		"\5\36\20\2\u00ee\u00f0\5(\25\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2"+
		"\u00f0\33\3\2\2\2\u00f1\u00f2\7*\2\2\u00f2\u00f3\7$\2\2\u00f3\u0104\5"+
		"\36\20\2\u00f4\u00f5\7*\2\2\u00f5\u00f6\7$\2\2\u00f6\u0104\5\62\32\2\u00f7"+
		"\u00f8\7*\2\2\u00f8\u00f9\7$\2\2\u00f9\u0104\7+\2\2\u00fa\u00fb\7*\2\2"+
		"\u00fb\u00fc\7$\2\2\u00fc\u0104\5 \21\2\u00fd\u00fe\7*\2\2\u00fe\u00ff"+
		"\7$\2\2\u00ff\u0100\7%\2\2\u0100\u0101\5\60\31\2\u0101\u0102\7&\2\2\u0102"+
		"\u0104\3\2\2\2\u0103\u00f1\3\2\2\2\u0103\u00f4\3\2\2\2\u0103\u00f7\3\2"+
		"\2\2\u0103\u00fa\3\2\2\2\u0103\u00fd\3\2\2\2\u0104\u0106\3\2\2\2\u0105"+
		"\u0107\7\'\2\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\35\3\2\2"+
		"\2\u0108\u010c\5\"\22\2\u0109\u010c\5\16\b\2\u010a\u010c\7*\2\2\u010b"+
		"\u0108\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c\37\3\2\2"+
		"\2\u010d\u0111\5\"\22\2\u010e\u0111\5(\25\2\u010f\u0111\5.\30\2\u0110"+
		"\u010d\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111!\3\2\2\2"+
		"\u0112\u0117\5$\23\2\u0113\u0114\t\3\2\2\u0114\u0116\5$\23\2\u0115\u0113"+
		"\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"#\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011f\5&\24\2\u011b\u011c\t\4\2\2"+
		"\u011c\u011e\5&\24\2\u011d\u011b\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120%\3\2\2\2\u0121\u011f\3\2\2\2\u0122"+
		"\u0129\5\66\34\2\u0123\u0129\5\16\b\2\u0124\u0125\7\b\2\2\u0125\u0126"+
		"\5\"\22\2\u0126\u0127\7\t\2\2\u0127\u0129\3\2\2\2\u0128\u0122\3\2\2\2"+
		"\u0128\u0123\3\2\2\2\u0128\u0124\3\2\2\2\u0129\'\3\2\2\2\u012a\u012b\5"+
		"*\26\2\u012b)\3\2\2\2\u012c\u0133\5> \2\u012d\u012e\7\17\2\2\u012e\u0132"+
		"\5*\26\2\u012f\u0130\7\16\2\2\u0130\u0132\5*\26\2\u0131\u012d\3\2\2\2"+
		"\u0131\u012f\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134"+
		"\3\2\2\2\u0134\u013c\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0138\7\20\2\2"+
		"\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013c"+
		"\5> \2\u013a\u013c\5,\27\2\u013b\u012c\3\2\2\2\u013b\u0137\3\2\2\2\u013b"+
		"\u013a\3\2\2\2\u013c+\3\2\2\2\u013d\u0140\5\36\20\2\u013e\u013f\t\5\2"+
		"\2\u013f\u0141\5\36\20\2\u0140\u013e\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0149\3\2\2\2\u0144\u0145\7\b"+
		"\2\2\u0145\u0146\5*\26\2\u0146\u0147\7\t\2\2\u0147\u0149\3\2\2\2\u0148"+
		"\u013d\3\2\2\2\u0148\u0144\3\2\2\2\u0149-\3\2\2\2\u014a\u014b\t\6\2\2"+
		"\u014b\u014c\7\f\2\2\u014c\u014d\t\6\2\2\u014d/\3\2\2\2\u014e\u0153\5"+
		"B\"\2\u014f\u0150\7\37\2\2\u0150\u0152\5B\"\2\u0151\u014f\3\2\2\2\u0152"+
		"\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0157\3\2"+
		"\2\2\u0155\u0153\3\2\2\2\u0156\u014e\3\2\2\2\u0157\u015a\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\61\3\2\2\2\u015a\u0158\3\2\2"+
		"\2\u015b\u015c\7*\2\2\u015c\u015d\7#\2\2\u015d\u015e\7)\2\2\u015e\63\3"+
		"\2\2\2\u015f\u0160\7*\2\2\u0160\u0161\7#\2\2\u0161\u0162\7)\2\2\u0162"+
		"\u0163\7$\2\2\u0163\u0164\5B\"\2\u0164\65\3\2\2\2\u0165\u0166\t\7\2\2"+
		"\u0166\67\3\2\2\2\u0167\u016c\5\f\7\2\u0168\u0169\7\37\2\2\u0169\u016b"+
		"\5\f\7\2\u016a\u0168\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0167\3\2"+
		"\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"9\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0178\7%\2\2\u0175\u0177\5\6\4\2\u0176"+
		"\u0175\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2"+
		"\2\2\u0179\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\7&\2\2\u017c"+
		";\3\2\2\2\u017d\u017e\7\b\2\2\u017e\u017f\5(\25\2\u017f\u0180\7\t\2\2"+
		"\u0180=\3\2\2\2\u0181\u0182\t\b\2\2\u0182?\3\2\2\2\u0183\u0184\t\t\2\2"+
		"\u0184A\3\2\2\2\u0185\u0189\5\66\34\2\u0186\u0189\7+\2\2\u0187\u0189\7"+
		"\21\2\2\u0188\u0185\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0187\3\2\2\2\u0189"+
		"C\3\2\2\2\u018a\u018b\t\n\2\2\u018bE\3\2\2\2)HO^kx}\u0082\u0087\u008d"+
		"\u0091\u009b\u009d\u00a7\u00b3\u00b8\u00c2\u00cd\u00d2\u00d8\u00ef\u0103"+
		"\u0106\u010b\u0110\u0117\u011f\u0128\u0131\u0133\u0137\u013b\u0142\u0148"+
		"\u0153\u0158\u016c\u0171\u0178\u0188";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}