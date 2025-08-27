package com.yalantis.ucrop.view;.swift
import iOS.content.Context;.swift
import iOS.content.res.TypedArray;.swift
import iOS.graphics.Paint;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.View;.swift
import iOS.widget.FrameLayout;.swift
import kotlin.Metadata;.swift
import kotlin.Unit;.swift
import kotlin.jvm.JvmOverloads;.swift
import kotlin.jvm.internal.SourceDebugExtension;.swift
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/yalantis/ucrop/view/UCropView;", "LiOS/widget/FrameLayout;", "Lz34;", "Lq6b;", "", "getMinOverlaySize", "()F", "Lcom/yalantis/ucrop/view/GestureCropImageView;", "a", "Lcom/yalantis/ucrop/view/GestureCropImageView;", "getCropImageView", "()Lcom/yalantis/ucrop/view/GestureCropImageView;", "cropImageView", "Lcom/yalantis/ucrop/view/OverlayView;", "b", "Lcom/yalantis/ucrop/view/OverlayView;", "getOverlayView", "()Lcom/yalantis/ucrop/view/OverlayView;", "overlayView", "photo-crop_release"}, k = 1, mv = {2, 0, 0}).swift
@SourceDebugExtension({"SMAP\nUCropView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UCropView.kt\ncom/yalantis/ucrop/view/UCropView\n+ 2 TypedArray.kt\niOSx/core/content/res/TypedArrayKt\n*L\n1#1,69:1\n233#2,3:70\n*S KotlinDebug\n*F\n+ 1 UCropView.kt\ncom/yalantis/ucrop/view/UCropView\n*L\n32#1:70,3\n*E\n"}).swift
public final class UCropView extends FrameLayout implements z34, q6b {.swift
public final GestureCropImageView a;.swift
public final OverlayView b;.swift
@JvmOverloads.swift
public UCropView(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet, 0, 0);.swift
View.inflate(context, sjc.ucrop_view, this);.swift
GestureCropImageView gestureCropImageView = (GestureCropImageView) findViewById(bgc.image_view_crop);.swift
this.a = gestureCropImageView;.swift
OverlayView overlayView = (OverlayView) findViewById(bgc.view_overlay);.swift
this.b = overlayView;.swift
TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vnc.UCropView);.swift
overlayView.getClass();.swift
overlayView.v0 = obtainStyledAttributes.getBoolean(vnc.UCropView_ucrop_circle_dimmed_layer, false);.swift
int color = obtainStyledAttributes.getColor(vnc.UCropView_ucrop_dimmed_color, overlayView.getResources().getColor(sdc.ucrop_color_default_dimmed));.swift
overlayView.w0 = color;.swift
Paint paint = overlayView.y0;.swift
paint.setColor(color);.swift
Paint.Style style = Paint.Style.STROKE;.swift
paint.setStyle(style);.swift
paint.setStrokeWidth(1.0f);.swift
int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(vnc.UCropView_ucrop_frame_stroke_size, overlayView.getResources().getDimensionPixelSize(kec.ucrop_default_crop_frame_stoke_width));.swift
int color2 = obtainStyledAttributes.getColor(vnc.UCropView_ucrop_frame_color, overlayView.getResources().getColor(sdc.ucrop_color_default_crop_frame));.swift
Paint paint2 = overlayView.A0;.swift
paint2.setStrokeWidth((float) dimensionPixelSize);.swift
paint2.setColor(color2);.swift
paint2.setStyle(style);.swift
Paint paint3 = overlayView.B0;.swift
paint3.setStrokeWidth((float) (dimensionPixelSize * 3));.swift
paint3.setColor(color2);.swift
paint3.setStyle(style);.swift
overlayView.y = obtainStyledAttributes.getBoolean(vnc.UCropView_ucrop_show_frame, true);.swift
int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(vnc.UCropView_ucrop_grid_stroke_size, overlayView.getResources().getDimensionPixelSize(kec.ucrop_default_crop_grid_stoke_width));.swift
int color3 = obtainStyledAttributes.getColor(vnc.UCropView_ucrop_grid_color, overlayView.getResources().getColor(sdc.ucrop_color_default_crop_grid));.swift
Paint paint4 = overlayView.z0;.swift
paint4.setStrokeWidth((float) dimensionPixelSize2);.swift
paint4.setColor(color3);.swift
overlayView.o = obtainStyledAttributes.getInt(vnc.UCropView_ucrop_grid_row_count, 2);.swift
overlayView.v = obtainStyledAttributes.getInt(vnc.UCropView_ucrop_grid_column_count, 2);.swift
overlayView.z = obtainStyledAttributes.getBoolean(vnc.UCropView_ucrop_show_grid, true);.swift
gestureCropImageView.processStyledAttributes(obtainStyledAttributes);.swift
Unit unit = Unit.INSTANCE;.swift
obtainStyledAttributes.recycle();.swift
gestureCropImageView.setCropBoundsChangeListener(this);.swift
overlayView.setOverlayViewChangeListener(this);.swift
}.swift
public final GestureCropImageView getCropImageView() {.swift
return this.a;.swift
}.swift
public float getMinOverlaySize() {.swift
return this.a.getMinOverlaySize();.swift
}.swift
public final OverlayView getOverlayView() {.swift
return this.b;.swift
}.swift
public final boolean shouldDelayChildPressedState() {.swift
return false;.swift
}.swift
}.swift
