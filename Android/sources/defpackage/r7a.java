package defpackage;

/* renamed from: r7a  reason: default package */
public final class r7a {
    public final int a;
    public final Integer b;

    public r7a(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.r7a) r5;
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
            boolean r1 = r5 instanceof defpackage.r7a
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            r7a r5 = (defpackage.r7a) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.lang.Integer r4 = r4.b
            java.lang.Integer r5 = r5.b
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x001e
            return r2
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r7a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "NeuroAvatarScrollEvent(tabIndex=" + this.a + ", firstIndex=" + this.b + ")";
    }
}
