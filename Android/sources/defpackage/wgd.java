package defpackage;

/* renamed from: wgd  reason: default package */
public final class wgd {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public wgd(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.wgd) r5;
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
            boolean r1 = r5 instanceof defpackage.wgd
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            wgd r5 = (defpackage.wgd) r5
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
            boolean r1 = r4.f
            boolean r3 = r5.f
            if (r1 == r3) goto L_0x0036
            return r2
        L_0x0036:
            boolean r4 = r4.g
            boolean r5 = r5.g
            if (r4 == r5) goto L_0x003d
            return r2
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgd.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + g63.e(g63.e(rae.h(this.d, rae.h(this.c, rae.h(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenInfo(realHeight=");
        sb.append(this.a);
        sb.append(", realWidth=");
        sb.append(this.b);
        sb.append(", topInset=");
        sb.append(this.c);
        sb.append(", bottomInset=");
        sb.append(this.d);
        sb.append(", isWeakDevice=");
        sb.append(this.e);
        sb.append(", isLong=");
        sb.append(this.f);
        sb.append(", isWide=");
        return tr1.m(sb, this.g, ")");
    }
}
