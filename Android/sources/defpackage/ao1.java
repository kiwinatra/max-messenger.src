package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ao1  reason: default package */
public final class ao1 extends AtomicReference implements ya3, mq4, cla, gce, pi8 {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public /* synthetic */ ao1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public void a(Object obj) {
        switch (this.a) {
            case 3:
                lazySet(qq4.a);
                try {
                    ((qk3) this.b).accept(obj);
                    return;
                } catch (Throwable th) {
                    hd8.Z(th);
                    n54.D(th);
                    return;
                }
            case 4:
                ((pi8) this.c).a(obj);
                return;
            case 5:
                ((pi8) this.b).a(obj);
                return;
            default:
                ((gce) this.b).a(obj);
                return;
        }
    }

    public void b() {
        switch (this.a) {
            case 0:
                try {
                    ((x6) this.c).run();
                } catch (Throwable th) {
                    hd8.Z(th);
                    n54.D(th);
                }
                lazySet(qq4.a);
                return;
            case 1:
                ((ma3) this.c).j(new dm4(8, (Object) this, (Object) (ya3) this.b));
                return;
            case 2:
                oka oka = (oka) this.c;
                if (oka == null) {
                    ((cla) this.b).b();
                    return;
                }
                this.c = null;
                oka.a(this);
                return;
            case 4:
                ((pi8) this.c).b();
                return;
            case 5:
                mq4 mq4 = (mq4) get();
                if (mq4 != qq4.a && compareAndSet(mq4, (Object) null)) {
                    ((ti8) this.c).a(new zqd(16, (pi8) this.b, this));
                    return;
                }
                return;
            default:
                ((cla) this.b).b();
                return;
        }
    }

    public final void c(mq4 mq4) {
        switch (this.a) {
            case 0:
                qq4.e(this, mq4);
                return;
            case 1:
                if (qq4.e(this, mq4)) {
                    ((ya3) this.b).c(this);
                    return;
                }
                return;
            case 2:
                qq4.c(this, mq4);
                return;
            case 3:
                qq4.e(this, mq4);
                return;
            case 4:
                qq4.e(this, mq4);
                return;
            case 5:
                if (qq4.e(this, mq4)) {
                    ((pi8) this.b).c(this);
                    return;
                }
                return;
            case 6:
                qq4.e((AtomicReference) this.c, mq4);
                return;
            default:
                if (qq4.g((mq4) this.c, mq4)) {
                    this.c = mq4;
                    ((gce) this.b).c(this);
                    return;
                }
                return;
        }
    }

    public void d(Object obj) {
        switch (this.a) {
            case 2:
                ((cla) this.b).d(obj);
                return;
            default:
                ((cla) this.b).d(obj);
                return;
        }
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
                qq4.a(this);
                return;
            case 1:
                qq4.a(this);
                return;
            case 2:
                qq4.a(this);
                return;
            case 3:
                qq4.a(this);
                return;
            case 4:
                qq4.a(this);
                mw1 mw1 = (mw1) this.b;
                mw1.getClass();
                qq4.a(mw1);
                return;
            case 5:
                qq4.a(this);
                return;
            case 6:
                qq4.a((AtomicReference) this.c);
                qq4.a(this);
                return;
            default:
                x6 x6Var = (x6) getAndSet((Object) null);
                if (x6Var != null) {
                    try {
                        x6Var.run();
                    } catch (Throwable th) {
                        hd8.Z(th);
                        n54.D(th);
                    }
                    ((mq4) this.c).dispose();
                    return;
                }
                return;
        }
    }

    public final boolean f() {
        switch (this.a) {
            case 0:
                return get() == qq4.a;
            case 1:
                return qq4.b((mq4) get());
            case 2:
                return qq4.b((mq4) get());
            case 3:
                return get() == qq4.a;
            case 4:
                return qq4.b((mq4) get());
            case 5:
                return qq4.b((mq4) get());
            case 6:
                return qq4.b((mq4) get());
            default:
                return ((mq4) this.c).f();
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                try {
                    ((qk3) this.b).accept(th);
                } catch (Throwable th2) {
                    hd8.Z(th2);
                    n54.D(th2);
                }
                lazySet(qq4.a);
                return;
            case 1:
                ((ya3) this.b).onError(th);
                return;
            case 2:
                ((cla) this.b).onError(th);
                return;
            case 3:
                lazySet(qq4.a);
                try {
                    ((qk3) this.c).accept(th);
                    return;
                } catch (Throwable th3) {
                    hd8.Z(th3);
                    n54.D(new CompositeException(th, th3));
                    return;
                }
            case 4:
                ((pi8) this.c).onError(th);
                return;
            case 5:
                ((pi8) this.b).onError(th);
                return;
            case 6:
                ((cla) this.b).onError(th);
                return;
            default:
                ((gce) this.b).onError(th);
                return;
        }
    }

    public ao1(cla cla) {
        this.a = 6;
        this.b = cla;
        this.c = new AtomicReference();
    }

    public ao1(gce gce, x6 x6Var) {
        this.a = 7;
        this.b = gce;
        lazySet(x6Var);
    }

    public ao1(pi8 pi8) {
        this.a = 4;
        this.c = pi8;
        this.b = new mw1(2);
    }
}
