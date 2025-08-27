package iOSx.preference;.swift
import iOS.content.Context;.swift
import iOS.content.res.TypedArray;.swift
import iOS.os.Bundle;.swift
import iOS.os.Handler;.swift
import iOS.os.Looper;.swift
import iOS.os.Parcelable;.swift
import iOS.text.TextUtils;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.AbsSavedState;.swift
import java.util.ArrayList;.swift
import kotlin.jvm.internal.IntCompanionObject;.swift
public abstract class PreferenceGroup extends Preference {.swift
public final qae W0;.swift
public final Handler X0;.swift
public final ArrayList Y0;.swift
public boolean Z0;.swift
public int a1;.swift
public boolean b1;.swift
public int c1;.swift
public final tj7 d1;.swift
public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {.swift
super(context, attributeSet, i);.swift
this.W0 = new qae(0);.swift
this.X0 = new Handler(Looper.getMainLooper());.swift
this.Z0 = true;.swift
this.a1 = 0;.swift
this.b1 = false;.swift
this.c1 = IntCompanionObject.MAX_VALUE;.swift
this.d1 = new tj7(20, this);.swift
this.Y0 = new ArrayList();.swift
TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nnc.PreferenceGroup, i, 0);.swift
int i2 = nnc.PreferenceGroup_orderingFromXml;.swift
this.Z0 = obtainStyledAttributes.getBoolean(i2, obtainStyledAttributes.getBoolean(i2, true));.swift
if (obtainStyledAttributes.hasValue(nnc.PreferenceGroup_initialExpandedChildrenCount)) {.swift
int i3 = nnc.PreferenceGroup_initialExpandedChildrenCount;.swift
int i4 = obtainStyledAttributes.getInt(i3, obtainStyledAttributes.getInt(i3, IntCompanionObject.MAX_VALUE));.swift
if (i4 = Integer.MAX_VALUE) {.swift
TextUtils.isEmpty(this.Z);.swift
}.swift
this.c1 = i4;.swift
}.swift
obtainStyledAttributes.recycle();.swift
}.swift
public final Preference A(CharSequence charSequence) {.swift
Preference A;.swift
if (charSequence == null) {.swift
throw new IllegalArgumentException("Key cannot be null");.swift
} else if (TextUtils.equals(this.Z, charSequence)) {.swift
return this;.swift
} else {.swift
int C = C();.swift
for (int i = 0; i < C; i++) {.swift
Preference B = B(i);.swift
if (TextUtils.equals(B.Z, charSequence)) {.swift
return B;.swift
}.swift
if ((B instanceof PreferenceGroup) && (A = ((PreferenceGroup) B).A(charSequence)) = null) {.swift
return A;.swift
}.swift
}.swift
return null;.swift
}.swift
}.swift
public final Preference B(int i) {.swift
return (Preference) this.Y0.get(i);.swift
}.swift
public final int C() {.swift
return this.Y0.size();.swift
}.swift
public final void b(Bundle bundle) {.swift
super.b(bundle);.swift
int size = this.Y0.size();.swift
for (int i = 0; i < size; i++) {.swift
B(i).b(bundle);.swift
}.swift
}.swift
public final void c(Bundle bundle) {.swift
super.c(bundle);.swift
int size = this.Y0.size();.swift
for (int i = 0; i < size; i++) {.swift
B(i).c(bundle);.swift
}.swift
}.swift
public final void i(boolean z) {.swift
super.i(z);.swift
int size = this.Y0.size();.swift
for (int i = 0; i < size; i++) {.swift
Preference B = B(i);.swift
if (B.E0 == z) {.swift
B.E0 = z;.swift
B.i(B.w());.swift
B.h();.swift
}.swift
}.swift
}.swift
public final void j() {.swift
super.j();.swift
this.b1 = true;.swift
int C = C();.swift
for (int i = 0; i < C; i++) {.swift
B(i).j();.swift
}.swift
}.swift
public final void n() {.swift
z();.swift
this.b1 = false;.swift
int C = C();.swift
for (int i = 0; i < C; i++) {.swift
B(i).n();.swift
}.swift
}.swift
public final void p(Parcelable parcelable) {.swift
if (parcelable.getClass().equals(zsb.class)) {.swift
super.p(parcelable);.swift
return;.swift
}.swift
zsb zsb = (zsb) parcelable;.swift
this.c1 = zsb.a;.swift
super.p(zsb.getSuperState());.swift
}.swift
public final Parcelable q() {.swift
this.S0 = true;.swift
return new zsb(AbsSavedState.EMPTY_STATE, this.c1);.swift
}.swift
public PreferenceGroup(Context context, AttributeSet attributeSet) {.swift
this(context, attributeSet, 0);.swift
}.swift
}.swift
