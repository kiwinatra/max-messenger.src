package defpackage;

/* renamed from: b49  reason: default package */
public final class b49 implements g49 {
    public final int a;
    public final long b;

    public b49(int i, long j) {
        this.a = i;
        this.b = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r6 = (defpackage.b49) r6;
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
            boolean r1 = r6 instanceof defpackage.b49
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            b49 r6 = (defpackage.b49) r6
            int r1 = r6.a
            int r3 = r5.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            long r3 = r5.b
            long r5 = r6.b
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x001c
            return r2
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b49.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OnContextActionClicked(actionId=" + this.a + ", memberId=" + this.b + ")";
    }
}
