package kotlin.io.encoding;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.ArraysKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0002J(\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0002J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0002J\b\u0010\u001d\u001a\u00020\tH\u0016J \u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0016J\b\u0010 \u001a\u00020\tH\u0002J\b\u0010!\u001a\u00020\u0014H\u0002J\b\u0010\"\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\t8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lkotlin/io/encoding/DecodeInputStream;", "Ljava/io/InputStream;", "input", "base64", "Lkotlin/io/encoding/Base64;", "(Ljava/io/InputStream;Lkotlin/io/encoding/Base64;)V", "byteBuffer", "", "byteBufferEndIndex", "", "byteBufferLength", "getByteBufferLength", "()I", "byteBufferStartIndex", "isClosed", "", "isEOF", "singleByteBuffer", "symbolBuffer", "close", "", "copyByteBufferInto", "dst", "dstOffset", "length", "decodeSymbolBufferInto", "dstEndIndex", "symbolBufferLength", "handlePaddingSymbol", "read", "destination", "offset", "readNextSymbol", "resetByteBufferIfEmpty", "shiftByteBufferToStartIfNeeded", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalEncodingApi
final class DecodeInputStream extends InputStream {
    private final Base64 base64;
    private final byte[] byteBuffer = new byte[1024];
    private int byteBufferEndIndex;
    private int byteBufferStartIndex;
    private final InputStream input;
    private boolean isClosed;
    private boolean isEOF;
    private final byte[] singleByteBuffer = new byte[1];
    private final byte[] symbolBuffer = new byte[1024];

    public DecodeInputStream(InputStream inputStream, Base64 base642) {
        this.input = inputStream;
        this.base64 = base642;
    }

    private final void copyByteBufferInto(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.byteBuffer;
        int i3 = this.byteBufferStartIndex;
        ArraysKt.copyInto(bArr2, bArr, i, i3, i3 + i2);
        this.byteBufferStartIndex += i2;
        resetByteBufferIfEmpty();
    }

    private final int decodeSymbolBufferInto(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.byteBufferEndIndex;
        this.byteBufferEndIndex = i4 + this.base64.decodeIntoByteArray(this.symbolBuffer, this.byteBuffer, i4, 0, i3);
        int min = Math.min(getByteBufferLength(), i2 - i);
        copyByteBufferInto(bArr, i, min);
        shiftByteBufferToStartIfNeeded();
        return min;
    }

    private final int getByteBufferLength() {
        return this.byteBufferEndIndex - this.byteBufferStartIndex;
    }

    private final int handlePaddingSymbol(int i) {
        this.symbolBuffer[i] = Base64.padSymbol;
        if ((i & 3) != 2) {
            return i + 1;
        }
        int readNextSymbol = readNextSymbol();
        if (readNextSymbol >= 0) {
            this.symbolBuffer[i + 1] = (byte) readNextSymbol;
        }
        return i + 2;
    }

    private final int readNextSymbol() {
        int read;
        if (!this.base64.isMimeScheme$kotlin_stdlib()) {
            return this.input.read();
        }
        do {
            read = this.input.read();
            if (read == -1 || Base64Kt.isInMimeAlphabet(read)) {
                return read;
            }
            read = this.input.read();
            break;
        } while (Base64Kt.isInMimeAlphabet(read));
        return read;
    }

    private final void resetByteBufferIfEmpty() {
        if (this.byteBufferStartIndex == this.byteBufferEndIndex) {
            this.byteBufferStartIndex = 0;
            this.byteBufferEndIndex = 0;
        }
    }

    private final void shiftByteBufferToStartIfNeeded() {
        byte[] bArr = this.byteBuffer;
        int length = bArr.length;
        int i = this.byteBufferEndIndex;
        if ((this.symbolBuffer.length / 4) * 3 > length - i) {
            ArraysKt.copyInto(bArr, bArr, 0, this.byteBufferStartIndex, i);
            this.byteBufferEndIndex -= this.byteBufferStartIndex;
            this.byteBufferStartIndex = 0;
        }
    }

    public void close() {
        if (!this.isClosed) {
            this.isClosed = true;
            this.input.close();
        }
    }

    public int read() {
        int i = this.byteBufferStartIndex;
        if (i < this.byteBufferEndIndex) {
            byte b = this.byteBuffer[i] & UByte.MAX_VALUE;
            this.byteBufferStartIndex = i + 1;
            resetByteBufferIfEmpty();
            return b;
        }
        int read = read(this.singleByteBuffer, 0, 1);
        if (read == -1) {
            return -1;
        }
        if (read == 1) {
            return this.singleByteBuffer[0] & UByte.MAX_VALUE;
        }
        throw new IllegalStateException("Unreachable".toString());
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3;
        boolean z;
        if (i < 0 || i2 < 0 || (i3 = i + i2) > bArr.length) {
            StringBuilder n = a81.n("offset: ", i, ", length: ", i2, ", buffer size: ");
            n.append(bArr.length);
            throw new IndexOutOfBoundsException(n.toString());
        } else if (this.isClosed) {
            throw new IOException("The input stream is closed.");
        } else if (this.isEOF) {
            return -1;
        } else {
            if (i2 == 0) {
                return 0;
            }
            if (getByteBufferLength() >= i2) {
                copyByteBufferInto(bArr, i, i2);
                return i2;
            }
            int byteBufferLength = (((i2 - getByteBufferLength()) + 2) / 3) * 4;
            int i4 = i;
            while (true) {
                boolean z2 = this.isEOF;
                if (!z2 && byteBufferLength > 0) {
                    int min = Math.min(this.symbolBuffer.length, byteBufferLength);
                    int i5 = 0;
                    while (true) {
                        z = this.isEOF;
                        if (!z && i5 < min) {
                            int readNextSymbol = readNextSymbol();
                            if (readNextSymbol == -1) {
                                this.isEOF = true;
                            } else if (readNextSymbol != 61) {
                                this.symbolBuffer[i5] = (byte) readNextSymbol;
                                i5++;
                            } else {
                                i5 = handlePaddingSymbol(i5);
                                this.isEOF = true;
                            }
                        } else if (!z || i5 == min) {
                            byteBufferLength -= i5;
                            i4 += decodeSymbolBufferInto(bArr, i4, i3, i5);
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                    if (!z) {
                    }
                    byteBufferLength -= i5;
                    i4 += decodeSymbolBufferInto(bArr, i4, i3, i5);
                } else if (i4 == i || !z2) {
                    return i4 - i;
                } else {
                    return -1;
                }
            }
            if (i4 == i) {
            }
            return i4 - i;
        }
    }
}
