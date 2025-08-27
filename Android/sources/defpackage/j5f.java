package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: j5f  reason: default package */
public final class j5f extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ l5f b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j5f(l5f l5f, Continuation continuation) {
        super(2, continuation);
        this.b = l5f;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        j5f j5f = new j5f(this.b, continuation);
        j5f.a = obj;
        return j5f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j5f) create((qf9) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        qf9 qf9 = (qf9) this.a;
        return qf9.d == xyf.VIDEO ? kv0.h(((pz3) this.b.d.getValue()).a(qf9)) : new fs5(3, qf9);
    }
}
