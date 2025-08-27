package defpackage;

import kotlin.jvm.functions.Function1;

/* renamed from: c3c  reason: default package */
public final class c3c extends t3c {
    public final int a;
    public final Function1 b;
    public final ogf c;
    public final int o;

    public c3c(int i, ogf ogf, int i2) {
        oo9 oo9 = new oo9(24);
        ogf = (i2 & 4) != 0 ? puf.t : ogf;
        this.a = i;
        this.b = oo9;
        this.c = ogf;
        this.o = 4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.c3c) r5;
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
            boolean r1 = r5 instanceof defpackage.c3c
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            c3c r5 = (defpackage.c3c) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            kotlin.jvm.functions.Function1 r1 = r4.b
            kotlin.jvm.functions.Function1 r3 = r5.b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            ogf r4 = r4.c
            ogf r5 = r5.c
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x0029
            return r2
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c3c.equals(java.lang.Object):boolean");
    }

    public final long getItemId() {
        return (long) 4;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final int i() {
        return this.o;
    }

    public final String toString() {
        return "Section(title=" + this.a + ", textColor=" + this.b + ", typography=" + this.c + ")";
    }
}
