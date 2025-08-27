package com.my.tracker.obfuscated;.swift
import iOS.content.Context;.swift
import com.my.tracker.obfuscated.j2;.swift
import java.util.ArrayList;.swift
import java.util.Objects;.swift
import kotlin.jvm.internal.IntCompanionObject;.swift
public final class p2 implements o2 {.swift
final int a;.swift
b2 b;.swift
j2 c = null;.swift
int d = IntCompanionObject.MIN_VALUE;.swift
private p2(int i, b2 b2Var) {.swift
this.a = i;.swift
this.b = b2Var;.swift
x2.a("TimeSpentRepository: repository created but not initialized. Will initialized when first timespent tick will arrive");.swift
}.swift
private boolean c() {.swift
return this.c = null && this.d >= 0;.swift
}.swift
/* access modifiers changed from: private */.swift
public static /* synthetic */ j2 d() {.swift
return null;.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:.swift
r3 = "TimeSpentRepository: something went wrong while deleting " + r3.length + " packets from db";.swift
com.my.tracker.obfuscated.x2.b(r3);.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:.swift
throw new java.lang.Exception(r3);.swift
*/.swift
/* JADX WARNING: Exception block dominator not found, dom blocks: [] */.swift
/* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000f */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public synchronized void a(long[] r3) {.swift
/*.swift
r2 = this;.swift
java.lang.String r0 = "TimeSpentRepository: something went wrong while deleting ".swift
monitor-enter(r2).swift
com.my.tracker.obfuscated.j2 r1 = r2.c     // Catch:{ Exception -> 0x000f }.swift
java.util.Objects.requireNonNull(r1)     // Catch:{ Exception -> 0x000f }.swift
r1.a((long[]) r3)     // Catch:{ Exception -> 0x000f }.swift
monitor-exit(r2).swift
return.swift
L_0x000d:.swift
r3 = move-exception.swift
goto L_0x002a.swift
L_0x000f:.swift
java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x000d }.swift
r1.<init>(r0)     // Catch:{ all -> 0x000d }.swift
int r3 = r3.length     // Catch:{ all -> 0x000d }.swift
r1.append(r3)     // Catch:{ all -> 0x000d }.swift
java.lang.String r3 = " packets from db".swift
r1.append(r3)     // Catch:{ all -> 0x000d }.swift
java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x000d }.swift
com.my.tracker.obfuscated.x2.b(r3)     // Catch:{ all -> 0x000d }.swift
java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x000d }.swift
r0.<init>(r3)     // Catch:{ all -> 0x000d }.swift
throw r0     // Catch:{ all -> 0x000d }.swift
L_0x002a:.swift
monitor-exit(r2)     // Catch:{ all -> 0x000d }.swift
throw r3.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.p2.a(long[]):void");.swift
}.swift
public void b() {.swift
if (c()) {.swift
x2.a("TimeSpentRepository: initializing repository...");.swift
try {.swift
j2 j2Var = (j2) this.b.a();.swift
this.c = j2Var;.swift
this.d = j2Var.a();.swift
this.b = new hxf(21);.swift
x2.a("TimeSpentRepository: successfully initialized, current size = " + this.d + ", max size = " + this.a);.swift
} catch (Exception e) {.swift
x2.b("TimeSpentRepository: error occured while initialization repository, repository not initialized", e);.swift
this.c = null;.swift
this.d = IntCompanionObject.MIN_VALUE;.swift
throw e;.swift
}.swift
}.swift
}.swift
private void a() {.swift
int i = (this.d - this.a) + 1;.swift
try {.swift
j2 j2Var = this.c;.swift
Objects.requireNonNull(j2Var);.swift
int a2 = j2Var.a(i);.swift
this.d -= a2;.swift
x2.a("TimeSpentRepository: successfully deleted " + a2 + "(requested = " + i + ") oldest tick packets from db, currentDbSize = " + this.d + " (reason: need free up space for new packet)");.swift
} catch (Exception e) {.swift
StringBuilder o = wj6.o(i, "TimeSpentRepository: something went wrong while trying to delete oldest", " tick packets from db (reason: need free up space for new packet, maxSize = ");.swift
o.append(this.a);.swift
o.append(", current size = ");.swift
o.append(this.d);.swift
o.append("), can't store new tick packet");.swift
x2.b(o.toString(), e);.swift
throw new Exception(e);.swift
}.swift
}.swift
public synchronized s2[] a(int i) {.swift
j2.b b2;.swift
s2[] s2VarArr;.swift
try {.swift
j2 j2Var = this.c;.swift
Objects.requireNonNull(j2Var);.swift
b2 = j2Var.b(i);.swift
ArrayList arrayList = new ArrayList(i);.swift
while (b2.b()) {.swift
arrayList.add(new s2(b2.n(), b2.m()));.swift
}.swift
x2.a("TimeSpentRepository: read " + arrayList.size() + " freshest packets from db");.swift
s2VarArr = arrayList.isEmpty() ? null : (s2[]) arrayList.toArray(new s2[0]);.swift
b2.close();.swift
} catch (Throwable th) {.swift
x2.b("TimeSpentRepository: error while reading " + i + " freshest tick packets", th);.swift
return null;.swift
}.swift
return s2VarArr;.swift
throw th;.swift
}.swift
/* access modifiers changed from: private */.swift
public static /* synthetic */ j2 a(String str, Context context) {.swift
try {.swift
return j2.a(str, context);.swift
} catch (Exception e) {.swift
x2.b("TimeSpentRepository: can't initialize sql database", e);.swift
throw new RuntimeException(e);.swift
}.swift
}.swift
public static p2 a(int i, y2 y2Var, Context context) {.swift
return new p2(i, new hzf(context, y2Var.g()));.swift
}.swift
public synchronized void a(long j, byte[] bArr) {.swift
try {.swift
if (c()) {.swift
b();.swift
}.swift
if (this.d >= this.a) {.swift
a();.swift
}.swift
long a2 = this.c.a(j, bArr);.swift
this.d++;.swift
x2.a("TimeSpentRepository: successfully stored new tick packet to db, tickPacketId = " + a2 + " (current db size = " + this.d + ")");.swift
} catch (Exception e) {.swift
x2.b("TimeSpentRepository: something went wrong while saving new tick packet in database, this tick wouldn't be stored");.swift
throw new Exception(e);.swift
} catch (Exception e2) {.swift
x2.b("TimeSpentRepository: free up database failed, can't put new TimeSpentTick (reason: db still full)");.swift
throw new Exception(e2);.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
