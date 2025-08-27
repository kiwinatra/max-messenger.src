package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aa5  reason: default package */
public final class aa5 extends AtomicBoolean implements Runnable, mq4 {
    public final Runnable a;

    public aa5(Runnable runnable) {
        this.a = runnable;
    }

    public final void dispose() {
        lazySet(true);
    }

    public final boolean f() {
        return get();
    }

    public final void run() {
        if (!get()) {
            try {
                this.a.run();
                lazySet(true);
            } catch (Throwable th) {
                lazySet(true);
                throw th;
            }
        }
    }
}
