package defpackage;

import java.util.Objects;

/* renamed from: kka  reason: default package */
public final class kka implements cla, mq4 {
    public final /* synthetic */ int a = 0;
    public final cla b;
    public final sm0 c;
    public Object o;
    public mq4 v;
    public boolean w;

    public kka(cla cla, dre dre) {
        this.b = cla;
        this.c = dre;
    }

    public final void b() {
        switch (this.a) {
            case 0:
                if (!this.w) {
                    this.w = true;
                    this.b.b();
                    return;
                }
                return;
            default:
                if (!this.w) {
                    this.w = true;
                    this.b.b();
                    return;
                }
                return;
        }
    }

    public final void c(mq4 mq4) {
        switch (this.a) {
            case 0:
                if (qq4.g(this.v, mq4)) {
                    this.v = mq4;
                    this.b.c(this);
                    return;
                }
                return;
            default:
                if (qq4.g(this.v, mq4)) {
                    this.v = mq4;
                    cla cla = this.b;
                    cla.c(this);
                    cla.d(this.o);
                    return;
                }
                return;
        }
    }

    public final void d(Object obj) {
        switch (this.a) {
            case 0:
                if (!this.w) {
                    Object obj2 = this.o;
                    cla cla = this.b;
                    if (obj2 == null) {
                        this.o = obj;
                        cla.d(obj);
                        return;
                    }
                    try {
                        Object apply = this.c.apply(obj2, obj);
                        Objects.requireNonNull(apply, "The value returned by the accumulator is null");
                        this.o = apply;
                        cla.d(apply);
                        return;
                    } catch (Throwable th) {
                        hd8.Z(th);
                        this.v.dispose();
                        onError(th);
                        return;
                    }
                } else {
                    return;
                }
            default:
                if (!this.w) {
                    try {
                        Object apply2 = this.c.apply(this.o, obj);
                        Objects.requireNonNull(apply2, "The accumulator returned a null value");
                        this.o = apply2;
                        this.b.d(apply2);
                        return;
                    } catch (Throwable th2) {
                        hd8.Z(th2);
                        this.v.dispose();
                        onError(th2);
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
                this.v.dispose();
                return;
            default:
                this.v.dispose();
                return;
        }
    }

    public final boolean f() {
        switch (this.a) {
            case 0:
                return this.v.f();
            default:
                return this.v.f();
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                if (this.w) {
                    n54.D(th);
                    return;
                }
                this.w = true;
                this.b.onError(th);
                return;
            default:
                if (this.w) {
                    n54.D(th);
                    return;
                }
                this.w = true;
                this.b.onError(th);
                return;
        }
    }

    public kka(cla cla, tb4 tb4, Object obj) {
        this.b = cla;
        this.c = tb4;
        this.o = obj;
    }
}
