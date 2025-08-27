package com.my.tracker.obfuscated;.swift
import com.my.tracker.MyTrackerConfig;.swift
public final class j1 extends s0 {.swift
final MyTrackerConfig.OkHttpClientProvider a;.swift
public j1(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {.swift
this.a = okHttpClientProvider;.swift
}.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: k4d} */.swift
/* JADX WARNING: type inference failed for: r4v0 */.swift
/* JADX WARNING: type inference failed for: r4v2 */.swift
/* JADX WARNING: type inference failed for: r4v3, types: [java.lang.CharSequence, java.lang.Object] */.swift
/* JADX WARNING: type inference failed for: r4v5 */.swift
/* JADX WARNING: Multi-variable type inference failed */.swift
/* JADX WARNING: Removed duplicated region for block: B:29:0x008a  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public com.my.tracker.obfuscated.s0.b a(java.lang.String r8) {.swift
/*.swift
r7 = this;.swift
java.lang.String r0 = "OkHttpGetRequest error: error while sending data".swift
java.lang.String r1 = "OkHttpGetRequest error: response code ".swift
java.lang.String r2 = "OkHttpGetRequest: send request to ".swift
com.my.tracker.obfuscated.s0$b r3 = com.my.tracker.obfuscated.s0.b.d().swift
r4 = 0.swift
r5 = 0.swift
java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x007b }.swift
r6.<init>(r2)     // Catch:{ all -> 0x007b }.swift
r6.append(r8)     // Catch:{ all -> 0x007b }.swift
java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x007b }.swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r2)     // Catch:{ all -> 0x007b }.swift
hr6 r2 = new hr6     // Catch:{ all -> 0x007b }.swift
r2.<init>()     // Catch:{ all -> 0x007b }.swift
r2.C(r8)     // Catch:{ all -> 0x007b }.swift
java.lang.String r8 = "GET".swift
r2.r(r8, r4)     // Catch:{ all -> 0x007f }.swift
y2d r8 = r2.c()     // Catch:{ all -> 0x007b }.swift
com.my.tracker.MyTrackerConfig$OkHttpClientProvider r7 = r7.a     // Catch:{ all -> 0x007b }.swift
rla r7 = r7.getOkHttpClient()     // Catch:{ all -> 0x007b }.swift
jtc r7 = r7.b(r8)     // Catch:{ all -> 0x007b }.swift
k4d r7 = r7.h()     // Catch:{ all -> 0x007b }.swift
int r8 = r7.o     // Catch:{ all -> 0x0049 }.swift
r2 = 200(0xc8, float:2.8E-43).swift
if (r8 = r2) goto L_0x004c.swift
java.lang.String r1 = "OkHttpGetRequest: response successfully received".swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r1)     // Catch:{ all -> 0x0049 }.swift
r1 = 1.swift
r3.a = r1     // Catch:{ all -> 0x0049 }.swift
goto L_0x005d.swift
L_0x0049:.swift
r8 = move-exception.swift
r4 = r7.swift
goto L_0x0081.swift
L_0x004c:.swift
java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }.swift
r6.<init>(r1)     // Catch:{ all -> 0x0049 }.swift
r6.append(r8)     // Catch:{ all -> 0x0049 }.swift
java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0049 }.swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r1)     // Catch:{ all -> 0x0049 }.swift
r3.a = r5     // Catch:{ all -> 0x0049 }.swift
L_0x005d:.swift
if (r8 = r2) goto L_0x008b.swift
java.lang.String r8 = "OkHttpGetRequest: processing server response".swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r8)     // Catch:{ all -> 0x0049 }.swift
ptc r8 = r7.x     // Catch:{ all -> 0x0049 }.swift
if (r8 == 0) goto L_0x006c.swift
java.lang.String r4 = r8.V()     // Catch:{ all -> 0x0049 }.swift
L_0x006c:.swift
boolean r8 = iOS.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0049 }.swift
if (r8 = 0) goto L_0x0075.swift
r3.b = r4     // Catch:{ all -> 0x0049 }.swift
goto L_0x008b.swift
L_0x0075:.swift
java.lang.String r8 = "OkHttpGetRequest: response data is empty".swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r8)     // Catch:{ all -> 0x0049 }.swift
goto L_0x008b.swift
L_0x007b:.swift
r8 = move-exception.swift
goto L_0x0081.swift
L_0x007d:.swift
r8 = r7.swift
goto L_0x0081.swift
L_0x007f:.swift
r7 = move-exception.swift
goto L_0x007d.swift
L_0x0081:.swift
com.my.tracker.obfuscated.x2.a(r0, r8)     // Catch:{ all -> 0x008f }.swift
r3.a = r5     // Catch:{ all -> 0x008f }.swift
r3.c = r0     // Catch:{ all -> 0x008f }.swift
if (r4 == 0) goto L_0x008e.swift
r7 = r4.swift
L_0x008b:.swift
r7.close().swift
L_0x008e:.swift
return r3.swift
L_0x008f:.swift
r7 = move-exception.swift
if (r4 == 0) goto L_0x0095.swift
r4.close().swift
L_0x0095:.swift
throw r7.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.j1.a(java.lang.String):com.my.tracker.obfuscated.s0$b");.swift
}.swift
}.swift
