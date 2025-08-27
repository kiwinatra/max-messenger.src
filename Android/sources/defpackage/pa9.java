package defpackage;

import java.io.OutputStream;
import java.security.MessageDigest;

/* renamed from: pa9  reason: default package */
public final class pa9 extends OutputStream {
    public final OutputStream a;
    public final MessageDigest b;

    public pa9(ozf ozf, MessageDigest messageDigest) {
        this.a = ozf;
        this.b = messageDigest;
    }

    public final void close() {
        this.a.close();
    }

    public final void flush() {
        this.a.flush();
    }

    public final void write(int i) {
        this.a.write(i);
        this.b.update((byte) i);
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.a.write(bArr, i, i2);
        this.b.update(bArr, i, i2);
    }
}
