package applets;

import java.applet.Applet;
import java.awt.Graphics;

import netscape.javascript.JSObject;

public class CrossDomainTest extends Applet {
  @Override
  public void paint(Graphics g) {
    g.drawString("CrossDomain Test", 10, 20);
  }

  public boolean instanceMethod(){
    return true;
  }

  public void roundTrip(
  	  String sameThreadCodeToEval,
  	  final String differenThreadCodeToEval) {
    final JSObject window = JSObject.getWindow(this);
    window.eval(sameThreadCodeToEval);
    try{
      (new Thread(){
        public void run(){
          window.eval(differenThreadCodeToEval);
        }
      }).start();
    } catch (Throwable t) {
      t.printStackTrace();
    }
  }
}