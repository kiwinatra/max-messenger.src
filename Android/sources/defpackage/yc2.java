package defpackage;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: yc2  reason: default package */
public final class yc2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ t70 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yc2(t70 t70, Continuation continuation) {
        super(2, continuation);
        this.b = t70;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new yc2(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yc2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            t70 t70 = this.b;
            this.a = 1;
            obj = ((qx2) ((Lazy) t70.v).getValue()).d(t70.a, this);
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
