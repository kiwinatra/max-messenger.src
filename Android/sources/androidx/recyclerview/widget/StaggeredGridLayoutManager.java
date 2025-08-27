package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;

public class StaggeredGridLayoutManager extends a implements kzc {
    public int A;
    public final npg B;
    public final int C;
    public boolean D;
    public boolean E;
    public uie F;
    public final Rect G;
    public final d0a H;
    public final boolean I;
    public int[] J;
    public final tj7 K;
    public int p;
    public vie[] q;
    public final vo7 r;
    public final vo7 s;
    public final int t;
    public int u;
    public final fs7 v;
    public boolean w;
    public boolean x;
    public BitSet y;
    public int z;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.w = false;
        this.x = false;
        this.z = -1;
        this.A = IntCompanionObject.MIN_VALUE;
        this.B = new npg(23, false);
        this.C = 2;
        this.G = new Rect();
        this.H = new d0a(this);
        this.I = true;
        this.K = new tj7(28, this);
        azc N = a.N(context, attributeSet, i, i2);
        int i3 = N.a;
        if (i3 == 0 || i3 == 1) {
            c((String) null);
            if (i3 != this.t) {
                this.t = i3;
                vo7 vo7 = this.r;
                this.r = this.s;
                this.s = vo7;
                v0();
            }
            l1(N.b);
            boolean z2 = N.c;
            c((String) null);
            uie uie = this.F;
            if (!(uie == null || uie.y == z2)) {
                uie.y = z2;
            }
            this.w = z2;
            v0();
            this.v = new fs7();
            this.r = vo7.b(this, this.t);
            this.s = vo7.b(this, 1 - this.t);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public static int o1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    public final void B0(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int K2 = K() + J();
        int I2 = I() + L();
        if (this.t == 1) {
            int height = rect.height() + I2;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = gag.a;
            i4 = a.h(i2, height, recyclerView.getMinimumHeight());
            i3 = a.h(i, (this.u * this.p) + K2, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + K2;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = gag.a;
            i3 = a.h(i, width, recyclerView2.getMinimumWidth());
            i4 = a.h(i2, (this.u * this.p) + I2, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(i3, i4);
    }

    public final void H0(RecyclerView recyclerView, int i) {
        ew7 ew7 = new ew7(recyclerView.getContext());
        ew7.a = i;
        I0(ew7);
    }

    public final boolean J0() {
        return this.F == null;
    }

    public final int K0(int i) {
        if (w() == 0) {
            return this.x ? 1 : -1;
        }
        return (i < U0()) != this.x ? -1 : 1;
    }

    public final boolean L0() {
        int i;
        if (!(w() == 0 || this.C == 0 || !this.g)) {
            if (this.x) {
                i = V0();
                U0();
            } else {
                i = U0();
                V0();
            }
            npg npg = this.B;
            if (i == 0 && Z0() != null) {
                npg.w();
                this.f = true;
                v0();
                return true;
            }
        }
        return false;
    }

    public final int M0(lzc lzc) {
        if (w() == 0) {
            return 0;
        }
        vo7 vo7 = this.r;
        boolean z2 = this.I;
        return ld9.m(lzc, vo7, R0(!z2), Q0(!z2), this, this.I);
    }

    public final int N0(lzc lzc) {
        if (w() == 0) {
            return 0;
        }
        vo7 vo7 = this.r;
        boolean z2 = this.I;
        return ld9.n(lzc, vo7, R0(!z2), Q0(!z2), this, this.I, this.x);
    }

    public final int O0(lzc lzc) {
        if (w() == 0) {
            return 0;
        }
        vo7 vo7 = this.r;
        boolean z2 = this.I;
        return ld9.o(lzc, vo7, R0(!z2), Q0(!z2), this, this.I);
    }

    public final int P0(hzc hzc, fs7 fs7, lzc lzc) {
        int i;
        vie vie;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int m;
        int d;
        View view;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        hzc hzc2 = hzc;
        fs7 fs72 = fs7;
        int i10 = 0;
        int i11 = 1;
        this.y.set(0, this.p, true);
        fs7 fs73 = this.v;
        if (fs73.i) {
            i = fs72.e == 1 ? IntCompanionObject.MAX_VALUE : IntCompanionObject.MIN_VALUE;
        } else {
            i = fs72.e == 1 ? fs72.g + fs72.b : fs72.f - fs72.b;
        }
        int i12 = fs72.e;
        for (int i13 = 0; i13 < this.p; i13++) {
            if (!this.q[i13].a.isEmpty()) {
                n1(this.q[i13], i12, i);
            }
        }
        int h = this.x ? this.r.h() : this.r.m();
        int i14 = 0;
        while (true) {
            int i15 = fs72.c;
            if (((i15 < 0 || i15 >= lzc.b()) ? i10 : i11) == 0 || (!fs73.i && this.y.isEmpty())) {
                int i16 = i10;
            } else {
                View view2 = hzc2.j(fs72.c, LongCompanionObject.MAX_VALUE).a;
                fs72.c += fs72.d;
                sie sie = (sie) view2.getLayoutParams();
                int s2 = sie.a.s();
                npg npg = this.B;
                int[] iArr = (int[]) npg.b;
                int i17 = (iArr == null || s2 >= iArr.length) ? -1 : iArr[s2];
                if (i17 == -1) {
                    if (d1(fs72.e)) {
                        i9 = this.p - i11;
                        i8 = -1;
                        i7 = -1;
                    } else {
                        i8 = this.p;
                        i9 = i10;
                        i7 = i11;
                    }
                    vie vie2 = null;
                    if (fs72.e == i11) {
                        int m2 = this.r.m();
                        int i18 = IntCompanionObject.MAX_VALUE;
                        while (i9 != i8) {
                            vie vie3 = this.q[i9];
                            int f = vie3.f(m2);
                            if (f < i18) {
                                vie2 = vie3;
                                i18 = f;
                            }
                            i9 += i7;
                        }
                    } else {
                        int h2 = this.r.h();
                        int i19 = IntCompanionObject.MIN_VALUE;
                        while (i9 != i8) {
                            vie vie4 = this.q[i9];
                            int h3 = vie4.h(h2);
                            if (h3 > i19) {
                                vie2 = vie4;
                                i19 = h3;
                            }
                            i9 += i7;
                        }
                    }
                    vie = vie2;
                    npg.A(s2);
                    ((int[]) npg.b)[s2] = vie.e;
                } else {
                    vie = this.q[i17];
                }
                vie vie5 = vie;
                sie.v = vie5;
                if (fs72.e == 1) {
                    z2 = false;
                    b(-1, view2, false);
                } else {
                    z2 = false;
                    b(0, view2, false);
                }
                if (this.t == 1) {
                    i2 = 1;
                    b1(view2, a.x(z2, this.u, this.l, z2 ? 1 : 0, sie.width), a.x(true, this.o, this.m, I() + L(), sie.height));
                } else {
                    i2 = 1;
                    b1(view2, a.x(true, this.n, this.l, K() + J(), sie.width), a.x(false, this.u, this.m, 0, sie.height));
                }
                if (fs72.e == i2) {
                    int f2 = vie5.f(h);
                    i4 = f2;
                    i3 = this.r.d(view2) + f2;
                } else {
                    int h4 = vie5.h(h);
                    i3 = h4;
                    i4 = h4 - this.r.d(view2);
                }
                if (fs72.e == 1) {
                    vie vie6 = sie.v;
                    vie6.getClass();
                    sie sie2 = (sie) view2.getLayoutParams();
                    sie2.v = vie6;
                    ArrayList arrayList = vie6.a;
                    arrayList.add(view2);
                    vie6.c = IntCompanionObject.MIN_VALUE;
                    if (arrayList.size() == 1) {
                        vie6.b = IntCompanionObject.MIN_VALUE;
                    }
                    if (sie2.a.B() || sie2.a.G()) {
                        vie6.d = vie6.f.r.d(view2) + vie6.d;
                    }
                } else {
                    vie vie7 = sie.v;
                    vie7.getClass();
                    sie sie3 = (sie) view2.getLayoutParams();
                    sie3.v = vie7;
                    ArrayList arrayList2 = vie7.a;
                    arrayList2.add(0, view2);
                    vie7.b = IntCompanionObject.MIN_VALUE;
                    if (arrayList2.size() == 1) {
                        vie7.c = IntCompanionObject.MIN_VALUE;
                    }
                    if (sie3.a.B() || sie3.a.G()) {
                        vie7.d = vie7.f.r.d(view2) + vie7.d;
                    }
                }
                if (!a1() || this.t != 1) {
                    m = this.s.m() + (vie5.e * this.u);
                    d = this.s.d(view2) + m;
                } else {
                    d = this.s.h() - (((this.p - 1) - vie5.e) * this.u);
                    m = d - this.s.d(view2);
                }
                int i20 = d;
                int i21 = m;
                if (this.t == 1) {
                    i5 = 1;
                    view = view2;
                    S(view2, i21, i4, i20, i3);
                } else {
                    i5 = 1;
                    view = view2;
                    S(view, i4, i21, i3, i20);
                }
                n1(vie5, fs73.e, i);
                f1(hzc2, fs73);
                if (!fs73.h || !view.hasFocusable()) {
                    i6 = 0;
                } else {
                    i6 = 0;
                    this.y.set(vie5.e, false);
                }
                i10 = i6;
                i14 = i5;
                i11 = i14;
            }
        }
        int i162 = i10;
        if (i14 == 0) {
            f1(hzc2, fs73);
        }
        int m3 = fs73.e == -1 ? this.r.m() - X0(this.r.m()) : W0(this.r.h()) - this.r.h();
        return m3 > 0 ? Math.min(fs72.b, m3) : i162;
    }

    public final boolean Q() {
        return this.C != 0;
    }

    public final View Q0(boolean z2) {
        int m = this.r.m();
        int h = this.r.h();
        View view = null;
        for (int w2 = w() - 1; w2 >= 0; w2--) {
            View v2 = v(w2);
            int f = this.r.f(v2);
            int c = this.r.c(v2);
            if (c > m && f < h) {
                if (c <= h || !z2) {
                    return v2;
                }
                if (view == null) {
                    view = v2;
                }
            }
        }
        return view;
    }

    public final View R0(boolean z2) {
        int m = this.r.m();
        int h = this.r.h();
        int w2 = w();
        View view = null;
        for (int i = 0; i < w2; i++) {
            View v2 = v(i);
            int f = this.r.f(v2);
            if (this.r.c(v2) > m && f < h) {
                if (f >= m || !z2) {
                    return v2;
                }
                if (view == null) {
                    view = v2;
                }
            }
        }
        return view;
    }

    public final void S0(hzc hzc, lzc lzc, boolean z2) {
        int h;
        int W0 = W0(IntCompanionObject.MIN_VALUE);
        if (W0 != Integer.MIN_VALUE && (h = this.r.h() - W0) > 0) {
            int i = h - (-j1(-h, hzc, lzc));
            if (z2 && i > 0) {
                this.r.r(i);
            }
        }
    }

    public final void T(int i) {
        super.T(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            vie vie = this.q[i2];
            int i3 = vie.b;
            if (i3 != Integer.MIN_VALUE) {
                vie.b = i3 + i;
            }
            int i4 = vie.c;
            if (i4 != Integer.MIN_VALUE) {
                vie.c = i4 + i;
            }
        }
    }

    public final void T0(hzc hzc, lzc lzc, boolean z2) {
        int m;
        int X0 = X0(IntCompanionObject.MAX_VALUE);
        if (X0 != Integer.MAX_VALUE && (m = X0 - this.r.m()) > 0) {
            int j1 = m - j1(m, hzc, lzc);
            if (z2 && j1 > 0) {
                this.r.r(-j1);
            }
        }
    }

    public final void U(int i) {
        super.U(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            vie vie = this.q[i2];
            int i3 = vie.b;
            if (i3 != Integer.MIN_VALUE) {
                vie.b = i3 + i;
            }
            int i4 = vie.c;
            if (i4 != Integer.MIN_VALUE) {
                vie.c = i4 + i;
            }
        }
    }

    public final int U0() {
        if (w() == 0) {
            return 0;
        }
        return a.M(v(0));
    }

    public final void V() {
        this.B.w();
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
    }

    public final int V0() {
        int w2 = w();
        if (w2 == 0) {
            return 0;
        }
        return a.M(v(w2 - 1));
    }

    public final int W0(int i) {
        int f = this.q[0].f(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int f2 = this.q[i2].f(i);
            if (f2 > f) {
                f = f2;
            }
        }
        return f;
    }

    public final void X(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
        recyclerView.requestLayout();
    }

    public final int X0(int i) {
        int h = this.q[0].h(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int h2 = this.q[i2].h(i);
            if (h2 < h) {
                h = h2;
            }
        }
        return h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004b, code lost:
        if (r8.t == 1) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0050, code lost:
        if (r8.t == 0) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005d, code lost:
        if (a1() == false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006a, code lost:
        if (a1() == false) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x006f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View Y(android.view.View r9, int r10, defpackage.hzc r11, defpackage.lzc r12) {
        /*
            r8 = this;
            int r0 = r8.w()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            androidx.recyclerview.widget.RecyclerView r0 = r8.b
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            r9 = r1
            goto L_0x001e
        L_0x000e:
            android.view.View r9 = r0.I(r9)
            if (r9 != 0) goto L_0x0015
            goto L_0x000c
        L_0x0015:
            mqf r0 = r8.a
            boolean r0 = r0.M(r9)
            if (r0 == 0) goto L_0x001e
            goto L_0x000c
        L_0x001e:
            if (r9 != 0) goto L_0x0021
            return r1
        L_0x0021:
            r8.i1()
            r0 = 1
            r2 = -1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r0) goto L_0x0061
            r4 = 2
            if (r10 == r4) goto L_0x0053
            r4 = 17
            if (r10 == r4) goto L_0x004e
            r4 = 33
            if (r10 == r4) goto L_0x0049
            r4 = 66
            if (r10 == r4) goto L_0x0044
            r4 = 130(0x82, float:1.82E-43)
            if (r10 == r4) goto L_0x003f
        L_0x003d:
            r10 = r3
            goto L_0x006d
        L_0x003f:
            int r10 = r8.t
            if (r10 != r0) goto L_0x003d
            goto L_0x0057
        L_0x0044:
            int r10 = r8.t
            if (r10 != 0) goto L_0x003d
            goto L_0x0057
        L_0x0049:
            int r10 = r8.t
            if (r10 != r0) goto L_0x003d
            goto L_0x005f
        L_0x004e:
            int r10 = r8.t
            if (r10 != 0) goto L_0x003d
            goto L_0x005f
        L_0x0053:
            int r10 = r8.t
            if (r10 != r0) goto L_0x0059
        L_0x0057:
            r10 = r0
            goto L_0x006d
        L_0x0059:
            boolean r10 = r8.a1()
            if (r10 == 0) goto L_0x0057
        L_0x005f:
            r10 = r2
            goto L_0x006d
        L_0x0061:
            int r10 = r8.t
            if (r10 != r0) goto L_0x0066
            goto L_0x005f
        L_0x0066:
            boolean r10 = r8.a1()
            if (r10 == 0) goto L_0x005f
            goto L_0x0057
        L_0x006d:
            if (r10 != r3) goto L_0x0070
            return r1
        L_0x0070:
            android.view.ViewGroup$LayoutParams r3 = r9.getLayoutParams()
            sie r3 = (defpackage.sie) r3
            r3.getClass()
            vie r3 = r3.v
            if (r10 != r0) goto L_0x0082
            int r4 = r8.V0()
            goto L_0x0086
        L_0x0082:
            int r4 = r8.U0()
        L_0x0086:
            r8.m1(r4, r12)
            r8.k1(r10)
            fs7 r5 = r8.v
            int r6 = r5.d
            int r6 = r6 + r4
            r5.c = r6
            vo7 r6 = r8.r
            int r6 = r6.n()
            float r6 = (float) r6
            r7 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r6 = r6 * r7
            int r6 = (int) r6
            r5.b = r6
            r5.h = r0
            r6 = 0
            r5.a = r6
            r8.P0(r11, r5, r12)
            boolean r11 = r8.x
            r8.D = r11
            android.view.View r11 = r3.g(r4, r10)
            if (r11 == 0) goto L_0x00b6
            if (r11 == r9) goto L_0x00b6
            return r11
        L_0x00b6:
            boolean r11 = r8.d1(r10)
            if (r11 == 0) goto L_0x00d1
            int r11 = r8.p
            int r11 = r11 - r0
        L_0x00bf:
            if (r11 < 0) goto L_0x00e6
            vie[] r12 = r8.q
            r12 = r12[r11]
            android.view.View r12 = r12.g(r4, r10)
            if (r12 == 0) goto L_0x00ce
            if (r12 == r9) goto L_0x00ce
            return r12
        L_0x00ce:
            int r11 = r11 + -1
            goto L_0x00bf
        L_0x00d1:
            r11 = r6
        L_0x00d2:
            int r12 = r8.p
            if (r11 >= r12) goto L_0x00e6
            vie[] r12 = r8.q
            r12 = r12[r11]
            android.view.View r12 = r12.g(r4, r10)
            if (r12 == 0) goto L_0x00e3
            if (r12 == r9) goto L_0x00e3
            return r12
        L_0x00e3:
            int r11 = r11 + 1
            goto L_0x00d2
        L_0x00e6:
            boolean r11 = r8.w
            r11 = r11 ^ r0
            if (r10 != r2) goto L_0x00ed
            r12 = r0
            goto L_0x00ee
        L_0x00ed:
            r12 = r6
        L_0x00ee:
            if (r11 != r12) goto L_0x00f2
            r11 = r0
            goto L_0x00f3
        L_0x00f2:
            r11 = r6
        L_0x00f3:
            if (r11 == 0) goto L_0x00fa
            int r12 = r3.c()
            goto L_0x00fe
        L_0x00fa:
            int r12 = r3.d()
        L_0x00fe:
            android.view.View r12 = r8.r(r12)
            if (r12 == 0) goto L_0x0107
            if (r12 == r9) goto L_0x0107
            return r12
        L_0x0107:
            boolean r10 = r8.d1(r10)
            if (r10 == 0) goto L_0x0136
            int r10 = r8.p
            int r10 = r10 - r0
        L_0x0110:
            if (r10 < 0) goto L_0x0159
            int r12 = r3.e
            if (r10 != r12) goto L_0x0117
            goto L_0x0133
        L_0x0117:
            if (r11 == 0) goto L_0x0122
            vie[] r12 = r8.q
            r12 = r12[r10]
            int r12 = r12.c()
            goto L_0x012a
        L_0x0122:
            vie[] r12 = r8.q
            r12 = r12[r10]
            int r12 = r12.d()
        L_0x012a:
            android.view.View r12 = r8.r(r12)
            if (r12 == 0) goto L_0x0133
            if (r12 == r9) goto L_0x0133
            return r12
        L_0x0133:
            int r10 = r10 + -1
            goto L_0x0110
        L_0x0136:
            int r10 = r8.p
            if (r6 >= r10) goto L_0x0159
            if (r11 == 0) goto L_0x0145
            vie[] r10 = r8.q
            r10 = r10[r6]
            int r10 = r10.c()
            goto L_0x014d
        L_0x0145:
            vie[] r10 = r8.q
            r10 = r10[r6]
            int r10 = r10.d()
        L_0x014d:
            android.view.View r10 = r8.r(r10)
            if (r10 == 0) goto L_0x0156
            if (r10 == r9) goto L_0x0156
            return r10
        L_0x0156:
            int r6 = r6 + 1
            goto L_0x0136
        L_0x0159:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Y(android.view.View, int, hzc, lzc):android.view.View");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Y0(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.x
            if (r0 == 0) goto L_0x0009
            int r0 = r7.V0()
            goto L_0x000d
        L_0x0009:
            int r0 = r7.U0()
        L_0x000d:
            r1 = 8
            if (r10 != r1) goto L_0x001b
            if (r8 >= r9) goto L_0x0017
            int r2 = r9 + 1
        L_0x0015:
            r3 = r8
            goto L_0x001e
        L_0x0017:
            int r2 = r8 + 1
            r3 = r9
            goto L_0x001e
        L_0x001b:
            int r2 = r8 + r9
            goto L_0x0015
        L_0x001e:
            npg r4 = r7.B
            r4.K(r3)
            r5 = 1
            if (r10 == r5) goto L_0x0037
            r6 = 2
            if (r10 == r6) goto L_0x0033
            if (r10 == r1) goto L_0x002c
            goto L_0x003a
        L_0x002c:
            r4.M(r8, r5)
            r4.L(r9, r5)
            goto L_0x003a
        L_0x0033:
            r4.M(r8, r9)
            goto L_0x003a
        L_0x0037:
            r4.L(r8, r9)
        L_0x003a:
            if (r2 > r0) goto L_0x003d
            return
        L_0x003d:
            boolean r8 = r7.x
            if (r8 == 0) goto L_0x0046
            int r8 = r7.U0()
            goto L_0x004a
        L_0x0046:
            int r8 = r7.V0()
        L_0x004a:
            if (r3 > r8) goto L_0x004f
            r7.v0()
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Y0(int, int, int):void");
    }

    public final void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (w() > 0) {
            View R0 = R0(false);
            View Q0 = Q0(false);
            if (R0 != null && Q0 != null) {
                int M = a.M(R0);
                int M2 = a.M(Q0);
                if (M < M2) {
                    accessibilityEvent.setFromIndex(M);
                    accessibilityEvent.setToIndex(M2);
                    return;
                }
                accessibilityEvent.setFromIndex(M2);
                accessibilityEvent.setToIndex(M);
            }
        }
    }

    public final View Z0() {
        int w2 = w();
        int i = w2 - 1;
        BitSet bitSet = new BitSet(this.p);
        bitSet.set(0, this.p, true);
        int i2 = -1;
        char c = (this.t != 1 || !a1()) ? (char) 65535 : 1;
        if (this.x) {
            w2 = -1;
        } else {
            i = 0;
        }
        if (i < w2) {
            i2 = 1;
        }
        while (i != w2) {
            View v2 = v(i);
            sie sie = (sie) v2.getLayoutParams();
            if (bitSet.get(sie.v.e)) {
                vie vie = sie.v;
                if (this.x) {
                    int i3 = vie.c;
                    if (i3 == Integer.MIN_VALUE) {
                        vie.a();
                        i3 = vie.c;
                    }
                    if (i3 < this.r.h()) {
                        ((sie) ((View) a81.h(1, vie.a)).getLayoutParams()).getClass();
                    }
                    bitSet.clear(sie.v.e);
                } else {
                    int i4 = vie.b;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = (View) vie.a.get(0);
                        vie.b = vie.f.r.f(view);
                        ((sie) view.getLayoutParams()).getClass();
                        i4 = vie.b;
                    }
                    if (i4 > this.r.m()) {
                        ((sie) ((View) vie.a.get(0)).getLayoutParams()).getClass();
                    }
                    bitSet.clear(sie.v.e);
                }
                return v2;
            }
            i += i2;
            if (i != w2) {
                View v3 = v(i);
                if (this.x) {
                    int c2 = this.r.c(v2);
                    int c3 = this.r.c(v3);
                    if (c2 < c3) {
                        return v2;
                    }
                    if (c2 != c3) {
                        continue;
                    }
                } else {
                    int f = this.r.f(v2);
                    int f2 = this.r.f(v3);
                    if (f > f2) {
                        return v2;
                    }
                    if (f != f2) {
                        continue;
                    }
                }
                if ((sie.v.e - ((sie) v3.getLayoutParams()).v.e < 0) != (c < 0)) {
                    return v2;
                }
            }
        }
        return null;
    }

    public final PointF a(int i) {
        int K0 = K0(i);
        PointF pointF = new PointF();
        if (K0 == 0) {
            return null;
        }
        if (this.t == 0) {
            pointF.x = (float) K0;
            pointF.y = c44.DEFAULT_ASPECT_RATIO;
        } else {
            pointF.x = c44.DEFAULT_ASPECT_RATIO;
            pointF.y = (float) K0;
        }
        return pointF;
    }

    public final boolean a1() {
        return H() == 1;
    }

    public final void b1(View view, int i, int i2) {
        Rect rect = this.G;
        d(rect, view);
        sie sie = (sie) view.getLayoutParams();
        int o1 = o1(i, sie.leftMargin + rect.left, sie.rightMargin + rect.right);
        int o12 = o1(i2, sie.topMargin + rect.top, sie.bottomMargin + rect.bottom);
        if (E0(view, o1, o12, sie)) {
            view.measure(o1, o12);
        }
    }

    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:231:0x040c, code lost:
        if (L0() != false) goto L_0x0410;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c1(defpackage.hzc r17, defpackage.lzc r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            uie r3 = r0.F
            r4 = -1
            d0a r5 = r0.H
            if (r3 != 0) goto L_0x0011
            int r3 = r0.z
            if (r3 == r4) goto L_0x001e
        L_0x0011:
            int r3 = r18.b()
            if (r3 != 0) goto L_0x001e
            r16.r0(r17)
            r5.c()
            return
        L_0x001e:
            boolean r3 = r5.e
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L_0x002f
            int r3 = r0.z
            if (r3 != r4) goto L_0x002f
            uie r3 = r0.F
            if (r3 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r3 = r6
            goto L_0x0030
        L_0x002f:
            r3 = r7
        L_0x0030:
            npg r8 = r0.B
            java.lang.Object r9 = r5.g
            androidx.recyclerview.widget.StaggeredGridLayoutManager r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r9
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == 0) goto L_0x0210
            r5.c()
            uie r11 = r0.F
            if (r11 == 0) goto L_0x00c5
            int r12 = r11.c
            r13 = 0
            if (r12 <= 0) goto L_0x008a
            int r14 = r0.p
            if (r12 != r14) goto L_0x007c
            r11 = r6
        L_0x004b:
            int r12 = r0.p
            if (r11 >= r12) goto L_0x008a
            vie[] r12 = r0.q
            r12 = r12[r11]
            r12.b()
            uie r12 = r0.F
            int[] r14 = r12.o
            r14 = r14[r11]
            if (r14 == r10) goto L_0x0071
            boolean r12 = r12.z
            if (r12 == 0) goto L_0x006a
            vo7 r12 = r0.r
            int r12 = r12.h()
        L_0x0068:
            int r14 = r14 + r12
            goto L_0x0071
        L_0x006a:
            vo7 r12 = r0.r
            int r12 = r12.m()
            goto L_0x0068
        L_0x0071:
            vie[] r12 = r0.q
            r12 = r12[r11]
            r12.b = r14
            r12.c = r14
            int r11 = r11 + 1
            goto L_0x004b
        L_0x007c:
            r11.o = r13
            r11.c = r6
            r11.v = r6
            r11.w = r13
            r11.x = r13
            int r12 = r11.b
            r11.a = r12
        L_0x008a:
            uie r11 = r0.F
            boolean r12 = r11.X
            r0.E = r12
            boolean r11 = r11.y
            r0.c(r13)
            uie r12 = r0.F
            if (r12 == 0) goto L_0x009f
            boolean r13 = r12.y
            if (r13 == r11) goto L_0x009f
            r12.y = r11
        L_0x009f:
            r0.w = r11
            r16.v0()
            r16.i1()
            uie r11 = r0.F
            int r12 = r11.a
            if (r12 == r4) goto L_0x00b4
            r0.z = r12
            boolean r12 = r11.z
            r5.c = r12
            goto L_0x00b8
        L_0x00b4:
            boolean r12 = r0.x
            r5.c = r12
        L_0x00b8:
            int r12 = r11.v
            if (r12 <= r7) goto L_0x00cc
            int[] r12 = r11.w
            r8.b = r12
            java.util.List r11 = r11.x
            r8.c = r11
            goto L_0x00cc
        L_0x00c5:
            r16.i1()
            boolean r11 = r0.x
            r5.c = r11
        L_0x00cc:
            boolean r11 = r2.h
            if (r11 != 0) goto L_0x01cd
            int r11 = r0.z
            if (r11 != r4) goto L_0x00d6
            goto L_0x01cd
        L_0x00d6:
            if (r11 < 0) goto L_0x01c9
            int r12 = r18.b()
            if (r11 < r12) goto L_0x00e0
            goto L_0x01c9
        L_0x00e0:
            uie r11 = r0.F
            if (r11 == 0) goto L_0x00f5
            int r12 = r11.a
            if (r12 == r4) goto L_0x00f5
            int r11 = r11.c
            if (r11 >= r7) goto L_0x00ed
            goto L_0x00f5
        L_0x00ed:
            r5.b = r10
            int r11 = r0.z
            r5.a = r11
            goto L_0x020e
        L_0x00f5:
            int r11 = r0.z
            android.view.View r11 = r0.r(r11)
            if (r11 == 0) goto L_0x018a
            boolean r12 = r0.x
            if (r12 == 0) goto L_0x0106
            int r12 = r16.V0()
            goto L_0x010a
        L_0x0106:
            int r12 = r16.U0()
        L_0x010a:
            r5.a = r12
            int r12 = r0.A
            if (r12 == r10) goto L_0x013c
            boolean r12 = r5.c
            if (r12 == 0) goto L_0x0128
            vo7 r12 = r0.r
            int r12 = r12.h()
            int r13 = r0.A
            int r12 = r12 - r13
            vo7 r13 = r0.r
            int r11 = r13.c(r11)
            int r12 = r12 - r11
            r5.b = r12
            goto L_0x020e
        L_0x0128:
            vo7 r12 = r0.r
            int r12 = r12.m()
            int r13 = r0.A
            int r12 = r12 + r13
            vo7 r13 = r0.r
            int r11 = r13.f(r11)
            int r12 = r12 - r11
            r5.b = r12
            goto L_0x020e
        L_0x013c:
            vo7 r12 = r0.r
            int r12 = r12.d(r11)
            vo7 r13 = r0.r
            int r13 = r13.n()
            if (r12 <= r13) goto L_0x015f
            boolean r11 = r5.c
            if (r11 == 0) goto L_0x0155
            vo7 r11 = r0.r
            int r11 = r11.h()
            goto L_0x015b
        L_0x0155:
            vo7 r11 = r0.r
            int r11 = r11.m()
        L_0x015b:
            r5.b = r11
            goto L_0x020e
        L_0x015f:
            vo7 r12 = r0.r
            int r12 = r12.f(r11)
            vo7 r13 = r0.r
            int r13 = r13.m()
            int r12 = r12 - r13
            if (r12 >= 0) goto L_0x0173
            int r11 = -r12
            r5.b = r11
            goto L_0x020e
        L_0x0173:
            vo7 r12 = r0.r
            int r12 = r12.h()
            vo7 r13 = r0.r
            int r11 = r13.c(r11)
            int r12 = r12 - r11
            if (r12 >= 0) goto L_0x0186
            r5.b = r12
            goto L_0x020e
        L_0x0186:
            r5.b = r10
            goto L_0x020e
        L_0x018a:
            int r11 = r0.z
            r5.a = r11
            int r12 = r0.A
            if (r12 != r10) goto L_0x01af
            int r11 = r0.K0(r11)
            if (r11 != r7) goto L_0x019a
            r11 = r7
            goto L_0x019b
        L_0x019a:
            r11 = r6
        L_0x019b:
            r5.c = r11
            if (r11 == 0) goto L_0x01a6
            vo7 r11 = r9.r
            int r11 = r11.h()
            goto L_0x01ac
        L_0x01a6:
            vo7 r11 = r9.r
            int r11 = r11.m()
        L_0x01ac:
            r5.b = r11
            goto L_0x01c6
        L_0x01af:
            boolean r11 = r5.c
            if (r11 == 0) goto L_0x01bd
            vo7 r11 = r9.r
            int r11 = r11.h()
            int r11 = r11 - r12
            r5.b = r11
            goto L_0x01c6
        L_0x01bd:
            vo7 r11 = r9.r
            int r11 = r11.m()
            int r11 = r11 + r12
            r5.b = r11
        L_0x01c6:
            r5.d = r7
            goto L_0x020e
        L_0x01c9:
            r0.z = r4
            r0.A = r10
        L_0x01cd:
            boolean r11 = r0.D
            if (r11 == 0) goto L_0x01ee
            int r11 = r18.b()
            int r12 = r16.w()
            int r12 = r12 - r7
        L_0x01da:
            if (r12 < 0) goto L_0x01ec
            android.view.View r13 = r0.v(r12)
            int r13 = androidx.recyclerview.widget.a.M(r13)
            if (r13 < 0) goto L_0x01e9
            if (r13 >= r11) goto L_0x01e9
            goto L_0x020a
        L_0x01e9:
            int r12 = r12 + -1
            goto L_0x01da
        L_0x01ec:
            r13 = r6
            goto L_0x020a
        L_0x01ee:
            int r11 = r18.b()
            int r12 = r16.w()
            r13 = r6
        L_0x01f7:
            if (r13 >= r12) goto L_0x01ec
            android.view.View r14 = r0.v(r13)
            int r14 = androidx.recyclerview.widget.a.M(r14)
            if (r14 < 0) goto L_0x0207
            if (r14 >= r11) goto L_0x0207
            r13 = r14
            goto L_0x020a
        L_0x0207:
            int r13 = r13 + 1
            goto L_0x01f7
        L_0x020a:
            r5.a = r13
            r5.b = r10
        L_0x020e:
            r5.e = r7
        L_0x0210:
            uie r11 = r0.F
            if (r11 != 0) goto L_0x022b
            int r11 = r0.z
            if (r11 != r4) goto L_0x022b
            boolean r11 = r5.c
            boolean r12 = r0.D
            if (r11 != r12) goto L_0x0226
            boolean r11 = r16.a1()
            boolean r12 = r0.E
            if (r11 == r12) goto L_0x022b
        L_0x0226:
            r8.w()
            r5.d = r7
        L_0x022b:
            int r8 = r16.w()
            if (r8 <= 0) goto L_0x02de
            uie r8 = r0.F
            if (r8 == 0) goto L_0x0239
            int r8 = r8.c
            if (r8 >= r7) goto L_0x02de
        L_0x0239:
            boolean r8 = r5.d
            if (r8 == 0) goto L_0x0258
            r3 = r6
        L_0x023e:
            int r8 = r0.p
            if (r3 >= r8) goto L_0x02de
            vie[] r8 = r0.q
            r8 = r8[r3]
            r8.b()
            int r8 = r5.b
            if (r8 == r10) goto L_0x0255
            vie[] r9 = r0.q
            r9 = r9[r3]
            r9.b = r8
            r9.c = r8
        L_0x0255:
            int r3 = r3 + 1
            goto L_0x023e
        L_0x0258:
            if (r3 != 0) goto L_0x027a
            java.lang.Object r3 = r5.f
            int[] r3 = (int[]) r3
            if (r3 != 0) goto L_0x0261
            goto L_0x027a
        L_0x0261:
            r3 = r6
        L_0x0262:
            int r8 = r0.p
            if (r3 >= r8) goto L_0x02de
            vie[] r8 = r0.q
            r8 = r8[r3]
            r8.b()
            java.lang.Object r9 = r5.f
            int[] r9 = (int[]) r9
            r9 = r9[r3]
            r8.b = r9
            r8.c = r9
            int r3 = r3 + 1
            goto L_0x0262
        L_0x027a:
            r3 = r6
        L_0x027b:
            int r8 = r0.p
            if (r3 >= r8) goto L_0x02b9
            vie[] r8 = r0.q
            r8 = r8[r3]
            boolean r11 = r0.x
            int r12 = r5.b
            if (r11 == 0) goto L_0x028e
            int r13 = r8.f(r10)
            goto L_0x0292
        L_0x028e:
            int r13 = r8.h(r10)
        L_0x0292:
            r8.b()
            if (r13 != r10) goto L_0x0298
            goto L_0x02b6
        L_0x0298:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r14 = r8.f
            if (r11 == 0) goto L_0x02a4
            vo7 r15 = r14.r
            int r15 = r15.h()
            if (r13 < r15) goto L_0x02b6
        L_0x02a4:
            if (r11 != 0) goto L_0x02af
            vo7 r11 = r14.r
            int r11 = r11.m()
            if (r13 <= r11) goto L_0x02af
            goto L_0x02b6
        L_0x02af:
            if (r12 == r10) goto L_0x02b2
            int r13 = r13 + r12
        L_0x02b2:
            r8.c = r13
            r8.b = r13
        L_0x02b6:
            int r3 = r3 + 1
            goto L_0x027b
        L_0x02b9:
            vie[] r3 = r0.q
            int r8 = r3.length
            java.lang.Object r11 = r5.f
            int[] r11 = (int[]) r11
            if (r11 == 0) goto L_0x02c5
            int r11 = r11.length
            if (r11 >= r8) goto L_0x02cc
        L_0x02c5:
            vie[] r9 = r9.q
            int r9 = r9.length
            int[] r9 = new int[r9]
            r5.f = r9
        L_0x02cc:
            r9 = r6
        L_0x02cd:
            if (r9 >= r8) goto L_0x02de
            java.lang.Object r11 = r5.f
            int[] r11 = (int[]) r11
            r12 = r3[r9]
            int r12 = r12.h(r10)
            r11[r9] = r12
            int r9 = r9 + 1
            goto L_0x02cd
        L_0x02de:
            r16.q(r17)
            fs7 r3 = r0.v
            r3.a = r6
            vo7 r8 = r0.s
            int r8 = r8.n()
            int r9 = r0.p
            int r9 = r8 / r9
            r0.u = r9
            vo7 r9 = r0.s
            int r9 = r9.j()
            android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            int r8 = r5.a
            r0.m1(r8, r2)
            boolean r8 = r5.c
            if (r8 == 0) goto L_0x0317
            r0.k1(r4)
            r0.P0(r1, r3, r2)
            r0.k1(r7)
            int r4 = r5.a
            int r8 = r3.d
            int r4 = r4 + r8
            r3.c = r4
            r0.P0(r1, r3, r2)
            goto L_0x032a
        L_0x0317:
            r0.k1(r7)
            r0.P0(r1, r3, r2)
            r0.k1(r4)
            int r4 = r5.a
            int r8 = r3.d
            int r4 = r4 + r8
            r3.c = r4
            r0.P0(r1, r3, r2)
        L_0x032a:
            vo7 r3 = r0.s
            int r3 = r3.j()
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 != r4) goto L_0x0336
            goto L_0x03d2
        L_0x0336:
            int r3 = r16.w()
            r4 = 0
            r8 = r6
        L_0x033c:
            if (r8 >= r3) goto L_0x035e
            android.view.View r9 = r0.v(r8)
            vo7 r11 = r0.s
            int r11 = r11.d(r9)
            float r11 = (float) r11
            int r12 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r12 >= 0) goto L_0x034e
            goto L_0x035b
        L_0x034e:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            sie r9 = (defpackage.sie) r9
            r9.getClass()
            float r4 = java.lang.Math.max(r4, r11)
        L_0x035b:
            int r8 = r8 + 1
            goto L_0x033c
        L_0x035e:
            int r8 = r0.u
            int r9 = r0.p
            float r9 = (float) r9
            float r4 = r4 * r9
            int r4 = java.lang.Math.round(r4)
            vo7 r9 = r0.s
            int r9 = r9.j()
            if (r9 != r10) goto L_0x037a
            vo7 r9 = r0.s
            int r9 = r9.n()
            int r4 = java.lang.Math.min(r4, r9)
        L_0x037a:
            int r9 = r0.p
            int r9 = r4 / r9
            r0.u = r9
            vo7 r9 = r0.s
            int r9 = r9.j()
            android.view.View.MeasureSpec.makeMeasureSpec(r4, r9)
            int r4 = r0.u
            if (r4 != r8) goto L_0x038e
            goto L_0x03d2
        L_0x038e:
            r4 = r6
        L_0x038f:
            if (r4 >= r3) goto L_0x03d2
            android.view.View r9 = r0.v(r4)
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            sie r10 = (defpackage.sie) r10
            r10.getClass()
            boolean r11 = r16.a1()
            if (r11 == 0) goto L_0x03ba
            int r11 = r0.t
            if (r11 != r7) goto L_0x03ba
            int r11 = r0.p
            int r11 = r11 - r7
            vie r10 = r10.v
            int r10 = r10.e
            int r11 = r11 - r10
            int r10 = -r11
            int r11 = r0.u
            int r11 = r11 * r10
            int r10 = r10 * r8
            int r11 = r11 - r10
            r9.offsetLeftAndRight(r11)
            goto L_0x03cf
        L_0x03ba:
            vie r10 = r10.v
            int r10 = r10.e
            int r11 = r0.u
            int r11 = r11 * r10
            int r10 = r10 * r8
            int r12 = r0.t
            if (r12 != r7) goto L_0x03cb
            int r11 = r11 - r10
            r9.offsetLeftAndRight(r11)
            goto L_0x03cf
        L_0x03cb:
            int r11 = r11 - r10
            r9.offsetTopAndBottom(r11)
        L_0x03cf:
            int r4 = r4 + 1
            goto L_0x038f
        L_0x03d2:
            int r3 = r16.w()
            if (r3 <= 0) goto L_0x03e9
            boolean r3 = r0.x
            if (r3 == 0) goto L_0x03e3
            r0.S0(r1, r2, r7)
            r0.T0(r1, r2, r6)
            goto L_0x03e9
        L_0x03e3:
            r0.T0(r1, r2, r7)
            r0.S0(r1, r2, r6)
        L_0x03e9:
            if (r19 == 0) goto L_0x040f
            boolean r3 = r2.h
            if (r3 != 0) goto L_0x040f
            int r3 = r0.C
            if (r3 == 0) goto L_0x040f
            int r3 = r16.w()
            if (r3 <= 0) goto L_0x040f
            android.view.View r3 = r16.Z0()
            if (r3 == 0) goto L_0x040f
            androidx.recyclerview.widget.RecyclerView r3 = r0.b
            if (r3 == 0) goto L_0x0408
            tj7 r4 = r0.K
            r3.removeCallbacks(r4)
        L_0x0408:
            boolean r3 = r16.L0()
            if (r3 == 0) goto L_0x040f
            goto L_0x0410
        L_0x040f:
            r7 = r6
        L_0x0410:
            boolean r3 = r2.h
            if (r3 == 0) goto L_0x0417
            r5.c()
        L_0x0417:
            boolean r3 = r5.c
            r0.D = r3
            boolean r3 = r16.a1()
            r0.E = r3
            if (r7 == 0) goto L_0x0429
            r5.c()
            r0.c1(r1, r2, r6)
        L_0x0429:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.c1(hzc, lzc, boolean):void");
    }

    public final void d0(int i, int i2) {
        Y0(i, i2, 1);
    }

    public final boolean d1(int i) {
        if (this.t == 0) {
            return (i == -1) != this.x;
        }
        return ((i == -1) == this.x) == a1();
    }

    public final boolean e() {
        return this.t == 0;
    }

    public final void e0() {
        this.B.w();
        v0();
    }

    public final void e1(int i, lzc lzc) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = V0();
            i2 = 1;
        } else {
            i3 = U0();
            i2 = -1;
        }
        fs7 fs7 = this.v;
        fs7.a = true;
        m1(i3, lzc);
        k1(i2);
        fs7.c = i3 + fs7.d;
        fs7.b = Math.abs(i);
    }

    public final boolean f() {
        return this.t == 1;
    }

    public final void f0(int i, int i2) {
        Y0(i, i2, 8);
    }

    public final void f1(hzc hzc, fs7 fs7) {
        if (fs7.a && !fs7.i) {
            if (fs7.b != 0) {
                int i = 1;
                if (fs7.e == -1) {
                    int i2 = fs7.f;
                    int h = this.q[0].h(i2);
                    while (i < this.p) {
                        int h2 = this.q[i].h(i2);
                        if (h2 > h) {
                            h = h2;
                        }
                        i++;
                    }
                    int i3 = i2 - h;
                    g1(hzc, i3 < 0 ? fs7.g : fs7.g - Math.min(i3, fs7.b));
                    return;
                }
                int i4 = fs7.g;
                int f = this.q[0].f(i4);
                while (i < this.p) {
                    int f2 = this.q[i].f(i4);
                    if (f2 < f) {
                        f = f2;
                    }
                    i++;
                }
                int i5 = f - fs7.g;
                h1(hzc, i5 < 0 ? fs7.f : Math.min(i5, fs7.b) + fs7.f);
            } else if (fs7.e == -1) {
                g1(hzc, fs7.g);
            } else {
                h1(hzc, fs7.f);
            }
        }
    }

    public final boolean g(bzc bzc) {
        return bzc instanceof sie;
    }

    public final void g0(int i, int i2) {
        Y0(i, i2, 2);
    }

    public final void g1(hzc hzc, int i) {
        int w2 = w() - 1;
        while (w2 >= 0) {
            View v2 = v(w2);
            if (this.r.f(v2) >= i && this.r.q(v2) >= i) {
                sie sie = (sie) v2.getLayoutParams();
                sie.getClass();
                if (sie.v.a.size() != 1) {
                    vie vie = sie.v;
                    ArrayList arrayList = vie.a;
                    int size = arrayList.size();
                    View view = (View) arrayList.remove(size - 1);
                    sie sie2 = (sie) view.getLayoutParams();
                    sie2.v = null;
                    if (sie2.a.B() || sie2.a.G()) {
                        vie.d -= vie.f.r.d(view);
                    }
                    if (size == 1) {
                        vie.b = IntCompanionObject.MIN_VALUE;
                    }
                    vie.c = IntCompanionObject.MIN_VALUE;
                    t0(v2, hzc);
                    w2--;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void h1(hzc hzc, int i) {
        while (w() > 0) {
            View v2 = v(0);
            if (this.r.c(v2) <= i && this.r.p(v2) <= i) {
                sie sie = (sie) v2.getLayoutParams();
                sie.getClass();
                if (sie.v.a.size() != 1) {
                    vie vie = sie.v;
                    ArrayList arrayList = vie.a;
                    View view = (View) arrayList.remove(0);
                    sie sie2 = (sie) view.getLayoutParams();
                    sie2.v = null;
                    if (arrayList.size() == 0) {
                        vie.c = IntCompanionObject.MIN_VALUE;
                    }
                    if (sie2.a.B() || sie2.a.G()) {
                        vie.d -= vie.f.r.d(view);
                    }
                    vie.b = IntCompanionObject.MIN_VALUE;
                    t0(v2, hzc);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void i(int i, int i2, lzc lzc, e13 e13) {
        fs7 fs7;
        int f;
        int i3;
        if (this.t != 0) {
            i = i2;
        }
        if (w() != 0 && i != 0) {
            e1(i, lzc);
            int[] iArr = this.J;
            if (iArr == null || iArr.length < this.p) {
                this.J = new int[this.p];
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.p;
                fs7 = this.v;
                if (i5 >= i7) {
                    break;
                }
                if (fs7.d == -1) {
                    f = fs7.f;
                    i3 = this.q[i5].h(f);
                } else {
                    f = this.q[i5].f(fs7.g);
                    i3 = fs7.g;
                }
                int i8 = f - i3;
                if (i8 >= 0) {
                    this.J[i6] = i8;
                    i6++;
                }
                i5++;
            }
            Arrays.sort(this.J, 0, i6);
            while (i4 < i6) {
                int i9 = fs7.c;
                if (i9 >= 0 && i9 < lzc.b()) {
                    e13.b(fs7.c, this.J[i4]);
                    fs7.c += fs7.d;
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public final void i0(RecyclerView recyclerView, int i, int i2) {
        Y0(i, i2, 4);
    }

    public final void i1() {
        if (this.t == 1 || !a1()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    public final void j0(hzc hzc, lzc lzc) {
        c1(hzc, lzc, true);
    }

    public final int j1(int i, hzc hzc, lzc lzc) {
        if (w() == 0 || i == 0) {
            return 0;
        }
        e1(i, lzc);
        fs7 fs7 = this.v;
        int P0 = P0(hzc, fs7, lzc);
        if (fs7.b >= P0) {
            i = i < 0 ? -P0 : P0;
        }
        this.r.r(-i);
        this.D = this.x;
        fs7.b = 0;
        f1(hzc, fs7);
        return i;
    }

    public final int k(lzc lzc) {
        return M0(lzc);
    }

    public final void k0(lzc lzc) {
        this.z = -1;
        this.A = IntCompanionObject.MIN_VALUE;
        this.F = null;
        this.H.c();
    }

    public final void k1(int i) {
        fs7 fs7 = this.v;
        fs7.e = i;
        int i2 = 1;
        if (this.x != (i == -1)) {
            i2 = -1;
        }
        fs7.d = i2;
    }

    public final int l(lzc lzc) {
        return N0(lzc);
    }

    public final void l0(Parcelable parcelable) {
        if (parcelable instanceof uie) {
            uie uie = (uie) parcelable;
            this.F = uie;
            if (this.z != -1) {
                uie.o = null;
                uie.c = 0;
                uie.a = -1;
                uie.b = -1;
                uie.o = null;
                uie.c = 0;
                uie.v = 0;
                uie.w = null;
                uie.x = null;
            }
            v0();
        }
    }

    public final void l1(int i) {
        c((String) null);
        if (i != this.p) {
            this.B.w();
            v0();
            this.p = i;
            this.y = new BitSet(this.p);
            this.q = new vie[this.p];
            for (int i2 = 0; i2 < this.p; i2++) {
                this.q[i2] = new vie(this, i2);
            }
            v0();
        }
    }

    public final int m(lzc lzc) {
        return O0(lzc);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [uie, android.os.Parcelable, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v1, types: [uie, android.os.Parcelable, java.lang.Object] */
    public final Parcelable m0() {
        int i;
        int m;
        int[] iArr;
        uie uie = this.F;
        if (uie != null) {
            ? obj = new Object();
            obj.c = uie.c;
            obj.a = uie.a;
            obj.b = uie.b;
            obj.o = uie.o;
            obj.v = uie.v;
            obj.w = uie.w;
            obj.y = uie.y;
            obj.z = uie.z;
            obj.X = uie.X;
            obj.x = uie.x;
            return obj;
        }
        ? obj2 = new Object();
        obj2.y = this.w;
        obj2.z = this.D;
        obj2.X = this.E;
        npg npg = this.B;
        if (npg == null || (iArr = (int[]) npg.b) == null) {
            obj2.v = 0;
        } else {
            obj2.w = iArr;
            obj2.v = iArr.length;
            obj2.x = (List) npg.c;
        }
        int i2 = -1;
        if (w() > 0) {
            obj2.a = this.D ? V0() : U0();
            View Q0 = this.x ? Q0(true) : R0(true);
            if (Q0 != null) {
                i2 = a.M(Q0);
            }
            obj2.b = i2;
            int i3 = this.p;
            obj2.c = i3;
            obj2.o = new int[i3];
            for (int i4 = 0; i4 < this.p; i4++) {
                if (this.D) {
                    i = this.q[i4].f(IntCompanionObject.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        m = this.r.h();
                    } else {
                        obj2.o[i4] = i;
                    }
                } else {
                    i = this.q[i4].h(IntCompanionObject.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        m = this.r.m();
                    } else {
                        obj2.o[i4] = i;
                    }
                }
                i -= m;
                obj2.o[i4] = i;
            }
        } else {
            obj2.a = -1;
            obj2.b = -1;
            obj2.c = 0;
        }
        return obj2;
    }

    public final void m1(int i, lzc lzc) {
        int i2;
        int i3;
        int i4;
        fs7 fs7 = this.v;
        boolean z2 = false;
        fs7.b = 0;
        fs7.c = i;
        ew7 ew7 = this.e;
        if (!(ew7 != null && ew7.e) || (i4 = lzc.a) == -1) {
            i3 = 0;
            i2 = 0;
        } else {
            if (this.x == (i4 < i)) {
                i3 = this.r.n();
                i2 = 0;
            } else {
                i2 = this.r.n();
                i3 = 0;
            }
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || !recyclerView.y) {
            fs7.g = this.r.g() + i3;
            fs7.f = -i2;
        } else {
            fs7.f = this.r.m() - i2;
            fs7.g = this.r.h() + i3;
        }
        fs7.h = false;
        fs7.a = true;
        if (this.r.j() == 0 && this.r.g() == 0) {
            z2 = true;
        }
        fs7.i = z2;
    }

    public final int n(lzc lzc) {
        return M0(lzc);
    }

    public final void n0(int i) {
        if (i == 0) {
            L0();
        }
    }

    public final void n1(vie vie, int i, int i2) {
        int i3 = vie.d;
        int i4 = vie.e;
        if (i == -1) {
            int i5 = vie.b;
            if (i5 == Integer.MIN_VALUE) {
                View view = (View) vie.a.get(0);
                vie.b = vie.f.r.f(view);
                ((sie) view.getLayoutParams()).getClass();
                i5 = vie.b;
            }
            if (i5 + i3 <= i2) {
                this.y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = vie.c;
        if (i6 == Integer.MIN_VALUE) {
            vie.a();
            i6 = vie.c;
        }
        if (i6 - i3 >= i2) {
            this.y.set(i4, false);
        }
    }

    public final int o(lzc lzc) {
        return N0(lzc);
    }

    public final int p(lzc lzc) {
        return O0(lzc);
    }

    public final bzc s() {
        return this.t == 0 ? new bzc(-2, -1) : new bzc(-1, -2);
    }

    public final bzc t(Context context, AttributeSet attributeSet) {
        return new bzc(context, attributeSet);
    }

    public final bzc u(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new bzc((ViewGroup.MarginLayoutParams) layoutParams) : new bzc(layoutParams);
    }

    public final int w0(int i, hzc hzc, lzc lzc) {
        return j1(i, hzc, lzc);
    }

    public final void x0(int i) {
        uie uie = this.F;
        if (!(uie == null || uie.a == i)) {
            uie.o = null;
            uie.c = 0;
            uie.a = -1;
            uie.b = -1;
        }
        this.z = i;
        this.A = IntCompanionObject.MIN_VALUE;
        v0();
    }

    public final int y0(int i, hzc hzc, lzc lzc) {
        return j1(i, hzc, lzc);
    }

    public StaggeredGridLayoutManager(int i) {
        this.p = -1;
        this.w = false;
        this.x = false;
        this.z = -1;
        this.A = IntCompanionObject.MIN_VALUE;
        this.B = new npg(23, false);
        this.C = 2;
        this.G = new Rect();
        this.H = new d0a(this);
        this.I = true;
        this.K = new tj7(28, this);
        this.t = 1;
        l1(i);
        this.v = new fs7();
        this.r = vo7.b(this, this.t);
        this.s = vo7.b(this, 1 - this.t);
    }
}
