package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: gde  reason: default package */
public final class gde extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ hde b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gde(hde hde, Continuation continuation) {
        super(2, continuation);
        this.b = hde;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        gde gde = new gde(this.b, continuation);
        gde.a = obj;
        return gde;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gde) create((f00) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        hde.b(this.b, (f00) this.a);
        return Unit.INSTANCE;
    }
}
