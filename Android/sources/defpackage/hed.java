package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: hed  reason: default package */
public final class hed extends j0 implements Callable {
    public final Object call() {
        FutureTask futureTask = j0.o;
        this.c = Thread.currentThread();
        try {
            this.a.run();
            lazySet(futureTask);
            this.c = null;
            return null;
        } catch (Throwable th) {
            n54.D(th);
            throw th;
        }
    }
}
