package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: v96  reason: default package */
public final class v96 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ Function1 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v96(Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.b = function1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        v96 v96 = new v96(continuation, this.b);
        v96.a = obj;
        return v96;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((v96) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.invoke((v5a) this.a);
        return Unit.INSTANCE;
    }
}
