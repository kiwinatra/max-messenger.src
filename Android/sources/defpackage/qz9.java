package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: qz9  reason: default package */
public final class qz9 extends aed {
    public int f;

    public qz9(int i) {
        this.a = bed.a;
        Object[] objArr = ld9.c;
        this.b = objArr;
        this.c = objArr;
        if (i >= 0) {
            h(bed.e(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final void e() {
        this.e = 0;
        long[] jArr = this.a;
        if (jArr != bed.a) {
            ArraysKt___ArraysJvmKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        ArraysKt___ArraysJvmKt.fill((T[]) this.c, null, 0, this.d);
        ArraysKt___ArraysJvmKt.fill((T[]) this.b, null, 0, this.d);
        this.f = bed.a(this.d) - this.e;
    }

    public final int f(int i) {
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

    public final int g(Object obj) {
        Object obj2 = obj;
        int hashCode = (obj2 != null ? obj.hashCode() : 0) * -862048943;
        int i = hashCode ^ (hashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this.d;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-((long) i8)) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (long) i3;
            int i9 = i3;
            long j3 = j ^ (j2 * 72340172838076673L);
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & -9187201950435737472L; j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = (i5 + (Long.numberOfTrailingZeros(j4) >> 3)) & i4;
                if (Intrinsics.areEqual(this.b[numberOfTrailingZeros], obj2)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & -9187201950435737472L) != 0) {
                int f2 = f(i2);
                if (this.f == 0 && ((this.a[f2 >> 3] >> ((f2 & 7) << 3)) & 255) != 254) {
                    if (this.d <= 8 || Long.compareUnsigned(wj6.f((long) this.e, 32), wj6.f((long) this.d, 25)) > 0) {
                        j(bed.c(this.d));
                    } else {
                        j(this.d);
                    }
                    f2 = f(i2);
                }
                this.e++;
                int i10 = this.f;
                long[] jArr2 = this.a;
                int i11 = f2 >> 3;
                long j5 = jArr2[i11];
                int i12 = (f2 & 7) << 3;
                this.f = i10 - (((j5 >> i12) & 255) == 128 ? 1 : 0);
                jArr2[i11] = (j5 & (~(255 << i12))) | (j2 << i12);
                int i13 = this.d;
                int i14 = ((f2 - 7) & i13) + (i13 & 7);
                int i15 = i14 >> 3;
                int i16 = (i14 & 7) << 3;
                jArr2[i15] = ((~(255 << i16)) & jArr2[i15]) | (j2 << i16);
                return ~f2;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i3 = i9;
        }
    }

    public final void h(int i) {
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
        this.c = new Object[max];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0068, code lost:
        if (((r4 & ((~r4) << 6)) & -9187201950435737472L) == 0) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006a, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(java.lang.Object r14) {
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
            int r3 = r13.d
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
            if (r4 == 0) goto L_0x00b1
            r10 = -1
        L_0x006b:
            r14 = 0
            if (r10 < 0) goto L_0x00b0
            int r0 = r13.e
            int r0 = r0 + -1
            r13.e = r0
            long[] r0 = r13.a
            int r1 = r10 >> 3
            r2 = r10 & 7
            int r2 = r2 << 3
            r3 = r0[r1]
            r5 = 255(0xff, double:1.26E-321)
            long r7 = r5 << r2
            long r7 = ~r7
            long r3 = r3 & r7
            r7 = 254(0xfe, double:1.255E-321)
            long r11 = r7 << r2
            long r2 = r3 | r11
            r0[r1] = r2
            int r1 = r13.d
            int r2 = r10 + -7
            r2 = r2 & r1
            r1 = r1 & 7
            int r2 = r2 + r1
            int r1 = r2 >> 3
            r2 = r2 & 7
            int r2 = r2 << 3
            r3 = r0[r1]
            long r5 = r5 << r2
            long r5 = ~r5
            long r3 = r3 & r5
            long r5 = r7 << r2
            long r2 = r3 | r5
            r0[r1] = r2
            java.lang.Object[] r0 = r13.b
            r0[r10] = r14
            java.lang.Object[] r13 = r13.c
            r0 = r13[r10]
            r13[r10] = r14
            return r0
        L_0x00b0:
            return r14
        L_0x00b1:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz9.i(java.lang.Object):java.lang.Object");
    }

    public final void j(int i) {
        int i2;
        long[] jArr = this.a;
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        int i3 = this.d;
        h(i);
        Object[] objArr3 = this.b;
        Object[] objArr4 = this.c;
        int i4 = 0;
        while (i4 < i3) {
            if (((jArr[i4 >> 3] >> ((i4 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i4];
                int hashCode = (obj != null ? obj.hashCode() : 0) * -862048943;
                int i5 = hashCode ^ (hashCode << 16);
                int f2 = f(i5 >>> 7);
                long j = (long) (i5 & 127);
                long[] jArr2 = this.a;
                int i6 = f2 >> 3;
                int i7 = (f2 & 7) << 3;
                i2 = i4;
                jArr2[i6] = (jArr2[i6] & (~(255 << i7))) | (j << i7);
                int i8 = this.d;
                int i9 = ((f2 - 7) & i8) + (i8 & 7);
                int i10 = i9 >> 3;
                int i11 = (i9 & 7) << 3;
                jArr2[i10] = (jArr2[i10] & (~(255 << i11))) | (j << i11);
                objArr3[f2] = obj;
                objArr4[f2] = objArr2[i2];
            } else {
                i2 = i4;
            }
            i4 = i2 + 1;
        }
    }

    public final void k(Object obj, Object obj2) {
        int g = g(obj);
        if (g < 0) {
            g = ~g;
        }
        this.b[g] = obj;
        this.c[g] = obj2;
    }
}
