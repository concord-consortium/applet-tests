#!/bin/sh
rm object-access.jar
javac applets/ObjectAccessTest.java
jar -cfm object-access.jar MANIFEST.MF applets/*.class
jarsigner -keystore keystore.jks -storepass password object-access.jar selfsigned
