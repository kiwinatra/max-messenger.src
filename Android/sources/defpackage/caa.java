package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* renamed from: caa  reason: default package */
public final class caa extends AbstractCoroutineContextElement implements pm7 {
    public static final caa a = new AbstractCoroutineContextElement(om7.a);

    public final pq4 V(Function1 function1) {
        return jaa.a;
    }

    public final void b(CancellationException cancellationException) {
    }

    public final Object d(Continuation continuation) {
        throw new UnsupportedOperationException("This job is always active");
    }

    public final boolean e0() {
        return false;
    }

    public final hz2 g(qn7 qn7) {
        return jaa.a;
    }

    public final boolean isActive() {
        return true;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final pq4 j(boolean z, boolean z2, f fVar) {
        return jaa.a;
    }

    public final CancellationException n() {
        throw new IllegalStateException("This job is always active");
    }

    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }
}
