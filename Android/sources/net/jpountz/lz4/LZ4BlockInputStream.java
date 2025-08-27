package net.jpountz.lz4;

import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Checksum;
import kotlin.UByte;

public class LZ4BlockInputStream extends FilterInputStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private byte[] buffer;
    private final Checksum checksum;
    private byte[] compressedBuffer;
    private final LZ4FastDecompressor decompressor;
    private boolean finished;
    private int o;
    private int originalLen;
    private final boolean stopOnEmptyBlock;

    public LZ4BlockInputStream(InputStream inputStream, LZ4FastDecompressor lZ4FastDecompressor, Checksum checksum2, boolean z) {
        super(inputStream);
        this.decompressor = lZ4FastDecompressor;
        this.checksum = checksum2;
        this.stopOnEmptyBlock = z;
        this.buffer = new byte[0];
        this.compressedBuffer = new byte[LZ4BlockOutputStream.HEADER_LENGTH];
        this.originalLen = 0;
        this.o = 0;
        this.finished = false;
    }

    private void readFully(byte[] bArr, int i) throws IOException {
        if (!tryReadFully(bArr, i)) {
            throw new EOFException("Stream ended prematurely");
        }
    }

    private void refill() throws IOException {
        if (tryReadFully(this.compressedBuffer, LZ4BlockOutputStream.HEADER_LENGTH)) {
            int i = 0;
            while (true) {
                int i2 = LZ4BlockOutputStream.MAGIC_LENGTH;
                if (i >= i2) {
                    byte[] bArr = this.compressedBuffer;
                    byte b = bArr[i2];
                    byte b2 = b & 240;
                    int i3 = (b & 15) + 10;
                    if (b2 == 16 || b2 == 32) {
                        int d = acd.d(i2 + 1, bArr);
                        this.originalLen = acd.d(i2 + 5, this.compressedBuffer);
                        int d2 = acd.d(i2 + 9, this.compressedBuffer);
                        int i4 = this.originalLen;
                        if (i4 > (1 << i3) || i4 < 0 || d < 0 || ((i4 == 0 && d != 0) || ((i4 != 0 && d == 0) || (b2 == 16 && i4 != d)))) {
                            throw new IOException("Stream is corrupted");
                        } else if (i4 != 0 || d != 0) {
                            byte[] bArr2 = this.buffer;
                            if (bArr2.length < i4) {
                                this.buffer = new byte[Math.max(i4, (bArr2.length * 3) / 2)];
                            }
                            if (b2 == 16) {
                                readFully(this.buffer, this.originalLen);
                            } else if (b2 == 32) {
                                byte[] bArr3 = this.compressedBuffer;
                                if (bArr3.length < d) {
                                    this.compressedBuffer = new byte[Math.max(d, (bArr3.length * 3) / 2)];
                                }
                                readFully(this.compressedBuffer, d);
                                try {
                                    if (d != this.decompressor.decompress(this.compressedBuffer, 0, this.buffer, 0, this.originalLen)) {
                                        throw new IOException("Stream is corrupted");
                                    }
                                } catch (LZ4Exception e) {
                                    throw new IOException("Stream is corrupted", e);
                                }
                            } else {
                                throw new AssertionError();
                            }
                            this.checksum.reset();
                            this.checksum.update(this.buffer, 0, this.originalLen);
                            if (((int) this.checksum.getValue()) == d2) {
                                this.o = 0;
                                return;
                            }
                            throw new IOException("Stream is corrupted");
                        } else if (d2 != 0) {
                            throw new IOException("Stream is corrupted");
                        } else if (!this.stopOnEmptyBlock) {
                            refill();
                            return;
                        } else {
                            this.finished = true;
                            return;
                        }
                    } else {
                        throw new IOException("Stream is corrupted");
                    }
                } else if (this.compressedBuffer[i] == LZ4BlockOutputStream.MAGIC[i]) {
                    i++;
                } else {
                    throw new IOException("Stream is corrupted");
                }
            }
        } else if (!this.stopOnEmptyBlock) {
            this.finished = true;
        } else {
            throw new EOFException("Stream ended prematurely");
        }
    }

    private boolean tryReadFully(byte[] bArr, int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int read = this.in.read(bArr, i2, i - i2);
            if (read < 0) {
                return false;
            }
            i2 += read;
        }
        return true;
    }

    public int available() throws IOException {
        return this.originalLen - this.o;
    }

    public void mark(int i) {
    }

    public boolean markSupported() {
        return false;
    }

    public int read() throws IOException {
        if (this.finished) {
            return -1;
        }
        if (this.o == this.originalLen) {
            refill();
        }
        if (this.finished) {
            return -1;
        }
        byte[] bArr = this.buffer;
        int i = this.o;
        this.o = i + 1;
        return bArr[i] & UByte.MAX_VALUE;
    }

    public void reset() throws IOException {
        throw new IOException("mark/reset not supported");
    }

    public long skip(long j) throws IOException {
        if (j <= 0 || this.finished) {
            return 0;
        }
        if (this.o == this.originalLen) {
            refill();
        }
        if (this.finished) {
            return 0;
        }
        int min = (int) Math.min(j, (long) (this.originalLen - this.o));
        this.o += min;
        return (long) min;
    }

    public String toString() {
        return getClass().getSimpleName() + "(in=" + this.in + ", decompressor=" + this.decompressor + ", checksum=" + this.checksum + ")";
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        acd.b(i, bArr, i2);
        if (this.finished) {
            return -1;
        }
        if (this.o == this.originalLen) {
            refill();
        }
        if (this.finished) {
            return -1;
        }
        int min = Math.min(i2, this.originalLen - this.o);
        System.arraycopy(this.buffer, this.o, bArr, i, min);
        this.o += min;
        return min;
    }

    public LZ4BlockInputStream(InputStream inputStream, LZ4FastDecompressor lZ4FastDecompressor, Checksum checksum2) {
        this(inputStream, lZ4FastDecompressor, checksum2, true);
    }

    public LZ4BlockInputStream(InputStream inputStream, LZ4FastDecompressor lZ4FastDecompressor) {
        frg.d().getClass();
        throw null;
    }

    public LZ4BlockInputStream(InputStream inputStream, boolean z) {
        LZ4Factory.fastestInstance().fastDecompressor();
        frg.d().getClass();
        throw null;
    }

    public LZ4BlockInputStream(InputStream inputStream) {
        this(inputStream, LZ4Factory.fastestInstance().fastDecompressor());
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
