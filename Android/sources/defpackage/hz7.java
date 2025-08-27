package defpackage;

/* renamed from: hz7  reason: default package */
public final class hz7 implements le0 {
    public final tb7 a;
    public final int b;

    public hz7(int i, k0d k0d) {
        this.b = i;
        this.a = k0d;
    }

    /* JADX WARNING: type inference failed for: r13v0 */
    /* JADX WARNING: type inference failed for: r13v2, types: [dxe] */
    /* JADX WARNING: type inference failed for: r13v3, types: [dxe] */
    /* JADX WARNING: type inference failed for: r11v5, types: [oe0] */
    /* JADX WARNING: type inference failed for: r7v13, types: [gxe] */
    /* JADX WARNING: type inference failed for: r13v6 */
    /* JADX WARNING: type inference failed for: r7v16, types: [hz7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.hz7 b(int r19, defpackage.l8b r20) {
        /*
            r0 = r20
            r1 = 4
            java.lang.String r2 = "initialCapacity"
            defpackage.m5a.m(r1, r2)
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r3 = r0.c
            r4 = 0
            r5 = -2
            r6 = r4
        L_0x000f:
            int r7 = r20.a()
            r8 = 8
            if (r7 <= r8) goto L_0x01db
            int r7 = r20.i()
            int r9 = r20.i()
            int r10 = r0.b
            int r10 = r10 + r9
            r0.F(r10)
            r9 = 1
            r11 = 1414744396(0x5453494c, float:3.62987127E12)
            r12 = 2
            if (r7 != r11) goto L_0x0036
            int r7 = r20.i()
            hz7 r7 = b(r7, r0)
            goto L_0x0184
        L_0x0036:
            r11 = 12
            r13 = 0
            switch(r7) {
                case 1718776947: goto L_0x0098;
                case 1751742049: goto L_0x0078;
                case 1752331379: goto L_0x0050;
                case 1852994675: goto L_0x003f;
                default: goto L_0x003c;
            }
        L_0x003c:
            r7 = r13
            goto L_0x0184
        L_0x003f:
            gxe r7 = new gxe
            int r8 = r20.a()
            java.nio.charset.Charset r11 = defpackage.x22.c
            java.lang.String r8 = r0.s(r8, r11)
            r7.<init>(r8)
            goto L_0x0184
        L_0x0050:
            int r14 = r20.i()
            r0.H(r11)
            r20.i()
            int r15 = r20.i()
            int r16 = r20.i()
            r0.H(r1)
            int r17 = r20.i()
            int r18 = r20.i()
            r0.H(r8)
            pe0 r7 = new pe0
            r13 = r7
            r13.<init>(r14, r15, r16, r17, r18)
            goto L_0x0184
        L_0x0078:
            int r7 = r20.i()
            r0.H(r8)
            int r8 = r20.i()
            int r13 = r20.i()
            r0.H(r1)
            r20.i()
            r0.H(r11)
            oe0 r11 = new oe0
            r11.<init>(r7, r8, r13)
            r7 = r11
            goto L_0x0184
        L_0x0098:
            if (r5 != r12) goto L_0x00e0
            r0.H(r1)
            int r7 = r20.i()
            int r8 = r20.i()
            r0.H(r1)
            int r11 = r20.i()
            switch(r11) {
                case 808802372: goto L_0x00bd;
                case 826496577: goto L_0x00ba;
                case 828601953: goto L_0x00ba;
                case 842289229: goto L_0x00b7;
                case 859066445: goto L_0x00b4;
                case 875967048: goto L_0x00ba;
                case 877677894: goto L_0x00bd;
                case 1145656883: goto L_0x00bd;
                case 1145656920: goto L_0x00bd;
                case 1196444237: goto L_0x00b1;
                case 1482049860: goto L_0x00bd;
                case 1684633208: goto L_0x00bd;
                case 1735420525: goto L_0x00b1;
                case 2021026148: goto L_0x00bd;
                default: goto L_0x00af;
            }
        L_0x00af:
            r14 = r13
            goto L_0x00bf
        L_0x00b1:
            java.lang.String r14 = "video/mjpeg"
            goto L_0x00bf
        L_0x00b4:
            java.lang.String r14 = "video/mp43"
            goto L_0x00bf
        L_0x00b7:
            java.lang.String r14 = "video/mp42"
            goto L_0x00bf
        L_0x00ba:
            java.lang.String r14 = "video/avc"
            goto L_0x00bf
        L_0x00bd:
            java.lang.String r14 = "video/mp4v-es"
        L_0x00bf:
            if (r14 != 0) goto L_0x00c8
            java.lang.String r7 = "Ignoring track with unsupported compression "
            defpackage.i2a.m(r11, r7)
            goto L_0x003c
        L_0x00c8:
            ba6 r11 = new ba6
            r11.<init>()
            r11.s = r7
            r11.t = r8
            r11.d(r14)
            dxe r13 = new dxe
            ea6 r7 = new ea6
            r7.<init>(r11)
            r13.<init>(r7)
            goto L_0x003c
        L_0x00e0:
            if (r5 != r9) goto L_0x016d
            int r7 = r20.n()
            java.lang.String r8 = "audio/raw"
            java.lang.String r11 = "audio/mp4a-latm"
            if (r7 == r9) goto L_0x0109
            r14 = 85
            if (r7 == r14) goto L_0x0106
            r14 = 255(0xff, float:3.57E-43)
            if (r7 == r14) goto L_0x0104
            r14 = 8192(0x2000, float:1.14794E-41)
            if (r7 == r14) goto L_0x0101
            r14 = 8193(0x2001, float:1.1481E-41)
            if (r7 == r14) goto L_0x00fe
            r14 = r13
            goto L_0x010a
        L_0x00fe:
            java.lang.String r14 = "audio/vnd.dts"
            goto L_0x010a
        L_0x0101:
            java.lang.String r14 = "audio/ac3"
            goto L_0x010a
        L_0x0104:
            r14 = r11
            goto L_0x010a
        L_0x0106:
            java.lang.String r14 = "audio/mpeg"
            goto L_0x010a
        L_0x0109:
            r14 = r8
        L_0x010a:
            if (r14 != 0) goto L_0x0113
            java.lang.String r8 = "Ignoring track with unsupported format tag "
            defpackage.i2a.m(r7, r8)
            goto L_0x003c
        L_0x0113:
            int r7 = r20.n()
            int r13 = r20.i()
            r15 = 6
            r0.H(r15)
            int r15 = r20.n()
            int r15 = defpackage.v0g.C(r15)
            int r16 = r20.a()
            if (r16 <= 0) goto L_0x0134
            int r16 = r20.n()
            r1 = r16
            goto L_0x0135
        L_0x0134:
            r1 = r4
        L_0x0135:
            byte[] r9 = new byte[r1]
            r0.e(r4, r9, r1)
            ba6 r4 = new ba6
            r4.<init>()
            java.lang.String r12 = defpackage.vq9.l(r14)
            r4.m = r12
            r4.A = r7
            r4.B = r13
            boolean r7 = r8.equals(r14)
            if (r7 == 0) goto L_0x0153
            if (r15 == 0) goto L_0x0153
            r4.C = r15
        L_0x0153:
            boolean r7 = r11.equals(r14)
            if (r7 == 0) goto L_0x0161
            if (r1 <= 0) goto L_0x0161
            k0d r1 = defpackage.tb7.t(r9)
            r4.p = r1
        L_0x0161:
            dxe r13 = new dxe
            ea6 r1 = new ea6
            r1.<init>(r4)
            r13.<init>(r1)
            goto L_0x003c
        L_0x016d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Ignoring strf box for unsupported track type: "
            r1.<init>(r4)
            java.lang.String r4 = defpackage.v0g.H(r5)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            defpackage.i8b.V(r1)
            goto L_0x003c
        L_0x0184:
            if (r7 == 0) goto L_0x01d1
            int r1 = r7.getType()
            r4 = 1752331379(0x68727473, float:4.5798432E24)
            if (r1 != r4) goto L_0x01c0
            r1 = r7
            pe0 r1 = (defpackage.pe0) r1
            r4 = 1935960438(0x73646976, float:1.809666E31)
            int r1 = r1.a
            if (r1 == r4) goto L_0x01bf
            r4 = 1935963489(0x73647561, float:1.8100348E31)
            if (r1 == r4) goto L_0x01bd
            r4 = 1937012852(0x73747874, float:1.936895E31)
            if (r1 == r4) goto L_0x01bb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Found unsupported streamType fourCC: "
            r4.<init>(r5)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            defpackage.i8b.V(r1)
            r1 = -1
        L_0x01b9:
            r5 = r1
            goto L_0x01c0
        L_0x01bb:
            r1 = 3
            goto L_0x01b9
        L_0x01bd:
            r5 = 1
            goto L_0x01c0
        L_0x01bf:
            r5 = 2
        L_0x01c0:
            int r1 = r6 + 1
            int r4 = r2.length
            if (r4 >= r1) goto L_0x01ce
            int r4 = r2.length
            int r4 = defpackage.jb7.h(r4, r1)
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r4)
        L_0x01ce:
            r2[r6] = r7
            r6 = r1
        L_0x01d1:
            r0.G(r10)
            r0.F(r3)
            r1 = 4
            r4 = 0
            goto L_0x000f
        L_0x01db:
            hz7 r0 = new hz7
            k0d r1 = defpackage.tb7.n(r6, r2)
            r2 = r19
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hz7.b(int, l8b):hz7");
    }

    public final le0 a(Class cls) {
        lx5 r = this.a.listIterator(0);
        while (r.hasNext()) {
            le0 le0 = (le0) r.next();
            if (le0.getClass() == cls) {
                return le0;
            }
        }
        return null;
    }

    public final int getType() {
        return this.b;
    }
}
