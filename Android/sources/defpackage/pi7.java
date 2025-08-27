package defpackage;

/* renamed from: pi7  reason: default package */
public abstract class pi7 {
    public long[] a;
    public int[] b;
    public Object[] c;
    public int d;
    public int e;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0060, code lost:
        if (((r4 & ((~r4) << 6)) & -9187201950435737472L) == 0) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0062, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.d
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
            if (r4 == 0) goto L_0x006c
            r10 = -1
        L_0x0063:
            if (r10 < 0) goto L_0x006a
            java.lang.Object[] r13 = r13.c
            r13 = r13[r10]
            goto L_0x006b
        L_0x006a:
            r13 = 0
        L_0x006b:
            return r13
        L_0x006c:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi7.a(int):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r26v0, types: [java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d2, code lost:
        r24 = r0;
        r5 = -9187201950435737472L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e0, code lost:
        if (((r2 & ((~r2) << 6)) & -9187201950435737472L) == 0) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e2, code lost:
        r22 = -1;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = 1
            if (r1 != r0) goto L_0x0008
            return r2
        L_0x0008:
            boolean r3 = r1 instanceof defpackage.pi7
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            pi7 r1 = (defpackage.pi7) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L_0x0017
            return r4
        L_0x0017:
            int[] r3 = r0.b
            java.lang.Object[] r5 = r0.c
            long[] r0 = r0.a
            int r6 = r0.length
            int r6 = r6 + -2
            if (r6 < 0) goto L_0x0141
            r7 = r4
        L_0x0023:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r13
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r10 == 0) goto L_0x0143
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r15 = r4
        L_0x003d:
            if (r15 >= r10) goto L_0x0133
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r8 & r16
            r18 = 128(0x80, double:6.32E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L_0x0118
            int r16 = r7 << 3
            int r16 = r16 + r15
            r4 = r3[r16]
            r11 = r5[r16]
            if (r11 != 0) goto L_0x0101
            java.lang.Object r11 = r1.a(r4)
            if (r11 != 0) goto L_0x00eb
            r1.getClass()
            int r11 = java.lang.Integer.hashCode(r4)
            r16 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r11 = r11 * r16
            int r16 = r11 << 16
            r11 = r11 ^ r16
            r13 = r11 & 127(0x7f, float:1.78E-43)
            int r14 = r1.d
            int r11 = r11 >>> r12
            r11 = r11 & r14
            r16 = 0
        L_0x0071:
            long[] r12 = r1.a
            int r20 = r11 >> 3
            r21 = r11 & 7
            int r2 = r21 << 3
            r22 = r12[r20]
            long r22 = r22 >>> r2
            r21 = 1
            int r20 = r20 + 1
            r20 = r12[r20]
            int r12 = 64 - r2
            long r20 = r20 << r12
            r12 = r3
            long r2 = (long) r2
            long r2 = -r2
            r24 = 63
            long r2 = r2 >> r24
            long r2 = r20 & r2
            long r2 = r22 | r2
            r20 = r5
            r21 = r6
            long r5 = (long) r13
            r22 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r5 = r5 * r22
            long r5 = r5 ^ r2
            long r22 = r5 - r22
            long r5 = ~r5
            long r5 = r22 & r5
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r18
        L_0x00ab:
            r22 = 0
            int r24 = (r5 > r22 ? 1 : (r5 == r22 ? 0 : -1))
            if (r24 == 0) goto L_0x00d2
            int r22 = java.lang.Long.numberOfTrailingZeros(r5)
            int r22 = r22 >> 3
            int r22 = r11 + r22
            r22 = r22 & r14
            r24 = r0
            int[] r0 = r1.b
            r0 = r0[r22]
            if (r0 != r4) goto L_0x00c9
            r5 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            goto L_0x00e4
        L_0x00c9:
            r22 = 1
            long r22 = r5 - r22
            long r5 = r5 & r22
            r0 = r24
            goto L_0x00ab
        L_0x00d2:
            r24 = r0
            long r5 = ~r2
            r0 = 6
            long r5 = r5 << r0
            long r2 = r2 & r5
            r5 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r5
            int r0 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r0 == 0) goto L_0x00ef
            r22 = -1
        L_0x00e4:
            if (r22 < 0) goto L_0x00e8
            r0 = 1
            goto L_0x00e9
        L_0x00e8:
            r0 = 0
        L_0x00e9:
            if (r0 != 0) goto L_0x00ed
        L_0x00eb:
            r0 = 0
            goto L_0x0100
        L_0x00ed:
            r0 = 0
            goto L_0x0115
        L_0x00ef:
            r0 = 8
            int r16 = r16 + 8
            int r11 = r11 + r16
            r11 = r11 & r14
            r3 = r12
            r5 = r20
            r6 = r21
            r0 = r24
            r2 = 1
            goto L_0x0071
        L_0x0100:
            return r0
        L_0x0101:
            r24 = r0
            r12 = r3
            r20 = r5
            r21 = r6
            r5 = r13
            r0 = 0
            java.lang.Object r2 = r1.a(r4)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r2)
            if (r2 != 0) goto L_0x0115
            return r0
        L_0x0115:
            r2 = 8
            goto L_0x0122
        L_0x0118:
            r24 = r0
            r12 = r3
            r0 = r4
            r20 = r5
            r21 = r6
            r5 = r13
            r2 = r11
        L_0x0122:
            long r8 = r8 >> r2
            int r15 = r15 + 1
            r4 = r0
            r11 = r2
            r13 = r5
            r3 = r12
            r5 = r20
            r6 = r21
            r0 = r24
            r2 = 1
            r12 = 7
            goto L_0x003d
        L_0x0133:
            r24 = r0
            r12 = r3
            r0 = r4
            r20 = r5
            r21 = r6
            r2 = r11
            if (r10 != r2) goto L_0x0141
            r6 = r21
            goto L_0x0149
        L_0x0141:
            r0 = 1
            goto L_0x0156
        L_0x0143:
            r24 = r0
            r12 = r3
            r0 = r4
            r20 = r5
        L_0x0149:
            if (r7 == r6) goto L_0x0141
            int r7 = r7 + 1
            r4 = r0
            r3 = r12
            r5 = r20
            r0 = r24
            r2 = 1
            goto L_0x0023
        L_0x0156:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi7.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int[] iArr = this.b;
        Object[] objArr = this.c;
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
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr[i6];
                            Object obj = objArr[i6];
                            i3 += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i7);
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
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.b;
        Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr[i5];
                            Object obj = objArr[i5];
                            sb.append(i6);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i2++;
                            if (i2 < this.e) {
                                sb.append(", ");
                            }
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
        }
        sb.append('}');
        return sb.toString();
    }
}
