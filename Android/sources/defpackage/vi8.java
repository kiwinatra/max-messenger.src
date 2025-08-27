package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: vi8  reason: default package */
public final class vi8 extends AtomicReference implements pi8, mq4, ya3 {
    public final /* synthetic */ int a;
    public final gce b;
    public final lbe c;

    public /* synthetic */ vi8(gce gce, lbe lbe, int i) {
        this.a = i;
        this.b = gce;
        this.c = lbe;
    }

    public void a(Object obj) {
        this.b.a(obj);
    }

    public final void b() {
        switch (this.a) {
            case 0:
                mq4 mq4 = (mq4) get();
                if (mq4 != qq4.a && compareAndSet(mq4, (Object) null)) {
                    this.c.l(new ui8(this.b, (AtomicReference) this));
                    return;
                }
                return;
            default:
                this.c.l(new ui8((AtomicReference) this, this.b));
                return;
        }
    }

    public final void c(mq4 mq4) {
        switch (this.a) {
            case 0:
                if (qq4.e(this, mq4)) {
                    this.b.c(this);
                    return;
                }
                return;
            default:
                if (qq4.e(this, mq4)) {
                    this.b.c(this);
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
                this.b.onError(th);
                return;
            default:
                this.b.onError(th);
                return;
        }
    }
}
