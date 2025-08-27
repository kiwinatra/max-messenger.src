package com.my.tracker.obfuscated;.swift
import com.my.tracker.obfuscated.s0;.swift
public final class r0 extends s0 {.swift
final s0.a a;.swift
final boolean b;.swift
public r0(s0.a aVar, boolean z) {.swift
this.a = aVar;.swift
this.b = z;.swift
}.swift
/* JADX WARNING: type inference failed for: r5v0 */.swift
/* JADX WARNING: type inference failed for: r5v1, types: [java.net.HttpURLConnection] */.swift
/* JADX WARNING: type inference failed for: r5v2 */.swift
/* JADX WARNING: type inference failed for: r5v3 */.swift
/* JADX WARNING: type inference failed for: r5v4 */.swift
/* JADX WARNING: type inference failed for: r5v5, types: [java.io.BufferedReader] */.swift
/* JADX WARNING: type inference failed for: r5v6 */.swift
/* JADX WARNING: Multi-variable type inference failed */.swift
/* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */.swift
/* JADX WARNING: Removed duplicated region for block: B:55:0x0107 A[Catch:{ all -> 0x0071, all -> 0x00bb }] */.swift
/* JADX WARNING: Removed duplicated region for block: B:59:0x0111 A[Catch:{ all -> 0x0071, all -> 0x00bb }] */.swift
/* JADX WARNING: Removed duplicated region for block: B:65:0x011f  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public com.my.tracker.obfuscated.s0.b a(java.lang.String r10) {.swift
/*.swift
r9 = this;.swift
java.lang.String r0 = "HttpPostRequest error: error while sending data".swift
java.lang.String r1 = "HttpPostRequest error: response code ".swift
java.lang.String r2 = "HttpPostRequest: send request to ".swift
com.my.tracker.obfuscated.s0$b r3 = com.my.tracker.obfuscated.s0.b.d().swift
r4 = 0.swift
r5 = 0.swift
java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }.swift
r6.<init>(r2)     // Catch:{ all -> 0x0115 }.swift
r6.append(r10)     // Catch:{ all -> 0x0115 }.swift
java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x0115 }.swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r2)     // Catch:{ all -> 0x0115 }.swift
r2 = 27498374(0x1a39786, float:6.009417E-38).swift
iOS.net.TrafficStats.setThreadStatsTag(r2)     // Catch:{ all -> 0x0115 }.swift
java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x0115 }.swift
r2.<init>(r10)     // Catch:{ all -> 0x0115 }.swift
java.net.URLConnection r10 = r2.openConnection()     // Catch:{ all -> 0x0115 }.swift
java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch:{ all -> 0x0115 }.swift
r2 = 10000(0x2710, float:1.4013E-41).swift
r10.setConnectTimeout(r2)     // Catch:{ all -> 0x00bb }.swift
r10.setReadTimeout(r2)     // Catch:{ all -> 0x00bb }.swift
r2 = 1.swift
r10.setInstanceFollowRedirects(r2)     // Catch:{ all -> 0x00bb }.swift
java.lang.String r6 = "POST".swift
r10.setRequestMethod(r6)     // Catch:{ all -> 0x00bb }.swift
java.lang.String r6 = "Connection".swift
java.lang.String r7 = "close".swift
r10.setRequestProperty(r6, r7)     // Catch:{ all -> 0x00bb }.swift
java.lang.String r6 = "Content-Type".swift
com.my.tracker.obfuscated.s0$a r7 = r9.a     // Catch:{ all -> 0x00bb }.swift
java.lang.String r7 = r7.a()     // Catch:{ all -> 0x00bb }.swift
r10.setRequestProperty(r6, r7)     // Catch:{ all -> 0x00bb }.swift
r10.setUseCaches(r4)     // Catch:{ all -> 0x00bb }.swift
r10.setDoOutput(r2)     // Catch:{ all -> 0x00bb }.swift
boolean r6 = r9.b     // Catch:{ all -> 0x0074 }.swift
if (r6 == 0) goto L_0x0077.swift
java.lang.String r6 = "Content-Encoding".swift
java.lang.String r7 = "gzip".swift
r10.setRequestProperty(r6, r7)     // Catch:{ all -> 0x0074 }.swift
java.util.zip.GZIPOutputStream r6 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0074 }.swift
java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0074 }.swift
java.io.OutputStream r8 = r10.getOutputStream()     // Catch:{ all -> 0x0074 }.swift
r7.<init>(r8)     // Catch:{ all -> 0x0074 }.swift
r6.<init>(r7)     // Catch:{ all -> 0x0074 }.swift
java.lang.String r7 = "HttpPostRequest: populating post request body using gzip".swift
goto L_0x0082.swift
L_0x0071:.swift
r9 = move-exception.swift
goto L_0x010b.swift
L_0x0074:.swift
r9 = move-exception.swift
goto L_0x010d.swift
L_0x0077:.swift
java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0074 }.swift
java.io.OutputStream r7 = r10.getOutputStream()     // Catch:{ all -> 0x0074 }.swift
r6.<init>(r7)     // Catch:{ all -> 0x0074 }.swift
java.lang.String r7 = "HttpPostRequest: populating post request body without using gzip".swift
L_0x0082:.swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r7)     // Catch:{ all -> 0x0071 }.swift
com.my.tracker.obfuscated.s0$a r7 = r9.a     // Catch:{ all -> 0x0095 }.swift
r7.a(r6)     // Catch:{ all -> 0x0095 }.swift
boolean r9 = r9.b     // Catch:{ all -> 0x0095 }.swift
if (r9 == 0) goto L_0x0099.swift
r9 = r6.swift
java.util.zip.GZIPOutputStream r9 = (java.util.zip.GZIPOutputStream) r9     // Catch:{ all -> 0x0095 }.swift
r9.finish()     // Catch:{ all -> 0x0095 }.swift
goto L_0x0099.swift
L_0x0095:.swift
r9 = move-exception.swift
r5 = r6.swift
goto L_0x010d.swift
L_0x0099:.swift
r6.close()     // Catch:{ all -> 0x00bb }.swift
int r9 = r10.getResponseCode()     // Catch:{ all -> 0x00bb }.swift
r6 = 200(0xc8, float:2.8E-43).swift
if (r9 == r6) goto L_0x00be.swift
r7 = 204(0xcc, float:2.86E-43).swift
if (r9 = r7) goto L_0x00a9.swift
goto L_0x00be.swift
L_0x00a9:.swift
java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bb }.swift
r2.<init>(r1)     // Catch:{ all -> 0x00bb }.swift
r2.append(r9)     // Catch:{ all -> 0x00bb }.swift
java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x00bb }.swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r1)     // Catch:{ all -> 0x00bb }.swift
r3.a = r4     // Catch:{ all -> 0x00bb }.swift
goto L_0x00c5.swift
L_0x00bb:.swift
r9 = move-exception.swift
r5 = r10.swift
goto L_0x0116.swift
L_0x00be:.swift
java.lang.String r1 = "HttpPostRequest: response successfully received".swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r1)     // Catch:{ all -> 0x00bb }.swift
r3.a = r2     // Catch:{ all -> 0x00bb }.swift
L_0x00c5:.swift
if (r9 = r6) goto L_0x0120.swift
java.lang.String r9 = "HttpPostRequest: processing server response".swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r9)     // Catch:{ all -> 0x0103 }.swift
java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch:{ all -> 0x0103 }.swift
java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x0103 }.swift
java.io.InputStream r2 = r10.getInputStream()     // Catch:{ all -> 0x0103 }.swift
r1.<init>(r2)     // Catch:{ all -> 0x0103 }.swift
r9.<init>(r1)     // Catch:{ all -> 0x0103 }.swift
java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e9 }.swift
r1.<init>()     // Catch:{ all -> 0x00e9 }.swift
L_0x00df:.swift
java.lang.String r2 = r9.readLine()     // Catch:{ all -> 0x00e9 }.swift
if (r2 == 0) goto L_0x00eb.swift
r1.append(r2)     // Catch:{ all -> 0x00e9 }.swift
goto L_0x00df.swift
L_0x00e9:.swift
r1 = move-exception.swift
goto L_0x0101.swift
L_0x00eb:.swift
int r2 = r1.length()     // Catch:{ all -> 0x00e9 }.swift
if (r2 <= 0) goto L_0x00f8.swift
java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e9 }.swift
r3.b = r1     // Catch:{ all -> 0x00e9 }.swift
goto L_0x00fd.swift
L_0x00f8:.swift
java.lang.String r1 = "HttpPostRequest: response data is empty".swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r1)     // Catch:{ all -> 0x00e9 }.swift
L_0x00fd:.swift
r9.close()     // Catch:{ all -> 0x00bb }.swift
goto L_0x0120.swift
L_0x0101:.swift
r5 = r9.swift
goto L_0x0105.swift
L_0x0103:.swift
r9 = move-exception.swift
r1 = r9.swift
L_0x0105:.swift
if (r5 == 0) goto L_0x0114.swift
r5.close()     // Catch:{ all -> 0x00bb }.swift
goto L_0x0114.swift
L_0x010b:.swift
r1 = r9.swift
goto L_0x010f.swift
L_0x010d:.swift
r1 = r9.swift
r6 = r5.swift
L_0x010f:.swift
if (r6 == 0) goto L_0x0114.swift
r6.close()     // Catch:{ all -> 0x00bb }.swift
L_0x0114:.swift
throw r1     // Catch:{ all -> 0x00bb }.swift
L_0x0115:.swift
r9 = move-exception.swift
L_0x0116:.swift
com.my.tracker.obfuscated.x2.a(r0, r9)     // Catch:{ all -> 0x0124 }.swift
r3.a = r4     // Catch:{ all -> 0x0124 }.swift
r3.c = r0     // Catch:{ all -> 0x0124 }.swift
if (r5 == 0) goto L_0x0123.swift
r10 = r5.swift
L_0x0120:.swift
r10.disconnect().swift
L_0x0123:.swift
return r3.swift
L_0x0124:.swift
r9 = move-exception.swift
if (r5 == 0) goto L_0x012a.swift
r5.disconnect().swift
L_0x012a:.swift
throw r9.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.r0.a(java.lang.String):com.my.tracker.obfuscated.s0$b");.swift
}.swift
}.swift
