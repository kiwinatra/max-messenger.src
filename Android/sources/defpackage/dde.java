package defpackage;

/* renamed from: dde  reason: default package */
public final class dde extends rk4 implements gce {
    public mq4 c;

    public final void c(mq4 mq4) {
        if (qq4.g(this.c, mq4)) {
            this.c = mq4;
            this.a.e(this);
        }
    }

    public final void cancel() {
        set(4);
        this.b = null;
        this.c.dispose();
    }

    public final void onError(Throwable th) {
        this.a.onError(th);
    }
}
