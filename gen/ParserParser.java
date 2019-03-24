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
public class ParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, INTDCL=2, FLOATDCL=3, TRUTHDCL=4, TEXTDCL=5, ARRDCL=6, ASSIGN=7, 
		AND=8, OR=9, NOT=10, TRUTHID=11, PLUS=12, MINUS=13, TIMES=14, DIVIDES=15, 
		LPAR=16, RPAR=17, EQUALS=18, GRTHAN=19, LESSTHAN=20, NUM=21, ID=22, TEXT=23;
	public static final int
		RULE_dcl = 0, RULE_arrayDcl = 1, RULE_expr = 2, RULE_addexpr = 3, RULE_equals = 4, 
		RULE_grthan = 5, RULE_add = 6, RULE_mult = 7, RULE_mp = 8, RULE_truthexpr = 9, 
		RULE_truth = 10, RULE_term = 11, RULE_factor = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"dcl", "arrayDcl", "expr", "addexpr", "equals", "grthan", "add", "mult", 
			"mp", "truthexpr", "truth", "term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'integer'", "'decimal'", "'truth'", "'text'", "'array'", 
			"'is'", "'and'", "'or'", "'!'", null, "'+'", "'-'", "'*'", "'/'", "'('", 
			"')'", "'='", "'>'", "'<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "INTDCL", "FLOATDCL", "TRUTHDCL", "TEXTDCL", "ARRDCL", "ASSIGN", 
			"AND", "OR", "NOT", "TRUTHID", "PLUS", "MINUS", "TIMES", "DIVIDES", "LPAR", 
			"RPAR", "EQUALS", "GRTHAN", "LESSTHAN", "NUM", "ID", "TEXT"
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

	public ParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DclContext extends ParserRuleContext {
		public TerminalNode INTDCL() { return getToken(ParserParser.INTDCL, 0); }
		public TerminalNode ID() { return getToken(ParserParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ParserParser.ASSIGN, 0); }
		public AddexprContext addexpr() {
			return getRuleContext(AddexprContext.class,0);
		}
		public TerminalNode NUM() { return getToken(ParserParser.NUM, 0); }
		public TerminalNode FLOATDCL() { return getToken(ParserParser.FLOATDCL, 0); }
		public TerminalNode TEXTDCL() { return getToken(ParserParser.TEXTDCL, 0); }
		public TerminalNode TEXT() { return getToken(ParserParser.TEXT, 0); }
		public TerminalNode TRUTHDCL() { return getToken(ParserParser.TRUTHDCL, 0); }
		public TruthexprContext truthexpr() {
			return getRuleContext(TruthexprContext.class,0);
		}
		public TerminalNode TRUTHID() { return getToken(ParserParser.TRUTHID, 0); }
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
		enterRule(_localctx, 0, RULE_dcl);
		int _la;
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTDCL:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(INTDCL);
				setState(27);
				match(ID);
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(28);
					match(ASSIGN);
					setState(31);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(29);
						addexpr();
						}
						break;
					case 2:
						{
						setState(30);
						match(NUM);
						}
						break;
					}
					}
				}

				}
				break;
			case FLOATDCL:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(FLOATDCL);
				setState(36);
				match(ID);
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(37);
					match(ASSIGN);
					setState(40);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(38);
						addexpr();
						}
						break;
					case 2:
						{
						setState(39);
						match(NUM);
						}
						break;
					}
					}
				}

				}
				break;
			case TEXTDCL:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				match(TEXTDCL);
				setState(45);
				match(ID);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(46);
					match(ASSIGN);
					setState(47);
					match(TEXT);
					}
				}

				}
				break;
			case TRUTHDCL:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				match(TRUTHDCL);
				setState(51);
				match(ID);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(52);
					match(ASSIGN);
					setState(55);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(53);
						truthexpr();
						}
						break;
					case 2:
						{
						setState(54);
						match(TRUTHID);
						}
						break;
					}
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

	public static class ArrayDclContext extends ParserRuleContext {
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public TerminalNode ARRDCL() { return getToken(ParserParser.ARRDCL, 0); }
		public TerminalNode ID() { return getToken(ParserParser.ID, 0); }
		public ArrayDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArrayDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArrayDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArrayDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDclContext arrayDcl() throws RecognitionException {
		ArrayDclContext _localctx = new ArrayDclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_arrayDcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			dcl();
			setState(62);
			match(ARRDCL);
			setState(63);
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

	public static class ExprContext extends ParserRuleContext {
		public AddexprContext addexpr() {
			return getRuleContext(AddexprContext.class,0);
		}
		public TruthexprContext truthexpr() {
			return getRuleContext(TruthexprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				addexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				truthexpr();
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
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
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
		enterRule(_localctx, 6, RULE_addexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			add();
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

	public static class EqualsContext extends ParserRuleContext {
		public List<GrthanContext> grthan() {
			return getRuleContexts(GrthanContext.class);
		}
		public GrthanContext grthan(int i) {
			return getRuleContext(GrthanContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(ParserParser.EQUALS, 0); }
		public EqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualsContext equals() throws RecognitionException {
		EqualsContext _localctx = new EqualsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_equals);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				grthan();
				setState(72);
				match(EQUALS);
				setState(73);
				grthan();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				grthan();
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

	public static class GrthanContext extends ParserRuleContext {
		public List<AddContext> add() {
			return getRuleContexts(AddContext.class);
		}
		public AddContext add(int i) {
			return getRuleContext(AddContext.class,i);
		}
		public List<TerminalNode> GRTHAN() { return getTokens(ParserParser.GRTHAN); }
		public TerminalNode GRTHAN(int i) {
			return getToken(ParserParser.GRTHAN, i);
		}
		public List<TerminalNode> LESSTHAN() { return getTokens(ParserParser.LESSTHAN); }
		public TerminalNode LESSTHAN(int i) {
			return getToken(ParserParser.LESSTHAN, i);
		}
		public GrthanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grthan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterGrthan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitGrthan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitGrthan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrthanContext grthan() throws RecognitionException {
		GrthanContext _localctx = new GrthanContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_grthan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			add();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GRTHAN || _la==LESSTHAN) {
				{
				setState(83);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GRTHAN:
					{
					setState(79);
					match(GRTHAN);
					setState(80);
					add();
					}
					break;
				case LESSTHAN:
					{
					setState(81);
					match(LESSTHAN);
					setState(82);
					add();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(87);
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

	public static class AddContext extends ParserRuleContext {
		public List<MultContext> mult() {
			return getRuleContexts(MultContext.class);
		}
		public MultContext mult(int i) {
			return getRuleContext(MultContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(ParserParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ParserParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(ParserParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(ParserParser.MINUS, i);
		}
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			mult();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(93);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(89);
					match(PLUS);
					setState(90);
					mult();
					}
					break;
				case MINUS:
					{
					setState(91);
					match(MINUS);
					setState(92);
					mult();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(97);
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

	public static class MultContext extends ParserRuleContext {
		public List<MpContext> mp() {
			return getRuleContexts(MpContext.class);
		}
		public MpContext mp(int i) {
			return getRuleContext(MpContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(ParserParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(ParserParser.TIMES, i);
		}
		public List<TerminalNode> DIVIDES() { return getTokens(ParserParser.DIVIDES); }
		public TerminalNode DIVIDES(int i) {
			return getToken(ParserParser.DIVIDES, i);
		}
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			mp();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIMES || _la==DIVIDES) {
				{
				setState(103);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TIMES:
					{
					setState(99);
					match(TIMES);
					setState(100);
					mp();
					}
					break;
				case DIVIDES:
					{
					setState(101);
					match(DIVIDES);
					setState(102);
					mp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(107);
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

	public static class MpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserParser.ID, 0); }
		public TerminalNode NUM() { return getToken(ParserParser.NUM, 0); }
		public TerminalNode LPAR() { return getToken(ParserParser.LPAR, 0); }
		public AddexprContext addexpr() {
			return getRuleContext(AddexprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ParserParser.RPAR, 0); }
		public MpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterMp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitMp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitMp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MpContext mp() throws RecognitionException {
		MpContext _localctx = new MpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mp);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(ID);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(NUM);
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(LPAR);
				setState(111);
				addexpr();
				setState(112);
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
		enterRule(_localctx, 18, RULE_truthexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			truth();
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
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ParserParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ParserParser.OR, i);
		}
		public List<TerminalNode> AND() { return getTokens(ParserParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ParserParser.AND, i);
		}
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
		enterRule(_localctx, 20, RULE_truth);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			term();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				setState(123);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OR:
					{
					setState(119);
					match(OR);
					setState(120);
					term();
					}
					break;
				case AND:
					{
					setState(121);
					match(AND);
					setState(122);
					term();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(127);
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ParserParser.NOT, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(128);
				match(NOT);
				}
			}

			setState(131);
			factor();
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode TRUTHID() { return getToken(ParserParser.TRUTHID, 0); }
		public TerminalNode ID() { return getToken(ParserParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(ParserParser.LPAR, 0); }
		public TruthContext truth() {
			return getRuleContext(TruthContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ParserParser.RPAR, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_factor);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUTHID:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(TRUTHID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(ID);
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(LPAR);
				setState(136);
				truth();
				setState(137);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u0090\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\5\2\"\n\2\5\2$\n\2"+
		"\3\2\3\2\3\2\3\2\3\2\5\2+\n\2\5\2-\n\2\3\2\3\2\3\2\3\2\5\2\63\n\2\3\2"+
		"\3\2\3\2\3\2\3\2\5\2:\n\2\5\2<\n\2\5\2>\n\2\3\3\3\3\3\3\3\3\3\4\3\4\5"+
		"\4F\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\7\3\7\3\7\3\7\3\7\7\7V"+
		"\n\7\f\7\16\7Y\13\7\3\b\3\b\3\b\3\b\3\b\7\b`\n\b\f\b\16\bc\13\b\3\t\3"+
		"\t\3\t\3\t\3\t\7\tj\n\t\f\t\16\tm\13\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nu\n"+
		"\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\f~\n\f\f\f\16\f\u0081\13\f\3\r\5\r"+
		"\u0084\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008e\n\16\3\16"+
		"\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2\2\u009b\2=\3\2\2\2\4?\3\2"+
		"\2\2\6E\3\2\2\2\bG\3\2\2\2\nN\3\2\2\2\fP\3\2\2\2\16Z\3\2\2\2\20d\3\2\2"+
		"\2\22t\3\2\2\2\24v\3\2\2\2\26x\3\2\2\2\30\u0083\3\2\2\2\32\u008d\3\2\2"+
		"\2\34\35\7\4\2\2\35#\7\30\2\2\36!\7\t\2\2\37\"\5\b\5\2 \"\7\27\2\2!\37"+
		"\3\2\2\2! \3\2\2\2\"$\3\2\2\2#\36\3\2\2\2#$\3\2\2\2$>\3\2\2\2%&\7\5\2"+
		"\2&,\7\30\2\2\'*\7\t\2\2(+\5\b\5\2)+\7\27\2\2*(\3\2\2\2*)\3\2\2\2+-\3"+
		"\2\2\2,\'\3\2\2\2,-\3\2\2\2->\3\2\2\2./\7\7\2\2/\62\7\30\2\2\60\61\7\t"+
		"\2\2\61\63\7\31\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63>\3\2\2\2\64\65\7\6"+
		"\2\2\65;\7\30\2\2\669\7\t\2\2\67:\5\24\13\28:\7\r\2\29\67\3\2\2\298\3"+
		"\2\2\2:<\3\2\2\2;\66\3\2\2\2;<\3\2\2\2<>\3\2\2\2=\34\3\2\2\2=%\3\2\2\2"+
		"=.\3\2\2\2=\64\3\2\2\2>\3\3\2\2\2?@\5\2\2\2@A\7\b\2\2AB\7\30\2\2B\5\3"+
		"\2\2\2CF\5\b\5\2DF\5\24\13\2EC\3\2\2\2ED\3\2\2\2F\7\3\2\2\2GH\5\16\b\2"+
		"H\t\3\2\2\2IJ\5\f\7\2JK\7\24\2\2KL\5\f\7\2LO\3\2\2\2MO\5\f\7\2NI\3\2\2"+
		"\2NM\3\2\2\2O\13\3\2\2\2PW\5\16\b\2QR\7\25\2\2RV\5\16\b\2ST\7\26\2\2T"+
		"V\5\16\b\2UQ\3\2\2\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\r\3\2\2"+
		"\2YW\3\2\2\2Za\5\20\t\2[\\\7\16\2\2\\`\5\20\t\2]^\7\17\2\2^`\5\20\t\2"+
		"_[\3\2\2\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\17\3\2\2\2ca\3\2\2"+
		"\2dk\5\22\n\2ef\7\20\2\2fj\5\22\n\2gh\7\21\2\2hj\5\22\n\2ie\3\2\2\2ig"+
		"\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\21\3\2\2\2mk\3\2\2\2nu\7\30\2"+
		"\2ou\7\27\2\2pq\7\22\2\2qr\5\b\5\2rs\7\23\2\2su\3\2\2\2tn\3\2\2\2to\3"+
		"\2\2\2tp\3\2\2\2u\23\3\2\2\2vw\5\26\f\2w\25\3\2\2\2x\177\5\30\r\2yz\7"+
		"\13\2\2z~\5\30\r\2{|\7\n\2\2|~\5\30\r\2}y\3\2\2\2}{\3\2\2\2~\u0081\3\2"+
		"\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\27\3\2\2\2\u0081\177\3\2\2\2"+
		"\u0082\u0084\7\f\2\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0086\5\32\16\2\u0086\31\3\2\2\2\u0087\u008e\7\r\2\2\u0088"+
		"\u008e\7\30\2\2\u0089\u008a\7\22\2\2\u008a\u008b\5\26\f\2\u008b\u008c"+
		"\7\23\2\2\u008c\u008e\3\2\2\2\u008d\u0087\3\2\2\2\u008d\u0088\3\2\2\2"+
		"\u008d\u0089\3\2\2\2\u008e\33\3\2\2\2\27!#*,\629;=ENUW_aikt}\177\u0083"+
		"\u008d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}