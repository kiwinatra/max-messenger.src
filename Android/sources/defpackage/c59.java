package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c59  reason: default package */
public final class c59 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ l59 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c59(l59 l59, Continuation continuation) {
        super(2, continuation);
        this.b = l59;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        c59 c59 = new c59(this.b, continuation);
        c59.a = obj;
        return c59;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c59) create((r29) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (Intrinsics.areEqual((Object) (r29) this.a, (Object) r29.a)) {
            l59 l59 = this.b;
            if (l59.g.compareAndSet(false, true)) {
                ev0.v(l59.f, (CoroutineContext) null, (f14) null, new k59(l59, (Continuation) null), 3);
            }
            return Unit.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
