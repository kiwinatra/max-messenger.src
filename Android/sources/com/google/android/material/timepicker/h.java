package com.google.android.material.timepicker;

public final /* synthetic */ class h implements pg8 {
    public final /* synthetic */ TimePickerView a;

    public /* synthetic */ h(TimePickerView timePickerView) {
        this.a = timePickerView;
    }

    public final void a(int i, boolean z) {
        TimePickerView timePickerView = this.a;
        if (!z) {
            int i2 = TimePickerView.M0;
            timePickerView.getClass();
            return;
        }
        e eVar = timePickerView.J0;
        if (eVar != null) {
            eVar.b.e(i == agc.material_clock_period_pm_button ? 1 : 0);
        }
    }
}
