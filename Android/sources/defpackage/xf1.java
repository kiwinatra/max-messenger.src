package defpackage;

import android.transition.TransitionManager;
import android.view.ViewGroup;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;
import one.me.sdk.arch.Widget;

/* renamed from: xf1  reason: default package */
public final class xf1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ CallRateBottomSheet b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xf1(Continuation continuation, CallRateBottomSheet callRateBottomSheet) {
        super(2, continuation);
        this.b = callRateBottomSheet;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        xf1 xf1 = new xf1(continuation, this.b);
        xf1.a = obj;
        return xf1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xf1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        bg1 bg1 = (bg1) this.a;
        boolean areEqual = Intrinsics.areEqual((Object) bg1, (Object) ag1.a);
        CallRateBottomSheet callRateBottomSheet = this.b;
        if (areEqual) {
            KProperty[] kPropertyArr = CallRateBottomSheet.G0;
            TransitionManager.beginDelayedTransition((ViewGroup) callRateBottomSheet.getView(), callRateBottomSheet.z0);
            KProperty[] kPropertyArr2 = CallRateBottomSheet.G0;
            ((c54) callRateBottomSheet.F0.getValue(callRateBottomSheet, kPropertyArr2[7])).setVisibility(0);
            ((ipc) callRateBottomSheet.C0.getValue(callRateBottomSheet, kPropertyArr2[4])).setVisibility(8);
            callRateBottomSheet.q0().setVisibility(8);
        } else if (Intrinsics.areEqual((Object) bg1, (Object) yf1.a)) {
            KProperty[] kPropertyArr3 = CallRateBottomSheet.G0;
            callRateBottomSheet.q0().y.g();
        } else if (Intrinsics.areEqual((Object) bg1, (Object) zf1.a)) {
            e0b e0b = new e0b((Widget) callRateBottomSheet);
            e0b.h(new igf(sqa.c0));
            e0b.a(new igf(sqa.b0));
            e0b.f(new o0b(lya.o));
            e0b.j();
            callRateBottomSheet.i0(true);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
