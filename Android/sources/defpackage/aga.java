package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: aga  reason: default package */
public final class aga extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ fga b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aga(fga fga, Continuation continuation) {
        super(2, continuation);
        this.b = fga;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        aga aga = new aga(this.b, continuation);
        aga.a = obj;
        return aga;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((aga) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.x.setValue((List) this.a);
        return Unit.INSTANCE;
    }
}
