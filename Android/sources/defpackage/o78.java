package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* renamed from: o78  reason: default package */
public final class o78 {
    public final long a;
    public final byte[] b;
    public final int c;

    public o78(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
        this.c = bArr.length + 30;
    }

    public final void a(OutputStream outputStream, int i) {
        outputStream.write(35);
        bs0.c(outputStream, String.valueOf(i));
        outputStream.write(32);
        bs0.c(outputStream, String.valueOf(this.a));
        bs0.c(outputStream, " | ");
        outputStream.write(this.b);
        outputStream.write(10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o78) {
            o78 o78 = (o78) obj;
            return this.a == o78.a && Arrays.equals(this.b, o78.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) | Long.hashCode(this.a);
    }

    public final String toString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(byteArrayOutputStream, 0);
        return byteArrayOutputStream.toString();
    }
}
