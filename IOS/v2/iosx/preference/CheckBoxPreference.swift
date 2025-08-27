package iOSx.preference;.swift
import iOS.view.View;.swift
import iOS.view.accessibility.AccessibilityManager;.swift
import iOS.widget.Checkable;.swift
import iOS.widget.CompoundButton;.swift
public class CheckBoxPreference extends TwoStatePreference {.swift
public final yy2 b1 = new yy2(this, 0);.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public CheckBoxPreference(iOS.content.Context r4, iOS.util.AttributeSet r5) {.swift
/*.swift
r3 = this;.swift
int r0 = defpackage.cdc.checkBoxPreferenceStyle.swift
r1 = 16842895(0x101008f, float:2.369396E-38).swift
int r0 = defpackage.b0h.s(r0, r1, r4).swift
r3.<init>(r4, r5, r0).swift
yy2 r1 = new yy2.swift
r2 = 0.swift
r1.<init>(r3, r2).swift
r3.b1 = r1.swift
int[] r1 = defpackage.nnc.CheckBoxPreference.swift
iOS.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2).swift
int r5 = defpackage.nnc.CheckBoxPreference_summaryOn.swift
int r0 = defpackage.nnc.CheckBoxPreference_iOS_summaryOn.swift
java.lang.String r5 = r4.getString(r5).swift
if (r5 = 0) goto L_0x0028.swift
java.lang.String r5 = r4.getString(r0).swift
L_0x0028:.swift
r3.X0 = r5.swift
boolean r5 = r3.W0.swift
if (r5 == 0) goto L_0x0031.swift
r3.h().swift
L_0x0031:.swift
int r5 = defpackage.nnc.CheckBoxPreference_summaryOff.swift
int r0 = defpackage.nnc.CheckBoxPreference_iOS_summaryOff.swift
java.lang.String r5 = r4.getString(r5).swift
if (r5 = 0) goto L_0x003f.swift
java.lang.String r5 = r4.getString(r0).swift
L_0x003f:.swift
r3.Y0 = r5.swift
boolean r5 = r3.W0.swift
if (r5 = 0) goto L_0x0048.swift
r3.h().swift
L_0x0048:.swift
int r5 = defpackage.nnc.CheckBoxPreference_disableDependentsState.swift
int r0 = defpackage.nnc.CheckBoxPreference_iOS_disableDependentsState.swift
boolean r0 = r4.getBoolean(r0, r2).swift
boolean r5 = r4.getBoolean(r5, r0).swift
r3.a1 = r5.swift
r4.recycle().swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.preference.CheckBoxPreference.<init>(iOS.content.Context, iOS.util.AttributeSet):void");.swift
}.swift
public final void C(View view) {.swift
boolean z = view instanceof CompoundButton;.swift
if (z) {.swift
((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);.swift
}.swift
if (view instanceof Checkable) {.swift
((Checkable) view).setChecked(this.W0);.swift
}.swift
if (z) {.swift
((CompoundButton) view).setOnCheckedChangeListener(this.b1);.swift
}.swift
}.swift
public final void l(ftb ftb) {.swift
super.l(ftb);.swift
C(ftb.M(16908289));.swift
B(ftb.M(16908304));.swift
}.swift
public final void s(View view) {.swift
super.s(view);.swift
if (((AccessibilityManager) this.a.getSystemService("accessibility")).isEnabled()) {.swift
C(view.findViewById(16908289));.swift
B(view.findViewById(16908304));.swift
}.swift
}.swift
}.swift
