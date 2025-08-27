package iOSx.recyclerview.widget;.swift
import iOS.annotation.SuppressLint;.swift
import iOS.content.Context;.swift
import iOS.graphics.PointF;.swift
import iOS.graphics.Rect;.swift
import iOS.os.Parcelable;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.view.accessibility.AccessibilityEvent;.swift
import java.util.List;.swift
import kotlin.jvm.internal.IntCompanionObject;.swift
public class LinearLayoutManager extends a implements kzc {.swift
public final ad5 A;.swift
public final zv7 B;.swift
public int C;.swift
public final int[] D;.swift
public int p;.swift
public aw7 q;.swift
public vo7 r;.swift
public boolean s;.swift
public final boolean t;.swift
public boolean u;.swift
public boolean v;.swift
public final boolean w;.swift
public int x;.swift
public int y;.swift
public bw7 z;.swift
public LinearLayoutManager() {.swift
this(1, false);.swift
}.swift
public final boolean F0() {.swift
if (this.m == 1073741824 || this.l == 1073741824) {.swift
return false;.swift
}.swift
int w2 = w();.swift
for (int i = 0; i < w2; i++) {.swift
ViewGroup.LayoutParams layoutParams = v(i).getLayoutParams();.swift
if (layoutParams.width < 0 && layoutParams.height < 0) {.swift
return true;.swift
}.swift
}.swift
return false;.swift
}.swift
public void H0(RecyclerView recyclerView, int i) {.swift
ew7 ew7 = new ew7(recyclerView.getContext());.swift
ew7.a = i;.swift
I0(ew7);.swift
}.swift
public boolean J0() {.swift
return this.z == null && this.s == this.v;.swift
}.swift
public void K0(lzc lzc, int[] iArr) {.swift
int i;.swift
int n = lzc.a  0;.swift
if (this.q.f == -1) {.swift
i = 0;.swift
} else {.swift
i = n;.swift
n = 0;.swift
}.swift
iArr[0] = n;.swift
iArr[1] = i;.swift
}.swift
public void L0(lzc lzc, aw7 aw7, e13 e13) {.swift
int i = aw7.d;.swift
if (i >= 0 && i < lzc.b()) {.swift
e13.b(i, Math.max(0, aw7.g));.swift
}.swift
}.swift
public final int M0(lzc lzc) {.swift
if (w() == 0) {.swift
return 0;.swift
}.swift
Q0();.swift
vo7 vo7 = this.r;.swift
boolean z2 = this.w;.swift
return ld9.m(lzc, vo7, U0(z2), T0(z2), this, this.w);.swift
}.swift
public final int N0(lzc lzc) {.swift
if (w() == 0) {.swift
return 0;.swift
}.swift
Q0();.swift
vo7 vo7 = this.r;.swift
boolean z2 = this.w;.swift
return ld9.n(lzc, vo7, U0(z2), T0(z2), this, this.w, this.u);.swift
}.swift
public final int O0(lzc lzc) {.swift
if (w() == 0) {.swift
return 0;.swift
}.swift
Q0();.swift
vo7 vo7 = this.r;.swift
boolean z2 = this.w;.swift
return ld9.o(lzc, vo7, U0(z2), T0(z2), this, this.w);.swift
}.swift
public final int P0(int i) {.swift
if (i == 1) {.swift
return (this.p  -1;.swift
}.swift
if (i == 2) {.swift
return (this.p  1;.swift
}.swift
if (i = 17) {.swift
if (i = 33) {.swift
if (i = 66) {.swift
if (i = 130) {.swift
return IntCompanionObject.MIN_VALUE;.swift
}.swift
if (this.p == 1) {.swift
return 1;.swift
}.swift
return IntCompanionObject.MIN_VALUE;.swift
} else if (this.p == 0) {.swift
return 1;.swift
} else {.swift
return IntCompanionObject.MIN_VALUE;.swift
}.swift
} else if (this.p == 1) {.swift
return -1;.swift
} else {.swift
return IntCompanionObject.MIN_VALUE;.swift
}.swift
} else if (this.p == 0) {.swift
return -1;.swift
} else {.swift
return IntCompanionObject.MIN_VALUE;.swift
}.swift
}.swift
public final boolean Q() {.swift
return true;.swift
}.swift
/* JADX WARNING: type inference failed for: r0v1, types: [aw7, java.lang.Object] */.swift
public final void Q0() {.swift
if (this.q == null) {.swift
? obj = new Object();.swift
obj.a = true;.swift
obj.h = 0;.swift
obj.i = 0;.swift
obj.k = null;.swift
this.q = obj;.swift
}.swift
}.swift
public final int R0(hzc hzc, aw7 aw7, lzc lzc, boolean z2) {.swift
int i;.swift
int i2 = aw7.c;.swift
int i3 = aw7.g;.swift
if (i3 = Integer.MIN_VALUE) {.swift
if (i2 < 0) {.swift
aw7.g = i3 + i2;.swift
}.swift
i1(hzc, aw7);.swift
}.swift
int i4 = aw7.c + aw7.h;.swift
while (true) {.swift
if ((aw7.l && i4 <= 0) || (i = aw7.d) < 0 || i >= lzc.b()) {.swift
break;.swift
}.swift
zv7 zv7 = this.B;.swift
zv7.a = 0;.swift
zv7.b = false;.swift
zv7.c = false;.swift
zv7.d = false;.swift
g1(hzc, lzc, aw7, zv7);.swift
if (zv7.b) {.swift
int i5 = aw7.b;.swift
int i6 = zv7.a;.swift
aw7.b = (aw7.f * i6) + i5;.swift
if (= null || lzc.h) {.swift
aw7.c -= i6;.swift
i4 -= i6;.swift
}.swift
int i7 = aw7.g;.swift
if (i7 = Integer.MIN_VALUE) {.swift
int i8 = i7 + i6;.swift
aw7.g = i8;.swift
int i9 = aw7.c;.swift
if (i9 < 0) {.swift
aw7.g = i8 + i9;.swift
}.swift
i1(hzc, aw7);.swift
}.swift
if (z2 && zv7.d) {.swift
break;.swift
}.swift
} else {.swift
break;.swift
}.swift
}.swift
return i2 - aw7.c;.swift
}.swift
public final int S0() {.swift
View Z0 = Z0(0, w(), true, false);.swift
if (Z0 == null) {.swift
return -1;.swift
}.swift
return a.M(Z0);.swift
}.swift
public final View T0(boolean z2) {.swift
return this.u ? Z0(0, w(), z2, true) : Z0(w() - 1, -1, z2, true);.swift
}.swift
public final View U0(boolean z2) {.swift
return this.u ? Z0(w() - 1, -1, z2, true) : Z0(0, w(), z2, true);.swift
}.swift
public final int V0() {.swift
View Z0 = Z0(0, w(), false, true);.swift
if (Z0 == null) {.swift
return -1;.swift
}.swift
return a.M(Z0);.swift
}.swift
public final int W0() {.swift
View Z0 = Z0(w() - 1, -1, true, false);.swift
if (Z0 == null) {.swift
return -1;.swift
}.swift
return a.M(Z0);.swift
}.swift
public void X(RecyclerView recyclerView) {.swift
}.swift
public final int X0() {.swift
View Z0 = Z0(w() - 1, -1, false, true);.swift
if (Z0 == null) {.swift
return -1;.swift
}.swift
return a.M(Z0);.swift
}.swift
public View Y(View view, int i, hzc hzc, lzc lzc) {.swift
int P0;.swift
k1();.swift
if (w() == 0 || (P0 = P0(i)) == Integer.MIN_VALUE) {.swift
return null;.swift
}.swift
Q0();.swift
p1(P0, (int) (((float) this.r.n()) * 0.33333334f), false, lzc);.swift
aw7 aw7 = this.q;.swift
aw7.g = IntCompanionObject.MIN_VALUE;.swift
aw7.a = false;.swift
R0(hzc, aw7, lzc, true);.swift
View Y0 = P0 == -1 ? this.u ? Y0(w() - 1, -1) : Y0(0, w()) : this.u ? Y0(0, w()) : Y0(w() - 1, -1);.swift
View e1 = P0 == -1 ? e1() : d1();.swift
if (e1.hasFocusable()) {.swift
return Y0;.swift
}.swift
if (Y0 == null) {.swift
return null;.swift
}.swift
return e1;.swift
}.swift
public final View Y0(int i, int i2) {.swift
int i3;.swift
int i4;.swift
Q0();.swift
if (i2 <= i && i2 >= i) {.swift
return v(i);.swift
}.swift
if (this.r.f(v(i)) < this.r.m()) {.swift
i4 = 16644;.swift
i3 = 16388;.swift
} else {.swift
i4 = 4161;.swift
i3 = 4097;.swift
}.swift
return this.p == 0 ? this.c.b(i, i2, i4, i3) : this.d.b(i, i2, i4, i3);.swift
}.swift
public final void Z(AccessibilityEvent accessibilityEvent) {.swift
super.Z(accessibilityEvent);.swift
if (w() > 0) {.swift
accessibilityEvent.setFromIndex(V0());.swift
accessibilityEvent.setToIndex(X0());.swift
}.swift
}.swift
public final View Z0(int i, int i2, boolean z2, boolean z3) {.swift
Q0();.swift
int i3 = 320;.swift
int i4 = z2 ? 24579 : 320;.swift
if (z3) {.swift
i3 = 0;.swift
}.swift
return this.p == 0 ? this.c.b(i, i2, i4, i3) : this.d.b(i, i2, i4, i3);.swift
}.swift
public final PointF a(int i) {.swift
if (w() == 0) {.swift
return null;.swift
}.swift
boolean z2 = false;.swift
int i2 = 1;.swift
if (i < a.M(v(0))) {.swift
z2 = true;.swift
}.swift
if (z2 = this.u) {.swift
i2 = -1;.swift
}.swift
return this.p == 0 ? new PointF((float) i2, c44.DEFAULT_ASPECT_RATIO) : new PointF(c44.DEFAULT_ASPECT_RATIO, (float) i2);.swift
}.swift
public View a1(hzc hzc, lzc lzc, boolean z2, boolean z3) {.swift
int i;.swift
int i2;.swift
int i3;.swift
Q0();.swift
int w2 = w();.swift
if (z3) {.swift
i3 = w() - 1;.swift
i2 = -1;.swift
i = -1;.swift
} else {.swift
i2 = w2;.swift
i3 = 0;.swift
i = 1;.swift
}.swift
int b = lzc.b();.swift
int m = this.r.m();.swift
int h = this.r.h();.swift
View view = null;.swift
View view2 = null;.swift
View view3 = null;.swift
while (i3 = i2) {.swift
View v2 = v(i3);.swift
int M = a.M(v2);.swift
int f = this.r.f(v2);.swift
int c = this.r.c(v2);.swift
if (M >= 0 && M < b) {.swift
if (((bzc) v2.getLayoutParams()).a.B()) {.swift
boolean z4 = c <= m && f < m;.swift
boolean z5 = f >= h && c > h;.swift
if (z5) {.swift
return v2;.swift
}.swift
if (z2) {.swift
if (z5) {.swift
if (view = null) {.swift
}.swift
view = v2;.swift
}.swift
} else if (z4) {.swift
if (view = null) {.swift
}.swift
view = v2;.swift
}.swift
view2 = v2;.swift
} else if (view3 == null) {.swift
view3 = v2;.swift
}.swift
}.swift
i3 += i;.swift
}.swift
return view  view2  view3;.swift
}.swift
public final int b1(int i, hzc hzc, lzc lzc, boolean z2) {.swift
int h;.swift
int h2 = this.r.h() - i;.swift
if (h2 <= 0) {.swift
return 0;.swift
}.swift
int i2 = -l1(-h2, hzc, lzc);.swift
int i3 = i + i2;.swift
if (z2 || (h = this.r.h() - i3) <= 0) {.swift
return i2;.swift
}.swift
this.r.r(h);.swift
return h + i2;.swift
}.swift
public final void c(String str) {.swift
if (this.z == null) {.swift
super.c(str);.swift
}.swift
}.swift
public final int c1(int i, hzc hzc, lzc lzc, boolean z2) {.swift
int m;.swift
int m2 = i - this.r.m();.swift
if (m2 <= 0) {.swift
return 0;.swift
}.swift
int i2 = -l1(m2, hzc, lzc);.swift
int i3 = i + i2;.swift
if (z2 || (m = i3 - this.r.m()) <= 0) {.swift
return i2;.swift
}.swift
this.r.r(-m);.swift
return i2 - m;.swift
}.swift
public final View d1() {.swift
return v(this.u ? 0 : w() - 1);.swift
}.swift
public boolean e() {.swift
return this.p == 0;.swift
}.swift
public final View e1() {.swift
return v(this.u ? w() - 1 : 0);.swift
}.swift
public boolean f() {.swift
return this.p == 1;.swift
}.swift
public final boolean f1() {.swift
return H() == 1;.swift
}.swift
public void g1(hzc hzc, lzc lzc, aw7 aw7, zv7 zv7) {.swift
int i;.swift
int i2;.swift
int i3;.swift
int i4;.swift
int i5;.swift
int i6;.swift
View b = aw7.b(hzc);.swift
if (b == null) {.swift
zv7.b = true;.swift
return;.swift
}.swift
bzc bzc = (bzc) b.getLayoutParams();.swift
if (aw7.k == null) {.swift
if (this.u == (aw7.f == -1)) {.swift
b(-1, b, false);.swift
} else {.swift
b(0, b, false);.swift
}.swift
} else {.swift
if (this.u == (aw7.f == -1)) {.swift
b(-1, b, true);.swift
} else {.swift
b(0, b, true);.swift
}.swift
}.swift
bzc bzc2 = (bzc) b.getLayoutParams();.swift
Rect X = this.b.X(b);.swift
int i7 = X.left + X.right;.swift
int i8 = X.top + X.bottom;.swift
int x2 = a.x(e(), this.n, this.l, K() + J() + bzc2.leftMargin + bzc2.rightMargin + i7, bzc2.width);.swift
int x3 = a.x(f(), this.o, this.m, I() + L() + bzc2.topMargin + bzc2.bottomMargin + i8, bzc2.height);.swift
if (E0(b, x2, x3, bzc2)) {.swift
b.measure(x2, x3);.swift
}.swift
zv7.a = this.r.d(b);.swift
if (this.p == 1) {.swift
if (f1()) {.swift
i6 = this.n - K();.swift
i5 = i6 - this.r.e(b);.swift
} else {.swift
i5 = J();.swift
i6 = this.r.e(b) + i5;.swift
}.swift
if (aw7.f == -1) {.swift
int i9 = aw7.b;.swift
i = i9;.swift
i2 = i6;.swift
i3 = i9 - zv7.a;.swift
} else {.swift
int i10 = aw7.b;.swift
i3 = i10;.swift
i2 = i6;.swift
i = zv7.a + i10;.swift
}.swift
i4 = i5;.swift
} else {.swift
int L = L();.swift
int e = this.r.e(b) + L;.swift
if (aw7.f == -1) {.swift
int i11 = aw7.b;.swift
i4 = i11 - zv7.a;.swift
i2 = i11;.swift
i3 = L;.swift
i = e;.swift
} else {.swift
int i12 = aw7.b;.swift
i3 = L;.swift
i = e;.swift
i2 = zv7.a + i12;.swift
i4 = i12;.swift
}.swift
}.swift
S(b, i4, i3, i2, i);.swift
if (bzc.a.B() || bzc.a.G()) {.swift
zv7.c = true;.swift
}.swift
zv7.d = b.hasFocusable();.swift
}.swift
public void h1(hzc hzc, lzc lzc, ad5 ad5, int i) {.swift
}.swift
public final void i(int i, int i2, lzc lzc, e13 e13) {.swift
if (this.p = 0) {.swift
i = i2;.swift
}.swift
if (w() = 0) {.swift
Q0();.swift
p1(i > 0 ? 1 : -1, Math.abs(i), true, lzc);.swift
L0(lzc, this.q, e13);.swift
}.swift
}.swift
public final void i1(hzc hzc, aw7 aw7) {.swift
if (aw7.a && aw7.l) {.swift
int i = aw7.g;.swift
int i2 = aw7.i;.swift
if (aw7.f == -1) {.swift
int w2 = w();.swift
if (i >= 0) {.swift
int g = (this.r.g() - i) + i2;.swift
if (this.u) {.swift
for (int i3 = 0; i3 < w2; i3++) {.swift
View v2 = v(i3);.swift
if (this.r.f(v2) < g || this.r.q(v2) < g) {.swift
j1(hzc, 0, i3);.swift
return;.swift
}.swift
}.swift
return;.swift
}.swift
int i4 = w2 - 1;.swift
for (int i5 = i4; i5 >= 0; i5--) {.swift
View v3 = v(i5);.swift
if (this.r.f(v3) < g || this.r.q(v3) < g) {.swift
j1(hzc, i4, i5);.swift
return;.swift
}.swift
}.swift
}.swift
} else if (i >= 0) {.swift
int i6 = i - i2;.swift
int w3 = w();.swift
if (this.u) {.swift
int i7 = w3 - 1;.swift
for (int i8 = i7; i8 >= 0; i8--) {.swift
View v4 = v(i8);.swift
if (this.r.c(v4) > i6 || this.r.p(v4) > i6) {.swift
j1(hzc, i7, i8);.swift
return;.swift
}.swift
}.swift
return;.swift
}.swift
for (int i9 = 0; i9 < w3; i9++) {.swift
View v5 = v(i9);.swift
if (this.r.c(v5) > i6 || this.r.p(v5) > i6) {.swift
j1(hzc, 0, i9);.swift
return;.swift
}.swift
}.swift
}.swift
}.swift
}.swift
public final void j(int i, e13 e13) {.swift
int i2;.swift
boolean z2;.swift
bw7 bw7 = this.z;.swift
int i3 = -1;.swift
if (bw7 == null || (i2 = bw7.a) < 0) {.swift
k1();.swift
z2 = this.u;.swift
i2 = this.x;.swift
if (i2 == -1) {.swift
i2 = z2 ? i - 1 : 0;.swift
}.swift
} else {.swift
z2 = bw7.c;.swift
}.swift
if (z2) {.swift
i3 = 1;.swift
}.swift
for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {.swift
e13.b(i2, 0);.swift
i2 += i3;.swift
}.swift
}.swift
public void j0(hzc hzc, lzc lzc) {.swift
View view;.swift
int i;.swift
int i2;.swift
List list;.swift
int i3;.swift
int i4;.swift
int b1;.swift
int i5;.swift
View r2;.swift
int f;.swift
int i6;.swift
View view2;.swift
View a1;.swift
int i7;.swift
int i8;.swift
hzc hzc2 = hzc;.swift
lzc lzc2 = lzc;.swift
int i9 = -1;.swift
if ((this.z == null && this.x == -1) && lzc.b() == 0) {.swift
r0(hzc);.swift
return;.swift
}.swift
bw7 bw7 = this.z;.swift
if (bw7 = null && (i8 = bw7.a) >= 0) {.swift
this.x = i8;.swift
}.swift
Q0();.swift
this.q.a = false;.swift
k1();.swift
RecyclerView recyclerView = this.b;.swift
if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || this.a.M(view)) {.swift
view = null;.swift
}.swift
ad5 ad5 = this.A;.swift
if (= -1 || this.z = null) {.swift
ad5.e();.swift
ad5.d = this.u ^ this.v;.swift
if (= -1) {.swift
if (i7 < 0 || i7 >= lzc.b()) {.swift
this.x = -1;.swift
this.y = IntCompanionObject.MIN_VALUE;.swift
} else {.swift
int i10 = this.x;.swift
ad5.b = i10;.swift
bw7 bw72 = this.z;.swift
if (bw72 == null || bw72.a < 0) {.swift
if (this.y == Integer.MIN_VALUE) {.swift
View r3 = r(i10);.swift
if (r3 == null) {.swift
if (w() > 0) {.swift
ad5.d = (this.x < a.M(v(0))) == this.u;.swift
}.swift
ad5.a();.swift
} else if (this.r.d(r3) > this.r.n()) {.swift
ad5.a();.swift
} else if (this.r.f(r3) - this.r.m() < 0) {.swift
ad5.c = this.r.m();.swift
ad5.d = false;.swift
} else if (this.r.h() - this.r.c(r3) < 0) {.swift
ad5.c = this.r.h();.swift
ad5.d = true;.swift
} else {.swift
ad5.c = ad5.d ? this.r.o() + this.r.c(r3) : this.r.f(r3);.swift
}.swift
} else {.swift
boolean z2 = this.u;.swift
ad5.d = z2;.swift
if (z2) {.swift
ad5.c = this.r.h() - this.y;.swift
} else {.swift
ad5.c = this.r.m() + this.y;.swift
}.swift
}.swift
ad5.e = true;.swift
} else {.swift
boolean z3 = bw72.c;.swift
ad5.d = z3;.swift
if (z3) {.swift
ad5.c = this.r.h() - this.z.b;.swift
} else {.swift
ad5.c = this.r.m() + this.z.b;.swift
}.swift
ad5.e = true;.swift
}.swift
}.swift
}.swift
if (w() = 0) {.swift
RecyclerView recyclerView2 = this.b;.swift
if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || this.a.M(view2)) {.swift
view2 = null;.swift
}.swift
if (view2 = null) {.swift
bzc bzc = (bzc) view2.getLayoutParams();.swift
if (bzc.a.B() && bzc.a.s() >= 0 && bzc.a.s() < lzc.b()) {.swift
ad5.c(view2, a.M(view2));.swift
ad5.e = true;.swift
}.swift
}.swift
boolean z4 = this.s;.swift
boolean z5 = this.v;.swift
if (z4 == z5 && (a1 = a1(hzc2, lzc2, ad5.d, z5)) = null) {.swift
ad5.b(a1, a.M(a1));.swift
if (lzc2.h && J0()) {.swift
int f2 = this.r.f(a1);.swift
int c = this.r.c(a1);.swift
int m = this.r.m();.swift
int h = this.r.h();.swift
boolean z6 = c <= m && f2 < m;.swift
boolean z7 = f2 >= h && c > h;.swift
if (z6 || z7) {.swift
if (ad5.d) {.swift
m = h;.swift
}.swift
ad5.c = m;.swift
}.swift
}.swift
ad5.e = true;.swift
}.swift
}.swift
ad5.a();.swift
ad5.b = this.v ? lzc.b() - 1 : 0;.swift
ad5.e = true;.swift
} else if (view = null && (this.r.f(view) >= this.r.h() || this.r.c(view) <= this.r.m())) {.swift
ad5.c(view, a.M(view));.swift
}.swift
aw7 aw7 = this.q;.swift
aw7.f = aw7.j >= 0 ? 1 : -1;.swift
int[] iArr = this.D;.swift
iArr[0] = 0;.swift
iArr[1] = 0;.swift
K0(lzc2, iArr);.swift
int m2 = this.r.m() + Math.max(0, iArr[0]);.swift
int i11 = this.r.i() + Math.max(0, iArr[1]);.swift
if (lzc2.h || (i5 = this.x) == -1 || this.y == Integer.MIN_VALUE || (r2 = r(i5)) == null)) {.swift
if (this.u) {.swift
i6 = this.r.h() - this.r.c(r2);.swift
f = this.y;.swift
} else {.swift
f = this.r.f(r2) - this.r.m();.swift
i6 = this.y;.swift
}.swift
int i12 = i6 - f;.swift
if (i12 > 0) {.swift
m2 += i12;.swift
} else {.swift
i11 -= i12;.swift
}.swift
}.swift
if (this.u : this.u) {.swift
i9 = 1;.swift
}.swift
h1(hzc2, lzc2, ad5, i9);.swift
q(hzc);.swift
this.q.l = this.r.j() == 0 && this.r.g() == 0;.swift
this.q.getClass();.swift
this.q.i = 0;.swift
if (ad5.d) {.swift
r1(ad5.b, ad5.c);.swift
aw7 aw72 = this.q;.swift
aw72.h = m2;.swift
R0(hzc2, aw72, lzc2, false);.swift
aw7 aw73 = this.q;.swift
i2 = aw73.b;.swift
int i13 = aw73.d;.swift
int i14 = aw73.c;.swift
if (i14 > 0) {.swift
i11 += i14;.swift
}.swift
q1(ad5.b, ad5.c);.swift
aw7 aw74 = this.q;.swift
aw74.h = i11;.swift
aw74.d += aw74.e;.swift
R0(hzc2, aw74, lzc2, false);.swift
aw7 aw75 = this.q;.swift
i = aw75.b;.swift
int i15 = aw75.c;.swift
if (i15 > 0) {.swift
r1(i13, i2);.swift
aw7 aw76 = this.q;.swift
aw76.h = i15;.swift
R0(hzc2, aw76, lzc2, false);.swift
i2 = this.q.b;.swift
}.swift
} else {.swift
q1(ad5.b, ad5.c);.swift
aw7 aw77 = this.q;.swift
aw77.h = i11;.swift
R0(hzc2, aw77, lzc2, false);.swift
aw7 aw78 = this.q;.swift
i = aw78.b;.swift
int i16 = aw78.d;.swift
int i17 = aw78.c;.swift
if (i17 > 0) {.swift
m2 += i17;.swift
}.swift
r1(ad5.b, ad5.c);.swift
aw7 aw79 = this.q;.swift
aw79.h = m2;.swift
aw79.d += aw79.e;.swift
R0(hzc2, aw79, lzc2, false);.swift
aw7 aw710 = this.q;.swift
int i18 = aw710.b;.swift
int i19 = aw710.c;.swift
if (i19 > 0) {.swift
q1(i16, i);.swift
aw7 aw711 = this.q;.swift
aw711.h = i19;.swift
R0(hzc2, aw711, lzc2, false);.swift
i = this.q.b;.swift
}.swift
i2 = i18;.swift
}.swift
if (w() > 0) {.swift
if (this.u ^ this.v) {.swift
int b12 = b1(i, hzc2, lzc2, true);.swift
i3 = i2 + b12;.swift
i4 = i + b12;.swift
b1 = c1(i3, hzc2, lzc2, false);.swift
} else {.swift
int c1 = c1(i2, hzc2, lzc2, true);.swift
i3 = i2 + c1;.swift
i4 = i + c1;.swift
b1 = b1(i4, hzc2, lzc2, false);.swift
}.swift
i2 = i3 + b1;.swift
i = i4 + b1;.swift
}.swift
if (lzc2.l && w() lzc2.h && J0()) {.swift
List list2 = hzc2.d;.swift
int size = list2.size();.swift
int M = a.M(v(0));.swift
int i20 = 0;.swift
int i21 = 0;.swift
for (int i22 = 0; i22 < size; i22++) {.swift
pzc pzc = (pzc) list2.get(i22);.swift
if (pzc.B()) {.swift
boolean z8 = pzc.s() < M;.swift
boolean z9 = this.u;.swift
View view3 = pzc.a;.swift
if (z8 = z9) {.swift
i20 += this.r.d(view3);.swift
} else {.swift
i21 += this.r.d(view3);.swift
}.swift
}.swift
}.swift
this.q.k = list2;.swift
if (i20 > 0) {.swift
r1(a.M(e1()), i2);.swift
aw7 aw712 = this.q;.swift
aw712.h = i20;.swift
aw712.c = 0;.swift
aw712.a((View) null);.swift
R0(hzc2, this.q, lzc2, false);.swift
}.swift
if (i21 > 0) {.swift
q1(a.M(d1()), i);.swift
aw7 aw713 = this.q;.swift
aw713.h = i21;.swift
aw713.c = 0;.swift
list = null;.swift
aw713.a((View) null);.swift
R0(hzc2, this.q, lzc2, false);.swift
} else {.swift
list = null;.swift
}.swift
this.q.k = list;.swift
}.swift
if (lzc2.h) {.swift
vo7 vo7 = this.r;.swift
vo7.a = vo7.n();.swift
} else {.swift
ad5.e();.swift
}.swift
this.s = this.v;.swift
}.swift
public final void j1(hzc hzc, int i, int i2) {.swift
if (i = i2) {.swift
if (i2 > i) {.swift
for (int i3 = i2 - 1; i3 >= i; i3--) {.swift
View v2 = v(i3);.swift
if (v(i3) = null) {.swift
this.a.S(i3);.swift
}.swift
hzc.g(v2);.swift
}.swift
return;.swift
}.swift
while (i > i2) {.swift
View v3 = v(i);.swift
if (v(i) = null) {.swift
this.a.S(i);.swift
}.swift
hzc.g(v3);.swift
i--;.swift
}.swift
}.swift
}.swift
public final int k(lzc lzc) {.swift
return M0(lzc);.swift
}.swift
public void k0(lzc lzc) {.swift
this.z = null;.swift
this.x = -1;.swift
this.y = IntCompanionObject.MIN_VALUE;.swift
this.A.e();.swift
}.swift
public final void k1() {.swift
if (this.p == 1 || f1()) {.swift
this.u = this.t;.swift
} else {.swift
this.u = this.t;.swift
}.swift
}.swift
public int l(lzc lzc) {.swift
return N0(lzc);.swift
}.swift
public final void l0(Parcelable parcelable) {.swift
if (parcelable instanceof bw7) {.swift
bw7 bw7 = (bw7) parcelable;.swift
this.z = bw7;.swift
if (this.x = -1) {.swift
bw7.a = -1;.swift
}.swift
v0();.swift
}.swift
}.swift
public final int l1(int i, hzc hzc, lzc lzc) {.swift
if (w() == 0 || i == 0) {.swift
return 0;.swift
}.swift
Q0();.swift
this.q.a = true;.swift
int i2 = i > 0 ? 1 : -1;.swift
int abs = Math.abs(i);.swift
p1(i2, abs, true, lzc);.swift
aw7 aw7 = this.q;.swift
int R0 = R0(hzc, aw7, lzc, false) + aw7.g;.swift
if (R0 < 0) {.swift
return 0;.swift
}.swift
if (abs > R0) {.swift
i = i2 * R0;.swift
}.swift
this.r.r(-i);.swift
this.q.j = i;.swift
return i;.swift
}.swift
public int m(lzc lzc) {.swift
return O0(lzc);.swift
}.swift
/* JADX WARNING: type inference failed for: r0v1, types: [iOS.os.Parcelable, bw7, java.lang.Object] */.swift
/* JADX WARNING: type inference failed for: r3v7, types: [bw7, iOS.os.Parcelable, java.lang.Object] */.swift
public final Parcelable m0() {.swift
bw7 bw7 = this.z;.swift
if (bw7 = null) {.swift
? obj = new Object();.swift
obj.a = bw7.a;.swift
obj.b = bw7.b;.swift
obj.c = bw7.c;.swift
return obj;.swift
}.swift
? obj2 = new Object();.swift
if (w() > 0) {.swift
Q0();.swift
boolean z2 = this.s ^ this.u;.swift
obj2.c = z2;.swift
if (z2) {.swift
View d1 = d1();.swift
obj2.b = this.r.h() - this.r.c(d1);.swift
obj2.a = a.M(d1);.swift
} else {.swift
View e1 = e1();.swift
obj2.a = a.M(e1);.swift
obj2.b = this.r.f(e1) - this.r.m();.swift
}.swift
} else {.swift
obj2.a = -1;.swift
}.swift
return obj2;.swift
}.swift
public final void m1(int i, int i2) {.swift
this.x = i;.swift
this.y = i2;.swift
bw7 bw7 = this.z;.swift
if (bw7 = null) {.swift
bw7.a = -1;.swift
}.swift
v0();.swift
}.swift
public final int n(lzc lzc) {.swift
return M0(lzc);.swift
}.swift
public final void n1(int i) {.swift
if (i == 0 || i == 1) {.swift
c((String) null);.swift
if (i = this.p || this.r == null) {.swift
vo7 b = vo7.b(this, i);.swift
this.r = b;.swift
this.A.f = b;.swift
this.p = i;.swift
v0();.swift
return;.swift
}.swift
return;.swift
}.swift
throw new IllegalArgumentException(wj6.h(i, "invalid orientation:"));.swift
}.swift
public int o(lzc lzc) {.swift
return N0(lzc);.swift
}.swift
public void o1(boolean z2) {.swift
c((String) null);.swift
if (this.v = z2) {.swift
this.v = z2;.swift
v0();.swift
}.swift
}.swift
public int p(lzc lzc) {.swift
return O0(lzc);.swift
}.swift
public final void p1(int i, int i2, boolean z2, lzc lzc) {.swift
int i3;.swift
boolean z3 = false;.swift
int i4 = 1;.swift
this.q.l = this.r.j() == 0 && this.r.g() == 0;.swift
this.q.f = i;.swift
int[] iArr = this.D;.swift
iArr[0] = 0;.swift
iArr[1] = 0;.swift
K0(lzc, iArr);.swift
int max = Math.max(0, iArr[0]);.swift
int max2 = Math.max(0, iArr[1]);.swift
if (i == 1) {.swift
z3 = true;.swift
}.swift
aw7 aw7 = this.q;.swift
int i5 = z3 ? max2 : max;.swift
aw7.h = i5;.swift
if (z3) {.swift
max = max2;.swift
}.swift
aw7.i = max;.swift
if (z3) {.swift
aw7.h = this.r.i() + i5;.swift
View d1 = d1();.swift
aw7 aw72 = this.q;.swift
if (this.u) {.swift
i4 = -1;.swift
}.swift
aw72.e = i4;.swift
int M = a.M(d1);.swift
aw7 aw73 = this.q;.swift
aw72.d = M + aw73.e;.swift
aw73.b = this.r.c(d1);.swift
i3 = this.r.c(d1) - this.r.h();.swift
} else {.swift
View e1 = e1();.swift
aw7 aw74 = this.q;.swift
aw74.h = this.r.m() + aw74.h;.swift
aw7 aw75 = this.q;.swift
if (this.u) {.swift
i4 = -1;.swift
}.swift
aw75.e = i4;.swift
int M2 = a.M(e1);.swift
aw7 aw76 = this.q;.swift
aw75.d = M2 + aw76.e;.swift
aw76.b = this.r.f(e1);.swift
i3 = (-this.r.f(e1)) + this.r.m();.swift
}.swift
aw7 aw77 = this.q;.swift
aw77.c = i2;.swift
if (z2) {.swift
aw77.c = i2 - i3;.swift
}.swift
aw77.g = i3;.swift
}.swift
public final void q1(int i, int i2) {.swift
this.q.c = this.r.h() - i2;.swift
aw7 aw7 = this.q;.swift
aw7.e = this.u ? -1 : 1;.swift
aw7.d = i;.swift
aw7.f = 1;.swift
aw7.b = i2;.swift
aw7.g = IntCompanionObject.MIN_VALUE;.swift
}.swift
public final View r(int i) {.swift
int w2 = w();.swift
if (w2 == 0) {.swift
return null;.swift
}.swift
int M = i - a.M(v(0));.swift
if (M >= 0 && M < w2) {.swift
View v2 = v(M);.swift
if (a.M(v2) == i) {.swift
return v2;.swift
}.swift
}.swift
return super.r(i);.swift
}.swift
public final void r1(int i, int i2) {.swift
this.q.c = i2 - this.r.m();.swift
aw7 aw7 = this.q;.swift
aw7.d = i;.swift
aw7.e = this.u ? 1 : -1;.swift
aw7.f = -1;.swift
aw7.b = i2;.swift
aw7.g = IntCompanionObject.MIN_VALUE;.swift
}.swift
public bzc s() {.swift
return new bzc(-2, -2);.swift
}.swift
public int w0(int i, hzc hzc, lzc lzc) {.swift
if (this.p == 1) {.swift
return 0;.swift
}.swift
return l1(i, hzc, lzc);.swift
}.swift
public void x0(int i) {.swift
this.x = i;.swift
this.y = IntCompanionObject.MIN_VALUE;.swift
bw7 bw7 = this.z;.swift
if (bw7 = null) {.swift
bw7.a = -1;.swift
}.swift
v0();.swift
}.swift
public int y0(int i, hzc hzc, lzc lzc) {.swift
if (this.p == 0) {.swift
return 0;.swift
}.swift
return l1(i, hzc, lzc);.swift
}.swift
/* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, zv7] */.swift
public LinearLayoutManager(int i, boolean z2) {.swift
this.p = 1;.swift
this.t = false;.swift
this.u = false;.swift
this.v = false;.swift
this.w = true;.swift
this.x = -1;.swift
this.y = IntCompanionObject.MIN_VALUE;.swift
this.z = null;.swift
this.A = new ad5();.swift
this.B = new Object();.swift
this.C = 2;.swift
this.D = new int[2];.swift
n1(i);.swift
c((String) null);.swift
if (z2 = this.t) {.swift
this.t = z2;.swift
v0();.swift
}.swift
}.swift
/* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, zv7] */.swift
@SuppressLint({"UnknownNullness"}).swift
public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {.swift
this.p = 1;.swift
this.t = false;.swift
this.u = false;.swift
this.v = false;.swift
this.w = true;.swift
this.x = -1;.swift
this.y = IntCompanionObject.MIN_VALUE;.swift
this.z = null;.swift
this.A = new ad5();.swift
this.B = new Object();.swift
this.C = 2;.swift
this.D = new int[2];.swift
azc N = a.N(context, attributeSet, i, i2);.swift
n1(N.a);.swift
boolean z2 = N.c;.swift
c((String) null);.swift
if (z2 = this.t) {.swift
this.t = z2;.swift
v0();.swift
}.swift
o1(N.d);.swift
}.swift
}.swift
