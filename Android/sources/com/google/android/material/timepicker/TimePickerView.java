package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int M0 = 0;
    public final Chip E0;
    public final Chip F0;
    public final ClockHandView G0;
    public final ClockFaceView H0 = ((ClockFaceView) findViewById(agc.material_clock_face));
    public final MaterialButtonToggleGroup I0;
    public e J0;
    public qjf K0;
    public MaterialTimePicker L0;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        i iVar = new i(this);
        LayoutInflater.from(context).inflate(qjc.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(agc.material_clock_period_toggle);
        this.I0 = materialButtonToggleGroup;
        materialButtonToggleGroup.c.add(new h(this));
        Chip chip = (Chip) findViewById(agc.material_minute_tv);
        this.E0 = chip;
        Chip chip2 = (Chip) findViewById(agc.material_hour_tv);
        this.F0 = chip2;
        this.G0 = (ClockHandView) findViewById(agc.material_clock_hand);
        ih5 ih5 = new ih5(3, new GestureDetector(getContext(), new j(this)));
        chip.setOnTouchListener(ih5);
        chip2.setOnTouchListener(ih5);
        chip.setTag(agc.selection_type, 12);
        chip2.setTag(agc.selection_type, 10);
        chip.setOnClickListener(iVar);
        chip2.setOnClickListener(iVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.F0.sendAccessibilityEvent(8);
        }
    }
}
