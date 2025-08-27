package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ym5  reason: default package */
public final class ym5 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ zm5 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ym5(zm5 zm5, Continuation continuation) {
        super(2, continuation);
        this.b = zm5;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ym5 ym5 = new ym5(this.b, continuation);
        ym5.a = obj;
        return ym5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ym5) create((f00) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.y((f00) this.a);
        return Unit.INSTANCE;
    }
}
