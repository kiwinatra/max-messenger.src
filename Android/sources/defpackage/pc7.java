package defpackage;

/* renamed from: pc7  reason: default package */
public final class pc7 {
    public final nc7 a;
    public final int b;

    public pc7(nc7 nc7, int i) {
        this.a = nc7;
        this.b = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.pc7) r5;
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
            boolean r1 = r5 instanceof defpackage.pc7
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            pc7 r5 = (defpackage.pc7) r5
            nc7 r1 = r5.a
            nc7 r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r4 = r4.b
            int r5 = r5.b
            if (r4 == r5) goto L_0x001a
            return r2
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc7.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TriggeredCondition(key=");
        sb.append(this.a);
        sb.append(", quantity=");
        return wj6.l(sb, this.b, ")");
    }
}
