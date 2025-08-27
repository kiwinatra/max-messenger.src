package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: gp0  reason: default package */
public final class gp0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ jp0 b;
    public final /* synthetic */ zu3 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gp0(jp0 jp0, zu3 zu3, Continuation continuation) {
        super(2, continuation);
        this.b = jp0;
        this.c = zu3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new gp0(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gp0) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n6e n6e = this.b.b;
            dp0 dp0 = new dp0(this.c);
            this.a = 1;
            if (n6e.a(dp0, this) == coroutine_suspended) {
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
