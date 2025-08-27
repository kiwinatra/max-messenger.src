package defpackage;

/* renamed from: hz9  reason: default package */
public final class hz9 extends ra8 {
    public int f;

    public final int b(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-((long) i6)) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & -9187201950435737472L;
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final void c(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, bed.d(i)) : 0;
        this.d = max;
        if (max == 0) {
            jArr = bed.a;
        } else {
            jArr = new long[(((max + 15) & -8) >> 3)];
            ArraysKt___ArraysJvmKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.a = jArr;
        int i2 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.f = bed.a(this.d) - this.e;
        this.b = new long[max];
        this.c = new long[max];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0073, code lost:
        r1 = b(r3);
        r5 = 128;
        r8 = 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007d, code lost:
        if (r0.f != 0) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008f, code lost:
        if (((r0.a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0091, code lost:
        r30 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0097, code lost:
        if (r0.d <= 8) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0099, code lost:
        r20 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b1, code lost:
        if (java.lang.Long.compareUnsigned(defpackage.wj6.f((long) r0.e, 32), defpackage.wj6.f((long) r0.d, 25)) > 0) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b3, code lost:
        r1 = r0.a;
        r2 = r0.d;
        r3 = 0;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b9, code lost:
        if (r3 >= r2) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00bb, code lost:
        r7 = r3 >> 3;
        r12 = (r3 & 7) << 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c7, code lost:
        if (((r1[r7] >> r12) & 255) != 254) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c9, code lost:
        r14 = r0.a;
        r18 = r14;
        r18[r7] = (r14[r7] & (~(255 << r12))) | (r5 << r12);
        r7 = r0.d;
        r12 = ((r3 - 7) & r7) + (r7 & 7);
        r7 = r12 >> 3;
        r12 = (r12 & 7) << 3;
        r18[r7] = ((~(255 << r12)) & r18[r7]) | (128 << r12);
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f8, code lost:
        r3 = r3 + 1;
        r5 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00fe, code lost:
        r0.f += r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0103, code lost:
        r30 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0109, code lost:
        r20 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x010b, code lost:
        r1 = defpackage.bed.c(r0.d);
        r2 = r0.a;
        r3 = r0.b;
        r4 = r0.c;
        r5 = r0.d;
        c(r1);
        r1 = r0.b;
        r6 = r0.c;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0121, code lost:
        if (r7 >= r5) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0132, code lost:
        if (((r2[r7 >> 3] >> ((r7 & 7) << 3)) & r8) >= 128) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0134, code lost:
        r13 = r3[r7];
        r16 = java.lang.Long.hashCode(r13) * -862048943;
        r16 = r16 ^ (r16 << 16);
        r12 = b(r16 >>> 7);
        r8 = (long) (r16 & 127);
        r15 = r0.a;
        r16 = r12 >> 3;
        r25 = (r12 & 7) << 3;
        r28 = r2;
        r29 = r3;
        r15[r16] = (r15[r16] & (~(255 << r25))) | (r8 << r25);
        r2 = r0.d;
        r3 = ((r12 - 7) & r2) + (r2 & 7);
        r2 = r3 >> 3;
        r3 = (r3 & 7) << 3;
        r30 = r10;
        r15[r2] = (r8 << r3) | (r15[r2] & (~(255 << r3)));
        r1[r12] = r13;
        r6[r12] = r4[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x018b, code lost:
        r28 = r2;
        r29 = r3;
        r30 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0191, code lost:
        r7 = r7 + 1;
        r2 = r28;
        r3 = r29;
        r10 = r30;
        r8 = 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x019c, code lost:
        r1 = b(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01a0, code lost:
        r3 = 1;
        r0.e++;
        r2 = r0.f;
        r4 = r0.a;
        r5 = r1 >> 3;
        r6 = r4[r5];
        r8 = (r1 & 7) << 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01bb, code lost:
        if (((r6 >> r8) & 255) != 128) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01be, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01bf, code lost:
        r0.f = r2 - r3;
        r4[r5] = ((~(255 << r8)) & r6) | (r30 << r8);
        r2 = r0.d;
        r3 = ((r1 - 7) & r2) + (r2 & 7);
        r2 = r3 >> 3;
        r3 = (r3 & 7) << 3;
        r4[r2] = (r4[r2] & (~(255 << r3))) | (r30 << r3);
        r1 = ~r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0071, code lost:
        if (((((~r8) << 6) & r8) & -9187201950435737472L) == 0) goto L_0x01f2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(long r33, long r35) {
        /*
            r32 = this;
            r0 = r32
            int r1 = java.lang.Long.hashCode(r33)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r3 = r1 << 16
            r1 = r1 ^ r3
            int r3 = r1 >>> 7
            r1 = r1 & 127(0x7f, float:1.78E-43)
            int r4 = r0.d
            r5 = r3 & r4
            r7 = 0
        L_0x0016:
            long[] r8 = r0.a
            int r9 = r5 >> 3
            r10 = r5 & 7
            int r10 = r10 << 3
            r11 = r8[r9]
            long r11 = r11 >>> r10
            r13 = 1
            int r9 = r9 + r13
            r8 = r8[r9]
            int r14 = 64 - r10
            long r8 = r8 << r14
            long r14 = (long) r10
            long r14 = -r14
            r10 = 63
            long r14 = r14 >> r10
            long r8 = r8 & r14
            long r8 = r8 | r11
            long r10 = (long) r1
            r14 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r16 = r10 * r14
            r18 = r7
            long r6 = r8 ^ r16
            long r14 = r6 - r14
            long r6 = ~r6
            long r6 = r6 & r14
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r14
        L_0x0045:
            r16 = 0
            int r19 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r19 == 0) goto L_0x0068
            int r16 = java.lang.Long.numberOfTrailingZeros(r6)
            int r16 = r16 >> 3
            int r16 = r5 + r16
            r16 = r16 & r4
            long[] r12 = r0.b
            r20 = r12[r16]
            int r12 = (r20 > r33 ? 1 : (r20 == r33 ? 0 : -1))
            if (r12 != 0) goto L_0x0061
            r1 = r16
            goto L_0x01e6
        L_0x0061:
            r16 = 1
            long r16 = r6 - r16
            long r6 = r6 & r16
            goto L_0x0045
        L_0x0068:
            long r6 = ~r8
            r12 = 6
            long r6 = r6 << r12
            long r6 = r6 & r8
            long r6 = r6 & r14
            int r6 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            r7 = 8
            if (r6 == 0) goto L_0x01f2
            int r1 = r0.b(r3)
            int r4 = r0.f
            r5 = 128(0x80, double:6.32E-322)
            r8 = 255(0xff, double:1.26E-321)
            if (r4 != 0) goto L_0x0091
            long[] r4 = r0.a
            int r12 = r1 >> 3
            r14 = r4[r12]
            r4 = r1 & 7
            int r4 = r4 << 3
            long r14 = r14 >> r4
            long r14 = r14 & r8
            r16 = 254(0xfe, double:1.255E-321)
            int r4 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r4 != 0) goto L_0x0095
        L_0x0091:
            r30 = r10
            goto L_0x01a0
        L_0x0095:
            int r1 = r0.d
            if (r1 <= r7) goto L_0x0109
            int r1 = r0.e
            long r14 = (long) r1
            r20 = r3
            r2 = 32
            long r1 = defpackage.wj6.f(r14, r2)
            int r3 = r0.d
            long r3 = (long) r3
            r14 = 25
            long r3 = defpackage.wj6.f(r3, r14)
            int r1 = java.lang.Long.compareUnsigned(r1, r3)
            if (r1 > 0) goto L_0x010b
            long[] r1 = r0.a
            int r2 = r0.d
            r3 = 0
            r4 = 0
        L_0x00b9:
            if (r3 >= r2) goto L_0x00fe
            int r7 = r3 >> 3
            r14 = r1[r7]
            r12 = r3 & 7
            int r12 = r12 << 3
            long r14 = r14 >> r12
            long r14 = r14 & r8
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 != 0) goto L_0x00f8
            long[] r14 = r0.a
            r21 = r14[r7]
            r18 = r14
            long r13 = r8 << r12
            long r13 = ~r13
            long r13 = r21 & r13
            long r21 = r5 << r12
            long r12 = r13 | r21
            r18[r7] = r12
            int r7 = r0.d
            int r12 = r3 + -7
            r12 = r12 & r7
            r7 = r7 & 7
            int r12 = r12 + r7
            int r7 = r12 >> 3
            r12 = r12 & 7
            int r12 = r12 << 3
            r13 = r18[r7]
            long r5 = r8 << r12
            long r5 = ~r5
            long r5 = r5 & r13
            r13 = 128(0x80, double:6.32E-322)
            long r23 = r13 << r12
            long r5 = r5 | r23
            r18[r7] = r5
            int r4 = r4 + 1
        L_0x00f8:
            int r3 = r3 + 1
            r5 = 128(0x80, double:6.32E-322)
            r13 = 1
            goto L_0x00b9
        L_0x00fe:
            int r1 = r0.f
            int r1 = r1 + r4
            r0.f = r1
        L_0x0103:
            r30 = r10
            r2 = r20
            goto L_0x019c
        L_0x0109:
            r20 = r3
        L_0x010b:
            int r1 = r0.d
            int r1 = defpackage.bed.c(r1)
            long[] r2 = r0.a
            long[] r3 = r0.b
            long[] r4 = r0.c
            int r5 = r0.d
            r0.c(r1)
            long[] r1 = r0.b
            long[] r6 = r0.c
            r7 = 0
        L_0x0121:
            if (r7 >= r5) goto L_0x0103
            int r13 = r7 >> 3
            r13 = r2[r13]
            r16 = r7 & 7
            int r16 = r16 << 3
            long r13 = r13 >> r16
            long r13 = r13 & r8
            r16 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 >= 0) goto L_0x018b
            r13 = r3[r7]
            int r16 = java.lang.Long.hashCode(r13)
            r12 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r16 = r16 * r12
            int r17 = r16 << 16
            r16 = r16 ^ r17
            int r12 = r16 >>> 7
            int r12 = r0.b(r12)
            r15 = r16 & 127(0x7f, float:1.78E-43)
            long r8 = (long) r15
            long[] r15 = r0.a
            int r16 = r12 >> 3
            r25 = r12 & 7
            int r25 = r25 << 3
            r26 = r15[r16]
            r28 = r2
            r29 = r3
            r23 = 255(0xff, double:1.26E-321)
            long r2 = r23 << r25
            long r2 = ~r2
            long r2 = r26 & r2
            long r25 = r8 << r25
            long r2 = r2 | r25
            r15[r16] = r2
            int r2 = r0.d
            int r3 = r12 + -7
            r3 = r3 & r2
            r2 = r2 & 7
            int r3 = r3 + r2
            int r2 = r3 >> 3
            r3 = r3 & 7
            int r3 = r3 << 3
            r25 = r15[r2]
            r30 = r10
            r23 = 255(0xff, double:1.26E-321)
            long r10 = r23 << r3
            long r10 = ~r10
            long r10 = r25 & r10
            long r8 = r8 << r3
            long r8 = r8 | r10
            r15[r2] = r8
            r1[r12] = r13
            r2 = r4[r7]
            r6[r12] = r2
            goto L_0x0191
        L_0x018b:
            r28 = r2
            r29 = r3
            r30 = r10
        L_0x0191:
            int r7 = r7 + 1
            r2 = r28
            r3 = r29
            r10 = r30
            r8 = 255(0xff, double:1.26E-321)
            goto L_0x0121
        L_0x019c:
            int r1 = r0.b(r2)
        L_0x01a0:
            int r2 = r0.e
            r3 = 1
            int r2 = r2 + r3
            r0.e = r2
            int r2 = r0.f
            long[] r4 = r0.a
            int r5 = r1 >> 3
            r6 = r4[r5]
            r8 = r1 & 7
            int r8 = r8 << 3
            long r9 = r6 >> r8
            r11 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r11
            r13 = 128(0x80, double:6.32E-322)
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x01be
            goto L_0x01bf
        L_0x01be:
            r3 = 0
        L_0x01bf:
            int r2 = r2 - r3
            r0.f = r2
            long r2 = r11 << r8
            long r2 = ~r2
            long r2 = r2 & r6
            long r6 = r30 << r8
            long r2 = r2 | r6
            r4[r5] = r2
            int r2 = r0.d
            int r3 = r1 + -7
            r3 = r3 & r2
            r2 = r2 & 7
            int r3 = r3 + r2
            int r2 = r3 >> 3
            r3 = r3 & 7
            int r3 = r3 << 3
            r5 = r4[r2]
            r7 = 255(0xff, double:1.26E-321)
            long r7 = r7 << r3
            long r7 = ~r7
            long r5 = r5 & r7
            long r7 = r30 << r3
            long r5 = r5 | r7
            r4[r2] = r5
            int r1 = ~r1
        L_0x01e6:
            if (r1 >= 0) goto L_0x01e9
            int r1 = ~r1
        L_0x01e9:
            long[] r2 = r0.b
            r2[r1] = r33
            long[] r0 = r0.c
            r0[r1] = r35
            return
        L_0x01f2:
            r2 = r3
            int r7 = r18 + 8
            int r5 = r5 + r7
            r5 = r5 & r4
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hz9.d(long, long):void");
    }
}
