package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ln3  reason: default package */
public final class ln3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ pn3 a;
    public final /* synthetic */ m0g b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ln3(pn3 pn3, m0g m0g, Continuation continuation) {
        super(2, continuation);
        this.a = pn3;
        this.b = m0g;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ln3(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ln3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [l0g, java.lang.Object] */
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ? obj2 = new Object();
        obj2.q = this.b;
        return Boxing.boxLong(((rl) this.a.A.getValue()).a(new n0g(obj2)));
    }
}
