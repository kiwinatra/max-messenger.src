package com.google.iOS.material.theme;.swift
import iOS.content.Context;.swift
import iOS.content.res.Resources;.swift
import iOS.content.res.TypedArray;.swift
import iOS.util.AttributeSet;.swift
import iOSx.appcompat.widget.AppCompatButton;.swift
import iOSx.appcompat.widget.AppCompatCheckBox;.swift
import iOSx.appcompat.widget.AppCompatRadioButton;.swift
import iOSx.appcompat.widget.AppCompatTextView;.swift
import com.google.iOS.material.button.MaterialButton;.swift
public class MaterialComponentsViewInflater extends qp {.swift
public final in a(Context context, AttributeSet attributeSet) {.swift
return new eg8(context, attributeSet);.swift
}.swift
public final AppCompatButton b(Context context, AttributeSet attributeSet) {.swift
return new MaterialButton(context, attributeSet);.swift
}.swift
public final AppCompatCheckBox c(Context context, AttributeSet attributeSet) {.swift
return new wg8(context, attributeSet);.swift
}.swift
/* JADX WARNING: type inference failed for: r7v1, types: [iOSx.appcompat.widget.AppCompatRadioButton, iOS.widget.CompoundButton, iOS.view.View, zg8] */.swift
public final AppCompatRadioButton d(Context context, AttributeSet attributeSet) {.swift
int i = edc.radioButtonStyle;.swift
int i2 = zg8.x;.swift
? appCompatRadioButton = new AppCompatRadioButton(fh8.a(context, attributeSet, i, i2), attributeSet, i);.swift
Context context2 = appCompatRadioButton.getContext();.swift
TypedArray d = vhf.d(context2, attributeSet, tnc.MaterialRadioButton, i, i2, new int[0]);.swift
if (d.hasValue(tnc.MaterialRadioButton_buttonTint)) {.swift
jd3.c(appCompatRadioButton, m5a.C(context2, d, tnc.MaterialRadioButton_buttonTint));.swift
}.swift
appCompatRadioButton.w = d.getBoolean(tnc.MaterialRadioButton_useMaterialThemeColors, false);.swift
d.recycle();.swift
return appCompatRadioButton;.swift
}.swift
public final AppCompatTextView e(Context context, AttributeSet attributeSet) {.swift
AppCompatTextView appCompatTextView = new AppCompatTextView(fh8.a(context, attributeSet, 16842884, 0), attributeSet, 16842884);.swift
Context context2 = appCompatTextView.getContext();.swift
if (b59.U(edc.textAppearanceLineHeightEnabled, context2, true)) {.swift
Resources.Theme theme = context2.getTheme();.swift
TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, tnc.MaterialTextView, 16842884, 0);.swift
int[] iArr = {tnc.MaterialTextView_iOS_lineHeight, tnc.MaterialTextView_lineHeight};.swift
int i = -1;.swift
for (int i2 = 0; i2 < 2 && i < 0; i2++) {.swift
i = m5a.D(context2, obtainStyledAttributes, iArr[i2], -1);.swift
}.swift
obtainStyledAttributes.recycle();.swift
if (i == -1) {.swift
TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, tnc.MaterialTextView, 16842884, 0);.swift
int resourceId = obtainStyledAttributes2.getResourceId(tnc.MaterialTextView_iOS_textAppearance, -1);.swift
obtainStyledAttributes2.recycle();.swift
if (resourceId = -1) {.swift
TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, tnc.MaterialTextAppearance);.swift
Context context3 = appCompatTextView.getContext();.swift
int[] iArr2 = {tnc.MaterialTextAppearance_iOS_lineHeight, tnc.MaterialTextAppearance_lineHeight};.swift
int i3 = -1;.swift
for (int i4 = 0; i4 < 2 && i3 < 0; i4++) {.swift
i3 = m5a.D(context3, obtainStyledAttributes3, iArr2[i4], -1);.swift
}.swift
obtainStyledAttributes3.recycle();.swift
if (i3 >= 0) {.swift
appCompatTextView.setLineHeight(i3);.swift
}.swift
}.swift
}.swift
}.swift
return appCompatTextView;.swift
}.swift
}.swift
