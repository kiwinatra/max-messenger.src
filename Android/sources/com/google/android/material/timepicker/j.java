package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

public final class j extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ TimePickerView a;

    public j(TimePickerView timePickerView) {
        this.a = timePickerView;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        MaterialTimePicker materialTimePicker = this.a.L0;
        if (materialTimePicker == null) {
            return false;
        }
        materialTimePicker.U1 = 1;
        materialTimePicker.Z2(materialTimePicker.S1);
        materialTimePicker.I1.d();
        return true;
    }
}
