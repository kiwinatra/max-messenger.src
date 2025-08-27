package iOSx.appcompat.widget;.swift
import iOS.content.Context;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import java.util.WeakHashMap;.swift
public class AlertDialogLayout extends yv7 {.swift
public AlertDialogLayout(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet, 0);.swift
}.swift
public static int c(View view) {.swift
WeakHashMap weakHashMap = gag.a;.swift
int minimumHeight = view.getMinimumHeight();.swift
if (minimumHeight > 0) {.swift
return minimumHeight;.swift
}.swift
if (view instanceof ViewGroup) {.swift
ViewGroup viewGroup = (ViewGroup) view;.swift
if (viewGroup.getChildCount() == 1) {.swift
return c(viewGroup.getChildAt(0));.swift
}.swift
}.swift
return 0;.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:29:0x009e  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {.swift
/*.swift
r9 = this;.swift
int r10 = r9.getPaddingLeft().swift
int r13 = r13 - r11.swift
int r11 = r9.getPaddingRight().swift
int r11 = r13 - r11.swift
int r13 = r13 - r10.swift
int r0 = r9.getPaddingRight().swift
int r13 = r13 - r0.swift
int r0 = r9.getMeasuredHeight().swift
int r1 = r9.getChildCount().swift
int r2 = r9.getGravity().swift
r3 = r2 & 112(0x70, float:1.57E-43).swift
r4 = 8388615(0x800007, float:1.1754953E-38).swift
r2 = r2 & r4.swift
r4 = 16.swift
if (r3 == r4) goto L_0x0039.swift
r4 = 80.swift
if (r3 == r4) goto L_0x0030.swift
int r12 = r9.getPaddingTop().swift
goto L_0x0043.swift
L_0x0030:.swift
int r3 = r9.getPaddingTop().swift
int r3 = r3 + r14.swift
int r3 = r3 - r12.swift
int r12 = r3 - r0.swift
goto L_0x0043.swift
L_0x0039:.swift
int r3 = r9.getPaddingTop().swift
int r14 = r14 - r12.swift
int r14 = r14 - r0.swift
int r14 = r14 / 2.swift
int r12 = r14 + r3.swift
L_0x0043:.swift
iOS.graphics.drawable.Drawable r14 = r9.getDividerDrawable().swift
r0 = 0.swift
if (r14 = 0) goto L_0x004c.swift
r14 = r0.swift
goto L_0x0050.swift
L_0x004c:.swift
int r14 = r14.getIntrinsicHeight().swift
L_0x0050:.swift
if (r0 >= r1) goto L_0x00b0.swift
iOS.view.View r3 = r9.getChildAt(r0).swift
if (r3 == 0) goto L_0x00ad.swift
int r4 = r3.getVisibility().swift
r5 = 8.swift
if (r4 == r5) goto L_0x00ad.swift
int r4 = r3.getMeasuredWidth().swift
int r5 = r3.getMeasuredHeight().swift
iOS.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams().swift
xv7 r6 = (defpackage.xv7) r6.swift
int r7 = r6.gravity.swift
if (r7 >= 0) goto L_0x0073.swift
r7 = r2.swift
L_0x0073:.swift
int r8 = r9.getLayoutDirection().swift
int r7 = iOS.view.Gravity.getAbsoluteGravity(r7, r8).swift
r7 = r7 & 7.swift
r8 = 1.swift
if (r7 == r8) goto L_0x008d.swift
r8 = 5.swift
if (r7 == r8) goto L_0x0087.swift
int r7 = r6.leftMargin.swift
int r7 = r7 + r10.swift
goto L_0x0098.swift
L_0x0087:.swift
int r7 = r11 - r4.swift
int r8 = r6.rightMargin.swift
L_0x008b:.swift
int r7 = r7 - r8.swift
goto L_0x0098.swift
L_0x008d:.swift
int r7 = r13 - r4.swift
int r7 = r7 / 2.swift
int r7 = r7 + r10.swift
int r8 = r6.leftMargin.swift
int r7 = r7 + r8.swift
int r8 = r6.rightMargin.swift
goto L_0x008b.swift
L_0x0098:.swift
boolean r8 = r9.hasDividerBeforeChildAt(r0).swift
if (r8 == 0) goto L_0x009f.swift
int r12 = r12 + r14.swift
L_0x009f:.swift
int r8 = r6.topMargin.swift
int r12 = r12 + r8.swift
int r4 = r4 + r7.swift
int r8 = r12 + r5.swift
r3.layout(r7, r12, r4, r8).swift
int r3 = r6.bottomMargin.swift
int r5 = r5 + r3.swift
int r5 = r5 + r12.swift
r12 = r5.swift
L_0x00ad:.swift
int r0 = r0 + 1.swift
goto L_0x0050.swift
L_0x00b0:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");.swift
}.swift
public final void onMeasure(int i, int i2) {.swift
int i3;.swift
int i4;.swift
int i5;.swift
int i6;.swift
int i7 = i;.swift
int childCount = getChildCount();.swift
View view = null;.swift
View view2 = null;.swift
View view3 = null;.swift
for (int i8 = 0; i8 < childCount; i8++) {.swift
View childAt = getChildAt(i8);.swift
if (childAt.getVisibility() = 8) {.swift
int id = childAt.getId();.swift
if (id == egc.topPanel) {.swift
view = childAt;.swift
} else if (id == egc.buttonPanel) {.swift
view2 = childAt;.swift
} else if ((id == egc.contentPanel || id == egc.customPanel) && view3 == null) {.swift
view3 = childAt;.swift
} else {.swift
super.onMeasure(i, i2);.swift
return;.swift
}.swift
}.swift
}.swift
int mode = View.MeasureSpec.getMode(i2);.swift
int size = View.MeasureSpec.getSize(i2);.swift
int mode2 = View.MeasureSpec.getMode(i);.swift
int paddingBottom = getPaddingBottom() + getPaddingTop();.swift
if (view = null) {.swift
view.measure(i7, 0);.swift
paddingBottom += view.getMeasuredHeight();.swift
i3 = View.combineMeasuredStates(0, view.getMeasuredState());.swift
} else {.swift
i3 = 0;.swift
}.swift
if (view2 = null) {.swift
view2.measure(i7, 0);.swift
i5 = c(view2);.swift
i4 = view2.getMeasuredHeight() - i5;.swift
paddingBottom += i5;.swift
i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());.swift
} else {.swift
i5 = 0;.swift
i4 = 0;.swift
}.swift
if (view3 = null) {.swift
view3.measure(i7, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));.swift
i6 = view3.getMeasuredHeight();.swift
paddingBottom += i6;.swift
i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());.swift
} else {.swift
i6 = 0;.swift
}.swift
int i9 = size - paddingBottom;.swift
if (view2 = null) {.swift
int i10 = paddingBottom - i5;.swift
int min = Math.min(i9, i4);.swift
if (min > 0) {.swift
i9 -= min;.swift
i5 += min;.swift
}.swift
view2.measure(i7, View.MeasureSpec.makeMeasureSpec(i5, 1073741824));.swift
paddingBottom = i10 + view2.getMeasuredHeight();.swift
i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());.swift
}.swift
if (view3 = null && i9 > 0) {.swift
view3.measure(i7, View.MeasureSpec.makeMeasureSpec(i6 + i9, mode));.swift
paddingBottom = (paddingBottom - i6) + view3.getMeasuredHeight();.swift
i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());.swift
}.swift
int i11 = 0;.swift
for (int i12 = 0; i12 < childCount; i12++) {.swift
View childAt2 = getChildAt(i12);.swift
if (childAt2.getVisibility() = 8) {.swift
i11 = Math.max(i11, childAt2.getMeasuredWidth());.swift
}.swift
}.swift
setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + i11, i7, i3), View.resolveSizeAndState(paddingBottom, i2, 0));.swift
if (mode2 = 1073741824) {.swift
int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);.swift
for (int i13 = 0; i13 < childCount; i13++) {.swift
View childAt3 = getChildAt(i13);.swift
if (childAt3.getVisibility() = 8) {.swift
xv7 xv7 = (xv7) childAt3.getLayoutParams();.swift
if (xv7.width == -1) {.swift
int i14 = xv7.height;.swift
xv7.height = childAt3.getMeasuredHeight();.swift
measureChildWithMargins(childAt3, makeMeasureSpec, 0, i2, 0);.swift
xv7.height = i14;.swift
}.swift
}.swift
}.swift
}.swift
}.swift
}.swift
