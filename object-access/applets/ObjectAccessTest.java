package applets;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectAccessTest extends Applet {
  private AccessObject obj = new AccessObject();
  private String version = "v0.2";

  @Override
  public void paint(Graphics g) {
    g.drawString("Object Access Test " + version, 10, 20);
  }

  public void canAccess() {}

  // Primitive returns
  public boolean booleanMethod() { return obj.booleanMethod(); }
  public char charMethod() { return obj.charMethod(); }
  public byte byteMethod() { return obj.byteMethod(); }
  public short shortMethod() { return obj.shortMethod(); }
  public int intMethod() { return obj.intMethod(); }
  public long longMethod() { return obj.longMethod(); }
  public float floatMethod() { return obj.floatMethod(); }
  public double doubleMethod() { return obj.doubleMethod(); }
  public String stringMethod() { return obj.stringMethod(); }

  // Object return
  public AccessObject objectMethod() { return new AccessObject(1); }
  public PackagePrivateObject packagePrivateObject() { return new PackagePrivateObject(); }
  public PackagePrivateExtendedObject packagePrivateExtendedObject() { return new PackagePrivateExtendedObject(); }
  public InternalPublicObject internalPublicObject() { return new InternalPublicObject(); }
  public InternalProtectedObject internalProtectedObject() { return new InternalProtectedObject(); }
  public InternalPrivateObject internalPrivateObject() { return new InternalPrivateObject(); }
  public InternalPackagePrivateObject internalPackagePrivateObject() { return new InternalPackagePrivateObject(); }
  public Object anonymousObject() {
    return new Object() {
      public void canAccess() {}
      public boolean booleanMethod() { return true; }
    };
  }

  // Collections
  public AccessObject[] objectArrayMethod() { return new AccessObject[] { new AccessObject(2), new AccessObject(3), new AccessObject(4) }; }
  public ArrayList<AccessObject> arrayListMethod() {
    ArrayList<AccessObject> list = new ArrayList<AccessObject>();
    for (int i = 5; i < 9; i++) {
      list.add(new AccessObject(i));
    }
    return list;
  }

  public class InternalPublicObject {
    public void canAccess() {}
    public boolean booleanMethod() { return true; }
  }
  protected class InternalProtectedObject {
    public void canAccess() {}
    public boolean booleanMethod() { return true; }
  }
  private class InternalPrivateObject {
    public void canAccess() {}
    public boolean booleanMethod() { return true; }
  }
  class InternalPackagePrivateObject {
    public void canAccess() {}
    public boolean booleanMethod() { return true; }
  }
}

class PackagePrivateObject {
  public void canAccess() {}
  public boolean booleanMethod() { return true; }
}

class PackagePrivateExtendedObject extends AccessObject {
  public boolean ppBooleanMethod() { return true; }
}