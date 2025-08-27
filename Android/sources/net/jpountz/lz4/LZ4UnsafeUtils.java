package net.jpountz.lz4;

import java.nio.ByteOrder;
import kotlin.KotlinVersion;
import kotlin.UShort;

enum LZ4UnsafeUtils {
    ;

    public static int commonBytes(byte[] bArr, int i, int i2, int i3) {
        int i4;
        int i5 = 0;
        while (i2 <= i3 - 8) {
            if (gwf.d(i2, bArr) == gwf.d(i, bArr)) {
                i5 += 8;
                i += 8;
                i2 += 8;
            } else {
                if (w0g.a == ByteOrder.BIG_ENDIAN) {
                    i4 = Long.numberOfLeadingZeros(gwf.d(i, bArr) ^ gwf.d(i2, bArr));
                } else {
                    i4 = Long.numberOfTrailingZeros(gwf.d(i, bArr) ^ gwf.d(i2, bArr));
                }
                return i5 + (i4 >>> 3);
            }
        }
        while (i2 < i3) {
            int i6 = i + 1;
            int i7 = i2 + 1;
            if (gwf.a(i, bArr) != gwf.a(i2, bArr)) {
                break;
            }
            i5++;
            i = i6;
            i2 = i7;
        }
        return i5;
    }

    public static int commonBytesBackward(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = 0;
        while (i > i3 && i2 > i4) {
            i--;
            i2--;
            if (gwf.a(i, bArr) != gwf.a(i2, bArr)) {
                break;
            }
            i5++;
        }
        return i5;
    }

    public static int encodeSequence(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        int i7;
        int i8;
        int i9 = i2 - i;
        int i10 = i5 + 1;
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

    public static int lastLiterals(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        return LZ4SafeUtils.lastLiterals(bArr, i, i2, bArr2, i3, i4);
    }

    public static boolean readIntEquals(byte[] bArr, int i, int i2) {
        return gwf.b(i, bArr) == gwf.b(i2, bArr);
    }

    public static int readShortLittleEndian(byte[] bArr, int i) {
        short f = gwf.f(i, bArr);
        if (w0g.a == ByteOrder.BIG_ENDIAN) {
            f = Short.reverseBytes(f);
        }
        return f & UShort.MAX_VALUE;
    }

    public static void safeArraycopy(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i3 & -8;
        wildArraycopy(bArr, i, bArr2, i2, i4);
        int i5 = i3 & 7;
        for (int i6 = 0; i6 < i5; i6++) {
            gwf.g(bArr2, i2 + i4 + i6, gwf.a(i + i4 + i6, bArr));
        }
    }

    public static void safeIncrementalCopy(byte[] bArr, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i2 + i4;
            int i6 = i + i4;
            bArr[i5] = bArr[i6];
            gwf.g(bArr, i5, gwf.a(i6, bArr));
        }
    }

    public static void wildArraycopy(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4 += 8) {
            gwf.j(i2 + i4, bArr2, gwf.d(i + i4, bArr));
        }
    }

    public static void wildIncrementalCopy(byte[] bArr, int i, int i2, int i3) {
        int i4 = i2 - i;
        if (i4 < 4) {
            int i5 = 0;
            for (int i6 = 0; i6 < 4; i6++) {
                gwf.g(bArr, i2 + i6, gwf.a(i + i6, bArr));
            }
            int i7 = i2 + 4;
            int i8 = i + 4;
            int i9 = i7 - i8;
            if (i9 == 1) {
                i8 = i + 1;
            } else if (i9 == 2) {
                i8 = i + 2;
            } else if (i9 == 3) {
                i8 = i + 1;
                i5 = -1;
            } else if (i9 == 5) {
                i5 = 1;
            } else if (i9 == 6) {
                i5 = 2;
            } else if (i9 == 7) {
                i5 = 3;
            }
            gwf.h(i7, bArr, gwf.b(i8, bArr));
            i2 += 8;
            i = i8 - i5;
        } else if (i4 < 8) {
            gwf.j(i2, bArr, gwf.d(i, bArr));
            i2 += i4;
        }
        while (i2 < i3) {
            gwf.j(i2, bArr, gwf.d(i, bArr));
            i2 += 8;
            i += 8;
        }
    }

    public static int writeLen(int i, byte[] bArr, int i2) {
        while (i >= 255) {
            gwf.g(bArr, i2, (byte) KotlinVersion.MAX_COMPONENT_VALUE);
            i -= 255;
            i2++;
        }
        int i3 = i2 + 1;
        gwf.g(bArr, i2, (byte) i);
        return i3;
    }

    public static void writeShortLittleEndian(byte[] bArr, int i, int i2) {
        short s = (short) i2;
        if (w0g.a == ByteOrder.BIG_ENDIAN) {
            s = Short.reverseBytes(s);
        }
        gwf.k(bArr, i, s);
    }
}
