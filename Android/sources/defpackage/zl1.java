package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: zl1  reason: default package */
public final class zl1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ph1 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zl1(ph1 ph1, Continuation continuation) {
        super(2, continuation);
        this.b = ph1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        zl1 zl1 = new zl1(this.b, continuation);
        zl1.a = obj;
        return zl1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zl1) create((lnf) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        z68.c(this.b.getClass().getName(), ((lnf) this.a).toString(), new Object[0]);
        return Unit.INSTANCE;
    }
}
