package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: ab3  reason: default package */
public final class ab3 implements ya3, mq4, pi8, cla, gce {
    public final /* synthetic */ int a;
    public mq4 b;
    public final Object c;
    public Object o;

    public /* synthetic */ ab3(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
    }

    public void a(Object obj) {
        switch (this.a) {
            case 1:
                pi8 pi8 = (pi8) this.c;
                try {
                    Object apply = ((zi6) this.o).apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null item");
                    pi8.a(apply);
                    return;
                } catch (Throwable th) {
                    hd8.Z(th);
                    pi8.onError(th);
                    return;
                }
            case 2:
                mq4 mq4 = this.b;
                qq4 qq4 = qq4.a;
                if (mq4 != qq4) {
                    try {
                        ((si8) this.o).b.accept(obj);
                        this.b = qq4;
                        ((pi8) this.c).a(obj);
                        e();
                        return;
                    } catch (Throwable th2) {
                        hd8.Z(th2);
                        g(th2);
                        return;
                    }
                } else {
                    return;
                }
            case 3:
                this.b = qq4.a;
                ((gce) this.c).a(obj);
                return;
            case 6:
                ((gce) this.c).a(obj);
                try {
                    ((qk3) this.o).accept(obj);
                    return;
                } catch (Throwable th3) {
                    hd8.Z(th3);
                    n54.D(th3);
                    return;
                }
            default:
                ((gce) this.c).a(obj);
                try {
                    ((x6) this.o).run();
                    return;
                } catch (Throwable th4) {
                    hd8.Z(th4);
                    n54.D(th4);
                    return;
                }
        }
    }

    public void b() {
        switch (this.a) {
            case 0:
                ya3 ya3 = (ya3) this.c;
                bb3 bb3 = (bb3) this.o;
                if (this.b != qq4.a) {
                    try {
                        bb3.o.run();
                        bb3.v.run();
                        ya3.b();
                        try {
                            bb3.w.run();
                            return;
                        } catch (Throwable th) {
                            hd8.Z(th);
                            n54.D(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        hd8.Z(th2);
                        ya3.onError(th2);
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                ((pi8) this.c).b();
                return;
            case 2:
                mq4 mq4 = this.b;
                qq4 qq4 = qq4.a;
                if (mq4 != qq4) {
                    try {
                        ((si8) this.o).o.run();
                        this.b = qq4;
                        ((pi8) this.c).b();
                        e();
                        return;
                    } catch (Throwable th3) {
                        hd8.Z(th3);
                        g(th3);
                        return;
                    }
                } else {
                    return;
                }
            case 3:
                this.b = qq4.a;
                gce gce = (gce) this.c;
                Object obj = this.o;
                if (obj != null) {
                    gce.a(obj);
                    return;
                } else {
                    gce.onError(new NoSuchElementException("The MaybeSource is empty"));
                    return;
                }
            case 4:
                this.o = null;
                cla cla = (cla) this.c;
                cla.d((Collection) this.o);
                cla.b();
                return;
            default:
                this.o = null;
                ((gce) this.c).a((Collection) this.o);
                return;
        }
    }

    public final void c(mq4 mq4) {
        switch (this.a) {
            case 0:
                ya3 ya3 = (ya3) this.c;
                try {
                    ((bb3) this.o).b.accept(mq4);
                    if (qq4.g(this.b, mq4)) {
                        this.b = mq4;
                        ya3.c(this);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    hd8.Z(th);
                    mq4.dispose();
                    this.b = qq4.a;
                    ya3.c(p45.a);
                    ya3.onError(th);
                    return;
                }
            case 1:
                if (qq4.g(this.b, mq4)) {
                    this.b = mq4;
                    ((pi8) this.c).c(this);
                    return;
                }
                return;
            case 2:
                pi8 pi8 = (pi8) this.c;
                if (qq4.g(this.b, mq4)) {
                    try {
                        ((si8) this.o).getClass();
                        this.b = mq4;
                        pi8.c(this);
                        return;
                    } catch (Throwable th2) {
                        hd8.Z(th2);
                        mq4.dispose();
                        this.b = qq4.a;
                        pi8.c(p45.a);
                        pi8.onError(th2);
                        return;
                    }
                } else {
                    return;
                }
            case 3:
                if (qq4.g(this.b, mq4)) {
                    this.b = mq4;
                    ((gce) this.c).c(this);
                    return;
                }
                return;
            case 4:
                if (qq4.g(this.b, mq4)) {
                    this.b = mq4;
                    ((cla) this.c).c(this);
                    return;
                }
                return;
            case 5:
                if (qq4.g(this.b, mq4)) {
                    this.b = mq4;
                    ((gce) this.c).c(this);
                    return;
                }
                return;
            case 6:
                if (qq4.g(this.b, mq4)) {
                    this.b = mq4;
                    ((gce) this.c).c(this);
                    return;
                }
                return;
            default:
                if (qq4.g(this.b, mq4)) {
                    this.b = mq4;
                    ((gce) this.c).c(this);
                    return;
                }
                return;
        }
    }

    public void d(Object obj) {
        switch (this.a) {
            case 4:
                ((Collection) this.o).add(obj);
                return;
            default:
                ((Collection) this.o).add(obj);
                return;
        }
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
                try {
                    ((bb3) this.o).x.run();
                } catch (Throwable th) {
                    hd8.Z(th);
                    n54.D(th);
                }
                this.b.dispose();
                return;
            case 1:
                mq4 mq4 = this.b;
                this.b = qq4.a;
                mq4.dispose();
                return;
            case 2:
                try {
                    ((si8) this.o).getClass();
                } catch (Throwable th2) {
                    hd8.Z(th2);
                    n54.D(th2);
                }
                this.b.dispose();
                this.b = qq4.a;
                return;
            case 3:
                this.b.dispose();
                this.b = qq4.a;
                return;
            case 4:
                this.b.dispose();
                return;
            case 5:
                this.b.dispose();
                return;
            case 6:
                this.b.dispose();
                return;
            default:
                this.b.dispose();
                return;
        }
    }

    public void e() {
        try {
            ((si8) this.o).getClass();
        } catch (Throwable th) {
            hd8.Z(th);
            n54.D(th);
        }
    }

    public final boolean f() {
        switch (this.a) {
            case 0:
                return this.b.f();
            case 1:
                return this.b.f();
            case 2:
                return this.b.f();
            case 3:
                return this.b.f();
            case 4:
                return this.b.f();
            case 5:
                return this.b.f();
            case 6:
                return this.b.f();
            default:
                return this.b.f();
        }
    }

    public void g(Throwable th) {
        try {
            ((si8) this.o).c.accept(th);
        } catch (Throwable th2) {
            hd8.Z(th2);
            th = new CompositeException(th, th2);
        }
        this.b = qq4.a;
        ((pi8) this.c).onError(th);
        e();
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                bb3 bb3 = (bb3) this.o;
                if (this.b == qq4.a) {
                    n54.D(th);
                    return;
                }
                try {
                    bb3.c.accept(th);
                    bb3.v.run();
                } catch (Throwable th2) {
                    hd8.Z(th2);
                    th = new CompositeException(th, th2);
                }
                ((ya3) this.c).onError(th);
                try {
                    bb3.w.run();
                    return;
                } catch (Throwable th3) {
                    hd8.Z(th3);
                    n54.D(th3);
                    return;
                }
            case 1:
                ((pi8) this.c).onError(th);
                return;
            case 2:
                if (this.b == qq4.a) {
                    n54.D(th);
                    return;
                } else {
                    g(th);
                    return;
                }
            case 3:
                this.b = qq4.a;
                ((gce) this.c).onError(th);
                return;
            case 4:
                this.o = null;
                ((cla) this.c).onError(th);
                return;
            case 5:
                this.o = null;
                ((gce) this.c).onError(th);
                return;
            case 6:
                ((gce) this.c).onError(th);
                return;
            default:
                ((gce) this.c).onError(th);
                try {
                    ((x6) this.o).run();
                    return;
                } catch (Throwable th4) {
                    hd8.Z(th4);
                    n54.D(th4);
                    return;
                }
        }
    }

    public ab3(bb3 bb3, ya3 ya3) {
        this.a = 0;
        this.o = bb3;
        this.c = ya3;
    }
}
