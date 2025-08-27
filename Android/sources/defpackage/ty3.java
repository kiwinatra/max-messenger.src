package defpackage;

/* renamed from: ty3  reason: default package */
public final class ty3 {
    public static final ty3 d = new ty3();
    public final int a;
    public final int b;
    public final boolean c;

    public /* synthetic */ ty3() {
        this(0, 0, true);
    }

    public static ty3 a(ty3 ty3, int i, int i2, boolean z, int i3) {
        if ((i3 & 1) != 0) {
            i = ty3.a;
        }
        if ((i3 & 2) != 0) {
            i2 = ty3.b;
        }
        if ((i3 & 4) != 0) {
            z = ty3.c;
        }
        ty3.getClass();
        return new ty3(i, i2, z);
    }

    public final int b() {
        return this.a + this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.ty3) r5;
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
            boolean r1 = r5 instanceof defpackage.ty3
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            ty3 r5 = (defpackage.ty3) r5
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
            boolean r4 = r4.c
            boolean r5 = r5.c
            if (r4 == r5) goto L_0x0021
            return r2
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ty3.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rae.h(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControlState(heightView=");
        sb.append(this.a);
        sb.append(", inset=");
        sb.append(this.b);
        sb.append(", isVisible=");
        return tr1.m(sb, this.c, ")");
    }

    public ty3(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }
}
