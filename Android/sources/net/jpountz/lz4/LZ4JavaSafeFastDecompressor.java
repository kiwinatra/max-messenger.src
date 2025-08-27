package net.jpountz.lz4;

import java.nio.ByteBuffer;
import kotlin.KotlinVersion;
import kotlin.UByte;

final class LZ4JavaSafeFastDecompressor extends LZ4FastDecompressor {
    public static final LZ4FastDecompressor INSTANCE = new LZ4JavaSafeFastDecompressor();

    public int decompress(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        byte b;
        int i5;
        byte b2;
        acd.a(i, bArr);
        acd.b(i2, bArr2, i3);
        if (i3 != 0) {
            int i6 = i3 + i2;
            int i7 = i;
            int i8 = i2;
            while (true) {
                byte b3 = bArr[i7];
                int i9 = i7 + 1;
                int i10 = (b3 & UByte.MAX_VALUE) >>> 4;
                if (i10 == 15) {
                    while (true) {
                        i5 = i9 + 1;
                        b2 = bArr[i9];
                        if (b2 != -1) {
                            break;
                        }
                        i10 += KotlinVersion.MAX_COMPONENT_VALUE;
                        i9 = i5;
                    }
                    i10 += b2 & UByte.MAX_VALUE;
                    i9 = i5;
                }
                int i11 = i8 + i10;
                int i12 = i6 - 8;
                if (i11 <= i12) {
                    LZ4SafeUtils.wildArraycopy(bArr, i9, bArr2, i8, i10);
                    int i13 = i9 + i10;
                    i7 = i13 + 2;
                    int i14 = i11 - ((bArr[i13] & UByte.MAX_VALUE) | ((bArr[i13 + 1] & UByte.MAX_VALUE) << 8));
                    if (i14 >= i2) {
                        int i15 = b3 & 15;
                        if (i15 == 15) {
                            while (true) {
                                i4 = i7 + 1;
                                b = bArr[i7];
                                if (b != -1) {
                                    break;
                                }
                                i15 += KotlinVersion.MAX_COMPONENT_VALUE;
                                i7 = i4;
                            }
                            i15 += b & UByte.MAX_VALUE;
                            i7 = i4;
                        }
                        int i16 = i15 + 4;
                        int i17 = i11 + i16;
                        if (i17 <= i12) {
                            LZ4SafeUtils.wildIncrementalCopy(bArr2, i14, i11, i17);
                        } else if (i17 <= i6) {
                            LZ4SafeUtils.safeIncrementalCopy(bArr2, i14, i11, i16);
                        } else {
                            throw new LZ4Exception(wj6.h(i7, "Malformed input at "));
                        }
                        i8 = i17;
                    } else {
                        throw new LZ4Exception(wj6.h(i7, "Malformed input at "));
                    }
                } else if (i11 == i6) {
                    LZ4SafeUtils.safeArraycopy(bArr, i9, bArr2, i8, i10);
                    return (i9 + i10) - i;
                } else {
                    throw new LZ4Exception(wj6.h(i9, "Malformed input at "));
                }
            }
        } else if (bArr[i] == 0) {
            return 1;
        } else {
            throw new LZ4Exception(wj6.h(i, "Malformed input at "));
        }
    }

    public int decompress(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3) {
        int i4;
        byte b;
        int i5;
        byte b2;
        if (!byteBuffer.hasArray() || !byteBuffer2.hasArray()) {
            ByteBuffer c = ow0.c(byteBuffer);
            ByteBuffer c2 = ow0.c(byteBuffer2);
            ow0.a(i, c);
            ow0.b(c2, i2, i3);
            if (i3 != 0) {
                int i6 = i3 + i2;
                int i7 = i;
                int i8 = i2;
                while (true) {
                    byte b3 = c.get(i7);
                    int i9 = i7 + 1;
                    int i10 = (b3 & UByte.MAX_VALUE) >>> 4;
                    if (i10 == 15) {
                        while (true) {
                            i5 = i9 + 1;
                            b2 = c.get(i9);
                            if (b2 != -1) {
                                break;
                            }
                            i10 += KotlinVersion.MAX_COMPONENT_VALUE;
                            i9 = i5;
                        }
                        i10 += b2 & UByte.MAX_VALUE;
                        i9 = i5;
                    }
                    int i11 = i8 + i10;
                    int i12 = i6 - 8;
                    if (i11 <= i12) {
                        LZ4ByteBufferUtils.wildArraycopy(c, i9, c2, i8, i10);
                        int i13 = i9 + i10;
                        int d = ow0.d(i13, c);
                        i7 = i13 + 2;
                        int i14 = i11 - d;
                        if (i14 >= i2) {
                            int i15 = b3 & 15;
                            if (i15 == 15) {
                                while (true) {
                                    i4 = i7 + 1;
                                    b = c.get(i7);
                                    if (b != -1) {
                                        break;
                                    }
                                    i15 += KotlinVersion.MAX_COMPONENT_VALUE;
                                    i7 = i4;
                                }
                                i15 += b & UByte.MAX_VALUE;
                                i7 = i4;
                            }
                            int i16 = i15 + 4;
                            int i17 = i11 + i16;
                            if (i17 <= i12) {
                                LZ4ByteBufferUtils.wildIncrementalCopy(c2, i14, i11, i17);
                            } else if (i17 <= i6) {
                                LZ4ByteBufferUtils.safeIncrementalCopy(c2, i14, i11, i16);
                            } else {
                                throw new LZ4Exception(wj6.h(i7, "Malformed input at "));
                            }
                            i8 = i17;
                        } else {
                            throw new LZ4Exception(wj6.h(i7, "Malformed input at "));
                        }
                    } else if (i11 == i6) {
                        LZ4ByteBufferUtils.safeArraycopy(c, i9, c2, i8, i10);
                        return (i9 + i10) - i;
                    } else {
                        throw new LZ4Exception(wj6.h(i9, "Malformed input at "));
                    }
                }
            } else if (c.get(i) == 0) {
                return 1;
            } else {
                throw new LZ4Exception(wj6.h(i, "Malformed input at "));
            }
        } else {
            return decompress(byteBuffer.array(), byteBuffer.arrayOffset() + i, byteBuffer2.array(), byteBuffer2.arrayOffset() + i2, i3);
        }
    }
}
