package defpackage;

import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/* renamed from: nh8  reason: default package */
public abstract class nh8 implements ti8 {
    public static ii8 e(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new ii8(obj);
    }

    public final void a(pi8 pi8) {
        Objects.requireNonNull(pi8, "observer is null");
        try {
            g(pi8);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            hd8.Z(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.concurrent.CountDownLatch, up0, pi8] */
    public final Object b() {
        ? countDownLatch = new CountDownLatch(1);
        a(countDownLatch);
        return countDownLatch.d();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.concurrent.CountDownLatch, up0, pi8] */
    public final Object c(Object obj) {
        Objects.requireNonNull(obj, "defaultValue is null");
        ? countDownLatch = new CountDownLatch(1);
        a(countDownLatch);
        if (countDownLatch.getCount() != 0) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                countDownLatch.o = true;
                mq4 mq4 = countDownLatch.c;
                if (mq4 != null) {
                    mq4.dispose();
                }
                throw p95.f(e);
            }
        }
        Throwable th = countDownLatch.b;
        if (th == null) {
            Object obj2 = countDownLatch.a;
            return obj2 != null ? obj2 : obj;
        }
        throw p95.f(th);
    }

    public final oi8 f(lfd lfd) {
        Objects.requireNonNull(lfd, "scheduler is null");
        return new oi8(this, lfd, 0);
    }

    public abstract void g(pi8 pi8);

    public final oi8 h(lfd lfd) {
        Objects.requireNonNull(lfd, "scheduler is null");
        return new oi8(this, lfd, 1);
    }
}
