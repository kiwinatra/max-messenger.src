package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: uu7  reason: default package */
public final class uu7 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ vu7 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uu7(vu7 vu7, Continuation continuation) {
        super(2, continuation);
        this.b = vu7;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        uu7 uu7 = new uu7(this.b, continuation);
        uu7.a = obj;
        return uu7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((uu7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) this.a;
        vu7 vu7 = this.b;
        if (((lv7) vu7.a).d.compareTo(iu7.b) >= 0) {
            vu7.a.a(vu7);
        } else {
            kv0.n(d14.U(), (CancellationException) null);
        }
        return Unit.INSTANCE;
    }
}
