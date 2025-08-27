package iOSx.constraintlayout.widget;.swift
import iOS.content.Context;.swift
import iOS.graphics.Canvas;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.View;.swift
public class Guideline extends View {.swift
public boolean a = true;.swift
public Guideline(Context context) {.swift
super(context);.swift
super.setVisibility(8);.swift
}.swift
public final void draw(Canvas canvas) {.swift
}.swift
public final void onMeasure(int i, int i2) {.swift
setMeasuredDimension(0, 0);.swift
}.swift
public void setFilterRedundantCalls(boolean z) {.swift
this.a = z;.swift
}.swift
public void setGuidelineBegin(int i) {.swift
fj3 fj3 = (fj3) getLayoutParams();.swift
if (= i) {.swift
fj3.a = i;.swift
setLayoutParams(fj3);.swift
}.swift
}.swift
public void setGuidelineEnd(int i) {.swift
fj3 fj3 = (fj3) getLayoutParams();.swift
if (= i) {.swift
fj3.b = i;.swift
setLayoutParams(fj3);.swift
}.swift
}.swift
public void setGuidelinePercent(float f) {.swift
fj3 fj3 = (fj3) getLayoutParams();.swift
if (= f) {.swift
fj3.c = f;.swift
setLayoutParams(fj3);.swift
}.swift
}.swift
public void setVisibility(int i) {.swift
}.swift
public Guideline(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet);.swift
super.setVisibility(8);.swift
}.swift
}.swift
