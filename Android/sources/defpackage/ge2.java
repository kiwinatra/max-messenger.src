package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ge2  reason: default package */
public final class ge2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ he2 b;
    public final /* synthetic */ fe2 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ge2(he2 he2, fe2 fe2, Continuation continuation) {
        super(2, continuation);
        this.b = he2;
        this.c = fe2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ge2(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ge2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
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
