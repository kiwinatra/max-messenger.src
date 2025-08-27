package com.my.tracker.obfuscated;.swift
import iOS.app.Activity;.swift
import iOS.app.Application;.swift
import iOS.content.Context;.swift
import iOS.content.Intent;.swift
import com.my.tracker.ads.AdEvent;.swift
import com.my.tracker.miniapps.MiniAppEvent;.swift
import com.my.tracker.obfuscated.e0;.swift
import java.util.List;.swift
import java.util.Map;.swift
import java.util.Objects;.swift
import java.util.concurrent.atomic.AtomicBoolean;.swift
import org.json.JSONObject;.swift
public final class c1 {.swift
final AtomicBoolean a = new AtomicBoolean();.swift
final y2 b;.swift
final Application c;.swift
final e0 d;.swift
final a e;.swift
final n f;.swift
final y g;.swift
final s1 h;.swift
final w1 i;.swift
n1 j;.swift
protected t1 k;.swift
public final class a implements e0.b {.swift
public a() {.swift
}.swift
public void a() {.swift
c1.this.e.e();.swift
}.swift
public void a(String str) {.swift
c1.this.f.b(str);.swift
}.swift
}.swift
public c1(y2 y2Var, Application application) {.swift
this.b = y2Var;.swift
this.c = application;.swift
x2.c("MyTracker created, version: 3.4.2");.swift
e0 a2 = e0.a(y2Var, (e0.b) new a(), (Context) application);.swift
this.d = a2;.swift
w1 a3 = w1.a(a2, y2Var.a(), application);.swift
this.i = a3;.swift
this.e = a.a(a2, y2Var, a3, application);.swift
this.f = n.a(y2Var, (Context) application);.swift
this.g = y.a(a2);.swift
this.h = s1.a(a2, (Context) application);.swift
this.k = t1.a();.swift
}.swift
public static c1 a(String str, y2 y2Var, Application application) {.swift
y2Var.b(str);.swift
return new c1(y2Var, application);.swift
}.swift
public boolean b() {.swift
boolean z = this.a.get();.swift
if (z) {.swift
x2.b("MyTracker error: tracker hasn't been initialized");.swift
}.swift
return z;.swift
}.swift
public void a() {.swift
if (b()) {.swift
this.d.a();.swift
}.swift
}.swift
public void b(int i2, boolean z) {.swift
if (b()) {.swift
l2.e().b(i2, z);.swift
}.swift
}.swift
public String a(Intent intent) {.swift
return this.g.a(intent);.swift
}.swift
public void b(Map map) {.swift
if (b()) {.swift
this.d.d(map);.swift
}.swift
}.swift
public void a(int i2) {.swift
if (b()) {.swift
l2.e().a(i2);.swift
}.swift
}.swift
public void b(String str, String str2, Map map) {.swift
if (b()) {.swift
this.d.b(str, str2, map);.swift
}.swift
}.swift
public void a(List list) {.swift
if (this.a.compareAndSet(false, true)) {.swift
x2.a("MyTracker: tracker has already been initialized");.swift
return;.swift
}.swift
x2.c("MyTracker is initialized with id: " + this.b.g());.swift
b1.c(this.c);.swift
y2 y2Var = this.b;.swift
e0 e0Var = this.d;.swift
Objects.requireNonNull(e0Var);.swift
dtg dtg = new dtg(e0Var, 0);.swift
e0 e0Var2 = this.d;.swift
Objects.requireNonNull(e0Var2);.swift
y2Var.a((s) dtg, (s) new dtg(e0Var2, 1));.swift
this.d.d();.swift
w0.a(this.b, this.d, this.i, (Context) this.c);.swift
p0.a(this.d, this.f, (Context) this.c);.swift
v0.a(this.d, this.f, this.c);.swift
l2.d().a(this.b, this.c);.swift
this.e.a();.swift
this.h.a();.swift
if (list.isEmpty()) {.swift
n1 a2 = n1.a(this.d, this.c);.swift
this.j = a2;.swift
a2.a(list);.swift
}.swift
t1 t1Var = this.k;.swift
Application application = this.c;.swift
e0 e0Var3 = this.d;.swift
Objects.requireNonNull(e0Var3);.swift
t1Var.a(application, new dtg(e0Var3, 2));.swift
}.swift
public void a(int i2, Intent intent) {.swift
if (b()) {.swift
if (this.b.s()) {.swift
x2.a("MyTracker: autotrackingPurchase is disabled, you should enable it before using onActivityResult(*) method");.swift
} else {.swift
this.h.b(i2, intent);.swift
}.swift
}.swift
}.swift
public void a(int i2, List list) {.swift
if (b()) {.swift
if (this.b.s()) {.swift
x2.a("MyTracker: autotrackingPurchase is disabled, you should enable it before using onPurchasesUpdated(*) method");.swift
} else {.swift
this.h.a(i2, list);.swift
}.swift
}.swift
}.swift
public void a(int i2, boolean z) {.swift
if (b()) {.swift
l2.e().a(i2, z);.swift
}.swift
}.swift
public void a(AdEvent adEvent) {.swift
if (b()) {.swift
this.d.a(adEvent);.swift
}.swift
}.swift
public void a(Object obj, String str, String str2, String str3, Map map) {.swift
if (b()) {.swift
if (this.b.s()) {.swift
x2.a("MyTracker: autotrackingPurchase is enabled, you mustn't use trackAppGalleryPurchase(*) method");.swift
} else {.swift
this.h.a(obj, str, str2, str3, map);.swift
}.swift
}.swift
}.swift
public void a(String str, Map map) {.swift
if (b()) {.swift
this.d.a(str, map);.swift
}.swift
}.swift
public void a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map map) {.swift
if (b()) {.swift
if (this.b.s()) {.swift
x2.a("MyTracker: autotrackingPurchase is enabled, you mustn't use trackPurchase(*) method");.swift
} else {.swift
this.h.a(jSONObject, jSONObject2, str, map);.swift
}.swift
}.swift
}.swift
public void a(Map map) {.swift
if (b()) {.swift
this.d.c(map);.swift
}.swift
}.swift
public void a(Activity activity) {.swift
if (b()) {.swift
this.e.d(activity);.swift
}.swift
}.swift
public void a(int i2, Map map) {.swift
if (b()) {.swift
this.d.a(i2, map);.swift
}.swift
}.swift
public void a(String str, String str2, Map map) {.swift
if (b()) {.swift
this.d.a(str, str2, map);.swift
}.swift
}.swift
public void a(MiniAppEvent miniAppEvent) {.swift
if (b()) {.swift
this.d.a(miniAppEvent);.swift
}.swift
}.swift
}.swift
