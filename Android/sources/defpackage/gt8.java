package defpackage;

/* renamed from: gt8  reason: default package */
public final class gt8 {
    public final ft8 a;
    public final ft8 b;
    public final ft8 c;
    public final ft8 d;

    public gt8(ft8 ft8, ft8 ft82, ft8 ft83, ft8 ft84) {
        this.a = ft8;
        this.b = ft82;
        this.c = ft83;
        this.d = ft84;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.gt8) r5;
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
            boolean r1 = r5 instanceof defpackage.gt8
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            gt8 r5 = (defpackage.gt8) r5
            ft8 r1 = r5.a
            ft8 r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            ft8 r1 = r4.b
            ft8 r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            ft8 r1 = r4.c
            ft8 r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            ft8 r4 = r4.d
            ft8 r5 = r5.d
            if (r4 == r5) goto L_0x0028
            return r2
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt8.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MediaOptions(audioState=" + this.a + ", videoState=" + this.b + ", screenshareState=" + this.c + ", movieSharingState=" + this.d + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ gt8() {
        /*
            r1 = this;
            ft8 r0 = defpackage.ft8.a
            r1.<init>(r0, r0, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt8.<init>():void");
    }
}
