package defpackage;

import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* renamed from: rqb  reason: default package */
public final class rqb extends InputStream {
    public final InputStream a;
    public final byte[] b;
    public final b4d c;
    public int o = 0;
    public int v = 0;
    public boolean w = false;

    public rqb(InputStream inputStream, byte[] bArr, b4d b4d) {
        this.a = inputStream;
        bArr.getClass();
        this.b = bArr;
        b4d.getClass();
        this.c = b4d;
    }

    public final int available() {
        cvg.q(this.v <= this.o);
        m();
        return this.a.available() + (this.o - this.v);
    }

    public final void close() {
        if (!this.w) {
            this.w = true;
            this.c.b(this.b);
            super.close();
        }
    }

    public final void finalize() {
        if (!this.w) {
            bg5.c("PooledByteInputStream");
            close();
        }
        super.finalize();
    }

    public final void m() {
        if (this.w) {
            throw new IOException("stream already closed");
        }
    }

    public final int read() {
        cvg.q(this.v <= this.o);
        m();
        int i = this.v;
        int i2 = this.o;
        byte[] bArr = this.b;
        if (i >= i2) {
            int read = this.a.read(bArr);
            if (read <= 0) {
                return -1;
            }
            this.o = read;
            this.v = 0;
        }
        int i3 = this.v;
        this.v = i3 + 1;
        return bArr[i3] & UByte.MAX_VALUE;
    }

    public final long skip(long j) {
        cvg.q(this.v <= this.o);
        m();
        int i = this.o;
        int i2 = this.v;
        long j2 = (long) (i - i2);
        if (j2 >= j) {
            this.v = (int) (((long) i2) + j);
            return j;
        }
        this.v = i;
        return this.a.skip(j - j2) + j2;
    }

    public final int read(byte[] bArr, int i, int i2) {
        cvg.q(this.v <= this.o);
        m();
        int i3 = this.v;
        int i4 = this.o;
        byte[] bArr2 = this.b;
        if (i3 >= i4) {
            int read = this.a.read(bArr2);
            if (read <= 0) {
                return -1;
            }
            this.o = read;
            this.v = 0;
        }
        int min = Math.min(this.o - this.v, i2);
        System.arraycopy(bArr2, this.v, bArr, i, min);
        this.v += min;
        return min;
    }
}
