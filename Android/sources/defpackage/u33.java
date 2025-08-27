package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

/* renamed from: u33  reason: default package */
public final class u33 implements AutoCloseable, d14 {
    public final CoroutineContext a;

    public u33(CoroutineContext coroutineContext) {
        this.a = coroutineContext;
    }

    public final CoroutineContext U() {
        return this.a;
    }

    public final void close() {
        kv0.n(this.a, (CancellationException) null);
    }
}
