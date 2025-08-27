package defpackage;

/* renamed from: ta8  reason: default package */
public abstract class ta8 {
    public long[] a;
    public long[] b;
    public Object[] c;
    public int d;
    public int e;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0062, code lost:
        if (((r4 & ((~r4) << 6)) & -9187201950435737472L) == 0) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0064, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r14) {
        /*
            r13 = this;
            int r0 = java.lang.Long.hashCode(r14)
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
            if (r12 == 0) goto L_0x005b
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r13.b
            r11 = r11[r10]
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 != 0) goto L_0x0055
            goto L_0x0065
        L_0x0055:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L_0x003e
        L_0x005b:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x006e
            r10 = -1
        L_0x0065:
            if (r10 < 0) goto L_0x006c
            java.lang.Object[] r13 = r13.c
            r13 = r13[r10]
            goto L_0x006d
        L_0x006c:
            r13 = 0
        L_0x006d:
            return r13
        L_0x006e:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ta8.a(long):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r28v0, types: [java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d4, code lost:
        r26 = r3;
        r7 = -9187201950435737472L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e2, code lost:
        if (((r5 & ((~r5) << 6)) & -9187201950435737472L) == 0) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e4, code lost:
        r9 = -1;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = 1
            if (r1 != r0) goto L_0x0008
            return r2
        L_0x0008:
            boolean r3 = r1 instanceof defpackage.ta8
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            ta8 r1 = (defpackage.ta8) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L_0x0017
            return r4
        L_0x0017:
            long[] r3 = r0.b
            java.lang.Object[] r5 = r0.c
            long[] r0 = r0.a
            int r6 = r0.length
            int r6 = r6 + -2
            if (r6 < 0) goto L_0x0152
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
            if (r10 == 0) goto L_0x0154
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r15 = r4
        L_0x003d:
            if (r15 >= r10) goto L_0x0143
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r8 & r16
            r18 = 128(0x80, double:6.32E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L_0x0122
            int r16 = r7 << 3
            int r16 = r16 + r15
            r13 = r3[r16]
            r4 = r5[r16]
            if (r4 != 0) goto L_0x0104
            java.lang.Object r4 = r1.a(r13)
            if (r4 != 0) goto L_0x00ec
            r1.getClass()
            int r4 = java.lang.Long.hashCode(r13)
            r16 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r4 = r4 * r16
            int r16 = r4 << 16
            r4 = r4 ^ r16
            r11 = r4 & 127(0x7f, float:1.78E-43)
            int r2 = r1.d
            int r4 = r4 >>> r12
            r4 = r4 & r2
            r19 = 0
        L_0x0071:
            long[] r12 = r1.a
            int r20 = r4 >> 3
            r21 = r4 & 7
            r22 = r0
            int r0 = r21 << 3
            r23 = r12[r20]
            long r23 = r23 >>> r0
            r18 = 1
            int r20 = r20 + 1
            r20 = r12[r20]
            int r12 = 64 - r0
            long r20 = r20 << r12
            r12 = r5
            r25 = r6
            long r5 = (long) r0
            long r5 = -r5
            r0 = 63
            long r5 = r5 >> r0
            long r5 = r20 & r5
            long r5 = r23 | r5
            r0 = r7
            r20 = r8
            long r7 = (long) r11
            r23 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r7 = r7 * r23
            long r7 = r7 ^ r5
            long r23 = r7 - r23
            long r7 = ~r7
            long r7 = r23 & r7
            r23 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r23
        L_0x00ad:
            r23 = 0
            int r9 = (r7 > r23 ? 1 : (r7 == r23 ? 0 : -1))
            if (r9 == 0) goto L_0x00d4
            int r9 = java.lang.Long.numberOfTrailingZeros(r7)
            int r9 = r9 >> 3
            int r9 = r9 + r4
            r9 = r9 & r2
            r26 = r3
            long[] r3 = r1.b
            r23 = r3[r9]
            int r3 = (r23 > r13 ? 1 : (r23 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x00cb
            r7 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            goto L_0x00e5
        L_0x00cb:
            r23 = 1
            long r23 = r7 - r23
            long r7 = r7 & r23
            r3 = r26
            goto L_0x00ad
        L_0x00d4:
            r26 = r3
            long r7 = ~r5
            r3 = 6
            long r7 = r7 << r3
            long r5 = r5 & r7
            r7 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r7
            int r3 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r3 == 0) goto L_0x00f0
            r9 = -1
        L_0x00e5:
            if (r9 < 0) goto L_0x00e9
            r2 = 1
            goto L_0x00ea
        L_0x00e9:
            r2 = 0
        L_0x00ea:
            if (r2 != 0) goto L_0x00ee
        L_0x00ec:
            r2 = 0
            goto L_0x0103
        L_0x00ee:
            r2 = 0
            goto L_0x011f
        L_0x00f0:
            r3 = 8
            int r19 = r19 + 8
            int r4 = r4 + r19
            r4 = r4 & r2
            r7 = r0
            r5 = r12
            r8 = r20
            r0 = r22
            r6 = r25
            r3 = r26
            goto L_0x0071
        L_0x0103:
            return r2
        L_0x0104:
            r22 = r0
            r26 = r3
            r12 = r5
            r25 = r6
            r0 = r7
            r20 = r8
            r2 = 0
            r7 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            java.lang.Object r3 = r1.a(r13)
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r3)
            if (r3 != 0) goto L_0x011f
            return r2
        L_0x011f:
            r3 = 8
            goto L_0x012f
        L_0x0122:
            r22 = r0
            r26 = r3
            r2 = r4
            r12 = r5
            r25 = r6
            r0 = r7
            r20 = r8
            r7 = r13
            r3 = r11
        L_0x012f:
            long r4 = r20 >> r3
            int r15 = r15 + 1
            r11 = r3
            r13 = r7
            r6 = r25
            r3 = r26
            r7 = r0
            r8 = r4
            r5 = r12
            r0 = r22
            r12 = 7
            r4 = r2
            r2 = 1
            goto L_0x003d
        L_0x0143:
            r22 = r0
            r26 = r3
            r2 = r4
            r12 = r5
            r25 = r6
            r0 = r7
            r3 = r11
            if (r10 != r3) goto L_0x0152
            r6 = r25
            goto L_0x015b
        L_0x0152:
            r0 = 1
            goto L_0x0168
        L_0x0154:
            r22 = r0
            r26 = r3
            r2 = r4
            r12 = r5
            r0 = r7
        L_0x015b:
            if (r0 == r6) goto L_0x0152
            int r7 = r0 + 1
            r4 = r2
            r5 = r12
            r0 = r22
            r3 = r26
            r2 = 1
            goto L_0x0023
        L_0x0168:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ta8.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long[] jArr = this.b;
        Object[] objArr = this.c;
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
                            long j2 = jArr[i6];
                            Object obj = objArr[i6];
                            i3 += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j2);
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
        long[] jArr = this.b;
        Object[] objArr = this.c;
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
                            i2 = i3;
                            long j2 = jArr[i7];
                            Object obj = objArr[i7];
                            sb.append(j2);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
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
                    int i8 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i8;
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
