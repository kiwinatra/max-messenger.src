package defpackage;

import java.util.List;

/* renamed from: xbb  reason: default package */
public final class xbb {
    public final ybb a;
    public final long b;
    public final String c = null;
    public final String d = null;
    public long e = -1;
    public long f = -1;
    public long g = -1;
    public List h;

    public xbb(ybb ybb, long j) {
        this.a = ybb;
        this.b = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r8 = (defpackage.xbb) r8;
        r1 = r8.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof defpackage.xbb
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            xbb r8 = (defpackage.xbb) r8
            ybb r1 = r8.a
            ybb r3 = r7.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            long r3 = r7.b
            long r5 = r8.b
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x001c
            return r2
        L_0x001c:
            java.lang.String r1 = r7.c
            java.lang.String r3 = r8.c
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0027
            return r2
        L_0x0027:
            java.lang.String r7 = r7.d
            java.lang.String r8 = r8.d
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 != 0) goto L_0x0032
            return r2
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbb.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = wzf.i(this.a.hashCode() * 31, 31, this.b);
        int i2 = 0;
        String str = this.c;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PerfSpan(name=");
        sb.append(this.a);
        sb.append(", startTime=");
        sb.append(this.b);
        sb.append(", parentSpanName=");
        sb.append(this.c);
        sb.append(", prevSpanName=");
        return wj6.n(sb, this.d, ")");
    }
}
