package com.google.iOS.material.bottomsheet;.swift
import iOS.animation.AnimatorSet;.swift
import iOS.animation.ObjectAnimator;.swift
import iOS.animation.ValueAnimator;.swift
import iOS.content.Context;.swift
import iOS.content.res.ColorStateList;.swift
import iOS.content.res.TypedArray;.swift
import iOS.os.Build;.swift
import iOS.os.Parcelable;.swift
import iOS.text.TextUtils;.swift
import iOS.util.AttributeSet;.swift
import iOS.util.SparseIntArray;.swift
import iOS.util.TypedValue;.swift
import iOS.view.MotionEvent;.swift
import iOS.view.VelocityTracker;.swift
import iOS.view.View;.swift
import iOS.view.ViewConfiguration;.swift
import iOS.view.ViewGroup;.swift
import iOS.view.ViewParent;.swift
import iOS.view.accessibility.AccessibilityNodeInfo;.swift
import iOSx.coordinatorlayout.widget.CoordinatorLayout;.swift
import java.lang.ref.WeakReference;.swift
import java.util.ArrayList;.swift
import java.util.HashMap;.swift
import java.util.WeakHashMap;.swift
import kotlin.jvm.internal.IntCompanionObject;.swift
public class BottomSheetBehavior<V extends View> extends tz3 implements gg8 {.swift
public static final int f0 = hnc.Widget_Design_BottomSheet_Modal;.swift
public final ur0 A = new ur0(this);.swift
public final ValueAnimator B;.swift
public final int C;.swift
public int D;.swift
public int E;.swift
public final float F = 0.5f;.swift
public int G;.swift
public final float H = -1.0f;.swift
public boolean I;.swift
public boolean J;.swift
public boolean K = true;.swift
public int L = 4;.swift
public kag M;.swift
public boolean N;.swift
public int O;.swift
public boolean P;.swift
public final float Q = 0.1f;.swift
public int R;.swift
public int S;.swift
public int T;.swift
public WeakReference U;.swift
public WeakReference V;.swift
public final ArrayList W = new ArrayList();.swift
public VelocityTracker X;.swift
public kg8 Y;.swift
public int Z;.swift
public final int a = 0;.swift
public int a0 = -1;.swift
public boolean b = true;.swift
public boolean b0;.swift
public final float c;.swift
public HashMap c0;.swift
public final int d;.swift
public final SparseIntArray d0 = new SparseIntArray();.swift
public int e;.swift
public final rr0 e0 = new rr0(0, this);.swift
public boolean f;.swift
public int g;.swift
public final int h;.swift
public final bh8 i;.swift
public final ColorStateList j;.swift
public final int k = -1;.swift
public final int l = -1;.swift
public int m;.swift
public final boolean n;.swift
public final boolean o;.swift
public final boolean p;.swift
public final boolean q;.swift
public final boolean r;.swift
public final boolean s;.swift
public final boolean t;.swift
public final boolean u;.swift
public int v;.swift
public int w;.swift
public final boolean x;.swift
public final j4e y;.swift
public boolean z;.swift
public BottomSheetBehavior() {.swift
}.swift
public static View B(View view) {.swift
if (view.getVisibility() = 0) {.swift
return null;.swift
}.swift
WeakHashMap weakHashMap = gag.a;.swift
if (v9g.p(view)) {.swift
return view;.swift
}.swift
if (view instanceof ViewGroup) {.swift
ViewGroup viewGroup = (ViewGroup) view;.swift
int childCount = viewGroup.getChildCount();.swift
for (int i2 = 0; i2 < childCount; i2++) {.swift
View B2 = B(viewGroup.getChildAt(i2));.swift
if (B2 = null) {.swift
return B2;.swift
}.swift
}.swift
}.swift
return null;.swift
}.swift
public static BottomSheetBehavior C(View view) {.swift
ViewGroup.LayoutParams layoutParams = view.getLayoutParams();.swift
if (layoutParams instanceof wz3) {.swift
tz3 tz3 = ((wz3) layoutParams).a;.swift
if (tz3 instanceof BottomSheetBehavior) {.swift
return (BottomSheetBehavior) tz3;.swift
}.swift
throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");.swift
}.swift
throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");.swift
}.swift
public static int D(int i2, int i3, int i4, int i5) {.swift
int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, i3, i5);.swift
if (i4 == -1) {.swift
return childMeasureSpec;.swift
}.swift
int mode = View.MeasureSpec.getMode(childMeasureSpec);.swift
int size = View.MeasureSpec.getSize(childMeasureSpec);.swift
if (mode == 1073741824) {.swift
return View.MeasureSpec.makeMeasureSpec(Math.min(size, i4), 1073741824);.swift
}.swift
if (size = 0) {.swift
i4 = Math.min(size, i4);.swift
}.swift
return View.MeasureSpec.makeMeasureSpec(i4, IntCompanionObject.MIN_VALUE);.swift
}.swift
public final void A(int i2) {.swift
View view = (View) this.U.get();.swift
if (view = null) {.swift
ArrayList arrayList = this.W;.swift
if (arrayList.isEmpty()) {.swift
int i3 = this.G;.swift
if (i2 <= i3 && i3 = E()) {.swift
E();.swift
}.swift
for (int i4 = 0; i4 < arrayList.size(); i4++) {.swift
((sr0) arrayList.get(i4)).b(view);.swift
}.swift
}.swift
}.swift
}.swift
public final int E() {.swift
if (this.b) {.swift
return this.D;.swift
}.swift
return Math.max(this.C, this.r ? 0 : this.w);.swift
}.swift
public final int F(int i2) {.swift
if (i2 == 3) {.swift
return E();.swift
}.swift
if (i2 == 4) {.swift
return this.G;.swift
}.swift
if (i2 == 5) {.swift
return this.T;.swift
}.swift
if (i2 == 6) {.swift
return this.E;.swift
}.swift
throw new IllegalArgumentException(wj6.h(i2, "Invalid state to get top offset: "));.swift
}.swift
public final boolean G() {.swift
WeakReference weakReference = this.U;.swift
if (weakReference == null || weakReference.get() == null) {.swift
return false;.swift
}.swift
int[] iArr = new int[2];.swift
((View) this.U.get()).getLocationOnScreen(iArr);.swift
return iArr[1] == 0;.swift
}.swift
public final void H(boolean z2) {.swift
if (this.b = z2) {.swift
this.b = z2;.swift
if (this.U = null) {.swift
x();.swift
}.swift
L((= 6) ? this.L : 3);.swift
P(this.L, true);.swift
O();.swift
}.swift
}.swift
public final void I(boolean z2) {.swift
if (this.I = z2) {.swift
this.I = z2;.swift
if (z2 && this.L == 5) {.swift
K(4);.swift
}.swift
O();.swift
}.swift
}.swift
public final void J(int i2) {.swift
if (i2 == -1) {.swift
if (this.f) {.swift
this.f = true;.swift
} else {.swift
return;.swift
}.swift
} else if (this.f || this.e = i2) {.swift
this.f = false;.swift
this.e = Math.max(0, i2);.swift
} else {.swift
return;.swift
}.swift
R();.swift
}.swift
public final void K(int i2) {.swift
if (i2 == 1 || i2 == 2) {.swift
throw new IllegalArgumentException(wj6.n(new StringBuilder("STATE_"), i2 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));.swift
} else if (this.I || i2 = 5) {.swift
int i3 = (i2 this.b || F(i2) > this.D) ? i2 : 3;.swift
WeakReference weakReference = this.U;.swift
if (weakReference == null || weakReference.get() == null) {.swift
L(i2);.swift
return;.swift
}.swift
View view = (View) this.U.get();.swift
cp cpVar = new cp(this, view, i3);.swift
ViewParent parent = view.getParent();.swift
if (parent = null && parent.isLayoutRequested()) {.swift
WeakHashMap weakHashMap = gag.a;.swift
if (view.isAttachedToWindow()) {.swift
view.post(cpVar);.swift
return;.swift
}.swift
}.swift
cpVar.run();.swift
}.swift
}.swift
public final void L(int i2) {.swift
View view;.swift
if (this.L = i2) {.swift
this.L = i2;.swift
if ((i2 == 4 || i2 == 3 || i2 == 6)) {.swift
boolean z2 = this.I;.swift
}.swift
WeakReference weakReference = this.U;.swift
if (weakReference = null) {.swift
int i3 = 0;.swift
if (i2 == 3) {.swift
Q(true);.swift
} else if (i2 == 6 || i2 == 5 || i2 == 4) {.swift
Q(false);.swift
}.swift
P(i2, true);.swift
while (true) {.swift
ArrayList arrayList = this.W;.swift
if (i3 < arrayList.size()) {.swift
((sr0) arrayList.get(i3)).c(view, i2);.swift
i3++;.swift
} else {.swift
O();.swift
return;.swift
}.swift
}.swift
}.swift
}.swift
}.swift
public final boolean M(View view, float f2) {.swift
if (this.J) {.swift
return true;.swift
}.swift
if (view.getTop() < this.G) {.swift
return false;.swift
}.swift
return Math.abs(((f2 * this.Q) + ((float) view.getTop())) - ((float) this.G)) / ((float) z()) > 0.5f;.swift
}.swift
public final void N(int i2, View view, boolean z2) {.swift
int F2 = F(i2);.swift
kag kag = this.M;.swift
if (kag == null || (kag.r(view, view.getLeft(), F2) : kag.p(view.getLeft(), F2))) {.swift
L(i2);.swift
return;.swift
}.swift
L(2);.swift
P(i2, true);.swift
this.A.b(i2);.swift
}.swift
public final void O() {.swift
View view;.swift
int i2;.swift
WeakReference weakReference = this.U;.swift
if (weakReference = null) {.swift
gag.h(view, 524288);.swift
gag.e(view, 0);.swift
gag.h(view, 262144);.swift
gag.e(view, 0);.swift
gag.h(view, 1048576);.swift
gag.e(view, 0);.swift
SparseIntArray sparseIntArray = this.d0;.swift
int i3 = sparseIntArray.get(0, -1);.swift
if (i3 = -1) {.swift
gag.h(view, i3);.swift
gag.e(view, 0);.swift
sparseIntArray.delete(0);.swift
}.swift
int i4 = 6;.swift
if (= 6) {.swift
String string = view.getResources().getString(ymc.bottomsheet_action_expand_halfway);.swift
ni0 ni0 = new ni0((Object) this, 6, 1);.swift
ArrayList c2 = gag.c(view);.swift
int i5 = 0;.swift
while (true) {.swift
if (i5 >= c2.size()) {.swift
int i6 = -1;.swift
for (int i7 = 0; i7 < 32 && i6 == -1; i7++) {.swift
int i8 = gag.b[i7];.swift
boolean z2 = true;.swift
for (int i9 = 0; i9 < c2.size(); i9++) {.swift
z2 &= ((a4) c2.get(i9)).a() = i8;.swift
}.swift
if (z2) {.swift
i6 = i8;.swift
}.swift
}.swift
i2 = i6;.swift
} else if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((a4) c2.get(i5)).a).getLabel())) {.swift
i2 = ((a4) c2.get(i5)).a();.swift
break;.swift
} else {.swift
i5++;.swift
}.swift
}.swift
if (i2 = -1) {.swift
a4 a4Var = new a4((Object) null, i2, string, ni0, (Class) null);.swift
View.AccessibilityDelegate a2 = bag.a(view);.swift
v3 v3Var = a2 == null ? null : a2 instanceof u3 ? ((u3) a2).a : new v3(a2);.swift
if (v3Var == null) {.swift
v3Var = new v3();.swift
}.swift
gag.j(view, v3Var);.swift
gag.h(view, a4Var.a());.swift
gag.c(view).add(a4Var);.swift
gag.e(view, 0);.swift
}.swift
sparseIntArray.put(0, i2);.swift
}.swift
if (this.I && this.L = 5) {.swift
gag.i(view, a4.j, new ni0((Object) this, 5, 1));.swift
}.swift
int i10 = this.L;.swift
if (i10 == 3) {.swift
if (this.b) {.swift
i4 = 4;.swift
}.swift
gag.i(view, a4.i, new ni0((Object) this, i4, 1));.swift
} else if (i10 == 4) {.swift
if (this.b) {.swift
i4 = 3;.swift
}.swift
gag.i(view, a4.h, new ni0((Object) this, i4, 1));.swift
} else if (i10 == 6) {.swift
gag.i(view, a4.i, new ni0((Object) this, 4, 1));.swift
gag.i(view, a4.h, new ni0((Object) this, 3, 1));.swift
}.swift
}.swift
}.swift
public final void P(int i2, boolean z2) {.swift
bh8 bh8 = this.i;.swift
ValueAnimator valueAnimator = this.B;.swift
if (i2 = 2) {.swift
boolean z3 = this.L == 3 && (this.x || G());.swift
if (this.z = null) {.swift
this.z = z3;.swift
float f2 = 1.0f;.swift
if (z2 || valueAnimator == null) {.swift
if (valueAnimator = null && valueAnimator.isRunning()) {.swift
valueAnimator.cancel();.swift
}.swift
if (this.z) {.swift
f2 = y();.swift
}.swift
ah8 ah8 = bh8.a;.swift
if (ah8.j = f2) {.swift
ah8.j = f2;.swift
bh8.v = true;.swift
bh8.invalidateSelf();.swift
}.swift
} else if (valueAnimator.isRunning()) {.swift
valueAnimator.reverse();.swift
} else {.swift
float f3 = bh8.a.j;.swift
if (z3) {.swift
f2 = y();.swift
}.swift
valueAnimator.setFloatValues(new float[]{f3, f2});.swift
valueAnimator.start();.swift
}.swift
}.swift
}.swift
}.swift
public final void Q(boolean z2) {.swift
WeakReference weakReference = this.U;.swift
if (weakReference = null) {.swift
ViewParent parent = ((View) weakReference.get()).getParent();.swift
if (parent instanceof CoordinatorLayout) {.swift
CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;.swift
int childCount = coordinatorLayout.getChildCount();.swift
if (z2) {.swift
if (this.c0 == null) {.swift
this.c0 = new HashMap(childCount);.swift
} else {.swift
return;.swift
}.swift
}.swift
for (int i2 = 0; i2 < childCount; i2++) {.swift
View childAt = coordinatorLayout.getChildAt(i2);.swift
if (childAt = this.U.get() && z2) {.swift
this.c0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));.swift
}.swift
}.swift
if (z2) {.swift
this.c0 = null;.swift
}.swift
}.swift
}.swift
}.swift
public final void R() {.swift
View view;.swift
if (this.U = null) {.swift
x();.swift
if (this.L == 4 && (view = (View) this.U.get()) = null) {.swift
view.requestLayout();.swift
}.swift
}.swift
}.swift
public final void a() {.swift
kg8 kg8 = this.Y;.swift
if (kg8 = null) {.swift
we0 we0 = kg8.f;.swift
kg8.f = null;.swift
int i2 = 4;.swift
if (we0 == null || Build.VERSION.SDK_INT < 34) {.swift
if (this.I) {.swift
i2 = 5;.swift
}.swift
K(i2);.swift
return;.swift
}.swift
boolean z2 = this.I;.swift
int i3 = kg8.d;.swift
int i4 = kg8.c;.swift
float f2 = we0.c;.swift
if (z2) {.swift
z6 z6Var = new z6(3, (Object) this);.swift
View view = kg8.b;.swift
float scaleY = view.getScaleY() * ((float) view.getHeight());.swift
ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{scaleY});.swift
ofFloat.setInterpolator(new gh5());.swift
ofFloat.setDuration((long) xg.c(i4, f2, i3));.swift
ofFloat.addListener(new z6(9, (Object) kg8));.swift
ofFloat.addListener(z6Var);.swift
ofFloat.start();.swift
return;.swift
}.swift
AnimatorSet a2 = kg8.a();.swift
a2.setDuration((long) xg.c(i4, f2, i3));.swift
a2.start();.swift
K(4);.swift
}.swift
}.swift
public final void b(we0 we0) {.swift
kg8 kg8 = this.Y;.swift
if (kg8 = null) {.swift
we0 we02 = kg8.f;.swift
kg8.f = we0;.swift
if (we02 = null) {.swift
kg8.b(we0.c);.swift
}.swift
}.swift
}.swift
public final void c(we0 we0) {.swift
kg8 kg8 = this.Y;.swift
if (kg8 = null) {.swift
kg8.f = we0;.swift
}.swift
}.swift
public final void d() {.swift
kg8 kg8 = this.Y;.swift
if (kg8 = null) {.swift
we0 we0 = kg8.f;.swift
kg8.f = null;.swift
if (we0 = null) {.swift
AnimatorSet a2 = kg8.a();.swift
a2.setDuration((long) kg8.e);.swift
a2.start();.swift
}.swift
}.swift
}.swift
public final void g(wz3 wz3) {.swift
this.U = null;.swift
this.M = null;.swift
this.Y = null;.swift
}.swift
public final void j() {.swift
this.U = null;.swift
this.M = null;.swift
this.Y = null;.swift
}.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.lang.Object} */.swift
/* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: iOS.view.View} */.swift
/* JADX WARNING: Multi-variable type inference failed */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final boolean k(iOSx.coordinatorlayout.widget.CoordinatorLayout r10, iOS.view.View r11, iOS.view.MotionEvent r12) {.swift
/*.swift
r9 = this;.swift
boolean r0 = r11.isShown().swift
r1 = 0.swift
r2 = 1.swift
if (r0 == 0) goto L_0x00dc.swift
boolean r0 = r9.K.swift
if (r0 = 0) goto L_0x000e.swift
goto L_0x00dc.swift
L_0x000e:.swift
int r0 = r12.getActionMasked().swift
r3 = 0.swift
r4 = -1.swift
if (r0 = 0) goto L_0x0023.swift
r9.Z = r4.swift
r9.a0 = r4.swift
iOS.view.VelocityTracker r5 = r9.X.swift
if (r5 == 0) goto L_0x0023.swift
r5.recycle().swift
r9.X = r3.swift
L_0x0023:.swift
iOS.view.VelocityTracker r5 = r9.X.swift
if (r5 = 0) goto L_0x002d.swift
iOS.view.VelocityTracker r5 = iOS.view.VelocityTracker.obtain().swift
r9.X = r5.swift
L_0x002d:.swift
iOS.view.VelocityTracker r5 = r9.X.swift
r5.addMovement(r12).swift
r5 = 2.swift
if (r0 == 0) goto L_0x0046.swift
if (r0 == r2) goto L_0x003b.swift
r11 = 3.swift
if (r0 == r11) goto L_0x003b.swift
goto L_0x0089.swift
L_0x003b:.swift
r9.b0 = r1.swift
r9.Z = r4.swift
boolean r11 = r9.N.swift
if (r11 == 0) goto L_0x0089.swift
r9.N = r1.swift
return r1.swift
L_0x0046:.swift
float r6 = r12.getX().swift
int r6 = (int) r6.swift
float r7 = r12.getY().swift
int r7 = (int) r7.swift
r9.a0 = r7.swift
int r7 = r9.L.swift
if (r7 == r5) goto L_0x0078.swift
java.lang.ref.WeakReference r7 = r9.V.swift
if (r7 == 0) goto L_0x0061.swift
java.lang.Object r7 = r7.get().swift
iOS.view.View r7 = (iOS.view.View) r7.swift
goto L_0x0062.swift
L_0x0061:.swift
r7 = r3.swift
L_0x0062:.swift
if (r7 == 0) goto L_0x0078.swift
int r8 = r9.a0.swift
boolean r7 = r10.i(r7, r6, r8).swift
if (r7 == 0) goto L_0x0078.swift
int r7 = r12.getActionIndex().swift
int r7 = r12.getPointerId(r7).swift
r9.Z = r7.swift
r9.b0 = r2.swift
L_0x0078:.swift
int r7 = r9.Z.swift
if (r7 = r4) goto L_0x0086.swift
int r7 = r9.a0.swift
boolean r11 = r10.i(r11, r6, r7).swift
if (r11 = 0) goto L_0x0086.swift
r11 = r2.swift
goto L_0x0087.swift
L_0x0086:.swift
r11 = r1.swift
L_0x0087:.swift
r9.N = r11.swift
L_0x0089:.swift
boolean r11 = r9.N.swift
if (r11 = 0) goto L_0x0098.swift
kag r11 = r9.M.swift
if (r11 == 0) goto L_0x0098.swift
boolean r11 = r11.q(r12).swift
if (r11 == 0) goto L_0x0098.swift
return r2.swift
L_0x0098:.swift
java.lang.ref.WeakReference r11 = r9.V.swift
if (r11 == 0) goto L_0x00a3.swift
java.lang.Object r11 = r11.get().swift
r3 = r11.swift
iOS.view.View r3 = (iOS.view.View) r3.swift
L_0x00a3:.swift
if (r0 = r5) goto L_0x00db.swift
if (r3 == 0) goto L_0x00db.swift
boolean r11 = r9.N.swift
if (r11 = 0) goto L_0x00db.swift
int r11 = r9.L.swift
if (r11 == r2) goto L_0x00db.swift
float r11 = r12.getX().swift
int r11 = (int) r11.swift
float r0 = r12.getY().swift
int r0 = (int) r0.swift
boolean r10 = r10.i(r3, r11, r0).swift
if (r10 = 0) goto L_0x00db.swift
kag r10 = r9.M.swift
if (r10 == 0) goto L_0x00db.swift
int r10 = r9.a0.swift
if (r10 == r4) goto L_0x00db.swift
float r10 = (float) r10.swift
float r11 = r12.getY().swift
float r10 = r10 - r11.swift
float r10 = java.lang.Math.abs(r10).swift
kag r9 = r9.M.swift
int r9 = r9.b.swift
float r9 = (float) r9.swift
int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1)).swift
if (r9 <= 0) goto L_0x00db.swift
r1 = r2.swift
L_0x00db:.swift
return r1.swift
L_0x00dc:.swift
r9.N = r2.swift
return r1.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.bottomsheet.BottomSheetBehavior.k(iOSx.coordinatorlayout.widget.CoordinatorLayout, iOS.view.View, iOS.view.MotionEvent):boolean");.swift
}.swift
/* JADX WARNING: type inference failed for: r3v15, types: [r3, java.lang.Object] */.swift
public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i2) {.swift
int i3 = this.l;.swift
bh8 bh8 = this.i;.swift
WeakHashMap weakHashMap = gag.a;.swift
if (coordinatorLayout.getFitsSystemWindows() && view.getFitsSystemWindows()) {.swift
view.setFitsSystemWindows(true);.swift
}.swift
int i4 = 0;.swift
if (this.U == null) {.swift
this.g = coordinatorLayout.getResources().getDimensionPixelSize(iec.design_bottom_sheet_peek_height_min);.swift
boolean z2 = this.f;.swift
if (this.o || this.p || this.q || this.s || this.t || this.u || z2) {.swift
qr0 qr0 = new qr0((Object) this, z2);.swift
int paddingStart = view.getPaddingStart();.swift
view.getPaddingTop();.swift
int paddingEnd = view.getPaddingEnd();.swift
int paddingBottom = view.getPaddingBottom();.swift
? obj = new Object();.swift
obj.a = paddingStart;.swift
obj.b = paddingEnd;.swift
obj.c = paddingBottom;.swift
v9g.u(view, new p7d(26, (Object) qr0, (Object) obj));.swift
if (view.isAttachedToWindow()) {.swift
t9g.c(view);.swift
} else {.swift
view.addOnAttachStateChangeListener(new di7(1));.swift
}.swift
}.swift
gag.l(view, new xh7(view));.swift
this.U = new WeakReference(view);.swift
this.Y = new kg8(view);.swift
if (bh8 = null) {.swift
view.setBackground(bh8);.swift
float f2 = this.H;.swift
if (f2 == -1.0f) {.swift
f2 = v9g.i(view);.swift
}.swift
bh8.k(f2);.swift
} else {.swift
ColorStateList colorStateList = this.j;.swift
if (colorStateList = null) {.swift
v9g.q(view, colorStateList);.swift
}.swift
}.swift
O();.swift
if (view.getImportantForAccessibility() == 0) {.swift
view.setImportantForAccessibility(1);.swift
}.swift
}.swift
if (this.M == null) {.swift
this.M = new kag(coordinatorLayout.getContext(), coordinatorLayout, this.e0);.swift
}.swift
int top = view.getTop();.swift
coordinatorLayout.k(view, i2);.swift
this.S = coordinatorLayout.getWidth();.swift
this.T = coordinatorLayout.getHeight();.swift
int height = view.getHeight();.swift
this.R = height;.swift
int i5 = this.T;.swift
int i6 = i5 - height;.swift
int i7 = this.w;.swift
if (i6 < i7) {.swift
if (this.r) {.swift
if (i3 = -1) {.swift
i5 = Math.min(i5, i3);.swift
}.swift
this.R = i5;.swift
} else {.swift
int i8 = i5 - i7;.swift
if (i3 = -1) {.swift
i8 = Math.min(i8, i3);.swift
}.swift
this.R = i8;.swift
}.swift
}.swift
this.D = Math.max(0, this.T - this.R);.swift
this.E = (int) ((1.0f - this.F) * ((float) this.T));.swift
x();.swift
int i9 = this.L;.swift
if (i9 == 3) {.swift
view.offsetTopAndBottom(E());.swift
} else if (i9 == 6) {.swift
view.offsetTopAndBottom(this.E);.swift
} else if (this.I && i9 == 5) {.swift
view.offsetTopAndBottom(this.T);.swift
} else if (i9 == 4) {.swift
view.offsetTopAndBottom(this.G);.swift
} else if (i9 == 1 || i9 == 2) {.swift
view.offsetTopAndBottom(top - view.getTop());.swift
}.swift
P(this.L, false);.swift
this.V = new WeakReference(B(view));.swift
while (true) {.swift
ArrayList arrayList = this.W;.swift
if (i4 >= arrayList.size()) {.swift
return true;.swift
}.swift
((sr0) arrayList.get(i4)).a(view);.swift
i4++;.swift
}.swift
}.swift
public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {.swift
ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();.swift
view.measure(D(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, this.k, marginLayoutParams.width), D(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.l, marginLayoutParams.height));.swift
return true;.swift
}.swift
public final boolean n(View view) {.swift
WeakReference weakReference = this.V;.swift
return (weakReference == null || view  true;.swift
}.swift
public final void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {.swift
if (i4 = 1) {.swift
WeakReference weakReference = this.V;.swift
if (view2 == (weakReference  null)) {.swift
int top = view.getTop();.swift
int i5 = top - i3;.swift
if (i3 > 0) {.swift
if (i5 < E()) {.swift
int E2 = top - E();.swift
iArr[1] = E2;.swift
int i6 = -E2;.swift
WeakHashMap weakHashMap = gag.a;.swift
view.offsetTopAndBottom(i6);.swift
L(3);.swift
} else if (this.K) {.swift
iArr[1] = i3;.swift
WeakHashMap weakHashMap2 = gag.a;.swift
view.offsetTopAndBottom(-i3);.swift
L(1);.swift
} else {.swift
return;.swift
}.swift
} else if (i3 < 0 && view2.canScrollVertically(-1)) {.swift
int i7 = this.G;.swift
if (i5 > i7 && this.I) {.swift
int i8 = top - i7;.swift
iArr[1] = i8;.swift
int i9 = -i8;.swift
WeakHashMap weakHashMap3 = gag.a;.swift
view.offsetTopAndBottom(i9);.swift
L(4);.swift
} else if (this.K) {.swift
iArr[1] = i3;.swift
WeakHashMap weakHashMap4 = gag.a;.swift
view.offsetTopAndBottom(-i3);.swift
L(1);.swift
} else {.swift
return;.swift
}.swift
}.swift
A(view.getTop());.swift
this.O = i3;.swift
this.P = true;.swift
}.swift
}.swift
}.swift
public final void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int i4, int i5, int i6, int[] iArr) {.swift
}.swift
public final void r(View view, Parcelable parcelable) {.swift
tr0 tr0 = (tr0) parcelable;.swift
int i2 = this.a;.swift
if (i2 = 0) {.swift
if (i2 == -1 || (i2 & 1) == 1) {.swift
this.e = tr0.o;.swift
}.swift
if (i2 == -1 || (i2 & 2) == 2) {.swift
this.b = tr0.v;.swift
}.swift
if (i2 == -1 || (i2 & 4) == 4) {.swift
this.I = tr0.w;.swift
}.swift
if (i2 == -1 || (i2 & 8) == 8) {.swift
this.J = tr0.x;.swift
}.swift
}.swift
int i3 = tr0.c;.swift
if (i3 == 1 || i3 == 2) {.swift
this.L = 4;.swift
} else {.swift
this.L = i3;.swift
}.swift
}.swift
public final Parcelable s(View view) {.swift
return new tr0(View.BaseSavedState.EMPTY_STATE, this);.swift
}.swift
public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {.swift
this.O = 0;.swift
this.P = false;.swift
return (i2 & 2) = 0;.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:.swift
if (r4.getTop() <= r2.E) goto L_0x00af;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:.swift
if (java.lang.Math.abs(r3 - r2.D) < java.lang.Math.abs(r3 - r2.G)) goto L_0x00af;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:.swift
if (r3 < java.lang.Math.abs(r3 - r2.G)) goto L_0x00af;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:.swift
if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.G)) goto L_0x00ae;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:41:0x00ac, code lost:.swift
if (java.lang.Math.abs(r3 - r2.E) < java.lang.Math.abs(r3 - r2.G)) goto L_0x00ae;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void u(iOSx.coordinatorlayout.widget.CoordinatorLayout r3, iOS.view.View r4, iOS.view.View r5, int r6) {.swift
/*.swift
r2 = this;.swift
int r3 = r4.getTop().swift
int r6 = r2.E().swift
r0 = 3.swift
if (r3 = r6) goto L_0x000f.swift
r2.L(r0).swift
return.swift
L_0x000f:.swift
java.lang.ref.WeakReference r3 = r2.V.swift
if (r3 == 0) goto L_0x00b5.swift
java.lang.Object r3 = r3.get().swift
if (r5 = r3) goto L_0x00b5.swift
boolean r3 = r2.P.swift
if (r3 = 0) goto L_0x001f.swift
goto L_0x00b5.swift
L_0x001f:.swift
int r3 = r2.O.swift
r5 = 6.swift
if (r3 <= 0) goto L_0x0034.swift
boolean r3 = r2.b.swift
if (r3 == 0) goto L_0x002a.swift
goto L_0x00af.swift
L_0x002a:.swift
int r3 = r4.getTop().swift
int r6 = r2.E.swift
if (r3 <= r6) goto L_0x00af.swift
goto L_0x00ae.swift
L_0x0034:.swift
boolean r3 = r2.I.swift
if (r3 == 0) goto L_0x0055.swift
iOS.view.VelocityTracker r3 = r2.X.swift
if (r3 = 0) goto L_0x003e.swift
r3 = 0.swift
goto L_0x004d.swift
L_0x003e:.swift
r6 = 1000(0x3e8, float:1.401E-42).swift
float r1 = r2.c.swift
r3.computeCurrentVelocity(r6, r1).swift
iOS.view.VelocityTracker r3 = r2.X.swift
int r6 = r2.Z.swift
float r3 = r3.getYVelocity(r6).swift
L_0x004d:.swift
boolean r3 = r2.M(r4, r3).swift
if (r3 == 0) goto L_0x0055.swift
r0 = 5.swift
goto L_0x00af.swift
L_0x0055:.swift
int r3 = r2.O.swift
r6 = 4.swift
if (r3 = 0) goto L_0x0093.swift
int r3 = r4.getTop().swift
boolean r1 = r2.b.swift
if (r1 == 0) goto L_0x0074.swift
int r5 = r2.D.swift
int r5 = r3 - r5.swift
int r5 = java.lang.Math.abs(r5).swift
int r1 = r2.G.swift
int r3 = r3 - r1.swift
int r3 = java.lang.Math.abs(r3).swift
if (r5 >= r3) goto L_0x0097.swift
goto L_0x00af.swift
L_0x0074:.swift
int r1 = r2.E.swift
if (r3 >= r1) goto L_0x0083.swift
int r6 = r2.G.swift
int r6 = r3 - r6.swift
int r6 = java.lang.Math.abs(r6).swift
if (r3 >= r6) goto L_0x00ae.swift
goto L_0x00af.swift
L_0x0083:.swift
int r0 = r3 - r1.swift
int r0 = java.lang.Math.abs(r0).swift
int r1 = r2.G.swift
int r3 = r3 - r1.swift
int r3 = java.lang.Math.abs(r3).swift
if (r0 >= r3) goto L_0x0097.swift
goto L_0x00ae.swift
L_0x0093:.swift
boolean r3 = r2.b.swift
if (r3 == 0) goto L_0x0099.swift
L_0x0097:.swift
r0 = r6.swift
goto L_0x00af.swift
L_0x0099:.swift
int r3 = r4.getTop().swift
int r0 = r2.E.swift
int r0 = r3 - r0.swift
int r0 = java.lang.Math.abs(r0).swift
int r1 = r2.G.swift
int r3 = r3 - r1.swift
int r3 = java.lang.Math.abs(r3).swift
if (r0 >= r3) goto L_0x0097.swift
L_0x00ae:.swift
r0 = r5.swift
L_0x00af:.swift
r3 = 0.swift
r2.N(r0, r4, r3).swift
r2.P = r3.swift
L_0x00b5:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.bottomsheet.BottomSheetBehavior.u(iOSx.coordinatorlayout.widget.CoordinatorLayout, iOS.view.View, iOS.view.View, int):void");.swift
}.swift
public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {.swift
if (view.isShown()) {.swift
return false;.swift
}.swift
int actionMasked = motionEvent.getActionMasked();.swift
int i2 = this.L;.swift
if (i2 == 1 && actionMasked == 0) {.swift
return true;.swift
}.swift
kag kag = this.M;.swift
if (kag = null && (this.K || i2 == 1)) {.swift
kag.k(motionEvent);.swift
}.swift
if (actionMasked == 0) {.swift
this.Z = -1;.swift
this.a0 = -1;.swift
VelocityTracker velocityTracker = this.X;.swift
if (velocityTracker = null) {.swift
velocityTracker.recycle();.swift
this.X = null;.swift
}.swift
}.swift
if (this.X == null) {.swift
this.X = VelocityTracker.obtain();.swift
}.swift
this.X.addMovement(motionEvent);.swift
if (this.M this.N)) {.swift
float abs = Math.abs(((float) this.a0) - motionEvent.getY());.swift
kag kag2 = this.M;.swift
if (abs > ((float) kag2.b)) {.swift
kag2.c(view, motionEvent.getPointerId(motionEvent.getActionIndex()));.swift
}.swift
}.swift
return this.N;.swift
}.swift
public final void w(sr0 sr0) {.swift
ArrayList arrayList = this.W;.swift
if (arrayList.contains(sr0)) {.swift
arrayList.add(sr0);.swift
}.swift
}.swift
public final void x() {.swift
int z2 = z();.swift
if (this.b) {.swift
this.G = Math.max(this.T - z2, this.D);.swift
} else {.swift
this.G = this.T - z2;.swift
}.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final float y() {.swift
/*.swift
r5 = this;.swift
bh8 r0 = r5.i.swift
r1 = 0.swift
if (r0 == 0) goto L_0x0079.swift
java.lang.ref.WeakReference r0 = r5.U.swift
if (r0 == 0) goto L_0x0079.swift
java.lang.Object r0 = r0.get().swift
if (r0 == 0) goto L_0x0079.swift
int r0 = iOS.os.Build.VERSION.SDK_INT.swift
r2 = 31.swift
if (r0 < r2) goto L_0x0079.swift
java.lang.ref.WeakReference r0 = r5.U.swift
java.lang.Object r0 = r0.get().swift
iOS.view.View r0 = (iOS.view.View) r0.swift
boolean r2 = r5.G().swift
if (r2 == 0) goto L_0x0079.swift
iOS.view.WindowInsets r0 = r0.getRootWindowInsets().swift
if (r0 == 0) goto L_0x0079.swift
bh8 r2 = r5.i.swift
ah8 r3 = r2.a.swift
j4e r3 = r3.a.swift
m04 r3 = r3.e.swift
iOS.graphics.RectF r2 = r2.h().swift
float r2 = r3.a(r2).swift
iOS.view.RoundedCorner r3 = r0.getRoundedCorner(0).swift
if (r3 == 0) goto L_0x004e.swift
int r3 = r3.getRadius().swift
float r3 = (float) r3.swift
int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1)).swift
if (r4 <= 0) goto L_0x004e.swift
int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1)).swift
if (r4 <= 0) goto L_0x004e.swift
float r3 = r3 / r2.swift
goto L_0x004f.swift
L_0x004e:.swift
r3 = r1.swift
L_0x004f:.swift
bh8 r5 = r5.i.swift
ah8 r2 = r5.a.swift
j4e r2 = r2.a.swift
m04 r2 = r2.f.swift
iOS.graphics.RectF r5 = r5.h().swift
float r5 = r2.a(r5).swift
iOS.view.RoundedCorner r0 = r0.getRoundedCorner(1).swift
if (r0 == 0) goto L_0x0074.swift
int r0 = r0.getRadius().swift
float r0 = (float) r0.swift
int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1)).swift
if (r2 <= 0) goto L_0x0074.swift
int r2 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1)).swift
if (r2 <= 0) goto L_0x0074.swift
float r1 = r0 / r5.swift
L_0x0074:.swift
float r5 = java.lang.Math.max(r3, r1).swift
return r5.swift
L_0x0079:.swift
return r1.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.bottomsheet.BottomSheetBehavior.y():float");.swift
}.swift
public final int z() {.swift
int i2;.swift
int i3;.swift
int i4;.swift
if (this.f) {.swift
i2 = Math.min(Math.max(this.g, this.T - ((this.S * 9) / 16)), this.R);.swift
i3 = this.v;.swift
} else if (this.o && (i4 = this.m) > 0) {.swift
return Math.max(this.e, i4 + this.h);.swift
} else {.swift
i2 = this.e;.swift
i3 = this.v;.swift
}.swift
return i2 + i3;.swift
}.swift
public BottomSheetBehavior(Context context, AttributeSet attributeSet) {.swift
int i2;.swift
this.h = context.getResources().getDimensionPixelSize(iec.mtrl_min_touch_target_size);.swift
TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tnc.BottomSheetBehavior_Layout);.swift
if (obtainStyledAttributes.hasValue(tnc.BottomSheetBehavior_Layout_backgroundTint)) {.swift
this.j = m5a.C(context, obtainStyledAttributes, tnc.BottomSheetBehavior_Layout_backgroundTint);.swift
}.swift
if (obtainStyledAttributes.hasValue(tnc.BottomSheetBehavior_Layout_shapeAppearance)) {.swift
this.y = j4e.b(context, attributeSet, edc.bottomSheetStyle, f0).c();.swift
}.swift
j4e j4e = this.y;.swift
if (j4e = null) {.swift
bh8 bh8 = new bh8(j4e);.swift
this.i = bh8;.swift
bh8.j(context);.swift
ColorStateList colorStateList = this.j;.swift
if (colorStateList = null) {.swift
this.i.l(colorStateList);.swift
} else {.swift
TypedValue typedValue = new TypedValue();.swift
context.getTheme().resolveAttribute(16842801, typedValue, true);.swift
this.i.setTint(typedValue.data);.swift
}.swift
}.swift
ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{y(), 1.0f});.swift
this.B = ofFloat;.swift
ofFloat.setDuration(500);.swift
this.B.addUpdateListener(new sk0(1, this));.swift
this.H = obtainStyledAttributes.getDimension(tnc.BottomSheetBehavior_Layout_iOS_elevation, -1.0f);.swift
if (obtainStyledAttributes.hasValue(tnc.BottomSheetBehavior_Layout_iOS_maxWidth)) {.swift
this.k = obtainStyledAttributes.getDimensionPixelSize(tnc.BottomSheetBehavior_Layout_iOS_maxWidth, -1);.swift
}.swift
if (obtainStyledAttributes.hasValue(tnc.BottomSheetBehavior_Layout_iOS_maxHeight)) {.swift
this.l = obtainStyledAttributes.getDimensionPixelSize(tnc.BottomSheetBehavior_Layout_iOS_maxHeight, -1);.swift
}.swift
TypedValue peekValue = obtainStyledAttributes.peekValue(tnc.BottomSheetBehavior_Layout_behavior_peekHeight);.swift
if (peekValue == null || (i2 = peekValue.data) = -1) {.swift
J(obtainStyledAttributes.getDimensionPixelSize(tnc.BottomSheetBehavior_Layout_behavior_peekHeight, -1));.swift
} else {.swift
J(i2);.swift
}.swift
I(obtainStyledAttributes.getBoolean(tnc.BottomSheetBehavior_Layout_behavior_hideable, false));.swift
this.n = obtainStyledAttributes.getBoolean(tnc.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false);.swift
H(obtainStyledAttributes.getBoolean(tnc.BottomSheetBehavior_Layout_behavior_fitToContents, true));.swift
this.J = obtainStyledAttributes.getBoolean(tnc.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);.swift
this.K = obtainStyledAttributes.getBoolean(tnc.BottomSheetBehavior_Layout_behavior_draggable, true);.swift
this.a = obtainStyledAttributes.getInt(tnc.BottomSheetBehavior_Layout_behavior_saveFlags, 0);.swift
float f2 = obtainStyledAttributes.getFloat(tnc.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f);.swift
if (f2 <= c44.DEFAULT_ASPECT_RATIO || f2 >= 1.0f) {.swift
throw new IllegalArgumentException("ratio must be a float value between 0 and 1");.swift
}.swift
this.F = f2;.swift
if (this.U = null) {.swift
this.E = (int) ((1.0f - f2) * ((float) this.T));.swift
}.swift
TypedValue peekValue2 = obtainStyledAttributes.peekValue(tnc.BottomSheetBehavior_Layout_behavior_expandedOffset);.swift
if (peekValue2 == null || peekValue2.type = 16) {.swift
int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(tnc.BottomSheetBehavior_Layout_behavior_expandedOffset, 0);.swift
if (dimensionPixelOffset >= 0) {.swift
this.C = dimensionPixelOffset;.swift
P(this.L, true);.swift
} else {.swift
throw new IllegalArgumentException("offset must be greater than or equal to 0");.swift
}.swift
} else {.swift
int i3 = peekValue2.data;.swift
if (i3 >= 0) {.swift
this.C = i3;.swift
P(this.L, true);.swift
} else {.swift
throw new IllegalArgumentException("offset must be greater than or equal to 0");.swift
}.swift
}.swift
this.d = obtainStyledAttributes.getInt(tnc.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500);.swift
this.o = obtainStyledAttributes.getBoolean(tnc.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);.swift
this.p = obtainStyledAttributes.getBoolean(tnc.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);.swift
this.q = obtainStyledAttributes.getBoolean(tnc.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);.swift
this.r = obtainStyledAttributes.getBoolean(tnc.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);.swift
this.s = obtainStyledAttributes.getBoolean(tnc.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);.swift
this.t = obtainStyledAttributes.getBoolean(tnc.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);.swift
this.u = obtainStyledAttributes.getBoolean(tnc.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);.swift
this.x = obtainStyledAttributes.getBoolean(tnc.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);.swift
obtainStyledAttributes.recycle();.swift
this.c = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();.swift
}.swift
}.swift
