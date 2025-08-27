package defpackage;

/* renamed from: vh3  reason: default package */
public final class vh3 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public vh3(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public static vh3 a(vh3 vh3, boolean z, boolean z2, int i) {
        if ((i & 2) != 0) {
            z2 = vh3.b;
        }
        boolean z3 = vh3.c;
        boolean z4 = vh3.d;
        vh3.getClass();
        return new vh3(z, z2, z3, z4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.vh3) r5;
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
            boolean r1 = r5 instanceof defpackage.vh3
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            vh3 r5 = (defpackage.vh3) r5
            boolean r1 = r5.a
            boolean r3 = r4.a
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vh3.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + g63.e(g63.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "Inet(isConnected=" + this.a + ", isValidated=" + this.b + ", isMetered=" + this.c + ", isRoaming=" + this.d + ")";
    }
}
