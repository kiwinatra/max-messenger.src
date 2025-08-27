package defpackage;

import java.util.concurrent.RejectedExecutionException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;

/* renamed from: n6d  reason: default package */
public abstract class n6d {
    public static final Object a(i6d i6d, Function1 function1, Continuation continuation) {
        qn qnVar = null;
        m6d m6d = new m6d(i6d, function1, (Continuation) null);
        xqf xqf = (xqf) continuation.getContext().get(xqf.c);
        ContinuationInterceptor continuationInterceptor = xqf != null ? xqf.a : null;
        if (continuationInterceptor != null) {
            return ev0.I(continuationInterceptor, m6d, continuation);
        }
        CoroutineContext context = continuation.getContext();
        lw1 lw1 = new lw1(1, IntrinsicsKt.intercepted(continuation));
        lw1.u();
        try {
            qn qnVar2 = i6d.c;
            if (qnVar2 != null) {
                qnVar = qnVar2;
            }
            qnVar.execute(new l6d(context, lw1, i6d, m6d));
        } catch (RejectedExecutionException e) {
            lw1.q(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        Object t = lw1.t();
        if (t == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return t;
    }
}
