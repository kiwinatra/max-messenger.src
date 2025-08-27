package defpackage;

import java.io.OutputStream;

/* renamed from: ut7  reason: default package */
public final class ut7 extends OutputStream {
    public long a;

    public final void write(int i) {
        this.a++;
    }

    public final void write(byte[] bArr) {
        this.a += (long) bArr.length;
    }

    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.a += (long) i2;
    }
}
