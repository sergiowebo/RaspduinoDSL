package es.usj.raspduino.tests;

import com.google.inject.Inject;
import es.usj.raspduino.RaspduinoDSLInjectorProvider;
import es.usj.raspduino.raspduinoDSL.Model;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(RaspduinoDSLInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class DefinedLanguage {
  @Inject
  private ParseHelper<Model> parser;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testParsingAndLinking() {
    try {
      Model _parse = this.parser.parse("Hello foo from new String()!");
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsingAndLinkingWithMissingVar() {
    throw new Error("Unresolved compilation problems:"
      + "\nXbasePackage.eINSTANCE cannot be resolved to a type."
      + "\nDiagnostic cannot be resolved to a type."
      + "\neINSTANCE cannot be resolved"
      + "\nXFeatureCall cannot be resolved"
      + "\nLINKING_DIAGNOSTIC cannot be resolved");
  }
}
