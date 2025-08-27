package iOSx.preference;.swift
import iOS.os.Bundle;.swift
import java.util.ArrayList;.swift
import java.util.HashSet;.swift
public class MultiSelectListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {.swift
public final HashSet J1 = new HashSet();.swift
public boolean K1;.swift
public CharSequence[] L1;.swift
public CharSequence[] M1;.swift
public final void c3(boolean z) {.swift
if (z && this.K1) {.swift
MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) Z2();.swift
HashSet hashSet = this.J1;.swift
if (multiSelectListPreference.a(hashSet)) {.swift
multiSelectListPreference.A(hashSet);.swift
}.swift
}.swift
this.K1 = false;.swift
}.swift
public final void d3(dd ddVar) {.swift
int length = this.M1.length;.swift
boolean[] zArr = new boolean[length];.swift
for (int i = 0; i < length; i++) {.swift
zArr[i] = this.J1.contains(this.M1[i].toString());.swift
}.swift
ddVar.c(this.L1, zArr, new uw9(this));.swift
}.swift
public final void i2(Bundle bundle) {.swift
CharSequence[] charSequenceArr;.swift
super.i2(bundle);.swift
HashSet hashSet = this.J1;.swift
if (bundle == null) {.swift
MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) Z2();.swift
if (multiSelectListPreference.c1 == null || (charSequenceArr = multiSelectListPreference.d1) == null) {.swift
throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");.swift
}.swift
hashSet.clear();.swift
hashSet.addAll(multiSelectListPreference.e1);.swift
this.K1 = false;.swift
this.L1 = multiSelectListPreference.c1;.swift
this.M1 = charSequenceArr;.swift
return;.swift
}.swift
hashSet.clear();.swift
hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));.swift
this.K1 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);.swift
this.L1 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");.swift
this.M1 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");.swift
}.swift
public final void x2(Bundle bundle) {.swift
super.x2(bundle);.swift
bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList(this.J1));.swift
bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.K1);.swift
bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.L1);.swift
bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.M1);.swift
}.swift
}.swift
