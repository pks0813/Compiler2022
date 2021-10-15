// Generated from D:/´úÂëÄØ/java/Compiler2022/src/Parse\MX.g4 by ANTLR 4.9.1
package Parse;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MXParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, Plus=4, Minus=5, Multiply=6, Devide=7, Mod=8, 
		Greater=9, GreaterEqual=10, Less=11, LessEqual=12, NotEqual=13, Equal=14, 
		AndAnd=15, OrOr=16, Not=17, RightShift=18, LeftShift=19, And=20, Or=21, 
		Xor=22, Negate=23, Assign=24, PlusPlus=25, MinusMinus=26, Point=27, LeftSquareBracket=28, 
		RightSquareBracket=29, LeftBracket=30, RightBracket=31, Semicolon=32, 
		Comma=33, LeftBigBracket=34, RightBigBracket=35, Tabs=36, Annotate=37, 
		StringEdge=38, Int=39, Bool=40, String=41, Null=42, Void=43, True=44, 
		False=45, If=46, Else=47, For=48, While=49, Break=50, Continue=51, Return=52, 
		New=53, Class=54, This=55, WS=56, NEWLINE=57, BLOCK_COMMENT=58, LINE_COMMENT=59, 
		ESC=60, Identifier=61, DecimalInteger=62;
	public static final int
		RULE_program = 0, RULE_suite = 1, RULE_statement = 2, RULE_classDef = 3, 
		RULE_functionDef = 4, RULE_constructDef = 5, RULE_varDef = 6, RULE_onevarDef = 7, 
		RULE_lambda = 8, RULE_expression = 9, RULE_functionInsList = 10, RULE_functionParameterList = 11, 
		RULE_canCreate = 12, RULE_type = 13, RULE_easytype = 14, RULE_primary = 15, 
		RULE_literal = 16, RULE_str = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "suite", "statement", "classDef", "functionDef", "constructDef", 
			"varDef", "onevarDef", "lambda", "expression", "functionInsList", "functionParameterList", 
			"canCreate", "type", "easytype", "primary", "literal", "str"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'[&]'", "'->'", "'/'", "'+'", "'-'", "'*'", "'\\'", "'%'", "'>'", 
			"'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", "'||'", "'!'", "'>>'", 
			"'<<'", "'&'", "'|'", "'^'", "'~'", "'='", "'++'", "'--'", "'.'", "'['", 
			"']'", "'('", "')'", "';'", "','", "'{'", "'}'", "'\\t'", "'//'", "'\"'", 
			"'int'", "'bool'", "'string'", "'null'", "'void'", "'true'", "'false'", 
			"'if'", "'else'", "'for'", "'while'", "'break'", "'continue'", "'return'", 
			"'new'", "'class'", "'this'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "Plus", "Minus", "Multiply", "Devide", "Mod", 
			"Greater", "GreaterEqual", "Less", "LessEqual", "NotEqual", "Equal", 
			"AndAnd", "OrOr", "Not", "RightShift", "LeftShift", "And", "Or", "Xor", 
			"Negate", "Assign", "PlusPlus", "MinusMinus", "Point", "LeftSquareBracket", 
			"RightSquareBracket", "LeftBracket", "RightBracket", "Semicolon", "Comma", 
			"LeftBigBracket", "RightBigBracket", "Tabs", "Annotate", "StringEdge", 
			"Int", "Bool", "String", "Null", "Void", "True", "False", "If", "Else", 
			"For", "While", "Break", "Continue", "Return", "New", "Class", "This", 
			"WS", "NEWLINE", "BLOCK_COMMENT", "LINE_COMMENT", "ESC", "Identifier", 
			"DecimalInteger"
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
	public String getGrammarFileName() { return "MX.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MXParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MXParser.EOF, 0); }
		public List<FunctionDefContext> functionDef() {
			return getRuleContexts(FunctionDefContext.class);
		}
		public FunctionDefContext functionDef(int i) {
			return getRuleContext(FunctionDefContext.class,i);
		}
		public List<ClassDefContext> classDef() {
			return getRuleContexts(ClassDefContext.class);
		}
		public ClassDefContext classDef(int i) {
			return getRuleContext(ClassDefContext.class,i);
		}
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Bool) | (1L << String) | (1L << Void) | (1L << Class) | (1L << Identifier))) != 0)) {
				{
				setState(39);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(36);
					functionDef();
					}
					break;
				case 2:
					{
					setState(37);
					classDef();
					}
					break;
				case 3:
					{
					setState(38);
					varDef();
					}
					break;
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
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

	public static class SuiteContext extends ParserRuleContext {
		public TerminalNode LeftBigBracket() { return getToken(MXParser.LeftBigBracket, 0); }
		public TerminalNode RightBigBracket() { return getToken(MXParser.RightBigBracket, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterSuite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitSuite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitSuite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_suite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(LeftBigBracket);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Minus) | (1L << Not) | (1L << Negate) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << LeftBracket) | (1L << Semicolon) | (1L << LeftBigBracket) | (1L << StringEdge) | (1L << Int) | (1L << Bool) | (1L << String) | (1L << Null) | (1L << True) | (1L << False) | (1L << If) | (1L << For) | (1L << While) | (1L << Break) | (1L << Continue) | (1L << Return) | (1L << New) | (1L << This) | (1L << Identifier) | (1L << DecimalInteger))) != 0)) {
				{
				{
				setState(47);
				statement();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			match(RightBigBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext trueStmt;
		public StatementContext falseStmt;
		public ExpressionContext init;
		public ExpressionContext check;
		public ExpressionContext step;
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public TerminalNode If() { return getToken(MXParser.If, 0); }
		public TerminalNode LeftBracket() { return getToken(MXParser.LeftBracket, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RightBracket() { return getToken(MXParser.RightBracket, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(MXParser.Else, 0); }
		public TerminalNode While() { return getToken(MXParser.While, 0); }
		public TerminalNode For() { return getToken(MXParser.For, 0); }
		public List<TerminalNode> Semicolon() { return getTokens(MXParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(MXParser.Semicolon, i);
		}
		public TerminalNode Break() { return getToken(MXParser.Break, 0); }
		public TerminalNode Continue() { return getToken(MXParser.Continue, 0); }
		public TerminalNode Return() { return getToken(MXParser.Return, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				suite();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				varDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				match(If);
				setState(58);
				match(LeftBracket);
				setState(59);
				expression(0);
				setState(60);
				match(RightBracket);
				setState(61);
				((StatementContext)_localctx).trueStmt = statement();
				setState(64);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(62);
					match(Else);
					setState(63);
					((StatementContext)_localctx).falseStmt = statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				match(While);
				setState(67);
				match(LeftBracket);
				setState(68);
				expression(0);
				setState(69);
				match(RightBracket);
				setState(70);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				match(For);
				setState(73);
				match(LeftBracket);
				setState(74);
				((StatementContext)_localctx).init = expression(0);
				setState(75);
				match(Semicolon);
				setState(76);
				((StatementContext)_localctx).check = expression(0);
				setState(77);
				match(Semicolon);
				setState(78);
				((StatementContext)_localctx).step = expression(0);
				setState(79);
				match(RightBracket);
				setState(80);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				match(Break);
				setState(83);
				match(Semicolon);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(84);
				match(Continue);
				setState(85);
				match(Semicolon);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(86);
				match(Return);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Minus) | (1L << Not) | (1L << Negate) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << LeftBracket) | (1L << StringEdge) | (1L << Null) | (1L << True) | (1L << False) | (1L << New) | (1L << This) | (1L << Identifier) | (1L << DecimalInteger))) != 0)) {
					{
					setState(87);
					expression(0);
					}
				}

				setState(90);
				match(Semicolon);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(91);
				expression(0);
				setState(92);
				match(Semicolon);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(94);
				match(Semicolon);
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

	public static class ClassDefContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(MXParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(MXParser.Identifier, 0); }
		public TerminalNode LeftBigBracket() { return getToken(MXParser.LeftBigBracket, 0); }
		public TerminalNode RightBigBracket() { return getToken(MXParser.RightBigBracket, 0); }
		public TerminalNode Semicolon() { return getToken(MXParser.Semicolon, 0); }
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public List<FunctionDefContext> functionDef() {
			return getRuleContexts(FunctionDefContext.class);
		}
		public FunctionDefContext functionDef(int i) {
			return getRuleContext(FunctionDefContext.class,i);
		}
		public List<ConstructDefContext> constructDef() {
			return getRuleContexts(ConstructDefContext.class);
		}
		public ConstructDefContext constructDef(int i) {
			return getRuleContext(ConstructDefContext.class,i);
		}
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(Class);
			setState(98);
			match(Identifier);
			setState(99);
			match(LeftBigBracket);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Bool) | (1L << String) | (1L << Void) | (1L << Identifier))) != 0)) {
				{
				setState(103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(100);
					varDef();
					}
					break;
				case 2:
					{
					setState(101);
					functionDef();
					}
					break;
				case 3:
					{
					setState(102);
					constructDef();
					}
					break;
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(RightBigBracket);
			setState(109);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MXParser.Identifier, 0); }
		public TerminalNode LeftBracket() { return getToken(MXParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(MXParser.RightBracket, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Void() { return getToken(MXParser.Void, 0); }
		public FunctionParameterListContext functionParameterList() {
			return getRuleContext(FunctionParameterListContext.class,0);
		}
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterFunctionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitFunctionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitFunctionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Bool:
			case String:
			case Identifier:
				{
				setState(111);
				type();
				}
				break;
			case Void:
				{
				setState(112);
				match(Void);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(115);
			match(Identifier);
			setState(116);
			match(LeftBracket);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Bool) | (1L << String) | (1L << Identifier))) != 0)) {
				{
				setState(117);
				functionParameterList();
				}
			}

			setState(120);
			match(RightBracket);
			setState(121);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructDefContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MXParser.Identifier, 0); }
		public TerminalNode LeftBracket() { return getToken(MXParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(MXParser.RightBracket, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public ConstructDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterConstructDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitConstructDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitConstructDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructDefContext constructDef() throws RecognitionException {
		ConstructDefContext _localctx = new ConstructDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constructDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(Identifier);
			setState(124);
			match(LeftBracket);
			setState(125);
			match(RightBracket);
			setState(126);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<OnevarDefContext> onevarDef() {
			return getRuleContexts(OnevarDefContext.class);
		}
		public OnevarDefContext onevarDef(int i) {
			return getRuleContext(OnevarDefContext.class,i);
		}
		public TerminalNode Semicolon() { return getToken(MXParser.Semicolon, 0); }
		public List<TerminalNode> Comma() { return getTokens(MXParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MXParser.Comma, i);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			type();
			setState(129);
			onevarDef();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(130);
				match(Comma);
				setState(131);
				onevarDef();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnevarDefContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MXParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(MXParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OnevarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onevarDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterOnevarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitOnevarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitOnevarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnevarDefContext onevarDef() throws RecognitionException {
		OnevarDefContext _localctx = new OnevarDefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_onevarDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(Identifier);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(140);
				match(Assign);
				setState(141);
				expression(0);
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

	public static class LambdaContext extends ParserRuleContext {
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(MXParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(MXParser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(MXParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(MXParser.RightBracket, i);
		}
		public FunctionInsListContext functionInsList() {
			return getRuleContext(FunctionInsListContext.class,0);
		}
		public FunctionParameterListContext functionParameterList() {
			return getRuleContext(FunctionParameterListContext.class,0);
		}
		public LambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaContext lambda() throws RecognitionException {
		LambdaContext _localctx = new LambdaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__0);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket) {
				{
				setState(145);
				match(LeftBracket);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Bool) | (1L << String) | (1L << Identifier))) != 0)) {
					{
					setState(146);
					functionParameterList();
					}
				}

				setState(149);
				match(RightBracket);
				}
			}

			setState(152);
			match(T__1);
			setState(153);
			suite();
			setState(154);
			match(LeftBracket);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Minus) | (1L << Not) | (1L << Negate) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << LeftBracket) | (1L << StringEdge) | (1L << Null) | (1L << True) | (1L << False) | (1L << New) | (1L << This) | (1L << Identifier) | (1L << DecimalInteger))) != 0)) {
				{
				setState(155);
				functionInsList();
				}
			}

			setState(158);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewExprContext extends ExpressionContext {
		public TerminalNode New() { return getToken(MXParser.New, 0); }
		public CanCreateContext canCreate() {
			return getRuleContext(CanCreateContext.class,0);
		}
		public NewExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterNewExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitNewExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitNewExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrefixExprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(MXParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(MXParser.MinusMinus, 0); }
		public PrefixExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterPrefixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitPrefixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitPrefixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Minus() { return getToken(MXParser.Minus, 0); }
		public TerminalNode Negate() { return getToken(MXParser.Negate, 0); }
		public TerminalNode Not() { return getToken(MXParser.Not, 0); }
		public TerminalNode Multiply() { return getToken(MXParser.Multiply, 0); }
		public TerminalNode Mod() { return getToken(MXParser.Mod, 0); }
		public TerminalNode Plus() { return getToken(MXParser.Plus, 0); }
		public TerminalNode And() { return getToken(MXParser.And, 0); }
		public TerminalNode Or() { return getToken(MXParser.Or, 0); }
		public TerminalNode Xor() { return getToken(MXParser.Xor, 0); }
		public MathExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterMathExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitMathExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitMathExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LeftSquareBracket() { return getToken(MXParser.LeftSquareBracket, 0); }
		public TerminalNode RightSquareBracket() { return getToken(MXParser.RightSquareBracket, 0); }
		public SubscriptExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterSubscriptExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitSubscriptExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitSubscriptExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaExprContext extends ExpressionContext {
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public LambdaExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterLambdaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitLambdaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitLambdaExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryEXprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AndAnd() { return getToken(MXParser.AndAnd, 0); }
		public TerminalNode OrOr() { return getToken(MXParser.OrOr, 0); }
		public BinaryEXprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterBinaryEXpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitBinaryEXpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitBinaryEXpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExprContext extends ExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public AtomExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Equal() { return getToken(MXParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(MXParser.NotEqual, 0); }
		public TerminalNode Less() { return getToken(MXParser.Less, 0); }
		public TerminalNode LessEqual() { return getToken(MXParser.LessEqual, 0); }
		public TerminalNode Greater() { return getToken(MXParser.Greater, 0); }
		public TerminalNode GreaterEqual() { return getToken(MXParser.GreaterEqual, 0); }
		public BinaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitBinaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BackfixExprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(MXParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(MXParser.MinusMinus, 0); }
		public BackfixExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterBackfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitBackfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitBackfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Assign() { return getToken(MXParser.Assign, 0); }
		public AssignExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PointExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Point() { return getToken(MXParser.Point, 0); }
		public TerminalNode Identifier() { return getToken(MXParser.Identifier, 0); }
		public PointExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterPointExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitPointExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitPointExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(MXParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(MXParser.RightBracket, 0); }
		public FunctionInsListContext functionInsList() {
			return getRuleContext(FunctionInsListContext.class,0);
		}
		public FunctionExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitFunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
			case StringEdge:
			case Null:
			case True:
			case False:
			case This:
			case Identifier:
			case DecimalInteger:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(161);
				primary();
				}
				break;
			case T__0:
				{
				_localctx = new LambdaExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				lambda();
				}
				break;
			case Minus:
				{
				_localctx = new MathExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				((MathExprContext)_localctx).op = match(Minus);
				setState(164);
				expression(15);
				}
				break;
			case Negate:
				{
				_localctx = new MathExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				((MathExprContext)_localctx).op = match(Negate);
				setState(166);
				expression(14);
				}
				break;
			case Not:
				{
				_localctx = new MathExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				((MathExprContext)_localctx).op = match(Not);
				setState(168);
				expression(13);
				}
				break;
			case PlusPlus:
			case MinusMinus:
				{
				_localctx = new PrefixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				((PrefixExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PlusPlus || _la==MinusMinus) ) {
					((PrefixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(170);
				expression(12);
				}
				break;
			case New:
				{
				_localctx = new NewExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				match(New);
				setState(172);
				canCreate();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(209);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new MathExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(175);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(176);
						((MathExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Multiply) | (1L << Mod))) != 0)) ) {
							((MathExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(177);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new MathExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(178);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(179);
						((MathExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
							((MathExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(180);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new MathExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(181);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(182);
						((MathExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << And) | (1L << Or) | (1L << Xor))) != 0)) ) {
							((MathExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(183);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(184);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(185);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Greater) | (1L << GreaterEqual) | (1L << Less) | (1L << LessEqual) | (1L << NotEqual) | (1L << Equal))) != 0)) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(186);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new BinaryEXprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(187);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(188);
						((BinaryEXprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AndAnd || _la==OrOr) ) {
							((BinaryEXprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(189);
						expression(4);
						}
						break;
					case 6:
						{
						_localctx = new AssignExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(190);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(191);
						match(Assign);
						setState(192);
						expression(2);
						}
						break;
					case 7:
						{
						_localctx = new BackfixExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(194);
						((BackfixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PlusPlus || _la==MinusMinus) ) {
							((BackfixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 8:
						{
						_localctx = new PointExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(196);
						match(Point);
						setState(197);
						match(Identifier);
						}
						break;
					case 9:
						{
						_localctx = new FunctionExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(199);
						match(LeftBracket);
						setState(201);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Minus) | (1L << Not) | (1L << Negate) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << LeftBracket) | (1L << StringEdge) | (1L << Null) | (1L << True) | (1L << False) | (1L << New) | (1L << This) | (1L << Identifier) | (1L << DecimalInteger))) != 0)) {
							{
							setState(200);
							functionInsList();
							}
						}

						setState(203);
						match(RightBracket);
						}
						break;
					case 10:
						{
						_localctx = new SubscriptExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(204);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(205);
						match(LeftSquareBracket);
						setState(206);
						expression(0);
						setState(207);
						match(RightSquareBracket);
						}
						break;
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionInsListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(MXParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MXParser.Comma, i);
		}
		public FunctionInsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterFunctionInsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitFunctionInsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitFunctionInsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionInsListContext functionInsList() throws RecognitionException {
		FunctionInsListContext _localctx = new FunctionInsListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionInsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			expression(0);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(215);
				match(Comma);
				setState(216);
				expression(0);
				}
				}
				setState(221);
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

	public static class FunctionParameterListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(MXParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MXParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(MXParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MXParser.Comma, i);
		}
		public FunctionParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterFunctionParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitFunctionParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitFunctionParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterListContext functionParameterList() throws RecognitionException {
		FunctionParameterListContext _localctx = new FunctionParameterListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			type();
			setState(223);
			match(Identifier);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(224);
				match(Comma);
				setState(225);
				type();
				setState(226);
				match(Identifier);
				}
				}
				setState(232);
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

	public static class CanCreateContext extends ParserRuleContext {
		public EasytypeContext easytype() {
			return getRuleContext(EasytypeContext.class,0);
		}
		public List<TerminalNode> LeftSquareBracket() { return getTokens(MXParser.LeftSquareBracket); }
		public TerminalNode LeftSquareBracket(int i) {
			return getToken(MXParser.LeftSquareBracket, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RightSquareBracket() { return getTokens(MXParser.RightSquareBracket); }
		public TerminalNode RightSquareBracket(int i) {
			return getToken(MXParser.RightSquareBracket, i);
		}
		public TerminalNode LeftBracket() { return getToken(MXParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(MXParser.RightBracket, 0); }
		public CanCreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_canCreate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterCanCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitCanCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitCanCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CanCreateContext canCreate() throws RecognitionException {
		CanCreateContext _localctx = new CanCreateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_canCreate);
		try {
			int _alt;
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				easytype();
				setState(238); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(234);
						match(LeftSquareBracket);
						setState(235);
						expression(0);
						setState(236);
						match(RightSquareBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(240); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(242);
						match(LeftSquareBracket);
						setState(243);
						match(RightSquareBracket);
						}
						} 
					}
					setState(248);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				easytype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				easytype();
				setState(251);
				match(LeftBracket);
				setState(252);
				match(RightBracket);
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

	public static class TypeContext extends ParserRuleContext {
		public EasytypeContext easytype() {
			return getRuleContext(EasytypeContext.class,0);
		}
		public List<TerminalNode> LeftSquareBracket() { return getTokens(MXParser.LeftSquareBracket); }
		public TerminalNode LeftSquareBracket(int i) {
			return getToken(MXParser.LeftSquareBracket, i);
		}
		public List<TerminalNode> RightSquareBracket() { return getTokens(MXParser.RightSquareBracket); }
		public TerminalNode RightSquareBracket(int i) {
			return getToken(MXParser.RightSquareBracket, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		int _la;
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				easytype();
				setState(259); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(257);
					match(LeftSquareBracket);
					setState(258);
					match(RightSquareBracket);
					}
					}
					setState(261); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LeftSquareBracket );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				easytype();
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

	public static class EasytypeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(MXParser.Int, 0); }
		public TerminalNode String() { return getToken(MXParser.String, 0); }
		public TerminalNode Bool() { return getToken(MXParser.Bool, 0); }
		public TerminalNode Identifier() { return getToken(MXParser.Identifier, 0); }
		public EasytypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_easytype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterEasytype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitEasytype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitEasytype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EasytypeContext easytype() throws RecognitionException {
		EasytypeContext _localctx = new EasytypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_easytype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Bool) | (1L << String) | (1L << Identifier))) != 0)) ) {
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(MXParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(MXParser.RightBracket, 0); }
		public TerminalNode This() { return getToken(MXParser.This, 0); }
		public TerminalNode Identifier() { return getToken(MXParser.Identifier, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_primary);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(LeftBracket);
				setState(269);
				expression(0);
				setState(270);
				match(RightBracket);
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(This);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				match(Identifier);
				}
				break;
			case StringEdge:
			case Null:
			case True:
			case False:
			case DecimalInteger:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				literal();
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode True() { return getToken(MXParser.True, 0); }
		public TerminalNode False() { return getToken(MXParser.False, 0); }
		public TerminalNode DecimalInteger() { return getToken(MXParser.DecimalInteger, 0); }
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public TerminalNode Null() { return getToken(MXParser.Null, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case True:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(True);
				}
				break;
			case False:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(False);
				}
				break;
			case DecimalInteger:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				match(DecimalInteger);
				}
				break;
			case StringEdge:
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				str();
				}
				break;
			case Null:
				enterOuterAlt(_localctx, 5);
				{
				setState(281);
				match(Null);
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

	public static class StrContext extends ParserRuleContext {
		public List<TerminalNode> StringEdge() { return getTokens(MXParser.StringEdge); }
		public TerminalNode StringEdge(int i) {
			return getToken(MXParser.StringEdge, i);
		}
		public List<TerminalNode> ESC() { return getTokens(MXParser.ESC); }
		public TerminalNode ESC(int i) {
			return getToken(MXParser.ESC, i);
		}
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_str);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(StringEdge);
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(287);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(285);
						match(ESC);
						}
						break;
					case 2:
						{
						setState(286);
						matchWildcard();
						}
						break;
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(292);
			match(StringEdge);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u0129\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\3\3\3\7\3\63"+
		"\n\3\f\3\16\3\66\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"C\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4[\n\4\3\4\3\4\3\4\3\4\3\4\5\4b\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\7\5j\n\5\f\5\16\5m\13\5\3\5\3\5\3\5\3\6\3\6\5\6t\n\6"+
		"\3\6\3\6\3\6\5\6y\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\7\b\u0087\n\b\f\b\16\b\u008a\13\b\3\b\3\b\3\t\3\t\3\t\5\t\u0091\n\t\3"+
		"\n\3\n\3\n\5\n\u0096\n\n\3\n\5\n\u0099\n\n\3\n\3\n\3\n\3\n\5\n\u009f\n"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00b0\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00cc\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00d4\n"+
		"\13\f\13\16\13\u00d7\13\13\3\f\3\f\3\f\7\f\u00dc\n\f\f\f\16\f\u00df\13"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00e7\n\r\f\r\16\r\u00ea\13\r\3\16\3\16"+
		"\3\16\3\16\3\16\6\16\u00f1\n\16\r\16\16\16\u00f2\3\16\3\16\7\16\u00f7"+
		"\n\16\f\16\16\16\u00fa\13\16\3\16\3\16\3\16\3\16\3\16\5\16\u0101\n\16"+
		"\3\17\3\17\3\17\6\17\u0106\n\17\r\17\16\17\u0107\3\17\5\17\u010b\n\17"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0116\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u011d\n\22\3\23\3\23\3\23\7\23\u0122\n\23\f\23\16"+
		"\23\u0125\13\23\3\23\3\23\3\23\3\u0123\3\24\24\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$\2\t\3\2\33\34\5\2\5\5\b\b\n\n\3\2\6\7\3\2\26\30\3"+
		"\2\13\20\3\2\21\22\4\2)+??\2\u0151\2+\3\2\2\2\4\60\3\2\2\2\6a\3\2\2\2"+
		"\bc\3\2\2\2\ns\3\2\2\2\f}\3\2\2\2\16\u0082\3\2\2\2\20\u008d\3\2\2\2\22"+
		"\u0092\3\2\2\2\24\u00af\3\2\2\2\26\u00d8\3\2\2\2\30\u00e0\3\2\2\2\32\u0100"+
		"\3\2\2\2\34\u010a\3\2\2\2\36\u010c\3\2\2\2 \u0115\3\2\2\2\"\u011c\3\2"+
		"\2\2$\u011e\3\2\2\2&*\5\n\6\2\'*\5\b\5\2(*\5\16\b\2)&\3\2\2\2)\'\3\2\2"+
		"\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7\2\2"+
		"\3/\3\3\2\2\2\60\64\7$\2\2\61\63\5\6\4\2\62\61\3\2\2\2\63\66\3\2\2\2\64"+
		"\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7%\2\28\5\3"+
		"\2\2\29b\5\4\3\2:b\5\16\b\2;<\7\60\2\2<=\7 \2\2=>\5\24\13\2>?\7!\2\2?"+
		"B\5\6\4\2@A\7\61\2\2AC\5\6\4\2B@\3\2\2\2BC\3\2\2\2Cb\3\2\2\2DE\7\63\2"+
		"\2EF\7 \2\2FG\5\24\13\2GH\7!\2\2HI\5\6\4\2Ib\3\2\2\2JK\7\62\2\2KL\7 \2"+
		"\2LM\5\24\13\2MN\7\"\2\2NO\5\24\13\2OP\7\"\2\2PQ\5\24\13\2QR\7!\2\2RS"+
		"\5\6\4\2Sb\3\2\2\2TU\7\64\2\2Ub\7\"\2\2VW\7\65\2\2Wb\7\"\2\2XZ\7\66\2"+
		"\2Y[\5\24\13\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\b\7\"\2\2]^\5\24\13\2^"+
		"_\7\"\2\2_b\3\2\2\2`b\7\"\2\2a9\3\2\2\2a:\3\2\2\2a;\3\2\2\2aD\3\2\2\2"+
		"aJ\3\2\2\2aT\3\2\2\2aV\3\2\2\2aX\3\2\2\2a]\3\2\2\2a`\3\2\2\2b\7\3\2\2"+
		"\2cd\78\2\2de\7?\2\2ek\7$\2\2fj\5\16\b\2gj\5\n\6\2hj\5\f\7\2if\3\2\2\2"+
		"ig\3\2\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2"+
		"no\7%\2\2op\7\"\2\2p\t\3\2\2\2qt\5\34\17\2rt\7-\2\2sq\3\2\2\2sr\3\2\2"+
		"\2tu\3\2\2\2uv\7?\2\2vx\7 \2\2wy\5\30\r\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2"+
		"\2z{\7!\2\2{|\5\4\3\2|\13\3\2\2\2}~\7?\2\2~\177\7 \2\2\177\u0080\7!\2"+
		"\2\u0080\u0081\5\4\3\2\u0081\r\3\2\2\2\u0082\u0083\5\34\17\2\u0083\u0088"+
		"\5\20\t\2\u0084\u0085\7#\2\2\u0085\u0087\5\20\t\2\u0086\u0084\3\2\2\2"+
		"\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7\"\2\2\u008c\17\3\2\2\2\u008d"+
		"\u0090\7?\2\2\u008e\u008f\7\32\2\2\u008f\u0091\5\24\13\2\u0090\u008e\3"+
		"\2\2\2\u0090\u0091\3\2\2\2\u0091\21\3\2\2\2\u0092\u0098\7\3\2\2\u0093"+
		"\u0095\7 \2\2\u0094\u0096\5\30\r\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0099\7!\2\2\u0098\u0093\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\4\2\2\u009b\u009c\5\4"+
		"\3\2\u009c\u009e\7 \2\2\u009d\u009f\5\26\f\2\u009e\u009d\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7!\2\2\u00a1\23\3\2\2\2"+
		"\u00a2\u00a3\b\13\1\2\u00a3\u00b0\5 \21\2\u00a4\u00b0\5\22\n\2\u00a5\u00a6"+
		"\7\7\2\2\u00a6\u00b0\5\24\13\21\u00a7\u00a8\7\31\2\2\u00a8\u00b0\5\24"+
		"\13\20\u00a9\u00aa\7\23\2\2\u00aa\u00b0\5\24\13\17\u00ab\u00ac\t\2\2\2"+
		"\u00ac\u00b0\5\24\13\16\u00ad\u00ae\7\67\2\2\u00ae\u00b0\5\32\16\2\u00af"+
		"\u00a2\3\2\2\2\u00af\u00a4\3\2\2\2\u00af\u00a5\3\2\2\2\u00af\u00a7\3\2"+
		"\2\2\u00af\u00a9\3\2\2\2\u00af\u00ab\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0"+
		"\u00d5\3\2\2\2\u00b1\u00b2\f\t\2\2\u00b2\u00b3\t\3\2\2\u00b3\u00d4\5\24"+
		"\13\n\u00b4\u00b5\f\b\2\2\u00b5\u00b6\t\4\2\2\u00b6\u00d4\5\24\13\t\u00b7"+
		"\u00b8\f\7\2\2\u00b8\u00b9\t\5\2\2\u00b9\u00d4\5\24\13\b\u00ba\u00bb\f"+
		"\6\2\2\u00bb\u00bc\t\6\2\2\u00bc\u00d4\5\24\13\7\u00bd\u00be\f\5\2\2\u00be"+
		"\u00bf\t\7\2\2\u00bf\u00d4\5\24\13\6\u00c0\u00c1\f\4\2\2\u00c1\u00c2\7"+
		"\32\2\2\u00c2\u00d4\5\24\13\4\u00c3\u00c4\f\r\2\2\u00c4\u00d4\t\2\2\2"+
		"\u00c5\u00c6\f\f\2\2\u00c6\u00c7\7\35\2\2\u00c7\u00d4\7?\2\2\u00c8\u00c9"+
		"\f\13\2\2\u00c9\u00cb\7 \2\2\u00ca\u00cc\5\26\f\2\u00cb\u00ca\3\2\2\2"+
		"\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d4\7!\2\2\u00ce\u00cf"+
		"\f\n\2\2\u00cf\u00d0\7\36\2\2\u00d0\u00d1\5\24\13\2\u00d1\u00d2\7\37\2"+
		"\2\u00d2\u00d4\3\2\2\2\u00d3\u00b1\3\2\2\2\u00d3\u00b4\3\2\2\2\u00d3\u00b7"+
		"\3\2\2\2\u00d3\u00ba\3\2\2\2\u00d3\u00bd\3\2\2\2\u00d3\u00c0\3\2\2\2\u00d3"+
		"\u00c3\3\2\2\2\u00d3\u00c5\3\2\2\2\u00d3\u00c8\3\2\2\2\u00d3\u00ce\3\2"+
		"\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\25\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00dd\5\24\13\2\u00d9\u00da\7#\2"+
		"\2\u00da\u00dc\5\24\13\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\27\3\2\2\2\u00df\u00dd\3\2\2"+
		"\2\u00e0\u00e1\5\34\17\2\u00e1\u00e8\7?\2\2\u00e2\u00e3\7#\2\2\u00e3\u00e4"+
		"\5\34\17\2\u00e4\u00e5\7?\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e2\3\2\2\2"+
		"\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\31"+
		"\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00f0\5\36\20\2\u00ec\u00ed\7\36\2"+
		"\2\u00ed\u00ee\5\24\13\2\u00ee\u00ef\7\37\2\2\u00ef\u00f1\3\2\2\2\u00f0"+
		"\u00ec\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2"+
		"\2\2\u00f3\u00f8\3\2\2\2\u00f4\u00f5\7\36\2\2\u00f5\u00f7\7\37\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\u0101\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u0101\5\36\20\2\u00fc"+
		"\u00fd\5\36\20\2\u00fd\u00fe\7 \2\2\u00fe\u00ff\7!\2\2\u00ff\u0101\3\2"+
		"\2\2\u0100\u00eb\3\2\2\2\u0100\u00fb\3\2\2\2\u0100\u00fc\3\2\2\2\u0101"+
		"\33\3\2\2\2\u0102\u0105\5\36\20\2\u0103\u0104\7\36\2\2\u0104\u0106\7\37"+
		"\2\2\u0105\u0103\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u010b\5\36\20\2\u010a\u0102\3"+
		"\2\2\2\u010a\u0109\3\2\2\2\u010b\35\3\2\2\2\u010c\u010d\t\b\2\2\u010d"+
		"\37\3\2\2\2\u010e\u010f\7 \2\2\u010f\u0110\5\24\13\2\u0110\u0111\7!\2"+
		"\2\u0111\u0116\3\2\2\2\u0112\u0116\79\2\2\u0113\u0116\7?\2\2\u0114\u0116"+
		"\5\"\22\2\u0115\u010e\3\2\2\2\u0115\u0112\3\2\2\2\u0115\u0113\3\2\2\2"+
		"\u0115\u0114\3\2\2\2\u0116!\3\2\2\2\u0117\u011d\7.\2\2\u0118\u011d\7/"+
		"\2\2\u0119\u011d\7@\2\2\u011a\u011d\5$\23\2\u011b\u011d\7,\2\2\u011c\u0117"+
		"\3\2\2\2\u011c\u0118\3\2\2\2\u011c\u0119\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011b\3\2\2\2\u011d#\3\2\2\2\u011e\u0123\7(\2\2\u011f\u0122\7>\2\2\u0120"+
		"\u0122\13\2\2\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122\u0125\3"+
		"\2\2\2\u0123\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0126\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0126\u0127\7(\2\2\u0127%\3\2\2\2 )+\64BZaiksx\u0088\u0090"+
		"\u0095\u0098\u009e\u00af\u00cb\u00d3\u00d5\u00dd\u00e8\u00f2\u00f8\u0100"+
		"\u0107\u010a\u0115\u011c\u0121\u0123";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}