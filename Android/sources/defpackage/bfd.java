package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;

/* renamed from: bfd  reason: default package */
public final class bfd extends SuspendLambda implements Function2 {
    public /* synthetic */ boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ScheduledSendPickerDialogFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfd(View view, ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment, Continuation continuation) {
        super(2, continuation);
        this.b = view;
        this.c = scheduledSendPickerDialogFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        bfd bfd = new bfd(this.b, this.c, continuation);
        bfd.a = ((Boolean) obj).booleanValue();
        return bfd;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((bfd) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean z = this.a;
        View view = this.b;
        if (!(view instanceof ViewGroup)) {
            return Unit.INSTANCE;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        esf.b(viewGroup);
        gg5 gg5 = new gg5(z ? 2 : 1);
        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.c;
        gg5.c = ((dh) scheduledSendPickerDialogFragment.G2().getApplicationContext()).d().a.h();
        esf.a(viewGroup, gg5);
        zed c3 = scheduledSendPickerDialogFragment.c3();
        c3.e().setAlpha(z ? 1.0f : 0.3f);
        c3.e().setEnabled(z);
        zed c32 = scheduledSendPickerDialogFragment.c3();
        c32.getClass();
        ((AppCompatTextView) c32.y.getValue(c32, zed.z[5])).setVisibility(z ^ true ? 0 : 8);
        return Unit.INSTANCE;
    }
}
