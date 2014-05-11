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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Arduino UNO'", "'Raspberry Pi'", "'SENSOR'", "'SCHEDULED'", "'On'", "'Off'", "'&&'", "'||'", "'=='", "'<='", "'>='", "'!='", "'ONCE'", "'EVERY'", "'EVERY DAY'", "'EVERY MONDAY'", "'EVERY TUESDAY'", "'EVERY WEDNESDAY'", "'EVERY THURSDAY'", "'EVERY FRIDAY'", "'EVERY SATURDAY'", "'EVERY SUNDAY'", "'Sketch:'", "'Hardware:'", "'Concurrency Priority:'", "'Sensor'", "'pin'", "';'", "'Actuator'", "'EventHandler'", "':'", "'SensorListener'", "'if'", "'call'", "'AND'", "'action'", "'repeat'", "'seconds:'", "'hours:'", "'minutes:'", "'analog'", "'BETWEEN'"
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
    public static final int T__53=53;
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


    // $ANTLR start "rule__Model__PriorityAlternatives_10_0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:478:1: rule__Model__PriorityAlternatives_10_0 : ( ( 'SENSOR' ) | ( 'SCHEDULED' ) );
    public final void rule__Model__PriorityAlternatives_10_0() throws RecognitionException {

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
                     before(grammarAccess.getModelAccess().getPrioritySENSORKeyword_10_0_0()); 
                    match(input,14,FOLLOW_14_in_rule__Model__PriorityAlternatives_10_0966); 
                     after(grammarAccess.getModelAccess().getPrioritySENSORKeyword_10_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:491:6: ( 'SCHEDULED' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:491:6: ( 'SCHEDULED' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:492:1: 'SCHEDULED'
                    {
                     before(grammarAccess.getModelAccess().getPrioritySCHEDULEDKeyword_10_0_1()); 
                    match(input,15,FOLLOW_15_in_rule__Model__PriorityAlternatives_10_0986); 
                     after(grammarAccess.getModelAccess().getPrioritySCHEDULEDKeyword_10_0_1()); 

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
    // $ANTLR end "rule__Model__PriorityAlternatives_10_0"


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
            else if ( (LA3_0==40) ) {
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

                if ( ((LA7_1>=20 && LA7_1<=23)) ) {
                    alt7=1;
                }
                else if ( (LA7_1==EOF||(LA7_1>=18 && LA7_1<=19)) ) {
                    alt7=2;
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

                if ( (LA12_0==37||LA12_0==40) ) {
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

                if ( (LA13_0==41) ) {
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1053:1: rule__Model__Group__9 : rule__Model__Group__9__Impl rule__Model__Group__10 ;
    public final void rule__Model__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1057:1: ( rule__Model__Group__9__Impl rule__Model__Group__10 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1058:2: rule__Model__Group__9__Impl rule__Model__Group__10
            {
            pushFollow(FOLLOW_rule__Model__Group__9__Impl_in_rule__Model__Group__92202);
            rule__Model__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__10_in_rule__Model__Group__92205);
            rule__Model__Group__10();

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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1065:1: rule__Model__Group__9__Impl : ( 'Concurrency Priority:' ) ;
    public final void rule__Model__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1069:1: ( ( 'Concurrency Priority:' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1070:1: ( 'Concurrency Priority:' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1070:1: ( 'Concurrency Priority:' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1071:1: 'Concurrency Priority:'
            {
             before(grammarAccess.getModelAccess().getConcurrencyPriorityKeyword_9()); 
            match(input,36,FOLLOW_36_in_rule__Model__Group__9__Impl2233); 
             after(grammarAccess.getModelAccess().getConcurrencyPriorityKeyword_9()); 

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


    // $ANTLR start "rule__Model__Group__10"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1084:1: rule__Model__Group__10 : rule__Model__Group__10__Impl ;
    public final void rule__Model__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1088:1: ( rule__Model__Group__10__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1089:2: rule__Model__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__10__Impl_in_rule__Model__Group__102264);
            rule__Model__Group__10__Impl();

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
    // $ANTLR end "rule__Model__Group__10"


    // $ANTLR start "rule__Model__Group__10__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1095:1: rule__Model__Group__10__Impl : ( ( rule__Model__PriorityAssignment_10 ) ) ;
    public final void rule__Model__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1099:1: ( ( ( rule__Model__PriorityAssignment_10 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1100:1: ( ( rule__Model__PriorityAssignment_10 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1100:1: ( ( rule__Model__PriorityAssignment_10 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1101:1: ( rule__Model__PriorityAssignment_10 )
            {
             before(grammarAccess.getModelAccess().getPriorityAssignment_10()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1102:1: ( rule__Model__PriorityAssignment_10 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1102:2: rule__Model__PriorityAssignment_10
            {
            pushFollow(FOLLOW_rule__Model__PriorityAssignment_10_in_rule__Model__Group__10__Impl2291);
            rule__Model__PriorityAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPriorityAssignment_10()); 

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
    // $ANTLR end "rule__Model__Group__10__Impl"


    // $ANTLR start "rule__Sensor__Group__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1134:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1138:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1139:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_rule__Sensor__Group__0__Impl_in_rule__Sensor__Group__02343);
            rule__Sensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sensor__Group__1_in_rule__Sensor__Group__02346);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1146:1: rule__Sensor__Group__0__Impl : ( 'Sensor' ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1150:1: ( ( 'Sensor' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1151:1: ( 'Sensor' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1151:1: ( 'Sensor' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1152:1: 'Sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Sensor__Group__0__Impl2374); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1165:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1169:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1170:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
            {
            pushFollow(FOLLOW_rule__Sensor__Group__1__Impl_in_rule__Sensor__Group__12405);
            rule__Sensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sensor__Group__2_in_rule__Sensor__Group__12408);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1177:1: rule__Sensor__Group__1__Impl : ( ( rule__Sensor__NameAssignment_1 ) ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1181:1: ( ( ( rule__Sensor__NameAssignment_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1182:1: ( ( rule__Sensor__NameAssignment_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1182:1: ( ( rule__Sensor__NameAssignment_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1183:1: ( rule__Sensor__NameAssignment_1 )
            {
             before(grammarAccess.getSensorAccess().getNameAssignment_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1184:1: ( rule__Sensor__NameAssignment_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1184:2: rule__Sensor__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Sensor__NameAssignment_1_in_rule__Sensor__Group__1__Impl2435);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1194:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl rule__Sensor__Group__3 ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1198:1: ( rule__Sensor__Group__2__Impl rule__Sensor__Group__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1199:2: rule__Sensor__Group__2__Impl rule__Sensor__Group__3
            {
            pushFollow(FOLLOW_rule__Sensor__Group__2__Impl_in_rule__Sensor__Group__22465);
            rule__Sensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sensor__Group__3_in_rule__Sensor__Group__22468);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1206:1: rule__Sensor__Group__2__Impl : ( 'pin' ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1210:1: ( ( 'pin' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1211:1: ( 'pin' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1211:1: ( 'pin' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1212:1: 'pin'
            {
             before(grammarAccess.getSensorAccess().getPinKeyword_2()); 
            match(input,38,FOLLOW_38_in_rule__Sensor__Group__2__Impl2496); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1225:1: rule__Sensor__Group__3 : rule__Sensor__Group__3__Impl rule__Sensor__Group__4 ;
    public final void rule__Sensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1229:1: ( rule__Sensor__Group__3__Impl rule__Sensor__Group__4 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1230:2: rule__Sensor__Group__3__Impl rule__Sensor__Group__4
            {
            pushFollow(FOLLOW_rule__Sensor__Group__3__Impl_in_rule__Sensor__Group__32527);
            rule__Sensor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sensor__Group__4_in_rule__Sensor__Group__32530);
            rule__Sensor__Group__4();

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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1237:1: rule__Sensor__Group__3__Impl : ( ( rule__Sensor__PinAssignment_3 ) ) ;
    public final void rule__Sensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1241:1: ( ( ( rule__Sensor__PinAssignment_3 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1242:1: ( ( rule__Sensor__PinAssignment_3 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1242:1: ( ( rule__Sensor__PinAssignment_3 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1243:1: ( rule__Sensor__PinAssignment_3 )
            {
             before(grammarAccess.getSensorAccess().getPinAssignment_3()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1244:1: ( rule__Sensor__PinAssignment_3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1244:2: rule__Sensor__PinAssignment_3
            {
            pushFollow(FOLLOW_rule__Sensor__PinAssignment_3_in_rule__Sensor__Group__3__Impl2557);
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


    // $ANTLR start "rule__Sensor__Group__4"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1254:1: rule__Sensor__Group__4 : rule__Sensor__Group__4__Impl rule__Sensor__Group__5 ;
    public final void rule__Sensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1258:1: ( rule__Sensor__Group__4__Impl rule__Sensor__Group__5 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1259:2: rule__Sensor__Group__4__Impl rule__Sensor__Group__5
            {
            pushFollow(FOLLOW_rule__Sensor__Group__4__Impl_in_rule__Sensor__Group__42587);
            rule__Sensor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sensor__Group__5_in_rule__Sensor__Group__42590);
            rule__Sensor__Group__5();

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
    // $ANTLR end "rule__Sensor__Group__4"


    // $ANTLR start "rule__Sensor__Group__4__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1266:1: rule__Sensor__Group__4__Impl : ( ( rule__Sensor__AnalogAssignment_4 )? ) ;
    public final void rule__Sensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1270:1: ( ( ( rule__Sensor__AnalogAssignment_4 )? ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1271:1: ( ( rule__Sensor__AnalogAssignment_4 )? )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1271:1: ( ( rule__Sensor__AnalogAssignment_4 )? )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1272:1: ( rule__Sensor__AnalogAssignment_4 )?
            {
             before(grammarAccess.getSensorAccess().getAnalogAssignment_4()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1273:1: ( rule__Sensor__AnalogAssignment_4 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==52) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1273:2: rule__Sensor__AnalogAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Sensor__AnalogAssignment_4_in_rule__Sensor__Group__4__Impl2617);
                    rule__Sensor__AnalogAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorAccess().getAnalogAssignment_4()); 

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
    // $ANTLR end "rule__Sensor__Group__4__Impl"


    // $ANTLR start "rule__Sensor__Group__5"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1283:1: rule__Sensor__Group__5 : rule__Sensor__Group__5__Impl ;
    public final void rule__Sensor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1287:1: ( rule__Sensor__Group__5__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1288:2: rule__Sensor__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Sensor__Group__5__Impl_in_rule__Sensor__Group__52648);
            rule__Sensor__Group__5__Impl();

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
    // $ANTLR end "rule__Sensor__Group__5"


    // $ANTLR start "rule__Sensor__Group__5__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1294:1: rule__Sensor__Group__5__Impl : ( ';' ) ;
    public final void rule__Sensor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1298:1: ( ( ';' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1299:1: ( ';' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1299:1: ( ';' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1300:1: ';'
            {
             before(grammarAccess.getSensorAccess().getSemicolonKeyword_5()); 
            match(input,39,FOLLOW_39_in_rule__Sensor__Group__5__Impl2676); 
             after(grammarAccess.getSensorAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__Sensor__Group__5__Impl"


    // $ANTLR start "rule__Actuator__Group__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1325:1: rule__Actuator__Group__0 : rule__Actuator__Group__0__Impl rule__Actuator__Group__1 ;
    public final void rule__Actuator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1329:1: ( rule__Actuator__Group__0__Impl rule__Actuator__Group__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1330:2: rule__Actuator__Group__0__Impl rule__Actuator__Group__1
            {
            pushFollow(FOLLOW_rule__Actuator__Group__0__Impl_in_rule__Actuator__Group__02719);
            rule__Actuator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Actuator__Group__1_in_rule__Actuator__Group__02722);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1337:1: rule__Actuator__Group__0__Impl : ( 'Actuator' ) ;
    public final void rule__Actuator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1341:1: ( ( 'Actuator' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1342:1: ( 'Actuator' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1342:1: ( 'Actuator' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1343:1: 'Actuator'
            {
             before(grammarAccess.getActuatorAccess().getActuatorKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Actuator__Group__0__Impl2750); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1356:1: rule__Actuator__Group__1 : rule__Actuator__Group__1__Impl rule__Actuator__Group__2 ;
    public final void rule__Actuator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1360:1: ( rule__Actuator__Group__1__Impl rule__Actuator__Group__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1361:2: rule__Actuator__Group__1__Impl rule__Actuator__Group__2
            {
            pushFollow(FOLLOW_rule__Actuator__Group__1__Impl_in_rule__Actuator__Group__12781);
            rule__Actuator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Actuator__Group__2_in_rule__Actuator__Group__12784);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1368:1: rule__Actuator__Group__1__Impl : ( ( rule__Actuator__NameAssignment_1 ) ) ;
    public final void rule__Actuator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1372:1: ( ( ( rule__Actuator__NameAssignment_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1373:1: ( ( rule__Actuator__NameAssignment_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1373:1: ( ( rule__Actuator__NameAssignment_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1374:1: ( rule__Actuator__NameAssignment_1 )
            {
             before(grammarAccess.getActuatorAccess().getNameAssignment_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1375:1: ( rule__Actuator__NameAssignment_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1375:2: rule__Actuator__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Actuator__NameAssignment_1_in_rule__Actuator__Group__1__Impl2811);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1385:1: rule__Actuator__Group__2 : rule__Actuator__Group__2__Impl rule__Actuator__Group__3 ;
    public final void rule__Actuator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1389:1: ( rule__Actuator__Group__2__Impl rule__Actuator__Group__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1390:2: rule__Actuator__Group__2__Impl rule__Actuator__Group__3
            {
            pushFollow(FOLLOW_rule__Actuator__Group__2__Impl_in_rule__Actuator__Group__22841);
            rule__Actuator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Actuator__Group__3_in_rule__Actuator__Group__22844);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1397:1: rule__Actuator__Group__2__Impl : ( 'pin' ) ;
    public final void rule__Actuator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1401:1: ( ( 'pin' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1402:1: ( 'pin' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1402:1: ( 'pin' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1403:1: 'pin'
            {
             before(grammarAccess.getActuatorAccess().getPinKeyword_2()); 
            match(input,38,FOLLOW_38_in_rule__Actuator__Group__2__Impl2872); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1416:1: rule__Actuator__Group__3 : rule__Actuator__Group__3__Impl rule__Actuator__Group__4 ;
    public final void rule__Actuator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1420:1: ( rule__Actuator__Group__3__Impl rule__Actuator__Group__4 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1421:2: rule__Actuator__Group__3__Impl rule__Actuator__Group__4
            {
            pushFollow(FOLLOW_rule__Actuator__Group__3__Impl_in_rule__Actuator__Group__32903);
            rule__Actuator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Actuator__Group__4_in_rule__Actuator__Group__32906);
            rule__Actuator__Group__4();

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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1428:1: rule__Actuator__Group__3__Impl : ( ( rule__Actuator__PinAssignment_3 ) ) ;
    public final void rule__Actuator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1432:1: ( ( ( rule__Actuator__PinAssignment_3 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1433:1: ( ( rule__Actuator__PinAssignment_3 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1433:1: ( ( rule__Actuator__PinAssignment_3 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1434:1: ( rule__Actuator__PinAssignment_3 )
            {
             before(grammarAccess.getActuatorAccess().getPinAssignment_3()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1435:1: ( rule__Actuator__PinAssignment_3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1435:2: rule__Actuator__PinAssignment_3
            {
            pushFollow(FOLLOW_rule__Actuator__PinAssignment_3_in_rule__Actuator__Group__3__Impl2933);
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


    // $ANTLR start "rule__Actuator__Group__4"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1445:1: rule__Actuator__Group__4 : rule__Actuator__Group__4__Impl ;
    public final void rule__Actuator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1449:1: ( rule__Actuator__Group__4__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1450:2: rule__Actuator__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Actuator__Group__4__Impl_in_rule__Actuator__Group__42963);
            rule__Actuator__Group__4__Impl();

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
    // $ANTLR end "rule__Actuator__Group__4"


    // $ANTLR start "rule__Actuator__Group__4__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1456:1: rule__Actuator__Group__4__Impl : ( ';' ) ;
    public final void rule__Actuator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1460:1: ( ( ';' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1461:1: ( ';' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1461:1: ( ';' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1462:1: ';'
            {
             before(grammarAccess.getActuatorAccess().getSemicolonKeyword_4()); 
            match(input,39,FOLLOW_39_in_rule__Actuator__Group__4__Impl2991); 
             after(grammarAccess.getActuatorAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__Actuator__Group__4__Impl"


    // $ANTLR start "rule__EventHandler__Group__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1485:1: rule__EventHandler__Group__0 : rule__EventHandler__Group__0__Impl rule__EventHandler__Group__1 ;
    public final void rule__EventHandler__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1489:1: ( rule__EventHandler__Group__0__Impl rule__EventHandler__Group__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1490:2: rule__EventHandler__Group__0__Impl rule__EventHandler__Group__1
            {
            pushFollow(FOLLOW_rule__EventHandler__Group__0__Impl_in_rule__EventHandler__Group__03032);
            rule__EventHandler__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventHandler__Group__1_in_rule__EventHandler__Group__03035);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1497:1: rule__EventHandler__Group__0__Impl : ( 'EventHandler' ) ;
    public final void rule__EventHandler__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1501:1: ( ( 'EventHandler' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1502:1: ( 'EventHandler' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1502:1: ( 'EventHandler' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1503:1: 'EventHandler'
            {
             before(grammarAccess.getEventHandlerAccess().getEventHandlerKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__EventHandler__Group__0__Impl3063); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1516:1: rule__EventHandler__Group__1 : rule__EventHandler__Group__1__Impl rule__EventHandler__Group__2 ;
    public final void rule__EventHandler__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1520:1: ( rule__EventHandler__Group__1__Impl rule__EventHandler__Group__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1521:2: rule__EventHandler__Group__1__Impl rule__EventHandler__Group__2
            {
            pushFollow(FOLLOW_rule__EventHandler__Group__1__Impl_in_rule__EventHandler__Group__13094);
            rule__EventHandler__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventHandler__Group__2_in_rule__EventHandler__Group__13097);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1528:1: rule__EventHandler__Group__1__Impl : ( ( rule__EventHandler__NameAssignment_1 ) ) ;
    public final void rule__EventHandler__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1532:1: ( ( ( rule__EventHandler__NameAssignment_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1533:1: ( ( rule__EventHandler__NameAssignment_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1533:1: ( ( rule__EventHandler__NameAssignment_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1534:1: ( rule__EventHandler__NameAssignment_1 )
            {
             before(grammarAccess.getEventHandlerAccess().getNameAssignment_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1535:1: ( rule__EventHandler__NameAssignment_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1535:2: rule__EventHandler__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EventHandler__NameAssignment_1_in_rule__EventHandler__Group__1__Impl3124);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1545:1: rule__EventHandler__Group__2 : rule__EventHandler__Group__2__Impl rule__EventHandler__Group__3 ;
    public final void rule__EventHandler__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1549:1: ( rule__EventHandler__Group__2__Impl rule__EventHandler__Group__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1550:2: rule__EventHandler__Group__2__Impl rule__EventHandler__Group__3
            {
            pushFollow(FOLLOW_rule__EventHandler__Group__2__Impl_in_rule__EventHandler__Group__23154);
            rule__EventHandler__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventHandler__Group__3_in_rule__EventHandler__Group__23157);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1557:1: rule__EventHandler__Group__2__Impl : ( ( rule__EventHandler__ChangeActuatorsAssignment_2 )* ) ;
    public final void rule__EventHandler__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1561:1: ( ( ( rule__EventHandler__ChangeActuatorsAssignment_2 )* ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1562:1: ( ( rule__EventHandler__ChangeActuatorsAssignment_2 )* )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1562:1: ( ( rule__EventHandler__ChangeActuatorsAssignment_2 )* )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1563:1: ( rule__EventHandler__ChangeActuatorsAssignment_2 )*
            {
             before(grammarAccess.getEventHandlerAccess().getChangeActuatorsAssignment_2()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1564:1: ( rule__EventHandler__ChangeActuatorsAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1564:2: rule__EventHandler__ChangeActuatorsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__EventHandler__ChangeActuatorsAssignment_2_in_rule__EventHandler__Group__2__Impl3184);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1574:1: rule__EventHandler__Group__3 : rule__EventHandler__Group__3__Impl ;
    public final void rule__EventHandler__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1578:1: ( rule__EventHandler__Group__3__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1579:2: rule__EventHandler__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EventHandler__Group__3__Impl_in_rule__EventHandler__Group__33215);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1585:1: rule__EventHandler__Group__3__Impl : ( ';' ) ;
    public final void rule__EventHandler__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1589:1: ( ( ';' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1590:1: ( ';' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1590:1: ( ';' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1591:1: ';'
            {
             before(grammarAccess.getEventHandlerAccess().getSemicolonKeyword_3()); 
            match(input,39,FOLLOW_39_in_rule__EventHandler__Group__3__Impl3243); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1612:1: rule__ChangeActuator__Group__0 : rule__ChangeActuator__Group__0__Impl rule__ChangeActuator__Group__1 ;
    public final void rule__ChangeActuator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1616:1: ( rule__ChangeActuator__Group__0__Impl rule__ChangeActuator__Group__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1617:2: rule__ChangeActuator__Group__0__Impl rule__ChangeActuator__Group__1
            {
            pushFollow(FOLLOW_rule__ChangeActuator__Group__0__Impl_in_rule__ChangeActuator__Group__03282);
            rule__ChangeActuator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChangeActuator__Group__1_in_rule__ChangeActuator__Group__03285);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1624:1: rule__ChangeActuator__Group__0__Impl : ( ( rule__ChangeActuator__ActuatorAssignment_0 ) ) ;
    public final void rule__ChangeActuator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1628:1: ( ( ( rule__ChangeActuator__ActuatorAssignment_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1629:1: ( ( rule__ChangeActuator__ActuatorAssignment_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1629:1: ( ( rule__ChangeActuator__ActuatorAssignment_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1630:1: ( rule__ChangeActuator__ActuatorAssignment_0 )
            {
             before(grammarAccess.getChangeActuatorAccess().getActuatorAssignment_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1631:1: ( rule__ChangeActuator__ActuatorAssignment_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1631:2: rule__ChangeActuator__ActuatorAssignment_0
            {
            pushFollow(FOLLOW_rule__ChangeActuator__ActuatorAssignment_0_in_rule__ChangeActuator__Group__0__Impl3312);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1641:1: rule__ChangeActuator__Group__1 : rule__ChangeActuator__Group__1__Impl rule__ChangeActuator__Group__2 ;
    public final void rule__ChangeActuator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1645:1: ( rule__ChangeActuator__Group__1__Impl rule__ChangeActuator__Group__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1646:2: rule__ChangeActuator__Group__1__Impl rule__ChangeActuator__Group__2
            {
            pushFollow(FOLLOW_rule__ChangeActuator__Group__1__Impl_in_rule__ChangeActuator__Group__13342);
            rule__ChangeActuator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChangeActuator__Group__2_in_rule__ChangeActuator__Group__13345);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1653:1: rule__ChangeActuator__Group__1__Impl : ( ':' ) ;
    public final void rule__ChangeActuator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1657:1: ( ( ':' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1658:1: ( ':' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1658:1: ( ':' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1659:1: ':'
            {
             before(grammarAccess.getChangeActuatorAccess().getColonKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__ChangeActuator__Group__1__Impl3373); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1672:1: rule__ChangeActuator__Group__2 : rule__ChangeActuator__Group__2__Impl ;
    public final void rule__ChangeActuator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1676:1: ( rule__ChangeActuator__Group__2__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1677:2: rule__ChangeActuator__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ChangeActuator__Group__2__Impl_in_rule__ChangeActuator__Group__23404);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1683:1: rule__ChangeActuator__Group__2__Impl : ( ( rule__ChangeActuator__ActuatorStateAssignment_2 ) ) ;
    public final void rule__ChangeActuator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1687:1: ( ( ( rule__ChangeActuator__ActuatorStateAssignment_2 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1688:1: ( ( rule__ChangeActuator__ActuatorStateAssignment_2 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1688:1: ( ( rule__ChangeActuator__ActuatorStateAssignment_2 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1689:1: ( rule__ChangeActuator__ActuatorStateAssignment_2 )
            {
             before(grammarAccess.getChangeActuatorAccess().getActuatorStateAssignment_2()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1690:1: ( rule__ChangeActuator__ActuatorStateAssignment_2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1690:2: rule__ChangeActuator__ActuatorStateAssignment_2
            {
            pushFollow(FOLLOW_rule__ChangeActuator__ActuatorStateAssignment_2_in_rule__ChangeActuator__Group__2__Impl3431);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1706:1: rule__SensorListener__Group__0 : rule__SensorListener__Group__0__Impl rule__SensorListener__Group__1 ;
    public final void rule__SensorListener__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1710:1: ( rule__SensorListener__Group__0__Impl rule__SensorListener__Group__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1711:2: rule__SensorListener__Group__0__Impl rule__SensorListener__Group__1
            {
            pushFollow(FOLLOW_rule__SensorListener__Group__0__Impl_in_rule__SensorListener__Group__03467);
            rule__SensorListener__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorListener__Group__1_in_rule__SensorListener__Group__03470);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1718:1: rule__SensorListener__Group__0__Impl : ( 'SensorListener' ) ;
    public final void rule__SensorListener__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1722:1: ( ( 'SensorListener' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1723:1: ( 'SensorListener' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1723:1: ( 'SensorListener' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1724:1: 'SensorListener'
            {
             before(grammarAccess.getSensorListenerAccess().getSensorListenerKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__SensorListener__Group__0__Impl3498); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1737:1: rule__SensorListener__Group__1 : rule__SensorListener__Group__1__Impl rule__SensorListener__Group__2 ;
    public final void rule__SensorListener__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1741:1: ( rule__SensorListener__Group__1__Impl rule__SensorListener__Group__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1742:2: rule__SensorListener__Group__1__Impl rule__SensorListener__Group__2
            {
            pushFollow(FOLLOW_rule__SensorListener__Group__1__Impl_in_rule__SensorListener__Group__13529);
            rule__SensorListener__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorListener__Group__2_in_rule__SensorListener__Group__13532);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1749:1: rule__SensorListener__Group__1__Impl : ( ( rule__SensorListener__SensorAssignment_1 ) ) ;
    public final void rule__SensorListener__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1753:1: ( ( ( rule__SensorListener__SensorAssignment_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1754:1: ( ( rule__SensorListener__SensorAssignment_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1754:1: ( ( rule__SensorListener__SensorAssignment_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1755:1: ( rule__SensorListener__SensorAssignment_1 )
            {
             before(grammarAccess.getSensorListenerAccess().getSensorAssignment_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1756:1: ( rule__SensorListener__SensorAssignment_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1756:2: rule__SensorListener__SensorAssignment_1
            {
            pushFollow(FOLLOW_rule__SensorListener__SensorAssignment_1_in_rule__SensorListener__Group__1__Impl3559);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1766:1: rule__SensorListener__Group__2 : rule__SensorListener__Group__2__Impl rule__SensorListener__Group__3 ;
    public final void rule__SensorListener__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1770:1: ( rule__SensorListener__Group__2__Impl rule__SensorListener__Group__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1771:2: rule__SensorListener__Group__2__Impl rule__SensorListener__Group__3
            {
            pushFollow(FOLLOW_rule__SensorListener__Group__2__Impl_in_rule__SensorListener__Group__23589);
            rule__SensorListener__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorListener__Group__3_in_rule__SensorListener__Group__23592);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1778:1: rule__SensorListener__Group__2__Impl : ( 'if' ) ;
    public final void rule__SensorListener__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1782:1: ( ( 'if' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1783:1: ( 'if' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1783:1: ( 'if' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1784:1: 'if'
            {
             before(grammarAccess.getSensorListenerAccess().getIfKeyword_2()); 
            match(input,44,FOLLOW_44_in_rule__SensorListener__Group__2__Impl3620); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1797:1: rule__SensorListener__Group__3 : rule__SensorListener__Group__3__Impl rule__SensorListener__Group__4 ;
    public final void rule__SensorListener__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1801:1: ( rule__SensorListener__Group__3__Impl rule__SensorListener__Group__4 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1802:2: rule__SensorListener__Group__3__Impl rule__SensorListener__Group__4
            {
            pushFollow(FOLLOW_rule__SensorListener__Group__3__Impl_in_rule__SensorListener__Group__33651);
            rule__SensorListener__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorListener__Group__4_in_rule__SensorListener__Group__33654);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1809:1: rule__SensorListener__Group__3__Impl : ( ( rule__SensorListener__Group_3__0 ) ) ;
    public final void rule__SensorListener__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1813:1: ( ( ( rule__SensorListener__Group_3__0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1814:1: ( ( rule__SensorListener__Group_3__0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1814:1: ( ( rule__SensorListener__Group_3__0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1815:1: ( rule__SensorListener__Group_3__0 )
            {
             before(grammarAccess.getSensorListenerAccess().getGroup_3()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1816:1: ( rule__SensorListener__Group_3__0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1816:2: rule__SensorListener__Group_3__0
            {
            pushFollow(FOLLOW_rule__SensorListener__Group_3__0_in_rule__SensorListener__Group__3__Impl3681);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1826:1: rule__SensorListener__Group__4 : rule__SensorListener__Group__4__Impl rule__SensorListener__Group__5 ;
    public final void rule__SensorListener__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1830:1: ( rule__SensorListener__Group__4__Impl rule__SensorListener__Group__5 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1831:2: rule__SensorListener__Group__4__Impl rule__SensorListener__Group__5
            {
            pushFollow(FOLLOW_rule__SensorListener__Group__4__Impl_in_rule__SensorListener__Group__43711);
            rule__SensorListener__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorListener__Group__5_in_rule__SensorListener__Group__43714);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1838:1: rule__SensorListener__Group__4__Impl : ( 'call' ) ;
    public final void rule__SensorListener__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1842:1: ( ( 'call' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1843:1: ( 'call' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1843:1: ( 'call' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1844:1: 'call'
            {
             before(grammarAccess.getSensorListenerAccess().getCallKeyword_4()); 
            match(input,45,FOLLOW_45_in_rule__SensorListener__Group__4__Impl3742); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1857:1: rule__SensorListener__Group__5 : rule__SensorListener__Group__5__Impl rule__SensorListener__Group__6 ;
    public final void rule__SensorListener__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1861:1: ( rule__SensorListener__Group__5__Impl rule__SensorListener__Group__6 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1862:2: rule__SensorListener__Group__5__Impl rule__SensorListener__Group__6
            {
            pushFollow(FOLLOW_rule__SensorListener__Group__5__Impl_in_rule__SensorListener__Group__53773);
            rule__SensorListener__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorListener__Group__6_in_rule__SensorListener__Group__53776);
            rule__SensorListener__Group__6();

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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1869:1: rule__SensorListener__Group__5__Impl : ( ( rule__SensorListener__EventHandlerAssignment_5 ) ) ;
    public final void rule__SensorListener__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1873:1: ( ( ( rule__SensorListener__EventHandlerAssignment_5 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1874:1: ( ( rule__SensorListener__EventHandlerAssignment_5 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1874:1: ( ( rule__SensorListener__EventHandlerAssignment_5 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1875:1: ( rule__SensorListener__EventHandlerAssignment_5 )
            {
             before(grammarAccess.getSensorListenerAccess().getEventHandlerAssignment_5()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1876:1: ( rule__SensorListener__EventHandlerAssignment_5 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1876:2: rule__SensorListener__EventHandlerAssignment_5
            {
            pushFollow(FOLLOW_rule__SensorListener__EventHandlerAssignment_5_in_rule__SensorListener__Group__5__Impl3803);
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


    // $ANTLR start "rule__SensorListener__Group__6"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1886:1: rule__SensorListener__Group__6 : rule__SensorListener__Group__6__Impl ;
    public final void rule__SensorListener__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1890:1: ( rule__SensorListener__Group__6__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1891:2: rule__SensorListener__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__SensorListener__Group__6__Impl_in_rule__SensorListener__Group__63833);
            rule__SensorListener__Group__6__Impl();

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
    // $ANTLR end "rule__SensorListener__Group__6"


    // $ANTLR start "rule__SensorListener__Group__6__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1897:1: rule__SensorListener__Group__6__Impl : ( ';' ) ;
    public final void rule__SensorListener__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1901:1: ( ( ';' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1902:1: ( ';' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1902:1: ( ';' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1903:1: ';'
            {
             before(grammarAccess.getSensorListenerAccess().getSemicolonKeyword_6()); 
            match(input,39,FOLLOW_39_in_rule__SensorListener__Group__6__Impl3861); 
             after(grammarAccess.getSensorListenerAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__SensorListener__Group__6__Impl"


    // $ANTLR start "rule__SensorListener__Group_3__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1930:1: rule__SensorListener__Group_3__0 : rule__SensorListener__Group_3__0__Impl rule__SensorListener__Group_3__1 ;
    public final void rule__SensorListener__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1934:1: ( rule__SensorListener__Group_3__0__Impl rule__SensorListener__Group_3__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1935:2: rule__SensorListener__Group_3__0__Impl rule__SensorListener__Group_3__1
            {
            pushFollow(FOLLOW_rule__SensorListener__Group_3__0__Impl_in_rule__SensorListener__Group_3__03906);
            rule__SensorListener__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorListener__Group_3__1_in_rule__SensorListener__Group_3__03909);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1942:1: rule__SensorListener__Group_3__0__Impl : ( ( rule__SensorListener__TypeAssignment_3_0 ) ) ;
    public final void rule__SensorListener__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1946:1: ( ( ( rule__SensorListener__TypeAssignment_3_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1947:1: ( ( rule__SensorListener__TypeAssignment_3_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1947:1: ( ( rule__SensorListener__TypeAssignment_3_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1948:1: ( rule__SensorListener__TypeAssignment_3_0 )
            {
             before(grammarAccess.getSensorListenerAccess().getTypeAssignment_3_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1949:1: ( rule__SensorListener__TypeAssignment_3_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1949:2: rule__SensorListener__TypeAssignment_3_0
            {
            pushFollow(FOLLOW_rule__SensorListener__TypeAssignment_3_0_in_rule__SensorListener__Group_3__0__Impl3936);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1959:1: rule__SensorListener__Group_3__1 : rule__SensorListener__Group_3__1__Impl rule__SensorListener__Group_3__2 ;
    public final void rule__SensorListener__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1963:1: ( rule__SensorListener__Group_3__1__Impl rule__SensorListener__Group_3__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1964:2: rule__SensorListener__Group_3__1__Impl rule__SensorListener__Group_3__2
            {
            pushFollow(FOLLOW_rule__SensorListener__Group_3__1__Impl_in_rule__SensorListener__Group_3__13966);
            rule__SensorListener__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorListener__Group_3__2_in_rule__SensorListener__Group_3__13969);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1971:1: rule__SensorListener__Group_3__1__Impl : ( ( rule__SensorListener__LAssignment_3_1 ) ) ;
    public final void rule__SensorListener__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1975:1: ( ( ( rule__SensorListener__LAssignment_3_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1976:1: ( ( rule__SensorListener__LAssignment_3_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1976:1: ( ( rule__SensorListener__LAssignment_3_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1977:1: ( rule__SensorListener__LAssignment_3_1 )
            {
             before(grammarAccess.getSensorListenerAccess().getLAssignment_3_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1978:1: ( rule__SensorListener__LAssignment_3_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1978:2: rule__SensorListener__LAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SensorListener__LAssignment_3_1_in_rule__SensorListener__Group_3__1__Impl3996);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1988:1: rule__SensorListener__Group_3__2 : rule__SensorListener__Group_3__2__Impl rule__SensorListener__Group_3__3 ;
    public final void rule__SensorListener__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1992:1: ( rule__SensorListener__Group_3__2__Impl rule__SensorListener__Group_3__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1993:2: rule__SensorListener__Group_3__2__Impl rule__SensorListener__Group_3__3
            {
            pushFollow(FOLLOW_rule__SensorListener__Group_3__2__Impl_in_rule__SensorListener__Group_3__24026);
            rule__SensorListener__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorListener__Group_3__3_in_rule__SensorListener__Group_3__24029);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2000:1: rule__SensorListener__Group_3__2__Impl : ( 'AND' ) ;
    public final void rule__SensorListener__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2004:1: ( ( 'AND' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2005:1: ( 'AND' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2005:1: ( 'AND' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2006:1: 'AND'
            {
             before(grammarAccess.getSensorListenerAccess().getANDKeyword_3_2()); 
            match(input,46,FOLLOW_46_in_rule__SensorListener__Group_3__2__Impl4057); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2019:1: rule__SensorListener__Group_3__3 : rule__SensorListener__Group_3__3__Impl ;
    public final void rule__SensorListener__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2023:1: ( rule__SensorListener__Group_3__3__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2024:2: rule__SensorListener__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__SensorListener__Group_3__3__Impl_in_rule__SensorListener__Group_3__34088);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2030:1: rule__SensorListener__Group_3__3__Impl : ( ( rule__SensorListener__HAssignment_3_3 ) ) ;
    public final void rule__SensorListener__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2034:1: ( ( ( rule__SensorListener__HAssignment_3_3 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2035:1: ( ( rule__SensorListener__HAssignment_3_3 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2035:1: ( ( rule__SensorListener__HAssignment_3_3 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2036:1: ( rule__SensorListener__HAssignment_3_3 )
            {
             before(grammarAccess.getSensorListenerAccess().getHAssignment_3_3()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2037:1: ( rule__SensorListener__HAssignment_3_3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2037:2: rule__SensorListener__HAssignment_3_3
            {
            pushFollow(FOLLOW_rule__SensorListener__HAssignment_3_3_in_rule__SensorListener__Group_3__3__Impl4115);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2055:1: rule__Precondition__Group_0__0 : rule__Precondition__Group_0__0__Impl rule__Precondition__Group_0__1 ;
    public final void rule__Precondition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2059:1: ( rule__Precondition__Group_0__0__Impl rule__Precondition__Group_0__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2060:2: rule__Precondition__Group_0__0__Impl rule__Precondition__Group_0__1
            {
            pushFollow(FOLLOW_rule__Precondition__Group_0__0__Impl_in_rule__Precondition__Group_0__04153);
            rule__Precondition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precondition__Group_0__1_in_rule__Precondition__Group_0__04156);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2067:1: rule__Precondition__Group_0__0__Impl : ( ( rule__Precondition__Pre1Assignment_0_0 ) ) ;
    public final void rule__Precondition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2071:1: ( ( ( rule__Precondition__Pre1Assignment_0_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2072:1: ( ( rule__Precondition__Pre1Assignment_0_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2072:1: ( ( rule__Precondition__Pre1Assignment_0_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2073:1: ( rule__Precondition__Pre1Assignment_0_0 )
            {
             before(grammarAccess.getPreconditionAccess().getPre1Assignment_0_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2074:1: ( rule__Precondition__Pre1Assignment_0_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2074:2: rule__Precondition__Pre1Assignment_0_0
            {
            pushFollow(FOLLOW_rule__Precondition__Pre1Assignment_0_0_in_rule__Precondition__Group_0__0__Impl4183);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2084:1: rule__Precondition__Group_0__1 : rule__Precondition__Group_0__1__Impl rule__Precondition__Group_0__2 ;
    public final void rule__Precondition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2088:1: ( rule__Precondition__Group_0__1__Impl rule__Precondition__Group_0__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2089:2: rule__Precondition__Group_0__1__Impl rule__Precondition__Group_0__2
            {
            pushFollow(FOLLOW_rule__Precondition__Group_0__1__Impl_in_rule__Precondition__Group_0__14213);
            rule__Precondition__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precondition__Group_0__2_in_rule__Precondition__Group_0__14216);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2096:1: rule__Precondition__Group_0__1__Impl : ( ( rule__Precondition__OpAssignment_0_1 ) ) ;
    public final void rule__Precondition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2100:1: ( ( ( rule__Precondition__OpAssignment_0_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2101:1: ( ( rule__Precondition__OpAssignment_0_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2101:1: ( ( rule__Precondition__OpAssignment_0_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2102:1: ( rule__Precondition__OpAssignment_0_1 )
            {
             before(grammarAccess.getPreconditionAccess().getOpAssignment_0_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2103:1: ( rule__Precondition__OpAssignment_0_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2103:2: rule__Precondition__OpAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Precondition__OpAssignment_0_1_in_rule__Precondition__Group_0__1__Impl4243);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2113:1: rule__Precondition__Group_0__2 : rule__Precondition__Group_0__2__Impl ;
    public final void rule__Precondition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2117:1: ( rule__Precondition__Group_0__2__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2118:2: rule__Precondition__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Precondition__Group_0__2__Impl_in_rule__Precondition__Group_0__24273);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2124:1: rule__Precondition__Group_0__2__Impl : ( ( rule__Precondition__PreAssignment_0_2 ) ) ;
    public final void rule__Precondition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2128:1: ( ( ( rule__Precondition__PreAssignment_0_2 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2129:1: ( ( rule__Precondition__PreAssignment_0_2 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2129:1: ( ( rule__Precondition__PreAssignment_0_2 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2130:1: ( rule__Precondition__PreAssignment_0_2 )
            {
             before(grammarAccess.getPreconditionAccess().getPreAssignment_0_2()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2131:1: ( rule__Precondition__PreAssignment_0_2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2131:2: rule__Precondition__PreAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Precondition__PreAssignment_0_2_in_rule__Precondition__Group_0__2__Impl4300);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2147:1: rule__SensorValuePrecondition__Group__0 : rule__SensorValuePrecondition__Group__0__Impl rule__SensorValuePrecondition__Group__1 ;
    public final void rule__SensorValuePrecondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2151:1: ( rule__SensorValuePrecondition__Group__0__Impl rule__SensorValuePrecondition__Group__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2152:2: rule__SensorValuePrecondition__Group__0__Impl rule__SensorValuePrecondition__Group__1
            {
            pushFollow(FOLLOW_rule__SensorValuePrecondition__Group__0__Impl_in_rule__SensorValuePrecondition__Group__04336);
            rule__SensorValuePrecondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorValuePrecondition__Group__1_in_rule__SensorValuePrecondition__Group__04339);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2159:1: rule__SensorValuePrecondition__Group__0__Impl : ( ( rule__SensorValuePrecondition__SensorAssignment_0 ) ) ;
    public final void rule__SensorValuePrecondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2163:1: ( ( ( rule__SensorValuePrecondition__SensorAssignment_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2164:1: ( ( rule__SensorValuePrecondition__SensorAssignment_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2164:1: ( ( rule__SensorValuePrecondition__SensorAssignment_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2165:1: ( rule__SensorValuePrecondition__SensorAssignment_0 )
            {
             before(grammarAccess.getSensorValuePreconditionAccess().getSensorAssignment_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2166:1: ( rule__SensorValuePrecondition__SensorAssignment_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2166:2: rule__SensorValuePrecondition__SensorAssignment_0
            {
            pushFollow(FOLLOW_rule__SensorValuePrecondition__SensorAssignment_0_in_rule__SensorValuePrecondition__Group__0__Impl4366);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2176:1: rule__SensorValuePrecondition__Group__1 : rule__SensorValuePrecondition__Group__1__Impl rule__SensorValuePrecondition__Group__2 ;
    public final void rule__SensorValuePrecondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2180:1: ( rule__SensorValuePrecondition__Group__1__Impl rule__SensorValuePrecondition__Group__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2181:2: rule__SensorValuePrecondition__Group__1__Impl rule__SensorValuePrecondition__Group__2
            {
            pushFollow(FOLLOW_rule__SensorValuePrecondition__Group__1__Impl_in_rule__SensorValuePrecondition__Group__14396);
            rule__SensorValuePrecondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorValuePrecondition__Group__2_in_rule__SensorValuePrecondition__Group__14399);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2188:1: rule__SensorValuePrecondition__Group__1__Impl : ( ( rule__SensorValuePrecondition__CondAssignment_1 ) ) ;
    public final void rule__SensorValuePrecondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2192:1: ( ( ( rule__SensorValuePrecondition__CondAssignment_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2193:1: ( ( rule__SensorValuePrecondition__CondAssignment_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2193:1: ( ( rule__SensorValuePrecondition__CondAssignment_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2194:1: ( rule__SensorValuePrecondition__CondAssignment_1 )
            {
             before(grammarAccess.getSensorValuePreconditionAccess().getCondAssignment_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2195:1: ( rule__SensorValuePrecondition__CondAssignment_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2195:2: rule__SensorValuePrecondition__CondAssignment_1
            {
            pushFollow(FOLLOW_rule__SensorValuePrecondition__CondAssignment_1_in_rule__SensorValuePrecondition__Group__1__Impl4426);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2205:1: rule__SensorValuePrecondition__Group__2 : rule__SensorValuePrecondition__Group__2__Impl ;
    public final void rule__SensorValuePrecondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2209:1: ( rule__SensorValuePrecondition__Group__2__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2210:2: rule__SensorValuePrecondition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SensorValuePrecondition__Group__2__Impl_in_rule__SensorValuePrecondition__Group__24456);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2216:1: rule__SensorValuePrecondition__Group__2__Impl : ( ( rule__SensorValuePrecondition__ValueAssignment_2 ) ) ;
    public final void rule__SensorValuePrecondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2220:1: ( ( ( rule__SensorValuePrecondition__ValueAssignment_2 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2221:1: ( ( rule__SensorValuePrecondition__ValueAssignment_2 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2221:1: ( ( rule__SensorValuePrecondition__ValueAssignment_2 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2222:1: ( rule__SensorValuePrecondition__ValueAssignment_2 )
            {
             before(grammarAccess.getSensorValuePreconditionAccess().getValueAssignment_2()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2223:1: ( rule__SensorValuePrecondition__ValueAssignment_2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2223:2: rule__SensorValuePrecondition__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__SensorValuePrecondition__ValueAssignment_2_in_rule__SensorValuePrecondition__Group__2__Impl4483);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2239:1: rule__Timer__Group__0 : rule__Timer__Group__0__Impl rule__Timer__Group__1 ;
    public final void rule__Timer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2243:1: ( rule__Timer__Group__0__Impl rule__Timer__Group__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2244:2: rule__Timer__Group__0__Impl rule__Timer__Group__1
            {
            pushFollow(FOLLOW_rule__Timer__Group__0__Impl_in_rule__Timer__Group__04519);
            rule__Timer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group__1_in_rule__Timer__Group__04522);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2251:1: rule__Timer__Group__0__Impl : ( 'action' ) ;
    public final void rule__Timer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2255:1: ( ( 'action' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2256:1: ( 'action' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2256:1: ( 'action' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2257:1: 'action'
            {
             before(grammarAccess.getTimerAccess().getActionKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__Timer__Group__0__Impl4550); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2270:1: rule__Timer__Group__1 : rule__Timer__Group__1__Impl rule__Timer__Group__2 ;
    public final void rule__Timer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2274:1: ( rule__Timer__Group__1__Impl rule__Timer__Group__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2275:2: rule__Timer__Group__1__Impl rule__Timer__Group__2
            {
            pushFollow(FOLLOW_rule__Timer__Group__1__Impl_in_rule__Timer__Group__14581);
            rule__Timer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group__2_in_rule__Timer__Group__14584);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2282:1: rule__Timer__Group__1__Impl : ( ( rule__Timer__EventHandlerAssignment_1 ) ) ;
    public final void rule__Timer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2286:1: ( ( ( rule__Timer__EventHandlerAssignment_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2287:1: ( ( rule__Timer__EventHandlerAssignment_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2287:1: ( ( rule__Timer__EventHandlerAssignment_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2288:1: ( rule__Timer__EventHandlerAssignment_1 )
            {
             before(grammarAccess.getTimerAccess().getEventHandlerAssignment_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2289:1: ( rule__Timer__EventHandlerAssignment_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2289:2: rule__Timer__EventHandlerAssignment_1
            {
            pushFollow(FOLLOW_rule__Timer__EventHandlerAssignment_1_in_rule__Timer__Group__1__Impl4611);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2299:1: rule__Timer__Group__2 : rule__Timer__Group__2__Impl rule__Timer__Group__3 ;
    public final void rule__Timer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2303:1: ( rule__Timer__Group__2__Impl rule__Timer__Group__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2304:2: rule__Timer__Group__2__Impl rule__Timer__Group__3
            {
            pushFollow(FOLLOW_rule__Timer__Group__2__Impl_in_rule__Timer__Group__24641);
            rule__Timer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group__3_in_rule__Timer__Group__24644);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2311:1: rule__Timer__Group__2__Impl : ( 'repeat' ) ;
    public final void rule__Timer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2315:1: ( ( 'repeat' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2316:1: ( 'repeat' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2316:1: ( 'repeat' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2317:1: 'repeat'
            {
             before(grammarAccess.getTimerAccess().getRepeatKeyword_2()); 
            match(input,48,FOLLOW_48_in_rule__Timer__Group__2__Impl4672); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2330:1: rule__Timer__Group__3 : rule__Timer__Group__3__Impl rule__Timer__Group__4 ;
    public final void rule__Timer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2334:1: ( rule__Timer__Group__3__Impl rule__Timer__Group__4 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2335:2: rule__Timer__Group__3__Impl rule__Timer__Group__4
            {
            pushFollow(FOLLOW_rule__Timer__Group__3__Impl_in_rule__Timer__Group__34703);
            rule__Timer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group__4_in_rule__Timer__Group__34706);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2342:1: rule__Timer__Group__3__Impl : ( ( rule__Timer__RepeattypeAssignment_3 ) ) ;
    public final void rule__Timer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2346:1: ( ( ( rule__Timer__RepeattypeAssignment_3 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2347:1: ( ( rule__Timer__RepeattypeAssignment_3 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2347:1: ( ( rule__Timer__RepeattypeAssignment_3 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2348:1: ( rule__Timer__RepeattypeAssignment_3 )
            {
             before(grammarAccess.getTimerAccess().getRepeattypeAssignment_3()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2349:1: ( rule__Timer__RepeattypeAssignment_3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2349:2: rule__Timer__RepeattypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Timer__RepeattypeAssignment_3_in_rule__Timer__Group__3__Impl4733);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2359:1: rule__Timer__Group__4 : rule__Timer__Group__4__Impl rule__Timer__Group__5 ;
    public final void rule__Timer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2363:1: ( rule__Timer__Group__4__Impl rule__Timer__Group__5 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2364:2: rule__Timer__Group__4__Impl rule__Timer__Group__5
            {
            pushFollow(FOLLOW_rule__Timer__Group__4__Impl_in_rule__Timer__Group__44763);
            rule__Timer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group__5_in_rule__Timer__Group__44766);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2371:1: rule__Timer__Group__4__Impl : ( 'seconds:' ) ;
    public final void rule__Timer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2375:1: ( ( 'seconds:' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2376:1: ( 'seconds:' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2376:1: ( 'seconds:' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2377:1: 'seconds:'
            {
             before(grammarAccess.getTimerAccess().getSecondsKeyword_4()); 
            match(input,49,FOLLOW_49_in_rule__Timer__Group__4__Impl4794); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2390:1: rule__Timer__Group__5 : rule__Timer__Group__5__Impl rule__Timer__Group__6 ;
    public final void rule__Timer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2394:1: ( rule__Timer__Group__5__Impl rule__Timer__Group__6 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2395:2: rule__Timer__Group__5__Impl rule__Timer__Group__6
            {
            pushFollow(FOLLOW_rule__Timer__Group__5__Impl_in_rule__Timer__Group__54825);
            rule__Timer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group__6_in_rule__Timer__Group__54828);
            rule__Timer__Group__6();

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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2402:1: rule__Timer__Group__5__Impl : ( ( rule__Timer__TimerSecsAssignment_5 ) ) ;
    public final void rule__Timer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2406:1: ( ( ( rule__Timer__TimerSecsAssignment_5 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2407:1: ( ( rule__Timer__TimerSecsAssignment_5 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2407:1: ( ( rule__Timer__TimerSecsAssignment_5 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2408:1: ( rule__Timer__TimerSecsAssignment_5 )
            {
             before(grammarAccess.getTimerAccess().getTimerSecsAssignment_5()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2409:1: ( rule__Timer__TimerSecsAssignment_5 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2409:2: rule__Timer__TimerSecsAssignment_5
            {
            pushFollow(FOLLOW_rule__Timer__TimerSecsAssignment_5_in_rule__Timer__Group__5__Impl4855);
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


    // $ANTLR start "rule__Timer__Group__6"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2419:1: rule__Timer__Group__6 : rule__Timer__Group__6__Impl ;
    public final void rule__Timer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2423:1: ( rule__Timer__Group__6__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2424:2: rule__Timer__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Timer__Group__6__Impl_in_rule__Timer__Group__64885);
            rule__Timer__Group__6__Impl();

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
    // $ANTLR end "rule__Timer__Group__6"


    // $ANTLR start "rule__Timer__Group__6__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2430:1: rule__Timer__Group__6__Impl : ( ';' ) ;
    public final void rule__Timer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2434:1: ( ( ';' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2435:1: ( ';' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2435:1: ( ';' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2436:1: ';'
            {
             before(grammarAccess.getTimerAccess().getSemicolonKeyword_6()); 
            match(input,39,FOLLOW_39_in_rule__Timer__Group__6__Impl4913); 
             after(grammarAccess.getTimerAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__Timer__Group__6__Impl"


    // $ANTLR start "rule__Alarm__Group__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2463:1: rule__Alarm__Group__0 : rule__Alarm__Group__0__Impl rule__Alarm__Group__1 ;
    public final void rule__Alarm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2467:1: ( rule__Alarm__Group__0__Impl rule__Alarm__Group__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2468:2: rule__Alarm__Group__0__Impl rule__Alarm__Group__1
            {
            pushFollow(FOLLOW_rule__Alarm__Group__0__Impl_in_rule__Alarm__Group__04958);
            rule__Alarm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alarm__Group__1_in_rule__Alarm__Group__04961);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2475:1: rule__Alarm__Group__0__Impl : ( 'action' ) ;
    public final void rule__Alarm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2479:1: ( ( 'action' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2480:1: ( 'action' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2480:1: ( 'action' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2481:1: 'action'
            {
             before(grammarAccess.getAlarmAccess().getActionKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__Alarm__Group__0__Impl4989); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2494:1: rule__Alarm__Group__1 : rule__Alarm__Group__1__Impl rule__Alarm__Group__2 ;
    public final void rule__Alarm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2498:1: ( rule__Alarm__Group__1__Impl rule__Alarm__Group__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2499:2: rule__Alarm__Group__1__Impl rule__Alarm__Group__2
            {
            pushFollow(FOLLOW_rule__Alarm__Group__1__Impl_in_rule__Alarm__Group__15020);
            rule__Alarm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alarm__Group__2_in_rule__Alarm__Group__15023);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2506:1: rule__Alarm__Group__1__Impl : ( ( rule__Alarm__EventHandlerAssignment_1 ) ) ;
    public final void rule__Alarm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2510:1: ( ( ( rule__Alarm__EventHandlerAssignment_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2511:1: ( ( rule__Alarm__EventHandlerAssignment_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2511:1: ( ( rule__Alarm__EventHandlerAssignment_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2512:1: ( rule__Alarm__EventHandlerAssignment_1 )
            {
             before(grammarAccess.getAlarmAccess().getEventHandlerAssignment_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2513:1: ( rule__Alarm__EventHandlerAssignment_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2513:2: rule__Alarm__EventHandlerAssignment_1
            {
            pushFollow(FOLLOW_rule__Alarm__EventHandlerAssignment_1_in_rule__Alarm__Group__1__Impl5050);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2523:1: rule__Alarm__Group__2 : rule__Alarm__Group__2__Impl rule__Alarm__Group__3 ;
    public final void rule__Alarm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2527:1: ( rule__Alarm__Group__2__Impl rule__Alarm__Group__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2528:2: rule__Alarm__Group__2__Impl rule__Alarm__Group__3
            {
            pushFollow(FOLLOW_rule__Alarm__Group__2__Impl_in_rule__Alarm__Group__25080);
            rule__Alarm__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alarm__Group__3_in_rule__Alarm__Group__25083);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2535:1: rule__Alarm__Group__2__Impl : ( 'repeat' ) ;
    public final void rule__Alarm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2539:1: ( ( 'repeat' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2540:1: ( 'repeat' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2540:1: ( 'repeat' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2541:1: 'repeat'
            {
             before(grammarAccess.getAlarmAccess().getRepeatKeyword_2()); 
            match(input,48,FOLLOW_48_in_rule__Alarm__Group__2__Impl5111); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2554:1: rule__Alarm__Group__3 : rule__Alarm__Group__3__Impl rule__Alarm__Group__4 ;
    public final void rule__Alarm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2558:1: ( rule__Alarm__Group__3__Impl rule__Alarm__Group__4 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2559:2: rule__Alarm__Group__3__Impl rule__Alarm__Group__4
            {
            pushFollow(FOLLOW_rule__Alarm__Group__3__Impl_in_rule__Alarm__Group__35142);
            rule__Alarm__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alarm__Group__4_in_rule__Alarm__Group__35145);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2566:1: rule__Alarm__Group__3__Impl : ( ( rule__Alarm__RepeattypeAssignment_3 ) ) ;
    public final void rule__Alarm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2570:1: ( ( ( rule__Alarm__RepeattypeAssignment_3 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2571:1: ( ( rule__Alarm__RepeattypeAssignment_3 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2571:1: ( ( rule__Alarm__RepeattypeAssignment_3 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2572:1: ( rule__Alarm__RepeattypeAssignment_3 )
            {
             before(grammarAccess.getAlarmAccess().getRepeattypeAssignment_3()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2573:1: ( rule__Alarm__RepeattypeAssignment_3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2573:2: rule__Alarm__RepeattypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Alarm__RepeattypeAssignment_3_in_rule__Alarm__Group__3__Impl5172);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2583:1: rule__Alarm__Group__4 : rule__Alarm__Group__4__Impl rule__Alarm__Group__5 ;
    public final void rule__Alarm__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2587:1: ( rule__Alarm__Group__4__Impl rule__Alarm__Group__5 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2588:2: rule__Alarm__Group__4__Impl rule__Alarm__Group__5
            {
            pushFollow(FOLLOW_rule__Alarm__Group__4__Impl_in_rule__Alarm__Group__45202);
            rule__Alarm__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alarm__Group__5_in_rule__Alarm__Group__45205);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2595:1: rule__Alarm__Group__4__Impl : ( 'hours:' ) ;
    public final void rule__Alarm__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2599:1: ( ( 'hours:' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2600:1: ( 'hours:' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2600:1: ( 'hours:' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2601:1: 'hours:'
            {
             before(grammarAccess.getAlarmAccess().getHoursKeyword_4()); 
            match(input,50,FOLLOW_50_in_rule__Alarm__Group__4__Impl5233); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2614:1: rule__Alarm__Group__5 : rule__Alarm__Group__5__Impl rule__Alarm__Group__6 ;
    public final void rule__Alarm__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2618:1: ( rule__Alarm__Group__5__Impl rule__Alarm__Group__6 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2619:2: rule__Alarm__Group__5__Impl rule__Alarm__Group__6
            {
            pushFollow(FOLLOW_rule__Alarm__Group__5__Impl_in_rule__Alarm__Group__55264);
            rule__Alarm__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alarm__Group__6_in_rule__Alarm__Group__55267);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2626:1: rule__Alarm__Group__5__Impl : ( ( rule__Alarm__TimerHoursAssignment_5 ) ) ;
    public final void rule__Alarm__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2630:1: ( ( ( rule__Alarm__TimerHoursAssignment_5 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2631:1: ( ( rule__Alarm__TimerHoursAssignment_5 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2631:1: ( ( rule__Alarm__TimerHoursAssignment_5 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2632:1: ( rule__Alarm__TimerHoursAssignment_5 )
            {
             before(grammarAccess.getAlarmAccess().getTimerHoursAssignment_5()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2633:1: ( rule__Alarm__TimerHoursAssignment_5 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2633:2: rule__Alarm__TimerHoursAssignment_5
            {
            pushFollow(FOLLOW_rule__Alarm__TimerHoursAssignment_5_in_rule__Alarm__Group__5__Impl5294);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2643:1: rule__Alarm__Group__6 : rule__Alarm__Group__6__Impl rule__Alarm__Group__7 ;
    public final void rule__Alarm__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2647:1: ( rule__Alarm__Group__6__Impl rule__Alarm__Group__7 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2648:2: rule__Alarm__Group__6__Impl rule__Alarm__Group__7
            {
            pushFollow(FOLLOW_rule__Alarm__Group__6__Impl_in_rule__Alarm__Group__65324);
            rule__Alarm__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alarm__Group__7_in_rule__Alarm__Group__65327);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2655:1: rule__Alarm__Group__6__Impl : ( 'minutes:' ) ;
    public final void rule__Alarm__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2659:1: ( ( 'minutes:' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2660:1: ( 'minutes:' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2660:1: ( 'minutes:' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2661:1: 'minutes:'
            {
             before(grammarAccess.getAlarmAccess().getMinutesKeyword_6()); 
            match(input,51,FOLLOW_51_in_rule__Alarm__Group__6__Impl5355); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2674:1: rule__Alarm__Group__7 : rule__Alarm__Group__7__Impl rule__Alarm__Group__8 ;
    public final void rule__Alarm__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2678:1: ( rule__Alarm__Group__7__Impl rule__Alarm__Group__8 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2679:2: rule__Alarm__Group__7__Impl rule__Alarm__Group__8
            {
            pushFollow(FOLLOW_rule__Alarm__Group__7__Impl_in_rule__Alarm__Group__75386);
            rule__Alarm__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alarm__Group__8_in_rule__Alarm__Group__75389);
            rule__Alarm__Group__8();

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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2686:1: rule__Alarm__Group__7__Impl : ( ( rule__Alarm__TimerMinutesAssignment_7 ) ) ;
    public final void rule__Alarm__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2690:1: ( ( ( rule__Alarm__TimerMinutesAssignment_7 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2691:1: ( ( rule__Alarm__TimerMinutesAssignment_7 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2691:1: ( ( rule__Alarm__TimerMinutesAssignment_7 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2692:1: ( rule__Alarm__TimerMinutesAssignment_7 )
            {
             before(grammarAccess.getAlarmAccess().getTimerMinutesAssignment_7()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2693:1: ( rule__Alarm__TimerMinutesAssignment_7 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2693:2: rule__Alarm__TimerMinutesAssignment_7
            {
            pushFollow(FOLLOW_rule__Alarm__TimerMinutesAssignment_7_in_rule__Alarm__Group__7__Impl5416);
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


    // $ANTLR start "rule__Alarm__Group__8"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2703:1: rule__Alarm__Group__8 : rule__Alarm__Group__8__Impl ;
    public final void rule__Alarm__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2707:1: ( rule__Alarm__Group__8__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2708:2: rule__Alarm__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Alarm__Group__8__Impl_in_rule__Alarm__Group__85446);
            rule__Alarm__Group__8__Impl();

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
    // $ANTLR end "rule__Alarm__Group__8"


    // $ANTLR start "rule__Alarm__Group__8__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2714:1: rule__Alarm__Group__8__Impl : ( ';' ) ;
    public final void rule__Alarm__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2718:1: ( ( ';' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2719:1: ( ';' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2719:1: ( ';' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2720:1: ';'
            {
             before(grammarAccess.getAlarmAccess().getSemicolonKeyword_8()); 
            match(input,39,FOLLOW_39_in_rule__Alarm__Group__8__Impl5474); 
             after(grammarAccess.getAlarmAccess().getSemicolonKeyword_8()); 

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
    // $ANTLR end "rule__Alarm__Group__8__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2752:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2756:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2757:1: ( RULE_ID )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2757:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2758:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NameAssignment_15528); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2767:1: rule__Model__HardwareAssignment_3 : ( ( rule__Model__HardwareAlternatives_3_0 ) ) ;
    public final void rule__Model__HardwareAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2771:1: ( ( ( rule__Model__HardwareAlternatives_3_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2772:1: ( ( rule__Model__HardwareAlternatives_3_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2772:1: ( ( rule__Model__HardwareAlternatives_3_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2773:1: ( rule__Model__HardwareAlternatives_3_0 )
            {
             before(grammarAccess.getModelAccess().getHardwareAlternatives_3_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2774:1: ( rule__Model__HardwareAlternatives_3_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2774:2: rule__Model__HardwareAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Model__HardwareAlternatives_3_0_in_rule__Model__HardwareAssignment_35559);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2783:1: rule__Model__DevicesAssignment_4 : ( ruleAbstractDevice ) ;
    public final void rule__Model__DevicesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2787:1: ( ( ruleAbstractDevice ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2788:1: ( ruleAbstractDevice )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2788:1: ( ruleAbstractDevice )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2789:1: ruleAbstractDevice
            {
             before(grammarAccess.getModelAccess().getDevicesAbstractDeviceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAbstractDevice_in_rule__Model__DevicesAssignment_45592);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2798:1: rule__Model__EventHandlersAssignment_5 : ( ruleEventHandler ) ;
    public final void rule__Model__EventHandlersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2802:1: ( ( ruleEventHandler ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2803:1: ( ruleEventHandler )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2803:1: ( ruleEventHandler )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2804:1: ruleEventHandler
            {
             before(grammarAccess.getModelAccess().getEventHandlersEventHandlerParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleEventHandler_in_rule__Model__EventHandlersAssignment_55623);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2813:1: rule__Model__SensorListenersAssignment_6 : ( ruleSensorListener ) ;
    public final void rule__Model__SensorListenersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2817:1: ( ( ruleSensorListener ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2818:1: ( ruleSensorListener )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2818:1: ( ruleSensorListener )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2819:1: ruleSensorListener
            {
             before(grammarAccess.getModelAccess().getSensorListenersSensorListenerParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleSensorListener_in_rule__Model__SensorListenersAssignment_65654);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2828:1: rule__Model__TimersAssignment_7 : ( ruleTimer ) ;
    public final void rule__Model__TimersAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2832:1: ( ( ruleTimer ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2833:1: ( ruleTimer )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2833:1: ( ruleTimer )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2834:1: ruleTimer
            {
             before(grammarAccess.getModelAccess().getTimersTimerParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleTimer_in_rule__Model__TimersAssignment_75685);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2843:1: rule__Model__AlarmsAssignment_8 : ( ruleAlarm ) ;
    public final void rule__Model__AlarmsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2847:1: ( ( ruleAlarm ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2848:1: ( ruleAlarm )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2848:1: ( ruleAlarm )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2849:1: ruleAlarm
            {
             before(grammarAccess.getModelAccess().getAlarmsAlarmParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleAlarm_in_rule__Model__AlarmsAssignment_85716);
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


    // $ANTLR start "rule__Model__PriorityAssignment_10"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2858:1: rule__Model__PriorityAssignment_10 : ( ( rule__Model__PriorityAlternatives_10_0 ) ) ;
    public final void rule__Model__PriorityAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2862:1: ( ( ( rule__Model__PriorityAlternatives_10_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2863:1: ( ( rule__Model__PriorityAlternatives_10_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2863:1: ( ( rule__Model__PriorityAlternatives_10_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2864:1: ( rule__Model__PriorityAlternatives_10_0 )
            {
             before(grammarAccess.getModelAccess().getPriorityAlternatives_10_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2865:1: ( rule__Model__PriorityAlternatives_10_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2865:2: rule__Model__PriorityAlternatives_10_0
            {
            pushFollow(FOLLOW_rule__Model__PriorityAlternatives_10_0_in_rule__Model__PriorityAssignment_105747);
            rule__Model__PriorityAlternatives_10_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPriorityAlternatives_10_0()); 

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
    // $ANTLR end "rule__Model__PriorityAssignment_10"


    // $ANTLR start "rule__Sensor__NameAssignment_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2874:1: rule__Sensor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sensor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2878:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2879:1: ( RULE_ID )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2879:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2880:1: RULE_ID
            {
             before(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Sensor__NameAssignment_15780); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2889:1: rule__Sensor__PinAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Sensor__PinAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2893:1: ( ( RULE_STRING ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2894:1: ( RULE_STRING )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2894:1: ( RULE_STRING )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2895:1: RULE_STRING
            {
             before(grammarAccess.getSensorAccess().getPinSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Sensor__PinAssignment_35811); 
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


    // $ANTLR start "rule__Sensor__AnalogAssignment_4"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2904:1: rule__Sensor__AnalogAssignment_4 : ( ( 'analog' ) ) ;
    public final void rule__Sensor__AnalogAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2908:1: ( ( ( 'analog' ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2909:1: ( ( 'analog' ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2909:1: ( ( 'analog' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2910:1: ( 'analog' )
            {
             before(grammarAccess.getSensorAccess().getAnalogAnalogKeyword_4_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2911:1: ( 'analog' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2912:1: 'analog'
            {
             before(grammarAccess.getSensorAccess().getAnalogAnalogKeyword_4_0()); 
            match(input,52,FOLLOW_52_in_rule__Sensor__AnalogAssignment_45847); 
             after(grammarAccess.getSensorAccess().getAnalogAnalogKeyword_4_0()); 

            }

             after(grammarAccess.getSensorAccess().getAnalogAnalogKeyword_4_0()); 

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
    // $ANTLR end "rule__Sensor__AnalogAssignment_4"


    // $ANTLR start "rule__Actuator__NameAssignment_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2927:1: rule__Actuator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Actuator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2931:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2932:1: ( RULE_ID )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2932:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2933:1: RULE_ID
            {
             before(grammarAccess.getActuatorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actuator__NameAssignment_15886); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2942:1: rule__Actuator__PinAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Actuator__PinAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2946:1: ( ( RULE_STRING ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2947:1: ( RULE_STRING )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2947:1: ( RULE_STRING )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2948:1: RULE_STRING
            {
             before(grammarAccess.getActuatorAccess().getPinSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Actuator__PinAssignment_35917); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2957:1: rule__EventHandler__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EventHandler__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2961:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2962:1: ( RULE_ID )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2962:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2963:1: RULE_ID
            {
             before(grammarAccess.getEventHandlerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EventHandler__NameAssignment_15948); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2972:1: rule__EventHandler__ChangeActuatorsAssignment_2 : ( ruleChangeActuator ) ;
    public final void rule__EventHandler__ChangeActuatorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2976:1: ( ( ruleChangeActuator ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2977:1: ( ruleChangeActuator )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2977:1: ( ruleChangeActuator )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2978:1: ruleChangeActuator
            {
             before(grammarAccess.getEventHandlerAccess().getChangeActuatorsChangeActuatorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleChangeActuator_in_rule__EventHandler__ChangeActuatorsAssignment_25979);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2987:1: rule__ChangeActuator__ActuatorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ChangeActuator__ActuatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2991:1: ( ( ( RULE_ID ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2992:1: ( ( RULE_ID ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2992:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2993:1: ( RULE_ID )
            {
             before(grammarAccess.getChangeActuatorAccess().getActuatorActuatorCrossReference_0_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2994:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2995:1: RULE_ID
            {
             before(grammarAccess.getChangeActuatorAccess().getActuatorActuatorIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ChangeActuator__ActuatorAssignment_06014); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3006:1: rule__ChangeActuator__ActuatorStateAssignment_2 : ( ( rule__ChangeActuator__ActuatorStateAlternatives_2_0 ) ) ;
    public final void rule__ChangeActuator__ActuatorStateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3010:1: ( ( ( rule__ChangeActuator__ActuatorStateAlternatives_2_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3011:1: ( ( rule__ChangeActuator__ActuatorStateAlternatives_2_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3011:1: ( ( rule__ChangeActuator__ActuatorStateAlternatives_2_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3012:1: ( rule__ChangeActuator__ActuatorStateAlternatives_2_0 )
            {
             before(grammarAccess.getChangeActuatorAccess().getActuatorStateAlternatives_2_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3013:1: ( rule__ChangeActuator__ActuatorStateAlternatives_2_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3013:2: rule__ChangeActuator__ActuatorStateAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__ChangeActuator__ActuatorStateAlternatives_2_0_in_rule__ChangeActuator__ActuatorStateAssignment_26049);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3022:1: rule__SensorListener__SensorAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SensorListener__SensorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3026:1: ( ( ( RULE_ID ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3027:1: ( ( RULE_ID ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3027:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3028:1: ( RULE_ID )
            {
             before(grammarAccess.getSensorListenerAccess().getSensorSensorCrossReference_1_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3029:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3030:1: RULE_ID
            {
             before(grammarAccess.getSensorListenerAccess().getSensorSensorIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SensorListener__SensorAssignment_16086); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3041:1: rule__SensorListener__TypeAssignment_3_0 : ( ( 'BETWEEN' ) ) ;
    public final void rule__SensorListener__TypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3045:1: ( ( ( 'BETWEEN' ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3046:1: ( ( 'BETWEEN' ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3046:1: ( ( 'BETWEEN' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3047:1: ( 'BETWEEN' )
            {
             before(grammarAccess.getSensorListenerAccess().getTypeBETWEENKeyword_3_0_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3048:1: ( 'BETWEEN' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3049:1: 'BETWEEN'
            {
             before(grammarAccess.getSensorListenerAccess().getTypeBETWEENKeyword_3_0_0()); 
            match(input,53,FOLLOW_53_in_rule__SensorListener__TypeAssignment_3_06126); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3064:1: rule__SensorListener__LAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__SensorListener__LAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3068:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3069:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3069:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3070:1: RULE_INT
            {
             before(grammarAccess.getSensorListenerAccess().getLINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SensorListener__LAssignment_3_16165); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3079:1: rule__SensorListener__HAssignment_3_3 : ( RULE_INT ) ;
    public final void rule__SensorListener__HAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3083:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3084:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3084:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3085:1: RULE_INT
            {
             before(grammarAccess.getSensorListenerAccess().getHINTTerminalRuleCall_3_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SensorListener__HAssignment_3_36196); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3094:1: rule__SensorListener__EventHandlerAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__SensorListener__EventHandlerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3098:1: ( ( ( RULE_ID ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3099:1: ( ( RULE_ID ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3099:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3100:1: ( RULE_ID )
            {
             before(grammarAccess.getSensorListenerAccess().getEventHandlerEventHandlerCrossReference_5_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3101:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3102:1: RULE_ID
            {
             before(grammarAccess.getSensorListenerAccess().getEventHandlerEventHandlerIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SensorListener__EventHandlerAssignment_56231); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3113:1: rule__Precondition__Pre1Assignment_0_0 : ( rulePrecondition1 ) ;
    public final void rule__Precondition__Pre1Assignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3117:1: ( ( rulePrecondition1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3118:1: ( rulePrecondition1 )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3118:1: ( rulePrecondition1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3119:1: rulePrecondition1
            {
             before(grammarAccess.getPreconditionAccess().getPre1Precondition1ParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_rulePrecondition1_in_rule__Precondition__Pre1Assignment_0_06266);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3128:1: rule__Precondition__OpAssignment_0_1 : ( ( rule__Precondition__OpAlternatives_0_1_0 ) ) ;
    public final void rule__Precondition__OpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3132:1: ( ( ( rule__Precondition__OpAlternatives_0_1_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3133:1: ( ( rule__Precondition__OpAlternatives_0_1_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3133:1: ( ( rule__Precondition__OpAlternatives_0_1_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3134:1: ( rule__Precondition__OpAlternatives_0_1_0 )
            {
             before(grammarAccess.getPreconditionAccess().getOpAlternatives_0_1_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3135:1: ( rule__Precondition__OpAlternatives_0_1_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3135:2: rule__Precondition__OpAlternatives_0_1_0
            {
            pushFollow(FOLLOW_rule__Precondition__OpAlternatives_0_1_0_in_rule__Precondition__OpAssignment_0_16297);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3144:1: rule__Precondition__PreAssignment_0_2 : ( rulePrecondition ) ;
    public final void rule__Precondition__PreAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3148:1: ( ( rulePrecondition ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3149:1: ( rulePrecondition )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3149:1: ( rulePrecondition )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3150:1: rulePrecondition
            {
             before(grammarAccess.getPreconditionAccess().getPrePreconditionParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_rulePrecondition_in_rule__Precondition__PreAssignment_0_26330);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3159:1: rule__Precondition__Pre1Assignment_1 : ( rulePrecondition1 ) ;
    public final void rule__Precondition__Pre1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3163:1: ( ( rulePrecondition1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3164:1: ( rulePrecondition1 )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3164:1: ( rulePrecondition1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3165:1: rulePrecondition1
            {
             before(grammarAccess.getPreconditionAccess().getPre1Precondition1ParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePrecondition1_in_rule__Precondition__Pre1Assignment_16361);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3174:1: rule__Precondition1__PreAssignment_0 : ( ruleSensorValuePrecondition ) ;
    public final void rule__Precondition1__PreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3178:1: ( ( ruleSensorValuePrecondition ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3179:1: ( ruleSensorValuePrecondition )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3179:1: ( ruleSensorValuePrecondition )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3180:1: ruleSensorValuePrecondition
            {
             before(grammarAccess.getPrecondition1Access().getPreSensorValuePreconditionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSensorValuePrecondition_in_rule__Precondition1__PreAssignment_06392);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3189:1: rule__Precondition1__PreAssignment_1 : ( ruleEmptyPrecondition ) ;
    public final void rule__Precondition1__PreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3193:1: ( ( ruleEmptyPrecondition ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3194:1: ( ruleEmptyPrecondition )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3194:1: ( ruleEmptyPrecondition )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3195:1: ruleEmptyPrecondition
            {
             before(grammarAccess.getPrecondition1Access().getPreEmptyPreconditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEmptyPrecondition_in_rule__Precondition1__PreAssignment_16423);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3204:1: rule__EmptyPrecondition__NameAssignment : ( RULE_ID ) ;
    public final void rule__EmptyPrecondition__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3208:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3209:1: ( RULE_ID )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3209:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3210:1: RULE_ID
            {
             before(grammarAccess.getEmptyPreconditionAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EmptyPrecondition__NameAssignment6454); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3219:1: rule__SensorValuePrecondition__SensorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SensorValuePrecondition__SensorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3223:1: ( ( ( RULE_ID ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3224:1: ( ( RULE_ID ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3224:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3225:1: ( RULE_ID )
            {
             before(grammarAccess.getSensorValuePreconditionAccess().getSensorSensorCrossReference_0_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3226:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3227:1: RULE_ID
            {
             before(grammarAccess.getSensorValuePreconditionAccess().getSensorSensorIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SensorValuePrecondition__SensorAssignment_06489); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3238:1: rule__SensorValuePrecondition__CondAssignment_1 : ( ( rule__SensorValuePrecondition__CondAlternatives_1_0 ) ) ;
    public final void rule__SensorValuePrecondition__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3242:1: ( ( ( rule__SensorValuePrecondition__CondAlternatives_1_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3243:1: ( ( rule__SensorValuePrecondition__CondAlternatives_1_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3243:1: ( ( rule__SensorValuePrecondition__CondAlternatives_1_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3244:1: ( rule__SensorValuePrecondition__CondAlternatives_1_0 )
            {
             before(grammarAccess.getSensorValuePreconditionAccess().getCondAlternatives_1_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3245:1: ( rule__SensorValuePrecondition__CondAlternatives_1_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3245:2: rule__SensorValuePrecondition__CondAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__SensorValuePrecondition__CondAlternatives_1_0_in_rule__SensorValuePrecondition__CondAssignment_16524);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3254:1: rule__SensorValuePrecondition__ValueAssignment_2 : ( rulePossibleValues ) ;
    public final void rule__SensorValuePrecondition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3258:1: ( ( rulePossibleValues ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3259:1: ( rulePossibleValues )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3259:1: ( rulePossibleValues )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3260:1: rulePossibleValues
            {
             before(grammarAccess.getSensorValuePreconditionAccess().getValuePossibleValuesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePossibleValues_in_rule__SensorValuePrecondition__ValueAssignment_26557);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3269:1: rule__Timer__EventHandlerAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Timer__EventHandlerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3273:1: ( ( ( RULE_ID ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3274:1: ( ( RULE_ID ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3274:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3275:1: ( RULE_ID )
            {
             before(grammarAccess.getTimerAccess().getEventHandlerEventHandlerCrossReference_1_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3276:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3277:1: RULE_ID
            {
             before(grammarAccess.getTimerAccess().getEventHandlerEventHandlerIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Timer__EventHandlerAssignment_16592); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3288:1: rule__Timer__RepeattypeAssignment_3 : ( ( rule__Timer__RepeattypeAlternatives_3_0 ) ) ;
    public final void rule__Timer__RepeattypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3292:1: ( ( ( rule__Timer__RepeattypeAlternatives_3_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3293:1: ( ( rule__Timer__RepeattypeAlternatives_3_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3293:1: ( ( rule__Timer__RepeattypeAlternatives_3_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3294:1: ( rule__Timer__RepeattypeAlternatives_3_0 )
            {
             before(grammarAccess.getTimerAccess().getRepeattypeAlternatives_3_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3295:1: ( rule__Timer__RepeattypeAlternatives_3_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3295:2: rule__Timer__RepeattypeAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Timer__RepeattypeAlternatives_3_0_in_rule__Timer__RepeattypeAssignment_36627);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3304:1: rule__Timer__TimerSecsAssignment_5 : ( RULE_INT ) ;
    public final void rule__Timer__TimerSecsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3308:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3309:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3309:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3310:1: RULE_INT
            {
             before(grammarAccess.getTimerAccess().getTimerSecsINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Timer__TimerSecsAssignment_56660); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3319:1: rule__Alarm__EventHandlerAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Alarm__EventHandlerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3323:1: ( ( ( RULE_ID ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3324:1: ( ( RULE_ID ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3324:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3325:1: ( RULE_ID )
            {
             before(grammarAccess.getAlarmAccess().getEventHandlerEventHandlerCrossReference_1_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3326:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3327:1: RULE_ID
            {
             before(grammarAccess.getAlarmAccess().getEventHandlerEventHandlerIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Alarm__EventHandlerAssignment_16695); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3338:1: rule__Alarm__RepeattypeAssignment_3 : ( ( rule__Alarm__RepeattypeAlternatives_3_0 ) ) ;
    public final void rule__Alarm__RepeattypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3342:1: ( ( ( rule__Alarm__RepeattypeAlternatives_3_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3343:1: ( ( rule__Alarm__RepeattypeAlternatives_3_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3343:1: ( ( rule__Alarm__RepeattypeAlternatives_3_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3344:1: ( rule__Alarm__RepeattypeAlternatives_3_0 )
            {
             before(grammarAccess.getAlarmAccess().getRepeattypeAlternatives_3_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3345:1: ( rule__Alarm__RepeattypeAlternatives_3_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3345:2: rule__Alarm__RepeattypeAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Alarm__RepeattypeAlternatives_3_0_in_rule__Alarm__RepeattypeAssignment_36730);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3354:1: rule__Alarm__TimerHoursAssignment_5 : ( RULE_INT ) ;
    public final void rule__Alarm__TimerHoursAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3358:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3359:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3359:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3360:1: RULE_INT
            {
             before(grammarAccess.getAlarmAccess().getTimerHoursINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Alarm__TimerHoursAssignment_56763); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3369:1: rule__Alarm__TimerMinutesAssignment_7 : ( RULE_INT ) ;
    public final void rule__Alarm__TimerMinutesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3373:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3374:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3374:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3375:1: RULE_INT
            {
             before(grammarAccess.getAlarmAccess().getTimerMinutesINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Alarm__TimerMinutesAssignment_76794); 
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
        "\1\uffff\1\6\6\uffff\2\6";
    static final String DFA5_minS =
        "\1\6\1\22\4\4\2\uffff\2\22";
    static final String DFA5_maxS =
        "\1\6\1\27\4\5\2\uffff\2\23";
    static final String DFA5_acceptS =
        "\6\uffff\1\2\1\1\2\uffff";
    static final String DFA5_specialS =
        "\12\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\2\7\1\2\1\3\1\4\1\5",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "",
            "",
            "\2\7",
            "\2\7"
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
    public static final BitSet FOLLOW_14_in_rule__Model__PriorityAlternatives_10_0966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Model__PriorityAlternatives_10_0986 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31837 = new BitSet(new long[]{0x00008B3000000000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__HardwareAssignment_3_in_rule__Model__Group__3__Impl1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41897 = new BitSet(new long[]{0x00008B3000000000L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DevicesAssignment_4_in_rule__Model__Group__4__Impl1927 = new BitSet(new long[]{0x0000012000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51958 = new BitSet(new long[]{0x00008B3000000000L});
    public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__EventHandlersAssignment_5_in_rule__Model__Group__5__Impl1988 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__62019 = new BitSet(new long[]{0x00008B3000000000L});
    public static final BitSet FOLLOW_rule__Model__Group__7_in_rule__Model__Group__62022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SensorListenersAssignment_6_in_rule__Model__Group__6__Impl2049 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__72080 = new BitSet(new long[]{0x00008B3000000000L});
    public static final BitSet FOLLOW_rule__Model__Group__8_in_rule__Model__Group__72083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TimersAssignment_7_in_rule__Model__Group__7__Impl2110 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__82141 = new BitSet(new long[]{0x00008B3000000000L});
    public static final BitSet FOLLOW_rule__Model__Group__9_in_rule__Model__Group__82144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AlarmsAssignment_8_in_rule__Model__Group__8__Impl2171 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__9__Impl_in_rule__Model__Group__92202 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Model__Group__10_in_rule__Model__Group__92205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Model__Group__9__Impl2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__10__Impl_in_rule__Model__Group__102264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PriorityAssignment_10_in_rule__Model__Group__10__Impl2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sensor__Group__0__Impl_in_rule__Sensor__Group__02343 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Sensor__Group__1_in_rule__Sensor__Group__02346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Sensor__Group__0__Impl2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sensor__Group__1__Impl_in_rule__Sensor__Group__12405 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Sensor__Group__2_in_rule__Sensor__Group__12408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sensor__NameAssignment_1_in_rule__Sensor__Group__1__Impl2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sensor__Group__2__Impl_in_rule__Sensor__Group__22465 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Sensor__Group__3_in_rule__Sensor__Group__22468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Sensor__Group__2__Impl2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sensor__Group__3__Impl_in_rule__Sensor__Group__32527 = new BitSet(new long[]{0x0010008000000000L});
    public static final BitSet FOLLOW_rule__Sensor__Group__4_in_rule__Sensor__Group__32530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sensor__PinAssignment_3_in_rule__Sensor__Group__3__Impl2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sensor__Group__4__Impl_in_rule__Sensor__Group__42587 = new BitSet(new long[]{0x0010008000000000L});
    public static final BitSet FOLLOW_rule__Sensor__Group__5_in_rule__Sensor__Group__42590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sensor__AnalogAssignment_4_in_rule__Sensor__Group__4__Impl2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sensor__Group__5__Impl_in_rule__Sensor__Group__52648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Sensor__Group__5__Impl2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actuator__Group__0__Impl_in_rule__Actuator__Group__02719 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Actuator__Group__1_in_rule__Actuator__Group__02722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Actuator__Group__0__Impl2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actuator__Group__1__Impl_in_rule__Actuator__Group__12781 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Actuator__Group__2_in_rule__Actuator__Group__12784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actuator__NameAssignment_1_in_rule__Actuator__Group__1__Impl2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actuator__Group__2__Impl_in_rule__Actuator__Group__22841 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Actuator__Group__3_in_rule__Actuator__Group__22844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Actuator__Group__2__Impl2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actuator__Group__3__Impl_in_rule__Actuator__Group__32903 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Actuator__Group__4_in_rule__Actuator__Group__32906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actuator__PinAssignment_3_in_rule__Actuator__Group__3__Impl2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actuator__Group__4__Impl_in_rule__Actuator__Group__42963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Actuator__Group__4__Impl2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventHandler__Group__0__Impl_in_rule__EventHandler__Group__03032 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EventHandler__Group__1_in_rule__EventHandler__Group__03035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EventHandler__Group__0__Impl3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventHandler__Group__1__Impl_in_rule__EventHandler__Group__13094 = new BitSet(new long[]{0x0000008000000040L});
    public static final BitSet FOLLOW_rule__EventHandler__Group__2_in_rule__EventHandler__Group__13097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventHandler__NameAssignment_1_in_rule__EventHandler__Group__1__Impl3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventHandler__Group__2__Impl_in_rule__EventHandler__Group__23154 = new BitSet(new long[]{0x0000008000000040L});
    public static final BitSet FOLLOW_rule__EventHandler__Group__3_in_rule__EventHandler__Group__23157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventHandler__ChangeActuatorsAssignment_2_in_rule__EventHandler__Group__2__Impl3184 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__EventHandler__Group__3__Impl_in_rule__EventHandler__Group__33215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__EventHandler__Group__3__Impl3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeActuator__Group__0__Impl_in_rule__ChangeActuator__Group__03282 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ChangeActuator__Group__1_in_rule__ChangeActuator__Group__03285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeActuator__ActuatorAssignment_0_in_rule__ChangeActuator__Group__0__Impl3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeActuator__Group__1__Impl_in_rule__ChangeActuator__Group__13342 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__ChangeActuator__Group__2_in_rule__ChangeActuator__Group__13345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ChangeActuator__Group__1__Impl3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeActuator__Group__2__Impl_in_rule__ChangeActuator__Group__23404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeActuator__ActuatorStateAssignment_2_in_rule__ChangeActuator__Group__2__Impl3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__0__Impl_in_rule__SensorListener__Group__03467 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__1_in_rule__SensorListener__Group__03470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__SensorListener__Group__0__Impl3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__1__Impl_in_rule__SensorListener__Group__13529 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__2_in_rule__SensorListener__Group__13532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__SensorAssignment_1_in_rule__SensorListener__Group__1__Impl3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__2__Impl_in_rule__SensorListener__Group__23589 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__3_in_rule__SensorListener__Group__23592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__SensorListener__Group__2__Impl3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__3__Impl_in_rule__SensorListener__Group__33651 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__4_in_rule__SensorListener__Group__33654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group_3__0_in_rule__SensorListener__Group__3__Impl3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__4__Impl_in_rule__SensorListener__Group__43711 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__5_in_rule__SensorListener__Group__43714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__SensorListener__Group__4__Impl3742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__5__Impl_in_rule__SensorListener__Group__53773 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__6_in_rule__SensorListener__Group__53776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__EventHandlerAssignment_5_in_rule__SensorListener__Group__5__Impl3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__6__Impl_in_rule__SensorListener__Group__63833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__SensorListener__Group__6__Impl3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group_3__0__Impl_in_rule__SensorListener__Group_3__03906 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SensorListener__Group_3__1_in_rule__SensorListener__Group_3__03909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__TypeAssignment_3_0_in_rule__SensorListener__Group_3__0__Impl3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group_3__1__Impl_in_rule__SensorListener__Group_3__13966 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__SensorListener__Group_3__2_in_rule__SensorListener__Group_3__13969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__LAssignment_3_1_in_rule__SensorListener__Group_3__1__Impl3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group_3__2__Impl_in_rule__SensorListener__Group_3__24026 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SensorListener__Group_3__3_in_rule__SensorListener__Group_3__24029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__SensorListener__Group_3__2__Impl4057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group_3__3__Impl_in_rule__SensorListener__Group_3__34088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__HAssignment_3_3_in_rule__SensorListener__Group_3__3__Impl4115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precondition__Group_0__0__Impl_in_rule__Precondition__Group_0__04153 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Precondition__Group_0__1_in_rule__Precondition__Group_0__04156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precondition__Pre1Assignment_0_0_in_rule__Precondition__Group_0__0__Impl4183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precondition__Group_0__1__Impl_in_rule__Precondition__Group_0__14213 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Precondition__Group_0__2_in_rule__Precondition__Group_0__14216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precondition__OpAssignment_0_1_in_rule__Precondition__Group_0__1__Impl4243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precondition__Group_0__2__Impl_in_rule__Precondition__Group_0__24273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precondition__PreAssignment_0_2_in_rule__Precondition__Group_0__2__Impl4300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorValuePrecondition__Group__0__Impl_in_rule__SensorValuePrecondition__Group__04336 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_rule__SensorValuePrecondition__Group__1_in_rule__SensorValuePrecondition__Group__04339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorValuePrecondition__SensorAssignment_0_in_rule__SensorValuePrecondition__Group__0__Impl4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorValuePrecondition__Group__1__Impl_in_rule__SensorValuePrecondition__Group__14396 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__SensorValuePrecondition__Group__2_in_rule__SensorValuePrecondition__Group__14399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorValuePrecondition__CondAssignment_1_in_rule__SensorValuePrecondition__Group__1__Impl4426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorValuePrecondition__Group__2__Impl_in_rule__SensorValuePrecondition__Group__24456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorValuePrecondition__ValueAssignment_2_in_rule__SensorValuePrecondition__Group__2__Impl4483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group__0__Impl_in_rule__Timer__Group__04519 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Timer__Group__1_in_rule__Timer__Group__04522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Timer__Group__0__Impl4550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group__1__Impl_in_rule__Timer__Group__14581 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__Timer__Group__2_in_rule__Timer__Group__14584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__EventHandlerAssignment_1_in_rule__Timer__Group__1__Impl4611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group__2__Impl_in_rule__Timer__Group__24641 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__Timer__Group__3_in_rule__Timer__Group__24644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Timer__Group__2__Impl4672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group__3__Impl_in_rule__Timer__Group__34703 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Timer__Group__4_in_rule__Timer__Group__34706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__RepeattypeAssignment_3_in_rule__Timer__Group__3__Impl4733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group__4__Impl_in_rule__Timer__Group__44763 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Timer__Group__5_in_rule__Timer__Group__44766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Timer__Group__4__Impl4794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group__5__Impl_in_rule__Timer__Group__54825 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Timer__Group__6_in_rule__Timer__Group__54828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__TimerSecsAssignment_5_in_rule__Timer__Group__5__Impl4855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group__6__Impl_in_rule__Timer__Group__64885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Timer__Group__6__Impl4913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alarm__Group__0__Impl_in_rule__Alarm__Group__04958 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Alarm__Group__1_in_rule__Alarm__Group__04961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Alarm__Group__0__Impl4989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alarm__Group__1__Impl_in_rule__Alarm__Group__15020 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__Alarm__Group__2_in_rule__Alarm__Group__15023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alarm__EventHandlerAssignment_1_in_rule__Alarm__Group__1__Impl5050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alarm__Group__2__Impl_in_rule__Alarm__Group__25080 = new BitSet(new long[]{0x00000003FC000000L});
    public static final BitSet FOLLOW_rule__Alarm__Group__3_in_rule__Alarm__Group__25083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Alarm__Group__2__Impl5111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alarm__Group__3__Impl_in_rule__Alarm__Group__35142 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Alarm__Group__4_in_rule__Alarm__Group__35145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alarm__RepeattypeAssignment_3_in_rule__Alarm__Group__3__Impl5172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alarm__Group__4__Impl_in_rule__Alarm__Group__45202 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Alarm__Group__5_in_rule__Alarm__Group__45205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Alarm__Group__4__Impl5233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alarm__Group__5__Impl_in_rule__Alarm__Group__55264 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Alarm__Group__6_in_rule__Alarm__Group__55267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alarm__TimerHoursAssignment_5_in_rule__Alarm__Group__5__Impl5294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alarm__Group__6__Impl_in_rule__Alarm__Group__65324 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Alarm__Group__7_in_rule__Alarm__Group__65327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Alarm__Group__6__Impl5355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alarm__Group__7__Impl_in_rule__Alarm__Group__75386 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Alarm__Group__8_in_rule__Alarm__Group__75389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alarm__TimerMinutesAssignment_7_in_rule__Alarm__Group__7__Impl5416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alarm__Group__8__Impl_in_rule__Alarm__Group__85446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Alarm__Group__8__Impl5474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_15528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__HardwareAlternatives_3_0_in_rule__Model__HardwareAssignment_35559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDevice_in_rule__Model__DevicesAssignment_45592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventHandler_in_rule__Model__EventHandlersAssignment_55623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorListener_in_rule__Model__SensorListenersAssignment_65654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimer_in_rule__Model__TimersAssignment_75685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlarm_in_rule__Model__AlarmsAssignment_85716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PriorityAlternatives_10_0_in_rule__Model__PriorityAssignment_105747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Sensor__NameAssignment_15780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Sensor__PinAssignment_35811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Sensor__AnalogAssignment_45847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Actuator__NameAssignment_15886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Actuator__PinAssignment_35917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EventHandler__NameAssignment_15948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChangeActuator_in_rule__EventHandler__ChangeActuatorsAssignment_25979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ChangeActuator__ActuatorAssignment_06014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeActuator__ActuatorStateAlternatives_2_0_in_rule__ChangeActuator__ActuatorStateAssignment_26049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SensorListener__SensorAssignment_16086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__SensorListener__TypeAssignment_3_06126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SensorListener__LAssignment_3_16165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SensorListener__HAssignment_3_36196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SensorListener__EventHandlerAssignment_56231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecondition1_in_rule__Precondition__Pre1Assignment_0_06266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precondition__OpAlternatives_0_1_0_in_rule__Precondition__OpAssignment_0_16297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecondition_in_rule__Precondition__PreAssignment_0_26330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecondition1_in_rule__Precondition__Pre1Assignment_16361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorValuePrecondition_in_rule__Precondition1__PreAssignment_06392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyPrecondition_in_rule__Precondition1__PreAssignment_16423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EmptyPrecondition__NameAssignment6454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SensorValuePrecondition__SensorAssignment_06489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorValuePrecondition__CondAlternatives_1_0_in_rule__SensorValuePrecondition__CondAssignment_16524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePossibleValues_in_rule__SensorValuePrecondition__ValueAssignment_26557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Timer__EventHandlerAssignment_16592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__RepeattypeAlternatives_3_0_in_rule__Timer__RepeattypeAssignment_36627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Timer__TimerSecsAssignment_56660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Alarm__EventHandlerAssignment_16695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alarm__RepeattypeAlternatives_3_0_in_rule__Alarm__RepeattypeAssignment_36730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Alarm__TimerHoursAssignment_56763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Alarm__TimerMinutesAssignment_76794 = new BitSet(new long[]{0x0000000000000002L});

}