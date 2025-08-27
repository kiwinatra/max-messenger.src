package defpackage;

import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: hve  reason: default package */
public final class hve extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mve c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hve(mve mve, Continuation continuation) {
        super(2, continuation);
        this.c = mve;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        hve hve = new hve(this.c, continuation);
        hve.b = obj;
        return hve;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hve) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Pair pair = (Pair) this.b;
            this.a = 1;
            if (mve.j(this.c, (List) pair.component1(), (fue) pair.component2(), this) == coroutine_suspended) {
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
