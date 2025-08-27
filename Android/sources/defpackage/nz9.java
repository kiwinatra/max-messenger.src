package defpackage;

/* renamed from: nz9  reason: default package */
public final class nz9 extends fha {
    public int f;

    public nz9(int i) {
        this.a = bed.a;
        this.b = ld9.c;
        this.c = ri7.b;
        if (i >= 0) {
            c(bed.e(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

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
        this.b = new Object[max];
        this.c = new int[max];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0079, code lost:
        if (((((~r9) << 6) & r9) & -9187201950435737472L) == 0) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007b, code lost:
        r2 = b(r5);
        r9 = 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0083, code lost:
        if (r0.f != 0) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0095, code lost:
        if (((r0.a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0097, code lost:
        r23 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009d, code lost:
        if (r0.d <= 8) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009f, code lost:
        r20 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b7, code lost:
        if (java.lang.Long.compareUnsigned(defpackage.wj6.f((long) r0.e, 32), defpackage.wj6.f((long) r0.d, 25)) > 0) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b9, code lost:
        r2 = r0.a;
        r3 = r0.d;
        r4 = 0;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00bf, code lost:
        if (r4 >= r3) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c1, code lost:
        r6 = r4 >> 3;
        r15 = (r4 & 7) << 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00cd, code lost:
        if (((r2[r6] >> r15) & 255) != 254) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cf, code lost:
        r13 = r0.a;
        r13[r6] = (r13[r6] & (~(255 << r15))) | (128 << r15);
        r6 = r0.d;
        r7 = ((r4 - 7) & r6) + (r6 & 7);
        r6 = r7 >> 3;
        r7 = (r7 & 7) << 3;
        r8 = r2;
        r18 = r3;
        r13[r6] = ((~(255 << r7)) & r13[r6]) | (128 << r7);
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0101, code lost:
        r8 = r2;
        r18 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0104, code lost:
        r4 = r4 + 1;
        r2 = r8;
        r3 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x010a, code lost:
        r0.f += r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x010f, code lost:
        r23 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0115, code lost:
        r20 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0117, code lost:
        r2 = defpackage.bed.c(r0.d);
        r3 = r0.a;
        r4 = r0.b;
        r5 = r0.c;
        r6 = r0.d;
        c(r2);
        r2 = r0.b;
        r7 = r0.c;
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x012d, code lost:
        if (r8 >= r6) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x013e, code lost:
        if (((r3[r8 >> 3] >> ((r8 & 7) << 3)) & r9) >= 128) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0140, code lost:
        r13 = r4[r8];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0142, code lost:
        if (r13 == null) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0144, code lost:
        r14 = r13.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x014c, code lost:
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x014e, code lost:
        r14 = r14 * -862048943;
        r14 = r14 ^ (r14 << 16);
        r15 = b(r14 >>> 7);
        r9 = (long) (r14 & 127);
        r14 = r0.a;
        r21 = r15 >> 3;
        r22 = (r15 & 7) << 3;
        r25 = r3;
        r26 = r4;
        r14[r21] = (r14[r21] & (~(255 << r22))) | (r9 << r22);
        r3 = r0.d;
        r4 = ((r15 - 7) & r3) + (r3 & 7);
        r3 = r4 >> 3;
        r4 = (r4 & 7) << 3;
        r23 = r11;
        r14[r3] = (r9 << r4) | (r14[r3] & (~(255 << r4)));
        r2[r15] = r13;
        r7[r15] = r5[r8];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x019b, code lost:
        r25 = r3;
        r26 = r4;
        r23 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01a1, code lost:
        r8 = r8 + 1;
        r11 = r23;
        r3 = r25;
        r4 = r26;
        r9 = 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01ac, code lost:
        r2 = b(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01b0, code lost:
        r4 = 1;
        r0.e++;
        r3 = r0.f;
        r5 = r0.a;
        r6 = r2 >> 3;
        r7 = r5[r6];
        r9 = (r2 & 7) << 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01cb, code lost:
        if (((r7 >> r9) & 255) != 128) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01ce, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01cf, code lost:
        r0.f = r3 - r4;
        r5[r6] = ((~(255 << r9)) & r7) | (r23 << r9);
        r3 = r0.d;
        r4 = ((r2 - 7) & r3) + (r3 & 7);
        r3 = r4 >> 3;
        r4 = (r4 & 7) << 3;
        r5[r3] = (r5[r3] & (~(255 << r4))) | (r23 << r4);
        r2 = ~r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(int r28, java.lang.Object r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r29
            if (r1 == 0) goto L_0x000b
            int r3 = r29.hashCode()
            goto L_0x000c
        L_0x000b:
            r3 = 0
        L_0x000c:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r5 = r3 << 16
            r3 = r3 ^ r5
            int r5 = r3 >>> 7
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r6 = r0.d
            r7 = r5 & r6
            r8 = 0
        L_0x001c:
            long[] r9 = r0.a
            int r10 = r7 >> 3
            r11 = r7 & 7
            int r11 = r11 << 3
            r12 = r9[r10]
            long r12 = r12 >>> r11
            r14 = 1
            int r10 = r10 + r14
            r9 = r9[r10]
            int r15 = 64 - r11
            long r9 = r9 << r15
            long r14 = (long) r11
            long r14 = -r14
            r11 = 63
            long r14 = r14 >> r11
            long r9 = r9 & r14
            long r9 = r9 | r12
            long r11 = (long) r3
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r16 = r11 * r13
            r18 = r3
            long r2 = r9 ^ r16
            long r13 = r2 - r13
            long r2 = ~r2
            long r2 = r2 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r13
        L_0x004b:
            r16 = 0
            int r19 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r19 == 0) goto L_0x0070
            int r16 = java.lang.Long.numberOfTrailingZeros(r2)
            int r16 = r16 >> 3
            int r16 = r7 + r16
            r16 = r16 & r6
            java.lang.Object[] r15 = r0.b
            r15 = r15[r16]
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r1)
            if (r15 == 0) goto L_0x0069
            r2 = r16
            goto L_0x01f6
        L_0x0069:
            r16 = 1
            long r16 = r2 - r16
            long r2 = r2 & r16
            goto L_0x004b
        L_0x0070:
            long r2 = ~r9
            r15 = 6
            long r2 = r2 << r15
            long r2 = r2 & r9
            long r2 = r2 & r13
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            r3 = 8
            if (r2 == 0) goto L_0x0202
            int r2 = r0.b(r5)
            int r6 = r0.f
            r9 = 255(0xff, double:1.26E-321)
            if (r6 != 0) goto L_0x0097
            long[] r6 = r0.a
            int r13 = r2 >> 3
            r13 = r6[r13]
            r6 = r2 & 7
            int r6 = r6 << 3
            long r13 = r13 >> r6
            long r13 = r13 & r9
            r16 = 254(0xfe, double:1.255E-321)
            int r6 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r6 != 0) goto L_0x009b
        L_0x0097:
            r23 = r11
            goto L_0x01b0
        L_0x009b:
            int r2 = r0.d
            if (r2 <= r3) goto L_0x0115
            int r2 = r0.e
            long r2 = (long) r2
            r13 = 32
            long r2 = defpackage.wj6.f(r2, r13)
            int r6 = r0.d
            long r13 = (long) r6
            r20 = r5
            r4 = 25
            long r4 = defpackage.wj6.f(r13, r4)
            int r2 = java.lang.Long.compareUnsigned(r2, r4)
            if (r2 > 0) goto L_0x0117
            long[] r2 = r0.a
            int r3 = r0.d
            r4 = 0
            r5 = 0
        L_0x00bf:
            if (r4 >= r3) goto L_0x010a
            int r6 = r4 >> 3
            r13 = r2[r6]
            r15 = r4 & 7
            int r15 = r15 << 3
            long r13 = r13 >> r15
            long r13 = r13 & r9
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 != 0) goto L_0x0101
            long[] r13 = r0.a
            r21 = r13[r6]
            long r7 = r9 << r15
            long r7 = ~r7
            long r7 = r21 & r7
            r21 = 128(0x80, double:6.32E-322)
            long r14 = r21 << r15
            long r7 = r7 | r14
            r13[r6] = r7
            int r6 = r0.d
            int r7 = r4 + -7
            r7 = r7 & r6
            r6 = r6 & 7
            int r7 = r7 + r6
            int r6 = r7 >> 3
            r7 = r7 & 7
            int r7 = r7 << 3
            r14 = r13[r6]
            r8 = r2
            r18 = r3
            long r2 = r9 << r7
            long r2 = ~r2
            long r2 = r2 & r14
            r14 = 128(0x80, double:6.32E-322)
            long r21 = r14 << r7
            long r2 = r2 | r21
            r13[r6] = r2
            int r5 = r5 + 1
            goto L_0x0104
        L_0x0101:
            r8 = r2
            r18 = r3
        L_0x0104:
            int r4 = r4 + 1
            r2 = r8
            r3 = r18
            goto L_0x00bf
        L_0x010a:
            int r2 = r0.f
            int r2 = r2 + r5
            r0.f = r2
        L_0x010f:
            r23 = r11
            r2 = r20
            goto L_0x01ac
        L_0x0115:
            r20 = r5
        L_0x0117:
            int r2 = r0.d
            int r2 = defpackage.bed.c(r2)
            long[] r3 = r0.a
            java.lang.Object[] r4 = r0.b
            int[] r5 = r0.c
            int r6 = r0.d
            r0.c(r2)
            java.lang.Object[] r2 = r0.b
            int[] r7 = r0.c
            r8 = 0
        L_0x012d:
            if (r8 >= r6) goto L_0x010f
            int r13 = r8 >> 3
            r13 = r3[r13]
            r16 = r8 & 7
            int r16 = r16 << 3
            long r13 = r13 >> r16
            long r13 = r13 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 >= 0) goto L_0x019b
            r13 = r4[r8]
            if (r13 == 0) goto L_0x014c
            int r14 = r13.hashCode()
        L_0x0148:
            r15 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            goto L_0x014e
        L_0x014c:
            r14 = 0
            goto L_0x0148
        L_0x014e:
            int r14 = r14 * r15
            int r16 = r14 << 16
            r14 = r14 ^ r16
            int r15 = r14 >>> 7
            int r15 = r0.b(r15)
            r14 = r14 & 127(0x7f, float:1.78E-43)
            long r9 = (long) r14
            long[] r14 = r0.a
            int r21 = r15 >> 3
            r22 = r15 & 7
            int r22 = r22 << 3
            r23 = r14[r21]
            r25 = r3
            r26 = r4
            r17 = 255(0xff, double:1.26E-321)
            long r3 = r17 << r22
            long r3 = ~r3
            long r3 = r23 & r3
            long r23 = r9 << r22
            long r3 = r3 | r23
            r14[r21] = r3
            int r3 = r0.d
            int r4 = r15 + -7
            r4 = r4 & r3
            r3 = r3 & 7
            int r4 = r4 + r3
            int r3 = r4 >> 3
            r4 = r4 & 7
            int r4 = r4 << 3
            r21 = r14[r3]
            r23 = r11
            r17 = 255(0xff, double:1.26E-321)
            long r11 = r17 << r4
            long r11 = ~r11
            long r11 = r21 & r11
            long r9 = r9 << r4
            long r9 = r9 | r11
            r14[r3] = r9
            r2[r15] = r13
            r3 = r5[r8]
            r7[r15] = r3
            goto L_0x01a1
        L_0x019b:
            r25 = r3
            r26 = r4
            r23 = r11
        L_0x01a1:
            int r8 = r8 + 1
            r11 = r23
            r3 = r25
            r4 = r26
            r9 = 255(0xff, double:1.26E-321)
            goto L_0x012d
        L_0x01ac:
            int r2 = r0.b(r2)
        L_0x01b0:
            int r3 = r0.e
            r4 = 1
            int r3 = r3 + r4
            r0.e = r3
            int r3 = r0.f
            long[] r5 = r0.a
            int r6 = r2 >> 3
            r7 = r5[r6]
            r9 = r2 & 7
            int r9 = r9 << 3
            long r10 = r7 >> r9
            r12 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r12
            r14 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r10 != 0) goto L_0x01ce
            goto L_0x01cf
        L_0x01ce:
            r4 = 0
        L_0x01cf:
            int r3 = r3 - r4
            r0.f = r3
            long r3 = r12 << r9
            long r3 = ~r3
            long r3 = r3 & r7
            long r7 = r23 << r9
            long r3 = r3 | r7
            r5[r6] = r3
            int r3 = r0.d
            int r4 = r2 + -7
            r4 = r4 & r3
            r3 = r3 & 7
            int r4 = r4 + r3
            int r3 = r4 >> 3
            r4 = r4 & 7
            int r4 = r4 << 3
            r6 = r5[r3]
            r8 = 255(0xff, double:1.26E-321)
            long r8 = r8 << r4
            long r8 = ~r8
            long r6 = r6 & r8
            long r8 = r23 << r4
            long r6 = r6 | r8
            r5[r3] = r6
            int r2 = ~r2
        L_0x01f6:
            if (r2 >= 0) goto L_0x01f9
            int r2 = ~r2
        L_0x01f9:
            java.lang.Object[] r3 = r0.b
            r3[r2] = r1
            int[] r0 = r0.c
            r0[r2] = r28
            return
        L_0x0202:
            r2 = r5
            int r8 = r8 + r3
            int r7 = r7 + r8
            r7 = r7 & r6
            r3 = r18
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz9.d(int, java.lang.Object):void");
    }
}
