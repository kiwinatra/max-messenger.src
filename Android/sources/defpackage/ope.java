package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ope  reason: default package */
public final class ope extends SuspendLambda implements Function2 {
    public final /* synthetic */ upe a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ope(upe upe, Continuation continuation) {
        super(2, continuation);
        this.a = upe;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ope(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ope) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        a32 a32 = (a32) ((my2) ((qx2) this.a.z.getValue())).o(this.a.b).a.getValue();
        if (a32 == null) {
            return Unit.INSTANCE;
        }
        xme xme = this.a.x0;
        a32.l0();
        xme.setValue(a32.X);
        return Unit.INSTANCE;
    }
}
