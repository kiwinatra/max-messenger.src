package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;

/* renamed from: dm1  reason: default package */
public final class dm1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ CallTopPanelWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dm1(Continuation continuation, CallTopPanelWidget callTopPanelWidget) {
        super(2, continuation);
        this.b = callTopPanelWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        dm1 dm1 = new dm1(continuation, this.b);
        dm1.a = obj;
        return dm1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dm1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        lnf lnf = (lnf) this.a;
        KProperty[] kPropertyArr = CallTopPanelWidget.o;
        vl1 c0 = this.b.c0();
        c0.setVisibility(lnf.d ? 0 : 8);
        if (c0.getVisibility() == 0) {
            c0.setMode(lnf.c);
            c0.c(lnf.e);
            c0.d(lnf.f, lnf.i);
            c0.setMoreState(lnf.g);
            c0.setAddUserState(lnf.h);
            c0.e(lnf.b);
        }
        return Unit.INSTANCE;
    }
}
