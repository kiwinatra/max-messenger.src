package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: sv5  reason: default package */
public final class sv5 extends SuspendLambda implements Function2 {
    public final /* synthetic */ u08 a;
    public final /* synthetic */ dla b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sv5(u08 u08, dla dla, Continuation continuation) {
        super(2, continuation);
        this.a = u08;
        this.b = dla;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new sv5(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sv5) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.a.f(this.b);
        return Unit.INSTANCE;
    }
}
