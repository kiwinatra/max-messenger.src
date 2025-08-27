package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: at5  reason: default package */
public final class at5 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ cwb b;
    public final /* synthetic */ Object c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public at5(cwb cwb, Object obj, Continuation continuation) {
        super(2, continuation);
        this.b = cwb;
        this.c = obj;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new at5(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((at5) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (((zvb) this.b).o.t(this.c, this) == coroutine_suspended) {
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
