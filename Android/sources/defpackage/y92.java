package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: y92  reason: default package */
public final class y92 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ia2 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y92(ia2 ia2, Continuation continuation) {
        super(2, continuation);
        this.c = ia2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        y92 y92 = new y92(this.c, continuation);
        y92.b = obj;
        return y92;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((y92) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (ia2.n(this.c, (List) this.b, false, this) == coroutine_suspended) {
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
