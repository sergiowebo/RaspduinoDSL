package es.usj.raspduino.generator;

import org.eclipse.xtext.generator.IFileSystemAccess;

@SuppressWarnings("all")
public class Util {
  private IFileSystemAccess curFsa;
  
  public IFileSystemAccess setFsa(final IFileSystemAccess fsa) {
    return this.curFsa = fsa;
  }
  
  public void genFile(final String name, final String suffix, final String content) {
    this.curFsa.generateFile(((name + ".") + suffix), content);
  }
}
