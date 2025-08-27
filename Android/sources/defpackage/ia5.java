package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.time.Duration;

/* renamed from: ia5  reason: default package */
public final class ia5 {
    public final long a;
    public final AtomicBoolean b = new AtomicBoolean(true);
    public long c;
    public final /* synthetic */ la5 d;

    public ia5(la5 la5, long j) {
        this.d = la5;
        this.a = j;
        this.c = la5.c(la5.f(), j);
    }

    public final void a() {
        la5 la5 = this.d;
        if (!la5.a.isTerminated() && !la5.a.isShutdown()) {
            if (this.b.compareAndSet(true, false)) {
                this.c = la5.c(la5.f(), this.a);
                try {
                    la5.execute(new ne4(21, this));
                } catch (RejectedExecutionException unused) {
                }
            } else if (Duration.m1352compareToLRDsOJo(la5.f(), this.c) > 0) {
                this.c = Duration.Companion.m1454getINFINITEUwyO8pc();
                la5.b.d(la5.g(la5.x));
            }
        }
    }
}
