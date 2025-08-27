package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: d1c  reason: default package */
public final class d1c extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ j1c b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d1c(j1c j1c, Continuation continuation) {
        super(2, continuation);
        this.b = j1c;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new d1c(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d1c) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            xz4 xz4 = this.b.b;
            this.a = 1;
            if (xz4.i() == coroutine_suspended) {
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
