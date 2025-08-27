package defpackage;

/* renamed from: gld  reason: default package */
public final class gld implements lld {
    public static final gld e = new gld(0, 0, false, false);
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public gld(int i, int i2, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.gld) r5;
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
            boolean r1 = r5 instanceof defpackage.gld
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            gld r5 = (defpackage.gld) r5
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gld.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + g63.e(rae.h(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Active(totalMessages=");
        sb.append(this.a);
        sb.append(", selectMessagePosition=");
        sb.append(this.b);
        sb.append(", hasPrev=");
        sb.append(this.c);
        sb.append(", hasAfter=");
        return tr1.m(sb, this.d, ")");
    }
}
