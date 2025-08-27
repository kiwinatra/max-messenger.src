package defpackage;

/* renamed from: b3c  reason: default package */
public final class b3c extends t3c {
    public final int a;
    public final aqa b;
    public final zpa c;
    public final xpa o;
    public final int v = 2;

    public b3c(int i) {
        aqa aqa = aqa.c;
        zpa zpa = zpa.a;
        xpa xpa = xpa.o;
        this.a = i;
        this.b = aqa;
        this.c = zpa;
        this.o = xpa;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.b3c) r5;
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
            boolean r1 = r5 instanceof defpackage.b3c
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            b3c r5 = (defpackage.b3c) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            aqa r1 = r4.b
            aqa r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            zpa r1 = r4.c
            zpa r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            xpa r4 = r4.o
            xpa r5 = r5.o
            if (r4 == r5) goto L_0x0028
            return r2
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b3c.equals(java.lang.Object):boolean");
    }

    public final long getItemId() {
        return (long) 2;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.o.hashCode() + ((hashCode2 + ((hashCode + (Integer.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final int i() {
        return this.v;
    }

    public final String toString() {
        return "MainButtonAction(title=" + this.a + ", size=" + this.b + ", mode=" + this.c + ", appearance=" + this.o + ")";
    }
}
