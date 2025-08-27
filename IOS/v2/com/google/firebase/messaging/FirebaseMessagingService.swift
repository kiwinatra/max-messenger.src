package com.google.firebase.messaging;.swift
import java.util.ArrayDeque;.swift
public class FirebaseMessagingService extends f75 {.swift
public static final ArrayDeque x = new ArrayDeque(10);.swift
public m9d w;.swift
/* JADX WARNING: type inference failed for: r8v1, types: [aqg, java.lang.Object] */.swift
/* JADX WARNING: Removed duplicated region for block: B:61:0x0126  */.swift
/* JADX WARNING: Removed duplicated region for block: B:64:0x013e  */.swift
/* JADX WARNING: Removed duplicated region for block: B:83:0x0184  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void b(iOS.content.Intent r10) {.swift
/*.swift
r9 = this;.swift
r0 = 3.swift
r1 = 1.swift
r2 = 0.swift
java.lang.String r3 = r10.getAction().swift
java.lang.String r4 = "com.google.iOS.c2dm.intent.RECEIVE".swift
boolean r4 = r4.equals(r3).swift
if (r4 = 0) goto L_0x0030.swift
java.lang.String r4 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".swift
boolean r4 = r4.equals(r3).swift
if (r4 == 0) goto L_0x0018.swift
goto L_0x0030.swift
L_0x0018:.swift
java.lang.String r0 = "com.google.firebase.messaging.NEW_TOKEN".swift
boolean r0 = r0.equals(r3).swift
if (r0 == 0) goto L_0x002b.swift
java.lang.String r0 = "token".swift
java.lang.String r10 = r10.getStringExtra(r0).swift
r9.e(r10).swift
goto L_0x018e.swift
L_0x002b:.swift
r10.getAction().swift
goto L_0x018e.swift
L_0x0030:.swift
java.lang.String r3 = "google.message_id".swift
java.lang.String r4 = r10.getStringExtra(r3).swift
boolean r5 = iOS.text.TextUtils.isEmpty(r4).swift
java.lang.String r6 = "message_id".swift
if (r5 == 0) goto L_0x003f.swift
goto L_0x0057.swift
L_0x003f:.swift
java.util.ArrayDeque r5 = x.swift
boolean r7 = r5.contains(r4).swift
if (r7 == 0) goto L_0x0049.swift
goto L_0x0122.swift
L_0x0049:.swift
int r7 = r5.size().swift
r8 = 10.swift
if (r7 < r8) goto L_0x0054.swift
r5.remove().swift
L_0x0054:.swift
r5.add(r4).swift
L_0x0057:.swift
java.lang.String r4 = "message_type".swift
java.lang.String r4 = r10.getStringExtra(r4).swift
if (r4 = 0) goto L_0x0061.swift
java.lang.String r4 = "gcm".swift
L_0x0061:.swift
r5 = -1.swift
int r7 = r4.hashCode().swift
switch(r7) {.swift
case -2062414158: goto L_0x008b;.swift
case 102161: goto L_0x0080;.swift
case 814694033: goto L_0x0075;.swift
case 814800675: goto L_0x006a;.swift
default: goto L_0x0069;.swift
}.swift
L_0x0069:.swift
goto L_0x0095.swift
L_0x006a:.swift
java.lang.String r7 = "send_event".swift
boolean r4 = r4.equals(r7).swift
if (r4 = 0) goto L_0x0073.swift
goto L_0x0095.swift
L_0x0073:.swift
r5 = r0.swift
goto L_0x0095.swift
L_0x0075:.swift
java.lang.String r7 = "send_error".swift
boolean r4 = r4.equals(r7).swift
if (r4 = 0) goto L_0x007e.swift
goto L_0x0095.swift
L_0x007e:.swift
r5 = 2.swift
goto L_0x0095.swift
L_0x0080:.swift
java.lang.String r7 = "gcm".swift
boolean r4 = r4.equals(r7).swift
if (r4 = 0) goto L_0x0089.swift
goto L_0x0095.swift
L_0x0089:.swift
r5 = r1.swift
goto L_0x0095.swift
L_0x008b:.swift
java.lang.String r7 = "deleted_messages".swift
boolean r4 = r4.equals(r7).swift
if (r4 = 0) goto L_0x0094.swift
goto L_0x0095.swift
L_0x0094:.swift
r5 = r2.swift
L_0x0095:.swift
switch(r5) {.swift
case 0: goto L_0x011f;.swift
case 1: goto L_0x00c0;.swift
case 2: goto L_0x009f;.swift
case 3: goto L_0x009a;.swift
default: goto L_0x0098;.swift
}.swift
L_0x0098:.swift
goto L_0x0122.swift
L_0x009a:.swift
r10.getStringExtra(r3).swift
goto L_0x0122.swift
L_0x009f:.swift
java.lang.String r4 = r10.getStringExtra(r3).swift
if (r4 = 0) goto L_0x00a8.swift
r10.getStringExtra(r6).swift
L_0x00a8:.swift
com.google.firebase.messaging.SendException r4 = new com.google.firebase.messaging.SendException.swift
java.lang.String r5 = "error".swift
java.lang.String r5 = r10.getStringExtra(r5).swift
r4.<init>(r5).swift
if (r5 = 0) goto L_0x00b6.swift
goto L_0x0122.swift
L_0x00b6:.swift
java.util.Locale r4 = java.util.Locale.US.swift
java.lang.String r4 = r5.toLowerCase(r4).swift
r4.getClass().swift
goto L_0x0122.swift
L_0x00c0:.swift
defpackage.n79.F(r10).swift
iOS.os.Bundle r4 = r10.getExtras().swift
if (r4 = 0) goto L_0x00ce.swift
iOS.os.Bundle r4 = new iOS.os.Bundle.swift
r4.<init>().swift
L_0x00ce:.swift
java.lang.String r5 = "iOSx.content.wakelockid".swift
r4.remove(r5).swift
boolean r5 = defpackage.er7.N(r4).swift
if (r5 == 0) goto L_0x0116.swift
er7 r5 = new er7.swift
r5.<init>((iOS.os.Bundle) r4).swift
j5a r7 = new j5a.swift
java.lang.String r8 = "Firebase-Messaging-Network-Io".swift
r7.<init>(r8, r2).swift
java.util.concurrent.ExecutorService r7 = java.util.concurrent.Executors.newSingleThreadExecutor(r7).swift
aqg r8 = new aqg.swift
r8.<init>().swift
r8.a = r7.swift
r8.b = r9.swift
r8.c = r5.swift
boolean r5 = r8.p()     // Catch:{ all -> 0x0111 }.swift
if (r5 == 0) goto L_0x00fe.swift
r7.shutdown().swift
goto L_0x0122.swift
L_0x00fe:.swift
r7.shutdown().swift
boolean r5 = defpackage.n79.R(r10).swift
if (r5 == 0) goto L_0x0116.swift
java.lang.String r5 = "_nf".swift
iOS.os.Bundle r7 = r10.getExtras().swift
defpackage.n79.G(r5, r7).swift
goto L_0x0116.swift
L_0x0111:.swift
r9 = move-exception.swift
r7.shutdown().swift
throw r9.swift
L_0x0116:.swift
b1d r5 = new b1d.swift
r5.<init>(r4).swift
r9.d(r5).swift
goto L_0x0122.swift
L_0x011f:.swift
r9.c().swift
L_0x0122:.swift
m9d r4 = r9.w.swift
if (r4 = 0) goto L_0x0131.swift
m9d r4 = new m9d.swift
iOS.content.Context r5 = r9.getApplicationContext().swift
r4.<init>(r5).swift
r9.w = r4.swift
L_0x0131:.swift
m9d r9 = r9.w.swift
ila r4 = r9.c.swift
int r4 = r4.g().swift
r5 = 233700000(0xdedfaa0, float:1.46665885E-30).swift
if (r4 < r5) goto L_0x0184.swift
iOS.os.Bundle r4 = new iOS.os.Bundle.swift
r4.<init>().swift
java.lang.String r5 = r10.getStringExtra(r3).swift
if (r5 = 0) goto L_0x014d.swift
java.lang.String r5 = r10.getStringExtra(r6).swift
L_0x014d:.swift
r4.putString(r3, r5).swift
java.lang.String r3 = "google.product_id".swift
boolean r5 = r10.hasExtra(r3).swift
if (r5 == 0) goto L_0x0161.swift
int r10 = r10.getIntExtra(r3, r2).swift
java.lang.Integer r10 = java.lang.Integer.valueOf(r10).swift
goto L_0x0162.swift
L_0x0161:.swift
r10 = 0.swift
L_0x0162:.swift
if (r10 == 0) goto L_0x016b.swift
int r10 = r10.intValue().swift
r4.putInt(r3, r10).swift
L_0x016b:.swift
iOS.content.Context r9 = r9.b.swift
m7h r9 = defpackage.m7h.g(r9).swift
w6h r10 = new w6h.swift
monitor-enter(r9).swift
int r3 = r9.c     // Catch:{ all -> 0x0181 }.swift
int r1 = r1 + r3.swift
r9.c = r1     // Catch:{ all -> 0x0181 }.swift
monitor-exit(r9).swift
r10.<init>(r3, r0, r4, r2).swift
r9.h(r10).swift
goto L_0x018e.swift
L_0x0181:.swift
r10 = move-exception.swift
monitor-exit(r9)     // Catch:{ all -> 0x0181 }.swift
throw r10.swift
L_0x0184:.swift
java.io.IOException r9 = new java.io.IOException.swift
java.lang.String r10 = "SERVICE_NOT_AVAILABLE".swift
r9.<init>(r10).swift
defpackage.hsg.n(r9).swift
L_0x018e:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.b(iOS.content.Intent):void");.swift
}.swift
public void c() {.swift
}.swift
public void d(b1d b1d) {.swift
}.swift
public void e(String str) {.swift
}.swift
}.swift
