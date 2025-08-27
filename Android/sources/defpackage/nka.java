package defpackage;

/* renamed from: nka  reason: default package */
public final class nka implements cla, mq4 {
    public final cla a;
    public long b = 1;
    public mq4 c;

    public nka(cla cla) {
        this.a = cla;
    }

    public final void b() {
        this.a.b();
    }

    public final void c(mq4 mq4) {
        if (qq4.g(this.c, mq4)) {
            this.c = mq4;
            this.a.c(this);
        }
    }

    public final void d(Object obj) {
        long j = this.b;
        if (j != 0) {
            this.b = j - 1;
        } else {
            this.a.d(obj);
        }
    }

    public final void dispose() {
        this.c.dispose();
    }

    public final boolean f() {
        return this.c.f();
    }

    public final void onError(Throwable th) {
        this.a.onError(th);
    }
}
