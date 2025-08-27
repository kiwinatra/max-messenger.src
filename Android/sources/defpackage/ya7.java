package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ya7  reason: default package */
public final class ya7 implements zz7 {
    public static final ya7 b = new ya7((Object) null);
    public static final gm4 c = new gm4(ya7.class);
    public final Object a;

    public ya7(Object obj) {
        this.a = obj;
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final void d(Runnable runnable, Executor executor) {
        b0h.h(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger e2 = c.e();
            Level level = Level.SEVERE;
            e2.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    public final Object get() {
        return this.a;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.a + "]]";
    }

    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.a;
    }
}
