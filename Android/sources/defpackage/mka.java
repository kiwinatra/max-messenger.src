package defpackage;

import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: mka  reason: default package */
public final class mka extends lbe {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ mka(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void m(gce gce) {
        switch (this.a) {
            case 0:
                ((oka) this.b).a(new nha(gce));
                return;
            case 1:
                pbe pbe = new pbe(gce);
                gce.c(pbe);
                try {
                    ((ice) this.b).h(pbe);
                    return;
                } catch (Throwable th) {
                    hd8.Z(th);
                    pbe.onError(th);
                    return;
                }
            case 2:
                o7 o7Var = new o7(1, m58.d);
                gce.c(o7Var);
                if (!o7Var.f()) {
                    try {
                        Object call = ((Callable) this.b).call();
                        Objects.requireNonNull(call, "The callable returned a null value");
                        if (!o7Var.f()) {
                            gce.a(call);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        hd8.Z(th2);
                        if (!o7Var.f()) {
                            gce.onError(th2);
                            return;
                        } else {
                            n54.D(th2);
                            return;
                        }
                    }
                } else {
                    return;
                }
            default:
                gce.c(p45.a);
                gce.a(this.b);
                return;
        }
    }
}
