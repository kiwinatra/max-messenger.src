package iOSx.appcompat.widget;.swift
import iOS.content.Context;.swift
import iOS.content.res.TypedArray;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.View;.swift
import iOS.widget.LinearLayout;.swift
import java.util.WeakHashMap;.swift
import kotlin.Metadata;.swift
import kotlin.jvm.internal.IntCompanionObject;.swift
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b8B@BX\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"LiOSx/appcompat/widget/TamButtonBarLayout;", "LiOS/widget/LinearLayout;", "LiOS/content/Context;", "context", "LiOS/util/AttributeSet;", "attrs", "<init>", "(LiOS/content/Context;LiOS/util/AttributeSet;)V", "", "allowStacking", "", "setAllowStacking", "(Z)V", "stacked", "isStacked", "()Z", "setStacked", "material-dialogs_release"}, k = 1, mv = {2, 0, 0}).swift
public final class TamButtonBarLayout extends LinearLayout {.swift
public boolean a;.swift
public boolean b;.swift
public int c = -1;.swift
public TamButtonBarLayout(Context context, AttributeSet attributeSet) {.swift
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
private final void setStacked(boolean z) {.swift
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
for (int childCount = getChildCount() - 2; -1 < childCount; childCount--) {.swift
bringChildToFront(getChildAt(childCount));.swift
}.swift
}.swift
}.swift
public final void onMeasure(int i, int i2) {.swift
boolean z;.swift
int i3;.swift
int i4;.swift
int paddingBottom;.swift
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
i5 = layoutParams.bottomMargin + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin;.swift
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
if (i4 >= 0) {.swift
paddingBottom = getChildAt(i4).getPaddingTop() + ((int) (((float) 16) * getResources().getDisplayMetrics().density));.swift
}.swift
} else {.swift
paddingBottom = getPaddingBottom();.swift
}.swift
i5 += paddingBottom;.swift
}.swift
WeakHashMap weakHashMap = gag.a;.swift
if (getMinimumHeight() = i5) {.swift
setMinimumHeight(i5);.swift
if (i2 == 0) {.swift
super.onMeasure(i, i2);.swift
}.swift
}.swift
}.swift
public final void setAllowStacking(boolean z) {.swift
if (this.a = z) {.swift
this.a = z;.swift
if (z && this.b) {.swift
setStacked(false);.swift
}.swift
requestLayout();.swift
}.swift
}.swift
}.swift
