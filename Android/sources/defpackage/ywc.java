package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: ywc  reason: default package */
public final class ywc extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ RecordControlsWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ywc(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.b = recordControlsWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ywc ywc = new ywc(continuation, this.b);
        ywc.a = obj;
        return ywc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ywc) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        long longValue = ((Number) this.a).longValue();
        KProperty[] kPropertyArr = RecordControlsWidget.g1;
        RecordControlsWidget recordControlsWidget = this.b;
        recordControlsWidget.r0().setText(b0h.d(longValue));
        recordControlsWidget.o0().setText(b0h.d(longValue));
        return Unit.INSTANCE;
    }
}
