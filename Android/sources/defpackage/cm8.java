package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: cm8  reason: default package */
public final class cm8 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ xqd b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cm8(Continuation continuation, xqd xqd) {
        super(2, continuation);
        this.b = xqd;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        cm8 cm8 = new cm8(continuation, this.b);
        cm8.a = obj;
        return cm8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cm8) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.G((List) this.a);
        return Unit.INSTANCE;
    }
}
