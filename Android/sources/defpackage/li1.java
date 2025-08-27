package defpackage;

/* renamed from: li1  reason: default package */
public final class li1 {
    public static final li1 f = new li1(false, false, false, (ze1) null, false, (y8b) null);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final ze1 d;
    public final y8b e;

    public li1(boolean z, boolean z2, boolean z3, ze1 ze1, boolean z4, y8b y8b) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = ze1;
        this.e = y8b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.li1) r5;
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
            boolean r1 = r5 instanceof defpackage.li1
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            li1 r5 = (defpackage.li1) r5
            boolean r1 = r5.a
            boolean r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            boolean r1 = r4.b
            boolean r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            boolean r1 = r4.c
            boolean r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            ze1 r1 = r4.d
            ze1 r3 = r5.d
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x002c
            return r2
        L_0x002c:
            y8b r4 = r4.e
            y8b r5 = r5.e
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x0037
            return r2
        L_0x0037:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.li1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int e2 = g63.e(g63.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        int i = 0;
        ze1 ze1 = this.d;
        int e3 = g63.e((e2 + (ze1 == null ? 0 : ze1.hashCode())) * 31, 31, false);
        y8b y8b = this.e;
        if (y8b != null) {
            i = y8b.hashCode();
        }
        return e3 + i;
    }

    public final String toString() {
        return "CallScreenRecordState(isMe=" + this.a + ", meIsAdmin=" + this.b + ", isRecordStateEnabled=" + this.c + ", recordScreenOpponentId=" + this.d + ", isAdminDisableScreenRecord=false, opponentInfo=" + this.e + ")";
    }
}
