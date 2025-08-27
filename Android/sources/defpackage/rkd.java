package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: rkd  reason: default package */
public final class rkd extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ tkd b;
    public final /* synthetic */ sk2 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rkd(tkd tkd, sk2 sk2, Continuation continuation) {
        super(2, continuation);
        this.b = tkd;
        this.c = sk2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new rkd(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rkd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n6e n6e = this.b.a;
            pkd pkd = new pkd(this.c);
            this.a = 1;
            if (n6e.a(pkd, this) == coroutine_suspended) {
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
