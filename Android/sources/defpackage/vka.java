package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: vka  reason: default package */
public final class vka implements cla, mq4 {
    public final cla a;
    public final TimeUnit b;
    public final lfd c;
    public long o;
    public mq4 v;

    public vka(cla cla, TimeUnit timeUnit, lfd lfd) {
        this.a = cla;
        this.c = lfd;
        this.b = timeUnit;
    }

    public final void b() {
        this.a.b();
    }

    public final void c(mq4 mq4) {
        if (qq4.g(this.v, mq4)) {
            this.v = mq4;
            this.c.getClass();
            this.o = lfd.a(this.b);
            this.a.c(this);
        }
    }

    public final void d(Object obj) {
        this.c.getClass();
        TimeUnit timeUnit = this.b;
        long a2 = lfd.a(timeUnit);
        long j = this.o;
        this.o = a2;
        this.a.d(new yjf(obj, a2 - j, timeUnit));
    }

    public final void dispose() {
        this.v.dispose();
    }

    public final boolean f() {
        return this.v.f();
    }

    public final void onError(Throwable th) {
        this.a.onError(th);
    }
}
