package net.jpountz.lz4;

import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;

final class LZ4HCJNICompressor extends LZ4Compressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4HCJNICompressor INSTANCE = new LZ4HCJNICompressor();
    private static LZ4Compressor SAFE_INSTANCE;
    private final int compressionLevel;

    public LZ4HCJNICompressor() {
        this(9);
    }

    public int compress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        acd.b(i, bArr, i2);
        acd.b(i3, bArr2, i4);
        int LZ4_compressHC = LZ4JNI.LZ4_compressHC(bArr, (ByteBuffer) null, i, i2, bArr2, (ByteBuffer) null, i3, i4, this.compressionLevel);
        if (LZ4_compressHC > 0) {
            return LZ4_compressHC;
        }
        throw new LZ4Exception();
    }

    public LZ4HCJNICompressor(int i) {
        this.compressionLevel = i;
    }

    public int compress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        int i5;
        ByteBuffer byteBuffer3;
        byte[] bArr;
        int i6;
        ByteBuffer byteBuffer4;
        byte[] bArr2;
        if (!byteBuffer2.isReadOnly()) {
            ow0.b(byteBuffer, i, i2);
            ow0.b(byteBuffer2, i3, i4);
            if ((byteBuffer.hasArray() || byteBuffer.isDirect()) && (byteBuffer2.hasArray() || byteBuffer2.isDirect())) {
                if (byteBuffer.hasArray()) {
                    bArr = byteBuffer.array();
                    byteBuffer3 = null;
                    i5 = byteBuffer.arrayOffset() + i;
                } else {
                    byteBuffer3 = byteBuffer;
                    i5 = i;
                    bArr = null;
                }
                if (byteBuffer2.hasArray()) {
                    bArr2 = byteBuffer2.array();
                    byteBuffer4 = null;
                    i6 = byteBuffer2.arrayOffset() + i3;
                } else {
                    byteBuffer4 = byteBuffer2;
                    i6 = i3;
                    bArr2 = null;
                }
                int LZ4_compressHC = LZ4JNI.LZ4_compressHC(bArr, byteBuffer3, i5, i2, bArr2, byteBuffer4, i6, i4, this.compressionLevel);
                if (LZ4_compressHC > 0) {
                    return LZ4_compressHC;
                }
                throw new LZ4Exception();
            }
            LZ4Compressor lZ4Compressor = SAFE_INSTANCE;
            if (lZ4Compressor == null) {
                lZ4Compressor = LZ4Factory.safeInstance().highCompressor(this.compressionLevel);
                SAFE_INSTANCE = lZ4Compressor;
            }
            return lZ4Compressor.compress(byteBuffer, i, i2, byteBuffer2, i3, i4);
        }
        throw new ReadOnlyBufferException();
    }
}
