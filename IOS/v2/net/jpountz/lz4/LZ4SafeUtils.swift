package net.jpountz.lz4;

import kotlin.KotlinVersion;

enum LZ4SafeUtils {
    ;

    public static class Match {
        int len;
        int ref;
        int start;

        public int end() {
            return this.start + this.len;
        }

        public void fix(int i) {
            this.start += i;
            this.ref += i;
            this.len -= i;
        }
    }

    public static int commonBytes(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        while (i2 < i3) {
            int i5 = i + 1;
            int i6 = i2 + 1;
            if (bArr[i] != bArr[i2]) {
                break;
            }
            i4++;
            i = i5;
            i2 = i6;
        }
        return i4;
    }

    public static int commonBytesBackward(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = 0;
        while (i > i3 && i2 > i4) {
            i--;
            i2--;
            if (bArr[i] != bArr[i2]) {
                break;
            }
            i5++;
        }
        return i5;
    }

    public static void copy8Bytes(byte[] bArr, int i, byte[] bArr2, int i2) {
        for (int i3 = 0; i3 < 8; i3++) {
            bArr2[i2 + i3] = bArr[i + i3];
        }
    }

    public static void copyTo(Match match, Match match2) {
        match2.len = match.len;
        match2.start = match.start;
        match2.ref = match.ref;
    }

    public static int encodeSequence(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        int i7;
        int i8;
        int i9 = i2 - i;
        int i10 = i5 + 1;
        if (i10 + i9 + 8 + (i9 >>> 8) <= i6) {
            if (i9 >= 15) {
                i10 = writeLen(i9 - 15, bArr2, i10);
                i7 = -16;
            } else {
                i7 = i9 << 4;
            }
            wildArraycopy(bArr, i, bArr2, i10, i9);
            int i11 = i10 + i9;
            int i12 = i2 - i3;
            bArr2[i11] = (byte) i12;
            int i13 = i11 + 2;
            bArr2[i11 + 1] = (byte) (i12 >>> 8);
            int i14 = i4 - 4;
            if (i11 + 8 + (i14 >>> 8) <= i6) {
                if (i14 >= 15) {
                    i8 = i7 | 15;
                    i13 = writeLen(i4 - 19, bArr2, i13);
                } else {
                    i8 = i14 | i7;
                }
                bArr2[i5] = (byte) i8;
                return i13;
            }
            throw new LZ4Exception("maxDestLen is too small");
        }
        throw new LZ4Exception("maxDestLen is too small");
    }

    public static int hash(byte[] bArr, int i) {
        return LZ4Utils.hash(acd.c(i, bArr));
    }

    public static int hash64k(byte[] bArr, int i) {
        return LZ4Utils.hash64k(acd.c(i, bArr));
    }

    public static int lastLiterals(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5;
        if (((i2 + 240) / KotlinVersion.MAX_COMPONENT_VALUE) + i3 + i2 + 1 <= i4) {
            if (i2 >= 15) {
                bArr2[i3] = -16;
                i5 = writeLen(i2 - 15, bArr2, i3 + 1);
            } else {
                bArr2[i3] = (byte) (i2 << 4);
                i5 = i3 + 1;
            }
            System.arraycopy(bArr, i, bArr2, i5, i2);
            return i5 + i2;
        }
        throw new LZ4Exception();
    }

    public static boolean readIntEquals(byte[] bArr, int i, int i2) {
        return bArr[i] == bArr[i2] && bArr[i + 1] == bArr[i2 + 1] && bArr[i + 2] == bArr[i2 + 2] && bArr[i + 3] == bArr[i2 + 3];
    }

    public static void safeArraycopy(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        System.arraycopy(bArr, i, bArr2, i2, i3);
    }

    public static void safeIncrementalCopy(byte[] bArr, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i2 + i4] = bArr[i + i4];
        }
    }

    public static void wildArraycopy(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = 0;
        while (i4 < i3) {
            try {
                copy8Bytes(bArr, i + i4, bArr2, i2 + i4);
                i4 += 8;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new LZ4Exception(wj6.h(i, "Malformed input at offset "));
            }
        }
    }

    public static void wildIncrementalCopy(byte[] bArr, int i, int i2, int i3) {
        do {
            copy8Bytes(bArr, i, bArr, i2);
            i += 8;
            i2 += 8;
        } while (i2 < i3);
    }

    public static int writeLen(int i, byte[] bArr, int i2) {
        while (i >= 255) {
            bArr[i2] = -1;
            i -= 255;
            i2++;
        }
        int i3 = i2 + 1;
        bArr[i2] = (byte) i;
        return i3;
    }
}
