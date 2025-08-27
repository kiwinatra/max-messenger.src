package defpackage;

/* renamed from: xea  reason: default package */
public final class xea {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public xea(int i, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = i != 0;
    }

    public static xea a(xea xea, int i, boolean z, boolean z2, boolean z3, int i2) {
        if ((i2 & 1) != 0) {
            i = xea.a;
        }
        if ((i2 & 2) != 0) {
            z = xea.b;
        }
        if ((i2 & 4) != 0) {
            z2 = xea.c;
        }
        if ((i2 & 8) != 0) {
            z3 = xea.d;
        }
        xea.getClass();
        return new xea(i, z, z2, z3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.xea) r5;
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
            boolean r1 = r5 instanceof defpackage.xea
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            xea r5 = (defpackage.xea) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            boolean r1 = r4.b
            boolean r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            boolean r1 = r4.c
            boolean r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            boolean r4 = r4.d
            boolean r5 = r5.d
            if (r4 == r5) goto L_0x0028
            return r2
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xea.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + g63.e(g63.e(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "NotificationStackModel(hasCounterValue=" + this.a + ", hasReaction=" + this.b + ", hasMention=" + this.c + ", isMuted=" + this.d + ")";
    }
}
