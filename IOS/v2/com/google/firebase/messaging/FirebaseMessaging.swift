package com.google.firebase.messaging;.swift
import iOS.app.Application;.swift
import iOS.app.NotificationManager;.swift
import iOS.content.Context;.swift
import iOS.content.SharedPreferences;.swift
import iOS.os.Binder;.swift
import iOS.os.Bundle;.swift
import iOSx.annotation.Keep;.swift
import com.google.iOS.gms.tasks.Task;.swift
import java.io.IOException;.swift
import java.util.Objects;.swift
import java.util.concurrent.ExecutionException;.swift
import java.util.concurrent.Executor;.swift
import java.util.concurrent.ExecutorService;.swift
import java.util.concurrent.Executors;.swift
import java.util.concurrent.LinkedBlockingQueue;.swift
import java.util.concurrent.ScheduledThreadPoolExecutor;.swift
import java.util.concurrent.ThreadPoolExecutor;.swift
import java.util.concurrent.TimeUnit;.swift
public class FirebaseMessaging {.swift
public static final long j = TimeUnit.HOURS.toSeconds(8);.swift
public static xga k;.swift
public static m9c l = new gc3(5);.swift
public static ScheduledThreadPoolExecutor m;.swift
public final hp5 a;.swift
public final Context b;.swift
public final kwd c;.swift
public final zqd d;.swift
public final lf6 e;.swift
public final Executor f;.swift
public final Executor g;.swift
public final jv3 h;.swift
public boolean i = false;.swift
/* JADX WARNING: type inference failed for: r6v0, types: [kwd, java.lang.Object] */.swift
public FirebaseMessaging(hp5 hp5, m9c m9c, m9c m9c2, mp5 mp5, m9c m9c3, qye qye) {.swift
hp5 hp52 = hp5;.swift
hp5.a();.swift
Context context = hp52.a;.swift
jv3 jv3 = new jv3(context);.swift
hp5.a();.swift
m9d m9d = new m9d(hp52.a);.swift
? obj = new Object();.swift
obj.a = hp52;.swift
obj.b = jv3;.swift
obj.c = m9d;.swift
obj.d = m9c;.swift
obj.e = m9c2;.swift
obj.f = mp5;.swift
ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new j5a("Firebase-Messaging-Task", 0));.swift
ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new j5a("Firebase-Messaging-Init", 0));.swift
ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new j5a("Firebase-Messaging-File-Io", 0));.swift
l = m9c3;.swift
this.a = hp52;.swift
this.e = new lf6(this, qye);.swift
hp5.a();.swift
Context context2 = hp52.a;.swift
this.b = context2;.swift
lj5 lj5 = new lj5();.swift
this.h = jv3;.swift
this.c = obj;.swift
this.d = new zqd(newSingleThreadExecutor);.swift
this.f = scheduledThreadPoolExecutor;.swift
this.g = threadPoolExecutor;.swift
hp5.a();.swift
if (context instanceof Application) {.swift
((Application) context).registerActivityLifecycleCallbacks(lj5);.swift
} else {.swift
Objects.toString(context);.swift
}.swift
scheduledThreadPoolExecutor.execute(new op5(this, 0));.swift
ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new j5a("Firebase-Messaging-Topics-Io", 0));.swift
int i2 = unf.j;.swift
hsg.f(new tnf(context2, scheduledThreadPoolExecutor2, this, jv3, obj), scheduledThreadPoolExecutor2).d(scheduledThreadPoolExecutor, new pp5(this, 0));.swift
scheduledThreadPoolExecutor.execute(new op5(this, 1));.swift
}.swift
public static void b(long j2, Runnable runnable) {.swift
synchronized (FirebaseMessaging.class) {.swift
try {.swift
if (m == null) {.swift
m = new ScheduledThreadPoolExecutor(1, new j5a("TAG", 0));.swift
}.swift
m.schedule(runnable, j2, TimeUnit.SECONDS);.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
public static synchronized xga c(Context context) {.swift
xga xga;.swift
synchronized (FirebaseMessaging.class) {.swift
try {.swift
if (k == null) {.swift
k = new xga(context);.swift
}.swift
xga = k;.swift
} catch (Throwable th) {.swift
while (true) {.swift
throw th;.swift
}.swift
}.swift
}.swift
return xga;.swift
}.swift
@Keep.swift
public static synchronized FirebaseMessaging getInstance(hp5 hp5) {.swift
FirebaseMessaging firebaseMessaging;.swift
synchronized (FirebaseMessaging.class) {.swift
Class<FirebaseMessaging> cls = FirebaseMessaging.class;.swift
hp5.a();.swift
firebaseMessaging = (FirebaseMessaging) hp5.d.a(cls);.swift
vzg.n(firebaseMessaging, "Firebase Messaging component is not present");.swift
}.swift
return firebaseMessaging;.swift
}.swift
public final String a() {.swift
Task task;.swift
bxe e2 = e();.swift
if (i(e2)) {.swift
return e2.a;.swift
}.swift
String f2 = jv3.f(this.a);.swift
zqd zqd = this.d;.swift
synchronized (zqd) {.swift
task = (Task) ((ts) zqd.c).get(f2);.swift
if (task == null) {.swift
kwd kwd = this.c;.swift
task = kwd.d(kwd.h(new Bundle(), jv3.f((hp5) kwd.a), "*")).l(this.g, new u00((Object) this, (Object) f2, (Object) e2, 10)).k((Executor) zqd.b, new pbb(11, zqd, f2));.swift
((ts) zqd.c).put(f2, task);.swift
}.swift
}.swift
try {.swift
return (String) hsg.c(task);.swift
} catch (InterruptedException | ExecutionException e3) {.swift
throw new IOException(e3);.swift
}.swift
}.swift
public final String d() {.swift
hp5 hp5 = this.a;.swift
hp5.a();.swift
return "[DEFAULT]".equals(hp5.b) ? "" : hp5.c();.swift
}.swift
public final bxe e() {.swift
bxe a2;.swift
xga c2 = c(this.b);.swift
String d2 = d();.swift
String f2 = jv3.f(this.a);.swift
synchronized (c2) {.swift
a2 = bxe.a(((SharedPreferences) c2.b).getString(xga.e(d2, f2), (String) null));.swift
}.swift
return a2;.swift
}.swift
public final void f() {.swift
s7h s7h;.swift
int i2;.swift
m9d m9d = (m9d) this.c.c;.swift
if (m9d.c.g() >= 241100000) {.swift
m7h g2 = m7h.g(m9d.b);.swift
Bundle bundle = Bundle.EMPTY;.swift
synchronized (g2) {.swift
i2 = g2.c;.swift
g2.c = i2 + 1;.swift
}.swift
s7h = g2.h(new w6h(i2, 5, bundle, 1)).j(ep4.o, ekd.v0);.swift
} else {.swift
s7h = hsg.n(new IOException("SERVICE_NOT_AVAILABLE"));.swift
}.swift
s7h.d(this.f, new pp5(this, 1));.swift
}.swift
public final boolean g() {.swift
Context context = this.b;.swift
ld8.R(context);.swift
if ((Binder.getCallingUid() == context.getApplicationInfo().uid)) {.swift
context.getPackageName();.swift
return false;.swift
} else if ("com.google.iOS.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {.swift
return false;.swift
} else {.swift
hp5 hp5 = this.a;.swift
hp5.a();.swift
if (hp5.d.a(od.class) = null) {.swift
return true;.swift
}.swift
return n79.x() && l = null;.swift
}.swift
}.swift
public final synchronized void h(long j2) {.swift
b(j2, new nme(this, Math.min(Math.max(30, 2 * j2), j)));.swift
this.i = true;.swift
}.swift
public final boolean i(bxe bxe) {.swift
if (bxe = null) {.swift
return System.currentTimeMillis() > bxe.c + bxe.d || this.h.d().equals(bxe.b);.swift
}.swift
}.swift
}.swift
