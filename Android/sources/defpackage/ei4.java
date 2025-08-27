package defpackage;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ei4  reason: default package */
public final class ei4 extends AbstractExecutorService implements ysd {
    public static final /* synthetic */ int y = 0;
    public final String a = "SerialExecutor";
    public final Executor b;
    public volatile int c;
    public final BlockingQueue o;
    public final cf v;
    public final AtomicInteger w;
    public final AtomicInteger x;

    public ei4(Executor executor) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.b = executor;
        this.c = 1;
        this.o = linkedBlockingQueue;
        this.v = new cf(13, this);
        this.w = new AtomicInteger(0);
        this.x = new AtomicInteger(0);
    }

    public final void a(Runnable runnable) {
        if (runnable != null) {
            BlockingQueue blockingQueue = this.o;
            boolean offer = blockingQueue.offer(runnable);
            String str = this.a;
            if (offer) {
                int size = blockingQueue.size();
                AtomicInteger atomicInteger = this.x;
                int i = atomicInteger.get();
                if (size > i && atomicInteger.compareAndSet(i, size)) {
                    bg5.g(ei4.class, "%s: max pending work in queue = %d", str, Integer.valueOf(size));
                }
                b();
                return;
            }
            throw new RejectedExecutionException(str + " queue is full, size=" + blockingQueue.size());
        }
        throw new NullPointerException("runnable parameter is null");
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void b() {
        int i = this.w.get();
        while (i < this.c) {
            int i2 = i + 1;
            Class<ei4> cls = ei4.class;
            if (this.w.compareAndSet(i, i2)) {
                bg5.h(cls, "%s: starting worker %d of %d", this.a, Integer.valueOf(i2), Integer.valueOf(this.c));
                this.b.execute(this.v);
                return;
            }
            bg5.f(cls, this.a, "%s: race in startWorkerIfNeeded; retrying");
            i = this.w.get();
        }
    }

    public final synchronized void execute(Runnable runnable) {
        a(runnable);
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
