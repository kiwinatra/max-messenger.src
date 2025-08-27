package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: gy2  reason: default package */
public final class gy2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ my2 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gy2(my2 my2, Continuation continuation) {
        super(2, continuation);
        this.a = my2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new gy2(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gy2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int i = my2.w;
        r62 n = this.a.n();
        n.getClass();
        return (a32) n.o0("create-saved-messages", new b62(n, 0));
    }
}
