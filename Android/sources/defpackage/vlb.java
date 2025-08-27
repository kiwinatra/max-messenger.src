package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.Lazy;

/* renamed from: vlb  reason: default package */
public final class vlb {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public volatile mq4 f;

    public vlb(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy5;
    }

    public final void a() {
        mq4 mq4;
        z68.c("vlb", "schedulePing", new Object[0]);
        mq4 mq42 = this.f;
        if (!(mq42 == null || mq42.f() || (mq4 = this.f) == null)) {
            mq4.dispose();
        }
        this.f = ((lfd) this.e.getValue()).b().b(new o99(17, this), 29000, TimeUnit.MILLISECONDS);
    }

    public final void b() {
        z68.c("vlb", "startInteractivePings", new Object[0]);
        if (((doa) this.c.getValue()).e()) {
            ((jna) ((rl) this.a.getValue())).O(true);
        }
        a();
    }
}
