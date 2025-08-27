package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

public class LinearLayoutManager extends a implements kzc {
    public final ad5 A;
    public final zv7 B;
    public int C;
    public final int[] D;
    public int p;
    public aw7 q;
    public vo7 r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public bw7 z;

    public LinearLayoutManager() {
        this(1, false);
    }

    public final boolean F0() {
        if (this.m == 1073741824 || this.l == 1073741824) {
            return false;
        }
        int w2 = w();
        for (int i = 0; i < w2; i++) {
            ViewGroup.LayoutParams layoutParams = v(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    public void H0(RecyclerView recyclerView, int i) {
        ew7 ew7 = new ew7(recyclerView.getContext());
        ew7.a = i;
        I0(ew7);
    }

    public boolean J0() {
        return this.z == null && this.s == this.v;
    }

    public void K0(lzc lzc, int[] iArr) {
        int i;
        int n = lzc.a != -1 ? this.r.n() : 0;
        if (this.q.f == -1) {
            i = 0;
        } else {
            i = n;
            n = 0;
        }
        iArr[0] = n;
        iArr[1] = i;
    }

    public void L0(lzc lzc, aw7 aw7, e13 e13) {
        int i = aw7.d;
        if (i >= 0 && i < lzc.b()) {
            e13.b(i, Math.max(0, aw7.g));
        }
    }

    public final int M0(lzc lzc) {
        if (w() == 0) {
            return 0;
        }
        Q0();
        vo7 vo7 = this.r;
        boolean z2 = !this.w;
        return ld9.m(lzc, vo7, U0(z2), T0(z2), this, this.w);
    }

    public final int N0(lzc lzc) {
        if (w() == 0) {
            return 0;
        }
        Q0();
        vo7 vo7 = this.r;
        boolean z2 = !this.w;
        return ld9.n(lzc, vo7, U0(z2), T0(z2), this, this.w, this.u);
    }

    public final int O0(lzc lzc) {
        if (w() == 0) {
            return 0;
        }
        Q0();
        vo7 vo7 = this.r;
        boolean z2 = !this.w;
        return ld9.o(lzc, vo7, U0(z2), T0(z2), this, this.w);
    }

    public final int P0(int i) {
        if (i == 1) {
            return (this.p != 1 && f1()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.p != 1 && f1()) ? -1 : 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        return IntCompanionObject.MIN_VALUE;
                    }
                    if (this.p == 1) {
                        return 1;
                    }
                    return IntCompanionObject.MIN_VALUE;
                } else if (this.p == 0) {
                    return 1;
                } else {
                    return IntCompanionObject.MIN_VALUE;
                }
            } else if (this.p == 1) {
                return -1;
            } else {
                return IntCompanionObject.MIN_VALUE;
            }
        } else if (this.p == 0) {
            return -1;
        } else {
            return IntCompanionObject.MIN_VALUE;
        }
    }

    public final boolean Q() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [aw7, java.lang.Object] */
    public final void Q0() {
        if (this.q == null) {
            ? obj = new Object();
            obj.a = true;
            obj.h = 0;
            obj.i = 0;
            obj.k = null;
            this.q = obj;
        }
    }

    public final int R0(hzc hzc, aw7 aw7, lzc lzc, boolean z2) {
        int i;
        int i2 = aw7.c;
        int i3 = aw7.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                aw7.g = i3 + i2;
            }
            i1(hzc, aw7);
        }
        int i4 = aw7.c + aw7.h;
        while (true) {
            if ((!aw7.l && i4 <= 0) || (i = aw7.d) < 0 || i >= lzc.b()) {
                break;
            }
            zv7 zv7 = this.B;
            zv7.a = 0;
            zv7.b = false;
            zv7.c = false;
            zv7.d = false;
            g1(hzc, lzc, aw7, zv7);
            if (!zv7.b) {
                int i5 = aw7.b;
                int i6 = zv7.a;
                aw7.b = (aw7.f * i6) + i5;
                if (!zv7.c || aw7.k != null || !lzc.h) {
                    aw7.c -= i6;
                    i4 -= i6;
                }
                int i7 = aw7.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    aw7.g = i8;
                    int i9 = aw7.c;
                    if (i9 < 0) {
                        aw7.g = i8 + i9;
                    }
                    i1(hzc, aw7);
                }
                if (z2 && zv7.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - aw7.c;
    }

    public final int S0() {
        View Z0 = Z0(0, w(), true, false);
        if (Z0 == null) {
            return -1;
        }
        return a.M(Z0);
    }

    public final View T0(boolean z2) {
        return this.u ? Z0(0, w(), z2, true) : Z0(w() - 1, -1, z2, true);
    }

    public final View U0(boolean z2) {
        return this.u ? Z0(w() - 1, -1, z2, true) : Z0(0, w(), z2, true);
    }

    public final int V0() {
        View Z0 = Z0(0, w(), false, true);
        if (Z0 == null) {
            return -1;
        }
        return a.M(Z0);
    }

    public final int W0() {
        View Z0 = Z0(w() - 1, -1, true, false);
        if (Z0 == null) {
            return -1;
        }
        return a.M(Z0);
    }

    public void X(RecyclerView recyclerView) {
    }

    public final int X0() {
        View Z0 = Z0(w() - 1, -1, false, true);
        if (Z0 == null) {
            return -1;
        }
        return a.M(Z0);
    }

    public View Y(View view, int i, hzc hzc, lzc lzc) {
        int P0;
        k1();
        if (w() == 0 || (P0 = P0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        Q0();
        p1(P0, (int) (((float) this.r.n()) * 0.33333334f), false, lzc);
        aw7 aw7 = this.q;
        aw7.g = IntCompanionObject.MIN_VALUE;
        aw7.a = false;
        R0(hzc, aw7, lzc, true);
        View Y0 = P0 == -1 ? this.u ? Y0(w() - 1, -1) : Y0(0, w()) : this.u ? Y0(0, w()) : Y0(w() - 1, -1);
        View e1 = P0 == -1 ? e1() : d1();
        if (!e1.hasFocusable()) {
            return Y0;
        }
        if (Y0 == null) {
            return null;
        }
        return e1;
    }

    public final View Y0(int i, int i2) {
        int i3;
        int i4;
        Q0();
        if (i2 <= i && i2 >= i) {
            return v(i);
        }
        if (this.r.f(v(i)) < this.r.m()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        return this.p == 0 ? this.c.b(i, i2, i4, i3) : this.d.b(i, i2, i4, i3);
    }

    public final void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (w() > 0) {
            accessibilityEvent.setFromIndex(V0());
            accessibilityEvent.setToIndex(X0());
        }
    }

    public final View Z0(int i, int i2, boolean z2, boolean z3) {
        Q0();
        int i3 = 320;
        int i4 = z2 ? 24579 : 320;
        if (!z3) {
            i3 = 0;
        }
        return this.p == 0 ? this.c.b(i, i2, i4, i3) : this.d.b(i, i2, i4, i3);
    }

    public final PointF a(int i) {
        if (w() == 0) {
            return null;
        }
        boolean z2 = false;
        int i2 = 1;
        if (i < a.M(v(0))) {
            z2 = true;
        }
        if (z2 != this.u) {
            i2 = -1;
        }
        return this.p == 0 ? new PointF((float) i2, c44.DEFAULT_ASPECT_RATIO) : new PointF(c44.DEFAULT_ASPECT_RATIO, (float) i2);
    }

    public View a1(hzc hzc, lzc lzc, boolean z2, boolean z3) {
        int i;
        int i2;
        int i3;
        Q0();
        int w2 = w();
        if (z3) {
            i3 = w() - 1;
            i2 = -1;
            i = -1;
        } else {
            i2 = w2;
            i3 = 0;
            i = 1;
        }
        int b = lzc.b();
        int m = this.r.m();
        int h = this.r.h();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i3 != i2) {
            View v2 = v(i3);
            int M = a.M(v2);
            int f = this.r.f(v2);
            int c = this.r.c(v2);
            if (M >= 0 && M < b) {
                if (!((bzc) v2.getLayoutParams()).a.B()) {
                    boolean z4 = c <= m && f < m;
                    boolean z5 = f >= h && c > h;
                    if (!z4 && !z5) {
                        return v2;
                    }
                    if (z2) {
                        if (!z5) {
                            if (view != null) {
                            }
                            view = v2;
                        }
                    } else if (!z4) {
                        if (view != null) {
                        }
                        view = v2;
                    }
                    view2 = v2;
                } else if (view3 == null) {
                    view3 = v2;
                }
            }
            i3 += i;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    public final int b1(int i, hzc hzc, lzc lzc, boolean z2) {
        int h;
        int h2 = this.r.h() - i;
        if (h2 <= 0) {
            return 0;
        }
        int i2 = -l1(-h2, hzc, lzc);
        int i3 = i + i2;
        if (!z2 || (h = this.r.h() - i3) <= 0) {
            return i2;
        }
        this.r.r(h);
        return h + i2;
    }

    public final void c(String str) {
        if (this.z == null) {
            super.c(str);
        }
    }

    public final int c1(int i, hzc hzc, lzc lzc, boolean z2) {
        int m;
        int m2 = i - this.r.m();
        if (m2 <= 0) {
            return 0;
        }
        int i2 = -l1(m2, hzc, lzc);
        int i3 = i + i2;
        if (!z2 || (m = i3 - this.r.m()) <= 0) {
            return i2;
        }
        this.r.r(-m);
        return i2 - m;
    }

    public final View d1() {
        return v(this.u ? 0 : w() - 1);
    }

    public boolean e() {
        return this.p == 0;
    }

    public final View e1() {
        return v(this.u ? w() - 1 : 0);
    }

    public boolean f() {
        return this.p == 1;
    }

    public final boolean f1() {
        return H() == 1;
    }

    public void g1(hzc hzc, lzc lzc, aw7 aw7, zv7 zv7) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View b = aw7.b(hzc);
        if (b == null) {
            zv7.b = true;
            return;
        }
        bzc bzc = (bzc) b.getLayoutParams();
        if (aw7.k == null) {
            if (this.u == (aw7.f == -1)) {
                b(-1, b, false);
            } else {
                b(0, b, false);
            }
        } else {
            if (this.u == (aw7.f == -1)) {
                b(-1, b, true);
            } else {
                b(0, b, true);
            }
        }
        bzc bzc2 = (bzc) b.getLayoutParams();
        Rect X = this.b.X(b);
        int i7 = X.left + X.right;
        int i8 = X.top + X.bottom;
        int x2 = a.x(e(), this.n, this.l, K() + J() + bzc2.leftMargin + bzc2.rightMargin + i7, bzc2.width);
        int x3 = a.x(f(), this.o, this.m, I() + L() + bzc2.topMargin + bzc2.bottomMargin + i8, bzc2.height);
        if (E0(b, x2, x3, bzc2)) {
            b.measure(x2, x3);
        }
        zv7.a = this.r.d(b);
        if (this.p == 1) {
            if (f1()) {
                i6 = this.n - K();
                i5 = i6 - this.r.e(b);
            } else {
                i5 = J();
                i6 = this.r.e(b) + i5;
            }
            if (aw7.f == -1) {
                int i9 = aw7.b;
                i = i9;
                i2 = i6;
                i3 = i9 - zv7.a;
            } else {
                int i10 = aw7.b;
                i3 = i10;
                i2 = i6;
                i = zv7.a + i10;
            }
            i4 = i5;
        } else {
            int L = L();
            int e = this.r.e(b) + L;
            if (aw7.f == -1) {
                int i11 = aw7.b;
                i4 = i11 - zv7.a;
                i2 = i11;
                i3 = L;
                i = e;
            } else {
                int i12 = aw7.b;
                i3 = L;
                i = e;
                i2 = zv7.a + i12;
                i4 = i12;
            }
        }
        S(b, i4, i3, i2, i);
        if (bzc.a.B() || bzc.a.G()) {
            zv7.c = true;
        }
        zv7.d = b.hasFocusable();
    }

    public void h1(hzc hzc, lzc lzc, ad5 ad5, int i) {
    }

    public final void i(int i, int i2, lzc lzc, e13 e13) {
        if (this.p != 0) {
            i = i2;
        }
        if (w() != 0 && i != 0) {
            Q0();
            p1(i > 0 ? 1 : -1, Math.abs(i), true, lzc);
            L0(lzc, this.q, e13);
        }
    }

    public final void i1(hzc hzc, aw7 aw7) {
        if (aw7.a && !aw7.l) {
            int i = aw7.g;
            int i2 = aw7.i;
            if (aw7.f == -1) {
                int w2 = w();
                if (i >= 0) {
                    int g = (this.r.g() - i) + i2;
                    if (this.u) {
                        for (int i3 = 0; i3 < w2; i3++) {
                            View v2 = v(i3);
                            if (this.r.f(v2) < g || this.r.q(v2) < g) {
                                j1(hzc, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = w2 - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View v3 = v(i5);
                        if (this.r.f(v3) < g || this.r.q(v3) < g) {
                            j1(hzc, i4, i5);
                            return;
                        }
                    }
                }
            } else if (i >= 0) {
                int i6 = i - i2;
                int w3 = w();
                if (this.u) {
                    int i7 = w3 - 1;
                    for (int i8 = i7; i8 >= 0; i8--) {
                        View v4 = v(i8);
                        if (this.r.c(v4) > i6 || this.r.p(v4) > i6) {
                            j1(hzc, i7, i8);
                            return;
                        }
                    }
                    return;
                }
                for (int i9 = 0; i9 < w3; i9++) {
                    View v5 = v(i9);
                    if (this.r.c(v5) > i6 || this.r.p(v5) > i6) {
                        j1(hzc, 0, i9);
                        return;
                    }
                }
            }
        }
    }

    public final void j(int i, e13 e13) {
        int i2;
        boolean z2;
        bw7 bw7 = this.z;
        int i3 = -1;
        if (bw7 == null || (i2 = bw7.a) < 0) {
            k1();
            z2 = this.u;
            i2 = this.x;
            if (i2 == -1) {
                i2 = z2 ? i - 1 : 0;
            }
        } else {
            z2 = bw7.c;
        }
        if (!z2) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            e13.b(i2, 0);
            i2 += i3;
        }
    }

    public void j0(hzc hzc, lzc lzc) {
        View view;
        int i;
        int i2;
        List list;
        int i3;
        int i4;
        int b1;
        int i5;
        View r2;
        int f;
        int i6;
        View view2;
        View a1;
        int i7;
        int i8;
        hzc hzc2 = hzc;
        lzc lzc2 = lzc;
        int i9 = -1;
        if (!(this.z == null && this.x == -1) && lzc.b() == 0) {
            r0(hzc);
            return;
        }
        bw7 bw7 = this.z;
        if (bw7 != null && (i8 = bw7.a) >= 0) {
            this.x = i8;
        }
        Q0();
        this.q.a = false;
        k1();
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || this.a.M(view)) {
            view = null;
        }
        ad5 ad5 = this.A;
        if (!ad5.e || this.x != -1 || this.z != null) {
            ad5.e();
            ad5.d = this.u ^ this.v;
            if (!lzc2.h && (i7 = this.x) != -1) {
                if (i7 < 0 || i7 >= lzc.b()) {
                    this.x = -1;
                    this.y = IntCompanionObject.MIN_VALUE;
                } else {
                    int i10 = this.x;
                    ad5.b = i10;
                    bw7 bw72 = this.z;
                    if (bw72 == null || bw72.a < 0) {
                        if (this.y == Integer.MIN_VALUE) {
                            View r3 = r(i10);
                            if (r3 == null) {
                                if (w() > 0) {
                                    ad5.d = (this.x < a.M(v(0))) == this.u;
                                }
                                ad5.a();
                            } else if (this.r.d(r3) > this.r.n()) {
                                ad5.a();
                            } else if (this.r.f(r3) - this.r.m() < 0) {
                                ad5.c = this.r.m();
                                ad5.d = false;
                            } else if (this.r.h() - this.r.c(r3) < 0) {
                                ad5.c = this.r.h();
                                ad5.d = true;
                            } else {
                                ad5.c = ad5.d ? this.r.o() + this.r.c(r3) : this.r.f(r3);
                            }
                        } else {
                            boolean z2 = this.u;
                            ad5.d = z2;
                            if (z2) {
                                ad5.c = this.r.h() - this.y;
                            } else {
                                ad5.c = this.r.m() + this.y;
                            }
                        }
                        ad5.e = true;
                    } else {
                        boolean z3 = bw72.c;
                        ad5.d = z3;
                        if (z3) {
                            ad5.c = this.r.h() - this.z.b;
                        } else {
                            ad5.c = this.r.m() + this.z.b;
                        }
                        ad5.e = true;
                    }
                }
            }
            if (w() != 0) {
                RecyclerView recyclerView2 = this.b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || this.a.M(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    bzc bzc = (bzc) view2.getLayoutParams();
                    if (!bzc.a.B() && bzc.a.s() >= 0 && bzc.a.s() < lzc.b()) {
                        ad5.c(view2, a.M(view2));
                        ad5.e = true;
                    }
                }
                boolean z4 = this.s;
                boolean z5 = this.v;
                if (z4 == z5 && (a1 = a1(hzc2, lzc2, ad5.d, z5)) != null) {
                    ad5.b(a1, a.M(a1));
                    if (!lzc2.h && J0()) {
                        int f2 = this.r.f(a1);
                        int c = this.r.c(a1);
                        int m = this.r.m();
                        int h = this.r.h();
                        boolean z6 = c <= m && f2 < m;
                        boolean z7 = f2 >= h && c > h;
                        if (z6 || z7) {
                            if (ad5.d) {
                                m = h;
                            }
                            ad5.c = m;
                        }
                    }
                    ad5.e = true;
                }
            }
            ad5.a();
            ad5.b = this.v ? lzc.b() - 1 : 0;
            ad5.e = true;
        } else if (view != null && (this.r.f(view) >= this.r.h() || this.r.c(view) <= this.r.m())) {
            ad5.c(view, a.M(view));
        }
        aw7 aw7 = this.q;
        aw7.f = aw7.j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        K0(lzc2, iArr);
        int m2 = this.r.m() + Math.max(0, iArr[0]);
        int i11 = this.r.i() + Math.max(0, iArr[1]);
        if (!(!lzc2.h || (i5 = this.x) == -1 || this.y == Integer.MIN_VALUE || (r2 = r(i5)) == null)) {
            if (this.u) {
                i6 = this.r.h() - this.r.c(r2);
                f = this.y;
            } else {
                f = this.r.f(r2) - this.r.m();
                i6 = this.y;
            }
            int i12 = i6 - f;
            if (i12 > 0) {
                m2 += i12;
            } else {
                i11 -= i12;
            }
        }
        if (!ad5.d ? !this.u : this.u) {
            i9 = 1;
        }
        h1(hzc2, lzc2, ad5, i9);
        q(hzc);
        this.q.l = this.r.j() == 0 && this.r.g() == 0;
        this.q.getClass();
        this.q.i = 0;
        if (ad5.d) {
            r1(ad5.b, ad5.c);
            aw7 aw72 = this.q;
            aw72.h = m2;
            R0(hzc2, aw72, lzc2, false);
            aw7 aw73 = this.q;
            i2 = aw73.b;
            int i13 = aw73.d;
            int i14 = aw73.c;
            if (i14 > 0) {
                i11 += i14;
            }
            q1(ad5.b, ad5.c);
            aw7 aw74 = this.q;
            aw74.h = i11;
            aw74.d += aw74.e;
            R0(hzc2, aw74, lzc2, false);
            aw7 aw75 = this.q;
            i = aw75.b;
            int i15 = aw75.c;
            if (i15 > 0) {
                r1(i13, i2);
                aw7 aw76 = this.q;
                aw76.h = i15;
                R0(hzc2, aw76, lzc2, false);
                i2 = this.q.b;
            }
        } else {
            q1(ad5.b, ad5.c);
            aw7 aw77 = this.q;
            aw77.h = i11;
            R0(hzc2, aw77, lzc2, false);
            aw7 aw78 = this.q;
            i = aw78.b;
            int i16 = aw78.d;
            int i17 = aw78.c;
            if (i17 > 0) {
                m2 += i17;
            }
            r1(ad5.b, ad5.c);
            aw7 aw79 = this.q;
            aw79.h = m2;
            aw79.d += aw79.e;
            R0(hzc2, aw79, lzc2, false);
            aw7 aw710 = this.q;
            int i18 = aw710.b;
            int i19 = aw710.c;
            if (i19 > 0) {
                q1(i16, i);
                aw7 aw711 = this.q;
                aw711.h = i19;
                R0(hzc2, aw711, lzc2, false);
                i = this.q.b;
            }
            i2 = i18;
        }
        if (w() > 0) {
            if (this.u ^ this.v) {
                int b12 = b1(i, hzc2, lzc2, true);
                i3 = i2 + b12;
                i4 = i + b12;
                b1 = c1(i3, hzc2, lzc2, false);
            } else {
                int c1 = c1(i2, hzc2, lzc2, true);
                i3 = i2 + c1;
                i4 = i + c1;
                b1 = b1(i4, hzc2, lzc2, false);
            }
            i2 = i3 + b1;
            i = i4 + b1;
        }
        if (lzc2.l && w() != 0 && !lzc2.h && J0()) {
            List list2 = hzc2.d;
            int size = list2.size();
            int M = a.M(v(0));
            int i20 = 0;
            int i21 = 0;
            for (int i22 = 0; i22 < size; i22++) {
                pzc pzc = (pzc) list2.get(i22);
                if (!pzc.B()) {
                    boolean z8 = pzc.s() < M;
                    boolean z9 = this.u;
                    View view3 = pzc.a;
                    if (z8 != z9) {
                        i20 += this.r.d(view3);
                    } else {
                        i21 += this.r.d(view3);
                    }
                }
            }
            this.q.k = list2;
            if (i20 > 0) {
                r1(a.M(e1()), i2);
                aw7 aw712 = this.q;
                aw712.h = i20;
                aw712.c = 0;
                aw712.a((View) null);
                R0(hzc2, this.q, lzc2, false);
            }
            if (i21 > 0) {
                q1(a.M(d1()), i);
                aw7 aw713 = this.q;
                aw713.h = i21;
                aw713.c = 0;
                list = null;
                aw713.a((View) null);
                R0(hzc2, this.q, lzc2, false);
            } else {
                list = null;
            }
            this.q.k = list;
        }
        if (!lzc2.h) {
            vo7 vo7 = this.r;
            vo7.a = vo7.n();
        } else {
            ad5.e();
        }
        this.s = this.v;
    }

    public final void j1(hzc hzc, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    View v2 = v(i3);
                    if (v(i3) != null) {
                        this.a.S(i3);
                    }
                    hzc.g(v2);
                }
                return;
            }
            while (i > i2) {
                View v3 = v(i);
                if (v(i) != null) {
                    this.a.S(i);
                }
                hzc.g(v3);
                i--;
            }
        }
    }

    public final int k(lzc lzc) {
        return M0(lzc);
    }

    public void k0(lzc lzc) {
        this.z = null;
        this.x = -1;
        this.y = IntCompanionObject.MIN_VALUE;
        this.A.e();
    }

    public final void k1() {
        if (this.p == 1 || !f1()) {
            this.u = this.t;
        } else {
            this.u = !this.t;
        }
    }

    public int l(lzc lzc) {
        return N0(lzc);
    }

    public final void l0(Parcelable parcelable) {
        if (parcelable instanceof bw7) {
            bw7 bw7 = (bw7) parcelable;
            this.z = bw7;
            if (this.x != -1) {
                bw7.a = -1;
            }
            v0();
        }
    }

    public final int l1(int i, hzc hzc, lzc lzc) {
        if (w() == 0 || i == 0) {
            return 0;
        }
        Q0();
        this.q.a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        p1(i2, abs, true, lzc);
        aw7 aw7 = this.q;
        int R0 = R0(hzc, aw7, lzc, false) + aw7.g;
        if (R0 < 0) {
            return 0;
        }
        if (abs > R0) {
            i = i2 * R0;
        }
        this.r.r(-i);
        this.q.j = i;
        return i;
    }

    public int m(lzc lzc) {
        return O0(lzc);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.Parcelable, bw7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v7, types: [bw7, android.os.Parcelable, java.lang.Object] */
    public final Parcelable m0() {
        bw7 bw7 = this.z;
        if (bw7 != null) {
            ? obj = new Object();
            obj.a = bw7.a;
            obj.b = bw7.b;
            obj.c = bw7.c;
            return obj;
        }
        ? obj2 = new Object();
        if (w() > 0) {
            Q0();
            boolean z2 = this.s ^ this.u;
            obj2.c = z2;
            if (z2) {
                View d1 = d1();
                obj2.b = this.r.h() - this.r.c(d1);
                obj2.a = a.M(d1);
            } else {
                View e1 = e1();
                obj2.a = a.M(e1);
                obj2.b = this.r.f(e1) - this.r.m();
            }
        } else {
            obj2.a = -1;
        }
        return obj2;
    }

    public final void m1(int i, int i2) {
        this.x = i;
        this.y = i2;
        bw7 bw7 = this.z;
        if (bw7 != null) {
            bw7.a = -1;
        }
        v0();
    }

    public final int n(lzc lzc) {
        return M0(lzc);
    }

    public final void n1(int i) {
        if (i == 0 || i == 1) {
            c((String) null);
            if (i != this.p || this.r == null) {
                vo7 b = vo7.b(this, i);
                this.r = b;
                this.A.f = b;
                this.p = i;
                v0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(wj6.h(i, "invalid orientation:"));
    }

    public int o(lzc lzc) {
        return N0(lzc);
    }

    public void o1(boolean z2) {
        c((String) null);
        if (this.v != z2) {
            this.v = z2;
            v0();
        }
    }

    public int p(lzc lzc) {
        return O0(lzc);
    }

    public final void p1(int i, int i2, boolean z2, lzc lzc) {
        int i3;
        boolean z3 = false;
        int i4 = 1;
        this.q.l = this.r.j() == 0 && this.r.g() == 0;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        K0(lzc, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i == 1) {
            z3 = true;
        }
        aw7 aw7 = this.q;
        int i5 = z3 ? max2 : max;
        aw7.h = i5;
        if (!z3) {
            max = max2;
        }
        aw7.i = max;
        if (z3) {
            aw7.h = this.r.i() + i5;
            View d1 = d1();
            aw7 aw72 = this.q;
            if (this.u) {
                i4 = -1;
            }
            aw72.e = i4;
            int M = a.M(d1);
            aw7 aw73 = this.q;
            aw72.d = M + aw73.e;
            aw73.b = this.r.c(d1);
            i3 = this.r.c(d1) - this.r.h();
        } else {
            View e1 = e1();
            aw7 aw74 = this.q;
            aw74.h = this.r.m() + aw74.h;
            aw7 aw75 = this.q;
            if (!this.u) {
                i4 = -1;
            }
            aw75.e = i4;
            int M2 = a.M(e1);
            aw7 aw76 = this.q;
            aw75.d = M2 + aw76.e;
            aw76.b = this.r.f(e1);
            i3 = (-this.r.f(e1)) + this.r.m();
        }
        aw7 aw77 = this.q;
        aw77.c = i2;
        if (z2) {
            aw77.c = i2 - i3;
        }
        aw77.g = i3;
    }

    public final void q1(int i, int i2) {
        this.q.c = this.r.h() - i2;
        aw7 aw7 = this.q;
        aw7.e = this.u ? -1 : 1;
        aw7.d = i;
        aw7.f = 1;
        aw7.b = i2;
        aw7.g = IntCompanionObject.MIN_VALUE;
    }

    public final View r(int i) {
        int w2 = w();
        if (w2 == 0) {
            return null;
        }
        int M = i - a.M(v(0));
        if (M >= 0 && M < w2) {
            View v2 = v(M);
            if (a.M(v2) == i) {
                return v2;
            }
        }
        return super.r(i);
    }

    public final void r1(int i, int i2) {
        this.q.c = i2 - this.r.m();
        aw7 aw7 = this.q;
        aw7.d = i;
        aw7.e = this.u ? 1 : -1;
        aw7.f = -1;
        aw7.b = i2;
        aw7.g = IntCompanionObject.MIN_VALUE;
    }

    public bzc s() {
        return new bzc(-2, -2);
    }

    public int w0(int i, hzc hzc, lzc lzc) {
        if (this.p == 1) {
            return 0;
        }
        return l1(i, hzc, lzc);
    }

    public void x0(int i) {
        this.x = i;
        this.y = IntCompanionObject.MIN_VALUE;
        bw7 bw7 = this.z;
        if (bw7 != null) {
            bw7.a = -1;
        }
        v0();
    }

    public int y0(int i, hzc hzc, lzc lzc) {
        if (this.p == 0) {
            return 0;
        }
        return l1(i, hzc, lzc);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, zv7] */
    public LinearLayoutManager(int i, boolean z2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = IntCompanionObject.MIN_VALUE;
        this.z = null;
        this.A = new ad5();
        this.B = new Object();
        this.C = 2;
        this.D = new int[2];
        n1(i);
        c((String) null);
        if (z2 != this.t) {
            this.t = z2;
            v0();
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, zv7] */
    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = IntCompanionObject.MIN_VALUE;
        this.z = null;
        this.A = new ad5();
        this.B = new Object();
        this.C = 2;
        this.D = new int[2];
        azc N = a.N(context, attributeSet, i, i2);
        n1(N.a);
        boolean z2 = N.c;
        c((String) null);
        if (z2 != this.t) {
            this.t = z2;
            v0();
        }
        o1(N.d);
    }
}
