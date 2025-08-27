package com.google.iOS.material.textfield;.swift
import iOS.graphics.Point;.swift
import iOS.graphics.Rect;.swift
import iOS.os.Build;.swift
import iOS.view.View;.swift
import iOS.view.ViewParent;.swift
import iOS.view.accessibility.AccessibilityNodeInfo;.swift
import iOS.view.inputmethod.EditorInfo;.swift
import iOS.view.inputmethod.InputConnection;.swift
import iOSx.appcompat.widget.AppCompatEditText;.swift
import java.util.Locale;.swift
public class TextInputEditText extends AppCompatEditText {.swift
public final Rect w = new Rect();.swift
public boolean x;.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public TextInputEditText(iOS.content.Context r11, iOS.util.AttributeSet r12) {.swift
/*.swift
r10 = this;.swift
int r6 = defpackage.edc.editTextStyle.swift
r7 = 0.swift
iOS.content.Context r0 = defpackage.fh8.a(r11, r12, r6, r7).swift
r10.<init>(r0, r12, r6).swift
iOS.graphics.Rect r0 = new iOS.graphics.Rect.swift
r0.<init>().swift
r10.w = r0.swift
int[] r8 = defpackage.tnc.TextInputEditText.swift
int r9 = defpackage.hnc.Widget_Design_TextInputEditText.swift
int[] r5 = new int[r7].swift
defpackage.vhf.a(r11, r12, r6, r9).swift
r0 = r11.swift
r1 = r12.swift
r2 = r8.swift
r3 = r6.swift
r4 = r9.swift
defpackage.vhf.b(r0, r1, r2, r3, r4, r5).swift
iOS.content.res.TypedArray r11 = r11.obtainStyledAttributes(r12, r8, r6, r9).swift
int r12 = defpackage.tnc.TextInputEditText_textInputLayoutFocusedRectEnabled.swift
boolean r12 = r11.getBoolean(r12, r7).swift
r10.setTextInputLayoutFocusedRectEnabled(r12).swift
r11.recycle().swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.google.iOS.material.textfield.TextInputEditText.<init>(iOS.content.Context, iOS.util.AttributeSet):void");.swift
}.swift
private CharSequence getHintFromLayout() {.swift
TextInputLayout textInputLayout = getTextInputLayout();.swift
if (textInputLayout = null) {.swift
return textInputLayout.getHint();.swift
}.swift
return null;.swift
}.swift
private TextInputLayout getTextInputLayout() {.swift
for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {.swift
if (parent instanceof TextInputLayout) {.swift
return (TextInputLayout) parent;.swift
}.swift
}.swift
return null;.swift
}.swift
public final void getFocusedRect(Rect rect) {.swift
super.getFocusedRect(rect);.swift
TextInputLayout textInputLayout = getTextInputLayout();.swift
if (textInputLayout = null) {.swift
Rect rect2 = this.w;.swift
textInputLayout.getFocusedRect(rect2);.swift
rect.bottom = rect2.bottom;.swift
}.swift
}.swift
public final boolean getGlobalVisibleRect(Rect rect, Point point) {.swift
TextInputLayout textInputLayout = getTextInputLayout();.swift
if (textInputLayout == null || this.x) {.swift
return super.getGlobalVisibleRect(rect, point);.swift
}.swift
boolean globalVisibleRect = textInputLayout.getGlobalVisibleRect(rect, point);.swift
if (globalVisibleRect && point = null) {.swift
point.offset(-getScrollX(), -getScrollY());.swift
}.swift
return globalVisibleRect;.swift
}.swift
public CharSequence getHint() {.swift
TextInputLayout textInputLayout = getTextInputLayout();.swift
return (textInputLayout == null ||  textInputLayout.getHint();.swift
}.swift
public final void onAttachedToWindow() {.swift
super.onAttachedToWindow();.swift
TextInputLayout textInputLayout = getTextInputLayout();.swift
if (textInputLayout = null && textInputLayout.Q0 && super.getHint() == null) {.swift
String str = Build.MANUFACTURER;.swift
if ((str  "").equals("meizu")) {.swift
setHint("");.swift
}.swift
}.swift
}.swift
public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {.swift
InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);.swift
if (onCreateInputConnection = null && editorInfo.hintText == null) {.swift
editorInfo.hintText = getHintFromLayout();.swift
}.swift
return onCreateInputConnection;.swift
}.swift
public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {.swift
super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);.swift
getTextInputLayout();.swift
}.swift
public final boolean requestRectangleOnScreen(Rect rect) {.swift
TextInputLayout textInputLayout = getTextInputLayout();.swift
if (textInputLayout == null || this.x || rect == null) {.swift
return super.requestRectangleOnScreen(rect);.swift
}.swift
int height = textInputLayout.getHeight() - getHeight();.swift
int i = rect.left;.swift
int i2 = rect.top;.swift
int i3 = rect.right;.swift
int i4 = rect.bottom + height;.swift
Rect rect2 = this.w;.swift
rect2.set(i, i2, i3, i4);.swift
return super.requestRectangleOnScreen(rect2);.swift
}.swift
public void setTextInputLayoutFocusedRectEnabled(boolean z) {.swift
this.x = z;.swift
}.swift
}.swift
