package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: rdd  reason: default package */
public final class rdd extends AtomicInteger implements zac {
    public final Object a;
    public final pye b;

    public rdd(pye pye, Object obj) {
        this.b = pye;
        this.a = obj;
    }

    public final void cancel() {
        lazySet(2);
    }

    public final void clear() {
        lazySet(1);
    }

    public final void g(long j) {
        if (tye.d(j) && compareAndSet(0, 1)) {
            Object obj = this.a;
            pye pye = this.b;
            pye.d(obj);
            if (get() != 2) {
                pye.b();
            }
        }
    }

    public final boolean isEmpty() {
        return get() != 0;
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final int p(int i) {
        return 1;
    }

    public final Object poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.a;
    }
}
