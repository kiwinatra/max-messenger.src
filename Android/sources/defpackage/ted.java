package defpackage;

import android.os.Parcelable;
import android.view.View;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* renamed from: ted  reason: default package */
public final /* synthetic */ class ted implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScheduledSendPickerDialogFragment b;

    public /* synthetic */ ted(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment, int i) {
        this.a = i;
        this.b = scheduledSendPickerDialogFragment;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ScheduledSendPickerViewModel d3 = this.b.d3();
                d3.getClass();
                z68.c("ScheduledSendPickerViewModel", "onSendClick", new Object[0]);
                if (d3.m()) {
                    hsg.l(d3.n);
                    return;
                }
                return;
            default:
                z68.c("ScheduledSendPickerDialogFragment", "handle nav click", new Object[0]);
                ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.b;
                scheduledSendPickerDialogFragment.e3(new ved((Parcelable) scheduledSendPickerDialogFragment.F1.getValue()));
                scheduledSendPickerDialogFragment.a3();
                return;
        }
    }
}
