package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: hwa  reason: default package */
public final class hwa extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ jwa b;
    public final /* synthetic */ vk3 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hwa(jwa jwa, vk3 vk3, Continuation continuation) {
        super(2, continuation);
        this.b = jwa;
        this.c = vk3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new hwa(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hwa) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            jca b2 = this.b.b();
            this.a = 1;
            obj = b2.c(this.c, this);
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
