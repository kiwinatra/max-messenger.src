package defpackage;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: aze  reason: default package */
public final class aze implements tf5 {
    public long[] X;
    public long Y;
    public final ize a;
    public final mz4 b = new Object();
    public final ea6 c;
    public final ArrayList o;
    public final l8b v = new l8b();
    public byte[] w = v0g.f;
    public zpf x;
    public int y;
    public int z;

    /* JADX WARNING: type inference failed for: r0v0, types: [mz4, java.lang.Object] */
    public aze(ize ize, ea6 ea6) {
        this.a = ize;
        ba6 a2 = ea6.a();
        a2.m = vq9.l("application/x-media3-cues");
        a2.i = ea6.n;
        a2.G = ize.q();
        this.c = new ea6(a2);
        this.o = new ArrayList();
        this.z = 0;
        this.X = v0g.g;
        this.Y = -9223372036854775807L;
    }

    public final void U(xf5 xf5) {
        n79.n(this.z == 0);
        zpf B = xf5.B(0, 3);
        this.x = B;
        B.e(this.c);
        xf5.v();
        xf5.M(new we7(-9223372036854775807L, new long[]{0}, new long[]{0}));
        this.z = 1;
    }

    public final void a(zye zye) {
        n79.o(this.x);
        byte[] bArr = zye.b;
        int length = bArr.length;
        l8b l8b = this.v;
        l8b.getClass();
        l8b.E(bArr.length, bArr);
        this.x.b(l8b, length, 0);
        this.x.a(zye.a, 1, length, 0, (xpf) null);
    }

    public final void d(long j, long j2) {
        int i = this.z;
        n79.n((i == 0 || i == 5) ? false : true);
        this.Y = j2;
        if (this.z == 2) {
            this.z = 1;
        }
        if (this.z == 4) {
            this.z = 3;
        }
    }

    public final int g(vf5 vf5, yl4 yl4) {
        int i = this.z;
        n79.n((i == 0 || i == 5) ? false : true);
        if (this.z == 1) {
            int r = ((hf4) vf5).c != -1 ? cvg.r(((hf4) vf5).c) : 1024;
            if (r > this.w.length) {
                this.w = new byte[r];
            }
            this.y = 0;
            this.z = 2;
        }
        int i2 = this.z;
        ArrayList arrayList = this.o;
        if (i2 == 2) {
            byte[] bArr = this.w;
            if (bArr.length == this.y) {
                this.w = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.w;
            int i3 = this.y;
            hf4 hf4 = (hf4) vf5;
            int read = hf4.read(bArr2, i3, bArr2.length - i3);
            if (read != -1) {
                this.y += read;
            }
            long j = hf4.c;
            if ((j != -1 && ((long) this.y) == j) || read == -1) {
                try {
                    long j2 = this.Y;
                    this.a.m(this.w, 0, this.y, j2 != -9223372036854775807L ? new hze(j2, true) : hze.c, new nqd(17, this));
                    Collections.sort(arrayList);
                    this.X = new long[arrayList.size()];
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        this.X[i4] = ((zye) arrayList.get(i4)).a;
                    }
                    this.w = v0g.f;
                    this.z = 4;
                } catch (RuntimeException e) {
                    throw ParserException.a("SubtitleParser failed.", e);
                }
            }
        }
        if (this.z == 3) {
            if (((hf4) vf5).e(((hf4) vf5).c != -1 ? cvg.r(((hf4) vf5).c) : 1024) == -1) {
                long j3 = this.Y;
                for (int f = j3 == -9223372036854775807L ? 0 : v0g.f(this.X, j3, true); f < arrayList.size(); f++) {
                    a((zye) arrayList.get(f));
                }
                this.z = 4;
            }
        }
        return this.z == 4 ? -1 : 0;
    }

    public final boolean n(vf5 vf5) {
        return true;
    }

    public final void release() {
        if (this.z != 5) {
            this.a.reset();
            this.z = 5;
        }
    }
}
