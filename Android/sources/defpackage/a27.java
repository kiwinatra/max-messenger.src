package defpackage;

import java.io.EOFException;
import java.util.Arrays;

/* renamed from: a27  reason: default package */
public final class a27 implements zpf {
    public static final ea6 g;
    public static final ea6 h;
    public final vp a = new vp(1);
    public final zpf b;
    public final ea6 c;
    public ea6 d;
    public byte[] e;
    public int f;

    static {
        ba6 ba6 = new ba6();
        ba6.m = vq9.l("application/id3");
        g = ba6.a();
        ba6 ba62 = new ba6();
        ba62.m = vq9.l("application/x-emsg");
        h = ba62.a();
    }

    public a27(zpf zpf, int i) {
        this.b = zpf;
        if (i == 1) {
            this.c = g;
        } else if (i == 3) {
            this.c = h;
        } else {
            throw new IllegalArgumentException(wj6.h(i, "Unknown metadataType: "));
        }
        this.e = new byte[0];
        this.f = 0;
    }

    public final void a(long j, int i, int i2, int i3, xpf xpf) {
        int i4 = i3;
        this.d.getClass();
        int i5 = this.f - i4;
        l8b l8b = new l8b(Arrays.copyOfRange(this.e, i5 - i2, i5));
        byte[] bArr = this.e;
        System.arraycopy(bArr, i5, bArr, 0, i4);
        this.f = i4;
        String str = this.d.n;
        ea6 ea6 = this.c;
        if (!v0g.a(str, ea6.n)) {
            if ("application/x-emsg".equals(this.d.n)) {
                this.a.getClass();
                c95 N = vp.N(l8b);
                ea6 h2 = N.h();
                String str2 = ea6.n;
                if (h2 == null || !v0g.a(str2, h2.n)) {
                    ea6 h3 = N.h();
                    i8b.V("Ignoring EMSG. Expected it to contain wrapped " + str2 + " but actual wrapped format: " + h3);
                    return;
                }
                byte[] n = N.n();
                n.getClass();
                l8b = new l8b(n);
            } else {
                i8b.V("Ignoring sample for unsupported format: " + this.d.n);
                return;
            }
        }
        int a2 = l8b.a();
        this.b.b(l8b, a2, 0);
        this.b.a(j, i, a2, 0, xpf);
    }

    public final void b(l8b l8b, int i, int i2) {
        int i3 = this.f + i;
        byte[] bArr = this.e;
        if (bArr.length < i3) {
            this.e = Arrays.copyOf(bArr, (i3 / 2) + i3);
        }
        l8b.e(this.f, this.e, i);
        this.f += i;
    }

    public final int c(c74 c74, int i, boolean z) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (bArr.length < i2) {
            this.e = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int read = c74.read(this.e, this.f, i);
        if (read != -1) {
            this.f += read;
            return read;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final void e(ea6 ea6) {
        this.d = ea6;
        this.b.e(this.c);
    }
}
