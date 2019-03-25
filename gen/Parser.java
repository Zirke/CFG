// Generated from S:/JavaProjects/CFG/src\Parser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTDCL=1, FLOATDCL=2, TRUTHDCL=3, TEXTDCL=4, ARRDCL=5, LPAR=6, RPAR=7, 
		TIMES=8, DIVIDES=9, PLUS=10, MINUS=11, AND=12, OR=13, NOT=14, TRUTHID=15, 
		EQUALS=16, GRTHAN=17, LESSTHAN=18, IF=19, ELSE=20, WHILE=21, DO=22, FROM=23, 
		REPEAT=24, UNTIL=25, THEN=26, UPTO=27, DOWNTO=28, COMMA=29, RETURN=30, 
		RETURNS=31, FUNCTION=32, ASSIGN=33, LCB=34, RCB=35, EOL=36, FNUM=37, INUM=38, 
		ID=39, TEXT=40, BLOCKCOMMENT=41, WS=42;
	public static final int
		RULE_start = 0, RULE_stmt = 1, RULE_stmtblock = 2, RULE_truthpar = 3, 
		RULE_dcl = 4, RULE_functiondcl = 5, RULE_paramlist = 6, RULE_truedcl = 7, 
		RULE_functioncall = 8, RULE_args = 9, RULE_ifstmt = 10, RULE_whilestmt = 11, 
		RULE_repeatuntilstmt = 12, RULE_fromstmt = 13, RULE_returnstmt = 14, RULE_assignment = 15, 
		RULE_value = 16, RULE_addexpr = 17, RULE_multexpr = 18, RULE_parexpr = 19, 
		RULE_truthexpr = 20, RULE_truth = 21, RULE_type = 22, RULE_nums = 23, 
		RULE_types = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "stmt", "stmtblock", "truthpar", "dcl", "functiondcl", "paramlist", 
			"truedcl", "functioncall", "args", "ifstmt", "whilestmt", "repeatuntilstmt", 
			"fromstmt", "returnstmt", "assignment", "value", "addexpr", "multexpr", 
			"parexpr", "truthexpr", "truth", "type", "nums", "types"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'integer'", "'decimal'", "'truth'", "'text'", "'array'", "'('", 
			"')'", "'*'", "'/'", "'+'", "'-'", "'and'", "'or'", "'!'", null, "'='", 
			"'>'", "'<'", "'if'", "'else'", "'while'", "'do'", "'from'", "'repeat'", 
			"'until'", "'then'", "'upto'", "'downto'", "','", "'return'", "'returns'", 
			"'function'", "'is'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INTDCL", "FLOATDCL", "TRUTHDCL", "TEXTDCL", "ARRDCL", "LPAR", 
			"RPAR", "TIMES", "DIVIDES", "PLUS", "MINUS", "AND", "OR", "NOT", "TRUTHID", 
			"EQUALS", "GRTHAN", "LESSTHAN", "IF", "ELSE", "WHILE", "DO", "FROM", 
			"REPEAT", "UNTIL", "THEN", "UPTO", "DOWNTO", "COMMA", "RETURN", "RETURNS", 
			"FUNCTION", "ASSIGN", "LCB", "RCB", "EOL", "FNUM", "INUM", "ID", "TEXT", 
			"BLOCKCOMMENT", "WS"
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
	public String getGrammarFileName() { return "Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Parser.EOF, 0); }
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
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTDCL) | (1L << FLOATDCL) | (1L << TRUTHDCL) | (1L << TEXTDCL) | (1L << ARRDCL) | (1L << IF) | (1L << WHILE) | (1L << FROM) | (1L << REPEAT) | (1L << RETURN) | (1L << FUNCTION) | (1L << EOL) | (1L << ID))) != 0)) {
				{
				setState(52);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNCTION:
					{
					setState(50);
					functiondcl();
					}
					break;
				case INTDCL:
				case FLOATDCL:
				case TRUTHDCL:
				case TEXTDCL:
				case ARRDCL:
				case IF:
				case WHILE:
				case FROM:
				case REPEAT:
				case RETURN:
				case EOL:
				case ID:
					{
					setState(51);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(EOF);
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
		public TerminalNode EOL() { return getToken(Parser.EOL, 0); }
		public RepeatuntilstmtContext repeatuntilstmt() {
			return getRuleContext(RepeatuntilstmtContext.class,0);
		}
		public FromstmtContext fromstmt() {
			return getRuleContext(FromstmtContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				dcl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				ifstmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				whilestmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				returnstmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				functioncall();
				setState(64);
				match(EOL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				repeatuntilstmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				fromstmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(68);
				assignment();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(69);
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

	public static class StmtblockContext extends ParserRuleContext {
		public TerminalNode LCB() { return getToken(Parser.LCB, 0); }
		public TerminalNode RCB() { return getToken(Parser.RCB, 0); }
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
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterStmtblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitStmtblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitStmtblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtblockContext stmtblock() throws RecognitionException {
		StmtblockContext _localctx = new StmtblockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmtblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(LCB);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTDCL) | (1L << FLOATDCL) | (1L << TRUTHDCL) | (1L << TEXTDCL) | (1L << ARRDCL) | (1L << IF) | (1L << WHILE) | (1L << FROM) | (1L << REPEAT) | (1L << RETURN) | (1L << EOL) | (1L << ID))) != 0)) {
				{
				{
				setState(73);
				stmt();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
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
		public TerminalNode LPAR() { return getToken(Parser.LPAR, 0); }
		public TruthexprContext truthexpr() {
			return getRuleContext(TruthexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Parser.RPAR, 0); }
		public TruthparContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truthpar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterTruthpar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitTruthpar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitTruthpar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruthparContext truthpar() throws RecognitionException {
		TruthparContext _localctx = new TruthparContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_truthpar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(LPAR);
			setState(82);
			truthexpr();
			setState(83);
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

	public static class DclContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(Parser.EOL, 0); }
		public TerminalNode INTDCL() { return getToken(Parser.INTDCL, 0); }
		public List<TerminalNode> ID() { return getTokens(Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Parser.ID, i);
		}
		public TerminalNode FLOATDCL() { return getToken(Parser.FLOATDCL, 0); }
		public TerminalNode TEXTDCL() { return getToken(Parser.TEXTDCL, 0); }
		public TerminalNode TRUTHDCL() { return getToken(Parser.TRUTHDCL, 0); }
		public TerminalNode ARRDCL() { return getToken(Parser.ARRDCL, 0); }
		public TerminalNode ASSIGN() { return getToken(Parser.ASSIGN, 0); }
		public TerminalNode LCB() { return getToken(Parser.LCB, 0); }
		public TerminalNode RCB() { return getToken(Parser.RCB, 0); }
		public TerminalNode TEXT() { return getToken(Parser.TEXT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TruthexprContext truthexpr() {
			return getRuleContext(TruthexprContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTDCL:
				{
				setState(85);
				match(INTDCL);
				setState(86);
				match(ID);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(87);
					match(ASSIGN);
					{
					setState(88);
					value();
					}
					}
				}

				}
				break;
			case FLOATDCL:
				{
				setState(91);
				match(FLOATDCL);
				setState(92);
				match(ID);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(93);
					match(ASSIGN);
					{
					setState(94);
					value();
					}
					}
				}

				}
				break;
			case TEXTDCL:
				{
				setState(97);
				match(TEXTDCL);
				setState(98);
				match(ID);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(99);
					match(ASSIGN);
					setState(100);
					match(TEXT);
					}
				}

				}
				break;
			case TRUTHDCL:
				{
				setState(103);
				match(TRUTHDCL);
				setState(104);
				match(ID);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(105);
					match(ASSIGN);
					{
					setState(106);
					truthexpr();
					}
					}
				}

				}
				break;
			case ARRDCL:
				{
				setState(109);
				match(ARRDCL);
				setState(110);
				match(ID);
				{
				setState(111);
				match(ASSIGN);
				setState(112);
				match(LCB);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(113);
					match(ID);
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(114);
						match(COMMA);
						setState(115);
						match(ID);
						}
						}
						setState(120);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(126);
				match(RCB);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(129);
			match(EOL);
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
		public TerminalNode FUNCTION() { return getToken(Parser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public TerminalNode RETURNS() { return getToken(Parser.RETURNS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(Parser.LPAR, 0); }
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Parser.RPAR, 0); }
		public TerminalNode LCB() { return getToken(Parser.LCB, 0); }
		public ReturnstmtContext returnstmt() {
			return getRuleContext(ReturnstmtContext.class,0);
		}
		public TerminalNode RCB() { return getToken(Parser.RCB, 0); }
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
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterFunctiondcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitFunctiondcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFunctiondcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondclContext functiondcl() throws RecognitionException {
		FunctiondclContext _localctx = new FunctiondclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functiondcl);
		try {
			int _alt;
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(FUNCTION);
				setState(132);
				match(ID);
				setState(133);
				match(RETURNS);
				setState(134);
				type();
				setState(135);
				match(LPAR);
				setState(136);
				paramlist();
				setState(137);
				match(RPAR);
				setState(138);
				match(LCB);
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(139);
						stmt();
						}
						} 
					}
					setState(144);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(145);
				returnstmt();
				setState(146);
				match(RCB);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(FUNCTION);
				setState(149);
				match(ID);
				setState(150);
				match(LPAR);
				setState(151);
				paramlist();
				setState(152);
				match(RPAR);
				setState(153);
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

	public static class ParamlistContext extends ParserRuleContext {
		public List<TruedclContext> truedcl() {
			return getRuleContexts(TruedclContext.class);
		}
		public TruedclContext truedcl(int i) {
			return getRuleContext(TruedclContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ParamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterParamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitParamlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitParamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamlistContext paramlist() throws RecognitionException {
		ParamlistContext _localctx = new ParamlistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_paramlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTDCL) | (1L << FLOATDCL) | (1L << TRUTHDCL) | (1L << TEXTDCL))) != 0)) {
				{
				{
				setState(157);
				truedcl();
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(158);
					match(COMMA);
					setState(159);
					truedcl();
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(169);
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

	public static class TruedclContext extends ParserRuleContext {
		public TerminalNode INTDCL() { return getToken(Parser.INTDCL, 0); }
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public TerminalNode FLOATDCL() { return getToken(Parser.FLOATDCL, 0); }
		public TerminalNode TEXTDCL() { return getToken(Parser.TEXTDCL, 0); }
		public TerminalNode TRUTHDCL() { return getToken(Parser.TRUTHDCL, 0); }
		public TruedclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truedcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterTruedcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitTruedcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitTruedcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruedclContext truedcl() throws RecognitionException {
		TruedclContext _localctx = new TruedclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_truedcl);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTDCL:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(INTDCL);
				setState(171);
				match(ID);
				}
				break;
			case FLOATDCL:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(FLOATDCL);
				setState(173);
				match(ID);
				}
				break;
			case TEXTDCL:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				match(TEXTDCL);
				setState(175);
				match(ID);
				}
				break;
			case TRUTHDCL:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				match(TRUTHDCL);
				setState(177);
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
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public TerminalNode LPAR() { return getToken(Parser.LPAR, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Parser.RPAR, 0); }
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitFunctioncall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ID);
			setState(181);
			match(LPAR);
			setState(182);
			args();
			setState(183);
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
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUTHID) | (1L << FNUM) | (1L << INUM) | (1L << ID) | (1L << TEXT))) != 0)) {
				{
				{
				setState(185);
				types();
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(186);
					match(COMMA);
					setState(187);
					types();
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(197);
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
		public List<TerminalNode> IF() { return getTokens(Parser.IF); }
		public TerminalNode IF(int i) {
			return getToken(Parser.IF, i);
		}
		public List<TruthparContext> truthpar() {
			return getRuleContexts(TruthparContext.class);
		}
		public TruthparContext truthpar(int i) {
			return getRuleContext(TruthparContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(Parser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(Parser.THEN, i);
		}
		public List<StmtblockContext> stmtblock() {
			return getRuleContexts(StmtblockContext.class);
		}
		public StmtblockContext stmtblock(int i) {
			return getRuleContext(StmtblockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(Parser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(Parser.ELSE, i);
		}
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitIfstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIfstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifstmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(IF);
			setState(199);
			truthpar();
			setState(200);
			match(THEN);
			setState(201);
			stmtblock();
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(202);
					match(ELSE);
					setState(203);
					match(IF);
					setState(204);
					truthpar();
					setState(205);
					match(THEN);
					setState(206);
					stmtblock();
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(213);
				match(ELSE);
				setState(214);
				match(THEN);
				setState(215);
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
		public TerminalNode WHILE() { return getToken(Parser.WHILE, 0); }
		public TruthparContext truthpar() {
			return getRuleContext(TruthparContext.class,0);
		}
		public TerminalNode DO() { return getToken(Parser.DO, 0); }
		public StmtblockContext stmtblock() {
			return getRuleContext(StmtblockContext.class,0);
		}
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterWhilestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitWhilestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitWhilestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(WHILE);
			setState(219);
			truthpar();
			setState(220);
			match(DO);
			setState(221);
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
		public TerminalNode REPEAT() { return getToken(Parser.REPEAT, 0); }
		public StmtblockContext stmtblock() {
			return getRuleContext(StmtblockContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(Parser.UNTIL, 0); }
		public TruthparContext truthpar() {
			return getRuleContext(TruthparContext.class,0);
		}
		public RepeatuntilstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatuntilstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterRepeatuntilstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitRepeatuntilstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitRepeatuntilstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatuntilstmtContext repeatuntilstmt() throws RecognitionException {
		RepeatuntilstmtContext _localctx = new RepeatuntilstmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_repeatuntilstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(REPEAT);
			setState(224);
			stmtblock();
			setState(225);
			match(UNTIL);
			setState(226);
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
		public TerminalNode FROM() { return getToken(Parser.FROM, 0); }
		public TerminalNode LPAR() { return getToken(Parser.LPAR, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(Parser.RPAR, 0); }
		public StmtblockContext stmtblock() {
			return getRuleContext(StmtblockContext.class,0);
		}
		public TerminalNode UPTO() { return getToken(Parser.UPTO, 0); }
		public TerminalNode DOWNTO() { return getToken(Parser.DOWNTO, 0); }
		public FromstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterFromstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitFromstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFromstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromstmtContext fromstmt() throws RecognitionException {
		FromstmtContext _localctx = new FromstmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fromstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(FROM);
			setState(229);
			match(LPAR);
			setState(230);
			value();
			setState(231);
			_la = _input.LA(1);
			if ( !(_la==UPTO || _la==DOWNTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(232);
			value();
			setState(233);
			match(RPAR);
			setState(234);
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
		public TerminalNode RETURN() { return getToken(Parser.RETURN, 0); }
		public TerminalNode EOL() { return getToken(Parser.EOL, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TruthexprContext> truthexpr() {
			return getRuleContexts(TruthexprContext.class);
		}
		public TruthexprContext truthexpr(int i) {
			return getRuleContext(TruthexprContext.class,i);
		}
		public ReturnstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterReturnstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitReturnstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitReturnstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnstmtContext returnstmt() throws RecognitionException {
		ReturnstmtContext _localctx = new ReturnstmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(RETURN);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << NOT) | (1L << TRUTHID) | (1L << FNUM) | (1L << INUM) | (1L << ID))) != 0)) {
				{
				setState(239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(237);
					value();
					}
					break;
				case 2:
					{
					setState(238);
					truthexpr();
					}
					break;
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			match(EOL);
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
		public TerminalNode EOL() { return getToken(Parser.EOL, 0); }
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Parser.ASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TruthexprContext truthexpr() {
			return getRuleContext(TruthexprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(246);
				match(ID);
				setState(247);
				match(ASSIGN);
				setState(248);
				value();
				}
				break;
			case 2:
				{
				setState(249);
				match(ID);
				setState(250);
				match(ASSIGN);
				setState(251);
				truthexpr();
				}
				break;
			}
			setState(254);
			match(EOL);
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
		public AddexprContext addexpr() {
			return getRuleContext(AddexprContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_value);
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				addexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
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

	public static class AddexprContext extends ParserRuleContext {
		public List<MultexprContext> multexpr() {
			return getRuleContexts(MultexprContext.class);
		}
		public MultexprContext multexpr(int i) {
			return getRuleContext(MultexprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(Parser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(Parser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(Parser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(Parser.MINUS, i);
		}
		public AddexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAddexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAddexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAddexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddexprContext addexpr() throws RecognitionException {
		AddexprContext _localctx = new AddexprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_addexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			multexpr();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(261);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(262);
				multexpr();
				}
				}
				setState(267);
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
		public List<TerminalNode> TIMES() { return getTokens(Parser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(Parser.TIMES, i);
		}
		public List<TerminalNode> DIVIDES() { return getTokens(Parser.DIVIDES); }
		public TerminalNode DIVIDES(int i) {
			return getToken(Parser.DIVIDES, i);
		}
		public MultexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterMultexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitMultexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitMultexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultexprContext multexpr() throws RecognitionException {
		MultexprContext _localctx = new MultexprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			parexpr();
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIMES || _la==DIVIDES) {
				{
				{
				setState(269);
				_la = _input.LA(1);
				if ( !(_la==TIMES || _la==DIVIDES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(270);
				parexpr();
				}
				}
				setState(275);
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
		public TerminalNode LPAR() { return getToken(Parser.LPAR, 0); }
		public AddexprContext addexpr() {
			return getRuleContext(AddexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Parser.RPAR, 0); }
		public ParexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterParexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitParexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitParexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParexprContext parexpr() throws RecognitionException {
		ParexprContext _localctx = new ParexprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parexpr);
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FNUM:
			case INUM:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				nums();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(LPAR);
				setState(278);
				addexpr();
				setState(279);
				match(RPAR);
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

	public static class TruthexprContext extends ParserRuleContext {
		public TruthContext truth() {
			return getRuleContext(TruthContext.class,0);
		}
		public List<TerminalNode> OR() { return getTokens(Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(Parser.OR, i);
		}
		public List<TerminalNode> AND() { return getTokens(Parser.AND); }
		public TerminalNode AND(int i) {
			return getToken(Parser.AND, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(Parser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(Parser.EQUALS, i);
		}
		public List<TerminalNode> GRTHAN() { return getTokens(Parser.GRTHAN); }
		public TerminalNode GRTHAN(int i) {
			return getToken(Parser.GRTHAN, i);
		}
		public List<TerminalNode> LESSTHAN() { return getTokens(Parser.LESSTHAN); }
		public TerminalNode LESSTHAN(int i) {
			return getToken(Parser.LESSTHAN, i);
		}
		public TerminalNode TRUTHID() { return getToken(Parser.TRUTHID, 0); }
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public TerminalNode NOT() { return getToken(Parser.NOT, 0); }
		public TerminalNode LPAR() { return getToken(Parser.LPAR, 0); }
		public TruthexprContext truthexpr() {
			return getRuleContext(TruthexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Parser.RPAR, 0); }
		public TruthexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truthexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterTruthexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitTruthexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitTruthexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruthexprContext truthexpr() throws RecognitionException {
		TruthexprContext _localctx = new TruthexprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_truthexpr);
		int _la;
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				truth();
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(284);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				value();
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << GRTHAN) | (1L << LESSTHAN))) != 0)) {
					{
					{
					setState(291);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << GRTHAN) | (1L << LESSTHAN))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(292);
					value();
					}
					}
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(298);
					match(NOT);
					}
				}

				setState(301);
				_la = _input.LA(1);
				if ( !(_la==TRUTHID || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
				match(LPAR);
				setState(303);
				truthexpr();
				setState(304);
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

	public static class TruthContext extends ParserRuleContext {
		public TerminalNode TRUTHID() { return getToken(Parser.TRUTHID, 0); }
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public TruthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterTruth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitTruth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitTruth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruthContext truth() throws RecognitionException {
		TruthContext _localctx = new TruthContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_truth);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_la = _input.LA(1);
			if ( !(_la==TRUTHID || _la==ID) ) {
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
		public TerminalNode INTDCL() { return getToken(Parser.INTDCL, 0); }
		public TerminalNode FLOATDCL() { return getToken(Parser.FLOATDCL, 0); }
		public TerminalNode TRUTHDCL() { return getToken(Parser.TRUTHDCL, 0); }
		public TerminalNode TEXTDCL() { return getToken(Parser.TEXTDCL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
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

	public static class NumsContext extends ParserRuleContext {
		public TerminalNode INUM() { return getToken(Parser.INUM, 0); }
		public TerminalNode FNUM() { return getToken(Parser.FNUM, 0); }
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public NumsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nums; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterNums(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitNums(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNums(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumsContext nums() throws RecognitionException {
		NumsContext _localctx = new NumsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_nums);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
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

	public static class TypesContext extends ParserRuleContext {
		public NumsContext nums() {
			return getRuleContext(NumsContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(Parser.TEXT, 0); }
		public TerminalNode TRUTHID() { return getToken(Parser.TRUTHID, 0); }
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_types);
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FNUM:
			case INUM:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				nums();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(TEXT);
				}
				break;
			case TRUTHID:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				match(TRUTHID);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0142\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3I\n\3\3\4\3\4\7\4M\n\4\f\4\16\4P\13\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\\\n\6\3\6\3\6\3\6\3\6\5\6b"+
		"\n\6\3\6\3\6\3\6\3\6\5\6h\n\6\3\6\3\6\3\6\3\6\5\6n\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6w\n\6\f\6\16\6z\13\6\7\6|\n\6\f\6\16\6\177\13\6\3\6\5"+
		"\6\u0082\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u008f\n\7"+
		"\f\7\16\7\u0092\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009e"+
		"\n\7\3\b\3\b\3\b\7\b\u00a3\n\b\f\b\16\b\u00a6\13\b\7\b\u00a8\n\b\f\b\16"+
		"\b\u00ab\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b5\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\7\13\u00bf\n\13\f\13\16\13\u00c2\13\13\7\13"+
		"\u00c4\n\13\f\13\16\13\u00c7\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\7\f\u00d3\n\f\f\f\16\f\u00d6\13\f\3\f\3\f\3\f\5\f\u00db\n\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\7\20\u00f2\n\20\f\20\16\20\u00f5\13\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ff\n\21\3\21\3\21\3\22\3\22"+
		"\5\22\u0105\n\22\3\23\3\23\3\23\7\23\u010a\n\23\f\23\16\23\u010d\13\23"+
		"\3\24\3\24\3\24\7\24\u0112\n\24\f\24\16\24\u0115\13\24\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u011c\n\25\3\26\3\26\7\26\u0120\n\26\f\26\16\26\u0123"+
		"\13\26\3\26\3\26\3\26\7\26\u0128\n\26\f\26\16\26\u012b\13\26\3\26\5\26"+
		"\u012e\n\26\3\26\3\26\3\26\3\26\3\26\5\26\u0135\n\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\32\5\32\u0140\n\32\3\32\2\2\33\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\n\3\2\35\36\3\2\f\r\3\2\n\13"+
		"\3\2\16\17\3\2\22\24\4\2\21\21))\3\2\3\6\3\2\')\2\u0157\28\3\2\2\2\4H"+
		"\3\2\2\2\6J\3\2\2\2\bS\3\2\2\2\n\u0081\3\2\2\2\f\u009d\3\2\2\2\16\u00a9"+
		"\3\2\2\2\20\u00b4\3\2\2\2\22\u00b6\3\2\2\2\24\u00c5\3\2\2\2\26\u00c8\3"+
		"\2\2\2\30\u00dc\3\2\2\2\32\u00e1\3\2\2\2\34\u00e6\3\2\2\2\36\u00ee\3\2"+
		"\2\2 \u00fe\3\2\2\2\"\u0104\3\2\2\2$\u0106\3\2\2\2&\u010e\3\2\2\2(\u011b"+
		"\3\2\2\2*\u0134\3\2\2\2,\u0136\3\2\2\2.\u0138\3\2\2\2\60\u013a\3\2\2\2"+
		"\62\u013f\3\2\2\2\64\67\5\f\7\2\65\67\5\4\3\2\66\64\3\2\2\2\66\65\3\2"+
		"\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\2\2\3<"+
		"\3\3\2\2\2=I\5\n\6\2>I\5\26\f\2?I\5\30\r\2@I\5\36\20\2AB\5\22\n\2BC\7"+
		"&\2\2CI\3\2\2\2DI\5\32\16\2EI\5\34\17\2FI\5 \21\2GI\7&\2\2H=\3\2\2\2H"+
		">\3\2\2\2H?\3\2\2\2H@\3\2\2\2HA\3\2\2\2HD\3\2\2\2HE\3\2\2\2HF\3\2\2\2"+
		"HG\3\2\2\2I\5\3\2\2\2JN\7$\2\2KM\5\4\3\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2"+
		"NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7%\2\2R\7\3\2\2\2ST\7\b\2\2TU\5*\26\2"+
		"UV\7\t\2\2V\t\3\2\2\2WX\7\3\2\2X[\7)\2\2YZ\7#\2\2Z\\\5\"\22\2[Y\3\2\2"+
		"\2[\\\3\2\2\2\\\u0082\3\2\2\2]^\7\4\2\2^a\7)\2\2_`\7#\2\2`b\5\"\22\2a"+
		"_\3\2\2\2ab\3\2\2\2b\u0082\3\2\2\2cd\7\6\2\2dg\7)\2\2ef\7#\2\2fh\7*\2"+
		"\2ge\3\2\2\2gh\3\2\2\2h\u0082\3\2\2\2ij\7\5\2\2jm\7)\2\2kl\7#\2\2ln\5"+
		"*\26\2mk\3\2\2\2mn\3\2\2\2n\u0082\3\2\2\2op\7\7\2\2pq\7)\2\2qr\7#\2\2"+
		"r}\7$\2\2sx\7)\2\2tu\7\37\2\2uw\7)\2\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2x"+
		"y\3\2\2\2y|\3\2\2\2zx\3\2\2\2{s\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2"+
		"\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0082\7%\2\2\u0081W\3\2\2\2\u0081"+
		"]\3\2\2\2\u0081c\3\2\2\2\u0081i\3\2\2\2\u0081o\3\2\2\2\u0082\u0083\3\2"+
		"\2\2\u0083\u0084\7&\2\2\u0084\13\3\2\2\2\u0085\u0086\7\"\2\2\u0086\u0087"+
		"\7)\2\2\u0087\u0088\7!\2\2\u0088\u0089\5.\30\2\u0089\u008a\7\b\2\2\u008a"+
		"\u008b\5\16\b\2\u008b\u008c\7\t\2\2\u008c\u0090\7$\2\2\u008d\u008f\5\4"+
		"\3\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\5\36"+
		"\20\2\u0094\u0095\7%\2\2\u0095\u009e\3\2\2\2\u0096\u0097\7\"\2\2\u0097"+
		"\u0098\7)\2\2\u0098\u0099\7\b\2\2\u0099\u009a\5\16\b\2\u009a\u009b\7\t"+
		"\2\2\u009b\u009c\5\6\4\2\u009c\u009e\3\2\2\2\u009d\u0085\3\2\2\2\u009d"+
		"\u0096\3\2\2\2\u009e\r\3\2\2\2\u009f\u00a4\5\20\t\2\u00a0\u00a1\7\37\2"+
		"\2\u00a1\u00a3\5\20\t\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a7\u009f\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\17\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7\3\2"+
		"\2\u00ad\u00b5\7)\2\2\u00ae\u00af\7\4\2\2\u00af\u00b5\7)\2\2\u00b0\u00b1"+
		"\7\6\2\2\u00b1\u00b5\7)\2\2\u00b2\u00b3\7\5\2\2\u00b3\u00b5\7)\2\2\u00b4"+
		"\u00ac\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b5\21\3\2\2\2\u00b6\u00b7\7)\2\2\u00b7\u00b8\7\b\2\2\u00b8\u00b9"+
		"\5\24\13\2\u00b9\u00ba\7\t\2\2\u00ba\23\3\2\2\2\u00bb\u00c0\5\62\32\2"+
		"\u00bc\u00bd\7\37\2\2\u00bd\u00bf\5\62\32\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c4\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00bb\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\25\3\2\2\2\u00c7\u00c5\3\2\2"+
		"\2\u00c8\u00c9\7\25\2\2\u00c9\u00ca\5\b\5\2\u00ca\u00cb\7\34\2\2\u00cb"+
		"\u00d4\5\6\4\2\u00cc\u00cd\7\26\2\2\u00cd\u00ce\7\25\2\2\u00ce\u00cf\5"+
		"\b\5\2\u00cf\u00d0\7\34\2\2\u00d0\u00d1\5\6\4\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00cc\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00da\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7\26\2\2\u00d8"+
		"\u00d9\7\34\2\2\u00d9\u00db\5\6\4\2\u00da\u00d7\3\2\2\2\u00da\u00db\3"+
		"\2\2\2\u00db\27\3\2\2\2\u00dc\u00dd\7\27\2\2\u00dd\u00de\5\b\5\2\u00de"+
		"\u00df\7\30\2\2\u00df\u00e0\5\6\4\2\u00e0\31\3\2\2\2\u00e1\u00e2\7\32"+
		"\2\2\u00e2\u00e3\5\6\4\2\u00e3\u00e4\7\33\2\2\u00e4\u00e5\5\b\5\2\u00e5"+
		"\33\3\2\2\2\u00e6\u00e7\7\31\2\2\u00e7\u00e8\7\b\2\2\u00e8\u00e9\5\"\22"+
		"\2\u00e9\u00ea\t\2\2\2\u00ea\u00eb\5\"\22\2\u00eb\u00ec\7\t\2\2\u00ec"+
		"\u00ed\5\6\4\2\u00ed\35\3\2\2\2\u00ee\u00f3\7 \2\2\u00ef\u00f2\5\"\22"+
		"\2\u00f0\u00f2\5*\26\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5"+
		"\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f6\u00f7\7&\2\2\u00f7\37\3\2\2\2\u00f8\u00f9\7)\2\2"+
		"\u00f9\u00fa\7#\2\2\u00fa\u00ff\5\"\22\2\u00fb\u00fc\7)\2\2\u00fc\u00fd"+
		"\7#\2\2\u00fd\u00ff\5*\26\2\u00fe\u00f8\3\2\2\2\u00fe\u00fb\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\7&\2\2\u0101!\3\2\2\2\u0102\u0105\5$\23\2\u0103"+
		"\u0105\5\22\n\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105#\3\2\2\2"+
		"\u0106\u010b\5&\24\2\u0107\u0108\t\3\2\2\u0108\u010a\5&\24\2\u0109\u0107"+
		"\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"%\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0113\5(\25\2\u010f\u0110\t\4\2\2"+
		"\u0110\u0112\5(\25\2\u0111\u010f\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\'\3\2\2\2\u0115\u0113\3\2\2\2\u0116"+
		"\u011c\5\60\31\2\u0117\u0118\7\b\2\2\u0118\u0119\5$\23\2\u0119\u011a\7"+
		"\t\2\2\u011a\u011c\3\2\2\2\u011b\u0116\3\2\2\2\u011b\u0117\3\2\2\2\u011c"+
		")\3\2\2\2\u011d\u0121\5,\27\2\u011e\u0120\t\5\2\2\u011f\u011e\3\2\2\2"+
		"\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0135"+
		"\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0129\5\"\22\2\u0125\u0126\t\6\2\2"+
		"\u0126\u0128\5\"\22\2\u0127\u0125\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0135\3\2\2\2\u012b\u0129\3\2\2\2\u012c"+
		"\u012e\7\20\2\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3"+
		"\2\2\2\u012f\u0135\t\7\2\2\u0130\u0131\7\b\2\2\u0131\u0132\5*\26\2\u0132"+
		"\u0133\7\t\2\2\u0133\u0135\3\2\2\2\u0134\u011d\3\2\2\2\u0134\u0124\3\2"+
		"\2\2\u0134\u012d\3\2\2\2\u0134\u0130\3\2\2\2\u0135+\3\2\2\2\u0136\u0137"+
		"\t\7\2\2\u0137-\3\2\2\2\u0138\u0139\t\b\2\2\u0139/\3\2\2\2\u013a\u013b"+
		"\t\t\2\2\u013b\61\3\2\2\2\u013c\u0140\5\60\31\2\u013d\u0140\7*\2\2\u013e"+
		"\u0140\7\21\2\2\u013f\u013c\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u013e\3"+
		"\2\2\2\u0140\63\3\2\2\2\"\668HN[agmx}\u0081\u0090\u009d\u00a4\u00a9\u00b4"+
		"\u00c0\u00c5\u00d4\u00da\u00f1\u00f3\u00fe\u0104\u010b\u0113\u011b\u0121"+
		"\u0129\u012d\u0134\u013f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}