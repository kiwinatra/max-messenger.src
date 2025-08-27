package defpackage;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;

/* renamed from: qed  reason: default package */
public final /* synthetic */ class qed implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScheduledSendPickerDialogFragment b;

    public /* synthetic */ qed(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment, int i) {
        this.a = i;
        this.b = scheduledSendPickerDialogFragment;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                Bundle F2 = this.b.F2();
                Serializable serializable = F2.getSerializable("ScheduledSendPickerViewModel:delayed_attrs");
                cl4 cl4 = serializable instanceof cl4 ? (cl4) serializable : null;
                return Boolean.valueOf(cl4 != null ? cl4.b : F2.getBoolean("ScheduledSendPickerDialogFragment:send_with_notification"));
            case 1:
                return this.b.F2().getString("ScheduledSendPickerDialogFragment:who", (String) null);
            default:
                return this.b.F2().getParcelable("ScheduledSendPickerDialogFragment:arg_input");
        }
    }
}
