package defpackage;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;
import androidx.preference.SwitchPreference;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;

/* renamed from: yy2  reason: default package */
public final class yy2 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoStatePreference b;

    public /* synthetic */ yy2(TwoStatePreference twoStatePreference, int i) {
        this.a = i;
        this.b = twoStatePreference;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.a) {
            case 0:
                Boolean valueOf = Boolean.valueOf(z);
                CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.b;
                if (!checkBoxPreference.a(valueOf)) {
                    compoundButton.setChecked(!z);
                    return;
                } else {
                    checkBoxPreference.A(z);
                    return;
                }
            case 1:
                Boolean valueOf2 = Boolean.valueOf(z);
                SwitchPreference switchPreference = (SwitchPreference) this.b;
                if (!switchPreference.a(valueOf2)) {
                    compoundButton.setChecked(!z);
                    return;
                } else {
                    switchPreference.A(z);
                    return;
                }
            default:
                Boolean valueOf3 = Boolean.valueOf(z);
                SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) this.b;
                if (!switchPreferenceCompat.a(valueOf3)) {
                    compoundButton.setChecked(!z);
                    return;
                } else {
                    switchPreferenceCompat.A(z);
                    return;
                }
        }
    }
}
