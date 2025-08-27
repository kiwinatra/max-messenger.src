package defpackage;

import java.io.InputStream;
import kotlin.UByte;

/* renamed from: o79  reason: default package */
public final class o79 extends InputStream {
    public final o67 a;
    public final InputStream b;
    public byte[] c;
    public int o;
    public final int v;

    public o79(o67 o67, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.a = o67;
        this.b = inputStream;
        this.c = bArr;
        this.o = i;
        this.v = i2;
    }

    public final int available() {
        return this.c != null ? this.v - this.o : this.b.available();
    }

    public final void close() {
        m();
        this.b.close();
    }

    public final void m() {
        byte[] bArr = this.c;
        if (bArr != null) {
            this.c = null;
            o67 o67 = this.a;
            if (o67 != null) {
                o67.b(bArr);
            }
        }
    }

    public final void mark(int i) {
        if (this.c == null) {
            this.b.mark(i);
        }
    }

    public final boolean markSupported() {
        return this.c == null && this.b.markSupported();
    }

    public final int read() {
        byte[] bArr = this.c;
        if (bArr == null) {
            return this.b.read();
        }
        int i = this.o;
        int i2 = i + 1;
        this.o = i2;
        byte b2 = bArr[i] & UByte.MAX_VALUE;
        if (i2 >= this.v) {
            m();
        }
        return b2;
    }

    public final void reset() {
        if (this.c == null) {
            this.b.reset();
        }
    }

    public final long skip(long j) {
        long j2;
        if (this.c != null) {
            int i = this.o;
            j2 = (long) (this.v - i);
            if (j2 > j) {
                this.o = i + ((int) j);
                return j;
            }
            m();
            j -= j2;
        } else {
            j2 = 0;
        }
        return j > 0 ? j2 + this.b.skip(j) : j2;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.c;
        if (bArr2 == null) {
            return this.b.read(bArr, i, i2);
        }
        int i3 = this.o;
        int i4 = this.v;
        int i5 = i4 - i3;
        if (i2 > i5) {
            i2 = i5;
        }
        System.arraycopy(bArr2, i3, bArr, i, i2);
        int i6 = this.o + i2;
        this.o = i6;
        if (i6 >= i4) {
            m();
        }
        return i2;
    }
}
