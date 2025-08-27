package defpackage;

import java.io.OutputStream;
import java.util.Arrays;

/* renamed from: ib7  reason: default package */
public final class ib7 extends OutputStream {
    public byte[] a;
    public int b;

    public final void a(int i) {
        byte[] bArr = this.a;
        if (i - bArr.length > 0) {
            int length = bArr.length << 1;
            if (length - i < 0) {
                length = i;
            }
            if (length - 2147483639 > 0) {
                if (i >= 0) {
                    length = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
                } else {
                    throw new OutOfMemoryError();
                }
            }
            this.a = Arrays.copyOf(bArr, length);
        }
    }

    public final void b(int i) {
        a(this.b + 4);
        byte[] bArr = this.a;
        int i2 = this.b;
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
        this.b = i2 + 4;
    }

    public final synchronized void write(int i) {
        a(this.b + 1);
        byte[] bArr = this.a;
        int i2 = this.b;
        bArr[i2] = (byte) i;
        this.b = i2 + 1;
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        if (i >= 0) {
            if (i <= bArr.length && i2 >= 0 && (i + i2) - bArr.length <= 0) {
                a(this.b + i2);
                System.arraycopy(bArr, i, this.a, this.b, i2);
                this.b += i2;
            }
        }
        throw new IndexOutOfBoundsException();
    }
}
