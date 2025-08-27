package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: x82  reason: default package */
public final class x82 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ Lazy b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x82(Lazy lazy, Continuation continuation) {
        super(2, continuation);
        this.b = lazy;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        x82 x82 = new x82(this.b, continuation);
        x82.a = obj;
        return x82;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((x82) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ((ara) ((s82) this.b.getValue())).b.d((List) this.a);
        return Unit.INSTANCE;
    }
}
