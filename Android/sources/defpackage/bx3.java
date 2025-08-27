package defpackage;

/* renamed from: bx3  reason: default package */
public final class bx3 {
    public final int a;
    public final int b;
    public final long c;

    public bx3(int i, int i2, long j) {
        this.a = i;
        this.b = i2;
        this.c = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r6 = (defpackage.bx3) r6;
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
            boolean r1 = r6 instanceof defpackage.bx3
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            bx3 r6 = (defpackage.bx3) r6
            int r1 = r6.a
            int r3 = r5.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r1 = r5.b
            int r3 = r6.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            long r3 = r5.c
            long r5 = r6.c
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x0023
            return r2
        L_0x0023:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx3.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + rae.h(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(selStart=");
        sb.append(this.a);
        sb.append(", selEnd=");
        sb.append(this.b);
        sb.append(", link=");
        return wj6.m(sb, this.c, ")");
    }
}
