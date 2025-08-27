package iOSx.constraintlayout.helper.widget;.swift
import iOS.content.Context;.swift
import iOS.content.res.TypedArray;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.View;.swift
import java.util.ArrayList;.swift
public class Flow extends kdg {.swift
public cs5 v0;.swift
public Flow(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet);.swift
}.swift
/* JADX WARNING: type inference failed for: r0v0, types: [cy6, cs5] */.swift
public final void h(AttributeSet attributeSet) {.swift
super.h(attributeSet);.swift
? cy6 = new cy6();.swift
cy6.s0 = 0;.swift
cy6.t0 = 0;.swift
cy6.u0 = 0;.swift
cy6.v0 = 0;.swift
cy6.w0 = 0;.swift
cy6.x0 = 0;.swift
cy6.y0 = false;.swift
cy6.z0 = 0;.swift
cy6.A0 = 0;.swift
cy6.B0 = new xl0(0);.swift
cy6.C0 = null;.swift
cy6.D0 = -1;.swift
cy6.E0 = -1;.swift
cy6.F0 = -1;.swift
cy6.G0 = -1;.swift
cy6.H0 = -1;.swift
cy6.I0 = -1;.swift
cy6.J0 = 0.5f;.swift
cy6.K0 = 0.5f;.swift
cy6.L0 = 0.5f;.swift
cy6.M0 = 0.5f;.swift
cy6.N0 = 0.5f;.swift
cy6.O0 = 0.5f;.swift
cy6.P0 = 0;.swift
cy6.Q0 = 0;.swift
cy6.R0 = 2;.swift
cy6.S0 = 2;.swift
cy6.T0 = 0;.swift
cy6.U0 = -1;.swift
cy6.V0 = 0;.swift
cy6.W0 = new ArrayList();.swift
cy6.X0 = null;.swift
cy6.Y0 = null;.swift
cy6.Z0 = null;.swift
cy6.b1 = 0;.swift
this.v0 = cy6;.swift
if (attributeSet = null) {.swift
TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, doc.ConstraintLayout_Layout);.swift
int indexCount = obtainStyledAttributes.getIndexCount();.swift
for (int i = 0; i < indexCount; i++) {.swift
int index = obtainStyledAttributes.getIndex(i);.swift
if (index == doc.ConstraintLayout_Layout_iOS_orientation) {.swift
this.v0.V0 = obtainStyledAttributes.getInt(index, 0);.swift
} else if (index == doc.ConstraintLayout_Layout_iOS_padding) {.swift
cs5 cs5 = this.v0;.swift
int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);.swift
cs5.s0 = dimensionPixelSize;.swift
cs5.t0 = dimensionPixelSize;.swift
cs5.u0 = dimensionPixelSize;.swift
cs5.v0 = dimensionPixelSize;.swift
} else if (index == doc.ConstraintLayout_Layout_iOS_paddingStart) {.swift
cs5 cs52 = this.v0;.swift
int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);.swift
cs52.u0 = dimensionPixelSize2;.swift
cs52.w0 = dimensionPixelSize2;.swift
cs52.x0 = dimensionPixelSize2;.swift
} else if (index == doc.ConstraintLayout_Layout_iOS_paddingEnd) {.swift
this.v0.v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);.swift
} else if (index == doc.ConstraintLayout_Layout_iOS_paddingLeft) {.swift
this.v0.w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);.swift
} else if (index == doc.ConstraintLayout_Layout_iOS_paddingTop) {.swift
this.v0.s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);.swift
} else if (index == doc.ConstraintLayout_Layout_iOS_paddingRight) {.swift
this.v0.x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);.swift
} else if (index == doc.ConstraintLayout_Layout_iOS_paddingBottom) {.swift
this.v0.t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);.swift
} else if (index == doc.ConstraintLayout_Layout_flow_wrapMode) {.swift
this.v0.T0 = obtainStyledAttributes.getInt(index, 0);.swift
} else if (index == doc.ConstraintLayout_Layout_flow_horizontalStyle) {.swift
this.v0.D0 = obtainStyledAttributes.getInt(index, 0);.swift
} else if (index == doc.ConstraintLayout_Layout_flow_verticalStyle) {.swift
this.v0.E0 = obtainStyledAttributes.getInt(index, 0);.swift
} else if (index == doc.ConstraintLayout_Layout_flow_firstHorizontalStyle) {.swift
this.v0.F0 = obtainStyledAttributes.getInt(index, 0);.swift
} else if (index == doc.ConstraintLayout_Layout_flow_lastHorizontalStyle) {.swift
this.v0.H0 = obtainStyledAttributes.getInt(index, 0);.swift
} else if (index == doc.ConstraintLayout_Layout_flow_firstVerticalStyle) {.swift
this.v0.G0 = obtainStyledAttributes.getInt(index, 0);.swift
} else if (index == doc.ConstraintLayout_Layout_flow_lastVerticalStyle) {.swift
this.v0.I0 = obtainStyledAttributes.getInt(index, 0);.swift
} else if (index == doc.ConstraintLayout_Layout_flow_horizontalBias) {.swift
this.v0.J0 = obtainStyledAttributes.getFloat(index, 0.5f);.swift
} else if (index == doc.ConstraintLayout_Layout_flow_firstHorizontalBias) {.swift
this.v0.L0 = obtainStyledAttributes.getFloat(index, 0.5f);.swift
} else if (index == doc.ConstraintLayout_Layout_flow_lastHorizontalBias) {.swift
this.v0.N0 = obtainStyledAttributes.getFloat(index, 0.5f);.swift
} else if (index == doc.ConstraintLayout_Layout_flow_firstVerticalBias) {.swift
this.v0.M0 = obtainStyledAttributes.getFloat(index, 0.5f);.swift
} else if (index == doc.ConstraintLayout_Layout_flow_lastVerticalBias) {.swift
this.v0.O0 = obtainStyledAttributes.getFloat(index, 0.5f);.swift
} else if (index == doc.ConstraintLayout_Layout_flow_verticalBias) {.swift
this.v0.K0 = obtainStyledAttributes.getFloat(index, 0.5f);.swift
} else if (index == doc.ConstraintLayout_Layout_flow_horizontalAlign) {.swift
this.v0.R0 = obtainStyledAttributes.getInt(index, 2);.swift
} else if (index == doc.ConstraintLayout_Layout_flow_verticalAlign) {.swift
this.v0.S0 = obtainStyledAttributes.getInt(index, 2);.swift
} else if (index == doc.ConstraintLayout_Layout_flow_horizontalGap) {.swift
this.v0.P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);.swift
} else if (index == doc.ConstraintLayout_Layout_flow_verticalGap) {.swift
this.v0.Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);.swift
} else if (index == doc.ConstraintLayout_Layout_flow_maxElementsWrap) {.swift
this.v0.U0 = obtainStyledAttributes.getInt(index, -1);.swift
}.swift
}.swift
obtainStyledAttributes.recycle();.swift
}.swift
this.o = this.v0;.swift
k();.swift
}.swift
public final void i(tj3 tj3, boolean z) {.swift
cs5 cs5 = this.v0;.swift
int i = cs5.u0;.swift
if (i <= 0 && cs5.v0 <= 0) {.swift
return;.swift
}.swift
if (z) {.swift
cs5.w0 = cs5.v0;.swift
cs5.x0 = i;.swift
return;.swift
}.swift
cs5.w0 = i;.swift
cs5.x0 = cs5.v0;.swift
}.swift
public final void l(cs5 cs5, int i, int i2) {.swift
int mode = View.MeasureSpec.getMode(i);.swift
int size = View.MeasureSpec.getSize(i);.swift
int mode2 = View.MeasureSpec.getMode(i2);.swift
int size2 = View.MeasureSpec.getSize(i2);.swift
if (cs5 = null) {.swift
cs5.V(mode, size, mode2, size2);.swift
setMeasuredDimension(cs5.z0, cs5.A0);.swift
return;.swift
}.swift
setMeasuredDimension(0, 0);.swift
}.swift
public final void onMeasure(int i, int i2) {.swift
l(this.v0, i, i2);.swift
}.swift
public void setFirstHorizontalBias(float f) {.swift
this.v0.L0 = f;.swift
requestLayout();.swift
}.swift
public void setFirstHorizontalStyle(int i) {.swift
this.v0.F0 = i;.swift
requestLayout();.swift
}.swift
public void setFirstVerticalBias(float f) {.swift
this.v0.M0 = f;.swift
requestLayout();.swift
}.swift
public void setFirstVerticalStyle(int i) {.swift
this.v0.G0 = i;.swift
requestLayout();.swift
}.swift
public void setHorizontalAlign(int i) {.swift
this.v0.R0 = i;.swift
requestLayout();.swift
}.swift
public void setHorizontalBias(float f) {.swift
this.v0.J0 = f;.swift
requestLayout();.swift
}.swift
public void setHorizontalGap(int i) {.swift
this.v0.P0 = i;.swift
requestLayout();.swift
}.swift
public void setHorizontalStyle(int i) {.swift
this.v0.D0 = i;.swift
requestLayout();.swift
}.swift
public void setLastHorizontalBias(float f) {.swift
this.v0.N0 = f;.swift
requestLayout();.swift
}.swift
public void setLastHorizontalStyle(int i) {.swift
this.v0.H0 = i;.swift
requestLayout();.swift
}.swift
public void setLastVerticalBias(float f) {.swift
this.v0.O0 = f;.swift
requestLayout();.swift
}.swift
public void setLastVerticalStyle(int i) {.swift
this.v0.I0 = i;.swift
requestLayout();.swift
}.swift
public void setMaxElementsWrap(int i) {.swift
this.v0.U0 = i;.swift
requestLayout();.swift
}.swift
public void setOrientation(int i) {.swift
this.v0.V0 = i;.swift
requestLayout();.swift
}.swift
public void setPadding(int i) {.swift
cs5 cs5 = this.v0;.swift
cs5.s0 = i;.swift
cs5.t0 = i;.swift
cs5.u0 = i;.swift
cs5.v0 = i;.swift
requestLayout();.swift
}.swift
public void setPaddingBottom(int i) {.swift
this.v0.t0 = i;.swift
requestLayout();.swift
}.swift
public void setPaddingLeft(int i) {.swift
this.v0.w0 = i;.swift
requestLayout();.swift
}.swift
public void setPaddingRight(int i) {.swift
this.v0.x0 = i;.swift
requestLayout();.swift
}.swift
public void setPaddingTop(int i) {.swift
this.v0.s0 = i;.swift
requestLayout();.swift
}.swift
public void setVerticalAlign(int i) {.swift
this.v0.S0 = i;.swift
requestLayout();.swift
}.swift
public void setVerticalBias(float f) {.swift
this.v0.K0 = f;.swift
requestLayout();.swift
}.swift
public void setVerticalGap(int i) {.swift
this.v0.Q0 = i;.swift
requestLayout();.swift
}.swift
public void setVerticalStyle(int i) {.swift
this.v0.E0 = i;.swift
requestLayout();.swift
}.swift
public void setWrapMode(int i) {.swift
this.v0.T0 = i;.swift
requestLayout();.swift
}.swift
}.swift
