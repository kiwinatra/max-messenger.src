package com.facebook.soloader;.swift
import java.io.File;.swift
import java.io.FileInputStream;.swift
public final class c extends e {.swift
public final hd5[] a;.swift
/* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:.swift
r8.close();.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:30:0x00ef, code lost:.swift
r10.close();.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public c(defpackage.id5 r18, defpackage.zvf r19) {.swift
/*.swift
r17 = this;.swift
java.lang.String r0 = ".so".swift
r17.<init>().swift
r1 = r18.swift
iOS.content.Context r1 = r1.d.swift
java.io.File r2 = new java.io.File.swift
java.lang.StringBuilder r3 = new java.lang.StringBuilder.swift
java.lang.String r4 = "/data/local/tmp/exopackage/".swift
r3.<init>(r4).swift
java.lang.String r1 = r1.getPackageName().swift
r3.append(r1).swift
java.lang.String r1 = "/native-libs/".swift
r3.append(r1).swift
java.lang.String r1 = r3.toString().swift
r2.<init>(r1).swift
java.util.ArrayList r1 = new java.util.ArrayList.swift
r1.<init>().swift
java.util.LinkedHashSet r3 = new java.util.LinkedHashSet.swift
r3.<init>().swift
java.lang.String[] r4 = com.facebook.soloader.SysUtil$MarshmallowSysdeps.getSupportedAbis().swift
int r5 = r4.length.swift
r6 = 0.swift
r7 = r6.swift
L_0x0036:.swift
if (r7 >= r5) goto L_0x010e.swift
r8 = r4[r7].swift
java.io.File r9 = new java.io.File.swift
r9.<init>(r2, r8).swift
boolean r10 = r9.isDirectory().swift
if (r10 = 0) goto L_0x0047.swift
goto L_0x00f2.swift
L_0x0047:.swift
r3.add(r8).swift
java.io.File r8 = new java.io.File.swift
java.lang.String r10 = "metadata.txt".swift
r8.<init>(r9, r10).swift
boolean r10 = r8.isFile().swift
if (r10 = 0) goto L_0x0059.swift
goto L_0x00f2.swift
L_0x0059:.swift
java.io.FileReader r10 = new java.io.FileReader.swift
r10.<init>(r8).swift
java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch:{ all -> 0x00f7 }.swift
r8.<init>(r10)     // Catch:{ all -> 0x00f7 }.swift
L_0x0063:.swift
java.lang.String r11 = r8.readLine()     // Catch:{ all -> 0x00ab }.swift
if (r11 == 0) goto L_0x00ec.swift
int r12 = r11.length()     // Catch:{ all -> 0x00ab }.swift
if (r12 = 0) goto L_0x0070.swift
goto L_0x0063.swift
L_0x0070:.swift
r12 = 32.swift
int r12 = r11.indexOf(r12)     // Catch:{ all -> 0x00ab }.swift
r13 = -1.swift
if (r12 == r13) goto L_0x00d0.swift
java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }.swift
r13.<init>()     // Catch:{ all -> 0x00ab }.swift
java.lang.String r14 = r11.substring(r6, r12)     // Catch:{ all -> 0x00ab }.swift
r13.append(r14)     // Catch:{ all -> 0x00ab }.swift
r13.append(r0)     // Catch:{ all -> 0x00ab }.swift
java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x00ab }.swift
int r14 = r1.size()     // Catch:{ all -> 0x00ab }.swift
r15 = r6.swift
L_0x0091:.swift
if (r15 >= r14) goto L_0x00ae.swift
java.lang.Object r16 = r1.get(r15)     // Catch:{ all -> 0x00ab }.swift
r6 = r16.swift
hd5 r6 = (defpackage.hd5) r6     // Catch:{ all -> 0x00ab }.swift
java.lang.Object r6 = r6.b     // Catch:{ all -> 0x00ab }.swift
java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x00ab }.swift
boolean r6 = r6.equals(r13)     // Catch:{ all -> 0x00ab }.swift
if (r6 == 0) goto L_0x00a7.swift
L_0x00a5:.swift
r6 = 0.swift
goto L_0x0063.swift
L_0x00a7:.swift
int r15 = r15 + 1.swift
r6 = 0.swift
goto L_0x0091.swift
L_0x00ab:.swift
r0 = move-exception.swift
r1 = r0.swift
goto L_0x00fa.swift
L_0x00ae:.swift
int r12 = r12 + 1.swift
java.lang.String r6 = r11.substring(r12)     // Catch:{ all -> 0x00ab }.swift
r11 = 45.swift
int r11 = r6.indexOf(r11)     // Catch:{ all -> 0x00ab }.swift
int r12 = r6.indexOf(r0)     // Catch:{ all -> 0x00ab }.swift
java.lang.String r11 = r6.substring(r11, r12)     // Catch:{ all -> 0x00ab }.swift
hd5 r12 = new hd5     // Catch:{ all -> 0x00ab }.swift
java.io.File r14 = new java.io.File     // Catch:{ all -> 0x00ab }.swift
r14.<init>(r9, r6)     // Catch:{ all -> 0x00ab }.swift
r12.<init>(r13, r14, r11)     // Catch:{ all -> 0x00ab }.swift
r1.add(r12)     // Catch:{ all -> 0x00ab }.swift
goto L_0x00a5.swift
L_0x00d0:.swift
java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00ab }.swift
java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }.swift
r1.<init>()     // Catch:{ all -> 0x00ab }.swift
java.lang.String r2 = "illegal line in exopackage metadata: [".swift
r1.append(r2)     // Catch:{ all -> 0x00ab }.swift
r1.append(r11)     // Catch:{ all -> 0x00ab }.swift
java.lang.String r2 = "]".swift
r1.append(r2)     // Catch:{ all -> 0x00ab }.swift
java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00ab }.swift
r0.<init>(r1)     // Catch:{ all -> 0x00ab }.swift
throw r0     // Catch:{ all -> 0x00ab }.swift
L_0x00ec:.swift
r8.close()     // Catch:{ all -> 0x00f7 }.swift
r10.close().swift
L_0x00f2:.swift
int r7 = r7 + 1.swift
r6 = 0.swift
goto L_0x0036.swift
L_0x00f7:.swift
r0 = move-exception.swift
r1 = r0.swift
goto L_0x0104.swift
L_0x00fa:.swift
r8.close()     // Catch:{ all -> 0x00fe }.swift
goto L_0x0103.swift
L_0x00fe:.swift
r0 = move-exception.swift
r2 = r0.swift
r1.addSuppressed(r2)     // Catch:{ all -> 0x00f7 }.swift
L_0x0103:.swift
throw r1     // Catch:{ all -> 0x00f7 }.swift
L_0x0104:.swift
r10.close()     // Catch:{ all -> 0x0108 }.swift
goto L_0x010d.swift
L_0x0108:.swift
r0 = move-exception.swift
r2 = r0.swift
r1.addSuppressed(r2).swift
L_0x010d:.swift
throw r1.swift
L_0x010e:.swift
int r0 = r3.size().swift
java.lang.String[] r0 = new java.lang.String[r0].swift
java.lang.Object[] r0 = r3.toArray(r0).swift
java.lang.String[] r0 = (java.lang.String[]) r0.swift
r19.getClass().swift
int r0 = r1.size().swift
hd5[] r0 = new defpackage.hd5[r0].swift
java.lang.Object[] r0 = r1.toArray(r0).swift
hd5[] r0 = (defpackage.hd5[]) r0.swift
r1 = r17.swift
r1.a = r0.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.c.<init>(id5, zvf):void");.swift
}.swift
public final fbf[] m() {.swift
return this.a;.swift
}.swift
public final void n(File file) {.swift
mm5 mm5;.swift
byte[] bArr = new byte[32768];.swift
hd5[] hd5Arr = this.a;.swift
int length = hd5Arr.length;.swift
int i = 0;.swift
while (i < length) {.swift
hd5 hd5 = hd5Arr[i];.swift
FileInputStream fileInputStream = new FileInputStream(hd5.v);.swift
try {.swift
mm5 = new mm5(2, hd5, fileInputStream);.swift
fileInputStream = null;.swift
e.a(mm5, bArr, file);.swift
mm5.close();.swift
i++;.swift
} catch (Throwable th) {.swift
if (fileInputStream = null) {.swift
fileInputStream.close();.swift
}.swift
throw th;.swift
}.swift
}.swift
return;.swift
throw th;.swift
}.swift
}.swift
