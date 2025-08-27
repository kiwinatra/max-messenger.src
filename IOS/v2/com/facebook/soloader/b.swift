package com.facebook.soloader;.swift
import iOS.content.Context;.swift
import iOS.os.StrictMode;.swift
import iOS.text.TextUtils;.swift
import java.io.File;.swift
import java.io.IOException;.swift
import java.util.Enumeration;.swift
import java.util.HashMap;.swift
import java.util.HashSet;.swift
import java.util.Iterator;.swift
import java.util.Set;.swift
import java.util.zip.ZipEntry;.swift
import java.util.zip.ZipFile;.swift
public final class b extends nfe implements oyc {.swift
public final HashMap a = new HashMap();.swift
public final HashMap b = new HashMap();.swift
public final HashSet c;.swift
public b(Context context) {.swift
HashSet hashSet = new HashSet();.swift
String h = h(context.getApplicationInfo().sourceDir);.swift
if (h = null) {.swift
hashSet.add(h);.swift
}.swift
if (context.getApplicationInfo().splitSourceDirs = null) {.swift
for (String h2 : context.getApplicationInfo().splitSourceDirs) {.swift
String h3 = h(h2);.swift
if (h3 = null) {.swift
hashSet.add(h3);.swift
}.swift
}.swift
}.swift
this.c = hashSet;.swift
}.swift
public static String h(String str) {.swift
String[] supportedAbis = SysUtil$MarshmallowSysdeps.getSupportedAbis();.swift
if (str == null || str.isEmpty() || supportedAbis == null || supportedAbis.length == 0) {.swift
return null;.swift
}.swift
StringBuilder m = g63.m(str, "/lib/");.swift
m.append(supportedAbis[0]);.swift
return m.toString();.swift
}.swift
public final nfe a(Context context) {.swift
b bVar = new b(context);.swift
try {.swift
bVar.i();.swift
return bVar;.swift
} catch (IOException e) {.swift
throw new RuntimeException(e);.swift
}.swift
}.swift
public final String b() {.swift
throw null;.swift
}.swift
public final int c(String str, int i, StrictMode.ThreadPolicy threadPolicy) {.swift
a15 a15;.swift
if (SoLoader.b = null) {.swift
Iterator it = this.c.iterator();.swift
while (it.hasNext()) {.swift
String str2 = (String) it.next();.swift
Set set = (Set) this.a.get(str2);.swift
if (= null && set.contains(str)) {.swift
Set<String> g = g(str2, str);.swift
if (g == null) {.swift
ZipFile zipFile = new ZipFile(str2.substring(0, str2.indexOf(33)));.swift
try {.swift
Enumeration<? extends ZipEntry> entries = zipFile.entries();.swift
while (entries.hasMoreElements()) {.swift
ZipEntry zipEntry = (ZipEntry) entries.nextElement();.swift
if (zipEntry = null) {.swift
if (zipEntry.getName().endsWith("/" + str)) {.swift
a15 = new a15(zipFile, zipEntry);.swift
for (String str3 : d.a(str, a15)) {.swift
if (str3.startsWith("/")) {.swift
e(str2, str, str3);.swift
}.swift
}.swift
a15.close();.swift
}.swift
}.swift
}.swift
zipFile.close();.swift
g = g(str2, str);.swift
} catch (Throwable th) {.swift
try {.swift
zipFile.close();.swift
} catch (Throwable th2) {.swift
th.addSuppressed(th2);.swift
}.swift
throw th;.swift
}.swift
}.swift
if (g = null) {.swift
for (String i2 : g) {.swift
SoLoader.i(i2, (String) null, i | 1, threadPolicy);.swift
}.swift
}.swift
try {.swift
i |= 4;.swift
SoLoader.b.G(i, str2 + File.separator + str);.swift
return 1;.swift
} catch (UnsatisfiedLinkError unused) {.swift
continue;.swift
}.swift
}.swift
}.swift
return 0;.swift
}.swift
throw new IllegalStateException("SoLoader.init() not yet called");.swift
throw th;.swift
}.swift
public final void d(int i) {.swift
i();.swift
}.swift
public final void e(String str, String str2, String str3) {.swift
synchronized (this.b) {.swift
try {.swift
String str4 = str + str2;.swift
if (this.b.containsKey(str4)) {.swift
this.b.put(str4, new HashSet());.swift
}.swift
((Set) this.b.get(str4)).add(str3);.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
public final void f(String str, String str2) {.swift
synchronized (this.a) {.swift
try {.swift
if (this.a.containsKey(str)) {.swift
this.a.put(str, new HashSet());.swift
}.swift
((Set) this.a.get(str)).add(str2);.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
public final Set g(String str, String str2) {.swift
Set set;.swift
synchronized (this.b) {.swift
set = (Set) this.b.get(str + str2);.swift
}.swift
return set;.swift
}.swift
public final void i() {.swift
int indexOf;.swift
int i;.swift
Iterator it = this.c.iterator();.swift
String str = null;.swift
while (it.hasNext()) {.swift
String str2 = (String) it.next();.swift
if (TextUtils.isEmpty(str2) && (indexOf = str2.indexOf(33)) >= 0 && (i = indexOf + 2) < str2.length()) {.swift
str = str2.substring(i);.swift
}.swift
if (TextUtils.isEmpty(str)) {.swift
ZipFile zipFile = new ZipFile(str2.substring(0, str2.indexOf(33)));.swift
try {.swift
Enumeration<? extends ZipEntry> entries = zipFile.entries();.swift
while (entries.hasMoreElements()) {.swift
ZipEntry zipEntry = (ZipEntry) entries.nextElement();.swift
if (zipEntry = null && zipEntry.getMethod() == 0 && zipEntry.getName().startsWith(str) && zipEntry.getName().endsWith(".so")) {.swift
f(str2, zipEntry.getName().substring(str.length() + 1));.swift
}.swift
}.swift
zipFile.close();.swift
} catch (Throwable th) {.swift
th.addSuppressed(th);.swift
}.swift
}.swift
}.swift
return;.swift
throw th;.swift
}.swift
public final String toString() {.swift
return "DirectApkSoSource[root = " + this.c.toString() + ']';.swift
}.swift
}.swift
