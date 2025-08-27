package defpackage;

/* renamed from: iz9  reason: default package */
public final class iz9 extends ta8 {
    public int f;

    public iz9(int i) {
        this.a = bed.a;
        this.b = xa8.b;
        this.c = ld9.c;
        if (i >= 0) {
            d(bed.e(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(long r31) {
        /*
            r30 = this;
            r0 = r30
            int r1 = java.lang.Long.hashCode(r31)
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
            if (r19 == 0) goto L_0x0065
            int r16 = java.lang.Long.numberOfTrailingZeros(r6)
            int r16 = r16 >> 3
            int r16 = r5 + r16
            r16 = r16 & r4
            long[] r12 = r0.b
            r20 = r12[r16]
            int r12 = (r20 > r31 ? 1 : (r20 == r31 ? 0 : -1))
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
            if (r6 == 0) goto L_0x01e3
            int r1 = r0.c(r3)
            int r4 = r0.f
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
            r28 = r10
            goto L_0x019d
        L_0x0092:
            int r1 = r0.d
            if (r1 <= r7) goto L_0x0106
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
            if (r1 > 0) goto L_0x0108
            long[] r1 = r0.a
            int r2 = r0.d
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
            int r1 = r0.f
            int r1 = r1 + r4
            r0.f = r1
        L_0x0100:
            r28 = r10
            r2 = r20
            goto L_0x0199
        L_0x0106:
            r20 = r3
        L_0x0108:
            int r1 = r0.d
            int r1 = defpackage.bed.c(r1)
            long[] r2 = r0.a
            long[] r3 = r0.b
            java.lang.Object[] r4 = r0.c
            int r5 = r0.d
            r0.d(r1)
            long[] r1 = r0.b
            java.lang.Object[] r6 = r0.c
            r7 = 0
        L_0x011e:
            if (r7 >= r5) goto L_0x0100
            int r13 = r7 >> 3
            r13 = r2[r13]
            r16 = r7 & 7
            int r16 = r16 << 3
            long r13 = r13 >> r16
            long r13 = r13 & r8
            r16 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 >= 0) goto L_0x0188
            r13 = r3[r7]
            int r16 = java.lang.Long.hashCode(r13)
            r12 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r16 = r16 * r12
            int r17 = r16 << 16
            r16 = r16 ^ r17
            int r12 = r16 >>> 7
            int r12 = r0.c(r12)
            r15 = r16 & 127(0x7f, float:1.78E-43)
            long r8 = (long) r15
            long[] r15 = r0.a
            int r16 = r12 >> 3
            r23 = r12 & 7
            int r23 = r23 << 3
            r24 = r15[r16]
            r26 = r2
            r27 = r3
            r21 = 255(0xff, double:1.26E-321)
            long r2 = r21 << r23
            long r2 = ~r2
            long r2 = r24 & r2
            long r23 = r8 << r23
            long r2 = r2 | r23
            r15[r16] = r2
            int r2 = r0.d
            int r3 = r12 + -7
            r3 = r3 & r2
            r2 = r2 & 7
            int r3 = r3 + r2
            int r2 = r3 >> 3
            r3 = r3 & 7
            int r3 = r3 << 3
            r23 = r15[r2]
            r28 = r10
            r21 = 255(0xff, double:1.26E-321)
            long r10 = r21 << r3
            long r10 = ~r10
            long r10 = r23 & r10
            long r8 = r8 << r3
            long r8 = r8 | r10
            r15[r2] = r8
            r1[r12] = r13
            r2 = r4[r7]
            r6[r12] = r2
            goto L_0x018e
        L_0x0188:
            r26 = r2
            r27 = r3
            r28 = r10
        L_0x018e:
            int r7 = r7 + 1
            r2 = r26
            r3 = r27
            r10 = r28
            r8 = 255(0xff, double:1.26E-321)
            goto L_0x011e
        L_0x0199:
            int r1 = r0.c(r2)
        L_0x019d:
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
            if (r9 != 0) goto L_0x01bb
            goto L_0x01bc
        L_0x01bb:
            r3 = 0
        L_0x01bc:
            int r2 = r2 - r3
            r0.f = r2
            long r2 = r11 << r8
            long r2 = ~r2
            long r2 = r2 & r6
            long r6 = r28 << r8
            long r2 = r2 | r6
            r4[r5] = r2
            int r0 = r0.d
            int r2 = r1 + -7
            r2 = r2 & r0
            r0 = r0 & 7
            int r2 = r2 + r0
            int r0 = r2 >> 3
            r2 = r2 & 7
            int r2 = r2 << 3
            r5 = r4[r0]
            r7 = 255(0xff, double:1.26E-321)
            long r7 = r7 << r2
            long r7 = ~r7
            long r5 = r5 & r7
            long r2 = r28 << r2
            long r2 = r2 | r5
            r4[r0] = r2
            return r1
        L_0x01e3:
            r2 = r3
            int r7 = r18 + 8
            int r5 = r5 + r7
            r5 = r5 & r4
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iz9.b(long):int");
    }

    public final int c(int i) {
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

    public final void d(int i) {
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
        this.c = new Object[max];
    }

    public final void e(long j, Object obj) {
        int b = b(j);
        this.b[b] = j;
        this.c[b] = obj;
    }

    public /* synthetic */ iz9() {
        this(6);
    }
}
