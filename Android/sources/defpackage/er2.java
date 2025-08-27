package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: er2  reason: default package */
public final class er2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ fr2 a;
    public final /* synthetic */ a32 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public er2(fr2 fr2, a32 a32, Continuation continuation) {
        super(2, continuation);
        this.a = fr2;
        this.b = a32;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new er2(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((er2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        fr2.j(this.a, this.b.a);
        return Unit.INSTANCE;
    }
}
