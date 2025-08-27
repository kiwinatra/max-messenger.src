package defpackage;

/* renamed from: a54  reason: default package */
public final class a54 implements d8 {
    public final int a;
    public final ngf b;
    public final int c;

    public a54(int i, int i2, ngf ngf) {
        this.a = i;
        this.b = ngf;
        this.c = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.a54) r5;
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
            boolean r1 = r5 instanceof defpackage.a54
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            a54 r5 = (defpackage.a54) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            ngf r1 = r4.b
            ngf r3 = r5.b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            int r4 = r4.c
            int r5 = r5.c
            if (r4 == r5) goto L_0x0025
            return r2
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a54.equals(java.lang.Object):boolean");
    }

    public final int getIcon() {
        return this.a;
    }

    public final int getId() {
        return this.c;
    }

    public final ngf getName() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + i2a.g(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomContextAction(icon=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", id=");
        return wj6.l(sb, this.c, ")");
    }
}
