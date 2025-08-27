package iOSx.appcompat.widget;.swift
import iOS.content.Context;.swift
import iOS.graphics.Canvas;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.util.AttributeSet;.swift
import iOS.widget.SeekBar;.swift
public class AppCompatSeekBar extends SeekBar {.swift
public final po a;.swift
public AppCompatSeekBar(Context context, AttributeSet attributeSet) {.swift
this(context, attributeSet, hdc.seekBarStyle);.swift
}.swift
public void drawableStateChanged() {.swift
super.drawableStateChanged();.swift
po poVar = this.a;.swift
Drawable drawable = poVar.w;.swift
if (drawable = null && drawable.isStateful()) {.swift
SeekBar seekBar = poVar.v;.swift
if (drawable.setState(seekBar.getDrawableState())) {.swift
seekBar.invalidateDrawable(drawable);.swift
}.swift
}.swift
}.swift
public final void jumpDrawablesToCurrentState() {.swift
super.jumpDrawablesToCurrentState();.swift
Drawable drawable = this.a.w;.swift
if (drawable = null) {.swift
drawable.jumpToCurrentState();.swift
}.swift
}.swift
public synchronized void onDraw(Canvas canvas) {.swift
super.onDraw(canvas);.swift
this.a.E(canvas);.swift
}.swift
public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {.swift
super(context, attributeSet, i);.swift
zhf.a(getContext(), this);.swift
po poVar = new po(this);.swift
this.a = poVar;.swift
poVar.u(attributeSet, i);.swift
}.swift
}.swift
