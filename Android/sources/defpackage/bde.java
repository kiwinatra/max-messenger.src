package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bde  reason: default package */
public final class bde extends AtomicReference implements gce, Runnable, mq4 {
    public final gce a;
    public final AtomicReference b = new AtomicReference();
    public final bw5 c;
    public lbe o;
    public final long v;
    public final TimeUnit w;

    public bde(gce gce, lbe lbe, long j, TimeUnit timeUnit) {
        this.a = gce;
        this.o = lbe;
        this.v = j;
        this.w = timeUnit;
        if (lbe != null) {
            this.c = new bw5(3, gce);
        } else {
            this.c = null;
        }
    }

    public final void a(Object obj) {
        mq4 mq4 = (mq4) get();
        qq4 qq4 = qq4.a;
        if (mq4 != qq4 && compareAndSet(mq4, qq4)) {
            qq4.a(this.b);
            this.a.a(obj);
        }
    }

    public final void c(mq4 mq4) {
        qq4.e(this, mq4);
    }

    public final void dispose() {
        qq4.a(this);
        qq4.a(this.b);
        bw5 bw5 = this.c;
        if (bw5 != null) {
            qq4.a(bw5);
        }
    }

    public final boolean f() {
        return qq4.b((mq4) get());
    }

    public final void onError(Throwable th) {
        mq4 mq4 = (mq4) get();
        qq4 qq4 = qq4.a;
        if (mq4 == qq4 || !compareAndSet(mq4, qq4)) {
            n54.D(th);
            return;
        }
        qq4.a(this.b);
        this.a.onError(th);
    }

    public final void run() {
        if (qq4.a(this)) {
            lbe lbe = this.o;
            if (lbe == null) {
                this.a.onError(new TimeoutException(p95.e(this.v, this.w)));
                return;
            }
            this.o = null;
            lbe.l(this.c);
        }
    }
}
