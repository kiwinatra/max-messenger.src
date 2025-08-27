package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: qhe  reason: default package */
public final class qhe extends Drawable {
    public static final Paint d;
    public final rhe a;
    public final Rect b;
    public final Paint c;

    static {
        Paint paint = new Paint();
        paint.setColor(0);
        d = paint;
    }

    public qhe(rhe rhe) {
        this.a = rhe;
        this.b = new Rect();
        this.c = new Paint(2);
        int i = rhe.b;
        setBounds(0, 0, i, i);
        a();
    }

    public final void a() {
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int i = this.a.b / 2;
        this.b.set(centerX - i, centerY - i, centerX + i, centerY + i);
    }

    public final void draw(Canvas canvas) {
        rhe rhe = this.a;
        Bitmap E = rhe.e.E(rhe.a);
        Rect rect = this.b;
        if (E == null) {
            canvas.drawRect(rect, d);
            return;
        }
        Rect rect2 = n35.c;
        canvas.drawBitmap(E, n35.c, rect, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qhe) && Intrinsics.areEqual((Object) this.a, (Object) ((qhe) obj).a);
    }

    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    public final int getIntrinsicHeight() {
        return getBounds().height();
    }

    public final int getIntrinsicWidth() {
        return getBounds().width();
    }

    public final int getMinimumHeight() {
        return getBounds().height();
    }

    public final int getMinimumWidth() {
        return getBounds().width();
    }

    public final int getOpacity() {
        return -2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void setAlpha(int i) {
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.a.b = i4;
        a();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final String toString() {
        return "SpriteEmojiDrawable(state=" + this.a + ")";
    }

    public qhe(z35 z35, int i, l15 l15) {
        this(new rhe(new k25(z35.b, z35.c, z35.d), i, l15));
    }
}
