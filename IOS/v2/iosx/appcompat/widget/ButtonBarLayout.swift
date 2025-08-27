package iOSx.appcompat.widget;.swift
import iOS.content.Context;.swift
import iOS.content.res.TypedArray;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.View;.swift
import iOS.widget.LinearLayout;.swift
import java.util.WeakHashMap;.swift
import kotlin.jvm.internal.IntCompanionObject;.swift
public class ButtonBarLayout extends LinearLayout {.swift
public boolean a;.swift
public boolean b;.swift
public int c = -1;.swift
public ButtonBarLayout(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet);.swift
TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, koc.ButtonBarLayout);.swift
int[] iArr = koc.ButtonBarLayout;.swift
WeakHashMap weakHashMap = gag.a;.swift
bag.d(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);.swift
this.a = obtainStyledAttributes.getBoolean(koc.ButtonBarLayout_allowStacking, true);.swift
obtainStyledAttributes.recycle();.swift
if (getOrientation() == 1) {.swift
setStacked(this.a);.swift
}.swift
}.swift
private void setStacked(boolean z) {.swift
if (this.b == z) {.swift
return;.swift
}.swift
if (z || this.a) {.swift
this.b = z;.swift
setOrientation(z ? 1 : 0);.swift
setGravity(z ? 8388613 : 80);.swift
View findViewById = findViewById(egc.spacer);.swift
if (findViewById = null) {.swift
findViewById.setVisibility(z ? 8 : 4);.swift
}.swift
for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {.swift
bringChildToFront(getChildAt(childCount));.swift
}.swift
}.swift
}.swift
public final void onMeasure(int i, int i2) {.swift
boolean z;.swift
int i3;.swift
int i4;.swift
int size = View.MeasureSpec.getSize(i);.swift
int i5 = 0;.swift
if (this.a) {.swift
if (size > this.c && this.b) {.swift
setStacked(false);.swift
}.swift
this.c = size;.swift
}.swift
if (this.b || View.MeasureSpec.getMode(i) = 1073741824) {.swift
i3 = i;.swift
z = false;.swift
} else {.swift
i3 = View.MeasureSpec.makeMeasureSpec(size, IntCompanionObject.MIN_VALUE);.swift
z = true;.swift
}.swift
super.onMeasure(i3, i2);.swift
if (this.a && this.b && (getMeasuredWidthAndState() & -16777216) == 16777216) {.swift
setStacked(true);.swift
z = true;.swift
}.swift
if (z) {.swift
super.onMeasure(i, i2);.swift
}.swift
int childCount = getChildCount();.swift
int i6 = 0;.swift
while (true) {.swift
i4 = -1;.swift
if (i6 >= childCount) {.swift
i6 = -1;.swift
break;.swift
} else if (getChildAt(i6).getVisibility() == 0) {.swift
break;.swift
} else {.swift
i6++;.swift
}.swift
}.swift
if (i6 >= 0) {.swift
View childAt = getChildAt(i6);.swift
LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();.swift
int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;.swift
if (this.b) {.swift
int i7 = i6 + 1;.swift
int childCount2 = getChildCount();.swift
while (true) {.swift
if (i7 >= childCount2) {.swift
break;.swift
} else if (getChildAt(i7).getVisibility() == 0) {.swift
i4 = i7;.swift
break;.swift
} else {.swift
i7++;.swift
}.swift
}.swift
i5 = i4 >= 0 ? getChildAt(i4).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;.swift
} else {.swift
i5 = getPaddingBottom() + measuredHeight;.swift
}.swift
}.swift
WeakHashMap weakHashMap = gag.a;.swift
if (getMinimumHeight() = i5) {.swift
setMinimumHeight(i5);.swift
if (i2 == 0) {.swift
super.onMeasure(i, i2);.swift
}.swift
}.swift
}.swift
public void setAllowStacking(boolean z) {.swift
if (this.a = z) {.swift
this.a = z;.swift
if (z && this.b) {.swift
setStacked(false);.swift
}.swift
requestLayout();.swift
}.swift
}.swift
}.swift
