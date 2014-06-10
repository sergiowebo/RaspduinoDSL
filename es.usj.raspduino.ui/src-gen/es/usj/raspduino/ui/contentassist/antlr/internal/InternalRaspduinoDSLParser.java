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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Arduino UNO'", "'Raspberry Pi'", "'On'", "'Off'", "'Toggle'", "'Sketch:'", "'Hardware:'", "'Sensor'", "'pin'", "'Actuator'", "'EventHandler'", "';'", "':'", "'SensorListener'", "'if'", "'call'", "'AND'", "'Timer action'", "'repeat'", "'seconds'", "'ON'", "'OFF'", "'BETWEEN'", "'EVERY INTERVAL of'", "'EVERY DAY at'", "'EVERY MONDAY at'", "'EVERY TUESDAY at'", "'EVERY WEDNESDAY at'", "'EVERY THURSDAY at'", "'EVERY FRIDAY at'", "'EVERY SATURDAY at'", "'EVERY SUNDAY at'"
    };
    public static final int T__42=42;
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

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


    // $ANTLR start "entryRuleTimer"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:256:1: entryRuleTimer : ruleTimer EOF ;
    public final void entryRuleTimer() throws RecognitionException {
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:257:1: ( ruleTimer EOF )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:258:1: ruleTimer EOF
            {
             before(grammarAccess.getTimerRule()); 
            pushFollow(FOLLOW_ruleTimer_in_entryRuleTimer481);
            ruleTimer();

            state._fsp--;

             after(grammarAccess.getTimerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimer488); 

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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:265:1: ruleTimer : ( ( rule__Timer__Group__0 ) ) ;
    public final void ruleTimer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:269:2: ( ( ( rule__Timer__Group__0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:270:1: ( ( rule__Timer__Group__0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:270:1: ( ( rule__Timer__Group__0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:271:1: ( rule__Timer__Group__0 )
            {
             before(grammarAccess.getTimerAccess().getGroup()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:272:1: ( rule__Timer__Group__0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:272:2: rule__Timer__Group__0
            {
            pushFollow(FOLLOW_rule__Timer__Group__0_in_ruleTimer514);
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


    // $ANTLR start "rule__Model__HardwareAlternatives_3_0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:284:1: rule__Model__HardwareAlternatives_3_0 : ( ( 'Arduino UNO' ) | ( 'Raspberry Pi' ) );
    public final void rule__Model__HardwareAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:288:1: ( ( 'Arduino UNO' ) | ( 'Raspberry Pi' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:289:1: ( 'Arduino UNO' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:289:1: ( 'Arduino UNO' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:290:1: 'Arduino UNO'
                    {
                     before(grammarAccess.getModelAccess().getHardwareArduinoUNOKeyword_3_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Model__HardwareAlternatives_3_0551); 
                     after(grammarAccess.getModelAccess().getHardwareArduinoUNOKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:297:6: ( 'Raspberry Pi' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:297:6: ( 'Raspberry Pi' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:298:1: 'Raspberry Pi'
                    {
                     before(grammarAccess.getModelAccess().getHardwareRaspberryPiKeyword_3_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Model__HardwareAlternatives_3_0571); 
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


    // $ANTLR start "rule__AbstractDevice__Alternatives"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:310:1: rule__AbstractDevice__Alternatives : ( ( ruleSensor ) | ( ruleActuator ) );
    public final void rule__AbstractDevice__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:314:1: ( ( ruleSensor ) | ( ruleActuator ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:315:1: ( ruleSensor )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:315:1: ( ruleSensor )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:316:1: ruleSensor
                    {
                     before(grammarAccess.getAbstractDeviceAccess().getSensorParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSensor_in_rule__AbstractDevice__Alternatives605);
                    ruleSensor();

                    state._fsp--;

                     after(grammarAccess.getAbstractDeviceAccess().getSensorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:321:6: ( ruleActuator )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:321:6: ( ruleActuator )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:322:1: ruleActuator
                    {
                     before(grammarAccess.getAbstractDeviceAccess().getActuatorParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleActuator_in_rule__AbstractDevice__Alternatives622);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:332:1: rule__ChangeActuator__ActuatorStateAlternatives_2_0 : ( ( 'On' ) | ( 'Off' ) | ( 'Toggle' ) );
    public final void rule__ChangeActuator__ActuatorStateAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:336:1: ( ( 'On' ) | ( 'Off' ) | ( 'Toggle' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:337:1: ( 'On' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:337:1: ( 'On' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:338:1: 'On'
                    {
                     before(grammarAccess.getChangeActuatorAccess().getActuatorStateOnKeyword_2_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__ChangeActuator__ActuatorStateAlternatives_2_0655); 
                     after(grammarAccess.getChangeActuatorAccess().getActuatorStateOnKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:345:6: ( 'Off' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:345:6: ( 'Off' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:346:1: 'Off'
                    {
                     before(grammarAccess.getChangeActuatorAccess().getActuatorStateOffKeyword_2_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__ChangeActuator__ActuatorStateAlternatives_2_0675); 
                     after(grammarAccess.getChangeActuatorAccess().getActuatorStateOffKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:353:6: ( 'Toggle' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:353:6: ( 'Toggle' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:354:1: 'Toggle'
                    {
                     before(grammarAccess.getChangeActuatorAccess().getActuatorStateToggleKeyword_2_0_2()); 
                    match(input,15,FOLLOW_15_in_rule__ChangeActuator__ActuatorStateAlternatives_2_0695); 
                     after(grammarAccess.getChangeActuatorAccess().getActuatorStateToggleKeyword_2_0_2()); 

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


    // $ANTLR start "rule__SensorListener__Alternatives_3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:366:1: rule__SensorListener__Alternatives_3 : ( ( ( rule__SensorListener__TypeAssignment_3_0 ) ) | ( ( rule__SensorListener__TypeAssignment_3_1 ) ) | ( ( rule__SensorListener__Group_3_2__0 ) ) );
    public final void rule__SensorListener__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:370:1: ( ( ( rule__SensorListener__TypeAssignment_3_0 ) ) | ( ( rule__SensorListener__TypeAssignment_3_1 ) ) | ( ( rule__SensorListener__Group_3_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt4=1;
                }
                break;
            case 32:
                {
                alt4=2;
                }
                break;
            case 33:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:371:1: ( ( rule__SensorListener__TypeAssignment_3_0 ) )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:371:1: ( ( rule__SensorListener__TypeAssignment_3_0 ) )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:372:1: ( rule__SensorListener__TypeAssignment_3_0 )
                    {
                     before(grammarAccess.getSensorListenerAccess().getTypeAssignment_3_0()); 
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:373:1: ( rule__SensorListener__TypeAssignment_3_0 )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:373:2: rule__SensorListener__TypeAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__SensorListener__TypeAssignment_3_0_in_rule__SensorListener__Alternatives_3729);
                    rule__SensorListener__TypeAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSensorListenerAccess().getTypeAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:377:6: ( ( rule__SensorListener__TypeAssignment_3_1 ) )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:377:6: ( ( rule__SensorListener__TypeAssignment_3_1 ) )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:378:1: ( rule__SensorListener__TypeAssignment_3_1 )
                    {
                     before(grammarAccess.getSensorListenerAccess().getTypeAssignment_3_1()); 
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:379:1: ( rule__SensorListener__TypeAssignment_3_1 )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:379:2: rule__SensorListener__TypeAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__SensorListener__TypeAssignment_3_1_in_rule__SensorListener__Alternatives_3747);
                    rule__SensorListener__TypeAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSensorListenerAccess().getTypeAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:383:6: ( ( rule__SensorListener__Group_3_2__0 ) )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:383:6: ( ( rule__SensorListener__Group_3_2__0 ) )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:384:1: ( rule__SensorListener__Group_3_2__0 )
                    {
                     before(grammarAccess.getSensorListenerAccess().getGroup_3_2()); 
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:385:1: ( rule__SensorListener__Group_3_2__0 )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:385:2: rule__SensorListener__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__SensorListener__Group_3_2__0_in_rule__SensorListener__Alternatives_3765);
                    rule__SensorListener__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSensorListenerAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__SensorListener__Alternatives_3"


    // $ANTLR start "rule__Timer__Alternatives_3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:394:1: rule__Timer__Alternatives_3 : ( ( ( rule__Timer__Group_3_0__0 ) ) | ( ( rule__Timer__Group_3_1__0 ) ) | ( ( rule__Timer__Group_3_2__0 ) ) | ( ( rule__Timer__Group_3_3__0 ) ) | ( ( rule__Timer__Group_3_4__0 ) ) | ( ( rule__Timer__Group_3_5__0 ) ) | ( ( rule__Timer__Group_3_6__0 ) ) | ( ( rule__Timer__Group_3_7__0 ) ) | ( ( rule__Timer__Group_3_8__0 ) ) );
    public final void rule__Timer__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:398:1: ( ( ( rule__Timer__Group_3_0__0 ) ) | ( ( rule__Timer__Group_3_1__0 ) ) | ( ( rule__Timer__Group_3_2__0 ) ) | ( ( rule__Timer__Group_3_3__0 ) ) | ( ( rule__Timer__Group_3_4__0 ) ) | ( ( rule__Timer__Group_3_5__0 ) ) | ( ( rule__Timer__Group_3_6__0 ) ) | ( ( rule__Timer__Group_3_7__0 ) ) | ( ( rule__Timer__Group_3_8__0 ) ) )
            int alt5=9;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt5=1;
                }
                break;
            case 35:
                {
                alt5=2;
                }
                break;
            case 36:
                {
                alt5=3;
                }
                break;
            case 37:
                {
                alt5=4;
                }
                break;
            case 38:
                {
                alt5=5;
                }
                break;
            case 39:
                {
                alt5=6;
                }
                break;
            case 40:
                {
                alt5=7;
                }
                break;
            case 41:
                {
                alt5=8;
                }
                break;
            case 42:
                {
                alt5=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:399:1: ( ( rule__Timer__Group_3_0__0 ) )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:399:1: ( ( rule__Timer__Group_3_0__0 ) )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:400:1: ( rule__Timer__Group_3_0__0 )
                    {
                     before(grammarAccess.getTimerAccess().getGroup_3_0()); 
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:401:1: ( rule__Timer__Group_3_0__0 )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:401:2: rule__Timer__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__Timer__Group_3_0__0_in_rule__Timer__Alternatives_3798);
                    rule__Timer__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimerAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:405:6: ( ( rule__Timer__Group_3_1__0 ) )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:405:6: ( ( rule__Timer__Group_3_1__0 ) )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:406:1: ( rule__Timer__Group_3_1__0 )
                    {
                     before(grammarAccess.getTimerAccess().getGroup_3_1()); 
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:407:1: ( rule__Timer__Group_3_1__0 )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:407:2: rule__Timer__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Timer__Group_3_1__0_in_rule__Timer__Alternatives_3816);
                    rule__Timer__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimerAccess().getGroup_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:411:6: ( ( rule__Timer__Group_3_2__0 ) )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:411:6: ( ( rule__Timer__Group_3_2__0 ) )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:412:1: ( rule__Timer__Group_3_2__0 )
                    {
                     before(grammarAccess.getTimerAccess().getGroup_3_2()); 
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:413:1: ( rule__Timer__Group_3_2__0 )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:413:2: rule__Timer__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__Timer__Group_3_2__0_in_rule__Timer__Alternatives_3834);
                    rule__Timer__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimerAccess().getGroup_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:417:6: ( ( rule__Timer__Group_3_3__0 ) )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:417:6: ( ( rule__Timer__Group_3_3__0 ) )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:418:1: ( rule__Timer__Group_3_3__0 )
                    {
                     before(grammarAccess.getTimerAccess().getGroup_3_3()); 
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:419:1: ( rule__Timer__Group_3_3__0 )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:419:2: rule__Timer__Group_3_3__0
                    {
                    pushFollow(FOLLOW_rule__Timer__Group_3_3__0_in_rule__Timer__Alternatives_3852);
                    rule__Timer__Group_3_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimerAccess().getGroup_3_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:423:6: ( ( rule__Timer__Group_3_4__0 ) )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:423:6: ( ( rule__Timer__Group_3_4__0 ) )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:424:1: ( rule__Timer__Group_3_4__0 )
                    {
                     before(grammarAccess.getTimerAccess().getGroup_3_4()); 
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:425:1: ( rule__Timer__Group_3_4__0 )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:425:2: rule__Timer__Group_3_4__0
                    {
                    pushFollow(FOLLOW_rule__Timer__Group_3_4__0_in_rule__Timer__Alternatives_3870);
                    rule__Timer__Group_3_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimerAccess().getGroup_3_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:429:6: ( ( rule__Timer__Group_3_5__0 ) )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:429:6: ( ( rule__Timer__Group_3_5__0 ) )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:430:1: ( rule__Timer__Group_3_5__0 )
                    {
                     before(grammarAccess.getTimerAccess().getGroup_3_5()); 
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:431:1: ( rule__Timer__Group_3_5__0 )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:431:2: rule__Timer__Group_3_5__0
                    {
                    pushFollow(FOLLOW_rule__Timer__Group_3_5__0_in_rule__Timer__Alternatives_3888);
                    rule__Timer__Group_3_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimerAccess().getGroup_3_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:435:6: ( ( rule__Timer__Group_3_6__0 ) )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:435:6: ( ( rule__Timer__Group_3_6__0 ) )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:436:1: ( rule__Timer__Group_3_6__0 )
                    {
                     before(grammarAccess.getTimerAccess().getGroup_3_6()); 
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:437:1: ( rule__Timer__Group_3_6__0 )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:437:2: rule__Timer__Group_3_6__0
                    {
                    pushFollow(FOLLOW_rule__Timer__Group_3_6__0_in_rule__Timer__Alternatives_3906);
                    rule__Timer__Group_3_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimerAccess().getGroup_3_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:441:6: ( ( rule__Timer__Group_3_7__0 ) )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:441:6: ( ( rule__Timer__Group_3_7__0 ) )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:442:1: ( rule__Timer__Group_3_7__0 )
                    {
                     before(grammarAccess.getTimerAccess().getGroup_3_7()); 
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:443:1: ( rule__Timer__Group_3_7__0 )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:443:2: rule__Timer__Group_3_7__0
                    {
                    pushFollow(FOLLOW_rule__Timer__Group_3_7__0_in_rule__Timer__Alternatives_3924);
                    rule__Timer__Group_3_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimerAccess().getGroup_3_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:447:6: ( ( rule__Timer__Group_3_8__0 ) )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:447:6: ( ( rule__Timer__Group_3_8__0 ) )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:448:1: ( rule__Timer__Group_3_8__0 )
                    {
                     before(grammarAccess.getTimerAccess().getGroup_3_8()); 
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:449:1: ( rule__Timer__Group_3_8__0 )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:449:2: rule__Timer__Group_3_8__0
                    {
                    pushFollow(FOLLOW_rule__Timer__Group_3_8__0_in_rule__Timer__Alternatives_3942);
                    rule__Timer__Group_3_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimerAccess().getGroup_3_8()); 

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
    // $ANTLR end "rule__Timer__Alternatives_3"


    // $ANTLR start "rule__Model__Group__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:460:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:464:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:465:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0973);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0976);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:472:1: rule__Model__Group__0__Impl : ( 'Sketch:' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:476:1: ( ( 'Sketch:' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:477:1: ( 'Sketch:' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:477:1: ( 'Sketch:' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:478:1: 'Sketch:'
            {
             before(grammarAccess.getModelAccess().getSketchKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Model__Group__0__Impl1004); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:491:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:495:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:496:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11035);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11038);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:503:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:507:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:508:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:508:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:509:1: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:510:1: ( rule__Model__NameAssignment_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:510:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl1065);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:520:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:524:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:525:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21095);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21098);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:532:1: rule__Model__Group__2__Impl : ( 'Hardware:' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:536:1: ( ( 'Hardware:' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:537:1: ( 'Hardware:' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:537:1: ( 'Hardware:' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:538:1: 'Hardware:'
            {
             before(grammarAccess.getModelAccess().getHardwareKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Model__Group__2__Impl1126); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:551:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:555:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:556:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31157);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31160);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:563:1: rule__Model__Group__3__Impl : ( ( rule__Model__HardwareAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:567:1: ( ( ( rule__Model__HardwareAssignment_3 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:568:1: ( ( rule__Model__HardwareAssignment_3 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:568:1: ( ( rule__Model__HardwareAssignment_3 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:569:1: ( rule__Model__HardwareAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getHardwareAssignment_3()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:570:1: ( rule__Model__HardwareAssignment_3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:570:2: rule__Model__HardwareAssignment_3
            {
            pushFollow(FOLLOW_rule__Model__HardwareAssignment_3_in_rule__Model__Group__3__Impl1187);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:580:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:584:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:585:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41217);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41220);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:592:1: rule__Model__Group__4__Impl : ( ( rule__Model__DevicesAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:596:1: ( ( ( rule__Model__DevicesAssignment_4 )* ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:597:1: ( ( rule__Model__DevicesAssignment_4 )* )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:597:1: ( ( rule__Model__DevicesAssignment_4 )* )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:598:1: ( rule__Model__DevicesAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getDevicesAssignment_4()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:599:1: ( rule__Model__DevicesAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18||LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:599:2: rule__Model__DevicesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__DevicesAssignment_4_in_rule__Model__Group__4__Impl1247);
            	    rule__Model__DevicesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:609:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:613:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:614:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51278);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51281);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:621:1: rule__Model__Group__5__Impl : ( ( rule__Model__EventHandlersAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:625:1: ( ( ( rule__Model__EventHandlersAssignment_5 )* ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:626:1: ( ( rule__Model__EventHandlersAssignment_5 )* )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:626:1: ( ( rule__Model__EventHandlersAssignment_5 )* )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:627:1: ( rule__Model__EventHandlersAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getEventHandlersAssignment_5()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:628:1: ( rule__Model__EventHandlersAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:628:2: rule__Model__EventHandlersAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Model__EventHandlersAssignment_5_in_rule__Model__Group__5__Impl1308);
            	    rule__Model__EventHandlersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:638:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:642:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:643:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61339);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61342);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:650:1: rule__Model__Group__6__Impl : ( ( rule__Model__SensorListenersAssignment_6 )* ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:654:1: ( ( ( rule__Model__SensorListenersAssignment_6 )* ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:655:1: ( ( rule__Model__SensorListenersAssignment_6 )* )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:655:1: ( ( rule__Model__SensorListenersAssignment_6 )* )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:656:1: ( rule__Model__SensorListenersAssignment_6 )*
            {
             before(grammarAccess.getModelAccess().getSensorListenersAssignment_6()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:657:1: ( rule__Model__SensorListenersAssignment_6 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:657:2: rule__Model__SensorListenersAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Model__SensorListenersAssignment_6_in_rule__Model__Group__6__Impl1369);
            	    rule__Model__SensorListenersAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:667:1: rule__Model__Group__7 : rule__Model__Group__7__Impl ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:671:1: ( rule__Model__Group__7__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:672:2: rule__Model__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71400);
            rule__Model__Group__7__Impl();

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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:678:1: rule__Model__Group__7__Impl : ( ( rule__Model__TimersAssignment_7 )* ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:682:1: ( ( ( rule__Model__TimersAssignment_7 )* ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:683:1: ( ( rule__Model__TimersAssignment_7 )* )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:683:1: ( ( rule__Model__TimersAssignment_7 )* )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:684:1: ( rule__Model__TimersAssignment_7 )*
            {
             before(grammarAccess.getModelAccess().getTimersAssignment_7()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:685:1: ( rule__Model__TimersAssignment_7 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:685:2: rule__Model__TimersAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Model__TimersAssignment_7_in_rule__Model__Group__7__Impl1427);
            	    rule__Model__TimersAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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


    // $ANTLR start "rule__Sensor__Group__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:711:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:715:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:716:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_rule__Sensor__Group__0__Impl_in_rule__Sensor__Group__01474);
            rule__Sensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sensor__Group__1_in_rule__Sensor__Group__01477);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:723:1: rule__Sensor__Group__0__Impl : ( 'Sensor' ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:727:1: ( ( 'Sensor' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:728:1: ( 'Sensor' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:728:1: ( 'Sensor' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:729:1: 'Sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Sensor__Group__0__Impl1505); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:742:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:746:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:747:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
            {
            pushFollow(FOLLOW_rule__Sensor__Group__1__Impl_in_rule__Sensor__Group__11536);
            rule__Sensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sensor__Group__2_in_rule__Sensor__Group__11539);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:754:1: rule__Sensor__Group__1__Impl : ( ( rule__Sensor__NameAssignment_1 ) ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:758:1: ( ( ( rule__Sensor__NameAssignment_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:759:1: ( ( rule__Sensor__NameAssignment_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:759:1: ( ( rule__Sensor__NameAssignment_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:760:1: ( rule__Sensor__NameAssignment_1 )
            {
             before(grammarAccess.getSensorAccess().getNameAssignment_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:761:1: ( rule__Sensor__NameAssignment_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:761:2: rule__Sensor__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Sensor__NameAssignment_1_in_rule__Sensor__Group__1__Impl1566);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:771:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl rule__Sensor__Group__3 ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:775:1: ( rule__Sensor__Group__2__Impl rule__Sensor__Group__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:776:2: rule__Sensor__Group__2__Impl rule__Sensor__Group__3
            {
            pushFollow(FOLLOW_rule__Sensor__Group__2__Impl_in_rule__Sensor__Group__21596);
            rule__Sensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sensor__Group__3_in_rule__Sensor__Group__21599);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:783:1: rule__Sensor__Group__2__Impl : ( 'pin' ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:787:1: ( ( 'pin' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:788:1: ( 'pin' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:788:1: ( 'pin' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:789:1: 'pin'
            {
             before(grammarAccess.getSensorAccess().getPinKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Sensor__Group__2__Impl1627); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:802:1: rule__Sensor__Group__3 : rule__Sensor__Group__3__Impl ;
    public final void rule__Sensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:806:1: ( rule__Sensor__Group__3__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:807:2: rule__Sensor__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Sensor__Group__3__Impl_in_rule__Sensor__Group__31658);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:813:1: rule__Sensor__Group__3__Impl : ( ( rule__Sensor__PinAssignment_3 ) ) ;
    public final void rule__Sensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:817:1: ( ( ( rule__Sensor__PinAssignment_3 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:818:1: ( ( rule__Sensor__PinAssignment_3 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:818:1: ( ( rule__Sensor__PinAssignment_3 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:819:1: ( rule__Sensor__PinAssignment_3 )
            {
             before(grammarAccess.getSensorAccess().getPinAssignment_3()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:820:1: ( rule__Sensor__PinAssignment_3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:820:2: rule__Sensor__PinAssignment_3
            {
            pushFollow(FOLLOW_rule__Sensor__PinAssignment_3_in_rule__Sensor__Group__3__Impl1685);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:838:1: rule__Actuator__Group__0 : rule__Actuator__Group__0__Impl rule__Actuator__Group__1 ;
    public final void rule__Actuator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:842:1: ( rule__Actuator__Group__0__Impl rule__Actuator__Group__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:843:2: rule__Actuator__Group__0__Impl rule__Actuator__Group__1
            {
            pushFollow(FOLLOW_rule__Actuator__Group__0__Impl_in_rule__Actuator__Group__01723);
            rule__Actuator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Actuator__Group__1_in_rule__Actuator__Group__01726);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:850:1: rule__Actuator__Group__0__Impl : ( 'Actuator' ) ;
    public final void rule__Actuator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:854:1: ( ( 'Actuator' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:855:1: ( 'Actuator' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:855:1: ( 'Actuator' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:856:1: 'Actuator'
            {
             before(grammarAccess.getActuatorAccess().getActuatorKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Actuator__Group__0__Impl1754); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:869:1: rule__Actuator__Group__1 : rule__Actuator__Group__1__Impl rule__Actuator__Group__2 ;
    public final void rule__Actuator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:873:1: ( rule__Actuator__Group__1__Impl rule__Actuator__Group__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:874:2: rule__Actuator__Group__1__Impl rule__Actuator__Group__2
            {
            pushFollow(FOLLOW_rule__Actuator__Group__1__Impl_in_rule__Actuator__Group__11785);
            rule__Actuator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Actuator__Group__2_in_rule__Actuator__Group__11788);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:881:1: rule__Actuator__Group__1__Impl : ( ( rule__Actuator__NameAssignment_1 ) ) ;
    public final void rule__Actuator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:885:1: ( ( ( rule__Actuator__NameAssignment_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:886:1: ( ( rule__Actuator__NameAssignment_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:886:1: ( ( rule__Actuator__NameAssignment_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:887:1: ( rule__Actuator__NameAssignment_1 )
            {
             before(grammarAccess.getActuatorAccess().getNameAssignment_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:888:1: ( rule__Actuator__NameAssignment_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:888:2: rule__Actuator__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Actuator__NameAssignment_1_in_rule__Actuator__Group__1__Impl1815);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:898:1: rule__Actuator__Group__2 : rule__Actuator__Group__2__Impl rule__Actuator__Group__3 ;
    public final void rule__Actuator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:902:1: ( rule__Actuator__Group__2__Impl rule__Actuator__Group__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:903:2: rule__Actuator__Group__2__Impl rule__Actuator__Group__3
            {
            pushFollow(FOLLOW_rule__Actuator__Group__2__Impl_in_rule__Actuator__Group__21845);
            rule__Actuator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Actuator__Group__3_in_rule__Actuator__Group__21848);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:910:1: rule__Actuator__Group__2__Impl : ( 'pin' ) ;
    public final void rule__Actuator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:914:1: ( ( 'pin' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:915:1: ( 'pin' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:915:1: ( 'pin' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:916:1: 'pin'
            {
             before(grammarAccess.getActuatorAccess().getPinKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Actuator__Group__2__Impl1876); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:929:1: rule__Actuator__Group__3 : rule__Actuator__Group__3__Impl ;
    public final void rule__Actuator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:933:1: ( rule__Actuator__Group__3__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:934:2: rule__Actuator__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Actuator__Group__3__Impl_in_rule__Actuator__Group__31907);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:940:1: rule__Actuator__Group__3__Impl : ( ( rule__Actuator__PinAssignment_3 ) ) ;
    public final void rule__Actuator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:944:1: ( ( ( rule__Actuator__PinAssignment_3 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:945:1: ( ( rule__Actuator__PinAssignment_3 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:945:1: ( ( rule__Actuator__PinAssignment_3 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:946:1: ( rule__Actuator__PinAssignment_3 )
            {
             before(grammarAccess.getActuatorAccess().getPinAssignment_3()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:947:1: ( rule__Actuator__PinAssignment_3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:947:2: rule__Actuator__PinAssignment_3
            {
            pushFollow(FOLLOW_rule__Actuator__PinAssignment_3_in_rule__Actuator__Group__3__Impl1934);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:965:1: rule__EventHandler__Group__0 : rule__EventHandler__Group__0__Impl rule__EventHandler__Group__1 ;
    public final void rule__EventHandler__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:969:1: ( rule__EventHandler__Group__0__Impl rule__EventHandler__Group__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:970:2: rule__EventHandler__Group__0__Impl rule__EventHandler__Group__1
            {
            pushFollow(FOLLOW_rule__EventHandler__Group__0__Impl_in_rule__EventHandler__Group__01972);
            rule__EventHandler__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventHandler__Group__1_in_rule__EventHandler__Group__01975);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:977:1: rule__EventHandler__Group__0__Impl : ( 'EventHandler' ) ;
    public final void rule__EventHandler__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:981:1: ( ( 'EventHandler' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:982:1: ( 'EventHandler' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:982:1: ( 'EventHandler' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:983:1: 'EventHandler'
            {
             before(grammarAccess.getEventHandlerAccess().getEventHandlerKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__EventHandler__Group__0__Impl2003); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:996:1: rule__EventHandler__Group__1 : rule__EventHandler__Group__1__Impl rule__EventHandler__Group__2 ;
    public final void rule__EventHandler__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1000:1: ( rule__EventHandler__Group__1__Impl rule__EventHandler__Group__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1001:2: rule__EventHandler__Group__1__Impl rule__EventHandler__Group__2
            {
            pushFollow(FOLLOW_rule__EventHandler__Group__1__Impl_in_rule__EventHandler__Group__12034);
            rule__EventHandler__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventHandler__Group__2_in_rule__EventHandler__Group__12037);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1008:1: rule__EventHandler__Group__1__Impl : ( ( rule__EventHandler__NameAssignment_1 ) ) ;
    public final void rule__EventHandler__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1012:1: ( ( ( rule__EventHandler__NameAssignment_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1013:1: ( ( rule__EventHandler__NameAssignment_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1013:1: ( ( rule__EventHandler__NameAssignment_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1014:1: ( rule__EventHandler__NameAssignment_1 )
            {
             before(grammarAccess.getEventHandlerAccess().getNameAssignment_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1015:1: ( rule__EventHandler__NameAssignment_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1015:2: rule__EventHandler__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EventHandler__NameAssignment_1_in_rule__EventHandler__Group__1__Impl2064);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1025:1: rule__EventHandler__Group__2 : rule__EventHandler__Group__2__Impl rule__EventHandler__Group__3 ;
    public final void rule__EventHandler__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1029:1: ( rule__EventHandler__Group__2__Impl rule__EventHandler__Group__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1030:2: rule__EventHandler__Group__2__Impl rule__EventHandler__Group__3
            {
            pushFollow(FOLLOW_rule__EventHandler__Group__2__Impl_in_rule__EventHandler__Group__22094);
            rule__EventHandler__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventHandler__Group__3_in_rule__EventHandler__Group__22097);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1037:1: rule__EventHandler__Group__2__Impl : ( ( rule__EventHandler__ChangeActuatorsAssignment_2 )* ) ;
    public final void rule__EventHandler__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1041:1: ( ( ( rule__EventHandler__ChangeActuatorsAssignment_2 )* ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1042:1: ( ( rule__EventHandler__ChangeActuatorsAssignment_2 )* )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1042:1: ( ( rule__EventHandler__ChangeActuatorsAssignment_2 )* )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1043:1: ( rule__EventHandler__ChangeActuatorsAssignment_2 )*
            {
             before(grammarAccess.getEventHandlerAccess().getChangeActuatorsAssignment_2()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1044:1: ( rule__EventHandler__ChangeActuatorsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1044:2: rule__EventHandler__ChangeActuatorsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__EventHandler__ChangeActuatorsAssignment_2_in_rule__EventHandler__Group__2__Impl2124);
            	    rule__EventHandler__ChangeActuatorsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1054:1: rule__EventHandler__Group__3 : rule__EventHandler__Group__3__Impl ;
    public final void rule__EventHandler__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1058:1: ( rule__EventHandler__Group__3__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1059:2: rule__EventHandler__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EventHandler__Group__3__Impl_in_rule__EventHandler__Group__32155);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1065:1: rule__EventHandler__Group__3__Impl : ( ';' ) ;
    public final void rule__EventHandler__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1069:1: ( ( ';' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1070:1: ( ';' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1070:1: ( ';' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1071:1: ';'
            {
             before(grammarAccess.getEventHandlerAccess().getSemicolonKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__EventHandler__Group__3__Impl2183); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1092:1: rule__ChangeActuator__Group__0 : rule__ChangeActuator__Group__0__Impl rule__ChangeActuator__Group__1 ;
    public final void rule__ChangeActuator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1096:1: ( rule__ChangeActuator__Group__0__Impl rule__ChangeActuator__Group__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1097:2: rule__ChangeActuator__Group__0__Impl rule__ChangeActuator__Group__1
            {
            pushFollow(FOLLOW_rule__ChangeActuator__Group__0__Impl_in_rule__ChangeActuator__Group__02222);
            rule__ChangeActuator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChangeActuator__Group__1_in_rule__ChangeActuator__Group__02225);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1104:1: rule__ChangeActuator__Group__0__Impl : ( ( rule__ChangeActuator__ActuatorAssignment_0 ) ) ;
    public final void rule__ChangeActuator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1108:1: ( ( ( rule__ChangeActuator__ActuatorAssignment_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1109:1: ( ( rule__ChangeActuator__ActuatorAssignment_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1109:1: ( ( rule__ChangeActuator__ActuatorAssignment_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1110:1: ( rule__ChangeActuator__ActuatorAssignment_0 )
            {
             before(grammarAccess.getChangeActuatorAccess().getActuatorAssignment_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1111:1: ( rule__ChangeActuator__ActuatorAssignment_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1111:2: rule__ChangeActuator__ActuatorAssignment_0
            {
            pushFollow(FOLLOW_rule__ChangeActuator__ActuatorAssignment_0_in_rule__ChangeActuator__Group__0__Impl2252);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1121:1: rule__ChangeActuator__Group__1 : rule__ChangeActuator__Group__1__Impl rule__ChangeActuator__Group__2 ;
    public final void rule__ChangeActuator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1125:1: ( rule__ChangeActuator__Group__1__Impl rule__ChangeActuator__Group__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1126:2: rule__ChangeActuator__Group__1__Impl rule__ChangeActuator__Group__2
            {
            pushFollow(FOLLOW_rule__ChangeActuator__Group__1__Impl_in_rule__ChangeActuator__Group__12282);
            rule__ChangeActuator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChangeActuator__Group__2_in_rule__ChangeActuator__Group__12285);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1133:1: rule__ChangeActuator__Group__1__Impl : ( ':' ) ;
    public final void rule__ChangeActuator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1137:1: ( ( ':' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1138:1: ( ':' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1138:1: ( ':' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1139:1: ':'
            {
             before(grammarAccess.getChangeActuatorAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__ChangeActuator__Group__1__Impl2313); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1152:1: rule__ChangeActuator__Group__2 : rule__ChangeActuator__Group__2__Impl ;
    public final void rule__ChangeActuator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1156:1: ( rule__ChangeActuator__Group__2__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1157:2: rule__ChangeActuator__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ChangeActuator__Group__2__Impl_in_rule__ChangeActuator__Group__22344);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1163:1: rule__ChangeActuator__Group__2__Impl : ( ( rule__ChangeActuator__ActuatorStateAssignment_2 ) ) ;
    public final void rule__ChangeActuator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1167:1: ( ( ( rule__ChangeActuator__ActuatorStateAssignment_2 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1168:1: ( ( rule__ChangeActuator__ActuatorStateAssignment_2 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1168:1: ( ( rule__ChangeActuator__ActuatorStateAssignment_2 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1169:1: ( rule__ChangeActuator__ActuatorStateAssignment_2 )
            {
             before(grammarAccess.getChangeActuatorAccess().getActuatorStateAssignment_2()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1170:1: ( rule__ChangeActuator__ActuatorStateAssignment_2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1170:2: rule__ChangeActuator__ActuatorStateAssignment_2
            {
            pushFollow(FOLLOW_rule__ChangeActuator__ActuatorStateAssignment_2_in_rule__ChangeActuator__Group__2__Impl2371);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1186:1: rule__SensorListener__Group__0 : rule__SensorListener__Group__0__Impl rule__SensorListener__Group__1 ;
    public final void rule__SensorListener__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1190:1: ( rule__SensorListener__Group__0__Impl rule__SensorListener__Group__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1191:2: rule__SensorListener__Group__0__Impl rule__SensorListener__Group__1
            {
            pushFollow(FOLLOW_rule__SensorListener__Group__0__Impl_in_rule__SensorListener__Group__02407);
            rule__SensorListener__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorListener__Group__1_in_rule__SensorListener__Group__02410);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1198:1: rule__SensorListener__Group__0__Impl : ( 'SensorListener' ) ;
    public final void rule__SensorListener__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1202:1: ( ( 'SensorListener' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1203:1: ( 'SensorListener' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1203:1: ( 'SensorListener' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1204:1: 'SensorListener'
            {
             before(grammarAccess.getSensorListenerAccess().getSensorListenerKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__SensorListener__Group__0__Impl2438); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1217:1: rule__SensorListener__Group__1 : rule__SensorListener__Group__1__Impl rule__SensorListener__Group__2 ;
    public final void rule__SensorListener__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1221:1: ( rule__SensorListener__Group__1__Impl rule__SensorListener__Group__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1222:2: rule__SensorListener__Group__1__Impl rule__SensorListener__Group__2
            {
            pushFollow(FOLLOW_rule__SensorListener__Group__1__Impl_in_rule__SensorListener__Group__12469);
            rule__SensorListener__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorListener__Group__2_in_rule__SensorListener__Group__12472);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1229:1: rule__SensorListener__Group__1__Impl : ( ( rule__SensorListener__SensorAssignment_1 ) ) ;
    public final void rule__SensorListener__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1233:1: ( ( ( rule__SensorListener__SensorAssignment_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1234:1: ( ( rule__SensorListener__SensorAssignment_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1234:1: ( ( rule__SensorListener__SensorAssignment_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1235:1: ( rule__SensorListener__SensorAssignment_1 )
            {
             before(grammarAccess.getSensorListenerAccess().getSensorAssignment_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1236:1: ( rule__SensorListener__SensorAssignment_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1236:2: rule__SensorListener__SensorAssignment_1
            {
            pushFollow(FOLLOW_rule__SensorListener__SensorAssignment_1_in_rule__SensorListener__Group__1__Impl2499);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1246:1: rule__SensorListener__Group__2 : rule__SensorListener__Group__2__Impl rule__SensorListener__Group__3 ;
    public final void rule__SensorListener__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1250:1: ( rule__SensorListener__Group__2__Impl rule__SensorListener__Group__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1251:2: rule__SensorListener__Group__2__Impl rule__SensorListener__Group__3
            {
            pushFollow(FOLLOW_rule__SensorListener__Group__2__Impl_in_rule__SensorListener__Group__22529);
            rule__SensorListener__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorListener__Group__3_in_rule__SensorListener__Group__22532);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1258:1: rule__SensorListener__Group__2__Impl : ( 'if' ) ;
    public final void rule__SensorListener__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1262:1: ( ( 'if' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1263:1: ( 'if' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1263:1: ( 'if' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1264:1: 'if'
            {
             before(grammarAccess.getSensorListenerAccess().getIfKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__SensorListener__Group__2__Impl2560); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1277:1: rule__SensorListener__Group__3 : rule__SensorListener__Group__3__Impl rule__SensorListener__Group__4 ;
    public final void rule__SensorListener__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1281:1: ( rule__SensorListener__Group__3__Impl rule__SensorListener__Group__4 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1282:2: rule__SensorListener__Group__3__Impl rule__SensorListener__Group__4
            {
            pushFollow(FOLLOW_rule__SensorListener__Group__3__Impl_in_rule__SensorListener__Group__32591);
            rule__SensorListener__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorListener__Group__4_in_rule__SensorListener__Group__32594);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1289:1: rule__SensorListener__Group__3__Impl : ( ( rule__SensorListener__Alternatives_3 ) ) ;
    public final void rule__SensorListener__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1293:1: ( ( ( rule__SensorListener__Alternatives_3 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1294:1: ( ( rule__SensorListener__Alternatives_3 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1294:1: ( ( rule__SensorListener__Alternatives_3 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1295:1: ( rule__SensorListener__Alternatives_3 )
            {
             before(grammarAccess.getSensorListenerAccess().getAlternatives_3()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1296:1: ( rule__SensorListener__Alternatives_3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1296:2: rule__SensorListener__Alternatives_3
            {
            pushFollow(FOLLOW_rule__SensorListener__Alternatives_3_in_rule__SensorListener__Group__3__Impl2621);
            rule__SensorListener__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getSensorListenerAccess().getAlternatives_3()); 

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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1306:1: rule__SensorListener__Group__4 : rule__SensorListener__Group__4__Impl rule__SensorListener__Group__5 ;
    public final void rule__SensorListener__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1310:1: ( rule__SensorListener__Group__4__Impl rule__SensorListener__Group__5 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1311:2: rule__SensorListener__Group__4__Impl rule__SensorListener__Group__5
            {
            pushFollow(FOLLOW_rule__SensorListener__Group__4__Impl_in_rule__SensorListener__Group__42651);
            rule__SensorListener__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorListener__Group__5_in_rule__SensorListener__Group__42654);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1318:1: rule__SensorListener__Group__4__Impl : ( 'call' ) ;
    public final void rule__SensorListener__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1322:1: ( ( 'call' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1323:1: ( 'call' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1323:1: ( 'call' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1324:1: 'call'
            {
             before(grammarAccess.getSensorListenerAccess().getCallKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__SensorListener__Group__4__Impl2682); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1337:1: rule__SensorListener__Group__5 : rule__SensorListener__Group__5__Impl ;
    public final void rule__SensorListener__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1341:1: ( rule__SensorListener__Group__5__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1342:2: rule__SensorListener__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SensorListener__Group__5__Impl_in_rule__SensorListener__Group__52713);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1348:1: rule__SensorListener__Group__5__Impl : ( ( rule__SensorListener__EventHandlerAssignment_5 ) ) ;
    public final void rule__SensorListener__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1352:1: ( ( ( rule__SensorListener__EventHandlerAssignment_5 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1353:1: ( ( rule__SensorListener__EventHandlerAssignment_5 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1353:1: ( ( rule__SensorListener__EventHandlerAssignment_5 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1354:1: ( rule__SensorListener__EventHandlerAssignment_5 )
            {
             before(grammarAccess.getSensorListenerAccess().getEventHandlerAssignment_5()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1355:1: ( rule__SensorListener__EventHandlerAssignment_5 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1355:2: rule__SensorListener__EventHandlerAssignment_5
            {
            pushFollow(FOLLOW_rule__SensorListener__EventHandlerAssignment_5_in_rule__SensorListener__Group__5__Impl2740);
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


    // $ANTLR start "rule__SensorListener__Group_3_2__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1377:1: rule__SensorListener__Group_3_2__0 : rule__SensorListener__Group_3_2__0__Impl rule__SensorListener__Group_3_2__1 ;
    public final void rule__SensorListener__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1381:1: ( rule__SensorListener__Group_3_2__0__Impl rule__SensorListener__Group_3_2__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1382:2: rule__SensorListener__Group_3_2__0__Impl rule__SensorListener__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__SensorListener__Group_3_2__0__Impl_in_rule__SensorListener__Group_3_2__02782);
            rule__SensorListener__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorListener__Group_3_2__1_in_rule__SensorListener__Group_3_2__02785);
            rule__SensorListener__Group_3_2__1();

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
    // $ANTLR end "rule__SensorListener__Group_3_2__0"


    // $ANTLR start "rule__SensorListener__Group_3_2__0__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1389:1: rule__SensorListener__Group_3_2__0__Impl : ( ( rule__SensorListener__TypeAssignment_3_2_0 ) ) ;
    public final void rule__SensorListener__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1393:1: ( ( ( rule__SensorListener__TypeAssignment_3_2_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1394:1: ( ( rule__SensorListener__TypeAssignment_3_2_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1394:1: ( ( rule__SensorListener__TypeAssignment_3_2_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1395:1: ( rule__SensorListener__TypeAssignment_3_2_0 )
            {
             before(grammarAccess.getSensorListenerAccess().getTypeAssignment_3_2_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1396:1: ( rule__SensorListener__TypeAssignment_3_2_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1396:2: rule__SensorListener__TypeAssignment_3_2_0
            {
            pushFollow(FOLLOW_rule__SensorListener__TypeAssignment_3_2_0_in_rule__SensorListener__Group_3_2__0__Impl2812);
            rule__SensorListener__TypeAssignment_3_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSensorListenerAccess().getTypeAssignment_3_2_0()); 

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
    // $ANTLR end "rule__SensorListener__Group_3_2__0__Impl"


    // $ANTLR start "rule__SensorListener__Group_3_2__1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1406:1: rule__SensorListener__Group_3_2__1 : rule__SensorListener__Group_3_2__1__Impl rule__SensorListener__Group_3_2__2 ;
    public final void rule__SensorListener__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1410:1: ( rule__SensorListener__Group_3_2__1__Impl rule__SensorListener__Group_3_2__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1411:2: rule__SensorListener__Group_3_2__1__Impl rule__SensorListener__Group_3_2__2
            {
            pushFollow(FOLLOW_rule__SensorListener__Group_3_2__1__Impl_in_rule__SensorListener__Group_3_2__12842);
            rule__SensorListener__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorListener__Group_3_2__2_in_rule__SensorListener__Group_3_2__12845);
            rule__SensorListener__Group_3_2__2();

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
    // $ANTLR end "rule__SensorListener__Group_3_2__1"


    // $ANTLR start "rule__SensorListener__Group_3_2__1__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1418:1: rule__SensorListener__Group_3_2__1__Impl : ( ( rule__SensorListener__LAssignment_3_2_1 ) ) ;
    public final void rule__SensorListener__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1422:1: ( ( ( rule__SensorListener__LAssignment_3_2_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1423:1: ( ( rule__SensorListener__LAssignment_3_2_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1423:1: ( ( rule__SensorListener__LAssignment_3_2_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1424:1: ( rule__SensorListener__LAssignment_3_2_1 )
            {
             before(grammarAccess.getSensorListenerAccess().getLAssignment_3_2_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1425:1: ( rule__SensorListener__LAssignment_3_2_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1425:2: rule__SensorListener__LAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__SensorListener__LAssignment_3_2_1_in_rule__SensorListener__Group_3_2__1__Impl2872);
            rule__SensorListener__LAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorListenerAccess().getLAssignment_3_2_1()); 

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
    // $ANTLR end "rule__SensorListener__Group_3_2__1__Impl"


    // $ANTLR start "rule__SensorListener__Group_3_2__2"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1435:1: rule__SensorListener__Group_3_2__2 : rule__SensorListener__Group_3_2__2__Impl rule__SensorListener__Group_3_2__3 ;
    public final void rule__SensorListener__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1439:1: ( rule__SensorListener__Group_3_2__2__Impl rule__SensorListener__Group_3_2__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1440:2: rule__SensorListener__Group_3_2__2__Impl rule__SensorListener__Group_3_2__3
            {
            pushFollow(FOLLOW_rule__SensorListener__Group_3_2__2__Impl_in_rule__SensorListener__Group_3_2__22902);
            rule__SensorListener__Group_3_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SensorListener__Group_3_2__3_in_rule__SensorListener__Group_3_2__22905);
            rule__SensorListener__Group_3_2__3();

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
    // $ANTLR end "rule__SensorListener__Group_3_2__2"


    // $ANTLR start "rule__SensorListener__Group_3_2__2__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1447:1: rule__SensorListener__Group_3_2__2__Impl : ( 'AND' ) ;
    public final void rule__SensorListener__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1451:1: ( ( 'AND' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1452:1: ( 'AND' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1452:1: ( 'AND' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1453:1: 'AND'
            {
             before(grammarAccess.getSensorListenerAccess().getANDKeyword_3_2_2()); 
            match(input,27,FOLLOW_27_in_rule__SensorListener__Group_3_2__2__Impl2933); 
             after(grammarAccess.getSensorListenerAccess().getANDKeyword_3_2_2()); 

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
    // $ANTLR end "rule__SensorListener__Group_3_2__2__Impl"


    // $ANTLR start "rule__SensorListener__Group_3_2__3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1466:1: rule__SensorListener__Group_3_2__3 : rule__SensorListener__Group_3_2__3__Impl ;
    public final void rule__SensorListener__Group_3_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1470:1: ( rule__SensorListener__Group_3_2__3__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1471:2: rule__SensorListener__Group_3_2__3__Impl
            {
            pushFollow(FOLLOW_rule__SensorListener__Group_3_2__3__Impl_in_rule__SensorListener__Group_3_2__32964);
            rule__SensorListener__Group_3_2__3__Impl();

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
    // $ANTLR end "rule__SensorListener__Group_3_2__3"


    // $ANTLR start "rule__SensorListener__Group_3_2__3__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1477:1: rule__SensorListener__Group_3_2__3__Impl : ( ( rule__SensorListener__HAssignment_3_2_3 ) ) ;
    public final void rule__SensorListener__Group_3_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1481:1: ( ( ( rule__SensorListener__HAssignment_3_2_3 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1482:1: ( ( rule__SensorListener__HAssignment_3_2_3 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1482:1: ( ( rule__SensorListener__HAssignment_3_2_3 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1483:1: ( rule__SensorListener__HAssignment_3_2_3 )
            {
             before(grammarAccess.getSensorListenerAccess().getHAssignment_3_2_3()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1484:1: ( rule__SensorListener__HAssignment_3_2_3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1484:2: rule__SensorListener__HAssignment_3_2_3
            {
            pushFollow(FOLLOW_rule__SensorListener__HAssignment_3_2_3_in_rule__SensorListener__Group_3_2__3__Impl2991);
            rule__SensorListener__HAssignment_3_2_3();

            state._fsp--;


            }

             after(grammarAccess.getSensorListenerAccess().getHAssignment_3_2_3()); 

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
    // $ANTLR end "rule__SensorListener__Group_3_2__3__Impl"


    // $ANTLR start "rule__Timer__Group__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1502:1: rule__Timer__Group__0 : rule__Timer__Group__0__Impl rule__Timer__Group__1 ;
    public final void rule__Timer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1506:1: ( rule__Timer__Group__0__Impl rule__Timer__Group__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1507:2: rule__Timer__Group__0__Impl rule__Timer__Group__1
            {
            pushFollow(FOLLOW_rule__Timer__Group__0__Impl_in_rule__Timer__Group__03029);
            rule__Timer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group__1_in_rule__Timer__Group__03032);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1514:1: rule__Timer__Group__0__Impl : ( 'Timer action' ) ;
    public final void rule__Timer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1518:1: ( ( 'Timer action' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1519:1: ( 'Timer action' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1519:1: ( 'Timer action' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1520:1: 'Timer action'
            {
             before(grammarAccess.getTimerAccess().getTimerActionKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Timer__Group__0__Impl3060); 
             after(grammarAccess.getTimerAccess().getTimerActionKeyword_0()); 

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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1533:1: rule__Timer__Group__1 : rule__Timer__Group__1__Impl rule__Timer__Group__2 ;
    public final void rule__Timer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1537:1: ( rule__Timer__Group__1__Impl rule__Timer__Group__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1538:2: rule__Timer__Group__1__Impl rule__Timer__Group__2
            {
            pushFollow(FOLLOW_rule__Timer__Group__1__Impl_in_rule__Timer__Group__13091);
            rule__Timer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group__2_in_rule__Timer__Group__13094);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1545:1: rule__Timer__Group__1__Impl : ( ( rule__Timer__EventHandlerAssignment_1 ) ) ;
    public final void rule__Timer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1549:1: ( ( ( rule__Timer__EventHandlerAssignment_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1550:1: ( ( rule__Timer__EventHandlerAssignment_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1550:1: ( ( rule__Timer__EventHandlerAssignment_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1551:1: ( rule__Timer__EventHandlerAssignment_1 )
            {
             before(grammarAccess.getTimerAccess().getEventHandlerAssignment_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1552:1: ( rule__Timer__EventHandlerAssignment_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1552:2: rule__Timer__EventHandlerAssignment_1
            {
            pushFollow(FOLLOW_rule__Timer__EventHandlerAssignment_1_in_rule__Timer__Group__1__Impl3121);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1562:1: rule__Timer__Group__2 : rule__Timer__Group__2__Impl rule__Timer__Group__3 ;
    public final void rule__Timer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1566:1: ( rule__Timer__Group__2__Impl rule__Timer__Group__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1567:2: rule__Timer__Group__2__Impl rule__Timer__Group__3
            {
            pushFollow(FOLLOW_rule__Timer__Group__2__Impl_in_rule__Timer__Group__23151);
            rule__Timer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group__3_in_rule__Timer__Group__23154);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1574:1: rule__Timer__Group__2__Impl : ( 'repeat' ) ;
    public final void rule__Timer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1578:1: ( ( 'repeat' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1579:1: ( 'repeat' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1579:1: ( 'repeat' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1580:1: 'repeat'
            {
             before(grammarAccess.getTimerAccess().getRepeatKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Timer__Group__2__Impl3182); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1593:1: rule__Timer__Group__3 : rule__Timer__Group__3__Impl ;
    public final void rule__Timer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1597:1: ( rule__Timer__Group__3__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1598:2: rule__Timer__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Timer__Group__3__Impl_in_rule__Timer__Group__33213);
            rule__Timer__Group__3__Impl();

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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1604:1: rule__Timer__Group__3__Impl : ( ( rule__Timer__Alternatives_3 ) ) ;
    public final void rule__Timer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1608:1: ( ( ( rule__Timer__Alternatives_3 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1609:1: ( ( rule__Timer__Alternatives_3 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1609:1: ( ( rule__Timer__Alternatives_3 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1610:1: ( rule__Timer__Alternatives_3 )
            {
             before(grammarAccess.getTimerAccess().getAlternatives_3()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1611:1: ( rule__Timer__Alternatives_3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1611:2: rule__Timer__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Timer__Alternatives_3_in_rule__Timer__Group__3__Impl3240);
            rule__Timer__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getAlternatives_3()); 

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


    // $ANTLR start "rule__Timer__Group_3_0__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1629:1: rule__Timer__Group_3_0__0 : rule__Timer__Group_3_0__0__Impl rule__Timer__Group_3_0__1 ;
    public final void rule__Timer__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1633:1: ( rule__Timer__Group_3_0__0__Impl rule__Timer__Group_3_0__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1634:2: rule__Timer__Group_3_0__0__Impl rule__Timer__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_0__0__Impl_in_rule__Timer__Group_3_0__03278);
            rule__Timer__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group_3_0__1_in_rule__Timer__Group_3_0__03281);
            rule__Timer__Group_3_0__1();

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
    // $ANTLR end "rule__Timer__Group_3_0__0"


    // $ANTLR start "rule__Timer__Group_3_0__0__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1641:1: rule__Timer__Group_3_0__0__Impl : ( ( rule__Timer__RepeattypeAssignment_3_0_0 ) ) ;
    public final void rule__Timer__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1645:1: ( ( ( rule__Timer__RepeattypeAssignment_3_0_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1646:1: ( ( rule__Timer__RepeattypeAssignment_3_0_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1646:1: ( ( rule__Timer__RepeattypeAssignment_3_0_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1647:1: ( rule__Timer__RepeattypeAssignment_3_0_0 )
            {
             before(grammarAccess.getTimerAccess().getRepeattypeAssignment_3_0_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1648:1: ( rule__Timer__RepeattypeAssignment_3_0_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1648:2: rule__Timer__RepeattypeAssignment_3_0_0
            {
            pushFollow(FOLLOW_rule__Timer__RepeattypeAssignment_3_0_0_in_rule__Timer__Group_3_0__0__Impl3308);
            rule__Timer__RepeattypeAssignment_3_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getRepeattypeAssignment_3_0_0()); 

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
    // $ANTLR end "rule__Timer__Group_3_0__0__Impl"


    // $ANTLR start "rule__Timer__Group_3_0__1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1658:1: rule__Timer__Group_3_0__1 : rule__Timer__Group_3_0__1__Impl rule__Timer__Group_3_0__2 ;
    public final void rule__Timer__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1662:1: ( rule__Timer__Group_3_0__1__Impl rule__Timer__Group_3_0__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1663:2: rule__Timer__Group_3_0__1__Impl rule__Timer__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_0__1__Impl_in_rule__Timer__Group_3_0__13338);
            rule__Timer__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group_3_0__2_in_rule__Timer__Group_3_0__13341);
            rule__Timer__Group_3_0__2();

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
    // $ANTLR end "rule__Timer__Group_3_0__1"


    // $ANTLR start "rule__Timer__Group_3_0__1__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1670:1: rule__Timer__Group_3_0__1__Impl : ( ( rule__Timer__SecsAssignment_3_0_1 ) ) ;
    public final void rule__Timer__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1674:1: ( ( ( rule__Timer__SecsAssignment_3_0_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1675:1: ( ( rule__Timer__SecsAssignment_3_0_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1675:1: ( ( rule__Timer__SecsAssignment_3_0_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1676:1: ( rule__Timer__SecsAssignment_3_0_1 )
            {
             before(grammarAccess.getTimerAccess().getSecsAssignment_3_0_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1677:1: ( rule__Timer__SecsAssignment_3_0_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1677:2: rule__Timer__SecsAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__Timer__SecsAssignment_3_0_1_in_rule__Timer__Group_3_0__1__Impl3368);
            rule__Timer__SecsAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getSecsAssignment_3_0_1()); 

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
    // $ANTLR end "rule__Timer__Group_3_0__1__Impl"


    // $ANTLR start "rule__Timer__Group_3_0__2"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1687:1: rule__Timer__Group_3_0__2 : rule__Timer__Group_3_0__2__Impl ;
    public final void rule__Timer__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1691:1: ( rule__Timer__Group_3_0__2__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1692:2: rule__Timer__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_0__2__Impl_in_rule__Timer__Group_3_0__23398);
            rule__Timer__Group_3_0__2__Impl();

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
    // $ANTLR end "rule__Timer__Group_3_0__2"


    // $ANTLR start "rule__Timer__Group_3_0__2__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1698:1: rule__Timer__Group_3_0__2__Impl : ( 'seconds' ) ;
    public final void rule__Timer__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1702:1: ( ( 'seconds' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1703:1: ( 'seconds' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1703:1: ( 'seconds' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1704:1: 'seconds'
            {
             before(grammarAccess.getTimerAccess().getSecondsKeyword_3_0_2()); 
            match(input,30,FOLLOW_30_in_rule__Timer__Group_3_0__2__Impl3426); 
             after(grammarAccess.getTimerAccess().getSecondsKeyword_3_0_2()); 

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
    // $ANTLR end "rule__Timer__Group_3_0__2__Impl"


    // $ANTLR start "rule__Timer__Group_3_1__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1723:1: rule__Timer__Group_3_1__0 : rule__Timer__Group_3_1__0__Impl rule__Timer__Group_3_1__1 ;
    public final void rule__Timer__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1727:1: ( rule__Timer__Group_3_1__0__Impl rule__Timer__Group_3_1__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1728:2: rule__Timer__Group_3_1__0__Impl rule__Timer__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_1__0__Impl_in_rule__Timer__Group_3_1__03463);
            rule__Timer__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group_3_1__1_in_rule__Timer__Group_3_1__03466);
            rule__Timer__Group_3_1__1();

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
    // $ANTLR end "rule__Timer__Group_3_1__0"


    // $ANTLR start "rule__Timer__Group_3_1__0__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1735:1: rule__Timer__Group_3_1__0__Impl : ( ( rule__Timer__RepeattypeAssignment_3_1_0 ) ) ;
    public final void rule__Timer__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1739:1: ( ( ( rule__Timer__RepeattypeAssignment_3_1_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1740:1: ( ( rule__Timer__RepeattypeAssignment_3_1_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1740:1: ( ( rule__Timer__RepeattypeAssignment_3_1_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1741:1: ( rule__Timer__RepeattypeAssignment_3_1_0 )
            {
             before(grammarAccess.getTimerAccess().getRepeattypeAssignment_3_1_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1742:1: ( rule__Timer__RepeattypeAssignment_3_1_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1742:2: rule__Timer__RepeattypeAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__Timer__RepeattypeAssignment_3_1_0_in_rule__Timer__Group_3_1__0__Impl3493);
            rule__Timer__RepeattypeAssignment_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getRepeattypeAssignment_3_1_0()); 

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
    // $ANTLR end "rule__Timer__Group_3_1__0__Impl"


    // $ANTLR start "rule__Timer__Group_3_1__1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1752:1: rule__Timer__Group_3_1__1 : rule__Timer__Group_3_1__1__Impl rule__Timer__Group_3_1__2 ;
    public final void rule__Timer__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1756:1: ( rule__Timer__Group_3_1__1__Impl rule__Timer__Group_3_1__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1757:2: rule__Timer__Group_3_1__1__Impl rule__Timer__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_1__1__Impl_in_rule__Timer__Group_3_1__13523);
            rule__Timer__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group_3_1__2_in_rule__Timer__Group_3_1__13526);
            rule__Timer__Group_3_1__2();

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
    // $ANTLR end "rule__Timer__Group_3_1__1"


    // $ANTLR start "rule__Timer__Group_3_1__1__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1764:1: rule__Timer__Group_3_1__1__Impl : ( ( rule__Timer__HoursAssignment_3_1_1 ) ) ;
    public final void rule__Timer__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1768:1: ( ( ( rule__Timer__HoursAssignment_3_1_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1769:1: ( ( rule__Timer__HoursAssignment_3_1_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1769:1: ( ( rule__Timer__HoursAssignment_3_1_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1770:1: ( rule__Timer__HoursAssignment_3_1_1 )
            {
             before(grammarAccess.getTimerAccess().getHoursAssignment_3_1_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1771:1: ( rule__Timer__HoursAssignment_3_1_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1771:2: rule__Timer__HoursAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Timer__HoursAssignment_3_1_1_in_rule__Timer__Group_3_1__1__Impl3553);
            rule__Timer__HoursAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getHoursAssignment_3_1_1()); 

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
    // $ANTLR end "rule__Timer__Group_3_1__1__Impl"


    // $ANTLR start "rule__Timer__Group_3_1__2"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1781:1: rule__Timer__Group_3_1__2 : rule__Timer__Group_3_1__2__Impl rule__Timer__Group_3_1__3 ;
    public final void rule__Timer__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1785:1: ( rule__Timer__Group_3_1__2__Impl rule__Timer__Group_3_1__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1786:2: rule__Timer__Group_3_1__2__Impl rule__Timer__Group_3_1__3
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_1__2__Impl_in_rule__Timer__Group_3_1__23583);
            rule__Timer__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group_3_1__3_in_rule__Timer__Group_3_1__23586);
            rule__Timer__Group_3_1__3();

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
    // $ANTLR end "rule__Timer__Group_3_1__2"


    // $ANTLR start "rule__Timer__Group_3_1__2__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1793:1: rule__Timer__Group_3_1__2__Impl : ( ':' ) ;
    public final void rule__Timer__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1797:1: ( ( ':' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1798:1: ( ':' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1798:1: ( ':' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1799:1: ':'
            {
             before(grammarAccess.getTimerAccess().getColonKeyword_3_1_2()); 
            match(input,23,FOLLOW_23_in_rule__Timer__Group_3_1__2__Impl3614); 
             after(grammarAccess.getTimerAccess().getColonKeyword_3_1_2()); 

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
    // $ANTLR end "rule__Timer__Group_3_1__2__Impl"


    // $ANTLR start "rule__Timer__Group_3_1__3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1812:1: rule__Timer__Group_3_1__3 : rule__Timer__Group_3_1__3__Impl ;
    public final void rule__Timer__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1816:1: ( rule__Timer__Group_3_1__3__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1817:2: rule__Timer__Group_3_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_1__3__Impl_in_rule__Timer__Group_3_1__33645);
            rule__Timer__Group_3_1__3__Impl();

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
    // $ANTLR end "rule__Timer__Group_3_1__3"


    // $ANTLR start "rule__Timer__Group_3_1__3__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1823:1: rule__Timer__Group_3_1__3__Impl : ( ( rule__Timer__MinutesAssignment_3_1_3 ) ) ;
    public final void rule__Timer__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1827:1: ( ( ( rule__Timer__MinutesAssignment_3_1_3 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1828:1: ( ( rule__Timer__MinutesAssignment_3_1_3 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1828:1: ( ( rule__Timer__MinutesAssignment_3_1_3 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1829:1: ( rule__Timer__MinutesAssignment_3_1_3 )
            {
             before(grammarAccess.getTimerAccess().getMinutesAssignment_3_1_3()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1830:1: ( rule__Timer__MinutesAssignment_3_1_3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1830:2: rule__Timer__MinutesAssignment_3_1_3
            {
            pushFollow(FOLLOW_rule__Timer__MinutesAssignment_3_1_3_in_rule__Timer__Group_3_1__3__Impl3672);
            rule__Timer__MinutesAssignment_3_1_3();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getMinutesAssignment_3_1_3()); 

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
    // $ANTLR end "rule__Timer__Group_3_1__3__Impl"


    // $ANTLR start "rule__Timer__Group_3_2__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1848:1: rule__Timer__Group_3_2__0 : rule__Timer__Group_3_2__0__Impl rule__Timer__Group_3_2__1 ;
    public final void rule__Timer__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1852:1: ( rule__Timer__Group_3_2__0__Impl rule__Timer__Group_3_2__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1853:2: rule__Timer__Group_3_2__0__Impl rule__Timer__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_2__0__Impl_in_rule__Timer__Group_3_2__03710);
            rule__Timer__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group_3_2__1_in_rule__Timer__Group_3_2__03713);
            rule__Timer__Group_3_2__1();

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
    // $ANTLR end "rule__Timer__Group_3_2__0"


    // $ANTLR start "rule__Timer__Group_3_2__0__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1860:1: rule__Timer__Group_3_2__0__Impl : ( ( rule__Timer__RepeattypeAssignment_3_2_0 ) ) ;
    public final void rule__Timer__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1864:1: ( ( ( rule__Timer__RepeattypeAssignment_3_2_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1865:1: ( ( rule__Timer__RepeattypeAssignment_3_2_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1865:1: ( ( rule__Timer__RepeattypeAssignment_3_2_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1866:1: ( rule__Timer__RepeattypeAssignment_3_2_0 )
            {
             before(grammarAccess.getTimerAccess().getRepeattypeAssignment_3_2_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1867:1: ( rule__Timer__RepeattypeAssignment_3_2_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1867:2: rule__Timer__RepeattypeAssignment_3_2_0
            {
            pushFollow(FOLLOW_rule__Timer__RepeattypeAssignment_3_2_0_in_rule__Timer__Group_3_2__0__Impl3740);
            rule__Timer__RepeattypeAssignment_3_2_0();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getRepeattypeAssignment_3_2_0()); 

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
    // $ANTLR end "rule__Timer__Group_3_2__0__Impl"


    // $ANTLR start "rule__Timer__Group_3_2__1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1877:1: rule__Timer__Group_3_2__1 : rule__Timer__Group_3_2__1__Impl rule__Timer__Group_3_2__2 ;
    public final void rule__Timer__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1881:1: ( rule__Timer__Group_3_2__1__Impl rule__Timer__Group_3_2__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1882:2: rule__Timer__Group_3_2__1__Impl rule__Timer__Group_3_2__2
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_2__1__Impl_in_rule__Timer__Group_3_2__13770);
            rule__Timer__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group_3_2__2_in_rule__Timer__Group_3_2__13773);
            rule__Timer__Group_3_2__2();

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
    // $ANTLR end "rule__Timer__Group_3_2__1"


    // $ANTLR start "rule__Timer__Group_3_2__1__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1889:1: rule__Timer__Group_3_2__1__Impl : ( ( rule__Timer__HoursAssignment_3_2_1 ) ) ;
    public final void rule__Timer__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1893:1: ( ( ( rule__Timer__HoursAssignment_3_2_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1894:1: ( ( rule__Timer__HoursAssignment_3_2_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1894:1: ( ( rule__Timer__HoursAssignment_3_2_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1895:1: ( rule__Timer__HoursAssignment_3_2_1 )
            {
             before(grammarAccess.getTimerAccess().getHoursAssignment_3_2_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1896:1: ( rule__Timer__HoursAssignment_3_2_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1896:2: rule__Timer__HoursAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Timer__HoursAssignment_3_2_1_in_rule__Timer__Group_3_2__1__Impl3800);
            rule__Timer__HoursAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getHoursAssignment_3_2_1()); 

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
    // $ANTLR end "rule__Timer__Group_3_2__1__Impl"


    // $ANTLR start "rule__Timer__Group_3_2__2"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1906:1: rule__Timer__Group_3_2__2 : rule__Timer__Group_3_2__2__Impl rule__Timer__Group_3_2__3 ;
    public final void rule__Timer__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1910:1: ( rule__Timer__Group_3_2__2__Impl rule__Timer__Group_3_2__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1911:2: rule__Timer__Group_3_2__2__Impl rule__Timer__Group_3_2__3
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_2__2__Impl_in_rule__Timer__Group_3_2__23830);
            rule__Timer__Group_3_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group_3_2__3_in_rule__Timer__Group_3_2__23833);
            rule__Timer__Group_3_2__3();

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
    // $ANTLR end "rule__Timer__Group_3_2__2"


    // $ANTLR start "rule__Timer__Group_3_2__2__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1918:1: rule__Timer__Group_3_2__2__Impl : ( ':' ) ;
    public final void rule__Timer__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1922:1: ( ( ':' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1923:1: ( ':' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1923:1: ( ':' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1924:1: ':'
            {
             before(grammarAccess.getTimerAccess().getColonKeyword_3_2_2()); 
            match(input,23,FOLLOW_23_in_rule__Timer__Group_3_2__2__Impl3861); 
             after(grammarAccess.getTimerAccess().getColonKeyword_3_2_2()); 

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
    // $ANTLR end "rule__Timer__Group_3_2__2__Impl"


    // $ANTLR start "rule__Timer__Group_3_2__3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1937:1: rule__Timer__Group_3_2__3 : rule__Timer__Group_3_2__3__Impl ;
    public final void rule__Timer__Group_3_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1941:1: ( rule__Timer__Group_3_2__3__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1942:2: rule__Timer__Group_3_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_2__3__Impl_in_rule__Timer__Group_3_2__33892);
            rule__Timer__Group_3_2__3__Impl();

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
    // $ANTLR end "rule__Timer__Group_3_2__3"


    // $ANTLR start "rule__Timer__Group_3_2__3__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1948:1: rule__Timer__Group_3_2__3__Impl : ( ( rule__Timer__MinutesAssignment_3_2_3 ) ) ;
    public final void rule__Timer__Group_3_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1952:1: ( ( ( rule__Timer__MinutesAssignment_3_2_3 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1953:1: ( ( rule__Timer__MinutesAssignment_3_2_3 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1953:1: ( ( rule__Timer__MinutesAssignment_3_2_3 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1954:1: ( rule__Timer__MinutesAssignment_3_2_3 )
            {
             before(grammarAccess.getTimerAccess().getMinutesAssignment_3_2_3()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1955:1: ( rule__Timer__MinutesAssignment_3_2_3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1955:2: rule__Timer__MinutesAssignment_3_2_3
            {
            pushFollow(FOLLOW_rule__Timer__MinutesAssignment_3_2_3_in_rule__Timer__Group_3_2__3__Impl3919);
            rule__Timer__MinutesAssignment_3_2_3();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getMinutesAssignment_3_2_3()); 

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
    // $ANTLR end "rule__Timer__Group_3_2__3__Impl"


    // $ANTLR start "rule__Timer__Group_3_3__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1973:1: rule__Timer__Group_3_3__0 : rule__Timer__Group_3_3__0__Impl rule__Timer__Group_3_3__1 ;
    public final void rule__Timer__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1977:1: ( rule__Timer__Group_3_3__0__Impl rule__Timer__Group_3_3__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1978:2: rule__Timer__Group_3_3__0__Impl rule__Timer__Group_3_3__1
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_3__0__Impl_in_rule__Timer__Group_3_3__03957);
            rule__Timer__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group_3_3__1_in_rule__Timer__Group_3_3__03960);
            rule__Timer__Group_3_3__1();

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
    // $ANTLR end "rule__Timer__Group_3_3__0"


    // $ANTLR start "rule__Timer__Group_3_3__0__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1985:1: rule__Timer__Group_3_3__0__Impl : ( ( rule__Timer__RepeattypeAssignment_3_3_0 ) ) ;
    public final void rule__Timer__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1989:1: ( ( ( rule__Timer__RepeattypeAssignment_3_3_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1990:1: ( ( rule__Timer__RepeattypeAssignment_3_3_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1990:1: ( ( rule__Timer__RepeattypeAssignment_3_3_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1991:1: ( rule__Timer__RepeattypeAssignment_3_3_0 )
            {
             before(grammarAccess.getTimerAccess().getRepeattypeAssignment_3_3_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1992:1: ( rule__Timer__RepeattypeAssignment_3_3_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:1992:2: rule__Timer__RepeattypeAssignment_3_3_0
            {
            pushFollow(FOLLOW_rule__Timer__RepeattypeAssignment_3_3_0_in_rule__Timer__Group_3_3__0__Impl3987);
            rule__Timer__RepeattypeAssignment_3_3_0();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getRepeattypeAssignment_3_3_0()); 

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
    // $ANTLR end "rule__Timer__Group_3_3__0__Impl"


    // $ANTLR start "rule__Timer__Group_3_3__1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2002:1: rule__Timer__Group_3_3__1 : rule__Timer__Group_3_3__1__Impl rule__Timer__Group_3_3__2 ;
    public final void rule__Timer__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2006:1: ( rule__Timer__Group_3_3__1__Impl rule__Timer__Group_3_3__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2007:2: rule__Timer__Group_3_3__1__Impl rule__Timer__Group_3_3__2
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_3__1__Impl_in_rule__Timer__Group_3_3__14017);
            rule__Timer__Group_3_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group_3_3__2_in_rule__Timer__Group_3_3__14020);
            rule__Timer__Group_3_3__2();

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
    // $ANTLR end "rule__Timer__Group_3_3__1"


    // $ANTLR start "rule__Timer__Group_3_3__1__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2014:1: rule__Timer__Group_3_3__1__Impl : ( ( rule__Timer__HoursAssignment_3_3_1 ) ) ;
    public final void rule__Timer__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2018:1: ( ( ( rule__Timer__HoursAssignment_3_3_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2019:1: ( ( rule__Timer__HoursAssignment_3_3_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2019:1: ( ( rule__Timer__HoursAssignment_3_3_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2020:1: ( rule__Timer__HoursAssignment_3_3_1 )
            {
             before(grammarAccess.getTimerAccess().getHoursAssignment_3_3_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2021:1: ( rule__Timer__HoursAssignment_3_3_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2021:2: rule__Timer__HoursAssignment_3_3_1
            {
            pushFollow(FOLLOW_rule__Timer__HoursAssignment_3_3_1_in_rule__Timer__Group_3_3__1__Impl4047);
            rule__Timer__HoursAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getHoursAssignment_3_3_1()); 

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
    // $ANTLR end "rule__Timer__Group_3_3__1__Impl"


    // $ANTLR start "rule__Timer__Group_3_3__2"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2031:1: rule__Timer__Group_3_3__2 : rule__Timer__Group_3_3__2__Impl rule__Timer__Group_3_3__3 ;
    public final void rule__Timer__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2035:1: ( rule__Timer__Group_3_3__2__Impl rule__Timer__Group_3_3__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2036:2: rule__Timer__Group_3_3__2__Impl rule__Timer__Group_3_3__3
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_3__2__Impl_in_rule__Timer__Group_3_3__24077);
            rule__Timer__Group_3_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group_3_3__3_in_rule__Timer__Group_3_3__24080);
            rule__Timer__Group_3_3__3();

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
    // $ANTLR end "rule__Timer__Group_3_3__2"


    // $ANTLR start "rule__Timer__Group_3_3__2__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2043:1: rule__Timer__Group_3_3__2__Impl : ( ':' ) ;
    public final void rule__Timer__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2047:1: ( ( ':' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2048:1: ( ':' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2048:1: ( ':' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2049:1: ':'
            {
             before(grammarAccess.getTimerAccess().getColonKeyword_3_3_2()); 
            match(input,23,FOLLOW_23_in_rule__Timer__Group_3_3__2__Impl4108); 
             after(grammarAccess.getTimerAccess().getColonKeyword_3_3_2()); 

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
    // $ANTLR end "rule__Timer__Group_3_3__2__Impl"


    // $ANTLR start "rule__Timer__Group_3_3__3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2062:1: rule__Timer__Group_3_3__3 : rule__Timer__Group_3_3__3__Impl ;
    public final void rule__Timer__Group_3_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2066:1: ( rule__Timer__Group_3_3__3__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2067:2: rule__Timer__Group_3_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_3__3__Impl_in_rule__Timer__Group_3_3__34139);
            rule__Timer__Group_3_3__3__Impl();

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
    // $ANTLR end "rule__Timer__Group_3_3__3"


    // $ANTLR start "rule__Timer__Group_3_3__3__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2073:1: rule__Timer__Group_3_3__3__Impl : ( ( rule__Timer__MinutesAssignment_3_3_3 ) ) ;
    public final void rule__Timer__Group_3_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2077:1: ( ( ( rule__Timer__MinutesAssignment_3_3_3 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2078:1: ( ( rule__Timer__MinutesAssignment_3_3_3 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2078:1: ( ( rule__Timer__MinutesAssignment_3_3_3 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2079:1: ( rule__Timer__MinutesAssignment_3_3_3 )
            {
             before(grammarAccess.getTimerAccess().getMinutesAssignment_3_3_3()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2080:1: ( rule__Timer__MinutesAssignment_3_3_3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2080:2: rule__Timer__MinutesAssignment_3_3_3
            {
            pushFollow(FOLLOW_rule__Timer__MinutesAssignment_3_3_3_in_rule__Timer__Group_3_3__3__Impl4166);
            rule__Timer__MinutesAssignment_3_3_3();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getMinutesAssignment_3_3_3()); 

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
    // $ANTLR end "rule__Timer__Group_3_3__3__Impl"


    // $ANTLR start "rule__Timer__Group_3_4__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2098:1: rule__Timer__Group_3_4__0 : rule__Timer__Group_3_4__0__Impl rule__Timer__Group_3_4__1 ;
    public final void rule__Timer__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2102:1: ( rule__Timer__Group_3_4__0__Impl rule__Timer__Group_3_4__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2103:2: rule__Timer__Group_3_4__0__Impl rule__Timer__Group_3_4__1
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_4__0__Impl_in_rule__Timer__Group_3_4__04204);
            rule__Timer__Group_3_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group_3_4__1_in_rule__Timer__Group_3_4__04207);
            rule__Timer__Group_3_4__1();

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
    // $ANTLR end "rule__Timer__Group_3_4__0"


    // $ANTLR start "rule__Timer__Group_3_4__0__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2110:1: rule__Timer__Group_3_4__0__Impl : ( ( rule__Timer__RepeattypeAssignment_3_4_0 ) ) ;
    public final void rule__Timer__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2114:1: ( ( ( rule__Timer__RepeattypeAssignment_3_4_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2115:1: ( ( rule__Timer__RepeattypeAssignment_3_4_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2115:1: ( ( rule__Timer__RepeattypeAssignment_3_4_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2116:1: ( rule__Timer__RepeattypeAssignment_3_4_0 )
            {
             before(grammarAccess.getTimerAccess().getRepeattypeAssignment_3_4_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2117:1: ( rule__Timer__RepeattypeAssignment_3_4_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2117:2: rule__Timer__RepeattypeAssignment_3_4_0
            {
            pushFollow(FOLLOW_rule__Timer__RepeattypeAssignment_3_4_0_in_rule__Timer__Group_3_4__0__Impl4234);
            rule__Timer__RepeattypeAssignment_3_4_0();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getRepeattypeAssignment_3_4_0()); 

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
    // $ANTLR end "rule__Timer__Group_3_4__0__Impl"


    // $ANTLR start "rule__Timer__Group_3_4__1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2127:1: rule__Timer__Group_3_4__1 : rule__Timer__Group_3_4__1__Impl rule__Timer__Group_3_4__2 ;
    public final void rule__Timer__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2131:1: ( rule__Timer__Group_3_4__1__Impl rule__Timer__Group_3_4__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2132:2: rule__Timer__Group_3_4__1__Impl rule__Timer__Group_3_4__2
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_4__1__Impl_in_rule__Timer__Group_3_4__14264);
            rule__Timer__Group_3_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group_3_4__2_in_rule__Timer__Group_3_4__14267);
            rule__Timer__Group_3_4__2();

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
    // $ANTLR end "rule__Timer__Group_3_4__1"


    // $ANTLR start "rule__Timer__Group_3_4__1__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2139:1: rule__Timer__Group_3_4__1__Impl : ( ( rule__Timer__HoursAssignment_3_4_1 ) ) ;
    public final void rule__Timer__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2143:1: ( ( ( rule__Timer__HoursAssignment_3_4_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2144:1: ( ( rule__Timer__HoursAssignment_3_4_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2144:1: ( ( rule__Timer__HoursAssignment_3_4_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2145:1: ( rule__Timer__HoursAssignment_3_4_1 )
            {
             before(grammarAccess.getTimerAccess().getHoursAssignment_3_4_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2146:1: ( rule__Timer__HoursAssignment_3_4_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2146:2: rule__Timer__HoursAssignment_3_4_1
            {
            pushFollow(FOLLOW_rule__Timer__HoursAssignment_3_4_1_in_rule__Timer__Group_3_4__1__Impl4294);
            rule__Timer__HoursAssignment_3_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getHoursAssignment_3_4_1()); 

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
    // $ANTLR end "rule__Timer__Group_3_4__1__Impl"


    // $ANTLR start "rule__Timer__Group_3_4__2"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2156:1: rule__Timer__Group_3_4__2 : rule__Timer__Group_3_4__2__Impl rule__Timer__Group_3_4__3 ;
    public final void rule__Timer__Group_3_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2160:1: ( rule__Timer__Group_3_4__2__Impl rule__Timer__Group_3_4__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2161:2: rule__Timer__Group_3_4__2__Impl rule__Timer__Group_3_4__3
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_4__2__Impl_in_rule__Timer__Group_3_4__24324);
            rule__Timer__Group_3_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group_3_4__3_in_rule__Timer__Group_3_4__24327);
            rule__Timer__Group_3_4__3();

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
    // $ANTLR end "rule__Timer__Group_3_4__2"


    // $ANTLR start "rule__Timer__Group_3_4__2__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2168:1: rule__Timer__Group_3_4__2__Impl : ( ':' ) ;
    public final void rule__Timer__Group_3_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2172:1: ( ( ':' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2173:1: ( ':' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2173:1: ( ':' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2174:1: ':'
            {
             before(grammarAccess.getTimerAccess().getColonKeyword_3_4_2()); 
            match(input,23,FOLLOW_23_in_rule__Timer__Group_3_4__2__Impl4355); 
             after(grammarAccess.getTimerAccess().getColonKeyword_3_4_2()); 

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
    // $ANTLR end "rule__Timer__Group_3_4__2__Impl"


    // $ANTLR start "rule__Timer__Group_3_4__3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2187:1: rule__Timer__Group_3_4__3 : rule__Timer__Group_3_4__3__Impl ;
    public final void rule__Timer__Group_3_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2191:1: ( rule__Timer__Group_3_4__3__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2192:2: rule__Timer__Group_3_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_4__3__Impl_in_rule__Timer__Group_3_4__34386);
            rule__Timer__Group_3_4__3__Impl();

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
    // $ANTLR end "rule__Timer__Group_3_4__3"


    // $ANTLR start "rule__Timer__Group_3_4__3__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2198:1: rule__Timer__Group_3_4__3__Impl : ( ( rule__Timer__MinutesAssignment_3_4_3 ) ) ;
    public final void rule__Timer__Group_3_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2202:1: ( ( ( rule__Timer__MinutesAssignment_3_4_3 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2203:1: ( ( rule__Timer__MinutesAssignment_3_4_3 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2203:1: ( ( rule__Timer__MinutesAssignment_3_4_3 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2204:1: ( rule__Timer__MinutesAssignment_3_4_3 )
            {
             before(grammarAccess.getTimerAccess().getMinutesAssignment_3_4_3()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2205:1: ( rule__Timer__MinutesAssignment_3_4_3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2205:2: rule__Timer__MinutesAssignment_3_4_3
            {
            pushFollow(FOLLOW_rule__Timer__MinutesAssignment_3_4_3_in_rule__Timer__Group_3_4__3__Impl4413);
            rule__Timer__MinutesAssignment_3_4_3();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getMinutesAssignment_3_4_3()); 

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
    // $ANTLR end "rule__Timer__Group_3_4__3__Impl"


    // $ANTLR start "rule__Timer__Group_3_5__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2223:1: rule__Timer__Group_3_5__0 : rule__Timer__Group_3_5__0__Impl rule__Timer__Group_3_5__1 ;
    public final void rule__Timer__Group_3_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2227:1: ( rule__Timer__Group_3_5__0__Impl rule__Timer__Group_3_5__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2228:2: rule__Timer__Group_3_5__0__Impl rule__Timer__Group_3_5__1
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_5__0__Impl_in_rule__Timer__Group_3_5__04451);
            rule__Timer__Group_3_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group_3_5__1_in_rule__Timer__Group_3_5__04454);
            rule__Timer__Group_3_5__1();

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
    // $ANTLR end "rule__Timer__Group_3_5__0"


    // $ANTLR start "rule__Timer__Group_3_5__0__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2235:1: rule__Timer__Group_3_5__0__Impl : ( ( rule__Timer__RepeattypeAssignment_3_5_0 ) ) ;
    public final void rule__Timer__Group_3_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2239:1: ( ( ( rule__Timer__RepeattypeAssignment_3_5_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2240:1: ( ( rule__Timer__RepeattypeAssignment_3_5_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2240:1: ( ( rule__Timer__RepeattypeAssignment_3_5_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2241:1: ( rule__Timer__RepeattypeAssignment_3_5_0 )
            {
             before(grammarAccess.getTimerAccess().getRepeattypeAssignment_3_5_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2242:1: ( rule__Timer__RepeattypeAssignment_3_5_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2242:2: rule__Timer__RepeattypeAssignment_3_5_0
            {
            pushFollow(FOLLOW_rule__Timer__RepeattypeAssignment_3_5_0_in_rule__Timer__Group_3_5__0__Impl4481);
            rule__Timer__RepeattypeAssignment_3_5_0();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getRepeattypeAssignment_3_5_0()); 

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
    // $ANTLR end "rule__Timer__Group_3_5__0__Impl"


    // $ANTLR start "rule__Timer__Group_3_5__1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2252:1: rule__Timer__Group_3_5__1 : rule__Timer__Group_3_5__1__Impl rule__Timer__Group_3_5__2 ;
    public final void rule__Timer__Group_3_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2256:1: ( rule__Timer__Group_3_5__1__Impl rule__Timer__Group_3_5__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2257:2: rule__Timer__Group_3_5__1__Impl rule__Timer__Group_3_5__2
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_5__1__Impl_in_rule__Timer__Group_3_5__14511);
            rule__Timer__Group_3_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group_3_5__2_in_rule__Timer__Group_3_5__14514);
            rule__Timer__Group_3_5__2();

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
    // $ANTLR end "rule__Timer__Group_3_5__1"


    // $ANTLR start "rule__Timer__Group_3_5__1__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2264:1: rule__Timer__Group_3_5__1__Impl : ( ( rule__Timer__HoursAssignment_3_5_1 ) ) ;
    public final void rule__Timer__Group_3_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2268:1: ( ( ( rule__Timer__HoursAssignment_3_5_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2269:1: ( ( rule__Timer__HoursAssignment_3_5_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2269:1: ( ( rule__Timer__HoursAssignment_3_5_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2270:1: ( rule__Timer__HoursAssignment_3_5_1 )
            {
             before(grammarAccess.getTimerAccess().getHoursAssignment_3_5_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2271:1: ( rule__Timer__HoursAssignment_3_5_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2271:2: rule__Timer__HoursAssignment_3_5_1
            {
            pushFollow(FOLLOW_rule__Timer__HoursAssignment_3_5_1_in_rule__Timer__Group_3_5__1__Impl4541);
            rule__Timer__HoursAssignment_3_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getHoursAssignment_3_5_1()); 

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
    // $ANTLR end "rule__Timer__Group_3_5__1__Impl"


    // $ANTLR start "rule__Timer__Group_3_5__2"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2281:1: rule__Timer__Group_3_5__2 : rule__Timer__Group_3_5__2__Impl rule__Timer__Group_3_5__3 ;
    public final void rule__Timer__Group_3_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2285:1: ( rule__Timer__Group_3_5__2__Impl rule__Timer__Group_3_5__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2286:2: rule__Timer__Group_3_5__2__Impl rule__Timer__Group_3_5__3
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_5__2__Impl_in_rule__Timer__Group_3_5__24571);
            rule__Timer__Group_3_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group_3_5__3_in_rule__Timer__Group_3_5__24574);
            rule__Timer__Group_3_5__3();

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
    // $ANTLR end "rule__Timer__Group_3_5__2"


    // $ANTLR start "rule__Timer__Group_3_5__2__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2293:1: rule__Timer__Group_3_5__2__Impl : ( ':' ) ;
    public final void rule__Timer__Group_3_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2297:1: ( ( ':' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2298:1: ( ':' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2298:1: ( ':' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2299:1: ':'
            {
             before(grammarAccess.getTimerAccess().getColonKeyword_3_5_2()); 
            match(input,23,FOLLOW_23_in_rule__Timer__Group_3_5__2__Impl4602); 
             after(grammarAccess.getTimerAccess().getColonKeyword_3_5_2()); 

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
    // $ANTLR end "rule__Timer__Group_3_5__2__Impl"


    // $ANTLR start "rule__Timer__Group_3_5__3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2312:1: rule__Timer__Group_3_5__3 : rule__Timer__Group_3_5__3__Impl ;
    public final void rule__Timer__Group_3_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2316:1: ( rule__Timer__Group_3_5__3__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2317:2: rule__Timer__Group_3_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_5__3__Impl_in_rule__Timer__Group_3_5__34633);
            rule__Timer__Group_3_5__3__Impl();

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
    // $ANTLR end "rule__Timer__Group_3_5__3"


    // $ANTLR start "rule__Timer__Group_3_5__3__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2323:1: rule__Timer__Group_3_5__3__Impl : ( ( rule__Timer__MinutesAssignment_3_5_3 ) ) ;
    public final void rule__Timer__Group_3_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2327:1: ( ( ( rule__Timer__MinutesAssignment_3_5_3 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2328:1: ( ( rule__Timer__MinutesAssignment_3_5_3 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2328:1: ( ( rule__Timer__MinutesAssignment_3_5_3 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2329:1: ( rule__Timer__MinutesAssignment_3_5_3 )
            {
             before(grammarAccess.getTimerAccess().getMinutesAssignment_3_5_3()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2330:1: ( rule__Timer__MinutesAssignment_3_5_3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2330:2: rule__Timer__MinutesAssignment_3_5_3
            {
            pushFollow(FOLLOW_rule__Timer__MinutesAssignment_3_5_3_in_rule__Timer__Group_3_5__3__Impl4660);
            rule__Timer__MinutesAssignment_3_5_3();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getMinutesAssignment_3_5_3()); 

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
    // $ANTLR end "rule__Timer__Group_3_5__3__Impl"


    // $ANTLR start "rule__Timer__Group_3_6__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2348:1: rule__Timer__Group_3_6__0 : rule__Timer__Group_3_6__0__Impl rule__Timer__Group_3_6__1 ;
    public final void rule__Timer__Group_3_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2352:1: ( rule__Timer__Group_3_6__0__Impl rule__Timer__Group_3_6__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2353:2: rule__Timer__Group_3_6__0__Impl rule__Timer__Group_3_6__1
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_6__0__Impl_in_rule__Timer__Group_3_6__04698);
            rule__Timer__Group_3_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group_3_6__1_in_rule__Timer__Group_3_6__04701);
            rule__Timer__Group_3_6__1();

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
    // $ANTLR end "rule__Timer__Group_3_6__0"


    // $ANTLR start "rule__Timer__Group_3_6__0__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2360:1: rule__Timer__Group_3_6__0__Impl : ( ( rule__Timer__RepeattypeAssignment_3_6_0 ) ) ;
    public final void rule__Timer__Group_3_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2364:1: ( ( ( rule__Timer__RepeattypeAssignment_3_6_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2365:1: ( ( rule__Timer__RepeattypeAssignment_3_6_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2365:1: ( ( rule__Timer__RepeattypeAssignment_3_6_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2366:1: ( rule__Timer__RepeattypeAssignment_3_6_0 )
            {
             before(grammarAccess.getTimerAccess().getRepeattypeAssignment_3_6_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2367:1: ( rule__Timer__RepeattypeAssignment_3_6_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2367:2: rule__Timer__RepeattypeAssignment_3_6_0
            {
            pushFollow(FOLLOW_rule__Timer__RepeattypeAssignment_3_6_0_in_rule__Timer__Group_3_6__0__Impl4728);
            rule__Timer__RepeattypeAssignment_3_6_0();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getRepeattypeAssignment_3_6_0()); 

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
    // $ANTLR end "rule__Timer__Group_3_6__0__Impl"


    // $ANTLR start "rule__Timer__Group_3_6__1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2377:1: rule__Timer__Group_3_6__1 : rule__Timer__Group_3_6__1__Impl rule__Timer__Group_3_6__2 ;
    public final void rule__Timer__Group_3_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2381:1: ( rule__Timer__Group_3_6__1__Impl rule__Timer__Group_3_6__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2382:2: rule__Timer__Group_3_6__1__Impl rule__Timer__Group_3_6__2
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_6__1__Impl_in_rule__Timer__Group_3_6__14758);
            rule__Timer__Group_3_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group_3_6__2_in_rule__Timer__Group_3_6__14761);
            rule__Timer__Group_3_6__2();

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
    // $ANTLR end "rule__Timer__Group_3_6__1"


    // $ANTLR start "rule__Timer__Group_3_6__1__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2389:1: rule__Timer__Group_3_6__1__Impl : ( ( rule__Timer__HoursAssignment_3_6_1 ) ) ;
    public final void rule__Timer__Group_3_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2393:1: ( ( ( rule__Timer__HoursAssignment_3_6_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2394:1: ( ( rule__Timer__HoursAssignment_3_6_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2394:1: ( ( rule__Timer__HoursAssignment_3_6_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2395:1: ( rule__Timer__HoursAssignment_3_6_1 )
            {
             before(grammarAccess.getTimerAccess().getHoursAssignment_3_6_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2396:1: ( rule__Timer__HoursAssignment_3_6_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2396:2: rule__Timer__HoursAssignment_3_6_1
            {
            pushFollow(FOLLOW_rule__Timer__HoursAssignment_3_6_1_in_rule__Timer__Group_3_6__1__Impl4788);
            rule__Timer__HoursAssignment_3_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getHoursAssignment_3_6_1()); 

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
    // $ANTLR end "rule__Timer__Group_3_6__1__Impl"


    // $ANTLR start "rule__Timer__Group_3_6__2"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2406:1: rule__Timer__Group_3_6__2 : rule__Timer__Group_3_6__2__Impl rule__Timer__Group_3_6__3 ;
    public final void rule__Timer__Group_3_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2410:1: ( rule__Timer__Group_3_6__2__Impl rule__Timer__Group_3_6__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2411:2: rule__Timer__Group_3_6__2__Impl rule__Timer__Group_3_6__3
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_6__2__Impl_in_rule__Timer__Group_3_6__24818);
            rule__Timer__Group_3_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group_3_6__3_in_rule__Timer__Group_3_6__24821);
            rule__Timer__Group_3_6__3();

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
    // $ANTLR end "rule__Timer__Group_3_6__2"


    // $ANTLR start "rule__Timer__Group_3_6__2__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2418:1: rule__Timer__Group_3_6__2__Impl : ( ':' ) ;
    public final void rule__Timer__Group_3_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2422:1: ( ( ':' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2423:1: ( ':' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2423:1: ( ':' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2424:1: ':'
            {
             before(grammarAccess.getTimerAccess().getColonKeyword_3_6_2()); 
            match(input,23,FOLLOW_23_in_rule__Timer__Group_3_6__2__Impl4849); 
             after(grammarAccess.getTimerAccess().getColonKeyword_3_6_2()); 

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
    // $ANTLR end "rule__Timer__Group_3_6__2__Impl"


    // $ANTLR start "rule__Timer__Group_3_6__3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2437:1: rule__Timer__Group_3_6__3 : rule__Timer__Group_3_6__3__Impl ;
    public final void rule__Timer__Group_3_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2441:1: ( rule__Timer__Group_3_6__3__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2442:2: rule__Timer__Group_3_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_6__3__Impl_in_rule__Timer__Group_3_6__34880);
            rule__Timer__Group_3_6__3__Impl();

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
    // $ANTLR end "rule__Timer__Group_3_6__3"


    // $ANTLR start "rule__Timer__Group_3_6__3__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2448:1: rule__Timer__Group_3_6__3__Impl : ( ( rule__Timer__MinutesAssignment_3_6_3 ) ) ;
    public final void rule__Timer__Group_3_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2452:1: ( ( ( rule__Timer__MinutesAssignment_3_6_3 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2453:1: ( ( rule__Timer__MinutesAssignment_3_6_3 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2453:1: ( ( rule__Timer__MinutesAssignment_3_6_3 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2454:1: ( rule__Timer__MinutesAssignment_3_6_3 )
            {
             before(grammarAccess.getTimerAccess().getMinutesAssignment_3_6_3()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2455:1: ( rule__Timer__MinutesAssignment_3_6_3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2455:2: rule__Timer__MinutesAssignment_3_6_3
            {
            pushFollow(FOLLOW_rule__Timer__MinutesAssignment_3_6_3_in_rule__Timer__Group_3_6__3__Impl4907);
            rule__Timer__MinutesAssignment_3_6_3();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getMinutesAssignment_3_6_3()); 

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
    // $ANTLR end "rule__Timer__Group_3_6__3__Impl"


    // $ANTLR start "rule__Timer__Group_3_7__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2473:1: rule__Timer__Group_3_7__0 : rule__Timer__Group_3_7__0__Impl rule__Timer__Group_3_7__1 ;
    public final void rule__Timer__Group_3_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2477:1: ( rule__Timer__Group_3_7__0__Impl rule__Timer__Group_3_7__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2478:2: rule__Timer__Group_3_7__0__Impl rule__Timer__Group_3_7__1
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_7__0__Impl_in_rule__Timer__Group_3_7__04945);
            rule__Timer__Group_3_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group_3_7__1_in_rule__Timer__Group_3_7__04948);
            rule__Timer__Group_3_7__1();

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
    // $ANTLR end "rule__Timer__Group_3_7__0"


    // $ANTLR start "rule__Timer__Group_3_7__0__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2485:1: rule__Timer__Group_3_7__0__Impl : ( ( rule__Timer__RepeattypeAssignment_3_7_0 ) ) ;
    public final void rule__Timer__Group_3_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2489:1: ( ( ( rule__Timer__RepeattypeAssignment_3_7_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2490:1: ( ( rule__Timer__RepeattypeAssignment_3_7_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2490:1: ( ( rule__Timer__RepeattypeAssignment_3_7_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2491:1: ( rule__Timer__RepeattypeAssignment_3_7_0 )
            {
             before(grammarAccess.getTimerAccess().getRepeattypeAssignment_3_7_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2492:1: ( rule__Timer__RepeattypeAssignment_3_7_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2492:2: rule__Timer__RepeattypeAssignment_3_7_0
            {
            pushFollow(FOLLOW_rule__Timer__RepeattypeAssignment_3_7_0_in_rule__Timer__Group_3_7__0__Impl4975);
            rule__Timer__RepeattypeAssignment_3_7_0();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getRepeattypeAssignment_3_7_0()); 

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
    // $ANTLR end "rule__Timer__Group_3_7__0__Impl"


    // $ANTLR start "rule__Timer__Group_3_7__1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2502:1: rule__Timer__Group_3_7__1 : rule__Timer__Group_3_7__1__Impl rule__Timer__Group_3_7__2 ;
    public final void rule__Timer__Group_3_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2506:1: ( rule__Timer__Group_3_7__1__Impl rule__Timer__Group_3_7__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2507:2: rule__Timer__Group_3_7__1__Impl rule__Timer__Group_3_7__2
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_7__1__Impl_in_rule__Timer__Group_3_7__15005);
            rule__Timer__Group_3_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group_3_7__2_in_rule__Timer__Group_3_7__15008);
            rule__Timer__Group_3_7__2();

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
    // $ANTLR end "rule__Timer__Group_3_7__1"


    // $ANTLR start "rule__Timer__Group_3_7__1__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2514:1: rule__Timer__Group_3_7__1__Impl : ( ( rule__Timer__HoursAssignment_3_7_1 ) ) ;
    public final void rule__Timer__Group_3_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2518:1: ( ( ( rule__Timer__HoursAssignment_3_7_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2519:1: ( ( rule__Timer__HoursAssignment_3_7_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2519:1: ( ( rule__Timer__HoursAssignment_3_7_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2520:1: ( rule__Timer__HoursAssignment_3_7_1 )
            {
             before(grammarAccess.getTimerAccess().getHoursAssignment_3_7_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2521:1: ( rule__Timer__HoursAssignment_3_7_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2521:2: rule__Timer__HoursAssignment_3_7_1
            {
            pushFollow(FOLLOW_rule__Timer__HoursAssignment_3_7_1_in_rule__Timer__Group_3_7__1__Impl5035);
            rule__Timer__HoursAssignment_3_7_1();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getHoursAssignment_3_7_1()); 

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
    // $ANTLR end "rule__Timer__Group_3_7__1__Impl"


    // $ANTLR start "rule__Timer__Group_3_7__2"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2531:1: rule__Timer__Group_3_7__2 : rule__Timer__Group_3_7__2__Impl rule__Timer__Group_3_7__3 ;
    public final void rule__Timer__Group_3_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2535:1: ( rule__Timer__Group_3_7__2__Impl rule__Timer__Group_3_7__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2536:2: rule__Timer__Group_3_7__2__Impl rule__Timer__Group_3_7__3
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_7__2__Impl_in_rule__Timer__Group_3_7__25065);
            rule__Timer__Group_3_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group_3_7__3_in_rule__Timer__Group_3_7__25068);
            rule__Timer__Group_3_7__3();

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
    // $ANTLR end "rule__Timer__Group_3_7__2"


    // $ANTLR start "rule__Timer__Group_3_7__2__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2543:1: rule__Timer__Group_3_7__2__Impl : ( ':' ) ;
    public final void rule__Timer__Group_3_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2547:1: ( ( ':' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2548:1: ( ':' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2548:1: ( ':' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2549:1: ':'
            {
             before(grammarAccess.getTimerAccess().getColonKeyword_3_7_2()); 
            match(input,23,FOLLOW_23_in_rule__Timer__Group_3_7__2__Impl5096); 
             after(grammarAccess.getTimerAccess().getColonKeyword_3_7_2()); 

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
    // $ANTLR end "rule__Timer__Group_3_7__2__Impl"


    // $ANTLR start "rule__Timer__Group_3_7__3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2562:1: rule__Timer__Group_3_7__3 : rule__Timer__Group_3_7__3__Impl ;
    public final void rule__Timer__Group_3_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2566:1: ( rule__Timer__Group_3_7__3__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2567:2: rule__Timer__Group_3_7__3__Impl
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_7__3__Impl_in_rule__Timer__Group_3_7__35127);
            rule__Timer__Group_3_7__3__Impl();

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
    // $ANTLR end "rule__Timer__Group_3_7__3"


    // $ANTLR start "rule__Timer__Group_3_7__3__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2573:1: rule__Timer__Group_3_7__3__Impl : ( ( rule__Timer__MinutesAssignment_3_7_3 ) ) ;
    public final void rule__Timer__Group_3_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2577:1: ( ( ( rule__Timer__MinutesAssignment_3_7_3 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2578:1: ( ( rule__Timer__MinutesAssignment_3_7_3 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2578:1: ( ( rule__Timer__MinutesAssignment_3_7_3 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2579:1: ( rule__Timer__MinutesAssignment_3_7_3 )
            {
             before(grammarAccess.getTimerAccess().getMinutesAssignment_3_7_3()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2580:1: ( rule__Timer__MinutesAssignment_3_7_3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2580:2: rule__Timer__MinutesAssignment_3_7_3
            {
            pushFollow(FOLLOW_rule__Timer__MinutesAssignment_3_7_3_in_rule__Timer__Group_3_7__3__Impl5154);
            rule__Timer__MinutesAssignment_3_7_3();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getMinutesAssignment_3_7_3()); 

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
    // $ANTLR end "rule__Timer__Group_3_7__3__Impl"


    // $ANTLR start "rule__Timer__Group_3_8__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2598:1: rule__Timer__Group_3_8__0 : rule__Timer__Group_3_8__0__Impl rule__Timer__Group_3_8__1 ;
    public final void rule__Timer__Group_3_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2602:1: ( rule__Timer__Group_3_8__0__Impl rule__Timer__Group_3_8__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2603:2: rule__Timer__Group_3_8__0__Impl rule__Timer__Group_3_8__1
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_8__0__Impl_in_rule__Timer__Group_3_8__05192);
            rule__Timer__Group_3_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group_3_8__1_in_rule__Timer__Group_3_8__05195);
            rule__Timer__Group_3_8__1();

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
    // $ANTLR end "rule__Timer__Group_3_8__0"


    // $ANTLR start "rule__Timer__Group_3_8__0__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2610:1: rule__Timer__Group_3_8__0__Impl : ( ( rule__Timer__RepeattypeAssignment_3_8_0 ) ) ;
    public final void rule__Timer__Group_3_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2614:1: ( ( ( rule__Timer__RepeattypeAssignment_3_8_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2615:1: ( ( rule__Timer__RepeattypeAssignment_3_8_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2615:1: ( ( rule__Timer__RepeattypeAssignment_3_8_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2616:1: ( rule__Timer__RepeattypeAssignment_3_8_0 )
            {
             before(grammarAccess.getTimerAccess().getRepeattypeAssignment_3_8_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2617:1: ( rule__Timer__RepeattypeAssignment_3_8_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2617:2: rule__Timer__RepeattypeAssignment_3_8_0
            {
            pushFollow(FOLLOW_rule__Timer__RepeattypeAssignment_3_8_0_in_rule__Timer__Group_3_8__0__Impl5222);
            rule__Timer__RepeattypeAssignment_3_8_0();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getRepeattypeAssignment_3_8_0()); 

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
    // $ANTLR end "rule__Timer__Group_3_8__0__Impl"


    // $ANTLR start "rule__Timer__Group_3_8__1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2627:1: rule__Timer__Group_3_8__1 : rule__Timer__Group_3_8__1__Impl rule__Timer__Group_3_8__2 ;
    public final void rule__Timer__Group_3_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2631:1: ( rule__Timer__Group_3_8__1__Impl rule__Timer__Group_3_8__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2632:2: rule__Timer__Group_3_8__1__Impl rule__Timer__Group_3_8__2
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_8__1__Impl_in_rule__Timer__Group_3_8__15252);
            rule__Timer__Group_3_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group_3_8__2_in_rule__Timer__Group_3_8__15255);
            rule__Timer__Group_3_8__2();

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
    // $ANTLR end "rule__Timer__Group_3_8__1"


    // $ANTLR start "rule__Timer__Group_3_8__1__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2639:1: rule__Timer__Group_3_8__1__Impl : ( ( rule__Timer__HoursAssignment_3_8_1 ) ) ;
    public final void rule__Timer__Group_3_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2643:1: ( ( ( rule__Timer__HoursAssignment_3_8_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2644:1: ( ( rule__Timer__HoursAssignment_3_8_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2644:1: ( ( rule__Timer__HoursAssignment_3_8_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2645:1: ( rule__Timer__HoursAssignment_3_8_1 )
            {
             before(grammarAccess.getTimerAccess().getHoursAssignment_3_8_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2646:1: ( rule__Timer__HoursAssignment_3_8_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2646:2: rule__Timer__HoursAssignment_3_8_1
            {
            pushFollow(FOLLOW_rule__Timer__HoursAssignment_3_8_1_in_rule__Timer__Group_3_8__1__Impl5282);
            rule__Timer__HoursAssignment_3_8_1();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getHoursAssignment_3_8_1()); 

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
    // $ANTLR end "rule__Timer__Group_3_8__1__Impl"


    // $ANTLR start "rule__Timer__Group_3_8__2"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2656:1: rule__Timer__Group_3_8__2 : rule__Timer__Group_3_8__2__Impl rule__Timer__Group_3_8__3 ;
    public final void rule__Timer__Group_3_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2660:1: ( rule__Timer__Group_3_8__2__Impl rule__Timer__Group_3_8__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2661:2: rule__Timer__Group_3_8__2__Impl rule__Timer__Group_3_8__3
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_8__2__Impl_in_rule__Timer__Group_3_8__25312);
            rule__Timer__Group_3_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timer__Group_3_8__3_in_rule__Timer__Group_3_8__25315);
            rule__Timer__Group_3_8__3();

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
    // $ANTLR end "rule__Timer__Group_3_8__2"


    // $ANTLR start "rule__Timer__Group_3_8__2__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2668:1: rule__Timer__Group_3_8__2__Impl : ( ':' ) ;
    public final void rule__Timer__Group_3_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2672:1: ( ( ':' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2673:1: ( ':' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2673:1: ( ':' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2674:1: ':'
            {
             before(grammarAccess.getTimerAccess().getColonKeyword_3_8_2()); 
            match(input,23,FOLLOW_23_in_rule__Timer__Group_3_8__2__Impl5343); 
             after(grammarAccess.getTimerAccess().getColonKeyword_3_8_2()); 

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
    // $ANTLR end "rule__Timer__Group_3_8__2__Impl"


    // $ANTLR start "rule__Timer__Group_3_8__3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2687:1: rule__Timer__Group_3_8__3 : rule__Timer__Group_3_8__3__Impl ;
    public final void rule__Timer__Group_3_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2691:1: ( rule__Timer__Group_3_8__3__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2692:2: rule__Timer__Group_3_8__3__Impl
            {
            pushFollow(FOLLOW_rule__Timer__Group_3_8__3__Impl_in_rule__Timer__Group_3_8__35374);
            rule__Timer__Group_3_8__3__Impl();

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
    // $ANTLR end "rule__Timer__Group_3_8__3"


    // $ANTLR start "rule__Timer__Group_3_8__3__Impl"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2698:1: rule__Timer__Group_3_8__3__Impl : ( ( rule__Timer__MinutesAssignment_3_8_3 ) ) ;
    public final void rule__Timer__Group_3_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2702:1: ( ( ( rule__Timer__MinutesAssignment_3_8_3 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2703:1: ( ( rule__Timer__MinutesAssignment_3_8_3 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2703:1: ( ( rule__Timer__MinutesAssignment_3_8_3 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2704:1: ( rule__Timer__MinutesAssignment_3_8_3 )
            {
             before(grammarAccess.getTimerAccess().getMinutesAssignment_3_8_3()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2705:1: ( rule__Timer__MinutesAssignment_3_8_3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2705:2: rule__Timer__MinutesAssignment_3_8_3
            {
            pushFollow(FOLLOW_rule__Timer__MinutesAssignment_3_8_3_in_rule__Timer__Group_3_8__3__Impl5401);
            rule__Timer__MinutesAssignment_3_8_3();

            state._fsp--;


            }

             after(grammarAccess.getTimerAccess().getMinutesAssignment_3_8_3()); 

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
    // $ANTLR end "rule__Timer__Group_3_8__3__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2724:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2728:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2729:1: ( RULE_ID )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2729:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2730:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NameAssignment_15444); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2739:1: rule__Model__HardwareAssignment_3 : ( ( rule__Model__HardwareAlternatives_3_0 ) ) ;
    public final void rule__Model__HardwareAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2743:1: ( ( ( rule__Model__HardwareAlternatives_3_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2744:1: ( ( rule__Model__HardwareAlternatives_3_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2744:1: ( ( rule__Model__HardwareAlternatives_3_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2745:1: ( rule__Model__HardwareAlternatives_3_0 )
            {
             before(grammarAccess.getModelAccess().getHardwareAlternatives_3_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2746:1: ( rule__Model__HardwareAlternatives_3_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2746:2: rule__Model__HardwareAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Model__HardwareAlternatives_3_0_in_rule__Model__HardwareAssignment_35475);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2755:1: rule__Model__DevicesAssignment_4 : ( ruleAbstractDevice ) ;
    public final void rule__Model__DevicesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2759:1: ( ( ruleAbstractDevice ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2760:1: ( ruleAbstractDevice )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2760:1: ( ruleAbstractDevice )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2761:1: ruleAbstractDevice
            {
             before(grammarAccess.getModelAccess().getDevicesAbstractDeviceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAbstractDevice_in_rule__Model__DevicesAssignment_45508);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2770:1: rule__Model__EventHandlersAssignment_5 : ( ruleEventHandler ) ;
    public final void rule__Model__EventHandlersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2774:1: ( ( ruleEventHandler ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2775:1: ( ruleEventHandler )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2775:1: ( ruleEventHandler )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2776:1: ruleEventHandler
            {
             before(grammarAccess.getModelAccess().getEventHandlersEventHandlerParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleEventHandler_in_rule__Model__EventHandlersAssignment_55539);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2785:1: rule__Model__SensorListenersAssignment_6 : ( ruleSensorListener ) ;
    public final void rule__Model__SensorListenersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2789:1: ( ( ruleSensorListener ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2790:1: ( ruleSensorListener )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2790:1: ( ruleSensorListener )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2791:1: ruleSensorListener
            {
             before(grammarAccess.getModelAccess().getSensorListenersSensorListenerParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleSensorListener_in_rule__Model__SensorListenersAssignment_65570);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2800:1: rule__Model__TimersAssignment_7 : ( ruleTimer ) ;
    public final void rule__Model__TimersAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2804:1: ( ( ruleTimer ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2805:1: ( ruleTimer )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2805:1: ( ruleTimer )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2806:1: ruleTimer
            {
             before(grammarAccess.getModelAccess().getTimersTimerParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleTimer_in_rule__Model__TimersAssignment_75601);
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


    // $ANTLR start "rule__Sensor__NameAssignment_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2815:1: rule__Sensor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sensor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2819:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2820:1: ( RULE_ID )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2820:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2821:1: RULE_ID
            {
             before(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Sensor__NameAssignment_15632); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2830:1: rule__Sensor__PinAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Sensor__PinAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2834:1: ( ( RULE_STRING ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2835:1: ( RULE_STRING )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2835:1: ( RULE_STRING )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2836:1: RULE_STRING
            {
             before(grammarAccess.getSensorAccess().getPinSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Sensor__PinAssignment_35663); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2845:1: rule__Actuator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Actuator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2849:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2850:1: ( RULE_ID )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2850:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2851:1: RULE_ID
            {
             before(grammarAccess.getActuatorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actuator__NameAssignment_15694); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2860:1: rule__Actuator__PinAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Actuator__PinAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2864:1: ( ( RULE_STRING ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2865:1: ( RULE_STRING )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2865:1: ( RULE_STRING )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2866:1: RULE_STRING
            {
             before(grammarAccess.getActuatorAccess().getPinSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Actuator__PinAssignment_35725); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2875:1: rule__EventHandler__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EventHandler__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2879:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2880:1: ( RULE_ID )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2880:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2881:1: RULE_ID
            {
             before(grammarAccess.getEventHandlerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EventHandler__NameAssignment_15756); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2890:1: rule__EventHandler__ChangeActuatorsAssignment_2 : ( ruleChangeActuator ) ;
    public final void rule__EventHandler__ChangeActuatorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2894:1: ( ( ruleChangeActuator ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2895:1: ( ruleChangeActuator )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2895:1: ( ruleChangeActuator )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2896:1: ruleChangeActuator
            {
             before(grammarAccess.getEventHandlerAccess().getChangeActuatorsChangeActuatorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleChangeActuator_in_rule__EventHandler__ChangeActuatorsAssignment_25787);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2905:1: rule__ChangeActuator__ActuatorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ChangeActuator__ActuatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2909:1: ( ( ( RULE_ID ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2910:1: ( ( RULE_ID ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2910:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2911:1: ( RULE_ID )
            {
             before(grammarAccess.getChangeActuatorAccess().getActuatorActuatorCrossReference_0_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2912:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2913:1: RULE_ID
            {
             before(grammarAccess.getChangeActuatorAccess().getActuatorActuatorIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ChangeActuator__ActuatorAssignment_05822); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2924:1: rule__ChangeActuator__ActuatorStateAssignment_2 : ( ( rule__ChangeActuator__ActuatorStateAlternatives_2_0 ) ) ;
    public final void rule__ChangeActuator__ActuatorStateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2928:1: ( ( ( rule__ChangeActuator__ActuatorStateAlternatives_2_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2929:1: ( ( rule__ChangeActuator__ActuatorStateAlternatives_2_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2929:1: ( ( rule__ChangeActuator__ActuatorStateAlternatives_2_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2930:1: ( rule__ChangeActuator__ActuatorStateAlternatives_2_0 )
            {
             before(grammarAccess.getChangeActuatorAccess().getActuatorStateAlternatives_2_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2931:1: ( rule__ChangeActuator__ActuatorStateAlternatives_2_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2931:2: rule__ChangeActuator__ActuatorStateAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__ChangeActuator__ActuatorStateAlternatives_2_0_in_rule__ChangeActuator__ActuatorStateAssignment_25857);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2940:1: rule__SensorListener__SensorAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SensorListener__SensorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2944:1: ( ( ( RULE_ID ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2945:1: ( ( RULE_ID ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2945:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2946:1: ( RULE_ID )
            {
             before(grammarAccess.getSensorListenerAccess().getSensorSensorCrossReference_1_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2947:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2948:1: RULE_ID
            {
             before(grammarAccess.getSensorListenerAccess().getSensorSensorIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SensorListener__SensorAssignment_15894); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2959:1: rule__SensorListener__TypeAssignment_3_0 : ( ( 'ON' ) ) ;
    public final void rule__SensorListener__TypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2963:1: ( ( ( 'ON' ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2964:1: ( ( 'ON' ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2964:1: ( ( 'ON' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2965:1: ( 'ON' )
            {
             before(grammarAccess.getSensorListenerAccess().getTypeONKeyword_3_0_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2966:1: ( 'ON' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2967:1: 'ON'
            {
             before(grammarAccess.getSensorListenerAccess().getTypeONKeyword_3_0_0()); 
            match(input,31,FOLLOW_31_in_rule__SensorListener__TypeAssignment_3_05934); 
             after(grammarAccess.getSensorListenerAccess().getTypeONKeyword_3_0_0()); 

            }

             after(grammarAccess.getSensorListenerAccess().getTypeONKeyword_3_0_0()); 

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


    // $ANTLR start "rule__SensorListener__TypeAssignment_3_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2982:1: rule__SensorListener__TypeAssignment_3_1 : ( ( 'OFF' ) ) ;
    public final void rule__SensorListener__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2986:1: ( ( ( 'OFF' ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2987:1: ( ( 'OFF' ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2987:1: ( ( 'OFF' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2988:1: ( 'OFF' )
            {
             before(grammarAccess.getSensorListenerAccess().getTypeOFFKeyword_3_1_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2989:1: ( 'OFF' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:2990:1: 'OFF'
            {
             before(grammarAccess.getSensorListenerAccess().getTypeOFFKeyword_3_1_0()); 
            match(input,32,FOLLOW_32_in_rule__SensorListener__TypeAssignment_3_15978); 
             after(grammarAccess.getSensorListenerAccess().getTypeOFFKeyword_3_1_0()); 

            }

             after(grammarAccess.getSensorListenerAccess().getTypeOFFKeyword_3_1_0()); 

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
    // $ANTLR end "rule__SensorListener__TypeAssignment_3_1"


    // $ANTLR start "rule__SensorListener__TypeAssignment_3_2_0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3005:1: rule__SensorListener__TypeAssignment_3_2_0 : ( ( 'BETWEEN' ) ) ;
    public final void rule__SensorListener__TypeAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3009:1: ( ( ( 'BETWEEN' ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3010:1: ( ( 'BETWEEN' ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3010:1: ( ( 'BETWEEN' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3011:1: ( 'BETWEEN' )
            {
             before(grammarAccess.getSensorListenerAccess().getTypeBETWEENKeyword_3_2_0_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3012:1: ( 'BETWEEN' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3013:1: 'BETWEEN'
            {
             before(grammarAccess.getSensorListenerAccess().getTypeBETWEENKeyword_3_2_0_0()); 
            match(input,33,FOLLOW_33_in_rule__SensorListener__TypeAssignment_3_2_06022); 
             after(grammarAccess.getSensorListenerAccess().getTypeBETWEENKeyword_3_2_0_0()); 

            }

             after(grammarAccess.getSensorListenerAccess().getTypeBETWEENKeyword_3_2_0_0()); 

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
    // $ANTLR end "rule__SensorListener__TypeAssignment_3_2_0"


    // $ANTLR start "rule__SensorListener__LAssignment_3_2_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3028:1: rule__SensorListener__LAssignment_3_2_1 : ( RULE_INT ) ;
    public final void rule__SensorListener__LAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3032:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3033:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3033:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3034:1: RULE_INT
            {
             before(grammarAccess.getSensorListenerAccess().getLINTTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SensorListener__LAssignment_3_2_16061); 
             after(grammarAccess.getSensorListenerAccess().getLINTTerminalRuleCall_3_2_1_0()); 

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
    // $ANTLR end "rule__SensorListener__LAssignment_3_2_1"


    // $ANTLR start "rule__SensorListener__HAssignment_3_2_3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3043:1: rule__SensorListener__HAssignment_3_2_3 : ( RULE_INT ) ;
    public final void rule__SensorListener__HAssignment_3_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3047:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3048:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3048:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3049:1: RULE_INT
            {
             before(grammarAccess.getSensorListenerAccess().getHINTTerminalRuleCall_3_2_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SensorListener__HAssignment_3_2_36092); 
             after(grammarAccess.getSensorListenerAccess().getHINTTerminalRuleCall_3_2_3_0()); 

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
    // $ANTLR end "rule__SensorListener__HAssignment_3_2_3"


    // $ANTLR start "rule__SensorListener__EventHandlerAssignment_5"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3058:1: rule__SensorListener__EventHandlerAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__SensorListener__EventHandlerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3062:1: ( ( ( RULE_ID ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3063:1: ( ( RULE_ID ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3063:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3064:1: ( RULE_ID )
            {
             before(grammarAccess.getSensorListenerAccess().getEventHandlerEventHandlerCrossReference_5_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3065:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3066:1: RULE_ID
            {
             before(grammarAccess.getSensorListenerAccess().getEventHandlerEventHandlerIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SensorListener__EventHandlerAssignment_56127); 
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


    // $ANTLR start "rule__Timer__EventHandlerAssignment_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3077:1: rule__Timer__EventHandlerAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Timer__EventHandlerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3081:1: ( ( ( RULE_ID ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3082:1: ( ( RULE_ID ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3082:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3083:1: ( RULE_ID )
            {
             before(grammarAccess.getTimerAccess().getEventHandlerEventHandlerCrossReference_1_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3084:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3085:1: RULE_ID
            {
             before(grammarAccess.getTimerAccess().getEventHandlerEventHandlerIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Timer__EventHandlerAssignment_16166); 
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


    // $ANTLR start "rule__Timer__RepeattypeAssignment_3_0_0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3096:1: rule__Timer__RepeattypeAssignment_3_0_0 : ( ( 'EVERY INTERVAL of' ) ) ;
    public final void rule__Timer__RepeattypeAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3100:1: ( ( ( 'EVERY INTERVAL of' ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3101:1: ( ( 'EVERY INTERVAL of' ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3101:1: ( ( 'EVERY INTERVAL of' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3102:1: ( 'EVERY INTERVAL of' )
            {
             before(grammarAccess.getTimerAccess().getRepeattypeEVERYINTERVALOfKeyword_3_0_0_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3103:1: ( 'EVERY INTERVAL of' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3104:1: 'EVERY INTERVAL of'
            {
             before(grammarAccess.getTimerAccess().getRepeattypeEVERYINTERVALOfKeyword_3_0_0_0()); 
            match(input,34,FOLLOW_34_in_rule__Timer__RepeattypeAssignment_3_0_06206); 
             after(grammarAccess.getTimerAccess().getRepeattypeEVERYINTERVALOfKeyword_3_0_0_0()); 

            }

             after(grammarAccess.getTimerAccess().getRepeattypeEVERYINTERVALOfKeyword_3_0_0_0()); 

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
    // $ANTLR end "rule__Timer__RepeattypeAssignment_3_0_0"


    // $ANTLR start "rule__Timer__SecsAssignment_3_0_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3119:1: rule__Timer__SecsAssignment_3_0_1 : ( RULE_INT ) ;
    public final void rule__Timer__SecsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3123:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3124:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3124:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3125:1: RULE_INT
            {
             before(grammarAccess.getTimerAccess().getSecsINTTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Timer__SecsAssignment_3_0_16245); 
             after(grammarAccess.getTimerAccess().getSecsINTTerminalRuleCall_3_0_1_0()); 

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
    // $ANTLR end "rule__Timer__SecsAssignment_3_0_1"


    // $ANTLR start "rule__Timer__RepeattypeAssignment_3_1_0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3134:1: rule__Timer__RepeattypeAssignment_3_1_0 : ( ( 'EVERY DAY at' ) ) ;
    public final void rule__Timer__RepeattypeAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3138:1: ( ( ( 'EVERY DAY at' ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3139:1: ( ( 'EVERY DAY at' ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3139:1: ( ( 'EVERY DAY at' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3140:1: ( 'EVERY DAY at' )
            {
             before(grammarAccess.getTimerAccess().getRepeattypeEVERYDAYAtKeyword_3_1_0_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3141:1: ( 'EVERY DAY at' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3142:1: 'EVERY DAY at'
            {
             before(grammarAccess.getTimerAccess().getRepeattypeEVERYDAYAtKeyword_3_1_0_0()); 
            match(input,35,FOLLOW_35_in_rule__Timer__RepeattypeAssignment_3_1_06281); 
             after(grammarAccess.getTimerAccess().getRepeattypeEVERYDAYAtKeyword_3_1_0_0()); 

            }

             after(grammarAccess.getTimerAccess().getRepeattypeEVERYDAYAtKeyword_3_1_0_0()); 

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
    // $ANTLR end "rule__Timer__RepeattypeAssignment_3_1_0"


    // $ANTLR start "rule__Timer__HoursAssignment_3_1_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3157:1: rule__Timer__HoursAssignment_3_1_1 : ( RULE_INT ) ;
    public final void rule__Timer__HoursAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3161:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3162:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3162:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3163:1: RULE_INT
            {
             before(grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Timer__HoursAssignment_3_1_16320); 
             after(grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_1_1_0()); 

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
    // $ANTLR end "rule__Timer__HoursAssignment_3_1_1"


    // $ANTLR start "rule__Timer__MinutesAssignment_3_1_3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3172:1: rule__Timer__MinutesAssignment_3_1_3 : ( RULE_INT ) ;
    public final void rule__Timer__MinutesAssignment_3_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3176:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3177:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3177:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3178:1: RULE_INT
            {
             before(grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_1_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Timer__MinutesAssignment_3_1_36351); 
             after(grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_1_3_0()); 

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
    // $ANTLR end "rule__Timer__MinutesAssignment_3_1_3"


    // $ANTLR start "rule__Timer__RepeattypeAssignment_3_2_0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3187:1: rule__Timer__RepeattypeAssignment_3_2_0 : ( ( 'EVERY MONDAY at' ) ) ;
    public final void rule__Timer__RepeattypeAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3191:1: ( ( ( 'EVERY MONDAY at' ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3192:1: ( ( 'EVERY MONDAY at' ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3192:1: ( ( 'EVERY MONDAY at' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3193:1: ( 'EVERY MONDAY at' )
            {
             before(grammarAccess.getTimerAccess().getRepeattypeEVERYMONDAYAtKeyword_3_2_0_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3194:1: ( 'EVERY MONDAY at' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3195:1: 'EVERY MONDAY at'
            {
             before(grammarAccess.getTimerAccess().getRepeattypeEVERYMONDAYAtKeyword_3_2_0_0()); 
            match(input,36,FOLLOW_36_in_rule__Timer__RepeattypeAssignment_3_2_06387); 
             after(grammarAccess.getTimerAccess().getRepeattypeEVERYMONDAYAtKeyword_3_2_0_0()); 

            }

             after(grammarAccess.getTimerAccess().getRepeattypeEVERYMONDAYAtKeyword_3_2_0_0()); 

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
    // $ANTLR end "rule__Timer__RepeattypeAssignment_3_2_0"


    // $ANTLR start "rule__Timer__HoursAssignment_3_2_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3210:1: rule__Timer__HoursAssignment_3_2_1 : ( RULE_INT ) ;
    public final void rule__Timer__HoursAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3214:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3215:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3215:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3216:1: RULE_INT
            {
             before(grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Timer__HoursAssignment_3_2_16426); 
             after(grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_2_1_0()); 

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
    // $ANTLR end "rule__Timer__HoursAssignment_3_2_1"


    // $ANTLR start "rule__Timer__MinutesAssignment_3_2_3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3225:1: rule__Timer__MinutesAssignment_3_2_3 : ( RULE_INT ) ;
    public final void rule__Timer__MinutesAssignment_3_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3229:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3230:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3230:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3231:1: RULE_INT
            {
             before(grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_2_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Timer__MinutesAssignment_3_2_36457); 
             after(grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_2_3_0()); 

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
    // $ANTLR end "rule__Timer__MinutesAssignment_3_2_3"


    // $ANTLR start "rule__Timer__RepeattypeAssignment_3_3_0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3240:1: rule__Timer__RepeattypeAssignment_3_3_0 : ( ( 'EVERY TUESDAY at' ) ) ;
    public final void rule__Timer__RepeattypeAssignment_3_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3244:1: ( ( ( 'EVERY TUESDAY at' ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3245:1: ( ( 'EVERY TUESDAY at' ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3245:1: ( ( 'EVERY TUESDAY at' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3246:1: ( 'EVERY TUESDAY at' )
            {
             before(grammarAccess.getTimerAccess().getRepeattypeEVERYTUESDAYAtKeyword_3_3_0_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3247:1: ( 'EVERY TUESDAY at' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3248:1: 'EVERY TUESDAY at'
            {
             before(grammarAccess.getTimerAccess().getRepeattypeEVERYTUESDAYAtKeyword_3_3_0_0()); 
            match(input,37,FOLLOW_37_in_rule__Timer__RepeattypeAssignment_3_3_06493); 
             after(grammarAccess.getTimerAccess().getRepeattypeEVERYTUESDAYAtKeyword_3_3_0_0()); 

            }

             after(grammarAccess.getTimerAccess().getRepeattypeEVERYTUESDAYAtKeyword_3_3_0_0()); 

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
    // $ANTLR end "rule__Timer__RepeattypeAssignment_3_3_0"


    // $ANTLR start "rule__Timer__HoursAssignment_3_3_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3263:1: rule__Timer__HoursAssignment_3_3_1 : ( RULE_INT ) ;
    public final void rule__Timer__HoursAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3267:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3268:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3268:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3269:1: RULE_INT
            {
             before(grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Timer__HoursAssignment_3_3_16532); 
             after(grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__Timer__HoursAssignment_3_3_1"


    // $ANTLR start "rule__Timer__MinutesAssignment_3_3_3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3278:1: rule__Timer__MinutesAssignment_3_3_3 : ( RULE_INT ) ;
    public final void rule__Timer__MinutesAssignment_3_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3282:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3283:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3283:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3284:1: RULE_INT
            {
             before(grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_3_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Timer__MinutesAssignment_3_3_36563); 
             after(grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_3_3_0()); 

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
    // $ANTLR end "rule__Timer__MinutesAssignment_3_3_3"


    // $ANTLR start "rule__Timer__RepeattypeAssignment_3_4_0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3293:1: rule__Timer__RepeattypeAssignment_3_4_0 : ( ( 'EVERY WEDNESDAY at' ) ) ;
    public final void rule__Timer__RepeattypeAssignment_3_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3297:1: ( ( ( 'EVERY WEDNESDAY at' ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3298:1: ( ( 'EVERY WEDNESDAY at' ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3298:1: ( ( 'EVERY WEDNESDAY at' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3299:1: ( 'EVERY WEDNESDAY at' )
            {
             before(grammarAccess.getTimerAccess().getRepeattypeEVERYWEDNESDAYAtKeyword_3_4_0_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3300:1: ( 'EVERY WEDNESDAY at' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3301:1: 'EVERY WEDNESDAY at'
            {
             before(grammarAccess.getTimerAccess().getRepeattypeEVERYWEDNESDAYAtKeyword_3_4_0_0()); 
            match(input,38,FOLLOW_38_in_rule__Timer__RepeattypeAssignment_3_4_06599); 
             after(grammarAccess.getTimerAccess().getRepeattypeEVERYWEDNESDAYAtKeyword_3_4_0_0()); 

            }

             after(grammarAccess.getTimerAccess().getRepeattypeEVERYWEDNESDAYAtKeyword_3_4_0_0()); 

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
    // $ANTLR end "rule__Timer__RepeattypeAssignment_3_4_0"


    // $ANTLR start "rule__Timer__HoursAssignment_3_4_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3316:1: rule__Timer__HoursAssignment_3_4_1 : ( RULE_INT ) ;
    public final void rule__Timer__HoursAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3320:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3321:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3321:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3322:1: RULE_INT
            {
             before(grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_4_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Timer__HoursAssignment_3_4_16638); 
             after(grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_4_1_0()); 

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
    // $ANTLR end "rule__Timer__HoursAssignment_3_4_1"


    // $ANTLR start "rule__Timer__MinutesAssignment_3_4_3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3331:1: rule__Timer__MinutesAssignment_3_4_3 : ( RULE_INT ) ;
    public final void rule__Timer__MinutesAssignment_3_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3335:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3336:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3336:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3337:1: RULE_INT
            {
             before(grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_4_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Timer__MinutesAssignment_3_4_36669); 
             after(grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_4_3_0()); 

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
    // $ANTLR end "rule__Timer__MinutesAssignment_3_4_3"


    // $ANTLR start "rule__Timer__RepeattypeAssignment_3_5_0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3346:1: rule__Timer__RepeattypeAssignment_3_5_0 : ( ( 'EVERY THURSDAY at' ) ) ;
    public final void rule__Timer__RepeattypeAssignment_3_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3350:1: ( ( ( 'EVERY THURSDAY at' ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3351:1: ( ( 'EVERY THURSDAY at' ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3351:1: ( ( 'EVERY THURSDAY at' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3352:1: ( 'EVERY THURSDAY at' )
            {
             before(grammarAccess.getTimerAccess().getRepeattypeEVERYTHURSDAYAtKeyword_3_5_0_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3353:1: ( 'EVERY THURSDAY at' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3354:1: 'EVERY THURSDAY at'
            {
             before(grammarAccess.getTimerAccess().getRepeattypeEVERYTHURSDAYAtKeyword_3_5_0_0()); 
            match(input,39,FOLLOW_39_in_rule__Timer__RepeattypeAssignment_3_5_06705); 
             after(grammarAccess.getTimerAccess().getRepeattypeEVERYTHURSDAYAtKeyword_3_5_0_0()); 

            }

             after(grammarAccess.getTimerAccess().getRepeattypeEVERYTHURSDAYAtKeyword_3_5_0_0()); 

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
    // $ANTLR end "rule__Timer__RepeattypeAssignment_3_5_0"


    // $ANTLR start "rule__Timer__HoursAssignment_3_5_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3369:1: rule__Timer__HoursAssignment_3_5_1 : ( RULE_INT ) ;
    public final void rule__Timer__HoursAssignment_3_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3373:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3374:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3374:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3375:1: RULE_INT
            {
             before(grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_5_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Timer__HoursAssignment_3_5_16744); 
             after(grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_5_1_0()); 

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
    // $ANTLR end "rule__Timer__HoursAssignment_3_5_1"


    // $ANTLR start "rule__Timer__MinutesAssignment_3_5_3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3384:1: rule__Timer__MinutesAssignment_3_5_3 : ( RULE_INT ) ;
    public final void rule__Timer__MinutesAssignment_3_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3388:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3389:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3389:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3390:1: RULE_INT
            {
             before(grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_5_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Timer__MinutesAssignment_3_5_36775); 
             after(grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_5_3_0()); 

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
    // $ANTLR end "rule__Timer__MinutesAssignment_3_5_3"


    // $ANTLR start "rule__Timer__RepeattypeAssignment_3_6_0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3399:1: rule__Timer__RepeattypeAssignment_3_6_0 : ( ( 'EVERY FRIDAY at' ) ) ;
    public final void rule__Timer__RepeattypeAssignment_3_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3403:1: ( ( ( 'EVERY FRIDAY at' ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3404:1: ( ( 'EVERY FRIDAY at' ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3404:1: ( ( 'EVERY FRIDAY at' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3405:1: ( 'EVERY FRIDAY at' )
            {
             before(grammarAccess.getTimerAccess().getRepeattypeEVERYFRIDAYAtKeyword_3_6_0_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3406:1: ( 'EVERY FRIDAY at' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3407:1: 'EVERY FRIDAY at'
            {
             before(grammarAccess.getTimerAccess().getRepeattypeEVERYFRIDAYAtKeyword_3_6_0_0()); 
            match(input,40,FOLLOW_40_in_rule__Timer__RepeattypeAssignment_3_6_06811); 
             after(grammarAccess.getTimerAccess().getRepeattypeEVERYFRIDAYAtKeyword_3_6_0_0()); 

            }

             after(grammarAccess.getTimerAccess().getRepeattypeEVERYFRIDAYAtKeyword_3_6_0_0()); 

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
    // $ANTLR end "rule__Timer__RepeattypeAssignment_3_6_0"


    // $ANTLR start "rule__Timer__HoursAssignment_3_6_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3422:1: rule__Timer__HoursAssignment_3_6_1 : ( RULE_INT ) ;
    public final void rule__Timer__HoursAssignment_3_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3426:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3427:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3427:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3428:1: RULE_INT
            {
             before(grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_6_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Timer__HoursAssignment_3_6_16850); 
             after(grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_6_1_0()); 

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
    // $ANTLR end "rule__Timer__HoursAssignment_3_6_1"


    // $ANTLR start "rule__Timer__MinutesAssignment_3_6_3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3437:1: rule__Timer__MinutesAssignment_3_6_3 : ( RULE_INT ) ;
    public final void rule__Timer__MinutesAssignment_3_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3441:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3442:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3442:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3443:1: RULE_INT
            {
             before(grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_6_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Timer__MinutesAssignment_3_6_36881); 
             after(grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_6_3_0()); 

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
    // $ANTLR end "rule__Timer__MinutesAssignment_3_6_3"


    // $ANTLR start "rule__Timer__RepeattypeAssignment_3_7_0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3452:1: rule__Timer__RepeattypeAssignment_3_7_0 : ( ( 'EVERY SATURDAY at' ) ) ;
    public final void rule__Timer__RepeattypeAssignment_3_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3456:1: ( ( ( 'EVERY SATURDAY at' ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3457:1: ( ( 'EVERY SATURDAY at' ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3457:1: ( ( 'EVERY SATURDAY at' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3458:1: ( 'EVERY SATURDAY at' )
            {
             before(grammarAccess.getTimerAccess().getRepeattypeEVERYSATURDAYAtKeyword_3_7_0_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3459:1: ( 'EVERY SATURDAY at' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3460:1: 'EVERY SATURDAY at'
            {
             before(grammarAccess.getTimerAccess().getRepeattypeEVERYSATURDAYAtKeyword_3_7_0_0()); 
            match(input,41,FOLLOW_41_in_rule__Timer__RepeattypeAssignment_3_7_06917); 
             after(grammarAccess.getTimerAccess().getRepeattypeEVERYSATURDAYAtKeyword_3_7_0_0()); 

            }

             after(grammarAccess.getTimerAccess().getRepeattypeEVERYSATURDAYAtKeyword_3_7_0_0()); 

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
    // $ANTLR end "rule__Timer__RepeattypeAssignment_3_7_0"


    // $ANTLR start "rule__Timer__HoursAssignment_3_7_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3475:1: rule__Timer__HoursAssignment_3_7_1 : ( RULE_INT ) ;
    public final void rule__Timer__HoursAssignment_3_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3479:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3480:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3480:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3481:1: RULE_INT
            {
             before(grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_7_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Timer__HoursAssignment_3_7_16956); 
             after(grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_7_1_0()); 

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
    // $ANTLR end "rule__Timer__HoursAssignment_3_7_1"


    // $ANTLR start "rule__Timer__MinutesAssignment_3_7_3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3490:1: rule__Timer__MinutesAssignment_3_7_3 : ( RULE_INT ) ;
    public final void rule__Timer__MinutesAssignment_3_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3494:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3495:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3495:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3496:1: RULE_INT
            {
             before(grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_7_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Timer__MinutesAssignment_3_7_36987); 
             after(grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_7_3_0()); 

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
    // $ANTLR end "rule__Timer__MinutesAssignment_3_7_3"


    // $ANTLR start "rule__Timer__RepeattypeAssignment_3_8_0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3505:1: rule__Timer__RepeattypeAssignment_3_8_0 : ( ( 'EVERY SUNDAY at' ) ) ;
    public final void rule__Timer__RepeattypeAssignment_3_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3509:1: ( ( ( 'EVERY SUNDAY at' ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3510:1: ( ( 'EVERY SUNDAY at' ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3510:1: ( ( 'EVERY SUNDAY at' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3511:1: ( 'EVERY SUNDAY at' )
            {
             before(grammarAccess.getTimerAccess().getRepeattypeEVERYSUNDAYAtKeyword_3_8_0_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3512:1: ( 'EVERY SUNDAY at' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3513:1: 'EVERY SUNDAY at'
            {
             before(grammarAccess.getTimerAccess().getRepeattypeEVERYSUNDAYAtKeyword_3_8_0_0()); 
            match(input,42,FOLLOW_42_in_rule__Timer__RepeattypeAssignment_3_8_07023); 
             after(grammarAccess.getTimerAccess().getRepeattypeEVERYSUNDAYAtKeyword_3_8_0_0()); 

            }

             after(grammarAccess.getTimerAccess().getRepeattypeEVERYSUNDAYAtKeyword_3_8_0_0()); 

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
    // $ANTLR end "rule__Timer__RepeattypeAssignment_3_8_0"


    // $ANTLR start "rule__Timer__HoursAssignment_3_8_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3528:1: rule__Timer__HoursAssignment_3_8_1 : ( RULE_INT ) ;
    public final void rule__Timer__HoursAssignment_3_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3532:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3533:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3533:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3534:1: RULE_INT
            {
             before(grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_8_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Timer__HoursAssignment_3_8_17062); 
             after(grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_8_1_0()); 

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
    // $ANTLR end "rule__Timer__HoursAssignment_3_8_1"


    // $ANTLR start "rule__Timer__MinutesAssignment_3_8_3"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3543:1: rule__Timer__MinutesAssignment_3_8_3 : ( RULE_INT ) ;
    public final void rule__Timer__MinutesAssignment_3_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3547:1: ( ( RULE_INT ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3548:1: ( RULE_INT )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3548:1: ( RULE_INT )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:3549:1: RULE_INT
            {
             before(grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_8_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Timer__MinutesAssignment_3_8_37093); 
             after(grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_8_3_0()); 

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
    // $ANTLR end "rule__Timer__MinutesAssignment_3_8_3"

    // Delegated rules


 

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
    public static final BitSet FOLLOW_ruleTimer_in_entryRuleTimer481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimer488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group__0_in_ruleTimer514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Model__HardwareAlternatives_3_0551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Model__HardwareAlternatives_3_0571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensor_in_rule__AbstractDevice__Alternatives605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActuator_in_rule__AbstractDevice__Alternatives622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ChangeActuator__ActuatorStateAlternatives_2_0655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ChangeActuator__ActuatorStateAlternatives_2_0675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ChangeActuator__ActuatorStateAlternatives_2_0695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__TypeAssignment_3_0_in_rule__SensorListener__Alternatives_3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__TypeAssignment_3_1_in_rule__SensorListener__Alternatives_3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group_3_2__0_in_rule__SensorListener__Alternatives_3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_0__0_in_rule__Timer__Alternatives_3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_1__0_in_rule__Timer__Alternatives_3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_2__0_in_rule__Timer__Alternatives_3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_3__0_in_rule__Timer__Alternatives_3852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_4__0_in_rule__Timer__Alternatives_3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_5__0_in_rule__Timer__Alternatives_3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_6__0_in_rule__Timer__Alternatives_3906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_7__0_in_rule__Timer__Alternatives_3924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_8__0_in_rule__Timer__Alternatives_3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0973 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Model__Group__0__Impl1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11035 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21095 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Model__Group__2__Impl1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31157 = new BitSet(new long[]{0x0000000011340000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__HardwareAssignment_3_in_rule__Model__Group__3__Impl1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41217 = new BitSet(new long[]{0x0000000011340000L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DevicesAssignment_4_in_rule__Model__Group__4__Impl1247 = new BitSet(new long[]{0x0000000000140002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51278 = new BitSet(new long[]{0x0000000011340000L});
    public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__EventHandlersAssignment_5_in_rule__Model__Group__5__Impl1308 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61339 = new BitSet(new long[]{0x0000000011340000L});
    public static final BitSet FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SensorListenersAssignment_6_in_rule__Model__Group__6__Impl1369 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TimersAssignment_7_in_rule__Model__Group__7__Impl1427 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Sensor__Group__0__Impl_in_rule__Sensor__Group__01474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Sensor__Group__1_in_rule__Sensor__Group__01477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Sensor__Group__0__Impl1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sensor__Group__1__Impl_in_rule__Sensor__Group__11536 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Sensor__Group__2_in_rule__Sensor__Group__11539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sensor__NameAssignment_1_in_rule__Sensor__Group__1__Impl1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sensor__Group__2__Impl_in_rule__Sensor__Group__21596 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Sensor__Group__3_in_rule__Sensor__Group__21599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Sensor__Group__2__Impl1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sensor__Group__3__Impl_in_rule__Sensor__Group__31658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sensor__PinAssignment_3_in_rule__Sensor__Group__3__Impl1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actuator__Group__0__Impl_in_rule__Actuator__Group__01723 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Actuator__Group__1_in_rule__Actuator__Group__01726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Actuator__Group__0__Impl1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actuator__Group__1__Impl_in_rule__Actuator__Group__11785 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Actuator__Group__2_in_rule__Actuator__Group__11788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actuator__NameAssignment_1_in_rule__Actuator__Group__1__Impl1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actuator__Group__2__Impl_in_rule__Actuator__Group__21845 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Actuator__Group__3_in_rule__Actuator__Group__21848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Actuator__Group__2__Impl1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actuator__Group__3__Impl_in_rule__Actuator__Group__31907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actuator__PinAssignment_3_in_rule__Actuator__Group__3__Impl1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventHandler__Group__0__Impl_in_rule__EventHandler__Group__01972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EventHandler__Group__1_in_rule__EventHandler__Group__01975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EventHandler__Group__0__Impl2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventHandler__Group__1__Impl_in_rule__EventHandler__Group__12034 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__EventHandler__Group__2_in_rule__EventHandler__Group__12037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventHandler__NameAssignment_1_in_rule__EventHandler__Group__1__Impl2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventHandler__Group__2__Impl_in_rule__EventHandler__Group__22094 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__EventHandler__Group__3_in_rule__EventHandler__Group__22097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventHandler__ChangeActuatorsAssignment_2_in_rule__EventHandler__Group__2__Impl2124 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__EventHandler__Group__3__Impl_in_rule__EventHandler__Group__32155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EventHandler__Group__3__Impl2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeActuator__Group__0__Impl_in_rule__ChangeActuator__Group__02222 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ChangeActuator__Group__1_in_rule__ChangeActuator__Group__02225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeActuator__ActuatorAssignment_0_in_rule__ChangeActuator__Group__0__Impl2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeActuator__Group__1__Impl_in_rule__ChangeActuator__Group__12282 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_rule__ChangeActuator__Group__2_in_rule__ChangeActuator__Group__12285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ChangeActuator__Group__1__Impl2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeActuator__Group__2__Impl_in_rule__ChangeActuator__Group__22344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeActuator__ActuatorStateAssignment_2_in_rule__ChangeActuator__Group__2__Impl2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__0__Impl_in_rule__SensorListener__Group__02407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__1_in_rule__SensorListener__Group__02410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SensorListener__Group__0__Impl2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__1__Impl_in_rule__SensorListener__Group__12469 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__2_in_rule__SensorListener__Group__12472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__SensorAssignment_1_in_rule__SensorListener__Group__1__Impl2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__2__Impl_in_rule__SensorListener__Group__22529 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__3_in_rule__SensorListener__Group__22532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SensorListener__Group__2__Impl2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__3__Impl_in_rule__SensorListener__Group__32591 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__4_in_rule__SensorListener__Group__32594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Alternatives_3_in_rule__SensorListener__Group__3__Impl2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__4__Impl_in_rule__SensorListener__Group__42651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__5_in_rule__SensorListener__Group__42654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SensorListener__Group__4__Impl2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group__5__Impl_in_rule__SensorListener__Group__52713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__EventHandlerAssignment_5_in_rule__SensorListener__Group__5__Impl2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group_3_2__0__Impl_in_rule__SensorListener__Group_3_2__02782 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SensorListener__Group_3_2__1_in_rule__SensorListener__Group_3_2__02785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__TypeAssignment_3_2_0_in_rule__SensorListener__Group_3_2__0__Impl2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group_3_2__1__Impl_in_rule__SensorListener__Group_3_2__12842 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__SensorListener__Group_3_2__2_in_rule__SensorListener__Group_3_2__12845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__LAssignment_3_2_1_in_rule__SensorListener__Group_3_2__1__Impl2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group_3_2__2__Impl_in_rule__SensorListener__Group_3_2__22902 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SensorListener__Group_3_2__3_in_rule__SensorListener__Group_3_2__22905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SensorListener__Group_3_2__2__Impl2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__Group_3_2__3__Impl_in_rule__SensorListener__Group_3_2__32964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SensorListener__HAssignment_3_2_3_in_rule__SensorListener__Group_3_2__3__Impl2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group__0__Impl_in_rule__Timer__Group__03029 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Timer__Group__1_in_rule__Timer__Group__03032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Timer__Group__0__Impl3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group__1__Impl_in_rule__Timer__Group__13091 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Timer__Group__2_in_rule__Timer__Group__13094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__EventHandlerAssignment_1_in_rule__Timer__Group__1__Impl3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group__2__Impl_in_rule__Timer__Group__23151 = new BitSet(new long[]{0x000007FC00000000L});
    public static final BitSet FOLLOW_rule__Timer__Group__3_in_rule__Timer__Group__23154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Timer__Group__2__Impl3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group__3__Impl_in_rule__Timer__Group__33213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Alternatives_3_in_rule__Timer__Group__3__Impl3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_0__0__Impl_in_rule__Timer__Group_3_0__03278 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_0__1_in_rule__Timer__Group_3_0__03281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__RepeattypeAssignment_3_0_0_in_rule__Timer__Group_3_0__0__Impl3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_0__1__Impl_in_rule__Timer__Group_3_0__13338 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_0__2_in_rule__Timer__Group_3_0__13341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__SecsAssignment_3_0_1_in_rule__Timer__Group_3_0__1__Impl3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_0__2__Impl_in_rule__Timer__Group_3_0__23398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Timer__Group_3_0__2__Impl3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_1__0__Impl_in_rule__Timer__Group_3_1__03463 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_1__1_in_rule__Timer__Group_3_1__03466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__RepeattypeAssignment_3_1_0_in_rule__Timer__Group_3_1__0__Impl3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_1__1__Impl_in_rule__Timer__Group_3_1__13523 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_1__2_in_rule__Timer__Group_3_1__13526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__HoursAssignment_3_1_1_in_rule__Timer__Group_3_1__1__Impl3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_1__2__Impl_in_rule__Timer__Group_3_1__23583 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_1__3_in_rule__Timer__Group_3_1__23586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Timer__Group_3_1__2__Impl3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_1__3__Impl_in_rule__Timer__Group_3_1__33645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__MinutesAssignment_3_1_3_in_rule__Timer__Group_3_1__3__Impl3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_2__0__Impl_in_rule__Timer__Group_3_2__03710 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_2__1_in_rule__Timer__Group_3_2__03713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__RepeattypeAssignment_3_2_0_in_rule__Timer__Group_3_2__0__Impl3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_2__1__Impl_in_rule__Timer__Group_3_2__13770 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_2__2_in_rule__Timer__Group_3_2__13773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__HoursAssignment_3_2_1_in_rule__Timer__Group_3_2__1__Impl3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_2__2__Impl_in_rule__Timer__Group_3_2__23830 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_2__3_in_rule__Timer__Group_3_2__23833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Timer__Group_3_2__2__Impl3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_2__3__Impl_in_rule__Timer__Group_3_2__33892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__MinutesAssignment_3_2_3_in_rule__Timer__Group_3_2__3__Impl3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_3__0__Impl_in_rule__Timer__Group_3_3__03957 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_3__1_in_rule__Timer__Group_3_3__03960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__RepeattypeAssignment_3_3_0_in_rule__Timer__Group_3_3__0__Impl3987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_3__1__Impl_in_rule__Timer__Group_3_3__14017 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_3__2_in_rule__Timer__Group_3_3__14020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__HoursAssignment_3_3_1_in_rule__Timer__Group_3_3__1__Impl4047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_3__2__Impl_in_rule__Timer__Group_3_3__24077 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_3__3_in_rule__Timer__Group_3_3__24080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Timer__Group_3_3__2__Impl4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_3__3__Impl_in_rule__Timer__Group_3_3__34139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__MinutesAssignment_3_3_3_in_rule__Timer__Group_3_3__3__Impl4166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_4__0__Impl_in_rule__Timer__Group_3_4__04204 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_4__1_in_rule__Timer__Group_3_4__04207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__RepeattypeAssignment_3_4_0_in_rule__Timer__Group_3_4__0__Impl4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_4__1__Impl_in_rule__Timer__Group_3_4__14264 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_4__2_in_rule__Timer__Group_3_4__14267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__HoursAssignment_3_4_1_in_rule__Timer__Group_3_4__1__Impl4294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_4__2__Impl_in_rule__Timer__Group_3_4__24324 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_4__3_in_rule__Timer__Group_3_4__24327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Timer__Group_3_4__2__Impl4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_4__3__Impl_in_rule__Timer__Group_3_4__34386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__MinutesAssignment_3_4_3_in_rule__Timer__Group_3_4__3__Impl4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_5__0__Impl_in_rule__Timer__Group_3_5__04451 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_5__1_in_rule__Timer__Group_3_5__04454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__RepeattypeAssignment_3_5_0_in_rule__Timer__Group_3_5__0__Impl4481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_5__1__Impl_in_rule__Timer__Group_3_5__14511 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_5__2_in_rule__Timer__Group_3_5__14514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__HoursAssignment_3_5_1_in_rule__Timer__Group_3_5__1__Impl4541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_5__2__Impl_in_rule__Timer__Group_3_5__24571 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_5__3_in_rule__Timer__Group_3_5__24574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Timer__Group_3_5__2__Impl4602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_5__3__Impl_in_rule__Timer__Group_3_5__34633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__MinutesAssignment_3_5_3_in_rule__Timer__Group_3_5__3__Impl4660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_6__0__Impl_in_rule__Timer__Group_3_6__04698 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_6__1_in_rule__Timer__Group_3_6__04701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__RepeattypeAssignment_3_6_0_in_rule__Timer__Group_3_6__0__Impl4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_6__1__Impl_in_rule__Timer__Group_3_6__14758 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_6__2_in_rule__Timer__Group_3_6__14761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__HoursAssignment_3_6_1_in_rule__Timer__Group_3_6__1__Impl4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_6__2__Impl_in_rule__Timer__Group_3_6__24818 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_6__3_in_rule__Timer__Group_3_6__24821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Timer__Group_3_6__2__Impl4849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_6__3__Impl_in_rule__Timer__Group_3_6__34880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__MinutesAssignment_3_6_3_in_rule__Timer__Group_3_6__3__Impl4907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_7__0__Impl_in_rule__Timer__Group_3_7__04945 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_7__1_in_rule__Timer__Group_3_7__04948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__RepeattypeAssignment_3_7_0_in_rule__Timer__Group_3_7__0__Impl4975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_7__1__Impl_in_rule__Timer__Group_3_7__15005 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_7__2_in_rule__Timer__Group_3_7__15008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__HoursAssignment_3_7_1_in_rule__Timer__Group_3_7__1__Impl5035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_7__2__Impl_in_rule__Timer__Group_3_7__25065 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_7__3_in_rule__Timer__Group_3_7__25068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Timer__Group_3_7__2__Impl5096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_7__3__Impl_in_rule__Timer__Group_3_7__35127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__MinutesAssignment_3_7_3_in_rule__Timer__Group_3_7__3__Impl5154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_8__0__Impl_in_rule__Timer__Group_3_8__05192 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_8__1_in_rule__Timer__Group_3_8__05195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__RepeattypeAssignment_3_8_0_in_rule__Timer__Group_3_8__0__Impl5222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_8__1__Impl_in_rule__Timer__Group_3_8__15252 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_8__2_in_rule__Timer__Group_3_8__15255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__HoursAssignment_3_8_1_in_rule__Timer__Group_3_8__1__Impl5282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_8__2__Impl_in_rule__Timer__Group_3_8__25312 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_8__3_in_rule__Timer__Group_3_8__25315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Timer__Group_3_8__2__Impl5343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__Group_3_8__3__Impl_in_rule__Timer__Group_3_8__35374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timer__MinutesAssignment_3_8_3_in_rule__Timer__Group_3_8__3__Impl5401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_15444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__HardwareAlternatives_3_0_in_rule__Model__HardwareAssignment_35475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDevice_in_rule__Model__DevicesAssignment_45508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventHandler_in_rule__Model__EventHandlersAssignment_55539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorListener_in_rule__Model__SensorListenersAssignment_65570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimer_in_rule__Model__TimersAssignment_75601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Sensor__NameAssignment_15632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Sensor__PinAssignment_35663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Actuator__NameAssignment_15694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Actuator__PinAssignment_35725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EventHandler__NameAssignment_15756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChangeActuator_in_rule__EventHandler__ChangeActuatorsAssignment_25787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ChangeActuator__ActuatorAssignment_05822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeActuator__ActuatorStateAlternatives_2_0_in_rule__ChangeActuator__ActuatorStateAssignment_25857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SensorListener__SensorAssignment_15894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SensorListener__TypeAssignment_3_05934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__SensorListener__TypeAssignment_3_15978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__SensorListener__TypeAssignment_3_2_06022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SensorListener__LAssignment_3_2_16061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SensorListener__HAssignment_3_2_36092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SensorListener__EventHandlerAssignment_56127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Timer__EventHandlerAssignment_16166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Timer__RepeattypeAssignment_3_0_06206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Timer__SecsAssignment_3_0_16245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Timer__RepeattypeAssignment_3_1_06281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Timer__HoursAssignment_3_1_16320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Timer__MinutesAssignment_3_1_36351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Timer__RepeattypeAssignment_3_2_06387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Timer__HoursAssignment_3_2_16426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Timer__MinutesAssignment_3_2_36457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Timer__RepeattypeAssignment_3_3_06493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Timer__HoursAssignment_3_3_16532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Timer__MinutesAssignment_3_3_36563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Timer__RepeattypeAssignment_3_4_06599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Timer__HoursAssignment_3_4_16638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Timer__MinutesAssignment_3_4_36669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Timer__RepeattypeAssignment_3_5_06705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Timer__HoursAssignment_3_5_16744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Timer__MinutesAssignment_3_5_36775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Timer__RepeattypeAssignment_3_6_06811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Timer__HoursAssignment_3_6_16850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Timer__MinutesAssignment_3_6_36881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Timer__RepeattypeAssignment_3_7_06917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Timer__HoursAssignment_3_7_16956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Timer__MinutesAssignment_3_7_36987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Timer__RepeattypeAssignment_3_8_07023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Timer__HoursAssignment_3_8_17062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Timer__MinutesAssignment_3_8_37093 = new BitSet(new long[]{0x0000000000000002L});

}