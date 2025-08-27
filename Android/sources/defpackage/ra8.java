package defpackage;

/* renamed from: ra8  reason: default package */
public abstract class ra8 {
    public long[] a;
    public long[] b;
    public long[] c;
    public int d;
    public int e;

    public final int a(long j) {
        int hashCode = Long.hashCode(j) * -862048943;
        int i = hashCode ^ (hashCode << 16);
        int i2 = i & 127;
        int i3 = this.d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-((long) i7)) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (((long) i2) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & -9187201950435737472L; j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.b[numberOfTrailingZeros] == j) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j2 & ((~j2) << 6) & -9187201950435737472L) != 0) {
                return -1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L_0x0008
            return r2
        L_0x0008:
            boolean r3 = r1 instanceof defpackage.ra8
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            ra8 r1 = (defpackage.ra8) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L_0x0017
            return r4
        L_0x0017:
            long[] r3 = r0.b
            long[] r5 = r0.c
            long[] r0 = r0.a
            int r6 = r0.length
            int r6 = r6 + -2
            if (r6 < 0) goto L_0x0075
            r7 = r4
        L_0x0023:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L_0x0070
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L_0x003d:
            if (r12 >= r10) goto L_0x006e
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L_0x006a
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r16 = r5[r13]
            int r13 = r1.a(r14)
            if (r13 < 0) goto L_0x005e
            long[] r14 = r1.c
            r13 = r14[r13]
            int r13 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r13 == 0) goto L_0x006a
            return r4
        L_0x005e:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Cannot find value for key "
            java.lang.String r1 = defpackage.wj6.i(r14, r1)
            r0.<init>(r1)
            throw r0
        L_0x006a:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L_0x003d
        L_0x006e:
            if (r10 != r11) goto L_0x0075
        L_0x0070:
            if (r7 == r6) goto L_0x0075
            int r7 = r7 + 1
            goto L_0x0023
        L_0x0075:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra8.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long[] jArr = this.b;
        long[] jArr2 = this.c;
        long[] jArr3 = this.a;
        int length = jArr3.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr3[i2];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            i3 += Long.hashCode(jArr[i6]) ^ Long.hashCode(jArr2[i6]);
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return i3;
                    }
                }
                if (i2 == length) {
                    i = i3;
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public final String toString() {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.b;
        long[] jArr2 = this.c;
        long[] jArr3 = this.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                long j = jArr3[i5];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i7 = 8;
                    int i8 = 8 - ((~(i5 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((255 & j) < 128) {
                            int i10 = (i5 << 3) + i9;
                            i3 = i5;
                            long j2 = jArr[i10];
                            i2 = i9;
                            long j3 = jArr2[i10];
                            sb.append(j2);
                            sb.append("=");
                            sb.append(j3);
                            i6++;
                            if (i6 < this.e) {
                                sb.append(", ");
                            }
                            i4 = 8;
                        } else {
                            i3 = i5;
                            i2 = i9;
                            i4 = i7;
                        }
                        j >>= i4;
                        i9 = i2 + 1;
                        i7 = i4;
                        i5 = i3;
                    }
                    int i11 = i5;
                    if (i8 != i7) {
                        break;
                    }
                    i = i11;
                } else {
                    i = i5;
                }
                if (i == length) {
                    break;
                }
                i5 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
