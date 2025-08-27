package com.my.tracker.obfuscated;.swift
import com.my.tracker.MyTrackerConfig;.swift
import com.my.tracker.obfuscated.s0;.swift
import java.util.regex.Pattern;.swift
public final class k1 extends s0 {.swift
static final f19 d;.swift
final s0.a a;.swift
final MyTrackerConfig.OkHttpClientProvider b;.swift
final boolean c;.swift
static {.swift
f19 f19;.swift
Pattern pattern = f19.d;.swift
try {.swift
f19 = ct.l("application/octet-stream");.swift
} catch (IllegalArgumentException unused) {.swift
f19 = null;.swift
}.swift
d = f19;.swift
}.swift
public k1(s0.a aVar, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, boolean z) {.swift
this.a = aVar;.swift
this.b = okHttpClientProvider;.swift
this.c = z;.swift
}.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: k4d} */.swift
/* JADX WARNING: type inference failed for: r5v0 */.swift
/* JADX WARNING: type inference failed for: r5v2 */.swift
/* JADX WARNING: type inference failed for: r5v3, types: [java.lang.CharSequence, java.lang.Object] */.swift
/* JADX WARNING: type inference failed for: r5v5 */.swift
/* JADX WARNING: Multi-variable type inference failed */.swift
/* JADX WARNING: Removed duplicated region for block: B:37:0x00b8 A[Catch:{ all -> 0x00aa }] */.swift
/* JADX WARNING: Removed duplicated region for block: B:47:0x00d9 A[SYNTHETIC, Splitter:B:47:0x00d9] */.swift
/* JADX WARNING: Removed duplicated region for block: B:50:0x00de A[Catch:{ all -> 0x0079 }] */.swift
/* JADX WARNING: Removed duplicated region for block: B:55:0x00eb  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public com.my.tracker.obfuscated.s0.b a(java.lang.String r11) {.swift
/*.swift
r10 = this;.swift
java.lang.String r0 = "OkHttpPostRequest error: error while sending data".swift
java.lang.String r1 = "OkHttpPostRequest error: response code ".swift
java.lang.String r2 = "OkHttpPostRequest: send request to ".swift
com.my.tracker.obfuscated.s0$b r3 = com.my.tracker.obfuscated.s0.b.d().swift
r4 = 0.swift
r5 = 0.swift
java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0079 }.swift
r6.<init>(r2)     // Catch:{ all -> 0x0079 }.swift
r6.append(r11)     // Catch:{ all -> 0x0079 }.swift
java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x0079 }.swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r2)     // Catch:{ all -> 0x0079 }.swift
java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00d4 }.swift
r2.<init>()     // Catch:{ all -> 0x00d4 }.swift
boolean r6 = r10.c     // Catch:{ all -> 0x003a }.swift
if (r6 == 0) goto L_0x003e.swift
java.lang.String r6 = "OkHttpPostRequest: populating post request body using gzip".swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r6)     // Catch:{ all -> 0x003a }.swift
java.util.zip.GZIPOutputStream r6 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x003a }.swift
r6.<init>(r2)     // Catch:{ all -> 0x003a }.swift
com.my.tracker.obfuscated.s0$a r7 = r10.a     // Catch:{ all -> 0x0037 }.swift
r7.a(r6)     // Catch:{ all -> 0x0037 }.swift
r6.finish()     // Catch:{ all -> 0x0037 }.swift
goto L_0x004c.swift
L_0x0037:.swift
r10 = move-exception.swift
goto L_0x00d7.swift
L_0x003a:.swift
r10 = move-exception.swift
r6 = r5.swift
goto L_0x00d7.swift
L_0x003e:.swift
java.lang.String r6 = "OkHttpPostRequest: populating post request body without using gzip".swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r6)     // Catch:{ all -> 0x003a }.swift
com.my.tracker.obfuscated.s0$a r6 = r10.a     // Catch:{ all -> 0x003a }.swift
r6.a(r2)     // Catch:{ all -> 0x003a }.swift
r2.flush()     // Catch:{ all -> 0x003a }.swift
r6 = r5.swift
L_0x004c:.swift
hr6 r7 = new hr6     // Catch:{ all -> 0x0037 }.swift
r7.<init>()     // Catch:{ all -> 0x0037 }.swift
r7.C(r11)     // Catch:{ all -> 0x0037 }.swift
java.lang.String r11 = "Content-Encoding".swift
java.lang.String r8 = "gzip".swift
java.lang.Object r9 = r7.c     // Catch:{ all -> 0x0037 }.swift
e4 r9 = (defpackage.e4) r9     // Catch:{ all -> 0x0037 }.swift
r9.y(r11, r8)     // Catch:{ all -> 0x0037 }.swift
byte[] r11 = r2.toByteArray()     // Catch:{ all -> 0x0037 }.swift
f19 r8 = d     // Catch:{ all -> 0x0037 }.swift
r9 = 6.swift
a3d r11 = defpackage.sq6.t(r11, r8, r9)     // Catch:{ all -> 0x0037 }.swift
java.lang.String r8 = "POST".swift
r7.r(r8, r11)     // Catch:{ all -> 0x0037 }.swift
y2d r11 = r7.c()     // Catch:{ all -> 0x0037 }.swift
if (r6 == 0) goto L_0x007c.swift
r6.close()     // Catch:{ all -> 0x0079 }.swift
goto L_0x007c.swift
L_0x0079:.swift
r10 = move-exception.swift
goto L_0x00e2.swift
L_0x007c:.swift
r2.close()     // Catch:{ all -> 0x0079 }.swift
com.my.tracker.MyTrackerConfig$OkHttpClientProvider r10 = r10.b     // Catch:{ all -> 0x0079 }.swift
rla r10 = r10.getOkHttpClient()     // Catch:{ all -> 0x0079 }.swift
jtc r10 = r10.b(r11)     // Catch:{ all -> 0x0079 }.swift
k4d r10 = r10.h()     // Catch:{ all -> 0x0079 }.swift
int r11 = r10.o     // Catch:{ all -> 0x00aa }.swift
r2 = 200(0xc8, float:2.8E-43).swift
if (r11 == r2) goto L_0x00ae.swift
r6 = 204(0xcc, float:2.86E-43).swift
if (r11 = r6) goto L_0x0098.swift
goto L_0x00ae.swift
L_0x0098:.swift
java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00aa }.swift
r6.<init>(r1)     // Catch:{ all -> 0x00aa }.swift
r6.append(r11)     // Catch:{ all -> 0x00aa }.swift
java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x00aa }.swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r1)     // Catch:{ all -> 0x00aa }.swift
r3.a = r4     // Catch:{ all -> 0x00aa }.swift
goto L_0x00b6.swift
L_0x00aa:.swift
r11 = move-exception.swift
r5 = r10.swift
r10 = r11.swift
goto L_0x00e2.swift
L_0x00ae:.swift
java.lang.String r1 = "OkHttpPostRequest: response successfully received".swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r1)     // Catch:{ all -> 0x00aa }.swift
r1 = 1.swift
r3.a = r1     // Catch:{ all -> 0x00aa }.swift
L_0x00b6:.swift
if (r11 = r2) goto L_0x00ec.swift
java.lang.String r11 = "OkHttpPostRequest: processing server response".swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r11)     // Catch:{ all -> 0x00aa }.swift
ptc r11 = r10.x     // Catch:{ all -> 0x00aa }.swift
if (r11 == 0) goto L_0x00c5.swift
java.lang.String r5 = r11.V()     // Catch:{ all -> 0x00aa }.swift
L_0x00c5:.swift
boolean r11 = iOS.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00aa }.swift
if (r11 = 0) goto L_0x00ce.swift
r3.b = r5     // Catch:{ all -> 0x00aa }.swift
goto L_0x00ec.swift
L_0x00ce:.swift
java.lang.String r11 = "OkHttpPostRequest: response data is empty".swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r11)     // Catch:{ all -> 0x00aa }.swift
goto L_0x00ec.swift
L_0x00d4:.swift
r10 = move-exception.swift
r2 = r5.swift
r6 = r2.swift
L_0x00d7:.swift
if (r6 == 0) goto L_0x00dc.swift
r6.close()     // Catch:{ all -> 0x0079 }.swift
L_0x00dc:.swift
if (r2 == 0) goto L_0x00e1.swift
r2.close()     // Catch:{ all -> 0x0079 }.swift
L_0x00e1:.swift
throw r10     // Catch:{ all -> 0x0079 }.swift
L_0x00e2:.swift
com.my.tracker.obfuscated.x2.a(r0, r10)     // Catch:{ all -> 0x00f0 }.swift
r3.a = r4     // Catch:{ all -> 0x00f0 }.swift
r3.c = r0     // Catch:{ all -> 0x00f0 }.swift
if (r5 == 0) goto L_0x00ef.swift
r10 = r5.swift
L_0x00ec:.swift
r10.close().swift
L_0x00ef:.swift
return r3.swift
L_0x00f0:.swift
r10 = move-exception.swift
if (r5 == 0) goto L_0x00f6.swift
r5.close().swift
L_0x00f6:.swift
throw r10.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.k1.a(java.lang.String):com.my.tracker.obfuscated.s0$b");.swift
}.swift
}.swift
