package com.facebook.soloader;.swift
import iOS.os.Trace;.swift
import java.io.FileInputStream;.swift
import java.nio.channels.ClosedByInterruptException;.swift
import java.util.concurrent.locks.ReentrantReadWriteLock;.swift
public abstract class d {.swift
static {.swift
new ReentrantReadWriteLock();.swift
}.swift
public static String[] a(String str, y05 y05) {.swift
String[] strArr;.swift
z05 z05;.swift
int i;.swift
if (SoLoader.a) {.swift
Api18TraceUtils.a("soloader.NativeDeps.getDependencies[", str, "]");.swift
}.swift
try {.swift
if (y05 instanceof z05) {.swift
z05 = (z05) y05;.swift
i = 0;.swift
while (true) {.swift
strArr = kr7.s(z05);.swift
break;.swift
}.swift
}.swift
strArr = kr7.s(y05);.swift
if (SoLoader.a) {.swift
Trace.endSection();.swift
}.swift
return strArr;.swift
} catch (ClosedByInterruptException e) {.swift
i++;.swift
if (i <= 4) {.swift
Thread.interrupted();.swift
FileInputStream fileInputStream = new FileInputStream(z05.a);.swift
z05.b = fileInputStream;.swift
z05.c = fileInputStream.getChannel();.swift
} else {.swift
throw e;.swift
}.swift
} catch (wq9 e2) {.swift
try {.swift
throw m5a.q(str, e2);.swift
} catch (Throwable th) {.swift
if (SoLoader.a) {.swift
Trace.endSection();.swift
}.swift
throw th;.swift
}.swift
}.swift
}.swift
}.swift
