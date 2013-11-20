#!/bin/sh
keytool -genkey -keyalg RSA -alias selfsigned -keystore keystore.jks -storepass password -validity 36500 -keysize 2048