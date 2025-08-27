package org.apache.commons.codec.binary;

import kotlin.jvm.internal.ByteCompanionObject;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.json.HTTP;

@Deprecated
public class Base64 implements BinaryEncoder, BinaryDecoder {
    static final int BASELENGTH = 255;
    static final byte[] CHUNK_SEPARATOR = HTTP.CRLF.getBytes();
    static final int CHUNK_SIZE = 76;
    static final int EIGHTBIT = 8;
    static final int FOURBYTE = 4;
    static final int LOOKUPLENGTH = 64;
    static final byte PAD = 61;
    static final int SIGN = -128;
    static final int SIXTEENBIT = 16;
    static final int TWENTYFOURBITGROUP = 24;
    private static byte[] base64Alphabet = new byte[255];
    private static byte[] lookUpBase64Alphabet = new byte[64];

    static {
        int i = 0;
        for (int i2 = 0; i2 < 255; i2++) {
            base64Alphabet[i2] = -1;
        }
        for (int i3 = 90; i3 >= 65; i3--) {
            base64Alphabet[i3] = (byte) (i3 - 65);
        }
        for (int i4 = 122; i4 >= 97; i4--) {
            base64Alphabet[i4] = (byte) (i4 - 71);
        }
        for (int i5 = 57; i5 >= 48; i5--) {
            base64Alphabet[i5] = (byte) (i5 + 4);
        }
        byte[] bArr = base64Alphabet;
        bArr[43] = 62;
        bArr[47] = 63;
        for (int i6 = 0; i6 <= 25; i6++) {
            lookUpBase64Alphabet[i6] = (byte) (i6 + 65);
        }
        int i7 = 26;
        int i8 = 0;
        while (i7 <= 51) {
            lookUpBase64Alphabet[i7] = (byte) (i8 + 97);
            i7++;
            i8++;
        }
        int i9 = 52;
        while (i9 <= 61) {
            lookUpBase64Alphabet[i9] = (byte) (i + 48);
            i9++;
            i++;
        }
        byte[] bArr2 = lookUpBase64Alphabet;
        bArr2[62] = 43;
        bArr2[63] = 47;
    }

    public static byte[] decodeBase64(byte[] bArr) {
        byte[] discardNonBase64 = discardNonBase64(bArr);
        if (discardNonBase64.length == 0) {
            return new byte[0];
        }
        int length = discardNonBase64.length / 4;
        int length2 = discardNonBase64.length;
        while (discardNonBase64[length2 - 1] == 61) {
            length2--;
            if (length2 == 0) {
                return new byte[0];
            }
        }
        byte[] bArr2 = new byte[(length2 - length)];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 4;
            byte b = discardNonBase64[i3 + 2];
            byte b2 = discardNonBase64[i3 + 3];
            byte[] bArr3 = base64Alphabet;
            byte b3 = bArr3[discardNonBase64[i3]];
            byte b4 = bArr3[discardNonBase64[i3 + 1]];
            if (b != 61 && b2 != 61) {
                byte b5 = bArr3[b];
                byte b6 = bArr3[b2];
                bArr2[i] = (byte) ((b3 << 2) | (b4 >> 4));
                bArr2[i + 1] = (byte) (((b4 & 15) << 4) | ((b5 >> 2) & 15));
                bArr2[i + 2] = (byte) ((b5 << 6) | b6);
            } else if (b == 61) {
                bArr2[i] = (byte) ((b4 >> 4) | (b3 << 2));
            } else if (b2 == 61) {
                byte b7 = bArr3[b];
                bArr2[i] = (byte) ((b3 << 2) | (b4 >> 4));
                bArr2[i + 1] = (byte) (((b4 & 15) << 4) | ((b7 >> 2) & 15));
            }
            i += 3;
        }
        return bArr2;
    }

    public static byte[] discardNonBase64(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (isBase64(bArr[i2])) {
                bArr2[i] = bArr[i2];
                i++;
            }
        }
        byte[] bArr3 = new byte[i];
        System.arraycopy(bArr2, 0, bArr3, 0, i);
        return bArr3;
    }

    public static byte[] discardWhitespace(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i = 0;
        for (byte b : bArr) {
            if (!(b == 9 || b == 10 || b == 13 || b == 32)) {
                bArr2[i] = b;
                i++;
            }
        }
        byte[] bArr3 = new byte[i];
        System.arraycopy(bArr2, 0, bArr3, 0, i);
        return bArr3;
    }

    public static byte[] encodeBase64(byte[] bArr) {
        return encodeBase64(bArr, false);
    }

    public static byte[] encodeBase64Chunked(byte[] bArr) {
        return encodeBase64(bArr, true);
    }

    public static boolean isArrayByteBase64(byte[] bArr) {
        if (r0 == 0) {
            return true;
        }
        for (byte isBase64 : discardWhitespace(bArr)) {
            if (!isBase64(isBase64)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isBase64(byte b) {
        return b == 61 || base64Alphabet[b] != -1;
    }

    public Object decode(Object obj) throws DecoderException {
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        throw new DecoderException("Parameter supplied to Base64 decode is not a byte[]");
    }

    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        throw new EncoderException("Parameter supplied to Base64 encode is not a byte[]");
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z) {
        int i;
        byte[] bArr2 = bArr;
        int length = bArr2.length * 8;
        int i2 = length % 24;
        int i3 = length / 24;
        int i4 = i2 != 0 ? (i3 + 1) * 4 : i3 * 4;
        if (z) {
            byte[] bArr3 = CHUNK_SEPARATOR;
            if (bArr3.length == 0) {
                i = 0;
            } else {
                i = (int) Math.ceil((double) (((float) i4) / 76.0f));
            }
            i4 += bArr3.length * i;
        } else {
            i = 0;
        }
        byte[] bArr4 = new byte[i4];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 76;
        while (i5 < i3) {
            int i9 = i5 * 3;
            byte b = bArr2[i9];
            byte b2 = bArr2[i9 + 1];
            byte b3 = bArr2[i9 + 2];
            byte b4 = (byte) (b2 & 15);
            byte b5 = (byte) (b & 3);
            byte b6 = b & ByteCompanionObject.MIN_VALUE;
            int i10 = b >> 2;
            if (b6 != 0) {
                i10 ^= 192;
            }
            byte b7 = (byte) i10;
            byte b8 = b2 & ByteCompanionObject.MIN_VALUE;
            int i11 = b2 >> 4;
            if (b8 != 0) {
                i11 ^= 240;
            }
            byte b9 = (byte) i11;
            int i12 = b3 >> 6;
            if ((b3 & ByteCompanionObject.MIN_VALUE) != 0) {
                i12 ^= 252;
            }
            byte b10 = (byte) i12;
            byte[] bArr5 = lookUpBase64Alphabet;
            bArr4[i6] = bArr5[b7];
            bArr4[i6 + 1] = bArr5[(b5 << 4) | b9];
            bArr4[i6 + 2] = bArr5[(b4 << 2) | b10];
            bArr4[i6 + 3] = bArr5[b3 & 63];
            i6 += 4;
            if (z && i6 == i8) {
                byte[] bArr6 = CHUNK_SEPARATOR;
                System.arraycopy(bArr6, 0, bArr4, i6, bArr6.length);
                int i13 = i7 + 1;
                i8 = (bArr6.length * i13) + ((i7 + 2) * 76);
                i6 += bArr6.length;
                i7 = i13;
            }
            i5++;
        }
        int i14 = i5 * 3;
        if (i2 == 8) {
            byte b11 = bArr2[i14];
            byte b12 = (byte) (b11 & 3);
            byte b13 = b11 & ByteCompanionObject.MIN_VALUE;
            int i15 = b11 >> 2;
            if (b13 != 0) {
                i15 ^= 192;
            }
            byte b14 = (byte) i15;
            byte[] bArr7 = lookUpBase64Alphabet;
            bArr4[i6] = bArr7[b14];
            bArr4[i6 + 1] = bArr7[b12 << 4];
            bArr4[i6 + 2] = 61;
            bArr4[i6 + 3] = 61;
        } else if (i2 == 16) {
            byte b15 = bArr2[i14];
            byte b16 = bArr2[i14 + 1];
            byte b17 = (byte) (b16 & 15);
            byte b18 = (byte) (b15 & 3);
            byte b19 = b15 & ByteCompanionObject.MIN_VALUE;
            int i16 = b15 >> 2;
            if (b19 != 0) {
                i16 ^= 192;
            }
            byte b20 = (byte) i16;
            byte b21 = b16 & ByteCompanionObject.MIN_VALUE;
            int i17 = b16 >> 4;
            if (b21 != 0) {
                i17 ^= 240;
            }
            byte b22 = (byte) i17;
            byte[] bArr8 = lookUpBase64Alphabet;
            bArr4[i6] = bArr8[b20];
            bArr4[i6 + 1] = bArr8[b22 | (b18 << 4)];
            bArr4[i6 + 2] = bArr8[b17 << 2];
            bArr4[i6 + 3] = 61;
        }
        if (z && i7 < i) {
            byte[] bArr9 = CHUNK_SEPARATOR;
            System.arraycopy(bArr9, 0, bArr4, i4 - bArr9.length, bArr9.length);
        }
        return bArr4;
    }

    public byte[] decode(byte[] bArr) {
        return decodeBase64(bArr);
    }

    public byte[] encode(byte[] bArr) {
        return encodeBase64(bArr, false);
    }
}
