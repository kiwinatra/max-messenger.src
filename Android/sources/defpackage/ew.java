package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ew  reason: default package */
public final class ew extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ gx b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ew(gx gxVar, long j, Continuation continuation) {
        super(2, continuation);
        this.b = gxVar;
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ew(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ew) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            gx gxVar = this.b;
            u0d u0d = gxVar.k;
            this.a = 1;
            obj = gx.b(gxVar, u0d, this.c, this);
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
