package defpackage;

/* renamed from: lf5  reason: default package */
public final class lf5 {
    public final int a = 0;
    public final int b = 0;
    public final Object c;
    public final int d;

    public lf5(pm6 pm6) {
        this.c = pm6;
        this.d = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.lf5) r5;
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
            boolean r1 = r5 instanceof defpackage.lf5
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            lf5 r5 = (defpackage.lf5) r5
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
            java.lang.Object r1 = r4.c
            java.lang.Object r3 = r5.c
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0025
            return r2
        L_0x0025:
            int r4 = r4.d
            int r5 = r5.d
            if (r4 == r5) goto L_0x002c
            return r2
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lf5.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int h = rae.h(this.b, Integer.hashCode(this.a) * 31, 31);
        Object obj = this.c;
        return Integer.hashCode(this.d) + ((h + (obj == null ? 0 : obj.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtraActionItem(icon=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", action=");
        sb.append(this.c);
        sb.append(", count=");
        return wj6.l(sb, this.d, ")");
    }
}
