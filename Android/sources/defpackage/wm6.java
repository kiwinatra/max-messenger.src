package defpackage;

/* renamed from: wm6  reason: default package */
public final class wm6 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e = false;
    public final int f;
    public final v3d g;
    public final v3d h;

    public wm6(int i, int i2, int i3, int i4, int i5, v3d v3d) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.f = i5;
        this.g = v3d;
        this.h = i4 <= 0 ? null : new v3d(c44.DEFAULT_ASPECT_RATIO, i4, i4, 12);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.wm6) r5;
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
            boolean r1 = r5 instanceof defpackage.wm6
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            wm6 r5 = (defpackage.wm6) r5
            int r1 = r5.a
            int r3 = r4.a
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
            int r1 = r4.d
            int r3 = r5.d
            if (r1 == r3) goto L_0x0028
            return r2
        L_0x0028:
            boolean r1 = r4.e
            boolean r3 = r5.e
            if (r1 == r3) goto L_0x002f
            return r2
        L_0x002f:
            int r1 = r4.f
            int r3 = r5.f
            if (r1 == r3) goto L_0x0036
            return r2
        L_0x0036:
            v3d r4 = r4.g
            v3d r5 = r5.g
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x0041
            return r2
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wm6.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.g.hashCode() + rae.h(this.f, g63.e(rae.h(this.d, rae.h(this.c, rae.h(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31);
    }

    public final String toString() {
        return "GalleryUiOptions(spanCount=" + this.a + ", spanSpacing=" + this.b + ", cellSize=" + this.c + ", thumbnailSize=" + this.d + ", isItemAnimatorEnabled=" + this.e + ", threshold=" + this.f + ", albumsCoverResizeOptions=" + this.g + ")";
    }
}
