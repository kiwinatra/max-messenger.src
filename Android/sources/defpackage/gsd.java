package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import kotlin.Lazy;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* renamed from: gsd  reason: default package */
public final class gsd extends Drawable {
    public final int a;
    public final TextPaint b;
    public final Drawable c;
    public final String d;
    public StaticLayout e;
    public final int f;
    public final int g;

    public gsd(Context context, int i) {
        this.a = i;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(context.getResources().getDimension(mad.b));
        textPaint.setTypeface(Typeface.DEFAULT);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setAntiAlias(true);
        Lazy lazy = scf.b0;
        textPaint.setColor(j4b.k0(context).u);
        this.b = textPaint;
        Drawable b2 = ew3.b(context, nad.w1);
        b2.setTint(-1);
        this.c = b2;
        this.d = context.getString(qad.S8);
        this.f = (i / 2) + MathKt.roundToInt(((float) 8) * context.getResources().getDisplayMetrics().density);
        this.g = MathKt.roundToInt(((float) 32) * context.getResources().getDisplayMetrics().density);
    }

    public final void draw(Canvas canvas) {
        StaticLayout staticLayout = this.e;
        if (staticLayout != null) {
            Drawable drawable = this.c;
            if (!drawable.getBounds().isEmpty()) {
                drawable.draw(canvas);
            }
            canvas.save();
            canvas.translate(((float) getBounds().width()) / 2.0f, ((float) ((drawable.getIntrinsicHeight() + (getBounds().height() - staticLayout.getHeight())) + this.f)) / 2.0f);
            staticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        if (!rect.isEmpty()) {
            if (this.e == null) {
                String str = this.d;
                this.e = StaticLayout.Builder.obtain(str, 0, str.length(), this.b, RangesKt.coerceAtLeast(rect.width() - this.g, 0)).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
            }
            StaticLayout staticLayout = this.e;
            if (staticLayout != null) {
                int width = rect.width();
                Drawable drawable = this.c;
                int i = this.a;
                int intrinsicWidth = ((width - drawable.getIntrinsicWidth()) / 2) - (i / 2);
                int i2 = this.f;
                int height = ((((rect.height() - drawable.getIntrinsicHeight()) - staticLayout.getHeight()) / 2) - i2) - (i / 2);
                int i3 = i / 2;
                int intrinsicWidth2 = i3 + ((drawable.getIntrinsicWidth() + rect.width()) / 2);
                int i4 = i / 2;
                int intrinsicHeight = i4 + ((((drawable.getIntrinsicHeight() + rect.height()) - staticLayout.getHeight()) / 2) - i2);
                if (intrinsicWidth < intrinsicWidth2 && height < intrinsicHeight) {
                    drawable.setBounds(intrinsicWidth, height, intrinsicWidth2, intrinsicHeight);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Text layout has null value");
        }
    }

    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        this.c.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        this.c.setColorFilter(colorFilter);
    }
}
