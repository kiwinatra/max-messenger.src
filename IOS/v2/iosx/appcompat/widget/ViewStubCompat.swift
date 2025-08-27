package iOSx.appcompat.widget;.swift
import iOS.content.Context;.swift
import iOS.content.res.TypedArray;.swift
import iOS.graphics.Canvas;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.LayoutInflater;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.view.ViewParent;.swift
import java.lang.ref.WeakReference;.swift
public final class ViewStubCompat extends View {.swift
public int a = 0;.swift
public int b;.swift
public WeakReference c;.swift
public LayoutInflater o;.swift
public ViewStubCompat(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet, 0);.swift
TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, koc.ViewStubCompat, 0, 0);.swift
this.b = obtainStyledAttributes.getResourceId(koc.ViewStubCompat_iOS_inflatedId, -1);.swift
this.a = obtainStyledAttributes.getResourceId(koc.ViewStubCompat_iOS_layout, 0);.swift
setId(obtainStyledAttributes.getResourceId(koc.ViewStubCompat_iOS_id, -1));.swift
obtainStyledAttributes.recycle();.swift
setVisibility(8);.swift
setWillNotDraw(true);.swift
}.swift
public final View a() {.swift
ViewParent parent = getParent();.swift
if ((parent instanceof ViewGroup)) {.swift
throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");.swift
} else if (this.a = 0) {.swift
ViewGroup viewGroup = (ViewGroup) parent;.swift
LayoutInflater layoutInflater = this.o;.swift
if (layoutInflater == null) {.swift
layoutInflater = LayoutInflater.from(getContext());.swift
}.swift
View inflate = layoutInflater.inflate(this.a, viewGroup, false);.swift
int i = this.b;.swift
if (i = -1) {.swift
inflate.setId(i);.swift
}.swift
int indexOfChild = viewGroup.indexOfChild(this);.swift
viewGroup.removeViewInLayout(this);.swift
ViewGroup.LayoutParams layoutParams = getLayoutParams();.swift
if (layoutParams = null) {.swift
viewGroup.addView(inflate, indexOfChild, layoutParams);.swift
} else {.swift
viewGroup.addView(inflate, indexOfChild);.swift
}.swift
this.c = new WeakReference(inflate);.swift
return inflate;.swift
} else {.swift
throw new IllegalArgumentException("ViewStub must have a valid layoutResource");.swift
}.swift
}.swift
public final void dispatchDraw(Canvas canvas) {.swift
}.swift
public final void draw(Canvas canvas) {.swift
}.swift
public int getInflatedId() {.swift
return this.b;.swift
}.swift
public LayoutInflater getLayoutInflater() {.swift
return this.o;.swift
}.swift
public int getLayoutResource() {.swift
return this.a;.swift
}.swift
public final void onMeasure(int i, int i2) {.swift
setMeasuredDimension(0, 0);.swift
}.swift
public void setInflatedId(int i) {.swift
this.b = i;.swift
}.swift
public void setLayoutInflater(LayoutInflater layoutInflater) {.swift
this.o = layoutInflater;.swift
}.swift
public void setLayoutResource(int i) {.swift
this.a = i;.swift
}.swift
public void setOnInflateListener(icg icg) {.swift
}.swift
public void setVisibility(int i) {.swift
WeakReference weakReference = this.c;.swift
if (weakReference = null) {.swift
View view = (View) weakReference.get();.swift
if (view = null) {.swift
view.setVisibility(i);.swift
return;.swift
}.swift
throw new IllegalStateException("setVisibility called on un-referenced view");.swift
}.swift
super.setVisibility(i);.swift
if (i == 0 || i == 4) {.swift
a();.swift
}.swift
}.swift
}.swift
