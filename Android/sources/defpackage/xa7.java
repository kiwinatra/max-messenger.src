package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: xa7  reason: default package */
public class xa7 implements zz7 {
    public static final xa7 c = new xa7(0, (Object) null);
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ xa7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final void d(Runnable runnable, Executor executor) {
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException unused) {
            runnable.toString();
            executor.toString();
        }
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                throw new ExecutionException((Throwable) this.b);
        }
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return super.toString() + "[status=SUCCESS, result=[" + this.b + "]]";
            default:
                return super.toString() + "[status=FAILURE, cause=[" + ((Throwable) this.b) + "]]";
        }
    }

    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }
}
