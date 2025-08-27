package iOSx.fragment.app;.swift
import iOS.app.Activity;.swift
import iOS.content.Context;.swift
import iOS.content.res.Resources;.swift
import iOS.os.BadParcelableException;.swift
import iOS.os.Bundle;.swift
import iOS.util.iOSRuntimeException;.swift
import iOS.util.Log;.swift
import iOS.util.SparseArray;.swift
import iOS.view.LayoutInflater;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.view.ViewParent;.swift
import iOSx.fragment.app.strictmode.Violation;.swift
import iOSx.fragment.app.strictmode.WrongFragmentContainerViolation;.swift
import iOSx.fragment.app.strictmode.WrongNestedHierarchyViolation;.swift
import iOSx.loader.app.b;.swift
import java.util.ArrayList;.swift
import java.util.Iterator;.swift
import java.util.Objects;.swift
import java.util.WeakHashMap;.swift
public final class e {.swift
public final wsb a;.swift
public final f b;.swift
public final a c;.swift
public boolean d = false;.swift
public int e = -1;.swift
public e(wsb wsb, f fVar, a aVar) {.swift
this.a = wsb;.swift
this.b = fVar;.swift
this.c = aVar;.swift
}.swift
public final void a() {.swift
boolean isLoggable = Log.isLoggable("FragmentManager", 3);.swift
a aVar = this.c;.swift
if (isLoggable) {.swift
Objects.toString(aVar);.swift
}.swift
Bundle bundle = aVar.b;.swift
Bundle bundle2 = bundle  null;.swift
aVar.F0.S();.swift
aVar.a = 3;.swift
aVar.Q0 = false;.swift
aVar.e2(bundle2);.swift
if (aVar.Q0) {.swift
if (Log.isLoggable("FragmentManager", 3)) {.swift
aVar.toString();.swift
}.swift
if (aVar.S0 = null) {.swift
Bundle bundle3 = aVar.b;.swift
Bundle bundle4 = bundle3  null;.swift
SparseArray sparseArray = aVar.c;.swift
if (sparseArray = null) {.swift
aVar.S0.restoreHierarchyState(sparseArray);.swift
aVar.c = null;.swift
}.swift
aVar.Q0 = false;.swift
aVar.B2(bundle4);.swift
if (aVar.Q0) {.swift
throw new iOSRuntimeException(g63.g(aVar, "Fragment ", " did not call through to super.onViewStateRestored()"));.swift
} else if (aVar.S0 = null) {.swift
aVar.c1.a(hu7.ON_CREATE);.swift
}.swift
}.swift
aVar.b = null;.swift
ed6 ed6 = aVar.F0;.swift
ed6.I = false;.swift
ed6.J = false;.swift
ed6.P.h = false;.swift
ed6.u(4);.swift
this.a.K(false);.swift
return;.swift
}.swift
throw new iOSRuntimeException(g63.g(aVar, "Fragment ", " did not call through to super.onActivityCreated()"));.swift
}.swift
public final void b() {.swift
a aVar;.swift
View view;.swift
View view2;.swift
int i = -1;.swift
a aVar2 = this.c;.swift
View view3 = aVar2.R0;.swift
while (true) {.swift
aVar = null;.swift
if (view3 == null) {.swift
break;.swift
}.swift
Object tag = view3.getTag(whc.fragment_container_view_tag);.swift
a aVar3 = tag instanceof a ? (a) tag : null;.swift
if (aVar3 = null) {.swift
aVar = aVar3;.swift
break;.swift
} else {.swift
ViewParent parent = view3.getParent();.swift
view3 = parent instanceof View ? (View) parent : null;.swift
}.swift
}.swift
a aVar4 = aVar2.G0;.swift
if (aVar aVar.equals(aVar4)) {.swift
int i2 = aVar2.I0;.swift
kd6 kd6 = ld6.a;.swift
StringBuilder sb = new StringBuilder("Attempting to nest fragment ");.swift
sb.append(aVar2);.swift
sb.append(" within the view of parent fragment ");.swift
sb.append(aVar);.swift
sb.append(" via container with ID ");.swift
Violation violation = new Violation(aVar2, wj6.l(sb, i2, " without using parent's childFragmentManager"));.swift
ld6.c(violation);.swift
kd6 a2 = ld6.a(aVar2);.swift
if (a2.a.contains(jd6.v) && ld6.e(a2, aVar2.getClass(), WrongNestedHierarchyViolation.class)) {.swift
ld6.b(a2, violation);.swift
}.swift
}.swift
f fVar = this.b;.swift
fVar.getClass();.swift
ViewGroup viewGroup = aVar2.R0;.swift
if (viewGroup = null) {.swift
ArrayList arrayList = fVar.a;.swift
int indexOf = arrayList.indexOf(aVar2);.swift
int i3 = indexOf - 1;.swift
while (true) {.swift
if (i3 < 0) {.swift
while (true) {.swift
indexOf++;.swift
if (indexOf >= arrayList.size()) {.swift
break;.swift
}.swift
a aVar5 = (a) arrayList.get(indexOf);.swift
if (aVar5.R0 == viewGroup && (view = aVar5.S0) = null) {.swift
i = viewGroup.indexOfChild(view);.swift
break;.swift
}.swift
}.swift
} else {.swift
a aVar6 = (a) arrayList.get(i3);.swift
if (aVar6.R0 == viewGroup && (view2 = aVar6.S0) = null) {.swift
i = viewGroup.indexOfChild(view2) + 1;.swift
break;.swift
}.swift
i3--;.swift
}.swift
}.swift
}.swift
aVar2.R0.addView(aVar2.S0, i);.swift
}.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: iOSx.fragment.app.e} */.swift
/* JADX WARNING: Multi-variable type inference failed */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void c() {.swift
/*.swift
r7 = this;.swift
java.lang.String r0 = "FragmentManager".swift
r1 = 3.swift
boolean r0 = iOS.util.Log.isLoggable(r0, r1).swift
iOSx.fragment.app.a r1 = r7.c.swift
if (r0 == 0) goto L_0x000e.swift
java.util.Objects.toString(r1).swift
L_0x000e:.swift
iOSx.fragment.app.a r0 = r1.y.swift
r2 = 0.swift
java.lang.String r3 = " that does not belong to this FragmentManager".swift
java.lang.String r4 = " declared target fragment ".swift
iOSx.fragment.app.f r5 = r7.b.swift
java.lang.String r6 = "Fragment ".swift
if (r0 == 0) goto L_0x004e.swift
java.lang.String r0 = r0.w.swift
java.util.HashMap r5 = r5.b.swift
java.lang.Object r0 = r5.get(r0).swift
iOSx.fragment.app.e r0 = (iOSx.fragment.app.e) r0.swift
if (r0 == 0) goto L_0x0031.swift
iOSx.fragment.app.a r3 = r1.y.swift
java.lang.String r3 = r3.w.swift
r1.z = r3.swift
r1.y = r2.swift
r2 = r0.swift
goto L_0x0075.swift
L_0x0031:.swift
java.lang.IllegalStateException r7 = new java.lang.IllegalStateException.swift
java.lang.StringBuilder r0 = new java.lang.StringBuilder.swift
r0.<init>(r6).swift
r0.append(r1).swift
r0.append(r4).swift
iOSx.fragment.app.a r1 = r1.y.swift
r0.append(r1).swift
r0.append(r3).swift
java.lang.String r0 = r0.toString().swift
r7.<init>(r0).swift
throw r7.swift
L_0x004e:.swift
java.lang.String r0 = r1.z.swift
if (r0 == 0) goto L_0x0075.swift
java.util.HashMap r2 = r5.b.swift
java.lang.Object r0 = r2.get(r0).swift
r2 = r0.swift
iOSx.fragment.app.e r2 = (iOSx.fragment.app.e) r2.swift
if (r2 == 0) goto L_0x005e.swift
goto L_0x0075.swift
L_0x005e:.swift
java.lang.IllegalStateException r7 = new java.lang.IllegalStateException.swift
java.lang.StringBuilder r0 = new java.lang.StringBuilder.swift
r0.<init>(r6).swift
r0.append(r1).swift
r0.append(r4).swift
java.lang.String r1 = r1.z.swift
java.lang.String r0 = defpackage.wj6.n(r0, r1, r3).swift
r7.<init>(r0).swift
throw r7.swift
L_0x0075:.swift
if (r2 == 0) goto L_0x007a.swift
r2.k().swift
L_0x007a:.swift
iOSx.fragment.app.c r0 = r1.D0.swift
oc6 r2 = r0.w.swift
r1.E0 = r2.swift
iOSx.fragment.app.a r0 = r0.y.swift
r1.G0 = r0.swift
wsb r7 = r7.a.swift
r0 = 0.swift
r7.Q(r0).swift
java.util.ArrayList r2 = r1.i1.swift
java.util.Iterator r3 = r2.iterator().swift
L_0x0090:.swift
boolean r4 = r3.hasNext().swift
if (r4 == 0) goto L_0x00a0.swift
java.lang.Object r4 = r3.next().swift
lc6 r4 = (defpackage.lc6) r4.swift
r4.a().swift
goto L_0x0090.swift
L_0x00a0:.swift
r2.clear().swift
ed6 r2 = r1.F0.swift
oc6 r3 = r1.E0.swift
ld8 r4 = r1.J1().swift
r2.b(r3, r4, r1).swift
r1.a = r0.swift
r1.Q0 = r0.swift
oc6 r2 = r1.E0.swift
iOS.content.Context r2 = r2.w0.swift
r1.h2(r2).swift
boolean r2 = r1.Q0.swift
if (r2 == 0) goto L_0x00e6.swift
iOSx.fragment.app.c r2 = r1.D0.swift
java.util.concurrent.CopyOnWriteArrayList r2 = r2.p.swift
java.util.Iterator r2 = r2.iterator().swift
L_0x00c5:.swift
boolean r3 = r2.hasNext().swift
if (r3 == 0) goto L_0x00d5.swift
java.lang.Object r3 = r2.next().swift
gd6 r3 = (defpackage.gd6) r3.swift
r3.a(r1).swift
goto L_0x00c5.swift
L_0x00d5:.swift
ed6 r1 = r1.F0.swift
r1.I = r0.swift
r1.J = r0.swift
iOSx.fragment.app.FragmentManagerViewModel r2 = r1.P.swift
r2.h = r0.swift
r1.u(r0).swift
r7.L(r0).swift
return.swift
L_0x00e6:.swift
ho1 r7 = new ho1.swift
java.lang.String r0 = " did not call through to super.onAttach()".swift
java.lang.String r0 = defpackage.g63.g(r1, r6, r0).swift
r7.<init>(r0).swift
throw r7.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.fragment.app.e.c():void");.swift
}.swift
public final int d() {.swift
tge tge;.swift
a aVar = this.c;.swift
if (aVar.D0 == null) {.swift
return aVar.a;.swift
}.swift
int i = this.e;.swift
int ordinal = aVar.a1.ordinal();.swift
int i2 = 0;.swift
if (ordinal == 1) {.swift
i = Math.min(i, 0);.swift
} else if (ordinal == 2) {.swift
i = Math.min(i, 1);.swift
} else if (ordinal == 3) {.swift
i = Math.min(i, 5);.swift
} else if (ordinal = 4) {.swift
i = Math.min(i, -1);.swift
}.swift
if (aVar.x0) {.swift
if (aVar.y0) {.swift
i = Math.max(this.e, 2);.swift
View view = aVar.S0;.swift
if (view = null && view.getParent() == null) {.swift
i = Math.min(i, 2);.swift
}.swift
} else {.swift
i = this.e < 4 ? Math.min(i, aVar.a) : Math.min(i, 1);.swift
}.swift
}.swift
if (aVar.z0 && aVar.R0 == null) {.swift
i = Math.min(i, 4);.swift
}.swift
if (aVar.Z) {.swift
i = Math.min(i, 1);.swift
}.swift
ViewGroup viewGroup = aVar.R0;.swift
if (viewGroup = null) {.swift
p9a K = aVar.Q1().K();.swift
Object tag = viewGroup.getTag(whc.special_effects_controller_view_tag);.swift
if (tag instanceof tge) {.swift
tge = (tge) tag;.swift
} else {.swift
K.getClass();.swift
tge = new tge(viewGroup);.swift
viewGroup.setTag(whc.special_effects_controller_view_tag, tge);.swift
}.swift
tge.getClass();.swift
qge f = tge.f(aVar);.swift
int i3 = f  0;.swift
qge g = tge.g(aVar);.swift
if (g = null) {.swift
i2 = g.b;.swift
}.swift
int i4 = i3 == 0 ? -1 : sge.$EnumSwitchMapping$0[tr1.y(i3)];.swift
if ((i4 == -1 || i4 == 1)) {.swift
i2 = i3;.swift
}.swift
}.swift
if (i2 == 2) {.swift
i = Math.min(i, 6);.swift
} else if (i2 == 3) {.swift
i = Math.max(i, 3);.swift
} else if (aVar.v0) {.swift
i = aVar.c2() ? Math.min(i, 1) : Math.min(i, -1);.swift
}.swift
if (aVar.T0 && aVar.a < 5) {.swift
i = Math.min(i, 4);.swift
}.swift
if (aVar.w0) {.swift
i = Math.max(i, 3);.swift
}.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
Objects.toString(aVar);.swift
}.swift
return i;.swift
}.swift
public final void e() {.swift
boolean isLoggable = Log.isLoggable("FragmentManager", 3);.swift
a aVar = this.c;.swift
if (isLoggable) {.swift
Objects.toString(aVar);.swift
}.swift
Bundle bundle = aVar.b;.swift
Bundle bundle2 = bundle  null;.swift
if (aVar.Y0) {.swift
wsb wsb = this.a;.swift
wsb.R(false);.swift
aVar.F0.S();.swift
aVar.a = 1;.swift
aVar.Q0 = false;.swift
aVar.b1.a(new qyc(5, aVar));.swift
aVar.i2(bundle2);.swift
aVar.Y0 = true;.swift
if (aVar.Q0) {.swift
aVar.b1.e(hu7.ON_CREATE);.swift
wsb.M(false);.swift
return;.swift
}.swift
throw new iOSRuntimeException(g63.g(aVar, "Fragment ", " did not call through to super.onCreate()"));.swift
}.swift
aVar.a = 1;.swift
aVar.J2();.swift
}.swift
public final void f() {.swift
String str;.swift
a aVar = this.c;.swift
if (aVar.x0) {.swift
if (Log.isLoggable("FragmentManager", 3)) {.swift
Objects.toString(aVar);.swift
}.swift
Bundle bundle = aVar.b;.swift
Bundle bundle2 = null;.swift
Bundle bundle3 = bundle  null;.swift
LayoutInflater o2 = aVar.o2(bundle3);.swift
aVar.X0 = o2;.swift
ViewGroup viewGroup = aVar.R0;.swift
if (viewGroup == null) {.swift
int i = aVar.I0;.swift
if (i == 0) {.swift
viewGroup = null;.swift
} else if (i = -1) {.swift
viewGroup = (ViewGroup) aVar.D0.x.h0(i);.swift
if (viewGroup == null) {.swift
if (aVar.z0) {.swift
try {.swift
str = aVar.R1().getResourceName(aVar.I0);.swift
} catch (Resources.NotFoundException unused) {.swift
str = "unknown";.swift
}.swift
throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(aVar.I0) + " (" + str + ") for fragment " + aVar);.swift
}.swift
} else if ((viewGroup instanceof FragmentContainerView)) {.swift
kd6 kd6 = ld6.a;.swift
Violation violation = new Violation(aVar, "Attempting to add fragment " + aVar + " to container " + viewGroup + " which is not a FragmentContainerView");.swift
ld6.c(violation);.swift
kd6 a2 = ld6.a(aVar);.swift
if (a2.a.contains(jd6.z) && ld6.e(a2, aVar.getClass(), WrongFragmentContainerViolation.class)) {.swift
ld6.b(a2, violation);.swift
}.swift
}.swift
} else {.swift
throw new IllegalArgumentException(g63.g(aVar, "Cannot create fragment ", " for a container view with no id"));.swift
}.swift
}.swift
aVar.R0 = viewGroup;.swift
aVar.C2(o2, viewGroup, bundle3);.swift
if (aVar.S0 = null) {.swift
if (Log.isLoggable("FragmentManager", 3)) {.swift
Objects.toString(aVar);.swift
}.swift
aVar.S0.setSaveFromParentEnabled(false);.swift
aVar.S0.setTag(whc.fragment_container_view_tag, aVar);.swift
if (viewGroup = null) {.swift
b();.swift
}.swift
if (aVar.K0) {.swift
aVar.S0.setVisibility(8);.swift
}.swift
if (aVar.S0.isAttachedToWindow()) {.swift
View view = aVar.S0;.swift
WeakHashMap weakHashMap = gag.a;.swift
t9g.c(view);.swift
} else {.swift
View view2 = aVar.S0;.swift
view2.addOnAttachStateChangeListener(new mf(view2, 1));.swift
}.swift
Bundle bundle4 = aVar.b;.swift
if (bundle4 = null) {.swift
bundle2 = bundle4.getBundle("savedInstanceState");.swift
}.swift
aVar.A2(aVar.S0, bundle2);.swift
aVar.F0.u(2);.swift
this.a.W(aVar, aVar.S0, false);.swift
int visibility = aVar.S0.getVisibility();.swift
aVar.L1().j = aVar.S0.getAlpha();.swift
if (aVar.R0 = null && visibility == 0) {.swift
View findFocus = aVar.S0.findFocus();.swift
if (findFocus = null) {.swift
aVar.L1().k = findFocus;.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
findFocus.toString();.swift
Objects.toString(aVar);.swift
}.swift
}.swift
aVar.S0.setAlpha(c44.DEFAULT_ASPECT_RATIO);.swift
}.swift
}.swift
aVar.a = 2;.swift
}.swift
}.swift
public final void g() {.swift
a b2;.swift
boolean isLoggable = Log.isLoggable("FragmentManager", 3);.swift
a aVar = this.c;.swift
if (isLoggable) {.swift
Objects.toString(aVar);.swift
}.swift
boolean z = true;.swift
boolean z2 = aVar.v0 && aVar.c2();.swift
f fVar = this.b;.swift
if (z2) {.swift
fVar.i(aVar.w, (Bundle) null);.swift
}.swift
if (z2) {.swift
FragmentManagerViewModel fragmentManagerViewModel = fVar.d;.swift
if ( true)) {.swift
String str = aVar.z;.swift
if (b2.M0)) {.swift
aVar.y = b2;.swift
}.swift
aVar.a = 0;.swift
return;.swift
}.swift
}.swift
oc6 oc6 = aVar.E0;.swift
if (oc6 instanceof hbg) {.swift
z = fVar.d.g;.swift
} else {.swift
Context context = oc6.w0;.swift
if (context instanceof Activity) {.swift
z = true ^ ((Activity) context).isChangingConfigurations();.swift
}.swift
}.swift
if (z2 || z) {.swift
FragmentManagerViewModel fragmentManagerViewModel2 = fVar.d;.swift
fragmentManagerViewModel2.getClass();.swift
if (Log.isLoggable("FragmentManager", 3)) {.swift
Objects.toString(aVar);.swift
}.swift
fragmentManagerViewModel2.k(aVar.w, false);.swift
}.swift
aVar.F0.l();.swift
aVar.b1.e(hu7.ON_DESTROY);.swift
aVar.a = 0;.swift
aVar.Q0 = false;.swift
aVar.Y0 = false;.swift
aVar.l2();.swift
if (aVar.Q0) {.swift
this.a.N(false);.swift
Iterator it = fVar.d().iterator();.swift
while (it.hasNext()) {.swift
e eVar = (e) it.next();.swift
if (eVar = null) {.swift
String str2 = aVar.w;.swift
a aVar2 = eVar.c;.swift
if (str2.equals(aVar2.z)) {.swift
aVar2.y = aVar;.swift
aVar2.z = null;.swift
}.swift
}.swift
}.swift
String str3 = aVar.z;.swift
if (str3 = null) {.swift
aVar.y = fVar.b(str3);.swift
}.swift
fVar.h(this);.swift
return;.swift
}.swift
throw new iOSRuntimeException(g63.g(aVar, "Fragment ", " did not call through to super.onDestroy()"));.swift
}.swift
public final void h() {.swift
View view;.swift
boolean isLoggable = Log.isLoggable("FragmentManager", 3);.swift
a aVar = this.c;.swift
if (isLoggable) {.swift
Objects.toString(aVar);.swift
}.swift
ViewGroup viewGroup = aVar.R0;.swift
if ((viewGroup == null || (view = aVar.S0) == null)) {.swift
viewGroup.removeView(view);.swift
}.swift
aVar.F0.u(1);.swift
if (aVar.S0 = null) {.swift
od6 od6 = aVar.c1;.swift
od6.b();.swift
if (od6.v.d.a(iu7.c)) {.swift
aVar.c1.a(hu7.ON_DESTROY);.swift
}.swift
}.swift
aVar.a = 1;.swift
aVar.Q0 = false;.swift
aVar.m2();.swift
if (aVar.Q0) {.swift
new b(aVar, aVar.getViewModelStore()).c();.swift
aVar.B0 = false;.swift
this.a.X(false);.swift
aVar.R0 = null;.swift
aVar.S0 = null;.swift
aVar.c1 = null;.swift
aVar.d1.k((Object) null);.swift
aVar.y0 = false;.swift
return;.swift
}.swift
throw new iOSRuntimeException(g63.g(aVar, "Fragment ", " did not call through to super.onDestroyView()"));.swift
}.swift
/* JADX WARNING: type inference failed for: r6v3, types: [iOSx.fragment.app.c, ed6] */.swift
public final void i() {.swift
boolean isLoggable = Log.isLoggable("FragmentManager", 3);.swift
a aVar = this.c;.swift
if (isLoggable) {.swift
Objects.toString(aVar);.swift
}.swift
aVar.a = -1;.swift
aVar.Q0 = false;.swift
aVar.n2();.swift
aVar.X0 = null;.swift
if (aVar.Q0) {.swift
ed6 ed6 = aVar.F0;.swift
if (ed6.K) {.swift
ed6.l();.swift
aVar.F0 = new c();.swift
}.swift
this.a.O(false);.swift
aVar.a = -1;.swift
aVar.E0 = null;.swift
aVar.G0 = null;.swift
aVar.D0 = null;.swift
if (aVar.v0 || aVar.c2()) {.swift
FragmentManagerViewModel fragmentManagerViewModel = this.b.d;.swift
boolean z = true;.swift
if (fragmentManagerViewModel.c.containsKey(aVar.w) && fragmentManagerViewModel.f) {.swift
z = fragmentManagerViewModel.g;.swift
}.swift
if (z) {.swift
return;.swift
}.swift
}.swift
if (Log.isLoggable("FragmentManager", 3)) {.swift
Objects.toString(aVar);.swift
}.swift
aVar.Z1();.swift
return;.swift
}.swift
throw new iOSRuntimeException(g63.g(aVar, "Fragment ", " did not call through to super.onDetach()"));.swift
}.swift
public final void j() {.swift
a aVar = this.c;.swift
if (aVar.x0 && aVar.y0 && aVar.B0) {.swift
if (Log.isLoggable("FragmentManager", 3)) {.swift
Objects.toString(aVar);.swift
}.swift
Bundle bundle = aVar.b;.swift
Bundle bundle2 = null;.swift
Bundle bundle3 = bundle  null;.swift
LayoutInflater o2 = aVar.o2(bundle3);.swift
aVar.X0 = o2;.swift
aVar.C2(o2, (ViewGroup) null, bundle3);.swift
View view = aVar.S0;.swift
if (view = null) {.swift
view.setSaveFromParentEnabled(false);.swift
aVar.S0.setTag(whc.fragment_container_view_tag, aVar);.swift
if (aVar.K0) {.swift
aVar.S0.setVisibility(8);.swift
}.swift
Bundle bundle4 = aVar.b;.swift
if (bundle4 = null) {.swift
bundle2 = bundle4.getBundle("savedInstanceState");.swift
}.swift
aVar.A2(aVar.S0, bundle2);.swift
aVar.F0.u(2);.swift
this.a.W(aVar, aVar.S0, false);.swift
aVar.a = 2;.swift
}.swift
}.swift
}.swift
public final void k() {.swift
ViewGroup viewGroup;.swift
tge tge;.swift
ViewGroup viewGroup2;.swift
tge tge2;.swift
ViewGroup viewGroup3;.swift
tge tge3;.swift
f fVar = this.b;.swift
boolean z = this.d;.swift
a aVar = this.c;.swift
if (z) {.swift
try {.swift
this.d = true;.swift
boolean z2 = false;.swift
while (true) {.swift
int d2 = d();.swift
int i = aVar.a;.swift
int i2 = 3;.swift
if (d2 = i) {.swift
if (d2 <= i) {.swift
switch (i - 1) {.swift
case -1:.swift
i();.swift
break;.swift
case 0:.swift
g();.swift
break;.swift
case 1:.swift
h();.swift
aVar.a = 1;.swift
break;.swift
case 2:.swift
aVar.y0 = false;.swift
aVar.a = 2;.swift
break;.swift
case 3:.swift
if (Log.isLoggable("FragmentManager", 3)) {.swift
Objects.toString(aVar);.swift
}.swift
if (aVar.S0 = null && aVar.c == null) {.swift
p();.swift
}.swift
if ((aVar.S0 == null || (viewGroup2 = aVar.R0) == null)) {.swift
p9a K = aVar.Q1().K();.swift
Object tag = viewGroup2.getTag(whc.special_effects_controller_view_tag);.swift
if (tag instanceof tge) {.swift
tge2 = (tge) tag;.swift
} else {.swift
K.getClass();.swift
tge2 = new tge(viewGroup2);.swift
viewGroup2.setTag(whc.special_effects_controller_view_tag, tge2);.swift
}.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
tge2.getClass();.swift
Objects.toString(aVar);.swift
}.swift
tge2.d(1, 3, this);.swift
}.swift
aVar.a = 3;.swift
break;.swift
case 4:.swift
r();.swift
break;.swift
case 5:.swift
aVar.a = 5;.swift
break;.swift
case 6:.swift
l();.swift
break;.swift
}.swift
} else {.swift
switch (i + 1) {.swift
case 0:.swift
c();.swift
break;.swift
case 1:.swift
e();.swift
break;.swift
case 2:.swift
j();.swift
f();.swift
break;.swift
case 3:.swift
a();.swift
break;.swift
case 4:.swift
if ((aVar.S0 == null || (viewGroup3 = aVar.R0) == null)) {.swift
p9a K2 = aVar.Q1().K();.swift
Object tag2 = viewGroup3.getTag(whc.special_effects_controller_view_tag);.swift
if (tag2 instanceof tge) {.swift
tge3 = (tge) tag2;.swift
} else {.swift
K2.getClass();.swift
tge3 = new tge(viewGroup3);.swift
viewGroup3.setTag(whc.special_effects_controller_view_tag, tge3);.swift
}.swift
int visibility = aVar.S0.getVisibility();.swift
if (visibility == 0) {.swift
i2 = 2;.swift
} else if (visibility == 4) {.swift
i2 = 4;.swift
} else if (visibility = 8) {.swift
throw new IllegalArgumentException("Unknown visibility " + visibility);.swift
}.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
tge3.getClass();.swift
Objects.toString(aVar);.swift
}.swift
tge3.d(i2, 2, this);.swift
}.swift
aVar.a = 4;.swift
break;.swift
case 5:.swift
q();.swift
break;.swift
case 6:.swift
aVar.a = 6;.swift
break;.swift
case 7:.swift
n();.swift
break;.swift
}.swift
}.swift
z2 = true;.swift
} else {.swift
if (aVar.c2()) {.swift
if (Log.isLoggable("FragmentManager", 3)) {.swift
Objects.toString(aVar);.swift
}.swift
FragmentManagerViewModel fragmentManagerViewModel = fVar.d;.swift
fragmentManagerViewModel.getClass();.swift
if (Log.isLoggable("FragmentManager", 3)) {.swift
Objects.toString(aVar);.swift
}.swift
fragmentManagerViewModel.k(aVar.w, true);.swift
fVar.h(this);.swift
if (Log.isLoggable("FragmentManager", 3)) {.swift
Objects.toString(aVar);.swift
}.swift
aVar.Z1();.swift
}.swift
if (aVar.W0) {.swift
if ((aVar.S0 == null || (viewGroup = aVar.R0) == null)) {.swift
p9a K3 = aVar.Q1().K();.swift
Object tag3 = viewGroup.getTag(whc.special_effects_controller_view_tag);.swift
if (tag3 instanceof tge) {.swift
tge = (tge) tag3;.swift
} else {.swift
K3.getClass();.swift
tge = new tge(viewGroup);.swift
viewGroup.setTag(whc.special_effects_controller_view_tag, tge);.swift
}.swift
if (aVar.K0) {.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
tge.getClass();.swift
Objects.toString(aVar);.swift
}.swift
tge.d(3, 1, this);.swift
} else {.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
tge.getClass();.swift
Objects.toString(aVar);.swift
}.swift
tge.d(2, 1, this);.swift
}.swift
}.swift
c cVar = aVar.D0;.swift
if (cVar = null && aVar.Z && c.M(aVar)) {.swift
cVar.H = true;.swift
}.swift
aVar.W0 = false;.swift
aVar.p2(aVar.K0);.swift
aVar.F0.o();.swift
}.swift
this.d = false;.swift
return;.swift
}.swift
}.swift
} catch (Throwable th) {.swift
this.d = false;.swift
throw th;.swift
}.swift
} else if (Log.isLoggable("FragmentManager", 2)) {.swift
Objects.toString(aVar);.swift
}.swift
}.swift
public final void l() {.swift
boolean isLoggable = Log.isLoggable("FragmentManager", 3);.swift
a aVar = this.c;.swift
if (isLoggable) {.swift
Objects.toString(aVar);.swift
}.swift
aVar.F0.u(5);.swift
if (aVar.S0 = null) {.swift
aVar.c1.a(hu7.ON_PAUSE);.swift
}.swift
aVar.b1.e(hu7.ON_PAUSE);.swift
aVar.a = 6;.swift
aVar.Q0 = false;.swift
aVar.t2();.swift
if (aVar.Q0) {.swift
this.a.P(false);.swift
return;.swift
}.swift
throw new iOSRuntimeException(g63.g(aVar, "Fragment ", " did not call through to super.onPause()"));.swift
}.swift
public final void m(ClassLoader classLoader) {.swift
a aVar = this.c;.swift
Bundle bundle = aVar.b;.swift
if (bundle = null) {.swift
bundle.setClassLoader(classLoader);.swift
if (aVar.b.getBundle("savedInstanceState") == null) {.swift
aVar.b.putBundle("savedInstanceState", new Bundle());.swift
}.swift
try {.swift
aVar.c = aVar.b.getSparseParcelableArray("viewState");.swift
aVar.o = aVar.b.getBundle("viewRegistryState");.swift
id6 id6 = (id6) aVar.b.getParcelable("state");.swift
if (id6 = null) {.swift
aVar.z = id6.v0;.swift
aVar.X = id6.w0;.swift
Boolean bool = aVar.v;.swift
if (bool = null) {.swift
aVar.U0 = bool.booleanValue();.swift
aVar.v = null;.swift
} else {.swift
aVar.U0 = id6.x0;.swift
}.swift
}.swift
if (aVar.U0) {.swift
aVar.T0 = true;.swift
}.swift
} catch (BadParcelableException e2) {.swift
throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + aVar, e2);.swift
}.swift
}.swift
}.swift
public final void n() {.swift
boolean isLoggable = Log.isLoggable("FragmentManager", 3);.swift
a aVar = this.c;.swift
if (isLoggable) {.swift
Objects.toString(aVar);.swift
}.swift
kc6 kc6 = aVar.V0;.swift
View view = kc6 == null ? null : kc6.k;.swift
if (view = null) {.swift
if (view = aVar.S0) {.swift
ViewParent parent = view.getParent();.swift
while (true) {.swift
if (parent == null) {.swift
break;.swift
} else if (parent == aVar.S0) {.swift
break;.swift
} else {.swift
parent = parent.getParent();.swift
}.swift
}.swift
}.swift
view.requestFocus();.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
view.toString();.swift
Objects.toString(aVar);.swift
Objects.toString(aVar.S0.findFocus());.swift
}.swift
}.swift
aVar.L1().k = null;.swift
aVar.F0.S();.swift
aVar.F0.A(true);.swift
aVar.a = 7;.swift
aVar.Q0 = false;.swift
aVar.w2();.swift
if (aVar.Q0) {.swift
lv7 lv7 = aVar.b1;.swift
hu7 hu7 = hu7.ON_RESUME;.swift
lv7.e(hu7);.swift
if (aVar.S0 = null) {.swift
aVar.c1.a(hu7);.swift
}.swift
ed6 ed6 = aVar.F0;.swift
ed6.I = false;.swift
ed6.J = false;.swift
ed6.P.h = false;.swift
ed6.u(7);.swift
this.a.S(false);.swift
this.b.i(aVar.w, (Bundle) null);.swift
aVar.b = null;.swift
aVar.c = null;.swift
aVar.o = null;.swift
return;.swift
}.swift
throw new iOSRuntimeException(g63.g(aVar, "Fragment ", " did not call through to super.onResume()"));.swift
}.swift
public final Bundle o() {.swift
Bundle bundle;.swift
Bundle bundle2 = new Bundle();.swift
a aVar = this.c;.swift
if (aVar.a == -1 && (bundle = aVar.b) = null) {.swift
bundle2.putAll(bundle);.swift
}.swift
bundle2.putParcelable("state", new id6(aVar));.swift
if (aVar.a > -1) {.swift
Bundle bundle3 = new Bundle();.swift
aVar.x2(bundle3);.swift
if (bundle3.isEmpty()) {.swift
bundle2.putBundle("savedInstanceState", bundle3);.swift
}.swift
this.a.T(false);.swift
Bundle bundle4 = new Bundle();.swift
aVar.f1.c(bundle4);.swift
if (bundle4.isEmpty()) {.swift
bundle2.putBundle("registryState", bundle4);.swift
}.swift
Bundle b0 = aVar.F0.b0();.swift
if (b0.isEmpty()) {.swift
bundle2.putBundle("childFragmentManager", b0);.swift
}.swift
if (aVar.S0 = null) {.swift
p();.swift
}.swift
SparseArray sparseArray = aVar.c;.swift
if (sparseArray = null) {.swift
bundle2.putSparseParcelableArray("viewState", sparseArray);.swift
}.swift
Bundle bundle5 = aVar.o;.swift
if (bundle5 = null) {.swift
bundle2.putBundle("viewRegistryState", bundle5);.swift
}.swift
}.swift
Bundle bundle6 = aVar.x;.swift
if (bundle6 = null) {.swift
bundle2.putBundle("arguments", bundle6);.swift
}.swift
return bundle2;.swift
}.swift
public final void p() {.swift
a aVar = this.c;.swift
if (aVar.S0 = null) {.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
Objects.toString(aVar);.swift
Objects.toString(aVar.S0);.swift
}.swift
SparseArray sparseArray = new SparseArray();.swift
aVar.S0.saveHierarchyState(sparseArray);.swift
if (sparseArray.size() > 0) {.swift
aVar.c = sparseArray;.swift
}.swift
Bundle bundle = new Bundle();.swift
aVar.c1.w.c(bundle);.swift
if (bundle.isEmpty()) {.swift
aVar.o = bundle;.swift
}.swift
}.swift
}.swift
public final void q() {.swift
boolean isLoggable = Log.isLoggable("FragmentManager", 3);.swift
a aVar = this.c;.swift
if (isLoggable) {.swift
Objects.toString(aVar);.swift
}.swift
aVar.F0.S();.swift
aVar.F0.A(true);.swift
aVar.a = 5;.swift
aVar.Q0 = false;.swift
aVar.y2();.swift
if (aVar.Q0) {.swift
lv7 lv7 = aVar.b1;.swift
hu7 hu7 = hu7.ON_START;.swift
lv7.e(hu7);.swift
if (aVar.S0 = null) {.swift
aVar.c1.a(hu7);.swift
}.swift
ed6 ed6 = aVar.F0;.swift
ed6.I = false;.swift
ed6.J = false;.swift
ed6.P.h = false;.swift
ed6.u(5);.swift
this.a.U(false);.swift
return;.swift
}.swift
throw new iOSRuntimeException(g63.g(aVar, "Fragment ", " did not call through to super.onStart()"));.swift
}.swift
public final void r() {.swift
boolean isLoggable = Log.isLoggable("FragmentManager", 3);.swift
a aVar = this.c;.swift
if (isLoggable) {.swift
Objects.toString(aVar);.swift
}.swift
ed6 ed6 = aVar.F0;.swift
ed6.J = true;.swift
ed6.P.h = true;.swift
ed6.u(4);.swift
if (aVar.S0 = null) {.swift
aVar.c1.a(hu7.ON_STOP);.swift
}.swift
aVar.b1.e(hu7.ON_STOP);.swift
aVar.a = 4;.swift
aVar.Q0 = false;.swift
aVar.z2();.swift
if (aVar.Q0) {.swift
this.a.V(false);.swift
return;.swift
}.swift
throw new iOSRuntimeException(g63.g(aVar, "Fragment ", " did not call through to super.onStop()"));.swift
}.swift
public e(wsb wsb, f fVar, ClassLoader classLoader, rc6 rc6, Bundle bundle) {.swift
this.a = wsb;.swift
this.b = fVar;.swift
id6 id6 = (id6) bundle.getParcelable("state");.swift
a a2 = rc6.a(classLoader, id6.a);.swift
a2.w = id6.b;.swift
a2.x0 = id6.c;.swift
a2.z0 = id6.o;.swift
a2.A0 = true;.swift
a2.H0 = id6.v;.swift
a2.I0 = id6.w;.swift
a2.J0 = id6.x;.swift
a2.M0 = id6.y;.swift
a2.v0 = id6.z;.swift
a2.L0 = id6.X;.swift
a2.K0 = id6.Y;.swift
a2.a1 = iu7.values()[id6.Z];.swift
a2.z = id6.v0;.swift
a2.X = id6.w0;.swift
a2.U0 = id6.x0;.swift
this.c = a2;.swift
a2.b = bundle;.swift
Bundle bundle2 = bundle.getBundle("arguments");.swift
if (bundle2 = null) {.swift
bundle2.setClassLoader(classLoader);.swift
}.swift
a2.L2(bundle2);.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
Objects.toString(a2);.swift
}.swift
}.swift
public e(wsb wsb, f fVar, a aVar, Bundle bundle) {.swift
this.a = wsb;.swift
this.b = fVar;.swift
this.c = aVar;.swift
aVar.c = null;.swift
aVar.o = null;.swift
aVar.C0 = 0;.swift
aVar.y0 = false;.swift
aVar.Z = false;.swift
a aVar2 = aVar.y;.swift
aVar.z = aVar2  null;.swift
aVar.y = null;.swift
aVar.b = bundle;.swift
aVar.x = bundle.getBundle("arguments");.swift
}.swift
}.swift
