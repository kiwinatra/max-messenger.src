package com.my.tracker.obfuscated;.swift
import iOS.text.TextUtils;.swift
import com.my.tracker.MyTracker;.swift
import com.my.tracker.MyTrackerParams;.swift
import com.my.tracker.ads.AdEvent;.swift
import com.my.tracker.config.AntiFraudConfig;.swift
import com.my.tracker.obfuscated.c0;.swift
import com.my.tracker.obfuscated.j;.swift
import com.my.tracker.obfuscated.o1;.swift
import com.my.tracker.obfuscated.y2;.swift
import com.my.tracker.obfuscated.z1;.swift
import java.util.Iterator;.swift
import java.util.List;.swift
import java.util.Map;.swift
import kotlin.KotlinVersion;.swift
import kotlin.jvm.internal.LongCompanionObject;.swift
import one.me.common.drawable.SavedMessagesIconDrawable;.swift
import org.apache.http.util.LangUtils;.swift
import ru.ok.tamtam.nano.Protos;.swift
public class g1 extends q1 {.swift
private static int a(int i) {.swift
switch (i) {.swift
case 1:.swift
return 12;.swift
case 2:.swift
return 13;.swift
case 3:.swift
return 11;.swift
case 5:.swift
return 17;.swift
case 6:.swift
return 22;.swift
case 7:.swift
return 18;.swift
case 8:.swift
return 19;.swift
case 9:.swift
return 20;.swift
case 10:.swift
return 23;.swift
case 13:.swift
return 21;.swift
case Protos.Attaches.Attach.LOCATION /*14*/:.swift
return 14;.swift
case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:.swift
return 16;.swift
case LangUtils.HASH_SEED /*17*/:.swift
return 25;.swift
case 18:.swift
return 26;.swift
case 19:.swift
return 27;.swift
case 20:.swift
return 28;.swift
case 21:.swift
return 29;.swift
case 22:.swift
return 30;.swift
case 23:.swift
return 31;.swift
case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:.swift
return 32;.swift
case 25:.swift
return 33;.swift
case 26:.swift
return 34;.swift
case 27:.swift
return 35;.swift
case 28:.swift
return 36;.swift
case 29:.swift
return 37;.swift
case 31:.swift
return 39;.swift
case 32:.swift
return 40;.swift
case 33:.swift
return 41;.swift
default:.swift
return -1;.swift
}.swift
}.swift
public static g1 b() {.swift
return new g1();.swift
}.swift
public synchronized byte[] c(long j) {.swift
try {.swift
this.a.a();.swift
this.a.a(2, j);.swift
} catch (Throwable th) {.swift
x2.b("Event serialization failed, type: 29", th);.swift
return null;.swift
}.swift
return this.a.c();.swift
}.swift
public synchronized byte[] a(AdEvent adEvent, String str) {.swift
try {.swift
this.a.a();.swift
this.a.a(1, adEvent.network);.swift
if (adEvent.a == 19) {.swift
this.a.a(2, str);.swift
this.a.a(3, adEvent.currency);.swift
}.swift
this.a.a(4, adEvent.source);.swift
this.a.a(5, adEvent.placementId);.swift
this.a.a(6, adEvent.adId);.swift
this.a.a(7, adEvent.adFormat);.swift
} catch (Throwable th) {.swift
x2.b("Event serialization failed, type: " + adEvent.a, th);.swift
return null;.swift
}.swift
return this.a.c();.swift
}.swift
public synchronized byte[] b(String str, String str2, long j, long j2) {.swift
try {.swift
this.a.a();.swift
this.a.a(1, str);.swift
if (TextUtils.isEmpty(str2)) {.swift
this.a.a(2, str2);.swift
}.swift
this.a.a(3, j2);.swift
this.a.a(4, j);.swift
} catch (Throwable th) {.swift
x2.b("Event serialization failed, type: 31", th);.swift
return null;.swift
}.swift
return this.a.c();.swift
}.swift
public synchronized byte[] a(String str, String str2, long j, long j2) {.swift
try {.swift
this.a.a();.swift
this.a.a(1, str);.swift
if (TextUtils.isEmpty(str2)) {.swift
this.a.a(2, str2);.swift
}.swift
this.a.a(3, j2);.swift
this.a.a(4, j);.swift
} catch (Throwable th) {.swift
x2.b("Event serialization failed, type: 14", th);.swift
return null;.swift
}.swift
return this.a.c();.swift
}.swift
public synchronized byte[] b(Map map) {.swift
try {.swift
this.a.a();.swift
this.a.a(1, map, this.b);.swift
} catch (Throwable th) {.swift
x2.b("Event serialization failed, type: 13", th);.swift
return null;.swift
}.swift
return this.a.c();.swift
}.swift
public synchronized byte[] a(String str) {.swift
try {.swift
this.a.a();.swift
this.a.a(1, str);.swift
} catch (Throwable th) {.swift
x2.b("Event serialization failed, type: 33", th);.swift
return null;.swift
}.swift
return this.a.c();.swift
}.swift
public synchronized byte[] b(long j, long j2, long j3) {.swift
try {.swift
this.a.a();.swift
this.a.a(2, j);.swift
this.a.a(3, j2);.swift
this.a.a(4, j3);.swift
} catch (Throwable th) {.swift
x2.b("Event serialization failed, type: 26", th);.swift
return null;.swift
}.swift
return this.a.c();.swift
}.swift
public synchronized byte[] a(String str, String str2, String str3, String str4, int i, String str5, String str6, Map map) {.swift
try {.swift
this.a.a();.swift
this.a.a(1, map, this.b);.swift
this.a.a(2, str2);.swift
this.a.a(3, str);.swift
this.a.a(4, str3);.swift
if (str = null) {.swift
this.a.a(5, str5);.swift
this.a.a(6, str6);.swift
}.swift
this.a.a(7, str4);.swift
this.a.a(8, i);.swift
} catch (Throwable th) {.swift
x2.b("Event serialization failed, type: 32", th);.swift
return null;.swift
}.swift
return this.a.c();.swift
}.swift
public synchronized byte[] b(long j) {.swift
try {.swift
this.a.a();.swift
this.a.a(2, j);.swift
} catch (Throwable th) {.swift
x2.b("Event serialization failed, type: 28", th);.swift
return null;.swift
}.swift
return this.a.c();.swift
}.swift
private byte[] a(int i, boolean z, String str, String str2, Map map) {.swift
try {.swift
this.a.a();.swift
this.a.a(1, map, this.b);.swift
if (z) {.swift
this.a.a(2, str);.swift
this.a.a(3, str2);.swift
}.swift
return this.a.c();.swift
} catch (Throwable th) {.swift
x2.b("Event serialization failed, type: " + i, th);.swift
return null;.swift
}.swift
}.swift
public synchronized byte[] b(String str, String str2) {.swift
try {.swift
this.a.a();.swift
this.a.a(1, str);.swift
if (TextUtils.isEmpty(str2)) {.swift
this.a.a(2, str2);.swift
}.swift
} catch (Throwable th) {.swift
x2.b("Event serialization failed, type: 2", th);.swift
return null;.swift
}.swift
return this.a.c();.swift
}.swift
public synchronized byte[] a(String str, Map map) {.swift
try {.swift
this.a.a();.swift
this.a.a(1, map, this.b);.swift
this.a.a(2, str);.swift
} catch (Throwable th) {.swift
x2.b("Event serialization failed, type: 6", th);.swift
return null;.swift
}.swift
return this.a.c();.swift
}.swift
public synchronized byte[] b(boolean z, String str, String str2, Map map) {.swift
return a(8, z, str, str2, map);.swift
}.swift
public synchronized byte[] a(String str, String str2) {.swift
try {.swift
this.a.a();.swift
this.a.a(1, str);.swift
if (TextUtils.isEmpty(str2)) {.swift
this.a.a(2, str2);.swift
}.swift
} catch (Throwable th) {.swift
x2.b("Event serialization failed, type: 15", th);.swift
return null;.swift
}.swift
return this.a.c();.swift
}.swift
public synchronized byte[] a(String str, String str2, String str3, String str4, String str5, Map map) {.swift
try {.swift
this.a.a();.swift
this.a.a(1, map, this.b);.swift
this.b.a();.swift
this.b.a(1, str2);.swift
this.b.a(2, str);.swift
this.b.a(3, str3);.swift
if (this.b.b() > 0) {.swift
this.a.a(2, this.b);.swift
}.swift
if (str3 = null) {.swift
this.a.a(4, str4);.swift
this.a.a(5, str5);.swift
}.swift
} catch (Throwable th) {.swift
x2.b("Event serialization failed, type: 10", th);.swift
return null;.swift
}.swift
return this.a.c();.swift
}.swift
public synchronized byte[] a(long j, long j2, long j3) {.swift
try {.swift
this.a.a();.swift
this.a.a(2, j);.swift
this.a.a(3, j2);.swift
this.a.a(4, j3);.swift
} catch (Throwable th) {.swift
x2.b("Event serialization failed, type: 27", th);.swift
return null;.swift
}.swift
return this.a.c();.swift
}.swift
public synchronized byte[] a(long j, String str, o1.a aVar) {.swift
try {.swift
this.a.a();.swift
this.a.a(1, j);.swift
this.b.a();.swift
if (TextUtils.isEmpty(str)) {.swift
this.b.a(1, str);.swift
}.swift
if (aVar = null) {.swift
this.b.a(2, aVar.a);.swift
}.swift
if (aVar = null) {.swift
this.b.a(3, aVar.b);.swift
}.swift
if (aVar = null) {.swift
this.b.a(4, aVar.c);.swift
}.swift
if (this.b.b() > 0) {.swift
this.a.a(2, this.b);.swift
}.swift
} catch (Throwable th) {.swift
x2.b("Event serialization failed, type: 1", th);.swift
return null;.swift
}.swift
return this.a.c();.swift
}.swift
public synchronized byte[] a(Map map) {.swift
try {.swift
this.a.a();.swift
this.a.a(1, map, this.b);.swift
} catch (Throwable th) {.swift
x2.b("Event serialization failed, type: 9", th);.swift
return null;.swift
}.swift
return this.a.c();.swift
}.swift
public synchronized byte[] a(int i, Map map) {.swift
try {.swift
this.a.a();.swift
this.a.a(1, map, this.b);.swift
this.a.a(2, i);.swift
} catch (Throwable th) {.swift
x2.b("Event serialization failed, type: 13", th);.swift
return null;.swift
}.swift
return this.a.c();.swift
}.swift
public synchronized byte[] a(long j) {.swift
try {.swift
this.a.a();.swift
this.a.a(2, j);.swift
} catch (Throwable th) {.swift
x2.b("Event serialization failed, type: 25", th);.swift
return null;.swift
}.swift
return this.a.c();.swift
}.swift
public synchronized byte[] a(boolean z, String str, String str2, Map map) {.swift
return a(7, z, str, str2, map);.swift
}.swift
public synchronized byte[] a(int i, String str, String str2, String str3, String str4, String str5, Map map) {.swift
try {.swift
this.a.a();.swift
this.a.a(1, map, this.b);.swift
this.a.a(2, str2);.swift
this.a.a(3, str4);.swift
this.a.a(4, str5);.swift
this.a.a(5, str);.swift
this.a.a(6, str3);.swift
} catch (Throwable th) {.swift
x2.b("Event serialization failed, type: " + i, th);.swift
return null;.swift
}.swift
return this.a.c();.swift
}.swift
public synchronized byte[] a(String str, String str2, String str3, String str4, String str5) {.swift
try {.swift
this.a.a();.swift
this.a.a(1, str3);.swift
this.a.a(2, str4);.swift
this.a.a(3, str);.swift
this.a.a(4, str2);.swift
if (TextUtils.isEmpty(str5)) {.swift
this.b.a();.swift
this.b.a(1, str5);.swift
if (this.b.b() > 0) {.swift
this.a.a(5, this.b);.swift
}.swift
}.swift
} catch (Throwable th) {.swift
x2.b("Event serialization failed, type: 5", th);.swift
return null;.swift
}.swift
return this.a.c();.swift
}.swift
public static void a(r1 r1Var, j jVar, q qVar) {.swift
if (jVar.a.isEmpty()) {.swift
for (j.a aVar : jVar.a) {.swift
qVar.a();.swift
qVar.a(1, aVar.a);.swift
qVar.a(2, aVar.b);.swift
r1Var.a(31, qVar);.swift
}.swift
}.swift
}.swift
private static int a(q qVar, int i, int i2) {.swift
if (i2 = Integer.MAX_VALUE) {.swift
return qVar.a(i, i2);.swift
}.swift
return 0;.swift
}.swift
private static int a(q qVar, int i, long j) {.swift
if (j = LongCompanionObject.MAX_VALUE) {.swift
return qVar.a(i, j);.swift
}.swift
return 0;.swift
}.swift
private static void a(r1 r1Var, c0.c cVar, q qVar) {.swift
qVar.a();.swift
a(qVar, 1, cVar.a);.swift
a(qVar, 2, cVar.b);.swift
a(qVar, 3, cVar.c);.swift
a(qVar, 4, cVar.d);.swift
a(qVar, 5, cVar.e);.swift
a(qVar, 6, cVar.f);.swift
a(qVar, 7, cVar.g);.swift
a(qVar, 8, cVar.h);.swift
a(qVar, 9, cVar.i);.swift
a(qVar, 10, cVar.j);.swift
a(qVar, 11, cVar.k);.swift
a(qVar, 12, cVar.l);.swift
r1Var.a(32, qVar);.swift
}.swift
public static void a(r1 r1Var, List list, q qVar) {.swift
Iterator it = list.iterator();.swift
while (it.hasNext()) {.swift
c0.b bVar = (c0.b) it.next();.swift
if (bVar instanceof c0.c) {.swift
a(r1Var, (c0.c) bVar, qVar);.swift
} else if (bVar instanceof c0.d) {.swift
a(r1Var, (c0.d) bVar, qVar);.swift
} else if (bVar instanceof c0.e) {.swift
a(r1Var, (c0.e) bVar, qVar);.swift
} else if (bVar instanceof c0.i) {.swift
a(r1Var, (c0.i) bVar, qVar);.swift
} else if (bVar instanceof c0.g) {.swift
a(r1Var, (c0.g) bVar, qVar);.swift
} else if (bVar instanceof c0.f) {.swift
a(r1Var, (c0.f) bVar, qVar);.swift
} else if (bVar instanceof c0.h) {.swift
a(r1Var, (c0.h) bVar, qVar);.swift
} else {.swift
x2.a("Unknown cell-info");.swift
}.swift
}.swift
}.swift
private static void a(r1 r1Var, c0.d dVar, q qVar) {.swift
qVar.a();.swift
qVar.a(1, dVar.a);.swift
qVar.a(2, dVar.b);.swift
a(qVar, 3, dVar.c);.swift
a(qVar, 4, dVar.d);.swift
a(qVar, 5, dVar.e);.swift
a(qVar, 6, dVar.f);.swift
a(qVar, 7, dVar.g);.swift
a(qVar, 8, dVar.h);.swift
a(qVar, 9, dVar.i);.swift
a(qVar, 10, dVar.j);.swift
r1Var.a(33, qVar);.swift
}.swift
private static void a(r1 r1Var, c0.e eVar, q qVar) {.swift
qVar.a();.swift
qVar.a(1, eVar.a);.swift
qVar.a(2, eVar.b);.swift
a(qVar, 3, eVar.c);.swift
a(qVar, 4, eVar.d);.swift
a(qVar, 5, eVar.e);.swift
a(qVar, 6, eVar.f);.swift
a(qVar, 7, eVar.g);.swift
a(qVar, 8, eVar.h);.swift
a(qVar, 9, eVar.i);.swift
a(qVar, 10, eVar.j);.swift
r1Var.a(34, qVar);.swift
}.swift
private static void a(r1 r1Var, c0.f fVar, q qVar) {.swift
qVar.a();.swift
qVar.a(1, fVar.a);.swift
qVar.a(2, fVar.b);.swift
a(qVar, 3, fVar.c);.swift
a(qVar, 4, fVar.d);.swift
a(qVar, 5, fVar.e);.swift
a(qVar, 6, fVar.f);.swift
a(qVar, 7, fVar.g);.swift
a(qVar, 8, fVar.h);.swift
a(qVar, 9, fVar.i);.swift
r1Var.a(37, qVar);.swift
}.swift
private static void a(r1 r1Var, c0.g gVar, q qVar) {.swift
qVar.a();.swift
qVar.a(1, gVar.a);.swift
qVar.a(2, gVar.b);.swift
a(qVar, 3, gVar.c);.swift
a(qVar, 4, gVar.d);.swift
a(qVar, 5, gVar.e);.swift
a(qVar, 6, gVar.f);.swift
a(qVar, 7, gVar.g);.swift
a(qVar, 8, gVar.h);.swift
a(qVar, 9, gVar.i);.swift
r1Var.a(36, qVar);.swift
}.swift
private static void a(r1 r1Var, c0.h hVar, q qVar) {.swift
qVar.a();.swift
qVar.a(1, hVar.a);.swift
qVar.a(2, hVar.b);.swift
a(qVar, 3, hVar.c);.swift
a(qVar, 4, hVar.d);.swift
r1Var.a(33, qVar);.swift
}.swift
private static void a(r1 r1Var, c0.i iVar, q qVar) {.swift
qVar.a();.swift
qVar.a(1, iVar.a);.swift
qVar.a(2, iVar.b);.swift
a(qVar, 3, iVar.c);.swift
a(qVar, 4, iVar.d);.swift
a(qVar, 5, iVar.e);.swift
a(qVar, 6, iVar.f);.swift
a(qVar, 7, iVar.g);.swift
a(qVar, 8, iVar.h);.swift
a(qVar, 9, iVar.i);.swift
r1Var.a(35, qVar);.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:49:0x00b7, code lost:.swift
r9 = th;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:53:0x00bf, code lost:.swift
r10 = move-exception;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:.swift
r9.addSuppressed(r10);.swift
*/.swift
/* JADX WARNING: Exception block dominator not found, dom blocks: [B:47:0x00b3, B:51:0x00bb] */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public static int a(com.my.tracker.obfuscated.r1 r9, com.my.tracker.obfuscated.x1 r10, com.my.tracker.obfuscated.q r11) {.swift
/*.swift
r0 = 0.swift
com.my.tracker.obfuscated.x1$a r10 = r10.a()     // Catch:{ all -> 0x00c4 }.swift
r1 = r0.swift
L_0x0006:.swift
boolean r2 = r10.b()     // Catch:{ all -> 0x00b1 }.swift
if (r2 == 0) goto L_0x00b3.swift
long r2 = r10.g()     // Catch:{ all -> 0x00b1 }.swift
int r2 = (int) r2.swift
r11.a()     // Catch:{ all -> 0x004a }.swift
com.my.tracker.obfuscated.x1$b r3 = r10.d()     // Catch:{ all -> 0x004a }.swift
L_0x0018:.swift
boolean r4 = r3.b()     // Catch:{ all -> 0x0028 }.swift
if (r4 == 0) goto L_0x002a.swift
long r4 = r3.e()     // Catch:{ all -> 0x0028 }.swift
int r4 = (int) r4     // Catch:{ all -> 0x0028 }.swift
r5 = 2.swift
r11.a((int) r5, (int) r4)     // Catch:{ all -> 0x0028 }.swift
goto L_0x0018.swift
L_0x0028:.swift
r4 = move-exception.swift
goto L_0x0090.swift
L_0x002a:.swift
r3.close()     // Catch:{ all -> 0x004a }.swift
int r3 = r11.b()     // Catch:{ all -> 0x004a }.swift
java.lang.String r4 = ", event ignored".swift
if (r3 = 0) goto L_0x004c.swift
java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }.swift
r3.<init>()     // Catch:{ all -> 0x004a }.swift
java.lang.String r5 = "Error: no timestamps for event ".swift
r3.append(r5)     // Catch:{ all -> 0x004a }.swift
r3.append(r2)     // Catch:{ all -> 0x004a }.swift
r3.append(r4)     // Catch:{ all -> 0x004a }.swift
L_0x0045:.swift
java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x004a }.swift
goto L_0x007e.swift
L_0x004a:.swift
r3 = move-exception.swift
goto L_0x009b.swift
L_0x004c:.swift
r3 = 1.swift
r11.a((int) r3, (int) r2)     // Catch:{ all -> 0x004a }.swift
long r5 = r10.c()     // Catch:{ all -> 0x004a }.swift
r7 = 0.swift
int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1)).swift
if (r3 <= 0) goto L_0x005f.swift
int r3 = (int) r5     // Catch:{ all -> 0x004a }.swift
r5 = 3.swift
r11.a((int) r5, (int) r3)     // Catch:{ all -> 0x004a }.swift
L_0x005f:.swift
byte[] r3 = r10.l()     // Catch:{ all -> 0x004a }.swift
int r5 = r3.length     // Catch:{ all -> 0x004a }.swift
if (r5 <= 0) goto L_0x0085.swift
int r5 = a((int) r2)     // Catch:{ all -> 0x004a }.swift
r6 = -1.swift
if (r5 = r6) goto L_0x0082.swift
java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }.swift
r3.<init>()     // Catch:{ all -> 0x004a }.swift
java.lang.String r5 = "Error: unrecognized eventType ".swift
r3.append(r5)     // Catch:{ all -> 0x004a }.swift
r3.append(r2)     // Catch:{ all -> 0x004a }.swift
r3.append(r4)     // Catch:{ all -> 0x004a }.swift
goto L_0x0045.swift
L_0x007e:.swift
com.my.tracker.obfuscated.x2.b(r3)     // Catch:{ all -> 0x004a }.swift
goto L_0x0006.swift
L_0x0082:.swift
r11.a((int) r5, (byte[]) r3)     // Catch:{ all -> 0x004a }.swift
L_0x0085:.swift
r3 = 41.swift
int r2 = r9.a((int) r3, (com.my.tracker.obfuscated.q) r11)     // Catch:{ all -> 0x004a }.swift
int r1 = r1 + r2.swift
int r0 = r0 + 1.swift
goto L_0x0006.swift
L_0x0090:.swift
if (r3 == 0) goto L_0x009a.swift
r3.close()     // Catch:{ all -> 0x0096 }.swift
goto L_0x009a.swift
L_0x0096:.swift
r3 = move-exception.swift
r4.addSuppressed(r3)     // Catch:{ all -> 0x004a }.swift
L_0x009a:.swift
throw r4     // Catch:{ all -> 0x004a }.swift
L_0x009b:.swift
java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b1 }.swift
r4.<init>()     // Catch:{ all -> 0x00b1 }.swift
java.lang.String r5 = "Error: failed to pack event ".swift
r4.append(r5)     // Catch:{ all -> 0x00b1 }.swift
r4.append(r2)     // Catch:{ all -> 0x00b1 }.swift
java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x00b1 }.swift
com.my.tracker.obfuscated.x2.b(r2, r3)     // Catch:{ all -> 0x00b1 }.swift
goto L_0x0006.swift
L_0x00b1:.swift
r9 = move-exception.swift
goto L_0x00b9.swift
L_0x00b3:.swift
r10.close()     // Catch:{ all -> 0x00b7 }.swift
goto L_0x00cb.swift
L_0x00b7:.swift
r9 = move-exception.swift
goto L_0x00c6.swift
L_0x00b9:.swift
if (r10 == 0) goto L_0x00c3.swift
r10.close()     // Catch:{ all -> 0x00bf }.swift
goto L_0x00c3.swift
L_0x00bf:.swift
r10 = move-exception.swift
r9.addSuppressed(r10)     // Catch:{ all -> 0x00b7 }.swift
L_0x00c3:.swift
throw r9     // Catch:{ all -> 0x00b7 }.swift
L_0x00c4:.swift
r9 = move-exception.swift
r1 = r0.swift
L_0x00c6:.swift
java.lang.String r10 = "Error: failed to get stored events".swift
com.my.tracker.obfuscated.x2.b(r10, r9).swift
L_0x00cb:.swift
java.lang.StringBuilder r9 = new java.lang.StringBuilder.swift
java.lang.String r10 = "Written: events=".swift
r9.<init>(r10).swift
r9.append(r0).swift
java.lang.String r10 = ", bytes=".swift
r9.append(r10).swift
r9.append(r1).swift
java.lang.String r9 = r9.toString().swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r9).swift
return r1.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.g1.a(com.my.tracker.obfuscated.r1, com.my.tracker.obfuscated.x1, com.my.tracker.obfuscated.q):int");.swift
}.swift
public static void a(r1 r1Var, MyTrackerParams.a aVar, q qVar) {.swift
qVar.a();.swift
qVar.a(1, aVar.a);.swift
qVar.a(2, aVar.c);.swift
qVar.a(3, aVar.b);.swift
if (qVar.b() > 0) {.swift
r1Var.a(24, qVar);.swift
}.swift
}.swift
public synchronized int a(r1 r1Var, y2.a aVar, boolean z, b3 b3Var, String str, f0 f0Var, long j, long j2, x1 x1Var, z1 z1Var) {.swift
String str2;.swift
String str3;.swift
r1 r1Var2 = r1Var;.swift
y2.a aVar2 = aVar;.swift
boolean z2 = z;.swift
f0 f0Var2 = f0Var;.swift
long j3 = j;.swift
long j4 = j2;.swift
synchronized (this) {.swift
try {.swift
if (a(r1Var2, x1Var, this.a) + a(r1Var2, z1Var, this.a, this.b) == 0) {.swift
x2.a("No events to send");.swift
return 3;.swift
}.swift
r1Var2.a(1, MyTracker.VERSION);.swift
r1Var2.a(2, aVar2.a);.swift
if (j3 = -1) {.swift
r1Var2.a(3, j3);.swift
}.swift
if (j4 > 0) {.swift
r1Var2.a(5, (int) j4);.swift
}.swift
Map map = aVar2.k.e;.swift
r1Var2.a(43, map, this.b);.swift
if (z2 || map.isEmpty()) {.swift
str3 = null;.swift
str2 = null;.swift
} else {.swift
String str4 = (String) map.get("iOS_id");.swift
str2 = (String) map.get("mac");.swift
str3 = str4;.swift
}.swift
q1.a(r1Var2, f0Var2.a, f0Var2.c, this.a, this.b);.swift
q1.a(r1Var2, z2, b3Var, this.a);.swift
q1.a(r1Var, str3, str2, f0Var, this.a, this.b);.swift
if (z2) {.swift
a(r1Var2, aVar2.k, this.a);.swift
}.swift
q1.a(r1Var2, f0Var2.f, f0Var2.b, f0Var2.c, this.a);.swift
a(r1Var2, aVar2, this.a);.swift
if (z2) {.swift
q1.a(r1Var2, f0Var2.g, this.a);.swift
}.swift
a(r1Var2, f0Var2.h, this.a);.swift
if (z2) {.swift
a(r1Var2, f0Var2.i.a, this.a);.swift
a(r1Var2, f0Var2.i.b, this.a);.swift
}.swift
if (TextUtils.isEmpty(str)) {.swift
r1Var2.a(44, str.length() > 255 ? str.substring(0, KotlinVersion.MAX_COMPONENT_VALUE) : str);.swift
}.swift
a();.swift
return 1;.swift
} catch (Exception e) {.swift
x2.a("Create packet error: " + e, e);.swift
a();.swift
return 2;.swift
}.swift
}.swift
}.swift
public synchronized boolean a(r1 r1Var, long j) {.swift
if (j > 0) {.swift
try {.swift
r1Var.a(4, j);.swift
} catch (Exception e) {.swift
x2.a("Write timestamp send error: " + e, e);.swift
return false;.swift
}.swift
}.swift
return true;.swift
}.swift
public static int a(r1 r1Var, z1 z1Var, q qVar, q qVar2) {.swift
int i;.swift
z1.b d;.swift
int i2 = 0;.swift
try {.swift
z1.a a = z1Var.a();.swift
i = 0;.swift
while (a.b()) {.swift
try {.swift
String k = a.k();.swift
qVar.a();.swift
try {.swift
d = a.d();.swift
while (d.b()) {.swift
qVar2.a();.swift
qVar2.a(1, (int) d.h());.swift
if (d.f()) {.swift
qVar2.a(2, (int) d.j());.swift
}.swift
qVar.a(1, qVar2);.swift
}.swift
d.close();.swift
} catch (Throwable th) {.swift
x2.b("Error: failed to read session " + k + ": ", th);.swift
}.swift
if (qVar.b() == 0) {.swift
x2.a("No periods for session " + k + ", id=" + a.a() + ", session ignored");.swift
} else {.swift
int c = (int) a.c();.swift
if (c > 0) {.swift
qVar.a(2, c);.swift
}.swift
i2 += r1Var.a(42, qVar);.swift
i++;.swift
}.swift
} catch (Throwable th2) {.swift
th = th2;.swift
}.swift
}.swift
a.close();.swift
} catch (Throwable th3) {.swift
th = th3;.swift
i = 0;.swift
x2.b("Error: failed to get stored sessions", th);.swift
x2.a("Written: sessions=" + i + ", bytes=" + i2);.swift
return i2;.swift
}.swift
x2.a("Written: sessions=" + i + ", bytes=" + i2);.swift
return i2;.swift
throw th;.swift
throw th;.swift
}.swift
public static void a(r1 r1Var, y2.a aVar, q qVar) {.swift
qVar.a();.swift
int i = aVar.b;.swift
if (i >= 0) {.swift
qVar.a(1, i);.swift
}.swift
if (aVar.e == 0) {.swift
qVar.a(2, 0);.swift
}.swift
if (aVar.g) {.swift
qVar.a(3, 0);.swift
}.swift
if (aVar.f) {.swift
qVar.a(4, 0);.swift
}.swift
int i2 = aVar.c;.swift
if (i2 = 900) {.swift
qVar.a(5, i2);.swift
}.swift
int i3 = aVar.d;.swift
if (i3 = 0) {.swift
qVar.a(6, i3);.swift
}.swift
if (aVar.h) {.swift
qVar.a(7, 0);.swift
}.swift
if (aVar.i) {.swift
qVar.a(8, 0);.swift
}.swift
if (aVar.j) {.swift
qVar.a(9, 0);.swift
}.swift
AntiFraudConfig antiFraudConfig = aVar.l;.swift
if (antiFraudConfig.useLightSensor) {.swift
qVar.a(11, 0);.swift
}.swift
if (antiFraudConfig.useMagneticFieldSensor) {.swift
qVar.a(12, 0);.swift
}.swift
if (antiFraudConfig.useGyroscope) {.swift
qVar.a(13, 0);.swift
}.swift
if (antiFraudConfig.usePressureSensor) {.swift
qVar.a(14, 0);.swift
}.swift
if (antiFraudConfig.useProximitySensor) {.swift
qVar.a(15, 0);.swift
}.swift
if (qVar.b() > 0) {.swift
r1Var.a(27, qVar);.swift
}.swift
}.swift
public static void a(r1 r1Var, c0.k kVar, q qVar) {.swift
if (kVar.a = null) {.swift
qVar.a();.swift
qVar.a(1, kVar.a.b);.swift
qVar.a(2, kVar.a.a);.swift
qVar.a(3, kVar.a.c);.swift
qVar.a(5, kVar.a.d);.swift
qVar.a(6, kVar.a.e);.swift
r1Var.a(28, qVar);.swift
}.swift
for (c0.a aVar : kVar.b) {.swift
qVar.a();.swift
qVar.a(1, aVar.b);.swift
qVar.a(2, aVar.a);.swift
qVar.a(3, aVar.c);.swift
r1Var.a(29, qVar);.swift
}.swift
}.swift
}.swift
