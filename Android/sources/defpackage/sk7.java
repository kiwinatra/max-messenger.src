package defpackage;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: sk7  reason: default package */
public final class sk7 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Lazy a;
    public final /* synthetic */ ysa b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sk7(Lazy lazy, ysa ysa, Continuation continuation) {
        super(2, continuation);
        this.a = lazy;
        this.b = ysa;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new sk7(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sk7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String B = y7e.B((aeb) this.a.getValue(), this.b.a);
        if (B == null) {
            B = "";
        }
        return new mgf(B);
    }
}
