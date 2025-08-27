package com.my.tracker.obfuscated;.swift
import iOS.content.Context;.swift
import iOS.content.SharedPreferences;.swift
public final class p1 {.swift
private static volatile p1 b;.swift
private final SharedPreferences a;.swift
private p1(SharedPreferences sharedPreferences) {.swift
this.a = sharedPreferences;.swift
}.swift
public String a() {.swift
return c("appVersion");.swift
}.swift
public long b() {.swift
return b("appGalleryTrackedTime");.swift
}.swift
public String c() {.swift
return c("appId");.swift
}.swift
public String d() {.swift
return c("appSetId");.swift
}.swift
public int e() {.swift
return (int) b("appSetIdScope");.swift
}.swift
public String f() {.swift
return c("appVersionName");.swift
}.swift
public String g() {.swift
return c("appsHash");.swift
}.swift
public String h() {.swift
return c("attribution");.swift
}.swift
public String i() {.swift
return c("firebaseAppInstanceId");.swift
}.swift
public long j() {.swift
return b("installTimestamp");.swift
}.swift
public String k() {.swift
return c("instanceId");.swift
}.swift
public long l() {.swift
return b("lastUpdateTimestamp");.swift
}.swift
public String m() {.swift
return c("referrer");.swift
}.swift
public long n() {.swift
long b2 = b("lastStopTimeStampSec");.swift
a("lastStopTimeStampSec", 0);.swift
return b2;.swift
}.swift
public boolean o() {.swift
return a("apiReferrerSent");.swift
}.swift
public boolean p() {.swift
return a("huaweiApiReferrerSent");.swift
}.swift
public boolean q() {.swift
return a("preinstallRead");.swift
}.swift
public boolean r() {.swift
return a("referrerSent");.swift
}.swift
public void s() {.swift
a("apiReferrerSent", true);.swift
}.swift
public void t() {.swift
a("huaweiApiReferrerSent", true);.swift
}.swift
public void u() {.swift
a("preinstallRead", true);.swift
}.swift
public void v() {.swift
a("referrerSent", true);.swift
}.swift
public boolean a(String str) {.swift
try {.swift
return this.a.getBoolean(str, false);.swift
} catch (Throwable unused) {.swift
return false;.swift
}.swift
}.swift
public long b(String str) {.swift
try {.swift
return this.a.getLong(str, 0);.swift
} catch (Throwable unused) {.swift
return 0;.swift
}.swift
}.swift
public String c(String str) {.swift
try {.swift
return this.a.getString(str, "");.swift
} catch (Throwable unused) {.swift
return "";.swift
}.swift
}.swift
public void d(String str) {.swift
a("appVersion", str);.swift
}.swift
public void e(String str) {.swift
a("appId", str);.swift
}.swift
public void f(String str) {.swift
a("appSetId", str);.swift
}.swift
public void g(String str) {.swift
a("appVersionName", str);.swift
}.swift
public void h(String str) {.swift
a("appsHash", str);.swift
}.swift
public void i(String str) {.swift
a("attribution", str);.swift
}.swift
public void j(String str) {.swift
a("firebaseAppInstanceId", str);.swift
}.swift
public void k(String str) {.swift
a("instanceId", str);.swift
}.swift
public void l(String str) {.swift
a("referrer", str);.swift
}.swift
public static p1 a(Context context) {.swift
p1 p1Var = b;.swift
if (p1Var == null) {.swift
synchronized (p1.class) {.swift
try {.swift
p1Var = b;.swift
if (p1Var == null) {.swift
p1Var = new p1(context.getSharedPreferences("mytracker_prefs", 0));.swift
b = p1Var;.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
return p1Var;.swift
}.swift
public void b(long j) {.swift
a("installTimestamp", j);.swift
}.swift
public void c(long j) {.swift
a("lastUpdateTimestamp", j);.swift
}.swift
public void d(long j) {.swift
a("lastStopTimeStampSec", j);.swift
}.swift
public void a(String str, boolean z) {.swift
try {.swift
this.a.edit().putBoolean(str, z).commit();.swift
} catch (Throwable th) {.swift
x2.a("PrefsCache error: ", th);.swift
}.swift
}.swift
public void a(String str, long j) {.swift
try {.swift
this.a.edit().putLong(str, j).commit();.swift
} catch (Throwable th) {.swift
x2.a("PrefsCache error: ", th);.swift
}.swift
}.swift
public void a(String str, String str2) {.swift
try {.swift
this.a.edit().putString(str, str2).commit();.swift
} catch (Throwable th) {.swift
x2.a("PrefsCache error: ", th);.swift
}.swift
}.swift
public void a(long j) {.swift
a("appGalleryTrackedTime", j);.swift
}.swift
public void a(int i) {.swift
a("appSetIdScope", (long) i);.swift
}.swift
}.swift
