package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: lzd  reason: default package */
public final class lzd extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ozd b;
    public final /* synthetic */ txd c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lzd(ozd ozd, txd txd, Continuation continuation) {
        super(2, continuation);
        this.b = ozd;
        this.c = txd;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new lzd(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lzd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n6e n6e = this.b.b;
            rzd rzd = new rzd(this.c);
            this.a = 1;
            if (n6e.a(rzd, this) == coroutine_suspended) {
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
