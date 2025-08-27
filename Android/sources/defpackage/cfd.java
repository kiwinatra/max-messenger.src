package defpackage;

import android.os.Parcelable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* renamed from: cfd  reason: default package */
public final class cfd extends SuspendLambda implements Function2 {
    public final /* synthetic */ ScheduledSendPickerDialogFragment a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cfd(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment, Continuation continuation) {
        super(2, continuation);
        this.a = scheduledSendPickerDialogFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new cfd(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cfd) create((r5a) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.a;
        c84 c84 = (c84) scheduledSendPickerDialogFragment.d3().g.a.getValue();
        if (c84 == null) {
            return Unit.INSTANCE;
        }
        ScheduledSendPickerViewModel d3 = scheduledSendPickerDialogFragment.d3();
        scheduledSendPickerDialogFragment.e3(new wed(c84, ((Boolean) d3.p.getValue(d3, ScheduledSendPickerViewModel.q[0])).booleanValue(), (Parcelable) scheduledSendPickerDialogFragment.F1.getValue()));
        scheduledSendPickerDialogFragment.a3();
        return Unit.INSTANCE;
    }
}
