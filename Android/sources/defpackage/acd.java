package defpackage;

import java.nio.ByteOrder;
import kotlin.UByte;

/* renamed from: acd  reason: default package */
public enum acd {
    ;

    public static void a(int i, byte[] bArr) {
        if (i < 0 || i >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
    }

    public static void b(int i, byte[] bArr, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("lengths must be >= 0");
        } else if (i2 > 0) {
            a(i, bArr);
            a((i + i2) - 1, bArr);
        }
    }

    public static int c(int i, byte[] bArr) {
        if (w0g.a != ByteOrder.BIG_ENDIAN) {
            return d(i, bArr);
        }
        return (bArr[i + 3] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
    }

    public static int d(int i, byte[] bArr) {
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }
}
