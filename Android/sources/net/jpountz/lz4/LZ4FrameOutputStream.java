package net.jpountz.lz4;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Locale;

public class LZ4FrameOutputStream extends FilterOutputStream {
    static final String CLOSED_STREAM = "The stream is already closed";
    static final FLG.Bits[] DEFAULT_FEATURES = {FLG.Bits.BLOCK_INDEPENDENCE};
    static final int INTEGER_BYTES = 4;
    static final int LONG_BYTES = 8;
    static final int LZ4_FRAME_INCOMPRESSIBLE_MASK = Integer.MIN_VALUE;
    static final int LZ4_MAX_HEADER_LENGTH = 15;
    static final int MAGIC = 407708164;
    private final ByteBuffer buffer;
    private final erg checksum;
    private final byte[] compressedBuffer;
    private final LZ4Compressor compressor;
    private FrameInfo frameInfo;
    private final ByteBuffer intLEBuffer;
    private final long knownSize;
    private final int maxBlockSize;

    public static class BD {
        private static final int RESERVED_MASK = 143;
        private final BLOCKSIZE blockSizeValue;

        public static BD fromByte(byte b) {
            int i = (b >>> 4) & 7;
            if ((b & 143) <= 0) {
                return new BD(BLOCKSIZE.valueOf(i));
            }
            throw new RuntimeException("Reserved fields must be 0");
        }

        public int getBlockMaximumSize() {
            return 1 << ((this.blockSizeValue.getIndicator() * 2) + 8);
        }

        public byte toByte() {
            return (byte) ((this.blockSizeValue.getIndicator() & 7) << 4);
        }

        private BD(BLOCKSIZE blocksize) {
            this.blockSizeValue = blocksize;
        }
    }

    public enum BLOCKSIZE {
        SIZE_64KB(4),
        SIZE_256KB(5),
        SIZE_1MB(6),
        SIZE_4MB(7);
        
        private final int indicator;

        private BLOCKSIZE(int i) {
            this.indicator = i;
        }

        public int getIndicator() {
            return this.indicator;
        }

        public static BLOCKSIZE valueOf(int i) {
            if (i == 4) {
                return SIZE_64KB;
            }
            if (i == 5) {
                return SIZE_256KB;
            }
            if (i == 6) {
                return SIZE_1MB;
            }
            if (i == 7) {
                return SIZE_4MB;
            }
            Locale locale = Locale.ROOT;
            throw new IllegalArgumentException(a81.j(i, "Block size must be 4-7. Cannot use value of [", "]"));
        }
    }

    public static class FrameInfo {
        private final BD bd;
        private boolean finished = false;
        private final FLG flg;
        private final pxe streamHash;

        public FrameInfo(FLG flg2, BD bd2) {
            this.flg = flg2;
            this.bd = bd2;
            if (flg2.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
                frg.d().getClass();
                throw null;
            }
        }

        public int currentStreamHash() {
            throw null;
        }

        public void finish() {
            this.finished = true;
        }

        public BD getBD() {
            return this.bd;
        }

        public FLG getFLG() {
            return this.flg;
        }

        public boolean isEnabled(FLG.Bits bits) {
            return this.flg.isEnabled(bits);
        }

        public boolean isFinished() {
            return this.finished;
        }

        public void updateStreamHash(byte[] bArr, int i, int i2) {
            throw null;
        }
    }

    public LZ4FrameOutputStream(OutputStream outputStream, BLOCKSIZE blocksize, FLG.Bits... bitsArr) throws IOException {
        this(outputStream, blocksize, -1, bitsArr);
    }

    private void ensureNotFinished() {
        if (this.frameInfo.isFinished()) {
            throw new IllegalStateException(CLOSED_STREAM);
        }
    }

    private void writeBlock() throws IOException {
        int i;
        byte[] bArr;
        if (this.buffer.position() != 0) {
            Arrays.fill(this.compressedBuffer, (byte) 0);
            int compress = this.compressor.compress(this.buffer.array(), 0, this.buffer.position(), this.compressedBuffer, 0);
            if (compress >= this.buffer.position()) {
                compress = this.buffer.position();
                bArr = Arrays.copyOf(this.buffer.array(), compress);
                i = Integer.MIN_VALUE;
            } else {
                bArr = this.compressedBuffer;
                i = 0;
            }
            this.intLEBuffer.putInt(0, i | compress);
            this.out.write(this.intLEBuffer.array());
            this.out.write(bArr, 0, compress);
            if (!this.frameInfo.isEnabled(FLG.Bits.BLOCK_CHECKSUM)) {
                this.buffer.rewind();
                return;
            }
            throw null;
        }
    }

    private void writeEndMark() throws IOException {
        this.intLEBuffer.putInt(0, 0);
        this.out.write(this.intLEBuffer.array());
        if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
            this.intLEBuffer.putInt(0, this.frameInfo.currentStreamHash());
            this.out.write(this.intLEBuffer.array());
        }
        this.frameInfo.finish();
    }

    private void writeHeader() throws IOException {
        ByteBuffer order = ByteBuffer.allocate(15).order(ByteOrder.LITTLE_ENDIAN);
        order.putInt(MAGIC);
        order.put(this.frameInfo.getFLG().toByte());
        order.put(this.frameInfo.getBD().toByte());
        if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_SIZE)) {
            order.putLong(this.knownSize);
        }
        order.array();
        order.position();
        throw null;
    }

    public void close() throws IOException {
        if (!this.frameInfo.isFinished()) {
            flush();
            writeEndMark();
        }
        super.close();
    }

    public void flush() throws IOException {
        if (!this.frameInfo.isFinished()) {
            writeBlock();
        }
        super.flush();
    }

    public void write(int i) throws IOException {
        ensureNotFinished();
        if (this.buffer.position() == this.maxBlockSize) {
            writeBlock();
        }
        byte b = (byte) i;
        this.buffer.put(b);
        if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
            this.frameInfo.updateStreamHash(new byte[]{b}, 0, 1);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LZ4FrameOutputStream(java.io.OutputStream r10, net.jpountz.lz4.LZ4FrameOutputStream.BLOCKSIZE r11, long r12, net.jpountz.lz4.LZ4FrameOutputStream.FLG.Bits... r14) throws java.io.IOException {
        /*
            r9 = this;
            net.jpountz.lz4.LZ4Factory r0 = net.jpountz.lz4.LZ4Factory.fastestInstance()
            net.jpountz.lz4.LZ4Compressor r6 = r0.fastCompressor()
            frg r0 = defpackage.frg.d()
            r0.getClass()
            r7 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r8 = r14
            r1.<init>(r2, r3, r4, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4FrameOutputStream.<init>(java.io.OutputStream, net.jpountz.lz4.LZ4FrameOutputStream$BLOCKSIZE, long, net.jpountz.lz4.LZ4FrameOutputStream$FLG$Bits[]):void");
    }

    public LZ4FrameOutputStream(OutputStream outputStream, BLOCKSIZE blocksize, long j, LZ4Compressor lZ4Compressor, erg erg, FLG.Bits... bitsArr) throws IOException {
        super(outputStream);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.intLEBuffer = allocate.order(byteOrder);
        this.frameInfo = null;
        this.compressor = lZ4Compressor;
        FrameInfo frameInfo2 = new FrameInfo(new FLG(1, bitsArr), new BD(blocksize));
        this.frameInfo = frameInfo2;
        int blockMaximumSize = frameInfo2.getBD().getBlockMaximumSize();
        this.maxBlockSize = blockMaximumSize;
        this.buffer = ByteBuffer.allocate(blockMaximumSize).order(byteOrder);
        this.compressedBuffer = new byte[lZ4Compressor.maxCompressedLength(blockMaximumSize)];
        if (!this.frameInfo.getFLG().isEnabled(FLG.Bits.CONTENT_SIZE) || j >= 0) {
            this.knownSize = j;
            writeHeader();
            return;
        }
        throw new IllegalArgumentException("Known size must be greater than zero in order to use the known size feature");
    }

    public static class FLG {
        private static final int DEFAULT_VERSION = 1;
        private final BitSet bitSet;
        private final int version;

        public enum Bits {
            RESERVED_0(0),
            RESERVED_1(1),
            CONTENT_CHECKSUM(2),
            CONTENT_SIZE(3),
            BLOCK_CHECKSUM(4),
            BLOCK_INDEPENDENCE(5);
            
            /* access modifiers changed from: private */
            public final int position;

            private Bits(int i) {
                this.position = i;
            }
        }

        public FLG(int i, Bits... bitsArr) {
            this.bitSet = new BitSet(8);
            this.version = i;
            if (bitsArr != null) {
                for (Bits access$100 : bitsArr) {
                    this.bitSet.set(access$100.position);
                }
            }
            validate();
        }

        public static FLG fromByte(byte b) {
            byte b2 = (byte) (b & 192);
            return new FLG(b2 >>> 6, (byte) (b ^ b2));
        }

        private void validate() {
            if (this.bitSet.get(Bits.RESERVED_0.position)) {
                throw new RuntimeException("Reserved0 field must be 0");
            } else if (this.bitSet.get(Bits.RESERVED_1.position)) {
                throw new RuntimeException("Reserved1 field must be 0");
            } else if (!this.bitSet.get(Bits.BLOCK_INDEPENDENCE.position)) {
                throw new RuntimeException("Dependent block stream is unsupported (BLOCK_INDEPENDENCE must be set)");
            } else if (this.version != 1) {
                Locale locale = Locale.ROOT;
                throw new RuntimeException(a81.j(this.version, "Version ", " is unsupported"));
            }
        }

        public int getVersion() {
            return this.version;
        }

        public boolean isEnabled(Bits bits) {
            return this.bitSet.get(bits.position);
        }

        public byte toByte() {
            return (byte) (((this.version & 3) << 6) | this.bitSet.toByteArray()[0]);
        }

        private FLG(int i, byte b) {
            this.bitSet = BitSet.valueOf(new byte[]{b});
            this.version = i;
            validate();
        }
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        ensureNotFinished();
        while (i2 > this.buffer.remaining()) {
            int remaining = this.buffer.remaining();
            this.buffer.put(bArr, i, remaining);
            if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
                this.frameInfo.updateStreamHash(bArr, i, remaining);
            }
            writeBlock();
            i += remaining;
            i2 -= remaining;
        }
        this.buffer.put(bArr, i, i2);
        if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
            this.frameInfo.updateStreamHash(bArr, i, i2);
        }
    }

    public LZ4FrameOutputStream(OutputStream outputStream, BLOCKSIZE blocksize) throws IOException {
        this(outputStream, blocksize, DEFAULT_FEATURES);
    }

    public LZ4FrameOutputStream(OutputStream outputStream) throws IOException {
        this(outputStream, BLOCKSIZE.SIZE_4MB);
    }
}
