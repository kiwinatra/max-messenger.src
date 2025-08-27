package defpackage;

import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: tga  reason: default package */
public abstract class tga {
    public static final String a = String.valueOf(IntCompanionObject.MIN_VALUE);
    public static final String b = String.valueOf(Long.MIN_VALUE);
    public static final int[] c = new int[1000];

    static {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                int i4 = 0;
                while (i4 < 10) {
                    c[i] = ((i2 + 48) << 16) | ((i3 + 48) << 8) | (i4 + 48);
                    i4++;
                    i++;
                }
            }
        }
    }

    public static int a(char[] cArr, int i, int i2) {
        int i3 = c[i];
        cArr[i2] = (char) (i3 >> 16);
        int i4 = i2 + 2;
        cArr[i2 + 1] = (char) ((i3 >> 8) & 127);
        int i5 = i2 + 3;
        cArr[i4] = (char) (i3 & 127);
        return i5;
    }

    public static int b(char[] cArr, int i, int i2) {
        int i3 = c[i];
        if (i > 9) {
            if (i > 99) {
                cArr[i2] = (char) (i3 >> 16);
                i2++;
            }
            cArr[i2] = (char) ((i3 >> 8) & 127);
            i2++;
        }
        int i4 = i2 + 1;
        cArr[i2] = (char) (i3 & 127);
        return i4;
    }

    public static int c(char[] cArr, int i, int i2) {
        int i3 = i / 1000;
        int i4 = i - (i3 * 1000);
        int i5 = i3 / 1000;
        int[] iArr = c;
        int i6 = iArr[i5];
        cArr[i2] = (char) (i6 >> 16);
        cArr[i2 + 1] = (char) ((i6 >> 8) & 127);
        cArr[i2 + 2] = (char) (i6 & 127);
        int i7 = iArr[i3 - (i5 * 1000)];
        cArr[i2 + 3] = (char) (i7 >> 16);
        cArr[i2 + 4] = (char) ((i7 >> 8) & 127);
        cArr[i2 + 5] = (char) (i7 & 127);
        int i8 = iArr[i4];
        cArr[i2 + 6] = (char) (i8 >> 16);
        int i9 = i2 + 8;
        cArr[i2 + 7] = (char) ((i8 >> 8) & 127);
        int i10 = i2 + 9;
        cArr[i9] = (char) (i8 & 127);
        return i10;
    }

    public static int d(char[] cArr, int i, int i2) {
        int i3;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                String str = a;
                int length = str.length();
                str.getChars(0, length, cArr, i2);
                return length + i2;
            }
            cArr[i2] = '-';
            i = -i;
            i2++;
        }
        if (i < 1000000) {
            if (i >= 1000) {
                int i4 = i / 1000;
                return a(cArr, i - (i4 * 1000), b(cArr, i4, i2));
            } else if (i >= 10) {
                return b(cArr, i, i2);
            } else {
                cArr[i2] = (char) (i + 48);
                return i2 + 1;
            }
        } else if (i >= 1000000000) {
            int i5 = i - 1000000000;
            if (i5 >= 1000000000) {
                i5 = i - 2000000000;
                i3 = i2 + 1;
                cArr[i2] = '2';
            } else {
                i3 = i2 + 1;
                cArr[i2] = '1';
            }
            return c(cArr, i5, i3);
        } else {
            int i6 = i / 1000;
            int i7 = i6 / 1000;
            return a(cArr, i - (i6 * 1000), a(cArr, i6 - (i7 * 1000), b(cArr, i7, i2)));
        }
    }

    public static int e(long j, char[] cArr, int i) {
        int i2;
        if (j < 0) {
            if (j > -2147483648L) {
                return d(cArr, (int) j, i);
            }
            if (j == Long.MIN_VALUE) {
                String str = b;
                int length = str.length();
                str.getChars(0, length, cArr, i);
                return length + i;
            }
            cArr[i] = '-';
            j = -j;
            i++;
        } else if (j <= 2147483647L) {
            return d(cArr, (int) j, i);
        }
        long j2 = j / 1000000000;
        long j3 = j - (j2 * 1000000000);
        if (j2 < 1000000000) {
            int i3 = (int) j2;
            int[] iArr = c;
            if (i3 >= 1000000) {
                int i4 = i3 / 1000;
                int i5 = i3 - (i4 * 1000);
                int i6 = i4 / 1000;
                int b2 = b(cArr, i6, i);
                int i7 = iArr[i4 - (i6 * 1000)];
                cArr[b2] = (char) (i7 >> 16);
                cArr[b2 + 1] = (char) ((i7 >> 8) & 127);
                cArr[b2 + 2] = (char) (i7 & 127);
                int i8 = iArr[i5];
                cArr[b2 + 3] = (char) (i8 >> 16);
                int i9 = b2 + 5;
                cArr[b2 + 4] = (char) ((i8 >> 8) & 127);
                i2 = b2 + 6;
                cArr[i9] = (char) (i8 & 127);
            } else if (i3 < 1000) {
                i2 = b(cArr, i3, i);
            } else {
                int i10 = i3 / 1000;
                int i11 = i3 - (i10 * 1000);
                int i12 = iArr[i10];
                if (i10 > 9) {
                    if (i10 > 99) {
                        cArr[i] = (char) (i12 >> 16);
                        i++;
                    }
                    cArr[i] = (char) ((i12 >> 8) & 127);
                    i++;
                }
                cArr[i] = (char) (i12 & 127);
                int i13 = iArr[i11];
                cArr[i + 1] = (char) (i13 >> 16);
                int i14 = i + 3;
                cArr[i + 2] = (char) ((i13 >> 8) & 127);
                i2 = i + 4;
                cArr[i14] = (char) (i13 & 127);
            }
        } else {
            long j4 = j2 / 1000000000;
            int b3 = b(cArr, (int) j4, i);
            i2 = c(cArr, (int) (j2 - (1000000000 * j4)), b3);
        }
        return c(cArr, (int) j3, i2);
    }
}
