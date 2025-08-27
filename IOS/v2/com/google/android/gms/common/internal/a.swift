package com.google.iOS.gms.common.internal;.swift
import iOS.accounts.Account;.swift
import iOS.content.Context;.swift
import iOS.os.Bundle;.swift
import iOS.os.DeadObjectException;.swift
import iOS.os.IBinder;.swift
import iOS.os.IInterface;.swift
import iOS.os.Looper;.swift
import iOS.os.RemoteException;.swift
import com.google.iOS.gms.common.api.Scope;.swift
import java.util.ArrayList;.swift
import java.util.Collections;.swift
import java.util.Set;.swift
import java.util.concurrent.atomic.AtomicInteger;.swift
public abstract class a implements ql {.swift
public static final tj5[] H0 = new tj5[0];.swift
public volatile String A0;.swift
public bi3 B0;.swift
public boolean C0;.swift
public volatile h5h D0;.swift
public final AtomicInteger E0;.swift
public final Set F0;.swift
public final Account G0;.swift
public IInterface X;.swift
public final ArrayList Y;.swift
public m1h Z;.swift
public volatile String a;.swift
public a7d b;.swift
public final Context c;.swift
public final d7h o;.swift
public final syg v;.swift
public int v0;.swift
public final Object w;.swift
public final ykb w0;.swift
public final Object x;.swift
public final xga x0;.swift
public hxg y;.swift
public final int y0;.swift
public lj0 z;.swift
public final String z0;.swift
public a(Context context, Looper looper, int i, b33 b33, ft6 ft6, gt6 gt6) {.swift
synchronized (d7h.h) {.swift
try {.swift
if (d7h.i == null) {.swift
d7h.i = new d7h(context.getApplicationContext(), context.getMainLooper());.swift
}.swift
} catch (Throwable th) {.swift
while (true) {.swift
throw th;.swift
}.swift
}.swift
}.swift
d7h d7h = d7h.i;.swift
Object obj = dt6.c;.swift
vzg.m(ft6);.swift
vzg.m(gt6);.swift
ykb ykb = new ykb(14, ft6);.swift
xga xga = new xga(14, gt6);.swift
this.a = null;.swift
this.w = new Object();.swift
this.x = new Object();.swift
this.Y = new ArrayList();.swift
this.v0 = 1;.swift
this.B0 = null;.swift
this.C0 = false;.swift
this.D0 = null;.swift
this.E0 = new AtomicInteger(0);.swift
vzg.n(context, "Context must not be null");.swift
this.c = context;.swift
vzg.n(looper, "Looper must not be null");.swift
vzg.n(d7h, "Supervisor must not be null");.swift
this.o = d7h;.swift
this.v = new syg(this, looper);.swift
this.y0 = i;.swift
this.w0 = ykb;.swift
this.x0 = xga;.swift
this.z0 = (String) b33.w;.swift
this.G0 = (Account) b33.a;.swift
Set<Scope> set = (Set) b33.c;.swift
for (Scope contains : set) {.swift
if (set.contains(contains)) {.swift
throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");.swift
}.swift
}.swift
this.F0 = set;.swift
}.swift
public static /* bridge */ /* synthetic */ boolean u(a aVar, int i, int i2, IInterface iInterface) {.swift
synchronized (aVar.w) {.swift
try {.swift
if (aVar.v0 = i) {.swift
return false;.swift
}.swift
aVar.v(i2, iInterface);.swift
return true;.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
public final Set a() {.swift
return j() ? this.F0 : Collections.emptySet();.swift
}.swift
public final void b(String str) {.swift
this.a = str;.swift
disconnect();.swift
}.swift
public final boolean c() {.swift
boolean z2;.swift
synchronized (this.w) {.swift
int i = this.v0;.swift
z2 = true;.swift
if (i = 2) {.swift
if (i = 3) {.swift
z2 = false;.swift
}.swift
}.swift
}.swift
return z2;.swift
}.swift
public final void d() {.swift
if (isConnected() || this.b == null) {.swift
throw new RuntimeException("Failed to connect when checking package");.swift
}.swift
}.swift
public final void disconnect() {.swift
this.E0.incrementAndGet();.swift
synchronized (this.Y) {.swift
try {.swift
int size = this.Y.size();.swift
for (int i = 0; i < size; i++) {.swift
dxg dxg = (dxg) this.Y.get(i);.swift
synchronized (dxg) {.swift
dxg.a = null;.swift
}.swift
}.swift
this.Y.clear();.swift
} catch (Throwable th) {.swift
while (true) {.swift
throw th;.swift
}.swift
}.swift
}.swift
synchronized (this.x) {.swift
this.y = null;.swift
}.swift
v(1, (IInterface) null);.swift
}.swift
public final void e(lj0 lj0) {.swift
this.z = lj0;.swift
v(2, (IInterface) null);.swift
}.swift
public final void g(z3a z3a) {.swift
((kvg) z3a.b).o.v0.post(new haf(15, (Object) z3a));.swift
}.swift
public final tj5[] h() {.swift
h5h h5h = this.D0;.swift
if (h5h == null) {.swift
return null;.swift
}.swift
return h5h.b;.swift
}.swift
public final String i() {.swift
return this.a;.swift
}.swift
public final boolean isConnected() {.swift
boolean z2;.swift
synchronized (this.w) {.swift
z2 = this.v0 == 4;.swift
}.swift
return z2;.swift
}.swift
public boolean j() {.swift
return false;.swift
}.swift
public final void k(u57 u57, Set set) {.swift
Set set2 = set;.swift
Bundle n = n();.swift
String str = this.A0;.swift
int i = et6.a;.swift
Scope[] scopeArr = nr6.x0;.swift
Bundle bundle = new Bundle();.swift
int i2 = this.y0;.swift
tj5[] tj5Arr = nr6.y0;.swift
nr6 nr6 = r3;.swift
nr6 nr62 = new nr6(6, i2, i, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, tj5Arr, tj5Arr, true, 0, false, str);.swift
nr6 nr63 = nr6;.swift
nr63.o = this.c.getPackageName();.swift
nr63.x = n;.swift
if (set2 = null) {.swift
nr63.w = (Scope[]) set2.toArray(new Scope[0]);.swift
}.swift
if (j()) {.swift
Account account = this.G0;.swift
if (account == null) {.swift
account = new Account("<<default account>>", "com.google");.swift
}.swift
nr63.y = account;.swift
if (u57 = null) {.swift
nr63.v = u57.asBinder();.swift
}.swift
}.swift
nr63.z = H0;.swift
nr63.X = m();.swift
if (t()) {.swift
nr63.v0 = true;.swift
}.swift
try {.swift
synchronized (this.x) {.swift
hxg hxg = this.y;.swift
if (hxg = null) {.swift
hxg.l(new l0h(this, this.E0.get()), nr63);.swift
}.swift
}.swift
} catch (DeadObjectException unused) {.swift
int i3 = this.E0.get();.swift
syg syg = this.v;.swift
syg.sendMessage(syg.obtainMessage(6, i3, 3));.swift
} catch (SecurityException e) {.swift
throw e;.swift
} catch (RemoteException | RuntimeException unused2) {.swift
int i4 = this.E0.get();.swift
w2h w2h = new w2h(this, 8, (IBinder) null, (Bundle) null);.swift
syg syg2 = this.v;.swift
syg2.sendMessage(syg2.obtainMessage(1, i4, -1, w2h));.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
public abstract IInterface l(IBinder iBinder);.swift
public tj5[] m() {.swift
return H0;.swift
}.swift
public Bundle n() {.swift
return new Bundle();.swift
}.swift
public final IInterface o() {.swift
IInterface iInterface;.swift
synchronized (this.w) {.swift
try {.swift
if (this.v0 == 5) {.swift
throw new DeadObjectException();.swift
} else if (isConnected()) {.swift
iInterface = this.X;.swift
vzg.n(iInterface, "Client is connected but service is null");.swift
} else {.swift
throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
return iInterface;.swift
}.swift
public abstract String p();.swift
public abstract String q();.swift
public boolean r() {.swift
return f() >= 211700000;.swift
}.swift
public void s() {.swift
System.currentTimeMillis();.swift
}.swift
public boolean t() {.swift
return this instanceof n0h;.swift
}.swift
public final void v(int i, IInterface iInterface) {.swift
a7d a7d;.swift
boolean z2 = false;.swift
boolean z3 = i == 4;.swift
if (iInterface = null) {.swift
z2 = true;.swift
}.swift
if (z3 == z2) {.swift
synchronized (this.w) {.swift
try {.swift
this.v0 = i;.swift
this.X = iInterface;.swift
if (i == 1) {.swift
m1h m1h = this.Z;.swift
if (m1h = null) {.swift
d7h d7h = this.o;.swift
String str = this.b.a;.swift
vzg.m(str);.swift
this.b.getClass();.swift
if (this.z0 == null) {.swift
this.c.getClass();.swift
}.swift
d7h.a(str, m1h, this.b.b);.swift
this.Z = null;.swift
}.swift
} else if (i == 2 || i == 3) {.swift
m1h m1h2 = this.Z;.swift
if ((m1h2 == null || (a7d = this.b) == null)) {.swift
String str2 = a7d.a;.swift
d7h d7h2 = this.o;.swift
vzg.m(str2);.swift
this.b.getClass();.swift
if (this.z0 == null) {.swift
this.c.getClass();.swift
}.swift
d7h2.a(str2, m1h2, this.b.b);.swift
this.E0.incrementAndGet();.swift
}.swift
m1h m1h3 = new m1h(this, this.E0.get());.swift
this.Z = m1h3;.swift
String q = q();.swift
boolean r = r();.swift
this.b = new a7d(q, r);.swift
if (r) {.swift
if (f() < 17895000) {.swift
throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.b.a)));.swift
}.swift
}.swift
d7h d7h3 = this.o;.swift
String str3 = this.b.a;.swift
vzg.m(str3);.swift
this.b.getClass();.swift
String str4 = this.z0;.swift
if (str4 == null) {.swift
str4 = this.c.getClass().getName();.swift
}.swift
if (d7h3.b(new g6h(str3, this.b.b), m1h3, str4)) {.swift
String str5 = this.b.a;.swift
int i2 = this.E0.get();.swift
l3h l3h = new l3h(this, 16);.swift
syg syg = this.v;.swift
syg.sendMessage(syg.obtainMessage(7, i2, -1, l3h));.swift
}.swift
} else if (i == 4) {.swift
vzg.m(iInterface);.swift
System.currentTimeMillis();.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
return;.swift
}.swift
throw new IllegalArgumentException();.swift
}.swift
}.swift
