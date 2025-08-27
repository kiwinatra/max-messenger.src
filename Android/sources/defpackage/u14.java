package defpackage;

import java.io.FilterOutputStream;

/* renamed from: u14  reason: default package */
public final class u14 extends FilterOutputStream {
    public long a;

    public final void close() {
        this.out.close();
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        this.a += (long) i2;
    }

    public final void write(int i) {
        this.out.write(i);
        this.a++;
    }
}
