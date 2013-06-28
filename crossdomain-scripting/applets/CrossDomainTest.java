package applets;

import java.applet.Applet;
import java.awt.Graphics;

import netscape.javascript.JSObject;

public class CrossDomainTest extends Applet {
	private static final long serialVersionUID = 1L;

    @Override
	public void paint(Graphics g) {
		g.drawString("CrossDomain Test", 5, (getHeight()/2)+7);
	}

	public boolean instanceMethod(){
		return true;
	}

	public void roundTrip(String sameThreadCodeToEval, final String differenThreadCodeToEval) {
		JSObject window = JSObject.getWindow(this);
		window.eval(sameThreadCodeToEval);
		try{
			(new Thread(){
				public void run(){
					try {
						JSObject window = JSObject.getWindow(CrossDomainTest.this);
						window.eval(differenThreadCodeToEval);
					} catch (Throwable t) {
						t.printStackTrace();
					}
				}
			}).start();
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
}