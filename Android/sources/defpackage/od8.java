package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: od8  reason: default package */
public final class od8 extends SuspendLambda implements Function2 {
    public final /* synthetic */ hr6 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public od8(hr6 hr6, Continuation continuation) {
        super(2, continuation);
        this.a = hr6;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new od8(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((od8) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ivb ivb = ivb.y;
        ivb.y.w.a(new qyc(7, this.a));
        return Unit.INSTANCE;
    }
}
