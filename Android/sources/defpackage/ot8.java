package defpackage;

/* renamed from: ot8  reason: default package */
public final class ot8 {
    public final mt8 a;
    public final Object b;
    public final lcd[] c;
    public boolean d;
    public boolean e;
    public rt8 f;
    public boolean g;
    public final boolean[] h;
    public final pk0[] i;
    public final pe8 j;
    public final j09 k;
    public ot8 l;
    public upf m = upf.d;
    public mqf n;
    public long o;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: vf8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: vf8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: i33} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: vf8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ot8(defpackage.pk0[] r10, long r11, defpackage.pe8 r13, defpackage.cb4 r14, defpackage.j09 r15, defpackage.rt8 r16, defpackage.mqf r17) {
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
            nz8 r4 = r3.a
            java.lang.Object r5 = r4.a
            r0.b = r5
            r0.f = r3
            upf r5 = defpackage.upf.d
            r0.m = r5
            r5 = r17
            r0.n = r5
            int r5 = r1.length
            lcd[] r5 = new defpackage.lcd[r5]
            r0.c = r5
            int r1 = r1.length
            boolean[] r1 = new boolean[r1]
            r0.h = r1
            r15.getClass()
            int r1 = defpackage.cqb.n
            java.lang.Object r1 = r4.a
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r5 = r1.first
            java.lang.Object r1 = r1.second
            nz8 r1 = r4.a(r1)
            java.lang.Object r4 = r2.d
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r5)
            h09 r4 = (defpackage.h09) r4
            r4.getClass()
            java.lang.Object r5 = r2.f
            java.util.HashSet r5 = (java.util.HashSet) r5
            r5.add(r4)
            java.lang.Object r5 = r2.e
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r5 = r5.get(r4)
            f09 r5 = (defpackage.f09) r5
            if (r5 == 0) goto L_0x0064
            yj0 r6 = r5.a
            pz8 r5 = r5.b
            r6.f(r5)
        L_0x0064:
            java.util.ArrayList r5 = r4.c
            r5.add(r1)
            bg8 r5 = r4.a
            long r6 = r3.b
            r8 = r14
            vf8 r1 = r5.c(r1, r14, r6)
            java.lang.Object r5 = r2.c
            java.util.IdentityHashMap r5 = (java.util.IdentityHashMap) r5
            r5.put(r1, r4)
            r15.g()
            long r2 = r3.d
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0095
            i33 r4 = new i33
            r5 = 1
            r6 = 0
            r10 = r4
            r11 = r1
            r12 = r5
            r13 = r6
            r15 = r2
            r10.<init>(r11, r12, r13, r15)
            r1 = r4
        L_0x0095:
            r0.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ot8.<init>(pk0[], long, pe8, cb4, j09, rt8, mqf):void");
    }

    public final long a(mqf mqf, long j2, boolean z, boolean[] zArr) {
        pk0[] pk0Arr;
        Object[] objArr;
        mqf mqf2 = mqf;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= mqf2.b) {
                break;
            }
            if (z || !mqf2.L(this.n, i2)) {
                z2 = false;
            }
            this.h[i2] = z2;
            i2++;
        }
        int i3 = 0;
        while (true) {
            pk0Arr = this.i;
            int length = pk0Arr.length;
            objArr = this.c;
            if (i3 >= length) {
                break;
            }
            if (pk0Arr[i3].b == -2) {
                objArr[i3] = null;
            }
            i3++;
        }
        b();
        this.n = mqf2;
        c();
        long g2 = this.a.g((md5[]) mqf2.v, this.h, this.c, zArr, j2);
        for (int i4 = 0; i4 < pk0Arr.length; i4++) {
            if (pk0Arr[i4].b == -2 && this.n.N(i4)) {
                objArr[i4] = new Object();
            }
        }
        this.e = false;
        for (int i5 = 0; i5 < objArr.length; i5++) {
            if (objArr[i5] != null) {
                n79.n(mqf2.N(i5));
                if (pk0Arr[i5].b != -2) {
                    this.e = true;
                }
            } else {
                n79.n(((md5[]) mqf2.v)[i5] == null);
            }
        }
        return g2;
    }

    public final void b() {
        if (this.l == null) {
            int i2 = 0;
            while (true) {
                mqf mqf = this.n;
                if (i2 < mqf.b) {
                    boolean N = mqf.N(i2);
                    md5 md5 = ((md5[]) this.n.v)[i2];
                    if (N && md5 != null) {
                        md5.h();
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
                    md5 md5 = ((md5[]) this.n.v)[i2];
                    if (N && md5 != null) {
                        md5.e();
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

    public final boolean f() {
        return this.d && (!this.e || this.a.y() == Long.MIN_VALUE);
    }

    public final void g() {
        b();
        mt8 mt8 = this.a;
        try {
            boolean z = mt8 instanceof i33;
            j09 j09 = this.k;
            if (z) {
                j09.o(((i33) mt8).a);
            } else {
                j09.o(mt8);
            }
        } catch (RuntimeException e2) {
            i8b.p("Period release failed.", e2);
        }
    }

    /* JADX WARNING: type inference failed for: r2v18, types: [qb7, jb7] */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02b1, code lost:
        if (defpackage.y93.a.d(r12.b, r6.b).d(r12.a, r6.a).f() > 0) goto L_0x02b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03f5, code lost:
        if (r11 == 2) goto L_0x03fd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.mqf h(float r29, defpackage.jkf r30) {
        /*
            r28 = this;
            r0 = r28
            r3 = 1
            pe8 r4 = r0.j
            pk0[] r5 = r0.i
            upf r6 = r0.m
            rt8 r7 = r0.f
            nz8 r7 = r7.a
            r4.getClass()
            int r7 = r5.length
            int r7 = r7 + r3
            int[] r7 = new int[r7]
            int r8 = r5.length
            int r8 = r8 + r3
            spf[][] r9 = new defpackage.spf[r8][]
            int r10 = r5.length
            int r10 = r10 + r3
            int[][][] r10 = new int[r10][][]
            r11 = 0
        L_0x001d:
            if (r11 >= r8) goto L_0x002b
            int r12 = r6.a
            spf[] r13 = new defpackage.spf[r12]
            r9[r11] = r13
            int[][] r12 = new int[r12][]
            r10[r11] = r12
            int r11 = r11 + r3
            goto L_0x001d
        L_0x002b:
            int r8 = r5.length
            int[] r15 = new int[r8]
            r11 = 0
        L_0x002f:
            if (r11 >= r8) goto L_0x003b
            r12 = r5[r11]
            int r12 = r12.E()
            r15[r11] = r12
            int r11 = r11 + r3
            goto L_0x002f
        L_0x003b:
            r8 = 0
        L_0x003c:
            int r11 = r6.a
            if (r8 >= r11) goto L_0x00c8
            spf r11 = r6.a(r8)
            int r12 = r11.c
            r13 = 5
            if (r12 != r13) goto L_0x004b
            r12 = r3
            goto L_0x004c
        L_0x004b:
            r12 = 0
        L_0x004c:
            int r13 = r5.length
            r16 = r3
            r1 = 0
            r14 = 0
        L_0x0051:
            int r2 = r5.length
            if (r14 >= r2) goto L_0x008f
            r2 = r5[r14]
            r18 = r6
            r3 = 0
            r6 = 0
        L_0x005a:
            int r0 = r11.a
            if (r3 >= r0) goto L_0x006f
            ea6[] r0 = r11.d
            r0 = r0[r3]
            int r0 = r2.D(r0)
            r0 = r0 & 7
            int r6 = java.lang.Math.max(r6, r0)
            r0 = 1
            int r3 = r3 + r0
            goto L_0x005a
        L_0x006f:
            r0 = r7[r14]
            if (r0 != 0) goto L_0x0075
            r0 = 1
            goto L_0x0076
        L_0x0075:
            r0 = 0
        L_0x0076:
            if (r6 > r1) goto L_0x0083
            if (r6 != r1) goto L_0x0081
            if (r12 == 0) goto L_0x0081
            if (r16 != 0) goto L_0x0081
            if (r0 == 0) goto L_0x0081
            goto L_0x0083
        L_0x0081:
            r0 = 1
            goto L_0x0088
        L_0x0083:
            r16 = r0
            r1 = r6
            r13 = r14
            goto L_0x0081
        L_0x0088:
            int r14 = r14 + r0
            r3 = r0
            r6 = r18
            r0 = r28
            goto L_0x0051
        L_0x008f:
            r18 = r6
            int r0 = r5.length
            if (r13 != r0) goto L_0x009a
            int r0 = r11.a
            int[] r0 = new int[r0]
            r3 = 1
            goto L_0x00b4
        L_0x009a:
            r0 = r5[r13]
            int r1 = r11.a
            int[] r1 = new int[r1]
            r2 = 0
        L_0x00a1:
            int r3 = r11.a
            if (r2 >= r3) goto L_0x00b2
            ea6[] r3 = r11.d
            r3 = r3[r2]
            int r3 = r0.D(r3)
            r1[r2] = r3
            r3 = 1
            int r2 = r2 + r3
            goto L_0x00a1
        L_0x00b2:
            r3 = 1
            r0 = r1
        L_0x00b4:
            r1 = r7[r13]
            r2 = r9[r13]
            r2[r1] = r11
            r2 = r10[r13]
            r2[r1] = r0
            int r1 = r1 + r3
            r7[r13] = r1
            int r8 = r8 + r3
            r0 = r28
            r6 = r18
            goto L_0x003c
        L_0x00c8:
            int r0 = r5.length
            upf[] r13 = new defpackage.upf[r0]
            int r0 = r5.length
            java.lang.String[] r0 = new java.lang.String[r0]
            int r1 = r5.length
            int[] r12 = new int[r1]
            r1 = 0
        L_0x00d2:
            int r2 = r5.length
            if (r1 >= r2) goto L_0x0101
            r2 = r7[r1]
            upf r3 = new upf
            r6 = r9[r1]
            java.lang.Object[] r6 = defpackage.v0g.U(r2, r6)
            spf[] r6 = (defpackage.spf[]) r6
            r3.<init>(r6)
            r13[r1] = r3
            r3 = r10[r1]
            java.lang.Object[] r2 = defpackage.v0g.U(r2, r3)
            int[][] r2 = (int[][]) r2
            r10[r1] = r2
            r2 = r5[r1]
            java.lang.String r2 = r2.l()
            r0[r1] = r2
            r2 = r5[r1]
            int r2 = r2.b
            r12[r1] = r2
            r2 = 1
            int r1 = r1 + r2
            goto L_0x00d2
        L_0x0101:
            int r0 = r5.length
            r0 = r7[r0]
            upf r1 = new upf
            int r2 = r5.length
            r2 = r9[r2]
            java.lang.Object[] r0 = defpackage.v0g.U(r0, r2)
            spf[] r0 = (defpackage.spf[]) r0
            r1.<init>(r0)
            ne8 r0 = new ne8
            r11 = r0
            r14 = r15
            r2 = r15
            r15 = r10
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16)
            sj4 r4 = (defpackage.sj4) r4
            java.lang.Object r1 = r4.c
            monitor-enter(r1)
            ej4 r3 = r4.g     // Catch:{ all -> 0x0166 }
            boolean r5 = r3.s0     // Catch:{ all -> 0x0166 }
            r6 = 32
            if (r5 == 0) goto L_0x0169
            int r5 = defpackage.v0g.a     // Catch:{ all -> 0x0166 }
            if (r5 < r6) goto L_0x0169
            lf6 r5 = r4.h     // Catch:{ all -> 0x0166 }
            if (r5 == 0) goto L_0x0169
            android.os.Looper r7 = android.os.Looper.myLooper()     // Catch:{ all -> 0x0166 }
            defpackage.n79.o(r7)     // Catch:{ all -> 0x0166 }
            java.lang.Object r8 = r5.v     // Catch:{ all -> 0x0166 }
            hj4 r8 = (defpackage.hj4) r8     // Catch:{ all -> 0x0166 }
            if (r8 != 0) goto L_0x0169
            java.lang.Object r8 = r5.o     // Catch:{ all -> 0x0166 }
            android.os.Handler r8 = (android.os.Handler) r8     // Catch:{ all -> 0x0166 }
            if (r8 == 0) goto L_0x0146
            goto L_0x0169
        L_0x0146:
            hj4 r8 = new hj4     // Catch:{ all -> 0x0166 }
            r8.<init>(r4)     // Catch:{ all -> 0x0166 }
            r5.v = r8     // Catch:{ all -> 0x0166 }
            android.os.Handler r8 = new android.os.Handler     // Catch:{ all -> 0x0166 }
            r8.<init>(r7)     // Catch:{ all -> 0x0166 }
            r5.o = r8     // Catch:{ all -> 0x0166 }
            java.lang.Object r7 = r5.c     // Catch:{ all -> 0x0166 }
            android.media.Spatializer r7 = (android.media.Spatializer) r7     // Catch:{ all -> 0x0166 }
            oc4 r9 = new oc4     // Catch:{ all -> 0x0166 }
            r11 = 0
            r9.<init>(r8, r11)     // Catch:{ all -> 0x0166 }
            java.lang.Object r5 = r5.v     // Catch:{ all -> 0x0166 }
            hj4 r5 = (defpackage.hj4) r5     // Catch:{ all -> 0x0166 }
            r7.addOnSpatializerStateChangedListener(r9, r5)     // Catch:{ all -> 0x0166 }
            goto L_0x0169
        L_0x0166:
            r0 = move-exception
            goto L_0x0660
        L_0x0169:
            monitor-exit(r1)     // Catch:{ all -> 0x0166 }
            int r1 = r0.a
            kd5[] r5 = new defpackage.kd5[r1]
            gqf r7 = r3.s
            int r7 = r7.a
            r8 = 2
            if (r7 != r8) goto L_0x0177
            r7 = 0
            goto L_0x0189
        L_0x0177:
            ib4 r7 = new ib4
            r11 = 10
            r7.<init>(r11, r3, r2)
            v00 r11 = new v00
            r12 = 26
            r11.<init>(r12)
            android.util.Pair r7 = defpackage.sj4.j(r8, r0, r10, r7, r11)
        L_0x0189:
            boolean r11 = r3.x
            gqf r12 = r3.s
            r13 = 4
            if (r11 != 0) goto L_0x0195
            if (r7 != 0) goto L_0x0193
            goto L_0x0195
        L_0x0193:
            r11 = 0
            goto L_0x01ac
        L_0x0195:
            int r11 = r12.a
            if (r11 != r8) goto L_0x019a
            goto L_0x0193
        L_0x019a:
            rt3 r11 = new rt3
            r14 = 15
            r11.<init>((int) r14, (java.lang.Object) r3)
            v00 r14 = new v00
            r15 = 22
            r14.<init>(r15)
            android.util.Pair r11 = defpackage.sj4.j(r13, r0, r10, r11, r14)
        L_0x01ac:
            if (r11 == 0) goto L_0x01bd
            java.lang.Object r7 = r11.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r11 = r11.first
            kd5 r11 = (defpackage.kd5) r11
            r5[r7] = r11
            goto L_0x01cd
        L_0x01bd:
            if (r7 == 0) goto L_0x01cd
            java.lang.Object r11 = r7.second
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.lang.Object r7 = r7.first
            kd5 r7 = (defpackage.kd5) r7
            r5[r11] = r7
        L_0x01cd:
            r7 = 0
        L_0x01ce:
            upf[] r11 = r0.c
            int[] r14 = r0.b
            int r15 = r0.a
            if (r7 >= r15) goto L_0x01e6
            r15 = r14[r7]
            if (r8 != r15) goto L_0x01e3
            r15 = r11[r7]
            int r15 = r15.a
            if (r15 <= 0) goto L_0x01e3
            r7 = 1
            r15 = 1
            goto L_0x01e8
        L_0x01e3:
            r15 = 1
            int r7 = r7 + r15
            goto L_0x01ce
        L_0x01e6:
            r15 = 1
            r7 = 0
        L_0x01e8:
            p5 r6 = new p5
            r6.<init>(r4, r3, r7, r2)
            v00 r2 = new v00
            r7 = 24
            r2.<init>(r7)
            android.util.Pair r2 = defpackage.sj4.j(r15, r0, r10, r6, r2)
            if (r2 == 0) goto L_0x0208
            java.lang.Object r6 = r2.second
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r7 = r2.first
            kd5 r7 = (defpackage.kd5) r7
            r5[r6] = r7
        L_0x0208:
            if (r2 != 0) goto L_0x020c
            r2 = 0
            goto L_0x021d
        L_0x020c:
            java.lang.Object r2 = r2.first
            kd5 r2 = (defpackage.kd5) r2
            spf r6 = r2.a
            int[] r2 = r2.b
            r7 = 0
            r2 = r2[r7]
            ea6[] r6 = r6.d
            r2 = r6[r2]
            java.lang.String r2 = r2.d
        L_0x021d:
            int r6 = r12.a
            r7 = 3
            if (r6 != r8) goto L_0x0224
            r2 = 0
            goto L_0x0236
        L_0x0224:
            ib4 r6 = new ib4
            r15 = 12
            r6.<init>(r15, r3, r2)
            v00 r2 = new v00
            r15 = 28
            r2.<init>(r15)
            android.util.Pair r2 = defpackage.sj4.j(r7, r0, r10, r6, r2)
        L_0x0236:
            if (r2 == 0) goto L_0x0246
            java.lang.Object r6 = r2.second
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r2 = r2.first
            kd5 r2 = (defpackage.kd5) r2
            r5[r6] = r2
        L_0x0246:
            r2 = 0
        L_0x0247:
            if (r2 >= r1) goto L_0x02fc
            r6 = r14[r2]
            if (r6 == r8) goto L_0x02e8
            r15 = 1
            if (r6 == r15) goto L_0x02ed
            if (r6 == r7) goto L_0x02e8
            if (r6 == r13) goto L_0x02e8
            r6 = r11[r2]
            r15 = r10[r2]
            int r7 = r12.a
            if (r7 != r8) goto L_0x0263
            r24 = r11
            r25 = r12
        L_0x0260:
            r6 = 0
            goto L_0x02e4
        L_0x0263:
            r7 = 0
            r13 = 0
            r19 = 0
            r20 = 0
        L_0x0269:
            int r8 = r6.a
            if (r7 >= r8) goto L_0x02d4
            spf r8 = r6.a(r7)
            r22 = r15[r7]
            r23 = r6
            r24 = r11
            r6 = r20
            r9 = 0
        L_0x027a:
            int r11 = r8.a
            if (r9 >= r11) goto L_0x02c7
            r11 = r22[r9]
            r25 = r12
            boolean r12 = r3.t0
            boolean r11 = defpackage.pk0.o(r11, r12)
            if (r11 == 0) goto L_0x02ba
            ea6[] r11 = r8.d
            r11 = r11[r9]
            bj4 r12 = new bj4
            r26 = r8
            r8 = r22[r9]
            r12.<init>(r8, r11)
            if (r6 == 0) goto L_0x02b3
            w93 r8 = defpackage.y93.a
            boolean r11 = r6.b
            r27 = r13
            boolean r13 = r12.b
            y93 r8 = r8.d(r13, r11)
            boolean r11 = r12.a
            boolean r13 = r6.a
            y93 r8 = r8.d(r11, r13)
            int r8 = r8.f()
            if (r8 <= 0) goto L_0x02be
        L_0x02b3:
            r19 = r9
            r6 = r12
            r13 = r26
        L_0x02b8:
            r8 = 1
            goto L_0x02c1
        L_0x02ba:
            r26 = r8
            r27 = r13
        L_0x02be:
            r13 = r27
            goto L_0x02b8
        L_0x02c1:
            int r9 = r9 + r8
            r12 = r25
            r8 = r26
            goto L_0x027a
        L_0x02c7:
            r25 = r12
            r27 = r13
            r8 = 1
            int r7 = r7 + r8
            r20 = r6
            r6 = r23
            r11 = r24
            goto L_0x0269
        L_0x02d4:
            r24 = r11
            r25 = r12
            if (r13 != 0) goto L_0x02db
            goto L_0x0260
        L_0x02db:
            kd5 r6 = new kd5
            int[] r7 = new int[]{r19}
            r6.<init>(r13, r7)
        L_0x02e4:
            r5[r2] = r6
        L_0x02e6:
            r6 = 1
            goto L_0x02f2
        L_0x02e8:
            r24 = r11
            r25 = r12
            goto L_0x02e6
        L_0x02ed:
            r24 = r11
            r25 = r12
            r6 = r15
        L_0x02f2:
            int r2 = r2 + r6
            r11 = r24
            r12 = r25
            r7 = 3
            r8 = 2
            r13 = 4
            goto L_0x0247
        L_0x02fc:
            int r2 = r0.a
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r7 = 0
        L_0x0304:
            upf[] r8 = r0.c
            if (r7 >= r2) goto L_0x0310
            r8 = r8[r7]
            defpackage.sj4.d(r8, r3, r6)
            r8 = 1
            int r7 = r7 + r8
            goto L_0x0304
        L_0x0310:
            upf r7 = r0.f
            defpackage.sj4.d(r7, r3, r6)
            r7 = 0
        L_0x0316:
            r9 = -1
            if (r7 >= r2) goto L_0x034d
            int[] r11 = r0.b
            r11 = r11[r7]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object r11 = r6.get(r11)
            dqf r11 = (defpackage.dqf) r11
            if (r11 != 0) goto L_0x032b
        L_0x0329:
            r9 = 1
            goto L_0x034b
        L_0x032b:
            tb7 r12 = r11.b
            boolean r13 = r12.isEmpty()
            if (r13 != 0) goto L_0x0347
            r13 = r8[r7]
            spf r11 = r11.a
            int r13 = r13.b(r11)
            if (r13 == r9) goto L_0x0347
            kd5 r9 = new kd5
            int[] r12 = defpackage.cvg.L(r12)
            r9.<init>(r11, r12)
            goto L_0x0348
        L_0x0347:
            r9 = 0
        L_0x0348:
            r5[r7] = r9
            goto L_0x0329
        L_0x034b:
            int r7 = r7 + r9
            goto L_0x0316
        L_0x034d:
            int r2 = r0.a
            r6 = 0
        L_0x0350:
            if (r6 >= r2) goto L_0x037d
            upf[] r7 = r0.c
            r7 = r7[r6]
            android.util.SparseArray r8 = r3.x0
            java.lang.Object r8 = r8.get(r6)
            java.util.Map r8 = (java.util.Map) r8
            if (r8 == 0) goto L_0x037a
            boolean r8 = r8.containsKey(r7)
            if (r8 == 0) goto L_0x037a
            android.util.SparseArray r8 = r3.x0
            java.lang.Object r8 = r8.get(r6)
            java.util.Map r8 = (java.util.Map) r8
            if (r8 == 0) goto L_0x0377
            java.lang.Object r7 = r8.get(r7)
            defpackage.rae.w(r7)
        L_0x0377:
            r7 = 0
            r5[r6] = r7
        L_0x037a:
            r7 = 1
            int r6 = r6 + r7
            goto L_0x0350
        L_0x037d:
            r2 = 0
        L_0x037e:
            if (r2 >= r1) goto L_0x03a2
            int[] r6 = r0.b
            r6 = r6[r2]
            android.util.SparseBooleanArray r7 = r3.y0
            boolean r7 = r7.get(r2)
            if (r7 != 0) goto L_0x0398
            dc7 r7 = r3.B
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto L_0x039a
        L_0x0398:
            r7 = 0
            goto L_0x039d
        L_0x039a:
            r6 = 1
            r7 = 0
            goto L_0x03a0
        L_0x039d:
            r5[r2] = r7
            r6 = 1
        L_0x03a0:
            int r2 = r2 + r6
            goto L_0x037e
        L_0x03a2:
            r7 = 0
            pf6 r2 = r4.e
            zg0 r4 = r4.b
            defpackage.n79.o(r4)
            md5[] r2 = r2.e(r5, r4)
            s1d[] r4 = new defpackage.s1d[r1]
            r5 = 0
        L_0x03b1:
            r6 = -2
            if (r5 >= r1) goto L_0x03e0
            int[] r8 = r0.b
            r8 = r8[r5]
            android.util.SparseBooleanArray r11 = r3.y0
            boolean r11 = r11.get(r5)
            if (r11 != 0) goto L_0x03da
            dc7 r11 = r3.B
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r8 = r11.contains(r8)
            if (r8 == 0) goto L_0x03cd
            goto L_0x03da
        L_0x03cd:
            int[] r8 = r0.b
            r8 = r8[r5]
            if (r8 == r6) goto L_0x03d7
            r6 = r2[r5]
            if (r6 == 0) goto L_0x03da
        L_0x03d7:
            s1d r6 = defpackage.s1d.c
            goto L_0x03db
        L_0x03da:
            r6 = r7
        L_0x03db:
            r4[r5] = r6
            r6 = 1
            int r5 = r5 + r6
            goto L_0x03b1
        L_0x03e0:
            boolean r1 = r3.u0
            if (r1 == 0) goto L_0x044f
            r5 = r9
            r8 = r5
            r1 = 0
        L_0x03e7:
            int r11 = r0.a
            if (r1 >= r11) goto L_0x0439
            int[] r11 = r0.b
            r11 = r11[r1]
            r12 = r2[r1]
            r13 = 1
            if (r11 == r13) goto L_0x03fc
            r13 = 2
            if (r11 != r13) goto L_0x03f8
            goto L_0x03fd
        L_0x03f8:
            r6 = 32
        L_0x03fa:
            r13 = 1
            goto L_0x0435
        L_0x03fc:
            r13 = 2
        L_0x03fd:
            if (r12 == 0) goto L_0x03f8
            r14 = r10[r1]
            upf[] r15 = r0.c
            r15 = r15[r1]
            spf r7 = r12.a()
            int r7 = r15.b(r7)
            r15 = 0
        L_0x040e:
            int r13 = r12.length()
            if (r15 >= r13) goto L_0x0426
            r13 = r14[r7]
            int r18 = r12.f(r15)
            r13 = r13[r18]
            r6 = 32
            r13 = r13 & r6
            if (r13 == r6) goto L_0x0422
            goto L_0x03fa
        L_0x0422:
            r13 = 1
            int r15 = r15 + r13
            r6 = -2
            goto L_0x040e
        L_0x0426:
            r6 = 32
            r13 = 1
            if (r11 != r13) goto L_0x0431
            if (r8 == r9) goto L_0x042f
        L_0x042d:
            r1 = 0
            goto L_0x043a
        L_0x042f:
            r8 = r1
            goto L_0x0435
        L_0x0431:
            if (r5 == r9) goto L_0x0434
            goto L_0x042d
        L_0x0434:
            r5 = r1
        L_0x0435:
            int r1 = r1 + r13
            r6 = -2
            r7 = 0
            goto L_0x03e7
        L_0x0439:
            r1 = 1
        L_0x043a:
            if (r8 == r9) goto L_0x0440
            if (r5 == r9) goto L_0x0440
            r6 = 1
            goto L_0x0441
        L_0x0440:
            r6 = 0
        L_0x0441:
            r1 = r1 & r6
            if (r1 == 0) goto L_0x044f
            s1d r1 = new s1d
            r6 = 1
            r7 = 0
            r1.<init>(r7, r6)
            r4[r8] = r1
            r4[r5] = r1
        L_0x044f:
            gqf r1 = r3.s
            int r1 = r1.a
            if (r1 == 0) goto L_0x04ba
            r5 = r9
            r1 = 0
            r11 = 0
        L_0x0458:
            int r6 = r0.a
            if (r11 >= r6) goto L_0x049c
            int[] r6 = r0.b
            r6 = r6[r11]
            r7 = r2[r11]
            r8 = 1
            if (r6 == r8) goto L_0x0468
            if (r7 == 0) goto L_0x0468
            goto L_0x04ba
        L_0x0468:
            if (r6 != r8) goto L_0x0499
            if (r7 == 0) goto L_0x0499
            int r6 = r7.length()
            if (r6 != r8) goto L_0x0499
            upf[] r6 = r0.c
            r6 = r6[r11]
            spf r8 = r7.a()
            int r6 = r6.b(r8)
            r8 = r10[r11]
            r6 = r8[r6]
            r8 = 0
            int r12 = r7.f(r8)
            r6 = r6[r12]
            ea6 r7 = r7.j()
            boolean r6 = defpackage.sj4.i(r3, r6, r7)
            if (r6 == 0) goto L_0x0497
            r6 = 1
            int r1 = r1 + r6
            r5 = r11
            goto L_0x049a
        L_0x0497:
            r6 = 1
            goto L_0x049a
        L_0x0499:
            r6 = r8
        L_0x049a:
            int r11 = r11 + r6
            goto L_0x0458
        L_0x049c:
            r6 = 1
            if (r1 != r6) goto L_0x04ba
            s1d r1 = new s1d
            gqf r3 = r3.s
            boolean r3 = r3.b
            if (r3 == 0) goto L_0x04a9
            r3 = 1
            goto L_0x04aa
        L_0x04a9:
            r3 = 2
        L_0x04aa:
            r6 = r4[r5]
            if (r6 == 0) goto L_0x04b4
            boolean r6 = r6.b
            if (r6 == 0) goto L_0x04b4
            r6 = 1
            goto L_0x04b5
        L_0x04b4:
            r6 = 0
        L_0x04b5:
            r1.<init>(r3, r6)
            r4[r5] = r1
        L_0x04ba:
            android.util.Pair r1 = android.util.Pair.create(r4, r2)
            java.lang.Object r2 = r1.second
            md5[] r2 = (defpackage.md5[]) r2
            int r3 = r2.length
            java.util.List[] r3 = new java.util.List[r3]
            r11 = 0
        L_0x04c6:
            int r4 = r2.length
            if (r11 >= r4) goto L_0x04db
            r4 = r2[r11]
            if (r4 == 0) goto L_0x04d2
            k0d r4 = defpackage.tb7.t(r4)
            goto L_0x04d6
        L_0x04d2:
            lx5 r4 = defpackage.tb7.b
            k0d r4 = defpackage.k0d.v
        L_0x04d6:
            r3[r11] = r4
            r4 = 1
            int r11 = r11 + r4
            goto L_0x04c6
        L_0x04db:
            qb7 r2 = new qb7
            r4 = 4
            r2.<init>(r4)
            r11 = 0
        L_0x04e2:
            int r4 = r0.a
            if (r11 >= r4) goto L_0x05d5
            upf[] r4 = r0.c
            r5 = r4[r11]
            r6 = r3[r11]
            r7 = 0
        L_0x04ed:
            int r8 = r5.a
            if (r7 >= r8) goto L_0x05cc
            spf r8 = r5.a(r7)
            r10 = r4[r11]
            spf r10 = r10.a(r7)
            int r10 = r10.a
            int[] r12 = new int[r10]
            r13 = 0
            r14 = 0
        L_0x0501:
            if (r13 >= r10) goto L_0x051c
            int[][][] r15 = r0.e
            r15 = r15[r11]
            r15 = r15[r7]
            r15 = r15[r13]
            r15 = r15 & 7
            r9 = 4
            if (r15 == r9) goto L_0x0512
            r15 = 1
            goto L_0x0519
        L_0x0512:
            r15 = 1
            int r17 = r14 + 1
            r12[r14] = r13
            r14 = r17
        L_0x0519:
            int r13 = r13 + r15
            r9 = -1
            goto L_0x0501
        L_0x051c:
            r9 = 4
            int[] r10 = java.util.Arrays.copyOf(r12, r14)
            r12 = 16
            r19 = r3
            r9 = r12
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x052a:
            int r3 = r10.length
            if (r13 >= r3) goto L_0x0560
            r3 = r10[r13]
            r21 = r5
            r5 = r4[r11]
            spf r5 = r5.a(r7)
            ea6[] r5 = r5.d
            r3 = r5[r3]
            java.lang.String r3 = r3.n
            r5 = 1
            int r22 = r15 + 1
            if (r15 != 0) goto L_0x0544
            r12 = r3
            goto L_0x054b
        L_0x0544:
            boolean r3 = defpackage.v0g.a(r12, r3)
            r3 = r3 ^ r5
            r3 = r3 | r14
            r14 = r3
        L_0x054b:
            int[][][] r3 = r0.e
            r3 = r3[r11]
            r3 = r3[r7]
            r3 = r3[r13]
            r15 = 24
            r3 = r3 & r15
            int r9 = java.lang.Math.min(r9, r3)
            int r13 = r13 + r5
            r5 = r21
            r15 = r22
            goto L_0x052a
        L_0x0560:
            r21 = r5
            r15 = 24
            if (r14 == 0) goto L_0x056e
            int[] r3 = r0.d
            r3 = r3[r11]
            int r9 = java.lang.Math.min(r9, r3)
        L_0x056e:
            if (r9 == 0) goto L_0x0572
            r3 = 1
            goto L_0x0573
        L_0x0572:
            r3 = 0
        L_0x0573:
            int r5 = r8.a
            int[] r9 = new int[r5]
            boolean[] r5 = new boolean[r5]
            r10 = 0
        L_0x057a:
            int r12 = r8.a
            if (r10 >= r12) goto L_0x05ba
            int[][][] r12 = r0.e
            r12 = r12[r11]
            r12 = r12[r7]
            r12 = r12[r10]
            r12 = r12 & 7
            r9[r10] = r12
            r12 = 0
        L_0x058b:
            int r13 = r6.size()
            if (r12 >= r13) goto L_0x05b2
            java.lang.Object r13 = r6.get(r12)
            md5 r13 = (defpackage.md5) r13
            spf r14 = r13.a()
            boolean r14 = r14.equals(r8)
            if (r14 == 0) goto L_0x05ae
            int r13 = r13.p(r10)
            r14 = -1
            if (r13 == r14) goto L_0x05ac
            r13 = 1
            r17 = 1
            goto L_0x05b6
        L_0x05ac:
            r13 = 1
            goto L_0x05b0
        L_0x05ae:
            r14 = -1
            goto L_0x05ac
        L_0x05b0:
            int r12 = r12 + r13
            goto L_0x058b
        L_0x05b2:
            r13 = 1
            r14 = -1
            r17 = 0
        L_0x05b6:
            r5[r10] = r17
            int r10 = r10 + r13
            goto L_0x057a
        L_0x05ba:
            r13 = 1
            r14 = -1
            pqf r10 = new pqf
            r10.<init>(r8, r3, r9, r5)
            r2.a(r10)
            int r7 = r7 + r13
            r9 = r14
            r3 = r19
            r5 = r21
            goto L_0x04ed
        L_0x05cc:
            r19 = r3
            r14 = r9
            r13 = 1
            r15 = 24
            int r11 = r11 + r13
            goto L_0x04e2
        L_0x05d5:
            r11 = 0
        L_0x05d6:
            upf r3 = r0.f
            int r4 = r3.a
            if (r11 >= r4) goto L_0x05f7
            spf r3 = r3.a(r11)
            int r4 = r3.a
            int[] r4 = new int[r4]
            r5 = 0
            java.util.Arrays.fill(r4, r5)
            int r6 = r3.a
            boolean[] r6 = new boolean[r6]
            pqf r7 = new pqf
            r7.<init>(r3, r5, r4, r6)
            r2.a(r7)
            r3 = 1
            int r11 = r11 + r3
            goto L_0x05d6
        L_0x05f7:
            r5 = 0
            qqf r3 = new qqf
            k0d r2 = r2.j()
            r3.<init>(r2)
            mqf r2 = new mqf
            java.lang.Object r4 = r1.first
            s1d[] r4 = (defpackage.s1d[]) r4
            java.lang.Object r1 = r1.second
            md5[] r1 = (defpackage.md5[]) r1
            r2.<init>((defpackage.s1d[]) r4, (defpackage.md5[]) r1, (defpackage.qqf) r3, (defpackage.ne8) r0)
            r11 = r5
        L_0x060f:
            int r0 = r2.b
            if (r11 >= r0) goto L_0x064c
            boolean r0 = r2.N(r11)
            if (r0 == 0) goto L_0x0638
            java.lang.Object r0 = r2.v
            md5[] r0 = (defpackage.md5[]) r0
            r0 = r0[r11]
            if (r0 != 0) goto L_0x062f
            r0 = r28
            pk0[] r1 = r0.i
            r1 = r1[r11]
            int r1 = r1.b
            r3 = -2
            if (r1 != r3) goto L_0x062d
            goto L_0x0632
        L_0x062d:
            r1 = r5
            goto L_0x0633
        L_0x062f:
            r0 = r28
            r3 = -2
        L_0x0632:
            r1 = 1
        L_0x0633:
            defpackage.n79.n(r1)
        L_0x0636:
            r1 = 1
            goto L_0x064a
        L_0x0638:
            r0 = r28
            r3 = -2
            java.lang.Object r1 = r2.v
            md5[] r1 = (defpackage.md5[]) r1
            r1 = r1[r11]
            if (r1 != 0) goto L_0x0645
            r1 = 1
            goto L_0x0646
        L_0x0645:
            r1 = r5
        L_0x0646:
            defpackage.n79.n(r1)
            goto L_0x0636
        L_0x064a:
            int r11 = r11 + r1
            goto L_0x060f
        L_0x064c:
            java.lang.Object r0 = r2.v
            md5[] r0 = (defpackage.md5[]) r0
            int r1 = r0.length
        L_0x0651:
            if (r5 >= r1) goto L_0x065f
            r3 = r0[r5]
            r4 = r29
            if (r3 == 0) goto L_0x065c
            r3.l(r4)
        L_0x065c:
            r3 = 1
            int r5 = r5 + r3
            goto L_0x0651
        L_0x065f:
            return r2
        L_0x0660:
            monitor-exit(r1)     // Catch:{ all -> 0x0166 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ot8.h(float, jkf):mqf");
    }

    public final void i() {
        mt8 mt8 = this.a;
        if (mt8 instanceof i33) {
            long j2 = this.f.d;
            if (j2 == -9223372036854775807L) {
                j2 = Long.MIN_VALUE;
            }
            i33 i33 = (i33) mt8;
            i33.v = 0;
            i33.w = j2;
        }
    }
}
