package defpackage;

import java.io.EOFException;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: kze  reason: default package */
public final class kze implements zpf {
    public final zpf a;
    public final gze b;
    public final mz4 c = new Object();
    public final l8b d = new l8b();
    public int e = 0;
    public int f = 0;
    public byte[] g = v0g.f;
    public ize h;
    public ea6 i;

    /* JADX WARNING: type inference failed for: r1v1, types: [mz4, java.lang.Object] */
    public kze(zpf zpf, gze gze) {
        this.a = zpf;
        this.b = gze;
    }

    public final void a(long j, int i2, int i3, int i4, xpf xpf) {
        if (this.h == null) {
            this.a.a(j, i2, i3, i4, xpf);
            return;
        }
        n79.f("DRM on subtitles is not supported", xpf == null);
        int i5 = (this.f - i4) - i3;
        this.h.m(this.g, i5, i3, hze.c, new rb4((Object) this, j, i2, 6));
        int i6 = i5 + i3;
        this.e = i6;
        if (i6 == this.f) {
            this.e = 0;
            this.f = 0;
        }
    }

    public final void b(l8b l8b, int i2, int i3) {
        if (this.h == null) {
            this.a.b(l8b, i2, i3);
            return;
        }
        f(i2);
        l8b.e(this.f, this.g, i2);
        this.f += i2;
    }

    public final int c(c74 c74, int i2, boolean z) {
        if (this.h == null) {
            return this.a.c(c74, i2, z);
        }
        f(i2);
        int read = c74.read(this.g, this.f, i2);
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
        ea6.n.getClass();
        String str = ea6.n;
        n79.g(vq9.g(str) == 3);
        boolean equals = ea6.equals(this.i);
        gze gze = this.b;
        if (!equals) {
            this.i = ea6;
            this.h = gze.k(ea6) ? gze.t(ea6) : null;
        }
        ize ize = this.h;
        zpf zpf = this.a;
        if (ize == null) {
            zpf.e(ea6);
            return;
        }
        ba6 a2 = ea6.a();
        a2.m = vq9.l("application/x-media3-cues");
        a2.i = str;
        a2.r = LongCompanionObject.MAX_VALUE;
        a2.G = gze.D(ea6);
        zpf.e(new ea6(a2));
    }

    public final void f(int i2) {
        int length = this.g.length;
        int i3 = this.f;
        if (length - i3 < i2) {
            int i4 = i3 - this.e;
            int max = Math.max(i4 * 2, i2 + i4);
            byte[] bArr = this.g;
            byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
            System.arraycopy(bArr, this.e, bArr2, 0, i4);
            this.e = 0;
            this.f = i4;
            this.g = bArr2;
        }
    }
}
