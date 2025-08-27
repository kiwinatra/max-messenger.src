package defpackage;

/* renamed from: lnf  reason: default package */
public final class lnf {
    public final boolean a;
    public final boolean b;
    public final vag c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final smf i;

    public lnf(boolean z, boolean z2, vag vag, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, smf smf) {
        this.a = z;
        this.b = z2;
        this.c = vag;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = smf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.lnf) r5;
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
            boolean r1 = r5 instanceof defpackage.lnf
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            lnf r5 = (defpackage.lnf) r5
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
            vag r1 = r4.c
            vag r3 = r5.c
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
            smf r4 = r4.i
            smf r5 = r5.i
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x004f
            return r2
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lnf.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int e2 = g63.e(Boolean.hashCode(this.a) * 31, 31, this.b);
        int i2 = 0;
        vag vag = this.c;
        int e3 = g63.e(g63.e(g63.e(g63.e(g63.e((e2 + (vag == null ? 0 : vag.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        smf smf = this.i;
        if (smf != null) {
            i2 = smf.hashCode();
        }
        return e3 + i2;
    }

    public final String toString() {
        return "TopPanelState(isGroupCall=" + this.a + ", shouldShowTitleAndStatus=" + this.b + ", mode=" + this.c + ", isVisible=" + this.d + ", isMenuEnabled=" + this.e + ", isRecordEnabled=" + this.f + ", isMoreButtonVisible=" + this.g + ", isAddUserEnabled=" + this.h + ", recordStateTooltip=" + this.i + ")";
    }
}
