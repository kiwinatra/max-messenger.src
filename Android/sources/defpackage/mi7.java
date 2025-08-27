package defpackage;

/* renamed from: mi7  reason: default package */
public abstract class mi7 {
    public long[] a;
    public int[] b;
    public long[] c;
    public int d;
    public int e;

    public final int a(int i) {
        int hashCode = Integer.hashCode(i) * -862048943;
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-((long) i8)) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & -9187201950435737472L; j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & -9187201950435737472L) != 0) {
                return -1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    /* JADX WARNING: type inference failed for: r18v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L_0x0008
            return r2
        L_0x0008:
            boolean r3 = r1 instanceof defpackage.mi7
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            mi7 r1 = (defpackage.mi7) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L_0x0017
            return r4
        L_0x0017:
            int[] r3 = r0.b
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
            r15 = r5[r13]
            int r13 = r1.a(r14)
            if (r13 < 0) goto L_0x005e
            long[] r14 = r1.c
            r13 = r14[r13]
            int r13 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r13 == 0) goto L_0x006a
            return r4
        L_0x005e:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Cannot find value for key "
            java.lang.String r1 = defpackage.wj6.h(r14, r1)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mi7.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int[] iArr = this.b;
        long[] jArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            i3 += Integer.hashCode(iArr[i6]) ^ Long.hashCode(jArr[i6]);
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
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.b;
        long[] jArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            int i8 = iArr[i7];
                            i2 = i3;
                            long j2 = jArr[i7];
                            sb.append(i8);
                            sb.append("=");
                            sb.append(j2);
                            i4++;
                            if (i4 < this.e) {
                                sb.append(", ");
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i9 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i9;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
