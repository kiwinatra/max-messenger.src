package defpackage;

/* renamed from: ez9  reason: default package */
public final class ez9 extends qi7 {
    public int e;

    public ez9(int i) {
        this.a = bed.a;
        this.b = ri7.b;
        if (i >= 0) {
            f(bed.e(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final void b(int i) {
        this.b[d(i)] = i;
    }

    public final void c(qi7 qi7) {
        int[] iArr = qi7.b;
        long[] jArr = qi7.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            g(iArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int d(int r27) {
        /*
            r26 = this;
            r0 = r26
            int r1 = java.lang.Integer.hashCode(r27)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r3 = r1 << 16
            r1 = r1 ^ r3
            int r3 = r1 >>> 7
            r1 = r1 & 127(0x7f, float:1.78E-43)
            int r4 = r0.c
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
            if (r19 == 0) goto L_0x0066
            int r16 = java.lang.Long.numberOfTrailingZeros(r6)
            int r16 = r16 >> 3
            int r16 = r5 + r16
            r16 = r16 & r4
            int[] r12 = r0.b
            r12 = r12[r16]
            r13 = r27
            if (r12 != r13) goto L_0x005e
            return r16
        L_0x005e:
            r16 = 1
            long r16 = r6 - r16
            long r6 = r6 & r16
            r13 = 1
            goto L_0x0045
        L_0x0066:
            r13 = r27
            long r6 = ~r8
            r12 = 6
            long r6 = r6 << r12
            long r6 = r6 & r8
            long r6 = r6 & r14
            int r6 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            r7 = 8
            if (r6 == 0) goto L_0x01ca
            int r1 = r0.e(r3)
            int r4 = r0.e
            r5 = 128(0x80, double:6.32E-322)
            r8 = 255(0xff, double:1.26E-321)
            if (r4 != 0) goto L_0x0187
            long[] r4 = r0.a
            int r12 = r1 >> 3
            r12 = r4[r12]
            r4 = r1 & 7
            int r4 = r4 << 3
            long r12 = r12 >> r4
            long r12 = r12 & r8
            r14 = 254(0xfe, double:1.255E-321)
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 != 0) goto L_0x0093
            goto L_0x0187
        L_0x0093:
            int r1 = r0.c
            if (r1 <= r7) goto L_0x0104
            int r1 = r0.d
            long r12 = (long) r1
            r17 = r3
            r2 = 32
            long r1 = defpackage.wj6.f(r12, r2)
            int r3 = r0.c
            long r3 = (long) r3
            r12 = 25
            long r3 = defpackage.wj6.f(r3, r12)
            int r1 = java.lang.Long.compareUnsigned(r1, r3)
            if (r1 > 0) goto L_0x0106
            long[] r1 = r0.a
            int r2 = r0.c
            r3 = 0
            r4 = 0
        L_0x00b7:
            if (r3 >= r2) goto L_0x00fb
            int r7 = r3 >> 3
            r12 = r1[r7]
            r16 = r3 & 7
            int r16 = r16 << 3
            long r12 = r12 >> r16
            long r12 = r12 & r8
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L_0x00f4
            long[] r12 = r0.a
            r20 = r12[r7]
            long r14 = r8 << r16
            long r13 = ~r14
            long r13 = r20 & r13
            long r15 = r5 << r16
            long r13 = r13 | r15
            r12[r7] = r13
            int r7 = r0.c
            int r13 = r3 + -7
            r13 = r13 & r7
            r7 = r7 & 7
            int r13 = r13 + r7
            int r7 = r13 >> 3
            r13 = r13 & 7
            int r13 = r13 << 3
            r14 = r12[r7]
            long r5 = r8 << r13
            long r5 = ~r5
            long r5 = r5 & r14
            r14 = 128(0x80, double:6.32E-322)
            long r24 = r14 << r13
            long r5 = r5 | r24
            r12[r7] = r5
            int r4 = r4 + 1
        L_0x00f4:
            int r3 = r3 + 1
            r5 = 128(0x80, double:6.32E-322)
            r14 = 254(0xfe, double:1.255E-321)
            goto L_0x00b7
        L_0x00fb:
            int r1 = r0.e
            int r1 = r1 + r4
            r0.e = r1
        L_0x0100:
            r2 = r17
            goto L_0x0183
        L_0x0104:
            r17 = r3
        L_0x0106:
            int r1 = r0.c
            int r1 = defpackage.bed.c(r1)
            long[] r2 = r0.a
            int[] r3 = r0.b
            int r4 = r0.c
            r0.f(r1)
            int[] r1 = r0.b
            r5 = 0
        L_0x0118:
            if (r5 >= r4) goto L_0x0100
            int r6 = r5 >> 3
            r6 = r2[r6]
            r12 = r5 & 7
            int r12 = r12 << 3
            long r6 = r6 >> r12
            long r6 = r6 & r8
            r12 = 128(0x80, double:6.32E-322)
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 >= 0) goto L_0x0178
            r6 = r3[r5]
            int r7 = java.lang.Integer.hashCode(r6)
            r12 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r7 = r7 * r12
            int r13 = r7 << 16
            r7 = r7 ^ r13
            int r13 = r7 >>> 7
            int r13 = r0.e(r13)
            r7 = r7 & 127(0x7f, float:1.78E-43)
            long r14 = (long) r7
            long[] r7 = r0.a
            int r16 = r13 >> 3
            r18 = r13 & 7
            int r18 = r18 << 3
            r22 = r7[r16]
            r27 = r13
            long r12 = r8 << r18
            long r12 = ~r12
            long r12 = r22 & r12
            long r22 = r14 << r18
            long r12 = r12 | r22
            r7[r16] = r12
            int r12 = r0.c
            int r13 = r27 + -7
            r13 = r13 & r12
            r12 = r12 & 7
            int r13 = r13 + r12
            int r12 = r13 >> 3
            r13 = r13 & 7
            int r13 = r13 << 3
            r22 = r7[r12]
            r16 = r2
            r18 = r3
            long r2 = r8 << r13
            long r2 = ~r2
            long r2 = r22 & r2
            long r13 = r14 << r13
            long r2 = r2 | r13
            r7[r12] = r2
            r1[r27] = r6
            goto L_0x017c
        L_0x0178:
            r16 = r2
            r18 = r3
        L_0x017c:
            int r5 = r5 + 1
            r2 = r16
            r3 = r18
            goto L_0x0118
        L_0x0183:
            int r1 = r0.e(r2)
        L_0x0187:
            int r2 = r0.d
            r3 = 1
            int r2 = r2 + r3
            r0.d = r2
            int r2 = r0.e
            long[] r4 = r0.a
            int r5 = r1 >> 3
            r6 = r4[r5]
            r12 = r1 & 7
            int r12 = r12 << 3
            long r13 = r6 >> r12
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 != 0) goto L_0x01a3
            goto L_0x01a4
        L_0x01a3:
            r3 = 0
        L_0x01a4:
            int r2 = r2 - r3
            r0.e = r2
            long r2 = r8 << r12
            long r2 = ~r2
            long r2 = r2 & r6
            long r6 = r10 << r12
            long r2 = r2 | r6
            r4[r5] = r2
            int r0 = r0.c
            int r2 = r1 + -7
            r2 = r2 & r0
            r0 = r0 & 7
            int r2 = r2 + r0
            int r0 = r2 >> 3
            r2 = r2 & 7
            int r2 = r2 << 3
            r5 = r4[r0]
            long r7 = r8 << r2
            long r7 = ~r7
            long r5 = r5 & r7
            long r2 = r10 << r2
            long r2 = r2 | r5
            r4[r0] = r2
            return r1
        L_0x01ca:
            r2 = r3
            int r7 = r18 + 8
            int r5 = r5 + r7
            r5 = r5 & r4
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez9.d(int):int");
    }

    public final int e(int i) {
        int i2 = this.c;
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

    public final void f(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, bed.d(i)) : 0;
        this.c = max;
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
        this.e = bed.a(this.c) - this.d;
        this.b = new int[max];
    }

    public final void g(int i) {
        this.b[d(i)] = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0060, code lost:
        if (((r4 & ((~r4) << 6)) & -9187201950435737472L) == 0) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0062, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.c
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L_0x0013:
            long[] r4 = r13.a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r4 = r4[r5]
            int r9 = 64 - r6
            long r4 = r4 << r9
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L_0x003e:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0059
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.b
            r11 = r11[r10]
            if (r11 != r14) goto L_0x0053
            goto L_0x0063
        L_0x0053:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L_0x003e
        L_0x0059:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x009f
            r10 = -1
        L_0x0063:
            if (r10 < 0) goto L_0x009e
            int r14 = r13.d
            int r14 = r14 + -1
            r13.d = r14
            long[] r14 = r13.a
            int r0 = r10 >> 3
            r1 = r10 & 7
            int r1 = r1 << 3
            r2 = r14[r0]
            r4 = 255(0xff, double:1.26E-321)
            long r6 = r4 << r1
            long r6 = ~r6
            long r2 = r2 & r6
            r6 = 254(0xfe, double:1.255E-321)
            long r8 = r6 << r1
            long r1 = r2 | r8
            r14[r0] = r1
            int r13 = r13.c
            int r10 = r10 + -7
            r0 = r10 & r13
            r13 = r13 & 7
            int r0 = r0 + r13
            int r13 = r0 >> 3
            r0 = r0 & 7
            int r0 = r0 << 3
            r1 = r14[r13]
            long r3 = r4 << r0
            long r3 = ~r3
            long r1 = r1 & r3
            long r3 = r6 << r0
            long r0 = r1 | r3
            r14[r13] = r0
        L_0x009e:
            return
        L_0x009f:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez9.h(int):void");
    }

    public /* synthetic */ ez9() {
        this(6);
    }
}
