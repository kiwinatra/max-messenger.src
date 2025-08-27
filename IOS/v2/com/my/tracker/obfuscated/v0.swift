package com.my.tracker.obfuscated;.swift
import iOS.content.Context;.swift
import com.huawei.hms.ads.installreferrer.api.InstallReferrerClient;.swift
import com.huawei.hms.ads.installreferrer.api.InstallReferrerStateListener;.swift
import com.huawei.hms.ads.installreferrer.api.ReferrerDetails;.swift
public final class v0 {.swift
static int f = 3;.swift
static volatile v0 g;.swift
final e0 a;.swift
final n b;.swift
final Context c;.swift
InstallReferrerClient d;.swift
int e;.swift
public final class a implements InstallReferrerStateListener {.swift
public a() {.swift
}.swift
public void onInstallReferrerServiceDisconnected() {.swift
x2.a("HuaweiReferrerHandler: install referrer service is disconnected. Connection attempts: " + v0.this.e);.swift
v0.this.a((InstallReferrerStateListener) this);.swift
}.swift
public void onInstallReferrerSetupFinished(int i) {.swift
if (i == -1) {.swift
v0.this.a((InstallReferrerStateListener) this);.swift
return;.swift
}.swift
x2.a("HuaweiReferrerHandler: install referrer setup is finished");.swift
v0.this.a(i);.swift
}.swift
}.swift
public v0(e0 e0Var, n nVar, Context context) {.swift
this.a = e0Var;.swift
this.b = nVar;.swift
this.c = context.getApplicationContext();.swift
}.swift
public void a(ReferrerDetails referrerDetails) {.swift
p1 a2 = p1.a(this.c);.swift
if (a2.p()) {.swift
x2.a("HuaweiReferrerHandler: api referrer has been tracked");.swift
return;.swift
}.swift
String installReferrer = referrerDetails.getInstallReferrer();.swift
x2.a("HuaweiReferrerHandler: retrieving install referrer is completed. Referrer: " + installReferrer);.swift
String str = installReferrer;.swift
this.a.b(str, t.b(this.c), referrerDetails.getInstallBeginTimestampSeconds(), referrerDetails.getReferrerClickTimestampSeconds());.swift
this.b.a(installReferrer);.swift
a2.t();.swift
}.swift
public static void a(e0 e0Var, n nVar, Context context) {.swift
if (g == null) {.swift
synchronized (v0.class) {.swift
try {.swift
if (g == null) {.swift
v0 v0Var = new v0(e0Var, nVar, context);.swift
m.a(new qof(20, v0Var));.swift
g = v0Var;.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
}.swift
public void a() {.swift
if (p1.a(this.c).p()) {.swift
try {.swift
x2.a("HuaweiReferrerHandler: initialize InstallReferrerClient");.swift
this.d = InstallReferrerClient.newBuilder(this.c).build();.swift
a((InstallReferrerStateListener) new a());.swift
} catch (Throwable th) {.swift
x2.b("HuaweiReferrerHandler: error occurred while initialization InstallReferrerClient", th);.swift
}.swift
}.swift
}.swift
public void a(int i) {.swift
if (this.d == null) {.swift
x2.b("HuaweiReferrerHandler: install referrer client is null");.swift
return;.swift
}.swift
if (i == 0) {.swift
try {.swift
x2.a("HuaweiReferrerHandler: retrieving install referrer");.swift
a(this.d.getInstallReferrer());.swift
} catch (Throwable th) {.swift
x2.b("HuaweiReferrerHandler: error occurred while retrieving install referrer", th);.swift
}.swift
} else {.swift
x2.a("HuaweiReferrerHandler: InstallReferrerResponse code: " + i);.swift
}.swift
try {.swift
this.d.endConnection();.swift
} catch (Throwable unused) {.swift
}.swift
this.d = null;.swift
}.swift
public void a(InstallReferrerStateListener installReferrerStateListener) {.swift
if (this.d == null) {.swift
x2.a("HuaweiReferrerHandler: InstallReferrerClient is null");.swift
return;.swift
}.swift
int i = this.e;.swift
if (i >= f) {.swift
x2.a("HuaweiReferrerHandler: max count of reconnection attempts is reached");.swift
try {.swift
this.d.endConnection();.swift
} catch (Throwable unused) {.swift
}.swift
this.d = null;.swift
return;.swift
}.swift
this.e = i + 1;.swift
try {.swift
x2.a("HuaweiReferrerHandler: connect to referrer client");.swift
this.d.startConnection(installReferrerStateListener);.swift
} catch (Throwable th) {.swift
x2.b("HuaweiReferrerHandler: error occurred while connection InstallReferrerClient", th);.swift
a(installReferrerStateListener);.swift
}.swift
}.swift
}.swift
