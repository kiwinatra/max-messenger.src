package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;

/* renamed from: zia  reason: default package */
public final class zia implements cla, mq4 {
    public final /* synthetic */ int a;
    public final cla b;
    public final zi6 c;
    public mq4 o;

    public /* synthetic */ zia(cla cla, zi6 zi6, int i) {
        this.a = i;
        this.b = cla;
        this.c = zi6;
    }

    public final void b() {
        switch (this.a) {
            case 0:
                mq4 mq4 = this.o;
                qq4 qq4 = qq4.a;
                if (mq4 != qq4) {
                    this.o = qq4;
                    this.b.b();
                    return;
                }
                return;
            default:
                this.b.b();
                return;
        }
    }

    public final void c(mq4 mq4) {
        switch (this.a) {
            case 0:
                if (qq4.g(this.o, mq4)) {
                    this.o = mq4;
                    this.b.c(this);
                    return;
                }
                return;
            default:
                if (qq4.g(this.o, mq4)) {
                    this.o = mq4;
                    this.b.c(this);
                    return;
                }
                return;
        }
    }

    public final void d(Object obj) {
        switch (this.a) {
            case 0:
                if (this.o != qq4.a) {
                    try {
                        for (Object next : (Iterable) this.c.apply(obj)) {
                            try {
                                try {
                                    Objects.requireNonNull(next, "The iterator returned a null value");
                                    this.b.d(next);
                                } catch (Throwable th) {
                                    hd8.Z(th);
                                    this.o.dispose();
                                    onError(th);
                                    return;
                                }
                            } catch (Throwable th2) {
                                hd8.Z(th2);
                                this.o.dispose();
                                onError(th2);
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th3) {
                        hd8.Z(th3);
                        this.o.dispose();
                        onError(th3);
                        return;
                    }
                } else {
                    return;
                }
            default:
                this.b.d(obj);
                return;
        }
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
                this.o.dispose();
                this.o = qq4.a;
                return;
            default:
                this.o.dispose();
                return;
        }
    }

    public final boolean f() {
        switch (this.a) {
            case 0:
                return this.o.f();
            default:
                return this.o.f();
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                mq4 mq4 = this.o;
                qq4 qq4 = qq4.a;
                if (mq4 == qq4) {
                    n54.D(th);
                    return;
                }
                this.o = qq4;
                this.b.onError(th);
                return;
            default:
                cla cla = this.b;
                try {
                    Object apply = this.c.apply(th);
                    if (apply == null) {
                        NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                        nullPointerException.initCause(th);
                        cla.onError(nullPointerException);
                        return;
                    }
                    cla.d(apply);
                    cla.b();
                    return;
                } catch (Throwable th2) {
                    hd8.Z(th2);
                    cla.onError(new CompositeException(th, th2));
                    return;
                }
        }
    }
}
