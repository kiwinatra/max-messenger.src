package defpackage;

/* renamed from: t29  reason: default package */
public final class t29 implements lz7 {
    public final int a;
    public final ngf b;
    public final h1e c;
    public final Integer o;
    public final f1e v;
    public final long w;
    public final int x = uva.a;

    public t29(int i, ngf ngf, h1e h1e, Integer num, f1e f1e) {
        this.a = i;
        this.b = ngf;
        this.c = h1e;
        this.o = num;
        this.v = f1e;
        this.w = (long) i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.t29) r5;
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
            boolean r1 = r5 instanceof defpackage.t29
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            t29 r5 = (defpackage.t29) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            ngf r1 = r4.b
            ngf r3 = r5.b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            h1e r1 = r4.c
            h1e r3 = r5.c
            if (r1 == r3) goto L_0x0025
            return r2
        L_0x0025:
            java.lang.Integer r1 = r4.o
            java.lang.Integer r3 = r5.o
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0030
            return r2
        L_0x0030:
            f1e r4 = r4.v
            f1e r5 = r5.v
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x003b
            return r2
        L_0x003b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t29.equals(java.lang.Object):boolean");
    }

    public final long getItemId() {
        return this.w;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + i2a.g(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        int i = 0;
        Integer num = this.o;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        f1e f1e = this.v;
        if (f1e != null) {
            i = f1e.hashCode();
        }
        return hashCode2 + i;
    }

    public final int i() {
        return this.x;
    }

    public final String toString() {
        return "MemberListActionItem(id=" + this.a + ", text=" + this.b + ", type=" + this.c + ", startIconRes=" + this.o + ", endViewType=" + this.v + ")";
    }
}
