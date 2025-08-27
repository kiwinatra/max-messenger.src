package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: oj6  reason: default package */
public class oj6 implements zz7 {
    public final zz7 a;
    public do1 b;

    public oj6(zz7 zz7) {
        zz7.getClass();
        this.a = zz7;
    }

    public static oj6 a(zz7 zz7) {
        return zz7 instanceof oj6 ? (oj6) zz7 : new oj6(zz7);
    }

    public boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    public final void d(Runnable runnable, Executor executor) {
        this.a.d(runnable, executor);
    }

    public Object get() {
        return this.a.get();
    }

    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    public final boolean isDone() {
        return this.a.isDone();
    }

    public Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }

    public oj6() {
        this.a = m5a.F(new b8d((Object) this));
    }
}
