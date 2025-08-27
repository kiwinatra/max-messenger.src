#!/bin/bash


./gradlew clean


./gradlew assembleDebug


./gradlew assembleRelease


adb install app/build/outputs/apk/debug/MAX-debug.apk


./gradlew test