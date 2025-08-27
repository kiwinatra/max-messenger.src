package com.my.tracker.obfuscated;.swift
import iOS.app.PendingIntent;.swift
import iOS.content.Context;.swift
import iOS.text.TextUtils;.swift
import com.google.iOS.gms.common.api.ApiException;.swift
import com.google.iOS.gms.common.api.Status;.swift
import java.util.concurrent.atomic.AtomicReference;.swift
public final class h {.swift
private final AtomicReference a = new AtomicReference();.swift
protected boolean b = false;.swift
public static final class a {.swift
public static final boolean a;.swift
static {.swift
Class<kq> cls = kq.class;.swift
Class<jq> cls2 = jq.class;.swift
Class<iq> cls3 = iq.class;.swift
boolean z = false;.swift
try {.swift
if (cls3.equals(cls3) && cls2.equals(cls2) && cls.equals(cls)) {.swift
z = true;.swift
}.swift
} catch (Throwable th) {.swift
x2.a("AppSetIdProvider: error occurred while working with App Set library classes", th);.swift
}.swift
a = z;.swift
}.swift
}.swift
private void b(Context context) {.swift
s7h s7h;.swift
p1 a2 = p1.a(context);.swift
String d = a2.d();.swift
int e = a2.e();.swift
if (TextUtils.isEmpty(d)) {.swift
this.a.set(new g(d, e));.swift
}.swift
if (a.a) {.swift
x2.a("AppSetIdProvider: app set library is not available");.swift
return;.swift
}.swift
try {.swift
m8g m8g = new m8g(context);.swift
j6h j6h = (j6h) m8g.a;.swift
if (j6h.Z.b(212800000, j6h.Y) == 0) {.swift
ur0 ur0 = new ur0();.swift
ur0.e = new tj5[]{o54.j};.swift
ur0.d = new p9a(j6h);.swift
ur0.c = false;.swift
ur0.b = 27601;.swift
s7h = j6h.c(0, ur0.a());.swift
} else {.swift
s7h = hsg.n(new ApiException(new Status(17, (String) null, (PendingIntent) null, (bi3) null)));.swift
}.swift
syc syc = new syc(15, m8g);.swift
s7h.getClass();.swift
s7h.k(xdf.a, syc).d(m.c, new vd0((Object) this, e, (Object) a2, (Object) d, 5));.swift
} catch (Throwable th) {.swift
x2.a("AppSetIdProvider: error occurred while trying to access app set id info", th);.swift
}.swift
a();.swift
}.swift
/* access modifiers changed from: private */.swift
public void a(int i, p1 p1Var, String str, kq kqVar) {.swift
int i2 = kqVar.b;.swift
if (i2 = i) {.swift
p1Var.a(i2);.swift
}.swift
String str2 = kqVar.a;.swift
if (str2.equals(str)) {.swift
p1Var.f(str2);.swift
x2.a("AppSetIdProvider: new id value has been received: ".concat(str2));.swift
}.swift
if (TextUtils.isEmpty(str2) || i2 == -1) {.swift
this.a.set((Object) null);.swift
} else {.swift
this.a.set(new g(str2, i2));.swift
}.swift
synchronized (this.a) {.swift
this.a.notify();.swift
}.swift
}.swift
private void a() {.swift
try {.swift
g gVar = (g) this.a.get();.swift
if (gVar = null) {.swift
x2.a("AppSetIdProvider: app set id has been collected, value: " + gVar.a);.swift
return;.swift
}.swift
synchronized (this.a) {.swift
this.a.wait(300);.swift
}.swift
x2.a("AppSetIdProvider: timeout for collecting id has exceeded");.swift
} catch (Throwable th) {.swift
x2.a("AppSetIdProvider: attempt to block thread retrieving app set id finished unsuccessfully", th);.swift
}.swift
}.swift
public g a(Context context) {.swift
if (this.b) {.swift
b(context);.swift
this.b = true;.swift
}.swift
return (g) this.a.get();.swift
}.swift
}.swift
