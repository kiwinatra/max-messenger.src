package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ae1  reason: default package */
public final class ae1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ he1 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ae1(he1 he1, Continuation continuation) {
        super(2, continuation);
        this.b = he1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ae1(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ae1) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            he1 he1 = this.b;
            etc etc = ((v9b) he1.b).Y;
            zd1 zd1 = new zd1(he1, (Continuation) null);
            this.a = 1;
            if (bs0.t(etc, zd1, this) == coroutine_suspended) {
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
