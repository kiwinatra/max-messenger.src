package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: l0e  reason: default package */
public final class l0e extends SuspendLambda implements Function2 {
    public final /* synthetic */ n0e a;
    public final /* synthetic */ long b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l0e(n0e n0e, long j, Continuation continuation) {
        super(2, continuation);
        this.a = n0e;
        this.b = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new l0e(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l0e) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        n0e n0e = this.a;
        a32 q = ((my2) ((qx2) n0e.v.getValue())).q(this.b);
        if (q != null) {
            i3e.b.getClass();
            xag.h(n0e.w0, new pa4(wj6.m(new StringBuilder(":profile?id="), q.a, "&type=local_chat&is_opened_from_dialog=false")));
        }
        return Unit.INSTANCE;
    }
}
