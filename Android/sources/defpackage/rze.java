package defpackage;

/* renamed from: rze  reason: default package */
public final class rze {
    public static final oze Companion = new Object();
    public static final aq7[] c = {qze.Companion.serializer(), null};
    public final qze a;
    public final String b;

    public /* synthetic */ rze(int i, qze qze, String str) {
        if (1 == (i & 1)) {
            this.a = qze;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
        } else {
            gsg.G(i, 1, nze.a.d());
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.rze) r5;
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
            boolean r1 = r5 instanceof defpackage.rze
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            rze r5 = (defpackage.rze) r5
            qze r1 = r5.a
            qze r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.lang.String r4 = r4.b
            java.lang.String r5 = r5.b
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x001e
            return r2
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rze.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResponse(status=");
        sb.append(this.a);
        sb.append(", requestId=");
        return wj6.n(sb, this.b, ")");
    }

    public rze(qze qze, String str) {
        this.a = qze;
        this.b = str;
    }
}
