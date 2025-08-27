package defpackage;

/* renamed from: xz  reason: default package */
public final class xz {
    public static final xz f = new xz(false, false, false, (o00) null, (zf7) null);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final o00 d;
    public final zf7 e;

    public xz(boolean z, boolean z2, boolean z3, o00 o00, zf7 zf7) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = o00;
        this.e = zf7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.xz) r5;
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
            boolean r1 = r5 instanceof defpackage.xz
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            xz r5 = (defpackage.xz) r5
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
            o00 r1 = r4.d
            o00 r3 = r5.d
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x002c
            return r2
        L_0x002c:
            zf7 r4 = r4.e
            zf7 r5 = r5.e
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x0037
            return r2
        L_0x0037:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xz.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int e2 = g63.e(g63.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        int i = 0;
        o00 o00 = this.d;
        int hashCode = (e2 + (o00 == null ? 0 : o00.hashCode())) * 31;
        zf7 zf7 = this.e;
        if (zf7 != null) {
            i = zf7.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AttachInfo(hasPhoto=" + this.a + ", hasInlineKeyboard=" + this.b + ", hasReplyKeyboard=" + this.c + ", attachModel=" + this.d + ", inlineKeyboard=" + this.e + ")";
    }
}
