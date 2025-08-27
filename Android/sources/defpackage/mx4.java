package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: mx4  reason: default package */
public final class mx4 implements w05 {
    public final l8b a;
    public final AtomicInteger b = new AtomicInteger();
    public final String c;
    public final int d;
    public String e;
    public zpf f;
    public int g = 0;
    public int h;
    public int i;
    public long j;
    public ea6 k;
    public int l;
    public int m;
    public int n = -1;
    public int o = -1;
    public long p = -9223372036854775807L;

    public mx4(String str, int i2, int i3) {
        this.a = new l8b(new byte[i3]);
        this.c = str;
        this.d = i2;
    }

    public final void a() {
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.p = -9223372036854775807L;
        this.b.set(0);
    }

    public final boolean b(l8b l8b, byte[] bArr, int i2) {
        int min = Math.min(l8b.a(), i2 - this.h);
        l8b.e(this.h, bArr, min);
        int i3 = this.h + min;
        this.h = i3;
        return i3 == i2;
    }

    public final void c(e eVar) {
        int i2;
        int i3 = eVar.a;
        if (i3 != -2147483647 && (i2 = eVar.b) != -1) {
            ea6 ea6 = this.k;
            String str = eVar.c;
            if (ea6 == null || i2 != ea6.B || i3 != ea6.C || !v0g.a(str, ea6.n)) {
                ea6 ea62 = this.k;
                ba6 ba6 = ea62 == null ? new ba6() : ea62.a();
                ba6.a = this.e;
                ba6.m = vq9.l(str);
                ba6.A = i2;
                ba6.B = i3;
                ba6.d = this.c;
                ba6.f = this.d;
                ea6 ea63 = new ea6(ba6);
                this.k = ea63;
                this.f.e(ea63);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04d3, code lost:
        r4 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01e1, code lost:
        r4 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01e2, code lost:
        r8 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0473  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x04a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(defpackage.l8b r37) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            r3 = 4
            r4 = -1
            r5 = 8
            r7 = 12
            r8 = 1
            zpf r9 = r0.f
            defpackage.n79.o(r9)
        L_0x0010:
            int r9 = r37.a()
            if (r9 <= 0) goto L_0x056d
            int r9 = r0.g
            r16 = 32000(0x7d00, float:4.4842E-41)
            r17 = 44100(0xac44, float:6.1797E-41)
            r18 = 48000(0xbb80, float:6.7262E-41)
            r13 = 1078008818(0x40411bf2, float:3.0173306)
            r10 = 32
            r23 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = 0
            l8b r11 = r0.a
            switch(r9) {
                case 0: goto L_0x04d6;
                case 1: goto L_0x038b;
                case 2: goto L_0x0360;
                case 3: goto L_0x0216;
                case 4: goto L_0x01e7;
                case 5: goto L_0x0081;
                case 6: goto L_0x0036;
                default: goto L_0x0030;
            }
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0036:
            int r2 = r37.a()
            int r6 = r0.l
            int r9 = r0.h
            int r6 = r6 - r9
            int r2 = java.lang.Math.min(r2, r6)
            zpf r6 = r0.f
            r6.b(r1, r2, r14)
            int r6 = r0.h
            int r6 = r6 + r2
            r0.h = r6
            int r2 = r0.l
            if (r6 != r2) goto L_0x0010
            long r9 = r0.p
            int r2 = (r9 > r23 ? 1 : (r9 == r23 ? 0 : -1))
            if (r2 == 0) goto L_0x0059
            r2 = r8
            goto L_0x005a
        L_0x0059:
            r2 = r14
        L_0x005a:
            defpackage.n79.n(r2)
            zpf r15 = r0.f
            long r9 = r0.p
            int r2 = r0.m
            if (r2 != r3) goto L_0x0068
            r18 = r14
            goto L_0x006a
        L_0x0068:
            r18 = r8
        L_0x006a:
            int r2 = r0.l
            r20 = 0
            r21 = 0
            r16 = r9
            r19 = r2
            r15.a(r16, r18, r19, r20, r21)
            long r9 = r0.p
            long r11 = r0.j
            long r9 = r9 + r11
            r0.p = r9
            r0.g = r14
            goto L_0x0010
        L_0x0081:
            byte[] r9 = r11.a
            int r14 = r0.o
            boolean r9 = r0.b(r1, r9, r14)
            if (r9 == 0) goto L_0x0010
            byte[] r9 = r11.a
            java.util.concurrent.atomic.AtomicInteger r14 = r0.b
            ky1 r15 = defpackage.kne.w(r9)
            int r10 = r15.i(r10)
            if (r10 != r13) goto L_0x009b
            r10 = r8
            goto L_0x009c
        L_0x009b:
            r10 = 0
        L_0x009c:
            int[] r13 = defpackage.kne.g
            int r13 = defpackage.kne.G(r15, r13)
            int r22 = r13 + 1
            if (r10 == 0) goto L_0x017c
            boolean r21 = r15.h()
            if (r21 == 0) goto L_0x0175
            int r12 = r13 + -1
            byte r21 = r9[r12]
            int r21 = r21 << 8
            r25 = 65535(0xffff, float:9.1834E-41)
            r21 = r21 & r25
            byte r13 = r9[r13]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r13 = r21 | r13
            int r21 = defpackage.v0g.a
            r5 = r25
            r4 = 0
        L_0x00c2:
            if (r4 >= r12) goto L_0x00ef
            byte r6 = r9[r4]
            r2 = r6 & 255(0xff, float:3.57E-43)
            int r2 = r2 >> r3
            int r8 = r5 >> 12
            r8 = r8 & 255(0xff, float:3.57E-43)
            r2 = r2 ^ r8
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r5 = r5 << r3
            r5 = r5 & r25
            int[] r8 = defpackage.v0g.p
            r2 = r8[r2]
            r2 = r2 ^ r5
            r2 = r2 & r25
            r5 = r6 & 15
            int r6 = r2 >> 12
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5 ^ r6
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r3
            r2 = r2 & r25
            r5 = r8[r5]
            r2 = r2 ^ r5
            r5 = r2 & r25
            r2 = 1
            int r4 = r4 + r2
            r8 = r2
            goto L_0x00c2
        L_0x00ef:
            r2 = r8
            if (r13 != r5) goto L_0x016d
            r4 = 2
            int r5 = r15.i(r4)
            if (r5 == 0) goto L_0x0118
            if (r5 == r2) goto L_0x0115
            if (r5 != r4) goto L_0x0101
            r12 = 384(0x180, float:5.38E-43)
        L_0x00ff:
            r2 = 3
            goto L_0x011b
        L_0x0101:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unsupported base duration index in DTS UHD header: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x0115:
            r12 = 480(0x1e0, float:6.73E-43)
            goto L_0x00ff
        L_0x0118:
            r2 = 3
            r12 = 512(0x200, float:7.175E-43)
        L_0x011b:
            int r4 = r15.i(r2)
            r2 = 1
            int r4 = r4 + r2
            int r4 = r4 * r12
            r5 = 2
            int r6 = r15.i(r5)
            if (r6 == 0) goto L_0x0147
            if (r6 == r2) goto L_0x0144
            if (r6 != r5) goto L_0x0130
            r2 = r18
            goto L_0x0149
        L_0x0130:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unsupported clock rate index in DTS UHD header: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x0144:
            r2 = r17
            goto L_0x0149
        L_0x0147:
            r2 = r16
        L_0x0149:
            boolean r5 = r15.h()
            if (r5 == 0) goto L_0x0154
            r5 = 36
            r15.t(r5)
        L_0x0154:
            r5 = 2
            int r5 = r15.i(r5)
            r6 = 1
            int r5 = r6 << r5
            int r5 = r5 * r2
            long r8 = (long) r4
            long r12 = (long) r2
            java.math.RoundingMode r32 = java.math.RoundingMode.FLOOR
            r28 = 1000000(0xf4240, double:4.940656E-318)
            r26 = r8
            r30 = r12
            long r8 = defpackage.v0g.a0(r26, r28, r30, r32)
            goto L_0x0181
        L_0x016d:
            java.lang.String r0 = "CRC check failed"
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x0175:
            java.lang.String r0 = "Only supports full channel mask-based audio presentation"
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.c(r0)
            throw r0
        L_0x017c:
            r8 = r23
            r5 = -2147483647(0xffffffff80000001, float:-1.4E-45)
        L_0x0181:
            r2 = 0
            r4 = 0
        L_0x0183:
            if (r2 >= r10) goto L_0x018f
            int[] r6 = defpackage.kne.h
            int r6 = defpackage.kne.G(r15, r6)
            int r4 = r4 + r6
            r6 = 1
            int r2 = r2 + r6
            goto L_0x0183
        L_0x018f:
            r6 = 1
            r2 = 0
        L_0x0191:
            if (r2 >= r6) goto L_0x01b0
            if (r10 == 0) goto L_0x019e
            int[] r6 = defpackage.kne.i
            int r6 = defpackage.kne.G(r15, r6)
            r14.set(r6)
        L_0x019e:
            int r6 = r14.get()
            if (r6 == 0) goto L_0x01ab
            int[] r6 = defpackage.kne.j
            int r6 = defpackage.kne.G(r15, r6)
            goto L_0x01ac
        L_0x01ab:
            r6 = 0
        L_0x01ac:
            int r4 = r4 + r6
            r6 = 1
            int r2 = r2 + r6
            goto L_0x0191
        L_0x01b0:
            int r2 = r22 + r4
            e r4 = new e
            java.lang.String r18 = "audio/vnd.dts.uhd;profile=p2"
            r13 = 2
            r12 = r4
            r14 = r5
            r15 = r2
            r16 = r8
            r12.<init>(r13, r14, r15, r16, r18)
            int r5 = r0.m
            r6 = 3
            if (r5 != r6) goto L_0x01c7
            r0.c(r4)
        L_0x01c7:
            r0.l = r2
            int r2 = (r8 > r23 ? 1 : (r8 == r23 ? 0 : -1))
            if (r2 != 0) goto L_0x01d0
            r12 = 0
            goto L_0x01d1
        L_0x01d0:
            r12 = r8
        L_0x01d1:
            r0.j = r12
            r2 = 0
            r11.G(r2)
            zpf r4 = r0.f
            int r5 = r0.o
            r4.b(r11, r5, r2)
            r2 = 6
            r0.g = r2
        L_0x01e1:
            r4 = -1
        L_0x01e2:
            r5 = 8
            r8 = 1
            goto L_0x0010
        L_0x01e7:
            r2 = 6
            byte[] r4 = r11.a
            boolean r2 = r0.b(r1, r4, r2)
            if (r2 == 0) goto L_0x01e1
            byte[] r2 = r11.a
            ky1 r2 = defpackage.kne.w(r2)
            r2.t(r10)
            int[] r4 = defpackage.kne.k
            int r2 = defpackage.kne.G(r2, r4)
            r4 = 1
            int r2 = r2 + r4
            r0.o = r2
            int r4 = r0.h
            if (r4 <= r2) goto L_0x0212
            int r2 = r4 - r2
            int r4 = r4 - r2
            r0.h = r4
            int r4 = r1.b
            int r4 = r4 - r2
            r1.G(r4)
        L_0x0212:
            r2 = 5
            r0.g = r2
            goto L_0x01e1
        L_0x0216:
            byte[] r2 = r11.a
            int r4 = r0.n
            boolean r2 = r0.b(r1, r2, r4)
            if (r2 == 0) goto L_0x01e1
            byte[] r2 = r11.a
            ky1 r2 = defpackage.kne.w(r2)
            r4 = 40
            r2.t(r4)
            r4 = 2
            int r5 = r2.i(r4)
            boolean r6 = r2.h()
            if (r6 != 0) goto L_0x023b
            r6 = 16
            r8 = 8
            goto L_0x023e
        L_0x023b:
            r6 = 20
            r8 = r7
        L_0x023e:
            r2.t(r8)
            int r8 = r2.i(r6)
            r9 = 1
            int r8 = r8 + r9
            boolean r10 = r2.h()
            if (r10 == 0) goto L_0x02ab
            int r12 = r2.i(r4)
            r4 = 3
            int r13 = r2.i(r4)
            int r13 = r13 + r9
            r14 = 512(0x200, float:7.175E-43)
            int r13 = r13 * r14
            boolean r14 = r2.h()
            if (r14 == 0) goto L_0x0265
            r14 = 36
            r2.t(r14)
        L_0x0265:
            int r14 = r2.i(r4)
            int r14 = r14 + r9
            int r4 = r2.i(r4)
            int r4 = r4 + r9
            if (r14 != r9) goto L_0x02a4
            if (r4 != r9) goto L_0x02a4
            int r5 = r5 + r9
            int r4 = r2.i(r5)
            r14 = 0
        L_0x0279:
            if (r14 >= r5) goto L_0x0287
            int r15 = r4 >> r14
            r15 = r15 & r9
            if (r15 != r9) goto L_0x0285
            r15 = 8
            r2.t(r15)
        L_0x0285:
            int r14 = r14 + r9
            goto L_0x0279
        L_0x0287:
            boolean r4 = r2.h()
            if (r4 == 0) goto L_0x02ad
            r4 = 2
            r2.t(r4)
            int r5 = r2.i(r4)
            int r5 = r5 + r9
            int r5 = r5 << r4
            int r14 = r2.i(r4)
            int r14 = r14 + r9
            r4 = 0
        L_0x029d:
            if (r4 >= r14) goto L_0x02ad
            r2.t(r5)
            int r4 = r4 + r9
            goto L_0x029d
        L_0x02a4:
            java.lang.String r0 = "Multiple audio presentations or assets not supported"
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.c(r0)
            throw r0
        L_0x02ab:
            r12 = -1
            r13 = 0
        L_0x02ad:
            r2.t(r6)
            r2.t(r7)
            if (r10 == 0) goto L_0x02f5
            boolean r4 = r2.h()
            if (r4 == 0) goto L_0x02be
            r2.t(r3)
        L_0x02be:
            boolean r4 = r2.h()
            if (r4 == 0) goto L_0x02c9
            r4 = 24
            r2.t(r4)
        L_0x02c9:
            boolean r4 = r2.h()
            if (r4 == 0) goto L_0x02dc
            r4 = 10
            int r4 = r2.i(r4)
            r5 = 1
            int r4 = r4 + r5
            r2.u(r4)
        L_0x02da:
            r4 = 5
            goto L_0x02de
        L_0x02dc:
            r5 = 1
            goto L_0x02da
        L_0x02de:
            r2.t(r4)
            int[] r4 = defpackage.kne.f
            int r6 = r2.i(r3)
            r14 = r4[r6]
            r4 = 8
            int r2 = r2.i(r4)
            int r2 = r2 + r5
            r27 = r2
            r28 = r14
            goto L_0x02fb
        L_0x02f5:
            r5 = 1
            r27 = -1
            r28 = -2147483647(0xffffffff80000001, float:-1.4E-45)
        L_0x02fb:
            if (r10 == 0) goto L_0x0332
            if (r12 == 0) goto L_0x031e
            if (r12 == r5) goto L_0x031b
            r2 = 2
            if (r12 != r2) goto L_0x0307
            r2 = r18
            goto L_0x0320
        L_0x0307:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unsupported reference clock code in DTS HD header: "
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x031b:
            r2 = r17
            goto L_0x0320
        L_0x031e:
            r2 = r16
        L_0x0320:
            long r4 = (long) r13
            long r9 = (long) r2
            int r2 = defpackage.v0g.a
            java.math.RoundingMode r35 = java.math.RoundingMode.FLOOR
            r31 = 1000000(0xf4240, double:4.940656E-318)
            r29 = r4
            r33 = r9
            long r4 = defpackage.v0g.a0(r29, r31, r33, r35)
            goto L_0x0334
        L_0x0332:
            r4 = r23
        L_0x0334:
            e r2 = new e
            java.lang.String r32 = "audio/vnd.dts.hd;profile=lbr"
            r26 = r2
            r29 = r8
            r30 = r4
            r26.<init>(r27, r28, r29, r30, r32)
            r0.c(r2)
            r0.l = r8
            int r2 = (r4 > r23 ? 1 : (r4 == r23 ? 0 : -1))
            if (r2 != 0) goto L_0x034d
            r12 = 0
            goto L_0x034e
        L_0x034d:
            r12 = r4
        L_0x034e:
            r0.j = r12
            r2 = 0
            r11.G(r2)
            zpf r4 = r0.f
            int r5 = r0.n
            r4.b(r11, r5, r2)
            r2 = 6
            r0.g = r2
            goto L_0x01e1
        L_0x0360:
            byte[] r2 = r11.a
            r4 = 7
            boolean r2 = r0.b(r1, r2, r4)
            if (r2 == 0) goto L_0x01e1
            byte[] r2 = r11.a
            ky1 r2 = defpackage.kne.w(r2)
            r4 = 42
            r2.t(r4)
            boolean r4 = r2.h()
            if (r4 == 0) goto L_0x037c
            r4 = r7
            goto L_0x037e
        L_0x037c:
            r4 = 8
        L_0x037e:
            int r2 = r2.i(r4)
            r4 = 1
            int r2 = r2 + r4
            r0.n = r2
            r2 = 3
            r0.g = r2
            goto L_0x01e1
        L_0x038b:
            byte[] r2 = r11.a
            r4 = 18
            boolean r2 = r0.b(r1, r2, r4)
            if (r2 == 0) goto L_0x01e1
            byte[] r2 = r11.a
            ea6 r5 = r0.k
            r6 = 60
            if (r5 != 0) goto L_0x0407
            java.lang.String r5 = r0.e
            ky1 r8 = defpackage.kne.w(r2)
            r8.t(r6)
            r9 = 6
            int r12 = r8.i(r9)
            int[] r9 = defpackage.kne.c
            r9 = r9[r12]
            int r12 = r8.i(r3)
            int[] r13 = defpackage.kne.d
            r12 = r13[r12]
            r13 = 5
            int r14 = r8.i(r13)
            r13 = 29
            if (r14 < r13) goto L_0x03c5
            r13 = -1
            r14 = 2
        L_0x03c2:
            r15 = 10
            goto L_0x03ce
        L_0x03c5:
            int[] r13 = defpackage.kne.e
            r13 = r13[r14]
            int r13 = r13 * 1000
            r14 = 2
            int r13 = r13 / r14
            goto L_0x03c2
        L_0x03ce:
            r8.t(r15)
            int r8 = r8.i(r14)
            if (r8 <= 0) goto L_0x03d9
            r8 = 1
            goto L_0x03da
        L_0x03d9:
            r8 = 0
        L_0x03da:
            int r9 = r9 + r8
            ba6 r8 = new ba6
            r8.<init>()
            r8.a = r5
            java.lang.String r5 = "audio/vnd.dts"
            java.lang.String r5 = defpackage.vq9.l(r5)
            r8.m = r5
            r8.g = r13
            r8.A = r9
            r8.B = r12
            r5 = 0
            r8.q = r5
            java.lang.String r5 = r0.c
            r8.d = r5
            int r5 = r0.d
            r8.f = r5
            ea6 r5 = new ea6
            r5.<init>(r8)
            r0.k = r5
            zpf r8 = r0.f
            r8.e(r5)
        L_0x0407:
            r5 = 0
            byte r8 = r2[r5]
            r5 = 31
            r9 = -2
            if (r8 == r9) goto L_0x045b
            r12 = -1
            if (r8 == r12) goto L_0x0446
            if (r8 == r5) goto L_0x042c
            r12 = 5
            byte r13 = r2[r12]
            r12 = 3
            r12 = r12 & r13
            int r12 = r12 << r7
            r13 = 6
            byte r14 = r2[r13]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 << r3
            r12 = r12 | r14
            r14 = 7
            byte r15 = r2[r14]
            r15 = r15 & 240(0xf0, float:3.36E-43)
            int r15 = r15 >> r3
            r12 = r12 | r15
            r15 = 1
            int r12 = r12 + r15
        L_0x042a:
            r13 = 0
            goto L_0x0471
        L_0x042c:
            r13 = 6
            r14 = 7
            byte r12 = r2[r13]
            r13 = 3
            r12 = r12 & r13
            int r12 = r12 << r7
            byte r13 = r2[r14]
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << r3
            r12 = r12 | r13
            r13 = 8
            byte r15 = r2[r13]
            r13 = r15 & 60
            r15 = 2
            int r13 = r13 >> r15
        L_0x0441:
            r12 = r12 | r13
            r13 = 1
            int r12 = r12 + r13
            r13 = 1
            goto L_0x0471
        L_0x0446:
            r14 = 7
            byte r12 = r2[r14]
            r13 = 3
            r12 = r12 & r13
            int r12 = r12 << r7
            r13 = 6
            byte r14 = r2[r13]
            r13 = r14 & 255(0xff, float:3.57E-43)
            int r13 = r13 << r3
            r12 = r12 | r13
            r13 = 9
            byte r13 = r2[r13]
            r13 = r13 & r6
            r14 = 2
            int r13 = r13 >> r14
            goto L_0x0441
        L_0x045b:
            byte r12 = r2[r3]
            r13 = 3
            r12 = r12 & r13
            int r12 = r12 << r7
            r13 = 7
            byte r14 = r2[r13]
            r13 = r14 & 255(0xff, float:3.57E-43)
            int r13 = r13 << r3
            r12 = r12 | r13
            r13 = 6
            byte r14 = r2[r13]
            r13 = r14 & 240(0xf0, float:3.36E-43)
            int r13 = r13 >> r3
            r12 = r12 | r13
            r13 = 1
            int r12 = r12 + r13
            goto L_0x042a
        L_0x0471:
            if (r13 == 0) goto L_0x0478
            r13 = 16
            int r12 = r12 * r13
            int r12 = r12 / 14
        L_0x0478:
            r0.l = r12
            if (r8 == r9) goto L_0x04a6
            r9 = -1
            if (r8 == r9) goto L_0x049d
            if (r8 == r5) goto L_0x0491
            byte r5 = r2[r3]
            r6 = 1
            r5 = r5 & r6
            r8 = 6
            int r5 = r5 << r8
            r12 = 5
            byte r2 = r2[r12]
            r2 = r2 & 252(0xfc, float:3.53E-43)
            r13 = 2
        L_0x048d:
            int r2 = r2 >> r13
            r2 = r2 | r5
            r6 = 1
            goto L_0x04b5
        L_0x0491:
            r8 = 6
            r12 = 5
            r13 = 2
            byte r5 = r2[r12]
            r12 = 7
            r5 = r5 & r12
            int r5 = r5 << r3
            byte r2 = r2[r8]
        L_0x049b:
            r2 = r2 & r6
            goto L_0x048d
        L_0x049d:
            r12 = 7
            r13 = 2
            byte r5 = r2[r3]
            r5 = r5 & r12
            int r5 = r5 << r3
            byte r2 = r2[r12]
            goto L_0x049b
        L_0x04a6:
            r5 = 5
            r9 = -1
            r13 = 2
            byte r5 = r2[r5]
            r6 = 1
            r5 = r5 & r6
            r8 = 6
            int r5 = r5 << r8
            byte r2 = r2[r3]
            r2 = r2 & 252(0xfc, float:3.53E-43)
            int r2 = r2 >> r13
            r2 = r2 | r5
        L_0x04b5:
            int r2 = r2 + r6
            int r2 = r2 * r10
            long r5 = (long) r2
            ea6 r2 = r0.k
            int r2 = r2.C
            long r5 = defpackage.v0g.Y(r2, r5)
            int r2 = defpackage.cvg.r(r5)
            long r5 = (long) r2
            r0.j = r5
            r2 = 0
            r11.G(r2)
            zpf r5 = r0.f
            r5.b(r11, r4, r2)
            r2 = 6
            r0.g = r2
        L_0x04d3:
            r4 = r9
            goto L_0x01e2
        L_0x04d6:
            r9 = r4
        L_0x04d7:
            int r2 = r37.a()
            if (r2 <= 0) goto L_0x04d3
            int r2 = r0.i
            r4 = 8
            int r2 = r2 << r4
            r0.i = r2
            int r4 = r37.u()
            r2 = r2 | r4
            r0.i = r2
            r4 = 2147385345(0x7ffe8001, float:NaN)
            if (r2 == r4) goto L_0x0526
            r4 = -25230976(0xfffffffffe7f0180, float:-8.474023E37)
            if (r2 == r4) goto L_0x0526
            r4 = 536864768(0x1fffe800, float:1.0838051E-19)
            if (r2 == r4) goto L_0x0526
            r4 = -14745368(0xffffffffff1f00e8, float:-2.1135196E38)
            if (r2 != r4) goto L_0x0500
            goto L_0x0526
        L_0x0500:
            r4 = 1683496997(0x64582025, float:1.5947252E22)
            if (r2 == r4) goto L_0x0524
            r4 = 622876772(0x25205864, float:1.3907736E-16)
            if (r2 != r4) goto L_0x050b
            goto L_0x0524
        L_0x050b:
            if (r2 == r13) goto L_0x0522
            r4 = -233094848(0xfffffffff21b4140, float:-3.0751398E30)
            if (r2 != r4) goto L_0x0513
            goto L_0x0522
        L_0x0513:
            r4 = 1908687592(0x71c442e8, float:1.9436783E30)
            if (r2 == r4) goto L_0x0520
            r4 = -398277519(0xffffffffe842c471, float:-3.6790512E24)
            if (r2 != r4) goto L_0x051e
            goto L_0x0520
        L_0x051e:
            r4 = 0
            goto L_0x0527
        L_0x0520:
            r4 = r3
            goto L_0x0527
        L_0x0522:
            r4 = 3
            goto L_0x0527
        L_0x0524:
            r4 = 2
            goto L_0x0527
        L_0x0526:
            r4 = 1
        L_0x0527:
            r0.m = r4
            if (r4 == 0) goto L_0x04d7
            byte[] r5 = r11.a
            r6 = 24
            int r8 = r2 >> 24
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r10 = 0
            r5[r10] = r8
            r8 = 16
            int r10 = r2 >> 16
            r10 = r10 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10
            r11 = 1
            r5[r11] = r10
            r10 = 8
            int r11 = r2 >> 8
            r11 = r11 & 255(0xff, float:3.57E-43)
            byte r11 = (byte) r11
            r12 = 2
            r5[r12] = r11
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r12 = 3
            r5[r12] = r2
            r0.h = r3
            r2 = 0
            r0.i = r2
            if (r4 == r12) goto L_0x055a
            if (r4 != r3) goto L_0x055c
        L_0x055a:
            r5 = 1
            goto L_0x056a
        L_0x055c:
            r5 = 1
            if (r4 != r5) goto L_0x0566
            r0.g = r5
        L_0x0561:
            r8 = r5
            r4 = r9
            r5 = r10
            goto L_0x0010
        L_0x0566:
            r4 = 2
            r0.g = r4
            goto L_0x0561
        L_0x056a:
            r0.g = r3
            goto L_0x0561
        L_0x056d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mx4.f(l8b):void");
    }

    public final void g(boolean z) {
    }

    public final void i(int i2, long j2) {
        this.p = j2;
    }

    public final void k(xf5 xf5, qtf qtf) {
        qtf.a();
        qtf.b();
        this.e = qtf.f;
        qtf.b();
        this.f = xf5.B(qtf.e, 1);
    }
}
