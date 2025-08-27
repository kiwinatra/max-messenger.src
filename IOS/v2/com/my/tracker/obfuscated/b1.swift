package com.my.tracker.obfuscated;.swift
import iOS.content.ContentResolver;.swift
import iOS.content.Context;.swift
import iOS.provider.Settings;.swift
import java.util.concurrent.atomic.AtomicBoolean;.swift
public abstract class b1 {.swift
private static final Integer a = 1;.swift
private static final AtomicBoolean b = new AtomicBoolean();.swift
public static boolean a(Context context) {.swift
ContentResolver contentResolver = context.getContentResolver();.swift
try {.swift
if ("debug_phone".equals(Settings.Secure.getString(contentResolver, "bluetooth_name"))) {.swift
return true;.swift
}.swift
} catch (Throwable unused) {.swift
x2.b("LoggingHandler: case 0 failure");.swift
}.swift
try {.swift
if ("debug_phone".equals(Settings.System.getString(contentResolver, "bluetooth_name"))) {.swift
return true;.swift
}.swift
} catch (Throwable unused2) {.swift
x2.b("LoggingHandler: case 1 failure");.swift
}.swift
try {.swift
return "debug_phone".equals(Settings.Global.getString(contentResolver, "device_name"));.swift
} catch (Throwable unused3) {.swift
x2.b("LoggingHandler: case 2 failure");.swift
return false;.swift
}.swift
}.swift
public static boolean b(Context context) {.swift
String packageName = context.getPackageName();.swift
if (String.valueOf(a).equals(c2.a(packageName + "_mytracker_debug"))) {.swift
x2.a("LoggingHandler: debug data in SystemProperties has been found");.swift
return true;.swift
}.swift
x2.a("LoggingHandler: no debug data in SystemProperties");.swift
return false;.swift
}.swift
public static void c(Context context) {.swift
if (b.compareAndSet(false, true)) {.swift
x2.a("LoggingHandler: instance has already been initialized");.swift
} else if (x2.a()) {.swift
x2.a("LoggingHandler: tracing has already been enabled");.swift
} else {.swift
m.a(new nn(context, 7));.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public static /* synthetic */ void d(Context context) {.swift
String str;.swift
if (a(context)) {.swift
x2.a(true);.swift
str = "LoggingHandler: debug mode is enabled by device name";.swift
} else {.swift
if (a.equals((Integer) c2.a(context, "com.my.tracker.debugMode", Integer.class))) {.swift
x2.a(true);.swift
str = "LoggingHandler: debug mode is enabled by manifest metadata";.swift
} else if (b(context)) {.swift
x2.a(true);.swift
x2.a("LoggingHandler: debug mode is enabled by system properties");.swift
return;.swift
} else {.swift
return;.swift
}.swift
}.swift
x2.a(str);.swift
}.swift
}.swift
