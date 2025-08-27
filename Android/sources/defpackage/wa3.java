package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: wa3  reason: default package */
public final class wa3 extends AtomicReference implements ya3, mq4, Runnable, gce {
    public final /* synthetic */ int a = 2;
    public final Object b;
    public final Object c;
    public Object o;

    public wa3(ya3 ya3, lfd lfd) {
        this.b = ya3;
        this.c = lfd;
    }

    public void a(Object obj) {
        ((gce) this.b).a(obj);
    }

    public void b() {
        switch (this.a) {
            case 0:
                qq4.c(this, ((lfd) this.c).c(this));
                return;
            default:
                ((ya3) this.b).b();
                return;
        }
    }

    public final void c(mq4 mq4) {
        switch (this.a) {
            case 0:
                if (qq4.e(this, mq4)) {
                    ((ya3) this.b).c(this);
                    return;
                }
                return;
            case 1:
                qq4.e(this, mq4);
                return;
            default:
                qq4.e(this, mq4);
                return;
        }
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
                qq4.a(this);
                return;
            case 1:
                qq4.a(this);
                mw1 mw1 = (mw1) this.c;
                mw1.getClass();
                qq4.a(mw1);
                return;
            default:
                qq4.a(this);
                mw1 mw12 = (mw1) this.c;
                mw12.getClass();
                qq4.a(mw12);
                return;
        }
    }

    public final boolean f() {
        switch (this.a) {
            case 0:
                return qq4.b((mq4) get());
            case 1:
                return qq4.b((mq4) get());
            default:
                return qq4.b((mq4) get());
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.o = th;
                qq4.c(this, ((lfd) this.c).c(this));
                return;
            case 1:
                ((ya3) this.b).onError(th);
                return;
            default:
                ((gce) this.b).onError(th);
                return;
        }
    }

    public final void run() {
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) this.o;
                ya3 ya3 = (ya3) this.b;
                if (th != null) {
                    this.o = null;
                    ya3.onError(th);
                    return;
                }
                ya3.b();
                return;
            case 1:
                ((ma3) this.o).j(this);
                return;
            default:
                ((lbe) this.o).l(this);
                return;
        }
    }

    public wa3(gce gce, lbe lbe) {
        this.b = gce;
        this.o = lbe;
        this.c = new mw1(2);
    }

    public wa3(ya3 ya3, ma3 ma3) {
        this.b = ya3;
        this.o = ma3;
        this.c = new mw1(2);
    }
}
