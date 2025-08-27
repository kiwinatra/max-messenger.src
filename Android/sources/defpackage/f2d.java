package defpackage;

/* renamed from: f2d  reason: default package */
public final class f2d {
    public final d2d a;
    public final b2d b;
    public final String c;
    public final x10 d;
    public final long e;

    public f2d(d2d d2d, b2d b2d, String str, x10 x10, long j) {
        this.a = d2d;
        this.b = b2d;
        this.c = str;
        this.d = x10;
        this.e = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r6 = (defpackage.f2d) r6;
        r1 = r6.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof defpackage.f2d
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            f2d r6 = (defpackage.f2d) r6
            d2d r1 = r6.a
            d2d r3 = r5.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            b2d r1 = r5.b
            b2d r3 = r6.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            java.lang.String r1 = r5.c
            java.lang.String r3 = r6.c
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0025
            return r2
        L_0x0025:
            x10 r1 = r5.d
            x10 r3 = r6.d
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0030
            return r2
        L_0x0030:
            long r3 = r5.e
            long r5 = r6.e
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x0039
            return r2
        L_0x0039:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f2d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int d2 = g63.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        x10 x10 = this.d;
        return Long.hashCode(this.e) + ((d2 + (x10 == null ? 0 : x10.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplyButton(type=");
        sb.append(this.a);
        sb.append(", intent=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", image=");
        sb.append(this.d);
        sb.append(", outgoingMessageId=");
        return wj6.m(sb, this.e, ")");
    }
}
