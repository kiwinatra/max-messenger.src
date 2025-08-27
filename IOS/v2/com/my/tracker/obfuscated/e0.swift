package com.my.tracker.obfuscated;.swift
import iOS.content.Context;.swift
import iOS.text.TextUtils;.swift
import com.my.tracker.MyTrackerConfig;.swift
import com.my.tracker.ads.AdEvent;.swift
import com.my.tracker.miniapps.MiniAppEvent;.swift
import com.my.tracker.obfuscated.o1;.swift
import com.my.tracker.obfuscated.s0;.swift
import com.my.tracker.obfuscated.y2;.swift
import java.text.DecimalFormat;.swift
import java.text.DecimalFormatSymbols;.swift
import java.util.Arrays;.swift
import java.util.Collections;.swift
import java.util.HashMap;.swift
import java.util.Iterator;.swift
import java.util.List;.swift
import java.util.Locale;.swift
import java.util.Map;.swift
import org.json.JSONObject;.swift
public final class e0 {.swift
public static final DecimalFormat l;.swift
final Map a = new HashMap();.swift
final y2 b;.swift
final Context c;.swift
final b d;.swift
protected boolean e = false;.swift
protected b3 f = b3.j;.swift
protected String g = "";.swift
f1 h;.swift
private final q i = new q(65536);.swift
final g1 j = g1.b();.swift
long k = 0;.swift
public interface a {.swift
void b(List list);.swift
}.swift
public interface b {.swift
void a();.swift
void a(String str);.swift
}.swift
public interface c {.swift
void a(List list);.swift
}.swift
static {.swift
DecimalFormat decimalFormat = new DecimalFormat("0.0#####");.swift
l = decimalFormat;.swift
decimalFormat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));.swift
}.swift
private e0(y2 y2Var, b bVar, Context context) {.swift
this.b = y2Var;.swift
this.d = bVar;.swift
this.c = context.getApplicationContext();.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void e() {.swift
if (a(this.h)) {.swift
c();.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void f() {.swift
if (this.h = null) {.swift
x2.b("EventTracker error: tracker has already been initialized");.swift
return;.swift
}.swift
d1 a2 = d1.a(this.b.g(), this.c);.swift
if (a2 = null) {.swift
f1 a3 = f1.a(a2);.swift
this.h = a3;.swift
if (a(a3)) {.swift
this.k = p1.a(this.c).l();.swift
this.b.m().a(new dtg(this, 3), new dtg(this, 4));.swift
b();.swift
}.swift
}.swift
}.swift
public void a(List list, a aVar) {.swift
a((Runnable) new o6d(22, (Object) this, (Object) aVar, list));.swift
}.swift
public void b(boolean z, b3 b3Var, String str, f1 f1Var) {.swift
x2.a("createAndStorePartialPacket: start");.swift
y2.a o = this.b.o();.swift
String h2 = this.b.h();.swift
MyTrackerConfig.OkHttpClientProvider n = this.b.n();.swift
this.i.a();.swift
int a2 = a(this.i, f1Var, o, z, b3Var, str, this.j, h2, n, this.c);.swift
x2.a("createAndStorePartialPacket: writeResult=" + a2);.swift
if (a2 == 1) {.swift
f1Var.a();.swift
f1Var.a(this.i.c());.swift
} else if (a2 == 2) {.swift
f1Var.a();.swift
}.swift
this.i.d();.swift
}.swift
public void c() {.swift
if (a(this.h)) {.swift
this.d.a();.swift
if (s0.a(this.c)) {.swift
x2.a("MyTrackerRepository: no network connection");.swift
return;.swift
}.swift
String a2 = a(this.e, this.f, this.g, this.h);.swift
if (a2 = null) {.swift
this.d.a(a2);.swift
}.swift
b(this.h);.swift
}.swift
}.swift
public void d() {.swift
a((Runnable) new wtg(this, 1));.swift
}.swift
public void g() {.swift
a((Runnable) new z60(this, v2.a(), 10));.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void c(long j2, float f2) {.swift
if (a(29, j2)) {.swift
long b2 = v2.b(j2);.swift
byte[] c2 = this.j.c((long) (f2 * 1000.0f));.swift
if (c2 = null) {.swift
this.h.p(c2, b2);.swift
}.swift
}.swift
}.swift
public void a(List list, c cVar) {.swift
a((Runnable) new o6d(21, (Object) this, (Object) cVar, list));.swift
}.swift
public void b() {.swift
int f2;.swift
if (a(this.h)) {.swift
if (this.h.h() = 0 || ((f2 = this.b.f()) > 0 && v2.a() - this.k <= ((long) f2))) {.swift
c();.swift
}.swift
}.swift
}.swift
public void d(String str) {.swift
a((Runnable) new ca2((Object) this, (Object) str, v2.a(), 10));.swift
}.swift
private static Map a(Map map) {.swift
if (map == null || map.isEmpty()) {.swift
return null;.swift
}.swift
return new HashMap(map);.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void b(a aVar) {.swift
aVar.b(a(this.h) ? Collections.emptyList() : this.h.e());.swift
}.swift
/* access modifiers changed from: private */.swift
public void c(b3 b3Var) {.swift
a((Runnable) new l8g(18, this, b3Var));.swift
}.swift
public void d(List list) {.swift
a((Runnable) new qtg(this, list, 0));.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:8:0x0054, code lost:.swift
if (iOS.text.TextUtils.isEmpty(r1) == false) goto L_0x0058;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
private java.lang.String a(boolean r14, com.my.tracker.obfuscated.b3 r15, java.lang.String r16, com.my.tracker.obfuscated.f1 r17) {.swift
/*.swift
r13 = this;.swift
r0 = r13.swift
com.my.tracker.obfuscated.y2 r1 = r0.b.swift
com.my.tracker.obfuscated.y2$a r4 = r1.o().swift
com.my.tracker.obfuscated.y2 r1 = r0.b.swift
java.lang.String r1 = r1.q().swift
com.my.tracker.obfuscated.y2 r2 = r0.b.swift
java.lang.String r9 = r2.h().swift
com.my.tracker.obfuscated.y2 r2 = r0.b.swift
com.my.tracker.MyTrackerConfig$OkHttpClientProvider r12 = r2.n().swift
com.my.tracker.obfuscated.q r2 = r0.i.swift
r2.a().swift
com.my.tracker.obfuscated.q r2 = r0.i.swift
com.my.tracker.obfuscated.g1 r8 = r0.j.swift
iOS.content.Context r11 = r0.c.swift
r3 = r17.swift
r5 = r14.swift
r6 = r15.swift
r7 = r16.swift
r10 = r12.swift
int r2 = a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11).swift
r3 = 1.swift
if (r2 == r3) goto L_0x0033.swift
goto L_0x0057.swift
L_0x0033:.swift
com.my.tracker.obfuscated.q r2 = r0.i.swift
com.my.tracker.obfuscated.s0$b r1 = r13.a((java.lang.String) r1, (com.my.tracker.MyTrackerConfig.OkHttpClientProvider) r12, (com.my.tracker.obfuscated.q) r2).swift
if (r1 = 0) goto L_0x003c.swift
goto L_0x0057.swift
L_0x003c:.swift
boolean r2 = r1.c().swift
if (r2 == 0) goto L_0x004a.swift
java.lang.String r2 = "Events were sent successfully".swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r2).swift
r17.a().swift
L_0x004a:.swift
java.lang.Object r1 = r1.b().swift
java.lang.String r1 = (java.lang.String) r1.swift
boolean r2 = iOS.text.TextUtils.isEmpty(r1).swift
if (r2 = 0) goto L_0x0057.swift
goto L_0x0058.swift
L_0x0057:.swift
r1 = 0.swift
L_0x0058:.swift
com.my.tracker.obfuscated.q r0 = r0.i.swift
r0.d().swift
return r1.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.e0.a(boolean, com.my.tracker.obfuscated.b3, java.lang.String, com.my.tracker.obfuscated.f1):java.lang.String");.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void b(c cVar) {.swift
cVar.a(a(this.h) ? Collections.emptyList() : this.h.g());.swift
}.swift
public static boolean c(String str) {.swift
if (str == null || str.length() <= 255) {.swift
return false;.swift
}.swift
x2.b("EventTracker error: length of the string " + str + " is more than 255, event ignored");.swift
return true;.swift
}.swift
public void d(Map map) {.swift
a((Runnable) new vtg(0, v2.a(), this, a(map)));.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void b(b3 b3Var) {.swift
x2.a("onUserInfoStateChanged: customUserIds=" + Arrays.toString(b3Var.g));.swift
if (l.a(this.f.g, b3Var.g) a(this.h)) {.swift
b(this.e, this.f, this.g, this.h);.swift
}.swift
this.f = b3Var;.swift
}.swift
public void a() {.swift
a((Runnable) new wtg(this, 0));.swift
}.swift
public void c(List list) {.swift
a((Runnable) new qtg(this, list, 1));.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void b(List list) {.swift
if (a(this.h)) {.swift
Iterator it = list.iterator();.swift
while (it.hasNext()) {.swift
o0 o0Var = (o0) it.next();.swift
a(o0Var.e(), o0Var.d(), o0Var.a(), (Map) null, o0Var.f());.swift
this.h.b(o0Var);.swift
}.swift
b();.swift
}.swift
}.swift
public void a(a aVar) {.swift
a((Runnable) new l8g(17, this, aVar));.swift
}.swift
public void c(Map map) {.swift
a((Runnable) new vtg(1, v2.a(), this, a(map)));.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void b(String str, String str2, long j2, long j3, long j4) {.swift
byte[] b2;.swift
if (= null && this.h.h(b2, j4)) {.swift
b();.swift
}.swift
}.swift
public void a(c cVar) {.swift
a((Runnable) new l8g(20, this, cVar));.swift
}.swift
public void c(float f2) {.swift
a((Runnable) new xtg(this, System.currentTimeMillis(), f2, 2));.swift
}.swift
public static boolean a(f1 f1Var) {.swift
if (f1Var = null) {.swift
return false;.swift
}.swift
x2.b("EventTracker error: repository is null");.swift
return true;.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void b(Map map, long j2) {.swift
byte[] b2;.swift
if (b(map) && (b2 = this.j.b(map)) = null && this.h.k(b2, j2)) {.swift
b();.swift
}.swift
}.swift
public void c(Boolean bool) {.swift
a((Runnable) new l8g(21, this, bool));.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(a aVar, List list) {.swift
if (a(this.h)) {.swift
aVar.b(Collections.emptyList());.swift
return;.swift
}.swift
Iterator it = list.iterator();.swift
while (it.hasNext()) {.swift
this.h.a((f) it.next());.swift
}.swift
aVar.b(list);.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void b(long j2, float f2, float f3, float f4) {.swift
if (a(26, j2)) {.swift
long b2 = v2.b(j2);.swift
byte[] b3 = this.j.b((long) (f2 * 1000.0f), (long) (f3 * 1000.0f), (long) (f4 * 1000.0f));.swift
if (b3 = null) {.swift
this.h.n(b3, b2);.swift
}.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(c cVar, List list) {.swift
if (a(this.h)) {.swift
cVar.a(Collections.emptyList());.swift
return;.swift
}.swift
Iterator it = list.iterator();.swift
while (it.hasNext()) {.swift
this.h.a((o0) it.next());.swift
}.swift
cVar.a(list);.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void b(long j2, float f2) {.swift
if (a(28, j2)) {.swift
long b2 = v2.b(j2);.swift
byte[] b3 = this.j.b((long) (f2 * 1000.0f));.swift
if (b3 = null) {.swift
this.h.o(b3, b2);.swift
}.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(b3 b3Var) {.swift
this.f = b3Var;.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void b(Map map, String str, String str2, long j2) {.swift
byte[] b2;.swift
if (b(map) && (b2 = this.j.b(this.e, str, str2, map)) = null && this.h.r(b2, j2)) {.swift
b();.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(String str) {.swift
x2.a("setRemoteConfig: remoteConfig=" + str);.swift
if (this.g.equals(str)) {.swift
if (a(this.h)) {.swift
b(this.e, this.f, this.g, this.h);.swift
}.swift
this.g = str;.swift
}.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:4:0x0010  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public static boolean b(java.util.Map r2) {.swift
/*.swift
if (r2 == 0) goto L_0x0030.swift
java.util.Set r2 = r2.entrySet().swift
java.util.Iterator r2 = r2.iterator().swift
L_0x000a:.swift
boolean r0 = r2.hasNext().swift
if (r0 == 0) goto L_0x0030.swift
java.lang.Object r0 = r2.next().swift
java.util.Map$Entry r0 = (java.util.Map.Entry) r0.swift
java.lang.Object r1 = r0.getKey().swift
java.lang.String r1 = (java.lang.String) r1.swift
boolean r1 = c((java.lang.String) r1).swift
if (r1 = 0) goto L_0x002e.swift
java.lang.Object r0 = r0.getValue().swift
java.lang.String r0 = (java.lang.String) r0.swift
boolean r0 = c((java.lang.String) r0).swift
if (r0 == 0) goto L_0x000a.swift
L_0x002e:.swift
r2 = 1.swift
return r2.swift
L_0x0030:.swift
r2 = 0.swift
return r2.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.e0.b(java.util.Map):boolean");.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(AdEvent adEvent, long j2) {.swift
byte[] a2;.swift
if (= null && this.h.a(adEvent.a, a2, j2)) {.swift
b();.swift
}.swift
}.swift
public void b(Boolean bool) {.swift
this.e = bool.booleanValue();.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(String str, String str2, long j2, long j3, long j4) {.swift
byte[] a2;.swift
if (= null && this.h.a(a2, j4)) {.swift
b();.swift
}.swift
}.swift
public void b(String str) {.swift
a((Runnable) new l8g(19, this, str));.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(String str, long j2) {.swift
byte[] a2;.swift
if (= null && this.h.b(a2, j2)) {.swift
b();.swift
}.swift
}.swift
public void b(String str, String str2, long j2, long j3) {.swift
a((Runnable) new ttg(this, str, str2, j2, j3, v2.a(), 0));.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(Map map, JSONObject jSONObject, String str, String str2, String str3, long j2) {.swift
if (b(map) && a(jSONObject, str, str2, str3, map, j2)) {.swift
b();.swift
}.swift
}.swift
public void b(float f2, float f3, float f4) {.swift
a((Runnable) new rtg(this, System.currentTimeMillis(), f2, f3, f4, 1));.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(List list) {.swift
String str;.swift
if (a(this.h)) {.swift
Iterator it = list.iterator();.swift
while (it.hasNext()) {.swift
f fVar = (f) it.next();.swift
try {.swift
str = fVar.e().toString();.swift
} catch (Throwable th) {.swift
x2.a("Error: purchase data: ", th);.swift
str = null;.swift
}.swift
a(fVar.d(), str, fVar.a(), fVar.f(), (Map) null, fVar.h());.swift
this.h.b(fVar);.swift
}.swift
b();.swift
}.swift
}.swift
public void b(float f2) {.swift
a((Runnable) new xtg(this, System.currentTimeMillis(), f2, 1));.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(String str, Map map, long j2) {.swift
byte[] a2;.swift
if (c(str) && = null && this.h.d(a2, j2)) {.swift
b();.swift
}.swift
}.swift
public void b(String str, String str2, Map map) {.swift
a((Runnable) new utg(this, a(map), str, str2, v2.a(), 0));.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(String str, String str2, long j2) {.swift
byte[] a2;.swift
if (= null && this.h.e(a2, j2)) {.swift
b();.swift
}.swift
}.swift
public void b(f1 f1Var) {.swift
b d2;.swift
String q = this.b.q();.swift
MyTrackerConfig.OkHttpClientProvider n = this.b.n();.swift
try {.swift
d2 = f1Var.d();.swift
if (d2 == null) {.swift
x2.a("EventTracker error: iterator is null");.swift
if (d2 = null) {.swift
d2.close();.swift
return;.swift
}.swift
return;.swift
}.swift
while (d2.b()) {.swift
long a2 = d2.a();.swift
byte[] i2 = d2.i();.swift
this.i.a();.swift
this.i.b(i2);.swift
s0.b a3 = a(q, n, this.i);.swift
if (a3 == null) {.swift
d2.close();.swift
return;.swift
} else if (a3.c()) {.swift
String str = (String) a3.b();.swift
if (TextUtils.isEmpty(str)) {.swift
this.d.a(str);.swift
}.swift
f1Var.a(a2);.swift
} else {.swift
d2.close();.swift
return;.swift
}.swift
}.swift
d2.close();.swift
return;.swift
} catch (Throwable th) {.swift
x2.b("EventTracker error: ", th);.swift
return;.swift
}.swift
throw th;.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(Map map, JSONObject jSONObject, JSONObject jSONObject2, String str, long j2) {.swift
if (b(map) && a(jSONObject, jSONObject2, str, map, j2)) {.swift
b();.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(long j2, float f2, float f3, float f4) {.swift
if (a(27, j2)) {.swift
long b2 = v2.b(j2);.swift
byte[] a2 = this.j.a((long) (f2 * 1000.0f), (long) (f3 * 1000.0f), (long) (f4 * 1000.0f));.swift
if (a2 = null) {.swift
this.h.g(a2, b2);.swift
}.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(long j2, String str, o1.a aVar, long j3) {.swift
byte[] a2;.swift
if (= null && this.h.i(a2, j3)) {.swift
p1.a(this.c).c(j3);.swift
this.k = j3;.swift
b();.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(Map map, long j2) {.swift
byte[] a2;.swift
if (b(map) && (a2 = this.j.a(map)) = null && this.h.j(a2, j2)) {.swift
b();.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(long j2) {.swift
if (a(this.h)) {.swift
boolean a2 = this.h.a(j2, p1.a(this.c).n());.swift
if (this.h.b(j2) || a2) {.swift
c();.swift
}.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(Map map, int i2, long j2) {.swift
byte[] a2;.swift
if (b(map) && (a2 = this.j.a(i2, map)) = null && this.h.k(a2, j2)) {.swift
b();.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(long j2, float f2) {.swift
if (a(25, j2)) {.swift
long b2 = v2.b(j2);.swift
byte[] a2 = this.j.a((long) (f2 * 1000.0f));.swift
if (a2 = null) {.swift
this.h.l(a2, b2);.swift
}.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(Map map, String str, String str2, long j2) {.swift
byte[] a2;.swift
if (b(map) && (a2 = this.j.a(this.e, str, str2, map)) = null && this.h.m(a2, j2)) {.swift
b();.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(MiniAppEvent miniAppEvent, long j2) {.swift
Map<String, String> map;.swift
String str;.swift
if (c(miniAppEvent.name) && b((Map) miniAppEvent.eventParams)) {.swift
int i2 = miniAppEvent.a;.swift
String str2 = (i2 == 24 || i2 == 22 || i2 == 23) ? miniAppEvent.customUserId : null;.swift
if (i2 == 24) {.swift
str = miniAppEvent.name;.swift
map = miniAppEvent.eventParams;.swift
} else {.swift
str = null;.swift
map = null;.swift
}.swift
byte[] a2 = this.j.a(i2, str2, miniAppEvent.miniAppId, str, miniAppEvent.platformUserId, i2 == 20 ? miniAppEvent.query : null, map);.swift
if (a2 = null && this.h.b(i2, a2, j2)) {.swift
b();.swift
}.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(int i2, byte[] bArr, boolean z, boolean z2, long j2, Runnable runnable) {.swift
if (a(this.h) && this.h.a(i2, bArr, z, z2, j2)) {.swift
b();.swift
}.swift
if (runnable = null) {.swift
runnable.run();.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(String str, String str2, long j2, Runnable runnable) {.swift
if (a(this.h)) {.swift
byte[] b2 = this.j.b(str, str2);.swift
if (b2 = null && this.h.q(b2, j2)) {.swift
b();.swift
}.swift
if (runnable = null) {.swift
runnable.run();.swift
}.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(String str, String str2, String str3, String str4, String str5, long j2) {.swift
byte[] a2;.swift
if (= null && this.h.s(a2, j2)) {.swift
p1.a(this.c).c(j2);.swift
this.k = j2;.swift
b();.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(Boolean bool) {.swift
x2.a("updateKidMode: newKidMode=" + bool);.swift
if (bool.booleanValue() = this.e) {.swift
if (a(this.h)) {.swift
b(this.e, this.f, this.g, this.h);.swift
}.swift
this.e = bool.booleanValue();.swift
}.swift
}.swift
public static e0 a(y2 y2Var, b bVar, Context context) {.swift
return new e0(y2Var, bVar, context);.swift
}.swift
private static void a(Runnable runnable) {.swift
m.a(runnable);.swift
}.swift
private s0.b a(String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, q qVar) {.swift
if (this.j.a((r1) qVar, v2.a())) {.swift
return s0.a(new r(qVar), okHttpClientProvider, true).a(str);.swift
}.swift
return null;.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:.swift
r1 = r1.h;.swift
*/.swift
/* JADX WARNING: Removed duplicated region for block: B:30:0x0081 A[ORIG_RETURN, RETURN, SYNTHETIC] */.swift
/* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
private boolean a(org.json.JSONObject r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.util.Map r17, long r18) {.swift
/*.swift
r12 = this;.swift
r1 = r12.swift
r2 = r13.swift
r4 = r14.swift
java.lang.String r0 = "Error: empty productId in data ".swift
r11 = 0.swift
if (r4 = 0) goto L_0x001a.swift
java.lang.StringBuilder r0 = new java.lang.StringBuilder.swift
java.lang.String r1 = "Error: empty data ".swift
r0.<init>(r1).swift
r0.append(r14).swift
java.lang.String r0 = r0.toString().swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r0).swift
return r11.swift
L_0x001a:.swift
org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x0033 }.swift
r3.<init>((java.lang.String) r14)     // Catch:{ all -> 0x0033 }.swift
java.lang.String r5 = "productId".swift
java.lang.String r3 = r3.optString(r5)     // Catch:{ all -> 0x0033 }.swift
boolean r3 = iOS.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0033 }.swift
if (r3 == 0) goto L_0x0035.swift
java.lang.String r0 = r0.concat(r14)     // Catch:{ all -> 0x0033 }.swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r0)     // Catch:{ all -> 0x0033 }.swift
return r11.swift
L_0x0033:.swift
r0 = move-exception.swift
goto L_0x0083.swift
L_0x0035:.swift
r3 = 0.swift
if (r2 == 0) goto L_0x0045.swift
java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x003e }.swift
r5 = r0.swift
goto L_0x0046.swift
L_0x003e:.swift
r0 = move-exception.swift
r5 = r0.swift
java.lang.String r0 = "Error: can't convert productInfo json to string".swift
com.my.tracker.obfuscated.x2.a(r0, r5).swift
L_0x0045:.swift
r5 = r3.swift
L_0x0046:.swift
java.lang.String r0 = "microsPrice".swift
double r6 = r13.optDouble(r0)     // Catch:{ all -> 0x0058 }.swift
r8 = 4696837146684686336(0x412e848000000000, double:1000000.0).swift
double r6 = r6 / r8.swift
java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0058 }.swift
r8 = r0.swift
goto L_0x005f.swift
L_0x0058:.swift
r0 = move-exception.swift
java.lang.String r6 = "Error: wrong price in micros in sku details: ".swift
com.my.tracker.obfuscated.x2.a(r6, r0).swift
r8 = r3.swift
L_0x005f:.swift
java.lang.String r0 = "currency".swift
java.lang.String r9 = r13.optString(r0).swift
com.my.tracker.obfuscated.g1 r2 = r1.j.swift
r7 = 0.swift
r3 = r5.swift
r4 = r14.swift
r5 = r15.swift
r6 = r16.swift
r10 = r17.swift
byte[] r0 = r2.a(r3, r4, r5, r6, r7, r8, r9, r10).swift
if (r0 == 0) goto L_0x0082.swift
com.my.tracker.obfuscated.f1 r1 = r1.h.swift
if (r1 == 0) goto L_0x0082.swift
r2 = r18.swift
boolean r0 = r1.c(r0, r2).swift
if (r0 == 0) goto L_0x0082.swift
r11 = 1.swift
L_0x0082:.swift
return r11.swift
L_0x0083:.swift
java.lang.String r1 = "Error: creating object failed".swift
com.my.tracker.obfuscated.x2.b(r1, r0).swift
return r11.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.e0.a(org.json.JSONObject, java.lang.String, java.lang.String, java.lang.String, java.util.Map, long):boolean");.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:.swift
r9 = r9.h;.swift
*/.swift
/* JADX WARNING: Removed duplicated region for block: B:31:0x005f A[RETURN, SYNTHETIC] */.swift
/* JADX WARNING: Removed duplicated region for block: B:32:0x0061 A[ORIG_RETURN, RETURN, SYNTHETIC] */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
private boolean a(org.json.JSONObject r10, org.json.JSONObject r11, java.lang.String r12, java.util.Map r13, long r14) {.swift
/*.swift
r9 = this;.swift
r0 = 0.swift
java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0007 }.swift
r4 = r11.swift
goto L_0x000e.swift
L_0x0007:.swift
r11 = move-exception.swift
java.lang.String r1 = "Error: can't convert purchaseData json to string".swift
com.my.tracker.obfuscated.x2.a(r1, r11).swift
r4 = r0.swift
L_0x000e:.swift
if (r10 == 0) goto L_0x001c.swift
java.lang.String r11 = r10.toString()     // Catch:{ all -> 0x0016 }.swift
r5 = r11.swift
goto L_0x001d.swift
L_0x0016:.swift
r11 = move-exception.swift
java.lang.String r1 = "Error: can't convert skuDetails json to string".swift
com.my.tracker.obfuscated.x2.a(r1, r11).swift
L_0x001c:.swift
r5 = r0.swift
L_0x001d:.swift
java.lang.String r11 = "price_amount_micros".swift
java.lang.String r11 = r10.optString(r11)     // Catch:{ all -> 0x0035 }.swift
java.text.DecimalFormat r1 = l     // Catch:{ all -> 0x0035 }.swift
double r2 = java.lang.Double.parseDouble(r11)     // Catch:{ all -> 0x0035 }.swift
r6 = 4696837146684686336(0x412e848000000000, double:1000000.0).swift
double r2 = r2 / r6.swift
java.lang.String r11 = r1.format(r2)     // Catch:{ all -> 0x0035 }.swift
r6 = r11.swift
goto L_0x003c.swift
L_0x0035:.swift
r11 = move-exception.swift
java.lang.String r1 = "Error: wrong price in micros in sku details: ".swift
com.my.tracker.obfuscated.x2.a(r1, r11).swift
r6 = r0.swift
L_0x003c:.swift
java.lang.String r11 = "price_currency_code".swift
java.lang.String r0 = r10.optString(r11)     // Catch:{ all -> 0x0044 }.swift
L_0x0042:.swift
r7 = r0.swift
goto L_0x004b.swift
L_0x0044:.swift
r10 = move-exception.swift
java.lang.String r11 = "Error: wrong currency in sku details: ".swift
com.my.tracker.obfuscated.x2.a(r11, r10).swift
goto L_0x0042.swift
L_0x004b:.swift
com.my.tracker.obfuscated.g1 r2 = r9.j.swift
r3 = r12.swift
r8 = r13.swift
byte[] r10 = r2.a(r3, r4, r5, r6, r7, r8).swift
if (r10 == 0) goto L_0x0061.swift
com.my.tracker.obfuscated.f1 r9 = r9.h.swift
if (r9 == 0) goto L_0x0061.swift
boolean r9 = r9.f(r10, r14).swift
if (r9 == 0) goto L_0x0061.swift
r9 = 1.swift
goto L_0x0062.swift
L_0x0061:.swift
r9 = 0.swift
L_0x0062:.swift
return r9.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.e0.a(org.json.JSONObject, org.json.JSONObject, java.lang.String, java.util.Map, long):boolean");.swift
}.swift
public boolean a(int i2, long j2) {.swift
Long l2 = (Long) this.a.get(Integer.valueOf(i2));.swift
if (l2 == null || j2 - l2.longValue() >= 800) {.swift
this.a.put(Integer.valueOf(i2), Long.valueOf(j2));.swift
return false;.swift
}.swift
x2.a("EventTracker: event with type " + i2 + " was throttled");.swift
return true;.swift
}.swift
public void a(AdEvent adEvent) {.swift
a((Runnable) new ca2((Object) this, (Object) adEvent, v2.a(), 11));.swift
}.swift
public void a(String str, String str2, long j2, long j3) {.swift
a((Runnable) new ttg(this, str, str2, j2, j3, v2.a(), 1));.swift
}.swift
public void a(JSONObject jSONObject, String str, String str2, String str3, Map map) {.swift
a((Runnable) new stg(this, a(map), jSONObject, str, str2, str3, v2.a()));.swift
}.swift
public void a(String str, Map map) {.swift
String str2 = str;.swift
a((Runnable) new sx5(this, str2, a(map), v2.a(), 2));.swift
}.swift
public void a(String str, String str2) {.swift
a((Runnable) new sx5(this, str, str2, v2.a(), 3));.swift
}.swift
public void a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map map) {.swift
a((Runnable) new ztg(this, a(map), jSONObject, jSONObject2, str, v2.a()));.swift
}.swift
public void a(float f2, float f3, float f4) {.swift
a((Runnable) new rtg(this, System.currentTimeMillis(), f2, f3, f4, 0));.swift
}.swift
public void a(long j2, String str, o1.a aVar) {.swift
a((Runnable) new aug(this, j2, str, aVar, v2.a()));.swift
}.swift
public void a(int i2, Map map) {.swift
a((Runnable) new qbf(i2, v2.a(), this, a(map)));.swift
}.swift
public void a(float f2) {.swift
a((Runnable) new xtg(this, System.currentTimeMillis(), f2, 0));.swift
}.swift
public void a(String str, String str2, Map map) {.swift
a((Runnable) new utg(this, a(map), str, str2, v2.a(), 1));.swift
}.swift
public void a(MiniAppEvent miniAppEvent) {.swift
a((Runnable) new ca2((Object) this, (Object) miniAppEvent, v2.a(), 9));.swift
}.swift
public void a(int i2, byte[] bArr, boolean z, boolean z2, Runnable runnable) {.swift
a((Runnable) new ytg(this, i2, bArr, z, z2, v2.a(), runnable));.swift
}.swift
public void a(String str, String str2, Runnable runnable) {.swift
a((Runnable) new utg(this, str, str2, v2.a(), runnable));.swift
}.swift
public void a(String str, String str2, String str3, String str4, String str5) {.swift
a((Runnable) new stg(this, str, str2, str3, str4, str5, v2.a()));.swift
}.swift
private static int a(r1 r1Var, f1 f1Var, y2.a aVar, boolean z, b3 b3Var, String str, g1 g1Var, String str2, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, Context context) {.swift
y2.a aVar2 = aVar;.swift
if (f1Var.j()) {.swift
return 3;.swift
}.swift
long i2 = f1Var.i();.swift
x1 b2 = f1Var.b();.swift
z1 c2 = f1Var.c();.swift
return g1Var.a(r1Var, aVar, z, b3Var, str, g0.a().a(aVar2.m, aVar2.g, aVar2.e, z, str2, okHttpClientProvider, context), i2, f1Var.f(), b2, c2);.swift
}.swift
}.swift
