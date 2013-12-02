#!/bin/sh
cd applets
javac *.java
jar -cf hello.jar *.class
pack200 hello.jar.pack.gz hello.jar
rm hello.jar
rm *.class
cd -