package defpackage;

/* renamed from: g24  reason: default package */
public final class g24 implements lz7 {
    public final int a;
    public final int b;
    public final ngf c;

    public g24(int i, int i2, igf igf) {
        this.a = i;
        this.b = i2;
        this.c = igf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.g24) r5;
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
            boolean r1 = r5 instanceof defpackage.g24
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            g24 r5 = (defpackage.g24) r5
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
            ngf r4 = r4.c
            ngf r5 = r5.c
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x0025
            return r2
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g24.equals(java.lang.Object):boolean");
    }

    public final long getItemId() {
        return (long) this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + rae.h(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final int i() {
        return f1b.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateButton(id=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", text=");
        return g63.k(sb, this.c, ")");
    }
}
