package defpackage;

import java.util.Arrays;
import kotlin.KotlinVersion;

/* renamed from: ieg  reason: default package */
public final class ieg extends ixe {
    public mqf o;
    public int p;
    public boolean q;
    public jeg r;
    public ykb s;

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

    public final long b(l8b l8b) {
        int i = 0;
        byte b = l8b.a[0];
        if ((b & 1) == 1) {
            return -1;
        }
        mqf mqf = this.o;
        n79.o(mqf);
        boolean z = ((bv1[]) mqf.c)[(b >> 1) & (KotlinVersion.MAX_COMPONENT_VALUE >>> (8 - mqf.b))].b;
        jeg jeg = (jeg) mqf.o;
        int i2 = !z ? jeg.e : jeg.f;
        if (this.q) {
            i = (this.p + i2) / 4;
        }
        long j = (long) i;
        byte[] bArr = l8b.a;
        int length = bArr.length;
        int i3 = l8b.c + 4;
        if (length < i3) {
            byte[] copyOf = Arrays.copyOf(bArr, i3);
            l8b.E(copyOf.length, copyOf);
        } else {
            l8b.F(i3);
        }
        byte[] bArr2 = l8b.a;
        int i4 = l8b.c;
        bArr2[i4 - 4] = (byte) ((int) (j & 255));
        bArr2[i4 - 3] = (byte) ((int) ((j >>> 8) & 255));
        bArr2[i4 - 2] = (byte) ((int) ((j >>> 16) & 255));
        bArr2[i4 - 1] = (byte) ((int) ((j >>> 24) & 255));
        this.q = true;
        this.p = i2;
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:151:0x0369 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x036a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(defpackage.l8b r23, long r24, defpackage.ox0 r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r26
            mqf r3 = r0.o
            r4 = 0
            if (r3 == 0) goto L_0x0013
            java.lang.Object r0 = r2.c
            ea6 r0 = (defpackage.ea6) r0
            r0.getClass()
            return r4
        L_0x0013:
            jeg r6 = r0.r
            r3 = 1
            r5 = 4
            if (r6 != 0) goto L_0x006a
            defpackage.o54.S(r3, r1, r4)
            r23.m()
            int r10 = r23.u()
            int r11 = r23.m()
            int r4 = r23.i()
            if (r4 > 0) goto L_0x002f
            r12 = -1
            goto L_0x0030
        L_0x002f:
            r12 = r4
        L_0x0030:
            int r4 = r23.i()
            if (r4 > 0) goto L_0x0038
            r13 = -1
            goto L_0x0039
        L_0x0038:
            r13 = r4
        L_0x0039:
            r23.i()
            int r4 = r23.u()
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
            r23.u()
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
            goto L_0x0365
        L_0x006a:
            ykb r9 = r0.s
            if (r9 != 0) goto L_0x0075
            ykb r1 = defpackage.o54.H(r1, r3, r3)
            r0.s = r1
            goto L_0x0067
        L_0x0075:
            int r10 = r1.c
            byte[] r11 = new byte[r10]
            byte[] r12 = r1.a
            java.lang.System.arraycopy(r12, r4, r11, r4, r10)
            r10 = 5
            defpackage.o54.S(r10, r1, r4)
            int r12 = r23.u()
            int r12 = r12 + r3
            ky1 r13 = new ky1
            byte[] r14 = r1.a
            r15 = 6
            r13.<init>((int) r15, (byte[]) r14)
            int r1 = r1.b
            r14 = 8
            int r1 = r1 * r14
            r13.t(r1)
            r1 = r4
        L_0x0098:
            r15 = 24
            r4 = 2
            r7 = 16
            if (r1 >= r12) goto L_0x0154
            int r14 = r13.i(r15)
            r8 = 5653314(0x564342, float:7.92198E-39)
            if (r14 != r8) goto L_0x0138
            int r7 = r13.i(r7)
            int r8 = r13.i(r15)
            boolean r14 = r13.h()
            if (r14 != 0) goto L_0x00cf
            boolean r14 = r13.h()
            r15 = 0
        L_0x00bb:
            if (r15 >= r8) goto L_0x00e1
            if (r14 == 0) goto L_0x00c9
            boolean r17 = r13.h()
            if (r17 == 0) goto L_0x00cc
            r13.t(r10)
            goto L_0x00cc
        L_0x00c9:
            r13.t(r10)
        L_0x00cc:
            int r15 = r15 + 1
            goto L_0x00bb
        L_0x00cf:
            r13.t(r10)
            r14 = 0
        L_0x00d3:
            if (r14 >= r8) goto L_0x00e1
            int r15 = r8 - r14
            int r15 = defpackage.o54.v(r15)
            int r15 = r13.i(r15)
            int r14 = r14 + r15
            goto L_0x00d3
        L_0x00e1:
            int r14 = r13.i(r5)
            if (r14 > r4) goto L_0x0124
            if (r14 == r3) goto L_0x00eb
            if (r14 != r4) goto L_0x011d
        L_0x00eb:
            r4 = 32
            r13.t(r4)
            r13.t(r4)
            int r4 = r13.i(r5)
            int r4 = r4 + r3
            r13.t(r3)
            if (r14 != r3) goto L_0x0114
            if (r7 == 0) goto L_0x0111
            long r14 = (long) r8
            long r7 = (long) r7
            double r14 = (double) r14
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r7 = (double) r7
            double r7 = r17 / r7
            double r7 = java.lang.Math.pow(r14, r7)
            double r7 = java.lang.Math.floor(r7)
            long r7 = (long) r7
            goto L_0x0117
        L_0x0111:
            r7 = 0
            goto L_0x0117
        L_0x0114:
            long r14 = (long) r8
            long r7 = (long) r7
            long r7 = r7 * r14
        L_0x0117:
            long r14 = (long) r4
            long r7 = r7 * r14
            int r4 = (int) r7
            r13.t(r4)
        L_0x011d:
            int r1 = r1 + 1
            r4 = 0
            r14 = 8
            goto L_0x0098
        L_0x0124:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "lookup type greater than 2 not decodable: "
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x0138:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "expected code book to start with [0x56, 0x43, 0x42] at "
            r0.<init>(r1)
            int r1 = r13.d
            r2 = 8
            int r1 = r1 * r2
            int r2 = r13.e
            int r1 = r1 + r2
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x0154:
            r1 = 6
            int r8 = r13.i(r1)
            int r8 = r8 + r3
            r12 = 0
        L_0x015b:
            if (r12 >= r8) goto L_0x016e
            int r14 = r13.i(r7)
            if (r14 != 0) goto L_0x0166
            int r12 = r12 + 1
            goto L_0x015b
        L_0x0166:
            java.lang.String r0 = "placeholder of time domain transforms not zeroed out"
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x016e:
            int r8 = r13.i(r1)
            int r8 = r8 + r3
            r12 = 0
        L_0x0174:
            r14 = 3
            if (r12 >= r8) goto L_0x022b
            int r15 = r13.i(r7)
            if (r15 == 0) goto L_0x01fa
            if (r15 != r3) goto L_0x01e6
            int r15 = r13.i(r10)
            int[] r10 = new int[r15]
            r1 = 0
            r7 = -1
        L_0x0187:
            if (r1 >= r15) goto L_0x0196
            int r4 = r13.i(r5)
            r10[r1] = r4
            if (r4 <= r7) goto L_0x0192
            r7 = r4
        L_0x0192:
            int r1 = r1 + 1
            r4 = 2
            goto L_0x0187
        L_0x0196:
            int r7 = r7 + 1
            int[] r1 = new int[r7]
            r4 = 0
        L_0x019b:
            if (r4 >= r7) goto L_0x01c7
            int r19 = r13.i(r14)
            int r19 = r19 + 1
            r1[r4] = r19
            r14 = 2
            int r20 = r13.i(r14)
            r14 = 8
            if (r20 <= 0) goto L_0x01b1
            r13.t(r14)
        L_0x01b1:
            r21 = r7
            r5 = 0
        L_0x01b4:
            int r7 = r3 << r20
            if (r5 >= r7) goto L_0x01c0
            r13.t(r14)
            int r5 = r5 + 1
            r14 = 8
            goto L_0x01b4
        L_0x01c0:
            int r4 = r4 + 1
            r7 = r21
            r5 = 4
            r14 = 3
            goto L_0x019b
        L_0x01c7:
            r4 = 2
            r13.t(r4)
            r4 = 4
            int r5 = r13.i(r4)
            r4 = 0
            r7 = 0
            r14 = 0
        L_0x01d3:
            if (r4 >= r15) goto L_0x021f
            r19 = r10[r4]
            r19 = r1[r19]
            int r7 = r7 + r19
        L_0x01db:
            if (r14 >= r7) goto L_0x01e3
            r13.t(r5)
            int r14 = r14 + 1
            goto L_0x01db
        L_0x01e3:
            int r4 = r4 + 1
            goto L_0x01d3
        L_0x01e6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "floor type greater than 1 not decodable: "
            r0.<init>(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x01fa:
            r1 = 8
            r13.t(r1)
            r4 = 16
            r13.t(r4)
            r13.t(r4)
            r4 = 6
            r13.t(r4)
            r13.t(r1)
            r4 = 4
            int r5 = r13.i(r4)
            int r5 = r5 + r3
            r4 = 0
        L_0x0215:
            if (r4 >= r5) goto L_0x021f
            r13.t(r1)
            int r4 = r4 + 1
            r1 = 8
            goto L_0x0215
        L_0x021f:
            int r12 = r12 + 1
            r1 = 6
            r4 = 2
            r5 = 4
            r7 = 16
            r10 = 5
            r15 = 24
            goto L_0x0174
        L_0x022b:
            int r4 = r13.i(r1)
            int r4 = r4 + r3
            r5 = 0
        L_0x0231:
            if (r5 >= r4) goto L_0x029d
            r7 = 16
            int r8 = r13.i(r7)
            r7 = 2
            if (r8 > r7) goto L_0x0295
            r7 = 24
            r13.t(r7)
            r13.t(r7)
            r13.t(r7)
            int r8 = r13.i(r1)
            int r8 = r8 + r3
            r1 = 8
            r13.t(r1)
            int[] r10 = new int[r8]
            r12 = 0
        L_0x0254:
            if (r12 >= r8) goto L_0x0274
            r14 = 3
            int r15 = r13.i(r14)
            boolean r17 = r13.h()
            r7 = 5
            if (r17 == 0) goto L_0x0267
            int r18 = r13.i(r7)
            goto L_0x0269
        L_0x0267:
            r18 = 0
        L_0x0269:
            int r18 = r18 * 8
            int r18 = r18 + r15
            r10[r12] = r18
            int r12 = r12 + 1
            r7 = 24
            goto L_0x0254
        L_0x0274:
            r7 = 5
            r14 = 3
            r12 = 0
        L_0x0277:
            if (r12 >= r8) goto L_0x0291
            r15 = 0
        L_0x027a:
            if (r15 >= r1) goto L_0x028c
            r18 = r10[r12]
            int r19 = r3 << r15
            r18 = r18 & r19
            if (r18 == 0) goto L_0x0287
            r13.t(r1)
        L_0x0287:
            int r15 = r15 + 1
            r1 = 8
            goto L_0x027a
        L_0x028c:
            int r12 = r12 + 1
            r1 = 8
            goto L_0x0277
        L_0x0291:
            int r5 = r5 + 1
            r1 = 6
            goto L_0x0231
        L_0x0295:
            java.lang.String r0 = "residueType greater than 2 is not decodable"
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x029d:
            int r4 = r13.i(r1)
            int r4 = r4 + r3
            r1 = 0
        L_0x02a3:
            if (r1 >= r4) goto L_0x0324
            r5 = 16
            int r7 = r13.i(r5)
            if (r7 == 0) goto L_0x02c1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "mapping type other than 0 not supported: "
            r5.<init>(r8)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            defpackage.i8b.o(r5)
            r5 = 2
            r12 = 4
            goto L_0x0319
        L_0x02c1:
            boolean r5 = r13.h()
            if (r5 == 0) goto L_0x02ce
            r5 = 4
            int r7 = r13.i(r5)
            int r7 = r7 + r3
            goto L_0x02cf
        L_0x02ce:
            r7 = r3
        L_0x02cf:
            boolean r5 = r13.h()
            int r8 = r6.a
            if (r5 == 0) goto L_0x02f4
            r5 = 8
            int r10 = r13.i(r5)
            int r10 = r10 + r3
            r5 = 0
        L_0x02df:
            if (r5 >= r10) goto L_0x02f4
            int r12 = r8 + -1
            int r14 = defpackage.o54.v(r12)
            r13.t(r14)
            int r12 = defpackage.o54.v(r12)
            r13.t(r12)
            int r5 = r5 + 1
            goto L_0x02df
        L_0x02f4:
            r5 = 2
            int r10 = r13.i(r5)
            if (r10 != 0) goto L_0x031c
            if (r7 <= r3) goto L_0x0307
            r10 = 0
        L_0x02fe:
            if (r10 >= r8) goto L_0x0307
            r12 = 4
            r13.t(r12)
            int r10 = r10 + 1
            goto L_0x02fe
        L_0x0307:
            r12 = 4
            r8 = 0
        L_0x0309:
            if (r8 >= r7) goto L_0x0319
            r10 = 8
            r13.t(r10)
            r13.t(r10)
            r13.t(r10)
            int r8 = r8 + 1
            goto L_0x0309
        L_0x0319:
            int r1 = r1 + 1
            goto L_0x02a3
        L_0x031c:
            java.lang.String r0 = "to reserved bits must be zero after mapping coupling steps"
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x0324:
            r1 = 6
            int r1 = r13.i(r1)
            int r4 = r1 + 1
            bv1[] r10 = new defpackage.bv1[r4]
            r5 = 0
        L_0x032e:
            if (r5 >= r4) goto L_0x034d
            boolean r7 = r13.h()
            r8 = 16
            r13.i(r8)
            r13.i(r8)
            r12 = 8
            r13.i(r12)
            bv1 r14 = new bv1
            r15 = 11
            r14.<init>((boolean) r7, (int) r15)
            r10[r5] = r14
            int r5 = r5 + 1
            goto L_0x032e
        L_0x034d:
            boolean r4 = r13.h()
            if (r4 == 0) goto L_0x03b8
            int r1 = defpackage.o54.v(r1)
            mqf r4 = new mqf
            r12 = 15
            r5 = r4
            r7 = r9
            r8 = r11
            r9 = r10
            r10 = r1
            r11 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r8 = r4
        L_0x0365:
            r0.o = r8
            if (r8 != 0) goto L_0x036a
            return r3
        L_0x036a:
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
            ykb r4 = (defpackage.ykb) r4
            java.lang.Object r4 = r4.b
            java.lang.String[] r4 = (java.lang.String[]) r4
            k0d r4 = defpackage.tb7.q(r4)
            sp9 r4 = defpackage.o54.G(r4)
            ba6 r5 = new ba6
            r5.<init>()
            java.lang.String r6 = "audio/vorbis"
            java.lang.String r6 = defpackage.vq9.l(r6)
            r5.m = r6
            int r6 = r1.d
            r5.g = r6
            int r6 = r1.c
            r5.h = r6
            int r6 = r1.a
            r5.A = r6
            int r1 = r1.b
            r5.B = r1
            r5.p = r0
            r5.j = r4
            ea6 r0 = new ea6
            r0.<init>(r5)
            r2.c = r0
            return r3
        L_0x03b8:
            java.lang.String r0 = "framing bit after modes not set as expected"
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ieg.d(l8b, long, ox0):boolean");
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
