package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: yz1  reason: default package */
public final class yz1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ d02 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yz1(d02 d02, Continuation continuation) {
        super(2, continuation);
        this.b = d02;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        yz1 yz1 = new yz1(this.b, continuation);
        yz1.a = obj;
        return yz1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yz1) create((qz1) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        qz1 qz1 = (qz1) this.a;
        d02 d02 = this.b;
        d02.w.setValue(qz1.a);
        d02.o.setValue(qz1.b);
        return Unit.INSTANCE;
    }
}
