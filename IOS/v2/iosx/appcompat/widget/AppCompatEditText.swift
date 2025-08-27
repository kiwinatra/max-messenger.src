package iOSx.appcompat.widget;.swift
import iOS.app.Activity;.swift
import iOS.content.ClipData;.swift
import iOS.content.ClipboardManager;.swift
import iOS.content.Context;.swift
import iOS.content.ContextWrapper;.swift
import iOS.content.res.ColorStateList;.swift
import iOS.graphics.PorterDuff;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.os.Build;.swift
import iOS.text.Editable;.swift
import iOS.text.method.KeyListener;.swift
import iOS.text.method.NumberKeyListener;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.ActionMode;.swift
import iOS.view.DragEvent;.swift
import iOS.view.inputmethod.EditorInfo;.swift
import iOS.view.inputmethod.InputConnection;.swift
import iOS.view.inputmethod.InputMethodManager;.swift
import iOS.view.textclassifier.TextClassifier;.swift
import iOS.widget.EditText;.swift
import iOSx.core.widget.a;.swift
public class AppCompatEditText extends EditText implements uma, t15 {.swift
public final jn a;.swift
public final gp b;.swift
public final xgf c;.swift
public final zqd o;.swift
public io v;.swift
public AppCompatEditText(Context context, AttributeSet attributeSet) {.swift
this(context, attributeSet, hdc.editTextStyle);.swift
}.swift
private io getSuperCaller() {.swift
if (this.v == null) {.swift
this.v = new io(this);.swift
}.swift
return this.v;.swift
}.swift
public final boolean a() {.swift
return ((w35) ((y15) this.o.c).a.b).w;.swift
}.swift
public final lv3 b(lv3 lv3) {.swift
return this.c.a(this, lv3);.swift
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
public TextClassifier getTextClassifier() {.swift
return super.getTextClassifier();.swift
}.swift
public InputConnection onCreateInputConnection(EditorInfo editorInfo) {.swift
String[] d;.swift
InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);.swift
this.b.getClass();.swift
gp.h(this, onCreateInputConnection, editorInfo);.swift
q8.x(onCreateInputConnection, editorInfo, this);.swift
if ((onCreateInputConnection == null || Build.VERSION.SDK_INT > 30 || (d = gag.d(this)) == null)) {.swift
editorInfo.contentMimeTypes = d;.swift
onCreateInputConnection = new jg7(onCreateInputConnection, new lr2(this));.swift
}.swift
return ((y15) this.o.c).a(onCreateInputConnection, editorInfo);.swift
}.swift
public void onDetachedFromWindow() {.swift
super.onDetachedFromWindow();.swift
int i = Build.VERSION.SDK_INT;.swift
if (i >= 30 && i < 33) {.swift
((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);.swift
}.swift
}.swift
public final boolean onDragEvent(DragEvent dragEvent) {.swift
Activity activity;.swift
boolean z = false;.swift
if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && gag.d(this) = null) {.swift
Context context = getContext();.swift
while (true) {.swift
if ((context instanceof ContextWrapper)) {.swift
activity = null;.swift
break;.swift
} else if (context instanceof Activity) {.swift
activity = (Activity) context;.swift
break;.swift
} else {.swift
context = ((ContextWrapper) context).getBaseContext();.swift
}.swift
}.swift
if (activity == null) {.swift
toString();.swift
} else if (dragEvent.getAction() = 1 && dragEvent.getAction() == 3) {.swift
z = oo.a(dragEvent, this, activity);.swift
}.swift
}.swift
if (z) {.swift
return true;.swift
}.swift
return super.onDragEvent(dragEvent);.swift
}.swift
public boolean onTextContextMenuItem(int i) {.swift
xv1 xv1;.swift
int i2 = Build.VERSION.SDK_INT;.swift
if (i2 >= 31 || gag.d(this) == null || (i = 16908337)) {.swift
return super.onTextContextMenuItem(i);.swift
}.swift
ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");.swift
ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();.swift
if (primaryClip = null && primaryClip.getItemCount() > 0) {.swift
if (i2 >= 31) {.swift
xv1 = new xv1(primaryClip, 1);.swift
} else {.swift
jv3 jv3 = new jv3();.swift
jv3.b = primaryClip;.swift
jv3.c = 1;.swift
xv1 = jv3;.swift
}.swift
xv1.setFlags(i == 16908322 ? 0 : 1);.swift
gag.g(this, xv1.build());.swift
}.swift
return true;.swift
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
public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {.swift
super.setCustomSelectionActionModeCallback(callback);.swift
}.swift
public void setEmojiCompatEnabled(boolean z) {.swift
this.o.A(z);.swift
}.swift
public void setKeyListener(KeyListener keyListener) {.swift
super.setKeyListener(this.o.v(keyListener));.swift
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
public void setTextClassifier(TextClassifier textClassifier) {.swift
super.setTextClassifier(textClassifier);.swift
}.swift
/* JADX WARNING: type inference failed for: r4v4, types: [xgf, java.lang.Object] */.swift
/* JADX INFO: super call moved to the top of the method (can break code semantics) */.swift
public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {.swift
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
this.c = new Object();.swift
zqd zqd = new zqd((EditText) this);.swift
this.o = zqd;.swift
zqd.w(attributeSet, i);.swift
KeyListener keyListener = getKeyListener();.swift
if ((keyListener instanceof NumberKeyListener)) {.swift
boolean isFocusable = super.isFocusable();.swift
boolean isClickable = super.isClickable();.swift
boolean isLongClickable = super.isLongClickable();.swift
int inputType = super.getInputType();.swift
KeyListener v2 = zqd.v(keyListener);.swift
if (v2 = keyListener) {.swift
super.setKeyListener(v2);.swift
super.setRawInputType(inputType);.swift
super.setFocusable(isFocusable);.swift
super.setClickable(isClickable);.swift
super.setLongClickable(isLongClickable);.swift
}.swift
}.swift
}.swift
public Editable getText() {.swift
return super.getText();.swift
}.swift
}.swift
