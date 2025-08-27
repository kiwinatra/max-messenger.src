package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: cn7  reason: default package */
public final class cn7 implements zz7 {
    public final cyd a = new Object();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, cyd] */
    public cn7(qm7 qm7) {
        qm7.V(new bn7(0, this));
    }

    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    public final void d(Runnable runnable, Executor executor) {
        this.a.d(runnable, executor);
    }

    public final Object get() {
        return this.a.get();
    }

    public final boolean isCancelled() {
        return this.a.a instanceof u0;
    }

    public final boolean isDone() {
        return this.a.isDone();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }
}
