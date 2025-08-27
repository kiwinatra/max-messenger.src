package defpackage;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.TextPaint;
import android.view.View;

/* renamed from: zrd  reason: default package */
public final class zrd extends View {
    public Layout a;
    public int b;

    public final void onDraw(Canvas canvas) {
        Layout layout = this.a;
        if (layout != null) {
            layout.draw(canvas);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        Layout layout = this.a;
        if (layout != null) {
            i3 = layout.getWidth();
            i4 = layout.getHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        setMeasuredDimension(i3, i4);
    }

    public final void setLayout(Layout layout) {
        this.a = layout;
        TextPaint paint = layout.getPaint();
        if (paint != null) {
            paint.setColor(this.b);
        }
        requestLayout();
        invalidate();
    }

    public final void setTextColor(int i) {
        TextPaint paint;
        this.b = i;
        Layout layout = this.a;
        if (!(layout == null || (paint = layout.getPaint()) == null)) {
            paint.setColor(i);
        }
        invalidate();
    }
}
