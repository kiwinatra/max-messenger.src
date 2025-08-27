package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: i4c  reason: default package */
public final class i4c extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ q4c b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i4c(q4c q4c, Continuation continuation) {
        super(2, continuation);
        this.b = q4c;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new i4c(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i4c) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            q4c q4c = this.b;
            this.a = 1;
            if (q4c.j(q4c, (c4c) q4c.y0.getValue(), this) == coroutine_suspended) {
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
