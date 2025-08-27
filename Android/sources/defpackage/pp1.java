package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: pp1  reason: default package */
public final class pp1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ rp1 b;
    public final /* synthetic */ nw7 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pp1(rp1 rp1, nw7 nw7, Continuation continuation) {
        super(2, continuation);
        this.b = rp1;
        this.c = nw7;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new pp1(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pp1) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n6e n6e = this.b.a;
            w41 w41 = new w41(this.c);
            this.a = 1;
            if (n6e.a(w41, this) == coroutine_suspended) {
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
