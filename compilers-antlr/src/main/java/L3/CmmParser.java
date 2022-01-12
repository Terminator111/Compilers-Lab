// Generated from D:/DATA/Program/Compilers-Principles/Lab/Compilers-Lab/compilers-antlr/src/main/java/L3\CmmParser.g4 by ANTLR 4.9.2
package L3;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, STRUCT=2, RETURN=3, IF=4, ELSE=5, WHILE=6, ID=7, FLOAT=8, INT=9, 
		WS=10, LP=11, RP=12, LB=13, RB=14, LC=15, RC=16, DOT=17, NOT=18, STAR=19, 
		DIV=20, PLUS=21, MINUS=22, RELOP=23, AND=24, OR=25, ASSIGNOP=26, COMMA=27, 
		SEMI=28, SL_COMMENT=29, ML_COMMENT=30;
	public static final int
		RULE_program = 0, RULE_extDef = 1, RULE_extDecList = 2, RULE_specifier = 3, 
		RULE_structSpecifier = 4, RULE_optTag = 5, RULE_tag = 6, RULE_varDec = 7, 
		RULE_funDec = 8, RULE_varList = 9, RULE_paramDec = 10, RULE_compSt = 11, 
		RULE_stmtList = 12, RULE_stmt = 13, RULE_defList = 14, RULE_def = 15, 
		RULE_decList = 16, RULE_dec = 17, RULE_exp = 18, RULE_args = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "extDef", "extDecList", "specifier", "structSpecifier", "optTag", 
			"tag", "varDec", "funDec", "varList", "paramDec", "compSt", "stmtList", 
			"stmt", "defList", "def", "decList", "dec", "exp", "args"
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

	@Override
	public String getGrammarFileName() { return "CmmParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CmmParser.EOF, 0); }
		public List<ExtDefContext> extDef() {
			return getRuleContexts(ExtDefContext.class);
		}
		public ExtDefContext extDef(int i) {
			return getRuleContext(ExtDefContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmParserVisitor ) return ((CmmParserVisitor<? extends T>)visitor).visitProgram(this);
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
			while (_la==TYPE || _la==STRUCT) {
				{
				{
				setState(40);
				extDef();
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

	public static class ExtDefContext extends ParserRuleContext {
		public SpecifierContext specifier() {
			return getRuleContext(SpecifierContext.class,0);
		}
		public ExtDecListContext extDecList() {
			return getRuleContext(ExtDecListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CmmParser.SEMI, 0); }
		public FunDecContext funDec() {
			return getRuleContext(FunDecContext.class,0);
		}
		public CompStContext compSt() {
			return getRuleContext(CompStContext.class,0);
		}
		public ExtDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).enterExtDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).exitExtDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmParserVisitor ) return ((CmmParserVisitor<? extends T>)visitor).visitExtDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtDefContext extDef() throws RecognitionException {
		ExtDefContext _localctx = new ExtDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_extDef);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				specifier();
				setState(49);
				extDecList();
				setState(50);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				specifier();
				setState(53);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				specifier();
				setState(56);
				funDec();
				setState(57);
				compSt();
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

	public static class ExtDecListContext extends ParserRuleContext {
		public List<VarDecContext> varDec() {
			return getRuleContexts(VarDecContext.class);
		}
		public VarDecContext varDec(int i) {
			return getRuleContext(VarDecContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public ExtDecListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extDecList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).enterExtDecList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).exitExtDecList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmParserVisitor ) return ((CmmParserVisitor<? extends T>)visitor).visitExtDecList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtDecListContext extDecList() throws RecognitionException {
		ExtDecListContext _localctx = new ExtDecListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_extDecList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			varDec();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(62);
				match(COMMA);
				setState(63);
				varDec();
				}
				}
				setState(68);
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

	public static class SpecifierContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(CmmParser.TYPE, 0); }
		public StructSpecifierContext structSpecifier() {
			return getRuleContext(StructSpecifierContext.class,0);
		}
		public SpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).enterSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).exitSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmParserVisitor ) return ((CmmParserVisitor<? extends T>)visitor).visitSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecifierContext specifier() throws RecognitionException {
		SpecifierContext _localctx = new SpecifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_specifier);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(TYPE);
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				structSpecifier();
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

	public static class StructSpecifierContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public OptTagContext optTag() {
			return getRuleContext(OptTagContext.class,0);
		}
		public TerminalNode LC() { return getToken(CmmParser.LC, 0); }
		public DefListContext defList() {
			return getRuleContext(DefListContext.class,0);
		}
		public TerminalNode RC() { return getToken(CmmParser.RC, 0); }
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public StructSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).enterStructSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).exitStructSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmParserVisitor ) return ((CmmParserVisitor<? extends T>)visitor).visitStructSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructSpecifierContext structSpecifier() throws RecognitionException {
		StructSpecifierContext _localctx = new StructSpecifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_structSpecifier);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(STRUCT);
				setState(74);
				optTag();
				setState(75);
				match(LC);
				setState(76);
				defList();
				setState(77);
				match(RC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(STRUCT);
				setState(80);
				tag();
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

	public static class OptTagContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public OptTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).enterOptTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).exitOptTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmParserVisitor ) return ((CmmParserVisitor<? extends T>)visitor).visitOptTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptTagContext optTag() throws RecognitionException {
		OptTagContext _localctx = new OptTagContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_optTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(83);
				match(ID);
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

	public static class TagContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).exitTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmParserVisitor ) return ((CmmParserVisitor<? extends T>)visitor).visitTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
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

	public static class VarDecContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public List<TerminalNode> LB() { return getTokens(CmmParser.LB); }
		public TerminalNode LB(int i) {
			return getToken(CmmParser.LB, i);
		}
		public List<TerminalNode> RB() { return getTokens(CmmParser.RB); }
		public TerminalNode RB(int i) {
			return getToken(CmmParser.RB, i);
		}
		public List<TerminalNode> INT() { return getTokens(CmmParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CmmParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(CmmParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(CmmParser.FLOAT, i);
		}
		public VarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).enterVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).exitVarDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmParserVisitor ) return ((CmmParserVisitor<? extends T>)visitor).visitVarDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecContext varDec() throws RecognitionException {
		VarDecContext _localctx = new VarDecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(ID);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LB) {
				{
				{
				setState(89);
				match(LB);
				setState(95);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(90);
					match(INT);
					}
					break;
				case ID:
					{
					setState(91);
					match(ID);
					notifyErrorListeners("array size must be an integer constant, not id");
					}
					break;
				case FLOAT:
					{
					setState(93);
					match(FLOAT);
					notifyErrorListeners("array size must be an integer constant, not float");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(97);
				match(RB);
				}
				}
				setState(102);
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

	public static class FunDecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public TerminalNode LP() { return getToken(CmmParser.LP, 0); }
		public TerminalNode RP() { return getToken(CmmParser.RP, 0); }
		public VarListContext varList() {
			return getRuleContext(VarListContext.class,0);
		}
		public FunDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).enterFunDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).exitFunDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmParserVisitor ) return ((CmmParserVisitor<? extends T>)visitor).visitFunDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunDecContext funDec() throws RecognitionException {
		FunDecContext _localctx = new FunDecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ID);
			setState(104);
			match(LP);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE || _la==STRUCT) {
				{
				setState(105);
				varList();
				}
			}

			setState(108);
			match(RP);
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

	public static class VarListContext extends ParserRuleContext {
		public List<ParamDecContext> paramDec() {
			return getRuleContexts(ParamDecContext.class);
		}
		public ParamDecContext paramDec(int i) {
			return getRuleContext(ParamDecContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public VarListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).enterVarList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).exitVarList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmParserVisitor ) return ((CmmParserVisitor<? extends T>)visitor).visitVarList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarListContext varList() throws RecognitionException {
		VarListContext _localctx = new VarListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			paramDec();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(111);
				match(COMMA);
				setState(112);
				paramDec();
				}
				}
				setState(117);
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

	public static class ParamDecContext extends ParserRuleContext {
		public SpecifierContext specifier() {
			return getRuleContext(SpecifierContext.class,0);
		}
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public ParamDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).enterParamDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).exitParamDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmParserVisitor ) return ((CmmParserVisitor<? extends T>)visitor).visitParamDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamDecContext paramDec() throws RecognitionException {
		ParamDecContext _localctx = new ParamDecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_paramDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			specifier();
			setState(119);
			varDec();
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

	public static class CompStContext extends ParserRuleContext {
		public TerminalNode LC() { return getToken(CmmParser.LC, 0); }
		public DefListContext defList() {
			return getRuleContext(DefListContext.class,0);
		}
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public TerminalNode RC() { return getToken(CmmParser.RC, 0); }
		public CompStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).enterCompSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).exitCompSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmParserVisitor ) return ((CmmParserVisitor<? extends T>)visitor).visitCompSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompStContext compSt() throws RecognitionException {
		CompStContext _localctx = new CompStContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(LC);
			setState(122);
			defList();
			setState(123);
			stmtList();
			setState(124);
			match(RC);
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

	public static class StmtListContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).enterStmtList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).exitStmtList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmParserVisitor ) return ((CmmParserVisitor<? extends T>)visitor).visitStmtList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtListContext stmtList() throws RecognitionException {
		StmtListContext _localctx = new StmtListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stmtList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << ID) | (1L << FLOAT) | (1L << INT) | (1L << LP) | (1L << LC) | (1L << NOT) | (1L << MINUS))) != 0)) {
				{
				{
				setState(126);
				stmt();
				}
				}
				setState(131);
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

	public static class StmtContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CmmParser.SEMI, 0); }
		public CompStContext compSt() {
			return getRuleContext(CompStContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(CmmParser.RETURN, 0); }
		public TerminalNode IF() { return getToken(CmmParser.IF, 0); }
		public TerminalNode LP() { return getToken(CmmParser.LP, 0); }
		public TerminalNode RP() { return getToken(CmmParser.RP, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CmmParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmParserVisitor ) return ((CmmParserVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stmt);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case FLOAT:
			case INT:
			case LP:
			case NOT:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				exp(0);
				setState(133);
				match(SEMI);
				}
				break;
			case LC:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				compSt();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				match(RETURN);
				setState(137);
				exp(0);
				setState(138);
				match(SEMI);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				match(IF);
				setState(141);
				match(LP);
				setState(142);
				exp(0);
				setState(143);
				match(RP);
				setState(144);
				stmt();
				setState(147);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(145);
					match(ELSE);
					setState(146);
					stmt();
					}
					break;
				}
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				match(WHILE);
				setState(150);
				match(LP);
				setState(151);
				exp(0);
				setState(152);
				match(RP);
				setState(153);
				stmt();
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

	public static class DefListContext extends ParserRuleContext {
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public DefListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).enterDefList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).exitDefList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmParserVisitor ) return ((CmmParserVisitor<? extends T>)visitor).visitDefList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefListContext defList() throws RecognitionException {
		DefListContext _localctx = new DefListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_defList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE || _la==STRUCT) {
				{
				{
				setState(157);
				def();
				}
				}
				setState(162);
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

	public static class DefContext extends ParserRuleContext {
		public SpecifierContext specifier() {
			return getRuleContext(SpecifierContext.class,0);
		}
		public DecListContext decList() {
			return getRuleContext(DecListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CmmParser.SEMI, 0); }
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).exitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmParserVisitor ) return ((CmmParserVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			specifier();
			setState(164);
			decList();
			setState(165);
			match(SEMI);
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

	public static class DecListContext extends ParserRuleContext {
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public DecListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).enterDecList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).exitDecList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmParserVisitor ) return ((CmmParserVisitor<? extends T>)visitor).visitDecList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecListContext decList() throws RecognitionException {
		DecListContext _localctx = new DecListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_decList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			dec();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(168);
				match(COMMA);
				setState(169);
				dec();
				}
				}
				setState(174);
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

	public static class DecContext extends ParserRuleContext {
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public TerminalNode ASSIGNOP() { return getToken(CmmParser.ASSIGNOP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).exitDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmParserVisitor ) return ((CmmParserVisitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			varDec();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNOP) {
				{
				setState(176);
				match(ASSIGNOP);
				setState(177);
				exp(0);
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

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public TerminalNode INT() { return getToken(CmmParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(CmmParser.FLOAT, 0); }
		public TerminalNode LP() { return getToken(CmmParser.LP, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode RP() { return getToken(CmmParser.RP, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode NOT() { return getToken(CmmParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(CmmParser.MINUS, 0); }
		public TerminalNode DIV() { return getToken(CmmParser.DIV, 0); }
		public TerminalNode STAR() { return getToken(CmmParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(CmmParser.PLUS, 0); }
		public TerminalNode RELOP() { return getToken(CmmParser.RELOP, 0); }
		public TerminalNode AND() { return getToken(CmmParser.AND, 0); }
		public TerminalNode OR() { return getToken(CmmParser.OR, 0); }
		public TerminalNode ASSIGNOP() { return getToken(CmmParser.ASSIGNOP, 0); }
		public TerminalNode LB() { return getToken(CmmParser.LB, 0); }
		public TerminalNode RB() { return getToken(CmmParser.RB, 0); }
		public TerminalNode DOT() { return getToken(CmmParser.DOT, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmParserVisitor ) return ((CmmParserVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(181);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << INT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				setState(182);
				match(LP);
				setState(183);
				exp(0);
				setState(184);
				match(RP);
				}
				break;
			case 3:
				{
				setState(186);
				match(ID);
				setState(187);
				match(LP);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << INT) | (1L << LP) | (1L << NOT) | (1L << MINUS))) != 0)) {
					{
					setState(188);
					args();
					}
				}

				setState(191);
				match(RP);
				}
				break;
			case 4:
				{
				setState(192);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(193);
				exp(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(222);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(196);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(197);
						_la = _input.LA(1);
						if ( !(_la==STAR || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(198);
						exp(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(199);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(200);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(201);
						exp(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(202);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(203);
						match(RELOP);
						setState(204);
						exp(5);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(205);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(206);
						match(AND);
						setState(207);
						exp(4);
						}
						break;
					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(208);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(209);
						match(OR);
						setState(210);
						exp(3);
						}
						break;
					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(211);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(212);
						match(ASSIGNOP);
						setState(213);
						exp(1);
						}
						break;
					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(214);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(215);
						match(LB);
						setState(216);
						exp(0);
						setState(217);
						match(RB);
						}
						break;
					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(219);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(220);
						match(DOT);
						setState(221);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmParserListener ) ((CmmParserListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmParserVisitor ) return ((CmmParserVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			exp(0);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(228);
				match(COMMA);
				setState(229);
				exp(0);
				}
				}
				setState(234);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00ee\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\4\3\4\3\4\7\4C\n\4"+
		"\f\4\16\4F\13\4\3\5\3\5\5\5J\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6T"+
		"\n\6\3\7\5\7W\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tb\n\t\3\t\7\t"+
		"e\n\t\f\t\16\th\13\t\3\n\3\n\3\n\5\nm\n\n\3\n\3\n\3\13\3\13\3\13\7\13"+
		"t\n\13\f\13\16\13w\13\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\7\16\u0082"+
		"\n\16\f\16\16\16\u0085\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0096\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u009e\n\17\3\20\7\20\u00a1\n\20\f\20\16\20\u00a4\13\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\7\22\u00ad\n\22\f\22\16\22\u00b0\13"+
		"\22\3\23\3\23\3\23\5\23\u00b5\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u00c0\n\24\3\24\3\24\3\24\5\24\u00c5\n\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00e1\n\24\f\24"+
		"\16\24\u00e4\13\24\3\25\3\25\3\25\7\25\u00e9\n\25\f\25\16\25\u00ec\13"+
		"\25\3\25\2\3&\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\6\3\2"+
		"\t\13\4\2\24\24\30\30\3\2\25\26\3\2\27\30\2\u00fb\2-\3\2\2\2\4=\3\2\2"+
		"\2\6?\3\2\2\2\bI\3\2\2\2\nS\3\2\2\2\fV\3\2\2\2\16X\3\2\2\2\20Z\3\2\2\2"+
		"\22i\3\2\2\2\24p\3\2\2\2\26x\3\2\2\2\30{\3\2\2\2\32\u0083\3\2\2\2\34\u009d"+
		"\3\2\2\2\36\u00a2\3\2\2\2 \u00a5\3\2\2\2\"\u00a9\3\2\2\2$\u00b1\3\2\2"+
		"\2&\u00c4\3\2\2\2(\u00e5\3\2\2\2*,\5\4\3\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2"+
		"\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\7\2\2\3\61\3\3\2\2\2\62\63\5"+
		"\b\5\2\63\64\5\6\4\2\64\65\7\36\2\2\65>\3\2\2\2\66\67\5\b\5\2\678\7\36"+
		"\2\28>\3\2\2\29:\5\b\5\2:;\5\22\n\2;<\5\30\r\2<>\3\2\2\2=\62\3\2\2\2="+
		"\66\3\2\2\2=9\3\2\2\2>\5\3\2\2\2?D\5\20\t\2@A\7\35\2\2AC\5\20\t\2B@\3"+
		"\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\7\3\2\2\2FD\3\2\2\2GJ\7\3\2\2HJ"+
		"\5\n\6\2IG\3\2\2\2IH\3\2\2\2J\t\3\2\2\2KL\7\4\2\2LM\5\f\7\2MN\7\21\2\2"+
		"NO\5\36\20\2OP\7\22\2\2PT\3\2\2\2QR\7\4\2\2RT\5\16\b\2SK\3\2\2\2SQ\3\2"+
		"\2\2T\13\3\2\2\2UW\7\t\2\2VU\3\2\2\2VW\3\2\2\2W\r\3\2\2\2XY\7\t\2\2Y\17"+
		"\3\2\2\2Zf\7\t\2\2[a\7\17\2\2\\b\7\13\2\2]^\7\t\2\2^b\b\t\1\2_`\7\n\2"+
		"\2`b\b\t\1\2a\\\3\2\2\2a]\3\2\2\2a_\3\2\2\2bc\3\2\2\2ce\7\20\2\2d[\3\2"+
		"\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\21\3\2\2\2hf\3\2\2\2ij\7\t\2\2jl\7"+
		"\r\2\2km\5\24\13\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7\16\2\2o\23\3\2\2"+
		"\2pu\5\26\f\2qr\7\35\2\2rt\5\26\f\2sq\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3"+
		"\2\2\2v\25\3\2\2\2wu\3\2\2\2xy\5\b\5\2yz\5\20\t\2z\27\3\2\2\2{|\7\21\2"+
		"\2|}\5\36\20\2}~\5\32\16\2~\177\7\22\2\2\177\31\3\2\2\2\u0080\u0082\5"+
		"\34\17\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\33\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\5&\24"+
		"\2\u0087\u0088\7\36\2\2\u0088\u009e\3\2\2\2\u0089\u009e\5\30\r\2\u008a"+
		"\u008b\7\5\2\2\u008b\u008c\5&\24\2\u008c\u008d\7\36\2\2\u008d\u009e\3"+
		"\2\2\2\u008e\u008f\7\6\2\2\u008f\u0090\7\r\2\2\u0090\u0091\5&\24\2\u0091"+
		"\u0092\7\16\2\2\u0092\u0095\5\34\17\2\u0093\u0094\7\7\2\2\u0094\u0096"+
		"\5\34\17\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u009e\3\2\2\2"+
		"\u0097\u0098\7\b\2\2\u0098\u0099\7\r\2\2\u0099\u009a\5&\24\2\u009a\u009b"+
		"\7\16\2\2\u009b\u009c\5\34\17\2\u009c\u009e\3\2\2\2\u009d\u0086\3\2\2"+
		"\2\u009d\u0089\3\2\2\2\u009d\u008a\3\2\2\2\u009d\u008e\3\2\2\2\u009d\u0097"+
		"\3\2\2\2\u009e\35\3\2\2\2\u009f\u00a1\5 \21\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\37\3\2\2"+
		"\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\5\b\5\2\u00a6\u00a7\5\"\22\2\u00a7"+
		"\u00a8\7\36\2\2\u00a8!\3\2\2\2\u00a9\u00ae\5$\23\2\u00aa\u00ab\7\35\2"+
		"\2\u00ab\u00ad\5$\23\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af#\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b4\5\20\t\2\u00b2\u00b3\7\34\2\2\u00b3\u00b5\5&\24\2\u00b4\u00b2\3"+
		"\2\2\2\u00b4\u00b5\3\2\2\2\u00b5%\3\2\2\2\u00b6\u00b7\b\24\1\2\u00b7\u00c5"+
		"\t\2\2\2\u00b8\u00b9\7\r\2\2\u00b9\u00ba\5&\24\2\u00ba\u00bb\7\16\2\2"+
		"\u00bb\u00c5\3\2\2\2\u00bc\u00bd\7\t\2\2\u00bd\u00bf\7\r\2\2\u00be\u00c0"+
		"\5(\25\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c5\7\16\2\2\u00c2\u00c3\t\3\2\2\u00c3\u00c5\5&\24\t\u00c4\u00b6\3"+
		"\2\2\2\u00c4\u00b8\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5"+
		"\u00e2\3\2\2\2\u00c6\u00c7\f\b\2\2\u00c7\u00c8\t\4\2\2\u00c8\u00e1\5&"+
		"\24\t\u00c9\u00ca\f\7\2\2\u00ca\u00cb\t\5\2\2\u00cb\u00e1\5&\24\b\u00cc"+
		"\u00cd\f\6\2\2\u00cd\u00ce\7\31\2\2\u00ce\u00e1\5&\24\7\u00cf\u00d0\f"+
		"\5\2\2\u00d0\u00d1\7\32\2\2\u00d1\u00e1\5&\24\6\u00d2\u00d3\f\4\2\2\u00d3"+
		"\u00d4\7\33\2\2\u00d4\u00e1\5&\24\5\u00d5\u00d6\f\3\2\2\u00d6\u00d7\7"+
		"\34\2\2\u00d7\u00e1\5&\24\3\u00d8\u00d9\f\13\2\2\u00d9\u00da\7\17\2\2"+
		"\u00da\u00db\5&\24\2\u00db\u00dc\7\20\2\2\u00dc\u00e1\3\2\2\2\u00dd\u00de"+
		"\f\n\2\2\u00de\u00df\7\23\2\2\u00df\u00e1\7\t\2\2\u00e0\u00c6\3\2\2\2"+
		"\u00e0\u00c9\3\2\2\2\u00e0\u00cc\3\2\2\2\u00e0\u00cf\3\2\2\2\u00e0\u00d2"+
		"\3\2\2\2\u00e0\u00d5\3\2\2\2\u00e0\u00d8\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\'\3\2\2\2"+
		"\u00e4\u00e2\3\2\2\2\u00e5\u00ea\5&\24\2\u00e6\u00e7\7\35\2\2\u00e7\u00e9"+
		"\5&\24\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb)\3\2\2\2\u00ec\u00ea\3\2\2\2\27-=DISVaflu\u0083\u0095"+
		"\u009d\u00a2\u00ae\u00b4\u00bf\u00c4\u00e0\u00e2\u00ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}