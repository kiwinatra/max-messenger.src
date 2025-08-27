package net.jpountz.lz4;

import java.nio.ByteBuffer;
import kotlin.UByte;

public class LZ4DecompressorWithLength {
    private final LZ4FastDecompressor decompressor;

    public LZ4DecompressorWithLength(LZ4FastDecompressor lZ4FastDecompressor) {
        this.decompressor = lZ4FastDecompressor;
    }

    public static int getDecompressedLength(byte[] bArr) {
        return getDecompressedLength(bArr, 0);
    }

    public int decompress(byte[] bArr, byte[] bArr2) {
        return decompress(bArr, 0, bArr2, 0);
    }

    public static int getDecompressedLength(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    public int decompress(byte[] bArr, int i, byte[] bArr2, int i2) {
        return this.decompressor.decompress(bArr, i + 4, bArr2, i2, getDecompressedLength(bArr, i)) + 4;
    }

    public static int getDecompressedLength(ByteBuffer byteBuffer) {
        return getDecompressedLength(byteBuffer, byteBuffer.position());
    }

    public static int getDecompressedLength(ByteBuffer byteBuffer, int i) {
        return (byteBuffer.get(i + 3) << 24) | (byteBuffer.get(i) & UByte.MAX_VALUE) | ((byteBuffer.get(i + 1) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(i + 2) & UByte.MAX_VALUE) << 16);
    }

    public byte[] decompress(byte[] bArr) {
        return decompress(bArr, 0);
    }

    public byte[] decompress(byte[] bArr, int i) {
        return this.decompressor.decompress(bArr, i + 4, getDecompressedLength(bArr, i));
    }

    public void decompress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int decompressedLength = getDecompressedLength(byteBuffer, byteBuffer.position());
        byteBuffer.position(byteBuffer.position() + 4 + this.decompressor.decompress(byteBuffer, byteBuffer.position() + 4, byteBuffer2, byteBuffer2.position(), decompressedLength));
        byteBuffer2.position(byteBuffer2.position() + decompressedLength);
    }

    public int decompress(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2) {
        return this.decompressor.decompress(byteBuffer, i + 4, byteBuffer2, i2, getDecompressedLength(byteBuffer, i)) + 4;
    }
}
