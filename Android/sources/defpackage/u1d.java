package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: u1d  reason: default package */
public final class u1d extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function2 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u1d(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.c = function2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        u1d u1d = new u1d(this.c, continuation);
        u1d.b = obj;
        return u1d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u1d) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (this.c.invoke((d14) this.b, this) == coroutine_suspended) {
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
