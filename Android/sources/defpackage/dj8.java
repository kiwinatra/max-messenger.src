package defpackage;

/* renamed from: dj8  reason: default package */
public final class dj8 {
    public final cj8 a;
    public final kbb b;
    public final boolean c;

    public dj8(cj8 cj8, kbb kbb, boolean z) {
        this.a = cj8;
        this.b = kbb;
        this.c = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.dj8) r5;
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
            boolean r1 = r5 instanceof defpackage.dj8
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            dj8 r5 = (defpackage.dj8) r5
            cj8 r1 = r5.a
            cj8 r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            kbb r1 = r4.b
            kbb r3 = r5.b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            boolean r4 = r4.c
            boolean r5 = r5.c
            if (r4 == r5) goto L_0x0025
            return r2
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dj8.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kbb kbb = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (kbb == null ? 0 : kbb.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkConditionChange(condition=");
        sb.append(this.a);
        sb.append(", suggestedVideoSettings=");
        sb.append(this.b);
        sb.append(", preferHardwarePVXEncoder=");
        return tr1.m(sb, this.c, ")");
    }
}
