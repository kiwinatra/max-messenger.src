package defpackage;

import java.io.File;

/* renamed from: pz  reason: default package */
public abstract class pz {
    public final l20 a;
    public volatile boolean b;

    public pz(l20 l20) {
        this.a = l20;
    }

    public abstract void a();

    public final void b(wx wxVar, Throwable th) {
        if (wxVar != null) {
            wxVar.onError(th);
        }
        this.b = true;
    }

    public void c(wx wxVar, File file) {
        if (!this.b) {
            wxVar.d(file);
            wxVar.b();
        }
    }

    public jha d() {
        String str = this.a.r;
        if (cjf.p(str)) {
            return jha.q(new File(str));
        }
        return null;
    }
}
