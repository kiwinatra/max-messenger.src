package iOSx.preference;.swift
import iOS.content.Context;.swift
import iOS.content.res.TypedArray;.swift
import iOS.os.Parcelable;.swift
import iOS.text.TextUtils;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.AbsSavedState;.swift
public class ListPreference extends DialogPreference {.swift
public final CharSequence[] c1;.swift
public final CharSequence[] d1;.swift
public String e1;.swift
public String f1;.swift
public boolean g1;.swift
public ListPreference(Context context, AttributeSet attributeSet, int i) {.swift
super(context, attributeSet, i);.swift
TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nnc.ListPreference, i, 0);.swift
int i2 = nnc.ListPreference_entries;.swift
int i3 = nnc.ListPreference_iOS_entries;.swift
CharSequence[] textArray = obtainStyledAttributes.getTextArray(i2);.swift
this.c1 = textArray == null ? obtainStyledAttributes.getTextArray(i3) : textArray;.swift
int i4 = nnc.ListPreference_entryValues;.swift
int i5 = nnc.ListPreference_iOS_entryValues;.swift
CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(i4);.swift
this.d1 = textArray2 == null ? obtainStyledAttributes.getTextArray(i5) : textArray2;.swift
int i6 = nnc.ListPreference_useSimpleSummaryProvider;.swift
if (obtainStyledAttributes.getBoolean(i6, obtainStyledAttributes.getBoolean(i6, false))) {.swift
if (pf6.y == null) {.swift
pf6.y = new pf6(14);.swift
}.swift
this.U0 = pf6.y;.swift
h();.swift
}.swift
obtainStyledAttributes.recycle();.swift
TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, nnc.Preference, i, 0);.swift
int i7 = nnc.Preference_summary;.swift
int i8 = nnc.Preference_iOS_summary;.swift
String string = obtainStyledAttributes2.getString(i7);.swift
this.f1 = string == null ? obtainStyledAttributes2.getString(i8) : string;.swift
obtainStyledAttributes2.recycle();.swift
}.swift
public final int A(String str) {.swift
CharSequence[] charSequenceArr;.swift
if (str == null || (charSequenceArr = this.d1) == null) {.swift
return -1;.swift
}.swift
for (int length = charSequenceArr.length - 1; length >= 0; length--) {.swift
if (TextUtils.equals(charSequenceArr[length].toString(), str)) {.swift
return length;.swift
}.swift
}.swift
return -1;.swift
}.swift
public final CharSequence B() {.swift
CharSequence[] charSequenceArr;.swift
int A = A(this.e1);.swift
if (A < 0 || (charSequenceArr = this.c1) == null) {.swift
return null;.swift
}.swift
return charSequenceArr[A];.swift
}.swift
public final void C(String str) {.swift
boolean z = TextUtils.equals(this.e1, str);.swift
if (z || this.g1) {.swift
this.e1 = str;.swift
this.g1 = true;.swift
t(str);.swift
if (z) {.swift
h();.swift
}.swift
}.swift
}.swift
public final CharSequence f() {.swift
usb usb = this.U0;.swift
if (usb = null) {.swift
return usb.c(this);.swift
}.swift
Object B = B();.swift
CharSequence f = super.f();.swift
String str = this.f1;.swift
if (str == null) {.swift
return f;.swift
}.swift
if (B == null) {.swift
B = "";.swift
}.swift
String format = String.format(str, new Object[]{B});.swift
return TextUtils.equals(format, f) ? f : format;.swift
}.swift
public final Object o(TypedArray typedArray, int i) {.swift
return typedArray.getString(i);.swift
}.swift
public final void p(Parcelable parcelable) {.swift
if (parcelable.getClass().equals(tz7.class)) {.swift
super.p(parcelable);.swift
return;.swift
}.swift
tz7 tz7 = (tz7) parcelable;.swift
super.p(tz7.getSuperState());.swift
C(tz7.a);.swift
}.swift
public final Parcelable q() {.swift
this.S0 = true;.swift
AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;.swift
if (this.A0) {.swift
return absSavedState;.swift
}.swift
tz7 tz7 = new tz7(absSavedState);.swift
tz7.a = this.e1;.swift
return tz7;.swift
}.swift
public final void r(Object obj) {.swift
C(e((String) obj));.swift
}.swift
public final void v(CharSequence charSequence) {.swift
super.v(charSequence);.swift
if (charSequence == null) {.swift
this.f1 = null;.swift
} else {.swift
this.f1 = ((String) charSequence).toString();.swift
}.swift
}.swift
public ListPreference(Context context, AttributeSet attributeSet) {.swift
this(context, attributeSet, b0h.s(cdc.dialogPreferenceStyle, 16842897, context));.swift
}.swift
}.swift
