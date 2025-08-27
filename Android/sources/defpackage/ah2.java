package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ah2  reason: default package */
public final class ah2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ gh2 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ah2(gh2 gh2, Continuation continuation) {
        super(2, continuation);
        this.a = gh2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ah2(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ah2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        gh2.l(this.a);
        return Unit.INSTANCE;
    }
}
