package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: y08  reason: default package */
public final class y08 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ z08 b;
    public final /* synthetic */ Object c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y08(z08 z08, Object obj, Continuation continuation) {
        super(2, continuation);
        this.b = z08;
        this.c = obj;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new y08(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((y08) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        z08 z08 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            x04 x04 = z08.a;
            this.a = 1;
            if (x04.m(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z08.a.k(this.c);
        return Unit.INSTANCE;
    }
}
