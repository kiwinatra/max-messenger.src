package defpackage;

/* renamed from: uhe  reason: default package */
public final class uhe {
    public final int a;
    public final double b = 4.0d;

    public uhe(int i) {
        this.a = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r6 = (defpackage.uhe) r6;
        r1 = r6.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof defpackage.uhe
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            uhe r6 = (defpackage.uhe) r6
            int r1 = r6.a
            int r3 = r5.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            double r3 = r5.b
            double r5 = r6.b
            int r5 = java.lang.Double.compare(r3, r5)
            if (r5 == 0) goto L_0x001e
            return r2
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uhe.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SquircleParams(radius=" + this.a + ", curvature=" + this.b + ")";
    }
}
