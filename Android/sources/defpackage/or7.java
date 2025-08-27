package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: or7  reason: default package */
public final class or7 extends AtomicReference implements cla, mq4 {
    public final qk3 a;
    public final qk3 b;
    public final x6 c;
    public final qk3 o;

    public or7(qk3 qk3, qk3 qk32, x6 x6Var) {
        gga gga = m58.f;
        this.a = qk3;
        this.b = qk32;
        this.c = x6Var;
        this.o = gga;
    }

    public final void b() {
        if (!f()) {
            lazySet(qq4.a);
            try {
                this.c.run();
            } catch (Throwable th) {
                hd8.Z(th);
                n54.D(th);
            }
        }
    }

    public final void c(mq4 mq4) {
        if (qq4.e(this, mq4)) {
            try {
                this.o.accept(this);
            } catch (Throwable th) {
                hd8.Z(th);
                mq4.dispose();
                onError(th);
            }
        }
    }

    public final void d(Object obj) {
        if (!f()) {
            try {
                this.a.accept(obj);
            } catch (Throwable th) {
                hd8.Z(th);
                ((mq4) get()).dispose();
                onError(th);
            }
        }
    }

    public final void dispose() {
        qq4.a(this);
    }

    public final boolean f() {
        return get() == qq4.a;
    }

    public final void onError(Throwable th) {
        if (!f()) {
            lazySet(qq4.a);
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
