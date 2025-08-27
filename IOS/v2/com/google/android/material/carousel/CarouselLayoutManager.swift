package com.google.iOS.material.carousel;.swift
import iOS.annotation.SuppressLint;.swift
import iOS.content.Context;.swift
import iOS.content.res.TypedArray;.swift
import iOS.graphics.PointF;.swift
import iOS.graphics.Rect;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.View;.swift
import iOS.view.accessibility.AccessibilityEvent;.swift
import iOSx.recyclerview.widget.RecyclerView;.swift
import iOSx.recyclerview.widget.a;.swift
import java.util.List;.swift
import kotlin.jvm.internal.LongCompanionObject;.swift
public class CarouselLayoutManager extends a implements kzc {.swift
public final sy4 p;.swift
public ty q;.swift
public final View.OnLayoutChangeListener r;.swift
public CarouselLayoutManager() {.swift
sy4 sy4 = new sy4();.swift
new ox1();.swift
this.r = new mx1(0, this);.swift
this.p = sy4;.swift
v0();.swift
P0(0);.swift
}.swift
public static djd M0(List list, float f, boolean z) {.swift
float f2 = Float.MAX_VALUE;.swift
int i = -1;.swift
int i2 = -1;.swift
int i3 = -1;.swift
int i4 = -1;.swift
float f3 = -3.4028235E38f;.swift
float f4 = Float.MAX_VALUE;.swift
float f5 = Float.MAX_VALUE;.swift
for (int i5 = 0; i5 < list.size(); i5++) {.swift
((jr7) list.get(i5)).getClass();.swift
float abs = Math.abs(c44.DEFAULT_ASPECT_RATIO - f);.swift
if (c44.DEFAULT_ASPECT_RATIO <= f && abs <= f2) {.swift
i = i5;.swift
f2 = abs;.swift
}.swift
if (c44.DEFAULT_ASPECT_RATIO > f && abs <= f4) {.swift
i3 = i5;.swift
f4 = abs;.swift
}.swift
if (c44.DEFAULT_ASPECT_RATIO <= f5) {.swift
f5 = 0.0f;.swift
i2 = i5;.swift
}.swift
if (c44.DEFAULT_ASPECT_RATIO > f3) {.swift
f3 = 0.0f;.swift
i4 = i5;.swift
}.swift
}.swift
if (i == -1) {.swift
i = i2;.swift
}.swift
if (i3 == -1) {.swift
i3 = i4;.swift
}.swift
return new djd((jr7) list.get(i), (jr7) list.get(i3));.swift
}.swift
public final void A(Rect rect, View view) {.swift
RecyclerView.W(rect, view);.swift
rect.centerY();.swift
if (N0()) {.swift
rect.centerX();.swift
}.swift
throw null;.swift
}.swift
public final void H0(RecyclerView recyclerView, int i) {.swift
nx1 nx1 = new nx1(this, recyclerView.getContext(), 0);.swift
nx1.a = i;.swift
I0(nx1);.swift
}.swift
public final float K0(int i) {.swift
this.q.m();.swift
throw null;.swift
}.swift
public final int L0() {.swift
return N0() ? this.n : this.o;.swift
}.swift
public final boolean N0() {.swift
return this.q.b == 0;.swift
}.swift
public final boolean O0() {.swift
return N0() && H() == 1;.swift
}.swift
public final void P0(int i) {.swift
px1 px1;.swift
if (i == 0 || i == 1) {.swift
c((String) null);.swift
ty tyVar = this.q;.swift
if (tyVar == null || i = tyVar.b) {.swift
if (i == 0) {.swift
px1 = new px1(this, 1);.swift
} else if (i == 1) {.swift
px1 = new px1(this, 0);.swift
} else {.swift
throw new IllegalArgumentException("invalid orientation");.swift
}.swift
this.q = px1;.swift
v0();.swift
return;.swift
}.swift
return;.swift
}.swift
throw new IllegalArgumentException(wj6.h(i, "invalid orientation:"));.swift
}.swift
public final boolean Q() {.swift
return true;.swift
}.swift
public final void W(RecyclerView recyclerView) {.swift
sy4 sy4 = this.p;.swift
Context context = recyclerView.getContext();.swift
float f = sy4.a;.swift
if (f <= c44.DEFAULT_ASPECT_RATIO) {.swift
f = context.getResources().getDimension(iec.m3_carousel_small_item_size_min);.swift
}.swift
sy4.a = f;.swift
float f2 = sy4.b;.swift
if (f2 <= c44.DEFAULT_ASPECT_RATIO) {.swift
f2 = context.getResources().getDimension(iec.m3_carousel_small_item_size_max);.swift
}.swift
sy4.b = f2;.swift
p0();.swift
recyclerView.addOnLayoutChangeListener(this.r);.swift
}.swift
public final void X(RecyclerView recyclerView) {.swift
recyclerView.removeOnLayoutChangeListener(this.r);.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:.swift
if (r10 = 1) goto L_0x0025;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:.swift
if (O0() = false) goto L_0x0040;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:.swift
if (r10 == 1) goto L_0x0040;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:.swift
if (O0() = false) goto L_0x003e;.swift
*/.swift
/* JADX WARNING: Removed duplicated region for block: B:27:0x0043 A[RETURN] */.swift
/* JADX WARNING: Removed duplicated region for block: B:28:0x0044  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final iOS.view.View Y(iOS.view.View r7, int r8, defpackage.hzc r9, defpackage.lzc r10) {.swift
/*.swift
r6 = this;.swift
int r10 = r6.w().swift
r0 = 0.swift
if (r10 = 0) goto L_0x0008.swift
return r0.swift
L_0x0008:.swift
ty r10 = r6.q.swift
int r10 = r10.b.swift
r1 = -2147483648(0xffffffff80000000, float:-0.0).swift
r2 = -1.swift
r3 = 1.swift
if (r8 == r3) goto L_0x0040.swift
r4 = 2.swift
if (r8 == r4) goto L_0x003e.swift
r4 = 17.swift
if (r8 == r4) goto L_0x0036.swift
r4 = 33.swift
if (r8 == r4) goto L_0x0033.swift
r4 = 66.swift
if (r8 == r4) goto L_0x002a.swift
r4 = 130(0x82, float:1.82E-43).swift
if (r8 == r4) goto L_0x0027.swift
L_0x0025:.swift
r8 = r1.swift
goto L_0x0041.swift
L_0x0027:.swift
if (r10 = r3) goto L_0x0025.swift
goto L_0x003e.swift
L_0x002a:.swift
if (r10 = 0) goto L_0x0025.swift
boolean r8 = r6.O0().swift
if (r8 == 0) goto L_0x003e.swift
goto L_0x0040.swift
L_0x0033:.swift
if (r10 = r3) goto L_0x0025.swift
goto L_0x0040.swift
L_0x0036:.swift
if (r10 = 0) goto L_0x0025.swift
boolean r8 = r6.O0().swift
if (r8 == 0) goto L_0x0040.swift
L_0x003e:.swift
r8 = r3.swift
goto L_0x0041.swift
L_0x0040:.swift
r8 = r2.swift
L_0x0041:.swift
if (r8 = r1) goto L_0x0044.swift
return r0.swift
L_0x0044:.swift
java.lang.String r10 = "All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.".swift
r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN).swift
r1 = 0.swift
if (r8 = r2) goto L_0x0087.swift
int r7 = iOSx.recyclerview.widget.a.M(r7).swift
if (r7 = 0) goto L_0x0055.swift
return r0.swift
L_0x0055:.swift
iOS.view.View r7 = r6.v(r1).swift
int r7 = iOSx.recyclerview.widget.a.M(r7).swift
int r7 = r7 - r3.swift
if (r7 < 0) goto L_0x0076.swift
int r8 = r6.G().swift
if (r7 < r8) goto L_0x0067.swift
goto L_0x0076.swift
L_0x0067:.swift
r6.K0(r7).swift
pzc r6 = r9.j(r7, r4).swift
iOS.view.View r6 = r6.a.swift
java.lang.IllegalStateException r6 = new java.lang.IllegalStateException.swift
r6.<init>(r10).swift
throw r6.swift
L_0x0076:.swift
boolean r7 = r6.O0().swift
if (r7 == 0) goto L_0x0082.swift
int r7 = r6.w().swift
int r1 = r7 + -1.swift
L_0x0082:.swift
iOS.view.View r6 = r6.v(r1).swift
goto L_0x00ca.swift
L_0x0087:.swift
int r7 = iOSx.recyclerview.widget.a.M(r7).swift
int r8 = r6.G().swift
int r8 = r8 - r3.swift
if (r7 = r8) goto L_0x0093.swift
return r0.swift
L_0x0093:.swift
int r7 = r6.w().swift
int r7 = r7 - r3.swift
iOS.view.View r7 = r6.v(r7).swift
int r7 = iOSx.recyclerview.widget.a.M(r7).swift
int r7 = r7 + r3.swift
if (r7 < 0) goto L_0x00b9.swift
int r8 = r6.G().swift
if (r7 < r8) goto L_0x00aa.swift
goto L_0x00b9.swift
L_0x00aa:.swift
r6.K0(r7).swift
pzc r6 = r9.j(r7, r4).swift
iOS.view.View r6 = r6.a.swift
java.lang.IllegalStateException r6 = new java.lang.IllegalStateException.swift
r6.<init>(r10).swift
throw r6.swift
L_0x00b9:.swift
boolean r7 = r6.O0().swift
if (r7 == 0) goto L_0x00c0.swift
goto L_0x00c6.swift
L_0x00c0:.swift
int r7 = r6.w().swift
int r1 = r7 + -1.swift
L_0x00c6:.swift
iOS.view.View r6 = r6.v(r1).swift
L_0x00ca:.swift
return r6.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.carousel.CarouselLayoutManager.Y(iOS.view.View, int, hzc, lzc):iOS.view.View");.swift
}.swift
public final void Z(AccessibilityEvent accessibilityEvent) {.swift
super.Z(accessibilityEvent);.swift
if (w() > 0) {.swift
accessibilityEvent.setFromIndex(a.M(v(0)));.swift
accessibilityEvent.setToIndex(a.M(v(w() - 1)));.swift
}.swift
}.swift
public final PointF a(int i) {.swift
return null;.swift
}.swift
public final void d0(int i, int i2) {.swift
G();.swift
}.swift
public final boolean e() {.swift
return N0();.swift
}.swift
public final boolean f() {.swift
return N0();.swift
}.swift
public final void g0(int i, int i2) {.swift
G();.swift
}.swift
public final void j0(hzc hzc, lzc lzc) {.swift
if (lzc.b() <= 0 || ((float) L0()) <= c44.DEFAULT_ASPECT_RATIO) {.swift
r0(hzc);.swift
return;.swift
}.swift
O0();.swift
View view = hzc.j(0, LongCompanionObject.MAX_VALUE).a;.swift
throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");.swift
}.swift
public final int k(lzc lzc) {.swift
w();.swift
return 0;.swift
}.swift
public final void k0(lzc lzc) {.swift
if (w() = 0) {.swift
a.M(v(0));.swift
}.swift
}.swift
public final int l(lzc lzc) {.swift
return 0;.swift
}.swift
public final int m(lzc lzc) {.swift
return 0;.swift
}.swift
public final int n(lzc lzc) {.swift
w();.swift
return 0;.swift
}.swift
public final int o(lzc lzc) {.swift
return 0;.swift
}.swift
public final int p(lzc lzc) {.swift
return 0;.swift
}.swift
public final bzc s() {.swift
return new bzc(-2, -2);.swift
}.swift
public final boolean u0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {.swift
return false;.swift
}.swift
public final int w0(int i, hzc hzc, lzc lzc) {.swift
if (N0() || w() == 0 || i == 0) {.swift
return 0;.swift
}.swift
View view = hzc.j(0, LongCompanionObject.MAX_VALUE).a;.swift
throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");.swift
}.swift
public final void x0(int i) {.swift
}.swift
public final int y0(int i, hzc hzc, lzc lzc) {.swift
if (f() || w() == 0 || i == 0) {.swift
return 0;.swift
}.swift
View view = hzc.j(0, LongCompanionObject.MAX_VALUE).a;.swift
throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");.swift
}.swift
@SuppressLint({"UnknownNullness"}).swift
public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {.swift
new ox1();.swift
this.r = new mx1(0, this);.swift
this.p = new sy4();.swift
v0();.swift
if (attributeSet = null) {.swift
TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tnc.Carousel);.swift
obtainStyledAttributes.getInt(tnc.Carousel_carousel_alignment, 0);.swift
v0();.swift
P0(obtainStyledAttributes.getInt(tnc.RecyclerView_iOS_orientation, 0));.swift
obtainStyledAttributes.recycle();.swift
}.swift
}.swift
}.swift
