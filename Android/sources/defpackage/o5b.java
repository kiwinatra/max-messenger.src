package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: o5b  reason: default package */
public final class o5b extends qb6 {
    public final Matrix v = new Matrix();
    public final int w;
    public final int x;
    public final Matrix y;
    public final RectF z;

    public o5b(BitmapDrawable bitmapDrawable, int i, int i2) {
        super(bitmapDrawable);
        this.w = i - (i % 90);
        this.x = (i2 < 0 || i2 > 8) ? 0 : i2;
        this.y = new Matrix();
        this.z = new RectF();
    }

    public final void d(Matrix matrix) {
        n(matrix);
        Matrix matrix2 = this.v;
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    public final void draw(Canvas canvas) {
        int i;
        if (this.w > 0 || !((i = this.x) == 0 || i == 1)) {
            int save = canvas.save();
            canvas.concat(this.v);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    public final int getIntrinsicHeight() {
        int i = this.x;
        return (i == 5 || i == 7 || this.w % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        int i = this.x;
        return (i == 5 || i == 7 || this.w % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            int i = this.x;
            int i2 = this.w;
            if (i2 > 0 || !(i == 0 || i == 1)) {
                Matrix matrix = this.v;
                if (i == 2) {
                    matrix.setScale(-1.0f, 1.0f);
                } else if (i == 7) {
                    matrix.setRotate(270.0f, (float) rect.centerX(), (float) rect.centerY());
                    matrix.postScale(-1.0f, 1.0f);
                } else if (i == 4) {
                    matrix.setScale(1.0f, -1.0f);
                } else if (i != 5) {
                    matrix.setRotate((float) i2, (float) rect.centerX(), (float) rect.centerY());
                } else {
                    matrix.setRotate(270.0f, (float) rect.centerX(), (float) rect.centerY());
                    matrix.postScale(1.0f, -1.0f);
                }
                Matrix matrix2 = this.y;
                matrix2.reset();
                matrix.invert(matrix2);
                RectF rectF = this.z;
                rectF.set(rect);
                matrix2.mapRect(rectF);
                drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                return;
            }
            drawable.setBounds(rect);
        }
    }
}
