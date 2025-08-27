package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.uuid.Uuid;

/* renamed from: nlg  reason: default package */
public final class nlg implements Closeable {
    public final boolean X;
    public final long Y;
    public final rt0 a = new Object();
    public final rt0 b;
    public boolean c;
    public ka9 o;
    public final byte[] v;
    public final it0 w;
    public final wu0 x;
    public final Random y;
    public final boolean z;

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, rt0] */
    public nlg(ftc ftc, Random random, boolean z2, boolean z3, long j) {
        this.x = ftc;
        this.y = random;
        this.z = z2;
        this.X = z3;
        this.Y = j;
        this.b = ftc.a;
        this.v = new byte[4];
        this.w = new it0();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, rt0] */
    public final void a(int i, vw0 vw0) {
        vw0 vw02 = vw0.o;
        if (!(i == 0 && vw0 == null)) {
            if (i != 0) {
                String h = (i < 1000 || i >= 5000) ? wj6.h(i, "Code must be in range [1000,5000): ") : ((1004 > i || 1006 < i) && (1015 > i || 2999 < i)) ? null : a81.j(i, "Code ", " is reserved and may not be used.");
                if (h != null) {
                    throw new IllegalArgumentException(h.toString());
                }
            }
            ? obj = new Object();
            obj.y0(i);
            if (vw0 != null) {
                vw0.k(obj, vw0.c());
            }
            vw02 = obj.f(obj.b);
        }
        try {
            b(8, vw02);
        } finally {
            this.c = true;
        }
    }

    public final void b(int i, vw0 vw0) {
        if (!this.c) {
            int c2 = vw0.c();
            if (((long) c2) <= 125) {
                int i2 = i | Uuid.SIZE_BITS;
                rt0 rt0 = this.b;
                rt0.u0(i2);
                rt0.u0(c2 | Uuid.SIZE_BITS);
                Random random = this.y;
                byte[] bArr = this.v;
                random.nextBytes(bArr);
                rt0.write(bArr, 0, bArr.length);
                if (c2 > 0) {
                    long j = rt0.b;
                    vw0.k(rt0, vw0.c());
                    it0 it0 = this.w;
                    rt0.k0(it0);
                    it0.b(j);
                    hi7.e0(it0, bArr);
                    it0.close();
                }
                this.x.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        throw new IOException("closed");
    }

    public final void close() {
        ka9 ka9 = this.o;
        if (ka9 != null) {
            ka9.close();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x015f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(defpackage.vw0 r19) {
        /*
            r18 = this;
            r0 = r18
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0176
            rt0 r1 = r0.a
            r1.getClass()
            r2 = r19
            byte[] r2 = r2.c
            int r3 = r2.length
            r4 = 0
            r1.write(r2, r4, r3)
            boolean r3 = r0.z
            r5 = 0
            if (r3 == 0) goto L_0x00b3
            int r2 = r2.length
            long r2 = (long) r2
            long r7 = r0.Y
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x00b3
            ka9 r2 = r0.o
            if (r2 == 0) goto L_0x0027
            goto L_0x0031
        L_0x0027:
            ka9 r2 = new ka9
            boolean r3 = r0.X
            r7 = 0
            r2.<init>(r3, r7)
            r0.o = r2
        L_0x0031:
            rt0 r3 = r2.b
            long r7 = r3.b
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x00a7
            boolean r7 = r2.c
            if (r7 == 0) goto L_0x0044
            java.lang.Object r7 = r2.o
            java.util.zip.Deflater r7 = (java.util.zip.Deflater) r7
            r7.reset()
        L_0x0044:
            long r7 = r1.b
            java.io.Closeable r2 = r2.v
            uk4 r2 = (defpackage.uk4) r2
            r2.O(r1, r7)
            r2.flush()
            vw0 r2 = defpackage.la9.a
            long r7 = r3.b
            byte[] r9 = r2.c
            int r10 = r9.length
            long r10 = (long) r10
            long r10 = r7 - r10
            int r12 = r9.length
            int r13 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r13 < 0) goto L_0x009c
            if (r12 < 0) goto L_0x009c
            long r7 = r7 - r10
            long r13 = (long) r12
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 < 0) goto L_0x009c
            int r7 = r9.length
            if (r7 >= r12) goto L_0x006b
            goto L_0x009c
        L_0x006b:
            r7 = r4
        L_0x006c:
            if (r7 >= r12) goto L_0x007e
            long r8 = (long) r7
            long r8 = r8 + r10
            byte r8 = r3.U(r8)
            byte[] r9 = r2.c
            byte r9 = r9[r7]
            if (r8 == r9) goto L_0x007b
            goto L_0x009c
        L_0x007b:
            int r7 = r7 + 1
            goto L_0x006c
        L_0x007e:
            long r7 = r3.b
            r2 = 4
            long r9 = (long) r2
            long r7 = r7 - r9
            it0 r2 = new it0
            r2.<init>()
            r3.k0(r2)
            r2.a(r7)     // Catch:{ all -> 0x0093 }
            r7 = 0
            kotlin.io.CloseableKt.closeFinally(r2, r7)
            goto L_0x009f
        L_0x0093:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            r3 = r0
            kotlin.io.CloseableKt.closeFinally(r2, r1)
            throw r3
        L_0x009c:
            r3.u0(r4)
        L_0x009f:
            long r7 = r3.b
            r1.O(r3, r7)
            r2 = 193(0xc1, float:2.7E-43)
            goto L_0x00b5
        L_0x00a7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00b3:
            r2 = 129(0x81, float:1.81E-43)
        L_0x00b5:
            long r7 = r1.b
            rt0 r3 = r0.b
            r3.u0(r2)
            r9 = 125(0x7d, double:6.2E-322)
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x00cc
            int r2 = (int) r7
            r9 = 128(0x80, float:1.794E-43)
            r2 = r2 | r9
            r3.u0(r2)
        L_0x00c9:
            r6 = r3
            goto L_0x014e
        L_0x00cc:
            r9 = 65535(0xffff, double:3.23786E-319)
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x00dd
            r2 = 254(0xfe, float:3.56E-43)
            r3.u0(r2)
            int r2 = (int) r7
            r3.y0(r2)
            goto L_0x00c9
        L_0x00dd:
            r2 = 255(0xff, float:3.57E-43)
            r3.u0(r2)
            r2 = 8
            hod r9 = r3.s0(r2)
            int r10 = r9.c
            int r11 = r10 + 1
            r12 = 56
            long r12 = r7 >>> r12
            r14 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r14
            int r12 = (int) r12
            byte r12 = (byte) r12
            byte[] r13 = r9.a
            r13[r10] = r12
            int r12 = r10 + 2
            r16 = 48
            long r16 = r7 >>> r16
            long r5 = r16 & r14
            int r5 = (int) r5
            byte r5 = (byte) r5
            r13[r11] = r5
            int r5 = r10 + 3
            r6 = 40
            long r16 = r7 >>> r6
            r6 = r3
            long r2 = r16 & r14
            int r2 = (int) r2
            byte r2 = (byte) r2
            r13[r12] = r2
            int r2 = r10 + 4
            r3 = 32
            long r11 = r7 >>> r3
            long r11 = r11 & r14
            int r3 = (int) r11
            byte r3 = (byte) r3
            r13[r5] = r3
            int r3 = r10 + 5
            r5 = 24
            long r11 = r7 >>> r5
            long r11 = r11 & r14
            int r5 = (int) r11
            byte r5 = (byte) r5
            r13[r2] = r5
            int r2 = r10 + 6
            r5 = 16
            long r11 = r7 >>> r5
            long r11 = r11 & r14
            int r5 = (int) r11
            byte r5 = (byte) r5
            r13[r3] = r5
            int r3 = r10 + 7
            r5 = 8
            long r11 = r7 >>> r5
            long r11 = r11 & r14
            int r11 = (int) r11
            byte r11 = (byte) r11
            r13[r2] = r11
            int r10 = r10 + r5
            long r11 = r7 & r14
            int r2 = (int) r11
            byte r2 = (byte) r2
            r13[r3] = r2
            r9.c = r10
            long r2 = r6.b
            r9 = 8
            long r2 = r2 + r9
            r6.b = r2
        L_0x014e:
            java.util.Random r2 = r0.y
            byte[] r3 = r0.v
            r2.nextBytes(r3)
            int r2 = r3.length
            r6.write(r3, r4, r2)
            r4 = 0
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x016d
            it0 r2 = r0.w
            r1.k0(r2)
            r2.b(r4)
            defpackage.hi7.e0(r2, r3)
            r2.close()
        L_0x016d:
            r6.O(r1, r7)
            wu0 r0 = r0.x
            r0.y()
            return
        L_0x0176:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "closed"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nlg.d(vw0):void");
    }
}
