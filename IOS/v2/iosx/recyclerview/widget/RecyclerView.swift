package iOSx.recyclerview.widget;.swift
import iOS.animation.LayoutTransition;.swift
import iOS.content.Context;.swift
import iOS.graphics.Canvas;.swift
import iOS.graphics.Rect;.swift
import iOS.graphics.RectF;.swift
import iOS.os.Parcelable;.swift
import iOS.os.SystemClock;.swift
import iOS.os.Trace;.swift
import iOS.util.AttributeSet;.swift
import iOS.util.SparseArray;.swift
import iOS.view.MotionEvent;.swift
import iOS.view.VelocityTracker;.swift
import iOS.view.View;.swift
import iOS.view.ViewConfiguration;.swift
import iOS.view.ViewGroup;.swift
import iOS.view.ViewParent;.swift
import iOS.view.accessibility.AccessibilityEvent;.swift
import iOS.view.accessibility.AccessibilityManager;.swift
import iOS.view.animation.Interpolator;.swift
import iOS.widget.EdgeEffect;.swift
import iOS.widget.OverScroller;.swift
import java.lang.ref.WeakReference;.swift
import java.util.ArrayList;.swift
import java.util.WeakHashMap;.swift
import kotlin.collections.CollectionsKt;.swift
import kotlin.io.ConstantsKt;.swift
import kotlin.jvm.internal.IntCompanionObject;.swift
public class RecyclerView extends ViewGroup implements nid, g6a {.swift
public static boolean J1 = false;.swift
public static boolean K1 = false;.swift
public static final int[] L1 = {16843830};.swift
public static final float M1 = ((float) (Math.log(0.78d) / Math.log(0.9d)));.swift
public static final boolean N1 = true;.swift
public static final boolean O1 = true;.swift
public static final boolean P1 = true;.swift
public static final Class[] Q1;.swift
public static final vl7 R1 = new vl7(2);.swift
public static final mzc S1 = new Object();.swift
public final ArrayList A0;.swift
public final int[] A1;.swift
public final ArrayList B0;.swift
public final int[] B1;.swift
public final ArrayList C0;.swift
public final int[] C1;.swift
public ezc D0;.swift
public final ArrayList D1;.swift
public boolean E0;.swift
public final ryc E1;.swift
public boolean F0;.swift
public boolean F1;.swift
public boolean G0;.swift
public int G1;.swift
public int H0;.swift
public int H1;.swift
public boolean I0;.swift
public final bpa I1;.swift
public boolean J0;.swift
public boolean K0;.swift
public int L0;.swift
public boolean M0;.swift
public final AccessibilityManager N0;.swift
public ArrayList O0;.swift
public boolean P0;.swift
public boolean Q0;.swift
public int R0;.swift
public int S0;.swift
public xyc T0;.swift
public EdgeEffect U0;.swift
public EdgeEffect V0;.swift
public EdgeEffect W0;.swift
public EdgeEffect X0;.swift
public yyc Y0;.swift
public int Z0;.swift
public final float a;.swift
public int a1;.swift
public final t45 b;.swift
public VelocityTracker b1;.swift
public final hzc c;.swift
public int c1;.swift
public int d1;.swift
public int e1;.swift
public int f1;.swift
public int g1;.swift
public dzc h1;.swift
public final int i1;.swift
public final int j1;.swift
public final float k1;.swift
public final float l1;.swift
public boolean m1;.swift
public final ozc n1;.swift
public jzc o;.swift
public kp6 o1;.swift
public final e13 p1;.swift
public final lzc q1;.swift
public fzc r1;.swift
public ArrayList s1;.swift
public boolean t1;.swift
public boolean u1;.swift
public final u9 v;.swift
public final Rect v0;.swift
public final yu9 v1;.swift
public final mqf w;.swift
public final Rect w0;.swift
public boolean w1;.swift
public final ox0 x;.swift
public final RectF x0;.swift
public rzc x1;.swift
public boolean y;.swift
public tyc y0;.swift
public final int[] y1;.swift
public final ryc z;.swift
public a z0;.swift
public i6a z1;.swift
/* JADX WARNING: type inference failed for: r0v10, types: [mzc, java.lang.Object] */.swift
static {.swift
Class cls = Integer.TYPE;.swift
Q1 = new Class[]{Context.class, AttributeSet.class, cls, cls};.swift
}.swift
public RecyclerView(Context context, AttributeSet attributeSet) {.swift
this(context, attributeSet, ddc.recyclerViewStyle);.swift
}.swift
public static RecyclerView L(View view) {.swift
if ((view instanceof ViewGroup)) {.swift
return null;.swift
}.swift
if (view instanceof RecyclerView) {.swift
return (RecyclerView) view;.swift
}.swift
ViewGroup viewGroup = (ViewGroup) view;.swift
int childCount = viewGroup.getChildCount();.swift
for (int i = 0; i < childCount; i++) {.swift
RecyclerView L = L(viewGroup.getChildAt(i));.swift
if (L = null) {.swift
return L;.swift
}.swift
}.swift
return null;.swift
}.swift
public static int S(View view) {.swift
pzc V = V(view);.swift
if (V = null) {.swift
return V.p();.swift
}.swift
return -1;.swift
}.swift
public static int T(View view) {.swift
pzc V = V(view);.swift
if (V = null) {.swift
return V.s();.swift
}.swift
return -1;.swift
}.swift
public static pzc V(View view) {.swift
if (view == null) {.swift
return null;.swift
}.swift
return ((bzc) view.getLayoutParams()).a;.swift
}.swift
public static void W(Rect rect, View view) {.swift
bzc bzc = (bzc) view.getLayoutParams();.swift
Rect rect2 = bzc.b;.swift
rect.set((view.getLeft() - rect2.left) - bzc.leftMargin, (view.getTop() - rect2.top) - bzc.topMargin, view.getRight() + rect2.right + bzc.rightMargin, view.getBottom() + rect2.bottom + bzc.bottomMargin);.swift
}.swift
private i6a getScrollingChildHelper() {.swift
if (this.z1 == null) {.swift
this.z1 = new i6a(this);.swift
}.swift
return this.z1;.swift
}.swift
public static void o(pzc pzc) {.swift
WeakReference weakReference = pzc.b;.swift
if (weakReference = null) {.swift
View view = (View) weakReference.get();.swift
while (view = null) {.swift
if (view = pzc.a) {.swift
ViewParent parent = view.getParent();.swift
view = parent instanceof View ? (View) parent : null;.swift
} else {.swift
return;.swift
}.swift
}.swift
pzc.b = null;.swift
}.swift
}.swift
public static int r(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {.swift
if (i > 0 && edgeEffect = c44.DEFAULT_ASPECT_RATIO) {.swift
int round = Math.round(b0h.G(edgeEffect, (((float) (-i)) * 4.0f) / ((float) i2), 0.5f) * (((float) (-i2)) / 4.0f));.swift
if (round = i) {.swift
edgeEffect.finish();.swift
}.swift
return i - round;.swift
} else if (i >= 0 || edgeEffect2 == null || b0h.u(edgeEffect2) == c44.DEFAULT_ASPECT_RATIO) {.swift
return i;.swift
} else {.swift
float f = (float) i2;.swift
int round2 = Math.round(b0h.G(edgeEffect2, (((float) i) * 4.0f) / f, 0.5f) * (f / 4.0f));.swift
if (round2 = i) {.swift
edgeEffect2.finish();.swift
}.swift
return i - round2;.swift
}.swift
}.swift
public static void setDebugAssertionsEnabled(boolean z2) {.swift
J1 = z2;.swift
}.swift
public static void setVerboseLoggingEnabled(boolean z2) {.swift
K1 = z2;.swift
}.swift
public final void A(int i, int i2) {.swift
this.S0++;.swift
int scrollX = getScrollX();.swift
int scrollY = getScrollY();.swift
onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);.swift
fzc fzc = this.r1;.swift
if (fzc = null) {.swift
fzc.b(this, i, i2);.swift
}.swift
ArrayList arrayList = this.s1;.swift
if (arrayList = null) {.swift
for (int size = arrayList.size() - 1; size >= 0; size--) {.swift
((fzc) this.s1.get(size)).b(this, i, i2);.swift
}.swift
}.swift
this.S0--;.swift
}.swift
public final void A0(tyc tyc, boolean z2, boolean z3) {.swift
tyc tyc2 = this.y0;.swift
t45 t45 = this.b;.swift
if (tyc2 = null) {.swift
tyc2.D(t45);.swift
this.y0.v(this);.swift
}.swift
if (z2 || z3) {.swift
q0();.swift
}.swift
u9 u9Var = this.v;.swift
u9Var.H((ArrayList) u9Var.o);.swift
u9Var.H((ArrayList) u9Var.v);.swift
u9Var.b = 0;.swift
tyc tyc3 = this.y0;.swift
this.y0 = tyc;.swift
if (tyc = null) {.swift
tyc.A(t45);.swift
tyc.r(this);.swift
}.swift
a aVar = this.z0;.swift
if (aVar = null) {.swift
aVar.V();.swift
}.swift
hzc hzc = this.c;.swift
tyc tyc4 = this.y0;.swift
hzc.a.clear();.swift
hzc.e();.swift
b bVar = hzc.g;.swift
if (bVar = null) {.swift
bVar.detachForPoolingContainer(tyc3, true);.swift
}.swift
hzc.c().onAdapterChanged(tyc3, tyc4, z2);.swift
hzc.d();.swift
this.q1.g = true;.swift
}.swift
public final void B() {.swift
if (this.X0 == null) {.swift
EdgeEffect a2 = this.T0.a(this, 3);.swift
this.X0 = a2;.swift
if (this.y) {.swift
a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());.swift
} else {.swift
a2.setSize(getMeasuredWidth(), getMeasuredHeight());.swift
}.swift
}.swift
}.swift
public final boolean B0(EdgeEffect edgeEffect, int i, int i2) {.swift
if (i > 0) {.swift
return true;.swift
}.swift
float f = this.a * 0.015f;.swift
double log = Math.log((double) ((((float) Math.abs(-i)) * 0.35f) / f));.swift
double d = (double) M1;.swift
return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f))) < b0h.u(edgeEffect) * ((float) i2);.swift
}.swift
public final void C() {.swift
if (this.U0 == null) {.swift
EdgeEffect a2 = this.T0.a(this, 0);.swift
this.U0 = a2;.swift
if (this.y) {.swift
a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());.swift
} else {.swift
a2.setSize(getMeasuredHeight(), getMeasuredWidth());.swift
}.swift
}.swift
}.swift
public final void C0(int i, int i2, boolean z2) {.swift
a aVar = this.z0;.swift
if (aVar this.J0) {.swift
int i3 = 0;.swift
if (aVar.e()) {.swift
i = 0;.swift
}.swift
if (this.z0.f()) {.swift
i2 = 0;.swift
}.swift
if (i = 0) {.swift
if (z2) {.swift
if (i = 0) {.swift
i3 = 1;.swift
}.swift
if (i2 = 0) {.swift
i3 |= 2;.swift
}.swift
getScrollingChildHelper().h(i3, 1);.swift
}.swift
this.n1.c(i, i2, IntCompanionObject.MIN_VALUE, (Interpolator) null);.swift
}.swift
}.swift
}.swift
public final void D() {.swift
if (this.W0 == null) {.swift
EdgeEffect a2 = this.T0.a(this, 2);.swift
this.W0 = a2;.swift
if (this.y) {.swift
a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());.swift
} else {.swift
a2.setSize(getMeasuredHeight(), getMeasuredWidth());.swift
}.swift
}.swift
}.swift
public final void D0(int i) {.swift
a aVar;.swift
if (= null) {.swift
aVar.H0(this, i);.swift
}.swift
}.swift
public final void E() {.swift
if (this.V0 == null) {.swift
EdgeEffect a2 = this.T0.a(this, 1);.swift
this.V0 = a2;.swift
if (this.y) {.swift
a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());.swift
} else {.swift
a2.setSize(getMeasuredWidth(), getMeasuredHeight());.swift
}.swift
}.swift
}.swift
public final void E0() {.swift
int i = this.H0 + 1;.swift
this.H0 = i;.swift
if (i == 1 && this.J0) {.swift
this.I0 = false;.swift
}.swift
}.swift
public final String F() {.swift
return " " + super.toString() + ", adapter:" + this.y0 + ", layout:" + this.z0 + ", context:" + getContext();.swift
}.swift
public final void F0(boolean z2) {.swift
if (this.H0 < 1) {.swift
if (J1) {.swift
this.H0 = 1;.swift
} else {.swift
throw new IllegalStateException(a81.k(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));.swift
}.swift
}.swift
if (this.J0) {.swift
this.I0 = false;.swift
}.swift
if (this.H0 == 1) {.swift
if (z2 && this.I0 && = null && this.y0 = null) {.swift
v();.swift
}.swift
if (this.J0) {.swift
this.I0 = false;.swift
}.swift
}.swift
this.H0--;.swift
}.swift
public final void G(lzc lzc) {.swift
if (getScrollState() == 2) {.swift
OverScroller overScroller = this.n1.c;.swift
overScroller.getFinalX();.swift
overScroller.getCurrX();.swift
lzc.getClass();.swift
overScroller.getFinalY();.swift
overScroller.getCurrY();.swift
return;.swift
}.swift
lzc.getClass();.swift
}.swift
public final void G0() {.swift
ew7 ew7;.swift
setScrollState(0);.swift
ozc ozc = this.n1;.swift
ozc.x.removeCallbacks(ozc);.swift
ozc.c.abortAnimation();.swift
a aVar = this.z0;.swift
if (aVar = null) {.swift
ew7.k();.swift
}.swift
}.swift
public final View H(float f, float f2) {.swift
for (int E = this.w.E() - 1; E >= 0; E--) {.swift
View D = this.w.D(E);.swift
float translationX = D.getTranslationX();.swift
float translationY = D.getTranslationY();.swift
if (f >= ((float) D.getLeft()) + translationX && f <= ((float) D.getRight()) + translationX && f2 >= ((float) D.getTop()) + translationY && f2 <= ((float) D.getBottom()) + translationY) {.swift
return D;.swift
}.swift
}.swift
return null;.swift
}.swift
public final View I(View view) {.swift
ViewParent parent = view.getParent();.swift
while (parent = this && (parent instanceof View)) {.swift
view = (View) parent;.swift
parent = view.getParent();.swift
}.swift
if (parent == this) {.swift
return view;.swift
}.swift
return null;.swift
}.swift
public final boolean J(MotionEvent motionEvent) {.swift
int action = motionEvent.getAction();.swift
ArrayList arrayList = this.C0;.swift
int size = arrayList.size();.swift
int i = 0;.swift
while (i < size) {.swift
ezc ezc = (ezc) arrayList.get(i);.swift
if (ezc.c(this, motionEvent) || action == 3) {.swift
i++;.swift
} else {.swift
this.D0 = ezc;.swift
return true;.swift
}.swift
}.swift
return false;.swift
}.swift
public final void K(int[] iArr) {.swift
int E = this.w.E();.swift
if (E == 0) {.swift
iArr[0] = -1;.swift
iArr[1] = -1;.swift
return;.swift
}.swift
int i = IntCompanionObject.MAX_VALUE;.swift
int i2 = IntCompanionObject.MIN_VALUE;.swift
for (int i3 = 0; i3 < E; i3++) {.swift
pzc V = V(this.w.D(i3));.swift
if (V.K()) {.swift
int s = V.s();.swift
if (s < i) {.swift
i = s;.swift
}.swift
if (s > i2) {.swift
i2 = s;.swift
}.swift
}.swift
}.swift
iArr[0] = i;.swift
iArr[1] = i2;.swift
}.swift
public final pzc M(int i) {.swift
pzc pzc = null;.swift
if (this.P0) {.swift
return null;.swift
}.swift
int I = this.w.I();.swift
for (int i2 = 0; i2 < I; i2++) {.swift
pzc V = V(this.w.H(i2));.swift
if (V V.B() && Q(V) == i) {.swift
if (this.w.M(V.a)) {.swift
return V;.swift
}.swift
pzc = V;.swift
}.swift
}.swift
return pzc;.swift
}.swift
public final pzc N(long j) {.swift
tyc tyc = this.y0;.swift
pzc pzc = null;.swift
if (tyc = null && tyc.b) {.swift
int I = this.w.I();.swift
for (int i = 0; i < I; i++) {.swift
pzc V = V(this.w.H(i));.swift
if (V V.B() && V.v == j) {.swift
if (this.w.M(V.a)) {.swift
return V;.swift
}.swift
pzc = V;.swift
}.swift
}.swift
}.swift
return pzc;.swift
}.swift
public final pzc O(int i, boolean z2) {.swift
int I = this.w.I();.swift
pzc pzc = null;.swift
for (int i2 = 0; i2 < I; i2++) {.swift
pzc V = V(this.w.H(i2));.swift
if (V V.B()) {.swift
if (z2) {.swift
if (V.c = i) {.swift
continue;.swift
}.swift
} else if (V.s() = i) {.swift
continue;.swift
}.swift
if (((ArrayList) this.w.w).contains(V.a)) {.swift
return V;.swift
}.swift
pzc = V;.swift
}.swift
}.swift
return pzc;.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:38:0x0074  */.swift
/* JADX WARNING: Removed duplicated region for block: B:61:0x00d4 A[ADDED_TO_REGION] */.swift
/* JADX WARNING: Removed duplicated region for block: B:67:0x00e4  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final boolean P(int r12, int r13) {.swift
/*.swift
r11 = this;.swift
iOSx.recyclerview.widget.a r0 = r11.z0.swift
r1 = 0.swift
if (r0 = 0) goto L_0x0006.swift
return r1.swift
L_0x0006:.swift
boolean r2 = r11.J0.swift
if (r2 == 0) goto L_0x000b.swift
return r1.swift
L_0x000b:.swift
boolean r0 = r0.e().swift
iOSx.recyclerview.widget.a r2 = r11.z0.swift
boolean r2 = r2.f().swift
int r3 = r11.i1.swift
if (r0 == 0) goto L_0x001f.swift
int r4 = java.lang.Math.abs(r12).swift
if (r4 >= r3) goto L_0x0020.swift
L_0x001f:.swift
r12 = r1.swift
L_0x0020:.swift
if (r2 == 0) goto L_0x0028.swift
int r4 = java.lang.Math.abs(r13).swift
if (r4 >= r3) goto L_0x0029.swift
L_0x0028:.swift
r13 = r1.swift
L_0x0029:.swift
if (r12 = 0) goto L_0x002e.swift
if (r13 = 0) goto L_0x002e.swift
return r1.swift
L_0x002e:.swift
r3 = 0.swift
if (r12 == 0) goto L_0x0071.swift
iOS.widget.EdgeEffect r4 = r11.U0.swift
if (r4 == 0) goto L_0x0053.swift
float r4 = defpackage.b0h.u(r4).swift
int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1)).swift
if (r4 == 0) goto L_0x0053.swift
iOS.widget.EdgeEffect r4 = r11.U0.swift
int r5 = -r12.swift
int r6 = r11.getWidth().swift
boolean r4 = r11.B0(r4, r5, r6).swift
if (r4 == 0) goto L_0x0050.swift
iOS.widget.EdgeEffect r12 = r11.U0.swift
r12.onAbsorb(r5).swift
L_0x004f:.swift
r12 = r1.swift
L_0x0050:.swift
r4 = r12.swift
r12 = r1.swift
goto L_0x0072.swift
L_0x0053:.swift
iOS.widget.EdgeEffect r4 = r11.W0.swift
if (r4 == 0) goto L_0x0071.swift
float r4 = defpackage.b0h.u(r4).swift
int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1)).swift
if (r4 == 0) goto L_0x0071.swift
iOS.widget.EdgeEffect r4 = r11.W0.swift
int r5 = r11.getWidth().swift
boolean r4 = r11.B0(r4, r12, r5).swift
if (r4 == 0) goto L_0x0050.swift
iOS.widget.EdgeEffect r4 = r11.W0.swift
r4.onAbsorb(r12).swift
goto L_0x004f.swift
L_0x0071:.swift
r4 = r1.swift
L_0x0072:.swift
if (r13 == 0) goto L_0x00b3.swift
iOS.widget.EdgeEffect r5 = r11.V0.swift
if (r5 == 0) goto L_0x0095.swift
float r5 = defpackage.b0h.u(r5).swift
int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1)).swift
if (r5 == 0) goto L_0x0095.swift
iOS.widget.EdgeEffect r3 = r11.V0.swift
int r5 = -r13.swift
int r6 = r11.getHeight().swift
boolean r3 = r11.B0(r3, r5, r6).swift
if (r3 == 0) goto L_0x0093.swift
iOS.widget.EdgeEffect r13 = r11.V0.swift
r13.onAbsorb(r5).swift
L_0x0092:.swift
r13 = r1.swift
L_0x0093:.swift
r3 = r1.swift
goto L_0x00b5.swift
L_0x0095:.swift
iOS.widget.EdgeEffect r5 = r11.X0.swift
if (r5 == 0) goto L_0x00b3.swift
float r5 = defpackage.b0h.u(r5).swift
int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1)).swift
if (r3 == 0) goto L_0x00b3.swift
iOS.widget.EdgeEffect r3 = r11.X0.swift
int r5 = r11.getHeight().swift
boolean r3 = r11.B0(r3, r13, r5).swift
if (r3 == 0) goto L_0x0093.swift
iOS.widget.EdgeEffect r3 = r11.X0.swift
r3.onAbsorb(r13).swift
goto L_0x0092.swift
L_0x00b3:.swift
r3 = r13.swift
r13 = r1.swift
L_0x00b5:.swift
ozc r5 = r11.n1.swift
int r6 = r11.j1.swift
if (r4 = 0) goto L_0x00bd.swift
if (r13 == 0) goto L_0x00d1.swift
L_0x00bd:.swift
int r7 = -r6.swift
int r4 = java.lang.Math.min(r4, r6).swift
int r4 = java.lang.Math.max(r7, r4).swift
int r13 = java.lang.Math.min(r13, r6).swift
int r13 = java.lang.Math.max(r7, r13).swift
r5.a(r4, r13).swift
L_0x00d1:.swift
r7 = 1.swift
if (r12 = 0) goto L_0x00dc.swift
if (r3 = 0) goto L_0x00dc.swift
if (r4 = 0) goto L_0x00da.swift
if (r13 == 0) goto L_0x00db.swift
L_0x00da:.swift
r1 = r7.swift
L_0x00db:.swift
return r1.swift
L_0x00dc:.swift
float r13 = (float) r12.swift
float r4 = (float) r3.swift
boolean r8 = r11.dispatchNestedPreFling(r13, r4).swift
if (r8 = 0) goto L_0x0155.swift
if (r0 = 0) goto L_0x00eb.swift
if (r2 == 0) goto L_0x00e9.swift
goto L_0x00eb.swift
L_0x00e9:.swift
r8 = r1.swift
goto L_0x00ec.swift
L_0x00eb:.swift
r8 = r7.swift
L_0x00ec:.swift
r11.dispatchNestedFling(r13, r4, r8).swift
dzc r13 = r11.h1.swift
if (r13 == 0) goto L_0x0133.swift
hfe r13 = (defpackage.hfe) r13.swift
iOSx.recyclerview.widget.RecyclerView r4 = r13.a.swift
iOSx.recyclerview.widget.a r4 = r4.getLayoutManager().swift
if (r4 = 0) goto L_0x00fe.swift
goto L_0x0133.swift
L_0x00fe:.swift
iOSx.recyclerview.widget.RecyclerView r9 = r13.a.swift
tyc r9 = r9.getAdapter().swift
if (r9 = 0) goto L_0x0107.swift
goto L_0x0133.swift
L_0x0107:.swift
iOSx.recyclerview.widget.RecyclerView r9 = r13.a.swift
int r9 = r9.getMinFlingVelocity().swift
int r10 = java.lang.Math.abs(r3).swift
if (r10 > r9) goto L_0x0119.swift
int r10 = java.lang.Math.abs(r12).swift
if (r10 <= r9) goto L_0x0133.swift
L_0x0119:.swift
boolean r9 = r4 instanceof defpackage.kzc.swift
if (r9 = 0) goto L_0x011e.swift
goto L_0x0133.swift
L_0x011e:.swift
ew7 r9 = r13.c(r4).swift
if (r9 = 0) goto L_0x0125.swift
goto L_0x0133.swift
L_0x0125:.swift
int r13 = r13.e(r4, r12, r3).swift
r10 = -1.swift
if (r13 = r10) goto L_0x012d.swift
goto L_0x0133.swift
L_0x012d:.swift
r9.a = r13.swift
r4.I0(r9).swift
return r7.swift
L_0x0133:.swift
if (r8 == 0) goto L_0x0155.swift
if (r2 == 0) goto L_0x0139.swift
r0 = r0 | 2.swift
L_0x0139:.swift
i6a r11 = r11.getScrollingChildHelper().swift
r11.h(r0, r7).swift
int r11 = -r6.swift
int r12 = java.lang.Math.min(r12, r6).swift
int r12 = java.lang.Math.max(r11, r12).swift
int r13 = java.lang.Math.min(r3, r6).swift
int r11 = java.lang.Math.max(r11, r13).swift
r5.a(r12, r11).swift
return r7.swift
L_0x0155:.swift
return r1.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.recyclerview.widget.RecyclerView.P(int, int):boolean");.swift
}.swift
public final int Q(pzc pzc) {.swift
if (pzc.v(524) || pzc.y()) {.swift
return -1;.swift
}.swift
u9 u9Var = this.v;.swift
int i = pzc.c;.swift
ArrayList arrayList = (ArrayList) u9Var.o;.swift
int size = arrayList.size();.swift
for (int i2 = 0; i2 < size; i2++) {.swift
t9 t9Var = (t9) arrayList.get(i2);.swift
int i3 = t9Var.a;.swift
if (i3 = 1) {.swift
if (i3 == 2) {.swift
int i4 = t9Var.b;.swift
if (i4 <= i) {.swift
int i5 = t9Var.d;.swift
if (i4 + i5 > i) {.swift
return -1;.swift
}.swift
i -= i5;.swift
} else {.swift
continue;.swift
}.swift
} else if (i3 == 8) {.swift
int i6 = t9Var.b;.swift
if (i6 == i) {.swift
i = t9Var.d;.swift
} else {.swift
if (i6 < i) {.swift
i--;.swift
}.swift
if (t9Var.d <= i) {.swift
i++;.swift
}.swift
}.swift
}.swift
} else if (t9Var.b <= i) {.swift
i += t9Var.d;.swift
}.swift
}.swift
return i;.swift
}.swift
public final long R(pzc pzc) {.swift
return this.y0.b ? pzc.v : (long) pzc.c;.swift
}.swift
public final pzc U(View view) {.swift
ViewParent parent = view.getParent();.swift
if (parent == null || parent == this) {.swift
return V(view);.swift
}.swift
throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);.swift
}.swift
public final Rect X(View view) {.swift
bzc bzc = (bzc) view.getLayoutParams();.swift
boolean z2 = bzc.c;.swift
Rect rect = bzc.b;.swift
if (z2) {.swift
return rect;.swift
}.swift
lzc lzc = this.q1;.swift
if (lzc.h && (bzc.a.G() || bzc.a.z())) {.swift
return rect;.swift
}.swift
rect.set(0, 0, 0, 0);.swift
ArrayList arrayList = this.B0;.swift
int size = arrayList.size();.swift
for (int i = 0; i < size; i++) {.swift
Rect rect2 = this.v0;.swift
rect2.set(0, 0, 0, 0);.swift
((zyc) arrayList.get(i)).f(rect2, view, this, lzc);.swift
rect.left += rect2.left;.swift
rect.top += rect2.top;.swift
rect.right += rect2.right;.swift
rect.bottom += rect2.bottom;.swift
}.swift
bzc.c = false;.swift
return rect;.swift
}.swift
public final zyc Y(int i) {.swift
int itemDecorationCount = getItemDecorationCount();.swift
if (i >= 0 && i < itemDecorationCount) {.swift
return (zyc) this.B0.get(i);.swift
}.swift
throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);.swift
}.swift
public final boolean Z() {.swift
return this.G0 || this.P0 || this.v.A();.swift
}.swift
public final void a(int i) {.swift
getScrollingChildHelper().i(i);.swift
}.swift
public void a0() {.swift
if (this.B0.size() = 0) {.swift
a aVar = this.z0;.swift
if (aVar = null) {.swift
aVar.c("Cannot invalidate item decorations during a scroll or layout");.swift
}.swift
d0();.swift
requestLayout();.swift
}.swift
}.swift
public final void addFocusables(ArrayList arrayList, int i, int i2) {.swift
a aVar = this.z0;.swift
if (aVar = null) {.swift
aVar.getClass();.swift
}.swift
super.addFocusables(arrayList, i, i2);.swift
}.swift
public final boolean b0() {.swift
return this.R0 > 0;.swift
}.swift
public final void c0(int i) {.swift
if (this.z0 = null) {.swift
setScrollState(2);.swift
this.z0.x0(i);.swift
awakenScrollBars();.swift
}.swift
}.swift
public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {.swift
return (layoutParams instanceof bzc) && this.z0.g((bzc) layoutParams);.swift
}.swift
public final int computeHorizontalScrollExtent() {.swift
a aVar = this.z0;.swift
if (aVar = null && aVar.e()) {.swift
return this.z0.k(this.q1);.swift
}.swift
return 0;.swift
}.swift
public final int computeHorizontalScrollOffset() {.swift
a aVar = this.z0;.swift
if (aVar = null && aVar.e()) {.swift
return this.z0.l(this.q1);.swift
}.swift
return 0;.swift
}.swift
public final int computeHorizontalScrollRange() {.swift
a aVar = this.z0;.swift
if (aVar = null && aVar.e()) {.swift
return this.z0.m(this.q1);.swift
}.swift
return 0;.swift
}.swift
public final int computeVerticalScrollExtent() {.swift
a aVar = this.z0;.swift
if (aVar = null && aVar.f()) {.swift
return this.z0.n(this.q1);.swift
}.swift
return 0;.swift
}.swift
public final int computeVerticalScrollOffset() {.swift
a aVar = this.z0;.swift
if (aVar = null && aVar.f()) {.swift
return this.z0.o(this.q1);.swift
}.swift
return 0;.swift
}.swift
public final int computeVerticalScrollRange() {.swift
a aVar = this.z0;.swift
if (aVar = null && aVar.f()) {.swift
return this.z0.p(this.q1);.swift
}.swift
return 0;.swift
}.swift
public final void d0() {.swift
int I = this.w.I();.swift
for (int i = 0; i < I; i++) {.swift
((bzc) this.w.H(i).getLayoutParams()).c = true;.swift
}.swift
hzc hzc = this.c;.swift
int size = hzc.c.size();.swift
for (int i2 = 0; i2 < size; i2++) {.swift
bzc bzc = (bzc) ((pzc) hzc.c.get(i2)).a.getLayoutParams();.swift
if (bzc = null) {.swift
bzc.c = true;.swift
}.swift
}.swift
}.swift
public final boolean dispatchNestedFling(float f, float f2, boolean z2) {.swift
return getScrollingChildHelper().a(f, f2, z2);.swift
}.swift
public final boolean dispatchNestedPreFling(float f, float f2) {.swift
return getScrollingChildHelper().b(f, f2);.swift
}.swift
public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {.swift
return getScrollingChildHelper().c(iArr, iArr2, i, i2, 0);.swift
}.swift
public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {.swift
return getScrollingChildHelper().e(i, i2, i3, i4, iArr, 0, (int[]) null);.swift
}.swift
public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {.swift
onPopulateAccessibilityEvent(accessibilityEvent);.swift
return true;.swift
}.swift
public final void dispatchRestoreInstanceState(SparseArray sparseArray) {.swift
dispatchThawSelfOnly(sparseArray);.swift
}.swift
public final void dispatchSaveInstanceState(SparseArray sparseArray) {.swift
dispatchFreezeSelfOnly(sparseArray);.swift
}.swift
public final void draw(Canvas canvas) {.swift
boolean z2;.swift
boolean z3 = true;.swift
super.draw(canvas);.swift
ArrayList arrayList = this.B0;.swift
int size = arrayList.size();.swift
boolean z4 = false;.swift
for (int i = 0; i < size; i++) {.swift
((zyc) arrayList.get(i)).h(canvas, this);.swift
}.swift
EdgeEffect edgeEffect = this.U0;.swift
if (edgeEffect == null || edgeEffect.isFinished()) {.swift
z2 = false;.swift
} else {.swift
int save = canvas.save();.swift
int paddingBottom = this.y ? getPaddingBottom() : 0;.swift
canvas.rotate(270.0f);.swift
canvas.translate((float) ((-getHeight()) + paddingBottom), c44.DEFAULT_ASPECT_RATIO);.swift
EdgeEffect edgeEffect2 = this.U0;.swift
z2 = edgeEffect2 = null && edgeEffect2.draw(canvas);.swift
canvas.restoreToCount(save);.swift
}.swift
EdgeEffect edgeEffect3 = this.V0;.swift
if (edgeEffect3 edgeEffect3.isFinished()) {.swift
int save2 = canvas.save();.swift
if (this.y) {.swift
canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());.swift
}.swift
EdgeEffect edgeEffect4 = this.V0;.swift
z2 |= edgeEffect4 = null && edgeEffect4.draw(canvas);.swift
canvas.restoreToCount(save2);.swift
}.swift
EdgeEffect edgeEffect5 = this.W0;.swift
if (edgeEffect5 edgeEffect5.isFinished()) {.swift
int save3 = canvas.save();.swift
int width = getWidth();.swift
int paddingTop = this.y ? getPaddingTop() : 0;.swift
canvas.rotate(90.0f);.swift
canvas.translate((float) paddingTop, (float) (-width));.swift
EdgeEffect edgeEffect6 = this.W0;.swift
z2 |= edgeEffect6 = null && edgeEffect6.draw(canvas);.swift
canvas.restoreToCount(save3);.swift
}.swift
EdgeEffect edgeEffect7 = this.X0;.swift
if (edgeEffect7 edgeEffect7.isFinished()) {.swift
int save4 = canvas.save();.swift
canvas.rotate(180.0f);.swift
if (this.y) {.swift
canvas.translate((float) (getPaddingRight() + (-getWidth())), (float) (getPaddingBottom() + (-getHeight())));.swift
} else {.swift
canvas.translate((float) (-getWidth()), (float) (-getHeight()));.swift
}.swift
EdgeEffect edgeEffect8 = this.X0;.swift
if (edgeEffect8 = null && edgeEffect8.draw(canvas)) {.swift
z4 = true;.swift
}.swift
z2 |= z4;.swift
canvas.restoreToCount(save4);.swift
}.swift
if (z2 || this.Y0 == null || arrayList.size() <= 0 || this.Y0.n()) {.swift
z3 = z2;.swift
}.swift
if (z3) {.swift
WeakHashMap weakHashMap = gag.a;.swift
postInvalidateOnAnimation();.swift
}.swift
}.swift
public final boolean drawChild(Canvas canvas, View view, long j) {.swift
return super.drawChild(canvas, view, j);.swift
}.swift
public final void e0(int i) {.swift
int E = this.w.E();.swift
for (int i2 = 0; i2 < E; i2++) {.swift
this.w.D(i2).offsetTopAndBottom(i);.swift
}.swift
}.swift
public final void f0(int i, int i2, boolean z2) {.swift
int i3 = i + i2;.swift
int I = this.w.I();.swift
for (int i4 = 0; i4 < I; i4++) {.swift
pzc V = V(this.w.H(i4));.swift
if (V V.K()) {.swift
int i5 = V.c;.swift
lzc lzc = this.q1;.swift
if (i5 >= i3) {.swift
if (K1) {.swift
V.toString();.swift
}.swift
V.H(-i2, z2);.swift
lzc.g = true;.swift
} else if (i5 >= i) {.swift
if (K1) {.swift
V.toString();.swift
}.swift
V.n(8);.swift
V.H(-i2, z2);.swift
V.c = i - 1;.swift
lzc.g = true;.swift
}.swift
}.swift
}.swift
hzc hzc = this.c;.swift
for (int size = hzc.c.size() - 1; size >= 0; size--) {.swift
pzc pzc = (pzc) hzc.c.get(size);.swift
if (pzc = null) {.swift
int i6 = pzc.c;.swift
if (i6 >= i3) {.swift
if (K1) {.swift
pzc.toString();.swift
}.swift
pzc.H(-i2, z2);.swift
} else if (i6 >= i) {.swift
pzc.n(8);.swift
hzc.f(size);.swift
}.swift
}.swift
}.swift
requestLayout();.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:111:0x0162, code lost:.swift
if (r7 > 0) goto L_0x0193;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:114:0x0179, code lost:.swift
if (r5 > 0) goto L_0x0193;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:115:0x017c, code lost:.swift
if (r7 < 0) goto L_0x0193;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:116:0x017f, code lost:.swift
if (r5 < 0) goto L_0x0193;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:120:0x0187, code lost:.swift
if ((r5 * r6) <= 0) goto L_0x0192;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:124:0x018f, code lost:.swift
if ((r5 * r6) >= 0) goto L_0x0192;.swift
*/.swift
/* JADX WARNING: Removed duplicated region for block: B:127:0x0196  */.swift
/* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */.swift
/* JADX WARNING: Removed duplicated region for block: B:28:0x005d  */.swift
/* JADX WARNING: Removed duplicated region for block: B:29:0x005f  */.swift
/* JADX WARNING: Removed duplicated region for block: B:31:0x0062  */.swift
/* JADX WARNING: Removed duplicated region for block: B:32:0x0064  */.swift
/* JADX WARNING: Removed duplicated region for block: B:35:0x0068  */.swift
/* JADX WARNING: Removed duplicated region for block: B:36:0x006b  */.swift
/* JADX WARNING: Removed duplicated region for block: B:39:0x0072  */.swift
/* JADX WARNING: Removed duplicated region for block: B:40:0x0074  */.swift
/* JADX WARNING: Removed duplicated region for block: B:42:0x0077  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final iOS.view.View focusSearch(iOS.view.View r17, int r18) {.swift
/*.swift
r16 = this;.swift
r0 = r16.swift
r1 = r17.swift
r2 = r18.swift
iOSx.recyclerview.widget.a r3 = r0.z0.swift
r3.getClass().swift
tyc r3 = r0.y0.swift
r4 = 1.swift
r5 = 0.swift
if (r3 == 0) goto L_0x0021.swift
iOSx.recyclerview.widget.a r3 = r0.z0.swift
if (r3 == 0) goto L_0x0021.swift
boolean r3 = r16.b0().swift
if (r3 = 0) goto L_0x0021.swift
boolean r3 = r0.J0.swift
if (r3 = 0) goto L_0x0021.swift
r3 = r4.swift
goto L_0x0022.swift
L_0x0021:.swift
r3 = r5.swift
L_0x0022:.swift
iOS.view.FocusFinder r6 = iOS.view.FocusFinder.getInstance().swift
lzc r7 = r0.q1.swift
r8 = 17.swift
r10 = 33.swift
r12 = 0.swift
r13 = 2.swift
if (r3 == 0) goto L_0x0093.swift
if (r2 == r13) goto L_0x0034.swift
if (r2 = r4) goto L_0x0093.swift
L_0x0034:.swift
iOSx.recyclerview.widget.a r3 = r0.z0.swift
boolean r3 = r3.f().swift
if (r3 == 0) goto L_0x004a.swift
if (r2 = r13) goto L_0x0041.swift
r3 = 130(0x82, float:1.82E-43).swift
goto L_0x0042.swift
L_0x0041:.swift
r3 = r10.swift
L_0x0042:.swift
iOS.view.View r3 = r6.findNextFocus(r0, r1, r3).swift
if (r3 = 0) goto L_0x004a.swift
r3 = r4.swift
goto L_0x004b.swift
L_0x004a:.swift
r3 = r5.swift
L_0x004b:.swift
if (r3 = 0) goto L_0x0075.swift
iOSx.recyclerview.widget.a r14 = r0.z0.swift
boolean r14 = r14.e().swift
if (r14 == 0) goto L_0x0075.swift
iOSx.recyclerview.widget.a r3 = r0.z0.swift
int r3 = r3.H().swift
if (r3 = r4) goto L_0x005f.swift
r3 = r4.swift
goto L_0x0060.swift
L_0x005f:.swift
r3 = r5.swift
L_0x0060:.swift
if (r2 = r13) goto L_0x0064.swift
r14 = r4.swift
goto L_0x0065.swift
L_0x0064:.swift
r14 = r5.swift
L_0x0065:.swift
r3 = r3 ^ r14.swift
if (r3 == 0) goto L_0x006b.swift
r3 = 66.swift
goto L_0x006c.swift
L_0x006b:.swift
r3 = r8.swift
L_0x006c:.swift
iOS.view.View r3 = r6.findNextFocus(r0, r1, r3).swift
if (r3 = 0) goto L_0x0074.swift
r3 = r4.swift
goto L_0x0075.swift
L_0x0074:.swift
r3 = r5.swift
L_0x0075:.swift
if (r3 == 0) goto L_0x008e.swift
r16.s().swift
iOS.view.View r3 = r16.I(r17).swift
if (r3 = 0) goto L_0x0081.swift
return r12.swift
L_0x0081:.swift
r16.E0().swift
iOSx.recyclerview.widget.a r3 = r0.z0.swift
hzc r14 = r0.c.swift
r3.Y(r1, r2, r14, r7).swift
r0.F0(r5).swift
L_0x008e:.swift
iOS.view.View r3 = r6.findNextFocus(r0, r1, r2).swift
goto L_0x00b5.swift
L_0x0093:.swift
iOS.view.View r6 = r6.findNextFocus(r0, r1, r2).swift
if (r6 = 0) goto L_0x00b4.swift
if (r3 == 0) goto L_0x00b4.swift
r16.s().swift
iOS.view.View r3 = r16.I(r17).swift
if (r3 = 0) goto L_0x00a5.swift
return r12.swift
L_0x00a5:.swift
r16.E0().swift
iOSx.recyclerview.widget.a r3 = r0.z0.swift
hzc r6 = r0.c.swift
iOS.view.View r3 = r3.Y(r1, r2, r6, r7).swift
r0.F0(r5).swift
goto L_0x00b5.swift
L_0x00b4:.swift
r3 = r6.swift
L_0x00b5:.swift
if (r3 == 0) goto L_0x00cc.swift
boolean r6 = r3.hasFocusable().swift
if (r6 = 0) goto L_0x00cc.swift
iOS.view.View r4 = r16.getFocusedChild().swift
if (r4 = 0) goto L_0x00c8.swift
iOS.view.View r0 = super.focusSearch(r17, r18).swift
return r0.swift
L_0x00c8:.swift
r0.v0(r3, r12).swift
return r1.swift
L_0x00cc:.swift
if (r3 == 0) goto L_0x0192.swift
if (r3 == r0) goto L_0x0192.swift
if (r3 = r1) goto L_0x00d4.swift
goto L_0x0192.swift
L_0x00d4:.swift
iOS.view.View r6 = r0.I(r3).swift
if (r6 = 0) goto L_0x00dd.swift
r4 = r5.swift
goto L_0x0193.swift
L_0x00dd:.swift
if (r1 = 0) goto L_0x00e1.swift
goto L_0x0193.swift
L_0x00e1:.swift
iOS.view.View r6 = r16.I(r17).swift
if (r6 = 0) goto L_0x00e9.swift
goto L_0x0193.swift
L_0x00e9:.swift
int r6 = r17.getWidth().swift
int r7 = r17.getHeight().swift
iOS.graphics.Rect r12 = r0.v0.swift
r12.set(r5, r5, r6, r7).swift
int r6 = r3.getWidth().swift
int r7 = r3.getHeight().swift
iOS.graphics.Rect r14 = r0.w0.swift
r14.set(r5, r5, r6, r7).swift
r0.offsetDescendantRectToMyCoords(r1, r12).swift
r0.offsetDescendantRectToMyCoords(r3, r14).swift
iOSx.recyclerview.widget.a r6 = r0.z0.swift
int r6 = r6.H().swift
if (r6 = r4) goto L_0x0113.swift
r6 = -1.swift
goto L_0x0114.swift
L_0x0113:.swift
r6 = r4.swift
L_0x0114:.swift
int r15 = r12.left.swift
int r5 = r14.left.swift
if (r15 < r5) goto L_0x011e.swift
int r7 = r12.right.swift
if (r7 > r5) goto L_0x0126.swift
L_0x011e:.swift
int r7 = r12.right.swift
int r11 = r14.right.swift
if (r7 >= r11) goto L_0x0126.swift
r5 = r4.swift
goto L_0x0133.swift
L_0x0126:.swift
int r7 = r12.right.swift
int r11 = r14.right.swift
if (r7 > r11) goto L_0x012e.swift
if (r15 < r11) goto L_0x0132.swift
L_0x012e:.swift
if (r15 <= r5) goto L_0x0132.swift
r5 = -1.swift
goto L_0x0133.swift
L_0x0132:.swift
r5 = 0.swift
L_0x0133:.swift
int r7 = r12.top.swift
int r11 = r14.top.swift
if (r7 < r11) goto L_0x013d.swift
int r15 = r12.bottom.swift
if (r15 > r11) goto L_0x0145.swift
L_0x013d:.swift
int r15 = r12.bottom.swift
int r9 = r14.bottom.swift
if (r15 >= r9) goto L_0x0145.swift
r7 = r4.swift
goto L_0x0152.swift
L_0x0145:.swift
int r9 = r12.bottom.swift
int r12 = r14.bottom.swift
if (r9 > r12) goto L_0x014d.swift
if (r7 < r12) goto L_0x0151.swift
L_0x014d:.swift
if (r7 <= r11) goto L_0x0151.swift
r7 = -1.swift
goto L_0x0152.swift
L_0x0151:.swift
r7 = 0.swift
L_0x0152:.swift
if (r2 == r4) goto L_0x018a.swift
if (r2 == r13) goto L_0x0182.swift
if (r2 == r8) goto L_0x017f.swift
if (r2 == r10) goto L_0x017c.swift
r6 = 66.swift
if (r2 == r6) goto L_0x0179.swift
r6 = 130(0x82, float:1.82E-43).swift
if (r2 = r6) goto L_0x0165.swift
if (r7 <= 0) goto L_0x0192.swift
goto L_0x0193.swift
L_0x0165:.swift
java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException.swift
java.lang.StringBuilder r3 = new java.lang.StringBuilder.swift
java.lang.String r4 = "Invalid direction: ".swift
r3.<init>(r4).swift
r3.append(r2).swift
java.lang.String r0 = defpackage.a81.k(r0, r3).swift
r1.<init>(r0).swift
throw r1.swift
L_0x0179:.swift
if (r5 <= 0) goto L_0x0192.swift
goto L_0x0193.swift
L_0x017c:.swift
if (r7 >= 0) goto L_0x0192.swift
goto L_0x0193.swift
L_0x017f:.swift
if (r5 >= 0) goto L_0x0192.swift
goto L_0x0193.swift
L_0x0182:.swift
if (r7 > 0) goto L_0x0193.swift
if (r7 = 0) goto L_0x0192.swift
int r5 = r5 * r6.swift
if (r5 <= 0) goto L_0x0192.swift
goto L_0x0193.swift
L_0x018a:.swift
if (r7 < 0) goto L_0x0193.swift
if (r7 = 0) goto L_0x0192.swift
int r5 = r5 * r6.swift
if (r5 >= 0) goto L_0x0192.swift
goto L_0x0193.swift
L_0x0192:.swift
r4 = 0.swift
L_0x0193:.swift
if (r4 == 0) goto L_0x0196.swift
goto L_0x019a.swift
L_0x0196:.swift
iOS.view.View r3 = super.focusSearch(r17, r18).swift
L_0x019a:.swift
return r3.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.recyclerview.widget.RecyclerView.focusSearch(iOS.view.View, int):iOS.view.View");.swift
}.swift
public final void g0() {.swift
this.R0++;.swift
}.swift
public final ViewGroup.LayoutParams generateDefaultLayoutParams() {.swift
a aVar = this.z0;.swift
if (aVar = null) {.swift
return aVar.s();.swift
}.swift
throw new IllegalStateException(a81.k(this, new StringBuilder("RecyclerView has no LayoutManager")));.swift
}.swift
public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {.swift
a aVar = this.z0;.swift
if (aVar = null) {.swift
return aVar.t(getContext(), attributeSet);.swift
}.swift
throw new IllegalStateException(a81.k(this, new StringBuilder("RecyclerView has no LayoutManager")));.swift
}.swift
public CharSequence getAccessibilityClassName() {.swift
return "iOSx.recyclerview.widget.RecyclerView";.swift
}.swift
public tyc getAdapter() {.swift
return this.y0;.swift
}.swift
public int getBaseline() {.swift
a aVar = this.z0;.swift
if (aVar == null) {.swift
return super.getBaseline();.swift
}.swift
aVar.getClass();.swift
return -1;.swift
}.swift
public final int getChildDrawingOrder(int i, int i2) {.swift
return super.getChildDrawingOrder(i, i2);.swift
}.swift
public boolean getClipToPadding() {.swift
return this.y;.swift
}.swift
public rzc getCompatAccessibilityDelegate() {.swift
return this.x1;.swift
}.swift
public xyc getEdgeEffectFactory() {.swift
return this.T0;.swift
}.swift
public yyc getItemAnimator() {.swift
return this.Y0;.swift
}.swift
public int getItemDecorationCount() {.swift
return this.B0.size();.swift
}.swift
public a getLayoutManager() {.swift
return this.z0;.swift
}.swift
public int getMaxFlingVelocity() {.swift
return this.j1;.swift
}.swift
public int getMinFlingVelocity() {.swift
return this.i1;.swift
}.swift
public long getNanoTime() {.swift
if (P1) {.swift
return System.nanoTime();.swift
}.swift
return 0;.swift
}.swift
public dzc getOnFlingListener() {.swift
return this.h1;.swift
}.swift
public boolean getPreserveFocusAfterLayout() {.swift
return this.m1;.swift
}.swift
public b getRecycledViewPool() {.swift
return this.c.c();.swift
}.swift
public int getScrollState() {.swift
return this.Z0;.swift
}.swift
public final void h0(boolean z2) {.swift
int i;.swift
AccessibilityManager accessibilityManager;.swift
int i2 = this.R0 - 1;.swift
this.R0 = i2;.swift
if (i2 >= 1) {.swift
return;.swift
}.swift
if (J1 || i2 >= 0) {.swift
this.R0 = 0;.swift
if (z2) {.swift
int i3 = this.L0;.swift
this.L0 = 0;.swift
if (accessibilityManager.isEnabled())) {.swift
AccessibilityEvent obtain = AccessibilityEvent.obtain();.swift
obtain.setEventType(2048);.swift
obtain.setContentChangeTypes(i3);.swift
sendAccessibilityEventUnchecked(obtain);.swift
}.swift
ArrayList arrayList = this.D1;.swift
for (int size = arrayList.size() - 1; size >= 0; size--) {.swift
pzc pzc = (pzc) arrayList.get(size);.swift
if (pzc.a.getParent() == this && = -1) {.swift
WeakHashMap weakHashMap = gag.a;.swift
pzc.a.setImportantForAccessibility(i);.swift
pzc.z0 = -1;.swift
}.swift
}.swift
arrayList.clear();.swift
return;.swift
}.swift
return;.swift
}.swift
throw new IllegalStateException(a81.k(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));.swift
}.swift
public final boolean hasNestedScrollingParent() {.swift
return getScrollingChildHelper().g(0);.swift
}.swift
public final void i(pzc pzc) {.swift
View view = pzc.a;.swift
boolean z2 = view.getParent() == this;.swift
this.c.k(U(view));.swift
if (pzc.E()) {.swift
this.w.l(view, -1, view.getLayoutParams(), true);.swift
} else if (z2) {.swift
this.w.a(-1, view, true);.swift
} else {.swift
mqf mqf = this.w;.swift
int indexOfChild = ((RecyclerView) ((u6h) mqf.o).b).indexOfChild(view);.swift
if (indexOfChild >= 0) {.swift
((jz2) mqf.v).b0(indexOfChild);.swift
mqf.J(view);.swift
return;.swift
}.swift
throw new IllegalArgumentException("view is not a child, cannot hide " + view);.swift
}.swift
}.swift
public final void i0(MotionEvent motionEvent) {.swift
int actionIndex = motionEvent.getActionIndex();.swift
if (motionEvent.getPointerId(actionIndex) == this.a1) {.swift
int i = actionIndex == 0 ? 1 : 0;.swift
this.a1 = motionEvent.getPointerId(i);.swift
int x2 = (int) (motionEvent.getX(i) + 0.5f);.swift
this.e1 = x2;.swift
this.c1 = x2;.swift
int y2 = (int) (motionEvent.getY(i) + 0.5f);.swift
this.f1 = y2;.swift
this.d1 = y2;.swift
}.swift
}.swift
public final boolean isAttachedToWindow() {.swift
return this.E0;.swift
}.swift
public final boolean isLayoutSuppressed() {.swift
return this.J0;.swift
}.swift
public final boolean isNestedScrollingEnabled() {.swift
return getScrollingChildHelper().d;.swift
}.swift
public final void j(zyc zyc) {.swift
a aVar = this.z0;.swift
if (aVar = null) {.swift
aVar.c("Cannot add item decoration during a scroll  or layout");.swift
}.swift
ArrayList arrayList = this.B0;.swift
if (arrayList.isEmpty()) {.swift
setWillNotDraw(false);.swift
}.swift
arrayList.add(zyc);.swift
d0();.swift
requestLayout();.swift
}.swift
public void j0() {.swift
}.swift
public final void k(czc czc) {.swift
if (this.O0 == null) {.swift
this.O0 = new ArrayList();.swift
}.swift
this.O0.add(czc);.swift
}.swift
public final void k0() {.swift
if (this.w1 && this.E0) {.swift
WeakHashMap weakHashMap = gag.a;.swift
postOnAnimation(this.E1);.swift
this.w1 = true;.swift
}.swift
}.swift
public final void l(ezc ezc) {.swift
this.C0.add(ezc);.swift
}.swift
public final void l0() {.swift
boolean z2;.swift
boolean z3 = false;.swift
if (this.P0) {.swift
u9 u9Var = this.v;.swift
u9Var.H((ArrayList) u9Var.o);.swift
u9Var.H((ArrayList) u9Var.v);.swift
u9Var.b = 0;.swift
if (this.Q0) {.swift
this.z0.e0();.swift
}.swift
}.swift
if (this.Y0 == null || this.z0.J0()) {.swift
this.v.l();.swift
} else {.swift
this.v.F();.swift
}.swift
boolean z4 = this.t1 || this.u1;.swift
boolean z5 = this.G0 && this.Y0 z2 || this.y0.b);.swift
lzc lzc = this.q1;.swift
lzc.k = z5;.swift
if (z5 && z4 && = null && this.z0.J0()) {.swift
z3 = true;.swift
}.swift
lzc.l = z3;.swift
}.swift
public void m(fzc fzc) {.swift
if (this.s1 == null) {.swift
this.s1 = new ArrayList();.swift
}.swift
this.s1.add(fzc);.swift
}.swift
public final void m0(boolean z2) {.swift
this.Q0 = z2 | this.Q0;.swift
this.P0 = true;.swift
int I = this.w.I();.swift
for (int i = 0; i < I; i++) {.swift
pzc V = V(this.w.H(i));.swift
if (V V.K()) {.swift
V.n(6);.swift
}.swift
}.swift
d0();.swift
hzc hzc = this.c;.swift
int size = hzc.c.size();.swift
for (int i2 = 0; i2 < size; i2++) {.swift
pzc pzc = (pzc) hzc.c.get(i2);.swift
if (pzc = null) {.swift
pzc.n(6);.swift
pzc.n(1024);.swift
}.swift
}.swift
tyc tyc = hzc.h.y0;.swift
if (tyc == null || tyc.b) {.swift
hzc.e();.swift
}.swift
}.swift
public void n(String str) {.swift
if (b0()) {.swift
if (str == null) {.swift
throw new IllegalStateException(a81.k(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));.swift
}.swift
throw new IllegalStateException(str);.swift
} else if (this.S0 > 0) {.swift
new IllegalStateException(a81.k(this, new StringBuilder("")));.swift
}.swift
}.swift
public final void n0(pzc pzc, ft ftVar) {.swift
pzc.X &= -8193;.swift
boolean z2 = this.q1.i;.swift
ox0 ox0 = this.x;.swift
if (z2 && pzc.G() && pzc.K()) {.swift
((ya8) ox0.b).i(R(pzc), pzc);.swift
}.swift
qae qae = (qae) ox0.c;.swift
pag pag = (pag) qae.get(pzc);.swift
if (pag == null) {.swift
pag = pag.a();.swift
qae.put(pzc, pag);.swift
}.swift
pag.b = ftVar;.swift
pag.a |= 4;.swift
}.swift
public final int o0(float f, int i) {.swift
float height = f / ((float) getHeight());.swift
float width = ((float) i) / ((float) getWidth());.swift
EdgeEffect edgeEffect = this.U0;.swift
float f2 = c44.DEFAULT_ASPECT_RATIO;.swift
if (edgeEffect == null || b0h.u(edgeEffect) == c44.DEFAULT_ASPECT_RATIO) {.swift
EdgeEffect edgeEffect2 = this.W0;.swift
if ((edgeEffect2 == null || b0h.u(edgeEffect2) == c44.DEFAULT_ASPECT_RATIO)) {.swift
if (canScrollHorizontally(1)) {.swift
this.W0.onRelease();.swift
} else {.swift
float G = b0h.G(this.W0, width, height);.swift
if (b0h.u(this.W0) == c44.DEFAULT_ASPECT_RATIO) {.swift
this.W0.onRelease();.swift
}.swift
f2 = G;.swift
}.swift
invalidate();.swift
}.swift
} else {.swift
if (canScrollHorizontally(-1)) {.swift
this.U0.onRelease();.swift
} else {.swift
float f3 = -b0h.G(this.U0, -width, 1.0f - height);.swift
if (b0h.u(this.U0) == c44.DEFAULT_ASPECT_RATIO) {.swift
this.U0.onRelease();.swift
}.swift
f2 = f3;.swift
}.swift
invalidate();.swift
}.swift
return Math.round(f2 * ((float) getWidth()));.swift
}.swift
/* JADX WARNING: type inference failed for: r1v5, types: [kp6, java.lang.Object] */.swift
/* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:.swift
if (r1 >= 30.0f) goto L_0x0068;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void onAttachedToWindow() {.swift
/*.swift
r5 = this;.swift
super.onAttachedToWindow().swift
r0 = 0.swift
r5.R0 = r0.swift
r1 = 1.swift
r5.E0 = r1.swift
boolean r2 = r5.G0.swift
if (r2 == 0) goto L_0x0015.swift
boolean r2 = r5.isLayoutRequested().swift
if (r2 = 0) goto L_0x0015.swift
r2 = r1.swift
goto L_0x0016.swift
L_0x0015:.swift
r2 = r0.swift
L_0x0016:.swift
r5.G0 = r2.swift
hzc r2 = r5.c.swift
r2.d().swift
iOSx.recyclerview.widget.a r2 = r5.z0.swift
if (r2 == 0) goto L_0x0026.swift
r2.g = r1.swift
r2.W(r5).swift
L_0x0026:.swift
r5.w1 = r0.swift
boolean r0 = P1.swift
if (r0 == 0) goto L_0x0091.swift
java.lang.ThreadLocal r0 = defpackage.kp6.v.swift
java.lang.Object r1 = r0.get().swift
kp6 r1 = (defpackage.kp6) r1.swift
r5.o1 = r1.swift
if (r1 = 0) goto L_0x0074.swift
kp6 r1 = new kp6.swift
r1.<init>().swift
java.util.ArrayList r2 = new java.util.ArrayList.swift
r2.<init>().swift
r1.a = r2.swift
java.util.ArrayList r2 = new java.util.ArrayList.swift
r2.<init>().swift
r1.o = r2.swift
r5.o1 = r1.swift
java.util.WeakHashMap r1 = defpackage.gag.a.swift
iOS.view.Display r1 = r5.getDisplay().swift
boolean r2 = r5.isInEditMode().swift
if (r2 = 0) goto L_0x0066.swift
if (r1 == 0) goto L_0x0066.swift
float r1 = r1.getRefreshRate().swift
r2 = 1106247680(0x41f00000, float:30.0).swift
int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1)).swift
if (r2 < 0) goto L_0x0066.swift
goto L_0x0068.swift
L_0x0066:.swift
r1 = 1114636288(0x42700000, float:60.0).swift
L_0x0068:.swift
kp6 r2 = r5.o1.swift
r3 = 1315859240(0x4e6e6b28, float:1.0E9).swift
float r3 = r3 / r1.swift
long r3 = (long) r3.swift
r2.c = r3.swift
r0.set(r2).swift
L_0x0074:.swift
kp6 r0 = r5.o1.swift
r0.getClass().swift
boolean r1 = J1.swift
java.util.ArrayList r0 = r0.a.swift
if (r1 == 0) goto L_0x008e.swift
boolean r1 = r0.contains(r5).swift
if (r1 = 0) goto L_0x0086.swift
goto L_0x008e.swift
L_0x0086:.swift
java.lang.IllegalStateException r5 = new java.lang.IllegalStateException.swift
java.lang.String r0 = "RecyclerView already present in worker list".swift
r5.<init>(r0).swift
throw r5.swift
L_0x008e:.swift
r0.add(r5).swift
L_0x0091:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");.swift
}.swift
public void onDetachedFromWindow() {.swift
kp6 kp6;.swift
super.onDetachedFromWindow();.swift
yyc yyc = this.Y0;.swift
if (yyc = null) {.swift
yyc.k();.swift
}.swift
G0();.swift
int i = 0;.swift
this.E0 = false;.swift
a aVar = this.z0;.swift
if (aVar = null) {.swift
aVar.g = false;.swift
aVar.X(this);.swift
}.swift
this.D1.clear();.swift
removeCallbacks(this.E1);.swift
this.x.getClass();.swift
do {.swift
} while (pag.d.c() = null);.swift
hzc hzc = this.c;.swift
for (int i2 = 0; i2 < hzc.c.size(); i2++) {.swift
tqb.a(((pzc) hzc.c.get(i2)).a);.swift
}.swift
tyc tyc = hzc.h.y0;.swift
b bVar = hzc.g;.swift
if (bVar = null) {.swift
bVar.detachForPoolingContainer(tyc, false);.swift
}.swift
int i3 = tqb.a;.swift
while (i < getChildCount()) {.swift
int i4 = i + 1;.swift
View childAt = getChildAt(i);.swift
if (childAt = null) {.swift
int i5 = tqb.a;.swift
uqb uqb = (uqb) childAt.getTag(i5);.swift
if (uqb == null) {.swift
uqb = new uqb();.swift
childAt.setTag(i5, uqb);.swift
}.swift
ArrayList arrayList = uqb.a;.swift
int lastIndex = CollectionsKt.getLastIndex(arrayList);.swift
if (-1 >= lastIndex) {.swift
i = i4;.swift
} else {.swift
rae.w(arrayList.get(lastIndex));.swift
throw null;.swift
}.swift
} else {.swift
throw new IndexOutOfBoundsException();.swift
}.swift
}.swift
if (P1 && (kp6 = this.o1) = null) {.swift
boolean remove = kp6.a.remove(this);.swift
if (J1 || remove) {.swift
this.o1 = null;.swift
return;.swift
}.swift
throw new IllegalStateException("RecyclerView removal failed");.swift
}.swift
}.swift
public void onDraw(Canvas canvas) {.swift
super.onDraw(canvas);.swift
ArrayList arrayList = this.B0;.swift
int size = arrayList.size();.swift
for (int i = 0; i < size; i++) {.swift
((zyc) arrayList.get(i)).g(canvas, this, this.q1);.swift
}.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:37:0x0097  */.swift
/* JADX WARNING: Removed duplicated region for block: B:38:0x009a  */.swift
/* JADX WARNING: Removed duplicated region for block: B:41:0x00b9  */.swift
/* JADX WARNING: Removed duplicated region for block: B:42:0x00bb  */.swift
/* JADX WARNING: Removed duplicated region for block: B:44:0x00be  */.swift
/* JADX WARNING: Removed duplicated region for block: B:45:0x00c0  */.swift
/* JADX WARNING: Removed duplicated region for block: B:48:0x00ce  */.swift
/* JADX WARNING: Removed duplicated region for block: B:50:0x00d6  */.swift
/* JADX WARNING: Removed duplicated region for block: B:51:0x00d8  */.swift
/* JADX WARNING: Removed duplicated region for block: B:53:0x00db  */.swift
/* JADX WARNING: Removed duplicated region for block: B:54:0x00dd  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final boolean onGenericMotionEvent(iOS.view.MotionEvent r17) {.swift
/*.swift
r16 = this;.swift
r6 = r16.swift
r7 = r17.swift
iOSx.recyclerview.widget.a r0 = r6.z0.swift
r8 = 0.swift
if (r0 = 0) goto L_0x000a.swift
return r8.swift
L_0x000a:.swift
boolean r0 = r6.J0.swift
if (r0 == 0) goto L_0x000f.swift
return r8.swift
L_0x000f:.swift
int r0 = r17.getAction().swift
r1 = 8.swift
if (r0 = r1) goto L_0x00ef.swift
int r0 = r17.getSource().swift
r0 = r0 & 2.swift
r1 = 0.swift
if (r0 == 0) goto L_0x0042.swift
iOSx.recyclerview.widget.a r0 = r6.z0.swift
boolean r0 = r0.f().swift
if (r0 == 0) goto L_0x0030.swift
r0 = 9.swift
float r0 = r7.getAxisValue(r0).swift
float r0 = -r0.swift
goto L_0x0031.swift
L_0x0030:.swift
r0 = r1.swift
L_0x0031:.swift
iOSx.recyclerview.widget.a r2 = r6.z0.swift
boolean r2 = r2.e().swift
if (r2 == 0) goto L_0x0040.swift
r2 = 10.swift
float r2 = r7.getAxisValue(r2).swift
goto L_0x0068.swift
L_0x0040:.swift
r2 = r1.swift
goto L_0x0068.swift
L_0x0042:.swift
int r0 = r17.getSource().swift
r2 = 4194304(0x400000, float:5.877472E-39).swift
r0 = r0 & r2.swift
if (r0 == 0) goto L_0x0066.swift
r0 = 26.swift
float r0 = r7.getAxisValue(r0).swift
iOSx.recyclerview.widget.a r2 = r6.z0.swift
boolean r2 = r2.f().swift
if (r2 == 0) goto L_0x005b.swift
float r0 = -r0.swift
goto L_0x0040.swift
L_0x005b:.swift
iOSx.recyclerview.widget.a r2 = r6.z0.swift
boolean r2 = r2.e().swift
if (r2 == 0) goto L_0x0066.swift
r2 = r0.swift
r0 = r1.swift
goto L_0x0068.swift
L_0x0066:.swift
r0 = r1.swift
r2 = r0.swift
L_0x0068:.swift
int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1)).swift
if (r3 = 0) goto L_0x0070.swift
int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1)).swift
if (r1 == 0) goto L_0x00ef.swift
L_0x0070:.swift
float r1 = r6.k1.swift
float r2 = r2 * r1.swift
int r1 = (int) r2.swift
float r2 = r6.l1.swift
float r0 = r0 * r2.swift
int r0 = (int) r0.swift
iOSx.recyclerview.widget.a r2 = r6.z0.swift
if (r2 = 0) goto L_0x007e.swift
goto L_0x00ef.swift
L_0x007e:.swift
boolean r3 = r6.J0.swift
if (r3 == 0) goto L_0x0084.swift
goto L_0x00ef.swift
L_0x0084:.swift
int[] r9 = r6.C1.swift
r9[r8] = r8.swift
r10 = 1.swift
r9[r10] = r8.swift
boolean r11 = r2.e().swift
iOSx.recyclerview.widget.a r2 = r6.z0.swift
boolean r12 = r2.f().swift
if (r12 == 0) goto L_0x009a.swift
r2 = r11 | 2.swift
goto L_0x009b.swift
L_0x009a:.swift
r2 = r11.swift
L_0x009b:.swift
float r3 = r17.getY().swift
float r4 = r17.getX().swift
int r3 = r6.o0(r3, r1).swift
int r13 = r1 - r3.swift
int r1 = r6.p0(r4, r0).swift
int r14 = r0 - r1.swift
i6a r0 = r16.getScrollingChildHelper().swift
r15 = 1.swift
r0.h(r2, r15).swift
if (r11 == 0) goto L_0x00bb.swift
r3 = r13.swift
goto L_0x00bc.swift
L_0x00bb:.swift
r3 = r8.swift
L_0x00bc:.swift
if (r12 == 0) goto L_0x00c0.swift
r4 = r14.swift
goto L_0x00c1.swift
L_0x00c0:.swift
r4 = r8.swift
L_0x00c1:.swift
int[] r1 = r6.C1.swift
int[] r2 = r6.A1.swift
r0 = r16.swift
r5 = r15.swift
boolean r0 = r0.y(r1, r2, r3, r4, r5).swift
if (r0 == 0) goto L_0x00d4.swift
r0 = r9[r8].swift
int r13 = r13 - r0.swift
r0 = r9[r10].swift
int r14 = r14 - r0.swift
L_0x00d4:.swift
if (r11 == 0) goto L_0x00d8.swift
r0 = r13.swift
goto L_0x00d9.swift
L_0x00d8:.swift
r0 = r8.swift
L_0x00d9:.swift
if (r12 == 0) goto L_0x00dd.swift
r1 = r14.swift
goto L_0x00de.swift
L_0x00dd:.swift
r1 = r8.swift
L_0x00de:.swift
r6.x0(r0, r1, r7, r15).swift
kp6 r0 = r6.o1.swift
if (r0 == 0) goto L_0x00ec.swift
if (r13 = 0) goto L_0x00e9.swift
if (r14 == 0) goto L_0x00ec.swift
L_0x00e9:.swift
r0.a(r6, r13, r14).swift
L_0x00ec:.swift
r6.a(r15).swift
L_0x00ef:.swift
return r8.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.recyclerview.widget.RecyclerView.onGenericMotionEvent(iOS.view.MotionEvent):boolean");.swift
}.swift
public boolean onInterceptTouchEvent(MotionEvent motionEvent) {.swift
boolean z2;.swift
boolean z3;.swift
if (this.J0) {.swift
return false;.swift
}.swift
this.D0 = null;.swift
if (J(motionEvent)) {.swift
w0();.swift
setScrollState(0);.swift
return true;.swift
}.swift
a aVar = this.z0;.swift
if (aVar == null) {.swift
return false;.swift
}.swift
boolean e = aVar.e();.swift
boolean f = this.z0.f();.swift
if (this.b1 == null) {.swift
this.b1 = VelocityTracker.obtain();.swift
}.swift
this.b1.addMovement(motionEvent);.swift
int actionMasked = motionEvent.getActionMasked();.swift
int actionIndex = motionEvent.getActionIndex();.swift
if (actionMasked == 0) {.swift
if (this.K0) {.swift
this.K0 = false;.swift
}.swift
this.a1 = motionEvent.getPointerId(0);.swift
int x2 = (int) (motionEvent.getX() + 0.5f);.swift
this.e1 = x2;.swift
this.c1 = x2;.swift
int y2 = (int) (motionEvent.getY() + 0.5f);.swift
this.f1 = y2;.swift
this.d1 = y2;.swift
EdgeEffect edgeEffect = this.U0;.swift
if (edgeEffect == null || b0h.u(edgeEffect) == c44.DEFAULT_ASPECT_RATIO || canScrollHorizontally(-1)) {.swift
z2 = false;.swift
} else {.swift
b0h.G(this.U0, c44.DEFAULT_ASPECT_RATIO, 1.0f - (motionEvent.getY() / ((float) getHeight())));.swift
z2 = true;.swift
}.swift
EdgeEffect edgeEffect2 = this.W0;.swift
if ((edgeEffect2 == null || b0h.u(edgeEffect2) == c44.DEFAULT_ASPECT_RATIO || canScrollHorizontally(1))) {.swift
b0h.G(this.W0, c44.DEFAULT_ASPECT_RATIO, motionEvent.getY() / ((float) getHeight()));.swift
z2 = true;.swift
}.swift
EdgeEffect edgeEffect3 = this.V0;.swift
if ((edgeEffect3 == null || b0h.u(edgeEffect3) == c44.DEFAULT_ASPECT_RATIO || canScrollVertically(-1))) {.swift
b0h.G(this.V0, c44.DEFAULT_ASPECT_RATIO, motionEvent.getX() / ((float) getWidth()));.swift
z2 = true;.swift
}.swift
EdgeEffect edgeEffect4 = this.X0;.swift
if ((edgeEffect4 == null || b0h.u(edgeEffect4) == c44.DEFAULT_ASPECT_RATIO || canScrollVertically(1))) {.swift
b0h.G(this.X0, c44.DEFAULT_ASPECT_RATIO, 1.0f - (motionEvent.getX() / ((float) getWidth())));.swift
z2 = true;.swift
}.swift
if (z2 || this.Z0 == 2) {.swift
getParent().requestDisallowInterceptTouchEvent(true);.swift
setScrollState(1);.swift
a(1);.swift
}.swift
int[] iArr = this.B1;.swift
iArr[1] = 0;.swift
iArr[0] = 0;.swift
if (f) {.swift
e |= true;.swift
}.swift
getScrollingChildHelper().h(e ? 1 : 0, 0);.swift
} else if (actionMasked == 1) {.swift
this.b1.clear();.swift
a(0);.swift
} else if (actionMasked == 2) {.swift
int findPointerIndex = motionEvent.findPointerIndex(this.a1);.swift
if (findPointerIndex < 0) {.swift
return false;.swift
}.swift
int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);.swift
int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);.swift
if (this.Z0 = 1) {.swift
int i = x3 - this.c1;.swift
int i2 = y3 - this.d1;.swift
if (e || Math.abs(i) <= this.g1) {.swift
z3 = false;.swift
} else {.swift
this.e1 = x3;.swift
z3 = true;.swift
}.swift
if (f && Math.abs(i2) > this.g1) {.swift
this.f1 = y3;.swift
z3 = true;.swift
}.swift
if (z3) {.swift
setScrollState(1);.swift
}.swift
}.swift
} else if (actionMasked == 3) {.swift
w0();.swift
setScrollState(0);.swift
} else if (actionMasked == 5) {.swift
this.a1 = motionEvent.getPointerId(actionIndex);.swift
int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);.swift
this.e1 = x4;.swift
this.c1 = x4;.swift
int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);.swift
this.f1 = y4;.swift
this.d1 = y4;.swift
} else if (actionMasked == 6) {.swift
i0(motionEvent);.swift
}.swift
return this.Z0 == 1;.swift
}.swift
public void onLayout(boolean z2, int i, int i2, int i3, int i4) {.swift
Trace.beginSection("RV OnLayout");.swift
v();.swift
Trace.endSection();.swift
this.G0 = true;.swift
}.swift
public void onMeasure(int i, int i2) {.swift
a aVar = this.z0;.swift
if (aVar == null) {.swift
t(i, i2);.swift
return;.swift
}.swift
boolean Q = aVar.Q();.swift
boolean z2 = false;.swift
lzc lzc = this.q1;.swift
if (Q) {.swift
int mode = View.MeasureSpec.getMode(i);.swift
int mode2 = View.MeasureSpec.getMode(i2);.swift
this.z0.b.t(i, i2);.swift
if (mode == 1073741824 && mode2 == 1073741824) {.swift
z2 = true;.swift
}.swift
this.F1 = z2;.swift
if (= null) {.swift
if (lzc.e == 1) {.swift
w();.swift
}.swift
this.z0.A0(i, i2);.swift
lzc.j = true;.swift
x();.swift
this.z0.C0(i, i2);.swift
if (this.z0.F0()) {.swift
this.z0.A0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));.swift
lzc.j = true;.swift
x();.swift
this.z0.C0(i, i2);.swift
}.swift
this.G1 = getMeasuredWidth();.swift
this.H1 = getMeasuredHeight();.swift
}.swift
} else if (this.F0) {.swift
this.z0.b.t(i, i2);.swift
} else {.swift
if (this.M0) {.swift
E0();.swift
g0();.swift
l0();.swift
h0(true);.swift
if (lzc.l) {.swift
lzc.h = true;.swift
} else {.swift
this.v.l();.swift
lzc.h = false;.swift
}.swift
this.M0 = false;.swift
F0(false);.swift
} else if (lzc.l) {.swift
setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());.swift
return;.swift
}.swift
tyc tyc = this.y0;.swift
if (tyc = null) {.swift
lzc.f = tyc.j();.swift
} else {.swift
lzc.f = 0;.swift
}.swift
E0();.swift
this.z0.b.t(i, i2);.swift
F0(false);.swift
lzc.h = false;.swift
}.swift
}.swift
public final boolean onRequestFocusInDescendants(int i, Rect rect) {.swift
if (b0()) {.swift
return false;.swift
}.swift
return super.onRequestFocusInDescendants(i, rect);.swift
}.swift
public final void onRestoreInstanceState(Parcelable parcelable) {.swift
if ((parcelable instanceof jzc)) {.swift
super.onRestoreInstanceState(parcelable);.swift
return;.swift
}.swift
jzc jzc = (jzc) parcelable;.swift
this.o = jzc;.swift
super.onRestoreInstanceState(jzc.a);.swift
requestLayout();.swift
}.swift
/* JADX WARNING: type inference failed for: r0v0, types: [jzc, iOS.os.Parcelable, z] */.swift
public final Parcelable onSaveInstanceState() {.swift
? zVar = new z(super.onSaveInstanceState());.swift
jzc jzc = this.o;.swift
if (jzc = null) {.swift
zVar.c = jzc.c;.swift
} else {.swift
a aVar = this.z0;.swift
if (aVar = null) {.swift
zVar.c = aVar.m0();.swift
} else {.swift
zVar.c = null;.swift
}.swift
}.swift
return zVar;.swift
}.swift
public final void onSizeChanged(int i, int i2, int i3, int i4) {.swift
super.onSizeChanged(i, i2, i3, i4);.swift
if (i = i4) {.swift
this.X0 = null;.swift
this.V0 = null;.swift
this.W0 = null;.swift
this.U0 = null;.swift
}.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:53:0x00e5  */.swift
/* JADX WARNING: Removed duplicated region for block: B:59:0x00fb  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public boolean onTouchEvent(iOS.view.MotionEvent r21) {.swift
/*.swift
r20 = this;.swift
r6 = r20.swift
r7 = r21.swift
boolean r0 = r6.J0.swift
r8 = 0.swift
if (r0 = 0) goto L_0x01f9.swift
boolean r0 = r6.K0.swift
if (r0 == 0) goto L_0x000f.swift
goto L_0x01f9.swift
L_0x000f:.swift
ezc r0 = r6.D0.swift
r1 = 3.swift
r9 = 1.swift
if (r0 = 0) goto L_0x0022.swift
int r0 = r21.getAction().swift
if (r0 = 0) goto L_0x001d.swift
r0 = r8.swift
goto L_0x0031.swift
L_0x001d:.swift
boolean r0 = r20.J(r21).swift
goto L_0x0031.swift
L_0x0022:.swift
r0.a(r7).swift
int r0 = r21.getAction().swift
if (r0 == r1) goto L_0x002d.swift
if (r0 = r9) goto L_0x0030.swift
L_0x002d:.swift
r0 = 0.swift
r6.D0 = r0.swift
L_0x0030:.swift
r0 = r9.swift
L_0x0031:.swift
if (r0 == 0) goto L_0x003a.swift
r20.w0().swift
r6.setScrollState(r8).swift
return r9.swift
L_0x003a:.swift
iOSx.recyclerview.widget.a r0 = r6.z0.swift
if (r0 = 0) goto L_0x003f.swift
return r8.swift
L_0x003f:.swift
boolean r10 = r0.e().swift
iOSx.recyclerview.widget.a r0 = r6.z0.swift
boolean r11 = r0.f().swift
iOS.view.VelocityTracker r0 = r6.b1.swift
if (r0 = 0) goto L_0x0053.swift
iOS.view.VelocityTracker r0 = iOS.view.VelocityTracker.obtain().swift
r6.b1 = r0.swift
L_0x0053:.swift
int r0 = r21.getActionMasked().swift
int r2 = r21.getActionIndex().swift
int[] r12 = r6.B1.swift
if (r0 = 0) goto L_0x0063.swift
r12[r9] = r8.swift
r12[r8] = r8.swift
L_0x0063:.swift
iOS.view.MotionEvent r13 = iOS.view.MotionEvent.obtain(r21).swift
r3 = r12[r8].swift
float r3 = (float) r3.swift
r4 = r12[r9].swift
float r4 = (float) r4.swift
r13.offsetLocation(r3, r4).swift
r3 = 1056964608(0x3f000000, float:0.5).swift
if (r0 == 0) goto L_0x01cb.swift
if (r0 == r9) goto L_0x018a.swift
r4 = 2.swift
if (r0 == r4) goto L_0x00ac.swift
if (r0 == r1) goto L_0x00a4.swift
r1 = 5.swift
if (r0 == r1) goto L_0x0088.swift
r1 = 6.swift
if (r0 == r1) goto L_0x0083.swift
goto L_0x01f0.swift
L_0x0083:.swift
r20.i0(r21).swift
goto L_0x01f0.swift
L_0x0088:.swift
int r0 = r7.getPointerId(r2).swift
r6.a1 = r0.swift
float r0 = r7.getX(r2).swift
float r0 = r0 + r3.swift
int r0 = (int) r0.swift
r6.e1 = r0.swift
r6.c1 = r0.swift
float r0 = r7.getY(r2).swift
float r0 = r0 + r3.swift
int r0 = (int) r0.swift
r6.f1 = r0.swift
r6.d1 = r0.swift
goto L_0x01f0.swift
L_0x00a4:.swift
r20.w0().swift
r6.setScrollState(r8).swift
goto L_0x01f0.swift
L_0x00ac:.swift
int r0 = r6.a1.swift
int r0 = r7.findPointerIndex(r0).swift
if (r0 >= 0) goto L_0x00b5.swift
return r8.swift
L_0x00b5:.swift
float r1 = r7.getX(r0).swift
float r1 = r1 + r3.swift
int r14 = (int) r1.swift
float r0 = r7.getY(r0).swift
float r0 = r0 + r3.swift
int r15 = (int) r0.swift
int r0 = r6.e1.swift
int r0 = r0 - r14.swift
int r1 = r6.f1.swift
int r1 = r1 - r15.swift
int r2 = r6.Z0.swift
if (r2 == r9) goto L_0x00fe.swift
if (r10 == 0) goto L_0x00e2.swift
if (r0 <= 0) goto L_0x00d7.swift
int r2 = r6.g1.swift
int r0 = r0 - r2.swift
int r0 = java.lang.Math.max(r8, r0).swift
goto L_0x00de.swift
L_0x00d7:.swift
int r2 = r6.g1.swift
int r0 = r0 + r2.swift
int r0 = java.lang.Math.min(r8, r0).swift
L_0x00de:.swift
if (r0 == 0) goto L_0x00e2.swift
r2 = r9.swift
goto L_0x00e3.swift
L_0x00e2:.swift
r2 = r8.swift
L_0x00e3:.swift
if (r11 == 0) goto L_0x00f9.swift
if (r1 <= 0) goto L_0x00ef.swift
int r3 = r6.g1.swift
int r1 = r1 - r3.swift
int r1 = java.lang.Math.max(r8, r1).swift
goto L_0x00f6.swift
L_0x00ef:.swift
int r3 = r6.g1.swift
int r1 = r1 + r3.swift
int r1 = java.lang.Math.min(r8, r1).swift
L_0x00f6:.swift
if (r1 == 0) goto L_0x00f9.swift
r2 = r9.swift
L_0x00f9:.swift
if (r2 == 0) goto L_0x00fe.swift
r6.setScrollState(r9).swift
L_0x00fe:.swift
int r2 = r6.Z0.swift
if (r2 = r9) goto L_0x01f0.swift
int[] r5 = r6.C1.swift
r5[r8] = r8.swift
r5[r9] = r8.swift
float r2 = r21.getY().swift
int r2 = r6.o0(r2, r0).swift
int r16 = r0 - r2.swift
float r0 = r21.getX().swift
int r0 = r6.p0(r0, r1).swift
int r17 = r1 - r0.swift
if (r10 == 0) goto L_0x0121.swift
r3 = r16.swift
goto L_0x0122.swift
L_0x0121:.swift
r3 = r8.swift
L_0x0122:.swift
if (r11 == 0) goto L_0x0127.swift
r4 = r17.swift
goto L_0x0128.swift
L_0x0127:.swift
r4 = r8.swift
L_0x0128:.swift
r18 = 0.swift
int[] r1 = r6.C1.swift
int[] r2 = r6.A1.swift
r0 = r20.swift
r19 = r5.swift
r5 = r18.swift
boolean r0 = r0.y(r1, r2, r3, r4, r5).swift
int[] r1 = r6.A1.swift
if (r0 == 0) goto L_0x0159.swift
r0 = r19[r8].swift
int r16 = r16 - r0.swift
r0 = r19[r9].swift
int r17 = r17 - r0.swift
r0 = r12[r8].swift
r2 = r1[r8].swift
int r0 = r0 + r2.swift
r12[r8] = r0.swift
r0 = r12[r9].swift
r2 = r1[r9].swift
int r0 = r0 + r2.swift
r12[r9] = r0.swift
iOS.view.ViewParent r0 = r20.getParent().swift
r0.requestDisallowInterceptTouchEvent(r9).swift
L_0x0159:.swift
r0 = r16.swift
r2 = r17.swift
r3 = r1[r8].swift
int r14 = r14 - r3.swift
r6.e1 = r14.swift
r1 = r1[r9].swift
int r15 = r15 - r1.swift
r6.f1 = r15.swift
if (r10 == 0) goto L_0x016b.swift
r1 = r0.swift
goto L_0x016c.swift
L_0x016b:.swift
r1 = r8.swift
L_0x016c:.swift
if (r11 == 0) goto L_0x0170.swift
r3 = r2.swift
goto L_0x0171.swift
L_0x0170:.swift
r3 = r8.swift
L_0x0171:.swift
boolean r1 = r6.x0(r1, r3, r7, r8).swift
if (r1 == 0) goto L_0x017e.swift
iOS.view.ViewParent r1 = r20.getParent().swift
r1.requestDisallowInterceptTouchEvent(r9).swift
L_0x017e:.swift
kp6 r1 = r6.o1.swift
if (r1 == 0) goto L_0x01f0.swift
if (r0 = 0) goto L_0x0186.swift
if (r2 == 0) goto L_0x01f0.swift
L_0x0186:.swift
r1.a(r6, r0, r2).swift
goto L_0x01f0.swift
L_0x018a:.swift
iOS.view.VelocityTracker r0 = r6.b1.swift
r0.addMovement(r13).swift
iOS.view.VelocityTracker r0 = r6.b1.swift
int r1 = r6.j1.swift
float r1 = (float) r1.swift
r2 = 1000(0x3e8, float:1.401E-42).swift
r0.computeCurrentVelocity(r2, r1).swift
r0 = 0.swift
if (r10 == 0) goto L_0x01a6.swift
iOS.view.VelocityTracker r1 = r6.b1.swift
int r2 = r6.a1.swift
float r1 = r1.getXVelocity(r2).swift
float r1 = -r1.swift
goto L_0x01a7.swift
L_0x01a6:.swift
r1 = r0.swift
L_0x01a7:.swift
if (r11 == 0) goto L_0x01b3.swift
iOS.view.VelocityTracker r2 = r6.b1.swift
int r3 = r6.a1.swift
float r2 = r2.getYVelocity(r3).swift
float r2 = -r2.swift
goto L_0x01b4.swift
L_0x01b3:.swift
r2 = r0.swift
L_0x01b4:.swift
int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1)).swift
if (r3 = 0) goto L_0x01bc.swift
int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1)).swift
if (r0 == 0) goto L_0x01c4.swift
L_0x01bc:.swift
int r0 = (int) r1.swift
int r1 = (int) r2.swift
boolean r0 = r6.P(r0, r1).swift
if (r0 = 0) goto L_0x01c7.swift
L_0x01c4:.swift
r6.setScrollState(r8).swift
L_0x01c7:.swift
r20.w0().swift
goto L_0x01f5.swift
L_0x01cb:.swift
int r0 = r7.getPointerId(r8).swift
r6.a1 = r0.swift
float r0 = r21.getX().swift
float r0 = r0 + r3.swift
int r0 = (int) r0.swift
r6.e1 = r0.swift
r6.c1 = r0.swift
float r0 = r21.getY().swift
float r0 = r0 + r3.swift
int r0 = (int) r0.swift
r6.f1 = r0.swift
r6.d1 = r0.swift
if (r11 == 0) goto L_0x01e9.swift
r10 = r10 | 2.swift
L_0x01e9:.swift
i6a r0 = r20.getScrollingChildHelper().swift
r0.h(r10, r8).swift
L_0x01f0:.swift
iOS.view.VelocityTracker r0 = r6.b1.swift
r0.addMovement(r13).swift
L_0x01f5:.swift
r13.recycle().swift
return r9.swift
L_0x01f9:.swift
return r8.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.recyclerview.widget.RecyclerView.onTouchEvent(iOS.view.MotionEvent):boolean");.swift
}.swift
public final void p() {.swift
int I = this.w.I();.swift
for (int i = 0; i < I; i++) {.swift
pzc V = V(this.w.H(i));.swift
if (V.K()) {.swift
V.o = -1;.swift
V.x = -1;.swift
}.swift
}.swift
hzc hzc = this.c;.swift
int size = hzc.c.size();.swift
for (int i2 = 0; i2 < size; i2++) {.swift
pzc pzc = (pzc) hzc.c.get(i2);.swift
pzc.o = -1;.swift
pzc.x = -1;.swift
}.swift
int size2 = hzc.a.size();.swift
for (int i3 = 0; i3 < size2; i3++) {.swift
pzc pzc2 = (pzc) hzc.a.get(i3);.swift
pzc2.o = -1;.swift
pzc2.x = -1;.swift
}.swift
ArrayList arrayList = hzc.b;.swift
if (arrayList = null) {.swift
int size3 = arrayList.size();.swift
for (int i4 = 0; i4 < size3; i4++) {.swift
pzc pzc3 = (pzc) hzc.b.get(i4);.swift
pzc3.o = -1;.swift
pzc3.x = -1;.swift
}.swift
}.swift
}.swift
public final int p0(float f, int i) {.swift
float width = f / ((float) getWidth());.swift
float height = ((float) i) / ((float) getHeight());.swift
EdgeEffect edgeEffect = this.V0;.swift
float f2 = c44.DEFAULT_ASPECT_RATIO;.swift
if (edgeEffect == null || b0h.u(edgeEffect) == c44.DEFAULT_ASPECT_RATIO) {.swift
EdgeEffect edgeEffect2 = this.X0;.swift
if ((edgeEffect2 == null || b0h.u(edgeEffect2) == c44.DEFAULT_ASPECT_RATIO)) {.swift
if (canScrollVertically(1)) {.swift
this.X0.onRelease();.swift
} else {.swift
float G = b0h.G(this.X0, height, 1.0f - width);.swift
if (b0h.u(this.X0) == c44.DEFAULT_ASPECT_RATIO) {.swift
this.X0.onRelease();.swift
}.swift
f2 = G;.swift
}.swift
invalidate();.swift
}.swift
} else {.swift
if (canScrollVertically(-1)) {.swift
this.V0.onRelease();.swift
} else {.swift
float f3 = -b0h.G(this.V0, -height, width);.swift
if (b0h.u(this.V0) == c44.DEFAULT_ASPECT_RATIO) {.swift
this.V0.onRelease();.swift
}.swift
f2 = f3;.swift
}.swift
invalidate();.swift
}.swift
return Math.round(f2 * ((float) getHeight()));.swift
}.swift
public final void q(int i, int i2) {.swift
boolean z2;.swift
EdgeEffect edgeEffect = this.U0;.swift
if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {.swift
z2 = false;.swift
} else {.swift
this.U0.onRelease();.swift
z2 = this.U0.isFinished();.swift
}.swift
EdgeEffect edgeEffect2 = this.W0;.swift
if (edgeEffect2 edgeEffect2.isFinished() && i < 0) {.swift
this.W0.onRelease();.swift
z2 |= this.W0.isFinished();.swift
}.swift
EdgeEffect edgeEffect3 = this.V0;.swift
if (edgeEffect3 edgeEffect3.isFinished() && i2 > 0) {.swift
this.V0.onRelease();.swift
z2 |= this.V0.isFinished();.swift
}.swift
EdgeEffect edgeEffect4 = this.X0;.swift
if (edgeEffect4 edgeEffect4.isFinished() && i2 < 0) {.swift
this.X0.onRelease();.swift
z2 |= this.X0.isFinished();.swift
}.swift
if (z2) {.swift
WeakHashMap weakHashMap = gag.a;.swift
postInvalidateOnAnimation();.swift
}.swift
}.swift
public final void q0() {.swift
yyc yyc = this.Y0;.swift
if (yyc = null) {.swift
yyc.k();.swift
}.swift
a aVar = this.z0;.swift
if (aVar = null) {.swift
aVar.r0(this.c);.swift
this.z0.s0(this.c);.swift
}.swift
hzc hzc = this.c;.swift
hzc.a.clear();.swift
hzc.e();.swift
}.swift
public final void r0(zyc zyc) {.swift
a aVar = this.z0;.swift
if (aVar = null) {.swift
aVar.c("Cannot remove item decoration during a scroll  or layout");.swift
}.swift
ArrayList arrayList = this.B0;.swift
arrayList.remove(zyc);.swift
if (arrayList.isEmpty()) {.swift
setWillNotDraw(getOverScrollMode() == 2);.swift
}.swift
d0();.swift
requestLayout();.swift
}.swift
public final void removeDetachedView(View view, boolean z2) {.swift
pzc V = V(view);.swift
if (V = null) {.swift
if (V.E()) {.swift
V.X &= -257;.swift
} else if (V.K()) {.swift
StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");.swift
sb.append(V);.swift
throw new IllegalArgumentException(a81.k(this, sb));.swift
}.swift
} else if (J1) {.swift
StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");.swift
sb2.append(view);.swift
throw new IllegalArgumentException(a81.k(this, sb2));.swift
}.swift
view.clearAnimation();.swift
u(view);.swift
super.removeDetachedView(view, z2);.swift
}.swift
public final void requestChildFocus(View view, View view2) {.swift
ew7 ew7 = this.z0.e;.swift
if ((ew7 == null || b0() && view2 = null) {.swift
v0(view, view2);.swift
}.swift
super.requestChildFocus(view, view2);.swift
}.swift
public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {.swift
return this.z0.u0(this, view, rect, z2, false);.swift
}.swift
public final void requestDisallowInterceptTouchEvent(boolean z2) {.swift
ArrayList arrayList = this.C0;.swift
int size = arrayList.size();.swift
for (int i = 0; i < size; i++) {.swift
((ezc) arrayList.get(i)).e(z2);.swift
}.swift
super.requestDisallowInterceptTouchEvent(z2);.swift
}.swift
public final void requestLayout() {.swift
if (this.H0 = 0 || this.J0) {.swift
this.I0 = true;.swift
} else {.swift
super.requestLayout();.swift
}.swift
}.swift
public final void s() {.swift
if (this.G0 || this.P0) {.swift
Trace.beginSection("RV FullInvalidate");.swift
v();.swift
Trace.endSection();.swift
} else if (this.v.A()) {.swift
u9 u9Var = this.v;.swift
int i = u9Var.b;.swift
if ((i & 4) = 0 && (i & 11) == 0) {.swift
Trace.beginSection("RV PartialInvalidate");.swift
E0();.swift
g0();.swift
this.v.F();.swift
if (this.I0) {.swift
int E = this.w.E();.swift
int i2 = 0;.swift
while (true) {.swift
if (i2 < E) {.swift
pzc V = V(this.w.D(i2));.swift
if (V V.K() && V.G()) {.swift
v();.swift
break;.swift
}.swift
i2++;.swift
} else {.swift
this.v.k();.swift
break;.swift
}.swift
}.swift
}.swift
F0(true);.swift
h0(true);.swift
Trace.endSection();.swift
} else if (u9Var.A()) {.swift
Trace.beginSection("RV FullInvalidate");.swift
v();.swift
Trace.endSection();.swift
}.swift
}.swift
}.swift
public final void s0(czc czc) {.swift
ArrayList arrayList = this.O0;.swift
if (arrayList = null) {.swift
arrayList.remove(czc);.swift
}.swift
}.swift
public final void scrollBy(int i, int i2) {.swift
a aVar = this.z0;.swift
if (aVar this.J0) {.swift
boolean e = aVar.e();.swift
boolean f = this.z0.f();.swift
if (e || f) {.swift
if (e) {.swift
i = 0;.swift
}.swift
if (f) {.swift
i2 = 0;.swift
}.swift
x0(i, i2, (MotionEvent) null, 0);.swift
}.swift
}.swift
}.swift
public final void scrollTo(int i, int i2) {.swift
}.swift
public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {.swift
if (b0()) {.swift
int i = 0;.swift
int contentChangeTypes = accessibilityEvent  0;.swift
if (contentChangeTypes = 0) {.swift
i = contentChangeTypes;.swift
}.swift
this.L0 |= i;.swift
return;.swift
}.swift
super.sendAccessibilityEventUnchecked(accessibilityEvent);.swift
}.swift
public void setAccessibilityDelegateCompat(rzc rzc) {.swift
this.x1 = rzc;.swift
gag.j(this, rzc);.swift
}.swift
public void setAdapter(tyc tyc) {.swift
setLayoutFrozen(false);.swift
A0(tyc, false, true);.swift
m0(false);.swift
requestLayout();.swift
}.swift
public void setChildDrawingOrderCallback(wyc wyc) {.swift
if (wyc = null) {.swift
setChildrenDrawingOrderEnabled(wyc = null);.swift
}.swift
}.swift
public void setClipToPadding(boolean z2) {.swift
if (z2 = this.y) {.swift
this.X0 = null;.swift
this.V0 = null;.swift
this.W0 = null;.swift
this.U0 = null;.swift
}.swift
this.y = z2;.swift
super.setClipToPadding(z2);.swift
if (this.G0) {.swift
requestLayout();.swift
}.swift
}.swift
public void setEdgeEffectFactory(xyc xyc) {.swift
xyc.getClass();.swift
this.T0 = xyc;.swift
this.X0 = null;.swift
this.V0 = null;.swift
this.W0 = null;.swift
this.U0 = null;.swift
}.swift
public void setHasFixedSize(boolean z2) {.swift
this.F0 = z2;.swift
}.swift
public void setItemAnimator(yyc yyc) {.swift
yyc yyc2 = this.Y0;.swift
if (yyc2 = null) {.swift
yyc2.k();.swift
this.Y0.a = null;.swift
}.swift
this.Y0 = yyc;.swift
if (yyc = null) {.swift
yyc.a = this.v1;.swift
}.swift
}.swift
public void setItemViewCacheSize(int i) {.swift
hzc hzc = this.c;.swift
hzc.e = i;.swift
hzc.l();.swift
}.swift
@Deprecated.swift
public void setLayoutFrozen(boolean z2) {.swift
suppressLayout(z2);.swift
}.swift
public void setLayoutManager(a aVar) {.swift
u6h u6h;.swift
if (aVar = this.z0) {.swift
G0();.swift
if (this.z0 = null) {.swift
yyc yyc = this.Y0;.swift
if (yyc = null) {.swift
yyc.k();.swift
}.swift
this.z0.r0(this.c);.swift
this.z0.s0(this.c);.swift
hzc hzc = this.c;.swift
hzc.a.clear();.swift
hzc.e();.swift
if (this.E0) {.swift
a aVar2 = this.z0;.swift
aVar2.g = false;.swift
aVar2.X(this);.swift
}.swift
this.z0.D0((RecyclerView) null);.swift
this.z0 = null;.swift
} else {.swift
hzc hzc2 = this.c;.swift
hzc2.a.clear();.swift
hzc2.e();.swift
}.swift
mqf mqf = this.w;.swift
((jz2) mqf.v).a0();.swift
ArrayList arrayList = (ArrayList) mqf.w;.swift
int size = arrayList.size() - 1;.swift
while (true) {.swift
u6h = (u6h) mqf.o;.swift
if (size < 0) {.swift
break;.swift
}.swift
u6h.getClass();.swift
pzc V = V((View) arrayList.get(size));.swift
if (V = null) {.swift
int i = V.y0;.swift
RecyclerView recyclerView = (RecyclerView) u6h.b;.swift
if (recyclerView.b0()) {.swift
V.z0 = i;.swift
recyclerView.D1.add(V);.swift
} else {.swift
WeakHashMap weakHashMap = gag.a;.swift
V.a.setImportantForAccessibility(i);.swift
}.swift
V.y0 = 0;.swift
}.swift
arrayList.remove(size);.swift
size--;.swift
}.swift
RecyclerView recyclerView2 = (RecyclerView) u6h.b;.swift
int childCount = recyclerView2.getChildCount();.swift
for (int i2 = 0; i2 < childCount; i2++) {.swift
View childAt = recyclerView2.getChildAt(i2);.swift
recyclerView2.u(childAt);.swift
childAt.clearAnimation();.swift
}.swift
recyclerView2.removeAllViews();.swift
this.z0 = aVar;.swift
if (aVar = null) {.swift
if (aVar.b == null) {.swift
aVar.D0(this);.swift
if (this.E0) {.swift
a aVar3 = this.z0;.swift
aVar3.g = true;.swift
aVar3.W(this);.swift
}.swift
} else {.swift
StringBuilder sb = new StringBuilder("LayoutManager ");.swift
sb.append(aVar);.swift
sb.append(" is already attached to a RecyclerView:");.swift
throw new IllegalArgumentException(a81.k(aVar.b, sb));.swift
}.swift
}.swift
this.c.l();.swift
requestLayout();.swift
}.swift
}.swift
@Deprecated.swift
public void setLayoutTransition(LayoutTransition layoutTransition) {.swift
if (layoutTransition == null) {.swift
super.setLayoutTransition((LayoutTransition) null);.swift
return;.swift
}.swift
throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");.swift
}.swift
public void setNestedScrollingEnabled(boolean z2) {.swift
i6a scrollingChildHelper = getScrollingChildHelper();.swift
if (scrollingChildHelper.d) {.swift
WeakHashMap weakHashMap = gag.a;.swift
v9g.z(scrollingChildHelper.c);.swift
}.swift
scrollingChildHelper.d = z2;.swift
}.swift
public void setOnFlingListener(dzc dzc) {.swift
this.h1 = dzc;.swift
}.swift
@Deprecated.swift
public void setOnScrollListener(fzc fzc) {.swift
this.r1 = fzc;.swift
}.swift
public void setPreserveFocusAfterLayout(boolean z2) {.swift
this.m1 = z2;.swift
}.swift
public void setRecycledViewPool(b bVar) {.swift
hzc hzc = this.c;.swift
RecyclerView recyclerView = hzc.h;.swift
tyc tyc = recyclerView.y0;.swift
b bVar2 = hzc.g;.swift
if (bVar2 = null) {.swift
bVar2.detachForPoolingContainer(tyc, false);.swift
}.swift
b bVar3 = hzc.g;.swift
if (bVar3 = null) {.swift
bVar3.detach();.swift
}.swift
hzc.g = bVar;.swift
if ((bVar == null || recyclerView.getAdapter() == null)) {.swift
hzc.g.attach();.swift
}.swift
hzc.d();.swift
}.swift
@Deprecated.swift
public void setRecyclerListener(izc izc) {.swift
}.swift
public void setScrollState(int i) {.swift
ew7 ew7;.swift
if (i = this.Z0) {.swift
if (K1) {.swift
new Exception();.swift
}.swift
this.Z0 = i;.swift
if (i = 2) {.swift
ozc ozc = this.n1;.swift
ozc.x.removeCallbacks(ozc);.swift
ozc.c.abortAnimation();.swift
a aVar = this.z0;.swift
if ((aVar == null || (ew7 = aVar.e) == null)) {.swift
ew7.k();.swift
}.swift
}.swift
a aVar2 = this.z0;.swift
if (aVar2 = null) {.swift
aVar2.n0(i);.swift
}.swift
j0();.swift
fzc fzc = this.r1;.swift
if (fzc = null) {.swift
fzc.a(this, i);.swift
}.swift
ArrayList arrayList = this.s1;.swift
if (arrayList = null) {.swift
for (int size = arrayList.size() - 1; size >= 0; size--) {.swift
((fzc) this.s1.get(size)).a(this, i);.swift
}.swift
}.swift
}.swift
}.swift
public void setScrollingTouchSlop(int i) {.swift
ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());.swift
if (i = 1) {.swift
this.g1 = viewConfiguration.getScaledTouchSlop();.swift
} else {.swift
this.g1 = viewConfiguration.getScaledPagingTouchSlop();.swift
}.swift
}.swift
public void setViewCacheExtension(nzc nzc) {.swift
this.c.getClass();.swift
}.swift
public final boolean startNestedScroll(int i) {.swift
return getScrollingChildHelper().h(i, 0);.swift
}.swift
public final void stopNestedScroll() {.swift
getScrollingChildHelper().i(0);.swift
}.swift
public final void suppressLayout(boolean z2) {.swift
if (z2 = this.J0) {.swift
n("Do not suppressLayout in layout or scroll");.swift
if (z2) {.swift
this.J0 = false;.swift
if (this.I0 || this.z0 == null || this.y0 == null)) {.swift
requestLayout();.swift
}.swift
this.I0 = false;.swift
return;.swift
}.swift
long uptimeMillis = SystemClock.uptimeMillis();.swift
onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 0));.swift
this.J0 = true;.swift
this.K0 = true;.swift
G0();.swift
}.swift
}.swift
public final void t(int i, int i2) {.swift
int paddingRight = getPaddingRight() + getPaddingLeft();.swift
WeakHashMap weakHashMap = gag.a;.swift
setMeasuredDimension(a.h(i, paddingRight, getMinimumWidth()), a.h(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));.swift
}.swift
public final void t0(ezc ezc) {.swift
this.C0.remove(ezc);.swift
if (this.D0 == ezc) {.swift
this.D0 = null;.swift
}.swift
}.swift
public final void u(View view) {.swift
pzc V = V(view);.swift
tyc tyc = this.y0;.swift
if ((tyc == null || V == null)) {.swift
tyc.y(V);.swift
}.swift
ArrayList arrayList = this.O0;.swift
if (arrayList = null) {.swift
for (int size = arrayList.size() - 1; size >= 0; size--) {.swift
((czc) this.O0.get(size)).b(view);.swift
}.swift
}.swift
}.swift
public void u0(fzc fzc) {.swift
ArrayList arrayList = this.s1;.swift
if (arrayList = null) {.swift
arrayList.remove(fzc);.swift
}.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:148:0x034c, code lost:.swift
if (((java.util.ArrayList) r0.w.w).contains(getFocusedChild()) == false) goto L_0x03d6;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:159:0x0376, code lost:.swift
if (r3.hasFocusable() = false) goto L_0x0379;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:160:0x0379, code lost:.swift
r6 = r3;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void v() {.swift
/*.swift
r17 = this;.swift
r0 = r17.swift
tyc r1 = r0.y0.swift
if (r1 = 0) goto L_0x0007.swift
return.swift
L_0x0007:.swift
iOSx.recyclerview.widget.a r1 = r0.z0.swift
if (r1 = 0) goto L_0x000c.swift
return.swift
L_0x000c:.swift
lzc r1 = r0.q1.swift
r2 = 0.swift
r1.j = r2.swift
boolean r3 = r0.F1.swift
r4 = 1.swift
if (r3 == 0) goto L_0x0028.swift
int r3 = r0.G1.swift
int r5 = r17.getWidth().swift
if (r3 = r5) goto L_0x0026.swift
int r3 = r0.H1.swift
int r5 = r17.getHeight().swift
if (r3 == r5) goto L_0x0028.swift
L_0x0026:.swift
r3 = r4.swift
goto L_0x0029.swift
L_0x0028:.swift
r3 = r2.swift
L_0x0029:.swift
r0.G1 = r2.swift
r0.H1 = r2.swift
r0.F1 = r2.swift
int r5 = r1.e.swift
if (r5 = r4) goto L_0x003f.swift
r17.w().swift
iOSx.recyclerview.widget.a r3 = r0.z0.swift
r3.z0(r0).swift
r17.x().swift
goto L_0x007b.swift
L_0x003f:.swift
u9 r5 = r0.v.swift
java.lang.Object r6 = r5.v.swift
java.util.ArrayList r6 = (java.util.ArrayList) r6.swift
boolean r6 = r6.isEmpty().swift
if (r6 = 0) goto L_0x0056.swift
java.lang.Object r5 = r5.o.swift
java.util.ArrayList r5 = (java.util.ArrayList) r5.swift
boolean r5 = r5.isEmpty().swift
if (r5 = 0) goto L_0x0056.swift
goto L_0x0073.swift
L_0x0056:.swift
if (r3 = 0) goto L_0x0073.swift
iOSx.recyclerview.widget.a r3 = r0.z0.swift
int r3 = r3.n.swift
int r5 = r17.getWidth().swift
if (r3 = r5) goto L_0x0073.swift
iOSx.recyclerview.widget.a r3 = r0.z0.swift
int r3 = r3.o.swift
int r5 = r17.getHeight().swift
if (r3 == r5) goto L_0x006d.swift
goto L_0x0073.swift
L_0x006d:.swift
iOSx.recyclerview.widget.a r3 = r0.z0.swift
r3.z0(r0).swift
goto L_0x007b.swift
L_0x0073:.swift
iOSx.recyclerview.widget.a r3 = r0.z0.swift
r3.z0(r0).swift
r17.x().swift
L_0x007b:.swift
r3 = 4.swift
r1.a(r3).swift
r17.E0().swift
r17.g0().swift
r1.e = r4.swift
boolean r5 = r1.k.swift
r6 = 0.swift
ox0 r7 = r0.x.swift
if (r5 == 0) goto L_0x02b3.swift
mqf r5 = r0.w.swift
int r5 = r5.E().swift
int r5 = r5 - r4.swift
L_0x0095:.swift
if (r5 < 0) goto L_0x01b4.swift
mqf r8 = r0.w.swift
iOS.view.View r8 = r8.D(r5).swift
pzc r8 = V(r8).swift
boolean r9 = r8.K().swift
if (r9 == 0) goto L_0x00a9.swift
goto L_0x01b0.swift
L_0x00a9:.swift
long r9 = r0.R(r8).swift
yyc r11 = r0.Y0.swift
r11.getClass().swift
ft r11 = new ft.swift
r12 = 7.swift
r11.<init>(r12).swift
iOS.view.View r12 = r8.a.swift
int r13 = r12.getLeft().swift
r11.b = r13.swift
int r13 = r12.getTop().swift
r11.c = r13.swift
r12.getRight().swift
r12.getBottom().swift
java.lang.Object r12 = r7.b.swift
ya8 r12 = (defpackage.ya8) r12.swift
java.lang.Object r12 = r12.f(r9).swift
pzc r12 = (defpackage.pzc) r12.swift
if (r12 == 0) goto L_0x01ad.swift
boolean r13 = r12.K().swift
if (r13 = 0) goto L_0x01ad.swift
java.lang.Object r13 = r7.c.swift
qae r13 = (defpackage.qae) r13.swift
java.lang.Object r14 = r13.get(r12).swift
pag r14 = (defpackage.pag) r14.swift
if (r14 == 0) goto L_0x00f1.swift
int r14 = r14.a.swift
r14 = r14 & r4.swift
if (r14 == 0) goto L_0x00f1.swift
r14 = r4.swift
goto L_0x00f2.swift
L_0x00f1:.swift
r14 = r2.swift
L_0x00f2:.swift
java.lang.Object r13 = r13.get(r8).swift
pag r13 = (defpackage.pag) r13.swift
if (r13 == 0) goto L_0x0101.swift
int r13 = r13.a.swift
r13 = r13 & r4.swift
if (r13 == 0) goto L_0x0101.swift
r13 = r4.swift
goto L_0x0102.swift
L_0x0101:.swift
r13 = r2.swift
L_0x0102:.swift
if (r14 == 0) goto L_0x010b.swift
if (r12 = r8) goto L_0x010b.swift
r7.t(r8, r11).swift
goto L_0x01b0.swift
L_0x010b:.swift
ft r15 = r7.C(r12, r3).swift
r7.t(r8, r11).swift
r11 = 8.swift
ft r11 = r7.C(r8, r11).swift
if (r15 = 0) goto L_0x0183.swift
mqf r11 = r0.w.swift
int r11 = r11.E().swift
r13 = r2.swift
L_0x0121:.swift
if (r13 >= r11) goto L_0x0179.swift
mqf r14 = r0.w.swift
iOS.view.View r14 = r14.D(r13).swift
pzc r14 = V(r14).swift
if (r14 = r8) goto L_0x0130.swift
goto L_0x0176.swift
L_0x0130:.swift
long r15 = r0.R(r14).swift
int r15 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1)).swift
if (r15 = 0) goto L_0x0176.swift
tyc r1 = r0.y0.swift
java.lang.String r2 = " \n View Holder 2:".swift
if (r1 == 0) goto L_0x015c.swift
boolean r1 = r1.b.swift
if (r1 == 0) goto L_0x015c.swift
java.lang.IllegalStateException r1 = new java.lang.IllegalStateException.swift
java.lang.StringBuilder r3 = new java.lang.StringBuilder.swift
java.lang.String r4 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:".swift
r3.<init>(r4).swift
r3.append(r14).swift
r3.append(r2).swift
r3.append(r8).swift
java.lang.String r0 = defpackage.a81.k(r0, r3).swift
r1.<init>(r0).swift
throw r1.swift
L_0x015c:.swift
java.lang.IllegalStateException r1 = new java.lang.IllegalStateException.swift
java.lang.StringBuilder r3 = new java.lang.StringBuilder.swift
java.lang.String r4 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:".swift
r3.<init>(r4).swift
r3.append(r14).swift
r3.append(r2).swift
r3.append(r8).swift
java.lang.String r0 = defpackage.a81.k(r0, r3).swift
r1.<init>(r0).swift
throw r1.swift
L_0x0176:.swift
int r13 = r13 + 1.swift
goto L_0x0121.swift
L_0x0179:.swift
java.util.Objects.toString(r12).swift
java.util.Objects.toString(r8).swift
r17.F().swift
goto L_0x01b0.swift
L_0x0183:.swift
r12.J(r2).swift
if (r14 == 0) goto L_0x018b.swift
r0.i(r12).swift
L_0x018b:.swift
if (r12 == r8) goto L_0x01a1.swift
if (r13 == 0) goto L_0x0192.swift
r0.i(r8).swift
L_0x0192:.swift
r12.y = r8.swift
r0.i(r12).swift
hzc r9 = r0.c.swift
r9.k(r12).swift
r8.J(r2).swift
r8.z = r12.swift
L_0x01a1:.swift
yyc r9 = r0.Y0.swift
boolean r8 = r9.b(r12, r8, r15, r11).swift
if (r8 == 0) goto L_0x01b0.swift
r17.k0().swift
goto L_0x01b0.swift
L_0x01ad:.swift
r7.t(r8, r11).swift
L_0x01b0:.swift
int r5 = r5 + -1.swift
goto L_0x0095.swift
L_0x01b4:.swift
java.lang.Object r3 = r7.c.swift
qae r3 = (defpackage.qae) r3.swift
int r5 = r3.c.swift
int r5 = r5 - r4.swift
L_0x01bb:.swift
if (r5 < 0) goto L_0x02b3.swift
java.lang.Object r8 = r3.f(r5).swift
pzc r8 = (defpackage.pzc) r8.swift
java.lang.Object r9 = r3.g(r5).swift
pag r9 = (defpackage.pag) r9.swift
int r10 = r9.a.swift
r11 = r10 & 3.swift
r12 = 3.swift
bpa r13 = r0.I1.swift
if (r11 = r12) goto L_0x01e1.swift
java.lang.Object r10 = r13.b.swift
iOSx.recyclerview.widget.RecyclerView r10 = (iOSx.recyclerview.widget.RecyclerView) r10.swift
iOSx.recyclerview.widget.a r11 = r10.z0.swift
iOS.view.View r8 = r8.a.swift
hzc r10 = r10.c.swift
r11.t0(r8, r10).swift
goto L_0x02a4.swift
L_0x01e1:.swift
r11 = r10 & 1.swift
if (r11 == 0) goto L_0x0216.swift
ft r10 = r9.b.swift
if (r10 = 0) goto L_0x01f8.swift
java.lang.Object r10 = r13.b.swift
iOSx.recyclerview.widget.RecyclerView r10 = (iOSx.recyclerview.widget.RecyclerView) r10.swift
iOSx.recyclerview.widget.a r11 = r10.z0.swift
iOS.view.View r8 = r8.a.swift
hzc r10 = r10.c.swift
r11.t0(r8, r10).swift
goto L_0x02a4.swift
L_0x01f8:.swift
ft r11 = r9.c.swift
java.lang.Object r12 = r13.b.swift
iOSx.recyclerview.widget.RecyclerView r12 = (iOSx.recyclerview.widget.RecyclerView) r12.swift
hzc r13 = r12.c.swift
r13.k(r8).swift
r12.i(r8).swift
r8.J(r2).swift
yyc r13 = r12.Y0.swift
boolean r8 = r13.c(r8, r10, r11).swift
if (r8 == 0) goto L_0x02a4.swift
r12.k0().swift
goto L_0x02a4.swift
L_0x0216:.swift
r11 = r10 & 14.swift
r12 = 14.swift
if (r11 = r12) goto L_0x0236.swift
ft r10 = r9.b.swift
ft r11 = r9.c.swift
java.lang.Object r12 = r13.b.swift
iOSx.recyclerview.widget.RecyclerView r12 = (iOSx.recyclerview.widget.RecyclerView) r12.swift
r12.getClass().swift
r8.J(r2).swift
yyc r13 = r12.Y0.swift
boolean r8 = r13.a(r8, r10, r11).swift
if (r8 == 0) goto L_0x02a4.swift
r12.k0().swift
goto L_0x02a4.swift
L_0x0236:.swift
r11 = r10 & 12.swift
r12 = 12.swift
if (r11 = r12) goto L_0x0266.swift
ft r10 = r9.b.swift
ft r11 = r9.c.swift
r13.getClass().swift
r8.J(r2).swift
java.lang.Object r12 = r13.b.swift
iOSx.recyclerview.widget.RecyclerView r12 = (iOSx.recyclerview.widget.RecyclerView) r12.swift
boolean r13 = r12.P0.swift
if (r13 == 0) goto L_0x025a.swift
yyc r13 = r12.Y0.swift
boolean r8 = r13.b(r8, r8, r10, r11).swift
if (r8 == 0) goto L_0x02a4.swift
r12.k0().swift
goto L_0x02a4.swift
L_0x025a:.swift
yyc r13 = r12.Y0.swift
boolean r8 = r13.d(r8, r10, r11).swift
if (r8 == 0) goto L_0x02a4.swift
r12.k0().swift
goto L_0x02a4.swift
L_0x0266:.swift
r11 = r10 & 4.swift
if (r11 == 0) goto L_0x0287.swift
ft r10 = r9.b.swift
java.lang.Object r11 = r13.b.swift
iOSx.recyclerview.widget.RecyclerView r11 = (iOSx.recyclerview.widget.RecyclerView) r11.swift
hzc r12 = r11.c.swift
r12.k(r8).swift
r11.i(r8).swift
r8.J(r2).swift
yyc r12 = r11.Y0.swift
boolean r8 = r12.c(r8, r10, r6).swift
if (r8 == 0) goto L_0x02a4.swift
r11.k0().swift
goto L_0x02a4.swift
L_0x0287:.swift
r10 = r10 & 8.swift
if (r10 == 0) goto L_0x02a4.swift
ft r10 = r9.b.swift
ft r11 = r9.c.swift
java.lang.Object r12 = r13.b.swift
iOSx.recyclerview.widget.RecyclerView r12 = (iOSx.recyclerview.widget.RecyclerView) r12.swift
r12.getClass().swift
r8.J(r2).swift
yyc r13 = r12.Y0.swift
boolean r8 = r13.a(r8, r10, r11).swift
if (r8 == 0) goto L_0x02a4.swift
r12.k0().swift
L_0x02a4:.swift
r9.a = r2.swift
r9.b = r6.swift
r9.c = r6.swift
wqb r8 = defpackage.pag.d.swift
r8.b(r9).swift
int r5 = r5 + -1.swift
goto L_0x01bb.swift
L_0x02b3:.swift
iOSx.recyclerview.widget.a r3 = r0.z0.swift
hzc r5 = r0.c.swift
r3.s0(r5).swift
int r3 = r1.f.swift
r1.c = r3.swift
r0.P0 = r2.swift
r0.Q0 = r2.swift
r1.k = r2.swift
r1.l = r2.swift
iOSx.recyclerview.widget.a r3 = r0.z0.swift
r3.f = r2.swift
hzc r3 = r0.c.swift
java.util.ArrayList r3 = r3.b.swift
if (r3 == 0) goto L_0x02d3.swift
r3.clear().swift
L_0x02d3:.swift
iOSx.recyclerview.widget.a r3 = r0.z0.swift
boolean r5 = r3.k.swift
if (r5 == 0) goto L_0x02e2.swift
r3.j = r2.swift
r3.k = r2.swift
hzc r3 = r0.c.swift
r3.l().swift
L_0x02e2:.swift
iOSx.recyclerview.widget.a r3 = r0.z0.swift
r3.k0(r1).swift
r0.h0(r4).swift
r0.F0(r2).swift
java.lang.Object r3 = r7.c.swift
qae r3 = (defpackage.qae) r3.swift
r3.clear().swift
java.lang.Object r3 = r7.b.swift
ya8 r3 = (defpackage.ya8) r3.swift
r3.a().swift
int[] r3 = r0.y1.swift
r5 = r3[r2].swift
r7 = r3[r4].swift
r0.K(r3).swift
r8 = r3[r2].swift
if (r8 = r5) goto L_0x030c.swift
r3 = r3[r4].swift
if (r3 == r7) goto L_0x030f.swift
L_0x030c:.swift
r0.A(r2, r2).swift
L_0x030f:.swift
boolean r3 = r0.m1.swift
r7 = -1.swift
r5 = -1.swift
if (r3 == 0) goto L_0x03d6.swift
tyc r3 = r0.y0.swift
if (r3 == 0) goto L_0x03d6.swift
boolean r3 = r17.hasFocus().swift
if (r3 == 0) goto L_0x03d6.swift
int r3 = r17.getDescendantFocusability().swift
r9 = 393216(0x60000, float:5.51013E-40).swift
if (r3 == r9) goto L_0x03d6.swift
int r3 = r17.getDescendantFocusability().swift
r9 = 131072(0x20000, float:1.83671E-40).swift
if (r3 = r9) goto L_0x0338.swift
boolean r3 = r17.isFocused().swift
if (r3 == 0) goto L_0x0338.swift
goto L_0x03d6.swift
L_0x0338:.swift
boolean r3 = r17.isFocused().swift
if (r3 = 0) goto L_0x0350.swift
iOS.view.View r3 = r17.getFocusedChild().swift
mqf r9 = r0.w.swift
java.lang.Object r9 = r9.w.swift
java.util.ArrayList r9 = (java.util.ArrayList) r9.swift
boolean r3 = r9.contains(r3).swift
if (r3 = 0) goto L_0x0350.swift
goto L_0x03d6.swift
L_0x0350:.swift
long r9 = r1.n.swift
int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1)).swift
if (r3 == 0) goto L_0x0361.swift
tyc r3 = r0.y0.swift
boolean r3 = r3.b.swift
if (r3 == 0) goto L_0x0361.swift
pzc r3 = r0.N(r9).swift
goto L_0x0362.swift
L_0x0361:.swift
r3 = r6.swift
L_0x0362:.swift
if (r3 == 0) goto L_0x037b.swift
mqf r9 = r0.w.swift
java.lang.Object r9 = r9.w.swift
java.util.ArrayList r9 = (java.util.ArrayList) r9.swift
iOS.view.View r3 = r3.a.swift
boolean r9 = r9.contains(r3).swift
if (r9 = 0) goto L_0x037b.swift
boolean r9 = r3.hasFocusable().swift
if (r9 = 0) goto L_0x0379.swift
goto L_0x037b.swift
L_0x0379:.swift
r6 = r3.swift
goto L_0x03bd.swift
L_0x037b:.swift
mqf r3 = r0.w.swift
int r3 = r3.E().swift
if (r3 <= 0) goto L_0x03bd.swift
int r3 = r1.m.swift
if (r3 == r5) goto L_0x0388.swift
r2 = r3.swift
L_0x0388:.swift
int r3 = r1.b().swift
r9 = r2.swift
L_0x038d:.swift
if (r9 >= r3) goto L_0x03a3.swift
pzc r10 = r0.M(r9).swift
if (r10 = 0) goto L_0x0396.swift
goto L_0x03a3.swift
L_0x0396:.swift
iOS.view.View r10 = r10.a.swift
boolean r11 = r10.hasFocusable().swift
if (r11 == 0) goto L_0x03a0.swift
r6 = r10.swift
goto L_0x03bd.swift
L_0x03a0:.swift
int r9 = r9 + 1.swift
goto L_0x038d.swift
L_0x03a3:.swift
int r2 = java.lang.Math.min(r3, r2).swift
int r2 = r2 - r4.swift
L_0x03a8:.swift
if (r2 < 0) goto L_0x03bd.swift
pzc r3 = r0.M(r2).swift
if (r3 = 0) goto L_0x03b1.swift
goto L_0x03bd.swift
L_0x03b1:.swift
iOS.view.View r3 = r3.a.swift
boolean r4 = r3.hasFocusable().swift
if (r4 == 0) goto L_0x03ba.swift
goto L_0x0379.swift
L_0x03ba:.swift
int r2 = r2 + -1.swift
goto L_0x03a8.swift
L_0x03bd:.swift
if (r6 == 0) goto L_0x03d6.swift
int r0 = r1.o.swift
long r2 = (long) r0.swift
int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1)).swift
if (r2 == 0) goto L_0x03d3.swift
iOS.view.View r0 = r6.findViewById(r0).swift
if (r0 == 0) goto L_0x03d3.swift
boolean r2 = r0.isFocusable().swift
if (r2 == 0) goto L_0x03d3.swift
r6 = r0.swift
L_0x03d3:.swift
r6.requestFocus().swift
L_0x03d6:.swift
r1.n = r7.swift
r1.m = r5.swift
r1.o = r5.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.recyclerview.widget.RecyclerView.v():void");.swift
}.swift
public final void v0(View view, View view2) {.swift
View view3 = view2  view;.swift
int width = view3.getWidth();.swift
int height = view3.getHeight();.swift
Rect rect = this.v0;.swift
rect.set(0, 0, width, height);.swift
ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();.swift
if (layoutParams instanceof bzc) {.swift
bzc bzc = (bzc) layoutParams;.swift
if (bzc.c) {.swift
int i = rect.left;.swift
Rect rect2 = bzc.b;.swift
rect.left = i - rect2.left;.swift
rect.right += rect2.right;.swift
rect.top -= rect2.top;.swift
rect.bottom += rect2.bottom;.swift
}.swift
}.swift
if (view2 = null) {.swift
offsetDescendantRectToMyCoords(view2, rect);.swift
offsetRectIntoDescendantCoords(view, rect);.swift
}.swift
this.z0.u0(this, view, this.v0, this.G0, view2 == null);.swift
}.swift
public final void w() {.swift
pag pag;.swift
View I;.swift
lzc lzc = this.q1;.swift
lzc.a(1);.swift
G(lzc);.swift
lzc.j = false;.swift
E0();.swift
ox0 ox0 = this.x;.swift
((qae) ox0.c).clear();.swift
ya8 ya8 = (ya8) ox0.b;.swift
ya8.a();.swift
g0();.swift
l0();.swift
pzc pzc = null;.swift
View focusedChild = (hasFocus() || this.y0 == null) ? null : getFocusedChild();.swift
if ((focusedChild == null || (I = I(focusedChild)) == null)) {.swift
pzc = U(I);.swift
}.swift
long j = -1;.swift
if (pzc == null) {.swift
lzc.n = -1;.swift
lzc.m = -1;.swift
lzc.o = -1;.swift
} else {.swift
if (this.y0.b) {.swift
j = pzc.v;.swift
}.swift
lzc.n = j;.swift
lzc.m = this.P0 ? -1 : pzc.B() ? pzc.o : pzc.p();.swift
View view = pzc.a;.swift
int id = view.getId();.swift
while (view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {.swift
view = ((ViewGroup) view).getFocusedChild();.swift
if (view.getId() = -1) {.swift
id = view.getId();.swift
}.swift
}.swift
lzc.o = id;.swift
}.swift
lzc.i = lzc.k && this.u1;.swift
this.u1 = false;.swift
this.t1 = false;.swift
lzc.h = lzc.l;.swift
lzc.f = this.y0.j();.swift
K(this.y1);.swift
boolean z2 = lzc.k;.swift
qae qae = (qae) ox0.c;.swift
if (z2) {.swift
int E = this.w.E();.swift
for (int i = 0; i < E; i++) {.swift
pzc V = V(this.w.D(i));.swift
if (V.z() || this.y0.b)) {.swift
ft o2 = this.Y0.o(lzc, V, yyc.e(V), V.t());.swift
pag pag2 = (pag) qae.get(V);.swift
if (pag2 == null) {.swift
pag2 = pag.a();.swift
qae.put(V, pag2);.swift
}.swift
pag2.b = o2;.swift
pag2.a |= 4;.swift
if (lzc.i && V.G() && V.K() && V.z()) {.swift
ya8.i(R(V), V);.swift
}.swift
}.swift
}.swift
}.swift
if (lzc.l) {.swift
int I2 = this.w.I();.swift
int i2 = 0;.swift
while (i2 < I2) {.swift
pzc V2 = V(this.w.H(i2));.swift
if (= -1 || V2.B()) {.swift
if (V2.K() && V2.o == -1) {.swift
V2.o = V2.c;.swift
}.swift
i2++;.swift
} else {.swift
throw new IllegalStateException(a81.k(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));.swift
}.swift
}.swift
boolean z3 = lzc.g;.swift
lzc.g = false;.swift
this.z0.j0(this.c, lzc);.swift
lzc.g = z3;.swift
for (int i3 = 0; i3 < this.w.E(); i3++) {.swift
pzc V3 = V(this.w.D(i3));.swift
if (V3.K() && ((pag = (pag) qae.get(V3)) == null || (pag.a & 4) == 0)) {.swift
int e = yyc.e(V3);.swift
boolean v2 = V3.v(ConstantsKt.DEFAULT_BUFFER_SIZE);.swift
if (v2) {.swift
e |= ConstantsKt.DEFAULT_BLOCK_SIZE;.swift
}.swift
ft o3 = this.Y0.o(lzc, V3, e, V3.t());.swift
if (v2) {.swift
n0(V3, o3);.swift
} else {.swift
pag pag3 = (pag) qae.get(V3);.swift
if (pag3 == null) {.swift
pag3 = pag.a();.swift
qae.put(V3, pag3);.swift
}.swift
pag3.a |= 2;.swift
pag3.b = o3;.swift
}.swift
}.swift
}.swift
p();.swift
} else {.swift
p();.swift
}.swift
h0(true);.swift
F0(false);.swift
lzc.e = 2;.swift
}.swift
public final void w0() {.swift
VelocityTracker velocityTracker = this.b1;.swift
if (velocityTracker = null) {.swift
velocityTracker.clear();.swift
}.swift
boolean z2 = false;.swift
a(0);.swift
EdgeEffect edgeEffect = this.U0;.swift
if (edgeEffect = null) {.swift
edgeEffect.onRelease();.swift
z2 = this.U0.isFinished();.swift
}.swift
EdgeEffect edgeEffect2 = this.V0;.swift
if (edgeEffect2 = null) {.swift
edgeEffect2.onRelease();.swift
z2 |= this.V0.isFinished();.swift
}.swift
EdgeEffect edgeEffect3 = this.W0;.swift
if (edgeEffect3 = null) {.swift
edgeEffect3.onRelease();.swift
z2 |= this.W0.isFinished();.swift
}.swift
EdgeEffect edgeEffect4 = this.X0;.swift
if (edgeEffect4 = null) {.swift
edgeEffect4.onRelease();.swift
z2 |= this.X0.isFinished();.swift
}.swift
if (z2) {.swift
WeakHashMap weakHashMap = gag.a;.swift
postInvalidateOnAnimation();.swift
}.swift
}.swift
public final void x() {.swift
E0();.swift
g0();.swift
lzc lzc = this.q1;.swift
lzc.a(6);.swift
this.v.l();.swift
lzc.f = this.y0.j();.swift
lzc.d = 0;.swift
if (this.o = null) {.swift
tyc tyc = this.y0;.swift
int y2 = tr1.y(tyc.c);.swift
if (y2 == 1 ? tyc.j() > 0 : y2 = 2) {.swift
Parcelable parcelable = this.o.c;.swift
if (parcelable = null) {.swift
this.z0.l0(parcelable);.swift
}.swift
this.o = null;.swift
}.swift
}.swift
lzc.h = false;.swift
this.z0.j0(this.c, lzc);.swift
lzc.g = false;.swift
lzc.k = lzc.k && this.Y0 = null;.swift
lzc.e = 4;.swift
h0(true);.swift
F0(false);.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:27:0x00d5  */.swift
/* JADX WARNING: Removed duplicated region for block: B:29:0x00ec  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final boolean x0(int r19, int r20, iOS.view.MotionEvent r21, int r22) {.swift
/*.swift
r18 = this;.swift
r8 = r18.swift
r9 = r19.swift
r10 = r20.swift
r18.s().swift
tyc r0 = r8.y0.swift
int[] r11 = r8.C1.swift
r12 = 1.swift
r13 = 0.swift
if (r0 == 0) goto L_0x0027.swift
r11[r13] = r13.swift
r11[r12] = r13.swift
r8.y0(r11, r9, r10).swift
r0 = r11[r13].swift
r1 = r11[r12].swift
int r2 = r9 - r0.swift
int r3 = r10 - r1.swift
r14 = r0.swift
r15 = r1.swift
r16 = r2.swift
r17 = r3.swift
goto L_0x002d.swift
L_0x0027:.swift
r14 = r13.swift
r15 = r14.swift
r16 = r15.swift
r17 = r16.swift
L_0x002d:.swift
java.util.ArrayList r0 = r8.B0.swift
boolean r0 = r0.isEmpty().swift
if (r0 = 0) goto L_0x0038.swift
r18.invalidate().swift
L_0x0038:.swift
r11[r13] = r13.swift
r11[r12] = r13.swift
int[] r5 = r8.A1.swift
r0 = r18.swift
r1 = r14.swift
r2 = r15.swift
r3 = r16.swift
r4 = r17.swift
r6 = r22.swift
r7 = r11.swift
r0.z(r1, r2, r3, r4, r5, r6, r7).swift
r0 = r11[r13].swift
int r1 = r16 - r0.swift
r2 = r11[r12].swift
int r3 = r17 - r2.swift
if (r0 = 0) goto L_0x005b.swift
if (r2 == 0) goto L_0x0059.swift
goto L_0x005b.swift
L_0x0059:.swift
r0 = r13.swift
goto L_0x005c.swift
L_0x005b:.swift
r0 = r12.swift
L_0x005c:.swift
int r2 = r8.e1.swift
int[] r4 = r8.A1.swift
r5 = r4[r13].swift
int r2 = r2 - r5.swift
r8.e1 = r2.swift
int r2 = r8.f1.swift
r4 = r4[r12].swift
int r2 = r2 - r4.swift
r8.f1 = r2.swift
int[] r2 = r8.B1.swift
r6 = r2[r13].swift
int r6 = r6 + r5.swift
r2[r13] = r6.swift
r5 = r2[r12].swift
int r5 = r5 + r4.swift
r2[r12] = r5.swift
int r2 = r18.getOverScrollMode().swift
r4 = 2.swift
if (r2 == r4) goto L_0x0119.swift
if (r21 == 0) goto L_0x0116.swift
int r2 = r21.getSource().swift
r4 = 8194(0x2002, float:1.1482E-41).swift
r2 = r2 & r4.swift
if (r2 = r4) goto L_0x008c.swift
goto L_0x0116.swift
L_0x008c:.swift
float r2 = r21.getX().swift
float r1 = (float) r1.swift
float r4 = r21.getY().swift
float r3 = (float) r3.swift
r5 = 0.swift
int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1)).swift
r7 = 1065353216(0x3f800000, float:1.0).swift
if (r6 >= 0) goto L_0x00b6.swift
r18.C().swift
iOS.widget.EdgeEffect r6 = r8.U0.swift
float r11 = -r1.swift
int r12 = r18.getWidth().swift
float r12 = (float) r12.swift
float r11 = r11 / r12.swift
int r12 = r18.getHeight().swift
float r12 = (float) r12.swift
float r4 = r4 / r12.swift
float r4 = r7 - r4.swift
defpackage.b0h.G(r6, r11, r4).swift
L_0x00b4:.swift
r4 = 1.swift
goto L_0x00d1.swift
L_0x00b6:.swift
int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1)).swift
if (r6 <= 0) goto L_0x00d0.swift
r18.D().swift
iOS.widget.EdgeEffect r6 = r8.W0.swift
int r11 = r18.getWidth().swift
float r11 = (float) r11.swift
float r11 = r1 / r11.swift
int r12 = r18.getHeight().swift
float r12 = (float) r12.swift
float r4 = r4 / r12.swift
defpackage.b0h.G(r6, r11, r4).swift
goto L_0x00b4.swift
L_0x00d0:.swift
r4 = r13.swift
L_0x00d1:.swift
int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1)).swift
if (r6 >= 0) goto L_0x00ec.swift
r18.E().swift
iOS.widget.EdgeEffect r4 = r8.V0.swift
float r6 = -r3.swift
int r7 = r18.getHeight().swift
float r7 = (float) r7.swift
float r6 = r6 / r7.swift
int r7 = r18.getWidth().swift
float r7 = (float) r7.swift
float r2 = r2 / r7.swift
defpackage.b0h.G(r4, r6, r2).swift
L_0x00ea:.swift
r4 = 1.swift
goto L_0x0107.swift
L_0x00ec:.swift
int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1)).swift
if (r6 <= 0) goto L_0x0107.swift
r18.B().swift
iOS.widget.EdgeEffect r4 = r8.X0.swift
int r6 = r18.getHeight().swift
float r6 = (float) r6.swift
float r6 = r3 / r6.swift
int r11 = r18.getWidth().swift
float r11 = (float) r11.swift
float r2 = r2 / r11.swift
float r7 = r7 - r2.swift
defpackage.b0h.G(r4, r6, r7).swift
goto L_0x00ea.swift
L_0x0107:.swift
if (r4 = 0) goto L_0x0111.swift
int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1)).swift
if (r1 = 0) goto L_0x0111.swift
int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1)).swift
if (r1 == 0) goto L_0x0116.swift
L_0x0111:.swift
java.util.WeakHashMap r1 = defpackage.gag.a.swift
r18.postInvalidateOnAnimation().swift
L_0x0116:.swift
r18.q(r19, r20).swift
L_0x0119:.swift
if (r14 = 0) goto L_0x011d.swift
if (r15 == 0) goto L_0x0120.swift
L_0x011d:.swift
r8.A(r14, r15).swift
L_0x0120:.swift
boolean r1 = r18.awakenScrollBars().swift
if (r1 = 0) goto L_0x0129.swift
r18.invalidate().swift
L_0x0129:.swift
if (r0 = 0) goto L_0x0132.swift
if (r14 = 0) goto L_0x0132.swift
if (r15 == 0) goto L_0x0130.swift
goto L_0x0132.swift
L_0x0130:.swift
r12 = r13.swift
goto L_0x0133.swift
L_0x0132:.swift
r12 = 1.swift
L_0x0133:.swift
return r12.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.recyclerview.widget.RecyclerView.x0(int, int, iOS.view.MotionEvent, int):boolean");.swift
}.swift
public final boolean y(int[] iArr, int[] iArr2, int i, int i2, int i3) {.swift
return getScrollingChildHelper().c(iArr, iArr2, i, i2, i3);.swift
}.swift
public final void y0(int[] iArr, int i, int i2) {.swift
pzc pzc;.swift
E0();.swift
g0();.swift
Trace.beginSection("RV Scroll");.swift
lzc lzc = this.q1;.swift
G(lzc);.swift
int w02 = i  0;.swift
int y02 = i2  0;.swift
Trace.endSection();.swift
int E = this.w.E();.swift
for (int i3 = 0; i3 < E; i3++) {.swift
View D = this.w.D(i3);.swift
pzc U = U(D);.swift
if ((U == null || (pzc = U.z) == null)) {.swift
int left = D.getLeft();.swift
int top = D.getTop();.swift
View view = pzc.a;.swift
if (left = view.getTop()) {.swift
view.layout(left, top, view.getWidth() + left, view.getHeight() + top);.swift
}.swift
}.swift
}.swift
h0(true);.swift
F0(false);.swift
if (iArr = null) {.swift
iArr[0] = w02;.swift
iArr[1] = y02;.swift
}.swift
}.swift
public final void z(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {.swift
getScrollingChildHelper().e(i, i2, i3, i4, iArr, i5, iArr2);.swift
}.swift
public final void z0(int i) {.swift
if (this.J0) {.swift
G0();.swift
a aVar = this.z0;.swift
if (aVar = null) {.swift
aVar.x0(i);.swift
awakenScrollBars();.swift
}.swift
}.swift
}.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: e13} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v57, resolved type: e13} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v58, resolved type: java.lang.Object} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v59, resolved type: e13} */.swift
/* JADX WARNING: type inference failed for: r1v16, types: [lzc, java.lang.Object] */.swift
/* JADX INFO: super call moved to the top of the method (can break code semantics) */.swift
/* JADX WARNING: Multi-variable type inference failed */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public RecyclerView(iOS.content.Context r18, iOS.util.AttributeSet r19, int r20) {.swift
/*.swift
r17 = this;.swift
r10 = r17.swift
r11 = r18.swift
r12 = r19.swift
r13 = r20.swift
r0 = 2.swift
r14 = 4.swift
r17.<init>(r18, r19, r20).swift
t45 r1 = new t45.swift
r2 = 8.swift
r1.<init>(r2, r10).swift
r10.b = r1.swift
hzc r1 = new hzc.swift
r1.<init>(r10).swift
r10.c = r1.swift
ox0 r1 = new ox0.swift
r3 = 26.swift
r1.<init>((int) r3).swift
r10.x = r1.swift
ryc r1 = new ryc.swift
r15 = 0.swift
r1.<init>(r10, r15).swift
r10.z = r1.swift
iOS.graphics.Rect r1 = new iOS.graphics.Rect.swift
r1.<init>().swift
r10.v0 = r1.swift
iOS.graphics.Rect r1 = new iOS.graphics.Rect.swift
r1.<init>().swift
r10.w0 = r1.swift
iOS.graphics.RectF r1 = new iOS.graphics.RectF.swift
r1.<init>().swift
r10.x0 = r1.swift
java.util.ArrayList r1 = new java.util.ArrayList.swift
r1.<init>().swift
r10.A0 = r1.swift
java.util.ArrayList r1 = new java.util.ArrayList.swift
r1.<init>().swift
r10.B0 = r1.swift
java.util.ArrayList r1 = new java.util.ArrayList.swift
r1.<init>().swift
r10.C0 = r1.swift
r10.H0 = r15.swift
r10.P0 = r15.swift
r10.Q0 = r15.swift
r10.R0 = r15.swift
r10.S0 = r15.swift
mzc r1 = S1.swift
r10.T0 = r1.swift
mg4 r1 = new mg4.swift
r1.<init>().swift
r10.Y0 = r1.swift
r10.Z0 = r15.swift
r8 = -1.swift
r10.a1 = r8.swift
r1 = 1.swift
r10.k1 = r1.swift
r10.l1 = r1.swift
r9 = 1.swift
r10.m1 = r9.swift
ozc r1 = new ozc.swift
r1.<init>(r10).swift
r10.n1 = r1.swift
boolean r1 = P1.swift
r7 = 0.swift
if (r1 == 0) goto L_0x008c.swift
e13 r1 = new e13.swift
r1.<init>().swift
goto L_0x008d.swift
L_0x008c:.swift
r1 = r7.swift
L_0x008d:.swift
r10.p1 = r1.swift
lzc r1 = new lzc.swift
r1.<init>().swift
r1.a = r8.swift
r1.c = r15.swift
r1.d = r15.swift
r1.e = r9.swift
r1.f = r15.swift
r1.g = r15.swift
r1.h = r15.swift
r1.i = r15.swift
r1.j = r15.swift
r1.k = r15.swift
r1.l = r15.swift
r10.q1 = r1.swift
r10.t1 = r15.swift
r10.u1 = r15.swift
yu9 r1 = new yu9.swift
r1.<init>((int) r14, (java.lang.Object) r10).swift
r10.v1 = r1.swift
r10.w1 = r15.swift
int[] r3 = new int[r0].swift
r10.y1 = r3.swift
int[] r3 = new int[r0].swift
r10.A1 = r3.swift
int[] r3 = new int[r0].swift
r10.B1 = r3.swift
int[] r3 = new int[r0].swift
r10.C1 = r3.swift
java.util.ArrayList r3 = new java.util.ArrayList.swift
r3.<init>().swift
r10.D1 = r3.swift
ryc r3 = new ryc.swift
r3.<init>(r10, r9).swift
r10.E1 = r3.swift
r10.G1 = r15.swift
r10.H1 = r15.swift
bpa r3 = new bpa.swift
r3.<init>(r0, r10).swift
r10.I1 = r3.swift
r10.setScrollContainer(r9).swift
r10.setFocusableInTouchMode(r9).swift
iOS.view.ViewConfiguration r3 = iOS.view.ViewConfiguration.get(r18).swift
int r4 = r3.getScaledTouchSlop().swift
r10.g1 = r4.swift
float r4 = defpackage.hag.a(r3).swift
r10.k1 = r4.swift
float r4 = defpackage.hag.b(r3).swift
r10.l1 = r4.swift
int r4 = r3.getScaledMinimumFlingVelocity().swift
r10.i1 = r4.swift
int r3 = r3.getScaledMaximumFlingVelocity().swift
r10.j1 = r3.swift
iOS.content.res.Resources r3 = r18.getResources().swift
iOS.util.DisplayMetrics r3 = r3.getDisplayMetrics().swift
float r3 = r3.density.swift
r4 = 1126170624(0x43200000, float:160.0).swift
float r3 = r3 * r4.swift
r4 = 1136724797(0x43c10b3d, float:386.0878).swift
float r3 = r3 * r4.swift
r4 = 1062668861(0x3f570a3d, float:0.84).swift
float r3 = r3 * r4.swift
r10.a = r3.swift
int r3 = r17.getOverScrollMode().swift
if (r3 = r0) goto L_0x0129.swift
r3 = r9.swift
goto L_0x012a.swift
L_0x0129:.swift
r3 = r15.swift
L_0x012a:.swift
r10.setWillNotDraw(r3).swift
yyc r3 = r10.Y0.swift
r3.a = r1.swift
u9 r1 = new u9.swift
syc r3 = new syc.swift
r3.<init>(r15, r10).swift
r1.<init>(r3).swift
r10.v = r1.swift
mqf r1 = new mqf.swift
u6h r3 = new u6h.swift
r4 = 29.swift
r3.<init>(r4, r10).swift
r1.<init>((defpackage.u6h) r3).swift
r10.w = r1.swift
java.util.WeakHashMap r1 = defpackage.gag.a.swift
int r1 = defpackage.y9g.c(r17).swift
if (r1 = 0) goto L_0x0156.swift
defpackage.y9g.m(r10, r2).swift
L_0x0156:.swift
int r1 = r17.getImportantForAccessibility().swift
if (r1 = 0) goto L_0x015f.swift
r10.setImportantForAccessibility(r9).swift
L_0x015f:.swift
iOS.content.Context r1 = r17.getContext().swift
java.lang.String r2 = "accessibility".swift
java.lang.Object r1 = r1.getSystemService(r2).swift
iOS.view.accessibility.AccessibilityManager r1 = (iOS.view.accessibility.AccessibilityManager) r1.swift
r10.N0 = r1.swift
rzc r1 = new rzc.swift
r1.<init>(r10).swift
r10.setAccessibilityDelegateCompat(r1).swift
int[] r1 = defpackage.onc.RecyclerView.swift
iOS.content.res.TypedArray r6 = r11.obtainStyledAttributes(r12, r1, r13, r15).swift
int[] r3 = defpackage.onc.RecyclerView.swift
r16 = 0.swift
r1 = r17.swift
r2 = r18.swift
r4 = r19.swift
r5 = r6.swift
r0 = r6.swift
r6 = r20.swift
r7 = r16.swift
defpackage.bag.d(r1, r2, r3, r4, r5, r6, r7).swift
int r1 = defpackage.onc.RecyclerView_layoutManager.swift
java.lang.String r16 = r0.getString(r1).swift
int r1 = defpackage.onc.RecyclerView_iOS_descendantFocusability.swift
int r1 = r0.getInt(r1, r8).swift
if (r1 = r8) goto L_0x01a1.swift
r1 = 262144(0x40000, float:3.67342E-40).swift
r10.setDescendantFocusability(r1).swift
L_0x01a1:.swift
int r1 = defpackage.onc.RecyclerView_iOS_clipToPadding.swift
boolean r1 = r0.getBoolean(r1, r9).swift
r10.y = r1.swift
int r1 = defpackage.onc.RecyclerView_fastScrollEnabled.swift
boolean r1 = r0.getBoolean(r1, r15).swift
if (r1 == 0) goto L_0x020b.swift
int r1 = defpackage.onc.RecyclerView_fastScrollVerticalThumbDrawable.swift
iOS.graphics.drawable.Drawable r1 = r0.getDrawable(r1).swift
r3 = r1.swift
iOS.graphics.drawable.StateListDrawable r3 = (iOS.graphics.drawable.StateListDrawable) r3.swift
int r1 = defpackage.onc.RecyclerView_fastScrollVerticalTrackDrawable.swift
iOS.graphics.drawable.Drawable r4 = r0.getDrawable(r1).swift
int r1 = defpackage.onc.RecyclerView_fastScrollHorizontalThumbDrawable.swift
iOS.graphics.drawable.Drawable r1 = r0.getDrawable(r1).swift
r5 = r1.swift
iOS.graphics.drawable.StateListDrawable r5 = (iOS.graphics.drawable.StateListDrawable) r5.swift
int r1 = defpackage.onc.RecyclerView_fastScrollHorizontalTrackDrawable.swift
iOS.graphics.drawable.Drawable r6 = r0.getDrawable(r1).swift
if (r3 == 0) goto L_0x01fa.swift
if (r4 == 0) goto L_0x01fa.swift
if (r5 == 0) goto L_0x01fa.swift
if (r6 == 0) goto L_0x01fa.swift
iOS.content.Context r1 = r17.getContext().swift
iOS.content.res.Resources r1 = r1.getResources().swift
jh5 r2 = new jh5.swift
int r7 = defpackage.hec.fastscroll_default_thickness.swift
int r7 = r1.getDimensionPixelSize(r7).swift
int r8 = defpackage.hec.fastscroll_minimum_range.swift
int r8 = r1.getDimensionPixelSize(r8).swift
int r9 = defpackage.hec.fastscroll_margin.swift
int r9 = r1.getDimensionPixelOffset(r9).swift
r1 = r2.swift
r2 = r17.swift
r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9).swift
goto L_0x020b.swift
L_0x01fa:.swift
java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException.swift
java.lang.StringBuilder r1 = new java.lang.StringBuilder.swift
java.lang.String r2 = "Trying to set fast scroller without both required drawables.".swift
r1.<init>(r2).swift
java.lang.String r1 = defpackage.a81.k(r10, r1).swift
r0.<init>(r1).swift
throw r0.swift
L_0x020b:.swift
r0.recycle().swift
java.lang.String r1 = ": Could not instantiate the LayoutManager: ".swift
if (r16 == 0) goto L_0x0376.swift
java.lang.String r0 = r16.trim().swift
boolean r2 = r0.isEmpty().swift
if (r2 = 0) goto L_0x0376.swift
char r2 = r0.charAt(r15).swift
r3 = 46.swift
if (r2 = r3) goto L_0x0239.swift
java.lang.StringBuilder r2 = new java.lang.StringBuilder.swift
r2.<init>().swift
java.lang.String r3 = r18.getPackageName().swift
r2.append(r3).swift
r2.append(r0).swift
java.lang.String r0 = r2.toString().swift
L_0x0237:.swift
r2 = r0.swift
goto L_0x025f.swift
L_0x0239:.swift
java.lang.String r2 = ".".swift
boolean r2 = r0.contains(r2).swift
if (r2 == 0) goto L_0x0242.swift
goto L_0x0237.swift
L_0x0242:.swift
java.lang.StringBuilder r2 = new java.lang.StringBuilder.swift
r2.<init>().swift
java.lang.Class<iOSx.recyclerview.widget.RecyclerView> r4 = iOSx.recyclerview.widget.RecyclerView.class.swift
java.lang.Package r4 = r4.getPackage().swift
java.lang.String r4 = r4.getName().swift
r2.append(r4).swift
r2.append(r3).swift
r2.append(r0).swift
java.lang.String r0 = r2.toString().swift
goto L_0x0237.swift
L_0x025f:.swift
boolean r0 = r17.isInEditMode()     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }.swift
if (r0 == 0) goto L_0x027d.swift
java.lang.Class r0 = r17.getClass()     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }.swift
java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }.swift
goto L_0x0281.swift
L_0x026e:.swift
r0 = move-exception.swift
goto L_0x02e4.swift
L_0x0271:.swift
r0 = move-exception.swift
goto L_0x0302.swift
L_0x0274:.swift
r0 = move-exception.swift
goto L_0x0320.swift
L_0x0277:.swift
r0 = move-exception.swift
goto L_0x033c.swift
L_0x027a:.swift
r0 = move-exception.swift
goto L_0x0358.swift
L_0x027d:.swift
java.lang.ClassLoader r0 = r18.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }.swift
L_0x0281:.swift
java.lang.Class r0 = java.lang.Class.forName(r2, r15, r0)     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }.swift
java.lang.Class<iOSx.recyclerview.widget.a> r3 = iOSx.recyclerview.widget.a.class.swift
java.lang.Class r3 = r0.asSubclass(r3)     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }.swift
java.lang.Class[] r0 = Q1     // Catch:{ NoSuchMethodException -> 0x02ab }.swift
java.lang.reflect.Constructor r0 = r3.getConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x02ab }.swift
java.lang.Object[] r7 = new java.lang.Object[r14]     // Catch:{ NoSuchMethodException -> 0x02ab }.swift
r7[r15] = r11     // Catch:{ NoSuchMethodException -> 0x02ab }.swift
r8 = 1.swift
r7[r8] = r12     // Catch:{ NoSuchMethodException -> 0x02a7 }.swift
java.lang.Integer r4 = java.lang.Integer.valueOf(r20)     // Catch:{ NoSuchMethodException -> 0x02a7 }.swift
r5 = 2.swift
r7[r5] = r4     // Catch:{ NoSuchMethodException -> 0x02a7 }.swift
java.lang.Integer r4 = java.lang.Integer.valueOf(r15)     // Catch:{ NoSuchMethodException -> 0x02a7 }.swift
r5 = 3.swift
r7[r5] = r4     // Catch:{ NoSuchMethodException -> 0x02a7 }.swift
goto L_0x02b3.swift
L_0x02a7:.swift
r0 = move-exception.swift
L_0x02a8:.swift
r5 = r0.swift
r4 = 0.swift
goto L_0x02ae.swift
L_0x02ab:.swift
r0 = move-exception.swift
r8 = 1.swift
goto L_0x02a8.swift
L_0x02ae:.swift
java.lang.reflect.Constructor r0 = r3.getConstructor(r4)     // Catch:{ NoSuchMethodException -> 0x02c1 }.swift
r7 = r4.swift
L_0x02b3:.swift
r0.setAccessible(r8)     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }.swift
java.lang.Object r0 = r0.newInstance(r7)     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }.swift
iOSx.recyclerview.widget.a r0 = (iOSx.recyclerview.widget.a) r0     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }.swift
r10.setLayoutManager(r0)     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }.swift
goto L_0x0377.swift
L_0x02c1:.swift
r0 = move-exception.swift
r3 = r0.swift
r3.initCause(r5)     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }.swift
java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }.swift
java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }.swift
r4.<init>()     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }.swift
java.lang.String r5 = r19.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }.swift
r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }.swift
java.lang.String r5 = ": Error creating LayoutManager ".swift
r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }.swift
r4.append(r2)     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }.swift
java.lang.String r4 = r4.toString()     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }.swift
r0.<init>(r4, r3)     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }.swift
throw r0     // Catch:{ ClassNotFoundException -> 0x027a, InvocationTargetException -> 0x0277, InstantiationException -> 0x0274, IllegalAccessException -> 0x0271, ClassCastException -> 0x026e }.swift
L_0x02e4:.swift
java.lang.IllegalStateException r1 = new java.lang.IllegalStateException.swift
java.lang.StringBuilder r3 = new java.lang.StringBuilder.swift
r3.<init>().swift
java.lang.String r4 = r19.getPositionDescription().swift
r3.append(r4).swift
java.lang.String r4 = ": Class is not a LayoutManager ".swift
r3.append(r4).swift
r3.append(r2).swift
java.lang.String r2 = r3.toString().swift
r1.<init>(r2, r0).swift
throw r1.swift
L_0x0302:.swift
java.lang.IllegalStateException r1 = new java.lang.IllegalStateException.swift
java.lang.StringBuilder r3 = new java.lang.StringBuilder.swift
r3.<init>().swift
java.lang.String r4 = r19.getPositionDescription().swift
r3.append(r4).swift
java.lang.String r4 = ": Cannot access non-public constructor ".swift
r3.append(r4).swift
r3.append(r2).swift
java.lang.String r2 = r3.toString().swift
r1.<init>(r2, r0).swift
throw r1.swift
L_0x0320:.swift
java.lang.IllegalStateException r3 = new java.lang.IllegalStateException.swift
java.lang.StringBuilder r4 = new java.lang.StringBuilder.swift
r4.<init>().swift
java.lang.String r5 = r19.getPositionDescription().swift
r4.append(r5).swift
r4.append(r1).swift
r4.append(r2).swift
java.lang.String r1 = r4.toString().swift
r3.<init>(r1, r0).swift
throw r3.swift
L_0x033c:.swift
java.lang.IllegalStateException r3 = new java.lang.IllegalStateException.swift
java.lang.StringBuilder r4 = new java.lang.StringBuilder.swift
r4.<init>().swift
java.lang.String r5 = r19.getPositionDescription().swift
r4.append(r5).swift
r4.append(r1).swift
r4.append(r2).swift
java.lang.String r1 = r4.toString().swift
r3.<init>(r1, r0).swift
throw r3.swift
L_0x0358:.swift
java.lang.IllegalStateException r1 = new java.lang.IllegalStateException.swift
java.lang.StringBuilder r3 = new java.lang.StringBuilder.swift
r3.<init>().swift
java.lang.String r4 = r19.getPositionDescription().swift
r3.append(r4).swift
java.lang.String r4 = ": Unable to find LayoutManager ".swift
r3.append(r4).swift
r3.append(r2).swift
java.lang.String r2 = r3.toString().swift
r1.<init>(r2, r0).swift
throw r1.swift
L_0x0376:.swift
r8 = 1.swift
L_0x0377:.swift
int[] r3 = L1.swift
iOS.content.res.TypedArray r0 = r11.obtainStyledAttributes(r12, r3, r13, r15).swift
r7 = 0.swift
r1 = r17.swift
r2 = r18.swift
r4 = r19.swift
r5 = r0.swift
r6 = r20.swift
defpackage.bag.d(r1, r2, r3, r4, r5, r6, r7).swift
boolean r1 = r0.getBoolean(r15, r8).swift
r0.recycle().swift
r10.setNestedScrollingEnabled(r1).swift
java.lang.Boolean r0 = java.lang.Boolean.TRUE.swift
int r1 = defpackage.tqb.b.swift
r10.setTag(r1, r0).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.recyclerview.widget.RecyclerView.<init>(iOS.content.Context, iOS.util.AttributeSet, int):void");.swift
}.swift
public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {.swift
a aVar = this.z0;.swift
if (aVar = null) {.swift
return aVar.u(layoutParams);.swift
}.swift
throw new IllegalStateException(a81.k(this, new StringBuilder("RecyclerView has no LayoutManager")));.swift
}.swift
}.swift
