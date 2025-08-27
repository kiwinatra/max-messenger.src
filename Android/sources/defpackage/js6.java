package defpackage;

/* renamed from: js6  reason: default package */
public final class js6 {
    public final int a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;
    public final boolean f;

    public js6(int i, long j, long j2, float f2, int i2) {
        boolean z = (i2 & 32) != 0;
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = f2;
        this.e = 0.6f;
        this.f = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r8 = (defpackage.js6) r8;
        r1 = r8.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof defpackage.js6
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            js6 r8 = (defpackage.js6) r8
            int r1 = r8.a
            int r3 = r7.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            long r3 = r7.b
            long r5 = r8.b
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x001c
            return r2
        L_0x001c:
            long r3 = r7.c
            long r5 = r8.c
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0025
            return r2
        L_0x0025:
            float r1 = r7.d
            float r3 = r8.d
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L_0x0030
            return r2
        L_0x0030:
            float r1 = r7.e
            float r3 = r8.e
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L_0x003b
            return r2
        L_0x003b:
            boolean r7 = r7.f
            boolean r8 = r8.f
            if (r7 == r8) goto L_0x0042
            return r2
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.js6.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + g63.c(g63.c(wzf.i(wzf.i(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationConfig(repeatCount=");
        sb.append(this.a);
        sb.append(", startDelay=");
        sb.append(this.b);
        sb.append(", duration=");
        sb.append(this.c);
        sb.append(", tiltDegrees=");
        sb.append(this.d);
        sb.append(", shineWidthFraction=");
        sb.append(this.e);
        sb.append(", startOnAttach=");
        return tr1.m(sb, this.f, ")");
    }
}
