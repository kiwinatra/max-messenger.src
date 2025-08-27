package defpackage;

/* renamed from: s8b  reason: default package */
public final class s8b extends u8b {
    public final int a;
    public final vk3 b;
    public final boolean c;
    public final String d;

    public s8b(int i, vk3 vk3, boolean z, String str) {
        this.a = i;
        this.b = vk3;
        this.c = z;
        this.d = str;
        s8b.class.hashCode();
        hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.s8b) r5;
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
            boolean r1 = r5 instanceof defpackage.s8b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            s8b r5 = (defpackage.s8b) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            vk3 r1 = r4.b
            vk3 r3 = r5.b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            boolean r1 = r4.c
            boolean r3 = r5.c
            if (r1 == r3) goto L_0x0025
            return r2
        L_0x0025:
            java.lang.String r4 = r4.d
            java.lang.String r5 = r5.d
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x0030
            return r2
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s8b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.d.hashCode() + g63.e((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "Face(index=" + this.a + ", contact=" + this.b + ", isAnon=" + this.c + ", name=" + this.d + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s8b(int r5, defpackage.vk3 r6) {
        /*
            r4 = this;
            java.lang.String r0 = r6.f()
            if (r0 == 0) goto L_0x002e
            java.lang.CharSequence r0 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = " "
            r2 = 6
            r3 = 0
            int r1 = kotlin.text.StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) r0, (java.lang.String) r1, (int) r3, false, (int) r2, (java.lang.Object) null)
            r2 = -1
            if (r1 != r2) goto L_0x001a
            goto L_0x002a
        L_0x001a:
            java.lang.String r2 = r0.substring(r3, r1)
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r1 = "\n"
            java.lang.String r0 = defpackage.g63.i(r2, r1, r0)
        L_0x002a:
            r4.<init>(r5, r6, r3, r0)
            return
        L_0x002e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Required value was null."
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s8b.<init>(int, vk3):void");
    }
}
