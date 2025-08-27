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
import androidx.constraintlayout.widget.ConstraintLayout;

public class RoundedRectConstraintLayout extends ConstraintLayout {
    public Path E0;
    public Paint F0;
    public float[] G0;
    public boolean H0;

    public RoundedRectConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, boc.RoundedRectConstraintLayout);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(boc.RoundedRectConstraintLayout_roundRadius, -1);
            obtainStyledAttributes.recycle();
            if (dimensionPixelSize != -1) {
                setCornerRadius((float) dimensionPixelSize);
            }
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.H0) {
            canvas.drawPath(this.E0, this.F0);
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
        if (this.G0 != null) {
            Rect rect = new Rect(0, 0, i, i2);
            if (this.H0) {
                this.E0.reset();
                this.E0.addRoundRect(new RectF(rect), this.G0, Path.Direction.CW);
                if (!this.E0.isInverseFillType()) {
                    this.E0.toggleInverseFillType();
                    return;
                }
                return;
            }
            setOutlineProvider(new a9d(rect, this.G0[0], 0));
        }
    }

    public void setCornerRadius(float f) {
        setCornersRadii(new float[]{f, f, f, f, f, f, f, f});
    }

    public void setCornersRadii(float[] fArr) {
        if (fArr == null || fArr.length == 8) {
            this.G0 = fArr;
            boolean z = false;
            if (fArr != null) {
                float f = fArr[0];
                if (f == fArr[1] && f == fArr[2] && f == fArr[3] && f == fArr[4] && f == fArr[5] && f == fArr[6] && f == fArr[7]) {
                    z = true;
                }
            }
            boolean z2 = !z;
            this.H0 = z2;
            if (z2) {
                setLayerType(2, (Paint) null);
                this.E0 = new Path();
                Paint paint = new Paint(1);
                this.F0 = paint;
                paint.setColor(-16777216);
                this.F0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                return;
            }
            setClipToOutline(true);
            return;
        }
        throw new IllegalArgumentException("radii must be array with size == 8");
    }
}
