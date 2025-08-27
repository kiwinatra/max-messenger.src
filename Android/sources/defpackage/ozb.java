package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ozb  reason: default package */
public final class ozb extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ szb b;
    public final /* synthetic */ pwb c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ozb(szb szb, pwb pwb, Continuation continuation) {
        super(2, continuation);
        this.b = szb;
        this.c = pwb;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ozb(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ozb) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n6e n6e = this.b.a;
            kzb kzb = new kzb(this.c.c);
            this.a = 1;
            if (n6e.a(kzb, this) == coroutine_suspended) {
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
