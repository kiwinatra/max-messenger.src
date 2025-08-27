package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: ske  reason: default package */
public final class ske extends SuspendLambda implements Function2 {
    public final /* synthetic */ Ref.ObjectRef a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ske(Ref.ObjectRef objectRef, Continuation continuation) {
        super(2, continuation);
        this.a = objectRef;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ske(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ske) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        mq1 mq1 = (mq1) this.a.element;
        if (mq1 != null) {
            mq1.b();
        }
        return Unit.INSTANCE;
    }
}
