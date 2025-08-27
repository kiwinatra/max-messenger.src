package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: w7c  reason: default package */
public final class w7c implements s28 {
    public long X;
    public p74 Y = b(0);
    public long Z = -1;
    public final long a = k28.h.getAndIncrement();
    public final Uri b;
    public final sne c;
    public final l15 o;
    public final wf5 v;
    public icd v0;
    public final bv1 w;
    public boolean w0;
    public final yl4 x = new yl4(15, false);
    public final /* synthetic */ c8c x0;
    public volatile boolean y;
    public boolean z = true;

    public w7c(c8c c8c, Uri uri, h74 h74, l15 l15, wf5 wf5, bv1 bv1) {
        this.x0 = c8c;
        this.b = uri;
        this.c = new sne(h74);
        this.o = l15;
        this.v = wf5;
        this.w = bv1;
    }

    public final void a() {
        this.y = true;
    }

    public final p74 b(long j) {
        Collections.emptyMap();
        String str = this.x0.z;
        Map map = c8c.V0;
        Uri uri = this.b;
        if (uri != null) {
            return new p74(uri, 0, 1, (byte[]) null, map, j, -1, str, 6, (Object) null);
        }
        throw new IllegalStateException("The uri must be set.");
    }

    public final void load() {
        h74 h74;
        int i;
        int i2 = 0;
        while (i2 == 0 && !this.y) {
            try {
                long j = this.x.b;
                p74 b2 = b(j);
                this.Y = b2;
                long N = this.c.N(b2);
                this.Z = N;
                if (N != -1) {
                    this.Z = N + j;
                }
                this.x0.A0 = j77.a(this.c.a.x());
                sne sne = this.c;
                j77 j77 = this.x0.A0;
                if (j77 == null || (i = j77.w) == -1) {
                    h74 = sne;
                } else {
                    h74 = new f77(sne, i, this);
                    c8c c8c = this.x0;
                    c8c.getClass();
                    icd l = c8c.l(new a8c(0, true));
                    this.v0 = l;
                    l.d(c8c.W0);
                }
                long j2 = j;
                this.o.y(h74, this.b, this.c.a.x(), j, this.Z, this.v);
                if (this.x0.A0 != null) {
                    sf5 sf5 = (sf5) this.o.b;
                    if (sf5 instanceof ju9) {
                        ((ju9) sf5).r = true;
                    }
                }
                if (this.z) {
                    l15 l15 = this.o;
                    long j3 = this.X;
                    sf5 sf52 = (sf5) l15.b;
                    sf52.getClass();
                    sf52.d(j2, j3);
                    this.z = false;
                }
                while (true) {
                    long j4 = j2;
                    while (i2 == 0 && !this.y) {
                        this.w.a();
                        l15 l152 = this.o;
                        yl4 yl4 = this.x;
                        sf5 sf53 = (sf5) l152.b;
                        sf53.getClass();
                        gf4 gf4 = (gf4) l152.c;
                        gf4.getClass();
                        i2 = sf53.i(gf4, yl4);
                        j2 = this.o.n();
                        if (j2 > this.x0.X + j4) {
                            bv1 bv1 = this.w;
                            synchronized (bv1) {
                                bv1.b = false;
                            }
                            c8c c8c2 = this.x0;
                            c8c2.y0.post(c8c2.x0);
                        }
                    }
                }
                if (i2 == 1) {
                    i2 = 0;
                } else if (this.o.n() != -1) {
                    this.x.b = this.o.n();
                }
                vzg.r(this.c);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (Throwable th) {
                if (!(i2 == 1 || this.o.n() == -1)) {
                    this.x.b = this.o.n();
                }
                vzg.r(this.c);
                throw th;
            }
        }
    }
}
