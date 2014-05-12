package es.usj.raspduino.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import es.usj.raspduino.services.RaspduinoDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRaspduinoDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Arduino UNO'", "'Raspberry Pi'", "'SENSOR'", "'SCHEDULED'", "'On'", "'Off'", "'&&'", "'||'", "'=='", "'<='", "'>='", "'!='", "'ONCE'", "'EVERY'", "'EVERY DAY'", "'EVERY MONDAY'", "'EVERY TUESDAY'", "'EVERY WEDNESDAY'", "'EVERY THURSDAY'", "'EVERY FRIDAY'", "'EVERY SATURDAY'", "'EVERY SUNDAY'", "'Sketch:'", "'Hardware:'", "'Concurrency Priority:'", "'Sensor'", "'pin'", "'Actuator'", "'EventHandler'", "';'", "':'", "'SensorListener'", "'if'", "'call'", "'AND'", "'action'", "'repeat'", "'seconds:'", "'hours:'", "'minutes:'", "'BETWEEN'"
    };
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
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
    public static final int RULE_DOUBLE=4;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
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


        public InternalRaspduinoDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRaspduinoDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRaspduinoDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g"; }


     
     	private RaspduinoDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(RaspduinoDSLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:61:1: ( ruleModel EOF )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:76:1: ( rule__Model__Group__0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAbstractDevice"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:88:1: entryRuleAbstractDevice : ruleAbstractDevice EOF ;
    public final void entryRuleAbstractDevice() throws RecognitionException {
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:89:1: ( ruleAbstractDevice EOF )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:90:1: ruleAbstractDevice EOF
            {
             before(grammarAccess.getAbstractDeviceRule()); 
            pushFollow(FOLLOW_ruleAbstractDevice_in_entryRuleAbstractDevice121);
            ruleAbstractDevice();

            state._fsp--;

             after(grammarAccess.getAbstractDeviceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDevice128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractDevice"


    // $ANTLR start "ruleAbstractDevice"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:97:1: ruleAbstractDevice : ( ( rule__AbstractDevice__Alternatives ) ) ;
    public final void ruleAbstractDevice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:101:2: ( ( ( rule__AbstractDevice__Alternatives ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:102:1: ( ( rule__AbstractDevice__Alternatives ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:102:1: ( ( rule__AbstractDevice__Alternatives ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:103:1: ( rule__AbstractDevice__Alternatives )
            {
             before(grammarAccess.getAbstractDeviceAccess().getAlternatives()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:104:1: ( rule__AbstractDevice__Alternatives )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:104:2: rule__AbstractDevice__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractDevice__Alternatives_in_ruleAbstractDevice154);
            rule__AbstractDevice__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractDeviceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractDevice"


    // $ANTLR start "entryRuleSensor"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:116:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:117:1: ( ruleSensor EOF )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:118:1: ruleSensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_ruleSensor_in_entryRuleSensor181);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getSensorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSensor188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:125:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:129:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:130:1: ( ( rule__Sensor__Group__0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:130:1: ( ( rule__Sensor__Group__0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:131:1: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:132:1: ( rule__Sensor__Group__0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:132:2: rule__Sensor__Group__0
            {
            pushFollow(FOLLOW_rule__Sensor__Group__0_in_ruleSensor214);
            rule__Sensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleActuator"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:144:1: entryRuleActuator : ruleActuator EOF ;
    public final void entryRuleActuator() throws RecognitionException {
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:145:1: ( ruleActuator EOF )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:146:1: ruleActuator EOF
            {
             before(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_ruleActuator_in_entryRuleActuator241);
            ruleActuator();

            state._fsp--;

             after(grammarAccess.getActuatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActuator248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:153:1: ruleActuator : ( ( rule__Actuator__Group__0 ) ) ;
    public final void ruleActuator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:157:2: ( ( ( rule__Actuator__Group__0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:158:1: ( ( rule__Actuator__Group__0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:158:1: ( ( rule__Actuator__Group__0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:159:1: ( rule__Actuator__Group__0 )
            {
             before(grammarAccess.getActuatorAccess().getGroup()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:160:1: ( rule__Actuator__Group__0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:160:2: rule__Actuator__Group__0
            {
            pushFollow(FOLLOW_rule__Actuator__Group__0_in_ruleActuator274);
            rule__Actuator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleEventHandler"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:172:1: entryRuleEventHandler : ruleEventHandler EOF ;
    public final void entryRuleEventHandler() throws RecognitionException {
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:173:1: ( ruleEventHandler EOF )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:174:1: ruleEventHandler EOF
            {
             before(grammarAccess.getEventHandlerRule()); 
            pushFollow(FOLLOW_ruleEventHandler_in_entryRuleEventHandler301);
            ruleEventHandler();

            state._fsp--;

             after(grammarAccess.getEventHandlerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventHandler308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEventHandler"


    // $ANTLR start "ruleEventHandler"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:181:1: ruleEventHandler : ( ( rule__EventHandler__Group__0 ) ) ;
    public final void ruleEventHandler() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:185:2: ( ( ( rule__EventHandler__Group__0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:186:1: ( ( rule__EventHandler__Group__0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:186:1: ( ( rule__EventHandler__Group__0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:187:1: ( rule__EventHandler__Group__0 )
            {
             before(grammarAccess.getEventHandlerAccess().getGroup()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:188:1: ( rule__EventHandler__Group__0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:188:2: rule__EventHandler__Group__0
            {
            pushFollow(FOLLOW_rule__EventHandler__Group__0_in_ruleEventHandler334);
            rule__EventHandler__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventHandlerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventHandler"


    // $ANTLR start "entryRuleChangeActuator"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:200:1: entryRuleChangeActuator : ruleChangeActuator EOF ;
    public final void entryRuleChangeActuator() throws RecognitionException {
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:201:1: ( ruleChangeActuator EOF )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:202:1: ruleChangeActuator EOF
            {
             before(grammarAccess.getChangeActuatorRule()); 
            pushFollow(FOLLOW_ruleChangeActuator_in_entryRuleChangeActuator361);
            ruleChangeActuator();

            state._fsp--;

             after(grammarAccess.getChangeActuatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChangeActuator368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChangeActuator"


    // $ANTLR start "ruleChangeActuator"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:209:1: ruleChangeActuator : ( ( rule__ChangeActuator__Group__0 ) ) ;
    public final void ruleChangeActuator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:213:2: ( ( ( rule__ChangeActuator__Group__0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:214:1: ( ( rule__ChangeActuator__Group__0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:214:1: ( ( rule__ChangeActuator__Group__0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:215:1: ( rule__ChangeActuator__Group__0 )
            {
             before(grammarAccess.getChangeActuatorAccess().getGroup()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:216:1: ( rule__ChangeActuator__Group__0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:216:2: rule__ChangeActuator__Group__0
            {
            pushFollow(FOLLOW_rule__ChangeActuator__Group__0_in_ruleChangeActuator394);
            rule__ChangeActuator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChangeActuatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChangeActuator"


    // $ANTLR start "entryRuleSensorListener"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:228:1: entryRuleSensorListener : ruleSensorListener EOF ;
    public final void entryRuleSensorListener() throws RecognitionException {
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:229:1: ( ruleSensorListener EOF )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:230:1: ruleSensorListener EOF
            {
             before(grammarAccess.getSensorListenerRule()); 
            pushFollow(FOLLOW_ruleSensorListener_in_entryRuleSensorListener421);
            ruleSensorListener();

            state._fsp--;

             after(grammarAccess.getSensorListenerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSensorListener428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensorListener"


    // $ANTLR start "ruleSensorListener"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:237:1: ruleSensorListener : ( ( rule__SensorListener__Group__0 ) ) ;
    public final void ruleSensorListener() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:241:2: ( ( ( rule__SensorListener__Group__0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:242:1: ( ( rule__SensorListener__Group__0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:242:1: ( ( rule__SensorListener__Group__0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:243:1: ( rule__SensorListener__Group__0 )
            {
             before(grammarAccess.getSensorListenerAccess().getGroup()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:244:1: ( rule__SensorListener__Group__0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:244:2: rule__SensorListener__Group__0
            {
            pushFollow(FOLLOW_rule__SensorListener__Group__0_in_ruleSensorListener454);
            rule__SensorListener__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorListenerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorListener"


    // $ANTLR start "entryRulePrecondition"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:256:1: entryRulePrecondition : rulePrecondition EOF ;
    public final void entryRulePrecondition() throws RecognitionException {
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:257:1: ( rulePrecondition EOF )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:258:1: rulePrecondition EOF
            {
             before(grammarAccess.getPreconditionRule()); 
            pushFollow(FOLLOW_rulePrecondition_in_entryRulePrecondition481);
            rulePrecondition();

            state._fsp--;

             after(grammarAccess.getPreconditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrecondition488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrecondition"


    // $ANTLR start "rulePrecondition"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:265:1: rulePrecondition : ( ( rule__Precondition__Alternatives ) ) ;
    public final void rulePrecondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:269:2: ( ( ( rule__Precondition__Alternatives ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:270:1: ( ( rule__Precondition__Alternatives ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:270:1: ( ( rule__Precondition__Alternatives ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:271:1: ( rule__Precondition__Alternatives )
            {
             before(grammarAccess.getPreconditionAccess().getAlternatives()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:272:1: ( rule__Precondition__Alternatives )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:272:2: rule__Precondition__Alternatives
            {
            pushFollow(FOLLOW_rule__Precondition__Alternatives_in_rulePrecondition514);
            rule__Precondition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPreconditionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrecondition"


    // $ANTLR start "entryRulePrecondition1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:284:1: entryRulePrecondition1 : rulePrecondition1 EOF ;
    public final void entryRulePrecondition1() throws RecognitionException {
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:285:1: ( rulePrecondition1 EOF )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:286:1: rulePrecondition1 EOF
            {
             before(grammarAccess.getPrecondition1Rule()); 
            pushFollow(FOLLOW_rulePrecondition1_in_entryRulePrecondition1541);
            rulePrecondition1();

            state._fsp--;

             after(grammarAccess.getPrecondition1Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrecondition1548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrecondition1"


    // $ANTLR start "rulePrecondition1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:293:1: rulePrecondition1 : ( ( rule__Precondition1__Alternatives ) ) ;
    public final void rulePrecondition1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:297:2: ( ( ( rule__Precondition1__Alternatives ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:298:1: ( ( rule__Precondition1__Alternatives ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:298:1: ( ( rule__Precondition1__Alternatives ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:299:1: ( rule__Precondition1__Alternatives )
            {
             before(grammarAccess.getPrecondition1Access().getAlternatives()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:300:1: ( rule__Precondition1__Alternatives )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:300:2: rule__Precondition1__Alternatives
            {
            pushFollow(FOLLOW_rule__Precondition1__Alternatives_in_rulePrecondition1574);
            rule__Precondition1__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrecondition1Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrecondition1"


    // $ANTLR start "entryRuleEmptyPrecondition"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:312:1: entryRuleEmptyPrecondition : ruleEmptyPrecondition EOF ;
    public final void entryRuleEmptyPrecondition() throws RecognitionException {
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:313:1: ( ruleEmptyPrecondition EOF )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:314:1: ruleEmptyPrecondition EOF
            {
             before(grammarAccess.getEmptyPreconditionRule()); 
            pushFollow(FOLLOW_ruleEmptyPrecondition_in_entryRuleEmptyPrecondition601);
            ruleEmptyPrecondition();

            state._fsp--;

             after(grammarAccess.getEmptyPreconditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmptyPrecondition608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEmptyPrecondition"


    // $ANTLR start "ruleEmptyPrecondition"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:321:1: ruleEmptyPrecondition : ( ( rule__EmptyPrecondition__NameAssignment ) ) ;
    public final void ruleEmptyPrecondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:325:2: ( ( ( rule__EmptyPrecondition__NameAssignment ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:326:1: ( ( rule__EmptyPrecondition__NameAssignment ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:326:1: ( ( rule__EmptyPrecondition__NameAssignment ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:327:1: ( rule__EmptyPrecondition__NameAssignment )
            {
             before(grammarAccess.getEmptyPreconditionAccess().getNameAssignment()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:328:1: ( rule__EmptyPrecondition__NameAssignment )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:328:2: rule__EmptyPrecondition__NameAssignment
            {
            pushFollow(FOLLOW_rule__EmptyPrecondition__NameAssignment_in_ruleEmptyPrecondition634);
            rule__EmptyPrecondition__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEmptyPreconditionAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmptyPrecondition"


    // $ANTLR start "entryRuleSensorValuePrecondition"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:340:1: entryRuleSensorValuePrecondition : ruleSensorValuePrecondition EOF ;
    public final void entryRuleSensorValuePrecondition() throws RecognitionException {
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:341:1: ( ruleSensorValuePrecondition EOF )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:342:1: ruleSensorValuePrecondition EOF
            {
             before(grammarAccess.getSensorValuePreconditionRule()); 
            pushFollow(FOLLOW_ruleSensorValuePrecondition_in_entryRuleSensorValuePrecondition661);
            ruleSensorValuePrecondition();

            state._fsp--;

             after(grammarAccess.getSensorValuePreconditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSensorValuePrecondition668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensorValuePrecondition"


    // $ANTLR start "ruleSensorValuePrecondition"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:349:1: ruleSensorValuePrecondition : ( ( rule__SensorValuePrecondition__Group__0 ) ) ;
    public final void ruleSensorValuePrecondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:353:2: ( ( ( rule__SensorValuePrecondition__Group__0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:354:1: ( ( rule__SensorValuePrecondition__Group__0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:354:1: ( ( rule__SensorValuePrecondition__Group__0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:355:1: ( rule__SensorValuePrecondition__Group__0 )
            {
             before(grammarAccess.getSensorValuePreconditionAccess().getGroup()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:356:1: ( rule__SensorValuePrecondition__Group__0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:356:2: rule__SensorValuePrecondition__Group__0
            {
            pushFollow(FOLLOW_rule__SensorValuePrecondition__Group__0_in_ruleSensorValuePrecondition694);
            rule__SensorValuePrecondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorValuePreconditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorValuePrecondition"


    // $ANTLR start "entryRulePossibleValues"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:368:1: entryRulePossibleValues : rulePossibleValues EOF ;
    public final void entryRulePossibleValues() throws RecognitionException {
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:369:1: ( rulePossibleValues EOF )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:370:1: rulePossibleValues EOF
            {
             before(grammarAccess.getPossibleValuesRule()); 
            pushFollow(FOLLOW_rulePossibleValues_in_entryRulePossibleValues721);
            rulePossibleValues();

            state._fsp--;

             after(grammarAccess.getPossibleValuesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePossibleValues728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePossibleValues"


    // $ANTLR start "rulePossibleValues"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:377:1: rulePossibleValues : ( ( rule__PossibleValues__Alternatives ) ) ;
    public final void rulePossibleValues() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:381:2: ( ( ( rule__PossibleValues__Alternatives ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:382:1: ( ( rule__PossibleValues__Alternatives ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:382:1: ( ( rule__PossibleValues__Alternatives ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:383:1: ( rule__PossibleValues__Alternatives )
            {
             before(grammarAccess.getPossibleValuesAccess().getAlternatives()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:384:1: ( rule__PossibleValues__Alternatives )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:384:2: rule__PossibleValues__Alternatives
            {
            pushFollow(FOLLOW_rule__PossibleValues__Alternatives_in_rulePossibleValues754);
            rule__PossibleValues__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPossibleValuesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePossibleValues"


    // $ANTLR start "entryRuleTimer"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:396:1: entryRuleTimer : ruleTimer EOF ;
    public final void entryRuleTimer() throws RecognitionException {
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:397:1: ( ruleTimer EOF )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:398:1: ruleTimer EOF
            {
             before(grammarAccess.getTimerRule()); 
            pushFollow(FOLLOW_ruleTimer_in_entryRuleTimer781);
            ruleTimer();

            state._fsp--;

             after(grammarAccess.getTimerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimer788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimer"


    // $ANTLR start "ruleTimer"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:405:1: ruleTimer : ( ( rule__Timer__Group__0 ) ) ;
    public final void ruleTimer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:409:2: ( ( ( rule__Timer__Group__0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:410:1: ( ( rule__Timer__Group__0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:410:1: ( ( rule__Timer__Group__0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:411:1: ( rule__Timer__Group__0 )
            {
             before(grammarAccess.getTimerAccess().getGroup()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:412:1: ( rule__Timer__Group__0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:412:2: rule__Timer__Group__0
            {
            pushFollow(FOLLOW_rule__Timer__Group__0_in_ruleTimer814);
            rule__Timer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimer"


    // $ANTLR start "entryRuleAlarm"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:424:1: entryRuleAlarm : ruleAlarm EOF ;
    public final void entryRuleAlarm() throws RecognitionException {
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:425:1: ( ruleAlarm EOF )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:426:1: ruleAlarm EOF
            {
             before(grammarAccess.getAlarmRule()); 
            pushFollow(FOLLOW_ruleAlarm_in_entryRuleAlarm841);
            ruleAlarm();

            state._fsp--;

             after(grammarAccess.getAlarmRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlarm848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlarm"


    // $ANTLR start "ruleAlarm"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:433:1: ruleAlarm : ( ( rule__Alarm__Group__0 ) ) ;
    public final void ruleAlarm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:437:2: ( ( ( rule__Alarm__Group__0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:438:1: ( ( rule__Alarm__Group__0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:438:1: ( ( rule__Alarm__Group__0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:439:1: ( rule__Alarm__Group__0 )
            {
             before(grammarAccess.getAlarmAccess().getGroup()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:440:1: ( rule__Alarm__Group__0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:440:2: rule__Alarm__Group__0
            {
            pushFollow(FOLLOW_rule__Alarm__Group__0_in_ruleAlarm874);
            rule__Alarm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlarmAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlarm"


    // $ANTLR start "rule__Model__HardwareAlternatives_3_0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:452:1: rule__Model__HardwareAlternatives_3_0 : ( ( 'Arduino UNO' ) | ( 'Raspberry Pi' ) );
    public final void rule__Model__HardwareAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:456:1: ( ( 'Arduino UNO' ) | ( 'Raspberry Pi' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:457:1: ( 'Arduino UNO' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:457:1: ( 'Arduino UNO' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:458:1: 'Arduino UNO'
                    {
                     before(grammarAccess.getModelAccess().getHardwareArduinoUNOKeyword_3_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__Model__HardwareAlternatives_3_0911); 
                     after(grammarAccess.getModelAccess().getHardwareArduinoUNOKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:465:6: ( 'Raspberry Pi' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:465:6: ( 'Raspberry Pi' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:466:1: 'Raspberry Pi'
                    {
                     before(grammarAccess.getModelAccess().getHardwareRaspberryPiKeyword_3_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__Model__HardwareAlternatives_3_0931); 
                     after(grammarAccess.getModelAccess().getHardwareRaspberryPiKeyword_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__HardwareAlternatives_3_0"


    // $ANTLR start "rule__Model__PriorityAlternatives_9_1_0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:478:1: rule__Model__PriorityAlternatives_9_1_0 : ( ( 'SENSOR' ) | ( 'SCHEDULED' ) );
    public final void rule__Model__PriorityAlternatives_9_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:482:1: ( ( 'SENSOR' ) | ( 'SCHEDULED' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:483:1: ( 'SENSOR' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:483:1: ( 'SENSOR' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:484:1: 'SENSOR'
                    {
                     before(grammarAccess.getModelAccess().getPrioritySENSORKeyword_9_1_0_0()); 
                    match(input,14,FOLLOW_14_in_rule__Model__PriorityAlternatives_9_1_0966); 
                     after(grammarAccess.getModelAccess().getPrioritySENSORKeyword_9_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:491:6: ( 'SCHEDULED' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:491:6: ( 'SCHEDULED' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:492:1: 'SCHEDULED'
                    {
                     before(grammarAccess.getModelAccess().getPrioritySCHEDULEDKeyword_9_1_0_1()); 
                    match(input,15,FOLLOW_15_in_rule__Model__PriorityAlternatives_9_1_0986); 
                     after(grammarAccess.getModelAccess().getPrioritySCHEDULEDKeyword_9_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PriorityAlternatives_9_1_0"


    // $ANTLR start "rule__AbstractDevice__Alternatives"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:504:1: rule__AbstractDevice__Alternatives : ( ( ruleSensor ) | ( ruleActuator ) );
    public final void rule__AbstractDevice__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:508:1: ( ( ruleSensor ) | ( ruleActuator ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==37) ) {
                alt3=1;
            }
            else if ( (LA3_0==39) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:509:1: ( ruleSensor )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:509:1: ( ruleSensor )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:510:1: ruleSensor
                    {
                     before(grammarAccess.getAbstractDeviceAccess().getSensorParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSensor_in_rule__AbstractDevice__Alternatives1020);
                    ruleSensor();

                    state._fsp--;

                     after(grammarAccess.getAbstractDeviceAccess().getSensorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:515:6: ( ruleActuator )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:515:6: ( ruleActuator )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:516:1: ruleActuator
                    {
                     before(grammarAccess.getAbstractDeviceAccess().getActuatorParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleActuator_in_rule__AbstractDevice__Alternatives1037);
                    ruleActuator();

                    state._fsp--;

                     after(grammarAccess.getAbstractDeviceAccess().getActuatorParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractDevice__Alternatives"


    // $ANTLR start "rule__ChangeActuator__ActuatorStateAlternatives_2_0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:526:1: rule__ChangeActuator__ActuatorStateAlternatives_2_0 : ( ( 'On' ) | ( 'Off' ) );
    public final void rule__ChangeActuator__ActuatorStateAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:530:1: ( ( 'On' ) | ( 'Off' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:531:1: ( 'On' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:531:1: ( 'On' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:532:1: 'On'
                    {
                     before(grammarAccess.getChangeActuatorAccess().getActuatorStateOnKeyword_2_0_0()); 
                    match(input,16,FOLLOW_16_in_rule__ChangeActuator__ActuatorStateAlternatives_2_01070); 
                     after(grammarAccess.getChangeActuatorAccess().getActuatorStateOnKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:539:6: ( 'Off' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:539:6: ( 'Off' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:540:1: 'Off'
                    {
                     before(grammarAccess.getChangeActuatorAccess().getActuatorStateOffKeyword_2_0_1()); 
                    match(input,17,FOLLOW_17_in_rule__ChangeActuator__ActuatorStateAlternatives_2_01090); 
                     after(grammarAccess.getChangeActuatorAccess().getActuatorStateOffKeyword_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeActuator__ActuatorStateAlternatives_2_0"


    // $ANTLR start "rule__Precondition__Alternatives"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:552:1: rule__Precondition__Alternatives : ( ( ( rule__Precondition__Group_0__0 ) ) | ( ( rule__Precondition__Pre1Assignment_1 ) ) );
    public final void rule__Precondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:556:1: ( ( ( rule__Precondition__Group_0__0 ) ) | ( ( rule__Precondition__Pre1Assignment_1 ) ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:557:1: ( ( rule__Precondition__Group_0__0 ) )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:557:1: ( ( rule__Precondition__Group_0__0 ) )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:558:1: ( rule__Precondition__Group_0__0 )
                    {
                     before(grammarAccess.getPreconditionAccess().getGroup_0()); 
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:559:1: ( rule__Precondition__Group_0__0 )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:559:2: rule__Precondition__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Precondition__Group_0__0_in_rule__Precondition__Alternatives1124);
                    rule__Precondition__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPreconditionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:563:6: ( ( rule__Precondition__Pre1Assignment_1 ) )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:563:6: ( ( rule__Precondition__Pre1Assignment_1 ) )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:564:1: ( rule__Precondition__Pre1Assignment_1 )
                    {
                     before(grammarAccess.getPreconditionAccess().getPre1Assignment_1()); 
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:565:1: ( rule__Precondition__Pre1Assignment_1 )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:565:2: rule__Precondition__Pre1Assignment_1
                    {
                    pushFollow(FOLLOW_rule__Precondition__Pre1Assignment_1_in_rule__Precondition__Alternatives1142);
                    rule__Precondition__Pre1Assignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPreconditionAccess().getPre1Assignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Alternatives"


    // $ANTLR start "rule__Precondition__OpAlternatives_0_1_0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:574:1: rule__Precondition__OpAlternatives_0_1_0 : ( ( '&&' ) | ( '||' ) );
    public final void rule__Precondition__OpAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:578:1: ( ( '&&' ) | ( '||' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:579:1: ( '&&' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:579:1: ( '&&' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:580:1: '&&'
                    {
                     before(grammarAccess.getPreconditionAccess().getOpAmpersandAmpersandKeyword_0_1_0_0()); 
                    match(input,18,FOLLOW_18_in_rule__Precondition__OpAlternatives_0_1_01176); 
                     after(grammarAccess.getPreconditionAccess().getOpAmpersandAmpersandKeyword_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:587:6: ( '||' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:587:6: ( '||' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:588:1: '||'
                    {
                     before(grammarAccess.getPreconditionAccess().getOpVerticalLineVerticalLineKeyword_0_1_0_1()); 
                    match(input,19,FOLLOW_19_in_rule__Precondition__OpAlternatives_0_1_01196); 
                     after(grammarAccess.getPreconditionAccess().getOpVerticalLineVerticalLineKeyword_0_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__OpAlternatives_0_1_0"


    // $ANTLR start "rule__Precondition1__Alternatives"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:600:1: rule__Precondition1__Alternatives : ( ( ( rule__Precondition1__PreAssignment_0 ) ) | ( ( rule__Precondition1__PreAssignment_1 ) ) );
    public final void rule__Precondition1__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:604:1: ( ( ( rule__Precondition1__PreAssignment_0 ) ) | ( ( rule__Precondition1__PreAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EOF||(LA7_1>=18 && LA7_1<=19)) ) {
                    alt7=2;
                }
                else if ( ((LA7_1>=20 && LA7_1<=23)) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:605:1: ( ( rule__Precondition1__PreAssignment_0 ) )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:605:1: ( ( rule__Precondition1__PreAssignment_0 ) )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:606:1: ( rule__Precondition1__PreAssignment_0 )
                    {
                     before(grammarAccess.getPrecondition1Access().getPreAssignment_0()); 
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:607:1: ( rule__Precondition1__PreAssignment_0 )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:607:2: rule__Precondition1__PreAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Precondition1__PreAssignment_0_in_rule__Precondition1__Alternatives1230);
                    rule__Precondition1__PreAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecondition1Access().getPreAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:611:6: ( ( rule__Precondition1__PreAssignment_1 ) )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:611:6: ( ( rule__Precondition1__PreAssignment_1 ) )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:612:1: ( rule__Precondition1__PreAssignment_1 )
                    {
                     before(grammarAccess.getPrecondition1Access().getPreAssignment_1()); 
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:613:1: ( rule__Precondition1__PreAssignment_1 )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:613:2: rule__Precondition1__PreAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Precondition1__PreAssignment_1_in_rule__Precondition1__Alternatives1248);
                    rule__Precondition1__PreAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecondition1Access().getPreAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition1__Alternatives"


    // $ANTLR start "rule__SensorValuePrecondition__CondAlternatives_1_0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:622:1: rule__SensorValuePrecondition__CondAlternatives_1_0 : ( ( '==' ) | ( '<=' ) | ( '>=' ) | ( '!=' ) );
    public final void rule__SensorValuePrecondition__CondAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:626:1: ( ( '==' ) | ( '<=' ) | ( '>=' ) | ( '!=' ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
                }
                break;
            case 23:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:627:1: ( '==' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:627:1: ( '==' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:628:1: '=='
                    {
                     before(grammarAccess.getSensorValuePreconditionAccess().getCondEqualsSignEqualsSignKeyword_1_0_0()); 
                    match(input,20,FOLLOW_20_in_rule__SensorValuePrecondition__CondAlternatives_1_01282); 
                     after(grammarAccess.getSensorValuePreconditionAccess().getCondEqualsSignEqualsSignKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:635:6: ( '<=' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:635:6: ( '<=' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:636:1: '<='
                    {
                     before(grammarAccess.getSensorValuePreconditionAccess().getCondLessThanSignEqualsSignKeyword_1_0_1()); 
                    match(input,21,FOLLOW_21_in_rule__SensorValuePrecondition__CondAlternatives_1_01302); 
                     after(grammarAccess.getSensorValuePreconditionAccess().getCondLessThanSignEqualsSignKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:643:6: ( '>=' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:643:6: ( '>=' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:644:1: '>='
                    {
                     before(grammarAccess.getSensorValuePreconditionAccess().getCondGreaterThanSignEqualsSignKeyword_1_0_2()); 
                    match(input,22,FOLLOW_22_in_rule__SensorValuePrecondition__CondAlternatives_1_01322); 
                     after(grammarAccess.getSensorValuePreconditionAccess().getCondGreaterThanSignEqualsSignKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:651:6: ( '!=' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:651:6: ( '!=' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:652:1: '!='
                    {
                     before(grammarAccess.getSensorValuePreconditionAccess().getCondExclamationMarkEqualsSignKeyword_1_0_3()); 
                    match(input,23,FOLLOW_23_in_rule__SensorValuePrecondition__CondAlternatives_1_01342); 
                     after(grammarAccess.getSensorValuePreconditionAccess().getCondExclamationMarkEqualsSignKeyword_1_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorValuePrecondition__CondAlternatives_1_0"


    // $ANTLR start "rule__PossibleValues__Alternatives"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:664:1: rule__PossibleValues__Alternatives : ( ( RULE_DOUBLE ) | ( RULE_INT ) );
    public final void rule__PossibleValues__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:668:1: ( ( RULE_DOUBLE ) | ( RULE_INT ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_DOUBLE) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_INT) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:669:1: ( RULE_DOUBLE )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:669:1: ( RULE_DOUBLE )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:670:1: RULE_DOUBLE
                    {
                     before(grammarAccess.getPossibleValuesAccess().getDOUBLETerminalRuleCall_0()); 
                    match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__PossibleValues__Alternatives1376); 
                     after(grammarAccess.getPossibleValuesAccess().getDOUBLETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:675:6: ( RULE_INT )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:675:6: ( RULE_INT )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:676:1: RULE_INT
                    {
                     before(grammarAccess.getPossibleValuesAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__PossibleValues__Alternatives1393); 
                     after(grammarAccess.getPossibleValuesAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PossibleValues__Alternatives"


    // $ANTLR start "rule__Timer__RepeattypeAlternatives_3_0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:686:1: rule__Timer__RepeattypeAlternatives_3_0 : ( ( 'ONCE' ) | ( 'EVERY' ) );
    public final void rule__Timer__RepeattypeAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:690:1: ( ( 'ONCE' ) | ( 'EVERY' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            else if ( (LA10_0==25) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:691:1: ( 'ONCE' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:691:1: ( 'ONCE' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:692:1: 'ONCE'
                    {
                     before(grammarAccess.getTimerAccess().getRepeattypeONCEKeyword_3_0_0()); 
                    match(input,24,FOLLOW_24_in_rule__Timer__RepeattypeAlternatives_3_01426); 
                     after(grammarAccess.getTimerAccess().getRepeattypeONCEKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:699:6: ( 'EVERY' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:699:6: ( 'EVERY' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:700:1: 'EVERY'
                    {
                     before(grammarAccess.getTimerAccess().getRepeattypeEVERYKeyword_3_0_1()); 
                    match(input,25,FOLLOW_25_in_rule__Timer__RepeattypeAlternatives_3_01446); 
                     after(grammarAccess.getTimerAccess().getRepeattypeEVERYKeyword_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timer__RepeattypeAlternatives_3_0"


    // $ANTLR start "rule__Alarm__RepeattypeAlternatives_3_0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:712:1: rule__Alarm__RepeattypeAlternatives_3_0 : ( ( 'EVERY DAY' ) | ( 'EVERY MONDAY' ) | ( 'EVERY TUESDAY' ) | ( 'EVERY WEDNESDAY' ) | ( 'EVERY THURSDAY' ) | ( 'EVERY FRIDAY' ) | ( 'EVERY SATURDAY' ) | ( 'EVERY SUNDAY' ) );
    public final void rule__Alarm__RepeattypeAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:716:1: ( ( 'EVERY DAY' ) | ( 'EVERY MONDAY' ) | ( 'EVERY TUESDAY' ) | ( 'EVERY WEDNESDAY' ) | ( 'EVERY THURSDAY' ) | ( 'EVERY FRIDAY' ) | ( 'EVERY SATURDAY' ) | ( 'EVERY SUNDAY' ) )
            int alt11=8;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt11=1;
                }
                break;
            case 27:
                {
                alt11=2;
                }
                break;
            case 28:
                {
                alt11=3;
                }
                break;
            case 29:
                {
                alt11=4;
                }
                break;
            case 30:
                {
                alt11=5;
                }
                break;
            case 31:
                {
                alt11=6;
                }
                break;
            case 32:
                {
                alt11=7;
                }
                break;
            case 33:
                {
                alt11=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:717:1: ( 'EVERY DAY' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:717:1: ( 'EVERY DAY' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:718:1: 'EVERY DAY'
                    {
                     before(grammarAccess.getAlarmAccess().getRepeattypeEVERYDAYKeyword_3_0_0()); 
                    match(input,26,FOLLOW_26_in_rule__Alarm__RepeattypeAlternatives_3_01481); 
                     after(grammarAccess.getAlarmAccess().getRepeattypeEVERYDAYKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:725:6: ( 'EVERY MONDAY' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:725:6: ( 'EVERY MONDAY' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:726:1: 'EVERY MONDAY'
                    {
                     before(grammarAccess.getAlarmAccess().getRepeattypeEVERYMONDAYKeyword_3_0_1()); 
                    match(input,27,FOLLOW_27_in_rule__Alarm__RepeattypeAlternatives_3_01501); 
                     after(grammarAccess.getAlarmAccess().getRepeattypeEVERYMONDAYKeyword_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:733:6: ( 'EVERY TUESDAY' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:733:6: ( 'EVERY TUESDAY' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:734:1: 'EVERY TUESDAY'
                    {
                     before(grammarAccess.getAlarmAccess().getRepeattypeEVERYTUESDAYKeyword_3_0_2()); 
                    match(input,28,FOLLOW_28_in_rule__Alarm__RepeattypeAlternatives_3_01521); 
                     after(grammarAccess.getAlarmAccess().getRepeattypeEVERYTUESDAYKeyword_3_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:741:6: ( 'EVERY WEDNESDAY' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:741:6: ( 'EVERY WEDNESDAY' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:742:1: 'EVERY WEDNESDAY'
                    {
                     before(grammarAccess.getAlarmAccess().getRepeattypeEVERYWEDNESDAYKeyword_3_0_3()); 
                    match(input,29,FOLLOW_29_in_rule__Alarm__RepeattypeAlternatives_3_01541); 
                     after(grammarAccess.getAlarmAccess().getRepeattypeEVERYWEDNESDAYKeyword_3_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:749:6: ( 'EVERY THURSDAY' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:749:6: ( 'EVERY THURSDAY' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:750:1: 'EVERY THURSDAY'
                    {
                     before(grammarAccess.getAlarmAccess().getRepeattypeEVERYTHURSDAYKeyword_3_0_4()); 
                    match(input,30,FOLLOW_30_in_rule__Alarm__RepeattypeAlternatives_3_01561); 
                     after(grammarAccess.getAlarmAccess().getRepeattypeEVERYTHURSDAYKeyword_3_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:757:6: ( 'EVERY FRIDAY' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:757:6: ( 'EVERY FRIDAY' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:758:1: 'EVERY FRIDAY'
                    {
                     before(grammarAccess.getAlarmAccess().getRepeattypeEVERYFRIDAYKeyword_3_0_5()); 
                    match(input,31,FOLLOW_31_in_rule__Alarm__RepeattypeAlternatives_3_01581); 
                     after(grammarAccess.getAlarmAccess().getRepeattypeEVERYFRIDAYKeyword_3_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:765:6: ( 'EVERY SATURDAY' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:765:6: ( 'EVERY SATURDAY' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:766:1: 'EVERY SATURDAY'
                    {
                     before(grammarAccess.getAlarmAccess().getRepeattypeEVERYSATURDAYKeyword_3_0_6()); 
                    match(input,32,FOLLOW_32_in_rule__Alarm__RepeattypeAlternatives_3_01601); 
                     after(grammarAccess.getAlarmAccess().getRepeattypeEVERYSATURDAYKeyword_3_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:773:6: ( 'EVERY SUNDAY' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:773:6: ( 'EVERY SUNDAY' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:774:1: 'EVERY SUNDAY'
                    {
                     before(grammarAccess.getAlarmAccess().getRepeattypeEVERYSUNDAYKeyword_3_0_7()); 
                    match(input,33,FOLLOW_33_in_rule__Alarm__RepeattypeAlternatives_3_01621); 
                     after(grammarAccess.getAlarmAccess().getRepeattypeEVERYSUNDAYKeyword_3_0_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alarm__RepeattypeAlternatives_3_0"


    // $ANTLR start "rule__Model__Group__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:788:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:792:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:793:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01653);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01656);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:800:1: rule__Model__Group__0__Impl : ( 'Sketch:' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:804:1: ( ( 'Sketch:' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:805:1: ( 'Sketch:' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:805:1: ( 'Sketch:' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:806:1: 'Sketch:'
            {
             before(grammarAccess.getModelAccess().getSketchKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Model__Group__0__Impl1684); 
             after(grammarAccess.getModelAccess().getSketchKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:819:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:823:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:824:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11715);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11718);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:831:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:835:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:836:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:836:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:837:1: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:838:1: ( rule__Model__NameAssignment_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:838:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl1745);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:848:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:852:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:853:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21775);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21778);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:860:1: rule__Model__Group__2__Impl : ( 'Hardware:' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:864:1: ( ( 'Hardware:' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:865:1: ( 'Hardware:' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:865:1: ( 'Hardware:' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:866:1: 'Hardware:'
            {
             before(grammarAccess.getModelAccess().getHardwareKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__Model__Group__2__Impl1806); 
             after(grammarAccess.getModelAccess().getHardwareKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:879:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:883:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:884:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31837);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31840);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:891:1: rule__Model__Group__3__Impl : ( ( rule__Model__HardwareAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:895:1: ( ( ( rule__Model__HardwareAssignment_3 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:896:1: ( ( rule__Model__HardwareAssignment_3 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:896:1: ( ( rule__Model__HardwareAssignment_3 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:897:1: ( rule__Model__HardwareAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getHardwareAssignment_3()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:898:1: ( rule__Model__HardwareAssignment_3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:898:2: rule__Model__HardwareAssignment_3
            {
            pushFollow(FOLLOW_rule__Model__HardwareAssignment_3_in_rule__Model__Group__3__Impl1867);
            rule__Model__HardwareAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getHardwareAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:908:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:912:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:913:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41897);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41900);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:920:1: rule__Model__Group__4__Impl : ( ( rule__Model__DevicesAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:924:1: ( ( ( rule__Model__DevicesAssignment_4 )* ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:925:1: ( ( rule__Model__DevicesAssignment_4 )* )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:925:1: ( ( rule__Model__DevicesAssignment_4 )* )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:926:1: ( rule__Model__DevicesAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getDevicesAssignment_4()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:927:1: ( rule__Model__DevicesAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37||LA12_0==39) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:927:2: rule__Model__DevicesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__DevicesAssignment_4_in_rule__Model__Group__4__Impl1927);
            	    rule__Model__DevicesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDevicesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:937:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:941:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:942:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51958);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51961);
            rule__Model__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:949:1: rule__Model__Group__5__Impl : ( ( rule__Model__EventHandlersAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:953:1: ( ( ( rule__Model__EventHandlersAssignment_5 )* ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:954:1: ( ( rule__Model__EventHandlersAssignment_5 )* )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:954:1: ( ( rule__Model__EventHandlersAssignment_5 )* )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:955:1: ( rule__Model__EventHandlersAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getEventHandlersAssignment_5()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:956:1: ( rule__Model__EventHandlersAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==40) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:956:2: rule__Model__EventHandlersAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Model__EventHandlersAssignment_5_in_rule__Model__Group__5__Impl1988);
            	    rule__Model__EventHandlersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getEventHandlersAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:966:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:970:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:971:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__62019);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__7_in_rule__Model__Group__62022);
            rule__Model__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:978:1: rule__Model__Group__6__Impl : ( ( rule__Model__SensorListenersAssignment_6 )* ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:982:1: ( ( ( rule__Model__SensorListenersAssignment_6 )* ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:983:1: ( ( rule__Model__SensorListenersAssignment_6 )* )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:983:1: ( ( rule__Model__SensorListenersAssignment_6 )* )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:984:1: ( rule__Model__SensorListenersAssignment_6 )*
            {
             before(grammarAccess.getModelAccess().getSensorListenersAssignment_6()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:985:1: ( rule__Model__SensorListenersAssignment_6 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==43) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:985:2: rule__Model__SensorListenersAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Model__SensorListenersAssignment_6_in_rule__Model__Group__6__Impl2049);
            	    rule__Model__SensorListenersAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSensorListenersAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:995:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:999:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1000:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__72080);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__8_in_rule__Model__Group__72083);
            rule__Model__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1007:1: rule__Model__Group__7__Impl : ( ( rule__Model__TimersAssignment_7 )* ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1011:1: ( ( ( rule__Model__TimersAssignment_7 )* ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1012:1: ( ( rule__Model__TimersAssignment_7 )* )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1012:1: ( ( rule__Model__TimersAssignment_7 )* )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1013:1: ( rule__Model__TimersAssignment_7 )*
            {
             before(grammarAccess.getModelAccess().getTimersAssignment_7()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1014:1: ( rule__Model__TimersAssignment_7 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==47) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==RULE_ID) ) {
                        int LA15_3 = input.LA(3);

                        if ( (LA15_3==48) ) {
                            int LA15_4 = input.LA(4);

                            if ( ((LA15_4>=24 && LA15_4<=25)) ) {
                                alt15=1;
                            }


                        }


                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1014:2: rule__Model__TimersAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Model__TimersAssignment_7_in_rule__Model__Group__7__Impl2110);
            	    rule__Model__TimersAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTimersAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__Model__Group__8"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1024:1: rule__Model__Group__8 : rule__Model__Group__8__Impl rule__Model__Group__9 ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1028:1: ( rule__Model__Group__8__Impl rule__Model__Group__9 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1029:2: rule__Model__Group__8__Impl rule__Model__Group__9
            {
            pushFollow(FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__82141);
            rule__Model__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__9_in_rule__Model__Group__82144);
            rule__Model__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__8"


    // $ANTLR start "rule__Model__Group__8__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1036:1: rule__Model__Group__8__Impl : ( ( rule__Model__AlarmsAssignment_8 )* ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1040:1: ( ( ( rule__Model__AlarmsAssignment_8 )* ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1041:1: ( ( rule__Model__AlarmsAssignment_8 )* )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1041:1: ( ( rule__Model__AlarmsAssignment_8 )* )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1042:1: ( rule__Model__AlarmsAssignment_8 )*
            {
             before(grammarAccess.getModelAccess().getAlarmsAssignment_8()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1043:1: ( rule__Model__AlarmsAssignment_8 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==47) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1043:2: rule__Model__AlarmsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Model__AlarmsAssignment_8_in_rule__Model__Group__8__Impl2171);
            	    rule__Model__AlarmsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlarmsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__8__Impl"


    // $ANTLR start "rule__Model__Group__9"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1053:1: rule__Model__Group__9 : rule__Model__Group__9__Impl ;
    public final void rule__Model__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1057:1: ( rule__Model__Group__9__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1058:2: rule__Model__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__9__Impl_in_rule__Model__Group__92202);
            rule__Model__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__9"


    // $ANTLR start "rule__Model__Group__9__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1064:1: rule__Model__Group__9__Impl : ( ( rule__Model__Group_9__0 )* ) ;
    public final void rule__Model__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1068:1: ( ( ( rule__Model__Group_9__0 )* ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1069:1: ( ( rule__Model__Group_9__0 )* )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1069:1: ( ( rule__Model__Group_9__0 )* )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1070:1: ( rule__Model__Group_9__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_9()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1071:1: ( rule__Model__Group_9__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==36) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1071:2: rule__Model__Group_9__0
            	    {
            	    pushFollow(FOLLOW_rule__Model__Group_9__0_in_rule__Model__Group__9__Impl2229);
            	    rule__Model__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__9__Impl"


    // $ANTLR start "rule__Model__Group_9__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1101:1: rule__Model__Group_9__0 : rule__Model__Group_9__0__Impl rule__Model__Group_9__1 ;
    public final void rule__Model__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1105:1: ( rule__Model__Group_9__0__Impl rule__Model__Group_9__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1106:2: rule__Model__Group_9__0__Impl rule__Model__Group_9__1
            {
            pushFollow(FOLLOW_rule__Model__Group_9__0__Impl_in_rule__Model__Group_9__02280);
            rule__Model__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_9__1_in_rule__Model__Group_9__02283);
            rule__Model__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_9__0"


    // $ANTLR start "rule__Model__Group_9__0__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1113:1: rule__Model__Group_9__0__Impl : ( 'Concurrency Priority:' ) ;
    public final void rule__Model__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1117:1: ( ( 'Concurrency Priority:' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1118:1: ( 'Concurrency Priority:' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1118:1: ( 'Concurrency Priority:' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1119:1: 'Concurrency Priority:'
            {
             before(grammarAccess.getModelAccess().getConcurrencyPriorityKeyword_9_0()); 
            match(input,36,FOLLOW_36_in_rule__Model__Group_9__0__Impl2311); 
             after(grammarAccess.getModelAccess().getConcurrencyPriorityKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_9__0__Impl"


    // $ANTLR start "rule__Model__Group_9__1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1132:1: rule__Model__Group_9__1 : rule__Model__Group_9__1__Impl ;
    public final void rule__Model__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1136:1: ( rule__Model__Group_9__1__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1137:2: rule__Model__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_9__1__Impl_in_rule__Model__Group_9__12342);
            rule__Model__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_9__1"


    // $ANTLR start "rule__Model__Group_9__1__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1143:1: rule__Model__Group_9__1__Impl : ( ( rule__Model__PriorityAssignment_9_1 ) ) ;
    public final void rule__Model__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1147:1: ( ( ( rule__Model__PriorityAssignment_9_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1148:1: ( ( rule__Model__PriorityAssignment_9_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1148:1: ( ( rule__Model__PriorityAssignment_9_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1149:1: ( rule__Model__PriorityAssignment_9_1 )
            {
             before(grammarAccess.getModelAccess().getPriorityAssignment_9_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1150:1: ( rule__Model__PriorityAssignment_9_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1150:2: rule__Model__PriorityAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Model__PriorityAssignment_9_1_in_rule__Model__Group_9__1__Impl2369);
            rule__Model__PriorityAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPriorityAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_9__1__Impl"


    // $ANTLR start "rule__Sensor__Group__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1164:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1168:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1169:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_rule__Sensor__Group__0__Impl_in_rule__Sensor__Group__02403);
            rule__Sensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sensor__Group__1_in_rule__Sensor__Group__02406);
            rule__Sensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0"


    // $ANTLR start "rule__Sensor__Group__0__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1176:1: rule__Sensor__Group__0__Impl : ( 'Sensor' ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1180:1: ( ( 'Sensor' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1181:1: ( 'Sensor' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1181:1: ( 'Sensor' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1182:1: 'Sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Sensor__Group__0__Impl2434); 
             after(grammarAccess.getSensorAccess().getSensorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0__Impl"


    // $ANTLR start "rule__Sensor__Group__1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1195:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1199:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1200:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
            {
            pushFollow(FOLLOW_rule__Sensor__Group__1__Impl_in_rule__Sensor__Group__12465);
            rule__Sensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sensor__Group__2_in_rule__Sensor__Group__12468);
            rule__Sensor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1"


    // $ANTLR start "rule__Sensor__Group__1__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1207:1: rule__Sensor__Group__1__Impl : ( ( rule__Sensor__NameAssignment_1 ) ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1211:1: ( ( ( rule__Sensor__NameAssignment_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1212:1: ( ( rule__Sensor__NameAssignment_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1212:1: ( ( rule__Sensor__NameAssignment_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1213:1: ( rule__Sensor__NameAssignment_1 )
            {
             before(grammarAccess.getSensorAccess().getNameAssignment_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1214:1: ( rule__Sensor__NameAssignment_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1214:2: rule__Sensor__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Sensor__NameAssignment_1_in_rule__Sensor__Group__1__Impl2495);
            rule__Sensor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1__Impl"


    // $ANTLR start "rule__Sensor__Group__2"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1224:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl rule__Sensor__Group__3 ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1228:1: ( rule__Sensor__Group__2__Impl rule__Sensor__Group__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1229:2: rule__Sensor__Group__2__Impl rule__Sensor__Group__3
            {
            pushFollow(FOLLOW_rule__Sensor__Group__2__Impl_in_rule__Sensor__Group__22525);
            rule__Sensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sensor__Group__3_in_rule__Sensor__Group__22528);
            rule__Sensor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2"


    // $ANTLR start "rule__Sensor__Group__2__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1236:1: rule__Sensor__Group__2__Impl : ( 'pin' ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1240:1: ( ( 'pin' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1241:1: ( 'pin' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1241:1: ( 'pin' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1242:1: 'pin'
            {
             before(grammarAccess.getSensorAccess().getPinKeyword_2()); 
            match(input,38,FOLLOW_38_in_rule__Sensor__Group__2__Impl2556); 
             after(grammarAccess.getSensorAccess().getPinKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2__Impl"


    // $ANTLR start "rule__Sensor__Group__3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1255:1: rule__Sensor__Group__3 : rule__Sensor__Group__3__Impl ;
    public final void rule__Sensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1259:1: ( rule__Sensor__Group__3__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1260:2: rule__Sensor__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Sensor__Group__3__Impl_in_rule__Sensor__Group__32587);
            rule__Sensor__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__3"


    // $ANTLR start "rule__Sensor__Group__3__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1266:1: rule__Sensor__Group__3__Impl : ( ( rule__Sensor__PinAssignment_3 ) ) ;
    public final void rule__Sensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1270:1: ( ( ( rule__Sensor__PinAssignment_3 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1271:1: ( ( rule__Sensor__PinAssignment_3 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1271:1: ( ( rule__Sensor__PinAssignment_3 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1272:1: ( rule__Sensor__PinAssignment_3 )
            {
             before(grammarAccess.getSensorAccess().getPinAssignment_3()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1273:1: ( rule__Sensor__PinAssignment_3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1273:2: rule__Sensor__PinAssignment_3
            {
            pushFollow(FOLLOW_rule__Sensor__PinAssignment_3_in_rule__Sensor__Group__3__Impl2614);
            rule__Sensor__PinAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getPinAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__3__Impl"


    // $ANTLR start "rule__Actuator__Group__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1291:1: rule__Actuator__Group__0 : rule__Actuator__Group__0__Impl rule__Actuator__Group__1 ;
    public final void rule__Actuator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1295:1: ( rule__Actuator__Group__0__Impl rule__Actuator__Group__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1296:2: rule__Actuator__Group__0__Impl rule__Actuator__Group__1
            {
            pushFollow(FOLLOW_rule__Actuator__Group__0__Impl_in_rule__Actuator__Group__02652);
            rule__Actuator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Actuator__Group__1_in_rule__Actuator__Group__02655);
            rule__Actuator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__0"


    // $ANTLR start "rule__Actuator__Group__0__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1303:1: rule__Actuator__Group__0__Impl : ( 'Actuator' ) ;
    public final void rule__Actuator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1307:1: ( ( 'Actuator' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1308:1: ( 'Actuator' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1308:1: ( 'Actuator' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1309:1: 'Actuator'
            {
             before(grammarAccess.getActuatorAccess().getActuatorKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Actuator__Group__0__Impl2683); 
             after(grammarAccess.getActuatorAccess().getActuatorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__0__Impl"


    // $ANTLR start "rule__Actuator__Group__1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1322:1: rule__Actuator__Group__1 : rule__Actuator__Group__1__Impl rule__Actuator__Group__2 ;
    public final void rule__Actuator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1326:1: ( rule__Actuator__Group__1__Impl rule__Actuator__Group__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1327:2: rule__Actuator__Group__1__Impl rule__Actuator__Group__2
            {
            pushFollow(FOLLOW_rule__Actuator__Group__1__Impl_in_rule__Actuator__Group__12714);
            rule__Actuator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Actuator__Group__2_in_rule__Actuator__Group__12717);
            rule__Actuator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__1"


    // $ANTLR start "rule__Actuator__Group__1__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1334:1: rule__Actuator__Group__1__Impl : ( ( rule__Actuator__NameAssignment_1 ) ) ;
    public final void rule__Actuator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1338:1: ( ( ( rule__Actuator__NameAssignment_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1339:1: ( ( rule__Actuator__NameAssignment_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1339:1: ( ( rule__Actuator__NameAssignment_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1340:1: ( rule__Actuator__NameAssignment_1 )
            {
             before(grammarAccess.getActuatorAccess().getNameAssignment_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1341:1: ( rule__Actuator__NameAssignment_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1341:2: rule__Actuator__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Actuator__NameAssignment_1_in_rule__Actuator__Group__1__Impl2744);
            rule__Actuator__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__1__Impl"


    // $ANTLR start "rule__Actuator__Group__2"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1351:1: rule__Actuator__Group__2 : rule__Actuator__Group__2__Impl rule__Actuator__Group__3 ;
    public final void rule__Actuator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1355:1: ( rule__Actuator__Group__2__Impl rule__Actuator__Group__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1356:2: rule__Actuator__Group__2__Impl rule__Actuator__Group__3
            {
            pushFollow(FOLLOW_rule__Actuator__Group__2__Impl_in_rule__Actuator__Group__22774);
            rule__Actuator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Actuator__Group__3_in_rule__Actuator__Group__22777);
            rule__Actuator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__2"


    // $ANTLR start "rule__Actuator__Group__2__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1363:1: rule__Actuator__Group__2__Impl : ( 'pin' ) ;
    public final void rule__Actuator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1367:1: ( ( 'pin' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1368:1: ( 'pin' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1368:1: ( 'pin' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1369:1: 'pin'
            {
             before(grammarAccess.getActuatorAccess().getPinKeyword_2()); 
            match(input,38,FOLLOW_38_in_rule__Actuator__Group__2__Impl2805); 
             after(grammarAccess.getActuatorAccess().getPinKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__2__Impl"


    // $ANTLR start "rule__Actuator__Group__3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1382:1: rule__Actuator__Group__3 : rule__Actuator__Group__3__Impl ;
    public final void rule__Actuator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1386:1: ( rule__Actuator__Group__3__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1387:2: rule__Actuator__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Actuator__Group__3__Impl_in_rule__Actuator__Group__32836);
            rule__Actuator__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__3"


    // $ANTLR start "rule__Actuator__Group__3__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1393:1: rule__Actuator__Group__3__Impl : ( ( rule__Actuator__PinAssignment_3 ) ) ;
    public final void rule__Actuator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1397:1: ( ( ( rule__Actuator__PinAssignment_3 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1398:1: ( ( rule__Actuator__PinAssignment_3 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1398:1: ( ( rule__Actuator__PinAssignment_3 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1399:1: ( rule__Actuator__PinAssignment_3 )
            {
             before(grammarAccess.getActuatorAccess().getPinAssignment_3()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1400:1: ( rule__Actuator__PinAssignment_3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1400:2: rule__Actuator__PinAssignment_3
            {
            pushFollow(FOLLOW_rule__Actuator__PinAssignment_3_in_rule__Actuator__Group__3__Impl2863);
            rule__Actuator__PinAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getPinAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__3__Impl"


    // $ANTLR start "rule__EventHandler__Group__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1418:1: rule__EventHandler__Group__0 : rule__EventHandler__Group__0__Impl rule__EventHandler__Group__1 ;
    public final void rule__EventHandler__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1422:1: ( rule__EventHandler__Group__0__Impl rule__EventHandler__Group__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1423:2: rule__EventHandler__Group__0__Impl rule__EventHandler__Group__1
            {
            pushFollow(FOLLOW_rule__EventHandler__Group__0__Impl_in_rule__EventHandler__Group__02901);
            rule__EventHandler__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventHandler__Group__1_in_rule__EventHandler__Group__02904);
            rule__EventHandler__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventHandler__Group__0"


    // $ANTLR start "rule__EventHandler__Group__0__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1430:1: rule__EventHandler__Group__0__Impl : ( 'EventHandler' ) ;
    public final void rule__EventHandler__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1434:1: ( ( 'EventHandler' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1435:1: ( 'EventHandler' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1435:1: ( 'EventHandler' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1436:1: 'EventHandler'
            {
             before(grammarAccess.getEventHandlerAccess().getEventHandlerKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__EventHandler__Group__0__Impl2932); 
             after(grammarAccess.getEventHandlerAccess().getEventHandlerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventHandler__Group__0__Impl"


    // $ANTLR start "rule__EventHandler__Group__1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1449:1: rule__EventHandler__Group__1 : rule__EventHandler__Group__1__Impl rule__EventHandler__Group__2 ;
    public final void rule__EventHandler__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1453:1: ( rule__EventHandler__Group__1__Impl rule__EventHandler__Group__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1454:2: rule__EventHandler__Group__1__Impl rule__EventHandler__Group__2
            {
            pushFollow(FOLLOW_rule__EventHandler__Group__1__Impl_in_rule__EventHandler__Group__12963);
            rule__EventHandler__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventHandler__Group__2_in_rule__EventHandler__Group__12966);
            rule__EventHandler__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventHandler__Group__1"


    // $ANTLR start "rule__EventHandler__Group__1__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1461:1: rule__EventHandler__Group__1__Impl : ( ( rule__EventHandler__NameAssignment_1 ) ) ;
    public final void rule__EventHandler__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1465:1: ( ( ( rule__EventHandler__NameAssignment_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1466:1: ( ( rule__EventHandler__NameAssignment_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1466:1: ( ( rule__EventHandler__NameAssignment_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1467:1: ( rule__EventHandler__NameAssignment_1 )
            {
             before(grammarAccess.getEventHandlerAccess().getNameAssignment_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1468:1: ( rule__EventHandler__NameAssignment_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1468:2: rule__EventHandler__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EventHandler__NameAssignment_1_in_rule__EventHandler__Group__1__Impl2993);
            rule__EventHandler__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEventHandlerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventHandler__Group__1__Impl"


    // $ANTLR start "rule__EventHandler__Group__2"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1478:1: rule__EventHandler__Group__2 : rule__EventHandler__Group__2__Impl rule__EventHandler__Group__3 ;
    public final void rule__EventHandler__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1482:1: ( rule__EventHandler__Group__2__Impl rule__EventHandler__Group__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1483:2: rule__EventHandler__Group__2__Impl rule__EventHandler__Group__3
            {
            pushFollow(FOLLOW_rule__EventHandler__Group__2__Impl_in_rule__EventHandler__Group__23023);
            rule__EventHandler__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventHandler__Group__3_in_rule__EventHandler__Group__23026);
            rule__EventHandler__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventHandler__Group__2"


    // $ANTLR start "rule__EventHandler__Group__2__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1490:1: rule__EventHandler__Group__2__Impl : ( ( rule__EventHandler__ChangeActuatorsAssignment_2 )* ) ;
    public final void rule__EventHandler__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1494:1: ( ( ( rule__EventHandler__ChangeActuatorsAssignment_2 )* ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1495:1: ( ( rule__EventHandler__ChangeActuatorsAssignment_2 )* )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1495:1: ( ( rule__EventHandler__ChangeActuatorsAssignment_2 )* )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1496:1: ( rule__EventHandler__ChangeActuatorsAssignment_2 )*
            {
             before(grammarAccess.getEventHandlerAccess().getChangeActuatorsAssignment_2()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1497:1: ( rule__EventHandler__ChangeActuatorsAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1497:2: rule__EventHandler__ChangeActuatorsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__EventHandler__ChangeActuatorsAssignment_2_in_rule__EventHandler__Group__2__Impl3053);
            	    rule__EventHandler__ChangeActuatorsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getEventHandlerAccess().getChangeActuatorsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventHandler__Group__2__Impl"


    // $ANTLR start "rule__EventHandler__Group__3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1507:1: rule__EventHandler__Group__3 : rule__EventHandler__Group__3__Impl ;
    public final void rule__EventHandler__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1511:1: ( rule__EventHandler__Group__3__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1512:2: rule__EventHandler__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EventHandler__Group__3__Impl_in_rule__EventHandler__Group__33084);
            rule__EventHandler__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventHandler__Group__3"


    // $ANTLR start "rule__EventHandler__Group__3__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1518:1: rule__EventHandler__Group__3__Impl : ( ';' ) ;
    public final void rule__EventHandler__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1522:1: ( ( ';' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1523:1: ( ';' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1523:1: ( ';' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1524:1: ';'
            {
             before(grammarAccess.getEventHandlerAccess().getSemicolonKeyword_3()); 
            match(input,41,FOLLOW_41_in_rule__EventHandler__Group__3__Impl3112); 
             after(grammarAccess.getEventHandlerAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventHandler__Group__3__Impl"


    // $ANTLR start "rule__ChangeActuator__Group__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1545:1: rule__ChangeActuator__Group__0 : rule__ChangeActuator__Group__0__Impl rule__ChangeActuator__Group__1 ;
    public final void rule__ChangeActuator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1549:1: ( rule__ChangeActuator__Group__0__Impl rule__ChangeActuator__Group__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1550:2: rule__ChangeActuator__Group__0__Impl rule__ChangeActuator__Group__1
            {
            pushFollow(FOLLOW_rule__ChangeActuator__Group__0__Impl_in_rule__ChangeActuator__Group__03151);
            rule__ChangeActuator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChangeActuator__Group__1_in_rule__ChangeActuator__Group__03154);
            rule__ChangeActuator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeActuator__Group__0"


    // $ANTLR start "rule__ChangeActuator__Group__0__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1557:1: rule__ChangeActuator__Group__0__Impl : ( ( rule__ChangeActuator__ActuatorAssignment_0 ) ) ;
    public final void rule__ChangeActuator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1561:1: ( ( ( rule__ChangeActuator__ActuatorAssignment_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1562:1: ( ( rule__ChangeActuator__ActuatorAssignment_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1562:1: ( ( rule__ChangeActuator__ActuatorAssignment_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1563:1: ( rule__ChangeActuator__ActuatorAssignment_0 )
            {
             before(grammarAccess.getChangeActuatorAccess().getActuatorAssignment_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1564:1: ( rule__ChangeActuator__ActuatorAssignment_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1564:2: rule__ChangeActuator__ActuatorAssignment_0
            {
            pushFollow(FOLLOW_rule__ChangeActuator__ActuatorAssignment_0_in_rule__ChangeActuator__Group__0__Impl3181);
            rule__ChangeActuator__ActuatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getChangeActuatorAccess().getActuatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeActuator__Group__0__Impl"


    // $ANTLR start "rule__ChangeActuator__Group__1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1574:1: rule__ChangeActuator__Group__1 : rule__ChangeActuator__Group__1__Impl rule__ChangeActuator__Group__2 ;
    public final void rule__ChangeActuator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1578:1: ( rule__ChangeActuator__Group__1__Impl rule__ChangeActuator__Group__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1579:2: rule__ChangeActuator__Group__1__Impl rule__ChangeActuator__Group__2
            {
            pushFollow(FOLLOW_rule__ChangeActuator__Group__1__Impl_in_rule__ChangeActuator__Group__13211);
            rule__ChangeActuator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChangeActuator__Group__2_in_rule__ChangeActuator__Group__13214);
            rule__ChangeActuator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeActuator__Group__1"


    // $ANTLR start "rule__ChangeActuator__Group__1__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1586:1: rule__ChangeActuator__Group__1__Impl : ( ':' ) ;
    public final void rule__ChangeActuator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1590:1: ( ( ':' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1591:1: ( ':' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1591:1: ( ':' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1592:1: ':'
            {
             before(grammarAccess.getChangeActuatorAccess().getColonKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__ChangeActuator__Group__1__Impl3242); 
             after(grammarAccess.getChangeActuatorAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeActuator__Group__1__Impl"


    // $ANTLR start "rule__ChangeActuator__Group__2"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1605:1: rule__ChangeActuator__Group__2 : rule__ChangeActuator__Group__2__Impl ;
    public final void rule__ChangeActuator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1609:1: ( rule__ChangeActuator__Group__2__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1610:2: rule__ChangeActuator__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ChangeActuator__Group__2__Impl_in_rule__ChangeActuator__Group__23273);
            rule__ChangeActuator__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeActuator__Group__2"


    // $ANTLR start "rule__ChangeActuator__Group__2__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1616:1: rule__ChangeActuator__Group__2__Impl : ( ( rule__ChangeActuator__ActuatorStateAssignment_2 ) ) ;
    public final void rule__ChangeActuator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1620:1: ( ( ( rule__ChangeActuator__ActuatorStateAssignment_2 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1621:1: ( ( rule__ChangeActuator__ActuatorStateAssignment_2 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1621:1: ( ( rule__ChangeActuator__ActuatorStateAssignment_2 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1622:1: ( rule__ChangeActuator__ActuatorStateAssignment_2 )
            {
             before(grammarAccess.getChangeActuatorAccess().getActuatorStateAssignment_2()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1623:1: ( rule__ChangeActuator__ActuatorStateAssignment_2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1623:2: rule__ChangeActuator__ActuatorStateAssignment_2
            {
            pushFollow(FOLLOW_rule__ChangeActuator__ActuatorStateAssignment_2_in_rule__ChangeActuator__Group__2__Impl3300);
            rule__ChangeActuator__ActuatorStateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChangeActuatorAccess().getActuatorStateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeActuator__Group__2__Impl"


    // $ANTLR start "rule__SensorListener__Group__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1639:1: rule__SensorListener__Group__0 : rule__SensorListener__Group__0__Impl rule__SensorListener__Group__1 ;
    public final void rule__SensorListener__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1643:1: ( rule__SensorListener__Group__0__Impl rule__SensorListener__Group__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1644:2: rule__SensorListener__Group__0__Impl rule__SensorListener__Group__1
            {
            pushFollow(FOLLOW_rule__SensorListener__Group__0__Impl_in_rule__SensorListener__Group__03336);
            rule__SensorListener__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorListener__Group__1_in_rule__SensorListener__Group__03339);
            rule__SensorListener__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorListener__Group__0"


    // $ANTLR start "rule__SensorListener__Group__0__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1651:1: rule__SensorListener__Group__0__Impl : ( 'SensorListener' ) ;
    public final void rule__SensorListener__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1655:1: ( ( 'SensorListener' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1656:1: ( 'SensorListener' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1656:1: ( 'SensorListener' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1657:1: 'SensorListener'
            {
             before(grammarAccess.getSensorListenerAccess().getSensorListenerKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__SensorListener__Group__0__Impl3367); 
             after(grammarAccess.getSensorListenerAccess().getSensorListenerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorListener__Group__0__Impl"


    // $ANTLR start "rule__SensorListener__Group__1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1670:1: rule__SensorListener__Group__1 : rule__SensorListener__Group__1__Impl rule__SensorListener__Group__2 ;
    public final void rule__SensorListener__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1674:1: ( rule__SensorListener__Group__1__Impl rule__SensorListener__Group__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1675:2: rule__SensorListener__Group__1__Impl rule__SensorListener__Group__2
            {
            pushFollow(FOLLOW_rule__SensorListener__Group__1__Impl_in_rule__SensorListener__Group__13398);
            rule__SensorListener__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorListener__Group__2_in_rule__SensorListener__Group__13401);
            rule__SensorListener__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorListener__Group__1"


    // $ANTLR start "rule__SensorListener__Group__1__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1682:1: rule__SensorListener__Group__1__Impl : ( ( rule__SensorListener__SensorAssignment_1 ) ) ;
    public final void rule__SensorListener__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1686:1: ( ( ( rule__SensorListener__SensorAssignment_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1687:1: ( ( rule__SensorListener__SensorAssignment_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1687:1: ( ( rule__SensorListener__SensorAssignment_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1688:1: ( rule__SensorListener__SensorAssignment_1 )
            {
             before(grammarAccess.getSensorListenerAccess().getSensorAssignment_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1689:1: ( rule__SensorListener__SensorAssignment_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1689:2: rule__SensorListener__SensorAssignment_1
            {
            pushFollow(FOLLOW_rule__SensorListener__SensorAssignment_1_in_rule__SensorListener__Group__1__Impl3428);
            rule__SensorListener__SensorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorListenerAccess().getSensorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorListener__Group__1__Impl"


    // $ANTLR start "rule__SensorListener__Group__2"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1699:1: rule__SensorListener__Group__2 : rule__SensorListener__Group__2__Impl rule__SensorListener__Group__3 ;
    public final void rule__SensorListener__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1703:1: ( rule__SensorListener__Group__2__Impl rule__SensorListener__Group__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1704:2: rule__SensorListener__Group__2__Impl rule__SensorListener__Group__3
            {
            pushFollow(FOLLOW_rule__SensorListener__Group__2__Impl_in_rule__SensorListener__Group__23458);
            rule__SensorListener__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorListener__Group__3_in_rule__SensorListener__Group__23461);
            rule__SensorListener__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorListener__Group__2"


    // $ANTLR start "rule__SensorListener__Group__2__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1711:1: rule__SensorListener__Group__2__Impl : ( 'if' ) ;
    public final void rule__SensorListener__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1715:1: ( ( 'if' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1716:1: ( 'if' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1716:1: ( 'if' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1717:1: 'if'
            {
             before(grammarAccess.getSensorListenerAccess().getIfKeyword_2()); 
            match(input,44,FOLLOW_44_in_rule__SensorListener__Group__2__Impl3489); 
             after(grammarAccess.getSensorListenerAccess().getIfKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorListener__Group__2__Impl"


    // $ANTLR start "rule__SensorListener__Group__3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1730:1: rule__SensorListener__Group__3 : rule__SensorListener__Group__3__Impl rule__SensorListener__Group__4 ;
    public final void rule__SensorListener__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1734:1: ( rule__SensorListener__Group__3__Impl rule__SensorListener__Group__4 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1735:2: rule__SensorListener__Group__3__Impl rule__SensorListener__Group__4
            {
            pushFollow(FOLLOW_rule__SensorListener__Group__3__Impl_in_rule__SensorListener__Group__33520);
            rule__SensorListener__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorListener__Group__4_in_rule__SensorListener__Group__33523);
            rule__SensorListener__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorListener__Group__3"


    // $ANTLR start "rule__SensorListener__Group__3__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1742:1: rule__SensorListener__Group__3__Impl : ( ( rule__SensorListener__Group_3__0 ) ) ;
    public final void rule__SensorListener__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1746:1: ( ( ( rule__SensorListener__Group_3__0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1747:1: ( ( rule__SensorListener__Group_3__0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1747:1: ( ( rule__SensorListener__Group_3__0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1748:1: ( rule__SensorListener__Group_3__0 )
            {
             before(grammarAccess.getSensorListenerAccess().getGroup_3()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1749:1: ( rule__SensorListener__Group_3__0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1749:2: rule__SensorListener__Group_3__0
            {
            pushFollow(FOLLOW_rule__SensorListener__Group_3__0_in_rule__SensorListener__Group__3__Impl3550);
            rule__SensorListener__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorListenerAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorListener__Group__3__Impl"


    // $ANTLR start "rule__SensorListener__Group__4"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1759:1: rule__SensorListener__Group__4 : rule__SensorListener__Group__4__Impl rule__SensorListener__Group__5 ;
    public final void rule__SensorListener__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1763:1: ( rule__SensorListener__Group__4__Impl rule__SensorListener__Group__5 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1764:2: rule__SensorListener__Group__4__Impl rule__SensorListener__Group__5
            {
            pushFollow(FOLLOW_rule__SensorListener__Group__4__Impl_in_rule__SensorListener__Group__43580);
            rule__SensorListener__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorListener__Group__5_in_rule__SensorListener__Group__43583);
            rule__SensorListener__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorListener__Group__4"


    // $ANTLR start "rule__SensorListener__Group__4__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1771:1: rule__SensorListener__Group__4__Impl : ( 'call' ) ;
    public final void rule__SensorListener__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1775:1: ( ( 'call' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1776:1: ( 'call' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1776:1: ( 'call' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1777:1: 'call'
            {
             before(grammarAccess.getSensorListenerAccess().getCallKeyword_4()); 
            match(input,45,FOLLOW_45_in_rule__SensorListener__Group__4__Impl3611); 
             after(grammarAccess.getSensorListenerAccess().getCallKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorListener__Group__4__Impl"


    // $ANTLR start "rule__SensorListener__Group__5"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1790:1: rule__SensorListener__Group__5 : rule__SensorListener__Group__5__Impl ;
    public final void rule__SensorListener__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1794:1: ( rule__SensorListener__Group__5__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1795:2: rule__SensorListener__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SensorListener__Group__5__Impl_in_rule__SensorListener__Group__53642);
            rule__SensorListener__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorListener__Group__5"


    // $ANTLR start "rule__SensorListener__Group__5__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1801:1: rule__SensorListener__Group__5__Impl : ( ( rule__SensorListener__EventHandlerAssignment_5 ) ) ;
    public final void rule__SensorListener__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1805:1: ( ( ( rule__SensorListener__EventHandlerAssignment_5 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1806:1: ( ( rule__SensorListener__EventHandlerAssignment_5 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1806:1: ( ( rule__SensorListener__EventHandlerAssignment_5 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1807:1: ( rule__SensorListener__EventHandlerAssignment_5 )
            {
             before(grammarAccess.getSensorListenerAccess().getEventHandlerAssignment_5()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1808:1: ( rule__SensorListener__EventHandlerAssignment_5 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1808:2: rule__SensorListener__EventHandlerAssignment_5
            {
            pushFollow(FOLLOW_rule__SensorListener__EventHandlerAssignment_5_in_rule__SensorListener__Group__5__Impl3669);
            rule__SensorListener__EventHandlerAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSensorListenerAccess().getEventHandlerAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorListener__Group__5__Impl"


    // $ANTLR start "rule__SensorListener__Group_3__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1830:1: rule__SensorListener__Group_3__0 : rule__SensorListener__Group_3__0__Impl rule__SensorListener__Group_3__1 ;
    public final void rule__SensorListener__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1834:1: ( rule__SensorListener__Group_3__0__Impl rule__SensorListener__Group_3__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1835:2: rule__SensorListener__Group_3__0__Impl rule__SensorListener__Group_3__1
            {
            pushFollow(FOLLOW_rule__SensorListener__Group_3__0__Impl_in_rule__SensorListener__Group_3__03711);
            rule__SensorListener__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorListener__Group_3__1_in_rule__SensorListener__Group_3__03714);
            rule__SensorListener__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorListener__Group_3__0"


    // $ANTLR start "rule__SensorListener__Group_3__0__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1842:1: rule__SensorListener__Group_3__0__Impl : ( ( rule__SensorListener__TypeAssignment_3_0 ) ) ;
    public final void rule__SensorListener__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1846:1: ( ( ( rule__SensorListener__TypeAssignment_3_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1847:1: ( ( rule__SensorListener__TypeAssignment_3_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1847:1: ( ( rule__SensorListener__TypeAssignment_3_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1848:1: ( rule__SensorListener__TypeAssignment_3_0 )
            {
             before(grammarAccess.getSensorListenerAccess().getTypeAssignment_3_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1849:1: ( rule__SensorListener__TypeAssignment_3_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1849:2: rule__SensorListener__TypeAssignment_3_0
            {
            pushFollow(FOLLOW_rule__SensorListener__TypeAssignment_3_0_in_rule__SensorListener__Group_3__0__Impl3741);
            rule__SensorListener__TypeAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getSensorListenerAccess().getTypeAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorListener__Group_3__0__Impl"


    // $ANTLR start "rule__SensorListener__Group_3__1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1859:1: rule__SensorListener__Group_3__1 : rule__SensorListener__Group_3__1__Impl rule__SensorListener__Group_3__2 ;
    public final void rule__SensorListener__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1863:1: ( rule__SensorListener__Group_3__1__Impl rule__SensorListener__Group_3__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1864:2: rule__SensorListener__Group_3__1__Impl rule__SensorListener__Group_3__2
            {
            pushFollow(FOLLOW_rule__SensorListener__Group_3__1__Impl_in_rule__SensorListener__Group_3__13771);
            rule__SensorListener__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorListener__Group_3__2_in_rule__SensorListener__Group_3__13774);
            rule__SensorListener__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorListener__Group_3__1"


    // $ANTLR start "rule__SensorListener__Group_3__1__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1871:1: rule__SensorListener__Group_3__1__Impl : ( ( rule__SensorListener__LAssignment_3_1 ) ) ;
    public final void rule__SensorListener__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1875:1: ( ( ( rule__SensorListener__LAssignment_3_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1876:1: ( ( rule__SensorListener__LAssignment_3_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1876:1: ( ( rule__SensorListener__LAssignment_3_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1877:1: ( rule__SensorListener__LAssignment_3_1 )
            {
             before(grammarAccess.getSensorListenerAccess().getLAssignment_3_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1878:1: ( rule__SensorListener__LAssignment_3_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1878:2: rule__SensorListener__LAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SensorListener__LAssignment_3_1_in_rule__SensorListener__Group_3__1__Impl3801);
            rule__SensorListener__LAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorListenerAccess().getLAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorListener__Group_3__1__Impl"


    // $ANTLR start "rule__SensorListener__Group_3__2"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1888:1: rule__SensorListener__Group_3__2 : rule__SensorListener__Group_3__2__Impl rule__SensorListener__Group_3__3 ;
    public final void rule__SensorListener__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1892:1: ( rule__SensorListener__Group_3__2__Impl rule__SensorListener__Group_3__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1893:2: rule__SensorListener__Group_3__2__Impl rule__SensorListener__Group_3__3
            {
            pushFollow(FOLLOW_rule__SensorListener__Group_3__2__Impl_in_rule__SensorListener__Group_3__23831);
            rule__SensorListener__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorListener__Group_3__3_in_rule__SensorListener__Group_3__23834);
            rule__SensorListener__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorListener__Group_3__2"


    // $ANTLR start "rule__SensorListener__Group_3__2__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1900:1: rule__SensorListener__Group_3__2__Impl : ( 'AND' ) ;
    public final void rule__SensorListener__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1904:1: ( ( 'AND' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1905:1: ( 'AND' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1905:1: ( 'AND' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1906:1: 'AND'
            {
             before(grammarAccess.getSensorListenerAccess().getANDKeyword_3_2()); 
            match(input,46,FOLLOW_46_in_rule__SensorListener__Group_3__2__Impl3862); 
             after(grammarAccess.getSensorListenerAccess().getANDKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorListener__Group_3__2__Impl"


    // $ANTLR start "rule__SensorListener__Group_3__3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1919:1: rule__SensorListener__Group_3__3 : rule__SensorListener__Group_3__3__Impl ;
    public final void rule__SensorListener__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1923:1: ( rule__SensorListener__Group_3__3__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1924:2: rule__SensorListener__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__SensorListener__Group_3__3__Impl_in_rule__SensorListener__Group_3__33893);
            rule__SensorListener__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorListener__Group_3__3"


    // $ANTLR start "rule__SensorListener__Group_3__3__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1930:1: rule__SensorListener__Group_3__3__Impl : ( ( rule__SensorListener__HAssignment_3_3 ) ) ;
    public final void rule__SensorListener__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1934:1: ( ( ( rule__SensorListener__HAssignment_3_3 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1935:1: ( ( rule__SensorListener__HAssignment_3_3 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1935:1: ( ( rule__SensorListener__HAssignment_3_3 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1936:1: ( rule__SensorListener__HAssignment_3_3 )
            {
             before(grammarAccess.getSensorListenerAccess().getHAssignment_3_3()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1937:1: ( rule__SensorListener__HAssignment_3_3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1937:2: rule__SensorListener__HAssignment_3_3
            {
            pushFollow(FOLLOW_rule__SensorListener__HAssignment_3_3_in_rule__SensorListener__Group_3__3__Impl3920);
            rule__SensorListener__HAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getSensorListenerAccess().getHAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorListener__Group_3__3__Impl"


    // $ANTLR start "rule__Precondition__Group_0__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1955:1: rule__Precondition__Group_0__0 : rule__Precondition__Group_0__0__Impl rule__Precondition__Group_0__1 ;
    public final void rule__Precondition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1959:1: ( rule__Precondition__Group_0__0__Impl rule__Precondition__Group_0__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1960:2: rule__Precondition__Group_0__0__Impl rule__Precondition__Group_0__1
            {
            pushFollow(FOLLOW_rule__Precondition__Group_0__0__Impl_in_rule__Precondition__Group_0__03958);
            rule__Precondition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precondition__Group_0__1_in_rule__Precondition__Group_0__03961);
            rule__Precondition__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group_0__0"


    // $ANTLR start "rule__Precondition__Group_0__0__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1967:1: rule__Precondition__Group_0__0__Impl : ( ( rule__Precondition__Pre1Assignment_0_0 ) ) ;
    public final void rule__Precondition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1971:1: ( ( ( rule__Precondition__Pre1Assignment_0_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1972:1: ( ( rule__Precondition__Pre1Assignment_0_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1972:1: ( ( rule__Precondition__Pre1Assignment_0_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1973:1: ( rule__Precondition__Pre1Assignment_0_0 )
            {
             before(grammarAccess.getPreconditionAccess().getPre1Assignment_0_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1974:1: ( rule__Precondition__Pre1Assignment_0_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1974:2: rule__Precondition__Pre1Assignment_0_0
            {
            pushFollow(FOLLOW_rule__Precondition__Pre1Assignment_0_0_in_rule__Precondition__Group_0__0__Impl3988);
            rule__Precondition__Pre1Assignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getPreconditionAccess().getPre1Assignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group_0__0__Impl"


    // $ANTLR start "rule__Precondition__Group_0__1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1984:1: rule__Precondition__Group_0__1 : rule__Precondition__Group_0__1__Impl rule__Precondition__Group_0__2 ;
    public final void rule__Precondition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1988:1: ( rule__Precondition__Group_0__1__Impl rule__Precondition__Group_0__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1989:2: rule__Precondition__Group_0__1__Impl rule__Precondition__Group_0__2
            {
            pushFollow(FOLLOW_rule__Precondition__Group_0__1__Impl_in_rule__Precondition__Group_0__14018);
            rule__Precondition__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precondition__Group_0__2_in_rule__Precondition__Group_0__14021);
            rule__Precondition__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group_0__1"


    // $ANTLR start "rule__Precondition__Group_0__1__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1996:1: rule__Precondition__Group_0__1__Impl : ( ( rule__Precondition__OpAssignment_0_1 ) ) ;
    public final void rule__Precondition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2000:1: ( ( ( rule__Precondition__OpAssignment_0_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2001:1: ( ( rule__Precondition__OpAssignment_0_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2001:1: ( ( rule__Precondition__OpAssignment_0_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2002:1: ( rule__Precondition__OpAssignment_0_1 )
            {
             before(grammarAccess.getPreconditionAccess().getOpAssignment_0_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2003:1: ( rule__Precondition__OpAssignment_0_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2003:2: rule__Precondition__OpAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Precondition__OpAssignment_0_1_in_rule__Precondition__Group_0__1__Impl4048);
            rule__Precondition__OpAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPreconditionAccess().getOpAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group_0__1__Impl"


    // $ANTLR start "rule__Precondition__Group_0__2"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2013:1: rule__Precondition__Group_0__2 : rule__Precondition__Group_0__2__Impl ;
    public final void rule__Precondition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2017:1: ( rule__Precondition__Group_0__2__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2018:2: rule__Precondition__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Precondition__Group_0__2__Impl_in_rule__Precondition__Group_0__24078);
            rule__Precondition__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group_0__2"


    // $ANTLR start "rule__Precondition__Group_0__2__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2024:1: rule__Precondition__Group_0__2__Impl : ( ( rule__Precondition__PreAssignment_0_2 ) ) ;
    public final void rule__Precondition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2028:1: ( ( ( rule__Precondition__PreAssignment_0_2 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2029:1: ( ( rule__Precondition__PreAssignment_0_2 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2029:1: ( ( rule__Precondition__PreAssignment_0_2 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2030:1: ( rule__Precondition__PreAssignment_0_2 )
            {
             before(grammarAccess.getPreconditionAccess().getPreAssignment_0_2()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2031:1: ( rule__Precondition__PreAssignment_0_2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2031:2: rule__Precondition__PreAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Precondition__PreAssignment_0_2_in_rule__Precondition__Group_0__2__Impl4105);
            rule__Precondition__PreAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getPreconditionAccess().getPreAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group_0__2__Impl"


    // $ANTLR start "rule__SensorValuePrecondition__Group__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2047:1: rule__SensorValuePrecondition__Group__0 : rule__SensorValuePrecondition__Group__0__Impl rule__SensorValuePrecondition__Group__1 ;
    public final void rule__SensorValuePrecondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2051:1: ( rule__SensorValuePrecondition__Group__0__Impl rule__SensorValuePrecondition__Group__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2052:2: rule__SensorValuePrecondition__Group__0__Impl rule__SensorValuePrecondition__Group__1
            {
            pushFollow(FOLLOW_rule__SensorValuePrecondition__Group__0__Impl_in_rule__SensorValuePrecondition__Group__04141);
            rule__SensorValuePrecondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorValuePrecondition__Group__1_in_rule__SensorValuePrecondition__Group__04144);
            rule__SensorValuePrecondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorValuePrecondition__Group__0"


    // $ANTLR start "rule__SensorValuePrecondition__Group__0__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2059:1: rule__SensorValuePrecondition__Group__0__Impl : ( ( rule__SensorValuePrecondition__SensorAssignment_0 ) ) ;
    public final void rule__SensorValuePrecondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2063:1: ( ( ( rule__SensorValuePrecondition__SensorAssignment_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2064:1: ( ( rule__SensorValuePrecondition__SensorAssignment_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2064:1: ( ( rule__SensorValuePrecondition__SensorAssignment_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2065:1: ( rule__SensorValuePrecondition__SensorAssignment_0 )
            {
             before(grammarAccess.getSensorValuePreconditionAccess().getSensorAssignment_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2066:1: ( rule__SensorValuePrecondition__SensorAssignment_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2066:2: rule__SensorValuePrecondition__SensorAssignment_0
            {
            pushFollow(FOLLOW_rule__SensorValuePrecondition__SensorAssignment_0_in_rule__SensorValuePrecondition__Group__0__Impl4171);
            rule__SensorValuePrecondition__SensorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSensorValuePreconditionAccess().getSensorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorValuePrecondition__Group__0__Impl"


    // $ANTLR start "rule__SensorValuePrecondition__Group__1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2076:1: rule__SensorValuePrecondition__Group__1 : rule__SensorValuePrecondition__Group__1__Impl rule__SensorValuePrecondition__Group__2 ;
    public final void rule__SensorValuePrecondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2080:1: ( rule__SensorValuePrecondition__Group__1__Impl rule__SensorValuePrecondition__Group__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2081:2: rule__SensorValuePrecondition__Group__1__Impl rule__SensorValuePrecondition__Group__2
            {
            pushFollow(FOLLOW_rule__SensorValuePrecondition__Group__1__Impl_in_rule__SensorValuePrecondition__Group__14201);
            rule__SensorValuePrecondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorValuePrecondition__Group__2_in_rule__SensorValuePrecondition__Group__14204);
            rule__SensorValuePrecondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorValuePrecondition__Group__1"


    // $ANTLR start "rule__SensorValuePrecondition__Group__1__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2088:1: rule__SensorValuePrecondition__Group__1__Impl : ( ( rule__SensorValuePrecondition__CondAssignment_1 ) ) ;
    public final void rule__SensorValuePrecondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2092:1: ( ( ( rule__SensorValuePrecondition__CondAssignment_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2093:1: ( ( rule__SensorValuePrecondition__CondAssignment_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2093:1: ( ( rule__SensorValuePrecondition__CondAssignment_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2094:1: ( rule__SensorValuePrecondition__CondAssignment_1 )
            {
             before(grammarAccess.getSensorValuePreconditionAccess().getCondAssignment_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2095:1: ( rule__SensorValuePrecondition__CondAssignment_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2095:2: rule__SensorValuePrecondition__CondAssignment_1
            {
            pushFollow(FOLLOW_rule__SensorValuePrecondition__CondAssignment_1_in_rule__SensorValuePrecondition__Group__1__Impl4231);
            rule__SensorValuePrecondition__CondAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorValuePreconditionAccess().getCondAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorValuePrecondition__Group__1__Impl"


    // $ANTLR start "rule__SensorValuePrecondition__Group__2"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2105:1: rule__SensorValuePrecondition__Group__2 : rule__SensorValuePrecondition__Group__2__Impl ;
    public final void rule__SensorValuePrecondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2109:1: ( rule__SensorValuePrecondition__Group__2__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2110:2: rule__SensorValuePrecondition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SensorValuePrecondition__Group__2__Impl_in_rule__SensorValuePrecondition__Group__24261);
            rule__SensorValuePrecondition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorValuePrecondition__Group__2"


    // $ANTLR start "rule__SensorValuePrecondition__Group__2__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2116:1: rule__SensorValuePrecondition__Group__2__Impl : ( ( rule__SensorValuePrecondition__ValueAssignment_2 ) ) ;
    public final void rule__SensorValuePrecondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2120:1: ( ( ( rule__SensorValuePrecondition__ValueAssignment_2 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2121:1: ( ( rule__SensorValuePrecondition__ValueAssignment_2 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2121:1: ( ( rule__SensorValuePrecondition__ValueAssignment_2 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2122:1: ( rule__SensorValuePrecondition__ValueAssignment_2 )
            {
             before(grammarAccess.getSensorValuePreconditionAccess().getValueAssignment_2()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2123:1: ( rule__SensorValuePrecondition__ValueAssignment_2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2123:2: rule__SensorValuePrecondition__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__SensorValuePrecondition__ValueAssignment_2_in_rule__SensorValuePrecondition__Group__2__Impl4288);
            rule__SensorValuePrecondition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSensorValuePreconditionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorValuePrecondition__Group__2__Impl"


    // $ANTLR start "rule__Timer__Group__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2139:1: rule__Timer__Group__0 : rule__Timer__Group__0__Impl rule__Timer__Group__1 ;
    public final void rule__Timer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2143:1: ( rule__Timer__Group__0__Impl rule__Timer__Group__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2144:2: rule__Timer__Group__0__Impl rule__Timer__Group__1
            {
            pushFollow(FOLLOW_rule__Timer__Group__0__Impl_in_rule__Timer__Group__04324);
            rule__Timer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group__1_in_rule__Timer__Group__04327);
            rule__Timer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timer__Group__0"


    // $ANTLR start "rule__Timer__Group__0__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2151:1: rule__Timer__Group__0__Impl : ( 'action' ) ;
    public final void rule__Timer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2155:1: ( ( 'action' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2156:1: ( 'action' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2156:1: ( 'action' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2157:1: 'action'
            {
             before(grammarAccess.getTimerAccess().getActionKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__Timer__Group__0__Impl4355); 
             after(grammarAccess.getTimerAccess().getActionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timer__Group__0__Impl"


    // $ANTLR start "rule__Timer__Group__1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2170:1: rule__Timer__Group__1 : rule__Timer__Group__1__Impl rule__Timer__Group__2 ;
    public final void rule__Timer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2174:1: ( rule__Timer__Group__1__Impl rule__Timer__Group__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2175:2: rule__Timer__Group__1__Impl rule__Timer__Group__2
            {
            pushFollow(FOLLOW_rule__Timer__Group__1__Impl_in_rule__Timer__Group__14386);
            rule__Timer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group__2_in_rule__Timer__Group__14389);
            rule__Timer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timer__Group__1"


    // $ANTLR start "rule__Timer__Group__1__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2182:1: rule__Timer__Group__1__Impl : ( ( rule__Timer__EventHandlerAssignment_1 ) ) ;
    public final void rule__Timer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2186:1: ( ( ( rule__Timer__EventHandlerAssignment_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2187:1: ( ( rule__Timer__EventHandlerAssignment_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2187:1: ( ( rule__Timer__EventHandlerAssignment_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2188:1: ( rule__Timer__EventHandlerAssignment_1 )
            {
             before(grammarAccess.getTimerAccess().getEventHandlerAssignment_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2189:1: ( rule__Timer__EventHandlerAssignment_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2189:2: rule__Timer__EventHandlerAssignment_1
            {
            pushFollow(FOLLOW_rule__Timer__EventHandlerAssignment_1_in_rule__Timer__Group__1__Impl4416);
            rule__Timer__EventHandlerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getEventHandlerAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timer__Group__1__Impl"


    // $ANTLR start "rule__Timer__Group__2"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2199:1: rule__Timer__Group__2 : rule__Timer__Group__2__Impl rule__Timer__Group__3 ;
    public final void rule__Timer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2203:1: ( rule__Timer__Group__2__Impl rule__Timer__Group__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2204:2: rule__Timer__Group__2__Impl rule__Timer__Group__3
            {
            pushFollow(FOLLOW_rule__Timer__Group__2__Impl_in_rule__Timer__Group__24446);
            rule__Timer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group__3_in_rule__Timer__Group__24449);
            rule__Timer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timer__Group__2"


    // $ANTLR start "rule__Timer__Group__2__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2211:1: rule__Timer__Group__2__Impl : ( 'repeat' ) ;
    public final void rule__Timer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2215:1: ( ( 'repeat' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2216:1: ( 'repeat' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2216:1: ( 'repeat' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2217:1: 'repeat'
            {
             before(grammarAccess.getTimerAccess().getRepeatKeyword_2()); 
            match(input,48,FOLLOW_48_in_rule__Timer__Group__2__Impl4477); 
             after(grammarAccess.getTimerAccess().getRepeatKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timer__Group__2__Impl"


    // $ANTLR start "rule__Timer__Group__3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2230:1: rule__Timer__Group__3 : rule__Timer__Group__3__Impl rule__Timer__Group__4 ;
    public final void rule__Timer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2234:1: ( rule__Timer__Group__3__Impl rule__Timer__Group__4 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2235:2: rule__Timer__Group__3__Impl rule__Timer__Group__4
            {
            pushFollow(FOLLOW_rule__Timer__Group__3__Impl_in_rule__Timer__Group__34508);
            rule__Timer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group__4_in_rule__Timer__Group__34511);
            rule__Timer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timer__Group__3"


    // $ANTLR start "rule__Timer__Group__3__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2242:1: rule__Timer__Group__3__Impl : ( ( rule__Timer__RepeattypeAssignment_3 ) ) ;
    public final void rule__Timer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2246:1: ( ( ( rule__Timer__RepeattypeAssignment_3 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2247:1: ( ( rule__Timer__RepeattypeAssignment_3 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2247:1: ( ( rule__Timer__RepeattypeAssignment_3 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2248:1: ( rule__Timer__RepeattypeAssignment_3 )
            {
             before(grammarAccess.getTimerAccess().getRepeattypeAssignment_3()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2249:1: ( rule__Timer__RepeattypeAssignment_3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2249:2: rule__Timer__RepeattypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Timer__RepeattypeAssignment_3_in_rule__Timer__Group__3__Impl4538);
            rule__Timer__RepeattypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getRepeattypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timer__Group__3__Impl"


    // $ANTLR start "rule__Timer__Group__4"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2259:1: rule__Timer__Group__4 : rule__Timer__Group__4__Impl rule__Timer__Group__5 ;
    public final void rule__Timer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2263:1: ( rule__Timer__Group__4__Impl rule__Timer__Group__5 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2264:2: rule__Timer__Group__4__Impl rule__Timer__Group__5
            {
            pushFollow(FOLLOW_rule__Timer__Group__4__Impl_in_rule__Timer__Group__44568);
            rule__Timer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group__5_in_rule__Timer__Group__44571);
            rule__Timer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timer__Group__4"


    // $ANTLR start "rule__Timer__Group__4__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2271:1: rule__Timer__Group__4__Impl : ( 'seconds:' ) ;
    public final void rule__Timer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2275:1: ( ( 'seconds:' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2276:1: ( 'seconds:' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2276:1: ( 'seconds:' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2277:1: 'seconds:'
            {
             before(grammarAccess.getTimerAccess().getSecondsKeyword_4()); 
            match(input,49,FOLLOW_49_in_rule__Timer__Group__4__Impl4599); 
             after(grammarAccess.getTimerAccess().getSecondsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timer__Group__4__Impl"


    // $ANTLR start "rule__Timer__Group__5"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2290:1: rule__Timer__Group__5 : rule__Timer__Group__5__Impl ;
    public final void rule__Timer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2294:1: ( rule__Timer__Group__5__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2295:2: rule__Timer__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Timer__Group__5__Impl_in_rule__Timer__Group__54630);
            rule__Timer__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timer__Group__5"


    // $ANTLR start "rule__Timer__Group__5__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2301:1: rule__Timer__Group__5__Impl : ( ( rule__Timer__TimerSecsAssignment_5 ) ) ;
    public final void rule__Timer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2305:1: ( ( ( rule__Timer__TimerSecsAssignment_5 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2306:1: ( ( rule__Timer__TimerSecsAssignment_5 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2306:1: ( ( rule__Timer__TimerSecsAssignment_5 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2307:1: ( rule__Timer__TimerSecsAssignment_5 )
            {
             before(grammarAccess.getTimerAccess().getTimerSecsAssignment_5()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2308:1: ( rule__Timer__TimerSecsAssignment_5 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2308:2: rule__Timer__TimerSecsAssignment_5
            {
            pushFollow(FOLLOW_rule__Timer__TimerSecsAssignment_5_in_rule__Timer__Group__5__Impl4657);
            rule__Timer__TimerSecsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getTimerSecsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timer__Group__5__Impl"


    // $ANTLR start "rule__Alarm__Group__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2330:1: rule__Alarm__Group__0 : rule__Alarm__Group__0__Impl rule__Alarm__Group__1 ;
    public final void rule__Alarm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2334:1: ( rule__Alarm__Group__0__Impl rule__Alarm__Group__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2335:2: rule__Alarm__Group__0__Impl rule__Alarm__Group__1
            {
            pushFollow(FOLLOW_rule__Alarm__Group__0__Impl_in_rule__Alarm__Group__04699);
            rule__Alarm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alarm__Group__1_in_rule__Alarm__Group__04702);
            rule__Alarm__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alarm__Group__0"


    // $ANTLR start "rule__Alarm__Group__0__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2342:1: rule__Alarm__Group__0__Impl : ( 'action' ) ;
    public final void rule__Alarm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2346:1: ( ( 'action' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2347:1: ( 'action' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2347:1: ( 'action' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2348:1: 'action'
            {
             before(grammarAccess.getAlarmAccess().getActionKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__Alarm__Group__0__Impl4730); 
             after(grammarAccess.getAlarmAccess().getActionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alarm__Group__0__Impl"


    // $ANTLR start "rule__Alarm__Group__1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2361:1: rule__Alarm__Group__1 : rule__Alarm__Group__1__Impl rule__Alarm__Group__2 ;
    public final void rule__Alarm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2365:1: ( rule__Alarm__Group__1__Impl rule__Alarm__Group__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2366:2: rule__Alarm__Group__1__Impl rule__Alarm__Group__2
            {
            pushFollow(FOLLOW_rule__Alarm__Group__1__Impl_in_rule__Alarm__Group__14761);
            rule__Alarm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alarm__Group__2_in_rule__Alarm__Group__14764);
            rule__Alarm__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alarm__Group__1"


    // $ANTLR start "rule__Alarm__Group__1__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2373:1: rule__Alarm__Group__1__Impl : ( ( rule__Alarm__EventHandlerAssignment_1 ) ) ;
    public final void rule__Alarm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2377:1: ( ( ( rule__Alarm__EventHandlerAssignment_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2378:1: ( ( rule__Alarm__EventHandlerAssignment_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2378:1: ( ( rule__Alarm__EventHandlerAssignment_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2379:1: ( rule__Alarm__EventHandlerAssignment_1 )
            {
             before(grammarAccess.getAlarmAccess().getEventHandlerAssignment_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2380:1: ( rule__Alarm__EventHandlerAssignment_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2380:2: rule__Alarm__EventHandlerAssignment_1
            {
            pushFollow(FOLLOW_rule__Alarm__EventHandlerAssignment_1_in_rule__Alarm__Group__1__Impl4791);
            rule__Alarm__EventHandlerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAlarmAccess().getEventHandlerAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alarm__Group__1__Impl"


    // $ANTLR start "rule__Alarm__Group__2"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2390:1: rule__Alarm__Group__2 : rule__Alarm__Group__2__Impl rule__Alarm__Group__3 ;
    public final void rule__Alarm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2394:1: ( rule__Alarm__Group__2__Impl rule__Alarm__Group__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2395:2: rule__Alarm__Group__2__Impl rule__Alarm__Group__3
            {
            pushFollow(FOLLOW_rule__Alarm__Group__2__Impl_in_rule__Alarm__Group__24821);
            rule__Alarm__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alarm__Group__3_in_rule__Alarm__Group__24824);
            rule__Alarm__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alarm__Group__2"


    // $ANTLR start "rule__Alarm__Group__2__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2402:1: rule__Alarm__Group__2__Impl : ( 'repeat' ) ;
    public final void rule__Alarm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2406:1: ( ( 'repeat' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2407:1: ( 'repeat' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2407:1: ( 'repeat' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2408:1: 'repeat'
            {
             before(grammarAccess.getAlarmAccess().getRepeatKeyword_2()); 
            match(input,48,FOLLOW_48_in_rule__Alarm__Group__2__Impl4852); 
             after(grammarAccess.getAlarmAccess().getRepeatKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alarm__Group__2__Impl"


    // $ANTLR start "rule__Alarm__Group__3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2421:1: rule__Alarm__Group__3 : rule__Alarm__Group__3__Impl rule__Alarm__Group__4 ;
    public final void rule__Alarm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2425:1: ( rule__Alarm__Group__3__Impl rule__Alarm__Group__4 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2426:2: rule__Alarm__Group__3__Impl rule__Alarm__Group__4
            {
            pushFollow(FOLLOW_rule__Alarm__Group__3__Impl_in_rule__Alarm__Group__34883);
            rule__Alarm__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alarm__Group__4_in_rule__Alarm__Group__34886);
            rule__Alarm__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alarm__Group__3"


    // $ANTLR start "rule__Alarm__Group__3__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2433:1: rule__Alarm__Group__3__Impl : ( ( rule__Alarm__RepeattypeAssignment_3 ) ) ;
    public final void rule__Alarm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2437:1: ( ( ( rule__Alarm__RepeattypeAssignment_3 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2438:1: ( ( rule__Alarm__RepeattypeAssignment_3 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2438:1: ( ( rule__Alarm__RepeattypeAssignment_3 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2439:1: ( rule__Alarm__RepeattypeAssignment_3 )
            {
             before(grammarAccess.getAlarmAccess().getRepeattypeAssignment_3()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2440:1: ( rule__Alarm__RepeattypeAssignment_3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2440:2: rule__Alarm__RepeattypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Alarm__RepeattypeAssignment_3_in_rule__Alarm__Group__3__Impl4913);
            rule__Alarm__RepeattypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAlarmAccess().getRepeattypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alarm__Group__3__Impl"


    // $ANTLR start "rule__Alarm__Group__4"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2450:1: rule__Alarm__Group__4 : rule__Alarm__Group__4__Impl rule__Alarm__Group__5 ;
    public final void rule__Alarm__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2454:1: ( rule__Alarm__Group__4__Impl rule__Alarm__Group__5 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2455:2: rule__Alarm__Group__4__Impl rule__Alarm__Group__5
            {
            pushFollow(FOLLOW_rule__Alarm__Group__4__Impl_in_rule__Alarm__Group__44943);
            rule__Alarm__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alarm__Group__5_in_rule__Alarm__Group__44946);
            rule__Alarm__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alarm__Group__4"


    // $ANTLR start "rule__Alarm__Group__4__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2462:1: rule__Alarm__Group__4__Impl : ( 'hours:' ) ;
    public final void rule__Alarm__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2466:1: ( ( 'hours:' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2467:1: ( 'hours:' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2467:1: ( 'hours:' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2468:1: 'hours:'
            {
             before(grammarAccess.getAlarmAccess().getHoursKeyword_4()); 
            match(input,50,FOLLOW_50_in_rule__Alarm__Group__4__Impl4974); 
             after(grammarAccess.getAlarmAccess().getHoursKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alarm__Group__4__Impl"


    // $ANTLR start "rule__Alarm__Group__5"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2481:1: rule__Alarm__Group__5 : rule__Alarm__Group__5__Impl rule__Alarm__Group__6 ;
    public final void rule__Alarm__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2485:1: ( rule__Alarm__Group__5__Impl rule__Alarm__Group__6 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2486:2: rule__Alarm__Group__5__Impl rule__Alarm__Group__6
            {
            pushFollow(FOLLOW_rule__Alarm__Group__5__Impl_in_rule__Alarm__Group__55005);
            rule__Alarm__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alarm__Group__6_in_rule__Alarm__Group__55008);
            rule__Alarm__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alarm__Group__5"


    // $ANTLR start "rule__Alarm__Group__5__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2493:1: rule__Alarm__Group__5__Impl : ( ( rule__Alarm__TimerHoursAssignment_5 ) ) ;
    public final void rule__Alarm__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2497:1: ( ( ( rule__Alarm__TimerHoursAssignment_5 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2498:1: ( ( rule__Alarm__TimerHoursAssignment_5 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2498:1: ( ( rule__Alarm__TimerHoursAssignment_5 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2499:1: ( rule__Alarm__TimerHoursAssignment_5 )
            {
             before(grammarAccess.getAlarmAccess().getTimerHoursAssignment_5()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2500:1: ( rule__Alarm__TimerHoursAssignment_5 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2500:2: rule__Alarm__TimerHoursAssignment_5
            {
            pushFollow(FOLLOW_rule__Alarm__TimerHoursAssignment_5_in_rule__Alarm__Group__5__Impl5035);
            rule__Alarm__TimerHoursAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAlarmAccess().getTimerHoursAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alarm__Group__5__Impl"


    // $ANTLR start "rule__Alarm__Group__6"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2510:1: rule__Alarm__Group__6 : rule__Alarm__Group__6__Impl rule__Alarm__Group__7 ;
    public final void rule__Alarm__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2514:1: ( rule__Alarm__Group__6__Impl rule__Alarm__Group__7 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2515:2: rule__Alarm__Group__6__Impl rule__Alarm__Group__7
            {
            pushFollow(FOLLOW_rule__Alarm__Group__6__Impl_in_rule__Alarm__Group__65065);
            rule__Alarm__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alarm__Group__7_in_rule__Alarm__Group__65068);
            rule__Alarm__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alarm__Group__6"


    // $ANTLR start "rule__Alarm__Group__6__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2522:1: rule__Alarm__Group__6__Impl : ( 'minutes:' ) ;
    public final void rule__Alarm__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2526:1: ( ( 'minutes:' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2527:1: ( 'minutes:' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2527:1: ( 'minutes:' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2528:1: 'minutes:'
            {
             before(grammarAccess.getAlarmAccess().getMinutesKeyword_6()); 
            match(input,51,FOLLOW_51_in_rule__Alarm__Group__6__Impl5096); 
             after(grammarAccess.getAlarmAccess().getMinutesKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alarm__Group__6__Impl"


    // $ANTLR start "rule__Alarm__Group__7"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2541:1: rule__Alarm__Group__7 : rule__Alarm__Group__7__Impl ;
    public final void rule__Alarm__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2545:1: ( rule__Alarm__Group__7__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2546:2: rule__Alarm__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Alarm__Group__7__Impl_in_rule__Alarm__Group__75127);
            rule__Alarm__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alarm__Group__7"


    // $ANTLR start "rule__Alarm__Group__7__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2552:1: rule__Alarm__Group__7__Impl : ( ( rule__Alarm__TimerMinutesAssignment_7 ) ) ;
    public final void rule__Alarm__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2556:1: ( ( ( rule__Alarm__TimerMinutesAssignment_7 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2557:1: ( ( rule__Alarm__TimerMinutesAssignment_7 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2557:1: ( ( rule__Alarm__TimerMinutesAssignment_7 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2558:1: ( rule__Alarm__TimerMinutesAssignment_7 )
            {
             before(grammarAccess.getAlarmAccess().getTimerMinutesAssignment_7()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2559:1: ( rule__Alarm__TimerMinutesAssignment_7 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2559:2: rule__Alarm__TimerMinutesAssignment_7
            {
            pushFollow(FOLLOW_rule__Alarm__TimerMinutesAssignment_7_in_rule__Alarm__Group__7__Impl5154);
            rule__Alarm__TimerMinutesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAlarmAccess().getTimerMinutesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alarm__Group__7__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2586:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2590:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2591:1: ( RULE_ID )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2591:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2592:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NameAssignment_15205); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__HardwareAssignment_3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2601:1: rule__Model__HardwareAssignment_3 : ( ( rule__Model__HardwareAlternatives_3_0 ) ) ;
    public final void rule__Model__HardwareAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2605:1: ( ( ( rule__Model__HardwareAlternatives_3_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2606:1: ( ( rule__Model__HardwareAlternatives_3_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2606:1: ( ( rule__Model__HardwareAlternatives_3_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2607:1: ( rule__Model__HardwareAlternatives_3_0 )
            {
             before(grammarAccess.getModelAccess().getHardwareAlternatives_3_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2608:1: ( rule__Model__HardwareAlternatives_3_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2608:2: rule__Model__HardwareAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Model__HardwareAlternatives_3_0_in_rule__Model__HardwareAssignment_35236);
            rule__Model__HardwareAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getHardwareAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__HardwareAssignment_3"


    // $ANTLR start "rule__Model__DevicesAssignment_4"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2617:1: rule__Model__DevicesAssignment_4 : ( ruleAbstractDevice ) ;
    public final void rule__Model__DevicesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2621:1: ( ( ruleAbstractDevice ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2622:1: ( ruleAbstractDevice )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2622:1: ( ruleAbstractDevice )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2623:1: ruleAbstractDevice
            {
             before(grammarAccess.getModelAccess().getDevicesAbstractDeviceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAbstractDevice_in_rule__Model__DevicesAssignment_45269);
            ruleAbstractDevice();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDevicesAbstractDeviceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DevicesAssignment_4"


    // $ANTLR start "rule__Model__EventHandlersAssignment_5"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2632:1: rule__Model__EventHandlersAssignment_5 : ( ruleEventHandler ) ;
    public final void rule__Model__EventHandlersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2636:1: ( ( ruleEventHandler ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2637:1: ( ruleEventHandler )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2637:1: ( ruleEventHandler )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2638:1: ruleEventHandler
            {
             before(grammarAccess.getModelAccess().getEventHandlersEventHandlerParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleEventHandler_in_rule__Model__EventHandlersAssignment_55300);
            ruleEventHandler();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEventHandlersEventHandlerParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EventHandlersAssignment_5"


    // $ANTLR start "rule__Model__SensorListenersAssignment_6"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2647:1: rule__Model__SensorListenersAssignment_6 : ( ruleSensorListener ) ;
    public final void rule__Model__SensorListenersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2651:1: ( ( ruleSensorListener ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2652:1: ( ruleSensorListener )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2652:1: ( ruleSensorListener )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2653:1: ruleSensorListener
            {
             before(grammarAccess.getModelAccess().getSensorListenersSensorListenerParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleSensorListener_in_rule__Model__SensorListenersAssignment_65331);
            ruleSensorListener();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSensorListenersSensorListenerParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SensorListenersAssignment_6"


    // $ANTLR start "rule__Model__TimersAssignment_7"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2662:1: rule__Model__TimersAssignment_7 : ( ruleTimer ) ;
    public final void rule__Model__TimersAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2666:1: ( ( ruleTimer ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2667:1: ( ruleTimer )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2667:1: ( ruleTimer )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2668:1: ruleTimer
            {
             before(grammarAccess.getModelAccess().getTimersTimerParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleTimer_in_rule__Model__TimersAssignment_75362);
            ruleTimer();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTimersTimerParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TimersAssignment_7"


    // $ANTLR start "rule__Model__AlarmsAssignment_8"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2677:1: rule__Model__AlarmsAssignment_8 : ( ruleAlarm ) ;
    public final void rule__Model__AlarmsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2681:1: ( ( ruleAlarm ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2682:1: ( ruleAlarm )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2682:1: ( ruleAlarm )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2683:1: ruleAlarm
            {
             before(grammarAccess.getModelAccess().getAlarmsAlarmParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleAlarm_in_rule__Model__AlarmsAssignment_85393);
            ruleAlarm();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAlarmsAlarmParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AlarmsAssignment_8"


    // $ANTLR start "rule__Model__PriorityAssignment_9_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2692:1: rule__Model__PriorityAssignment_9_1 : ( ( rule__Model__PriorityAlternatives_9_1_0 ) ) ;
    public final void rule__Model__PriorityAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2696:1: ( ( ( rule__Model__PriorityAlternatives_9_1_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2697:1: ( ( rule__Model__PriorityAlternatives_9_1_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2697:1: ( ( rule__Model__PriorityAlternatives_9_1_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2698:1: ( rule__Model__PriorityAlternatives_9_1_0 )
            {
             before(grammarAccess.getModelAccess().getPriorityAlternatives_9_1_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2699:1: ( rule__Model__PriorityAlternatives_9_1_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2699:2: rule__Model__PriorityAlternatives_9_1_0
            {
            pushFollow(FOLLOW_rule__Model__PriorityAlternatives_9_1_0_in_rule__Model__PriorityAssignment_9_15424);
            rule__Model__PriorityAlternatives_9_1_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPriorityAlternatives_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PriorityAssignment_9_1"


    // $ANTLR start "rule__Sensor__NameAssignment_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2708:1: rule__Sensor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sensor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2712:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2713:1: ( RULE_ID )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2713:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2714:1: RULE_ID
            {
             before(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Sensor__NameAssignment_15457); 
             after(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__NameAssignment_1"


    // $ANTLR start "rule__Sensor__PinAssignment_3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2723:1: rule__Sensor__PinAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Sensor__PinAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2727:1: ( ( RULE_STRING ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2728:1: ( RULE_STRING )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2728:1: ( RULE_STRING )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2729:1: RULE_STRING
            {
             before(grammarAccess.getSensorAccess().getPinSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Sensor__PinAssignment_35488); 
             after(grammarAccess.getSensorAccess().getPinSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__PinAssignment_3"


    // $ANTLR start "rule__Actuator__NameAssignment_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2738:1: rule__Actuator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Actuator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2742:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2743:1: ( RULE_ID )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2743:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2744:1: RULE_ID
            {
             before(grammarAccess.getActuatorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actuator__NameAssignment_15519); 
             after(grammarAccess.getActuatorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__NameAssignment_1"


    // $ANTLR start "rule__Actuator__PinAssignment_3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2753:1: rule__Actuator__PinAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Actuator__PinAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2757:1: ( ( RULE_STRING ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2758:1: ( RULE_STRING )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2758:1: ( RULE_STRING )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2759:1: RULE_STRING
            {
             before(grammarAccess.getActuatorAccess().getPinSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Actuator__PinAssignment_35550); 
             after(grammarAccess.getActuatorAccess().getPinSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__PinAssignment_3"


    // $ANTLR start "rule__EventHandler__NameAssignment_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2768:1: rule__EventHandler__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EventHandler__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2772:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2773:1: ( RULE_ID )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2773:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2774:1: RULE_ID
            {
             before(grammarAccess.getEventHandlerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EventHandler__NameAssignment_15581); 
             after(grammarAccess.getEventHandlerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventHandler__NameAssignment_1"


    // $ANTLR start "rule__EventHandler__ChangeActuatorsAssignment_2"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2783:1: rule__EventHandler__ChangeActuatorsAssignment_2 : ( ruleChangeActuator ) ;
    public final void rule__EventHandler__ChangeActuatorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2787:1: ( ( ruleChangeActuator ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2788:1: ( ruleChangeActuator )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2788:1: ( ruleChangeActuator )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2789:1: ruleChangeActuator
            {
             before(grammarAccess.getEventHandlerAccess().getChangeActuatorsChangeActuatorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleChangeActuator_in_rule__EventHandler__ChangeActuatorsAssignment_25612);
            ruleChangeActuator();

            state._fsp--;

             after(grammarAccess.getEventHandlerAccess().getChangeActuatorsChangeActuatorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventHandler__ChangeActuatorsAssignment_2"


    // $ANTLR start "rule__ChangeActuator__ActuatorAssignment_0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2798:1: rule__ChangeActuator__ActuatorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ChangeActuator__ActuatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2802:1: ( ( ( RULE_ID ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2803:1: ( ( RULE_ID ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2803:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2804:1: ( RULE_ID )
            {
             before(grammarAccess.getChangeActuatorAccess().getActuatorActuatorCrossReference_0_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2805:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2806:1: RULE_ID
            {
             before(grammarAccess.getChangeActuatorAccess().getActuatorActuatorIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ChangeActuator__ActuatorAssignment_05647); 
             after(grammarAccess.getChangeActuatorAccess().getActuatorActuatorIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getChangeActuatorAccess().getActuatorActuatorCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeActuator__ActuatorAssignment_0"


    // $ANTLR start "rule__ChangeActuator__ActuatorStateAssignment_2"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2817:1: rule__ChangeActuator__ActuatorStateAssignment_2 : ( ( rule__ChangeActuator__ActuatorStateAlternatives_2_0 ) ) ;
    public final void rule__ChangeActuator__ActuatorStateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2821:1: ( ( ( rule__ChangeActuator__ActuatorStateAlternatives_2_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2822:1: ( ( rule__ChangeActuator__ActuatorStateAlternatives_2_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2822:1: ( ( rule__ChangeActuator__ActuatorStateAlternatives_2_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2823:1: ( rule__ChangeActuator__ActuatorStateAlternatives_2_0 )
            {
             before(grammarAccess.getChangeActuatorAccess().getActuatorStateAlternatives_2_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2824:1: ( rule__ChangeActuator__ActuatorStateAlternatives_2_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2824:2: rule__ChangeActuator__ActuatorStateAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__ChangeActuator__ActuatorStateAlternatives_2_0_in_rule__ChangeActuator__ActuatorStateAssignment_25682);
            rule__ChangeActuator__ActuatorStateAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getChangeActuatorAccess().getActuatorStateAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeActuator__ActuatorStateAssignment_2"


    // $ANTLR start "rule__SensorListener__SensorAssignment_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2833:1: rule__SensorListener__SensorAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SensorListener__SensorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2837:1: ( ( ( RULE_ID ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2838:1: ( ( RULE_ID ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2838:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2839:1: ( RULE_ID )
            {
             before(grammarAccess.getSensorListenerAccess().getSensorSensorCrossReference_1_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2840:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2841:1: RULE_ID
            {
             before(grammarAccess.getSensorListenerAccess().getSensorSensorIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SensorListener__SensorAssignment_15719); 
             after(grammarAccess.getSensorListenerAccess().getSensorSensorIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSensorListenerAccess().getSensorSensorCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorListener__SensorAssignment_1"


    // $ANTLR start "rule__SensorListener__TypeAssignment_3_0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2852:1: rule__SensorListener__TypeAssignment_3_0 : ( ( 'BETWEEN' ) ) ;
    public final void rule__SensorListener__TypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2856:1: ( ( ( 'BETWEEN' ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2857:1: ( ( 'BETWEEN' ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2857:1: ( ( 'BETWEEN' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2858:1: ( 'BETWEEN' )
            {
             before(grammarAccess.getSensorListenerAccess().getTypeBETWEENKeyword_3_0_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2859:1: ( 'BETWEEN' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2860:1: 'BETWEEN'
            {
             before(grammarAccess.getSensorListenerAccess().getTypeBETWEENKeyword_3_0_0()); 
            match(input,52,FOLLOW_52_in_rule__SensorListener__TypeAssignment_3_05759); 
             after(grammarAccess.getSensorListenerAccess().getTypeBETWEENKeyword_3_0_0()); 

            }

             after(grammarAccess.getSensorListenerAccess().getTypeBETWEENKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorListener__TypeAssignment_3_0"


    // $ANTLR start "rule__SensorListener__LAssignment_3_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2875:1: rule__SensorListener__LAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__SensorListener__LAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2879:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2880:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2880:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2881:1: RULE_INT
            {
             before(grammarAccess.getSensorListenerAccess().getLINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SensorListener__LAssignment_3_15798); 
             after(grammarAccess.getSensorListenerAccess().getLINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorListener__LAssignment_3_1"


    // $ANTLR start "rule__SensorListener__HAssignment_3_3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2890:1: rule__SensorListener__HAssignment_3_3 : ( RULE_INT ) ;
    public final void rule__SensorListener__HAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2894:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2895:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2895:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2896:1: RULE_INT
            {
             before(grammarAccess.getSensorListenerAccess().getHINTTerminalRuleCall_3_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SensorListener__HAssignment_3_35829); 
             after(grammarAccess.getSensorListenerAccess().getHINTTerminalRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorListener__HAssignment_3_3"


    // $ANTLR start "rule__SensorListener__EventHandlerAssignment_5"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2905:1: rule__SensorListener__EventHandlerAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__SensorListener__EventHandlerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2909:1: ( ( ( RULE_ID ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2910:1: ( ( RULE_ID ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2910:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2911:1: ( RULE_ID )
            {
             before(grammarAccess.getSensorListenerAccess().getEventHandlerEventHandlerCrossReference_5_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2912:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2913:1: RULE_ID
            {
             before(grammarAccess.getSensorListenerAccess().getEventHandlerEventHandlerIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SensorListener__EventHandlerAssignment_55864); 
             after(grammarAccess.getSensorListenerAccess().getEventHandlerEventHandlerIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getSensorListenerAccess().getEventHandlerEventHandlerCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorListener__EventHandlerAssignment_5"


    // $ANTLR start "rule__Precondition__Pre1Assignment_0_0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2924:1: rule__Precondition__Pre1Assignment_0_0 : ( rulePrecondition1 ) ;
    public final void rule__Precondition__Pre1Assignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2928:1: ( ( rulePrecondition1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2929:1: ( rulePrecondition1 )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2929:1: ( rulePrecondition1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2930:1: rulePrecondition1
            {
             before(grammarAccess.getPreconditionAccess().getPre1Precondition1ParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_rulePrecondition1_in_rule__Precondition__Pre1Assignment_0_05899);
            rulePrecondition1();

            state._fsp--;

             after(grammarAccess.getPreconditionAccess().getPre1Precondition1ParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Pre1Assignment_0_0"


    // $ANTLR start "rule__Precondition__OpAssignment_0_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2939:1: rule__Precondition__OpAssignment_0_1 : ( ( rule__Precondition__OpAlternatives_0_1_0 ) ) ;
    public final void rule__Precondition__OpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2943:1: ( ( ( rule__Precondition__OpAlternatives_0_1_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2944:1: ( ( rule__Precondition__OpAlternatives_0_1_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2944:1: ( ( rule__Precondition__OpAlternatives_0_1_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2945:1: ( rule__Precondition__OpAlternatives_0_1_0 )
            {
             before(grammarAccess.getPreconditionAccess().getOpAlternatives_0_1_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2946:1: ( rule__Precondition__OpAlternatives_0_1_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2946:2: rule__Precondition__OpAlternatives_0_1_0
            {
            pushFollow(FOLLOW_rule__Precondition__OpAlternatives_0_1_0_in_rule__Precondition__OpAssignment_0_15930);
            rule__Precondition__OpAlternatives_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPreconditionAccess().getOpAlternatives_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__OpAssignment_0_1"


    // $ANTLR start "rule__Precondition__PreAssignment_0_2"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2955:1: rule__Precondition__PreAssignment_0_2 : ( rulePrecondition ) ;
    public final void rule__Precondition__PreAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2959:1: ( ( rulePrecondition ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2960:1: ( rulePrecondition )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2960:1: ( rulePrecondition )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2961:1: rulePrecondition
            {
             before(grammarAccess.getPreconditionAccess().getPrePreconditionParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_rulePrecondition_in_rule__Precondition__PreAssignment_0_25963);
            rulePrecondition();

            state._fsp--;

             after(grammarAccess.getPreconditionAccess().getPrePreconditionParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__PreAssignment_0_2"


    // $ANTLR start "rule__Precondition__Pre1Assignment_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2970:1: rule__Precondition__Pre1Assignment_1 : ( rulePrecondition1 ) ;
    public final void rule__Precondition__Pre1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2974:1: ( ( rulePrecondition1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2975:1: ( rulePrecondition1 )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2975:1: ( rulePrecondition1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2976:1: rulePrecondition1
            {
             before(grammarAccess.getPreconditionAccess().getPre1Precondition1ParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePrecondition1_in_rule__Precondition__Pre1Assignment_15994);
            rulePrecondition1();

            state._fsp--;

             after(grammarAccess.getPreconditionAccess().getPre1Precondition1ParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Pre1Assignment_1"


    // $ANTLR start "rule__Precondition1__PreAssignment_0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2985:1: rule__Precondition1__PreAssignment_0 : ( ruleSensorValuePrecondition ) ;
    public final void rule__Precondition1__PreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2989:1: ( ( ruleSensorValuePrecondition ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2990:1: ( ruleSensorValuePrecondition )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2990:1: ( ruleSensorValuePrecondition )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2991:1: ruleSensorValuePrecondition
            {
             before(grammarAccess.getPrecondition1Access().getPreSensorValuePreconditionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSensorValuePrecondition_in_rule__Precondition1__PreAssignment_06025);
            ruleSensorValuePrecondition();

            state._fsp--;

             after(grammarAccess.getPrecondition1Access().getPreSensorValuePreconditionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition1__PreAssignment_0"


    // $ANTLR start "rule__Precondition1__PreAssignment_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3000:1: rule__Precondition1__PreAssignment_1 : ( ruleEmptyPrecondition ) ;
    public final void rule__Precondition1__PreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3004:1: ( ( ruleEmptyPrecondition ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3005:1: ( ruleEmptyPrecondition )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3005:1: ( ruleEmptyPrecondition )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3006:1: ruleEmptyPrecondition
            {
             before(grammarAccess.getPrecondition1Access().getPreEmptyPreconditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEmptyPrecondition_in_rule__Precondition1__PreAssignment_16056);
            ruleEmptyPrecondition();

            state._fsp--;

             after(grammarAccess.getPrecondition1Access().getPreEmptyPreconditionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition1__PreAssignment_1"


    // $ANTLR start "rule__EmptyPrecondition__NameAssignment"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3015:1: rule__EmptyPrecondition__NameAssignment : ( RULE_ID ) ;
    public final void rule__EmptyPrecondition__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3019:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3020:1: ( RULE_ID )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3020:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3021:1: RULE_ID
            {
             before(grammarAccess.getEmptyPreconditionAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EmptyPrecondition__NameAssignment6087); 
             after(grammarAccess.getEmptyPreconditionAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyPrecondition__NameAssignment"


    // $ANTLR start "rule__SensorValuePrecondition__SensorAssignment_0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3030:1: rule__SensorValuePrecondition__SensorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SensorValuePrecondition__SensorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3034:1: ( ( ( RULE_ID ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3035:1: ( ( RULE_ID ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3035:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3036:1: ( RULE_ID )
            {
             before(grammarAccess.getSensorValuePreconditionAccess().getSensorSensorCrossReference_0_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3037:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3038:1: RULE_ID
            {
             before(grammarAccess.getSensorValuePreconditionAccess().getSensorSensorIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SensorValuePrecondition__SensorAssignment_06122); 
             after(grammarAccess.getSensorValuePreconditionAccess().getSensorSensorIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSensorValuePreconditionAccess().getSensorSensorCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorValuePrecondition__SensorAssignment_0"


    // $ANTLR start "rule__SensorValuePrecondition__CondAssignment_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3049:1: rule__SensorValuePrecondition__CondAssignment_1 : ( ( rule__SensorValuePrecondition__CondAlternatives_1_0 ) ) ;
    public final void rule__SensorValuePrecondition__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3053:1: ( ( ( rule__SensorValuePrecondition__CondAlternatives_1_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3054:1: ( ( rule__SensorValuePrecondition__CondAlternatives_1_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3054:1: ( ( rule__SensorValuePrecondition__CondAlternatives_1_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3055:1: ( rule__SensorValuePrecondition__CondAlternatives_1_0 )
            {
             before(grammarAccess.getSensorValuePreconditionAccess().getCondAlternatives_1_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3056:1: ( rule__SensorValuePrecondition__CondAlternatives_1_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3056:2: rule__SensorValuePrecondition__CondAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__SensorValuePrecondition__CondAlternatives_1_0_in_rule__SensorValuePrecondition__CondAssignment_16157);
            rule__SensorValuePrecondition__CondAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSensorValuePreconditionAccess().getCondAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorValuePrecondition__CondAssignment_1"


    // $ANTLR start "rule__SensorValuePrecondition__ValueAssignment_2"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3065:1: rule__SensorValuePrecondition__ValueAssignment_2 : ( rulePossibleValues ) ;
    public final void rule__SensorValuePrecondition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3069:1: ( ( rulePossibleValues ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3070:1: ( rulePossibleValues )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3070:1: ( rulePossibleValues )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3071:1: rulePossibleValues
            {
             before(grammarAccess.getSensorValuePreconditionAccess().getValuePossibleValuesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePossibleValues_in_rule__SensorValuePrecondition__ValueAssignment_26190);
            rulePossibleValues();

            state._fsp--;

             after(grammarAccess.getSensorValuePreconditionAccess().getValuePossibleValuesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorValuePrecondition__ValueAssignment_2"


    // $ANTLR start "rule__Timer__EventHandlerAssignment_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3080:1: rule__Timer__EventHandlerAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Timer__EventHandlerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3084:1: ( ( ( RULE_ID ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3085:1: ( ( RULE_ID ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3085:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3086:1: ( RULE_ID )
            {
             before(grammarAccess.getTimerAccess().getEventHandlerEventHandlerCrossReference_1_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3087:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3088:1: RULE_ID
            {
             before(grammarAccess.getTimerAccess().getEventHandlerEventHandlerIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Timer__EventHandlerAssignment_16225); 
             after(grammarAccess.getTimerAccess().getEventHandlerEventHandlerIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTimerAccess().getEventHandlerEventHandlerCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timer__EventHandlerAssignment_1"


    // $ANTLR start "rule__Timer__RepeattypeAssignment_3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3099:1: rule__Timer__RepeattypeAssignment_3 : ( ( rule__Timer__RepeattypeAlternatives_3_0 ) ) ;
    public final void rule__Timer__RepeattypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3103:1: ( ( ( rule__Timer__RepeattypeAlternatives_3_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3104:1: ( ( rule__Timer__RepeattypeAlternatives_3_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3104:1: ( ( rule__Timer__RepeattypeAlternatives_3_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3105:1: ( rule__Timer__RepeattypeAlternatives_3_0 )
            {
             before(grammarAccess.getTimerAccess().getRepeattypeAlternatives_3_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3106:1: ( rule__Timer__RepeattypeAlternatives_3_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3106:2: rule__Timer__RepeattypeAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Timer__RepeattypeAlternatives_3_0_in_rule__Timer__RepeattypeAssignment_36260);
            rule__Timer__RepeattypeAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getRepeattypeAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timer__RepeattypeAssignment_3"


    // $ANTLR start "rule__Timer__TimerSecsAssignment_5"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3115:1: rule__Timer__TimerSecsAssignment_5 : ( RULE_INT ) ;
    public final void rule__Timer__TimerSecsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3119:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3120:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3120:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3121:1: RULE_INT
            {
             before(grammarAccess.getTimerAccess().getTimerSecsINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Timer__TimerSecsAssignment_56293); 
             after(grammarAccess.getTimerAccess().getTimerSecsINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timer__TimerSecsAssignment_5"


    // $ANTLR start "rule__Alarm__EventHandlerAssignment_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3130:1: rule__Alarm__EventHandlerAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Alarm__EventHandlerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3134:1: ( ( ( RULE_ID ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3135:1: ( ( RULE_ID ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3135:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3136:1: ( RULE_ID )
            {
             before(grammarAccess.getAlarmAccess().getEventHandlerEventHandlerCrossReference_1_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3137:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3138:1: RULE_ID
            {
             before(grammarAccess.getAlarmAccess().getEventHandlerEventHandlerIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Alarm__EventHandlerAssignment_16328); 
             after(grammarAccess.getAlarmAccess().getEventHandlerEventHandlerIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAlarmAccess().getEventHandlerEventHandlerCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alarm__EventHandlerAssignment_1"


    // $ANTLR start "rule__Alarm__RepeattypeAssignment_3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3149:1: rule__Alarm__RepeattypeAssignment_3 : ( ( rule__Alarm__RepeattypeAlternatives_3_0 ) ) ;
    public final void rule__Alarm__RepeattypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3153:1: ( ( ( rule__Alarm__RepeattypeAlternatives_3_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3154:1: ( ( rule__Alarm__RepeattypeAlternatives_3_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3154:1: ( ( rule__Alarm__RepeattypeAlternatives_3_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3155:1: ( rule__Alarm__RepeattypeAlternatives_3_0 )
            {
             before(grammarAccess.getAlarmAccess().getRepeattypeAlternatives_3_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3156:1: ( rule__Alarm__RepeattypeAlternatives_3_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3156:2: rule__Alarm__RepeattypeAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Alarm__RepeattypeAlternatives_3_0_in_rule__Alarm__RepeattypeAssignment_36363);
            rule__Alarm__RepeattypeAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getAlarmAccess().getRepeattypeAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alarm__RepeattypeAssignment_3"


    // $ANTLR start "rule__Alarm__TimerHoursAssignment_5"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3165:1: rule__Alarm__TimerHoursAssignment_5 : ( RULE_INT ) ;
    public final void rule__Alarm__TimerHoursAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3169:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3170:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3170:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3171:1: RULE_INT
            {
             before(grammarAccess.getAlarmAccess().getTimerHoursINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Alarm__TimerHoursAssignment_56396); 
             after(grammarAccess.getAlarmAccess().getTimerHoursINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alarm__TimerHoursAssignment_5"


    // $ANTLR start "rule__Alarm__TimerMinutesAssignment_7"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3180:1: rule__Alarm__TimerMinutesAssignment_7 : ( RULE_INT ) ;
    public final void rule__Alarm__TimerMinutesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3184:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3185:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3185:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3186:1: RULE_INT
            {
             before(grammarAccess.getAlarmAccess().getTimerMinutesINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Alarm__TimerMinutesAssignment_76427); 
             after(grammarAccess.getAlarmAccess().getTimerMinutesINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alarm__TimerMinutesAssignment_7"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\12\uffff";
    static final String DFA5_eofS =
        "\1\uffff\1\3\6\uffff\2\3";
    static final String DFA5_minS =
        "\1\6\1\22\2\uffff\4\4\2\22";
    static final String DFA5_maxS =
        "\1\6\1\27\2\uffff\4\5\2\23";
    static final String DFA5_acceptS =
        "\2\uffff\1\1\1\2\6\uffff";
    static final String DFA5_specialS =
        "\12\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\2\2\1\4\1\5\1\6\1\7",
            "",
            "",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "\2\2",
            "\2\2"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "552:1: rule__Precondition__Alternatives : ( ( ( rule__Precondition__Group_0__0 ) ) | ( ( rule__Precondition__Pre1Assignment_1 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDevice_in_entryRuleAbstractDevice121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDevice128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractDevice__Alternatives_in_ruleAbstractDevice154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensor_in_entryRuleSensor181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSensor188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sensor__Group__0_in_ruleSensor214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActuator_in_entryRuleActuator241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActuator248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actuator__Group__0_in_ruleActuator274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventHandler_in_entryRuleEventHandler301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventHandler308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventHandler__Group__0_in_ruleEventHandler334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChangeActuator_in_entryRuleChangeActuator361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChangeActuator368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeActuator__Group__0_in_ruleChangeActuator394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorListener_in_entryRuleSensorListener421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSensorListener428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__0_in_ruleSensorListener454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecondition_in_entryRulePrecondition481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrecondition488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precondition__Alternatives_in_rulePrecondition514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecondition1_in_entryRulePrecondition1541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrecondition1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precondition1__Alternatives_in_rulePrecondition1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyPrecondition_in_entryRuleEmptyPrecondition601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmptyPrecondition608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyPrecondition__NameAssignment_in_ruleEmptyPrecondition634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorValuePrecondition_in_entryRuleSensorValuePrecondition661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSensorValuePrecondition668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorValuePrecondition__Group__0_in_ruleSensorValuePrecondition694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePossibleValues_in_entryRulePossibleValues721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePossibleValues728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PossibleValues__Alternatives_in_rulePossibleValues754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimer_in_entryRuleTimer781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimer788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group__0_in_ruleTimer814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlarm_in_entryRuleAlarm841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlarm848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alarm__Group__0_in_ruleAlarm874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Model__HardwareAlternatives_3_0911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Model__HardwareAlternatives_3_0931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Model__PriorityAlternatives_9_1_0966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Model__PriorityAlternatives_9_1_0986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensor_in_rule__AbstractDevice__Alternatives1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActuator_in_rule__AbstractDevice__Alternatives1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ChangeActuator__ActuatorStateAlternatives_2_01070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ChangeActuator__ActuatorStateAlternatives_2_01090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precondition__Group_0__0_in_rule__Precondition__Alternatives1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precondition__Pre1Assignment_1_in_rule__Precondition__Alternatives1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Precondition__OpAlternatives_0_1_01176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Precondition__OpAlternatives_0_1_01196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precondition1__PreAssignment_0_in_rule__Precondition1__Alternatives1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precondition1__PreAssignment_1_in_rule__Precondition1__Alternatives1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SensorValuePrecondition__CondAlternatives_1_01282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SensorValuePrecondition__CondAlternatives_1_01302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SensorValuePrecondition__CondAlternatives_1_01322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SensorValuePrecondition__CondAlternatives_1_01342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__PossibleValues__Alternatives1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__PossibleValues__Alternatives1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Timer__RepeattypeAlternatives_3_01426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Timer__RepeattypeAlternatives_3_01446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Alarm__RepeattypeAlternatives_3_01481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Alarm__RepeattypeAlternatives_3_01501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Alarm__RepeattypeAlternatives_3_01521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Alarm__RepeattypeAlternatives_3_01541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Alarm__RepeattypeAlternatives_3_01561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Alarm__RepeattypeAlternatives_3_01581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Alarm__RepeattypeAlternatives_3_01601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Alarm__RepeattypeAlternatives_3_01621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01653 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Model__Group__0__Impl1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11715 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21775 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Model__Group__2__Impl1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31837 = new BitSet(new long[]{0x000089B000000000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__HardwareAssignment_3_in_rule__Model__Group__3__Impl1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41897 = new BitSet(new long[]{0x000089B000000000L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DevicesAssignment_4_in_rule__Model__Group__4__Impl1927 = new BitSet(new long[]{0x000000A000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51958 = new BitSet(new long[]{0x000089B000000000L});
    public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__EventHandlersAssignment_5_in_rule__Model__Group__5__Impl1988 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__62019 = new BitSet(new long[]{0x000089B000000000L});
    public static final BitSet FOLLOW_rule__Model__Group__7_in_rule__Model__Group__62022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SensorListenersAssignment_6_in_rule__Model__Group__6__Impl2049 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__72080 = new BitSet(new long[]{0x000089B000000000L});
    public static final BitSet FOLLOW_rule__Model__Group__8_in_rule__Model__Group__72083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TimersAssignment_7_in_rule__Model__Group__7__Impl2110 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__82141 = new BitSet(new long[]{0x000089B000000000L});
    public static final BitSet FOLLOW_rule__Model__Group__9_in_rule__Model__Group__82144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AlarmsAssignment_8_in_rule__Model__Group__8__Impl2171 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__9__Impl_in_rule__Model__Group__92202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_9__0_in_rule__Model__Group__9__Impl2229 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_9__0__Impl_in_rule__Model__Group_9__02280 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Model__Group_9__1_in_rule__Model__Group_9__02283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Model__Group_9__0__Impl2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_9__1__Impl_in_rule__Model__Group_9__12342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PriorityAssignment_9_1_in_rule__Model__Group_9__1__Impl2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sensor__Group__0__Impl_in_rule__Sensor__Group__02403 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Sensor__Group__1_in_rule__Sensor__Group__02406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Sensor__Group__0__Impl2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sensor__Group__1__Impl_in_rule__Sensor__Group__12465 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Sensor__Group__2_in_rule__Sensor__Group__12468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sensor__NameAssignment_1_in_rule__Sensor__Group__1__Impl2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sensor__Group__2__Impl_in_rule__Sensor__Group__22525 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Sensor__Group__3_in_rule__Sensor__Group__22528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Sensor__Group__2__Impl2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sensor__Group__3__Impl_in_rule__Sensor__Group__32587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sensor__PinAssignment_3_in_rule__Sensor__Group__3__Impl2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actuator__Group__0__Impl_in_rule__Actuator__Group__02652 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Actuator__Group__1_in_rule__Actuator__Group__02655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Actuator__Group__0__Impl2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actuator__Group__1__Impl_in_rule__Actuator__Group__12714 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Actuator__Group__2_in_rule__Actuator__Group__12717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actuator__NameAssignment_1_in_rule__Actuator__Group__1__Impl2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actuator__Group__2__Impl_in_rule__Actuator__Group__22774 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Actuator__Group__3_in_rule__Actuator__Group__22777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Actuator__Group__2__Impl2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actuator__Group__3__Impl_in_rule__Actuator__Group__32836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actuator__PinAssignment_3_in_rule__Actuator__Group__3__Impl2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventHandler__Group__0__Impl_in_rule__EventHandler__Group__02901 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EventHandler__Group__1_in_rule__EventHandler__Group__02904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__EventHandler__Group__0__Impl2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventHandler__Group__1__Impl_in_rule__EventHandler__Group__12963 = new BitSet(new long[]{0x0000020000000040L});
    public static final BitSet FOLLOW_rule__EventHandler__Group__2_in_rule__EventHandler__Group__12966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventHandler__NameAssignment_1_in_rule__EventHandler__Group__1__Impl2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventHandler__Group__2__Impl_in_rule__EventHandler__Group__23023 = new BitSet(new long[]{0x0000020000000040L});
    public static final BitSet FOLLOW_rule__EventHandler__Group__3_in_rule__EventHandler__Group__23026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventHandler__ChangeActuatorsAssignment_2_in_rule__EventHandler__Group__2__Impl3053 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__EventHandler__Group__3__Impl_in_rule__EventHandler__Group__33084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EventHandler__Group__3__Impl3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeActuator__Group__0__Impl_in_rule__ChangeActuator__Group__03151 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ChangeActuator__Group__1_in_rule__ChangeActuator__Group__03154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeActuator__ActuatorAssignment_0_in_rule__ChangeActuator__Group__0__Impl3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeActuator__Group__1__Impl_in_rule__ChangeActuator__Group__13211 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__ChangeActuator__Group__2_in_rule__ChangeActuator__Group__13214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ChangeActuator__Group__1__Impl3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeActuator__Group__2__Impl_in_rule__ChangeActuator__Group__23273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeActuator__ActuatorStateAssignment_2_in_rule__ChangeActuator__Group__2__Impl3300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__0__Impl_in_rule__SensorListener__Group__03336 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__1_in_rule__SensorListener__Group__03339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__SensorListener__Group__0__Impl3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__1__Impl_in_rule__SensorListener__Group__13398 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__2_in_rule__SensorListener__Group__13401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__SensorAssignment_1_in_rule__SensorListener__Group__1__Impl3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__2__Impl_in_rule__SensorListener__Group__23458 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__3_in_rule__SensorListener__Group__23461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__SensorListener__Group__2__Impl3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__3__Impl_in_rule__SensorListener__Group__33520 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__4_in_rule__SensorListener__Group__33523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group_3__0_in_rule__SensorListener__Group__3__Impl3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__4__Impl_in_rule__SensorListener__Group__43580 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__5_in_rule__SensorListener__Group__43583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__SensorListener__Group__4__Impl3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__5__Impl_in_rule__SensorListener__Group__53642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__EventHandlerAssignment_5_in_rule__SensorListener__Group__5__Impl3669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group_3__0__Impl_in_rule__SensorListener__Group_3__03711 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SensorListener__Group_3__1_in_rule__SensorListener__Group_3__03714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__TypeAssignment_3_0_in_rule__SensorListener__Group_3__0__Impl3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group_3__1__Impl_in_rule__SensorListener__Group_3__13771 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__SensorListener__Group_3__2_in_rule__SensorListener__Group_3__13774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__LAssignment_3_1_in_rule__SensorListener__Group_3__1__Impl3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group_3__2__Impl_in_rule__SensorListener__Group_3__23831 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SensorListener__Group_3__3_in_rule__SensorListener__Group_3__23834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__SensorListener__Group_3__2__Impl3862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group_3__3__Impl_in_rule__SensorListener__Group_3__33893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__HAssignment_3_3_in_rule__SensorListener__Group_3__3__Impl3920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precondition__Group_0__0__Impl_in_rule__Precondition__Group_0__03958 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Precondition__Group_0__1_in_rule__Precondition__Group_0__03961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precondition__Pre1Assignment_0_0_in_rule__Precondition__Group_0__0__Impl3988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precondition__Group_0__1__Impl_in_rule__Precondition__Group_0__14018 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Precondition__Group_0__2_in_rule__Precondition__Group_0__14021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precondition__OpAssignment_0_1_in_rule__Precondition__Group_0__1__Impl4048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precondition__Group_0__2__Impl_in_rule__Precondition__Group_0__24078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precondition__PreAssignment_0_2_in_rule__Precondition__Group_0__2__Impl4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorValuePrecondition__Group__0__Impl_in_rule__SensorValuePrecondition__Group__04141 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_rule__SensorValuePrecondition__Group__1_in_rule__SensorValuePrecondition__Group__04144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorValuePrecondition__SensorAssignment_0_in_rule__SensorValuePrecondition__Group__0__Impl4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorValuePrecondition__Group__1__Impl_in_rule__SensorValuePrecondition__Group__14201 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__SensorValuePrecondition__Group__2_in_rule__SensorValuePrecondition__Group__14204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorValuePrecondition__CondAssignment_1_in_rule__SensorValuePrecondition__Group__1__Impl4231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorValuePrecondition__Group__2__Impl_in_rule__SensorValuePrecondition__Group__24261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorValuePrecondition__ValueAssignment_2_in_rule__SensorValuePrecondition__Group__2__Impl4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group__0__Impl_in_rule__Timer__Group__04324 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Timer__Group__1_in_rule__Timer__Group__04327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Timer__Group__0__Impl4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group__1__Impl_in_rule__Timer__Group__14386 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__Timer__Group__2_in_rule__Timer__Group__14389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__EventHandlerAssignment_1_in_rule__Timer__Group__1__Impl4416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group__2__Impl_in_rule__Timer__Group__24446 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__Timer__Group__3_in_rule__Timer__Group__24449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Timer__Group__2__Impl4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group__3__Impl_in_rule__Timer__Group__34508 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Timer__Group__4_in_rule__Timer__Group__34511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__RepeattypeAssignment_3_in_rule__Timer__Group__3__Impl4538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group__4__Impl_in_rule__Timer__Group__44568 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Timer__Group__5_in_rule__Timer__Group__44571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Timer__Group__4__Impl4599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group__5__Impl_in_rule__Timer__Group__54630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__TimerSecsAssignment_5_in_rule__Timer__Group__5__Impl4657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alarm__Group__0__Impl_in_rule__Alarm__Group__04699 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Alarm__Group__1_in_rule__Alarm__Group__04702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Alarm__Group__0__Impl4730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alarm__Group__1__Impl_in_rule__Alarm__Group__14761 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__Alarm__Group__2_in_rule__Alarm__Group__14764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alarm__EventHandlerAssignment_1_in_rule__Alarm__Group__1__Impl4791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alarm__Group__2__Impl_in_rule__Alarm__Group__24821 = new BitSet(new long[]{0x00000003FC000000L});
    public static final BitSet FOLLOW_rule__Alarm__Group__3_in_rule__Alarm__Group__24824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Alarm__Group__2__Impl4852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alarm__Group__3__Impl_in_rule__Alarm__Group__34883 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Alarm__Group__4_in_rule__Alarm__Group__34886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alarm__RepeattypeAssignment_3_in_rule__Alarm__Group__3__Impl4913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alarm__Group__4__Impl_in_rule__Alarm__Group__44943 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Alarm__Group__5_in_rule__Alarm__Group__44946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Alarm__Group__4__Impl4974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alarm__Group__5__Impl_in_rule__Alarm__Group__55005 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Alarm__Group__6_in_rule__Alarm__Group__55008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alarm__TimerHoursAssignment_5_in_rule__Alarm__Group__5__Impl5035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alarm__Group__6__Impl_in_rule__Alarm__Group__65065 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Alarm__Group__7_in_rule__Alarm__Group__65068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Alarm__Group__6__Impl5096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alarm__Group__7__Impl_in_rule__Alarm__Group__75127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alarm__TimerMinutesAssignment_7_in_rule__Alarm__Group__7__Impl5154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_15205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__HardwareAlternatives_3_0_in_rule__Model__HardwareAssignment_35236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDevice_in_rule__Model__DevicesAssignment_45269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventHandler_in_rule__Model__EventHandlersAssignment_55300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorListener_in_rule__Model__SensorListenersAssignment_65331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimer_in_rule__Model__TimersAssignment_75362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlarm_in_rule__Model__AlarmsAssignment_85393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PriorityAlternatives_9_1_0_in_rule__Model__PriorityAssignment_9_15424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Sensor__NameAssignment_15457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Sensor__PinAssignment_35488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Actuator__NameAssignment_15519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Actuator__PinAssignment_35550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EventHandler__NameAssignment_15581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChangeActuator_in_rule__EventHandler__ChangeActuatorsAssignment_25612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ChangeActuator__ActuatorAssignment_05647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeActuator__ActuatorStateAlternatives_2_0_in_rule__ChangeActuator__ActuatorStateAssignment_25682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SensorListener__SensorAssignment_15719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__SensorListener__TypeAssignment_3_05759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SensorListener__LAssignment_3_15798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SensorListener__HAssignment_3_35829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SensorListener__EventHandlerAssignment_55864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecondition1_in_rule__Precondition__Pre1Assignment_0_05899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precondition__OpAlternatives_0_1_0_in_rule__Precondition__OpAssignment_0_15930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecondition_in_rule__Precondition__PreAssignment_0_25963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecondition1_in_rule__Precondition__Pre1Assignment_15994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorValuePrecondition_in_rule__Precondition1__PreAssignment_06025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyPrecondition_in_rule__Precondition1__PreAssignment_16056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EmptyPrecondition__NameAssignment6087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SensorValuePrecondition__SensorAssignment_06122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorValuePrecondition__CondAlternatives_1_0_in_rule__SensorValuePrecondition__CondAssignment_16157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePossibleValues_in_rule__SensorValuePrecondition__ValueAssignment_26190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Timer__EventHandlerAssignment_16225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__RepeattypeAlternatives_3_0_in_rule__Timer__RepeattypeAssignment_36260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Timer__TimerSecsAssignment_56293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Alarm__EventHandlerAssignment_16328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alarm__RepeattypeAlternatives_3_0_in_rule__Alarm__RepeattypeAssignment_36363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Alarm__TimerHoursAssignment_56396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Alarm__TimerMinutesAssignment_76427 = new BitSet(new long[]{0x0000000000000002L});

}