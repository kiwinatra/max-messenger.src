package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: yg2  reason: default package */
public final class yg2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ l20 a;
    public final /* synthetic */ gh2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yg2(l20 l20, gh2 gh2, Continuation continuation) {
        super(2, continuation);
        this.a = l20;
        this.b = gh2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new yg2(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yg2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int i = this.a.d() ? lxa.M1 : lxa.N1;
        KProperty[] kPropertyArr = gh2.P0;
        e0b e0b = (e0b) this.b.v0.getValue();
        e0b.h(new igf(i));
        e0b.f(new o0b(cad.o));
        e0b.j();
        return Unit.INSTANCE;
    }
}
