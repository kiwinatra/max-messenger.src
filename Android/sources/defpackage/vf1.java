package defpackage;

import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;

/* renamed from: vf1  reason: default package */
public final class vf1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ View b;
    public final /* synthetic */ CallRateBottomSheet c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vf1(Continuation continuation, View view, CallRateBottomSheet callRateBottomSheet) {
        super(2, continuation);
        this.b = view;
        this.c = callRateBottomSheet;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        vf1 vf1 = new vf1(continuation, this.b, this.c);
        vf1.a = obj;
        return vf1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vf1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List<cg1> list = (List) this.a;
        CallRateBottomSheet callRateBottomSheet = this.c;
        TransitionManager.beginDelayedTransition((ViewGroup) this.b, callRateBottomSheet.z0);
        npc q0 = callRateBottomSheet.q0();
        q0.y0.clear();
        q0.removeAllViews();
        callRateBottomSheet.q0().setVisibility(list.isEmpty() ^ true ? 0 : 8);
        for (cg1 cg1 : list) {
            callRateBottomSheet.q0().a(cg1.a, String.valueOf(cg1.b.a(callRateBottomSheet.getContext())));
        }
        return Unit.INSTANCE;
    }
}
