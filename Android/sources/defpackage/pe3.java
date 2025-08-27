package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: pe3  reason: default package */
public final class pe3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ qe3 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pe3(qe3 qe3, Continuation continuation) {
        super(2, continuation);
        this.b = qe3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new pe3(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pe3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n6e n6e = this.b.a;
            ne3 ne3 = ne3.a;
            this.a = 1;
            if (n6e.a(ne3, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
