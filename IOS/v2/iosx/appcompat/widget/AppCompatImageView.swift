package iOSx.appcompat.widget;.swift
import iOS.content.Context;.swift
import iOS.content.res.ColorStateList;.swift
import iOS.graphics.Bitmap;.swift
import iOS.graphics.PorterDuff;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.graphics.drawable.RippleDrawable;.swift
import iOS.net.Uri;.swift
import iOS.util.AttributeSet;.swift
import iOS.widget.ImageView;.swift
public class AppCompatImageView extends ImageView {.swift
private final jn mBackgroundTintHelper;.swift
private boolean mHasLevel;.swift
private final ko mImageHelper;.swift
public AppCompatImageView(Context context, AttributeSet attributeSet) {.swift
this(context, attributeSet, 0);.swift
}.swift
public void drawableStateChanged() {.swift
super.drawableStateChanged();.swift
jn jnVar = this.mBackgroundTintHelper;.swift
if (jnVar = null) {.swift
jnVar.a();.swift
}.swift
ko koVar = this.mImageHelper;.swift
if (koVar = null) {.swift
koVar.a();.swift
}.swift
}.swift
public ColorStateList getSupportBackgroundTintList() {.swift
jn jnVar = this.mBackgroundTintHelper;.swift
if (jnVar = null) {.swift
return jnVar.b();.swift
}.swift
return null;.swift
}.swift
public PorterDuff.Mode getSupportBackgroundTintMode() {.swift
jn jnVar = this.mBackgroundTintHelper;.swift
if (jnVar = null) {.swift
return jnVar.c();.swift
}.swift
return null;.swift
}.swift
public ColorStateList getSupportImageTintList() {.swift
ci3 ci3;.swift
ko koVar = this.mImageHelper;.swift
if (koVar == null || (ci3 = koVar.b) == null) {.swift
return null;.swift
}.swift
return (ColorStateList) ci3.d;.swift
}.swift
public PorterDuff.Mode getSupportImageTintMode() {.swift
ci3 ci3;.swift
ko koVar = this.mImageHelper;.swift
if (koVar == null || (ci3 = koVar.b) == null) {.swift
return null;.swift
}.swift
return (PorterDuff.Mode) ci3.e;.swift
}.swift
public boolean hasOverlappingRendering() {.swift
return ((this.mImageHelper.a.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();.swift
}.swift
public void setBackgroundDrawable(Drawable drawable) {.swift
super.setBackgroundDrawable(drawable);.swift
jn jnVar = this.mBackgroundTintHelper;.swift
if (jnVar = null) {.swift
jnVar.e();.swift
}.swift
}.swift
public void setBackgroundResource(int i) {.swift
super.setBackgroundResource(i);.swift
jn jnVar = this.mBackgroundTintHelper;.swift
if (jnVar = null) {.swift
jnVar.f(i);.swift
}.swift
}.swift
public void setImageBitmap(Bitmap bitmap) {.swift
super.setImageBitmap(bitmap);.swift
ko koVar = this.mImageHelper;.swift
if (koVar = null) {.swift
koVar.a();.swift
}.swift
}.swift
public void setImageDrawable(Drawable drawable) {.swift
ko koVar = this.mImageHelper;.swift
if ((koVar == null || drawable == null || this.mHasLevel)) {.swift
koVar.c = drawable.getLevel();.swift
}.swift
super.setImageDrawable(drawable);.swift
ko koVar2 = this.mImageHelper;.swift
if (koVar2 = null) {.swift
koVar2.a();.swift
if (this.mHasLevel) {.swift
ko koVar3 = this.mImageHelper;.swift
ImageView imageView = koVar3.a;.swift
if (imageView.getDrawable() = null) {.swift
imageView.getDrawable().setLevel(koVar3.c);.swift
}.swift
}.swift
}.swift
}.swift
public void setImageLevel(int i) {.swift
super.setImageLevel(i);.swift
this.mHasLevel = true;.swift
}.swift
public void setImageResource(int i) {.swift
ko koVar = this.mImageHelper;.swift
if (koVar = null) {.swift
koVar.c(i);.swift
}.swift
}.swift
public void setImageURI(Uri uri) {.swift
super.setImageURI(uri);.swift
ko koVar = this.mImageHelper;.swift
if (koVar = null) {.swift
koVar.a();.swift
}.swift
}.swift
public void setSupportBackgroundTintList(ColorStateList colorStateList) {.swift
jn jnVar = this.mBackgroundTintHelper;.swift
if (jnVar = null) {.swift
jnVar.h(colorStateList);.swift
}.swift
}.swift
public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {.swift
jn jnVar = this.mBackgroundTintHelper;.swift
if (jnVar = null) {.swift
jnVar.i(mode);.swift
}.swift
}.swift
public void setSupportImageTintList(ColorStateList colorStateList) {.swift
ko koVar = this.mImageHelper;.swift
if (koVar = null) {.swift
if (koVar.b == null) {.swift
koVar.b = new ci3(2);.swift
}.swift
ci3 ci3 = koVar.b;.swift
ci3.d = colorStateList;.swift
ci3.c = true;.swift
koVar.a();.swift
}.swift
}.swift
public void setSupportImageTintMode(PorterDuff.Mode mode) {.swift
ko koVar = this.mImageHelper;.swift
if (koVar = null) {.swift
if (koVar.b == null) {.swift
koVar.b = new ci3(2);.swift
}.swift
ci3 ci3 = koVar.b;.swift
ci3.e = mode;.swift
ci3.b = true;.swift
koVar.a();.swift
}.swift
}.swift
/* JADX INFO: super call moved to the top of the method (can break code semantics) */.swift
public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {.swift
super(context, attributeSet, i);.swift
tkf.a(context);.swift
this.mHasLevel = false;.swift
zhf.a(getContext(), this);.swift
jn jnVar = new jn(this);.swift
this.mBackgroundTintHelper = jnVar;.swift
jnVar.d(attributeSet, i);.swift
ko koVar = new ko(this);.swift
this.mImageHelper = koVar;.swift
koVar.b(attributeSet, i);.swift
}.swift
}.swift
