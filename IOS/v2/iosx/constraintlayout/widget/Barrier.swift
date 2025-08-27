package iOSx.constraintlayout.widget;.swift
import iOS.content.Context;.swift
import iOS.content.res.TypedArray;.swift
import iOS.util.AttributeSet;.swift
import java.util.HashMap;.swift
public class Barrier extends dj3 {.swift
public ii0 v0;.swift
public int y;.swift
public int z;.swift
public Barrier(Context context) {.swift
super(context);.swift
this.a = new int[32];.swift
this.x = new HashMap();.swift
this.c = context;.swift
h((AttributeSet) null);.swift
super.setVisibility(8);.swift
}.swift
public boolean getAllowsGoneWidget() {.swift
return this.v0.t0;.swift
}.swift
public int getMargin() {.swift
return this.v0.u0;.swift
}.swift
public int getType() {.swift
return this.y;.swift
}.swift
/* JADX WARNING: type inference failed for: r0v0, types: [cy6, ii0] */.swift
public final void h(AttributeSet attributeSet) {.swift
super.h(attributeSet);.swift
? cy6 = new cy6();.swift
cy6.s0 = 0;.swift
cy6.t0 = true;.swift
cy6.u0 = 0;.swift
cy6.v0 = false;.swift
this.v0 = cy6;.swift
if (attributeSet = null) {.swift
TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, doc.ConstraintLayout_Layout);.swift
int indexCount = obtainStyledAttributes.getIndexCount();.swift
for (int i = 0; i < indexCount; i++) {.swift
int index = obtainStyledAttributes.getIndex(i);.swift
if (index == doc.ConstraintLayout_Layout_barrierDirection) {.swift
setType(obtainStyledAttributes.getInt(index, 0));.swift
} else if (index == doc.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {.swift
this.v0.t0 = obtainStyledAttributes.getBoolean(index, true);.swift
} else if (index == doc.ConstraintLayout_Layout_barrierMargin) {.swift
this.v0.u0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);.swift
}.swift
}.swift
obtainStyledAttributes.recycle();.swift
}.swift
this.o = this.v0;.swift
k();.swift
}.swift
public final void i(tj3 tj3, boolean z2) {.swift
int i = this.y;.swift
this.z = i;.swift
if (z2) {.swift
if (i == 5) {.swift
this.z = 1;.swift
} else if (i == 6) {.swift
this.z = 0;.swift
}.swift
} else if (i == 5) {.swift
this.z = 0;.swift
} else if (i == 6) {.swift
this.z = 1;.swift
}.swift
if (tj3 instanceof ii0) {.swift
((ii0) tj3).s0 = this.z;.swift
}.swift
}.swift
public void setAllowsGoneWidget(boolean z2) {.swift
this.v0.t0 = z2;.swift
}.swift
public void setDpMargin(int i) {.swift
this.v0.u0 = (int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f);.swift
}.swift
public void setMargin(int i) {.swift
this.v0.u0 = i;.swift
}.swift
public void setType(int i) {.swift
this.y = i;.swift
}.swift
public Barrier(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet);.swift
super.setVisibility(8);.swift
}.swift
}.swift
