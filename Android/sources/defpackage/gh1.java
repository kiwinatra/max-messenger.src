package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;

/* renamed from: gh1  reason: default package */
public final class gh1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ CallScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gh1(Continuation continuation, CallScreen callScreen) {
        super(2, continuation);
        this.b = callScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        gh1 gh1 = new gh1(continuation, this.b);
        gh1.a = obj;
        return gh1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gh1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        jl1 jl1 = (jl1) this.a;
        gga gga = CallScreen.J0;
        CallScreen callScreen = this.b;
        callScreen.getClass();
        il1 il1 = jl1 != null ? jl1.a : null;
        int i = il1 == null ? -1 : bh1.$EnumSwitchMapping$0[il1.ordinal()];
        if (i == 1) {
            xl1 j0 = callScreen.j0();
            if (j0 != null) {
                ((CallTopPanelWidget) j0).c0().setTitle(jl1.b);
            }
            xl1 j02 = callScreen.j0();
            if (j02 != null) {
                ((CallTopPanelWidget) j02).c0().setStatus(jl1.c);
            }
        } else if (i == 2) {
            xl1 j03 = callScreen.j0();
            if (j03 != null) {
                ((CallTopPanelWidget) j03).c0().setTitle((CharSequence) null);
            }
            xl1 j04 = callScreen.j0();
            if (j04 != null) {
                ((CallTopPanelWidget) j04).c0().setStatus((CharSequence) null);
            }
        }
        return Unit.INSTANCE;
    }
}
