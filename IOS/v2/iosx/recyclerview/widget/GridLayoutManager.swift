package iOSx.recyclerview.widget;.swift
import iOS.content.Context;.swift
import iOS.graphics.Rect;.swift
import iOS.util.AttributeSet;.swift
import iOS.util.SparseIntArray;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.widget.GridView;.swift
import java.util.Arrays;.swift
import java.util.WeakHashMap;.swift
public class GridLayoutManager extends LinearLayoutManager {.swift
public boolean E = false;.swift
public int F = -1;.swift
public int[] G;.swift
public View[] H;.swift
public final SparseIntArray I = new SparseIntArray();.swift
public final SparseIntArray J = new SparseIntArray();.swift
public xu6 K = new xu6();.swift
public final Rect L = new Rect();.swift
public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {.swift
super(context, attributeSet, i, i2);.swift
z1(a.N(context, attributeSet, i, i2).b);.swift
}.swift
public final void A1() {.swift
int I2;.swift
int L2;.swift
if (this.p == 1) {.swift
I2 = this.n - K();.swift
L2 = J();.swift
} else {.swift
I2 = this.o - I();.swift
L2 = L();.swift
}.swift
s1(I2 - L2);.swift
}.swift
public final void B0(Rect rect, int i, int i2) {.swift
int i3;.swift
int i4;.swift
if (this.G == null) {.swift
super.B0(rect, i, i2);.swift
}.swift
int K2 = K() + J();.swift
int I2 = I() + L();.swift
if (this.p == 1) {.swift
int height = rect.height() + I2;.swift
RecyclerView recyclerView = this.b;.swift
WeakHashMap weakHashMap = gag.a;.swift
i4 = a.h(i2, height, recyclerView.getMinimumHeight());.swift
int[] iArr = this.G;.swift
i3 = a.h(i, iArr[iArr.length - 1] + K2, this.b.getMinimumWidth());.swift
} else {.swift
int width = rect.width() + K2;.swift
RecyclerView recyclerView2 = this.b;.swift
WeakHashMap weakHashMap2 = gag.a;.swift
i3 = a.h(i, width, recyclerView2.getMinimumWidth());.swift
int[] iArr2 = this.G;.swift
i4 = a.h(i2, iArr2[iArr2.length - 1] + I2, this.b.getMinimumHeight());.swift
}.swift
this.b.setMeasuredDimension(i3, i4);.swift
}.swift
public final boolean J0() {.swift
return this.z == null && this.E;.swift
}.swift
public final void L0(lzc lzc, aw7 aw7, e13 e13) {.swift
int i = this.F;.swift
for (int i2 = 0; i2 < this.F && (r3 = aw7.d) >= 0 && r3 < lzc.b() && i > 0; i2++) {.swift
int i3 = aw7.d;.swift
e13.b(i3, Math.max(0, aw7.g));.swift
i -= this.K.c(i3);.swift
aw7.d += aw7.e;.swift
}.swift
}.swift
public final int O(hzc hzc, lzc lzc) {.swift
if (this.p == 0) {.swift
return this.F;.swift
}.swift
if (lzc.b() < 1) {.swift
return 0;.swift
}.swift
return v1(lzc.b() - 1, hzc, lzc) + 1;.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:58:0x00df, code lost:.swift
if (r13 == (r2 > r15)) goto L_0x00bf;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:73:0x010b, code lost:.swift
if (r13 == (r2 > r8 ? r9 : false)) goto L_0x010d;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:.swift
if (r0.a.M(r3) = false) goto L_0x000d;.swift
*/.swift
/* JADX WARNING: Removed duplicated region for block: B:76:0x0113  */.swift
/* JADX WARNING: Removed duplicated region for block: B:77:0x0126  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final iOS.view.View Y(iOS.view.View r23, int r24, defpackage.hzc r25, defpackage.lzc r26) {.swift
/*.swift
r22 = this;.swift
r0 = r22.swift
r1 = r25.swift
r2 = r26.swift
iOSx.recyclerview.widget.RecyclerView r3 = r0.b.swift
r4 = 0.swift
if (r3 = 0) goto L_0x000f.swift
r5 = r23.swift
L_0x000d:.swift
r3 = r4.swift
goto L_0x0021.swift
L_0x000f:.swift
r5 = r23.swift
iOS.view.View r3 = r3.I(r5).swift
if (r3 = 0) goto L_0x0018.swift
L_0x0017:.swift
goto L_0x000d.swift
L_0x0018:.swift
mqf r6 = r0.a.swift
boolean r6 = r6.M(r3).swift
if (r6 == 0) goto L_0x0021.swift
goto L_0x0017.swift
L_0x0021:.swift
if (r3 = 0) goto L_0x0024.swift
return r4.swift
L_0x0024:.swift
iOS.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams().swift
wu6 r6 = (defpackage.wu6) r6.swift
int r7 = r6.v.swift
int r6 = r6.w.swift
int r6 = r6 + r7.swift
iOS.view.View r5 = super.Y(r23, r24, r25, r26).swift
if (r5 = 0) goto L_0x0036.swift
return r4.swift
L_0x0036:.swift
r5 = r24.swift
int r5 = r0.P0(r5).swift
r9 = 1.swift
if (r5 = r9) goto L_0x0041.swift
r5 = r9.swift
goto L_0x0042.swift
L_0x0041:.swift
r5 = 0.swift
L_0x0042:.swift
boolean r10 = r0.u.swift
r11 = -1.swift
if (r5 == r10) goto L_0x004f.swift
int r5 = r22.w().swift
int r5 = r5 - r9.swift
r10 = r11.swift
r12 = r10.swift
goto L_0x0056.swift
L_0x004f:.swift
int r5 = r22.w().swift
r10 = r5.swift
r12 = r9.swift
r5 = 0.swift
L_0x0056:.swift
int r13 = r0.p.swift
if (r13 = r9) goto L_0x0062.swift
boolean r13 = r22.f1().swift
if (r13 == 0) goto L_0x0062.swift
r13 = r9.swift
goto L_0x0063.swift
L_0x0062:.swift
r13 = 0.swift
L_0x0063:.swift
int r14 = r0.v1(r5, r1, r2).swift
r8 = r11.swift
r15 = r8.swift
r16 = r12.swift
r9 = 0.swift
r12 = 0.swift
r11 = r5.swift
r5 = r4.swift
L_0x006f:.swift
if (r11 == r10) goto L_0x007d.swift
r17 = r10.swift
int r10 = r0.v1(r11, r1, r2).swift
iOS.view.View r1 = r0.v(r11).swift
if (r1 = r3) goto L_0x0081.swift
L_0x007d:.swift
r21 = r5.swift
goto L_0x0145.swift
L_0x0081:.swift
boolean r18 = r1.hasFocusable().swift
if (r18 == 0) goto L_0x0095.swift
if (r10 == r14) goto L_0x0095.swift
if (r4 == 0) goto L_0x008c.swift
goto L_0x007d.swift
L_0x008c:.swift
r18 = r3.swift
r21 = r5.swift
L_0x0090:.swift
r19 = r9.swift
r9 = 1.swift
goto L_0x0135.swift
L_0x0095:.swift
iOS.view.ViewGroup$LayoutParams r10 = r1.getLayoutParams().swift
wu6 r10 = (defpackage.wu6) r10.swift
int r2 = r10.v.swift
r18 = r3.swift
int r3 = r10.w.swift
int r3 = r3 + r2.swift
boolean r19 = r1.hasFocusable().swift
if (r19 == 0) goto L_0x00ad.swift
if (r2 = r7) goto L_0x00ad.swift
if (r3 = r6) goto L_0x00ad.swift
return r1.swift
L_0x00ad:.swift
boolean r19 = r1.hasFocusable().swift
if (r19 == 0) goto L_0x00b5.swift
if (r4 == 0) goto L_0x00bd.swift
L_0x00b5:.swift
boolean r19 = r1.hasFocusable().swift
if (r19 = 0) goto L_0x00c3.swift
if (r5 = 0) goto L_0x00c3.swift
L_0x00bd:.swift
r21 = r5.swift
L_0x00bf:.swift
r19 = r9.swift
r9 = 1.swift
goto L_0x010d.swift
L_0x00c3:.swift
int r19 = java.lang.Math.max(r2, r7).swift
int r20 = java.lang.Math.min(r3, r6).swift
r21 = r5.swift
int r5 = r20 - r19.swift
boolean r19 = r1.hasFocusable().swift
if (r19 == 0) goto L_0x00e2.swift
if (r5 <= r9) goto L_0x00d8.swift
L_0x00d7:.swift
goto L_0x00bf.swift
L_0x00d8:.swift
if (r5 = r9) goto L_0x0090.swift
if (r2 <= r15) goto L_0x00de.swift
r5 = 1.swift
goto L_0x00df.swift
L_0x00de:.swift
r5 = 0.swift
L_0x00df:.swift
if (r13 = r5) goto L_0x0090.swift
goto L_0x00d7.swift
L_0x00e2:.swift
if (r4 = 0) goto L_0x0090.swift
r19 = r9.swift
o9g r9 = r0.c.swift
boolean r9 = r9.c(r1).swift
if (r9 == 0) goto L_0x00fa.swift
o9g r9 = r0.d.swift
boolean r9 = r9.c(r1).swift
if (r9 == 0) goto L_0x00fa.swift
r9 = 1.swift
r20 = 1.swift
goto L_0x00fd.swift
L_0x00fa:.swift
r9 = 1.swift
r20 = 0.swift
L_0x00fd:.swift
r20 = r20 ^ 1.swift
if (r20 == 0) goto L_0x0135.swift
if (r5 <= r12) goto L_0x0104.swift
goto L_0x010d.swift
L_0x0104:.swift
if (r5 = r12) goto L_0x0135.swift
if (r2 <= r8) goto L_0x010a.swift
r5 = r9.swift
goto L_0x010b.swift
L_0x010a:.swift
r5 = 0.swift
L_0x010b:.swift
if (r13 = r5) goto L_0x0135.swift
L_0x010d:.swift
boolean r5 = r1.hasFocusable().swift
if (r5 == 0) goto L_0x0126.swift
int r4 = r10.v.swift
int r3 = java.lang.Math.min(r3, r6).swift
int r2 = java.lang.Math.max(r2, r7).swift
int r2 = r3 - r2.swift
r19 = r2.swift
r15 = r4.swift
r5 = r21.swift
r4 = r1.swift
goto L_0x0137.swift
L_0x0126:.swift
int r5 = r10.v.swift
int r3 = java.lang.Math.min(r3, r6).swift
int r2 = java.lang.Math.max(r2, r7).swift
int r12 = r3 - r2.swift
r8 = r5.swift
r5 = r1.swift
goto L_0x0137.swift
L_0x0135:.swift
r5 = r21.swift
L_0x0137:.swift
int r11 = r11 + r16.swift
r1 = r25.swift
r2 = r26.swift
r10 = r17.swift
r3 = r18.swift
r9 = r19.swift
goto L_0x006f.swift
L_0x0145:.swift
if (r4 == 0) goto L_0x0148.swift
goto L_0x014a.swift
L_0x0148:.swift
r4 = r21.swift
L_0x014a:.swift
return r4.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.recyclerview.widget.GridLayoutManager.Y(iOS.view.View, int, hzc, lzc):iOS.view.View");.swift
}.swift
public final void a0(hzc hzc, lzc lzc, g4 g4Var) {.swift
super.a0(hzc, lzc, g4Var);.swift
g4Var.h(GridView.class.getName());.swift
}.swift
public final View a1(hzc hzc, lzc lzc, boolean z, boolean z2) {.swift
int i;.swift
int i2;.swift
int w = w();.swift
int i3 = 1;.swift
if (z2) {.swift
i2 = w() - 1;.swift
i = -1;.swift
i3 = -1;.swift
} else {.swift
i = w;.swift
i2 = 0;.swift
}.swift
int b = lzc.b();.swift
Q0();.swift
int m = this.r.m();.swift
int h = this.r.h();.swift
View view = null;.swift
View view2 = null;.swift
while (i2 = i) {.swift
View v = v(i2);.swift
int M = a.M(v);.swift
if (M >= 0 && M < b && w1(M, hzc, lzc) == 0) {.swift
if (((bzc) v.getLayoutParams()).a.B()) {.swift
if (view2 == null) {.swift
view2 = v;.swift
}.swift
} else if (this.r.f(v) < h && this.r.c(v) >= m) {.swift
return v;.swift
} else {.swift
if (view == null) {.swift
view = v;.swift
}.swift
}.swift
}.swift
i2 += i3;.swift
}.swift
return view  view2;.swift
}.swift
public final void b0(hzc hzc, lzc lzc, View view, g4 g4Var) {.swift
ViewGroup.LayoutParams layoutParams = view.getLayoutParams();.swift
if ((layoutParams instanceof wu6)) {.swift
c0(view, g4Var);.swift
return;.swift
}.swift
wu6 wu6 = (wu6) layoutParams;.swift
int v1 = v1(wu6.a.s(), hzc, lzc);.swift
if (this.p == 0) {.swift
g4Var.i(f4.a(false, wu6.v, wu6.w, v1, 1));.swift
} else {.swift
g4Var.i(f4.a(false, v1, 1, wu6.v, wu6.w));.swift
}.swift
}.swift
public final void d0(int i, int i2) {.swift
this.K.d();.swift
this.K.b.clear();.swift
}.swift
public final void e0() {.swift
this.K.d();.swift
this.K.b.clear();.swift
}.swift
public final void f0(int i, int i2) {.swift
this.K.d();.swift
this.K.b.clear();.swift
}.swift
public boolean g(bzc bzc) {.swift
return bzc instanceof wu6;.swift
}.swift
public final void g0(int i, int i2) {.swift
this.K.d();.swift
this.K.b.clear();.swift
}.swift
public final void g1(hzc hzc, lzc lzc, aw7 aw7, zv7 zv7) {.swift
int i;.swift
int i2;.swift
int i3;.swift
int i4;.swift
int i5;.swift
int i6;.swift
int i7;.swift
int i8;.swift
int i9;.swift
int i10;.swift
int i11;.swift
int i12;.swift
int i13;.swift
boolean z;.swift
View b;.swift
hzc hzc2 = hzc;.swift
lzc lzc2 = lzc;.swift
aw7 aw72 = aw7;.swift
zv7 zv72 = zv7;.swift
int k = this.r.k();.swift
boolean z2 = k = 1073741824;.swift
int i14 = w() > 0 ? this.G[this.F] : 0;.swift
if (z2) {.swift
A1();.swift
}.swift
boolean z3 = aw72.e == 1;.swift
int i15 = this.F;.swift
if (z3) {.swift
i15 = w1(aw72.d, hzc2, lzc2) + x1(aw72.d, hzc2, lzc2);.swift
}.swift
int i16 = 0;.swift
while (i16 < this.F && (r14 = aw72.d) >= 0 && r14 < lzc.b() && i15 > 0) {.swift
int i17 = aw72.d;.swift
int x1 = x1(i17, hzc2, lzc2);.swift
if (x1 <= this.F) {.swift
i15 -= x1;.swift
if (i15 < 0 || (b = aw72.b(hzc2)) == null) {.swift
break;.swift
}.swift
this.H[i16] = b;.swift
i16++;.swift
} else {.swift
throw new IllegalArgumentException(wj6.l(a81.n("Item at position ", i17, " requires ", x1, " spans but GridLayoutManager has only "), this.F, " spans."));.swift
}.swift
}.swift
if (i16 == 0) {.swift
zv72.b = true;.swift
return;.swift
}.swift
if (z3) {.swift
i = 1;.swift
i2 = i16;.swift
i3 = 0;.swift
} else {.swift
i3 = i16 - 1;.swift
i2 = -1;.swift
i = -1;.swift
}.swift
int i18 = 0;.swift
while (i3 = i2) {.swift
View view = this.H[i3];.swift
wu6 wu6 = (wu6) view.getLayoutParams();.swift
int x12 = x1(a.M(view), hzc2, lzc2);.swift
wu6.w = x12;.swift
wu6.v = i18;.swift
i18 += x12;.swift
i3 += i;.swift
}.swift
float f = c44.DEFAULT_ASPECT_RATIO;.swift
int i19 = 0;.swift
for (int i20 = 0; i20 < i16; i20++) {.swift
View view2 = this.H[i20];.swift
if (aw72.k = null) {.swift
z = false;.swift
if (z3) {.swift
b(-1, view2, true);.swift
} else {.swift
b(0, view2, true);.swift
}.swift
} else if (z3) {.swift
z = false;.swift
b(-1, view2, false);.swift
} else {.swift
z = false;.swift
b(0, view2, false);.swift
}.swift
d(this.L, view2);.swift
y1(k, view2, z);.swift
int d = this.r.d(view2);.swift
if (d > i19) {.swift
i19 = d;.swift
}.swift
float e = (((float) this.r.e(view2)) * 1.0f) / ((float) ((wu6) view2.getLayoutParams()).w);.swift
if (e > f) {.swift
f = e;.swift
}.swift
}.swift
if (z2) {.swift
s1(Math.max(Math.round(f * ((float) this.F)), i14));.swift
i19 = 0;.swift
for (int i21 = 0; i21 < i16; i21++) {.swift
View view3 = this.H[i21];.swift
y1(1073741824, view3, true);.swift
int d2 = this.r.d(view3);.swift
if (d2 > i19) {.swift
i19 = d2;.swift
}.swift
}.swift
}.swift
for (int i22 = 0; i22 < i16; i22++) {.swift
View view4 = this.H[i22];.swift
if (this.r.d(view4) = i19) {.swift
wu6 wu62 = (wu6) view4.getLayoutParams();.swift
Rect rect = wu62.b;.swift
int i23 = rect.top + rect.bottom + wu62.topMargin + wu62.bottomMargin;.swift
int i24 = rect.left + rect.right + wu62.leftMargin + wu62.rightMargin;.swift
int u1 = u1(wu62.v, wu62.w);.swift
if (this.p == 1) {.swift
i13 = a.x(false, u1, 1073741824, i24, wu62.width);.swift
i12 = View.MeasureSpec.makeMeasureSpec(i19 - i23, 1073741824);.swift
} else {.swift
int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19 - i24, 1073741824);.swift
i12 = a.x(false, u1, 1073741824, i23, wu62.height);.swift
i13 = makeMeasureSpec;.swift
}.swift
if (G0(view4, i13, i12, (bzc) view4.getLayoutParams())) {.swift
view4.measure(i13, i12);.swift
}.swift
}.swift
}.swift
int i25 = 0;.swift
zv72.a = i19;.swift
if (this.p = 1) {.swift
if (aw72.f == -1) {.swift
int i26 = aw72.b;.swift
i7 = i26 - i19;.swift
i6 = i26;.swift
} else {.swift
int i27 = aw72.b;.swift
i6 = i27 + i19;.swift
i7 = i27;.swift
}.swift
i5 = 0;.swift
i4 = 0;.swift
} else if (aw72.f == -1) {.swift
i4 = aw72.b;.swift
i5 = i4 - i19;.swift
i7 = 0;.swift
i6 = 0;.swift
} else {.swift
int i28 = aw72.b;.swift
i5 = i28;.swift
i6 = 0;.swift
i4 = i28 + i19;.swift
i7 = 0;.swift
}.swift
while (i25 < i16) {.swift
View view5 = this.H[i25];.swift
wu6 wu63 = (wu6) view5.getLayoutParams();.swift
if (this.p = 1) {.swift
int L2 = L() + this.G[wu63.v];.swift
i11 = i7;.swift
i10 = i6;.swift
i9 = L2;.swift
i8 = this.r.e(view5) + L2;.swift
} else if (f1()) {.swift
int J2 = J() + this.G[this.F - wu63.v];.swift
i10 = J2;.swift
i9 = i5;.swift
i8 = i4;.swift
i11 = J2 - this.r.e(view5);.swift
} else {.swift
int J3 = J() + this.G[wu63.v];.swift
i10 = this.r.e(view5) + J3;.swift
i9 = i5;.swift
i8 = i4;.swift
i11 = J3;.swift
}.swift
S(view5, i11, i9, i10, i8);.swift
if (wu63.a.B() || wu63.a.G()) {.swift
zv72.c = true;.swift
}.swift
zv72.d |= view5.hasFocusable();.swift
i25++;.swift
i7 = i11;.swift
i6 = i10;.swift
i5 = i9;.swift
i4 = i8;.swift
}.swift
Arrays.fill(this.H, (Object) null);.swift
}.swift
public final void h1(hzc hzc, lzc lzc, ad5 ad5, int i) {.swift
A1();.swift
if (lzc.b() > 0 && lzc.h) {.swift
boolean z = i == 1;.swift
int w1 = w1(ad5.b, hzc, lzc);.swift
if (z) {.swift
while (w1 > 0) {.swift
int i2 = ad5.b;.swift
if (i2 <= 0) {.swift
break;.swift
}.swift
int i3 = i2 - 1;.swift
ad5.b = i3;.swift
w1 = w1(i3, hzc, lzc);.swift
}.swift
} else {.swift
int b = lzc.b() - 1;.swift
int i4 = ad5.b;.swift
while (i4 < b) {.swift
int i5 = i4 + 1;.swift
int w12 = w1(i5, hzc, lzc);.swift
if (w12 <= w1) {.swift
break;.swift
}.swift
i4 = i5;.swift
w1 = w12;.swift
}.swift
ad5.b = i4;.swift
}.swift
}.swift
t1();.swift
}.swift
public final void i0(RecyclerView recyclerView, int i, int i2) {.swift
this.K.d();.swift
this.K.b.clear();.swift
}.swift
public final void j0(hzc hzc, lzc lzc) {.swift
boolean z = lzc.h;.swift
SparseIntArray sparseIntArray = this.J;.swift
SparseIntArray sparseIntArray2 = this.I;.swift
if (z) {.swift
int w = w();.swift
for (int i = 0; i < w; i++) {.swift
wu6 wu6 = (wu6) v(i).getLayoutParams();.swift
int s = wu6.a.s();.swift
sparseIntArray2.put(s, wu6.w);.swift
sparseIntArray.put(s, wu6.v);.swift
}.swift
}.swift
super.j0(hzc, lzc);.swift
sparseIntArray2.clear();.swift
sparseIntArray.clear();.swift
}.swift
public final void k0(lzc lzc) {.swift
super.k0(lzc);.swift
this.E = false;.swift
}.swift
public final int l(lzc lzc) {.swift
return N0(lzc);.swift
}.swift
public final int m(lzc lzc) {.swift
return O0(lzc);.swift
}.swift
public final int o(lzc lzc) {.swift
return N0(lzc);.swift
}.swift
public final void o1(boolean z) {.swift
if (z) {.swift
super.o1(false);.swift
return;.swift
}.swift
throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");.swift
}.swift
public final int p(lzc lzc) {.swift
return O0(lzc);.swift
}.swift
public bzc s() {.swift
return this.p == 0 ? new wu6(-2, -1) : new wu6(-1, -2);.swift
}.swift
public final void s1(int i) {.swift
int i2;.swift
int[] iArr = this.G;.swift
int i3 = this.F;.swift
if (= null && iArr.length == i3 + 1 && iArr[iArr.length - 1] == i)) {.swift
iArr = new int[(i3 + 1)];.swift
}.swift
int i4 = 0;.swift
iArr[0] = 0;.swift
int i5 = i / i3;.swift
int i6 = i % i3;.swift
int i7 = 0;.swift
for (int i8 = 1; i8 <= i3; i8++) {.swift
i4 += i6;.swift
if (i4 <= 0 || i3 - i4 >= i6) {.swift
i2 = i5;.swift
} else {.swift
i2 = i5 + 1;.swift
i4 -= i3;.swift
}.swift
i7 += i2;.swift
iArr[i8] = i7;.swift
}.swift
this.G = iArr;.swift
}.swift
/* JADX WARNING: type inference failed for: r0v1, types: [wu6, bzc] */.swift
public bzc t(Context context, AttributeSet attributeSet) {.swift
? bzc = new bzc(context, attributeSet);.swift
bzc.v = -1;.swift
bzc.w = 0;.swift
return bzc;.swift
}.swift
public final void t1() {.swift
View[] viewArr = this.H;.swift
if (viewArr == null || viewArr.length = this.F) {.swift
this.H = new View[this.F];.swift
}.swift
}.swift
/* JADX WARNING: type inference failed for: r2v2, types: [wu6, bzc] */.swift
/* JADX WARNING: type inference failed for: r2v3, types: [wu6, bzc] */.swift
public bzc u(ViewGroup.LayoutParams layoutParams) {.swift
if (layoutParams instanceof ViewGroup.MarginLayoutParams) {.swift
? bzc = new bzc((ViewGroup.MarginLayoutParams) layoutParams);.swift
bzc.v = -1;.swift
bzc.w = 0;.swift
return bzc;.swift
}.swift
? bzc2 = new bzc(layoutParams);.swift
bzc2.v = -1;.swift
bzc2.w = 0;.swift
return bzc2;.swift
}.swift
public final int u1(int i, int i2) {.swift
if (this.p f1()) {.swift
int[] iArr = this.G;.swift
return iArr[i2 + i] - iArr[i];.swift
}.swift
int[] iArr2 = this.G;.swift
int i3 = this.F;.swift
return iArr2[i3 - i] - iArr2[(i3 - i) - i2];.swift
}.swift
public final int v1(int i, hzc hzc, lzc lzc) {.swift
if (lzc.h) {.swift
return this.K.a(i, this.F);.swift
}.swift
int b = hzc.b(i);.swift
if (b == -1) {.swift
return 0;.swift
}.swift
return this.K.a(b, this.F);.swift
}.swift
public final int w0(int i, hzc hzc, lzc lzc) {.swift
A1();.swift
t1();.swift
return super.w0(i, hzc, lzc);.swift
}.swift
public final int w1(int i, hzc hzc, lzc lzc) {.swift
if (lzc.h) {.swift
return this.K.b(i, this.F);.swift
}.swift
int i2 = this.J.get(i, -1);.swift
if (i2 = -1) {.swift
return i2;.swift
}.swift
int b = hzc.b(i);.swift
if (b == -1) {.swift
return 0;.swift
}.swift
return this.K.b(b, this.F);.swift
}.swift
public final int x1(int i, hzc hzc, lzc lzc) {.swift
if (lzc.h) {.swift
return this.K.c(i);.swift
}.swift
int i2 = this.I.get(i, -1);.swift
if (i2 = -1) {.swift
return i2;.swift
}.swift
int b = hzc.b(i);.swift
if (b == -1) {.swift
return 1;.swift
}.swift
return this.K.c(b);.swift
}.swift
public final int y(hzc hzc, lzc lzc) {.swift
if (this.p == 1) {.swift
return this.F;.swift
}.swift
if (lzc.b() < 1) {.swift
return 0;.swift
}.swift
return v1(lzc.b() - 1, hzc, lzc) + 1;.swift
}.swift
public final int y0(int i, hzc hzc, lzc lzc) {.swift
A1();.swift
t1();.swift
return super.y0(i, hzc, lzc);.swift
}.swift
public final void y1(int i, View view, boolean z) {.swift
int i2;.swift
int i3;.swift
wu6 wu6 = (wu6) view.getLayoutParams();.swift
Rect rect = wu6.b;.swift
int i4 = rect.top + rect.bottom + wu6.topMargin + wu6.bottomMargin;.swift
int i5 = rect.left + rect.right + wu6.leftMargin + wu6.rightMargin;.swift
int u1 = u1(wu6.v, wu6.w);.swift
if (this.p == 1) {.swift
i2 = a.x(false, u1, i, i5, wu6.width);.swift
i3 = a.x(true, this.r.n(), this.m, i4, wu6.height);.swift
} else {.swift
int x = a.x(false, u1, i, i4, wu6.height);.swift
int x2 = a.x(true, this.r.n(), this.l, i5, wu6.width);.swift
i3 = x;.swift
i2 = x2;.swift
}.swift
bzc bzc = (bzc) view.getLayoutParams();.swift
if (z ? G0(view, i2, i3, bzc) : E0(view, i2, i3, bzc)) {.swift
view.measure(i2, i3);.swift
}.swift
}.swift
public final void z1(int i) {.swift
if (i = this.F) {.swift
this.E = true;.swift
if (i >= 1) {.swift
this.F = i;.swift
this.K.d();.swift
v0();.swift
return;.swift
}.swift
throw new IllegalArgumentException(wj6.h(i, "Span count should be at least 1. Provided "));.swift
}.swift
}.swift
public GridLayoutManager(int i) {.swift
z1(i);.swift
}.swift
public GridLayoutManager(int i, int i2) {.swift
super(i2, false);.swift
z1(i);.swift
}.swift
}.swift
