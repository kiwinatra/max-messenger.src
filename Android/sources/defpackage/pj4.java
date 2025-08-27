package defpackage;

/* renamed from: pj4  reason: default package */
public final class pj4 extends mj4 {
    public final int A0;
    public final int X;
    public final int Y;
    public final int Z;
    public final boolean v;
    public final boolean v0;
    public final dj4 w;
    public final boolean w0;
    public final boolean x;
    public final int x0;
    public final boolean y;
    public final boolean y0;
    public final int z;
    public final boolean z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x00c7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public pj4(int r7, defpackage.rpf r8, int r9, defpackage.dj4 r10, int r11, int r12, boolean r13) {
        /*
            r6 = this;
            r0 = 3
            r1 = -1
            r2 = 2
            r3 = 0
            r4 = 1
            r6.<init>(r7, r8, r9)
            r6.w = r10
            boolean r7 = r10.L0
            if (r7 == 0) goto L_0x0011
            r7 = 24
            goto L_0x0013
        L_0x0011:
            r7 = 16
        L_0x0013:
            boolean r8 = r10.K0
            if (r8 == 0) goto L_0x001d
            r8 = r12 & r7
            if (r8 == 0) goto L_0x001d
            r8 = r4
            goto L_0x001e
        L_0x001d:
            r8 = r3
        L_0x001e:
            r6.w0 = r8
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r13 == 0) goto L_0x004d
            ca6 r9 = r6.o
            int r12 = r9.z0
            if (r12 == r1) goto L_0x002e
            int r5 = r10.a
            if (r12 > r5) goto L_0x004d
        L_0x002e:
            int r12 = r9.A0
            if (r12 == r1) goto L_0x0036
            int r5 = r10.b
            if (r12 > r5) goto L_0x004d
        L_0x0036:
            float r12 = r9.B0
            int r5 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x0043
            int r5 = r10.c
            float r5 = (float) r5
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 > 0) goto L_0x004d
        L_0x0043:
            int r9 = r9.y
            if (r9 == r1) goto L_0x004b
            int r12 = r10.o
            if (r9 > r12) goto L_0x004d
        L_0x004b:
            r9 = r4
            goto L_0x004e
        L_0x004d:
            r9 = r3
        L_0x004e:
            r6.v = r9
            if (r13 == 0) goto L_0x007b
            ca6 r9 = r6.o
            int r12 = r9.z0
            if (r12 == r1) goto L_0x005c
            int r13 = r10.v
            if (r12 < r13) goto L_0x007b
        L_0x005c:
            int r12 = r9.A0
            if (r12 == r1) goto L_0x0064
            int r13 = r10.w
            if (r12 < r13) goto L_0x007b
        L_0x0064:
            float r12 = r9.B0
            int r8 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x0071
            int r8 = r10.x
            float r8 = (float) r8
            int r8 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r8 < 0) goto L_0x007b
        L_0x0071:
            int r8 = r9.y
            if (r8 == r1) goto L_0x0079
            int r9 = r10.y
            if (r8 < r9) goto L_0x007b
        L_0x0079:
            r8 = r4
            goto L_0x007c
        L_0x007b:
            r8 = r3
        L_0x007c:
            r6.x = r8
            boolean r8 = defpackage.rj4.d(r11, r3)
            r6.y = r8
            ca6 r8 = r6.o
            int r9 = r8.y
            r6.z = r9
            int r8 = r8.b()
            r6.X = r8
            ca6 r8 = r6.o
            int r8 = r8.v
            int r9 = r10.v0
            int r8 = defpackage.rj4.a(r8, r9)
            r6.Z = r8
            ca6 r8 = r6.o
            int r8 = r8.v
            if (r8 == 0) goto L_0x00a8
            r8 = r8 & r4
            if (r8 == 0) goto L_0x00a6
            goto L_0x00a8
        L_0x00a6:
            r8 = r3
            goto L_0x00a9
        L_0x00a8:
            r8 = r4
        L_0x00a9:
            r6.v0 = r8
            r8 = r3
        L_0x00ac:
            tb7 r9 = r10.Z
            int r12 = r9.size()
            if (r8 >= r12) goto L_0x00c7
            ca6 r12 = r6.o
            java.lang.String r12 = r12.Z
            if (r12 == 0) goto L_0x00c5
            java.lang.Object r9 = r9.get(r8)
            boolean r9 = r12.equals(r9)
            if (r9 == 0) goto L_0x00c5
            goto L_0x00ca
        L_0x00c5:
            int r8 = r8 + r4
            goto L_0x00ac
        L_0x00c7:
            r8 = 2147483647(0x7fffffff, float:NaN)
        L_0x00ca:
            r6.Y = r8
            int r8 = defpackage.ok0.h(r11)
            r9 = 128(0x80, float:1.794E-43)
            if (r8 != r9) goto L_0x00d6
            r8 = r4
            goto L_0x00d7
        L_0x00d6:
            r8 = r3
        L_0x00d7:
            r6.y0 = r8
            int r8 = defpackage.ok0.i(r11)
            r9 = 64
            if (r8 != r9) goto L_0x00e3
            r8 = r4
            goto L_0x00e4
        L_0x00e3:
            r8 = r3
        L_0x00e4:
            r6.z0 = r8
            ca6 r8 = r6.o
            java.lang.String r8 = r8.Z
            if (r8 != 0) goto L_0x00ee
        L_0x00ec:
            r0 = r3
            goto L_0x012b
        L_0x00ee:
            int r9 = r8.hashCode()
            switch(r9) {
                case -1662735862: goto L_0x0118;
                case -1662541442: goto L_0x010d;
                case 1331836730: goto L_0x0102;
                case 1599127257: goto L_0x00f7;
                default: goto L_0x00f5;
            }
        L_0x00f5:
            r8 = r1
            goto L_0x0122
        L_0x00f7:
            java.lang.String r9 = "video/x-vnd.on2.vp9"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x0100
            goto L_0x00f5
        L_0x0100:
            r8 = r0
            goto L_0x0122
        L_0x0102:
            java.lang.String r9 = "video/avc"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x010b
            goto L_0x00f5
        L_0x010b:
            r8 = r2
            goto L_0x0122
        L_0x010d:
            java.lang.String r9 = "video/hevc"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x0116
            goto L_0x00f5
        L_0x0116:
            r8 = r4
            goto L_0x0122
        L_0x0118:
            java.lang.String r9 = "video/av01"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x0121
            goto L_0x00f5
        L_0x0121:
            r8 = r3
        L_0x0122:
            switch(r8) {
                case 0: goto L_0x012a;
                case 1: goto L_0x012b;
                case 2: goto L_0x0128;
                case 3: goto L_0x0126;
                default: goto L_0x0125;
            }
        L_0x0125:
            goto L_0x00ec
        L_0x0126:
            r0 = r2
            goto L_0x012b
        L_0x0128:
            r0 = r4
            goto L_0x012b
        L_0x012a:
            r0 = 4
        L_0x012b:
            r6.A0 = r0
            ca6 r8 = r6.o
            int r9 = r8.v
            r9 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r9 == 0) goto L_0x0136
            goto L_0x0168
        L_0x0136:
            dj4 r9 = r6.w
            boolean r10 = r9.S0
            boolean r10 = defpackage.rj4.d(r11, r10)
            if (r10 != 0) goto L_0x0141
            goto L_0x0168
        L_0x0141:
            boolean r10 = r6.v
            if (r10 != 0) goto L_0x014a
            boolean r12 = r9.J0
            if (r12 != 0) goto L_0x014a
            goto L_0x0168
        L_0x014a:
            boolean r12 = defpackage.rj4.d(r11, r3)
            if (r12 == 0) goto L_0x0166
            boolean r12 = r6.x
            if (r12 == 0) goto L_0x0166
            if (r10 == 0) goto L_0x0166
            int r8 = r8.y
            if (r8 == r1) goto L_0x0166
            boolean r8 = r9.F0
            if (r8 != 0) goto L_0x0166
            boolean r8 = r9.E0
            if (r8 != 0) goto L_0x0166
            r7 = r7 & r11
            if (r7 == 0) goto L_0x0166
            goto L_0x0167
        L_0x0166:
            r2 = r4
        L_0x0167:
            r3 = r2
        L_0x0168:
            r6.x0 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pj4.<init>(int, rpf, int, dj4, int, int, boolean):void");
    }

    public static int c(pj4 pj4, pj4 pj42) {
        y93 d = y93.a.d(pj4.y, pj42.y).a(pj4.Z, pj42.Z).d(pj4.v0, pj42.v0).d(pj4.v, pj42.v).d(pj4.x, pj42.x);
        Integer valueOf = Integer.valueOf(pj4.Y);
        Integer valueOf2 = Integer.valueOf(pj42.Y);
        q5a.a.getClass();
        y93 c = d.c(valueOf, valueOf2, d5d.a);
        boolean z2 = pj42.y0;
        boolean z3 = pj4.y0;
        y93 d2 = c.d(z3, z2);
        boolean z4 = pj42.z0;
        boolean z5 = pj4.z0;
        y93 d3 = d2.d(z5, z4);
        if (z3 && z5) {
            d3 = d3.a(pj4.A0, pj42.A0);
        }
        return d3.f();
    }

    public final int a() {
        return this.x0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        r0 = r3.y0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(defpackage.mj4 r3) {
        /*
            r2 = this;
            pj4 r3 = (defpackage.pj4) r3
            boolean r0 = r2.w0
            if (r0 != 0) goto L_0x0014
            ca6 r0 = r2.o
            java.lang.String r0 = r0.Z
            ca6 r1 = r3.o
            java.lang.String r1 = r1.Z
            boolean r0 = defpackage.t0g.a(r0, r1)
            if (r0 == 0) goto L_0x0027
        L_0x0014:
            dj4 r0 = r2.w
            boolean r0 = r0.M0
            if (r0 != 0) goto L_0x0029
            boolean r0 = r3.y0
            boolean r1 = r2.y0
            if (r1 != r0) goto L_0x0027
            boolean r2 = r2.z0
            boolean r3 = r3.z0
            if (r2 != r3) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r2 = 0
            goto L_0x002a
        L_0x0029:
            r2 = 1
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pj4.b(mj4):boolean");
    }
}
