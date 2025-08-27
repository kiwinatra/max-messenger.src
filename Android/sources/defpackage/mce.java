package defpackage;

import android.app.Application;
import android.view.Surface;
import kotlin.Lazy;

/* renamed from: mce  reason: default package */
public final class mce implements ipb {
    public final Application a;
    public final m95 b;
    public final lb5 c;
    public final Lazy d;
    public final String e = mce.class.getName();
    public final q3d f = new q3d(new lce(0, this));

    public mce(Application application, m95 m95, lb5 lb5, Lazy lazy) {
        this.a = application;
        this.b = m95;
        this.c = lb5;
        this.d = lazy;
    }

    public final void a(n7g n7g) {
        z68.c(this.e, "Single player handler. Free player", new Object[0]);
        n7g.pause();
        n7g.L0((Surface) null);
    }

    public final n7g get() {
        String str = this.e;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, str, i2a.i("Single player handler. Player exist: ", this.f.isInitialized()), (Throwable) null);
        }
        return (n7g) this.f.getValue();
    }
}
