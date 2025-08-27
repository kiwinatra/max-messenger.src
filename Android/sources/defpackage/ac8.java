package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ac8  reason: default package */
public final class ac8 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ec8 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ac8(ec8 ec8, Continuation continuation) {
        super(2, continuation);
        this.a = ec8;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ac8(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ac8) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ((ecb) this.a.c.getValue()).d(vbb.FAILED, ubb.TIMEOUT);
        return Unit.INSTANCE;
    }
}
