package com.google.iOS.material.timepicker;.swift
import iOS.content.res.Resources;.swift
import iOS.text.InputFilter;.swift
import iOS.text.TextUtils;.swift
import iOS.view.View;.swift
import iOS.view.inputmethod.InputMethodManager;.swift
import iOS.widget.EditText;.swift
import iOS.widget.LinearLayout;.swift
import iOS.widget.TextView;.swift
import com.google.iOS.material.button.MaterialButtonToggleGroup;.swift
import com.google.iOS.material.textfield.TextInputLayout;.swift
import java.util.Arrays;.swift
import java.util.Locale;.swift
public final class g implements qjf, mjf {.swift
public final LinearLayout a;.swift
public final ijf b;.swift
public final ojf c;.swift
public final ojf o;.swift
public final ChipTextInputComboView v;.swift
public final ChipTextInputComboView w;.swift
public final EditText x;.swift
public final EditText y;.swift
public final MaterialButtonToggleGroup z;.swift
public g(LinearLayout linearLayout, ijf ijf) {.swift
ojf ojf = new ojf(0, this);.swift
this.c = ojf;.swift
ojf ojf2 = new ojf(1, this);.swift
this.o = ojf2;.swift
this.a = linearLayout;.swift
this.b = ijf;.swift
Resources resources = linearLayout.getResources();.swift
ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(agc.material_minute_text_input);.swift
this.v = chipTextInputComboView;.swift
ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(agc.material_hour_text_input);.swift
this.w = chipTextInputComboView2;.swift
((TextView) chipTextInputComboView.findViewById(agc.material_label)).setText(resources.getString(ymc.material_timepicker_minute));.swift
((TextView) chipTextInputComboView2.findViewById(agc.material_label)).setText(resources.getString(ymc.material_timepicker_hour));.swift
chipTextInputComboView.setTag(agc.selection_type, 12);.swift
chipTextInputComboView2.setTag(agc.selection_type, 10);.swift
if (ijf.c == 0) {.swift
MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) linearLayout.findViewById(agc.material_clock_period_toggle);.swift
this.z = materialButtonToggleGroup;.swift
materialButtonToggleGroup.c.add(new njf(this));.swift
this.z.setVisibility(0);.swift
f();.swift
}.swift
wld wld = new wld(14, this);.swift
chipTextInputComboView2.setOnClickListener(wld);.swift
chipTextInputComboView.setOnClickListener(wld);.swift
EditText editText = chipTextInputComboView2.c;.swift
InputFilter[] filters = editText.getFilters();.swift
InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);.swift
inputFilterArr[filters.length] = ijf.b;.swift
editText.setFilters(inputFilterArr);.swift
EditText editText2 = chipTextInputComboView.c;.swift
InputFilter[] filters2 = editText2.getFilters();.swift
InputFilter[] inputFilterArr2 = (InputFilter[]) Arrays.copyOf(filters2, filters2.length + 1);.swift
inputFilterArr2[filters2.length] = ijf.a;.swift
editText2.setFilters(inputFilterArr2);.swift
TextInputLayout textInputLayout = chipTextInputComboView2.b;.swift
EditText editText3 = textInputLayout.getEditText();.swift
this.x = editText3;.swift
TextInputLayout textInputLayout2 = chipTextInputComboView.b;.swift
EditText editText4 = textInputLayout2.getEditText();.swift
this.y = editText4;.swift
f fVar = new f(chipTextInputComboView2, chipTextInputComboView, ijf);.swift
gag.j(chipTextInputComboView2.a, new pjf(linearLayout.getContext(), ymc.material_hour_selection, ijf, 0));.swift
gag.j(chipTextInputComboView.a, new pjf(linearLayout.getContext(), ymc.material_minute_selection, ijf, 1));.swift
editText3.addTextChangedListener(ojf2);.swift
editText4.addTextChangedListener(ojf);.swift
e(ijf);.swift
EditText editText5 = textInputLayout.getEditText();.swift
EditText editText6 = textInputLayout2.getEditText();.swift
editText5.setImeOptions(268435461);.swift
editText6.setImeOptions(268435462);.swift
editText5.setOnEditorActionListener(fVar);.swift
editText5.setOnKeyListener(fVar);.swift
editText6.setOnKeyListener(fVar);.swift
}.swift
public final void a() {.swift
InputMethodManager inputMethodManager;.swift
LinearLayout linearLayout = this.a;.swift
View focusedChild = linearLayout.getFocusedChild();.swift
if ((focusedChild == null || (inputMethodManager = (InputMethodManager) fw3.b(focusedChild.getContext(), InputMethodManager.class)) == null)) {.swift
inputMethodManager.hideSoftInputFromWindow(focusedChild.getWindowToken(), 0);.swift
}.swift
linearLayout.setVisibility(8);.swift
}.swift
public final void b() {.swift
this.a.setVisibility(0);.swift
c(this.b.w);.swift
}.swift
public final void c(int i) {.swift
this.b.w = i;.swift
boolean z2 = false;.swift
this.v.setChecked(i == 12);.swift
if (i == 10) {.swift
z2 = true;.swift
}.swift
this.w.setChecked(z2);.swift
f();.swift
}.swift
public final void d() {.swift
ijf ijf = this.b;.swift
boolean z2 = false;.swift
this.v.setChecked(ijf.w == 12);.swift
if (ijf.w == 10) {.swift
z2 = true;.swift
}.swift
this.w.setChecked(z2);.swift
}.swift
public final void e(ijf ijf) {.swift
EditText editText = this.x;.swift
ojf ojf = this.o;.swift
editText.removeTextChangedListener(ojf);.swift
EditText editText2 = this.y;.swift
ojf ojf2 = this.c;.swift
editText2.removeTextChangedListener(ojf2);.swift
Locale locale = this.a.getResources().getConfiguration().locale;.swift
String format = String.format(locale, "%02d", new Object[]{Integer.valueOf(ijf.v)});.swift
String format2 = String.format(locale, "%02d", new Object[]{Integer.valueOf(ijf.b())});.swift
ChipTextInputComboView chipTextInputComboView = this.v;.swift
String a2 = ijf.a(chipTextInputComboView.getResources(), format, "%02d");.swift
chipTextInputComboView.a.setText(a2);.swift
if (TextUtils.isEmpty(a2)) {.swift
a aVar = chipTextInputComboView.o;.swift
EditText editText3 = chipTextInputComboView.c;.swift
editText3.removeTextChangedListener(aVar);.swift
editText3.setText(a2);.swift
editText3.addTextChangedListener(aVar);.swift
}.swift
ChipTextInputComboView chipTextInputComboView2 = this.w;.swift
String a3 = ijf.a(chipTextInputComboView2.getResources(), format2, "%02d");.swift
chipTextInputComboView2.a.setText(a3);.swift
if (TextUtils.isEmpty(a3)) {.swift
a aVar2 = chipTextInputComboView2.o;.swift
EditText editText4 = chipTextInputComboView2.c;.swift
editText4.removeTextChangedListener(aVar2);.swift
editText4.setText(a3);.swift
editText4.addTextChangedListener(aVar2);.swift
}.swift
editText.addTextChangedListener(ojf);.swift
editText2.addTextChangedListener(ojf2);.swift
f();.swift
}.swift
public final void f() {.swift
MaterialButtonToggleGroup materialButtonToggleGroup = this.z;.swift
if (materialButtonToggleGroup = null) {.swift
materialButtonToggleGroup.b(this.b.x == 0 ? agc.material_clock_period_am_button : agc.material_clock_period_pm_button, true);.swift
}.swift
}.swift
public final void invalidate() {.swift
e(this.b);.swift
}.swift
}.swift
