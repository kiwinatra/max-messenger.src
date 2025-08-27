package defpackage;

/* renamed from: ced  reason: default package */
public abstract class ced {
    public long[] a;
    public Object[] b;
    public int c;
    public int d;

    /* JADX WARNING: type inference failed for: r25v0, types: [java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c5, code lost:
        r2 = ((~r11) << 6) & r11;
        r11 = -9187201950435737472L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d1, code lost:
        if ((r2 & -9187201950435737472L) == 0) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d3, code lost:
        r20 = -1;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = 1
            if (r1 != r0) goto L_0x0008
            return r2
        L_0x0008:
            boolean r3 = r1 instanceof defpackage.ced
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            ced r1 = (defpackage.ced) r1
            int r3 = r1.d
            int r5 = r0.d
            if (r3 == r5) goto L_0x0017
            return r4
        L_0x0017:
            java.lang.Object[] r3 = r0.b
            long[] r0 = r0.a
            int r5 = r0.length
            int r5 = r5 + -2
            if (r5 < 0) goto L_0x0109
            r6 = r4
        L_0x0021:
            r7 = r0[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r12
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 == 0) goto L_0x010b
            int r9 = r6 - r5
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r14 = r4
        L_0x003b:
            if (r14 >= r9) goto L_0x0102
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L_0x00f1
            int r15 = r6 << 3
            int r15 = r15 + r14
            r15 = r3[r15]
            if (r15 == 0) goto L_0x0055
            r1.getClass()
            int r16 = r15.hashCode()
            goto L_0x0057
        L_0x0055:
            r16 = r4
        L_0x0057:
            r17 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r16 = r16 * r17
            int r17 = r16 << 16
            r16 = r16 ^ r17
            r10 = r16 & 127(0x7f, float:1.78E-43)
            int r4 = r1.c
            int r16 = r16 >>> 7
            r16 = r16 & r4
            r18 = 0
        L_0x006a:
            long[] r11 = r1.a
            int r19 = r16 >> 3
            r20 = r16 & 7
            int r12 = r20 << 3
            r22 = r11[r19]
            long r22 = r22 >>> r12
            int r19 = r19 + 1
            r19 = r11[r19]
            int r11 = 64 - r12
            long r19 = r19 << r11
            long r11 = (long) r12
            long r11 = -r11
            r13 = 63
            long r11 = r11 >> r13
            long r11 = r19 & r11
            long r11 = r22 | r11
            r19 = r3
            long r2 = (long) r10
            r22 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r22
            long r2 = r2 ^ r11
            long r22 = r2 - r22
            long r2 = ~r2
            long r2 = r22 & r2
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r20
        L_0x009e:
            r22 = 0
            int r20 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r20 == 0) goto L_0x00c5
            int r20 = java.lang.Long.numberOfTrailingZeros(r2)
            int r20 = r20 >> 3
            int r20 = r16 + r20
            r20 = r20 & r4
            java.lang.Object[] r13 = r1.b
            r13 = r13[r20]
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r15)
            if (r13 == 0) goto L_0x00be
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            goto L_0x00d5
        L_0x00be:
            r22 = 1
            long r22 = r2 - r22
            long r2 = r2 & r22
            goto L_0x009e
        L_0x00c5:
            long r2 = ~r11
            r13 = 6
            long r2 = r2 << r13
            long r2 = r2 & r11
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r11
            int r2 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r2 == 0) goto L_0x00e2
            r20 = -1
        L_0x00d5:
            if (r20 < 0) goto L_0x00d9
            r2 = 1
            goto L_0x00da
        L_0x00d9:
            r2 = 0
        L_0x00da:
            if (r2 != 0) goto L_0x00de
            r2 = 0
            return r2
        L_0x00de:
            r2 = 0
            r3 = 8
            goto L_0x00f6
        L_0x00e2:
            r2 = 0
            r3 = 8
            int r18 = r18 + 8
            int r16 = r16 + r18
            r16 = r16 & r4
            r12 = r11
            r3 = r19
            r2 = 1
            goto L_0x006a
        L_0x00f1:
            r19 = r3
            r2 = r4
            r3 = r10
            r11 = r12
        L_0x00f6:
            long r7 = r7 >> r3
            int r14 = r14 + 1
            r4 = r2
            r10 = r3
            r12 = r11
            r3 = r19
            r2 = 1
            r11 = 7
            goto L_0x003b
        L_0x0102:
            r19 = r3
            r2 = r4
            r3 = r10
            if (r9 != r3) goto L_0x0109
            goto L_0x010e
        L_0x0109:
            r0 = 1
            goto L_0x0118
        L_0x010b:
            r19 = r3
            r2 = r4
        L_0x010e:
            if (r6 == r5) goto L_0x0109
            int r6 = r6 + 1
            r4 = r2
            r3 = r19
            r2 = 1
            goto L_0x0021
        L_0x0118:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ced.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i2 << 3) + i5];
                            i3 += obj != null ? obj.hashCode() : 0;
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
        bn7 bn7 = new bn7(4, this);
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0:
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append("...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(", ");
                            }
                            sb.append((CharSequence) bn7.invoke(obj));
                            i2++;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
            return sb.toString();
        }
        sb.append("]");
        return sb.toString();
    }
}
