package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* renamed from: r53  reason: default package */
public final class r53 extends View {
    public Paint a;
    public Paint b;
    public int c;

    public int getColor() {
        return this.a.getColor();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = (float) (getWidth() / 2);
        float height = (float) (getHeight() / 2);
        canvas.drawCircle(width, height, (float) (getWidth() / 2), this.b);
        canvas.drawCircle(width, height, (float) ((getWidth() - (this.c * 2)) / 2), this.a);
    }

    public void setColor(int i) {
        this.a.setColor(i);
        invalidate();
    }
}
