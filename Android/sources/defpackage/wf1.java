package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: wf1  reason: default package */
public final class wf1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ CallRateBottomSheet b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wf1(Continuation continuation, CallRateBottomSheet callRateBottomSheet) {
        super(2, continuation);
        this.b = callRateBottomSheet;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        wf1 wf1 = new wf1(continuation, this.b);
        wf1.a = obj;
        return wf1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wf1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean booleanValue = ((Boolean) this.a).booleanValue();
        KProperty[] kPropertyArr = CallRateBottomSheet.G0;
        CallRateBottomSheet callRateBottomSheet = this.b;
        callRateBottomSheet.getClass();
        ((OneMeButton) callRateBottomSheet.E0.getValue(callRateBottomSheet, CallRateBottomSheet.G0[6])).setVisibility(booleanValue ? 0 : 8);
        return Unit.INSTANCE;
    }
}
