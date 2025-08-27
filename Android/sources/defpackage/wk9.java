package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: wk9  reason: default package */
public final class wk9 extends SuspendLambda implements Function2 {
    public final /* synthetic */ en9 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wk9(en9 en9, Continuation continuation) {
        super(2, continuation);
        this.a = en9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new wk9(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wk9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        j00 j00 = this.a.y0;
        pm7 K = bs0.K(new ps5(new on2(j00.a.c, 28), new i00(j00, (Continuation) null), 5), j00.c);
        j00.d.setValue(j00, j00.f[0], K);
        return Unit.INSTANCE;
    }
}
