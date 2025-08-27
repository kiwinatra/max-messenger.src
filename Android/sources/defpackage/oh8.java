package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: oh8  reason: default package */
public final class oh8 extends AtomicReference implements pi8, mq4 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;
    public Object o;

    public oh8(qk3 qk3, qk3 qk32, x6 x6Var) {
        this.b = qk3;
        this.c = qk32;
        this.o = x6Var;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                lazySet(qq4.a);
                try {
                    ((qk3) this.b).accept(obj);
                    return;
                } catch (Throwable th) {
                    hd8.Z(th);
                    n54.D(th);
                    return;
                }
            default:
                try {
                    Object apply = ((zi6) this.c).apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                    ti8 ti8 = (ti8) apply;
                    if (!f()) {
                        ti8.a(new ch2(15, this));
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    hd8.Z(th2);
                    ((pi8) this.b).onError(th2);
                    return;
                }
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                lazySet(qq4.a);
                try {
                    ((x6) this.o).run();
                    return;
                } catch (Throwable th) {
                    hd8.Z(th);
                    n54.D(th);
                    return;
                }
            default:
                ((pi8) this.b).b();
                return;
        }
    }

    public final void c(mq4 mq4) {
        switch (this.a) {
            case 0:
                qq4.e(this, mq4);
                return;
            default:
                if (qq4.g((mq4) this.o, mq4)) {
                    this.o = mq4;
                    ((pi8) this.b).c(this);
                    return;
                }
                return;
        }
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
                qq4.a(this);
                return;
            default:
                qq4.a(this);
                ((mq4) this.o).dispose();
                return;
        }
    }

    public final boolean f() {
        switch (this.a) {
            case 0:
                return qq4.b((mq4) get());
            default:
                return qq4.b((mq4) get());
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                lazySet(qq4.a);
                try {
                    ((qk3) this.c).accept(th);
                    return;
                } catch (Throwable th2) {
                    hd8.Z(th2);
                    n54.D(new CompositeException(th, th2));
                    return;
                }
            default:
                ((pi8) this.b).onError(th);
                return;
        }
    }

    public oh8(pi8 pi8, zi6 zi6) {
        this.b = pi8;
        this.c = zi6;
    }
}
