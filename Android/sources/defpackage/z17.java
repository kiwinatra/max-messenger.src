package defpackage;

import java.io.EOFException;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: z17  reason: default package */
public final class z17 implements ypf {
    public static final ca6 g;
    public static final ca6 h;
    public final up a = new up(1);
    public final ypf b;
    public final ca6 c;
    public ca6 d;
    public byte[] e;
    public int f;

    static {
        aa6 aa6 = new aa6();
        aa6.k = "application/id3";
        g = aa6.a();
        aa6 aa62 = new aa6();
        aa62.k = "application/x-emsg";
        h = aa62.a();
    }

    public z17(ypf ypf, int i) {
        this.b = ypf;
        if (i == 1) {
            this.c = g;
        } else if (i == 3) {
            this.c = h;
        } else {
            throw new IllegalArgumentException(i2a.h(33, i, "Unknown metadataType: "));
        }
        this.e = new byte[0];
        this.f = 0;
    }

    public final int a(b74 b74, int i, boolean z) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (bArr.length < i2) {
            this.e = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int read = b74.read(this.e, this.f, i);
        if (read != -1) {
            this.f += read;
            return read;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final void b(long j, int i, int i2, int i3, wpf wpf) {
        this.d.getClass();
        int i4 = this.f - i3;
        g1g g1g = new g1g(Arrays.copyOfRange(this.e, i4 - i2, i4));
        byte[] bArr = this.e;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.f = i3;
        String str = this.d.Z;
        ca6 ca6 = this.c;
        if (!t0g.a(str, ca6.Z)) {
            if ("application/x-emsg".equals(this.d.Z)) {
                this.a.getClass();
                b95 T = up.T(g1g);
                ca6 h2 = T.h();
                if (h2 == null || !t0g.a(ca6.Z, h2.Z)) {
                    Objects.toString(T.h());
                    return;
                }
                byte[] n = T.n();
                n.getClass();
                g1g = new g1g(n);
            } else {
                String valueOf = String.valueOf(this.d.Z);
                if (valueOf.length() != 0) {
                    "Ignoring sample for unsupported format: ".concat(valueOf);
                    return;
                }
                return;
            }
        }
        int c2 = g1g.c();
        this.b.c(c2, g1g);
        this.b.b(j, i, c2, i3, wpf);
    }

    public final void c(int i, g1g g1g) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (bArr.length < i2) {
            this.e = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        g1g.g(this.f, this.e, i);
        this.f += i;
    }

    public final void d(ca6 ca6) {
        this.d = ca6;
        this.b.d(this.c);
    }
}
