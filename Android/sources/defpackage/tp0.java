package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: tp0  reason: default package */
public final class tp0 extends CountDownLatch implements cla, mq4 {
    public Object a;
    public Throwable b;
    public mq4 c;
    public volatile boolean o;

    public final Object a() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                dispose();
                throw p95.f(e);
            }
        }
        Throwable th = this.b;
        if (th == null) {
            return this.a;
        }
        throw p95.f(th);
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

    public final void d(Object obj) {
        if (this.a == null) {
            this.a = obj;
            this.c.dispose();
            countDown();
        }
    }

    public final void dispose() {
        this.o = true;
        mq4 mq4 = this.c;
        if (mq4 != null) {
            mq4.dispose();
        }
    }

    public final boolean f() {
        return this.o;
    }

    public final void onError(Throwable th) {
        if (this.a == null) {
            this.b = th;
        }
        countDown();
    }
}
