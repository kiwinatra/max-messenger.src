package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* renamed from: j11  reason: default package */
public final class j11 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ CallBottomPanelWidget b;
    public final /* synthetic */ b11 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j11(CallBottomPanelWidget callBottomPanelWidget, b11 b11, Continuation continuation) {
        super(2, continuation);
        this.b = callBottomPanelWidget;
        this.c = b11;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        j11 j11 = new j11(this.b, this.c, continuation);
        j11.a = obj;
        return j11;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j11) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = CallBottomPanelWidget.y;
        bs0.K(new ps5(this.b.e0().X, new wq0(2, this.c, b11.class, "setVolumeMicrophone", "setVolumeMicrophone(F)V", 4, 2), 5), (d14) this.a);
        return Unit.INSTANCE;
    }
}
