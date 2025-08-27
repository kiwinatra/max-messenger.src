package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;

/* renamed from: hn5  reason: default package */
public final class hn5 {
    public static final long[] h = {1, 2, 5, 10, 16};
    public final ez a;
    public final wie b;
    public final fn5 c;
    public final AtomicReference d = new AtomicReference((Object) null);
    public final Object e = new Object();
    public q04 f;
    public final Lazy g = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new u75(4, this));

    public hn5(ez ezVar, wie wie, fn5 fn5) {
        this.a = ezVar;
        this.b = wie;
        this.c = fn5;
    }

    public final void a(qz9 qz9) {
        q04 q04;
        synchronized (this.e) {
            try {
                wie wie = this.b;
                if (wie != null) {
                    wie.g0("schedule update");
                }
                this.d.set(qz9);
                if (this.f == null) {
                    try {
                        q04 = this.c.a().s0(1, "file-prefs");
                    } catch (Throwable unused) {
                        q04 = null;
                    }
                    this.f = q04;
                }
                q04 q042 = this.f;
                if (q042 != null) {
                    q042.p0(EmptyCoroutineContext.INSTANCE, (gn5) this.g.getValue());
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
