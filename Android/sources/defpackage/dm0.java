package defpackage;

/* renamed from: dm0  reason: default package */
public final class dm0 extends aa4 {
    public long X;
    public int Y;
    public int Z;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        if ((r0.remaining() + r3.position()) > 3072000) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean D(defpackage.aa4 r6) {
        /*
            r5 = this;
            r0 = 1073741824(0x40000000, float:2.0)
            boolean r0 = r6.h(r0)
            r1 = 1
            r0 = r0 ^ r1
            defpackage.y64.g(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            boolean r0 = r6.h(r0)
            r0 = r0 ^ r1
            defpackage.y64.g(r0)
            r0 = 4
            boolean r0 = r6.h(r0)
            r0 = r0 ^ r1
            defpackage.y64.g(r0)
            int r0 = r5.Y
            r2 = 0
            if (r0 <= 0) goto L_0x0025
            r3 = r1
            goto L_0x0026
        L_0x0025:
            r3 = r2
        L_0x0026:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != 0) goto L_0x002b
            goto L_0x0052
        L_0x002b:
            int r3 = r5.Z
            if (r0 < r3) goto L_0x0030
            goto L_0x0051
        L_0x0030:
            boolean r0 = r6.h(r4)
            boolean r3 = r5.h(r4)
            if (r0 == r3) goto L_0x003b
            goto L_0x0051
        L_0x003b:
            java.nio.ByteBuffer r0 = r6.o
            if (r0 == 0) goto L_0x0052
            java.nio.ByteBuffer r3 = r5.o
            if (r3 == 0) goto L_0x0052
            int r3 = r3.position()
            int r0 = r0.remaining()
            int r0 = r0 + r3
            r3 = 3072000(0x2ee000, float:4.304789E-39)
            if (r0 <= r3) goto L_0x0052
        L_0x0051:
            return r2
        L_0x0052:
            int r0 = r5.Y
            int r2 = r0 + 1
            r5.Y = r2
            if (r0 != 0) goto L_0x0066
            long r2 = r6.w
            r5.w = r2
            boolean r0 = r6.h(r1)
            if (r0 == 0) goto L_0x0066
            r5.b = r1
        L_0x0066:
            boolean r0 = r6.h(r4)
            if (r0 == 0) goto L_0x006e
            r5.b = r4
        L_0x006e:
            java.nio.ByteBuffer r0 = r6.o
            if (r0 == 0) goto L_0x007e
            int r2 = r0.remaining()
            r5.B(r2)
            java.nio.ByteBuffer r2 = r5.o
            r2.put(r0)
        L_0x007e:
            long r2 = r6.w
            r5.X = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dm0.D(aa4):boolean");
    }

    public final void z() {
        super.z();
        this.Y = 0;
    }
}
