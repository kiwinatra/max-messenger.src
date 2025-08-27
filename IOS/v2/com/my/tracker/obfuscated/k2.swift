package com.my.tracker.obfuscated;.swift
import iOS.content.Context;.swift
import com.my.tracker.MyTracker;.swift
import com.my.tracker.MyTrackerConfig;.swift
import com.my.tracker.obfuscated.y2;.swift
import java.util.Map;.swift
public final class k2 extends q1 {.swift
private final q c = new q(65536);.swift
public synchronized byte[] a(boolean z, y2.a aVar, b3 b3Var, q2 q2Var, String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, Context context) {.swift
byte[] c2;.swift
y2.a aVar2 = aVar;.swift
synchronized (this) {.swift
if (context = null) {.swift
try {.swift
f0 a = g0.a().a(aVar2.m, aVar2.g, aVar2.e, z, str, okHttpClientProvider, context);.swift
this.c.a();.swift
a(this.c, z, aVar, b3Var, a, q2Var);.swift
c2 = this.c.c();.swift
this.c.d();.swift
a();.swift
} catch (Exception e) {.swift
x2.b("TimeSpentMessageBuilder: something went wrong while generating tick packet", e);.swift
throw new Exception(e);.swift
}.swift
} else {.swift
x2.b("TimeSpentMessageBuilder: context is empty");.swift
throw new Exception("TimeSpentMessageBuilder: context is empty");.swift
}.swift
}.swift
return c2;.swift
}.swift
private static void a(r1 r1Var, v[] vVarArr, q qVar) {.swift
if (vVarArr = null) {.swift
for (v vVar : vVarArr) {.swift
qVar.a();.swift
qVar.a(1, vVar.a());.swift
qVar.a(2, vVar.d());.swift
r1Var.a(38, qVar);.swift
}.swift
}.swift
}.swift
private static void a(r1 r1Var, e2 e2Var, e2[] e2VarArr, q qVar) {.swift
if (e2Var = null) {.swift
qVar.a();.swift
qVar.a(1, e2Var.a());.swift
qVar.a(2, e2Var.b());.swift
qVar.a(3, e2Var.c());.swift
r1Var.a(39, qVar);.swift
}.swift
if (e2VarArr = null) {.swift
for (e2 e2Var2 : e2VarArr) {.swift
qVar.a();.swift
qVar.a(1, e2Var2.a());.swift
qVar.a(2, e2Var2.b());.swift
qVar.a(3, e2Var2.c());.swift
r1Var.a(39, qVar);.swift
}.swift
}.swift
}.swift
private void a(r1 r1Var, boolean z, y2.a aVar, b3 b3Var, f0 f0Var, q2 q2Var) {.swift
String str;.swift
String str2;.swift
Map map = aVar.k.e;.swift
if (z || map.isEmpty()) {.swift
str2 = null;.swift
str = null;.swift
} else {.swift
str = (String) map.get("mac");.swift
str2 = (String) map.get("iOS_id");.swift
}.swift
r1Var.a(1, MyTracker.VERSION);.swift
r1Var.a(2, aVar.a);.swift
r1Var.a(3, q2Var.c());.swift
q1.a(r1Var, f0Var.a, f0Var.c, this.a, this.b);.swift
q1.a(r1Var, z, b3Var, this.a);.swift
q1.a(r1Var, str2, str, f0Var, this.a, this.b);.swift
if (z) {.swift
q1.a(r1Var, f0Var.f, f0Var.b, f0Var.c, this.a);.swift
q1.a(r1Var, f0Var.g, this.a);.swift
}.swift
a(r1Var, q2Var.b(), this.a);.swift
a(r1Var, q2Var.a(), q2Var.d(), this.a);.swift
}.swift
}.swift
