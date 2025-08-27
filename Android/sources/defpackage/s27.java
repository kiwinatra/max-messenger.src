package defpackage;

/* renamed from: s27  reason: default package */
public final class s27 extends gng {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            iArr[0] = i6;
            iArr[1] = (int) ((((float) i6) * f) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0244, code lost:
        if (r3 != 1) goto L_0x029f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.cm4 r24) {
        /*
            r23 = this;
            r0 = r23
            int r1 = r0.j
            int r1 = defpackage.tr1.y(r1)
            r2 = 0
            r3 = 3
            if (r1 == r3) goto L_0x0381
            uo4 r1 = r0.e
            boolean r4 = r1.j
            fm4 r5 = r0.h
            fm4 r6 = r0.i
            r7 = 1056964608(0x3f000000, float:0.5)
            r8 = 1
            if (r4 != 0) goto L_0x029f
            int r4 = r0.d
            if (r4 != r3) goto L_0x029f
            tj3 r4 = r0.b
            int r9 = r4.r
            r10 = 2
            if (r9 == r10) goto L_0x0288
            if (r9 == r3) goto L_0x0028
            goto L_0x029f
        L_0x0028:
            int r9 = r4.s
            r10 = -1
            if (r9 == 0) goto L_0x0061
            if (r9 != r3) goto L_0x0030
            goto L_0x0061
        L_0x0030:
            int r9 = r4.X
            if (r9 == r10) goto L_0x0052
            if (r9 == 0) goto L_0x0047
            if (r9 == r8) goto L_0x003a
            r4 = r2
            goto L_0x005c
        L_0x003a:
            w2g r9 = r4.e
            uo4 r9 = r9.e
            int r9 = r9.g
            float r9 = (float) r9
            float r4 = r4.W
        L_0x0043:
            float r9 = r9 * r4
        L_0x0044:
            float r9 = r9 + r7
            int r4 = (int) r9
            goto L_0x005c
        L_0x0047:
            w2g r9 = r4.e
            uo4 r9 = r9.e
            int r9 = r9.g
            float r9 = (float) r9
            float r4 = r4.W
            float r9 = r9 / r4
            goto L_0x0044
        L_0x0052:
            w2g r9 = r4.e
            uo4 r9 = r9.e
            int r9 = r9.g
            float r9 = (float) r9
            float r4 = r4.W
            goto L_0x0043
        L_0x005c:
            r1.d(r4)
            goto L_0x029f
        L_0x0061:
            w2g r9 = r4.e
            fm4 r11 = r9.h
            fm4 r9 = r9.i
            aj3 r12 = r4.I
            aj3 r12 = r12.f
            if (r12 == 0) goto L_0x006f
            r12 = r8
            goto L_0x0070
        L_0x006f:
            r12 = r2
        L_0x0070:
            aj3 r13 = r4.J
            aj3 r13 = r13.f
            if (r13 == 0) goto L_0x0078
            r13 = r8
            goto L_0x0079
        L_0x0078:
            r13 = r2
        L_0x0079:
            aj3 r14 = r4.K
            aj3 r14 = r14.f
            if (r14 == 0) goto L_0x0081
            r14 = r8
            goto L_0x0082
        L_0x0081:
            r14 = r2
        L_0x0082:
            aj3 r15 = r4.L
            aj3 r15 = r15.f
            if (r15 == 0) goto L_0x008a
            r15 = r8
            goto L_0x008b
        L_0x008a:
            r15 = r2
        L_0x008b:
            int r3 = r4.X
            if (r12 == 0) goto L_0x01a3
            if (r13 == 0) goto L_0x01a3
            if (r14 == 0) goto L_0x01a3
            if (r15 == 0) goto L_0x01a3
            float r4 = r4.W
            boolean r10 = r11.j
            int[] r12 = k
            if (r10 == 0) goto L_0x00ec
            boolean r10 = r9.j
            if (r10 == 0) goto L_0x00ec
            boolean r7 = r5.c
            if (r7 == 0) goto L_0x00eb
            boolean r7 = r6.c
            if (r7 != 0) goto L_0x00aa
            goto L_0x00eb
        L_0x00aa:
            java.util.ArrayList r7 = r5.l
            java.lang.Object r7 = r7.get(r2)
            fm4 r7 = (defpackage.fm4) r7
            int r7 = r7.g
            int r5 = r5.f
            int r17 = r7 + r5
            java.util.ArrayList r5 = r6.l
            java.lang.Object r5 = r5.get(r2)
            fm4 r5 = (defpackage.fm4) r5
            int r5 = r5.g
            int r6 = r6.f
            int r18 = r5 - r6
            int r5 = r11.g
            int r6 = r11.f
            int r19 = r5 + r6
            int r5 = r9.g
            int r6 = r9.f
            int r20 = r5 - r6
            r16 = r12
            r21 = r4
            r22 = r3
            m(r16, r17, r18, r19, r20, r21, r22)
            r2 = r12[r2]
            r1.d(r2)
            tj3 r0 = r0.b
            w2g r0 = r0.e
            uo4 r0 = r0.e
            r1 = r12[r8]
            r0.d(r1)
        L_0x00eb:
            return
        L_0x00ec:
            boolean r10 = r5.j
            java.util.ArrayList r13 = r11.l
            if (r10 == 0) goto L_0x0140
            boolean r10 = r6.j
            if (r10 == 0) goto L_0x0140
            boolean r10 = r11.c
            if (r10 == 0) goto L_0x013f
            boolean r10 = r9.c
            if (r10 != 0) goto L_0x00ff
            goto L_0x013f
        L_0x00ff:
            int r10 = r5.g
            int r14 = r5.f
            int r17 = r10 + r14
            int r10 = r6.g
            int r14 = r6.f
            int r18 = r10 - r14
            java.lang.Object r10 = r13.get(r2)
            fm4 r10 = (defpackage.fm4) r10
            int r10 = r10.g
            int r14 = r11.f
            int r19 = r10 + r14
            java.util.ArrayList r10 = r9.l
            java.lang.Object r10 = r10.get(r2)
            fm4 r10 = (defpackage.fm4) r10
            int r10 = r10.g
            int r14 = r9.f
            int r20 = r10 - r14
            r16 = r12
            r21 = r4
            r22 = r3
            m(r16, r17, r18, r19, r20, r21, r22)
            r10 = r12[r2]
            r1.d(r10)
            tj3 r10 = r0.b
            w2g r10 = r10.e
            uo4 r10 = r10.e
            r14 = r12[r8]
            r10.d(r14)
            goto L_0x0140
        L_0x013f:
            return
        L_0x0140:
            boolean r10 = r5.c
            if (r10 == 0) goto L_0x01a2
            boolean r10 = r6.c
            if (r10 == 0) goto L_0x01a2
            boolean r10 = r11.c
            if (r10 == 0) goto L_0x01a2
            boolean r10 = r9.c
            if (r10 != 0) goto L_0x0151
            goto L_0x01a2
        L_0x0151:
            java.util.ArrayList r10 = r5.l
            java.lang.Object r10 = r10.get(r2)
            fm4 r10 = (defpackage.fm4) r10
            int r10 = r10.g
            int r14 = r5.f
            int r17 = r10 + r14
            java.util.ArrayList r10 = r6.l
            java.lang.Object r10 = r10.get(r2)
            fm4 r10 = (defpackage.fm4) r10
            int r10 = r10.g
            int r14 = r6.f
            int r18 = r10 - r14
            java.lang.Object r10 = r13.get(r2)
            fm4 r10 = (defpackage.fm4) r10
            int r10 = r10.g
            int r11 = r11.f
            int r19 = r10 + r11
            java.util.ArrayList r10 = r9.l
            java.lang.Object r10 = r10.get(r2)
            fm4 r10 = (defpackage.fm4) r10
            int r10 = r10.g
            int r9 = r9.f
            int r20 = r10 - r9
            r16 = r12
            r21 = r4
            r22 = r3
            m(r16, r17, r18, r19, r20, r21, r22)
            r3 = r12[r2]
            r1.d(r3)
            tj3 r3 = r0.b
            w2g r3 = r3.e
            uo4 r3 = r3.e
            r4 = r12[r8]
            r3.d(r4)
            goto L_0x029f
        L_0x01a2:
            return
        L_0x01a3:
            if (r12 == 0) goto L_0x0217
            if (r14 == 0) goto L_0x0217
            boolean r9 = r5.c
            if (r9 == 0) goto L_0x0216
            boolean r9 = r6.c
            if (r9 != 0) goto L_0x01b0
            goto L_0x0216
        L_0x01b0:
            float r4 = r4.W
            java.util.ArrayList r9 = r5.l
            java.lang.Object r9 = r9.get(r2)
            fm4 r9 = (defpackage.fm4) r9
            int r9 = r9.g
            int r11 = r5.f
            int r9 = r9 + r11
            java.util.ArrayList r11 = r6.l
            java.lang.Object r11 = r11.get(r2)
            fm4 r11 = (defpackage.fm4) r11
            int r11 = r11.g
            int r12 = r6.f
            int r11 = r11 - r12
            if (r3 == r10) goto L_0x01f5
            if (r3 == 0) goto L_0x01f5
            if (r3 == r8) goto L_0x01d4
            goto L_0x029f
        L_0x01d4:
            int r11 = r11 - r9
            int r3 = r0.g(r11, r2)
            float r9 = (float) r3
            float r9 = r9 / r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r8)
            if (r9 == r10) goto L_0x01e7
            float r3 = (float) r10
            float r3 = r3 * r4
            float r3 = r3 + r7
            int r3 = (int) r3
        L_0x01e7:
            r1.d(r3)
            tj3 r3 = r0.b
            w2g r3 = r3.e
            uo4 r3 = r3.e
            r3.d(r10)
            goto L_0x029f
        L_0x01f5:
            int r11 = r11 - r9
            int r3 = r0.g(r11, r2)
            float r9 = (float) r3
            float r9 = r9 * r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r8)
            if (r9 == r10) goto L_0x0208
            float r3 = (float) r10
            float r3 = r3 / r4
            float r3 = r3 + r7
            int r3 = (int) r3
        L_0x0208:
            r1.d(r3)
            tj3 r3 = r0.b
            w2g r3 = r3.e
            uo4 r3 = r3.e
            r3.d(r10)
            goto L_0x029f
        L_0x0216:
            return
        L_0x0217:
            if (r13 == 0) goto L_0x029f
            if (r15 == 0) goto L_0x029f
            boolean r12 = r11.c
            if (r12 == 0) goto L_0x0287
            boolean r12 = r9.c
            if (r12 != 0) goto L_0x0224
            goto L_0x0287
        L_0x0224:
            float r4 = r4.W
            java.util.ArrayList r12 = r11.l
            java.lang.Object r12 = r12.get(r2)
            fm4 r12 = (defpackage.fm4) r12
            int r12 = r12.g
            int r11 = r11.f
            int r12 = r12 + r11
            java.util.ArrayList r11 = r9.l
            java.lang.Object r11 = r11.get(r2)
            fm4 r11 = (defpackage.fm4) r11
            int r11 = r11.g
            int r9 = r9.f
            int r11 = r11 - r9
            if (r3 == r10) goto L_0x0267
            if (r3 == 0) goto L_0x0247
            if (r3 == r8) goto L_0x0267
            goto L_0x029f
        L_0x0247:
            int r11 = r11 - r12
            int r3 = r0.g(r11, r8)
            float r9 = (float) r3
            float r9 = r9 * r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r2)
            if (r9 == r10) goto L_0x025a
            float r3 = (float) r10
            float r3 = r3 / r4
            float r3 = r3 + r7
            int r3 = (int) r3
        L_0x025a:
            r1.d(r10)
            tj3 r4 = r0.b
            w2g r4 = r4.e
            uo4 r4 = r4.e
            r4.d(r3)
            goto L_0x029f
        L_0x0267:
            int r11 = r11 - r12
            int r3 = r0.g(r11, r8)
            float r9 = (float) r3
            float r9 = r9 / r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r2)
            if (r9 == r10) goto L_0x027a
            float r3 = (float) r10
            float r3 = r3 * r4
            float r3 = r3 + r7
            int r3 = (int) r3
        L_0x027a:
            r1.d(r10)
            tj3 r4 = r0.b
            w2g r4 = r4.e
            uo4 r4 = r4.e
            r4.d(r3)
            goto L_0x029f
        L_0x0287:
            return
        L_0x0288:
            tj3 r3 = r4.T
            if (r3 == 0) goto L_0x029f
            s27 r3 = r3.d
            uo4 r3 = r3.e
            boolean r9 = r3.j
            if (r9 == 0) goto L_0x029f
            float r4 = r4.w
            int r3 = r3.g
            float r3 = (float) r3
            float r3 = r3 * r4
            float r3 = r3 + r7
            int r3 = (int) r3
            r1.d(r3)
        L_0x029f:
            boolean r3 = r5.c
            if (r3 == 0) goto L_0x0380
            boolean r3 = r6.c
            if (r3 != 0) goto L_0x02a9
            goto L_0x0380
        L_0x02a9:
            boolean r3 = r5.j
            if (r3 == 0) goto L_0x02b6
            boolean r3 = r6.j
            if (r3 == 0) goto L_0x02b6
            boolean r3 = r1.j
            if (r3 == 0) goto L_0x02b6
            return
        L_0x02b6:
            boolean r3 = r1.j
            if (r3 != 0) goto L_0x02f1
            int r3 = r0.d
            r4 = 3
            if (r3 != r4) goto L_0x02f1
            tj3 r3 = r0.b
            int r4 = r3.r
            if (r4 != 0) goto L_0x02f1
            boolean r3 = r3.x()
            if (r3 != 0) goto L_0x02f1
            java.util.ArrayList r0 = r5.l
            java.lang.Object r0 = r0.get(r2)
            fm4 r0 = (defpackage.fm4) r0
            java.util.ArrayList r3 = r6.l
            java.lang.Object r2 = r3.get(r2)
            fm4 r2 = (defpackage.fm4) r2
            int r0 = r0.g
            int r3 = r5.f
            int r0 = r0 + r3
            int r2 = r2.g
            int r3 = r6.f
            int r2 = r2 + r3
            int r3 = r2 - r0
            r5.d(r0)
            r6.d(r2)
            r1.d(r3)
            return
        L_0x02f1:
            boolean r3 = r1.j
            if (r3 != 0) goto L_0x0342
            int r3 = r0.d
            r4 = 3
            if (r3 != r4) goto L_0x0342
            int r3 = r0.a
            if (r3 != r8) goto L_0x0342
            java.util.ArrayList r3 = r5.l
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0342
            java.util.ArrayList r3 = r6.l
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0342
            java.util.ArrayList r3 = r5.l
            java.lang.Object r3 = r3.get(r2)
            fm4 r3 = (defpackage.fm4) r3
            java.util.ArrayList r4 = r6.l
            java.lang.Object r4 = r4.get(r2)
            fm4 r4 = (defpackage.fm4) r4
            int r3 = r3.g
            int r8 = r5.f
            int r3 = r3 + r8
            int r4 = r4.g
            int r8 = r6.f
            int r4 = r4 + r8
            int r4 = r4 - r3
            int r3 = r1.m
            int r3 = java.lang.Math.min(r4, r3)
            tj3 r4 = r0.b
            int r8 = r4.v
            int r4 = r4.u
            int r3 = java.lang.Math.max(r4, r3)
            if (r8 <= 0) goto L_0x033f
            int r3 = java.lang.Math.min(r8, r3)
        L_0x033f:
            r1.d(r3)
        L_0x0342:
            boolean r3 = r1.j
            if (r3 != 0) goto L_0x0347
            return
        L_0x0347:
            java.util.ArrayList r3 = r5.l
            java.lang.Object r3 = r3.get(r2)
            fm4 r3 = (defpackage.fm4) r3
            java.util.ArrayList r4 = r6.l
            java.lang.Object r2 = r4.get(r2)
            fm4 r2 = (defpackage.fm4) r2
            int r4 = r3.g
            int r8 = r5.f
            int r8 = r8 + r4
            int r9 = r2.g
            int r10 = r6.f
            int r10 = r10 + r9
            tj3 r0 = r0.b
            float r0 = r0.d0
            if (r3 != r2) goto L_0x0369
            r0 = r7
            goto L_0x036b
        L_0x0369:
            r4 = r8
            r9 = r10
        L_0x036b:
            int r9 = r9 - r4
            int r2 = r1.g
            int r9 = r9 - r2
            float r2 = (float) r4
            float r2 = r2 + r7
            float r3 = (float) r9
            float r3 = r3 * r0
            float r3 = r3 + r2
            int r0 = (int) r3
            r5.d(r0)
            int r0 = r5.g
            int r1 = r1.g
            int r0 = r0 + r1
            r6.d(r0)
        L_0x0380:
            return
        L_0x0381:
            tj3 r1 = r0.b
            aj3 r3 = r1.I
            aj3 r1 = r1.K
            r0.l(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s27.a(cm4):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
        r0 = r11.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r11 = this;
            tj3 r0 = r11.b
            boolean r1 = r0.a
            uo4 r2 = r11.e
            if (r1 == 0) goto L_0x000f
            int r0 = r0.q()
            r2.d(r0)
        L_0x000f:
            boolean r0 = r2.j
            fm4 r1 = r11.i
            fm4 r3 = r11.h
            r4 = 1
            r5 = 3
            r6 = 4
            r7 = 0
            if (r0 != 0) goto L_0x0076
            tj3 r0 = r11.b
            int[] r8 = r0.p0
            r8 = r8[r7]
            r11.d = r8
            if (r8 == r5) goto L_0x00a6
            if (r8 != r6) goto L_0x006c
            tj3 r9 = r0.T
            if (r9 == 0) goto L_0x006c
            int[] r10 = r9.p0
            r10 = r10[r7]
            if (r10 == r4) goto L_0x0033
            if (r10 != r6) goto L_0x006c
        L_0x0033:
            int r0 = r9.q()
            tj3 r4 = r11.b
            aj3 r4 = r4.I
            int r4 = r4.e()
            int r0 = r0 - r4
            tj3 r4 = r11.b
            aj3 r4 = r4.K
            int r4 = r4.e()
            int r0 = r0 - r4
            s27 r4 = r9.d
            fm4 r4 = r4.h
            tj3 r5 = r11.b
            aj3 r5 = r5.I
            int r5 = r5.e()
            defpackage.gng.b(r3, r4, r5)
            s27 r3 = r9.d
            fm4 r3 = r3.i
            tj3 r11 = r11.b
            aj3 r11 = r11.K
            int r11 = r11.e()
            int r11 = -r11
            defpackage.gng.b(r1, r3, r11)
            r2.d(r0)
            return
        L_0x006c:
            if (r8 != r4) goto L_0x00a6
            int r0 = r0.q()
            r2.d(r0)
            goto L_0x00a6
        L_0x0076:
            int r0 = r11.d
            if (r0 != r6) goto L_0x00a6
            tj3 r0 = r11.b
            tj3 r8 = r0.T
            if (r8 == 0) goto L_0x00a6
            int[] r9 = r8.p0
            r9 = r9[r7]
            if (r9 == r4) goto L_0x0088
            if (r9 != r6) goto L_0x00a6
        L_0x0088:
            s27 r2 = r8.d
            fm4 r2 = r2.h
            aj3 r0 = r0.I
            int r0 = r0.e()
            defpackage.gng.b(r3, r2, r0)
            s27 r0 = r8.d
            fm4 r0 = r0.i
            tj3 r11 = r11.b
            aj3 r11 = r11.K
            int r11 = r11.e()
            int r11 = -r11
            defpackage.gng.b(r1, r0, r11)
            return
        L_0x00a6:
            boolean r0 = r2.j
            if (r0 == 0) goto L_0x017d
            tj3 r0 = r11.b
            boolean r8 = r0.a
            if (r8 == 0) goto L_0x017d
            aj3[] r5 = r0.Q
            r6 = r5[r7]
            aj3 r8 = r6.f
            if (r8 == 0) goto L_0x0118
            r9 = r5[r4]
            aj3 r9 = r9.f
            if (r9 == 0) goto L_0x0118
            boolean r0 = r0.x()
            if (r0 == 0) goto L_0x00df
            tj3 r0 = r11.b
            aj3[] r0 = r0.Q
            r0 = r0[r7]
            int r0 = r0.e()
            r3.f = r0
            tj3 r11 = r11.b
            aj3[] r11 = r11.Q
            r11 = r11[r4]
            int r11 = r11.e()
            int r11 = -r11
            r1.f = r11
            goto L_0x0313
        L_0x00df:
            tj3 r0 = r11.b
            aj3[] r0 = r0.Q
            r0 = r0[r7]
            fm4 r0 = defpackage.gng.h(r0)
            if (r0 == 0) goto L_0x00f8
            tj3 r2 = r11.b
            aj3[] r2 = r2.Q
            r2 = r2[r7]
            int r2 = r2.e()
            defpackage.gng.b(r3, r0, r2)
        L_0x00f8:
            tj3 r0 = r11.b
            aj3[] r0 = r0.Q
            r0 = r0[r4]
            fm4 r0 = defpackage.gng.h(r0)
            if (r0 == 0) goto L_0x0112
            tj3 r11 = r11.b
            aj3[] r11 = r11.Q
            r11 = r11[r4]
            int r11 = r11.e()
            int r11 = -r11
            defpackage.gng.b(r1, r0, r11)
        L_0x0112:
            r3.b = r4
            r1.b = r4
            goto L_0x0313
        L_0x0118:
            if (r8 == 0) goto L_0x0134
            fm4 r0 = defpackage.gng.h(r6)
            if (r0 == 0) goto L_0x0313
            tj3 r11 = r11.b
            aj3[] r11 = r11.Q
            r11 = r11[r7]
            int r11 = r11.e()
            defpackage.gng.b(r3, r0, r11)
            int r11 = r2.g
            defpackage.gng.b(r1, r3, r11)
            goto L_0x0313
        L_0x0134:
            r5 = r5[r4]
            aj3 r6 = r5.f
            if (r6 == 0) goto L_0x0156
            fm4 r0 = defpackage.gng.h(r5)
            if (r0 == 0) goto L_0x0313
            tj3 r11 = r11.b
            aj3[] r11 = r11.Q
            r11 = r11[r4]
            int r11 = r11.e()
            int r11 = -r11
            defpackage.gng.b(r1, r0, r11)
            int r11 = r2.g
            int r11 = -r11
            defpackage.gng.b(r3, r1, r11)
            goto L_0x0313
        L_0x0156:
            boolean r4 = r0 instanceof defpackage.cy6
            if (r4 != 0) goto L_0x0313
            tj3 r4 = r0.T
            if (r4 == 0) goto L_0x0313
            r4 = 7
            aj3 r0 = r0.i(r4)
            aj3 r0 = r0.f
            if (r0 != 0) goto L_0x0313
            tj3 r11 = r11.b
            tj3 r0 = r11.T
            s27 r0 = r0.d
            fm4 r0 = r0.h
            int r11 = r11.r()
            defpackage.gng.b(r3, r0, r11)
            int r11 = r2.g
            defpackage.gng.b(r1, r3, r11)
            goto L_0x0313
        L_0x017d:
            int r0 = r11.d
            if (r0 != r5) goto L_0x0273
            tj3 r0 = r11.b
            int r8 = r0.r
            r9 = 2
            if (r8 == r9) goto L_0x0254
            if (r8 == r5) goto L_0x018c
            goto L_0x0273
        L_0x018c:
            int r8 = r0.s
            if (r8 != r5) goto L_0x0219
            r3.a = r11
            r1.a = r11
            w2g r5 = r0.e
            fm4 r8 = r5.h
            r8.a = r11
            fm4 r5 = r5.i
            r5.a = r11
            r2.a = r11
            boolean r0 = r0.y()
            if (r0 == 0) goto L_0x01ee
            java.util.ArrayList r0 = r2.l
            tj3 r5 = r11.b
            w2g r5 = r5.e
            uo4 r5 = r5.e
            r0.add(r5)
            tj3 r0 = r11.b
            w2g r0 = r0.e
            uo4 r0 = r0.e
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            tj3 r0 = r11.b
            w2g r0 = r0.e
            uo4 r5 = r0.e
            r5.a = r11
            java.util.ArrayList r5 = r2.l
            fm4 r0 = r0.h
            r5.add(r0)
            java.util.ArrayList r0 = r2.l
            tj3 r5 = r11.b
            w2g r5 = r5.e
            fm4 r5 = r5.i
            r0.add(r5)
            tj3 r0 = r11.b
            w2g r0 = r0.e
            fm4 r0 = r0.h
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            tj3 r0 = r11.b
            w2g r0 = r0.e
            fm4 r0 = r0.i
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            goto L_0x0273
        L_0x01ee:
            tj3 r0 = r11.b
            boolean r0 = r0.x()
            if (r0 == 0) goto L_0x020d
            tj3 r0 = r11.b
            w2g r0 = r0.e
            uo4 r0 = r0.e
            java.util.ArrayList r0 = r0.l
            r0.add(r2)
            java.util.ArrayList r0 = r2.k
            tj3 r5 = r11.b
            w2g r5 = r5.e
            uo4 r5 = r5.e
            r0.add(r5)
            goto L_0x0273
        L_0x020d:
            tj3 r0 = r11.b
            w2g r0 = r0.e
            uo4 r0 = r0.e
            java.util.ArrayList r0 = r0.l
            r0.add(r2)
            goto L_0x0273
        L_0x0219:
            w2g r0 = r0.e
            uo4 r0 = r0.e
            java.util.ArrayList r5 = r2.l
            r5.add(r0)
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            tj3 r0 = r11.b
            w2g r0 = r0.e
            fm4 r0 = r0.h
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            tj3 r0 = r11.b
            w2g r0 = r0.e
            fm4 r0 = r0.i
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            r2.b = r4
            java.util.ArrayList r0 = r2.k
            r0.add(r3)
            java.util.ArrayList r0 = r2.k
            r0.add(r1)
            java.util.ArrayList r0 = r3.l
            r0.add(r2)
            java.util.ArrayList r0 = r1.l
            r0.add(r2)
            goto L_0x0273
        L_0x0254:
            tj3 r0 = r0.T
            if (r0 != 0) goto L_0x0259
            goto L_0x0273
        L_0x0259:
            w2g r0 = r0.e
            uo4 r0 = r0.e
            java.util.ArrayList r5 = r2.l
            r5.add(r0)
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            r2.b = r4
            java.util.ArrayList r0 = r2.k
            r0.add(r3)
            java.util.ArrayList r0 = r2.k
            r0.add(r1)
        L_0x0273:
            tj3 r0 = r11.b
            aj3[] r5 = r0.Q
            r8 = r5[r7]
            aj3 r9 = r8.f
            if (r9 == 0) goto L_0x02c5
            r10 = r5[r4]
            aj3 r10 = r10.f
            if (r10 == 0) goto L_0x02c5
            boolean r0 = r0.x()
            if (r0 == 0) goto L_0x02a4
            tj3 r0 = r11.b
            aj3[] r0 = r0.Q
            r0 = r0[r7]
            int r0 = r0.e()
            r3.f = r0
            tj3 r11 = r11.b
            aj3[] r11 = r11.Q
            r11 = r11[r4]
            int r11 = r11.e()
            int r11 = -r11
            r1.f = r11
            goto L_0x0313
        L_0x02a4:
            tj3 r0 = r11.b
            aj3[] r0 = r0.Q
            r0 = r0[r7]
            fm4 r0 = defpackage.gng.h(r0)
            tj3 r1 = r11.b
            aj3[] r1 = r1.Q
            r1 = r1[r4]
            fm4 r1 = defpackage.gng.h(r1)
            if (r0 == 0) goto L_0x02bd
            r0.b(r11)
        L_0x02bd:
            if (r1 == 0) goto L_0x02c2
            r1.b(r11)
        L_0x02c2:
            r11.j = r6
            goto L_0x0313
        L_0x02c5:
            if (r9 == 0) goto L_0x02de
            fm4 r0 = defpackage.gng.h(r8)
            if (r0 == 0) goto L_0x0313
            tj3 r5 = r11.b
            aj3[] r5 = r5.Q
            r5 = r5[r7]
            int r5 = r5.e()
            defpackage.gng.b(r3, r0, r5)
            r11.c(r1, r3, r4, r2)
            goto L_0x0313
        L_0x02de:
            r5 = r5[r4]
            aj3 r6 = r5.f
            if (r6 == 0) goto L_0x02fd
            fm4 r0 = defpackage.gng.h(r5)
            if (r0 == 0) goto L_0x0313
            tj3 r5 = r11.b
            aj3[] r5 = r5.Q
            r4 = r5[r4]
            int r4 = r4.e()
            int r4 = -r4
            defpackage.gng.b(r1, r0, r4)
            r0 = -1
            r11.c(r3, r1, r0, r2)
            goto L_0x0313
        L_0x02fd:
            boolean r5 = r0 instanceof defpackage.cy6
            if (r5 != 0) goto L_0x0313
            tj3 r5 = r0.T
            if (r5 == 0) goto L_0x0313
            s27 r5 = r5.d
            fm4 r5 = r5.h
            int r0 = r0.r()
            defpackage.gng.b(r3, r5, r0)
            r11.c(r1, r3, r4, r2)
        L_0x0313:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s27.d():void");
    }

    public final void e() {
        fm4 fm4 = this.h;
        if (fm4.j) {
            this.b.Y = fm4.g;
        }
    }

    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    public final boolean k() {
        return this.d != 3 || this.b.r == 0;
    }

    public final void n() {
        this.g = false;
        fm4 fm4 = this.h;
        fm4.c();
        fm4.j = false;
        fm4 fm42 = this.i;
        fm42.c();
        fm42.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.h0;
    }
}
