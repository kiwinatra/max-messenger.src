package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte;

/* renamed from: wn8  reason: default package */
public abstract class wn8 extends pk0 {
    public static final byte[] N1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final gn8 A0;
    public boolean A1;
    public final rx0 B0;
    public boolean B1;
    public final boolean C0 = false;
    public long C1;
    public final float D0;
    public long D1;
    public final ba4 E0;
    public boolean E1;
    public final ba4 F0;
    public boolean F1;
    public final ba4 G0;
    public boolean G1;
    public final em0 H0;
    public boolean H1;
    public final MediaCodec.BufferInfo I0;
    public ExoPlaybackException I1;
    public final ArrayDeque J0;
    public z94 J1;
    public final ila K0;
    public un8 K1;
    public ea6 L0;
    public long L1;
    public ea6 M0;
    public boolean M1;
    public aw4 N0;
    public aw4 O0;
    public vc5 P0;
    public MediaCrypto Q0;
    public final long R0;
    public float S0;
    public float T0;
    public in8 U0;
    public ea6 V0;
    public MediaFormat W0;
    public boolean X0;
    public float Y0;
    public ArrayDeque Z0;
    public MediaCodecRenderer$DecoderInitializationException a1;
    public on8 b1;
    public int c1;
    public boolean d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;
    public boolean k1;
    public boolean l1;
    public long m1;
    public int n1;
    public int o1;
    public ByteBuffer p1;
    public boolean q1;
    public boolean r1;
    public boolean s1;
    public boolean t1;
    public boolean u1;
    public boolean v1;
    public int w1;
    public int x1;
    public int y1;
    public boolean z1;

    /* JADX WARNING: type inference failed for: r5v4, types: [ba4, em0] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wn8(int i, gn8 gn8, float f) {
        super(i);
        rx0 rx0 = rx0.x;
        this.A0 = gn8;
        this.B0 = rx0;
        this.D0 = f;
        this.E0 = new ba4(0);
        this.F0 = new ba4(0);
        this.G0 = new ba4(2);
        ? ba4 = new ba4(2);
        ba4.v0 = 32;
        this.H0 = ba4;
        this.I0 = new MediaCodec.BufferInfo();
        this.S0 = 1.0f;
        this.T0 = 1.0f;
        this.R0 = -9223372036854775807L;
        this.J0 = new ArrayDeque();
        this.K1 = un8.e;
        ba4.B(0);
        ba4.v.order(ByteOrder.nativeOrder());
        ila ila = new ila(0);
        ila.o = m60.a;
        ila.c = 0;
        ila.b = 2;
        this.K0 = ila;
        this.Y0 = -1.0f;
        this.c1 = 0;
        this.w1 = 0;
        this.n1 = -1;
        this.o1 = -1;
        this.m1 = -9223372036854775807L;
        this.C1 = -9223372036854775807L;
        this.D1 = -9223372036854775807L;
        this.L1 = -9223372036854775807L;
        this.x1 = 0;
        this.y1 = 0;
        this.J1 = new z94(1);
    }

    public void C(float f, float f2) {
        this.S0 = f;
        this.T0 = f2;
        w0(this.V0);
    }

    public final int D(ea6 ea6) {
        try {
            return v0(this.B0, ea6);
        } catch (MediaCodecUtil$DecoderQueryException e) {
            throw d(e, ea6);
        }
    }

    public final int E() {
        return 8;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x032a, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0330, code lost:
        r15.t1 = true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x032c A[LOOP:0: B:23:0x0096->B:120:0x032c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x032a A[EDGE_INSN: B:137:0x032a->B:119:0x032a ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean F(long r27, long r29) {
        /*
            r26 = this;
            r15 = r26
            boolean r0 = r15.F1
            r14 = 1
            r0 = r0 ^ r14
            defpackage.n79.n(r0)
            em0 r13 = r15.H0
            boolean r0 = r13.E()
            r12 = 0
            if (r0 == 0) goto L_0x0056
            java.nio.ByteBuffer r6 = r13.v
            int r7 = r15.o1
            int r9 = r13.Z
            long r3 = r13.x
            long r0 = r15.Z
            long r10 = r13.Y
            boolean r17 = r15.X(r0, r10)
            r10 = 4
            boolean r16 = r13.h(r10)
            ea6 r11 = r15.M0
            r11.getClass()
            r5 = 0
            r8 = 0
            r0 = r26
            r1 = r27
            r18 = r3
            r3 = r29
            r20 = r11
            r10 = r18
            r12 = r17
            r22 = r13
            r13 = r16
            r14 = r20
            boolean r0 = r0.l0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
            if (r0 == 0) goto L_0x0054
            r0 = r22
            long r1 = r0.Y
            r15.g0(r1)
            r0.z()
            r1 = 0
            goto L_0x0058
        L_0x0054:
            r1 = 0
            return r1
        L_0x0056:
            r1 = r12
            r0 = r13
        L_0x0058:
            boolean r2 = r15.E1
            if (r2 == 0) goto L_0x0060
            r2 = 1
            r15.F1 = r2
            return r1
        L_0x0060:
            r2 = 1
            boolean r3 = r15.t1
            ba4 r4 = r15.G0
            if (r3 == 0) goto L_0x0070
            boolean r3 = r0.D(r4)
            defpackage.n79.n(r3)
            r15.t1 = r1
        L_0x0070:
            boolean r3 = r15.u1
            if (r3 == 0) goto L_0x0088
            boolean r3 = r0.E()
            if (r3 == 0) goto L_0x007b
            return r2
        L_0x007b:
            r26.I()
            r15.u1 = r1
            r26.Y()
            boolean r3 = r15.s1
            if (r3 != 0) goto L_0x0088
            return r1
        L_0x0088:
            boolean r3 = r15.E1
            r3 = r3 ^ r2
            defpackage.n79.n(r3)
            ox0 r3 = r15.c
            r3.u()
            r4.z()
        L_0x0096:
            r4.z()
            int r5 = r15.y(r3, r4, r1)
            r6 = -5
            if (r5 == r6) goto L_0x0333
            r6 = -4
            if (r5 == r6) goto L_0x00ba
            r3 = -3
            if (r5 != r3) goto L_0x00b4
            boolean r3 = r26.m()
            if (r3 == 0) goto L_0x00b0
            long r3 = r15.C1
            r15.D1 = r3
        L_0x00b0:
            r7 = r1
            r1 = r2
            goto L_0x0338
        L_0x00b4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x00ba:
            r5 = 4
            boolean r6 = r4.h(r5)
            if (r6 == 0) goto L_0x00c8
            r15.E1 = r2
            long r3 = r15.C1
            r15.D1 = r3
            goto L_0x00b0
        L_0x00c8:
            long r6 = r15.C1
            long r8 = r4.x
            long r6 = java.lang.Math.max(r6, r8)
            r15.C1 = r6
            boolean r6 = r26.m()
            if (r6 != 0) goto L_0x00e2
            ba4 r6 = r15.F0
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            boolean r6 = r6.h(r7)
            if (r6 == 0) goto L_0x00e6
        L_0x00e2:
            long r6 = r15.C1
            r15.D1 = r6
        L_0x00e6:
            boolean r6 = r15.G1
            r7 = 8
            r8 = 255(0xff, float:3.57E-43)
            r9 = 0
            java.lang.String r10 = "audio/opus"
            if (r6 == 0) goto L_0x0139
            ea6 r6 = r15.L0
            r6.getClass()
            r15.M0 = r6
            java.lang.String r6 = r6.n
            boolean r6 = java.util.Objects.equals(r6, r10)
            if (r6 == 0) goto L_0x0132
            ea6 r6 = r15.M0
            java.util.List r6 = r6.q
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0132
            ea6 r6 = r15.M0
            java.util.List r6 = r6.q
            java.lang.Object r6 = r6.get(r1)
            byte[] r6 = (byte[]) r6
            r11 = 11
            byte r11 = r6[r11]
            r11 = r11 & r8
            int r11 = r11 << r7
            r12 = 10
            byte r6 = r6[r12]
            r6 = r6 & r8
            r6 = r6 | r11
            ea6 r11 = r15.M0
            r11.getClass()
            ba6 r11 = r11.a()
            r11.D = r6
            ea6 r6 = new ea6
            r6.<init>(r11)
            r15.M0 = r6
        L_0x0132:
            ea6 r6 = r15.M0
            r15.e0(r6, r9)
            r15.G1 = r1
        L_0x0139:
            r4.C()
            ea6 r6 = r15.M0
            if (r6 == 0) goto L_0x030c
            java.lang.String r6 = r6.n
            boolean r6 = java.util.Objects.equals(r6, r10)
            if (r6 == 0) goto L_0x030c
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            boolean r6 = r4.h(r6)
            if (r6 == 0) goto L_0x0157
            ea6 r6 = r15.M0
            r4.c = r6
            r15.V(r4)
        L_0x0157:
            long r10 = r15.Z
            long r12 = r4.x
            long r10 = r10 - r12
            r12 = 80000(0x13880, double:3.95253E-319)
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 > 0) goto L_0x030c
            ea6 r6 = r15.M0
            r6.getClass()
            ila r10 = r15.K0
            r10.getClass()
            java.nio.ByteBuffer r11 = r4.v
            r11.getClass()
            java.nio.ByteBuffer r11 = r4.v
            int r11 = r11.limit()
            java.nio.ByteBuffer r12 = r4.v
            int r12 = r12.position()
            int r11 = r11 - r12
            if (r11 != 0) goto L_0x0183
            goto L_0x030c
        L_0x0183:
            int r11 = r10.b
            r12 = 2
            if (r11 != r12) goto L_0x019e
            java.util.List r6 = r6.q
            int r11 = r6.size()
            if (r11 == r2) goto L_0x0197
            int r11 = r6.size()
            r13 = 3
            if (r11 != r13) goto L_0x019e
        L_0x0197:
            java.lang.Object r6 = r6.get(r1)
            r9 = r6
            byte[] r9 = (byte[]) r9
        L_0x019e:
            java.nio.ByteBuffer r6 = r4.v
            int r11 = r6.position()
            int r13 = r6.limit()
            int r14 = r13 - r11
            int r5 = r14 + 255
            int r5 = r5 / r8
            int r16 = r5 + 27
            int r16 = r16 + r14
            int r8 = r10.b
            if (r8 != r12) goto L_0x01c4
            if (r9 == 0) goto L_0x01bb
            int r8 = r9.length
            int r8 = r8 + 28
            goto L_0x01bd
        L_0x01bb:
            r8 = 47
        L_0x01bd:
            int r17 = r8 + 44
            int r16 = r17 + r16
        L_0x01c1:
            r2 = r16
            goto L_0x01c6
        L_0x01c4:
            r8 = r1
            goto L_0x01c1
        L_0x01c6:
            java.lang.Object r1 = r10.o
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r1.capacity()
            if (r1 >= r2) goto L_0x01dd
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r2)
            r10.o = r1
            goto L_0x01e4
        L_0x01dd:
            java.lang.Object r1 = r10.o
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            r1.clear()
        L_0x01e4:
            java.lang.Object r1 = r10.o
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r2 = r10.b
            if (r2 != r12) goto L_0x0243
            if (r9 == 0) goto L_0x0235
            r21 = 0
            r23 = 0
            r24 = 1
            r25 = 1
            r20 = r1
            defpackage.ila.f(r20, r21, r23, r24, r25)
            int r2 = r9.length
            r17 = r13
            long r12 = (long) r2
            r2 = 8
            long r18 = r12 >> r2
            r20 = 0
            int r2 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r2 != 0) goto L_0x020b
            r2 = 1
            goto L_0x020c
        L_0x020b:
            r2 = 0
        L_0x020c:
            java.lang.String r7 = "out of range: %s"
            defpackage.b0h.f(r12, r7, r2)
            int r2 = (int) r12
            byte r2 = (byte) r2
            r1.put(r2)
            r1.put(r9)
            byte[] r2 = r1.array()
            int r7 = r1.arrayOffset()
            int r12 = r9.length
            int r12 = r12 + 28
            r13 = 0
            int r2 = defpackage.v0g.n(r7, r12, r13, r2)
            r7 = 22
            r1.putInt(r7, r2)
            int r2 = r9.length
            int r2 = r2 + 28
            r1.position(r2)
            goto L_0x023c
        L_0x0235:
            r17 = r13
            byte[] r2 = defpackage.ila.v
            r1.put(r2)
        L_0x023c:
            byte[] r2 = defpackage.ila.w
            r1.put(r2)
        L_0x0241:
            r2 = 0
            goto L_0x0246
        L_0x0243:
            r17 = r13
            goto L_0x0241
        L_0x0246:
            byte r7 = r6.get(r2)
            int r2 = r6.limit()
            r9 = 1
            if (r2 <= r9) goto L_0x0256
            byte r12 = r6.get(r9)
            goto L_0x0257
        L_0x0256:
            r12 = 0
        L_0x0257:
            long r12 = defpackage.hi7.u(r7, r12)
            r18 = 48000(0xbb80, double:2.3715E-319)
            long r12 = r12 * r18
            r18 = 1000000(0xf4240, double:4.940656E-318)
            long r12 = r12 / r18
            int r2 = (int) r12
            int r7 = r10.c
            int r7 = r7 + r2
            r10.c = r7
            long r12 = (long) r7
            int r2 = r10.b
            r25 = 0
            r20 = r1
            r21 = r12
            r23 = r2
            r24 = r5
            defpackage.ila.f(r20, r21, r23, r24, r25)
            r12 = 0
        L_0x027c:
            if (r12 >= r5) goto L_0x0292
            r2 = 255(0xff, float:3.57E-43)
            if (r14 < r2) goto L_0x028a
            r7 = -1
            r1.put(r7)
            int r7 = r14 + -255
            r14 = r7
            goto L_0x028f
        L_0x028a:
            byte r7 = (byte) r14
            r1.put(r7)
            r14 = 0
        L_0x028f:
            int r12 = r12 + 1
            goto L_0x027c
        L_0x0292:
            r2 = r17
        L_0x0294:
            if (r11 >= r2) goto L_0x02a0
            byte r5 = r6.get(r11)
            r1.put(r5)
            int r11 = r11 + 1
            goto L_0x0294
        L_0x02a0:
            int r2 = r6.limit()
            r6.position(r2)
            r1.flip()
            int r2 = r10.b
            r5 = 2
            if (r2 != r5) goto L_0x02ce
            byte[] r2 = r1.array()
            int r5 = r1.arrayOffset()
            int r5 = r5 + r8
            int r5 = r5 + 44
            int r6 = r1.limit()
            int r7 = r1.position()
            int r6 = r6 - r7
            r7 = 0
            int r2 = defpackage.v0g.n(r5, r6, r7, r2)
            int r8 = r8 + 66
            r1.putInt(r8, r2)
            goto L_0x02e9
        L_0x02ce:
            r7 = 0
            byte[] r2 = r1.array()
            int r5 = r1.arrayOffset()
            int r6 = r1.limit()
            int r8 = r1.position()
            int r6 = r6 - r8
            int r2 = defpackage.v0g.n(r5, r6, r7, r2)
            r5 = 22
            r1.putInt(r5, r2)
        L_0x02e9:
            int r2 = r10.b
            r5 = 1
            int r2 = r2 + r5
            r10.b = r2
            r10.o = r1
            r4.z()
            java.lang.Object r1 = r10.o
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r1.remaining()
            r4.B(r1)
            java.nio.ByteBuffer r1 = r4.v
            java.lang.Object r2 = r10.o
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            r1.put(r2)
            r4.C()
            goto L_0x030d
        L_0x030c:
            r7 = r1
        L_0x030d:
            boolean r1 = r0.E()
            if (r1 != 0) goto L_0x0314
            goto L_0x0324
        L_0x0314:
            long r1 = r15.Z
            long r5 = r0.Y
            boolean r5 = r15.X(r1, r5)
            long r8 = r4.x
            boolean r1 = r15.X(r1, r8)
            if (r5 != r1) goto L_0x032a
        L_0x0324:
            boolean r1 = r0.D(r4)
            if (r1 != 0) goto L_0x032c
        L_0x032a:
            r1 = 1
            goto L_0x0330
        L_0x032c:
            r1 = r7
            r2 = 1
            goto L_0x0096
        L_0x0330:
            r15.t1 = r1
            goto L_0x0338
        L_0x0333:
            r7 = r1
            r1 = r2
            r15.d0(r3)
        L_0x0338:
            boolean r2 = r0.E()
            if (r2 == 0) goto L_0x0341
            r0.C()
        L_0x0341:
            boolean r0 = r0.E()
            if (r0 != 0) goto L_0x0352
            boolean r0 = r15.E1
            if (r0 != 0) goto L_0x0352
            boolean r0 = r15.u1
            if (r0 == 0) goto L_0x0350
            goto L_0x0352
        L_0x0350:
            r14 = r7
            goto L_0x0353
        L_0x0352:
            r14 = r1
        L_0x0353:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn8.F(long, long):boolean");
    }

    public abstract ea4 G(on8 on8, ea6 ea6, ea6 ea62);

    public MediaCodecDecoderException H(IllegalStateException illegalStateException, on8 on8) {
        return new MediaCodecDecoderException(illegalStateException, on8);
    }

    public final void I() {
        this.u1 = false;
        this.H0.z();
        this.G0.z();
        this.t1 = false;
        this.s1 = false;
        ila ila = this.K0;
        ila.getClass();
        ila.o = m60.a;
        ila.c = 0;
        ila.b = 2;
    }

    public final boolean K() {
        if (this.z1) {
            this.x1 = 1;
            if (this.e1 || this.g1) {
                this.y1 = 3;
                return false;
            }
            this.y1 = 2;
        } else {
            x0();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:86:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean L(long r22, long r24) {
        /*
            r21 = this;
            r15 = r21
            in8 r5 = r15.U0
            r5.getClass()
            int r0 = r15.o1
            r14 = 0
            r13 = 1
            if (r0 < 0) goto L_0x000f
            r0 = r13
            goto L_0x0010
        L_0x000f:
            r0 = r14
        L_0x0010:
            android.media.MediaCodec$BufferInfo r12 = r15.I0
            if (r0 != 0) goto L_0x00e0
            boolean r0 = r15.h1
            if (r0 == 0) goto L_0x002c
            boolean r0 = r15.A1
            if (r0 == 0) goto L_0x002c
            int r0 = r5.g(r12)     // Catch:{ IllegalStateException -> 0x0021 }
            goto L_0x0030
        L_0x0021:
            r21.k0()
            boolean r0 = r15.F1
            if (r0 == 0) goto L_0x002b
            r21.n0()
        L_0x002b:
            return r14
        L_0x002c:
            int r0 = r5.g(r12)
        L_0x0030:
            if (r0 >= 0) goto L_0x006f
            r1 = -2
            if (r0 != r1) goto L_0x005e
            r15.B1 = r13
            in8 r0 = r15.U0
            r0.getClass()
            android.media.MediaFormat r0 = r0.getOutputFormat()
            int r1 = r15.c1
            if (r1 == 0) goto L_0x0059
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)
            r2 = 32
            if (r1 != r2) goto L_0x0059
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)
            if (r1 != r2) goto L_0x0059
            r15.k1 = r13
            goto L_0x005d
        L_0x0059:
            r15.W0 = r0
            r15.X0 = r13
        L_0x005d:
            return r13
        L_0x005e:
            boolean r0 = r15.l1
            if (r0 == 0) goto L_0x006e
            boolean r0 = r15.E1
            if (r0 != 0) goto L_0x006b
            int r0 = r15.x1
            r1 = 2
            if (r0 != r1) goto L_0x006e
        L_0x006b:
            r21.k0()
        L_0x006e:
            return r14
        L_0x006f:
            boolean r1 = r15.k1
            if (r1 == 0) goto L_0x0079
            r15.k1 = r14
            r5.releaseOutputBuffer(r0, r14)
            return r13
        L_0x0079:
            int r1 = r12.size
            if (r1 != 0) goto L_0x0087
            int r1 = r12.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0087
            r21.k0()
            return r14
        L_0x0087:
            r15.o1 = r0
            java.nio.ByteBuffer r0 = r5.getOutputBuffer(r0)
            r15.p1 = r0
            if (r0 == 0) goto L_0x00a0
            int r1 = r12.offset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r15.p1
            int r1 = r12.offset
            int r2 = r12.size
            int r1 = r1 + r2
            r0.limit(r1)
        L_0x00a0:
            boolean r0 = r15.i1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x00c1
            long r3 = r12.presentationTimeUs
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00c1
            int r0 = r12.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x00c1
            long r3 = r15.C1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00c1
            long r3 = r15.D1
            r12.presentationTimeUs = r3
        L_0x00c1:
            long r3 = r12.presentationTimeUs
            long r6 = r15.Z
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x00cb
            r0 = r13
            goto L_0x00cc
        L_0x00cb:
            r0 = r14
        L_0x00cc:
            r15.q1 = r0
            long r6 = r15.D1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00da
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00da
            r0 = r13
            goto L_0x00db
        L_0x00da:
            r0 = r14
        L_0x00db:
            r15.r1 = r0
            r15.y0(r3)
        L_0x00e0:
            boolean r0 = r15.h1
            if (r0 == 0) goto L_0x0129
            boolean r0 = r15.A1
            if (r0 == 0) goto L_0x0129
            java.nio.ByteBuffer r6 = r15.p1     // Catch:{ IllegalStateException -> 0x011c }
            int r7 = r15.o1     // Catch:{ IllegalStateException -> 0x011c }
            int r8 = r12.flags     // Catch:{ IllegalStateException -> 0x011c }
            long r10 = r12.presentationTimeUs     // Catch:{ IllegalStateException -> 0x011c }
            boolean r9 = r15.q1     // Catch:{ IllegalStateException -> 0x011c }
            boolean r3 = r15.r1     // Catch:{ IllegalStateException -> 0x011c }
            ea6 r4 = r15.M0     // Catch:{ IllegalStateException -> 0x011c }
            r4.getClass()     // Catch:{ IllegalStateException -> 0x011c }
            r16 = 1
            r0 = r21
            r1 = r22
            r17 = r3
            r18 = r4
            r3 = r24
            r19 = r9
            r9 = r16
            r20 = r12
            r12 = r19
            r16 = r13
            r13 = r17
            r17 = r14
            r14 = r18
            boolean r0 = r0.l0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)     // Catch:{ IllegalStateException -> 0x011e }
            r15 = r20
            goto L_0x0155
        L_0x011c:
            r17 = r14
        L_0x011e:
            r21.k0()
            boolean r0 = r15.F1
            if (r0 == 0) goto L_0x0128
            r21.n0()
        L_0x0128:
            return r17
        L_0x0129:
            r20 = r12
            r16 = r13
            r17 = r14
            java.nio.ByteBuffer r6 = r15.p1
            int r7 = r15.o1
            r14 = r20
            int r8 = r14.flags
            long r10 = r14.presentationTimeUs
            boolean r12 = r15.q1
            boolean r13 = r15.r1
            ea6 r9 = r15.M0
            r9.getClass()
            r18 = 1
            r0 = r21
            r1 = r22
            r3 = r24
            r19 = r9
            r9 = r18
            r15 = r14
            r14 = r19
            boolean r0 = r0.l0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
        L_0x0155:
            if (r0 == 0) goto L_0x0176
            long r0 = r15.presentationTimeUs
            r2 = r21
            r3 = r15
            r2.g0(r0)
            int r0 = r3.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0168
            r14 = r16
            goto L_0x016a
        L_0x0168:
            r14 = r17
        L_0x016a:
            r0 = -1
            r2.o1 = r0
            r0 = 0
            r2.p1 = r0
            if (r14 != 0) goto L_0x0173
            return r16
        L_0x0173:
            r21.k0()
        L_0x0176:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn8.L(long, long):boolean");
    }

    public final boolean M() {
        in8 in8 = this.U0;
        if (in8 == null || this.x1 == 2 || this.E1) {
            return false;
        }
        int i = this.n1;
        ba4 ba4 = this.F0;
        if (i < 0) {
            int e = in8.e();
            this.n1 = e;
            if (e < 0) {
                return false;
            }
            ba4.v = in8.getInputBuffer(e);
            ba4.z();
        }
        if (this.x1 == 1) {
            if (!this.l1) {
                this.A1 = true;
                in8.a(this.n1, 0, 4, 0);
                this.n1 = -1;
                ba4.v = null;
            }
            this.x1 = 2;
            return false;
        } else if (this.j1) {
            this.j1 = false;
            ByteBuffer byteBuffer = ba4.v;
            byteBuffer.getClass();
            byteBuffer.put(N1);
            in8.a(this.n1, 38, 0, 0);
            this.n1 = -1;
            ba4.v = null;
            this.z1 = true;
            return true;
        } else {
            if (this.w1 == 1) {
                int i2 = 0;
                while (true) {
                    ea6 ea6 = this.V0;
                    ea6.getClass();
                    if (i2 >= ea6.q.size()) {
                        break;
                    }
                    ByteBuffer byteBuffer2 = ba4.v;
                    byteBuffer2.getClass();
                    byteBuffer2.put((byte[]) this.V0.q.get(i2));
                    i2++;
                }
                this.w1 = 2;
            }
            ByteBuffer byteBuffer3 = ba4.v;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            ox0 ox0 = this.c;
            ox0.u();
            try {
                int y = y(ox0, ba4, 0);
                if (y == -3) {
                    if (m()) {
                        this.D1 = this.C1;
                    }
                    return false;
                } else if (y == -5) {
                    if (this.w1 == 2) {
                        ba4.z();
                        this.w1 = 1;
                    }
                    d0(ox0);
                    return true;
                } else if (ba4.h(4)) {
                    this.D1 = this.C1;
                    if (this.w1 == 2) {
                        ba4.z();
                        this.w1 = 1;
                    }
                    this.E1 = true;
                    if (!this.z1) {
                        k0();
                        return false;
                    }
                    try {
                        if (!this.l1) {
                            this.A1 = true;
                            in8.a(this.n1, 0, 4, 0);
                            this.n1 = -1;
                            ba4.v = null;
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e2) {
                        throw g(e2, this.L0, false, v0g.x(e2.getErrorCode()));
                    }
                } else if (this.z1 || ba4.h(1)) {
                    boolean h = ba4.h(1073741824);
                    if (h) {
                        h44 h44 = ba4.o;
                        if (position == 0) {
                            h44.getClass();
                        } else {
                            if (((int[]) h44.d) == null) {
                                int[] iArr = new int[1];
                                h44.d = iArr;
                                ((MediaCodec.CryptoInfo) h44.i).numBytesOfClearData = iArr;
                            }
                            int[] iArr2 = (int[]) h44.d;
                            iArr2[0] = iArr2[0] + position;
                        }
                    }
                    if (this.d1 && !h) {
                        ByteBuffer byteBuffer4 = ba4.v;
                        byteBuffer4.getClass();
                        int position2 = byteBuffer4.position();
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            int i5 = i3 + 1;
                            if (i5 >= position2) {
                                byteBuffer4.clear();
                                break;
                            }
                            byte b = byteBuffer4.get(i3) & UByte.MAX_VALUE;
                            if (i4 == 3) {
                                if (b == 1 && (byteBuffer4.get(i5) & 31) == 7) {
                                    ByteBuffer duplicate = byteBuffer4.duplicate();
                                    duplicate.position(i3 - 3);
                                    duplicate.limit(position2);
                                    byteBuffer4.position(0);
                                    byteBuffer4.put(duplicate);
                                    break;
                                }
                            } else if (b == 0) {
                                i4++;
                            }
                            if (b != 0) {
                                i4 = 0;
                            }
                            i3 = i5;
                        }
                        ByteBuffer byteBuffer5 = ba4.v;
                        byteBuffer5.getClass();
                        if (byteBuffer5.position() == 0) {
                            return true;
                        }
                        this.d1 = false;
                    }
                    long j = ba4.x;
                    if (this.G1) {
                        ArrayDeque arrayDeque = this.J0;
                        if (!arrayDeque.isEmpty()) {
                            akf akf = ((un8) arrayDeque.peekLast()).d;
                            ea6 ea62 = this.L0;
                            ea62.getClass();
                            akf.a(j, ea62);
                        } else {
                            akf akf2 = this.K1.d;
                            ea6 ea63 = this.L0;
                            ea63.getClass();
                            akf2.a(j, ea63);
                        }
                        this.G1 = false;
                    }
                    this.C1 = Math.max(this.C1, j);
                    if (m() || ba4.h(536870912)) {
                        this.D1 = this.C1;
                    }
                    ba4.C();
                    if (ba4.h(268435456)) {
                        V(ba4);
                    }
                    i0(ba4);
                    int Q = Q(ba4);
                    if (h) {
                        try {
                            in8.i(this.n1, ba4.o, j, Q);
                        } catch (MediaCodec.CryptoException e3) {
                            throw g(e3, this.L0, false, v0g.x(e3.getErrorCode()));
                        }
                    } else {
                        int i6 = this.n1;
                        ByteBuffer byteBuffer6 = ba4.v;
                        byteBuffer6.getClass();
                        in8.a(i6, byteBuffer6.limit(), Q, j);
                    }
                    this.n1 = -1;
                    ba4.v = null;
                    this.z1 = true;
                    this.w1 = 0;
                    this.J1.d++;
                    return true;
                } else {
                    ba4.z();
                    if (this.w1 == 2) {
                        this.w1 = 1;
                    }
                    return true;
                }
            } catch (DecoderInputBuffer$InsufficientCapacityException e4) {
                a0(e4);
                m0(0);
                N();
                return true;
            }
        }
    }

    public final void N() {
        try {
            in8 in8 = this.U0;
            n79.o(in8);
            in8.flush();
        } finally {
            p0();
        }
    }

    public final boolean O() {
        if (this.U0 == null) {
            return false;
        }
        int i = this.y1;
        if (i == 3 || this.e1 || ((this.f1 && !this.B1) || (this.g1 && this.A1))) {
            n0();
            return true;
        }
        if (i == 2) {
            int i2 = v0g.a;
            n79.n(i2 >= 23);
            if (i2 >= 23) {
                try {
                    x0();
                } catch (ExoPlaybackException e) {
                    i8b.W("Failed to update the DRM session, releasing the codec instead.", e);
                    n0();
                    return true;
                }
            }
        }
        N();
        return false;
    }

    public final List P(boolean z) {
        ea6 ea6 = this.L0;
        ea6.getClass();
        rx0 rx0 = this.B0;
        ArrayList T = T(rx0, ea6, z);
        if (T.isEmpty() && z) {
            T = T(rx0, ea6, false);
            if (!T.isEmpty()) {
                i8b.V("Drm session requires secure decoder for " + ea6.n + ", but no secure decoder available. Trying to proceed with " + T + ".");
            }
        }
        return T;
    }

    public int Q(ba4 ba4) {
        return 0;
    }

    public boolean R() {
        return false;
    }

    public abstract float S(float f, ea6[] ea6Arr);

    public abstract ArrayList T(rx0 rx0, ea6 ea6, boolean z);

    public abstract en8 U(on8 on8, ea6 ea6, MediaCrypto mediaCrypto, float f);

    public abstract void V(ba4 ba4);

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0182, code lost:
        if ("stvm8".equals(r7) == false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0192, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r4) == false) goto L_0x0196;
     */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void W(defpackage.on8 r17, android.media.MediaCrypto r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "createCodec:"
            ea6 r3 = r0.L0
            r3.getClass()
            java.lang.String r4 = r1.a
            int r5 = defpackage.v0g.a
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7 = 23
            if (r5 >= r7) goto L_0x0017
            r8 = r6
            goto L_0x0022
        L_0x0017:
            float r8 = r0.T0
            ea6[] r9 = r0.X
            r9.getClass()
            float r8 = r0.S(r8, r9)
        L_0x0022:
            float r9 = r0.D0
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 > 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r6 = r8
        L_0x002a:
            r0.j0(r3)
            c7f r8 = r0.x
            r8.getClass()
            long r8 = android.os.SystemClock.elapsedRealtime()
            r10 = r18
            en8 r10 = r0.U(r1, r3, r10, r6)
            r11 = 31
            if (r5 < r11) goto L_0x0048
            mpb r11 = r0.w
            r11.getClass()
            defpackage.sn8.a(r10, r11)
        L_0x0048:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r11.<init>(r2)     // Catch:{ all -> 0x006d }
            r11.append(r4)     // Catch:{ all -> 0x006d }
            java.lang.String r2 = r11.toString()     // Catch:{ all -> 0x006d }
            android.os.Trace.beginSection(r2)     // Catch:{ all -> 0x006d }
            gn8 r2 = r0.A0     // Catch:{ all -> 0x006d }
            in8 r2 = r2.h(r10)     // Catch:{ all -> 0x006d }
            r0.U0 = r2     // Catch:{ all -> 0x006d }
            r10 = 21
            if (r5 < r10) goto L_0x0070
            tn8 r13 = new tn8     // Catch:{ all -> 0x006d }
            r13.<init>(r0)     // Catch:{ all -> 0x006d }
            boolean r2 = defpackage.qn8.a(r2, r13)     // Catch:{ all -> 0x006d }
            goto L_0x0070
        L_0x006d:
            r0 = move-exception
            goto L_0x027d
        L_0x0070:
            android.os.Trace.endSection()
            c7f r2 = r0.x
            r2.getClass()
            long r13 = android.os.SystemClock.elapsedRealtime()
            boolean r2 = r1.d(r3)
            if (r2 != 0) goto L_0x00a6
            java.lang.String r2 = defpackage.ea6.e(r3)
            java.util.Locale r15 = java.util.Locale.US
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r11 = "Format exceeds selected codec's capabilities ["
            r15.<init>(r11)
            r15.append(r2)
            java.lang.String r2 = ", "
            r15.append(r2)
            r15.append(r4)
            java.lang.String r2 = "]"
            r15.append(r2)
            java.lang.String r2 = r15.toString()
            defpackage.i8b.V(r2)
        L_0x00a6:
            r0.b1 = r1
            r0.Y0 = r6
            r0.V0 = r3
            r2 = 2
            java.lang.String r3 = "OMX.Exynos.avc.dec.secure"
            r6 = 25
            if (r5 > r6) goto L_0x00dd
            boolean r11 = r3.equals(r4)
            if (r11 == 0) goto L_0x00dd
            java.lang.String r11 = defpackage.v0g.d
            java.lang.String r15 = "SM-T585"
            boolean r15 = r11.startsWith(r15)
            if (r15 != 0) goto L_0x00db
            java.lang.String r15 = "SM-A510"
            boolean r15 = r11.startsWith(r15)
            if (r15 != 0) goto L_0x00db
            java.lang.String r15 = "SM-A520"
            boolean r15 = r11.startsWith(r15)
            if (r15 != 0) goto L_0x00db
            java.lang.String r15 = "SM-J700"
            boolean r11 = r11.startsWith(r15)
            if (r11 == 0) goto L_0x00dd
        L_0x00db:
            r11 = r2
            goto L_0x0116
        L_0x00dd:
            r11 = 24
            if (r5 >= r11) goto L_0x0115
            java.lang.String r11 = "OMX.Nvidia.h264.decode"
            boolean r11 = r11.equals(r4)
            if (r11 != 0) goto L_0x00f1
            java.lang.String r11 = "OMX.Nvidia.h264.decode.secure"
            boolean r11 = r11.equals(r4)
            if (r11 == 0) goto L_0x0115
        L_0x00f1:
            java.lang.String r11 = defpackage.v0g.b
            java.lang.String r15 = "flounder"
            boolean r15 = r15.equals(r11)
            if (r15 != 0) goto L_0x0113
            java.lang.String r15 = "flounder_lte"
            boolean r15 = r15.equals(r11)
            if (r15 != 0) goto L_0x0113
            java.lang.String r15 = "grouper"
            boolean r15 = r15.equals(r11)
            if (r15 != 0) goto L_0x0113
            java.lang.String r15 = "tilapia"
            boolean r11 = r15.equals(r11)
            if (r11 == 0) goto L_0x0115
        L_0x0113:
            r11 = 1
            goto L_0x0116
        L_0x0115:
            r11 = 0
        L_0x0116:
            r0.c1 = r11
            ea6 r11 = r0.V0
            r11.getClass()
            if (r5 >= r10) goto L_0x0131
            java.util.List r11 = r11.q
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0131
            java.lang.String r11 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r11 = r11.equals(r4)
            if (r11 == 0) goto L_0x0131
            r11 = 1
            goto L_0x0132
        L_0x0131:
            r11 = 0
        L_0x0132:
            r0.d1 = r11
            r11 = 19
            if (r5 != r11) goto L_0x0152
            java.lang.String r15 = defpackage.v0g.d
            java.lang.String r12 = "SM-G800"
            boolean r12 = r15.startsWith(r12)
            if (r12 == 0) goto L_0x0152
            java.lang.String r12 = "OMX.Exynos.avc.dec"
            boolean r12 = r12.equals(r4)
            if (r12 != 0) goto L_0x0150
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0152
        L_0x0150:
            r3 = 1
            goto L_0x0153
        L_0x0152:
            r3 = 0
        L_0x0153:
            r0.e1 = r3
            r3 = 29
            if (r5 != r3) goto L_0x0163
            java.lang.String r12 = "c2.android.aac.decoder"
            boolean r12 = r12.equals(r4)
            if (r12 == 0) goto L_0x0163
            r12 = 1
            goto L_0x0164
        L_0x0163:
            r12 = 0
        L_0x0164:
            r0.f1 = r12
            if (r5 > r7) goto L_0x0170
            java.lang.String r7 = "OMX.google.vorbis.decoder"
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L_0x0194
        L_0x0170:
            if (r5 != r11) goto L_0x0196
            java.lang.String r7 = defpackage.v0g.b
            java.lang.String r11 = "hb2000"
            boolean r11 = r11.equals(r7)
            if (r11 != 0) goto L_0x0184
            java.lang.String r11 = "stvm8"
            boolean r7 = r11.equals(r7)
            if (r7 == 0) goto L_0x0196
        L_0x0184:
            java.lang.String r7 = "OMX.amlogic.avc.decoder.awesome"
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L_0x0194
            java.lang.String r7 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x0196
        L_0x0194:
            r7 = 1
            goto L_0x0197
        L_0x0196:
            r7 = 0
        L_0x0197:
            r0.g1 = r7
            if (r5 != r10) goto L_0x01a5
            java.lang.String r7 = "OMX.google.aac.decoder"
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x01a5
            r7 = 1
            goto L_0x01a6
        L_0x01a5:
            r7 = 0
        L_0x01a6:
            r0.h1 = r7
            if (r5 >= r10) goto L_0x01f0
            java.lang.String r7 = "OMX.SEC.mp3.dec"
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x01f0
            java.lang.String r7 = "samsung"
            java.lang.String r10 = defpackage.v0g.c
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L_0x01f0
            java.lang.String r7 = defpackage.v0g.b
            java.lang.String r10 = "baffin"
            boolean r10 = r7.startsWith(r10)
            if (r10 != 0) goto L_0x01ee
            java.lang.String r10 = "grand"
            boolean r10 = r7.startsWith(r10)
            if (r10 != 0) goto L_0x01ee
            java.lang.String r10 = "fortuna"
            boolean r10 = r7.startsWith(r10)
            if (r10 != 0) goto L_0x01ee
            java.lang.String r10 = "gprimelte"
            boolean r10 = r7.startsWith(r10)
            if (r10 != 0) goto L_0x01ee
            java.lang.String r10 = "j2y18lte"
            boolean r10 = r7.startsWith(r10)
            if (r10 != 0) goto L_0x01ee
            java.lang.String r10 = "ms01"
            boolean r7 = r7.startsWith(r10)
            if (r7 == 0) goto L_0x01f0
        L_0x01ee:
            r7 = 1
            goto L_0x01f1
        L_0x01f0:
            r7 = 0
        L_0x01f1:
            r0.i1 = r7
            java.lang.String r7 = r1.a
            if (r5 > r6) goto L_0x01ff
            java.lang.String r6 = "OMX.rk.video_decoder.avc"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0250
        L_0x01ff:
            if (r5 > r3) goto L_0x0231
            java.lang.String r3 = "OMX.broadcom.video_decoder.tunnel"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0250
            java.lang.String r3 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0250
            java.lang.String r3 = "OMX.bcm.vdec.avc.tunnel"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0250
            java.lang.String r3 = "OMX.bcm.vdec.avc.tunnel.secure"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0250
            java.lang.String r3 = "OMX.bcm.vdec.hevc.tunnel"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0250
            java.lang.String r3 = "OMX.bcm.vdec.hevc.tunnel.secure"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0250
        L_0x0231:
            java.lang.String r3 = "Amazon"
            java.lang.String r5 = defpackage.v0g.c
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x024a
            java.lang.String r3 = "AFTS"
            java.lang.String r5 = defpackage.v0g.d
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x024a
            boolean r1 = r1.f
            if (r1 == 0) goto L_0x024a
            goto L_0x0250
        L_0x024a:
            boolean r1 = r16.R()
            if (r1 == 0) goto L_0x0252
        L_0x0250:
            r11 = 1
            goto L_0x0253
        L_0x0252:
            r11 = 0
        L_0x0253:
            r0.l1 = r11
            in8 r1 = r0.U0
            r1.getClass()
            int r1 = r0.y
            if (r1 != r2) goto L_0x026c
            c7f r1 = r0.x
            r1.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 + r5
            r0.m1 = r1
        L_0x026c:
            z94 r1 = r0.J1
            int r2 = r1.b
            r3 = 1
            int r2 = r2 + r3
            r1.b = r2
            long r5 = r13 - r8
            r1 = r16
            r2 = r13
            r1.b0(r2, r4, r5)
            return
        L_0x027d:
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn8.W(on8, android.media.MediaCrypto):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.M0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean X(long r2, long r4) {
        /*
            r1 = this;
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x001d
            ea6 r1 = r1.M0
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = r1.n
            java.lang.String r0 = "audio/opus"
            boolean r1 = java.util.Objects.equals(r1, r0)
            if (r1 == 0) goto L_0x001b
            long r2 = r2 - r4
            r4 = 80000(0x13880, double:3.95253E-319)
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r1 = 1
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn8.X(long, long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0076, code lost:
        if (r6 != 4) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008f, code lost:
        if (r1.d() != null) goto L_0x00ae;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Y() {
        /*
            r8 = this;
            in8 r0 = r8.U0
            if (r0 != 0) goto L_0x00da
            boolean r0 = r8.s1
            if (r0 != 0) goto L_0x00da
            ea6 r0 = r8.L0
            if (r0 != 0) goto L_0x000e
            goto L_0x00da
        L_0x000e:
            aw4 r1 = r8.O0
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x001c
            boolean r1 = r8.u0(r0)
            if (r1 == 0) goto L_0x001c
            r1 = r3
            goto L_0x001d
        L_0x001c:
            r1 = r2
        L_0x001d:
            java.lang.String r4 = r0.n
            if (r1 == 0) goto L_0x004e
            r8.I()
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r4)
            em0 r1 = r8.H0
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "audio/opus"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0044
            r1.getClass()
            r1.v0 = r3
            goto L_0x004b
        L_0x0044:
            r1.getClass()
            r0 = 32
            r1.v0 = r0
        L_0x004b:
            r8.s1 = r3
            return
        L_0x004e:
            aw4 r1 = r8.O0
            r8.r0(r1)
            aw4 r1 = r8.N0
            if (r1 == 0) goto L_0x00ae
            android.media.MediaCrypto r1 = r8.Q0
            if (r1 != 0) goto L_0x005d
            r1 = r3
            goto L_0x005e
        L_0x005d:
            r1 = r2
        L_0x005e:
            defpackage.n79.n(r1)
            aw4 r1 = r8.N0
            g44 r5 = r1.e()
            boolean r6 = defpackage.re6.c
            if (r6 == 0) goto L_0x0089
            boolean r6 = r5 instanceof defpackage.re6
            if (r6 == 0) goto L_0x0089
            int r6 = r1.getState()
            if (r6 == r3) goto L_0x0079
            r7 = 4
            if (r6 == r7) goto L_0x0089
            goto L_0x00c4
        L_0x0079:
            androidx.media3.exoplayer.drm.DrmSession$DrmSessionException r0 = r1.d()
            r0.getClass()
            ea6 r1 = r8.L0
            int r3 = r0.a
            androidx.media3.exoplayer.ExoPlaybackException r8 = r8.g(r0, r1, r2, r3)
            throw r8
        L_0x0089:
            if (r5 != 0) goto L_0x0092
            androidx.media3.exoplayer.drm.DrmSession$DrmSessionException r1 = r1.d()
            if (r1 == 0) goto L_0x00c4
            goto L_0x00ae
        L_0x0092:
            boolean r1 = r5 instanceof defpackage.re6
            if (r1 == 0) goto L_0x00ae
            re6 r5 = (defpackage.re6) r5
            android.media.MediaCrypto r1 = new android.media.MediaCrypto     // Catch:{ MediaCryptoException -> 0x00a4 }
            java.util.UUID r6 = r5.a     // Catch:{ MediaCryptoException -> 0x00a4 }
            byte[] r5 = r5.b     // Catch:{ MediaCryptoException -> 0x00a4 }
            r1.<init>(r6, r5)     // Catch:{ MediaCryptoException -> 0x00a4 }
            r8.Q0 = r1     // Catch:{ MediaCryptoException -> 0x00a4 }
            goto L_0x00ae
        L_0x00a4:
            r0 = move-exception
            ea6 r1 = r8.L0
            r3 = 6006(0x1776, float:8.416E-42)
            androidx.media3.exoplayer.ExoPlaybackException r8 = r8.g(r0, r1, r2, r3)
            throw r8
        L_0x00ae:
            aw4 r1 = r8.N0     // Catch:{ MediaCodecRenderer$DecoderInitializationException -> 0x00bc }
            if (r1 == 0) goto L_0x00be
            defpackage.n79.o(r4)     // Catch:{ MediaCodecRenderer$DecoderInitializationException -> 0x00bc }
            boolean r1 = r1.c(r4)     // Catch:{ MediaCodecRenderer$DecoderInitializationException -> 0x00bc }
            if (r1 == 0) goto L_0x00be
            goto L_0x00bf
        L_0x00bc:
            r1 = move-exception
            goto L_0x00d3
        L_0x00be:
            r3 = r2
        L_0x00bf:
            android.media.MediaCrypto r1 = r8.Q0     // Catch:{ MediaCodecRenderer$DecoderInitializationException -> 0x00bc }
            r8.Z(r1, r3)     // Catch:{ MediaCodecRenderer$DecoderInitializationException -> 0x00bc }
        L_0x00c4:
            android.media.MediaCrypto r0 = r8.Q0
            if (r0 == 0) goto L_0x00d2
            in8 r1 = r8.U0
            if (r1 != 0) goto L_0x00d2
            r0.release()
            r0 = 0
            r8.Q0 = r0
        L_0x00d2:
            return
        L_0x00d3:
            r3 = 4001(0xfa1, float:5.607E-42)
            androidx.media3.exoplayer.ExoPlaybackException r8 = r8.g(r1, r0, r2, r3)
            throw r8
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn8.Y():void");
    }

    public final void Z(MediaCrypto mediaCrypto, boolean z) {
        String str;
        ea6 ea6 = this.L0;
        ea6.getClass();
        if (this.Z0 == null) {
            try {
                List P = P(z);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.Z0 = arrayDeque;
                if (this.C0) {
                    arrayDeque.addAll(P);
                } else if (!P.isEmpty()) {
                    this.Z0.add((on8) P.get(0));
                }
                this.a1 = null;
            } catch (MediaCodecUtil$DecoderQueryException e) {
                throw new MediaCodecRenderer$DecoderInitializationException(ea6, e, z, -49998);
            }
        }
        if (!this.Z0.isEmpty()) {
            ArrayDeque arrayDeque2 = this.Z0;
            arrayDeque2.getClass();
            while (this.U0 == null) {
                on8 on8 = (on8) arrayDeque2.peekFirst();
                on8.getClass();
                if (t0(on8)) {
                    try {
                        W(on8, mediaCrypto);
                    } catch (Exception e2) {
                        i8b.W("Failed to initialize decoder: " + on8, e2);
                        arrayDeque2.removeFirst();
                        String str2 = "Decoder init failed: " + on8.a + ", " + ea6;
                        if (v0g.a >= 21) {
                            str = e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null;
                        } else {
                            str = null;
                        }
                        MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException = new MediaCodecRenderer$DecoderInitializationException(str2, e2, ea6.n, z, on8, str);
                        a0(mediaCodecRenderer$DecoderInitializationException);
                        MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException2 = this.a1;
                        if (mediaCodecRenderer$DecoderInitializationException2 == null) {
                            this.a1 = mediaCodecRenderer$DecoderInitializationException;
                        } else {
                            this.a1 = new MediaCodecRenderer$DecoderInitializationException(mediaCodecRenderer$DecoderInitializationException2.getMessage(), mediaCodecRenderer$DecoderInitializationException2.getCause(), mediaCodecRenderer$DecoderInitializationException2.a, mediaCodecRenderer$DecoderInitializationException2.b, mediaCodecRenderer$DecoderInitializationException2.c, mediaCodecRenderer$DecoderInitializationException2.o);
                        }
                        if (arrayDeque2.isEmpty()) {
                            throw this.a1;
                        }
                    }
                } else {
                    return;
                }
            }
            this.Z0 = null;
            return;
        }
        throw new MediaCodecRenderer$DecoderInitializationException(ea6, (MediaCodecUtil$DecoderQueryException) null, z, -49999);
    }

    public abstract void a0(Exception exc);

    public abstract void b0(long j, String str, long j2);

    public abstract void c0(String str);

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cf, code lost:
        if (r4.c(r3) != false) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x010b, code lost:
        if (K() == false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x013e, code lost:
        if (K() == false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0150, code lost:
        if (K() == false) goto L_0x0178;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x018c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.ea4 d0(defpackage.ox0 r13) {
        /*
            r12 = this;
            r0 = 1
            r12.G1 = r0
            java.lang.Object r1 = r13.b
            ea6 r1 = (defpackage.ea6) r1
            r1.getClass()
            r2 = 0
            java.lang.String r3 = r1.n
            if (r3 == 0) goto L_0x01a8
            java.lang.String r4 = "video/av01"
            boolean r3 = r3.equals(r4)
            r4 = 0
            if (r3 == 0) goto L_0x002d
            java.util.List r3 = r1.q
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x002d
            ba6 r1 = r1.a()
            r1.p = r4
            ea6 r3 = new ea6
            r3.<init>(r1)
            r8 = r3
            goto L_0x002e
        L_0x002d:
            r8 = r1
        L_0x002e:
            java.lang.Object r13 = r13.c
            aw4 r13 = (defpackage.aw4) r13
            aw4 r1 = r12.O0
            if (r1 != r13) goto L_0x0037
            goto L_0x0041
        L_0x0037:
            if (r13 == 0) goto L_0x003c
            r13.g(r4)
        L_0x003c:
            if (r1 == 0) goto L_0x0041
            r1.f(r4)
        L_0x0041:
            r12.O0 = r13
            r12.L0 = r8
            boolean r13 = r12.s1
            if (r13 == 0) goto L_0x004c
            r12.u1 = r0
            return r4
        L_0x004c:
            in8 r13 = r12.U0
            if (r13 != 0) goto L_0x0056
            r12.Z0 = r4
            r12.Y()
            return r4
        L_0x0056:
            on8 r1 = r12.b1
            r1.getClass()
            ea6 r7 = r12.V0
            r7.getClass()
            aw4 r3 = r12.N0
            aw4 r4 = r12.O0
            r5 = 3
            r6 = 23
            if (r3 != r4) goto L_0x006b
            goto L_0x00d3
        L_0x006b:
            if (r4 == 0) goto L_0x018d
            if (r3 != 0) goto L_0x0071
            goto L_0x018d
        L_0x0071:
            g44 r9 = r4.e()
            if (r9 != 0) goto L_0x0079
            goto L_0x018d
        L_0x0079:
            g44 r10 = r3.e()
            if (r10 == 0) goto L_0x018d
            java.lang.Class r11 = r9.getClass()
            java.lang.Class r10 = r10.getClass()
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x008f
            goto L_0x018d
        L_0x008f:
            boolean r9 = r9 instanceof defpackage.re6
            if (r9 != 0) goto L_0x0094
            goto L_0x00d3
        L_0x0094:
            java.util.UUID r9 = r4.a()
            java.util.UUID r10 = r3.a()
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00a4
            goto L_0x018d
        L_0x00a4:
            int r9 = defpackage.v0g.a
            if (r9 >= r6) goto L_0x00aa
            goto L_0x018d
        L_0x00aa:
            java.util.UUID r9 = defpackage.zw0.e
            java.util.UUID r3 = r3.a()
            boolean r3 = r9.equals(r3)
            if (r3 != 0) goto L_0x018d
            java.util.UUID r3 = r4.a()
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00c2
            goto L_0x018d
        L_0x00c2:
            boolean r3 = r1.f
            if (r3 != 0) goto L_0x00d3
            java.lang.String r3 = r8.n
            r3.getClass()
            boolean r3 = r4.c(r3)
            if (r3 == 0) goto L_0x00d3
            goto L_0x018d
        L_0x00d3:
            aw4 r3 = r12.O0
            aw4 r4 = r12.N0
            if (r3 == r4) goto L_0x00db
            r3 = r0
            goto L_0x00dc
        L_0x00db:
            r3 = r2
        L_0x00dc:
            if (r3 == 0) goto L_0x00e5
            int r4 = defpackage.v0g.a
            if (r4 < r6) goto L_0x00e3
            goto L_0x00e5
        L_0x00e3:
            r4 = r2
            goto L_0x00e6
        L_0x00e5:
            r4 = r0
        L_0x00e6:
            defpackage.n79.n(r4)
            ea4 r4 = r12.G(r1, r7, r8)
            int r6 = r4.d
            if (r6 == 0) goto L_0x0168
            r9 = 16
            r10 = 2
            if (r6 == r0) goto L_0x0141
            if (r6 == r10) goto L_0x0115
            if (r6 != r5) goto L_0x010f
            boolean r0 = r12.w0(r8)
            if (r0 != 0) goto L_0x0103
        L_0x0100:
            r10 = r9
            goto L_0x0178
        L_0x0103:
            r12.V0 = r8
            if (r3 == 0) goto L_0x0177
            boolean r0 = r12.K()
            if (r0 != 0) goto L_0x0177
            goto L_0x0178
        L_0x010f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x0115:
            boolean r11 = r12.w0(r8)
            if (r11 != 0) goto L_0x011c
            goto L_0x0100
        L_0x011c:
            r12.v1 = r0
            r12.w1 = r0
            int r9 = r12.c1
            if (r9 == r10) goto L_0x0134
            if (r9 != r0) goto L_0x0133
            int r9 = r8.t
            int r11 = r7.t
            if (r9 != r11) goto L_0x0133
            int r9 = r8.u
            int r11 = r7.u
            if (r9 != r11) goto L_0x0133
            goto L_0x0134
        L_0x0133:
            r0 = r2
        L_0x0134:
            r12.j1 = r0
            r12.V0 = r8
            if (r3 == 0) goto L_0x0177
            boolean r0 = r12.K()
            if (r0 != 0) goto L_0x0177
            goto L_0x0178
        L_0x0141:
            boolean r11 = r12.w0(r8)
            if (r11 != 0) goto L_0x0148
            goto L_0x0100
        L_0x0148:
            r12.V0 = r8
            if (r3 == 0) goto L_0x0153
            boolean r0 = r12.K()
            if (r0 != 0) goto L_0x0177
            goto L_0x0178
        L_0x0153:
            boolean r3 = r12.z1
            if (r3 == 0) goto L_0x0177
            r12.x1 = r0
            boolean r3 = r12.e1
            if (r3 != 0) goto L_0x0165
            boolean r3 = r12.g1
            if (r3 == 0) goto L_0x0162
            goto L_0x0165
        L_0x0162:
            r12.y1 = r0
            goto L_0x0177
        L_0x0165:
            r12.y1 = r5
            goto L_0x0178
        L_0x0168:
            boolean r3 = r12.z1
            if (r3 == 0) goto L_0x0171
            r12.x1 = r0
            r12.y1 = r5
            goto L_0x0177
        L_0x0171:
            r12.n0()
            r12.Y()
        L_0x0177:
            r10 = r2
        L_0x0178:
            if (r6 == 0) goto L_0x018c
            in8 r0 = r12.U0
            if (r0 != r13) goto L_0x0182
            int r12 = r12.y1
            if (r12 != r5) goto L_0x018c
        L_0x0182:
            ea4 r12 = new ea4
            java.lang.String r6 = r1.a
            r9 = 0
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            return r12
        L_0x018c:
            return r4
        L_0x018d:
            boolean r13 = r12.z1
            if (r13 == 0) goto L_0x0196
            r12.x1 = r0
            r12.y1 = r5
            goto L_0x019c
        L_0x0196:
            r12.n0()
            r12.Y()
        L_0x019c:
            ea4 r12 = new ea4
            r10 = 128(0x80, float:1.794E-43)
            java.lang.String r6 = r1.a
            r9 = 0
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            return r12
        L_0x01a8:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Sample MIME type is null."
            r13.<init>(r0)
            r0 = 4005(0xfa5, float:5.612E-42)
            androidx.media3.exoplayer.ExoPlaybackException r12 = r12.g(r13, r1, r2, r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn8.d0(ox0):ea4");
    }

    public abstract void e0(ea6 ea6, MediaFormat mediaFormat);

    public void f0() {
    }

    public void g0(long j) {
        this.L1 = j;
        while (true) {
            ArrayDeque arrayDeque = this.J0;
            if (!arrayDeque.isEmpty() && j >= ((un8) arrayDeque.peek()).a) {
                un8 un8 = (un8) arrayDeque.poll();
                un8.getClass();
                s0(un8);
                h0();
            } else {
                return;
            }
        }
    }

    public abstract void h0();

    public void i0(ba4 ba4) {
    }

    public void j0(ea6 ea6) {
    }

    public final void k0() {
        int i = this.y1;
        if (i == 1) {
            N();
        } else if (i == 2) {
            N();
            x0();
        } else if (i != 3) {
            this.F1 = true;
            o0();
        } else {
            n0();
            Y();
        }
    }

    public abstract boolean l0(long j, long j2, in8 in8, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, ea6 ea6);

    public final boolean m0(int i) {
        ox0 ox0 = this.c;
        ox0.u();
        ba4 ba4 = this.E0;
        ba4.z();
        int y = y(ox0, ba4, i | 4);
        if (y == -5) {
            d0(ox0);
            return true;
        } else if (y != -4 || !ba4.h(4)) {
            return false;
        } else {
            this.E1 = true;
            k0();
            return false;
        }
    }

    public final void n0() {
        try {
            in8 in8 = this.U0;
            if (in8 != null) {
                in8.release();
                this.J1.c++;
                on8 on8 = this.b1;
                on8.getClass();
                c0(on8.a);
            }
            this.U0 = null;
            try {
                MediaCrypto mediaCrypto = this.Q0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.Q0 = null;
                r0((aw4) null);
                q0();
            }
        } catch (Throwable th) {
            this.U0 = null;
            MediaCrypto mediaCrypto2 = this.Q0;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        } finally {
            this.Q0 = null;
            r0((aw4) null);
            q0();
        }
    }

    public void o0() {
    }

    public boolean p() {
        boolean z;
        if (this.L0 == null) {
            return false;
        }
        if (m()) {
            z = this.w0;
        } else {
            lcd lcd = this.z;
            lcd.getClass();
            z = lcd.c();
        }
        if (!z) {
            if (!(this.o1 >= 0)) {
                if (this.m1 == -9223372036854775807L) {
                    return false;
                }
                this.x.getClass();
                if (SystemClock.elapsedRealtime() >= this.m1) {
                    return false;
                }
            }
        }
        return true;
    }

    public void p0() {
        this.n1 = -1;
        this.F0.v = null;
        this.o1 = -1;
        this.p1 = null;
        this.m1 = -9223372036854775807L;
        this.A1 = false;
        this.z1 = false;
        this.j1 = false;
        this.k1 = false;
        this.q1 = false;
        this.r1 = false;
        this.C1 = -9223372036854775807L;
        this.D1 = -9223372036854775807L;
        this.L1 = -9223372036854775807L;
        this.x1 = 0;
        this.y1 = 0;
        this.w1 = this.v1 ? 1 : 0;
    }

    public void q() {
        this.L0 = null;
        s0(un8.e);
        this.J0.clear();
        O();
    }

    public final void q0() {
        p0();
        this.I1 = null;
        this.Z0 = null;
        this.b1 = null;
        this.V0 = null;
        this.W0 = null;
        this.X0 = false;
        this.B1 = false;
        this.Y0 = -1.0f;
        this.c1 = 0;
        this.d1 = false;
        this.e1 = false;
        this.f1 = false;
        this.g1 = false;
        this.h1 = false;
        this.i1 = false;
        this.l1 = false;
        this.v1 = false;
        this.w1 = 0;
    }

    public final void r0(aw4 aw4) {
        aw4 aw42 = this.N0;
        if (aw42 != aw4) {
            if (aw4 != null) {
                aw4.g((gw4) null);
            }
            if (aw42 != null) {
                aw42.f((gw4) null);
            }
        }
        this.N0 = aw4;
    }

    public void s(long j, boolean z) {
        this.E1 = false;
        this.F1 = false;
        this.H1 = false;
        if (this.s1) {
            this.H0.z();
            this.G0.z();
            this.t1 = false;
            ila ila = this.K0;
            ila.getClass();
            ila.o = m60.a;
            ila.c = 0;
            ila.b = 2;
        } else if (O()) {
            Y();
        }
        if (this.K1.d.h() > 0) {
            this.G1 = true;
        }
        this.K1.d.b();
        this.J0.clear();
    }

    public final void s0(un8 un8) {
        this.K1 = un8;
        if (un8.c != -9223372036854775807L) {
            this.M1 = true;
            f0();
        }
    }

    public boolean t0(on8 on8) {
        return true;
    }

    public boolean u0(ea6 ea6) {
        return false;
    }

    public abstract int v0(rx0 rx0, ea6 ea6);

    public final boolean w0(ea6 ea6) {
        if (!(v0g.a < 23 || this.U0 == null || this.y1 == 3 || this.y == 0)) {
            float f = this.T0;
            ea6.getClass();
            ea6[] ea6Arr = this.X;
            ea6Arr.getClass();
            float S = S(f, ea6Arr);
            float f2 = this.Y0;
            if (f2 == S) {
                return true;
            }
            if (S == -1.0f) {
                if (this.z1) {
                    this.x1 = 1;
                    this.y1 = 3;
                    return false;
                }
                n0();
                Y();
                return false;
            } else if (f2 == -1.0f && S <= this.D0) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", S);
                in8 in8 = this.U0;
                in8.getClass();
                in8.setParameters(bundle);
                this.Y0 = S;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r7 >= r5) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(defpackage.ea6[] r13, long r14, long r16) {
        /*
            r12 = this;
            r0 = r12
            un8 r1 = r0.K1
            long r1 = r1.c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0020
            un8 r1 = new un8
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.s0(r1)
            goto L_0x0063
        L_0x0020:
            java.util.ArrayDeque r1 = r0.J0
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0055
            long r5 = r0.C1
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0038
            long r7 = r0.L1
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0055
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x0055
        L_0x0038:
            un8 r1 = new un8
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.s0(r1)
            un8 r1 = r0.K1
            long r1 = r1.c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0063
            r12.h0()
            goto L_0x0063
        L_0x0055:
            un8 r9 = new un8
            long r3 = r0.C1
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn8.x(ea6[], long, long):void");
    }

    public final void x0() {
        aw4 aw4 = this.O0;
        aw4.getClass();
        g44 e = aw4.e();
        if (e instanceof re6) {
            try {
                MediaCrypto mediaCrypto = this.Q0;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((re6) e).b);
            } catch (MediaCryptoException e2) {
                throw g(e2, this.L0, false, 6006);
            }
        }
        r0(this.O0);
        this.x1 = 0;
        this.y1 = 0;
    }

    public final void y0(long j) {
        ea6 ea6 = (ea6) this.K1.d.f(j);
        if (ea6 == null && this.M1 && this.W0 != null) {
            ea6 = (ea6) this.K1.d.e();
        }
        if (ea6 != null) {
            this.M0 = ea6;
        } else if (!this.X0 || this.M0 == null) {
            return;
        }
        ea6 ea62 = this.M0;
        ea62.getClass();
        e0(ea62, this.W0);
        this.X0 = false;
        this.M1 = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0075 A[Catch:{ IllegalStateException -> 0x0017 }, LOOP:1: B:28:0x0050->B:38:0x0075, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0096 A[Catch:{ IllegalStateException -> 0x0017 }, LOOP:2: B:39:0x0076->B:49:0x0096, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0076 A[EDGE_INSN: B:84:0x0076->B:88:0x0076 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0097 A[EDGE_INSN: B:86:0x0097->B:50:0x0097 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void z(long r12, long r14) {
        /*
            r11 = this;
            boolean r0 = r11.H1
            r1 = 0
            if (r0 == 0) goto L_0x000a
            r11.H1 = r1
            r11.k0()
        L_0x000a:
            androidx.media3.exoplayer.ExoPlaybackException r0 = r11.I1
            if (r0 != 0) goto L_0x0109
            r0 = 1
            boolean r2 = r11.F1     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 == 0) goto L_0x001a
            r11.o0()     // Catch:{ IllegalStateException -> 0x0017 }
            return
        L_0x0017:
            r12 = move-exception
            goto L_0x00b6
        L_0x001a:
            ea6 r2 = r11.L0     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 != 0) goto L_0x0026
            r2 = 2
            boolean r2 = r11.m0(r2)     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 != 0) goto L_0x0026
            return
        L_0x0026:
            r11.Y()     // Catch:{ IllegalStateException -> 0x0017 }
            boolean r2 = r11.s1     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 == 0) goto L_0x003e
            java.lang.String r2 = "bypassRender"
            android.os.Trace.beginSection(r2)     // Catch:{ IllegalStateException -> 0x0017 }
        L_0x0032:
            boolean r2 = r11.F(r12, r14)     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 == 0) goto L_0x0039
            goto L_0x0032
        L_0x0039:
            android.os.Trace.endSection()     // Catch:{ IllegalStateException -> 0x0017 }
            goto L_0x00b1
        L_0x003e:
            in8 r2 = r11.U0     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 == 0) goto L_0x009b
            c7f r2 = r11.x     // Catch:{ IllegalStateException -> 0x0017 }
            r2.getClass()     // Catch:{ IllegalStateException -> 0x0017 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0017 }
            java.lang.String r4 = "drainAndFeed"
            android.os.Trace.beginSection(r4)     // Catch:{ IllegalStateException -> 0x0017 }
        L_0x0050:
            boolean r4 = r11.L(r12, r14)     // Catch:{ IllegalStateException -> 0x0017 }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x0076
            long r7 = r11.R0     // Catch:{ IllegalStateException -> 0x0017 }
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0072
            c7f r4 = r11.x     // Catch:{ IllegalStateException -> 0x0017 }
            r4.getClass()     // Catch:{ IllegalStateException -> 0x0017 }
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0017 }
            long r9 = r9 - r2
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r4 = r1
            goto L_0x0073
        L_0x0072:
            r4 = r0
        L_0x0073:
            if (r4 == 0) goto L_0x0076
            goto L_0x0050
        L_0x0076:
            boolean r12 = r11.M()     // Catch:{ IllegalStateException -> 0x0017 }
            if (r12 == 0) goto L_0x0097
            long r12 = r11.R0     // Catch:{ IllegalStateException -> 0x0017 }
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 == 0) goto L_0x0093
            c7f r14 = r11.x     // Catch:{ IllegalStateException -> 0x0017 }
            r14.getClass()     // Catch:{ IllegalStateException -> 0x0017 }
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0017 }
            long r14 = r14 - r2
            int r12 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r12 >= 0) goto L_0x0091
            goto L_0x0093
        L_0x0091:
            r12 = r1
            goto L_0x0094
        L_0x0093:
            r12 = r0
        L_0x0094:
            if (r12 == 0) goto L_0x0097
            goto L_0x0076
        L_0x0097:
            android.os.Trace.endSection()     // Catch:{ IllegalStateException -> 0x0017 }
            goto L_0x00b1
        L_0x009b:
            z94 r14 = r11.J1     // Catch:{ IllegalStateException -> 0x0017 }
            int r15 = r14.e     // Catch:{ IllegalStateException -> 0x0017 }
            lcd r2 = r11.z     // Catch:{ IllegalStateException -> 0x0017 }
            r2.getClass()     // Catch:{ IllegalStateException -> 0x0017 }
            long r3 = r11.Y     // Catch:{ IllegalStateException -> 0x0017 }
            long r12 = r12 - r3
            int r12 = r2.e(r12)     // Catch:{ IllegalStateException -> 0x0017 }
            int r15 = r15 + r12
            r14.e = r15     // Catch:{ IllegalStateException -> 0x0017 }
            r11.m0(r0)     // Catch:{ IllegalStateException -> 0x0017 }
        L_0x00b1:
            z94 r12 = r11.J1     // Catch:{ IllegalStateException -> 0x0017 }
            monitor-enter(r12)     // Catch:{ IllegalStateException -> 0x0017 }
            monitor-exit(r12)     // Catch:{ IllegalStateException -> 0x0017 }
            return
        L_0x00b6:
            int r13 = defpackage.v0g.a
            r14 = 21
            if (r13 < r14) goto L_0x00c1
            boolean r15 = r12 instanceof android.media.MediaCodec.CodecException
            if (r15 == 0) goto L_0x00c1
            goto L_0x00d6
        L_0x00c1:
            java.lang.StackTraceElement[] r15 = r12.getStackTrace()
            int r2 = r15.length
            if (r2 <= 0) goto L_0x0108
            r15 = r15[r1]
            java.lang.String r15 = r15.getClassName()
            java.lang.String r2 = "android.media.MediaCodec"
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto L_0x0108
        L_0x00d6:
            r11.a0(r12)
            if (r13 < r14) goto L_0x00eb
            boolean r13 = r12 instanceof android.media.MediaCodec.CodecException
            if (r13 == 0) goto L_0x00e7
            r13 = r12
            android.media.MediaCodec$CodecException r13 = (android.media.MediaCodec.CodecException) r13
            boolean r13 = r13.isRecoverable()
            goto L_0x00e8
        L_0x00e7:
            r13 = r1
        L_0x00e8:
            if (r13 == 0) goto L_0x00eb
            r1 = r0
        L_0x00eb:
            if (r1 == 0) goto L_0x00f0
            r11.n0()
        L_0x00f0:
            on8 r13 = r11.b1
            androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException r12 = r11.H(r12, r13)
            int r13 = r12.a
            r14 = 1101(0x44d, float:1.543E-42)
            if (r13 != r14) goto L_0x00ff
            r13 = 4006(0xfa6, float:5.614E-42)
            goto L_0x0101
        L_0x00ff:
            r13 = 4003(0xfa3, float:5.61E-42)
        L_0x0101:
            ea6 r14 = r11.L0
            androidx.media3.exoplayer.ExoPlaybackException r11 = r11.g(r12, r14, r1, r13)
            throw r11
        L_0x0108:
            throw r12
        L_0x0109:
            r12 = 0
            r11.I1 = r12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn8.z(long, long):void");
    }
}
