package defpackage;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.ranges.RangesKt;

/* renamed from: fg4  reason: default package */
public final class fg4 extends x95 implements Executor {
    public static final fg4 b = new q04();
    public static final q04 c = vvf.b.s0(hd8.Y(RangesKt.coerceAtLeast(64, z7f.a), 0, 0, 12, "kotlinx.coroutines.io.parallelism"), (String) null);

    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public final void execute(Runnable runnable) {
        p0(EmptyCoroutineContext.INSTANCE, runnable);
    }

    public final void p0(CoroutineContext coroutineContext, Runnable runnable) {
        c.p0(coroutineContext, runnable);
    }

    public final void q0(CoroutineContext coroutineContext, Runnable runnable) {
        c.q0(coroutineContext, runnable);
    }

    public final q04 s0(int i, String str) {
        return vvf.b.s0(i, str);
    }

    public final String toString() {
        return "Dispatchers.IO";
    }
}
