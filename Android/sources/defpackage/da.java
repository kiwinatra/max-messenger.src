package defpackage;

/* renamed from: da  reason: default package */
public final class da {
    public final int a;
    public final int b;
    public final ca c;

    public da(int i, int i2, ca caVar) {
        this.a = i;
        this.b = i2;
        this.c = caVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.da) r5;
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
            boolean r1 = r5 instanceof defpackage.da
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            da r5 = (defpackage.da) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            ca r4 = r4.c
            ca r5 = r5.c
            if (r4 == r5) goto L_0x0021
            return r2
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.c.hashCode() + rae.h(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "AddAdminsTabState(id=" + this.a + ", title=" + this.b + ", type=" + this.c + ")";
    }
}
