package defpackage;

/* renamed from: sy6  reason: default package */
public final class sy6 {
    public final int a;
    public final String b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;

    public sy6(int i, String str, float f2, float f3, float f4, float f5, float f6) {
        this.a = i;
        this.b = str;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.sy6) r5;
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
            boolean r1 = r5 instanceof defpackage.sy6
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            sy6 r5 = (defpackage.sy6) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.lang.String r1 = r4.b
            java.lang.String r3 = r5.b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            float r1 = r4.c
            float r3 = r5.c
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L_0x0029
            return r2
        L_0x0029:
            float r1 = r4.d
            float r3 = r5.d
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L_0x0034
            return r2
        L_0x0034:
            float r1 = r4.e
            float r3 = r5.e
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L_0x003f
            return r2
        L_0x003f:
            float r1 = r4.f
            float r3 = r5.f
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L_0x004a
            return r2
        L_0x004a:
            float r4 = r4.g
            float r5 = r5.g
            int r4 = java.lang.Float.compare(r4, r5)
            if (r4 == 0) goto L_0x0055
            return r2
        L_0x0055:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sy6.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + g63.c(g63.c(g63.c(g63.c(g63.d(Integer.hashCode(this.a) * 31, 31, this.b), this.c, 31), this.d, 31), this.e, 31), this.f, 31);
    }

    public final String toString() {
        return "SelectedLineState(line=" + this.a + ", highlightText=" + this.b + ", textX=" + this.c + ", textY=" + this.d + ", baseLine=" + this.e + ", textWidth=" + this.f + ", textHeight=" + this.g + ")";
    }
}
