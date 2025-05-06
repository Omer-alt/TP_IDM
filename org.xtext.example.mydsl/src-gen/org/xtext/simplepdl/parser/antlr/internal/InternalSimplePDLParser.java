package org.xtext.simplepdl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.simplepdl.services.SimplePDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimplePDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Process'", "'{'", "'processElements'", "','", "'}'", "'ProcessElement'", "'description'", "'WorkDefinition'", "'duration'", "'startDate'", "'endDate'", "'linksToSuccessor'", "'('", "')'", "'linksToPredecessor'", "'resource'", "'WorkSequence'", "'type'", "'predecessor'", "'successor'", "'-'", "'Humain'", "'role'", "'Materiel'", "'quantite'", "'startToStart'", "'finishToStart'", "'startToFinish'", "'finishToFinish'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSimplePDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimplePDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimplePDLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSimplePDL.g"; }



     	private SimplePDLGrammarAccess grammarAccess;

        public InternalSimplePDLParser(TokenStream input, SimplePDLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Process";
       	}

       	@Override
       	protected SimplePDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProcess"
    // InternalSimplePDL.g:65:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalSimplePDL.g:65:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalSimplePDL.g:66:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalSimplePDL.g:72:1: ruleProcess returns [EObject current=null] : ( () otherlv_1= 'Process' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'processElements' otherlv_5= '{' ( (lv_processElements_6_0= ruleProcessElement ) ) (otherlv_7= ',' ( (lv_processElements_8_0= ruleProcessElement ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_processElements_6_0 = null;

        EObject lv_processElements_8_0 = null;



        	enterRule();

        try {
            // InternalSimplePDL.g:78:2: ( ( () otherlv_1= 'Process' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'processElements' otherlv_5= '{' ( (lv_processElements_6_0= ruleProcessElement ) ) (otherlv_7= ',' ( (lv_processElements_8_0= ruleProcessElement ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalSimplePDL.g:79:2: ( () otherlv_1= 'Process' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'processElements' otherlv_5= '{' ( (lv_processElements_6_0= ruleProcessElement ) ) (otherlv_7= ',' ( (lv_processElements_8_0= ruleProcessElement ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalSimplePDL.g:79:2: ( () otherlv_1= 'Process' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'processElements' otherlv_5= '{' ( (lv_processElements_6_0= ruleProcessElement ) ) (otherlv_7= ',' ( (lv_processElements_8_0= ruleProcessElement ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalSimplePDL.g:80:3: () otherlv_1= 'Process' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'processElements' otherlv_5= '{' ( (lv_processElements_6_0= ruleProcessElement ) ) (otherlv_7= ',' ( (lv_processElements_8_0= ruleProcessElement ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalSimplePDL.g:80:3: ()
            // InternalSimplePDL.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProcessAccess().getProcessAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getProcessKeyword_1());
            		
            // InternalSimplePDL.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSimplePDL.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalSimplePDL.g:92:4: (lv_name_2_0= ruleEString )
            // InternalSimplePDL.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.simplepdl.SimplePDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSimplePDL.g:114:3: (otherlv_4= 'processElements' otherlv_5= '{' ( (lv_processElements_6_0= ruleProcessElement ) ) (otherlv_7= ',' ( (lv_processElements_8_0= ruleProcessElement ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSimplePDL.g:115:4: otherlv_4= 'processElements' otherlv_5= '{' ( (lv_processElements_6_0= ruleProcessElement ) ) (otherlv_7= ',' ( (lv_processElements_8_0= ruleProcessElement ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getProcessElementsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSimplePDL.g:123:4: ( (lv_processElements_6_0= ruleProcessElement ) )
                    // InternalSimplePDL.g:124:5: (lv_processElements_6_0= ruleProcessElement )
                    {
                    // InternalSimplePDL.g:124:5: (lv_processElements_6_0= ruleProcessElement )
                    // InternalSimplePDL.g:125:6: lv_processElements_6_0= ruleProcessElement
                    {

                    						newCompositeNode(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_processElements_6_0=ruleProcessElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessRule());
                    						}
                    						add(
                    							current,
                    							"processElements",
                    							lv_processElements_6_0,
                    							"org.xtext.simplepdl.SimplePDL.ProcessElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimplePDL.g:142:4: (otherlv_7= ',' ( (lv_processElements_8_0= ruleProcessElement ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalSimplePDL.g:143:5: otherlv_7= ',' ( (lv_processElements_8_0= ruleProcessElement ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getProcessAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSimplePDL.g:147:5: ( (lv_processElements_8_0= ruleProcessElement ) )
                    	    // InternalSimplePDL.g:148:6: (lv_processElements_8_0= ruleProcessElement )
                    	    {
                    	    // InternalSimplePDL.g:148:6: (lv_processElements_8_0= ruleProcessElement )
                    	    // InternalSimplePDL.g:149:7: lv_processElements_8_0= ruleProcessElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_processElements_8_0=ruleProcessElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProcessRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"processElements",
                    	    								lv_processElements_8_0,
                    	    								"org.xtext.simplepdl.SimplePDL.ProcessElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessElement"
    // InternalSimplePDL.g:180:1: entryRuleProcessElement returns [EObject current=null] : iv_ruleProcessElement= ruleProcessElement EOF ;
    public final EObject entryRuleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessElement = null;


        try {
            // InternalSimplePDL.g:180:55: (iv_ruleProcessElement= ruleProcessElement EOF )
            // InternalSimplePDL.g:181:2: iv_ruleProcessElement= ruleProcessElement EOF
            {
             newCompositeNode(grammarAccess.getProcessElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessElement=ruleProcessElement();

            state._fsp--;

             current =iv_ruleProcessElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // InternalSimplePDL.g:187:1: ruleProcessElement returns [EObject current=null] : (this_ProcessElement_Impl_0= ruleProcessElement_Impl | this_WorkDefinition_1= ruleWorkDefinition | this_WorkSequence_2= ruleWorkSequence ) ;
    public final EObject ruleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject this_ProcessElement_Impl_0 = null;

        EObject this_WorkDefinition_1 = null;

        EObject this_WorkSequence_2 = null;



        	enterRule();

        try {
            // InternalSimplePDL.g:193:2: ( (this_ProcessElement_Impl_0= ruleProcessElement_Impl | this_WorkDefinition_1= ruleWorkDefinition | this_WorkSequence_2= ruleWorkSequence ) )
            // InternalSimplePDL.g:194:2: (this_ProcessElement_Impl_0= ruleProcessElement_Impl | this_WorkDefinition_1= ruleWorkDefinition | this_WorkSequence_2= ruleWorkSequence )
            {
            // InternalSimplePDL.g:194:2: (this_ProcessElement_Impl_0= ruleProcessElement_Impl | this_WorkDefinition_1= ruleWorkDefinition | this_WorkSequence_2= ruleWorkSequence )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 27:
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
                    // InternalSimplePDL.g:195:3: this_ProcessElement_Impl_0= ruleProcessElement_Impl
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getProcessElement_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProcessElement_Impl_0=ruleProcessElement_Impl();

                    state._fsp--;


                    			current = this_ProcessElement_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSimplePDL.g:204:3: this_WorkDefinition_1= ruleWorkDefinition
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WorkDefinition_1=ruleWorkDefinition();

                    state._fsp--;


                    			current = this_WorkDefinition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSimplePDL.g:213:3: this_WorkSequence_2= ruleWorkSequence
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_WorkSequence_2=ruleWorkSequence();

                    state._fsp--;


                    			current = this_WorkSequence_2;
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
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleResource"
    // InternalSimplePDL.g:225:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalSimplePDL.g:225:49: (iv_ruleResource= ruleResource EOF )
            // InternalSimplePDL.g:226:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalSimplePDL.g:232:1: ruleResource returns [EObject current=null] : (this_Humain_0= ruleHumain | this_Materiel_1= ruleMateriel ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        EObject this_Humain_0 = null;

        EObject this_Materiel_1 = null;



        	enterRule();

        try {
            // InternalSimplePDL.g:238:2: ( (this_Humain_0= ruleHumain | this_Materiel_1= ruleMateriel ) )
            // InternalSimplePDL.g:239:2: (this_Humain_0= ruleHumain | this_Materiel_1= ruleMateriel )
            {
            // InternalSimplePDL.g:239:2: (this_Humain_0= ruleHumain | this_Materiel_1= ruleMateriel )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==32) ) {
                alt4=1;
            }
            else if ( (LA4_0==34) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSimplePDL.g:240:3: this_Humain_0= ruleHumain
                    {

                    			newCompositeNode(grammarAccess.getResourceAccess().getHumainParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Humain_0=ruleHumain();

                    state._fsp--;


                    			current = this_Humain_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSimplePDL.g:249:3: this_Materiel_1= ruleMateriel
                    {

                    			newCompositeNode(grammarAccess.getResourceAccess().getMaterielParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Materiel_1=ruleMateriel();

                    state._fsp--;


                    			current = this_Materiel_1;
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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleProcessElement_Impl"
    // InternalSimplePDL.g:261:1: entryRuleProcessElement_Impl returns [EObject current=null] : iv_ruleProcessElement_Impl= ruleProcessElement_Impl EOF ;
    public final EObject entryRuleProcessElement_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessElement_Impl = null;


        try {
            // InternalSimplePDL.g:261:60: (iv_ruleProcessElement_Impl= ruleProcessElement_Impl EOF )
            // InternalSimplePDL.g:262:2: iv_ruleProcessElement_Impl= ruleProcessElement_Impl EOF
            {
             newCompositeNode(grammarAccess.getProcessElement_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessElement_Impl=ruleProcessElement_Impl();

            state._fsp--;

             current =iv_ruleProcessElement_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcessElement_Impl"


    // $ANTLR start "ruleProcessElement_Impl"
    // InternalSimplePDL.g:268:1: ruleProcessElement_Impl returns [EObject current=null] : ( () otherlv_1= 'ProcessElement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleProcessElement_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalSimplePDL.g:274:2: ( ( () otherlv_1= 'ProcessElement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalSimplePDL.g:275:2: ( () otherlv_1= 'ProcessElement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalSimplePDL.g:275:2: ( () otherlv_1= 'ProcessElement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalSimplePDL.g:276:3: () otherlv_1= 'ProcessElement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalSimplePDL.g:276:3: ()
            // InternalSimplePDL.g:277:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProcessElement_ImplAccess().getProcessElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessElement_ImplAccess().getProcessElementKeyword_1());
            		
            // InternalSimplePDL.g:287:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSimplePDL.g:288:4: (lv_name_2_0= ruleEString )
            {
            // InternalSimplePDL.g:288:4: (lv_name_2_0= ruleEString )
            // InternalSimplePDL.g:289:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProcessElement_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessElement_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.simplepdl.SimplePDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getProcessElement_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSimplePDL.g:310:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSimplePDL.g:311:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getProcessElement_ImplAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalSimplePDL.g:315:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalSimplePDL.g:316:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalSimplePDL.g:316:5: (lv_description_5_0= ruleEString )
                    // InternalSimplePDL.g:317:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getProcessElement_ImplAccess().getDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessElement_ImplRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"org.xtext.simplepdl.SimplePDL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getProcessElement_ImplAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleProcessElement_Impl"


    // $ANTLR start "entryRuleEString"
    // InternalSimplePDL.g:343:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSimplePDL.g:343:47: (iv_ruleEString= ruleEString EOF )
            // InternalSimplePDL.g:344:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSimplePDL.g:350:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSimplePDL.g:356:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSimplePDL.g:357:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSimplePDL.g:357:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSimplePDL.g:358:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSimplePDL.g:366:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalSimplePDL.g:377:1: entryRuleWorkDefinition returns [EObject current=null] : iv_ruleWorkDefinition= ruleWorkDefinition EOF ;
    public final EObject entryRuleWorkDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDefinition = null;


        try {
            // InternalSimplePDL.g:377:55: (iv_ruleWorkDefinition= ruleWorkDefinition EOF )
            // InternalSimplePDL.g:378:2: iv_ruleWorkDefinition= ruleWorkDefinition EOF
            {
             newCompositeNode(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkDefinition=ruleWorkDefinition();

            state._fsp--;

             current =iv_ruleWorkDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalSimplePDL.g:384:1: ruleWorkDefinition returns [EObject current=null] : ( () otherlv_1= 'WorkDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'duration' ( (lv_duration_7_0= ruleEInt ) ) )? (otherlv_8= 'startDate' ( (lv_startDate_9_0= ruleEString ) ) )? (otherlv_10= 'endDate' ( (lv_endDate_11_0= ruleEString ) ) )? (otherlv_12= 'linksToSuccessor' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'linksToPredecessor' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? (otherlv_24= 'resource' otherlv_25= '{' ( (lv_resource_26_0= ruleResource ) ) (otherlv_27= ',' ( (lv_resource_28_0= ruleResource ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) ;
    public final EObject ruleWorkDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        AntlrDatatypeRuleToken lv_duration_7_0 = null;

        AntlrDatatypeRuleToken lv_startDate_9_0 = null;

        AntlrDatatypeRuleToken lv_endDate_11_0 = null;

        EObject lv_resource_26_0 = null;

        EObject lv_resource_28_0 = null;



        	enterRule();

        try {
            // InternalSimplePDL.g:390:2: ( ( () otherlv_1= 'WorkDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'duration' ( (lv_duration_7_0= ruleEInt ) ) )? (otherlv_8= 'startDate' ( (lv_startDate_9_0= ruleEString ) ) )? (otherlv_10= 'endDate' ( (lv_endDate_11_0= ruleEString ) ) )? (otherlv_12= 'linksToSuccessor' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'linksToPredecessor' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? (otherlv_24= 'resource' otherlv_25= '{' ( (lv_resource_26_0= ruleResource ) ) (otherlv_27= ',' ( (lv_resource_28_0= ruleResource ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) )
            // InternalSimplePDL.g:391:2: ( () otherlv_1= 'WorkDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'duration' ( (lv_duration_7_0= ruleEInt ) ) )? (otherlv_8= 'startDate' ( (lv_startDate_9_0= ruleEString ) ) )? (otherlv_10= 'endDate' ( (lv_endDate_11_0= ruleEString ) ) )? (otherlv_12= 'linksToSuccessor' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'linksToPredecessor' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? (otherlv_24= 'resource' otherlv_25= '{' ( (lv_resource_26_0= ruleResource ) ) (otherlv_27= ',' ( (lv_resource_28_0= ruleResource ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            {
            // InternalSimplePDL.g:391:2: ( () otherlv_1= 'WorkDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'duration' ( (lv_duration_7_0= ruleEInt ) ) )? (otherlv_8= 'startDate' ( (lv_startDate_9_0= ruleEString ) ) )? (otherlv_10= 'endDate' ( (lv_endDate_11_0= ruleEString ) ) )? (otherlv_12= 'linksToSuccessor' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'linksToPredecessor' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? (otherlv_24= 'resource' otherlv_25= '{' ( (lv_resource_26_0= ruleResource ) ) (otherlv_27= ',' ( (lv_resource_28_0= ruleResource ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            // InternalSimplePDL.g:392:3: () otherlv_1= 'WorkDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'duration' ( (lv_duration_7_0= ruleEInt ) ) )? (otherlv_8= 'startDate' ( (lv_startDate_9_0= ruleEString ) ) )? (otherlv_10= 'endDate' ( (lv_endDate_11_0= ruleEString ) ) )? (otherlv_12= 'linksToSuccessor' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'linksToPredecessor' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )? (otherlv_24= 'resource' otherlv_25= '{' ( (lv_resource_26_0= ruleResource ) ) (otherlv_27= ',' ( (lv_resource_28_0= ruleResource ) ) )* otherlv_29= '}' )? otherlv_30= '}'
            {
            // InternalSimplePDL.g:392:3: ()
            // InternalSimplePDL.g:393:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWorkDefinitionAccess().getWorkDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkDefinitionAccess().getWorkDefinitionKeyword_1());
            		
            // InternalSimplePDL.g:403:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSimplePDL.g:404:4: (lv_name_2_0= ruleEString )
            {
            // InternalSimplePDL.g:404:4: (lv_name_2_0= ruleEString )
            // InternalSimplePDL.g:405:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWorkDefinitionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.simplepdl.SimplePDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSimplePDL.g:426:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSimplePDL.g:427:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getWorkDefinitionAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalSimplePDL.g:431:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalSimplePDL.g:432:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalSimplePDL.g:432:5: (lv_description_5_0= ruleEString )
                    // InternalSimplePDL.g:433:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"org.xtext.simplepdl.SimplePDL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSimplePDL.g:451:3: (otherlv_6= 'duration' ( (lv_duration_7_0= ruleEInt ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSimplePDL.g:452:4: otherlv_6= 'duration' ( (lv_duration_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getWorkDefinitionAccess().getDurationKeyword_5_0());
                    			
                    // InternalSimplePDL.g:456:4: ( (lv_duration_7_0= ruleEInt ) )
                    // InternalSimplePDL.g:457:5: (lv_duration_7_0= ruleEInt )
                    {
                    // InternalSimplePDL.g:457:5: (lv_duration_7_0= ruleEInt )
                    // InternalSimplePDL.g:458:6: lv_duration_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getDurationEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_duration_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_7_0,
                    							"org.xtext.simplepdl.SimplePDL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSimplePDL.g:476:3: (otherlv_8= 'startDate' ( (lv_startDate_9_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSimplePDL.g:477:4: otherlv_8= 'startDate' ( (lv_startDate_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getWorkDefinitionAccess().getStartDateKeyword_6_0());
                    			
                    // InternalSimplePDL.g:481:4: ( (lv_startDate_9_0= ruleEString ) )
                    // InternalSimplePDL.g:482:5: (lv_startDate_9_0= ruleEString )
                    {
                    // InternalSimplePDL.g:482:5: (lv_startDate_9_0= ruleEString )
                    // InternalSimplePDL.g:483:6: lv_startDate_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getStartDateEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_startDate_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"startDate",
                    							lv_startDate_9_0,
                    							"org.xtext.simplepdl.SimplePDL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSimplePDL.g:501:3: (otherlv_10= 'endDate' ( (lv_endDate_11_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSimplePDL.g:502:4: otherlv_10= 'endDate' ( (lv_endDate_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getWorkDefinitionAccess().getEndDateKeyword_7_0());
                    			
                    // InternalSimplePDL.g:506:4: ( (lv_endDate_11_0= ruleEString ) )
                    // InternalSimplePDL.g:507:5: (lv_endDate_11_0= ruleEString )
                    {
                    // InternalSimplePDL.g:507:5: (lv_endDate_11_0= ruleEString )
                    // InternalSimplePDL.g:508:6: lv_endDate_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getEndDateEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_endDate_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"endDate",
                    							lv_endDate_11_0,
                    							"org.xtext.simplepdl.SimplePDL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSimplePDL.g:526:3: (otherlv_12= 'linksToSuccessor' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSimplePDL.g:527:4: otherlv_12= 'linksToSuccessor' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_12, grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalSimplePDL.g:535:4: ( ( ruleEString ) )
                    // InternalSimplePDL.g:536:5: ( ruleEString )
                    {
                    // InternalSimplePDL.g:536:5: ( ruleEString )
                    // InternalSimplePDL.g:537:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWorkDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorWorkSequenceCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimplePDL.g:551:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSimplePDL.g:552:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getWorkDefinitionAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalSimplePDL.g:556:5: ( ( ruleEString ) )
                    	    // InternalSimplePDL.g:557:6: ( ruleEString )
                    	    {
                    	    // InternalSimplePDL.g:557:6: ( ruleEString )
                    	    // InternalSimplePDL.g:558:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWorkDefinitionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorWorkSequenceCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,24,FOLLOW_18); 

                    				newLeafNode(otherlv_17, grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalSimplePDL.g:578:3: (otherlv_18= 'linksToPredecessor' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSimplePDL.g:579:4: otherlv_18= 'linksToPredecessor' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')'
                    {
                    otherlv_18=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_18, grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorKeyword_9_0());
                    			
                    otherlv_19=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalSimplePDL.g:587:4: ( ( ruleEString ) )
                    // InternalSimplePDL.g:588:5: ( ruleEString )
                    {
                    // InternalSimplePDL.g:588:5: ( ruleEString )
                    // InternalSimplePDL.g:589:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWorkDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorWorkSequenceCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimplePDL.g:603:4: (otherlv_21= ',' ( ( ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalSimplePDL.g:604:5: otherlv_21= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_21=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getWorkDefinitionAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalSimplePDL.g:608:5: ( ( ruleEString ) )
                    	    // InternalSimplePDL.g:609:6: ( ruleEString )
                    	    {
                    	    // InternalSimplePDL.g:609:6: ( ruleEString )
                    	    // InternalSimplePDL.g:610:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWorkDefinitionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorWorkSequenceCrossReference_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,24,FOLLOW_19); 

                    				newLeafNode(otherlv_23, grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalSimplePDL.g:630:3: (otherlv_24= 'resource' otherlv_25= '{' ( (lv_resource_26_0= ruleResource ) ) (otherlv_27= ',' ( (lv_resource_28_0= ruleResource ) ) )* otherlv_29= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSimplePDL.g:631:4: otherlv_24= 'resource' otherlv_25= '{' ( (lv_resource_26_0= ruleResource ) ) (otherlv_27= ',' ( (lv_resource_28_0= ruleResource ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,26,FOLLOW_4); 

                    				newLeafNode(otherlv_24, grammarAccess.getWorkDefinitionAccess().getResourceKeyword_10_0());
                    			
                    otherlv_25=(Token)match(input,12,FOLLOW_20); 

                    				newLeafNode(otherlv_25, grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalSimplePDL.g:639:4: ( (lv_resource_26_0= ruleResource ) )
                    // InternalSimplePDL.g:640:5: (lv_resource_26_0= ruleResource )
                    {
                    // InternalSimplePDL.g:640:5: (lv_resource_26_0= ruleResource )
                    // InternalSimplePDL.g:641:6: lv_resource_26_0= ruleResource
                    {

                    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getResourceResourceParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_resource_26_0=ruleResource();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"resource",
                    							lv_resource_26_0,
                    							"org.xtext.simplepdl.SimplePDL.Resource");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimplePDL.g:658:4: (otherlv_27= ',' ( (lv_resource_28_0= ruleResource ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalSimplePDL.g:659:5: otherlv_27= ',' ( (lv_resource_28_0= ruleResource ) )
                    	    {
                    	    otherlv_27=(Token)match(input,14,FOLLOW_20); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getWorkDefinitionAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalSimplePDL.g:663:5: ( (lv_resource_28_0= ruleResource ) )
                    	    // InternalSimplePDL.g:664:6: (lv_resource_28_0= ruleResource )
                    	    {
                    	    // InternalSimplePDL.g:664:6: (lv_resource_28_0= ruleResource )
                    	    // InternalSimplePDL.g:665:7: lv_resource_28_0= ruleResource
                    	    {

                    	    							newCompositeNode(grammarAccess.getWorkDefinitionAccess().getResourceResourceParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_resource_28_0=ruleResource();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"resource",
                    	    								lv_resource_28_0,
                    	    								"org.xtext.simplepdl.SimplePDL.Resource");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_29, grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_30=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalSimplePDL.g:696:1: entryRuleWorkSequence returns [EObject current=null] : iv_ruleWorkSequence= ruleWorkSequence EOF ;
    public final EObject entryRuleWorkSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequence = null;


        try {
            // InternalSimplePDL.g:696:53: (iv_ruleWorkSequence= ruleWorkSequence EOF )
            // InternalSimplePDL.g:697:2: iv_ruleWorkSequence= ruleWorkSequence EOF
            {
             newCompositeNode(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkSequence=ruleWorkSequence();

            state._fsp--;

             current =iv_ruleWorkSequence; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalSimplePDL.g:703:1: ruleWorkSequence returns [EObject current=null] : (otherlv_0= 'WorkSequence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleWorkSequenceType ) ) )? otherlv_7= 'predecessor' ( ( ruleEString ) ) otherlv_9= 'successor' ( ( ruleEString ) ) otherlv_11= '}' ) ;
    public final EObject ruleWorkSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        Enumerator lv_type_6_0 = null;



        	enterRule();

        try {
            // InternalSimplePDL.g:709:2: ( (otherlv_0= 'WorkSequence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleWorkSequenceType ) ) )? otherlv_7= 'predecessor' ( ( ruleEString ) ) otherlv_9= 'successor' ( ( ruleEString ) ) otherlv_11= '}' ) )
            // InternalSimplePDL.g:710:2: (otherlv_0= 'WorkSequence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleWorkSequenceType ) ) )? otherlv_7= 'predecessor' ( ( ruleEString ) ) otherlv_9= 'successor' ( ( ruleEString ) ) otherlv_11= '}' )
            {
            // InternalSimplePDL.g:710:2: (otherlv_0= 'WorkSequence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleWorkSequenceType ) ) )? otherlv_7= 'predecessor' ( ( ruleEString ) ) otherlv_9= 'successor' ( ( ruleEString ) ) otherlv_11= '}' )
            // InternalSimplePDL.g:711:3: otherlv_0= 'WorkSequence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleWorkSequenceType ) ) )? otherlv_7= 'predecessor' ( ( ruleEString ) ) otherlv_9= 'successor' ( ( ruleEString ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkSequenceAccess().getWorkSequenceKeyword_0());
            		
            // InternalSimplePDL.g:715:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSimplePDL.g:716:4: (lv_name_1_0= ruleEString )
            {
            // InternalSimplePDL.g:716:4: (lv_name_1_0= ruleEString )
            // InternalSimplePDL.g:717:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWorkSequenceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkSequenceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.simplepdl.SimplePDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkSequenceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSimplePDL.g:738:3: (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSimplePDL.g:739:4: otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getWorkSequenceAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalSimplePDL.g:743:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalSimplePDL.g:744:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalSimplePDL.g:744:5: (lv_description_4_0= ruleEString )
                    // InternalSimplePDL.g:745:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWorkSequenceAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkSequenceRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.xtext.simplepdl.SimplePDL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSimplePDL.g:763:3: (otherlv_5= 'type' ( (lv_type_6_0= ruleWorkSequenceType ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSimplePDL.g:764:4: otherlv_5= 'type' ( (lv_type_6_0= ruleWorkSequenceType ) )
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_23); 

                    				newLeafNode(otherlv_5, grammarAccess.getWorkSequenceAccess().getTypeKeyword_4_0());
                    			
                    // InternalSimplePDL.g:768:4: ( (lv_type_6_0= ruleWorkSequenceType ) )
                    // InternalSimplePDL.g:769:5: (lv_type_6_0= ruleWorkSequenceType )
                    {
                    // InternalSimplePDL.g:769:5: (lv_type_6_0= ruleWorkSequenceType )
                    // InternalSimplePDL.g:770:6: lv_type_6_0= ruleWorkSequenceType
                    {

                    						newCompositeNode(grammarAccess.getWorkSequenceAccess().getTypeWorkSequenceTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_type_6_0=ruleWorkSequenceType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkSequenceRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"org.xtext.simplepdl.SimplePDL.WorkSequenceType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getWorkSequenceAccess().getPredecessorKeyword_5());
            		
            // InternalSimplePDL.g:792:3: ( ( ruleEString ) )
            // InternalSimplePDL.g:793:4: ( ruleEString )
            {
            // InternalSimplePDL.g:793:4: ( ruleEString )
            // InternalSimplePDL.g:794:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_6_0());
            				
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getWorkSequenceAccess().getSuccessorKeyword_7());
            		
            // InternalSimplePDL.g:812:3: ( ( ruleEString ) )
            // InternalSimplePDL.g:813:4: ( ruleEString )
            {
            // InternalSimplePDL.g:813:4: ( ruleEString )
            // InternalSimplePDL.g:814:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_8_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getWorkSequenceAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleEInt"
    // InternalSimplePDL.g:836:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSimplePDL.g:836:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSimplePDL.g:837:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSimplePDL.g:843:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSimplePDL.g:849:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSimplePDL.g:850:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSimplePDL.g:850:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSimplePDL.g:851:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSimplePDL.g:851:3: (kw= '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSimplePDL.g:852:4: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_26); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleHumain"
    // InternalSimplePDL.g:869:1: entryRuleHumain returns [EObject current=null] : iv_ruleHumain= ruleHumain EOF ;
    public final EObject entryRuleHumain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHumain = null;


        try {
            // InternalSimplePDL.g:869:47: (iv_ruleHumain= ruleHumain EOF )
            // InternalSimplePDL.g:870:2: iv_ruleHumain= ruleHumain EOF
            {
             newCompositeNode(grammarAccess.getHumainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHumain=ruleHumain();

            state._fsp--;

             current =iv_ruleHumain; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHumain"


    // $ANTLR start "ruleHumain"
    // InternalSimplePDL.g:876:1: ruleHumain returns [EObject current=null] : ( () otherlv_1= 'Humain' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'role' ( (lv_role_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleHumain() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_role_5_0 = null;



        	enterRule();

        try {
            // InternalSimplePDL.g:882:2: ( ( () otherlv_1= 'Humain' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'role' ( (lv_role_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalSimplePDL.g:883:2: ( () otherlv_1= 'Humain' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'role' ( (lv_role_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalSimplePDL.g:883:2: ( () otherlv_1= 'Humain' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'role' ( (lv_role_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalSimplePDL.g:884:3: () otherlv_1= 'Humain' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'role' ( (lv_role_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalSimplePDL.g:884:3: ()
            // InternalSimplePDL.g:885:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHumainAccess().getHumainAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getHumainAccess().getHumainKeyword_1());
            		
            // InternalSimplePDL.g:895:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSimplePDL.g:896:4: (lv_name_2_0= ruleEString )
            {
            // InternalSimplePDL.g:896:4: (lv_name_2_0= ruleEString )
            // InternalSimplePDL.g:897:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getHumainAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHumainRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.simplepdl.SimplePDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getHumainAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSimplePDL.g:918:3: (otherlv_4= 'role' ( (lv_role_5_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSimplePDL.g:919:4: otherlv_4= 'role' ( (lv_role_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getHumainAccess().getRoleKeyword_4_0());
                    			
                    // InternalSimplePDL.g:923:4: ( (lv_role_5_0= ruleEString ) )
                    // InternalSimplePDL.g:924:5: (lv_role_5_0= ruleEString )
                    {
                    // InternalSimplePDL.g:924:5: (lv_role_5_0= ruleEString )
                    // InternalSimplePDL.g:925:6: lv_role_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getHumainAccess().getRoleEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_role_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHumainRule());
                    						}
                    						set(
                    							current,
                    							"role",
                    							lv_role_5_0,
                    							"org.xtext.simplepdl.SimplePDL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getHumainAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleHumain"


    // $ANTLR start "entryRuleMateriel"
    // InternalSimplePDL.g:951:1: entryRuleMateriel returns [EObject current=null] : iv_ruleMateriel= ruleMateriel EOF ;
    public final EObject entryRuleMateriel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMateriel = null;


        try {
            // InternalSimplePDL.g:951:49: (iv_ruleMateriel= ruleMateriel EOF )
            // InternalSimplePDL.g:952:2: iv_ruleMateriel= ruleMateriel EOF
            {
             newCompositeNode(grammarAccess.getMaterielRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMateriel=ruleMateriel();

            state._fsp--;

             current =iv_ruleMateriel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMateriel"


    // $ANTLR start "ruleMateriel"
    // InternalSimplePDL.g:958:1: ruleMateriel returns [EObject current=null] : ( () otherlv_1= 'Materiel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'quantite' ( (lv_quantite_5_0= ruleEInt ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleMateriel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_quantite_5_0 = null;



        	enterRule();

        try {
            // InternalSimplePDL.g:964:2: ( ( () otherlv_1= 'Materiel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'quantite' ( (lv_quantite_5_0= ruleEInt ) ) )? otherlv_6= '}' ) )
            // InternalSimplePDL.g:965:2: ( () otherlv_1= 'Materiel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'quantite' ( (lv_quantite_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            {
            // InternalSimplePDL.g:965:2: ( () otherlv_1= 'Materiel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'quantite' ( (lv_quantite_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            // InternalSimplePDL.g:966:3: () otherlv_1= 'Materiel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'quantite' ( (lv_quantite_5_0= ruleEInt ) ) )? otherlv_6= '}'
            {
            // InternalSimplePDL.g:966:3: ()
            // InternalSimplePDL.g:967:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMaterielAccess().getMaterielAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMaterielAccess().getMaterielKeyword_1());
            		
            // InternalSimplePDL.g:977:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSimplePDL.g:978:4: (lv_name_2_0= ruleEString )
            {
            // InternalSimplePDL.g:978:4: (lv_name_2_0= ruleEString )
            // InternalSimplePDL.g:979:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMaterielAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaterielRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.simplepdl.SimplePDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getMaterielAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSimplePDL.g:1000:3: (otherlv_4= 'quantite' ( (lv_quantite_5_0= ruleEInt ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSimplePDL.g:1001:4: otherlv_4= 'quantite' ( (lv_quantite_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getMaterielAccess().getQuantiteKeyword_4_0());
                    			
                    // InternalSimplePDL.g:1005:4: ( (lv_quantite_5_0= ruleEInt ) )
                    // InternalSimplePDL.g:1006:5: (lv_quantite_5_0= ruleEInt )
                    {
                    // InternalSimplePDL.g:1006:5: (lv_quantite_5_0= ruleEInt )
                    // InternalSimplePDL.g:1007:6: lv_quantite_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getMaterielAccess().getQuantiteEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_quantite_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMaterielRule());
                    						}
                    						set(
                    							current,
                    							"quantite",
                    							lv_quantite_5_0,
                    							"org.xtext.simplepdl.SimplePDL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMaterielAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMateriel"


    // $ANTLR start "ruleWorkSequenceType"
    // InternalSimplePDL.g:1033:1: ruleWorkSequenceType returns [Enumerator current=null] : ( (enumLiteral_0= 'startToStart' ) | (enumLiteral_1= 'finishToStart' ) | (enumLiteral_2= 'startToFinish' ) | (enumLiteral_3= 'finishToFinish' ) ) ;
    public final Enumerator ruleWorkSequenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSimplePDL.g:1039:2: ( ( (enumLiteral_0= 'startToStart' ) | (enumLiteral_1= 'finishToStart' ) | (enumLiteral_2= 'startToFinish' ) | (enumLiteral_3= 'finishToFinish' ) ) )
            // InternalSimplePDL.g:1040:2: ( (enumLiteral_0= 'startToStart' ) | (enumLiteral_1= 'finishToStart' ) | (enumLiteral_2= 'startToFinish' ) | (enumLiteral_3= 'finishToFinish' ) )
            {
            // InternalSimplePDL.g:1040:2: ( (enumLiteral_0= 'startToStart' ) | (enumLiteral_1= 'finishToStart' ) | (enumLiteral_2= 'startToFinish' ) | (enumLiteral_3= 'finishToFinish' ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt22=1;
                }
                break;
            case 37:
                {
                alt22=2;
                }
                break;
            case 38:
                {
                alt22=3;
                }
                break;
            case 39:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalSimplePDL.g:1041:3: (enumLiteral_0= 'startToStart' )
                    {
                    // InternalSimplePDL.g:1041:3: (enumLiteral_0= 'startToStart' )
                    // InternalSimplePDL.g:1042:4: enumLiteral_0= 'startToStart'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSimplePDL.g:1049:3: (enumLiteral_1= 'finishToStart' )
                    {
                    // InternalSimplePDL.g:1049:3: (enumLiteral_1= 'finishToStart' )
                    // InternalSimplePDL.g:1050:4: enumLiteral_1= 'finishToStart'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSimplePDL.g:1057:3: (enumLiteral_2= 'startToFinish' )
                    {
                    // InternalSimplePDL.g:1057:3: (enumLiteral_2= 'startToFinish' )
                    // InternalSimplePDL.g:1058:4: enumLiteral_2= 'startToFinish'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSimplePDL.g:1065:3: (enumLiteral_3= 'finishToFinish' )
                    {
                    // InternalSimplePDL.g:1065:3: (enumLiteral_3= 'finishToFinish' )
                    // InternalSimplePDL.g:1066:4: enumLiteral_3= 'finishToFinish'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleWorkSequenceType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008050000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000067A8000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000006788000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000006708000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000006608000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000006408000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000006008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000030020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800008000L});

}