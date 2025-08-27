package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: rv7  reason: default package */
public final class rv7 extends FilterInputStream {
    public int a;
    public int b;

    public rv7(InputStream inputStream, int i) {
        super(inputStream);
        if (i >= 0) {
            this.a = i;
            this.b = -1;
            return;
        }
        throw new IllegalArgumentException("limit must be >= 0");
    }

    public final int available() {
        return Math.min(this.in.available(), this.a);
    }

    public final void mark(int i) {
        if (this.in.markSupported()) {
            this.in.mark(i);
            this.b = this.a;
        }
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

    public final void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("mark is not supported");
        } else if (this.b != -1) {
            this.in.reset();
            this.a = this.b;
        } else {
            throw new IOException("mark not set");
        }
    }

    public final long skip(long j) {
        long skip = this.in.skip(Math.min(j, (long) this.a));
        this.a = (int) (((long) this.a) - skip);
        return skip;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.a;
        if (i3 == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, Math.min(i2, i3));
        if (read > 0) {
            this.a -= read;
        }
        return read;
    }
}
