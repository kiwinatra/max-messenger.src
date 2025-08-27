package defpackage;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import kotlin.UByte;

/* renamed from: quf  reason: default package */
public final class quf extends Reader {
    public final boolean X;
    public char[] Y;
    public final o67 a;
    public InputStream b;
    public byte[] c;
    public int o;
    public int v;
    public final boolean w;
    public char x = 0;
    public int y;
    public int z;

    public quf(o67 o67, InputStream inputStream, byte[] bArr, int i, int i2, boolean z2) {
        boolean z3 = false;
        this.a = o67;
        this.b = inputStream;
        this.c = bArr;
        this.o = i;
        this.v = i2;
        this.w = z2;
        this.X = inputStream != null ? true : z3;
    }

    public final void a(int i) {
        throw new CharConversionException(wj6.l(a81.n("Unexpected EOF in the middle of a 4-byte UTF-32 char: got ", i, ", needed 4, at char #", this.y, ", byte #"), this.z + i, ")"));
    }

    public final void close() {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            this.b = null;
            byte[] bArr = this.c;
            if (bArr != null) {
                this.c = null;
                this.a.b(bArr);
            }
            inputStream.close();
        }
    }

    public final int read() {
        if (this.Y == null) {
            this.Y = new char[1];
        }
        if (read(this.Y, 0, 1) < 1) {
            return -1;
        }
        return this.Y[0];
    }

    public final int read(char[] cArr, int i, int i2) {
        int i3;
        int i4;
        byte b2;
        byte b3;
        int i5;
        int i6;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3 = this.c;
        if (bArr3 == null) {
            return -1;
        }
        if (i2 < 1) {
            return i2;
        }
        if (i < 0 || (i3 = i + i2) > cArr.length) {
            throw new ArrayIndexOutOfBoundsException(wj6.l(a81.n("read(buf,", i, ",", i2, "), cbuf["), cArr.length, "]"));
        }
        char c2 = this.x;
        if (c2 != 0) {
            i4 = i + 1;
            cArr[i] = c2;
            this.x = 0;
        } else {
            int i7 = this.v;
            int i8 = this.o;
            int i9 = i7 - i8;
            if (i9 < 4) {
                this.z = (i7 - i9) + this.z;
                o67 o67 = this.a;
                boolean z2 = this.X;
                if (i9 > 0) {
                    if (i8 > 0) {
                        System.arraycopy(bArr3, i8, bArr3, 0, i9);
                        this.o = 0;
                    }
                    this.v = i9;
                } else {
                    this.o = 0;
                    InputStream inputStream = this.b;
                    int read = inputStream == null ? -1 : inputStream.read(bArr3);
                    if (read < 1) {
                        this.v = 0;
                        if (read < 0) {
                            if (z2 && (bArr2 = this.c) != null) {
                                this.c = null;
                                o67.b(bArr2);
                            }
                            if (i9 == 0) {
                                return -1;
                            }
                            a(this.v - this.o);
                            throw null;
                        }
                        throw new IOException("Strange I/O stream, returned 0 bytes on read");
                    }
                    this.v = read;
                }
                while (true) {
                    int i10 = this.v;
                    if (i10 >= 4) {
                        break;
                    }
                    InputStream inputStream2 = this.b;
                    if (inputStream2 == null) {
                        i6 = -1;
                    } else {
                        byte[] bArr4 = this.c;
                        i6 = inputStream2.read(bArr4, i10, bArr4.length - i10);
                    }
                    if (i6 >= 1) {
                        this.v += i6;
                    } else if (i6 < 0) {
                        if (z2 && (bArr = this.c) != null) {
                            this.c = null;
                            o67.b(bArr);
                        }
                        a(this.v);
                        throw null;
                    } else {
                        throw new IOException("Strange I/O stream, returned 0 bytes on read");
                    }
                }
            }
            i4 = i;
        }
        int i11 = this.v - 4;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            int i12 = this.o;
            if (this.w) {
                byte[] bArr5 = this.c;
                b2 = (bArr5[i12] << 8) | (bArr5[i12 + 1] & UByte.MAX_VALUE);
                b3 = (bArr5[i12 + 3] & UByte.MAX_VALUE) | ((bArr5[i12 + 2] & UByte.MAX_VALUE) << 8);
            } else {
                byte[] bArr6 = this.c;
                byte b4 = (bArr6[i12] & UByte.MAX_VALUE) | ((bArr6[i12 + 1] & UByte.MAX_VALUE) << 8);
                b2 = (bArr6[i12 + 3] << 8) | (bArr6[i12 + 2] & UByte.MAX_VALUE);
                b3 = b4;
            }
            int i13 = i12 + 4;
            this.o = i13;
            if (b2 != 0) {
                byte b5 = b2 & UByte.MAX_VALUE;
                byte b6 = b3 | ((b5 - 1) << 16);
                if (b5 <= 16) {
                    i5 = i4 + 1;
                    cArr[i4] = (char) ((b6 >> 10) + 55296);
                    byte b7 = (b6 & UByte.MAX_VALUE) | UByte.MIN_VALUE;
                    if (i5 >= i3) {
                        this.x = (char) b6;
                        break;
                    }
                    b3 = b7;
                    i4 = i5;
                } else {
                    throw new CharConversionException("Invalid UTF-32 character 0x" + Integer.toHexString(b6) + String.format(" (above 0x%08x)", new Object[]{1114111}) + " at char #" + (this.y + (i4 - i)) + ", byte #" + ((this.z + this.o) - 1) + ")");
                }
            }
            i5 = i4 + 1;
            cArr[i4] = (char) b3;
            if (i13 > i11) {
                break;
            }
            i4 = i5;
        }
        i4 = i5;
        int i14 = i4 - i;
        this.y += i14;
        return i14;
    }
}
