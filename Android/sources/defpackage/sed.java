package defpackage;

import android.content.DialogInterface;
import android.os.Parcelable;
import android.view.KeyEvent;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;

/* renamed from: sed  reason: default package */
public final /* synthetic */ class sed implements DialogInterface.OnKeyListener {
    public final /* synthetic */ ScheduledSendPickerDialogFragment a;

    public /* synthetic */ sed(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment) {
        this.a = scheduledSendPickerDialogFragment;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.a;
        scheduledSendPickerDialogFragment.e3(new ved((Parcelable) scheduledSendPickerDialogFragment.F1.getValue()));
        return false;
    }
}
