package defpackage;

/* renamed from: qh4  reason: default package */
public final class qh4 {
    public final String a;
    public int b;
    public long c;
    public final nz8 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ rh4 g;

    public qh4(rh4 rh4, String str, int i, nz8 nz8) {
        this.g = rh4;
        this.a = str;
        this.b = i;
        this.c = nz8 == null ? -1 : nz8.d;
        if (nz8 != null && nz8.b()) {
            this.d = nz8;
        }
    }

    public final boolean a(td tdVar) {
        nz8 nz8 = tdVar.d;
        if (nz8 == null) {
            return this.b != tdVar.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (nz8.d > j) {
            return true;
        }
        nz8 nz82 = this.d;
        if (nz82 == null) {
            return false;
        }
        jkf jkf = tdVar.b;
        int b2 = jkf.b(nz8.a);
        int b3 = jkf.b(nz82.a);
        if (nz8.d < nz82.d || b2 < b3) {
            return false;
        }
        if (b2 > b3) {
            return true;
        }
        boolean b4 = nz8.b();
        int i = nz82.b;
        if (b4) {
            int i2 = nz8.b;
            if (i2 <= i) {
                return i2 == i && nz8.c > nz82.c;
            }
            return true;
        }
        int i3 = nz8.e;
        return i3 == -1 || i3 > i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 < r8.p()) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(defpackage.jkf r7, defpackage.jkf r8) {
        /*
            r6 = this;
            int r0 = r6.b
            int r1 = r7.p()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L_0x0011
            int r7 = r8.p()
            if (r0 >= r7) goto L_0x0036
            goto L_0x0037
        L_0x0011:
            rh4 r1 = r6.g
            hkf r4 = r1.a
            r7.o(r0, r4)
            hkf r0 = r1.a
            int r4 = r0.n
        L_0x001c:
            int r5 = r0.o
            if (r4 > r5) goto L_0x0036
            java.lang.Object r5 = r7.m(r4)
            int r5 = r8.b(r5)
            if (r5 == r3) goto L_0x0033
            ekf r7 = r1.b
            ekf r7 = r8.g(r5, r7, r2)
            int r0 = r7.c
            goto L_0x0037
        L_0x0033:
            int r4 = r4 + 1
            goto L_0x001c
        L_0x0036:
            r0 = r3
        L_0x0037:
            r6.b = r0
            if (r0 != r3) goto L_0x003c
            return r2
        L_0x003c:
            nz8 r6 = r6.d
            r7 = 1
            if (r6 != 0) goto L_0x0042
            return r7
        L_0x0042:
            java.lang.Object r6 = r6.a
            int r6 = r8.b(r6)
            if (r6 == r3) goto L_0x004b
            r2 = r7
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qh4.b(jkf, jkf):boolean");
    }
}
