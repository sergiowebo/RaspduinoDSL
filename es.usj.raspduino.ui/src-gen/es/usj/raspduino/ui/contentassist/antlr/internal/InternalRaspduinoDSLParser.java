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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Arduino UNO'", "'Raspberry Pi'", "'Sketch:'", "'Hardware:'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

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


    // $ANTLR start "rule__Model__HardwareAlternatives_3_0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:88:1: rule__Model__HardwareAlternatives_3_0 : ( ( 'Arduino UNO' ) | ( 'Raspberry Pi' ) );
    public final void rule__Model__HardwareAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:92:1: ( ( 'Arduino UNO' ) | ( 'Raspberry Pi' ) )
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
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:93:1: ( 'Arduino UNO' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:93:1: ( 'Arduino UNO' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:94:1: 'Arduino UNO'
                    {
                     before(grammarAccess.getModelAccess().getHardwareArduinoUNOKeyword_3_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Model__HardwareAlternatives_3_0131); 
                     after(grammarAccess.getModelAccess().getHardwareArduinoUNOKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:101:6: ( 'Raspberry Pi' )
                    {
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:101:6: ( 'Raspberry Pi' )
                    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:102:1: 'Raspberry Pi'
                    {
                     before(grammarAccess.getModelAccess().getHardwareRaspberryPiKeyword_3_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Model__HardwareAlternatives_3_0151); 
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


    // $ANTLR start "rule__Model__Group__0"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:116:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:120:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:121:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0183);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0186);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:128:1: rule__Model__Group__0__Impl : ( 'Sketch:' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:132:1: ( ( 'Sketch:' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:133:1: ( 'Sketch:' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:133:1: ( 'Sketch:' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:134:1: 'Sketch:'
            {
             before(grammarAccess.getModelAccess().getSketchKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Model__Group__0__Impl214); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:147:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:151:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:152:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1245);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1248);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:159:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:163:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:164:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:164:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:165:1: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:166:1: ( rule__Model__NameAssignment_1 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:166:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl275);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:176:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:180:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:181:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2305);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2308);
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:188:1: rule__Model__Group__2__Impl : ( 'Hardware:' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:192:1: ( ( 'Hardware:' ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:193:1: ( 'Hardware:' )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:193:1: ( 'Hardware:' )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:194:1: 'Hardware:'
            {
             before(grammarAccess.getModelAccess().getHardwareKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Model__Group__2__Impl336); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:207:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:211:1: ( rule__Model__Group__3__Impl )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:212:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3367);
            rule__Model__Group__3__Impl();

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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:218:1: rule__Model__Group__3__Impl : ( ( rule__Model__HardwareAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:222:1: ( ( ( rule__Model__HardwareAssignment_3 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:223:1: ( ( rule__Model__HardwareAssignment_3 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:223:1: ( ( rule__Model__HardwareAssignment_3 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:224:1: ( rule__Model__HardwareAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getHardwareAssignment_3()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:225:1: ( rule__Model__HardwareAssignment_3 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:225:2: rule__Model__HardwareAssignment_3
            {
            pushFollow(FOLLOW_rule__Model__HardwareAssignment_3_in_rule__Model__Group__3__Impl394);
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


    // $ANTLR start "rule__Model__NameAssignment_1"
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:244:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:248:1: ( ( RULE_ID ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:249:1: ( RULE_ID )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:249:1: ( RULE_ID )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:250:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NameAssignment_1437); 
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
    // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:259:1: rule__Model__HardwareAssignment_3 : ( ( rule__Model__HardwareAlternatives_3_0 ) ) ;
    public final void rule__Model__HardwareAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:263:1: ( ( ( rule__Model__HardwareAlternatives_3_0 ) ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:264:1: ( ( rule__Model__HardwareAlternatives_3_0 ) )
            {
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:264:1: ( ( rule__Model__HardwareAlternatives_3_0 ) )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:265:1: ( rule__Model__HardwareAlternatives_3_0 )
            {
             before(grammarAccess.getModelAccess().getHardwareAlternatives_3_0()); 
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:266:1: ( rule__Model__HardwareAlternatives_3_0 )
            // ../es.usj.raspduino.ui/src-gen/es/usj/raspduino/ui/contentassist/antlr/internal/InternalRaspduinoDSL.g:266:2: rule__Model__HardwareAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Model__HardwareAlternatives_3_0_in_rule__Model__HardwareAssignment_3468);
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Model__HardwareAlternatives_3_0131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Model__HardwareAlternatives_3_0151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Model__Group__0__Impl214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1245 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2305 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Model__Group__2__Impl336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__HardwareAssignment_3_in_rule__Model__Group__3__Impl394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__HardwareAlternatives_3_0_in_rule__Model__HardwareAssignment_3468 = new BitSet(new long[]{0x0000000000000002L});

}