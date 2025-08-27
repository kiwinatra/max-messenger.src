package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: go1  reason: default package */
public final class go1 implements zz7 {
    public final WeakReference a;
    public final fo1 b = new fo1(this);

    public go1(do1 do1) {
        this.a = new WeakReference(do1);
    }

    public final boolean cancel(boolean z) {
        do1 do1 = (do1) this.a.get();
        boolean cancel = this.b.cancel(z);
        if (cancel && do1 != null) {
            do1.a = null;
            do1.b = null;
            do1.c.i((Object) null);
        }
        return cancel;
    }

    public final void d(Runnable runnable, Executor executor) {
        this.b.d(runnable, executor);
    }

    public final Object get() {
        return this.b.get();
    }

    public final boolean isCancelled() {
        return this.b.a instanceof a3;
    }

    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
