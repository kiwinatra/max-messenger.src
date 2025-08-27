package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: xqa  reason: default package */
public final class xqa extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ yqa b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xqa(yqa yqa, Continuation continuation) {
        super(2, continuation);
        this.b = yqa;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new xqa(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xqa) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            yqa yqa = this.b;
            long j = yqa.b;
            this.a = 1;
            obj = ((qx2) yqa.c.getValue()).d(j, this);
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
