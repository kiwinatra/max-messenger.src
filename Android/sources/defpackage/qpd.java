package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: qpd  reason: default package */
public final class qpd extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ bqd b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qpd(Continuation continuation, bqd bqd) {
        super(2, continuation);
        this.b = bqd;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        qpd qpd = new qpd(continuation, this.b);
        qpd.a = obj;
        return qpd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qpd) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.G((List) this.a);
        return Unit.INSTANCE;
    }
}
