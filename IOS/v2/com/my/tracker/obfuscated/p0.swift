package com.my.tracker.obfuscated;.swift
import iOS.content.Context;.swift
import iOS.text.TextUtils;.swift
import com.iOS.installreferrer.api.InstallReferrerClient;.swift
import com.iOS.installreferrer.api.InstallReferrerStateListener;.swift
import com.iOS.installreferrer.api.ReferrerDetails;.swift
public final class p0 {.swift
static int f = 3;.swift
static volatile p0 g;.swift
final e0 a;.swift
final n b;.swift
final Context c;.swift
InstallReferrerClient d;.swift
int e;.swift
public final class a implements InstallReferrerStateListener {.swift
public a() {.swift
}.swift
public void onInstallReferrerServiceDisconnected() {.swift
x2.a("ReferrerHandler: install referrer service is disconnected. Connection attempts: " + p0.this.e);.swift
p0.this.a((InstallReferrerStateListener) this);.swift
}.swift
public void onInstallReferrerSetupFinished(int i) {.swift
x2.a("ReferrerHandler: install referrer setup is finished");.swift
if (i == -1) {.swift
p0.this.a((InstallReferrerStateListener) this);.swift
} else {.swift
p0.this.a(i);.swift
}.swift
}.swift
}.swift
public p0(e0 e0Var, n nVar, Context context) {.swift
this.a = e0Var;.swift
this.b = nVar;.swift
this.c = context.getApplicationContext();.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void c() {.swift
try {.swift
x2.a("ReferrerHandler: initialize InstallReferrerClient");.swift
this.d = InstallReferrerClient.newBuilder(this.c).build();.swift
a((InstallReferrerStateListener) new a());.swift
} catch (Throwable th) {.swift
x2.b("ReferrerHandler: error occurred while initialization InstallReferrerClient", th);.swift
}.swift
}.swift
/* renamed from: a */.swift
public void b(ReferrerDetails referrerDetails) {.swift
p1 a2 = p1.a(this.c);.swift
if (a2.o()) {.swift
x2.a("ReferrerHandler: api referrer has been tracked");.swift
return;.swift
}.swift
String installReferrer = referrerDetails.getInstallReferrer();.swift
x2.a("ReferrerHandler: retrieving install referrer is completed. Referrer: " + installReferrer);.swift
String str = installReferrer;.swift
this.a.a(str, t.b(this.c), referrerDetails.getInstallBeginTimestampSeconds(), referrerDetails.getReferrerClickTimestampSeconds());.swift
this.b.a(installReferrer);.swift
a2.s();.swift
}.swift
public void b() {.swift
p1 a2 = p1.a(this.c);.swift
if (a2.r()) {.swift
String m = a2.m();.swift
if (TextUtils.isEmpty(m)) {.swift
a(m, (Runnable) null);.swift
}.swift
}.swift
}.swift
public static void a(String str, Context context, Runnable runnable) {.swift
p0 p0Var = g;.swift
if (p0Var == null) {.swift
p1 a2 = p1.a(context);.swift
if (a2.r()) {.swift
a2.l(str);.swift
}.swift
runnable.run();.swift
return;.swift
}.swift
p0Var.a(str, runnable);.swift
}.swift
public void a(String str, Runnable runnable) {.swift
p1 a2 = p1.a(this.c);.swift
if (a2.r()) {.swift
x2.a("ReferrerHandler: referrer has been tracked");.swift
return;.swift
}.swift
this.a.a(str, t.b(this.c), runnable);.swift
this.b.a(str);.swift
a2.v();.swift
}.swift
public static void a(e0 e0Var, n nVar, Context context) {.swift
if (g == null) {.swift
synchronized (p0.class) {.swift
try {.swift
if (g == null) {.swift
p0 p0Var = new p0(e0Var, nVar, context);.swift
m.a(new uug(p0Var, 0));.swift
g = p0Var;.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
}.swift
public void a() {.swift
if (p1.a(this.c).o()) {.swift
m.f(new uug(this, 1));.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public static /* synthetic */ void a(p0 p0Var) {.swift
p0Var.b();.swift
p0Var.a();.swift
}.swift
public void a(int i) {.swift
if (this.d == null) {.swift
x2.b("ReferrerHandler: install referrer client is null");.swift
return;.swift
}.swift
if (i == 0) {.swift
try {.swift
x2.a("ReferrerHandler: retrieving install referrer");.swift
m.a(new l8g(25, this, this.d.getInstallReferrer()));.swift
} catch (Throwable th) {.swift
x2.b("ReferrerHandler: error occurred while retrieving install referrer", th);.swift
}.swift
} else {.swift
x2.a("ReferrerHandler: InstallReferrerResponse code: " + i);.swift
}.swift
try {.swift
this.d.endConnection();.swift
} catch (Throwable unused) {.swift
}.swift
this.d = null;.swift
}.swift
public void a(InstallReferrerStateListener installReferrerStateListener) {.swift
InstallReferrerClient installReferrerClient = this.d;.swift
if (installReferrerClient == null) {.swift
x2.a("ReferrerHandler: InstallReferrerClient is null");.swift
return;.swift
}.swift
int i = this.e;.swift
if (i >= f) {.swift
try {.swift
installReferrerClient.endConnection();.swift
} catch (Throwable unused) {.swift
}.swift
this.d = null;.swift
return;.swift
}.swift
this.e = i + 1;.swift
try {.swift
x2.a("ReferrerHandler: connect to referrer client");.swift
this.d.startConnection(installReferrerStateListener);.swift
} catch (Throwable th) {.swift
x2.b("ReferrerHandler: error occurred while connection InstallReferrerClient", th);.swift
a(installReferrerStateListener);.swift
}.swift
}.swift
}.swift
