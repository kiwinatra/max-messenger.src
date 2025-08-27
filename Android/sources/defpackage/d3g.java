package defpackage;

import java.io.File;
import java.util.Map;

/* renamed from: d3g  reason: default package */
public final class d3g extends pz {
    public final rl c;
    public final x23 d;
    public final uk5 e;
    public final sv0 f;
    public wx g;
    public long h;
    public long i;

    public d3g(l20 l20, rl rlVar, x23 x23, uk5 uk5, sv0 sv0) {
        super(l20);
        this.c = rlVar;
        this.d = x23;
        this.e = uk5;
        this.f = sv0;
    }

    public final void a() {
        this.h = 0;
        this.i = 0;
        b(this.g, new Throwable("cancelled"));
        e();
    }

    public final void c(wx wxVar, File file) {
        super.c(wxVar, file);
        e();
    }

    public final jha d() {
        jha d2 = super.d();
        if (d2 != null) {
            return d2;
        }
        wx wxVar = this.g;
        if (wxVar != null) {
            return wxVar;
        }
        this.g = new wx();
        this.f.d(this);
        l20 l20 = this.a;
        k20 k20 = l20.d;
        this.h = ((jna) this.c).W(false, k20.a, 0, 0, 0, l20.q, false, k20.l);
        return this.g;
    }

    public final void e() {
        try {
            this.f.f(this);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [odf, java.lang.Object] */
    @oye
    public void onEvent(l7g l7g) {
        if (this.h == l7g.a) {
            Map map = l7g.b;
            if (map == null) {
                b(this.g, new Exception("uris empty"));
                e();
            } else if (j4b.y(map) != null) {
                String y = j4b.y(map);
                if (cvg.A(y)) {
                    b(this.g, new Exception("download url not found"));
                    e();
                    return;
                }
                this.i = ((qjd) this.d).n();
                ? obj = new Object();
                obj.b = this.a.q;
                obj.c = l7g.c;
                obj.g = y;
                obj.h = true;
                obj.n = true;
                this.e.a(new pdf(obj));
            } else {
                b(this.g, new Exception("download url not found"));
                e();
            }
        }
    }

    @oye
    public void onEvent(hj0 hj0) {
        if (this.h == hj0.a) {
            b(this.g, new Exception(hj0.b.b));
            e();
        }
    }

    @oye
    public void onEvent(vr4 vr4) {
        if (this.i == vr4.a) {
            b(this.g, new Exception("DownloadErrorEvent"));
            e();
        }
    }

    @oye
    public void onEvent(tr4 tr4) {
        if (this.i == tr4.a) {
            c(this.g, new File(tr4.c));
        }
    }
}
