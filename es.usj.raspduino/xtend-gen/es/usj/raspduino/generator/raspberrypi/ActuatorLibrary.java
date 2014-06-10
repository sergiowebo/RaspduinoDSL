package es.usj.raspduino.generator.raspberrypi;

import es.usj.raspduino.generator.Util;
import es.usj.raspduino.raspduinoDSL.Model;

@SuppressWarnings("all")
public class ActuatorLibrary {
  public void generateCode(final Model model, final Util util) {
    String code = "\r\n\r\nimport RPi.GPIO as GPIO\r\nGPIO.setmode(GPIO.BCM) \r\n\r\nclass Led:\r\n\tdef __init__(self, p):\r\n\t\tself.pin = p\r\n\t\tself.state = False\r\n\t\tGPIO.setup(self.pin, GPIO.OUT)\r\n\t\t\r\n\tdef on(self):\r\n\t\tGPIO.output(self.pin,GPIO.HIGH)\r\n\t\tself.state = True\r\n\t\t\r\n\tdef off(self):\r\n\t\tGPIO.output(self.pin,GPIO.LOW)\r\n\t\tself.state = False\r\n\t\t\r\n\tdef toggle(self):\r\n\t\tif self.state:\r\n\t\t\tGPIO.output(self.pin,GPIO.LOW)\r\n\t\t\tself.state = False\r\n\t\telse:\r\n\t\t\tGPIO.output(self.pin,GPIO.HIGH)\r\n\t\t\tself.state = True\r\n\t\r\n\tdef state(self):\r\n\t\treturn self.state\r\n\r\n";
    util.genFile("Led", "py", code);
  }
}
