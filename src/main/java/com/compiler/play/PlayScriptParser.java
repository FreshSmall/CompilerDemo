// Generated from PlayScript.g4 by ANTLR 4.9.2


import com.compiler.craft.Token;
import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlayScriptParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            ABSTRACT = 1, ASSERT = 2, BOOLEAN = 3, BREAK = 4, BYTE = 5, CASE = 6, CATCH = 7, CHAR = 8,
            CLASS = 9, CONST = 10, CONTINUE = 11, DEFAULT = 12, DO = 13, DOUBLE = 14, ELSE = 15,
            ENUM = 16, EXTENDS = 17, FINAL = 18, FINALLY = 19, FLOAT = 20, FOR = 21, IF = 22, GOTO = 23,
            IMPLEMENTS = 24, IMPORT = 25, INSTANCEOF = 26, INT = 27, INTERFACE = 28, LONG = 29,
            NATIVE = 30, NEW = 31, PACKAGE = 32, PRIVATE = 33, PROTECTED = 34, PUBLIC = 35, RETURN = 36,
            SHORT = 37, STATIC = 38, STRICTFP = 39, SUPER = 40, SWITCH = 41, SYNCHRONIZED = 42,
            THIS = 43, THROW = 44, THROWS = 45, TRANSIENT = 46, TRY = 47, VOID = 48, VOLATILE = 49,
            WHILE = 50, FUNCTION = 51, STRING = 52, DECIMAL_LITERAL = 53, HEX_LITERAL = 54,
            OCT_LITERAL = 55, BINARY_LITERAL = 56, FLOAT_LITERAL = 57, HEX_FLOAT_LITERAL = 58,
            BOOL_LITERAL = 59, CHAR_LITERAL = 60, STRING_LITERAL = 61, NULL_LITERAL = 62,
            LPAREN = 63, RPAREN = 64, LBRACE = 65, RBRACE = 66, LBRACK = 67, RBRACK = 68, SEMI = 69,
            COMMA = 70, DOT = 71, ASSIGN = 72, GT = 73, LT = 74, BANG = 75, TILDE = 76, QUESTION = 77,
            COLON = 78, EQUAL = 79, LE = 80, GE = 81, NOTEQUAL = 82, AND = 83, OR = 84, INC = 85,
            DEC = 86, ADD = 87, SUB = 88, MUL = 89, DIV = 90, BITAND = 91, BITOR = 92, CARET = 93,
            MOD = 94, ADD_ASSIGN = 95, SUB_ASSIGN = 96, MUL_ASSIGN = 97, DIV_ASSIGN = 98, AND_ASSIGN = 99,
            OR_ASSIGN = 100, XOR_ASSIGN = 101, MOD_ASSIGN = 102, LSHIFT_ASSIGN = 103, RSHIFT_ASSIGN = 104,
            URSHIFT_ASSIGN = 105, ARROW = 106, COLONCOLON = 107, AT = 108, ELLIPSIS = 109, WS = 110,
            COMMENT = 111, LINE_COMMENT = 112, IDENTIFIER = 113, Identifier = 114, IntegerLiteral = 115;
    public static final int
            RULE_expression = 0, RULE_assignmentExpression = 1, RULE_assignmentOperator = 2,
            RULE_additiveExpression = 3, RULE_multiplicativeExpression = 4, RULE_primaryExpression = 5;

    private static String[] makeRuleNames() {
        return new String[]{
                "expression", "assignmentExpression", "assignmentOperator", "additiveExpression",
                "multiplicativeExpression", "primaryExpression"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'",
                "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'",
                "'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'",
                "'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'",
                "'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'",
                "'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'",
                "'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'",
                "'transient'", "'try'", "'void'", "'volatile'", "'while'", "'function'",
                "'string'", null, null, null, null, null, null, null, null, null, "'null'",
                "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='",
                "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='",
                "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'",
                "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='",
                "'%='", "'<<='", "'>>='", "'>>>='", "'->'", "'::'", "'@'", "'...'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH",
                "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE",
                "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO",
                "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE",
                "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT",
                "STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW",
                "THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "FUNCTION",
                "STRING", "DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL",
                "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL",
                "STRING_LITERAL", "NULL_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE",
                "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG",
                "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND",
                "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET",
                "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN",
                "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN",
                "URSHIFT_ASSIGN", "ARROW", "COLONCOLON", "AT", "ELLIPSIS", "WS", "COMMENT",
                "LINE_COMMENT", "IDENTIFIER", "Identifier", "IntegerLiteral"
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
    public String getGrammarFileName() {
        return "PlayScript.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public PlayScriptParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class ExpressionContext extends ParserRuleContext {
        public AssignmentExpressionContext assignmentExpression() {
            return getRuleContext(AssignmentExpressionContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode COMMA() {
            return getToken(PlayScriptParser.COMMA, 0);
        }

        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PlayScriptListener) ((PlayScriptListener) listener).enterExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PlayScriptListener) ((PlayScriptListener) listener).exitExpression(this);
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
        int _startState = 0;
        enterRecursionRule(_localctx, 0, RULE_expression, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(13);
                    assignmentExpression();
                }
                _ctx.stop = _input.LT(-1);
                setState(20);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 0, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new ExpressionContext(_parentctx, _parentState);
                                pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                setState(15);
                                if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                setState(16);
                                match(COMMA);
                                setState(17);
                                assignmentExpression();
                            }
                        }
                    }
                    setState(22);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 0, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class AssignmentExpressionContext extends ParserRuleContext {
        public AdditiveExpressionContext additiveExpression() {
            return getRuleContext(AdditiveExpressionContext.class, 0);
        }

        public TerminalNode Identifier() {
            return getToken(PlayScriptParser.Identifier, 0);
        }

        public AssignmentOperatorContext assignmentOperator() {
            return getRuleContext(AssignmentOperatorContext.class, 0);
        }

        public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assignmentExpression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PlayScriptListener) ((PlayScriptListener) listener).enterAssignmentExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PlayScriptListener) ((PlayScriptListener) listener).exitAssignmentExpression(this);
        }
    }

    public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
        AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_assignmentExpression);
        try {
            setState(28);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(23);
                    additiveExpression(0);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(24);
                    match(Identifier);
                    setState(25);
                    assignmentOperator();
                    setState(26);
                    additiveExpression(0);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AssignmentOperatorContext extends ParserRuleContext {
        public TerminalNode ASSIGN() {
            return getToken(PlayScriptParser.ASSIGN, 0);
        }

        public TerminalNode MUL_ASSIGN() {
            return getToken(PlayScriptParser.MUL_ASSIGN, 0);
        }

        public TerminalNode DIV_ASSIGN() {
            return getToken(PlayScriptParser.DIV_ASSIGN, 0);
        }

        public TerminalNode MOD_ASSIGN() {
            return getToken(PlayScriptParser.MOD_ASSIGN, 0);
        }

        public TerminalNode ADD_ASSIGN() {
            return getToken(PlayScriptParser.ADD_ASSIGN, 0);
        }

        public TerminalNode SUB_ASSIGN() {
            return getToken(PlayScriptParser.SUB_ASSIGN, 0);
        }

        public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assignmentOperator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PlayScriptListener) ((PlayScriptListener) listener).enterAssignmentOperator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PlayScriptListener) ((PlayScriptListener) listener).exitAssignmentOperator(this);
        }
    }

    public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
        AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_assignmentOperator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(30);
                _la = _input.LA(1);
                if (!(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (ASSIGN - 72)) | (1L << (ADD_ASSIGN - 72)) | (1L << (SUB_ASSIGN - 72)) | (1L << (MUL_ASSIGN - 72)) | (1L << (DIV_ASSIGN - 72)) | (1L << (MOD_ASSIGN - 72)))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AdditiveExpressionContext extends ParserRuleContext {
        public MultiplicativeExpressionContext multiplicativeExpression() {
            return getRuleContext(MultiplicativeExpressionContext.class, 0);
        }

        public AdditiveExpressionContext additiveExpression() {
            return getRuleContext(AdditiveExpressionContext.class, 0);
        }

        public TerminalNode ADD() {
            return getToken(PlayScriptParser.ADD, 0);
        }

        public TerminalNode SUB() {
            return getToken(PlayScriptParser.SUB, 0);
        }

        public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_additiveExpression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PlayScriptListener) ((PlayScriptListener) listener).enterAdditiveExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PlayScriptListener) ((PlayScriptListener) listener).exitAdditiveExpression(this);
        }
    }

    public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
        return additiveExpression(0);
    }

    private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
        AdditiveExpressionContext _prevctx = _localctx;
        int _startState = 6;
        enterRecursionRule(_localctx, 6, RULE_additiveExpression, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(33);
                    multiplicativeExpression(0);
                }
                _ctx.stop = _input.LT(-1);
                setState(43);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(41);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                                case 1: {
                                    _localctx = new AdditiveExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
                                    setState(35);
                                    if (!(precpred(_ctx, 2)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    setState(36);
                                    match(ADD);
                                    setState(37);
                                    multiplicativeExpression(0);
                                }
                                break;
                                case 2: {
                                    _localctx = new AdditiveExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
                                    setState(38);
                                    if (!(precpred(_ctx, 1)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                    setState(39);
                                    match(SUB);
                                    setState(40);
                                    multiplicativeExpression(0);
                                }
                                break;
                            }
                        }
                    }
                    setState(45);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class MultiplicativeExpressionContext extends ParserRuleContext {
        public PrimaryExpressionContext primaryExpression() {
            return getRuleContext(PrimaryExpressionContext.class, 0);
        }

        public MultiplicativeExpressionContext multiplicativeExpression() {
            return getRuleContext(MultiplicativeExpressionContext.class, 0);
        }

        public TerminalNode MUL() {
            return getToken(PlayScriptParser.MUL, 0);
        }

        public TerminalNode DIV() {
            return getToken(PlayScriptParser.DIV, 0);
        }

        public TerminalNode MOD() {
            return getToken(PlayScriptParser.MOD, 0);
        }

        public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_multiplicativeExpression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PlayScriptListener)
                ((PlayScriptListener) listener).enterMultiplicativeExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PlayScriptListener)
                ((PlayScriptListener) listener).exitMultiplicativeExpression(this);
        }
    }

    public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
        return multiplicativeExpression(0);
    }

    private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
        MultiplicativeExpressionContext _prevctx = _localctx;
        int _startState = 8;
        enterRecursionRule(_localctx, 8, RULE_multiplicativeExpression, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(47);
                    primaryExpression();
                }
                _ctx.stop = _input.LT(-1);
                setState(60);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(58);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
                                case 1: {
                                    _localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
                                    setState(49);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(50);
                                    match(MUL);
                                    setState(51);
                                    primaryExpression();
                                }
                                break;
                                case 2: {
                                    _localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
                                    setState(52);
                                    if (!(precpred(_ctx, 2)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    setState(53);
                                    match(DIV);
                                    setState(54);
                                    primaryExpression();
                                }
                                break;
                                case 3: {
                                    _localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
                                    setState(55);
                                    if (!(precpred(_ctx, 1)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                    setState(56);
                                    match(MOD);
                                    setState(57);
                                    primaryExpression();
                                }
                                break;
                            }
                        }
                    }
                    setState(62);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class PrimaryExpressionContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(PlayScriptParser.Identifier, 0);
        }

        public TerminalNode IntegerLiteral() {
            return getToken(PlayScriptParser.IntegerLiteral, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(PlayScriptParser.LPAREN, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(PlayScriptParser.RPAREN, 0);
        }

        public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_primaryExpression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PlayScriptListener) ((PlayScriptListener) listener).enterPrimaryExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PlayScriptListener) ((PlayScriptListener) listener).exitPrimaryExpression(this);
        }
    }

    public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
        PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_primaryExpression);
        try {
            setState(69);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Identifier:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(63);
                    match(Identifier);
                }
                break;
                case IntegerLiteral:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(64);
                    match(IntegerLiteral);
                }
                break;
                case LPAREN:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(65);
                    match(LPAREN);
                    setState(66);
                    expression(0);
                    setState(67);
                    match(RPAREN);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 0:
                return expression_sempred((ExpressionContext) _localctx, predIndex);
            case 3:
                return additiveExpression_sempred((AdditiveExpressionContext) _localctx, predIndex);
            case 4:
                return multiplicativeExpression_sempred((MultiplicativeExpressionContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 1);
        }
        return true;
    }

    private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
        switch (predIndex) {
            case 1:
                return precpred(_ctx, 2);
            case 2:
                return precpred(_ctx, 1);
        }
        return true;
    }

    private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
        switch (predIndex) {
            case 3:
                return precpred(_ctx, 3);
            case 4:
                return precpred(_ctx, 2);
            case 5:
                return precpred(_ctx, 1);
        }
        return true;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3uJ\4\2\t\2\4\3\t\3" +
                    "\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\7\2\25\n\2\f" +
                    "\2\16\2\30\13\2\3\3\3\3\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\5\3\5\3\5\3\5" +
                    "\3\5\3\5\3\5\3\5\3\5\7\5,\n\5\f\5\16\5/\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3" +
                    "\6\3\6\3\6\3\6\3\6\3\6\7\6=\n\6\f\6\16\6@\13\6\3\7\3\7\3\7\3\7\3\7\3\7" +
                    "\5\7H\n\7\3\7\2\5\2\b\n\b\2\4\6\b\n\f\2\3\5\2JJadhh\2L\2\16\3\2\2\2\4" +
                    "\36\3\2\2\2\6 \3\2\2\2\b\"\3\2\2\2\n\60\3\2\2\2\fG\3\2\2\2\16\17\b\2\1" +
                    "\2\17\20\5\4\3\2\20\26\3\2\2\2\21\22\f\3\2\2\22\23\7H\2\2\23\25\5\4\3" +
                    "\2\24\21\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\3\3\2\2" +
                    "\2\30\26\3\2\2\2\31\37\5\b\5\2\32\33\7t\2\2\33\34\5\6\4\2\34\35\5\b\5" +
                    "\2\35\37\3\2\2\2\36\31\3\2\2\2\36\32\3\2\2\2\37\5\3\2\2\2 !\t\2\2\2!\7" +
                    "\3\2\2\2\"#\b\5\1\2#$\5\n\6\2$-\3\2\2\2%&\f\4\2\2&\'\7Y\2\2\',\5\n\6\2" +
                    "()\f\3\2\2)*\7Z\2\2*,\5\n\6\2+%\3\2\2\2+(\3\2\2\2,/\3\2\2\2-+\3\2\2\2" +
                    "-.\3\2\2\2.\t\3\2\2\2/-\3\2\2\2\60\61\b\6\1\2\61\62\5\f\7\2\62>\3\2\2" +
                    "\2\63\64\f\5\2\2\64\65\7[\2\2\65=\5\f\7\2\66\67\f\4\2\2\678\7\\\2\28=" +
                    "\5\f\7\29:\f\3\2\2:;\7`\2\2;=\5\f\7\2<\63\3\2\2\2<\66\3\2\2\2<9\3\2\2" +
                    "\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\13\3\2\2\2@>\3\2\2\2AH\7t\2\2BH\7u\2" +
                    "\2CD\7A\2\2DE\5\2\2\2EF\7B\2\2FH\3\2\2\2GA\3\2\2\2GB\3\2\2\2GC\3\2\2\2" +
                    "H\r\3\2\2\2\t\26\36+-<>G";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}
