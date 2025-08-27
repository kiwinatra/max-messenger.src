package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: nz1  reason: default package */
public final class nz1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ Function1 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nz1(Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.b = function1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        nz1 nz1 = new nz1(continuation, this.b);
        nz1.a = obj;
        return nz1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nz1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.invoke((v5a) this.a);
        return Unit.INSTANCE;
    }
}
