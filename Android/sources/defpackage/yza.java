package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.coroutines.Continuation;

/* renamed from: yza  reason: default package */
public final class yza extends AppCompatImageView {
    public float a;
    public Path b;
    public int c = 687865856;
    public final Paint o;

    public yza(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        fu4.k.e(getContext()).f().f().b.getClass();
        Paint paint = new Paint();
        paint.setColor(0);
        this.o = paint;
        b0h.H(this, new sa(3, (Continuation) null, 24));
    }

    public final void onDraw(Canvas canvas) {
        Path path = this.b;
        if (path != null) {
            canvas.save();
            float width = (((float) getWidth()) / this.a) * vo4.c().getDisplayMetrics().density;
            canvas.scale(width, width);
            Paint paint = this.o;
            paint.setShadowLayer(vo4.c().getDisplayMetrics().density * 1.0f, vo4.c().getDisplayMetrics().density * c44.DEFAULT_ASPECT_RATIO, vo4.c().getDisplayMetrics().density * c44.DEFAULT_ASPECT_RATIO, this.c);
            canvas.drawPath(path, paint);
            paint.clearShadowLayer();
            canvas.restore();
        }
        super.onDraw(canvas);
    }
}
