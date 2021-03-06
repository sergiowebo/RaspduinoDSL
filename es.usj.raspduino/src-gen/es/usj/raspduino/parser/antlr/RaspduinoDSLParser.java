/*
* generated by Xtext
*/
package es.usj.raspduino.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import es.usj.raspduino.services.RaspduinoDSLGrammarAccess;

public class RaspduinoDSLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private RaspduinoDSLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected es.usj.raspduino.parser.antlr.internal.InternalRaspduinoDSLParser createParser(XtextTokenStream stream) {
		return new es.usj.raspduino.parser.antlr.internal.InternalRaspduinoDSLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public RaspduinoDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(RaspduinoDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
