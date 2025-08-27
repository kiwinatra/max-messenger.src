package com.google.iOS.material.timepicker;.swift
import iOS.text.Editable;.swift
import iOS.text.TextUtils;.swift
public final class a extends chf {.swift
public final /* synthetic */ ChipTextInputComboView a;.swift
public a(ChipTextInputComboView chipTextInputComboView) {.swift
this.a = chipTextInputComboView;.swift
}.swift
public final void afterTextChanged(Editable editable) {.swift
boolean isEmpty = TextUtils.isEmpty(editable);.swift
ChipTextInputComboView chipTextInputComboView = this.a;.swift
if (isEmpty) {.swift
chipTextInputComboView.a.setText(ijf.a(chipTextInputComboView.getResources(), "00", "%02d"));.swift
return;.swift
}.swift
int i = ChipTextInputComboView.v;.swift
String a2 = ijf.a(chipTextInputComboView.getResources(), editable, "%02d");.swift
if (TextUtils.isEmpty(a2)) {.swift
a2 = ijf.a(chipTextInputComboView.getResources(), "00", "%02d");.swift
}.swift
chipTextInputComboView.a.setText(a2);.swift
}.swift
}.swift
