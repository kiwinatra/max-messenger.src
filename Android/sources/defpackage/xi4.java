package defpackage;

import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: xi4  reason: default package */
public final class xi4 extends mj4 implements Comparable {
    public final int A0;
    public final int B0;
    public final int C0;
    public final boolean D0;
    public final boolean E0;
    public final int X;
    public final int Y;
    public final int Z;
    public final int v;
    public final boolean v0;
    public final boolean w;
    public final int w0;
    public final String x = rj4.f(this.o.c);
    public final int x0;
    public final dj4 y;
    public final boolean y0;
    public final boolean z;
    public final int z0;

    public xi4(int i, rpf rpf, int i2, dj4 dj4, int i3, boolean z2) {
        super(i, rpf, i2);
        int i4;
        int i5;
        int i6;
        boolean z3;
        this.y = dj4;
        int i7 = 0;
        this.z = rj4.d(i3, false);
        int i8 = 0;
        while (true) {
            int size = dj4.w0.size();
            i4 = IntCompanionObject.MAX_VALUE;
            if (i8 >= size) {
                i5 = 0;
                i8 = Integer.MAX_VALUE;
                break;
            }
            i5 = rj4.c(this.o, (String) dj4.w0.get(i8), false);
            if (i5 > 0) {
                break;
            }
            i8++;
        }
        this.Y = i8;
        this.X = i5;
        this.Z = rj4.a(this.o.v, dj4.x0);
        ca6 ca6 = this.o;
        int i9 = ca6.v;
        this.v0 = i9 == 0 || (i9 & 1) != 0;
        this.y0 = (ca6.o & 1) != 0;
        int i10 = ca6.H0;
        this.z0 = i10;
        this.A0 = ca6.I0;
        int i11 = ca6.y;
        this.B0 = i11;
        this.w = (i11 == -1 || i11 <= dj4.z0) && (i10 == -1 || i10 <= dj4.y0);
        String[] y2 = t0g.y();
        int i12 = 0;
        while (true) {
            if (i12 >= y2.length) {
                i6 = 0;
                i12 = Integer.MAX_VALUE;
                break;
            }
            i6 = rj4.c(this.o, y2[i12], false);
            if (i6 > 0) {
                break;
            }
            i12++;
        }
        this.w0 = i12;
        this.x0 = i6;
        int i13 = 0;
        while (true) {
            tb7 tb7 = dj4.A0;
            if (i13 < tb7.size()) {
                String str = this.o.Z;
                if (str != null && str.equals(tb7.get(i13))) {
                    i4 = i13;
                    break;
                }
                i13++;
            } else {
                break;
            }
        }
        this.C0 = i4;
        this.D0 = ok0.h(i3) == 128;
        this.E0 = ok0.i(i3) == 64;
        dj4 dj42 = this.y;
        if (rj4.d(i3, dj42.S0) && ((z3 = this.w) || dj42.N0)) {
            i7 = (!rj4.d(i3, false) || !z3 || this.o.y == -1 || dj42.F0 || dj42.E0 || (!dj42.U0 && z2)) ? 1 : 2;
        }
        this.v = i7;
    }

    public final int a() {
        return this.v;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        r1 = r4.I0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        r0 = r7.D0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = r4.H0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r1 = r4.Z;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(defpackage.mj4 r7) {
        /*
            r6 = this;
            xi4 r7 = (defpackage.xi4) r7
            dj4 r0 = r6.y
            boolean r1 = r0.Q0
            ca6 r2 = r7.o
            r3 = -1
            ca6 r4 = r6.o
            if (r1 != 0) goto L_0x0015
            int r1 = r4.H0
            if (r1 == r3) goto L_0x0042
            int r5 = r2.H0
            if (r1 != r5) goto L_0x0042
        L_0x0015:
            boolean r1 = r0.O0
            if (r1 != 0) goto L_0x0025
            java.lang.String r1 = r4.Z
            if (r1 == 0) goto L_0x0042
            java.lang.String r5 = r2.Z
            boolean r1 = android.text.TextUtils.equals(r1, r5)
            if (r1 == 0) goto L_0x0042
        L_0x0025:
            boolean r1 = r0.P0
            if (r1 != 0) goto L_0x0031
            int r1 = r4.I0
            if (r1 == r3) goto L_0x0042
            int r2 = r2.I0
            if (r1 != r2) goto L_0x0042
        L_0x0031:
            boolean r0 = r0.R0
            if (r0 != 0) goto L_0x0044
            boolean r0 = r7.D0
            boolean r1 = r6.D0
            if (r1 != r0) goto L_0x0042
            boolean r6 = r6.E0
            boolean r7 = r7.E0
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xi4.b(mj4):boolean");
    }

    /* renamed from: c */
    public final int compareTo(xi4 xi4) {
        boolean z2 = this.z;
        boolean z3 = this.w;
        f5b b = (!z3 || !z2) ? rj4.f.b() : rj4.f;
        y93 d = y93.a.d(z2, xi4.z);
        Integer valueOf = Integer.valueOf(this.Y);
        Integer valueOf2 = Integer.valueOf(xi4.Y);
        q5a.a.getClass();
        d5d d5d = d5d.a;
        y93 c = d.c(valueOf, valueOf2, d5d).a(this.X, xi4.X).a(this.Z, xi4.Z).d(this.y0, xi4.y0).d(this.v0, xi4.v0).c(Integer.valueOf(this.w0), Integer.valueOf(xi4.w0), d5d).a(this.x0, xi4.x0).d(z3, xi4.w).c(Integer.valueOf(this.C0), Integer.valueOf(xi4.C0), d5d);
        int i = this.B0;
        Integer valueOf3 = Integer.valueOf(i);
        int i2 = xi4.B0;
        y93 c2 = c.c(valueOf3, Integer.valueOf(i2), this.y.E0 ? rj4.f.b() : rj4.g).d(this.D0, xi4.D0).d(this.E0, xi4.E0).c(Integer.valueOf(this.z0), Integer.valueOf(xi4.z0), b).c(Integer.valueOf(this.A0), Integer.valueOf(xi4.A0), b);
        Integer valueOf4 = Integer.valueOf(i);
        Integer valueOf5 = Integer.valueOf(i2);
        if (!t0g.a(this.x, xi4.x)) {
            b = rj4.g;
        }
        return c2.c(valueOf4, valueOf5, b).f();
    }
}
