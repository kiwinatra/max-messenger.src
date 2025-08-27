package defpackage;

import android.view.View;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: xwc  reason: default package */
public final class xwc extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ RecordControlsWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xwc(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.b = recordControlsWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        xwc xwc = new xwc(continuation, this.b);
        xwc.a = obj;
        return xwc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xwc) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = RecordControlsWidget.g1;
        RecordControlsWidget recordControlsWidget = this.b;
        View A0 = recordControlsWidget.A0();
        fb1 fb1 = new fb1(4, (gwc) this.a, recordControlsWidget);
        if (A0.isLaidOut()) {
            fb1.invoke();
        } else if (!A0.isLaidOut() || A0.isLayoutRequested()) {
            A0.addOnLayoutChangeListener(new dr0(15, fb1));
        } else {
            fb1.invoke();
        }
        return Unit.INSTANCE;
    }
}
