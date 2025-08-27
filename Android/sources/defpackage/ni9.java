package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ni9  reason: default package */
public final class ni9 {
    public static final ni9 d = new ni9(false, false, (mi9) null);
    public final boolean a;
    public final boolean b;
    public final mi9 c;

    public ni9(boolean z, boolean z2, mi9 mi9) {
        this.a = z;
        this.b = z2;
        this.c = mi9;
        Intrinsics.areEqual((Object) this, (Object) d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.ni9) r5;
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
            boolean r1 = r5 instanceof defpackage.ni9
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            ni9 r5 = (defpackage.ni9) r5
            boolean r1 = r5.a
            boolean r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            boolean r1 = r4.b
            boolean r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            mi9 r4 = r4.c
            mi9 r5 = r5.c
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x0025
            return r2
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ni9.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int e = g63.e(Boolean.hashCode(this.a) * 31, 31, this.b);
        mi9 mi9 = this.c;
        return e + (mi9 == null ? 0 : mi9.hashCode());
    }

    public final String toString() {
        return "MessagesAdapterPayload(areReactionsChanged=" + this.a + ", areKeywordSpansChanged=" + this.b + ", transcriptionPayload=" + this.c + ")";
    }
}
