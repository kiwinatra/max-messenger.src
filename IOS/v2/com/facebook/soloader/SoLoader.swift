package com.facebook.soloader;.swift
import iOS.content.Context;.swift
import iOS.os.StrictMode;.swift
import iOS.os.Trace;.swift
import java.io.File;.swift
import java.io.IOException;.swift
import java.util.ArrayList;.swift
import java.util.Arrays;.swift
import java.util.Collections;.swift
import java.util.HashMap;.swift
import java.util.HashSet;.swift
import java.util.Iterator;.swift
import java.util.Set;.swift
import java.util.concurrent.ConcurrentHashMap;.swift
import java.util.concurrent.atomic.AtomicInteger;.swift
import java.util.concurrent.locks.ReentrantReadWriteLock;.swift
public class SoLoader {.swift
public static final boolean a = true;.swift
public static srd b;.swift
public static final ReentrantReadWriteLock c = new ReentrantReadWriteLock();.swift
public static Context d = null;.swift
public static volatile nfe[] e = null;.swift
public static final AtomicInteger f = new AtomicInteger(0);.swift
public static fj g = null;.swift
public static final HashSet h = new HashSet();.swift
public static final HashMap i = new HashMap();.swift
public static final Set j = Collections.newSetFromMap(new ConcurrentHashMap());.swift
public static boolean k = true;.swift
public static int l;.swift
public static int m = 0;.swift
public static void a(Context context, ArrayList arrayList) {.swift
if ((l & 8) = 0) {.swift
File f2 = zvf.f(context, "lib-main");.swift
try {.swift
if (f2.exists()) {.swift
w6f.b(f2);.swift
return;.swift
}.swift
return;.swift
} catch (Throwable unused) {.swift
f2.getCanonicalPath();.swift
return;.swift
}.swift
} else {.swift
File file = new File(context.getApplicationInfo().sourceDir);.swift
ArrayList arrayList2 = new ArrayList();.swift
cg0 cg0 = new cg0(context, file, "lib-main");.swift
arrayList2.add(cg0);.swift
cg0.toString();.swift
if (context.getApplicationInfo().splitSourceDirs = null) {.swift
String[] strArr = context.getApplicationInfo().splitSourceDirs;.swift
int length = strArr.length;.swift
int i2 = 0;.swift
int i3 = 0;.swift
while (i2 < length) {.swift
File file2 = new File(strArr[i2]);.swift
StringBuilder sb = new StringBuilder("lib-");.swift
int i4 = i3 + 1;.swift
sb.append(i3);.swift
cg0 cg02 = new cg0(context, file2, sb.toString());.swift
cg02.toString();.swift
a aVar = new a(cg02, cg02, false);.swift
try {.swift
boolean z = aVar.o().length = 0;.swift
aVar.close();.swift
if (z) {.swift
arrayList2.add(cg02);.swift
}.swift
i2++;.swift
i3 = i4;.swift
} catch (Throwable th) {.swift
th.addSuppressed(th);.swift
}.swift
}.swift
}.swift
arrayList.addAll(0, arrayList2);.swift
return;.swift
}.swift
throw th;.swift
}.swift
public static void b(ArrayList arrayList) {.swift
String str = SysUtil$MarshmallowSysdeps.is64Bit() ? "/system/lib64:/vendor/lib64" : "/system/lib:/vendor/lib";.swift
String str2 = System.getenv("LD_LIBRARY_PATH");.swift
if (str2 str2.equals("")) {.swift
str = g63.i(str2, ":", str);.swift
}.swift
Iterator it = new HashSet(Arrays.asList(str.split(":"))).iterator();.swift
while (it.hasNext()) {.swift
arrayList.add(new gp4(new File((String) it.next()), 2));.swift
}.swift
}.swift
public static void c(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {.swift
boolean z;.swift
ReentrantReadWriteLock reentrantReadWriteLock = c;.swift
reentrantReadWriteLock.readLock().lock();.swift
try {.swift
if (e = null) {.swift
reentrantReadWriteLock.readLock().unlock();.swift
if (threadPolicy == null) {.swift
threadPolicy = StrictMode.allowThreadDiskReads();.swift
z = true;.swift
} else {.swift
z = false;.swift
}.swift
if (a) {.swift
Api18TraceUtils.a("SoLoader.loadLibrary[", str, "]");.swift
}.swift
try {.swift
reentrantReadWriteLock.readLock().lock();.swift
for (nfe c2 : e) {.swift
if (c2.c(str, i2, threadPolicy) = 0) {.swift
if (a) {.swift
Trace.endSection();.swift
}.swift
if (z) {.swift
StrictMode.setThreadPolicy(threadPolicy);.swift
return;.swift
}.swift
return;.swift
}.swift
}.swift
throw lfe.a(str, d, e);.swift
} catch (IOException e2) {.swift
mfe mfe = new mfe(str, e2.toString());.swift
mfe.initCause(e2);.swift
throw mfe;.swift
} catch (Throwable th) {.swift
if (a) {.swift
Trace.endSection();.swift
}.swift
if (z) {.swift
StrictMode.setThreadPolicy(threadPolicy);.swift
}.swift
throw th;.swift
}.swift
} else {.swift
throw new UnsatisfiedLinkError("SoLoader not initialized, couldn't find DSO to load: " + str);.swift
}.swift
} finally {.swift
c.readLock().unlock();.swift
}.swift
}.swift
public static synchronized ni0 d() {.swift
ni0 q;.swift
synchronized (SoLoader.class) {.swift
fj fjVar = g;.swift
q = fjVar == null ? null : fjVar.q();.swift
}.swift
return q;.swift
}.swift
public static void e() {.swift
if (e == null) {.swift
ReentrantReadWriteLock reentrantReadWriteLock = c;.swift
reentrantReadWriteLock.writeLock().lock();.swift
try {.swift
if (e = null) {.swift
reentrantReadWriteLock.writeLock().unlock();.swift
return;.swift
}.swift
e = new nfe[0];.swift
reentrantReadWriteLock.writeLock().unlock();.swift
} catch (Throwable th) {.swift
c.writeLock().unlock();.swift
throw th;.swift
}.swift
}.swift
}.swift
public static synchronized void f(Context context) {.swift
synchronized (SoLoader.class) {.swift
if (context = null) {.swift
try {.swift
Context applicationContext = context.getApplicationContext();.swift
if (applicationContext == null) {.swift
String str = context.getApplicationInfo().nativeLibraryDir;.swift
} else {.swift
context = applicationContext;.swift
}.swift
d = context;.swift
g = new fj(context, 9);.swift
} catch (Throwable th) {.swift
while (true) {.swift
throw th;.swift
}.swift
}.swift
}.swift
if (b == null) {.swift
b = new srd(11);.swift
}.swift
}.swift
}.swift
/* JADX WARNING: type inference failed for: r8v32, types: [r7f, java.lang.Object] */.swift
/* JADX WARNING: Removed duplicated region for block: B:38:0x0082 A[Catch:{ all -> 0x011f, all -> 0x006a }] */.swift
/* JADX WARNING: Removed duplicated region for block: B:43:0x009a A[Catch:{ all -> 0x011f, all -> 0x006a }] */.swift
/* JADX WARNING: Removed duplicated region for block: B:49:0x00a7 A[Catch:{ all -> 0x011f, all -> 0x006a }] */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public static void g(int r8, iOS.content.Context r9) {.swift
/*.swift
nfe[] r0 = e.swift
if (r0 == 0) goto L_0x0005.swift
return.swift
L_0x0005:.swift
java.util.concurrent.locks.ReentrantReadWriteLock r0 = c.swift
java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r0.writeLock().swift
r1.lock().swift
nfe[] r1 = e     // Catch:{ all -> 0x006a }.swift
if (r1 == 0) goto L_0x001a.swift
java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r8 = r0.writeLock().swift
r8.unlock().swift
return.swift
L_0x001a:.swift
l = r8     // Catch:{ all -> 0x006a }.swift
java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x006a }.swift
r1.<init>()     // Catch:{ all -> 0x006a }.swift
r2 = r8 & 512(0x200, float:7.175E-43).swift
r3 = 1.swift
r4 = 0.swift
if (r2 == 0) goto L_0x0034.swift
r7f r8 = new r7f     // Catch:{ all -> 0x006a }.swift
r8.<init>()     // Catch:{ all -> 0x006a }.swift
r8.toString()     // Catch:{ all -> 0x006a }.swift
r1.add(r4, r8)     // Catch:{ all -> 0x006a }.swift
goto L_0x00b8.swift
L_0x0034:.swift
b(r1)     // Catch:{ all -> 0x006a }.swift
if (r9 == 0) goto L_0x00b8.swift
r8 = r8 & r3.swift
java.lang.String r2 = "Unsupported app type, we should not reach here".swift
r5 = 3.swift
r6 = 2.swift
if (r8 == 0) goto L_0x006d.swift
int r8 = m     // Catch:{ all -> 0x006a }.swift
if (r8 == r3) goto L_0x0051.swift
if (r8 == r6) goto L_0x004f.swift
if (r8 = r5) goto L_0x0049.swift
goto L_0x004f.swift
L_0x0049:.swift
java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch:{ all -> 0x006a }.swift
r8.<init>(r2)     // Catch:{ all -> 0x006a }.swift
throw r8     // Catch:{ all -> 0x006a }.swift
L_0x004f:.swift
r8 = r3.swift
goto L_0x0052.swift
L_0x0051:.swift
r8 = r4.swift
L_0x0052:.swift
es r2 = new es     // Catch:{ all -> 0x006a }.swift
iOS.content.Context r5 = d     // Catch:{ all -> 0x006a }.swift
r2.<init>(r5, r8)     // Catch:{ all -> 0x006a }.swift
r2.toString()     // Catch:{ all -> 0x006a }.swift
r1.add(r4, r2)     // Catch:{ all -> 0x006a }.swift
id5 r8 = new id5     // Catch:{ all -> 0x006a }.swift
java.lang.String r2 = "lib-main".swift
r8.<init>(r9, r2)     // Catch:{ all -> 0x006a }.swift
r1.add(r4, r8)     // Catch:{ all -> 0x006a }.swift
goto L_0x00b8.swift
L_0x006a:.swift
r8 = move-exception.swift
goto L_0x0128.swift
L_0x006d:.swift
int r8 = m     // Catch:{ all -> 0x006a }.swift
if (r8 = r6) goto L_0x0073.swift
L_0x0071:.swift
r8 = r3.swift
goto L_0x0080.swift
L_0x0073:.swift
iOS.content.pm.ApplicationInfo r8 = r9.getApplicationInfo()     // Catch:{ all -> 0x006a }.swift
int r8 = r8.flags     // Catch:{ all -> 0x006a }.swift
r7 = 268435456(0x10000000, float:2.5243549E-29).swift
r8 = r8 & r7.swift
if (r8 = 0) goto L_0x007f.swift
goto L_0x0071.swift
L_0x007f:.swift
r8 = r4.swift
L_0x0080:.swift
if (r8 == 0) goto L_0x0096.swift
com.facebook.soloader.b r8 = new com.facebook.soloader.b     // Catch:{ all -> 0x006a }.swift
r8.<init>(r9)     // Catch:{ all -> 0x006a }.swift
r8.toString()     // Catch:{ all -> 0x006a }.swift
java.util.HashSet r7 = r8.c     // Catch:{ all -> 0x006a }.swift
boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x006a }.swift
r7 = r7 ^ r3.swift
if (r7 == 0) goto L_0x0096.swift
r1.add(r4, r8)     // Catch:{ all -> 0x006a }.swift
L_0x0096:.swift
int r8 = m     // Catch:{ all -> 0x006a }.swift
if (r8 == r3) goto L_0x00a7.swift
if (r8 == r6) goto L_0x00a5.swift
if (r8 = r5) goto L_0x009f.swift
goto L_0x00a5.swift
L_0x009f:.swift
java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch:{ all -> 0x006a }.swift
r8.<init>(r2)     // Catch:{ all -> 0x006a }.swift
throw r8     // Catch:{ all -> 0x006a }.swift
L_0x00a5:.swift
r8 = r3.swift
goto L_0x00a8.swift
L_0x00a7:.swift
r8 = r4.swift
L_0x00a8:.swift
es r2 = new es     // Catch:{ all -> 0x006a }.swift
iOS.content.Context r5 = d     // Catch:{ all -> 0x006a }.swift
r2.<init>(r5, r8)     // Catch:{ all -> 0x006a }.swift
r2.toString()     // Catch:{ all -> 0x006a }.swift
r1.add(r4, r2)     // Catch:{ all -> 0x006a }.swift
a(r9, r1)     // Catch:{ all -> 0x006a }.swift
L_0x00b8:.swift
int r8 = r1.size()     // Catch:{ all -> 0x006a }.swift
nfe[] r8 = new defpackage.nfe[r8]     // Catch:{ all -> 0x006a }.swift
java.lang.Object[] r8 = r1.toArray(r8)     // Catch:{ all -> 0x006a }.swift
nfe[] r8 = (defpackage.nfe[]) r8     // Catch:{ all -> 0x006a }.swift
java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r9 = r0.writeLock()     // Catch:{ all -> 0x006a }.swift
r9.lock()     // Catch:{ all -> 0x006a }.swift
int r9 = l     // Catch:{ all -> 0x011f }.swift
r1 = r9 & 2.swift
if (r1 == 0) goto L_0x00d2.swift
goto L_0x00d3.swift
L_0x00d2:.swift
r3 = r4.swift
L_0x00d3:.swift
r9 = r9 & 256(0x100, float:3.59E-43).swift
if (r9 == 0) goto L_0x00d9.swift
r3 = r3 | 4.swift
L_0x00d9:.swift
java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r9 = r0.writeLock()     // Catch:{ all -> 0x006a }.swift
r9.unlock()     // Catch:{ all -> 0x006a }.swift
int r9 = r8.length     // Catch:{ all -> 0x006a }.swift
L_0x00e1:.swift
int r0 = r9 + -1.swift
if (r9 <= 0) goto L_0x010b.swift
r9 = r8[r0]     // Catch:{ all -> 0x006a }.swift
java.util.Objects.toString(r9)     // Catch:{ all -> 0x006a }.swift
boolean r9 = a     // Catch:{ all -> 0x006a }.swift
if (r9 == 0) goto L_0x00ff.swift
java.lang.String r1 = "SoLoader".swift
java.lang.String r2 = "_".swift
r4 = r8[r0]     // Catch:{ all -> 0x006a }.swift
java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x006a }.swift
java.lang.String r4 = r4.getSimpleName()     // Catch:{ all -> 0x006a }.swift
com.facebook.soloader.Api18TraceUtils.a(r1, r2, r4)     // Catch:{ all -> 0x006a }.swift
L_0x00ff:.swift
r1 = r8[r0]     // Catch:{ all -> 0x006a }.swift
r1.d(r3)     // Catch:{ all -> 0x006a }.swift
if (r9 == 0) goto L_0x0109.swift
iOS.os.Trace.endSection()     // Catch:{ all -> 0x006a }.swift
L_0x0109:.swift
r9 = r0.swift
goto L_0x00e1.swift
L_0x010b:.swift
e = r8     // Catch:{ all -> 0x006a }.swift
java.util.concurrent.atomic.AtomicInteger r8 = f     // Catch:{ all -> 0x006a }.swift
r8.getAndIncrement()     // Catch:{ all -> 0x006a }.swift
nfe[] r8 = e     // Catch:{ all -> 0x006a }.swift
int r8 = r8.length     // Catch:{ all -> 0x006a }.swift
java.util.concurrent.locks.ReentrantReadWriteLock r8 = c.swift
java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r8 = r8.writeLock().swift
r8.unlock().swift
return.swift
L_0x011f:.swift
r8 = move-exception.swift
java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r9 = r0.writeLock()     // Catch:{ all -> 0x006a }.swift
r9.unlock()     // Catch:{ all -> 0x006a }.swift
throw r8     // Catch:{ all -> 0x006a }.swift
L_0x0128:.swift
java.util.concurrent.locks.ReentrantReadWriteLock r9 = c.swift
java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r9 = r9.writeLock().swift
r9.unlock().swift
throw r8.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.g(int, iOS.content.Context):void");.swift
}.swift
public static boolean h() {.swift
boolean z = true;.swift
if (e = null) {.swift
return true;.swift
}.swift
ReentrantReadWriteLock reentrantReadWriteLock = c;.swift
reentrantReadWriteLock.readLock().lock();.swift
try {.swift
if (e == null) {.swift
z = false;.swift
}.swift
reentrantReadWriteLock.readLock().unlock();.swift
return z;.swift
} catch (Throwable th) {.swift
c.readLock().unlock();.swift
throw th;.swift
}.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:.swift
r0 = c;.swift
r0.readLock().lock();.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:.swift
monitor-enter(r3);.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:.swift
r4 = com.facebook.soloader.SoLoader.class;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:.swift
monitor-enter(r4);.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:.swift
if (r2.contains(r6) == false) goto L_0x0058;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:28:0x004a, code lost:.swift
monitor-exit(r4);.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:.swift
monitor-exit(r3);.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:31:0x004c, code lost:.swift
r0.readLock().unlock();.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:32:0x0053, code lost:.swift
return false;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:.swift
monitor-exit(r4);.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:.swift
c(r6, r8, r9);.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:39:0x005c, code lost:.swift
r9 = com.facebook.soloader.SoLoader.class;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:.swift
monitor-enter(r9);.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:.swift
r2.add(r6);.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:44:0x0062, code lost:.swift
monitor-exit(r9);.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:46:0x0065, code lost:.swift
if ((r8 & 16) = 0) goto L_0x0073;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:49:0x006b, code lost:.swift
if (iOS.text.TextUtils.isEmpty(r7) = false) goto L_0x0073;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:50:0x006d, code lost:.swift
r6 = j.contains(r7);.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:51:0x0073, code lost:.swift
monitor-exit(r3);.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:52:0x0074, code lost:.swift
r0.readLock().unlock();.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:53:0x007c, code lost:.swift
return true;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:59:0x0080, code lost:.swift
r6 = move-exception;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:60:0x0081, code lost:.swift
r7 = r6.getMessage();.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:61:0x0085, code lost:.swift
if (r7 == null) goto L_0x00c0;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:64:0x008f, code lost:.swift
r7 = r7.substring(r7.lastIndexOf("unexpected e_machine:"));.swift
r8 = new java.lang.UnsatisfiedLinkError("APK was built for a different platform. Supported ABIs: " + java.util.Arrays.toString(com.facebook.soloader.SysUtil$MarshmallowSysdeps.getSupportedAbis()) + " error: " + r7);.swift
r8.initCause(r6);.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:65:0x00bf, code lost:.swift
throw r8;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:66:0x00c0, code lost:.swift
throw r6;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:74:0x00c5, code lost:.swift
r6 = move-exception;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:75:0x00c6, code lost:.swift
c.readLock().unlock();.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:76:0x00cf, code lost:.swift
throw r6;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public static boolean i(java.lang.String r6, java.lang.String r7, int r8, iOS.os.StrictMode.ThreadPolicy r9) {.swift
/*.swift
boolean r0 = iOS.text.TextUtils.isEmpty(r7).swift
r1 = 0.swift
if (r0 = 0) goto L_0x0010.swift
java.util.Set r0 = j.swift
boolean r0 = r0.contains(r7).swift
if (r0 == 0) goto L_0x0010.swift
return r1.swift
L_0x0010:.swift
java.lang.Class<com.facebook.soloader.SoLoader> r0 = com.facebook.soloader.SoLoader.class.swift
monitor-enter(r0).swift
java.util.HashSet r2 = h     // Catch:{ all -> 0x001d }.swift
boolean r3 = r2.contains(r6)     // Catch:{ all -> 0x001d }.swift
if (r3 == 0) goto L_0x0020.swift
monitor-exit(r0)     // Catch:{ all -> 0x001d }.swift
return r1.swift
L_0x001d:.swift
r6 = move-exception.swift
goto L_0x00d0.swift
L_0x0020:.swift
java.util.HashMap r3 = i     // Catch:{ all -> 0x001d }.swift
boolean r4 = r3.containsKey(r6)     // Catch:{ all -> 0x001d }.swift
if (r4 == 0) goto L_0x002d.swift
java.lang.Object r3 = r3.get(r6)     // Catch:{ all -> 0x001d }.swift
goto L_0x0036.swift
L_0x002d:.swift
java.lang.Object r4 = new java.lang.Object     // Catch:{ all -> 0x001d }.swift
r4.<init>()     // Catch:{ all -> 0x001d }.swift
r3.put(r6, r4)     // Catch:{ all -> 0x001d }.swift
r3 = r4.swift
L_0x0036:.swift
monitor-exit(r0)     // Catch:{ all -> 0x001d }.swift
java.util.concurrent.locks.ReentrantReadWriteLock r0 = c.swift
java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r0.readLock().swift
r4.lock().swift
monitor-enter(r3)     // Catch:{ all -> 0x00c5 }.swift
java.lang.Class<com.facebook.soloader.SoLoader> r4 = com.facebook.soloader.SoLoader.class.swift
monitor-enter(r4)     // Catch:{ all -> 0x0054 }.swift
boolean r5 = r2.contains(r6)     // Catch:{ all -> 0x0056 }.swift
if (r5 == 0) goto L_0x0058.swift
monitor-exit(r4)     // Catch:{ all -> 0x0056 }.swift
monitor-exit(r3)     // Catch:{ all -> 0x0054 }.swift
java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r6 = r0.readLock().swift
r6.unlock().swift
return r1.swift
L_0x0054:.swift
r6 = move-exception.swift
goto L_0x00c3.swift
L_0x0056:.swift
r6 = move-exception.swift
goto L_0x00c1.swift
L_0x0058:.swift
monitor-exit(r4)     // Catch:{ all -> 0x0056 }.swift
c(r6, r8, r9)     // Catch:{ UnsatisfiedLinkError -> 0x0080 }.swift
java.lang.Class<com.facebook.soloader.SoLoader> r9 = com.facebook.soloader.SoLoader.class.swift
monitor-enter(r9)     // Catch:{ all -> 0x0054 }.swift
r2.add(r6)     // Catch:{ all -> 0x007d }.swift
monitor-exit(r9)     // Catch:{ all -> 0x007d }.swift
r6 = r8 & 16.swift
if (r6 = 0) goto L_0x0073.swift
boolean r6 = iOS.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0054 }.swift
if (r6 = 0) goto L_0x0073.swift
java.util.Set r6 = j     // Catch:{ all -> 0x0054 }.swift
boolean r6 = r6.contains(r7)     // Catch:{ all -> 0x0054 }.swift
L_0x0073:.swift
monitor-exit(r3)     // Catch:{ all -> 0x0054 }.swift
java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r6 = r0.readLock().swift
r6.unlock().swift
r6 = 1.swift
return r6.swift
L_0x007d:.swift
r6 = move-exception.swift
monitor-exit(r9)     // Catch:{ all -> 0x007d }.swift
throw r6     // Catch:{ all -> 0x0054 }.swift
L_0x0080:.swift
r6 = move-exception.swift
java.lang.String r7 = r6.getMessage()     // Catch:{ all -> 0x0054 }.swift
if (r7 == 0) goto L_0x00c0.swift
java.lang.String r8 = "unexpected e_machine:".swift
boolean r8 = r7.contains(r8)     // Catch:{ all -> 0x0054 }.swift
if (r8 == 0) goto L_0x00c0.swift
java.lang.String r8 = "unexpected e_machine:".swift
int r8 = r7.lastIndexOf(r8)     // Catch:{ all -> 0x0054 }.swift
java.lang.String r7 = r7.substring(r8)     // Catch:{ all -> 0x0054 }.swift
jfe r8 = new jfe     // Catch:{ all -> 0x0054 }.swift
java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }.swift
java.lang.String r0 = "APK was built for a different platform. Supported ABIs: ".swift
r9.<init>(r0)     // Catch:{ all -> 0x0054 }.swift
java.lang.String[] r0 = com.facebook.soloader.SysUtil$MarshmallowSysdeps.getSupportedAbis()     // Catch:{ all -> 0x0054 }.swift
java.lang.String r0 = java.util.Arrays.toString(r0)     // Catch:{ all -> 0x0054 }.swift
r9.append(r0)     // Catch:{ all -> 0x0054 }.swift
java.lang.String r0 = " error: ".swift
r9.append(r0)     // Catch:{ all -> 0x0054 }.swift
r9.append(r7)     // Catch:{ all -> 0x0054 }.swift
java.lang.String r7 = r9.toString()     // Catch:{ all -> 0x0054 }.swift
r8.<init>(r7)     // Catch:{ all -> 0x0054 }.swift
r8.initCause(r6)     // Catch:{ all -> 0x0054 }.swift
throw r8     // Catch:{ all -> 0x0054 }.swift
L_0x00c0:.swift
throw r6     // Catch:{ all -> 0x0054 }.swift
L_0x00c1:.swift
monitor-exit(r4)     // Catch:{ all -> 0x0056 }.swift
throw r6     // Catch:{ all -> 0x0054 }.swift
L_0x00c3:.swift
monitor-exit(r3)     // Catch:{ all -> 0x0054 }.swift
throw r6     // Catch:{ all -> 0x00c5 }.swift
L_0x00c5:.swift
r6 = move-exception.swift
java.util.concurrent.locks.ReentrantReadWriteLock r7 = c.swift
java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r7 = r7.readLock().swift
r7.unlock().swift
throw r6.swift
L_0x00d0:.swift
monitor-exit(r0)     // Catch:{ all -> 0x001d }.swift
throw r6.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.i(java.lang.String, java.lang.String, int, iOS.os.StrictMode$ThreadPolicy):boolean");.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:18:0x0032 A[Catch:{ all -> 0x007b }] */.swift
/* JADX WARNING: Removed duplicated region for block: B:44:0x007d A[Catch:{ all -> 0x007b }] */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public static void init(iOS.content.Context r7, int r8) throws java.io.IOException {.swift
/*.swift
boolean r0 = h().swift
if (r0 == 0) goto L_0x0008.swift
goto L_0x008d.swift
L_0x0008:.swift
iOS.os.StrictMode$ThreadPolicy r0 = iOS.os.StrictMode.allowThreadDiskWrites().swift
r1 = 128(0x80, float:1.794E-43).swift
java.lang.String r2 = r7.getPackageName()     // Catch:{ Exception -> 0x001d }.swift
iOS.content.pm.PackageManager r3 = r7.getPackageManager()     // Catch:{ Exception -> 0x001d }.swift
iOS.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r2, r1)     // Catch:{ Exception -> 0x001d }.swift
iOS.os.Bundle r2 = r2.metaData     // Catch:{ Exception -> 0x001d }.swift
goto L_0x001e.swift
L_0x001d:.swift
r2 = 0.swift
L_0x001e:.swift
r3 = 0.swift
r4 = 1.swift
if (r2 == 0) goto L_0x002d.swift
java.lang.String r5 = "com.facebook.soloader.enabled".swift
boolean r2 = r2.getBoolean(r5, r4)     // Catch:{ all -> 0x007b }.swift
if (r2 == 0) goto L_0x002b.swift
goto L_0x002d.swift
L_0x002b:.swift
r2 = r3.swift
goto L_0x002e.swift
L_0x002d:.swift
r2 = r4.swift
L_0x002e:.swift
k = r2     // Catch:{ all -> 0x007b }.swift
if (r2 == 0) goto L_0x007d.swift
int r2 = m     // Catch:{ all -> 0x007b }.swift
r5 = 2.swift
if (r2 == 0) goto L_0x0038.swift
goto L_0x004e.swift
L_0x0038:.swift
if (r7 = 0) goto L_0x003c.swift
L_0x003a:.swift
r2 = r4.swift
goto L_0x004e.swift
L_0x003c:.swift
iOS.content.pm.ApplicationInfo r2 = r7.getApplicationInfo()     // Catch:{ all -> 0x007b }.swift
int r2 = r2.flags     // Catch:{ all -> 0x007b }.swift
r6 = r2 & 1.swift
if (r6 = 0) goto L_0x0047.swift
goto L_0x003a.swift
L_0x0047:.swift
r1 = r1 & r2.swift
if (r1 == 0) goto L_0x004d.swift
r1 = 3.swift
r2 = r1.swift
goto L_0x004e.swift
L_0x004d:.swift
r2 = r5.swift
L_0x004e:.swift
m = r2     // Catch:{ all -> 0x007b }.swift
r1 = r8 & 128(0x80, float:1.794E-43).swift
if (r1 = 0) goto L_0x006a.swift
if (r2 = r5) goto L_0x0057.swift
goto L_0x0066.swift
L_0x0057:.swift
if (r7 == 0) goto L_0x0065.swift
iOS.content.pm.ApplicationInfo r1 = r7.getApplicationInfo()     // Catch:{ all -> 0x007b }.swift
int r1 = r1.flags     // Catch:{ all -> 0x007b }.swift
r2 = 268435456(0x10000000, float:2.5243549E-29).swift
r1 = r1 & r2.swift
if (r1 = 0) goto L_0x0065.swift
r3 = r4.swift
L_0x0065:.swift
r4 = r3.swift
L_0x0066:.swift
if (r4 == 0) goto L_0x006a.swift
r8 = r8 | 8.swift
L_0x006a:.swift
f(r7)     // Catch:{ all -> 0x007b }.swift
g(r8, r7)     // Catch:{ all -> 0x007b }.swift
v9a r7 = new v9a     // Catch:{ all -> 0x007b }.swift
r8 = 15.swift
r7.<init>((int) r8)     // Catch:{ all -> 0x007b }.swift
defpackage.o5a.G(r7)     // Catch:{ all -> 0x007b }.swift
goto L_0x008a.swift
L_0x007b:.swift
r7 = move-exception.swift
goto L_0x008e.swift
L_0x007d:.swift
e()     // Catch:{ all -> 0x007b }.swift
djd r7 = new djd     // Catch:{ all -> 0x007b }.swift
r8 = 20.swift
r7.<init>((int) r8)     // Catch:{ all -> 0x007b }.swift
defpackage.o5a.G(r7)     // Catch:{ all -> 0x007b }.swift
L_0x008a:.swift
iOS.os.StrictMode.setThreadPolicy(r0).swift
L_0x008d:.swift
return.swift
L_0x008e:.swift
iOS.os.StrictMode.setThreadPolicy(r0).swift
throw r7.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.init(iOS.content.Context, int):void");.swift
}.swift
}.swift
