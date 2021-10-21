
package Parse;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MXLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "Plus", "Minus", "Multiply", "Devide", "Mod", "Greater", "GreaterEqual", 
			"Less", "LessEqual", "NotEqual", "Equal", "AndAnd", "OrOr", "Not", "RightShift", 
			"LeftShift", "And", "Or", "Xor", "Negate", "Assign", "PlusPlus", "MinusMinus", 
			"Point", "LeftSquareBracket", "RightSquareBracket", "LeftBracket", "RightBracket", 
			"Semicolon", "Comma", "LeftBigBracket", "RightBigBracket", "Tabs", "Annotate", 
			"StringEdge", "Int", "Bool", "String", "Null", "Void", "True", "False", 
			"If", "Else", "For", "While", "Break", "Continue", "Return", "New", "Class", 
			"This", "WS", "NEWLINE", "BLOCK_COMMENT", "NotationLine", "Str", "Identifier", 
			"DecimalInteger"
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


	public MXLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MX.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u0173\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3#\3$\3$\3$\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3("+
		"\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-"+
		"\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\6\67\u012d\n\67\r\67\16\67"+
		"\u012e\3\67\3\67\38\38\58\u0135\n8\38\58\u0138\n8\38\38\39\39\39\39\7"+
		"9\u0140\n9\f9\169\u0143\139\39\39\39\39\39\3:\3:\3:\3:\7:\u014e\n:\f:"+
		"\16:\u0151\13:\3:\5:\u0154\n:\3:\3:\3;\3;\3;\3;\7;\u015c\n;\f;\16;\u015f"+
		"\13;\3;\3;\3<\3<\7<\u0165\n<\f<\16<\u0168\13<\3=\3=\7=\u016c\n=\f=\16"+
		"=\u016f\13=\3=\5=\u0172\n=\5\u0141\u014f\u015d\2>\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>\3\2\n\4\2"+
		"\13\13\"\"\3\3\f\f\6\2\f\f\17\17$$^^\6\2$$^^pptt\4\2C\\c|\6\2\62;C\\a"+
		"ac|\3\2\63;\3\2\62;\2\u017c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2"+
		"\2\2\2w\3\2\2\2\2y\3\2\2\2\3{\3\2\2\2\5}\3\2\2\2\7\177\3\2\2\2\t\u0081"+
		"\3\2\2\2\13\u0083\3\2\2\2\r\u0085\3\2\2\2\17\u0087\3\2\2\2\21\u0089\3"+
		"\2\2\2\23\u008c\3\2\2\2\25\u008e\3\2\2\2\27\u0091\3\2\2\2\31\u0094\3\2"+
		"\2\2\33\u0097\3\2\2\2\35\u009a\3\2\2\2\37\u009d\3\2\2\2!\u009f\3\2\2\2"+
		"#\u00a2\3\2\2\2%\u00a5\3\2\2\2\'\u00a7\3\2\2\2)\u00a9\3\2\2\2+\u00ab\3"+
		"\2\2\2-\u00ad\3\2\2\2/\u00af\3\2\2\2\61\u00b2\3\2\2\2\63\u00b5\3\2\2\2"+
		"\65\u00b7\3\2\2\2\67\u00b9\3\2\2\29\u00bb\3\2\2\2;\u00bd\3\2\2\2=\u00bf"+
		"\3\2\2\2?\u00c1\3\2\2\2A\u00c3\3\2\2\2C\u00c5\3\2\2\2E\u00c7\3\2\2\2G"+
		"\u00ca\3\2\2\2I\u00cd\3\2\2\2K\u00cf\3\2\2\2M\u00d3\3\2\2\2O\u00d8\3\2"+
		"\2\2Q\u00df\3\2\2\2S\u00e4\3\2\2\2U\u00e9\3\2\2\2W\u00ee\3\2\2\2Y\u00f4"+
		"\3\2\2\2[\u00f7\3\2\2\2]\u00fc\3\2\2\2_\u0100\3\2\2\2a\u0106\3\2\2\2c"+
		"\u010c\3\2\2\2e\u0115\3\2\2\2g\u011c\3\2\2\2i\u0120\3\2\2\2k\u0126\3\2"+
		"\2\2m\u012c\3\2\2\2o\u0137\3\2\2\2q\u013b\3\2\2\2s\u0149\3\2\2\2u\u0157"+
		"\3\2\2\2w\u0162\3\2\2\2y\u0171\3\2\2\2{|\7\61\2\2|\4\3\2\2\2}~\7-\2\2"+
		"~\6\3\2\2\2\177\u0080\7/\2\2\u0080\b\3\2\2\2\u0081\u0082\7,\2\2\u0082"+
		"\n\3\2\2\2\u0083\u0084\7^\2\2\u0084\f\3\2\2\2\u0085\u0086\7\'\2\2\u0086"+
		"\16\3\2\2\2\u0087\u0088\7@\2\2\u0088\20\3\2\2\2\u0089\u008a\7@\2\2\u008a"+
		"\u008b\7?\2\2\u008b\22\3\2\2\2\u008c\u008d\7>\2\2\u008d\24\3\2\2\2\u008e"+
		"\u008f\7>\2\2\u008f\u0090\7?\2\2\u0090\26\3\2\2\2\u0091\u0092\7#\2\2\u0092"+
		"\u0093\7?\2\2\u0093\30\3\2\2\2\u0094\u0095\7?\2\2\u0095\u0096\7?\2\2\u0096"+
		"\32\3\2\2\2\u0097\u0098\7(\2\2\u0098\u0099\7(\2\2\u0099\34\3\2\2\2\u009a"+
		"\u009b\7~\2\2\u009b\u009c\7~\2\2\u009c\36\3\2\2\2\u009d\u009e\7#\2\2\u009e"+
		" \3\2\2\2\u009f\u00a0\7@\2\2\u00a0\u00a1\7@\2\2\u00a1\"\3\2\2\2\u00a2"+
		"\u00a3\7>\2\2\u00a3\u00a4\7>\2\2\u00a4$\3\2\2\2\u00a5\u00a6\7(\2\2\u00a6"+
		"&\3\2\2\2\u00a7\u00a8\7~\2\2\u00a8(\3\2\2\2\u00a9\u00aa\7`\2\2\u00aa*"+
		"\3\2\2\2\u00ab\u00ac\7\u0080\2\2\u00ac,\3\2\2\2\u00ad\u00ae\7?\2\2\u00ae"+
		".\3\2\2\2\u00af\u00b0\7-\2\2\u00b0\u00b1\7-\2\2\u00b1\60\3\2\2\2\u00b2"+
		"\u00b3\7/\2\2\u00b3\u00b4\7/\2\2\u00b4\62\3\2\2\2\u00b5\u00b6\7\60\2\2"+
		"\u00b6\64\3\2\2\2\u00b7\u00b8\7]\2\2\u00b8\66\3\2\2\2\u00b9\u00ba\7_\2"+
		"\2\u00ba8\3\2\2\2\u00bb\u00bc\7*\2\2\u00bc:\3\2\2\2\u00bd\u00be\7+\2\2"+
		"\u00be<\3\2\2\2\u00bf\u00c0\7=\2\2\u00c0>\3\2\2\2\u00c1\u00c2\7.\2\2\u00c2"+
		"@\3\2\2\2\u00c3\u00c4\7}\2\2\u00c4B\3\2\2\2\u00c5\u00c6\7\177\2\2\u00c6"+
		"D\3\2\2\2\u00c7\u00c8\7^\2\2\u00c8\u00c9\7v\2\2\u00c9F\3\2\2\2\u00ca\u00cb"+
		"\7\61\2\2\u00cb\u00cc\7\61\2\2\u00ccH\3\2\2\2\u00cd\u00ce\7$\2\2\u00ce"+
		"J\3\2\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7v\2\2\u00d2"+
		"L\3\2\2\2\u00d3\u00d4\7d\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7q\2\2\u00d6"+
		"\u00d7\7n\2\2\u00d7N\3\2\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7v\2\2\u00da"+
		"\u00db\7t\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7i\2\2"+
		"\u00deP\3\2\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7w\2\2\u00e1\u00e2\7n\2"+
		"\2\u00e2\u00e3\7n\2\2\u00e3R\3\2\2\2\u00e4\u00e5\7x\2\2\u00e5\u00e6\7"+
		"q\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7f\2\2\u00e8T\3\2\2\2\u00e9\u00ea"+
		"\7v\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed\7g\2\2\u00ed"+
		"V\3\2\2\2\u00ee\u00ef\7h\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7n\2\2\u00f1"+
		"\u00f2\7u\2\2\u00f2\u00f3\7g\2\2\u00f3X\3\2\2\2\u00f4\u00f5\7k\2\2\u00f5"+
		"\u00f6\7h\2\2\u00f6Z\3\2\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7n\2\2\u00f9"+
		"\u00fa\7u\2\2\u00fa\u00fb\7g\2\2\u00fb\\\3\2\2\2\u00fc\u00fd\7h\2\2\u00fd"+
		"\u00fe\7q\2\2\u00fe\u00ff\7t\2\2\u00ff^\3\2\2\2\u0100\u0101\7y\2\2\u0101"+
		"\u0102\7j\2\2\u0102\u0103\7k\2\2\u0103\u0104\7n\2\2\u0104\u0105\7g\2\2"+
		"\u0105`\3\2\2\2\u0106\u0107\7d\2\2\u0107\u0108\7t\2\2\u0108\u0109\7g\2"+
		"\2\u0109\u010a\7c\2\2\u010a\u010b\7m\2\2\u010bb\3\2\2\2\u010c\u010d\7"+
		"e\2\2\u010d\u010e\7q\2\2\u010e\u010f\7p\2\2\u010f\u0110\7v\2\2\u0110\u0111"+
		"\7k\2\2\u0111\u0112\7p\2\2\u0112\u0113\7w\2\2\u0113\u0114\7g\2\2\u0114"+
		"d\3\2\2\2\u0115\u0116\7t\2\2\u0116\u0117\7g\2\2\u0117\u0118\7v\2\2\u0118"+
		"\u0119\7w\2\2\u0119\u011a\7t\2\2\u011a\u011b\7p\2\2\u011bf\3\2\2\2\u011c"+
		"\u011d\7p\2\2\u011d\u011e\7g\2\2\u011e\u011f\7y\2\2\u011fh\3\2\2\2\u0120"+
		"\u0121\7e\2\2\u0121\u0122\7n\2\2\u0122\u0123\7c\2\2\u0123\u0124\7u\2\2"+
		"\u0124\u0125\7u\2\2\u0125j\3\2\2\2\u0126\u0127\7v\2\2\u0127\u0128\7j\2"+
		"\2\u0128\u0129\7k\2\2\u0129\u012a\7u\2\2\u012al\3\2\2\2\u012b\u012d\t"+
		"\2\2\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\b\67\2\2\u0131n\3\2\2\2"+
		"\u0132\u0134\7\17\2\2\u0133\u0135\7\f\2\2\u0134\u0133\3\2\2\2\u0134\u0135"+
		"\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0138\7\f\2\2\u0137\u0132\3\2\2\2\u0137"+
		"\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\b8\2\2\u013ap\3\2\2\2\u013b"+
		"\u013c\7\61\2\2\u013c\u013d\7,\2\2\u013d\u0141\3\2\2\2\u013e\u0140\13"+
		"\2\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u0142\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0145\7,"+
		"\2\2\u0145\u0146\7\61\2\2\u0146\u0147\3\2\2\2\u0147\u0148\b9\2\2\u0148"+
		"r\3\2\2\2\u0149\u014a\7\61\2\2\u014a\u014b\7\61\2\2\u014b\u014f\3\2\2"+
		"\2\u014c\u014e\13\2\2\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0152\u0154\t\3\2\2\u0153\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0156\b:\2\2\u0156t\3\2\2\2\u0157\u015d\7$\2\2\u0158\u015c\n\4\2\2\u0159"+
		"\u015a\7^\2\2\u015a\u015c\t\5\2\2\u015b\u0158\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015c\u015f\3\2\2\2\u015d\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e"+
		"\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\7$\2\2\u0161v\3\2\2\2\u0162"+
		"\u0166\t\6\2\2\u0163\u0165\t\7\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2"+
		"\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167x\3\2\2\2\u0168\u0166"+
		"\3\2\2\2\u0169\u016d\t\b\2\2\u016a\u016c\t\t\2\2\u016b\u016a\3\2\2\2\u016c"+
		"\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0172\3\2"+
		"\2\2\u016f\u016d\3\2\2\2\u0170\u0172\7\62\2\2\u0171\u0169\3\2\2\2\u0171"+
		"\u0170\3\2\2\2\u0172z\3\2\2\2\16\2\u012e\u0134\u0137\u0141\u014f\u0153"+
		"\u015b\u015d\u0166\u016d\u0171\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}