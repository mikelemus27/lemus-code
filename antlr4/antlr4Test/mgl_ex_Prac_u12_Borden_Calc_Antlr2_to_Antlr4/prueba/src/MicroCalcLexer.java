// Generated from /home/mikelemus/antlr4_lib/mgl_ex_Prac_u12_Borden_Calc_Antlr2_to_Antlr4/MicroCalc.g4 by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MicroCalcLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANCO=1, OP_MAS=2, OP_MENOS=3, OP_PRODUCTO=4, OP_COCIENTE=5, PARENT_AB=6, 
		PARENT_CE=7, NUMERO=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"BLANCO", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "NUMERO"
	};
	public static final String[] ruleNames = {
		"BLANCO", "OP_MAS", "OP_MENOS", "OP_PRODUCTO", "OP_COCIENTE", "PARENT_AB", 
		"PARENT_CE", "NUMERO"
	};


	public MicroCalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MicroCalc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0: BLANCO_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void BLANCO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\n\60\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\6\t%\n\t\r\t\16\t&\3\t\3\t\6\t+\n\t\r\t\16\t,\5\t/\n\t\2\n\3\3"+
		"\2\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\3\2\3\4\13\13\"\"\62\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5\27\3\2\2\2\7\31\3\2\2\2\t"+
		"\33\3\2\2\2\13\35\3\2\2\2\r\37\3\2\2\2\17!\3\2\2\2\21$\3\2\2\2\23\24\t"+
		"\2\2\2\24\25\3\2\2\2\25\26\b\2\2\2\26\4\3\2\2\2\27\30\7-\2\2\30\6\3\2"+
		"\2\2\31\32\7/\2\2\32\b\3\2\2\2\33\34\7,\2\2\34\n\3\2\2\2\35\36\7\61\2"+
		"\2\36\f\3\2\2\2\37 \7*\2\2 \16\3\2\2\2!\"\7+\2\2\"\20\3\2\2\2#%\4\62;"+
		"\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'.\3\2\2\2(*\7\60\2\2)+\4"+
		"\62;\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.(\3\2\2\2./\3"+
		"\2\2\2/\22\3\2\2\2\6\2&,.";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}