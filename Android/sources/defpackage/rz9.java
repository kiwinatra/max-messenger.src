package defpackage;

/* renamed from: rz9  reason: default package */
public final class rz9 extends ced {
    public int e;

    public rz9(int i) {
        this.a = bed.a;
        this.b = ld9.c;
        if (i >= 0) {
            e(bed.e(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final void a(Object obj) {
        this.b[c(obj)] = obj;
    }

    public final void b() {
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
        ArraysKt___ArraysJvmKt.fill((T[]) this.b, null, 0, this.c);
        this.e = bed.a(this.c) - this.d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            if (r1 == 0) goto L_0x000b
            int r3 = r25.hashCode()
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
            int r6 = r0.c
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
            if (r19 == 0) goto L_0x006d
            int r16 = java.lang.Long.numberOfTrailingZeros(r2)
            int r16 = r16 >> 3
            int r16 = r7 + r16
            r16 = r16 & r6
            java.lang.Object[] r15 = r0.b
            r15 = r15[r16]
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r1)
            if (r15 == 0) goto L_0x0066
            return r16
        L_0x0066:
            r16 = 1
            long r16 = r2 - r16
            long r2 = r2 & r16
            goto L_0x004b
        L_0x006d:
            long r2 = ~r9
            r15 = 6
            long r2 = r2 << r15
            long r2 = r2 & r9
            long r2 = r2 & r13
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            r3 = 8
            if (r2 == 0) goto L_0x01db
            int r1 = r0.d(r5)
            int r2 = r0.e
            r8 = 255(0xff, double:1.26E-321)
            if (r2 != 0) goto L_0x0094
            long[] r2 = r0.a
            int r10 = r1 >> 3
            r13 = r2[r10]
            r2 = r1 & 7
            int r2 = r2 << 3
            long r13 = r13 >> r2
            long r13 = r13 & r8
            r16 = 254(0xfe, double:1.255E-321)
            int r2 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x0098
        L_0x0094:
            r16 = r11
            goto L_0x0198
        L_0x0098:
            int r1 = r0.c
            if (r1 <= r3) goto L_0x010f
            int r1 = r0.d
            long r1 = (long) r1
            r13 = 32
            long r1 = defpackage.wj6.f(r1, r13)
            int r3 = r0.c
            long r13 = (long) r3
            r15 = r5
            r4 = 25
            long r3 = defpackage.wj6.f(r13, r4)
            int r1 = java.lang.Long.compareUnsigned(r1, r3)
            if (r1 > 0) goto L_0x0110
            long[] r1 = r0.a
            int r2 = r0.c
            r3 = 0
            r4 = 0
        L_0x00bb:
            if (r3 >= r2) goto L_0x0105
            int r5 = r3 >> 3
            r13 = r1[r5]
            r10 = r3 & 7
            int r10 = r10 << 3
            long r13 = r13 >> r10
            long r13 = r13 & r8
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 != 0) goto L_0x00fe
            long[] r13 = r0.a
            r20 = r13[r5]
            long r6 = r8 << r10
            long r6 = ~r6
            long r6 = r20 & r6
            r20 = 128(0x80, double:6.32E-322)
            long r22 = r20 << r10
            long r6 = r6 | r22
            r13[r5] = r6
            int r5 = r0.c
            int r6 = r3 + -7
            r6 = r6 & r5
            r5 = r5 & 7
            int r6 = r6 + r5
            int r5 = r6 >> 3
            r6 = r6 & 7
            int r6 = r6 << 3
            r20 = r13[r5]
            r7 = r1
            r10 = r2
            long r1 = r8 << r6
            long r1 = ~r1
            long r1 = r20 & r1
            r20 = 128(0x80, double:6.32E-322)
            long r22 = r20 << r6
            long r1 = r1 | r22
            r13[r5] = r1
            int r4 = r4 + 1
            goto L_0x0100
        L_0x00fe:
            r7 = r1
            r10 = r2
        L_0x0100:
            int r3 = r3 + 1
            r1 = r7
            r2 = r10
            goto L_0x00bb
        L_0x0105:
            int r1 = r0.e
            int r1 = r1 + r4
            r0.e = r1
        L_0x010a:
            r16 = r11
            r2 = r15
            goto L_0x0194
        L_0x010f:
            r15 = r5
        L_0x0110:
            int r1 = r0.c
            int r1 = defpackage.bed.c(r1)
            long[] r2 = r0.a
            java.lang.Object[] r3 = r0.b
            int r4 = r0.c
            r0.e(r1)
            java.lang.Object[] r1 = r0.b
            r5 = 0
        L_0x0122:
            if (r5 >= r4) goto L_0x010a
            int r6 = r5 >> 3
            r6 = r2[r6]
            r13 = r5 & 7
            int r13 = r13 << 3
            long r6 = r6 >> r13
            long r6 = r6 & r8
            r13 = 128(0x80, double:6.32E-322)
            int r6 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r6 >= 0) goto L_0x0187
            r6 = r3[r5]
            if (r6 == 0) goto L_0x0140
            int r7 = r6.hashCode()
        L_0x013c:
            r10 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            goto L_0x0142
        L_0x0140:
            r7 = 0
            goto L_0x013c
        L_0x0142:
            int r7 = r7 * r10
            int r13 = r7 << 16
            r7 = r7 ^ r13
            int r13 = r7 >>> 7
            int r13 = r0.d(r13)
            r7 = r7 & 127(0x7f, float:1.78E-43)
            r16 = r11
            long r10 = (long) r7
            long[] r7 = r0.a
            int r14 = r13 >> 3
            r18 = r13 & 7
            int r18 = r18 << 3
            r20 = r7[r14]
            r25 = r13
            long r12 = r8 << r18
            long r12 = ~r12
            long r12 = r20 & r12
            long r20 = r10 << r18
            long r12 = r12 | r20
            r7[r14] = r12
            int r12 = r0.c
            int r13 = r25 + -7
            r13 = r13 & r12
            r12 = r12 & 7
            int r13 = r13 + r12
            int r12 = r13 >> 3
            r13 = r13 & 7
            int r13 = r13 << 3
            r20 = r7[r12]
            r14 = r2
            r18 = r3
            long r2 = r8 << r13
            long r2 = ~r2
            long r2 = r20 & r2
            long r10 = r10 << r13
            long r2 = r2 | r10
            r7[r12] = r2
            r1[r25] = r6
            goto L_0x018c
        L_0x0187:
            r14 = r2
            r18 = r3
            r16 = r11
        L_0x018c:
            int r5 = r5 + 1
            r2 = r14
            r11 = r16
            r3 = r18
            goto L_0x0122
        L_0x0194:
            int r1 = r0.d(r2)
        L_0x0198:
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
            if (r11 != 0) goto L_0x01b4
            goto L_0x01b5
        L_0x01b4:
            r3 = 0
        L_0x01b5:
            int r2 = r2 - r3
            r0.e = r2
            long r2 = r8 << r10
            long r2 = ~r2
            long r2 = r2 & r6
            long r6 = r16 << r10
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
            long r2 = r16 << r2
            long r2 = r2 | r5
            r4[r0] = r2
            return r1
        L_0x01db:
            r2 = r5
            int r8 = r8 + r3
            int r7 = r7 + r8
            r7 = r7 & r6
            r3 = r18
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz9.c(java.lang.Object):int");
    }

    public final int d(int i) {
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

    public final void e(int i) {
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
        this.b = new Object[max];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0068, code lost:
        if (((r4 & ((~r4) << 6)) & -9187201950435737472L) == 0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006a, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L_0x0008
            int r1 = r14.hashCode()
            goto L_0x0009
        L_0x0008:
            r1 = r0
        L_0x0009:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.c
            int r1 = r1 >>> 7
        L_0x0016:
            r1 = r1 & r3
            long[] r4 = r13.a
            int r5 = r1 >> 3
            r6 = r1 & 7
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
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L_0x0042:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0061
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.b
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r14)
            if (r11 == 0) goto L_0x005b
            goto L_0x006b
        L_0x005b:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L_0x0042
        L_0x0061:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x0071
            r10 = -1
        L_0x006b:
            if (r10 < 0) goto L_0x0070
            r13.g(r10)
        L_0x0070:
            return
        L_0x0071:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz9.f(java.lang.Object):void");
    }

    public final void g(int i) {
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
        this.b[i] = null;
    }

    public /* synthetic */ rz9() {
        this(6);
    }
}
