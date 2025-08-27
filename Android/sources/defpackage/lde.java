package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: lde  reason: default package */
public final class lde extends AtomicReference implements gce {
    public final kde a;
    public final int b;

    public lde(kde kde, int i) {
        this.a = kde;
        this.b = i;
    }

    public final void a(Object obj) {
        kde kde = this.a;
        gce gce = kde.a;
        Object[] objArr = kde.o;
        if (objArr != null) {
            objArr[this.b] = obj;
        }
        if (kde.decrementAndGet() == 0) {
            try {
                Object apply = kde.b.apply(objArr);
                Objects.requireNonNull(apply, "The zipper returned a null value");
                kde.o = null;
                gce.a(apply);
            } catch (Throwable th) {
                hd8.Z(th);
                kde.o = null;
                gce.onError(th);
            }
        }
    }

    public final void c(mq4 mq4) {
        qq4.e(this, mq4);
    }

    public final void onError(Throwable th) {
        this.a.a(th, this.b);
    }
}
