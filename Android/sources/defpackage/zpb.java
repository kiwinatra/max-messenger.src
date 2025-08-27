package defpackage;

import android.app.Application;
import android.view.Surface;
import kotlin.Lazy;

/* renamed from: zpb  reason: default package */
public final class zpb implements ipb {
    public final Application a;
    public final m95 b;
    public final lb5 c;
    public final Lazy d;
    public final String e = zpb.class.getName();
    public final ws f = new ws(0);

    public zpb(Application application, m95 m95, lb5 lb5, Lazy lazy) {
        this.a = application;
        this.b = m95;
        this.c = lb5;
        this.d = lazy;
    }

    public final void a(n7g n7g) {
        String str = this.e;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, str, "Players pool. Free player, " + n7g, (Throwable) null);
        }
        n7g.pause();
        n7g.L0((Surface) null);
        this.f.add(n7g);
    }

    public final n7g get() {
        if (this.f.isEmpty()) {
            z68.c(this.e, "Players pool. Pool is empty create new player", new Object[0]);
            return new n7g(this.a, this.b, this.c, this.d);
        }
        ws wsVar = this.f;
        n7g n7g = (n7g) wsVar.f(wsVar.c - 1);
        String str = this.e;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, str, "Players pool. Pool has player, " + n7g, (Throwable) null);
        }
        return n7g;
    }
}
