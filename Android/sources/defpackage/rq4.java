package defpackage;

/* renamed from: rq4  reason: default package */
public final class rq4 implements cla, mq4 {
    public final cla a;
    public final qk3 b;
    public final x6 c;
    public mq4 o;

    public rq4(cla cla, qk3 qk3, x6 x6Var) {
        this.a = cla;
        this.b = qk3;
        this.c = x6Var;
    }

    public final void b() {
        mq4 mq4 = this.o;
        qq4 qq4 = qq4.a;
        if (mq4 != qq4) {
            this.o = qq4;
            this.a.b();
        }
    }

    public final void c(mq4 mq4) {
        cla cla = this.a;
        try {
            this.b.accept(mq4);
            if (qq4.g(this.o, mq4)) {
                this.o = mq4;
                cla.c(this);
            }
        } catch (Throwable th) {
            hd8.Z(th);
            mq4.dispose();
            this.o = qq4.a;
            p45.b(th, cla);
        }
    }

    public final void d(Object obj) {
        this.a.d(obj);
    }

    public final void dispose() {
        mq4 mq4 = this.o;
        qq4 qq4 = qq4.a;
        if (mq4 != qq4) {
            this.o = qq4;
            try {
                this.c.run();
            } catch (Throwable th) {
                hd8.Z(th);
                n54.D(th);
            }
            mq4.dispose();
        }
    }

    public final boolean f() {
        return this.o.f();
    }

    public final void onError(Throwable th) {
        mq4 mq4 = this.o;
        qq4 qq4 = qq4.a;
        if (mq4 != qq4) {
            this.o = qq4;
            this.a.onError(th);
            return;
        }
        n54.D(th);
    }
}
