package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: up0  reason: default package */
public final class up0 extends CountDownLatch implements gce, ya3, pi8 {
    public Object a;
    public Throwable b;
    public mq4 c;
    public volatile boolean o;

    public final void a(Object obj) {
        this.a = obj;
        countDown();
    }

    public final void b() {
        countDown();
    }

    public final void c(mq4 mq4) {
        this.c = mq4;
        if (this.o) {
            mq4.dispose();
        }
    }

    public final Object d() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                this.o = true;
                mq4 mq4 = this.c;
                if (mq4 != null) {
                    mq4.dispose();
                }
                throw p95.f(e);
            }
        }
        Throwable th = this.b;
        if (th == null) {
            return this.a;
        }
        throw p95.f(th);
    }

    public final void onError(Throwable th) {
        this.b = th;
        countDown();
    }
}
