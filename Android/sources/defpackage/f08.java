package defpackage;

/* renamed from: f08  reason: default package */
public final class f08 {
    public final Object a;
    public final String b;

    public f08(kt6 kt6, String str) {
        this.a = kt6;
        this.b = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.f08) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.f08
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            f08 r5 = (defpackage.f08) r5
            java.lang.Object r1 = r5.a
            java.lang.Object r3 = r4.a
            if (r3 != r1) goto L_0x001d
            java.lang.String r4 = r4.b
            java.lang.String r5 = r5.b
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x001d
            return r0
        L_0x001d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f08.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.b.hashCode() + (System.identityHashCode(this.a) * 31);
    }
}
