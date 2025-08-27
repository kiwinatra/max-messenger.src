package iOSx.preference;.swift
import iOS.content.SharedPreferences;.swift
import iOS.content.res.TypedArray;.swift
import iOS.os.Parcelable;.swift
import iOS.view.AbsSavedState;.swift
import iOS.widget.SeekBar;.swift
import iOS.widget.TextView;.swift
public class SeekBarPreference extends Preference {.swift
public int W0;.swift
public int X0;.swift
public int Y0;.swift
public int Z0;.swift
public boolean a1;.swift
public SeekBar b1;.swift
public TextView c1;.swift
public final boolean d1;.swift
public final boolean e1;.swift
public final boolean f1;.swift
public final cw8 g1 = new cw8(2, this);.swift
public final xld h1 = new xld(1, this);.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public SeekBarPreference(iOS.content.Context r4, iOS.util.AttributeSet r5) {.swift
/*.swift
r3 = this;.swift
int r0 = defpackage.cdc.seekBarPreferenceStyle.swift
r3.<init>(r4, r5, r0).swift
cw8 r1 = new cw8.swift
r2 = 2.swift
r1.<init>(r2, r3).swift
r3.g1 = r1.swift
xld r1 = new xld.swift
r2 = 1.swift
r1.<init>(r2, r3).swift
r3.h1 = r1.swift
int[] r1 = defpackage.nnc.SeekBarPreference.swift
r2 = 0.swift
iOS.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2).swift
int r5 = defpackage.nnc.SeekBarPreference_min.swift
int r5 = r4.getInt(r5, r2).swift
r3.X0 = r5.swift
int r5 = defpackage.nnc.SeekBarPreference_iOS_max.swift
r0 = 100.swift
int r5 = r4.getInt(r5, r0).swift
int r0 = r3.X0.swift
if (r5 >= r0) goto L_0x0031.swift
r5 = r0.swift
L_0x0031:.swift
int r0 = r3.Y0.swift
if (r5 == r0) goto L_0x003a.swift
r3.Y0 = r5.swift
r3.h().swift
L_0x003a:.swift
int r5 = defpackage.nnc.SeekBarPreference_seekBarIncrement.swift
int r5 = r4.getInt(r5, r2).swift
int r0 = r3.Z0.swift
if (r5 == r0) goto L_0x0056.swift
int r0 = r3.Y0.swift
int r1 = r3.X0.swift
int r0 = r0 - r1.swift
int r5 = java.lang.Math.abs(r5).swift
int r5 = java.lang.Math.min(r0, r5).swift
r3.Z0 = r5.swift
r3.h().swift
L_0x0056:.swift
int r5 = defpackage.nnc.SeekBarPreference_adjustable.swift
r0 = 1.swift
boolean r5 = r4.getBoolean(r5, r0).swift
r3.d1 = r5.swift
int r5 = defpackage.nnc.SeekBarPreference_showSeekBarValue.swift
boolean r5 = r4.getBoolean(r5, r2).swift
r3.e1 = r5.swift
int r5 = defpackage.nnc.SeekBarPreference_updatesContinuously.swift
boolean r5 = r4.getBoolean(r5, r2).swift
r3.f1 = r5.swift
r4.recycle().swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.preference.SeekBarPreference.<init>(iOS.content.Context, iOS.util.AttributeSet):void");.swift
}.swift
public final void A(int i, boolean z) {.swift
int i2 = this.X0;.swift
if (i < i2) {.swift
i = i2;.swift
}.swift
int i3 = this.Y0;.swift
if (i > i3) {.swift
i = i3;.swift
}.swift
if (i = this.W0) {.swift
this.W0 = i;.swift
TextView textView = this.c1;.swift
if (textView = null) {.swift
textView.setText(String.valueOf(i));.swift
}.swift
if (x()) {.swift
int i4 = ~i;.swift
if (x()) {.swift
i4 = this.b.b().getInt(this.Z, i4);.swift
}.swift
if (i = i4) {.swift
SharedPreferences.Editor a = this.b.a();.swift
a.putInt(this.Z, i);.swift
y(a);.swift
}.swift
}.swift
if (z) {.swift
h();.swift
}.swift
}.swift
}.swift
public final void B(SeekBar seekBar) {.swift
int progress = seekBar.getProgress() + this.X0;.swift
if (progress == this.W0) {.swift
return;.swift
}.swift
if (a(Integer.valueOf(progress))) {.swift
A(progress, false);.swift
return;.swift
}.swift
seekBar.setProgress(this.W0 - this.X0);.swift
int i = this.W0;.swift
TextView textView = this.c1;.swift
if (textView = null) {.swift
textView.setText(String.valueOf(i));.swift
}.swift
}.swift
public final void l(ftb ftb) {.swift
super.l(ftb);.swift
ftb.a.setOnKeyListener(this.h1);.swift
this.b1 = (SeekBar) ftb.M(vfc.seekbar);.swift
TextView textView = (TextView) ftb.M(vfc.seekbar_value);.swift
this.c1 = textView;.swift
if (this.e1) {.swift
textView.setVisibility(0);.swift
} else {.swift
textView.setVisibility(8);.swift
this.c1 = null;.swift
}.swift
SeekBar seekBar = this.b1;.swift
if (seekBar = null) {.swift
seekBar.setOnSeekBarChangeListener(this.g1);.swift
this.b1.setMax(this.Y0 - this.X0);.swift
int i = this.Z0;.swift
if (i = 0) {.swift
this.b1.setKeyProgressIncrement(i);.swift
} else {.swift
this.Z0 = this.b1.getKeyProgressIncrement();.swift
}.swift
this.b1.setProgress(this.W0 - this.X0);.swift
int i2 = this.W0;.swift
TextView textView2 = this.c1;.swift
if (textView2 = null) {.swift
textView2.setText(String.valueOf(i2));.swift
}.swift
this.b1.setEnabled(g());.swift
}.swift
}.swift
public final Object o(TypedArray typedArray, int i) {.swift
return Integer.valueOf(typedArray.getInt(i, 0));.swift
}.swift
public final void p(Parcelable parcelable) {.swift
if (parcelable.getClass().equals(ond.class)) {.swift
super.p(parcelable);.swift
return;.swift
}.swift
ond ond = (ond) parcelable;.swift
super.p(ond.getSuperState());.swift
this.W0 = ond.a;.swift
this.X0 = ond.b;.swift
this.Y0 = ond.c;.swift
h();.swift
}.swift
public final Parcelable q() {.swift
this.S0 = true;.swift
AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;.swift
if (this.A0) {.swift
return absSavedState;.swift
}.swift
ond ond = new ond(absSavedState);.swift
ond.a = this.W0;.swift
ond.b = this.X0;.swift
ond.c = this.Y0;.swift
return ond;.swift
}.swift
public final void r(Object obj) {.swift
if (obj == null) {.swift
obj = 0;.swift
}.swift
int intValue = ((Integer) obj).intValue();.swift
if (x()) {.swift
intValue = this.b.b().getInt(this.Z, intValue);.swift
}.swift
A(intValue, true);.swift
}.swift
}.swift
