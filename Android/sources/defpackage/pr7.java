package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: pr7  reason: default package */
public final class pr7 extends AtomicReference implements gx5, rye, mq4 {
    public final qk3 a;
    public final qk3 b;
    public final x6 c;
    public final qk3 o;

    public pr7(ad8 ad8, yc8 yc8) {
        dj6 dj6 = m58.e;
        rw5 rw5 = rw5.a;
        this.a = ad8;
        this.b = yc8;
        this.c = dj6;
        this.o = rw5;
    }

    public final void b() {
        Object obj = get();
        tye tye = tye.a;
        if (obj != tye) {
            lazySet(tye);
            try {
                this.c.run();
            } catch (Throwable th) {
                hd8.Z(th);
                n54.D(th);
            }
        }
    }

    public final void cancel() {
        tye.a(this);
    }

    public final void d(Object obj) {
        if (!f()) {
            try {
                this.a.accept(obj);
            } catch (Throwable th) {
                hd8.Z(th);
                ((rye) get()).cancel();
                onError(th);
            }
        }
    }

    public final void dispose() {
        tye.a(this);
    }

    public final void e(rye rye) {
        if (tye.c(this, rye)) {
            try {
                this.o.accept(this);
            } catch (Throwable th) {
                hd8.Z(th);
                rye.cancel();
                onError(th);
            }
        }
    }

    public final boolean f() {
        return get() == tye.a;
    }

    public final void g(long j) {
        ((rye) get()).g(j);
    }

    public final void onError(Throwable th) {
        Object obj = get();
        tye tye = tye.a;
        if (obj != tye) {
            lazySet(tye);
            try {
                this.b.accept(th);
            } catch (Throwable th2) {
                hd8.Z(th2);
                n54.D(new CompositeException(th, th2));
            }
        } else {
            n54.D(th);
        }
    }
}
