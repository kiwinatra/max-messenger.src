package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;

/* renamed from: e14  reason: default package */
public abstract class e14 {
    public static final jx3 a(CoroutineContext coroutineContext) {
        if (coroutineContext.get(om7.a) == null) {
            coroutineContext = coroutineContext.plus(kv0.b());
        }
        return new jx3(coroutineContext);
    }

    public static final jx3 b() {
        q2f b = kr7.b();
        bi4 bi4 = dq4.a;
        return new jx3(CoroutineContext.Element.DefaultImpls.plus(b, lc8.a));
    }

    public static final void c(d14 d14, CancellationException cancellationException) {
        pm7 pm7 = (pm7) d14.U().get(om7.a);
        if (pm7 != null) {
            pm7.b(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + d14).toString());
    }

    public static final Object d(Function2 function2, Continuation continuation) {
        dgd dgd = new dgd(continuation, continuation.getContext());
        Object W = bs0.W(dgd, dgd, function2);
        if (W == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return W;
    }

    public static final void e(d14 d14) {
        kv0.q(d14.U());
    }

    public static final boolean f(d14 d14) {
        pm7 pm7 = (pm7) d14.U().get(om7.a);
        if (pm7 != null) {
            return pm7.isActive();
        }
        return true;
    }

    public static final jx3 g(d14 d14, CoroutineContext coroutineContext) {
        return new jx3(d14.U().plus(coroutineContext));
    }
}
