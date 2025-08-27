package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: sua  reason: default package */
public final class sua extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ uua b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sua(uua uua, Continuation continuation) {
        super(2, continuation);
        this.b = uua;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new sua(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sua) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            obj = ((kr9) this.b.c.getValue()).g(this);
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
