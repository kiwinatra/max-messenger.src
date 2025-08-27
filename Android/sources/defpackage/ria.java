package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ria  reason: default package */
public final class ria extends AtomicReference implements cla {
    public final sia a;
    public volatile boolean b;
    public volatile gbe c;
    public int o;

    public ria(sia sia) {
        this.a = sia;
    }

    public final void b() {
        this.b = true;
        this.a.g();
    }

    public final void c(mq4 mq4) {
        if (qq4.e(this, mq4) && (mq4 instanceof xac)) {
            xac xac = (xac) mq4;
            int p = xac.p(7);
            if (p == 1) {
                this.o = p;
                this.c = xac;
                this.b = true;
                this.a.g();
            } else if (p == 2) {
                this.o = p;
                this.c = xac;
            }
        }
    }

    public final void d(Object obj) {
        if (this.o == 0) {
            sia sia = this.a;
            if (sia.get() != 0 || !sia.compareAndSet(0, 1)) {
                gbe gbe = this.c;
                if (gbe == null) {
                    gbe = new the(sia.v);
                    this.c = gbe;
                }
                gbe.offer(obj);
                if (sia.getAndIncrement() != 0) {
                    return;
                }
            } else {
                sia.a.d(obj);
                if (sia.decrementAndGet() == 0) {
                    return;
                }
            }
            sia.h();
            return;
        }
        this.a.g();
    }

    public final void onError(Throwable th) {
        if (this.a.y.a(th)) {
            sia sia = this.a;
            if (!sia.c) {
                sia.e();
            }
            this.b = true;
            this.a.g();
        }
    }
}
