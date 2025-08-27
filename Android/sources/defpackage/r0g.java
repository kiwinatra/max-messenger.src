package defpackage;

import java.nio.charset.CharacterCodingException;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.uuid.Uuid;

/* renamed from: r0g  reason: default package */
public final class r0g {
    public final CodingErrorAction a = CodingErrorAction.REPLACE;
    public final byte b = 63;
    public char c = 0;

    public final long a(char[] cArr, int i, int i2, byte[] bArr, int i3) {
        int i4;
        char c2;
        int i5;
        int i6;
        char c3 = this.c;
        int i7 = i2 + i;
        int i8 = i3 - 4;
        int i9 = 0;
        while (i < i7 && i9 <= i8) {
            int i10 = i + 1;
            char c4 = cArr[i];
            if (c4 < 55296 || c4 > 56319) {
                if (c4 < 56320 || c4 > 57343) {
                    if (c3 != 0) {
                        i9 = b(i9, bArr);
                        c3 = 0;
                    }
                    i4 = i9;
                    c2 = c3;
                    i5 = c4;
                } else if (c3 == 0) {
                    i9 = b(i9, bArr);
                } else {
                    i5 = (((c3 & 1023) << 10) | (c4 & 1023)) + CharCompanionObject.MIN_VALUE;
                    i4 = i9;
                    c2 = 0;
                }
                if (i5 <= 127) {
                    bArr[i4] = (byte) c4;
                    i6 = i4 + 1;
                } else if (i5 <= 2047) {
                    int i11 = i4 + 1;
                    bArr[i4] = (byte) ((i5 >> 6) | 192);
                    i6 = i4 + 2;
                    bArr[i11] = (byte) ((i5 & 63) | Uuid.SIZE_BITS);
                } else if (i5 <= 65535) {
                    bArr[i4] = (byte) ((i5 >> 12) | 224);
                    int i12 = i4 + 2;
                    bArr[i4 + 1] = (byte) (((i5 >> 6) & 63) | Uuid.SIZE_BITS);
                    i6 = i4 + 3;
                    bArr[i12] = (byte) ((i5 & 63) | Uuid.SIZE_BITS);
                } else {
                    bArr[i4] = (byte) ((i5 >> 18) | 240);
                    bArr[i4 + 1] = (byte) (((i5 >> 12) & 63) | Uuid.SIZE_BITS);
                    int i13 = i4 + 3;
                    bArr[i4 + 2] = (byte) (((i5 >> 6) & 63) | Uuid.SIZE_BITS);
                    i6 = i4 + 4;
                    bArr[i13] = (byte) ((i5 & 63) | Uuid.SIZE_BITS);
                }
                c3 = c2;
                i = i10;
                i9 = i6;
            } else {
                if (c3 != 0) {
                    i9 = b(i9, bArr);
                }
                c3 = c4;
            }
            i = i10;
        }
        this.c = c3;
        return (((long) i) << 32) | ((long) i9);
    }

    public final int b(int i, byte[] bArr) {
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CodingErrorAction codingErrorAction2 = this.a;
        if (codingErrorAction2 == codingErrorAction) {
            bArr[i] = this.b;
            return i + 1;
        } else if (codingErrorAction2 != CodingErrorAction.REPORT) {
            return i;
        } else {
            throw new CharacterCodingException();
        }
    }
}
