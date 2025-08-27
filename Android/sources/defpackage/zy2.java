package defpackage;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import ru.ok.tamtam.calls.ui.IconSwitch;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* renamed from: zy2  reason: default package */
public final /* synthetic */ class zy2 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zy2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 0;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                az2 az2 = (az2) obj;
                b0e b0e = az2.M0;
                if (b0e != null) {
                    b0e.C(az2.L0.a, Boolean.valueOf(z));
                    return;
                }
                return;
            case 1:
                Chip chip = (Chip) obj;
                xg8 xg8 = chip.v0;
                if (xg8 != null) {
                    g5b g5b = (g5b) ((rt6) xg8).b;
                    if (!z ? g5b.q(chip, g5b.b) : g5b.f(chip)) {
                        g5b.o();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.z;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                    return;
                }
                return;
            case 2:
                int i2 = IconSwitch.c;
                if (compoundButton.isPressed()) {
                    ((IconSwitch) obj).getClass();
                    return;
                }
                return;
            case 3:
                ts7 ts7 = (ts7) obj;
                b0e b0e2 = ts7.E0;
                if (b0e2 != null) {
                    hq hqVar = ((qra) ym.e()).y().c;
                    int i3 = ts7.J0.a;
                    if (z) {
                        i = hqVar.v();
                    }
                    b0e2.C(i3, Integer.valueOf(i));
                    return;
                }
                return;
            case 4:
                ScheduledSendPickerViewModel d3 = ((ScheduledSendPickerDialogFragment) obj).d3();
                d3.p.setValue(d3, ScheduledSendPickerViewModel.q[0], Boolean.valueOf(z));
                return;
            default:
                if (z) {
                    ((r1e) obj).callOnClick();
                    return;
                }
                return;
        }
    }
}
