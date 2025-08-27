package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.Arrays;
import java.util.WeakHashMap;

public class GridLayoutManager extends LinearLayoutManager {
    public boolean E = false;
    public int F = -1;
    public int[] G;
    public View[] H;
    public final SparseIntArray I = new SparseIntArray();
    public final SparseIntArray J = new SparseIntArray();
    public xu6 K = new xu6();
    public final Rect L = new Rect();

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        z1(a.N(context, attributeSet, i, i2).b);
    }

    public final void A1() {
        int I2;
        int L2;
        if (this.p == 1) {
            I2 = this.n - K();
            L2 = J();
        } else {
            I2 = this.o - I();
            L2 = L();
        }
        s1(I2 - L2);
    }

    public final void B0(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.G == null) {
            super.B0(rect, i, i2);
        }
        int K2 = K() + J();
        int I2 = I() + L();
        if (this.p == 1) {
            int height = rect.height() + I2;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = gag.a;
            i4 = a.h(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            i3 = a.h(i, iArr[iArr.length - 1] + K2, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + K2;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = gag.a;
            i3 = a.h(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            i4 = a.h(i2, iArr2[iArr2.length - 1] + I2, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(i3, i4);
    }

    public final boolean J0() {
        return this.z == null && !this.E;
    }

    public final void L0(lzc lzc, aw7 aw7, e13 e13) {
        int i = this.F;
        for (int i2 = 0; i2 < this.F && (r3 = aw7.d) >= 0 && r3 < lzc.b() && i > 0; i2++) {
            int i3 = aw7.d;
            e13.b(i3, Math.max(0, aw7.g));
            i -= this.K.c(i3);
            aw7.d += aw7.e;
        }
    }

    public final int O(hzc hzc, lzc lzc) {
        if (this.p == 0) {
            return this.F;
        }
        if (lzc.b() < 1) {
            return 0;
        }
        return v1(lzc.b() - 1, hzc, lzc) + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00df, code lost:
        if (r13 == (r2 > r15)) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x010b, code lost:
        if (r13 == (r2 > r8 ? r9 : false)) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r0.a.M(r3) != false) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View Y(android.view.View r23, int r24, defpackage.hzc r25, defpackage.lzc r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            androidx.recyclerview.widget.RecyclerView r3 = r0.b
            r4 = 0
            if (r3 != 0) goto L_0x000f
            r5 = r23
        L_0x000d:
            r3 = r4
            goto L_0x0021
        L_0x000f:
            r5 = r23
            android.view.View r3 = r3.I(r5)
            if (r3 != 0) goto L_0x0018
        L_0x0017:
            goto L_0x000d
        L_0x0018:
            mqf r6 = r0.a
            boolean r6 = r6.M(r3)
            if (r6 == 0) goto L_0x0021
            goto L_0x0017
        L_0x0021:
            if (r3 != 0) goto L_0x0024
            return r4
        L_0x0024:
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            wu6 r6 = (defpackage.wu6) r6
            int r7 = r6.v
            int r6 = r6.w
            int r6 = r6 + r7
            android.view.View r5 = super.Y(r23, r24, r25, r26)
            if (r5 != 0) goto L_0x0036
            return r4
        L_0x0036:
            r5 = r24
            int r5 = r0.P0(r5)
            r9 = 1
            if (r5 != r9) goto L_0x0041
            r5 = r9
            goto L_0x0042
        L_0x0041:
            r5 = 0
        L_0x0042:
            boolean r10 = r0.u
            r11 = -1
            if (r5 == r10) goto L_0x004f
            int r5 = r22.w()
            int r5 = r5 - r9
            r10 = r11
            r12 = r10
            goto L_0x0056
        L_0x004f:
            int r5 = r22.w()
            r10 = r5
            r12 = r9
            r5 = 0
        L_0x0056:
            int r13 = r0.p
            if (r13 != r9) goto L_0x0062
            boolean r13 = r22.f1()
            if (r13 == 0) goto L_0x0062
            r13 = r9
            goto L_0x0063
        L_0x0062:
            r13 = 0
        L_0x0063:
            int r14 = r0.v1(r5, r1, r2)
            r8 = r11
            r15 = r8
            r16 = r12
            r9 = 0
            r12 = 0
            r11 = r5
            r5 = r4
        L_0x006f:
            if (r11 == r10) goto L_0x007d
            r17 = r10
            int r10 = r0.v1(r11, r1, r2)
            android.view.View r1 = r0.v(r11)
            if (r1 != r3) goto L_0x0081
        L_0x007d:
            r21 = r5
            goto L_0x0145
        L_0x0081:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0095
            if (r10 == r14) goto L_0x0095
            if (r4 == 0) goto L_0x008c
            goto L_0x007d
        L_0x008c:
            r18 = r3
            r21 = r5
        L_0x0090:
            r19 = r9
            r9 = 1
            goto L_0x0135
        L_0x0095:
            android.view.ViewGroup$LayoutParams r10 = r1.getLayoutParams()
            wu6 r10 = (defpackage.wu6) r10
            int r2 = r10.v
            r18 = r3
            int r3 = r10.w
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00ad
            if (r2 != r7) goto L_0x00ad
            if (r3 != r6) goto L_0x00ad
            return r1
        L_0x00ad:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00b5
            if (r4 == 0) goto L_0x00bd
        L_0x00b5:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00c3
            if (r5 != 0) goto L_0x00c3
        L_0x00bd:
            r21 = r5
        L_0x00bf:
            r19 = r9
            r9 = 1
            goto L_0x010d
        L_0x00c3:
            int r19 = java.lang.Math.max(r2, r7)
            int r20 = java.lang.Math.min(r3, r6)
            r21 = r5
            int r5 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00e2
            if (r5 <= r9) goto L_0x00d8
        L_0x00d7:
            goto L_0x00bf
        L_0x00d8:
            if (r5 != r9) goto L_0x0090
            if (r2 <= r15) goto L_0x00de
            r5 = 1
            goto L_0x00df
        L_0x00de:
            r5 = 0
        L_0x00df:
            if (r13 != r5) goto L_0x0090
            goto L_0x00d7
        L_0x00e2:
            if (r4 != 0) goto L_0x0090
            r19 = r9
            o9g r9 = r0.c
            boolean r9 = r9.c(r1)
            if (r9 == 0) goto L_0x00fa
            o9g r9 = r0.d
            boolean r9 = r9.c(r1)
            if (r9 == 0) goto L_0x00fa
            r9 = 1
            r20 = 1
            goto L_0x00fd
        L_0x00fa:
            r9 = 1
            r20 = 0
        L_0x00fd:
            r20 = r20 ^ 1
            if (r20 == 0) goto L_0x0135
            if (r5 <= r12) goto L_0x0104
            goto L_0x010d
        L_0x0104:
            if (r5 != r12) goto L_0x0135
            if (r2 <= r8) goto L_0x010a
            r5 = r9
            goto L_0x010b
        L_0x010a:
            r5 = 0
        L_0x010b:
            if (r13 != r5) goto L_0x0135
        L_0x010d:
            boolean r5 = r1.hasFocusable()
            if (r5 == 0) goto L_0x0126
            int r4 = r10.v
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r2 = r3 - r2
            r19 = r2
            r15 = r4
            r5 = r21
            r4 = r1
            goto L_0x0137
        L_0x0126:
            int r5 = r10.v
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r12 = r3 - r2
            r8 = r5
            r5 = r1
            goto L_0x0137
        L_0x0135:
            r5 = r21
        L_0x0137:
            int r11 = r11 + r16
            r1 = r25
            r2 = r26
            r10 = r17
            r3 = r18
            r9 = r19
            goto L_0x006f
        L_0x0145:
            if (r4 == 0) goto L_0x0148
            goto L_0x014a
        L_0x0148:
            r4 = r21
        L_0x014a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.Y(android.view.View, int, hzc, lzc):android.view.View");
    }

    public final void a0(hzc hzc, lzc lzc, g4 g4Var) {
        super.a0(hzc, lzc, g4Var);
        g4Var.h(GridView.class.getName());
    }

    public final View a1(hzc hzc, lzc lzc, boolean z, boolean z2) {
        int i;
        int i2;
        int w = w();
        int i3 = 1;
        if (z2) {
            i2 = w() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = w;
            i2 = 0;
        }
        int b = lzc.b();
        Q0();
        int m = this.r.m();
        int h = this.r.h();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View v = v(i2);
            int M = a.M(v);
            if (M >= 0 && M < b && w1(M, hzc, lzc) == 0) {
                if (((bzc) v.getLayoutParams()).a.B()) {
                    if (view2 == null) {
                        view2 = v;
                    }
                } else if (this.r.f(v) < h && this.r.c(v) >= m) {
                    return v;
                } else {
                    if (view == null) {
                        view = v;
                    }
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2;
    }

    public final void b0(hzc hzc, lzc lzc, View view, g4 g4Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof wu6)) {
            c0(view, g4Var);
            return;
        }
        wu6 wu6 = (wu6) layoutParams;
        int v1 = v1(wu6.a.s(), hzc, lzc);
        if (this.p == 0) {
            g4Var.i(f4.a(false, wu6.v, wu6.w, v1, 1));
        } else {
            g4Var.i(f4.a(false, v1, 1, wu6.v, wu6.w));
        }
    }

    public final void d0(int i, int i2) {
        this.K.d();
        this.K.b.clear();
    }

    public final void e0() {
        this.K.d();
        this.K.b.clear();
    }

    public final void f0(int i, int i2) {
        this.K.d();
        this.K.b.clear();
    }

    public boolean g(bzc bzc) {
        return bzc instanceof wu6;
    }

    public final void g0(int i, int i2) {
        this.K.d();
        this.K.b.clear();
    }

    public final void g1(hzc hzc, lzc lzc, aw7 aw7, zv7 zv7) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z;
        View b;
        hzc hzc2 = hzc;
        lzc lzc2 = lzc;
        aw7 aw72 = aw7;
        zv7 zv72 = zv7;
        int k = this.r.k();
        boolean z2 = k != 1073741824;
        int i14 = w() > 0 ? this.G[this.F] : 0;
        if (z2) {
            A1();
        }
        boolean z3 = aw72.e == 1;
        int i15 = this.F;
        if (!z3) {
            i15 = w1(aw72.d, hzc2, lzc2) + x1(aw72.d, hzc2, lzc2);
        }
        int i16 = 0;
        while (i16 < this.F && (r14 = aw72.d) >= 0 && r14 < lzc.b() && i15 > 0) {
            int i17 = aw72.d;
            int x1 = x1(i17, hzc2, lzc2);
            if (x1 <= this.F) {
                i15 -= x1;
                if (i15 < 0 || (b = aw72.b(hzc2)) == null) {
                    break;
                }
                this.H[i16] = b;
                i16++;
            } else {
                throw new IllegalArgumentException(wj6.l(a81.n("Item at position ", i17, " requires ", x1, " spans but GridLayoutManager has only "), this.F, " spans."));
            }
        }
        if (i16 == 0) {
            zv72.b = true;
            return;
        }
        if (z3) {
            i = 1;
            i2 = i16;
            i3 = 0;
        } else {
            i3 = i16 - 1;
            i2 = -1;
            i = -1;
        }
        int i18 = 0;
        while (i3 != i2) {
            View view = this.H[i3];
            wu6 wu6 = (wu6) view.getLayoutParams();
            int x12 = x1(a.M(view), hzc2, lzc2);
            wu6.w = x12;
            wu6.v = i18;
            i18 += x12;
            i3 += i;
        }
        float f = c44.DEFAULT_ASPECT_RATIO;
        int i19 = 0;
        for (int i20 = 0; i20 < i16; i20++) {
            View view2 = this.H[i20];
            if (aw72.k != null) {
                z = false;
                if (z3) {
                    b(-1, view2, true);
                } else {
                    b(0, view2, true);
                }
            } else if (z3) {
                z = false;
                b(-1, view2, false);
            } else {
                z = false;
                b(0, view2, false);
            }
            d(this.L, view2);
            y1(k, view2, z);
            int d = this.r.d(view2);
            if (d > i19) {
                i19 = d;
            }
            float e = (((float) this.r.e(view2)) * 1.0f) / ((float) ((wu6) view2.getLayoutParams()).w);
            if (e > f) {
                f = e;
            }
        }
        if (z2) {
            s1(Math.max(Math.round(f * ((float) this.F)), i14));
            i19 = 0;
            for (int i21 = 0; i21 < i16; i21++) {
                View view3 = this.H[i21];
                y1(1073741824, view3, true);
                int d2 = this.r.d(view3);
                if (d2 > i19) {
                    i19 = d2;
                }
            }
        }
        for (int i22 = 0; i22 < i16; i22++) {
            View view4 = this.H[i22];
            if (this.r.d(view4) != i19) {
                wu6 wu62 = (wu6) view4.getLayoutParams();
                Rect rect = wu62.b;
                int i23 = rect.top + rect.bottom + wu62.topMargin + wu62.bottomMargin;
                int i24 = rect.left + rect.right + wu62.leftMargin + wu62.rightMargin;
                int u1 = u1(wu62.v, wu62.w);
                if (this.p == 1) {
                    i13 = a.x(false, u1, 1073741824, i24, wu62.width);
                    i12 = View.MeasureSpec.makeMeasureSpec(i19 - i23, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19 - i24, 1073741824);
                    i12 = a.x(false, u1, 1073741824, i23, wu62.height);
                    i13 = makeMeasureSpec;
                }
                if (G0(view4, i13, i12, (bzc) view4.getLayoutParams())) {
                    view4.measure(i13, i12);
                }
            }
        }
        int i25 = 0;
        zv72.a = i19;
        if (this.p != 1) {
            if (aw72.f == -1) {
                int i26 = aw72.b;
                i7 = i26 - i19;
                i6 = i26;
            } else {
                int i27 = aw72.b;
                i6 = i27 + i19;
                i7 = i27;
            }
            i5 = 0;
            i4 = 0;
        } else if (aw72.f == -1) {
            i4 = aw72.b;
            i5 = i4 - i19;
            i7 = 0;
            i6 = 0;
        } else {
            int i28 = aw72.b;
            i5 = i28;
            i6 = 0;
            i4 = i28 + i19;
            i7 = 0;
        }
        while (i25 < i16) {
            View view5 = this.H[i25];
            wu6 wu63 = (wu6) view5.getLayoutParams();
            if (this.p != 1) {
                int L2 = L() + this.G[wu63.v];
                i11 = i7;
                i10 = i6;
                i9 = L2;
                i8 = this.r.e(view5) + L2;
            } else if (f1()) {
                int J2 = J() + this.G[this.F - wu63.v];
                i10 = J2;
                i9 = i5;
                i8 = i4;
                i11 = J2 - this.r.e(view5);
            } else {
                int J3 = J() + this.G[wu63.v];
                i10 = this.r.e(view5) + J3;
                i9 = i5;
                i8 = i4;
                i11 = J3;
            }
            S(view5, i11, i9, i10, i8);
            if (wu63.a.B() || wu63.a.G()) {
                zv72.c = true;
            }
            zv72.d |= view5.hasFocusable();
            i25++;
            i7 = i11;
            i6 = i10;
            i5 = i9;
            i4 = i8;
        }
        Arrays.fill(this.H, (Object) null);
    }

    public final void h1(hzc hzc, lzc lzc, ad5 ad5, int i) {
        A1();
        if (lzc.b() > 0 && !lzc.h) {
            boolean z = i == 1;
            int w1 = w1(ad5.b, hzc, lzc);
            if (z) {
                while (w1 > 0) {
                    int i2 = ad5.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    ad5.b = i3;
                    w1 = w1(i3, hzc, lzc);
                }
            } else {
                int b = lzc.b() - 1;
                int i4 = ad5.b;
                while (i4 < b) {
                    int i5 = i4 + 1;
                    int w12 = w1(i5, hzc, lzc);
                    if (w12 <= w1) {
                        break;
                    }
                    i4 = i5;
                    w1 = w12;
                }
                ad5.b = i4;
            }
        }
        t1();
    }

    public final void i0(RecyclerView recyclerView, int i, int i2) {
        this.K.d();
        this.K.b.clear();
    }

    public final void j0(hzc hzc, lzc lzc) {
        boolean z = lzc.h;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z) {
            int w = w();
            for (int i = 0; i < w; i++) {
                wu6 wu6 = (wu6) v(i).getLayoutParams();
                int s = wu6.a.s();
                sparseIntArray2.put(s, wu6.w);
                sparseIntArray.put(s, wu6.v);
            }
        }
        super.j0(hzc, lzc);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    public final void k0(lzc lzc) {
        super.k0(lzc);
        this.E = false;
    }

    public final int l(lzc lzc) {
        return N0(lzc);
    }

    public final int m(lzc lzc) {
        return O0(lzc);
    }

    public final int o(lzc lzc) {
        return N0(lzc);
    }

    public final void o1(boolean z) {
        if (!z) {
            super.o1(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public final int p(lzc lzc) {
        return O0(lzc);
    }

    public bzc s() {
        return this.p == 0 ? new wu6(-2, -1) : new wu6(-1, -2);
    }

    public final void s1(int i) {
        int i2;
        int[] iArr = this.G;
        int i3 = this.F;
        if (!(iArr != null && iArr.length == i3 + 1 && iArr[iArr.length - 1] == i)) {
            iArr = new int[(i3 + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.G = iArr;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [wu6, bzc] */
    public bzc t(Context context, AttributeSet attributeSet) {
        ? bzc = new bzc(context, attributeSet);
        bzc.v = -1;
        bzc.w = 0;
        return bzc;
    }

    public final void t1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [wu6, bzc] */
    /* JADX WARNING: type inference failed for: r2v3, types: [wu6, bzc] */
    public bzc u(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ? bzc = new bzc((ViewGroup.MarginLayoutParams) layoutParams);
            bzc.v = -1;
            bzc.w = 0;
            return bzc;
        }
        ? bzc2 = new bzc(layoutParams);
        bzc2.v = -1;
        bzc2.w = 0;
        return bzc2;
    }

    public final int u1(int i, int i2) {
        if (this.p != 1 || !f1()) {
            int[] iArr = this.G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.G;
        int i3 = this.F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int v1(int i, hzc hzc, lzc lzc) {
        if (!lzc.h) {
            return this.K.a(i, this.F);
        }
        int b = hzc.b(i);
        if (b == -1) {
            return 0;
        }
        return this.K.a(b, this.F);
    }

    public final int w0(int i, hzc hzc, lzc lzc) {
        A1();
        t1();
        return super.w0(i, hzc, lzc);
    }

    public final int w1(int i, hzc hzc, lzc lzc) {
        if (!lzc.h) {
            return this.K.b(i, this.F);
        }
        int i2 = this.J.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b = hzc.b(i);
        if (b == -1) {
            return 0;
        }
        return this.K.b(b, this.F);
    }

    public final int x1(int i, hzc hzc, lzc lzc) {
        if (!lzc.h) {
            return this.K.c(i);
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b = hzc.b(i);
        if (b == -1) {
            return 1;
        }
        return this.K.c(b);
    }

    public final int y(hzc hzc, lzc lzc) {
        if (this.p == 1) {
            return this.F;
        }
        if (lzc.b() < 1) {
            return 0;
        }
        return v1(lzc.b() - 1, hzc, lzc) + 1;
    }

    public final int y0(int i, hzc hzc, lzc lzc) {
        A1();
        t1();
        return super.y0(i, hzc, lzc);
    }

    public final void y1(int i, View view, boolean z) {
        int i2;
        int i3;
        wu6 wu6 = (wu6) view.getLayoutParams();
        Rect rect = wu6.b;
        int i4 = rect.top + rect.bottom + wu6.topMargin + wu6.bottomMargin;
        int i5 = rect.left + rect.right + wu6.leftMargin + wu6.rightMargin;
        int u1 = u1(wu6.v, wu6.w);
        if (this.p == 1) {
            i2 = a.x(false, u1, i, i5, wu6.width);
            i3 = a.x(true, this.r.n(), this.m, i4, wu6.height);
        } else {
            int x = a.x(false, u1, i, i4, wu6.height);
            int x2 = a.x(true, this.r.n(), this.l, i5, wu6.width);
            i3 = x;
            i2 = x2;
        }
        bzc bzc = (bzc) view.getLayoutParams();
        if (z ? G0(view, i2, i3, bzc) : E0(view, i2, i3, bzc)) {
            view.measure(i2, i3);
        }
    }

    public final void z1(int i) {
        if (i != this.F) {
            this.E = true;
            if (i >= 1) {
                this.F = i;
                this.K.d();
                v0();
                return;
            }
            throw new IllegalArgumentException(wj6.h(i, "Span count should be at least 1. Provided "));
        }
    }

    public GridLayoutManager(int i) {
        z1(i);
    }

    public GridLayoutManager(int i, int i2) {
        super(i2, false);
        z1(i);
    }
}
