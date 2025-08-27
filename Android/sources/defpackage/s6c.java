package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: s6c  reason: default package */
public final class s6c extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ k7c b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s6c(k7c k7c, Continuation continuation) {
        super(2, continuation);
        this.b = k7c;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        s6c s6c = new s6c(this.b, continuation);
        s6c.a = obj;
        return s6c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((s6c) create((fwb) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        fwb fwb = (fwb) this.a;
        k7c k7c = this.b;
        k7c.G0.setValue(fwb.a);
        k7c.C0.setValue(fwb.b);
        k7c.E0.setValue(fwb.c);
        return Unit.INSTANCE;
    }
}
