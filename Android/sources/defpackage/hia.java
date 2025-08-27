package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* renamed from: hia  reason: default package */
public final class hia implements cla, mq4 {
    public final cla a;
    public final qk3 b;
    public final qk3 c;
    public final x6 o;
    public final x6 v;
    public mq4 w;
    public boolean x;

    public hia(cla cla, qk3 qk3, qk3 qk32, x6 x6Var) {
        dj6 dj6 = m58.e;
        this.a = cla;
        this.b = qk3;
        this.c = qk32;
        this.o = x6Var;
        this.v = dj6;
    }

    public final void b() {
        if (!this.x) {
            try {
                this.o.run();
                this.x = true;
                this.a.b();
                try {
                    this.v.run();
                } catch (Throwable th) {
                    hd8.Z(th);
                    n54.D(th);
                }
            } catch (Throwable th2) {
                hd8.Z(th2);
                onError(th2);
            }
        }
    }

    public final void c(mq4 mq4) {
        if (qq4.g(this.w, mq4)) {
            this.w = mq4;
            this.a.c(this);
        }
    }

    public final void d(Object obj) {
        if (!this.x) {
            try {
                this.b.accept(obj);
                this.a.d(obj);
            } catch (Throwable th) {
                hd8.Z(th);
                this.w.dispose();
                onError(th);
            }
        }
    }

    public final void dispose() {
        this.w.dispose();
    }

    public final boolean f() {
        return this.w.f();
    }

    public final void onError(Throwable th) {
        if (this.x) {
            n54.D(th);
            return;
        }
        this.x = true;
        try {
            this.c.accept(th);
        } catch (Throwable th2) {
            hd8.Z(th2);
            th = new CompositeException(th, th2);
        }
        this.a.onError(th);
        try {
            this.v.run();
        } catch (Throwable th3) {
            hd8.Z(th3);
            n54.D(th3);
        }
    }
}
