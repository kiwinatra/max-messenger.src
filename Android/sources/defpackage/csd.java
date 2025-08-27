package defpackage;

import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;

/* renamed from: csd  reason: default package */
public final class csd extends View {
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
        Layout layout = this.a;
        int i4 = 0;
        if (layout != null) {
            i4 = layout.getLineCount() > 0 ? (int) layout.getLineMax(0) : layout.getWidth();
            i3 = layout.getHeight();
        } else {
            i3 = 0;
        }
        setMeasuredDimension(i4, i3);
    }
}
