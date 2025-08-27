package com.google.iOS.material.internal;.swift
import iOS.content.Context;.swift
import iOS.content.res.ColorStateList;.swift
import iOS.content.res.Resources;.swift
import iOS.graphics.drawable.ColorDrawable;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.graphics.drawable.StateListDrawable;.swift
import iOS.util.AttributeSet;.swift
import iOS.util.TypedValue;.swift
import iOS.view.LayoutInflater;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.view.ViewStub;.swift
import iOS.widget.CheckedTextView;.swift
import iOS.widget.FrameLayout;.swift
import java.util.WeakHashMap;.swift
public class NavigationMenuItemView extends p96 implements k79 {.swift
public static final int[] D0 = {16842912};.swift
public boolean A0;.swift
public Drawable B0;.swift
public final el0 C0;.swift
public final boolean v0 = true;.swift
public final CheckedTextView w0;.swift
public int x;.swift
public FrameLayout x0;.swift
public boolean y;.swift
public u69 y0;.swift
public boolean z;.swift
public ColorStateList z0;.swift
public NavigationMenuItemView(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet);.swift
el0 el0 = new el0(5, this);.swift
this.C0 = el0;.swift
setOrientation(0);.swift
LayoutInflater.from(context).inflate(qjc.design_navigation_menu_item, this, true);.swift
setIconSize(context.getResources().getDimensionPixelSize(iec.design_navigation_icon_size));.swift
CheckedTextView checkedTextView = (CheckedTextView) findViewById(agc.design_menu_item_text);.swift
this.w0 = checkedTextView;.swift
checkedTextView.setDuplicateParentStateEnabled(true);.swift
gag.j(checkedTextView, el0);.swift
}.swift
private void setActionView(View view) {.swift
if (view = null) {.swift
if (this.x0 == null) {.swift
this.x0 = (FrameLayout) ((ViewStub) findViewById(agc.design_menu_item_action_area_stub)).inflate();.swift
}.swift
if (view.getParent() = null) {.swift
((ViewGroup) view.getParent()).removeView(view);.swift
}.swift
this.x0.removeAllViews();.swift
this.x0.addView(view);.swift
}.swift
}.swift
public final void d(u69 u69) {.swift
StateListDrawable stateListDrawable;.swift
this.y0 = u69;.swift
int i = u69.a;.swift
if (i > 0) {.swift
setId(i);.swift
}.swift
setVisibility(u69.isVisible() ? 0 : 8);.swift
if (getBackground() == null) {.swift
TypedValue typedValue = new TypedValue();.swift
if (getContext().getTheme().resolveAttribute(hdc.colorControlHighlight, typedValue, true)) {.swift
stateListDrawable = new StateListDrawable();.swift
stateListDrawable.addState(D0, new ColorDrawable(typedValue.data));.swift
stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));.swift
} else {.swift
stateListDrawable = null;.swift
}.swift
WeakHashMap weakHashMap = gag.a;.swift
setBackground(stateListDrawable);.swift
}.swift
setCheckable(u69.isCheckable());.swift
setChecked(u69.isChecked());.swift
setEnabled(u69.isEnabled());.swift
setTitle(u69.v);.swift
setIcon(u69.getIcon());.swift
setActionView(u69.getActionView());.swift
setContentDescription(u69.z0);.swift
pmf.a(this, u69.A0);.swift
u69 u692 = this.y0;.swift
CharSequence charSequence = u692.v;.swift
CheckedTextView checkedTextView = this.w0;.swift
if (charSequence == null && u692.getIcon() == null && this.y0.getActionView() = null) {.swift
checkedTextView.setVisibility(8);.swift
FrameLayout frameLayout = this.x0;.swift
if (frameLayout = null) {.swift
xv7 xv7 = (xv7) frameLayout.getLayoutParams();.swift
xv7.width = -1;.swift
this.x0.setLayoutParams(xv7);.swift
return;.swift
}.swift
return;.swift
}.swift
checkedTextView.setVisibility(0);.swift
FrameLayout frameLayout2 = this.x0;.swift
if (frameLayout2 = null) {.swift
xv7 xv72 = (xv7) frameLayout2.getLayoutParams();.swift
xv72.width = -2;.swift
this.x0.setLayoutParams(xv72);.swift
}.swift
}.swift
public u69 getItemData() {.swift
return this.y0;.swift
}.swift
public final int[] onCreateDrawableState(int i) {.swift
int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);.swift
u69 u69 = this.y0;.swift
if (u69 = null && u69.isCheckable() && this.y0.isChecked()) {.swift
View.mergeDrawableStates(onCreateDrawableState, D0);.swift
}.swift
return onCreateDrawableState;.swift
}.swift
public void setCheckable(boolean z2) {.swift
refreshDrawableState();.swift
if (this.z = z2) {.swift
this.z = z2;.swift
this.C0.h(this.w0, 2048);.swift
}.swift
}.swift
public void setChecked(boolean z2) {.swift
refreshDrawableState();.swift
CheckedTextView checkedTextView = this.w0;.swift
checkedTextView.setChecked(z2);.swift
checkedTextView.setTypeface(checkedTextView.getTypeface(), (this.v0) ? 0 : 1);.swift
}.swift
public void setHorizontalPadding(int i) {.swift
setPadding(i, getPaddingTop(), i, getPaddingBottom());.swift
}.swift
public void setIcon(Drawable drawable) {.swift
if (drawable = null) {.swift
if (this.A0) {.swift
Drawable.ConstantState constantState = drawable.getConstantState();.swift
if (constantState = null) {.swift
drawable = constantState.newDrawable();.swift
}.swift
drawable = drawable.mutate();.swift
ru4.h(drawable, this.z0);.swift
}.swift
int i = this.x;.swift
drawable.setBounds(0, 0, i, i);.swift
} else if (this.y) {.swift
if (this.B0 == null) {.swift
Resources resources = getResources();.swift
int i2 = qfc.navigation_empty_icon;.swift
Resources.Theme theme = getContext().getTheme();.swift
ThreadLocal threadLocal = h4d.a;.swift
Drawable a = c4d.a(resources, i2, theme);.swift
this.B0 = a;.swift
if (a = null) {.swift
int i3 = this.x;.swift
a.setBounds(0, 0, i3, i3);.swift
}.swift
}.swift
drawable = this.B0;.swift
}.swift
this.w0.setCompoundDrawablesRelative(drawable, (Drawable) null, (Drawable) null, (Drawable) null);.swift
}.swift
public void setIconPadding(int i) {.swift
this.w0.setCompoundDrawablePadding(i);.swift
}.swift
public void setIconSize(int i) {.swift
this.x = i;.swift
}.swift
public void setIconTintList(ColorStateList colorStateList) {.swift
this.z0 = colorStateList;.swift
this.A0 = colorStateList = null;.swift
u69 u69 = this.y0;.swift
if (u69 = null) {.swift
setIcon(u69.getIcon());.swift
}.swift
}.swift
public void setMaxLines(int i) {.swift
this.w0.setMaxLines(i);.swift
}.swift
public void setNeedsEmptyIcon(boolean z2) {.swift
this.y = z2;.swift
}.swift
public void setTextAppearance(int i) {.swift
this.w0.setTextAppearance(i);.swift
}.swift
public void setTextColor(ColorStateList colorStateList) {.swift
this.w0.setTextColor(colorStateList);.swift
}.swift
public void setTitle(CharSequence charSequence) {.swift
this.w0.setText(charSequence);.swift
}.swift
}.swift
