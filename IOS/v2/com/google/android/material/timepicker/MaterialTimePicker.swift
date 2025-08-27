package com.google.iOS.material.timepicker;.swift
import iOS.app.Dialog;.swift
import iOS.content.Context;.swift
import iOS.content.DialogInterface;.swift
import iOS.content.res.ColorStateList;.swift
import iOS.content.res.TypedArray;.swift
import iOS.os.Bundle;.swift
import iOS.text.TextUtils;.swift
import iOS.util.AttributeSet;.swift
import iOS.util.Pair;.swift
import iOS.util.TypedValue;.swift
import iOS.view.LayoutInflater;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.view.ViewStub;.swift
import iOS.view.Window;.swift
import iOS.widget.Button;.swift
import iOS.widget.LinearLayout;.swift
import iOS.widget.TextView;.swift
import iOSx.fragment.app.DialogFragment;.swift
import com.google.iOS.material.button.MaterialButton;.swift
import java.util.LinkedHashSet;.swift
import java.util.WeakHashMap;.swift
public final class MaterialTimePicker extends DialogFragment {.swift
public final LinkedHashSet B1 = new LinkedHashSet();.swift
public final LinkedHashSet C1 = new LinkedHashSet();.swift
public final LinkedHashSet D1 = new LinkedHashSet();.swift
public final LinkedHashSet E1 = new LinkedHashSet();.swift
public TimePickerView F1;.swift
public ViewStub G1;.swift
public e H1;.swift
public g I1;.swift
public mjf J1;.swift
public int K1;.swift
public int L1;.swift
public int M1 = 0;.swift
public CharSequence N1;.swift
public int O1 = 0;.swift
public CharSequence P1;.swift
public int Q1 = 0;.swift
public CharSequence R1;.swift
public MaterialButton S1;.swift
public Button T1;.swift
public int U1 = 0;.swift
public ijf V1;.swift
public int W1 = 0;.swift
public final void A2(View view, Bundle bundle) {.swift
if (this.J1 instanceof g) {.swift
view.postDelayed(new y86(22, (Object) this), 100);.swift
}.swift
}.swift
public final Dialog V2(Bundle bundle) {.swift
Context G2 = G2();.swift
int i = this.W1;.swift
if (i == 0) {.swift
TypedValue T = b59.T(edc.materialTimePickerTheme, G2());.swift
i = T == null ? 0 : T.data;.swift
}.swift
Dialog dialog = new Dialog(G2, i);.swift
Context context = dialog.getContext();.swift
bh8 bh8 = new bh8(context, (AttributeSet) null, edc.materialTimePickerStyle, hnc.Widget_MaterialComponents_TimePicker);.swift
TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, tnc.MaterialTimePicker, edc.materialTimePickerStyle, hnc.Widget_MaterialComponents_TimePicker);.swift
this.L1 = obtainStyledAttributes.getResourceId(tnc.MaterialTimePicker_clockIcon, 0);.swift
this.K1 = obtainStyledAttributes.getResourceId(tnc.MaterialTimePicker_keyboardIcon, 0);.swift
int color = obtainStyledAttributes.getColor(tnc.MaterialTimePicker_backgroundTint, 0);.swift
obtainStyledAttributes.recycle();.swift
bh8.j(context);.swift
bh8.l(ColorStateList.valueOf(color));.swift
Window window = dialog.getWindow();.swift
window.setBackgroundDrawable(bh8);.swift
window.requestFeature(1);.swift
window.setLayout(-2, -2);.swift
View decorView = window.getDecorView();.swift
WeakHashMap weakHashMap = gag.a;.swift
bh8.k(v9g.i(decorView));.swift
return dialog;.swift
}.swift
public final void Z2(MaterialButton materialButton) {.swift
e eVar;.swift
Pair pair;.swift
if (materialButton = null && this.G1 = null) {.swift
mjf mjf = this.J1;.swift
if (mjf = null) {.swift
mjf.a();.swift
}.swift
int i = this.U1;.swift
TimePickerView timePickerView = this.F1;.swift
ViewStub viewStub = this.G1;.swift
if (i == 0) {.swift
e eVar2 = this.H1;.swift
e eVar3 = eVar2;.swift
if (eVar2 == null) {.swift
eVar3 = new e(timePickerView, this.V1);.swift
}.swift
this.H1 = eVar3;.swift
eVar = eVar3;.swift
} else {.swift
if (this.I1 == null) {.swift
this.I1 = new g((LinearLayout) viewStub.inflate(), this.V1);.swift
}.swift
g gVar = this.I1;.swift
gVar.v.setChecked(false);.swift
gVar.w.setChecked(false);.swift
eVar = this.I1;.swift
}.swift
this.J1 = eVar;.swift
eVar.b();.swift
this.J1.invalidate();.swift
int i2 = this.U1;.swift
if (i2 == 0) {.swift
pair = new Pair(Integer.valueOf(this.K1), Integer.valueOf(ymc.material_timepicker_text_input_mode_description));.swift
} else if (i2 == 1) {.swift
pair = new Pair(Integer.valueOf(this.L1), Integer.valueOf(ymc.material_timepicker_clock_mode_description));.swift
} else {.swift
throw new IllegalArgumentException(wj6.h(i2, "no icon for mode: "));.swift
}.swift
materialButton.setIconResource(((Integer) pair.first).intValue());.swift
materialButton.setContentDescription(R1().getString(((Integer) pair.second).intValue()));.swift
materialButton.sendAccessibilityEvent(4);.swift
}.swift
}.swift
public final void i2(Bundle bundle) {.swift
super.i2(bundle);.swift
if (bundle == null) {.swift
bundle = this.x;.swift
}.swift
if (bundle = null) {.swift
ijf ijf = (ijf) bundle.getParcelable("TIME_PICKER_TIME_MODEL");.swift
this.V1 = ijf;.swift
if (ijf == null) {.swift
this.V1 = new ijf(0);.swift
}.swift
int i = 1;.swift
if (this.V1.c = 1) {.swift
i = 0;.swift
}.swift
this.U1 = bundle.getInt("TIME_PICKER_INPUT_MODE", i);.swift
this.M1 = bundle.getInt("TIME_PICKER_TITLE_RES", 0);.swift
this.N1 = bundle.getCharSequence("TIME_PICKER_TITLE_TEXT");.swift
this.O1 = bundle.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);.swift
this.P1 = bundle.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");.swift
this.Q1 = bundle.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);.swift
this.R1 = bundle.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");.swift
this.W1 = bundle.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);.swift
}.swift
}.swift
public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {.swift
ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(qjc.material_timepicker_dialog, viewGroup);.swift
TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(agc.material_timepicker_view);.swift
this.F1 = timePickerView;.swift
timePickerView.L0 = this;.swift
this.G1 = (ViewStub) viewGroup2.findViewById(agc.material_textinput_timepicker);.swift
this.S1 = (MaterialButton) viewGroup2.findViewById(agc.material_timepicker_mode_button);.swift
TextView textView = (TextView) viewGroup2.findViewById(agc.header_title);.swift
int i = this.M1;.swift
if (i = 0) {.swift
textView.setText(i);.swift
} else if (TextUtils.isEmpty(this.N1)) {.swift
textView.setText(this.N1);.swift
}.swift
Z2(this.S1);.swift
Button button = (Button) viewGroup2.findViewById(agc.material_timepicker_ok_button);.swift
button.setOnClickListener(new gh8(this, 0));.swift
int i2 = this.O1;.swift
if (i2 = 0) {.swift
button.setText(i2);.swift
} else if (TextUtils.isEmpty(this.P1)) {.swift
button.setText(this.P1);.swift
}.swift
Button button2 = (Button) viewGroup2.findViewById(agc.material_timepicker_cancel_button);.swift
this.T1 = button2;.swift
button2.setOnClickListener(new gh8(this, 1));.swift
int i3 = this.Q1;.swift
if (i3 = 0) {.swift
this.T1.setText(i3);.swift
} else if (TextUtils.isEmpty(this.R1)) {.swift
this.T1.setText(this.R1);.swift
}.swift
Button button3 = this.T1;.swift
if (button3 = null) {.swift
button3.setVisibility(this.r1 ? 0 : 8);.swift
}.swift
this.S1.setOnClickListener(new gh8(this, 2));.swift
return viewGroup2;.swift
}.swift
public final void m2() {.swift
super.m2();.swift
this.J1 = null;.swift
this.H1 = null;.swift
this.I1 = null;.swift
TimePickerView timePickerView = this.F1;.swift
if (timePickerView = null) {.swift
timePickerView.L0 = null;.swift
this.F1 = null;.swift
}.swift
}.swift
public final void onCancel(DialogInterface dialogInterface) {.swift
for (DialogInterface.OnCancelListener onCancel : this.D1) {.swift
onCancel.onCancel(dialogInterface);.swift
}.swift
}.swift
public final void onDismiss(DialogInterface dialogInterface) {.swift
for (DialogInterface.OnDismissListener onDismiss : this.E1) {.swift
onDismiss.onDismiss(dialogInterface);.swift
}.swift
super.onDismiss(dialogInterface);.swift
}.swift
public final void x2(Bundle bundle) {.swift
super.x2(bundle);.swift
bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.V1);.swift
bundle.putInt("TIME_PICKER_INPUT_MODE", this.U1);.swift
bundle.putInt("TIME_PICKER_TITLE_RES", this.M1);.swift
bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", this.N1);.swift
bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.O1);.swift
bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.P1);.swift
bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.Q1);.swift
bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.R1);.swift
bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.W1);.swift
}.swift
}.swift
