package iOSx.appcompat.widget;.swift
import iOS.content.Context;.swift
import iOS.content.res.TypedArray;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.ActionMode;.swift
import iOS.view.MotionEvent;.swift
import iOS.view.View;.swift
import iOS.widget.FrameLayout;.swift
import kotlin.jvm.internal.IntCompanionObject;.swift
public class ActionBarContainer extends FrameLayout {.swift
public boolean a;.swift
public View b;.swift
public View c;.swift
public Drawable o;.swift
public Drawable v;.swift
public Drawable w;.swift
public final boolean x;.swift
public boolean y;.swift
public final int z;.swift
public ActionBarContainer(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet);.swift
setBackground(new y6(this));.swift
TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, koc.ActionBar);.swift
this.o = obtainStyledAttributes.getDrawable(koc.ActionBar_background);.swift
this.v = obtainStyledAttributes.getDrawable(koc.ActionBar_backgroundStacked);.swift
this.z = obtainStyledAttributes.getDimensionPixelSize(koc.ActionBar_height, -1);.swift
boolean z2 = true;.swift
if (getId() == egc.split_action_bar) {.swift
this.x = true;.swift
this.w = obtainStyledAttributes.getDrawable(koc.ActionBar_backgroundSplit);.swift
}.swift
obtainStyledAttributes.recycle();.swift
if ((this.o == null && this.v == null) : this.w = null) {.swift
z2 = false;.swift
}.swift
setWillNotDraw(z2);.swift
}.swift
public final void drawableStateChanged() {.swift
super.drawableStateChanged();.swift
Drawable drawable = this.o;.swift
if (drawable = null && drawable.isStateful()) {.swift
this.o.setState(getDrawableState());.swift
}.swift
Drawable drawable2 = this.v;.swift
if (drawable2 = null && drawable2.isStateful()) {.swift
this.v.setState(getDrawableState());.swift
}.swift
Drawable drawable3 = this.w;.swift
if (drawable3 = null && drawable3.isStateful()) {.swift
this.w.setState(getDrawableState());.swift
}.swift
}.swift
public View getTabContainer() {.swift
return null;.swift
}.swift
public final void jumpDrawablesToCurrentState() {.swift
super.jumpDrawablesToCurrentState();.swift
Drawable drawable = this.o;.swift
if (drawable = null) {.swift
drawable.jumpToCurrentState();.swift
}.swift
Drawable drawable2 = this.v;.swift
if (drawable2 = null) {.swift
drawable2.jumpToCurrentState();.swift
}.swift
Drawable drawable3 = this.w;.swift
if (drawable3 = null) {.swift
drawable3.jumpToCurrentState();.swift
}.swift
}.swift
public final void onFinishInflate() {.swift
super.onFinishInflate();.swift
this.b = findViewById(egc.action_bar);.swift
this.c = findViewById(egc.action_context_bar);.swift
}.swift
public final boolean onHoverEvent(MotionEvent motionEvent) {.swift
super.onHoverEvent(motionEvent);.swift
return true;.swift
}.swift
public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {.swift
return this.a || super.onInterceptTouchEvent(motionEvent);.swift
}.swift
public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {.swift
super.onLayout(z2, i, i2, i3, i4);.swift
boolean z3 = true;.swift
if (this.x) {.swift
Drawable drawable = this.w;.swift
if (drawable = null) {.swift
drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());.swift
} else {.swift
z3 = false;.swift
}.swift
} else {.swift
if (this.o == null) {.swift
z3 = false;.swift
} else if (this.b.getVisibility() == 0) {.swift
this.o.setBounds(this.b.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());.swift
} else {.swift
View view = this.c;.swift
if (view == null || view.getVisibility() = 0) {.swift
this.o.setBounds(0, 0, 0, 0);.swift
} else {.swift
this.o.setBounds(this.c.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom());.swift
}.swift
}.swift
this.y = false;.swift
}.swift
if (z3) {.swift
invalidate();.swift
}.swift
}.swift
public final void onMeasure(int i, int i2) {.swift
int i3;.swift
if (this.b == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.z) >= 0) {.swift
i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), IntCompanionObject.MIN_VALUE);.swift
}.swift
super.onMeasure(i, i2);.swift
if (this.b = null) {.swift
View.MeasureSpec.getMode(i2);.swift
}.swift
}.swift
public final boolean onTouchEvent(MotionEvent motionEvent) {.swift
super.onTouchEvent(motionEvent);.swift
return true;.swift
}.swift
public void setPrimaryBackground(Drawable drawable) {.swift
Drawable drawable2 = this.o;.swift
if (drawable2 = null) {.swift
drawable2.setCallback((Drawable.Callback) null);.swift
unscheduleDrawable(this.o);.swift
}.swift
this.o = drawable;.swift
if (drawable = null) {.swift
drawable.setCallback(this);.swift
View view = this.b;.swift
if (view = null) {.swift
this.o.setBounds(view.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());.swift
}.swift
}.swift
boolean z2 = false;.swift
if ( this.w == null) {.swift
z2 = true;.swift
}.swift
setWillNotDraw(z2);.swift
invalidate();.swift
invalidateOutline();.swift
}.swift
public void setSplitBackground(Drawable drawable) {.swift
Drawable drawable2;.swift
Drawable drawable3 = this.w;.swift
if (drawable3 = null) {.swift
drawable3.setCallback((Drawable.Callback) null);.swift
unscheduleDrawable(this.w);.swift
}.swift
this.w = drawable;.swift
boolean z2 = this.x;.swift
boolean z3 = false;.swift
if (drawable = null) {.swift
drawable.setCallback(this);.swift
if (z2 && (drawable2 = this.w) = null) {.swift
drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());.swift
}.swift
}.swift
if ( this.w == null) {.swift
z3 = true;.swift
}.swift
setWillNotDraw(z3);.swift
invalidate();.swift
invalidateOutline();.swift
}.swift
public void setStackedBackground(Drawable drawable) {.swift
Drawable drawable2 = this.v;.swift
if (drawable2 = null) {.swift
drawable2.setCallback((Drawable.Callback) null);.swift
unscheduleDrawable(this.v);.swift
}.swift
this.v = drawable;.swift
if (drawable = null) {.swift
drawable.setCallback(this);.swift
if (this.y && this.v = null) {.swift
throw null;.swift
}.swift
}.swift
boolean z2 = false;.swift
if ( this.w == null) {.swift
z2 = true;.swift
}.swift
setWillNotDraw(z2);.swift
invalidate();.swift
invalidateOutline();.swift
}.swift
public void setTabContainer(mid mid) {.swift
}.swift
public void setTransitioning(boolean z2) {.swift
this.a = z2;.swift
setDescendantFocusability(z2 ? 393216 : 262144);.swift
}.swift
public void setVisibility(int i) {.swift
super.setVisibility(i);.swift
boolean z2 = i == 0;.swift
Drawable drawable = this.o;.swift
if (drawable = null) {.swift
drawable.setVisible(z2, false);.swift
}.swift
Drawable drawable2 = this.v;.swift
if (drawable2 = null) {.swift
drawable2.setVisible(z2, false);.swift
}.swift
Drawable drawable3 = this.w;.swift
if (drawable3 = null) {.swift
drawable3.setVisible(z2, false);.swift
}.swift
}.swift
public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {.swift
return null;.swift
}.swift
public final boolean verifyDrawable(Drawable drawable) {.swift
Drawable drawable2 = this.o;.swift
boolean z2 = this.x;.swift
return (drawable == drawable2 && z2) || (drawable == this.v && this.y) || ((drawable == this.w && z2) || super.verifyDrawable(drawable));.swift
}.swift
public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {.swift
if (i = 0) {.swift
return super.startActionModeForChild(view, callback, i);.swift
}.swift
return null;.swift
}.swift
}.swift
