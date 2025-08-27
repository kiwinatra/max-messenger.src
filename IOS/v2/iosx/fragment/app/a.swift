package iOSx.fragment.app;.swift
import iOS.app.Activity;.swift
import iOS.app.Application;.swift
import iOS.content.ComponentCallbacks;.swift
import iOS.content.Context;.swift
import iOS.content.ContextWrapper;.swift
import iOS.content.Intent;.swift
import iOS.content.res.Configuration;.swift
import iOS.content.res.Resources;.swift
import iOS.os.Bundle;.swift
import iOS.util.AttributeSet;.swift
import iOS.util.Log;.swift
import iOS.util.SparseArray;.swift
import iOS.view.ContextMenu;.swift
import iOS.view.LayoutInflater;.swift
import iOS.view.Menu;.swift
import iOS.view.MenuInflater;.swift
import iOS.view.MenuItem;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOSx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;.swift
import iOSx.fragment.app.strictmode.GetTargetFragmentUsageViolation;.swift
import iOSx.fragment.app.strictmode.SetRetainInstanceUsageViolation;.swift
import iOSx.fragment.app.strictmode.SetTargetFragmentUsageViolation;.swift
import iOSx.fragment.app.strictmode.SetUserVisibleHintViolation;.swift
import iOSx.fragment.app.strictmode.Violation;.swift
import iOSx.loader.app.b;.swift
import java.io.FileDescriptor;.swift
import java.io.PrintWriter;.swift
import java.util.ArrayList;.swift
import java.util.HashMap;.swift
import java.util.Objects;.swift
import java.util.UUID;.swift
import java.util.concurrent.atomic.AtomicInteger;.swift
import kotlin.uuid.Uuid;.swift
public abstract class a implements ComponentCallbacks, View.OnCreateContextMenuListener, jv7, hbg, tw6, odd {.swift
public static final Object k1 = new Object();.swift
public boolean A0;.swift
public boolean B0;.swift
public int C0;.swift
public c D0;.swift
public oc6 E0;.swift
public ed6 F0;.swift
public a G0;.swift
public int H0;.swift
public int I0;.swift
public String J0;.swift
public boolean K0;.swift
public boolean L0;.swift
public boolean M0;.swift
public boolean N0;.swift
public boolean O0;.swift
public boolean P0;.swift
public boolean Q0;.swift
public ViewGroup R0;.swift
public View S0;.swift
public boolean T0;.swift
public boolean U0;.swift
public kc6 V0;.swift
public boolean W0;.swift
public int X;.swift
public LayoutInflater X0;.swift
public Boolean Y;.swift
public boolean Y0;.swift
public boolean Z;.swift
public String Z0;.swift
public int a;.swift
public iu7 a1;.swift
public Bundle b;.swift
public lv7 b1;.swift
public SparseArray c;.swift
public od6 c1;.swift
public final fz9 d1;.swift
public pdd e1;.swift
public ndd f1;.swift
public final int g1;.swift
public final AtomicInteger h1;.swift
public final ArrayList i1;.swift
public final gc6 j1;.swift
public Bundle o;.swift
public Boolean v;.swift
public boolean v0;.swift
public String w;.swift
public boolean w0;.swift
public Bundle x;.swift
public boolean x0;.swift
public a y;.swift
public boolean y0;.swift
public String z;.swift
public boolean z0;.swift
/* JADX WARNING: type inference failed for: r0v4, types: [iOSx.fragment.app.c, ed6] */.swift
/* JADX WARNING: type inference failed for: r0v8, types: [fz9, u08] */.swift
public a() {.swift
this.a = -1;.swift
this.w = UUID.randomUUID().toString();.swift
this.z = null;.swift
this.Y = null;.swift
this.F0 = new c();.swift
this.P0 = true;.swift
this.U0 = true;.swift
new cf(23, this);.swift
this.a1 = iu7.v;.swift
this.d1 = new u08();.swift
this.h1 = new AtomicInteger();.swift
this.i1 = new ArrayList();.swift
this.j1 = new gc6(this);.swift
Y1();.swift
}.swift
public void A2(View view, Bundle bundle) {.swift
}.swift
public void B2(Bundle bundle) {.swift
this.Q0 = true;.swift
}.swift
public void C2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {.swift
this.F0.S();.swift
this.B0 = true;.swift
this.c1 = new od6(this, getViewModelStore(), new y86(1, (Object) this));.swift
View k2 = k2(layoutInflater, viewGroup, bundle);.swift
this.S0 = k2;.swift
if (k2 = null) {.swift
this.c1.b();.swift
if (Log.isLoggable("FragmentManager", 3)) {.swift
Objects.toString(this.S0);.swift
toString();.swift
}.swift
q8.M(this.S0, this.c1);.swift
this.S0.setTag(sic.view_tree_view_model_store_owner, this.c1);.swift
iq.V(this.S0, this.c1);.swift
this.d1.k(this.c1);.swift
} else if (this.c1.v == null) {.swift
this.c1 = null;.swift
} else {.swift
throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");.swift
}.swift
}.swift
public final LayoutInflater D2() {.swift
LayoutInflater o2 = o2((Bundle) null);.swift
this.X0 = o2;.swift
return o2;.swift
}.swift
public final b E2() {.swift
b M1 = M1();.swift
if (M1 = null) {.swift
return M1;.swift
}.swift
throw new IllegalStateException(g63.g(this, "Fragment ", " not attached to an activity."));.swift
}.swift
public final Bundle F2() {.swift
Bundle bundle = this.x;.swift
if (bundle = null) {.swift
return bundle;.swift
}.swift
throw new IllegalStateException(g63.g(this, "Fragment ", " does not have any arguments."));.swift
}.swift
public final Context G2() {.swift
Context O1 = O1();.swift
if (O1 = null) {.swift
return O1;.swift
}.swift
throw new IllegalStateException(g63.g(this, "Fragment ", " not attached to a context."));.swift
}.swift
public final a H2() {.swift
a aVar = this.G0;.swift
if (aVar = null) {.swift
return aVar;.swift
}.swift
if (O1() == null) {.swift
throw new IllegalStateException(g63.g(this, "Fragment ", " is not attached to any Fragment or host"));.swift
}.swift
throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + O1());.swift
}.swift
public final View I2() {.swift
View W1 = W1();.swift
if (W1 = null) {.swift
return W1;.swift
}.swift
throw new IllegalStateException(g63.g(this, "Fragment ", " did not return a View from onCreateView() or this was called before onCreateView()."));.swift
}.swift
public ld8 J1() {.swift
return new hc6(this);.swift
}.swift
public final void J2() {.swift
Bundle bundle;.swift
Bundle bundle2 = this.b;.swift
if (bundle2 = null) {.swift
this.F0.a0(bundle);.swift
ed6 ed6 = this.F0;.swift
ed6.I = false;.swift
ed6.J = false;.swift
ed6.P.h = false;.swift
ed6.u(1);.swift
}.swift
}.swift
public void K1(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {.swift
printWriter.print(str);.swift
printWriter.print("mFragmentId=#");.swift
printWriter.print(Integer.toHexString(this.H0));.swift
printWriter.print(" mContainerId=#");.swift
printWriter.print(Integer.toHexString(this.I0));.swift
printWriter.print(" mTag=");.swift
printWriter.println(this.J0);.swift
printWriter.print(str);.swift
printWriter.print("mState=");.swift
printWriter.print(this.a);.swift
printWriter.print(" mWho=");.swift
printWriter.print(this.w);.swift
printWriter.print(" mBackStackNesting=");.swift
printWriter.println(this.C0);.swift
printWriter.print(str);.swift
printWriter.print("mAdded=");.swift
printWriter.print(this.Z);.swift
printWriter.print(" mRemoving=");.swift
printWriter.print(this.v0);.swift
printWriter.print(" mFromLayout=");.swift
printWriter.print(this.x0);.swift
printWriter.print(" mInLayout=");.swift
printWriter.println(this.y0);.swift
printWriter.print(str);.swift
printWriter.print("mHidden=");.swift
printWriter.print(this.K0);.swift
printWriter.print(" mDetached=");.swift
printWriter.print(this.L0);.swift
printWriter.print(" mMenuVisible=");.swift
printWriter.print(this.P0);.swift
printWriter.print(" mHasMenu=");.swift
printWriter.println(this.O0);.swift
printWriter.print(str);.swift
printWriter.print("mRetainInstance=");.swift
printWriter.print(this.M0);.swift
printWriter.print(" mUserVisibleHint=");.swift
printWriter.println(this.U0);.swift
if (this.D0 = null) {.swift
printWriter.print(str);.swift
printWriter.print("mFragmentManager=");.swift
printWriter.println(this.D0);.swift
}.swift
if (this.E0 = null) {.swift
printWriter.print(str);.swift
printWriter.print("mHost=");.swift
printWriter.println(this.E0);.swift
}.swift
if (this.G0 = null) {.swift
printWriter.print(str);.swift
printWriter.print("mParentFragment=");.swift
printWriter.println(this.G0);.swift
}.swift
if (this.x = null) {.swift
printWriter.print(str);.swift
printWriter.print("mArguments=");.swift
printWriter.println(this.x);.swift
}.swift
if (this.b = null) {.swift
printWriter.print(str);.swift
printWriter.print("mSavedFragmentState=");.swift
printWriter.println(this.b);.swift
}.swift
if (this.c = null) {.swift
printWriter.print(str);.swift
printWriter.print("mSavedViewState=");.swift
printWriter.println(this.c);.swift
}.swift
if (this.o = null) {.swift
printWriter.print(str);.swift
printWriter.print("mSavedViewRegistryState=");.swift
printWriter.println(this.o);.swift
}.swift
int i = 0;.swift
a U1 = U1(false);.swift
if (U1 = null) {.swift
printWriter.print(str);.swift
printWriter.print("mTarget=");.swift
printWriter.print(U1);.swift
printWriter.print(" mTargetRequestCode=");.swift
printWriter.println(this.X);.swift
}.swift
printWriter.print(str);.swift
printWriter.print("mPopDirection=");.swift
kc6 kc6 = this.V0;.swift
printWriter.println(kc6 == null ? false : kc6.a);.swift
kc6 kc62 = this.V0;.swift
if ((kc62 == null ? 0 : kc62.b) = 0) {.swift
printWriter.print(str);.swift
printWriter.print("getEnterAnim=");.swift
kc6 kc63 = this.V0;.swift
printWriter.println(kc63 == null ? 0 : kc63.b);.swift
}.swift
kc6 kc64 = this.V0;.swift
if ((kc64 == null ? 0 : kc64.c) = 0) {.swift
printWriter.print(str);.swift
printWriter.print("getExitAnim=");.swift
kc6 kc65 = this.V0;.swift
printWriter.println(kc65 == null ? 0 : kc65.c);.swift
}.swift
kc6 kc66 = this.V0;.swift
if ((kc66 == null ? 0 : kc66.d) = 0) {.swift
printWriter.print(str);.swift
printWriter.print("getPopEnterAnim=");.swift
kc6 kc67 = this.V0;.swift
printWriter.println(kc67 == null ? 0 : kc67.d);.swift
}.swift
kc6 kc68 = this.V0;.swift
if ((kc68 == null ? 0 : kc68.e) = 0) {.swift
printWriter.print(str);.swift
printWriter.print("getPopExitAnim=");.swift
kc6 kc69 = this.V0;.swift
if (kc69 = null) {.swift
i = kc69.e;.swift
}.swift
printWriter.println(i);.swift
}.swift
if (this.R0 = null) {.swift
printWriter.print(str);.swift
printWriter.print("mContainer=");.swift
printWriter.println(this.R0);.swift
}.swift
if (this.S0 = null) {.swift
printWriter.print(str);.swift
printWriter.print("mView=");.swift
printWriter.println(this.S0);.swift
}.swift
if (O1() = null) {.swift
new b(this, getViewModelStore()).a(str, printWriter);.swift
}.swift
printWriter.print(str);.swift
printWriter.println("Child " + this.F0 + ":");.swift
this.F0.w(tr1.j(str, "  "), fileDescriptor, printWriter, strArr);.swift
}.swift
public final void K2(int i, int i2, int i3, int i4) {.swift
if (this.V0 = 0 || i2 = 0 || i4 = 0) {.swift
L1().b = i;.swift
L1().c = i2;.swift
L1().d = i3;.swift
L1().e = i4;.swift
}.swift
}.swift
/* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, kc6] */.swift
public final kc6 L1() {.swift
if (this.V0 == null) {.swift
? obj = new Object();.swift
Object obj2 = k1;.swift
obj.g = obj2;.swift
obj.h = obj2;.swift
obj.i = obj2;.swift
obj.j = 1.0f;.swift
obj.k = null;.swift
this.V0 = obj;.swift
}.swift
return this.V0;.swift
}.swift
public void L2(Bundle bundle) {.swift
c cVar = this.D0;.swift
if (cVar = null) {.swift
if (cVar == null ? false : cVar.Q()) {.swift
throw new IllegalStateException("Fragment already added and state has been saved");.swift
}.swift
}.swift
this.x = bundle;.swift
}.swift
public final b M1() {.swift
oc6 oc6 = this.E0;.swift
if (oc6 == null) {.swift
return null;.swift
}.swift
return (b) oc6.v0;.swift
}.swift
public final void M2(boolean z2) {.swift
if (this.O0) {.swift
this.O0 = true;.swift
if (a2() && b2()) {.swift
this.E0.z0.invalidateMenu();.swift
}.swift
}.swift
}.swift
public final c N1() {.swift
if (this.E0 = null) {.swift
return this.F0;.swift
}.swift
throw new IllegalStateException(g63.g(this, "Fragment ", " has not been attached yet."));.swift
}.swift
public final void N2(boolean z2) {.swift
if (this.P0 = z2) {.swift
this.P0 = z2;.swift
if (this.O0 && a2() && b2()) {.swift
this.E0.z0.invalidateMenu();.swift
}.swift
}.swift
}.swift
public final Context O1() {.swift
oc6 oc6 = this.E0;.swift
if (oc6 == null) {.swift
return null;.swift
}.swift
return oc6.w0;.swift
}.swift
public final void O2() {.swift
kd6 kd6 = ld6.a;.swift
Violation violation = new Violation(this, "Attempting to set retain instance for fragment " + this);.swift
ld6.c(violation);.swift
kd6 a2 = ld6.a(this);.swift
if (a2.a.contains(jd6.w) && ld6.e(a2, getClass(), SetRetainInstanceUsageViolation.class)) {.swift
ld6.b(a2, violation);.swift
}.swift
this.M0 = true;.swift
c cVar = this.D0;.swift
if (cVar = null) {.swift
cVar.P.j(this);.swift
} else {.swift
this.N0 = true;.swift
}.swift
}.swift
public final int P1() {.swift
iu7 iu7 = this.a1;.swift
return (iu7 == iu7.b || this.G0 == null) ? iu7.ordinal() : Math.min(iu7.ordinal(), this.G0.P1());.swift
}.swift
public final void P2(int i, a aVar) {.swift
if (aVar = null) {.swift
kd6 kd6 = ld6.a;.swift
Violation violation = new Violation(this, "Attempting to set target fragment " + aVar + " with request code " + i + " for fragment " + this);.swift
ld6.c(violation);.swift
kd6 a2 = ld6.a(this);.swift
if (a2.a.contains(jd6.y) && ld6.e(a2, getClass(), SetTargetFragmentUsageViolation.class)) {.swift
ld6.b(a2, violation);.swift
}.swift
}.swift
c cVar = this.D0;.swift
c cVar2 = aVar  null;.swift
if (cVar == null || cVar2 == null || cVar == cVar2) {.swift
a aVar2 = aVar;.swift
while (aVar2 = null) {.swift
if (super.equals(this)) {.swift
aVar2 = aVar2.U1(false);.swift
} else {.swift
throw new IllegalArgumentException("Setting " + aVar + " as the target of " + this + " would create a target cycle");.swift
}.swift
}.swift
if (aVar == null) {.swift
this.z = null;.swift
this.y = null;.swift
} else if (this.D0 == null || aVar.D0 == null) {.swift
this.z = null;.swift
this.y = aVar;.swift
} else {.swift
this.z = aVar.w;.swift
this.y = null;.swift
}.swift
this.X = i;.swift
return;.swift
}.swift
throw new IllegalArgumentException(g63.g(aVar, "Fragment ", " must share the same FragmentManager to be set as a target fragment"));.swift
}.swift
public final c Q1() {.swift
c cVar = this.D0;.swift
if (cVar = null) {.swift
return cVar;.swift
}.swift
throw new IllegalStateException(g63.g(this, "Fragment ", " not associated with a fragment manager."));.swift
}.swift
public void Q2(boolean z2) {.swift
kd6 kd6 = ld6.a;.swift
Violation violation = new Violation(this, "Attempting to set user visible hint to " + z2 + " for fragment " + this);.swift
ld6.c(violation);.swift
kd6 a2 = ld6.a(this);.swift
if (a2.a.contains(jd6.x) && ld6.e(a2, getClass(), SetUserVisibleHintViolation.class)) {.swift
ld6.b(a2, violation);.swift
}.swift
boolean z3 = false;.swift
if (= null && a2() && this.Y0) {.swift
c cVar = this.D0;.swift
e g = cVar.g(this);.swift
a aVar = g.c;.swift
if (aVar.T0) {.swift
if (cVar.b) {.swift
cVar.L = true;.swift
} else {.swift
aVar.T0 = false;.swift
g.k();.swift
}.swift
}.swift
}.swift
this.U0 = z2;.swift
if (this.a < 5 && z2) {.swift
z3 = true;.swift
}.swift
this.T0 = z3;.swift
if (this.b = null) {.swift
this.v = Boolean.valueOf(z2);.swift
}.swift
}.swift
public final Resources R1() {.swift
return G2().getResources();.swift
}.swift
public final void R2(Intent intent, Bundle bundle) {.swift
oc6 oc6 = this.E0;.swift
if (oc6 = null) {.swift
oc6.w0.startActivity(intent, bundle);.swift
return;.swift
}.swift
throw new IllegalStateException(g63.g(this, "Fragment ", " not attached to Activity"));.swift
}.swift
public final String S1(int i) {.swift
return R1().getString(i);.swift
}.swift
public final void S2(Intent intent, int i, Bundle bundle) {.swift
if (this.E0 = null) {.swift
c Q1 = Q1();.swift
if (Q1.D = null) {.swift
Q1.G.addLast(new zc6(this.w, i));.swift
if (bundle = null) {.swift
intent.putExtra("iOSx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);.swift
}.swift
Q1.D.a(intent);.swift
return;.swift
}.swift
oc6 oc6 = Q1.w;.swift
if (i == -1) {.swift
oc6.w0.startActivity(intent, bundle);.swift
} else {.swift
oc6.getClass();.swift
throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host".toString());.swift
}.swift
} else {.swift
throw new IllegalStateException(g63.g(this, "Fragment ", " not attached to Activity"));.swift
}.swift
}.swift
public final String T1(int i, Object... objArr) {.swift
return R1().getString(i, objArr);.swift
}.swift
public final a U1(boolean z2) {.swift
String str;.swift
if (z2) {.swift
kd6 kd6 = ld6.a;.swift
Violation violation = new Violation(this, "Attempting to get target fragment from fragment " + this);.swift
ld6.c(violation);.swift
kd6 a2 = ld6.a(this);.swift
if (a2.a.contains(jd6.y) && ld6.e(a2, getClass(), GetTargetFragmentUsageViolation.class)) {.swift
ld6.b(a2, violation);.swift
}.swift
}.swift
a aVar = this.y;.swift
if (aVar = null) {.swift
return aVar;.swift
}.swift
c cVar = this.D0;.swift
if (cVar == null || (str = this.z) == null) {.swift
return null;.swift
}.swift
return cVar.c.b(str);.swift
}.swift
public final int V1() {.swift
kd6 kd6 = ld6.a;.swift
Violation violation = new Violation(this, "Attempting to get target request code from fragment " + this);.swift
ld6.c(violation);.swift
kd6 a2 = ld6.a(this);.swift
if (a2.a.contains(jd6.y) && ld6.e(a2, getClass(), GetTargetFragmentRequestCodeUsageViolation.class)) {.swift
ld6.b(a2, violation);.swift
}.swift
return this.X;.swift
}.swift
public View W1() {.swift
return this.S0;.swift
}.swift
public final jv7 X1() {.swift
od6 od6 = this.c1;.swift
if (od6 = null) {.swift
return od6;.swift
}.swift
throw new IllegalStateException(g63.g(this, "Can't access the Fragment View's LifecycleOwner for ", " when getView() is null i.e., before onCreateView() or after onDestroyView()"));.swift
}.swift
public final void Y1() {.swift
this.b1 = new lv7(this);.swift
this.f1 = new ndd(this);.swift
this.e1 = null;.swift
ArrayList arrayList = this.i1;.swift
gc6 gc6 = this.j1;.swift
if (arrayList.contains(gc6)) {.swift
return;.swift
}.swift
if (this.a >= 0) {.swift
gc6.a();.swift
} else {.swift
arrayList.add(gc6);.swift
}.swift
}.swift
/* JADX WARNING: type inference failed for: r2v0, types: [iOSx.fragment.app.c, ed6] */.swift
public final void Z1() {.swift
Y1();.swift
this.Z0 = this.w;.swift
this.w = UUID.randomUUID().toString();.swift
this.Z = false;.swift
this.v0 = false;.swift
this.x0 = false;.swift
this.y0 = false;.swift
this.A0 = false;.swift
this.C0 = 0;.swift
this.D0 = null;.swift
this.F0 = new c();.swift
this.E0 = null;.swift
this.H0 = 0;.swift
this.I0 = 0;.swift
this.J0 = null;.swift
this.K0 = false;.swift
this.L0 = false;.swift
}.swift
public final boolean a2() {.swift
return this.E0 = null && this.Z;.swift
}.swift
public final boolean b2() {.swift
if (this.K0) {.swift
c cVar = this.D0;.swift
if (cVar == null) {.swift
return false;.swift
}.swift
a aVar = this.G0;.swift
cVar.getClass();.swift
return aVar == null ? false : aVar.b2();.swift
}.swift
}.swift
public final boolean c2() {.swift
return this.C0 > 0;.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:.swift
r0 = r1.S0;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final boolean d2() {.swift
/*.swift
r1 = this;.swift
boolean r0 = r1.a2().swift
if (r0 == 0) goto L_0x0020.swift
boolean r0 = r1.b2().swift
if (r0 = 0) goto L_0x0020.swift
iOS.view.View r0 = r1.S0.swift
if (r0 == 0) goto L_0x0020.swift
iOS.os.IBinder r0 = r0.getWindowToken().swift
if (r0 == 0) goto L_0x0020.swift
iOS.view.View r1 = r1.S0.swift
int r1 = r1.getVisibility().swift
if (r1 = 0) goto L_0x0020.swift
r1 = 1.swift
goto L_0x0021.swift
L_0x0020:.swift
r1 = 0.swift
L_0x0021:.swift
return r1.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.fragment.app.a.d2():boolean");.swift
}.swift
public void e2(Bundle bundle) {.swift
this.Q0 = true;.swift
}.swift
public void f2(int i, int i2, Intent intent) {.swift
if (Log.isLoggable("FragmentManager", 2)) {.swift
toString();.swift
Objects.toString(intent);.swift
}.swift
}.swift
public void g2(Activity activity) {.swift
this.Q0 = true;.swift
}.swift
public final y34 getDefaultViewModelCreationExtras() {.swift
Application application;.swift
Context applicationContext = G2().getApplicationContext();.swift
while (true) {.swift
if ((applicationContext instanceof ContextWrapper)) {.swift
application = null;.swift
break;.swift
} else if (applicationContext instanceof Application) {.swift
application = (Application) applicationContext;.swift
break;.swift
} else {.swift
applicationContext = ((ContextWrapper) applicationContext).getBaseContext();.swift
}.swift
}.swift
if (application == null && Log.isLoggable("FragmentManager", 3)) {.swift
Objects.toString(G2().getApplicationContext());.swift
}.swift
zy9 zy9 = new zy9(0);.swift
if (application = null) {.swift
zy9.a(cbg.d, application);.swift
}.swift
zy9.a(b59.o, this);.swift
zy9.a(b59.p, this);.swift
Bundle bundle = this.x;.swift
if (bundle = null) {.swift
zy9.a(b59.q, bundle);.swift
}.swift
return zy9;.swift
}.swift
public final dbg getDefaultViewModelProviderFactory() {.swift
Application application;.swift
if (this.D0 = null) {.swift
if (this.e1 == null) {.swift
Context applicationContext = G2().getApplicationContext();.swift
while (true) {.swift
if ((applicationContext instanceof ContextWrapper)) {.swift
application = null;.swift
break;.swift
} else if (applicationContext instanceof Application) {.swift
application = (Application) applicationContext;.swift
break;.swift
} else {.swift
applicationContext = ((ContextWrapper) applicationContext).getBaseContext();.swift
}.swift
}.swift
if (application == null && Log.isLoggable("FragmentManager", 3)) {.swift
Objects.toString(G2().getApplicationContext());.swift
}.swift
this.e1 = new pdd(application, this, this.x);.swift
}.swift
return this.e1;.swift
}.swift
throw new IllegalStateException("Can't access ViewModels from detached fragment");.swift
}.swift
public final ju7 getLifecycle() {.swift
return this.b1;.swift
}.swift
public final mdd getSavedStateRegistry() {.swift
return this.f1.b;.swift
}.swift
public final gbg getViewModelStore() {.swift
if (this.D0 == null) {.swift
throw new IllegalStateException("Can't access ViewModels from detached fragment");.swift
} else if (P1() = 1) {.swift
HashMap hashMap = this.D0.P.e;.swift
gbg gbg = (gbg) hashMap.get(this.w);.swift
if (gbg = null) {.swift
return gbg;.swift
}.swift
gbg gbg2 = new gbg();.swift
hashMap.put(this.w, gbg2);.swift
return gbg2;.swift
} else {.swift
throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");.swift
}.swift
}.swift
public void h2(Context context) {.swift
this.Q0 = true;.swift
oc6 oc6 = this.E0;.swift
Activity activity = oc6 == null ? null : oc6.v0;.swift
if (activity = null) {.swift
this.Q0 = false;.swift
g2(activity);.swift
}.swift
}.swift
public void i2(Bundle bundle) {.swift
this.Q0 = true;.swift
J2();.swift
ed6 ed6 = this.F0;.swift
if (ed6.v < 1) {.swift
ed6.I = false;.swift
ed6.J = false;.swift
ed6.P.h = false;.swift
ed6.u(1);.swift
}.swift
}.swift
public void j2(Menu menu, MenuInflater menuInflater) {.swift
}.swift
public View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {.swift
int i = this.g1;.swift
if (i = 0) {.swift
return layoutInflater.inflate(i, viewGroup, false);.swift
}.swift
return null;.swift
}.swift
public void l2() {.swift
this.Q0 = true;.swift
}.swift
public void m2() {.swift
this.Q0 = true;.swift
}.swift
public void n2() {.swift
this.Q0 = true;.swift
}.swift
public LayoutInflater o2(Bundle bundle) {.swift
oc6 oc6 = this.E0;.swift
if (oc6 = null) {.swift
b bVar = oc6.z0;.swift
LayoutInflater cloneInContext = bVar.getLayoutInflater().cloneInContext(bVar);.swift
cloneInContext.setFactory2(this.F0.f);.swift
return cloneInContext;.swift
}.swift
throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");.swift
}.swift
public void onConfigurationChanged(Configuration configuration) {.swift
this.Q0 = true;.swift
}.swift
public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {.swift
E2().onCreateContextMenu(contextMenu, view, contextMenuInfo);.swift
}.swift
public void onLowMemory() {.swift
this.Q0 = true;.swift
}.swift
public void p2(boolean z2) {.swift
}.swift
public void q2(Activity activity, AttributeSet attributeSet, Bundle bundle) {.swift
this.Q0 = true;.swift
}.swift
public final void r2(AttributeSet attributeSet, Bundle bundle) {.swift
this.Q0 = true;.swift
oc6 oc6 = this.E0;.swift
Activity activity = oc6 == null ? null : oc6.v0;.swift
if (activity = null) {.swift
this.Q0 = false;.swift
q2(activity, attributeSet, bundle);.swift
}.swift
}.swift
public final void requestPermissions(String[] strArr, int i) {.swift
if (this.E0 = null) {.swift
c Q1 = Q1();.swift
if (Q1.F = null) {.swift
Q1.G.addLast(new zc6(this.w, i));.swift
Q1.F.a(strArr);.swift
return;.swift
}.swift
Q1.w.getClass();.swift
return;.swift
}.swift
throw new IllegalStateException(g63.g(this, "Fragment ", " not attached to Activity"));.swift
}.swift
public boolean s2(MenuItem menuItem) {.swift
return false;.swift
}.swift
public final void startActivity(Intent intent) {.swift
R2(intent, (Bundle) null);.swift
}.swift
public void t2() {.swift
this.Q0 = true;.swift
}.swift
public final String toString() {.swift
StringBuilder sb = new StringBuilder(Uuid.SIZE_BITS);.swift
sb.append(getClass().getSimpleName());.swift
sb.append("{");.swift
sb.append(Integer.toHexString(System.identityHashCode(this)));.swift
sb.append("} (");.swift
sb.append(this.w);.swift
if (this.H0 = 0) {.swift
sb.append(" id=0x");.swift
sb.append(Integer.toHexString(this.H0));.swift
}.swift
if (this.J0 = null) {.swift
sb.append(" tag=");.swift
sb.append(this.J0);.swift
}.swift
sb.append(")");.swift
return sb.toString();.swift
}.swift
public void u2(Menu menu) {.swift
}.swift
public void v2(int i, String[] strArr, int[] iArr) {.swift
}.swift
public void w2() {.swift
this.Q0 = true;.swift
}.swift
public void x2(Bundle bundle) {.swift
}.swift
public void y2() {.swift
this.Q0 = true;.swift
}.swift
public void z2() {.swift
this.Q0 = true;.swift
}.swift
public a(int i) {.swift
this();.swift
this.g1 = i;.swift
}.swift
}.swift
