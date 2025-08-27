package defpackage;

import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.reflect.KProperty;

/* renamed from: jqg  reason: default package */
public final class jqg {
    public static final /* synthetic */ int h = 0;
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;

    public jqg(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy5;
        this.f = lazy6;
        this.g = lazy7;
    }

    public final void a(gud gud) {
        ExecutorService k;
        Lazy lazy = this.a;
        Lazy lazy2 = this.f;
        iqg iqg = new iqg(gud, lazy, (m95) this.b.getValue(), lazy2);
        boolean z = gud instanceof rvd;
        Lazy lazy3 = this.c;
        if (z) {
            aua aua = (aua) lazy3.getValue();
            aua.getClass();
            KProperty kProperty = aua.o[5];
            aua.d(aua.k).execute(iqg);
        } else if (!gud.x() || (k = gud.k((aua) ((hud) lazy2.getValue()).i0.getValue(), ((fn4) ((hud) lazy2.getValue()).d.getValue()).b())) == null) {
            fud[] fudArr = fud.a;
            z68.c("WorkerService", "normal executor will run " + gud, new Object[0]);
            ((aua) lazy3.getValue()).b().execute(iqg);
        } else {
            k.execute(iqg);
        }
    }

    public final long b(gud gud) {
        hdb hdb = (hdb) gud;
        ((eef) this.a.getValue()).g(hdb, 0, 0);
        rvd.A(this);
        return hdb.getId();
    }
}
