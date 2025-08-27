package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;

public class FlexboxLayoutManager extends a implements ar5, kzc {
    public static final Rect N = new Rect();
    public final dr5 A = new dr5(this);
    public vo7 B;
    public vo7 C;
    public fr5 D;
    public int E = -1;
    public int F = IntCompanionObject.MIN_VALUE;
    public int G = IntCompanionObject.MIN_VALUE;
    public int H = IntCompanionObject.MIN_VALUE;
    public final SparseArray I = new SparseArray();
    public final Context J;
    public View K;
    public int L = -1;
    public final rt6 M = new rt6(19, false);
    public int p;
    public int q;
    public final int r;
    public final int s = -1;
    public boolean t;
    public boolean u;
    public List v = new ArrayList();
    public final hr6 w = new hr6((ar5) this);
    public hzc x;
    public lzc y;
    public xl0 z;

    public FlexboxLayoutManager(Context context) {
        e1(0);
        f1();
        if (this.r != 4) {
            q0();
            this.v.clear();
            dr5 dr5 = this.A;
            dr5.b(dr5);
            dr5.d = 0;
            this.r = 4;
            v0();
        }
        this.J = context;
    }

    public static boolean R(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public final void H0(RecyclerView recyclerView, int i) {
        ew7 ew7 = new ew7(recyclerView.getContext());
        ew7.a = i;
        I0(ew7);
    }

    public final int K0(lzc lzc) {
        if (w() == 0) {
            return 0;
        }
        int b = lzc.b();
        N0();
        View P0 = P0(b);
        View R0 = R0(b);
        if (lzc.b() == 0 || P0 == null || R0 == null) {
            return 0;
        }
        return Math.min(this.B.n(), this.B.c(R0) - this.B.f(P0));
    }

    public final int L0(lzc lzc) {
        if (w() == 0) {
            return 0;
        }
        int b = lzc.b();
        View P0 = P0(b);
        View R0 = R0(b);
        if (!(lzc.b() == 0 || P0 == null || R0 == null)) {
            int M2 = a.M(P0);
            int M3 = a.M(R0);
            int abs = Math.abs(this.B.c(R0) - this.B.f(P0));
            int[] iArr = (int[]) this.w.c;
            int i = iArr[M2];
            if (!(i == 0 || i == -1)) {
                return Math.round((((float) i) * (((float) abs) / ((float) ((iArr[M3] - i) + 1)))) + ((float) (this.B.m() - this.B.f(P0))));
            }
        }
        return 0;
    }

    public final int M0(lzc lzc) {
        if (w() == 0) {
            return 0;
        }
        int b = lzc.b();
        View P0 = P0(b);
        View R0 = R0(b);
        if (lzc.b() == 0 || P0 == null || R0 == null) {
            return 0;
        }
        View T0 = T0(0, w());
        int i = -1;
        int M2 = T0 == null ? -1 : a.M(T0);
        View T02 = T0(w() - 1, -1);
        if (T02 != null) {
            i = a.M(T02);
        }
        return (int) ((((float) Math.abs(this.B.c(R0) - this.B.f(P0))) / ((float) ((i - M2) + 1))) * ((float) lzc.b()));
    }

    public final void N0() {
        if (this.B == null) {
            if (c1()) {
                if (this.q == 0) {
                    this.B = new h5b(this, 0);
                    this.C = new h5b(this, 1);
                    return;
                }
                this.B = new h5b(this, 1);
                this.C = new h5b(this, 0);
            } else if (this.q == 0) {
                this.B = new h5b(this, 1);
                this.C = new h5b(this, 0);
            } else {
                this.B = new h5b(this, 0);
                this.C = new h5b(this, 1);
            }
        }
    }

    public final int O0(hzc hzc, lzc lzc, xl0 xl0) {
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        hr6 hr6;
        int i9;
        boolean z3;
        View view;
        int i10;
        int i11;
        int i12;
        boolean z4;
        int i13;
        int i14;
        int i15;
        int i16;
        hr6 hr62;
        Rect rect;
        hzc hzc2 = hzc;
        xl0 xl02 = xl0;
        int i17 = xl02.g;
        if (i17 != Integer.MIN_VALUE) {
            int i18 = xl02.b;
            if (i18 < 0) {
                xl02.g = i17 + i18;
            }
            d1(hzc2, xl02);
        }
        int i19 = xl02.b;
        boolean c1 = c1();
        int i20 = i19;
        int i21 = 0;
        while (true) {
            if (i20 <= 0 && !this.z.c) {
                break;
            }
            List list = this.v;
            int i22 = xl02.e;
            if (i22 < 0 || i22 >= lzc.b() || (i = xl02.d) < 0 || i >= list.size()) {
                break;
            }
            cr5 cr5 = (cr5) this.v.get(xl02.d);
            xl02.e = cr5.k;
            boolean c12 = c1();
            dr5 dr5 = this.A;
            hr6 hr63 = this.w;
            Rect rect2 = N;
            if (c12) {
                int J2 = J();
                int K2 = K();
                int i23 = this.n;
                int i24 = xl02.f;
                if (xl02.j == -1) {
                    i24 -= cr5.c;
                }
                int i25 = i24;
                int i26 = xl02.e;
                float f = (float) dr5.d;
                float f2 = ((float) J2) - f;
                float f3 = ((float) (i23 - K2)) - f;
                float max = Math.max(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);
                int i27 = cr5.d;
                i4 = i19;
                int i28 = i26;
                int i29 = 0;
                while (i28 < i26 + i27) {
                    View Y0 = Y0(i28);
                    if (Y0 == null) {
                        i12 = i29;
                        i11 = i25;
                        z4 = c1;
                        i14 = i20;
                        i13 = i21;
                        i16 = i27;
                        rect = rect2;
                        hr62 = hr63;
                        i15 = i26;
                        i10 = i28;
                    } else {
                        i16 = i27;
                        i15 = i26;
                        if (xl02.j == 1) {
                            d(rect2, Y0);
                            i14 = i20;
                            b(-1, Y0, false);
                        } else {
                            i14 = i20;
                            d(rect2, Y0);
                            b(i29, Y0, false);
                            i29++;
                        }
                        i13 = i21;
                        long j = ((long[]) hr63.o)[i28];
                        int i30 = (int) j;
                        int i31 = (int) (j >> 32);
                        er5 er5 = (er5) Y0.getLayoutParams();
                        if (g1(Y0, i30, i31, er5)) {
                            Y0.measure(i30, i31);
                        }
                        float f4 = ((float) (er5.leftMargin + ((bzc) Y0.getLayoutParams()).b.left)) + f2;
                        float f5 = f3 - ((float) (er5.rightMargin + ((bzc) Y0.getLayoutParams()).b.right));
                        int i32 = i25 + ((bzc) Y0.getLayoutParams()).b.top;
                        if (this.t) {
                            i12 = i29;
                            rect = rect2;
                            i11 = i25;
                            hr62 = hr63;
                            int round = Math.round(f5) - Y0.getMeasuredWidth();
                            z4 = c1;
                            i10 = i28;
                            this.w.p(Y0, cr5, round, i32, Math.round(f5), Y0.getMeasuredHeight() + i32);
                        } else {
                            i12 = i29;
                            i11 = i25;
                            z4 = c1;
                            rect = rect2;
                            hr62 = hr63;
                            i10 = i28;
                            this.w.p(Y0, cr5, Math.round(f4), i32, Y0.getMeasuredWidth() + Math.round(f4), Y0.getMeasuredHeight() + i32);
                        }
                        f2 = ((float) (Y0.getMeasuredWidth() + er5.rightMargin + ((bzc) Y0.getLayoutParams()).b.right)) + max + f4;
                        f3 = f5 - (((float) ((Y0.getMeasuredWidth() + er5.leftMargin) + ((bzc) Y0.getLayoutParams()).b.left)) + max);
                    }
                    i28 = i10 + 1;
                    rect2 = rect;
                    hr63 = hr62;
                    i27 = i16;
                    i26 = i15;
                    i20 = i14;
                    i21 = i13;
                    c1 = z4;
                    i29 = i12;
                    i25 = i11;
                }
                z2 = c1;
                i3 = i20;
                i2 = i21;
                xl02.d += this.z.j;
                i5 = cr5.c;
            } else {
                i4 = i19;
                z2 = c1;
                i3 = i20;
                i2 = i21;
                Rect rect3 = rect2;
                hr6 hr64 = hr63;
                int L2 = L();
                int I2 = I();
                int i33 = this.o;
                int i34 = xl02.f;
                if (xl02.j == -1) {
                    int i35 = cr5.c;
                    i6 = i34 + i35;
                    i34 -= i35;
                } else {
                    i6 = i34;
                }
                int i36 = xl02.e;
                float f6 = (float) (i33 - I2);
                float f7 = (float) dr5.d;
                float f8 = ((float) L2) - f7;
                float f9 = f6 - f7;
                float max2 = Math.max(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);
                int i37 = cr5.d;
                int i38 = i36;
                int i39 = 0;
                while (i38 < i36 + i37) {
                    View Y02 = Y0(i38);
                    if (Y02 == null) {
                        hr6 = hr64;
                        i8 = i38;
                        i7 = i37;
                        i9 = i36;
                    } else {
                        float f10 = f9;
                        long j2 = ((long[]) hr64.o)[i38];
                        int i40 = (int) j2;
                        int i41 = (int) (j2 >> 32);
                        er5 er52 = (er5) Y02.getLayoutParams();
                        if (g1(Y02, i40, i41, er52)) {
                            Y02.measure(i40, i41);
                        }
                        float f11 = f8 + ((float) (er52.topMargin + ((bzc) Y02.getLayoutParams()).b.top));
                        float f12 = f10 - ((float) (er52.rightMargin + ((bzc) Y02.getLayoutParams()).b.bottom));
                        hr6 = hr64;
                        if (xl02.j == 1) {
                            d(rect3, Y02);
                            z3 = false;
                            b(-1, Y02, false);
                        } else {
                            z3 = false;
                            d(rect3, Y02);
                            b(i39, Y02, false);
                            i39++;
                        }
                        int i42 = i39;
                        int i43 = i34 + ((bzc) Y02.getLayoutParams()).b.left;
                        int i44 = i6 - ((bzc) Y02.getLayoutParams()).b.right;
                        boolean z5 = this.t;
                        if (!z5) {
                            boolean z6 = z3;
                            boolean z7 = z5;
                            view = Y02;
                            i8 = i38;
                            i7 = i37;
                            i9 = i36;
                            if (this.u) {
                                this.w.q(view, cr5, z7, i43, Math.round(f12) - view.getMeasuredHeight(), view.getMeasuredWidth() + i43, Math.round(f12));
                            } else {
                                this.w.q(view, cr5, z7, i43, Math.round(f11), view.getMeasuredWidth() + i43, view.getMeasuredHeight() + Math.round(f11));
                            }
                        } else if (this.u) {
                            view = Y02;
                            i8 = i38;
                            i7 = i37;
                            i9 = i36;
                            this.w.q(Y02, cr5, z5, i44 - Y02.getMeasuredWidth(), Math.round(f12) - Y02.getMeasuredHeight(), i44, Math.round(f12));
                        } else {
                            boolean z8 = z3;
                            view = Y02;
                            i8 = i38;
                            i7 = i37;
                            i9 = i36;
                            this.w.q(view, cr5, z5, i44 - view.getMeasuredWidth(), Math.round(f11), i44, view.getMeasuredHeight() + Math.round(f11));
                        }
                        float measuredHeight = ((float) (view.getMeasuredHeight() + er52.topMargin + ((bzc) view.getLayoutParams()).b.bottom)) + max2 + f11;
                        f9 = f12 - (((float) ((view.getMeasuredHeight() + er52.bottomMargin) + ((bzc) view.getLayoutParams()).b.top)) + max2);
                        f8 = measuredHeight;
                        i39 = i42;
                    }
                    i38 = i8 + 1;
                    i36 = i9;
                    hr64 = hr6;
                    i37 = i7;
                }
                xl02.d += this.z.j;
                i5 = cr5.c;
            }
            i21 = i2 + i5;
            if (z2 || !this.t) {
                xl02.f += cr5.c * xl02.j;
            } else {
                xl02.f -= cr5.c * xl02.j;
            }
            i20 = i3 - cr5.c;
            hzc hzc3 = hzc;
            i19 = i4;
            c1 = z2;
        }
        int i45 = i19;
        int i46 = i21;
        int i47 = xl02.b - i46;
        xl02.b = i47;
        int i48 = xl02.g;
        if (i48 != Integer.MIN_VALUE) {
            int i49 = i48 + i46;
            xl02.g = i49;
            if (i47 < 0) {
                xl02.g = i49 + i47;
            }
            d1(hzc, xl02);
        }
        return i45 - xl02.b;
    }

    public final View P0(int i) {
        int i2;
        View U0 = U0(0, w(), i);
        if (U0 == null || (i2 = ((int[]) this.w.c)[a.M(U0)]) == -1) {
            return null;
        }
        return Q0(U0, (cr5) this.v.get(i2));
    }

    public final boolean Q() {
        return true;
    }

    public final View Q0(View view, cr5 cr5) {
        boolean c1 = c1();
        int i = cr5.d;
        for (int i2 = 1; i2 < i; i2++) {
            View v2 = v(i2);
            if (!(v2 == null || v2.getVisibility() == 8)) {
                if (!this.t || c1) {
                    if (this.B.f(view) <= this.B.f(v2)) {
                    }
                } else if (this.B.c(view) >= this.B.c(v2)) {
                }
                view = v2;
            }
        }
        return view;
    }

    public final View R0(int i) {
        View U0 = U0(w() - 1, -1, i);
        if (U0 == null) {
            return null;
        }
        return S0(U0, (cr5) this.v.get(((int[]) this.w.c)[a.M(U0)]));
    }

    public final View S0(View view, cr5 cr5) {
        boolean c1 = c1();
        int w2 = (w() - cr5.d) - 1;
        for (int w3 = w() - 2; w3 > w2; w3--) {
            View v2 = v(w3);
            if (!(v2 == null || v2.getVisibility() == 8)) {
                if (!this.t || c1) {
                    if (this.B.c(view) >= this.B.c(v2)) {
                    }
                } else if (this.B.f(view) <= this.B.f(v2)) {
                }
                view = v2;
            }
        }
        return view;
    }

    public final View T0(int i, int i2) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View v2 = v(i);
            int J2 = J();
            int L2 = L();
            int K2 = this.n - K();
            int I2 = this.o - I();
            int B2 = a.B(v2) - ((bzc) v2.getLayoutParams()).leftMargin;
            int F2 = a.F(v2) - ((bzc) v2.getLayoutParams()).topMargin;
            int E2 = a.E(v2) + ((bzc) v2.getLayoutParams()).rightMargin;
            int z2 = a.z(v2) + ((bzc) v2.getLayoutParams()).bottomMargin;
            boolean z3 = false;
            boolean z4 = B2 >= K2 || E2 >= J2;
            if (F2 >= I2 || z2 >= L2) {
                z3 = true;
            }
            if (z4 && z3) {
                return v2;
            }
            i += i3;
        }
        return null;
    }

    public final View U0(int i, int i2, int i3) {
        int M2;
        N0();
        int i4 = 1;
        if (this.z == null) {
            xl0 xl0 = new xl0(1);
            xl0.i = 1;
            xl0.j = 1;
            this.z = xl0;
        }
        int m = this.B.m();
        int h = this.B.h();
        if (i2 <= i) {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View v2 = v(i);
            if (v2 != null && (M2 = a.M(v2)) >= 0 && M2 < i3) {
                if (((bzc) v2.getLayoutParams()).a.B()) {
                    if (view2 == null) {
                        view2 = v2;
                    }
                } else if (this.B.f(v2) >= m && this.B.c(v2) <= h) {
                    return v2;
                } else {
                    if (view == null) {
                        view = v2;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    public final void V() {
        q0();
    }

    public final int V0(int i, hzc hzc, lzc lzc, boolean z2) {
        int i2;
        int h;
        if (c1() || !this.t) {
            int h2 = this.B.h() - i;
            if (h2 <= 0) {
                return 0;
            }
            i2 = -a1(-h2, hzc, lzc);
        } else {
            int m = i - this.B.m();
            if (m <= 0) {
                return 0;
            }
            i2 = a1(m, hzc, lzc);
        }
        int i3 = i + i2;
        if (!z2 || (h = this.B.h() - i3) <= 0) {
            return i2;
        }
        this.B.r(h);
        return h + i2;
    }

    public final void W(RecyclerView recyclerView) {
        this.K = (View) recyclerView.getParent();
    }

    public final int W0(int i, hzc hzc, lzc lzc, boolean z2) {
        int i2;
        int m;
        if (c1() || !this.t) {
            int m2 = i - this.B.m();
            if (m2 <= 0) {
                return 0;
            }
            i2 = -a1(m2, hzc, lzc);
        } else {
            int h = this.B.h() - i;
            if (h <= 0) {
                return 0;
            }
            i2 = a1(-h, hzc, lzc);
        }
        int i3 = i + i2;
        if (!z2 || (m = i3 - this.B.m()) <= 0) {
            return i2;
        }
        this.B.r(-m);
        return i2 - m;
    }

    public final void X(RecyclerView recyclerView) {
    }

    public final int X0(View view) {
        return c1() ? ((bzc) view.getLayoutParams()).b.top + ((bzc) view.getLayoutParams()).b.bottom : ((bzc) view.getLayoutParams()).b.left + ((bzc) view.getLayoutParams()).b.right;
    }

    public final View Y0(int i) {
        View view = (View) this.I.get(i);
        return view != null ? view : this.x.j(i, LongCompanionObject.MAX_VALUE).a;
    }

    public final int Z0() {
        if (this.v.size() == 0) {
            return 0;
        }
        int size = this.v.size();
        int i = IntCompanionObject.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, ((cr5) this.v.get(i2)).a);
        }
        return i;
    }

    public final PointF a(int i) {
        View v2;
        if (w() == 0 || (v2 = v(0)) == null) {
            return null;
        }
        int i2 = i < a.M(v2) ? -1 : 1;
        return c1() ? new PointF(c44.DEFAULT_ASPECT_RATIO, (float) i2) : new PointF((float) i2, c44.DEFAULT_ASPECT_RATIO);
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a1(int r19, defpackage.hzc r20, defpackage.lzc r21) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.w()
            r2 = 0
            if (r1 == 0) goto L_0x01fe
            if (r19 != 0) goto L_0x000d
            goto L_0x01fe
        L_0x000d:
            r18.N0()
            xl0 r1 = r0.z
            r3 = 1
            r1.k = r3
            boolean r1 = r18.c1()
            if (r1 != 0) goto L_0x0021
            boolean r1 = r0.t
            if (r1 == 0) goto L_0x0021
            r1 = r3
            goto L_0x0022
        L_0x0021:
            r1 = r2
        L_0x0022:
            r4 = -1
            if (r1 == 0) goto L_0x002b
            if (r19 >= 0) goto L_0x0029
        L_0x0027:
            r5 = r3
            goto L_0x002e
        L_0x0029:
            r5 = r4
            goto L_0x002e
        L_0x002b:
            if (r19 <= 0) goto L_0x0029
            goto L_0x0027
        L_0x002e:
            int r6 = java.lang.Math.abs(r19)
            xl0 r7 = r0.z
            r7.j = r5
            boolean r7 = r18.c1()
            int r8 = r0.n
            int r9 = r0.l
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            int r9 = r0.o
            int r10 = r0.m
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            if (r7 != 0) goto L_0x0052
            boolean r10 = r0.t
            if (r10 == 0) goto L_0x0052
            r10 = r3
            goto L_0x0053
        L_0x0052:
            r10 = r2
        L_0x0053:
            hr6 r15 = r0.w
            if (r5 != r3) goto L_0x0136
            int r11 = r18.w()
            int r11 = r11 - r3
            android.view.View r11 = r0.v(r11)
            if (r11 != 0) goto L_0x0064
            goto L_0x01d5
        L_0x0064:
            xl0 r12 = r0.z
            vo7 r13 = r0.B
            int r13 = r13.c(r11)
            r12.f = r13
            int r12 = androidx.recyclerview.widget.a.M(r11)
            java.lang.Object r13 = r15.c
            int[] r13 = (int[]) r13
            r13 = r13[r12]
            java.util.List r14 = r0.v
            java.lang.Object r13 = r14.get(r13)
            cr5 r13 = (defpackage.cr5) r13
            android.view.View r11 = r0.S0(r11, r13)
            xl0 r13 = r0.z
            r13.i = r3
            int r12 = r12 + r3
            r13.e = r12
            java.lang.Object r14 = r15.c
            int[] r14 = (int[]) r14
            int r3 = r14.length
            if (r3 > r12) goto L_0x0095
            r13.d = r4
            goto L_0x0099
        L_0x0095:
            r3 = r14[r12]
            r13.d = r3
        L_0x0099:
            if (r10 == 0) goto L_0x00c0
            vo7 r3 = r0.B
            int r3 = r3.f(r11)
            r13.f = r3
            xl0 r3 = r0.z
            vo7 r10 = r0.B
            int r10 = r10.f(r11)
            int r10 = -r10
            vo7 r11 = r0.B
            int r11 = r11.m()
            int r11 = r11 + r10
            r3.g = r11
            xl0 r3 = r0.z
            int r10 = r3.g
            int r10 = java.lang.Math.max(r10, r2)
            r3.g = r10
            goto L_0x00d9
        L_0x00c0:
            vo7 r3 = r0.B
            int r3 = r3.c(r11)
            r13.f = r3
            xl0 r3 = r0.z
            vo7 r10 = r0.B
            int r10 = r10.c(r11)
            vo7 r11 = r0.B
            int r11 = r11.h()
            int r10 = r10 - r11
            r3.g = r10
        L_0x00d9:
            xl0 r3 = r0.z
            int r3 = r3.d
            if (r3 == r4) goto L_0x00e9
            java.util.List r4 = r0.v
            int r4 = r4.size()
            r10 = 1
            int r4 = r4 - r10
            if (r3 <= r4) goto L_0x01cd
        L_0x00e9:
            xl0 r3 = r0.z
            int r3 = r3.e
            lzc r4 = r0.y
            int r4 = r4.b()
            if (r3 > r4) goto L_0x01cd
            xl0 r3 = r0.z
            int r4 = r3.g
            int r14 = r6 - r4
            rt6 r11 = r0.M
            r4 = 0
            r11.b = r4
            if (r14 <= 0) goto L_0x01cd
            if (r7 == 0) goto L_0x0116
            int r3 = r3.e
            java.util.List r4 = r0.v
            r16 = -1
            hr6 r10 = r0.w
            r12 = r8
            r13 = r9
            r7 = r15
            r15 = r3
            r17 = r4
            r10.d(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0126
        L_0x0116:
            r7 = r15
            int r15 = r3.e
            java.util.List r3 = r0.v
            r16 = -1
            hr6 r10 = r0.w
            r12 = r9
            r13 = r8
            r17 = r3
            r10.d(r11, r12, r13, r14, r15, r16, r17)
        L_0x0126:
            xl0 r3 = r0.z
            int r3 = r3.e
            r7.h(r8, r9, r3)
            xl0 r3 = r0.z
            int r3 = r3.e
            r7.z(r3)
            goto L_0x01cd
        L_0x0136:
            r7 = r15
            android.view.View r3 = r0.v(r2)
            if (r3 != 0) goto L_0x013f
            goto L_0x01d5
        L_0x013f:
            xl0 r8 = r0.z
            vo7 r9 = r0.B
            int r9 = r9.f(r3)
            r8.f = r9
            int r8 = androidx.recyclerview.widget.a.M(r3)
            java.lang.Object r9 = r7.c
            int[] r9 = (int[]) r9
            r9 = r9[r8]
            java.util.List r11 = r0.v
            java.lang.Object r9 = r11.get(r9)
            cr5 r9 = (defpackage.cr5) r9
            android.view.View r3 = r0.Q0(r3, r9)
            xl0 r9 = r0.z
            r11 = 1
            r9.i = r11
            java.lang.Object r7 = r7.c
            int[] r7 = (int[]) r7
            r7 = r7[r8]
            if (r7 != r4) goto L_0x016d
            r7 = r2
        L_0x016d:
            if (r7 <= 0) goto L_0x0181
            java.util.List r4 = r0.v
            int r9 = r7 + -1
            java.lang.Object r4 = r4.get(r9)
            cr5 r4 = (defpackage.cr5) r4
            xl0 r9 = r0.z
            int r4 = r4.d
            int r8 = r8 - r4
            r9.e = r8
            goto L_0x0183
        L_0x0181:
            r9.e = r4
        L_0x0183:
            xl0 r4 = r0.z
            if (r7 <= 0) goto L_0x018a
            r8 = 1
            int r7 = r7 - r8
            goto L_0x018b
        L_0x018a:
            r7 = r2
        L_0x018b:
            r4.d = r7
            if (r10 == 0) goto L_0x01b3
            vo7 r7 = r0.B
            int r7 = r7.c(r3)
            r4.f = r7
            xl0 r4 = r0.z
            vo7 r7 = r0.B
            int r3 = r7.c(r3)
            vo7 r7 = r0.B
            int r7 = r7.h()
            int r3 = r3 - r7
            r4.g = r3
            xl0 r3 = r0.z
            int r4 = r3.g
            int r4 = java.lang.Math.max(r4, r2)
            r3.g = r4
            goto L_0x01cd
        L_0x01b3:
            vo7 r7 = r0.B
            int r7 = r7.f(r3)
            r4.f = r7
            xl0 r4 = r0.z
            vo7 r7 = r0.B
            int r3 = r7.f(r3)
            int r3 = -r3
            vo7 r7 = r0.B
            int r7 = r7.m()
            int r7 = r7 + r3
            r4.g = r7
        L_0x01cd:
            xl0 r3 = r0.z
            int r4 = r3.g
            int r4 = r6 - r4
            r3.b = r4
        L_0x01d5:
            xl0 r3 = r0.z
            int r4 = r3.g
            r7 = r20
            r8 = r21
            int r3 = r0.O0(r7, r8, r3)
            int r3 = r3 + r4
            if (r3 >= 0) goto L_0x01e5
            return r2
        L_0x01e5:
            if (r1 == 0) goto L_0x01ef
            if (r6 <= r3) goto L_0x01ec
            int r1 = -r5
            int r1 = r1 * r3
            goto L_0x01f3
        L_0x01ec:
            r1 = r19
            goto L_0x01f3
        L_0x01ef:
            if (r6 <= r3) goto L_0x01ec
            int r1 = r5 * r3
        L_0x01f3:
            vo7 r2 = r0.B
            int r3 = -r1
            r2.r(r3)
            xl0 r0 = r0.z
            r0.h = r1
            return r1
        L_0x01fe:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.a1(int, hzc, lzc):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if ((r4 + r5) > 0) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        if ((r4 + r5) >= 0) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b1(int r5) {
        /*
            r4 = this;
            int r0 = r4.w()
            if (r0 == 0) goto L_0x0059
            if (r5 != 0) goto L_0x0009
            goto L_0x0059
        L_0x0009:
            r4.N0()
            boolean r0 = r4.c1()
            android.view.View r1 = r4.K
            if (r0 == 0) goto L_0x0019
            int r1 = r1.getWidth()
            goto L_0x001d
        L_0x0019:
            int r1 = r1.getHeight()
        L_0x001d:
            if (r0 == 0) goto L_0x0022
            int r0 = r4.n
            goto L_0x0024
        L_0x0022:
            int r0 = r4.o
        L_0x0024:
            int r2 = r4.H()
            r3 = 1
            dr5 r4 = r4.A
            if (r2 != r3) goto L_0x0044
            int r2 = java.lang.Math.abs(r5)
            if (r5 >= 0) goto L_0x003d
            int r4 = r4.d
            int r0 = r0 + r4
            int r0 = r0 - r1
            int r4 = java.lang.Math.min(r0, r2)
            int r4 = -r4
            goto L_0x0058
        L_0x003d:
            int r4 = r4.d
            int r0 = r4 + r5
            if (r0 <= 0) goto L_0x0057
            goto L_0x0056
        L_0x0044:
            if (r5 <= 0) goto L_0x004f
            int r4 = r4.d
            int r0 = r0 - r4
            int r0 = r0 - r1
            int r4 = java.lang.Math.min(r0, r5)
            goto L_0x0058
        L_0x004f:
            int r4 = r4.d
            int r0 = r4 + r5
            if (r0 < 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            int r5 = -r4
        L_0x0057:
            r4 = r5
        L_0x0058:
            return r4
        L_0x0059:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.b1(int):int");
    }

    public final boolean c1() {
        int i = this.p;
        return i == 0 || i == 1;
    }

    public final void d0(int i, int i2) {
        h1(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r3 = r0 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d1(defpackage.hzc r10, defpackage.xl0 r11) {
        /*
            r9 = this;
            boolean r0 = r11.k
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r11.j
            r1 = -1
            hr6 r2 = r9.w
            if (r0 != r1) goto L_0x009b
            int r0 = r11.g
            if (r0 >= 0) goto L_0x0012
            goto L_0x0130
        L_0x0012:
            int r0 = r9.w()
            if (r0 != 0) goto L_0x001a
            goto L_0x0130
        L_0x001a:
            int r3 = r0 + -1
            android.view.View r4 = r9.v(r3)
            if (r4 != 0) goto L_0x0024
            goto L_0x0130
        L_0x0024:
            java.lang.Object r2 = r2.c
            int[] r2 = (int[]) r2
            int r4 = androidx.recyclerview.widget.a.M(r4)
            r2 = r2[r4]
            if (r2 != r1) goto L_0x0032
            goto L_0x0130
        L_0x0032:
            java.util.List r1 = r9.v
            java.lang.Object r1 = r1.get(r2)
            cr5 r1 = (defpackage.cr5) r1
            r4 = r3
        L_0x003b:
            if (r4 < 0) goto L_0x0084
            android.view.View r5 = r9.v(r4)
            if (r5 != 0) goto L_0x0044
            goto L_0x0081
        L_0x0044:
            int r6 = r11.g
            boolean r7 = r9.c1()
            if (r7 != 0) goto L_0x0059
            boolean r7 = r9.t
            if (r7 == 0) goto L_0x0059
            vo7 r7 = r9.B
            int r7 = r7.c(r5)
            if (r7 > r6) goto L_0x0084
            goto L_0x0068
        L_0x0059:
            vo7 r7 = r9.B
            int r7 = r7.f(r5)
            vo7 r8 = r9.B
            int r8 = r8.g()
            int r8 = r8 - r6
            if (r7 < r8) goto L_0x0084
        L_0x0068:
            int r6 = r1.k
            int r5 = androidx.recyclerview.widget.a.M(r5)
            if (r6 != r5) goto L_0x0081
            if (r2 > 0) goto L_0x0074
            r0 = r4
            goto L_0x0084
        L_0x0074:
            int r0 = r11.j
            int r2 = r2 + r0
            java.util.List r0 = r9.v
            java.lang.Object r0 = r0.get(r2)
            cr5 r0 = (defpackage.cr5) r0
            r1 = r0
            r0 = r4
        L_0x0081:
            int r4 = r4 + -1
            goto L_0x003b
        L_0x0084:
            if (r3 < r0) goto L_0x0130
            android.view.View r11 = r9.v(r3)
            android.view.View r1 = r9.v(r3)
            if (r1 == 0) goto L_0x0095
            mqf r1 = r9.a
            r1.S(r3)
        L_0x0095:
            r10.g(r11)
            int r3 = r3 + -1
            goto L_0x0084
        L_0x009b:
            int r0 = r11.g
            if (r0 >= 0) goto L_0x00a1
            goto L_0x0130
        L_0x00a1:
            int r0 = r9.w()
            if (r0 != 0) goto L_0x00a9
            goto L_0x0130
        L_0x00a9:
            r3 = 0
            android.view.View r4 = r9.v(r3)
            if (r4 != 0) goto L_0x00b2
            goto L_0x0130
        L_0x00b2:
            java.lang.Object r2 = r2.c
            int[] r2 = (int[]) r2
            int r4 = androidx.recyclerview.widget.a.M(r4)
            r2 = r2[r4]
            if (r2 != r1) goto L_0x00c0
            goto L_0x0130
        L_0x00c0:
            java.util.List r4 = r9.v
            java.lang.Object r4 = r4.get(r2)
            cr5 r4 = (defpackage.cr5) r4
        L_0x00c8:
            if (r3 >= r0) goto L_0x0119
            android.view.View r5 = r9.v(r3)
            if (r5 != 0) goto L_0x00d1
            goto L_0x0116
        L_0x00d1:
            int r6 = r11.g
            boolean r7 = r9.c1()
            if (r7 != 0) goto L_0x00ed
            boolean r7 = r9.t
            if (r7 == 0) goto L_0x00ed
            vo7 r7 = r9.B
            int r7 = r7.g()
            vo7 r8 = r9.B
            int r8 = r8.f(r5)
            int r7 = r7 - r8
            if (r7 > r6) goto L_0x0119
            goto L_0x00f5
        L_0x00ed:
            vo7 r7 = r9.B
            int r7 = r7.c(r5)
            if (r7 > r6) goto L_0x0119
        L_0x00f5:
            int r6 = r4.l
            int r5 = androidx.recyclerview.widget.a.M(r5)
            if (r6 != r5) goto L_0x0116
            java.util.List r1 = r9.v
            int r1 = r1.size()
            int r1 = r1 + -1
            if (r2 < r1) goto L_0x0109
            r1 = r3
            goto L_0x0119
        L_0x0109:
            int r1 = r11.j
            int r2 = r2 + r1
            java.util.List r1 = r9.v
            java.lang.Object r1 = r1.get(r2)
            cr5 r1 = (defpackage.cr5) r1
            r4 = r1
            r1 = r3
        L_0x0116:
            int r3 = r3 + 1
            goto L_0x00c8
        L_0x0119:
            if (r1 < 0) goto L_0x0130
            android.view.View r11 = r9.v(r1)
            android.view.View r0 = r9.v(r1)
            if (r0 == 0) goto L_0x012a
            mqf r0 = r9.a
            r0.S(r1)
        L_0x012a:
            r10.g(r11)
            int r1 = r1 + -1
            goto L_0x0119
        L_0x0130:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.d1(hzc, xl0):void");
    }

    public final boolean e() {
        if (this.q == 0) {
            return c1();
        }
        if (c1()) {
            int i = this.n;
            View view = this.K;
            return i > (view != null ? view.getWidth() : 0);
        }
    }

    public final void e1(int i) {
        if (this.p != i) {
            q0();
            this.p = i;
            this.B = null;
            this.C = null;
            this.v.clear();
            dr5 dr5 = this.A;
            dr5.b(dr5);
            dr5.d = 0;
            v0();
        }
    }

    public final boolean f() {
        if (this.q == 0) {
            return !c1();
        }
        if (c1()) {
            return true;
        }
        int i = this.o;
        View view = this.K;
        return i > (view != null ? view.getHeight() : 0);
    }

    public final void f0(int i, int i2) {
        h1(Math.min(i, i2));
    }

    public final void f1() {
        int i = this.q;
        if (i != 1) {
            if (i == 0) {
                q0();
                this.v.clear();
                dr5 dr5 = this.A;
                dr5.b(dr5);
                dr5.d = 0;
            }
            this.q = 1;
            this.B = null;
            this.C = null;
            v0();
        }
    }

    public final boolean g(bzc bzc) {
        return bzc instanceof er5;
    }

    public final void g0(int i, int i2) {
        h1(i);
    }

    public final boolean g1(View view, int i, int i2, er5 er5) {
        return view.isLayoutRequested() || !this.h || !R(view.getWidth(), i, er5.width) || !R(view.getHeight(), i2, er5.height);
    }

    public final void h0(int i) {
        h1(i);
    }

    public final void h1(int i) {
        int i2 = -1;
        View T0 = T0(w() - 1, -1);
        if (T0 != null) {
            i2 = a.M(T0);
        }
        if (i < i2) {
            int w2 = w();
            hr6 hr6 = this.w;
            hr6.j(w2);
            hr6.k(w2);
            hr6.i(w2);
            if (i < ((int[]) hr6.c).length) {
                this.L = i;
                View v2 = v(0);
                if (v2 != null) {
                    this.E = a.M(v2);
                    if (c1() || !this.t) {
                        this.F = this.B.f(v2) - this.B.m();
                        return;
                    }
                    this.F = this.B.i() + this.B.c(v2);
                }
            }
        }
    }

    public final void i0(RecyclerView recyclerView, int i, int i2) {
        h1(i);
        h1(i);
    }

    public final void i1(dr5 dr5, boolean z2, boolean z3) {
        int i;
        boolean z4 = false;
        if (z3) {
            int i2 = c1() ? this.m : this.l;
            xl0 xl0 = this.z;
            if (i2 == 0 || i2 == Integer.MIN_VALUE) {
                z4 = true;
            }
            xl0.c = z4;
        } else {
            this.z.c = false;
        }
        if (c1() || !this.t) {
            this.z.b = this.B.h() - dr5.c;
        } else {
            this.z.b = dr5.c - K();
        }
        xl0 xl02 = this.z;
        xl02.e = dr5.a;
        xl02.i = 1;
        xl02.j = 1;
        xl02.f = dr5.c;
        xl02.g = IntCompanionObject.MIN_VALUE;
        xl02.d = dr5.b;
        if (z2 && this.v.size() > 1 && (i = dr5.b) >= 0 && i < this.v.size() - 1) {
            xl0 xl03 = this.z;
            xl03.d++;
            xl03.e += ((cr5) this.v.get(dr5.b)).d;
        }
    }

    public final void j0(hzc hzc, lzc lzc) {
        boolean z2;
        int i;
        int i2;
        int i3;
        rt6 rt6;
        int i4;
        View v2;
        int i5;
        hzc hzc2 = hzc;
        lzc lzc2 = lzc;
        this.x = hzc2;
        this.y = lzc2;
        int b = lzc.b();
        if (b != 0 || !lzc2.h) {
            int H2 = H();
            int i6 = this.p;
            if (i6 == 0) {
                this.t = H2 == 1;
                this.u = this.q == 2;
            } else if (i6 == 1) {
                this.t = H2 != 1;
                this.u = this.q == 2;
            } else if (i6 == 2) {
                boolean z3 = H2 == 1;
                this.t = z3;
                if (this.q == 2) {
                    this.t = !z3;
                }
                this.u = false;
            } else if (i6 != 3) {
                this.t = false;
                this.u = false;
            } else {
                boolean z4 = H2 == 1;
                this.t = z4;
                if (this.q == 2) {
                    this.t = !z4;
                }
                this.u = true;
            }
            N0();
            if (this.z == null) {
                xl0 xl0 = new xl0(1);
                xl0.i = 1;
                xl0.j = 1;
                this.z = xl0;
            }
            hr6 hr6 = this.w;
            hr6.j(b);
            hr6.k(b);
            hr6.i(b);
            this.z.k = false;
            fr5 fr5 = this.D;
            if (fr5 != null && (i5 = fr5.a) >= 0 && i5 < b) {
                this.E = i5;
            }
            dr5 dr5 = this.A;
            if (!(dr5.f && this.E == -1 && fr5 == null)) {
                dr5.b(dr5);
                fr5 fr52 = this.D;
                if (!lzc2.h && (i4 = this.E) != -1) {
                    if (i4 < 0 || i4 >= lzc.b()) {
                        this.E = -1;
                        this.F = IntCompanionObject.MIN_VALUE;
                    } else {
                        int i7 = this.E;
                        dr5.a = i7;
                        dr5.b = ((int[]) hr6.c)[i7];
                        fr5 fr53 = this.D;
                        if (fr53 != null) {
                            int b2 = lzc.b();
                            int i8 = fr53.a;
                            if (i8 >= 0 && i8 < b2) {
                                dr5.c = this.B.m() + fr52.b;
                                dr5.g = true;
                                dr5.b = -1;
                                dr5.f = true;
                            }
                        }
                        if (this.F == Integer.MIN_VALUE) {
                            View r2 = r(this.E);
                            if (r2 == null) {
                                if (w() > 0 && (v2 = v(0)) != null) {
                                    dr5.e = this.E < a.M(v2);
                                }
                                dr5.a(dr5);
                            } else if (this.B.d(r2) > this.B.n()) {
                                dr5.a(dr5);
                            } else if (this.B.f(r2) - this.B.m() < 0) {
                                dr5.c = this.B.m();
                                dr5.e = false;
                            } else if (this.B.h() - this.B.c(r2) < 0) {
                                dr5.c = this.B.h();
                                dr5.e = true;
                            } else {
                                dr5.c = dr5.e ? this.B.o() + this.B.c(r2) : this.B.f(r2);
                            }
                        } else if (c1() || !this.t) {
                            dr5.c = this.B.m() + this.F;
                        } else {
                            dr5.c = this.F - this.B.i();
                        }
                        dr5.f = true;
                    }
                }
                if (w() != 0) {
                    View R0 = dr5.e ? R0(lzc.b()) : P0(lzc.b());
                    if (R0 != null) {
                        FlexboxLayoutManager flexboxLayoutManager = dr5.h;
                        vo7 vo7 = flexboxLayoutManager.q == 0 ? flexboxLayoutManager.C : flexboxLayoutManager.B;
                        if (flexboxLayoutManager.c1() || !flexboxLayoutManager.t) {
                            if (dr5.e) {
                                dr5.c = vo7.o() + vo7.c(R0);
                            } else {
                                dr5.c = vo7.f(R0);
                            }
                        } else if (dr5.e) {
                            dr5.c = vo7.o() + vo7.f(R0);
                        } else {
                            dr5.c = vo7.c(R0);
                        }
                        int M2 = a.M(R0);
                        dr5.a = M2;
                        dr5.g = false;
                        int[] iArr = (int[]) flexboxLayoutManager.w.c;
                        if (M2 == -1) {
                            M2 = 0;
                        }
                        int i9 = iArr[M2];
                        if (i9 == -1) {
                            i9 = 0;
                        }
                        dr5.b = i9;
                        int size = flexboxLayoutManager.v.size();
                        int i10 = dr5.b;
                        if (size > i10) {
                            dr5.a = ((cr5) flexboxLayoutManager.v.get(i10)).k;
                        }
                        dr5.f = true;
                    }
                }
                dr5.a(dr5);
                dr5.a = 0;
                dr5.b = 0;
                dr5.f = true;
            }
            q(hzc);
            if (dr5.e) {
                j1(dr5, false, true);
            } else {
                i1(dr5, false, true);
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.n, this.l);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.o, this.m);
            int i11 = this.n;
            int i12 = this.o;
            boolean c1 = c1();
            Context context = this.J;
            if (c1) {
                int i13 = this.G;
                z2 = (i13 == Integer.MIN_VALUE || i13 == i11) ? false : true;
                xl0 xl02 = this.z;
                i = xl02.c ? context.getResources().getDisplayMetrics().heightPixels : xl02.b;
            } else {
                int i14 = this.H;
                z2 = (i14 == Integer.MIN_VALUE || i14 == i12) ? false : true;
                xl0 xl03 = this.z;
                i = xl03.c ? context.getResources().getDisplayMetrics().widthPixels : xl03.b;
            }
            int i15 = i;
            this.G = i11;
            this.H = i12;
            int i16 = this.L;
            rt6 rt62 = this.M;
            if (i16 != -1 || (this.E == -1 && !z2)) {
                rt6 rt63 = rt62;
                int min = i16 != -1 ? Math.min(i16, dr5.a) : dr5.a;
                rt63.b = null;
                if (c1()) {
                    if (this.v.size() > 0) {
                        hr6.f(min, this.v);
                        this.w.d(this.M, makeMeasureSpec, makeMeasureSpec2, i15, min, dr5.a, this.v);
                    } else {
                        hr6.i(b);
                        this.w.d(this.M, makeMeasureSpec, makeMeasureSpec2, i15, 0, -1, this.v);
                    }
                } else if (this.v.size() > 0) {
                    hr6.f(min, this.v);
                    this.w.d(this.M, makeMeasureSpec2, makeMeasureSpec, i15, min, dr5.a, this.v);
                } else {
                    hr6.i(b);
                    this.w.d(this.M, makeMeasureSpec2, makeMeasureSpec, i15, 0, -1, this.v);
                }
                this.v = (List) rt63.b;
                hr6.h(makeMeasureSpec, makeMeasureSpec2, min);
                hr6.z(min);
            } else if (!dr5.e) {
                this.v.clear();
                rt62.b = null;
                if (c1()) {
                    rt6 = rt62;
                    this.w.d(this.M, makeMeasureSpec, makeMeasureSpec2, i15, 0, dr5.a, this.v);
                } else {
                    rt6 = rt62;
                    this.w.d(this.M, makeMeasureSpec2, makeMeasureSpec, i15, 0, dr5.a, this.v);
                }
                this.v = (List) rt6.b;
                hr6.h(makeMeasureSpec, makeMeasureSpec2, 0);
                hr6.z(0);
                int i17 = ((int[]) hr6.c)[dr5.a];
                dr5.b = i17;
                this.z.d = i17;
            }
            O0(hzc2, lzc2, this.z);
            if (dr5.e) {
                i3 = this.z.f;
                i1(dr5, true, false);
                O0(hzc2, lzc2, this.z);
                i2 = this.z.f;
            } else {
                i2 = this.z.f;
                j1(dr5, true, false);
                O0(hzc2, lzc2, this.z);
                i3 = this.z.f;
            }
            if (w() <= 0) {
                return;
            }
            if (dr5.e) {
                W0(V0(i2, hzc2, lzc2, true) + i3, hzc2, lzc2, false);
            } else {
                V0(W0(i3, hzc2, lzc2, true) + i2, hzc2, lzc2, false);
            }
        }
    }

    public final void j1(dr5 dr5, boolean z2, boolean z3) {
        int i;
        boolean z4 = false;
        if (z3) {
            int i2 = c1() ? this.m : this.l;
            xl0 xl0 = this.z;
            if (i2 == 0 || i2 == Integer.MIN_VALUE) {
                z4 = true;
            }
            xl0.c = z4;
        } else {
            this.z.c = false;
        }
        if (c1() || !this.t) {
            this.z.b = dr5.c - this.B.m();
        } else {
            this.z.b = (this.K.getWidth() - dr5.c) - this.B.m();
        }
        xl0 xl02 = this.z;
        xl02.e = dr5.a;
        xl02.i = 1;
        xl02.j = -1;
        xl02.f = dr5.c;
        xl02.g = IntCompanionObject.MIN_VALUE;
        int i3 = dr5.b;
        xl02.d = i3;
        if (z2 && i3 > 0 && this.v.size() > (i = dr5.b)) {
            xl0 xl03 = this.z;
            xl03.d--;
            xl03.e -= ((cr5) this.v.get(i)).d;
        }
    }

    public final int k(lzc lzc) {
        return K0(lzc);
    }

    public final void k0(lzc lzc) {
        this.D = null;
        this.E = -1;
        this.F = IntCompanionObject.MIN_VALUE;
        this.L = -1;
        dr5.b(this.A);
        this.I.clear();
    }

    public final void k1(View view, int i) {
        this.I.put(i, view);
    }

    public final int l(lzc lzc) {
        return L0(lzc);
    }

    public final void l0(Parcelable parcelable) {
        if (parcelable instanceof fr5) {
            this.D = (fr5) parcelable;
            v0();
        }
    }

    public final int m(lzc lzc) {
        return M0(lzc);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.Parcelable, fr5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v4, types: [android.os.Parcelable, fr5, java.lang.Object] */
    public final Parcelable m0() {
        fr5 fr5 = this.D;
        if (fr5 != null) {
            ? obj = new Object();
            obj.a = fr5.a;
            obj.b = fr5.b;
            return obj;
        }
        ? obj2 = new Object();
        if (w() > 0) {
            View v2 = v(0);
            obj2.a = a.M(v2);
            obj2.b = this.B.f(v2) - this.B.m();
        } else {
            obj2.a = -1;
        }
        return obj2;
    }

    public final int n(lzc lzc) {
        return K0(lzc);
    }

    public final int o(lzc lzc) {
        return L0(lzc);
    }

    public final int p(lzc lzc) {
        return M0(lzc);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [er5, bzc] */
    public final bzc s() {
        ? bzc = new bzc(-2, -2);
        bzc.v = c44.DEFAULT_ASPECT_RATIO;
        bzc.w = 1.0f;
        bzc.x = -1;
        bzc.y = -1.0f;
        bzc.Y = 16777215;
        bzc.Z = 16777215;
        return bzc;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [er5, bzc] */
    public final bzc t(Context context, AttributeSet attributeSet) {
        ? bzc = new bzc(context, attributeSet);
        bzc.v = c44.DEFAULT_ASPECT_RATIO;
        bzc.w = 1.0f;
        bzc.x = -1;
        bzc.y = -1.0f;
        bzc.Y = 16777215;
        bzc.Z = 16777215;
        return bzc;
    }

    public final int w0(int i, hzc hzc, lzc lzc) {
        if (!c1() || this.q == 0) {
            int a1 = a1(i, hzc, lzc);
            this.I.clear();
            return a1;
        }
        int b1 = b1(i);
        this.A.d += b1;
        this.C.r(-b1);
        return b1;
    }

    public final void x0(int i) {
        this.E = i;
        this.F = IntCompanionObject.MIN_VALUE;
        fr5 fr5 = this.D;
        if (fr5 != null) {
            fr5.a = -1;
        }
        v0();
    }

    public final int y0(int i, hzc hzc, lzc lzc) {
        if (c1() || (this.q == 0 && !c1())) {
            int a1 = a1(i, hzc, lzc);
            this.I.clear();
            return a1;
        }
        int b1 = b1(i);
        this.A.d += b1;
        this.C.r(-b1);
        return b1;
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        azc N2 = a.N(context, attributeSet, i, i2);
        int i3 = N2.a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (N2.c) {
                    e1(3);
                } else {
                    e1(2);
                }
            }
        } else if (N2.c) {
            e1(1);
        } else {
            e1(0);
        }
        f1();
        if (this.r != 4) {
            q0();
            this.v.clear();
            dr5 dr5 = this.A;
            dr5.b(dr5);
            dr5.d = 0;
            this.r = 4;
            v0();
        }
        this.J = context;
    }
}
