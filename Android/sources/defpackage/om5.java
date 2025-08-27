package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: om5  reason: default package */
public final class om5 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ um5 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public om5(um5 um5, Continuation continuation) {
        super(2, continuation);
        this.b = um5;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new om5(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((om5) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            qm7 qm7 = this.b.j;
            this.a = 1;
            if (qm7.d(this) == coroutine_suspended) {
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
