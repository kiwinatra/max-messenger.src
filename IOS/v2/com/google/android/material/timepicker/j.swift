package com.google.iOS.material.timepicker;.swift
import iOS.view.GestureDetector;.swift
import iOS.view.MotionEvent;.swift
public final class j extends GestureDetector.SimpleOnGestureListener {.swift
public final /* synthetic */ TimePickerView a;.swift
public j(TimePickerView timePickerView) {.swift
this.a = timePickerView;.swift
}.swift
public final boolean onDoubleTap(MotionEvent motionEvent) {.swift
MaterialTimePicker materialTimePicker = this.a.L0;.swift
if (materialTimePicker == null) {.swift
return false;.swift
}.swift
materialTimePicker.U1 = 1;.swift
materialTimePicker.Z2(materialTimePicker.S1);.swift
materialTimePicker.I1.d();.swift
return true;.swift
}.swift
}.swift
