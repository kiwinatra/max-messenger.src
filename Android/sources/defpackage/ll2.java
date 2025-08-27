package defpackage;

/* renamed from: ll2  reason: default package */
public final class ll2 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public ll2(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.ll2) r5;
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
            boolean r1 = r5 instanceof defpackage.ll2
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            ll2 r5 = (defpackage.ll2) r5
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
            boolean r1 = r4.d
            boolean r3 = r5.d
            if (r1 == r3) goto L_0x0028
            return r2
        L_0x0028:
            boolean r1 = r4.e
            boolean r3 = r5.e
            if (r1 == r3) goto L_0x002f
            return r2
        L_0x002f:
            boolean r1 = r4.f
            boolean r3 = r5.f
            if (r1 == r3) goto L_0x0036
            return r2
        L_0x0036:
            boolean r1 = r4.g
            boolean r3 = r5.g
            if (r1 == r3) goto L_0x003d
            return r2
        L_0x003d:
            boolean r1 = r4.h
            boolean r3 = r5.h
            if (r1 == r3) goto L_0x0044
            return r2
        L_0x0044:
            boolean r1 = r4.i
            boolean r3 = r5.i
            if (r1 == r3) goto L_0x004b
            return r2
        L_0x004b:
            boolean r4 = r4.j
            boolean r5 = r5.j
            if (r4 == r5) goto L_0x0052
            return r2
        L_0x0052:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ll2.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + g63.e(g63.e(g63.e(g63.e(g63.e(g63.e(g63.e(g63.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatOptions(signAdmin=");
        sb.append(this.a);
        sb.append(", onlyOwnerCanChangeIconTitle=");
        sb.append(this.b);
        sb.append(", official=");
        sb.append(this.c);
        sb.append(", onlyAdminCanAddMember=");
        sb.append(this.d);
        sb.append(", allCanPinMessage=");
        sb.append(this.e);
        sb.append(", ok=");
        sb.append(this.f);
        sb.append(", onlyAdminCanCall=");
        sb.append(this.g);
        sb.append(", sentByPhone=");
        sb.append(this.h);
        sb.append(", serviceChat=");
        sb.append(this.i);
        sb.append(", membersCanSeePrivateLink=");
        return tr1.m(sb, this.j, ")");
    }
}
