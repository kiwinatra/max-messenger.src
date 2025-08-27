package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: id7  reason: default package */
public final class id7 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ yd7 b;
    public final /* synthetic */ wk6 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public id7(yd7 yd7, wk6 wk6, Continuation continuation) {
        super(2, continuation);
        this.b = yd7;
        this.c = wk6;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new id7(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((id7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        wk6 wk6 = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            vk6 vk6 = wk6.a;
            this.a = 1;
            obj = yd7.a(vk6, this.b, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return wk6.a(wk6, ((Number) obj).intValue(), false, 13);
    }
}
