package es.usj.raspduino.generator.arduino;

import es.usj.raspduino.generator.Util;
import es.usj.raspduino.raspduinoDSL.Actuator;
import es.usj.raspduino.raspduinoDSL.ChangeActuator;
import es.usj.raspduino.raspduinoDSL.EventHandler;
import es.usj.raspduino.raspduinoDSL.Model;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class EventsHandlerLibrary {
  public void generateCode(final Model model, final Util util) {
    String code = "";
    EList<EventHandler> handlers = model.getEventHandlers();
    for (final EventHandler h : handlers) {
      {
        String _name = h.getName();
        String _plus = ((code + "void ") + _name);
        String _plus_1 = (_plus + "(){\n");
        code = _plus_1;
        EList<ChangeActuator> ca = h.getChangeActuators();
        for (final ChangeActuator c : ca) {
          Actuator _actuator = c.getActuator();
          String _name_1 = _actuator.getName();
          String _plus_2 = ((code + "\t") + _name_1);
          String _plus_3 = (_plus_2 + ".");
          String _actuatorState = c.getActuatorState();
          String _plus_4 = (_plus_3 + _actuatorState);
          String _plus_5 = (_plus_4 + "();\n");
          code = _plus_5;
        }
        code = (code + "}\n\n");
      }
    }
    util.genFile("EventsHandler", "h", code);
  }
}
