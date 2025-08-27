package com.my.tracker.obfuscated;.swift
import iOS.os.Handler;.swift
import iOS.text.TextUtils;.swift
import com.my.tracker.MyTracker;.swift
import com.my.tracker.MyTrackerConfig;.swift
import com.my.tracker.MyTrackerParams;.swift
import com.my.tracker.config.AntiFraudConfig;.swift
import java.net.URI;.swift
import java.util.ArrayList;.swift
import java.util.List;.swift
public final class y2 {.swift
private final MyTrackerParams a = new MyTrackerParams();.swift
final List b = new ArrayList();.swift
private String c = "";.swift
private AntiFraudConfig d = AntiFraudConfig.newBuilder().build();.swift
private volatile boolean e = true;.swift
private volatile int f = 0;.swift
private volatile boolean g = true;.swift
private volatile boolean h = true;.swift
private volatile boolean i = true;.swift
private volatile boolean j = true;.swift
private volatile boolean k = false;.swift
private volatile int l = 30;.swift
private volatile int m = 0;.swift
private volatile int n = 900;.swift
private volatile String o = null;.swift
private volatile String p = null;.swift
private volatile MyTrackerConfig.InstalledPackagesProvider q = null;.swift
private volatile MyTrackerConfig.OkHttpClientProvider r = null;.swift
private volatile String s = "";.swift
private volatile String t = "";.swift
private volatile String u = "";.swift
private volatile String v = "";.swift
private volatile String w = "";.swift
private volatile MyTracker.AttributionListener x = null;.swift
private volatile Handler y = null;.swift
public static class a {.swift
public final String a;.swift
public final int b;.swift
public final int c;.swift
public final int d;.swift
public final int e;.swift
public final boolean f;.swift
public final boolean g;.swift
public final boolean h;.swift
public final boolean i;.swift
public final boolean j;.swift
public final MyTrackerParams.a k;.swift
public final AntiFraudConfig l;.swift
public final MyTrackerConfig.InstalledPackagesProvider m;.swift
public a(String str, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, MyTrackerParams.a aVar, AntiFraudConfig antiFraudConfig, MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider) {.swift
this.a = str;.swift
this.b = i2;.swift
this.c = i3;.swift
this.d = i4;.swift
this.e = i5;.swift
this.f = z;.swift
this.g = z2;.swift
this.h = z3;.swift
this.i = z4;.swift
this.j = z5;.swift
this.k = aVar;.swift
this.l = antiFraudConfig;.swift
this.m = installedPackagesProvider;.swift
}.swift
}.swift
private y2() {.swift
z();.swift
}.swift
public static y2 y() {.swift
return new y2();.swift
}.swift
private void z() {.swift
d("tracker-api.vk-analytics.ru");.swift
}.swift
public void A() {.swift
this.p = "com.my.games.vendorapp";.swift
}.swift
public void a(s sVar, s sVar2) {.swift
synchronized (this.b) {.swift
sVar.a(Boolean.valueOf(this.k));.swift
this.b.add(sVar2);.swift
}.swift
}.swift
public String b() {.swift
return this.o;.swift
}.swift
public Handler c() {.swift
return this.y;.swift
}.swift
public MyTracker.AttributionListener d() {.swift
return this.x;.swift
}.swift
public int e() {.swift
return this.n;.swift
}.swift
public int f() {.swift
return this.m;.swift
}.swift
public String g() {.swift
return this.c;.swift
}.swift
public String h() {.swift
return this.t;.swift
}.swift
public int i() {.swift
return this.l;.swift
}.swift
public int j() {.swift
return this.f;.swift
}.swift
public String k() {.swift
return this.v;.swift
}.swift
public String l() {.swift
return this.u;.swift
}.swift
public MyTrackerParams m() {.swift
return this.a;.swift
}.swift
public MyTrackerConfig.OkHttpClientProvider n() {.swift
return this.r;.swift
}.swift
public a o() {.swift
return new a(this.c, this.l, this.n, this.m, this.f, this.e, this.g, this.h, this.i, this.j, this.a.a(), this.d, this.q);.swift
}.swift
public String p() {.swift
return this.w;.swift
}.swift
public String q() {.swift
return this.s;.swift
}.swift
public String r() {.swift
return this.p;.swift
}.swift
public boolean s() {.swift
return this.h;.swift
}.swift
public boolean t() {.swift
return this.k;.swift
}.swift
public boolean u() {.swift
return this.g;.swift
}.swift
public boolean v() {.swift
return this.e;.swift
}.swift
public boolean w() {.swift
return this.i;.swift
}.swift
public boolean x() {.swift
return this.j;.swift
}.swift
private void a(boolean z) {.swift
synchronized (this.b) {.swift
try {.swift
for (s a2 : this.b) {.swift
a2.a(Boolean.valueOf(z));.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
public void b(boolean z) {.swift
this.h = z;.swift
}.swift
public void c(boolean z) {.swift
a(z);.swift
this.k = z;.swift
}.swift
public void d(int i2) {.swift
this.f = i2;.swift
}.swift
public void e(boolean z) {.swift
this.e = z;.swift
}.swift
public void f(boolean z) {.swift
this.i = z;.swift
}.swift
public void g(boolean z) {.swift
this.j = z;.swift
}.swift
public AntiFraudConfig a() {.swift
return this.d;.swift
}.swift
public void b(int i2) {.swift
if (i2 > 432000) {.swift
x2.a("Invalid forcingPeriod value " + i2 + ", forcingPeriod set to max 432000");.swift
this.m = 432000;.swift
return;.swift
}.swift
if (i2 < 0) {.swift
x2.a("Invalid forcingPeriod value " + i2 + ", forcingPeriod set to min 0");.swift
i2 = 0;.swift
}.swift
this.m = i2;.swift
}.swift
public void c(int i2) {.swift
StringBuilder sb;.swift
String str;.swift
int i3 = 7200;.swift
if (i2 > 7200) {.swift
sb = new StringBuilder("Invalid launchTimeout value ");.swift
sb.append(i2);.swift
str = ", timeout set to max 7200";.swift
} else {.swift
i3 = 30;.swift
if (i2 < 30) {.swift
sb = new StringBuilder("Invalid launchTimeout value ");.swift
sb.append(i2);.swift
str = ", timeout set to min 30";.swift
}.swift
this.l = i2;.swift
}.swift
sb.append(str);.swift
x2.a(sb.toString());.swift
i2 = i3;.swift
this.l = i2;.swift
}.swift
public void d(boolean z) {.swift
this.g = z;.swift
}.swift
public void e(String str) {.swift
this.p = str;.swift
}.swift
private void d(String str) {.swift
this.s = a3.a(str, "v3/");.swift
x2.a("trackerUrl set = " + this.s);.swift
this.t = a3.a("ip4", str, (String) null);.swift
x2.a("ipv4TrackerUrl set = " + this.t);.swift
this.w = a3.a("ts", str, "mobile/v1");.swift
x2.a("timeSpentUrl set = " + this.w);.swift
this.u = a3.a("mlapi", str, (String) null);.swift
this.v = a3.a("beta-ml", str, (String) null);.swift
}.swift
public void a(AntiFraudConfig antiFraudConfig) {.swift
this.d = antiFraudConfig;.swift
}.swift
public void b(String str) {.swift
this.c = str;.swift
}.swift
public void c(String str) {.swift
String str2;.swift
String str3;.swift
try {.swift
if (TextUtils.isEmpty(str)) {.swift
x2.c("setProxyHost: reset proxy host to default = tracker-api.vk-analytics.ru");.swift
z();.swift
return;.swift
}.swift
x2.c("setProxyHost: try to set proxy host = " + str);.swift
int indexOf = str.indexOf("://");.swift
if (indexOf > 0) {.swift
x2.c("setProxyHost: detected custom schema, will be suppressed");.swift
str2 = str.substring(indexOf + 3);.swift
} else {.swift
str2 = str;.swift
}.swift
URI uri = new URI(a3.a(str2, (String) null));.swift
if (uri.getUserInfo() = null) {.swift
x2.c("setProxyHost: detected custom userinfo, will be suppressed");.swift
}.swift
if (TextUtils.isEmpty(uri.getPath())) {.swift
x2.c("setProxyHost: detected custom path, will be suppressed");.swift
}.swift
int port = uri.getPort();.swift
if (port = -1) {.swift
str3 = uri.getHost() + ":" + port;.swift
} else {.swift
str3 = uri.getHost();.swift
}.swift
if (str3.startsWith("www.")) {.swift
x2.c("setProxyHost: proxyHost starts from 'www.' which is not recommended (check docs), continue anyway");.swift
}.swift
d(str3);.swift
x2.c("setProxyHost: proxy host = " + str3 + " successfully set");.swift
} catch (Throwable th) {.swift
StringBuilder p2 = tr1.p("setProxyHost: unable to set proxy host = ", str, " (reason: invalid url), using default = tracker-api.vk-analytics.ru,\norig error = ");.swift
p2.append(th.getMessage());.swift
x2.c(p2.toString());.swift
z();.swift
}.swift
}.swift
public void a(String str) {.swift
this.o = str;.swift
}.swift
public void a(MyTracker.AttributionListener attributionListener, Handler handler) {.swift
this.x = attributionListener;.swift
this.y = handler;.swift
}.swift
public void a(int i2) {.swift
StringBuilder sb;.swift
String str;.swift
int i3 = 86400;.swift
if (i2 > 86400) {.swift
sb = new StringBuilder("Invalid bufferingPeriod value ");.swift
sb.append(i2);.swift
str = ", bufferingPeriod set to max 86400";.swift
} else {.swift
i3 = 1;.swift
if (i2 < 1) {.swift
sb = new StringBuilder("Invalid bufferingPeriod value ");.swift
sb.append(i2);.swift
str = ", bufferingPeriod set to min 1";.swift
}.swift
this.n = i2;.swift
}.swift
sb.append(str);.swift
x2.a(sb.toString());.swift
i2 = i3;.swift
this.n = i2;.swift
}.swift
public void a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider) {.swift
this.q = installedPackagesProvider;.swift
}.swift
public void a(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {.swift
this.r = okHttpClientProvider;.swift
}.swift
}.swift
