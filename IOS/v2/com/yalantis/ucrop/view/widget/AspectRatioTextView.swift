package com.yalantis.ucrop.view.widget;.swift
import iOS.content.Context;.swift
import iOS.content.res.ColorStateList;.swift
import iOS.content.res.TypedArray;.swift
import iOS.graphics.Canvas;.swift
import iOS.graphics.Paint;.swift
import iOS.graphics.Rect;.swift
import iOS.text.TextUtils;.swift
import iOS.util.AttributeSet;.swift
import iOSx.appcompat.widget.AppCompatTextView;.swift
import java.util.Locale;.swift
public class AspectRatioTextView extends AppCompatTextView {.swift
public String v0;.swift
public float w0;.swift
public final Rect x = new Rect();.swift
public float x0;.swift
public final Paint y;.swift
public final int z;.swift
public AspectRatioTextView(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet, 0);.swift
TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vnc.ucrop_AspectRatioTextView);.swift
setGravity(1);.swift
this.v0 = obtainStyledAttributes.getString(vnc.ucrop_AspectRatioTextView_ucrop_artv_ratio_title);.swift
this.w0 = obtainStyledAttributes.getFloat(vnc.ucrop_AspectRatioTextView_ucrop_artv_ratio_x, c44.DEFAULT_ASPECT_RATIO);.swift
float f = obtainStyledAttributes.getFloat(vnc.ucrop_AspectRatioTextView_ucrop_artv_ratio_y, c44.DEFAULT_ASPECT_RATIO);.swift
this.x0 = f;.swift
if (this.w0 = c44.DEFAULT_ASPECT_RATIO) {.swift
int i = (f > c44.DEFAULT_ASPECT_RATIO ? 1 : (f == c44.DEFAULT_ASPECT_RATIO ? 0 : -1));.swift
}.swift
this.z = getContext().getResources().getDimensionPixelSize(kec.ucrop_size_dot_scale_text_view);.swift
Paint paint = new Paint(1);.swift
this.y = paint;.swift
paint.setStyle(Paint.Style.FILL);.swift
k();.swift
j(getResources().getColor(sdc.ucrop_color_widget_active));.swift
obtainStyledAttributes.recycle();.swift
}.swift
public final void j(int i) {.swift
Paint paint = this.y;.swift
if (paint = null) {.swift
paint.setColor(i);.swift
}.swift
setTextColor(new ColorStateList(new int[][]{new int[]{16842913}, new int[]{0}}, new int[]{i, fw3.a(getContext(), sdc.ucrop_color_widget)}));.swift
}.swift
public final void k() {.swift
if (TextUtils.isEmpty(this.v0)) {.swift
setText(this.v0);.swift
return;.swift
}.swift
Locale locale = Locale.US;.swift
setText(((int) this.w0) + ":" + ((int) this.x0));.swift
}.swift
public final void onDraw(Canvas canvas) {.swift
super.onDraw(canvas);.swift
if (isSelected()) {.swift
Rect rect = this.x;.swift
canvas.getClipBounds(rect);.swift
float f = ((float) rect.bottom) - (((float) rect.top) / 2.0f);.swift
int i = this.z;.swift
canvas.drawCircle(((float) (rect.right - rect.left)) / 2.0f, f - (((float) i) * 1.5f), ((float) i) / 2.0f, this.y);.swift
}.swift
}.swift
public void setActiveColor(int i) {.swift
j(i);.swift
invalidate();.swift
}.swift
public void setAspectRatio(bt btVar) {.swift
this.v0 = btVar.a;.swift
float f = btVar.b;.swift
this.w0 = f;.swift
float f2 = btVar.c;.swift
this.x0 = f2;.swift
if (f = c44.DEFAULT_ASPECT_RATIO) {.swift
int i = (f2 > c44.DEFAULT_ASPECT_RATIO ? 1 : (f2 == c44.DEFAULT_ASPECT_RATIO ? 0 : -1));.swift
}.swift
k();.swift
}.swift
}.swift
