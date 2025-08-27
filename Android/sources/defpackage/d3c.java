package defpackage;

/* renamed from: d3c  reason: default package */
public final class d3c extends s3c {
    public final int a;
    public final int b;
    public final int c;

    public d3c(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.d3c) r5;
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
            boolean r1 = r5 instanceof defpackage.d3c
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            d3c r5 = (defpackage.d3c) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r4 = r4.b
            int r5 = r5.b
            boolean r4 = defpackage.hi7.l(r4, r5)
            if (r4 != 0) goto L_0x001e
            return r2
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d3c.equals(java.lang.Object):boolean");
    }

    public final long getItemId() {
        return (long) 64;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final int i() {
        return this.c;
    }

    public final String toString() {
        String d0 = hi7.d0(this.b);
        return "Admins(count=" + this.a + ", itemViewType=" + d0 + ")";
    }
}
