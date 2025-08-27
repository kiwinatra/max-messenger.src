package defpackage;

import java.util.Arrays;
import kotlin.KotlinVersion;

/* renamed from: heg  reason: default package */
public final class heg extends ixe {
    public mqf o;
    public int p;
    public boolean q;
    public jeg r;
    public d6a s;

    public final void a(long j) {
        this.d = j;
        int i = 0;
        this.q = j != 0;
        jeg jeg = this.r;
        if (jeg != null) {
            i = jeg.e;
        }
        this.p = i;
    }

    public final long c(g1g g1g) {
        int i = 0;
        byte b = g1g.a[0];
        if ((b & 1) == 1) {
            return -1;
        }
        mqf mqf = this.o;
        y64.k(mqf);
        boolean z = ((bv1[]) mqf.c)[(b >> 1) & (KotlinVersion.MAX_COMPONENT_VALUE >>> (8 - mqf.b))].b;
        jeg jeg = (jeg) mqf.o;
        int i2 = !z ? jeg.e : jeg.f;
        if (this.q) {
            i = (this.p + i2) / 4;
        }
        long j = (long) i;
        byte[] bArr = g1g.a;
        int length = bArr.length;
        int i3 = g1g.c + 4;
        if (length < i3) {
            byte[] copyOf = Arrays.copyOf(bArr, i3);
            g1g.F(copyOf.length, copyOf);
        } else {
            g1g.G(i3);
        }
        byte[] bArr2 = g1g.a;
        int i4 = g1g.c;
        bArr2[i4 - 4] = (byte) ((int) (j & 255));
        bArr2[i4 - 3] = (byte) ((int) ((j >>> 8) & 255));
        bArr2[i4 - 2] = (byte) ((int) ((j >>> 16) & 255));
        bArr2[i4 - 1] = (byte) ((int) ((j >>> 24) & 255));
        this.q = true;
        this.p = i2;
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:158:0x03a0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(defpackage.g1g r22, long r23, defpackage.xe8 r25) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r25
            mqf r3 = r0.o
            r4 = 0
            if (r3 == 0) goto L_0x0013
            java.lang.Object r0 = r2.b
            ca6 r0 = (defpackage.ca6) r0
            r0.getClass()
            return r4
        L_0x0013:
            jeg r6 = r0.r
            r3 = 1
            r5 = 4
            if (r6 != 0) goto L_0x006a
            defpackage.n54.V(r3, r1, r4)
            r22.n()
            int r10 = r22.v()
            int r11 = r22.n()
            int r4 = r22.j()
            if (r4 > 0) goto L_0x002f
            r12 = -1
            goto L_0x0030
        L_0x002f:
            r12 = r4
        L_0x0030:
            int r4 = r22.j()
            if (r4 > 0) goto L_0x0038
            r13 = -1
            goto L_0x0039
        L_0x0038:
            r13 = r4
        L_0x0039:
            r22.j()
            int r4 = r22.v()
            r6 = r4 & 15
            double r6 = (double) r6
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r6 = java.lang.Math.pow(r14, r6)
            int r6 = (int) r6
            r4 = r4 & 240(0xf0, float:3.36E-43)
            int r4 = r4 >> r5
            double r4 = (double) r4
            double r4 = java.lang.Math.pow(r14, r4)
            int r15 = (int) r4
            r22.v()
            byte[] r4 = r1.a
            int r1 = r1.c
            byte[] r16 = java.util.Arrays.copyOf(r4, r1)
            jeg r1 = new jeg
            r9 = r1
            r14 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r0.r = r1
        L_0x0067:
            r8 = 0
            goto L_0x039c
        L_0x006a:
            d6a r9 = r0.s
            if (r9 != 0) goto L_0x0075
            d6a r1 = defpackage.n54.L(r1, r3, r3)
            r0.s = r1
            goto L_0x0067
        L_0x0075:
            int r10 = r1.c
            byte[] r11 = new byte[r10]
            byte[] r12 = r1.a
            java.lang.System.arraycopy(r12, r4, r11, r4, r10)
            r10 = 5
            defpackage.n54.V(r10, r1, r4)
            int r12 = r22.v()
            int r12 = r12 + r3
            ky1 r13 = new ky1
            byte[] r14 = r1.a
            r15 = 5
            r13.<init>((int) r15, (byte[]) r14)
            int r1 = r1.b
            r14 = 8
            int r1 = r1 * r14
            r13.t(r1)
            r1 = r4
        L_0x0098:
            r15 = 24
            r7 = 16
            if (r1 >= r12) goto L_0x01a5
            int r14 = r13.i(r15)
            r8 = 5653314(0x564342, float:7.92198E-39)
            if (r14 != r8) goto L_0x0184
            int r7 = r13.i(r7)
            int r8 = r13.i(r15)
            long[] r14 = new long[r8]
            boolean r15 = r13.h()
            r17 = 0
            if (r15 != 0) goto L_0x00f2
            boolean r15 = r13.h()
            r4 = 0
        L_0x00be:
            if (r4 >= r8) goto L_0x00ec
            if (r15 == 0) goto L_0x00da
            boolean r19 = r13.h()
            if (r19 == 0) goto L_0x00d5
            int r19 = r13.i(r10)
            int r5 = r19 + 1
            r19 = r11
            long r10 = (long) r5
            r14[r4] = r10
        L_0x00d3:
            r5 = 5
            goto L_0x00e5
        L_0x00d5:
            r19 = r11
            r14[r4] = r17
            goto L_0x00d3
        L_0x00da:
            r5 = r10
            r19 = r11
            int r10 = r13.i(r5)
            int r10 = r10 + r3
            long r10 = (long) r10
            r14[r4] = r10
        L_0x00e5:
            int r4 = r4 + 1
            r10 = r5
            r11 = r19
            r5 = 4
            goto L_0x00be
        L_0x00ec:
            r19 = r11
        L_0x00ee:
            r20 = r9
            r4 = 4
            goto L_0x0121
        L_0x00f2:
            r5 = r10
            r19 = r11
            int r4 = r13.i(r5)
            int r4 = r4 + r3
            r5 = 0
        L_0x00fb:
            if (r5 >= r8) goto L_0x00ee
            int r10 = r8 - r5
            int r10 = defpackage.n54.q(r10)
            int r10 = r13.i(r10)
            r11 = 0
        L_0x0108:
            if (r11 >= r10) goto L_0x011a
            if (r5 >= r8) goto L_0x011a
            r20 = r9
            r15 = r10
            long r9 = (long) r4
            r14[r5] = r9
            int r5 = r5 + 1
            int r11 = r11 + 1
            r10 = r15
            r9 = r20
            goto L_0x0108
        L_0x011a:
            r20 = r9
            int r4 = r4 + 1
            r9 = r20
            goto L_0x00fb
        L_0x0121:
            int r5 = r13.i(r4)
            r9 = 2
            if (r5 > r9) goto L_0x016b
            if (r5 == r3) goto L_0x012c
            if (r5 != r9) goto L_0x015e
        L_0x012c:
            r9 = 32
            r13.t(r9)
            r13.t(r9)
            int r9 = r13.i(r4)
            int r9 = r9 + r3
            r13.t(r3)
            if (r5 != r3) goto L_0x0153
            if (r7 == 0) goto L_0x0157
            long r4 = (long) r8
            long r7 = (long) r7
            double r4 = (double) r4
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r7 = (double) r7
            double r10 = r10 / r7
            double r4 = java.lang.Math.pow(r4, r10)
            double r4 = java.lang.Math.floor(r4)
            long r4 = (long) r4
            r17 = r4
            goto L_0x0157
        L_0x0153:
            long r4 = (long) r8
            long r7 = (long) r7
            long r17 = r4 * r7
        L_0x0157:
            long r4 = (long) r9
            long r4 = r4 * r17
            int r4 = (int) r4
            r13.t(r4)
        L_0x015e:
            int r1 = r1 + 1
            r11 = r19
            r9 = r20
            r4 = 0
            r5 = 4
            r10 = 5
            r14 = 8
            goto L_0x0098
        L_0x016b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 53
            r0.<init>(r1)
            java.lang.String r1 = "lookup type greater than 2 not decodable: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x0184:
            int r0 = r13.d
            r1 = 8
            int r0 = r0 * r1
            int r1 = r13.e
            int r0 = r0 + r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 66
            r1.<init>(r2)
            java.lang.String r2 = "expected code book to start with [0x56, 0x43, 0x42] at "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x01a5:
            r20 = r9
            r19 = r11
            r1 = 6
            int r4 = r13.i(r1)
            int r4 = r4 + r3
            r5 = 0
        L_0x01b0:
            if (r5 >= r4) goto L_0x01c3
            int r8 = r13.i(r7)
            if (r8 != 0) goto L_0x01bb
            int r5 = r5 + 1
            goto L_0x01b0
        L_0x01bb:
            java.lang.String r0 = "placeholder of time domain transforms not zeroed out"
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x01c3:
            int r4 = r13.i(r1)
            int r4 = r4 + r3
            r5 = 0
        L_0x01c9:
            r8 = 3
            if (r5 >= r4) goto L_0x027b
            int r9 = r13.i(r7)
            if (r9 == 0) goto L_0x0251
            if (r9 != r3) goto L_0x0238
            r10 = 5
            int r9 = r13.i(r10)
            int[] r10 = new int[r9]
            r11 = 0
            r12 = -1
        L_0x01dd:
            if (r11 >= r9) goto L_0x01ee
            r14 = 4
            int r15 = r13.i(r14)
            r10[r11] = r15
            if (r15 <= r12) goto L_0x01e9
            r12 = r15
        L_0x01e9:
            int r11 = r11 + 1
            r15 = 24
            goto L_0x01dd
        L_0x01ee:
            int r12 = r12 + 1
            int[] r11 = new int[r12]
            r14 = 0
        L_0x01f3:
            if (r14 >= r12) goto L_0x021a
            int r15 = r13.i(r8)
            int r15 = r15 + r3
            r11[r14] = r15
            r15 = 2
            int r18 = r13.i(r15)
            r15 = 8
            if (r18 <= 0) goto L_0x0208
            r13.t(r15)
        L_0x0208:
            r8 = 0
        L_0x0209:
            int r1 = r3 << r18
            if (r8 >= r1) goto L_0x0215
            r13.t(r15)
            int r8 = r8 + 1
            r15 = 8
            goto L_0x0209
        L_0x0215:
            int r14 = r14 + 1
            r1 = 6
            r8 = 3
            goto L_0x01f3
        L_0x021a:
            r1 = 2
            r13.t(r1)
            r1 = 4
            int r8 = r13.i(r1)
            r1 = 0
            r12 = 0
            r14 = 0
        L_0x0226:
            if (r1 >= r9) goto L_0x0274
            r15 = r10[r1]
            r15 = r11[r15]
            int r12 = r12 + r15
        L_0x022d:
            if (r14 >= r12) goto L_0x0235
            r13.t(r8)
            int r14 = r14 + 1
            goto L_0x022d
        L_0x0235:
            int r1 = r1 + 1
            goto L_0x0226
        L_0x0238:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 52
            r0.<init>(r1)
            java.lang.String r1 = "floor type greater than 1 not decodable: "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x0251:
            r1 = 8
            r13.t(r1)
            r13.t(r7)
            r13.t(r7)
            r8 = 6
            r13.t(r8)
            r13.t(r1)
            r8 = 4
            int r9 = r13.i(r8)
            int r9 = r9 + r3
            r8 = 0
        L_0x026a:
            if (r8 >= r9) goto L_0x0274
            r13.t(r1)
            int r8 = r8 + 1
            r1 = 8
            goto L_0x026a
        L_0x0274:
            int r5 = r5 + 1
            r1 = 6
            r15 = 24
            goto L_0x01c9
        L_0x027b:
            int r4 = r13.i(r1)
            int r4 = r4 + r3
            r5 = 0
        L_0x0281:
            if (r5 >= r4) goto L_0x02ea
            int r8 = r13.i(r7)
            r9 = 2
            if (r8 > r9) goto L_0x02e2
            r8 = 24
            r13.t(r8)
            r13.t(r8)
            r13.t(r8)
            int r9 = r13.i(r1)
            int r9 = r9 + r3
            r1 = 8
            r13.t(r1)
            int[] r10 = new int[r9]
            r11 = 0
        L_0x02a2:
            if (r11 >= r9) goto L_0x02c1
            r12 = 3
            int r14 = r13.i(r12)
            boolean r15 = r13.h()
            if (r15 == 0) goto L_0x02b5
            r15 = 5
            int r17 = r13.i(r15)
            goto L_0x02b8
        L_0x02b5:
            r15 = 5
            r17 = 0
        L_0x02b8:
            int r17 = r17 * 8
            int r17 = r17 + r14
            r10[r11] = r17
            int r11 = r11 + 1
            goto L_0x02a2
        L_0x02c1:
            r12 = 3
            r15 = 5
            r11 = 0
        L_0x02c4:
            if (r11 >= r9) goto L_0x02de
            r14 = 0
        L_0x02c7:
            if (r14 >= r1) goto L_0x02d9
            r17 = r10[r11]
            int r18 = r3 << r14
            r17 = r17 & r18
            if (r17 == 0) goto L_0x02d4
            r13.t(r1)
        L_0x02d4:
            int r14 = r14 + 1
            r1 = 8
            goto L_0x02c7
        L_0x02d9:
            int r11 = r11 + 1
            r1 = 8
            goto L_0x02c4
        L_0x02de:
            int r5 = r5 + 1
            r1 = 6
            goto L_0x0281
        L_0x02e2:
            java.lang.String r0 = "residueType greater than 2 is not decodable"
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x02ea:
            int r4 = r13.i(r1)
            int r4 = r4 + r3
            r1 = 0
        L_0x02f0:
            if (r1 >= r4) goto L_0x035e
            int r5 = r13.i(r7)
            if (r5 == 0) goto L_0x02fb
            r5 = 2
            r11 = 4
            goto L_0x0353
        L_0x02fb:
            boolean r5 = r13.h()
            if (r5 == 0) goto L_0x0308
            r5 = 4
            int r8 = r13.i(r5)
            int r8 = r8 + r3
            goto L_0x0309
        L_0x0308:
            r8 = r3
        L_0x0309:
            boolean r5 = r13.h()
            int r9 = r6.a
            if (r5 == 0) goto L_0x032e
            r5 = 8
            int r10 = r13.i(r5)
            int r10 = r10 + r3
            r5 = 0
        L_0x0319:
            if (r5 >= r10) goto L_0x032e
            int r11 = r9 + -1
            int r12 = defpackage.n54.q(r11)
            r13.t(r12)
            int r11 = defpackage.n54.q(r11)
            r13.t(r11)
            int r5 = r5 + 1
            goto L_0x0319
        L_0x032e:
            r5 = 2
            int r10 = r13.i(r5)
            if (r10 != 0) goto L_0x0356
            if (r8 <= r3) goto L_0x0341
            r10 = 0
        L_0x0338:
            if (r10 >= r9) goto L_0x0341
            r11 = 4
            r13.t(r11)
            int r10 = r10 + 1
            goto L_0x0338
        L_0x0341:
            r11 = 4
            r9 = 0
        L_0x0343:
            if (r9 >= r8) goto L_0x0353
            r10 = 8
            r13.t(r10)
            r13.t(r10)
            r13.t(r10)
            int r9 = r9 + 1
            goto L_0x0343
        L_0x0353:
            int r1 = r1 + 1
            goto L_0x02f0
        L_0x0356:
            java.lang.String r0 = "to reserved bits must be zero after mapping coupling steps"
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x035e:
            r1 = 6
            int r1 = r13.i(r1)
            int r4 = r1 + 1
            bv1[] r9 = new defpackage.bv1[r4]
            r5 = 0
        L_0x0368:
            if (r5 >= r4) goto L_0x0385
            boolean r8 = r13.h()
            r13.i(r7)
            r13.i(r7)
            r10 = 8
            r13.i(r10)
            bv1 r11 = new bv1
            r12 = 10
            r11.<init>((boolean) r8, (int) r12)
            r9[r5] = r11
            int r5 = r5 + 1
            goto L_0x0368
        L_0x0385:
            boolean r4 = r13.h()
            if (r4 == 0) goto L_0x03eb
            int r10 = defpackage.n54.q(r1)
            mqf r1 = new mqf
            r11 = 14
            r5 = r1
            r7 = r20
            r8 = r19
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r8 = r1
        L_0x039c:
            r0.o = r8
            if (r8 != 0) goto L_0x03a1
            return r3
        L_0x03a1:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r8.o
            jeg r1 = (defpackage.jeg) r1
            byte[] r4 = r1.g
            r0.add(r4)
            java.lang.Object r4 = r8.w
            byte[] r4 = (byte[]) r4
            r0.add(r4)
            java.lang.Object r4 = r8.v
            d6a r4 = (defpackage.d6a) r4
            java.lang.Object r4 = r4.b
            java.lang.String[] r4 = (java.lang.String[]) r4
            k0d r4 = defpackage.tb7.q(r4)
            rp9 r4 = defpackage.n54.G(r4)
            aa6 r5 = new aa6
            r5.<init>()
            java.lang.String r6 = "audio/vorbis"
            r5.k = r6
            int r6 = r1.d
            r5.f = r6
            int r6 = r1.c
            r5.g = r6
            int r6 = r1.a
            r5.x = r6
            int r1 = r1.b
            r5.y = r1
            r5.m = r0
            r5.i = r4
            ca6 r0 = new ca6
            r0.<init>(r5)
            r2.b = r0
            return r3
        L_0x03eb:
            java.lang.String r0 = "framing bit after modes not set as expected"
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.heg.e(g1g, long, xe8):boolean");
    }

    public final void f(boolean z) {
        super.f(z);
        if (z) {
            this.o = null;
            this.r = null;
            this.s = null;
        }
        this.p = 0;
        this.q = false;
    }
}
