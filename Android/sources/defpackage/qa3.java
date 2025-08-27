package defpackage;

import java.util.concurrent.Callable;

/* renamed from: qa3  reason: default package */
public final class qa3 extends ma3 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ qa3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void k(ya3 ya3) {
        switch (this.a) {
            case 0:
                pa3 pa3 = new pa3(0, ya3);
                ya3.c(pa3);
                try {
                    ((za3) this.b).b(pa3);
                    return;
                } catch (Throwable th) {
                    hd8.Z(th);
                    if (!pa3.a(th)) {
                        n54.D(th);
                        return;
                    }
                    return;
                }
            case 1:
                o7 o7Var = new o7(1, m58.d);
                ya3.c(o7Var);
                if (!o7Var.f()) {
                    try {
                        ((x6) this.b).run();
                        if (!o7Var.f()) {
                            ya3.b();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        hd8.Z(th2);
                        if (!o7Var.f()) {
                            ya3.onError(th2);
                            return;
                        } else {
                            n54.D(th2);
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 2:
                o7 o7Var2 = new o7(1, m58.d);
                ya3.c(o7Var2);
                try {
                    ((Callable) this.b).call();
                    if (!o7Var2.f()) {
                        ya3.b();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    hd8.Z(th3);
                    if (!o7Var2.f()) {
                        ya3.onError(th3);
                        return;
                    } else {
                        n54.D(th3);
                        return;
                    }
                }
            default:
                ((lbe) this.b).l(new ch2(3, ya3));
                return;
        }
    }
}
