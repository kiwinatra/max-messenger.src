package defpackage;

/* renamed from: jz9  reason: default package */
public final class jz9 extends va8 {
    public int e;

    public jz9(int i) {
        this.a = bed.a;
        this.b = xa8.b;
        if (i >= 0) {
            j(bed.e(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final boolean e(long j) {
        int i = this.d;
        this.b[h(j)] = j;
        return this.d != i;
    }

    public final boolean f(va8 va8) {
        int i = this.d;
        long[] jArr = va8.b;
        long[] jArr2 = va8.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            long j2 = jArr[(i2 << 3) + i4];
                            this.b[h(j2)] = j2;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i != this.d;
    }

    public final void g() {
        this.d = 0;
        long[] jArr = this.a;
        if (jArr != bed.a) {
            ArraysKt___ArraysJvmKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        this.e = bed.a(this.c) - this.d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int h(long r29) {
        /*
            r28 = this;
            r0 = r28
            int r1 = java.lang.Long.hashCode(r29)
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
            if (r19 == 0) goto L_0x0065
            int r16 = java.lang.Long.numberOfTrailingZeros(r6)
            int r16 = r16 >> 3
            int r16 = r5 + r16
            r16 = r16 & r4
            long[] r12 = r0.b
            r20 = r12[r16]
            int r12 = (r20 > r29 ? 1 : (r20 == r29 ? 0 : -1))
            if (r12 != 0) goto L_0x005e
            return r16
        L_0x005e:
            r16 = 1
            long r16 = r6 - r16
            long r6 = r6 & r16
            goto L_0x0045
        L_0x0065:
            long r6 = ~r8
            r12 = 6
            long r6 = r6 << r12
            long r6 = r6 & r8
            long r6 = r6 & r14
            int r6 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            r7 = 8
            if (r6 == 0) goto L_0x01cf
            int r1 = r0.i(r3)
            int r4 = r0.e
            r5 = 128(0x80, double:6.32E-322)
            r8 = 255(0xff, double:1.26E-321)
            if (r4 != 0) goto L_0x008e
            long[] r4 = r0.a
            int r12 = r1 >> 3
            r14 = r4[r12]
            r4 = r1 & 7
            int r4 = r4 << 3
            long r14 = r14 >> r4
            long r14 = r14 & r8
            r16 = 254(0xfe, double:1.255E-321)
            int r4 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r4 != 0) goto L_0x0092
        L_0x008e:
            r26 = r10
            goto L_0x018c
        L_0x0092:
            int r1 = r0.c
            if (r1 <= r7) goto L_0x0106
            int r1 = r0.d
            long r14 = (long) r1
            r20 = r3
            r2 = 32
            long r1 = defpackage.wj6.f(r14, r2)
            int r3 = r0.c
            long r3 = (long) r3
            r14 = 25
            long r3 = defpackage.wj6.f(r3, r14)
            int r1 = java.lang.Long.compareUnsigned(r1, r3)
            if (r1 > 0) goto L_0x0108
            long[] r1 = r0.a
            int r2 = r0.c
            r3 = 0
            r4 = 0
        L_0x00b6:
            if (r3 >= r2) goto L_0x00fb
            int r7 = r3 >> 3
            r14 = r1[r7]
            r12 = r3 & 7
            int r12 = r12 << 3
            long r14 = r14 >> r12
            long r14 = r14 & r8
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 != 0) goto L_0x00f5
            long[] r14 = r0.a
            r21 = r14[r7]
            r18 = r14
            long r13 = r8 << r12
            long r13 = ~r13
            long r13 = r21 & r13
            long r21 = r5 << r12
            long r12 = r13 | r21
            r18[r7] = r12
            int r7 = r0.c
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
            long r21 = r13 << r12
            long r5 = r5 | r21
            r18[r7] = r5
            int r4 = r4 + 1
        L_0x00f5:
            int r3 = r3 + 1
            r5 = 128(0x80, double:6.32E-322)
            r13 = 1
            goto L_0x00b6
        L_0x00fb:
            int r1 = r0.e
            int r1 = r1 + r4
            r0.e = r1
        L_0x0100:
            r26 = r10
            r2 = r20
            goto L_0x0188
        L_0x0106:
            r20 = r3
        L_0x0108:
            int r1 = r0.c
            int r1 = defpackage.bed.c(r1)
            long[] r2 = r0.a
            long[] r3 = r0.b
            int r4 = r0.c
            r0.j(r1)
            long[] r1 = r0.b
            r5 = 0
        L_0x011a:
            if (r5 >= r4) goto L_0x0100
            int r6 = r5 >> 3
            r6 = r2[r6]
            r13 = r5 & 7
            int r13 = r13 << 3
            long r6 = r6 >> r13
            long r6 = r6 & r8
            r13 = 128(0x80, double:6.32E-322)
            int r6 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r6 >= 0) goto L_0x0179
            r6 = r3[r5]
            int r13 = java.lang.Long.hashCode(r6)
            r12 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r13 = r13 * r12
            int r14 = r13 << 16
            r13 = r13 ^ r14
            int r14 = r13 >>> 7
            int r14 = r0.i(r14)
            r13 = r13 & 127(0x7f, float:1.78E-43)
            long r12 = (long) r13
            long[] r15 = r0.a
            int r18 = r14 >> 3
            r21 = r14 & 7
            int r21 = r21 << 3
            r22 = r15[r18]
            r24 = r2
            r25 = r3
            long r2 = r8 << r21
            long r2 = ~r2
            long r2 = r22 & r2
            long r21 = r12 << r21
            long r2 = r2 | r21
            r15[r18] = r2
            int r2 = r0.c
            int r3 = r14 + -7
            r3 = r3 & r2
            r2 = r2 & 7
            int r3 = r3 + r2
            int r2 = r3 >> 3
            r3 = r3 & 7
            int r3 = r3 << 3
            r21 = r15[r2]
            r26 = r10
            long r10 = r8 << r3
            long r10 = ~r10
            long r10 = r21 & r10
            long r12 = r12 << r3
            long r10 = r10 | r12
            r15[r2] = r10
            r1[r14] = r6
            goto L_0x017f
        L_0x0179:
            r24 = r2
            r25 = r3
            r26 = r10
        L_0x017f:
            int r5 = r5 + 1
            r2 = r24
            r3 = r25
            r10 = r26
            goto L_0x011a
        L_0x0188:
            int r1 = r0.i(r2)
        L_0x018c:
            int r2 = r0.d
            r3 = 1
            int r2 = r2 + r3
            r0.d = r2
            int r2 = r0.e
            long[] r4 = r0.a
            int r5 = r1 >> 3
            r6 = r4[r5]
            r10 = r1 & 7
            int r10 = r10 << 3
            long r11 = r6 >> r10
            long r11 = r11 & r8
            r13 = 128(0x80, double:6.32E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x01a8
            goto L_0x01a9
        L_0x01a8:
            r3 = 0
        L_0x01a9:
            int r2 = r2 - r3
            r0.e = r2
            long r2 = r8 << r10
            long r2 = ~r2
            long r2 = r2 & r6
            long r6 = r26 << r10
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
            long r2 = r26 << r2
            long r2 = r2 | r5
            r4[r0] = r2
            return r1
        L_0x01cf:
            r2 = r3
            int r7 = r18 + 8
            int r5 = r5 + r7
            r5 = r5 & r4
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz9.h(long):int");
    }

    public final int i(int i) {
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

    public final void j(int i) {
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
        this.b = new long[max];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0065, code lost:
        if (((r6 & ((~r6) << 6)) & -9187201950435737472L) == 0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0067, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(long r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = java.lang.Long.hashCode(r17)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.c
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L_0x0016:
            long[] r6 = r0.a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r6 = r6[r7]
            int r12 = 64 - r8
            long r6 = r6 << r12
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L_0x0041:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x005e
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            long[] r14 = r0.b
            r14 = r14[r10]
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 != 0) goto L_0x0058
            goto L_0x0068
        L_0x0058:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L_0x0041
        L_0x005e:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0071
            r10 = -1
        L_0x0068:
            if (r10 < 0) goto L_0x006b
            r4 = r11
        L_0x006b:
            if (r4 == 0) goto L_0x0070
            r0.m(r10)
        L_0x0070:
            return r4
        L_0x0071:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz9.k(long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00af, code lost:
        r24 = r4;
        r1 = ((~r10) << 6) & r10;
        r10 = -9187201950435737472L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00bd, code lost:
        if ((r1 & -9187201950435737472L) == 0) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00bf, code lost:
        r1 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(defpackage.jz9 r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            long[] r2 = r1.b
            long[] r1 = r1.a
            int r3 = r1.length
            int r3 = r3 + -2
            if (r3 < 0) goto L_0x00fe
            r5 = 0
        L_0x000e:
            r6 = r1[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r11
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L_0x00f2
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r13 = 0
        L_0x0028:
            if (r13 >= r8) goto L_0x00eb
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x00db
            int r14 = r5 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            int r16 = java.lang.Long.hashCode(r14)
            r17 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r16 = r16 * r17
            int r17 = r16 << 16
            r16 = r16 ^ r17
            r4 = r16 & 127(0x7f, float:1.78E-43)
            int r9 = r0.c
            int r16 = r16 >>> 7
            r16 = r16 & r9
            r18 = 0
        L_0x004f:
            long[] r10 = r0.a
            int r19 = r16 >> 3
            r20 = r16 & 7
            int r11 = r20 << 3
            r22 = r10[r19]
            long r22 = r22 >>> r11
            int r19 = r19 + 1
            r19 = r10[r19]
            int r10 = 64 - r11
            long r19 = r19 << r10
            long r10 = (long) r11
            long r10 = -r10
            r12 = 63
            long r10 = r10 >> r12
            long r10 = r19 & r10
            long r10 = r22 | r10
            r19 = r1
            r12 = r2
            long r1 = (long) r4
            r22 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r1 = r1 * r22
            long r1 = r1 ^ r10
            long r22 = r1 - r22
            long r1 = ~r1
            long r1 = r22 & r1
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r1 & r20
        L_0x0084:
            r22 = 0
            int r20 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r20 == 0) goto L_0x00af
            int r20 = java.lang.Long.numberOfTrailingZeros(r1)
            int r20 = r20 >> 3
            int r20 = r16 + r20
            r20 = r20 & r9
            r24 = r4
            long[] r4 = r0.b
            r22 = r4[r20]
            int r4 = (r22 > r14 ? 1 : (r22 == r14 ? 0 : -1))
            if (r4 != 0) goto L_0x00a6
            r1 = r20
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            goto L_0x00c3
        L_0x00a6:
            r22 = 1
            long r22 = r1 - r22
            long r1 = r1 & r22
            r4 = r24
            goto L_0x0084
        L_0x00af:
            r24 = r4
            long r1 = ~r10
            r4 = 6
            long r1 = r1 << r4
            long r1 = r1 & r10
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r1 & r10
            int r1 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r1 == 0) goto L_0x00cb
            r20 = -1
            r1 = r20
        L_0x00c3:
            if (r1 < 0) goto L_0x00c8
            r0.m(r1)
        L_0x00c8:
            r1 = 8
            goto L_0x00e0
        L_0x00cb:
            r1 = 8
            int r18 = r18 + 8
            int r16 = r16 + r18
            r16 = r16 & r9
            r2 = r12
            r1 = r19
            r4 = r24
            r11 = r10
            goto L_0x004f
        L_0x00db:
            r19 = r1
            r1 = r9
            r10 = r11
            r12 = r2
        L_0x00e0:
            long r6 = r6 >> r1
            int r13 = r13 + 1
            r9 = r1
            r2 = r12
            r1 = r19
            r11 = r10
            r10 = 7
            goto L_0x0028
        L_0x00eb:
            r19 = r1
            r12 = r2
            r1 = r9
            if (r8 != r1) goto L_0x00fe
            goto L_0x00f5
        L_0x00f2:
            r19 = r1
            r12 = r2
        L_0x00f5:
            if (r5 == r3) goto L_0x00fe
            int r5 = r5 + 1
            r2 = r12
            r1 = r19
            goto L_0x000e
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz9.l(jz9):void");
    }

    public final void m(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        int i4 = this.c;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (254 << i7);
    }

    public /* synthetic */ jz9(Object obj) {
        this(6);
    }
}
