package net.jpountz.lz4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.jvm.internal.IntCompanionObject;
import net.jpountz.lz4.LZ4FrameOutputStream;

public class LZ4FrameInputStream extends FilterInputStream {
    static final String BLOCK_HASH_MISMATCH = "Block checksum mismatch";
    static final String DESCRIPTOR_HASH_MISMATCH = "Stream frame descriptor corrupted";
    static final int MAGIC_SKIPPABLE_BASE = 407710288;
    static final String NOT_SUPPORTED = "Stream unsupported";
    static final String PREMATURE_EOS = "Stream ended prematurely";
    private ByteBuffer buffer;
    private final erg checksum;
    private byte[] compressedBuffer;
    private final LZ4SafeDecompressor decompressor;
    private long expectedContentSize;
    private LZ4FrameOutputStream.FrameInfo frameInfo;
    private final byte[] headerArray;
    private final ByteBuffer headerBuffer;
    private int maxBlockSize;
    private byte[] rawBuffer;
    private final ByteBuffer readNumberBuff;
    private final boolean readSingleFrame;
    private long totalContentSize;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LZ4FrameInputStream(java.io.InputStream r3) throws java.io.IOException {
        /*
            r2 = this;
            net.jpountz.lz4.LZ4Factory r0 = net.jpountz.lz4.LZ4Factory.fastestInstance()
            net.jpountz.lz4.LZ4SafeDecompressor r0 = r0.safeDecompressor()
            frg r1 = defpackage.frg.d()
            r1.getClass()
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4FrameInputStream.<init>(java.io.InputStream):void");
    }

    private boolean nextFrameInfo() throws IOException {
        while (true) {
            int i = 0;
            do {
                int read = this.in.read(this.readNumberBuff.array(), i, 4 - i);
                if (read < 0) {
                    return false;
                }
                i += read;
            } while (i < 4);
            int i2 = this.readNumberBuff.getInt(0);
            if (i2 == 407708164) {
                readHeader();
                return true;
            } else if ((i2 >>> 4) == 25481893) {
                skippableFrame();
            } else {
                throw new IOException(NOT_SUPPORTED);
            }
        }
    }

    private void readBlock() throws IOException {
        int readInt = readInt(this.in);
        boolean z = (Integer.MIN_VALUE & readInt) == 0;
        int i = readInt & IntCompanionObject.MAX_VALUE;
        if (i != 0) {
            byte[] bArr = z ? this.compressedBuffer : this.rawBuffer;
            if (i <= this.maxBlockSize) {
                int i2 = 0;
                while (i2 < i) {
                    int read = this.in.read(bArr, i2, i - i2);
                    if (read >= 0) {
                        i2 += read;
                    } else {
                        throw new IOException(PREMATURE_EOS);
                    }
                }
                if (!this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.BLOCK_CHECKSUM)) {
                    if (z) {
                        try {
                            LZ4SafeDecompressor lZ4SafeDecompressor = this.decompressor;
                            byte[] bArr2 = this.rawBuffer;
                            i = lZ4SafeDecompressor.decompress(bArr, 0, i, bArr2, 0, bArr2.length);
                        } catch (LZ4Exception e) {
                            throw new IOException(e);
                        }
                    }
                    if (this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_CHECKSUM)) {
                        this.frameInfo.updateStreamHash(this.rawBuffer, 0, i);
                    }
                    this.totalContentSize += (long) i;
                    this.buffer.limit(i);
                    this.buffer.rewind();
                    return;
                }
                readInt(this.in);
                throw null;
            }
            Locale locale = Locale.ROOT;
            throw new IOException(g63.h("Block size ", i, this.maxBlockSize, " exceeded max: "));
        } else if (this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_CHECKSUM) && readInt(this.in) != this.frameInfo.currentStreamHash()) {
            throw new IOException("Content checksum mismatch");
        } else if (!this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_SIZE) || this.expectedContentSize == this.totalContentSize) {
            this.frameInfo.finish();
        } else {
            throw new IOException("Size check mismatch");
        }
    }

    private void readHeader() throws IOException {
        this.headerBuffer.rewind();
        int read = this.in.read();
        if (read >= 0) {
            int read2 = this.in.read();
            if (read2 >= 0) {
                byte b = (byte) (read & KotlinVersion.MAX_COMPONENT_VALUE);
                LZ4FrameOutputStream.FLG fromByte = LZ4FrameOutputStream.FLG.fromByte(b);
                this.headerBuffer.put(b);
                byte b2 = (byte) (read2 & KotlinVersion.MAX_COMPONENT_VALUE);
                LZ4FrameOutputStream.BD fromByte2 = LZ4FrameOutputStream.BD.fromByte(b2);
                this.headerBuffer.put(b2);
                this.frameInfo = new LZ4FrameOutputStream.FrameInfo(fromByte, fromByte2);
                if (fromByte.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_SIZE)) {
                    long readLong = readLong(this.in);
                    this.expectedContentSize = readLong;
                    this.headerBuffer.putLong(readLong);
                }
                this.totalContentSize = 0;
                this.headerBuffer.position();
                throw null;
            }
            throw new IOException(PREMATURE_EOS);
        }
        throw new IOException(PREMATURE_EOS);
    }

    private int readInt(InputStream inputStream) throws IOException {
        int i = 0;
        do {
            int read = inputStream.read(this.readNumberBuff.array(), i, 4 - i);
            if (read >= 0) {
                i += read;
            } else {
                throw new IOException(PREMATURE_EOS);
            }
        } while (i < 4);
        return this.readNumberBuff.getInt(0);
    }

    private long readLong(InputStream inputStream) throws IOException {
        int i = 0;
        do {
            int read = inputStream.read(this.readNumberBuff.array(), i, 8 - i);
            if (read >= 0) {
                i += read;
            } else {
                throw new IOException(PREMATURE_EOS);
            }
        } while (i < 8);
        return this.readNumberBuff.getLong(0);
    }

    private void skippableFrame() throws IOException {
        int readInt = readInt(this.in);
        byte[] bArr = new byte[1024];
        while (readInt > 0) {
            int read = this.in.read(bArr, 0, Math.min(readInt, 1024));
            if (read >= 0) {
                readInt -= read;
            } else {
                throw new IOException(PREMATURE_EOS);
            }
        }
    }

    public int available() throws IOException {
        return this.buffer.remaining();
    }

    public void close() throws IOException {
        super.close();
    }

    public long getExpectedContentSize() {
        if (this.readSingleFrame) {
            return this.expectedContentSize;
        }
        throw new UnsupportedOperationException("Operation not permitted when multiple frames can be read");
    }

    public boolean isExpectedContentSizeDefined() {
        return this.readSingleFrame && this.expectedContentSize >= 0;
    }

    public synchronized void mark(int i) {
        throw new UnsupportedOperationException("mark not supported");
    }

    public boolean markSupported() {
        return false;
    }

    public int read() throws IOException {
        while (this.buffer.remaining() == 0) {
            if (this.frameInfo.isFinished() && (this.readSingleFrame || !nextFrameInfo())) {
                return -1;
            }
            readBlock();
        }
        return this.buffer.get() & UByte.MAX_VALUE;
    }

    public synchronized void reset() throws IOException {
        throw new UnsupportedOperationException("reset not supported");
    }

    public long skip(long j) throws IOException {
        if (j <= 0) {
            return 0;
        }
        while (this.buffer.remaining() == 0) {
            if (this.frameInfo.isFinished() && (this.readSingleFrame || !nextFrameInfo())) {
                return 0;
            }
            readBlock();
        }
        long min = Math.min(j, (long) this.buffer.remaining());
        ByteBuffer byteBuffer = this.buffer;
        byteBuffer.position(byteBuffer.position() + ((int) min));
        return min;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LZ4FrameInputStream(java.io.InputStream r3, boolean r4) throws java.io.IOException {
        /*
            r2 = this;
            net.jpountz.lz4.LZ4Factory r0 = net.jpountz.lz4.LZ4Factory.fastestInstance()
            net.jpountz.lz4.LZ4SafeDecompressor r0 = r0.safeDecompressor()
            frg r1 = defpackage.frg.d()
            r1.getClass()
            r1 = 0
            r2.<init>(r3, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4FrameInputStream.<init>(java.io.InputStream, boolean):void");
    }

    public LZ4FrameInputStream(InputStream inputStream, LZ4SafeDecompressor lZ4SafeDecompressor, erg erg) throws IOException {
        this(inputStream, lZ4SafeDecompressor, erg, false);
    }

    public LZ4FrameInputStream(InputStream inputStream, LZ4SafeDecompressor lZ4SafeDecompressor, erg erg, boolean z) throws IOException {
        super(inputStream);
        byte[] bArr = new byte[15];
        this.headerArray = bArr;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.headerBuffer = wrap.order(byteOrder);
        this.buffer = null;
        this.rawBuffer = null;
        this.maxBlockSize = -1;
        this.expectedContentSize = -1;
        this.totalContentSize = 0;
        this.frameInfo = null;
        this.readNumberBuff = ByteBuffer.allocate(8).order(byteOrder);
        this.decompressor = lZ4SafeDecompressor;
        this.readSingleFrame = z;
        nextFrameInfo();
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        while (this.buffer.remaining() == 0) {
            if (this.frameInfo.isFinished() && (this.readSingleFrame || !nextFrameInfo())) {
                return -1;
            }
            readBlock();
        }
        int min = Math.min(i2, this.buffer.remaining());
        this.buffer.get(bArr, i, min);
        return min;
    }
}
