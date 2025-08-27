package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: eka  reason: default package */
public final class eka extends AtomicInteger implements cla, mq4 {
    public final cla a;
    public final AtomicInteger b = new AtomicInteger();
    public final fz c = new AtomicReference();
    public final gh3 o;
    public final bw5 v = new bw5(this);
    public final AtomicReference w = new AtomicReference();
    public final oka x;
    public volatile boolean y;

    /* JADX WARNING: type inference failed for: r1v2, types: [fz, java.util.concurrent.atomic.AtomicReference] */
    public eka(cla cla, etd etd, oka oka) {
        this.a = cla;
        this.o = etd;
        this.x = oka;
    }

    public final void a() {
        if (this.b.getAndIncrement() == 0) {
            while (!f()) {
                if (!this.y) {
                    this.y = true;
                    this.x.a(this);
                }
                if (this.b.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public final void b() {
        qq4.a(this.v);
        if (getAndIncrement() == 0) {
            this.c.d(this.a);
        }
    }

    public final void c(mq4 mq4) {
        qq4.c(this.w, mq4);
    }

    public final void d(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            cla cla = this.a;
            cla.d(obj);
            if (decrementAndGet() != 0) {
                this.c.d(cla);
            }
        }
    }

    public final void dispose() {
        qq4.a(this.w);
        qq4.a(this.v);
    }

    public final boolean f() {
        return qq4.b((mq4) this.w.get());
    }

    public final void onError(Throwable th) {
        qq4.c(this.w, (mq4) null);
        this.y = false;
        this.o.d(th);
    }
}
