package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* renamed from: pm7  reason: default package */
public interface pm7 extends CoroutineContext.Element {
    public static final /* synthetic */ int R = 0;

    pq4 V(Function1 function1);

    void b(CancellationException cancellationException);

    Object d(Continuation continuation);

    boolean e0();

    hz2 g(qn7 qn7);

    boolean isActive();

    boolean isCancelled();

    pq4 j(boolean z, boolean z2, f fVar);

    CancellationException n();

    boolean start();
}
