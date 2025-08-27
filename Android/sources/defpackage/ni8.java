package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ni8  reason: default package */
public final class ni8 extends AtomicReference implements pi8, mq4, Runnable, gce {
    public final /* synthetic */ int a;
    public final lfd b;
    public Object c;
    public Throwable o;
    public final Object v;

    public /* synthetic */ ni8(Object obj, lfd lfd, int i) {
        this.a = i;
        this.v = obj;
        this.b = lfd;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.c = obj;
                qq4.c(this, this.b.c(this));
                return;
            default:
                this.c = obj;
                qq4.c(this, this.b.c(this));
                return;
        }
    }

    public void b() {
        qq4.c(this, this.b.c(this));
    }

    public final void c(mq4 mq4) {
        switch (this.a) {
            case 0:
                if (qq4.e(this, mq4)) {
                    ((pi8) this.v).c(this);
                    return;
                }
                return;
            default:
                if (qq4.e(this, mq4)) {
                    ((gce) this.v).c(this);
                    return;
                }
                return;
        }
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
                qq4.a(this);
                return;
            default:
                qq4.a(this);
                return;
        }
    }

    public final boolean f() {
        switch (this.a) {
            case 0:
                return qq4.b((mq4) get());
            default:
                return qq4.b((mq4) get());
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.o = th;
                qq4.c(this, this.b.c(this));
                return;
            default:
                this.o = th;
                qq4.c(this, this.b.c(this));
                return;
        }
    }

    public final void run() {
        switch (this.a) {
            case 0:
                Throwable th = this.o;
                pi8 pi8 = (pi8) this.v;
                if (th != null) {
                    this.o = null;
                    pi8.onError(th);
                    return;
                }
                Object obj = this.c;
                if (obj != null) {
                    this.c = null;
                    pi8.a(obj);
                    return;
                }
                pi8.b();
                return;
            default:
                Throwable th2 = this.o;
                gce gce = (gce) this.v;
                if (th2 != null) {
                    gce.onError(th2);
                    return;
                } else {
                    gce.a(this.c);
                    return;
                }
        }
    }
}
