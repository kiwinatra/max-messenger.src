package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: bn9  reason: default package */
public final class bn9 extends SuspendLambda implements Function2 {
    public final /* synthetic */ en9 a;
    public final /* synthetic */ ra3 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bn9(en9 en9, sa3 sa3, Continuation continuation) {
        super(2, continuation);
        this.a = en9;
        this.b = sa3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new bn9(this.a, (sa3) this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bn9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = en9.A1;
        e0b w = this.a.w();
        w.f(r0b.a);
        w.h(new igf(ewa.i0));
        w.g(new x0b(new igf(ewa.j0)));
        w.d(new td8(20, (sa3) this.b));
        w.j();
        return Unit.INSTANCE;
    }
}
