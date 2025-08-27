package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* renamed from: k11  reason: default package */
public final class k11 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ CallBottomPanelWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k11(Continuation continuation, CallBottomPanelWidget callBottomPanelWidget) {
        super(2, continuation);
        this.b = callBottomPanelWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        k11 k11 = new k11(continuation, this.b);
        k11.a = obj;
        return k11;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k11) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean booleanValue = ((Boolean) this.a).booleanValue();
        CallBottomPanelWidget callBottomPanelWidget = this.b;
        if (booleanValue) {
            KProperty[] kPropertyArr = CallBottomPanelWidget.y;
            callBottomPanelWidget.c0().e();
        } else {
            KProperty[] kPropertyArr2 = CallBottomPanelWidget.y;
            callBottomPanelWidget.c0().b();
        }
        return Unit.INSTANCE;
    }
}
