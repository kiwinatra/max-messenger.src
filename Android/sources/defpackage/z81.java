package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* renamed from: z81  reason: default package */
public final class z81 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ CallIndicatorWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z81(CallIndicatorWidget callIndicatorWidget, Continuation continuation) {
        super(2, continuation);
        this.b = callIndicatorWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        z81 z81 = new z81(this.b, continuation);
        z81.a = obj;
        return z81;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((z81) create((p81) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        p81 p81 = (p81) this.a;
        r81 c0 = CallIndicatorWidget.c0(this.b);
        c0.setTitle(p81.a);
        c0.setIndicatorState(p81.b);
        return Unit.INSTANCE;
    }
}
