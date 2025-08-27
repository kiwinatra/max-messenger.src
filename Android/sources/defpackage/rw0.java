package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;

/* renamed from: rw0  reason: default package */
public final class rw0 {
    public final rw0 a;
    public final AtomicReference b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public int[] f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public String[] l;
    public int m;
    public int n;
    public boolean o;

    public rw0(int i2) {
        this.a = null;
        this.c = i2;
        this.d = true;
        this.e = true;
        this.b = new AtomicReference(new qw0(64, 4, new int[ConstantsKt.MINIMUM_BLOCK_SIZE], new String[Uuid.SIZE_BITS], 448, ConstantsKt.MINIMUM_BLOCK_SIZE));
    }

    public final int a(int i2) {
        return ((this.g - 1) & i2) << 2;
    }

    public final int b(int i2) {
        int a2 = a(i2);
        int[] iArr = this.f;
        if (iArr[a2 + 3] == 0) {
            return a2;
        }
        if (this.k > (this.g >> 1)) {
            int d2 = (this.m - d()) >> 2;
            int i3 = this.k;
            if (d2 > ((i3 + 1) >> 7) || ((double) i3) > ((double) this.g) * 0.8d) {
                return c(i2);
            }
        }
        int i4 = this.h + ((a2 >> 3) << 2);
        if (iArr[i4 + 3] == 0) {
            return i4;
        }
        int i5 = this.i;
        int i6 = this.j;
        int i7 = i5 + ((a2 >> (i6 + 2)) << i6);
        int i8 = (1 << i6) + i7;
        while (i7 < i8) {
            if (iArr[i7 + 3] == 0) {
                return i7;
            }
            i7 += 4;
        }
        int i9 = this.m;
        int i10 = i9 + 4;
        this.m = i10;
        int i11 = this.g;
        if (i10 < (i11 << 3)) {
            return i9;
        }
        if (!this.e || i11 <= 1024) {
            return c(i2);
        }
        StringBuilder sb = new StringBuilder("Spill-over slots in symbol table with ");
        sb.append(this.k);
        sb.append(" entries, hash area of ");
        sb.append(this.g);
        sb.append(" slots is now full (all ");
        throw new IllegalStateException(wj6.l(sb, this.g >> 3, " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`"));
    }

    public final int c(int i2) {
        this.o = false;
        int[] iArr = this.f;
        String[] strArr = this.l;
        int i3 = this.g;
        int i4 = this.k;
        int i5 = i3 + i3;
        int i6 = this.m;
        if (i5 > 65536) {
            n(true);
        } else {
            this.f = new int[(iArr.length + (i3 << 3))];
            this.g = i5;
            int i7 = i5 << 2;
            this.h = i7;
            this.i = i7 + (i7 >> 1);
            int i8 = i5 >> 2;
            this.j = i8 < 64 ? 4 : i8 <= 256 ? 5 : i8 <= 1024 ? 6 : 7;
            this.l = new String[(strArr.length << 1)];
            n(false);
            int[] iArr2 = new int[16];
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10 += 4) {
                int i11 = iArr[i10 + 3];
                if (i11 != 0) {
                    i9++;
                    String str = strArr[i10 >> 2];
                    if (i11 == 1) {
                        iArr2[0] = iArr[i10];
                        f(str, iArr2, 1);
                    } else if (i11 == 2) {
                        iArr2[0] = iArr[i10];
                        iArr2[1] = iArr[i10 + 1];
                        f(str, iArr2, 2);
                    } else if (i11 != 3) {
                        if (i11 > iArr2.length) {
                            iArr2 = new int[i11];
                        }
                        System.arraycopy(iArr, iArr[i10 + 1], iArr2, 0, i11);
                        f(str, iArr2, i11);
                    } else {
                        iArr2[0] = iArr[i10];
                        iArr2[1] = iArr[i10 + 1];
                        iArr2[2] = iArr[i10 + 2];
                        f(str, iArr2, 3);
                    }
                }
            }
            if (i9 != i4) {
                throw new IllegalStateException(g63.h("Failed rehash(): old count=", i4, i9, ", copyCount="));
            }
        }
        int a2 = a(i2);
        int[] iArr3 = this.f;
        if (iArr3[a2 + 3] == 0) {
            return a2;
        }
        int i12 = this.h + ((a2 >> 3) << 2);
        if (iArr3[i12 + 3] == 0) {
            return i12;
        }
        int i13 = this.i;
        int i14 = this.j;
        int i15 = i13 + ((a2 >> (i14 + 2)) << i14);
        int i16 = (1 << i14) + i15;
        while (i15 < i16) {
            if (iArr3[i15 + 3] == 0) {
                return i15;
            }
            i15 += 4;
        }
        int i17 = this.m;
        this.m = i17 + 4;
        return i17;
    }

    public final int d() {
        int i2 = this.g;
        return (i2 << 3) - i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r8 = r6 + 1;
        r3 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r7[r6] == r0[r9]) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        r9 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        r6 = r8 + 1;
        r3 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        if (r7[r8] == r0[r9]) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        r9 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        r8 = r6 + 1;
        r3 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        if (r7[r6] == r0[r9]) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        r9 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0053, code lost:
        r6 = r8 + 1;
        r4 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005b, code lost:
        if (r7[r8] == r0[r9]) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005d, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        r3 = r8 + 2;
        r5 = r9 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0066, code lost:
        if (r7[r6] == r0[r4]) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0068, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0069, code lost:
        r8 = r8 + 3;
        r9 = r9 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0071, code lost:
        if (r7[r3] == r0[r5]) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0073, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0078, code lost:
        if (r7[r8] == r0[r9]) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007b, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(int[] r7, int r8, int r9) {
        /*
            r6 = this;
            int[] r0 = r6.f
            r1 = 1
            r2 = 0
            switch(r8) {
                case 4: goto L_0x0052;
                case 5: goto L_0x0044;
                case 6: goto L_0x0036;
                case 7: goto L_0x0028;
                case 8: goto L_0x001c;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = r2
        L_0x0008:
            int r3 = r0 + 1
            r0 = r7[r0]
            int[] r4 = r6.f
            int r5 = r9 + 1
            r9 = r4[r9]
            if (r0 == r9) goto L_0x0016
            r1 = r2
            goto L_0x0018
        L_0x0016:
            if (r3 < r8) goto L_0x0019
        L_0x0018:
            return r1
        L_0x0019:
            r0 = r3
            r9 = r5
            goto L_0x0008
        L_0x001c:
            r6 = r7[r2]
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r6 == r9) goto L_0x0025
            return r2
        L_0x0025:
            r9 = r8
            r6 = r1
            goto L_0x0029
        L_0x0028:
            r6 = r2
        L_0x0029:
            int r8 = r6 + 1
            r6 = r7[r6]
            int r3 = r9 + 1
            r9 = r0[r9]
            if (r6 == r9) goto L_0x0034
            return r2
        L_0x0034:
            r9 = r3
            goto L_0x0037
        L_0x0036:
            r8 = r2
        L_0x0037:
            int r6 = r8 + 1
            r8 = r7[r8]
            int r3 = r9 + 1
            r9 = r0[r9]
            if (r8 == r9) goto L_0x0042
            return r2
        L_0x0042:
            r9 = r3
            goto L_0x0045
        L_0x0044:
            r6 = r2
        L_0x0045:
            int r8 = r6 + 1
            r6 = r7[r6]
            int r3 = r9 + 1
            r9 = r0[r9]
            if (r6 == r9) goto L_0x0050
            return r2
        L_0x0050:
            r9 = r3
            goto L_0x0053
        L_0x0052:
            r8 = r2
        L_0x0053:
            int r6 = r8 + 1
            r3 = r7[r8]
            int r4 = r9 + 1
            r5 = r0[r9]
            if (r3 == r5) goto L_0x005e
            return r2
        L_0x005e:
            int r3 = r8 + 2
            r6 = r7[r6]
            int r5 = r9 + 2
            r4 = r0[r4]
            if (r6 == r4) goto L_0x0069
            return r2
        L_0x0069:
            int r8 = r8 + 3
            r6 = r7[r3]
            int r9 = r9 + 3
            r3 = r0[r5]
            if (r6 == r3) goto L_0x0074
            return r2
        L_0x0074:
            r6 = r7[r8]
            r7 = r0[r9]
            if (r6 == r7) goto L_0x007b
            return r2
        L_0x007b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw0.e(int[], int, int):boolean");
    }

    public final String f(String str, int[] iArr, int i2) {
        int i3;
        if (this.o) {
            int[] iArr2 = this.f;
            this.f = Arrays.copyOf(iArr2, iArr2.length);
            String[] strArr = this.l;
            this.l = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.o = false;
        }
        if (this.d) {
            str = wi7.b.a(str);
        }
        if (i2 == 1) {
            int i4 = iArr[0] ^ this.c;
            int i5 = i4 + (i4 >>> 16);
            int i6 = i5 ^ (i5 << 3);
            i3 = b(i6 + (i6 >>> 12));
            int[] iArr3 = this.f;
            iArr3[i3] = iArr[0];
            iArr3[i3 + 3] = 1;
        } else if (i2 == 2) {
            i3 = b(g(iArr[0], iArr[1]));
            int[] iArr4 = this.f;
            iArr4[i3] = iArr[0];
            iArr4[i3 + 1] = iArr[1];
            iArr4[i3 + 3] = 2;
        } else if (i2 != 3) {
            int i7 = i(i2, iArr);
            i3 = b(i7);
            int[] iArr5 = this.f;
            iArr5[i3] = i7;
            int i8 = this.n;
            int i9 = i8 + i2;
            if (i9 > iArr5.length) {
                int length = i9 - iArr5.length;
                int min = Math.min(ConstantsKt.DEFAULT_BLOCK_SIZE, this.g);
                this.f = Arrays.copyOf(this.f, Math.max(length, min) + this.f.length);
            }
            System.arraycopy(iArr, 0, this.f, i8, i2);
            this.n += i2;
            int[] iArr6 = this.f;
            iArr6[i3 + 1] = i8;
            iArr6[i3 + 3] = i2;
        } else {
            i3 = b(h(iArr[0], iArr[1], iArr[2]));
            int[] iArr7 = this.f;
            iArr7[i3] = iArr[0];
            iArr7[i3 + 1] = iArr[1];
            iArr7[i3 + 2] = iArr[2];
            iArr7[i3 + 3] = 3;
        }
        this.l[i3 >> 2] = str;
        this.k++;
        return str;
    }

    public final int g(int i2, int i3) {
        int i4 = i2 + (i2 >>> 15);
        int i5 = this.c;
        int i6 = i5 ^ ((i3 * 33) + (i4 ^ (i4 >>> 9)));
        int i7 = i6 + (i6 >>> 16);
        int i8 = i7 ^ (i7 >>> 4);
        return i8 + (i8 << 3);
    }

    public final int h(int i2, int i3, int i4) {
        int i5 = this.c ^ i2;
        int i6 = (((i5 + (i5 >>> 9)) * 31) + i3) * 33;
        int i7 = (i6 + (i6 >>> 15)) ^ i4;
        int i8 = i7 + (i7 >>> 4);
        int i9 = i8 + (i8 >>> 15);
        return i9 ^ (i9 << 9);
    }

    public final int i(int i2, int[] iArr) {
        if (i2 >= 4) {
            int i3 = this.c ^ iArr[0];
            int i4 = i3 + (i3 >>> 9) + iArr[1];
            int i5 = ((i4 + (i4 >>> 15)) * 33) ^ iArr[2];
            int i6 = i5 + (i5 >>> 4);
            for (int i7 = 3; i7 < i2; i7++) {
                int i8 = iArr[i7];
                i6 += i8 ^ (i8 >> 21);
            }
            int i9 = i6 * 65599;
            int i10 = i9 + (i9 >>> 19);
            return i10 ^ (i10 << 5);
        }
        throw new IllegalArgumentException();
    }

    public final String j(int i2) {
        int i3 = this.c ^ i2;
        int i4 = i3 + (i3 >>> 16);
        int i5 = i4 ^ (i4 << 3);
        int a2 = a(i5 + (i5 >>> 12));
        int[] iArr = this.f;
        int i6 = iArr[a2 + 3];
        if (i6 == 1) {
            if (iArr[a2] == i2) {
                return this.l[a2 >> 2];
            }
        } else if (i6 == 0) {
            return null;
        }
        int i7 = this.h + ((a2 >> 3) << 2);
        int i8 = iArr[i7 + 3];
        if (i8 == 1) {
            if (iArr[i7] == i2) {
                return this.l[i7 >> 2];
            }
        } else if (i8 == 0) {
            return null;
        }
        int i9 = this.i;
        int i10 = this.j;
        int i11 = i9 + ((a2 >> (i10 + 2)) << i10);
        int i12 = (1 << i10) + i11;
        while (i11 < i12) {
            int i13 = iArr[i11 + 3];
            if (i2 == iArr[i11] && 1 == i13) {
                return this.l[i11 >> 2];
            }
            if (i13 == 0) {
                return null;
            }
            i11 += 4;
        }
        for (int d2 = d(); d2 < this.m; d2 += 4) {
            if (i2 == iArr[d2] && 1 == iArr[d2 + 3]) {
                return this.l[d2 >> 2];
            }
        }
        return null;
    }

    public final String k(int i2, int i3) {
        int a2 = a(g(i2, i3));
        int[] iArr = this.f;
        int i4 = iArr[a2 + 3];
        if (i4 == 2) {
            if (i2 == iArr[a2] && i3 == iArr[a2 + 1]) {
                return this.l[a2 >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        int i5 = this.h + ((a2 >> 3) << 2);
        int i6 = iArr[i5 + 3];
        if (i6 == 2) {
            if (i2 == iArr[i5] && i3 == iArr[i5 + 1]) {
                return this.l[i5 >> 2];
            }
        } else if (i6 == 0) {
            return null;
        }
        int i7 = this.i;
        int i8 = this.j;
        int i9 = i7 + ((a2 >> (i8 + 2)) << i8);
        int i10 = (1 << i8) + i9;
        while (i9 < i10) {
            int i11 = iArr[i9 + 3];
            if (i2 == iArr[i9] && i3 == iArr[i9 + 1] && 2 == i11) {
                return this.l[i9 >> 2];
            }
            if (i11 == 0) {
                return null;
            }
            i9 += 4;
        }
        for (int d2 = d(); d2 < this.m; d2 += 4) {
            if (i2 == iArr[d2] && i3 == iArr[d2 + 1] && 2 == iArr[d2 + 3]) {
                return this.l[d2 >> 2];
            }
        }
        return null;
    }

    public final String l(int i2, int i3, int i4) {
        int a2 = a(h(i2, i3, i4));
        int[] iArr = this.f;
        int i5 = iArr[a2 + 3];
        if (i5 == 3) {
            if (i2 == iArr[a2] && iArr[a2 + 1] == i3 && iArr[a2 + 2] == i4) {
                return this.l[a2 >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        int i6 = this.h + ((a2 >> 3) << 2);
        int i7 = iArr[i6 + 3];
        if (i7 == 3) {
            if (i2 == iArr[i6] && iArr[i6 + 1] == i3 && iArr[i6 + 2] == i4) {
                return this.l[i6 >> 2];
            }
        } else if (i7 == 0) {
            return null;
        }
        int i8 = this.i;
        int i9 = this.j;
        int i10 = i8 + ((a2 >> (i9 + 2)) << i9);
        int i11 = (1 << i9) + i10;
        while (i10 < i11) {
            int i12 = iArr[i10 + 3];
            if (i2 == iArr[i10] && i3 == iArr[i10 + 1] && i4 == iArr[i10 + 2] && 3 == i12) {
                return this.l[i10 >> 2];
            }
            if (i12 == 0) {
                return null;
            }
            i10 += 4;
        }
        for (int d2 = d(); d2 < this.m; d2 += 4) {
            if (i2 == iArr[d2] && i3 == iArr[d2 + 1] && i4 == iArr[d2 + 2] && 3 == iArr[d2 + 3]) {
                return this.l[d2 >> 2];
            }
        }
        return null;
    }

    public final String m(int i2, int[] iArr) {
        if (i2 < 4) {
            return i2 != 1 ? i2 != 2 ? i2 != 3 ? "" : l(iArr[0], iArr[1], iArr[2]) : k(iArr[0], iArr[1]) : j(iArr[0]);
        }
        int i3 = i(i2, iArr);
        int a2 = a(i3);
        int[] iArr2 = this.f;
        int i4 = iArr2[a2 + 3];
        if (i3 == iArr2[a2] && i4 == i2 && e(iArr, i2, iArr2[a2 + 1])) {
            return this.l[a2 >> 2];
        }
        if (i4 == 0) {
            return null;
        }
        int i5 = this.h + ((a2 >> 3) << 2);
        int i6 = iArr2[i5 + 3];
        if (i3 == iArr2[i5] && i6 == i2 && e(iArr, i2, iArr2[i5 + 1])) {
            return this.l[i5 >> 2];
        }
        int i7 = this.i;
        int i8 = this.j;
        int i9 = i7 + ((a2 >> (i8 + 2)) << i8);
        int[] iArr3 = this.f;
        int i10 = (1 << i8) + i9;
        while (i9 < i10) {
            int i11 = iArr3[i9 + 3];
            if (i3 == iArr3[i9] && i2 == i11 && e(iArr, i2, iArr3[i9 + 1])) {
                return this.l[i9 >> 2];
            }
            if (i11 == 0) {
                return null;
            }
            i9 += 4;
        }
        for (int d2 = d(); d2 < this.m; d2 += 4) {
            if (i3 == iArr3[d2] && i2 == iArr3[d2 + 3] && e(iArr, i2, iArr3[d2 + 1])) {
                return this.l[d2 >> 2];
            }
        }
        return null;
    }

    public final void n(boolean z) {
        this.k = 0;
        this.m = d();
        this.n = this.g << 3;
        if (z) {
            Arrays.fill(this.f, 0);
            Arrays.fill(this.l, (Object) null);
        }
    }

    public final String toString() {
        int i2 = this.h;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 3; i5 < i2; i5 += 4) {
            if (this.f[i5] != 0) {
                i4++;
            }
        }
        int i6 = this.i;
        int i7 = 0;
        for (int i8 = this.h + 3; i8 < i6; i8 += 4) {
            if (this.f[i8] != 0) {
                i7++;
            }
        }
        int i9 = this.i + 3;
        int i10 = this.g + i9;
        int i11 = 0;
        while (i9 < i10) {
            if (this.f[i9] != 0) {
                i11++;
            }
            i9 += 4;
        }
        int d2 = (this.m - d()) >> 2;
        int i12 = this.g << 3;
        for (int i13 = 3; i13 < i12; i13 += 4) {
            if (this.f[i13] != 0) {
                i3++;
            }
        }
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", new Object[]{rw0.class.getName(), Integer.valueOf(this.k), Integer.valueOf(this.g), Integer.valueOf(i4), Integer.valueOf(i7), Integer.valueOf(i11), Integer.valueOf(d2), Integer.valueOf(i4 + i7 + i11 + d2), Integer.valueOf(i3)});
    }

    public rw0(rw0 rw0, boolean z, int i2, boolean z2, qw0 qw0) {
        this.a = rw0;
        this.c = i2;
        this.d = z;
        this.e = z2;
        this.b = null;
        this.k = qw0.b;
        int i3 = qw0.a;
        this.g = i3;
        int i4 = i3 << 2;
        this.h = i4;
        this.i = i4 + (i4 >> 1);
        this.j = qw0.c;
        this.f = qw0.d;
        this.l = qw0.e;
        this.m = qw0.f;
        this.n = qw0.g;
        this.o = true;
    }
}
