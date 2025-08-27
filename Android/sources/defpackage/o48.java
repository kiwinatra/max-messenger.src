package defpackage;

import android.net.Uri;

/* renamed from: o48  reason: default package */
public class o48 implements pqd, oqd {
    public final b58 a;
    public final sqd b;
    public final jbf c;
    public final kc3 o = new Object();
    public final d48 v;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, kc3] */
    public o48(b58 b58, sqd sqd, jbf jbf, d48 d48) {
        this.a = b58;
        this.b = sqd;
        this.c = jbf;
        this.v = d48;
    }

    public final void K(uqd uqd) {
        b();
    }

    public void a() {
        this.o.d();
    }

    public final void b() {
        sqd sqd = this.b;
        d48 d48 = this.v;
        dfb f = sqd.f(d48);
        this.a.B1(d48, dfb.a(f, d48), 0, f != null ? f.v : null);
    }

    public void c() {
        d48 d48 = this.v;
        z68.c("o48", "loadThumbnail with localMediaId = %d", Long.valueOf(d48.b));
        Uri x = o5a.x(d48.c);
        long j = d48.b;
        if (x != null) {
            z68.c("o48", "loadThumbnail: %d, cachedUri is not empty", Long.valueOf(j));
            d(0, x.toString());
            return;
        }
        this.a.B1(d48, (Uri) null, 0, (Uri) null);
        uqd i = this.b.i(d48);
        String str = i != null ? cvg.A(i.d) ? i.a.o : i.d : d48.o;
        mka mka = new mka(2, new h5(11, str));
        jbf jbf = this.c;
        jbf.getClass();
        kbf kbf = (kbf) jbf;
        tbe tbe = new tbe(mka.n(kbf.a()).j(kbf.c()), new nq3(j, str), 3);
        ao1 ao1 = new ao1(3, new g18(1, this, str), new lc5(26, (Object) this));
        tbe.l(ao1);
        this.o.a(ao1);
    }

    public final void d(int i, String str) {
        Uri x = o5a.x(str);
        sqd sqd = this.b;
        d48 d48 = this.v;
        dfb f = sqd.f(d48);
        if (dfb.b(f, d48)) {
            Uri a2 = dfb.a(f, d48);
            if (!a2.getPath().equals(d48.c)) {
                x = a2;
            }
            i = 0;
        }
        this.a.B1(d48, x, i, f != null ? f.v : null);
    }

    public final void k(uqd uqd) {
        d48 d48 = this.v;
        if (d48 != null) {
            String str = d48.c;
            d48 d482 = uqd.a;
            if (str.equals(d482.c)) {
                d(d482.v, cvg.A(uqd.d) ? d482.o : uqd.d);
            }
        }
    }
}
