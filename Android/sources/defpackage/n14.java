package defpackage;

import java.util.concurrent.Callable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: n14  reason: default package */
public final class n14 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Callable a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n14(Callable callable, Continuation continuation) {
        super(2, continuation);
        this.a = callable;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new n14(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n14) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return this.a.call();
    }
}
