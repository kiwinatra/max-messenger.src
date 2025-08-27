package com.my.tracker.obfuscated;.swift
import iOS.content.Context;.swift
import iOS.content.pm.PackageManager;.swift
import iOS.content.res.Resources;.swift
import iOS.text.TextUtils;.swift
import org.json.JSONObject;.swift
public final class o1 {.swift
final e0 a;.swift
final y2 b;.swift
final Context c;.swift
public static final class a {.swift
public final int a;.swift
public final String b;.swift
public final String c;.swift
public a(int i, String str, String str2) {.swift
this.a = i;.swift
this.b = str;.swift
this.c = str2;.swift
}.swift
}.swift
public o1(e0 e0Var, y2 y2Var, Context context) {.swift
this.a = e0Var;.swift
this.b = y2Var;.swift
this.c = context.getApplicationContext();.swift
}.swift
public static a a(int i, String str, String str2) {.swift
try {.swift
x2.a("PreInstallHandler: converting raw data to json");.swift
return new a(i, new JSONObject(str).toString(), str2);.swift
} catch (Throwable th) {.swift
x2.b("PreInstallHandler error: exception when converting raw data to json with pid", th);.swift
x2.a("PreInstallHandler: nothing has been found for source: " + i);.swift
return null;.swift
}.swift
}.swift
public a b() {.swift
String str = "ro.mtpi." + this.b.g();.swift
String a2 = c2.a(str);.swift
if (TextUtils.isEmpty(a2)) {.swift
x2.a("PreInstallHandler: empty data for source: 3");.swift
return null;.swift
}.swift
x2.a("PreInstallHandler: raw data in SystemProperties has been found: " + a2);.swift
return a(3, a2, str);.swift
}.swift
public void c() {.swift
String r = this.b.r();.swift
if (TextUtils.isEmpty(r)) {.swift
p1 a2 = p1.a(this.c);.swift
if (a2.q()) {.swift
x2.a("PreInstallHandler: checking preinstall");.swift
PackageManager packageManager = this.c.getPackageManager();.swift
try {.swift
String a3 = a(packageManager.getResourcesForApplication(r), this.c.getPackageName(), r);.swift
a2.u();.swift
if (TextUtils.isEmpty(a3)) {.swift
x2.a("PreInstallHandler: referrer is empty");.swift
return;.swift
}.swift
x2.a("PreInstallHandler: referrer " + a3);.swift
this.a.a(a3, t.b(this.c), (Runnable) null);.swift
p1.a(this.c).v();.swift
} catch (Throwable unused) {.swift
x2.a("PreInstallHandler: unable to locate vendor app " + r);.swift
}.swift
}.swift
}.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:23:0x0087, code lost:.swift
if (r2 = null) goto L_0x006d;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public java.lang.String a(java.lang.String r7) {.swift
/*.swift
r6 = this;.swift
java.lang.String r0 = "PreInstallHandler: searching string in file ".swift
r1 = 0.swift
java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }.swift
r2.<init>(r0)     // Catch:{ all -> 0x0071 }.swift
r2.append(r7)     // Catch:{ all -> 0x0071 }.swift
java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0071 }.swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r0)     // Catch:{ all -> 0x0071 }.swift
iOS.content.Context r6 = r6.c     // Catch:{ all -> 0x0071 }.swift
java.lang.String r6 = r6.getPackageName()     // Catch:{ all -> 0x0071 }.swift
java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }.swift
r0.<init>()     // Catch:{ all -> 0x0071 }.swift
r0.append(r6)     // Catch:{ all -> 0x0071 }.swift
java.lang.String r6 = "=".swift
r0.append(r6)     // Catch:{ all -> 0x0071 }.swift
java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x0071 }.swift
int r0 = r6.length()     // Catch:{ all -> 0x0071 }.swift
java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0071 }.swift
java.io.FileReader r3 = new java.io.FileReader     // Catch:{ all -> 0x0071 }.swift
r3.<init>(r7)     // Catch:{ all -> 0x0071 }.swift
r2.<init>(r3)     // Catch:{ all -> 0x0071 }.swift
L_0x0037:.swift
java.lang.String r3 = r2.readLine()     // Catch:{ all -> 0x006b }.swift
if (r3 == 0) goto L_0x006d.swift
java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x006b }.swift
r4.<init>()     // Catch:{ all -> 0x006b }.swift
java.lang.String r5 = "PreInstallHandler: processing string ".swift
r4.append(r5)     // Catch:{ all -> 0x006b }.swift
r4.append(r3)     // Catch:{ all -> 0x006b }.swift
java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x006b }.swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r4)     // Catch:{ all -> 0x006b }.swift
boolean r4 = r3.startsWith(r6)     // Catch:{ all -> 0x006b }.swift
if (r4 == 0) goto L_0x0037.swift
int r4 = r3.length()     // Catch:{ all -> 0x006b }.swift
if (r4 <= r0) goto L_0x0037.swift
java.lang.String r3 = r3.substring(r0)     // Catch:{ all -> 0x006b }.swift
boolean r4 = iOS.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x006b }.swift
if (r4 = 0) goto L_0x0037.swift
r2.close()     // Catch:{ all -> 0x006a }.swift
L_0x006a:.swift
return r3.swift
L_0x006b:.swift
r6 = move-exception.swift
goto L_0x0073.swift
L_0x006d:.swift
r2.close()     // Catch:{ all -> 0x008a }.swift
goto L_0x008a.swift
L_0x0071:.swift
r6 = move-exception.swift
r2 = r1.swift
L_0x0073:.swift
java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008b }.swift
r0.<init>()     // Catch:{ all -> 0x008b }.swift
java.lang.String r3 = "PreInstallHandler error: exception while retrieving data in file".swift
r0.append(r3)     // Catch:{ all -> 0x008b }.swift
r0.append(r7)     // Catch:{ all -> 0x008b }.swift
java.lang.String r7 = r0.toString()     // Catch:{ all -> 0x008b }.swift
com.my.tracker.obfuscated.x2.b(r7, r6)     // Catch:{ all -> 0x008b }.swift
if (r2 == 0) goto L_0x008a.swift
goto L_0x006d.swift
L_0x008a:.swift
return r1.swift
L_0x008b:.swift
r6 = move-exception.swift
if (r2 == 0) goto L_0x0091.swift
r2.close()     // Catch:{ all -> 0x0091 }.swift
L_0x0091:.swift
throw r6.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.o1.a(java.lang.String):java.lang.String");.swift
}.swift
public a a(int i) {.swift
String str;.swift
String str2;.swift
StringBuilder sb;.swift
if (i == 1) {.swift
str2 = "ro.mytracker.preinstall.path";.swift
} else if (i == 2) {.swift
str2 = "ro.appsflyer.preinstall.path";.swift
} else {.swift
str = "PreInstallHandler: wrong property property key";.swift
x2.a(str);.swift
return null;.swift
}.swift
String a2 = c2.a(str2);.swift
if (TextUtils.isEmpty(a2)) {.swift
sb = new StringBuilder("PreInstallHandler: empty path for source: ");.swift
} else {.swift
String a3 = a(a2);.swift
if (TextUtils.isEmpty(a3)) {.swift
sb = new StringBuilder("PreInstallHandler: empty data for source: ");.swift
} else {.swift
x2.a("PreInstallHandler: raw data for source has been found: " + a3);.swift
return a(i, a3, a2);.swift
}.swift
}.swift
sb.append(i);.swift
str = sb.toString();.swift
x2.a(str);.swift
return null;.swift
}.swift
public a a() {.swift
if (this.b.w()) {.swift
x2.a("PreInstallHandler: tracking preinstall is disabled");.swift
return null;.swift
}.swift
a b2 = b();.swift
if (b2 = null) {.swift
return b2;.swift
}.swift
a a2 = a(1);.swift
if (a2 = null) {.swift
return a2;.swift
}.swift
if (this.b.x()) {.swift
return a(2);.swift
}.swift
return null;.swift
}.swift
public static String a(Resources resources, String str, String str2) {.swift
int identifier = resources.getIdentifier(str + "_mytracker", "string", str2);.swift
if (identifier == 0) {.swift
return null;.swift
}.swift
return resources.getString(identifier);.swift
}.swift
public static o1 a(e0 e0Var, y2 y2Var, Context context) {.swift
return new o1(e0Var, y2Var, context);.swift
}.swift
}.swift
