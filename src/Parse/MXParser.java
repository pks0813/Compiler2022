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
		T__0=1, T__1=2, Plus=3, Minus=4, Multiply=5, Devide=6, Mod=7, Greater=8, 
		GreaterEqual=9, Less=10, LessEqual=11, NotEqual=12, Equal=13, AndAnd=14, 
		OrOr=15, Not=16, RightShift=17, LeftShift=18, And=19, Or=20, Xor=21, Negate=22, 
		Assign=23, PlusPlus=24, MinusMinus=25, Point=26, LeftSquareBracket=27, 
		RightSquareBracket=28, LeftBracket=29, RightBracket=30, Semicolon=31, 
		Comma=32, LeftBigBracket=33, RightBigBracket=34, Tabs=35, Annotate=36, 
		StringEdge=37, Int=38, Bool=39, String=40, Null=41, Void=42, True=43, 
		False=44, If=45, Else=46, For=47, While=48, Break=49, Continue=50, Return=51, 
		New=52, Class=53, This=54, WS=55, NEWLINE=56, BLOCK_COMMENT=57, NotationLine=58, 
		Str=59, Identifier=60, DecimalInteger=61;
	public static final int
		RULE_program = 0, RULE_programDef = 1, RULE_suite = 2, RULE_statement = 3, 
		RULE_classDef = 4, RULE_functionDef = 5, RULE_constructDef = 6, RULE_varDef = 7, 
		RULE_lambda = 8, RULE_expression = 9, RULE_functionInsList = 10, RULE_functionParameterList = 11, 
		RULE_newsentence = 12, RULE_primary = 13, RULE_functiontype = 14, RULE_type = 15, 
		RULE_easytype = 16, RULE_boolConst = 17, RULE_literal = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programDef", "suite", "statement", "classDef", "functionDef", 
			"constructDef", "varDef", "lambda", "expression", "functionInsList", 
			"functionParameterList", "newsentence", "primary", "functiontype", "type", 
			"easytype", "boolConst", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'[&]'", "'/'", "'+'", "'-'", "'*'", "'\\'", "'%'", "'>'", "'>='", 
			"'<'", "'<='", "'!='", "'=='", "'&&'", "'||'", "'!'", "'>>'", "'<<'", 
			"'&'", "'|'", "'^'", "'~'", "'='", "'++'", "'--'", "'.'", "'['", "']'", 
			"'('", "')'", "';'", "','", "'{'", "'}'", "'\\t'", "'//'", "'\"'", "'int'", 
			"'bool'", "'string'", "'null'", "'void'", "'true'", "'false'", "'if'", 
			"'else'", "'for'", "'while'", "'break'", "'continue'", "'return'", "'new'", 
			"'class'", "'this'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "Plus", "Minus", "Multiply", "Devide", "Mod", "Greater", 
			"GreaterEqual", "Less", "LessEqual", "NotEqual", "Equal", "AndAnd", "OrOr", 
			"Not", "RightShift", "LeftShift", "And", "Or", "Xor", "Negate", "Assign", 
			"PlusPlus", "MinusMinus", "Point", "LeftSquareBracket", "RightSquareBracket", 
			"LeftBracket", "RightBracket", "Semicolon", "Comma", "LeftBigBracket", 
			"RightBigBracket", "Tabs", "Annotate", "StringEdge", "Int", "Bool", "String", 
			"Null", "Void", "True", "False", "If", "Else", "For", "While", "Break", 
			"Continue", "Return", "New", "Class", "This", "WS", "NEWLINE", "BLOCK_COMMENT", 
			"NotationLine", "Str", "Identifier", "DecimalInteger"
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
		public List<ProgramDefContext> programDef() {
			return getRuleContexts(ProgramDefContext.class);
		}
		public ProgramDefContext programDef(int i) {
			return getRuleContext(ProgramDefContext.class,i);
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
				{
				setState(38);
				programDef();
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

	public static class ProgramDefContext extends ParserRuleContext {
		public ProgramDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programDef; }
	 
		public ProgramDefContext() { }
		public void copyFrom(ProgramDefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramVarDefContext extends ProgramDefContext {
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public ProgramVarDefContext(ProgramDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterProgramVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitProgramVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitProgramVarDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProgramFuncDefContext extends ProgramDefContext {
		public FunctionDefContext functionDef() {
			return getRuleContext(FunctionDefContext.class,0);
		}
		public ProgramFuncDefContext(ProgramDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterProgramFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitProgramFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitProgramFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProgramClassDefContext extends ProgramDefContext {
		public ClassDefContext classDef() {
			return getRuleContext(ClassDefContext.class,0);
		}
		public ProgramClassDefContext(ProgramDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterProgramClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitProgramClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitProgramClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramDefContext programDef() throws RecognitionException {
		ProgramDefContext _localctx = new ProgramDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programDef);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ProgramFuncDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				functionDef();
				}
				break;
			case 2:
				_localctx = new ProgramClassDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				classDef();
				}
				break;
			case 3:
				_localctx = new ProgramVarDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				varDef();
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
		enterRule(_localctx, 4, RULE_suite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(LeftBigBracket);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Minus) | (1L << Not) | (1L << Negate) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << LeftSquareBracket) | (1L << LeftBracket) | (1L << Semicolon) | (1L << LeftBigBracket) | (1L << Int) | (1L << Bool) | (1L << String) | (1L << Null) | (1L << True) | (1L << False) | (1L << If) | (1L << For) | (1L << While) | (1L << Break) | (1L << Continue) | (1L << Return) | (1L << New) | (1L << This) | (1L << Str) | (1L << Identifier) | (1L << DecimalInteger))) != 0)) {
				{
				{
				setState(52);
				statement();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStatContext extends StatementContext {
		public StatementContext trueStmt;
		public StatementContext falseStmt;
		public TerminalNode If() { return getToken(MXParser.If, 0); }
		public TerminalNode LeftBracket() { return getToken(MXParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(MXParser.RightBracket, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(MXParser.Else, 0); }
		public IfStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhilestateContext extends StatementContext {
		public TerminalNode While() { return getToken(MXParser.While, 0); }
		public TerminalNode LeftBracket() { return getToken(MXParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(MXParser.RightBracket, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhilestateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterWhilestate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitWhilestate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitWhilestate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SuiteStatContext extends StatementContext {
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public SuiteStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterSuiteStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitSuiteStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitSuiteStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatContext extends StatementContext {
		public TerminalNode Return() { return getToken(MXParser.Return, 0); }
		public TerminalNode Semicolon() { return getToken(MXParser.Semicolon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterReturnStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitReturnStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitReturnStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VardefineStatContext extends StatementContext {
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public VardefineStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterVardefineStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitVardefineStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitVardefineStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueStatContext extends StatementContext {
		public TerminalNode Continue() { return getToken(MXParser.Continue, 0); }
		public TerminalNode Semicolon() { return getToken(MXParser.Semicolon, 0); }
		public ContinueStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterContinueStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitContinueStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitContinueStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprssionStatContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(MXParser.Semicolon, 0); }
		public ExprssionStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterExprssionStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitExprssionStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitExprssionStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakStatContext extends StatementContext {
		public TerminalNode Break() { return getToken(MXParser.Break, 0); }
		public TerminalNode Semicolon() { return getToken(MXParser.Semicolon, 0); }
		public BreakStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterBreakStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitBreakStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitBreakStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyStatContext extends StatementContext {
		public TerminalNode Semicolon() { return getToken(MXParser.Semicolon, 0); }
		public EmptyStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterEmptyStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitEmptyStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitEmptyStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStatContext extends StatementContext {
		public ExpressionContext init;
		public ExpressionContext check;
		public ExpressionContext step;
		public TerminalNode For() { return getToken(MXParser.For, 0); }
		public TerminalNode LeftBracket() { return getToken(MXParser.LeftBracket, 0); }
		public List<TerminalNode> Semicolon() { return getTokens(MXParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(MXParser.Semicolon, i);
		}
		public TerminalNode RightBracket() { return getToken(MXParser.RightBracket, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterForStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitForStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitForStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new SuiteStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				suite();
				}
				break;
			case 2:
				_localctx = new VardefineStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				varDef();
				}
				break;
			case 3:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				match(If);
				setState(63);
				match(LeftBracket);
				setState(64);
				expression(0);
				setState(65);
				match(RightBracket);
				setState(66);
				((IfStatContext)_localctx).trueStmt = statement();
				setState(69);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(67);
					match(Else);
					setState(68);
					((IfStatContext)_localctx).falseStmt = statement();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new WhilestateContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				match(While);
				setState(72);
				match(LeftBracket);
				setState(73);
				expression(0);
				setState(74);
				match(RightBracket);
				setState(75);
				statement();
				}
				break;
			case 5:
				_localctx = new ForStatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				match(For);
				setState(78);
				match(LeftBracket);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Minus) | (1L << Not) | (1L << Negate) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << LeftSquareBracket) | (1L << LeftBracket) | (1L << Null) | (1L << True) | (1L << False) | (1L << New) | (1L << This) | (1L << Str) | (1L << Identifier) | (1L << DecimalInteger))) != 0)) {
					{
					setState(79);
					((ForStatContext)_localctx).init = expression(0);
					}
				}

				setState(82);
				match(Semicolon);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Minus) | (1L << Not) | (1L << Negate) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << LeftSquareBracket) | (1L << LeftBracket) | (1L << Null) | (1L << True) | (1L << False) | (1L << New) | (1L << This) | (1L << Str) | (1L << Identifier) | (1L << DecimalInteger))) != 0)) {
					{
					setState(83);
					((ForStatContext)_localctx).check = expression(0);
					}
				}

				setState(86);
				match(Semicolon);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Minus) | (1L << Not) | (1L << Negate) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << LeftSquareBracket) | (1L << LeftBracket) | (1L << Null) | (1L << True) | (1L << False) | (1L << New) | (1L << This) | (1L << Str) | (1L << Identifier) | (1L << DecimalInteger))) != 0)) {
					{
					setState(87);
					((ForStatContext)_localctx).step = expression(0);
					}
				}

				setState(90);
				match(RightBracket);
				setState(91);
				statement();
				}
				break;
			case 6:
				_localctx = new BreakStatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				match(Break);
				setState(93);
				match(Semicolon);
				}
				break;
			case 7:
				_localctx = new ContinueStatContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(94);
				match(Continue);
				setState(95);
				match(Semicolon);
				}
				break;
			case 8:
				_localctx = new ReturnStatContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(96);
				match(Return);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Minus) | (1L << Not) | (1L << Negate) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << LeftSquareBracket) | (1L << LeftBracket) | (1L << Null) | (1L << True) | (1L << False) | (1L << New) | (1L << This) | (1L << Str) | (1L << Identifier) | (1L << DecimalInteger))) != 0)) {
					{
					setState(97);
					expression(0);
					}
				}

				setState(100);
				match(Semicolon);
				}
				break;
			case 9:
				_localctx = new ExprssionStatContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(101);
				expression(0);
				setState(102);
				match(Semicolon);
				}
				break;
			case 10:
				_localctx = new EmptyStatContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(104);
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
		enterRule(_localctx, 8, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(Class);
			setState(108);
			match(Identifier);
			setState(109);
			match(LeftBigBracket);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Bool) | (1L << String) | (1L << Void) | (1L << Identifier))) != 0)) {
				{
				setState(113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(110);
					varDef();
					}
					break;
				case 2:
					{
					setState(111);
					functionDef();
					}
					break;
				case 3:
					{
					setState(112);
					constructDef();
					}
					break;
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(RightBigBracket);
			setState(119);
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
		public FunctiontypeContext functiontype() {
			return getRuleContext(FunctiontypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MXParser.Identifier, 0); }
		public TerminalNode LeftBracket() { return getToken(MXParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(MXParser.RightBracket, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_functionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			functiontype();
			setState(122);
			match(Identifier);
			setState(123);
			match(LeftBracket);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Bool) | (1L << String) | (1L << Identifier))) != 0)) {
				{
				setState(124);
				functionParameterList();
				}
			}

			setState(127);
			match(RightBracket);
			setState(128);
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
		enterRule(_localctx, 12, RULE_constructDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(Identifier);
			setState(131);
			match(LeftBracket);
			setState(132);
			match(RightBracket);
			setState(133);
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
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
	 
		public VarDefContext() { }
		public void copyFrom(VarDefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ManyDefContext extends VarDefContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(MXParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MXParser.Identifier, i);
		}
		public TerminalNode Semicolon() { return getToken(MXParser.Semicolon, 0); }
		public List<TerminalNode> Comma() { return getTokens(MXParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MXParser.Comma, i);
		}
		public ManyDefContext(VarDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterManyDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitManyDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitManyDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignDefContext extends VarDefContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MXParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(MXParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(MXParser.Semicolon, 0); }
		public AssignDefContext(VarDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterAssignDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitAssignDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitAssignDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varDef);
		int _la;
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ManyDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				type(0);
				setState(136);
				match(Identifier);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(137);
					match(Comma);
					setState(138);
					match(Identifier);
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144);
				match(Semicolon);
				}
				break;
			case 2:
				_localctx = new AssignDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				type(0);
				setState(147);
				match(Identifier);
				setState(148);
				match(Assign);
				setState(149);
				expression(0);
				setState(150);
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

	public static class LambdaContext extends ParserRuleContext {
		public TerminalNode Minus() { return getToken(MXParser.Minus, 0); }
		public TerminalNode Greater() { return getToken(MXParser.Greater, 0); }
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
		public TerminalNode LeftSquareBracket() { return getToken(MXParser.LeftSquareBracket, 0); }
		public TerminalNode And() { return getToken(MXParser.And, 0); }
		public TerminalNode RightSquareBracket() { return getToken(MXParser.RightSquareBracket, 0); }
		public FunctionParameterListContext functionParameterList() {
			return getRuleContext(FunctionParameterListContext.class,0);
		}
		public FunctionInsListContext functionInsList() {
			return getRuleContext(FunctionInsListContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(154);
				match(LeftSquareBracket);
				setState(155);
				match(And);
				setState(156);
				match(RightSquareBracket);
				setState(157);
				match(LeftBracket);
				setState(158);
				match(RightBracket);
				}
				break;
			case 2:
				{
				setState(159);
				match(LeftSquareBracket);
				setState(160);
				match(And);
				setState(161);
				match(RightSquareBracket);
				setState(162);
				match(LeftBracket);
				setState(163);
				functionParameterList();
				setState(164);
				match(RightBracket);
				}
				break;
			case 3:
				{
				setState(166);
				match(T__0);
				}
				break;
			}
			setState(169);
			match(Minus);
			setState(170);
			match(Greater);
			setState(171);
			suite();
			setState(172);
			match(LeftBracket);
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(173);
				functionInsList();
				}
				break;
			}
			setState(176);
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
		public NewsentenceContext newsentence() {
			return getRuleContext(NewsentenceContext.class,0);
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
		public TerminalNode Minus() { return getToken(MXParser.Minus, 0); }
		public TerminalNode Negate() { return getToken(MXParser.Negate, 0); }
		public TerminalNode Not() { return getToken(MXParser.Not, 0); }
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
	public static class BinaryOpExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Multiply() { return getToken(MXParser.Multiply, 0); }
		public TerminalNode Mod() { return getToken(MXParser.Mod, 0); }
		public TerminalNode Minus() { return getToken(MXParser.Minus, 0); }
		public TerminalNode Plus() { return getToken(MXParser.Plus, 0); }
		public TerminalNode And() { return getToken(MXParser.And, 0); }
		public TerminalNode Or() { return getToken(MXParser.Or, 0); }
		public TerminalNode Xor() { return getToken(MXParser.Xor, 0); }
		public TerminalNode LeftShift() { return getToken(MXParser.LeftShift, 0); }
		public TerminalNode RightShift() { return getToken(MXParser.RightShift, 0); }
		public TerminalNode Equal() { return getToken(MXParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(MXParser.NotEqual, 0); }
		public TerminalNode Less() { return getToken(MXParser.Less, 0); }
		public TerminalNode LessEqual() { return getToken(MXParser.LessEqual, 0); }
		public TerminalNode Greater() { return getToken(MXParser.Greater, 0); }
		public TerminalNode GreaterEqual() { return getToken(MXParser.GreaterEqual, 0); }
		public TerminalNode AndAnd() { return getToken(MXParser.AndAnd, 0); }
		public TerminalNode OrOr() { return getToken(MXParser.OrOr, 0); }
		public BinaryOpExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterBinaryOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitBinaryOpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitBinaryOpExpr(this);
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
		public FunctionInsListContext functionInsList() {
			return getRuleContext(FunctionInsListContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(MXParser.RightBracket, 0); }
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
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case LeftSquareBracket:
				{
				_localctx = new LambdaExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(179);
				lambda();
				}
				break;
			case LeftBracket:
			case Null:
			case True:
			case False:
			case This:
			case Str:
			case Identifier:
			case DecimalInteger:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				primary();
				}
				break;
			case New:
				{
				_localctx = new NewExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				newsentence();
				}
				break;
			case Minus:
				{
				_localctx = new PrefixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				((PrefixExprContext)_localctx).op = match(Minus);
				setState(183);
				expression(12);
				}
				break;
			case Negate:
				{
				_localctx = new PrefixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				((PrefixExprContext)_localctx).op = match(Negate);
				setState(185);
				expression(11);
				}
				break;
			case Not:
				{
				_localctx = new PrefixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				((PrefixExprContext)_localctx).op = match(Not);
				setState(187);
				expression(10);
				}
				break;
			case PlusPlus:
			case MinusMinus:
				{
				_localctx = new PrefixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
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
				setState(189);
				expression(9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(228);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryOpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(193);
						((BinaryOpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << Multiply) | (1L << Mod))) != 0)) ) {
							((BinaryOpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(194);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new BinaryOpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(196);
						((BinaryOpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
							((BinaryOpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(197);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new BinaryOpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(199);
						((BinaryOpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << And) | (1L << Or) | (1L << Xor))) != 0)) ) {
							((BinaryOpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(200);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new BinaryOpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(201);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(202);
						((BinaryOpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==RightShift || _la==LeftShift) ) {
							((BinaryOpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(203);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new BinaryOpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(204);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(205);
						((BinaryOpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Greater) | (1L << GreaterEqual) | (1L << Less) | (1L << LessEqual) | (1L << NotEqual) | (1L << Equal))) != 0)) ) {
							((BinaryOpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(206);
						expression(4);
						}
						break;
					case 6:
						{
						_localctx = new BinaryOpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(207);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(208);
						((BinaryOpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AndAnd || _la==OrOr) ) {
							((BinaryOpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(209);
						expression(3);
						}
						break;
					case 7:
						{
						_localctx = new AssignExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(210);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(211);
						match(Assign);
						setState(212);
						expression(1);
						}
						break;
					case 8:
						{
						_localctx = new PointExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(213);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(214);
						match(Point);
						setState(215);
						match(Identifier);
						}
						break;
					case 9:
						{
						_localctx = new FunctionExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(216);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(217);
						match(LeftBracket);
						setState(218);
						functionInsList();
						setState(219);
						match(RightBracket);
						}
						break;
					case 10:
						{
						_localctx = new SubscriptExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(221);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(222);
						match(LeftSquareBracket);
						setState(223);
						expression(0);
						setState(224);
						match(RightSquareBracket);
						}
						break;
					case 11:
						{
						_localctx = new BackfixExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(226);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(227);
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
					}
					} 
				}
				setState(232);
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
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Minus) | (1L << Not) | (1L << Negate) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << LeftSquareBracket) | (1L << LeftBracket) | (1L << Null) | (1L << True) | (1L << False) | (1L << New) | (1L << This) | (1L << Str) | (1L << Identifier) | (1L << DecimalInteger))) != 0)) {
				{
				setState(233);
				expression(0);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(234);
					match(Comma);
					setState(235);
					expression(0);
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
			setState(243);
			type(0);
			setState(244);
			match(Identifier);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(245);
				match(Comma);
				setState(246);
				type(0);
				setState(247);
				match(Identifier);
				}
				}
				setState(253);
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

	public static class NewsentenceContext extends ParserRuleContext {
		public NewsentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newsentence; }
	 
		public NewsentenceContext() { }
		public void copyFrom(NewsentenceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EasyCreateContext extends NewsentenceContext {
		public TerminalNode New() { return getToken(MXParser.New, 0); }
		public EasytypeContext easytype() {
			return getRuleContext(EasytypeContext.class,0);
		}
		public EasyCreateContext(NewsentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterEasyCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitEasyCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitEasyCreate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClassCreateContext extends NewsentenceContext {
		public TerminalNode New() { return getToken(MXParser.New, 0); }
		public EasytypeContext easytype() {
			return getRuleContext(EasytypeContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(MXParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(MXParser.RightBracket, 0); }
		public ClassCreateContext(NewsentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterClassCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitClassCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitClassCreate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayCreateContext extends NewsentenceContext {
		public TerminalNode New() { return getToken(MXParser.New, 0); }
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
		public ArrayCreateContext(NewsentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterArrayCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitArrayCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitArrayCreate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WrongCreateContext extends NewsentenceContext {
		public TerminalNode New() { return getToken(MXParser.New, 0); }
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WrongCreateContext(NewsentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterWrongCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitWrongCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitWrongCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewsentenceContext newsentence() throws RecognitionException {
		NewsentenceContext _localctx = new NewsentenceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_newsentence);
		try {
			int _alt;
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new WrongCreateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				match(New);
				setState(255);
				easytype();
				{
				setState(256);
				match(LeftSquareBracket);
				setState(257);
				match(RightSquareBracket);
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(265);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
						case 1:
							{
							{
							setState(259);
							match(LeftSquareBracket);
							setState(260);
							match(RightSquareBracket);
							}
							}
							break;
						case 2:
							{
							setState(261);
							match(LeftSquareBracket);
							setState(262);
							expression(0);
							setState(263);
							match(RightSquareBracket);
							}
							break;
						}
						} 
					}
					setState(269);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new WrongCreateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(New);
				setState(271);
				easytype();
				setState(276); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(272);
						match(LeftSquareBracket);
						setState(273);
						expression(0);
						setState(274);
						match(RightSquareBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(278); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(282); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(280);
						match(LeftSquareBracket);
						setState(281);
						match(RightSquareBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(284); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(300); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(290); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(286);
								match(LeftSquareBracket);
								setState(287);
								expression(0);
								setState(288);
								match(RightSquareBracket);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(292); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(296); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(294);
								match(LeftSquareBracket);
								setState(295);
								match(RightSquareBracket);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(298); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(302); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				_localctx = new WrongCreateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				match(New);
				setState(305);
				easytype();
				setState(310); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(306);
						match(LeftSquareBracket);
						setState(307);
						expression(0);
						setState(308);
						match(RightSquareBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(312); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(316); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(314);
						match(LeftSquareBracket);
						setState(315);
						match(RightSquareBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(318); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(324); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(320);
						match(LeftSquareBracket);
						setState(321);
						expression(0);
						setState(322);
						match(RightSquareBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(326); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				_localctx = new ArrayCreateContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(328);
				match(New);
				setState(329);
				easytype();
				setState(334); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(330);
						match(LeftSquareBracket);
						setState(331);
						expression(0);
						setState(332);
						match(RightSquareBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(336); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(338);
						match(LeftSquareBracket);
						setState(339);
						match(RightSquareBracket);
						}
						} 
					}
					setState(344);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				}
				break;
			case 5:
				_localctx = new ClassCreateContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(345);
				match(New);
				setState(346);
				easytype();
				setState(347);
				match(LeftBracket);
				setState(348);
				match(RightBracket);
				}
				break;
			case 6:
				_localctx = new EasyCreateContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(350);
				match(New);
				setState(351);
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

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstExprContext extends PrimaryContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ConstExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterConstExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitConstExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitConstExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprContext extends PrimaryContext {
		public TerminalNode LeftBracket() { return getToken(MXParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(MXParser.RightBracket, 0); }
		public ExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClassExprContext extends PrimaryContext {
		public TerminalNode Identifier() { return getToken(MXParser.Identifier, 0); }
		public ClassExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterClassExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitClassExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitClassExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisExprContext extends PrimaryContext {
		public TerminalNode This() { return getToken(MXParser.This, 0); }
		public ThisExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterThisExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitThisExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitThisExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primary);
		try {
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				_localctx = new ExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(LeftBracket);
				setState(355);
				expression(0);
				setState(356);
				match(RightBracket);
				}
				break;
			case This:
				_localctx = new ThisExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				match(This);
				}
				break;
			case Identifier:
				_localctx = new ClassExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				match(Identifier);
				}
				break;
			case Null:
			case True:
			case False:
			case Str:
			case DecimalInteger:
				_localctx = new ConstExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
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

	public static class FunctiontypeContext extends ParserRuleContext {
		public FunctiontypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiontype; }
	 
		public FunctiontypeContext() { }
		public void copyFrom(FunctiontypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VoidTypeContext extends FunctiontypeContext {
		public TerminalNode Void() { return getToken(MXParser.Void, 0); }
		public VoidTypeContext(FunctiontypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterVoidType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitVoidType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitVoidType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BasictypeContext extends FunctiontypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BasictypeContext(FunctiontypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterBasictype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitBasictype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitBasictype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiontypeContext functiontype() throws RecognitionException {
		FunctiontypeContext _localctx = new FunctiontypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functiontype);
		try {
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Bool:
			case String:
			case Identifier:
				_localctx = new BasictypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				type(0);
				}
				break;
			case Void:
				_localctx = new VoidTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				match(Void);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArraytypeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LeftSquareBracket() { return getToken(MXParser.LeftSquareBracket, 0); }
		public TerminalNode RightSquareBracket() { return getToken(MXParser.RightSquareBracket, 0); }
		public ArraytypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterArraytype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitArraytype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitArraytype(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OnlytypeContext extends TypeContext {
		public EasytypeContext easytype() {
			return getRuleContext(EasytypeContext.class,0);
		}
		public OnlytypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterOnlytype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitOnlytype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitOnlytype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new OnlytypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(368);
			easytype();
			}
			_ctx.stop = _input.LT(-1);
			setState(375);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArraytypeContext(new TypeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(370);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(371);
					match(LeftSquareBracket);
					setState(372);
					match(RightSquareBracket);
					}
					} 
				}
				setState(377);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EasytypeContext extends ParserRuleContext {
		public EasytypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_easytype; }
	 
		public EasytypeContext() { }
		public void copyFrom(EasytypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolTypeContext extends EasytypeContext {
		public TerminalNode Bool() { return getToken(MXParser.Bool, 0); }
		public BoolTypeContext(EasytypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterBoolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitBoolType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitBoolType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringTypeContext extends EasytypeContext {
		public TerminalNode String() { return getToken(MXParser.String, 0); }
		public StringTypeContext(EasytypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterStringType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitStringType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitStringType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InttypeContext extends EasytypeContext {
		public TerminalNode Int() { return getToken(MXParser.Int, 0); }
		public InttypeContext(EasytypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterInttype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitInttype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitInttype(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClassTypeContext extends EasytypeContext {
		public TerminalNode Identifier() { return getToken(MXParser.Identifier, 0); }
		public ClassTypeContext(EasytypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EasytypeContext easytype() throws RecognitionException {
		EasytypeContext _localctx = new EasytypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_easytype);
		try {
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
				_localctx = new InttypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				match(Int);
				}
				break;
			case String:
				_localctx = new StringTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(String);
				}
				break;
			case Bool:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				match(Bool);
				}
				break;
			case Identifier:
				_localctx = new ClassTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(381);
				match(Identifier);
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

	public static class BoolConstContext extends ParserRuleContext {
		public TerminalNode True() { return getToken(MXParser.True, 0); }
		public TerminalNode False() { return getToken(MXParser.False, 0); }
		public BoolConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterBoolConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitBoolConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitBoolConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolConstContext boolConst() throws RecognitionException {
		BoolConstContext _localctx = new BoolConstContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_boolConst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_la = _input.LA(1);
			if ( !(_la==True || _la==False) ) {
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

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntcstContext extends LiteralContext {
		public TerminalNode DecimalInteger() { return getToken(MXParser.DecimalInteger, 0); }
		public IntcstContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterIntcst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitIntcst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitIntcst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolCstContext extends LiteralContext {
		public BoolConstContext boolConst() {
			return getRuleContext(BoolConstContext.class,0);
		}
		public BoolCstContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterBoolCst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitBoolCst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitBoolCst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrcstContext extends LiteralContext {
		public TerminalNode Str() { return getToken(MXParser.Str, 0); }
		public StrcstContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterStrcst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitStrcst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitStrcst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullcstContext extends LiteralContext {
		public TerminalNode Null() { return getToken(MXParser.Null, 0); }
		public NullcstContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterNullcst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitNullcst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitNullcst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_literal);
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case True:
			case False:
				_localctx = new BoolCstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				boolConst();
				}
				break;
			case DecimalInteger:
				_localctx = new IntcstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				match(DecimalInteger);
				}
				break;
			case Str:
				_localctx = new StrcstContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				match(Str);
				}
				break;
			case Null:
				_localctx = new NullcstContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(389);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 15:
			return type_sempred((TypeContext)_localctx, predIndex);
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
			return precpred(_ctx, 1);
		case 7:
			return precpred(_ctx, 15);
		case 8:
			return precpred(_ctx, 14);
		case 9:
			return precpred(_ctx, 13);
		case 10:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u018b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\3\3\3\3\3\5"+
		"\3\64\n\3\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5H\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5S\n\5"+
		"\3\5\3\5\5\5W\n\5\3\5\3\5\5\5[\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"e\n\5\3\5\3\5\3\5\3\5\3\5\5\5l\n\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6t\n\6\f"+
		"\6\16\6w\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u0080\n\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u008e\n\t\f\t\16\t\u0091\13\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009b\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00aa\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b1"+
		"\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u00c1\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00e7"+
		"\n\13\f\13\16\13\u00ea\13\13\3\f\3\f\3\f\7\f\u00ef\n\f\f\f\16\f\u00f2"+
		"\13\f\5\f\u00f4\n\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00fc\n\r\f\r\16\r\u00ff"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u010c"+
		"\n\16\f\16\16\16\u010f\13\16\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u0117"+
		"\n\16\r\16\16\16\u0118\3\16\3\16\6\16\u011d\n\16\r\16\16\16\u011e\3\16"+
		"\3\16\3\16\3\16\6\16\u0125\n\16\r\16\16\16\u0126\3\16\3\16\6\16\u012b"+
		"\n\16\r\16\16\16\u012c\6\16\u012f\n\16\r\16\16\16\u0130\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\6\16\u0139\n\16\r\16\16\16\u013a\3\16\3\16\6\16\u013f"+
		"\n\16\r\16\16\16\u0140\3\16\3\16\3\16\3\16\6\16\u0147\n\16\r\16\16\16"+
		"\u0148\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u0151\n\16\r\16\16\16\u0152"+
		"\3\16\3\16\7\16\u0157\n\16\f\16\16\16\u015a\13\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0163\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u016c\n\17\3\20\3\20\5\20\u0170\n\20\3\21\3\21\3\21\3\21\3\21\3\21\7"+
		"\21\u0178\n\21\f\21\16\21\u017b\13\21\3\22\3\22\3\22\3\22\5\22\u0181\n"+
		"\22\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u0189\n\24\3\24\2\4\24 \25\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\n\3\2\32\33\5\2\4\4\7\7\t\t"+
		"\3\2\5\6\3\2\25\27\3\2\23\24\3\2\n\17\3\2\20\21\3\2-.\2\u01c2\2+\3\2\2"+
		"\2\4\63\3\2\2\2\6\65\3\2\2\2\bk\3\2\2\2\nm\3\2\2\2\f{\3\2\2\2\16\u0084"+
		"\3\2\2\2\20\u009a\3\2\2\2\22\u00a9\3\2\2\2\24\u00c0\3\2\2\2\26\u00f3\3"+
		"\2\2\2\30\u00f5\3\2\2\2\32\u0162\3\2\2\2\34\u016b\3\2\2\2\36\u016f\3\2"+
		"\2\2 \u0171\3\2\2\2\"\u0180\3\2\2\2$\u0182\3\2\2\2&\u0188\3\2\2\2(*\5"+
		"\4\3\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7"+
		"\2\2\3/\3\3\2\2\2\60\64\5\f\7\2\61\64\5\n\6\2\62\64\5\20\t\2\63\60\3\2"+
		"\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\5\3\2\2\2\659\7#\2\2\668\5\b\5\2\67"+
		"\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\7$\2"+
		"\2=\7\3\2\2\2>l\5\6\4\2?l\5\20\t\2@A\7/\2\2AB\7\37\2\2BC\5\24\13\2CD\7"+
		" \2\2DG\5\b\5\2EF\7\60\2\2FH\5\b\5\2GE\3\2\2\2GH\3\2\2\2Hl\3\2\2\2IJ\7"+
		"\62\2\2JK\7\37\2\2KL\5\24\13\2LM\7 \2\2MN\5\b\5\2Nl\3\2\2\2OP\7\61\2\2"+
		"PR\7\37\2\2QS\5\24\13\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TV\7!\2\2UW\5\24"+
		"\13\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2XZ\7!\2\2Y[\5\24\13\2ZY\3\2\2\2Z[\3"+
		"\2\2\2[\\\3\2\2\2\\]\7 \2\2]l\5\b\5\2^_\7\63\2\2_l\7!\2\2`a\7\64\2\2a"+
		"l\7!\2\2bd\7\65\2\2ce\5\24\13\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fl\7!\2\2"+
		"gh\5\24\13\2hi\7!\2\2il\3\2\2\2jl\7!\2\2k>\3\2\2\2k?\3\2\2\2k@\3\2\2\2"+
		"kI\3\2\2\2kO\3\2\2\2k^\3\2\2\2k`\3\2\2\2kb\3\2\2\2kg\3\2\2\2kj\3\2\2\2"+
		"l\t\3\2\2\2mn\7\67\2\2no\7>\2\2ou\7#\2\2pt\5\20\t\2qt\5\f\7\2rt\5\16\b"+
		"\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2"+
		"\2wu\3\2\2\2xy\7$\2\2yz\7!\2\2z\13\3\2\2\2{|\5\36\20\2|}\7>\2\2}\177\7"+
		"\37\2\2~\u0080\5\30\r\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2"+
		"\2\2\u0081\u0082\7 \2\2\u0082\u0083\5\6\4\2\u0083\r\3\2\2\2\u0084\u0085"+
		"\7>\2\2\u0085\u0086\7\37\2\2\u0086\u0087\7 \2\2\u0087\u0088\5\6\4\2\u0088"+
		"\17\3\2\2\2\u0089\u008a\5 \21\2\u008a\u008f\7>\2\2\u008b\u008c\7\"\2\2"+
		"\u008c\u008e\7>\2\2\u008d\u008b\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092"+
		"\u0093\7!\2\2\u0093\u009b\3\2\2\2\u0094\u0095\5 \21\2\u0095\u0096\7>\2"+
		"\2\u0096\u0097\7\31\2\2\u0097\u0098\5\24\13\2\u0098\u0099\7!\2\2\u0099"+
		"\u009b\3\2\2\2\u009a\u0089\3\2\2\2\u009a\u0094\3\2\2\2\u009b\21\3\2\2"+
		"\2\u009c\u009d\7\35\2\2\u009d\u009e\7\25\2\2\u009e\u009f\7\36\2\2\u009f"+
		"\u00a0\7\37\2\2\u00a0\u00aa\7 \2\2\u00a1\u00a2\7\35\2\2\u00a2\u00a3\7"+
		"\25\2\2\u00a3\u00a4\7\36\2\2\u00a4\u00a5\7\37\2\2\u00a5\u00a6\5\30\r\2"+
		"\u00a6\u00a7\7 \2\2\u00a7\u00aa\3\2\2\2\u00a8\u00aa\7\3\2\2\u00a9\u009c"+
		"\3\2\2\2\u00a9\u00a1\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\7\6\2\2\u00ac\u00ad\7\n\2\2\u00ad\u00ae\5\6\4\2\u00ae\u00b0\7\37"+
		"\2\2\u00af\u00b1\5\26\f\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b3\7 \2\2\u00b3\23\3\2\2\2\u00b4\u00b5\b\13\1"+
		"\2\u00b5\u00c1\5\22\n\2\u00b6\u00c1\5\34\17\2\u00b7\u00c1\5\32\16\2\u00b8"+
		"\u00b9\7\6\2\2\u00b9\u00c1\5\24\13\16\u00ba\u00bb\7\30\2\2\u00bb\u00c1"+
		"\5\24\13\r\u00bc\u00bd\7\22\2\2\u00bd\u00c1\5\24\13\f\u00be\u00bf\t\2"+
		"\2\2\u00bf\u00c1\5\24\13\13\u00c0\u00b4\3\2\2\2\u00c0\u00b6\3\2\2\2\u00c0"+
		"\u00b7\3\2\2\2\u00c0\u00b8\3\2\2\2\u00c0\u00ba\3\2\2\2\u00c0\u00bc\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c1\u00e8\3\2\2\2\u00c2\u00c3\f\t\2\2\u00c3"+
		"\u00c4\t\3\2\2\u00c4\u00e7\5\24\13\n\u00c5\u00c6\f\b\2\2\u00c6\u00c7\t"+
		"\4\2\2\u00c7\u00e7\5\24\13\t\u00c8\u00c9\f\7\2\2\u00c9\u00ca\t\5\2\2\u00ca"+
		"\u00e7\5\24\13\b\u00cb\u00cc\f\6\2\2\u00cc\u00cd\t\6\2\2\u00cd\u00e7\5"+
		"\24\13\7\u00ce\u00cf\f\5\2\2\u00cf\u00d0\t\7\2\2\u00d0\u00e7\5\24\13\6"+
		"\u00d1\u00d2\f\4\2\2\u00d2\u00d3\t\b\2\2\u00d3\u00e7\5\24\13\5\u00d4\u00d5"+
		"\f\3\2\2\u00d5\u00d6\7\31\2\2\u00d6\u00e7\5\24\13\3\u00d7\u00d8\f\21\2"+
		"\2\u00d8\u00d9\7\34\2\2\u00d9\u00e7\7>\2\2\u00da\u00db\f\20\2\2\u00db"+
		"\u00dc\7\37\2\2\u00dc\u00dd\5\26\f\2\u00dd\u00de\7 \2\2\u00de\u00e7\3"+
		"\2\2\2\u00df\u00e0\f\17\2\2\u00e0\u00e1\7\35\2\2\u00e1\u00e2\5\24\13\2"+
		"\u00e2\u00e3\7\36\2\2\u00e3\u00e7\3\2\2\2\u00e4\u00e5\f\n\2\2\u00e5\u00e7"+
		"\t\2\2\2\u00e6\u00c2\3\2\2\2\u00e6\u00c5\3\2\2\2\u00e6\u00c8\3\2\2\2\u00e6"+
		"\u00cb\3\2\2\2\u00e6\u00ce\3\2\2\2\u00e6\u00d1\3\2\2\2\u00e6\u00d4\3\2"+
		"\2\2\u00e6\u00d7\3\2\2\2\u00e6\u00da\3\2\2\2\u00e6\u00df\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\25\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00f0\5\24\13\2\u00ec"+
		"\u00ed\7\"\2\2\u00ed\u00ef\5\24\13\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3"+
		"\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00eb\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\27\3\2\2"+
		"\2\u00f5\u00f6\5 \21\2\u00f6\u00fd\7>\2\2\u00f7\u00f8\7\"\2\2\u00f8\u00f9"+
		"\5 \21\2\u00f9\u00fa\7>\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fc"+
		"\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\31\3\2\2"+
		"\2\u00ff\u00fd\3\2\2\2\u0100\u0101\7\66\2\2\u0101\u0102\5\"\22\2\u0102"+
		"\u0103\7\35\2\2\u0103\u0104\7\36\2\2\u0104\u010d\3\2\2\2\u0105\u0106\7"+
		"\35\2\2\u0106\u010c\7\36\2\2\u0107\u0108\7\35\2\2\u0108\u0109\5\24\13"+
		"\2\u0109\u010a\7\36\2\2\u010a\u010c\3\2\2\2\u010b\u0105\3\2\2\2\u010b"+
		"\u0107\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\u0163\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\7\66\2\2\u0111"+
		"\u0116\5\"\22\2\u0112\u0113\7\35\2\2\u0113\u0114\5\24\13\2\u0114\u0115"+
		"\7\36\2\2\u0115\u0117\3\2\2\2\u0116\u0112\3\2\2\2\u0117\u0118\3\2\2\2"+
		"\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u011b"+
		"\7\35\2\2\u011b\u011d\7\36\2\2\u011c\u011a\3\2\2\2\u011d\u011e\3\2\2\2"+
		"\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u012e\3\2\2\2\u0120\u0121"+
		"\7\35\2\2\u0121\u0122\5\24\13\2\u0122\u0123\7\36\2\2\u0123\u0125\3\2\2"+
		"\2\u0124\u0120\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127"+
		"\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0129\7\35\2\2\u0129\u012b\7\36\2\2"+
		"\u012a\u0128\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u0124\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0163\3\2\2\2\u0132\u0133\7\66"+
		"\2\2\u0133\u0138\5\"\22\2\u0134\u0135\7\35\2\2\u0135\u0136\5\24\13\2\u0136"+
		"\u0137\7\36\2\2\u0137\u0139\3\2\2\2\u0138\u0134\3\2\2\2\u0139\u013a\3"+
		"\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013e\3\2\2\2\u013c"+
		"\u013d\7\35\2\2\u013d\u013f\7\36\2\2\u013e\u013c\3\2\2\2\u013f\u0140\3"+
		"\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0146\3\2\2\2\u0142"+
		"\u0143\7\35\2\2\u0143\u0144\5\24\13\2\u0144\u0145\7\36\2\2\u0145\u0147"+
		"\3\2\2\2\u0146\u0142\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u0163\3\2\2\2\u014a\u014b\7\66\2\2\u014b\u0150\5"+
		"\"\22\2\u014c\u014d\7\35\2\2\u014d\u014e\5\24\13\2\u014e\u014f\7\36\2"+
		"\2\u014f\u0151\3\2\2\2\u0150\u014c\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0150"+
		"\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0158\3\2\2\2\u0154\u0155\7\35\2\2"+
		"\u0155\u0157\7\36\2\2\u0156\u0154\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u0163\3\2\2\2\u015a\u0158\3\2\2\2\u015b"+
		"\u015c\7\66\2\2\u015c\u015d\5\"\22\2\u015d\u015e\7\37\2\2\u015e\u015f"+
		"\7 \2\2\u015f\u0163\3\2\2\2\u0160\u0161\7\66\2\2\u0161\u0163\5\"\22\2"+
		"\u0162\u0100\3\2\2\2\u0162\u0110\3\2\2\2\u0162\u0132\3\2\2\2\u0162\u014a"+
		"\3\2\2\2\u0162\u015b\3\2\2\2\u0162\u0160\3\2\2\2\u0163\33\3\2\2\2\u0164"+
		"\u0165\7\37\2\2\u0165\u0166\5\24\13\2\u0166\u0167\7 \2\2\u0167\u016c\3"+
		"\2\2\2\u0168\u016c\78\2\2\u0169\u016c\7>\2\2\u016a\u016c\5&\24\2\u016b"+
		"\u0164\3\2\2\2\u016b\u0168\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2"+
		"\2\2\u016c\35\3\2\2\2\u016d\u0170\5 \21\2\u016e\u0170\7,\2\2\u016f\u016d"+
		"\3\2\2\2\u016f\u016e\3\2\2\2\u0170\37\3\2\2\2\u0171\u0172\b\21\1\2\u0172"+
		"\u0173\5\"\22\2\u0173\u0179\3\2\2\2\u0174\u0175\f\3\2\2\u0175\u0176\7"+
		"\35\2\2\u0176\u0178\7\36\2\2\u0177\u0174\3\2\2\2\u0178\u017b\3\2\2\2\u0179"+
		"\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a!\3\2\2\2\u017b\u0179\3\2\2\2"+
		"\u017c\u0181\7(\2\2\u017d\u0181\7*\2\2\u017e\u0181\7)\2\2\u017f\u0181"+
		"\7>\2\2\u0180\u017c\3\2\2\2\u0180\u017d\3\2\2\2\u0180\u017e\3\2\2\2\u0180"+
		"\u017f\3\2\2\2\u0181#\3\2\2\2\u0182\u0183\t\t\2\2\u0183%\3\2\2\2\u0184"+
		"\u0189\5$\23\2\u0185\u0189\7?\2\2\u0186\u0189\7=\2\2\u0187\u0189\7+\2"+
		"\2\u0188\u0184\3\2\2\2\u0188\u0185\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0187"+
		"\3\2\2\2\u0189\'\3\2\2\2*+\639GRVZdksu\177\u008f\u009a\u00a9\u00b0\u00c0"+
		"\u00e6\u00e8\u00f0\u00f3\u00fd\u010b\u010d\u0118\u011e\u0126\u012c\u0130"+
		"\u013a\u0140\u0148\u0152\u0158\u0162\u016b\u016f\u0179\u0180\u0188";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}