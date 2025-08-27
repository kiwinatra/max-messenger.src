package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: lh0  reason: default package */
public final class lh0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ nh0 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lh0(nh0 nh0, Continuation continuation) {
        super(2, continuation);
        this.a = nh0;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new lh0(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lh0) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        nh0 nh0 = this.a;
        nh0.a.registerActivityLifecycleCallbacks(nh0.f);
        return Unit.INSTANCE;
    }
}
