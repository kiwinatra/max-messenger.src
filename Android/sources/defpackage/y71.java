package defpackage;

/* renamed from: y71  reason: default package */
public final class y71 {
    public final int a;
    public final int b;
    public final x71 c;

    public y71(int i, int i2, x71 x71) {
        this.a = i;
        this.b = i2;
        this.c = x71;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.y71) r5;
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
            boolean r1 = r5 instanceof defpackage.y71
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            y71 r5 = (defpackage.y71) r5
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
            x71 r4 = r4.c
            x71 r5 = r5.c
            if (r4 == r5) goto L_0x0021
            return r2
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y71.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.c.hashCode() + rae.h(0, rae.h(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "CallHistoryTabState(id=" + this.a + ", nameRes=" + this.b + ", count=0, type=" + this.c + ")";
    }
}
