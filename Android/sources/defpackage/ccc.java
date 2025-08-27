package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ccc  reason: default package */
public final class ccc extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ecc b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ccc(Continuation continuation, ecc ecc) {
        super(2, continuation);
        this.b = ecc;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ccc ccc = new ccc(continuation, this.b);
        ccc.a = obj;
        return ccc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ccc) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ecc.a(this.b, (zs1) this.a);
        return Unit.INSTANCE;
    }
}
