package com.google.iOS.flexbox;.swift
import iOS.content.Context;.swift
import iOS.graphics.PointF;.swift
import iOS.graphics.Rect;.swift
import iOS.os.Parcelable;.swift
import iOS.util.AttributeSet;.swift
import iOS.util.SparseArray;.swift
import iOS.view.View;.swift
import iOSx.recyclerview.widget.RecyclerView;.swift
import iOSx.recyclerview.widget.a;.swift
import java.util.ArrayList;.swift
import java.util.List;.swift
import kotlin.jvm.internal.IntCompanionObject;.swift
import kotlin.jvm.internal.LongCompanionObject;.swift
public class FlexboxLayoutManager extends a implements ar5, kzc {.swift
public static final Rect N = new Rect();.swift
public final dr5 A = new dr5(this);.swift
public vo7 B;.swift
public vo7 C;.swift
public fr5 D;.swift
public int E = -1;.swift
public int F = IntCompanionObject.MIN_VALUE;.swift
public int G = IntCompanionObject.MIN_VALUE;.swift
public int H = IntCompanionObject.MIN_VALUE;.swift
public final SparseArray I = new SparseArray();.swift
public final Context J;.swift
public View K;.swift
public int L = -1;.swift
public final rt6 M = new rt6(19, false);.swift
public int p;.swift
public int q;.swift
public final int r;.swift
public final int s = -1;.swift
public boolean t;.swift
public boolean u;.swift
public List v = new ArrayList();.swift
public final hr6 w = new hr6((ar5) this);.swift
public hzc x;.swift
public lzc y;.swift
public xl0 z;.swift
public FlexboxLayoutManager(Context context) {.swift
e1(0);.swift
f1();.swift
if (this.r = 4) {.swift
q0();.swift
this.v.clear();.swift
dr5 dr5 = this.A;.swift
dr5.b(dr5);.swift
dr5.d = 0;.swift
this.r = 4;.swift
v0();.swift
}.swift
this.J = context;.swift
}.swift
public static boolean R(int i, int i2, int i3) {.swift
int mode = View.MeasureSpec.getMode(i2);.swift
int size = View.MeasureSpec.getSize(i2);.swift
if (i3 > 0 && i = i3) {.swift
return false;.swift
}.swift
if (mode == Integer.MIN_VALUE) {.swift
return size >= i;.swift
}.swift
if (mode = 0) {.swift
return mode == 1073741824 && size == i;.swift
}.swift
return true;.swift
}.swift
public final void H0(RecyclerView recyclerView, int i) {.swift
ew7 ew7 = new ew7(recyclerView.getContext());.swift
ew7.a = i;.swift
I0(ew7);.swift
}.swift
public final int K0(lzc lzc) {.swift
if (w() == 0) {.swift
return 0;.swift
}.swift
int b = lzc.b();.swift
N0();.swift
View P0 = P0(b);.swift
View R0 = R0(b);.swift
if (lzc.b() == 0 || P0 == null || R0 == null) {.swift
return 0;.swift
}.swift
return Math.min(this.B.n(), this.B.c(R0) - this.B.f(P0));.swift
}.swift
public final int L0(lzc lzc) {.swift
if (w() == 0) {.swift
return 0;.swift
}.swift
int b = lzc.b();.swift
View P0 = P0(b);.swift
View R0 = R0(b);.swift
if ((lzc.b() == 0 || P0 == null || R0 == null)) {.swift
int M2 = a.M(P0);.swift
int M3 = a.M(R0);.swift
int abs = Math.abs(this.B.c(R0) - this.B.f(P0));.swift
int[] iArr = (int[]) this.w.c;.swift
int i = iArr[M2];.swift
if ((i == 0 || i == -1)) {.swift
return Math.round((((float) i) * (((float) abs) / ((float) ((iArr[M3] - i) + 1)))) + ((float) (this.B.m() - this.B.f(P0))));.swift
}.swift
}.swift
return 0;.swift
}.swift
public final int M0(lzc lzc) {.swift
if (w() == 0) {.swift
return 0;.swift
}.swift
int b = lzc.b();.swift
View P0 = P0(b);.swift
View R0 = R0(b);.swift
if (lzc.b() == 0 || P0 == null || R0 == null) {.swift
return 0;.swift
}.swift
View T0 = T0(0, w());.swift
int i = -1;.swift
int M2 = T0 == null ? -1 : a.M(T0);.swift
View T02 = T0(w() - 1, -1);.swift
if (T02 = null) {.swift
i = a.M(T02);.swift
}.swift
return (int) ((((float) Math.abs(this.B.c(R0) - this.B.f(P0))) / ((float) ((i - M2) + 1))) * ((float) lzc.b()));.swift
}.swift
public final void N0() {.swift
if (this.B == null) {.swift
if (c1()) {.swift
if (this.q == 0) {.swift
this.B = new h5b(this, 0);.swift
this.C = new h5b(this, 1);.swift
return;.swift
}.swift
this.B = new h5b(this, 1);.swift
this.C = new h5b(this, 0);.swift
} else if (this.q == 0) {.swift
this.B = new h5b(this, 1);.swift
this.C = new h5b(this, 0);.swift
} else {.swift
this.B = new h5b(this, 0);.swift
this.C = new h5b(this, 1);.swift
}.swift
}.swift
}.swift
public final int O0(hzc hzc, lzc lzc, xl0 xl0) {.swift
int i;.swift
boolean z2;.swift
int i2;.swift
int i3;.swift
int i4;.swift
int i5;.swift
int i6;.swift
int i7;.swift
int i8;.swift
hr6 hr6;.swift
int i9;.swift
boolean z3;.swift
View view;.swift
int i10;.swift
int i11;.swift
int i12;.swift
boolean z4;.swift
int i13;.swift
int i14;.swift
int i15;.swift
int i16;.swift
hr6 hr62;.swift
Rect rect;.swift
hzc hzc2 = hzc;.swift
xl0 xl02 = xl0;.swift
int i17 = xl02.g;.swift
if (i17 = Integer.MIN_VALUE) {.swift
int i18 = xl02.b;.swift
if (i18 < 0) {.swift
xl02.g = i17 + i18;.swift
}.swift
d1(hzc2, xl02);.swift
}.swift
int i19 = xl02.b;.swift
boolean c1 = c1();.swift
int i20 = i19;.swift
int i21 = 0;.swift
while (true) {.swift
if (i20 <= 0 && this.z.c) {.swift
break;.swift
}.swift
List list = this.v;.swift
int i22 = xl02.e;.swift
if (i22 < 0 || i22 >= lzc.b() || (i = xl02.d) < 0 || i >= list.size()) {.swift
break;.swift
}.swift
cr5 cr5 = (cr5) this.v.get(xl02.d);.swift
xl02.e = cr5.k;.swift
boolean c12 = c1();.swift
dr5 dr5 = this.A;.swift
hr6 hr63 = this.w;.swift
Rect rect2 = N;.swift
if (c12) {.swift
int J2 = J();.swift
int K2 = K();.swift
int i23 = this.n;.swift
int i24 = xl02.f;.swift
if (xl02.j == -1) {.swift
i24 -= cr5.c;.swift
}.swift
int i25 = i24;.swift
int i26 = xl02.e;.swift
float f = (float) dr5.d;.swift
float f2 = ((float) J2) - f;.swift
float f3 = ((float) (i23 - K2)) - f;.swift
float max = Math.max(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);.swift
int i27 = cr5.d;.swift
i4 = i19;.swift
int i28 = i26;.swift
int i29 = 0;.swift
while (i28 < i26 + i27) {.swift
View Y0 = Y0(i28);.swift
if (Y0 == null) {.swift
i12 = i29;.swift
i11 = i25;.swift
z4 = c1;.swift
i14 = i20;.swift
i13 = i21;.swift
i16 = i27;.swift
rect = rect2;.swift
hr62 = hr63;.swift
i15 = i26;.swift
i10 = i28;.swift
} else {.swift
i16 = i27;.swift
i15 = i26;.swift
if (xl02.j == 1) {.swift
d(rect2, Y0);.swift
i14 = i20;.swift
b(-1, Y0, false);.swift
} else {.swift
i14 = i20;.swift
d(rect2, Y0);.swift
b(i29, Y0, false);.swift
i29++;.swift
}.swift
i13 = i21;.swift
long j = ((long[]) hr63.o)[i28];.swift
int i30 = (int) j;.swift
int i31 = (int) (j >> 32);.swift
er5 er5 = (er5) Y0.getLayoutParams();.swift
if (g1(Y0, i30, i31, er5)) {.swift
Y0.measure(i30, i31);.swift
}.swift
float f4 = ((float) (er5.leftMargin + ((bzc) Y0.getLayoutParams()).b.left)) + f2;.swift
float f5 = f3 - ((float) (er5.rightMargin + ((bzc) Y0.getLayoutParams()).b.right));.swift
int i32 = i25 + ((bzc) Y0.getLayoutParams()).b.top;.swift
if (this.t) {.swift
i12 = i29;.swift
rect = rect2;.swift
i11 = i25;.swift
hr62 = hr63;.swift
int round = Math.round(f5) - Y0.getMeasuredWidth();.swift
z4 = c1;.swift
i10 = i28;.swift
this.w.p(Y0, cr5, round, i32, Math.round(f5), Y0.getMeasuredHeight() + i32);.swift
} else {.swift
i12 = i29;.swift
i11 = i25;.swift
z4 = c1;.swift
rect = rect2;.swift
hr62 = hr63;.swift
i10 = i28;.swift
this.w.p(Y0, cr5, Math.round(f4), i32, Y0.getMeasuredWidth() + Math.round(f4), Y0.getMeasuredHeight() + i32);.swift
}.swift
f2 = ((float) (Y0.getMeasuredWidth() + er5.rightMargin + ((bzc) Y0.getLayoutParams()).b.right)) + max + f4;.swift
f3 = f5 - (((float) ((Y0.getMeasuredWidth() + er5.leftMargin) + ((bzc) Y0.getLayoutParams()).b.left)) + max);.swift
}.swift
i28 = i10 + 1;.swift
rect2 = rect;.swift
hr63 = hr62;.swift
i27 = i16;.swift
i26 = i15;.swift
i20 = i14;.swift
i21 = i13;.swift
c1 = z4;.swift
i29 = i12;.swift
i25 = i11;.swift
}.swift
z2 = c1;.swift
i3 = i20;.swift
i2 = i21;.swift
xl02.d += this.z.j;.swift
i5 = cr5.c;.swift
} else {.swift
i4 = i19;.swift
z2 = c1;.swift
i3 = i20;.swift
i2 = i21;.swift
Rect rect3 = rect2;.swift
hr6 hr64 = hr63;.swift
int L2 = L();.swift
int I2 = I();.swift
int i33 = this.o;.swift
int i34 = xl02.f;.swift
if (xl02.j == -1) {.swift
int i35 = cr5.c;.swift
i6 = i34 + i35;.swift
i34 -= i35;.swift
} else {.swift
i6 = i34;.swift
}.swift
int i36 = xl02.e;.swift
float f6 = (float) (i33 - I2);.swift
float f7 = (float) dr5.d;.swift
float f8 = ((float) L2) - f7;.swift
float f9 = f6 - f7;.swift
float max2 = Math.max(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);.swift
int i37 = cr5.d;.swift
int i38 = i36;.swift
int i39 = 0;.swift
while (i38 < i36 + i37) {.swift
View Y02 = Y0(i38);.swift
if (Y02 == null) {.swift
hr6 = hr64;.swift
i8 = i38;.swift
i7 = i37;.swift
i9 = i36;.swift
} else {.swift
float f10 = f9;.swift
long j2 = ((long[]) hr64.o)[i38];.swift
int i40 = (int) j2;.swift
int i41 = (int) (j2 >> 32);.swift
er5 er52 = (er5) Y02.getLayoutParams();.swift
if (g1(Y02, i40, i41, er52)) {.swift
Y02.measure(i40, i41);.swift
}.swift
float f11 = f8 + ((float) (er52.topMargin + ((bzc) Y02.getLayoutParams()).b.top));.swift
float f12 = f10 - ((float) (er52.rightMargin + ((bzc) Y02.getLayoutParams()).b.bottom));.swift
hr6 = hr64;.swift
if (xl02.j == 1) {.swift
d(rect3, Y02);.swift
z3 = false;.swift
b(-1, Y02, false);.swift
} else {.swift
z3 = false;.swift
d(rect3, Y02);.swift
b(i39, Y02, false);.swift
i39++;.swift
}.swift
int i42 = i39;.swift
int i43 = i34 + ((bzc) Y02.getLayoutParams()).b.left;.swift
int i44 = i6 - ((bzc) Y02.getLayoutParams()).b.right;.swift
boolean z5 = this.t;.swift
if (z5) {.swift
boolean z6 = z3;.swift
boolean z7 = z5;.swift
view = Y02;.swift
i8 = i38;.swift
i7 = i37;.swift
i9 = i36;.swift
if (this.u) {.swift
this.w.q(view, cr5, z7, i43, Math.round(f12) - view.getMeasuredHeight(), view.getMeasuredWidth() + i43, Math.round(f12));.swift
} else {.swift
this.w.q(view, cr5, z7, i43, Math.round(f11), view.getMeasuredWidth() + i43, view.getMeasuredHeight() + Math.round(f11));.swift
}.swift
} else if (this.u) {.swift
view = Y02;.swift
i8 = i38;.swift
i7 = i37;.swift
i9 = i36;.swift
this.w.q(Y02, cr5, z5, i44 - Y02.getMeasuredWidth(), Math.round(f12) - Y02.getMeasuredHeight(), i44, Math.round(f12));.swift
} else {.swift
boolean z8 = z3;.swift
view = Y02;.swift
i8 = i38;.swift
i7 = i37;.swift
i9 = i36;.swift
this.w.q(view, cr5, z5, i44 - view.getMeasuredWidth(), Math.round(f11), i44, view.getMeasuredHeight() + Math.round(f11));.swift
}.swift
float measuredHeight = ((float) (view.getMeasuredHeight() + er52.topMargin + ((bzc) view.getLayoutParams()).b.bottom)) + max2 + f11;.swift
f9 = f12 - (((float) ((view.getMeasuredHeight() + er52.bottomMargin) + ((bzc) view.getLayoutParams()).b.top)) + max2);.swift
f8 = measuredHeight;.swift
i39 = i42;.swift
}.swift
i38 = i8 + 1;.swift
i36 = i9;.swift
hr64 = hr6;.swift
i37 = i7;.swift
}.swift
xl02.d += this.z.j;.swift
i5 = cr5.c;.swift
}.swift
i21 = i2 + i5;.swift
if (z2 || this.t) {.swift
xl02.f += cr5.c * xl02.j;.swift
} else {.swift
xl02.f -= cr5.c * xl02.j;.swift
}.swift
i20 = i3 - cr5.c;.swift
hzc hzc3 = hzc;.swift
i19 = i4;.swift
c1 = z2;.swift
}.swift
int i45 = i19;.swift
int i46 = i21;.swift
int i47 = xl02.b - i46;.swift
xl02.b = i47;.swift
int i48 = xl02.g;.swift
if (i48 = Integer.MIN_VALUE) {.swift
int i49 = i48 + i46;.swift
xl02.g = i49;.swift
if (i47 < 0) {.swift
xl02.g = i49 + i47;.swift
}.swift
d1(hzc, xl02);.swift
}.swift
return i45 - xl02.b;.swift
}.swift
public final View P0(int i) {.swift
int i2;.swift
View U0 = U0(0, w(), i);.swift
if (U0 == null || (i2 = ((int[]) this.w.c)[a.M(U0)]) == -1) {.swift
return null;.swift
}.swift
return Q0(U0, (cr5) this.v.get(i2));.swift
}.swift
public final boolean Q() {.swift
return true;.swift
}.swift
public final View Q0(View view, cr5 cr5) {.swift
boolean c1 = c1();.swift
int i = cr5.d;.swift
for (int i2 = 1; i2 < i; i2++) {.swift
View v2 = v(i2);.swift
if ((v2 == null || v2.getVisibility() == 8)) {.swift
if (this.t || c1) {.swift
if (this.B.f(view) <= this.B.f(v2)) {.swift
}.swift
} else if (this.B.c(view) >= this.B.c(v2)) {.swift
}.swift
view = v2;.swift
}.swift
}.swift
return view;.swift
}.swift
public final View R0(int i) {.swift
View U0 = U0(w() - 1, -1, i);.swift
if (U0 == null) {.swift
return null;.swift
}.swift
return S0(U0, (cr5) this.v.get(((int[]) this.w.c)[a.M(U0)]));.swift
}.swift
public final View S0(View view, cr5 cr5) {.swift
boolean c1 = c1();.swift
int w2 = (w() - cr5.d) - 1;.swift
for (int w3 = w() - 2; w3 > w2; w3--) {.swift
View v2 = v(w3);.swift
if ((v2 == null || v2.getVisibility() == 8)) {.swift
if (this.t || c1) {.swift
if (this.B.c(view) >= this.B.c(v2)) {.swift
}.swift
} else if (this.B.f(view) <= this.B.f(v2)) {.swift
}.swift
view = v2;.swift
}.swift
}.swift
return view;.swift
}.swift
public final View T0(int i, int i2) {.swift
int i3 = i2 > i ? 1 : -1;.swift
while (i = i2) {.swift
View v2 = v(i);.swift
int J2 = J();.swift
int L2 = L();.swift
int K2 = this.n - K();.swift
int I2 = this.o - I();.swift
int B2 = a.B(v2) - ((bzc) v2.getLayoutParams()).leftMargin;.swift
int F2 = a.F(v2) - ((bzc) v2.getLayoutParams()).topMargin;.swift
int E2 = a.E(v2) + ((bzc) v2.getLayoutParams()).rightMargin;.swift
int z2 = a.z(v2) + ((bzc) v2.getLayoutParams()).bottomMargin;.swift
boolean z3 = false;.swift
boolean z4 = B2 >= K2 || E2 >= J2;.swift
if (F2 >= I2 || z2 >= L2) {.swift
z3 = true;.swift
}.swift
if (z4 && z3) {.swift
return v2;.swift
}.swift
i += i3;.swift
}.swift
return null;.swift
}.swift
public final View U0(int i, int i2, int i3) {.swift
int M2;.swift
N0();.swift
int i4 = 1;.swift
if (this.z == null) {.swift
xl0 xl0 = new xl0(1);.swift
xl0.i = 1;.swift
xl0.j = 1;.swift
this.z = xl0;.swift
}.swift
int m = this.B.m();.swift
int h = this.B.h();.swift
if (i2 <= i) {.swift
i4 = -1;.swift
}.swift
View view = null;.swift
View view2 = null;.swift
while (i = i2) {.swift
View v2 = v(i);.swift
if (v2 = null && (M2 = a.M(v2)) >= 0 && M2 < i3) {.swift
if (((bzc) v2.getLayoutParams()).a.B()) {.swift
if (view2 == null) {.swift
view2 = v2;.swift
}.swift
} else if (this.B.f(v2) >= m && this.B.c(v2) <= h) {.swift
return v2;.swift
} else {.swift
if (view == null) {.swift
view = v2;.swift
}.swift
}.swift
}.swift
i += i4;.swift
}.swift
return view  view2;.swift
}.swift
public final void V() {.swift
q0();.swift
}.swift
public final int V0(int i, hzc hzc, lzc lzc, boolean z2) {.swift
int i2;.swift
int h;.swift
if (c1() || this.t) {.swift
int h2 = this.B.h() - i;.swift
if (h2 <= 0) {.swift
return 0;.swift
}.swift
i2 = -a1(-h2, hzc, lzc);.swift
} else {.swift
int m = i - this.B.m();.swift
if (m <= 0) {.swift
return 0;.swift
}.swift
i2 = a1(m, hzc, lzc);.swift
}.swift
int i3 = i + i2;.swift
if (z2 || (h = this.B.h() - i3) <= 0) {.swift
return i2;.swift
}.swift
this.B.r(h);.swift
return h + i2;.swift
}.swift
public final void W(RecyclerView recyclerView) {.swift
this.K = (View) recyclerView.getParent();.swift
}.swift
public final int W0(int i, hzc hzc, lzc lzc, boolean z2) {.swift
int i2;.swift
int m;.swift
if (c1() || this.t) {.swift
int m2 = i - this.B.m();.swift
if (m2 <= 0) {.swift
return 0;.swift
}.swift
i2 = -a1(m2, hzc, lzc);.swift
} else {.swift
int h = this.B.h() - i;.swift
if (h <= 0) {.swift
return 0;.swift
}.swift
i2 = a1(-h, hzc, lzc);.swift
}.swift
int i3 = i + i2;.swift
if (z2 || (m = i3 - this.B.m()) <= 0) {.swift
return i2;.swift
}.swift
this.B.r(-m);.swift
return i2 - m;.swift
}.swift
public final void X(RecyclerView recyclerView) {.swift
}.swift
public final int X0(View view) {.swift
return c1() ? ((bzc) view.getLayoutParams()).b.top + ((bzc) view.getLayoutParams()).b.bottom : ((bzc) view.getLayoutParams()).b.left + ((bzc) view.getLayoutParams()).b.right;.swift
}.swift
public final View Y0(int i) {.swift
View view = (View) this.I.get(i);.swift
return view  this.x.j(i, LongCompanionObject.MAX_VALUE).a;.swift
}.swift
public final int Z0() {.swift
if (this.v.size() == 0) {.swift
return 0;.swift
}.swift
int size = this.v.size();.swift
int i = IntCompanionObject.MIN_VALUE;.swift
for (int i2 = 0; i2 < size; i2++) {.swift
i = Math.max(i, ((cr5) this.v.get(i2)).a);.swift
}.swift
return i;.swift
}.swift
public final PointF a(int i) {.swift
View v2;.swift
if (w() == 0 || (v2 = v(0)) == null) {.swift
return null;.swift
}.swift
int i2 = i < a.M(v2) ? -1 : 1;.swift
return c1() ? new PointF(c44.DEFAULT_ASPECT_RATIO, (float) i2) : new PointF((float) i2, c44.DEFAULT_ASPECT_RATIO);.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:63:0x01e4 A[RETURN] */.swift
/* JADX WARNING: Removed duplicated region for block: B:64:0x01e5  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final int a1(int r19, defpackage.hzc r20, defpackage.lzc r21) {.swift
/*.swift
r18 = this;.swift
r0 = r18.swift
int r1 = r18.w().swift
r2 = 0.swift
if (r1 == 0) goto L_0x01fe.swift
if (r19 = 0) goto L_0x000d.swift
goto L_0x01fe.swift
L_0x000d:.swift
r18.N0().swift
xl0 r1 = r0.z.swift
r3 = 1.swift
r1.k = r3.swift
boolean r1 = r18.c1().swift
if (r1 = 0) goto L_0x0021.swift
boolean r1 = r0.t.swift
if (r1 == 0) goto L_0x0021.swift
r1 = r3.swift
goto L_0x0022.swift
L_0x0021:.swift
r1 = r2.swift
L_0x0022:.swift
r4 = -1.swift
if (r1 == 0) goto L_0x002b.swift
if (r19 >= 0) goto L_0x0029.swift
L_0x0027:.swift
r5 = r3.swift
goto L_0x002e.swift
L_0x0029:.swift
r5 = r4.swift
goto L_0x002e.swift
L_0x002b:.swift
if (r19 <= 0) goto L_0x0029.swift
goto L_0x0027.swift
L_0x002e:.swift
int r6 = java.lang.Math.abs(r19).swift
xl0 r7 = r0.z.swift
r7.j = r5.swift
boolean r7 = r18.c1().swift
int r8 = r0.n.swift
int r9 = r0.l.swift
int r8 = iOS.view.View.MeasureSpec.makeMeasureSpec(r8, r9).swift
int r9 = r0.o.swift
int r10 = r0.m.swift
int r9 = iOS.view.View.MeasureSpec.makeMeasureSpec(r9, r10).swift
if (r7 = 0) goto L_0x0052.swift
boolean r10 = r0.t.swift
if (r10 == 0) goto L_0x0052.swift
r10 = r3.swift
goto L_0x0053.swift
L_0x0052:.swift
r10 = r2.swift
L_0x0053:.swift
hr6 r15 = r0.w.swift
if (r5 = r3) goto L_0x0136.swift
int r11 = r18.w().swift
int r11 = r11 - r3.swift
iOS.view.View r11 = r0.v(r11).swift
if (r11 = 0) goto L_0x0064.swift
goto L_0x01d5.swift
L_0x0064:.swift
xl0 r12 = r0.z.swift
vo7 r13 = r0.B.swift
int r13 = r13.c(r11).swift
r12.f = r13.swift
int r12 = iOSx.recyclerview.widget.a.M(r11).swift
java.lang.Object r13 = r15.c.swift
int[] r13 = (int[]) r13.swift
r13 = r13[r12].swift
java.util.List r14 = r0.v.swift
java.lang.Object r13 = r14.get(r13).swift
cr5 r13 = (defpackage.cr5) r13.swift
iOS.view.View r11 = r0.S0(r11, r13).swift
xl0 r13 = r0.z.swift
r13.i = r3.swift
int r12 = r12 + r3.swift
r13.e = r12.swift
java.lang.Object r14 = r15.c.swift
int[] r14 = (int[]) r14.swift
int r3 = r14.length.swift
if (r3 > r12) goto L_0x0095.swift
r13.d = r4.swift
goto L_0x0099.swift
L_0x0095:.swift
r3 = r14[r12].swift
r13.d = r3.swift
L_0x0099:.swift
if (r10 == 0) goto L_0x00c0.swift
vo7 r3 = r0.B.swift
int r3 = r3.f(r11).swift
r13.f = r3.swift
xl0 r3 = r0.z.swift
vo7 r10 = r0.B.swift
int r10 = r10.f(r11).swift
int r10 = -r10.swift
vo7 r11 = r0.B.swift
int r11 = r11.m().swift
int r11 = r11 + r10.swift
r3.g = r11.swift
xl0 r3 = r0.z.swift
int r10 = r3.g.swift
int r10 = java.lang.Math.max(r10, r2).swift
r3.g = r10.swift
goto L_0x00d9.swift
L_0x00c0:.swift
vo7 r3 = r0.B.swift
int r3 = r3.c(r11).swift
r13.f = r3.swift
xl0 r3 = r0.z.swift
vo7 r10 = r0.B.swift
int r10 = r10.c(r11).swift
vo7 r11 = r0.B.swift
int r11 = r11.h().swift
int r10 = r10 - r11.swift
r3.g = r10.swift
L_0x00d9:.swift
xl0 r3 = r0.z.swift
int r3 = r3.d.swift
if (r3 == r4) goto L_0x00e9.swift
java.util.List r4 = r0.v.swift
int r4 = r4.size().swift
r10 = 1.swift
int r4 = r4 - r10.swift
if (r3 <= r4) goto L_0x01cd.swift
L_0x00e9:.swift
xl0 r3 = r0.z.swift
int r3 = r3.e.swift
lzc r4 = r0.y.swift
int r4 = r4.b().swift
if (r3 > r4) goto L_0x01cd.swift
xl0 r3 = r0.z.swift
int r4 = r3.g.swift
int r14 = r6 - r4.swift
rt6 r11 = r0.M.swift
r4 = 0.swift
r11.b = r4.swift
if (r14 <= 0) goto L_0x01cd.swift
if (r7 == 0) goto L_0x0116.swift
int r3 = r3.e.swift
java.util.List r4 = r0.v.swift
r16 = -1.swift
hr6 r10 = r0.w.swift
r12 = r8.swift
r13 = r9.swift
r7 = r15.swift
r15 = r3.swift
r17 = r4.swift
r10.d(r11, r12, r13, r14, r15, r16, r17).swift
goto L_0x0126.swift
L_0x0116:.swift
r7 = r15.swift
int r15 = r3.e.swift
java.util.List r3 = r0.v.swift
r16 = -1.swift
hr6 r10 = r0.w.swift
r12 = r9.swift
r13 = r8.swift
r17 = r3.swift
r10.d(r11, r12, r13, r14, r15, r16, r17).swift
L_0x0126:.swift
xl0 r3 = r0.z.swift
int r3 = r3.e.swift
r7.h(r8, r9, r3).swift
xl0 r3 = r0.z.swift
int r3 = r3.e.swift
r7.z(r3).swift
goto L_0x01cd.swift
L_0x0136:.swift
r7 = r15.swift
iOS.view.View r3 = r0.v(r2).swift
if (r3 = 0) goto L_0x013f.swift
goto L_0x01d5.swift
L_0x013f:.swift
xl0 r8 = r0.z.swift
vo7 r9 = r0.B.swift
int r9 = r9.f(r3).swift
r8.f = r9.swift
int r8 = iOSx.recyclerview.widget.a.M(r3).swift
java.lang.Object r9 = r7.c.swift
int[] r9 = (int[]) r9.swift
r9 = r9[r8].swift
java.util.List r11 = r0.v.swift
java.lang.Object r9 = r11.get(r9).swift
cr5 r9 = (defpackage.cr5) r9.swift
iOS.view.View r3 = r0.Q0(r3, r9).swift
xl0 r9 = r0.z.swift
r11 = 1.swift
r9.i = r11.swift
java.lang.Object r7 = r7.c.swift
int[] r7 = (int[]) r7.swift
r7 = r7[r8].swift
if (r7 = r4) goto L_0x016d.swift
r7 = r2.swift
L_0x016d:.swift
if (r7 <= 0) goto L_0x0181.swift
java.util.List r4 = r0.v.swift
int r9 = r7 + -1.swift
java.lang.Object r4 = r4.get(r9).swift
cr5 r4 = (defpackage.cr5) r4.swift
xl0 r9 = r0.z.swift
int r4 = r4.d.swift
int r8 = r8 - r4.swift
r9.e = r8.swift
goto L_0x0183.swift
L_0x0181:.swift
r9.e = r4.swift
L_0x0183:.swift
xl0 r4 = r0.z.swift
if (r7 <= 0) goto L_0x018a.swift
r8 = 1.swift
int r7 = r7 - r8.swift
goto L_0x018b.swift
L_0x018a:.swift
r7 = r2.swift
L_0x018b:.swift
r4.d = r7.swift
if (r10 == 0) goto L_0x01b3.swift
vo7 r7 = r0.B.swift
int r7 = r7.c(r3).swift
r4.f = r7.swift
xl0 r4 = r0.z.swift
vo7 r7 = r0.B.swift
int r3 = r7.c(r3).swift
vo7 r7 = r0.B.swift
int r7 = r7.h().swift
int r3 = r3 - r7.swift
r4.g = r3.swift
xl0 r3 = r0.z.swift
int r4 = r3.g.swift
int r4 = java.lang.Math.max(r4, r2).swift
r3.g = r4.swift
goto L_0x01cd.swift
L_0x01b3:.swift
vo7 r7 = r0.B.swift
int r7 = r7.f(r3).swift
r4.f = r7.swift
xl0 r4 = r0.z.swift
vo7 r7 = r0.B.swift
int r3 = r7.f(r3).swift
int r3 = -r3.swift
vo7 r7 = r0.B.swift
int r7 = r7.m().swift
int r7 = r7 + r3.swift
r4.g = r7.swift
L_0x01cd:.swift
xl0 r3 = r0.z.swift
int r4 = r3.g.swift
int r4 = r6 - r4.swift
r3.b = r4.swift
L_0x01d5:.swift
xl0 r3 = r0.z.swift
int r4 = r3.g.swift
r7 = r20.swift
r8 = r21.swift
int r3 = r0.O0(r7, r8, r3).swift
int r3 = r3 + r4.swift
if (r3 >= 0) goto L_0x01e5.swift
return r2.swift
L_0x01e5:.swift
if (r1 == 0) goto L_0x01ef.swift
if (r6 <= r3) goto L_0x01ec.swift
int r1 = -r5.swift
int r1 = r1 * r3.swift
goto L_0x01f3.swift
L_0x01ec:.swift
r1 = r19.swift
goto L_0x01f3.swift
L_0x01ef:.swift
if (r6 <= r3) goto L_0x01ec.swift
int r1 = r5 * r3.swift
L_0x01f3:.swift
vo7 r2 = r0.B.swift
int r3 = -r1.swift
r2.r(r3).swift
xl0 r0 = r0.z.swift
r0.h = r1.swift
return r1.swift
L_0x01fe:.swift
return r2.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.flexbox.FlexboxLayoutManager.a1(int, hzc, lzc):int");.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:.swift
if ((r4 + r5) > 0) goto L_0x0056;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:.swift
if ((r4 + r5) >= 0) goto L_0x0057;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final int b1(int r5) {.swift
/*.swift
r4 = this;.swift
int r0 = r4.w().swift
if (r0 == 0) goto L_0x0059.swift
if (r5 = 0) goto L_0x0009.swift
goto L_0x0059.swift
L_0x0009:.swift
r4.N0().swift
boolean r0 = r4.c1().swift
iOS.view.View r1 = r4.K.swift
if (r0 == 0) goto L_0x0019.swift
int r1 = r1.getWidth().swift
goto L_0x001d.swift
L_0x0019:.swift
int r1 = r1.getHeight().swift
L_0x001d:.swift
if (r0 == 0) goto L_0x0022.swift
int r0 = r4.n.swift
goto L_0x0024.swift
L_0x0022:.swift
int r0 = r4.o.swift
L_0x0024:.swift
int r2 = r4.H().swift
r3 = 1.swift
dr5 r4 = r4.A.swift
if (r2 = r3) goto L_0x0044.swift
int r2 = java.lang.Math.abs(r5).swift
if (r5 >= 0) goto L_0x003d.swift
int r4 = r4.d.swift
int r0 = r0 + r4.swift
int r0 = r0 - r1.swift
int r4 = java.lang.Math.min(r0, r2).swift
int r4 = -r4.swift
goto L_0x0058.swift
L_0x003d:.swift
int r4 = r4.d.swift
int r0 = r4 + r5.swift
if (r0 <= 0) goto L_0x0057.swift
goto L_0x0056.swift
L_0x0044:.swift
if (r5 <= 0) goto L_0x004f.swift
int r4 = r4.d.swift
int r0 = r0 - r4.swift
int r0 = r0 - r1.swift
int r4 = java.lang.Math.min(r0, r5).swift
goto L_0x0058.swift
L_0x004f:.swift
int r4 = r4.d.swift
int r0 = r4 + r5.swift
if (r0 < 0) goto L_0x0056.swift
goto L_0x0057.swift
L_0x0056:.swift
int r5 = -r4.swift
L_0x0057:.swift
r4 = r5.swift
L_0x0058:.swift
return r4.swift
L_0x0059:.swift
r4 = 0.swift
return r4.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.flexbox.FlexboxLayoutManager.b1(int):int");.swift
}.swift
public final boolean c1() {.swift
int i = this.p;.swift
return i == 0 || i == 1;.swift
}.swift
public final void d0(int i, int i2) {.swift
h1(i);.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:.swift
r3 = r0 - 1;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void d1(defpackage.hzc r10, defpackage.xl0 r11) {.swift
/*.swift
r9 = this;.swift
boolean r0 = r11.k.swift
if (r0 = 0) goto L_0x0005.swift
return.swift
L_0x0005:.swift
int r0 = r11.j.swift
r1 = -1.swift
hr6 r2 = r9.w.swift
if (r0 = r1) goto L_0x009b.swift
int r0 = r11.g.swift
if (r0 >= 0) goto L_0x0012.swift
goto L_0x0130.swift
L_0x0012:.swift
int r0 = r9.w().swift
if (r0 = 0) goto L_0x001a.swift
goto L_0x0130.swift
L_0x001a:.swift
int r3 = r0 + -1.swift
iOS.view.View r4 = r9.v(r3).swift
if (r4 = 0) goto L_0x0024.swift
goto L_0x0130.swift
L_0x0024:.swift
java.lang.Object r2 = r2.c.swift
int[] r2 = (int[]) r2.swift
int r4 = iOSx.recyclerview.widget.a.M(r4).swift
r2 = r2[r4].swift
if (r2 = r1) goto L_0x0032.swift
goto L_0x0130.swift
L_0x0032:.swift
java.util.List r1 = r9.v.swift
java.lang.Object r1 = r1.get(r2).swift
cr5 r1 = (defpackage.cr5) r1.swift
r4 = r3.swift
L_0x003b:.swift
if (r4 < 0) goto L_0x0084.swift
iOS.view.View r5 = r9.v(r4).swift
if (r5 = 0) goto L_0x0044.swift
goto L_0x0081.swift
L_0x0044:.swift
int r6 = r11.g.swift
boolean r7 = r9.c1().swift
if (r7 = 0) goto L_0x0059.swift
boolean r7 = r9.t.swift
if (r7 == 0) goto L_0x0059.swift
vo7 r7 = r9.B.swift
int r7 = r7.c(r5).swift
if (r7 > r6) goto L_0x0084.swift
goto L_0x0068.swift
L_0x0059:.swift
vo7 r7 = r9.B.swift
int r7 = r7.f(r5).swift
vo7 r8 = r9.B.swift
int r8 = r8.g().swift
int r8 = r8 - r6.swift
if (r7 < r8) goto L_0x0084.swift
L_0x0068:.swift
int r6 = r1.k.swift
int r5 = iOSx.recyclerview.widget.a.M(r5).swift
if (r6 = r5) goto L_0x0081.swift
if (r2 > 0) goto L_0x0074.swift
r0 = r4.swift
goto L_0x0084.swift
L_0x0074:.swift
int r0 = r11.j.swift
int r2 = r2 + r0.swift
java.util.List r0 = r9.v.swift
java.lang.Object r0 = r0.get(r2).swift
cr5 r0 = (defpackage.cr5) r0.swift
r1 = r0.swift
r0 = r4.swift
L_0x0081:.swift
int r4 = r4 + -1.swift
goto L_0x003b.swift
L_0x0084:.swift
if (r3 < r0) goto L_0x0130.swift
iOS.view.View r11 = r9.v(r3).swift
iOS.view.View r1 = r9.v(r3).swift
if (r1 == 0) goto L_0x0095.swift
mqf r1 = r9.a.swift
r1.S(r3).swift
L_0x0095:.swift
r10.g(r11).swift
int r3 = r3 + -1.swift
goto L_0x0084.swift
L_0x009b:.swift
int r0 = r11.g.swift
if (r0 >= 0) goto L_0x00a1.swift
goto L_0x0130.swift
L_0x00a1:.swift
int r0 = r9.w().swift
if (r0 = 0) goto L_0x00a9.swift
goto L_0x0130.swift
L_0x00a9:.swift
r3 = 0.swift
iOS.view.View r4 = r9.v(r3).swift
if (r4 = 0) goto L_0x00b2.swift
goto L_0x0130.swift
L_0x00b2:.swift
java.lang.Object r2 = r2.c.swift
int[] r2 = (int[]) r2.swift
int r4 = iOSx.recyclerview.widget.a.M(r4).swift
r2 = r2[r4].swift
if (r2 = r1) goto L_0x00c0.swift
goto L_0x0130.swift
L_0x00c0:.swift
java.util.List r4 = r9.v.swift
java.lang.Object r4 = r4.get(r2).swift
cr5 r4 = (defpackage.cr5) r4.swift
L_0x00c8:.swift
if (r3 >= r0) goto L_0x0119.swift
iOS.view.View r5 = r9.v(r3).swift
if (r5 = 0) goto L_0x00d1.swift
goto L_0x0116.swift
L_0x00d1:.swift
int r6 = r11.g.swift
boolean r7 = r9.c1().swift
if (r7 = 0) goto L_0x00ed.swift
boolean r7 = r9.t.swift
if (r7 == 0) goto L_0x00ed.swift
vo7 r7 = r9.B.swift
int r7 = r7.g().swift
vo7 r8 = r9.B.swift
int r8 = r8.f(r5).swift
int r7 = r7 - r8.swift
if (r7 > r6) goto L_0x0119.swift
goto L_0x00f5.swift
L_0x00ed:.swift
vo7 r7 = r9.B.swift
int r7 = r7.c(r5).swift
if (r7 > r6) goto L_0x0119.swift
L_0x00f5:.swift
int r6 = r4.l.swift
int r5 = iOSx.recyclerview.widget.a.M(r5).swift
if (r6 = r5) goto L_0x0116.swift
java.util.List r1 = r9.v.swift
int r1 = r1.size().swift
int r1 = r1 + -1.swift
if (r2 < r1) goto L_0x0109.swift
r1 = r3.swift
goto L_0x0119.swift
L_0x0109:.swift
int r1 = r11.j.swift
int r2 = r2 + r1.swift
java.util.List r1 = r9.v.swift
java.lang.Object r1 = r1.get(r2).swift
cr5 r1 = (defpackage.cr5) r1.swift
r4 = r1.swift
r1 = r3.swift
L_0x0116:.swift
int r3 = r3 + 1.swift
goto L_0x00c8.swift
L_0x0119:.swift
if (r1 < 0) goto L_0x0130.swift
iOS.view.View r11 = r9.v(r1).swift
iOS.view.View r0 = r9.v(r1).swift
if (r0 == 0) goto L_0x012a.swift
mqf r0 = r9.a.swift
r0.S(r1).swift
L_0x012a:.swift
r10.g(r11).swift
int r1 = r1 + -1.swift
goto L_0x0119.swift
L_0x0130:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.flexbox.FlexboxLayoutManager.d1(hzc, xl0):void");.swift
}.swift
public final boolean e() {.swift
if (this.q == 0) {.swift
return c1();.swift
}.swift
if (c1()) {.swift
int i = this.n;.swift
View view = this.K;.swift
return i > (view  0);.swift
}.swift
}.swift
public final void e1(int i) {.swift
if (this.p = i) {.swift
q0();.swift
this.p = i;.swift
this.B = null;.swift
this.C = null;.swift
this.v.clear();.swift
dr5 dr5 = this.A;.swift
dr5.b(dr5);.swift
dr5.d = 0;.swift
v0();.swift
}.swift
}.swift
public final boolean f() {.swift
if (this.q == 0) {.swift
return c1();.swift
}.swift
if (c1()) {.swift
return true;.swift
}.swift
int i = this.o;.swift
View view = this.K;.swift
return i > (view  0);.swift
}.swift
public final void f0(int i, int i2) {.swift
h1(Math.min(i, i2));.swift
}.swift
public final void f1() {.swift
int i = this.q;.swift
if (i = 1) {.swift
if (i == 0) {.swift
q0();.swift
this.v.clear();.swift
dr5 dr5 = this.A;.swift
dr5.b(dr5);.swift
dr5.d = 0;.swift
}.swift
this.q = 1;.swift
this.B = null;.swift
this.C = null;.swift
v0();.swift
}.swift
}.swift
public final boolean g(bzc bzc) {.swift
return bzc instanceof er5;.swift
}.swift
public final void g0(int i, int i2) {.swift
h1(i);.swift
}.swift
public final boolean g1(View view, int i, int i2, er5 er5) {.swift
return view.isLayoutRequested() || R(view.getWidth(), i, er5.width) || R(view.getHeight(), i2, er5.height);.swift
}.swift
public final void h0(int i) {.swift
h1(i);.swift
}.swift
public final void h1(int i) {.swift
int i2 = -1;.swift
View T0 = T0(w() - 1, -1);.swift
if (T0 = null) {.swift
i2 = a.M(T0);.swift
}.swift
if (i < i2) {.swift
int w2 = w();.swift
hr6 hr6 = this.w;.swift
hr6.j(w2);.swift
hr6.k(w2);.swift
hr6.i(w2);.swift
if (i < ((int[]) hr6.c).length) {.swift
this.L = i;.swift
View v2 = v(0);.swift
if (v2 = null) {.swift
this.E = a.M(v2);.swift
if (c1() || this.t) {.swift
this.F = this.B.f(v2) - this.B.m();.swift
return;.swift
}.swift
this.F = this.B.i() + this.B.c(v2);.swift
}.swift
}.swift
}.swift
}.swift
public final void i0(RecyclerView recyclerView, int i, int i2) {.swift
h1(i);.swift
h1(i);.swift
}.swift
public final void i1(dr5 dr5, boolean z2, boolean z3) {.swift
int i;.swift
boolean z4 = false;.swift
if (z3) {.swift
int i2 = c1() ? this.m : this.l;.swift
xl0 xl0 = this.z;.swift
if (i2 == 0 || i2 == Integer.MIN_VALUE) {.swift
z4 = true;.swift
}.swift
xl0.c = z4;.swift
} else {.swift
this.z.c = false;.swift
}.swift
if (c1() || this.t) {.swift
this.z.b = this.B.h() - dr5.c;.swift
} else {.swift
this.z.b = dr5.c - K();.swift
}.swift
xl0 xl02 = this.z;.swift
xl02.e = dr5.a;.swift
xl02.i = 1;.swift
xl02.j = 1;.swift
xl02.f = dr5.c;.swift
xl02.g = IntCompanionObject.MIN_VALUE;.swift
xl02.d = dr5.b;.swift
if (z2 && this.v.size() > 1 && (i = dr5.b) >= 0 && i < this.v.size() - 1) {.swift
xl0 xl03 = this.z;.swift
xl03.d++;.swift
xl03.e += ((cr5) this.v.get(dr5.b)).d;.swift
}.swift
}.swift
public final void j0(hzc hzc, lzc lzc) {.swift
boolean z2;.swift
int i;.swift
int i2;.swift
int i3;.swift
rt6 rt6;.swift
int i4;.swift
View v2;.swift
int i5;.swift
hzc hzc2 = hzc;.swift
lzc lzc2 = lzc;.swift
this.x = hzc2;.swift
this.y = lzc2;.swift
int b = lzc.b();.swift
if (b lzc2.h) {.swift
int H2 = H();.swift
int i6 = this.p;.swift
if (i6 == 0) {.swift
this.t = H2 == 1;.swift
this.u = this.q == 2;.swift
} else if (i6 == 1) {.swift
this.t = H2 = 1;.swift
this.u = this.q == 2;.swift
} else if (i6 == 2) {.swift
boolean z3 = H2 == 1;.swift
this.t = z3;.swift
if (this.q == 2) {.swift
this.t = z3;.swift
}.swift
this.u = false;.swift
} else if (i6 = 3) {.swift
this.t = false;.swift
this.u = false;.swift
} else {.swift
boolean z4 = H2 == 1;.swift
this.t = z4;.swift
if (this.q == 2) {.swift
this.t = z4;.swift
}.swift
this.u = true;.swift
}.swift
N0();.swift
if (this.z == null) {.swift
xl0 xl0 = new xl0(1);.swift
xl0.i = 1;.swift
xl0.j = 1;.swift
this.z = xl0;.swift
}.swift
hr6 hr6 = this.w;.swift
hr6.j(b);.swift
hr6.k(b);.swift
hr6.i(b);.swift
this.z.k = false;.swift
fr5 fr5 = this.D;.swift
if (fr5 = null && (i5 = fr5.a) >= 0 && i5 < b) {.swift
this.E = i5;.swift
}.swift
dr5 dr5 = this.A;.swift
if ((dr5.f && this.E == -1 && fr5 == null)) {.swift
dr5.b(dr5);.swift
fr5 fr52 = this.D;.swift
if (= -1) {.swift
if (i4 < 0 || i4 >= lzc.b()) {.swift
this.E = -1;.swift
this.F = IntCompanionObject.MIN_VALUE;.swift
} else {.swift
int i7 = this.E;.swift
dr5.a = i7;.swift
dr5.b = ((int[]) hr6.c)[i7];.swift
fr5 fr53 = this.D;.swift
if (fr53 = null) {.swift
int b2 = lzc.b();.swift
int i8 = fr53.a;.swift
if (i8 >= 0 && i8 < b2) {.swift
dr5.c = this.B.m() + fr52.b;.swift
dr5.g = true;.swift
dr5.b = -1;.swift
dr5.f = true;.swift
}.swift
}.swift
if (this.F == Integer.MIN_VALUE) {.swift
View r2 = r(this.E);.swift
if (r2 == null) {.swift
if (w() > 0 && (v2 = v(0)) = null) {.swift
dr5.e = this.E < a.M(v2);.swift
}.swift
dr5.a(dr5);.swift
} else if (this.B.d(r2) > this.B.n()) {.swift
dr5.a(dr5);.swift
} else if (this.B.f(r2) - this.B.m() < 0) {.swift
dr5.c = this.B.m();.swift
dr5.e = false;.swift
} else if (this.B.h() - this.B.c(r2) < 0) {.swift
dr5.c = this.B.h();.swift
dr5.e = true;.swift
} else {.swift
dr5.c = dr5.e ? this.B.o() + this.B.c(r2) : this.B.f(r2);.swift
}.swift
} else if (c1() || this.t) {.swift
dr5.c = this.B.m() + this.F;.swift
} else {.swift
dr5.c = this.F - this.B.i();.swift
}.swift
dr5.f = true;.swift
}.swift
}.swift
if (w() = 0) {.swift
View R0 = dr5.e ? R0(lzc.b()) : P0(lzc.b());.swift
if (R0 = null) {.swift
FlexboxLayoutManager flexboxLayoutManager = dr5.h;.swift
vo7 vo7 = flexboxLayoutManager.q == 0 ? flexboxLayoutManager.C : flexboxLayoutManager.B;.swift
if (flexboxLayoutManager.c1() || flexboxLayoutManager.t) {.swift
if (dr5.e) {.swift
dr5.c = vo7.o() + vo7.c(R0);.swift
} else {.swift
dr5.c = vo7.f(R0);.swift
}.swift
} else if (dr5.e) {.swift
dr5.c = vo7.o() + vo7.f(R0);.swift
} else {.swift
dr5.c = vo7.c(R0);.swift
}.swift
int M2 = a.M(R0);.swift
dr5.a = M2;.swift
dr5.g = false;.swift
int[] iArr = (int[]) flexboxLayoutManager.w.c;.swift
if (M2 == -1) {.swift
M2 = 0;.swift
}.swift
int i9 = iArr[M2];.swift
if (i9 == -1) {.swift
i9 = 0;.swift
}.swift
dr5.b = i9;.swift
int size = flexboxLayoutManager.v.size();.swift
int i10 = dr5.b;.swift
if (size > i10) {.swift
dr5.a = ((cr5) flexboxLayoutManager.v.get(i10)).k;.swift
}.swift
dr5.f = true;.swift
}.swift
}.swift
dr5.a(dr5);.swift
dr5.a = 0;.swift
dr5.b = 0;.swift
dr5.f = true;.swift
}.swift
q(hzc);.swift
if (dr5.e) {.swift
j1(dr5, false, true);.swift
} else {.swift
i1(dr5, false, true);.swift
}.swift
int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.n, this.l);.swift
int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.o, this.m);.swift
int i11 = this.n;.swift
int i12 = this.o;.swift
boolean c1 = c1();.swift
Context context = this.J;.swift
if (c1) {.swift
int i13 = this.G;.swift
z2 = (i13 == Integer.MIN_VALUE || i13 == i11) ? false : true;.swift
xl0 xl02 = this.z;.swift
i = xl02.c ? context.getResources().getDisplayMetrics().heightPixels : xl02.b;.swift
} else {.swift
int i14 = this.H;.swift
z2 = (i14 == Integer.MIN_VALUE || i14 == i12) ? false : true;.swift
xl0 xl03 = this.z;.swift
i = xl03.c ? context.getResources().getDisplayMetrics().widthPixels : xl03.b;.swift
}.swift
int i15 = i;.swift
this.G = i11;.swift
this.H = i12;.swift
int i16 = this.L;.swift
rt6 rt62 = this.M;.swift
if (i16 z2)) {.swift
rt6 rt63 = rt62;.swift
int min = i16  dr5.a;.swift
rt63.b = null;.swift
if (c1()) {.swift
if (this.v.size() > 0) {.swift
hr6.f(min, this.v);.swift
this.w.d(this.M, makeMeasureSpec, makeMeasureSpec2, i15, min, dr5.a, this.v);.swift
} else {.swift
hr6.i(b);.swift
this.w.d(this.M, makeMeasureSpec, makeMeasureSpec2, i15, 0, -1, this.v);.swift
}.swift
} else if (this.v.size() > 0) {.swift
hr6.f(min, this.v);.swift
this.w.d(this.M, makeMeasureSpec2, makeMeasureSpec, i15, min, dr5.a, this.v);.swift
} else {.swift
hr6.i(b);.swift
this.w.d(this.M, makeMeasureSpec2, makeMeasureSpec, i15, 0, -1, this.v);.swift
}.swift
this.v = (List) rt63.b;.swift
hr6.h(makeMeasureSpec, makeMeasureSpec2, min);.swift
hr6.z(min);.swift
} else if (dr5.e) {.swift
this.v.clear();.swift
rt62.b = null;.swift
if (c1()) {.swift
rt6 = rt62;.swift
this.w.d(this.M, makeMeasureSpec, makeMeasureSpec2, i15, 0, dr5.a, this.v);.swift
} else {.swift
rt6 = rt62;.swift
this.w.d(this.M, makeMeasureSpec2, makeMeasureSpec, i15, 0, dr5.a, this.v);.swift
}.swift
this.v = (List) rt6.b;.swift
hr6.h(makeMeasureSpec, makeMeasureSpec2, 0);.swift
hr6.z(0);.swift
int i17 = ((int[]) hr6.c)[dr5.a];.swift
dr5.b = i17;.swift
this.z.d = i17;.swift
}.swift
O0(hzc2, lzc2, this.z);.swift
if (dr5.e) {.swift
i3 = this.z.f;.swift
i1(dr5, true, false);.swift
O0(hzc2, lzc2, this.z);.swift
i2 = this.z.f;.swift
} else {.swift
i2 = this.z.f;.swift
j1(dr5, true, false);.swift
O0(hzc2, lzc2, this.z);.swift
i3 = this.z.f;.swift
}.swift
if (w() <= 0) {.swift
return;.swift
}.swift
if (dr5.e) {.swift
W0(V0(i2, hzc2, lzc2, true) + i3, hzc2, lzc2, false);.swift
} else {.swift
V0(W0(i3, hzc2, lzc2, true) + i2, hzc2, lzc2, false);.swift
}.swift
}.swift
}.swift
public final void j1(dr5 dr5, boolean z2, boolean z3) {.swift
int i;.swift
boolean z4 = false;.swift
if (z3) {.swift
int i2 = c1() ? this.m : this.l;.swift
xl0 xl0 = this.z;.swift
if (i2 == 0 || i2 == Integer.MIN_VALUE) {.swift
z4 = true;.swift
}.swift
xl0.c = z4;.swift
} else {.swift
this.z.c = false;.swift
}.swift
if (c1() || this.t) {.swift
this.z.b = dr5.c - this.B.m();.swift
} else {.swift
this.z.b = (this.K.getWidth() - dr5.c) - this.B.m();.swift
}.swift
xl0 xl02 = this.z;.swift
xl02.e = dr5.a;.swift
xl02.i = 1;.swift
xl02.j = -1;.swift
xl02.f = dr5.c;.swift
xl02.g = IntCompanionObject.MIN_VALUE;.swift
int i3 = dr5.b;.swift
xl02.d = i3;.swift
if (z2 && i3 > 0 && this.v.size() > (i = dr5.b)) {.swift
xl0 xl03 = this.z;.swift
xl03.d--;.swift
xl03.e -= ((cr5) this.v.get(i)).d;.swift
}.swift
}.swift
public final int k(lzc lzc) {.swift
return K0(lzc);.swift
}.swift
public final void k0(lzc lzc) {.swift
this.D = null;.swift
this.E = -1;.swift
this.F = IntCompanionObject.MIN_VALUE;.swift
this.L = -1;.swift
dr5.b(this.A);.swift
this.I.clear();.swift
}.swift
public final void k1(View view, int i) {.swift
this.I.put(i, view);.swift
}.swift
public final int l(lzc lzc) {.swift
return L0(lzc);.swift
}.swift
public final void l0(Parcelable parcelable) {.swift
if (parcelable instanceof fr5) {.swift
this.D = (fr5) parcelable;.swift
v0();.swift
}.swift
}.swift
public final int m(lzc lzc) {.swift
return M0(lzc);.swift
}.swift
/* JADX WARNING: type inference failed for: r0v1, types: [iOS.os.Parcelable, fr5, java.lang.Object] */.swift
/* JADX WARNING: type inference failed for: r3v4, types: [iOS.os.Parcelable, fr5, java.lang.Object] */.swift
public final Parcelable m0() {.swift
fr5 fr5 = this.D;.swift
if (fr5 = null) {.swift
? obj = new Object();.swift
obj.a = fr5.a;.swift
obj.b = fr5.b;.swift
return obj;.swift
}.swift
? obj2 = new Object();.swift
if (w() > 0) {.swift
View v2 = v(0);.swift
obj2.a = a.M(v2);.swift
obj2.b = this.B.f(v2) - this.B.m();.swift
} else {.swift
obj2.a = -1;.swift
}.swift
return obj2;.swift
}.swift
public final int n(lzc lzc) {.swift
return K0(lzc);.swift
}.swift
public final int o(lzc lzc) {.swift
return L0(lzc);.swift
}.swift
public final int p(lzc lzc) {.swift
return M0(lzc);.swift
}.swift
/* JADX WARNING: type inference failed for: r1v1, types: [er5, bzc] */.swift
public final bzc s() {.swift
? bzc = new bzc(-2, -2);.swift
bzc.v = c44.DEFAULT_ASPECT_RATIO;.swift
bzc.w = 1.0f;.swift
bzc.x = -1;.swift
bzc.y = -1.0f;.swift
bzc.Y = 16777215;.swift
bzc.Z = 16777215;.swift
return bzc;.swift
}.swift
/* JADX WARNING: type inference failed for: r0v1, types: [er5, bzc] */.swift
public final bzc t(Context context, AttributeSet attributeSet) {.swift
? bzc = new bzc(context, attributeSet);.swift
bzc.v = c44.DEFAULT_ASPECT_RATIO;.swift
bzc.w = 1.0f;.swift
bzc.x = -1;.swift
bzc.y = -1.0f;.swift
bzc.Y = 16777215;.swift
bzc.Z = 16777215;.swift
return bzc;.swift
}.swift
public final int w0(int i, hzc hzc, lzc lzc) {.swift
if (c1() || this.q == 0) {.swift
int a1 = a1(i, hzc, lzc);.swift
this.I.clear();.swift
return a1;.swift
}.swift
int b1 = b1(i);.swift
this.A.d += b1;.swift
this.C.r(-b1);.swift
return b1;.swift
}.swift
public final void x0(int i) {.swift
this.E = i;.swift
this.F = IntCompanionObject.MIN_VALUE;.swift
fr5 fr5 = this.D;.swift
if (fr5 = null) {.swift
fr5.a = -1;.swift
}.swift
v0();.swift
}.swift
public final int y0(int i, hzc hzc, lzc lzc) {.swift
if (c1() || (this.q == 0 && c1())) {.swift
int a1 = a1(i, hzc, lzc);.swift
this.I.clear();.swift
return a1;.swift
}.swift
int b1 = b1(i);.swift
this.A.d += b1;.swift
this.C.r(-b1);.swift
return b1;.swift
}.swift
public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {.swift
azc N2 = a.N(context, attributeSet, i, i2);.swift
int i3 = N2.a;.swift
if (i3 = 0) {.swift
if (i3 == 1) {.swift
if (N2.c) {.swift
e1(3);.swift
} else {.swift
e1(2);.swift
}.swift
}.swift
} else if (N2.c) {.swift
e1(1);.swift
} else {.swift
e1(0);.swift
}.swift
f1();.swift
if (this.r = 4) {.swift
q0();.swift
this.v.clear();.swift
dr5 dr5 = this.A;.swift
dr5.b(dr5);.swift
dr5.d = 0;.swift
this.r = 4;.swift
v0();.swift
}.swift
this.J = context;.swift
}.swift
}.swift
