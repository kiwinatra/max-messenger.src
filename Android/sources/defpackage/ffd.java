package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* renamed from: ffd  reason: default package */
public final class ffd extends SuspendLambda implements Function2 {
    public final /* synthetic */ ScheduledSendPickerViewModel a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ffd(ScheduledSendPickerViewModel scheduledSendPickerViewModel, Continuation continuation) {
        super(2, continuation);
        this.a = scheduledSendPickerViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ffd(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ffd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ScheduledSendPickerViewModel scheduledSendPickerViewModel = this.a;
        scheduledSendPickerViewModel.l(ScheduledSendPickerViewModel.j(scheduledSendPickerViewModel));
        return Unit.INSTANCE;
    }
}
