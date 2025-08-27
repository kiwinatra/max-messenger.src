package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: zh0  reason: default package */
public final class zh0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ei0 b;
    public final /* synthetic */ qh0 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zh0(ei0 ei0, ry2 ry2, Continuation continuation) {
        super(2, continuation);
        this.b = ei0;
        this.c = ry2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new zh0(this.b, (ry2) this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zh0) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            ei0 ei0 = this.b;
            ei0.getClass();
            Object d = e14.d(new di0(ei0, this.c, (Continuation) null), this);
            if (d != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                d = Unit.INSTANCE;
            }
            if (d == coroutine_suspended) {
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
