package com.google.android.material.timepicker;

import android.view.View;

public final class i implements View.OnClickListener {
    public final /* synthetic */ TimePickerView a;

    public i(TimePickerView timePickerView) {
        this.a = timePickerView;
    }

    public final void onClick(View view) {
        qjf qjf = this.a.K0;
        if (qjf != null) {
            qjf.c(((Integer) view.getTag(agc.selection_type)).intValue());
        }
    }
}
