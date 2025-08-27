package defpackage;

/* renamed from: nr0  reason: default package */
public final class nr0 {
    public final jdb a;
    public final mr0 b;
    public final boolean c;

    public nr0(jdb jdb, mr0 mr0, boolean z) {
        this.a = jdb;
        this.b = mr0;
        this.c = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.nr0) r5;
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
            boolean r1 = r5 instanceof defpackage.nr0
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            nr0 r5 = (defpackage.nr0) r5
            jdb r1 = r5.a
            jdb r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            mr0 r1 = r4.b
            mr0 r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            boolean r4 = r4.c
            boolean r5 = r5.c
            if (r4 == r5) goto L_0x0021
            return r2
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nr0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Boolean.hashCode(this.c) + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomInsetConfig(persistentType=");
        sb.append(this.a);
        sb.append(", imeInsetChange=");
        sb.append(this.b);
        sb.append(", applyDeviceRoundCorners=");
        return tr1.m(sb, this.c, ")");
    }
}
