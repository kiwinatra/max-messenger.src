package defpackage;

/* renamed from: jl1  reason: default package */
public final class jl1 {
    public static final jl1 d = new jl1(il1.b, (CharSequence) null, (CharSequence) null);
    public final il1 a;
    public final CharSequence b;
    public final CharSequence c;

    public jl1(il1 il1, CharSequence charSequence, CharSequence charSequence2) {
        this.a = il1;
        this.b = charSequence;
        this.c = charSequence2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.jl1) r5;
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
            boolean r1 = r5 instanceof defpackage.jl1
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            jl1 r5 = (defpackage.jl1) r5
            il1 r1 = r5.a
            il1 r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.lang.CharSequence r1 = r4.b
            java.lang.CharSequence r3 = r5.b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            java.lang.CharSequence r4 = r4.c
            java.lang.CharSequence r5 = r5.c
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x0029
            return r2
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jl1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.c;
        if (charSequence2 != null) {
            i = charSequence2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "CallTimeData(place=" + this.a + ", title=" + this.b + ", status=" + this.c + ")";
    }
}
