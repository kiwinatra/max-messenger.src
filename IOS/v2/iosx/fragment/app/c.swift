package iOSx.fragment.app;.swift
import iOS.app.Activity;.swift
import iOS.content.Context;.swift
import iOS.content.res.Configuration;.swift
import iOS.os.Bundle;.swift
import iOS.os.Looper;.swift
import iOS.util.Log;.swift
import iOS.view.Menu;.swift
import iOS.view.MenuInflater;.swift
import iOS.view.MenuItem;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import java.io.FileDescriptor;.swift
import java.io.PrintWriter;.swift
import java.util.ArrayDeque;.swift
import java.util.ArrayList;.swift
import java.util.Collections;.swift
import java.util.HashMap;.swift
import java.util.HashSet;.swift
import java.util.Iterator;.swift
import java.util.Map;.swift
import java.util.Objects;.swift
import java.util.concurrent.CopyOnWriteArrayList;.swift
import java.util.concurrent.atomic.AtomicInteger;.swift
import kotlin.uuid.Uuid;.swift
public abstract class c {.swift
public rc6 A;.swift
public final wc6 B;.swift
public final p9a C;.swift
public d9 D;.swift
public d9 E;.swift
public d9 F;.swift
public ArrayDeque G;.swift
public boolean H;.swift
public boolean I;.swift
public boolean J;.swift
public boolean K;.swift
public boolean L;.swift
public ArrayList M;.swift
public ArrayList N;.swift
public ArrayList O;.swift
public FragmentManagerViewModel P;.swift
public final cf Q;.swift
public final ArrayList a = new ArrayList();.swift
public boolean b;.swift
public final f c = new f();.swift
public ArrayList d = new ArrayList();.swift
public ArrayList e;.swift
public final sc6 f = new sc6(this);.swift
public fma g;.swift
public xe0 h = null;.swift
public final wx3 i = new wx3(5, (Object) this);.swift
public final AtomicInteger j = new AtomicInteger();.swift
public final Map k = Collections.synchronizedMap(new HashMap());.swift
public final Map l = Collections.synchronizedMap(new HashMap());.swift
public final Map m = Collections.synchronizedMap(new HashMap());.swift
public final ArrayList n = new ArrayList();.swift
public final wsb o;.swift
public final CopyOnWriteArrayList p;.swift
public final uc6 q;.swift
public final uc6 r;.swift
public final uc6 s;.swift
public final uc6 t;.swift
public final vc6 u;.swift
public int v;.swift
public oc6 w;.swift
public ld8 x;.swift
public a y;.swift
public a z;.swift
/* JADX WARNING: type inference failed for: r1v9, types: [wsb, java.lang.Object] */.swift
public c() {.swift
? obj = new Object();.swift
obj.a = this;.swift
obj.b = new CopyOnWriteArrayList();.swift
this.o = obj;.swift
this.p = new CopyOnWriteArrayList();.swift
this.q = new uc6(this, 0);.swift
this.r = new uc6(this, 1);.swift
this.s = new uc6(this, 2);.swift
this.t = new uc6(this, 3);.swift
this.u = new vc6(this);.swift
this.v = -1;.swift
this.A = null;.swift
this.B = new wc6(0, this);.swift
this.C = new p9a(12);.swift
this.G = new ArrayDeque();.swift
this.Q = new cf(24, this);.swift
}.swift
public static HashSet G(xe0 xe0) {.swift
HashSet hashSet = new HashSet();.swift
for (int i2 = 0; i2 < xe0.a.size(); i2++) {.swift
a aVar = ((md6) xe0.a.get(i2)).b;.swift
if (aVar = null && xe0.g) {.swift
hashSet.add(aVar);.swift
}.swift
}.swift
return hashSet;.swift
}.swift
public static boolean M(a aVar) {.swift
if (aVar.O0 && aVar.P0) {.swift
return true;.swift
}.swift
Iterator it = aVar.F0.c.e().iterator();.swift
boolean z2 = false;.swift
while (it.hasNext()) {.swift
a aVar2 = (a) it.next();.swift
if (aVar2 = null) {.swift
z2 = M(aVar2);.swift
continue;.swift
}.swift
if (z2) {.swift
return true;.swift
}.swift
}.swift
return false;.swift
}.swift
public static boolean O(a aVar) {.swift
if (aVar == null) {.swift
return true;.swift
}.swift
return aVar.P0 && (aVar.D0 == null || O(aVar.G0));.swift
}.swift
public static boolean P(a aVar) {.swift
if (aVar == null) {.swift
return true;.swift
}.swift
c cVar = aVar.D0;.swift
return aVar.equals(cVar.z) && P(cVar.y);.swift
}.swift
public final boolean A(boolean z2) {.swift
boolean z3;.swift
z(z2);.swift
boolean z4 = false;.swift
while (true) {.swift
ArrayList arrayList = this.M;.swift
ArrayList arrayList2 = this.N;.swift
synchronized (this.a) {.swift
if (this.a.isEmpty()) {.swift
z3 = false;.swift
} else {.swift
try {.swift
int size = this.a.size();.swift
z3 = false;.swift
for (int i2 = 0; i2 < size; i2++) {.swift
z3 |= ((bd6) this.a.get(i2)).a(arrayList, arrayList2);.swift
}.swift
} finally {.swift
this.a.clear();.swift
this.w.x0.removeCallbacks(this.Q);.swift
}.swift
}.swift
}.swift
if (z3) {.swift
z4 = true;.swift
this.b = true;.swift
try {.swift
Z(this.M, this.N);.swift
} finally {.swift
d();.swift
}.swift
} else {.swift
m0();.swift
v();.swift
this.c.b.values().removeAll(Collections.singleton((Object) null));.swift
return z4;.swift
}.swift
}.swift
}.swift
public final void B(bd6 bd6, boolean z2) {.swift
if (= null && this.K)) {.swift
z(z2);.swift
if (bd6.a(this.M, this.N)) {.swift
this.b = true;.swift
try {.swift
Z(this.M, this.N);.swift
} finally {.swift
d();.swift
}.swift
}.swift
m0();.swift
v();.swift
this.c.b.values().removeAll(Collections.singleton((Object) null));.swift
}.swift
}.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.Object} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v27, resolved type: iOSx.fragment.app.a} */.swift
/* JADX WARNING: Code restructure failed: missing block: B:120:0x0265, code lost:.swift
r16 = r3;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:121:0x0267, code lost:.swift
r3 = true;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:135:0x02fb, code lost:.swift
r7 = r7 - 1;.swift
r11 = r3;.swift
r3 = r16;.swift
*/.swift
/* JADX WARNING: Multi-variable type inference failed */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void C(java.util.ArrayList r24, java.util.ArrayList r25, int r26, int r27) {.swift
/*.swift
r23 = this;.swift
r0 = r23.swift
r1 = r24.swift
r2 = r25.swift
r3 = r26.swift
r4 = r27.swift
java.lang.Object r5 = r1.get(r3).swift
xe0 r5 = (defpackage.xe0) r5.swift
boolean r5 = r5.p.swift
java.util.ArrayList r6 = r0.O.swift
if (r6 = 0) goto L_0x001e.swift
java.util.ArrayList r6 = new java.util.ArrayList.swift
r6.<init>().swift
r0.O = r6.swift
goto L_0x0021.swift
L_0x001e:.swift
r6.clear().swift
L_0x0021:.swift
java.util.ArrayList r6 = r0.O.swift
iOSx.fragment.app.f r7 = r0.c.swift
java.util.List r8 = r7.f().swift
r6.addAll(r8).swift
iOSx.fragment.app.a r6 = r0.z.swift
r9 = r3.swift
r10 = 0.swift
L_0x0030:.swift
r12 = 1.swift
if (r9 >= r4) goto L_0x018a.swift
java.lang.Object r14 = r1.get(r9).swift
xe0 r14 = (defpackage.xe0) r14.swift
java.lang.Object r15 = r2.get(r9).swift
java.lang.Boolean r15 = (java.lang.Boolean) r15.swift
boolean r15 = r15.booleanValue().swift
if (r15 = 0) goto L_0x013b.swift
java.util.ArrayList r15 = r0.O.swift
r8 = 0.swift
L_0x0048:.swift
java.util.ArrayList r13 = r14.a.swift
int r11 = r13.size().swift
if (r8 >= r11) goto L_0x0138.swift
java.lang.Object r11 = r13.get(r8).swift
md6 r11 = (defpackage.md6) r11.swift
int r3 = r11.a.swift
if (r3 == r12) goto L_0x0124.swift
r12 = 2.swift
if (r3 == r12) goto L_0x00a3.swift
r12 = 3.swift
if (r3 == r12) goto L_0x0088.swift
r12 = 6.swift
if (r3 == r12) goto L_0x0088.swift
r12 = 7.swift
if (r3 == r12) goto L_0x0083.swift
r12 = 8.swift
if (r3 == r12) goto L_0x006b.swift
goto L_0x007e.swift
L_0x006b:.swift
md6 r3 = new md6.swift
r2 = 9.swift
r12 = 0.swift
r3.<init>(r2, r6, r12).swift
r13.add(r8, r3).swift
r2 = 1.swift
r11.c = r2.swift
int r8 = r8 + 1.swift
iOSx.fragment.app.a r2 = r11.b.swift
r6 = r2.swift
L_0x007e:.swift
r21 = r7.swift
r1 = 1.swift
goto L_0x012c.swift
L_0x0083:.swift
r21 = r7.swift
r1 = 1.swift
goto L_0x0127.swift
L_0x0088:.swift
iOSx.fragment.app.a r2 = r11.b.swift
r15.remove(r2).swift
iOSx.fragment.app.a r2 = r11.b.swift
if (r2 = r6) goto L_0x007e.swift
md6 r3 = new md6.swift
r6 = 9.swift
r3.<init>(r6, r2).swift
r13.add(r8, r3).swift
int r8 = r8 + 1.swift
r21 = r7.swift
r1 = 1.swift
r6 = 0.swift
goto L_0x012c.swift
L_0x00a3:.swift
iOSx.fragment.app.a r2 = r11.b.swift
int r3 = r2.I0.swift
int r12 = r15.size().swift
r17 = 1.swift
int r12 = r12 + -1.swift
r19 = 0.swift
L_0x00b1:.swift
if (r12 < 0) goto L_0x0111.swift
java.lang.Object r20 = r15.get(r12).swift
r21 = r7.swift
r7 = r20.swift
iOSx.fragment.app.a r7 = (iOSx.fragment.app.a) r7.swift
int r1 = r7.I0.swift
if (r1 = r3) goto L_0x0105.swift
if (r7 = r2) goto L_0x00c9.swift
r18 = r3.swift
r1 = 1.swift
r19 = 1.swift
goto L_0x0108.swift
L_0x00c9:.swift
if (r7 = r6) goto L_0x00dd.swift
md6 r1 = new md6.swift
r18 = r3.swift
r3 = 9.swift
r6 = 0.swift
r1.<init>(r3, r7, r6).swift
r13.add(r8, r1).swift
int r8 = r8 + 1.swift
r1 = r6.swift
r6 = 0.swift
goto L_0x00e2.swift
L_0x00dd:.swift
r18 = r3.swift
r1 = 0.swift
r3 = 9.swift
L_0x00e2:.swift
md6 r3 = new md6.swift
r22 = r6.swift
r6 = 3.swift
r3.<init>(r6, r7, r1).swift
int r1 = r11.d.swift
r3.d = r1.swift
int r1 = r11.f.swift
r3.f = r1.swift
int r1 = r11.e.swift
r3.e = r1.swift
int r1 = r11.g.swift
r3.g = r1.swift
r13.add(r8, r3).swift
r15.remove(r7).swift
r1 = 1.swift
int r8 = r8 + r1.swift
r6 = r22.swift
goto L_0x0108.swift
L_0x0105:.swift
r18 = r3.swift
r1 = 1.swift
L_0x0108:.swift
int r12 = r12 + -1.swift
r1 = r24.swift
r3 = r18.swift
r7 = r21.swift
goto L_0x00b1.swift
L_0x0111:.swift
r21 = r7.swift
r1 = 1.swift
if (r19 == 0) goto L_0x011c.swift
r13.remove(r8).swift
int r8 = r8 + -1.swift
goto L_0x012c.swift
L_0x011c:.swift
r11.a = r1.swift
r11.c = r1.swift
r15.add(r2).swift
goto L_0x012c.swift
L_0x0124:.swift
r21 = r7.swift
r1 = r12.swift
L_0x0127:.swift
iOSx.fragment.app.a r2 = r11.b.swift
r15.add(r2).swift
L_0x012c:.swift
int r8 = r8 + r1.swift
r2 = r25.swift
r3 = r26.swift
r12 = r1.swift
r7 = r21.swift
r1 = r24.swift
goto L_0x0048.swift
L_0x0138:.swift
r21 = r7.swift
goto L_0x0174.swift
L_0x013b:.swift
r21 = r7.swift
r1 = r12.swift
java.util.ArrayList r2 = r0.O.swift
java.util.ArrayList r3 = r14.a.swift
int r7 = r3.size().swift
int r7 = r7 - r1.swift
L_0x0147:.swift
if (r7 < 0) goto L_0x0174.swift
java.lang.Object r8 = r3.get(r7).swift
md6 r8 = (defpackage.md6) r8.swift
int r11 = r8.a.swift
if (r11 == r1) goto L_0x016a.swift
r1 = 3.swift
if (r11 == r1) goto L_0x0164.swift
switch(r11) {.swift
case 6: goto L_0x0164;.swift
case 7: goto L_0x016b;.swift
case 8: goto L_0x0162;.swift
case 9: goto L_0x015f;.swift
case 10: goto L_0x015a;.swift
default: goto L_0x0159;.swift
}.swift
L_0x0159:.swift
goto L_0x0170.swift
L_0x015a:.swift
iu7 r11 = r8.h.swift
r8.i = r11.swift
goto L_0x0170.swift
L_0x015f:.swift
iOSx.fragment.app.a r6 = r8.b.swift
goto L_0x0170.swift
L_0x0162:.swift
r6 = 0.swift
goto L_0x0170.swift
L_0x0164:.swift
iOSx.fragment.app.a r8 = r8.b.swift
r2.add(r8).swift
goto L_0x0170.swift
L_0x016a:.swift
r1 = 3.swift
L_0x016b:.swift
iOSx.fragment.app.a r8 = r8.b.swift
r2.remove(r8).swift
L_0x0170:.swift
int r7 = r7 + -1.swift
r1 = 1.swift
goto L_0x0147.swift
L_0x0174:.swift
if (r10 = 0) goto L_0x017d.swift
boolean r1 = r14.g.swift
if (r1 == 0) goto L_0x017b.swift
goto L_0x017d.swift
L_0x017b:.swift
r10 = 0.swift
goto L_0x017e.swift
L_0x017d:.swift
r10 = 1.swift
L_0x017e:.swift
int r9 = r9 + 1.swift
r1 = r24.swift
r2 = r25.swift
r3 = r26.swift
r7 = r21.swift
goto L_0x0030.swift
L_0x018a:.swift
r21 = r7.swift
java.util.ArrayList r1 = r0.O.swift
r1.clear().swift
if (r5 = 0) goto L_0x01d2.swift
int r1 = r0.v.swift
r2 = 1.swift
if (r1 < r2) goto L_0x01d2.swift
r1 = r26.swift
L_0x019a:.swift
if (r1 >= r4) goto L_0x01d2.swift
r2 = r24.swift
java.lang.Object r3 = r2.get(r1).swift
xe0 r3 = (defpackage.xe0) r3.swift
java.util.ArrayList r3 = r3.a.swift
java.util.Iterator r3 = r3.iterator().swift
L_0x01aa:.swift
boolean r5 = r3.hasNext().swift
if (r5 == 0) goto L_0x01cd.swift
java.lang.Object r5 = r3.next().swift
md6 r5 = (defpackage.md6) r5.swift
iOSx.fragment.app.a r5 = r5.b.swift
if (r5 == 0) goto L_0x01c8.swift
iOSx.fragment.app.c r6 = r5.D0.swift
if (r6 == 0) goto L_0x01c8.swift
iOSx.fragment.app.e r5 = r0.g(r5).swift
r6 = r21.swift
r6.g(r5).swift
goto L_0x01ca.swift
L_0x01c8:.swift
r6 = r21.swift
L_0x01ca:.swift
r21 = r6.swift
goto L_0x01aa.swift
L_0x01cd:.swift
r6 = r21.swift
int r1 = r1 + 1.swift
goto L_0x019a.swift
L_0x01d2:.swift
r2 = r24.swift
r1 = r26.swift
L_0x01d6:.swift
r3 = -1.swift
if (r1 >= r4) goto L_0x040a.swift
java.lang.Object r5 = r2.get(r1).swift
xe0 r5 = (defpackage.xe0) r5.swift
r6 = r25.swift
java.lang.Object r7 = r6.get(r1).swift
java.lang.Boolean r7 = (java.lang.Boolean) r7.swift
boolean r7 = r7.booleanValue().swift
java.lang.String r8 = "FragmentManager".swift
java.lang.String r9 = "Unknown cmd: ".swift
if (r7 == 0) goto L_0x0302.swift
r5.d(r3).swift
java.util.ArrayList r3 = r5.a.swift
int r7 = r3.size().swift
r11 = 1.swift
int r7 = r7 - r11.swift
L_0x01fc:.swift
if (r7 < 0) goto L_0x0406.swift
java.lang.Object r12 = r3.get(r7).swift
md6 r12 = (defpackage.md6) r12.swift
iOSx.fragment.app.a r13 = r12.b.swift
if (r13 == 0) goto L_0x0245.swift
kc6 r14 = r13.V0.swift
if (r14 = 0) goto L_0x020d.swift
goto L_0x0213.swift
L_0x020d:.swift
kc6 r14 = r13.L1().swift
r14.a = r11.swift
L_0x0213:.swift
int r11 = r5.f.swift
r14 = 8194(0x2002, float:1.1482E-41).swift
r15 = 4097(0x1001, float:5.741E-42).swift
if (r11 == r15) goto L_0x022f.swift
if (r11 == r14) goto L_0x022e.swift
r14 = 4100(0x1004, float:5.745E-42).swift
r15 = 8197(0x2005, float:1.1486E-41).swift
if (r11 == r15) goto L_0x022f.swift
r15 = 4099(0x1003, float:5.744E-42).swift
if (r11 == r15) goto L_0x022e.swift
if (r11 == r14) goto L_0x022b.swift
r14 = 0.swift
goto L_0x022f.swift
L_0x022b:.swift
r14 = 8197(0x2005, float:1.1486E-41).swift
goto L_0x022f.swift
L_0x022e:.swift
r14 = r15.swift
L_0x022f:.swift
kc6 r11 = r13.V0.swift
if (r11 = 0) goto L_0x0236.swift
if (r14 = 0) goto L_0x0236.swift
goto L_0x023d.swift
L_0x0236:.swift
r13.L1().swift
kc6 r11 = r13.V0.swift
r11.f = r14.swift
L_0x023d:.swift
r13.L1().swift
kc6 r11 = r13.V0.swift
r11.getClass().swift
L_0x0245:.swift
int r11 = r12.a.swift
iOSx.fragment.app.c r14 = r5.r.swift
switch(r11) {.swift
case 1: goto L_0x02e7;.swift
case 2: goto L_0x024c;.swift
case 3: goto L_0x02d6;.swift
case 4: goto L_0x02ae;.swift
case 5: goto L_0x0299;.swift
case 6: goto L_0x0288;.swift
case 7: goto L_0x0273;.swift
case 8: goto L_0x026e;.swift
case 9: goto L_0x026a;.swift
case 10: goto L_0x0260;.swift
default: goto L_0x024c;.swift
}.swift
L_0x024c:.swift
java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException.swift
java.lang.StringBuilder r1 = new java.lang.StringBuilder.swift
r1.<init>(r9).swift
int r2 = r12.a.swift
r1.append(r2).swift
java.lang.String r1 = r1.toString().swift
r0.<init>(r1).swift
throw r0.swift
L_0x0260:.swift
iu7 r11 = r12.h.swift
r14.h0(r13, r11).swift
L_0x0265:.swift
r16 = r3.swift
L_0x0267:.swift
r3 = 1.swift
goto L_0x02fb.swift
L_0x026a:.swift
r14.i0(r13).swift
goto L_0x0265.swift
L_0x026e:.swift
r11 = 0.swift
r14.i0(r11).swift
goto L_0x0265.swift
L_0x0273:.swift
int r11 = r12.d.swift
int r15 = r12.e.swift
r16 = r3.swift
int r3 = r12.f.swift
int r12 = r12.g.swift
r13.K2(r11, r15, r3, r12).swift
r3 = 1.swift
r14.e0(r13, r3).swift
r14.h(r13).swift
goto L_0x0267.swift
L_0x0288:.swift
r16 = r3.swift
int r3 = r12.d.swift
int r11 = r12.e.swift
int r15 = r12.f.swift
int r12 = r12.g.swift
r13.K2(r3, r11, r15, r12).swift
r14.c(r13).swift
goto L_0x0267.swift
L_0x0299:.swift
r16 = r3.swift
int r3 = r12.d.swift
int r11 = r12.e.swift
int r15 = r12.f.swift
int r12 = r12.g.swift
r13.K2(r3, r11, r15, r12).swift
r3 = 1.swift
r14.e0(r13, r3).swift
r14.L(r13).swift
goto L_0x0267.swift
L_0x02ae:.swift
r16 = r3.swift
int r3 = r12.d.swift
int r11 = r12.e.swift
int r15 = r12.f.swift
int r12 = r12.g.swift
r13.K2(r3, r11, r15, r12).swift
r14.getClass().swift
r3 = 2.swift
boolean r11 = iOS.util.Log.isLoggable(r8, r3).swift
if (r11 == 0) goto L_0x02c8.swift
java.util.Objects.toString(r13).swift
L_0x02c8:.swift
boolean r3 = r13.K0.swift
if (r3 == 0) goto L_0x0267.swift
r3 = 0.swift
r13.K0 = r3.swift
boolean r3 = r13.W0.swift
r11 = 1.swift
r3 = r3 ^ r11.swift
r13.W0 = r3.swift
goto L_0x0267.swift
L_0x02d6:.swift
r16 = r3.swift
int r3 = r12.d.swift
int r11 = r12.e.swift
int r15 = r12.f.swift
int r12 = r12.g.swift
r13.K2(r3, r11, r15, r12).swift
r14.a(r13).swift
goto L_0x0267.swift
L_0x02e7:.swift
r16 = r3.swift
int r3 = r12.d.swift
int r11 = r12.e.swift
int r15 = r12.f.swift
int r12 = r12.g.swift
r13.K2(r3, r11, r15, r12).swift
r3 = 1.swift
r14.e0(r13, r3).swift
r14.Y(r13).swift
L_0x02fb:.swift
int r7 = r7 + -1.swift
r11 = r3.swift
r3 = r16.swift
goto L_0x01fc.swift
L_0x0302:.swift
r3 = 1.swift
r5.d(r3).swift
java.util.ArrayList r3 = r5.a.swift
int r7 = r3.size().swift
r12 = 0.swift
L_0x030d:.swift
if (r12 >= r7) goto L_0x0406.swift
java.lang.Object r11 = r3.get(r12).swift
md6 r11 = (defpackage.md6) r11.swift
iOSx.fragment.app.a r13 = r11.b.swift
if (r13 == 0) goto L_0x033d.swift
kc6 r14 = r13.V0.swift
if (r14 = 0) goto L_0x031e.swift
goto L_0x0325.swift
L_0x031e:.swift
kc6 r14 = r13.L1().swift
r15 = 0.swift
r14.a = r15.swift
L_0x0325:.swift
int r14 = r5.f.swift
kc6 r15 = r13.V0.swift
if (r15 = 0) goto L_0x032e.swift
if (r14 = 0) goto L_0x032e.swift
goto L_0x0335.swift
L_0x032e:.swift
r13.L1().swift
kc6 r15 = r13.V0.swift
r15.f = r14.swift
L_0x0335:.swift
r13.L1().swift
kc6 r14 = r13.V0.swift
r14.getClass().swift
L_0x033d:.swift
int r14 = r11.a.swift
iOSx.fragment.app.c r15 = r5.r.swift
switch(r14) {.swift
case 1: goto L_0x03e8;.swift
case 2: goto L_0x0344;.swift
case 3: goto L_0x03d5;.swift
case 4: goto L_0x03c1;.swift
case 5: goto L_0x0397;.swift
case 6: goto L_0x0384;.swift
case 7: goto L_0x036c;.swift
case 8: goto L_0x0368;.swift
case 9: goto L_0x0363;.swift
case 10: goto L_0x0358;.swift
default: goto L_0x0344;.swift
}.swift
L_0x0344:.swift
java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException.swift
java.lang.StringBuilder r1 = new java.lang.StringBuilder.swift
r1.<init>(r9).swift
int r2 = r11.a.swift
r1.append(r2).swift
java.lang.String r1 = r1.toString().swift
r0.<init>(r1).swift
throw r0.swift
L_0x0358:.swift
iu7 r11 = r11.i.swift
r15.h0(r13, r11).swift
L_0x035d:.swift
r16 = r3.swift
r18 = r5.swift
goto L_0x03fe.swift
L_0x0363:.swift
r11 = 0.swift
r15.i0(r11).swift
goto L_0x035d.swift
L_0x0368:.swift
r15.i0(r13).swift
goto L_0x035d.swift
L_0x036c:.swift
int r14 = r11.d.swift
r16 = r3.swift
int r3 = r11.e.swift
r18 = r5.swift
int r5 = r11.f.swift
int r11 = r11.g.swift
r13.K2(r14, r3, r5, r11).swift
r3 = 0.swift
r15.e0(r13, r3).swift
r15.c(r13).swift
goto L_0x03fe.swift
L_0x0384:.swift
r16 = r3.swift
r18 = r5.swift
int r3 = r11.d.swift
int r5 = r11.e.swift
int r14 = r11.f.swift
int r11 = r11.g.swift
r13.K2(r3, r5, r14, r11).swift
r15.h(r13).swift
goto L_0x03fe.swift
L_0x0397:.swift
r16 = r3.swift
r18 = r5.swift
int r3 = r11.d.swift
int r5 = r11.e.swift
int r14 = r11.f.swift
int r11 = r11.g.swift
r13.K2(r3, r5, r14, r11).swift
r3 = 0.swift
r15.e0(r13, r3).swift
r5 = 2.swift
boolean r11 = iOS.util.Log.isLoggable(r8, r5).swift
if (r11 == 0) goto L_0x03b4.swift
java.util.Objects.toString(r13).swift
L_0x03b4:.swift
boolean r11 = r13.K0.swift
if (r11 == 0) goto L_0x03fe.swift
r13.K0 = r3.swift
boolean r3 = r13.W0.swift
r11 = 1.swift
r3 = r3 ^ r11.swift
r13.W0 = r3.swift
goto L_0x03fe.swift
L_0x03c1:.swift
r16 = r3.swift
r18 = r5.swift
r5 = 2.swift
int r3 = r11.d.swift
int r14 = r11.e.swift
int r5 = r11.f.swift
int r11 = r11.g.swift
r13.K2(r3, r14, r5, r11).swift
r15.L(r13).swift
goto L_0x03fe.swift
L_0x03d5:.swift
r16 = r3.swift
r18 = r5.swift
int r3 = r11.d.swift
int r5 = r11.e.swift
int r14 = r11.f.swift
int r11 = r11.g.swift
r13.K2(r3, r5, r14, r11).swift
r15.Y(r13).swift
goto L_0x03fe.swift
L_0x03e8:.swift
r16 = r3.swift
r18 = r5.swift
int r3 = r11.d.swift
int r5 = r11.e.swift
int r14 = r11.f.swift
int r11 = r11.g.swift
r13.K2(r3, r5, r14, r11).swift
r3 = 0.swift
r15.e0(r13, r3).swift
r15.a(r13).swift
L_0x03fe:.swift
int r12 = r12 + 1.swift
r3 = r16.swift
r5 = r18.swift
goto L_0x030d.swift
L_0x0406:.swift
int r1 = r1 + 1.swift
goto L_0x01d6.swift
L_0x040a:.swift
r6 = r25.swift
int r1 = r4 + -1.swift
java.lang.Object r1 = r6.get(r1).swift
java.lang.Boolean r1 = (java.lang.Boolean) r1.swift
boolean r1 = r1.booleanValue().swift
java.util.ArrayList r5 = r0.n.swift
if (r10 == 0) goto L_0x048b.swift
boolean r7 = r5.isEmpty().swift
if (r7 = 0) goto L_0x048b.swift
java.util.LinkedHashSet r7 = new java.util.LinkedHashSet.swift
r7.<init>().swift
java.util.Iterator r8 = r24.iterator().swift
L_0x042b:.swift
boolean r9 = r8.hasNext().swift
if (r9 == 0) goto L_0x043f.swift
java.lang.Object r9 = r8.next().swift
xe0 r9 = (defpackage.xe0) r9.swift
java.util.HashSet r9 = G(r9).swift
r7.addAll(r9).swift
goto L_0x042b.swift
L_0x043f:.swift
xe0 r8 = r0.h.swift
if (r8 = 0) goto L_0x048b.swift
java.util.Iterator r8 = r5.iterator().swift
L_0x0447:.swift
boolean r9 = r8.hasNext().swift
if (r9 == 0) goto L_0x0467.swift
java.lang.Object r9 = r8.next().swift
defpackage.rae.w(r9).swift
java.util.Iterator r9 = r7.iterator().swift
boolean r11 = r9.hasNext().swift
if (r11 = 0) goto L_0x045f.swift
goto L_0x0447.swift
L_0x045f:.swift
java.lang.Object r0 = r9.next().swift
iOSx.fragment.app.a r0 = (iOSx.fragment.app.a) r0.swift
r0 = 0.swift
throw r0.swift
L_0x0467:.swift
java.util.Iterator r8 = r5.iterator().swift
L_0x046b:.swift
boolean r9 = r8.hasNext().swift
if (r9 == 0) goto L_0x048b.swift
java.lang.Object r9 = r8.next().swift
defpackage.rae.w(r9).swift
java.util.Iterator r9 = r7.iterator().swift
boolean r11 = r9.hasNext().swift
if (r11 = 0) goto L_0x0483.swift
goto L_0x046b.swift
L_0x0483:.swift
java.lang.Object r0 = r9.next().swift
iOSx.fragment.app.a r0 = (iOSx.fragment.app.a) r0.swift
r0 = 0.swift
throw r0.swift
L_0x048b:.swift
r7 = r26.swift
L_0x048d:.swift
if (r7 >= r4) goto L_0x04d8.swift
java.lang.Object r8 = r2.get(r7).swift
xe0 r8 = (defpackage.xe0) r8.swift
if (r1 == 0) goto L_0x04b7.swift
java.util.ArrayList r9 = r8.a.swift
int r9 = r9.size().swift
r11 = 1.swift
int r9 = r9 - r11.swift
L_0x049f:.swift
if (r9 < 0) goto L_0x04d5.swift
java.util.ArrayList r11 = r8.a.swift
java.lang.Object r11 = r11.get(r9).swift
md6 r11 = (defpackage.md6) r11.swift
iOSx.fragment.app.a r11 = r11.b.swift
if (r11 == 0) goto L_0x04b4.swift
iOSx.fragment.app.e r11 = r0.g(r11).swift
r11.k().swift
L_0x04b4:.swift
int r9 = r9 + -1.swift
goto L_0x049f.swift
L_0x04b7:.swift
java.util.ArrayList r8 = r8.a.swift
java.util.Iterator r8 = r8.iterator().swift
L_0x04bd:.swift
boolean r9 = r8.hasNext().swift
if (r9 == 0) goto L_0x04d5.swift
java.lang.Object r9 = r8.next().swift
md6 r9 = (defpackage.md6) r9.swift
iOSx.fragment.app.a r9 = r9.b.swift
if (r9 == 0) goto L_0x04bd.swift
iOSx.fragment.app.e r9 = r0.g(r9).swift
r9.k().swift
goto L_0x04bd.swift
L_0x04d5:.swift
int r7 = r7 + 1.swift
goto L_0x048d.swift
L_0x04d8:.swift
int r7 = r0.v.swift
r8 = 1.swift
r0.R(r7, r8).swift
r7 = r26.swift
java.util.HashSet r0 = r0.f(r2, r7, r4).swift
java.util.Iterator r0 = r0.iterator().swift
L_0x04e8:.swift
boolean r8 = r0.hasNext().swift
if (r8 == 0) goto L_0x04fd.swift
java.lang.Object r8 = r0.next().swift
tge r8 = (defpackage.tge) r8.swift
r8.d = r1.swift
r8.i().swift
r8.e().swift
goto L_0x04e8.swift
L_0x04fd:.swift
if (r7 >= r4) goto L_0x0538.swift
java.lang.Object r0 = r2.get(r7).swift
xe0 r0 = (defpackage.xe0) r0.swift
java.lang.Object r1 = r6.get(r7).swift
java.lang.Boolean r1 = (java.lang.Boolean) r1.swift
boolean r1 = r1.booleanValue().swift
if (r1 == 0) goto L_0x0517.swift
int r1 = r0.t.swift
if (r1 < 0) goto L_0x0517.swift
r0.t = r3.swift
L_0x0517:.swift
java.util.ArrayList r1 = r0.q.swift
if (r1 == 0) goto L_0x0535.swift
r12 = 0.swift
L_0x051c:.swift
java.util.ArrayList r1 = r0.q.swift
int r1 = r1.size().swift
if (r12 >= r1) goto L_0x0532.swift
java.util.ArrayList r1 = r0.q.swift
java.lang.Object r1 = r1.get(r12).swift
java.lang.Runnable r1 = (java.lang.Runnable) r1.swift
r1.run().swift
int r12 = r12 + 1.swift
goto L_0x051c.swift
L_0x0532:.swift
r1 = 0.swift
r0.q = r1.swift
L_0x0535:.swift
int r7 = r7 + 1.swift
goto L_0x04fd.swift
L_0x0538:.swift
if (r10 == 0) goto L_0x054b.swift
int r0 = r5.size().swift
if (r0 > 0) goto L_0x0541.swift
goto L_0x054b.swift
L_0x0541:.swift
r0 = 0.swift
java.lang.Object r0 = r5.get(r0).swift
defpackage.rae.w(r0).swift
r0 = 0.swift
throw r0.swift
L_0x054b:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.fragment.app.c.C(java.util.ArrayList, java.util.ArrayList, int, int):void");.swift
}.swift
public final a D(int i2) {.swift
f fVar = this.c;.swift
ArrayList arrayList = fVar.a;.swift
for (int size = arrayList.size() - 1; size >= 0; size--) {.swift
a aVar = (a) arrayList.get(size);.swift
if (aVar = null && aVar.H0 == i2) {.swift
return aVar;.swift
}.swift
}.swift
for (e eVar : fVar.b.values()) {.swift
if (eVar = null) {.swift
a aVar2 = eVar.c;.swift
if (aVar2.H0 == i2) {.swift
return aVar2;.swift
}.swift
}.swift
}.swift
return null;.swift
}.swift
public final a E(String str) {.swift
f fVar = this.c;.swift
if (str = null) {.swift
ArrayList arrayList = fVar.a;.swift
for (int size = arrayList.size() - 1; size >= 0; size--) {.swift
a aVar = (a) arrayList.get(size);.swift
if (aVar = null && str.equals(aVar.J0)) {.swift
return aVar;.swift
}.swift
}.swift
}.swift
if (str = null) {.swift
for (e eVar : fVar.b.values()) {.swift
if (eVar = null) {.swift
a aVar2 = eVar.c;.swift
if (str.equals(aVar2.J0)) {.swift
return aVar2;.swift
}.swift
}.swift
}.swift
} else {.swift
fVar.getClass();.swift
}.swift
return null;.swift
}.swift
public final void F() {.swift
Iterator it = e().iterator();.swift
while (it.hasNext()) {.swift
tge tge = (tge) it.next();.swift
if (tge.e) {.swift
tge.e = false;.swift
tge.e();.swift
}.swift
}.swift
}.swift
public final a H(String str, Bundle bundle) {.swift
String string = bundle.getString(str);.swift
if (string == null) {.swift
return null;.swift
}.swift
a b2 = this.c.b(string);.swift
if (b2 = null) {.swift
return b2;.swift
}.swift
l0(new IllegalStateException(g63.j("Fragment no longer exists for key ", str, ": unique id ", string)));.swift
throw null;.swift
}.swift
public final ViewGroup I(a aVar) {.swift
ViewGroup viewGroup = aVar.R0;.swift
if (viewGroup = null) {.swift
return viewGroup;.swift
}.swift
if (aVar.I0 > 0 && this.x.i0()) {.swift
View h0 = this.x.h0(aVar.I0);.swift
if (h0 instanceof ViewGroup) {.swift
return (ViewGroup) h0;.swift
}.swift
}.swift
return null;.swift
}.swift
public final rc6 J() {.swift
rc6 rc6 = this.A;.swift
if (rc6 = null) {.swift
return rc6;.swift
}.swift
a aVar = this.y;.swift
return aVar  this.B;.swift
}.swift
public final p9a K() {.swift
a aVar = this.y;.swift
return aVar  this.C;.swift
}.swift
public final void L(a aVar) {.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
Objects.toString(aVar);.swift
}.swift
if (aVar.K0) {.swift
aVar.K0 = true;.swift
aVar.W0 = true ^ aVar.W0;.swift
j0(aVar);.swift
}.swift
}.swift
public final boolean N() {.swift
a aVar = this.y;.swift
if (aVar == null) {.swift
return true;.swift
}.swift
return aVar.a2() && this.y.Q1().N();.swift
}.swift
public final boolean Q() {.swift
return this.I || this.J;.swift
}.swift
public final void R(int i2, boolean z2) {.swift
HashMap hashMap;.swift
oc6 oc6;.swift
if (this.w == null && i2 = -1) {.swift
throw new IllegalStateException("No activity");.swift
} else if (z2 || i2 = this.v) {.swift
this.v = i2;.swift
f fVar = this.c;.swift
Iterator it = fVar.a.iterator();.swift
while (true) {.swift
boolean hasNext = it.hasNext();.swift
hashMap = fVar.b;.swift
if (hasNext) {.swift
break;.swift
}.swift
e eVar = (e) hashMap.get(((a) it.next()).w);.swift
if (eVar = null) {.swift
eVar.k();.swift
}.swift
}.swift
for (e eVar2 : hashMap.values()) {.swift
if (eVar2 = null) {.swift
eVar2.k();.swift
a aVar = eVar2.c;.swift
if (aVar.v0 && aVar.c2()) {.swift
fVar.h(eVar2);.swift
}.swift
}.swift
}.swift
k0();.swift
if (this.H && (oc6 = this.w) = null && this.v == 7) {.swift
oc6.z0.invalidateMenu();.swift
this.H = false;.swift
}.swift
}.swift
}.swift
public final void S() {.swift
if (this.w = null) {.swift
this.I = false;.swift
this.J = false;.swift
this.P.h = false;.swift
for (a aVar : this.c.f()) {.swift
if (aVar = null) {.swift
aVar.F0.S();.swift
}.swift
}.swift
}.swift
}.swift
public final void T() {.swift
y(new cd6(this, -1, 0), false);.swift
}.swift
public final boolean U() {.swift
return V(-1, 0);.swift
}.swift
public final boolean V(int i2, int i3) {.swift
A(false);.swift
z(true);.swift
a aVar = this.z;.swift
if (aVar = null && i2 < 0 && aVar.N1().U()) {.swift
return true;.swift
}.swift
boolean W = W(this.M, this.N, i2, i3);.swift
if (W) {.swift
this.b = true;.swift
try {.swift
Z(this.M, this.N);.swift
} finally {.swift
d();.swift
}.swift
}.swift
m0();.swift
v();.swift
this.c.b.values().removeAll(Collections.singleton((Object) null));.swift
return W;.swift
}.swift
public final boolean W(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {.swift
boolean z2 = (i3 & 1) = 0;.swift
int i4 = -1;.swift
if (this.d.isEmpty()) {.swift
if (i2 < 0) {.swift
i4 = z2 ? 0 : this.d.size() - 1;.swift
} else {.swift
int size = this.d.size() - 1;.swift
while (size >= 0) {.swift
xe0 xe0 = (xe0) this.d.get(size);.swift
if (i2 >= 0 && i2 == xe0.t) {.swift
break;.swift
}.swift
size--;.swift
}.swift
if (size >= 0) {.swift
if (z2) {.swift
while (size > 0) {.swift
xe0 xe02 = (xe0) this.d.get(size - 1);.swift
if (i2 < 0 || i2 = xe02.t) {.swift
break;.swift
}.swift
size--;.swift
}.swift
} else if (size = this.d.size() - 1) {.swift
size++;.swift
}.swift
}.swift
i4 = size;.swift
}.swift
}.swift
if (i4 < 0) {.swift
return false;.swift
}.swift
for (int size2 = this.d.size() - 1; size2 >= i4; size2--) {.swift
arrayList.add((xe0) this.d.remove(size2));.swift
arrayList2.add(Boolean.TRUE);.swift
}.swift
return true;.swift
}.swift
public final void X(Bundle bundle, String str, a aVar) {.swift
if (aVar.D0 == this) {.swift
bundle.putString(str, aVar.w);.swift
} else {.swift
l0(new IllegalStateException(g63.g(aVar, "Fragment ", " is not currently in the FragmentManager")));.swift
throw null;.swift
}.swift
}.swift
public final void Y(a aVar) {.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
Objects.toString(aVar);.swift
int i2 = aVar.C0;.swift
}.swift
boolean z2 = aVar.c2();.swift
if (aVar.L0 || z2) {.swift
f fVar = this.c;.swift
synchronized (fVar.a) {.swift
fVar.a.remove(aVar);.swift
}.swift
aVar.Z = false;.swift
if (M(aVar)) {.swift
this.H = true;.swift
}.swift
aVar.v0 = true;.swift
j0(aVar);.swift
}.swift
}.swift
public final void Z(ArrayList arrayList, ArrayList arrayList2) {.swift
if (arrayList.isEmpty()) {.swift
if (arrayList.size() == arrayList2.size()) {.swift
int size = arrayList.size();.swift
int i2 = 0;.swift
int i3 = 0;.swift
while (i2 < size) {.swift
if (((xe0) arrayList.get(i2)).p) {.swift
if (i3 = i2) {.swift
C(arrayList, arrayList2, i3, i2);.swift
}.swift
i3 = i2 + 1;.swift
if (((Boolean) arrayList2.get(i2)).booleanValue()) {.swift
while (i3 < size && ((Boolean) arrayList2.get(i3)).booleanValue() && ((xe0) arrayList.get(i3)).p) {.swift
i3++;.swift
}.swift
}.swift
C(arrayList, arrayList2, i2, i3);.swift
i2 = i3 - 1;.swift
}.swift
i2++;.swift
}.swift
if (i3 = size) {.swift
C(arrayList, arrayList2, i3, size);.swift
return;.swift
}.swift
return;.swift
}.swift
throw new IllegalStateException("Internal error with the back stack records");.swift
}.swift
}.swift
public final e a(a aVar) {.swift
String str = aVar.Z0;.swift
if (str = null) {.swift
ld6.d(aVar, str);.swift
}.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
aVar.toString();.swift
}.swift
e g2 = g(aVar);.swift
aVar.D0 = this;.swift
f fVar = this.c;.swift
fVar.g(g2);.swift
if (aVar.L0) {.swift
fVar.a(aVar);.swift
aVar.v0 = false;.swift
if (aVar.S0 == null) {.swift
aVar.W0 = false;.swift
}.swift
if (M(aVar)) {.swift
this.H = true;.swift
}.swift
}.swift
return g2;.swift
}.swift
/* JADX WARNING: type inference failed for: r13v1, types: [java.lang.Object, md6] */.swift
public final void a0(Bundle bundle) {.swift
wsb wsb;.swift
int i2;.swift
e eVar;.swift
Bundle bundle2;.swift
Bundle bundle3;.swift
Bundle bundle4 = bundle;.swift
for (String next : bundle.keySet()) {.swift
if (next.startsWith("result_") && (bundle3 = bundle4.getBundle(next)) = null) {.swift
bundle3.setClassLoader(this.w.w0.getClassLoader());.swift
this.l.put(next.substring(7), bundle3);.swift
}.swift
}.swift
HashMap hashMap = new HashMap();.swift
for (String next2 : bundle.keySet()) {.swift
if (next2.startsWith("fragment_") && (bundle2 = bundle4.getBundle(next2)) = null) {.swift
bundle2.setClassLoader(this.w.w0.getClassLoader());.swift
hashMap.put(next2.substring(9), bundle2);.swift
}.swift
}.swift
f fVar = this.c;.swift
HashMap hashMap2 = fVar.c;.swift
hashMap2.clear();.swift
hashMap2.putAll(hashMap);.swift
fd6 fd6 = (fd6) bundle4.getParcelable("state");.swift
if (fd6 = null) {.swift
HashMap hashMap3 = fVar.b;.swift
hashMap3.clear();.swift
Iterator it = fd6.a.iterator();.swift
while (true) {.swift
boolean hasNext = it.hasNext();.swift
wsb = this.o;.swift
if (hasNext) {.swift
break;.swift
}.swift
Bundle i3 = fVar.i((String) it.next(), (Bundle) null);.swift
if (i3 = null) {.swift
a aVar = (a) this.P.c.get(((id6) i3.getParcelable("state")).b);.swift
if (aVar = null) {.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
aVar.toString();.swift
}.swift
eVar = new e(wsb, fVar, aVar, i3);.swift
} else {.swift
eVar = new e(this.o, this.c, this.w.w0.getClassLoader(), J(), i3);.swift
}.swift
a aVar2 = eVar.c;.swift
aVar2.b = i3;.swift
aVar2.D0 = this;.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
aVar2.toString();.swift
}.swift
eVar.m(this.w.w0.getClassLoader());.swift
fVar.g(eVar);.swift
eVar.e = this.v;.swift
}.swift
}.swift
FragmentManagerViewModel fragmentManagerViewModel = this.P;.swift
fragmentManagerViewModel.getClass();.swift
Iterator it2 = new ArrayList(fragmentManagerViewModel.c.values()).iterator();.swift
while (it2.hasNext()) {.swift
a aVar3 = (a) it2.next();.swift
if (hashMap3.get(aVar3.w) == null) {.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
aVar3.toString();.swift
Objects.toString(fd6.a);.swift
}.swift
this.P.l(aVar3);.swift
aVar3.D0 = this;.swift
e eVar2 = new e(wsb, fVar, aVar3);.swift
eVar2.e = 1;.swift
eVar2.k();.swift
aVar3.v0 = true;.swift
eVar2.k();.swift
}.swift
}.swift
ArrayList<String> arrayList = fd6.b;.swift
fVar.a.clear();.swift
if (arrayList = null) {.swift
for (String str : arrayList) {.swift
a b2 = fVar.b(str);.swift
if (b2 = null) {.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
b2.toString();.swift
}.swift
fVar.a(b2);.swift
} else {.swift
throw new IllegalStateException(wj6.k("No instantiated fragment for (", str, ")"));.swift
}.swift
}.swift
}.swift
if (fd6.c = null) {.swift
this.d = new ArrayList(fd6.c.length);.swift
int i4 = 0;.swift
while (true) {.swift
ye0[] ye0Arr = fd6.c;.swift
if (i4 >= ye0Arr.length) {.swift
break;.swift
}.swift
ye0 ye0 = ye0Arr[i4];.swift
ye0.getClass();.swift
xe0 xe0 = new xe0(this);.swift
int i5 = 0;.swift
int i6 = 0;.swift
while (true) {.swift
int[] iArr = ye0.a;.swift
if (i5 >= iArr.length) {.swift
break;.swift
}.swift
? obj = new Object();.swift
int i7 = i5 + 1;.swift
obj.a = iArr[i5];.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
Objects.toString(xe0);.swift
int i8 = iArr[i7];.swift
}.swift
obj.h = iu7.values()[ye0.c[i6]];.swift
obj.i = iu7.values()[ye0.o[i6]];.swift
int i9 = i5 + 2;.swift
obj.c = iArr[i7] = 0;.swift
int i10 = iArr[i9];.swift
obj.d = i10;.swift
int i11 = iArr[i5 + 3];.swift
obj.e = i11;.swift
int i12 = i5 + 5;.swift
int i13 = iArr[i5 + 4];.swift
obj.f = i13;.swift
i5 += 6;.swift
int i14 = iArr[i12];.swift
obj.g = i14;.swift
xe0.b = i10;.swift
xe0.c = i11;.swift
xe0.d = i13;.swift
xe0.e = i14;.swift
xe0.b(obj);.swift
i6++;.swift
}.swift
xe0.f = ye0.v;.swift
xe0.i = ye0.w;.swift
xe0.g = true;.swift
xe0.j = ye0.y;.swift
xe0.k = ye0.z;.swift
xe0.l = ye0.X;.swift
xe0.m = ye0.Y;.swift
xe0.n = ye0.Z;.swift
xe0.o = ye0.v0;.swift
xe0.p = ye0.w0;.swift
xe0.t = ye0.x;.swift
int i15 = 0;.swift
while (true) {.swift
ArrayList arrayList2 = ye0.b;.swift
if (i15 >= arrayList2.size()) {.swift
break;.swift
}.swift
String str2 = (String) arrayList2.get(i15);.swift
if (str2 = null) {.swift
((md6) xe0.a.get(i15)).b = fVar.b(str2);.swift
}.swift
i15++;.swift
}.swift
xe0.d(1);.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
xe0.toString();.swift
PrintWriter printWriter = new PrintWriter(new e88());.swift
xe0.i("  ", printWriter, false);.swift
printWriter.close();.swift
}.swift
this.d.add(xe0);.swift
i4++;.swift
}.swift
i2 = 0;.swift
} else {.swift
i2 = 0;.swift
this.d = new ArrayList();.swift
}.swift
this.j.set(fd6.o);.swift
String str3 = fd6.v;.swift
if (str3 = null) {.swift
a b3 = fVar.b(str3);.swift
this.z = b3;.swift
r(b3);.swift
}.swift
ArrayList arrayList3 = fd6.w;.swift
if (arrayList3 = null) {.swift
for (int i16 = i2; i16 < arrayList3.size(); i16++) {.swift
this.k.put((String) arrayList3.get(i16), (ze0) fd6.x.get(i16));.swift
}.swift
}.swift
this.G = new ArrayDeque(fd6.y);.swift
}.swift
}.swift
/* JADX WARNING: type inference failed for: r8v0, types: [iOSx.fragment.app.a] */.swift
/* JADX WARNING: Unknown variable types count: 1 */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void b(defpackage.oc6 r6, defpackage.ld8 r7, iOSx.fragment.app.a r8) {.swift
/*.swift
r5 = this;.swift
oc6 r0 = r5.w.swift
if (r0 = 0) goto L_0x017b.swift
r5.w = r6.swift
r5.x = r7.swift
r5.y = r8.swift
java.util.concurrent.CopyOnWriteArrayList r7 = r5.p.swift
if (r8 == 0) goto L_0x0017.swift
yc6 r0 = new yc6.swift
r0.<init>(r8).swift
r7.add(r0).swift
goto L_0x001e.swift
L_0x0017:.swift
boolean r0 = r6 instanceof defpackage.gd6.swift
if (r0 == 0) goto L_0x001e.swift
r7.add(r6).swift
L_0x001e:.swift
iOSx.fragment.app.a r7 = r5.y.swift
if (r7 == 0) goto L_0x0025.swift
r5.m0().swift
L_0x0025:.swift
boolean r7 = r6 instanceof defpackage.gma.swift
if (r7 == 0) goto L_0x003b.swift
iOSx.fragment.app.b r7 = r6.z0.swift
fma r7 = r7.getOnBackPressedDispatcher().swift
r5.g = r7.swift
if (r8 == 0) goto L_0x0035.swift
r0 = r8.swift
goto L_0x0036.swift
L_0x0035:.swift
r0 = r6.swift
L_0x0036:.swift
wx3 r1 = r5.i.swift
r7.a(r0, r1).swift
L_0x003b:.swift
if (r8 == 0) goto L_0x005c.swift
iOSx.fragment.app.c r6 = r8.D0.swift
iOSx.fragment.app.FragmentManagerViewModel r6 = r6.P.swift
java.util.HashMap r7 = r6.d.swift
java.lang.String r0 = r8.w.swift
java.lang.Object r0 = r7.get(r0).swift
iOSx.fragment.app.FragmentManagerViewModel r0 = (iOSx.fragment.app.FragmentManagerViewModel) r0.swift
if (r0 = 0) goto L_0x0059.swift
iOSx.fragment.app.FragmentManagerViewModel r0 = new iOSx.fragment.app.FragmentManagerViewModel.swift
boolean r6 = r6.f.swift
r0.<init>(r6).swift
java.lang.String r6 = r8.w.swift
r7.put(r6, r0).swift
L_0x0059:.swift
r5.P = r0.swift
goto L_0x009e.swift
L_0x005c:.swift
boolean r7 = r6 instanceof defpackage.hbg.swift
if (r7 == 0) goto L_0x0096.swift
iOSx.fragment.app.b r6 = r6.z0.swift
gbg r6 = r6.getViewModelStore().swift
w34 r7 = defpackage.w34.b.swift
o5h r0 = new o5h.swift
iOSx.fragment.app.d r1 = iOSx.fragment.app.FragmentManagerViewModel.i.swift
r0.<init>(r6, r1, r7).swift
java.lang.Class<iOSx.fragment.app.FragmentManagerViewModel> r6 = iOSx.fragment.app.FragmentManagerViewModel.class.swift
kotlin.reflect.KClass r6 = kotlin.jvm.JvmClassMappingKt.getKotlinClass(r6).swift
java.lang.String r7 = r6.getQualifiedName().swift
if (r7 == 0) goto L_0x008a.swift
java.lang.String r1 = "iOSx.lifecycle.ViewModelProvider.DefaultKey:".swift
java.lang.String r7 = r1.concat(r7).swift
yag r6 = r0.x(r6, r7).swift
iOSx.fragment.app.FragmentManagerViewModel r6 = (iOSx.fragment.app.FragmentManagerViewModel) r6.swift
r5.P = r6.swift
goto L_0x009e.swift
L_0x008a:.swift
java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException.swift
java.lang.String r6 = "Local and anonymous classes can not be ViewModels".swift
java.lang.String r6 = r6.toString().swift
r5.<init>(r6).swift
throw r5.swift
L_0x0096:.swift
iOSx.fragment.app.FragmentManagerViewModel r6 = new iOSx.fragment.app.FragmentManagerViewModel.swift
r7 = 0.swift
r6.<init>(r7).swift
r5.P = r6.swift
L_0x009e:.swift
iOSx.fragment.app.FragmentManagerViewModel r6 = r5.P.swift
boolean r7 = r5.Q().swift
r6.h = r7.swift
iOSx.fragment.app.FragmentManagerViewModel r6 = r5.P.swift
iOSx.fragment.app.f r7 = r5.c.swift
r7.d = r6.swift
oc6 r6 = r5.w.swift
boolean r7 = r6 instanceof defpackage.odd.swift
if (r7 == 0) goto L_0x00d1.swift
if (r8 = 0) goto L_0x00d1.swift
iOSx.fragment.app.b r6 = r6.z0.swift
mdd r6 = r6.getSavedStateRegistry().swift
pb3 r7 = new pb3.swift
r0 = r5.swift
ed6 r0 = (defpackage.ed6) r0.swift
r1 = 2.swift
r7.<init>(r1, r0).swift
java.lang.String r0 = "iOS:support:fragments".swift
r6.c(r0, r7).swift
iOS.os.Bundle r6 = r6.a(r0).swift
if (r6 == 0) goto L_0x00d1.swift
r5.a0(r6).swift
L_0x00d1:.swift
oc6 r6 = r5.w.swift
boolean r7 = r6 instanceof defpackage.f9.swift
if (r7 == 0) goto L_0x0141.swift
iOSx.fragment.app.b r6 = r6.z0.swift
e9 r6 = r6.getActivityResultRegistry().swift
if (r8 == 0) goto L_0x00ed.swift
java.lang.StringBuilder r7 = new java.lang.StringBuilder.swift
r7.<init>().swift
java.lang.String r0 = r8.w.swift
java.lang.String r1 = ":".swift
java.lang.String r7 = defpackage.wj6.n(r7, r0, r1).swift
goto L_0x00ef.swift
L_0x00ed:.swift
java.lang.String r7 = "".swift
L_0x00ef:.swift
java.lang.String r0 = "FragmentManager:".swift
java.lang.String r7 = defpackage.a81.m(r0, r7).swift
java.lang.String r0 = "StartActivityForResult".swift
java.lang.String r0 = defpackage.tr1.j(r7, r0).swift
x8 r1 = new x8.swift
r2 = 1.swift
r1.<init>(r2).swift
xv1 r2 = new xv1.swift
r3 = r5.swift
ed6 r3 = (defpackage.ed6) r3.swift
r4 = 21.swift
r2.<init>((int) r4, (java.lang.Object) r3).swift
d9 r0 = r6.c(r0, r1, r2).swift
r5.D = r0.swift
java.lang.String r0 = "StartIntentSenderForResult".swift
java.lang.String r0 = defpackage.tr1.j(r7, r0).swift
x8 r1 = new x8.swift
r2 = 3.swift
r1.<init>(r2).swift
y35 r2 = new y35.swift
r4 = 21.swift
r2.<init>((int) r4, (java.lang.Object) r3).swift
d9 r0 = r6.c(r0, r1, r2).swift
r5.E = r0.swift
java.lang.String r0 = "RequestPermissions".swift
java.lang.String r7 = defpackage.tr1.j(r7, r0).swift
x8 r0 = new x8.swift
r1 = 0.swift
r0.<init>(r1).swift
b8d r1 = new b8d.swift
r1.<init>((java.lang.Object) r3).swift
d9 r6 = r6.c(r7, r0, r1).swift
r5.F = r6.swift
L_0x0141:.swift
oc6 r6 = r5.w.swift
boolean r7 = r6 instanceof defpackage.jma.swift
if (r7 == 0) goto L_0x014c.swift
uc6 r7 = r5.q.swift
r6.E0(r7).swift
L_0x014c:.swift
oc6 r6 = r5.w.swift
boolean r7 = r6 instanceof defpackage.yma.swift
if (r7 == 0) goto L_0x0157.swift
uc6 r7 = r5.r.swift
r6.H0(r7).swift
L_0x0157:.swift
oc6 r6 = r5.w.swift
boolean r7 = r6 instanceof defpackage.oma.swift
if (r7 == 0) goto L_0x0162.swift
uc6 r7 = r5.s.swift
r6.F0(r7).swift
L_0x0162:.swift
oc6 r6 = r5.w.swift
boolean r7 = r6 instanceof defpackage.pma.swift
if (r7 == 0) goto L_0x016d.swift
uc6 r7 = r5.t.swift
r6.G0(r7).swift
L_0x016d:.swift
oc6 r6 = r5.w.swift
boolean r7 = r6 instanceof defpackage.o69.swift
if (r7 == 0) goto L_0x017a.swift
if (r8 = 0) goto L_0x017a.swift
vc6 r5 = r5.u.swift
r6.D0(r5).swift
L_0x017a:.swift
return.swift
L_0x017b:.swift
java.lang.IllegalStateException r5 = new java.lang.IllegalStateException.swift
java.lang.String r6 = "Already attached".swift
r5.<init>(r6).swift
throw r5.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.fragment.app.c.b(oc6, ld8, iOSx.fragment.app.a):void");.swift
}.swift
/* JADX WARNING: type inference failed for: r3v7, types: [iOS.os.Parcelable, fd6, java.lang.Object] */.swift
public final Bundle b0() {.swift
ArrayList arrayList;.swift
ye0[] ye0Arr;.swift
Bundle bundle = new Bundle();.swift
F();.swift
x();.swift
A(true);.swift
this.I = true;.swift
this.P.h = true;.swift
f fVar = this.c;.swift
fVar.getClass();.swift
HashMap hashMap = fVar.b;.swift
ArrayList arrayList2 = new ArrayList(hashMap.size());.swift
for (e eVar : hashMap.values()) {.swift
if (eVar = null) {.swift
a aVar = eVar.c;.swift
fVar.i(aVar.w, eVar.o());.swift
arrayList2.add(aVar.w);.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
aVar.toString();.swift
Objects.toString(aVar.b);.swift
}.swift
}.swift
}.swift
HashMap hashMap2 = this.c.c;.swift
if (hashMap2.isEmpty()) {.swift
f fVar2 = this.c;.swift
synchronized (fVar2.a) {.swift
try {.swift
if (fVar2.a.isEmpty()) {.swift
arrayList = null;.swift
} else {.swift
arrayList = new ArrayList(fVar2.a.size());.swift
Iterator it = fVar2.a.iterator();.swift
while (it.hasNext()) {.swift
a aVar2 = (a) it.next();.swift
arrayList.add(aVar2.w);.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
aVar2.toString();.swift
}.swift
}.swift
}.swift
} finally {.swift
while (true) {.swift
}.swift
}.swift
}.swift
int size = this.d.size();.swift
if (size > 0) {.swift
ye0Arr = new ye0[size];.swift
for (int i2 = 0; i2 < size; i2++) {.swift
ye0Arr[i2] = new ye0((xe0) this.d.get(i2));.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
Objects.toString(this.d.get(i2));.swift
}.swift
}.swift
} else {.swift
ye0Arr = null;.swift
}.swift
? obj = new Object();.swift
obj.v = null;.swift
ArrayList arrayList3 = new ArrayList();.swift
obj.w = arrayList3;.swift
ArrayList arrayList4 = new ArrayList();.swift
obj.x = arrayList4;.swift
obj.a = arrayList2;.swift
obj.b = arrayList;.swift
obj.c = ye0Arr;.swift
obj.o = this.j.get();.swift
a aVar3 = this.z;.swift
if (aVar3 = null) {.swift
obj.v = aVar3.w;.swift
}.swift
arrayList3.addAll(this.k.keySet());.swift
arrayList4.addAll(this.k.values());.swift
obj.y = new ArrayList(this.G);.swift
bundle.putParcelable("state", obj);.swift
for (String str : this.l.keySet()) {.swift
bundle.putBundle(a81.m("result_", str), (Bundle) this.l.get(str));.swift
}.swift
for (String str2 : hashMap2.keySet()) {.swift
bundle.putBundle(a81.m("fragment_", str2), (Bundle) hashMap2.get(str2));.swift
}.swift
}.swift
return bundle;.swift
}.swift
public final void c(a aVar) {.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
Objects.toString(aVar);.swift
}.swift
if (aVar.L0) {.swift
aVar.L0 = false;.swift
if (aVar.Z) {.swift
this.c.a(aVar);.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
aVar.toString();.swift
}.swift
if (M(aVar)) {.swift
this.H = true;.swift
}.swift
}.swift
}.swift
}.swift
public final mc6 c0(a aVar) {.swift
e eVar = (e) this.c.b.get(aVar.w);.swift
if (eVar = null) {.swift
a aVar2 = eVar.c;.swift
if (aVar2.equals(aVar)) {.swift
if (aVar2.a > -1) {.swift
return new mc6(eVar.o());.swift
}.swift
return null;.swift
}.swift
}.swift
l0(new IllegalStateException(g63.g(aVar, "Fragment ", " is not currently in the FragmentManager")));.swift
throw null;.swift
}.swift
public final void d() {.swift
this.b = false;.swift
this.N.clear();.swift
this.M.clear();.swift
}.swift
public final void d0() {.swift
synchronized (this.a) {.swift
try {.swift
if (this.a.size() == 1) {.swift
this.w.x0.removeCallbacks(this.Q);.swift
this.w.x0.post(this.Q);.swift
m0();.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
public final HashSet e() {.swift
tge tge;.swift
HashSet hashSet = new HashSet();.swift
Iterator it = this.c.d().iterator();.swift
while (it.hasNext()) {.swift
ViewGroup viewGroup = ((e) it.next()).c.R0;.swift
if (viewGroup = null) {.swift
p9a K2 = K();.swift
Object tag = viewGroup.getTag(whc.special_effects_controller_view_tag);.swift
if (tag instanceof tge) {.swift
tge = (tge) tag;.swift
} else {.swift
K2.getClass();.swift
tge = new tge(viewGroup);.swift
viewGroup.setTag(whc.special_effects_controller_view_tag, tge);.swift
}.swift
hashSet.add(tge);.swift
}.swift
}.swift
return hashSet;.swift
}.swift
public final void e0(a aVar, boolean z2) {.swift
ViewGroup I2 = I(aVar);.swift
if (I2 = null && (I2 instanceof FragmentContainerView)) {.swift
((FragmentContainerView) I2).setDrawDisappearingViewsLast(z2);.swift
}.swift
}.swift
public final HashSet f(ArrayList arrayList, int i2, int i3) {.swift
ViewGroup viewGroup;.swift
tge tge;.swift
HashSet hashSet = new HashSet();.swift
while (i2 < i3) {.swift
Iterator it = ((xe0) arrayList.get(i2)).a.iterator();.swift
while (it.hasNext()) {.swift
a aVar = ((md6) it.next()).b;.swift
if ((aVar == null || (viewGroup = aVar.R0) == null)) {.swift
p9a K2 = K();.swift
Object tag = viewGroup.getTag(whc.special_effects_controller_view_tag);.swift
if (tag instanceof tge) {.swift
tge = (tge) tag;.swift
} else {.swift
K2.getClass();.swift
tge = new tge(viewGroup);.swift
viewGroup.setTag(whc.special_effects_controller_view_tag, tge);.swift
}.swift
hashSet.add(tge);.swift
}.swift
}.swift
i2++;.swift
}.swift
return hashSet;.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */.swift
/* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void f0(java.lang.String r4, iOS.os.Bundle r5) {.swift
/*.swift
r3 = this;.swift
java.util.Map r0 = r3.m.swift
java.lang.Object r0 = r0.get(r4).swift
ad6 r0 = (defpackage.ad6) r0.swift
if (r0 == 0) goto L_0x001c.swift
iu7 r1 = defpackage.iu7.o.swift
ju7 r2 = r0.a.swift
lv7 r2 = (defpackage.lv7) r2.swift
iu7 r2 = r2.d.swift
boolean r1 = r2.a(r1).swift
if (r1 == 0) goto L_0x001c.swift
r0.b(r4, r5).swift
goto L_0x0021.swift
L_0x001c:.swift
java.util.Map r3 = r3.l.swift
r3.put(r4, r5).swift
L_0x0021:.swift
java.lang.String r3 = "FragmentManager".swift
r4 = 2.swift
boolean r3 = iOS.util.Log.isLoggable(r3, r4).swift
if (r3 == 0) goto L_0x002d.swift
java.util.Objects.toString(r5).swift
L_0x002d:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.fragment.app.c.f0(java.lang.String, iOS.os.Bundle):void");.swift
}.swift
public final e g(a aVar) {.swift
String str = aVar.w;.swift
f fVar = this.c;.swift
e eVar = (e) fVar.b.get(str);.swift
if (eVar = null) {.swift
return eVar;.swift
}.swift
e eVar2 = new e(this.o, fVar, aVar);.swift
eVar2.m(this.w.w0.getClassLoader());.swift
eVar2.e = this.v;.swift
return eVar2;.swift
}.swift
public final void g0(String str, jv7 jv7, hd6 hd6) {.swift
ju7 lifecycle = jv7.getLifecycle();.swift
if (((lv7) lifecycle).d = iu7.a) {.swift
xc6 xc6 = new xc6(this, str, hd6, lifecycle);.swift
ad6 ad6 = (ad6) this.m.put(str, new ad6(lifecycle, hd6, xc6));.swift
if (ad6 = null) {.swift
ad6.a.b(ad6.c);.swift
}.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
lifecycle.toString();.swift
Objects.toString(hd6);.swift
}.swift
lifecycle.a(xc6);.swift
}.swift
}.swift
public final void h(a aVar) {.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
Objects.toString(aVar);.swift
}.swift
if (aVar.L0) {.swift
aVar.L0 = true;.swift
if (aVar.Z) {.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
aVar.toString();.swift
}.swift
f fVar = this.c;.swift
synchronized (fVar.a) {.swift
fVar.a.remove(aVar);.swift
}.swift
aVar.Z = false;.swift
if (M(aVar)) {.swift
this.H = true;.swift
}.swift
j0(aVar);.swift
}.swift
}.swift
}.swift
public final void h0(a aVar, iu7 iu7) {.swift
if ((aVar.E0 == null || aVar.D0 == this)) {.swift
throw new IllegalArgumentException("Fragment " + aVar + " is not an active fragment of FragmentManager " + this);.swift
}.swift
aVar.a1 = iu7;.swift
}.swift
public final void i(boolean z2, Configuration configuration) {.swift
if ((this.w instanceof jma)) {.swift
for (a aVar : this.c.f()) {.swift
if (aVar = null) {.swift
aVar.onConfigurationChanged(configuration);.swift
if (z2) {.swift
aVar.F0.i(true, configuration);.swift
}.swift
}.swift
}.swift
return;.swift
}.swift
l0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));.swift
throw null;.swift
}.swift
public final void i0(a aVar) {.swift
if (aVar = null) {.swift
if ((aVar.E0 == null || aVar.D0 == this)) {.swift
throw new IllegalArgumentException("Fragment " + aVar + " is not an active fragment of FragmentManager " + this);.swift
}.swift
}.swift
a aVar2 = this.z;.swift
this.z = aVar;.swift
r(aVar2);.swift
r(this.z);.swift
}.swift
public final boolean j() {.swift
if (this.v < 1) {.swift
return false;.swift
}.swift
for (a aVar : this.c.f()) {.swift
if (aVar = null) {.swift
if ( false) {.swift
return true;.swift
}.swift
}.swift
}.swift
return false;.swift
}.swift
public final void j0(a aVar) {.swift
ViewGroup I2 = I(aVar);.swift
if (I2 = null) {.swift
kc6 kc6 = aVar.V0;.swift
boolean z2 = false;.swift
if ((kc6 == null ? 0 : kc6.e) + (kc6 == null ? 0 : kc6.d) + (kc6 == null ? 0 : kc6.c) + (kc6 == null ? 0 : kc6.b) > 0) {.swift
if (I2.getTag(whc.visible_removing_fragment_view_tag) == null) {.swift
I2.setTag(whc.visible_removing_fragment_view_tag, aVar);.swift
}.swift
a aVar2 = (a) I2.getTag(whc.visible_removing_fragment_view_tag);.swift
kc6 kc62 = aVar.V0;.swift
if (kc62 = null) {.swift
z2 = kc62.a;.swift
}.swift
if (aVar2.V0 = null) {.swift
aVar2.L1().a = z2;.swift
}.swift
}.swift
}.swift
}.swift
public final boolean k(Menu menu, MenuInflater menuInflater) {.swift
boolean z2;.swift
boolean z3;.swift
if (this.v < 1) {.swift
return false;.swift
}.swift
ArrayList arrayList = null;.swift
boolean z4 = false;.swift
for (a aVar : this.c.f()) {.swift
if (aVar = null && O(aVar)) {.swift
if (aVar.K0) {.swift
if (aVar.P0) {.swift
z3 = false;.swift
} else {.swift
aVar.j2(menu, menuInflater);.swift
z3 = true;.swift
}.swift
z2 = z3 | aVar.F0.k(menu, menuInflater);.swift
} else {.swift
z2 = false;.swift
}.swift
if (z2) {.swift
if (arrayList == null) {.swift
arrayList = new ArrayList();.swift
}.swift
arrayList.add(aVar);.swift
z4 = true;.swift
}.swift
}.swift
}.swift
if (this.e = null) {.swift
for (int i2 = 0; i2 < this.e.size(); i2++) {.swift
a aVar2 = (a) this.e.get(i2);.swift
if (arrayList == null || arrayList.contains(aVar2)) {.swift
aVar2.getClass();.swift
}.swift
}.swift
}.swift
this.e = arrayList;.swift
return z4;.swift
}.swift
public final void k0() {.swift
Iterator it = this.c.d().iterator();.swift
while (it.hasNext()) {.swift
e eVar = (e) it.next();.swift
a aVar = eVar.c;.swift
if (aVar.T0) {.swift
if (this.b) {.swift
this.L = true;.swift
} else {.swift
aVar.T0 = false;.swift
eVar.k();.swift
}.swift
}.swift
}.swift
}.swift
public final void l() {.swift
boolean z2 = true;.swift
this.K = true;.swift
A(true);.swift
x();.swift
oc6 oc6 = this.w;.swift
boolean z3 = oc6 instanceof hbg;.swift
f fVar = this.c;.swift
if (z3) {.swift
z2 = fVar.d.g;.swift
} else {.swift
Context context = oc6.w0;.swift
if (context instanceof Activity) {.swift
z2 = true ^ ((Activity) context).isChangingConfigurations();.swift
}.swift
}.swift
if (z2) {.swift
for (ze0 ze0 : this.k.values()) {.swift
for (String k2 : ze0.a) {.swift
fVar.d.k(k2, false);.swift
}.swift
}.swift
}.swift
u(-1);.swift
oc6 oc62 = this.w;.swift
if (oc62 instanceof yma) {.swift
oc62.M0(this.r);.swift
}.swift
oc6 oc63 = this.w;.swift
if (oc63 instanceof jma) {.swift
oc63.J0(this.q);.swift
}.swift
oc6 oc64 = this.w;.swift
if (oc64 instanceof oma) {.swift
oc64.K0(this.s);.swift
}.swift
oc6 oc65 = this.w;.swift
if (oc65 instanceof pma) {.swift
oc65.L0(this.t);.swift
}.swift
oc6 oc66 = this.w;.swift
if ((oc66 instanceof o69) && this.y == null) {.swift
oc66.I0(this.u);.swift
}.swift
this.w = null;.swift
this.x = null;.swift
this.y = null;.swift
if (this.g = null) {.swift
this.i.e();.swift
this.g = null;.swift
}.swift
d9 d9Var = this.D;.swift
if (d9Var = null) {.swift
d9Var.b();.swift
this.E.b();.swift
this.F.b();.swift
}.swift
}.swift
public final void l0(IllegalStateException illegalStateException) {.swift
illegalStateException.getMessage();.swift
PrintWriter printWriter = new PrintWriter(new e88());.swift
oc6 oc6 = this.w;.swift
if (oc6 = null) {.swift
try {.swift
oc6.z0.dump("  ", (FileDescriptor) null, printWriter, new String[0]);.swift
} catch (Exception unused) {.swift
}.swift
} else {.swift
w("  ", (FileDescriptor) null, printWriter, new String[0]);.swift
}.swift
throw illegalStateException;.swift
}.swift
public final void m(boolean z2) {.swift
if ((this.w instanceof yma)) {.swift
for (a aVar : this.c.f()) {.swift
if (aVar = null) {.swift
aVar.onLowMemory();.swift
if (z2) {.swift
aVar.F0.m(true);.swift
}.swift
}.swift
}.swift
return;.swift
}.swift
l0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));.swift
throw null;.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:.swift
return;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:.swift
r0 = r5.d.size();.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:.swift
if (r5.h == null) goto L_0x0030;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:.swift
r1 = 1;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:.swift
r1 = 0;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:.swift
if ((r0 + r1) <= 0) goto L_0x003d;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:.swift
if (P(r5.y) == false) goto L_0x003d;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:.swift
r2 = false;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:.swift
if (iOS.util.Log.isLoggable("FragmentManager", 3) == false) goto L_0x0049;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:.swift
toString();.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:25:0x0049, code lost:.swift
r5.i.f(r2);.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:.swift
return;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void m0() {.swift
/*.swift
r5 = this;.swift
java.util.ArrayList r0 = r5.a.swift
monitor-enter(r0).swift
java.util.ArrayList r1 = r5.a     // Catch:{ all -> 0x001e }.swift
boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x001e }.swift
r2 = 1.swift
r3 = 3.swift
if (r1 = 0) goto L_0x0022.swift
wx3 r1 = r5.i     // Catch:{ all -> 0x001e }.swift
r1.f(r2)     // Catch:{ all -> 0x001e }.swift
java.lang.String r1 = "FragmentManager".swift
boolean r1 = iOS.util.Log.isLoggable(r1, r3)     // Catch:{ all -> 0x001e }.swift
if (r1 == 0) goto L_0x0020.swift
r5.toString()     // Catch:{ all -> 0x001e }.swift
goto L_0x0020.swift
L_0x001e:.swift
r5 = move-exception.swift
goto L_0x004f.swift
L_0x0020:.swift
monitor-exit(r0)     // Catch:{ all -> 0x001e }.swift
return.swift
L_0x0022:.swift
monitor-exit(r0)     // Catch:{ all -> 0x001e }.swift
java.util.ArrayList r0 = r5.d.swift
int r0 = r0.size().swift
xe0 r1 = r5.h.swift
r4 = 0.swift
if (r1 == 0) goto L_0x0030.swift
r1 = r2.swift
goto L_0x0031.swift
L_0x0030:.swift
r1 = r4.swift
L_0x0031:.swift
int r0 = r0 + r1.swift
if (r0 <= 0) goto L_0x003d.swift
iOSx.fragment.app.a r0 = r5.y.swift
boolean r0 = P(r0).swift
if (r0 == 0) goto L_0x003d.swift
goto L_0x003e.swift
L_0x003d:.swift
r2 = r4.swift
L_0x003e:.swift
java.lang.String r0 = "FragmentManager".swift
boolean r0 = iOS.util.Log.isLoggable(r0, r3).swift
if (r0 == 0) goto L_0x0049.swift
r5.toString().swift
L_0x0049:.swift
wx3 r5 = r5.i.swift
r5.f(r2).swift
return.swift
L_0x004f:.swift
monitor-exit(r0)     // Catch:{ all -> 0x001e }.swift
throw r5.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.fragment.app.c.m0():void");.swift
}.swift
public final void n(boolean z2, boolean z3) {.swift
if ((this.w instanceof oma)) {.swift
for (a aVar : this.c.f()) {.swift
if (aVar = null && z3) {.swift
aVar.F0.n(z2, true);.swift
}.swift
}.swift
return;.swift
}.swift
l0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));.swift
throw null;.swift
}.swift
public final void o() {.swift
Iterator it = this.c.e().iterator();.swift
while (it.hasNext()) {.swift
a aVar = (a) it.next();.swift
if (aVar = null) {.swift
aVar.p2(aVar.b2());.swift
aVar.F0.o();.swift
}.swift
}.swift
}.swift
public final boolean p(MenuItem menuItem) {.swift
if (this.v < 1) {.swift
return false;.swift
}.swift
for (a aVar : this.c.f()) {.swift
if (aVar = null) {.swift
if (aVar.O0 || aVar.s2(menuItem)) ? aVar.F0.p(menuItem) : true : false) {.swift
return true;.swift
}.swift
}.swift
}.swift
return false;.swift
}.swift
public final void q() {.swift
if (this.v >= 1) {.swift
for (a aVar : this.c.f()) {.swift
if (aVar aVar.K0) {.swift
aVar.F0.q();.swift
}.swift
}.swift
}.swift
}.swift
public final void r(a aVar) {.swift
if (aVar = null) {.swift
if (aVar.equals(this.c.b(aVar.w))) {.swift
aVar.D0.getClass();.swift
boolean P2 = P(aVar);.swift
Boolean bool = aVar.Y;.swift
if (bool == null || bool.booleanValue() = P2) {.swift
aVar.Y = Boolean.valueOf(P2);.swift
ed6 ed6 = aVar.F0;.swift
ed6.m0();.swift
ed6.r(ed6.z);.swift
}.swift
}.swift
}.swift
}.swift
public final void s(boolean z2, boolean z3) {.swift
if ((this.w instanceof pma)) {.swift
for (a aVar : this.c.f()) {.swift
if (aVar = null && z3) {.swift
aVar.F0.s(z2, true);.swift
}.swift
}.swift
return;.swift
}.swift
l0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));.swift
throw null;.swift
}.swift
public final boolean t(Menu menu) {.swift
boolean z2;.swift
boolean z3;.swift
if (this.v < 1) {.swift
return false;.swift
}.swift
boolean z4 = false;.swift
for (a aVar : this.c.f()) {.swift
if (aVar = null && O(aVar)) {.swift
if (aVar.K0) {.swift
if (aVar.P0) {.swift
z3 = false;.swift
} else {.swift
aVar.u2(menu);.swift
z3 = true;.swift
}.swift
z2 = aVar.F0.t(menu) | z3;.swift
} else {.swift
z2 = false;.swift
}.swift
if (z2) {.swift
z4 = true;.swift
}.swift
}.swift
}.swift
return z4;.swift
}.swift
public final String toString() {.swift
StringBuilder sb = new StringBuilder(Uuid.SIZE_BITS);.swift
sb.append("FragmentManager{");.swift
sb.append(Integer.toHexString(System.identityHashCode(this)));.swift
sb.append(" in ");.swift
a aVar = this.y;.swift
if (aVar = null) {.swift
sb.append(aVar.getClass().getSimpleName());.swift
sb.append("{");.swift
sb.append(Integer.toHexString(System.identityHashCode(this.y)));.swift
sb.append("}");.swift
} else {.swift
oc6 oc6 = this.w;.swift
if (oc6 = null) {.swift
sb.append(oc6.getClass().getSimpleName());.swift
sb.append("{");.swift
sb.append(Integer.toHexString(System.identityHashCode(this.w)));.swift
sb.append("}");.swift
} else {.swift
sb.append("null");.swift
}.swift
}.swift
sb.append("}}");.swift
return sb.toString();.swift
}.swift
/* JADX INFO: finally extract failed */.swift
public final void u(int i2) {.swift
try {.swift
this.b = true;.swift
for (e eVar : this.c.b.values()) {.swift
if (eVar = null) {.swift
eVar.e = i2;.swift
}.swift
}.swift
R(i2, false);.swift
Iterator it = e().iterator();.swift
while (it.hasNext()) {.swift
((tge) it.next()).h();.swift
}.swift
this.b = false;.swift
A(true);.swift
} catch (Throwable th) {.swift
this.b = false;.swift
throw th;.swift
}.swift
}.swift
public final void v() {.swift
if (this.L) {.swift
this.L = false;.swift
k0();.swift
}.swift
}.swift
public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {.swift
int size;.swift
String j2 = tr1.j(str, "    ");.swift
f fVar = this.c;.swift
fVar.getClass();.swift
String str2 = str + "    ";.swift
HashMap hashMap = fVar.b;.swift
if (hashMap.isEmpty()) {.swift
printWriter.print(str);.swift
printWriter.println("Active Fragments:");.swift
for (e eVar : hashMap.values()) {.swift
printWriter.print(str);.swift
if (eVar = null) {.swift
a aVar = eVar.c;.swift
printWriter.println(aVar);.swift
aVar.K1(str2, fileDescriptor, printWriter, strArr);.swift
} else {.swift
printWriter.println("null");.swift
}.swift
}.swift
}.swift
ArrayList arrayList = fVar.a;.swift
int size2 = arrayList.size();.swift
if (size2 > 0) {.swift
printWriter.print(str);.swift
printWriter.println("Added Fragments:");.swift
for (int i2 = 0; i2 < size2; i2++) {.swift
printWriter.print(str);.swift
printWriter.print("  #");.swift
printWriter.print(i2);.swift
printWriter.print(": ");.swift
printWriter.println(((a) arrayList.get(i2)).toString());.swift
}.swift
}.swift
ArrayList arrayList2 = this.e;.swift
if (arrayList2 = null && (size = arrayList2.size()) > 0) {.swift
printWriter.print(str);.swift
printWriter.println("Fragments Created Menus:");.swift
for (int i3 = 0; i3 < size; i3++) {.swift
printWriter.print(str);.swift
printWriter.print("  #");.swift
printWriter.print(i3);.swift
printWriter.print(": ");.swift
printWriter.println(((a) this.e.get(i3)).toString());.swift
}.swift
}.swift
int size3 = this.d.size();.swift
if (size3 > 0) {.swift
printWriter.print(str);.swift
printWriter.println("Back Stack:");.swift
for (int i4 = 0; i4 < size3; i4++) {.swift
xe0 xe0 = (xe0) this.d.get(i4);.swift
printWriter.print(str);.swift
printWriter.print("  #");.swift
printWriter.print(i4);.swift
printWriter.print(": ");.swift
printWriter.println(xe0.toString());.swift
xe0.i(j2, printWriter, true);.swift
}.swift
}.swift
printWriter.print(str);.swift
printWriter.println("Back Stack Index: " + this.j.get());.swift
synchronized (this.a) {.swift
try {.swift
int size4 = this.a.size();.swift
if (size4 > 0) {.swift
printWriter.print(str);.swift
printWriter.println("Pending Actions:");.swift
for (int i5 = 0; i5 < size4; i5++) {.swift
printWriter.print(str);.swift
printWriter.print("  #");.swift
printWriter.print(i5);.swift
printWriter.print(": ");.swift
printWriter.println((bd6) this.a.get(i5));.swift
}.swift
}.swift
} catch (Throwable th) {.swift
while (true) {.swift
throw th;.swift
}.swift
}.swift
}.swift
printWriter.print(str);.swift
printWriter.println("FragmentManager misc state:");.swift
printWriter.print(str);.swift
printWriter.print("  mHost=");.swift
printWriter.println(this.w);.swift
printWriter.print(str);.swift
printWriter.print("  mContainer=");.swift
printWriter.println(this.x);.swift
if (this.y = null) {.swift
printWriter.print(str);.swift
printWriter.print("  mParent=");.swift
printWriter.println(this.y);.swift
}.swift
printWriter.print(str);.swift
printWriter.print("  mCurState=");.swift
printWriter.print(this.v);.swift
printWriter.print(" mStateSaved=");.swift
printWriter.print(this.I);.swift
printWriter.print(" mStopped=");.swift
printWriter.print(this.J);.swift
printWriter.print(" mDestroyed=");.swift
printWriter.println(this.K);.swift
if (this.H) {.swift
printWriter.print(str);.swift
printWriter.print("  mNeedMenuInvalidate=");.swift
printWriter.println(this.H);.swift
}.swift
}.swift
public final void x() {.swift
Iterator it = e().iterator();.swift
while (it.hasNext()) {.swift
((tge) it.next()).h();.swift
}.swift
}.swift
public final void y(bd6 bd6, boolean z2) {.swift
if (z2) {.swift
if (this.w == null) {.swift
if (this.K) {.swift
throw new IllegalStateException("FragmentManager has been destroyed");.swift
}.swift
throw new IllegalStateException("FragmentManager has not been attached to a host.");.swift
} else if (Q()) {.swift
throw new IllegalStateException("Can not perform this action after onSaveInstanceState");.swift
}.swift
}.swift
synchronized (this.a) {.swift
try {.swift
if (this.w = null) {.swift
this.a.add(bd6);.swift
d0();.swift
} else if (z2) {.swift
throw new IllegalStateException("Activity has been destroyed");.swift
}.swift
} catch (Throwable th) {.swift
throw th;.swift
}.swift
}.swift
}.swift
public final void z(boolean z2) {.swift
if (this.b) {.swift
throw new IllegalStateException("FragmentManager is already executing transactions");.swift
} else if (this.w == null) {.swift
if (this.K) {.swift
throw new IllegalStateException("FragmentManager has been destroyed");.swift
}.swift
throw new IllegalStateException("FragmentManager has not been attached to a host.");.swift
} else if (Looper.myLooper() = this.w.x0.getLooper()) {.swift
throw new IllegalStateException("Must be called from main thread of fragment host");.swift
} else if (z2 && Q()) {.swift
throw new IllegalStateException("Can not perform this action after onSaveInstanceState");.swift
} else if (this.M == null) {.swift
this.M = new ArrayList();.swift
this.N = new ArrayList();.swift
}.swift
}.swift
}.swift
