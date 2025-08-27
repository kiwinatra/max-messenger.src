package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: qg0  reason: default package */
public final class qg0 extends qb6 {
    public final Paint X;
    public int Y = 0;
    public final Rect Z;
    public final ro4 v;
    public final RectF v0;
    public final int w;
    public String w0;
    public final int x;
    public int x0;
    public final Drawable y;
    public final int y0;
    public final Paint z;

    public qg0(Drawable drawable, int i) {
        super(drawable);
        ym ymVar = ym.v;
        ro4 b = ro4.b();
        this.v = b;
        this.w = b.d;
        int i2 = b.f;
        this.x = i2;
        this.y0 = i2;
        this.y = drawable;
        Paint paint = new Paint();
        this.X = paint;
        paint.setColor(-1);
        paint.setTextSize(b.R);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.z = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(i);
        paint2.setAntiAlias(true);
        this.Z = new Rect();
        this.v0 = new RectF();
    }

    public final void draw(Canvas canvas) {
        float f;
        super.draw(canvas);
        if (this.Y != 0) {
            float intrinsicWidth = (float) getIntrinsicWidth();
            float intrinsicHeight = (float) getIntrinsicHeight();
            if (intrinsicWidth != c44.DEFAULT_ASPECT_RATIO && intrinsicHeight != c44.DEFAULT_ASPECT_RATIO) {
                boolean A = cvg.A(this.w0);
                Paint paint = this.z;
                ro4 ro4 = this.v;
                if (!A) {
                    int length = this.w0.length();
                    Paint paint2 = this.X;
                    if (length >= 7) {
                        paint2.setTextSize(ro4.Q);
                    }
                    String str = this.w0;
                    int length2 = str.length();
                    Rect rect = this.Z;
                    paint2.getTextBounds(str, 0, length2, rect);
                    int width = rect.width() + this.x;
                    int i = this.x0;
                    if (i != 0) {
                        float f2 = ((float) (i / 2)) - (intrinsicWidth / 2.0f);
                        float f3 = (float) width;
                        float f4 = f3 - f2;
                        if (f2 <= f3) {
                            f = (intrinsicWidth / 1.2f) - f4;
                            RectF rectF = this.v0;
                            int i2 = rect.left;
                            int i3 = this.y0;
                            int i4 = rect.top;
                            int i5 = this.w;
                            rectF.set((float) (i2 - i3), (float) (i4 - i5), (float) (rect.right + i3), (float) (rect.bottom + i5));
                            canvas.translate(f, intrinsicHeight / 2.5f);
                            int i6 = ro4.h;
                            canvas.drawRoundRect(rectF, (float) i6, (float) i6, paint);
                            canvas.drawText(this.w0, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, paint2);
                            return;
                        }
                    }
                    f = intrinsicWidth / 1.2f;
                    RectF rectF2 = this.v0;
                    int i22 = rect.left;
                    int i32 = this.y0;
                    int i42 = rect.top;
                    int i52 = this.w;
                    rectF2.set((float) (i22 - i32), (float) (i42 - i52), (float) (rect.right + i32), (float) (rect.bottom + i52));
                    canvas.translate(f, intrinsicHeight / 2.5f);
                    int i62 = ro4.h;
                    canvas.drawRoundRect(rectF2, (float) i62, (float) i62, paint);
                    canvas.drawText(this.w0, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, paint2);
                    return;
                }
                int i7 = ro4.e;
                canvas.drawCircle(intrinsicWidth - ((float) i7), (float) i7, (float) i7, paint);
            }
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return new pg0(this.y.getConstantState(), this);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.y.setTintList(colorStateList);
    }
}
