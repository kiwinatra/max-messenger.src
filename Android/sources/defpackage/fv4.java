package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: fv4  reason: default package */
public final class fv4 extends qb6 {
    public final Drawable v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public fv4(Drawable drawable, int i, int i2, int i3, int i4, boolean z2) {
        super(drawable);
        this.v = drawable;
        this.x = i2;
        this.z = i4;
        if (z2) {
            this.w = i3;
            this.y = i;
            return;
        }
        this.w = i;
        this.y = i3;
    }

    public final void draw(Canvas canvas) {
        this.v.draw(canvas);
    }

    public final int getIntrinsicHeight() {
        return this.v.getIntrinsicHeight() + this.x + this.z;
    }

    public final int getIntrinsicWidth() {
        return this.v.getIntrinsicWidth() + this.w + this.y;
    }

    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.v.setBounds(rect.left + this.w, rect.top + this.x, rect.right - this.y, rect.bottom - this.z);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.v.setBounds(i + this.w, i2 + this.x, i3 - this.y, i4 - this.z);
    }
}
