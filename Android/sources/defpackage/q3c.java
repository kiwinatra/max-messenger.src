package defpackage;

import kotlin.uuid.Uuid;

/* renamed from: q3c  reason: default package */
public final class q3c extends s3c {
    public final int a;

    public q3c(int i) {
        this.a = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r4 = ((defpackage.q3c) r4).a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r4 instanceof defpackage.q3c
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            q3c r4 = (defpackage.q3c) r4
            int r4 = r4.a
            int r3 = r3.a
            if (r3 == r4) goto L_0x0013
            return r2
        L_0x0013:
            r3 = -2147483520(0xffffffff80000080, float:-1.794E-43)
            boolean r3 = defpackage.hi7.l(r3, r3)
            if (r3 != 0) goto L_0x001d
            return r2
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q3c.equals(java.lang.Object):boolean");
    }

    public final long getItemId() {
        return (long) Uuid.SIZE_BITS;
    }

    public final int hashCode() {
        return Integer.hashCode(-2147483520) + (Integer.hashCode(this.a) * 31);
    }

    public final int i() {
        return -2147483520;
    }

    public final String toString() {
        String d0 = hi7.d0(-2147483520);
        return "ParticipantsCount(count=" + this.a + ", itemViewType=" + d0 + ")";
    }
}
