package es.usj.raspduino.tests;

import com.google.inject.Inject;
import es.usj.raspduino.RaspduinoDSLInjectorProvider;
import es.usj.raspduino.raspduinoDSL.Model;
import java.util.Map;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(RaspduinoDSLInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class ParserTest {
  @Inject
  private IGenerator underTest;
  
  @Inject
  private ParseHelper<Model> parser;
  
  @Test
  public void generateArduinoFile() {
    try {
      final Model model = this.parser.parse(
        "Sketch: mySketch\r\n\t\t\tHardware: Arduino UNO\r\n\t\t}");
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      Resource _eResource = model.eResource();
      this.underTest.doGenerate(_eResource, fsa);
      Map<String,CharSequence> _files = fsa.getFiles();
      boolean _containsKey = _files.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "mySketch.h"));
      Assert.assertTrue(_containsKey);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void generateArduinoStructure() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method assertCompilesTo is undefined for the type ParserTest");
  }
  
  @Test
  public void generateRaspberryFile() {
    try {
      final Model model = this.parser.parse(
        "Sketch: mySketch\r\n\t\t\tHardware: Raspberry Pi\r\n\t\t}");
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      Resource _eResource = model.eResource();
      this.underTest.doGenerate(_eResource, fsa);
      Map<String,CharSequence> _files = fsa.getFiles();
      boolean _containsKey = _files.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "mySketch.py"));
      Assert.assertTrue(_containsKey);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
