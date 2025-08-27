package defpackage;

/* renamed from: pr0  reason: default package */
public final class pr0 {
    public final aj8 a;
    public final aj8 b;
    public final u41 c;

    public pr0(aj8 aj8, aj8 aj82, u41 u41) {
        this.a = aj8;
        this.b = aj82;
        this.c = u41;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.pr0) r5;
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
            boolean r1 = r5 instanceof defpackage.pr0
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            pr0 r5 = (defpackage.pr0) r5
            aj8 r1 = r5.a
            aj8 r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            aj8 r1 = r4.b
            aj8 r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            u41 r4 = r4.c
            u41 r5 = r5.c
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x0025
            return r2
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pr0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BottomPanelState(isMicrophoneEnabled=" + this.a + ", isVideoEnabled=" + this.b + ", dynamicType=" + this.c + ")";
    }
}
