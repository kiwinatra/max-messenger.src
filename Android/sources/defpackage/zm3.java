package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: zm3  reason: default package */
public final class zm3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ pn3 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zm3(pn3 pn3, Continuation continuation) {
        super(2, continuation);
        this.b = pn3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new zm3(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zm3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            pn3 pn3 = this.b;
            this.a = 1;
            if (((zk3) pn3.y.getValue()).a(pn3.o) == coroutine_suspended) {
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
