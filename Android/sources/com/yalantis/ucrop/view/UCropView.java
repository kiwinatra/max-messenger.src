package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/yalantis/ucrop/view/UCropView;", "Landroid/widget/FrameLayout;", "Lz34;", "Lq6b;", "", "getMinOverlaySize", "()F", "Lcom/yalantis/ucrop/view/GestureCropImageView;", "a", "Lcom/yalantis/ucrop/view/GestureCropImageView;", "getCropImageView", "()Lcom/yalantis/ucrop/view/GestureCropImageView;", "cropImageView", "Lcom/yalantis/ucrop/view/OverlayView;", "b", "Lcom/yalantis/ucrop/view/OverlayView;", "getOverlayView", "()Lcom/yalantis/ucrop/view/OverlayView;", "overlayView", "photo-crop_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nUCropView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UCropView.kt\ncom/yalantis/ucrop/view/UCropView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,69:1\n233#2,3:70\n*S KotlinDebug\n*F\n+ 1 UCropView.kt\ncom/yalantis/ucrop/view/UCropView\n*L\n32#1:70,3\n*E\n"})
public final class UCropView extends FrameLayout implements z34, q6b {
    public final GestureCropImageView a;
    public final OverlayView b;

    @JvmOverloads
    public UCropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        View.inflate(context, sjc.ucrop_view, this);
        GestureCropImageView gestureCropImageView = (GestureCropImageView) findViewById(bgc.image_view_crop);
        this.a = gestureCropImageView;
        OverlayView overlayView = (OverlayView) findViewById(bgc.view_overlay);
        this.b = overlayView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vnc.UCropView);
        overlayView.getClass();
        overlayView.v0 = obtainStyledAttributes.getBoolean(vnc.UCropView_ucrop_circle_dimmed_layer, false);
        int color = obtainStyledAttributes.getColor(vnc.UCropView_ucrop_dimmed_color, overlayView.getResources().getColor(sdc.ucrop_color_default_dimmed));
        overlayView.w0 = color;
        Paint paint = overlayView.y0;
        paint.setColor(color);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(1.0f);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(vnc.UCropView_ucrop_frame_stroke_size, overlayView.getResources().getDimensionPixelSize(kec.ucrop_default_crop_frame_stoke_width));
        int color2 = obtainStyledAttributes.getColor(vnc.UCropView_ucrop_frame_color, overlayView.getResources().getColor(sdc.ucrop_color_default_crop_frame));
        Paint paint2 = overlayView.A0;
        paint2.setStrokeWidth((float) dimensionPixelSize);
        paint2.setColor(color2);
        paint2.setStyle(style);
        Paint paint3 = overlayView.B0;
        paint3.setStrokeWidth((float) (dimensionPixelSize * 3));
        paint3.setColor(color2);
        paint3.setStyle(style);
        overlayView.y = obtainStyledAttributes.getBoolean(vnc.UCropView_ucrop_show_frame, true);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(vnc.UCropView_ucrop_grid_stroke_size, overlayView.getResources().getDimensionPixelSize(kec.ucrop_default_crop_grid_stoke_width));
        int color3 = obtainStyledAttributes.getColor(vnc.UCropView_ucrop_grid_color, overlayView.getResources().getColor(sdc.ucrop_color_default_crop_grid));
        Paint paint4 = overlayView.z0;
        paint4.setStrokeWidth((float) dimensionPixelSize2);
        paint4.setColor(color3);
        overlayView.o = obtainStyledAttributes.getInt(vnc.UCropView_ucrop_grid_row_count, 2);
        overlayView.v = obtainStyledAttributes.getInt(vnc.UCropView_ucrop_grid_column_count, 2);
        overlayView.z = obtainStyledAttributes.getBoolean(vnc.UCropView_ucrop_show_grid, true);
        gestureCropImageView.processStyledAttributes(obtainStyledAttributes);
        Unit unit = Unit.INSTANCE;
        obtainStyledAttributes.recycle();
        gestureCropImageView.setCropBoundsChangeListener(this);
        overlayView.setOverlayViewChangeListener(this);
    }

    public final GestureCropImageView getCropImageView() {
        return this.a;
    }

    public float getMinOverlaySize() {
        return this.a.getMinOverlaySize();
    }

    public final OverlayView getOverlayView() {
        return this.b;
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
