package defpackage;

/* renamed from: cv9  reason: default package */
public final class cv9 implements w05 {
    public final l8b a = new l8b(2, new byte[15]);
    public final ky1 b = new ky1(2);
    public final l8b c = new l8b();
    public int d = 0;
    public String e;
    public zpf f;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;
    public boolean i;
    public boolean j = true;
    public int k;
    public int l;
    public boolean m = true;
    public int n;
    public int o;
    public final dv9 p = new Object();
    public int q = -2147483647;
    public int r = -1;
    public int s;
    public long t = -1;
    public boolean u;

    public final void a() {
        this.d = 0;
        this.l = 0;
        this.a.D(2);
        this.n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:203:0x0404  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0445  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0451  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x046a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(defpackage.l8b r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            zpf r2 = r0.f
            defpackage.n79.o(r2)
        L_0x0009:
            int r2 = r23.a()
            if (r2 <= 0) goto L_0x04d0
            int r2 = r0.d
            r3 = 8
            r4 = 3
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0494
            dv9 r7 = r0.p
            r8 = 2
            r11 = 24
            r12 = 17
            l8b r13 = r0.c
            if (r2 == r5) goto L_0x036f
            if (r2 != r8) goto L_0x0369
            int r2 = r7.a
            if (r2 == r5) goto L_0x002b
            if (r2 != r12) goto L_0x0046
        L_0x002b:
            int r2 = r1.b
            int r14 = r23.a()
            int r15 = r13.a()
            int r14 = java.lang.Math.min(r14, r15)
            byte[] r15 = r13.a
            int r10 = r13.b
            r1.e(r10, r15, r14)
            r13.H(r14)
            r1.G(r2)
        L_0x0046:
            int r2 = r23.a()
            int r10 = r7.c
            int r14 = r0.n
            int r10 = r10 - r14
            int r2 = java.lang.Math.min(r2, r10)
            zpf r10 = r0.f
            r10.b(r1, r2, r6)
            int r10 = r0.n
            int r10 = r10 + r2
            r0.n = r10
            int r2 = r7.c
            if (r10 != r2) goto L_0x0009
            int r2 = r7.a
            if (r2 != r5) goto L_0x0301
            ky1 r2 = new ky1
            byte[] r12 = r13.a
            int r13 = r12.length
            r14 = 2
            r15 = 0
            r2.<init>((byte[]) r12, (byte) r15, (int) r13, (int) r14)
            int r12 = r2.i(r3)
            r13 = 5
            int r14 = r2.i(r13)
            r15 = 31
            if (r14 != r15) goto L_0x0082
            int r11 = r2.i(r11)
            goto L_0x00f1
        L_0x0082:
            switch(r14) {
                case 0: goto L_0x00ee;
                case 1: goto L_0x00ea;
                case 2: goto L_0x00e6;
                case 3: goto L_0x00e2;
                case 4: goto L_0x00de;
                case 5: goto L_0x00db;
                case 6: goto L_0x00d8;
                case 7: goto L_0x00d5;
                case 8: goto L_0x00d2;
                case 9: goto L_0x00cf;
                case 10: goto L_0x00cc;
                case 11: goto L_0x00c9;
                case 12: goto L_0x00c6;
                case 13: goto L_0x0085;
                case 14: goto L_0x0085;
                case 15: goto L_0x00c2;
                case 16: goto L_0x00be;
                case 17: goto L_0x00ba;
                case 18: goto L_0x00b6;
                case 19: goto L_0x00b2;
                case 20: goto L_0x00af;
                case 21: goto L_0x00ac;
                case 22: goto L_0x00a9;
                case 23: goto L_0x00a6;
                case 24: goto L_0x00a3;
                case 25: goto L_0x00a0;
                case 26: goto L_0x009c;
                case 27: goto L_0x0098;
                default: goto L_0x0085;
            }
        L_0x0085:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unsupported sampling rate index "
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.c(r0)
            throw r0
        L_0x0098:
            r11 = 9600(0x2580, float:1.3452E-41)
            goto L_0x00f1
        L_0x009c:
            r11 = 12800(0x3200, float:1.7937E-41)
            goto L_0x00f1
        L_0x00a0:
            r11 = 14400(0x3840, float:2.0179E-41)
            goto L_0x00f1
        L_0x00a3:
            r11 = 17075(0x42b3, float:2.3927E-41)
            goto L_0x00f1
        L_0x00a6:
            r11 = 19200(0x4b00, float:2.6905E-41)
            goto L_0x00f1
        L_0x00a9:
            r11 = 20000(0x4e20, float:2.8026E-41)
            goto L_0x00f1
        L_0x00ac:
            r11 = 25600(0x6400, float:3.5873E-41)
            goto L_0x00f1
        L_0x00af:
            r11 = 28800(0x7080, float:4.0357E-41)
            goto L_0x00f1
        L_0x00b2:
            r11 = 34150(0x8566, float:4.7854E-41)
            goto L_0x00f1
        L_0x00b6:
            r11 = 38400(0x9600, float:5.381E-41)
            goto L_0x00f1
        L_0x00ba:
            r11 = 40000(0x9c40, float:5.6052E-41)
            goto L_0x00f1
        L_0x00be:
            r11 = 51200(0xc800, float:7.1746E-41)
            goto L_0x00f1
        L_0x00c2:
            r11 = 57600(0xe100, float:8.0715E-41)
            goto L_0x00f1
        L_0x00c6:
            r11 = 7350(0x1cb6, float:1.03E-41)
            goto L_0x00f1
        L_0x00c9:
            r11 = 8000(0x1f40, float:1.121E-41)
            goto L_0x00f1
        L_0x00cc:
            r11 = 11025(0x2b11, float:1.545E-41)
            goto L_0x00f1
        L_0x00cf:
            r11 = 12000(0x2ee0, float:1.6816E-41)
            goto L_0x00f1
        L_0x00d2:
            r11 = 16000(0x3e80, float:2.2421E-41)
            goto L_0x00f1
        L_0x00d5:
            r11 = 22050(0x5622, float:3.0899E-41)
            goto L_0x00f1
        L_0x00d8:
            r11 = 24000(0x5dc0, float:3.3631E-41)
            goto L_0x00f1
        L_0x00db:
            r11 = 32000(0x7d00, float:4.4842E-41)
            goto L_0x00f1
        L_0x00de:
            r11 = 44100(0xac44, float:6.1797E-41)
            goto L_0x00f1
        L_0x00e2:
            r11 = 48000(0xbb80, float:6.7262E-41)
            goto L_0x00f1
        L_0x00e6:
            r11 = 64000(0xfa00, float:8.9683E-41)
            goto L_0x00f1
        L_0x00ea:
            r11 = 88200(0x15888, float:1.23595E-40)
            goto L_0x00f1
        L_0x00ee:
            r11 = 96000(0x17700, float:1.34525E-40)
        L_0x00f1:
            int r14 = r2.i(r4)
            r15 = 4
            java.lang.String r9 = "Unsupported coreSbrFrameLengthIndex "
            if (r14 == 0) goto L_0x011e
            if (r14 == r5) goto L_0x011b
            if (r14 == r8) goto L_0x0118
            if (r14 == r4) goto L_0x0118
            if (r14 != r15) goto L_0x0107
            r16 = 4096(0x1000, float:5.74E-42)
        L_0x0104:
            r17 = r16
            goto L_0x0121
        L_0x0107:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r9)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.c(r0)
            throw r0
        L_0x0118:
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x0104
        L_0x011b:
            r16 = 1024(0x400, float:1.435E-42)
            goto L_0x0104
        L_0x011e:
            r16 = 768(0x300, float:1.076E-42)
            goto L_0x0104
        L_0x0121:
            if (r14 == 0) goto L_0x0142
            if (r14 == r5) goto L_0x0142
            if (r14 == r8) goto L_0x0140
            if (r14 == r4) goto L_0x013e
            if (r14 != r15) goto L_0x012d
            r9 = r5
            goto L_0x0143
        L_0x012d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r9)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.c(r0)
            throw r0
        L_0x013e:
            r9 = r4
            goto L_0x0143
        L_0x0140:
            r9 = r8
            goto L_0x0143
        L_0x0142:
            r9 = r6
        L_0x0143:
            r2.t(r8)
            defpackage.b59.a0(r2)
            int r14 = r2.i(r13)
            r10 = r6
            r18 = r10
        L_0x0150:
            int r6 = r14 + 1
            r15 = 16
            if (r10 >= r6) goto L_0x0172
            int r6 = r2.i(r4)
            int r15 = defpackage.b59.S(r2, r13, r3, r15)
            int r15 = r15 + r5
            int r18 = r15 + r18
            if (r6 == 0) goto L_0x0165
            if (r6 != r8) goto L_0x016e
        L_0x0165:
            boolean r6 = r2.h()
            if (r6 == 0) goto L_0x016e
            defpackage.b59.a0(r2)
        L_0x016e:
            int r10 = r10 + 1
            r15 = 4
            goto L_0x0150
        L_0x0172:
            r6 = 4
            int r10 = defpackage.b59.S(r2, r6, r3, r15)
            int r10 = r10 + r5
            r2.s()
            r6 = 0
        L_0x017c:
            r20 = 4611686018427387904(0x4000000000000000, double:2.0)
            if (r6 >= r10) goto L_0x023b
            int r14 = r2.i(r8)
            if (r14 == 0) goto L_0x021f
            if (r14 == r5) goto L_0x01aa
            if (r14 == r4) goto L_0x018c
            goto L_0x0232
        L_0x018c:
            r14 = 4
            defpackage.b59.S(r2, r14, r3, r15)
            int r20 = defpackage.b59.S(r2, r14, r3, r15)
            boolean r14 = r2.h()
            if (r14 == 0) goto L_0x019e
            r14 = 0
            defpackage.b59.S(r2, r3, r15, r14)
        L_0x019e:
            r2.s()
            if (r20 <= 0) goto L_0x0232
            int r14 = r20 * 8
            r2.t(r14)
            goto L_0x0232
        L_0x01aa:
            r2.t(r4)
            boolean r14 = r2.h()
            if (r14 == 0) goto L_0x01b8
            r15 = 13
            r2.t(r15)
        L_0x01b8:
            if (r14 == 0) goto L_0x01bd
            r2.s()
        L_0x01bd:
            if (r9 <= 0) goto L_0x01c7
            defpackage.b59.Z(r2)
            int r14 = r2.i(r8)
            goto L_0x01c8
        L_0x01c7:
            r14 = 0
        L_0x01c8:
            if (r14 <= 0) goto L_0x01eb
            r15 = 6
            r2.t(r15)
            int r3 = r2.i(r8)
            r5 = 4
            r2.t(r5)
            boolean r5 = r2.h()
            if (r5 == 0) goto L_0x01df
            r2.t(r13)
        L_0x01df:
            if (r14 == r8) goto L_0x01e3
            if (r14 != r4) goto L_0x01e6
        L_0x01e3:
            r2.t(r15)
        L_0x01e6:
            if (r3 != r8) goto L_0x01eb
            r2.s()
        L_0x01eb:
            int r3 = r18 + -1
            double r14 = (double) r3
            double r14 = java.lang.Math.log(r14)
            double r20 = java.lang.Math.log(r20)
            double r14 = r14 / r20
            double r14 = java.lang.Math.floor(r14)
            int r3 = (int) r14
            r5 = 1
            int r3 = r3 + r5
            int r5 = r2.i(r8)
            if (r5 <= 0) goto L_0x020e
            boolean r14 = r2.h()
            if (r14 == 0) goto L_0x020e
            r2.t(r3)
        L_0x020e:
            boolean r14 = r2.h()
            if (r14 == 0) goto L_0x0217
            r2.t(r3)
        L_0x0217:
            if (r9 != 0) goto L_0x0232
            if (r5 != 0) goto L_0x0232
            r2.s()
            goto L_0x0232
        L_0x021f:
            r2.t(r4)
            boolean r3 = r2.h()
            if (r3 == 0) goto L_0x022d
            r3 = 13
            r2.t(r3)
        L_0x022d:
            if (r9 <= 0) goto L_0x0232
            defpackage.b59.Z(r2)
        L_0x0232:
            int r6 = r6 + 1
            r3 = 8
            r5 = 1
            r15 = 16
            goto L_0x017c
        L_0x023b:
            boolean r3 = r2.h()
            if (r3 == 0) goto L_0x027e
            r3 = 8
            r4 = 4
            int r5 = defpackage.b59.S(r2, r8, r4, r3)
            r6 = 1
            int r5 = r5 + r6
            r8 = 0
            r9 = 0
        L_0x024c:
            if (r8 >= r5) goto L_0x027f
            r10 = 16
            int r13 = defpackage.b59.S(r2, r4, r3, r10)
            int r14 = defpackage.b59.S(r2, r4, r3, r10)
            r15 = 7
            if (r13 != r15) goto L_0x0274
            int r9 = r2.i(r4)
            int r9 = r9 + r6
            r2.t(r4)
            byte[] r6 = new byte[r9]
            r13 = 0
        L_0x0266:
            if (r13 >= r9) goto L_0x0272
            int r14 = r2.i(r3)
            byte r14 = (byte) r14
            r6[r13] = r14
            int r13 = r13 + 1
            goto L_0x0266
        L_0x0272:
            r9 = r6
            goto L_0x0278
        L_0x0274:
            int r14 = r14 * r3
            r2.t(r14)
        L_0x0278:
            int r8 = r8 + 1
            r3 = 8
            r6 = 1
            goto L_0x024c
        L_0x027e:
            r9 = 0
        L_0x027f:
            switch(r11) {
                case 14700: goto L_0x029b;
                case 16000: goto L_0x029b;
                case 22050: goto L_0x029d;
                case 24000: goto L_0x029d;
                case 29400: goto L_0x0298;
                case 32000: goto L_0x0298;
                case 44100: goto L_0x0295;
                case 48000: goto L_0x0295;
                case 58800: goto L_0x0298;
                case 64000: goto L_0x0298;
                case 88200: goto L_0x0295;
                case 96000: goto L_0x0295;
                default: goto L_0x0282;
            }
        L_0x0282:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unsupported sampling rate "
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.c(r0)
            throw r0
        L_0x0295:
            r20 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x029d
        L_0x0298:
            r20 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            goto L_0x029d
        L_0x029b:
            r20 = 4613937818241073152(0x4008000000000000, double:3.0)
        L_0x029d:
            double r2 = (double) r11
            double r2 = r2 * r20
            int r2 = (int) r2
            r3 = r17
            double r3 = (double) r3
            double r3 = r3 * r20
            int r3 = (int) r3
            r0.q = r2
            r0.r = r3
            long r2 = r0.t
            long r4 = r7.b
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x02fc
            r0.t = r4
            java.lang.String r2 = "mhm1"
            r3 = -1
            if (r12 == r3) goto L_0x02cc
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = ".%02X"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            java.lang.String r2 = r2.concat(r3)
        L_0x02cc:
            if (r9 == 0) goto L_0x02d8
            int r3 = r9.length
            if (r3 <= 0) goto L_0x02d8
            byte[] r3 = defpackage.v0g.f
            k0d r10 = defpackage.tb7.u(r3, r9)
            goto L_0x02d9
        L_0x02d8:
            r10 = 0
        L_0x02d9:
            ba6 r3 = new ba6
            r3.<init>()
            java.lang.String r4 = r0.e
            r3.a = r4
            java.lang.String r4 = "audio/mhm1"
            java.lang.String r4 = defpackage.vq9.l(r4)
            r3.m = r4
            int r4 = r0.q
            r3.B = r4
            r3.i = r2
            r3.p = r10
            ea6 r2 = new ea6
            r2.<init>(r3)
            zpf r3 = r0.f
            r3.e(r2)
        L_0x02fc:
            r2 = 1
            r0.u = r2
        L_0x02ff:
            r2 = 1
            goto L_0x0365
        L_0x0301:
            if (r2 != r12) goto L_0x0321
            ky1 r2 = new ky1
            byte[] r3 = r13.a
            int r4 = r3.length
            r5 = 2
            r6 = 0
            r2.<init>((byte[]) r3, (byte) r6, (int) r4, (int) r5)
            boolean r3 = r2.h()
            if (r3 == 0) goto L_0x031d
            r2.t(r8)
            r3 = 13
            int r6 = r2.i(r3)
            goto L_0x031e
        L_0x031d:
            r6 = 0
        L_0x031e:
            r0.s = r6
            goto L_0x02ff
        L_0x0321:
            if (r2 != r8) goto L_0x02ff
            boolean r2 = r0.u
            if (r2 == 0) goto L_0x032c
            r2 = 0
            r0.j = r2
            r6 = 1
            goto L_0x032d
        L_0x032c:
            r6 = 0
        L_0x032d:
            int r2 = r0.r
            int r3 = r0.s
            int r2 = r2 - r3
            double r2 = (double) r2
            r4 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r2 = r2 * r4
            int r4 = r0.q
            double r4 = (double) r4
            double r2 = r2 / r4
            double r4 = r0.g
            long r4 = java.lang.Math.round(r4)
            boolean r7 = r0.i
            if (r7 == 0) goto L_0x034f
            r7 = 0
            r0.i = r7
            double r2 = r0.h
            r0.g = r2
            goto L_0x0354
        L_0x034f:
            double r7 = r0.g
            double r7 = r7 + r2
            r0.g = r7
        L_0x0354:
            zpf r3 = r0.f
            int r7 = r0.o
            r8 = 0
            r9 = 0
            r3.a(r4, r6, r7, r8, r9)
            r2 = 0
            r0.u = r2
            r0.s = r2
            r0.o = r2
            goto L_0x02ff
        L_0x0365:
            r0.d = r2
            goto L_0x0009
        L_0x0369:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x036f:
            int r2 = r23.a()
            l8b r3 = r0.a
            int r5 = r3.a()
            int r2 = java.lang.Math.min(r2, r5)
            byte[] r5 = r3.a
            int r6 = r3.b
            r1.e(r6, r5, r2)
            r3.H(r2)
            int r2 = r3.a()
            if (r2 != 0) goto L_0x048f
            int r2 = r3.c
            byte[] r5 = r3.a
            ky1 r6 = r0.b
            r6.o(r2, r5)
            r6.f()
            r5 = 8
            int r4 = defpackage.b59.S(r6, r4, r5, r5)
            r7.a = r4
            r9 = -1
            if (r4 != r9) goto L_0x03a7
        L_0x03a4:
            r4 = 0
            goto L_0x0442
        L_0x03a7:
            int r4 = java.lang.Math.max(r8, r5)
            r5 = 32
            int r4 = java.lang.Math.max(r4, r5)
            r9 = 63
            if (r4 > r9) goto L_0x03b7
            r4 = 1
            goto L_0x03b8
        L_0x03b7:
            r4 = 0
        L_0x03b8:
            defpackage.n79.g(r4)
            r9 = 3
            r14 = 255(0xff, double:1.26E-321)
            long r11 = defpackage.hi7.g(r9, r14)
            r14 = 4294967296(0x100000000, double:2.121995791E-314)
            defpackage.hi7.g(r11, r14)
            int r4 = r6.b()
            r11 = -1
            if (r4 >= r8) goto L_0x03d5
        L_0x03d3:
            r14 = r11
            goto L_0x03fd
        L_0x03d5:
            long r14 = r6.k(r8)
            int r4 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x03fd
            int r4 = r6.b()
            r9 = 8
            if (r4 >= r9) goto L_0x03e6
            goto L_0x03d3
        L_0x03e6:
            long r9 = r6.k(r9)
            long r14 = r14 + r9
            r19 = 255(0xff, double:1.26E-321)
            int r4 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r4 != 0) goto L_0x03fd
            int r4 = r6.b()
            if (r4 >= r5) goto L_0x03f8
            goto L_0x03d3
        L_0x03f8:
            long r4 = r6.k(r5)
            long r14 = r14 + r4
        L_0x03fd:
            r7.b = r14
            int r4 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x0404
            goto L_0x03a4
        L_0x0404:
            r4 = 16
            int r4 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x047a
            r4 = 0
            int r4 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0434
            int r4 = r7.a
            r5 = 1
            if (r4 == r5) goto L_0x042c
            if (r4 == r8) goto L_0x0424
            r5 = 17
            if (r4 == r5) goto L_0x041c
            goto L_0x0434
        L_0x041c:
            java.lang.String r0 = "AudioTruncation packet with invalid packet label 0"
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x0424:
            r1 = 0
            java.lang.String r0 = "Mpegh3daFrame packet with invalid packet label 0"
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x042c:
            r1 = 0
            java.lang.String r0 = "Mpegh3daConfig packet with invalid packet label 0"
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x0434:
            r4 = 11
            r5 = 24
            int r4 = defpackage.b59.S(r6, r4, r5, r5)
            r7.c = r4
            r5 = -1
            if (r4 == r5) goto L_0x03a4
            r4 = 1
        L_0x0442:
            r5 = 0
            if (r4 == 0) goto L_0x044f
            r0.n = r5
            int r6 = r0.o
            int r9 = r7.c
            int r9 = r9 + r2
            int r9 = r9 + r6
            r0.o = r9
        L_0x044f:
            if (r4 == 0) goto L_0x046a
            r3.G(r5)
            zpf r2 = r0.f
            int r4 = r3.c
            r2.b(r3, r4, r5)
            r3.D(r8)
            int r2 = r7.c
            r13.D(r2)
            r2 = 1
            r0.m = r2
            r0.d = r8
            goto L_0x0009
        L_0x046a:
            int r2 = r3.c
            r4 = 15
            if (r2 >= r4) goto L_0x0009
            int r2 = r2 + 1
            r3.F(r2)
            r2 = 0
            r0.m = r2
            goto L_0x0009
        L_0x047a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Contains sub-stream with an invalid packet label "
            r0.<init>(r1)
            long r1 = r7.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.c(r0)
            throw r0
        L_0x048f:
            r2 = 0
            r0.m = r2
            goto L_0x0009
        L_0x0494:
            int r2 = r0.k
            r3 = r2 & 2
            if (r3 != 0) goto L_0x04a1
            int r2 = r1.c
            r1.G(r2)
            goto L_0x0009
        L_0x04a1:
            r2 = r2 & 4
            if (r2 != 0) goto L_0x04cb
        L_0x04a5:
            int r2 = r23.a()
            if (r2 <= 0) goto L_0x0009
            int r2 = r0.l
            r3 = 8
            int r2 = r2 << r3
            r0.l = r2
            int r5 = r23.u()
            r2 = r2 | r5
            r0.l = r2
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r5
            r5 = 12583333(0xc001a5, float:1.7633005E-38)
            if (r2 != r5) goto L_0x04a5
            int r2 = r1.b
            int r2 = r2 - r4
            r1.G(r2)
            r2 = 0
            r0.l = r2
        L_0x04cb:
            r2 = 1
            r0.d = r2
            goto L_0x0009
        L_0x04d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cv9.f(l8b):void");
    }

    public final void g(boolean z) {
    }

    public final void i(int i2, long j2) {
        this.k = i2;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j2 == -9223372036854775807L) {
            return;
        }
        if (this.i) {
            this.h = (double) j2;
        } else {
            this.g = (double) j2;
        }
    }

    public final void k(xf5 xf5, qtf qtf) {
        qtf.a();
        qtf.b();
        this.e = qtf.f;
        qtf.b();
        this.f = xf5.B(qtf.e, 1);
    }
}
