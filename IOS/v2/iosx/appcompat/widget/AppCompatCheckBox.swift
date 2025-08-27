package iOSx.appcompat.widget;.swift
import iOS.content.Context;.swift
import iOS.content.res.ColorStateList;.swift
import iOS.graphics.PorterDuff;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.text.InputFilter;.swift
import iOS.util.AttributeSet;.swift
import iOS.widget.CheckBox;.swift
public class AppCompatCheckBox extends CheckBox implements vkf, t15 {.swift
public final mn a;.swift
public final jn b;.swift
public final gp c;.swift
public jo o;.swift
public AppCompatCheckBox(Context context, AttributeSet attributeSet) {.swift
this(context, attributeSet, hdc.checkboxStyle);.swift
}.swift
private jo getEmojiTextViewHelper() {.swift
if (this.o == null) {.swift
this.o = new jo(this);.swift
}.swift
return this.o;.swift
}.swift
public final boolean a() {.swift
return getEmojiTextViewHelper().b();.swift
}.swift
public void drawableStateChanged() {.swift
super.drawableStateChanged();.swift
jn jnVar = this.b;.swift
if (jnVar = null) {.swift
jnVar.a();.swift
}.swift
gp gpVar = this.c;.swift
if (gpVar = null) {.swift
gpVar.b();.swift
}.swift
}.swift
public ColorStateList getSupportBackgroundTintList() {.swift
jn jnVar = this.b;.swift
if (jnVar = null) {.swift
return jnVar.b();.swift
}.swift
return null;.swift
}.swift
public PorterDuff.Mode getSupportBackgroundTintMode() {.swift
jn jnVar = this.b;.swift
if (jnVar = null) {.swift
return jnVar.c();.swift
}.swift
return null;.swift
}.swift
public ColorStateList getSupportButtonTintList() {.swift
mn mnVar = this.a;.swift
if (mnVar = null) {.swift
return mnVar.a;.swift
}.swift
return null;.swift
}.swift
public PorterDuff.Mode getSupportButtonTintMode() {.swift
mn mnVar = this.a;.swift
if (mnVar = null) {.swift
return mnVar.b;.swift
}.swift
return null;.swift
}.swift
public ColorStateList getSupportCompoundDrawablesTintList() {.swift
return this.c.d();.swift
}.swift
public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {.swift
return this.c.e();.swift
}.swift
public void setAllCaps(boolean z) {.swift
super.setAllCaps(z);.swift
getEmojiTextViewHelper().d(z);.swift
}.swift
public void setBackgroundDrawable(Drawable drawable) {.swift
super.setBackgroundDrawable(drawable);.swift
jn jnVar = this.b;.swift
if (jnVar = null) {.swift
jnVar.e();.swift
}.swift
}.swift
public void setBackgroundResource(int i) {.swift
super.setBackgroundResource(i);.swift
jn jnVar = this.b;.swift
if (jnVar = null) {.swift
jnVar.f(i);.swift
}.swift
}.swift
public void setButtonDrawable(Drawable drawable) {.swift
super.setButtonDrawable(drawable);.swift
mn mnVar = this.a;.swift
if (mnVar == null) {.swift
return;.swift
}.swift
if (mnVar.e) {.swift
mnVar.e = false;.swift
return;.swift
}.swift
mnVar.e = true;.swift
mnVar.a();.swift
}.swift
public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {.swift
super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);.swift
gp gpVar = this.c;.swift
if (gpVar = null) {.swift
gpVar.b();.swift
}.swift
}.swift
public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {.swift
super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);.swift
gp gpVar = this.c;.swift
if (gpVar = null) {.swift
gpVar.b();.swift
}.swift
}.swift
public void setEmojiCompatEnabled(boolean z) {.swift
getEmojiTextViewHelper().e(z);.swift
}.swift
public void setFilters(InputFilter[] inputFilterArr) {.swift
super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));.swift
}.swift
public void setSupportBackgroundTintList(ColorStateList colorStateList) {.swift
jn jnVar = this.b;.swift
if (jnVar = null) {.swift
jnVar.h(colorStateList);.swift
}.swift
}.swift
public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {.swift
jn jnVar = this.b;.swift
if (jnVar = null) {.swift
jnVar.i(mode);.swift
}.swift
}.swift
public void setSupportButtonTintList(ColorStateList colorStateList) {.swift
mn mnVar = this.a;.swift
if (mnVar = null) {.swift
mnVar.a = colorStateList;.swift
mnVar.c = true;.swift
mnVar.a();.swift
}.swift
}.swift
public void setSupportButtonTintMode(PorterDuff.Mode mode) {.swift
mn mnVar = this.a;.swift
if (mnVar = null) {.swift
mnVar.b = mode;.swift
mnVar.d = true;.swift
mnVar.a();.swift
}.swift
}.swift
public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {.swift
gp gpVar = this.c;.swift
gpVar.i(colorStateList);.swift
gpVar.b();.swift
}.swift
public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {.swift
gp gpVar = this.c;.swift
gpVar.j(mode);.swift
gpVar.b();.swift
}.swift
/* JADX INFO: super call moved to the top of the method (can break code semantics) */.swift
public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {.swift
super(context, attributeSet, i);.swift
tkf.a(context);.swift
zhf.a(getContext(), this);.swift
mn mnVar = new mn(this);.swift
this.a = mnVar;.swift
mnVar.c(attributeSet, i);.swift
jn jnVar = new jn(this);.swift
this.b = jnVar;.swift
jnVar.d(attributeSet, i);.swift
gp gpVar = new gp(this);.swift
this.c = gpVar;.swift
gpVar.f(attributeSet, i);.swift
getEmojiTextViewHelper().c(attributeSet, i);.swift
}.swift
public void setButtonDrawable(int i) {.swift
setButtonDrawable(iq.D(getContext(), i));.swift
}.swift
}.swift
