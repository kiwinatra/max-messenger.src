package com.my.tracker.obfuscated;.swift
import iOS.app.Activity;.swift
import iOS.app.Application;.swift
import iOS.content.Context;.swift
import iOS.os.Bundle;.swift
import iOS.os.Handler;.swift
import java.util.Map;.swift
import java.util.WeakHashMap;.swift
import java.util.concurrent.atomic.AtomicBoolean;.swift
public final class a {.swift
final Map a = new WeakHashMap();.swift
final Handler b = m.a;.swift
final AtomicBoolean c = new AtomicBoolean();.swift
final e0 d;.swift
final y2 e;.swift
final w1 f;.swift
final Application g;.swift
final Runnable h;.swift
final Runnable i;.swift
final Runnable j;.swift
long k = 0;.swift
long l = 0;.swift
/* renamed from: com.my.tracker.obfuscated.a$a  reason: collision with other inner class name */.swift
public final class C0000a implements Application.ActivityLifecycleCallbacks {.swift
public C0000a() {.swift
}.swift
public void onActivityCreated(Activity activity, Bundle bundle) {.swift
}.swift
public void onActivityDestroyed(Activity activity) {.swift
}.swift
public void onActivityPaused(Activity activity) {.swift
}.swift
public void onActivityResumed(Activity activity) {.swift
}.swift
public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {.swift
}.swift
public void onActivityStarted(Activity activity) {.swift
a.this.a(activity);.swift
}.swift
public void onActivityStopped(Activity activity) {.swift
a.this.c(activity);.swift
}.swift
}.swift
private a(e0 e0Var, y2 y2Var, w1 w1Var, Application application) {.swift
this.d = e0Var;.swift
this.e = y2Var;.swift
this.f = w1Var;.swift
this.g = application;.swift
this.h = new isg(this, 0);.swift
this.i = new isg(this, 1);.swift
this.j = new isg(this, 2);.swift
}.swift
public void e() {.swift
if (this.c.get()) {.swift
m.f(this.i);.swift
}.swift
}.swift
public void f() {.swift
x2.a("ActivityHandler: timer tick for buffering period");.swift
this.d.a();.swift
e();.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void b() {.swift
if (this.c.get()) {.swift
f();.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void c() {.swift
a(v2.a((long) this.e.e()));.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void d() {.swift
p1.a((Context) this.g).d(v2.b(this.k));.swift
}.swift
public void a() {.swift
this.g.registerActivityLifecycleCallbacks(new C0000a());.swift
}.swift
/* renamed from: b */.swift
public void a(Activity activity) {.swift
if (this.a.put(activity, Boolean.TRUE) == null && this.a.size() <= 1) {.swift
l2.d().a();.swift
long currentTimeMillis = System.currentTimeMillis();.swift
if (currentTimeMillis - this.k >= v2.a((long) this.e.i())) {.swift
this.f.c();.swift
if (this.e.v()) {.swift
this.d.g();.swift
a(v2.a((long) this.e.e()));.swift
return;.swift
}.swift
}.swift
long j2 = this.l - currentTimeMillis;.swift
if (j2 > 0) {.swift
a(j2);.swift
} else {.swift
f();.swift
}.swift
}.swift
}.swift
public void c(Activity activity) {.swift
if (this.a.remove(activity) = null && this.a.isEmpty()) {.swift
l2.d().b();.swift
this.c.set(false);.swift
this.b.removeCallbacks(this.h);.swift
this.k = System.currentTimeMillis();.swift
m.a(this.j);.swift
}.swift
}.swift
public void d(Activity activity) {.swift
m.f(new l8g(10, this, activity));.swift
}.swift
public static a a(e0 e0Var, y2 y2Var, w1 w1Var, Application application) {.swift
return new a(e0Var, y2Var, w1Var, application);.swift
}.swift
public void a(long j2) {.swift
this.b.removeCallbacks(this.h);.swift
this.c.set(true);.swift
this.b.postDelayed(this.h, j2);.swift
this.l = System.currentTimeMillis() + j2;.swift
}.swift
}.swift
