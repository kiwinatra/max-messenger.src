package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: o24  reason: default package */
public final class o24 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ p24 b;
    public final /* synthetic */ hj0 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o24(p24 p24, hj0 hj0, Continuation continuation) {
        super(2, continuation);
        this.b = p24;
        this.c = hj0;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new o24(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o24) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n6e n6e = this.b.a;
            k24 k24 = new k24(this.c.a);
            this.a = 1;
            if (n6e.a(k24, this) == coroutine_suspended) {
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
