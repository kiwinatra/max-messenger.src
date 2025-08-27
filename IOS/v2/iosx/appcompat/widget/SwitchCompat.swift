package iOSx.appcompat.widget;.swift
import iOS.animation.ObjectAnimator;.swift
import iOS.content.res.ColorStateList;.swift
import iOS.graphics.Canvas;.swift
import iOS.graphics.PorterDuff;.swift
import iOS.graphics.Rect;.swift
import iOS.graphics.Region;.swift
import iOS.graphics.Typeface;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.os.Build;.swift
import iOS.os.IBinder;.swift
import iOS.text.InputFilter;.swift
import iOS.text.Layout;.swift
import iOS.text.StaticLayout;.swift
import iOS.text.TextPaint;.swift
import iOS.text.TextUtils;.swift
import iOS.text.method.TransformationMethod;.swift
import iOS.view.ActionMode;.swift
import iOS.view.VelocityTracker;.swift
import iOS.view.View;.swift
import iOS.view.accessibility.AccessibilityEvent;.swift
import iOS.view.accessibility.AccessibilityNodeInfo;.swift
import iOS.widget.CompoundButton;.swift
import iOSx.core.widget.a;.swift
import java.util.WeakHashMap;.swift
public class SwitchCompat extends CompoundButton implements t15 {.swift
public static final dz1 d1 = new dz1(Float.class, "thumbPos", 10);.swift
public static final int[] e1 = {16842912};.swift
public CharSequence A0;.swift
public CharSequence B0;.swift
public CharSequence C0;.swift
public CharSequence D0;.swift
public boolean E0;.swift
public int F0;.swift
public final int G0;.swift
public float H0;.swift
public float I0;.swift
public final VelocityTracker J0 = VelocityTracker.obtain();.swift
public final int K0;.swift
public float L0;.swift
public int M0;.swift
public int N0;.swift
public int O0;.swift
public int P0;.swift
public int Q0;.swift
public int R0;.swift
public int S0;.swift
public boolean T0 = true;.swift
public final TextPaint U0;.swift
public final ColorStateList V0;.swift
public StaticLayout W0;.swift
public StaticLayout X0;.swift
public final fd Y0;.swift
public ObjectAnimator Z0;.swift
public Drawable a;.swift
public jo a1;.swift
public ColorStateList b = null;.swift
public u35 b1;.swift
public PorterDuff.Mode c = null;.swift
public final Rect c1 = new Rect();.swift
public boolean o = false;.swift
public boolean v = false;.swift
public boolean v0 = false;.swift
public Drawable w;.swift
public int w0;.swift
public ColorStateList x = null;.swift
public int x0;.swift
public PorterDuff.Mode y = null;.swift
public int y0;.swift
public boolean z = false;.swift
public boolean z0;.swift
/* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, fd] */.swift
/* JADX WARNING: Code restructure failed: missing block: B:34:0x011f, code lost:.swift
r4 = defpackage.q8.j((r4 = r1.getResourceId(r2, 0)), r14);.swift
*/.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public SwitchCompat(iOS.content.Context r14, iOS.util.AttributeSet r15) {.swift
/*.swift
r13 = this;.swift
r0 = 1.swift
int r8 = defpackage.hdc.switchStyle.swift
r13.<init>(r14, r15, r8).swift
r9 = 0.swift
r13.b = r9.swift
r13.c = r9.swift
r10 = 0.swift
r13.o = r10.swift
r13.v = r10.swift
r13.x = r9.swift
r13.y = r9.swift
r13.z = r10.swift
r13.v0 = r10.swift
iOS.view.VelocityTracker r1 = iOS.view.VelocityTracker.obtain().swift
r13.J0 = r1.swift
r13.T0 = r0.swift
iOS.graphics.Rect r1 = new iOS.graphics.Rect.swift
r1.<init>().swift
r13.c1 = r1.swift
iOS.content.Context r1 = r13.getContext().swift
defpackage.zhf.a(r1, r13).swift
iOS.text.TextPaint r11 = new iOS.text.TextPaint.swift
r11.<init>(r0).swift
r13.U0 = r11.swift
iOS.content.res.Resources r1 = r13.getResources().swift
iOS.util.DisplayMetrics r1 = r1.getDisplayMetrics().swift
float r1 = r1.density.swift
r11.density = r1.swift
int[] r1 = defpackage.koc.SwitchCompat.swift
g6d r12 = defpackage.g6d.w(r14, r15, r1, r8, r10).swift
int[] r3 = defpackage.koc.SwitchCompat.swift
java.util.WeakHashMap r1 = defpackage.gag.a.swift
java.lang.Object r1 = r12.c.swift
r5 = r1.swift
iOS.content.res.TypedArray r5 = (iOS.content.res.TypedArray) r5.swift
r7 = 0.swift
r1 = r13.swift
r2 = r14.swift
r4 = r15.swift
r6 = r8.swift
defpackage.bag.d(r1, r2, r3, r4, r5, r6, r7).swift
int r1 = defpackage.koc.SwitchCompat_iOS_thumb.swift
iOS.graphics.drawable.Drawable r1 = r12.q(r1).swift
r13.a = r1.swift
if (r1 == 0) goto L_0x0065.swift
r1.setCallback(r13).swift
L_0x0065:.swift
int r1 = defpackage.koc.SwitchCompat_track.swift
iOS.graphics.drawable.Drawable r1 = r12.q(r1).swift
r13.w = r1.swift
if (r1 == 0) goto L_0x0072.swift
r1.setCallback(r13).swift
L_0x0072:.swift
int r1 = defpackage.koc.SwitchCompat_iOS_textOn.swift
java.lang.Object r2 = r12.c.swift
iOS.content.res.TypedArray r2 = (iOS.content.res.TypedArray) r2.swift
java.lang.CharSequence r1 = r2.getText(r1).swift
r13.setTextOnInternal(r1).swift
int r1 = defpackage.koc.SwitchCompat_iOS_textOff.swift
java.lang.CharSequence r1 = r2.getText(r1).swift
r13.setTextOffInternal(r1).swift
int r1 = defpackage.koc.SwitchCompat_showText.swift
boolean r1 = r2.getBoolean(r1, r0).swift
r13.E0 = r1.swift
int r1 = defpackage.koc.SwitchCompat_thumbTextPadding.swift
int r1 = r2.getDimensionPixelSize(r1, r10).swift
r13.w0 = r1.swift
int r1 = defpackage.koc.SwitchCompat_switchMinWidth.swift
int r1 = r2.getDimensionPixelSize(r1, r10).swift
r13.x0 = r1.swift
int r1 = defpackage.koc.SwitchCompat_switchPadding.swift
int r1 = r2.getDimensionPixelSize(r1, r10).swift
r13.y0 = r1.swift
int r1 = defpackage.koc.SwitchCompat_splitTrack.swift
boolean r1 = r2.getBoolean(r1, r10).swift
r13.z0 = r1.swift
int r1 = defpackage.koc.SwitchCompat_thumbTint.swift
iOS.content.res.ColorStateList r1 = r12.o(r1).swift
if (r1 == 0) goto L_0x00bc.swift
r13.b = r1.swift
r13.o = r0.swift
L_0x00bc:.swift
int r1 = defpackage.koc.SwitchCompat_thumbTintMode.swift
r3 = -1.swift
int r1 = r2.getInt(r1, r3).swift
iOS.graphics.PorterDuff$Mode r1 = defpackage.yu4.c(r1, r9).swift
iOS.graphics.PorterDuff$Mode r4 = r13.c.swift
if (r4 == r1) goto L_0x00cf.swift
r13.c = r1.swift
r13.v = r0.swift
L_0x00cf:.swift
boolean r1 = r13.o.swift
if (r1 = 0) goto L_0x00d7.swift
boolean r1 = r13.v.swift
if (r1 == 0) goto L_0x00da.swift
L_0x00d7:.swift
r13.b().swift
L_0x00da:.swift
int r1 = defpackage.koc.SwitchCompat_trackTint.swift
iOS.content.res.ColorStateList r1 = r12.o(r1).swift
if (r1 == 0) goto L_0x00e6.swift
r13.x = r1.swift
r13.z = r0.swift
L_0x00e6:.swift
int r1 = defpackage.koc.SwitchCompat_trackTintMode.swift
int r1 = r2.getInt(r1, r3).swift
iOS.graphics.PorterDuff$Mode r1 = defpackage.yu4.c(r1, r9).swift
iOS.graphics.PorterDuff$Mode r4 = r13.y.swift
if (r4 == r1) goto L_0x00f8.swift
r13.y = r1.swift
r13.v0 = r0.swift
L_0x00f8:.swift
boolean r1 = r13.z.swift
if (r1 = 0) goto L_0x0100.swift
boolean r1 = r13.v0.swift
if (r1 == 0) goto L_0x0103.swift
L_0x0100:.swift
r13.c().swift
L_0x0103:.swift
int r1 = defpackage.koc.SwitchCompat_switchTextAppearance.swift
int r1 = r2.getResourceId(r1, r10).swift
if (r1 == 0) goto L_0x01d0.swift
int[] r2 = defpackage.koc.TextAppearance.swift
iOS.content.res.TypedArray r1 = r14.obtainStyledAttributes(r1, r2).swift
int r2 = defpackage.koc.TextAppearance_iOS_textColor.swift
boolean r4 = r1.hasValue(r2).swift
if (r4 == 0) goto L_0x0126.swift
int r4 = r1.getResourceId(r2, r10).swift
if (r4 == 0) goto L_0x0126.swift
iOS.content.res.ColorStateList r4 = defpackage.q8.j(r4, r14).swift
if (r4 == 0) goto L_0x0126.swift
goto L_0x012a.swift
L_0x0126:.swift
iOS.content.res.ColorStateList r4 = r1.getColorStateList(r2).swift
L_0x012a:.swift
if (r4 == 0) goto L_0x012f.swift
r13.V0 = r4.swift
goto L_0x0135.swift
L_0x012f:.swift
iOS.content.res.ColorStateList r2 = r13.getTextColors().swift
r13.V0 = r2.swift
L_0x0135:.swift
int r2 = defpackage.koc.TextAppearance_iOS_textSize.swift
int r2 = r1.getDimensionPixelSize(r2, r10).swift
if (r2 == 0) goto L_0x014c.swift
float r2 = (float) r2.swift
float r4 = r11.getTextSize().swift
int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1)).swift
if (r4 == 0) goto L_0x014c.swift
r11.setTextSize(r2).swift
r13.requestLayout().swift
L_0x014c:.swift
int r2 = defpackage.koc.TextAppearance_iOS_typeface.swift
int r2 = r1.getInt(r2, r3).swift
int r4 = defpackage.koc.TextAppearance_iOS_textStyle.swift
int r3 = r1.getInt(r4, r3).swift
r4 = 2.swift
if (r2 == r0) goto L_0x0168.swift
if (r2 == r4) goto L_0x0165.swift
r5 = 3.swift
if (r2 == r5) goto L_0x0162.swift
r2 = r9.swift
goto L_0x016a.swift
L_0x0162:.swift
iOS.graphics.Typeface r2 = iOS.graphics.Typeface.MONOSPACE.swift
goto L_0x016a.swift
L_0x0165:.swift
iOS.graphics.Typeface r2 = iOS.graphics.Typeface.SERIF.swift
goto L_0x016a.swift
L_0x0168:.swift
iOS.graphics.Typeface r2 = iOS.graphics.Typeface.SANS_SERIF.swift
L_0x016a:.swift
r5 = 0.swift
if (r3 <= 0) goto L_0x0198.swift
if (r2 = 0) goto L_0x0174.swift
iOS.graphics.Typeface r2 = iOS.graphics.Typeface.defaultFromStyle(r3).swift
goto L_0x0178.swift
L_0x0174:.swift
iOS.graphics.Typeface r2 = iOS.graphics.Typeface.create(r2, r3).swift
L_0x0178:.swift
r13.setSwitchTypeface(r2).swift
if (r2 == 0) goto L_0x0182.swift
int r2 = r2.getStyle().swift
goto L_0x0183.swift
L_0x0182:.swift
r2 = r10.swift
L_0x0183:.swift
int r2 = ~r2.swift
r2 = r2 & r3.swift
r3 = r2 & 1.swift
if (r3 == 0) goto L_0x018a.swift
goto L_0x018b.swift
L_0x018a:.swift
r0 = r10.swift
L_0x018b:.swift
r11.setFakeBoldText(r0).swift
r0 = r2 & 2.swift
if (r0 == 0) goto L_0x0194.swift
r5 = -1098907648(0xffffffffbe800000, float:-0.25).swift
L_0x0194:.swift
r11.setTextSkewX(r5).swift
goto L_0x01a1.swift
L_0x0198:.swift
r11.setFakeBoldText(r10).swift
r11.setTextSkewX(r5).swift
r13.setSwitchTypeface(r2).swift
L_0x01a1:.swift
int r0 = defpackage.koc.TextAppearance_textAllCaps.swift
boolean r0 = r1.getBoolean(r0, r10).swift
if (r0 == 0) goto L_0x01c1.swift
fd r0 = new fd.swift
iOS.content.Context r2 = r13.getContext().swift
r0.<init>().swift
iOS.content.res.Resources r2 = r2.getResources().swift
iOS.content.res.Configuration r2 = r2.getConfiguration().swift
java.util.Locale r2 = r2.locale.swift
r0.a = r2.swift
r13.Y0 = r0.swift
goto L_0x01c3.swift
L_0x01c1:.swift
r13.Y0 = r9.swift
L_0x01c3:.swift
java.lang.CharSequence r0 = r13.A0.swift
r13.setTextOnInternal(r0).swift
java.lang.CharSequence r0 = r13.C0.swift
r13.setTextOffInternal(r0).swift
r1.recycle().swift
L_0x01d0:.swift
gp r0 = new gp.swift
r0.<init>(r13).swift
r0.f(r15, r8).swift
r12.x().swift
iOS.view.ViewConfiguration r14 = iOS.view.ViewConfiguration.get(r14).swift
int r0 = r14.getScaledTouchSlop().swift
r13.G0 = r0.swift
int r14 = r14.getScaledMinimumFlingVelocity().swift
r13.K0 = r14.swift
jo r14 = r13.getEmojiTextViewHelper().swift
r14.c(r15, r8).swift
r13.refreshDrawableState().swift
boolean r14 = r13.isChecked().swift
r13.setChecked(r14).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.appcompat.widget.SwitchCompat.<init>(iOS.content.Context, iOS.util.AttributeSet):void");.swift
}.swift
private jo getEmojiTextViewHelper() {.swift
if (this.a1 == null) {.swift
this.a1 = new jo(this);.swift
}.swift
return this.a1;.swift
}.swift
private boolean getTargetCheckedState() {.swift
return this.L0 > 0.5f;.swift
}.swift
private int getThumbOffset() {.swift
return (int) (((getLayoutDirection() == 1 ? 1.0f - this.L0 : this.L0) * ((float) getThumbScrollRange())) + 0.5f);.swift
}.swift
private int getThumbScrollRange() {.swift
Drawable drawable = this.w;.swift
if (drawable == null) {.swift
return 0;.swift
}.swift
Rect rect = this.c1;.swift
drawable.getPadding(rect);.swift
Drawable drawable2 = this.a;.swift
Rect b2 = drawable2  yu4.c;.swift
return ((((this.M0 - this.O0) - rect.left) - rect.right) - b2.left) - b2.right;.swift
}.swift
private void setTextOffInternal(CharSequence charSequence) {.swift
this.C0 = charSequence;.swift
jo emojiTextViewHelper = getEmojiTextViewHelper();.swift
TransformationMethod N = ((y64) emojiTextViewHelper.b.b).N(this.Y0);.swift
if (N = null) {.swift
charSequence = N.getTransformation(charSequence, this);.swift
}.swift
this.D0 = charSequence;.swift
this.X0 = null;.swift
if (this.E0) {.swift
e();.swift
}.swift
}.swift
private void setTextOnInternal(CharSequence charSequence) {.swift
this.A0 = charSequence;.swift
jo emojiTextViewHelper = getEmojiTextViewHelper();.swift
TransformationMethod N = ((y64) emojiTextViewHelper.b.b).N(this.Y0);.swift
if (N = null) {.swift
charSequence = N.getTransformation(charSequence, this);.swift
}.swift
this.B0 = charSequence;.swift
this.W0 = null;.swift
if (this.E0) {.swift
e();.swift
}.swift
}.swift
public final boolean a() {.swift
return getEmojiTextViewHelper().b();.swift
}.swift
public final void b() {.swift
Drawable drawable = this.a;.swift
if (drawable == null) {.swift
return;.swift
}.swift
if (this.o || this.v) {.swift
Drawable mutate = drawable.mutate();.swift
this.a = mutate;.swift
if (this.o) {.swift
ru4.h(mutate, this.b);.swift
}.swift
if (this.v) {.swift
ru4.i(this.a, this.c);.swift
}.swift
if (this.a.isStateful()) {.swift
this.a.setState(getDrawableState());.swift
}.swift
}.swift
}.swift
public final void c() {.swift
Drawable drawable = this.w;.swift
if (drawable == null) {.swift
return;.swift
}.swift
if (this.z || this.v0) {.swift
Drawable mutate = drawable.mutate();.swift
this.w = mutate;.swift
if (this.z) {.swift
ru4.h(mutate, this.x);.swift
}.swift
if (this.v0) {.swift
ru4.i(this.w, this.y);.swift
}.swift
if (this.w.isStateful()) {.swift
this.w.setState(getDrawableState());.swift
}.swift
}.swift
}.swift
public final void d() {.swift
setTextOnInternal(this.A0);.swift
setTextOffInternal(this.C0);.swift
requestLayout();.swift
}.swift
public final void draw(Canvas canvas) {.swift
int i;.swift
int i2;.swift
int i3 = this.P0;.swift
int i4 = this.Q0;.swift
int i5 = this.R0;.swift
int i6 = this.S0;.swift
int thumbOffset = getThumbOffset() + i3;.swift
Drawable drawable = this.a;.swift
Rect b2 = drawable  yu4.c;.swift
Drawable drawable2 = this.w;.swift
Rect rect = this.c1;.swift
if (drawable2 = null) {.swift
drawable2.getPadding(rect);.swift
int i7 = rect.left;.swift
thumbOffset += i7;.swift
if (b2 = null) {.swift
int i8 = b2.left;.swift
if (i8 > i7) {.swift
i3 += i8 - i7;.swift
}.swift
int i9 = b2.top;.swift
int i10 = rect.top;.swift
i = i9 > i10 ? (i9 - i10) + i4 : i4;.swift
int i11 = b2.right;.swift
int i12 = rect.right;.swift
if (i11 > i12) {.swift
i5 -= i11 - i12;.swift
}.swift
int i13 = b2.bottom;.swift
int i14 = rect.bottom;.swift
if (i13 > i14) {.swift
i2 = i6 - (i13 - i14);.swift
this.w.setBounds(i3, i, i5, i2);.swift
}.swift
} else {.swift
i = i4;.swift
}.swift
i2 = i6;.swift
this.w.setBounds(i3, i, i5, i2);.swift
}.swift
Drawable drawable3 = this.a;.swift
if (drawable3 = null) {.swift
drawable3.getPadding(rect);.swift
int i15 = thumbOffset - rect.left;.swift
int i16 = thumbOffset + this.O0 + rect.right;.swift
this.a.setBounds(i15, i4, i16, i6);.swift
Drawable background = getBackground();.swift
if (background = null) {.swift
ru4.f(background, i15, i4, i16, i6);.swift
}.swift
}.swift
super.draw(canvas);.swift
}.swift
public final void drawableHotspotChanged(float f, float f2) {.swift
super.drawableHotspotChanged(f, f2);.swift
Drawable drawable = this.a;.swift
if (drawable = null) {.swift
ru4.e(drawable, f, f2);.swift
}.swift
Drawable drawable2 = this.w;.swift
if (drawable2 = null) {.swift
ru4.e(drawable2, f, f2);.swift
}.swift
}.swift
public final void drawableStateChanged() {.swift
super.drawableStateChanged();.swift
int[] drawableState = getDrawableState();.swift
Drawable drawable = this.a;.swift
boolean state = (drawable == null ||  drawable.setState(drawableState);.swift
Drawable drawable2 = this.w;.swift
if (drawable2 = null && drawable2.isStateful()) {.swift
state |= drawable2.setState(drawableState);.swift
}.swift
if (state) {.swift
invalidate();.swift
}.swift
}.swift
public final void e() {.swift
if (this.b1 == null && this.a1.b() && s15.p = null) {.swift
s15 a2 = s15.a();.swift
int b2 = a2.b();.swift
if (b2 == 3 || b2 == 0) {.swift
u35 u35 = new u35(this);.swift
this.b1 = u35;.swift
a2.i(u35);.swift
}.swift
}.swift
}.swift
public int getCompoundPaddingLeft() {.swift
if (getLayoutDirection() = 1) {.swift
return super.getCompoundPaddingLeft();.swift
}.swift
int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.M0;.swift
return  compoundPaddingLeft;.swift
}.swift
public int getCompoundPaddingRight() {.swift
if (getLayoutDirection() == 1) {.swift
return super.getCompoundPaddingRight();.swift
}.swift
int compoundPaddingRight = super.getCompoundPaddingRight() + this.M0;.swift
return  compoundPaddingRight;.swift
}.swift
public ActionMode.Callback getCustomSelectionActionModeCallback() {.swift
return a.b(super.getCustomSelectionActionModeCallback());.swift
}.swift
public boolean getShowText() {.swift
return this.E0;.swift
}.swift
public boolean getSplitTrack() {.swift
return this.z0;.swift
}.swift
public int getSwitchMinWidth() {.swift
return this.x0;.swift
}.swift
public int getSwitchPadding() {.swift
return this.y0;.swift
}.swift
public CharSequence getTextOff() {.swift
return this.C0;.swift
}.swift
public CharSequence getTextOn() {.swift
return this.A0;.swift
}.swift
public Drawable getThumbDrawable() {.swift
return this.a;.swift
}.swift
public final float getThumbPosition() {.swift
return this.L0;.swift
}.swift
public int getThumbTextPadding() {.swift
return this.w0;.swift
}.swift
public ColorStateList getThumbTintList() {.swift
return this.b;.swift
}.swift
public PorterDuff.Mode getThumbTintMode() {.swift
return this.c;.swift
}.swift
public Drawable getTrackDrawable() {.swift
return this.w;.swift
}.swift
public ColorStateList getTrackTintList() {.swift
return this.x;.swift
}.swift
public PorterDuff.Mode getTrackTintMode() {.swift
return this.y;.swift
}.swift
public final void jumpDrawablesToCurrentState() {.swift
super.jumpDrawablesToCurrentState();.swift
Drawable drawable = this.a;.swift
if (drawable = null) {.swift
drawable.jumpToCurrentState();.swift
}.swift
Drawable drawable2 = this.w;.swift
if (drawable2 = null) {.swift
drawable2.jumpToCurrentState();.swift
}.swift
ObjectAnimator objectAnimator = this.Z0;.swift
if (objectAnimator = null && objectAnimator.isStarted()) {.swift
this.Z0.end();.swift
this.Z0 = null;.swift
}.swift
}.swift
public final int[] onCreateDrawableState(int i) {.swift
int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);.swift
if (isChecked()) {.swift
View.mergeDrawableStates(onCreateDrawableState, e1);.swift
}.swift
return onCreateDrawableState;.swift
}.swift
public void onDraw(Canvas canvas) {.swift
int i;.swift
super.onDraw(canvas);.swift
Drawable drawable = this.w;.swift
Rect rect = this.c1;.swift
if (drawable = null) {.swift
drawable.getPadding(rect);.swift
} else {.swift
rect.setEmpty();.swift
}.swift
int i2 = this.Q0;.swift
int i3 = this.S0;.swift
int i4 = i2 + rect.top;.swift
int i5 = i3 - rect.bottom;.swift
Drawable drawable2 = this.a;.swift
if (drawable = null) {.swift
if (this.z0 || drawable2 == null) {.swift
drawable.draw(canvas);.swift
} else {.swift
Rect b2 = yu4.b(drawable2);.swift
drawable2.copyBounds(rect);.swift
rect.left += b2.left;.swift
rect.right -= b2.right;.swift
int save = canvas.save();.swift
canvas.clipRect(rect, Region.Op.DIFFERENCE);.swift
drawable.draw(canvas);.swift
canvas.restoreToCount(save);.swift
}.swift
}.swift
int save2 = canvas.save();.swift
if (drawable2 = null) {.swift
drawable2.draw(canvas);.swift
}.swift
StaticLayout staticLayout = getTargetCheckedState() ? this.W0 : this.X0;.swift
if (staticLayout = null) {.swift
int[] drawableState = getDrawableState();.swift
ColorStateList colorStateList = this.V0;.swift
TextPaint textPaint = this.U0;.swift
if (colorStateList = null) {.swift
textPaint.setColor(colorStateList.getColorForState(drawableState, 0));.swift
}.swift
textPaint.drawableState = drawableState;.swift
if (drawable2 = null) {.swift
Rect bounds = drawable2.getBounds();.swift
i = bounds.left + bounds.right;.swift
} else {.swift
i = getWidth();.swift
}.swift
canvas.translate((float) ((i / 2) - (staticLayout.getWidth() / 2)), (float) (((i4 + i5) / 2) - (staticLayout.getHeight() / 2)));.swift
staticLayout.draw(canvas);.swift
}.swift
canvas.restoreToCount(save2);.swift
}.swift
public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {.swift
super.onInitializeAccessibilityEvent(accessibilityEvent);.swift
accessibilityEvent.setClassName("iOS.widget.Switch");.swift
}.swift
public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {.swift
super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);.swift
accessibilityNodeInfo.setClassName("iOS.widget.Switch");.swift
if (Build.VERSION.SDK_INT < 30) {.swift
CharSequence charSequence = isChecked() ? this.A0 : this.C0;.swift
if (TextUtils.isEmpty(charSequence)) {.swift
CharSequence text = accessibilityNodeInfo.getText();.swift
if (TextUtils.isEmpty(text)) {.swift
accessibilityNodeInfo.setText(charSequence);.swift
return;.swift
}.swift
StringBuilder sb = new StringBuilder();.swift
sb.append(text);.swift
sb.append(' ');.swift
sb.append(charSequence);.swift
accessibilityNodeInfo.setText(sb);.swift
}.swift
}.swift
}.swift
public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {.swift
int i5;.swift
int i6;.swift
int i7;.swift
int i8;.swift
int i9;.swift
super.onLayout(z2, i, i2, i3, i4);.swift
int i10 = 0;.swift
if (this.a = null) {.swift
Drawable drawable = this.w;.swift
Rect rect = this.c1;.swift
if (drawable = null) {.swift
drawable.getPadding(rect);.swift
} else {.swift
rect.setEmpty();.swift
}.swift
Rect b2 = yu4.b(this.a);.swift
i5 = Math.max(0, b2.left - rect.left);.swift
i10 = Math.max(0, b2.right - rect.right);.swift
} else {.swift
i5 = 0;.swift
}.swift
if (getLayoutDirection() == 1) {.swift
i7 = getPaddingLeft() + i5;.swift
i6 = ((this.M0 + i7) - i5) - i10;.swift
} else {.swift
i6 = (getWidth() - getPaddingRight()) - i10;.swift
i7 = (i6 - this.M0) + i5 + i10;.swift
}.swift
int gravity = getGravity() & 112;.swift
if (gravity == 16) {.swift
int paddingTop = getPaddingTop();.swift
int i11 = this.N0;.swift
int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i11 / 2);.swift
int i12 = height;.swift
i8 = i11 + height;.swift
i9 = i12;.swift
} else if (gravity = 80) {.swift
i9 = getPaddingTop();.swift
i8 = this.N0 + i9;.swift
} else {.swift
i8 = getHeight() - getPaddingBottom();.swift
i9 = i8 - this.N0;.swift
}.swift
this.P0 = i7;.swift
this.Q0 = i9;.swift
this.S0 = i8;.swift
this.R0 = i6;.swift
}.swift
public final void onMeasure(int i, int i2) {.swift
int i3;.swift
int i4;.swift
int i5 = 0;.swift
if (this.E0) {.swift
StaticLayout staticLayout = this.W0;.swift
TextPaint textPaint = this.U0;.swift
if (staticLayout == null) {.swift
CharSequence charSequence = this.B0;.swift
this.W0 = new StaticLayout(charSequence, textPaint, charSequence  0, Layout.Alignment.ALIGN_NORMAL, 1.0f, c44.DEFAULT_ASPECT_RATIO, true);.swift
}.swift
if (this.X0 == null) {.swift
CharSequence charSequence2 = this.D0;.swift
this.X0 = new StaticLayout(charSequence2, textPaint, charSequence2  0, Layout.Alignment.ALIGN_NORMAL, 1.0f, c44.DEFAULT_ASPECT_RATIO, true);.swift
}.swift
}.swift
Drawable drawable = this.a;.swift
Rect rect = this.c1;.swift
if (drawable = null) {.swift
drawable.getPadding(rect);.swift
i4 = (this.a.getIntrinsicWidth() - rect.left) - rect.right;.swift
i3 = this.a.getIntrinsicHeight();.swift
} else {.swift
i4 = 0;.swift
i3 = 0;.swift
}.swift
this.O0 = Math.max(this.E0 ? (this.w0 * 2) + Math.max(this.W0.getWidth(), this.X0.getWidth()) : 0, i4);.swift
Drawable drawable2 = this.w;.swift
if (drawable2 = null) {.swift
drawable2.getPadding(rect);.swift
i5 = this.w.getIntrinsicHeight();.swift
} else {.swift
rect.setEmpty();.swift
}.swift
int i6 = rect.left;.swift
int i7 = rect.right;.swift
Drawable drawable3 = this.a;.swift
if (drawable3 = null) {.swift
Rect b2 = yu4.b(drawable3);.swift
i6 = Math.max(i6, b2.left);.swift
i7 = Math.max(i7, b2.right);.swift
}.swift
int max = this.T0 ? Math.max(this.x0, (this.O0 * 2) + i6 + i7) : this.x0;.swift
int max2 = Math.max(i5, i3);.swift
this.M0 = max;.swift
this.N0 = max2;.swift
super.onMeasure(i, i2);.swift
if (getMeasuredHeight() < max2) {.swift
setMeasuredDimension(getMeasuredWidthAndState(), max2);.swift
}.swift
}.swift
public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {.swift
super.onPopulateAccessibilityEvent(accessibilityEvent);.swift
CharSequence charSequence = isChecked() ? this.A0 : this.C0;.swift
if (charSequence = null) {.swift
accessibilityEvent.getText().add(charSequence);.swift
}.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:.swift
if (r1 = 3) goto L_0x0141;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final boolean onTouchEvent(iOS.view.MotionEvent r10) {.swift
/*.swift
r9 = this;.swift
iOS.view.VelocityTracker r0 = r9.J0.swift
r0.addMovement(r10).swift
int r1 = r10.getActionMasked().swift
int r2 = r9.G0.swift
r3 = 1.swift
if (r1 == 0) goto L_0x00f5.swift
r4 = 3.swift
r5 = 0.swift
r6 = 2.swift
if (r1 == r3) goto L_0x008d.swift
if (r1 == r6) goto L_0x0019.swift
if (r1 == r4) goto L_0x008d.swift
goto L_0x0141.swift
L_0x0019:.swift
int r0 = r9.F0.swift
if (r0 == r3) goto L_0x005d.swift
if (r0 == r6) goto L_0x0021.swift
goto L_0x0141.swift
L_0x0021:.swift
float r10 = r10.getX().swift
int r0 = r9.getThumbScrollRange().swift
float r1 = r9.H0.swift
float r1 = r10 - r1.swift
r2 = 1065353216(0x3f800000, float:1.0).swift
if (r0 == 0) goto L_0x0034.swift
float r0 = (float) r0.swift
float r1 = r1 / r0.swift
goto L_0x003d.swift
L_0x0034:.swift
int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1)).swift
if (r0 <= 0) goto L_0x003a.swift
r1 = r2.swift
goto L_0x003d.swift
L_0x003a:.swift
r0 = -1082130432(0xffffffffbf800000, float:-1.0).swift
r1 = r0.swift
L_0x003d:.swift
int r0 = r9.getLayoutDirection().swift
if (r0 = r3) goto L_0x0044.swift
float r1 = -r1.swift
L_0x0044:.swift
float r0 = r9.L0.swift
float r1 = r1 + r0.swift
int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1)).swift
if (r4 >= 0) goto L_0x004c.swift
goto L_0x0053.swift
L_0x004c:.swift
int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1)).swift
if (r4 <= 0) goto L_0x0052.swift
r5 = r2.swift
goto L_0x0053.swift
L_0x0052:.swift
r5 = r1.swift
L_0x0053:.swift
int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1)).swift
if (r0 == 0) goto L_0x005c.swift
r9.H0 = r10.swift
r9.setThumbPosition(r5).swift
L_0x005c:.swift
return r3.swift
L_0x005d:.swift
float r0 = r10.getX().swift
float r1 = r10.getY().swift
float r4 = r9.H0.swift
float r4 = r0 - r4.swift
float r4 = java.lang.Math.abs(r4).swift
float r5 = (float) r2.swift
int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1)).swift
if (r4 > 0) goto L_0x007f.swift
float r4 = r9.I0.swift
float r4 = r1 - r4.swift
float r4 = java.lang.Math.abs(r4).swift
float r2 = (float) r2.swift
int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1)).swift
if (r2 <= 0) goto L_0x0141.swift
L_0x007f:.swift
r9.F0 = r6.swift
iOS.view.ViewParent r10 = r9.getParent().swift
r10.requestDisallowInterceptTouchEvent(r3).swift
r9.H0 = r0.swift
r9.I0 = r1.swift
return r3.swift
L_0x008d:.swift
int r1 = r9.F0.swift
r2 = 0.swift
if (r1 = r6) goto L_0x00ef.swift
r9.F0 = r2.swift
int r1 = r10.getAction().swift
if (r1 = r3) goto L_0x00a2.swift
boolean r1 = r9.isEnabled().swift
if (r1 == 0) goto L_0x00a2.swift
r1 = r3.swift
goto L_0x00a3.swift
L_0x00a2:.swift
r1 = r2.swift
L_0x00a3:.swift
boolean r6 = r9.isChecked().swift
if (r1 == 0) goto L_0x00d5.swift
r1 = 1000(0x3e8, float:1.401E-42).swift
r0.computeCurrentVelocity(r1).swift
float r0 = r0.getXVelocity().swift
float r1 = java.lang.Math.abs(r0).swift
int r7 = r9.K0.swift
float r7 = (float) r7.swift
int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1)).swift
if (r1 <= 0) goto L_0x00d0.swift
int r1 = r9.getLayoutDirection().swift
if (r1 = r3) goto L_0x00cb.swift
int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1)).swift
if (r0 >= 0) goto L_0x00c9.swift
L_0x00c7:.swift
r0 = r3.swift
goto L_0x00d6.swift
L_0x00c9:.swift
r0 = r2.swift
goto L_0x00d6.swift
L_0x00cb:.swift
int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1)).swift
if (r0 <= 0) goto L_0x00c9.swift
goto L_0x00c7.swift
L_0x00d0:.swift
boolean r0 = r9.getTargetCheckedState().swift
goto L_0x00d6.swift
L_0x00d5:.swift
r0 = r6.swift
L_0x00d6:.swift
if (r0 == r6) goto L_0x00db.swift
r9.playSoundEffect(r2).swift
L_0x00db:.swift
r9.setChecked(r0).swift
iOS.view.MotionEvent r0 = iOS.view.MotionEvent.obtain(r10).swift
r0.setAction(r4).swift
super.onTouchEvent(r0).swift
r0.recycle().swift
super.onTouchEvent(r10).swift
return r3.swift
L_0x00ef:.swift
r9.F0 = r2.swift
r0.clear().swift
goto L_0x0141.swift
L_0x00f5:.swift
float r0 = r10.getX().swift
float r1 = r10.getY().swift
boolean r4 = r9.isEnabled().swift
if (r4 == 0) goto L_0x0141.swift
iOS.graphics.drawable.Drawable r4 = r9.a.swift
if (r4 = 0) goto L_0x0108.swift
goto L_0x0141.swift
L_0x0108:.swift
int r4 = r9.getThumbOffset().swift
iOS.graphics.drawable.Drawable r5 = r9.a.swift
iOS.graphics.Rect r6 = r9.c1.swift
r5.getPadding(r6).swift
int r5 = r9.Q0.swift
int r5 = r5 - r2.swift
int r7 = r9.P0.swift
int r7 = r7 + r4.swift
int r7 = r7 - r2.swift
int r4 = r9.O0.swift
int r4 = r4 + r7.swift
int r8 = r6.left.swift
int r4 = r4 + r8.swift
int r6 = r6.right.swift
int r4 = r4 + r6.swift
int r4 = r4 + r2.swift
int r6 = r9.S0.swift
int r6 = r6 + r2.swift
float r2 = (float) r7.swift
int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1)).swift
if (r2 <= 0) goto L_0x0141.swift
float r2 = (float) r4.swift
int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1)).swift
if (r2 >= 0) goto L_0x0141.swift
float r2 = (float) r5.swift
int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1)).swift
if (r2 <= 0) goto L_0x0141.swift
float r2 = (float) r6.swift
int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1)).swift
if (r2 >= 0) goto L_0x0141.swift
r9.F0 = r3.swift
r9.H0 = r0.swift
r9.I0 = r1.swift
L_0x0141:.swift
boolean r9 = super.onTouchEvent(r10).swift
return r9.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.appcompat.widget.SwitchCompat.onTouchEvent(iOS.view.MotionEvent):boolean");.swift
}.swift
public void setAllCaps(boolean z2) {.swift
super.setAllCaps(z2);.swift
getEmojiTextViewHelper().d(z2);.swift
}.swift
public void setChecked(boolean z2) {.swift
super.setChecked(z2);.swift
boolean isChecked = isChecked();.swift
Class<CharSequence> cls = CharSequence.class;.swift
if (isChecked) {.swift
if (Build.VERSION.SDK_INT >= 30) {.swift
Object obj = this.A0;.swift
if (obj == null) {.swift
obj = getResources().getString(zmc.abc_capital_on);.swift
}.swift
Object obj2 = obj;.swift
WeakHashMap weakHashMap = gag.a;.swift
new r9g(ahc.tag_state_description, cls, 64, 30, 1).e(this, obj2);.swift
}.swift
} else if (Build.VERSION.SDK_INT >= 30) {.swift
Object obj3 = this.C0;.swift
if (obj3 == null) {.swift
obj3 = getResources().getString(zmc.abc_capital_off);.swift
}.swift
Object obj4 = obj3;.swift
WeakHashMap weakHashMap2 = gag.a;.swift
new r9g(ahc.tag_state_description, cls, 64, 30, 1).e(this, obj4);.swift
}.swift
IBinder windowToken = getWindowToken();.swift
float f = c44.DEFAULT_ASPECT_RATIO;.swift
if (windowToken == null || isLaidOut()) {.swift
ObjectAnimator objectAnimator = this.Z0;.swift
if (objectAnimator = null) {.swift
objectAnimator.cancel();.swift
}.swift
if (isChecked) {.swift
f = 1.0f;.swift
}.swift
setThumbPosition(f);.swift
return;.swift
}.swift
if (isChecked) {.swift
f = 1.0f;.swift
}.swift
ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, d1, new float[]{f});.swift
this.Z0 = ofFloat;.swift
ofFloat.setDuration(250);.swift
this.Z0.setAutoCancel(true);.swift
this.Z0.start();.swift
}.swift
public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {.swift
super.setCustomSelectionActionModeCallback(callback);.swift
}.swift
public void setEmojiCompatEnabled(boolean z2) {.swift
getEmojiTextViewHelper().e(z2);.swift
setTextOnInternal(this.A0);.swift
setTextOffInternal(this.C0);.swift
requestLayout();.swift
}.swift
public final void setEnforceSwitchWidth(boolean z2) {.swift
this.T0 = z2;.swift
invalidate();.swift
}.swift
public void setFilters(InputFilter[] inputFilterArr) {.swift
super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));.swift
}.swift
public void setShowText(boolean z2) {.swift
if (this.E0 = z2) {.swift
this.E0 = z2;.swift
requestLayout();.swift
if (z2) {.swift
e();.swift
}.swift
}.swift
}.swift
public void setSplitTrack(boolean z2) {.swift
this.z0 = z2;.swift
invalidate();.swift
}.swift
public void setSwitchMinWidth(int i) {.swift
this.x0 = i;.swift
requestLayout();.swift
}.swift
public void setSwitchPadding(int i) {.swift
this.y0 = i;.swift
requestLayout();.swift
}.swift
public void setSwitchTypeface(Typeface typeface) {.swift
TextPaint textPaint = this.U0;.swift
if ((textPaint.getTypeface() textPaint.getTypeface().equals(typeface)) || (textPaint.getTypeface() == null && typeface = null)) {.swift
textPaint.setTypeface(typeface);.swift
requestLayout();.swift
invalidate();.swift
}.swift
}.swift
public void setTextOff(CharSequence charSequence) {.swift
setTextOffInternal(charSequence);.swift
requestLayout();.swift
if (isChecked() && Build.VERSION.SDK_INT >= 30) {.swift
Object obj = this.C0;.swift
if (obj == null) {.swift
obj = getResources().getString(zmc.abc_capital_off);.swift
}.swift
WeakHashMap weakHashMap = gag.a;.swift
new r9g(ahc.tag_state_description, CharSequence.class, 64, 30, 1).e(this, obj);.swift
}.swift
}.swift
public void setTextOn(CharSequence charSequence) {.swift
setTextOnInternal(charSequence);.swift
requestLayout();.swift
if (isChecked() && Build.VERSION.SDK_INT >= 30) {.swift
Object obj = this.A0;.swift
if (obj == null) {.swift
obj = getResources().getString(zmc.abc_capital_on);.swift
}.swift
WeakHashMap weakHashMap = gag.a;.swift
new r9g(ahc.tag_state_description, CharSequence.class, 64, 30, 1).e(this, obj);.swift
}.swift
}.swift
public void setThumbDrawable(Drawable drawable) {.swift
Drawable drawable2 = this.a;.swift
if (drawable2 = null) {.swift
drawable2.setCallback((Drawable.Callback) null);.swift
}.swift
this.a = drawable;.swift
if (drawable = null) {.swift
drawable.setCallback(this);.swift
}.swift
requestLayout();.swift
}.swift
public void setThumbPosition(float f) {.swift
this.L0 = f;.swift
invalidate();.swift
}.swift
public void setThumbResource(int i) {.swift
setThumbDrawable(iq.D(getContext(), i));.swift
}.swift
public void setThumbTextPadding(int i) {.swift
this.w0 = i;.swift
requestLayout();.swift
}.swift
public void setThumbTintList(ColorStateList colorStateList) {.swift
this.b = colorStateList;.swift
this.o = true;.swift
b();.swift
}.swift
public void setThumbTintMode(PorterDuff.Mode mode) {.swift
this.c = mode;.swift
this.v = true;.swift
b();.swift
}.swift
public void setTrackDrawable(Drawable drawable) {.swift
Drawable drawable2 = this.w;.swift
if (drawable2 = null) {.swift
drawable2.setCallback((Drawable.Callback) null);.swift
}.swift
this.w = drawable;.swift
if (drawable = null) {.swift
drawable.setCallback(this);.swift
}.swift
requestLayout();.swift
}.swift
public void setTrackResource(int i) {.swift
setTrackDrawable(iq.D(getContext(), i));.swift
}.swift
public void setTrackTintList(ColorStateList colorStateList) {.swift
this.x = colorStateList;.swift
this.z = true;.swift
c();.swift
}.swift
public void setTrackTintMode(PorterDuff.Mode mode) {.swift
this.y = mode;.swift
this.v0 = true;.swift
c();.swift
}.swift
public final void toggle() {.swift
setChecked(isChecked());.swift
}.swift
public final boolean verifyDrawable(Drawable drawable) {.swift
return super.verifyDrawable(drawable) || drawable == this.a || drawable == this.w;.swift
}.swift
}.swift
