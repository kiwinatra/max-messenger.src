package defpackage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: lfd  reason: default package */
public abstract class lfd {
    public static final boolean a = Boolean.getBoolean("rx3.scheduler.use-nanotime");
    public static final long b;

    static {
        long longValue = Long.getLong("rx3.scheduler.drift-tolerance", 15).longValue();
        String property = System.getProperty("rx3.scheduler.drift-tolerance-unit", "minutes");
        b = "seconds".equalsIgnoreCase(property) ? TimeUnit.SECONDS.toNanos(longValue) : "milliseconds".equalsIgnoreCase(property) ? TimeUnit.MILLISECONDS.toNanos(longValue) : TimeUnit.MINUTES.toNanos(longValue);
    }

    public static long a(TimeUnit timeUnit) {
        return !a ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public abstract jfd b();

    public mq4 c(Runnable runnable) {
        return d(runnable, 0, TimeUnit.NANOSECONDS);
    }

    public mq4 d(Runnable runnable, long j, TimeUnit timeUnit) {
        jfd b2 = b();
        Objects.requireNonNull(runnable, "run is null");
        hfd hfd = new hfd(runnable, b2);
        b2.b(hfd, j, timeUnit);
        return hfd;
    }

    public mq4 e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        jfd b2 = b();
        Objects.requireNonNull(runnable, "run is null");
        gw6 gw6 = new gw6(runnable, b2);
        mq4 c = b2.c(gw6, j, j2, timeUnit);
        return c == p45.a ? c : gw6;
    }
}
