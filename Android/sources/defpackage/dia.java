package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: dia  reason: default package */
public final class dia implements cla, mq4 {
    public final cla a;
    public final long b;
    public final TimeUnit c;
    public final jfd o;
    public final boolean v = false;
    public mq4 w;

    public dia(cla cla, long j, TimeUnit timeUnit, jfd jfd) {
        this.a = cla;
        this.b = j;
        this.c = timeUnit;
        this.o = jfd;
    }

    public final void b() {
        this.o.b(new tj7(14, this), this.b, this.c);
    }

    public final void c(mq4 mq4) {
        if (qq4.g(this.w, mq4)) {
            this.w = mq4;
            this.a.c(this);
        }
    }

    public final void d(Object obj) {
        this.o.b(new uj6((Object) this, obj, false, 14), this.b, this.c);
    }

    public final void dispose() {
        this.w.dispose();
        this.o.dispose();
    }

    public final boolean f() {
        return this.o.f();
    }

    public final void onError(Throwable th) {
        this.o.b(new vj6((Object) this, (Object) th, false, 11), this.v ? this.b : 0, this.c);
    }
}
