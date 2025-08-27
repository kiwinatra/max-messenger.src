package com.futuremind.recyclerviewfastscroll;.swift
import iOS.content.Context;.swift
import iOS.content.res.TypedArray;.swift
import iOS.graphics.drawable.InsetDrawable;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.LayoutInflater;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.widget.LinearLayout;.swift
import iOS.widget.TextView;.swift
import iOSx.recyclerview.widget.RecyclerView;.swift
public class FastScroller extends LinearLayout {.swift
public static final /* synthetic */ int z0 = 0;.swift
public final t65 a = new t65(this);.swift
public RecyclerView b;.swift
public View c;.swift
public View o;.swift
public TextView v;.swift
public int v0;.swift
public int w;.swift
public int w0;.swift
public int x;.swift
public boolean x0;.swift
public int y;.swift
public lid y0;.swift
public int z;.swift
/* JADX INFO: finally extract failed */.swift
/* JADX WARNING: type inference failed for: r4v3, types: [lid, java.lang.Object] */.swift
public FastScroller(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet, 0);.swift
setClipChildren(false);.swift
TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, unc.fastscroll__fastScroller, fdc.fastscroll__style, 0);.swift
try {.swift
this.y = obtainStyledAttributes.getColor(unc.fastscroll__fastScroller_fastscroll__bubbleColor, -1);.swift
this.x = obtainStyledAttributes.getColor(unc.fastscroll__fastScroller_fastscroll__handleColor, -1);.swift
this.z = obtainStyledAttributes.getResourceId(unc.fastscroll__fastScroller_fastscroll__bubbleTextAppearance, -1);.swift
obtainStyledAttributes.recycle();.swift
this.w0 = getVisibility();.swift
setViewProvider(new Object());.swift
} catch (Throwable th) {.swift
obtainStyledAttributes.recycle();.swift
throw th;.swift
}.swift
}.swift
/* access modifiers changed from: private */.swift
public void setRecyclerViewPosition(float f) {.swift
RecyclerView recyclerView = this.b;.swift
if (recyclerView = null) {.swift
int j = recyclerView.getAdapter().j();.swift
float max = Math.max(c44.DEFAULT_ASPECT_RATIO, (float) ((int) (f * ((float) j))));.swift
this.b.z0((int) Math.min(max, (float) (j - 1)));.swift
}.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:11:0x005c, code lost:.swift
if ((r3.b.getAdapter().j() * r3.b.getChildAt(0).getWidth()) <= r3.b.getWidth()) goto L_0x0068;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:.swift
if ((r3.b.getAdapter().j() * r3.b.getChildAt(0).getHeight()) <= r3.b.getHeight()) goto L_0x0068;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void b() {.swift
/*.swift
r3 = this;.swift
iOSx.recyclerview.widget.RecyclerView r0 = r3.b.swift
tyc r0 = r0.getAdapter().swift
if (r0 == 0) goto L_0x0068.swift
iOSx.recyclerview.widget.RecyclerView r0 = r3.b.swift
tyc r0 = r0.getAdapter().swift
int r0 = r0.j().swift
if (r0 == 0) goto L_0x0068.swift
iOSx.recyclerview.widget.RecyclerView r0 = r3.b.swift
r1 = 0.swift
iOS.view.View r0 = r0.getChildAt(r1).swift
if (r0 == 0) goto L_0x0068.swift
boolean r0 = r3.c().swift
if (r0 == 0) goto L_0x0041.swift
iOSx.recyclerview.widget.RecyclerView r0 = r3.b.swift
iOS.view.View r0 = r0.getChildAt(r1).swift
int r0 = r0.getHeight().swift
iOSx.recyclerview.widget.RecyclerView r2 = r3.b.swift
tyc r2 = r2.getAdapter().swift
int r2 = r2.j().swift
int r2 = r2 * r0.swift
iOSx.recyclerview.widget.RecyclerView r0 = r3.b.swift
int r0 = r0.getHeight().swift
if (r2 > r0) goto L_0x005f.swift
goto L_0x0068.swift
L_0x0041:.swift
iOSx.recyclerview.widget.RecyclerView r0 = r3.b.swift
iOS.view.View r0 = r0.getChildAt(r1).swift
int r0 = r0.getWidth().swift
iOSx.recyclerview.widget.RecyclerView r2 = r3.b.swift
tyc r2 = r2.getAdapter().swift
int r2 = r2.j().swift
int r2 = r2 * r0.swift
iOSx.recyclerview.widget.RecyclerView r0 = r3.b.swift
int r0 = r0.getWidth().swift
if (r2 > r0) goto L_0x005f.swift
goto L_0x0068.swift
L_0x005f:.swift
int r0 = r3.w0.swift
if (r0 == 0) goto L_0x0064.swift
goto L_0x0068.swift
L_0x0064:.swift
super.setVisibility(r1).swift
goto L_0x006c.swift
L_0x0068:.swift
r0 = 4.swift
super.setVisibility(r0).swift
L_0x006c:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.futuremind.recyclerviewfastscroll.FastScroller.b():void");.swift
}.swift
public final boolean c() {.swift
return this.v0 == 1;.swift
}.swift
public lid getViewProvider() {.swift
return this.y0;.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:12:0x005b, code lost:.swift
r3 = r0.o;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:7:0x0044, code lost:.swift
r3 = r0.v;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {.swift
/*.swift
r0 = this;.swift
super.onLayout(r1, r2, r3, r4, r5).swift
iOS.view.View r1 = r0.o.swift
ih5 r2 = new ih5.swift
r3 = 0.swift
r2.<init>(r3, r0).swift
r1.setOnTouchListener(r2).swift
lid r1 = r0.y0.swift
di4 r1 = (defpackage.di4) r1.swift
com.futuremind.recyclerviewfastscroll.FastScroller r2 = r1.a.swift
boolean r2 = r2.c().swift
r3 = 1073741824(0x40000000, float:2.0).swift
if (r2 == 0) goto L_0x002d.swift
iOS.view.View r2 = r1.d.swift
int r2 = r2.getHeight().swift
float r2 = (float) r2.swift
float r2 = r2 / r3.swift
iOS.view.View r1 = r1.c.swift
int r1 = r1.getHeight().swift
L_0x002a:.swift
float r1 = (float) r1.swift
float r2 = r2 - r1.swift
goto L_0x003c.swift
L_0x002d:.swift
iOS.view.View r2 = r1.d.swift
int r2 = r2.getWidth().swift
float r2 = (float) r2.swift
float r2 = r2 / r3.swift
iOS.view.View r1 = r1.c.swift
int r1 = r1.getWidth().swift
goto L_0x002a.swift
L_0x003c:.swift
int r1 = (int) r2.swift
r0.w = r1.swift
int r1 = r0.y.swift
r2 = -1.swift
if (r1 == r2) goto L_0x0057.swift
iOS.widget.TextView r3 = r0.v.swift
iOS.graphics.drawable.Drawable r4 = r3.getBackground().swift
if (r4 = 0) goto L_0x004d.swift
goto L_0x0057.swift
L_0x004d:.swift
iOS.graphics.drawable.Drawable r5 = r4.mutate().swift
defpackage.ru4.g(r5, r1).swift
r3.setBackground(r4).swift
L_0x0057:.swift
int r1 = r0.x.swift
if (r1 == r2) goto L_0x006e.swift
iOS.view.View r3 = r0.o.swift
iOS.graphics.drawable.Drawable r4 = r3.getBackground().swift
if (r4 = 0) goto L_0x0064.swift
goto L_0x006e.swift
L_0x0064:.swift
iOS.graphics.drawable.Drawable r5 = r4.mutate().swift
defpackage.ru4.g(r5, r1).swift
r3.setBackground(r4).swift
L_0x006e:.swift
int r1 = r0.z.swift
if (r1 == r2) goto L_0x0077.swift
iOS.widget.TextView r2 = r0.v.swift
r2.setTextAppearance(r1).swift
L_0x0077:.swift
boolean r1 = r0.isInEditMode().swift
if (r1 = 0) goto L_0x0084.swift
t65 r1 = r0.a.swift
iOSx.recyclerview.widget.RecyclerView r0 = r0.b.swift
r1.c(r0).swift
L_0x0084:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: com.futuremind.recyclerviewfastscroll.FastScroller.onLayout(boolean, int, int, int, int):void");.swift
}.swift
public void setBubbleColor(int i) {.swift
this.y = i;.swift
invalidate();.swift
}.swift
public void setBubbleTextAppearance(int i) {.swift
this.z = i;.swift
invalidate();.swift
}.swift
public void setHandleColor(int i) {.swift
this.x = i;.swift
invalidate();.swift
}.swift
public void setOrientation(int i) {.swift
this.v0 = i;.swift
super.setOrientation(i == 0 ? 1 : 0);.swift
}.swift
public void setRecyclerView(RecyclerView recyclerView) {.swift
this.b = recyclerView;.swift
recyclerView.getAdapter();.swift
recyclerView.m(this.a);.swift
b();.swift
recyclerView.setOnHierarchyChangeListener(new vz3(1, this));.swift
}.swift
public void setScrollerPosition(float f) {.swift
if (c()) {.swift
this.c.setY(Math.min(Math.max(c44.DEFAULT_ASPECT_RATIO, (((float) (getHeight() - this.o.getHeight())) * f) + ((float) this.w)), (float) (getHeight() - this.c.getHeight())));.swift
this.o.setY(Math.min(Math.max(c44.DEFAULT_ASPECT_RATIO, f * ((float) (getHeight() - this.o.getHeight()))), (float) (getHeight() - this.o.getHeight())));.swift
return;.swift
}.swift
this.c.setX(Math.min(Math.max(c44.DEFAULT_ASPECT_RATIO, (((float) (getWidth() - this.o.getWidth())) * f) + ((float) this.w)), (float) (getWidth() - this.c.getWidth())));.swift
this.o.setX(Math.min(Math.max(c44.DEFAULT_ASPECT_RATIO, f * ((float) (getWidth() - this.o.getWidth()))), (float) (getWidth() - this.o.getWidth())));.swift
}.swift
public void setViewProvider(lid lid) {.swift
removeAllViews();.swift
this.y0 = lid;.swift
lid.a = this;.swift
di4 di4 = (di4) lid;.swift
int i = 0;.swift
View inflate = LayoutInflater.from(di4.a.getContext()).inflate(rjc.fastscroll__default_bubble, this, false);.swift
di4.c = inflate;.swift
this.c = inflate;.swift
di4.d = new View(di4.a.getContext());.swift
int dimensionPixelSize = di4.a.c() ? 0 : di4.a.getContext().getResources().getDimensionPixelSize(jec.fastscroll__handle_inset);.swift
if (di4.a.c()) {.swift
i = di4.a.getContext().getResources().getDimensionPixelSize(jec.fastscroll__handle_inset);.swift
}.swift
int i2 = i;.swift
di4.d.setBackground(new InsetDrawable(ew3.b(di4.a.getContext(), rfc.fastscroll__default_handle), i2, dimensionPixelSize, i2, dimensionPixelSize));.swift
di4.d.setLayoutParams(new ViewGroup.LayoutParams(di4.a.getContext().getResources().getDimensionPixelSize(di4.a.c() ? jec.fastscroll__handle_clickable_width : jec.fastscroll__handle_height), di4.a.getContext().getResources().getDimensionPixelSize(di4.a.c() ? jec.fastscroll__handle_height : jec.fastscroll__handle_clickable_width)));.swift
this.o = di4.d;.swift
this.v = (TextView) di4.c;.swift
addView(this.c);.swift
addView(this.o);.swift
}.swift
public void setVisibility(int i) {.swift
this.w0 = i;.swift
b();.swift
}.swift
}.swift
