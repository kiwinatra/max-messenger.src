package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer$InsufficientCapacityException;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: vn8  reason: default package */
public abstract class vn8 extends ok0 {
    public static final byte[] N1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final aa4 A0;
    public boolean A1;
    public final aa4 B0;
    public boolean B1;
    public final dm0 C0;
    public long C1;
    public final akf D0;
    public long D1;
    public final ArrayList E0;
    public boolean E1;
    public final MediaCodec.BufferInfo F0;
    public boolean F1;
    public final long[] G0;
    public boolean G1;
    public final long[] H0;
    public boolean H1;
    public final long[] I0;
    public ExoPlaybackException I1;
    public ca6 J0;
    public z94 J1;
    public ca6 K0;
    public long K1;
    public zv4 L0;
    public long L1;
    public zv4 M0;
    public int M1;
    public MediaCrypto N0;
    public boolean O0;
    public final long P0;
    public float Q0;
    public float R0;
    public hn8 S0;
    public ca6 T0;
    public MediaFormat U0;
    public boolean V0;
    public float W0;
    public ArrayDeque X0;
    public MediaCodecRenderer$DecoderInitializationException Y0;
    public nn8 Z0;
    public int a1;
    public boolean b1;
    public boolean c1;
    public boolean d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;
    public boolean k1;
    public yw0 l1;
    public long m1;
    public int n1;
    public int o1;
    public ByteBuffer p1;
    public boolean q1;
    public boolean r1;
    public boolean s1;
    public boolean t1;
    public boolean u1;
    public final fn8 v0;
    public boolean v1;
    public final rx0 w0;
    public int w1;
    public final boolean x0 = false;
    public int x1;
    public final float y0;
    public int y1;
    public final aa4 z0;
    public boolean z1;

    /* JADX WARNING: type inference failed for: r4v4, types: [aa4, dm0] */
    public vn8(int i, fn8 fn8, rx0 rx0, float f) {
        super(i);
        this.v0 = fn8;
        rx0.getClass();
        this.w0 = rx0;
        this.y0 = f;
        this.z0 = new aa4(0);
        this.A0 = new aa4(0);
        this.B0 = new aa4(2);
        ? aa4 = new aa4(2);
        aa4.Z = 32;
        this.C0 = aa4;
        this.D0 = new akf(0);
        this.E0 = new ArrayList();
        this.F0 = new MediaCodec.BufferInfo();
        this.Q0 = 1.0f;
        this.R0 = 1.0f;
        this.P0 = -9223372036854775807L;
        this.G0 = new long[10];
        this.H0 = new long[10];
        this.I0 = new long[10];
        this.K1 = -9223372036854775807L;
        this.L1 = -9223372036854775807L;
        aa4.B(0);
        aa4.o.order(ByteOrder.nativeOrder());
        this.W0 = -1.0f;
        this.a1 = 0;
        this.w1 = 0;
        this.n1 = -1;
        this.o1 = -1;
        this.m1 = -9223372036854775807L;
        this.C1 = -9223372036854775807L;
        this.D1 = -9223372036854775807L;
        this.x1 = 0;
        this.y1 = 0;
    }

    public final int A(ca6 ca6) {
        try {
            return n0(this.w0, ca6);
        } catch (MediaCodecUtil$DecoderQueryException e) {
            throw d(e, ca6);
        }
    }

    public final int B() {
        return 8;
    }

    public final boolean C(long j, long j2) {
        boolean z;
        dm0 dm0;
        y64.j(!this.F1);
        dm0 dm02 = this.C0;
        int i = dm02.Y;
        if (i > 0) {
            dm0 dm03 = dm02;
            if (!e0(j, j2, (hn8) null, dm02.o, this.o1, 0, i, dm02.w, dm02.h(IntCompanionObject.MIN_VALUE), dm02.h(4), this.K0)) {
                return false;
            }
            dm0 = dm03;
            a0(dm0.X);
            dm0.z();
            z = false;
        } else {
            z = false;
            dm0 = dm02;
        }
        if (this.E1) {
            this.F1 = true;
            return z;
        }
        boolean z2 = this.t1;
        aa4 aa4 = this.B0;
        if (z2) {
            y64.j(dm0.D(aa4));
            this.t1 = z;
        }
        if (this.u1) {
            if (dm0.Y > 0) {
                return true;
            }
            F();
            this.u1 = z;
            T();
            if (!this.s1) {
                return z;
            }
        }
        y64.j(!this.E1);
        xe8 xe8 = this.b;
        xe8.j();
        aa4.z();
        while (true) {
            aa4.z();
            int v = v(xe8, aa4, z ? 1 : 0);
            if (v != -5) {
                if (v == -4) {
                    if (!aa4.h(4)) {
                        if (this.G1) {
                            ca6 ca6 = this.J0;
                            ca6.getClass();
                            this.K0 = ca6;
                            Z(ca6, (MediaFormat) null);
                            this.G1 = z;
                        }
                        aa4.C();
                        if (!dm0.D(aa4)) {
                            this.t1 = true;
                            break;
                        }
                    } else {
                        this.E1 = true;
                        break;
                    }
                } else if (v != -3) {
                    throw new IllegalStateException();
                }
            } else {
                Y(xe8);
                break;
            }
        }
        if (dm0.Y > 0) {
            dm0.C();
        }
        if (dm0.Y <= 0 && !this.E1 && !this.u1) {
            return z;
        }
        return true;
    }

    public abstract da4 D(nn8 nn8, ca6 ca6, ca6 ca62);

    public MediaCodecDecoderException E(IllegalStateException illegalStateException, nn8 nn8) {
        return new MediaCodecDecoderException(illegalStateException, nn8);
    }

    public final void F() {
        this.u1 = false;
        this.C0.z();
        this.B0.z();
        this.t1 = false;
        this.s1 = false;
    }

    public final boolean G() {
        if (this.z1) {
            this.x1 = 1;
            if (this.c1 || this.e1) {
                this.y1 = 3;
                return false;
            }
            this.y1 = 2;
        } else {
            p0();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:90:0x0140  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean H(long r22, long r24) {
        /*
            r21 = this;
            r15 = r21
            int r0 = r15.o1
            r14 = 0
            r13 = 1
            if (r0 < 0) goto L_0x000a
            r0 = r13
            goto L_0x000b
        L_0x000a:
            r0 = r14
        L_0x000b:
            android.media.MediaCodec$BufferInfo r12 = r15.F0
            if (r0 != 0) goto L_0x00fc
            boolean r0 = r15.f1
            if (r0 == 0) goto L_0x0029
            boolean r0 = r15.A1
            if (r0 == 0) goto L_0x0029
            hn8 r0 = r15.S0     // Catch:{ IllegalStateException -> 0x001e }
            int r0 = r0.g(r12)     // Catch:{ IllegalStateException -> 0x001e }
            goto L_0x002f
        L_0x001e:
            r21.d0()
            boolean r0 = r15.F1
            if (r0 == 0) goto L_0x0028
            r21.g0()
        L_0x0028:
            return r14
        L_0x0029:
            hn8 r0 = r15.S0
            int r0 = r0.g(r12)
        L_0x002f:
            if (r0 >= 0) goto L_0x0074
            r1 = -2
            if (r0 != r1) goto L_0x0063
            r15.B1 = r13
            hn8 r0 = r15.S0
            android.media.MediaFormat r0 = r0.getOutputFormat()
            int r1 = r15.a1
            if (r1 == 0) goto L_0x0055
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)
            r2 = 32
            if (r1 != r2) goto L_0x0055
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)
            if (r1 != r2) goto L_0x0055
            r15.j1 = r13
            goto L_0x0062
        L_0x0055:
            boolean r1 = r15.h1
            if (r1 == 0) goto L_0x005e
            java.lang.String r1 = "channel-count"
            r0.setInteger(r1, r13)
        L_0x005e:
            r15.U0 = r0
            r15.V0 = r13
        L_0x0062:
            return r13
        L_0x0063:
            boolean r0 = r15.k1
            if (r0 == 0) goto L_0x0073
            boolean r0 = r15.E1
            if (r0 != 0) goto L_0x0070
            int r0 = r15.x1
            r1 = 2
            if (r0 != r1) goto L_0x0073
        L_0x0070:
            r21.d0()
        L_0x0073:
            return r14
        L_0x0074:
            boolean r1 = r15.j1
            if (r1 == 0) goto L_0x0080
            r15.j1 = r14
            hn8 r1 = r15.S0
            r1.releaseOutputBuffer(r0, r14)
            return r13
        L_0x0080:
            int r1 = r12.size
            if (r1 != 0) goto L_0x008e
            int r1 = r12.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x008e
            r21.d0()
            return r14
        L_0x008e:
            r15.o1 = r0
            hn8 r1 = r15.S0
            java.nio.ByteBuffer r0 = r1.getOutputBuffer(r0)
            r15.p1 = r0
            if (r0 == 0) goto L_0x00a9
            int r1 = r12.offset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r15.p1
            int r1 = r12.offset
            int r2 = r12.size
            int r1 = r1 + r2
            r0.limit(r1)
        L_0x00a9:
            boolean r0 = r15.g1
            if (r0 == 0) goto L_0x00c8
            long r0 = r12.presentationTimeUs
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x00c8
            int r0 = r12.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x00c8
            long r0 = r15.C1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00c8
            r12.presentationTimeUs = r0
        L_0x00c8:
            long r0 = r12.presentationTimeUs
            java.util.ArrayList r2 = r15.E0
            int r3 = r2.size()
            r4 = r14
        L_0x00d1:
            if (r4 >= r3) goto L_0x00e9
            java.lang.Object r5 = r2.get(r4)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x00e6
            r2.remove(r4)
            r0 = r13
            goto L_0x00ea
        L_0x00e6:
            int r4 = r4 + 1
            goto L_0x00d1
        L_0x00e9:
            r0 = r14
        L_0x00ea:
            r15.q1 = r0
            long r0 = r15.D1
            long r2 = r12.presentationTimeUs
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x00f6
            r0 = r13
            goto L_0x00f7
        L_0x00f6:
            r0 = r14
        L_0x00f7:
            r15.r1 = r0
            r15.q0(r2)
        L_0x00fc:
            boolean r0 = r15.f1
            if (r0 == 0) goto L_0x0144
            boolean r0 = r15.A1
            if (r0 == 0) goto L_0x0144
            hn8 r5 = r15.S0     // Catch:{ IllegalStateException -> 0x0137 }
            java.nio.ByteBuffer r6 = r15.p1     // Catch:{ IllegalStateException -> 0x0137 }
            int r7 = r15.o1     // Catch:{ IllegalStateException -> 0x0137 }
            int r8 = r12.flags     // Catch:{ IllegalStateException -> 0x0137 }
            long r10 = r12.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0137 }
            boolean r9 = r15.q1     // Catch:{ IllegalStateException -> 0x0137 }
            boolean r3 = r15.r1     // Catch:{ IllegalStateException -> 0x0137 }
            ca6 r4 = r15.K0     // Catch:{ IllegalStateException -> 0x0137 }
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
            boolean r0 = r0.e0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)     // Catch:{ IllegalStateException -> 0x0139 }
            r15 = r20
            goto L_0x016f
        L_0x0137:
            r17 = r14
        L_0x0139:
            r21.d0()
            boolean r0 = r15.F1
            if (r0 == 0) goto L_0x0143
            r21.g0()
        L_0x0143:
            return r17
        L_0x0144:
            r20 = r12
            r16 = r13
            r17 = r14
            hn8 r5 = r15.S0
            java.nio.ByteBuffer r6 = r15.p1
            int r7 = r15.o1
            r14 = r20
            int r8 = r14.flags
            long r10 = r14.presentationTimeUs
            boolean r12 = r15.q1
            boolean r13 = r15.r1
            ca6 r9 = r15.K0
            r18 = 1
            r0 = r21
            r1 = r22
            r3 = r24
            r19 = r9
            r9 = r18
            r15 = r14
            r14 = r19
            boolean r0 = r0.e0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
        L_0x016f:
            if (r0 == 0) goto L_0x0190
            long r0 = r15.presentationTimeUs
            r2 = r21
            r3 = r15
            r2.a0(r0)
            int r0 = r3.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0182
            r14 = r16
            goto L_0x0184
        L_0x0182:
            r14 = r17
        L_0x0184:
            r0 = -1
            r2.o1 = r0
            r0 = 0
            r2.p1 = r0
            if (r14 != 0) goto L_0x018d
            return r16
        L_0x018d:
            r21.d0()
        L_0x0190:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vn8.H(long, long):boolean");
    }

    public final boolean I() {
        boolean z;
        h44 h44;
        hn8 hn8 = this.S0;
        if (hn8 == null || this.x1 == 2 || this.E1) {
            return false;
        }
        int i = this.n1;
        aa4 aa4 = this.A0;
        if (i < 0) {
            int e = hn8.e();
            this.n1 = e;
            if (e < 0) {
                return false;
            }
            aa4.o = this.S0.getInputBuffer(e);
            aa4.z();
        }
        if (this.x1 == 1) {
            if (!this.k1) {
                this.A1 = true;
                this.S0.a(this.n1, 0, 4, 0);
                this.n1 = -1;
                aa4.o = null;
            }
            this.x1 = 2;
            return false;
        } else if (this.i1) {
            this.i1 = false;
            aa4.o.put(N1);
            this.S0.a(this.n1, 38, 0, 0);
            this.n1 = -1;
            aa4.o = null;
            this.z1 = true;
            return true;
        } else {
            if (this.w1 == 1) {
                for (int i2 = 0; i2 < this.T0.w0.size(); i2++) {
                    aa4.o.put((byte[]) this.T0.w0.get(i2));
                }
                this.w1 = 2;
            }
            int position = aa4.o.position();
            xe8 xe8 = this.b;
            xe8.j();
            try {
                int v = v(xe8, aa4, 0);
                if (l()) {
                    this.D1 = this.C1;
                }
                if (v == -3) {
                    return false;
                }
                if (v == -5) {
                    if (this.w1 == 2) {
                        aa4.z();
                        this.w1 = 1;
                    }
                    Y(xe8);
                    return true;
                }
                if (aa4.h(4)) {
                    if (this.w1 == 2) {
                        aa4.z();
                        this.w1 = 1;
                    }
                    this.E1 = true;
                    if (!this.z1) {
                        d0();
                        return false;
                    }
                    try {
                        if (!this.k1) {
                            this.A1 = true;
                            this.S0.a(this.n1, 0, 4, 0);
                            this.n1 = -1;
                            aa4.o = null;
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e2) {
                        throw f(e2, this.J0, false, t0g.r(e2.getErrorCode()));
                    }
                } else if (this.z1 || aa4.h(1)) {
                    boolean h = aa4.h(1073741824);
                    h44 h442 = aa4.c;
                    if (h) {
                        if (position == 0) {
                            h442.getClass();
                        } else {
                            if (((int[]) h442.d) == null) {
                                int[] iArr = new int[1];
                                h442.d = iArr;
                                ((MediaCodec.CryptoInfo) h442.i).numBytesOfClearData = iArr;
                            }
                            int[] iArr2 = (int[]) h442.d;
                            iArr2[0] = iArr2[0] + position;
                        }
                    }
                    if (this.b1 && !h) {
                        ByteBuffer byteBuffer = aa4.o;
                        int position2 = byteBuffer.position();
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            int i5 = i3 + 1;
                            if (i5 >= position2) {
                                byteBuffer.clear();
                                break;
                            }
                            byte b = byteBuffer.get(i3) & UByte.MAX_VALUE;
                            if (i4 == 3) {
                                if (b == 1 && (byteBuffer.get(i5) & 31) == 7) {
                                    ByteBuffer duplicate = byteBuffer.duplicate();
                                    duplicate.position(i3 - 3);
                                    duplicate.limit(position2);
                                    byteBuffer.position(0);
                                    byteBuffer.put(duplicate);
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
                        if (aa4.o.position() == 0) {
                            return true;
                        }
                        this.b1 = false;
                    }
                    long j = aa4.w;
                    yw0 yw0 = this.l1;
                    if (yw0 != null) {
                        ca6 ca6 = this.J0;
                        if (yw0.c == 0) {
                            yw0.b = j;
                        }
                        if (!yw0.a) {
                            ByteBuffer byteBuffer2 = aa4.o;
                            byteBuffer2.getClass();
                            int i6 = 0;
                            byte b2 = 0;
                            for (int i7 = 4; i6 < i7; i7 = 4) {
                                b2 = (b2 << 8) | (byteBuffer2.get(i6) & UByte.MAX_VALUE);
                                i6++;
                            }
                            int u = gsg.u(b2);
                            if (u == -1) {
                                yw0.a = true;
                                yw0.c = 0;
                                j = aa4.w;
                                yw0.b = j;
                            } else {
                                z = h;
                                j = Math.max(0, ((yw0.c - 529) * 1000000) / ((long) ca6.I0)) + yw0.b;
                                yw0.c += (long) u;
                                long j2 = this.C1;
                                yw0 yw02 = this.l1;
                                ca6 ca62 = this.J0;
                                yw02.getClass();
                                h44 = h442;
                                this.C1 = Math.max(j2, Math.max(0, ((yw02.c - 529) * 1000000) / ((long) ca62.I0)) + yw02.b);
                            }
                        }
                        z = h;
                        long j22 = this.C1;
                        yw0 yw022 = this.l1;
                        ca6 ca622 = this.J0;
                        yw022.getClass();
                        h44 = h442;
                        this.C1 = Math.max(j22, Math.max(0, ((yw022.c - 529) * 1000000) / ((long) ca622.I0)) + yw022.b);
                    } else {
                        z = h;
                        h44 = h442;
                    }
                    if (aa4.h(IntCompanionObject.MIN_VALUE)) {
                        this.E0.add(Long.valueOf(j));
                    }
                    if (this.G1) {
                        this.D0.a(j, this.J0);
                        this.G1 = false;
                    }
                    this.C1 = Math.max(this.C1, j);
                    aa4.C();
                    if (aa4.h(268435456)) {
                        R(aa4);
                    }
                    c0(aa4);
                    if (z) {
                        try {
                            this.S0.n(this.n1, h44, j);
                        } catch (MediaCodec.CryptoException e3) {
                            throw f(e3, this.J0, false, t0g.r(e3.getErrorCode()));
                        }
                    } else {
                        this.S0.a(this.n1, aa4.o.limit(), 0, j);
                    }
                    this.n1 = -1;
                    aa4.o = null;
                    this.z1 = true;
                    this.w1 = 0;
                    this.J1.d++;
                    return true;
                } else {
                    aa4.z();
                    if (this.w1 == 2) {
                        this.w1 = 1;
                    }
                    return true;
                }
            } catch (DecoderInputBuffer$InsufficientCapacityException e4) {
                V(e4);
                f0(0);
                J();
                return true;
            }
        }
    }

    public final void J() {
        try {
            this.S0.flush();
        } finally {
            i0();
        }
    }

    public final boolean K() {
        if (this.S0 == null) {
            return false;
        }
        if (this.y1 == 3 || this.c1 || ((this.d1 && !this.B1) || (this.e1 && this.A1))) {
            g0();
            return true;
        }
        J();
        return false;
    }

    public final List L(boolean z) {
        ca6 ca6 = this.J0;
        rx0 rx0 = this.w0;
        ArrayList O = O(rx0, ca6, z);
        if (O.isEmpty() && z) {
            O = O(rx0, this.J0, false);
            if (!O.isEmpty()) {
                String str = this.J0.Z;
                String valueOf = String.valueOf(O);
                new StringBuilder(valueOf.length() + g63.f(99, str));
            }
        }
        return O;
    }

    public boolean M() {
        return false;
    }

    public abstract float N(float f, ca6[] ca6Arr);

    public abstract ArrayList O(rx0 rx0, ca6 ca6, boolean z);

    public final qe6 P(zv4 zv4) {
        f44 e = zv4.e();
        if (e == null || (e instanceof qe6)) {
            return (qe6) e;
        }
        String valueOf = String.valueOf(e);
        StringBuilder sb = new StringBuilder(valueOf.length() + 43);
        sb.append("Expecting FrameworkCryptoConfig but found: ");
        sb.append(valueOf);
        throw f(new IllegalArgumentException(sb.toString()), this.J0, false, 6001);
    }

    public abstract dn8 Q(nn8 nn8, ca6 ca6, MediaCrypto mediaCrypto, float f);

    public void R(aa4 aa4) {
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [yw0, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x015b, code lost:
        if ("stvm8".equals(r5) == false) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x016b, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r4) == false) goto L_0x016f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x017e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void S(defpackage.nn8 r17, android.media.MediaCrypto r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r4 = r1.a
            int r2 = defpackage.t0g.a
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 23
            if (r2 >= r5) goto L_0x0010
            r6 = r3
            goto L_0x001b
        L_0x0010:
            float r6 = r0.R0
            ca6[] r7 = r0.y
            r7.getClass()
            float r6 = r0.N(r6, r7)
        L_0x001b:
            float r7 = r0.y0
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r3 = r6
        L_0x0023:
            long r6 = android.os.SystemClock.elapsedRealtime()
            ca6 r8 = r0.J0
            r9 = r18
            dn8 r8 = r0.Q(r1, r8, r9, r3)
            r9 = 31
            if (r2 < r9) goto L_0x003b
            lpb r9 = r0.v
            r9.getClass()
            defpackage.rn8.a(r8, r9)
        L_0x003b:
            java.lang.String r9 = "createCodec:"
            java.lang.String r10 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x004c }
            int r11 = r10.length()     // Catch:{ all -> 0x004c }
            if (r11 == 0) goto L_0x004f
            java.lang.String r9 = r9.concat(r10)     // Catch:{ all -> 0x004c }
            goto L_0x0055
        L_0x004c:
            r0 = move-exception
            goto L_0x0263
        L_0x004f:
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x004c }
            r10.<init>(r9)     // Catch:{ all -> 0x004c }
            r9 = r10
        L_0x0055:
            defpackage.m5a.f(r9)     // Catch:{ all -> 0x004c }
            fn8 r9 = r0.v0     // Catch:{ all -> 0x004c }
            hn8 r8 = r9.f(r8)     // Catch:{ all -> 0x004c }
            r0.S0 = r8     // Catch:{ all -> 0x004c }
            defpackage.m5a.s()
            long r8 = android.os.SystemClock.elapsedRealtime()
            r0.Z0 = r1
            r0.W0 = r3
            ca6 r3 = r0.J0
            r0.T0 = r3
            java.lang.String r10 = "OMX.Exynos.avc.dec.secure"
            r11 = 25
            r13 = 1
            if (r2 > r11) goto L_0x00a0
            boolean r14 = r10.equals(r4)
            if (r14 == 0) goto L_0x00a0
            java.lang.String r14 = defpackage.t0g.d
            java.lang.String r15 = "SM-T585"
            boolean r15 = r14.startsWith(r15)
            if (r15 != 0) goto L_0x009e
            java.lang.String r15 = "SM-A510"
            boolean r15 = r14.startsWith(r15)
            if (r15 != 0) goto L_0x009e
            java.lang.String r15 = "SM-A520"
            boolean r15 = r14.startsWith(r15)
            if (r15 != 0) goto L_0x009e
            java.lang.String r15 = "SM-J700"
            boolean r14 = r14.startsWith(r15)
            if (r14 == 0) goto L_0x00a0
        L_0x009e:
            r14 = 2
            goto L_0x00d9
        L_0x00a0:
            r14 = 24
            if (r2 >= r14) goto L_0x00d8
            java.lang.String r14 = "OMX.Nvidia.h264.decode"
            boolean r14 = r14.equals(r4)
            if (r14 != 0) goto L_0x00b4
            java.lang.String r14 = "OMX.Nvidia.h264.decode.secure"
            boolean r14 = r14.equals(r4)
            if (r14 == 0) goto L_0x00d8
        L_0x00b4:
            java.lang.String r14 = defpackage.t0g.b
            java.lang.String r15 = "flounder"
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto L_0x00d6
            java.lang.String r15 = "flounder_lte"
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto L_0x00d6
            java.lang.String r15 = "grouper"
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto L_0x00d6
            java.lang.String r15 = "tilapia"
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L_0x00d8
        L_0x00d6:
            r14 = r13
            goto L_0x00d9
        L_0x00d8:
            r14 = 0
        L_0x00d9:
            r0.a1 = r14
            ca6 r14 = r0.T0
            r15 = 21
            if (r2 >= r15) goto L_0x00f3
            java.util.List r14 = r14.w0
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L_0x00f3
            java.lang.String r14 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r14 = r14.equals(r4)
            if (r14 == 0) goto L_0x00f3
            r14 = r13
            goto L_0x00f4
        L_0x00f3:
            r14 = 0
        L_0x00f4:
            r0.b1 = r14
            r14 = 19
            r12 = 18
            if (r2 < r12) goto L_0x012b
            if (r2 != r12) goto L_0x010e
            java.lang.String r3 = "OMX.SEC.avc.dec"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x012b
            java.lang.String r3 = "OMX.SEC.avc.dec.secure"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x012b
        L_0x010e:
            if (r2 != r14) goto L_0x0129
            java.lang.String r3 = defpackage.t0g.d
            java.lang.String r11 = "SM-G800"
            boolean r3 = r3.startsWith(r11)
            if (r3 == 0) goto L_0x0129
            java.lang.String r3 = "OMX.Exynos.avc.dec"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x012b
            boolean r3 = r10.equals(r4)
            if (r3 == 0) goto L_0x0129
            goto L_0x012b
        L_0x0129:
            r3 = 0
            goto L_0x012c
        L_0x012b:
            r3 = r13
        L_0x012c:
            r0.c1 = r3
            r3 = 29
            if (r2 != r3) goto L_0x013c
            java.lang.String r10 = "c2.android.aac.decoder"
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L_0x013c
            r10 = r13
            goto L_0x013d
        L_0x013c:
            r10 = 0
        L_0x013d:
            r0.d1 = r10
            if (r2 > r5) goto L_0x0149
            java.lang.String r5 = "OMX.google.vorbis.decoder"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x016d
        L_0x0149:
            if (r2 > r14) goto L_0x016f
            java.lang.String r5 = defpackage.t0g.b
            java.lang.String r10 = "hb2000"
            boolean r10 = r10.equals(r5)
            if (r10 != 0) goto L_0x015d
            java.lang.String r10 = "stvm8"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x016f
        L_0x015d:
            java.lang.String r5 = "OMX.amlogic.avc.decoder.awesome"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x016d
            java.lang.String r5 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x016f
        L_0x016d:
            r5 = r13
            goto L_0x0170
        L_0x016f:
            r5 = 0
        L_0x0170:
            r0.e1 = r5
            if (r2 != r15) goto L_0x017e
            java.lang.String r5 = "OMX.google.aac.decoder"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x017e
            r5 = r13
            goto L_0x017f
        L_0x017e:
            r5 = 0
        L_0x017f:
            r0.f1 = r5
            if (r2 >= r15) goto L_0x01c9
            java.lang.String r5 = "OMX.SEC.mp3.dec"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x01c9
            java.lang.String r5 = "samsung"
            java.lang.String r10 = defpackage.t0g.c
            boolean r5 = r5.equals(r10)
            if (r5 == 0) goto L_0x01c9
            java.lang.String r5 = defpackage.t0g.b
            java.lang.String r10 = "baffin"
            boolean r10 = r5.startsWith(r10)
            if (r10 != 0) goto L_0x01c7
            java.lang.String r10 = "grand"
            boolean r10 = r5.startsWith(r10)
            if (r10 != 0) goto L_0x01c7
            java.lang.String r10 = "fortuna"
            boolean r10 = r5.startsWith(r10)
            if (r10 != 0) goto L_0x01c7
            java.lang.String r10 = "gprimelte"
            boolean r10 = r5.startsWith(r10)
            if (r10 != 0) goto L_0x01c7
            java.lang.String r10 = "j2y18lte"
            boolean r10 = r5.startsWith(r10)
            if (r10 != 0) goto L_0x01c7
            java.lang.String r10 = "ms01"
            boolean r5 = r5.startsWith(r10)
            if (r5 == 0) goto L_0x01c9
        L_0x01c7:
            r5 = r13
            goto L_0x01ca
        L_0x01c9:
            r5 = 0
        L_0x01ca:
            r0.g1 = r5
            ca6 r5 = r0.T0
            if (r2 > r12) goto L_0x01de
            int r5 = r5.H0
            if (r5 != r13) goto L_0x01de
            java.lang.String r5 = "OMX.MTK.AUDIO.DECODER.MP3"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x01de
            r5 = r13
            goto L_0x01df
        L_0x01de:
            r5 = 0
        L_0x01df:
            r0.h1 = r5
            java.lang.String r5 = r1.a
            r10 = 25
            if (r2 > r10) goto L_0x01ef
            java.lang.String r10 = "OMX.rk.video_decoder.avc"
            boolean r10 = r10.equals(r5)
            if (r10 != 0) goto L_0x022c
        L_0x01ef:
            r10 = 17
            if (r2 > r10) goto L_0x01fb
            java.lang.String r10 = "OMX.allwinner.video.decoder.avc"
            boolean r10 = r10.equals(r5)
            if (r10 != 0) goto L_0x022c
        L_0x01fb:
            if (r2 > r3) goto L_0x020d
            java.lang.String r2 = "OMX.broadcom.video_decoder.tunnel"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x022c
            java.lang.String r2 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x022c
        L_0x020d:
            java.lang.String r2 = "Amazon"
            java.lang.String r3 = defpackage.t0g.c
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0226
            java.lang.String r2 = "AFTS"
            java.lang.String r3 = defpackage.t0g.d
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0226
            boolean r1 = r1.f
            if (r1 == 0) goto L_0x0226
            goto L_0x022c
        L_0x0226:
            boolean r1 = r16.M()
            if (r1 == 0) goto L_0x022e
        L_0x022c:
            r12 = r13
            goto L_0x022f
        L_0x022e:
            r12 = 0
        L_0x022f:
            r0.k1 = r12
            hn8 r1 = r0.S0
            r1.getClass()
            java.lang.String r1 = "c2.android.mp3.decoder"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0245
            yw0 r1 = new yw0
            r1.<init>()
            r0.l1 = r1
        L_0x0245:
            int r1 = r0.w
            r2 = 2
            if (r1 != r2) goto L_0x0253
            long r1 = android.os.SystemClock.elapsedRealtime()
            r10 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 + r10
            r0.m1 = r1
        L_0x0253:
            z94 r1 = r0.J1
            int r2 = r1.b
            int r2 = r2 + r13
            r1.b = r2
            long r5 = r8 - r6
            r1 = r16
            r2 = r8
            r1.W(r2, r4, r5)
            return
        L_0x0263:
            defpackage.m5a.s()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vn8.S(nn8, android.media.MediaCrypto):void");
    }

    public final void T() {
        ca6 ca6;
        if (this.S0 == null && !this.s1 && (ca6 = this.J0) != null) {
            if (this.M0 != null || !m0(ca6)) {
                k0(this.M0);
                String str = this.J0.Z;
                zv4 zv4 = this.L0;
                if (zv4 != null) {
                    if (this.N0 == null) {
                        qe6 P = P(zv4);
                        if (P != null) {
                            try {
                                MediaCrypto mediaCrypto = new MediaCrypto(P.a, P.b);
                                this.N0 = mediaCrypto;
                                this.O0 = !P.c && mediaCrypto.requiresSecureDecoderComponent(str);
                            } catch (MediaCryptoException e) {
                                throw f(e, this.J0, false, 6006);
                            }
                        } else if (this.L0.d() == null) {
                            return;
                        }
                    }
                    if (qe6.d) {
                        int state = this.L0.getState();
                        if (state == 1) {
                            DrmSession$DrmSessionException d = this.L0.d();
                            d.getClass();
                            throw f(d, this.J0, false, d.a);
                        } else if (state != 4) {
                            return;
                        }
                    }
                }
                try {
                    U(this.N0, this.O0);
                } catch (MediaCodecRenderer$DecoderInitializationException e2) {
                    throw f(e2, this.J0, false, 4001);
                }
            } else {
                ca6 ca62 = this.J0;
                F();
                String str2 = ca62.Z;
                boolean equals = "audio/mp4a-latm".equals(str2);
                dm0 dm0 = this.C0;
                if (equals || "audio/mpeg".equals(str2) || "audio/opus".equals(str2)) {
                    dm0.getClass();
                    dm0.Z = 32;
                } else {
                    dm0.getClass();
                    dm0.Z = 1;
                }
                this.s1 = true;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: nn8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void U(android.media.MediaCrypto r12, boolean r13) {
        /*
            r11 = this;
            java.util.ArrayDeque r0 = r11.X0
            r1 = 0
            if (r0 != 0) goto L_0x003a
            java.util.List r0 = r11.L(r13)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            java.util.ArrayDeque r2 = new java.util.ArrayDeque     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            r2.<init>()     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            r11.X0 = r2     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            boolean r3 = r11.x0     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            if (r3 == 0) goto L_0x001a
            r2.addAll(r0)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            goto L_0x002c
        L_0x0018:
            r12 = move-exception
            goto L_0x002f
        L_0x001a:
            boolean r2 = r0.isEmpty()     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            if (r2 != 0) goto L_0x002c
            java.util.ArrayDeque r2 = r11.X0     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            r3 = 0
            java.lang.Object r0 = r0.get(r3)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            nn8 r0 = (defpackage.nn8) r0     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            r2.add(r0)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
        L_0x002c:
            r11.Y0 = r1     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            goto L_0x003a
        L_0x002f:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r0 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            ca6 r11 = r11.J0
            r1 = -49998(0xffffffffffff3cb2, float:NaN)
            r0.<init>(r11, r12, r13, r1)
            throw r0
        L_0x003a:
            java.util.ArrayDeque r0 = r11.X0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0112
            java.util.ArrayDeque r0 = r11.X0
            java.lang.Object r0 = r0.peekFirst()
            nn8 r0 = (defpackage.nn8) r0
        L_0x004a:
            hn8 r2 = r11.S0
            if (r2 != 0) goto L_0x010f
            java.util.ArrayDeque r2 = r11.X0
            java.lang.Object r2 = r2.peekFirst()
            r8 = r2
            nn8 r8 = (defpackage.nn8) r8
            boolean r2 = r11.l0(r8)
            if (r2 != 0) goto L_0x005e
            return
        L_0x005e:
            r11.S(r8, r12)     // Catch:{ Exception -> 0x0062 }
            goto L_0x004a
        L_0x0062:
            r2 = move-exception
            if (r8 != r0) goto L_0x0071
            r2 = 50
            java.lang.Thread.sleep(r2)     // Catch:{ Exception -> 0x006e }
            r11.S(r8, r12)     // Catch:{ Exception -> 0x006e }
            goto L_0x004a
        L_0x006e:
            r2 = move-exception
            r5 = r2
            goto L_0x0072
        L_0x0071:
            throw r2     // Catch:{ Exception -> 0x006e }
        L_0x0072:
            java.lang.String r2 = java.lang.String.valueOf(r8)
            int r3 = r2.length()
            int r3 = r3 + 30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Failed to initialize decoder: "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            defpackage.iq.a(r2, r5)
            java.util.ArrayDeque r2 = r11.X0
            r2.removeFirst()
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r2 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            ca6 r3 = r11.J0
            java.lang.String r4 = r8.a
            java.lang.String r6 = java.lang.String.valueOf(r3)
            r7 = 23
            int r7 = defpackage.g63.f(r7, r4)
            int r9 = r6.length()
            int r9 = r9 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r9)
            java.lang.String r9 = "Decoder init failed: "
            r7.append(r9)
            r7.append(r4)
            java.lang.String r4 = ", "
            r7.append(r4)
            r7.append(r6)
            java.lang.String r4 = r7.toString()
            java.lang.String r6 = r3.Z
            int r3 = defpackage.t0g.a
            r7 = 21
            if (r3 < r7) goto L_0x00da
            boolean r3 = r5 instanceof android.media.MediaCodec.CodecException
            if (r3 == 0) goto L_0x00d7
            r3 = r5
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3
            java.lang.String r3 = r3.getDiagnosticInfo()
            goto L_0x00d8
        L_0x00d7:
            r3 = r1
        L_0x00d8:
            r9 = r3
            goto L_0x00db
        L_0x00da:
            r9 = r1
        L_0x00db:
            r3 = r2
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r11.V(r2)
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r3 = r11.Y0
            if (r3 != 0) goto L_0x00ea
            r11.Y0 = r2
            goto L_0x0102
        L_0x00ea:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r2 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            java.lang.String r5 = r3.getMessage()
            java.lang.Throwable r6 = r3.getCause()
            java.lang.String r7 = r3.a
            boolean r8 = r3.b
            nn8 r9 = r3.c
            java.lang.String r10 = r3.o
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11.Y0 = r2
        L_0x0102:
            java.util.ArrayDeque r2 = r11.X0
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x010c
            goto L_0x004a
        L_0x010c:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r11 = r11.Y0
            throw r11
        L_0x010f:
            r11.X0 = r1
            return
        L_0x0112:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r12 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            ca6 r11 = r11.J0
            r0 = -49999(0xffffffffffff3cb1, float:NaN)
            r12.<init>(r11, r1, r13, r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vn8.U(android.media.MediaCrypto, boolean):void");
    }

    public abstract void V(Exception exc);

    public abstract void W(long j, String str, long j2);

    public abstract void X(String str);

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007f, code lost:
        if (r13 != false) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00bb, code lost:
        if (G() == false) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ee, code lost:
        if (G() == false) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0100, code lost:
        if (G() == false) goto L_0x0128;
     */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x013f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.da4 Y(defpackage.xe8 r13) {
        /*
            r12 = this;
            r0 = 1
            r12.G1 = r0
            java.lang.Object r1 = r13.c
            r5 = r1
            ca6 r5 = (defpackage.ca6) r5
            r5.getClass()
            r1 = 0
            java.lang.String r2 = r5.Z
            if (r2 == 0) goto L_0x015d
            java.lang.Object r13 = r13.b
            zv4 r13 = (defpackage.zv4) r13
            zv4 r3 = r12.M0
            r4 = 0
            if (r3 != r13) goto L_0x001a
            goto L_0x0024
        L_0x001a:
            if (r13 == 0) goto L_0x001f
            r13.g(r4)
        L_0x001f:
            if (r3 == 0) goto L_0x0024
            r3.f(r4)
        L_0x0024:
            r12.M0 = r13
            r12.J0 = r5
            boolean r3 = r12.s1
            if (r3 == 0) goto L_0x002f
            r12.u1 = r0
            return r4
        L_0x002f:
            hn8 r3 = r12.S0
            if (r3 != 0) goto L_0x0039
            r12.X0 = r4
            r12.T()
            return r4
        L_0x0039:
            nn8 r4 = r12.Z0
            ca6 r6 = r12.T0
            zv4 r7 = r12.L0
            r8 = 3
            r9 = 23
            if (r7 != r13) goto L_0x0045
            goto L_0x0083
        L_0x0045:
            if (r13 == 0) goto L_0x0140
            if (r7 != 0) goto L_0x004b
            goto L_0x0140
        L_0x004b:
            int r10 = defpackage.t0g.a
            if (r10 >= r9) goto L_0x0051
            goto L_0x0140
        L_0x0051:
            java.util.UUID r10 = defpackage.ww0.e
            java.util.UUID r7 = r7.a()
            boolean r7 = r10.equals(r7)
            if (r7 != 0) goto L_0x0140
            java.util.UUID r7 = r13.a()
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x0069
            goto L_0x0140
        L_0x0069:
            qe6 r7 = r12.P(r13)
            if (r7 != 0) goto L_0x0071
            goto L_0x0140
        L_0x0071:
            boolean r7 = r7.c
            if (r7 == 0) goto L_0x0077
            r13 = r1
            goto L_0x007b
        L_0x0077:
            boolean r13 = r13.c(r2)
        L_0x007b:
            boolean r2 = r4.f
            if (r2 != 0) goto L_0x0083
            if (r13 == 0) goto L_0x0083
            goto L_0x0140
        L_0x0083:
            zv4 r13 = r12.M0
            zv4 r2 = r12.L0
            if (r13 == r2) goto L_0x008b
            r13 = r0
            goto L_0x008c
        L_0x008b:
            r13 = r1
        L_0x008c:
            if (r13 == 0) goto L_0x0095
            int r2 = defpackage.t0g.a
            if (r2 < r9) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            r2 = r1
            goto L_0x0096
        L_0x0095:
            r2 = r0
        L_0x0096:
            defpackage.y64.j(r2)
            da4 r2 = r12.D(r4, r6, r5)
            int r7 = r2.d
            if (r7 == 0) goto L_0x0118
            r9 = 16
            r10 = 2
            if (r7 == r0) goto L_0x00f1
            if (r7 == r10) goto L_0x00c5
            if (r7 != r8) goto L_0x00bf
            boolean r0 = r12.o0(r5)
            if (r0 != 0) goto L_0x00b3
        L_0x00b0:
            r10 = r9
            goto L_0x0128
        L_0x00b3:
            r12.T0 = r5
            if (r13 == 0) goto L_0x0127
            boolean r13 = r12.G()
            if (r13 != 0) goto L_0x0127
            goto L_0x0128
        L_0x00bf:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x00c5:
            boolean r11 = r12.o0(r5)
            if (r11 != 0) goto L_0x00cc
            goto L_0x00b0
        L_0x00cc:
            r12.v1 = r0
            r12.w1 = r0
            int r9 = r12.a1
            if (r9 == r10) goto L_0x00e4
            if (r9 != r0) goto L_0x00e3
            int r9 = r6.z0
            int r11 = r5.z0
            if (r11 != r9) goto L_0x00e3
            int r9 = r5.A0
            int r11 = r6.A0
            if (r9 != r11) goto L_0x00e3
            goto L_0x00e4
        L_0x00e3:
            r0 = r1
        L_0x00e4:
            r12.i1 = r0
            r12.T0 = r5
            if (r13 == 0) goto L_0x0127
            boolean r13 = r12.G()
            if (r13 != 0) goto L_0x0127
            goto L_0x0128
        L_0x00f1:
            boolean r11 = r12.o0(r5)
            if (r11 != 0) goto L_0x00f8
            goto L_0x00b0
        L_0x00f8:
            r12.T0 = r5
            if (r13 == 0) goto L_0x0103
            boolean r13 = r12.G()
            if (r13 != 0) goto L_0x0127
            goto L_0x0128
        L_0x0103:
            boolean r13 = r12.z1
            if (r13 == 0) goto L_0x0127
            r12.x1 = r0
            boolean r13 = r12.c1
            if (r13 != 0) goto L_0x0115
            boolean r13 = r12.e1
            if (r13 == 0) goto L_0x0112
            goto L_0x0115
        L_0x0112:
            r12.y1 = r0
            goto L_0x0127
        L_0x0115:
            r12.y1 = r8
            goto L_0x0128
        L_0x0118:
            boolean r13 = r12.z1
            if (r13 == 0) goto L_0x0121
            r12.x1 = r0
            r12.y1 = r8
            goto L_0x0127
        L_0x0121:
            r12.g0()
            r12.T()
        L_0x0127:
            r10 = r1
        L_0x0128:
            if (r7 == 0) goto L_0x013f
            hn8 r13 = r12.S0
            if (r13 != r3) goto L_0x0132
            int r12 = r12.y1
            if (r12 != r8) goto L_0x013f
        L_0x0132:
            da4 r12 = new da4
            java.lang.String r3 = r4.a
            r13 = 0
            r2 = r12
            r4 = r6
            r6 = r13
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x013f:
            return r2
        L_0x0140:
            boolean r13 = r12.z1
            if (r13 == 0) goto L_0x0149
            r12.x1 = r0
            r12.y1 = r8
            goto L_0x014f
        L_0x0149:
            r12.g0()
            r12.T()
        L_0x014f:
            da4 r12 = new da4
            java.lang.String r3 = r4.a
            r13 = 0
            r7 = 128(0x80, float:1.794E-43)
            r2 = r12
            r4 = r6
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x015d:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            r0 = 4005(0xfa5, float:5.612E-42)
            com.google.android.exoplayer2.ExoPlaybackException r12 = r12.f(r13, r5, r1, r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vn8.Y(xe8):da4");
    }

    public abstract void Z(ca6 ca6, MediaFormat mediaFormat);

    public void a0(long j) {
        while (true) {
            int i = this.M1;
            if (i != 0) {
                long[] jArr = this.I0;
                if (j >= jArr[0]) {
                    long[] jArr2 = this.G0;
                    this.K1 = jArr2[0];
                    long[] jArr3 = this.H0;
                    this.L1 = jArr3[0];
                    int i2 = i - 1;
                    this.M1 = i2;
                    System.arraycopy(jArr2, 1, jArr2, 0, i2);
                    System.arraycopy(jArr3, 1, jArr3, 0, this.M1);
                    System.arraycopy(jArr, 1, jArr, 0, this.M1);
                    b0();
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public abstract void b0();

    public abstract void c0(aa4 aa4);

    public final void d0() {
        int i = this.y1;
        if (i == 1) {
            J();
        } else if (i == 2) {
            J();
            p0();
        } else if (i != 3) {
            this.F1 = true;
            h0();
        } else {
            g0();
            T();
        }
    }

    public abstract boolean e0(long j, long j2, hn8 hn8, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, ca6 ca6);

    public final boolean f0(int i) {
        xe8 xe8 = this.b;
        xe8.j();
        aa4 aa4 = this.z0;
        aa4.z();
        int v = v(xe8, aa4, i | 4);
        if (v == -5) {
            Y(xe8);
            return true;
        } else if (v != -4 || !aa4.h(4)) {
            return false;
        } else {
            this.E1 = true;
            d0();
            return false;
        }
    }

    public final void g0() {
        try {
            hn8 hn8 = this.S0;
            if (hn8 != null) {
                hn8.release();
                this.J1.c++;
                X(this.Z0.a);
            }
            this.S0 = null;
            try {
                MediaCrypto mediaCrypto = this.N0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.N0 = null;
                k0((zv4) null);
                j0();
            }
        } catch (Throwable th) {
            this.S0 = null;
            MediaCrypto mediaCrypto2 = this.N0;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        } finally {
            this.N0 = null;
            k0((zv4) null);
            j0();
        }
    }

    public void h0() {
    }

    public void i0() {
        this.n1 = -1;
        this.A0.o = null;
        this.o1 = -1;
        this.p1 = null;
        this.m1 = -9223372036854775807L;
        this.A1 = false;
        this.z1 = false;
        this.i1 = false;
        this.j1 = false;
        this.q1 = false;
        this.r1 = false;
        this.E0.clear();
        this.C1 = -9223372036854775807L;
        this.D1 = -9223372036854775807L;
        yw0 yw0 = this.l1;
        if (yw0 != null) {
            yw0.b = 0;
            yw0.c = 0;
            yw0.a = false;
        }
        this.x1 = 0;
        this.y1 = 0;
        this.w1 = this.v1 ? 1 : 0;
    }

    public final void j0() {
        i0();
        this.I1 = null;
        this.l1 = null;
        this.X0 = null;
        this.Z0 = null;
        this.T0 = null;
        this.U0 = null;
        this.V0 = false;
        this.B1 = false;
        this.W0 = -1.0f;
        this.a1 = 0;
        this.b1 = false;
        this.c1 = false;
        this.d1 = false;
        this.e1 = false;
        this.f1 = false;
        this.g1 = false;
        this.h1 = false;
        this.k1 = false;
        this.v1 = false;
        this.w1 = 0;
        this.O0 = false;
    }

    public final void k0(zv4 zv4) {
        zv4 zv42 = this.L0;
        if (zv42 != zv4) {
            if (zv4 != null) {
                zv4.g((fw4) null);
            }
            if (zv42 != null) {
                zv42.f((fw4) null);
            }
        }
        this.L0 = zv4;
    }

    public boolean l0(nn8 nn8) {
        return true;
    }

    public boolean m() {
        return this.F1;
    }

    public boolean m0(ca6 ca6) {
        return false;
    }

    public boolean n() {
        boolean z;
        if (this.J0 == null) {
            return false;
        }
        if (l()) {
            z = this.Y;
        } else {
            kcd kcd = this.x;
            kcd.getClass();
            z = kcd.c();
        }
        if (!z) {
            if (!(this.o1 >= 0) && (this.m1 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.m1)) {
                return false;
            }
        }
        return true;
    }

    public abstract int n0(rx0 rx0, ca6 ca6);

    public final boolean o0(ca6 ca6) {
        if (!(t0g.a < 23 || this.S0 == null || this.y1 == 3 || this.w == 0)) {
            float f = this.R0;
            ca6[] ca6Arr = this.y;
            ca6Arr.getClass();
            float N = N(f, ca6Arr);
            float f2 = this.W0;
            if (f2 == N) {
                return true;
            }
            if (N == -1.0f) {
                if (this.z1) {
                    this.x1 = 1;
                    this.y1 = 3;
                    return false;
                }
                g0();
                T();
                return false;
            } else if (f2 == -1.0f && N <= this.y0) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", N);
                this.S0.setParameters(bundle);
                this.W0 = N;
            }
        }
        return true;
    }

    public final void p0() {
        try {
            this.N0.setMediaDrmSession(P(this.M0).b);
            k0(this.M0);
            this.x1 = 0;
            this.y1 = 0;
        } catch (MediaCryptoException e) {
            throw f(e, this.J0, false, 6006);
        }
    }

    public void q(long j, boolean z) {
        int i;
        this.E1 = false;
        this.F1 = false;
        this.H1 = false;
        if (this.s1) {
            this.C0.z();
            this.B0.z();
            this.t1 = false;
        } else if (K()) {
            T();
        }
        akf akf = this.D0;
        synchronized (akf) {
            i = akf.e;
        }
        if (i > 0) {
            this.G1 = true;
        }
        this.D0.b();
        int i2 = this.M1;
        if (i2 != 0) {
            int i3 = i2 - 1;
            this.L1 = this.H0[i3];
            this.K1 = this.G0[i3];
            this.M1 = 0;
        }
    }

    public final void q0(long j) {
        Object d;
        Object g;
        akf akf = this.D0;
        synchronized (akf) {
            d = akf.d(j, true);
        }
        ca6 ca6 = (ca6) d;
        if (ca6 == null && this.V0) {
            akf akf2 = this.D0;
            synchronized (akf2) {
                g = akf2.e == 0 ? null : akf2.g();
            }
            ca6 = (ca6) g;
        }
        if (ca6 != null) {
            this.K0 = ca6;
        } else if (!this.V0 || this.K0 == null) {
            return;
        }
        Z(this.K0, this.U0);
        this.V0 = false;
    }

    public final void u(ca6[] ca6Arr, long j, long j2) {
        boolean z = true;
        if (this.L1 == -9223372036854775807L) {
            if (this.K1 != -9223372036854775807L) {
                z = false;
            }
            y64.j(z);
            this.K1 = j;
            this.L1 = j2;
            return;
        }
        int i = this.M1;
        long[] jArr = this.H0;
        if (i == jArr.length) {
            long j3 = jArr[i - 1];
        } else {
            this.M1 = i + 1;
        }
        int i2 = this.M1 - 1;
        this.G0[i2] = j;
        jArr[i2] = j2;
        this.I0[i2] = this.C1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x006b A[Catch:{ IllegalStateException -> 0x0017 }, LOOP:1: B:28:0x004b->B:38:0x006b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0087 A[Catch:{ IllegalStateException -> 0x0017 }, LOOP:2: B:39:0x006c->B:49:0x0087, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x006c A[EDGE_INSN: B:81:0x006c->B:84:0x006c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0088 A[EDGE_INSN: B:83:0x0088->B:50:0x0088 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w(long r12, long r14) {
        /*
            r11 = this;
            boolean r0 = r11.H1
            r1 = 0
            if (r0 == 0) goto L_0x000a
            r11.H1 = r1
            r11.d0()
        L_0x000a:
            com.google.android.exoplayer2.ExoPlaybackException r0 = r11.I1
            if (r0 != 0) goto L_0x00f1
            r0 = 1
            boolean r2 = r11.F1     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 == 0) goto L_0x001a
            r11.h0()     // Catch:{ IllegalStateException -> 0x0017 }
            return
        L_0x0017:
            r12 = move-exception
            goto L_0x00a7
        L_0x001a:
            ca6 r2 = r11.J0     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 != 0) goto L_0x0026
            r2 = 2
            boolean r2 = r11.f0(r2)     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 != 0) goto L_0x0026
            return
        L_0x0026:
            r11.T()     // Catch:{ IllegalStateException -> 0x0017 }
            boolean r2 = r11.s1     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 == 0) goto L_0x003e
            java.lang.String r2 = "bypassRender"
            defpackage.m5a.f(r2)     // Catch:{ IllegalStateException -> 0x0017 }
        L_0x0032:
            boolean r2 = r11.C(r12, r14)     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 == 0) goto L_0x0039
            goto L_0x0032
        L_0x0039:
            defpackage.m5a.s()     // Catch:{ IllegalStateException -> 0x0017 }
            goto L_0x00a2
        L_0x003e:
            hn8 r2 = r11.S0     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 == 0) goto L_0x008c
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0017 }
            java.lang.String r4 = "drainAndFeed"
            defpackage.m5a.f(r4)     // Catch:{ IllegalStateException -> 0x0017 }
        L_0x004b:
            boolean r4 = r11.H(r12, r14)     // Catch:{ IllegalStateException -> 0x0017 }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x006c
            long r7 = r11.P0     // Catch:{ IllegalStateException -> 0x0017 }
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0068
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0017 }
            long r9 = r9 - r2
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r4 = r1
            goto L_0x0069
        L_0x0068:
            r4 = r0
        L_0x0069:
            if (r4 == 0) goto L_0x006c
            goto L_0x004b
        L_0x006c:
            boolean r12 = r11.I()     // Catch:{ IllegalStateException -> 0x0017 }
            if (r12 == 0) goto L_0x0088
            long r12 = r11.P0     // Catch:{ IllegalStateException -> 0x0017 }
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 == 0) goto L_0x0084
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0017 }
            long r14 = r14 - r2
            int r12 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r12 >= 0) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            r12 = r1
            goto L_0x0085
        L_0x0084:
            r12 = r0
        L_0x0085:
            if (r12 == 0) goto L_0x0088
            goto L_0x006c
        L_0x0088:
            defpackage.m5a.s()     // Catch:{ IllegalStateException -> 0x0017 }
            goto L_0x00a2
        L_0x008c:
            z94 r14 = r11.J1     // Catch:{ IllegalStateException -> 0x0017 }
            int r15 = r14.e     // Catch:{ IllegalStateException -> 0x0017 }
            kcd r2 = r11.x     // Catch:{ IllegalStateException -> 0x0017 }
            r2.getClass()     // Catch:{ IllegalStateException -> 0x0017 }
            long r3 = r11.z     // Catch:{ IllegalStateException -> 0x0017 }
            long r12 = r12 - r3
            int r12 = r2.e(r12)     // Catch:{ IllegalStateException -> 0x0017 }
            int r15 = r15 + r12
            r14.e = r15     // Catch:{ IllegalStateException -> 0x0017 }
            r11.f0(r0)     // Catch:{ IllegalStateException -> 0x0017 }
        L_0x00a2:
            z94 r12 = r11.J1     // Catch:{ IllegalStateException -> 0x0017 }
            monitor-enter(r12)     // Catch:{ IllegalStateException -> 0x0017 }
            monitor-exit(r12)     // Catch:{ IllegalStateException -> 0x0017 }
            return
        L_0x00a7:
            int r13 = defpackage.t0g.a
            r14 = 21
            if (r13 < r14) goto L_0x00b2
            boolean r15 = r12 instanceof android.media.MediaCodec.CodecException
            if (r15 == 0) goto L_0x00b2
            goto L_0x00c7
        L_0x00b2:
            java.lang.StackTraceElement[] r15 = r12.getStackTrace()
            int r2 = r15.length
            if (r2 <= 0) goto L_0x00f0
            r15 = r15[r1]
            java.lang.String r15 = r15.getClassName()
            java.lang.String r2 = "android.media.MediaCodec"
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto L_0x00f0
        L_0x00c7:
            r11.V(r12)
            if (r13 < r14) goto L_0x00dc
            boolean r13 = r12 instanceof android.media.MediaCodec.CodecException
            if (r13 == 0) goto L_0x00d8
            r13 = r12
            android.media.MediaCodec$CodecException r13 = (android.media.MediaCodec.CodecException) r13
            boolean r13 = r13.isRecoverable()
            goto L_0x00d9
        L_0x00d8:
            r13 = r1
        L_0x00d9:
            if (r13 == 0) goto L_0x00dc
            r1 = r0
        L_0x00dc:
            if (r1 == 0) goto L_0x00e1
            r11.g0()
        L_0x00e1:
            nn8 r13 = r11.Z0
            com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException r12 = r11.E(r12, r13)
            ca6 r13 = r11.J0
            r14 = 4003(0xfa3, float:5.61E-42)
            com.google.android.exoplayer2.ExoPlaybackException r11 = r11.f(r12, r13, r1, r14)
            throw r11
        L_0x00f0:
            throw r12
        L_0x00f1:
            r12 = 0
            r11.I1 = r12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vn8.w(long, long):void");
    }

    public void z(float f, float f2) {
        this.Q0 = f;
        this.R0 = f2;
        o0(this.T0);
    }
}
