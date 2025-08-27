package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: bj9  reason: default package */
public final class bj9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ cj9 b;
    public final /* synthetic */ fb9 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bj9(cj9 cj9, fb9 fb9, Continuation continuation) {
        super(2, continuation);
        this.b = cj9;
        this.c = fb9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new bj9(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bj9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n6e n6e = this.b.c;
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
