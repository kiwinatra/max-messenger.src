package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: t8a  reason: default package */
public final class t8a extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ x8a b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t8a(x8a x8a, Continuation continuation) {
        super(2, continuation);
        this.b = x8a;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        t8a t8a = new t8a(this.b, continuation);
        t8a.a = obj;
        return t8a;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t8a) create((ytb) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ytb ytb = (ytb) this.a;
        if (ytb == null) {
            return Unit.INSTANCE;
        }
        q7a q7a = ytb.c;
        this.b.x0.setValue(ytb.a);
        this.b.w.setValue(ytb.b);
        if (q7a == null) {
            return Unit.INSTANCE;
        }
        this.b.v = q7a;
        this.b.o.d(q7a);
        return Unit.INSTANCE;
    }
}
