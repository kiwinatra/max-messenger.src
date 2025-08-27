package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: nl8  reason: default package */
public final class nl8 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ xt1 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nl8(Continuation continuation, xt1 xt1) {
        super(2, continuation);
        this.b = xt1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        nl8 nl8 = new nl8(continuation, this.b);
        nl8.a = obj;
        return nl8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nl8) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.setVisibility(((Boolean) this.a).booleanValue() ? 0 : 8);
        return Unit.INSTANCE;
    }
}
