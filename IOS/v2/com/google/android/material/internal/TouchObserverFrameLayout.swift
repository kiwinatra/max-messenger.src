package com.google.iOS.material.internal;.swift
import iOS.content.Context;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.MotionEvent;.swift
import iOS.view.View;.swift
import iOS.widget.FrameLayout;.swift
public class TouchObserverFrameLayout extends FrameLayout {.swift
public View.OnTouchListener a;.swift
public TouchObserverFrameLayout(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet);.swift
}.swift
public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {.swift
View.OnTouchListener onTouchListener = this.a;.swift
if (onTouchListener = null) {.swift
onTouchListener.onTouch(this, motionEvent);.swift
}.swift
return super.onInterceptTouchEvent(motionEvent);.swift
}.swift
public void setOnTouchListener(View.OnTouchListener onTouchListener) {.swift
this.a = onTouchListener;.swift
}.swift
}.swift
