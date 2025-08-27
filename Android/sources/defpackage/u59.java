package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: u59  reason: default package */
public final class u59 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ x59 b;
    public final /* synthetic */ a32 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u59(x59 x59, a32 a32, Continuation continuation) {
        super(2, continuation);
        this.b = x59;
        this.c = a32;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new u59(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u59) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (x59.k(this.b, this.c, this) == coroutine_suspended) {
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
