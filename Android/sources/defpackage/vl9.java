package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: vl9  reason: default package */
public final class vl9 extends SuspendLambda implements Function2 {
    public final /* synthetic */ en9 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vl9(en9 en9, Continuation continuation) {
        super(2, continuation);
        this.a = en9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new vl9(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vl9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = en9.A1;
        e0b w = this.a.w();
        w.f(new o0b(cad.K));
        w.h(new igf(ewa.d0));
        w.j();
        return Unit.INSTANCE;
    }
}
