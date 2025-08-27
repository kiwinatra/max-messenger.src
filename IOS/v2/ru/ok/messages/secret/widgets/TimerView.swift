package ru.ok.messages.secret.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Lazy;

public class TimerView extends FrameLayout {
    public static final /* synthetic */ int w0 = 0;
    public RectF a;
    public final Paint b;
    public final Paint c;
    public final AppCompatImageView o;
    public float v = 360.0f;
    public boolean v0 = true;
    public ValueAnimator w;
    public long x = -1;
    public long y = -1;
    public long z = -1;

    public TimerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        Drawable drawable;
        int i2;
        TypedArray obtainStyledAttributes;
        int i3 = ro4.b().b;
        if (attributeSet == null || (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wnc.TimerView)) == null) {
            i = Integer.MIN_VALUE;
            i2 = Integer.MIN_VALUE;
            drawable = null;
        } else {
            int i4 = wnc.TimerView_circleColor;
            Context context2 = getContext();
            Lazy lazy = scf.b0;
            i = obtainStyledAttributes.getColor(i4, j4b.k0(context2).l);
            i2 = obtainStyledAttributes.getColor(wnc.TimerView_circleSecondaryColor, w53.h(i, 76));
            drawable = obtainStyledAttributes.getDrawable(wnc.TimerView_arrowResource);
            obtainStyledAttributes.recycle();
        }
        if (i == Integer.MIN_VALUE) {
            Context context3 = getContext();
            Lazy lazy2 = scf.b0;
            i = j4b.k0(context3).l;
        }
        i2 = i2 == Integer.MIN_VALUE ? w53.h(i, 76) : i2;
        Paint paint = new Paint();
        this.b = paint;
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        setColor(i);
        Paint paint2 = new Paint();
        this.c = paint2;
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        setSecondaryColor(i2);
        setStrokeWidth(i3);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), (AttributeSet) null);
        this.o = appCompatImageView;
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        if (drawable != null) {
            appCompatImageView.setImageDrawable(drawable);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(appCompatImageView, layoutParams);
        setWillNotDraw(false);
    }

    public final void a(long j, long j2, long j3) {
        this.x = j;
        this.y = j2;
        this.z = j3;
        if (j3 >= j2) {
            b(c44.DEFAULT_ASPECT_RATIO);
            return;
        }
        b(-1.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f - (((float) (j3 - j)) / ((float) (j2 - j))), 0.0f});
        this.w = ofFloat;
        ofFloat.setDuration(j2 - j3);
        this.w.addUpdateListener(new z00(27, (Object) this));
        this.w.start();
    }

    public final void b(float f) {
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            this.w.cancel();
        }
        if (f != -1.0f) {
            this.v = f * 360.0f;
            invalidate();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.v0) {
            long j = this.x;
            if (j != -1) {
                long j2 = this.y;
                if (j2 != -1) {
                    long j3 = this.z;
                    if (j3 != -1) {
                        a(j, j2, j3);
                    }
                }
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v0 = true;
        b(-1.0f);
    }

    public final void onDraw(Canvas canvas) {
        AppCompatImageView appCompatImageView = this.o;
        float rotation = appCompatImageView.getRotation();
        float f = this.v;
        if (rotation != f) {
            appCompatImageView.setRotation(f);
        }
        super.onDraw(canvas);
        float centerX = this.a.centerX();
        canvas.drawCircle(centerX, this.a.centerY(), this.a.right - centerX, this.c);
        float f2 = this.v;
        if (f2 > c44.DEFAULT_ASPECT_RATIO) {
            canvas.drawArc(this.a, 270.0f, f2, false, this.b);
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Paint paint = this.b;
        this.a = new RectF((paint.getStrokeWidth() / 2.0f) + ((float) getPaddingLeft()), (paint.getStrokeWidth() / 2.0f) + ((float) getPaddingTop()), (((float) getWidth()) - (paint.getStrokeWidth() / 2.0f)) - ((float) getPaddingRight()), (((float) getHeight()) - (paint.getStrokeWidth() / 2.0f)) - ((float) getPaddingBottom()));
        invalidate();
    }

    public void setArrorColor(int i) {
        this.o.setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public void setColor(int i) {
        this.b.setColor(i);
    }

    public void setImageResource(int i) {
        this.o.setImageResource(i);
    }

    public void setSecondaryColor(int i) {
        this.c.setColor(i);
    }

    public void setStrokeWidth(int i) {
        float f = (float) i;
        this.b.setStrokeWidth(f);
        this.c.setStrokeWidth(f);
    }

    public void setupColorsFrom(int i) {
        setColor(i);
        setSecondaryColor(w53.h(i, 76));
    }
}
