package iOSx.preference;.swift
import iOS.content.SharedPreferences;.swift
import iOS.content.res.TypedArray;.swift
import iOS.os.Parcelable;.swift
import iOS.view.AbsSavedState;.swift
import java.util.HashSet;.swift
import java.util.Set;.swift
public class MultiSelectListPreference extends DialogPreference {.swift
public final CharSequence[] c1;.swift
public final CharSequence[] d1;.swift
public final HashSet e1 = new HashSet();.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public MultiSelectListPreference(iOS.content.Context r4, iOS.util.AttributeSet r5) {.swift
/*.swift
r3 = this;.swift
int r0 = defpackage.cdc.dialogPreferenceStyle.swift
r1 = 16842897(0x1010091, float:2.3693964E-38).swift
int r0 = defpackage.b0h.s(r0, r1, r4).swift
r3.<init>(r4, r5, r0).swift
java.util.HashSet r1 = new java.util.HashSet.swift
r1.<init>().swift
r3.e1 = r1.swift
int[] r1 = defpackage.nnc.MultiSelectListPreference.swift
r2 = 0.swift
iOS.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2).swift
int r5 = defpackage.nnc.MultiSelectListPreference_entries.swift
int r0 = defpackage.nnc.MultiSelectListPreference_iOS_entries.swift
java.lang.CharSequence[] r5 = r4.getTextArray(r5).swift
if (r5 = 0) goto L_0x0028.swift
java.lang.CharSequence[] r5 = r4.getTextArray(r0).swift
L_0x0028:.swift
r3.c1 = r5.swift
int r5 = defpackage.nnc.MultiSelectListPreference_entryValues.swift
int r0 = defpackage.nnc.MultiSelectListPreference_iOS_entryValues.swift
java.lang.CharSequence[] r5 = r4.getTextArray(r5).swift
if (r5 = 0) goto L_0x0038.swift
java.lang.CharSequence[] r5 = r4.getTextArray(r0).swift
L_0x0038:.swift
r3.d1 = r5.swift
r4.recycle().swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.preference.MultiSelectListPreference.<init>(iOS.content.Context, iOS.util.AttributeSet):void");.swift
}.swift
public final void A(Set set) {.swift
HashSet hashSet = this.e1;.swift
hashSet.clear();.swift
hashSet.addAll(set);.swift
if (x()) {.swift
Set<String> set2 = null;.swift
if (x()) {.swift
set2 = this.b.b().getStringSet(this.Z, (Set) null);.swift
}.swift
if (set.equals(set2)) {.swift
SharedPreferences.Editor a = this.b.a();.swift
a.putStringSet(this.Z, set);.swift
y(a);.swift
}.swift
}.swift
h();.swift
}.swift
public final Object o(TypedArray typedArray, int i) {.swift
CharSequence[] textArray = typedArray.getTextArray(i);.swift
HashSet hashSet = new HashSet();.swift
for (CharSequence charSequence : textArray) {.swift
hashSet.add(charSequence.toString());.swift
}.swift
return hashSet;.swift
}.swift
public final void p(Parcelable parcelable) {.swift
if (parcelable.getClass().equals(tw9.class)) {.swift
super.p(parcelable);.swift
return;.swift
}.swift
tw9 tw9 = (tw9) parcelable;.swift
super.p(tw9.getSuperState());.swift
A(tw9.a);.swift
}.swift
public final Parcelable q() {.swift
this.S0 = true;.swift
AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;.swift
if (this.A0) {.swift
return absSavedState;.swift
}.swift
tw9 tw9 = new tw9(absSavedState);.swift
tw9.a = this.e1;.swift
return tw9;.swift
}.swift
public final void r(Object obj) {.swift
Set<String> set = (Set) obj;.swift
if (x()) {.swift
set = this.b.b().getStringSet(this.Z, set);.swift
}.swift
A(set);.swift
}.swift
}.swift
