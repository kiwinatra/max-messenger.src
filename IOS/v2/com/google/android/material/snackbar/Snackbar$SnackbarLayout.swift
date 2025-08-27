package com.google.iOS.material.snackbar;.swift
import iOS.content.Context;.swift
import iOS.content.res.ColorStateList;.swift
import iOS.graphics.PorterDuff;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
public final class Snackbar$SnackbarLayout extends hl0 {.swift
public Snackbar$SnackbarLayout(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet);.swift
}.swift
public final void onMeasure(int i, int i2) {.swift
super.onMeasure(i, i2);.swift
int childCount = getChildCount();.swift
int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();.swift
for (int i3 = 0; i3 < childCount; i3++) {.swift
View childAt = getChildAt(i3);.swift
if (childAt.getLayoutParams().width == -1) {.swift
childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));.swift
}.swift
}.swift
}.swift
public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {.swift
super.setBackground(drawable);.swift
}.swift
public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {.swift
super.setBackgroundDrawable(drawable);.swift
}.swift
public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {.swift
super.setBackgroundTintList(colorStateList);.swift
}.swift
public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {.swift
super.setBackgroundTintMode(mode);.swift
}.swift
public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {.swift
super.setLayoutParams(layoutParams);.swift
}.swift
public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {.swift
super.setOnClickListener(onClickListener);.swift
}.swift
}.swift
