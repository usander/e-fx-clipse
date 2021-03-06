package at.bestsolution.efxclipse.tooling.css.cssext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCssExtDslLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_DOUBLE=8;
    public static final int RULE_REGEX=10;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=11;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__17=17;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_INT=7;
    public static final int RULE_JDOC=5;
    public static final int RULE_WS=6;
    public static final int RULE_PSEUDO=9;

    // delegates
    // delegators

    public InternalCssExtDslLexer() {;} 
    public InternalCssExtDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCssExtDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:11:7: ( 'import' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:11:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:12:7: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:12:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:13:7: ( '*' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:13:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:14:7: ( 'package' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:14:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:15:7: ( '{' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:15:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:16:7: ( '}' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:17:7: ( 'int' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:17:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:18:7: ( '(' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:18:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:19:7: ( '->' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:19:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:20:7: ( ')' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:20:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:21:7: ( 'double' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:21:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:22:7: ( 'extends' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:22:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:23:7: ( ',' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:23:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:24:7: ( 'default:' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:24:9: 'default:'
            {
            match("default:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:25:7: ( ';' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:25:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:26:7: ( '<' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:26:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:27:7: ( '>' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:27:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:28:7: ( '=' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:28:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:29:7: ( '|' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:29:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:30:7: ( '||' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:30:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:31:7: ( '+' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:31:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:32:7: ( '?' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:32:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:33:7: ( '[' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:33:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:34:7: ( ']' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:34:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:35:7: ( '%' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:35:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "RULE_PSEUDO"
    public final void mRULE_PSEUDO() throws RecognitionException {
        try {
            int _type = RULE_PSEUDO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2048:13: ( ':' ~ ( ' ' ) RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2048:15: ':' ~ ( ' ' ) RULE_ID
            {
            match(':'); 
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            mRULE_ID(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PSEUDO"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2050:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '-' )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2050:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '-' )*
            {
            if ( input.LA(1)=='-'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2050:39: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '-' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_JDOC"
    public final void mRULE_JDOC() throws RecognitionException {
        try {
            int _type = RULE_JDOC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2052:11: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2052:13: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2052:19: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='.')||(LA2_1>='0' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<=')')||(LA2_0>='+' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2052:47: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_JDOC"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2054:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2054:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2054:31: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='*') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='/') ) {
                        alt3=2;
                    }
                    else if ( ((LA3_1>='\u0000' && LA3_1<='.')||(LA3_1>='0' && LA3_1<='\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<=')')||(LA3_0>='+' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2054:59: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2056:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2056:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2056:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2056:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2056:40: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2056:41: ( '\\r' )? '\\n'
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2056:41: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2056:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2058:10: ( ( '-' )? ( '0' .. '9' )+ )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2058:12: ( '-' )? ( '0' .. '9' )+
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2058:12: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='-') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2058:12: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2058:17: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2058:18: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2060:13: ( ( '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' )+ )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2060:15: ( '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' )+
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2060:15: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='-') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2060:15: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2060:20: ( '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2060:21: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match('.'); 
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2060:36: ( '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2060:37: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_REGEX"
    public final void mRULE_REGEX() throws RecognitionException {
        try {
            int _type = RULE_REGEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2062:12: ( '$' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | ',' | '.' | '?' | '\\'' | ':' | '\"' | '>' | '<' | '/' | '_' | '=' | ';' | '(' | ')' | '&' | '!' | '#' | '%' | '*' | '+' | '[' | ']' | '{' | '}' )+ '$' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2062:14: '$' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | ',' | '.' | '?' | '\\'' | ':' | '\"' | '>' | '<' | '/' | '_' | '=' | ';' | '(' | ')' | '&' | '!' | '#' | '%' | '*' | '+' | '[' | ']' | '{' | '}' )+ '$'
            {
            match('$'); 
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2062:18: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | ',' | '.' | '?' | '\\'' | ':' | '\"' | '>' | '<' | '/' | '_' | '=' | ';' | '(' | ')' | '&' | '!' | '#' | '%' | '*' | '+' | '[' | ']' | '{' | '}' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='!' && LA12_0<='#')||(LA12_0>='%' && LA12_0<='?')||(LA12_0>='A' && LA12_0<='[')||LA12_0==']'||LA12_0=='_'||(LA12_0>='a' && LA12_0<='{')||LA12_0=='}') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:
            	    {
            	    if ( (input.LA(1)>='!' && input.LA(1)<='#')||(input.LA(1)>='%' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='[')||input.LA(1)==']'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='{')||input.LA(1)=='}' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REGEX"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2064:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2064:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2064:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\"') ) {
                alt15=1;
            }
            else if ( (LA15_0=='\'') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2064:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2064:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2064:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2064:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2064:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2064:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2064:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2064:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2066:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2066:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2066:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2068:16: ( . )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2068:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | RULE_PSEUDO | RULE_ID | RULE_JDOC | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_INT | RULE_DOUBLE | RULE_REGEX | RULE_STRING | RULE_WS | RULE_ANY_OTHER )
        int alt17=36;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:160: RULE_PSEUDO
                {
                mRULE_PSEUDO(); 

                }
                break;
            case 27 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:172: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 28 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:180: RULE_JDOC
                {
                mRULE_JDOC(); 

                }
                break;
            case 29 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:190: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 30 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:206: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 31 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:222: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 32 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:231: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 33 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:243: RULE_REGEX
                {
                mRULE_REGEX(); 

                }
                break;
            case 34 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:254: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 35 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:266: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 36 :
                // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1:274: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\1\42\1\43\1\uffff\1\42\3\uffff\1\42\1\uffff\2\42\5\uffff"+
        "\1\66\5\uffff\1\37\1\uffff\1\37\1\77\3\37\2\uffff\2\42\4\uffff\1"+
        "\42\4\uffff\1\42\1\uffff\3\42\20\uffff\1\77\3\uffff\1\42\1\115\4"+
        "\42\2\uffff\1\42\1\uffff\11\42\1\134\1\42\1\136\2\42\1\uffff\1\141"+
        "\1\uffff\1\42\1\143\3\uffff";
    static final String DFA17_eofS =
        "\144\uffff";
    static final String DFA17_minS =
        "\1\0\1\155\1\60\1\uffff\1\141\3\uffff\1\56\1\uffff\1\145\1\170\5"+
        "\uffff\1\174\5\uffff\1\0\1\uffff\1\52\1\56\1\41\2\0\2\uffff\1\160"+
        "\1\164\4\uffff\1\143\4\uffff\1\56\1\uffff\1\165\1\146\1\164\15\uffff"+
        "\1\0\2\uffff\1\56\3\uffff\1\157\1\55\1\153\1\142\1\141\1\145\2\uffff"+
        "\1\162\1\uffff\1\141\1\154\1\165\1\156\1\164\1\147\1\145\1\154\1"+
        "\144\1\55\1\145\1\55\1\164\1\163\1\uffff\1\55\1\uffff\1\72\1\55"+
        "\3\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\156\1\71\1\uffff\1\141\3\uffff\1\76\1\uffff\1\157\1\170"+
        "\5\uffff\1\174\5\uffff\1\uffff\1\uffff\1\57\1\71\1\175\2\uffff\2"+
        "\uffff\1\160\1\164\4\uffff\1\143\4\uffff\1\71\1\uffff\1\165\1\146"+
        "\1\164\15\uffff\1\uffff\2\uffff\1\71\3\uffff\1\157\1\172\1\153\1"+
        "\142\1\141\1\145\2\uffff\1\162\1\uffff\1\141\1\154\1\165\1\156\1"+
        "\164\1\147\1\145\1\154\1\144\1\172\1\145\1\172\1\164\1\163\1\uffff"+
        "\1\172\1\uffff\1\72\1\172\3\uffff";
    static final String DFA17_acceptS =
        "\3\uffff\1\3\1\uffff\1\5\1\6\1\10\1\uffff\1\12\2\uffff\1\15\1\17"+
        "\1\20\1\21\1\22\1\uffff\1\25\1\26\1\27\1\30\1\31\1\uffff\1\33\5"+
        "\uffff\1\43\1\44\2\uffff\1\33\1\2\1\40\1\3\1\uffff\1\5\1\6\1\10"+
        "\1\11\1\uffff\1\12\3\uffff\1\15\1\17\1\20\1\21\1\22\1\24\1\23\1"+
        "\25\1\26\1\27\1\30\1\31\1\32\1\uffff\1\36\1\37\1\uffff\1\41\1\42"+
        "\1\43\6\uffff\1\34\1\35\1\uffff\1\7\16\uffff\1\1\1\uffff\1\13\2"+
        "\uffff\1\4\1\16\1\14";
    static final String DFA17_specialS =
        "\1\1\26\uffff\1\4\4\uffff\1\2\1\0\37\uffff\1\3\46\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\37\1\34\1\37\1\33\1\26\1"+
            "\37\1\35\1\7\1\11\1\3\1\22\1\14\1\10\1\2\1\31\12\32\1\27\1\15"+
            "\1\16\1\20\1\17\1\23\1\37\32\30\1\24\1\37\1\25\1\37\1\30\1\37"+
            "\3\30\1\12\1\13\3\30\1\1\6\30\1\4\12\30\1\5\1\21\1\6\uff82\37",
            "\1\40\1\41",
            "\12\44",
            "",
            "\1\46",
            "",
            "",
            "",
            "\1\44\1\uffff\12\53\4\uffff\1\52",
            "",
            "\1\56\11\uffff\1\55",
            "\1\57",
            "",
            "",
            "",
            "",
            "",
            "\1\65",
            "",
            "",
            "",
            "",
            "",
            "\40\74\1\uffff\uffdf\74",
            "",
            "\1\75\4\uffff\1\76",
            "\1\44\1\uffff\12\100",
            "\3\101\1\uffff\33\101\1\uffff\33\101\1\uffff\1\101\1\uffff"+
            "\1\101\1\uffff\33\101\1\uffff\1\101",
            "\0\102",
            "\0\102",
            "",
            "",
            "\1\104",
            "\1\105",
            "",
            "",
            "",
            "",
            "\1\106",
            "",
            "",
            "",
            "",
            "\1\44\1\uffff\12\53",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\52\113\1\112\uffd5\113",
            "",
            "",
            "\1\44\1\uffff\12\100",
            "",
            "",
            "",
            "\1\114",
            "\1\42\2\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "",
            "\1\122",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\42\2\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\135",
            "\1\42\2\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\137",
            "\1\140",
            "",
            "\1\42\2\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\142",
            "\1\42\2\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | RULE_PSEUDO | RULE_ID | RULE_JDOC | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_INT | RULE_DOUBLE | RULE_REGEX | RULE_STRING | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_29 = input.LA(1);

                        s = -1;
                        if ( ((LA17_29>='\u0000' && LA17_29<='\uFFFF')) ) {s = 66;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='i') ) {s = 1;}

                        else if ( (LA17_0=='.') ) {s = 2;}

                        else if ( (LA17_0=='*') ) {s = 3;}

                        else if ( (LA17_0=='p') ) {s = 4;}

                        else if ( (LA17_0=='{') ) {s = 5;}

                        else if ( (LA17_0=='}') ) {s = 6;}

                        else if ( (LA17_0=='(') ) {s = 7;}

                        else if ( (LA17_0=='-') ) {s = 8;}

                        else if ( (LA17_0==')') ) {s = 9;}

                        else if ( (LA17_0=='d') ) {s = 10;}

                        else if ( (LA17_0=='e') ) {s = 11;}

                        else if ( (LA17_0==',') ) {s = 12;}

                        else if ( (LA17_0==';') ) {s = 13;}

                        else if ( (LA17_0=='<') ) {s = 14;}

                        else if ( (LA17_0=='>') ) {s = 15;}

                        else if ( (LA17_0=='=') ) {s = 16;}

                        else if ( (LA17_0=='|') ) {s = 17;}

                        else if ( (LA17_0=='+') ) {s = 18;}

                        else if ( (LA17_0=='?') ) {s = 19;}

                        else if ( (LA17_0=='[') ) {s = 20;}

                        else if ( (LA17_0==']') ) {s = 21;}

                        else if ( (LA17_0=='%') ) {s = 22;}

                        else if ( (LA17_0==':') ) {s = 23;}

                        else if ( ((LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='c')||(LA17_0>='f' && LA17_0<='h')||(LA17_0>='j' && LA17_0<='o')||(LA17_0>='q' && LA17_0<='z')) ) {s = 24;}

                        else if ( (LA17_0=='/') ) {s = 25;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 26;}

                        else if ( (LA17_0=='$') ) {s = 27;}

                        else if ( (LA17_0=='\"') ) {s = 28;}

                        else if ( (LA17_0=='\'') ) {s = 29;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 30;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||LA17_0=='#'||LA17_0=='&'||LA17_0=='@'||LA17_0=='\\'||LA17_0=='^'||LA17_0=='`'||(LA17_0>='~' && LA17_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_28 = input.LA(1);

                        s = -1;
                        if ( ((LA17_28>='\u0000' && LA17_28<='\uFFFF')) ) {s = 66;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_61 = input.LA(1);

                        s = -1;
                        if ( (LA17_61=='*') ) {s = 74;}

                        else if ( ((LA17_61>='\u0000' && LA17_61<=')')||(LA17_61>='+' && LA17_61<='\uFFFF')) ) {s = 75;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_23 = input.LA(1);

                        s = -1;
                        if ( ((LA17_23>='\u0000' && LA17_23<='\u001F')||(LA17_23>='!' && LA17_23<='\uFFFF')) ) {s = 60;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}