package defpackage;

/* renamed from: p3c  reason: default package */
public final class p3c extends t3c {
    public final int a;
    public final s1e b;
    public final boolean c;
    public final int o;

    public p3c(int i, s1e s1e, boolean z, int i2) {
        this.a = i;
        this.b = s1e;
        this.c = z;
        this.o = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.p3c) r5;
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
            boolean r1 = r5 instanceof defpackage.p3c
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            p3c r5 = (defpackage.p3c) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            s1e r1 = r4.b
            s1e r3 = r5.b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            boolean r1 = r4.c
            boolean r3 = r5.c
            if (r1 == r3) goto L_0x0025
            return r2
        L_0x0025:
            int r4 = r4.o
            int r5 = r5.o
            boolean r4 = defpackage.hi7.l(r4, r5)
            if (r4 != 0) goto L_0x0030
            return r2
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p3c.equals(java.lang.Object):boolean");
    }

    public final long getItemId() {
        return (long) this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.o) + g63.e((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
    }

    public final int i() {
        return this.o;
    }

    public final String toString() {
        String d0 = hi7.d0(this.o);
        return "InviteActionItem(actionId=" + this.a + ", model=" + this.b + ", isEnabled=" + this.c + ", itemViewType=" + d0 + ")";
    }
}
