package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;

/* renamed from: z4f  reason: default package */
public final class z4f extends SuspendLambda implements Function4 {
    public int a;
    public /* synthetic */ Throwable b;
    public final /* synthetic */ h5f c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z4f(h5f h5f, Continuation continuation) {
        super(4, continuation);
        this.c = h5f;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ds5 ds5 = (ds5) obj;
        ((Number) obj3).longValue();
        z4f z4f = new z4f(this.c, (Continuation) obj4);
        z4f.b = (Throwable) obj2;
        return z4f.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Throwable th = this.b;
            this.a = 1;
            obj = h5f.c(this.c, th, this);
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
