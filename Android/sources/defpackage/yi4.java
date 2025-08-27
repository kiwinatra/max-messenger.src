package defpackage;

import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: yi4  reason: default package */
public final class yi4 extends nj4 implements Comparable {
    public final int A0;
    public final int B0;
    public final int C0;
    public final int D0;
    public final boolean E0;
    public final boolean F0;
    public final int X;
    public final int Y;
    public final int Z;
    public final int v;
    public final boolean v0;
    public final boolean w;
    public final boolean w0;
    public final String x;
    public final int x0;
    public final ej4 y;
    public final int y0;
    public final boolean z;
    public final boolean z0;

    public yi4(int i, spf spf, int i2, ej4 ej4, int i3, boolean z2, wi4 wi4, int i4) {
        super(i, spf, i2);
        int i5;
        int i6;
        int i7;
        boolean z3;
        this.y = ej4;
        int i8 = ej4.r0 ? 24 : 16;
        int i9 = 1;
        int i10 = 0;
        this.v0 = ej4.n0 && (i4 & i8) != 0;
        this.x = sj4.h(this.o.d);
        this.z = pk0.o(i3, false);
        int i11 = 0;
        while (true) {
            tb7 tb7 = ej4.n;
            int size = tb7.size();
            i5 = IntCompanionObject.MAX_VALUE;
            if (i11 >= size) {
                i6 = 0;
                i11 = Integer.MAX_VALUE;
                break;
            }
            i6 = sj4.e(this.o, (String) tb7.get(i11), false);
            if (i6 > 0) {
                break;
            }
            i11++;
        }
        this.Y = i11;
        this.X = i6;
        this.Z = sj4.c(this.o.f, ej4.o);
        ea6 ea6 = this.o;
        int i12 = ea6.f;
        this.w0 = i12 == 0 || (i12 & 1) != 0;
        this.z0 = (ea6.e & 1) != 0;
        int i13 = ea6.B;
        this.A0 = i13;
        this.B0 = ea6.C;
        int i14 = ea6.i;
        this.C0 = i14;
        this.w = (i14 == -1 || i14 <= ej4.q) && (i13 == -1 || i13 <= ej4.p) && wi4.apply(ea6);
        String[] F = v0g.F();
        int i15 = 0;
        while (true) {
            if (i15 >= F.length) {
                i7 = 0;
                i15 = Integer.MAX_VALUE;
                break;
            }
            i7 = sj4.e(this.o, F[i15], false);
            if (i7 > 0) {
                break;
            }
            i15++;
        }
        this.x0 = i15;
        this.y0 = i7;
        int i16 = 0;
        while (true) {
            tb7 tb72 = ej4.r;
            if (i16 < tb72.size()) {
                String str = this.o.n;
                if (str != null && str.equals(tb72.get(i16))) {
                    i5 = i16;
                    break;
                }
                i16++;
            } else {
                break;
            }
        }
        this.D0 = i5;
        this.E0 = pk0.i(i3) == 128;
        this.F0 = pk0.j(i3) == 64;
        ej4 ej42 = this.y;
        if (pk0.o(i3, ej42.t0) && ((z3 = this.w) || ej42.m0)) {
            gqf gqf = ej42.s;
            int i17 = gqf.a;
            ea6 ea62 = this.o;
            if (i17 != 2 || sj4.i(ej42, i3, ea62)) {
                if (pk0.o(i3, false) && z3 && ea62.i != -1 && !ej42.z && !ej42.y && !((!ej42.v0 && z2) || gqf.a == 2 || (i8 & i3) == 0)) {
                    i9 = 2;
                }
                i10 = i9;
            }
        }
        this.v = i10;
    }

    public final int a() {
        return this.v;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        r1 = r4.C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        r0 = r7.E0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = r4.B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r1 = r4.n;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(defpackage.nj4 r7) {
        /*
            r6 = this;
            yi4 r7 = (defpackage.yi4) r7
            ej4 r0 = r6.y
            boolean r1 = r0.p0
            ea6 r2 = r7.o
            r3 = -1
            ea6 r4 = r6.o
            if (r1 != 0) goto L_0x0015
            int r1 = r4.B
            if (r1 == r3) goto L_0x0042
            int r5 = r2.B
            if (r1 != r5) goto L_0x0042
        L_0x0015:
            boolean r1 = r6.v0
            if (r1 != 0) goto L_0x0025
            java.lang.String r1 = r4.n
            if (r1 == 0) goto L_0x0042
            java.lang.String r5 = r2.n
            boolean r1 = android.text.TextUtils.equals(r1, r5)
            if (r1 == 0) goto L_0x0042
        L_0x0025:
            boolean r1 = r0.o0
            if (r1 != 0) goto L_0x0031
            int r1 = r4.C
            if (r1 == r3) goto L_0x0042
            int r2 = r2.C
            if (r1 != r2) goto L_0x0042
        L_0x0031:
            boolean r0 = r0.q0
            if (r0 != 0) goto L_0x0044
            boolean r0 = r7.E0
            boolean r1 = r6.E0
            if (r1 != r0) goto L_0x0042
            boolean r6 = r6.F0
            boolean r7 = r7.F0
            if (r6 != r7) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r6 = 0
            goto L_0x0045
        L_0x0044:
            r6 = 1
        L_0x0045:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yi4.b(nj4):boolean");
    }

    /* renamed from: c */
    public final int compareTo(yi4 yi4) {
        boolean z2 = this.z;
        boolean z3 = this.w;
        f5b b = (!z3 || !z2) ? sj4.j.b() : sj4.j;
        y93 d = y93.a.d(z2, yi4.z);
        Integer valueOf = Integer.valueOf(this.Y);
        Integer valueOf2 = Integer.valueOf(yi4.Y);
        q5a.a.getClass();
        d5d d5d = d5d.a;
        y93 c = d.c(valueOf, valueOf2, d5d).a(this.X, yi4.X).a(this.Z, yi4.Z).d(this.z0, yi4.z0).d(this.w0, yi4.w0).c(Integer.valueOf(this.x0), Integer.valueOf(yi4.x0), d5d).a(this.y0, yi4.y0).d(z3, yi4.w).c(Integer.valueOf(this.D0), Integer.valueOf(yi4.D0), d5d);
        boolean z4 = this.y.y;
        int i = this.C0;
        int i2 = yi4.C0;
        if (z4) {
            c = c.c(Integer.valueOf(i), Integer.valueOf(i2), sj4.j.b());
        }
        y93 c2 = c.d(this.E0, yi4.E0).d(this.F0, yi4.F0).c(Integer.valueOf(this.A0), Integer.valueOf(yi4.A0), b).c(Integer.valueOf(this.B0), Integer.valueOf(yi4.B0), b);
        if (v0g.a(this.x, yi4.x)) {
            c2 = c2.c(Integer.valueOf(i), Integer.valueOf(i2), b);
        }
        return c2.f();
    }
}
