package defpackage;

/* renamed from: cf0  reason: default package */
public final class cf0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;

    public cf0(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = i7;
        this.g = i8;
        this.h = i9;
        this.i = i10;
        this.j = i11;
        this.k = i12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.cf0) r5;
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
            boolean r1 = r5 instanceof defpackage.cf0
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            cf0 r5 = (defpackage.cf0) r5
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
            int r1 = r4.e
            int r3 = r5.e
            if (r1 == r3) goto L_0x002f
            return r2
        L_0x002f:
            int r1 = r4.f
            int r3 = r5.f
            if (r1 == r3) goto L_0x0036
            return r2
        L_0x0036:
            int r1 = r4.g
            int r3 = r5.g
            if (r1 == r3) goto L_0x003d
            return r2
        L_0x003d:
            int r1 = r4.h
            int r3 = r5.h
            if (r1 == r3) goto L_0x0044
            return r2
        L_0x0044:
            int r1 = r4.i
            int r3 = r5.i
            if (r1 == r3) goto L_0x004b
            return r2
        L_0x004b:
            int r1 = r4.j
            int r3 = r5.j
            if (r1 == r3) goto L_0x0052
            return r2
        L_0x0052:
            int r4 = r4.k
            int r5 = r5.k
            if (r4 == r5) goto L_0x0059
            return r2
        L_0x0059:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cf0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Integer.hashCode(-16745729) + rae.h(this.k, rae.h(this.j, rae.h(this.i, rae.h(this.h, rae.h(this.g, rae.h(this.f, rae.h(this.e, rae.h(this.d, rae.h(this.c, rae.h(-1, rae.h(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackgroundAccentColors(attentionPrimary=");
        sb.append(this.a);
        sb.append(", attentionSecondary=");
        sb.append(this.b);
        sb.append(", contrastStatic=-1, contrast=");
        sb.append(this.c);
        sb.append(", contrastSecondary=");
        sb.append(this.d);
        sb.append(", negative=");
        sb.append(this.e);
        sb.append(", neutral=");
        sb.append(this.f);
        sb.append(", neutralFade=");
        sb.append(this.g);
        sb.append(", neutralFadeSecondary=");
        sb.append(this.h);
        sb.append(", neutralStatic=");
        sb.append(this.i);
        sb.append(", neutralThemed=");
        sb.append(this.j);
        sb.append(", positive=");
        return wj6.l(sb, this.k, ", themed=-16745729)");
    }
}
