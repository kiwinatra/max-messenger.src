package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ow7  reason: default package */
public final class ow7 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ qw7 b;
    public final /* synthetic */ nw7 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ow7(qw7 qw7, nw7 nw7, Continuation continuation) {
        super(2, continuation);
        this.b = qw7;
        this.c = nw7;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ow7(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ow7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n6e n6e = this.b.a;
            nw7 nw7 = this.c;
            iw7 iw7 = new iw7(nw7.a, nw7.b, nw7.c, nw7.o, nw7.v, nw7.w, nw7.x, nw7.y);
            this.a = 1;
            if (n6e.a(iw7, this) == coroutine_suspended) {
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
