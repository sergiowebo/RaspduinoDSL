package es.usj.raspduino.generator.raspberrypi

import es.usj.raspduino.raspduinoDSL.Model
import es.usj.raspduino.generator.Util

class ActuatorLibrary {
	
	def generateCode(Model model, Util util) {
		var String code = "

import RPi.GPIO as GPIO
GPIO.setmode(GPIO.BCM) 

class Led:
	def __init__(self, p):
		self.pin = p
		self.state = False
		GPIO.setup(self.pin, GPIO.OUT)
		
	def on(self):
		GPIO.output(self.pin,GPIO.HIGH)
		self.state = True
		
	def off(self):
		GPIO.output(self.pin,GPIO.LOW)
		self.state = False
		
	def toggle(self):
		if self.state:
			GPIO.output(self.pin,GPIO.LOW)
			self.state = False
		else:
			GPIO.output(self.pin,GPIO.HIGH)
			self.state = True
	
	def state(self):
		return self.state

";
		
		// Generamos el archivo
		util.genFile("Led","py",code)
	}
}