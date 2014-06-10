package es.usj.raspduino.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.usj.raspduino.services.RaspduinoDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRaspduinoDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Sketch:'", "'Hardware:'", "'Arduino UNO'", "'Raspberry Pi'", "'Sensor'", "'pin'", "'Actuator'", "'EventHandler'", "';'", "':'", "'On'", "'Off'", "'Toggle'", "'SensorListener'", "'if'", "'ON'", "'OFF'", "'BETWEEN'", "'AND'", "'call'", "'Timer action'", "'repeat'", "'EVERY INTERVAL of'", "'seconds'", "'EVERY DAY at'", "'EVERY MONDAY at'", "'EVERY TUESDAY at'", "'EVERY WEDNESDAY at'", "'EVERY THURSDAY at'", "'EVERY FRIDAY at'", "'EVERY SATURDAY at'", "'EVERY SUNDAY at'"
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
    public String getGrammarFileName() { return "../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g"; }



     	private RaspduinoDSLGrammarAccess grammarAccess;
     	
        public InternalRaspduinoDSLParser(TokenStream input, RaspduinoDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected RaspduinoDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Sketch:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Hardware:' ( ( (lv_hardware_3_1= 'Arduino UNO' | lv_hardware_3_2= 'Raspberry Pi' ) ) ) ( (lv_devices_4_0= ruleAbstractDevice ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* ( (lv_sensorListeners_6_0= ruleSensorListener ) )* ( (lv_timers_7_0= ruleTimer ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_hardware_3_1=null;
        Token lv_hardware_3_2=null;
        EObject lv_devices_4_0 = null;

        EObject lv_eventHandlers_5_0 = null;

        EObject lv_sensorListeners_6_0 = null;

        EObject lv_timers_7_0 = null;


         enterRule(); 
            
        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:79:28: ( (otherlv_0= 'Sketch:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Hardware:' ( ( (lv_hardware_3_1= 'Arduino UNO' | lv_hardware_3_2= 'Raspberry Pi' ) ) ) ( (lv_devices_4_0= ruleAbstractDevice ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* ( (lv_sensorListeners_6_0= ruleSensorListener ) )* ( (lv_timers_7_0= ruleTimer ) )* ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:80:1: (otherlv_0= 'Sketch:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Hardware:' ( ( (lv_hardware_3_1= 'Arduino UNO' | lv_hardware_3_2= 'Raspberry Pi' ) ) ) ( (lv_devices_4_0= ruleAbstractDevice ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* ( (lv_sensorListeners_6_0= ruleSensorListener ) )* ( (lv_timers_7_0= ruleTimer ) )* )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:80:1: (otherlv_0= 'Sketch:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Hardware:' ( ( (lv_hardware_3_1= 'Arduino UNO' | lv_hardware_3_2= 'Raspberry Pi' ) ) ) ( (lv_devices_4_0= ruleAbstractDevice ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* ( (lv_sensorListeners_6_0= ruleSensorListener ) )* ( (lv_timers_7_0= ruleTimer ) )* )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:80:3: otherlv_0= 'Sketch:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Hardware:' ( ( (lv_hardware_3_1= 'Arduino UNO' | lv_hardware_3_2= 'Raspberry Pi' ) ) ) ( (lv_devices_4_0= ruleAbstractDevice ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* ( (lv_sensorListeners_6_0= ruleSensorListener ) )* ( (lv_timers_7_0= ruleTimer ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getSketchKeyword_0());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:85:1: (lv_name_1_0= RULE_ID )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModel139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleModel156); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getHardwareKeyword_2());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:106:1: ( ( (lv_hardware_3_1= 'Arduino UNO' | lv_hardware_3_2= 'Raspberry Pi' ) ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:107:1: ( (lv_hardware_3_1= 'Arduino UNO' | lv_hardware_3_2= 'Raspberry Pi' ) )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:107:1: ( (lv_hardware_3_1= 'Arduino UNO' | lv_hardware_3_2= 'Raspberry Pi' ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:108:1: (lv_hardware_3_1= 'Arduino UNO' | lv_hardware_3_2= 'Raspberry Pi' )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:108:1: (lv_hardware_3_1= 'Arduino UNO' | lv_hardware_3_2= 'Raspberry Pi' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:109:3: lv_hardware_3_1= 'Arduino UNO'
                    {
                    lv_hardware_3_1=(Token)match(input,13,FOLLOW_13_in_ruleModel176); 

                            newLeafNode(lv_hardware_3_1, grammarAccess.getModelAccess().getHardwareArduinoUNOKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModelRule());
                    	        }
                           		setWithLastConsumed(current, "hardware", lv_hardware_3_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:121:8: lv_hardware_3_2= 'Raspberry Pi'
                    {
                    lv_hardware_3_2=(Token)match(input,14,FOLLOW_14_in_ruleModel205); 

                            newLeafNode(lv_hardware_3_2, grammarAccess.getModelAccess().getHardwareRaspberryPiKeyword_3_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModelRule());
                    	        }
                           		setWithLastConsumed(current, "hardware", lv_hardware_3_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:136:2: ( (lv_devices_4_0= ruleAbstractDevice ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15||LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:137:1: (lv_devices_4_0= ruleAbstractDevice )
            	    {
            	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:137:1: (lv_devices_4_0= ruleAbstractDevice )
            	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:138:3: lv_devices_4_0= ruleAbstractDevice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDevicesAbstractDeviceParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractDevice_in_ruleModel242);
            	    lv_devices_4_0=ruleAbstractDevice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"devices",
            	            		lv_devices_4_0, 
            	            		"AbstractDevice");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:154:3: ( (lv_eventHandlers_5_0= ruleEventHandler ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:155:1: (lv_eventHandlers_5_0= ruleEventHandler )
            	    {
            	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:155:1: (lv_eventHandlers_5_0= ruleEventHandler )
            	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:156:3: lv_eventHandlers_5_0= ruleEventHandler
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getEventHandlersEventHandlerParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEventHandler_in_ruleModel264);
            	    lv_eventHandlers_5_0=ruleEventHandler();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"eventHandlers",
            	            		lv_eventHandlers_5_0, 
            	            		"EventHandler");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:172:3: ( (lv_sensorListeners_6_0= ruleSensorListener ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:173:1: (lv_sensorListeners_6_0= ruleSensorListener )
            	    {
            	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:173:1: (lv_sensorListeners_6_0= ruleSensorListener )
            	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:174:3: lv_sensorListeners_6_0= ruleSensorListener
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getSensorListenersSensorListenerParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSensorListener_in_ruleModel286);
            	    lv_sensorListeners_6_0=ruleSensorListener();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sensorListeners",
            	            		lv_sensorListeners_6_0, 
            	            		"SensorListener");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:190:3: ( (lv_timers_7_0= ruleTimer ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==31) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:191:1: (lv_timers_7_0= ruleTimer )
            	    {
            	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:191:1: (lv_timers_7_0= ruleTimer )
            	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:192:3: lv_timers_7_0= ruleTimer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getTimersTimerParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTimer_in_ruleModel308);
            	    lv_timers_7_0=ruleTimer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"timers",
            	            		lv_timers_7_0, 
            	            		"Timer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAbstractDevice"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:216:1: entryRuleAbstractDevice returns [EObject current=null] : iv_ruleAbstractDevice= ruleAbstractDevice EOF ;
    public final EObject entryRuleAbstractDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDevice = null;


        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:217:2: (iv_ruleAbstractDevice= ruleAbstractDevice EOF )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:218:2: iv_ruleAbstractDevice= ruleAbstractDevice EOF
            {
             newCompositeNode(grammarAccess.getAbstractDeviceRule()); 
            pushFollow(FOLLOW_ruleAbstractDevice_in_entryRuleAbstractDevice345);
            iv_ruleAbstractDevice=ruleAbstractDevice();

            state._fsp--;

             current =iv_ruleAbstractDevice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDevice355); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractDevice"


    // $ANTLR start "ruleAbstractDevice"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:225:1: ruleAbstractDevice returns [EObject current=null] : (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ;
    public final EObject ruleAbstractDevice() throws RecognitionException {
        EObject current = null;

        EObject this_Sensor_0 = null;

        EObject this_Actuator_1 = null;


         enterRule(); 
            
        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:228:28: ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:229:1: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:229:1: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:230:5: this_Sensor_0= ruleSensor
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDeviceAccess().getSensorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSensor_in_ruleAbstractDevice402);
                    this_Sensor_0=ruleSensor();

                    state._fsp--;

                     
                            current = this_Sensor_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:240:5: this_Actuator_1= ruleActuator
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDeviceAccess().getActuatorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleActuator_in_ruleAbstractDevice429);
                    this_Actuator_1=ruleActuator();

                    state._fsp--;

                     
                            current = this_Actuator_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractDevice"


    // $ANTLR start "entryRuleSensor"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:256:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:257:2: (iv_ruleSensor= ruleSensor EOF )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:258:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_ruleSensor_in_entryRuleSensor464);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSensor474); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:265:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'pin' ( (lv_pin_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_pin_3_0=null;

         enterRule(); 
            
        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:268:28: ( (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'pin' ( (lv_pin_3_0= RULE_STRING ) ) ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:269:1: (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'pin' ( (lv_pin_3_0= RULE_STRING ) ) )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:269:1: (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'pin' ( (lv_pin_3_0= RULE_STRING ) ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:269:3: otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'pin' ( (lv_pin_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSensor511); 

                	newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:273:1: ( (lv_name_1_0= RULE_ID ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:274:1: (lv_name_1_0= RULE_ID )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:274:1: (lv_name_1_0= RULE_ID )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:275:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSensor528); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSensorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSensor545); 

                	newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getPinKeyword_2());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:295:1: ( (lv_pin_3_0= RULE_STRING ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:296:1: (lv_pin_3_0= RULE_STRING )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:296:1: (lv_pin_3_0= RULE_STRING )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:297:3: lv_pin_3_0= RULE_STRING
            {
            lv_pin_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSensor562); 

            			newLeafNode(lv_pin_3_0, grammarAccess.getSensorAccess().getPinSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSensorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"pin",
                    		lv_pin_3_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleActuator"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:321:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:322:2: (iv_ruleActuator= ruleActuator EOF )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:323:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_ruleActuator_in_entryRuleActuator603);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActuator613); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:330:1: ruleActuator returns [EObject current=null] : (otherlv_0= 'Actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'pin' ( (lv_pin_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_pin_3_0=null;

         enterRule(); 
            
        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:333:28: ( (otherlv_0= 'Actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'pin' ( (lv_pin_3_0= RULE_STRING ) ) ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:334:1: (otherlv_0= 'Actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'pin' ( (lv_pin_3_0= RULE_STRING ) ) )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:334:1: (otherlv_0= 'Actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'pin' ( (lv_pin_3_0= RULE_STRING ) ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:334:3: otherlv_0= 'Actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'pin' ( (lv_pin_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleActuator650); 

                	newLeafNode(otherlv_0, grammarAccess.getActuatorAccess().getActuatorKeyword_0());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:338:1: ( (lv_name_1_0= RULE_ID ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:339:1: (lv_name_1_0= RULE_ID )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:339:1: (lv_name_1_0= RULE_ID )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:340:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActuator667); 

            			newLeafNode(lv_name_1_0, grammarAccess.getActuatorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActuatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleActuator684); 

                	newLeafNode(otherlv_2, grammarAccess.getActuatorAccess().getPinKeyword_2());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:360:1: ( (lv_pin_3_0= RULE_STRING ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:361:1: (lv_pin_3_0= RULE_STRING )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:361:1: (lv_pin_3_0= RULE_STRING )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:362:3: lv_pin_3_0= RULE_STRING
            {
            lv_pin_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActuator701); 

            			newLeafNode(lv_pin_3_0, grammarAccess.getActuatorAccess().getPinSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActuatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"pin",
                    		lv_pin_3_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleEventHandler"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:386:1: entryRuleEventHandler returns [EObject current=null] : iv_ruleEventHandler= ruleEventHandler EOF ;
    public final EObject entryRuleEventHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventHandler = null;


        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:387:2: (iv_ruleEventHandler= ruleEventHandler EOF )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:388:2: iv_ruleEventHandler= ruleEventHandler EOF
            {
             newCompositeNode(grammarAccess.getEventHandlerRule()); 
            pushFollow(FOLLOW_ruleEventHandler_in_entryRuleEventHandler742);
            iv_ruleEventHandler=ruleEventHandler();

            state._fsp--;

             current =iv_ruleEventHandler; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventHandler752); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventHandler"


    // $ANTLR start "ruleEventHandler"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:395:1: ruleEventHandler returns [EObject current=null] : (otherlv_0= 'EventHandler' ( (lv_name_1_0= RULE_ID ) ) ( (lv_changeActuators_2_0= ruleChangeActuator ) )* otherlv_3= ';' ) ;
    public final EObject ruleEventHandler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_changeActuators_2_0 = null;


         enterRule(); 
            
        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:398:28: ( (otherlv_0= 'EventHandler' ( (lv_name_1_0= RULE_ID ) ) ( (lv_changeActuators_2_0= ruleChangeActuator ) )* otherlv_3= ';' ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:399:1: (otherlv_0= 'EventHandler' ( (lv_name_1_0= RULE_ID ) ) ( (lv_changeActuators_2_0= ruleChangeActuator ) )* otherlv_3= ';' )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:399:1: (otherlv_0= 'EventHandler' ( (lv_name_1_0= RULE_ID ) ) ( (lv_changeActuators_2_0= ruleChangeActuator ) )* otherlv_3= ';' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:399:3: otherlv_0= 'EventHandler' ( (lv_name_1_0= RULE_ID ) ) ( (lv_changeActuators_2_0= ruleChangeActuator ) )* otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleEventHandler789); 

                	newLeafNode(otherlv_0, grammarAccess.getEventHandlerAccess().getEventHandlerKeyword_0());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:403:1: ( (lv_name_1_0= RULE_ID ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:404:1: (lv_name_1_0= RULE_ID )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:404:1: (lv_name_1_0= RULE_ID )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:405:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventHandler806); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEventHandlerAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventHandlerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:421:2: ( (lv_changeActuators_2_0= ruleChangeActuator ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:422:1: (lv_changeActuators_2_0= ruleChangeActuator )
            	    {
            	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:422:1: (lv_changeActuators_2_0= ruleChangeActuator )
            	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:423:3: lv_changeActuators_2_0= ruleChangeActuator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEventHandlerAccess().getChangeActuatorsChangeActuatorParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChangeActuator_in_ruleEventHandler832);
            	    lv_changeActuators_2_0=ruleChangeActuator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEventHandlerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"changeActuators",
            	            		lv_changeActuators_2_0, 
            	            		"ChangeActuator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleEventHandler845); 

                	newLeafNode(otherlv_3, grammarAccess.getEventHandlerAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventHandler"


    // $ANTLR start "entryRuleChangeActuator"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:451:1: entryRuleChangeActuator returns [EObject current=null] : iv_ruleChangeActuator= ruleChangeActuator EOF ;
    public final EObject entryRuleChangeActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeActuator = null;


        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:452:2: (iv_ruleChangeActuator= ruleChangeActuator EOF )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:453:2: iv_ruleChangeActuator= ruleChangeActuator EOF
            {
             newCompositeNode(grammarAccess.getChangeActuatorRule()); 
            pushFollow(FOLLOW_ruleChangeActuator_in_entryRuleChangeActuator881);
            iv_ruleChangeActuator=ruleChangeActuator();

            state._fsp--;

             current =iv_ruleChangeActuator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChangeActuator891); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChangeActuator"


    // $ANTLR start "ruleChangeActuator"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:460:1: ruleChangeActuator returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_ActuatorState_2_1= 'On' | lv_ActuatorState_2_2= 'Off' | lv_ActuatorState_2_3= 'Toggle' ) ) ) ) ;
    public final EObject ruleChangeActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ActuatorState_2_1=null;
        Token lv_ActuatorState_2_2=null;
        Token lv_ActuatorState_2_3=null;

         enterRule(); 
            
        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:463:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_ActuatorState_2_1= 'On' | lv_ActuatorState_2_2= 'Off' | lv_ActuatorState_2_3= 'Toggle' ) ) ) ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:464:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_ActuatorState_2_1= 'On' | lv_ActuatorState_2_2= 'Off' | lv_ActuatorState_2_3= 'Toggle' ) ) ) )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:464:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_ActuatorState_2_1= 'On' | lv_ActuatorState_2_2= 'Off' | lv_ActuatorState_2_3= 'Toggle' ) ) ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:464:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_ActuatorState_2_1= 'On' | lv_ActuatorState_2_2= 'Off' | lv_ActuatorState_2_3= 'Toggle' ) ) )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:464:2: ( (otherlv_0= RULE_ID ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:465:1: (otherlv_0= RULE_ID )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:465:1: (otherlv_0= RULE_ID )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:466:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChangeActuatorRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChangeActuator936); 

            		newLeafNode(otherlv_0, grammarAccess.getChangeActuatorAccess().getActuatorActuatorCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleChangeActuator948); 

                	newLeafNode(otherlv_1, grammarAccess.getChangeActuatorAccess().getColonKeyword_1());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:481:1: ( ( (lv_ActuatorState_2_1= 'On' | lv_ActuatorState_2_2= 'Off' | lv_ActuatorState_2_3= 'Toggle' ) ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:482:1: ( (lv_ActuatorState_2_1= 'On' | lv_ActuatorState_2_2= 'Off' | lv_ActuatorState_2_3= 'Toggle' ) )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:482:1: ( (lv_ActuatorState_2_1= 'On' | lv_ActuatorState_2_2= 'Off' | lv_ActuatorState_2_3= 'Toggle' ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:483:1: (lv_ActuatorState_2_1= 'On' | lv_ActuatorState_2_2= 'Off' | lv_ActuatorState_2_3= 'Toggle' )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:483:1: (lv_ActuatorState_2_1= 'On' | lv_ActuatorState_2_2= 'Off' | lv_ActuatorState_2_3= 'Toggle' )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:484:3: lv_ActuatorState_2_1= 'On'
                    {
                    lv_ActuatorState_2_1=(Token)match(input,21,FOLLOW_21_in_ruleChangeActuator968); 

                            newLeafNode(lv_ActuatorState_2_1, grammarAccess.getChangeActuatorAccess().getActuatorStateOnKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChangeActuatorRule());
                    	        }
                           		setWithLastConsumed(current, "ActuatorState", lv_ActuatorState_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:496:8: lv_ActuatorState_2_2= 'Off'
                    {
                    lv_ActuatorState_2_2=(Token)match(input,22,FOLLOW_22_in_ruleChangeActuator997); 

                            newLeafNode(lv_ActuatorState_2_2, grammarAccess.getChangeActuatorAccess().getActuatorStateOffKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChangeActuatorRule());
                    	        }
                           		setWithLastConsumed(current, "ActuatorState", lv_ActuatorState_2_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:508:8: lv_ActuatorState_2_3= 'Toggle'
                    {
                    lv_ActuatorState_2_3=(Token)match(input,23,FOLLOW_23_in_ruleChangeActuator1026); 

                            newLeafNode(lv_ActuatorState_2_3, grammarAccess.getChangeActuatorAccess().getActuatorStateToggleKeyword_2_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChangeActuatorRule());
                    	        }
                           		setWithLastConsumed(current, "ActuatorState", lv_ActuatorState_2_3, null);
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChangeActuator"


    // $ANTLR start "entryRuleSensorListener"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:531:1: entryRuleSensorListener returns [EObject current=null] : iv_ruleSensorListener= ruleSensorListener EOF ;
    public final EObject entryRuleSensorListener() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorListener = null;


        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:532:2: (iv_ruleSensorListener= ruleSensorListener EOF )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:533:2: iv_ruleSensorListener= ruleSensorListener EOF
            {
             newCompositeNode(grammarAccess.getSensorListenerRule()); 
            pushFollow(FOLLOW_ruleSensorListener_in_entryRuleSensorListener1078);
            iv_ruleSensorListener=ruleSensorListener();

            state._fsp--;

             current =iv_ruleSensorListener; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSensorListener1088); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensorListener"


    // $ANTLR start "ruleSensorListener"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:540:1: ruleSensorListener returns [EObject current=null] : (otherlv_0= 'SensorListener' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'if' ( ( (lv_type_3_0= 'ON' ) ) | ( (lv_type_4_0= 'OFF' ) ) | ( ( (lv_type_5_0= 'BETWEEN' ) ) ( (lv_l_6_0= RULE_INT ) ) otherlv_7= 'AND' ( (lv_h_8_0= RULE_INT ) ) ) ) otherlv_9= 'call' ( (otherlv_10= RULE_ID ) ) ) ;
    public final EObject ruleSensorListener() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;
        Token lv_type_4_0=null;
        Token lv_type_5_0=null;
        Token lv_l_6_0=null;
        Token otherlv_7=null;
        Token lv_h_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:543:28: ( (otherlv_0= 'SensorListener' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'if' ( ( (lv_type_3_0= 'ON' ) ) | ( (lv_type_4_0= 'OFF' ) ) | ( ( (lv_type_5_0= 'BETWEEN' ) ) ( (lv_l_6_0= RULE_INT ) ) otherlv_7= 'AND' ( (lv_h_8_0= RULE_INT ) ) ) ) otherlv_9= 'call' ( (otherlv_10= RULE_ID ) ) ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:544:1: (otherlv_0= 'SensorListener' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'if' ( ( (lv_type_3_0= 'ON' ) ) | ( (lv_type_4_0= 'OFF' ) ) | ( ( (lv_type_5_0= 'BETWEEN' ) ) ( (lv_l_6_0= RULE_INT ) ) otherlv_7= 'AND' ( (lv_h_8_0= RULE_INT ) ) ) ) otherlv_9= 'call' ( (otherlv_10= RULE_ID ) ) )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:544:1: (otherlv_0= 'SensorListener' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'if' ( ( (lv_type_3_0= 'ON' ) ) | ( (lv_type_4_0= 'OFF' ) ) | ( ( (lv_type_5_0= 'BETWEEN' ) ) ( (lv_l_6_0= RULE_INT ) ) otherlv_7= 'AND' ( (lv_h_8_0= RULE_INT ) ) ) ) otherlv_9= 'call' ( (otherlv_10= RULE_ID ) ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:544:3: otherlv_0= 'SensorListener' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'if' ( ( (lv_type_3_0= 'ON' ) ) | ( (lv_type_4_0= 'OFF' ) ) | ( ( (lv_type_5_0= 'BETWEEN' ) ) ( (lv_l_6_0= RULE_INT ) ) otherlv_7= 'AND' ( (lv_h_8_0= RULE_INT ) ) ) ) otherlv_9= 'call' ( (otherlv_10= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleSensorListener1125); 

                	newLeafNode(otherlv_0, grammarAccess.getSensorListenerAccess().getSensorListenerKeyword_0());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:548:1: ( (otherlv_1= RULE_ID ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:549:1: (otherlv_1= RULE_ID )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:549:1: (otherlv_1= RULE_ID )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:550:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSensorListenerRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSensorListener1145); 

            		newLeafNode(otherlv_1, grammarAccess.getSensorListenerAccess().getSensorSensorCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleSensorListener1157); 

                	newLeafNode(otherlv_2, grammarAccess.getSensorListenerAccess().getIfKeyword_2());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:565:1: ( ( (lv_type_3_0= 'ON' ) ) | ( (lv_type_4_0= 'OFF' ) ) | ( ( (lv_type_5_0= 'BETWEEN' ) ) ( (lv_l_6_0= RULE_INT ) ) otherlv_7= 'AND' ( (lv_h_8_0= RULE_INT ) ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt9=1;
                }
                break;
            case 27:
                {
                alt9=2;
                }
                break;
            case 28:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:565:2: ( (lv_type_3_0= 'ON' ) )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:565:2: ( (lv_type_3_0= 'ON' ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:566:1: (lv_type_3_0= 'ON' )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:566:1: (lv_type_3_0= 'ON' )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:567:3: lv_type_3_0= 'ON'
                    {
                    lv_type_3_0=(Token)match(input,26,FOLLOW_26_in_ruleSensorListener1176); 

                            newLeafNode(lv_type_3_0, grammarAccess.getSensorListenerAccess().getTypeONKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSensorListenerRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_0, "ON");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:581:6: ( (lv_type_4_0= 'OFF' ) )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:581:6: ( (lv_type_4_0= 'OFF' ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:582:1: (lv_type_4_0= 'OFF' )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:582:1: (lv_type_4_0= 'OFF' )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:583:3: lv_type_4_0= 'OFF'
                    {
                    lv_type_4_0=(Token)match(input,27,FOLLOW_27_in_ruleSensorListener1213); 

                            newLeafNode(lv_type_4_0, grammarAccess.getSensorListenerAccess().getTypeOFFKeyword_3_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSensorListenerRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_4_0, "OFF");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:597:6: ( ( (lv_type_5_0= 'BETWEEN' ) ) ( (lv_l_6_0= RULE_INT ) ) otherlv_7= 'AND' ( (lv_h_8_0= RULE_INT ) ) )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:597:6: ( ( (lv_type_5_0= 'BETWEEN' ) ) ( (lv_l_6_0= RULE_INT ) ) otherlv_7= 'AND' ( (lv_h_8_0= RULE_INT ) ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:597:7: ( (lv_type_5_0= 'BETWEEN' ) ) ( (lv_l_6_0= RULE_INT ) ) otherlv_7= 'AND' ( (lv_h_8_0= RULE_INT ) )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:597:7: ( (lv_type_5_0= 'BETWEEN' ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:598:1: (lv_type_5_0= 'BETWEEN' )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:598:1: (lv_type_5_0= 'BETWEEN' )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:599:3: lv_type_5_0= 'BETWEEN'
                    {
                    lv_type_5_0=(Token)match(input,28,FOLLOW_28_in_ruleSensorListener1251); 

                            newLeafNode(lv_type_5_0, grammarAccess.getSensorListenerAccess().getTypeBETWEENKeyword_3_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSensorListenerRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_5_0, "BETWEEN");
                    	    

                    }


                    }

                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:612:2: ( (lv_l_6_0= RULE_INT ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:613:1: (lv_l_6_0= RULE_INT )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:613:1: (lv_l_6_0= RULE_INT )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:614:3: lv_l_6_0= RULE_INT
                    {
                    lv_l_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSensorListener1281); 

                    			newLeafNode(lv_l_6_0, grammarAccess.getSensorListenerAccess().getLINTTerminalRuleCall_3_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSensorListenerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"l",
                            		lv_l_6_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleSensorListener1298); 

                        	newLeafNode(otherlv_7, grammarAccess.getSensorListenerAccess().getANDKeyword_3_2_2());
                        
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:634:1: ( (lv_h_8_0= RULE_INT ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:635:1: (lv_h_8_0= RULE_INT )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:635:1: (lv_h_8_0= RULE_INT )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:636:3: lv_h_8_0= RULE_INT
                    {
                    lv_h_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSensorListener1315); 

                    			newLeafNode(lv_h_8_0, grammarAccess.getSensorListenerAccess().getHINTTerminalRuleCall_3_2_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSensorListenerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"h",
                            		lv_h_8_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,30,FOLLOW_30_in_ruleSensorListener1334); 

                	newLeafNode(otherlv_9, grammarAccess.getSensorListenerAccess().getCallKeyword_4());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:656:1: ( (otherlv_10= RULE_ID ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:657:1: (otherlv_10= RULE_ID )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:657:1: (otherlv_10= RULE_ID )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:658:3: otherlv_10= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSensorListenerRule());
            	        }
                    
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSensorListener1354); 

            		newLeafNode(otherlv_10, grammarAccess.getSensorListenerAccess().getEventHandlerEventHandlerCrossReference_5_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensorListener"


    // $ANTLR start "entryRuleTimer"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:677:1: entryRuleTimer returns [EObject current=null] : iv_ruleTimer= ruleTimer EOF ;
    public final EObject entryRuleTimer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimer = null;


        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:678:2: (iv_ruleTimer= ruleTimer EOF )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:679:2: iv_ruleTimer= ruleTimer EOF
            {
             newCompositeNode(grammarAccess.getTimerRule()); 
            pushFollow(FOLLOW_ruleTimer_in_entryRuleTimer1390);
            iv_ruleTimer=ruleTimer();

            state._fsp--;

             current =iv_ruleTimer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimer1400); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimer"


    // $ANTLR start "ruleTimer"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:686:1: ruleTimer returns [EObject current=null] : (otherlv_0= 'Timer action' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'repeat' ( ( ( (lv_repeattype_3_0= 'EVERY INTERVAL of' ) ) ( (lv_secs_4_0= RULE_INT ) ) otherlv_5= 'seconds' ) | ( ( (lv_repeattype_6_0= 'EVERY DAY at' ) ) ( (lv_hours_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_minutes_9_0= RULE_INT ) ) ) | ( ( (lv_repeattype_10_0= 'EVERY MONDAY at' ) ) ( (lv_hours_11_0= RULE_INT ) ) otherlv_12= ':' ( (lv_minutes_13_0= RULE_INT ) ) ) | ( ( (lv_repeattype_14_0= 'EVERY TUESDAY at' ) ) ( (lv_hours_15_0= RULE_INT ) ) otherlv_16= ':' ( (lv_minutes_17_0= RULE_INT ) ) ) | ( ( (lv_repeattype_18_0= 'EVERY WEDNESDAY at' ) ) ( (lv_hours_19_0= RULE_INT ) ) otherlv_20= ':' ( (lv_minutes_21_0= RULE_INT ) ) ) | ( ( (lv_repeattype_22_0= 'EVERY THURSDAY at' ) ) ( (lv_hours_23_0= RULE_INT ) ) otherlv_24= ':' ( (lv_minutes_25_0= RULE_INT ) ) ) | ( ( (lv_repeattype_26_0= 'EVERY FRIDAY at' ) ) ( (lv_hours_27_0= RULE_INT ) ) otherlv_28= ':' ( (lv_minutes_29_0= RULE_INT ) ) ) | ( ( (lv_repeattype_30_0= 'EVERY SATURDAY at' ) ) ( (lv_hours_31_0= RULE_INT ) ) otherlv_32= ':' ( (lv_minutes_33_0= RULE_INT ) ) ) | ( ( (lv_repeattype_34_0= 'EVERY SUNDAY at' ) ) ( (lv_hours_35_0= RULE_INT ) ) otherlv_36= ':' ( (lv_minutes_37_0= RULE_INT ) ) ) ) ) ;
    public final EObject ruleTimer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_repeattype_3_0=null;
        Token lv_secs_4_0=null;
        Token otherlv_5=null;
        Token lv_repeattype_6_0=null;
        Token lv_hours_7_0=null;
        Token otherlv_8=null;
        Token lv_minutes_9_0=null;
        Token lv_repeattype_10_0=null;
        Token lv_hours_11_0=null;
        Token otherlv_12=null;
        Token lv_minutes_13_0=null;
        Token lv_repeattype_14_0=null;
        Token lv_hours_15_0=null;
        Token otherlv_16=null;
        Token lv_minutes_17_0=null;
        Token lv_repeattype_18_0=null;
        Token lv_hours_19_0=null;
        Token otherlv_20=null;
        Token lv_minutes_21_0=null;
        Token lv_repeattype_22_0=null;
        Token lv_hours_23_0=null;
        Token otherlv_24=null;
        Token lv_minutes_25_0=null;
        Token lv_repeattype_26_0=null;
        Token lv_hours_27_0=null;
        Token otherlv_28=null;
        Token lv_minutes_29_0=null;
        Token lv_repeattype_30_0=null;
        Token lv_hours_31_0=null;
        Token otherlv_32=null;
        Token lv_minutes_33_0=null;
        Token lv_repeattype_34_0=null;
        Token lv_hours_35_0=null;
        Token otherlv_36=null;
        Token lv_minutes_37_0=null;

         enterRule(); 
            
        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:689:28: ( (otherlv_0= 'Timer action' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'repeat' ( ( ( (lv_repeattype_3_0= 'EVERY INTERVAL of' ) ) ( (lv_secs_4_0= RULE_INT ) ) otherlv_5= 'seconds' ) | ( ( (lv_repeattype_6_0= 'EVERY DAY at' ) ) ( (lv_hours_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_minutes_9_0= RULE_INT ) ) ) | ( ( (lv_repeattype_10_0= 'EVERY MONDAY at' ) ) ( (lv_hours_11_0= RULE_INT ) ) otherlv_12= ':' ( (lv_minutes_13_0= RULE_INT ) ) ) | ( ( (lv_repeattype_14_0= 'EVERY TUESDAY at' ) ) ( (lv_hours_15_0= RULE_INT ) ) otherlv_16= ':' ( (lv_minutes_17_0= RULE_INT ) ) ) | ( ( (lv_repeattype_18_0= 'EVERY WEDNESDAY at' ) ) ( (lv_hours_19_0= RULE_INT ) ) otherlv_20= ':' ( (lv_minutes_21_0= RULE_INT ) ) ) | ( ( (lv_repeattype_22_0= 'EVERY THURSDAY at' ) ) ( (lv_hours_23_0= RULE_INT ) ) otherlv_24= ':' ( (lv_minutes_25_0= RULE_INT ) ) ) | ( ( (lv_repeattype_26_0= 'EVERY FRIDAY at' ) ) ( (lv_hours_27_0= RULE_INT ) ) otherlv_28= ':' ( (lv_minutes_29_0= RULE_INT ) ) ) | ( ( (lv_repeattype_30_0= 'EVERY SATURDAY at' ) ) ( (lv_hours_31_0= RULE_INT ) ) otherlv_32= ':' ( (lv_minutes_33_0= RULE_INT ) ) ) | ( ( (lv_repeattype_34_0= 'EVERY SUNDAY at' ) ) ( (lv_hours_35_0= RULE_INT ) ) otherlv_36= ':' ( (lv_minutes_37_0= RULE_INT ) ) ) ) ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:690:1: (otherlv_0= 'Timer action' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'repeat' ( ( ( (lv_repeattype_3_0= 'EVERY INTERVAL of' ) ) ( (lv_secs_4_0= RULE_INT ) ) otherlv_5= 'seconds' ) | ( ( (lv_repeattype_6_0= 'EVERY DAY at' ) ) ( (lv_hours_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_minutes_9_0= RULE_INT ) ) ) | ( ( (lv_repeattype_10_0= 'EVERY MONDAY at' ) ) ( (lv_hours_11_0= RULE_INT ) ) otherlv_12= ':' ( (lv_minutes_13_0= RULE_INT ) ) ) | ( ( (lv_repeattype_14_0= 'EVERY TUESDAY at' ) ) ( (lv_hours_15_0= RULE_INT ) ) otherlv_16= ':' ( (lv_minutes_17_0= RULE_INT ) ) ) | ( ( (lv_repeattype_18_0= 'EVERY WEDNESDAY at' ) ) ( (lv_hours_19_0= RULE_INT ) ) otherlv_20= ':' ( (lv_minutes_21_0= RULE_INT ) ) ) | ( ( (lv_repeattype_22_0= 'EVERY THURSDAY at' ) ) ( (lv_hours_23_0= RULE_INT ) ) otherlv_24= ':' ( (lv_minutes_25_0= RULE_INT ) ) ) | ( ( (lv_repeattype_26_0= 'EVERY FRIDAY at' ) ) ( (lv_hours_27_0= RULE_INT ) ) otherlv_28= ':' ( (lv_minutes_29_0= RULE_INT ) ) ) | ( ( (lv_repeattype_30_0= 'EVERY SATURDAY at' ) ) ( (lv_hours_31_0= RULE_INT ) ) otherlv_32= ':' ( (lv_minutes_33_0= RULE_INT ) ) ) | ( ( (lv_repeattype_34_0= 'EVERY SUNDAY at' ) ) ( (lv_hours_35_0= RULE_INT ) ) otherlv_36= ':' ( (lv_minutes_37_0= RULE_INT ) ) ) ) )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:690:1: (otherlv_0= 'Timer action' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'repeat' ( ( ( (lv_repeattype_3_0= 'EVERY INTERVAL of' ) ) ( (lv_secs_4_0= RULE_INT ) ) otherlv_5= 'seconds' ) | ( ( (lv_repeattype_6_0= 'EVERY DAY at' ) ) ( (lv_hours_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_minutes_9_0= RULE_INT ) ) ) | ( ( (lv_repeattype_10_0= 'EVERY MONDAY at' ) ) ( (lv_hours_11_0= RULE_INT ) ) otherlv_12= ':' ( (lv_minutes_13_0= RULE_INT ) ) ) | ( ( (lv_repeattype_14_0= 'EVERY TUESDAY at' ) ) ( (lv_hours_15_0= RULE_INT ) ) otherlv_16= ':' ( (lv_minutes_17_0= RULE_INT ) ) ) | ( ( (lv_repeattype_18_0= 'EVERY WEDNESDAY at' ) ) ( (lv_hours_19_0= RULE_INT ) ) otherlv_20= ':' ( (lv_minutes_21_0= RULE_INT ) ) ) | ( ( (lv_repeattype_22_0= 'EVERY THURSDAY at' ) ) ( (lv_hours_23_0= RULE_INT ) ) otherlv_24= ':' ( (lv_minutes_25_0= RULE_INT ) ) ) | ( ( (lv_repeattype_26_0= 'EVERY FRIDAY at' ) ) ( (lv_hours_27_0= RULE_INT ) ) otherlv_28= ':' ( (lv_minutes_29_0= RULE_INT ) ) ) | ( ( (lv_repeattype_30_0= 'EVERY SATURDAY at' ) ) ( (lv_hours_31_0= RULE_INT ) ) otherlv_32= ':' ( (lv_minutes_33_0= RULE_INT ) ) ) | ( ( (lv_repeattype_34_0= 'EVERY SUNDAY at' ) ) ( (lv_hours_35_0= RULE_INT ) ) otherlv_36= ':' ( (lv_minutes_37_0= RULE_INT ) ) ) ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:690:3: otherlv_0= 'Timer action' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'repeat' ( ( ( (lv_repeattype_3_0= 'EVERY INTERVAL of' ) ) ( (lv_secs_4_0= RULE_INT ) ) otherlv_5= 'seconds' ) | ( ( (lv_repeattype_6_0= 'EVERY DAY at' ) ) ( (lv_hours_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_minutes_9_0= RULE_INT ) ) ) | ( ( (lv_repeattype_10_0= 'EVERY MONDAY at' ) ) ( (lv_hours_11_0= RULE_INT ) ) otherlv_12= ':' ( (lv_minutes_13_0= RULE_INT ) ) ) | ( ( (lv_repeattype_14_0= 'EVERY TUESDAY at' ) ) ( (lv_hours_15_0= RULE_INT ) ) otherlv_16= ':' ( (lv_minutes_17_0= RULE_INT ) ) ) | ( ( (lv_repeattype_18_0= 'EVERY WEDNESDAY at' ) ) ( (lv_hours_19_0= RULE_INT ) ) otherlv_20= ':' ( (lv_minutes_21_0= RULE_INT ) ) ) | ( ( (lv_repeattype_22_0= 'EVERY THURSDAY at' ) ) ( (lv_hours_23_0= RULE_INT ) ) otherlv_24= ':' ( (lv_minutes_25_0= RULE_INT ) ) ) | ( ( (lv_repeattype_26_0= 'EVERY FRIDAY at' ) ) ( (lv_hours_27_0= RULE_INT ) ) otherlv_28= ':' ( (lv_minutes_29_0= RULE_INT ) ) ) | ( ( (lv_repeattype_30_0= 'EVERY SATURDAY at' ) ) ( (lv_hours_31_0= RULE_INT ) ) otherlv_32= ':' ( (lv_minutes_33_0= RULE_INT ) ) ) | ( ( (lv_repeattype_34_0= 'EVERY SUNDAY at' ) ) ( (lv_hours_35_0= RULE_INT ) ) otherlv_36= ':' ( (lv_minutes_37_0= RULE_INT ) ) ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleTimer1437); 

                	newLeafNode(otherlv_0, grammarAccess.getTimerAccess().getTimerActionKeyword_0());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:694:1: ( (otherlv_1= RULE_ID ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:695:1: (otherlv_1= RULE_ID )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:695:1: (otherlv_1= RULE_ID )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:696:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTimerRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTimer1457); 

            		newLeafNode(otherlv_1, grammarAccess.getTimerAccess().getEventHandlerEventHandlerCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleTimer1469); 

                	newLeafNode(otherlv_2, grammarAccess.getTimerAccess().getRepeatKeyword_2());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:711:1: ( ( ( (lv_repeattype_3_0= 'EVERY INTERVAL of' ) ) ( (lv_secs_4_0= RULE_INT ) ) otherlv_5= 'seconds' ) | ( ( (lv_repeattype_6_0= 'EVERY DAY at' ) ) ( (lv_hours_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_minutes_9_0= RULE_INT ) ) ) | ( ( (lv_repeattype_10_0= 'EVERY MONDAY at' ) ) ( (lv_hours_11_0= RULE_INT ) ) otherlv_12= ':' ( (lv_minutes_13_0= RULE_INT ) ) ) | ( ( (lv_repeattype_14_0= 'EVERY TUESDAY at' ) ) ( (lv_hours_15_0= RULE_INT ) ) otherlv_16= ':' ( (lv_minutes_17_0= RULE_INT ) ) ) | ( ( (lv_repeattype_18_0= 'EVERY WEDNESDAY at' ) ) ( (lv_hours_19_0= RULE_INT ) ) otherlv_20= ':' ( (lv_minutes_21_0= RULE_INT ) ) ) | ( ( (lv_repeattype_22_0= 'EVERY THURSDAY at' ) ) ( (lv_hours_23_0= RULE_INT ) ) otherlv_24= ':' ( (lv_minutes_25_0= RULE_INT ) ) ) | ( ( (lv_repeattype_26_0= 'EVERY FRIDAY at' ) ) ( (lv_hours_27_0= RULE_INT ) ) otherlv_28= ':' ( (lv_minutes_29_0= RULE_INT ) ) ) | ( ( (lv_repeattype_30_0= 'EVERY SATURDAY at' ) ) ( (lv_hours_31_0= RULE_INT ) ) otherlv_32= ':' ( (lv_minutes_33_0= RULE_INT ) ) ) | ( ( (lv_repeattype_34_0= 'EVERY SUNDAY at' ) ) ( (lv_hours_35_0= RULE_INT ) ) otherlv_36= ':' ( (lv_minutes_37_0= RULE_INT ) ) ) )
            int alt10=9;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt10=1;
                }
                break;
            case 35:
                {
                alt10=2;
                }
                break;
            case 36:
                {
                alt10=3;
                }
                break;
            case 37:
                {
                alt10=4;
                }
                break;
            case 38:
                {
                alt10=5;
                }
                break;
            case 39:
                {
                alt10=6;
                }
                break;
            case 40:
                {
                alt10=7;
                }
                break;
            case 41:
                {
                alt10=8;
                }
                break;
            case 42:
                {
                alt10=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:711:2: ( ( (lv_repeattype_3_0= 'EVERY INTERVAL of' ) ) ( (lv_secs_4_0= RULE_INT ) ) otherlv_5= 'seconds' )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:711:2: ( ( (lv_repeattype_3_0= 'EVERY INTERVAL of' ) ) ( (lv_secs_4_0= RULE_INT ) ) otherlv_5= 'seconds' )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:711:3: ( (lv_repeattype_3_0= 'EVERY INTERVAL of' ) ) ( (lv_secs_4_0= RULE_INT ) ) otherlv_5= 'seconds'
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:711:3: ( (lv_repeattype_3_0= 'EVERY INTERVAL of' ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:712:1: (lv_repeattype_3_0= 'EVERY INTERVAL of' )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:712:1: (lv_repeattype_3_0= 'EVERY INTERVAL of' )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:713:3: lv_repeattype_3_0= 'EVERY INTERVAL of'
                    {
                    lv_repeattype_3_0=(Token)match(input,33,FOLLOW_33_in_ruleTimer1489); 

                            newLeafNode(lv_repeattype_3_0, grammarAccess.getTimerAccess().getRepeattypeEVERYINTERVALOfKeyword_3_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimerRule());
                    	        }
                           		setWithLastConsumed(current, "repeattype", lv_repeattype_3_0, "EVERY INTERVAL of");
                    	    

                    }


                    }

                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:726:2: ( (lv_secs_4_0= RULE_INT ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:727:1: (lv_secs_4_0= RULE_INT )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:727:1: (lv_secs_4_0= RULE_INT )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:728:3: lv_secs_4_0= RULE_INT
                    {
                    lv_secs_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimer1519); 

                    			newLeafNode(lv_secs_4_0, grammarAccess.getTimerAccess().getSecsINTTerminalRuleCall_3_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"secs",
                            		lv_secs_4_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleTimer1536); 

                        	newLeafNode(otherlv_5, grammarAccess.getTimerAccess().getSecondsKeyword_3_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:749:6: ( ( (lv_repeattype_6_0= 'EVERY DAY at' ) ) ( (lv_hours_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_minutes_9_0= RULE_INT ) ) )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:749:6: ( ( (lv_repeattype_6_0= 'EVERY DAY at' ) ) ( (lv_hours_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_minutes_9_0= RULE_INT ) ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:749:7: ( (lv_repeattype_6_0= 'EVERY DAY at' ) ) ( (lv_hours_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_minutes_9_0= RULE_INT ) )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:749:7: ( (lv_repeattype_6_0= 'EVERY DAY at' ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:750:1: (lv_repeattype_6_0= 'EVERY DAY at' )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:750:1: (lv_repeattype_6_0= 'EVERY DAY at' )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:751:3: lv_repeattype_6_0= 'EVERY DAY at'
                    {
                    lv_repeattype_6_0=(Token)match(input,35,FOLLOW_35_in_ruleTimer1562); 

                            newLeafNode(lv_repeattype_6_0, grammarAccess.getTimerAccess().getRepeattypeEVERYDAYAtKeyword_3_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimerRule());
                    	        }
                           		setWithLastConsumed(current, "repeattype", lv_repeattype_6_0, "EVERY DAY at");
                    	    

                    }


                    }

                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:764:2: ( (lv_hours_7_0= RULE_INT ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:765:1: (lv_hours_7_0= RULE_INT )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:765:1: (lv_hours_7_0= RULE_INT )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:766:3: lv_hours_7_0= RULE_INT
                    {
                    lv_hours_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimer1592); 

                    			newLeafNode(lv_hours_7_0, grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"hours",
                            		lv_hours_7_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleTimer1609); 

                        	newLeafNode(otherlv_8, grammarAccess.getTimerAccess().getColonKeyword_3_1_2());
                        
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:786:1: ( (lv_minutes_9_0= RULE_INT ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:787:1: (lv_minutes_9_0= RULE_INT )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:787:1: (lv_minutes_9_0= RULE_INT )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:788:3: lv_minutes_9_0= RULE_INT
                    {
                    lv_minutes_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimer1626); 

                    			newLeafNode(lv_minutes_9_0, grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_1_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"minutes",
                            		lv_minutes_9_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:805:6: ( ( (lv_repeattype_10_0= 'EVERY MONDAY at' ) ) ( (lv_hours_11_0= RULE_INT ) ) otherlv_12= ':' ( (lv_minutes_13_0= RULE_INT ) ) )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:805:6: ( ( (lv_repeattype_10_0= 'EVERY MONDAY at' ) ) ( (lv_hours_11_0= RULE_INT ) ) otherlv_12= ':' ( (lv_minutes_13_0= RULE_INT ) ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:805:7: ( (lv_repeattype_10_0= 'EVERY MONDAY at' ) ) ( (lv_hours_11_0= RULE_INT ) ) otherlv_12= ':' ( (lv_minutes_13_0= RULE_INT ) )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:805:7: ( (lv_repeattype_10_0= 'EVERY MONDAY at' ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:806:1: (lv_repeattype_10_0= 'EVERY MONDAY at' )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:806:1: (lv_repeattype_10_0= 'EVERY MONDAY at' )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:807:3: lv_repeattype_10_0= 'EVERY MONDAY at'
                    {
                    lv_repeattype_10_0=(Token)match(input,36,FOLLOW_36_in_ruleTimer1657); 

                            newLeafNode(lv_repeattype_10_0, grammarAccess.getTimerAccess().getRepeattypeEVERYMONDAYAtKeyword_3_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimerRule());
                    	        }
                           		setWithLastConsumed(current, "repeattype", lv_repeattype_10_0, "EVERY MONDAY at");
                    	    

                    }


                    }

                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:820:2: ( (lv_hours_11_0= RULE_INT ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:821:1: (lv_hours_11_0= RULE_INT )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:821:1: (lv_hours_11_0= RULE_INT )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:822:3: lv_hours_11_0= RULE_INT
                    {
                    lv_hours_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimer1687); 

                    			newLeafNode(lv_hours_11_0, grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"hours",
                            		lv_hours_11_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleTimer1704); 

                        	newLeafNode(otherlv_12, grammarAccess.getTimerAccess().getColonKeyword_3_2_2());
                        
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:842:1: ( (lv_minutes_13_0= RULE_INT ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:843:1: (lv_minutes_13_0= RULE_INT )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:843:1: (lv_minutes_13_0= RULE_INT )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:844:3: lv_minutes_13_0= RULE_INT
                    {
                    lv_minutes_13_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimer1721); 

                    			newLeafNode(lv_minutes_13_0, grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_2_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"minutes",
                            		lv_minutes_13_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:861:6: ( ( (lv_repeattype_14_0= 'EVERY TUESDAY at' ) ) ( (lv_hours_15_0= RULE_INT ) ) otherlv_16= ':' ( (lv_minutes_17_0= RULE_INT ) ) )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:861:6: ( ( (lv_repeattype_14_0= 'EVERY TUESDAY at' ) ) ( (lv_hours_15_0= RULE_INT ) ) otherlv_16= ':' ( (lv_minutes_17_0= RULE_INT ) ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:861:7: ( (lv_repeattype_14_0= 'EVERY TUESDAY at' ) ) ( (lv_hours_15_0= RULE_INT ) ) otherlv_16= ':' ( (lv_minutes_17_0= RULE_INT ) )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:861:7: ( (lv_repeattype_14_0= 'EVERY TUESDAY at' ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:862:1: (lv_repeattype_14_0= 'EVERY TUESDAY at' )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:862:1: (lv_repeattype_14_0= 'EVERY TUESDAY at' )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:863:3: lv_repeattype_14_0= 'EVERY TUESDAY at'
                    {
                    lv_repeattype_14_0=(Token)match(input,37,FOLLOW_37_in_ruleTimer1752); 

                            newLeafNode(lv_repeattype_14_0, grammarAccess.getTimerAccess().getRepeattypeEVERYTUESDAYAtKeyword_3_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimerRule());
                    	        }
                           		setWithLastConsumed(current, "repeattype", lv_repeattype_14_0, "EVERY TUESDAY at");
                    	    

                    }


                    }

                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:876:2: ( (lv_hours_15_0= RULE_INT ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:877:1: (lv_hours_15_0= RULE_INT )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:877:1: (lv_hours_15_0= RULE_INT )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:878:3: lv_hours_15_0= RULE_INT
                    {
                    lv_hours_15_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimer1782); 

                    			newLeafNode(lv_hours_15_0, grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"hours",
                            		lv_hours_15_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_16=(Token)match(input,20,FOLLOW_20_in_ruleTimer1799); 

                        	newLeafNode(otherlv_16, grammarAccess.getTimerAccess().getColonKeyword_3_3_2());
                        
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:898:1: ( (lv_minutes_17_0= RULE_INT ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:899:1: (lv_minutes_17_0= RULE_INT )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:899:1: (lv_minutes_17_0= RULE_INT )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:900:3: lv_minutes_17_0= RULE_INT
                    {
                    lv_minutes_17_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimer1816); 

                    			newLeafNode(lv_minutes_17_0, grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_3_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"minutes",
                            		lv_minutes_17_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:917:6: ( ( (lv_repeattype_18_0= 'EVERY WEDNESDAY at' ) ) ( (lv_hours_19_0= RULE_INT ) ) otherlv_20= ':' ( (lv_minutes_21_0= RULE_INT ) ) )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:917:6: ( ( (lv_repeattype_18_0= 'EVERY WEDNESDAY at' ) ) ( (lv_hours_19_0= RULE_INT ) ) otherlv_20= ':' ( (lv_minutes_21_0= RULE_INT ) ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:917:7: ( (lv_repeattype_18_0= 'EVERY WEDNESDAY at' ) ) ( (lv_hours_19_0= RULE_INT ) ) otherlv_20= ':' ( (lv_minutes_21_0= RULE_INT ) )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:917:7: ( (lv_repeattype_18_0= 'EVERY WEDNESDAY at' ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:918:1: (lv_repeattype_18_0= 'EVERY WEDNESDAY at' )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:918:1: (lv_repeattype_18_0= 'EVERY WEDNESDAY at' )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:919:3: lv_repeattype_18_0= 'EVERY WEDNESDAY at'
                    {
                    lv_repeattype_18_0=(Token)match(input,38,FOLLOW_38_in_ruleTimer1847); 

                            newLeafNode(lv_repeattype_18_0, grammarAccess.getTimerAccess().getRepeattypeEVERYWEDNESDAYAtKeyword_3_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimerRule());
                    	        }
                           		setWithLastConsumed(current, "repeattype", lv_repeattype_18_0, "EVERY WEDNESDAY at");
                    	    

                    }


                    }

                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:932:2: ( (lv_hours_19_0= RULE_INT ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:933:1: (lv_hours_19_0= RULE_INT )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:933:1: (lv_hours_19_0= RULE_INT )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:934:3: lv_hours_19_0= RULE_INT
                    {
                    lv_hours_19_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimer1877); 

                    			newLeafNode(lv_hours_19_0, grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"hours",
                            		lv_hours_19_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_20=(Token)match(input,20,FOLLOW_20_in_ruleTimer1894); 

                        	newLeafNode(otherlv_20, grammarAccess.getTimerAccess().getColonKeyword_3_4_2());
                        
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:954:1: ( (lv_minutes_21_0= RULE_INT ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:955:1: (lv_minutes_21_0= RULE_INT )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:955:1: (lv_minutes_21_0= RULE_INT )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:956:3: lv_minutes_21_0= RULE_INT
                    {
                    lv_minutes_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimer1911); 

                    			newLeafNode(lv_minutes_21_0, grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_4_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"minutes",
                            		lv_minutes_21_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:973:6: ( ( (lv_repeattype_22_0= 'EVERY THURSDAY at' ) ) ( (lv_hours_23_0= RULE_INT ) ) otherlv_24= ':' ( (lv_minutes_25_0= RULE_INT ) ) )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:973:6: ( ( (lv_repeattype_22_0= 'EVERY THURSDAY at' ) ) ( (lv_hours_23_0= RULE_INT ) ) otherlv_24= ':' ( (lv_minutes_25_0= RULE_INT ) ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:973:7: ( (lv_repeattype_22_0= 'EVERY THURSDAY at' ) ) ( (lv_hours_23_0= RULE_INT ) ) otherlv_24= ':' ( (lv_minutes_25_0= RULE_INT ) )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:973:7: ( (lv_repeattype_22_0= 'EVERY THURSDAY at' ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:974:1: (lv_repeattype_22_0= 'EVERY THURSDAY at' )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:974:1: (lv_repeattype_22_0= 'EVERY THURSDAY at' )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:975:3: lv_repeattype_22_0= 'EVERY THURSDAY at'
                    {
                    lv_repeattype_22_0=(Token)match(input,39,FOLLOW_39_in_ruleTimer1942); 

                            newLeafNode(lv_repeattype_22_0, grammarAccess.getTimerAccess().getRepeattypeEVERYTHURSDAYAtKeyword_3_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimerRule());
                    	        }
                           		setWithLastConsumed(current, "repeattype", lv_repeattype_22_0, "EVERY THURSDAY at");
                    	    

                    }


                    }

                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:988:2: ( (lv_hours_23_0= RULE_INT ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:989:1: (lv_hours_23_0= RULE_INT )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:989:1: (lv_hours_23_0= RULE_INT )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:990:3: lv_hours_23_0= RULE_INT
                    {
                    lv_hours_23_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimer1972); 

                    			newLeafNode(lv_hours_23_0, grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"hours",
                            		lv_hours_23_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_24=(Token)match(input,20,FOLLOW_20_in_ruleTimer1989); 

                        	newLeafNode(otherlv_24, grammarAccess.getTimerAccess().getColonKeyword_3_5_2());
                        
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1010:1: ( (lv_minutes_25_0= RULE_INT ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1011:1: (lv_minutes_25_0= RULE_INT )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1011:1: (lv_minutes_25_0= RULE_INT )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1012:3: lv_minutes_25_0= RULE_INT
                    {
                    lv_minutes_25_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimer2006); 

                    			newLeafNode(lv_minutes_25_0, grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_5_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"minutes",
                            		lv_minutes_25_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1029:6: ( ( (lv_repeattype_26_0= 'EVERY FRIDAY at' ) ) ( (lv_hours_27_0= RULE_INT ) ) otherlv_28= ':' ( (lv_minutes_29_0= RULE_INT ) ) )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1029:6: ( ( (lv_repeattype_26_0= 'EVERY FRIDAY at' ) ) ( (lv_hours_27_0= RULE_INT ) ) otherlv_28= ':' ( (lv_minutes_29_0= RULE_INT ) ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1029:7: ( (lv_repeattype_26_0= 'EVERY FRIDAY at' ) ) ( (lv_hours_27_0= RULE_INT ) ) otherlv_28= ':' ( (lv_minutes_29_0= RULE_INT ) )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1029:7: ( (lv_repeattype_26_0= 'EVERY FRIDAY at' ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1030:1: (lv_repeattype_26_0= 'EVERY FRIDAY at' )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1030:1: (lv_repeattype_26_0= 'EVERY FRIDAY at' )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1031:3: lv_repeattype_26_0= 'EVERY FRIDAY at'
                    {
                    lv_repeattype_26_0=(Token)match(input,40,FOLLOW_40_in_ruleTimer2037); 

                            newLeafNode(lv_repeattype_26_0, grammarAccess.getTimerAccess().getRepeattypeEVERYFRIDAYAtKeyword_3_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimerRule());
                    	        }
                           		setWithLastConsumed(current, "repeattype", lv_repeattype_26_0, "EVERY FRIDAY at");
                    	    

                    }


                    }

                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1044:2: ( (lv_hours_27_0= RULE_INT ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1045:1: (lv_hours_27_0= RULE_INT )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1045:1: (lv_hours_27_0= RULE_INT )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1046:3: lv_hours_27_0= RULE_INT
                    {
                    lv_hours_27_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimer2067); 

                    			newLeafNode(lv_hours_27_0, grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"hours",
                            		lv_hours_27_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_28=(Token)match(input,20,FOLLOW_20_in_ruleTimer2084); 

                        	newLeafNode(otherlv_28, grammarAccess.getTimerAccess().getColonKeyword_3_6_2());
                        
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1066:1: ( (lv_minutes_29_0= RULE_INT ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1067:1: (lv_minutes_29_0= RULE_INT )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1067:1: (lv_minutes_29_0= RULE_INT )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1068:3: lv_minutes_29_0= RULE_INT
                    {
                    lv_minutes_29_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimer2101); 

                    			newLeafNode(lv_minutes_29_0, grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_6_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"minutes",
                            		lv_minutes_29_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1085:6: ( ( (lv_repeattype_30_0= 'EVERY SATURDAY at' ) ) ( (lv_hours_31_0= RULE_INT ) ) otherlv_32= ':' ( (lv_minutes_33_0= RULE_INT ) ) )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1085:6: ( ( (lv_repeattype_30_0= 'EVERY SATURDAY at' ) ) ( (lv_hours_31_0= RULE_INT ) ) otherlv_32= ':' ( (lv_minutes_33_0= RULE_INT ) ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1085:7: ( (lv_repeattype_30_0= 'EVERY SATURDAY at' ) ) ( (lv_hours_31_0= RULE_INT ) ) otherlv_32= ':' ( (lv_minutes_33_0= RULE_INT ) )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1085:7: ( (lv_repeattype_30_0= 'EVERY SATURDAY at' ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1086:1: (lv_repeattype_30_0= 'EVERY SATURDAY at' )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1086:1: (lv_repeattype_30_0= 'EVERY SATURDAY at' )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1087:3: lv_repeattype_30_0= 'EVERY SATURDAY at'
                    {
                    lv_repeattype_30_0=(Token)match(input,41,FOLLOW_41_in_ruleTimer2132); 

                            newLeafNode(lv_repeattype_30_0, grammarAccess.getTimerAccess().getRepeattypeEVERYSATURDAYAtKeyword_3_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimerRule());
                    	        }
                           		setWithLastConsumed(current, "repeattype", lv_repeattype_30_0, "EVERY SATURDAY at");
                    	    

                    }


                    }

                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1100:2: ( (lv_hours_31_0= RULE_INT ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1101:1: (lv_hours_31_0= RULE_INT )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1101:1: (lv_hours_31_0= RULE_INT )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1102:3: lv_hours_31_0= RULE_INT
                    {
                    lv_hours_31_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimer2162); 

                    			newLeafNode(lv_hours_31_0, grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"hours",
                            		lv_hours_31_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_32=(Token)match(input,20,FOLLOW_20_in_ruleTimer2179); 

                        	newLeafNode(otherlv_32, grammarAccess.getTimerAccess().getColonKeyword_3_7_2());
                        
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1122:1: ( (lv_minutes_33_0= RULE_INT ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1123:1: (lv_minutes_33_0= RULE_INT )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1123:1: (lv_minutes_33_0= RULE_INT )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1124:3: lv_minutes_33_0= RULE_INT
                    {
                    lv_minutes_33_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimer2196); 

                    			newLeafNode(lv_minutes_33_0, grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_7_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"minutes",
                            		lv_minutes_33_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1141:6: ( ( (lv_repeattype_34_0= 'EVERY SUNDAY at' ) ) ( (lv_hours_35_0= RULE_INT ) ) otherlv_36= ':' ( (lv_minutes_37_0= RULE_INT ) ) )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1141:6: ( ( (lv_repeattype_34_0= 'EVERY SUNDAY at' ) ) ( (lv_hours_35_0= RULE_INT ) ) otherlv_36= ':' ( (lv_minutes_37_0= RULE_INT ) ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1141:7: ( (lv_repeattype_34_0= 'EVERY SUNDAY at' ) ) ( (lv_hours_35_0= RULE_INT ) ) otherlv_36= ':' ( (lv_minutes_37_0= RULE_INT ) )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1141:7: ( (lv_repeattype_34_0= 'EVERY SUNDAY at' ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1142:1: (lv_repeattype_34_0= 'EVERY SUNDAY at' )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1142:1: (lv_repeattype_34_0= 'EVERY SUNDAY at' )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1143:3: lv_repeattype_34_0= 'EVERY SUNDAY at'
                    {
                    lv_repeattype_34_0=(Token)match(input,42,FOLLOW_42_in_ruleTimer2227); 

                            newLeafNode(lv_repeattype_34_0, grammarAccess.getTimerAccess().getRepeattypeEVERYSUNDAYAtKeyword_3_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimerRule());
                    	        }
                           		setWithLastConsumed(current, "repeattype", lv_repeattype_34_0, "EVERY SUNDAY at");
                    	    

                    }


                    }

                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1156:2: ( (lv_hours_35_0= RULE_INT ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1157:1: (lv_hours_35_0= RULE_INT )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1157:1: (lv_hours_35_0= RULE_INT )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1158:3: lv_hours_35_0= RULE_INT
                    {
                    lv_hours_35_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimer2257); 

                    			newLeafNode(lv_hours_35_0, grammarAccess.getTimerAccess().getHoursINTTerminalRuleCall_3_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"hours",
                            		lv_hours_35_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_36=(Token)match(input,20,FOLLOW_20_in_ruleTimer2274); 

                        	newLeafNode(otherlv_36, grammarAccess.getTimerAccess().getColonKeyword_3_8_2());
                        
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1178:1: ( (lv_minutes_37_0= RULE_INT ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1179:1: (lv_minutes_37_0= RULE_INT )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1179:1: (lv_minutes_37_0= RULE_INT )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1180:3: lv_minutes_37_0= RULE_INT
                    {
                    lv_minutes_37_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimer2291); 

                    			newLeafNode(lv_minutes_37_0, grammarAccess.getTimerAccess().getMinutesINTTerminalRuleCall_3_8_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"minutes",
                            		lv_minutes_37_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimer"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModel156 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleModel176 = new BitSet(new long[]{0x0000000081068002L});
    public static final BitSet FOLLOW_14_in_ruleModel205 = new BitSet(new long[]{0x0000000081068002L});
    public static final BitSet FOLLOW_ruleAbstractDevice_in_ruleModel242 = new BitSet(new long[]{0x0000000081068002L});
    public static final BitSet FOLLOW_ruleEventHandler_in_ruleModel264 = new BitSet(new long[]{0x0000000081040002L});
    public static final BitSet FOLLOW_ruleSensorListener_in_ruleModel286 = new BitSet(new long[]{0x0000000081000002L});
    public static final BitSet FOLLOW_ruleTimer_in_ruleModel308 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleAbstractDevice_in_entryRuleAbstractDevice345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDevice355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensor_in_ruleAbstractDevice402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActuator_in_ruleAbstractDevice429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensor_in_entryRuleSensor464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSensor474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSensor511 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSensor528 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSensor545 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSensor562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActuator_in_entryRuleActuator603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActuator613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleActuator650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActuator667 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleActuator684 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActuator701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventHandler_in_entryRuleEventHandler742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventHandler752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleEventHandler789 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventHandler806 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleChangeActuator_in_ruleEventHandler832 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleEventHandler845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChangeActuator_in_entryRuleChangeActuator881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChangeActuator891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChangeActuator936 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleChangeActuator948 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_21_in_ruleChangeActuator968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleChangeActuator997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleChangeActuator1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorListener_in_entryRuleSensorListener1078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSensorListener1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSensorListener1125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSensorListener1145 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSensorListener1157 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_26_in_ruleSensorListener1176 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27_in_ruleSensorListener1213 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28_in_ruleSensorListener1251 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSensorListener1281 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleSensorListener1298 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSensorListener1315 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSensorListener1334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSensorListener1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimer_in_entryRuleTimer1390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimer1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTimer1437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTimer1457 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleTimer1469 = new BitSet(new long[]{0x000007FA00000000L});
    public static final BitSet FOLLOW_33_in_ruleTimer1489 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimer1519 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleTimer1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleTimer1562 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimer1592 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTimer1609 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimer1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleTimer1657 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimer1687 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTimer1704 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimer1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleTimer1752 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimer1782 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTimer1799 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimer1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleTimer1847 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimer1877 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTimer1894 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimer1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleTimer1942 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimer1972 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTimer1989 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimer2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleTimer2037 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimer2067 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTimer2084 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimer2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleTimer2132 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimer2162 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTimer2179 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimer2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleTimer2227 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimer2257 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTimer2274 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimer2291 = new BitSet(new long[]{0x0000000000000002L});

}