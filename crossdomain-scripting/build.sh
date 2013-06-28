#!/bin/sh
javac -classpath /Library/Java/Home/lib/plugin.jar applets/CrossDomainTest.java
jar -cfm cross-domain.jar MANIFEST.MF applets/*.class
jarsigner -keystore keystore.jks -storepass password cross-domain.jar selfsigned
