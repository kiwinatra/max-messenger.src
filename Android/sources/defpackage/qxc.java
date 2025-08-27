package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;

/* renamed from: qxc  reason: default package */
public final class qxc extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ RecordExitBottomSheet b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qxc(Continuation continuation, RecordExitBottomSheet recordExitBottomSheet) {
        super(2, continuation);
        this.b = recordExitBottomSheet;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        qxc qxc = new qxc(continuation, this.b);
        qxc.a = obj;
        return qxc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qxc) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = RecordExitBottomSheet.F0;
        this.b.u0().setDescription((CharSequence) this.a);
        return Unit.INSTANCE;
    }
}
