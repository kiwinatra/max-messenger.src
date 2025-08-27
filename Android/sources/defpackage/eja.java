package defpackage;

import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: eja  reason: default package */
public final class eja implements gx5, mq4 {
    public final cla a;
    public rye b;

    public eja(cla cla) {
        this.a = cla;
    }

    public final void b() {
        this.a.b();
    }

    public final void d(Object obj) {
        this.a.d(obj);
    }

    public final void dispose() {
        this.b.cancel();
        this.b = tye.a;
    }

    public final void e(rye rye) {
        if (tye.e(this.b, rye)) {
            this.b = rye;
            this.a.c(this);
            rye.g(LongCompanionObject.MAX_VALUE);
        }
    }

    public final boolean f() {
        return this.b == tye.a;
    }

    public final void onError(Throwable th) {
        this.a.onError(th);
    }
}
