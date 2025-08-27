package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: qo7  reason: default package */
public final class qo7 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ tgg c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qo7(tgg tgg, Continuation continuation) {
        super(2, continuation);
        this.c = tgg;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        qo7 qo7 = new qo7(this.c, continuation);
        qo7.b = obj;
        return qo7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qo7) create((oo7) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ru0 ru0 = (ru0) this.c.o;
            this.a = 1;
            if (ru0.t((oo7) this.b, this) == coroutine_suspended) {
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
