package es.usj.raspduino.tests
import org.eclipse.xtext.junit4.XtextRunner
import es.usj.raspduino.RaspduinoDSLInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.util.ParseHelper
import static org.junit.Assert.*
import com.google.inject.Inject
import org.junit.Test
import es.usj.raspduino.raspduinoDSL.Model
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.junit4.validation.ValidationTestHelper

@InjectWith(RaspduinoDSLInjectorProvider)
@RunWith(XtextRunner)
class DefinedLanguage {
	@Inject
    ParseHelper<Model> parser
 
    @Inject extension ValidationTestHelper
 
    @Test
    def void testParsingAndLinking() {
        parser.parse("Hello foo from new String()!").assertNoErrors
    }
    
    @Test
    def void testParsingAndLinkingWithMissingVar() {
        parser.parse("
            Hello foo from new String(s)!
        ").assertError(XbasePackage::eINSTANCE.XFeatureCall,
                Diagnostic::LINKING_DIAGNOSTIC,
                "Couldn't resolve reference to JvmIdentifiableElement 's'.")
    }
}