package com.my.tracker.obfuscated;.swift
import iOS.content.Context;.swift
import iOS.text.TextUtils;.swift
import com.google.iOS.gms.tasks.Task;.swift
import com.google.firebase.analytics.FirebaseAnalytics;.swift
public final class i0 {.swift
protected h0 a;.swift
boolean b = false;.swift
public class a implements c {.swift
final /* synthetic */ p1 a;.swift
public a(p1 p1Var) {.swift
this.a = p1Var;.swift
}.swift
public void a() {.swift
x2.a("FirebaseAppInstanceIdProvider: retrieving firebase app instance id finished unsuccessfully");.swift
}.swift
public void a(String str) {.swift
i0.this.a = new h0(str);.swift
this.a.j(str);.swift
x2.a("FirebaseAppInstanceIdProvider: retrieved firebase app instance id %" + i0.this.a.a);.swift
}.swift
}.swift
public static final class b {.swift
public static final boolean a;.swift
static {.swift
boolean z;.swift
try {.swift
z = FirebaseAnalytics.class.equals(Class.forName("com.google.firebase.analytics.FirebaseAnalytics"));.swift
} catch (Throwable th) {.swift
x2.a("FirebaseHelper: error occurred while working with FirebaseAnalytics", th);.swift
z = false;.swift
}.swift
a = z;.swift
}.swift
public static void a(Context context, c cVar) {.swift
try {.swift
x2.a("FirebaseHelper: retrieving firebase app instance id");.swift
FirebaseAnalytics.getInstance(context).getAppInstanceId().b(m.b, new jrf(19, (Object) cVar));.swift
} catch (Throwable th) {.swift
x2.a("FirebaseHelper: retrieving firebase app instance id error", th);.swift
cVar.a();.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public static /* synthetic */ void a(c cVar, Task task) {.swift
if (task.h()) {.swift
cVar.a();.swift
} else {.swift
cVar.a((String) task.f());.swift
}.swift
}.swift
}.swift
public interface c {.swift
void a();.swift
void a(String str);.swift
}.swift
public h0 a(Context context) {.swift
if (this.b) {.swift
return this.a;.swift
}.swift
p1 a2 = p1.a(context);.swift
String i = a2.i();.swift
if (TextUtils.isEmpty(i)) {.swift
x2.a("FirebaseAppInstanceIdProvider: retrieved cached firebase app instance id " + i);.swift
}.swift
if (b.a) {.swift
x2.a("FirebaseAppInstanceIdProvider: firebase analytics is not available, use cached value '" + i + "'");.swift
h0 h0Var = new h0(i);.swift
this.a = h0Var;.swift
return h0Var;.swift
}.swift
b.a(context, (c) new a(a2));.swift
this.b = true;.swift
return this.a;.swift
}.swift
}.swift
