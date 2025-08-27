package defpackage;

/* renamed from: se9  reason: default package */
public final class se9 extends boe {
    public final boe A0;
    public final int z0;

    /* JADX WARNING: type inference failed for: r0v0, types: [h20, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public se9(int r4, defpackage.boe r5) {
        /*
            r3 = this;
            h20 r0 = new h20
            r0.<init>()
            long r1 = r5.a
            r0.a = r1
            int r1 = r5.b
            r0.b = r1
            int r1 = r5.c
            r0.c = r1
            java.lang.String r1 = r5.o
            r0.d = r1
            long r1 = r5.v
            r0.e = r1
            java.lang.String r1 = r5.w
            r0.f = r1
            java.lang.String r1 = r5.x
            r0.g = r1
            java.lang.String r1 = r5.y
            r0.h = r1
            java.util.List r1 = r5.z
            r0.n = r1
            int r1 = r5.X
            r0.i = r1
            boolean r1 = r5.Y
            r0.j = r1
            long r1 = r5.Z
            r0.k = r1
            java.lang.String r1 = r5.v0
            r0.o = r1
            boolean r1 = r5.w0
            r0.l = r1
            x10 r1 = r5.x0
            r0.p = r1
            int r1 = r5.y0
            r0.m = r1
            r3.<init>(r0)
            r3.z0 = r4
            r3.A0 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se9.<init>(int, boe):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.se9) r5;
        r1 = r5.z0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.se9
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            se9 r5 = (defpackage.se9) r5
            int r1 = r5.z0
            int r3 = r4.z0
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            boe r4 = r4.A0
            boe r5 = r5.A0
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x001e
            return r2
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se9.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.A0.hashCode() + (Integer.hashCode(this.z0) * 31);
    }

    public final String toString() {
        return "MessageSticker(position=" + this.z0 + ", sticker=" + this.A0 + ")";
    }
}
