package defpackage;

import android.net.Uri;
import java.util.Map;
import kotlin.UByte;

/* renamed from: g77  reason: default package */
public final class g77 implements j74 {
    public final j74 a;
    public final int b;
    public final x7c c;
    public final byte[] o;
    public int v;

    public g77(j74 j74, int i, x7c x7c) {
        n79.g(i > 0);
        this.a = j74;
        this.b = i;
        this.c = x7c;
        this.o = new byte[1];
        this.v = i;
    }

    public final long G(q74 q74) {
        throw new UnsupportedOperationException();
    }

    public final void H(brf brf) {
        brf.getClass();
        this.a.H(brf);
    }

    public final void close() {
        throw new UnsupportedOperationException();
    }

    public final Uri getUri() {
        return this.a.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.v;
        j74 j74 = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.o;
            if (j74.read(bArr2, 0, 1) != -1) {
                int i4 = (bArr2[0] & UByte.MAX_VALUE) << 4;
                if (i4 != 0) {
                    byte[] bArr3 = new byte[i4];
                    int i5 = i4;
                    int i6 = 0;
                    while (i5 > 0) {
                        int read = j74.read(bArr3, i6, i5);
                        if (read != -1) {
                            i6 += read;
                            i5 -= read;
                        }
                    }
                    while (i4 > 0 && bArr3[i4 - 1] == 0) {
                        i4--;
                    }
                    if (i4 > 0) {
                        l8b l8b = new l8b(i4, bArr3);
                        x7c x7c = this.c;
                        long max = !x7c.v0 ? x7c.X : Math.max(x7c.w0.f(true), x7c.X);
                        int a2 = l8b.a();
                        zpf zpf = x7c.Z;
                        zpf.getClass();
                        zpf.b(l8b, a2, 0);
                        zpf.a(max, 1, a2, 0, (xpf) null);
                        x7c.v0 = true;
                    }
                }
                this.v = this.b;
            }
            return -1;
        }
        int read2 = j74.read(bArr, i, Math.min(this.v, i2));
        if (read2 != -1) {
            this.v -= read2;
        }
        return read2;
    }

    public final Map x() {
        return this.a.x();
    }
}
