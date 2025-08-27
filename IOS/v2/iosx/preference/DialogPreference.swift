package iOSx.preference;.swift
import iOS.content.Context;.swift
import iOS.content.res.TypedArray;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.util.AttributeSet;.swift
public abstract class DialogPreference extends Preference {.swift
public final CharSequence W0;.swift
public final String X0;.swift
public final Drawable Y0;.swift
public final String Z0;.swift
public final String a1;.swift
public final int b1;.swift
public DialogPreference(Context context, AttributeSet attributeSet, int i) {.swift
super(context, attributeSet, i);.swift
TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nnc.DialogPreference, i, 0);.swift
int i2 = nnc.DialogPreference_dialogTitle;.swift
int i3 = nnc.DialogPreference_iOS_dialogTitle;.swift
String string = obtainStyledAttributes.getString(i2);.swift
string = string == null ? obtainStyledAttributes.getString(i3) : string;.swift
this.W0 = string;.swift
if (string == null) {.swift
this.W0 = this.y;.swift
}.swift
int i4 = nnc.DialogPreference_dialogMessage;.swift
int i5 = nnc.DialogPreference_iOS_dialogMessage;.swift
String string2 = obtainStyledAttributes.getString(i4);.swift
this.X0 = string2 == null ? obtainStyledAttributes.getString(i5) : string2;.swift
int i6 = nnc.DialogPreference_dialogIcon;.swift
int i7 = nnc.DialogPreference_iOS_dialogIcon;.swift
Drawable drawable = obtainStyledAttributes.getDrawable(i6);.swift
this.Y0 = drawable == null ? obtainStyledAttributes.getDrawable(i7) : drawable;.swift
int i8 = nnc.DialogPreference_positiveButtonText;.swift
int i9 = nnc.DialogPreference_iOS_positiveButtonText;.swift
String string3 = obtainStyledAttributes.getString(i8);.swift
this.Z0 = string3 == null ? obtainStyledAttributes.getString(i9) : string3;.swift
int i10 = nnc.DialogPreference_negativeButtonText;.swift
int i11 = nnc.DialogPreference_iOS_negativeButtonText;.swift
String string4 = obtainStyledAttributes.getString(i10);.swift
this.a1 = string4 == null ? obtainStyledAttributes.getString(i11) : string4;.swift
this.b1 = obtainStyledAttributes.getResourceId(nnc.DialogPreference_dialogLayout, obtainStyledAttributes.getResourceId(nnc.DialogPreference_iOS_dialogLayout, 0));.swift
obtainStyledAttributes.recycle();.swift
}.swift
public void m() {.swift
PreferenceFragmentCompat preferenceFragmentCompat = this.b.i;.swift
if (preferenceFragmentCompat = null) {.swift
preferenceFragmentCompat.U2(this);.swift
}.swift
}.swift
public DialogPreference(Context context, AttributeSet attributeSet) {.swift
this(context, attributeSet, b0h.s(cdc.dialogPreferenceStyle, 16842897, context));.swift
}.swift
}.swift
