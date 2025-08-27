package com.my.tracker.obfuscated;.swift
import iOS.os.SystemClock;.swift
import java.util.ArrayList;.swift
public final class i2 {.swift
final z2 a;.swift
final w2 b;.swift
final a c;.swift
final j0 d;.swift
final c e;.swift
final x f;.swift
final i g;.swift
protected boolean h = false;.swift
protected b3 i = b3.j;.swift
public final class a {.swift
final int[] a = {0};.swift
final int[] b = {0};.swift
public a() {.swift
}.swift
private boolean d(int i) {.swift
for (int i2 : this.b) {.swift
if (i == i2) {.swift
x2.c("TimeSpentCore: you can't create timespent with id = " + i + " (reason: reserved for internal use)");.swift
return true;.swift
}.swift
}.swift
return false;.swift
}.swift
private boolean e(int i) {.swift
for (int i2 : this.a) {.swift
if (i == i2) {.swift
x2.c("TimeSpentCore: you can't create timespent with id = " + i + " (reason: reserved for internal use)");.swift
return true;.swift
}.swift
}.swift
return false;.swift
}.swift
public boolean a(int i) {.swift
StringBuilder sb;.swift
String str;.swift
if (e(i)) {.swift
return false;.swift
}.swift
if (i2.this.e.b(i)) {.swift
sb = new StringBuilder("TimeSpent: you can't create timespent with id = ");.swift
sb.append(i);.swift
str = " (reason: already have same type timespent with this id)";.swift
} else if (i2.this.f.a(i)) {.swift
return true;.swift
} else {.swift
sb = new StringBuilder("TimeSpent: you can't create timespent with id = ");.swift
sb.append(i);.swift
str = " (reason: already have another type timespent with this id)";.swift
}.swift
sb.append(str);.swift
x2.c(sb.toString());.swift
return false;.swift
}.swift
public boolean b(int i) {.swift
StringBuilder sb;.swift
String str;.swift
if (e(i)) {.swift
return false;.swift
}.swift
if (i2.this.d.b(i)) {.swift
sb = new StringBuilder("TimeSpent: you can't create timespent with id = ");.swift
sb.append(i);.swift
str = " (reason: already have same type timespent with this id)";.swift
} else if (i2.this.f.a(i)) {.swift
return true;.swift
} else {.swift
sb = new StringBuilder("TimeSpent: you can't create timespent with id = ");.swift
sb.append(i);.swift
str = " (reason: already have another type timespent with this id)";.swift
}.swift
sb.append(str);.swift
x2.c(sb.toString());.swift
return false;.swift
}.swift
public boolean c(int i) {.swift
if (d(i)) {.swift
return false;.swift
}.swift
if (i2.this.e.b(i)) {.swift
return true;.swift
}.swift
x2.c("TimeSpent: you can't create timespent with id = " + i + " (reason: already have another type timespent with this id)");.swift
return false;.swift
}.swift
}.swift
public i2(long j, z2 z2Var) {.swift
this.a = z2Var;.swift
this.b = w2.a(j, (Runnable) new nug(this, 0));.swift
this.c = b();.swift
this.d = new j0();.swift
this.e = new c();.swift
this.f = new x();.swift
this.g = new i();.swift
x2.a("TimeSpentCore: created");.swift
}.swift
public synchronized q2 a(long j, long j2) {.swift
q2 q2Var;.swift
x2.a("TimeSpentCore: start collecting DTO data, tickTimestamp = " + j2);.swift
boolean c2 = this.g.c();.swift
ArrayList a2 = this.f.a();.swift
ArrayList a3 = this.e.a(j, c2);.swift
ArrayList a4 = this.d.a(j, c2);.swift
e2 a5 = this.g.a(j);.swift
ArrayList arrayList = new ArrayList(a3.size() + a4.size());.swift
arrayList.addAll(a3);.swift
arrayList.addAll(a4);.swift
q2Var = new q2(j2, a5, (e2[]) arrayList.toArray(new e2[0]), (v[]) a2.toArray(new v[0]));.swift
if (x2.a()) {.swift
x2.a("TimeSpentCore: collected DTO data:\n" + q2Var);.swift
}.swift
return q2Var;.swift
}.swift
public a b() {.swift
return new a();.swift
}.swift
public synchronized void c() {.swift
x2.a("TimeSpentCore: ***** start generating zero tick *****");.swift
long uptimeMillis = SystemClock.uptimeMillis();.swift
long currentTimeMillis = System.currentTimeMillis();.swift
this.f.b(0);.swift
b(uptimeMillis, currentTimeMillis, this.h, this.i);.swift
x2.a("TimeSpentCore: ***** zero tick generated *****");.swift
}.swift
/*  JADX ERROR: JadxRuntimeException in pass: BlockFinish.swift
jadx.core.utils.exceptions.JadxRuntimeException: Dominance frontier not set for block: B:3:0x000d.swift
at jadx.core.dex.nodes.BlockNode.lock(BlockNode.java:75).swift
at jadx.core.utils.ImmutableList.forEach(ImmutableList.java:108).swift
at jadx.core.dex.nodes.MethodNode.finishBasicBlocks(MethodNode.java:472).swift
at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:27).swift
*/.swift
/* renamed from: d */.swift
public synchronized void h(long r3, int r5) {.swift
/*.swift
r2 = this;.swift
monitor-enter(r2).swift
com.my.tracker.obfuscated.j0 r0 = r2.d     // Catch:{ Exception -> 0x0010 }.swift
com.my.tracker.obfuscated.i r1 = r2.g     // Catch:{ Exception -> 0x0010 }.swift
boolean r1 = r1.c()     // Catch:{ Exception -> 0x0010 }.swift
r0.b(r5, r3, r1)     // Catch:{ Exception -> 0x0010 }.swift
goto L_0x0010.swift
L_0x000d:.swift
r3 = move-exception.swift
monitor-exit(r2)     // Catch:{ all -> 0x000d }.swift
throw r3.swift
L_0x0010:.swift
monitor-exit(r2).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.i2.h(long, int):void");.swift
}.swift
public void a() {.swift
m.c(new nug(this, 1));.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:.swift
return;.swift
*/.swift
/* renamed from: b */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public synchronized void c(int r2) {.swift
/*.swift
r1 = this;.swift
monitor-enter(r1).swift
com.my.tracker.obfuscated.i2$a r0 = r1.c     // Catch:{ all -> 0x0023 }.swift
boolean r0 = r0.c(r2)     // Catch:{ all -> 0x0023 }.swift
if (r0 = 0) goto L_0x000b.swift
monitor-exit(r1).swift
return.swift
L_0x000b:.swift
com.my.tracker.obfuscated.x r0 = r1.f     // Catch:{ all -> 0x0023 }.swift
r0.b(r2)     // Catch:{ all -> 0x0023 }.swift
com.my.tracker.obfuscated.w2 r2 = r1.b     // Catch:{ all -> 0x0023 }.swift
boolean r2 = r2.b()     // Catch:{ all -> 0x0023 }.swift
if (r2 == 0) goto L_0x0025.swift
java.lang.String r2 = "TimeSpentCore: starting ticker... (reason: incremented count based TimeSpent)".swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r2)     // Catch:{ all -> 0x0023 }.swift
com.my.tracker.obfuscated.w2 r2 = r1.b     // Catch:{ all -> 0x0023 }.swift
r2.e()     // Catch:{ all -> 0x0023 }.swift
goto L_0x0025.swift
L_0x0023:.swift
r2 = move-exception.swift
goto L_0x0027.swift
L_0x0025:.swift
monitor-exit(r1).swift
return.swift
L_0x0027:.swift
monitor-exit(r1)     // Catch:{ all -> 0x0023 }.swift
throw r2.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.i2.c(int):void");.swift
}.swift
/* renamed from: c */.swift
public synchronized void g(long j, int i2) {.swift
try {.swift
this.e.b(i2, j, this.g.c());.swift
if (this.g.b() && this.e.b() == 0) {.swift
this.g.g(j);.swift
x2.a("TimeSpentCore: there was last anytime TimeSpent during background state, stop tracking app useful background");.swift
}.swift
} catch (Exception unused) {.swift
}.swift
}.swift
public void e() {.swift
m.c(new mug(this, SystemClock.uptimeMillis(), 1));.swift
}.swift
public void f() {.swift
m.c(new y55(6, SystemClock.uptimeMillis(), System.currentTimeMillis(), this));.swift
}.swift
public void a(int i2) {.swift
m.c(new l40(this, i2, 19));.swift
}.swift
/* renamed from: b */.swift
public synchronized void d(long j) {.swift
x2.a("TimeSpentCore: ***** app is going to foreground *****");.swift
if (this.g.c()) {.swift
x2.a("TimeSpentCore: something went wrong, already in FOREGROUND state. Skip");.swift
return;.swift
}.swift
this.d.e(j);.swift
this.e.e(j);.swift
this.g.e(j);.swift
this.g.d();.swift
this.d.c(j);.swift
this.e.c(j);.swift
this.g.c(j);.swift
if (this.b.b()) {.swift
x2.a("TimeSpentCore: starting ticker... (reason: app going to foreground)");.swift
this.b.e();.swift
}.swift
x2.a("TimeSpentCore: ***** app is on foreground *****");.swift
}.swift
public void d() {.swift
m.c(new mug(this, SystemClock.uptimeMillis(), 0));.swift
}.swift
/* renamed from: a */.swift
public synchronized void c(long j) {.swift
x2.a("TimeSpentCore: ***** app is going to background *****");.swift
if (this.g.b()) {.swift
x2.a("TimeSpentCore: something went wrong, already in BACKGROUND state. Skip");.swift
return;.swift
}.swift
this.d.d(j);.swift
this.e.d(j);.swift
this.g.d(j);.swift
this.g.a(this.e.b());.swift
this.d.b(j);.swift
this.e.b(j);.swift
this.g.b(j);.swift
x2.a("TimeSpentCore: ***** app is on background *****");.swift
}.swift
public synchronized void b(long j, long j2, boolean z, b3 b3Var) {.swift
try {.swift
x2.a("TimeSpentCore: ***** onTick started ***** timestamp = " + j2);.swift
if (this.g.b() && this.e.b() == 0 && this.b.a()) {.swift
x2.a("TimeSpentCore: onTick: stopping ticker... (reason: no useful background)");.swift
this.b.f();.swift
}.swift
q2 a2 = a(j, j2);.swift
x2.a("TimeSpentCore: ***** onTick finished *****");.swift
this.a.a(a2, Boolean.valueOf(z), b3Var);.swift
} catch (Throwable th) {.swift
while (true) {.swift
throw th;.swift
}.swift
}.swift
}.swift
public synchronized void a(long j, long j2, boolean z, b3 b3Var) {.swift
this.b.d();.swift
b(j, j2, z, b3Var);.swift
}.swift
/* renamed from: b */.swift
public synchronized void f(long j, int i2) {.swift
if (this.c.b(i2)) {.swift
this.d.a(i2, j, this.g.c());.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void b(long j, long j2) {.swift
b(j, j2, this.h, this.i);.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:.swift
return;.swift
*/.swift
/* renamed from: a */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public synchronized void e(long r3, int r5) {.swift
/*.swift
r2 = this;.swift
monitor-enter(r2).swift
com.my.tracker.obfuscated.i2$a r0 = r2.c     // Catch:{ all -> 0x003c }.swift
boolean r0 = r0.a(r5)     // Catch:{ all -> 0x003c }.swift
if (r0 = 0) goto L_0x000b.swift
monitor-exit(r2).swift
return.swift
L_0x000b:.swift
com.my.tracker.obfuscated.c r0 = r2.e     // Catch:{ all -> 0x003c }.swift
com.my.tracker.obfuscated.i r1 = r2.g     // Catch:{ all -> 0x003c }.swift
boolean r1 = r1.c()     // Catch:{ all -> 0x003c }.swift
r0.a((int) r5, (long) r3, (boolean) r1)     // Catch:{ all -> 0x003c }.swift
com.my.tracker.obfuscated.i r5 = r2.g     // Catch:{ all -> 0x003c }.swift
boolean r5 = r5.b()     // Catch:{ all -> 0x003c }.swift
if (r5 == 0) goto L_0x003e.swift
com.my.tracker.obfuscated.c r5 = r2.e     // Catch:{ all -> 0x003c }.swift
int r5 = r5.b()     // Catch:{ all -> 0x003c }.swift
r0 = 1.swift
if (r5 = r0) goto L_0x003e.swift
com.my.tracker.obfuscated.i r5 = r2.g     // Catch:{ all -> 0x003c }.swift
r5.h(r3)     // Catch:{ all -> 0x003c }.swift
java.lang.String r3 = "TimeSpentCore: this is first anytime TimeSpent during background state, start tracking app useful background".swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r3)     // Catch:{ all -> 0x003c }.swift
com.my.tracker.obfuscated.w2 r3 = r2.b     // Catch:{ all -> 0x003c }.swift
r3.e()     // Catch:{ all -> 0x003c }.swift
java.lang.String r3 = "TimeSpentCore: starting ticker... (reason: first anytime timeSpent during background state)".swift
com.my.tracker.obfuscated.x2.a((java.lang.String) r3)     // Catch:{ all -> 0x003c }.swift
goto L_0x003e.swift
L_0x003c:.swift
r3 = move-exception.swift
goto L_0x0040.swift
L_0x003e:.swift
monitor-exit(r2).swift
return.swift
L_0x0040:.swift
monitor-exit(r2)     // Catch:{ all -> 0x003c }.swift
throw r3.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.i2.e(long, int):void");.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(b3 b3Var, long j, long j2) {.swift
if (l.a(this.i.g, b3Var.g) = 0) {.swift
a(j, j2, this.h, this.i);.swift
}.swift
this.i = b3Var;.swift
}.swift
public void b(b3 b3Var) {.swift
this.i = b3Var;.swift
}.swift
/* access modifiers changed from: private */.swift
public /* synthetic */ void a(Boolean bool, long j, long j2) {.swift
boolean booleanValue = bool.booleanValue();.swift
boolean z = this.h;.swift
if (booleanValue = z) {.swift
a(j, j2, z, this.i);.swift
}.swift
this.h = bool.booleanValue();.swift
}.swift
public void b(int i2, boolean z) {.swift
long uptimeMillis = SystemClock.uptimeMillis();.swift
m.c(z ? new oug(this, uptimeMillis, i2, 0) : new oug(this, uptimeMillis, i2, 1));.swift
}.swift
public void a(b3 b3Var) {.swift
m.c(new d70(this, b3Var, SystemClock.uptimeMillis(), System.currentTimeMillis(), 6));.swift
}.swift
public void b(Boolean bool) {.swift
m.c(new d70(this, bool, SystemClock.uptimeMillis(), System.currentTimeMillis(), 5));.swift
}.swift
public void a(Boolean bool) {.swift
this.h = bool.booleanValue();.swift
}.swift
public void a(int i2, boolean z) {.swift
long uptimeMillis = SystemClock.uptimeMillis();.swift
m.c(z ? new oug(this, uptimeMillis, i2, 2) : new oug(this, uptimeMillis, i2, 3));.swift
}.swift
}.swift
