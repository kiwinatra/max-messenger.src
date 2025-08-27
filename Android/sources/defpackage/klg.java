package defpackage;

/* renamed from: klg  reason: default package */
public final class klg {
    public final boolean a;
    public final Integer b;
    public final boolean c;
    public final Integer d;
    public final boolean e;
    public final boolean f;

    public klg(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        this.a = z;
        this.b = num;
        this.c = z2;
        this.d = num2;
        this.e = z3;
        this.f = z4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r3 = (defpackage.klg) r3;
        r0 = r3.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0037
            boolean r0 = r3 instanceof defpackage.klg
            if (r0 == 0) goto L_0x0035
            klg r3 = (defpackage.klg) r3
            boolean r0 = r3.a
            boolean r1 = r2.a
            if (r1 != r0) goto L_0x0035
            java.lang.Integer r0 = r2.b
            java.lang.Integer r1 = r3.b
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 == 0) goto L_0x0035
            boolean r0 = r2.c
            boolean r1 = r3.c
            if (r0 != r1) goto L_0x0035
            java.lang.Integer r0 = r2.d
            java.lang.Integer r1 = r3.d
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 == 0) goto L_0x0035
            boolean r0 = r2.e
            boolean r1 = r3.e
            if (r0 != r1) goto L_0x0035
            boolean r2 = r2.f
            boolean r3 = r3.f
            if (r2 != r3) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r2 = 0
            return r2
        L_0x0037:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.klg.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        boolean z = true;
        boolean z2 = this.a;
        if (z2) {
            z2 = true;
        }
        int i = (z2 ? 1 : 0) * true;
        int i2 = 0;
        Integer num = this.b;
        int hashCode = (i + (num != null ? num.hashCode() : 0)) * 31;
        boolean z3 = this.c;
        if (z3) {
            z3 = true;
        }
        int i3 = (hashCode + (z3 ? 1 : 0)) * 31;
        Integer num2 = this.d;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        int i4 = (i3 + i2) * 31;
        boolean z4 = this.e;
        if (z4) {
            z4 = true;
        }
        int i5 = (i4 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f;
        if (!z5) {
            z = z5;
        }
        return i5 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb.append(this.a);
        sb.append(", clientMaxWindowBits=");
        sb.append(this.b);
        sb.append(", clientNoContextTakeover=");
        sb.append(this.c);
        sb.append(", serverMaxWindowBits=");
        sb.append(this.d);
        sb.append(", serverNoContextTakeover=");
        sb.append(this.e);
        sb.append(", unknownValues=");
        return tr1.m(sb, this.f, ")");
    }
}
