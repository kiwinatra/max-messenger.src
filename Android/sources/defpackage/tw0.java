package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: tw0  reason: default package */
public final class tw0 extends FilterInputStream {
    public long a = 1048577;
    public long b = -1;

    public tw0(InputStream inputStream) {
        super(inputStream);
    }

    public final int available() {
        return (int) Math.min((long) this.in.available(), this.a);
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.b = this.a;
    }

    public final int read() {
        if (this.a == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.a--;
        }
        return read;
    }

    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.b != -1) {
            this.in.reset();
            this.a = this.b;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j) {
        long skip = this.in.skip(Math.min(j, this.a));
        this.a -= skip;
        return skip;
    }

    public final int read(byte[] bArr, int i, int i2) {
        long j = this.a;
        if (j == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.a -= (long) read;
        }
        return read;
    }
}
