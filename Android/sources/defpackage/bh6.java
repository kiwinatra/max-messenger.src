package defpackage;

import android.content.Context;
import android.view.ViewStub;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import kotlin.Lazy;

/* renamed from: bh6  reason: default package */
public final class bh6 extends LinearLayout implements CompoundButton.OnCheckedChangeListener {
    public ViewStub a;
    public AppCompatCheckBox b;
    public RadioGroup c;

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            RadioGroup radioGroup = this.c;
            if (radioGroup == null) {
                this.c = (RadioGroup) this.a.inflate();
                Context context = getContext();
                Lazy lazy = scf.b0;
                scf k0 = j4b.k0(context);
                iq.i(k0, (AppCompatRadioButton) this.c.findViewById(lic.layout_member_menu_radio__delete_1_day));
                iq.i(k0, (AppCompatRadioButton) this.c.findViewById(lic.layout_member_menu_radio__delete_all));
                this.c.check(lic.layout_member_menu_radio__delete_1_day);
                return;
            }
            radioGroup.setVisibility(0);
            return;
        }
        RadioGroup radioGroup2 = this.c;
        if (radioGroup2 != null) {
            radioGroup2.setVisibility(8);
        }
    }
}
