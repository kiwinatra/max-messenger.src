package defpackage;

import java.io.File;

/* renamed from: w20  reason: default package */
public final class w20 extends pz {
    public final uk5 c;
    public final sv0 d;
    public wx e;
    public volatile long f;

    public w20(l20 l20, uk5 uk5, sv0 sv0) {
        super(l20);
        this.c = uk5;
        this.d = sv0;
    }

    public final void a() {
        this.f = 0;
        b(this.e, new Exception("cancelled"));
        try {
            this.d.f(this);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [odf, java.lang.Object] */
    public final jha d() {
        jha d2 = super.d();
        if (d2 != null) {
            return d2;
        }
        wx wxVar = this.e;
        if (wxVar != null) {
            return wxVar;
        }
        this.e = new wx();
        this.d.d(this);
        ? obj = new Object();
        l20 l20 = this.a;
        obj.b = l20.q;
        i10 i10 = l20.e;
        obj.d = i10.a;
        obj.g = i10.b;
        obj.h = true;
        pdf pdf = new pdf(obj);
        this.f = pdf.o;
        this.c.a(pdf);
        return this.e;
    }

    @oye
    public void onEvent(vr4 vr4) {
        if (this.f == vr4.a) {
            b(this.e, new Exception("DownloadErrorEvent"));
            try {
                this.d.f(this);
            } catch (Throwable unused) {
            }
        }
    }

    @oye
    public void onEvent(tr4 tr4) {
        if (this.f == tr4.a) {
            this.e.d(new File(tr4.c));
            this.e.b();
            try {
                this.d.f(this);
            } catch (Throwable unused) {
            }
        }
    }
}
