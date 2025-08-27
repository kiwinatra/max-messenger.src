package defpackage;

import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: ipf  reason: default package */
public abstract class ipf {
    public static final Lazy a = LazyKt.lazy(ds.x);
    public static final Lazy b = LazyKt.lazy(ds.w);

    public static void a(Runnable runnable) {
        ((Executor) b.getValue()).execute(runnable);
    }

    public static void b(Runnable runnable) {
        ((Executor) a.getValue()).execute(runnable);
    }
}
