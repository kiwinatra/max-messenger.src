package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;

/* renamed from: c81  reason: default package */
public final class c81 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ CallIncomingScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c81(CallIncomingScreen callIncomingScreen, Continuation continuation) {
        super(2, continuation);
        this.b = callIncomingScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        c81 c81 = new c81(this.b, continuation);
        c81.a = obj;
        return c81;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c81) create((f81) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        f81 f81 = (f81) this.a;
        boolean z = f81 instanceof d81;
        CallIncomingScreen callIncomingScreen = this.b;
        if (z) {
            u9a u9a = CallIncomingScreen.x;
            callIncomingScreen.getClass();
            tm1 tm1 = (tm1) callIncomingScreen.c.getValue(callIncomingScreen, CallIncomingScreen.y[0]);
            d81 d81 = (d81) f81;
            tm1.setAvatar(d81.a.c);
            tm1.setName(d81.a.b);
            tm1.setStatus(d81.c);
            tm1.a0(pec.ic_cancel_call_25, ykc.call_incoming_decline_accessibility, new s01(callIncomingScreen.c0()));
            tm1.b0(true, pec.ic_call_22, ykc.call_incoming_accept_accessibility, new s01(2, (Object) callIncomingScreen));
        } else if (f81 instanceof e81) {
            u9a u9a2 = CallIncomingScreen.x;
            kne.B(callIncomingScreen.requireActivity(), ((e81) f81).a);
            h81 c0 = callIncomingScreen.c0();
            c0.w.a().remove(c0);
            View requireView = callIncomingScreen.requireView();
            if (requireView.getMeasuredWidth() == 0 || requireView.getMeasuredHeight() == 0) {
                callIncomingScreen.requireView().post(new b(23, (Object) callIncomingScreen));
            } else {
                callIncomingScreen.getRouter().B(callIncomingScreen);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
