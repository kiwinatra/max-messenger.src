package defpackage;

import java.io.File;

/* renamed from: sk5  reason: default package */
public final class sk5 extends pz {
    public final rl c;
    public final uk5 d;
    public final sv0 e;
    public wx f;
    public long g;
    public long h;

    public sk5(l20 l20, rl rlVar, uk5 uk5, sv0 sv0) {
        super(l20);
        this.c = rlVar;
        this.d = uk5;
        this.e = sv0;
    }

    public final void a() {
        this.g = 0;
        this.h = 0;
        b(this.f, new Exception("cancelled"));
        try {
            this.e.f(this);
        } catch (Throwable unused) {
        }
    }

    public final void c(wx wxVar, File file) {
        super.c(wxVar, file);
        try {
            this.e.f(this);
        } catch (Throwable unused) {
        }
    }

    public final jha d() {
        jha d2 = super.d();
        if (d2 != null) {
            return d2;
        }
        wx wxVar = this.f;
        if (wxVar != null) {
            return wxVar;
        }
        this.f = new wx();
        this.e.d(this);
        l20 l20 = this.a;
        s10 s10 = l20.j;
        this.g = ((jna) this.c).B(s10.c, l20.q, s10.a, 0);
        return this.f;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [odf, java.lang.Object] */
    @oye
    public void onEvent(cm5 cm5) {
        if (this.g == cm5.a) {
            ? obj = new Object();
            l20 l20 = this.a;
            obj.b = l20.q;
            s10 s10 = l20.j;
            obj.j = s10.a;
            obj.k = s10.c;
            obj.g = cm5.b;
            obj.h = true;
            pdf pdf = new pdf(obj);
            this.h = pdf.o;
            this.d.a(pdf);
        }
    }

    @oye
    public void onEvent(hj0 hj0) {
        if (this.g == hj0.a) {
            b(this.f, new Exception(hj0.b.b));
            try {
                this.e.f(this);
            } catch (Throwable unused) {
            }
        }
    }

    @oye
    public void onEvent(vr4 vr4) {
        if (this.h == vr4.a) {
            b(this.f, new Exception("DownloadErrorEvent"));
            try {
                this.e.f(this);
            } catch (Throwable unused) {
            }
        }
    }

    @oye
    public void onEvent(tr4 tr4) {
        if (this.h == tr4.a) {
            c(this.f, new File(tr4.c));
        }
    }
}
