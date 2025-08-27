package net.jpountz.lz4;

import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;

final class LZ4JNISafeDecompressor extends LZ4SafeDecompressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4JNISafeDecompressor INSTANCE = new LZ4JNISafeDecompressor();
    private static LZ4SafeDecompressor SAFE_INSTANCE;

    public final int decompress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        acd.b(i, bArr, i2);
        acd.b(i3, bArr2, i4);
        int LZ4_decompress_safe = LZ4JNI.LZ4_decompress_safe(bArr, (ByteBuffer) null, i, i2, bArr2, (ByteBuffer) null, i3, i4);
        if (LZ4_decompress_safe >= 0) {
            return LZ4_decompress_safe;
        }
        throw new LZ4Exception("Error decoding offset " + (i - LZ4_decompress_safe) + " of input buffer");
    }

    public int decompress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        ByteBuffer byteBuffer3;
        byte[] bArr;
        int i5;
        ByteBuffer byteBuffer4;
        byte[] bArr2;
        if (!byteBuffer2.isReadOnly()) {
            ow0.b(byteBuffer, i, i2);
            ow0.b(byteBuffer2, i3, i4);
            if ((byteBuffer.hasArray() || byteBuffer.isDirect()) && (byteBuffer2.hasArray() || byteBuffer2.isDirect())) {
                if (byteBuffer.hasArray()) {
                    byte[] array = byteBuffer.array();
                    i += byteBuffer.arrayOffset();
                    bArr = array;
                    byteBuffer3 = null;
                } else {
                    byteBuffer3 = byteBuffer;
                    bArr = null;
                }
                if (byteBuffer2.hasArray()) {
                    bArr2 = byteBuffer2.array();
                    i5 = i3 + byteBuffer2.arrayOffset();
                    byteBuffer4 = null;
                } else {
                    byteBuffer4 = byteBuffer2;
                    i5 = i3;
                    bArr2 = null;
                }
                int LZ4_decompress_safe = LZ4JNI.LZ4_decompress_safe(bArr, byteBuffer3, i, i2, bArr2, byteBuffer4, i5, i4);
                if (LZ4_decompress_safe >= 0) {
                    return LZ4_decompress_safe;
                }
                throw new LZ4Exception("Error decoding offset " + (i - LZ4_decompress_safe) + " of input buffer");
            }
            LZ4SafeDecompressor lZ4SafeDecompressor = SAFE_INSTANCE;
            if (lZ4SafeDecompressor == null) {
                lZ4SafeDecompressor = LZ4Factory.safeInstance().safeDecompressor();
                SAFE_INSTANCE = lZ4SafeDecompressor;
            }
            return lZ4SafeDecompressor.decompress(byteBuffer, i, i2, byteBuffer2, i3, i4);
        }
        throw new ReadOnlyBufferException();
    }
}
