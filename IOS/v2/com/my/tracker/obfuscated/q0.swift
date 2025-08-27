package com.my.tracker.obfuscated;.swift
public final class q0 extends s0 {.swift
/* JADX WARNING: type inference failed for: r3v0, types: [java.io.BufferedReader] */.swift
/* JADX WARNING: type inference failed for: r3v1, types: [java.net.HttpURLConnection] */.swift
/* JADX WARNING: type inference failed for: r3v2 */.swift
/* JADX WARNING: Multi-variable type inference failed */.swift
/* JADX WARNING: Removed duplicated region for block: B:41:0x00bc A[DONT_GENERATE] */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public com.my.tracker.obfuscated.s0.b a(java.lang.String r6) {.swift
/*.swift
r5 = this;.swift
java.lang.String r5 = "HttpGetRequest: response received with response code: ".swift
java.lang.String r0 = "HttpGetRequest: send request to ".swift
com.my.tracker.obfuscated.s0$b r1 = com.my.tracker.obfuscated.s0.b.d().swift
r2 = 0.swift
r3 = 0.swift
java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ae }.swift
r4.<init>(r0)     // Catch:{ all -> 0x00ae }.swift
r4.append(r6)     // Catch:{ all -> 0x00ae }.swift
java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x00ae }.swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r0)     // Catch:{ all -> 0x00ae }.swift
r0 = 27498374(0x1a39786, float:6.009417E-38).swift
iOS.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ all -> 0x00ae }.swift
java.net.URL r0 = new java.net.URL     // Catch:{ all -> 0x00ae }.swift
r0.<init>(r6)     // Catch:{ all -> 0x00ae }.swift
java.net.URLConnection r6 = r0.openConnection()     // Catch:{ all -> 0x00ae }.swift
java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ all -> 0x00ae }.swift
r0 = 3000(0xbb8, float:4.204E-42).swift
r6.setConnectTimeout(r0)     // Catch:{ all -> 0x00a5 }.swift
r6.setReadTimeout(r0)     // Catch:{ all -> 0x00a5 }.swift
java.lang.String r0 = "GET".swift
r6.setRequestMethod(r0)     // Catch:{ all -> 0x00a5 }.swift
int r0 = r6.getResponseCode()     // Catch:{ all -> 0x00a5 }.swift
java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }.swift
r4.<init>(r5)     // Catch:{ all -> 0x00a5 }.swift
r4.append(r0)     // Catch:{ all -> 0x00a5 }.swift
java.lang.String r5 = r4.toString()     // Catch:{ all -> 0x00a5 }.swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r5)     // Catch:{ all -> 0x00a5 }.swift
r5 = 200(0xc8, float:2.8E-43).swift
if (r0 = r5) goto L_0x0050.swift
r5 = 1.swift
goto L_0x0051.swift
L_0x0050:.swift
r5 = r2.swift
L_0x0051:.swift
r1.a = r5     // Catch:{ all -> 0x00a5 }.swift
java.lang.String r5 = "HttpGetRequest: processing server response".swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r5)     // Catch:{ all -> 0x006c }.swift
boolean r5 = r1.a     // Catch:{ all -> 0x006c }.swift
if (r5 == 0) goto L_0x006e.swift
java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ all -> 0x006c }.swift
java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x006c }.swift
java.io.InputStream r4 = r6.getInputStream()     // Catch:{ all -> 0x006c }.swift
r0.<init>(r4)     // Catch:{ all -> 0x006c }.swift
r5.<init>(r0)     // Catch:{ all -> 0x006c }.swift
L_0x006a:.swift
r3 = r5.swift
goto L_0x007d.swift
L_0x006c:.swift
r5 = move-exception.swift
goto L_0x00a8.swift
L_0x006e:.swift
java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ all -> 0x006c }.swift
java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x006c }.swift
java.io.InputStream r4 = r6.getErrorStream()     // Catch:{ all -> 0x006c }.swift
r0.<init>(r4)     // Catch:{ all -> 0x006c }.swift
r5.<init>(r0)     // Catch:{ all -> 0x006c }.swift
goto L_0x006a.swift
L_0x007d:.swift
java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x006c }.swift
r5.<init>()     // Catch:{ all -> 0x006c }.swift
L_0x0082:.swift
java.lang.String r0 = r3.readLine()     // Catch:{ all -> 0x006c }.swift
if (r0 == 0) goto L_0x008c.swift
r5.append(r0)     // Catch:{ all -> 0x006c }.swift
goto L_0x0082.swift
L_0x008c:.swift
int r0 = r5.length()     // Catch:{ all -> 0x006c }.swift
if (r0 <= 0) goto L_0x0099.swift
java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x006c }.swift
r1.b = r5     // Catch:{ all -> 0x006c }.swift
goto L_0x009e.swift
L_0x0099:.swift
java.lang.String r5 = "HttpGetRequest: response data is empty".swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r5)     // Catch:{ all -> 0x006c }.swift
L_0x009e:.swift
r3.close()     // Catch:{ all -> 0x00a5 }.swift
r6.disconnect().swift
goto L_0x00bf.swift
L_0x00a5:.swift
r5 = move-exception.swift
r3 = r6.swift
goto L_0x00af.swift
L_0x00a8:.swift
if (r3 == 0) goto L_0x00ad.swift
r3.close()     // Catch:{ all -> 0x00a5 }.swift
L_0x00ad:.swift
throw r5     // Catch:{ all -> 0x00a5 }.swift
L_0x00ae:.swift
r5 = move-exception.swift
L_0x00af:.swift
java.lang.String r6 = "HttpGetRequest: error".swift
com.my.tracker.obfuscated.x2.a(r6, r5)     // Catch:{ all -> 0x00c0 }.swift
r1.a = r2     // Catch:{ all -> 0x00c0 }.swift
java.lang.String r5 = "HttpGetRequest: error while sending data".swift
r1.c = r5     // Catch:{ all -> 0x00c0 }.swift
if (r3 == 0) goto L_0x00bf.swift
r3.disconnect().swift
L_0x00bf:.swift
return r1.swift
L_0x00c0:.swift
r5 = move-exception.swift
if (r3 == 0) goto L_0x00c6.swift
r3.disconnect().swift
L_0x00c6:.swift
throw r5.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.q0.a(java.lang.String):com.my.tracker.obfuscated.s0$b");.swift
}.swift
}.swift
