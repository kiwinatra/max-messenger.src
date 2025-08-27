package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: bo7  reason: default package */
public final class bo7 extends SuspendLambda implements Function2 {
    public final /* synthetic */ do7 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bo7(do7 do7, Continuation continuation) {
        super(2, continuation);
        this.a = do7;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new bo7(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bo7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        do7 do7 = this.a;
        do7.o = ((jna) ((rl) do7.c.getValue())).m(do7.b, (String) null);
        return Unit.INSTANCE;
    }
}
