// Generated from D:/DATA/Program/Compilers-Principles/Lab/compilers-antlr/src/main/java/L1\CmmLexer.g4 by ANTLR 4.9.2
package L1;
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
		TYPE=1, STRUCT=2, RETURN=3, IF=4, ELSE=5, WHILE=6, ID=7, FLOAT=8, OCT=9, 
		HEX=10, INT=11, WS=12, LP=13, RP=14, LB=15, RB=16, LC=17, RC=18, DOT=19, 
		NOT=20, STAR=21, DIV=22, PLUS=23, MINUS=24, RELOP=25, AND=26, OR=27, ASSIGNOP=28, 
		COMMA=29, SEMI=30, SL_COMMENT=31, ML_COMMENT=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TYPE", "STRUCT", "RETURN", "IF", "ELSE", "WHILE", "ID", "FLOAT", "OCT", 
			"HEX", "INT", "WS", "LP", "RP", "LB", "RB", "LC", "RC", "DOT", "NOT", 
			"STAR", "DIV", "PLUS", "MINUS", "RELOP", "AND", "OR", "ASSIGNOP", "COMMA", 
			"SEMI", "SL_COMMENT", "ML_COMMENT", "DIGIT", "LETTER", "WORD", "EXP"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'struct'", "'return'", "'if'", "'else'", "'while'", null, 
			null, null, null, null, null, "'('", "')'", "'['", "']'", "'{'", "'}'", 
			"'.'", "'!'", "'*'", "'/'", "'+'", "'-'", null, "'&&'", "'||'", "'='", 
			"','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TYPE", "STRUCT", "RETURN", "IF", "ELSE", "WHILE", "ID", "FLOAT", 
			"OCT", "HEX", "INT", "WS", "LP", "RP", "LB", "RB", "LC", "RC", "DOT", 
			"NOT", "STAR", "DIV", "PLUS", "MINUS", "RELOP", "AND", "OR", "ASSIGNOP", 
			"COMMA", "SEMI", "SL_COMMENT", "ML_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u0117\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2T\n\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5\bt\n\b\3\b\7\bw\n"+
		"\b\f\b\16\bz\13\b\3\t\7\t}\n\t\f\t\16\t\u0080\13\t\3\t\3\t\6\t\u0084\n"+
		"\t\r\t\16\t\u0085\3\t\6\t\u0089\n\t\r\t\16\t\u008a\3\t\3\t\5\t\u008f\n"+
		"\t\3\t\3\t\3\t\6\t\u0094\n\t\r\t\16\t\u0095\3\t\3\t\6\t\u009a\n\t\r\t"+
		"\16\t\u009b\5\t\u009e\n\t\3\n\3\n\6\n\u00a2\n\n\r\n\16\n\u00a3\3\13\3"+
		"\13\3\13\3\13\5\13\u00aa\n\13\3\13\6\13\u00ad\n\13\r\13\16\13\u00ae\3"+
		"\f\3\f\3\f\7\f\u00b4\n\f\f\f\16\f\u00b7\13\f\5\f\u00b9\n\f\3\r\6\r\u00bc"+
		"\n\r\r\r\16\r\u00bd\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00e3\n\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 "+
		"\3 \7 \u00f5\n \f \16 \u00f8\13 \3 \3 \3 \3 \3!\3!\3!\3!\7!\u0102\n!\f"+
		"!\16!\u0105\13!\3!\3!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\5%\u0114\n%\3"+
		"%\3%\4\u00f6\u0103\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C\2E\2G\2I\2\3\2\f\3\2\629\5\2\62;CHch\3\2"+
		"\63;\3\2\62;\5\2\13\f\17\17\"\"\4\2>>@@\4\2C\\c|\6\2\62;C\\aac|\4\2GG"+
		"gg\4\2--//\2\u0129\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3S\3\2\2\2\5U"+
		"\3\2\2\2\7\\\3\2\2\2\tc\3\2\2\2\13f\3\2\2\2\rk\3\2\2\2\17s\3\2\2\2\21"+
		"\u009d\3\2\2\2\23\u009f\3\2\2\2\25\u00a9\3\2\2\2\27\u00b8\3\2\2\2\31\u00bb"+
		"\3\2\2\2\33\u00c1\3\2\2\2\35\u00c3\3\2\2\2\37\u00c5\3\2\2\2!\u00c7\3\2"+
		"\2\2#\u00c9\3\2\2\2%\u00cb\3\2\2\2\'\u00cd\3\2\2\2)\u00cf\3\2\2\2+\u00d1"+
		"\3\2\2\2-\u00d3\3\2\2\2/\u00d5\3\2\2\2\61\u00d7\3\2\2\2\63\u00e2\3\2\2"+
		"\2\65\u00e4\3\2\2\2\67\u00e7\3\2\2\29\u00ea\3\2\2\2;\u00ec\3\2\2\2=\u00ee"+
		"\3\2\2\2?\u00f0\3\2\2\2A\u00fd\3\2\2\2C\u010b\3\2\2\2E\u010d\3\2\2\2G"+
		"\u010f\3\2\2\2I\u0111\3\2\2\2KL\7k\2\2LM\7p\2\2MT\7v\2\2NO\7h\2\2OP\7"+
		"n\2\2PQ\7q\2\2QR\7c\2\2RT\7v\2\2SK\3\2\2\2SN\3\2\2\2T\4\3\2\2\2UV\7u\2"+
		"\2VW\7v\2\2WX\7t\2\2XY\7w\2\2YZ\7e\2\2Z[\7v\2\2[\6\3\2\2\2\\]\7t\2\2]"+
		"^\7g\2\2^_\7v\2\2_`\7w\2\2`a\7t\2\2ab\7p\2\2b\b\3\2\2\2cd\7k\2\2de\7h"+
		"\2\2e\n\3\2\2\2fg\7g\2\2gh\7n\2\2hi\7u\2\2ij\7g\2\2j\f\3\2\2\2kl\7y\2"+
		"\2lm\7j\2\2mn\7k\2\2no\7n\2\2op\7g\2\2p\16\3\2\2\2qt\5E#\2rt\7a\2\2sq"+
		"\3\2\2\2sr\3\2\2\2tx\3\2\2\2uw\5G$\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3"+
		"\2\2\2y\20\3\2\2\2zx\3\2\2\2{}\5C\"\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2"+
		"\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\5\'\24\2"+
		"\u0082\u0084\5C\"\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008f\3\2\2\2\u0087\u0089\5C\"\2\u0088"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u008d\5\'\24\2\u008d\u008f\3\2\2\2\u008e"+
		"~\3\2\2\2\u008e\u0088\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\5I%\2\u0091"+
		"\u009e\3\2\2\2\u0092\u0094\5C\"\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0099\5\'\24\2\u0098\u009a\5C\"\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d"+
		"\u008e\3\2\2\2\u009d\u0093\3\2\2\2\u009e\22\3\2\2\2\u009f\u00a1\7\62\2"+
		"\2\u00a0\u00a2\t\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\24\3\2\2\2\u00a5\u00a6\7\62\2\2\u00a6"+
		"\u00aa\7z\2\2\u00a7\u00a8\7\62\2\2\u00a8\u00aa\7Z\2\2\u00a9\u00a5\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00ad\t\3\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\26\3\2\2\2\u00b0\u00b9\7\62\2\2\u00b1\u00b5\t\4\2\2\u00b2\u00b4"+
		"\t\5\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b0\3\2"+
		"\2\2\u00b8\u00b1\3\2\2\2\u00b9\30\3\2\2\2\u00ba\u00bc\t\6\2\2\u00bb\u00ba"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\b\r\2\2\u00c0\32\3\2\2\2\u00c1\u00c2\7*\2\2"+
		"\u00c2\34\3\2\2\2\u00c3\u00c4\7+\2\2\u00c4\36\3\2\2\2\u00c5\u00c6\7]\2"+
		"\2\u00c6 \3\2\2\2\u00c7\u00c8\7_\2\2\u00c8\"\3\2\2\2\u00c9\u00ca\7}\2"+
		"\2\u00ca$\3\2\2\2\u00cb\u00cc\7\177\2\2\u00cc&\3\2\2\2\u00cd\u00ce\7\60"+
		"\2\2\u00ce(\3\2\2\2\u00cf\u00d0\7#\2\2\u00d0*\3\2\2\2\u00d1\u00d2\7,\2"+
		"\2\u00d2,\3\2\2\2\u00d3\u00d4\7\61\2\2\u00d4.\3\2\2\2\u00d5\u00d6\7-\2"+
		"\2\u00d6\60\3\2\2\2\u00d7\u00d8\7/\2\2\u00d8\62\3\2\2\2\u00d9\u00e3\t"+
		"\7\2\2\u00da\u00db\7@\2\2\u00db\u00e3\7?\2\2\u00dc\u00dd\7>\2\2\u00dd"+
		"\u00e3\7?\2\2\u00de\u00df\7?\2\2\u00df\u00e3\7?\2\2\u00e0\u00e1\7#\2\2"+
		"\u00e1\u00e3\7?\2\2\u00e2\u00d9\3\2\2\2\u00e2\u00da\3\2\2\2\u00e2\u00dc"+
		"\3\2\2\2\u00e2\u00de\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\64\3\2\2\2\u00e4"+
		"\u00e5\7(\2\2\u00e5\u00e6\7(\2\2\u00e6\66\3\2\2\2\u00e7\u00e8\7~\2\2\u00e8"+
		"\u00e9\7~\2\2\u00e98\3\2\2\2\u00ea\u00eb\7?\2\2\u00eb:\3\2\2\2\u00ec\u00ed"+
		"\7.\2\2\u00ed<\3\2\2\2\u00ee\u00ef\7=\2\2\u00ef>\3\2\2\2\u00f0\u00f1\7"+
		"\61\2\2\u00f1\u00f2\7\61\2\2\u00f2\u00f6\3\2\2\2\u00f3\u00f5\13\2\2\2"+
		"\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f6\u00f4"+
		"\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7\f\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fc\b \2\2\u00fc@\3\2\2\2\u00fd\u00fe\7\61\2\2"+
		"\u00fe\u00ff\7,\2\2\u00ff\u0103\3\2\2\2\u0100\u0102\13\2\2\2\u0101\u0100"+
		"\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104"+
		"\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7,\2\2\u0107\u0108\7\61"+
		"\2\2\u0108\u0109\3\2\2\2\u0109\u010a\b!\2\2\u010aB\3\2\2\2\u010b\u010c"+
		"\t\5\2\2\u010cD\3\2\2\2\u010d\u010e\t\b\2\2\u010eF\3\2\2\2\u010f\u0110"+
		"\t\t\2\2\u0110H\3\2\2\2\u0111\u0113\t\n\2\2\u0112\u0114\t\13\2\2\u0113"+
		"\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\5\27"+
		"\f\2\u0116J\3\2\2\2\27\2Ssx~\u0085\u008a\u008e\u0095\u009b\u009d\u00a3"+
		"\u00a9\u00ae\u00b5\u00b8\u00bd\u00e2\u00f6\u0103\u0113\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}