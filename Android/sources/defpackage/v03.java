package defpackage;

import com.google.android.exoplayer2.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: v03  reason: default package */
public final class v03 implements kcd, psd, p28, u28 {
    public t03 A0;
    public long B0;
    public long C0;
    public int D0;
    public tj0 E0;
    public boolean F0;
    public final qr0 X = new Object();
    public final ArrayList Y;
    public final List Z;
    public final int a;
    public final int[] b;
    public final ca6[] c;
    public final boolean[] o;
    public final sd4 v;
    public final icd v0;
    public final nsd w;
    public final icd[] w0;
    public final uz8 x;
    public final dm4 x0;
    public final gga y;
    public k03 y0;
    public final w28 z = new w28("ChunkSampleStream", 0);
    public ca6 z0;

    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, qr0] */
    public v03(int i, int[] iArr, ca6[] ca6Arr, sd4 sd4, nsd nsd, cb4 cb4, long j, ow4 ow4, fw4 fw4, gga gga, uz8 uz8) {
        this.a = i;
        this.b = iArr;
        this.c = ca6Arr;
        this.v = sd4;
        this.w = nsd;
        this.x = uz8;
        this.y = gga;
        ArrayList arrayList = new ArrayList();
        this.Y = arrayList;
        this.Z = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.w0 = new icd[length];
        this.o = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        icd[] icdArr = new icd[i2];
        ow4.getClass();
        icd icd = new icd(cb4, ow4, fw4);
        this.v0 = icd;
        int i3 = 0;
        iArr2[0] = i;
        icdArr[0] = icd;
        while (i3 < length) {
            icd icd2 = new icd(cb4, (ow4) null, (fw4) null);
            this.w0[i3] = icd2;
            int i4 = i3 + 1;
            icdArr[i4] = icd2;
            iArr2[i4] = this.b[i3];
            i3 = i4;
        }
        this.x0 = new dm4(4, (Object) iArr2, (Object) icdArr);
        this.B0 = j;
        this.C0 = j;
    }

    public final void A(long j) {
        long j2 = j;
        w28 w28 = this.z;
        if (!w28.L() && !k()) {
            boolean M = w28.M();
            ArrayList arrayList = this.Y;
            boolean z2 = false;
            List list = this.Z;
            sd4 sd4 = this.v;
            if (M) {
                k03 k03 = this.y0;
                k03.getClass();
                boolean z3 = k03 instanceof tj0;
                if (!z3 || !j(arrayList.size() - 1)) {
                    if (sd4.l == null) {
                        z2 = sd4.i.u(j2, k03, list);
                    }
                    if (z2) {
                        w28.A();
                        if (z3) {
                            this.E0 = (tj0) k03;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            int size = (sd4.l != null || sd4.i.length() < 2) ? list.size() : sd4.i.g(j2, list);
            if (size < arrayList.size()) {
                y64.j(!w28.M());
                int size2 = arrayList.size();
                while (true) {
                    if (size >= size2) {
                        size = -1;
                        break;
                    } else if (!j(size)) {
                        break;
                    } else {
                        size++;
                    }
                }
                if (size != -1) {
                    long j3 = h().y;
                    tj0 g = g(size);
                    if (arrayList.isEmpty()) {
                        this.B0 = this.C0;
                    }
                    this.F0 = false;
                    uz8 uz8 = this.x;
                    uz8.m(new es8(1, this.a, (Object) null, 3, (Object) null, uz8.a(g.x), uz8.a(j3)));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x023f A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.p01 C(defpackage.s28 r33, long r34, long r36, java.io.IOException r38, int r39) {
        /*
            r32 = this;
            r0 = r32
            r12 = r38
            r1 = 1
            r2 = r33
            k03 r2 = (defpackage.k03) r2
            sne r3 = r2.z
            long r3 = r3.b
            boolean r5 = r2 instanceof defpackage.tj0
            java.util.ArrayList r6 = r0.Y
            int r7 = r6.size()
            int r7 = r7 - r1
            r8 = 0
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0027
            if (r5 == 0) goto L_0x0027
            boolean r10 = r0.j(r7)
            if (r10 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r10 = 0
            goto L_0x0028
        L_0x0027:
            r10 = r1
        L_0x0028:
            k28 r25 = new k28
            sne r13 = r2.z
            android.net.Uri r14 = r13.c
            java.util.Map r15 = r13.o
            long r8 = r2.a
            p74 r13 = r2.b
            r16 = r13
            r13 = r25
            r17 = r14
            r18 = r15
            r14 = r8
            r19 = r34
            r21 = r36
            r23 = r3
            r13.<init>(r14, r16, r17, r18, r19, r21, r23)
            long r3 = r2.x
            defpackage.t0g.M(r3)
            long r8 = r2.y
            defpackage.t0g.M(r8)
            j28 r8 = new j28
            r9 = r39
            r8.<init>(r9, r12)
            sd4 r9 = r0.v
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            gga r15 = r0.y
            if (r10 != 0) goto L_0x006c
            r9.getClass()
            r20 = r2
            r16 = r6
        L_0x0069:
            r1 = 0
            goto L_0x023c
        L_0x006c:
            fpb r11 = r9.g
            r20 = r2
            if (r11 == 0) goto L_0x00b3
            long r1 = r11.d
            int r16 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r16 == 0) goto L_0x007e
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x007e
            r1 = 1
            goto L_0x007f
        L_0x007e:
            r1 = 0
        L_0x007f:
            hpb r2 = r11.e
            java.lang.Object r3 = r2.X
            x54 r3 = (defpackage.x54) r3
            boolean r3 = r3.d
            if (r3 != 0) goto L_0x008a
            goto L_0x00b3
        L_0x008a:
            boolean r3 = r2.v
            if (r3 == 0) goto L_0x008f
            goto L_0x00ae
        L_0x008f:
            if (r1 == 0) goto L_0x00b3
            boolean r1 = r2.o
            if (r1 != 0) goto L_0x0096
            goto L_0x00ae
        L_0x0096:
            r1 = 1
            r2.v = r1
            r1 = 0
            r2.o = r1
            java.lang.Object r1 = r2.y
            vs6 r1 = (defpackage.vs6) r1
            java.lang.Object r1 = r1.b
            n64 r1 = (defpackage.n64) r1
            android.os.Handler r2 = r1.D
            h64 r3 = r1.w
            r2.removeCallbacks(r3)
            r1.t()
        L_0x00ae:
            r16 = r6
        L_0x00b0:
            r1 = 1
            goto L_0x023c
        L_0x00b3:
            x54 r1 = r9.j
            boolean r1 = r1.d
            r2 = r20
            ca6 r3 = r2.o
            pd4[] r4 = r9.h
            if (r1 != 0) goto L_0x0111
            boolean r1 = r2 instanceof defpackage.xm8
            if (r1 == 0) goto L_0x0111
            boolean r1 = r12 instanceof com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException
            if (r1 == 0) goto L_0x0111
            r1 = r12
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException r1 = (com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException) r1
            int r1 = r1.c
            r11 = 404(0x194, float:5.66E-43)
            if (r1 != r11) goto L_0x0111
            ld5 r1 = r9.i
            int r1 = r1.q(r3)
            r1 = r4[r1]
            java.lang.Object r11 = r1.g
            p64 r11 = (defpackage.p64) r11
            long r13 = r1.b
            long r13 = r11.D(r13)
            r16 = -1
            int r11 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r11 == 0) goto L_0x0111
            r16 = 0
            int r11 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r11 == 0) goto L_0x0111
            java.lang.Object r11 = r1.g
            p64 r11 = (defpackage.p64) r11
            long r16 = r11.C()
            long r11 = r1.c
            long r16 = r16 + r11
            long r16 = r16 + r13
            r11 = 1
            long r16 = r16 - r11
            r1 = r2
            xm8 r1 = (defpackage.xm8) r1
            long r11 = r1.b()
            int r1 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r1 <= 0) goto L_0x0111
            r1 = 1
            r9.m = r1
        L_0x010e:
            r20 = r2
            goto L_0x00ae
        L_0x0111:
            ld5 r1 = r9.i
            int r1 = r1.q(r3)
            r1 = r4[r1]
            java.lang.Object r4 = r1.e
            w2d r4 = (defpackage.w2d) r4
            tb7 r4 = r4.b
            tgg r11 = r9.b
            ll0 r4 = r11.z(r4)
            java.lang.Object r12 = r1.f
            ll0 r12 = (defpackage.ll0) r12
            if (r4 == 0) goto L_0x0132
            boolean r4 = r12.equals(r4)
            if (r4 != 0) goto L_0x0132
            goto L_0x010e
        L_0x0132:
            ld5 r4 = r9.i
            java.lang.Object r1 = r1.e
            w2d r1 = (defpackage.w2d) r1
            tb7 r1 = r1.b
            long r13 = android.os.SystemClock.elapsedRealtime()
            r16 = r6
            int r6 = r4.length()
            r20 = r2
            r2 = 0
            r30 = 0
        L_0x0149:
            if (r2 >= r6) goto L_0x015b
            boolean r17 = r4.s(r2, r13)
            if (r17 == 0) goto L_0x0156
            r17 = 1
            int r30 = r30 + 1
            goto L_0x0158
        L_0x0156:
            r17 = 1
        L_0x0158:
            int r2 = r2 + 1
            goto L_0x0149
        L_0x015b:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r4 = 0
        L_0x0161:
            int r13 = r1.size()
            if (r4 >= r13) goto L_0x0179
            java.lang.Object r13 = r1.get(r4)
            ll0 r13 = (defpackage.ll0) r13
            int r13 = r13.c
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r2.add(r13)
            r13 = 1
            int r4 = r4 + r13
            goto L_0x0161
        L_0x0179:
            int r27 = r2.size()
            z35 r2 = new z35
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r1 = r11.p(r1)
            r13 = 0
        L_0x0189:
            int r14 = r1.size()
            if (r13 >= r14) goto L_0x01a1
            java.lang.Object r14 = r1.get(r13)
            ll0 r14 = (defpackage.ll0) r14
            int r14 = r14.c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r4.add(r14)
            r14 = 1
            int r13 = r13 + r14
            goto L_0x0189
        L_0x01a1:
            int r1 = r4.size()
            int r28 = r27 - r1
            r31 = 1
            r26 = r2
            r29 = r6
            r26.<init>(r27, r28, r29, r30, r31)
            r1 = 2
            boolean r4 = r2.a(r1)
            if (r4 != 0) goto L_0x01c0
            r4 = 1
            boolean r6 = r2.a(r4)
            if (r6 != 0) goto L_0x01c0
            goto L_0x0069
        L_0x01c0:
            r15.getClass()
            p01 r4 = defpackage.gga.n(r2, r8)
            if (r4 == 0) goto L_0x0069
            int r6 = r4.b
            boolean r2 = r2.a(r6)
            if (r2 != 0) goto L_0x01d3
            goto L_0x0069
        L_0x01d3:
            long r13 = r4.c
            if (r6 != r1) goto L_0x01e2
            ld5 r1 = r9.i
            int r2 = r1.q(r3)
            boolean r1 = r1.r(r2, r13)
            goto L_0x023c
        L_0x01e2:
            r1 = 1
            if (r6 != r1) goto L_0x0069
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 + r13
            java.lang.String r3 = r12.b
            java.lang.Object r4 = r11.a
            java.util.HashMap r4 = (java.util.HashMap) r4
            boolean r6 = r4.containsKey(r3)
            if (r6 == 0) goto L_0x0207
            java.lang.Object r6 = r4.get(r3)
            java.lang.Long r6 = (java.lang.Long) r6
            int r9 = defpackage.t0g.a
            long r13 = r6.longValue()
            long r13 = java.lang.Math.max(r1, r13)
            goto L_0x0208
        L_0x0207:
            r13 = r1
        L_0x0208:
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
            r4.put(r3, r6)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            int r4 = r12.c
            if (r4 == r3) goto L_0x00b0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r11.b
            java.util.HashMap r4 = (java.util.HashMap) r4
            boolean r6 = r4.containsKey(r3)
            if (r6 == 0) goto L_0x0233
            java.lang.Object r6 = r4.get(r3)
            java.lang.Long r6 = (java.lang.Long) r6
            int r9 = defpackage.t0g.a
            long r11 = r6.longValue()
            long r1 = java.lang.Math.max(r1, r11)
        L_0x0233:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r4.put(r3, r1)
            goto L_0x00b0
        L_0x023c:
            r12 = 0
            if (r1 == 0) goto L_0x0261
            if (r10 == 0) goto L_0x0261
            if (r5 == 0) goto L_0x025c
            tj0 r1 = r0.g(r7)
            r2 = r20
            if (r1 != r2) goto L_0x024d
            r1 = 1
            goto L_0x024e
        L_0x024d:
            r1 = 0
        L_0x024e:
            defpackage.y64.j(r1)
            boolean r1 = r16.isEmpty()
            if (r1 == 0) goto L_0x025e
            long r3 = r0.C0
            r0.B0 = r3
            goto L_0x025e
        L_0x025c:
            r2 = r20
        L_0x025e:
            p01 r1 = defpackage.w28.w
            goto L_0x0264
        L_0x0261:
            r2 = r20
            r1 = r12
        L_0x0264:
            if (r1 != 0) goto L_0x028d
            r15.getClass()
            long r3 = defpackage.gga.p(r8)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0287
            p01 r1 = new p01
            r17 = 4
            r18 = 0
            r13 = r1
            r20 = r15
            r14 = r3
            r3 = 0
            r16 = r3
            r13.<init>(r14, r16, r17, r18)
            goto L_0x028b
        L_0x0287:
            r20 = r15
            p01 r1 = defpackage.w28.x
        L_0x028b:
            r14 = r1
            goto L_0x0290
        L_0x028d:
            r20 = r15
            goto L_0x028b
        L_0x0290:
            boolean r1 = r14.a()
            r3 = 1
            r15 = r1 ^ 1
            long r8 = r2.x
            long r10 = r2.y
            uz8 r1 = r0.x
            int r3 = r2.c
            int r4 = r0.a
            ca6 r5 = r2.o
            int r6 = r2.v
            java.lang.Object r7 = r2.w
            r2 = r25
            r13 = r12
            r12 = r38
            r33 = r14
            r14 = r13
            r13 = r15
            r1.h(r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)
            if (r15 == 0) goto L_0x02bf
            r0.y0 = r14
            r20.getClass()
            nsd r1 = r0.w
            r1.b(r0)
        L_0x02bf:
            return r33
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v03.C(s28, long, long, java.io.IOException, int):p01");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v0, resolved type: av3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: oce} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v2, resolved type: oce} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03f7  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0404  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean M(long r60) {
        /*
            r59 = this;
            r0 = r59
            boolean r1 = r0.F0
            if (r1 != 0) goto L_0x0014
            w28 r11 = r0.z
            boolean r1 = r11.M()
            if (r1 != 0) goto L_0x0014
            boolean r1 = r11.L()
            if (r1 == 0) goto L_0x0017
        L_0x0014:
            r0 = 0
            goto L_0x0494
        L_0x0017:
            boolean r12 = r59.k()
            if (r12 == 0) goto L_0x0026
            java.util.List r1 = java.util.Collections.emptyList()
            long r2 = r0.B0
        L_0x0023:
            r13 = r1
            r14 = r2
            goto L_0x002f
        L_0x0026:
            tj0 r1 = r59.h()
            long r2 = r1.y
            java.util.List r1 = r0.Z
            goto L_0x0023
        L_0x002f:
            sd4 r9 = r0.v
            com.google.android.exoplayer2.source.BehindLiveWindowException r1 = r9.l
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            qr0 r5 = r0.X
            if (r1 == 0) goto L_0x0043
        L_0x003c:
            r0 = r5
            r26 = r11
            r23 = r12
            goto L_0x03e9
        L_0x0043:
            long r16 = r14 - r60
            x54 r1 = r9.j
            long r1 = r1.a
            long r1 = defpackage.t0g.D(r1)
            x54 r3 = r9.j
            int r4 = r9.k
            fcb r3 = r3.b(r4)
            long r3 = r3.b
            long r3 = defpackage.t0g.D(r3)
            long r3 = r3 + r1
            long r3 = r3 + r14
            fpb r1 = r9.g
            if (r1 == 0) goto L_0x00d7
            hpb r1 = r1.e
            java.lang.Object r2 = r1.X
            x54 r2 = (defpackage.x54) r2
            boolean r10 = r2.d
            if (r10 != 0) goto L_0x006f
            r20 = r9
            r2 = 0
            goto L_0x00d1
        L_0x006f:
            boolean r10 = r1.v
            if (r10 == 0) goto L_0x0077
            r20 = r9
            r2 = 1
            goto L_0x00d1
        L_0x0077:
            java.util.TreeMap r10 = r1.c
            r20 = r9
            long r8 = r2.h
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            java.util.Map$Entry r2 = r10.ceilingEntry(r2)
            java.lang.Object r8 = r1.y
            vs6 r8 = (defpackage.vs6) r8
            if (r2 == 0) goto L_0x00b5
            java.lang.Object r9 = r2.getValue()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x00b5
            java.lang.Object r2 = r2.getKey()
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.lang.Object r4 = r8.b
            n64 r4 = (defpackage.n64) r4
            long r9 = r4.N
            int r22 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r22 == 0) goto L_0x00b1
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 >= 0) goto L_0x00b3
        L_0x00b1:
            r4.N = r2
        L_0x00b3:
            r2 = 1
            goto L_0x00b6
        L_0x00b5:
            r2 = 0
        L_0x00b6:
            if (r2 == 0) goto L_0x00d1
            boolean r3 = r1.o
            if (r3 != 0) goto L_0x00bd
            goto L_0x00d1
        L_0x00bd:
            r3 = 1
            r1.v = r3
            r3 = 0
            r1.o = r3
            java.lang.Object r1 = r8.b
            n64 r1 = (defpackage.n64) r1
            android.os.Handler r3 = r1.D
            h64 r4 = r1.w
            r3.removeCallbacks(r4)
            r1.t()
        L_0x00d1:
            if (r2 == 0) goto L_0x00d5
            goto L_0x003c
        L_0x00d5:
            r9 = r20
        L_0x00d7:
            long r1 = r9.f
            long r1 = defpackage.t0g.t(r1)
            long r2 = defpackage.t0g.D(r1)
            x54 r1 = r9.j
            r8 = r5
            long r4 = r1.a
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x00ed
            r24 = r6
            goto L_0x00fe
        L_0x00ed:
            int r10 = r9.k
            fcb r1 = r1.b(r10)
            long r6 = r1.b
            long r4 = r4 + r6
            long r4 = defpackage.t0g.D(r4)
            long r4 = r2 - r4
            r24 = r4
        L_0x00fe:
            boolean r1 = r13.isEmpty()
            if (r1 == 0) goto L_0x0108
            r10 = 1
            r20 = 0
            goto L_0x0111
        L_0x0108:
            r10 = 1
            java.lang.Object r1 = defpackage.a81.i(r10, r13)
            xm8 r1 = (defpackage.xm8) r1
            r20 = r1
        L_0x0111:
            ld5 r1 = r9.i
            int r1 = r1.length()
            zm8[] r6 = new defpackage.zm8[r1]
            r4 = 0
        L_0x011a:
            pd4[] r5 = r9.h
            if (r4 >= r1) goto L_0x017b
            r5 = r5[r4]
            java.lang.Object r7 = r5.g
            p64 r7 = (defpackage.p64) r7
            ekd r21 = defpackage.zm8.S
            if (r7 != 0) goto L_0x012f
            r6[r4] = r21
            r30 = r8
            r26 = r11
            goto L_0x0173
        L_0x012f:
            r26 = r11
            long r10 = r5.b
            long r28 = r7.l(r10, r2)
            r30 = r8
            long r7 = r5.c
            long r28 = r28 + r7
            long r37 = r5.d(r2)
            if (r20 == 0) goto L_0x014a
            long r7 = r20.b()
        L_0x0147:
            r33 = r7
            goto L_0x015d
        L_0x014a:
            java.lang.Object r5 = r5.g
            p64 r5 = (defpackage.p64) r5
            long r10 = r5.u(r14, r10)
            long r31 = r10 + r7
            r33 = r28
            r35 = r37
            long r7 = defpackage.t0g.k(r31, r33, r35)
            goto L_0x0147
        L_0x015d:
            int r5 = (r33 > r28 ? 1 : (r33 == r28 ? 0 : -1))
            if (r5 >= 0) goto L_0x0164
            r6[r4] = r21
            goto L_0x0173
        L_0x0164:
            pd4 r32 = r9.b(r4)
            qd4 r5 = new qd4
            r31 = r5
            r35 = r37
            r31.<init>(r32, r33, r35)
            r6[r4] = r5
        L_0x0173:
            int r4 = r4 + 1
            r11 = r26
            r8 = r30
            r10 = 1
            goto L_0x011a
        L_0x017b:
            r30 = r8
            r26 = r11
            x54 r1 = r9.j
            boolean r1 = r1.d
            if (r1 != 0) goto L_0x0190
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x01c9
        L_0x0190:
            r1 = 0
            r4 = r5[r1]
            long r7 = r4.d(r2)
            r4 = r5[r1]
            long r4 = r4.f(r7)
            x54 r1 = r9.j
            long r7 = r1.a
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r23 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r23 != 0) goto L_0x01ad
            r7 = r21
            goto L_0x01bc
        L_0x01ad:
            int r10 = r9.k
            fcb r1 = r1.b(r10)
            long r10 = r1.b
            long r7 = r7 + r10
            long r7 = defpackage.t0g.D(r7)
            long r7 = r2 - r7
        L_0x01bc:
            long r4 = java.lang.Math.min(r7, r4)
            long r4 = r4 - r60
            r7 = 0
            long r4 = java.lang.Math.max(r7, r4)
            r7 = r4
        L_0x01c9:
            ld5 r1 = r9.i
            r10 = r2
            r2 = r60
            r23 = r12
            r12 = r30
            r4 = r16
            r16 = r14
            r14 = r21
            r21 = r6
            r6 = r7
            r8 = r13
            r14 = r9
            r9 = r21
            r1.t(r2, r4, r6, r8, r9)
            ld5 r1 = r14.i
            int r1 = r1.b()
            pd4 r1 = r14.b(r1)
            java.lang.Object r2 = r1.g
            p64 r2 = (defpackage.p64) r2
            java.lang.Object r3 = r1.f
            ll0 r3 = (defpackage.ll0) r3
            java.lang.Object r4 = r1.d
            nv0 r4 = (defpackage.nv0) r4
            java.lang.Object r5 = r1.e
            w2d r5 = (defpackage.w2d) r5
            if (r4 == 0) goto L_0x024f
            ca6[] r6 = r4.z
            if (r6 != 0) goto L_0x0205
            cpc r6 = r5.x
            goto L_0x0206
        L_0x0205:
            r6 = 0
        L_0x0206:
            if (r2 != 0) goto L_0x020d
            cpc r7 = r5.d()
            goto L_0x020e
        L_0x020d:
            r7 = 0
        L_0x020e:
            if (r6 != 0) goto L_0x0212
            if (r7 == 0) goto L_0x024f
        L_0x0212:
            ld5 r2 = r14.i
            ca6 r30 = r2.j()
            ld5 r2 = r14.i
            int r31 = r2.k()
            ld5 r2 = r14.i
            java.lang.Object r32 = r2.m()
            if (r6 == 0) goto L_0x0231
            java.lang.String r2 = r3.a
            cpc r2 = r6.a(r7, r2)
            if (r2 != 0) goto L_0x022f
            goto L_0x0232
        L_0x022f:
            r6 = r2
            goto L_0x0232
        L_0x0231:
            r6 = r7
        L_0x0232:
            java.lang.String r2 = r3.a
            r3 = 0
            p74 r29 = defpackage.ryg.f(r5, r2, r6, r3)
            uf7 r2 = new uf7
            java.lang.Object r1 = r1.d
            r33 = r1
            nv0 r33 = (defpackage.nv0) r33
            h74 r1 = r14.e
            r27 = r2
            r28 = r1
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r12.b = r2
        L_0x024c:
            r0 = r12
            goto L_0x03e9
        L_0x024f:
            long r6 = r1.b
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r15 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r15 == 0) goto L_0x025c
            r8 = 1
            goto L_0x025d
        L_0x025c:
            r8 = 0
        L_0x025d:
            long r21 = r2.D(r6)
            r27 = 0
            int r9 = (r21 > r27 ? 1 : (r21 == r27 ? 0 : -1))
            if (r9 != 0) goto L_0x026a
            r12.a = r8
            goto L_0x024c
        L_0x026a:
            long r21 = r2.l(r6, r10)
            r27 = r3
            r9 = r4
            long r3 = r1.c
            long r21 = r21 + r3
            long r10 = r1.d(r10)
            if (r20 == 0) goto L_0x0286
            long r28 = r20.b()
            r20 = r12
            r34 = r13
        L_0x0283:
            r12 = r28
            goto L_0x029d
        L_0x0286:
            r20 = r12
            r34 = r13
            r12 = r16
            long r16 = r2.u(r12, r6)
            long r28 = r16 + r3
            r30 = r21
            r32 = r10
            long r28 = defpackage.t0g.k(r28, r30, r32)
            r16 = r12
            goto L_0x0283
        L_0x029d:
            int r21 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r21 >= 0) goto L_0x02ac
            com.google.android.exoplayer2.source.BehindLiveWindowException r1 = new com.google.android.exoplayer2.source.BehindLiveWindowException
            r1.<init>()
            r14.l = r1
            r0 = r20
            goto L_0x03e9
        L_0x02ac:
            int r21 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r21 > 0) goto L_0x02b6
            boolean r0 = r14.m
            if (r0 == 0) goto L_0x02ba
            if (r21 < 0) goto L_0x02ba
        L_0x02b6:
            r0 = r20
            goto L_0x03e7
        L_0x02ba:
            if (r8 == 0) goto L_0x02cc
            long r21 = r1.g(r12)
            int r0 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x02cc
            r8 = r20
            r0 = 1
            r8.a = r0
            r0 = r8
            goto L_0x03e9
        L_0x02cc:
            r0 = 1
            r30 = r20
            r20 = r9
            long r8 = (long) r0
            long r10 = r10 - r12
            r21 = 1
            long r10 = r10 + r21
            long r8 = java.lang.Math.min(r8, r10)
            int r8 = (int) r8
            if (r15 == 0) goto L_0x02ef
        L_0x02de:
            if (r8 <= r0) goto L_0x02ef
            long r9 = (long) r8
            long r9 = r9 + r12
            long r9 = r9 - r21
            long r9 = r1.g(r9)
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 < 0) goto L_0x02ef
            int r8 = r8 + -1
            goto L_0x02de
        L_0x02ef:
            boolean r9 = r34.isEmpty()
            if (r9 == 0) goto L_0x02f8
            r49 = r16
            goto L_0x02fd
        L_0x02f8:
            r49 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x02fd:
            ld5 r9 = r14.i
            ca6 r9 = r9.j()
            ld5 r10 = r14.i
            int r43 = r10.k()
            ld5 r10 = r14.i
            java.lang.Object r44 = r10.m()
            long r45 = r1.g(r12)
            long r10 = r12 - r3
            cpc r10 = r2.o(r10)
            h74 r11 = r14.e
            r16 = 8
            if (r20 != 0) goto L_0x0365
            long r47 = r1.f(r12)
            boolean r2 = r2.A()
            if (r2 == 0) goto L_0x032b
        L_0x0329:
            r8 = r0
            goto L_0x033e
        L_0x032b:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r24 > r2 ? 1 : (r24 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0329
            long r1 = r1.f(r12)
            int r1 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1))
            if (r1 > 0) goto L_0x033d
            goto L_0x0329
        L_0x033d:
            r8 = 0
        L_0x033e:
            if (r8 == 0) goto L_0x0344
            r2 = r27
            r1 = 0
            goto L_0x0348
        L_0x0344:
            r1 = r16
            r2 = r27
        L_0x0348:
            java.lang.String r2 = r2.a
            p74 r41 = defpackage.ryg.f(r5, r2, r10, r1)
            oce r1 = new oce
            int r2 = r14.d
            r39 = r1
            r40 = r11
            r42 = r9
            r49 = r12
            r51 = r2
            r52 = r9
            r39.<init>(r40, r41, r42, r43, r44, r45, r47, r49, r51, r52)
        L_0x0361:
            r0 = r30
            goto L_0x03e4
        L_0x0365:
            r14 = r27
            r17 = r9
            r9 = r0
            r0 = r10
            r10 = r9
        L_0x036c:
            r27 = r6
            r7 = r5
            if (r10 >= r8) goto L_0x038a
            long r5 = (long) r10
            long r5 = r5 + r12
            long r5 = r5 - r3
            cpc r5 = r2.o(r5)
            java.lang.String r6 = r14.a
            cpc r5 = r0.a(r5, r6)
            if (r5 != 0) goto L_0x0381
            goto L_0x038a
        L_0x0381:
            int r9 = r9 + 1
            int r10 = r10 + 1
            r0 = r5
            r5 = r7
            r6 = r27
            goto L_0x036c
        L_0x038a:
            long r3 = (long) r9
            long r3 = r3 + r12
            long r3 = r3 - r21
            long r47 = r1.f(r3)
            if (r15 == 0) goto L_0x039b
            int r5 = (r27 > r47 ? 1 : (r27 == r47 ? 0 : -1))
            if (r5 > 0) goto L_0x039b
            r51 = r27
            goto L_0x03a0
        L_0x039b:
            r51 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x03a0:
            boolean r2 = r2.A()
            if (r2 == 0) goto L_0x03a8
        L_0x03a6:
            r8 = 1
            goto L_0x03bb
        L_0x03a8:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x03a6
            long r2 = r1.f(r3)
            int r2 = (r2 > r24 ? 1 : (r2 == r24 ? 0 : -1))
            if (r2 > 0) goto L_0x03ba
            goto L_0x03a6
        L_0x03ba:
            r8 = 0
        L_0x03bb:
            if (r8 == 0) goto L_0x03bf
            r2 = 0
            goto L_0x03c1
        L_0x03bf:
            r2 = r16
        L_0x03c1:
            java.lang.String r3 = r14.a
            p74 r41 = defpackage.ryg.f(r7, r3, r0, r2)
            long r2 = r7.c
            long r2 = -r2
            r56 = r2
            av3 r0 = new av3
            r39 = r0
            java.lang.Object r1 = r1.d
            r58 = r1
            nv0 r58 = (defpackage.nv0) r58
            r40 = r11
            r42 = r17
            r53 = r12
            r55 = r9
            r39.<init>(r40, r41, r42, r43, r44, r45, r47, r49, r51, r53, r55, r56, r58)
            r1 = r0
            goto L_0x0361
        L_0x03e4:
            r0.b = r1
            goto L_0x03e9
        L_0x03e7:
            r0.a = r8
        L_0x03e9:
            boolean r1 = r0.a
            java.lang.Object r2 = r0.b
            k03 r2 = (defpackage.k03) r2
            r3 = 0
            r0.b = r3
            r3 = 0
            r0.a = r3
            if (r1 == 0) goto L_0x0404
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r59
            r0.B0 = r4
            r1 = 1
            r0.F0 = r1
            return r1
        L_0x0404:
            r0 = r59
            if (r2 != 0) goto L_0x0409
            return r3
        L_0x0409:
            r0.y0 = r2
            boolean r1 = r2 instanceof defpackage.tj0
            dm4 r3 = r0.x0
            if (r1 == 0) goto L_0x0459
            r1 = r2
            tj0 r1 = (defpackage.tj0) r1
            if (r23 == 0) goto L_0x0438
            long r4 = r0.B0
            long r6 = r1.x
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0431
            icd r6 = r0.v0
            r6.t = r4
            icd[] r4 = r0.w0
            int r5 = r4.length
            r6 = 0
        L_0x0426:
            if (r6 >= r5) goto L_0x0431
            r7 = r4[r6]
            long r8 = r0.B0
            r7.t = r8
            int r6 = r6 + 1
            goto L_0x0426
        L_0x0431:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.B0 = r4
        L_0x0438:
            r1.v0 = r3
            java.lang.Object r3 = r3.c
            icd[] r3 = (defpackage.icd[]) r3
            int r4 = r3.length
            int[] r4 = new int[r4]
            r10 = 0
        L_0x0442:
            int r5 = r3.length
            if (r10 >= r5) goto L_0x0451
            r5 = r3[r10]
            int r6 = r5.q
            int r5 = r5.p
            int r6 = r6 + r5
            r4[r10] = r6
            int r10 = r10 + 1
            goto L_0x0442
        L_0x0451:
            r1.w0 = r4
            java.util.ArrayList r3 = r0.Y
            r3.add(r1)
            goto L_0x0462
        L_0x0459:
            boolean r1 = r2 instanceof defpackage.uf7
            if (r1 == 0) goto L_0x0462
            r1 = r2
            uf7 r1 = (defpackage.uf7) r1
            r1.Y = r3
        L_0x0462:
            gga r1 = r0.y
            int r3 = r2.c
            int r1 = r1.o(r3)
            r3 = r26
            long r8 = r3.P(r2, r0, r1)
            k28 r11 = new k28
            long r5 = r2.a
            p74 r7 = r2.b
            r4 = r11
            r4.<init>(r5, r7, r8)
            int r15 = r2.v
            java.lang.Object r1 = r2.w
            uz8 r10 = r0.x
            int r12 = r2.c
            int r13 = r0.a
            ca6 r14 = r2.o
            long r3 = r2.x
            long r5 = r2.y
            r16 = r1
            r17 = r3
            r19 = r5
            r10.k(r11, r12, r13, r14, r15, r16, r17, r19)
            r0 = 1
        L_0x0494:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v03.M(long):boolean");
    }

    public final void a() {
        icd icd = this.v0;
        icd.z(true);
        zv4 zv4 = icd.h;
        if (zv4 != null) {
            zv4.f(icd.e);
            icd.h = null;
            icd.g = null;
        }
        for (icd icd2 : this.w0) {
            icd2.z(true);
            zv4 zv42 = icd2.h;
            if (zv42 != null) {
                zv42.f(icd2.e);
                icd2.h = null;
                icd2.g = null;
            }
        }
        for (pd4 pd4 : this.v.h) {
            nv0 nv0 = (nv0) pd4.d;
            if (nv0 != null) {
                nv0.c();
            }
        }
        t03 t03 = this.A0;
        if (t03 != null) {
            f64 f64 = (f64) t03;
            synchronized (f64) {
                fpb fpb = (fpb) f64.w0.remove(this);
                if (fpb != null) {
                    icd icd3 = fpb.a;
                    icd3.z(true);
                    zv4 zv43 = icd3.h;
                    if (zv43 != null) {
                        zv43.f(icd3.e);
                        icd3.h = null;
                        icd3.g = null;
                    }
                }
            }
        }
    }

    public final void b() {
        w28 w28 = this.z;
        w28.b();
        this.v0.v();
        if (!w28.M()) {
            sd4 sd4 = this.v;
            BehindLiveWindowException behindLiveWindowException = sd4.l;
            if (behindLiveWindowException == null) {
                sd4.a.b();
                return;
            }
            throw behindLiveWindowException;
        }
    }

    public final boolean c() {
        return !k() && this.v0.t(this.F0);
    }

    public final boolean d() {
        return this.z.M();
    }

    public final int e(long j) {
        if (k()) {
            return 0;
        }
        icd icd = this.v0;
        int q = icd.q(j, this.F0);
        tj0 tj0 = this.E0;
        if (tj0 != null) {
            q = Math.min(q, tj0.d(0) - icd.o());
        }
        icd.B(q);
        l();
        return q;
    }

    public final int f(xe8 xe8, aa4 aa4, int i) {
        if (k()) {
            return -3;
        }
        tj0 tj0 = this.E0;
        icd icd = this.v0;
        if (tj0 != null && tj0.d(0) <= icd.o()) {
            return -3;
        }
        l();
        return icd.y(xe8, aa4, i, this.F0);
    }

    public final tj0 g(int i) {
        ArrayList arrayList = this.Y;
        tj0 tj0 = (tj0) arrayList.get(i);
        t0g.I(arrayList, i, arrayList.size());
        this.D0 = Math.max(this.D0, arrayList.size());
        int i2 = 0;
        this.v0.k(tj0.d(0));
        while (true) {
            icd[] icdArr = this.w0;
            if (i2 >= icdArr.length) {
                return tj0;
            }
            icd icd = icdArr[i2];
            i2++;
            icd.k(tj0.d(i2));
        }
    }

    public final tj0 h() {
        return (tj0) a81.h(1, this.Y);
    }

    public final long i() {
        if (k()) {
            return this.B0;
        }
        if (this.F0) {
            return Long.MIN_VALUE;
        }
        return h().y;
    }

    public final boolean j(int i) {
        int o2;
        tj0 tj0 = (tj0) this.Y.get(i);
        if (this.v0.o() > tj0.d(0)) {
            return true;
        }
        int i2 = 0;
        do {
            icd[] icdArr = this.w0;
            if (i2 >= icdArr.length) {
                return false;
            }
            o2 = icdArr[i2].o();
            i2++;
        } while (o2 <= tj0.d(i2));
        return true;
    }

    public final boolean k() {
        return this.B0 != -9223372036854775807L;
    }

    public final void l() {
        int m = m(this.v0.o(), this.D0 - 1);
        while (true) {
            int i = this.D0;
            if (i <= m) {
                this.D0 = i + 1;
                tj0 tj0 = (tj0) this.Y.get(i);
                ca6 ca6 = tj0.o;
                if (!ca6.equals(this.z0)) {
                    ca6 ca62 = ca6;
                    this.x.b(this.a, ca62, tj0.v, tj0.w, tj0.x);
                }
                this.z0 = ca6;
            } else {
                return;
            }
        }
    }

    public final int m(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.Y;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((tj0) arrayList.get(i2)).d(0) <= i);
        return i2 - 1;
    }

    public final void n(s28 s28, long j, long j2, boolean z2) {
        k03 k03 = (k03) s28;
        this.y0 = null;
        this.E0 = null;
        long j3 = k03.a;
        sne sne = k03.z;
        k28 k28 = new k28(j3, k03.b, sne.c, sne.o, j, j2, sne.b);
        this.y.getClass();
        this.x.d(k28, k03.c, this.a, k03.o, k03.v, k03.w, k03.x, k03.y);
        if (!z2) {
            if (k()) {
                this.v0.z(false);
                for (icd z3 : this.w0) {
                    z3.z(false);
                }
            } else if (k03 instanceof tj0) {
                ArrayList arrayList = this.Y;
                g(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.B0 = this.C0;
                }
            }
            this.w.b(this);
        }
    }

    public final void o(t03 t03) {
        this.A0 = t03;
        icd icd = this.v0;
        icd.i();
        zv4 zv4 = icd.h;
        if (zv4 != null) {
            zv4.f(icd.e);
            icd.h = null;
            icd.g = null;
        }
        for (icd icd2 : this.w0) {
            icd2.i();
            zv4 zv42 = icd2.h;
            if (zv42 != null) {
                zv42.f(icd2.e);
                icd2.h = null;
                icd2.g = null;
            }
        }
        this.z.O(this);
    }

    public final void u(s28 s28, long j, long j2) {
        o03 a2;
        k03 k03 = (k03) s28;
        this.y0 = null;
        sd4 sd4 = this.v;
        sd4.getClass();
        if (k03 instanceof uf7) {
            int q = sd4.i.q(((uf7) k03).o);
            pd4[] pd4Arr = sd4.h;
            pd4 pd4 = pd4Arr[q];
            if (((p64) pd4.g) == null && (a2 = ((nv0) pd4.d).a()) != null) {
                w2d w2d = (w2d) pd4.e;
                pd4Arr[q] = new pd4(pd4.b, w2d, (ll0) pd4.f, (nv0) pd4.d, pd4.c, new jz2((Object) a2, w2d.c, 2), 0);
            }
        }
        fpb fpb = sd4.g;
        if (fpb != null) {
            long j3 = fpb.d;
            if (j3 == -9223372036854775807L || k03.y > j3) {
                fpb.d = k03.y;
            }
            fpb.e.o = true;
        }
        long j4 = k03.a;
        sne sne = k03.z;
        k28 k28 = new k28(j4, k03.b, sne.c, sne.o, j, j2, sne.b);
        this.y.getClass();
        k28 k282 = k28;
        this.x.f(k282, k03.c, this.a, k03.o, k03.v, k03.w, k03.x, k03.y);
        this.w.b(this);
    }

    public final long y() {
        long j;
        if (this.F0) {
            return Long.MIN_VALUE;
        }
        if (k()) {
            return this.B0;
        }
        long j2 = this.C0;
        tj0 h = h();
        if (!h.c()) {
            ArrayList arrayList = this.Y;
            h = arrayList.size() > 1 ? (tj0) a81.h(2, arrayList) : null;
        }
        if (h != null) {
            j2 = Math.max(j2, h.y);
        }
        icd icd = this.v0;
        synchronized (icd) {
            j = icd.v;
        }
        return Math.max(j2, j);
    }
}
