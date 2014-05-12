package es.usj.raspduino.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRaspduinoDSLLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_DOUBLE=7;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators

    public InternalRaspduinoDSLLexer() {;} 
    public InternalRaspduinoDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRaspduinoDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:11:7: ( 'Sketch:' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:11:9: 'Sketch:'
            {
            match("Sketch:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:12:7: ( 'Hardware:' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:12:9: 'Hardware:'
            {
            match("Hardware:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:13:7: ( 'Arduino UNO' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:13:9: 'Arduino UNO'
            {
            match("Arduino UNO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:14:7: ( 'Raspberry Pi' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:14:9: 'Raspberry Pi'
            {
            match("Raspberry Pi"); 


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
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:15:7: ( 'Concurrency Priority:' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:15:9: 'Concurrency Priority:'
            {
            match("Concurrency Priority:"); 


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
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:16:7: ( 'SENSOR' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:16:9: 'SENSOR'
            {
            match("SENSOR"); 


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
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:17:7: ( 'SCHEDULED' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:17:9: 'SCHEDULED'
            {
            match("SCHEDULED"); 


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
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:18:7: ( 'Sensor' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:18:9: 'Sensor'
            {
            match("Sensor"); 


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
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:19:7: ( 'pin' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:19:9: 'pin'
            {
            match("pin"); 


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
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:20:7: ( 'Actuator' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:20:9: 'Actuator'
            {
            match("Actuator"); 


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
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:21:7: ( 'EventHandler' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:21:9: 'EventHandler'
            {
            match("EventHandler"); 


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
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:22:7: ( ';' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:22:9: ';'
            {
            match(';'); 

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
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:23:7: ( ':' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:23:9: ':'
            {
            match(':'); 

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
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:24:7: ( 'On' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:24:9: 'On'
            {
            match("On"); 


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
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:25:7: ( 'Off' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:25:9: 'Off'
            {
            match("Off"); 


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
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:26:7: ( 'SensorListener' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:26:9: 'SensorListener'
            {
            match("SensorListener"); 


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
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:27:7: ( 'if' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:27:9: 'if'
            {
            match("if"); 


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
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:28:7: ( 'BETWEEN' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:28:9: 'BETWEEN'
            {
            match("BETWEEN"); 


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
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:29:7: ( 'AND' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:29:9: 'AND'
            {
            match("AND"); 


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
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:30:7: ( 'call' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:30:9: 'call'
            {
            match("call"); 


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
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:31:7: ( '&&' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:31:9: '&&'
            {
            match("&&"); 


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
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:32:7: ( '||' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:32:9: '||'
            {
            match("||"); 


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
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:33:7: ( '==' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:33:9: '=='
            {
            match("=="); 


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
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:34:7: ( '<=' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:34:9: '<='
            {
            match("<="); 


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
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:35:7: ( '>=' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:35:9: '>='
            {
            match(">="); 


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
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:36:7: ( '!=' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:36:9: '!='
            {
            match("!="); 


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
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:37:7: ( 'action' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:37:9: 'action'
            {
            match("action"); 


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
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:38:7: ( 'repeat' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:38:9: 'repeat'
            {
            match("repeat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:39:7: ( 'ONCE' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:39:9: 'ONCE'
            {
            match("ONCE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:40:7: ( 'EVERY' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:40:9: 'EVERY'
            {
            match("EVERY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:41:7: ( 'seconds:' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:41:9: 'seconds:'
            {
            match("seconds:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:42:7: ( 'EVERY DAY' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:42:9: 'EVERY DAY'
            {
            match("EVERY DAY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:43:7: ( 'EVERY MONDAY' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:43:9: 'EVERY MONDAY'
            {
            match("EVERY MONDAY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:44:7: ( 'EVERY TUESDAY' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:44:9: 'EVERY TUESDAY'
            {
            match("EVERY TUESDAY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:45:7: ( 'EVERY WEDNESDAY' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:45:9: 'EVERY WEDNESDAY'
            {
            match("EVERY WEDNESDAY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:46:7: ( 'EVERY THURSDAY' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:46:9: 'EVERY THURSDAY'
            {
            match("EVERY THURSDAY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:47:7: ( 'EVERY FRIDAY' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:47:9: 'EVERY FRIDAY'
            {
            match("EVERY FRIDAY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:48:7: ( 'EVERY SATURDAY' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:48:9: 'EVERY SATURDAY'
            {
            match("EVERY SATURDAY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:49:7: ( 'EVERY SUNDAY' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:49:9: 'EVERY SUNDAY'
            {
            match("EVERY SUNDAY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:50:7: ( 'hours:' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:50:9: 'hours:'
            {
            match("hours:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:51:7: ( 'minutes:' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:51:9: 'minutes:'
            {
            match("minutes:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1311:13: ( RULE_INT '.' RULE_INT )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1311:15: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1313:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1313:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1313:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1313:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1313:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1315:10: ( ( '0' .. '9' )+ )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1315:12: ( '0' .. '9' )+
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1315:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1315:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1317:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1317:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1317:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1317:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1317:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1317:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1317:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1317:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1317:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1317:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1317:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1319:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1319:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1319:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1319:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1321:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1321:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1321:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1321:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1321:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1321:41: ( '\\r' )? '\\n'
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1321:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1321:41: '\\r'
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1323:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1323:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1323:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:
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
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1325:16: ( . )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1325:18: .
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
        // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=49;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:256: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 43 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:268: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 44 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:276: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 45 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:285: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 46 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:297: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 47 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:313: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 48 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:329: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 49 :
                // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1:337: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\7\45\2\uffff\4\45\6\40\5\45\1\102\1\40\1\uffff\3\40\2"+
        "\uffff\4\45\1\uffff\11\45\2\uffff\1\126\2\45\1\131\2\45\6\uffff"+
        "\5\45\2\uffff\1\102\4\uffff\7\45\1\150\2\45\1\153\2\45\1\uffff\1"+
        "\156\1\45\1\uffff\16\45\1\uffff\2\45\1\uffff\2\45\1\uffff\1\u0082"+
        "\1\45\1\u0084\17\45\1\u0095\1\uffff\1\45\1\uffff\6\45\1\u009d\1"+
        "\45\1\u00a0\6\45\2\uffff\1\45\1\u00ae\1\u00af\1\45\1\uffff\1\45"+
        "\2\uffff\2\45\1\uffff\6\45\6\uffff\1\u00be\2\uffff\5\45\1\uffff"+
        "\1\u00c4\3\45\7\uffff\1\u00c8\1\45\2\uffff\3\45\1\uffff\1\45\1\uffff"+
        "\6\45\1\uffff\1\u00d4\1\45\1\uffff\1\u00d6\1\uffff";
    static final String DFA12_eofS =
        "\u00d7\uffff";
    static final String DFA12_minS =
        "\1\0\1\103\1\141\1\116\1\141\1\157\1\151\1\126\2\uffff\1\116\1"+
        "\146\1\105\1\141\1\46\1\174\4\75\1\143\2\145\1\157\1\151\1\56\1"+
        "\101\1\uffff\2\0\1\52\2\uffff\1\145\1\116\1\110\1\156\1\uffff\1"+
        "\162\1\144\1\164\1\104\1\163\2\156\1\145\1\105\2\uffff\1\60\1\146"+
        "\1\103\1\60\1\124\1\154\6\uffff\1\164\1\160\1\143\1\165\1\156\2"+
        "\uffff\1\56\4\uffff\1\164\1\123\1\105\1\163\1\144\2\165\1\60\1\160"+
        "\1\143\1\60\1\156\1\122\1\uffff\1\60\1\105\1\uffff\1\127\1\154\1"+
        "\151\1\145\1\157\1\162\1\165\1\143\1\117\1\104\1\157\1\167\1\151"+
        "\1\141\1\uffff\1\142\1\165\1\uffff\1\164\1\131\1\uffff\1\60\1\105"+
        "\1\60\1\157\1\141\1\156\1\163\1\164\1\150\1\122\1\125\1\162\1\141"+
        "\1\156\1\164\1\145\1\162\1\110\1\40\1\uffff\1\105\1\uffff\1\156"+
        "\1\164\1\144\1\72\1\145\1\72\1\60\1\114\1\60\1\162\2\157\2\162\1"+
        "\141\1\104\1\uffff\1\116\2\60\1\163\1\uffff\1\163\2\uffff\1\105"+
        "\1\151\1\uffff\1\145\1\40\2\162\1\145\1\156\2\uffff\1\110\2\uffff"+
        "\1\101\1\60\2\uffff\2\72\1\104\1\163\1\72\1\uffff\1\60\1\171\1\156"+
        "\1\144\7\uffff\1\60\1\164\2\uffff\1\40\1\143\1\154\1\uffff\1\145"+
        "\1\uffff\1\171\1\145\1\156\1\40\1\162\1\145\1\uffff\1\60\1\162\1"+
        "\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\153\1\141\1\162\1\141\1\157\1\151\1\166\2\uffff\1\156"+
        "\1\146\1\105\1\141\1\46\1\174\4\75\1\143\2\145\1\157\1\151\1\71"+
        "\1\172\1\uffff\2\uffff\1\57\2\uffff\1\145\1\116\1\110\1\156\1\uffff"+
        "\1\162\1\144\1\164\1\104\1\163\2\156\1\145\1\105\2\uffff\1\172\1"+
        "\146\1\103\1\172\1\124\1\154\6\uffff\1\164\1\160\1\143\1\165\1\156"+
        "\2\uffff\1\71\4\uffff\1\164\1\123\1\105\1\163\1\144\2\165\1\172"+
        "\1\160\1\143\1\172\1\156\1\122\1\uffff\1\172\1\105\1\uffff\1\127"+
        "\1\154\1\151\1\145\1\157\1\162\1\165\1\143\1\117\1\104\1\157\1\167"+
        "\1\151\1\141\1\uffff\1\142\1\165\1\uffff\1\164\1\131\1\uffff\1\172"+
        "\1\105\1\172\1\157\1\141\1\156\1\163\1\164\1\150\1\122\1\125\1\162"+
        "\1\141\1\156\1\164\1\145\1\162\1\110\1\172\1\uffff\1\105\1\uffff"+
        "\1\156\1\164\1\144\1\72\1\145\1\72\1\172\1\114\1\172\1\162\2\157"+
        "\2\162\1\141\1\127\1\uffff\1\116\2\172\1\163\1\uffff\1\163\2\uffff"+
        "\1\105\1\151\1\uffff\1\145\1\40\2\162\1\145\1\156\2\uffff\1\125"+
        "\2\uffff\1\125\1\172\2\uffff\2\72\1\104\1\163\1\72\1\uffff\1\172"+
        "\1\171\1\156\1\144\7\uffff\1\172\1\164\2\uffff\1\40\1\143\1\154"+
        "\1\uffff\1\145\1\uffff\1\171\1\145\1\156\1\40\1\162\1\145\1\uffff"+
        "\1\172\1\162\1\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\10\uffff\1\14\1\15\21\uffff\1\53\3\uffff\1\60\1\61\4\uffff\1\53"+
        "\11\uffff\1\14\1\15\6\uffff\1\25\1\26\1\27\1\30\1\31\1\32\5\uffff"+
        "\1\54\1\52\1\uffff\1\55\1\56\1\57\1\60\15\uffff\1\16\2\uffff\1\21"+
        "\16\uffff\1\23\2\uffff\1\11\2\uffff\1\17\23\uffff\1\35\1\uffff\1"+
        "\24\20\uffff\1\36\4\uffff\1\50\1\uffff\1\1\1\6\2\uffff\1\10\6\uffff"+
        "\1\40\1\41\1\uffff\1\43\1\45\2\uffff\1\33\1\34\5\uffff\1\3\4\uffff"+
        "\1\42\1\44\1\46\1\47\1\22\1\37\1\51\2\uffff\1\2\1\12\3\uffff\1\7"+
        "\1\uffff\1\4\6\uffff\1\5\2\uffff\1\13\1\uffff\1\20";
    static final String DFA12_specialS =
        "\1\1\33\uffff\1\2\1\0\u00b9\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\40\2\37\2\40\1\37\22\40\1\37\1\23\1\34\3\40\1\16\1\35\7"+
            "\40\1\36\12\31\1\11\1\10\1\21\1\20\1\22\2\40\1\3\1\14\1\5\1"+
            "\33\1\7\2\33\1\2\6\33\1\12\2\33\1\4\1\1\7\33\3\40\1\32\1\33"+
            "\1\40\1\24\1\33\1\15\4\33\1\27\1\13\3\33\1\30\2\33\1\6\1\33"+
            "\1\25\1\26\7\33\1\40\1\17\uff83\40",
            "\1\43\1\uffff\1\42\37\uffff\1\44\5\uffff\1\41",
            "\1\46",
            "\1\51\24\uffff\1\50\16\uffff\1\47",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\56\37\uffff\1\55",
            "",
            "",
            "\1\63\27\uffff\1\62\7\uffff\1\61",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\103\1\uffff\12\104",
            "\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\0\105",
            "\0\105",
            "\1\106\4\uffff\1\107",
            "",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\127",
            "\1\130",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\132",
            "\1\133",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "",
            "\1\103\1\uffff\12\104",
            "",
            "",
            "",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\151",
            "\1\152",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\154",
            "\1\155",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\157",
            "",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "",
            "\1\176",
            "\1\177",
            "",
            "\1\u0080",
            "\1\u0081",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0083",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094\17\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff"+
            "\32\45",
            "",
            "\1\u0096",
            "",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u009e",
            "\12\45\7\uffff\13\45\1\u009f\16\45\4\uffff\1\45\1\uffff\32"+
            "\45",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7\1\uffff\1\u00ab\6\uffff\1\u00a8\5\uffff\1\u00ac\1"+
            "\u00a9\2\uffff\1\u00aa",
            "",
            "\1\u00ad",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00b0",
            "",
            "\1\u00b1",
            "",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "",
            "\1\u00bb\14\uffff\1\u00ba",
            "",
            "",
            "\1\u00bc\23\uffff\1\u00bd",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00c9",
            "",
            "",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00d5",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_29 = input.LA(1);

                        s = -1;
                        if ( ((LA12_29>='\u0000' && LA12_29<='\uFFFF')) ) {s = 69;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='S') ) {s = 1;}

                        else if ( (LA12_0=='H') ) {s = 2;}

                        else if ( (LA12_0=='A') ) {s = 3;}

                        else if ( (LA12_0=='R') ) {s = 4;}

                        else if ( (LA12_0=='C') ) {s = 5;}

                        else if ( (LA12_0=='p') ) {s = 6;}

                        else if ( (LA12_0=='E') ) {s = 7;}

                        else if ( (LA12_0==';') ) {s = 8;}

                        else if ( (LA12_0==':') ) {s = 9;}

                        else if ( (LA12_0=='O') ) {s = 10;}

                        else if ( (LA12_0=='i') ) {s = 11;}

                        else if ( (LA12_0=='B') ) {s = 12;}

                        else if ( (LA12_0=='c') ) {s = 13;}

                        else if ( (LA12_0=='&') ) {s = 14;}

                        else if ( (LA12_0=='|') ) {s = 15;}

                        else if ( (LA12_0=='=') ) {s = 16;}

                        else if ( (LA12_0=='<') ) {s = 17;}

                        else if ( (LA12_0=='>') ) {s = 18;}

                        else if ( (LA12_0=='!') ) {s = 19;}

                        else if ( (LA12_0=='a') ) {s = 20;}

                        else if ( (LA12_0=='r') ) {s = 21;}

                        else if ( (LA12_0=='s') ) {s = 22;}

                        else if ( (LA12_0=='h') ) {s = 23;}

                        else if ( (LA12_0=='m') ) {s = 24;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 25;}

                        else if ( (LA12_0=='^') ) {s = 26;}

                        else if ( (LA12_0=='D'||(LA12_0>='F' && LA12_0<='G')||(LA12_0>='I' && LA12_0<='N')||(LA12_0>='P' && LA12_0<='Q')||(LA12_0>='T' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||(LA12_0>='d' && LA12_0<='g')||(LA12_0>='j' && LA12_0<='l')||(LA12_0>='n' && LA12_0<='o')||LA12_0=='q'||(LA12_0>='t' && LA12_0<='z')) ) {s = 27;}

                        else if ( (LA12_0=='\"') ) {s = 28;}

                        else if ( (LA12_0=='\'') ) {s = 29;}

                        else if ( (LA12_0=='/') ) {s = 30;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 31;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='%')||(LA12_0>='(' && LA12_0<='.')||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='{'||(LA12_0>='}' && LA12_0<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_28 = input.LA(1);

                        s = -1;
                        if ( ((LA12_28>='\u0000' && LA12_28<='\uFFFF')) ) {s = 69;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}