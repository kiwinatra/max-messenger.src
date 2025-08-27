package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: xp3  reason: default package */
public final class xp3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ yp3 b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xp3(yp3 yp3, long j, Continuation continuation) {
        super(2, continuation);
        this.b = yp3;
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new xp3(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xp3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (((h4f) this.b.Y.getValue()).a(this.c, this) == coroutine_suspended) {
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
