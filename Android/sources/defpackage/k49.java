package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: k49  reason: default package */
public final class k49 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ r49 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k49(Object obj, Continuation continuation, r49 r49) {
        super(2, continuation);
        this.b = obj;
        this.c = r49;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new k49(this.b, continuation, this.c);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k49) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        r49 r49 = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long longValue = ((Number) this.b).longValue();
            this.a = 1;
            obj = ((eu3) r49.X.getValue()).b(longValue, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vk3 vk3 = (vk3) obj;
        if (vk3 != null) {
            return ((gh4) r49.v0.getValue()).f(vk3);
        }
        return null;
    }
}
