// Generated from Cobra.g4 by ANTLR 4.4

package riki.cobra.language;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CobraLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__17=1, T__16=2, T__15=3, T__14=4, T__13=5, T__12=6, T__11=7, T__10=8, 
		T__9=9, T__8=10, T__7=11, T__6=12, T__5=13, T__4=14, T__3=15, T__2=16, 
		T__1=17, T__0=18, STRING=19, ID=20, WS=21, COMMENT=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'"
	};
	public static final String[] ruleNames = {
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "STRING", "ID", "WS", "COMMENT"
	};


	public CobraLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cobra.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 18: STRING_action((RuleContext)_localctx, actionIndex); break;
		case 19: ID_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: setText(getText().substring(1, getText().length()-1)); break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: setText(getText().substring(1, getText().length())); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u009c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u0080"+
		"\n\24\f\24\16\24\u0083\13\24\3\24\3\24\3\24\3\25\3\25\6\25\u008a\n\25"+
		"\r\25\16\25\u008b\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\7\27\u0096\n"+
		"\27\f\27\16\27\u0099\13\27\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30\3\2\6\5\2\f\f\17\17$$\4\2C\\aa\5\2\13\f\17\17\"\"\5\2\f\f\17\17"+
		"AA\u009f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\3/\3\2\2\2\5\64\3\2\2\2\7<\3\2\2\2\t@\3\2\2\2\13C\3\2\2\2\rH\3\2\2\2"+
		"\17L\3\2\2\2\21N\3\2\2\2\23V\3\2\2\2\25X\3\2\2\2\27[\3\2\2\2\31]\3\2\2"+
		"\2\33_\3\2\2\2\35d\3\2\2\2\37f\3\2\2\2!k\3\2\2\2#r\3\2\2\2%t\3\2\2\2\'"+
		"{\3\2\2\2)\u0087\3\2\2\2+\u008f\3\2\2\2-\u0093\3\2\2\2/\60\7h\2\2\60\61"+
		"\7k\2\2\61\62\7n\2\2\62\63\7g\2\2\63\4\3\2\2\2\64\65\7t\2\2\65\66\7g\2"+
		"\2\66\67\7r\2\2\678\7n\2\289\7c\2\29:\7e\2\2:;\7g\2\2;\6\3\2\2\2<=\7w"+
		"\2\2=>\7u\2\2>?\7g\2\2?\b\3\2\2\2@A\7v\2\2AB\7q\2\2B\n\3\2\2\2CD\7g\2"+
		"\2DE\7z\2\2EF\7k\2\2FG\7v\2\2G\f\3\2\2\2HI\7u\2\2IJ\7w\2\2JK\7d\2\2K\16"+
		"\3\2\2\2LM\7]\2\2M\20\3\2\2\2NO\7g\2\2OP\7z\2\2PQ\7e\2\2QR\7n\2\2RS\7"+
		"w\2\2ST\7f\2\2TU\7g\2\2U\22\3\2\2\2VW\7}\2\2W\24\3\2\2\2XY\7q\2\2YZ\7"+
		"p\2\2Z\26\3\2\2\2[\\\7_\2\2\\\30\3\2\2\2]^\7?\2\2^\32\3\2\2\2_`\7y\2\2"+
		"`a\7k\2\2ab\7v\2\2bc\7j\2\2c\34\3\2\2\2de\7\177\2\2e\36\3\2\2\2fg\7h\2"+
		"\2gh\7t\2\2hi\7q\2\2ij\7o\2\2j \3\2\2\2kl\7h\2\2lm\7q\2\2mn\7n\2\2no\7"+
		"f\2\2op\7g\2\2pq\7t\2\2q\"\3\2\2\2rs\7.\2\2s$\3\2\2\2tu\7d\2\2uv\7c\2"+
		"\2vw\7e\2\2wx\7m\2\2xy\7w\2\2yz\7r\2\2z&\3\2\2\2{\u0081\7$\2\2|\u0080"+
		"\n\2\2\2}~\7^\2\2~\u0080\7$\2\2\177|\3\2\2\2\177}\3\2\2\2\u0080\u0083"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0085\7$\2\2\u0085\u0086\b\24\2\2\u0086(\3\2\2\2"+
		"\u0087\u0089\7&\2\2\u0088\u008a\t\3\2\2\u0089\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\b\25\3\2\u008e*\3\2\2\2\u008f\u0090\t\4\2\2\u0090\u0091\3\2\2\2"+
		"\u0091\u0092\b\26\4\2\u0092,\3\2\2\2\u0093\u0097\7%\2\2\u0094\u0096\n"+
		"\5\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\b\27"+
		"\4\2\u009b.\3\2\2\2\7\2\177\u0081\u008b\u0097\5\3\24\2\3\25\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}