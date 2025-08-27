package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: wh2  reason: default package */
public final class wh2 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ aj2 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wh2(aj2 aj2, Continuation continuation) {
        super(2, continuation);
        this.c = aj2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        wh2 wh2 = new wh2(this.c, continuation);
        wh2.b = obj;
        return wh2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wh2) create((fb9) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (aj2.k(this.c, (fb9) this.b, this) == coroutine_suspended) {
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
