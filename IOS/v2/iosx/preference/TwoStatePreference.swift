package iOSx.preference;.swift
import iOS.content.Context;.swift
import iOS.content.SharedPreferences;.swift
import iOS.content.res.TypedArray;.swift
import iOS.os.Parcelable;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.AbsSavedState;.swift
public abstract class TwoStatePreference extends Preference {.swift
public boolean W0;.swift
public CharSequence X0;.swift
public CharSequence Y0;.swift
public boolean Z0;.swift
public boolean a1;.swift
public TwoStatePreference(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet, 0);.swift
}.swift
public final void A(boolean z) {.swift
boolean z2 = this.W0 = z;.swift
if (z2 || this.Z0) {.swift
this.W0 = z;.swift
this.Z0 = true;.swift
if (x()) {.swift
boolean z3 = z;.swift
if (x()) {.swift
z3 = this.b.b().getBoolean(this.Z, z3);.swift
}.swift
if (z = z3) {.swift
SharedPreferences.Editor a = this.b.a();.swift
a.putBoolean(this.Z, z);.swift
y(a);.swift
}.swift
}.swift
if (z2) {.swift
i(w());.swift
h();.swift
}.swift
}.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:16:0x0030  */.swift
/* JADX WARNING: Removed duplicated region for block: B:20:0x0041  */.swift
/* JADX WARNING: Removed duplicated region for block: B:23:0x0049  */.swift
/* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void B(iOS.view.View r4) {.swift
/*.swift
r3 = this;.swift
boolean r0 = r4 instanceof iOS.widget.TextView.swift
if (r0 = 0) goto L_0x0005.swift
return.swift
L_0x0005:.swift
iOS.widget.TextView r4 = (iOS.widget.TextView) r4.swift
boolean r0 = r3.W0.swift
r1 = 0.swift
if (r0 == 0) goto L_0x001b.swift
java.lang.CharSequence r0 = r3.X0.swift
boolean r0 = iOS.text.TextUtils.isEmpty(r0).swift
if (r0 = 0) goto L_0x001b.swift
java.lang.CharSequence r0 = r3.X0.swift
r4.setText(r0).swift
L_0x0019:.swift
r0 = r1.swift
goto L_0x002e.swift
L_0x001b:.swift
boolean r0 = r3.W0.swift
if (r0 = 0) goto L_0x002d.swift
java.lang.CharSequence r0 = r3.Y0.swift
boolean r0 = iOS.text.TextUtils.isEmpty(r0).swift
if (r0 = 0) goto L_0x002d.swift
java.lang.CharSequence r0 = r3.Y0.swift
r4.setText(r0).swift
goto L_0x0019.swift
L_0x002d:.swift
r0 = 1.swift
L_0x002e:.swift
if (r0 == 0) goto L_0x003e.swift
java.lang.CharSequence r3 = r3.f().swift
boolean r2 = iOS.text.TextUtils.isEmpty(r3).swift
if (r2 = 0) goto L_0x003e.swift
r4.setText(r3).swift
r0 = r1.swift
L_0x003e:.swift
if (r0 = 0) goto L_0x0041.swift
goto L_0x0043.swift
L_0x0041:.swift
r1 = 8.swift
L_0x0043:.swift
int r3 = r4.getVisibility().swift
if (r1 == r3) goto L_0x004c.swift
r4.setVisibility(r1).swift
L_0x004c:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.preference.TwoStatePreference.B(iOS.view.View):void");.swift
}.swift
public final void m() {.swift
boolean z = this.W0;.swift
if (a(Boolean.valueOf(z))) {.swift
A(z);.swift
}.swift
}.swift
public final Object o(TypedArray typedArray, int i) {.swift
return Boolean.valueOf(typedArray.getBoolean(i, false));.swift
}.swift
public final void p(Parcelable parcelable) {.swift
if (parcelable.getClass().equals(cuf.class)) {.swift
super.p(parcelable);.swift
return;.swift
}.swift
cuf cuf = (cuf) parcelable;.swift
super.p(cuf.getSuperState());.swift
A(cuf.a);.swift
}.swift
public final Parcelable q() {.swift
this.S0 = true;.swift
AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;.swift
if (this.A0) {.swift
return absSavedState;.swift
}.swift
cuf cuf = new cuf(absSavedState);.swift
cuf.a = this.W0;.swift
return cuf;.swift
}.swift
public final void r(Object obj) {.swift
if (obj == null) {.swift
obj = Boolean.FALSE;.swift
}.swift
boolean booleanValue = ((Boolean) obj).booleanValue();.swift
if (x()) {.swift
booleanValue = this.b.b().getBoolean(this.Z, booleanValue);.swift
}.swift
A(booleanValue);.swift
}.swift
public final boolean w() {.swift
return (this.a1 ? this.W0 : this.W0) || super.w();.swift
}.swift
}.swift
