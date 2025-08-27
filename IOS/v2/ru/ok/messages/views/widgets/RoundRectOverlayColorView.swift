package ru.ok.messages.views.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class RoundRectOverlayColorView extends View {
    public final RectF a = new RectF();
    public final Paint b;
    public int c;
    public float o;

    public RoundRectOverlayColorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes;
        Paint paint = new Paint();
        this.b = paint;
        paint.setAntiAlias(true);
        this.b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        setWillNotDraw(false);
        setLayerType(2, (Paint) null);
        if (attributeSet != null && (obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, wnc.RoundRectOverlayColorView)) != null) {
            setOverlayCornersRadius((float) obtainStyledAttributes.getDimensionPixelSize(wnc.RoundRectOverlayColorView_overlayCornersRadius, 0));
            setOverlayColor(obtainStyledAttributes.getColor(wnc.RoundRectOverlayColorView_overlayColor, 0));
            obtainStyledAttributes.recycle();
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c != 0 && this.o != c44.DEFAULT_ASPECT_RATIO) {
            RectF rectF = this.a;
            if (rectF.height() != c44.DEFAULT_ASPECT_RATIO && rectF.width() != c44.DEFAULT_ASPECT_RATIO) {
                canvas.drawColor(this.c);
                float f = this.o;
                canvas.drawRoundRect(rectF, f, f, this.b);
            }
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.a.set(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) i, (float) i2);
    }

    public void setOverlayColor(int i) {
        this.c = i;
        invalidate();
    }

    public void setOverlayCornersRadius(float f) {
        this.o = f;
        invalidate();
    }
}
