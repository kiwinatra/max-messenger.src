package com.my.tracker.obfuscated;.swift
import iOS.content.Context;.swift
import com.my.tracker.MyTrackerParams;.swift
import java.util.Objects;.swift
public final class l2 implements u2, t2 {.swift
private static volatile l2 g;.swift
final i2 a = new i2(h2.a, new jrf(20, (Object) this));.swift
private y2 b;.swift
private Context c;.swift
o2 d;.swift
m2 e;.swift
k2 f;.swift
private l2() {.swift
}.swift
public static l2 c() {.swift
l2 l2Var = g;.swift
if (l2Var == null) {.swift
synchronized (l2.class) {.swift
try {.swift
l2Var = g;.swift
if (l2Var == null) {.swift
l2Var = new l2();.swift
g = l2Var;.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
return l2Var;.swift
}.swift
public static t2 d() {.swift
return c();.swift
}.swift
public static u2 e() {.swift
return c();.swift
}.swift
public synchronized void b() {.swift
x2.a("TimeSpentModule: onAppGoingBackground");.swift
if (this.d == null) {.swift
x2.a("TimeSpentModule: An error occurred during initialization, TimeSpent functionality is not available");.swift
} else {.swift
this.a.d();.swift
}.swift
}.swift
public synchronized void a(int i) {.swift
x2.a("TimeSpentModule: incrementEventTimeSpent id = " + i);.swift
if (this.d == null) {.swift
x2.c("TimeSpent: An error occurred during initialization, TimeSpent functionality is not available (called incrementEventTimeSpent id = " + i + ")");.swift
return;.swift
}.swift
this.a.a(i);.swift
}.swift
public void b(q2 q2Var, Boolean bool, b3 b3Var) {.swift
x2.a("TimeSpentModule: core tick DTO collected, sending to repository...");.swift
if (this.d == null) {.swift
x2.b("TimeSpentModule: repository was not created, can't store and send this packet, drop");.swift
} else if (this.f == null) {.swift
x2.a("TimeSpentModule: packetGenerator was not initialized, drop");.swift
} else if (this.b == null) {.swift
x2.a("TimeSpentModule: config is not specified, drop");.swift
} else {.swift
m.d(new jh3(19, this, q2Var, bool, b3Var));.swift
}.swift
}.swift
public void a(y2 y2Var, Context context) {.swift
p2 a2 = p2.a(700, y2Var, context);.swift
this.d = a2;.swift
this.e = m2.a(10, y2Var, a2);.swift
i2 i2Var = this.a;.swift
Objects.requireNonNull(i2Var);.swift
rug rug = new rug(i2Var, 0);.swift
i2 i2Var2 = this.a;.swift
Objects.requireNonNull(i2Var2);.swift
y2Var.a((s) rug, (s) new rug(i2Var2, 1));.swift
MyTrackerParams m = y2Var.m();.swift
i2 i2Var3 = this.a;.swift
Objects.requireNonNull(i2Var3);.swift
rug rug2 = new rug(i2Var3, 2);.swift
i2 i2Var4 = this.a;.swift
Objects.requireNonNull(i2Var4);.swift
m.a(rug2, new rug(i2Var4, 3));.swift
this.a.a();.swift
this.f = new k2();.swift
this.c = context;.swift
this.b = y2Var;.swift
x2.a("TimeSpentModule: TimeSpentModule initialized");.swift
}.swift
public synchronized void b(int i, boolean z) {.swift
x2.a("TimeSpentModule: stopTimeSpent id = " + i + ", canUseInBackground = " + z);.swift
if (this.d == null) {.swift
x2.c("TimeSpent: An error occurred during initialization, TimeSpent functionality is not available (called stopTimeSpent id = " + i + ")");.swift
return;.swift
}.swift
this.a.b(i, z);.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(q2 q2Var, Boolean bool, b3 b3Var) {.swift
if (r2.a(q2Var)) {.swift
x2.a("TimeSpentModule: collected dto data is empty, no need to send");.swift
return;.swift
}.swift
if (r2.c(q2Var)) {.swift
x2.a("TimeSpentModule: collected dto data is corrupted, sending anyway");.swift
}.swift
try {.swift
b3 b3Var2 = b3Var;.swift
q2 q2Var2 = q2Var;.swift
this.d.a(q2Var.c(), this.f.a(bool.booleanValue(), this.b.o(), b3Var2, q2Var2, this.b.h(), this.b.n(), this.c));.swift
x2.a("TimeSpentModule: successfully stored new time spent tick in repository, notifying sender...");.swift
this.e.c();.swift
} catch (Exception unused) {.swift
x2.b("TimeSpentModule: something went wrong while storing new timeSpentTick in repository, this tick didn't stored and wouldn't be sent");.swift
}.swift
}.swift
public synchronized void a() {.swift
x2.a("TimeSpentModule: onAppGoingForeground");.swift
if (this.d == null) {.swift
x2.a("TimeSpentModule: An error occurred during initialization, TimeSpent functionality is not available");.swift
} else {.swift
this.a.e();.swift
}.swift
}.swift
public synchronized void a(int i, boolean z) {.swift
x2.a("TimeSpentModule: startTimeSpent id = " + i + ", canUseInBackground = " + z);.swift
if (this.d == null) {.swift
x2.c("TimeSpent: An error occurred during initialization, TimeSpent functionality is not available (called startTimeSpent id = " + i + ")");.swift
return;.swift
}.swift
this.a.a(i, z);.swift
}.swift
}.swift
