package defpackage;

/* renamed from: sy3  reason: default package */
public final class sy3 {
    public final boolean a;
    public final int b;
    public final int c;
    public final float d;
    public final float e;
    public final int f;

    public sy3(boolean z, int i, int i2, float f2, float f3, int i3) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = f2;
        this.e = f3;
        this.f = i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.sy3) r5;
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
            boolean r1 = r5 instanceof defpackage.sy3
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            sy3 r5 = (defpackage.sy3) r5
            boolean r1 = r5.a
            boolean r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            int r1 = r4.c
            int r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            float r1 = r4.d
            float r3 = r5.d
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L_0x002c
            return r2
        L_0x002c:
            float r1 = r4.e
            float r3 = r5.e
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L_0x0037
            return r2
        L_0x0037:
            int r4 = r4.f
            int r5 = r5.f
            if (r4 == r5) goto L_0x003e
            return r2
        L_0x003e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sy3.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + g63.c(g63.c(rae.h(this.c, rae.h(this.b, Boolean.hashCode(this.a) * 31, 31), 31), this.d, 31), this.e, 31);
    }

    public final String toString() {
        return "AnimationState(isVisible=" + this.a + ", totalHeight=" + this.b + ", directionY=" + this.c + ", offsetY=" + this.d + ", startY=" + this.e + ", inset=" + this.f + ")";
    }
}
