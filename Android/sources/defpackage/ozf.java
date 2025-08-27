package defpackage;

import java.io.OutputStream;

/* renamed from: ozf  reason: default package */
public final class ozf extends OutputStream {
    public static final /* synthetic */ int b = 0;
    public final OutputStream a;

    public ozf(OutputStream outputStream) {
        this.a = outputStream;
    }

    public final void close() {
        this.a.close();
    }

    public final void flush() {
        this.a.flush();
    }

    public final void write(int i) {
        boolean d = v02.d(i);
        OutputStream outputStream = this.a;
        if (d) {
            outputStream.write(i);
            return;
        }
        outputStream.write(37);
        int i2 = (i >> 4) & 15;
        outputStream.write(i2 <= 9 ? i2 + 48 : i2 + 55);
        int i3 = i & 15;
        outputStream.write(i3 <= 9 ? i3 + 48 : i3 + 55);
    }

    public final void write(byte[] bArr, int i, int i2) {
        OutputStream outputStream;
        int i3 = i2 + i;
        int i4 = i;
        while (true) {
            outputStream = this.a;
            if (i >= i3) {
                break;
            }
            byte b2 = bArr[i];
            if (!v02.d(b2)) {
                if (i > i4) {
                    outputStream.write(bArr, i4, i - i4);
                }
                outputStream.write(37);
                int i5 = (b2 >> 4) & 15;
                outputStream.write(i5 <= 9 ? i5 + 48 : i5 + 55);
                byte b3 = b2 & 15;
                outputStream.write(b3 <= 9 ? b3 + 48 : b3 + 55);
                i4 = i + 1;
            }
            i++;
        }
        if (i4 < i3) {
            outputStream.write(bArr, i4, i3 - i4);
        }
    }
}
