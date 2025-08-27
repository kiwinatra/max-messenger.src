package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: xj7  reason: default package */
public final class xj7 implements lz7 {
    public final wj7 a;
    public final ngf b;
    public final Integer c;
    public final int o = wua.c;
    public final long v;

    public xj7(wj7 wj7, igf igf, Integer num) {
        this.a = wj7;
        this.b = igf;
        this.c = num;
        this.v = (long) wj7.ordinal();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.xj7) r5;
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
            boolean r1 = r5 instanceof defpackage.xj7
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            xj7 r5 = (defpackage.xj7) r5
            wj7 r1 = r5.a
            wj7 r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            ngf r1 = r4.b
            ngf r3 = r5.b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            java.lang.Integer r4 = r4.c
            java.lang.Integer r5 = r5.c
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x0029
            return r2
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xj7.equals(java.lang.Object):boolean");
    }

    public final boolean f(lz7 lz7) {
        return this.v == lz7.getItemId();
    }

    public final long getItemId() {
        return this.v;
    }

    public final int hashCode() {
        int g = i2a.g(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return g + (num == null ? 0 : num.hashCode());
    }

    public final int i() {
        return this.o;
    }

    public final boolean r(Object obj) {
        return Intrinsics.areEqual((Object) this, (Object) (lz7) obj);
    }

    public final String toString() {
        return "InviteActionListItem(type=" + this.a + ", text=" + this.b + ", icon=" + this.c + ")";
    }
}
