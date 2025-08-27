package defpackage;

/* renamed from: ni1  reason: default package */
public final class ni1 {
    public static final ni1 e = new ni1(false, false, (ze1) null, false, false);
    public final boolean a;
    public final boolean b;
    public final ze1 c;
    public final boolean d;

    public ni1(boolean z, boolean z2, ze1 ze1, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = ze1;
        this.d = z4;
    }

    public final boolean a() {
        return this.a && this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.ni1) r5;
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
            boolean r1 = r5 instanceof defpackage.ni1
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            ni1 r5 = (defpackage.ni1) r5
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
            ze1 r1 = r4.c
            ze1 r3 = r5.c
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0025
            return r2
        L_0x0025:
            boolean r4 = r4.d
            boolean r5 = r5.d
            if (r4 == r5) goto L_0x002c
            return r2
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ni1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int e2 = g63.e(Boolean.hashCode(this.a) * 31, 31, this.b);
        ze1 ze1 = this.c;
        return Boolean.hashCode(this.d) + g63.e((e2 + (ze1 == null ? 0 : ze1.hashCode())) * 31, 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallScreenSharingState(isMe=");
        sb.append(this.a);
        sb.append(", isSharingStateEnabled=");
        sb.append(this.b);
        sb.append(", sharedScreenOpponentId=");
        sb.append(this.c);
        sb.append(", isAdminDisableScreenSharing=false, isMeAudioSharingEnabled=");
        return tr1.m(sb, this.d, ")");
    }
}
