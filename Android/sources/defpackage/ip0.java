package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ip0  reason: default package */
public final class ip0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ jp0 b;
    public final /* synthetic */ hj0 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ip0(jp0 jp0, hj0 hj0, Continuation continuation) {
        super(2, continuation);
        this.b = jp0;
        this.c = hj0;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ip0(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ip0) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n6e n6e = this.b.b;
            ep0 ep0 = new ep0(this.c.a);
            this.a = 1;
            if (n6e.a(ep0, this) == coroutine_suspended) {
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
