
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
		T__0=1, Plus=2, Minus=3, Multiply=4, Devide=5, Mod=6, Greater=7, GreaterEqual=8, 
		Less=9, LessEqual=10, NotEqual=11, Equal=12, AndAnd=13, OrOr=14, Not=15, 
		RightShift=16, LeftShift=17, And=18, Or=19, Xor=20, Negate=21, Assign=22, 
		PlusPlus=23, MinusMinus=24, Point=25, LeftSquareBracket=26, RightSquareBracket=27, 
		LeftBracket=28, RightBracket=29, Semicolon=30, Comma=31, LeftBigBracket=32, 
		RightBigBracket=33, Tabs=34, Annotate=35, StringEdge=36, Int=37, Bool=38, 
		String=39, Null=40, Void=41, True=42, False=43, If=44, Else=45, For=46, 
		While=47, Break=48, Continue=49, Return=50, New=51, Class=52, This=53, 
		WS=54, NEWLINE=55, BLOCK_COMMENT=56, NotationLine=57, Str=58, Identifier=59, 
		DecimalInteger=60;
	public static final int
		RULE_program = 0, RULE_programDef = 1, RULE_suite = 2, RULE_statement = 3, 
		RULE_classDef = 4, RULE_functionDef = 5, RULE_constructDef = 6, RULE_classvarDef = 7, 
		RULE_basicvarDef = 8, RULE_varDef = 9, RULE_expression = 10, RULE_functionInsList = 11, 
		RULE_functionParameterList = 12, RULE_newsentence = 13, RULE_primary = 14, 
		RULE_functiontype = 15, RULE_type = 16, RULE_easytype = 17, RULE_boolConst = 18, 
		RULE_literal = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programDef", "suite", "statement", "classDef", "functionDef", 
			"constructDef", "classvarDef", "basicvarDef", "varDef", "expression", 
			"functionInsList", "functionParameterList", "newsentence", "primary", 
			"functiontype", "type", "easytype", "boolConst", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/'", "'+'", "'-'", "'*'", "'\\'", "'%'", "'>'", "'>='", "'<'", 
			"'<='", "'!='", "'=='", "'&&'", "'||'", "'!'", "'>>'", "'<<'", "'&'", 
			"'|'", "'^'", "'~'", "'='", "'++'", "'--'", "'.'", "'['", "']'", "'('", 
			"')'", "';'", "','", "'{'", "'}'", "'\\t'", "'//'", "'\"'", "'int'", 
			"'bool'", "'string'", "'null'", "'void'", "'true'", "'false'", "'if'", 
			"'else'", "'for'", "'while'", "'break'", "'continue'", "'return'", "'new'", 
			"'class'", "'this'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "Plus", "Minus", "Multiply", "Devide", "Mod", "Greater", 
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
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Bool) | (1L << String) | (1L << Void) | (1L << Class) | (1L << Identifier))) != 0)) {
				{
				{
				setState(40);
				programDef();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
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
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ProgramFuncDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				functionDef();
				}
				break;
			case 2:
				_localctx = new ProgramClassDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				classDef();
				}
				break;
			case 3:
				_localctx = new ProgramVarDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
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
			setState(53);
			match(LeftBigBracket);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Minus) | (1L << Not) | (1L << Negate) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << LeftBracket) | (1L << Semicolon) | (1L << LeftBigBracket) | (1L << Int) | (1L << Bool) | (1L << String) | (1L << Null) | (1L << True) | (1L << False) | (1L << If) | (1L << For) | (1L << While) | (1L << Break) | (1L << Continue) | (1L << Return) | (1L << New) | (1L << This) | (1L << Str) | (1L << Identifier) | (1L << DecimalInteger))) != 0)) {
				{
				{
				setState(54);
				statement();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
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
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new SuiteStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				suite();
				}
				break;
			case 2:
				_localctx = new VardefineStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				varDef();
				}
				break;
			case 3:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(If);
				setState(65);
				match(LeftBracket);
				setState(66);
				expression(0);
				setState(67);
				match(RightBracket);
				setState(68);
				((IfStatContext)_localctx).trueStmt = statement();
				setState(71);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(69);
					match(Else);
					setState(70);
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
				setState(73);
				match(While);
				setState(74);
				match(LeftBracket);
				setState(75);
				expression(0);
				setState(76);
				match(RightBracket);
				setState(77);
				statement();
				}
				break;
			case 5:
				_localctx = new ForStatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				match(For);
				setState(80);
				match(LeftBracket);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Minus) | (1L << Not) | (1L << Negate) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << LeftBracket) | (1L << Null) | (1L << True) | (1L << False) | (1L << New) | (1L << This) | (1L << Str) | (1L << Identifier) | (1L << DecimalInteger))) != 0)) {
					{
					setState(81);
					((ForStatContext)_localctx).init = expression(0);
					}
				}

				setState(84);
				match(Semicolon);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Minus) | (1L << Not) | (1L << Negate) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << LeftBracket) | (1L << Null) | (1L << True) | (1L << False) | (1L << New) | (1L << This) | (1L << Str) | (1L << Identifier) | (1L << DecimalInteger))) != 0)) {
					{
					setState(85);
					((ForStatContext)_localctx).check = expression(0);
					}
				}

				setState(88);
				match(Semicolon);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Minus) | (1L << Not) | (1L << Negate) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << LeftBracket) | (1L << Null) | (1L << True) | (1L << False) | (1L << New) | (1L << This) | (1L << Str) | (1L << Identifier) | (1L << DecimalInteger))) != 0)) {
					{
					setState(89);
					((ForStatContext)_localctx).step = expression(0);
					}
				}

				setState(92);
				match(RightBracket);
				setState(93);
				statement();
				}
				break;
			case 6:
				_localctx = new BreakStatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(94);
				match(Break);
				setState(95);
				match(Semicolon);
				}
				break;
			case 7:
				_localctx = new ContinueStatContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(96);
				match(Continue);
				setState(97);
				match(Semicolon);
				}
				break;
			case 8:
				_localctx = new ReturnStatContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(98);
				match(Return);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Minus) | (1L << Not) | (1L << Negate) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << LeftBracket) | (1L << Null) | (1L << True) | (1L << False) | (1L << New) | (1L << This) | (1L << Str) | (1L << Identifier) | (1L << DecimalInteger))) != 0)) {
					{
					setState(99);
					expression(0);
					}
				}

				setState(102);
				match(Semicolon);
				}
				break;
			case 9:
				_localctx = new ExprssionStatContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(103);
				expression(0);
				setState(104);
				match(Semicolon);
				}
				break;
			case 10:
				_localctx = new EmptyStatContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(106);
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
		public List<ClassvarDefContext> classvarDef() {
			return getRuleContexts(ClassvarDefContext.class);
		}
		public ClassvarDefContext classvarDef(int i) {
			return getRuleContext(ClassvarDefContext.class,i);
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
			setState(109);
			match(Class);
			setState(110);
			match(Identifier);
			setState(111);
			match(LeftBigBracket);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Bool) | (1L << String) | (1L << Void) | (1L << Identifier))) != 0)) {
				{
				setState(115);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(112);
					classvarDef();
					}
					break;
				case 2:
					{
					setState(113);
					functionDef();
					}
					break;
				case 3:
					{
					setState(114);
					constructDef();
					}
					break;
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(RightBigBracket);
			setState(121);
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
			setState(123);
			functiontype();
			setState(124);
			match(Identifier);
			setState(125);
			match(LeftBracket);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Bool) | (1L << String) | (1L << Identifier))) != 0)) {
				{
				setState(126);
				functionParameterList();
				}
			}

			setState(129);
			match(RightBracket);
			setState(130);
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
			setState(132);
			match(Identifier);
			setState(133);
			match(LeftBracket);
			setState(134);
			match(RightBracket);
			setState(135);
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

	public static class ClassvarDefContext extends ParserRuleContext {
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
		public ClassvarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classvarDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterClassvarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitClassvarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitClassvarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassvarDefContext classvarDef() throws RecognitionException {
		ClassvarDefContext _localctx = new ClassvarDefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classvarDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			type(0);
			setState(138);
			match(Identifier);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(139);
				match(Comma);
				setState(140);
				match(Identifier);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
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

	public static class BasicvarDefContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MXParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(MXParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BasicvarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicvarDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).enterBasicvarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MXListener ) ((MXListener)listener).exitBasicvarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MXVisitor ) return ((MXVisitor<? extends T>)visitor).visitBasicvarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicvarDefContext basicvarDef() throws RecognitionException {
		BasicvarDefContext _localctx = new BasicvarDefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_basicvarDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(Identifier);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(149);
				match(Assign);
				setState(150);
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

	public static class VarDefContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<BasicvarDefContext> basicvarDef() {
			return getRuleContexts(BasicvarDefContext.class);
		}
		public BasicvarDefContext basicvarDef(int i) {
			return getRuleContext(BasicvarDefContext.class,i);
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
		enterRule(_localctx, 18, RULE_varDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			type(0);
			setState(154);
			basicvarDef();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(155);
				match(Comma);
				setState(156);
				basicvarDef();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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

				setState(165);
				primary();
				}
				break;
			case New:
				{
				_localctx = new NewExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				newsentence();
				}
				break;
			case Minus:
				{
				_localctx = new PrefixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				((PrefixExprContext)_localctx).op = match(Minus);
				setState(168);
				expression(12);
				}
				break;
			case Negate:
				{
				_localctx = new PrefixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				((PrefixExprContext)_localctx).op = match(Negate);
				setState(170);
				expression(11);
				}
				break;
			case Not:
				{
				_localctx = new PrefixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				((PrefixExprContext)_localctx).op = match(Not);
				setState(172);
				expression(10);
				}
				break;
			case PlusPlus:
			case MinusMinus:
				{
				_localctx = new PrefixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
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
				setState(174);
				expression(9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(213);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryOpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(177);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(178);
						((BinaryOpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Multiply) | (1L << Mod))) != 0)) ) {
							((BinaryOpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(179);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new BinaryOpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(180);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(181);
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
						setState(182);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new BinaryOpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(184);
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
						setState(185);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new BinaryOpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(187);
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
						setState(188);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new BinaryOpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(190);
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
						setState(191);
						expression(4);
						}
						break;
					case 6:
						{
						_localctx = new BinaryOpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(193);
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
						setState(194);
						expression(3);
						}
						break;
					case 7:
						{
						_localctx = new AssignExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(196);
						match(Assign);
						setState(197);
						expression(1);
						}
						break;
					case 8:
						{
						_localctx = new PointExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(199);
						match(Point);
						setState(200);
						match(Identifier);
						}
						break;
					case 9:
						{
						_localctx = new FunctionExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(201);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(202);
						match(LeftBracket);
						setState(203);
						functionInsList();
						setState(204);
						match(RightBracket);
						}
						break;
					case 10:
						{
						_localctx = new SubscriptExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(206);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(207);
						match(LeftSquareBracket);
						setState(208);
						expression(0);
						setState(209);
						match(RightSquareBracket);
						}
						break;
					case 11:
						{
						_localctx = new BackfixExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(212);
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
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		enterRule(_localctx, 22, RULE_functionInsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Minus) | (1L << Not) | (1L << Negate) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << LeftBracket) | (1L << Null) | (1L << True) | (1L << False) | (1L << New) | (1L << This) | (1L << Str) | (1L << Identifier) | (1L << DecimalInteger))) != 0)) {
				{
				setState(218);
				expression(0);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(219);
					match(Comma);
					setState(220);
					expression(0);
					}
					}
					setState(225);
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
		enterRule(_localctx, 24, RULE_functionParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			type(0);
			setState(229);
			match(Identifier);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(230);
				match(Comma);
				setState(231);
				type(0);
				setState(232);
				match(Identifier);
				}
				}
				setState(238);
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
		enterRule(_localctx, 26, RULE_newsentence);
		try {
			int _alt;
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new WrongCreateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(New);
				setState(240);
				easytype();
				{
				setState(241);
				match(LeftSquareBracket);
				setState(242);
				match(RightSquareBracket);
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(250);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
						case 1:
							{
							{
							setState(244);
							match(LeftSquareBracket);
							setState(245);
							match(RightSquareBracket);
							}
							}
							break;
						case 2:
							{
							setState(246);
							match(LeftSquareBracket);
							setState(247);
							expression(0);
							setState(248);
							match(RightSquareBracket);
							}
							break;
						}
						} 
					}
					setState(254);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new WrongCreateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(New);
				setState(256);
				easytype();
				setState(261); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(257);
						match(LeftSquareBracket);
						setState(258);
						expression(0);
						setState(259);
						match(RightSquareBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(263); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(267); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(265);
						match(LeftSquareBracket);
						setState(266);
						match(RightSquareBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(269); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(285); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(275); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(271);
								match(LeftSquareBracket);
								setState(272);
								expression(0);
								setState(273);
								match(RightSquareBracket);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(277); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(281); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(279);
								match(LeftSquareBracket);
								setState(280);
								match(RightSquareBracket);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(283); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(287); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				_localctx = new WrongCreateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				match(New);
				setState(290);
				easytype();
				setState(295); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(291);
						match(LeftSquareBracket);
						setState(292);
						expression(0);
						setState(293);
						match(RightSquareBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(297); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(301); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(299);
						match(LeftSquareBracket);
						setState(300);
						match(RightSquareBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(303); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(309); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(305);
						match(LeftSquareBracket);
						setState(306);
						expression(0);
						setState(307);
						match(RightSquareBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(311); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				_localctx = new ArrayCreateContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
				match(New);
				setState(314);
				easytype();
				setState(319); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(315);
						match(LeftSquareBracket);
						setState(316);
						expression(0);
						setState(317);
						match(RightSquareBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(321); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(323);
						match(LeftSquareBracket);
						setState(324);
						match(RightSquareBracket);
						}
						} 
					}
					setState(329);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				}
				break;
			case 5:
				_localctx = new ClassCreateContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(330);
				match(New);
				setState(331);
				easytype();
				setState(332);
				match(LeftBracket);
				setState(333);
				match(RightBracket);
				}
				break;
			case 6:
				_localctx = new EasyCreateContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(335);
				match(New);
				setState(336);
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
		enterRule(_localctx, 28, RULE_primary);
		try {
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				_localctx = new ExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				match(LeftBracket);
				setState(340);
				expression(0);
				setState(341);
				match(RightBracket);
				}
				break;
			case This:
				_localctx = new ThisExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(This);
				}
				break;
			case Identifier:
				_localctx = new ClassExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
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
				setState(345);
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
		enterRule(_localctx, 30, RULE_functiontype);
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Bool:
			case String:
			case Identifier:
				_localctx = new BasictypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				type(0);
				}
				break;
			case Void:
				_localctx = new VoidTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new OnlytypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(353);
			easytype();
			}
			_ctx.stop = _input.LT(-1);
			setState(360);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArraytypeContext(new TypeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(355);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(356);
					match(LeftSquareBracket);
					setState(357);
					match(RightSquareBracket);
					}
					} 
				}
				setState(362);
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
		enterRule(_localctx, 34, RULE_easytype);
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
				_localctx = new InttypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				match(Int);
				}
				break;
			case String:
				_localctx = new StringTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				match(String);
				}
				break;
			case Bool:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				match(Bool);
				}
				break;
			case Identifier:
				_localctx = new ClassTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(366);
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
		enterRule(_localctx, 36, RULE_boolConst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
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
		enterRule(_localctx, 38, RULE_literal);
		try {
			setState(375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case True:
			case False:
				_localctx = new BoolCstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				boolConst();
				}
				break;
			case DecimalInteger:
				_localctx = new IntcstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				match(DecimalInteger);
				}
				break;
			case Str:
				_localctx = new StrcstContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(373);
				match(Str);
				}
				break;
			case Null:
				_localctx = new NullcstContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(374);
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
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 16:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u017c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\5\3\66\n\3\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5J\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5U\n\5\3\5\3\5\5\5Y\n\5\3\5\3\5\5\5]\n\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5g\n\5\3\5\3\5\3\5\3\5\3\5\5\5n\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6v\n\6\f\6\16\6y\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u0082\n\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u0090\n\t\f\t\16\t\u0093"+
		"\13\t\3\t\3\t\3\n\3\n\3\n\5\n\u009a\n\n\3\13\3\13\3\13\3\13\7\13\u00a0"+
		"\n\13\f\13\16\13\u00a3\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u00b2\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00d8\n\f\f\f\16\f\u00db\13\f\3\r\3"+
		"\r\3\r\7\r\u00e0\n\r\f\r\16\r\u00e3\13\r\5\r\u00e5\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\7\16\u00ed\n\16\f\16\16\16\u00f0\13\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00fd\n\17\f\17\16\17\u0100"+
		"\13\17\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u0108\n\17\r\17\16\17\u0109"+
		"\3\17\3\17\6\17\u010e\n\17\r\17\16\17\u010f\3\17\3\17\3\17\3\17\6\17\u0116"+
		"\n\17\r\17\16\17\u0117\3\17\3\17\6\17\u011c\n\17\r\17\16\17\u011d\6\17"+
		"\u0120\n\17\r\17\16\17\u0121\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u012a"+
		"\n\17\r\17\16\17\u012b\3\17\3\17\6\17\u0130\n\17\r\17\16\17\u0131\3\17"+
		"\3\17\3\17\3\17\6\17\u0138\n\17\r\17\16\17\u0139\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\6\17\u0142\n\17\r\17\16\17\u0143\3\17\3\17\7\17\u0148\n\17\f"+
		"\17\16\17\u014b\13\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0154\n"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u015d\n\20\3\21\3\21\5\21"+
		"\u0161\n\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0169\n\22\f\22\16\22\u016c"+
		"\13\22\3\23\3\23\3\23\3\23\5\23\u0172\n\23\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\5\25\u017a\n\25\3\25\2\4\26\"\26\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(\2\n\3\2\31\32\5\2\3\3\6\6\b\b\3\2\4\5\3\2\24\26\3\2\22\23"+
		"\3\2\t\16\3\2\17\20\3\2,-\2\u01af\2-\3\2\2\2\4\65\3\2\2\2\6\67\3\2\2\2"+
		"\bm\3\2\2\2\no\3\2\2\2\f}\3\2\2\2\16\u0086\3\2\2\2\20\u008b\3\2\2\2\22"+
		"\u0096\3\2\2\2\24\u009b\3\2\2\2\26\u00b1\3\2\2\2\30\u00e4\3\2\2\2\32\u00e6"+
		"\3\2\2\2\34\u0153\3\2\2\2\36\u015c\3\2\2\2 \u0160\3\2\2\2\"\u0162\3\2"+
		"\2\2$\u0171\3\2\2\2&\u0173\3\2\2\2(\u0179\3\2\2\2*,\5\4\3\2+*\3\2\2\2"+
		",/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\7\2\2\3\61"+
		"\3\3\2\2\2\62\66\5\f\7\2\63\66\5\n\6\2\64\66\5\24\13\2\65\62\3\2\2\2\65"+
		"\63\3\2\2\2\65\64\3\2\2\2\66\5\3\2\2\2\67;\7\"\2\28:\5\b\5\298\3\2\2\2"+
		":=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7#\2\2?\7\3\2\2\2"+
		"@n\5\6\4\2An\5\24\13\2BC\7.\2\2CD\7\36\2\2DE\5\26\f\2EF\7\37\2\2FI\5\b"+
		"\5\2GH\7/\2\2HJ\5\b\5\2IG\3\2\2\2IJ\3\2\2\2Jn\3\2\2\2KL\7\61\2\2LM\7\36"+
		"\2\2MN\5\26\f\2NO\7\37\2\2OP\5\b\5\2Pn\3\2\2\2QR\7\60\2\2RT\7\36\2\2S"+
		"U\5\26\f\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2VX\7 \2\2WY\5\26\f\2XW\3\2\2\2"+
		"XY\3\2\2\2YZ\3\2\2\2Z\\\7 \2\2[]\5\26\f\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2"+
		"\2\2^_\7\37\2\2_n\5\b\5\2`a\7\62\2\2an\7 \2\2bc\7\63\2\2cn\7 \2\2df\7"+
		"\64\2\2eg\5\26\f\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hn\7 \2\2ij\5\26\f\2j"+
		"k\7 \2\2kn\3\2\2\2ln\7 \2\2m@\3\2\2\2mA\3\2\2\2mB\3\2\2\2mK\3\2\2\2mQ"+
		"\3\2\2\2m`\3\2\2\2mb\3\2\2\2md\3\2\2\2mi\3\2\2\2ml\3\2\2\2n\t\3\2\2\2"+
		"op\7\66\2\2pq\7=\2\2qw\7\"\2\2rv\5\20\t\2sv\5\f\7\2tv\5\16\b\2ur\3\2\2"+
		"\2us\3\2\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2"+
		"\2z{\7#\2\2{|\7 \2\2|\13\3\2\2\2}~\5 \21\2~\177\7=\2\2\177\u0081\7\36"+
		"\2\2\u0080\u0082\5\32\16\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0084\7\37\2\2\u0084\u0085\5\6\4\2\u0085\r\3\2\2"+
		"\2\u0086\u0087\7=\2\2\u0087\u0088\7\36\2\2\u0088\u0089\7\37\2\2\u0089"+
		"\u008a\5\6\4\2\u008a\17\3\2\2\2\u008b\u008c\5\"\22\2\u008c\u0091\7=\2"+
		"\2\u008d\u008e\7!\2\2\u008e\u0090\7=\2\2\u008f\u008d\3\2\2\2\u0090\u0093"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u0095\7 \2\2\u0095\21\3\2\2\2\u0096\u0099\7=\2\2"+
		"\u0097\u0098\7\30\2\2\u0098\u009a\5\26\f\2\u0099\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\23\3\2\2\2\u009b\u009c\5\"\22\2\u009c\u00a1\5\22\n\2\u009d"+
		"\u009e\7!\2\2\u009e\u00a0\5\22\n\2\u009f\u009d\3\2\2\2\u00a0\u00a3\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a5\7 \2\2\u00a5\25\3\2\2\2\u00a6\u00a7\b\f\1\2"+
		"\u00a7\u00b2\5\36\20\2\u00a8\u00b2\5\34\17\2\u00a9\u00aa\7\5\2\2\u00aa"+
		"\u00b2\5\26\f\16\u00ab\u00ac\7\27\2\2\u00ac\u00b2\5\26\f\r\u00ad\u00ae"+
		"\7\21\2\2\u00ae\u00b2\5\26\f\f\u00af\u00b0\t\2\2\2\u00b0\u00b2\5\26\f"+
		"\13\u00b1\u00a6\3\2\2\2\u00b1\u00a8\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1"+
		"\u00ab\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00d9\3\2"+
		"\2\2\u00b3\u00b4\f\t\2\2\u00b4\u00b5\t\3\2\2\u00b5\u00d8\5\26\f\n\u00b6"+
		"\u00b7\f\b\2\2\u00b7\u00b8\t\4\2\2\u00b8\u00d8\5\26\f\t\u00b9\u00ba\f"+
		"\7\2\2\u00ba\u00bb\t\5\2\2\u00bb\u00d8\5\26\f\b\u00bc\u00bd\f\6\2\2\u00bd"+
		"\u00be\t\6\2\2\u00be\u00d8\5\26\f\7\u00bf\u00c0\f\5\2\2\u00c0\u00c1\t"+
		"\7\2\2\u00c1\u00d8\5\26\f\6\u00c2\u00c3\f\4\2\2\u00c3\u00c4\t\b\2\2\u00c4"+
		"\u00d8\5\26\f\5\u00c5\u00c6\f\3\2\2\u00c6\u00c7\7\30\2\2\u00c7\u00d8\5"+
		"\26\f\3\u00c8\u00c9\f\21\2\2\u00c9\u00ca\7\33\2\2\u00ca\u00d8\7=\2\2\u00cb"+
		"\u00cc\f\20\2\2\u00cc\u00cd\7\36\2\2\u00cd\u00ce\5\30\r\2\u00ce\u00cf"+
		"\7\37\2\2\u00cf\u00d8\3\2\2\2\u00d0\u00d1\f\17\2\2\u00d1\u00d2\7\34\2"+
		"\2\u00d2\u00d3\5\26\f\2\u00d3\u00d4\7\35\2\2\u00d4\u00d8\3\2\2\2\u00d5"+
		"\u00d6\f\n\2\2\u00d6\u00d8\t\2\2\2\u00d7\u00b3\3\2\2\2\u00d7\u00b6\3\2"+
		"\2\2\u00d7\u00b9\3\2\2\2\u00d7\u00bc\3\2\2\2\u00d7\u00bf\3\2\2\2\u00d7"+
		"\u00c2\3\2\2\2\u00d7\u00c5\3\2\2\2\u00d7\u00c8\3\2\2\2\u00d7\u00cb\3\2"+
		"\2\2\u00d7\u00d0\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\27\3\2\2\2\u00db\u00d9\3\2\2"+
		"\2\u00dc\u00e1\5\26\f\2\u00dd\u00de\7!\2\2\u00de\u00e0\5\26\f\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00dc\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\31\3\2\2\2\u00e6\u00e7\5\"\22\2\u00e7\u00ee\7=\2"+
		"\2\u00e8\u00e9\7!\2\2\u00e9\u00ea\5\"\22\2\u00ea\u00eb\7=\2\2\u00eb\u00ed"+
		"\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\33\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7\65\2"+
		"\2\u00f2\u00f3\5$\23\2\u00f3\u00f4\7\34\2\2\u00f4\u00f5\7\35\2\2\u00f5"+
		"\u00fe\3\2\2\2\u00f6\u00f7\7\34\2\2\u00f7\u00fd\7\35\2\2\u00f8\u00f9\7"+
		"\34\2\2\u00f9\u00fa\5\26\f\2\u00fa\u00fb\7\35\2\2\u00fb\u00fd\3\2\2\2"+
		"\u00fc\u00f6\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0154\3\2\2\2\u0100\u00fe\3\2\2\2\u0101"+
		"\u0102\7\65\2\2\u0102\u0107\5$\23\2\u0103\u0104\7\34\2\2\u0104\u0105\5"+
		"\26\f\2\u0105\u0106\7\35\2\2\u0106\u0108\3\2\2\2\u0107\u0103\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010d\3\2"+
		"\2\2\u010b\u010c\7\34\2\2\u010c\u010e\7\35\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u011f\3\2"+
		"\2\2\u0111\u0112\7\34\2\2\u0112\u0113\5\26\f\2\u0113\u0114\7\35\2\2\u0114"+
		"\u0116\3\2\2\2\u0115\u0111\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0117\u0118\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u011a\7\34\2\2\u011a"+
		"\u011c\7\35\2\2\u011b\u0119\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3"+
		"\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u0115\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0154\3\2"+
		"\2\2\u0123\u0124\7\65\2\2\u0124\u0129\5$\23\2\u0125\u0126\7\34\2\2\u0126"+
		"\u0127\5\26\f\2\u0127\u0128\7\35\2\2\u0128\u012a\3\2\2\2\u0129\u0125\3"+
		"\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012f\3\2\2\2\u012d\u012e\7\34\2\2\u012e\u0130\7\35\2\2\u012f\u012d\3"+
		"\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0137\3\2\2\2\u0133\u0134\7\34\2\2\u0134\u0135\5\26\f\2\u0135\u0136\7"+
		"\35\2\2\u0136\u0138\3\2\2\2\u0137\u0133\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0154\3\2\2\2\u013b\u013c\7\65"+
		"\2\2\u013c\u0141\5$\23\2\u013d\u013e\7\34\2\2\u013e\u013f\5\26\f\2\u013f"+
		"\u0140\7\35\2\2\u0140\u0142\3\2\2\2\u0141\u013d\3\2\2\2\u0142\u0143\3"+
		"\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0149\3\2\2\2\u0145"+
		"\u0146\7\34\2\2\u0146\u0148\7\35\2\2\u0147\u0145\3\2\2\2\u0148\u014b\3"+
		"\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0154\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014c\u014d\7\65\2\2\u014d\u014e\5$\23\2\u014e\u014f\7"+
		"\36\2\2\u014f\u0150\7\37\2\2\u0150\u0154\3\2\2\2\u0151\u0152\7\65\2\2"+
		"\u0152\u0154\5$\23\2\u0153\u00f1\3\2\2\2\u0153\u0101\3\2\2\2\u0153\u0123"+
		"\3\2\2\2\u0153\u013b\3\2\2\2\u0153\u014c\3\2\2\2\u0153\u0151\3\2\2\2\u0154"+
		"\35\3\2\2\2\u0155\u0156\7\36\2\2\u0156\u0157\5\26\f\2\u0157\u0158\7\37"+
		"\2\2\u0158\u015d\3\2\2\2\u0159\u015d\7\67\2\2\u015a\u015d\7=\2\2\u015b"+
		"\u015d\5(\25\2\u015c\u0155\3\2\2\2\u015c\u0159\3\2\2\2\u015c\u015a\3\2"+
		"\2\2\u015c\u015b\3\2\2\2\u015d\37\3\2\2\2\u015e\u0161\5\"\22\2\u015f\u0161"+
		"\7+\2\2\u0160\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161!\3\2\2\2\u0162\u0163"+
		"\b\22\1\2\u0163\u0164\5$\23\2\u0164\u016a\3\2\2\2\u0165\u0166\f\3\2\2"+
		"\u0166\u0167\7\34\2\2\u0167\u0169\7\35\2\2\u0168\u0165\3\2\2\2\u0169\u016c"+
		"\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b#\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016d\u0172\7\'\2\2\u016e\u0172\7)\2\2\u016f\u0172\7(\2"+
		"\2\u0170\u0172\7=\2\2\u0171\u016d\3\2\2\2\u0171\u016e\3\2\2\2\u0171\u016f"+
		"\3\2\2\2\u0171\u0170\3\2\2\2\u0172%\3\2\2\2\u0173\u0174\t\t\2\2\u0174"+
		"\'\3\2\2\2\u0175\u017a\5&\24\2\u0176\u017a\7>\2\2\u0177\u017a\7<\2\2\u0178"+
		"\u017a\7*\2\2\u0179\u0175\3\2\2\2\u0179\u0176\3\2\2\2\u0179\u0177\3\2"+
		"\2\2\u0179\u0178\3\2\2\2\u017a)\3\2\2\2)-\65;ITX\\fmuw\u0081\u0091\u0099"+
		"\u00a1\u00b1\u00d7\u00d9\u00e1\u00e4\u00ee\u00fc\u00fe\u0109\u010f\u0117"+
		"\u011d\u0121\u012b\u0131\u0139\u0143\u0149\u0153\u015c\u0160\u016a\u0171"+
		"\u0179";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}