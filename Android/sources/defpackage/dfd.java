package defpackage;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.utils.widgets.LongRoundedTitleSubtitleButton;

/* renamed from: dfd  reason: default package */
public final class dfd extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ScheduledSendPickerDialogFragment b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dfd(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment, Continuation continuation) {
        super(2, continuation);
        this.b = scheduledSendPickerDialogFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        dfd dfd = new dfd(this.b, continuation);
        dfd.a = obj;
        return dfd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dfd) create((c84) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        c84 c84 = (c84) this.a;
        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.b;
        LongRoundedTitleSubtitleButton e = scheduledSendPickerDialogFragment.c3().e();
        Context G2 = scheduledSendPickerDialogFragment.G2();
        c84.getClass();
        int i = jad.m;
        String str = c84.a.v;
        e.setSubtitle(G2.getString(i, new Object[]{str, c84.b + ":" + c84.c}));
        return Unit.INSTANCE;
    }
}
