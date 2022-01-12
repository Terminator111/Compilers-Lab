// Generated from D:/DATA/Program/Compilers-Principles/Lab/Compilers-Lab/compilers-antlr/src/main/java/L3\CmmLexer.g4 by ANTLR 4.9.2
package L3;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, STRUCT=2, RETURN=3, IF=4, ELSE=5, WHILE=6, ID=7, FLOAT=8, INT=9, 
		WS=10, LP=11, RP=12, LB=13, RB=14, LC=15, RC=16, DOT=17, NOT=18, STAR=19, 
		DIV=20, PLUS=21, MINUS=22, RELOP=23, AND=24, OR=25, ASSIGNOP=26, COMMA=27, 
		SEMI=28, SL_COMMENT=29, ML_COMMENT=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TYPE", "STRUCT", "RETURN", "IF", "ELSE", "WHILE", "ID", "FLOAT", "INT", 
			"WS", "LP", "RP", "LB", "RB", "LC", "RC", "DOT", "NOT", "STAR", "DIV", 
			"PLUS", "MINUS", "RELOP", "AND", "OR", "ASSIGNOP", "COMMA", "SEMI", "SL_COMMENT", 
			"ML_COMMENT", "DIGIT", "LETTER", "WORD", "EXP", "DECIMAL", "OCT", "HEX"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'struct'", "'return'", "'if'", "'else'", "'while'", null, 
			null, null, null, "'('", "')'", "'['", "']'", "'{'", "'}'", "'.'", "'!'", 
			"'*'", "'/'", "'+'", "'-'", null, "'&&'", "'||'", "'='", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TYPE", "STRUCT", "RETURN", "IF", "ELSE", "WHILE", "ID", "FLOAT", 
			"INT", "WS", "LP", "RP", "LB", "RB", "LC", "RC", "DOT", "NOT", "STAR", 
			"DIV", "PLUS", "MINUS", "RELOP", "AND", "OR", "ASSIGNOP", "COMMA", "SEMI", 
			"SL_COMMENT", "ML_COMMENT"
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


	public CmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CmmLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u011e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5"+
		"\2V\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5\bv\n\b\3"+
		"\b\7\by\n\b\f\b\16\b|\13\b\3\t\7\t\177\n\t\f\t\16\t\u0082\13\t\3\t\3\t"+
		"\6\t\u0086\n\t\r\t\16\t\u0087\3\t\6\t\u008b\n\t\r\t\16\t\u008c\3\t\3\t"+
		"\5\t\u0091\n\t\3\t\3\t\3\t\6\t\u0096\n\t\r\t\16\t\u0097\3\t\3\t\6\t\u009c"+
		"\n\t\r\t\16\t\u009d\5\t\u00a0\n\t\3\n\3\n\3\n\5\n\u00a5\n\n\3\13\6\13"+
		"\u00a8\n\13\r\13\16\13\u00a9\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00cf"+
		"\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\7\36\u00e1\n\36\f\36\16\36\u00e4\13\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\7\37\u00ee\n\37\f\37\16\37\u00f1\13\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\5#\u0100\n#\3#\3#\3$\3"+
		"$\3$\7$\u0107\n$\f$\16$\u010a\13$\5$\u010c\n$\3%\3%\6%\u0110\n%\r%\16"+
		"%\u0111\3&\3&\3&\3&\5&\u0118\n&\3&\6&\u011b\n&\r&\16&\u011c\4\u00e2\u00ef"+
		"\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?\2A\2C\2E\2G\2I\2K\2\3\2\f\5\2\13\f\17\17\"\"\4\2>>@@\3\2\62;\4"+
		"\2C\\c|\6\2\62;C\\aac|\4\2GGgg\4\2--//\3\2\63;\3\2\629\5\2\62;CHch\2\u012f"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\3U\3\2\2\2\5W\3\2\2\2\7^\3\2\2\2\te\3\2\2\2\13h\3\2"+
		"\2\2\rm\3\2\2\2\17u\3\2\2\2\21\u009f\3\2\2\2\23\u00a4\3\2\2\2\25\u00a7"+
		"\3\2\2\2\27\u00ad\3\2\2\2\31\u00af\3\2\2\2\33\u00b1\3\2\2\2\35\u00b3\3"+
		"\2\2\2\37\u00b5\3\2\2\2!\u00b7\3\2\2\2#\u00b9\3\2\2\2%\u00bb\3\2\2\2\'"+
		"\u00bd\3\2\2\2)\u00bf\3\2\2\2+\u00c1\3\2\2\2-\u00c3\3\2\2\2/\u00ce\3\2"+
		"\2\2\61\u00d0\3\2\2\2\63\u00d3\3\2\2\2\65\u00d6\3\2\2\2\67\u00d8\3\2\2"+
		"\29\u00da\3\2\2\2;\u00dc\3\2\2\2=\u00e9\3\2\2\2?\u00f7\3\2\2\2A\u00f9"+
		"\3\2\2\2C\u00fb\3\2\2\2E\u00fd\3\2\2\2G\u010b\3\2\2\2I\u010d\3\2\2\2K"+
		"\u0117\3\2\2\2MN\7k\2\2NO\7p\2\2OV\7v\2\2PQ\7h\2\2QR\7n\2\2RS\7q\2\2S"+
		"T\7c\2\2TV\7v\2\2UM\3\2\2\2UP\3\2\2\2V\4\3\2\2\2WX\7u\2\2XY\7v\2\2YZ\7"+
		"t\2\2Z[\7w\2\2[\\\7e\2\2\\]\7v\2\2]\6\3\2\2\2^_\7t\2\2_`\7g\2\2`a\7v\2"+
		"\2ab\7w\2\2bc\7t\2\2cd\7p\2\2d\b\3\2\2\2ef\7k\2\2fg\7h\2\2g\n\3\2\2\2"+
		"hi\7g\2\2ij\7n\2\2jk\7u\2\2kl\7g\2\2l\f\3\2\2\2mn\7y\2\2no\7j\2\2op\7"+
		"k\2\2pq\7n\2\2qr\7g\2\2r\16\3\2\2\2sv\5A!\2tv\7a\2\2us\3\2\2\2ut\3\2\2"+
		"\2vz\3\2\2\2wy\5C\"\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\20\3\2"+
		"\2\2|z\3\2\2\2}\177\5? \2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0085\5#"+
		"\22\2\u0084\u0086\5? \2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0091\3\2\2\2\u0089\u008b\5?"+
		" \2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\5#\22\2\u008f\u0091\3\2"+
		"\2\2\u0090\u0080\3\2\2\2\u0090\u008a\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0093\5E#\2\u0093\u00a0\3\2\2\2\u0094\u0096\5? \2\u0095\u0094\3\2\2\2"+
		"\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\u009b\5#\22\2\u009a\u009c\5? \2\u009b\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2"+
		"\2\2\u009f\u0090\3\2\2\2\u009f\u0095\3\2\2\2\u00a0\22\3\2\2\2\u00a1\u00a5"+
		"\5G$\2\u00a2\u00a5\5I%\2\u00a3\u00a5\5K&\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\24\3\2\2\2\u00a6\u00a8\t\2\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\b\13\2\2\u00ac\26\3\2\2\2\u00ad\u00ae"+
		"\7*\2\2\u00ae\30\3\2\2\2\u00af\u00b0\7+\2\2\u00b0\32\3\2\2\2\u00b1\u00b2"+
		"\7]\2\2\u00b2\34\3\2\2\2\u00b3\u00b4\7_\2\2\u00b4\36\3\2\2\2\u00b5\u00b6"+
		"\7}\2\2\u00b6 \3\2\2\2\u00b7\u00b8\7\177\2\2\u00b8\"\3\2\2\2\u00b9\u00ba"+
		"\7\60\2\2\u00ba$\3\2\2\2\u00bb\u00bc\7#\2\2\u00bc&\3\2\2\2\u00bd\u00be"+
		"\7,\2\2\u00be(\3\2\2\2\u00bf\u00c0\7\61\2\2\u00c0*\3\2\2\2\u00c1\u00c2"+
		"\7-\2\2\u00c2,\3\2\2\2\u00c3\u00c4\7/\2\2\u00c4.\3\2\2\2\u00c5\u00cf\t"+
		"\3\2\2\u00c6\u00c7\7@\2\2\u00c7\u00cf\7?\2\2\u00c8\u00c9\7>\2\2\u00c9"+
		"\u00cf\7?\2\2\u00ca\u00cb\7?\2\2\u00cb\u00cf\7?\2\2\u00cc\u00cd\7#\2\2"+
		"\u00cd\u00cf\7?\2\2\u00ce\u00c5\3\2\2\2\u00ce\u00c6\3\2\2\2\u00ce\u00c8"+
		"\3\2\2\2\u00ce\u00ca\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\60\3\2\2\2\u00d0"+
		"\u00d1\7(\2\2\u00d1\u00d2\7(\2\2\u00d2\62\3\2\2\2\u00d3\u00d4\7~\2\2\u00d4"+
		"\u00d5\7~\2\2\u00d5\64\3\2\2\2\u00d6\u00d7\7?\2\2\u00d7\66\3\2\2\2\u00d8"+
		"\u00d9\7.\2\2\u00d98\3\2\2\2\u00da\u00db\7=\2\2\u00db:\3\2\2\2\u00dc\u00dd"+
		"\7\61\2\2\u00dd\u00de\7\61\2\2\u00de\u00e2\3\2\2\2\u00df\u00e1\13\2\2"+
		"\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7\f\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e8\b\36\2\2\u00e8<\3\2\2\2\u00e9\u00ea\7\61\2"+
		"\2\u00ea\u00eb\7,\2\2\u00eb\u00ef\3\2\2\2\u00ec\u00ee\13\2\2\2\u00ed\u00ec"+
		"\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7,\2\2\u00f3\u00f4\7\61"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\b\37\2\2\u00f6>\3\2\2\2\u00f7\u00f8"+
		"\t\4\2\2\u00f8@\3\2\2\2\u00f9\u00fa\t\5\2\2\u00faB\3\2\2\2\u00fb\u00fc"+
		"\t\6\2\2\u00fcD\3\2\2\2\u00fd\u00ff\t\7\2\2\u00fe\u0100\t\b\2\2\u00ff"+
		"\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\5\23"+
		"\n\2\u0102F\3\2\2\2\u0103\u010c\7\62\2\2\u0104\u0108\t\t\2\2\u0105\u0107"+
		"\t\4\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u0103\3\2"+
		"\2\2\u010b\u0104\3\2\2\2\u010cH\3\2\2\2\u010d\u010f\7\62\2\2\u010e\u0110"+
		"\t\n\2\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112J\3\2\2\2\u0113\u0114\7\62\2\2\u0114\u0118\7z\2\2"+
		"\u0115\u0116\7\62\2\2\u0116\u0118\7Z\2\2\u0117\u0113\3\2\2\2\u0117\u0115"+
		"\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u011b\t\13\2\2\u011a\u0119\3\2\2\2"+
		"\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011dL\3"+
		"\2\2\2\30\2Uuz\u0080\u0087\u008c\u0090\u0097\u009d\u009f\u00a4\u00a9\u00ce"+
		"\u00e2\u00ef\u00ff\u0108\u010b\u0111\u0117\u011c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}