package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ra1  reason: default package */
public final class ra1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ya1 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ra1(ya1 ya1, Continuation continuation) {
        super(2, continuation);
        this.a = ya1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ra1(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ra1) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ya1 ya1 = this.a;
        ya1.x0 = Boxing.boxLong(((jna) ((rl) ya1.w.getValue())).F(f6e.J(this.a.b), true));
        return Unit.INSTANCE;
    }
}
