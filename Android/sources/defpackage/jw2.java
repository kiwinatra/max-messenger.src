package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: jw2  reason: default package */
public final class jw2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ tw2 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jw2(tw2 tw2, Continuation continuation) {
        super(2, continuation);
        this.a = tw2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new jw2(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jw2) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.a.b.d();
        return Unit.INSTANCE;
    }
}
