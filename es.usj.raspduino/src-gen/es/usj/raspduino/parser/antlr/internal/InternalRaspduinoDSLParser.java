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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Sketch:'", "'Hardware:'", "'Arduino UNO'", "'Raspberry Pi'", "'Concurrency Priority:'", "'SENSOR'", "'SCHEDULED'", "'Sensor'", "'pin'", "'analog'", "';'", "'Actuator'", "'EventHandler'", "':'", "'On'", "'Off'", "'SensorListener'", "'if'", "'BETWEEN'", "'AND'", "'call'", "'&&'", "'||'", "'=='", "'<='", "'>='", "'!='", "'action'", "'repeat'", "'ONCE'", "'EVERY'", "'seconds:'", "'EVERY DAY'", "'EVERY MONDAY'", "'EVERY TUESDAY'", "'EVERY WEDNESDAY'", "'EVERY THURSDAY'", "'EVERY FRIDAY'", "'EVERY SATURDAY'", "'EVERY SUNDAY'", "'hours:'", "'minutes:'"
    };
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Sketch:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Hardware:' ( ( (lv_hardware_3_1= 'Arduino UNO' | lv_hardware_3_2= 'Raspberry Pi' ) ) ) ( (lv_devices_4_0= ruleAbstractDevice ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* ( (lv_sensorListeners_6_0= ruleSensorListener ) )* ( (lv_timers_7_0= ruleTimer ) )* ( (lv_alarms_8_0= ruleAlarm ) )* otherlv_9= 'Concurrency Priority:' ( ( (lv_priority_10_1= 'SENSOR' | lv_priority_10_2= 'SCHEDULED' ) ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_hardware_3_1=null;
        Token lv_hardware_3_2=null;
        Token otherlv_9=null;
        Token lv_priority_10_1=null;
        Token lv_priority_10_2=null;
        EObject lv_devices_4_0 = null;

        EObject lv_eventHandlers_5_0 = null;

        EObject lv_sensorListeners_6_0 = null;

        EObject lv_timers_7_0 = null;

        EObject lv_alarms_8_0 = null;


         enterRule(); 
            
        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:79:28: ( (otherlv_0= 'Sketch:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Hardware:' ( ( (lv_hardware_3_1= 'Arduino UNO' | lv_hardware_3_2= 'Raspberry Pi' ) ) ) ( (lv_devices_4_0= ruleAbstractDevice ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* ( (lv_sensorListeners_6_0= ruleSensorListener ) )* ( (lv_timers_7_0= ruleTimer ) )* ( (lv_alarms_8_0= ruleAlarm ) )* otherlv_9= 'Concurrency Priority:' ( ( (lv_priority_10_1= 'SENSOR' | lv_priority_10_2= 'SCHEDULED' ) ) ) ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:80:1: (otherlv_0= 'Sketch:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Hardware:' ( ( (lv_hardware_3_1= 'Arduino UNO' | lv_hardware_3_2= 'Raspberry Pi' ) ) ) ( (lv_devices_4_0= ruleAbstractDevice ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* ( (lv_sensorListeners_6_0= ruleSensorListener ) )* ( (lv_timers_7_0= ruleTimer ) )* ( (lv_alarms_8_0= ruleAlarm ) )* otherlv_9= 'Concurrency Priority:' ( ( (lv_priority_10_1= 'SENSOR' | lv_priority_10_2= 'SCHEDULED' ) ) ) )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:80:1: (otherlv_0= 'Sketch:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Hardware:' ( ( (lv_hardware_3_1= 'Arduino UNO' | lv_hardware_3_2= 'Raspberry Pi' ) ) ) ( (lv_devices_4_0= ruleAbstractDevice ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* ( (lv_sensorListeners_6_0= ruleSensorListener ) )* ( (lv_timers_7_0= ruleTimer ) )* ( (lv_alarms_8_0= ruleAlarm ) )* otherlv_9= 'Concurrency Priority:' ( ( (lv_priority_10_1= 'SENSOR' | lv_priority_10_2= 'SCHEDULED' ) ) ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:80:3: otherlv_0= 'Sketch:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Hardware:' ( ( (lv_hardware_3_1= 'Arduino UNO' | lv_hardware_3_2= 'Raspberry Pi' ) ) ) ( (lv_devices_4_0= ruleAbstractDevice ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* ( (lv_sensorListeners_6_0= ruleSensorListener ) )* ( (lv_timers_7_0= ruleTimer ) )* ( (lv_alarms_8_0= ruleAlarm ) )* otherlv_9= 'Concurrency Priority:' ( ( (lv_priority_10_1= 'SENSOR' | lv_priority_10_2= 'SCHEDULED' ) ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleModel122); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleModel156); 

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

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
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
                    lv_hardware_3_1=(Token)match(input,14,FOLLOW_14_in_ruleModel176); 

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
                    lv_hardware_3_2=(Token)match(input,15,FOLLOW_15_in_ruleModel205); 

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

                if ( (LA2_0==19||LA2_0==23) ) {
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

                if ( (LA3_0==24) ) {
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

                if ( (LA4_0==28) ) {
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

                if ( (LA5_0==39) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==RULE_ID) ) {
                        int LA5_3 = input.LA(3);

                        if ( (LA5_3==40) ) {
                            int LA5_4 = input.LA(4);

                            if ( ((LA5_4>=41 && LA5_4<=42)) ) {
                                alt5=1;
                            }


                        }


                    }


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

            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:208:3: ( (lv_alarms_8_0= ruleAlarm ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==39) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:209:1: (lv_alarms_8_0= ruleAlarm )
            	    {
            	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:209:1: (lv_alarms_8_0= ruleAlarm )
            	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:210:3: lv_alarms_8_0= ruleAlarm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getAlarmsAlarmParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAlarm_in_ruleModel330);
            	    lv_alarms_8_0=ruleAlarm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"alarms",
            	            		lv_alarms_8_0, 
            	            		"Alarm");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleModel343); 

                	newLeafNode(otherlv_9, grammarAccess.getModelAccess().getConcurrencyPriorityKeyword_9());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:230:1: ( ( (lv_priority_10_1= 'SENSOR' | lv_priority_10_2= 'SCHEDULED' ) ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:231:1: ( (lv_priority_10_1= 'SENSOR' | lv_priority_10_2= 'SCHEDULED' ) )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:231:1: ( (lv_priority_10_1= 'SENSOR' | lv_priority_10_2= 'SCHEDULED' ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:232:1: (lv_priority_10_1= 'SENSOR' | lv_priority_10_2= 'SCHEDULED' )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:232:1: (lv_priority_10_1= 'SENSOR' | lv_priority_10_2= 'SCHEDULED' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:233:3: lv_priority_10_1= 'SENSOR'
                    {
                    lv_priority_10_1=(Token)match(input,17,FOLLOW_17_in_ruleModel363); 

                            newLeafNode(lv_priority_10_1, grammarAccess.getModelAccess().getPrioritySENSORKeyword_10_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModelRule());
                    	        }
                           		setWithLastConsumed(current, "priority", lv_priority_10_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:245:8: lv_priority_10_2= 'SCHEDULED'
                    {
                    lv_priority_10_2=(Token)match(input,18,FOLLOW_18_in_ruleModel392); 

                            newLeafNode(lv_priority_10_2, grammarAccess.getModelAccess().getPrioritySCHEDULEDKeyword_10_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModelRule());
                    	        }
                           		setWithLastConsumed(current, "priority", lv_priority_10_2, null);
                    	    

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAbstractDevice"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:268:1: entryRuleAbstractDevice returns [EObject current=null] : iv_ruleAbstractDevice= ruleAbstractDevice EOF ;
    public final EObject entryRuleAbstractDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDevice = null;


        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:269:2: (iv_ruleAbstractDevice= ruleAbstractDevice EOF )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:270:2: iv_ruleAbstractDevice= ruleAbstractDevice EOF
            {
             newCompositeNode(grammarAccess.getAbstractDeviceRule()); 
            pushFollow(FOLLOW_ruleAbstractDevice_in_entryRuleAbstractDevice444);
            iv_ruleAbstractDevice=ruleAbstractDevice();

            state._fsp--;

             current =iv_ruleAbstractDevice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDevice454); 

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
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:277:1: ruleAbstractDevice returns [EObject current=null] : (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ;
    public final EObject ruleAbstractDevice() throws RecognitionException {
        EObject current = null;

        EObject this_Sensor_0 = null;

        EObject this_Actuator_1 = null;


         enterRule(); 
            
        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:280:28: ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:281:1: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:281:1: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:282:5: this_Sensor_0= ruleSensor
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDeviceAccess().getSensorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSensor_in_ruleAbstractDevice501);
                    this_Sensor_0=ruleSensor();

                    state._fsp--;

                     
                            current = this_Sensor_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:292:5: this_Actuator_1= ruleActuator
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDeviceAccess().getActuatorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleActuator_in_ruleAbstractDevice528);
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
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:308:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:309:2: (iv_ruleSensor= ruleSensor EOF )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:310:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_ruleSensor_in_entryRuleSensor563);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSensor573); 

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
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:317:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'pin' ( (lv_pin_3_0= RULE_STRING ) ) ( (lv_analog_4_0= 'analog' ) )? otherlv_5= ';' ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_pin_3_0=null;
        Token lv_analog_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:320:28: ( (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'pin' ( (lv_pin_3_0= RULE_STRING ) ) ( (lv_analog_4_0= 'analog' ) )? otherlv_5= ';' ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:321:1: (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'pin' ( (lv_pin_3_0= RULE_STRING ) ) ( (lv_analog_4_0= 'analog' ) )? otherlv_5= ';' )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:321:1: (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'pin' ( (lv_pin_3_0= RULE_STRING ) ) ( (lv_analog_4_0= 'analog' ) )? otherlv_5= ';' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:321:3: otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'pin' ( (lv_pin_3_0= RULE_STRING ) ) ( (lv_analog_4_0= 'analog' ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleSensor610); 

                	newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:325:1: ( (lv_name_1_0= RULE_ID ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:326:1: (lv_name_1_0= RULE_ID )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:326:1: (lv_name_1_0= RULE_ID )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:327:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSensor627); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleSensor644); 

                	newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getPinKeyword_2());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:347:1: ( (lv_pin_3_0= RULE_STRING ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:348:1: (lv_pin_3_0= RULE_STRING )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:348:1: (lv_pin_3_0= RULE_STRING )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:349:3: lv_pin_3_0= RULE_STRING
            {
            lv_pin_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSensor661); 

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

            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:365:2: ( (lv_analog_4_0= 'analog' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:366:1: (lv_analog_4_0= 'analog' )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:366:1: (lv_analog_4_0= 'analog' )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:367:3: lv_analog_4_0= 'analog'
                    {
                    lv_analog_4_0=(Token)match(input,21,FOLLOW_21_in_ruleSensor684); 

                            newLeafNode(lv_analog_4_0, grammarAccess.getSensorAccess().getAnalogAnalogKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSensorRule());
                    	        }
                           		setWithLastConsumed(current, "analog", true, "analog");
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleSensor710); 

                	newLeafNode(otherlv_5, grammarAccess.getSensorAccess().getSemicolonKeyword_5());
                

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
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:392:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:393:2: (iv_ruleActuator= ruleActuator EOF )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:394:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_ruleActuator_in_entryRuleActuator746);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActuator756); 

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
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:401:1: ruleActuator returns [EObject current=null] : (otherlv_0= 'Actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'pin' ( (lv_pin_3_0= RULE_STRING ) ) otherlv_4= ';' ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_pin_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:404:28: ( (otherlv_0= 'Actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'pin' ( (lv_pin_3_0= RULE_STRING ) ) otherlv_4= ';' ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:405:1: (otherlv_0= 'Actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'pin' ( (lv_pin_3_0= RULE_STRING ) ) otherlv_4= ';' )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:405:1: (otherlv_0= 'Actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'pin' ( (lv_pin_3_0= RULE_STRING ) ) otherlv_4= ';' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:405:3: otherlv_0= 'Actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'pin' ( (lv_pin_3_0= RULE_STRING ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleActuator793); 

                	newLeafNode(otherlv_0, grammarAccess.getActuatorAccess().getActuatorKeyword_0());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:409:1: ( (lv_name_1_0= RULE_ID ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:410:1: (lv_name_1_0= RULE_ID )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:410:1: (lv_name_1_0= RULE_ID )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:411:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActuator810); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleActuator827); 

                	newLeafNode(otherlv_2, grammarAccess.getActuatorAccess().getPinKeyword_2());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:431:1: ( (lv_pin_3_0= RULE_STRING ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:432:1: (lv_pin_3_0= RULE_STRING )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:432:1: (lv_pin_3_0= RULE_STRING )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:433:3: lv_pin_3_0= RULE_STRING
            {
            lv_pin_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActuator844); 

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

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleActuator861); 

                	newLeafNode(otherlv_4, grammarAccess.getActuatorAccess().getSemicolonKeyword_4());
                

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
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:461:1: entryRuleEventHandler returns [EObject current=null] : iv_ruleEventHandler= ruleEventHandler EOF ;
    public final EObject entryRuleEventHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventHandler = null;


        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:462:2: (iv_ruleEventHandler= ruleEventHandler EOF )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:463:2: iv_ruleEventHandler= ruleEventHandler EOF
            {
             newCompositeNode(grammarAccess.getEventHandlerRule()); 
            pushFollow(FOLLOW_ruleEventHandler_in_entryRuleEventHandler897);
            iv_ruleEventHandler=ruleEventHandler();

            state._fsp--;

             current =iv_ruleEventHandler; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventHandler907); 

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
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:470:1: ruleEventHandler returns [EObject current=null] : (otherlv_0= 'EventHandler' ( (lv_name_1_0= RULE_ID ) ) ( (lv_changeActuators_2_0= ruleChangeActuator ) )* otherlv_3= ';' ) ;
    public final EObject ruleEventHandler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_changeActuators_2_0 = null;


         enterRule(); 
            
        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:473:28: ( (otherlv_0= 'EventHandler' ( (lv_name_1_0= RULE_ID ) ) ( (lv_changeActuators_2_0= ruleChangeActuator ) )* otherlv_3= ';' ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:474:1: (otherlv_0= 'EventHandler' ( (lv_name_1_0= RULE_ID ) ) ( (lv_changeActuators_2_0= ruleChangeActuator ) )* otherlv_3= ';' )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:474:1: (otherlv_0= 'EventHandler' ( (lv_name_1_0= RULE_ID ) ) ( (lv_changeActuators_2_0= ruleChangeActuator ) )* otherlv_3= ';' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:474:3: otherlv_0= 'EventHandler' ( (lv_name_1_0= RULE_ID ) ) ( (lv_changeActuators_2_0= ruleChangeActuator ) )* otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleEventHandler944); 

                	newLeafNode(otherlv_0, grammarAccess.getEventHandlerAccess().getEventHandlerKeyword_0());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:478:1: ( (lv_name_1_0= RULE_ID ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:479:1: (lv_name_1_0= RULE_ID )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:479:1: (lv_name_1_0= RULE_ID )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:480:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventHandler961); 

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

            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:496:2: ( (lv_changeActuators_2_0= ruleChangeActuator ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:497:1: (lv_changeActuators_2_0= ruleChangeActuator )
            	    {
            	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:497:1: (lv_changeActuators_2_0= ruleChangeActuator )
            	    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:498:3: lv_changeActuators_2_0= ruleChangeActuator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEventHandlerAccess().getChangeActuatorsChangeActuatorParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChangeActuator_in_ruleEventHandler987);
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
            	    break loop10;
                }
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleEventHandler1000); 

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
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:526:1: entryRuleChangeActuator returns [EObject current=null] : iv_ruleChangeActuator= ruleChangeActuator EOF ;
    public final EObject entryRuleChangeActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeActuator = null;


        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:527:2: (iv_ruleChangeActuator= ruleChangeActuator EOF )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:528:2: iv_ruleChangeActuator= ruleChangeActuator EOF
            {
             newCompositeNode(grammarAccess.getChangeActuatorRule()); 
            pushFollow(FOLLOW_ruleChangeActuator_in_entryRuleChangeActuator1036);
            iv_ruleChangeActuator=ruleChangeActuator();

            state._fsp--;

             current =iv_ruleChangeActuator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChangeActuator1046); 

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
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:535:1: ruleChangeActuator returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_ActuatorState_2_1= 'On' | lv_ActuatorState_2_2= 'Off' ) ) ) ) ;
    public final EObject ruleChangeActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ActuatorState_2_1=null;
        Token lv_ActuatorState_2_2=null;

         enterRule(); 
            
        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:538:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_ActuatorState_2_1= 'On' | lv_ActuatorState_2_2= 'Off' ) ) ) ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:539:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_ActuatorState_2_1= 'On' | lv_ActuatorState_2_2= 'Off' ) ) ) )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:539:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_ActuatorState_2_1= 'On' | lv_ActuatorState_2_2= 'Off' ) ) ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:539:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_ActuatorState_2_1= 'On' | lv_ActuatorState_2_2= 'Off' ) ) )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:539:2: ( (otherlv_0= RULE_ID ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:540:1: (otherlv_0= RULE_ID )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:540:1: (otherlv_0= RULE_ID )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:541:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChangeActuatorRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChangeActuator1091); 

            		newLeafNode(otherlv_0, grammarAccess.getChangeActuatorAccess().getActuatorActuatorCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleChangeActuator1103); 

                	newLeafNode(otherlv_1, grammarAccess.getChangeActuatorAccess().getColonKeyword_1());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:556:1: ( ( (lv_ActuatorState_2_1= 'On' | lv_ActuatorState_2_2= 'Off' ) ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:557:1: ( (lv_ActuatorState_2_1= 'On' | lv_ActuatorState_2_2= 'Off' ) )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:557:1: ( (lv_ActuatorState_2_1= 'On' | lv_ActuatorState_2_2= 'Off' ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:558:1: (lv_ActuatorState_2_1= 'On' | lv_ActuatorState_2_2= 'Off' )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:558:1: (lv_ActuatorState_2_1= 'On' | lv_ActuatorState_2_2= 'Off' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            else if ( (LA11_0==27) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:559:3: lv_ActuatorState_2_1= 'On'
                    {
                    lv_ActuatorState_2_1=(Token)match(input,26,FOLLOW_26_in_ruleChangeActuator1123); 

                            newLeafNode(lv_ActuatorState_2_1, grammarAccess.getChangeActuatorAccess().getActuatorStateOnKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChangeActuatorRule());
                    	        }
                           		setWithLastConsumed(current, "ActuatorState", lv_ActuatorState_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:571:8: lv_ActuatorState_2_2= 'Off'
                    {
                    lv_ActuatorState_2_2=(Token)match(input,27,FOLLOW_27_in_ruleChangeActuator1152); 

                            newLeafNode(lv_ActuatorState_2_2, grammarAccess.getChangeActuatorAccess().getActuatorStateOffKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChangeActuatorRule());
                    	        }
                           		setWithLastConsumed(current, "ActuatorState", lv_ActuatorState_2_2, null);
                    	    

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
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:594:1: entryRuleSensorListener returns [EObject current=null] : iv_ruleSensorListener= ruleSensorListener EOF ;
    public final EObject entryRuleSensorListener() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorListener = null;


        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:595:2: (iv_ruleSensorListener= ruleSensorListener EOF )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:596:2: iv_ruleSensorListener= ruleSensorListener EOF
            {
             newCompositeNode(grammarAccess.getSensorListenerRule()); 
            pushFollow(FOLLOW_ruleSensorListener_in_entryRuleSensorListener1204);
            iv_ruleSensorListener=ruleSensorListener();

            state._fsp--;

             current =iv_ruleSensorListener; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSensorListener1214); 

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
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:603:1: ruleSensorListener returns [EObject current=null] : (otherlv_0= 'SensorListener' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'if' ( ( (lv_type_3_0= 'BETWEEN' ) ) ( (lv_l_4_0= RULE_INT ) ) otherlv_5= 'AND' ( (lv_h_6_0= RULE_INT ) ) ) otherlv_7= 'call' ( (otherlv_8= RULE_ID ) ) otherlv_9= ';' ) ;
    public final EObject ruleSensorListener() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;
        Token lv_l_4_0=null;
        Token otherlv_5=null;
        Token lv_h_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:606:28: ( (otherlv_0= 'SensorListener' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'if' ( ( (lv_type_3_0= 'BETWEEN' ) ) ( (lv_l_4_0= RULE_INT ) ) otherlv_5= 'AND' ( (lv_h_6_0= RULE_INT ) ) ) otherlv_7= 'call' ( (otherlv_8= RULE_ID ) ) otherlv_9= ';' ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:607:1: (otherlv_0= 'SensorListener' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'if' ( ( (lv_type_3_0= 'BETWEEN' ) ) ( (lv_l_4_0= RULE_INT ) ) otherlv_5= 'AND' ( (lv_h_6_0= RULE_INT ) ) ) otherlv_7= 'call' ( (otherlv_8= RULE_ID ) ) otherlv_9= ';' )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:607:1: (otherlv_0= 'SensorListener' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'if' ( ( (lv_type_3_0= 'BETWEEN' ) ) ( (lv_l_4_0= RULE_INT ) ) otherlv_5= 'AND' ( (lv_h_6_0= RULE_INT ) ) ) otherlv_7= 'call' ( (otherlv_8= RULE_ID ) ) otherlv_9= ';' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:607:3: otherlv_0= 'SensorListener' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'if' ( ( (lv_type_3_0= 'BETWEEN' ) ) ( (lv_l_4_0= RULE_INT ) ) otherlv_5= 'AND' ( (lv_h_6_0= RULE_INT ) ) ) otherlv_7= 'call' ( (otherlv_8= RULE_ID ) ) otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleSensorListener1251); 

                	newLeafNode(otherlv_0, grammarAccess.getSensorListenerAccess().getSensorListenerKeyword_0());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:611:1: ( (otherlv_1= RULE_ID ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:612:1: (otherlv_1= RULE_ID )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:612:1: (otherlv_1= RULE_ID )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:613:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSensorListenerRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSensorListener1271); 

            		newLeafNode(otherlv_1, grammarAccess.getSensorListenerAccess().getSensorSensorCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleSensorListener1283); 

                	newLeafNode(otherlv_2, grammarAccess.getSensorListenerAccess().getIfKeyword_2());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:628:1: ( ( (lv_type_3_0= 'BETWEEN' ) ) ( (lv_l_4_0= RULE_INT ) ) otherlv_5= 'AND' ( (lv_h_6_0= RULE_INT ) ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:628:2: ( (lv_type_3_0= 'BETWEEN' ) ) ( (lv_l_4_0= RULE_INT ) ) otherlv_5= 'AND' ( (lv_h_6_0= RULE_INT ) )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:628:2: ( (lv_type_3_0= 'BETWEEN' ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:629:1: (lv_type_3_0= 'BETWEEN' )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:629:1: (lv_type_3_0= 'BETWEEN' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:630:3: lv_type_3_0= 'BETWEEN'
            {
            lv_type_3_0=(Token)match(input,30,FOLLOW_30_in_ruleSensorListener1302); 

                    newLeafNode(lv_type_3_0, grammarAccess.getSensorListenerAccess().getTypeBETWEENKeyword_3_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSensorListenerRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_3_0, "BETWEEN");
            	    

            }


            }

            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:643:2: ( (lv_l_4_0= RULE_INT ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:644:1: (lv_l_4_0= RULE_INT )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:644:1: (lv_l_4_0= RULE_INT )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:645:3: lv_l_4_0= RULE_INT
            {
            lv_l_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSensorListener1332); 

            			newLeafNode(lv_l_4_0, grammarAccess.getSensorListenerAccess().getLINTTerminalRuleCall_3_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSensorListenerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"l",
                    		lv_l_4_0, 
                    		"INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleSensorListener1349); 

                	newLeafNode(otherlv_5, grammarAccess.getSensorListenerAccess().getANDKeyword_3_2());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:665:1: ( (lv_h_6_0= RULE_INT ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:666:1: (lv_h_6_0= RULE_INT )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:666:1: (lv_h_6_0= RULE_INT )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:667:3: lv_h_6_0= RULE_INT
            {
            lv_h_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSensorListener1366); 

            			newLeafNode(lv_h_6_0, grammarAccess.getSensorListenerAccess().getHINTTerminalRuleCall_3_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSensorListenerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"h",
                    		lv_h_6_0, 
                    		"INT");
            	    

            }


            }


            }

            otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleSensorListener1384); 

                	newLeafNode(otherlv_7, grammarAccess.getSensorListenerAccess().getCallKeyword_4());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:687:1: ( (otherlv_8= RULE_ID ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:688:1: (otherlv_8= RULE_ID )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:688:1: (otherlv_8= RULE_ID )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:689:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSensorListenerRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSensorListener1404); 

            		newLeafNode(otherlv_8, grammarAccess.getSensorListenerAccess().getEventHandlerEventHandlerCrossReference_5_0()); 
            	

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleSensorListener1416); 

                	newLeafNode(otherlv_9, grammarAccess.getSensorListenerAccess().getSemicolonKeyword_6());
                

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


    // $ANTLR start "entryRulePrecondition"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:712:1: entryRulePrecondition returns [EObject current=null] : iv_rulePrecondition= rulePrecondition EOF ;
    public final EObject entryRulePrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecondition = null;


        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:713:2: (iv_rulePrecondition= rulePrecondition EOF )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:714:2: iv_rulePrecondition= rulePrecondition EOF
            {
             newCompositeNode(grammarAccess.getPreconditionRule()); 
            pushFollow(FOLLOW_rulePrecondition_in_entryRulePrecondition1452);
            iv_rulePrecondition=rulePrecondition();

            state._fsp--;

             current =iv_rulePrecondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrecondition1462); 

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
    // $ANTLR end "entryRulePrecondition"


    // $ANTLR start "rulePrecondition"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:721:1: rulePrecondition returns [EObject current=null] : ( ( ( (lv_pre1_0_0= rulePrecondition1 ) ) ( ( (lv_op_1_1= '&&' | lv_op_1_2= '||' ) ) ) ( (lv_pre_2_0= rulePrecondition ) ) ) | ( (lv_pre1_3_0= rulePrecondition1 ) ) ) ;
    public final EObject rulePrecondition() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        EObject lv_pre1_0_0 = null;

        EObject lv_pre_2_0 = null;

        EObject lv_pre1_3_0 = null;


         enterRule(); 
            
        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:724:28: ( ( ( ( (lv_pre1_0_0= rulePrecondition1 ) ) ( ( (lv_op_1_1= '&&' | lv_op_1_2= '||' ) ) ) ( (lv_pre_2_0= rulePrecondition ) ) ) | ( (lv_pre1_3_0= rulePrecondition1 ) ) ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:725:1: ( ( ( (lv_pre1_0_0= rulePrecondition1 ) ) ( ( (lv_op_1_1= '&&' | lv_op_1_2= '||' ) ) ) ( (lv_pre_2_0= rulePrecondition ) ) ) | ( (lv_pre1_3_0= rulePrecondition1 ) ) )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:725:1: ( ( ( (lv_pre1_0_0= rulePrecondition1 ) ) ( ( (lv_op_1_1= '&&' | lv_op_1_2= '||' ) ) ) ( (lv_pre_2_0= rulePrecondition ) ) ) | ( (lv_pre1_3_0= rulePrecondition1 ) ) )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:725:2: ( ( (lv_pre1_0_0= rulePrecondition1 ) ) ( ( (lv_op_1_1= '&&' | lv_op_1_2= '||' ) ) ) ( (lv_pre_2_0= rulePrecondition ) ) )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:725:2: ( ( (lv_pre1_0_0= rulePrecondition1 ) ) ( ( (lv_op_1_1= '&&' | lv_op_1_2= '||' ) ) ) ( (lv_pre_2_0= rulePrecondition ) ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:725:3: ( (lv_pre1_0_0= rulePrecondition1 ) ) ( ( (lv_op_1_1= '&&' | lv_op_1_2= '||' ) ) ) ( (lv_pre_2_0= rulePrecondition ) )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:725:3: ( (lv_pre1_0_0= rulePrecondition1 ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:726:1: (lv_pre1_0_0= rulePrecondition1 )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:726:1: (lv_pre1_0_0= rulePrecondition1 )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:727:3: lv_pre1_0_0= rulePrecondition1
                    {
                     
                    	        newCompositeNode(grammarAccess.getPreconditionAccess().getPre1Precondition1ParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrecondition1_in_rulePrecondition1509);
                    lv_pre1_0_0=rulePrecondition1();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPreconditionRule());
                    	        }
                           		set(
                           			current, 
                           			"pre1",
                            		lv_pre1_0_0, 
                            		"Precondition1");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:743:2: ( ( (lv_op_1_1= '&&' | lv_op_1_2= '||' ) ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:744:1: ( (lv_op_1_1= '&&' | lv_op_1_2= '||' ) )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:744:1: ( (lv_op_1_1= '&&' | lv_op_1_2= '||' ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:745:1: (lv_op_1_1= '&&' | lv_op_1_2= '||' )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:745:1: (lv_op_1_1= '&&' | lv_op_1_2= '||' )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==33) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==34) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:746:3: lv_op_1_1= '&&'
                            {
                            lv_op_1_1=(Token)match(input,33,FOLLOW_33_in_rulePrecondition1529); 

                                    newLeafNode(lv_op_1_1, grammarAccess.getPreconditionAccess().getOpAmpersandAmpersandKeyword_0_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPreconditionRule());
                            	        }
                                   		setWithLastConsumed(current, "op", lv_op_1_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:758:8: lv_op_1_2= '||'
                            {
                            lv_op_1_2=(Token)match(input,34,FOLLOW_34_in_rulePrecondition1558); 

                                    newLeafNode(lv_op_1_2, grammarAccess.getPreconditionAccess().getOpVerticalLineVerticalLineKeyword_0_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPreconditionRule());
                            	        }
                                   		setWithLastConsumed(current, "op", lv_op_1_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:773:2: ( (lv_pre_2_0= rulePrecondition ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:774:1: (lv_pre_2_0= rulePrecondition )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:774:1: (lv_pre_2_0= rulePrecondition )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:775:3: lv_pre_2_0= rulePrecondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getPreconditionAccess().getPrePreconditionParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrecondition_in_rulePrecondition1595);
                    lv_pre_2_0=rulePrecondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPreconditionRule());
                    	        }
                           		set(
                           			current, 
                           			"pre",
                            		lv_pre_2_0, 
                            		"Precondition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:792:6: ( (lv_pre1_3_0= rulePrecondition1 ) )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:792:6: ( (lv_pre1_3_0= rulePrecondition1 ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:793:1: (lv_pre1_3_0= rulePrecondition1 )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:793:1: (lv_pre1_3_0= rulePrecondition1 )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:794:3: lv_pre1_3_0= rulePrecondition1
                    {
                     
                    	        newCompositeNode(grammarAccess.getPreconditionAccess().getPre1Precondition1ParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrecondition1_in_rulePrecondition1623);
                    lv_pre1_3_0=rulePrecondition1();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPreconditionRule());
                    	        }
                           		set(
                           			current, 
                           			"pre1",
                            		lv_pre1_3_0, 
                            		"Precondition1");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "rulePrecondition"


    // $ANTLR start "entryRulePrecondition1"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:818:1: entryRulePrecondition1 returns [EObject current=null] : iv_rulePrecondition1= rulePrecondition1 EOF ;
    public final EObject entryRulePrecondition1() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecondition1 = null;


        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:819:2: (iv_rulePrecondition1= rulePrecondition1 EOF )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:820:2: iv_rulePrecondition1= rulePrecondition1 EOF
            {
             newCompositeNode(grammarAccess.getPrecondition1Rule()); 
            pushFollow(FOLLOW_rulePrecondition1_in_entryRulePrecondition11659);
            iv_rulePrecondition1=rulePrecondition1();

            state._fsp--;

             current =iv_rulePrecondition1; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrecondition11669); 

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
    // $ANTLR end "entryRulePrecondition1"


    // $ANTLR start "rulePrecondition1"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:827:1: rulePrecondition1 returns [EObject current=null] : ( ( (lv_pre_0_0= ruleSensorValuePrecondition ) ) | ( (lv_pre_1_0= ruleEmptyPrecondition ) ) ) ;
    public final EObject rulePrecondition1() throws RecognitionException {
        EObject current = null;

        EObject lv_pre_0_0 = null;

        EObject lv_pre_1_0 = null;


         enterRule(); 
            
        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:830:28: ( ( ( (lv_pre_0_0= ruleSensorValuePrecondition ) ) | ( (lv_pre_1_0= ruleEmptyPrecondition ) ) ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:831:1: ( ( (lv_pre_0_0= ruleSensorValuePrecondition ) ) | ( (lv_pre_1_0= ruleEmptyPrecondition ) ) )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:831:1: ( ( (lv_pre_0_0= ruleSensorValuePrecondition ) ) | ( (lv_pre_1_0= ruleEmptyPrecondition ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==EOF||(LA14_1>=33 && LA14_1<=34)) ) {
                    alt14=2;
                }
                else if ( ((LA14_1>=35 && LA14_1<=38)) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:831:2: ( (lv_pre_0_0= ruleSensorValuePrecondition ) )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:831:2: ( (lv_pre_0_0= ruleSensorValuePrecondition ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:832:1: (lv_pre_0_0= ruleSensorValuePrecondition )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:832:1: (lv_pre_0_0= ruleSensorValuePrecondition )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:833:3: lv_pre_0_0= ruleSensorValuePrecondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrecondition1Access().getPreSensorValuePreconditionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSensorValuePrecondition_in_rulePrecondition11715);
                    lv_pre_0_0=ruleSensorValuePrecondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrecondition1Rule());
                    	        }
                           		set(
                           			current, 
                           			"pre",
                            		lv_pre_0_0, 
                            		"SensorValuePrecondition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:850:6: ( (lv_pre_1_0= ruleEmptyPrecondition ) )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:850:6: ( (lv_pre_1_0= ruleEmptyPrecondition ) )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:851:1: (lv_pre_1_0= ruleEmptyPrecondition )
                    {
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:851:1: (lv_pre_1_0= ruleEmptyPrecondition )
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:852:3: lv_pre_1_0= ruleEmptyPrecondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrecondition1Access().getPreEmptyPreconditionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEmptyPrecondition_in_rulePrecondition11742);
                    lv_pre_1_0=ruleEmptyPrecondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrecondition1Rule());
                    	        }
                           		set(
                           			current, 
                           			"pre",
                            		lv_pre_1_0, 
                            		"EmptyPrecondition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "rulePrecondition1"


    // $ANTLR start "entryRuleEmptyPrecondition"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:876:1: entryRuleEmptyPrecondition returns [EObject current=null] : iv_ruleEmptyPrecondition= ruleEmptyPrecondition EOF ;
    public final EObject entryRuleEmptyPrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyPrecondition = null;


        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:877:2: (iv_ruleEmptyPrecondition= ruleEmptyPrecondition EOF )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:878:2: iv_ruleEmptyPrecondition= ruleEmptyPrecondition EOF
            {
             newCompositeNode(grammarAccess.getEmptyPreconditionRule()); 
            pushFollow(FOLLOW_ruleEmptyPrecondition_in_entryRuleEmptyPrecondition1778);
            iv_ruleEmptyPrecondition=ruleEmptyPrecondition();

            state._fsp--;

             current =iv_ruleEmptyPrecondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmptyPrecondition1788); 

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
    // $ANTLR end "entryRuleEmptyPrecondition"


    // $ANTLR start "ruleEmptyPrecondition"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:885:1: ruleEmptyPrecondition returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEmptyPrecondition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:888:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:889:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:889:1: ( (lv_name_0_0= RULE_ID ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:890:1: (lv_name_0_0= RULE_ID )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:890:1: (lv_name_0_0= RULE_ID )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:891:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmptyPrecondition1829); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEmptyPreconditionAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEmptyPreconditionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleEmptyPrecondition"


    // $ANTLR start "entryRuleSensorValuePrecondition"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:915:1: entryRuleSensorValuePrecondition returns [EObject current=null] : iv_ruleSensorValuePrecondition= ruleSensorValuePrecondition EOF ;
    public final EObject entryRuleSensorValuePrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorValuePrecondition = null;


        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:916:2: (iv_ruleSensorValuePrecondition= ruleSensorValuePrecondition EOF )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:917:2: iv_ruleSensorValuePrecondition= ruleSensorValuePrecondition EOF
            {
             newCompositeNode(grammarAccess.getSensorValuePreconditionRule()); 
            pushFollow(FOLLOW_ruleSensorValuePrecondition_in_entryRuleSensorValuePrecondition1869);
            iv_ruleSensorValuePrecondition=ruleSensorValuePrecondition();

            state._fsp--;

             current =iv_ruleSensorValuePrecondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSensorValuePrecondition1879); 

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
    // $ANTLR end "entryRuleSensorValuePrecondition"


    // $ANTLR start "ruleSensorValuePrecondition"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:924:1: ruleSensorValuePrecondition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_cond_1_1= '==' | lv_cond_1_2= '<=' | lv_cond_1_3= '>=' | lv_cond_1_4= '!=' ) ) ) ( (lv_value_2_0= rulePossibleValues ) ) ) ;
    public final EObject ruleSensorValuePrecondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_cond_1_1=null;
        Token lv_cond_1_2=null;
        Token lv_cond_1_3=null;
        Token lv_cond_1_4=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:927:28: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_cond_1_1= '==' | lv_cond_1_2= '<=' | lv_cond_1_3= '>=' | lv_cond_1_4= '!=' ) ) ) ( (lv_value_2_0= rulePossibleValues ) ) ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:928:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_cond_1_1= '==' | lv_cond_1_2= '<=' | lv_cond_1_3= '>=' | lv_cond_1_4= '!=' ) ) ) ( (lv_value_2_0= rulePossibleValues ) ) )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:928:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_cond_1_1= '==' | lv_cond_1_2= '<=' | lv_cond_1_3= '>=' | lv_cond_1_4= '!=' ) ) ) ( (lv_value_2_0= rulePossibleValues ) ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:928:2: ( (otherlv_0= RULE_ID ) ) ( ( (lv_cond_1_1= '==' | lv_cond_1_2= '<=' | lv_cond_1_3= '>=' | lv_cond_1_4= '!=' ) ) ) ( (lv_value_2_0= rulePossibleValues ) )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:928:2: ( (otherlv_0= RULE_ID ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:929:1: (otherlv_0= RULE_ID )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:929:1: (otherlv_0= RULE_ID )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:930:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSensorValuePreconditionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSensorValuePrecondition1924); 

            		newLeafNode(otherlv_0, grammarAccess.getSensorValuePreconditionAccess().getSensorSensorCrossReference_0_0()); 
            	

            }


            }

            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:941:2: ( ( (lv_cond_1_1= '==' | lv_cond_1_2= '<=' | lv_cond_1_3= '>=' | lv_cond_1_4= '!=' ) ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:942:1: ( (lv_cond_1_1= '==' | lv_cond_1_2= '<=' | lv_cond_1_3= '>=' | lv_cond_1_4= '!=' ) )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:942:1: ( (lv_cond_1_1= '==' | lv_cond_1_2= '<=' | lv_cond_1_3= '>=' | lv_cond_1_4= '!=' ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:943:1: (lv_cond_1_1= '==' | lv_cond_1_2= '<=' | lv_cond_1_3= '>=' | lv_cond_1_4= '!=' )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:943:1: (lv_cond_1_1= '==' | lv_cond_1_2= '<=' | lv_cond_1_3= '>=' | lv_cond_1_4= '!=' )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt15=1;
                }
                break;
            case 36:
                {
                alt15=2;
                }
                break;
            case 37:
                {
                alt15=3;
                }
                break;
            case 38:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:944:3: lv_cond_1_1= '=='
                    {
                    lv_cond_1_1=(Token)match(input,35,FOLLOW_35_in_ruleSensorValuePrecondition1944); 

                            newLeafNode(lv_cond_1_1, grammarAccess.getSensorValuePreconditionAccess().getCondEqualsSignEqualsSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSensorValuePreconditionRule());
                    	        }
                           		setWithLastConsumed(current, "cond", lv_cond_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:956:8: lv_cond_1_2= '<='
                    {
                    lv_cond_1_2=(Token)match(input,36,FOLLOW_36_in_ruleSensorValuePrecondition1973); 

                            newLeafNode(lv_cond_1_2, grammarAccess.getSensorValuePreconditionAccess().getCondLessThanSignEqualsSignKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSensorValuePreconditionRule());
                    	        }
                           		setWithLastConsumed(current, "cond", lv_cond_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:968:8: lv_cond_1_3= '>='
                    {
                    lv_cond_1_3=(Token)match(input,37,FOLLOW_37_in_ruleSensorValuePrecondition2002); 

                            newLeafNode(lv_cond_1_3, grammarAccess.getSensorValuePreconditionAccess().getCondGreaterThanSignEqualsSignKeyword_1_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSensorValuePreconditionRule());
                    	        }
                           		setWithLastConsumed(current, "cond", lv_cond_1_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:980:8: lv_cond_1_4= '!='
                    {
                    lv_cond_1_4=(Token)match(input,38,FOLLOW_38_in_ruleSensorValuePrecondition2031); 

                            newLeafNode(lv_cond_1_4, grammarAccess.getSensorValuePreconditionAccess().getCondExclamationMarkEqualsSignKeyword_1_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSensorValuePreconditionRule());
                    	        }
                           		setWithLastConsumed(current, "cond", lv_cond_1_4, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:995:2: ( (lv_value_2_0= rulePossibleValues ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:996:1: (lv_value_2_0= rulePossibleValues )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:996:1: (lv_value_2_0= rulePossibleValues )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:997:3: lv_value_2_0= rulePossibleValues
            {
             
            	        newCompositeNode(grammarAccess.getSensorValuePreconditionAccess().getValuePossibleValuesParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePossibleValues_in_ruleSensorValuePrecondition2068);
            lv_value_2_0=rulePossibleValues();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSensorValuePreconditionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"PossibleValues");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleSensorValuePrecondition"


    // $ANTLR start "entryRulePossibleValues"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1021:1: entryRulePossibleValues returns [String current=null] : iv_rulePossibleValues= rulePossibleValues EOF ;
    public final String entryRulePossibleValues() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePossibleValues = null;


        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1022:2: (iv_rulePossibleValues= rulePossibleValues EOF )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1023:2: iv_rulePossibleValues= rulePossibleValues EOF
            {
             newCompositeNode(grammarAccess.getPossibleValuesRule()); 
            pushFollow(FOLLOW_rulePossibleValues_in_entryRulePossibleValues2105);
            iv_rulePossibleValues=rulePossibleValues();

            state._fsp--;

             current =iv_rulePossibleValues.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePossibleValues2116); 

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
    // $ANTLR end "entryRulePossibleValues"


    // $ANTLR start "rulePossibleValues"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1030:1: rulePossibleValues returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DOUBLE_0= RULE_DOUBLE | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulePossibleValues() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1033:28: ( (this_DOUBLE_0= RULE_DOUBLE | this_INT_1= RULE_INT ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1034:1: (this_DOUBLE_0= RULE_DOUBLE | this_INT_1= RULE_INT )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1034:1: (this_DOUBLE_0= RULE_DOUBLE | this_INT_1= RULE_INT )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_DOUBLE) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_INT) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1034:6: this_DOUBLE_0= RULE_DOUBLE
                    {
                    this_DOUBLE_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rulePossibleValues2156); 

                    		current.merge(this_DOUBLE_0);
                        
                     
                        newLeafNode(this_DOUBLE_0, grammarAccess.getPossibleValuesAccess().getDOUBLETerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1042:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePossibleValues2182); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getPossibleValuesAccess().getINTTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "rulePossibleValues"


    // $ANTLR start "entryRuleTimer"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1057:1: entryRuleTimer returns [EObject current=null] : iv_ruleTimer= ruleTimer EOF ;
    public final EObject entryRuleTimer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimer = null;


        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1058:2: (iv_ruleTimer= ruleTimer EOF )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1059:2: iv_ruleTimer= ruleTimer EOF
            {
             newCompositeNode(grammarAccess.getTimerRule()); 
            pushFollow(FOLLOW_ruleTimer_in_entryRuleTimer2227);
            iv_ruleTimer=ruleTimer();

            state._fsp--;

             current =iv_ruleTimer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimer2237); 

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
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1066:1: ruleTimer returns [EObject current=null] : (otherlv_0= 'action' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'repeat' ( ( (lv_repeattype_3_1= 'ONCE' | lv_repeattype_3_2= 'EVERY' ) ) ) otherlv_4= 'seconds:' ( (lv_timerSecs_5_0= RULE_INT ) ) otherlv_6= ';' ) ;
    public final EObject ruleTimer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_repeattype_3_1=null;
        Token lv_repeattype_3_2=null;
        Token otherlv_4=null;
        Token lv_timerSecs_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1069:28: ( (otherlv_0= 'action' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'repeat' ( ( (lv_repeattype_3_1= 'ONCE' | lv_repeattype_3_2= 'EVERY' ) ) ) otherlv_4= 'seconds:' ( (lv_timerSecs_5_0= RULE_INT ) ) otherlv_6= ';' ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1070:1: (otherlv_0= 'action' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'repeat' ( ( (lv_repeattype_3_1= 'ONCE' | lv_repeattype_3_2= 'EVERY' ) ) ) otherlv_4= 'seconds:' ( (lv_timerSecs_5_0= RULE_INT ) ) otherlv_6= ';' )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1070:1: (otherlv_0= 'action' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'repeat' ( ( (lv_repeattype_3_1= 'ONCE' | lv_repeattype_3_2= 'EVERY' ) ) ) otherlv_4= 'seconds:' ( (lv_timerSecs_5_0= RULE_INT ) ) otherlv_6= ';' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1070:3: otherlv_0= 'action' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'repeat' ( ( (lv_repeattype_3_1= 'ONCE' | lv_repeattype_3_2= 'EVERY' ) ) ) otherlv_4= 'seconds:' ( (lv_timerSecs_5_0= RULE_INT ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleTimer2274); 

                	newLeafNode(otherlv_0, grammarAccess.getTimerAccess().getActionKeyword_0());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1074:1: ( (otherlv_1= RULE_ID ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1075:1: (otherlv_1= RULE_ID )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1075:1: (otherlv_1= RULE_ID )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1076:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTimerRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTimer2294); 

            		newLeafNode(otherlv_1, grammarAccess.getTimerAccess().getEventHandlerEventHandlerCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleTimer2306); 

                	newLeafNode(otherlv_2, grammarAccess.getTimerAccess().getRepeatKeyword_2());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1091:1: ( ( (lv_repeattype_3_1= 'ONCE' | lv_repeattype_3_2= 'EVERY' ) ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1092:1: ( (lv_repeattype_3_1= 'ONCE' | lv_repeattype_3_2= 'EVERY' ) )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1092:1: ( (lv_repeattype_3_1= 'ONCE' | lv_repeattype_3_2= 'EVERY' ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1093:1: (lv_repeattype_3_1= 'ONCE' | lv_repeattype_3_2= 'EVERY' )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1093:1: (lv_repeattype_3_1= 'ONCE' | lv_repeattype_3_2= 'EVERY' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==41) ) {
                alt17=1;
            }
            else if ( (LA17_0==42) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1094:3: lv_repeattype_3_1= 'ONCE'
                    {
                    lv_repeattype_3_1=(Token)match(input,41,FOLLOW_41_in_ruleTimer2326); 

                            newLeafNode(lv_repeattype_3_1, grammarAccess.getTimerAccess().getRepeattypeONCEKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimerRule());
                    	        }
                           		setWithLastConsumed(current, "repeattype", lv_repeattype_3_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1106:8: lv_repeattype_3_2= 'EVERY'
                    {
                    lv_repeattype_3_2=(Token)match(input,42,FOLLOW_42_in_ruleTimer2355); 

                            newLeafNode(lv_repeattype_3_2, grammarAccess.getTimerAccess().getRepeattypeEVERYKeyword_3_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimerRule());
                    	        }
                           		setWithLastConsumed(current, "repeattype", lv_repeattype_3_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleTimer2383); 

                	newLeafNode(otherlv_4, grammarAccess.getTimerAccess().getSecondsKeyword_4());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1125:1: ( (lv_timerSecs_5_0= RULE_INT ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1126:1: (lv_timerSecs_5_0= RULE_INT )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1126:1: (lv_timerSecs_5_0= RULE_INT )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1127:3: lv_timerSecs_5_0= RULE_INT
            {
            lv_timerSecs_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimer2400); 

            			newLeafNode(lv_timerSecs_5_0, grammarAccess.getTimerAccess().getTimerSecsINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTimerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"timerSecs",
                    		lv_timerSecs_5_0, 
                    		"INT");
            	    

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleTimer2417); 

                	newLeafNode(otherlv_6, grammarAccess.getTimerAccess().getSemicolonKeyword_6());
                

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


    // $ANTLR start "entryRuleAlarm"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1155:1: entryRuleAlarm returns [EObject current=null] : iv_ruleAlarm= ruleAlarm EOF ;
    public final EObject entryRuleAlarm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlarm = null;


        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1156:2: (iv_ruleAlarm= ruleAlarm EOF )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1157:2: iv_ruleAlarm= ruleAlarm EOF
            {
             newCompositeNode(grammarAccess.getAlarmRule()); 
            pushFollow(FOLLOW_ruleAlarm_in_entryRuleAlarm2453);
            iv_ruleAlarm=ruleAlarm();

            state._fsp--;

             current =iv_ruleAlarm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlarm2463); 

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
    // $ANTLR end "entryRuleAlarm"


    // $ANTLR start "ruleAlarm"
    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1164:1: ruleAlarm returns [EObject current=null] : (otherlv_0= 'action' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'repeat' ( ( (lv_repeattype_3_1= 'EVERY DAY' | lv_repeattype_3_2= 'EVERY MONDAY' | lv_repeattype_3_3= 'EVERY TUESDAY' | lv_repeattype_3_4= 'EVERY WEDNESDAY' | lv_repeattype_3_5= 'EVERY THURSDAY' | lv_repeattype_3_6= 'EVERY FRIDAY' | lv_repeattype_3_7= 'EVERY SATURDAY' | lv_repeattype_3_8= 'EVERY SUNDAY' ) ) ) otherlv_4= 'hours:' ( (lv_timerHours_5_0= RULE_INT ) ) otherlv_6= 'minutes:' ( (lv_timerMinutes_7_0= RULE_INT ) ) otherlv_8= ';' ) ;
    public final EObject ruleAlarm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_repeattype_3_1=null;
        Token lv_repeattype_3_2=null;
        Token lv_repeattype_3_3=null;
        Token lv_repeattype_3_4=null;
        Token lv_repeattype_3_5=null;
        Token lv_repeattype_3_6=null;
        Token lv_repeattype_3_7=null;
        Token lv_repeattype_3_8=null;
        Token otherlv_4=null;
        Token lv_timerHours_5_0=null;
        Token otherlv_6=null;
        Token lv_timerMinutes_7_0=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1167:28: ( (otherlv_0= 'action' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'repeat' ( ( (lv_repeattype_3_1= 'EVERY DAY' | lv_repeattype_3_2= 'EVERY MONDAY' | lv_repeattype_3_3= 'EVERY TUESDAY' | lv_repeattype_3_4= 'EVERY WEDNESDAY' | lv_repeattype_3_5= 'EVERY THURSDAY' | lv_repeattype_3_6= 'EVERY FRIDAY' | lv_repeattype_3_7= 'EVERY SATURDAY' | lv_repeattype_3_8= 'EVERY SUNDAY' ) ) ) otherlv_4= 'hours:' ( (lv_timerHours_5_0= RULE_INT ) ) otherlv_6= 'minutes:' ( (lv_timerMinutes_7_0= RULE_INT ) ) otherlv_8= ';' ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1168:1: (otherlv_0= 'action' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'repeat' ( ( (lv_repeattype_3_1= 'EVERY DAY' | lv_repeattype_3_2= 'EVERY MONDAY' | lv_repeattype_3_3= 'EVERY TUESDAY' | lv_repeattype_3_4= 'EVERY WEDNESDAY' | lv_repeattype_3_5= 'EVERY THURSDAY' | lv_repeattype_3_6= 'EVERY FRIDAY' | lv_repeattype_3_7= 'EVERY SATURDAY' | lv_repeattype_3_8= 'EVERY SUNDAY' ) ) ) otherlv_4= 'hours:' ( (lv_timerHours_5_0= RULE_INT ) ) otherlv_6= 'minutes:' ( (lv_timerMinutes_7_0= RULE_INT ) ) otherlv_8= ';' )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1168:1: (otherlv_0= 'action' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'repeat' ( ( (lv_repeattype_3_1= 'EVERY DAY' | lv_repeattype_3_2= 'EVERY MONDAY' | lv_repeattype_3_3= 'EVERY TUESDAY' | lv_repeattype_3_4= 'EVERY WEDNESDAY' | lv_repeattype_3_5= 'EVERY THURSDAY' | lv_repeattype_3_6= 'EVERY FRIDAY' | lv_repeattype_3_7= 'EVERY SATURDAY' | lv_repeattype_3_8= 'EVERY SUNDAY' ) ) ) otherlv_4= 'hours:' ( (lv_timerHours_5_0= RULE_INT ) ) otherlv_6= 'minutes:' ( (lv_timerMinutes_7_0= RULE_INT ) ) otherlv_8= ';' )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1168:3: otherlv_0= 'action' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'repeat' ( ( (lv_repeattype_3_1= 'EVERY DAY' | lv_repeattype_3_2= 'EVERY MONDAY' | lv_repeattype_3_3= 'EVERY TUESDAY' | lv_repeattype_3_4= 'EVERY WEDNESDAY' | lv_repeattype_3_5= 'EVERY THURSDAY' | lv_repeattype_3_6= 'EVERY FRIDAY' | lv_repeattype_3_7= 'EVERY SATURDAY' | lv_repeattype_3_8= 'EVERY SUNDAY' ) ) ) otherlv_4= 'hours:' ( (lv_timerHours_5_0= RULE_INT ) ) otherlv_6= 'minutes:' ( (lv_timerMinutes_7_0= RULE_INT ) ) otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleAlarm2500); 

                	newLeafNode(otherlv_0, grammarAccess.getAlarmAccess().getActionKeyword_0());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1172:1: ( (otherlv_1= RULE_ID ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1173:1: (otherlv_1= RULE_ID )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1173:1: (otherlv_1= RULE_ID )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1174:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAlarmRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlarm2520); 

            		newLeafNode(otherlv_1, grammarAccess.getAlarmAccess().getEventHandlerEventHandlerCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleAlarm2532); 

                	newLeafNode(otherlv_2, grammarAccess.getAlarmAccess().getRepeatKeyword_2());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1189:1: ( ( (lv_repeattype_3_1= 'EVERY DAY' | lv_repeattype_3_2= 'EVERY MONDAY' | lv_repeattype_3_3= 'EVERY TUESDAY' | lv_repeattype_3_4= 'EVERY WEDNESDAY' | lv_repeattype_3_5= 'EVERY THURSDAY' | lv_repeattype_3_6= 'EVERY FRIDAY' | lv_repeattype_3_7= 'EVERY SATURDAY' | lv_repeattype_3_8= 'EVERY SUNDAY' ) ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1190:1: ( (lv_repeattype_3_1= 'EVERY DAY' | lv_repeattype_3_2= 'EVERY MONDAY' | lv_repeattype_3_3= 'EVERY TUESDAY' | lv_repeattype_3_4= 'EVERY WEDNESDAY' | lv_repeattype_3_5= 'EVERY THURSDAY' | lv_repeattype_3_6= 'EVERY FRIDAY' | lv_repeattype_3_7= 'EVERY SATURDAY' | lv_repeattype_3_8= 'EVERY SUNDAY' ) )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1190:1: ( (lv_repeattype_3_1= 'EVERY DAY' | lv_repeattype_3_2= 'EVERY MONDAY' | lv_repeattype_3_3= 'EVERY TUESDAY' | lv_repeattype_3_4= 'EVERY WEDNESDAY' | lv_repeattype_3_5= 'EVERY THURSDAY' | lv_repeattype_3_6= 'EVERY FRIDAY' | lv_repeattype_3_7= 'EVERY SATURDAY' | lv_repeattype_3_8= 'EVERY SUNDAY' ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1191:1: (lv_repeattype_3_1= 'EVERY DAY' | lv_repeattype_3_2= 'EVERY MONDAY' | lv_repeattype_3_3= 'EVERY TUESDAY' | lv_repeattype_3_4= 'EVERY WEDNESDAY' | lv_repeattype_3_5= 'EVERY THURSDAY' | lv_repeattype_3_6= 'EVERY FRIDAY' | lv_repeattype_3_7= 'EVERY SATURDAY' | lv_repeattype_3_8= 'EVERY SUNDAY' )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1191:1: (lv_repeattype_3_1= 'EVERY DAY' | lv_repeattype_3_2= 'EVERY MONDAY' | lv_repeattype_3_3= 'EVERY TUESDAY' | lv_repeattype_3_4= 'EVERY WEDNESDAY' | lv_repeattype_3_5= 'EVERY THURSDAY' | lv_repeattype_3_6= 'EVERY FRIDAY' | lv_repeattype_3_7= 'EVERY SATURDAY' | lv_repeattype_3_8= 'EVERY SUNDAY' )
            int alt18=8;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt18=1;
                }
                break;
            case 45:
                {
                alt18=2;
                }
                break;
            case 46:
                {
                alt18=3;
                }
                break;
            case 47:
                {
                alt18=4;
                }
                break;
            case 48:
                {
                alt18=5;
                }
                break;
            case 49:
                {
                alt18=6;
                }
                break;
            case 50:
                {
                alt18=7;
                }
                break;
            case 51:
                {
                alt18=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1192:3: lv_repeattype_3_1= 'EVERY DAY'
                    {
                    lv_repeattype_3_1=(Token)match(input,44,FOLLOW_44_in_ruleAlarm2552); 

                            newLeafNode(lv_repeattype_3_1, grammarAccess.getAlarmAccess().getRepeattypeEVERYDAYKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAlarmRule());
                    	        }
                           		setWithLastConsumed(current, "repeattype", lv_repeattype_3_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1204:8: lv_repeattype_3_2= 'EVERY MONDAY'
                    {
                    lv_repeattype_3_2=(Token)match(input,45,FOLLOW_45_in_ruleAlarm2581); 

                            newLeafNode(lv_repeattype_3_2, grammarAccess.getAlarmAccess().getRepeattypeEVERYMONDAYKeyword_3_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAlarmRule());
                    	        }
                           		setWithLastConsumed(current, "repeattype", lv_repeattype_3_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1216:8: lv_repeattype_3_3= 'EVERY TUESDAY'
                    {
                    lv_repeattype_3_3=(Token)match(input,46,FOLLOW_46_in_ruleAlarm2610); 

                            newLeafNode(lv_repeattype_3_3, grammarAccess.getAlarmAccess().getRepeattypeEVERYTUESDAYKeyword_3_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAlarmRule());
                    	        }
                           		setWithLastConsumed(current, "repeattype", lv_repeattype_3_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1228:8: lv_repeattype_3_4= 'EVERY WEDNESDAY'
                    {
                    lv_repeattype_3_4=(Token)match(input,47,FOLLOW_47_in_ruleAlarm2639); 

                            newLeafNode(lv_repeattype_3_4, grammarAccess.getAlarmAccess().getRepeattypeEVERYWEDNESDAYKeyword_3_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAlarmRule());
                    	        }
                           		setWithLastConsumed(current, "repeattype", lv_repeattype_3_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1240:8: lv_repeattype_3_5= 'EVERY THURSDAY'
                    {
                    lv_repeattype_3_5=(Token)match(input,48,FOLLOW_48_in_ruleAlarm2668); 

                            newLeafNode(lv_repeattype_3_5, grammarAccess.getAlarmAccess().getRepeattypeEVERYTHURSDAYKeyword_3_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAlarmRule());
                    	        }
                           		setWithLastConsumed(current, "repeattype", lv_repeattype_3_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1252:8: lv_repeattype_3_6= 'EVERY FRIDAY'
                    {
                    lv_repeattype_3_6=(Token)match(input,49,FOLLOW_49_in_ruleAlarm2697); 

                            newLeafNode(lv_repeattype_3_6, grammarAccess.getAlarmAccess().getRepeattypeEVERYFRIDAYKeyword_3_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAlarmRule());
                    	        }
                           		setWithLastConsumed(current, "repeattype", lv_repeattype_3_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1264:8: lv_repeattype_3_7= 'EVERY SATURDAY'
                    {
                    lv_repeattype_3_7=(Token)match(input,50,FOLLOW_50_in_ruleAlarm2726); 

                            newLeafNode(lv_repeattype_3_7, grammarAccess.getAlarmAccess().getRepeattypeEVERYSATURDAYKeyword_3_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAlarmRule());
                    	        }
                           		setWithLastConsumed(current, "repeattype", lv_repeattype_3_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1276:8: lv_repeattype_3_8= 'EVERY SUNDAY'
                    {
                    lv_repeattype_3_8=(Token)match(input,51,FOLLOW_51_in_ruleAlarm2755); 

                            newLeafNode(lv_repeattype_3_8, grammarAccess.getAlarmAccess().getRepeattypeEVERYSUNDAYKeyword_3_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAlarmRule());
                    	        }
                           		setWithLastConsumed(current, "repeattype", lv_repeattype_3_8, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,52,FOLLOW_52_in_ruleAlarm2783); 

                	newLeafNode(otherlv_4, grammarAccess.getAlarmAccess().getHoursKeyword_4());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1295:1: ( (lv_timerHours_5_0= RULE_INT ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1296:1: (lv_timerHours_5_0= RULE_INT )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1296:1: (lv_timerHours_5_0= RULE_INT )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1297:3: lv_timerHours_5_0= RULE_INT
            {
            lv_timerHours_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAlarm2800); 

            			newLeafNode(lv_timerHours_5_0, grammarAccess.getAlarmAccess().getTimerHoursINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAlarmRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"timerHours",
                    		lv_timerHours_5_0, 
                    		"INT");
            	    

            }


            }

            otherlv_6=(Token)match(input,53,FOLLOW_53_in_ruleAlarm2817); 

                	newLeafNode(otherlv_6, grammarAccess.getAlarmAccess().getMinutesKeyword_6());
                
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1317:1: ( (lv_timerMinutes_7_0= RULE_INT ) )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1318:1: (lv_timerMinutes_7_0= RULE_INT )
            {
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1318:1: (lv_timerMinutes_7_0= RULE_INT )
            // ../es.usj.raspduino/src-gen/es/usj/raspduino/parser/antlr/internal/InternalRaspduinoDSL.g:1319:3: lv_timerMinutes_7_0= RULE_INT
            {
            lv_timerMinutes_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAlarm2834); 

            			newLeafNode(lv_timerMinutes_7_0, grammarAccess.getAlarmAccess().getTimerMinutesINTTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAlarmRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"timerMinutes",
                    		lv_timerMinutes_7_0, 
                    		"INT");
            	    

            }


            }

            otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleAlarm2851); 

                	newLeafNode(otherlv_8, grammarAccess.getAlarmAccess().getSemicolonKeyword_8());
                

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
    // $ANTLR end "ruleAlarm"

    // Delegated rules


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\12\uffff";
    static final String DFA13_eofS =
        "\1\uffff\1\3\6\uffff\2\3";
    static final String DFA13_minS =
        "\1\4\1\41\2\uffff\4\6\2\41";
    static final String DFA13_maxS =
        "\1\4\1\46\2\uffff\4\7\2\42";
    static final String DFA13_acceptS =
        "\2\uffff\1\1\1\2\6\uffff";
    static final String DFA13_specialS =
        "\12\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1",
            "\2\2\1\4\1\5\1\6\1\7",
            "",
            "",
            "\1\11\1\10",
            "\1\11\1\10",
            "\1\11\1\10",
            "\1\11\1\10",
            "\2\2",
            "\2\2"
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "725:1: ( ( ( (lv_pre1_0_0= rulePrecondition1 ) ) ( ( (lv_op_1_1= '&&' | lv_op_1_2= '||' ) ) ) ( (lv_pre_2_0= rulePrecondition ) ) ) | ( (lv_pre1_3_0= rulePrecondition1 ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel139 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModel156 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleModel176 = new BitSet(new long[]{0x0000008011890000L});
    public static final BitSet FOLLOW_15_in_ruleModel205 = new BitSet(new long[]{0x0000008011890000L});
    public static final BitSet FOLLOW_ruleAbstractDevice_in_ruleModel242 = new BitSet(new long[]{0x0000008011890000L});
    public static final BitSet FOLLOW_ruleEventHandler_in_ruleModel264 = new BitSet(new long[]{0x0000008011010000L});
    public static final BitSet FOLLOW_ruleSensorListener_in_ruleModel286 = new BitSet(new long[]{0x0000008010010000L});
    public static final BitSet FOLLOW_ruleTimer_in_ruleModel308 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_ruleAlarm_in_ruleModel330 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_16_in_ruleModel343 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleModel363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleModel392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDevice_in_entryRuleAbstractDevice444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDevice454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensor_in_ruleAbstractDevice501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActuator_in_ruleAbstractDevice528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensor_in_entryRuleSensor563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSensor573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleSensor610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSensor627 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSensor644 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSensor661 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleSensor684 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSensor710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActuator_in_entryRuleActuator746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActuator756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleActuator793 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActuator810 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleActuator827 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActuator844 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActuator861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventHandler_in_entryRuleEventHandler897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventHandler907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleEventHandler944 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventHandler961 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_ruleChangeActuator_in_ruleEventHandler987 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_ruleEventHandler1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChangeActuator_in_entryRuleChangeActuator1036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChangeActuator1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChangeActuator1091 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleChangeActuator1103 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleChangeActuator1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleChangeActuator1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorListener_in_entryRuleSensorListener1204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSensorListener1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleSensorListener1251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSensorListener1271 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleSensorListener1283 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSensorListener1302 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSensorListener1332 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleSensorListener1349 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSensorListener1366 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleSensorListener1384 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSensorListener1404 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSensorListener1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecondition_in_entryRulePrecondition1452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrecondition1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecondition1_in_rulePrecondition1509 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_33_in_rulePrecondition1529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_34_in_rulePrecondition1558 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePrecondition_in_rulePrecondition1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecondition1_in_rulePrecondition1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecondition1_in_entryRulePrecondition11659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrecondition11669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorValuePrecondition_in_rulePrecondition11715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyPrecondition_in_rulePrecondition11742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyPrecondition_in_entryRuleEmptyPrecondition1778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmptyPrecondition1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmptyPrecondition1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorValuePrecondition_in_entryRuleSensorValuePrecondition1869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSensorValuePrecondition1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSensorValuePrecondition1924 = new BitSet(new long[]{0x0000007800000000L});
    public static final BitSet FOLLOW_35_in_ruleSensorValuePrecondition1944 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_36_in_ruleSensorValuePrecondition1973 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_37_in_ruleSensorValuePrecondition2002 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_38_in_ruleSensorValuePrecondition2031 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rulePossibleValues_in_ruleSensorValuePrecondition2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePossibleValues_in_entryRulePossibleValues2105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePossibleValues2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rulePossibleValues2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePossibleValues2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimer_in_entryRuleTimer2227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimer2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleTimer2274 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTimer2294 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleTimer2306 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_41_in_ruleTimer2326 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_42_in_ruleTimer2355 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleTimer2383 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimer2400 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTimer2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlarm_in_entryRuleAlarm2453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlarm2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleAlarm2500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlarm2520 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleAlarm2532 = new BitSet(new long[]{0x000FF00000000000L});
    public static final BitSet FOLLOW_44_in_ruleAlarm2552 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_45_in_ruleAlarm2581 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_46_in_ruleAlarm2610 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_47_in_ruleAlarm2639 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_48_in_ruleAlarm2668 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_49_in_ruleAlarm2697 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_50_in_ruleAlarm2726 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_51_in_ruleAlarm2755 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleAlarm2783 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAlarm2800 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleAlarm2817 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAlarm2834 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAlarm2851 = new BitSet(new long[]{0x0000000000000002L});

}