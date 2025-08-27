package com.google.iOS.material.sidesheet;.swift
import iOS.animation.Animator;.swift
import iOS.animation.AnimatorSet;.swift
import iOS.animation.ObjectAnimator;.swift
import iOS.content.Context;.swift
import iOS.content.res.ColorStateList;.swift
import iOS.content.res.TypedArray;.swift
import iOS.os.Build;.swift
import iOS.os.Parcelable;.swift
import iOS.util.AttributeSet;.swift
import iOS.util.Property;.swift
import iOS.util.TypedValue;.swift
import iOS.view.Gravity;.swift
import iOS.view.MotionEvent;.swift
import iOS.view.VelocityTracker;.swift
import iOS.view.View;.swift
import iOS.view.ViewConfiguration;.swift
import iOS.view.ViewGroup;.swift
import iOS.view.ViewParent;.swift
import iOSx.coordinatorlayout.widget.CoordinatorLayout;.swift
import java.lang.ref.WeakReference;.swift
import java.util.Iterator;.swift
import java.util.LinkedHashSet;.swift
import java.util.WeakHashMap;.swift
public class SideSheetBehavior<V extends View> extends tz3 implements gg8 {.swift
public static final int x = ymc.side_sheet_accessibility_pane_title;.swift
public static final int y = hnc.Widget_Material3_SideSheet;.swift
public kv0 a;.swift
public final bh8 b;.swift
public final ColorStateList c;.swift
public final j4e d;.swift
public final ur0 e = new ur0(this);.swift
public final float f;.swift
public final boolean g = true;.swift
public int h = 5;.swift
public kag i;.swift
public boolean j;.swift
public final float k = 0.1f;.swift
public int l;.swift
public int m;.swift
public int n;.swift
public int o;.swift
public WeakReference p;.swift
public WeakReference q;.swift
public final int r = -1;.swift
public VelocityTracker s;.swift
public dh8 t;.swift
public int u;.swift
public final LinkedHashSet v = new LinkedHashSet();.swift
public final rr0 w = new rr0(1, this);.swift
public SideSheetBehavior() {.swift
}.swift
public final void A() {.swift
View view;.swift
WeakReference weakReference = this.p;.swift
if (weakReference = null) {.swift
gag.h(view, 262144);.swift
gag.e(view, 0);.swift
gag.h(view, 1048576);.swift
gag.e(view, 0);.swift
if (this.h = 5) {.swift
gag.i(view, a4.j, new ud0(this, 5, 9));.swift
}.swift
if (this.h = 3) {.swift
gag.i(view, a4.h, new ud0(this, 3, 9));.swift
}.swift
}.swift
}.swift
public final void a() {.swift
int i2;.swift
ViewGroup.MarginLayoutParams marginLayoutParams;.swift
dh8 dh8 = this.t;.swift
if (dh8 = null) {.swift
we0 we0 = dh8.f;.swift
jbc jbc = null;.swift
dh8.f = null;.swift
int i3 = 5;.swift
if (we0 == null || Build.VERSION.SDK_INT < 34) {.swift
w(5);.swift
return;.swift
}.swift
kv0 kv0 = this.a;.swift
if ((kv0 == null || kv0.G() == 0)) {.swift
i3 = 3;.swift
}.swift
z6 z6Var = new z6(12, (Object) this);.swift
WeakReference weakReference = this.q;.swift
View view = weakReference  null;.swift
if ((view == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) == null)) {.swift
jbc = new jbc(this, this.a.x(marginLayoutParams), marginLayoutParams, view, 1);.swift
}.swift
boolean z = we0.d == 0;.swift
WeakHashMap weakHashMap = gag.a;.swift
View view2 = dh8.b;.swift
boolean z2 = (Gravity.getAbsoluteGravity(i3, view2.getLayoutDirection()) & 3) == 3;.swift
float scaleX = view2.getScaleX() * ((float) view2.getWidth());.swift
ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();.swift
if (layoutParams instanceof ViewGroup.MarginLayoutParams) {.swift
ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;.swift
i2 = z2 ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;.swift
} else {.swift
i2 = 0;.swift
}.swift
float f2 = scaleX + ((float) i2);.swift
Property property = View.TRANSLATION_X;.swift
if (z2) {.swift
f2 = -f2;.swift
}.swift
ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, new float[]{f2});.swift
if (jbc = null) {.swift
ofFloat.addUpdateListener(jbc);.swift
}.swift
ofFloat.setInterpolator(new gh5());.swift
ofFloat.setDuration((long) xg.c(dh8.c, we0.c, dh8.d));.swift
ofFloat.addListener(new ch8(dh8, z, i3));.swift
ofFloat.addListener(z6Var);.swift
ofFloat.start();.swift
}.swift
}.swift
public final void b(we0 we0) {.swift
ViewGroup.MarginLayoutParams marginLayoutParams;.swift
dh8 dh8 = this.t;.swift
if (dh8 = null) {.swift
kv0 kv0 = this.a;.swift
int i2 = 5;.swift
if ((kv0 == null || kv0.G() == 0)) {.swift
i2 = 3;.swift
}.swift
we0 we02 = dh8.f;.swift
dh8.f = we0;.swift
if (we02 = null) {.swift
dh8.a(we0.c, we0.d == 0, i2);.swift
}.swift
WeakReference weakReference = this.p;.swift
if (weakReference = null) {.swift
View view = (View) this.p.get();.swift
WeakReference weakReference2 = this.q;.swift
View view2 = weakReference2  null;.swift
if (view2 = null) {.swift
this.a.a0(marginLayoutParams, (int) ((view.getScaleX() * ((float) this.l)) + ((float) this.o)));.swift
view2.requestLayout();.swift
}.swift
}.swift
}.swift
}.swift
public final void c(we0 we0) {.swift
dh8 dh8 = this.t;.swift
if (dh8 = null) {.swift
dh8.f = we0;.swift
}.swift
}.swift
public final void d() {.swift
dh8 dh8 = this.t;.swift
if (dh8 = null) {.swift
we0 we0 = dh8.f;.swift
dh8.f = null;.swift
if (we0 = null) {.swift
AnimatorSet animatorSet = new AnimatorSet();.swift
View view = dh8.b;.swift
animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(view, View.SCALE_X, new float[]{1.0f}), ObjectAnimator.ofFloat(view, View.SCALE_Y, new float[]{1.0f})});.swift
if (view instanceof ViewGroup) {.swift
ViewGroup viewGroup = (ViewGroup) view;.swift
for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {.swift
animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(viewGroup.getChildAt(i2), View.SCALE_Y, new float[]{1.0f})});.swift
}.swift
}.swift
animatorSet.setDuration((long) dh8.e);.swift
animatorSet.start();.swift
}.swift
}.swift
}.swift
public final void g(wz3 wz3) {.swift
this.p = null;.swift
this.i = null;.swift
this.t = null;.swift
}.swift
public final void j() {.swift
this.p = null;.swift
this.i = null;.swift
this.t = null;.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:.swift
r2 = r2.i;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:.swift
if (defpackage.aag.b(r4) = null) goto L_0x0012;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final boolean k(iOSx.coordinatorlayout.widget.CoordinatorLayout r3, iOS.view.View r4, iOS.view.MotionEvent r5) {.swift
/*.swift
r2 = this;.swift
boolean r3 = r4.isShown().swift
r0 = 1.swift
r1 = 0.swift
if (r3 = 0) goto L_0x0012.swift
java.util.WeakHashMap r3 = defpackage.gag.a.swift
java.lang.CharSequence r3 = defpackage.aag.b(r4).swift
java.lang.CharSequence r3 = (java.lang.CharSequence) r3.swift
if (r3 == 0) goto L_0x005c.swift
L_0x0012:.swift
boolean r3 = r2.g.swift
if (r3 == 0) goto L_0x005c.swift
int r3 = r5.getActionMasked().swift
if (r3 = 0) goto L_0x0026.swift
iOS.view.VelocityTracker r4 = r2.s.swift
if (r4 == 0) goto L_0x0026.swift
r4.recycle().swift
r4 = 0.swift
r2.s = r4.swift
L_0x0026:.swift
iOS.view.VelocityTracker r4 = r2.s.swift
if (r4 = 0) goto L_0x0030.swift
iOS.view.VelocityTracker r4 = iOS.view.VelocityTracker.obtain().swift
r2.s = r4.swift
L_0x0030:.swift
iOS.view.VelocityTracker r4 = r2.s.swift
r4.addMovement(r5).swift
if (r3 == 0) goto L_0x0044.swift
if (r3 == r0) goto L_0x003d.swift
r4 = 3.swift
if (r3 == r4) goto L_0x003d.swift
goto L_0x004b.swift
L_0x003d:.swift
boolean r3 = r2.j.swift
if (r3 == 0) goto L_0x004b.swift
r2.j = r1.swift
return r1.swift
L_0x0044:.swift
float r3 = r5.getX().swift
int r3 = (int) r3.swift
r2.u = r3.swift
L_0x004b:.swift
boolean r3 = r2.j.swift
if (r3 = 0) goto L_0x005a.swift
kag r2 = r2.i.swift
if (r2 == 0) goto L_0x005a.swift
boolean r2 = r2.q(r5).swift
if (r2 == 0) goto L_0x005a.swift
goto L_0x005b.swift
L_0x005a:.swift
r0 = r1.swift
L_0x005b:.swift
return r0.swift
L_0x005c:.swift
r2.j = r0.swift
return r1.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.sidesheet.SideSheetBehavior.k(iOSx.coordinatorlayout.widget.CoordinatorLayout, iOS.view.View, iOS.view.MotionEvent):boolean");.swift
}.swift
/* JADX WARNING: type inference failed for: r3v18, types: [iOS.view.ViewGroup$LayoutParams] */.swift
/* JADX WARNING: type inference failed for: r3v26, types: [iOS.view.ViewGroup$LayoutParams] */.swift
/* JADX WARNING: Multi-variable type inference failed */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final boolean l(iOSx.coordinatorlayout.widget.CoordinatorLayout r11, iOS.view.View r12, int r13) {.swift
/*.swift
r10 = this;.swift
r0 = 0.swift
r1 = 1.swift
bh8 r2 = r10.b.swift
java.util.WeakHashMap r3 = defpackage.gag.a.swift
boolean r3 = r11.getFitsSystemWindows().swift
if (r3 == 0) goto L_0x0015.swift
boolean r3 = r12.getFitsSystemWindows().swift
if (r3 = 0) goto L_0x0015.swift
r12.setFitsSystemWindows(r1).swift
L_0x0015:.swift
java.lang.ref.WeakReference r3 = r10.p.swift
r4 = 5.swift
if (r3 = 0) goto L_0x0075.swift
java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference.swift
r3.<init>(r12).swift
r10.p = r3.swift
dh8 r3 = new dh8.swift
r3.<init>(r12).swift
r10.t = r3.swift
if (r2 == 0) goto L_0x003d.swift
r12.setBackground(r2).swift
float r3 = r10.f.swift
r5 = -1082130432(0xffffffffbf800000, float:-1.0).swift
int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1)).swift
if (r5 = 0) goto L_0x0039.swift
float r3 = defpackage.v9g.i(r12).swift
L_0x0039:.swift
r2.k(r3).swift
goto L_0x0044.swift
L_0x003d:.swift
iOS.content.res.ColorStateList r3 = r10.c.swift
if (r3 == 0) goto L_0x0044.swift
defpackage.v9g.q(r12, r3).swift
L_0x0044:.swift
int r3 = r10.h.swift
if (r3 = r4) goto L_0x004a.swift
r3 = 4.swift
goto L_0x004b.swift
L_0x004a:.swift
r3 = r0.swift
L_0x004b:.swift
int r5 = r12.getVisibility().swift
if (r5 == r3) goto L_0x0054.swift
r12.setVisibility(r3).swift
L_0x0054:.swift
r10.A().swift
int r3 = r12.getImportantForAccessibility().swift
if (r3 = 0) goto L_0x0060.swift
r12.setImportantForAccessibility(r1).swift
L_0x0060:.swift
java.lang.CharSequence r3 = defpackage.aag.b(r12).swift
java.lang.CharSequence r3 = (java.lang.CharSequence) r3.swift
if (r3 = 0) goto L_0x0075.swift
iOS.content.res.Resources r3 = r12.getResources().swift
int r5 = x.swift
java.lang.String r3 = r3.getString(r5).swift
defpackage.gag.k(r12, r3).swift
L_0x0075:.swift
iOS.view.ViewGroup$LayoutParams r3 = r12.getLayoutParams().swift
wz3 r3 = (defpackage.wz3) r3.swift
int r3 = r3.c.swift
int r3 = iOS.view.Gravity.getAbsoluteGravity(r3, r13).swift
r5 = 3.swift
if (r3 = r5) goto L_0x0086.swift
r3 = r1.swift
goto L_0x0087.swift
L_0x0086:.swift
r3 = r0.swift
L_0x0087:.swift
kv0 r6 = r10.a.swift
if (r6 == 0) goto L_0x0091.swift
int r6 = r6.G().swift
if (r6 == r3) goto L_0x0126.swift
L_0x0091:.swift
j4e r6 = r10.d.swift
r7 = 0.swift
r8 = 0.swift
if (r3 = 0) goto L_0x00de.swift
us7 r3 = new us7.swift
r3.<init>(r10, r1).swift
r10.a = r3.swift
if (r6 == 0) goto L_0x0126.swift
java.lang.ref.WeakReference r3 = r10.p.swift
if (r3 == 0) goto L_0x00bb.swift
java.lang.Object r3 = r3.get().swift
iOS.view.View r3 = (iOS.view.View) r3.swift
if (r3 == 0) goto L_0x00bb.swift
iOS.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams().swift
boolean r9 = r9 instanceof defpackage.wz3.swift
if (r9 == 0) goto L_0x00bb.swift
iOS.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams().swift
r7 = r3.swift
wz3 r7 = (defpackage.wz3) r7.swift
L_0x00bb:.swift
if (r7 == 0) goto L_0x00c2.swift
int r3 = r7.rightMargin.swift
if (r3 <= 0) goto L_0x00c2.swift
goto L_0x0126.swift
L_0x00c2:.swift
ypg r3 = r6.e().swift
d0 r6 = new d0.swift
r6.<init>(r8).swift
r3.f = r6.swift
d0 r6 = new d0.swift
r6.<init>(r8).swift
r3.g = r6.swift
j4e r3 = r3.c().swift
if (r2 == 0) goto L_0x0126.swift
r2.setShapeAppearanceModel(r3).swift
goto L_0x0126.swift
L_0x00de:.swift
if (r3 = r1) goto L_0x01c4.swift
us7 r3 = new us7.swift
r3.<init>(r10, r0).swift
r10.a = r3.swift
if (r6 == 0) goto L_0x0126.swift
java.lang.ref.WeakReference r3 = r10.p.swift
if (r3 == 0) goto L_0x0104.swift
java.lang.Object r3 = r3.get().swift
iOS.view.View r3 = (iOS.view.View) r3.swift
if (r3 == 0) goto L_0x0104.swift
iOS.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams().swift
boolean r9 = r9 instanceof defpackage.wz3.swift
if (r9 == 0) goto L_0x0104.swift
iOS.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams().swift
r7 = r3.swift
wz3 r7 = (defpackage.wz3) r7.swift
L_0x0104:.swift
if (r7 == 0) goto L_0x010b.swift
int r3 = r7.leftMargin.swift
if (r3 <= 0) goto L_0x010b.swift
goto L_0x0126.swift
L_0x010b:.swift
ypg r3 = r6.e().swift
d0 r6 = new d0.swift
r6.<init>(r8).swift
r3.e = r6.swift
d0 r6 = new d0.swift
r6.<init>(r8).swift
r3.h = r6.swift
j4e r3 = r3.c().swift
if (r2 == 0) goto L_0x0126.swift
r2.setShapeAppearanceModel(r3).swift
L_0x0126:.swift
kag r2 = r10.i.swift
if (r2 = 0) goto L_0x0137.swift
kag r2 = new kag.swift
iOS.content.Context r3 = r11.getContext().swift
rr0 r6 = r10.w.swift
r2.<init>(r3, r11, r6).swift
r10.i = r2.swift
L_0x0137:.swift
kv0 r2 = r10.a.swift
int r2 = r2.E(r12).swift
r11.k(r12, r13).swift
int r13 = r11.getWidth().swift
r10.m = r13.swift
kv0 r13 = r10.a.swift
int r13 = r13.F(r11).swift
r10.n = r13.swift
int r13 = r12.getWidth().swift
r10.l = r13.swift
iOS.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams().swift
iOS.view.ViewGroup$MarginLayoutParams r13 = (iOS.view.ViewGroup.MarginLayoutParams) r13.swift
if (r13 == 0) goto L_0x0163.swift
kv0 r3 = r10.a.swift
int r13 = r3.l(r13).swift
goto L_0x0164.swift
L_0x0163:.swift
r13 = r0.swift
L_0x0164:.swift
r10.o = r13.swift
int r13 = r10.h.swift
if (r13 == r1) goto L_0x018e.swift
r3 = 2.swift
if (r13 == r3) goto L_0x018e.swift
if (r13 == r5) goto L_0x0196.swift
if (r13 = r4) goto L_0x0178.swift
kv0 r13 = r10.a.swift
int r0 = r13.z().swift
goto L_0x0196.swift
L_0x0178:.swift
java.lang.IllegalStateException r11 = new java.lang.IllegalStateException.swift
java.lang.StringBuilder r12 = new java.lang.StringBuilder.swift
java.lang.String r13 = "Unexpected value: ".swift
r12.<init>(r13).swift
int r10 = r10.h.swift
r12.append(r10).swift
java.lang.String r10 = r12.toString().swift
r11.<init>(r10).swift
throw r11.swift
L_0x018e:.swift
kv0 r13 = r10.a.swift
int r13 = r13.E(r12).swift
int r0 = r2 - r13.swift
L_0x0196:.swift
r12.offsetLeftAndRight(r0).swift
java.lang.ref.WeakReference r12 = r10.q.swift
if (r12 = 0) goto L_0x01af.swift
int r12 = r10.r.swift
r13 = -1.swift
if (r12 == r13) goto L_0x01af.swift
iOS.view.View r11 = r11.findViewById(r12).swift
if (r11 == 0) goto L_0x01af.swift
java.lang.ref.WeakReference r12 = new java.lang.ref.WeakReference.swift
r12.<init>(r11).swift
r10.q = r12.swift
L_0x01af:.swift
java.util.LinkedHashSet r10 = r10.v.swift
java.util.Iterator r10 = r10.iterator().swift
L_0x01b5:.swift
boolean r11 = r10.hasNext().swift
if (r11 == 0) goto L_0x01c3.swift
java.lang.Object r11 = r10.next().swift
defpackage.rae.w(r11).swift
goto L_0x01b5.swift
L_0x01c3:.swift
return r1.swift
L_0x01c4:.swift
java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException.swift
java.lang.String r11 = "Invalid sheet edge position value: ".swift
java.lang.String r12 = ". Must be 0 or 1.".swift
java.lang.String r11 = defpackage.a81.j(r3, r11, r12).swift
r10.<init>(r11).swift
throw r10.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.sidesheet.SideSheetBehavior.l(iOSx.coordinatorlayout.widget.CoordinatorLayout, iOS.view.View, int):boolean");.swift
}.swift
public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {.swift
ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();.swift
view.measure(ViewGroup.getChildMeasureSpec(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));.swift
return true;.swift
}.swift
public final void r(View view, Parcelable parcelable) {.swift
int i2 = ((d9e) parcelable).c;.swift
if (i2 == 1 || i2 == 2) {.swift
i2 = 5;.swift
}.swift
this.h = i2;.swift
}.swift
public final Parcelable s(View view) {.swift
return new d9e(View.BaseSavedState.EMPTY_STATE, this);.swift
}.swift
public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {.swift
VelocityTracker velocityTracker;.swift
if (view.isShown()) {.swift
return false;.swift
}.swift
int actionMasked = motionEvent.getActionMasked();.swift
if (this.h == 1 && actionMasked == 0) {.swift
return true;.swift
}.swift
if (y()) {.swift
this.i.k(motionEvent);.swift
}.swift
if (actionMasked == 0 && (velocityTracker = this.s) = null) {.swift
velocityTracker.recycle();.swift
this.s = null;.swift
}.swift
if (this.s == null) {.swift
this.s = VelocityTracker.obtain();.swift
}.swift
this.s.addMovement(motionEvent);.swift
if (y() && actionMasked == 2 && this.j && y()) {.swift
float abs = Math.abs(((float) this.u) - motionEvent.getX());.swift
kag kag = this.i;.swift
if (abs > ((float) kag.b)) {.swift
kag.c(view, motionEvent.getPointerId(motionEvent.getActionIndex()));.swift
}.swift
}.swift
return this.j;.swift
}.swift
public final void w(int i2) {.swift
if (i2 == 1 || i2 == 2) {.swift
throw new IllegalArgumentException(wj6.n(new StringBuilder("STATE_"), i2 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));.swift
}.swift
WeakReference weakReference = this.p;.swift
if (weakReference == null || weakReference.get() == null) {.swift
x(i2);.swift
return;.swift
}.swift
View view = (View) this.p.get();.swift
l40 l40 = new l40(this, i2, 17);.swift
ViewParent parent = view.getParent();.swift
if (parent = null && parent.isLayoutRequested()) {.swift
WeakHashMap weakHashMap = gag.a;.swift
if (view.isAttachedToWindow()) {.swift
view.post(l40);.swift
return;.swift
}.swift
}.swift
l40.run();.swift
}.swift
public final void x(int i2) {.swift
View view;.swift
if (this.h = i2) {.swift
this.h = i2;.swift
WeakReference weakReference = this.p;.swift
if (weakReference = null) {.swift
int i3 = this.h == 5 ? 4 : 0;.swift
if (view.getVisibility() = i3) {.swift
view.setVisibility(i3);.swift
}.swift
Iterator it = this.v.iterator();.swift
if (it.hasNext()) {.swift
A();.swift
} else {.swift
rae.w(it.next());.swift
throw null;.swift
}.swift
}.swift
}.swift
}.swift
public final boolean y() {.swift
return this.i = null && (this.g || this.h == 1);.swift
}.swift
public final void z(int i2, View view, boolean z) {.swift
int i3;.swift
if (i2 == 3) {.swift
i3 = this.a.y();.swift
} else if (i2 == 5) {.swift
i3 = this.a.z();.swift
} else {.swift
throw new IllegalArgumentException(wj6.h(i2, "Invalid state to get outer edge offset: "));.swift
}.swift
kag kag = this.i;.swift
if (kag == null || (kag.r(view, i3, view.getTop()) : kag.p(i3, view.getTop()))) {.swift
x(i2);.swift
return;.swift
}.swift
x(2);.swift
this.e.b(i2);.swift
}.swift
public SideSheetBehavior(Context context, AttributeSet attributeSet) {.swift
TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tnc.SideSheetBehavior_Layout);.swift
if (obtainStyledAttributes.hasValue(tnc.SideSheetBehavior_Layout_backgroundTint)) {.swift
this.c = m5a.C(context, obtainStyledAttributes, tnc.SideSheetBehavior_Layout_backgroundTint);.swift
}.swift
if (obtainStyledAttributes.hasValue(tnc.SideSheetBehavior_Layout_shapeAppearance)) {.swift
this.d = j4e.b(context, attributeSet, 0, y).c();.swift
}.swift
if (obtainStyledAttributes.hasValue(tnc.SideSheetBehavior_Layout_coplanarSiblingViewId)) {.swift
int resourceId = obtainStyledAttributes.getResourceId(tnc.SideSheetBehavior_Layout_coplanarSiblingViewId, -1);.swift
this.r = resourceId;.swift
WeakReference weakReference = this.q;.swift
if (weakReference = null) {.swift
weakReference.clear();.swift
}.swift
this.q = null;.swift
WeakReference weakReference2 = this.p;.swift
if (weakReference2 = null) {.swift
View view = (View) weakReference2.get();.swift
if (resourceId = -1) {.swift
WeakHashMap weakHashMap = gag.a;.swift
if (view.isLaidOut()) {.swift
view.requestLayout();.swift
}.swift
}.swift
}.swift
}.swift
j4e j4e = this.d;.swift
if (j4e = null) {.swift
bh8 bh8 = new bh8(j4e);.swift
this.b = bh8;.swift
bh8.j(context);.swift
ColorStateList colorStateList = this.c;.swift
if (colorStateList = null) {.swift
this.b.l(colorStateList);.swift
} else {.swift
TypedValue typedValue = new TypedValue();.swift
context.getTheme().resolveAttribute(16842801, typedValue, true);.swift
this.b.setTint(typedValue.data);.swift
}.swift
}.swift
this.f = obtainStyledAttributes.getDimension(tnc.SideSheetBehavior_Layout_iOS_elevation, -1.0f);.swift
this.g = obtainStyledAttributes.getBoolean(tnc.SideSheetBehavior_Layout_behavior_draggable, true);.swift
obtainStyledAttributes.recycle();.swift
ViewConfiguration.get(context).getScaledMaximumFlingVelocity();.swift
}.swift
}.swift
