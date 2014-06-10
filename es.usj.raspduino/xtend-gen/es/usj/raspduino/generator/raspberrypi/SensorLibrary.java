package es.usj.raspduino.generator.raspberrypi;

import es.usj.raspduino.generator.Util;
import es.usj.raspduino.raspduinoDSL.Model;

@SuppressWarnings("all")
public class SensorLibrary {
  public void generateCode(final Model model, final Util util) {
    String code = "\r\nimport RPi.GPIO as GPIO\r\nGPIO.setmode(GPIO.BCM) \r\n\r\nclass Sensor:\r\n\tdef __init__(self, p):\r\n\t\tself.pin = p\r\n\t\tGPIO.setup(self.pin, GPIO.IN)\r\n\t\t\r\n\tdef readValue(self):\r\n\t\treturn(GPIO.input(self.pin))\r\n";
    util.genFile("Sensor", "py", code);
  }
}
