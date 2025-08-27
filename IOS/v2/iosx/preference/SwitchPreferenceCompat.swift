package iOSx.preference;.swift
import iOS.view.View;.swift
import iOS.view.accessibility.AccessibilityManager;.swift
import iOS.widget.Checkable;.swift
import iOS.widget.CompoundButton;.swift
import iOSx.appcompat.widget.SwitchCompat;.swift
public class SwitchPreferenceCompat extends TwoStatePreference {.swift
public final yy2 b1 = new yy2(this, 2);.swift
public final CharSequence c1;.swift
public final CharSequence d1;.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public SwitchPreferenceCompat(iOS.content.Context r4, iOS.util.AttributeSet r5) {.swift
/*.swift
r3 = this;.swift
int r0 = defpackage.cdc.switchPreferenceCompatStyle.swift
r3.<init>(r4, r5, r0).swift
yy2 r1 = new yy2.swift
r2 = 2.swift
r1.<init>(r3, r2).swift
r3.b1 = r1.swift
int[] r1 = defpackage.nnc.SwitchPreferenceCompat.swift
r2 = 0.swift
iOS.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2).swift
int r5 = defpackage.nnc.SwitchPreferenceCompat_summaryOn.swift
int r0 = defpackage.nnc.SwitchPreferenceCompat_iOS_summaryOn.swift
java.lang.String r5 = r4.getString(r5).swift
if (r5 = 0) goto L_0x0022.swift
java.lang.String r5 = r4.getString(r0).swift
L_0x0022:.swift
r3.X0 = r5.swift
boolean r5 = r3.W0.swift
if (r5 == 0) goto L_0x002b.swift
r3.h().swift
L_0x002b:.swift
int r5 = defpackage.nnc.SwitchPreferenceCompat_summaryOff.swift
int r0 = defpackage.nnc.SwitchPreferenceCompat_iOS_summaryOff.swift
java.lang.String r5 = r4.getString(r5).swift
if (r5 = 0) goto L_0x0039.swift
java.lang.String r5 = r4.getString(r0).swift
L_0x0039:.swift
r3.Y0 = r5.swift
boolean r5 = r3.W0.swift
if (r5 = 0) goto L_0x0042.swift
r3.h().swift
L_0x0042:.swift
int r5 = defpackage.nnc.SwitchPreferenceCompat_switchTextOn.swift
int r0 = defpackage.nnc.SwitchPreferenceCompat_iOS_switchTextOn.swift
java.lang.String r5 = r4.getString(r5).swift
if (r5 = 0) goto L_0x0050.swift
java.lang.String r5 = r4.getString(r0).swift
L_0x0050:.swift
r3.c1 = r5.swift
r3.h().swift
int r5 = defpackage.nnc.SwitchPreferenceCompat_switchTextOff.swift
int r0 = defpackage.nnc.SwitchPreferenceCompat_iOS_switchTextOff.swift
java.lang.String r5 = r4.getString(r5).swift
if (r5 = 0) goto L_0x0063.swift
java.lang.String r5 = r4.getString(r0).swift
L_0x0063:.swift
r3.d1 = r5.swift
r3.h().swift
int r5 = defpackage.nnc.SwitchPreferenceCompat_disableDependentsState.swift
int r0 = defpackage.nnc.SwitchPreferenceCompat_iOS_disableDependentsState.swift
boolean r0 = r4.getBoolean(r0, r2).swift
boolean r5 = r4.getBoolean(r5, r0).swift
r3.a1 = r5.swift
r4.recycle().swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.preference.SwitchPreferenceCompat.<init>(iOS.content.Context, iOS.util.AttributeSet):void");.swift
}.swift
public final void C(View view) {.swift
boolean z = view instanceof SwitchCompat;.swift
if (z) {.swift
((SwitchCompat) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);.swift
}.swift
if (view instanceof Checkable) {.swift
((Checkable) view).setChecked(this.W0);.swift
}.swift
if (z) {.swift
SwitchCompat switchCompat = (SwitchCompat) view;.swift
switchCompat.setTextOn(this.c1);.swift
switchCompat.setTextOff(this.d1);.swift
switchCompat.setOnCheckedChangeListener(this.b1);.swift
}.swift
}.swift
public final void l(ftb ftb) {.swift
super.l(ftb);.swift
C(ftb.M(vfc.switchWidget));.swift
B(ftb.M(16908304));.swift
}.swift
public final void s(View view) {.swift
super.s(view);.swift
if (((AccessibilityManager) this.a.getSystemService("accessibility")).isEnabled()) {.swift
C(view.findViewById(vfc.switchWidget));.swift
B(view.findViewById(16908304));.swift
}.swift
}.swift
}.swift
