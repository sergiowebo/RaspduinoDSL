package es.usj.raspduino.generator.raspberrypi

import es.usj.raspduino.raspduinoDSL.Model
import es.usj.raspduino.generator.Util

class SensorLibrary {
	
	def generateCode(Model model, Util util) {
		var String code = "
import RPi.GPIO as GPIO
GPIO.setmode(GPIO.BCM) 

class Sensor:
	def __init__(self, p):
		self.pin = p
		GPIO.setup(self.pin, GPIO.IN)
		
	def readValue(self):
		return(GPIO.input(self.pin))
";
		
		// Generamos el archivo
		util.genFile("Sensor","py",code)
	}
}