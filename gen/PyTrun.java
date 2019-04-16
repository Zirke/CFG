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
<<<<<<< HEAD
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(74);
					match(EOL);
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(82);
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
						setState(80);
						stmts();
						}
						break;
					case FUNCTION:
						{
						setState(81);
						functiondcl();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(90);
=======
			setState(68);
			stmts();
			setState(72);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL) {
				{
				{
<<<<<<< HEAD
				setState(87);
				match(EOL);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
=======
				setState(69);
				match(EOL);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
<<<<<<< HEAD
				setState(93);
=======
				setState(75);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(96);
			stmt();
			setState(101);
=======
			setState(78);
			stmt();
			setState(83);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
<<<<<<< HEAD
					setState(97);
					match(EOL);
					setState(98);
=======
					setState(79);
					match(EOL);
					setState(80);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
					stmt();
					}
					} 
				}
<<<<<<< HEAD
				setState(103);
=======
				setState(85);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(118);
=======
			setState(101);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(104);
=======
				setState(86);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				dcl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(105);
=======
				setState(87);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				ifstmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(106);
=======
				setState(88);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				whilestmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< HEAD
				setState(107);
=======
				setState(89);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				returnstmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
<<<<<<< HEAD
				setState(108);
=======
				setState(90);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				functioncall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
<<<<<<< HEAD
				setState(109);
=======
				setState(91);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				repeatuntilstmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
<<<<<<< HEAD
				setState(110);
=======
				setState(92);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				fromstmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
<<<<<<< HEAD
				setState(111);
=======
				setState(93);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				assignment();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
<<<<<<< HEAD
				setState(112);
=======
				setState(94);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				arradd();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
<<<<<<< HEAD
				setState(113);
=======
				setState(95);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				arrindex();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
<<<<<<< HEAD
				setState(114);
				drive();
=======
				setState(96);
				functiondcl();
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
<<<<<<< HEAD
				setState(115);
				turnleft();
=======
				setState(97);
				drive();
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
<<<<<<< HEAD
				setState(116);
				turnright();
=======
				setState(98);
				turnleft();
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
<<<<<<< HEAD
				setState(117);
=======
				setState(99);
				turnright();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(100);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
		public StmtblockContext stmtblock() {
			return getRuleContext(StmtblockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ARRDCL() { return getToken(PyTrun.ARRDCL, 0); }
<<<<<<< HEAD
=======
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
		public StmtblockContext stmtblock() {
			return getRuleContext(StmtblockContext.class,0);
		}
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(FUNCTION);
				setState(121);
				match(ID);
				setState(122);
				match(RETURNS);
				setState(125);
=======
			int _alt;
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(FUNCTION);
				setState(104);
				match(ID);
				setState(105);
				match(RETURNS);
				setState(108);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTDCL:
				case FLOATDCL:
				case TRUTHDCL:
				case TEXTDCL:
					{
<<<<<<< HEAD
					setState(123);
=======
					setState(106);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
					type();
					}
					break;
				case ARRDCL:
					{
<<<<<<< HEAD
					setState(124);
=======
					setState(107);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
					match(ARRDCL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
<<<<<<< HEAD
				setState(127);
				match(LPAR);
				setState(128);
				paramlist();
				setState(129);
				match(RPAR);
				setState(130);
				stmtblock();
=======
				setState(110);
				match(LPAR);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTDCL) | (1L << FLOATDCL) | (1L << TRUTHDCL) | (1L << TEXTDCL))) != 0)) {
					{
					{
					setState(111);
					truedcl();
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(112);
						match(COMMA);
						setState(113);
						truedcl();
						}
						}
						setState(118);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(124);
				match(RPAR);
				setState(125);
				match(LCB);
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(126);
						stmt();
						}
						} 
					}
					setState(131);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(132);
				returnstmt();
				setState(133);
				match(RCB);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(132);
				match(FUNCTION);
				setState(133);
				match(ID);
				setState(134);
				match(LPAR);
				setState(135);
				paramlist();
				setState(136);
				match(RPAR);
				setState(137);
=======
				setState(135);
				match(FUNCTION);
				setState(136);
				match(ID);
				setState(137);
				match(LPAR);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTDCL) | (1L << FLOATDCL) | (1L << TRUTHDCL) | (1L << TEXTDCL))) != 0)) {
					{
					{
					setState(138);
					truedcl();
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(139);
						match(COMMA);
						setState(140);
						truedcl();
						}
						}
						setState(145);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				match(RPAR);
				setState(152);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(INTDCL);
				setState(142);
				match(ID);
				setState(144);
=======
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(INTDCL);
				setState(156);
				match(ID);
				setState(158);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
<<<<<<< HEAD
					setState(143);
=======
					setState(157);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
					dclValue();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(146);
				match(FLOATDCL);
				setState(147);
				match(ID);
				setState(149);
=======
				setState(160);
				match(FLOATDCL);
				setState(161);
				match(ID);
				setState(163);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
<<<<<<< HEAD
					setState(148);
=======
					setState(162);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
					dclValue();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(151);
				match(TEXTDCL);
				setState(152);
				match(ID);
				setState(154);
=======
				setState(165);
				match(TEXTDCL);
				setState(166);
				match(ID);
				setState(168);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
<<<<<<< HEAD
					setState(153);
=======
					setState(167);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
					dclValue();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< HEAD
				setState(156);
				match(TRUTHDCL);
				setState(157);
				match(ID);
				setState(160);
=======
				setState(170);
				match(TRUTHDCL);
				setState(171);
				match(ID);
				setState(174);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
<<<<<<< HEAD
					setState(158);
					match(ASSIGN);
					setState(159);
=======
					setState(172);
					match(ASSIGN);
					setState(173);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
					truthexpr();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
<<<<<<< HEAD
				setState(162);
				type();
				setState(163);
				match(ARRDCL);
				setState(164);
				match(ID);
				setState(173);
=======
				setState(176);
				type();
				setState(177);
				match(ARRDCL);
				setState(178);
				match(ID);
				setState(198);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
<<<<<<< HEAD
					setState(165);
					match(ASSIGN);
					setState(171);
=======
					setState(179);
					match(ASSIGN);
					setState(196);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						{
<<<<<<< HEAD
						setState(166);
=======
						setState(180);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
						functioncall();
						}
						}
						break;
					case LCB:
						{
<<<<<<< HEAD
						setState(167);
						match(LCB);
						setState(168);
						arrelems();
						setState(169);
=======
						setState(181);
						match(LCB);
						setState(192);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUTHVAL) | (1L << FNUM) | (1L << INUM) | (1L << ID) | (1L << TEXT))) != 0)) {
							{
							{
							setState(182);
							types();
							setState(187);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(183);
								match(COMMA);
								setState(184);
								types();
								}
								}
								setState(189);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							}
							setState(194);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(195);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(177);
				match(ASSIGN);
				setState(178);
=======
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(202);
				match(ASSIGN);
				setState(203);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				value();
				}
				break;
			case 2:
				{
<<<<<<< HEAD
				setState(179);
				match(ASSIGN);
				setState(180);
=======
				setState(204);
				match(ASSIGN);
				setState(205);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				match(TEXT);
				}
				break;
			case 3:
				{
<<<<<<< HEAD
				setState(181);
				match(ASSIGN);
				setState(182);
=======
				setState(206);
				match(ASSIGN);
				setState(207);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(193);
=======
			setState(218);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTDCL:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(185);
				match(INTDCL);
				setState(186);
=======
				setState(210);
				match(INTDCL);
				setState(211);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				match(ID);
				}
				break;
			case FLOATDCL:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(187);
				match(FLOATDCL);
				setState(188);
=======
				setState(212);
				match(FLOATDCL);
				setState(213);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				match(ID);
				}
				break;
			case TEXTDCL:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(189);
				match(TEXTDCL);
				setState(190);
=======
				setState(214);
				match(TEXTDCL);
				setState(215);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				match(ID);
				}
				break;
			case TRUTHDCL:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< HEAD
				setState(191);
				match(TRUTHDCL);
				setState(192);
=======
				setState(216);
				match(TRUTHDCL);
				setState(217);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(ID);
			setState(196);
			match(LPAR);
			setState(197);
			args();
			setState(198);
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
=======
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(210);
=======
			setState(220);
			match(ID);
			setState(221);
			match(LPAR);
			setState(232);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUTHVAL) | (1L << FNUM) | (1L << INUM) | (1L << ID) | (1L << TEXT))) != 0)) {
				{
				{
<<<<<<< HEAD
				setState(200);
				types();
				setState(205);
=======
				setState(222);
				types();
				setState(227);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
<<<<<<< HEAD
					setState(201);
					match(COMMA);
					setState(202);
					types();
					}
					}
					setState(207);
=======
					setState(223);
					match(COMMA);
					setState(224);
					types();
					}
					}
					setState(229);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
<<<<<<< HEAD
				setState(212);
=======
				setState(234);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
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
<<<<<<< HEAD
			setState(213);
			match(IF);
			setState(214);
			truthpar();
			setState(215);
			match(THEN);
			setState(216);
			stmtblock();
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
=======
			setState(237);
			match(IF);
			setState(238);
			truthpar();
			setState(239);
			match(THEN);
			setState(240);
			stmtblock();
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
<<<<<<< HEAD
					setState(217);
=======
					setState(241);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
					match(EOL);
					}
					} 
				}
<<<<<<< HEAD
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
=======
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
<<<<<<< HEAD
					setState(223);
					match(ELSE);
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
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
=======
					setState(247);
					match(ELSE);
					setState(248);
					match(IF);
					setState(249);
					truthpar();
					setState(250);
					match(THEN);
					setState(251);
					stmtblock();
					setState(255);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
<<<<<<< HEAD
							setState(228);
=======
							setState(252);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
							match(EOL);
							}
							} 
						}
<<<<<<< HEAD
						setState(233);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
=======
						setState(257);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
					}
					}
					} 
				}
<<<<<<< HEAD
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(242);
=======
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(266);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
<<<<<<< HEAD
				setState(239);
				match(ELSE);
				setState(240);
				match(THEN);
				setState(241);
=======
				setState(263);
				match(ELSE);
				setState(264);
				match(THEN);
				setState(265);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(244);
			match(WHILE);
			setState(245);
			truthpar();
			setState(246);
			match(DO);
			setState(247);
=======
			setState(268);
			match(WHILE);
			setState(269);
			truthpar();
			setState(270);
			match(DO);
			setState(271);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(249);
			match(REPEAT);
			setState(250);
			stmtblock();
			setState(251);
			match(UNTIL);
			setState(252);
=======
			setState(273);
			match(REPEAT);
			setState(274);
			stmtblock();
			setState(275);
			match(UNTIL);
			setState(276);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(254);
			match(FROM);
			setState(255);
			match(LPAR);
			setState(256);
			value();
			setState(257);
=======
			setState(278);
			match(FROM);
			setState(279);
			match(LPAR);
			setState(280);
			value();
			setState(281);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
			_la = _input.LA(1);
			if ( !(_la==UPTO || _la==DOWNTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
<<<<<<< HEAD
			setState(258);
			value();
			setState(259);
			match(RPAR);
			setState(260);
=======
			setState(282);
			value();
			setState(283);
			match(RPAR);
			setState(284);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(262);
			match(RETURN);
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(263);
=======
			setState(286);
			match(RETURN);
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(287);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				value();
				}
				break;
			case 2:
				{
<<<<<<< HEAD
				setState(264);
=======
				setState(288);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				truthexpr();
				}
				break;
			}
<<<<<<< HEAD
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
=======
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
<<<<<<< HEAD
					setState(267);
=======
					setState(291);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
					match(EOL);
					}
					} 
				}
<<<<<<< HEAD
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
=======
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(273);
			match(ID);
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(274);
				match(ASSIGN);
				setState(275);
=======
			setState(297);
			match(ID);
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(298);
				match(ASSIGN);
				setState(299);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				value();
				}
				break;
			case 2:
				{
<<<<<<< HEAD
				setState(276);
				match(ASSIGN);
				setState(277);
=======
				setState(300);
				match(ASSIGN);
				setState(301);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				arrindex();
				}
				break;
			case 3:
				{
<<<<<<< HEAD
				setState(278);
				match(ASSIGN);
				setState(279);
=======
				setState(302);
				match(ASSIGN);
				setState(303);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				match(TEXT);
				}
				break;
			case 4:
				{
<<<<<<< HEAD
				setState(280);
				match(ASSIGN);
				setState(281);
=======
				setState(304);
				match(ASSIGN);
				setState(305);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				expr();
				}
				break;
			case 5:
				{
<<<<<<< HEAD
				setState(282);
				match(ASSIGN);
				setState(283);
				match(LCB);
				setState(284);
				arrelems();
				setState(285);
=======
				setState(306);
				match(ASSIGN);
				setState(307);
				match(LCB);
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUTHVAL) | (1L << FNUM) | (1L << INUM) | (1L << ID) | (1L << TEXT))) != 0)) {
					{
					{
					setState(308);
					types();
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(309);
						match(COMMA);
						setState(310);
						types();
						}
						}
						setState(315);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(321);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
=======
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				arithmexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(290);
=======
				setState(325);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				functioncall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(291);
=======
				setState(326);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				arrindex();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< HEAD
				setState(292);
=======
				setState(327);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
=======
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				arithmexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(296);
=======
				setState(331);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				truthexpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(297);
=======
				setState(332);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(300);
			multexpr();
			setState(305);
=======
			setState(335);
			multexpr();
			setState(340);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
<<<<<<< HEAD
				setState(301);
=======
				setState(336);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
<<<<<<< HEAD
				setState(302);
				multexpr();
				}
				}
				setState(307);
=======
				setState(337);
				multexpr();
				}
				}
				setState(342);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(308);
			parexpr();
			setState(313);
=======
			setState(343);
			parexpr();
			setState(348);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIMES || _la==DIVIDES) {
				{
				{
<<<<<<< HEAD
				setState(309);
=======
				setState(344);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				_la = _input.LA(1);
				if ( !(_la==TIMES || _la==DIVIDES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
<<<<<<< HEAD
				setState(310);
				parexpr();
				}
				}
				setState(315);
=======
				setState(345);
				parexpr();
				}
				}
				setState(350);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
=======
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				nums();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(317);
=======
				setState(352);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				functioncall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(318);
				match(LPAR);
				setState(319);
				arithmexpr();
				setState(320);
=======
				setState(353);
				match(LPAR);
				setState(354);
				arithmexpr();
				setState(355);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(324);
=======
			setState(359);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(327);
=======
			setState(362);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
<<<<<<< HEAD
				setState(326);
=======
				setState(361);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				match(NOT);
				}
			}

<<<<<<< HEAD
			setState(329);
			relationalexpr();
			setState(337);
=======
			setState(364);
			relationalexpr();
			setState(372);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
<<<<<<< HEAD
				setState(330);
=======
				setState(365);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
<<<<<<< HEAD
				setState(332);
=======
				setState(367);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
<<<<<<< HEAD
					setState(331);
=======
					setState(366);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
					match(NOT);
					}
				}

<<<<<<< HEAD
				setState(334);
				relationalexpr();
				}
				}
				setState(339);
=======
				setState(369);
				relationalexpr();
				}
				}
				setState(374);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				value();
				setState(343); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(341);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << GRTHAN) | (1L << LESSTHAN))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(342);
					value();
					}
					}
					setState(345); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << GRTHAN) | (1L << LESSTHAN))) != 0) );
=======
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				value();
				{
				setState(376);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << GRTHAN) | (1L << LESSTHAN))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(377);
				value();
				}
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(347);
				match(LPAR);
				setState(348);
				logicalexpr();
				setState(349);
=======
				setState(379);
				match(LPAR);
				setState(380);
				logicalexpr();
				setState(381);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(351);
=======
				setState(383);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(354);
=======
			setState(386);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
			_la = _input.LA(1);
			if ( !(_la==ID || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
<<<<<<< HEAD
			setState(355);
			match(PLUS);
			setState(356);
=======
			setState(387);
			match(PLUS);
			setState(388);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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

<<<<<<< HEAD
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
		enterRule(_localctx, 48, RULE_arrelems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUTHVAL) | (1L << FNUM) | (1L << INUM) | (1L << ID) | (1L << TEXT))) != 0)) {
				{
				{
				setState(358);
				types();
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(359);
					match(COMMA);
					setState(360);
					types();
					}
					}
					setState(365);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(370);
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

=======
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
		enterRule(_localctx, 46, RULE_arrindex);
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(371);
			match(ID);
			setState(372);
			match(ELEMENT);
			setState(373);
=======
			setState(390);
			match(ID);
			setState(391);
			match(ELEMENT);
			setState(392);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(375);
			match(ID);
			setState(376);
			match(ELEMENT);
			setState(377);
=======
			setState(394);
			match(ID);
			setState(395);
			match(ELEMENT);
			setState(396);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
			_la = _input.LA(1);
			if ( !(_la==INUM || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
<<<<<<< HEAD
			setState(378);
			match(ASSIGN);
			setState(379);
=======
			setState(397);
			match(ASSIGN);
			setState(398);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(381);
			match(DRIVE);
			setState(382);
			match(LPAR);
			setState(383);
			value();
			setState(384);
=======
			setState(400);
			match(DRIVE);
			setState(401);
			match(LPAR);
			setState(402);
			value();
			setState(403);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(386);
			match(TURNLEFT);
			setState(387);
			match(LPAR);
			setState(388);
			value();
			setState(389);
=======
			setState(405);
			match(TURNLEFT);
			setState(406);
			match(LPAR);
			setState(407);
			value();
			setState(408);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(391);
			match(TURNRIGHT);
			setState(392);
			match(LPAR);
			setState(393);
			value();
			setState(394);
=======
			setState(410);
			match(TURNRIGHT);
			setState(411);
			match(LPAR);
			setState(412);
			value();
			setState(413);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(396);
=======
			setState(415);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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

<<<<<<< HEAD
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
		enterRule(_localctx, 62, RULE_paramlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTDCL) | (1L << FLOATDCL) | (1L << TRUTHDCL) | (1L << TEXTDCL))) != 0)) {
				{
				{
				setState(398);
				truedcl();
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(399);
					match(COMMA);
					setState(400);
					truedcl();
					}
					}
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(410);
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

=======
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(411);
			match(LCB);
			setState(415);
=======
			setState(417);
			match(LCB);
			setState(421);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTDCL) | (1L << FLOATDCL) | (1L << TRUTHDCL) | (1L << TEXTDCL) | (1L << IF) | (1L << WHILE) | (1L << FROM) | (1L << REPEAT) | (1L << RETURN) | (1L << DRIVE) | (1L << TURNLEFT) | (1L << TURNRIGHT) | (1L << EOL) | (1L << ID))) != 0)) {
				{
				{
<<<<<<< HEAD
				setState(412);
				stmt();
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(418);
=======
				setState(418);
				stmt();
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(424);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(420);
			match(LPAR);
			setState(421);
			truthexpr();
			setState(422);
=======
			setState(426);
			match(LPAR);
			setState(427);
			truthexpr();
			setState(428);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(424);
=======
			setState(430);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(426);
=======
			setState(432);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
			setState(431);
=======
			setState(437);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FNUM:
			case INUM:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(428);
=======
				setState(434);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				nums();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(429);
=======
				setState(435);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
				match(TEXT);
				}
				break;
			case TRUTHVAL:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(430);
=======
				setState(436);
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
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
<<<<<<< HEAD
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u01b4\4\2\t\2"+
=======
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u01ba\4\2\t\2"+
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
<<<<<<< HEAD
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\7\2N\n\2\f\2\16\2Q\13\2\3\2\3"+
		"\2\7\2U\n\2\f\2\16\2X\13\2\3\2\7\2[\n\2\f\2\16\2^\13\2\3\2\5\2a\n\2\3"+
		"\3\3\3\3\3\7\3f\n\3\f\3\16\3i\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4y\n\4\3\5\3\5\3\5\3\5\3\5\5\5\u0080\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u008e\n\5\3\6\3\6\3\6\5"+
		"\6\u0093\n\6\3\6\3\6\3\6\5\6\u0098\n\6\3\6\3\6\3\6\5\6\u009d\n\6\3\6\3"+
		"\6\3\6\3\6\5\6\u00a3\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ae"+
		"\n\6\5\6\u00b0\n\6\5\6\u00b2\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ba\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c4\n\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\7\n\u00ce\n\n\f\n\16\n\u00d1\13\n\7\n\u00d3\n\n\f\n\16\n\u00d6"+
		"\13\n\3\13\3\13\3\13\3\13\3\13\7\13\u00dd\n\13\f\13\16\13\u00e0\13\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00e8\n\13\f\13\16\13\u00eb\13\13"+
		"\7\13\u00ed\n\13\f\13\16\13\u00f0\13\13\3\13\3\13\3\13\5\13\u00f5\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\5\17\u010c\n\17\3\17\7\17\u010f\n\17\f\17\16"+
		"\17\u0112\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u0122\n\20\3\21\3\21\3\21\3\21\5\21\u0128\n\21\3"+
		"\22\3\22\3\22\5\22\u012d\n\22\3\23\3\23\3\23\7\23\u0132\n\23\f\23\16\23"+
		"\u0135\13\23\3\24\3\24\3\24\7\24\u013a\n\24\f\24\16\24\u013d\13\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u0145\n\25\3\26\3\26\3\27\5\27\u014a\n"+
		"\27\3\27\3\27\3\27\5\27\u014f\n\27\3\27\7\27\u0152\n\27\f\27\16\27\u0155"+
		"\13\27\3\30\3\30\3\30\6\30\u015a\n\30\r\30\16\30\u015b\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u0163\n\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\7\32\u016c"+
		"\n\32\f\32\16\32\u016f\13\32\7\32\u0171\n\32\f\32\16\32\u0174\13\32\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3!\7"+
		"!\u0194\n!\f!\16!\u0197\13!\7!\u0199\n!\f!\16!\u019c\13!\3\"\3\"\7\"\u01a0"+
		"\n\"\f\"\16\"\u01a3\13\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3%\3%\3&\3&\3&\5&\u01b2"+
		"\n&\3&\2\2\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJ\2\f\3\2\35\36\3\2\f\r\3\2\n\13\3\2\16\17\3\2\22\24\3\2-"+
		".\3\2,-\3\2+-\4\2\21\21--\3\2\3\6\2\u01d4\2O\3\2\2\2\4b\3\2\2\2\6x\3\2"+
		"\2\2\b\u008d\3\2\2\2\n\u00b1\3\2\2\2\f\u00b9\3\2\2\2\16\u00c3\3\2\2\2"+
		"\20\u00c5\3\2\2\2\22\u00d4\3\2\2\2\24\u00d7\3\2\2\2\26\u00f6\3\2\2\2\30"+
		"\u00fb\3\2\2\2\32\u0100\3\2\2\2\34\u0108\3\2\2\2\36\u0113\3\2\2\2 \u0127"+
		"\3\2\2\2\"\u012c\3\2\2\2$\u012e\3\2\2\2&\u0136\3\2\2\2(\u0144\3\2\2\2"+
		"*\u0146\3\2\2\2,\u0149\3\2\2\2.\u0162\3\2\2\2\60\u0164\3\2\2\2\62\u0172"+
		"\3\2\2\2\64\u0175\3\2\2\2\66\u0179\3\2\2\28\u017f\3\2\2\2:\u0184\3\2\2"+
		"\2<\u0189\3\2\2\2>\u018e\3\2\2\2@\u019a\3\2\2\2B\u019d\3\2\2\2D\u01a6"+
		"\3\2\2\2F\u01aa\3\2\2\2H\u01ac\3\2\2\2J\u01b1\3\2\2\2LN\7*\2\2ML\3\2\2"+
		"\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PV\3\2\2\2QO\3\2\2\2RU\5\4\3\2SU\5\b\5"+
		"\2TR\3\2\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\\\3\2\2\2XV\3\2"+
		"\2\2Y[\7*\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]`\3\2\2\2^\\\3"+
		"\2\2\2_a\7\2\2\3`_\3\2\2\2`a\3\2\2\2a\3\3\2\2\2bg\5\6\4\2cd\7*\2\2df\5"+
		"\6\4\2ec\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\5\3\2\2\2ig\3\2\2\2jy"+
		"\5\n\6\2ky\5\24\13\2ly\5\26\f\2my\5\34\17\2ny\5\20\t\2oy\5\30\r\2py\5"+
		"\32\16\2qy\5\36\20\2ry\5\66\34\2sy\5\64\33\2ty\58\35\2uy\5:\36\2vy\5<"+
		"\37\2wy\7*\2\2xj\3\2\2\2xk\3\2\2\2xl\3\2\2\2xm\3\2\2\2xn\3\2\2\2xo\3\2"+
		"\2\2xp\3\2\2\2xq\3\2\2\2xr\3\2\2\2xs\3\2\2\2xt\3\2\2\2xu\3\2\2\2xv\3\2"+
		"\2\2xw\3\2\2\2y\7\3\2\2\2z{\7\"\2\2{|\7-\2\2|\177\7!\2\2}\u0080\5H%\2"+
		"~\u0080\7\7\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082"+
		"\7\b\2\2\u0082\u0083\5@!\2\u0083\u0084\7\t\2\2\u0084\u0085\5B\"\2\u0085"+
		"\u008e\3\2\2\2\u0086\u0087\7\"\2\2\u0087\u0088\7-\2\2\u0088\u0089\7\b"+
		"\2\2\u0089\u008a\5@!\2\u008a\u008b\7\t\2\2\u008b\u008c\5B\"\2\u008c\u008e"+
		"\3\2\2\2\u008dz\3\2\2\2\u008d\u0086\3\2\2\2\u008e\t\3\2\2\2\u008f\u0090"+
		"\7\3\2\2\u0090\u0092\7-\2\2\u0091\u0093\5\f\7\2\u0092\u0091\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u00b2\3\2\2\2\u0094\u0095\7\4\2\2\u0095\u0097\7-"+
		"\2\2\u0096\u0098\5\f\7\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u00b2\3\2\2\2\u0099\u009a\7\6\2\2\u009a\u009c\7-\2\2\u009b\u009d\5\f"+
		"\7\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00b2\3\2\2\2\u009e"+
		"\u009f\7\5\2\2\u009f\u00a2\7-\2\2\u00a0\u00a1\7$\2\2\u00a1\u00a3\5*\26"+
		"\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00b2\3\2\2\2\u00a4\u00a5"+
		"\5H%\2\u00a5\u00a6\7\7\2\2\u00a6\u00af\7-\2\2\u00a7\u00ad\7$\2\2\u00a8"+
		"\u00ae\5\20\t\2\u00a9\u00aa\7%\2\2\u00aa\u00ab\5\62\32\2\u00ab\u00ac\7"+
		"&\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ae"+
		"\u00b0\3\2\2\2\u00af\u00a7\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2"+
		"\2\2\u00b1\u008f\3\2\2\2\u00b1\u0094\3\2\2\2\u00b1\u0099\3\2\2\2\u00b1"+
		"\u009e\3\2\2\2\u00b1\u00a4\3\2\2\2\u00b2\13\3\2\2\2\u00b3\u00b4\7$\2\2"+
		"\u00b4\u00ba\5 \21\2\u00b5\u00b6\7$\2\2\u00b6\u00ba\7.\2\2\u00b7\u00b8"+
		"\7$\2\2\u00b8\u00ba\5\"\22\2\u00b9\u00b3\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\r\3\2\2\2\u00bb\u00bc\7\3\2\2\u00bc\u00c4\7-\2\2"+
		"\u00bd\u00be\7\4\2\2\u00be\u00c4\7-\2\2\u00bf\u00c0\7\6\2\2\u00c0\u00c4"+
		"\7-\2\2\u00c1\u00c2\7\5\2\2\u00c2\u00c4\7-\2\2\u00c3\u00bb\3\2\2\2\u00c3"+
		"\u00bd\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\17\3\2\2"+
		"\2\u00c5\u00c6\7-\2\2\u00c6\u00c7\7\b\2\2\u00c7\u00c8\5\22\n\2\u00c8\u00c9"+
		"\7\t\2\2\u00c9\21\3\2\2\2\u00ca\u00cf\5J&\2\u00cb\u00cc\7\37\2\2\u00cc"+
		"\u00ce\5J&\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2"+
		"\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00ca"+
		"\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\23\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7\25\2\2\u00d8\u00d9\5D#\2"+
		"\u00d9\u00da\7\34\2\2\u00da\u00de\5B\"\2\u00db\u00dd\7*\2\2\u00dc\u00db"+
		"\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00ee\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7\26\2\2\u00e2\u00e3\7"+
		"\25\2\2\u00e3\u00e4\5D#\2\u00e4\u00e5\7\34\2\2\u00e5\u00e9\5B\"\2\u00e6"+
		"\u00e8\7*\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec"+
		"\u00e1\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\u00f4\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7\26\2\2\u00f2"+
		"\u00f3\7\34\2\2\u00f3\u00f5\5B\"\2\u00f4\u00f1\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\25\3\2\2\2\u00f6\u00f7\7\27\2\2\u00f7\u00f8\5D#\2\u00f8\u00f9"+
		"\7\30\2\2\u00f9\u00fa\5B\"\2\u00fa\27\3\2\2\2\u00fb\u00fc\7\32\2\2\u00fc"+
		"\u00fd\5B\"\2\u00fd\u00fe\7\33\2\2\u00fe\u00ff\5D#\2\u00ff\31\3\2\2\2"+
		"\u0100\u0101\7\31\2\2\u0101\u0102\7\b\2\2\u0102\u0103\5 \21\2\u0103\u0104"+
		"\t\2\2\2\u0104\u0105\5 \21\2\u0105\u0106\7\t\2\2\u0106\u0107\5B\"\2\u0107"+
		"\33\3\2\2\2\u0108\u010b\7 \2\2\u0109\u010c\5 \21\2\u010a\u010c\5*\26\2"+
		"\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c\u0110\3\2\2\2\u010d\u010f"+
		"\7*\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\35\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0121\7-\2\2"+
		"\u0114\u0115\7$\2\2\u0115\u0122\5 \21\2\u0116\u0117\7$\2\2\u0117\u0122"+
		"\5\64\33\2\u0118\u0119\7$\2\2\u0119\u0122\7.\2\2\u011a\u011b\7$\2\2\u011b"+
		"\u0122\5\"\22\2\u011c\u011d\7$\2\2\u011d\u011e\7%\2\2\u011e\u011f\5\62"+
		"\32\2\u011f\u0120\7&\2\2\u0120\u0122\3\2\2\2\u0121\u0114\3\2\2\2\u0121"+
		"\u0116\3\2\2\2\u0121\u0118\3\2\2\2\u0121\u011a\3\2\2\2\u0121\u011c\3\2"+
		"\2\2\u0122\37\3\2\2\2\u0123\u0128\5$\23\2\u0124\u0128\5\20\t\2\u0125\u0128"+
		"\5\64\33\2\u0126\u0128\7-\2\2\u0127\u0123\3\2\2\2\u0127\u0124\3\2\2\2"+
		"\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128!\3\2\2\2\u0129\u012d\5"+
		"$\23\2\u012a\u012d\5*\26\2\u012b\u012d\5\60\31\2\u012c\u0129\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d#\3\2\2\2\u012e\u0133\5&\24\2"+
		"\u012f\u0130\t\3\2\2\u0130\u0132\5&\24\2\u0131\u012f\3\2\2\2\u0132\u0135"+
		"\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134%\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0136\u013b\5(\25\2\u0137\u0138\t\4\2\2\u0138\u013a\5("+
		"\25\2\u0139\u0137\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\'\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0145\5> \2\u013f"+
		"\u0145\5\20\t\2\u0140\u0141\7\b\2\2\u0141\u0142\5$\23\2\u0142\u0143\7"+
		"\t\2\2\u0143\u0145\3\2\2\2\u0144\u013e\3\2\2\2\u0144\u013f\3\2\2\2\u0144"+
		"\u0140\3\2\2\2\u0145)\3\2\2\2\u0146\u0147\5,\27\2\u0147+\3\2\2\2\u0148"+
		"\u014a\7\20\2\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3"+
		"\2\2\2\u014b\u0153\5.\30\2\u014c\u014e\t\5\2\2\u014d\u014f\7\20\2\2\u014e"+
		"\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\5."+
		"\30\2\u0151\u014c\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154-\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0159\5 \21\2"+
		"\u0157\u0158\t\6\2\2\u0158\u015a\5 \21\2\u0159\u0157\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u0163\3\2\2\2\u015d"+
		"\u015e\7\b\2\2\u015e\u015f\5,\27\2\u015f\u0160\7\t\2\2\u0160\u0163\3\2"+
		"\2\2\u0161\u0163\5F$\2\u0162\u0156\3\2\2\2\u0162\u015d\3\2\2\2\u0162\u0161"+
		"\3\2\2\2\u0163/\3\2\2\2\u0164\u0165\t\7\2\2\u0165\u0166\7\f\2\2\u0166"+
		"\u0167\t\7\2\2\u0167\61\3\2\2\2\u0168\u016d\5J&\2\u0169\u016a\7\37\2\2"+
		"\u016a\u016c\5J&\2\u016b\u0169\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b"+
		"\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u0170"+
		"\u0168\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2"+
		"\2\2\u0173\63\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\7-\2\2\u0176\u0177"+
		"\7#\2\2\u0177\u0178\7,\2\2\u0178\65\3\2\2\2\u0179\u017a\7-\2\2\u017a\u017b"+
		"\7#\2\2\u017b\u017c\t\b\2\2\u017c\u017d\7$\2\2\u017d\u017e\5J&\2\u017e"+
		"\67\3\2\2\2\u017f\u0180\7\'\2\2\u0180\u0181\7\b\2\2\u0181\u0182\5 \21"+
		"\2\u0182\u0183\7\t\2\2\u01839\3\2\2\2\u0184\u0185\7(\2\2\u0185\u0186\7"+
		"\b\2\2\u0186\u0187\5 \21\2\u0187\u0188\7\t\2\2\u0188;\3\2\2\2\u0189\u018a"+
		"\7)\2\2\u018a\u018b\7\b\2\2\u018b\u018c\5 \21\2\u018c\u018d\7\t\2\2\u018d"+
		"=\3\2\2\2\u018e\u018f\t\t\2\2\u018f?\3\2\2\2\u0190\u0195\5\16\b\2\u0191"+
		"\u0192\7\37\2\2\u0192\u0194\5\16\b\2\u0193\u0191\3\2\2\2\u0194\u0197\3"+
		"\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0199\3\2\2\2\u0197"+
		"\u0195\3\2\2\2\u0198\u0190\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2"+
		"\2\2\u019a\u019b\3\2\2\2\u019bA\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u01a1"+
		"\7%\2\2\u019e\u01a0\5\6\4\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1"+
		"\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a1\3\2"+
		"\2\2\u01a4\u01a5\7&\2\2\u01a5C\3\2\2\2\u01a6\u01a7\7\b\2\2\u01a7\u01a8"+
		"\5*\26\2\u01a8\u01a9\7\t\2\2\u01a9E\3\2\2\2\u01aa\u01ab\t\n\2\2\u01ab"+
		"G\3\2\2\2\u01ac\u01ad\t\13\2\2\u01adI\3\2\2\2\u01ae\u01b2\5> \2\u01af"+
		"\u01b2\7.\2\2\u01b0\u01b2\7\21\2\2\u01b1\u01ae\3\2\2\2\u01b1\u01af\3\2"+
		"\2\2\u01b1\u01b0\3\2\2\2\u01b2K\3\2\2\2-OTV\\`gx\177\u008d\u0092\u0097"+
		"\u009c\u00a2\u00ad\u00af\u00b1\u00b9\u00c3\u00cf\u00d4\u00de\u00e9\u00ee"+
		"\u00f4\u010b\u0110\u0121\u0127\u012c\u0133\u013b\u0144\u0149\u014e\u0153"+
		"\u015b\u0162\u016d\u0172\u0195\u019a\u01a1\u01b1";
=======
		"\t!\4\"\t\"\4#\t#\3\2\3\2\7\2I\n\2\f\2\16\2L\13\2\3\2\5\2O\n\2\3\3\3\3"+
		"\3\3\7\3T\n\3\f\3\16\3W\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4h\n\4\3\5\3\5\3\5\3\5\3\5\5\5o\n\5\3\5\3\5\3\5\3"+
		"\5\7\5u\n\5\f\5\16\5x\13\5\7\5z\n\5\f\5\16\5}\13\5\3\5\3\5\3\5\7\5\u0082"+
		"\n\5\f\5\16\5\u0085\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0090"+
		"\n\5\f\5\16\5\u0093\13\5\7\5\u0095\n\5\f\5\16\5\u0098\13\5\3\5\3\5\5\5"+
		"\u009c\n\5\3\6\3\6\3\6\5\6\u00a1\n\6\3\6\3\6\3\6\5\6\u00a6\n\6\3\6\3\6"+
		"\3\6\5\6\u00ab\n\6\3\6\3\6\3\6\3\6\5\6\u00b1\n\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6\u00bc\n\6\f\6\16\6\u00bf\13\6\7\6\u00c1\n\6\f\6\16"+
		"\6\u00c4\13\6\3\6\5\6\u00c7\n\6\5\6\u00c9\n\6\5\6\u00cb\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u00d3\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00dd"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\7\t\u00e4\n\t\f\t\16\t\u00e7\13\t\7\t\u00e9\n"+
		"\t\f\t\16\t\u00ec\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u00f5\n\n\f\n\16"+
		"\n\u00f8\13\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0100\n\n\f\n\16\n\u0103\13"+
		"\n\7\n\u0105\n\n\f\n\16\n\u0108\13\n\3\n\3\n\3\n\5\n\u010d\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\5\16\u0124\n\16\3\16\7\16\u0127\n\16\f\16\16\16\u012a"+
		"\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u013a\n\17\f\17\16\17\u013d\13\17\7\17\u013f\n\17\f\17\16\17"+
		"\u0142\13\17\3\17\5\17\u0145\n\17\3\20\3\20\3\20\3\20\5\20\u014b\n\20"+
		"\3\21\3\21\3\21\5\21\u0150\n\21\3\22\3\22\3\22\7\22\u0155\n\22\f\22\16"+
		"\22\u0158\13\22\3\23\3\23\3\23\7\23\u015d\n\23\f\23\16\23\u0160\13\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0168\n\24\3\25\3\25\3\26\5\26\u016d"+
		"\n\26\3\26\3\26\3\26\5\26\u0172\n\26\3\26\7\26\u0175\n\26\f\26\16\26\u0178"+
		"\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0183\n\27\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\7\37\u01a6\n\37\f\37\16\37\u01a9\13\37\3\37\3"+
		"\37\3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\5#\u01b8\n#\3#\2\2$\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\f\3\2\35\36"+
		"\3\2\f\r\3\2\n\13\3\2\16\17\3\2\22\24\3\2-.\3\2,-\3\2+-\4\2\21\21--\3"+
		"\2\3\6\2\u01df\2F\3\2\2\2\4P\3\2\2\2\6g\3\2\2\2\b\u009b\3\2\2\2\n\u00ca"+
		"\3\2\2\2\f\u00d2\3\2\2\2\16\u00dc\3\2\2\2\20\u00de\3\2\2\2\22\u00ef\3"+
		"\2\2\2\24\u010e\3\2\2\2\26\u0113\3\2\2\2\30\u0118\3\2\2\2\32\u0120\3\2"+
		"\2\2\34\u012b\3\2\2\2\36\u014a\3\2\2\2 \u014f\3\2\2\2\"\u0151\3\2\2\2"+
		"$\u0159\3\2\2\2&\u0167\3\2\2\2(\u0169\3\2\2\2*\u016c\3\2\2\2,\u0182\3"+
		"\2\2\2.\u0184\3\2\2\2\60\u0188\3\2\2\2\62\u018c\3\2\2\2\64\u0192\3\2\2"+
		"\2\66\u0197\3\2\2\28\u019c\3\2\2\2:\u01a1\3\2\2\2<\u01a3\3\2\2\2>\u01ac"+
		"\3\2\2\2@\u01b0\3\2\2\2B\u01b2\3\2\2\2D\u01b7\3\2\2\2FJ\5\4\3\2GI\7*\2"+
		"\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KN\3\2\2\2LJ\3\2\2\2MO\7\2\2"+
		"\3NM\3\2\2\2NO\3\2\2\2O\3\3\2\2\2PU\5\6\4\2QR\7*\2\2RT\5\6\4\2SQ\3\2\2"+
		"\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\5\3\2\2\2WU\3\2\2\2Xh\5\n\6\2Yh\5\22"+
		"\n\2Zh\5\24\13\2[h\5\32\16\2\\h\5\20\t\2]h\5\26\f\2^h\5\30\r\2_h\5\34"+
		"\17\2`h\5\62\32\2ah\5\60\31\2bh\5\b\5\2ch\5\64\33\2dh\5\66\34\2eh\58\35"+
		"\2fh\7*\2\2gX\3\2\2\2gY\3\2\2\2gZ\3\2\2\2g[\3\2\2\2g\\\3\2\2\2g]\3\2\2"+
		"\2g^\3\2\2\2g_\3\2\2\2g`\3\2\2\2ga\3\2\2\2gb\3\2\2\2gc\3\2\2\2gd\3\2\2"+
		"\2ge\3\2\2\2gf\3\2\2\2h\7\3\2\2\2ij\7\"\2\2jk\7-\2\2kn\7!\2\2lo\5B\"\2"+
		"mo\7\7\2\2nl\3\2\2\2nm\3\2\2\2op\3\2\2\2p{\7\b\2\2qv\5\16\b\2rs\7\37\2"+
		"\2su\5\16\b\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wz\3\2\2\2xv\3\2"+
		"\2\2yq\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177"+
		"\7\t\2\2\177\u0083\7%\2\2\u0080\u0082\5\6\4\2\u0081\u0080\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0086\u0087\5\32\16\2\u0087\u0088\7&\2\2\u0088"+
		"\u009c\3\2\2\2\u0089\u008a\7\"\2\2\u008a\u008b\7-\2\2\u008b\u0096\7\b"+
		"\2\2\u008c\u0091\5\16\b\2\u008d\u008e\7\37\2\2\u008e\u0090\5\16\b\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u008c\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\t\2\2\u009a\u009c\5<\37\2\u009b"+
		"i\3\2\2\2\u009b\u0089\3\2\2\2\u009c\t\3\2\2\2\u009d\u009e\7\3\2\2\u009e"+
		"\u00a0\7-\2\2\u009f\u00a1\5\f\7\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00cb\3\2\2\2\u00a2\u00a3\7\4\2\2\u00a3\u00a5\7-\2\2\u00a4"+
		"\u00a6\5\f\7\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00cb\3\2"+
		"\2\2\u00a7\u00a8\7\6\2\2\u00a8\u00aa\7-\2\2\u00a9\u00ab\5\f\7\2\u00aa"+
		"\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00cb\3\2\2\2\u00ac\u00ad\7\5"+
		"\2\2\u00ad\u00b0\7-\2\2\u00ae\u00af\7$\2\2\u00af\u00b1\5(\25\2\u00b0\u00ae"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00cb\3\2\2\2\u00b2\u00b3\5B\"\2\u00b3"+
		"\u00b4\7\7\2\2\u00b4\u00c8\7-\2\2\u00b5\u00c6\7$\2\2\u00b6\u00c7\5\20"+
		"\t\2\u00b7\u00c2\7%\2\2\u00b8\u00bd\5D#\2\u00b9\u00ba\7\37\2\2\u00ba\u00bc"+
		"\5D#\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00b8\3\2"+
		"\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\7&\2\2\u00c6\u00b6\3\2"+
		"\2\2\u00c6\u00b7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00b5\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u009d\3\2\2\2\u00ca\u00a2\3\2"+
		"\2\2\u00ca\u00a7\3\2\2\2\u00ca\u00ac\3\2\2\2\u00ca\u00b2\3\2\2\2\u00cb"+
		"\13\3\2\2\2\u00cc\u00cd\7$\2\2\u00cd\u00d3\5\36\20\2\u00ce\u00cf\7$\2"+
		"\2\u00cf\u00d3\7.\2\2\u00d0\u00d1\7$\2\2\u00d1\u00d3\5 \21\2\u00d2\u00cc"+
		"\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\r\3\2\2\2\u00d4"+
		"\u00d5\7\3\2\2\u00d5\u00dd\7-\2\2\u00d6\u00d7\7\4\2\2\u00d7\u00dd\7-\2"+
		"\2\u00d8\u00d9\7\6\2\2\u00d9\u00dd\7-\2\2\u00da\u00db\7\5\2\2\u00db\u00dd"+
		"\7-\2\2\u00dc\u00d4\3\2\2\2\u00dc\u00d6\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\17\3\2\2\2\u00de\u00df\7-\2\2\u00df\u00ea\7\b\2\2"+
		"\u00e0\u00e5\5D#\2\u00e1\u00e2\7\37\2\2\u00e2\u00e4\5D#\2\u00e3\u00e1"+
		"\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e0\3\2\2\2\u00e9\u00ec\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00ee\7\t\2\2\u00ee\21\3\2\2\2\u00ef\u00f0\7\25\2"+
		"\2\u00f0\u00f1\5> \2\u00f1\u00f2\7\34\2\2\u00f2\u00f6\5<\37\2\u00f3\u00f5"+
		"\7*\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u0106\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7\26"+
		"\2\2\u00fa\u00fb\7\25\2\2\u00fb\u00fc\5> \2\u00fc\u00fd\7\34\2\2\u00fd"+
		"\u0101\5<\37\2\u00fe\u0100\7*\2\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2"+
		"\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0105\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0104\u00f9\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2"+
		"\2\2\u0106\u0107\3\2\2\2\u0107\u010c\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010a\7\26\2\2\u010a\u010b\7\34\2\2\u010b\u010d\5<\37\2\u010c\u0109\3"+
		"\2\2\2\u010c\u010d\3\2\2\2\u010d\23\3\2\2\2\u010e\u010f\7\27\2\2\u010f"+
		"\u0110\5> \2\u0110\u0111\7\30\2\2\u0111\u0112\5<\37\2\u0112\25\3\2\2\2"+
		"\u0113\u0114\7\32\2\2\u0114\u0115\5<\37\2\u0115\u0116\7\33\2\2\u0116\u0117"+
		"\5> \2\u0117\27\3\2\2\2\u0118\u0119\7\31\2\2\u0119\u011a\7\b\2\2\u011a"+
		"\u011b\5\36\20\2\u011b\u011c\t\2\2\2\u011c\u011d\5\36\20\2\u011d\u011e"+
		"\7\t\2\2\u011e\u011f\5<\37\2\u011f\31\3\2\2\2\u0120\u0123\7 \2\2\u0121"+
		"\u0124\5\36\20\2\u0122\u0124\5(\25\2\u0123\u0121\3\2\2\2\u0123\u0122\3"+
		"\2\2\2\u0124\u0128\3\2\2\2\u0125\u0127\7*\2\2\u0126\u0125\3\2\2\2\u0127"+
		"\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\33\3\2\2"+
		"\2\u012a\u0128\3\2\2\2\u012b\u0144\7-\2\2\u012c\u012d\7$\2\2\u012d\u0145"+
		"\5\36\20\2\u012e\u012f\7$\2\2\u012f\u0145\5\60\31\2\u0130\u0131\7$\2\2"+
		"\u0131\u0145\7.\2\2\u0132\u0133\7$\2\2\u0133\u0145\5 \21\2\u0134\u0135"+
		"\7$\2\2\u0135\u0140\7%\2\2\u0136\u013b\5D#\2\u0137\u0138\7\37\2\2\u0138"+
		"\u013a\5D#\2\u0139\u0137\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2"+
		"\2\u013b\u013c\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0136"+
		"\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0145\7&\2\2\u0144\u012c\3\2"+
		"\2\2\u0144\u012e\3\2\2\2\u0144\u0130\3\2\2\2\u0144\u0132\3\2\2\2\u0144"+
		"\u0134\3\2\2\2\u0145\35\3\2\2\2\u0146\u014b\5\"\22\2\u0147\u014b\5\20"+
		"\t\2\u0148\u014b\5\60\31\2\u0149\u014b\7-\2\2\u014a\u0146\3\2\2\2\u014a"+
		"\u0147\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b\37\3\2\2"+
		"\2\u014c\u0150\5\"\22\2\u014d\u0150\5(\25\2\u014e\u0150\5.\30\2\u014f"+
		"\u014c\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150!\3\2\2\2"+
		"\u0151\u0156\5$\23\2\u0152\u0153\t\3\2\2\u0153\u0155\5$\23\2\u0154\u0152"+
		"\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"#\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015e\5&\24\2\u015a\u015b\t\4\2\2"+
		"\u015b\u015d\5&\24\2\u015c\u015a\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c"+
		"\3\2\2\2\u015e\u015f\3\2\2\2\u015f%\3\2\2\2\u0160\u015e\3\2\2\2\u0161"+
		"\u0168\5:\36\2\u0162\u0168\5\20\t\2\u0163\u0164\7\b\2\2\u0164\u0165\5"+
		"\"\22\2\u0165\u0166\7\t\2\2\u0166\u0168\3\2\2\2\u0167\u0161\3\2\2\2\u0167"+
		"\u0162\3\2\2\2\u0167\u0163\3\2\2\2\u0168\'\3\2\2\2\u0169\u016a\5*\26\2"+
		"\u016a)\3\2\2\2\u016b\u016d\7\20\2\2\u016c\u016b\3\2\2\2\u016c\u016d\3"+
		"\2\2\2\u016d\u016e\3\2\2\2\u016e\u0176\5,\27\2\u016f\u0171\t\5\2\2\u0170"+
		"\u0172\7\20\2\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3"+
		"\2\2\2\u0173\u0175\5,\27\2\u0174\u016f\3\2\2\2\u0175\u0178\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177+\3\2\2\2\u0178\u0176\3\2\2\2"+
		"\u0179\u017a\5\36\20\2\u017a\u017b\t\6\2\2\u017b\u017c\5\36\20\2\u017c"+
		"\u0183\3\2\2\2\u017d\u017e\7\b\2\2\u017e\u017f\5*\26\2\u017f\u0180\7\t"+
		"\2\2\u0180\u0183\3\2\2\2\u0181\u0183\5@!\2\u0182\u0179\3\2\2\2\u0182\u017d"+
		"\3\2\2\2\u0182\u0181\3\2\2\2\u0183-\3\2\2\2\u0184\u0185\t\7\2\2\u0185"+
		"\u0186\7\f\2\2\u0186\u0187\t\7\2\2\u0187/\3\2\2\2\u0188\u0189\7-\2\2\u0189"+
		"\u018a\7#\2\2\u018a\u018b\7,\2\2\u018b\61\3\2\2\2\u018c\u018d\7-\2\2\u018d"+
		"\u018e\7#\2\2\u018e\u018f\t\b\2\2\u018f\u0190\7$\2\2\u0190\u0191\5D#\2"+
		"\u0191\63\3\2\2\2\u0192\u0193\7\'\2\2\u0193\u0194\7\b\2\2\u0194\u0195"+
		"\5\36\20\2\u0195\u0196\7\t\2\2\u0196\65\3\2\2\2\u0197\u0198\7(\2\2\u0198"+
		"\u0199\7\b\2\2\u0199\u019a\5\36\20\2\u019a\u019b\7\t\2\2\u019b\67\3\2"+
		"\2\2\u019c\u019d\7)\2\2\u019d\u019e\7\b\2\2\u019e\u019f\5\36\20\2\u019f"+
		"\u01a0\7\t\2\2\u01a09\3\2\2\2\u01a1\u01a2\t\t\2\2\u01a2;\3\2\2\2\u01a3"+
		"\u01a7\7%\2\2\u01a4\u01a6\5\6\4\2\u01a5\u01a4\3\2\2\2\u01a6\u01a9\3\2"+
		"\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01aa\3\2\2\2\u01a9"+
		"\u01a7\3\2\2\2\u01aa\u01ab\7&\2\2\u01ab=\3\2\2\2\u01ac\u01ad\7\b\2\2\u01ad"+
		"\u01ae\5(\25\2\u01ae\u01af\7\t\2\2\u01af?\3\2\2\2\u01b0\u01b1\t\n\2\2"+
		"\u01b1A\3\2\2\2\u01b2\u01b3\t\13\2\2\u01b3C\3\2\2\2\u01b4\u01b8\5:\36"+
		"\2\u01b5\u01b8\7.\2\2\u01b6\u01b8\7\21\2\2\u01b7\u01b4\3\2\2\2\u01b7\u01b5"+
		"\3\2\2\2\u01b7\u01b6\3\2\2\2\u01b8E\3\2\2\2.JNUgnv{\u0083\u0091\u0096"+
		"\u009b\u00a0\u00a5\u00aa\u00b0\u00bd\u00c2\u00c6\u00c8\u00ca\u00d2\u00dc"+
		"\u00e5\u00ea\u00f6\u0101\u0106\u010c\u0123\u0128\u013b\u0140\u0144\u014a"+
		"\u014f\u0156\u015e\u0167\u016c\u0171\u0176\u0182\u01a7\u01b7";
>>>>>>> 232ac38ca52eddfd2113822da7de08ed3f4cee75
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}