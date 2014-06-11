RaspduinoDSL
============

Arduino y Raspberry PI are two embedded systems know because their good quality, reliability, low complexity and low pric, and both of them are capable of being programmed to fi tour needs. Between both of them there are some differences, such as, Arduino implements the Wiring language base on C++, while Raspberry PI can be implemented in Python.
The aim of this thesis is to develop an academic prototype that will act as a framework in the developing of domotic proyects that involve any of this two particular platforms.
The prototype its self defines a DSL languje in the domotic domain. This languaje works as a layer of abstraction and it is independent of the hardware used, leading to a fast and simple development of this kind of proyects.
Through automatic code generation the program expressed in this DSL lenguaje is transalted to each of this plataforms.
This thesis is composed by several chapters in which describing both platforms, the definition of a new DSL lenguaje, the developmente of the academic prototype and the enhance of  the future perspectives towards new developments.

Installation
============
To use this generator simply download the three projects and open them with Eclipse. Then right click on it.unibo.arduino -> Run As -> Eclipse Application. In the new IDE create a new Java project. In the src folder create a new file with .arduino extension.

You have now a Syntax-driven Editor to define a model of the Arduino Meta-Model provided.

This is an Xtext project, so your Eclipse IDE will need the Xtext plugin.
