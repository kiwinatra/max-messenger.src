package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: bf5  reason: default package */
public final class bf5 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ cf5 b;
    public final /* synthetic */ af5 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bf5(cf5 cf5, Continuation continuation) {
        super(2, continuation);
        af5 af5 = af5.a;
        this.b = cf5;
        this.c = af5;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new bf5(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bf5) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n6e n6e = this.b.b;
            this.a = 1;
            if (n6e.a(this.c, this) == coroutine_suspended) {
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
