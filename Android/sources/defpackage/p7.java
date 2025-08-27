package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: p7  reason: default package */
public final class p7 implements tzb {
    public final int a;
    public final s1e b;
    public final int c;

    public /* synthetic */ p7(int i, s1e s1e) {
        this(i, s1e, 1024);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.p7) r5;
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
            boolean r1 = r5 instanceof defpackage.p7
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            p7 r5 = (defpackage.p7) r5
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
            int r4 = r4.c
            int r5 = r5.c
            boolean r4 = defpackage.tf6.D(r4, r5)
            if (r4 != 0) goto L_0x0029
            return r2
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p7.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r3 = ((defpackage.p7) r3).a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(defpackage.lz7 r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof defpackage.p7
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            p7 r3 = (defpackage.p7) r3
            int r3 = r3.a
            int r2 = r2.a
            if (r2 != r3) goto L_0x000f
            r1 = 1
        L_0x000f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p7.f(lz7):boolean");
    }

    public final long getItemId() {
        return (long) this.a;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Integer.hashCode(this.c) + ((hashCode + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final int i() {
        return this.c;
    }

    public final boolean r(Object obj) {
        lz7 lz7 = (lz7) obj;
        if ((lz7 instanceof p7) && !(((p7) lz7).b.x instanceof d1e)) {
            return Intrinsics.areEqual((Object) this, (Object) lz7);
        }
        return false;
    }

    public final String toString() {
        String p0 = tf6.p0(this.c);
        return "ActionItem(actionId=" + this.a + ", model=" + this.b + ", itemViewType=" + p0 + ")";
    }

    public p7(int i, s1e s1e, int i2) {
        this.a = i;
        this.b = s1e;
        this.c = i2;
    }
}
