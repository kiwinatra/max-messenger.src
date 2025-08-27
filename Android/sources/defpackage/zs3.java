package defpackage;

/* renamed from: zs3  reason: default package */
public final class zs3 {
    public final xs3 a;
    public final boolean b;

    public zs3(xs3 xs3) {
        this.a = xs3;
        this.b = xs3 == xs3.b || xs3 == xs3.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r4 = ((defpackage.zs3) r4).a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r4 instanceof defpackage.zs3
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            zs3 r4 = (defpackage.zs3) r4
            xs3 r4 = r4.a
            xs3 r3 = r3.a
            if (r3 == r4) goto L_0x0013
            return r2
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zs3.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ContactsBannerListItem(bannerType=" + this.a + ", isCloseable=false)";
    }
}
