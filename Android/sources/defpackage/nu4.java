package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: nu4  reason: default package */
public final class nu4 extends View implements phf {
    public final Paint a = new Paint();
    public final RectF b = new RectF();
    public float c;

    public nu4(Context context) {
        super(context);
        onThemeChanged(fu4.k.e(getContext()).f());
        setClickable(false);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 49));
    }

    public final void onDraw(Canvas canvas) {
        RectF rectF = this.b;
        float f = this.c;
        canvas.drawRoundRect(rectF, f, f, this.a);
    }

    public final void onMeasure(int i, int i2) {
        RectF rectF = this.b;
        rectF.set(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, vo4.c().getDisplayMetrics().density * 40.0f, vo4.c().getDisplayMetrics().density * 4.0f);
        this.c = rectF.centerY();
        setMeasuredDimension((int) rectF.width(), (int) rectF.height());
    }

    public final void onThemeChanged(k2b k2b) {
        this.a.setColor(k2b.getIcon().g);
    }
}
