package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CompletionHandlerException;

/* renamed from: g0  reason: default package */
public abstract class g0 extends qn7 implements Continuation, d14 {
    public final CoroutineContext c;

    public g0(CoroutineContext coroutineContext, boolean z, boolean z2) {
        super(z2);
        if (z) {
            O((pm7) coroutineContext.get(om7.a));
        }
        this.c = coroutineContext.plus(this);
    }

    public final String C() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public final void N(CompletionHandlerException completionHandlerException) {
        u04.a(completionHandlerException, this.c);
    }

    public final CoroutineContext U() {
        return this.c;
    }

    public final void Y(Object obj) {
        if (obj instanceof jb3) {
            jb3 jb3 = (jb3) obj;
            Throwable th = jb3.a;
            jb3.getClass();
            h0(th, jb3.b.get(jb3) != 0);
            return;
        }
        i0(obj);
    }

    public final CoroutineContext getContext() {
        return this.c;
    }

    public void h0(Throwable th, boolean z) {
    }

    public void i0(Object obj) {
    }

    public final void j0(f14 f14, g0 g0Var, Function2 function2) {
        CoroutineContext context;
        Object b;
        int ordinal = f14.ordinal();
        if (ordinal == 0) {
            qw1.b(function2, g0Var, this);
        } else if (ordinal == 1) {
        } else {
            if (ordinal == 2) {
                ContinuationKt.startCoroutine(function2, g0Var, this);
            } else if (ordinal == 3) {
                Continuation probeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(this);
                try {
                    context = probeCoroutineCreated.getContext();
                    b = eif.b(context, (Object) null);
                    bs0.P(probeCoroutineCreated);
                    Object wrapWithContinuationImpl = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl(function2, g0Var, probeCoroutineCreated) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(g0Var, probeCoroutineCreated);
                    eif.a(context, b);
                    if (wrapWithContinuationImpl != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        probeCoroutineCreated.resumeWith(Result.m23constructorimpl(wrapWithContinuationImpl));
                    }
                } catch (Throwable th) {
                    Result.Companion companion = Result.Companion;
                    probeCoroutineCreated.resumeWith(Result.m23constructorimpl(ResultKt.createFailure(th)));
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void resumeWith(Object obj) {
        Throwable r0 = Result.m26exceptionOrNullimpl(obj);
        if (r0 != null) {
            obj = new jb3(r0, false);
        }
        Object S = S(obj);
        if (S != ld9.e) {
            x(S);
        }
    }
}
