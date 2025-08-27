package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: hx5  reason: default package */
public final class hx5 extends AtomicReference implements rye, Runnable {
    public final pye a;
    public volatile boolean b;

    public hx5(pye pye) {
        this.a = pye;
    }

    public final void cancel() {
        qq4.a(this);
    }

    public final void g(long j) {
        if (tye.d(j)) {
            this.b = true;
        }
    }

    public final void run() {
        if (get() != qq4.a) {
            boolean z = this.b;
            p45 p45 = p45.a;
            if (z) {
                this.a.d(0L);
                lazySet(p45);
                this.a.b();
                return;
            }
            lazySet(p45);
            this.a.onError(new RuntimeException("Could not emit value due to lack of requests"));
        }
    }
}
