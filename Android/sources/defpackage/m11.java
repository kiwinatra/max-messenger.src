package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* renamed from: m11  reason: default package */
public final class m11 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ CallBottomPanelWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m11(Continuation continuation, CallBottomPanelWidget callBottomPanelWidget) {
        super(2, continuation);
        this.b = callBottomPanelWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        m11 m11 = new m11(continuation, this.b);
        m11.a = obj;
        return m11;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m11) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (((Boolean) this.a).booleanValue()) {
            KProperty[] kPropertyArr = CallBottomPanelWidget.y;
            CallBottomPanelWidget callBottomPanelWidget = this.b;
            callBottomPanelWidget.c0().a();
            mw3 mw3 = callBottomPanelWidget.w;
            if (mw3 != null) {
                mw3.dismiss();
            }
            callBottomPanelWidget.w = null;
        }
        return Unit.INSTANCE;
    }
}
