package iOSx.preference;.swift
import iOS.content.res.TypedArray;.swift
import iOS.os.Parcelable;.swift
import iOS.text.TextUtils;.swift
import iOS.view.AbsSavedState;.swift
public class EditTextPreference extends DialogPreference {.swift
public String c1;.swift
/* JADX WARNING: type inference failed for: r5v5, types: [java.lang.Object, wc8] */.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public EditTextPreference(iOS.content.Context r4, iOS.util.AttributeSet r5) {.swift
/*.swift
r3 = this;.swift
int r0 = defpackage.cdc.editTextPreferenceStyle.swift
r1 = 16842898(0x1010092, float:2.3693967E-38).swift
int r0 = defpackage.b0h.s(r0, r1, r4).swift
r3.<init>(r4, r5, r0).swift
int[] r1 = defpackage.nnc.EditTextPreference.swift
r2 = 0.swift
iOS.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2).swift
int r5 = defpackage.nnc.EditTextPreference_useSimpleSummaryProvider.swift
boolean r0 = r4.getBoolean(r5, r2).swift
boolean r5 = r4.getBoolean(r5, r0).swift
if (r5 == 0) goto L_0x0031.swift
wc8 r5 = defpackage.wc8.x.swift
if (r5 = 0) goto L_0x002a.swift
wc8 r5 = new wc8.swift
r5.<init>().swift
defpackage.wc8.x = r5.swift
L_0x002a:.swift
wc8 r5 = defpackage.wc8.x.swift
r3.U0 = r5.swift
r3.h().swift
L_0x0031:.swift
r4.recycle().swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.preference.EditTextPreference.<init>(iOS.content.Context, iOS.util.AttributeSet):void");.swift
}.swift
public final void A(String str) {.swift
boolean w = w();.swift
this.c1 = str;.swift
t(str);.swift
boolean w2 = w();.swift
if (w2 = w) {.swift
i(w2);.swift
}.swift
h();.swift
}.swift
public final Object o(TypedArray typedArray, int i) {.swift
return typedArray.getString(i);.swift
}.swift
public final void p(Parcelable parcelable) {.swift
if (parcelable.getClass().equals(b05.class)) {.swift
super.p(parcelable);.swift
return;.swift
}.swift
b05 b05 = (b05) parcelable;.swift
super.p(b05.getSuperState());.swift
A(b05.a);.swift
}.swift
public final Parcelable q() {.swift
this.S0 = true;.swift
AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;.swift
if (this.A0) {.swift
return absSavedState;.swift
}.swift
b05 b05 = new b05(absSavedState);.swift
b05.a = this.c1;.swift
return b05;.swift
}.swift
public final void r(Object obj) {.swift
A(e((String) obj));.swift
}.swift
public final boolean w() {.swift
return TextUtils.isEmpty(this.c1) || super.w();.swift
}.swift
}.swift
