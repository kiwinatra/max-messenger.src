package defpackage;

import java.util.List;

/* renamed from: pn1  reason: default package */
public final class pn1 {
    public final vag a;
    public final List b;
    public final evf c;
    public final nr7 d;
    public final boolean e;
    public final zd0 f;

    public pn1(vag vag, List list, evf evf, nr7 nr7, boolean z, zd0 zd0) {
        this.a = vag;
        this.b = list;
        this.c = evf;
        this.d = nr7;
        this.e = z;
        this.f = zd0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.pn1) r5;
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
            boolean r1 = r5 instanceof defpackage.pn1
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            pn1 r5 = (defpackage.pn1) r5
            vag r1 = r5.a
            vag r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.util.List r1 = r4.b
            java.util.List r3 = r5.b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            evf r1 = r4.c
            evf r3 = r5.c
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0029
            return r2
        L_0x0029:
            nr7 r1 = r4.d
            nr7 r3 = r5.d
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0034
            return r2
        L_0x0034:
            boolean r1 = r4.e
            boolean r3 = r5.e
            if (r1 == r3) goto L_0x003b
            return r2
        L_0x003b:
            zd0 r4 = r4.f
            zd0 r5 = r5.f
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x0046
            return r2
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pn1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = rae.i(this.b, this.a.hashCode() * 31, 31);
        int i2 = 0;
        evf evf = this.c;
        int hashCode = (i + (evf == null ? 0 : evf.hashCode())) * 31;
        nr7 nr7 = this.d;
        int e2 = g63.e((hashCode + (nr7 == null ? 0 : nr7.hashCode())) * 31, 31, this.e);
        zd0 zd0 = this.f;
        if (zd0 != null) {
            i2 = zd0.hashCode();
        }
        return e2 + i2;
    }

    public final String toString() {
        return "CallViewState(activeMode=" + this.a + ", modes=" + this.b + ", unavailableCallState=" + this.c + ", labelSpeakerState=" + this.d + ", isGroupCall=" + this.e + ", mainSpeakerAvatar=" + this.f + ")";
    }
}
