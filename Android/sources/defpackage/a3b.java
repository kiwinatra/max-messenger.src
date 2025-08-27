package defpackage;

import kotlin.jvm.functions.Function1;

/* renamed from: a3b  reason: default package */
public final class a3b implements d3b {
    public final int a;
    public final Function1 b;

    public a3b(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.a3b) r5;
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
            boolean r1 = r5 instanceof defpackage.a3b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            a3b r5 = (defpackage.a3b) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            kotlin.jvm.functions.Function1 r4 = r4.b
            kotlin.jvm.functions.Function1 r5 = r5.b
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x001e
            return r2
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a3b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Custom(iconRes=" + this.a + ", onClick=" + this.b + ")";
    }
}
