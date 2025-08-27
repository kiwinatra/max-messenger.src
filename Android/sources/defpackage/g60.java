package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Lazy;
import kotlin.math.MathKt;

/* renamed from: g60  reason: default package */
public final class g60 extends AppCompatTextView implements bif {
    public final float v0;
    public Animator w0;
    public final Paint x;
    public boolean x0;
    public final float y;
    public boolean y0;
    public final Path z = new Path();

    public g60(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setDither(true);
        this.x = paint;
        float f = (float) 4;
        this.y = getContext().getResources().getDisplayMetrics().density * f;
        float f2 = ((float) 6.8d) * getContext().getResources().getDisplayMetrics().density;
        this.v0 = f2;
        setClickable(false);
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
        setMinWidth(MathKt.roundToInt(((float) 64) * getContext().getResources().getDisplayMetrics().density));
        float f3 = (float) 12;
        setElevation(getContext().getResources().getDisplayMetrics().density * f3);
        setPadding(MathKt.roundToInt(f3 * getContext().getResources().getDisplayMetrics().density), MathKt.roundToInt(getContext().getResources().getDisplayMetrics().density * f), MathKt.roundToInt(getContext().getResources().getDisplayMetrics().density * f3), MathKt.roundToInt(f * getContext().getResources().getDisplayMetrics().density) + ((int) f2));
        setTextSize(16.0f);
        setGravity(17);
        setTextAlignment(4);
        setLineHeight(19);
        c();
    }

    public final void c() {
        scf scf;
        if (isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context = getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context);
        }
        this.x.setColor(scf.E);
        setTextColor(scf.G);
    }

    public final boolean isClickable() {
        return false;
    }

    public final ObjectAnimator j(float f, float f2) {
        return ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{f, f2}), PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{f, f2}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{f, f2})});
    }

    public final void onDetachedFromWindow() {
        Animator animator = this.w0;
        if (animator != null) {
            animator.cancel();
        }
        super.onDetachedFromWindow();
    }

    public final void onDraw(Canvas canvas) {
        canvas.drawPath(this.z, this.x);
        super.onDraw(canvas);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(MathKt.roundToInt(getContext().getResources().getDisplayMetrics().density * 33.8f), 1073741824));
        setPivotX(((float) getMeasuredWidth()) * 0.5f);
        setPivotY((float) getMeasuredHeight());
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Path path = this.z;
        path.reset();
        float f = (float) i;
        float f2 = this.y;
        float f3 = ((float) 2) * f2;
        float f4 = (float) i2;
        float f5 = f4 - f3;
        path.moveTo(f, f2 + c44.DEFAULT_ASPECT_RATIO);
        float f6 = f - f3;
        float f7 = f3 + c44.DEFAULT_ASPECT_RATIO;
        float f8 = f7;
        path.arcTo(f6, c44.DEFAULT_ASPECT_RATIO, f, f8, c44.DEFAULT_ASPECT_RATIO, -90.0f, false);
        path.rLineTo(-f6, c44.DEFAULT_ASPECT_RATIO);
        Path path2 = path;
        float f9 = f7;
        path2.arcTo(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, f9, f8, 270.0f, -90.0f, false);
        path.rLineTo(c44.DEFAULT_ASPECT_RATIO, f5);
        path2.arcTo(c44.DEFAULT_ASPECT_RATIO, f5, f9, f4, 180.0f, -90.0f, false);
        float f10 = this.v0;
        path.lineTo((0.5f * f) - f10, f4);
        path.rLineTo(f10, f10);
        path.rLineTo(f10, -f10);
        path.lineTo(f - f2, f4);
        path.arcTo(f6, f5, f, f4, 90.0f, -90.0f, false);
        path.rLineTo(c44.DEFAULT_ASPECT_RATIO, -f5);
    }

    public void setBackground(Drawable drawable) {
    }

    public void setBackgroundColor(int i) {
    }

    public final void setCurrentAudioPosition(long j) {
        setText(b0h.c(j));
    }

    public final void setLayoutPosition(float f) {
        setX(f - (((float) getMeasuredWidth()) * 0.5f));
    }
}
