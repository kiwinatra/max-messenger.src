package defpackage;

import java.util.Collection;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: jx5  reason: default package */
public final class jx5 extends rk4 implements gx5 {
    public rye c;

    public final void b() {
        f(this.b);
    }

    public final void cancel() {
        set(4);
        this.b = null;
        this.c.cancel();
    }

    public final void d(Object obj) {
        Collection collection = (Collection) this.b;
        if (collection != null) {
            collection.add(obj);
        }
    }

    public final void e(rye rye) {
        if (tye.e(this.c, rye)) {
            this.c = rye;
            this.a.e(this);
            rye.g(LongCompanionObject.MAX_VALUE);
        }
    }

    public final void onError(Throwable th) {
        this.b = null;
        this.a.onError(th);
    }
}
