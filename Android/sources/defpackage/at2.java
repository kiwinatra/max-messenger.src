package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: at2  reason: default package */
public final class at2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ct2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public at2(ct2 ct2, Continuation continuation) {
        super(2, continuation);
        this.b = ct2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        at2 at2 = new at2(this.b, continuation);
        at2.a = obj;
        return at2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((at2) create((zx5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.c.setValue((zx5) this.a);
        return Unit.INSTANCE;
    }
}
