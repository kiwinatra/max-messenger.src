package defpackage;

/* renamed from: qqc  reason: default package */
public final class qqc {
    public final rqc a;
    public final hqc b;

    public qqc(rqc rqc, hqc hqc) {
        this.a = rqc;
        this.b = hqc;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.qqc) r5;
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
            boolean r1 = r5 instanceof defpackage.qqc
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            qqc r5 = (defpackage.qqc) r5
            rqc r1 = r5.a
            rqc r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            hqc r4 = r4.b
            hqc r5 = r5.b
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x001e
            return r2
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qqc.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReactionData(type=" + this.a + ", id=" + this.b + ")";
    }
}
