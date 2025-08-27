package defpackage;

/* renamed from: h8b  reason: default package */
public final class h8b {
    public static final h8b e = new h8b((zfe) null, (Long) null, 15);
    public final hnb a;
    public final s5a b;
    public final zfe c;
    public final Long d;

    public h8b(hnb hnb, s5a s5a, zfe zfe, Long l) {
        this.a = hnb;
        this.b = s5a;
        this.c = zfe;
        this.d = l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.h8b) r5;
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
            boolean r1 = r5 instanceof defpackage.h8b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            h8b r5 = (defpackage.h8b) r5
            hnb r1 = r5.a
            hnb r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            s5a r1 = r4.b
            s5a r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            zfe r1 = r4.c
            zfe r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            java.lang.Long r4 = r4.d
            java.lang.Long r5 = r5.d
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x002c
            return r2
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h8b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        hnb hnb = this.a;
        int hashCode = (hnb == null ? 0 : hnb.hashCode()) * 31;
        s5a s5a = this.b;
        int hashCode2 = (hashCode + (s5a == null ? 0 : s5a.hashCode())) * 31;
        zfe zfe = this.c;
        int hashCode3 = (hashCode2 + (zfe == null ? 0 : zfe.hashCode())) * 31;
        Long l = this.d;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "Params(pipType=" + this.a + ", navReason=" + this.b + ", sourceType=" + this.c + ", sourceId=" + this.d + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h8b(zfe zfe, Long l, int i) {
        this((hnb) null, (s5a) null, (i & 4) != 0 ? null : zfe, (i & 8) != 0 ? null : l);
    }
}
