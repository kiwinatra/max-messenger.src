package defpackage;

import java.io.InputStream;
import kotlin.UByte;

/* renamed from: sqb  reason: default package */
public final class sqb extends InputStream {
    public final e69 a;
    public int b;
    public int c;

    public sqb(e69 e69) {
        boolean m0;
        synchronized (e69) {
            m0 = y33.m0(e69.b);
        }
        if (m0) {
            this.a = e69;
            this.b = 0;
            this.c = 0;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final int available() {
        return this.a.V() - this.b;
    }

    public final void mark(int i) {
        this.c = this.b;
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() {
        if (available() <= 0) {
            return -1;
        }
        int i = this.b;
        this.b = i + 1;
        return this.a.o(i) & UByte.MAX_VALUE;
    }

    public final void reset() {
        this.b = this.c;
    }

    public final long skip(long j) {
        cvg.l(Boolean.valueOf(j >= 0));
        int min = Math.min((int) j, available());
        this.b += min;
        return (long) min;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            StringBuilder sb = new StringBuilder("length=");
            g63.o(sb, bArr.length, "; regionStart=", i, "; regionLength=");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        int min = Math.min(available, i2);
        this.a.U(this.b, i, min, bArr);
        this.b += min;
        return min;
    }
}
