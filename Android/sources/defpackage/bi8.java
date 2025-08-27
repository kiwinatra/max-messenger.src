package defpackage;

import java.util.concurrent.Callable;

/* renamed from: bi8  reason: default package */
public final class bi8 extends nh8 implements t2f {
    public final Callable a;

    public bi8(Callable callable) {
        this.a = callable;
    }

    public final void g(pi8 pi8) {
        o7 o7Var = new o7(1, m58.d);
        pi8.c(o7Var);
        if (!o7Var.f()) {
            try {
                Object call = this.a.call();
                if (o7Var.f()) {
                    return;
                }
                if (call == null) {
                    pi8.b();
                } else {
                    pi8.a(call);
                }
            } catch (Throwable th) {
                hd8.Z(th);
                if (!o7Var.f()) {
                    pi8.onError(th);
                } else {
                    n54.D(th);
                }
            }
        }
    }

    public final Object get() {
        return this.a.call();
    }
}
