package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import kotlin.io.ConstantsKt;

/* renamed from: va5  reason: default package */
public class va5 extends InputStream implements DataInput {
    public static final ByteOrder v = ByteOrder.LITTLE_ENDIAN;
    public static final ByteOrder w = ByteOrder.BIG_ENDIAN;
    public final DataInputStream a;
    public ByteOrder b;
    public int c;
    public byte[] o;

    public va5(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
    }

    public final void a(int i) {
        int i2 = 0;
        while (i2 < i) {
            DataInputStream dataInputStream = this.a;
            int i3 = i - i2;
            int skip = (int) dataInputStream.skip((long) i3);
            if (skip <= 0) {
                if (this.o == null) {
                    this.o = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
                }
                skip = dataInputStream.read(this.o, 0, Math.min(ConstantsKt.DEFAULT_BUFFER_SIZE, i3));
                if (skip == -1) {
                    throw new EOFException(a81.j(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i2 += skip;
        }
        this.c += i2;
    }

    public final int available() {
        return this.a.available();
    }

    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    public final int read() {
        this.c++;
        return this.a.read();
    }

    public final boolean readBoolean() {
        this.c++;
        return this.a.readBoolean();
    }

    public final byte readByte() {
        this.c++;
        int read = this.a.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public final char readChar() {
        this.c += 2;
        return this.a.readChar();
    }

    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public final void readFully(byte[] bArr, int i, int i2) {
        this.c += i2;
        this.a.readFully(bArr, i, i2);
    }

    public final int readInt() {
        this.c += 4;
        DataInputStream dataInputStream = this.a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.b;
            if (byteOrder == v) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == w) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.b);
        }
        throw new EOFException();
    }

    public final String readLine() {
        return null;
    }

    public final long readLong() {
        this.c += 8;
        DataInputStream dataInputStream = this.a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.b;
            if (byteOrder == v) {
                return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
            }
            if (byteOrder == w) {
                return (((long) read) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
            }
            throw new IOException("Invalid byte order: " + this.b);
        }
        throw new EOFException();
    }

    public final short readShort() {
        int i;
        this.c += 2;
        DataInputStream dataInputStream = this.a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.b;
            if (byteOrder == v) {
                i = (read2 << 8) + read;
            } else if (byteOrder == w) {
                i = (read << 8) + read2;
            } else {
                throw new IOException("Invalid byte order: " + this.b);
            }
            return (short) i;
        }
        throw new EOFException();
    }

    public final String readUTF() {
        this.c += 2;
        return this.a.readUTF();
    }

    public final int readUnsignedByte() {
        this.c++;
        return this.a.readUnsignedByte();
    }

    public final int readUnsignedShort() {
        this.c += 2;
        DataInputStream dataInputStream = this.a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.b;
            if (byteOrder == v) {
                return (read2 << 8) + read;
            }
            if (byteOrder == w) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.b);
        }
        throw new EOFException();
    }

    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public va5(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public va5(InputStream inputStream, ByteOrder byteOrder) {
        this.b = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.a = dataInputStream;
        dataInputStream.mark(0);
        this.c = 0;
        this.b = byteOrder;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.a.read(bArr, i, i2);
        this.c += read;
        return read;
    }

    public final void readFully(byte[] bArr) {
        this.c += bArr.length;
        this.a.readFully(bArr);
    }
}
