package defpackage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: vqf  reason: default package */
public final class vqf extends lfd {
    public static final vqf c = new Object();

    public final jfd b() {
        return new uqf();
    }

    public final mq4 c(Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        runnable.run();
        return p45.a;
    }

    public final mq4 d(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            Objects.requireNonNull(runnable, "run is null");
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            n54.D(e);
        }
        return p45.a;
    }
}
