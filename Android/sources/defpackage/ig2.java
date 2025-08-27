package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ig2  reason: default package */
public final class ig2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ gh2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ig2(gh2 gh2, Continuation continuation) {
        super(2, continuation);
        this.b = gh2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ig2 ig2 = new ig2(this.b, continuation);
        ig2.a = obj;
        return ig2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ig2) create((os8) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.z0.updateAndGet(new n01(3, (os8) this.a));
        return Unit.INSTANCE;
    }
}
