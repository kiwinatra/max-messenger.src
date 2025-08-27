package defpackage;

import android.net.Uri;
import java.util.Map;
import kotlin.UByte;

/* renamed from: f77  reason: default package */
public final class f77 implements h74 {
    public final h74 a;
    public final int b;
    public final w7c c;
    public final byte[] o;
    public int v;

    public f77(h74 h74, int i, w7c w7c) {
        y64.g(i > 0);
        this.a = h74;
        this.b = i;
        this.c = w7c;
        this.o = new byte[1];
        this.v = i;
    }

    public final long N(p74 p74) {
        throw new UnsupportedOperationException();
    }

    public final void O(arf arf) {
        arf.getClass();
        this.a.O(arf);
    }

    public final void close() {
        throw new UnsupportedOperationException();
    }

    public final Uri getUri() {
        return this.a.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.v;
        h74 h74 = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.o;
            int i4 = 0;
            if (h74.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & UByte.MAX_VALUE) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int read = h74.read(bArr3, i4, i6);
                        if (read != -1) {
                            i4 += read;
                            i6 -= read;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        g1g g1g = new g1g(i5, bArr3);
                        w7c w7c = this.c;
                        long max = !w7c.w0 ? w7c.X : Math.max(w7c.x0.f(), w7c.X);
                        int c2 = g1g.c();
                        icd icd = w7c.v0;
                        icd.getClass();
                        icd.c(c2, g1g);
                        icd.b(max, 1, c2, 0, (wpf) null);
                        w7c.w0 = true;
                    }
                }
                this.v = this.b;
            }
            return -1;
        }
        int read2 = h74.read(bArr, i, Math.min(this.v, i2));
        if (read2 != -1) {
            this.v -= read2;
        }
        return read2;
    }

    public final Map x() {
        return this.a.x();
    }
}
