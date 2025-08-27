package defpackage;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: fa6  reason: default package */
public final class fa6 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ d19 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fa6(Object obj, Continuation continuation, d19 d19) {
        super(2, continuation);
        this.b = obj;
        this.c = d19;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new fa6(this.b, continuation, this.c);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fa6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mka a2 = ((c48) ((Lazy) this.c.b).getValue()).a(((Number) this.b).longValue(), false);
            this.a = 1;
            obj = bs0.f(a2, this);
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
