package defpackage;

/* renamed from: cja  reason: default package */
public final class cja extends q0 implements ya3 {
    public final cla a;
    public mq4 b;

    public cja(cla cla) {
        this.a = cla;
    }

    public final void b() {
        this.b = qq4.a;
        this.a.b();
    }

    public final void c(mq4 mq4) {
        if (qq4.g(this.b, mq4)) {
            this.b = mq4;
            this.a.c(this);
        }
    }

    public final void dispose() {
        this.b.dispose();
        this.b = qq4.a;
    }

    public final boolean f() {
        return this.b.f();
    }

    public final void onError(Throwable th) {
        this.b = qq4.a;
        this.a.onError(th);
    }
}
