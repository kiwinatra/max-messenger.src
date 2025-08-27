package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: fka  reason: default package */
public final class fka extends hka {
    public final AtomicInteger y = new AtomicInteger(1);

    public fka(btd btd, long j, TimeUnit timeUnit, lfd lfd) {
        super(btd, j, timeUnit, lfd);
    }

    public final void a() {
        e();
        if (this.y.decrementAndGet() == 0) {
            this.a.b();
        }
    }

    public final void run() {
        AtomicInteger atomicInteger = this.y;
        if (atomicInteger.incrementAndGet() == 2) {
            e();
            if (atomicInteger.decrementAndGet() == 0) {
                this.a.b();
            }
        }
    }
}
