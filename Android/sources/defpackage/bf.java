package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: bf  reason: default package */
public final class bf extends View {
    public final Paint a = new Paint();

    public bf(Context context) {
        super(context, (AttributeSet) null, 0);
    }

    public final void onDraw(Canvas canvas) {
        canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, ((float) getWidth()) / 2.0f, this.a);
        super.onDraw(canvas);
    }

    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        super.onMeasure(i, i2);
    }
}
