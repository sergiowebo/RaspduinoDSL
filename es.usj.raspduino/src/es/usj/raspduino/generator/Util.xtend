package es.usj.raspduino.generator

import org.eclipse.xtext.generator.IFileSystemAccess

class Util {
	IFileSystemAccess curFsa;
	
	def setFsa(IFileSystemAccess fsa){
		curFsa=fsa;
	}
	
	def genFile(String name, String suffix, String content){
		curFsa.generateFile(name+"."+suffix,content);
	}
}