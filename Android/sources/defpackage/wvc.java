package defpackage;

/* renamed from: wvc  reason: default package */
public final class wvc implements xvc {
    public final qvc a;
    public final ngf b;

    public wvc(qvc qvc, igf igf) {
        this.a = qvc;
        this.b = igf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.wvc) r5;
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
            boolean r1 = r5 instanceof defpackage.wvc
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            wvc r5 = (defpackage.wvc) r5
            qvc r1 = r5.a
            qvc r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            ngf r4 = r4.b
            ngf r5 = r5.b
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x001e
            return r2
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wvc.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowTooltip(recordControlType=" + this.a + ", textSource=" + this.b + ")";
    }
}
