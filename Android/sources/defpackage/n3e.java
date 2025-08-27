package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: n3e  reason: default package */
public final class n3e extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ y3e b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n3e(y3e y3e, Continuation continuation) {
        super(2, continuation);
        this.b = y3e;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new n3e(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n3e) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (y3e.j(this.b, this) == coroutine_suspended) {
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
