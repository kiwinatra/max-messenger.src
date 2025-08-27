package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: rua  reason: default package */
public final class rua extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ uua b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rua(uua uua, Continuation continuation) {
        super(2, continuation);
        this.b = uua;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new rua(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rua) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            obj = ((zq9) this.b.b.getValue()).g(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
