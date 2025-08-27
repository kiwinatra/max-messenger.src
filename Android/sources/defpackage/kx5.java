package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: kx5  reason: default package */
public final class kx5 implements gx5, mq4 {
    public final gce a;
    public rye b;
    public Collection c;

    public kx5(gce gce, ArrayList arrayList) {
        this.a = gce;
        this.c = arrayList;
    }

    public final void b() {
        this.b = tye.a;
        this.a.a(this.c);
    }

    public final void d(Object obj) {
        this.c.add(obj);
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
        this.c = null;
        this.b = tye.a;
        this.a.onError(th);
    }
}
