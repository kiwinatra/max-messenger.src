package defpackage;

/* renamed from: nt8  reason: default package */
public final class nt8 {
    public final lt8 a;
    public final Object b;
    public final kcd[] c;
    public boolean d;
    public boolean e;
    public qt8 f;
    public boolean g;
    public final boolean[] h;
    public final ok0[] i;
    public final oe8 j;
    public final j09 k;
    public nt8 l;
    public tpf m = tpf.o;
    public mqf n;
    public long o;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: uf8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: uf8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: h33} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: uf8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public nt8(defpackage.ok0[] r10, long r11, defpackage.oe8 r13, defpackage.cb4 r14, defpackage.j09 r15, defpackage.qt8 r16, defpackage.mqf r17) {
        /*
            r9 = this;
            r0 = r9
            r1 = r10
            r2 = r15
            r3 = r16
            r9.<init>()
            r0.i = r1
            r4 = r11
            r0.o = r4
            r4 = r13
            r0.j = r4
            r0.k = r2
            mz8 r4 = r3.a
            java.lang.Object r5 = r4.a
            r0.b = r5
            r0.f = r3
            tpf r5 = defpackage.tpf.o
            r0.m = r5
            r5 = r17
            r0.n = r5
            int r5 = r1.length
            kcd[] r5 = new defpackage.kcd[r5]
            r0.c = r5
            int r1 = r1.length
            boolean[] r1 = new boolean[r1]
            r0.h = r1
            r15.getClass()
            java.lang.Object r1 = r4.a
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r5 = r1.first
            java.lang.Object r1 = r1.second
            mz8 r1 = r4.b(r1)
            java.lang.Object r4 = r2.d
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r5)
            g09 r4 = (defpackage.g09) r4
            r4.getClass()
            java.lang.Object r5 = r2.f
            java.util.HashSet r5 = (java.util.HashSet) r5
            r5.add(r4)
            java.lang.Object r5 = r2.e
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r5 = r5.get(r4)
            e09 r5 = (defpackage.e09) r5
            if (r5 == 0) goto L_0x0062
            xj0 r6 = r5.a
            oz8 r5 = r5.b
            r6.d(r5)
        L_0x0062:
            java.util.ArrayList r5 = r4.c
            r5.add(r1)
            ag8 r5 = r4.a
            long r6 = r3.b
            r8 = r14
            uf8 r1 = r5.a(r1, r14, r6)
            java.lang.Object r5 = r2.c
            java.util.IdentityHashMap r5 = (java.util.IdentityHashMap) r5
            r5.put(r1, r4)
            r15.g()
            long r2 = r3.d
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0093
            h33 r4 = new h33
            r5 = 1
            r6 = 0
            r10 = r4
            r11 = r1
            r12 = r5
            r13 = r6
            r15 = r2
            r10.<init>(r11, r12, r13, r15)
            r1 = r4
        L_0x0093:
            r0.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nt8.<init>(ok0[], long, oe8, cb4, j09, qt8, mqf):void");
    }

    public final long a(mqf mqf, long j2, boolean z, boolean[] zArr) {
        ok0[] ok0Arr;
        Object[] objArr;
        mqf mqf2 = mqf;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= mqf2.b) {
                break;
            }
            if (z || !mqf2.K(this.n, i2)) {
                z2 = false;
            }
            this.h[i2] = z2;
            i2++;
        }
        int i3 = 0;
        while (true) {
            ok0Arr = this.i;
            int length = ok0Arr.length;
            objArr = this.c;
            if (i3 >= length) {
                break;
            }
            if (ok0Arr[i3].a == -2) {
                objArr[i3] = null;
            }
            i3++;
        }
        b();
        this.n = mqf2;
        c();
        long T = this.a.T((ld5[]) mqf2.v, this.h, this.c, zArr, j2);
        for (int i4 = 0; i4 < ok0Arr.length; i4++) {
            if (ok0Arr[i4].a == -2 && this.n.N(i4)) {
                objArr[i4] = new Object();
            }
        }
        this.e = false;
        for (int i5 = 0; i5 < objArr.length; i5++) {
            if (objArr[i5] != null) {
                y64.j(mqf2.N(i5));
                if (ok0Arr[i5].a != -2) {
                    this.e = true;
                }
            } else {
                y64.j(((ld5[]) mqf2.v)[i5] == null);
            }
        }
        return T;
    }

    public final void b() {
        if (this.l == null) {
            int i2 = 0;
            while (true) {
                mqf mqf = this.n;
                if (i2 < mqf.b) {
                    boolean N = mqf.N(i2);
                    ld5 ld5 = ((ld5[]) this.n.v)[i2];
                    if (N && ld5 != null) {
                        ld5.h();
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final void c() {
        if (this.l == null) {
            int i2 = 0;
            while (true) {
                mqf mqf = this.n;
                if (i2 < mqf.b) {
                    boolean N = mqf.N(i2);
                    ld5 ld5 = ((ld5[]) this.n.v)[i2];
                    if (N && ld5 != null) {
                        ld5.e();
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final long d() {
        if (!this.d) {
            return this.f.b;
        }
        long y = this.e ? this.a.y() : Long.MIN_VALUE;
        return y == Long.MIN_VALUE ? this.f.e : y;
    }

    public final long e() {
        return this.f.b + this.o;
    }

    public final void f() {
        b();
        lt8 lt8 = this.a;
        try {
            boolean z = lt8 instanceof h33;
            j09 j09 = this.k;
            if (z) {
                j09.n(((h33) lt8).a);
            } else {
                j09.n(lt8);
            }
        } catch (RuntimeException e2) {
            iq.a("Period release failed.", e2);
        }
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [qb7, jb7] */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03a6, code lost:
        if (r8 == 2) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0233, code lost:
        if (defpackage.y93.a.d(r13.b, r10.b).d(r13.a, r10.a).f() > 0) goto L_0x0235;
     */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0488 A[LOOP:24: B:208:0x0484->B:210:0x0488, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.mqf g(float r25, defpackage.ikf r26) {
        /*
            r24 = this;
            r0 = r24
            tpf r1 = r0.m
            qt8 r2 = r0.f
            mz8 r2 = r2.a
            oe8 r2 = r0.j
            r2.getClass()
            ok0[] r0 = r0.i
            int r3 = r0.length
            r4 = 1
            int r3 = r3 + r4
            int[] r3 = new int[r3]
            int r5 = r0.length
            int r5 = r5 + r4
            rpf[][] r6 = new defpackage.rpf[r5][]
            int r7 = r0.length
            int r7 = r7 + r4
            int[][][] r7 = new int[r7][][]
            r14 = 0
            r8 = r14
        L_0x001e:
            if (r8 >= r5) goto L_0x002d
            int r9 = r1.a
            rpf[] r10 = new defpackage.rpf[r9]
            r6[r8] = r10
            int[][] r9 = new int[r9][]
            r7[r8] = r9
            int r8 = r8 + 1
            goto L_0x001e
        L_0x002d:
            int r5 = r0.length
            int[] r15 = new int[r5]
            r8 = r14
        L_0x0031:
            if (r8 >= r5) goto L_0x003e
            r9 = r0[r8]
            int r9 = r9.B()
            r15[r8] = r9
            int r8 = r8 + 1
            goto L_0x0031
        L_0x003e:
            r5 = r14
        L_0x003f:
            int r8 = r1.a
            if (r5 >= r8) goto L_0x00d8
            rpf r8 = r1.a(r5)
            ca6[] r9 = r8.c
            r10 = r9[r14]
            java.lang.String r10 = r10.Z
            int r10 = defpackage.uq9.g(r10)
            r11 = 5
            if (r10 != r11) goto L_0x0056
            r10 = r4
            goto L_0x0057
        L_0x0056:
            r10 = r14
        L_0x0057:
            int r11 = r0.length
            r16 = r4
            r12 = r14
            r13 = r12
        L_0x005c:
            int r14 = r0.length
            int r4 = r8.a
            if (r12 >= r14) goto L_0x009f
            r14 = r0[r12]
            r17 = r1
            r18 = r2
            r1 = 0
            r2 = 0
        L_0x0069:
            if (r1 >= r4) goto L_0x007e
            r19 = r15
            r15 = r9[r1]
            int r15 = r14.A(r15)
            r15 = r15 & 7
            int r2 = java.lang.Math.max(r2, r15)
            int r1 = r1 + 1
            r15 = r19
            goto L_0x0069
        L_0x007e:
            r19 = r15
            r1 = r3[r12]
            if (r1 != 0) goto L_0x0086
            r1 = 1
            goto L_0x0087
        L_0x0086:
            r1 = 0
        L_0x0087:
            if (r2 > r13) goto L_0x0091
            if (r2 != r13) goto L_0x0095
            if (r10 == 0) goto L_0x0095
            if (r16 != 0) goto L_0x0095
            if (r1 == 0) goto L_0x0095
        L_0x0091:
            r16 = r1
            r13 = r2
            r11 = r12
        L_0x0095:
            int r12 = r12 + 1
            r1 = r17
            r2 = r18
            r15 = r19
            r4 = 1
            goto L_0x005c
        L_0x009f:
            r17 = r1
            r18 = r2
            r19 = r15
            int r1 = r0.length
            if (r11 != r1) goto L_0x00ab
            int[] r1 = new int[r4]
            goto L_0x00be
        L_0x00ab:
            r1 = r0[r11]
            int[] r2 = new int[r4]
            r10 = 0
        L_0x00b0:
            if (r10 >= r4) goto L_0x00bd
            r12 = r9[r10]
            int r12 = r1.A(r12)
            r2[r10] = r12
            int r10 = r10 + 1
            goto L_0x00b0
        L_0x00bd:
            r1 = r2
        L_0x00be:
            r2 = r3[r11]
            r4 = r6[r11]
            r4[r2] = r8
            r4 = r7[r11]
            r4[r2] = r1
            r1 = 1
            int r2 = r2 + r1
            r3[r11] = r2
            int r5 = r5 + 1
            r1 = r17
            r2 = r18
            r15 = r19
            r4 = 1
            r14 = 0
            goto L_0x003f
        L_0x00d8:
            r18 = r2
            r19 = r15
            int r1 = r0.length
            tpf[] r10 = new defpackage.tpf[r1]
            int r1 = r0.length
            java.lang.String[] r1 = new java.lang.String[r1]
            int r2 = r0.length
            int[] r9 = new int[r2]
            r2 = 0
        L_0x00e6:
            int r4 = r0.length
            if (r2 >= r4) goto L_0x0115
            r4 = r3[r2]
            tpf r5 = new tpf
            r8 = r6[r2]
            java.lang.Object[] r8 = defpackage.t0g.F(r4, r8)
            rpf[] r8 = (defpackage.rpf[]) r8
            r5.<init>(r8)
            r10[r2] = r5
            r5 = r7[r2]
            java.lang.Object[] r4 = defpackage.t0g.F(r4, r5)
            int[][] r4 = (int[][]) r4
            r7[r2] = r4
            r4 = r0[r2]
            java.lang.String r4 = r4.k()
            r1[r2] = r4
            r4 = r0[r2]
            int r4 = r4.a
            r9[r2] = r4
            int r2 = r2 + 1
            goto L_0x00e6
        L_0x0115:
            int r1 = r0.length
            r1 = r3[r1]
            tpf r13 = new tpf
            int r0 = r0.length
            r0 = r6[r0]
            java.lang.Object[] r0 = defpackage.t0g.F(r1, r0)
            rpf[] r0 = (defpackage.rpf[]) r0
            r13.<init>(r0)
            me8 r0 = new me8
            r8 = r0
            r11 = r19
            r12 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            r2 = r18
            rj4 r2 = (defpackage.rj4) r2
            java.util.concurrent.atomic.AtomicReference r1 = r2.e
            java.lang.Object r1 = r1.get()
            dj4 r1 = (defpackage.dj4) r1
            int r3 = r0.a
            jd5[] r4 = new defpackage.jd5[r3]
            ib4 r5 = new ib4
            r6 = 9
            r8 = r19
            r5.<init>(r6, r1, r8)
            v00 r6 = new v00
            r8 = 23
            r6.<init>(r8)
            r8 = 2
            android.util.Pair r5 = defpackage.rj4.g(r8, r0, r7, r5, r6)
            if (r5 == 0) goto L_0x0164
            java.lang.Object r6 = r5.second
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r5 = r5.first
            jd5 r5 = (defpackage.jd5) r5
            r4[r6] = r5
        L_0x0164:
            r5 = 0
        L_0x0165:
            int[] r6 = r0.b
            tpf[] r9 = r0.c
            if (r5 >= r3) goto L_0x017a
            r10 = r6[r5]
            if (r8 != r10) goto L_0x0177
            r10 = r9[r5]
            int r10 = r10.a
            if (r10 <= 0) goto L_0x0177
            r5 = 1
            goto L_0x017b
        L_0x0177:
            int r5 = r5 + 1
            goto L_0x0165
        L_0x017a:
            r5 = 0
        L_0x017b:
            h62 r10 = new h62
            r11 = 1
            r10.<init>(r1, r5, r11)
            v00 r5 = new v00
            r11 = 25
            r5.<init>(r11)
            r11 = 1
            android.util.Pair r5 = defpackage.rj4.g(r11, r0, r7, r10, r5)
            if (r5 == 0) goto L_0x019d
            java.lang.Object r10 = r5.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.lang.Object r11 = r5.first
            jd5 r11 = (defpackage.jd5) r11
            r4[r10] = r11
        L_0x019d:
            if (r5 != 0) goto L_0x01a1
            r5 = 0
            goto L_0x01b2
        L_0x01a1:
            java.lang.Object r5 = r5.first
            jd5 r5 = (defpackage.jd5) r5
            rpf r11 = r5.a
            int[] r5 = r5.b
            r12 = 0
            r5 = r5[r12]
            ca6[] r11 = r11.c
            r5 = r11[r5]
            java.lang.String r5 = r5.c
        L_0x01b2:
            ib4 r11 = new ib4
            r12 = 11
            r11.<init>(r12, r1, r5)
            v00 r5 = new v00
            r12 = 27
            r5.<init>(r12)
            r12 = 3
            android.util.Pair r5 = defpackage.rj4.g(r12, r0, r7, r11, r5)
            if (r5 == 0) goto L_0x01d5
            java.lang.Object r11 = r5.second
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.lang.Object r5 = r5.first
            jd5 r5 = (defpackage.jd5) r5
            r4[r11] = r5
        L_0x01d5:
            r5 = 0
        L_0x01d6:
            if (r5 >= r3) goto L_0x026d
            r11 = r6[r5]
            if (r11 == r8) goto L_0x0267
            r13 = 1
            if (r11 == r13) goto L_0x0267
            if (r11 == r12) goto L_0x0267
            r11 = r9[r5]
            r13 = r7[r5]
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x01ea:
            int r8 = r11.a
            if (r14 >= r8) goto L_0x0257
            rpf r8 = r11.a(r14)
            r19 = r13[r14]
            r20 = r11
            r10 = r17
            r17 = r15
            r15 = r12
            r12 = 0
        L_0x01fc:
            int r11 = r8.a
            if (r12 >= r11) goto L_0x0248
            r11 = r19[r12]
            r21 = r13
            boolean r13 = r1.S0
            boolean r11 = defpackage.rj4.d(r11, r13)
            if (r11 == 0) goto L_0x023b
            ca6[] r11 = r8.c
            r11 = r11[r12]
            aj4 r13 = new aj4
            r22 = r8
            r8 = r19[r12]
            r13.<init>(r11, r8)
            if (r10 == 0) goto L_0x0235
            w93 r8 = defpackage.y93.a
            boolean r11 = r10.b
            r23 = r15
            boolean r15 = r13.b
            y93 r8 = r8.d(r15, r11)
            boolean r11 = r13.a
            boolean r15 = r10.a
            y93 r8 = r8.d(r11, r15)
            int r8 = r8.f()
            if (r8 <= 0) goto L_0x023f
        L_0x0235:
            r17 = r12
            r10 = r13
            r15 = r22
            goto L_0x0241
        L_0x023b:
            r22 = r8
            r23 = r15
        L_0x023f:
            r15 = r23
        L_0x0241:
            int r12 = r12 + 1
            r13 = r21
            r8 = r22
            goto L_0x01fc
        L_0x0248:
            r21 = r13
            r23 = r15
            int r14 = r14 + 1
            r15 = r17
            r11 = r20
            r12 = r23
            r17 = r10
            goto L_0x01ea
        L_0x0257:
            if (r12 != 0) goto L_0x025b
            r8 = 0
            goto L_0x0265
        L_0x025b:
            jd5 r8 = new jd5
            int[] r10 = new int[]{r15}
            r11 = 0
            r8.<init>(r11, r12, r10)
        L_0x0265:
            r4[r5] = r8
        L_0x0267:
            int r5 = r5 + 1
            r8 = 2
            r12 = 3
            goto L_0x01d6
        L_0x026d:
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            r8 = 0
        L_0x0273:
            if (r8 >= r3) goto L_0x0293
            r10 = r9[r8]
            r11 = 0
        L_0x0278:
            int r12 = r10.a
            if (r11 >= r12) goto L_0x0290
            fqf r12 = r1.G0
            rpf r13 = r10.a(r11)
            wb7 r12 = r12.a
            java.lang.Object r12 = r12.get(r13)
            eqf r12 = (defpackage.eqf) r12
            defpackage.rj4.e(r5, r12, r8)
            int r11 = r11 + 1
            goto L_0x0278
        L_0x0290:
            int r8 = r8 + 1
            goto L_0x0273
        L_0x0293:
            r8 = 0
        L_0x0294:
            tpf r10 = r0.e
            int r11 = r10.a
            r12 = -1
            if (r8 >= r11) goto L_0x02af
            fqf r11 = r1.G0
            rpf r10 = r10.a(r8)
            wb7 r11 = r11.a
            java.lang.Object r10 = r11.get(r10)
            eqf r10 = (defpackage.eqf) r10
            defpackage.rj4.e(r5, r10, r12)
            int r8 = r8 + 1
            goto L_0x0294
        L_0x02af:
            r8 = 0
        L_0x02b0:
            int r11 = r5.size()
            if (r8 >= r11) goto L_0x0305
            java.lang.Object r11 = r5.valueAt(r8)
            android.util.Pair r11 = (android.util.Pair) r11
            int r13 = r5.keyAt(r8)
            java.lang.Object r14 = r11.first
            eqf r14 = (defpackage.eqf) r14
            java.lang.Object r11 = r11.second
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r15 = 0
        L_0x02cd:
            if (r15 >= r3) goto L_0x02ff
            if (r11 != r15) goto L_0x02e8
            jd5 r12 = new jd5
            r17 = r5
            rpf r5 = r14.a
            r19 = r11
            tb7 r11 = r14.b
            int[] r11 = defpackage.cvg.L(r11)
            r20 = r14
            r14 = 0
            r12.<init>(r14, r5, r11)
            r4[r15] = r12
            goto L_0x02f5
        L_0x02e8:
            r17 = r5
            r19 = r11
            r20 = r14
            r5 = r6[r15]
            if (r5 != r13) goto L_0x02f5
            r5 = 0
            r4[r15] = r5
        L_0x02f5:
            int r15 = r15 + 1
            r5 = r17
            r11 = r19
            r14 = r20
            r12 = -1
            goto L_0x02cd
        L_0x02ff:
            r17 = r5
            int r8 = r8 + 1
            r12 = -1
            goto L_0x02b0
        L_0x0305:
            r12 = 0
        L_0x0306:
            if (r12 >= r3) goto L_0x0339
            r5 = r9[r12]
            android.util.SparseArray r8 = r1.V0
            java.lang.Object r8 = r8.get(r12)
            java.util.Map r8 = (java.util.Map) r8
            if (r8 == 0) goto L_0x0336
            boolean r5 = r8.containsKey(r5)
            if (r5 == 0) goto L_0x0336
            r5 = r9[r12]
            gj4 r8 = r1.a(r12, r5)
            if (r8 != 0) goto L_0x0324
            r5 = 0
            goto L_0x0334
        L_0x0324:
            jd5 r11 = new jd5
            int r13 = r8.a
            rpf r5 = r5.a(r13)
            int[] r13 = r8.b
            int r8 = r8.c
            r11.<init>(r8, r5, r13)
            r5 = r11
        L_0x0334:
            r4[r12] = r5
        L_0x0336:
            int r12 = r12 + 1
            goto L_0x0306
        L_0x0339:
            r12 = 0
        L_0x033a:
            if (r12 >= r3) goto L_0x035b
            r5 = r6[r12]
            android.util.SparseBooleanArray r8 = r1.W0
            boolean r8 = r8.get(r12)
            if (r8 != 0) goto L_0x0352
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            dc7 r8 = r1.H0
            boolean r5 = r8.contains(r5)
            if (r5 == 0) goto L_0x0354
        L_0x0352:
            r5 = 0
            goto L_0x0356
        L_0x0354:
            r5 = 0
            goto L_0x0358
        L_0x0356:
            r4[r12] = r5
        L_0x0358:
            int r12 = r12 + 1
            goto L_0x033a
        L_0x035b:
            r5 = 0
            yg0 r8 = r2.b
            r8.getClass()
            bk3 r2 = r2.d
            ld5[] r2 = r2.k(r4, r8)
            r1d[] r4 = new defpackage.r1d[r3]
            r12 = 0
        L_0x036a:
            if (r12 >= r3) goto L_0x0395
            r8 = r6[r12]
            android.util.SparseBooleanArray r11 = r1.W0
            boolean r11 = r11.get(r12)
            if (r11 != 0) goto L_0x038f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            dc7 r11 = r1.H0
            boolean r8 = r11.contains(r8)
            if (r8 == 0) goto L_0x0383
            goto L_0x038f
        L_0x0383:
            r8 = r6[r12]
            r11 = -2
            if (r8 == r11) goto L_0x038c
            r8 = r2[r12]
            if (r8 == 0) goto L_0x038f
        L_0x038c:
            r1d r8 = defpackage.r1d.b
            goto L_0x0390
        L_0x038f:
            r8 = r5
        L_0x0390:
            r4[r12] = r8
            int r12 = r12 + 1
            goto L_0x036a
        L_0x0395:
            boolean r1 = r1.T0
            if (r1 == 0) goto L_0x0405
            r1 = -1
            r5 = -1
            r12 = 0
        L_0x039c:
            if (r12 >= r3) goto L_0x03ee
            r8 = r6[r12]
            r11 = r2[r12]
            r13 = 1
            if (r8 == r13) goto L_0x03ad
            r13 = 2
            if (r8 != r13) goto L_0x03a9
            goto L_0x03ae
        L_0x03a9:
            r17 = r7
        L_0x03ab:
            r7 = -1
            goto L_0x03e9
        L_0x03ad:
            r13 = 2
        L_0x03ae:
            if (r11 == 0) goto L_0x03a9
            r14 = r7[r12]
            r15 = r9[r12]
            rpf r13 = r11.a()
            int r13 = r15.b(r13)
            r17 = r7
            r15 = 0
        L_0x03bf:
            int r7 = r11.length()
            if (r15 >= r7) goto L_0x03da
            r7 = r14[r13]
            int r19 = r11.f(r15)
            r7 = r7[r19]
            r19 = r11
            r11 = 32
            r7 = r7 & r11
            if (r7 == r11) goto L_0x03d5
            goto L_0x03ab
        L_0x03d5:
            int r15 = r15 + 1
            r11 = r19
            goto L_0x03bf
        L_0x03da:
            r7 = 1
            if (r8 != r7) goto L_0x03e4
            r7 = -1
            if (r5 == r7) goto L_0x03e2
        L_0x03e0:
            r8 = 0
            goto L_0x03f0
        L_0x03e2:
            r5 = r12
            goto L_0x03e9
        L_0x03e4:
            r7 = -1
            if (r1 == r7) goto L_0x03e8
            goto L_0x03e0
        L_0x03e8:
            r1 = r12
        L_0x03e9:
            int r12 = r12 + 1
            r7 = r17
            goto L_0x039c
        L_0x03ee:
            r7 = -1
            r8 = 1
        L_0x03f0:
            if (r5 == r7) goto L_0x03f6
            if (r1 == r7) goto L_0x03f6
            r7 = 1
            goto L_0x03f7
        L_0x03f6:
            r7 = 0
        L_0x03f7:
            r7 = r7 & r8
            if (r7 == 0) goto L_0x0405
            r1d r7 = new r1d
            r8 = 1
            r7.<init>(r8)
            r4[r5] = r7
            r4[r1] = r7
            goto L_0x0406
        L_0x0405:
            r8 = 1
        L_0x0406:
            android.util.Pair r1 = android.util.Pair.create(r4, r2)
            java.lang.Object r2 = r1.second
            ld5[] r2 = (defpackage.ld5[]) r2
            qb7 r4 = new qb7
            r5 = 4
            r4.<init>(r5)
            r12 = 0
        L_0x0415:
            if (r12 >= r3) goto L_0x0483
            r5 = r9[r12]
            r7 = r2[r12]
            r11 = 0
        L_0x041c:
            int r13 = r5.a
            if (r11 >= r13) goto L_0x047a
            rpf r13 = r5.a(r11)
            int r14 = r13.a
            int[] r15 = new int[r14]
            boolean[] r8 = new boolean[r14]
            r17 = r2
            r2 = 0
        L_0x042d:
            if (r2 >= r14) goto L_0x0461
            r18 = r3
            int[][][] r3 = r0.d
            r3 = r3[r12]
            r3 = r3[r11]
            r3 = r3[r2]
            r3 = r3 & 7
            r15[r2] = r3
            if (r7 == 0) goto L_0x0454
            rpf r3 = r7.a()
            boolean r3 = r3.equals(r13)
            if (r3 == 0) goto L_0x0454
            int r3 = r7.p(r2)
            r19 = r5
            r5 = -1
            if (r3 == r5) goto L_0x0457
            r3 = 1
            goto L_0x0458
        L_0x0454:
            r19 = r5
            r5 = -1
        L_0x0457:
            r3 = 0
        L_0x0458:
            r8[r2] = r3
            int r2 = r2 + 1
            r3 = r18
            r5 = r19
            goto L_0x042d
        L_0x0461:
            r18 = r3
            r19 = r5
            r5 = -1
            r2 = r6[r12]
            rqf r3 = new rqf
            r3.<init>(r13, r15, r2, r8)
            r4.a(r3)
            int r11 = r11 + 1
            r2 = r17
            r3 = r18
            r5 = r19
            r8 = 1
            goto L_0x041c
        L_0x047a:
            r17 = r2
            r18 = r3
            r5 = -1
            int r12 = r12 + 1
            r8 = 1
            goto L_0x0415
        L_0x0483:
            r12 = 0
        L_0x0484:
            int r2 = r10.a
            if (r12 >= r2) goto L_0x04ab
            rpf r2 = r10.a(r12)
            int r3 = r2.a
            int[] r5 = new int[r3]
            r6 = 0
            java.util.Arrays.fill(r5, r6)
            ca6[] r7 = r2.c
            r7 = r7[r6]
            java.lang.String r7 = r7.Z
            int r7 = defpackage.uq9.g(r7)
            boolean[] r3 = new boolean[r3]
            rqf r8 = new rqf
            r8.<init>(r2, r5, r7, r3)
            r4.a(r8)
            int r12 = r12 + 1
            goto L_0x0484
        L_0x04ab:
            r6 = 0
            sqf r2 = new sqf
            k0d r3 = r4.j()
            r2.<init>(r3)
            mqf r3 = new mqf
            java.lang.Object r4 = r1.first
            r1d[] r4 = (defpackage.r1d[]) r4
            java.lang.Object r1 = r1.second
            ld5[] r1 = (defpackage.ld5[]) r1
            r3.<init>((defpackage.r1d[]) r4, (defpackage.ld5[]) r1, (defpackage.sqf) r2, (defpackage.me8) r0)
            java.lang.Object r0 = r3.v
            ld5[] r0 = (defpackage.ld5[]) r0
            int r1 = r0.length
            r14 = r6
        L_0x04c8:
            if (r14 >= r1) goto L_0x04d6
            r2 = r0[r14]
            r4 = r25
            if (r2 == 0) goto L_0x04d3
            r2.l(r4)
        L_0x04d3:
            int r14 = r14 + 1
            goto L_0x04c8
        L_0x04d6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nt8.g(float, ikf):mqf");
    }

    public final void h() {
        lt8 lt8 = this.a;
        if (lt8 instanceof h33) {
            long j2 = this.f.d;
            if (j2 == -9223372036854775807L) {
                j2 = Long.MIN_VALUE;
            }
            h33 h33 = (h33) lt8;
            h33.v = 0;
            h33.w = j2;
        }
    }
}
