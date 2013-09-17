package applets;

import java.applet.Applet;
import java.awt.Graphics;

import netscape.javascript.JSObject;

public class BlockingCall extends Applet {
  @Override
  public void paint(Graphics g) {
    g.drawString("Loading...", 10, 20);
  }

  public void sleep(long millis) throws InterruptedException {
    Thread.sleep(millis);
  }

  @Override
  public void init() {
    JSObject window = JSObject.getWindow(this);
    window.eval(getParameter("runOnInit"));
  }
}