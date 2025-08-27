package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: sg2  reason: default package */
public final class sg2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ gh2 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sg2(gh2 gh2, Continuation continuation) {
        super(2, continuation);
        this.a = gh2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new sg2(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sg2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = gh2.P0;
        e0b e0b = (e0b) this.a.v0.getValue();
        e0b.h(new igf(lxa.P1));
        e0b.f(new o0b(cad.o));
        return e0b.j();
    }
}
