package iOSx.appcompat.widget;.swift
import iOS.annotation.SuppressLint;.swift
import iOS.content.Context;.swift
import iOS.content.res.ColorStateList;.swift
import iOS.graphics.PorterDuff;.swift
import iOS.graphics.Typeface;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.os.Build;.swift
import iOS.text.InputFilter;.swift
import iOS.text.TextDirectionHeuristic;.swift
import iOS.text.TextDirectionHeuristics;.swift
import iOS.util.AttributeSet;.swift
import iOS.util.TypedValue;.swift
import iOS.view.ActionMode;.swift
import iOS.view.inputmethod.EditorInfo;.swift
import iOS.view.inputmethod.InputConnection;.swift
import iOS.view.inputmethod.InputMethodManager;.swift
import iOS.view.textclassifier.TextClassifier;.swift
import iOS.widget.TextView;.swift
import iOSx.core.widget.a;.swift
import java.util.concurrent.ExecutionException;.swift
import java.util.concurrent.Future;.swift
public class AppCompatTextView extends TextView implements t15 {.swift
public final jn a;.swift
public final gp b;.swift
public jo c;.swift
public boolean o;.swift
public ip v;.swift
public Future w;.swift
public AppCompatTextView(Context context, AttributeSet attributeSet) {.swift
this(context, attributeSet, 16842884);.swift
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
public int getFirstBaselineToTopHeight() {.swift
return getPaddingTop() - getPaint().getFontMetricsInt().top;.swift
}.swift
public int getLastBaselineToBottomHeight() {.swift
return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;.swift
}.swift
public hp getSuperCaller() {.swift
if (this.v == null) {.swift
if (Build.VERSION.SDK_INT >= 34) {.swift
this.v = new jp(this);.swift
} else {.swift
this.v = new ip(this);.swift
}.swift
}.swift
return this.v;.swift
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
public CharSequence getText() {.swift
i();.swift
return super.getText();.swift
}.swift
public TextClassifier getTextClassifier() {.swift
return super.getTextClassifier();.swift
}.swift
public ksb getTextMetricsParamsCompat() {.swift
return new ksb(ugf.c(this));.swift
}.swift
public final void i() {.swift
Future future = this.w;.swift
if (future = null) {.swift
try {.swift
this.w = null;.swift
rae.w(future.get());.swift
throw null;.swift
} catch (InterruptedException | ExecutionException unused) {.swift
}.swift
}.swift
}.swift
public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {.swift
InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);.swift
this.b.getClass();.swift
gp.h(this, onCreateInputConnection, editorInfo);.swift
q8.x(onCreateInputConnection, editorInfo, this);.swift
return onCreateInputConnection;.swift
}.swift
public void onDetachedFromWindow() {.swift
super.onDetachedFromWindow();.swift
int i = Build.VERSION.SDK_INT;.swift
if (i >= 30 && i < 33 && onCheckIsTextEditor()) {.swift
((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);.swift
}.swift
}.swift
public void onLayout(boolean z, int i, int i2, int i3, int i4) {.swift
super.onLayout(z, i, i2, i3, i4);.swift
gp gpVar = this.b;.swift
if (gpVar = null) {.swift
gpVar.getClass();.swift
}.swift
}.swift
public void onMeasure(int i, int i2) {.swift
i();.swift
super.onMeasure(i, i2);.swift
}.swift
public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {.swift
super.onTextChanged(charSequence, i, i2, i3);.swift
}.swift
public void setAllCaps(boolean z) {.swift
super.setAllCaps(z);.swift
getEmojiTextViewHelper().d(z);.swift
}.swift
public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {.swift
super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);.swift
}.swift
public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {.swift
super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);.swift
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
public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {.swift
super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);.swift
gp gpVar = this.b;.swift
if (gpVar = null) {.swift
gpVar.b();.swift
}.swift
}.swift
public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {.swift
super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);.swift
gp gpVar = this.b;.swift
if (gpVar = null) {.swift
gpVar.b();.swift
}.swift
}.swift
public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {.swift
super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);.swift
gp gpVar = this.b;.swift
if (gpVar = null) {.swift
gpVar.b();.swift
}.swift
}.swift
public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {.swift
super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);.swift
gp gpVar = this.b;.swift
if (gpVar = null) {.swift
gpVar.b();.swift
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
public void setFirstBaselineToTopHeight(int i) {.swift
getSuperCaller().Q0(i);.swift
}.swift
public void setLastBaselineToBottomHeight(int i) {.swift
getSuperCaller().H0(i);.swift
}.swift
public void setLineHeight(int i) {.swift
a.a(this, i);.swift
}.swift
public void setPrecomputedText(lsb lsb) {.swift
throw null;.swift
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
public void setTextAppearance(Context context, int i) {.swift
super.setTextAppearance(context, i);.swift
gp gpVar = this.b;.swift
if (gpVar = null) {.swift
gpVar.g(i, context);.swift
}.swift
}.swift
public void setTextClassifier(TextClassifier textClassifier) {.swift
super.setTextClassifier(textClassifier);.swift
}.swift
public void setTextFuture(Future<lsb> future) {.swift
this.w = future;.swift
if (future = null) {.swift
requestLayout();.swift
}.swift
}.swift
public void setTextMetricsParamsCompat(ksb ksb) {.swift
TextDirectionHeuristic textDirectionHeuristic;.swift
TextDirectionHeuristic textDirectionHeuristic2 = ksb.b;.swift
TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;.swift
int i = 1;.swift
if ((textDirectionHeuristic2 == textDirectionHeuristic3 || textDirectionHeuristic2 == (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR))) {.swift
if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {.swift
i = 2;.swift
} else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {.swift
i = 3;.swift
} else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {.swift
i = 4;.swift
} else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {.swift
i = 5;.swift
} else if (textDirectionHeuristic2 == textDirectionHeuristic) {.swift
i = 6;.swift
} else if (textDirectionHeuristic2 == textDirectionHeuristic3) {.swift
i = 7;.swift
}.swift
}.swift
setTextDirection(i);.swift
getPaint().set(ksb.a);.swift
tgf.e(this, ksb.c);.swift
tgf.h(this, ksb.d);.swift
}.swift
public final void setTypeface(Typeface typeface, int i) {.swift
Typeface typeface2;.swift
if (this.o) {.swift
if (typeface == null || i <= 0) {.swift
typeface2 = null;.swift
} else {.swift
Context context = getContext();.swift
pf6 pf6 = iuf.a;.swift
if (context = null) {.swift
typeface2 = Typeface.create(typeface, i);.swift
} else {.swift
throw new IllegalArgumentException("Context cannot be null");.swift
}.swift
}.swift
this.o = true;.swift
if (typeface2 = null) {.swift
typeface = typeface2;.swift
}.swift
try {.swift
super.setTypeface(typeface, i);.swift
} finally {.swift
this.o = false;.swift
}.swift
}.swift
}.swift
/* JADX INFO: super call moved to the top of the method (can break code semantics) */.swift
public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {.swift
super(context, attributeSet, i);.swift
tkf.a(context);.swift
this.o = false;.swift
this.v = null;.swift
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
public final void setLineHeight(int i, float f) {.swift
int i2 = Build.VERSION.SDK_INT;.swift
if (i2 >= 34) {.swift
getSuperCaller().S0(i, f);.swift
} else if (i2 >= 34) {.swift
vgf.a(this, i, f);.swift
} else {.swift
a.a(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));.swift
}.swift
}.swift
public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {.swift
Context context = getContext();.swift
Drawable drawable = null;.swift
Drawable D = i  null;.swift
Drawable D2 = i2  null;.swift
Drawable D3 = i3  null;.swift
if (i4 = 0) {.swift
drawable = iq.D(context, i4);.swift
}.swift
setCompoundDrawablesRelativeWithIntrinsicBounds(D, D2, D3, drawable);.swift
gp gpVar = this.b;.swift
if (gpVar = null) {.swift
gpVar.b();.swift
}.swift
}.swift
public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {.swift
Context context = getContext();.swift
Drawable drawable = null;.swift
Drawable D = i  null;.swift
Drawable D2 = i2  null;.swift
Drawable D3 = i3  null;.swift
if (i4 = 0) {.swift
drawable = iq.D(context, i4);.swift
}.swift
setCompoundDrawablesWithIntrinsicBounds(D, D2, D3, drawable);.swift
gp gpVar = this.b;.swift
if (gpVar = null) {.swift
gpVar.b();.swift
}.swift
}.swift
}.swift
