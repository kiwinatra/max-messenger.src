package defpackage;

import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: xpd  reason: default package */
public final class xpd implements tzb {
    public final int a;
    public final boolean b;
    public final ngf c;
    public final ngf o;
    public final int v;

    public xpd(int i, boolean z, igf igf, igf igf2, int i2) {
        this.a = i;
        this.b = z;
        this.c = igf;
        this.o = igf2;
        this.v = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.xpd) r5;
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
            boolean r1 = r5 instanceof defpackage.xpd
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            xpd r5 = (defpackage.xpd) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            boolean r1 = r4.b
            boolean r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            ngf r1 = r4.c
            ngf r3 = r5.c
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0025
            return r2
        L_0x0025:
            ngf r1 = r4.o
            ngf r3 = r5.o
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0030
            return r2
        L_0x0030:
            int r4 = r4.v
            int r5 = r5.v
            if (r4 == r5) goto L_0x0037
            return r2
        L_0x0037:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpd.equals(java.lang.Object):boolean");
    }

    public final boolean f(lz7 lz7) {
        return ((long) ConstantsKt.DEFAULT_BUFFER_SIZE) == lz7.getItemId();
    }

    public final long getItemId() {
        return (long) ConstantsKt.DEFAULT_BUFFER_SIZE;
    }

    public final int hashCode() {
        return Integer.hashCode(this.v) + i2a.g(i2a.g(g63.e(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.o);
    }

    public final int i() {
        return this.v;
    }

    public final boolean r(Object obj) {
        return Intrinsics.areEqual((Object) this, (Object) (lz7) obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectableItem(valueId=");
        sb.append(this.a);
        sb.append(", isSelected=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.o);
        sb.append(", viewType=");
        return wj6.l(sb, this.v, ")");
    }
}
