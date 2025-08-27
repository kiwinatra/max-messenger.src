package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: jka  reason: default package */
public final class jka extends AtomicInteger implements xac, Runnable {
    public final cla a;
    public final Object b;

    public jka(cla cla, Object obj) {
        this.a = cla;
        this.b = obj;
    }

    public final void clear() {
        lazySet(3);
    }

    public final void dispose() {
        set(3);
    }

    public final boolean f() {
        return get() == 3;
    }

    public final boolean isEmpty() {
        return get() != 1;
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final int p(int i) {
        lazySet(1);
        return 1;
    }

    public final Object poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.b;
    }

    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            Object obj = this.b;
            cla cla = this.a;
            cla.d(obj);
            if (get() == 2) {
                lazySet(3);
                cla.b();
            }
        }
    }
}
