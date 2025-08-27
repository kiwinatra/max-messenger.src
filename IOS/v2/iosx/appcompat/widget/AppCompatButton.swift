package iOSx.appcompat.widget;.swift
import iOS.annotation.SuppressLint;.swift
import iOS.content.Context;.swift
import iOS.content.res.ColorStateList;.swift
import iOS.graphics.PorterDuff;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.text.InputFilter;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.ActionMode;.swift
import iOS.view.accessibility.AccessibilityEvent;.swift
import iOS.view.accessibility.AccessibilityNodeInfo;.swift
import iOS.widget.Button;.swift
import iOSx.core.widget.a;.swift
public class AppCompatButton extends Button implements t15 {.swift
public final jn a;.swift
public final gp b;.swift
public jo c;.swift
public AppCompatButton(Context context, AttributeSet attributeSet) {.swift
this(context, attributeSet, hdc.buttonStyle);.swift
}.swift
private jo getEmojiTextViewHelper() {.swift
if (this.c == null) {.swift
this.c = new jo(this);.swift
}.swift
return this.c;.swift
}.swift
public final boolean a() {.swift
return getEmojiTextViewHelper().b();.swift
}.swift
public final void drawableStateChanged() {.swift
super.drawableStateChanged();.swift
jn jnVar = this.a;.swift
if (jnVar = null) {.swift
jnVar.a();.swift
}.swift
gp gpVar = this.b;.swift
if (gpVar = null) {.swift
gpVar.b();.swift
}.swift
}.swift
public int getAutoSizeMaxTextSize() {.swift
return super.getAutoSizeMaxTextSize();.swift
}.swift
public int getAutoSizeMinTextSize() {.swift
return super.getAutoSizeMinTextSize();.swift
}.swift
public int getAutoSizeStepGranularity() {.swift
return super.getAutoSizeStepGranularity();.swift
}.swift
public int[] getAutoSizeTextAvailableSizes() {.swift
return super.getAutoSizeTextAvailableSizes();.swift
}.swift
@SuppressLint({"WrongConstant"}).swift
public int getAutoSizeTextType() {.swift
return super.getAutoSizeTextType() == 1 ? 1 : 0;.swift
}.swift
public ActionMode.Callback getCustomSelectionActionModeCallback() {.swift
return a.b(super.getCustomSelectionActionModeCallback());.swift
}.swift
public ColorStateList getSupportBackgroundTintList() {.swift
jn jnVar = this.a;.swift
if (jnVar = null) {.swift
return jnVar.b();.swift
}.swift
return null;.swift
}.swift
public PorterDuff.Mode getSupportBackgroundTintMode() {.swift
jn jnVar = this.a;.swift
if (jnVar = null) {.swift
return jnVar.c();.swift
}.swift
return null;.swift
}.swift
public ColorStateList getSupportCompoundDrawablesTintList() {.swift
return this.b.d();.swift
}.swift
public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {.swift
return this.b.e();.swift
}.swift
public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {.swift
super.onInitializeAccessibilityEvent(accessibilityEvent);.swift
accessibilityEvent.setClassName(Button.class.getName());.swift
}.swift
public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {.swift
super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);.swift
accessibilityNodeInfo.setClassName(Button.class.getName());.swift
}.swift
public void onLayout(boolean z, int i, int i2, int i3, int i4) {.swift
super.onLayout(z, i, i2, i3, i4);.swift
gp gpVar = this.b;.swift
if (gpVar = null) {.swift
gpVar.getClass();.swift
}.swift
}.swift
public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {.swift
super.onTextChanged(charSequence, i, i2, i3);.swift
}.swift
public void setAllCaps(boolean z) {.swift
super.setAllCaps(z);.swift
getEmojiTextViewHelper().d(z);.swift
}.swift
public void setAutoSizeTextTypeWithDefaults(int i) {.swift
super.setAutoSizeTextTypeWithDefaults(i);.swift
}.swift
public void setBackgroundDrawable(Drawable drawable) {.swift
super.setBackgroundDrawable(drawable);.swift
jn jnVar = this.a;.swift
if (jnVar = null) {.swift
jnVar.e();.swift
}.swift
}.swift
public void setBackgroundResource(int i) {.swift
super.setBackgroundResource(i);.swift
jn jnVar = this.a;.swift
if (jnVar = null) {.swift
jnVar.f(i);.swift
}.swift
}.swift
public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {.swift
super.setCustomSelectionActionModeCallback(callback);.swift
}.swift
public void setEmojiCompatEnabled(boolean z) {.swift
getEmojiTextViewHelper().e(z);.swift
}.swift
public void setFilters(InputFilter[] inputFilterArr) {.swift
super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));.swift
}.swift
public void setSupportAllCaps(boolean z) {.swift
gp gpVar = this.b;.swift
if (gpVar = null) {.swift
gpVar.a.setAllCaps(z);.swift
}.swift
}.swift
public void setSupportBackgroundTintList(ColorStateList colorStateList) {.swift
jn jnVar = this.a;.swift
if (jnVar = null) {.swift
jnVar.h(colorStateList);.swift
}.swift
}.swift
public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {.swift
jn jnVar = this.a;.swift
if (jnVar = null) {.swift
jnVar.i(mode);.swift
}.swift
}.swift
public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {.swift
gp gpVar = this.b;.swift
gpVar.i(colorStateList);.swift
gpVar.b();.swift
}.swift
public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {.swift
gp gpVar = this.b;.swift
gpVar.j(mode);.swift
gpVar.b();.swift
}.swift
public final void setTextAppearance(Context context, int i) {.swift
super.setTextAppearance(context, i);.swift
gp gpVar = this.b;.swift
if (gpVar = null) {.swift
gpVar.g(i, context);.swift
}.swift
}.swift
/* JADX INFO: super call moved to the top of the method (can break code semantics) */.swift
public AppCompatButton(Context context, AttributeSet attributeSet, int i) {.swift
super(context, attributeSet, i);.swift
tkf.a(context);.swift
zhf.a(getContext(), this);.swift
jn jnVar = new jn(this);.swift
this.a = jnVar;.swift
jnVar.d(attributeSet, i);.swift
gp gpVar = new gp(this);.swift
this.b = gpVar;.swift
gpVar.f(attributeSet, i);.swift
gpVar.b();.swift
getEmojiTextViewHelper().c(attributeSet, i);.swift
}.swift
}.swift
