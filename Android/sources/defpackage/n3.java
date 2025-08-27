package defpackage;

import kotlin.uuid.Uuid;

/* renamed from: n3  reason: default package */
public final class n3 implements v05 {
    public final /* synthetic */ int a;
    public final ky1 b;
    public final g1g c;
    public final String d;
    public String e;
    public ypf f;
    public int g;
    public int h;
    public boolean i;
    public long j;
    public ca6 k;
    public int l;
    public long m;

    public n3(String str, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                byte[] bArr = new byte[16];
                this.b = new ky1(bArr, (byte) 0, 16, 1);
                this.c = new g1g(bArr);
                this.g = 0;
                this.h = 0;
                this.i = false;
                this.m = -9223372036854775807L;
                this.d = str;
                return;
            default:
                byte[] bArr2 = new byte[Uuid.SIZE_BITS];
                this.b = new ky1(bArr2, (byte) 0, (int) Uuid.SIZE_BITS, 1);
                this.c = new g1g(bArr2);
                this.g = 0;
                this.m = -9223372036854775807L;
                this.d = str;
                return;
        }
    }

    private final void b() {
    }

    private final void c() {
    }

    public final void a() {
        switch (this.a) {
            case 0:
                this.g = 0;
                this.h = 0;
                this.i = false;
                this.m = -9223372036854775807L;
                return;
            default:
                this.g = 0;
                this.h = 0;
                this.i = false;
                this.m = -9223372036854775807L;
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:197:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(defpackage.g1g r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            int r2 = r0.a
            switch(r2) {
                case 0: goto L_0x0119;
                default: goto L_0x0009;
            }
        L_0x0009:
            ypf r2 = r0.f
            defpackage.y64.k(r2)
        L_0x000e:
            int r2 = r21.c()
            if (r2 <= 0) goto L_0x0118
            int r2 = r0.g
            g1g r3 = r0.c
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x00d5
            if (r2 == r5) goto L_0x005a
            if (r2 == r4) goto L_0x0022
            goto L_0x000e
        L_0x0022:
            int r2 = r21.c()
            int r3 = r0.l
            int r4 = r0.h
            int r3 = r3 - r4
            int r2 = java.lang.Math.min(r2, r3)
            ypf r3 = r0.f
            r3.c(r2, r1)
            int r3 = r0.h
            int r3 = r3 + r2
            r0.h = r3
            int r11 = r0.l
            if (r3 != r11) goto L_0x000e
            long r8 = r0.m
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0057
            ypf r7 = r0.f
            r13 = 0
            r10 = 1
            r12 = 0
            r7.b(r8, r10, r11, r12, r13)
            long r2 = r0.m
            long r4 = r0.j
            long r2 = r2 + r4
            r0.m = r2
        L_0x0057:
            r0.g = r6
            goto L_0x000e
        L_0x005a:
            byte[] r2 = r3.a
            int r5 = r21.c()
            int r7 = r0.h
            r8 = 16
            int r7 = 16 - r7
            int r5 = java.lang.Math.min(r5, r7)
            int r7 = r0.h
            r1.g(r7, r2, r5)
            int r2 = r0.h
            int r2 = r2 + r5
            r0.h = r2
            if (r2 != r8) goto L_0x000e
            ky1 r2 = r0.b
            r2.q(r6)
            r3 r2 = defpackage.kv0.W(r2)
            ca6 r5 = r0.k
            java.lang.String r7 = "audio/ac4"
            int r9 = r2.a
            if (r5 == 0) goto L_0x0097
            int r10 = r5.H0
            if (r4 != r10) goto L_0x0097
            int r10 = r5.I0
            if (r9 != r10) goto L_0x0097
            java.lang.String r5 = r5.Z
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L_0x00b6
        L_0x0097:
            aa6 r5 = new aa6
            r5.<init>()
            java.lang.String r10 = r0.e
            r5.a = r10
            r5.k = r7
            r5.x = r4
            r5.y = r9
            java.lang.String r7 = r0.d
            r5.c = r7
            ca6 r7 = new ca6
            r7.<init>(r5)
            r0.k = r7
            ypf r5 = r0.f
            r5.d(r7)
        L_0x00b6:
            int r5 = r2.b
            r0.l = r5
            int r2 = r2.c
            long r9 = (long) r2
            r11 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r9 * r11
            ca6 r2 = r0.k
            int r2 = r2.I0
            long r11 = (long) r2
            long r9 = r9 / r11
            r0.j = r9
            r3.H(r6)
            ypf r2 = r0.f
            r2.c(r8, r3)
            r0.g = r4
            goto L_0x000e
        L_0x00d5:
            int r2 = r21.c()
            if (r2 <= 0) goto L_0x000e
            boolean r2 = r0.i
            r7 = 172(0xac, float:2.41E-43)
            if (r2 != 0) goto L_0x00ed
            int r2 = r21.v()
            if (r2 != r7) goto L_0x00e9
            r2 = r5
            goto L_0x00ea
        L_0x00e9:
            r2 = r6
        L_0x00ea:
            r0.i = r2
            goto L_0x00d5
        L_0x00ed:
            int r2 = r21.v()
            if (r2 != r7) goto L_0x00f5
            r7 = r5
            goto L_0x00f6
        L_0x00f5:
            r7 = r6
        L_0x00f6:
            r0.i = r7
            r7 = 65
            r8 = 64
            if (r2 == r8) goto L_0x0100
            if (r2 != r7) goto L_0x00d5
        L_0x0100:
            if (r2 != r7) goto L_0x0104
            r2 = r5
            goto L_0x0105
        L_0x0104:
            r2 = r6
        L_0x0105:
            r0.g = r5
            byte[] r3 = r3.a
            r9 = -84
            r3[r6] = r9
            if (r2 == 0) goto L_0x0110
            goto L_0x0111
        L_0x0110:
            r7 = r8
        L_0x0111:
            byte r2 = (byte) r7
            r3[r5] = r2
            r0.h = r4
            goto L_0x000e
        L_0x0118:
            return
        L_0x0119:
            ypf r2 = r0.f
            defpackage.y64.k(r2)
        L_0x011e:
            int r2 = r21.c()
            if (r2 <= 0) goto L_0x049b
            int r2 = r0.g
            r3 = 1
            r4 = 11
            g1g r5 = r0.c
            r6 = 2
            r7 = 0
            if (r2 == 0) goto L_0x0461
            if (r2 == r3) goto L_0x016c
            if (r2 == r6) goto L_0x0134
            goto L_0x011e
        L_0x0134:
            int r2 = r21.c()
            int r3 = r0.l
            int r4 = r0.h
            int r3 = r3 - r4
            int r2 = java.lang.Math.min(r2, r3)
            ypf r3 = r0.f
            r3.c(r2, r1)
            int r3 = r0.h
            int r3 = r3 + r2
            r0.h = r3
            int r12 = r0.l
            if (r3 != r12) goto L_0x011e
            long r9 = r0.m
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0169
            ypf r8 = r0.f
            r14 = 0
            r11 = 1
            r13 = 0
            r8.b(r9, r11, r12, r13, r14)
            long r2 = r0.m
            long r4 = r0.j
            long r2 = r2 + r4
            r0.m = r2
        L_0x0169:
            r0.g = r7
            goto L_0x011e
        L_0x016c:
            byte[] r2 = r5.a
            int r8 = r21.c()
            int r9 = r0.h
            r10 = 128(0x80, float:1.794E-43)
            int r9 = 128 - r9
            int r8 = java.lang.Math.min(r8, r9)
            int r9 = r0.h
            r1.g(r9, r2, r8)
            int r2 = r0.h
            int r2 = r2 + r8
            r0.h = r2
            if (r2 != r10) goto L_0x011e
            ky1 r2 = r0.b
            r2.q(r7)
            int r8 = r2.g()
            r9 = 40
            r2.t(r9)
            r9 = 5
            int r11 = r2.i(r9)
            r12 = 10
            if (r11 <= r12) goto L_0x01a1
            r11 = r3
            goto L_0x01a2
        L_0x01a1:
            r11 = r7
        L_0x01a2:
            r2.q(r8)
            int[] r8 = defpackage.bs0.d
            int[] r13 = defpackage.bs0.b
            r15 = 8
            r10 = 3
            if (r11 == 0) goto L_0x03be
            r11 = 16
            r2.t(r11)
            int r7 = r2.i(r6)
            if (r7 == 0) goto L_0x01c3
            if (r7 == r3) goto L_0x01c1
            if (r7 == r6) goto L_0x01bf
            r7 = -1
            goto L_0x01c4
        L_0x01bf:
            r7 = r6
            goto L_0x01c4
        L_0x01c1:
            r7 = r3
            goto L_0x01c4
        L_0x01c3:
            r7 = 0
        L_0x01c4:
            r2.t(r10)
            int r4 = r2.i(r4)
            int r4 = r4 + r3
            int r4 = r4 * r6
            int r14 = r2.i(r6)
            if (r14 != r10) goto L_0x01df
            int[] r13 = defpackage.bs0.c
            int r16 = r2.i(r6)
            r13 = r13[r16]
            r19 = r10
            r6 = 6
            goto L_0x01ed
        L_0x01df:
            int r16 = r2.i(r6)
            int[] r18 = defpackage.bs0.a
            r18 = r18[r16]
            r13 = r13[r14]
            r19 = r16
            r6 = r18
        L_0x01ed:
            int r11 = r6 * 256
            int r3 = r2.i(r10)
            boolean r16 = r2.h()
            r8 = r8[r3]
            int r8 = r8 + r16
            r2.t(r12)
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x0207
            r2.t(r15)
        L_0x0207:
            if (r3 != 0) goto L_0x0215
            r2.t(r9)
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x0215
            r2.t(r15)
        L_0x0215:
            r12 = 1
            if (r7 != r12) goto L_0x0223
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x0223
            r12 = 16
            r2.t(r12)
        L_0x0223:
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x0351
            r12 = 2
            if (r3 <= r12) goto L_0x022f
            r2.t(r12)
        L_0x022f:
            r18 = r3 & 1
            if (r18 == 0) goto L_0x023a
            if (r3 <= r12) goto L_0x023a
            r12 = 6
            r2.t(r12)
            goto L_0x023b
        L_0x023a:
            r12 = 6
        L_0x023b:
            r17 = r3 & 4
            if (r17 == 0) goto L_0x0242
            r2.t(r12)
        L_0x0242:
            if (r16 == 0) goto L_0x024d
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x024d
            r2.t(r9)
        L_0x024d:
            if (r7 != 0) goto L_0x0351
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x025a
            r12 = 6
            r2.t(r12)
            goto L_0x025b
        L_0x025a:
            r12 = 6
        L_0x025b:
            if (r3 != 0) goto L_0x0266
            boolean r16 = r2.h()
            if (r16 == 0) goto L_0x0266
            r2.t(r12)
        L_0x0266:
            boolean r16 = r2.h()
            if (r16 == 0) goto L_0x026f
            r2.t(r12)
        L_0x026f:
            r12 = 2
            int r15 = r2.i(r12)
            r10 = 1
            if (r15 != r10) goto L_0x027d
            r2.t(r9)
            r15 = r12
            goto L_0x031c
        L_0x027d:
            if (r15 != r12) goto L_0x0287
            r10 = 12
            r2.t(r10)
        L_0x0284:
            r15 = 2
            goto L_0x031c
        L_0x0287:
            r10 = 3
            if (r15 != r10) goto L_0x0284
            int r10 = r2.i(r9)
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x02f1
            r2.t(r9)
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x02a2
            r12 = 4
            r2.t(r12)
            goto L_0x02a3
        L_0x02a2:
            r12 = 4
        L_0x02a3:
            boolean r15 = r2.h()
            if (r15 == 0) goto L_0x02ac
            r2.t(r12)
        L_0x02ac:
            boolean r15 = r2.h()
            if (r15 == 0) goto L_0x02b5
            r2.t(r12)
        L_0x02b5:
            boolean r15 = r2.h()
            if (r15 == 0) goto L_0x02be
            r2.t(r12)
        L_0x02be:
            boolean r15 = r2.h()
            if (r15 == 0) goto L_0x02c7
            r2.t(r12)
        L_0x02c7:
            boolean r15 = r2.h()
            if (r15 == 0) goto L_0x02d0
            r2.t(r12)
        L_0x02d0:
            boolean r15 = r2.h()
            if (r15 == 0) goto L_0x02d9
            r2.t(r12)
        L_0x02d9:
            boolean r15 = r2.h()
            if (r15 == 0) goto L_0x02f1
            boolean r15 = r2.h()
            if (r15 == 0) goto L_0x02e8
            r2.t(r12)
        L_0x02e8:
            boolean r15 = r2.h()
            if (r15 == 0) goto L_0x02f1
            r2.t(r12)
        L_0x02f1:
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x0311
            r2.t(r9)
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x0311
            r12 = 7
            r2.t(r12)
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x0311
            r12 = 8
            r2.t(r12)
        L_0x030f:
            r15 = 2
            goto L_0x0314
        L_0x0311:
            r12 = 8
            goto L_0x030f
        L_0x0314:
            int r10 = r10 + r15
            int r10 = r10 * r12
            r2.t(r10)
            r2.c()
        L_0x031c:
            if (r3 >= r15) goto L_0x0334
            boolean r10 = r2.h()
            r12 = 14
            if (r10 == 0) goto L_0x0329
            r2.t(r12)
        L_0x0329:
            if (r3 != 0) goto L_0x0334
            boolean r10 = r2.h()
            if (r10 == 0) goto L_0x0334
            r2.t(r12)
        L_0x0334:
            boolean r10 = r2.h()
            if (r10 == 0) goto L_0x0351
            r10 = r19
            if (r10 != 0) goto L_0x0342
            r2.t(r9)
            goto L_0x0353
        L_0x0342:
            r12 = 0
        L_0x0343:
            if (r12 >= r6) goto L_0x0353
            boolean r15 = r2.h()
            if (r15 == 0) goto L_0x034e
            r2.t(r9)
        L_0x034e:
            int r12 = r12 + 1
            goto L_0x0343
        L_0x0351:
            r10 = r19
        L_0x0353:
            boolean r6 = r2.h()
            if (r6 == 0) goto L_0x0389
            r2.t(r9)
            r6 = 2
            if (r3 != r6) goto L_0x0363
            r9 = 4
            r2.t(r9)
        L_0x0363:
            r9 = 6
            if (r3 < r9) goto L_0x0369
            r2.t(r6)
        L_0x0369:
            boolean r6 = r2.h()
            if (r6 == 0) goto L_0x0375
            r6 = 8
            r2.t(r6)
            goto L_0x0377
        L_0x0375:
            r6 = 8
        L_0x0377:
            if (r3 != 0) goto L_0x0382
            boolean r3 = r2.h()
            if (r3 == 0) goto L_0x0382
            r2.t(r6)
        L_0x0382:
            r3 = 3
            if (r14 >= r3) goto L_0x038a
            r2.s()
            goto L_0x038a
        L_0x0389:
            r3 = 3
        L_0x038a:
            if (r7 != 0) goto L_0x0391
            if (r10 == r3) goto L_0x0391
            r2.s()
        L_0x0391:
            r6 = 2
            if (r7 != r6) goto L_0x039e
            if (r10 == r3) goto L_0x039c
            boolean r3 = r2.h()
            if (r3 == 0) goto L_0x039e
        L_0x039c:
            r3 = 6
            goto L_0x03a0
        L_0x039e:
            r3 = 6
            goto L_0x03a3
        L_0x03a0:
            r2.t(r3)
        L_0x03a3:
            boolean r6 = r2.h()
            if (r6 == 0) goto L_0x03bb
            int r3 = r2.i(r3)
            r6 = 1
            if (r3 != r6) goto L_0x03bb
            r3 = 8
            int r2 = r2.i(r3)
            if (r2 != r6) goto L_0x03bb
            java.lang.String r2 = "audio/eac3-joc"
            goto L_0x040f
        L_0x03bb:
            java.lang.String r2 = "audio/eac3"
            goto L_0x040f
        L_0x03be:
            r3 = 32
            r2.t(r3)
            r3 = 2
            int r4 = r2.i(r3)
            r3 = 3
            if (r4 != r3) goto L_0x03ce
            r6 = 0
        L_0x03cc:
            r7 = 6
            goto L_0x03d1
        L_0x03ce:
            java.lang.String r6 = "audio/ac3"
            goto L_0x03cc
        L_0x03d1:
            int r7 = r2.i(r7)
            int r7 = defpackage.bs0.G(r4, r7)
            r9 = 8
            r2.t(r9)
            int r9 = r2.i(r3)
            r3 = r9 & 1
            if (r3 == 0) goto L_0x03ee
            r3 = 1
            if (r9 == r3) goto L_0x03ee
            r3 = 2
            r2.t(r3)
            goto L_0x03ef
        L_0x03ee:
            r3 = 2
        L_0x03ef:
            r10 = r9 & 4
            if (r10 == 0) goto L_0x03f6
            r2.t(r3)
        L_0x03f6:
            if (r9 != r3) goto L_0x03fb
            r2.t(r3)
        L_0x03fb:
            r3 = 3
            if (r4 >= r3) goto L_0x0401
            r14 = r13[r4]
            goto L_0x0402
        L_0x0401:
            r14 = -1
        L_0x0402:
            boolean r2 = r2.h()
            r3 = r8[r9]
            int r8 = r3 + r2
            r11 = 1536(0x600, float:2.152E-42)
            r2 = r6
            r4 = r7
            r13 = r14
        L_0x040f:
            ca6 r3 = r0.k
            if (r3 == 0) goto L_0x0423
            int r6 = r3.H0
            if (r8 != r6) goto L_0x0423
            int r6 = r3.I0
            if (r13 != r6) goto L_0x0423
            java.lang.String r3 = r3.Z
            boolean r3 = defpackage.t0g.a(r2, r3)
            if (r3 != 0) goto L_0x0442
        L_0x0423:
            aa6 r3 = new aa6
            r3.<init>()
            java.lang.String r6 = r0.e
            r3.a = r6
            r3.k = r2
            r3.x = r8
            r3.y = r13
            java.lang.String r2 = r0.d
            r3.c = r2
            ca6 r2 = new ca6
            r2.<init>(r3)
            r0.k = r2
            ypf r3 = r0.f
            r3.d(r2)
        L_0x0442:
            r0.l = r4
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = (long) r11
            long r6 = r6 * r2
            ca6 r2 = r0.k
            int r2 = r2.I0
            long r2 = (long) r2
            long r6 = r6 / r2
            r0.j = r6
            r2 = 0
            r5.H(r2)
            ypf r2 = r0.f
            r3 = 128(0x80, float:1.794E-43)
            r2.c(r3, r5)
            r2 = 2
            r0.g = r2
            goto L_0x011e
        L_0x0461:
            int r2 = r21.c()
            if (r2 <= 0) goto L_0x011e
            boolean r2 = r0.i
            if (r2 != 0) goto L_0x0477
            int r2 = r21.v()
            if (r2 != r4) goto L_0x0473
            r12 = 1
            goto L_0x0474
        L_0x0473:
            r12 = 0
        L_0x0474:
            r0.i = r12
            goto L_0x0461
        L_0x0477:
            int r2 = r21.v()
            r3 = 119(0x77, float:1.67E-43)
            if (r2 != r3) goto L_0x0490
            r12 = 0
            r0.i = r12
            r6 = 1
            r0.g = r6
            byte[] r2 = r5.a
            r2[r12] = r4
            r2[r6] = r3
            r3 = 2
            r0.h = r3
            goto L_0x011e
        L_0x0490:
            r3 = 2
            r6 = 1
            r12 = 0
            if (r2 != r4) goto L_0x0497
            r2 = r6
            goto L_0x0498
        L_0x0497:
            r2 = r12
        L_0x0498:
            r0.i = r2
            goto L_0x0461
        L_0x049b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n3.h(g1g):void");
    }

    public final void i(int i2, long j2) {
        switch (this.a) {
            case 0:
                if (j2 != -9223372036854775807L) {
                    this.m = j2;
                    return;
                }
                return;
            default:
                if (j2 != -9223372036854775807L) {
                    this.m = j2;
                    return;
                }
                return;
        }
    }

    public final void j() {
        int i2 = this.a;
    }

    public final void l(wf5 wf5, qtf qtf) {
        switch (this.a) {
            case 0:
                qtf.a();
                qtf.b();
                this.e = qtf.f;
                qtf.b();
                this.f = wf5.B(qtf.e, 1);
                return;
            default:
                qtf.a();
                qtf.b();
                this.e = qtf.f;
                qtf.b();
                this.f = wf5.B(qtf.e, 1);
                return;
        }
    }
}
