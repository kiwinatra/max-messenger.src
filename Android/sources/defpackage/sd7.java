package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: sd7  reason: default package */
public final class sd7 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ yd7 b;
    public final /* synthetic */ int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sd7(yd7 yd7, int i, Continuation continuation) {
        super(2, continuation);
        this.b = yd7;
        this.c = i;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        sd7 sd7 = new sd7(this.b, this.c, continuation);
        sd7.a = obj;
        return sd7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sd7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) this.a;
        yd7 yd7 = this.b;
        aje v = ev0.v(d14, (CoroutineContext) null, (f14) null, new qd7(yd7, (Continuation) null), 3);
        int i = this.c;
        v.V(new pd7(i, 0));
        ev0.v(d14, (CoroutineContext) null, (f14) null, new rd7(yd7, (Continuation) null), 3).V(new pd7(i, 1));
        return Unit.INSTANCE;
    }
}
