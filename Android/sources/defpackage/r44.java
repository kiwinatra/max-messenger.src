package defpackage;

import java.util.List;

/* renamed from: r44  reason: default package */
public final class r44 implements vye {
    public static final mw0 c;
    public final tb7 a;
    public final long[] b;

    static {
        q5a q5a = q5a.a;
        zb2 zb2 = new zb2(26);
        q5a.getClass();
        c = new mw0(zb2, q5a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cd A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r44(defpackage.k0d r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = 2
            r2 = 0
            r19.<init>()
            int r3 = r20.size()
            r6 = 1
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 != r6) goto L_0x004c
            java.lang.Object r3 = defpackage.b0h.z(r20)
            q44 r3 = (defpackage.q44) r3
            long r9 = r3.b
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0022
            r4 = 0
            goto L_0x0023
        L_0x0022:
            r4 = r9
        L_0x0023:
            long r9 = r3.c
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            tb7 r3 = r3.a
            if (r7 != 0) goto L_0x0038
            k0d r1 = defpackage.tb7.t(r3)
            r0.a = r1
            long[] r1 = new long[r6]
            r1[r2] = r4
            r0.b = r1
            goto L_0x004b
        L_0x0038:
            k0d r7 = defpackage.tb7.s()
            k0d r3 = defpackage.tb7.u(r3, r7)
            r0.a = r3
            long r9 = r9 + r4
            long[] r1 = new long[r1]
            r1[r2] = r4
            r1[r6] = r9
            r0.b = r1
        L_0x004b:
            return
        L_0x004c:
            int r3 = r20.size()
            int r3 = r3 * r1
            long[] r1 = new long[r3]
            r0.b = r1
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.Arrays.fill(r1, r9)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            mw0 r3 = c
            r9 = r20
            k0d r3 = defpackage.tb7.x(r3, r9)
            r9 = r2
        L_0x006b:
            int r10 = r3.size()
            if (r2 >= r10) goto L_0x00cf
            java.lang.Object r10 = r3.get(r2)
            q44 r10 = (defpackage.q44) r10
            long r11 = r10.b
            int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r13 != 0) goto L_0x007f
            r11 = 0
        L_0x007f:
            long r13 = r10.c
            long r15 = r11 + r13
            tb7 r10 = r10.a
            if (r9 == 0) goto L_0x00b1
            long[] r4 = r0.b
            int r5 = r9 + -1
            r17 = r4[r5]
            int r4 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x0092
            goto L_0x00b1
        L_0x0092:
            if (r4 != 0) goto L_0x00a4
            java.lang.Object r4 = r1.get(r5)
            tb7 r4 = (defpackage.tb7) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x00a4
            r1.set(r5, r10)
            goto L_0x00bb
        L_0x00a4:
            java.lang.String r4 = "Truncating unsupported overlapping cues."
            defpackage.i8b.V(r4)
            long[] r4 = r0.b
            r4[r5] = r11
            r1.set(r5, r10)
            goto L_0x00bb
        L_0x00b1:
            long[] r4 = r0.b
            int r5 = r9 + 1
            r4[r9] = r11
            r1.add(r10)
            r9 = r5
        L_0x00bb:
            int r4 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x00cd
            long[] r4 = r0.b
            int r5 = r9 + 1
            r4[r9] = r15
            k0d r4 = defpackage.tb7.s()
            r1.add(r4)
            r9 = r5
        L_0x00cd:
            int r2 = r2 + r6
            goto L_0x006b
        L_0x00cf:
            tb7 r1 = defpackage.tb7.p(r1)
            r0.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r44.<init>(k0d):void");
    }

    public final int d(long j) {
        int b2 = v0g.b(this.b, j, false);
        if (b2 < this.a.size()) {
            return b2;
        }
        return -1;
    }

    public final long k(int i) {
        n79.g(i < this.a.size());
        return this.b[i];
    }

    public final List p(long j) {
        int f = v0g.f(this.b, j, false);
        return f == -1 ? tb7.s() : (tb7) this.a.get(f);
    }

    public final int t() {
        return this.a.size();
    }
}
