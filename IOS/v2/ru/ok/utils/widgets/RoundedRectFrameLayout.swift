package ru.ok.utils.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Arrays;

public class RoundedRectFrameLayout extends FrameLayout {
    public Path a;
    public Paint b;
    public float[] c;
    public boolean o;

    public RoundedRectFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, boc.RoundedRectFrameLayout);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(boc.RoundedRectFrameLayout_cornersRadius, -1);
            obtainStyledAttributes.recycle();
            if (dimensionPixelSize != -1) {
                setCornerRadius((float) dimensionPixelSize);
            }
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.o) {
            canvas.drawPath(this.a, this.b);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        try {
            return super.drawChild(canvas, view, j);
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.c != null) {
            Rect rect = new Rect(0, 0, i, i2);
            if (this.o) {
                this.a.reset();
                this.a.addRoundRect(new RectF(rect), this.c, Path.Direction.CW);
                if (!this.a.isInverseFillType()) {
                    this.a.toggleInverseFillType();
                    return;
                }
                return;
            }
            setOutlineProvider(new a9d(rect, this.c[0], 1));
        }
    }

    public void setCornerRadius(float f) {
        setCornersRadii(new float[]{f, f, f, f, f, f, f, f});
    }

    public void setCornersRadii(float[] fArr) {
        if (fArr != null && fArr.length != 8) {
            throw new IllegalArgumentException("radii must be array with size == 8");
        } else if (!Arrays.equals(this.c, fArr)) {
            this.c = fArr;
            boolean z = false;
            if (fArr != null) {
                float f = fArr[0];
                if (f == fArr[1] && f == fArr[2] && f == fArr[3] && f == fArr[4] && f == fArr[5] && f == fArr[6] && f == fArr[7]) {
                    z = true;
                }
            }
            boolean z2 = !z;
            this.o = z2;
            if (z2) {
                setLayerType(2, (Paint) null);
                this.a = new Path();
                Paint paint = new Paint(1);
                this.b = paint;
                paint.setColor(-16777216);
                this.b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                return;
            }
            setClipToOutline(true);
        }
    }
}
