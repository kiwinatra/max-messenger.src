package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: op1  reason: default package */
public final class op1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ rp1 b;
    public final /* synthetic */ zu3 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public op1(rp1 rp1, zu3 zu3, Continuation continuation) {
        super(2, continuation);
        this.b = rp1;
        this.c = zu3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new op1(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((op1) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n6e n6e = this.b.a;
            y41 y41 = new y41(CollectionsKt.toSet(this.c.b));
            this.a = 1;
            if (n6e.a(y41, this) == coroutine_suspended) {
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
