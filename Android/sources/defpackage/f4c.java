package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: f4c  reason: default package */
public final class f4c extends SuspendLambda implements Function2 {
    public final /* synthetic */ q4c a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f4c(q4c q4c, Continuation continuation) {
        super(2, continuation);
        this.a = q4c;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new f4c(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f4c) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        e0b e0b = (e0b) this.a.x.getValue();
        e0b.h(new igf(ixa.F1));
        e0b.f(new o0b(cad.K));
        e0b.j();
        return Unit.INSTANCE;
    }
}
