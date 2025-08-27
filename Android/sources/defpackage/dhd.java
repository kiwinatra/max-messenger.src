package defpackage;

/* renamed from: dhd  reason: default package */
public final class dhd {
    public static final dhd d = new dhd(ehd.o, (zgd) null, false);
    public final ehd a;
    public final zgd b;
    public final boolean c;

    public dhd(ehd ehd, zgd zgd, boolean z) {
        this.a = ehd;
        this.b = zgd;
        this.c = z;
    }

    public static dhd a(dhd dhd, ehd ehd, zgd zgd, boolean z, int i) {
        if ((i & 1) != 0) {
            ehd = dhd.a;
        }
        if ((i & 2) != 0) {
            zgd = dhd.b;
        }
        if ((i & 4) != 0) {
            z = dhd.c;
        }
        dhd.getClass();
        return new dhd(ehd, zgd, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.dhd) r5;
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
            boolean r1 = r5 instanceof defpackage.dhd
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            dhd r5 = (defpackage.dhd) r5
            ehd r1 = r5.a
            ehd r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            zgd r1 = r4.b
            zgd r3 = r5.b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            boolean r4 = r4.c
            boolean r5 = r5.c
            if (r4 == r5) goto L_0x0025
            return r2
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhd.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zgd zgd = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (zgd == null ? 0 : zgd.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenRecordData(state=");
        sb.append(this.a);
        sb.append(", data=");
        sb.append(this.b);
        sb.append(", isApproved=");
        return tr1.m(sb, this.c, ")");
    }
}
