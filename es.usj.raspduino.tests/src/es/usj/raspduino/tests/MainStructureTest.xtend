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

@InjectWith(RaspduinoDSLInjectorProvider)
@RunWith(XtextRunner)
class ParserTest {
	
	@Inject IGenerator underTest
	@Inject ParseHelper<Model> parser
 
	@Test 
	def void generateArduinoFile() {
		val model = parser.parse(
			"Sketch: mySketch
			Hardware: Arduino UNO
		}")
		val fsa = new InMemoryFileSystemAccess()
		underTest.doGenerate(model.eResource, fsa)
		assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT+"mySketch.h"))
	}
	
	@Test
	def void generateArduinoStructure() {
		'''
		Sketch: mySketch
		Hardware: Arduino UNO
		'''.assertCompilesTo(
		'''
		void setup(){
		}
		
		void loop(){
		}
		''')
		}
	
 	@Test 
	def void generateRaspberryFile() {
		val model = parser.parse(
			"Sketch: mySketch
			Hardware: Raspberry Pi
		}")
		val fsa = new InMemoryFileSystemAccess()
		underTest.doGenerate(model.eResource, fsa)
		assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT+"mySketch.py"))
	}
	
	
}