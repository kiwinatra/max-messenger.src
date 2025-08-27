package defpackage;

/* renamed from: fwc  reason: default package */
public final class fwc implements gwc {
    public final boolean a;
    public final boolean b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fwc(int i, boolean z, boolean z2) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.fwc) r5;
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
            boolean r1 = r5 instanceof defpackage.fwc
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            fwc r5 = (defpackage.fwc) r5
            boolean r1 = r5.a
            boolean r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            boolean r4 = r4.b
            boolean r5 = r5.b
            if (r4 == r5) goto L_0x001a
            return r2
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fwc.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Stop(wasLocked=" + this.a + ", afterSwipe=" + this.b + ")";
    }

    public fwc(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
