package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;

/* renamed from: uf1  reason: default package */
public final class uf1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ CallRateBottomSheet b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uf1(Continuation continuation, CallRateBottomSheet callRateBottomSheet) {
        super(2, continuation);
        this.b = callRateBottomSheet;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        uf1 uf1 = new uf1(continuation, this.b);
        uf1.a = obj;
        return uf1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((uf1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = CallRateBottomSheet.G0;
        CallRateBottomSheet callRateBottomSheet = this.b;
        callRateBottomSheet.getClass();
        ((ipc) callRateBottomSheet.C0.getValue(callRateBottomSheet, CallRateBottomSheet.G0[4])).setButtonToolDataList((List) this.a);
        return Unit.INSTANCE;
    }
}
