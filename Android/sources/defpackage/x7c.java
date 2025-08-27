package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: x7c  reason: default package */
public final class x7c implements t28 {
    public long X;
    public q74 Y = b(0);
    public zpf Z;
    public final long a = l28.c.getAndIncrement();
    public final Uri b;
    public final tne c;
    public final d19 o;
    public final xf5 v;
    public boolean v0;
    public final bv1 w;
    public final /* synthetic */ d8c w0;
    public final yl4 x = new yl4(16, false);
    public volatile boolean y;
    public boolean z = true;

    public x7c(d8c d8c, Uri uri, j74 j74, d19 d19, xf5 xf5, bv1 bv1) {
        this.w0 = d8c;
        this.b = uri;
        this.c = new tne(j74);
        this.o = d19;
        this.v = xf5;
        this.w = bv1;
    }

    public final void a() {
        this.y = true;
    }

    public final q74 b(long j) {
        Collections.emptyMap();
        String str = this.w0.z;
        Map map = d8c.X0;
        Uri uri = this.b;
        n79.p(uri, "The uri must be set.");
        return new q74(uri, 0, 1, (byte[]) null, map, j, -1, str, 6, (Object) null);
    }

    public final void load() {
        j74 j74;
        int i;
        int i2 = 0;
        while (i2 == 0 && !this.y) {
            try {
                long j = this.x.b;
                q74 b2 = b(j);
                this.Y = b2;
                long G = this.c.G(b2);
                if (this.y) {
                    if (!(i2 == 1 || this.o.t() == -1)) {
                        this.x.b = this.o.t();
                    }
                    b0h.l(this.c);
                    return;
                }
                if (G != -1) {
                    G += j;
                    d8c d8c = this.w0;
                    d8c.z0.post(new u7c(d8c, 0));
                }
                long j2 = G;
                this.w0.B0 = k77.a(this.c.a.x());
                tne tne = this.c;
                k77 k77 = this.w0.B0;
                if (k77 == null || (i = k77.w) == -1) {
                    j74 = tne;
                } else {
                    j74 = new g77(tne, i, this);
                    d8c d8c2 = this.w0;
                    d8c2.getClass();
                    zpf p = d8c2.p(new b8c(0, true));
                    this.Z = p;
                    p.e(d8c.Y0);
                }
                long j3 = j;
                this.o.B(j74, this.b, this.c.a.x(), j, j2, this.v);
                if (this.w0.B0 != null) {
                    tf5 tf5 = (tf5) this.o.c;
                    if (tf5 != null) {
                        tf5 m = tf5.m();
                        if (m instanceof ku9) {
                            ((ku9) m).A0 = true;
                        }
                    }
                }
                if (this.z) {
                    d19 d19 = this.o;
                    long j4 = this.X;
                    tf5 tf52 = (tf5) d19.c;
                    tf52.getClass();
                    tf52.d(j3, j4);
                    this.z = false;
                }
                while (true) {
                    long j5 = j3;
                    while (i2 == 0 && !this.y) {
                        this.w.a();
                        d19 d192 = this.o;
                        yl4 yl4 = this.x;
                        tf5 tf53 = (tf5) d192.c;
                        tf53.getClass();
                        hf4 hf4 = (hf4) d192.a;
                        hf4.getClass();
                        i2 = tf53.g(hf4, yl4);
                        j3 = this.o.t();
                        if (j3 > this.w0.X + j5) {
                            this.w.c();
                            d8c d8c3 = this.w0;
                            d8c3.z0.post(d8c3.y0);
                        }
                    }
                }
                if (i2 == 1) {
                    i2 = 0;
                } else if (this.o.t() != -1) {
                    this.x.b = this.o.t();
                }
                b0h.l(this.c);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (Throwable th) {
                if (!(i2 == 1 || this.o.t() == -1)) {
                    this.x.b = this.o.t();
                }
                b0h.l(this.c);
                throw th;
            }
        }
    }
}
