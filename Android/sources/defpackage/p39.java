package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: p39  reason: default package */
public final class p39 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ u39 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p39(u39 u39, Continuation continuation) {
        super(2, continuation);
        this.b = u39;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new p39(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p39) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n6e n6e = this.b.a;
            r29 r29 = r29.a;
            this.a = 1;
            if (n6e.a(r29, this) == coroutine_suspended) {
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
