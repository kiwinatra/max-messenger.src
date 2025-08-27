package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: hyb  reason: default package */
public final class hyb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ syb b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hyb(syb syb, Continuation continuation) {
        super(2, continuation);
        this.b = syb;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        hyb hyb = new hyb(this.b, continuation);
        hyb.a = obj;
        return hyb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hyb) create((cyb) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.Z.setValue((cyb) this.a);
        return Unit.INSTANCE;
    }
}
