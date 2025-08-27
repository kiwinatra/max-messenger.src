package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ncb  reason: default package */
public final class ncb extends SuspendLambda implements Function2 {
    public final /* synthetic */ ocb a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ncb(ocb ocb, Continuation continuation) {
        super(2, continuation);
        this.a = ocb;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ncb(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ncb) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ocb ocb = this.a;
        ocb.a.registerActivityLifecycleCallbacks(ocb.c);
        return Unit.INSTANCE;
    }
}
