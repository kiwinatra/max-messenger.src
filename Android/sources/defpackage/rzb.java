package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: rzb  reason: default package */
public final class rzb extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ szb b;
    public final /* synthetic */ yr2 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rzb(szb szb, yr2 yr2, Continuation continuation) {
        super(2, continuation);
        this.b = szb;
        this.c = yr2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new rzb(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rzb) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n6e n6e = this.b.a;
            izb izb = new izb(this.c.a);
            this.a = 1;
            if (n6e.a(izb, this) == coroutine_suspended) {
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
