package defpackage;

/* renamed from: hbb  reason: default package */
public final class hbb {
    public final boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final Integer h;

    public hbb(boolean z, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, Integer num3, Integer num4) {
        this.a = z;
        this.b = bool;
        this.c = bool2;
        this.d = bool3;
        this.e = num;
        this.f = num2;
        this.g = num3;
        this.h = num4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.hbb) r5;
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
            boolean r1 = r5 instanceof defpackage.hbb
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            hbb r5 = (defpackage.hbb) r5
            boolean r1 = r5.a
            boolean r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.lang.Boolean r1 = r4.b
            java.lang.Boolean r3 = r5.b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            java.lang.Boolean r1 = r4.c
            java.lang.Boolean r3 = r5.c
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0029
            return r2
        L_0x0029:
            java.lang.Boolean r1 = r4.d
            java.lang.Boolean r3 = r5.d
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0034
            return r2
        L_0x0034:
            java.lang.Integer r1 = r4.e
            java.lang.Integer r3 = r5.e
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x003f
            return r2
        L_0x003f:
            java.lang.Integer r1 = r4.f
            java.lang.Integer r3 = r5.f
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x004a
            return r2
        L_0x004a:
            java.lang.Integer r1 = r4.g
            java.lang.Integer r3 = r5.g
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0055
            return r2
        L_0x0055:
            java.lang.Integer r4 = r4.h
            java.lang.Integer r5 = r5.h
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x0060
            return r2
        L_0x0060:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbb.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        int i = 0;
        Boolean bool = this.b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.c;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.d;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.e;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.g;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.h;
        if (num4 != null) {
            i = num4.hashCode();
        }
        return hashCode7 + i;
    }

    public final String toString() {
        return "DynamicRedundancyParams(isEnabled=" + this.a + ", isNoLaceEnabled=" + this.b + ", isDREDWithFecEnabled=" + this.c + ", isDREDLowBitrateEnabled=" + this.d + ", minAudioBitrateBps=" + this.e + ", dREDSwitchBitrateBps=" + this.f + ", pTimeMinMs=" + this.g + ", pTimeMaxMs=" + this.h + ")";
    }
}
