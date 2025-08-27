package defpackage;

import kotlin.uuid.Uuid;

/* renamed from: o3  reason: default package */
public final class o3 implements w05 {
    public final /* synthetic */ int a;
    public final ky1 b;
    public final l8b c;
    public final String d;
    public final int e;
    public String f;
    public zpf g;
    public int h;
    public int i;
    public boolean j;
    public long k;
    public ea6 l;
    public int m;
    public long n;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public o3() {
        this((String) null, 0, 0);
        this.a = 0;
    }

    private final void b(boolean z) {
    }

    private final void c(boolean z) {
    }

    public final void a() {
        switch (this.a) {
            case 0:
                this.h = 0;
                this.i = 0;
                this.j = false;
                this.n = -9223372036854775807L;
                return;
            default:
                this.h = 0;
                this.i = 0;
                this.j = false;
                this.n = -9223372036854775807L;
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:198:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(defpackage.l8b r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            int r2 = r0.a
            switch(r2) {
                case 0: goto L_0x012a;
                default: goto L_0x0009;
            }
        L_0x0009:
            zpf r2 = r0.g
            defpackage.n79.o(r2)
        L_0x000e:
            int r2 = r23.a()
            if (r2 <= 0) goto L_0x0129
            int r2 = r0.h
            l8b r3 = r0.c
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x00e6
            if (r2 == r5) goto L_0x0063
            if (r2 == r4) goto L_0x0022
            goto L_0x000e
        L_0x0022:
            int r2 = r23.a()
            int r3 = r0.m
            int r4 = r0.i
            int r3 = r3 - r4
            int r2 = java.lang.Math.min(r2, r3)
            zpf r3 = r0.g
            r3.b(r1, r2, r6)
            int r3 = r0.i
            int r3 = r3 + r2
            r0.i = r3
            int r2 = r0.m
            if (r3 != r2) goto L_0x000e
            long r2 = r0.n
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r5 = r6
        L_0x004a:
            defpackage.n79.n(r5)
            zpf r7 = r0.g
            long r8 = r0.n
            int r11 = r0.m
            r13 = 0
            r10 = 1
            r12 = 0
            r7.a(r8, r10, r11, r12, r13)
            long r2 = r0.n
            long r4 = r0.k
            long r2 = r2 + r4
            r0.n = r2
            r0.h = r6
            goto L_0x000e
        L_0x0063:
            byte[] r2 = r3.a
            int r5 = r23.a()
            int r7 = r0.i
            r8 = 16
            int r7 = 16 - r7
            int r5 = java.lang.Math.min(r5, r7)
            int r7 = r0.i
            r1.e(r7, r2, r5)
            int r2 = r0.i
            int r2 = r2 + r5
            r0.i = r2
            if (r2 != r8) goto L_0x000e
            ky1 r2 = r0.b
            r2.q(r6)
            r3 r2 = defpackage.n54.F(r2)
            ea6 r5 = r0.l
            java.lang.String r7 = "audio/ac4"
            int r9 = r2.a
            if (r5 == 0) goto L_0x00a0
            int r10 = r5.B
            if (r4 != r10) goto L_0x00a0
            int r10 = r5.C
            if (r9 != r10) goto L_0x00a0
            java.lang.String r5 = r5.n
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L_0x00c7
        L_0x00a0:
            ba6 r5 = new ba6
            r5.<init>()
            java.lang.String r10 = r0.f
            r5.a = r10
            java.lang.String r7 = defpackage.vq9.l(r7)
            r5.m = r7
            r5.A = r4
            r5.B = r9
            java.lang.String r7 = r0.d
            r5.d = r7
            int r7 = r0.e
            r5.f = r7
            ea6 r7 = new ea6
            r7.<init>(r5)
            r0.l = r7
            zpf r5 = r0.g
            r5.e(r7)
        L_0x00c7:
            int r5 = r2.b
            r0.m = r5
            int r2 = r2.c
            long r9 = (long) r2
            r11 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r9 * r11
            ea6 r2 = r0.l
            int r2 = r2.C
            long r11 = (long) r2
            long r9 = r9 / r11
            r0.k = r9
            r3.G(r6)
            zpf r2 = r0.g
            r2.b(r3, r8, r6)
            r0.h = r4
            goto L_0x000e
        L_0x00e6:
            int r2 = r23.a()
            if (r2 <= 0) goto L_0x000e
            boolean r2 = r0.j
            r7 = 172(0xac, float:2.41E-43)
            if (r2 != 0) goto L_0x00fe
            int r2 = r23.u()
            if (r2 != r7) goto L_0x00fa
            r2 = r5
            goto L_0x00fb
        L_0x00fa:
            r2 = r6
        L_0x00fb:
            r0.j = r2
            goto L_0x00e6
        L_0x00fe:
            int r2 = r23.u()
            if (r2 != r7) goto L_0x0106
            r7 = r5
            goto L_0x0107
        L_0x0106:
            r7 = r6
        L_0x0107:
            r0.j = r7
            r7 = 65
            r8 = 64
            if (r2 == r8) goto L_0x0111
            if (r2 != r7) goto L_0x00e6
        L_0x0111:
            if (r2 != r7) goto L_0x0115
            r2 = r5
            goto L_0x0116
        L_0x0115:
            r2 = r6
        L_0x0116:
            r0.h = r5
            byte[] r3 = r3.a
            r9 = -84
            r3[r6] = r9
            if (r2 == 0) goto L_0x0121
            goto L_0x0122
        L_0x0121:
            r7 = r8
        L_0x0122:
            byte r2 = (byte) r7
            r3[r5] = r2
            r0.i = r4
            goto L_0x000e
        L_0x0129:
            return
        L_0x012a:
            zpf r2 = r0.g
            defpackage.n79.o(r2)
        L_0x012f:
            int r2 = r23.a()
            if (r2 <= 0) goto L_0x04e1
            int r2 = r0.h
            r3 = 2
            r4 = 1
            r5 = 11
            l8b r6 = r0.c
            r7 = 0
            if (r2 == 0) goto L_0x04a7
            if (r2 == r4) goto L_0x0186
            if (r2 == r3) goto L_0x0145
            goto L_0x012f
        L_0x0145:
            int r2 = r23.a()
            int r3 = r0.m
            int r5 = r0.i
            int r3 = r3 - r5
            int r2 = java.lang.Math.min(r2, r3)
            zpf r3 = r0.g
            r3.b(r1, r2, r7)
            int r3 = r0.i
            int r3 = r3 + r2
            r0.i = r3
            int r2 = r0.m
            if (r3 != r2) goto L_0x012f
            long r2 = r0.n
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x016c
            goto L_0x016d
        L_0x016c:
            r4 = r7
        L_0x016d:
            defpackage.n79.n(r4)
            zpf r8 = r0.g
            long r9 = r0.n
            int r12 = r0.m
            r14 = 0
            r11 = 1
            r13 = 0
            r8.a(r9, r11, r12, r13, r14)
            long r2 = r0.n
            long r4 = r0.k
            long r2 = r2 + r4
            r0.n = r2
            r0.h = r7
            goto L_0x012f
        L_0x0186:
            byte[] r2 = r6.a
            int r8 = r23.a()
            int r9 = r0.i
            r10 = 128(0x80, float:1.794E-43)
            int r9 = 128 - r9
            int r8 = java.lang.Math.min(r8, r9)
            int r9 = r0.i
            r1.e(r9, r2, r8)
            int r2 = r0.i
            int r2 = r2 + r8
            r0.i = r2
            if (r2 != r10) goto L_0x012f
            ky1 r2 = r0.b
            r2.q(r7)
            int r8 = r2.g()
            r9 = 40
            r2.t(r9)
            r9 = 5
            int r11 = r2.i(r9)
            r12 = 10
            if (r11 <= r12) goto L_0x01bb
            r11 = r4
            goto L_0x01bc
        L_0x01bb:
            r11 = r7
        L_0x01bc:
            r2.q(r8)
            int[] r8 = defpackage.ev0.d
            int[] r13 = defpackage.ev0.b
            java.lang.String r14 = "audio/ac3"
            r15 = 8
            r7 = 3
            if (r11 == 0) goto L_0x03eb
            r11 = 16
            r2.t(r11)
            int r10 = r2.i(r3)
            if (r10 == 0) goto L_0x01df
            if (r10 == r4) goto L_0x01dd
            if (r10 == r3) goto L_0x01db
            r10 = -1
            goto L_0x01e0
        L_0x01db:
            r10 = r3
            goto L_0x01e0
        L_0x01dd:
            r10 = r4
            goto L_0x01e0
        L_0x01df:
            r10 = 0
        L_0x01e0:
            r2.t(r7)
            int r5 = r2.i(r5)
            int r5 = r5 + r4
            int r5 = r5 * r3
            int r11 = r2.i(r3)
            if (r11 != r7) goto L_0x01fb
            int[] r13 = defpackage.ev0.c
            int r16 = r2.i(r3)
            r13 = r13[r16]
            r19 = r7
            r3 = 6
            goto L_0x0209
        L_0x01fb:
            int r16 = r2.i(r3)
            int[] r18 = defpackage.ev0.a
            r18 = r18[r16]
            r13 = r13[r11]
            r19 = r16
            r3 = r18
        L_0x0209:
            int r4 = r3 * 256
            int r16 = r5 * r13
            int r20 = r3 * 32
            int r16 = r16 / r20
            int r9 = r2.i(r7)
            boolean r21 = r2.h()
            r8 = r8[r9]
            int r8 = r8 + r21
            r2.t(r12)
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x0229
            r2.t(r15)
        L_0x0229:
            if (r9 != 0) goto L_0x0238
            r12 = 5
            r2.t(r12)
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x0238
            r2.t(r15)
        L_0x0238:
            r12 = 1
            if (r10 != r12) goto L_0x0246
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x0246
            r12 = 16
            r2.t(r12)
        L_0x0246:
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x037b
            r12 = 2
            if (r9 <= r12) goto L_0x0252
            r2.t(r12)
        L_0x0252:
            r18 = r9 & 1
            if (r18 == 0) goto L_0x025d
            if (r9 <= r12) goto L_0x025d
            r12 = 6
            r2.t(r12)
            goto L_0x025e
        L_0x025d:
            r12 = 6
        L_0x025e:
            r17 = r9 & 4
            if (r17 == 0) goto L_0x0265
            r2.t(r12)
        L_0x0265:
            if (r21 == 0) goto L_0x0271
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x0271
            r12 = 5
            r2.t(r12)
        L_0x0271:
            if (r10 != 0) goto L_0x037b
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x027e
            r12 = 6
            r2.t(r12)
            goto L_0x027f
        L_0x027e:
            r12 = 6
        L_0x027f:
            if (r9 != 0) goto L_0x028a
            boolean r17 = r2.h()
            if (r17 == 0) goto L_0x028a
            r2.t(r12)
        L_0x028a:
            boolean r17 = r2.h()
            if (r17 == 0) goto L_0x0293
            r2.t(r12)
        L_0x0293:
            r12 = 2
            int r15 = r2.i(r12)
            r7 = 1
            if (r15 != r7) goto L_0x02a2
            r7 = 5
            r2.t(r7)
            r15 = r12
            goto L_0x0343
        L_0x02a2:
            r7 = 5
            if (r15 != r12) goto L_0x02ad
            r12 = 12
            r2.t(r12)
        L_0x02aa:
            r15 = 2
            goto L_0x0343
        L_0x02ad:
            r12 = 3
            if (r15 != r12) goto L_0x02aa
            int r12 = r2.i(r7)
            boolean r15 = r2.h()
            if (r15 == 0) goto L_0x0317
            r2.t(r7)
            boolean r7 = r2.h()
            if (r7 == 0) goto L_0x02c8
            r7 = 4
            r2.t(r7)
            goto L_0x02c9
        L_0x02c8:
            r7 = 4
        L_0x02c9:
            boolean r15 = r2.h()
            if (r15 == 0) goto L_0x02d2
            r2.t(r7)
        L_0x02d2:
            boolean r15 = r2.h()
            if (r15 == 0) goto L_0x02db
            r2.t(r7)
        L_0x02db:
            boolean r15 = r2.h()
            if (r15 == 0) goto L_0x02e4
            r2.t(r7)
        L_0x02e4:
            boolean r15 = r2.h()
            if (r15 == 0) goto L_0x02ed
            r2.t(r7)
        L_0x02ed:
            boolean r15 = r2.h()
            if (r15 == 0) goto L_0x02f6
            r2.t(r7)
        L_0x02f6:
            boolean r15 = r2.h()
            if (r15 == 0) goto L_0x02ff
            r2.t(r7)
        L_0x02ff:
            boolean r15 = r2.h()
            if (r15 == 0) goto L_0x0317
            boolean r15 = r2.h()
            if (r15 == 0) goto L_0x030e
            r2.t(r7)
        L_0x030e:
            boolean r15 = r2.h()
            if (r15 == 0) goto L_0x0317
            r2.t(r7)
        L_0x0317:
            boolean r7 = r2.h()
            if (r7 == 0) goto L_0x0338
            r7 = 5
            r2.t(r7)
            boolean r7 = r2.h()
            if (r7 == 0) goto L_0x0338
            r7 = 7
            r2.t(r7)
            boolean r7 = r2.h()
            if (r7 == 0) goto L_0x0338
            r7 = 8
            r2.t(r7)
        L_0x0336:
            r15 = 2
            goto L_0x033b
        L_0x0338:
            r7 = 8
            goto L_0x0336
        L_0x033b:
            int r12 = r12 + r15
            int r12 = r12 * r7
            r2.t(r12)
            r2.c()
        L_0x0343:
            if (r9 >= r15) goto L_0x035b
            boolean r7 = r2.h()
            r12 = 14
            if (r7 == 0) goto L_0x0350
            r2.t(r12)
        L_0x0350:
            if (r9 != 0) goto L_0x035b
            boolean r7 = r2.h()
            if (r7 == 0) goto L_0x035b
            r2.t(r12)
        L_0x035b:
            boolean r7 = r2.h()
            if (r7 == 0) goto L_0x037b
            r7 = r19
            if (r7 != 0) goto L_0x036a
            r12 = 5
            r2.t(r12)
            goto L_0x037d
        L_0x036a:
            r12 = 5
            r15 = 0
        L_0x036c:
            if (r15 >= r3) goto L_0x037d
            boolean r19 = r2.h()
            if (r19 == 0) goto L_0x0377
            r2.t(r12)
        L_0x0377:
            int r15 = r15 + 1
            r12 = 5
            goto L_0x036c
        L_0x037b:
            r7 = r19
        L_0x037d:
            boolean r3 = r2.h()
            if (r3 == 0) goto L_0x03b4
            r3 = 5
            r2.t(r3)
            r3 = 2
            if (r9 != r3) goto L_0x038e
            r12 = 4
            r2.t(r12)
        L_0x038e:
            r12 = 6
            if (r9 < r12) goto L_0x0394
            r2.t(r3)
        L_0x0394:
            boolean r3 = r2.h()
            if (r3 == 0) goto L_0x03a0
            r3 = 8
            r2.t(r3)
            goto L_0x03a2
        L_0x03a0:
            r3 = 8
        L_0x03a2:
            if (r9 != 0) goto L_0x03ad
            boolean r9 = r2.h()
            if (r9 == 0) goto L_0x03ad
            r2.t(r3)
        L_0x03ad:
            r3 = 3
            if (r11 >= r3) goto L_0x03b5
            r2.s()
            goto L_0x03b5
        L_0x03b4:
            r3 = 3
        L_0x03b5:
            if (r10 != 0) goto L_0x03bc
            if (r7 == r3) goto L_0x03bc
            r2.s()
        L_0x03bc:
            r9 = 2
            if (r10 != r9) goto L_0x03c9
            if (r7 == r3) goto L_0x03c7
            boolean r3 = r2.h()
            if (r3 == 0) goto L_0x03c9
        L_0x03c7:
            r3 = 6
            goto L_0x03cb
        L_0x03c9:
            r3 = 6
            goto L_0x03ce
        L_0x03cb:
            r2.t(r3)
        L_0x03ce:
            boolean r7 = r2.h()
            if (r7 == 0) goto L_0x03e6
            int r3 = r2.i(r3)
            r7 = 1
            if (r3 != r7) goto L_0x03e6
            r3 = 8
            int r2 = r2.i(r3)
            if (r2 != r7) goto L_0x03e6
            java.lang.String r2 = "audio/eac3-joc"
            goto L_0x03e8
        L_0x03e6:
            java.lang.String r2 = "audio/eac3"
        L_0x03e8:
            r7 = r16
            goto L_0x0443
        L_0x03eb:
            r3 = 32
            r2.t(r3)
            r3 = 2
            int r4 = r2.i(r3)
            r3 = 3
            if (r4 != r3) goto L_0x03fb
            r3 = 0
        L_0x03f9:
            r5 = 6
            goto L_0x03fd
        L_0x03fb:
            r3 = r14
            goto L_0x03f9
        L_0x03fd:
            int r5 = r2.i(r5)
            int[] r7 = defpackage.ev0.e
            int r9 = r5 / 2
            r7 = r7[r9]
            int r7 = r7 * 1000
            int r5 = defpackage.ev0.n(r4, r5)
            r9 = 8
            r2.t(r9)
            r9 = 3
            int r10 = r2.i(r9)
            r9 = r10 & 1
            if (r9 == 0) goto L_0x0423
            r9 = 1
            if (r10 == r9) goto L_0x0423
            r9 = 2
            r2.t(r9)
            goto L_0x0424
        L_0x0423:
            r9 = 2
        L_0x0424:
            r11 = r10 & 4
            if (r11 == 0) goto L_0x042b
            r2.t(r9)
        L_0x042b:
            if (r10 != r9) goto L_0x0430
            r2.t(r9)
        L_0x0430:
            r9 = 3
            if (r4 >= r9) goto L_0x0436
            r15 = r13[r4]
            goto L_0x0437
        L_0x0436:
            r15 = -1
        L_0x0437:
            boolean r2 = r2.h()
            r4 = r8[r10]
            int r8 = r4 + r2
            r4 = 1536(0x600, float:2.152E-42)
            r2 = r3
            r13 = r15
        L_0x0443:
            ea6 r3 = r0.l
            if (r3 == 0) goto L_0x0457
            int r9 = r3.B
            if (r8 != r9) goto L_0x0457
            int r9 = r3.C
            if (r13 != r9) goto L_0x0457
            java.lang.String r3 = r3.n
            boolean r3 = defpackage.v0g.a(r2, r3)
            if (r3 != 0) goto L_0x0488
        L_0x0457:
            ba6 r3 = new ba6
            r3.<init>()
            java.lang.String r9 = r0.f
            r3.a = r9
            java.lang.String r9 = defpackage.vq9.l(r2)
            r3.m = r9
            r3.A = r8
            r3.B = r13
            java.lang.String r8 = r0.d
            r3.d = r8
            int r8 = r0.e
            r3.f = r8
            r3.h = r7
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x047c
            r3.g = r7
        L_0x047c:
            ea6 r2 = new ea6
            r2.<init>(r3)
            r0.l = r2
            zpf r3 = r0.g
            r3.e(r2)
        L_0x0488:
            r0.m = r5
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = (long) r4
            long r4 = r4 * r2
            ea6 r2 = r0.l
            int r2 = r2.C
            long r2 = (long) r2
            long r4 = r4 / r2
            r0.k = r4
            r2 = 0
            r6.G(r2)
            zpf r3 = r0.g
            r4 = 128(0x80, float:1.794E-43)
            r3.b(r6, r4, r2)
            r2 = 2
            r0.h = r2
            goto L_0x012f
        L_0x04a7:
            int r2 = r23.a()
            if (r2 <= 0) goto L_0x012f
            boolean r2 = r0.j
            if (r2 != 0) goto L_0x04bd
            int r2 = r23.u()
            if (r2 != r5) goto L_0x04b9
            r12 = 1
            goto L_0x04ba
        L_0x04b9:
            r12 = 0
        L_0x04ba:
            r0.j = r12
            goto L_0x04a7
        L_0x04bd:
            int r2 = r23.u()
            r3 = 119(0x77, float:1.67E-43)
            if (r2 != r3) goto L_0x04d6
            r12 = 0
            r0.j = r12
            r4 = 1
            r0.h = r4
            byte[] r2 = r6.a
            r2[r12] = r5
            r2[r4] = r3
            r3 = 2
            r0.i = r3
            goto L_0x012f
        L_0x04d6:
            r3 = 2
            r4 = 1
            r12 = 0
            if (r2 != r5) goto L_0x04dd
            r2 = r4
            goto L_0x04de
        L_0x04dd:
            r2 = r12
        L_0x04de:
            r0.j = r2
            goto L_0x04a7
        L_0x04e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o3.f(l8b):void");
    }

    public final void g(boolean z) {
        int i2 = this.a;
    }

    public final void i(int i2, long j2) {
        switch (this.a) {
            case 0:
                this.n = j2;
                return;
            default:
                this.n = j2;
                return;
        }
    }

    public final void k(xf5 xf5, qtf qtf) {
        switch (this.a) {
            case 0:
                qtf.a();
                qtf.b();
                this.f = qtf.f;
                qtf.b();
                this.g = xf5.B(qtf.e, 1);
                return;
            default:
                qtf.a();
                qtf.b();
                this.f = qtf.f;
                qtf.b();
                this.g = xf5.B(qtf.e, 1);
                return;
        }
    }

    public o3(String str, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                ky1 ky1 = new ky1(new byte[16], (byte) 0, 16, 2);
                this.b = ky1;
                this.c = new l8b(ky1.b);
                this.h = 0;
                this.i = 0;
                this.j = false;
                this.n = -9223372036854775807L;
                this.d = str;
                this.e = i2;
                return;
            default:
                ky1 ky12 = new ky1(new byte[Uuid.SIZE_BITS], (byte) 0, (int) Uuid.SIZE_BITS, 2);
                this.b = ky12;
                this.c = new l8b(ky12.b);
                this.h = 0;
                this.n = -9223372036854775807L;
                this.d = str;
                this.e = i2;
                return;
        }
    }
}
