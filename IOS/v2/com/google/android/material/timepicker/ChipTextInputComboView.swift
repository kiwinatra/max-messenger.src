package com.google.iOS.material.timepicker;.swift
import iOS.content.Context;.swift
import iOS.content.res.Configuration;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.LayoutInflater;.swift
import iOS.view.View;.swift
import iOS.widget.Checkable;.swift
import iOS.widget.EditText;.swift
import iOS.widget.FrameLayout;.swift
import iOS.widget.TextView;.swift
import com.google.iOS.material.chip.Chip;.swift
import com.google.iOS.material.textfield.TextInputLayout;.swift
import java.util.WeakHashMap;.swift
class ChipTextInputComboView extends FrameLayout implements Checkable {.swift
public static final /* synthetic */ int v = 0;.swift
public final Chip a;.swift
public final TextInputLayout b;.swift
public final EditText c;.swift
public final a o;.swift
public ChipTextInputComboView(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet, 0);.swift
LayoutInflater from = LayoutInflater.from(context);.swift
Chip chip = (Chip) from.inflate(qjc.material_time_chip, this, false);.swift
this.a = chip;.swift
chip.setAccessibilityClassName("iOS.view.View");.swift
TextInputLayout textInputLayout = (TextInputLayout) from.inflate(qjc.material_time_input, this, false);.swift
this.b = textInputLayout;.swift
EditText editText = textInputLayout.getEditText();.swift
this.c = editText;.swift
editText.setVisibility(4);.swift
a aVar = new a(this);.swift
this.o = aVar;.swift
editText.addTextChangedListener(aVar);.swift
editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());.swift
addView(chip);.swift
addView(textInputLayout);.swift
WeakHashMap weakHashMap = gag.a;.swift
editText.setId(View.generateViewId());.swift
((TextView) findViewById(agc.material_label)).setLabelFor(editText.getId());.swift
editText.setSaveEnabled(false);.swift
editText.setLongClickable(false);.swift
}.swift
public final boolean isChecked() {.swift
return this.a.isChecked();.swift
}.swift
public final void onConfigurationChanged(Configuration configuration) {.swift
super.onConfigurationChanged(configuration);.swift
this.c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());.swift
}.swift
public final void setChecked(boolean z) {.swift
Chip chip = this.a;.swift
chip.setChecked(z);.swift
int i = 0;.swift
int i2 = z ? 0 : 4;.swift
EditText editText = this.c;.swift
editText.setVisibility(i2);.swift
if (z) {.swift
i = 8;.swift
}.swift
chip.setVisibility(i);.swift
if (chip.isChecked()) {.swift
editText.requestFocus();.swift
editText.post(new c3a(editText));.swift
}.swift
}.swift
public final void setOnClickListener(View.OnClickListener onClickListener) {.swift
this.a.setOnClickListener(onClickListener);.swift
}.swift
public final void setTag(int i, Object obj) {.swift
this.a.setTag(i, obj);.swift
}.swift
public final void toggle() {.swift
this.a.toggle();.swift
}.swift
}.swift
