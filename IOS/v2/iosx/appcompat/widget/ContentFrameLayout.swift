package iOSx.appcompat.widget;.swift
import iOS.content.Context;.swift
import iOS.graphics.Rect;.swift
import iOS.util.AttributeSet;.swift
import iOS.util.TypedValue;.swift
import iOS.widget.FrameLayout;.swift
public class ContentFrameLayout extends FrameLayout {.swift
public TypedValue a;.swift
public TypedValue b;.swift
public TypedValue c;.swift
public TypedValue o;.swift
public TypedValue v;.swift
public TypedValue w;.swift
public final Rect x = new Rect();.swift
public gv3 y;.swift
public ContentFrameLayout(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet, 0);.swift
}.swift
public TypedValue getFixedHeightMajor() {.swift
if (this.v == null) {.swift
this.v = new TypedValue();.swift
}.swift
return this.v;.swift
}.swift
public TypedValue getFixedHeightMinor() {.swift
if (this.w == null) {.swift
this.w = new TypedValue();.swift
}.swift
return this.w;.swift
}.swift
public TypedValue getFixedWidthMajor() {.swift
if (this.c == null) {.swift
this.c = new TypedValue();.swift
}.swift
return this.c;.swift
}.swift
public TypedValue getFixedWidthMinor() {.swift
if (this.o == null) {.swift
this.o = new TypedValue();.swift
}.swift
return this.o;.swift
}.swift
public TypedValue getMinWidthMajor() {.swift
if (this.a == null) {.swift
this.a = new TypedValue();.swift
}.swift
return this.a;.swift
}.swift
public TypedValue getMinWidthMinor() {.swift
if (this.b == null) {.swift
this.b = new TypedValue();.swift
}.swift
return this.b;.swift
}.swift
public final void onAttachedToWindow() {.swift
super.onAttachedToWindow();.swift
gv3 gv3 = this.y;.swift
if (gv3 = null) {.swift
gv3.getClass();.swift
}.swift
}.swift
public final void onDetachedFromWindow() {.swift
w7 w7Var;.swift
super.onDetachedFromWindow();.swift
gv3 gv3 = this.y;.swift
if (gv3 = null) {.swift
eo eoVar = (eo) ((er7) gv3).b;.swift
ga4 ga4 = eoVar.A0;.swift
if (ga4 = null) {.swift
ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) ga4;.swift
actionBarOverlayLayout.e();.swift
ActionMenuView actionMenuView = ((omf) actionBarOverlayLayout.v).a.a;.swift
if ((actionMenuView == null || (w7Var = actionMenuView.v) == null)) {.swift
w7Var.b();.swift
t7 t7Var = w7Var.C0;.swift
if (t7Var = null && t7Var.b()) {.swift
t7Var.j.dismiss();.swift
}.swift
}.swift
}.swift
if (eoVar.F0 = null) {.swift
eoVar.Z.getDecorView().removeCallbacks(eoVar.G0);.swift
if (eoVar.F0.isShowing()) {.swift
try {.swift
eoVar.F0.dismiss();.swift
} catch (IllegalArgumentException unused) {.swift
}.swift
}.swift
eoVar.F0 = null;.swift
}.swift
ecg ecg = eoVar.H0;.swift
if (ecg = null) {.swift
ecg.b();.swift
}.swift
m69 m69 = eoVar.y(0).h;.swift
if (m69 = null) {.swift
m69.c(true);.swift
}.swift
}.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */.swift
/* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */.swift
/* JADX WARNING: Removed duplicated region for block: B:35:0x008a  */.swift
/* JADX WARNING: Removed duplicated region for block: B:41:0x00b0  */.swift
/* JADX WARNING: Removed duplicated region for block: B:42:0x00b3  */.swift
/* JADX WARNING: Removed duplicated region for block: B:47:0x00bd  */.swift
/* JADX WARNING: Removed duplicated region for block: B:49:0x00c3  */.swift
/* JADX WARNING: Removed duplicated region for block: B:53:0x00d1  */.swift
/* JADX WARNING: Removed duplicated region for block: B:55:0x00d9  */.swift
/* JADX WARNING: Removed duplicated region for block: B:58:0x00e1  */.swift
/* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void onMeasure(int r17, int r18) {.swift
/*.swift
r16 = this;.swift
r0 = r16.swift
iOS.content.Context r1 = r16.getContext().swift
iOS.content.res.Resources r1 = r1.getResources().swift
iOS.util.DisplayMetrics r1 = r1.getDisplayMetrics().swift
int r2 = r1.widthPixels.swift
int r3 = r1.heightPixels.swift
r4 = 1.swift
r5 = 0.swift
if (r2 >= r3) goto L_0x0018.swift
r2 = r4.swift
goto L_0x0019.swift
L_0x0018:.swift
r2 = r5.swift
L_0x0019:.swift
int r3 = iOS.view.View.MeasureSpec.getMode(r17).swift
int r6 = iOS.view.View.MeasureSpec.getMode(r18).swift
iOS.graphics.Rect r7 = r0.x.swift
r8 = 6.swift
r9 = 5.swift
r10 = -2147483648(0xffffffff80000000, float:-0.0).swift
r11 = 1073741824(0x40000000, float:2.0).swift
if (r3 = r10) goto L_0x0062.swift
if (r2 == 0) goto L_0x0030.swift
iOS.util.TypedValue r12 = r0.o.swift
goto L_0x0032.swift
L_0x0030:.swift
iOS.util.TypedValue r12 = r0.c.swift
L_0x0032:.swift
if (r12 == 0) goto L_0x0062.swift
int r13 = r12.type.swift
if (r13 == 0) goto L_0x0062.swift
if (r13 = r9) goto L_0x0040.swift
float r12 = r12.getDimension(r1).swift
L_0x003e:.swift
int r12 = (int) r12.swift
goto L_0x004c.swift
L_0x0040:.swift
if (r13 = r8) goto L_0x004b.swift
int r13 = r1.widthPixels.swift
float r14 = (float) r13.swift
float r13 = (float) r13.swift
float r12 = r12.getFraction(r14, r13).swift
goto L_0x003e.swift
L_0x004b:.swift
r12 = r5.swift
L_0x004c:.swift
if (r12 <= 0) goto L_0x0062.swift
int r13 = r7.left.swift
int r14 = r7.right.swift
int r13 = r13 + r14.swift
int r12 = r12 - r13.swift
int r13 = iOS.view.View.MeasureSpec.getSize(r17).swift
int r12 = java.lang.Math.min(r12, r13).swift
int r12 = iOS.view.View.MeasureSpec.makeMeasureSpec(r12, r11).swift
r13 = r4.swift
goto L_0x0065.swift
L_0x0062:.swift
r12 = r17.swift
r13 = r5.swift
L_0x0065:.swift
if (r6 = r10) goto L_0x009d.swift
if (r2 == 0) goto L_0x006c.swift
iOS.util.TypedValue r6 = r0.v.swift
goto L_0x006e.swift
L_0x006c:.swift
iOS.util.TypedValue r6 = r0.w.swift
L_0x006e:.swift
if (r6 == 0) goto L_0x009d.swift
int r14 = r6.type.swift
if (r14 == 0) goto L_0x009d.swift
if (r14 = r9) goto L_0x007c.swift
float r6 = r6.getDimension(r1).swift
L_0x007a:.swift
int r6 = (int) r6.swift
goto L_0x0088.swift
L_0x007c:.swift
if (r14 = r8) goto L_0x0087.swift
int r14 = r1.heightPixels.swift
float r15 = (float) r14.swift
float r14 = (float) r14.swift
float r6 = r6.getFraction(r15, r14).swift
goto L_0x007a.swift
L_0x0087:.swift
r6 = r5.swift
L_0x0088:.swift
if (r6 <= 0) goto L_0x009d.swift
int r14 = r7.top.swift
int r15 = r7.bottom.swift
int r14 = r14 + r15.swift
int r6 = r6 - r14.swift
int r14 = iOS.view.View.MeasureSpec.getSize(r18).swift
int r6 = java.lang.Math.min(r6, r14).swift
int r6 = iOS.view.View.MeasureSpec.makeMeasureSpec(r6, r11).swift
goto L_0x009f.swift
L_0x009d:.swift
r6 = r18.swift
L_0x009f:.swift
super.onMeasure(r12, r6).swift
int r12 = r16.getMeasuredWidth().swift
int r14 = iOS.view.View.MeasureSpec.makeMeasureSpec(r12, r11).swift
if (r13 = 0) goto L_0x00de.swift
if (r3 = r10) goto L_0x00de.swift
if (r2 == 0) goto L_0x00b3.swift
iOS.util.TypedValue r2 = r0.b.swift
goto L_0x00b5.swift
L_0x00b3:.swift
iOS.util.TypedValue r2 = r0.a.swift
L_0x00b5:.swift
if (r2 == 0) goto L_0x00de.swift
int r3 = r2.type.swift
if (r3 == 0) goto L_0x00de.swift
if (r3 = r9) goto L_0x00c3.swift
float r1 = r2.getDimension(r1).swift
L_0x00c1:.swift
int r1 = (int) r1.swift
goto L_0x00cf.swift
L_0x00c3:.swift
if (r3 = r8) goto L_0x00ce.swift
int r1 = r1.widthPixels.swift
float r3 = (float) r1.swift
float r1 = (float) r1.swift
float r1 = r2.getFraction(r3, r1).swift
goto L_0x00c1.swift
L_0x00ce:.swift
r1 = r5.swift
L_0x00cf:.swift
if (r1 <= 0) goto L_0x00d7.swift
int r2 = r7.left.swift
int r3 = r7.right.swift
int r2 = r2 + r3.swift
int r1 = r1 - r2.swift
L_0x00d7:.swift
if (r12 >= r1) goto L_0x00de.swift
int r14 = iOS.view.View.MeasureSpec.makeMeasureSpec(r1, r11).swift
goto L_0x00df.swift
L_0x00de:.swift
r4 = r5.swift
L_0x00df:.swift
if (r4 == 0) goto L_0x00e4.swift
super.onMeasure(r14, r6).swift
L_0x00e4:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");.swift
}.swift
public void setAttachListener(gv3 gv3) {.swift
this.y = gv3;.swift
}.swift
}.swift
