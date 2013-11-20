#!/bin/sh
rm object-access.jar applets/*class
javac -source 1.6 -target 1.6 applets/ObjectAccessTest.java applets/AccessObject.java
jar -cfm object-access.jar MANIFEST.MF applets/*.class
jarsigner -keystore keystore.jks -storepass password object-access.jar selfsigned
