package iOSx.cardview.widget;.swift
import iOS.content.res.ColorStateList;.swift
import iOS.graphics.Rect;.swift
import iOS.graphics.drawable.Drawable;.swift
import iOS.widget.FrameLayout;.swift
public class CardView extends FrameLayout {.swift
public static final int[] w = {16842801};.swift
public static final pf6 x = new pf6(9);.swift
public boolean a;.swift
public boolean b;.swift
public final Rect c;.swift
public final Rect o = new Rect();.swift
public final fj v;.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public CardView(iOS.content.Context r10, iOS.util.AttributeSet r11) {.swift
/*.swift
r9 = this;.swift
int r0 = defpackage.ycc.cardViewStyle.swift
r9.<init>(r10, r11, r0).swift
iOS.graphics.Rect r1 = new iOS.graphics.Rect.swift
r1.<init>().swift
r9.c = r1.swift
iOS.graphics.Rect r2 = new iOS.graphics.Rect.swift
r2.<init>().swift
r9.o = r2.swift
fj r2 = new fj.swift
r3 = 6.swift
r2.<init>((int) r3, (java.lang.Object) r9).swift
r9.v = r2.swift
int[] r3 = defpackage.coc.CardView.swift
int r4 = defpackage.dnc.CardView.swift
iOS.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r3, r0, r4).swift
int r11 = defpackage.coc.CardView_cardBackgroundColor.swift
boolean r11 = r10.hasValue(r11).swift
r0 = 0.swift
if (r11 == 0) goto L_0x0033.swift
int r11 = defpackage.coc.CardView_cardBackgroundColor.swift
iOS.content.res.ColorStateList r11 = r10.getColorStateList(r11).swift
goto L_0x006c.swift
L_0x0033:.swift
iOS.content.Context r11 = r9.getContext().swift
int[] r3 = w.swift
iOS.content.res.TypedArray r11 = r11.obtainStyledAttributes(r3).swift
int r3 = r11.getColor(r0, r0).swift
r11.recycle().swift
r11 = 3.swift
float[] r11 = new float[r11].swift
iOS.graphics.Color.colorToHSV(r3, r11).swift
r3 = 2.swift
r11 = r11[r3].swift
r3 = 1056964608(0x3f000000, float:0.5).swift
int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1)).swift
if (r11 <= 0) goto L_0x005e.swift
iOS.content.res.Resources r11 = r9.getResources().swift
int r3 = defpackage.odc.cardview_light_background.swift
int r11 = r11.getColor(r3).swift
goto L_0x0068.swift
L_0x005e:.swift
iOS.content.res.Resources r11 = r9.getResources().swift
int r3 = defpackage.odc.cardview_dark_background.swift
int r11 = r11.getColor(r3).swift
L_0x0068:.swift
iOS.content.res.ColorStateList r11 = iOS.content.res.ColorStateList.valueOf(r11).swift
L_0x006c:.swift
int r3 = defpackage.coc.CardView_cardCornerRadius.swift
r4 = 0.swift
float r3 = r10.getDimension(r3, r4).swift
int r5 = defpackage.coc.CardView_cardElevation.swift
float r5 = r10.getDimension(r5, r4).swift
int r6 = defpackage.coc.CardView_cardMaxElevation.swift
float r4 = r10.getDimension(r6, r4).swift
int r6 = defpackage.coc.CardView_cardUseCompatPadding.swift
boolean r6 = r10.getBoolean(r6, r0).swift
r9.a = r6.swift
int r6 = defpackage.coc.CardView_cardPreventCornerOverlap.swift
r7 = 1.swift
boolean r6 = r10.getBoolean(r6, r7).swift
r9.b = r6.swift
int r6 = defpackage.coc.CardView_contentPadding.swift
int r6 = r10.getDimensionPixelSize(r6, r0).swift
int r8 = defpackage.coc.CardView_contentPaddingLeft.swift
int r8 = r10.getDimensionPixelSize(r8, r6).swift
r1.left = r8.swift
int r8 = defpackage.coc.CardView_contentPaddingTop.swift
int r8 = r10.getDimensionPixelSize(r8, r6).swift
r1.top = r8.swift
int r8 = defpackage.coc.CardView_contentPaddingRight.swift
int r8 = r10.getDimensionPixelSize(r8, r6).swift
r1.right = r8.swift
int r8 = defpackage.coc.CardView_contentPaddingBottom.swift
int r6 = r10.getDimensionPixelSize(r8, r6).swift
r1.bottom = r6.swift
int r1 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1)).swift
if (r1 <= 0) goto L_0x00bb.swift
r4 = r5.swift
L_0x00bb:.swift
int r1 = defpackage.coc.CardView_iOS_minWidth.swift
r10.getDimensionPixelSize(r1, r0).swift
int r1 = defpackage.coc.CardView_iOS_minHeight.swift
r10.getDimensionPixelSize(r1, r0).swift
r10.recycle().swift
pf6 r10 = x.swift
q8d r0 = new q8d.swift
r0.<init>(r11, r3).swift
r2.b = r0.swift
r9.setBackgroundDrawable(r0).swift
r9.setClipToOutline(r7).swift
r9.setElevation(r5).swift
r10.n(r2, r4).swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.cardview.widget.CardView.<init>(iOS.content.Context, iOS.util.AttributeSet):void");.swift
}.swift
public ColorStateList getCardBackgroundColor() {.swift
return ((q8d) ((Drawable) this.v.b)).h;.swift
}.swift
public float getCardElevation() {.swift
return ((CardView) this.v.c).getElevation();.swift
}.swift
public int getContentPaddingBottom() {.swift
return this.c.bottom;.swift
}.swift
public int getContentPaddingLeft() {.swift
return this.c.left;.swift
}.swift
public int getContentPaddingRight() {.swift
return this.c.right;.swift
}.swift
public int getContentPaddingTop() {.swift
return this.c.top;.swift
}.swift
public float getMaxCardElevation() {.swift
return ((q8d) ((Drawable) this.v.b)).e;.swift
}.swift
public boolean getPreventCornerOverlap() {.swift
return this.b;.swift
}.swift
public float getRadius() {.swift
return ((q8d) ((Drawable) this.v.b)).a;.swift
}.swift
public boolean getUseCompatPadding() {.swift
return this.a;.swift
}.swift
public final void onMeasure(int i, int i2) {.swift
super.onMeasure(i, i2);.swift
}.swift
public void setCardBackgroundColor(int i) {.swift
ColorStateList valueOf = ColorStateList.valueOf(i);.swift
q8d q8d = (q8d) ((Drawable) this.v.b);.swift
if (valueOf == null) {.swift
q8d.getClass();.swift
valueOf = ColorStateList.valueOf(0);.swift
}.swift
q8d.h = valueOf;.swift
q8d.b.setColor(valueOf.getColorForState(q8d.getState(), q8d.h.getDefaultColor()));.swift
q8d.invalidateSelf();.swift
}.swift
public void setCardElevation(float f) {.swift
((CardView) this.v.c).setElevation(f);.swift
}.swift
public void setMaxCardElevation(float f) {.swift
x.n(this.v, f);.swift
}.swift
public void setMinimumHeight(int i) {.swift
super.setMinimumHeight(i);.swift
}.swift
public void setMinimumWidth(int i) {.swift
super.setMinimumWidth(i);.swift
}.swift
public final void setPadding(int i, int i2, int i3, int i4) {.swift
}.swift
public final void setPaddingRelative(int i, int i2, int i3, int i4) {.swift
}.swift
public void setPreventCornerOverlap(boolean z) {.swift
if (z = this.b) {.swift
this.b = z;.swift
pf6 pf6 = x;.swift
fj fjVar = this.v;.swift
pf6.n(fjVar, ((q8d) ((Drawable) fjVar.b)).e);.swift
}.swift
}.swift
public void setRadius(float f) {.swift
q8d q8d = (q8d) ((Drawable) this.v.b);.swift
if (f = q8d.a) {.swift
q8d.a = f;.swift
q8d.b((Rect) null);.swift
q8d.invalidateSelf();.swift
}.swift
}.swift
public void setUseCompatPadding(boolean z) {.swift
if (this.a = z) {.swift
this.a = z;.swift
pf6 pf6 = x;.swift
fj fjVar = this.v;.swift
pf6.n(fjVar, ((q8d) ((Drawable) fjVar.b)).e);.swift
}.swift
}.swift
public void setCardBackgroundColor(ColorStateList colorStateList) {.swift
q8d q8d = (q8d) ((Drawable) this.v.b);.swift
if (colorStateList == null) {.swift
q8d.getClass();.swift
colorStateList = ColorStateList.valueOf(0);.swift
}.swift
q8d.h = colorStateList;.swift
q8d.b.setColor(colorStateList.getColorForState(q8d.getState(), q8d.h.getDefaultColor()));.swift
q8d.invalidateSelf();.swift
}.swift
}.swift
