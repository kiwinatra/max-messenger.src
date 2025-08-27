package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: rv5  reason: default package */
public final class rv5 extends SuspendLambda implements Function2 {
    public final /* synthetic */ u08 a;
    public final /* synthetic */ dla b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rv5(u08 u08, yr1 yr1, Continuation continuation) {
        super(2, continuation);
        this.a = u08;
        this.b = yr1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new rv5(this.a, (yr1) this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rv5) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.a.f(this.b);
        return Unit.INSTANCE;
    }
}
