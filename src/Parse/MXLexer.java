// Generated from D:/������/java/Compiler2022/src/Parse\MX.g4 by ANTLR 4.9.1
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "Plus", "Minus", "Multiply", "Devide", "Mod", "Greater", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2?\u0179\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3("+
		"\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,"+
		"\3-\3-\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3"+
		"\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3"+
		"8\68\u0133\n8\r8\168\u0134\38\38\39\39\59\u013b\n9\39\59\u013e\n9\39\3"+
		"9\3:\3:\3:\3:\7:\u0146\n:\f:\16:\u0149\13:\3:\3:\3:\3:\3:\3;\3;\3;\3;"+
		"\7;\u0154\n;\f;\16;\u0157\13;\3;\5;\u015a\n;\3;\3;\3<\3<\3<\3<\7<\u0162"+
		"\n<\f<\16<\u0165\13<\3<\3<\3=\3=\7=\u016b\n=\f=\16=\u016e\13=\3>\3>\7"+
		">\u0172\n>\f>\16>\u0175\13>\3>\5>\u0178\n>\5\u0147\u0155\u0163\2?\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?\3\2\n\4\2\13\13\"\"\3\3\f\f\6\2\f\f\17\17$$^^\6\2$$^^pptt\4"+
		"\2C\\c|\6\2\62;C\\aac|\3\2\63;\3\2\62;\2\u0182\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3}\3\2\2\2\5\u0081"+
		"\3\2\2\2\7\u0083\3\2\2\2\t\u0085\3\2\2\2\13\u0087\3\2\2\2\r\u0089\3\2"+
		"\2\2\17\u008b\3\2\2\2\21\u008d\3\2\2\2\23\u008f\3\2\2\2\25\u0092\3\2\2"+
		"\2\27\u0094\3\2\2\2\31\u0097\3\2\2\2\33\u009a\3\2\2\2\35\u009d\3\2\2\2"+
		"\37\u00a0\3\2\2\2!\u00a3\3\2\2\2#\u00a5\3\2\2\2%\u00a8\3\2\2\2\'\u00ab"+
		"\3\2\2\2)\u00ad\3\2\2\2+\u00af\3\2\2\2-\u00b1\3\2\2\2/\u00b3\3\2\2\2\61"+
		"\u00b5\3\2\2\2\63\u00b8\3\2\2\2\65\u00bb\3\2\2\2\67\u00bd\3\2\2\29\u00bf"+
		"\3\2\2\2;\u00c1\3\2\2\2=\u00c3\3\2\2\2?\u00c5\3\2\2\2A\u00c7\3\2\2\2C"+
		"\u00c9\3\2\2\2E\u00cb\3\2\2\2G\u00cd\3\2\2\2I\u00d0\3\2\2\2K\u00d3\3\2"+
		"\2\2M\u00d5\3\2\2\2O\u00d9\3\2\2\2Q\u00de\3\2\2\2S\u00e5\3\2\2\2U\u00ea"+
		"\3\2\2\2W\u00ef\3\2\2\2Y\u00f4\3\2\2\2[\u00fa\3\2\2\2]\u00fd\3\2\2\2_"+
		"\u0102\3\2\2\2a\u0106\3\2\2\2c\u010c\3\2\2\2e\u0112\3\2\2\2g\u011b\3\2"+
		"\2\2i\u0122\3\2\2\2k\u0126\3\2\2\2m\u012c\3\2\2\2o\u0132\3\2\2\2q\u013d"+
		"\3\2\2\2s\u0141\3\2\2\2u\u014f\3\2\2\2w\u015d\3\2\2\2y\u0168\3\2\2\2{"+
		"\u0177\3\2\2\2}~\7]\2\2~\177\7(\2\2\177\u0080\7_\2\2\u0080\4\3\2\2\2\u0081"+
		"\u0082\7\61\2\2\u0082\6\3\2\2\2\u0083\u0084\7-\2\2\u0084\b\3\2\2\2\u0085"+
		"\u0086\7/\2\2\u0086\n\3\2\2\2\u0087\u0088\7,\2\2\u0088\f\3\2\2\2\u0089"+
		"\u008a\7^\2\2\u008a\16\3\2\2\2\u008b\u008c\7\'\2\2\u008c\20\3\2\2\2\u008d"+
		"\u008e\7@\2\2\u008e\22\3\2\2\2\u008f\u0090\7@\2\2\u0090\u0091\7?\2\2\u0091"+
		"\24\3\2\2\2\u0092\u0093\7>\2\2\u0093\26\3\2\2\2\u0094\u0095\7>\2\2\u0095"+
		"\u0096\7?\2\2\u0096\30\3\2\2\2\u0097\u0098\7#\2\2\u0098\u0099\7?\2\2\u0099"+
		"\32\3\2\2\2\u009a\u009b\7?\2\2\u009b\u009c\7?\2\2\u009c\34\3\2\2\2\u009d"+
		"\u009e\7(\2\2\u009e\u009f\7(\2\2\u009f\36\3\2\2\2\u00a0\u00a1\7~\2\2\u00a1"+
		"\u00a2\7~\2\2\u00a2 \3\2\2\2\u00a3\u00a4\7#\2\2\u00a4\"\3\2\2\2\u00a5"+
		"\u00a6\7@\2\2\u00a6\u00a7\7@\2\2\u00a7$\3\2\2\2\u00a8\u00a9\7>\2\2\u00a9"+
		"\u00aa\7>\2\2\u00aa&\3\2\2\2\u00ab\u00ac\7(\2\2\u00ac(\3\2\2\2\u00ad\u00ae"+
		"\7~\2\2\u00ae*\3\2\2\2\u00af\u00b0\7`\2\2\u00b0,\3\2\2\2\u00b1\u00b2\7"+
		"\u0080\2\2\u00b2.\3\2\2\2\u00b3\u00b4\7?\2\2\u00b4\60\3\2\2\2\u00b5\u00b6"+
		"\7-\2\2\u00b6\u00b7\7-\2\2\u00b7\62\3\2\2\2\u00b8\u00b9\7/\2\2\u00b9\u00ba"+
		"\7/\2\2\u00ba\64\3\2\2\2\u00bb\u00bc\7\60\2\2\u00bc\66\3\2\2\2\u00bd\u00be"+
		"\7]\2\2\u00be8\3\2\2\2\u00bf\u00c0\7_\2\2\u00c0:\3\2\2\2\u00c1\u00c2\7"+
		"*\2\2\u00c2<\3\2\2\2\u00c3\u00c4\7+\2\2\u00c4>\3\2\2\2\u00c5\u00c6\7="+
		"\2\2\u00c6@\3\2\2\2\u00c7\u00c8\7.\2\2\u00c8B\3\2\2\2\u00c9\u00ca\7}\2"+
		"\2\u00caD\3\2\2\2\u00cb\u00cc\7\177\2\2\u00ccF\3\2\2\2\u00cd\u00ce\7^"+
		"\2\2\u00ce\u00cf\7v\2\2\u00cfH\3\2\2\2\u00d0\u00d1\7\61\2\2\u00d1\u00d2"+
		"\7\61\2\2\u00d2J\3\2\2\2\u00d3\u00d4\7$\2\2\u00d4L\3\2\2\2\u00d5\u00d6"+
		"\7k\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7v\2\2\u00d8N\3\2\2\2\u00d9\u00da"+
		"\7d\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7n\2\2\u00dd"+
		"P\3\2\2\2\u00de\u00df\7u\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7t\2\2\u00e1"+
		"\u00e2\7k\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7i\2\2\u00e4R\3\2\2\2\u00e5"+
		"\u00e6\7p\2\2\u00e6\u00e7\7w\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9\7n\2\2"+
		"\u00e9T\3\2\2\2\u00ea\u00eb\7x\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7k\2"+
		"\2\u00ed\u00ee\7f\2\2\u00eeV\3\2\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7"+
		"t\2\2\u00f1\u00f2\7w\2\2\u00f2\u00f3\7g\2\2\u00f3X\3\2\2\2\u00f4\u00f5"+
		"\7h\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8\7u\2\2\u00f8"+
		"\u00f9\7g\2\2\u00f9Z\3\2\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7h\2\2\u00fc"+
		"\\\3\2\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100\7u\2\2\u0100"+
		"\u0101\7g\2\2\u0101^\3\2\2\2\u0102\u0103\7h\2\2\u0103\u0104\7q\2\2\u0104"+
		"\u0105\7t\2\2\u0105`\3\2\2\2\u0106\u0107\7y\2\2\u0107\u0108\7j\2\2\u0108"+
		"\u0109\7k\2\2\u0109\u010a\7n\2\2\u010a\u010b\7g\2\2\u010bb\3\2\2\2\u010c"+
		"\u010d\7d\2\2\u010d\u010e\7t\2\2\u010e\u010f\7g\2\2\u010f\u0110\7c\2\2"+
		"\u0110\u0111\7m\2\2\u0111d\3\2\2\2\u0112\u0113\7e\2\2\u0113\u0114\7q\2"+
		"\2\u0114\u0115\7p\2\2\u0115\u0116\7v\2\2\u0116\u0117\7k\2\2\u0117\u0118"+
		"\7p\2\2\u0118\u0119\7w\2\2\u0119\u011a\7g\2\2\u011af\3\2\2\2\u011b\u011c"+
		"\7t\2\2\u011c\u011d\7g\2\2\u011d\u011e\7v\2\2\u011e\u011f\7w\2\2\u011f"+
		"\u0120\7t\2\2\u0120\u0121\7p\2\2\u0121h\3\2\2\2\u0122\u0123\7p\2\2\u0123"+
		"\u0124\7g\2\2\u0124\u0125\7y\2\2\u0125j\3\2\2\2\u0126\u0127\7e\2\2\u0127"+
		"\u0128\7n\2\2\u0128\u0129\7c\2\2\u0129\u012a\7u\2\2\u012a\u012b\7u\2\2"+
		"\u012bl\3\2\2\2\u012c\u012d\7v\2\2\u012d\u012e\7j\2\2\u012e\u012f\7k\2"+
		"\2\u012f\u0130\7u\2\2\u0130n\3\2\2\2\u0131\u0133\t\2\2\2\u0132\u0131\3"+
		"\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0137\b8\2\2\u0137p\3\2\2\2\u0138\u013a\7\17\2\2"+
		"\u0139\u013b\7\f\2\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013e"+
		"\3\2\2\2\u013c\u013e\7\f\2\2\u013d\u0138\3\2\2\2\u013d\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0140\b9\2\2\u0140r\3\2\2\2\u0141\u0142\7\61\2\2"+
		"\u0142\u0143\7,\2\2\u0143\u0147\3\2\2\2\u0144\u0146\13\2\2\2\u0145\u0144"+
		"\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148"+
		"\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\7,\2\2\u014b\u014c\7\61"+
		"\2\2\u014c\u014d\3\2\2\2\u014d\u014e\b:\2\2\u014et\3\2\2\2\u014f\u0150"+
		"\7\61\2\2\u0150\u0151\7\61\2\2\u0151\u0155\3\2\2\2\u0152\u0154\13\2\2"+
		"\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0156\3\2\2\2\u0155\u0153"+
		"\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u015a\t\3\2\2\u0159"+
		"\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\b;\2\2\u015cv\3\2\2\2\u015d"+
		"\u0163\7$\2\2\u015e\u0162\n\4\2\2\u015f\u0160\7^\2\2\u0160\u0162\t\5\2"+
		"\2\u0161\u015e\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0164"+
		"\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166"+
		"\u0167\7$\2\2\u0167x\3\2\2\2\u0168\u016c\t\6\2\2\u0169\u016b\t\7\2\2\u016a"+
		"\u0169\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2"+
		"\2\2\u016dz\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0173\t\b\2\2\u0170\u0172"+
		"\t\t\2\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0178\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0178\7\62"+
		"\2\2\u0177\u016f\3\2\2\2\u0177\u0176\3\2\2\2\u0178|\3\2\2\2\16\2\u0134"+
		"\u013a\u013d\u0147\u0155\u0159\u0161\u0163\u016c\u0173\u0177\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}