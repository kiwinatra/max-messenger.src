package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.ok.tamtam.messages.scheduled.DateTimePicker;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* renamed from: h84  reason: default package */
public final /* synthetic */ class h84 implements yde {
    public final /* synthetic */ int a;
    public final /* synthetic */ DateTimePicker b;
    public final /* synthetic */ gjf c;

    public /* synthetic */ h84(DateTimePicker dateTimePicker, gjf gjf, int i) {
        this.a = i;
        this.b = dateTimePicker;
        this.c = gjf;
    }

    public final void a(int i) {
        switch (this.a) {
            case 0:
                DateTimePicker dateTimePicker = this.b;
                if (!dateTimePicker.M0) {
                    ejf ejf = (ejf) this.c.E(i);
                    k84 k84 = dateTimePicker.K0;
                    if (k84 != null) {
                        ScheduledSendPickerViewModel scheduledSendPickerViewModel = (ScheduledSendPickerViewModel) k84;
                        z68.c("ScheduledSendPickerViewModel", "hour = " + ejf, new Object[0]);
                        xme xme = scheduledSendPickerViewModel.f;
                        c84 c84 = (c84) xme.getValue();
                        if (c84 != null && !Intrinsics.areEqual((Object) c84.b, (Object) ejf)) {
                            xme.m((Object) null, c84.a(c84, (n84) null, ejf, (ejf) null, 5));
                            scheduledSendPickerViewModel.k();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                DateTimePicker dateTimePicker2 = this.b;
                if (!dateTimePicker2.N0) {
                    ejf ejf2 = (ejf) this.c.E(i);
                    k84 k842 = dateTimePicker2.K0;
                    if (k842 != null) {
                        ScheduledSendPickerViewModel scheduledSendPickerViewModel2 = (ScheduledSendPickerViewModel) k842;
                        z68.c("ScheduledSendPickerViewModel", "minute = " + ejf2, new Object[0]);
                        xme xme2 = scheduledSendPickerViewModel2.f;
                        c84 c842 = (c84) xme2.getValue();
                        if (c842 != null && !Intrinsics.areEqual((Object) c842.c, (Object) ejf2)) {
                            xme2.m((Object) null, c84.a(c842, (n84) null, (ejf) null, ejf2, 3));
                            scheduledSendPickerViewModel2.m();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
