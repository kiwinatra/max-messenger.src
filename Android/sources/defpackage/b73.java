package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: b73  reason: default package */
public final class b73 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ c73 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b73(c73 c73, Continuation continuation) {
        super(2, continuation);
        this.b = c73;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        b73 b73 = new b73(this.b, continuation);
        b73.a = obj;
        return b73;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b73) create((i83) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.G(((i83) this.a).a());
        return Unit.INSTANCE;
    }
}
