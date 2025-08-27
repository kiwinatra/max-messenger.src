package defpackage;

import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.apache.http.HttpStatus;

/* renamed from: vd6  reason: default package */
public final class vd6 implements tf5 {
    public static final byte[] S0 = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final ea6 T0;
    public int A0;
    public long B0;
    public int C0;
    public l8b D0;
    public long E0;
    public int F0;
    public long G0;
    public long H0;
    public long I0;
    public td6 J0;
    public int K0;
    public int L0;
    public int M0;
    public boolean N0;
    public xf5 O0;
    public zpf[] P0;
    public zpf[] Q0;
    public boolean R0;
    public final rkf X;
    public final fj Y;
    public final l8b Z;
    public final gze a;
    public final int b;
    public final List c;
    public final SparseArray o;
    public final l8b v;
    public final ArrayDeque v0;
    public final l8b w;
    public final ArrayDeque w0;
    public final l8b x;
    public final zpf x0;
    public final byte[] y;
    public k0d y0;
    public final l8b z;
    public int z0;

    static {
        ba6 ba6 = new ba6();
        ba6.m = vq9.l("application/x-emsg");
        T0 = ba6.a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public vd6(int i, gze gze) {
        this(gze, i, (rkf) null, k0d.v, (zpf) null);
        lx5 lx5 = tb7.b;
    }

    public static yv4 a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            sy syVar = (sy) arrayList.get(i);
            if (syVar.b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = syVar.c.a;
                z9c N = m5a.N(bArr);
                UUID uuid = N == null ? null : N.a;
                if (uuid == null) {
                    i8b.V("Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new wv4(uuid, (String) null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new yv4((String) null, false, (wv4[]) arrayList2.toArray(new wv4[0]));
    }

    public static void b(l8b l8b, int i, qpf qpf) {
        l8b.G(i + 8);
        int g = l8b.g();
        if ((g & 1) == 0) {
            boolean z2 = (g & 2) != 0;
            int y2 = l8b.y();
            if (y2 == 0) {
                Arrays.fill(qpf.k, 0, qpf.d, false);
            } else if (y2 == qpf.d) {
                Arrays.fill(qpf.k, 0, y2, z2);
                int a2 = l8b.a();
                l8b l8b2 = (l8b) qpf.q;
                l8b2.D(a2);
                qpf.j = true;
                qpf.l = true;
                l8b.e(0, l8b2.a, l8b2.c);
                l8b2.G(0);
                qpf.l = false;
            } else {
                StringBuilder o2 = wj6.o(y2, "Senc sample count ", " is different from fragment sample count");
                o2.append(qpf.d);
                throw ParserException.a(o2.toString(), (RuntimeException) null);
            }
        } else {
            throw ParserException.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
    }

    public final void U(xf5 xf5) {
        int i;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            xf5 = new jk3(xf5, this.a);
        }
        this.O0 = xf5;
        int i3 = 0;
        this.z0 = 0;
        this.C0 = 0;
        zpf[] zpfArr = new zpf[2];
        this.P0 = zpfArr;
        zpf zpf = this.x0;
        if (zpf != null) {
            zpfArr[0] = zpf;
            i = 1;
        } else {
            i = 0;
        }
        int i4 = 100;
        if ((i2 & 4) != 0) {
            zpfArr[i] = xf5.B(100, 5);
            i4 = HttpStatus.SC_SWITCHING_PROTOCOLS;
            i++;
        }
        zpf[] zpfArr2 = (zpf[]) v0g.U(i, this.P0);
        this.P0 = zpfArr2;
        for (zpf e : zpfArr2) {
            e.e(T0);
        }
        List list = this.c;
        this.Q0 = new zpf[list.size()];
        while (i3 < this.Q0.length) {
            zpf B = this.O0.B(i4, 3);
            B.e((ea6) list.get(i3));
            this.Q0[i3] = B;
            i3++;
            i4++;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v21, resolved type: ai4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(long r53) {
        /*
            r52 = this;
            r0 = r52
            r5 = 1
        L_0x0003:
            java.util.ArrayDeque r6 = r0.v0
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x07be
            java.lang.Object r7 = r6.peek()
            qy r7 = (defpackage.qy) r7
            long r9 = r7.c
            int r7 = (r9 > r53 ? 1 : (r9 == r53 ? 0 : -1))
            if (r7 != 0) goto L_0x07be
            java.lang.Object r7 = r6.pop()
            r9 = r7
            qy r9 = (defpackage.qy) r9
            int r7 = r9.b
            android.util.SparseArray r15 = r0.o
            java.util.ArrayList r10 = r9.o
            r11 = 1836019574(0x6d6f6f76, float:4.631354E27)
            int r12 = r0.b
            r13 = 12
            if (r7 != r11) goto L_0x018a
            yv4 r6 = a(r10)
            r7 = 1836475768(0x6d766578, float:4.7659988E27)
            qy r7 = r9.z(r7)
            r7.getClass()
            android.util.SparseArray r14 = new android.util.SparseArray
            r14.<init>()
            java.util.ArrayList r7 = r7.o
            int r10 = r7.size()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11 = 0
        L_0x004c:
            if (r11 >= r10) goto L_0x00bf
            java.lang.Object r16 = r7.get(r11)
            r1 = r16
            sy r1 = (defpackage.sy) r1
            int r8 = r1.b
            r2 = 1953654136(0x74726578, float:7.6818474E31)
            l8b r1 = r1.c
            if (r8 != r2) goto L_0x0096
            r1.G(r13)
            int r2 = r1.g()
            int r8 = r1.g()
            int r8 = r8 - r5
            int r13 = r1.g()
            int r5 = r1.g()
            int r1 = r1.g()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r19 = r7
            ai4 r7 = new ai4
            r7.<init>(r8, r13, r5, r1)
            android.util.Pair r1 = android.util.Pair.create(r2, r7)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r1 = r1.second
            ai4 r1 = (defpackage.ai4) r1
            r14.put(r2, r1)
            goto L_0x00b7
        L_0x0096:
            r19 = r7
            r2 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r8 != r2) goto L_0x00b7
            r2 = 8
            r1.G(r2)
            int r2 = r1.g()
            int r2 = defpackage.ty.y(r2)
            if (r2 != 0) goto L_0x00b2
            long r1 = r1.w()
        L_0x00b0:
            r3 = r1
            goto L_0x00b7
        L_0x00b2:
            long r1 = r1.z()
            goto L_0x00b0
        L_0x00b7:
            r1 = 1
            int r11 = r11 + r1
            r5 = r1
            r7 = r19
            r13 = 12
            goto L_0x004c
        L_0x00bf:
            mp6 r10 = new mp6
            r10.<init>()
            r1 = 16
            r2 = r12 & 16
            if (r2 == 0) goto L_0x00cc
            r1 = 1
            goto L_0x00cd
        L_0x00cc:
            r1 = 0
        L_0x00cd:
            lc5 r2 = new lc5
            r5 = 14
            r2.<init>((int) r5, (java.lang.Object) r0)
            r5 = 0
            r11 = r3
            r13 = r6
            r3 = r14
            r14 = r1
            r1 = r15
            r15 = r5
            r16 = r2
            java.util.ArrayList r2 = defpackage.bz.f(r9, r10, r11, r13, r14, r15, r16)
            int r4 = r2.size()
            int r5 = r1.size()
            if (r5 != 0) goto L_0x0134
            r5 = 0
        L_0x00ec:
            if (r5 >= r4) goto L_0x012e
            java.lang.Object r6 = r2.get(r5)
            bqf r6 = (defpackage.bqf) r6
            lpf r7 = r6.a
            td6 r8 = new td6
            xf5 r9 = r0.O0
            int r10 = r7.b
            zpf r9 = r9.B(r5, r10)
            int r10 = r3.size()
            int r11 = r7.a
            r12 = 1
            if (r10 != r12) goto L_0x0111
            r10 = 0
            java.lang.Object r12 = r3.valueAt(r10)
            ai4 r12 = (defpackage.ai4) r12
            goto L_0x011b
        L_0x0111:
            java.lang.Object r10 = r3.get(r11)
            r12 = r10
            ai4 r12 = (defpackage.ai4) r12
            r12.getClass()
        L_0x011b:
            r8.<init>(r9, r6, r12)
            r1.put(r11, r8)
            long r8 = r0.H0
            long r6 = r7.e
            long r6 = java.lang.Math.max(r8, r6)
            r0.H0 = r6
            r6 = 1
            int r5 = r5 + r6
            goto L_0x00ec
        L_0x012e:
            xf5 r1 = r0.O0
            r1.v()
            goto L_0x0180
        L_0x0134:
            int r5 = r1.size()
            if (r5 != r4) goto L_0x013c
            r5 = 1
            goto L_0x013d
        L_0x013c:
            r5 = 0
        L_0x013d:
            defpackage.n79.n(r5)
            r5 = 0
        L_0x0141:
            if (r5 >= r4) goto L_0x0180
            java.lang.Object r6 = r2.get(r5)
            bqf r6 = (defpackage.bqf) r6
            lpf r7 = r6.a
            int r8 = r7.a
            java.lang.Object r8 = r1.get(r8)
            td6 r8 = (defpackage.td6) r8
            int r9 = r3.size()
            r10 = 1
            if (r9 != r10) goto L_0x0162
            r9 = 0
            java.lang.Object r7 = r3.valueAt(r9)
            ai4 r7 = (defpackage.ai4) r7
            goto L_0x016d
        L_0x0162:
            int r7 = r7.a
            java.lang.Object r7 = r3.get(r7)
            ai4 r7 = (defpackage.ai4) r7
            r7.getClass()
        L_0x016d:
            r8.d = r6
            r8.e = r7
            lpf r6 = r6.a
            ea6 r6 = r6.f
            zpf r7 = r8.a
            r7.e(r6)
            r8.d()
            r6 = 1
            int r5 = r5 + r6
            goto L_0x0141
        L_0x0180:
            r7 = r0
            r3 = 2
            r5 = 8
            r8 = 16
            r11 = 1
            r15 = 4
            goto L_0x07ba
        L_0x018a:
            r1 = r15
            r2 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r7 != r2) goto L_0x07a1
            java.util.ArrayList r2 = r9.v
            int r5 = r2.size()
            r6 = 0
        L_0x0197:
            if (r6 >= r5) goto L_0x0700
            java.lang.Object r8 = r2.get(r6)
            qy r8 = (defpackage.qy) r8
            int r9 = r8.b
            r11 = 1953653094(0x74726166, float:7.6813435E31)
            if (r9 != r11) goto L_0x06db
            r9 = 1952868452(0x74666864, float:7.301914E31)
            sy r9 = r8.A(r9)
            r9.getClass()
            l8b r9 = r9.c
            r11 = 8
            r9.G(r11)
            int r11 = r9.g()
            int r13 = r9.g()
            java.lang.Object r13 = r1.get(r13)
            td6 r13 = (defpackage.td6) r13
            if (r13 != 0) goto L_0x01c9
            r13 = 0
            goto L_0x0218
        L_0x01c9:
            r14 = 1
            r15 = r11 & 1
            qpf r14 = r13.b
            if (r15 == 0) goto L_0x01d8
            long r3 = r9.z()
            r14.a = r3
            r14.b = r3
        L_0x01d8:
            ai4 r3 = r13.e
            r4 = 2
            r15 = r11 & 2
            if (r15 == 0) goto L_0x01e8
            int r4 = r9.g()
            r15 = 1
            int r4 = r4 - r15
        L_0x01e5:
            r15 = 8
            goto L_0x01eb
        L_0x01e8:
            int r4 = r3.a
            goto L_0x01e5
        L_0x01eb:
            r20 = r11 & 8
            if (r20 == 0) goto L_0x01f6
            int r15 = r9.g()
        L_0x01f3:
            r17 = 16
            goto L_0x01f9
        L_0x01f6:
            int r15 = r3.b
            goto L_0x01f3
        L_0x01f9:
            r20 = r11 & 16
            if (r20 == 0) goto L_0x0204
            int r20 = r9.g()
            r7 = r20
            goto L_0x0206
        L_0x0204:
            int r7 = r3.c
        L_0x0206:
            r11 = r11 & 32
            if (r11 == 0) goto L_0x020f
            int r3 = r9.g()
            goto L_0x0211
        L_0x020f:
            int r3 = r3.d
        L_0x0211:
            ai4 r9 = new ai4
            r9.<init>(r4, r15, r7, r3)
            r14.o = r9
        L_0x0218:
            if (r13 != 0) goto L_0x021c
            goto L_0x06db
        L_0x021c:
            qpf r3 = r13.b
            long r14 = r3.m
            boolean r4 = r3.n
            r13.d()
            r7 = 1
            r13.l = r7
            r9 = 1952867444(0x74666474, float:7.3014264E31)
            sy r9 = r8.A(r9)
            if (r9 == 0) goto L_0x0255
            r11 = 2
            r18 = r12 & 2
            if (r18 != 0) goto L_0x0255
            l8b r4 = r9.c
            r9 = 8
            r4.G(r9)
            int r9 = r4.g()
            int r9 = defpackage.ty.y(r9)
            if (r9 != r7) goto L_0x024c
            long r14 = r4.z()
            goto L_0x0250
        L_0x024c:
            long r14 = r4.w()
        L_0x0250:
            r3.m = r14
            r3.n = r7
            goto L_0x0259
        L_0x0255:
            r3.m = r14
            r3.n = r4
        L_0x0259:
            java.util.ArrayList r4 = r8.o
            int r7 = r4.size()
            r9 = 0
            r11 = 0
            r14 = 0
        L_0x0262:
            r15 = 1953658222(0x7472756e, float:7.683823E31)
            if (r9 >= r7) goto L_0x028f
            java.lang.Object r21 = r4.get(r9)
            r22 = r2
            r2 = r21
            sy r2 = (defpackage.sy) r2
            r21 = r5
            int r5 = r2.b
            if (r5 != r15) goto L_0x0288
            l8b r2 = r2.c
            r5 = 12
            r2.G(r5)
            int r2 = r2.y()
            if (r2 <= 0) goto L_0x0288
            int r14 = r14 + r2
            r2 = 1
            int r11 = r11 + r2
            goto L_0x0289
        L_0x0288:
            r2 = 1
        L_0x0289:
            int r9 = r9 + r2
            r5 = r21
            r2 = r22
            goto L_0x0262
        L_0x028f:
            r22 = r2
            r21 = r5
            r2 = 0
            r13.h = r2
            r13.g = r2
            r13.f = r2
            r3.c = r11
            r3.d = r14
            int[] r2 = r3.f
            int r2 = r2.length
            if (r2 >= r11) goto L_0x02ab
            long[] r2 = new long[r11]
            r3.e = r2
            int[] r2 = new int[r11]
            r3.f = r2
        L_0x02ab:
            int[] r2 = r3.g
            int r2 = r2.length
            if (r2 >= r14) goto L_0x02c4
            int r14 = r14 * 125
            int r14 = r14 / 100
            int[] r2 = new int[r14]
            r3.g = r2
            long[] r2 = new long[r14]
            r3.h = r2
            boolean[] r2 = new boolean[r14]
            r3.i = r2
            boolean[] r2 = new boolean[r14]
            r3.k = r2
        L_0x02c4:
            r2 = 0
            r5 = 0
            r9 = 0
        L_0x02c7:
            r23 = 0
            if (r2 >= r7) goto L_0x04b2
            java.lang.Object r11 = r4.get(r2)
            sy r11 = (defpackage.sy) r11
            int r14 = r11.b
            if (r14 != r15) goto L_0x0486
            r14 = 1
            int r25 = r5 + 1
            l8b r11 = r11.c
            r14 = 8
            r11.G(r14)
            int r14 = r11.g()
            bqf r15 = r13.d
            lpf r15 = r15.a
            r26 = r7
            java.lang.Object r7 = r3.o
            ai4 r7 = (defpackage.ai4) r7
            int r27 = defpackage.v0g.a
            r27 = r1
            int[] r1 = r3.f
            int r28 = r11.y()
            r1[r5] = r28
            long[] r1 = r3.e
            r28 = r8
            r29 = r9
            long r8 = r3.a
            r1[r5] = r8
            r18 = 1
            r30 = r14 & 1
            if (r30 == 0) goto L_0x0319
            r30 = r10
            int r10 = r11.g()
            r31 = r12
            r32 = r13
            long r12 = (long) r10
            long r8 = r8 + r12
            r1[r5] = r8
        L_0x0317:
            r1 = 4
            goto L_0x0320
        L_0x0319:
            r30 = r10
            r31 = r12
            r32 = r13
            goto L_0x0317
        L_0x0320:
            r8 = r14 & 4
            if (r8 == 0) goto L_0x0326
            r1 = 1
            goto L_0x0327
        L_0x0326:
            r1 = 0
        L_0x0327:
            int r8 = r7.d
            if (r1 == 0) goto L_0x032f
            int r8 = r11.g()
        L_0x032f:
            r9 = r14 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0335
            r9 = 1
            goto L_0x0336
        L_0x0335:
            r9 = 0
        L_0x0336:
            r10 = r14 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x033c
            r10 = 1
            goto L_0x033d
        L_0x033c:
            r10 = 0
        L_0x033d:
            r12 = r14 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0343
            r12 = 1
            goto L_0x0344
        L_0x0343:
            r12 = 0
        L_0x0344:
            r13 = r14 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x034a
            r13 = 1
            goto L_0x034b
        L_0x034a:
            r13 = 0
        L_0x034b:
            long[] r14 = r15.h
            if (r14 == 0) goto L_0x0389
            r33 = r8
            int r8 = r14.length
            r34 = r6
            r6 = 1
            if (r8 != r6) goto L_0x035b
            long[] r6 = r15.i
            if (r6 != 0) goto L_0x035f
        L_0x035b:
            r35 = r1
        L_0x035d:
            r8 = r13
            goto L_0x0390
        L_0x035f:
            r8 = 0
            r35 = r14[r8]
            int r14 = (r35 > r23 ? 1 : (r35 == r23 ? 0 : -1))
            if (r14 != 0) goto L_0x036b
            r35 = r1
            r0 = r8
            r8 = r13
            goto L_0x0386
        L_0x036b:
            r37 = r6[r8]
            long r39 = r35 + r37
            java.math.RoundingMode r45 = java.math.RoundingMode.FLOOR
            r41 = 1000000(0xf4240, double:4.940656E-318)
            r8 = r13
            long r13 = r15.d
            r43 = r13
            long r13 = defpackage.v0g.a0(r39, r41, r43, r45)
            r35 = r1
            long r0 = r15.e
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0390
            r0 = 0
        L_0x0386:
            r23 = r6[r0]
            goto L_0x0390
        L_0x0389:
            r35 = r1
            r34 = r6
            r33 = r8
            goto L_0x035d
        L_0x0390:
            int[] r0 = r3.g
            long[] r1 = r3.h
            boolean[] r6 = r3.i
            int r13 = r15.b
            r14 = 2
            if (r13 != r14) goto L_0x03a2
            r13 = 1
            r14 = r31 & 1
            if (r14 == 0) goto L_0x03a2
            r13 = 1
            goto L_0x03a3
        L_0x03a2:
            r13 = 0
        L_0x03a3:
            int[] r14 = r3.f
            r5 = r14[r5]
            int r5 = r29 + r5
            r36 = r13
            long r13 = r3.m
            r37 = r2
            r50 = r13
            r14 = r3
            r2 = r50
            r13 = r29
        L_0x03b6:
            if (r13 >= r5) goto L_0x047a
            if (r9 == 0) goto L_0x03c5
            int r29 = r11.g()
            r38 = r5
            r39 = r9
            r5 = r29
            goto L_0x03cb
        L_0x03c5:
            r38 = r5
            int r5 = r7.b
            r39 = r9
        L_0x03cb:
            java.lang.String r9 = "Unexpected negative value: "
            if (r5 < 0) goto L_0x0468
            if (r10 == 0) goto L_0x03da
            int r29 = r11.g()
            r40 = r10
            r10 = r29
            goto L_0x03de
        L_0x03da:
            r40 = r10
            int r10 = r7.c
        L_0x03de:
            if (r10 < 0) goto L_0x0456
            if (r12 == 0) goto L_0x03e7
            int r9 = r11.g()
            goto L_0x03f0
        L_0x03e7:
            if (r13 != 0) goto L_0x03ee
            if (r35 == 0) goto L_0x03ee
            r9 = r33
            goto L_0x03f0
        L_0x03ee:
            int r9 = r7.d
        L_0x03f0:
            if (r8 == 0) goto L_0x03fd
            int r29 = r11.g()
            r41 = r7
            r42 = r8
            r7 = r29
            goto L_0x0402
        L_0x03fd:
            r41 = r7
            r42 = r8
            r7 = 0
        L_0x0402:
            long r7 = (long) r7
            long r7 = r7 + r2
            long r43 = r7 - r23
            java.math.RoundingMode r49 = java.math.RoundingMode.FLOOR
            r45 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r15.c
            r47 = r7
            long r7 = defpackage.v0g.a0(r43, r45, r47, r49)
            r1[r13] = r7
            r43 = r11
            boolean r11 = r14.n
            if (r11 != 0) goto L_0x0429
            r11 = r32
            r32 = r12
            bqf r12 = r11.d
            r44 = r11
            long r11 = r12.h
            long r7 = r7 + r11
            r1[r13] = r7
            goto L_0x042d
        L_0x0429:
            r44 = r32
            r32 = r12
        L_0x042d:
            r0[r13] = r10
            r7 = 16
            int r8 = r9 >> 16
            r7 = 1
            r8 = r8 & r7
            if (r8 != 0) goto L_0x043d
            if (r36 == 0) goto L_0x043b
            if (r13 != 0) goto L_0x043d
        L_0x043b:
            r7 = 1
            goto L_0x043e
        L_0x043d:
            r7 = 0
        L_0x043e:
            r6[r13] = r7
            long r7 = (long) r5
            long r2 = r2 + r7
            r5 = 1
            int r13 = r13 + r5
            r12 = r32
            r5 = r38
            r9 = r39
            r10 = r40
            r7 = r41
            r8 = r42
            r11 = r43
            r32 = r44
            goto L_0x03b6
        L_0x0456:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r9)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x0468:
            r1 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r9)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x047a:
            r38 = r5
            r44 = r32
            r14.m = r2
            r5 = r25
            r9 = r38
        L_0x0484:
            r0 = 1
            goto L_0x049a
        L_0x0486:
            r27 = r1
            r37 = r2
            r14 = r3
            r34 = r6
            r26 = r7
            r28 = r8
            r29 = r9
            r30 = r10
            r31 = r12
            r44 = r13
            goto L_0x0484
        L_0x049a:
            int r2 = r37 + 1
            r0 = r52
            r3 = r14
            r7 = r26
            r1 = r27
            r8 = r28
            r10 = r30
            r12 = r31
            r6 = r34
            r13 = r44
            r15 = 1953658222(0x7472756e, float:7.683823E31)
            goto L_0x02c7
        L_0x04b2:
            r27 = r1
            r14 = r3
            r34 = r6
            r28 = r8
            r30 = r10
            r31 = r12
            bqf r0 = r13.d
            lpf r0 = r0.a
            java.lang.Object r1 = r14.o
            ai4 r1 = (defpackage.ai4) r1
            r1.getClass()
            ppf[] r0 = r0.k
            if (r0 != 0) goto L_0x04ce
            r1 = 0
            goto L_0x04d3
        L_0x04ce:
            int r1 = r1.a
            r0 = r0[r1]
            r1 = r0
        L_0x04d3:
            r0 = 1935763834(0x7361697a, float:1.785898E31)
            r8 = r28
            sy r0 = r8.A(r0)
            if (r0 == 0) goto L_0x0554
            r1.getClass()
            l8b r0 = r0.c
            r2 = 8
            r0.G(r2)
            int r3 = r0.g()
            r5 = 1
            r3 = r3 & r5
            if (r3 != r5) goto L_0x04f3
            r0.H(r2)
        L_0x04f3:
            int r2 = r0.u()
            int r3 = r0.y()
            int r5 = r14.d
            if (r3 > r5) goto L_0x053d
            int r5 = r1.d
            if (r2 != 0) goto L_0x051a
            boolean[] r2 = r14.k
            r6 = 0
            r7 = 0
        L_0x0507:
            if (r6 >= r3) goto L_0x0518
            int r9 = r0.u()
            int r7 = r7 + r9
            if (r9 <= r5) goto L_0x0512
            r9 = 1
            goto L_0x0513
        L_0x0512:
            r9 = 0
        L_0x0513:
            r2[r6] = r9
            r9 = 1
            int r6 = r6 + r9
            goto L_0x0507
        L_0x0518:
            r5 = 0
            goto L_0x0527
        L_0x051a:
            if (r2 <= r5) goto L_0x051e
            r0 = 1
            goto L_0x051f
        L_0x051e:
            r0 = 0
        L_0x051f:
            int r7 = r2 * r3
            boolean[] r2 = r14.k
            r5 = 0
            java.util.Arrays.fill(r2, r5, r3, r0)
        L_0x0527:
            boolean[] r0 = r14.k
            int r2 = r14.d
            java.util.Arrays.fill(r0, r3, r2, r5)
            if (r7 <= 0) goto L_0x0554
            java.lang.Object r0 = r14.q
            l8b r0 = (defpackage.l8b) r0
            r0.D(r7)
            r0 = 1
            r14.j = r0
            r14.l = r0
            goto L_0x0554
        L_0x053d:
            java.lang.String r0 = "Saiz sample count "
            java.lang.String r1 = " is greater than fragment sample count"
            java.lang.StringBuilder r0 = defpackage.wj6.o(r3, r0, r1)
            int r1 = r14.d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x0554:
            r0 = 1935763823(0x7361696f, float:1.7858967E31)
            sy r0 = r8.A(r0)
            if (r0 == 0) goto L_0x058a
            l8b r0 = r0.c
            r2 = 8
            r0.G(r2)
            int r3 = r0.g()
            r5 = 1
            r6 = r3 & 1
            if (r6 != r5) goto L_0x0570
            r0.H(r2)
        L_0x0570:
            int r2 = r0.y()
            if (r2 != r5) goto L_0x058c
            int r2 = defpackage.ty.y(r3)
            long r5 = r14.b
            if (r2 != 0) goto L_0x0583
            long r2 = r0.w()
            goto L_0x0587
        L_0x0583:
            long r2 = r0.z()
        L_0x0587:
            long r5 = r5 + r2
            r14.b = r5
        L_0x058a:
            r2 = 0
            goto L_0x05a0
        L_0x058c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected saio entry count: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r2)
            throw r0
        L_0x05a0:
            r0 = 1936027235(0x73656e63, float:1.8177412E31)
            sy r0 = r8.A(r0)
            if (r0 == 0) goto L_0x05af
            l8b r0 = r0.c
            r3 = 0
            b(r0, r3, r14)
        L_0x05af:
            if (r1 == 0) goto L_0x05b5
            java.lang.String r1 = r1.b
            r7 = r1
            goto L_0x05b6
        L_0x05b5:
            r7 = r2
        L_0x05b6:
            r0 = r2
            r1 = r0
            r3 = 0
        L_0x05b9:
            int r5 = r4.size()
            if (r3 >= r5) goto L_0x05f3
            java.lang.Object r5 = r4.get(r3)
            sy r5 = (defpackage.sy) r5
            l8b r6 = r5.c
            r8 = 1935828848(0x73626770, float:1.7937577E31)
            r9 = 1936025959(0x73656967, float:1.817587E31)
            int r5 = r5.b
            if (r5 != r8) goto L_0x05df
            r13 = 12
            r6.G(r13)
            int r5 = r6.g()
            if (r5 != r9) goto L_0x05dd
            r1 = r6
        L_0x05dd:
            r5 = 1
            goto L_0x05f1
        L_0x05df:
            r13 = 12
            r8 = 1936158820(0x73677064, float:1.8336489E31)
            if (r5 != r8) goto L_0x05dd
            r6.G(r13)
            int r5 = r6.g()
            if (r5 != r9) goto L_0x05dd
            r0 = r6
            goto L_0x05dd
        L_0x05f1:
            int r3 = r3 + r5
            goto L_0x05b9
        L_0x05f3:
            r5 = 1
            r13 = 12
            if (r1 == 0) goto L_0x05fa
            if (r0 != 0) goto L_0x05fe
        L_0x05fa:
            r3 = 2
            r15 = 4
            goto L_0x0697
        L_0x05fe:
            r3 = 8
            r1.G(r3)
            int r6 = r1.g()
            int r6 = defpackage.ty.y(r6)
            r15 = 4
            r1.H(r15)
            if (r6 != r5) goto L_0x0614
            r1.H(r15)
        L_0x0614:
            int r1 = r1.g()
            if (r1 != r5) goto L_0x0690
            r0.G(r3)
            int r1 = r0.g()
            int r1 = defpackage.ty.y(r1)
            r0.H(r15)
            if (r1 != r5) goto L_0x063b
            long r5 = r0.w()
            int r1 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r1 == 0) goto L_0x0634
            r3 = 2
            goto L_0x0641
        L_0x0634:
            java.lang.String r0 = "Variable length description in sgpd found (unsupported)"
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.c(r0)
            throw r0
        L_0x063b:
            r3 = 2
            if (r1 < r3) goto L_0x0641
            r0.H(r15)
        L_0x0641:
            long r5 = r0.w()
            r8 = 1
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0689
            r1 = 1
            r0.H(r1)
            int r5 = r0.u()
            r6 = r5 & 240(0xf0, float:3.36E-43)
            int r10 = r6 >> 4
            r11 = r5 & 15
            int r5 = r0.u()
            if (r5 != r1) goto L_0x0661
            r6 = 1
            goto L_0x0662
        L_0x0661:
            r6 = 0
        L_0x0662:
            if (r6 != 0) goto L_0x0665
            goto L_0x0697
        L_0x0665:
            int r8 = r0.u()
            r1 = 16
            byte[] r9 = new byte[r1]
            r5 = 0
            r0.e(r5, r9, r1)
            if (r8 != 0) goto L_0x067c
            int r1 = r0.u()
            byte[] r2 = new byte[r1]
            r0.e(r5, r2, r1)
        L_0x067c:
            r12 = r2
            r0 = 1
            r14.j = r0
            ppf r0 = new ppf
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r14.p = r0
            goto L_0x0697
        L_0x0689:
            java.lang.String r0 = "Entry count in sgpd != 1 (unsupported)."
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.c(r0)
            throw r0
        L_0x0690:
            java.lang.String r0 = "Entry count in sbgp != 1 (unsupported)."
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.c(r0)
            throw r0
        L_0x0697:
            int r0 = r4.size()
            r10 = 0
        L_0x069c:
            if (r10 >= r0) goto L_0x06d3
            java.lang.Object r1 = r4.get(r10)
            sy r1 = (defpackage.sy) r1
            int r2 = r1.b
            r5 = 1970628964(0x75756964, float:3.1109627E32)
            if (r2 != r5) goto L_0x06ca
            l8b r1 = r1.c
            r5 = 8
            r1.G(r5)
            r7 = r52
            byte[] r2 = r7.y
            r6 = 0
            r8 = 16
            r1.e(r6, r2, r8)
            byte[] r6 = S0
            boolean r2 = java.util.Arrays.equals(r2, r6)
            if (r2 != 0) goto L_0x06c5
            goto L_0x06c8
        L_0x06c5:
            b(r1, r8, r14)
        L_0x06c8:
            r1 = 1
            goto L_0x06d1
        L_0x06ca:
            r5 = 8
            r8 = 16
            r7 = r52
            goto L_0x06c8
        L_0x06d1:
            int r10 = r10 + r1
            goto L_0x069c
        L_0x06d3:
            r1 = 1
            r5 = 8
            r8 = 16
            r7 = r52
            goto L_0x06f1
        L_0x06db:
            r7 = r0
            r27 = r1
            r22 = r2
            r21 = r5
            r34 = r6
            r30 = r10
            r31 = r12
            r1 = 1
            r3 = 2
            r5 = 8
            r8 = 16
            r13 = 12
            r15 = 4
        L_0x06f1:
            int r6 = r34 + 1
            r0 = r7
            r5 = r21
            r2 = r22
            r1 = r27
            r10 = r30
            r12 = r31
            goto L_0x0197
        L_0x0700:
            r7 = r0
            r27 = r1
            r30 = r10
            r2 = 0
            r3 = 2
            r5 = 8
            r8 = 16
            r15 = 4
            yv4 r0 = a(r30)
            if (r0 == 0) goto L_0x075c
            int r1 = r27.size()
            r10 = 0
        L_0x0717:
            if (r10 >= r1) goto L_0x075c
            r4 = r27
            java.lang.Object r6 = r4.valueAt(r10)
            td6 r6 = (defpackage.td6) r6
            bqf r9 = r6.d
            lpf r9 = r9.a
            qpf r11 = r6.b
            java.lang.Object r11 = r11.o
            ai4 r11 = (defpackage.ai4) r11
            int r12 = defpackage.v0g.a
            int r11 = r11.a
            ppf[] r9 = r9.k
            if (r9 != 0) goto L_0x0735
            r9 = r2
            goto L_0x0737
        L_0x0735:
            r9 = r9[r11]
        L_0x0737:
            if (r9 == 0) goto L_0x073c
            java.lang.String r9 = r9.b
            goto L_0x073d
        L_0x073c:
            r9 = r2
        L_0x073d:
            yv4 r9 = r0.a(r9)
            bqf r11 = r6.d
            lpf r11 = r11.a
            ea6 r11 = r11.f
            ba6 r11 = r11.a()
            r11.q = r9
            ea6 r9 = new ea6
            r9.<init>(r11)
            zpf r6 = r6.a
            r6.e(r9)
            r6 = 1
            int r10 = r10 + r6
            r27 = r4
            goto L_0x0717
        L_0x075c:
            r4 = r27
            long r0 = r7.G0
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x079f
            int r0 = r4.size()
            r1 = 0
        L_0x076e:
            if (r1 >= r0) goto L_0x0796
            java.lang.Object r2 = r4.valueAt(r1)
            td6 r2 = (defpackage.td6) r2
            long r9 = r7.G0
            int r6 = r2.f
        L_0x077a:
            qpf r11 = r2.b
            int r12 = r11.d
            if (r6 >= r12) goto L_0x0793
            long[] r12 = r11.h
            r12 = r12[r6]
            int r12 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r12 > 0) goto L_0x0793
            boolean[] r11 = r11.i
            boolean r11 = r11[r6]
            if (r11 == 0) goto L_0x0790
            r2.i = r6
        L_0x0790:
            r11 = 1
            int r6 = r6 + r11
            goto L_0x077a
        L_0x0793:
            r11 = 1
            int r1 = r1 + r11
            goto L_0x076e
        L_0x0796:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11 = 1
            r7.G0 = r1
            goto L_0x07ba
        L_0x079f:
            r11 = 1
            goto L_0x07ba
        L_0x07a1:
            r7 = r0
            r3 = 2
            r5 = 8
            r8 = 16
            r11 = 1
            r15 = 4
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x07ba
            java.lang.Object r0 = r6.peek()
            qy r0 = (defpackage.qy) r0
            java.util.ArrayList r0 = r0.v
            r0.add(r9)
        L_0x07ba:
            r0 = r7
            r5 = r11
            goto L_0x0003
        L_0x07be:
            r7 = r0
            r0 = 0
            r7.z0 = r0
            r7.C0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd6.c(long):void");
    }

    public final void d(long j, long j2) {
        SparseArray sparseArray = this.o;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((td6) sparseArray.valueAt(i)).d();
        }
        this.w0.clear();
        this.F0 = 0;
        this.G0 = j2;
        this.v0.clear();
        this.z0 = 0;
        this.C0 = 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: td6} */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e1, code lost:
        if ((r8 & 31) != 6) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01f1, code lost:
        if (((r8 & 126) >> 1) == 39) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01f3, code lost:
        r2 = true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(defpackage.vf5 r30, defpackage.yl4 r31) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
        L_0x0004:
            r2 = 1
        L_0x0005:
            int r3 = r0.z0
            java.util.ArrayDeque r4 = r0.v0
            android.util.SparseArray r5 = r0.o
            r6 = 0
            r7 = 1701671783(0x656d7367, float:7.0083103E22)
            r8 = 1936286840(0x73696478, float:1.8491255E31)
            r11 = 2
            if (r3 == 0) goto L_0x05b9
            java.util.ArrayDeque r12 = r0.w0
            rkf r13 = r0.X
            if (r3 == r2) goto L_0x0368
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == r11) goto L_0x0311
            td6 r3 = r0.J0
            if (r3 != 0) goto L_0x00b5
            int r3 = r5.size()
            r15 = r7
            r7 = 0
            r8 = r6
        L_0x002d:
            if (r8 >= r3) goto L_0x0068
            java.lang.Object r17 = r5.valueAt(r8)
            r11 = r17
            td6 r11 = (defpackage.td6) r11
            boolean r14 = r11.l
            if (r14 != 0) goto L_0x0043
            int r9 = r11.f
            bqf r4 = r11.d
            int r4 = r4.b
            if (r9 == r4) goto L_0x0065
        L_0x0043:
            qpf r4 = r11.b
            if (r14 == 0) goto L_0x004e
            int r9 = r11.h
            int r10 = r4.c
            if (r9 != r10) goto L_0x004e
            goto L_0x0065
        L_0x004e:
            if (r14 != 0) goto L_0x0059
            bqf r4 = r11.d
            long[] r4 = r4.c
            int r9 = r11.f
            r9 = r4[r9]
            goto L_0x005f
        L_0x0059:
            long[] r4 = r4.e
            int r9 = r11.h
            r9 = r4[r9]
        L_0x005f:
            int r4 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r4 >= 0) goto L_0x0065
            r15 = r9
            r7 = r11
        L_0x0065:
            int r8 = r8 + r2
            r11 = 2
            goto L_0x002d
        L_0x0068:
            if (r7 != 0) goto L_0x0088
            long r3 = r0.E0
            r5 = r1
            hf4 r5 = (defpackage.hf4) r5
            long r7 = r5.o
            long r3 = r3 - r7
            int r3 = (int) r3
            if (r3 < 0) goto L_0x0080
            r4 = r1
            hf4 r4 = (defpackage.hf4) r4
            r4.z(r3)
            r0.z0 = r6
            r0.C0 = r6
            goto L_0x0005
        L_0x0080:
            java.lang.String r0 = "Offset to end of mdat was negative."
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x0088:
            boolean r3 = r7.l
            if (r3 != 0) goto L_0x0095
            bqf r3 = r7.d
            long[] r3 = r3.c
            int r4 = r7.f
            r3 = r3[r4]
            goto L_0x009d
        L_0x0095:
            qpf r3 = r7.b
            long[] r3 = r3.e
            int r4 = r7.h
            r3 = r3[r4]
        L_0x009d:
            r5 = r1
            hf4 r5 = (defpackage.hf4) r5
            long r8 = r5.o
            long r3 = r3 - r8
            int r3 = (int) r3
            if (r3 >= 0) goto L_0x00ac
            java.lang.String r3 = "Ignoring negative offset to sample data."
            defpackage.i8b.V(r3)
            r3 = r6
        L_0x00ac:
            r4 = r1
            hf4 r4 = (defpackage.hf4) r4
            r4.z(r3)
            r0.J0 = r7
            r3 = r7
        L_0x00b5:
            int r4 = r0.z0
            r5 = 6
            qpf r7 = r3.b
            r8 = 3
            if (r4 != r8) goto L_0x0164
            boolean r4 = r3.l
            if (r4 != 0) goto L_0x00ca
            bqf r4 = r3.d
            int[] r4 = r4.d
            int r8 = r3.f
            r4 = r4[r8]
            goto L_0x00d0
        L_0x00ca:
            int[] r4 = r7.g
            int r8 = r3.f
            r4 = r4[r8]
        L_0x00d0:
            r0.K0 = r4
            int r8 = r3.f
            int r9 = r3.i
            if (r8 >= r9) goto L_0x0112
            hf4 r1 = (defpackage.hf4) r1
            r1.z(r4)
            ppf r1 = r3.a()
            if (r1 != 0) goto L_0x00e4
            goto L_0x0103
        L_0x00e4:
            java.lang.Object r2 = r7.q
            l8b r2 = (defpackage.l8b) r2
            int r1 = r1.d
            if (r1 == 0) goto L_0x00ef
            r2.H(r1)
        L_0x00ef:
            int r1 = r3.f
            boolean r4 = r7.j
            if (r4 == 0) goto L_0x0103
            boolean[] r4 = r7.k
            boolean r1 = r4[r1]
            if (r1 == 0) goto L_0x0103
            int r1 = r2.A()
            int r1 = r1 * r5
            r2.H(r1)
        L_0x0103:
            boolean r1 = r3.b()
            if (r1 != 0) goto L_0x010c
            r1 = 0
            r0.J0 = r1
        L_0x010c:
            r1 = 3
            r0.z0 = r1
            r0 = r6
            goto L_0x0310
        L_0x0112:
            bqf r8 = r3.d
            lpf r8 = r8.a
            int r8 = r8.g
            if (r8 != r2) goto L_0x0125
            r8 = 8
            int r4 = r4 - r8
            r0.K0 = r4
            r4 = r1
            hf4 r4 = (defpackage.hf4) r4
            r4.z(r8)
        L_0x0125:
            bqf r4 = r3.d
            lpf r4 = r4.a
            ea6 r4 = r4.f
            java.lang.String r4 = r4.n
            java.lang.String r8 = "audio/ac4"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x0150
            int r4 = r0.K0
            r8 = 7
            int r4 = r3.c(r4, r8)
            r0.L0 = r4
            int r4 = r0.K0
            l8b r9 = r0.z
            defpackage.n54.h(r4, r9)
            zpf r4 = r3.a
            r4.b(r9, r8, r6)
            int r4 = r0.L0
            int r4 = r4 + r8
            r0.L0 = r4
            goto L_0x0158
        L_0x0150:
            int r4 = r0.K0
            int r4 = r3.c(r4, r6)
            r0.L0 = r4
        L_0x0158:
            int r4 = r0.K0
            int r8 = r0.L0
            int r4 = r4 + r8
            r0.K0 = r4
            r4 = 4
            r0.z0 = r4
            r0.M0 = r6
        L_0x0164:
            bqf r4 = r3.d
            lpf r8 = r4.a
            boolean r9 = r3.l
            if (r9 != 0) goto L_0x0173
            long[] r4 = r4.f
            int r9 = r3.f
            r9 = r4[r9]
            goto L_0x0179
        L_0x0173:
            int r4 = r3.f
            long[] r9 = r7.h
            r9 = r9[r4]
        L_0x0179:
            if (r13 == 0) goto L_0x017f
            long r9 = r13.a(r9)
        L_0x017f:
            int r4 = r8.j
            zpf r11 = r3.a
            if (r4 == 0) goto L_0x0271
            l8b r14 = r0.w
            byte[] r15 = r14.a
            r15[r6] = r6
            r15[r2] = r6
            r16 = 2
            r15[r16] = r6
            int r5 = r4 + 1
            r16 = 4
            int r4 = 4 - r4
        L_0x0197:
            int r2 = r0.L0
            int r6 = r0.K0
            if (r2 >= r6) goto L_0x026e
            int r2 = r0.M0
            java.lang.String r6 = "video/hevc"
            r28 = r13
            ea6 r13 = r8.f
            if (r2 != 0) goto L_0x0214
            r2 = r1
            hf4 r2 = (defpackage.hf4) r2
            r18 = r8
            r8 = 0
            r2.j(r15, r4, r5, r8)
            r14.G(r8)
            int r2 = r14.g()
            r8 = 1
            if (r2 < r8) goto L_0x020c
            int r2 = r2 - r8
            r0.M0 = r2
            l8b r2 = r0.v
            r8 = 0
            r2.G(r8)
            r21 = r5
            r5 = 4
            r11.b(r2, r5, r8)
            r2 = 1
            r11.b(r14, r2, r8)
            zpf[] r2 = r0.Q0
            int r2 = r2.length
            if (r2 <= 0) goto L_0x01f5
            java.lang.String r2 = r13.n
            byte r8 = r15[r5]
            java.lang.String r5 = "video/avc"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x01e4
            r5 = r8 & 31
            r13 = 6
            if (r5 == r13) goto L_0x01f3
            goto L_0x01e5
        L_0x01e4:
            r13 = 6
        L_0x01e5:
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x01f6
            r2 = r8 & 126(0x7e, float:1.77E-43)
            r5 = 1
            int r2 = r2 >> r5
            r5 = 39
            if (r2 != r5) goto L_0x01f6
        L_0x01f3:
            r2 = 1
            goto L_0x01f7
        L_0x01f5:
            r13 = 6
        L_0x01f6:
            r2 = 0
        L_0x01f7:
            r0.N0 = r2
            int r2 = r0.L0
            int r2 = r2 + 5
            r0.L0 = r2
            int r2 = r0.K0
            int r2 = r2 + r4
            r0.K0 = r2
            r8 = r18
            r5 = r21
        L_0x0208:
            r13 = r28
            r6 = 0
            goto L_0x0197
        L_0x020c:
            java.lang.String r0 = "Invalid NAL length"
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x0214:
            r21 = r5
            r18 = r8
            r5 = 6
            boolean r8 = r0.N0
            if (r8 == 0) goto L_0x0252
            l8b r8 = r0.x
            r8.D(r2)
            byte[] r2 = r8.a
            int r5 = r0.M0
            r22 = r4
            r4 = r1
            hf4 r4 = (defpackage.hf4) r4
            r23 = r14
            r14 = 0
            r4.j(r2, r14, r5, r14)
            int r2 = r0.M0
            r11.b(r8, r2, r14)
            int r2 = r0.M0
            byte[] r4 = r8.a
            int r5 = r8.c
            int r4 = defpackage.b0h.P(r5, r4)
            java.lang.String r5 = r13.n
            boolean r5 = r6.equals(r5)
            r8.G(r5)
            r8.F(r4)
            zpf[] r4 = r0.Q0
            defpackage.q8.e(r9, r8, r4)
            goto L_0x025b
        L_0x0252:
            r22 = r4
            r23 = r14
            r4 = 0
            int r2 = r11.c(r1, r2, r4)
        L_0x025b:
            int r4 = r0.L0
            int r4 = r4 + r2
            r0.L0 = r4
            int r4 = r0.M0
            int r4 = r4 - r2
            r0.M0 = r4
            r8 = r18
            r5 = r21
            r4 = r22
            r14 = r23
            goto L_0x0208
        L_0x026e:
            r28 = r13
            goto L_0x0285
        L_0x0271:
            r28 = r13
        L_0x0273:
            int r2 = r0.L0
            int r4 = r0.K0
            if (r2 >= r4) goto L_0x0285
            int r4 = r4 - r2
            r2 = 0
            int r4 = r11.c(r1, r4, r2)
            int r2 = r0.L0
            int r2 = r2 + r4
            r0.L0 = r2
            goto L_0x0273
        L_0x0285:
            boolean r1 = r3.l
            if (r1 != 0) goto L_0x0292
            bqf r1 = r3.d
            int[] r1 = r1.g
            int r2 = r3.f
            r1 = r1[r2]
            goto L_0x029d
        L_0x0292:
            boolean[] r1 = r7.i
            int r2 = r3.f
            boolean r1 = r1[r2]
            if (r1 == 0) goto L_0x029c
            r1 = 1
            goto L_0x029d
        L_0x029c:
            r1 = 0
        L_0x029d:
            ppf r2 = r3.a()
            if (r2 == 0) goto L_0x02a6
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 | r2
        L_0x02a6:
            r24 = r1
            ppf r1 = r3.a()
            if (r1 == 0) goto L_0x02b3
            xpf r1 = r1.c
            r27 = r1
            goto L_0x02b5
        L_0x02b3:
            r27 = 0
        L_0x02b5:
            int r1 = r0.K0
            r26 = 0
            r21 = r11
            r22 = r9
            r25 = r1
            r21.a(r22, r24, r25, r26, r27)
        L_0x02c2:
            boolean r1 = r12.isEmpty()
            if (r1 != 0) goto L_0x0303
            java.lang.Object r1 = r12.removeFirst()
            rd6 r1 = (defpackage.rd6) r1
            int r2 = r0.F0
            int r4 = r1.c
            int r2 = r2 - r4
            r0.F0 = r2
            boolean r2 = r1.b
            long r4 = r1.a
            if (r2 == 0) goto L_0x02dc
            long r4 = r4 + r9
        L_0x02dc:
            r2 = r28
            if (r28 == 0) goto L_0x02e4
            long r4 = r2.a(r4)
        L_0x02e4:
            zpf[] r6 = r0.P0
            int r7 = r6.length
            r8 = 0
        L_0x02e8:
            if (r8 >= r7) goto L_0x0300
            r21 = r6[r8]
            int r11 = r0.F0
            r27 = 0
            r24 = 1
            int r13 = r1.c
            r22 = r4
            r25 = r13
            r26 = r11
            r21.a(r22, r24, r25, r26, r27)
            r11 = 1
            int r8 = r8 + r11
            goto L_0x02e8
        L_0x0300:
            r28 = r2
            goto L_0x02c2
        L_0x0303:
            boolean r1 = r3.b()
            if (r1 != 0) goto L_0x030c
            r1 = 0
            r0.J0 = r1
        L_0x030c:
            r1 = 3
            r0.z0 = r1
            r0 = 0
        L_0x0310:
            return r0
        L_0x0311:
            int r2 = r5.size()
            r3 = 0
            r4 = 0
        L_0x0317:
            if (r4 >= r2) goto L_0x0335
            java.lang.Object r6 = r5.valueAt(r4)
            td6 r6 = (defpackage.td6) r6
            qpf r6 = r6.b
            boolean r9 = r6.l
            if (r9 == 0) goto L_0x0332
            long r9 = r6.b
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x0332
            java.lang.Object r3 = r5.valueAt(r4)
            td6 r3 = (defpackage.td6) r3
            r7 = r9
        L_0x0332:
            r6 = 1
            int r4 = r4 + r6
            goto L_0x0317
        L_0x0335:
            if (r3 != 0) goto L_0x033c
            r2 = 3
            r0.z0 = r2
            goto L_0x0004
        L_0x033c:
            r2 = r1
            hf4 r2 = (defpackage.hf4) r2
            long r4 = r2.o
            long r7 = r7 - r4
            int r2 = (int) r7
            if (r2 < 0) goto L_0x0360
            r4 = r1
            hf4 r4 = (defpackage.hf4) r4
            r4.z(r2)
            qpf r2 = r3.b
            java.lang.Object r3 = r2.q
            l8b r3 = (defpackage.l8b) r3
            byte[] r5 = r3.a
            int r6 = r3.c
            r7 = 0
            r4.j(r5, r7, r6, r7)
            r3.G(r7)
            r2.l = r7
            goto L_0x0004
        L_0x0360:
            java.lang.String r0 = "Offset to encryption data was negative."
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x0368:
            r2 = r13
            long r5 = r0.B0
            int r3 = (int) r5
            int r5 = r0.C0
            int r3 = r3 - r5
            l8b r5 = r0.D0
            if (r5 == 0) goto L_0x05a9
            byte[] r6 = r5.a
            r9 = r1
            hf4 r9 = (defpackage.hf4) r9
            r10 = 0
            r11 = 8
            r9.j(r6, r11, r3, r10)
            sy r3 = new sy
            int r6 = r0.A0
            r3.<init>(r6, r5)
            r9 = r1
            hf4 r9 = (defpackage.hf4) r9
            long r9 = r9.o
            boolean r11 = r4.isEmpty()
            if (r11 != 0) goto L_0x039d
            java.lang.Object r2 = r4.peek()
            qy r2 = (defpackage.qy) r2
            java.util.ArrayList r2 = r2.o
            r2.add(r3)
            goto L_0x05af
        L_0x039d:
            if (r6 != r8) goto L_0x045f
            r3 = 8
            r5.G(r3)
            int r2 = r5.g()
            int r2 = defpackage.ty.y(r2)
            r3 = 4
            r5.H(r3)
            long r3 = r5.w()
            if (r2 != 0) goto L_0x03c0
            long r6 = r5.w()
            long r11 = r5.w()
        L_0x03be:
            long r11 = r11 + r9
            goto L_0x03c9
        L_0x03c0:
            long r6 = r5.z()
            long r11 = r5.z()
            goto L_0x03be
        L_0x03c9:
            int r2 = defpackage.v0g.a
            java.math.RoundingMode r27 = java.math.RoundingMode.FLOOR
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r21 = r6
            r25 = r3
            long r8 = defpackage.v0g.a0(r21, r23, r25, r27)
            r2 = 2
            r5.H(r2)
            int r2 = r5.A()
            int[] r10 = new int[r2]
            long[] r13 = new long[r2]
            long[] r14 = new long[r2]
            long[] r15 = new long[r2]
            r21 = r8
            r18 = r11
            r11 = r6
            r6 = 0
        L_0x03ee:
            if (r6 >= r2) goto L_0x043a
            int r7 = r5.g()
            r23 = -2147483648(0xffffffff80000000, float:-0.0)
            r23 = r7 & r23
            if (r23 != 0) goto L_0x0432
            long r23 = r5.w()
            r25 = 2147483647(0x7fffffff, float:NaN)
            r7 = r7 & r25
            r10[r6] = r7
            r13[r6] = r18
            r15[r6] = r21
            long r11 = r11 + r23
            java.math.RoundingMode r27 = java.math.RoundingMode.FLOOR
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r21 = r11
            r25 = r3
            long r21 = defpackage.v0g.a0(r21, r23, r25, r27)
            r23 = r15[r6]
            long r23 = r21 - r23
            r14[r6] = r23
            r7 = 4
            r5.H(r7)
            r7 = r10[r6]
            r31 = r2
            r23 = r3
            long r2 = (long) r7
            long r18 = r18 + r2
            r2 = 1
            int r6 = r6 + r2
            r2 = r31
            r3 = r23
            goto L_0x03ee
        L_0x0432:
            java.lang.String r0 = "Unhandled indirect reference"
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x043a:
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            p03 r3 = new p03
            r3.<init>(r10, r13, r14, r15)
            android.util.Pair r2 = android.util.Pair.create(r2, r3)
            java.lang.Object r3 = r2.first
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r0.I0 = r3
            xf5 r3 = r0.O0
            java.lang.Object r2 = r2.second
            snd r2 = (defpackage.snd) r2
            r3.M(r2)
            r2 = 1
            r0.R0 = r2
            goto L_0x05af
        L_0x045f:
            if (r6 != r7) goto L_0x05af
            zpf[] r3 = r0.P0
            int r3 = r3.length
            if (r3 != 0) goto L_0x0468
            goto L_0x05af
        L_0x0468:
            r3 = 8
            r5.G(r3)
            int r3 = r5.g()
            int r3 = defpackage.ty.y(r3)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L_0x04c5
            r4 = 1
            if (r3 == r4) goto L_0x0486
            java.lang.String r2 = "Skipping unsupported emsg version: "
            defpackage.i2a.m(r3, r2)
            goto L_0x05af
        L_0x0486:
            long r3 = r5.w()
            long r17 = r5.z()
            java.math.RoundingMode r8 = java.math.RoundingMode.FLOOR
            r19 = 1000000(0xf4240, double:4.940656E-318)
            r21 = r3
            r23 = r8
            long r9 = defpackage.v0g.a0(r17, r19, r21, r23)
            long r17 = r5.w()
            r19 = 1000(0x3e8, double:4.94E-321)
            r21 = r3
            r23 = r8
            long r3 = defpackage.v0g.a0(r17, r19, r21, r23)
            long r13 = r5.w()
            java.lang.String r8 = r5.p()
            r8.getClass()
            java.lang.String r11 = r5.p()
            r11.getClass()
            r22 = r3
            r20 = r8
            r21 = r11
            r24 = r13
            r13 = r6
            goto L_0x050e
        L_0x04c5:
            java.lang.String r8 = r5.p()
            r8.getClass()
            java.lang.String r11 = r5.p()
            r11.getClass()
            long r3 = r5.w()
            long r17 = r5.w()
            java.math.RoundingMode r9 = java.math.RoundingMode.FLOOR
            r19 = 1000000(0xf4240, double:4.940656E-318)
            r21 = r3
            r23 = r9
            long r13 = defpackage.v0g.a0(r17, r19, r21, r23)
            r31 = r11
            long r10 = r0.I0
            int r15 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r15 == 0) goto L_0x04f2
            long r10 = r10 + r13
            goto L_0x04f3
        L_0x04f2:
            r10 = r6
        L_0x04f3:
            long r17 = r5.w()
            r19 = 1000(0x3e8, double:4.94E-321)
            r21 = r3
            r23 = r9
            long r3 = defpackage.v0g.a0(r17, r19, r21, r23)
            long r17 = r5.w()
            r21 = r31
            r22 = r3
            r20 = r8
            r9 = r10
            r24 = r17
        L_0x050e:
            int r3 = r5.a()
            byte[] r3 = new byte[r3]
            int r4 = r5.a()
            r8 = 0
            r5.e(r8, r3, r4)
            c95 r4 = new c95
            r19 = r4
            r26 = r3
            r19.<init>(r20, r21, r22, r24, r26)
            l8b r3 = new l8b
            fj r5 = r0.Y
            byte[] r4 = r5.p(r4)
            r3.<init>((byte[]) r4)
            int r4 = r3.a()
            zpf[] r5 = r0.P0
            int r8 = r5.length
            r11 = 0
        L_0x0538:
            if (r11 >= r8) goto L_0x054b
            r15 = r5[r11]
            r6 = 0
            r3.G(r6)
            r15.b(r3, r4, r6)
            r6 = 1
            int r11 = r11 + r6
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0538
        L_0x054b:
            r15 = r6
            r6 = 1
            int r3 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r3 != 0) goto L_0x055f
            rd6 r2 = new rd6
            r2.<init>(r4, r13, r6)
            r12.addLast(r2)
            int r2 = r0.F0
            int r2 = r2 + r4
            r0.F0 = r2
            goto L_0x05af
        L_0x055f:
            boolean r3 = r12.isEmpty()
            if (r3 != 0) goto L_0x0574
            rd6 r2 = new rd6
            r3 = 0
            r2.<init>(r4, r9, r3)
            r12.addLast(r2)
            int r2 = r0.F0
            int r2 = r2 + r4
            r0.F0 = r2
            goto L_0x05af
        L_0x0574:
            r3 = 0
            if (r2 == 0) goto L_0x058b
            boolean r5 = r2.e()
            if (r5 != 0) goto L_0x058b
            rd6 r2 = new rd6
            r2.<init>(r4, r9, r3)
            r12.addLast(r2)
            int r2 = r0.F0
            int r2 = r2 + r4
            r0.F0 = r2
            goto L_0x05af
        L_0x058b:
            if (r2 == 0) goto L_0x0591
            long r9 = r2.a(r9)
        L_0x0591:
            zpf[] r2 = r0.P0
            int r3 = r2.length
            r6 = 0
        L_0x0595:
            if (r6 >= r3) goto L_0x05af
            r17 = r2[r6]
            r23 = 0
            r20 = 1
            r22 = 0
            r18 = r9
            r21 = r4
            r17.a(r18, r20, r21, r22, r23)
            r5 = 1
            int r6 = r6 + r5
            goto L_0x0595
        L_0x05a9:
            r2 = r1
            hf4 r2 = (defpackage.hf4) r2
            r2.z(r3)
        L_0x05af:
            r2 = r1
            hf4 r2 = (defpackage.hf4) r2
            long r2 = r2.o
            r0.c(r2)
            goto L_0x0004
        L_0x05b9:
            int r2 = r0.C0
            l8b r3 = r0.Z
            if (r2 != 0) goto L_0x05e1
            byte[] r2 = r3.a
            r6 = r1
            hf4 r6 = (defpackage.hf4) r6
            r9 = 0
            r10 = 8
            r11 = 1
            boolean r2 = r6.j(r2, r9, r10, r11)
            if (r2 != 0) goto L_0x05d0
            r0 = -1
            return r0
        L_0x05d0:
            r0.C0 = r10
            r3.G(r9)
            long r9 = r3.w()
            r0.B0 = r9
            int r2 = r3.g()
            r0.A0 = r2
        L_0x05e1:
            long r9 = r0.B0
            r11 = 1
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0600
            byte[] r2 = r3.a
            r6 = r1
            hf4 r6 = (defpackage.hf4) r6
            r9 = 0
            r10 = 8
            r6.j(r2, r10, r10, r9)
            int r2 = r0.C0
            int r2 = r2 + r10
            r0.C0 = r2
            long r9 = r3.z()
            r0.B0 = r9
            goto L_0x062f
        L_0x0600:
            r11 = 0
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x062f
            r2 = r1
            hf4 r2 = (defpackage.hf4) r2
            long r9 = r2.c
            r11 = -1
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x061f
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L_0x061f
            java.lang.Object r2 = r4.peek()
            qy r2 = (defpackage.qy) r2
            long r9 = r2.c
        L_0x061f:
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x062f
            r2 = r1
            hf4 r2 = (defpackage.hf4) r2
            long r11 = r2.o
            long r9 = r9 - r11
            int r2 = r0.C0
            long r11 = (long) r2
            long r9 = r9 + r11
            r0.B0 = r9
        L_0x062f:
            long r9 = r0.B0
            int r2 = r0.C0
            long r11 = (long) r2
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 < 0) goto L_0x07b3
            r6 = r1
            hf4 r6 = (defpackage.hf4) r6
            long r9 = r6.o
            long r11 = (long) r2
            long r9 = r9 - r11
            int r2 = r0.A0
            r6 = 1835295092(0x6d646174, float:4.4175247E27)
            r11 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r2 == r11) goto L_0x064b
            if (r2 != r6) goto L_0x065e
        L_0x064b:
            boolean r2 = r0.R0
            if (r2 != 0) goto L_0x065e
            xf5 r2 = r0.O0
            me0 r12 = new me0
            long r13 = r0.H0
            r12.<init>(r13, r9)
            r2.M(r12)
            r2 = 1
            r0.R0 = r2
        L_0x065e:
            int r2 = r0.A0
            if (r2 != r11) goto L_0x067b
            int r2 = r5.size()
            r12 = 0
        L_0x0667:
            if (r12 >= r2) goto L_0x067b
            java.lang.Object r13 = r5.valueAt(r12)
            td6 r13 = (defpackage.td6) r13
            qpf r13 = r13.b
            r13.getClass()
            r13.b = r9
            r13.a = r9
            r13 = 1
            int r12 = r12 + r13
            goto L_0x0667
        L_0x067b:
            int r2 = r0.A0
            if (r2 != r6) goto L_0x068d
            r5 = 0
            r0.J0 = r5
            long r2 = r0.B0
            long r9 = r9 + r2
            r0.E0 = r9
            r2 = 2
            r0.z0 = r2
            r3 = 1
            goto L_0x07b0
        L_0x068d:
            r5 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r2 == r5) goto L_0x06b7
            r5 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 == r5) goto L_0x06b7
            r5 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r2 == r5) goto L_0x06b7
            r5 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r2 == r5) goto L_0x06b7
            r5 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r2 == r5) goto L_0x06b7
            if (r2 == r11) goto L_0x06b7
            r5 = 1953653094(0x74726166, float:7.6813435E31)
            if (r2 == r5) goto L_0x06b7
            r5 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r2 == r5) goto L_0x06b7
            r5 = 1701082227(0x65647473, float:6.742798E22)
            if (r2 != r5) goto L_0x06ba
        L_0x06b7:
            r3 = 1
            goto L_0x078b
        L_0x06ba:
            r4 = 1751411826(0x68646c72, float:4.3148E24)
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r2 == r4) goto L_0x0759
            r4 = 1835296868(0x6d646864, float:4.418049E27)
            if (r2 == r4) goto L_0x0759
            r4 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r2 == r4) goto L_0x0759
            if (r2 == r8) goto L_0x0759
            r4 = 1937011556(0x73747364, float:1.9367383E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1937011827(0x73747473, float:1.9367711E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1668576371(0x63747473, float:4.5093966E21)
            if (r2 == r4) goto L_0x0759
            r4 = 1937011555(0x73747363, float:1.9367382E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1937011578(0x7374737a, float:1.936741E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r2 == r4) goto L_0x0759
            r4 = 1937011571(0x73747373, float:1.9367401E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1952867444(0x74666474, float:7.3014264E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1952868452(0x74666864, float:7.301914E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1953654136(0x74726578, float:7.6818474E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1953658222(0x7472756e, float:7.683823E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1886614376(0x70737368, float:3.013775E29)
            if (r2 == r4) goto L_0x0759
            r4 = 1935763834(0x7361697a, float:1.785898E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1970628964(0x75756964, float:3.1109627E32)
            if (r2 == r4) goto L_0x0759
            r4 = 1935828848(0x73626770, float:1.7937577E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1936158820(0x73677064, float:1.8336489E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r2 == r4) goto L_0x0759
            r4 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r2 == r4) goto L_0x0759
            if (r2 != r7) goto L_0x0744
            goto L_0x0759
        L_0x0744:
            long r2 = r0.B0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0752
            r2 = 0
            r0.D0 = r2
            r2 = 1
            r0.z0 = r2
            r3 = r2
            goto L_0x07b0
        L_0x0752:
            java.lang.String r0 = "Skipping atom with length > 2147483647 (unsupported)."
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.c(r0)
            throw r0
        L_0x0759:
            int r2 = r0.C0
            r4 = 8
            if (r2 != r4) goto L_0x0784
            long r7 = r0.B0
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x077d
            l8b r2 = new l8b
            long r4 = r0.B0
            int r4 = (int) r4
            r2.<init>((int) r4)
            byte[] r3 = r3.a
            byte[] r4 = r2.a
            r5 = 0
            r6 = 8
            java.lang.System.arraycopy(r3, r5, r4, r5, r6)
            r0.D0 = r2
            r3 = 1
            r0.z0 = r3
            goto L_0x07b0
        L_0x077d:
            java.lang.String r0 = "Leaf atom with length > 2147483647 (unsupported)."
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.c(r0)
            throw r0
        L_0x0784:
            java.lang.String r0 = "Leaf atom defines extended atom size (unsupported)."
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.c(r0)
            throw r0
        L_0x078b:
            r5 = r1
            hf4 r5 = (defpackage.hf4) r5
            long r5 = r5.o
            long r7 = r0.B0
            long r5 = r5 + r7
            r7 = 8
            long r5 = r5 - r7
            qy r7 = new qy
            r7.<init>(r2, r5)
            r4.push(r7)
            long r7 = r0.B0
            int r2 = r0.C0
            long r9 = (long) r2
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x07ab
            r0.c(r5)
            goto L_0x07b0
        L_0x07ab:
            r2 = 0
            r0.z0 = r2
            r0.C0 = r2
        L_0x07b0:
            r2 = r3
            goto L_0x0005
        L_0x07b3:
            java.lang.String r0 = "Atom size less than header length (unsupported)."
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd6.g(vf5, yl4):int");
    }

    public final boolean n(vf5 vf5) {
        k0d k0d;
        ife g0 = j4b.g0(vf5, true, false);
        if (g0 != null) {
            k0d = tb7.t(g0);
        } else {
            lx5 lx5 = tb7.b;
            k0d = k0d.v;
        }
        this.y0 = k0d;
        return g0 == null;
    }

    public final List o() {
        return this.y0;
    }

    public final void release() {
    }

    public vd6(gze gze, int i, rkf rkf, List list, zpf zpf) {
        this.a = gze;
        this.b = i;
        this.X = rkf;
        this.c = Collections.unmodifiableList(list);
        this.x0 = zpf;
        this.Y = new fj(10, (byte) 0);
        this.Z = new l8b(16);
        this.v = new l8b(b0h.b);
        this.w = new l8b(5);
        this.x = new l8b();
        byte[] bArr = new byte[16];
        this.y = bArr;
        this.z = new l8b(bArr);
        this.v0 = new ArrayDeque();
        this.w0 = new ArrayDeque();
        this.o = new SparseArray();
        lx5 lx5 = tb7.b;
        this.y0 = k0d.v;
        this.H0 = -9223372036854775807L;
        this.G0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        this.O0 = xf5.u;
        this.P0 = new zpf[0];
        this.Q0 = new zpf[0];
    }
}
