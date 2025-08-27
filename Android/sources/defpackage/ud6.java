package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.apache.http.HttpStatus;

/* renamed from: ud6  reason: default package */
public final class ud6 implements sf5 {
    public static final byte[] H = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final ca6 I;
    public int A;
    public int B;
    public boolean C;
    public wf5 D;
    public ypf[] E;
    public ypf[] F;
    public boolean G;
    public final int a;
    public final List b;
    public final SparseArray c;
    public final g1g d = new g1g(vzg.b);
    public final g1g e = new g1g(5);
    public final g1g f = new g1g(3, false);
    public final byte[] g;
    public final g1g h;
    public final qkf i;
    public final dm4 j = new dm4(12);
    public final g1g k = new g1g(16);
    public final ArrayDeque l;
    public final ArrayDeque m;
    public final ypf n;
    public int o;
    public int p;
    public long q;
    public int r;
    public g1g s;
    public long t;
    public int u;
    public long v;
    public long w;
    public long x;
    public sd6 y;
    public int z;

    static {
        aa6 aa6 = new aa6();
        aa6.k = "application/x-emsg";
        I = aa6.a();
    }

    public ud6(int i2, qkf qkf, List list, ypf ypf) {
        this.a = i2;
        this.i = qkf;
        this.b = Collections.unmodifiableList(list);
        this.n = ypf;
        byte[] bArr = new byte[16];
        this.g = bArr;
        this.h = new g1g(bArr);
        this.l = new ArrayDeque();
        this.m = new ArrayDeque();
        this.c = new SparseArray();
        this.w = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.D = wf5.t;
        this.E = new ypf[0];
        this.F = new ypf[0];
    }

    public static xv4 a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            ry ryVar = (ry) arrayList.get(i2);
            if (ryVar.b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = ryVar.c.a;
                z9c O = ld9.O(bArr);
                UUID uuid = O == null ? null : O.a;
                if (uuid != null) {
                    arrayList2.add(new vv4(uuid, (String) null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new xv4((String) null, false, (vv4[]) arrayList2.toArray(new vv4[0]));
    }

    public static void b(g1g g1g, int i2, qpf qpf) {
        g1g.H(i2 + 8);
        int h2 = g1g.h();
        if ((h2 & 1) == 0) {
            boolean z2 = (h2 & 2) != 0;
            int y2 = g1g.y();
            if (y2 == 0) {
                Arrays.fill(qpf.k, 0, qpf.d, false);
                return;
            }
            int i3 = qpf.d;
            if (y2 == i3) {
                Arrays.fill(qpf.k, 0, y2, z2);
                int c2 = g1g.c();
                g1g g1g2 = (g1g) qpf.q;
                g1g2.E(c2);
                qpf.j = true;
                qpf.l = true;
                g1g.g(0, g1g2.a, g1g2.c);
                g1g2.H(0);
                qpf.l = false;
                return;
            }
            StringBuilder sb = new StringBuilder(80);
            sb.append("Senc sample count ");
            sb.append(y2);
            sb.append(" is different from fragment sample count");
            sb.append(i3);
            throw ParserException.a(sb.toString(), (RuntimeException) null);
        }
        throw ParserException.c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: zh4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(long r51) {
        /*
            r50 = this;
            r0 = r50
            r5 = 1
        L_0x0003:
            java.util.ArrayDeque r6 = r0.l
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x07be
            java.lang.Object r7 = r6.peek()
            py r7 = (defpackage.py) r7
            long r9 = r7.c
            int r7 = (r9 > r51 ? 1 : (r9 == r51 ? 0 : -1))
            if (r7 != 0) goto L_0x07be
            java.lang.Object r7 = r6.pop()
            r9 = r7
            py r9 = (defpackage.py) r9
            int r7 = r9.b
            android.util.SparseArray r15 = r0.c
            java.util.ArrayList r10 = r9.o
            r11 = 1836019574(0x6d6f6f76, float:4.631354E27)
            int r12 = r0.a
            r13 = 12
            if (r7 != r11) goto L_0x018a
            xv4 r6 = a(r10)
            r7 = 1836475768(0x6d766578, float:4.7659988E27)
            py r7 = r9.z(r7)
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
            ry r1 = (defpackage.ry) r1
            int r8 = r1.b
            r2 = 1953654136(0x74726578, float:7.6818474E31)
            g1g r1 = r1.c
            if (r8 != r2) goto L_0x0096
            r1.H(r13)
            int r2 = r1.h()
            int r8 = r1.h()
            int r8 = r8 - r5
            int r13 = r1.h()
            int r5 = r1.h()
            int r1 = r1.h()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r19 = r7
            zh4 r7 = new zh4
            r7.<init>(r8, r13, r5, r1)
            android.util.Pair r1 = android.util.Pair.create(r2, r7)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r1 = r1.second
            zh4 r1 = (defpackage.zh4) r1
            r14.put(r2, r1)
            goto L_0x00b7
        L_0x0096:
            r19 = r7
            r2 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r8 != r2) goto L_0x00b7
            r2 = 8
            r1.H(r2)
            int r2 = r1.h()
            int r2 = defpackage.ty.x(r2)
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
            lp6 r10 = new lp6
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
            r5 = 13
            r2.<init>((int) r5, (java.lang.Object) r0)
            r5 = 0
            r11 = r3
            r13 = r6
            r3 = r14
            r14 = r1
            r1 = r15
            r15 = r5
            r16 = r2
            java.util.ArrayList r2 = defpackage.az.e(r9, r10, r11, r13, r14, r15, r16)
            int r4 = r2.size()
            int r5 = r1.size()
            if (r5 != 0) goto L_0x0134
            r5 = 0
        L_0x00ec:
            if (r5 >= r4) goto L_0x012e
            java.lang.Object r6 = r2.get(r5)
            aqf r6 = (defpackage.aqf) r6
            kpf r7 = r6.a
            sd6 r8 = new sd6
            wf5 r9 = r0.D
            int r10 = r7.b
            ypf r9 = r9.B(r5, r10)
            int r10 = r3.size()
            int r11 = r7.a
            r12 = 1
            if (r10 != r12) goto L_0x0111
            r10 = 0
            java.lang.Object r12 = r3.valueAt(r10)
            zh4 r12 = (defpackage.zh4) r12
            goto L_0x011b
        L_0x0111:
            java.lang.Object r10 = r3.get(r11)
            r12 = r10
            zh4 r12 = (defpackage.zh4) r12
            r12.getClass()
        L_0x011b:
            r8.<init>(r9, r6, r12)
            r1.put(r11, r8)
            long r8 = r0.w
            long r6 = r7.e
            long r6 = java.lang.Math.max(r8, r6)
            r0.w = r6
            r6 = 1
            int r5 = r5 + r6
            goto L_0x00ec
        L_0x012e:
            wf5 r1 = r0.D
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
            defpackage.y64.j(r5)
            r5 = 0
        L_0x0141:
            if (r5 >= r4) goto L_0x0180
            java.lang.Object r6 = r2.get(r5)
            aqf r6 = (defpackage.aqf) r6
            kpf r7 = r6.a
            int r8 = r7.a
            java.lang.Object r8 = r1.get(r8)
            sd6 r8 = (defpackage.sd6) r8
            int r9 = r3.size()
            r10 = 1
            if (r9 != r10) goto L_0x0162
            r9 = 0
            java.lang.Object r7 = r3.valueAt(r9)
            zh4 r7 = (defpackage.zh4) r7
            goto L_0x016d
        L_0x0162:
            int r7 = r7.a
            java.lang.Object r7 = r3.get(r7)
            zh4 r7 = (defpackage.zh4) r7
            r7.getClass()
        L_0x016d:
            r8.d = r6
            r8.e = r7
            kpf r6 = r6.a
            ca6 r6 = r6.f
            ypf r7 = r8.a
            r7.d(r6)
            r8.d()
            r6 = 1
            int r5 = r5 + r6
            goto L_0x0141
        L_0x0180:
            r4 = r0
            r2 = 8
            r7 = 16
            r11 = 1
            r14 = 4
            r15 = 2
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
            py r8 = (defpackage.py) r8
            int r9 = r8.b
            r11 = 1953653094(0x74726166, float:7.6813435E31)
            if (r9 != r11) goto L_0x06db
            r9 = 1952868452(0x74666864, float:7.301914E31)
            ry r9 = r8.A(r9)
            r9.getClass()
            g1g r9 = r9.c
            r11 = 8
            r9.H(r11)
            int r11 = r9.h()
            int r13 = r9.h()
            java.lang.Object r13 = r1.get(r13)
            sd6 r13 = (defpackage.sd6) r13
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
            zh4 r3 = r13.e
            r4 = 2
            r15 = r11 & 2
            if (r15 == 0) goto L_0x01e8
            int r4 = r9.h()
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
            int r15 = r9.h()
        L_0x01f3:
            r17 = 16
            goto L_0x01f9
        L_0x01f6:
            int r15 = r3.b
            goto L_0x01f3
        L_0x01f9:
            r20 = r11 & 16
            if (r20 == 0) goto L_0x0204
            int r20 = r9.h()
            r7 = r20
            goto L_0x0206
        L_0x0204:
            int r7 = r3.c
        L_0x0206:
            r11 = r11 & 32
            if (r11 == 0) goto L_0x020f
            int r3 = r9.h()
            goto L_0x0211
        L_0x020f:
            int r3 = r3.d
        L_0x0211:
            zh4 r9 = new zh4
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
            ry r9 = r8.A(r9)
            if (r9 == 0) goto L_0x0255
            r11 = 2
            r18 = r12 & 2
            if (r18 != 0) goto L_0x0255
            g1g r4 = r9.c
            r9 = 8
            r4.H(r9)
            int r9 = r4.h()
            int r9 = defpackage.ty.x(r9)
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
            ry r2 = (defpackage.ry) r2
            r21 = r5
            int r5 = r2.b
            if (r5 != r15) goto L_0x0288
            g1g r2 = r2.c
            r5 = 12
            r2.H(r5)
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
            if (r2 >= r7) goto L_0x049c
            java.lang.Object r11 = r4.get(r2)
            ry r11 = (defpackage.ry) r11
            int r14 = r11.b
            if (r14 != r15) goto L_0x0470
            r14 = 1
            int r25 = r5 + 1
            g1g r11 = r11.c
            r14 = 8
            r11.H(r14)
            int r14 = r11.h()
            aqf r15 = r13.d
            kpf r15 = r15.a
            r26 = r7
            java.lang.Object r7 = r3.o
            zh4 r7 = (defpackage.zh4) r7
            int r27 = defpackage.t0g.a
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
            int r10 = r11.h()
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
            int r8 = r11.h()
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
            if (r14 == 0) goto L_0x0363
            r33 = r8
            int r8 = r14.length
            r34 = r6
            r6 = 1
            if (r8 != r6) goto L_0x0367
            r6 = 0
            r35 = r14[r6]
            int r8 = (r35 > r23 ? 1 : (r35 == r23 ? 0 : -1))
            if (r8 != 0) goto L_0x0367
            long[] r8 = r15.i
            r23 = r8[r6]
            goto L_0x0367
        L_0x0363:
            r34 = r6
            r33 = r8
        L_0x0367:
            int[] r6 = r3.g
            long[] r8 = r3.h
            boolean[] r14 = r3.i
            int r0 = r15.b
            r35 = r4
            r4 = 2
            if (r0 != r4) goto L_0x037b
            r0 = 1
            r4 = r31 & 1
            if (r4 == 0) goto L_0x037b
            r0 = 1
            goto L_0x037c
        L_0x037b:
            r0 = 0
        L_0x037c:
            int[] r4 = r3.f
            r4 = r4[r5]
            int r4 = r29 + r4
            r36 = r6
            long r5 = r3.m
            r37 = r2
            r2 = r29
        L_0x038a:
            if (r2 >= r4) goto L_0x0464
            if (r9 == 0) goto L_0x0399
            int r29 = r11.h()
            r38 = r4
            r39 = r9
            r4 = r29
            goto L_0x039f
        L_0x0399:
            r38 = r4
            int r4 = r7.b
            r39 = r9
        L_0x039f:
            java.lang.String r9 = "Unexpected negative value: "
            r29 = r9
            if (r4 < 0) goto L_0x044b
            if (r10 == 0) goto L_0x03ae
            int r40 = r11.h()
            r9 = r40
            goto L_0x03b0
        L_0x03ae:
            int r9 = r7.c
        L_0x03b0:
            if (r9 < 0) goto L_0x0432
            if (r12 == 0) goto L_0x03bb
            int r29 = r11.h()
            r41 = r1
            goto L_0x03ca
        L_0x03bb:
            if (r2 != 0) goto L_0x03c4
            if (r1 == 0) goto L_0x03c4
            r41 = r1
            r29 = r33
            goto L_0x03ca
        L_0x03c4:
            r41 = r1
            int r1 = r7.d
            r29 = r1
        L_0x03ca:
            if (r13 == 0) goto L_0x03d5
            int r1 = r11.h()
            r43 = r10
            r42 = r11
            goto L_0x03da
        L_0x03d5:
            r43 = r10
            r42 = r11
            r1 = 0
        L_0x03da:
            long r10 = (long) r1
            long r10 = r10 + r5
            long r44 = r10 - r23
            r46 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r15.c
            r48 = r10
            long r10 = defpackage.t0g.J(r44, r46, r48)
            r8[r2] = r10
            boolean r1 = r3.n
            if (r1 != 0) goto L_0x03ff
            r1 = r32
            r32 = r7
            aqf r7 = r1.d
            r44 = r12
            r45 = r13
            long r12 = r7.h
            long r10 = r10 + r12
            r8[r2] = r10
            goto L_0x0407
        L_0x03ff:
            r44 = r12
            r45 = r13
            r1 = r32
            r32 = r7
        L_0x0407:
            r36[r2] = r9
            r7 = 16
            int r9 = r29 >> 16
            r7 = 1
            r9 = r9 & r7
            if (r9 != 0) goto L_0x0417
            if (r0 == 0) goto L_0x0415
            if (r2 != 0) goto L_0x0417
        L_0x0415:
            r7 = 1
            goto L_0x0418
        L_0x0417:
            r7 = 0
        L_0x0418:
            r14[r2] = r7
            long r9 = (long) r4
            long r5 = r5 + r9
            r4 = 1
            int r2 = r2 + r4
            r7 = r32
            r4 = r38
            r9 = r39
            r11 = r42
            r10 = r43
            r12 = r44
            r13 = r45
            r32 = r1
            r1 = r41
            goto L_0x038a
        L_0x0432:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 38
            r0.<init>(r1)
            r2 = r29
            r0.append(r2)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            r3 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r3)
            throw r0
        L_0x044b:
            r2 = r29
            r1 = 38
            r3 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r3)
            throw r0
        L_0x0464:
            r38 = r4
            r1 = r32
            r3.m = r5
            r5 = r25
            r9 = r38
        L_0x046e:
            r0 = 1
            goto L_0x0484
        L_0x0470:
            r27 = r1
            r37 = r2
            r35 = r4
            r34 = r6
            r26 = r7
            r28 = r8
            r29 = r9
            r30 = r10
            r31 = r12
            r1 = r13
            goto L_0x046e
        L_0x0484:
            int r2 = r37 + 1
            r0 = r50
            r13 = r1
            r7 = r26
            r1 = r27
            r8 = r28
            r10 = r30
            r12 = r31
            r6 = r34
            r4 = r35
            r15 = 1953658222(0x7472756e, float:7.683823E31)
            goto L_0x02c7
        L_0x049c:
            r27 = r1
            r35 = r4
            r34 = r6
            r28 = r8
            r30 = r10
            r31 = r12
            r1 = r13
            aqf r0 = r1.d
            kpf r0 = r0.a
            java.lang.Object r1 = r3.o
            zh4 r1 = (defpackage.zh4) r1
            r1.getClass()
            opf[] r0 = r0.k
            if (r0 != 0) goto L_0x04ba
            r0 = 0
            goto L_0x04be
        L_0x04ba:
            int r1 = r1.a
            r0 = r0[r1]
        L_0x04be:
            r1 = 1935763834(0x7361697a, float:1.785898E31)
            r8 = r28
            ry r1 = r8.A(r1)
            if (r1 == 0) goto L_0x0549
            r0.getClass()
            g1g r1 = r1.c
            r2 = 8
            r1.H(r2)
            int r4 = r1.h()
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x04de
            r1.I(r2)
        L_0x04de:
            int r2 = r1.v()
            int r4 = r1.y()
            int r5 = r3.d
            if (r4 > r5) goto L_0x0528
            int r5 = r0.d
            if (r2 != 0) goto L_0x0505
            boolean[] r2 = r3.k
            r6 = 0
            r7 = 0
        L_0x04f2:
            if (r6 >= r4) goto L_0x0503
            int r9 = r1.v()
            int r7 = r7 + r9
            if (r9 <= r5) goto L_0x04fd
            r9 = 1
            goto L_0x04fe
        L_0x04fd:
            r9 = 0
        L_0x04fe:
            r2[r6] = r9
            r9 = 1
            int r6 = r6 + r9
            goto L_0x04f2
        L_0x0503:
            r5 = 0
            goto L_0x0512
        L_0x0505:
            if (r2 <= r5) goto L_0x0509
            r1 = 1
            goto L_0x050a
        L_0x0509:
            r1 = 0
        L_0x050a:
            int r7 = r2 * r4
            boolean[] r2 = r3.k
            r5 = 0
            java.util.Arrays.fill(r2, r5, r4, r1)
        L_0x0512:
            boolean[] r1 = r3.k
            int r2 = r3.d
            java.util.Arrays.fill(r1, r4, r2, r5)
            if (r7 <= 0) goto L_0x0549
            java.lang.Object r1 = r3.q
            g1g r1 = (defpackage.g1g) r1
            r1.E(r7)
            r1 = 1
            r3.j = r1
            r3.l = r1
            goto L_0x0549
        L_0x0528:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 78
            r0.<init>(r1)
            java.lang.String r1 = "Saiz sample count "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " is greater than fragment sample count"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x0549:
            r1 = 1935763823(0x7361696f, float:1.7858967E31)
            ry r1 = r8.A(r1)
            if (r1 == 0) goto L_0x057f
            g1g r1 = r1.c
            r2 = 8
            r1.H(r2)
            int r4 = r1.h()
            r5 = 1
            r6 = r4 & 1
            if (r6 != r5) goto L_0x0565
            r1.I(r2)
        L_0x0565:
            int r2 = r1.y()
            if (r2 != r5) goto L_0x0581
            int r2 = defpackage.ty.x(r4)
            long r4 = r3.b
            if (r2 != 0) goto L_0x0578
            long r1 = r1.w()
            goto L_0x057c
        L_0x0578:
            long r1 = r1.z()
        L_0x057c:
            long r4 = r4 + r1
            r3.b = r4
        L_0x057f:
            r1 = 0
            goto L_0x059a
        L_0x0581:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 40
            r0.<init>(r1)
            java.lang.String r1 = "Unexpected saio entry count: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x059a:
            r2 = 1936027235(0x73656e63, float:1.8177412E31)
            ry r2 = r8.A(r2)
            if (r2 == 0) goto L_0x05a9
            g1g r2 = r2.c
            r4 = 0
            b(r2, r4, r3)
        L_0x05a9:
            if (r0 == 0) goto L_0x05af
            java.lang.String r0 = r0.b
            r6 = r0
            goto L_0x05b0
        L_0x05af:
            r6 = r1
        L_0x05b0:
            r0 = r1
            r2 = r0
            r4 = 0
        L_0x05b3:
            int r5 = r35.size()
            if (r4 >= r5) goto L_0x05f1
            r12 = r35
            java.lang.Object r5 = r12.get(r4)
            ry r5 = (defpackage.ry) r5
            g1g r7 = r5.c
            r8 = 1935828848(0x73626770, float:1.7937577E31)
            r9 = 1936025959(0x73656967, float:1.817587E31)
            int r5 = r5.b
            if (r5 != r8) goto L_0x05db
            r13 = 12
            r7.H(r13)
            int r5 = r7.h()
            if (r5 != r9) goto L_0x05d9
            r0 = r7
        L_0x05d9:
            r5 = 1
            goto L_0x05ed
        L_0x05db:
            r13 = 12
            r8 = 1936158820(0x73677064, float:1.8336489E31)
            if (r5 != r8) goto L_0x05d9
            r7.H(r13)
            int r5 = r7.h()
            if (r5 != r9) goto L_0x05d9
            r2 = r7
            goto L_0x05d9
        L_0x05ed:
            int r4 = r4 + r5
            r35 = r12
            goto L_0x05b3
        L_0x05f1:
            r12 = r35
            r5 = 1
            r13 = 12
            if (r0 == 0) goto L_0x05fa
            if (r2 != 0) goto L_0x05fe
        L_0x05fa:
            r14 = 4
            r15 = 2
            goto L_0x0697
        L_0x05fe:
            r4 = 8
            r0.H(r4)
            int r7 = r0.h()
            int r7 = defpackage.ty.x(r7)
            r14 = 4
            r0.I(r14)
            if (r7 != r5) goto L_0x0614
            r0.I(r14)
        L_0x0614:
            int r0 = r0.h()
            if (r0 != r5) goto L_0x0690
            r2.H(r4)
            int r0 = r2.h()
            int r0 = defpackage.ty.x(r0)
            r2.I(r14)
            if (r0 != r5) goto L_0x063b
            long r4 = r2.w()
            int r0 = (r4 > r23 ? 1 : (r4 == r23 ? 0 : -1))
            if (r0 == 0) goto L_0x0634
            r15 = 2
            goto L_0x0641
        L_0x0634:
            java.lang.String r0 = "Variable length description in sgpd found (unsupported)"
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.c(r0)
            throw r0
        L_0x063b:
            r15 = 2
            if (r0 < r15) goto L_0x0641
            r2.I(r14)
        L_0x0641:
            long r4 = r2.w()
            r7 = 1
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0689
            r0 = 1
            r2.I(r0)
            int r4 = r2.v()
            r5 = r4 & 240(0xf0, float:3.36E-43)
            int r9 = r5 >> 4
            r10 = r4 & 15
            int r4 = r2.v()
            if (r4 != r0) goto L_0x0661
            r5 = 1
            goto L_0x0662
        L_0x0661:
            r5 = 0
        L_0x0662:
            if (r5 != 0) goto L_0x0665
            goto L_0x0697
        L_0x0665:
            int r7 = r2.v()
            r0 = 16
            byte[] r8 = new byte[r0]
            r4 = 0
            r2.g(r4, r8, r0)
            if (r7 != 0) goto L_0x067c
            int r0 = r2.v()
            byte[] r1 = new byte[r0]
            r2.g(r4, r1, r0)
        L_0x067c:
            r11 = r1
            r0 = 1
            r3.j = r0
            opf r0 = new opf
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r3.p = r0
            goto L_0x0697
        L_0x0689:
            java.lang.String r0 = "Entry count in sgpd != 1 (unsupported)."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.c(r0)
            throw r0
        L_0x0690:
            java.lang.String r0 = "Entry count in sbgp != 1 (unsupported)."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.c(r0)
            throw r0
        L_0x0697:
            int r0 = r12.size()
            r10 = 0
        L_0x069c:
            if (r10 >= r0) goto L_0x06d3
            java.lang.Object r1 = r12.get(r10)
            ry r1 = (defpackage.ry) r1
            int r2 = r1.b
            r4 = 1970628964(0x75756964, float:3.1109627E32)
            if (r2 != r4) goto L_0x06ca
            g1g r1 = r1.c
            r2 = 8
            r1.H(r2)
            r4 = r50
            byte[] r5 = r4.g
            r6 = 0
            r7 = 16
            r1.g(r6, r5, r7)
            byte[] r6 = H
            boolean r5 = java.util.Arrays.equals(r5, r6)
            if (r5 != 0) goto L_0x06c5
            goto L_0x06c8
        L_0x06c5:
            b(r1, r7, r3)
        L_0x06c8:
            r1 = 1
            goto L_0x06d1
        L_0x06ca:
            r2 = 8
            r7 = 16
            r4 = r50
            goto L_0x06c8
        L_0x06d1:
            int r10 = r10 + r1
            goto L_0x069c
        L_0x06d3:
            r1 = 1
            r2 = 8
            r7 = 16
            r4 = r50
            goto L_0x06f1
        L_0x06db:
            r4 = r0
            r27 = r1
            r22 = r2
            r21 = r5
            r34 = r6
            r30 = r10
            r31 = r12
            r1 = 1
            r2 = 8
            r7 = 16
            r13 = 12
            r14 = 4
            r15 = 2
        L_0x06f1:
            int r6 = r34 + 1
            r0 = r4
            r5 = r21
            r2 = r22
            r1 = r27
            r10 = r30
            r12 = r31
            goto L_0x0197
        L_0x0700:
            r4 = r0
            r27 = r1
            r30 = r10
            r1 = 0
            r2 = 8
            r7 = 16
            r14 = 4
            r15 = 2
            xv4 r0 = a(r30)
            if (r0 == 0) goto L_0x075c
            int r3 = r27.size()
            r10 = 0
        L_0x0717:
            if (r10 >= r3) goto L_0x075c
            r5 = r27
            java.lang.Object r6 = r5.valueAt(r10)
            sd6 r6 = (defpackage.sd6) r6
            aqf r8 = r6.d
            kpf r8 = r8.a
            qpf r9 = r6.b
            java.lang.Object r9 = r9.o
            zh4 r9 = (defpackage.zh4) r9
            int r11 = defpackage.t0g.a
            int r9 = r9.a
            opf[] r8 = r8.k
            if (r8 != 0) goto L_0x0735
            r8 = r1
            goto L_0x0737
        L_0x0735:
            r8 = r8[r9]
        L_0x0737:
            if (r8 == 0) goto L_0x073c
            java.lang.String r8 = r8.b
            goto L_0x073d
        L_0x073c:
            r8 = r1
        L_0x073d:
            xv4 r8 = r0.a(r8)
            aqf r9 = r6.d
            kpf r9 = r9.a
            ca6 r9 = r9.f
            aa6 r9 = r9.a()
            r9.n = r8
            ca6 r8 = new ca6
            r8.<init>(r9)
            ypf r6 = r6.a
            r6.d(r8)
            r6 = 1
            int r10 = r10 + r6
            r27 = r5
            goto L_0x0717
        L_0x075c:
            r5 = r27
            long r0 = r4.v
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x079f
            int r0 = r5.size()
            r8 = 0
        L_0x076e:
            if (r8 >= r0) goto L_0x0796
            java.lang.Object r1 = r5.valueAt(r8)
            sd6 r1 = (defpackage.sd6) r1
            long r9 = r4.v
            int r3 = r1.f
        L_0x077a:
            qpf r6 = r1.b
            int r11 = r6.d
            if (r3 >= r11) goto L_0x0793
            long[] r11 = r6.h
            r11 = r11[r3]
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x0793
            boolean[] r6 = r6.i
            boolean r6 = r6[r3]
            if (r6 == 0) goto L_0x0790
            r1.i = r3
        L_0x0790:
            r11 = 1
            int r3 = r3 + r11
            goto L_0x077a
        L_0x0793:
            r11 = 1
            int r8 = r8 + r11
            goto L_0x076e
        L_0x0796:
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11 = 1
            r4.v = r8
            goto L_0x07ba
        L_0x079f:
            r11 = 1
            goto L_0x07ba
        L_0x07a1:
            r4 = r0
            r2 = 8
            r7 = 16
            r11 = 1
            r14 = 4
            r15 = 2
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x07ba
            java.lang.Object r0 = r6.peek()
            py r0 = (defpackage.py) r0
            java.util.ArrayList r0 = r0.v
            r0.add(r9)
        L_0x07ba:
            r0 = r4
            r5 = r11
            goto L_0x0003
        L_0x07be:
            r4 = r0
            r0 = 0
            r4.o = r0
            r4.r = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ud6.c(long):void");
    }

    public final void d(long j2, long j3) {
        SparseArray sparseArray = this.c;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((sd6) sparseArray.valueAt(i2)).d();
        }
        this.m.clear();
        this.u = 0;
        this.v = j3;
        this.l.clear();
        this.o = 0;
        this.r = 0;
    }

    public final void g(wf5 wf5) {
        int i2;
        this.D = wf5;
        int i3 = 0;
        this.o = 0;
        this.r = 0;
        ypf[] ypfArr = new ypf[2];
        this.E = ypfArr;
        ypf ypf = this.n;
        if (ypf != null) {
            ypfArr[0] = ypf;
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i4 = 100;
        if ((this.a & 4) != 0) {
            ypfArr[i2] = wf5.B(100, 5);
            i4 = HttpStatus.SC_SWITCHING_PROTOCOLS;
            i2++;
        }
        ypf[] ypfArr2 = (ypf[]) t0g.F(i2, this.E);
        this.E = ypfArr2;
        for (ypf d2 : ypfArr2) {
            d2.d(I);
        }
        List list = this.b;
        this.F = new ypf[list.size()];
        while (i3 < this.F.length) {
            ypf B2 = this.D.B(i4, 3);
            B2.d((ca6) list.get(i3));
            this.F[i3] = B2;
            i3++;
            i4++;
        }
    }

    public final boolean h(uf5 uf5) {
        return i8b.R(uf5, true, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: sd6} */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e2, code lost:
        if ((r13 & 31) != 6) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01f4, code lost:
        if (((r13 & 126) >> 1) == 39) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01f6, code lost:
        r4 = true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(defpackage.uf5 r36, defpackage.yl4 r37) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
        L_0x0004:
            int r2 = r0.o
            java.util.ArrayDeque r3 = r0.l
            android.util.SparseArray r4 = r0.c
            r5 = 0
            r6 = 1
            r7 = 1701671783(0x656d7367, float:7.0083103E22)
            r8 = 1936286840(0x73696478, float:1.8491255E31)
            r10 = 0
            r11 = 2
            if (r2 == 0) goto L_0x058f
            java.util.ArrayDeque r12 = r0.m
            qkf r13 = r0.i
            if (r2 == r6) goto L_0x0371
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == r11) goto L_0x031a
            sd6 r2 = r0.y
            if (r2 != 0) goto L_0x00b3
            int r2 = r4.size()
            r15 = r7
            r7 = r10
            r8 = r5
        L_0x002e:
            if (r8 >= r2) goto L_0x006c
            java.lang.Object r17 = r4.valueAt(r8)
            r11 = r17
            sd6 r11 = (defpackage.sd6) r11
            boolean r14 = r11.l
            if (r14 != 0) goto L_0x0044
            int r9 = r11.f
            aqf r6 = r11.d
            int r6 = r6.b
            if (r9 == r6) goto L_0x0067
        L_0x0044:
            qpf r6 = r11.b
            if (r14 == 0) goto L_0x004f
            int r9 = r11.h
            int r3 = r6.c
            if (r9 != r3) goto L_0x004f
            goto L_0x0067
        L_0x004f:
            if (r14 != 0) goto L_0x005a
            aqf r3 = r11.d
            long[] r3 = r3.c
            int r6 = r11.f
            r20 = r3[r6]
            goto L_0x0060
        L_0x005a:
            long[] r3 = r6.e
            int r6 = r11.h
            r20 = r3[r6]
        L_0x0060:
            int r3 = (r20 > r15 ? 1 : (r20 == r15 ? 0 : -1))
            if (r3 >= 0) goto L_0x0067
            r7 = r11
            r15 = r20
        L_0x0067:
            int r8 = r8 + 1
            r6 = 1
            r11 = 2
            goto L_0x002e
        L_0x006c:
            if (r7 != 0) goto L_0x008b
            long r2 = r0.t
            r4 = r1
            gf4 r4 = (defpackage.gf4) r4
            long r6 = r4.o
            long r2 = r2 - r6
            int r2 = (int) r2
            if (r2 < 0) goto L_0x0084
            r3 = r1
            gf4 r3 = (defpackage.gf4) r3
            r3.z(r2)
            r0.o = r5
            r0.r = r5
            goto L_0x0004
        L_0x0084:
            java.lang.String r0 = "Offset to end of mdat was negative."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r10)
            throw r0
        L_0x008b:
            boolean r2 = r7.l
            if (r2 != 0) goto L_0x0098
            aqf r2 = r7.d
            long[] r2 = r2.c
            int r3 = r7.f
            r2 = r2[r3]
            goto L_0x00a0
        L_0x0098:
            qpf r2 = r7.b
            long[] r2 = r2.e
            int r3 = r7.h
            r2 = r2[r3]
        L_0x00a0:
            r4 = r1
            gf4 r4 = (defpackage.gf4) r4
            long r8 = r4.o
            long r2 = r2 - r8
            int r2 = (int) r2
            if (r2 >= 0) goto L_0x00aa
            r2 = r5
        L_0x00aa:
            r3 = r1
            gf4 r3 = (defpackage.gf4) r3
            r3.z(r2)
            r0.y = r7
            r2 = r7
        L_0x00b3:
            int r3 = r0.o
            r4 = 6
            qpf r6 = r2.b
            r7 = 3
            if (r3 != r7) goto L_0x0162
            boolean r3 = r2.l
            if (r3 != 0) goto L_0x00c8
            aqf r3 = r2.d
            int[] r3 = r3.d
            int r7 = r2.f
            r3 = r3[r7]
            goto L_0x00ce
        L_0x00c8:
            int[] r3 = r6.g
            int r7 = r2.f
            r3 = r3[r7]
        L_0x00ce:
            r0.z = r3
            int r7 = r2.f
            int r8 = r2.i
            if (r7 >= r8) goto L_0x010f
            gf4 r1 = (defpackage.gf4) r1
            r1.z(r3)
            opf r1 = r2.a()
            if (r1 != 0) goto L_0x00e2
            goto L_0x0101
        L_0x00e2:
            java.lang.Object r3 = r6.q
            g1g r3 = (defpackage.g1g) r3
            int r1 = r1.d
            if (r1 == 0) goto L_0x00ed
            r3.I(r1)
        L_0x00ed:
            int r1 = r2.f
            boolean r7 = r6.j
            if (r7 == 0) goto L_0x0101
            boolean[] r6 = r6.k
            boolean r1 = r6[r1]
            if (r1 == 0) goto L_0x0101
            int r1 = r3.A()
            int r1 = r1 * r4
            r3.I(r1)
        L_0x0101:
            boolean r1 = r2.b()
            if (r1 != 0) goto L_0x0109
            r0.y = r10
        L_0x0109:
            r1 = 3
            r0.o = r1
            r0 = r5
            goto L_0x0319
        L_0x010f:
            aqf r7 = r2.d
            kpf r7 = r7.a
            int r7 = r7.g
            r8 = 1
            if (r7 != r8) goto L_0x0123
            r7 = 8
            int r3 = r3 - r7
            r0.z = r3
            r3 = r1
            gf4 r3 = (defpackage.gf4) r3
            r3.z(r7)
        L_0x0123:
            aqf r3 = r2.d
            kpf r3 = r3.a
            ca6 r3 = r3.f
            java.lang.String r3 = r3.Z
            java.lang.String r7 = "audio/ac4"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x014e
            int r3 = r0.z
            r7 = 7
            int r3 = r2.c(r3, r7)
            r0.A = r3
            int r3 = r0.z
            g1g r8 = r0.h
            defpackage.kv0.v(r3, r8)
            ypf r3 = r2.a
            r3.c(r7, r8)
            int r3 = r0.A
            int r3 = r3 + r7
            r0.A = r3
            goto L_0x0156
        L_0x014e:
            int r3 = r0.z
            int r3 = r2.c(r3, r5)
            r0.A = r3
        L_0x0156:
            int r3 = r0.z
            int r7 = r0.A
            int r3 = r3 + r7
            r0.z = r3
            r3 = 4
            r0.o = r3
            r0.B = r5
        L_0x0162:
            aqf r3 = r2.d
            kpf r7 = r3.a
            boolean r8 = r2.l
            if (r8 != 0) goto L_0x0171
            long[] r3 = r3.f
            int r8 = r2.f
            r8 = r3[r8]
            goto L_0x0177
        L_0x0171:
            int r3 = r2.f
            long[] r8 = r6.h
            r8 = r8[r3]
        L_0x0177:
            if (r13 == 0) goto L_0x017d
            long r8 = r13.a(r8)
        L_0x017d:
            int r3 = r7.j
            ypf r11 = r2.a
            if (r3 == 0) goto L_0x0277
            g1g r14 = r0.e
            byte[] r15 = r14.a
            r15[r5] = r5
            r16 = 1
            r15[r16] = r5
            r16 = 2
            r15[r16] = r5
            int r10 = r3 + 1
            r17 = 4
            int r3 = 4 - r3
        L_0x0197:
            int r4 = r0.A
            int r5 = r0.z
            if (r4 >= r5) goto L_0x0274
            int r4 = r0.B
            java.lang.String r5 = "video/hevc"
            r27 = r13
            ca6 r13 = r7.f
            if (r4 != 0) goto L_0x0219
            r4 = r1
            gf4 r4 = (defpackage.gf4) r4
            r18 = r7
            r7 = 0
            r4.j(r15, r3, r10, r7)
            r14.H(r7)
            int r4 = r14.h()
            r7 = 1
            if (r4 < r7) goto L_0x0211
            int r4 = r4 + -1
            r0.B = r4
            g1g r4 = r0.d
            r7 = 0
            r4.H(r7)
            r7 = 4
            r11.c(r7, r4)
            r4 = 1
            r11.c(r4, r14)
            ypf[] r4 = r0.F
            int r4 = r4.length
            if (r4 <= 0) goto L_0x01f8
            java.lang.String r4 = r13.Z
            byte r13 = r15[r7]
            java.lang.String r7 = "video/avc"
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x01e5
            r7 = r13 & 31
            r20 = r10
            r10 = 6
            if (r7 == r10) goto L_0x01f6
            goto L_0x01e8
        L_0x01e5:
            r20 = r10
            r10 = 6
        L_0x01e8:
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x01fb
            r4 = r13 & 126(0x7e, float:1.77E-43)
            r5 = 1
            int r4 = r4 >> r5
            r5 = 39
            if (r4 != r5) goto L_0x01fb
        L_0x01f6:
            r4 = 1
            goto L_0x01fc
        L_0x01f8:
            r20 = r10
            r10 = 6
        L_0x01fb:
            r4 = 0
        L_0x01fc:
            r0.C = r4
            int r4 = r0.A
            int r4 = r4 + 5
            r0.A = r4
            int r4 = r0.z
            int r4 = r4 + r3
            r0.z = r4
            r7 = r18
            r10 = r20
        L_0x020d:
            r13 = r27
            r5 = 0
            goto L_0x0197
        L_0x0211:
            java.lang.String r0 = "Invalid NAL length"
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x0219:
            r18 = r7
            r20 = r10
            r10 = 6
            boolean r7 = r0.C
            if (r7 == 0) goto L_0x0257
            g1g r7 = r0.f
            r7.E(r4)
            byte[] r4 = r7.a
            int r10 = r0.B
            r21 = r3
            r3 = r1
            gf4 r3 = (defpackage.gf4) r3
            r22 = r14
            r14 = 0
            r3.j(r4, r14, r10, r14)
            int r3 = r0.B
            r11.c(r3, r7)
            int r3 = r0.B
            byte[] r4 = r7.a
            int r10 = r7.c
            int r4 = defpackage.vzg.K(r10, r4)
            java.lang.String r10 = r13.Z
            boolean r5 = r5.equals(r10)
            r7.H(r5)
            r7.G(r4)
            ypf[] r4 = r0.F
            defpackage.b0h.m(r8, r7, r4)
            goto L_0x0261
        L_0x0257:
            r21 = r3
            r22 = r14
            r3 = 0
            int r4 = r11.a(r1, r4, r3)
            r3 = r4
        L_0x0261:
            int r4 = r0.A
            int r4 = r4 + r3
            r0.A = r4
            int r4 = r0.B
            int r4 = r4 - r3
            r0.B = r4
            r7 = r18
            r10 = r20
            r3 = r21
            r14 = r22
            goto L_0x020d
        L_0x0274:
            r27 = r13
            goto L_0x028b
        L_0x0277:
            r27 = r13
        L_0x0279:
            int r3 = r0.A
            int r4 = r0.z
            if (r3 >= r4) goto L_0x028b
            int r4 = r4 - r3
            r3 = 0
            int r4 = r11.a(r1, r4, r3)
            int r3 = r0.A
            int r3 = r3 + r4
            r0.A = r3
            goto L_0x0279
        L_0x028b:
            boolean r1 = r2.l
            if (r1 != 0) goto L_0x0298
            aqf r1 = r2.d
            int[] r1 = r1.g
            int r3 = r2.f
            r6 = r1[r3]
            goto L_0x02a3
        L_0x0298:
            boolean[] r1 = r6.i
            int r3 = r2.f
            boolean r1 = r1[r3]
            if (r1 == 0) goto L_0x02a2
            r6 = 1
            goto L_0x02a3
        L_0x02a2:
            r6 = 0
        L_0x02a3:
            opf r1 = r2.a()
            if (r1 == 0) goto L_0x02af
            r1 = 1073741824(0x40000000, float:2.0)
            r1 = r1 | r6
            r23 = r1
            goto L_0x02b1
        L_0x02af:
            r23 = r6
        L_0x02b1:
            opf r1 = r2.a()
            if (r1 == 0) goto L_0x02bc
            wpf r1 = r1.c
            r26 = r1
            goto L_0x02be
        L_0x02bc:
            r26 = 0
        L_0x02be:
            int r1 = r0.z
            r25 = 0
            r20 = r11
            r21 = r8
            r24 = r1
            r20.b(r21, r23, r24, r25, r26)
        L_0x02cb:
            boolean r1 = r12.isEmpty()
            if (r1 != 0) goto L_0x030c
            java.lang.Object r1 = r12.removeFirst()
            qd6 r1 = (defpackage.qd6) r1
            int r3 = r0.u
            int r4 = r1.c
            int r3 = r3 - r4
            r0.u = r3
            boolean r3 = r1.b
            long r4 = r1.a
            if (r3 == 0) goto L_0x02e5
            long r4 = r4 + r8
        L_0x02e5:
            r6 = r27
            if (r27 == 0) goto L_0x02ed
            long r4 = r6.a(r4)
        L_0x02ed:
            ypf[] r3 = r0.E
            int r7 = r3.length
            r10 = 0
        L_0x02f1:
            if (r10 >= r7) goto L_0x0309
            r20 = r3[r10]
            int r11 = r0.u
            r26 = 0
            r23 = 1
            int r13 = r1.c
            r21 = r4
            r24 = r13
            r25 = r11
            r20.b(r21, r23, r24, r25, r26)
            int r10 = r10 + 1
            goto L_0x02f1
        L_0x0309:
            r27 = r6
            goto L_0x02cb
        L_0x030c:
            boolean r1 = r2.b()
            if (r1 != 0) goto L_0x0315
            r1 = 0
            r0.y = r1
        L_0x0315:
            r1 = 3
            r0.o = r1
            r0 = 0
        L_0x0319:
            return r0
        L_0x031a:
            int r2 = r4.size()
            r3 = 0
            r5 = 0
        L_0x0320:
            if (r5 >= r2) goto L_0x033e
            java.lang.Object r6 = r4.valueAt(r5)
            sd6 r6 = (defpackage.sd6) r6
            qpf r6 = r6.b
            boolean r9 = r6.l
            if (r9 == 0) goto L_0x033b
            long r9 = r6.b
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x033b
            java.lang.Object r3 = r4.valueAt(r5)
            sd6 r3 = (defpackage.sd6) r3
            r7 = r9
        L_0x033b:
            int r5 = r5 + 1
            goto L_0x0320
        L_0x033e:
            if (r3 != 0) goto L_0x0345
            r2 = 3
            r0.o = r2
            goto L_0x0004
        L_0x0345:
            r2 = r1
            gf4 r2 = (defpackage.gf4) r2
            long r4 = r2.o
            long r7 = r7 - r4
            int r2 = (int) r7
            if (r2 < 0) goto L_0x0369
            r4 = r1
            gf4 r4 = (defpackage.gf4) r4
            r4.z(r2)
            qpf r2 = r3.b
            java.lang.Object r3 = r2.q
            g1g r3 = (defpackage.g1g) r3
            byte[] r5 = r3.a
            int r6 = r3.c
            r7 = 0
            r4.j(r5, r7, r6, r7)
            r3.H(r7)
            r2.l = r7
            goto L_0x0004
        L_0x0369:
            java.lang.String r0 = "Offset to encryption data was negative."
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x0371:
            r6 = r13
            long r4 = r0.q
            int r2 = (int) r4
            int r4 = r0.r
            int r2 = r2 - r4
            g1g r4 = r0.s
            if (r4 == 0) goto L_0x057f
            byte[] r5 = r4.a
            r9 = r1
            gf4 r9 = (defpackage.gf4) r9
            r10 = 0
            r11 = 8
            r9.j(r5, r11, r2, r10)
            ry r2 = new ry
            int r5 = r0.p
            r2.<init>(r5, r4)
            r9 = r1
            gf4 r9 = (defpackage.gf4) r9
            long r9 = r9.o
            boolean r11 = r3.isEmpty()
            if (r11 != 0) goto L_0x03a6
            java.lang.Object r3 = r3.peek()
            py r3 = (defpackage.py) r3
            java.util.ArrayList r3 = r3.o
            r3.add(r2)
            goto L_0x0585
        L_0x03a6:
            if (r5 != r8) goto L_0x045d
            r2 = 8
            r4.H(r2)
            int r2 = r4.h()
            int r2 = defpackage.ty.x(r2)
            r3 = 4
            r4.I(r3)
            long r5 = r4.w()
            if (r2 != 0) goto L_0x03c9
            long r2 = r4.w()
            long r7 = r4.w()
        L_0x03c7:
            long r7 = r7 + r9
            goto L_0x03d2
        L_0x03c9:
            long r2 = r4.z()
            long r7 = r4.z()
            goto L_0x03c7
        L_0x03d2:
            r21 = 1000000(0xf4240, double:4.940656E-318)
            r19 = r2
            r23 = r5
            long r9 = defpackage.t0g.J(r19, r21, r23)
            r11 = 2
            r4.I(r11)
            int r11 = r4.A()
            int[] r12 = new int[r11]
            long[] r13 = new long[r11]
            long[] r14 = new long[r11]
            long[] r15 = new long[r11]
            r25 = r7
            r19 = r9
            r7 = 0
        L_0x03f2:
            if (r7 >= r11) goto L_0x0438
            int r8 = r4.h()
            r18 = -2147483648(0xffffffff80000000, float:-0.0)
            r18 = r8 & r18
            if (r18 != 0) goto L_0x0430
            long r21 = r4.w()
            r18 = 2147483647(0x7fffffff, float:NaN)
            r8 = r8 & r18
            r12[r7] = r8
            r13[r7] = r25
            r15[r7] = r19
            long r2 = r2 + r21
            r21 = 1000000(0xf4240, double:4.940656E-318)
            r19 = r2
            r23 = r5
            long r19 = defpackage.t0g.J(r19, r21, r23)
            r21 = r15[r7]
            long r21 = r19 - r21
            r14[r7] = r21
            r8 = 4
            r4.I(r8)
            r8 = r12[r7]
            r21 = r2
            long r2 = (long) r8
            long r25 = r25 + r2
            int r7 = r7 + 1
            r2 = r21
            goto L_0x03f2
        L_0x0430:
            java.lang.String r0 = "Unhandled indirect reference"
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x0438:
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            o03 r3 = new o03
            r3.<init>(r12, r13, r14, r15)
            android.util.Pair r2 = android.util.Pair.create(r2, r3)
            java.lang.Object r3 = r2.first
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r0.x = r3
            wf5 r3 = r0.D
            java.lang.Object r2 = r2.second
            rnd r2 = (defpackage.rnd) r2
            r3.K(r2)
            r2 = 1
            r0.G = r2
            goto L_0x0585
        L_0x045d:
            if (r5 != r7) goto L_0x0585
            ypf[] r2 = r0.E
            int r2 = r2.length
            if (r2 != 0) goto L_0x0466
            goto L_0x0585
        L_0x0466:
            r2 = 8
            r4.H(r2)
            int r2 = r4.h()
            int r2 = defpackage.ty.x(r2)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x04b6
            r3 = 1
            if (r2 == r3) goto L_0x047f
            goto L_0x0585
        L_0x047f:
            long r2 = r4.w()
            long r13 = r4.z()
            r15 = 1000000(0xf4240, double:4.940656E-318)
            r17 = r2
            long r9 = defpackage.t0g.J(r13, r15, r17)
            long r13 = r4.w()
            r15 = 1000(0x3e8, double:4.94E-321)
            long r2 = defpackage.t0g.J(r13, r15, r17)
            long r13 = r4.w()
            java.lang.String r5 = r4.q()
            r5.getClass()
            java.lang.String r11 = r4.q()
            r11.getClass()
            r30 = r2
            r28 = r5
            r2 = r7
            r29 = r11
            r32 = r13
            goto L_0x04fc
        L_0x04b6:
            java.lang.String r5 = r4.q()
            r5.getClass()
            java.lang.String r11 = r4.q()
            r11.getClass()
            long r2 = r4.w()
            long r13 = r4.w()
            r15 = 1000000(0xf4240, double:4.940656E-318)
            r17 = r2
            long r9 = defpackage.t0g.J(r13, r15, r17)
            long r13 = r0.x
            int r15 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r15 == 0) goto L_0x04df
            long r13 = r13 + r9
            r19 = r13
            goto L_0x04e1
        L_0x04df:
            r19 = r7
        L_0x04e1:
            long r13 = r4.w()
            r15 = 1000(0x3e8, double:4.94E-321)
            r17 = r2
            long r2 = defpackage.t0g.J(r13, r15, r17)
            long r13 = r4.w()
            r30 = r2
            r28 = r5
            r2 = r9
            r29 = r11
            r32 = r13
            r9 = r19
        L_0x04fc:
            int r5 = r4.c()
            byte[] r5 = new byte[r5]
            int r11 = r4.c()
            r13 = 0
            r4.g(r13, r5, r11)
            b95 r4 = new b95
            r27 = r4
            r34 = r5
            r27.<init>(r28, r29, r30, r32, r34)
            g1g r5 = new g1g
            dm4 r11 = r0.j
            byte[] r4 = r11.l(r4)
            r5.<init>((byte[]) r4)
            int r4 = r5.c()
            ypf[] r11 = r0.E
            int r13 = r11.length
            r14 = 0
        L_0x0526:
            if (r14 >= r13) goto L_0x0539
            r15 = r11[r14]
            r7 = 0
            r5.H(r7)
            r15.c(r4, r5)
            int r14 = r14 + 1
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0526
        L_0x0539:
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x054c
            qd6 r5 = new qd6
            r6 = 1
            r5.<init>(r4, r2, r6)
            r12.addLast(r5)
            int r2 = r0.u
            int r2 = r2 + r4
            r0.u = r2
            goto L_0x0585
        L_0x054c:
            boolean r2 = r12.isEmpty()
            if (r2 != 0) goto L_0x0561
            qd6 r2 = new qd6
            r3 = 0
            r2.<init>(r4, r9, r3)
            r12.addLast(r2)
            int r2 = r0.u
            int r2 = r2 + r4
            r0.u = r2
            goto L_0x0585
        L_0x0561:
            if (r6 == 0) goto L_0x0567
            long r9 = r6.a(r9)
        L_0x0567:
            ypf[] r2 = r0.E
            int r3 = r2.length
            r5 = 0
        L_0x056b:
            if (r5 >= r3) goto L_0x0585
            r19 = r2[r5]
            r25 = 0
            r22 = 1
            r24 = 0
            r20 = r9
            r23 = r4
            r19.b(r20, r22, r23, r24, r25)
            int r5 = r5 + 1
            goto L_0x056b
        L_0x057f:
            r3 = r1
            gf4 r3 = (defpackage.gf4) r3
            r3.z(r2)
        L_0x0585:
            r2 = r1
            gf4 r2 = (defpackage.gf4) r2
            long r2 = r2.o
            r0.c(r2)
            goto L_0x0004
        L_0x058f:
            int r2 = r0.r
            g1g r5 = r0.k
            if (r2 != 0) goto L_0x05b7
            byte[] r2 = r5.a
            r6 = r1
            gf4 r6 = (defpackage.gf4) r6
            r9 = 0
            r10 = 1
            r11 = 8
            boolean r2 = r6.j(r2, r9, r11, r10)
            if (r2 != 0) goto L_0x05a6
            r0 = -1
            return r0
        L_0x05a6:
            r0.r = r11
            r5.H(r9)
            long r9 = r5.w()
            r0.q = r9
            int r2 = r5.h()
            r0.p = r2
        L_0x05b7:
            long r9 = r0.q
            r11 = 1
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x05d6
            byte[] r2 = r5.a
            r6 = r1
            gf4 r6 = (defpackage.gf4) r6
            r9 = 0
            r10 = 8
            r6.j(r2, r10, r10, r9)
            int r2 = r0.r
            int r2 = r2 + r10
            r0.r = r2
            long r9 = r5.z()
            r0.q = r9
            goto L_0x0605
        L_0x05d6:
            r11 = 0
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0605
            r2 = r1
            gf4 r2 = (defpackage.gf4) r2
            long r9 = r2.c
            r11 = -1
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x05f5
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x05f5
            java.lang.Object r2 = r3.peek()
            py r2 = (defpackage.py) r2
            long r9 = r2.c
        L_0x05f5:
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x0605
            r2 = r1
            gf4 r2 = (defpackage.gf4) r2
            long r11 = r2.o
            long r9 = r9 - r11
            int r2 = r0.r
            long r11 = (long) r2
            long r9 = r9 + r11
            r0.q = r9
        L_0x0605:
            long r9 = r0.q
            int r2 = r0.r
            long r11 = (long) r2
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 < 0) goto L_0x0786
            r6 = r1
            gf4 r6 = (defpackage.gf4) r6
            long r9 = r6.o
            long r11 = (long) r2
            long r9 = r9 - r11
            int r2 = r0.p
            r6 = 1835295092(0x6d646174, float:4.4175247E27)
            r11 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r2 == r11) goto L_0x0621
            if (r2 != r6) goto L_0x0634
        L_0x0621:
            boolean r2 = r0.G
            if (r2 != 0) goto L_0x0634
            wf5 r2 = r0.D
            tq5 r12 = new tq5
            long r13 = r0.w
            r12.<init>((long) r13, (long) r9)
            r2.K(r12)
            r2 = 1
            r0.G = r2
        L_0x0634:
            int r2 = r0.p
            if (r2 != r11) goto L_0x0651
            int r2 = r4.size()
            r12 = 0
        L_0x063d:
            if (r12 >= r2) goto L_0x0651
            java.lang.Object r13 = r4.valueAt(r12)
            sd6 r13 = (defpackage.sd6) r13
            qpf r13 = r13.b
            r13.getClass()
            r13.b = r9
            r13.a = r9
            int r12 = r12 + 1
            goto L_0x063d
        L_0x0651:
            int r2 = r0.p
            if (r2 != r6) goto L_0x0662
            r4 = 0
            r0.y = r4
            long r2 = r0.q
            long r9 = r9 + r2
            r0.t = r9
            r2 = 2
            r0.o = r2
            goto L_0x0004
        L_0x0662:
            r4 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r2 == r4) goto L_0x075e
            r4 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 == r4) goto L_0x075e
            r4 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r2 == r4) goto L_0x075e
            r4 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r2 == r4) goto L_0x075e
            r4 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r2 == r4) goto L_0x075e
            if (r2 == r11) goto L_0x075e
            r4 = 1953653094(0x74726166, float:7.6813435E31)
            if (r2 == r4) goto L_0x075e
            r4 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r2 == r4) goto L_0x075e
            r4 = 1701082227(0x65647473, float:6.742798E22)
            if (r2 != r4) goto L_0x068e
            goto L_0x075e
        L_0x068e:
            r3 = 1751411826(0x68646c72, float:4.3148E24)
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r2 == r3) goto L_0x072d
            r3 = 1835296868(0x6d646864, float:4.418049E27)
            if (r2 == r3) goto L_0x072d
            r3 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r2 == r3) goto L_0x072d
            if (r2 == r8) goto L_0x072d
            r3 = 1937011556(0x73747364, float:1.9367383E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1937011827(0x73747473, float:1.9367711E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1668576371(0x63747473, float:4.5093966E21)
            if (r2 == r3) goto L_0x072d
            r3 = 1937011555(0x73747363, float:1.9367382E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r2 == r3) goto L_0x072d
            r3 = 1937011571(0x73747373, float:1.9367401E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1952867444(0x74666474, float:7.3014264E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1952868452(0x74666864, float:7.301914E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1953196132(0x746b6864, float:7.46037E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1953654136(0x74726578, float:7.6818474E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1953658222(0x7472756e, float:7.683823E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1886614376(0x70737368, float:3.013775E29)
            if (r2 == r3) goto L_0x072d
            r3 = 1935763834(0x7361697a, float:1.785898E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1970628964(0x75756964, float:3.1109627E32)
            if (r2 == r3) goto L_0x072d
            r3 = 1935828848(0x73626770, float:1.7937577E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1936158820(0x73677064, float:1.8336489E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r2 == r3) goto L_0x072d
            r3 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r2 == r3) goto L_0x072d
            if (r2 != r7) goto L_0x0718
            goto L_0x072d
        L_0x0718:
            long r2 = r0.q
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x0726
            r2 = 0
            r0.s = r2
            r2 = 1
            r0.o = r2
            goto L_0x0004
        L_0x0726:
            java.lang.String r0 = "Skipping atom with length > 2147483647 (unsupported)."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.c(r0)
            throw r0
        L_0x072d:
            int r2 = r0.r
            r3 = 8
            if (r2 != r3) goto L_0x0757
            long r2 = r0.q
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 > 0) goto L_0x0750
            g1g r4 = new g1g
            int r2 = (int) r2
            r4.<init>((int) r2)
            byte[] r2 = r5.a
            byte[] r3 = r4.a
            r5 = 0
            r6 = 8
            java.lang.System.arraycopy(r2, r5, r3, r5, r6)
            r0.s = r4
            r2 = 1
            r0.o = r2
            goto L_0x0004
        L_0x0750:
            java.lang.String r0 = "Leaf atom with length > 2147483647 (unsupported)."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.c(r0)
            throw r0
        L_0x0757:
            java.lang.String r0 = "Leaf atom defines extended atom size (unsupported)."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.c(r0)
            throw r0
        L_0x075e:
            r4 = r1
            gf4 r4 = (defpackage.gf4) r4
            long r4 = r4.o
            long r6 = r0.q
            long r4 = r4 + r6
            r6 = 8
            long r4 = r4 - r6
            py r6 = new py
            r6.<init>(r2, r4)
            r3.push(r6)
            long r2 = r0.q
            int r6 = r0.r
            long r6 = (long) r6
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x077f
            r0.c(r4)
            goto L_0x0004
        L_0x077f:
            r2 = 0
            r0.o = r2
            r0.r = r2
            goto L_0x0004
        L_0x0786:
            java.lang.String r0 = "Atom size less than header length (unsupported)."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ud6.i(uf5, yl4):int");
    }

    public final void release() {
    }
}
