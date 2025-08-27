package defpackage;

import java.util.Objects;
import kotlin.UByte;
import kotlin.UShort;

/* renamed from: p0d  reason: default package */
public final class p0d extends wb7 {
    public static final p0d y = new p0d((Object) null, new Object[0], 0);
    public final transient Object v;
    public final transient Object[] w;
    public final transient int x;

    public p0d(Object obj, Object[] objArr, int i) {
        this.v = obj;
        this.w = objArr;
        this.x = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object j(java.lang.Object[] r16, int r17, int r18, int r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L_0x0015
            r0 = r16[r19]
            java.util.Objects.requireNonNull(r0)
            r0 = r19 ^ 1
            r0 = r16[r0]
            java.util.Objects.requireNonNull(r0)
            return r2
        L_0x0015:
            int r4 = r1 + -1
            r5 = 2
            r6 = 128(0x80, float:1.794E-43)
            r7 = 3
            r8 = -1
            r9 = 0
            if (r1 > r6) goto L_0x0086
            byte[] r1 = new byte[r1]
            java.util.Arrays.fill(r1, r8)
            r6 = r9
            r8 = r6
        L_0x0026:
            if (r6 >= r0) goto L_0x0075
            int r10 = r6 * 2
            int r10 = r10 + r19
            int r11 = r8 * 2
            int r11 = r11 + r19
            r12 = r16[r10]
            java.util.Objects.requireNonNull(r12)
            r10 = r10 ^ r3
            r10 = r16[r10]
            java.util.Objects.requireNonNull(r10)
            int r13 = r12.hashCode()
            int r13 = defpackage.iq.c0(r13)
        L_0x0043:
            r13 = r13 & r4
            byte r14 = r1[r13]
            r15 = 255(0xff, float:3.57E-43)
            r14 = r14 & r15
            if (r14 != r15) goto L_0x0059
            byte r14 = (byte) r11
            r1[r13] = r14
            if (r8 >= r6) goto L_0x0056
            r16[r11] = r12
            r11 = r11 ^ 1
            r16[r11] = r10
        L_0x0056:
            int r8 = r8 + 1
            goto L_0x006f
        L_0x0059:
            r15 = r16[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x0072
            vb7 r2 = new vb7
            r11 = r14 ^ 1
            r13 = r16[r11]
            java.util.Objects.requireNonNull(r13)
            r2.<init>(r12, r10, r13)
            r16[r11] = r10
        L_0x006f:
            int r6 = r6 + 1
            goto L_0x0026
        L_0x0072:
            int r13 = r13 + 1
            goto L_0x0043
        L_0x0075:
            if (r8 != r0) goto L_0x0078
            goto L_0x0085
        L_0x0078:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r0[r3] = r1
            r0[r5] = r2
            r1 = r0
        L_0x0085:
            return r1
        L_0x0086:
            r6 = 32768(0x8000, float:4.5918E-41)
            if (r1 > r6) goto L_0x00f3
            short[] r1 = new short[r1]
            java.util.Arrays.fill(r1, r8)
            r6 = r9
            r8 = r6
        L_0x0092:
            if (r6 >= r0) goto L_0x00e2
            int r10 = r6 * 2
            int r10 = r10 + r19
            int r11 = r8 * 2
            int r11 = r11 + r19
            r12 = r16[r10]
            java.util.Objects.requireNonNull(r12)
            r10 = r10 ^ r3
            r10 = r16[r10]
            java.util.Objects.requireNonNull(r10)
            int r13 = r12.hashCode()
            int r13 = defpackage.iq.c0(r13)
        L_0x00af:
            r13 = r13 & r4
            short r14 = r1[r13]
            r15 = 65535(0xffff, float:9.1834E-41)
            r14 = r14 & r15
            if (r14 != r15) goto L_0x00c6
            short r14 = (short) r11
            r1[r13] = r14
            if (r8 >= r6) goto L_0x00c3
            r16[r11] = r12
            r11 = r11 ^ 1
            r16[r11] = r10
        L_0x00c3:
            int r8 = r8 + 1
            goto L_0x00dc
        L_0x00c6:
            r15 = r16[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x00df
            vb7 r2 = new vb7
            r11 = r14 ^ 1
            r13 = r16[r11]
            java.util.Objects.requireNonNull(r13)
            r2.<init>(r12, r10, r13)
            r16[r11] = r10
        L_0x00dc:
            int r6 = r6 + 1
            goto L_0x0092
        L_0x00df:
            int r13 = r13 + 1
            goto L_0x00af
        L_0x00e2:
            if (r8 != r0) goto L_0x00e5
            goto L_0x00f2
        L_0x00e5:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r0[r3] = r1
            r0[r5] = r2
            r1 = r0
        L_0x00f2:
            return r1
        L_0x00f3:
            int[] r1 = new int[r1]
            java.util.Arrays.fill(r1, r8)
            r6 = r9
            r10 = r6
        L_0x00fa:
            if (r6 >= r0) goto L_0x0147
            int r11 = r6 * 2
            int r11 = r11 + r19
            int r12 = r10 * 2
            int r12 = r12 + r19
            r13 = r16[r11]
            java.util.Objects.requireNonNull(r13)
            r11 = r11 ^ r3
            r11 = r16[r11]
            java.util.Objects.requireNonNull(r11)
            int r14 = r13.hashCode()
            int r14 = defpackage.iq.c0(r14)
        L_0x0117:
            r14 = r14 & r4
            r15 = r1[r14]
            if (r15 != r8) goto L_0x0129
            r1[r14] = r12
            if (r10 >= r6) goto L_0x0126
            r16[r12] = r13
            r12 = r12 ^ 1
            r16[r12] = r11
        L_0x0126:
            int r10 = r10 + 1
            goto L_0x013f
        L_0x0129:
            r8 = r16[r15]
            boolean r8 = r13.equals(r8)
            if (r8 == 0) goto L_0x0143
            vb7 r2 = new vb7
            r8 = r15 ^ 1
            r12 = r16[r8]
            java.util.Objects.requireNonNull(r12)
            r2.<init>(r13, r11, r12)
            r16[r8] = r11
        L_0x013f:
            int r6 = r6 + 1
            r8 = -1
            goto L_0x00fa
        L_0x0143:
            int r14 = r14 + 1
            r8 = -1
            goto L_0x0117
        L_0x0147:
            if (r10 != r0) goto L_0x014a
            goto L_0x0157
        L_0x014a:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r3] = r1
            r0[r5] = r2
            r1 = r0
        L_0x0157:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p0d.j(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static Object k(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int c0 = iq.c0(obj2.hashCode());
                while (true) {
                    int i3 = c0 & length;
                    byte b = bArr[i3] & UByte.MAX_VALUE;
                    if (b == 255) {
                        return null;
                    }
                    if (obj2.equals(objArr[b])) {
                        return objArr[b ^ 1];
                    }
                    c0 = i3 + 1;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int c02 = iq.c0(obj2.hashCode());
                while (true) {
                    int i4 = c02 & length2;
                    short s = sArr[i4] & UShort.MAX_VALUE;
                    if (s == 65535) {
                        return null;
                    }
                    if (obj2.equals(objArr[s])) {
                        return objArr[s ^ 1];
                    }
                    c02 = i4 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int c03 = iq.c0(obj2.hashCode());
                while (true) {
                    int i5 = c03 & length3;
                    int i6 = iArr[i5];
                    if (i6 == -1) {
                        return null;
                    }
                    if (obj2.equals(objArr[i6])) {
                        return objArr[i6 ^ 1];
                    }
                    c03 = i5 + 1;
                }
            }
        }
    }

    public final dc7 c() {
        return new m0d(this, this.w, 0, this.x);
    }

    public final dc7 d() {
        return new n0d(this, new o0d(this.w, 0, this.x));
    }

    public final kb7 e() {
        return new o0d(this.w, 1, this.x);
    }

    public final boolean g() {
        return false;
    }

    public final Object get(Object obj) {
        Object k = k(this.v, this.w, this.x, 0, obj);
        if (k == null) {
            return null;
        }
        return k;
    }

    public final int size() {
        return this.x;
    }
}
