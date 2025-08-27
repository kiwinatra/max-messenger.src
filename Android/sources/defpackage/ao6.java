package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ao6  reason: default package */
public final class ao6 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ gp6 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ao6(gp6 gp6, Continuation continuation) {
        super(2, continuation);
        this.b = gp6;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ao6 ao6 = new ao6(this.b, continuation);
        ao6.a = obj;
        return ao6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ao6) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.X.setValue((List) this.a);
        return Unit.INSTANCE;
    }
}
