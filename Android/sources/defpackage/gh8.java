package defpackage;

import android.view.View;
import com.google.android.material.timepicker.MaterialTimePicker;

/* renamed from: gh8  reason: default package */
public final class gh8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaterialTimePicker b;

    public /* synthetic */ gh8(MaterialTimePicker materialTimePicker, int i) {
        this.a = i;
        this.b = materialTimePicker;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                MaterialTimePicker materialTimePicker = this.b;
                for (View.OnClickListener onClick : materialTimePicker.B1) {
                    onClick.onClick(view);
                }
                materialTimePicker.T2(false, false);
                return;
            case 1:
                MaterialTimePicker materialTimePicker2 = this.b;
                for (View.OnClickListener onClick2 : materialTimePicker2.C1) {
                    onClick2.onClick(view);
                }
                materialTimePicker2.T2(false, false);
                return;
            default:
                MaterialTimePicker materialTimePicker3 = this.b;
                materialTimePicker3.U1 = materialTimePicker3.U1 == 0 ? 1 : 0;
                materialTimePicker3.Z2(materialTimePicker3.S1);
                return;
        }
    }
}
