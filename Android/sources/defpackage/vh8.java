package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* renamed from: vh8  reason: default package */
public final class vh8 implements gce, mq4, pi8 {
    public final /* synthetic */ int a;
    public final pi8 b;
    public final nsb c;
    public mq4 o;

    public /* synthetic */ vh8(pi8 pi8, nsb nsb, int i) {
        this.a = i;
        this.b = pi8;
        this.c = nsb;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                pi8 pi8 = this.b;
                try {
                    if (this.c.test(obj)) {
                        pi8.a(obj);
                        return;
                    } else {
                        pi8.b();
                        return;
                    }
                } catch (Throwable th) {
                    hd8.Z(th);
                    pi8.onError(th);
                    return;
                }
            default:
                this.b.a(obj);
                return;
        }
    }

    public void b() {
        this.b.b();
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

    public final void dispose() {
        switch (this.a) {
            case 0:
                mq4 mq4 = this.o;
                this.o = qq4.a;
                mq4.dispose();
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
                this.b.onError(th);
                return;
            default:
                pi8 pi8 = this.b;
                try {
                    if (this.c.test(th)) {
                        pi8.b();
                        return;
                    } else {
                        pi8.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    hd8.Z(th2);
                    pi8.onError(new CompositeException(th, th2));
                    return;
                }
        }
    }
}
