package defpackage;

import java.util.Objects;

/* renamed from: gzf  reason: default package */
public final /* synthetic */ class gzf implements za3, ri8 {
    public final /* synthetic */ izf a;
    public final /* synthetic */ kxf b;

    public /* synthetic */ gzf(izf izf, kxf kxf) {
        this.a = izf;
        this.b = kxf;
    }

    public void b(pa3 pa3) {
        izf izf = this.a;
        kxf kxf = this.b;
        izf.getClass();
        z68.c("izf", "removeUpload: upload=" + kxf, new Object[0]);
        synchronized (izf) {
            izf.a.c(kxf).f(((fzf) izf.b.getValue()).c(kxf)).a();
        }
        if (!pa3.f()) {
            pa3.b();
        }
    }

    public void e(rh8 rh8) {
        bxf bxf;
        izf izf = this.a;
        kxf kxf = this.b;
        izf.getClass();
        z68.c("izf", "getUpload: upload=" + kxf, new Object[0]);
        synchronized (izf) {
            try {
                bxf = (bxf) izf.a.d(kxf).b();
            } catch (Exception unused) {
                bxf = null;
            }
        }
        if (bxf == null) {
            try {
                nh8 d = ((fzf) izf.b.getValue()).d(kxf);
                kzf kzf = izf.a;
                Objects.requireNonNull(kzf);
                bxf = (bxf) new si8(d, new jrf(6, (Object) kzf), m58.f, m58.e).b();
            } catch (Exception unused2) {
            }
        }
        if (rh8.f()) {
            return;
        }
        if (bxf == null) {
            rh8.b();
        } else {
            rh8.a(bxf);
        }
    }
}
