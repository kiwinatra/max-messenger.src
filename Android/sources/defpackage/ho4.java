package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ho4  reason: default package */
public final class ho4 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ io4 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ho4(io4 io4, Continuation continuation) {
        super(2, continuation);
        this.b = io4;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ho4(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ho4) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n6e n6e = this.b.d;
            go4 go4 = go4.a;
            this.a = 1;
            if (n6e.a(go4, this) == coroutine_suspended) {
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
