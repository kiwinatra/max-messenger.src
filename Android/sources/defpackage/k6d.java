package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: k6d  reason: default package */
public final class k6d extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i6d c;
    public final /* synthetic */ kw1 o;
    public final /* synthetic */ Function2 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k6d(i6d i6d, lw1 lw1, m6d m6d, Continuation continuation) {
        super(2, continuation);
        this.c = i6d;
        this.o = lw1;
        this.v = m6d;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        k6d k6d = new k6d(this.c, (lw1) this.o, (m6d) this.v, continuation);
        k6d.b = obj;
        return k6d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k6d) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Continuation continuation;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) ((d14) this.b).U().get(ContinuationInterceptor.Key);
            xqf xqf = new xqf(continuationInterceptor);
            CoroutineContext plus = continuationInterceptor.plus(xqf).plus(new kif(Integer.valueOf(System.identityHashCode(xqf)), this.c.j));
            Result.Companion companion = Result.Companion;
            kw1 kw1 = this.o;
            this.b = kw1;
            this.a = 1;
            obj = ev0.I(plus, this.v, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            continuation = kw1;
        } else if (i == 1) {
            continuation = (Continuation) this.b;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        continuation.resumeWith(Result.m23constructorimpl(obj));
        return Unit.INSTANCE;
    }
}
