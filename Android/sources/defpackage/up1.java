package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: up1  reason: default package */
public final class up1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ wp1 b;
    public final /* synthetic */ d31 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public up1(wp1 wp1, d31 d31, Continuation continuation) {
        super(2, continuation);
        this.b = wp1;
        this.c = d31;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new up1(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((up1) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n6e n6e = this.b.a;
            y61 y61 = new y61(this.c);
            this.a = 1;
            if (n6e.a(y61, this) == coroutine_suspended) {
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
