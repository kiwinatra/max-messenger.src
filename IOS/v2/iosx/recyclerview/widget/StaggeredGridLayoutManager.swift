package iOSx.recyclerview.widget;.swift
import iOS.content.Context;.swift
import iOS.graphics.PointF;.swift
import iOS.graphics.Rect;.swift
import iOS.os.Parcelable;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.view.accessibility.AccessibilityEvent;.swift
import java.util.ArrayList;.swift
import java.util.Arrays;.swift
import java.util.BitSet;.swift
import java.util.List;.swift
import java.util.WeakHashMap;.swift
import kotlin.jvm.internal.IntCompanionObject;.swift
import kotlin.jvm.internal.LongCompanionObject;.swift
public class StaggeredGridLayoutManager extends a implements kzc {.swift
public int A;.swift
public final npg B;.swift
public final int C;.swift
public boolean D;.swift
public boolean E;.swift
public uie F;.swift
public final Rect G;.swift
public final d0a H;.swift
public final boolean I;.swift
public int[] J;.swift
public final tj7 K;.swift
public int p;.swift
public vie[] q;.swift
public final vo7 r;.swift
public final vo7 s;.swift
public final int t;.swift
public int u;.swift
public final fs7 v;.swift
public boolean w;.swift
public boolean x;.swift
public BitSet y;.swift
public int z;.swift
public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {.swift
this.p = -1;.swift
this.w = false;.swift
this.x = false;.swift
this.z = -1;.swift
this.A = IntCompanionObject.MIN_VALUE;.swift
this.B = new npg(23, false);.swift
this.C = 2;.swift
this.G = new Rect();.swift
this.H = new d0a(this);.swift
this.I = true;.swift
this.K = new tj7(28, this);.swift
azc N = a.N(context, attributeSet, i, i2);.swift
int i3 = N.a;.swift
if (i3 == 0 || i3 == 1) {.swift
c((String) null);.swift
if (i3 = this.t) {.swift
this.t = i3;.swift
vo7 vo7 = this.r;.swift
this.r = this.s;.swift
this.s = vo7;.swift
v0();.swift
}.swift
l1(N.b);.swift
boolean z2 = N.c;.swift
c((String) null);.swift
uie uie = this.F;.swift
if ((uie == null || uie.y == z2)) {.swift
uie.y = z2;.swift
}.swift
this.w = z2;.swift
v0();.swift
this.v = new fs7();.swift
this.r = vo7.b(this, this.t);.swift
this.s = vo7.b(this, 1 - this.t);.swift
return;.swift
}.swift
throw new IllegalArgumentException("invalid orientation.");.swift
}.swift
public static int o1(int i, int i2, int i3) {.swift
if (i2 == 0 && i3 == 0) {.swift
return i;.swift
}.swift
int mode = View.MeasureSpec.getMode(i);.swift
return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;.swift
}.swift
public final void B0(Rect rect, int i, int i2) {.swift
int i3;.swift
int i4;.swift
int K2 = K() + J();.swift
int I2 = I() + L();.swift
if (this.t == 1) {.swift
int height = rect.height() + I2;.swift
RecyclerView recyclerView = this.b;.swift
WeakHashMap weakHashMap = gag.a;.swift
i4 = a.h(i2, height, recyclerView.getMinimumHeight());.swift
i3 = a.h(i, (this.u * this.p) + K2, this.b.getMinimumWidth());.swift
} else {.swift
int width = rect.width() + K2;.swift
RecyclerView recyclerView2 = this.b;.swift
WeakHashMap weakHashMap2 = gag.a;.swift
i3 = a.h(i, width, recyclerView2.getMinimumWidth());.swift
i4 = a.h(i2, (this.u * this.p) + I2, this.b.getMinimumHeight());.swift
}.swift
this.b.setMeasuredDimension(i3, i4);.swift
}.swift
public final void H0(RecyclerView recyclerView, int i) {.swift
ew7 ew7 = new ew7(recyclerView.getContext());.swift
ew7.a = i;.swift
I0(ew7);.swift
}.swift
public final boolean J0() {.swift
return this.F == null;.swift
}.swift
public final int K0(int i) {.swift
if (w() == 0) {.swift
return this.x ? 1 : -1;.swift
}.swift
return (i < U0())  1;.swift
}.swift
public final boolean L0() {.swift
int i;.swift
if (this.g)) {.swift
if (this.x) {.swift
i = V0();.swift
U0();.swift
} else {.swift
i = U0();.swift
V0();.swift
}.swift
npg npg = this.B;.swift
if (i == 0 && Z0() = null) {.swift
npg.w();.swift
this.f = true;.swift
v0();.swift
return true;.swift
}.swift
}.swift
return false;.swift
}.swift
public final int M0(lzc lzc) {.swift
if (w() == 0) {.swift
return 0;.swift
}.swift
vo7 vo7 = this.r;.swift
boolean z2 = this.I;.swift
return ld9.m(lzc, vo7, R0(z2), this, this.I);.swift
}.swift
public final int N0(lzc lzc) {.swift
if (w() == 0) {.swift
return 0;.swift
}.swift
vo7 vo7 = this.r;.swift
boolean z2 = this.I;.swift
return ld9.n(lzc, vo7, R0(z2), this, this.I, this.x);.swift
}.swift
public final int O0(lzc lzc) {.swift
if (w() == 0) {.swift
return 0;.swift
}.swift
vo7 vo7 = this.r;.swift
boolean z2 = this.I;.swift
return ld9.o(lzc, vo7, R0(z2), this, this.I);.swift
}.swift
public final int P0(hzc hzc, fs7 fs7, lzc lzc) {.swift
int i;.swift
vie vie;.swift
boolean z2;.swift
int i2;.swift
int i3;.swift
int i4;.swift
int m;.swift
int d;.swift
View view;.swift
int i5;.swift
int i6;.swift
int i7;.swift
int i8;.swift
int i9;.swift
hzc hzc2 = hzc;.swift
fs7 fs72 = fs7;.swift
int i10 = 0;.swift
int i11 = 1;.swift
this.y.set(0, this.p, true);.swift
fs7 fs73 = this.v;.swift
if (fs73.i) {.swift
i = fs72.e == 1 ? IntCompanionObject.MAX_VALUE : IntCompanionObject.MIN_VALUE;.swift
} else {.swift
i = fs72.e == 1 ? fs72.g + fs72.b : fs72.f - fs72.b;.swift
}.swift
int i12 = fs72.e;.swift
for (int i13 = 0; i13 < this.p; i13++) {.swift
if (this.q[i13].a.isEmpty()) {.swift
n1(this.q[i13], i12, i);.swift
}.swift
}.swift
int h = this.x ? this.r.h() : this.r.m();.swift
int i14 = 0;.swift
while (true) {.swift
int i15 = fs72.c;.swift
if (((i15 < 0 || i15 >= lzc.b()) ? i10 : i11) == 0 || (fs73.i && this.y.isEmpty())) {.swift
int i16 = i10;.swift
} else {.swift
View view2 = hzc2.j(fs72.c, LongCompanionObject.MAX_VALUE).a;.swift
fs72.c += fs72.d;.swift
sie sie = (sie) view2.getLayoutParams();.swift
int s2 = sie.a.s();.swift
npg npg = this.B;.swift
int[] iArr = (int[]) npg.b;.swift
int i17 = (iArr == null || s2 >= iArr.length) ? -1 : iArr[s2];.swift
if (i17 == -1) {.swift
if (d1(fs72.e)) {.swift
i9 = this.p - i11;.swift
i8 = -1;.swift
i7 = -1;.swift
} else {.swift
i8 = this.p;.swift
i9 = i10;.swift
i7 = i11;.swift
}.swift
vie vie2 = null;.swift
if (fs72.e == i11) {.swift
int m2 = this.r.m();.swift
int i18 = IntCompanionObject.MAX_VALUE;.swift
while (i9 = i8) {.swift
vie vie3 = this.q[i9];.swift
int f = vie3.f(m2);.swift
if (f < i18) {.swift
vie2 = vie3;.swift
i18 = f;.swift
}.swift
i9 += i7;.swift
}.swift
} else {.swift
int h2 = this.r.h();.swift
int i19 = IntCompanionObject.MIN_VALUE;.swift
while (i9 = i8) {.swift
vie vie4 = this.q[i9];.swift
int h3 = vie4.h(h2);.swift
if (h3 > i19) {.swift
vie2 = vie4;.swift
i19 = h3;.swift
}.swift
i9 += i7;.swift
}.swift
}.swift
vie = vie2;.swift
npg.A(s2);.swift
((int[]) npg.b)[s2] = vie.e;.swift
} else {.swift
vie = this.q[i17];.swift
}.swift
vie vie5 = vie;.swift
sie.v = vie5;.swift
if (fs72.e == 1) {.swift
z2 = false;.swift
b(-1, view2, false);.swift
} else {.swift
z2 = false;.swift
b(0, view2, false);.swift
}.swift
if (this.t == 1) {.swift
i2 = 1;.swift
b1(view2, a.x(z2, this.u, this.l, z2 ? 1 : 0, sie.width), a.x(true, this.o, this.m, I() + L(), sie.height));.swift
} else {.swift
i2 = 1;.swift
b1(view2, a.x(true, this.n, this.l, K() + J(), sie.width), a.x(false, this.u, this.m, 0, sie.height));.swift
}.swift
if (fs72.e == i2) {.swift
int f2 = vie5.f(h);.swift
i4 = f2;.swift
i3 = this.r.d(view2) + f2;.swift
} else {.swift
int h4 = vie5.h(h);.swift
i3 = h4;.swift
i4 = h4 - this.r.d(view2);.swift
}.swift
if (fs72.e == 1) {.swift
vie vie6 = sie.v;.swift
vie6.getClass();.swift
sie sie2 = (sie) view2.getLayoutParams();.swift
sie2.v = vie6;.swift
ArrayList arrayList = vie6.a;.swift
arrayList.add(view2);.swift
vie6.c = IntCompanionObject.MIN_VALUE;.swift
if (arrayList.size() == 1) {.swift
vie6.b = IntCompanionObject.MIN_VALUE;.swift
}.swift
if (sie2.a.B() || sie2.a.G()) {.swift
vie6.d = vie6.f.r.d(view2) + vie6.d;.swift
}.swift
} else {.swift
vie vie7 = sie.v;.swift
vie7.getClass();.swift
sie sie3 = (sie) view2.getLayoutParams();.swift
sie3.v = vie7;.swift
ArrayList arrayList2 = vie7.a;.swift
arrayList2.add(0, view2);.swift
vie7.b = IntCompanionObject.MIN_VALUE;.swift
if (arrayList2.size() == 1) {.swift
vie7.c = IntCompanionObject.MIN_VALUE;.swift
}.swift
if (sie3.a.B() || sie3.a.G()) {.swift
vie7.d = vie7.f.r.d(view2) + vie7.d;.swift
}.swift
}.swift
if (= 1) {.swift
m = this.s.m() + (vie5.e * this.u);.swift
d = this.s.d(view2) + m;.swift
} else {.swift
d = this.s.h() - (((this.p - 1) - vie5.e) * this.u);.swift
m = d - this.s.d(view2);.swift
}.swift
int i20 = d;.swift
int i21 = m;.swift
if (this.t == 1) {.swift
i5 = 1;.swift
view = view2;.swift
S(view2, i21, i4, i20, i3);.swift
} else {.swift
i5 = 1;.swift
view = view2;.swift
S(view, i4, i21, i3, i20);.swift
}.swift
n1(vie5, fs73.e, i);.swift
f1(hzc2, fs73);.swift
if (view.hasFocusable()) {.swift
i6 = 0;.swift
} else {.swift
i6 = 0;.swift
this.y.set(vie5.e, false);.swift
}.swift
i10 = i6;.swift
i14 = i5;.swift
i11 = i14;.swift
}.swift
}.swift
int i162 = i10;.swift
if (i14 == 0) {.swift
f1(hzc2, fs73);.swift
}.swift
int m3 = fs73.e == -1 ? this.r.m() - X0(this.r.m()) : W0(this.r.h()) - this.r.h();.swift
return m3 > 0 ? Math.min(fs72.b, m3) : i162;.swift
}.swift
public final boolean Q() {.swift
return this.C = 0;.swift
}.swift
public final View Q0(boolean z2) {.swift
int m = this.r.m();.swift
int h = this.r.h();.swift
View view = null;.swift
for (int w2 = w() - 1; w2 >= 0; w2--) {.swift
View v2 = v(w2);.swift
int f = this.r.f(v2);.swift
int c = this.r.c(v2);.swift
if (c > m && f < h) {.swift
if (c <= h || z2) {.swift
return v2;.swift
}.swift
if (view == null) {.swift
view = v2;.swift
}.swift
}.swift
}.swift
return view;.swift
}.swift
public final View R0(boolean z2) {.swift
int m = this.r.m();.swift
int h = this.r.h();.swift
int w2 = w();.swift
View view = null;.swift
for (int i = 0; i < w2; i++) {.swift
View v2 = v(i);.swift
int f = this.r.f(v2);.swift
if (this.r.c(v2) > m && f < h) {.swift
if (f >= m || z2) {.swift
return v2;.swift
}.swift
if (view == null) {.swift
view = v2;.swift
}.swift
}.swift
}.swift
return view;.swift
}.swift
public final void S0(hzc hzc, lzc lzc, boolean z2) {.swift
int h;.swift
int W0 = W0(IntCompanionObject.MIN_VALUE);.swift
if (W0 = Integer.MIN_VALUE && (h = this.r.h() - W0) > 0) {.swift
int i = h - (-j1(-h, hzc, lzc));.swift
if (z2 && i > 0) {.swift
this.r.r(i);.swift
}.swift
}.swift
}.swift
public final void T(int i) {.swift
super.T(i);.swift
for (int i2 = 0; i2 < this.p; i2++) {.swift
vie vie = this.q[i2];.swift
int i3 = vie.b;.swift
if (i3 = Integer.MIN_VALUE) {.swift
vie.b = i3 + i;.swift
}.swift
int i4 = vie.c;.swift
if (i4 = Integer.MIN_VALUE) {.swift
vie.c = i4 + i;.swift
}.swift
}.swift
}.swift
public final void T0(hzc hzc, lzc lzc, boolean z2) {.swift
int m;.swift
int X0 = X0(IntCompanionObject.MAX_VALUE);.swift
if (X0 = Integer.MAX_VALUE && (m = X0 - this.r.m()) > 0) {.swift
int j1 = m - j1(m, hzc, lzc);.swift
if (z2 && j1 > 0) {.swift
this.r.r(-j1);.swift
}.swift
}.swift
}.swift
public final void U(int i) {.swift
super.U(i);.swift
for (int i2 = 0; i2 < this.p; i2++) {.swift
vie vie = this.q[i2];.swift
int i3 = vie.b;.swift
if (i3 = Integer.MIN_VALUE) {.swift
vie.b = i3 + i;.swift
}.swift
int i4 = vie.c;.swift
if (i4 = Integer.MIN_VALUE) {.swift
vie.c = i4 + i;.swift
}.swift
}.swift
}.swift
public final int U0() {.swift
if (w() == 0) {.swift
return 0;.swift
}.swift
return a.M(v(0));.swift
}.swift
public final void V() {.swift
this.B.w();.swift
for (int i = 0; i < this.p; i++) {.swift
this.q[i].b();.swift
}.swift
}.swift
public final int V0() {.swift
int w2 = w();.swift
if (w2 == 0) {.swift
return 0;.swift
}.swift
return a.M(v(w2 - 1));.swift
}.swift
public final int W0(int i) {.swift
int f = this.q[0].f(i);.swift
for (int i2 = 1; i2 < this.p; i2++) {.swift
int f2 = this.q[i2].f(i);.swift
if (f2 > f) {.swift
f = f2;.swift
}.swift
}.swift
return f;.swift
}.swift
public final void X(RecyclerView recyclerView) {.swift
RecyclerView recyclerView2 = this.b;.swift
if (recyclerView2 = null) {.swift
recyclerView2.removeCallbacks(this.K);.swift
}.swift
for (int i = 0; i < this.p; i++) {.swift
this.q[i].b();.swift
}.swift
recyclerView.requestLayout();.swift
}.swift
public final int X0(int i) {.swift
int h = this.q[0].h(i);.swift
for (int i2 = 1; i2 < this.p; i2++) {.swift
int h2 = this.q[i2].h(i);.swift
if (h2 < h) {.swift
h = h2;.swift
}.swift
}.swift
return h;.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:30:0x004b, code lost:.swift
if (r8.t == 1) goto L_0x005f;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:32:0x0050, code lost:.swift
if (r8.t == 0) goto L_0x005f;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:37:0x005d, code lost:.swift
if (a1() == false) goto L_0x0057;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:42:0x006a, code lost:.swift
if (a1() == false) goto L_0x005f;.swift
*/.swift
/* JADX WARNING: Removed duplicated region for block: B:44:0x006f A[RETURN] */.swift
/* JADX WARNING: Removed duplicated region for block: B:45:0x0070  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final iOS.view.View Y(iOS.view.View r9, int r10, defpackage.hzc r11, defpackage.lzc r12) {.swift
/*.swift
r8 = this;.swift
int r0 = r8.w().swift
r1 = 0.swift
if (r0 = 0) goto L_0x0008.swift
return r1.swift
L_0x0008:.swift
iOSx.recyclerview.widget.RecyclerView r0 = r8.b.swift
if (r0 = 0) goto L_0x000e.swift
L_0x000c:.swift
r9 = r1.swift
goto L_0x001e.swift
L_0x000e:.swift
iOS.view.View r9 = r0.I(r9).swift
if (r9 = 0) goto L_0x0015.swift
goto L_0x000c.swift
L_0x0015:.swift
mqf r0 = r8.a.swift
boolean r0 = r0.M(r9).swift
if (r0 == 0) goto L_0x001e.swift
goto L_0x000c.swift
L_0x001e:.swift
if (r9 = 0) goto L_0x0021.swift
return r1.swift
L_0x0021:.swift
r8.i1().swift
r0 = 1.swift
r2 = -1.swift
r3 = -2147483648(0xffffffff80000000, float:-0.0).swift
if (r10 == r0) goto L_0x0061.swift
r4 = 2.swift
if (r10 == r4) goto L_0x0053.swift
r4 = 17.swift
if (r10 == r4) goto L_0x004e.swift
r4 = 33.swift
if (r10 == r4) goto L_0x0049.swift
r4 = 66.swift
if (r10 == r4) goto L_0x0044.swift
r4 = 130(0x82, float:1.82E-43).swift
if (r10 == r4) goto L_0x003f.swift
L_0x003d:.swift
r10 = r3.swift
goto L_0x006d.swift
L_0x003f:.swift
int r10 = r8.t.swift
if (r10 = r0) goto L_0x003d.swift
goto L_0x0057.swift
L_0x0044:.swift
int r10 = r8.t.swift
if (r10 = 0) goto L_0x003d.swift
goto L_0x0057.swift
L_0x0049:.swift
int r10 = r8.t.swift
if (r10 = r0) goto L_0x003d.swift
goto L_0x005f.swift
L_0x004e:.swift
int r10 = r8.t.swift
if (r10 = 0) goto L_0x003d.swift
goto L_0x005f.swift
L_0x0053:.swift
int r10 = r8.t.swift
if (r10 = r0) goto L_0x0059.swift
L_0x0057:.swift
r10 = r0.swift
goto L_0x006d.swift
L_0x0059:.swift
boolean r10 = r8.a1().swift
if (r10 == 0) goto L_0x0057.swift
L_0x005f:.swift
r10 = r2.swift
goto L_0x006d.swift
L_0x0061:.swift
int r10 = r8.t.swift
if (r10 = r0) goto L_0x0066.swift
goto L_0x005f.swift
L_0x0066:.swift
boolean r10 = r8.a1().swift
if (r10 == 0) goto L_0x005f.swift
goto L_0x0057.swift
L_0x006d:.swift
if (r10 = r3) goto L_0x0070.swift
return r1.swift
L_0x0070:.swift
iOS.view.ViewGroup$LayoutParams r3 = r9.getLayoutParams().swift
sie r3 = (defpackage.sie) r3.swift
r3.getClass().swift
vie r3 = r3.v.swift
if (r10 = r0) goto L_0x0082.swift
int r4 = r8.V0().swift
goto L_0x0086.swift
L_0x0082:.swift
int r4 = r8.U0().swift
L_0x0086:.swift
r8.m1(r4, r12).swift
r8.k1(r10).swift
fs7 r5 = r8.v.swift
int r6 = r5.d.swift
int r6 = r6 + r4.swift
r5.c = r6.swift
vo7 r6 = r8.r.swift
int r6 = r6.n().swift
float r6 = (float) r6.swift
r7 = 1051372203(0x3eaaaaab, float:0.33333334).swift
float r6 = r6 * r7.swift
int r6 = (int) r6.swift
r5.b = r6.swift
r5.h = r0.swift
r6 = 0.swift
r5.a = r6.swift
r8.P0(r11, r5, r12).swift
boolean r11 = r8.x.swift
r8.D = r11.swift
iOS.view.View r11 = r3.g(r4, r10).swift
if (r11 == 0) goto L_0x00b6.swift
if (r11 == r9) goto L_0x00b6.swift
return r11.swift
L_0x00b6:.swift
boolean r11 = r8.d1(r10).swift
if (r11 == 0) goto L_0x00d1.swift
int r11 = r8.p.swift
int r11 = r11 - r0.swift
L_0x00bf:.swift
if (r11 < 0) goto L_0x00e6.swift
vie[] r12 = r8.q.swift
r12 = r12[r11].swift
iOS.view.View r12 = r12.g(r4, r10).swift
if (r12 == 0) goto L_0x00ce.swift
if (r12 == r9) goto L_0x00ce.swift
return r12.swift
L_0x00ce:.swift
int r11 = r11 + -1.swift
goto L_0x00bf.swift
L_0x00d1:.swift
r11 = r6.swift
L_0x00d2:.swift
int r12 = r8.p.swift
if (r11 >= r12) goto L_0x00e6.swift
vie[] r12 = r8.q.swift
r12 = r12[r11].swift
iOS.view.View r12 = r12.g(r4, r10).swift
if (r12 == 0) goto L_0x00e3.swift
if (r12 == r9) goto L_0x00e3.swift
return r12.swift
L_0x00e3:.swift
int r11 = r11 + 1.swift
goto L_0x00d2.swift
L_0x00e6:.swift
boolean r11 = r8.w.swift
r11 = r11 ^ r0.swift
if (r10 = r2) goto L_0x00ed.swift
r12 = r0.swift
goto L_0x00ee.swift
L_0x00ed:.swift
r12 = r6.swift
L_0x00ee:.swift
if (r11 = r12) goto L_0x00f2.swift
r11 = r0.swift
goto L_0x00f3.swift
L_0x00f2:.swift
r11 = r6.swift
L_0x00f3:.swift
if (r11 == 0) goto L_0x00fa.swift
int r12 = r3.c().swift
goto L_0x00fe.swift
L_0x00fa:.swift
int r12 = r3.d().swift
L_0x00fe:.swift
iOS.view.View r12 = r8.r(r12).swift
if (r12 == 0) goto L_0x0107.swift
if (r12 == r9) goto L_0x0107.swift
return r12.swift
L_0x0107:.swift
boolean r10 = r8.d1(r10).swift
if (r10 == 0) goto L_0x0136.swift
int r10 = r8.p.swift
int r10 = r10 - r0.swift
L_0x0110:.swift
if (r10 < 0) goto L_0x0159.swift
int r12 = r3.e.swift
if (r10 = r12) goto L_0x0117.swift
goto L_0x0133.swift
L_0x0117:.swift
if (r11 == 0) goto L_0x0122.swift
vie[] r12 = r8.q.swift
r12 = r12[r10].swift
int r12 = r12.c().swift
goto L_0x012a.swift
L_0x0122:.swift
vie[] r12 = r8.q.swift
r12 = r12[r10].swift
int r12 = r12.d().swift
L_0x012a:.swift
iOS.view.View r12 = r8.r(r12).swift
if (r12 == 0) goto L_0x0133.swift
if (r12 == r9) goto L_0x0133.swift
return r12.swift
L_0x0133:.swift
int r10 = r10 + -1.swift
goto L_0x0110.swift
L_0x0136:.swift
int r10 = r8.p.swift
if (r6 >= r10) goto L_0x0159.swift
if (r11 == 0) goto L_0x0145.swift
vie[] r10 = r8.q.swift
r10 = r10[r6].swift
int r10 = r10.c().swift
goto L_0x014d.swift
L_0x0145:.swift
vie[] r10 = r8.q.swift
r10 = r10[r6].swift
int r10 = r10.d().swift
L_0x014d:.swift
iOS.view.View r10 = r8.r(r10).swift
if (r10 == 0) goto L_0x0156.swift
if (r10 == r9) goto L_0x0156.swift
return r10.swift
L_0x0156:.swift
int r6 = r6 + 1.swift
goto L_0x0136.swift
L_0x0159:.swift
return r1.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.recyclerview.widget.StaggeredGridLayoutManager.Y(iOS.view.View, int, hzc, lzc):iOS.view.View");.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */.swift
/* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */.swift
/* JADX WARNING: Removed duplicated region for block: B:20:0x003c A[RETURN] */.swift
/* JADX WARNING: Removed duplicated region for block: B:21:0x003d  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void Y0(int r8, int r9, int r10) {.swift
/*.swift
r7 = this;.swift
boolean r0 = r7.x.swift
if (r0 == 0) goto L_0x0009.swift
int r0 = r7.V0().swift
goto L_0x000d.swift
L_0x0009:.swift
int r0 = r7.U0().swift
L_0x000d:.swift
r1 = 8.swift
if (r10 = r1) goto L_0x001b.swift
if (r8 >= r9) goto L_0x0017.swift
int r2 = r9 + 1.swift
L_0x0015:.swift
r3 = r8.swift
goto L_0x001e.swift
L_0x0017:.swift
int r2 = r8 + 1.swift
r3 = r9.swift
goto L_0x001e.swift
L_0x001b:.swift
int r2 = r8 + r9.swift
goto L_0x0015.swift
L_0x001e:.swift
npg r4 = r7.B.swift
r4.K(r3).swift
r5 = 1.swift
if (r10 == r5) goto L_0x0037.swift
r6 = 2.swift
if (r10 == r6) goto L_0x0033.swift
if (r10 == r1) goto L_0x002c.swift
goto L_0x003a.swift
L_0x002c:.swift
r4.M(r8, r5).swift
r4.L(r9, r5).swift
goto L_0x003a.swift
L_0x0033:.swift
r4.M(r8, r9).swift
goto L_0x003a.swift
L_0x0037:.swift
r4.L(r8, r9).swift
L_0x003a:.swift
if (r2 > r0) goto L_0x003d.swift
return.swift
L_0x003d:.swift
boolean r8 = r7.x.swift
if (r8 == 0) goto L_0x0046.swift
int r8 = r7.U0().swift
goto L_0x004a.swift
L_0x0046:.swift
int r8 = r7.V0().swift
L_0x004a:.swift
if (r3 > r8) goto L_0x004f.swift
r7.v0().swift
L_0x004f:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.recyclerview.widget.StaggeredGridLayoutManager.Y0(int, int, int):void");.swift
}.swift
public final void Z(AccessibilityEvent accessibilityEvent) {.swift
super.Z(accessibilityEvent);.swift
if (w() > 0) {.swift
View R0 = R0(false);.swift
View Q0 = Q0(false);.swift
if (R0 = null) {.swift
int M = a.M(R0);.swift
int M2 = a.M(Q0);.swift
if (M < M2) {.swift
accessibilityEvent.setFromIndex(M);.swift
accessibilityEvent.setToIndex(M2);.swift
return;.swift
}.swift
accessibilityEvent.setFromIndex(M2);.swift
accessibilityEvent.setToIndex(M);.swift
}.swift
}.swift
}.swift
public final View Z0() {.swift
int w2 = w();.swift
int i = w2 - 1;.swift
BitSet bitSet = new BitSet(this.p);.swift
bitSet.set(0, this.p, true);.swift
int i2 = -1;.swift
char c = (this.t a1()) ? (char) 65535 : 1;.swift
if (this.x) {.swift
w2 = -1;.swift
} else {.swift
i = 0;.swift
}.swift
if (i < w2) {.swift
i2 = 1;.swift
}.swift
while (i = w2) {.swift
View v2 = v(i);.swift
sie sie = (sie) v2.getLayoutParams();.swift
if (bitSet.get(sie.v.e)) {.swift
vie vie = sie.v;.swift
if (this.x) {.swift
int i3 = vie.c;.swift
if (i3 == Integer.MIN_VALUE) {.swift
vie.a();.swift
i3 = vie.c;.swift
}.swift
if (i3 < this.r.h()) {.swift
((sie) ((View) a81.h(1, vie.a)).getLayoutParams()).getClass();.swift
}.swift
bitSet.clear(sie.v.e);.swift
} else {.swift
int i4 = vie.b;.swift
if (i4 == Integer.MIN_VALUE) {.swift
View view = (View) vie.a.get(0);.swift
vie.b = vie.f.r.f(view);.swift
((sie) view.getLayoutParams()).getClass();.swift
i4 = vie.b;.swift
}.swift
if (i4 > this.r.m()) {.swift
((sie) ((View) vie.a.get(0)).getLayoutParams()).getClass();.swift
}.swift
bitSet.clear(sie.v.e);.swift
}.swift
return v2;.swift
}.swift
i += i2;.swift
if (i = w2) {.swift
View v3 = v(i);.swift
if (this.x) {.swift
int c2 = this.r.c(v2);.swift
int c3 = this.r.c(v3);.swift
if (c2 < c3) {.swift
return v2;.swift
}.swift
if (c2 = c3) {.swift
continue;.swift
}.swift
} else {.swift
int f = this.r.f(v2);.swift
int f2 = this.r.f(v3);.swift
if (f > f2) {.swift
return v2;.swift
}.swift
if (f = f2) {.swift
continue;.swift
}.swift
}.swift
if ((sie.v.e - ((sie) v3.getLayoutParams()).v.e < 0) = (c < 0)) {.swift
return v2;.swift
}.swift
}.swift
}.swift
return null;.swift
}.swift
public final PointF a(int i) {.swift
int K0 = K0(i);.swift
PointF pointF = new PointF();.swift
if (K0 == 0) {.swift
return null;.swift
}.swift
if (this.t == 0) {.swift
pointF.x = (float) K0;.swift
pointF.y = c44.DEFAULT_ASPECT_RATIO;.swift
} else {.swift
pointF.x = c44.DEFAULT_ASPECT_RATIO;.swift
pointF.y = (float) K0;.swift
}.swift
return pointF;.swift
}.swift
public final boolean a1() {.swift
return H() == 1;.swift
}.swift
public final void b1(View view, int i, int i2) {.swift
Rect rect = this.G;.swift
d(rect, view);.swift
sie sie = (sie) view.getLayoutParams();.swift
int o1 = o1(i, sie.leftMargin + rect.left, sie.rightMargin + rect.right);.swift
int o12 = o1(i2, sie.topMargin + rect.top, sie.bottomMargin + rect.bottom);.swift
if (E0(view, o1, o12, sie)) {.swift
view.measure(o1, o12);.swift
}.swift
}.swift
public final void c(String str) {.swift
if (this.F == null) {.swift
super.c(str);.swift
}.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:231:0x040c, code lost:.swift
if (L0() = false) goto L_0x0410;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void c1(defpackage.hzc r17, defpackage.lzc r18, boolean r19) {.swift
/*.swift
r16 = this;.swift
r0 = r16.swift
r1 = r17.swift
r2 = r18.swift
uie r3 = r0.F.swift
r4 = -1.swift
d0a r5 = r0.H.swift
if (r3 = 0) goto L_0x0011.swift
int r3 = r0.z.swift
if (r3 == r4) goto L_0x001e.swift
L_0x0011:.swift
int r3 = r18.b().swift
if (r3 = 0) goto L_0x001e.swift
r16.r0(r17).swift
r5.c().swift
return.swift
L_0x001e:.swift
boolean r3 = r5.e.swift
r6 = 0.swift
r7 = 1.swift
if (r3 == 0) goto L_0x002f.swift
int r3 = r0.z.swift
if (r3 = r4) goto L_0x002f.swift
uie r3 = r0.F.swift
if (r3 == 0) goto L_0x002d.swift
goto L_0x002f.swift
L_0x002d:.swift
r3 = r6.swift
goto L_0x0030.swift
L_0x002f:.swift
r3 = r7.swift
L_0x0030:.swift
npg r8 = r0.B.swift
java.lang.Object r9 = r5.g.swift
iOSx.recyclerview.widget.StaggeredGridLayoutManager r9 = (iOSx.recyclerview.widget.StaggeredGridLayoutManager) r9.swift
r10 = -2147483648(0xffffffff80000000, float:-0.0).swift
if (r3 == 0) goto L_0x0210.swift
r5.c().swift
uie r11 = r0.F.swift
if (r11 == 0) goto L_0x00c5.swift
int r12 = r11.c.swift
r13 = 0.swift
if (r12 <= 0) goto L_0x008a.swift
int r14 = r0.p.swift
if (r12 = r14) goto L_0x007c.swift
r11 = r6.swift
L_0x004b:.swift
int r12 = r0.p.swift
if (r11 >= r12) goto L_0x008a.swift
vie[] r12 = r0.q.swift
r12 = r12[r11].swift
r12.b().swift
uie r12 = r0.F.swift
int[] r14 = r12.o.swift
r14 = r14[r11].swift
if (r14 == r10) goto L_0x0071.swift
boolean r12 = r12.z.swift
if (r12 == 0) goto L_0x006a.swift
vo7 r12 = r0.r.swift
int r12 = r12.h().swift
L_0x0068:.swift
int r14 = r14 + r12.swift
goto L_0x0071.swift
L_0x006a:.swift
vo7 r12 = r0.r.swift
int r12 = r12.m().swift
goto L_0x0068.swift
L_0x0071:.swift
vie[] r12 = r0.q.swift
r12 = r12[r11].swift
r12.b = r14.swift
r12.c = r14.swift
int r11 = r11 + 1.swift
goto L_0x004b.swift
L_0x007c:.swift
r11.o = r13.swift
r11.c = r6.swift
r11.v = r6.swift
r11.w = r13.swift
r11.x = r13.swift
int r12 = r11.b.swift
r11.a = r12.swift
L_0x008a:.swift
uie r11 = r0.F.swift
boolean r12 = r11.X.swift
r0.E = r12.swift
boolean r11 = r11.y.swift
r0.c(r13).swift
uie r12 = r0.F.swift
if (r12 == 0) goto L_0x009f.swift
boolean r13 = r12.y.swift
if (r13 == r11) goto L_0x009f.swift
r12.y = r11.swift
L_0x009f:.swift
r0.w = r11.swift
r16.v0().swift
r16.i1().swift
uie r11 = r0.F.swift
int r12 = r11.a.swift
if (r12 == r4) goto L_0x00b4.swift
r0.z = r12.swift
boolean r12 = r11.z.swift
r5.c = r12.swift
goto L_0x00b8.swift
L_0x00b4:.swift
boolean r12 = r0.x.swift
r5.c = r12.swift
L_0x00b8:.swift
int r12 = r11.v.swift
if (r12 <= r7) goto L_0x00cc.swift
int[] r12 = r11.w.swift
r8.b = r12.swift
java.util.List r11 = r11.x.swift
r8.c = r11.swift
goto L_0x00cc.swift
L_0x00c5:.swift
r16.i1().swift
boolean r11 = r0.x.swift
r5.c = r11.swift
L_0x00cc:.swift
boolean r11 = r2.h.swift
if (r11 = 0) goto L_0x01cd.swift
int r11 = r0.z.swift
if (r11 = r4) goto L_0x00d6.swift
goto L_0x01cd.swift
L_0x00d6:.swift
if (r11 < 0) goto L_0x01c9.swift
int r12 = r18.b().swift
if (r11 < r12) goto L_0x00e0.swift
goto L_0x01c9.swift
L_0x00e0:.swift
uie r11 = r0.F.swift
if (r11 == 0) goto L_0x00f5.swift
int r12 = r11.a.swift
if (r12 == r4) goto L_0x00f5.swift
int r11 = r11.c.swift
if (r11 >= r7) goto L_0x00ed.swift
goto L_0x00f5.swift
L_0x00ed:.swift
r5.b = r10.swift
int r11 = r0.z.swift
r5.a = r11.swift
goto L_0x020e.swift
L_0x00f5:.swift
int r11 = r0.z.swift
iOS.view.View r11 = r0.r(r11).swift
if (r11 == 0) goto L_0x018a.swift
boolean r12 = r0.x.swift
if (r12 == 0) goto L_0x0106.swift
int r12 = r16.V0().swift
goto L_0x010a.swift
L_0x0106:.swift
int r12 = r16.U0().swift
L_0x010a:.swift
r5.a = r12.swift
int r12 = r0.A.swift
if (r12 == r10) goto L_0x013c.swift
boolean r12 = r5.c.swift
if (r12 == 0) goto L_0x0128.swift
vo7 r12 = r0.r.swift
int r12 = r12.h().swift
int r13 = r0.A.swift
int r12 = r12 - r13.swift
vo7 r13 = r0.r.swift
int r11 = r13.c(r11).swift
int r12 = r12 - r11.swift
r5.b = r12.swift
goto L_0x020e.swift
L_0x0128:.swift
vo7 r12 = r0.r.swift
int r12 = r12.m().swift
int r13 = r0.A.swift
int r12 = r12 + r13.swift
vo7 r13 = r0.r.swift
int r11 = r13.f(r11).swift
int r12 = r12 - r11.swift
r5.b = r12.swift
goto L_0x020e.swift
L_0x013c:.swift
vo7 r12 = r0.r.swift
int r12 = r12.d(r11).swift
vo7 r13 = r0.r.swift
int r13 = r13.n().swift
if (r12 <= r13) goto L_0x015f.swift
boolean r11 = r5.c.swift
if (r11 == 0) goto L_0x0155.swift
vo7 r11 = r0.r.swift
int r11 = r11.h().swift
goto L_0x015b.swift
L_0x0155:.swift
vo7 r11 = r0.r.swift
int r11 = r11.m().swift
L_0x015b:.swift
r5.b = r11.swift
goto L_0x020e.swift
L_0x015f:.swift
vo7 r12 = r0.r.swift
int r12 = r12.f(r11).swift
vo7 r13 = r0.r.swift
int r13 = r13.m().swift
int r12 = r12 - r13.swift
if (r12 >= 0) goto L_0x0173.swift
int r11 = -r12.swift
r5.b = r11.swift
goto L_0x020e.swift
L_0x0173:.swift
vo7 r12 = r0.r.swift
int r12 = r12.h().swift
vo7 r13 = r0.r.swift
int r11 = r13.c(r11).swift
int r12 = r12 - r11.swift
if (r12 >= 0) goto L_0x0186.swift
r5.b = r12.swift
goto L_0x020e.swift
L_0x0186:.swift
r5.b = r10.swift
goto L_0x020e.swift
L_0x018a:.swift
int r11 = r0.z.swift
r5.a = r11.swift
int r12 = r0.A.swift
if (r12 = r10) goto L_0x01af.swift
int r11 = r0.K0(r11).swift
if (r11 = r7) goto L_0x019a.swift
r11 = r7.swift
goto L_0x019b.swift
L_0x019a:.swift
r11 = r6.swift
L_0x019b:.swift
r5.c = r11.swift
if (r11 == 0) goto L_0x01a6.swift
vo7 r11 = r9.r.swift
int r11 = r11.h().swift
goto L_0x01ac.swift
L_0x01a6:.swift
vo7 r11 = r9.r.swift
int r11 = r11.m().swift
L_0x01ac:.swift
r5.b = r11.swift
goto L_0x01c6.swift
L_0x01af:.swift
boolean r11 = r5.c.swift
if (r11 == 0) goto L_0x01bd.swift
vo7 r11 = r9.r.swift
int r11 = r11.h().swift
int r11 = r11 - r12.swift
r5.b = r11.swift
goto L_0x01c6.swift
L_0x01bd:.swift
vo7 r11 = r9.r.swift
int r11 = r11.m().swift
int r11 = r11 + r12.swift
r5.b = r11.swift
L_0x01c6:.swift
r5.d = r7.swift
goto L_0x020e.swift
L_0x01c9:.swift
r0.z = r4.swift
r0.A = r10.swift
L_0x01cd:.swift
boolean r11 = r0.D.swift
if (r11 == 0) goto L_0x01ee.swift
int r11 = r18.b().swift
int r12 = r16.w().swift
int r12 = r12 - r7.swift
L_0x01da:.swift
if (r12 < 0) goto L_0x01ec.swift
iOS.view.View r13 = r0.v(r12).swift
int r13 = iOSx.recyclerview.widget.a.M(r13).swift
if (r13 < 0) goto L_0x01e9.swift
if (r13 >= r11) goto L_0x01e9.swift
goto L_0x020a.swift
L_0x01e9:.swift
int r12 = r12 + -1.swift
goto L_0x01da.swift
L_0x01ec:.swift
r13 = r6.swift
goto L_0x020a.swift
L_0x01ee:.swift
int r11 = r18.b().swift
int r12 = r16.w().swift
r13 = r6.swift
L_0x01f7:.swift
if (r13 >= r12) goto L_0x01ec.swift
iOS.view.View r14 = r0.v(r13).swift
int r14 = iOSx.recyclerview.widget.a.M(r14).swift
if (r14 < 0) goto L_0x0207.swift
if (r14 >= r11) goto L_0x0207.swift
r13 = r14.swift
goto L_0x020a.swift
L_0x0207:.swift
int r13 = r13 + 1.swift
goto L_0x01f7.swift
L_0x020a:.swift
r5.a = r13.swift
r5.b = r10.swift
L_0x020e:.swift
r5.e = r7.swift
L_0x0210:.swift
uie r11 = r0.F.swift
if (r11 = 0) goto L_0x022b.swift
int r11 = r0.z.swift
if (r11 = r4) goto L_0x022b.swift
boolean r11 = r5.c.swift
boolean r12 = r0.D.swift
if (r11 = r12) goto L_0x0226.swift
boolean r11 = r16.a1().swift
boolean r12 = r0.E.swift
if (r11 == r12) goto L_0x022b.swift
L_0x0226:.swift
r8.w().swift
r5.d = r7.swift
L_0x022b:.swift
int r8 = r16.w().swift
if (r8 <= 0) goto L_0x02de.swift
uie r8 = r0.F.swift
if (r8 == 0) goto L_0x0239.swift
int r8 = r8.c.swift
if (r8 >= r7) goto L_0x02de.swift
L_0x0239:.swift
boolean r8 = r5.d.swift
if (r8 == 0) goto L_0x0258.swift
r3 = r6.swift
L_0x023e:.swift
int r8 = r0.p.swift
if (r3 >= r8) goto L_0x02de.swift
vie[] r8 = r0.q.swift
r8 = r8[r3].swift
r8.b().swift
int r8 = r5.b.swift
if (r8 == r10) goto L_0x0255.swift
vie[] r9 = r0.q.swift
r9 = r9[r3].swift
r9.b = r8.swift
r9.c = r8.swift
L_0x0255:.swift
int r3 = r3 + 1.swift
goto L_0x023e.swift
L_0x0258:.swift
if (r3 = 0) goto L_0x027a.swift
java.lang.Object r3 = r5.f.swift
int[] r3 = (int[]) r3.swift
if (r3 = 0) goto L_0x0261.swift
goto L_0x027a.swift
L_0x0261:.swift
r3 = r6.swift
L_0x0262:.swift
int r8 = r0.p.swift
if (r3 >= r8) goto L_0x02de.swift
vie[] r8 = r0.q.swift
r8 = r8[r3].swift
r8.b().swift
java.lang.Object r9 = r5.f.swift
int[] r9 = (int[]) r9.swift
r9 = r9[r3].swift
r8.b = r9.swift
r8.c = r9.swift
int r3 = r3 + 1.swift
goto L_0x0262.swift
L_0x027a:.swift
r3 = r6.swift
L_0x027b:.swift
int r8 = r0.p.swift
if (r3 >= r8) goto L_0x02b9.swift
vie[] r8 = r0.q.swift
r8 = r8[r3].swift
boolean r11 = r0.x.swift
int r12 = r5.b.swift
if (r11 == 0) goto L_0x028e.swift
int r13 = r8.f(r10).swift
goto L_0x0292.swift
L_0x028e:.swift
int r13 = r8.h(r10).swift
L_0x0292:.swift
r8.b().swift
if (r13 = r10) goto L_0x0298.swift
goto L_0x02b6.swift
L_0x0298:.swift
iOSx.recyclerview.widget.StaggeredGridLayoutManager r14 = r8.f.swift
if (r11 == 0) goto L_0x02a4.swift
vo7 r15 = r14.r.swift
int r15 = r15.h().swift
if (r13 < r15) goto L_0x02b6.swift
L_0x02a4:.swift
if (r11 = 0) goto L_0x02af.swift
vo7 r11 = r14.r.swift
int r11 = r11.m().swift
if (r13 <= r11) goto L_0x02af.swift
goto L_0x02b6.swift
L_0x02af:.swift
if (r12 == r10) goto L_0x02b2.swift
int r13 = r13 + r12.swift
L_0x02b2:.swift
r8.c = r13.swift
r8.b = r13.swift
L_0x02b6:.swift
int r3 = r3 + 1.swift
goto L_0x027b.swift
L_0x02b9:.swift
vie[] r3 = r0.q.swift
int r8 = r3.length.swift
java.lang.Object r11 = r5.f.swift
int[] r11 = (int[]) r11.swift
if (r11 == 0) goto L_0x02c5.swift
int r11 = r11.length.swift
if (r11 >= r8) goto L_0x02cc.swift
L_0x02c5:.swift
vie[] r9 = r9.q.swift
int r9 = r9.length.swift
int[] r9 = new int[r9].swift
r5.f = r9.swift
L_0x02cc:.swift
r9 = r6.swift
L_0x02cd:.swift
if (r9 >= r8) goto L_0x02de.swift
java.lang.Object r11 = r5.f.swift
int[] r11 = (int[]) r11.swift
r12 = r3[r9].swift
int r12 = r12.h(r10).swift
r11[r9] = r12.swift
int r9 = r9 + 1.swift
goto L_0x02cd.swift
L_0x02de:.swift
r16.q(r17).swift
fs7 r3 = r0.v.swift
r3.a = r6.swift
vo7 r8 = r0.s.swift
int r8 = r8.n().swift
int r9 = r0.p.swift
int r9 = r8 / r9.swift
r0.u = r9.swift
vo7 r9 = r0.s.swift
int r9 = r9.j().swift
iOS.view.View.MeasureSpec.makeMeasureSpec(r8, r9).swift
int r8 = r5.a.swift
r0.m1(r8, r2).swift
boolean r8 = r5.c.swift
if (r8 == 0) goto L_0x0317.swift
r0.k1(r4).swift
r0.P0(r1, r3, r2).swift
r0.k1(r7).swift
int r4 = r5.a.swift
int r8 = r3.d.swift
int r4 = r4 + r8.swift
r3.c = r4.swift
r0.P0(r1, r3, r2).swift
goto L_0x032a.swift
L_0x0317:.swift
r0.k1(r7).swift
r0.P0(r1, r3, r2).swift
r0.k1(r4).swift
int r4 = r5.a.swift
int r8 = r3.d.swift
int r4 = r4 + r8.swift
r3.c = r4.swift
r0.P0(r1, r3, r2).swift
L_0x032a:.swift
vo7 r3 = r0.s.swift
int r3 = r3.j().swift
r4 = 1073741824(0x40000000, float:2.0).swift
if (r3 = r4) goto L_0x0336.swift
goto L_0x03d2.swift
L_0x0336:.swift
int r3 = r16.w().swift
r4 = 0.swift
r8 = r6.swift
L_0x033c:.swift
if (r8 >= r3) goto L_0x035e.swift
iOS.view.View r9 = r0.v(r8).swift
vo7 r11 = r0.s.swift
int r11 = r11.d(r9).swift
float r11 = (float) r11.swift
int r12 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1)).swift
if (r12 >= 0) goto L_0x034e.swift
goto L_0x035b.swift
L_0x034e:.swift
iOS.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams().swift
sie r9 = (defpackage.sie) r9.swift
r9.getClass().swift
float r4 = java.lang.Math.max(r4, r11).swift
L_0x035b:.swift
int r8 = r8 + 1.swift
goto L_0x033c.swift
L_0x035e:.swift
int r8 = r0.u.swift
int r9 = r0.p.swift
float r9 = (float) r9.swift
float r4 = r4 * r9.swift
int r4 = java.lang.Math.round(r4).swift
vo7 r9 = r0.s.swift
int r9 = r9.j().swift
if (r9 = r10) goto L_0x037a.swift
vo7 r9 = r0.s.swift
int r9 = r9.n().swift
int r4 = java.lang.Math.min(r4, r9).swift
L_0x037a:.swift
int r9 = r0.p.swift
int r9 = r4 / r9.swift
r0.u = r9.swift
vo7 r9 = r0.s.swift
int r9 = r9.j().swift
iOS.view.View.MeasureSpec.makeMeasureSpec(r4, r9).swift
int r4 = r0.u.swift
if (r4 = r8) goto L_0x038e.swift
goto L_0x03d2.swift
L_0x038e:.swift
r4 = r6.swift
L_0x038f:.swift
if (r4 >= r3) goto L_0x03d2.swift
iOS.view.View r9 = r0.v(r4).swift
iOS.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams().swift
sie r10 = (defpackage.sie) r10.swift
r10.getClass().swift
boolean r11 = r16.a1().swift
if (r11 == 0) goto L_0x03ba.swift
int r11 = r0.t.swift
if (r11 = r7) goto L_0x03ba.swift
int r11 = r0.p.swift
int r11 = r11 - r7.swift
vie r10 = r10.v.swift
int r10 = r10.e.swift
int r11 = r11 - r10.swift
int r10 = -r11.swift
int r11 = r0.u.swift
int r11 = r11 * r10.swift
int r10 = r10 * r8.swift
int r11 = r11 - r10.swift
r9.offsetLeftAndRight(r11).swift
goto L_0x03cf.swift
L_0x03ba:.swift
vie r10 = r10.v.swift
int r10 = r10.e.swift
int r11 = r0.u.swift
int r11 = r11 * r10.swift
int r10 = r10 * r8.swift
int r12 = r0.t.swift
if (r12 = r7) goto L_0x03cb.swift
int r11 = r11 - r10.swift
r9.offsetLeftAndRight(r11).swift
goto L_0x03cf.swift
L_0x03cb:.swift
int r11 = r11 - r10.swift
r9.offsetTopAndBottom(r11).swift
L_0x03cf:.swift
int r4 = r4 + 1.swift
goto L_0x038f.swift
L_0x03d2:.swift
int r3 = r16.w().swift
if (r3 <= 0) goto L_0x03e9.swift
boolean r3 = r0.x.swift
if (r3 == 0) goto L_0x03e3.swift
r0.S0(r1, r2, r7).swift
r0.T0(r1, r2, r6).swift
goto L_0x03e9.swift
L_0x03e3:.swift
r0.T0(r1, r2, r7).swift
r0.S0(r1, r2, r6).swift
L_0x03e9:.swift
if (r19 == 0) goto L_0x040f.swift
boolean r3 = r2.h.swift
if (r3 = 0) goto L_0x040f.swift
int r3 = r0.C.swift
if (r3 == 0) goto L_0x040f.swift
int r3 = r16.w().swift
if (r3 <= 0) goto L_0x040f.swift
iOS.view.View r3 = r16.Z0().swift
if (r3 == 0) goto L_0x040f.swift
iOSx.recyclerview.widget.RecyclerView r3 = r0.b.swift
if (r3 == 0) goto L_0x0408.swift
tj7 r4 = r0.K.swift
r3.removeCallbacks(r4).swift
L_0x0408:.swift
boolean r3 = r16.L0().swift
if (r3 == 0) goto L_0x040f.swift
goto L_0x0410.swift
L_0x040f:.swift
r7 = r6.swift
L_0x0410:.swift
boolean r3 = r2.h.swift
if (r3 == 0) goto L_0x0417.swift
r5.c().swift
L_0x0417:.swift
boolean r3 = r5.c.swift
r0.D = r3.swift
boolean r3 = r16.a1().swift
r0.E = r3.swift
if (r7 == 0) goto L_0x0429.swift
r5.c().swift
r0.c1(r1, r2, r6).swift
L_0x0429:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.recyclerview.widget.StaggeredGridLayoutManager.c1(hzc, lzc, boolean):void");.swift
}.swift
public final void d0(int i, int i2) {.swift
Y0(i, i2, 1);.swift
}.swift
public final boolean d1(int i) {.swift
if (this.t == 0) {.swift
return (i == -1) = this.x;.swift
}.swift
return ((i == -1) == this.x) == a1();.swift
}.swift
public final boolean e() {.swift
return this.t == 0;.swift
}.swift
public final void e0() {.swift
this.B.w();.swift
v0();.swift
}.swift
public final void e1(int i, lzc lzc) {.swift
int i2;.swift
int i3;.swift
if (i > 0) {.swift
i3 = V0();.swift
i2 = 1;.swift
} else {.swift
i3 = U0();.swift
i2 = -1;.swift
}.swift
fs7 fs7 = this.v;.swift
fs7.a = true;.swift
m1(i3, lzc);.swift
k1(i2);.swift
fs7.c = i3 + fs7.d;.swift
fs7.b = Math.abs(i);.swift
}.swift
public final boolean f() {.swift
return this.t == 1;.swift
}.swift
public final void f0(int i, int i2) {.swift
Y0(i, i2, 8);.swift
}.swift
public final void f1(hzc hzc, fs7 fs7) {.swift
if (fs7.a && fs7.i) {.swift
if (fs7.b = 0) {.swift
int i = 1;.swift
if (fs7.e == -1) {.swift
int i2 = fs7.f;.swift
int h = this.q[0].h(i2);.swift
while (i < this.p) {.swift
int h2 = this.q[i].h(i2);.swift
if (h2 > h) {.swift
h = h2;.swift
}.swift
i++;.swift
}.swift
int i3 = i2 - h;.swift
g1(hzc, i3 < 0 ? fs7.g : fs7.g - Math.min(i3, fs7.b));.swift
return;.swift
}.swift
int i4 = fs7.g;.swift
int f = this.q[0].f(i4);.swift
while (i < this.p) {.swift
int f2 = this.q[i].f(i4);.swift
if (f2 < f) {.swift
f = f2;.swift
}.swift
i++;.swift
}.swift
int i5 = f - fs7.g;.swift
h1(hzc, i5 < 0 ? fs7.f : Math.min(i5, fs7.b) + fs7.f);.swift
} else if (fs7.e == -1) {.swift
g1(hzc, fs7.g);.swift
} else {.swift
h1(hzc, fs7.f);.swift
}.swift
}.swift
}.swift
public final boolean g(bzc bzc) {.swift
return bzc instanceof sie;.swift
}.swift
public final void g0(int i, int i2) {.swift
Y0(i, i2, 2);.swift
}.swift
public final void g1(hzc hzc, int i) {.swift
int w2 = w() - 1;.swift
while (w2 >= 0) {.swift
View v2 = v(w2);.swift
if (this.r.f(v2) >= i && this.r.q(v2) >= i) {.swift
sie sie = (sie) v2.getLayoutParams();.swift
sie.getClass();.swift
if (sie.v.a.size() = 1) {.swift
vie vie = sie.v;.swift
ArrayList arrayList = vie.a;.swift
int size = arrayList.size();.swift
View view = (View) arrayList.remove(size - 1);.swift
sie sie2 = (sie) view.getLayoutParams();.swift
sie2.v = null;.swift
if (sie2.a.B() || sie2.a.G()) {.swift
vie.d -= vie.f.r.d(view);.swift
}.swift
if (size == 1) {.swift
vie.b = IntCompanionObject.MIN_VALUE;.swift
}.swift
vie.c = IntCompanionObject.MIN_VALUE;.swift
t0(v2, hzc);.swift
w2--;.swift
} else {.swift
return;.swift
}.swift
} else {.swift
return;.swift
}.swift
}.swift
}.swift
public final void h1(hzc hzc, int i) {.swift
while (w() > 0) {.swift
View v2 = v(0);.swift
if (this.r.c(v2) <= i && this.r.p(v2) <= i) {.swift
sie sie = (sie) v2.getLayoutParams();.swift
sie.getClass();.swift
if (sie.v.a.size() = 1) {.swift
vie vie = sie.v;.swift
ArrayList arrayList = vie.a;.swift
View view = (View) arrayList.remove(0);.swift
sie sie2 = (sie) view.getLayoutParams();.swift
sie2.v = null;.swift
if (arrayList.size() == 0) {.swift
vie.c = IntCompanionObject.MIN_VALUE;.swift
}.swift
if (sie2.a.B() || sie2.a.G()) {.swift
vie.d -= vie.f.r.d(view);.swift
}.swift
vie.b = IntCompanionObject.MIN_VALUE;.swift
t0(v2, hzc);.swift
} else {.swift
return;.swift
}.swift
} else {.swift
return;.swift
}.swift
}.swift
}.swift
public final void i(int i, int i2, lzc lzc, e13 e13) {.swift
fs7 fs7;.swift
int f;.swift
int i3;.swift
if (this.t = 0) {.swift
i = i2;.swift
}.swift
if (w() = 0) {.swift
e1(i, lzc);.swift
int[] iArr = this.J;.swift
if (iArr == null || iArr.length < this.p) {.swift
this.J = new int[this.p];.swift
}.swift
int i4 = 0;.swift
int i5 = 0;.swift
int i6 = 0;.swift
while (true) {.swift
int i7 = this.p;.swift
fs7 = this.v;.swift
if (i5 >= i7) {.swift
break;.swift
}.swift
if (fs7.d == -1) {.swift
f = fs7.f;.swift
i3 = this.q[i5].h(f);.swift
} else {.swift
f = this.q[i5].f(fs7.g);.swift
i3 = fs7.g;.swift
}.swift
int i8 = f - i3;.swift
if (i8 >= 0) {.swift
this.J[i6] = i8;.swift
i6++;.swift
}.swift
i5++;.swift
}.swift
Arrays.sort(this.J, 0, i6);.swift
while (i4 < i6) {.swift
int i9 = fs7.c;.swift
if (i9 >= 0 && i9 < lzc.b()) {.swift
e13.b(fs7.c, this.J[i4]);.swift
fs7.c += fs7.d;.swift
i4++;.swift
} else {.swift
return;.swift
}.swift
}.swift
}.swift
}.swift
public final void i0(RecyclerView recyclerView, int i, int i2) {.swift
Y0(i, i2, 4);.swift
}.swift
public final void i1() {.swift
if (this.t == 1 || a1()) {.swift
this.x = this.w;.swift
} else {.swift
this.x = this.w;.swift
}.swift
}.swift
public final void j0(hzc hzc, lzc lzc) {.swift
c1(hzc, lzc, true);.swift
}.swift
public final int j1(int i, hzc hzc, lzc lzc) {.swift
if (w() == 0 || i == 0) {.swift
return 0;.swift
}.swift
e1(i, lzc);.swift
fs7 fs7 = this.v;.swift
int P0 = P0(hzc, fs7, lzc);.swift
if (fs7.b >= P0) {.swift
i = i < 0 ? -P0 : P0;.swift
}.swift
this.r.r(-i);.swift
this.D = this.x;.swift
fs7.b = 0;.swift
f1(hzc, fs7);.swift
return i;.swift
}.swift
public final int k(lzc lzc) {.swift
return M0(lzc);.swift
}.swift
public final void k0(lzc lzc) {.swift
this.z = -1;.swift
this.A = IntCompanionObject.MIN_VALUE;.swift
this.F = null;.swift
this.H.c();.swift
}.swift
public final void k1(int i) {.swift
fs7 fs7 = this.v;.swift
fs7.e = i;.swift
int i2 = 1;.swift
if (this.x = (i == -1)) {.swift
i2 = -1;.swift
}.swift
fs7.d = i2;.swift
}.swift
public final int l(lzc lzc) {.swift
return N0(lzc);.swift
}.swift
public final void l0(Parcelable parcelable) {.swift
if (parcelable instanceof uie) {.swift
uie uie = (uie) parcelable;.swift
this.F = uie;.swift
if (this.z = -1) {.swift
uie.o = null;.swift
uie.c = 0;.swift
uie.a = -1;.swift
uie.b = -1;.swift
uie.o = null;.swift
uie.c = 0;.swift
uie.v = 0;.swift
uie.w = null;.swift
uie.x = null;.swift
}.swift
v0();.swift
}.swift
}.swift
public final void l1(int i) {.swift
c((String) null);.swift
if (i = this.p) {.swift
this.B.w();.swift
v0();.swift
this.p = i;.swift
this.y = new BitSet(this.p);.swift
this.q = new vie[this.p];.swift
for (int i2 = 0; i2 < this.p; i2++) {.swift
this.q[i2] = new vie(this, i2);.swift
}.swift
v0();.swift
}.swift
}.swift
public final int m(lzc lzc) {.swift
return O0(lzc);.swift
}.swift
/* JADX WARNING: type inference failed for: r0v1, types: [uie, iOS.os.Parcelable, java.lang.Object] */.swift
/* JADX WARNING: type inference failed for: r5v1, types: [uie, iOS.os.Parcelable, java.lang.Object] */.swift
public final Parcelable m0() {.swift
int i;.swift
int m;.swift
int[] iArr;.swift
uie uie = this.F;.swift
if (uie = null) {.swift
? obj = new Object();.swift
obj.c = uie.c;.swift
obj.a = uie.a;.swift
obj.b = uie.b;.swift
obj.o = uie.o;.swift
obj.v = uie.v;.swift
obj.w = uie.w;.swift
obj.y = uie.y;.swift
obj.z = uie.z;.swift
obj.X = uie.X;.swift
obj.x = uie.x;.swift
return obj;.swift
}.swift
? obj2 = new Object();.swift
obj2.y = this.w;.swift
obj2.z = this.D;.swift
obj2.X = this.E;.swift
npg npg = this.B;.swift
if (npg == null || (iArr = (int[]) npg.b) == null) {.swift
obj2.v = 0;.swift
} else {.swift
obj2.w = iArr;.swift
obj2.v = iArr.length;.swift
obj2.x = (List) npg.c;.swift
}.swift
int i2 = -1;.swift
if (w() > 0) {.swift
obj2.a = this.D ? V0() : U0();.swift
View Q0 = this.x ? Q0(true) : R0(true);.swift
if (Q0 = null) {.swift
i2 = a.M(Q0);.swift
}.swift
obj2.b = i2;.swift
int i3 = this.p;.swift
obj2.c = i3;.swift
obj2.o = new int[i3];.swift
for (int i4 = 0; i4 < this.p; i4++) {.swift
if (this.D) {.swift
i = this.q[i4].f(IntCompanionObject.MIN_VALUE);.swift
if (i = Integer.MIN_VALUE) {.swift
m = this.r.h();.swift
} else {.swift
obj2.o[i4] = i;.swift
}.swift
} else {.swift
i = this.q[i4].h(IntCompanionObject.MIN_VALUE);.swift
if (i = Integer.MIN_VALUE) {.swift
m = this.r.m();.swift
} else {.swift
obj2.o[i4] = i;.swift
}.swift
}.swift
i -= m;.swift
obj2.o[i4] = i;.swift
}.swift
} else {.swift
obj2.a = -1;.swift
obj2.b = -1;.swift
obj2.c = 0;.swift
}.swift
return obj2;.swift
}.swift
public final void m1(int i, lzc lzc) {.swift
int i2;.swift
int i3;.swift
int i4;.swift
fs7 fs7 = this.v;.swift
boolean z2 = false;.swift
fs7.b = 0;.swift
fs7.c = i;.swift
ew7 ew7 = this.e;.swift
if (= null && ew7.e) || (i4 = lzc.a) == -1) {.swift
i3 = 0;.swift
i2 = 0;.swift
} else {.swift
if (this.x == (i4 < i)) {.swift
i3 = this.r.n();.swift
i2 = 0;.swift
} else {.swift
i2 = this.r.n();.swift
i3 = 0;.swift
}.swift
}.swift
RecyclerView recyclerView = this.b;.swift
if (recyclerView == null || recyclerView.y) {.swift
fs7.g = this.r.g() + i3;.swift
fs7.f = -i2;.swift
} else {.swift
fs7.f = this.r.m() - i2;.swift
fs7.g = this.r.h() + i3;.swift
}.swift
fs7.h = false;.swift
fs7.a = true;.swift
if (this.r.j() == 0 && this.r.g() == 0) {.swift
z2 = true;.swift
}.swift
fs7.i = z2;.swift
}.swift
public final int n(lzc lzc) {.swift
return M0(lzc);.swift
}.swift
public final void n0(int i) {.swift
if (i == 0) {.swift
L0();.swift
}.swift
}.swift
public final void n1(vie vie, int i, int i2) {.swift
int i3 = vie.d;.swift
int i4 = vie.e;.swift
if (i == -1) {.swift
int i5 = vie.b;.swift
if (i5 == Integer.MIN_VALUE) {.swift
View view = (View) vie.a.get(0);.swift
vie.b = vie.f.r.f(view);.swift
((sie) view.getLayoutParams()).getClass();.swift
i5 = vie.b;.swift
}.swift
if (i5 + i3 <= i2) {.swift
this.y.set(i4, false);.swift
return;.swift
}.swift
return;.swift
}.swift
int i6 = vie.c;.swift
if (i6 == Integer.MIN_VALUE) {.swift
vie.a();.swift
i6 = vie.c;.swift
}.swift
if (i6 - i3 >= i2) {.swift
this.y.set(i4, false);.swift
}.swift
}.swift
public final int o(lzc lzc) {.swift
return N0(lzc);.swift
}.swift
public final int p(lzc lzc) {.swift
return O0(lzc);.swift
}.swift
public final bzc s() {.swift
return this.t == 0 ? new bzc(-2, -1) : new bzc(-1, -2);.swift
}.swift
public final bzc t(Context context, AttributeSet attributeSet) {.swift
return new bzc(context, attributeSet);.swift
}.swift
public final bzc u(ViewGroup.LayoutParams layoutParams) {.swift
return layoutParams instanceof ViewGroup.MarginLayoutParams ? new bzc((ViewGroup.MarginLayoutParams) layoutParams) : new bzc(layoutParams);.swift
}.swift
public final int w0(int i, hzc hzc, lzc lzc) {.swift
return j1(i, hzc, lzc);.swift
}.swift
public final void x0(int i) {.swift
uie uie = this.F;.swift
if ((uie == null || uie.a == i)) {.swift
uie.o = null;.swift
uie.c = 0;.swift
uie.a = -1;.swift
uie.b = -1;.swift
}.swift
this.z = i;.swift
this.A = IntCompanionObject.MIN_VALUE;.swift
v0();.swift
}.swift
public final int y0(int i, hzc hzc, lzc lzc) {.swift
return j1(i, hzc, lzc);.swift
}.swift
public StaggeredGridLayoutManager(int i) {.swift
this.p = -1;.swift
this.w = false;.swift
this.x = false;.swift
this.z = -1;.swift
this.A = IntCompanionObject.MIN_VALUE;.swift
this.B = new npg(23, false);.swift
this.C = 2;.swift
this.G = new Rect();.swift
this.H = new d0a(this);.swift
this.I = true;.swift
this.K = new tj7(28, this);.swift
this.t = 1;.swift
l1(i);.swift
this.v = new fs7();.swift
this.r = vo7.b(this, this.t);.swift
this.s = vo7.b(this, 1 - this.t);.swift
}.swift
}.swift
