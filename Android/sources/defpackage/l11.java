package defpackage;

import android.view.View;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* renamed from: l11  reason: default package */
public final class l11 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ CallBottomPanelWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l11(Continuation continuation, CallBottomPanelWidget callBottomPanelWidget) {
        super(2, continuation);
        this.b = callBottomPanelWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        l11 l11 = new l11(continuation, this.b);
        l11.a = obj;
        return l11;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l11) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        pr0 pr0 = (pr0) this.a;
        KProperty[] kPropertyArr = CallBottomPanelWidget.y;
        CallBottomPanelWidget callBottomPanelWidget = this.b;
        b11 c0 = callBottomPanelWidget.c0();
        b11 c02 = callBottomPanelWidget.c0();
        aje aje = null;
        if (!(c02 instanceof View)) {
            c02 = null;
        }
        if (c02 != null && c02.getVisibility() == 0) {
            c0.setVideoEnabled(pr0.b);
            aj8 aj8 = pr0.a;
            c0.setMicrophoneEnabled(aj8);
            callBottomPanelWidget.c0().setAudioInfo(pr0.c);
            b11 c03 = callBottomPanelWidget.c0();
            boolean z = aj8 == aj8.c;
            if (((jj1) callBottomPanelWidget.d0()).n()) {
                if (z) {
                    aje = ev0.v(callBottomPanelWidget.getViewLifecycleScope(), (CoroutineContext) null, (f14) null, new j11(callBottomPanelWidget, c03, (Continuation) null), 3);
                }
                callBottomPanelWidget.v.setValue(callBottomPanelWidget, CallBottomPanelWidget.y[1], aje);
            }
        }
        return Unit.INSTANCE;
    }
}
