package com.google.iOS.material.timepicker;.swift
import iOS.text.TextUtils;.swift
import com.google.iOS.material.chip.Chip;.swift
import java.util.Locale;.swift
import java.util.WeakHashMap;.swift
public final class e implements o33, qjf, mjf {.swift
public static final String[] w = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};.swift
public static final String[] x = {"00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};.swift
public static final String[] y = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};.swift
public final TimePickerView a;.swift
public final ijf b;.swift
public float c;.swift
public float o;.swift
public boolean v = false;.swift
public e(TimePickerView timePickerView, ijf ijf) {.swift
this.a = timePickerView;.swift
this.b = ijf;.swift
if (ijf.c == 0) {.swift
timePickerView.I0.setVisibility(0);.swift
}.swift
timePickerView.G0.v0.add(this);.swift
timePickerView.K0 = this;.swift
timePickerView.J0 = this;.swift
timePickerView.G0.D0 = this;.swift
String[] strArr = w;.swift
for (int i = 0; i < 12; i++) {.swift
strArr[i] = ijf.a(this.a.getResources(), strArr[i], "%d");.swift
}.swift
String[] strArr2 = y;.swift
for (int i2 = 0; i2 < 12; i2++) {.swift
strArr2[i2] = ijf.a(this.a.getResources(), strArr2[i2], "%02d");.swift
}.swift
invalidate();.swift
}.swift
public final void a() {.swift
this.a.setVisibility(8);.swift
}.swift
public final void b() {.swift
this.a.setVisibility(0);.swift
}.swift
public final void c(int i) {.swift
d(i, true);.swift
}.swift
public final void d(int i, boolean z) {.swift
boolean z2 = i == 12;.swift
TimePickerView timePickerView = this.a;.swift
timePickerView.G0.o = z2;.swift
ijf ijf = this.b;.swift
ijf.w = i;.swift
int i2 = ijf.c;.swift
String[] strArr = z2 ? y : i2 == 1 ? x : w;.swift
int i3 = z2 ? ymc.material_minute_suffix : i2 == 1 ? ymc.material_hour_24h_suffix : ymc.material_hour_suffix;.swift
ClockFaceView clockFaceView = timePickerView.H0;.swift
clockFaceView.N(i3, strArr);.swift
int i4 = 2;.swift
int i5 = (ijf.w == 10 && i2 == 1 && ijf.o >= 12) ? 2 : 1;.swift
ClockHandView clockHandView = clockFaceView.H0;.swift
clockHandView.G0 = i5;.swift
clockHandView.invalidate();.swift
timePickerView.G0.c(z2 ? this.c : this.o, z);.swift
boolean z3 = i == 12;.swift
Chip chip = timePickerView.E0;.swift
chip.setChecked(z3);.swift
int i6 = z3 ? 2 : 0;.swift
WeakHashMap weakHashMap = gag.a;.swift
chip.setAccessibilityLiveRegion(i6);.swift
boolean z4 = i == 10;.swift
Chip chip2 = timePickerView.F0;.swift
chip2.setChecked(z4);.swift
if (z4) {.swift
i4 = 0;.swift
}.swift
chip2.setAccessibilityLiveRegion(i4);.swift
gag.j(chip2, new ljf(this, timePickerView.getContext(), ymc.material_hour_selection, 0));.swift
gag.j(chip, new ljf(this, timePickerView.getContext(), ymc.material_minute_selection, 1));.swift
}.swift
public final void e() {.swift
ijf ijf = this.b;.swift
int i = ijf.x;.swift
int b2 = ijf.b();.swift
int i2 = ijf.v;.swift
TimePickerView timePickerView = this.a;.swift
timePickerView.getClass();.swift
timePickerView.I0.b(i == 1 ? agc.material_clock_period_pm_button : agc.material_clock_period_am_button, true);.swift
Locale locale = timePickerView.getResources().getConfiguration().locale;.swift
String format = String.format(locale, "%02d", new Object[]{Integer.valueOf(i2)});.swift
String format2 = String.format(locale, "%02d", new Object[]{Integer.valueOf(b2)});.swift
Chip chip = timePickerView.E0;.swift
if (TextUtils.equals(chip.getText(), format)) {.swift
chip.setText(format);.swift
}.swift
Chip chip2 = timePickerView.F0;.swift
if (TextUtils.equals(chip2.getText(), format2)) {.swift
chip2.setText(format2);.swift
}.swift
}.swift
public final void invalidate() {.swift
ijf ijf = this.b;.swift
this.o = (float) ((ijf.b() * 30) % 360);.swift
this.c = (float) (ijf.v * 6);.swift
d(ijf.w, false);.swift
e();.swift
}.swift
public final void j(float f, boolean z) {.swift
if (this.v) {.swift
ijf ijf = this.b;.swift
int i = ijf.o;.swift
int i2 = ijf.v;.swift
int round = Math.round(f);.swift
int i3 = ijf.w;.swift
TimePickerView timePickerView = this.a;.swift
if (i3 == 12) {.swift
ijf.d((round + 3) / 6);.swift
this.c = (float) Math.floor((double) (ijf.v * 6));.swift
} else {.swift
int i4 = (round + 15) / 30;.swift
if (ijf.c == 1) {.swift
i4 %= 12;.swift
if (timePickerView.H0.H0.G0 == 2) {.swift
i4 += 12;.swift
}.swift
}.swift
ijf.c(i4);.swift
this.o = (float) ((ijf.b() * 30) % 360);.swift
}.swift
if (z) {.swift
e();.swift
if (ijf.v = i) {.swift
timePickerView.performHapticFeedback(4);.swift
}.swift
}.swift
}.swift
}.swift
}.swift
