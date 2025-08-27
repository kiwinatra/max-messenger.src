package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ai0  reason: default package */
public final class ai0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ei0 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ai0(ei0 ei0, Continuation continuation) {
        super(2, continuation);
        this.b = ei0;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ai0(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ai0) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            obj = ((eu3) this.b.b.getValue()).e();
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Number) obj).intValue() != 0) {
            z = false;
        }
        return Boxing.boxBoolean(z);
    }
}
