package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: io1  reason: default package */
public final class io1 extends AbstractExecutorService {
    public static final io1 a = new AbstractExecutorService();

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return true;
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final void shutdown() {
    }

    public final List shutdownNow() {
        return Collections.emptyList();
    }
}
