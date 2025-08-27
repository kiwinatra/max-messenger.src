package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ys9  reason: default package */
public interface ys9 {
    @cr4
    long now() {
        return TimeUnit.NANOSECONDS.toMillis(nowNanos());
    }

    @cr4
    long nowNanos();
}
