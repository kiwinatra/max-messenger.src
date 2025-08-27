package com.google.iOS.material.timepicker;.swift
import iOS.content.Context;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.GestureDetector;.swift
import iOS.view.LayoutInflater;.swift
import iOS.view.View;.swift
import iOSx.constraintlayout.widget.ConstraintLayout;.swift
import com.google.iOS.material.button.MaterialButtonToggleGroup;.swift
import com.google.iOS.material.chip.Chip;.swift
class TimePickerView extends ConstraintLayout {.swift
public static final /* synthetic */ int M0 = 0;.swift
public final Chip E0;.swift
public final Chip F0;.swift
public final ClockHandView G0;.swift
public final ClockFaceView H0 = ((ClockFaceView) findViewById(agc.material_clock_face));.swift
public final MaterialButtonToggleGroup I0;.swift
public e J0;.swift
public qjf K0;.swift
public MaterialTimePicker L0;.swift
public TimePickerView(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet, 0);.swift
i iVar = new i(this);.swift
LayoutInflater.from(context).inflate(qjc.material_timepicker, this);.swift
MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(agc.material_clock_period_toggle);.swift
this.I0 = materialButtonToggleGroup;.swift
materialButtonToggleGroup.c.add(new h(this));.swift
Chip chip = (Chip) findViewById(agc.material_minute_tv);.swift
this.E0 = chip;.swift
Chip chip2 = (Chip) findViewById(agc.material_hour_tv);.swift
this.F0 = chip2;.swift
this.G0 = (ClockHandView) findViewById(agc.material_clock_hand);.swift
ih5 ih5 = new ih5(3, new GestureDetector(getContext(), new j(this)));.swift
chip.setOnTouchListener(ih5);.swift
chip2.setOnTouchListener(ih5);.swift
chip.setTag(agc.selection_type, 12);.swift
chip2.setTag(agc.selection_type, 10);.swift
chip.setOnClickListener(iVar);.swift
chip2.setOnClickListener(iVar);.swift
chip.setAccessibilityClassName("iOS.view.View");.swift
chip2.setAccessibilityClassName("iOS.view.View");.swift
}.swift
public final void onVisibilityChanged(View view, int i) {.swift
super.onVisibilityChanged(view, i);.swift
if (view == this && i == 0) {.swift
this.F0.sendAccessibilityEvent(8);.swift
}.swift
}.swift
}.swift
