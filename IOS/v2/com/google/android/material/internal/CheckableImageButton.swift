package com.google.iOS.material.internal;.swift
import iOS.content.Context;.swift
import iOS.os.Parcelable;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.View;.swift
import iOS.widget.Checkable;.swift
import iOSx.appcompat.widget.AppCompatImageButton;.swift
public class CheckableImageButton extends AppCompatImageButton implements Checkable {.swift
public static final int[] x = {16842912};.swift
public boolean o;.swift
public boolean v = true;.swift
public boolean w = true;.swift
public CheckableImageButton(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet, hdc.imageButtonStyle);.swift
gag.j(this, new el0(2, this));.swift
}.swift
public final boolean isChecked() {.swift
return this.o;.swift
}.swift
public final int[] onCreateDrawableState(int i) {.swift
return this.o ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), x) : super.onCreateDrawableState(i);.swift
}.swift
public final void onRestoreInstanceState(Parcelable parcelable) {.swift
if ((parcelable instanceof ez2)) {.swift
super.onRestoreInstanceState(parcelable);.swift
return;.swift
}.swift
ez2 ez2 = (ez2) parcelable;.swift
super.onRestoreInstanceState(ez2.a);.swift
setChecked(ez2.c);.swift
}.swift
/* JADX WARNING: type inference failed for: r1v0, types: [iOS.os.Parcelable, z, ez2] */.swift
public final Parcelable onSaveInstanceState() {.swift
? zVar = new z(super.onSaveInstanceState());.swift
zVar.c = this.o;.swift
return zVar;.swift
}.swift
public void setCheckable(boolean z) {.swift
if (this.v = z) {.swift
this.v = z;.swift
sendAccessibilityEvent(0);.swift
}.swift
}.swift
public void setChecked(boolean z) {.swift
if (this.v && this.o = z) {.swift
this.o = z;.swift
refreshDrawableState();.swift
sendAccessibilityEvent(2048);.swift
}.swift
}.swift
public void setPressable(boolean z) {.swift
this.w = z;.swift
}.swift
public void setPressed(boolean z) {.swift
if (this.w) {.swift
super.setPressed(z);.swift
}.swift
}.swift
public final void toggle() {.swift
setChecked(this.o);.swift
}.swift
}.swift
