package defpackage;

import java.util.concurrent.Callable;

/* renamed from: aja  reason: default package */
public final class aja extends jha implements t2f {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ aja(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object get() {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                ((x6) obj).run();
                return null;
            default:
                Object call = ((Callable) obj).call();
                if (call != null) {
                    o95 o95 = p95.a;
                    return call;
                }
                throw p95.b("The Callable returned a null value.");
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [mq4, java.lang.Object, rw1] */
    public final void w(cla cla) {
        switch (this.a) {
            case 0:
                ? obj = new Object();
                cla.c(obj);
                if (!obj.a) {
                    try {
                        ((x6) this.b).run();
                        if (!obj.a) {
                            cla.b();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        hd8.Z(th);
                        if (!obj.a) {
                            cla.onError(th);
                            return;
                        } else {
                            n54.D(th);
                            return;
                        }
                    }
                } else {
                    return;
                }
            default:
                qk4 qk4 = new qk4(cla);
                cla.c(qk4);
                if (!qk4.f()) {
                    try {
                        Object call = ((Callable) this.b).call();
                        if (call != null) {
                            o95 o95 = p95.a;
                            qk4.e(call);
                            return;
                        }
                        throw p95.b("Callable returned a null value.");
                    } catch (Throwable th2) {
                        hd8.Z(th2);
                        if (!qk4.f()) {
                            cla.onError(th2);
                            return;
                        } else {
                            n54.D(th2);
                            return;
                        }
                    }
                } else {
                    return;
                }
        }
    }
}
