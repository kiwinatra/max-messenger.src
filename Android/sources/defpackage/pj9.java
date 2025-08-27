package defpackage;

import java.util.List;

/* renamed from: pj9  reason: default package */
public final class pj9 {
    public final int a;
    public final int b;
    public final boolean c;

    public pj9(a32 a32, a89 a89, boolean z) {
        int hashCode = a89.c(a32).hashCode();
        List list = a89.a.P0;
        int hashCode2 = list != null ? list.hashCode() : 0;
        this.a = hashCode;
        this.b = hashCode2;
        this.c = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.pj9) r5;
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
            boolean r1 = r5 instanceof defpackage.pj9
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            pj9 r5 = (defpackage.pj9) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r1 = r4.b
            int r3 = r5.b
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pj9.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rae.h(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(textHash=");
        sb.append(this.a);
        sb.append(", messageElementsHash=");
        sb.append(this.b);
        sb.append(", isChild=");
        return tr1.m(sb, this.c, ")");
    }
}
