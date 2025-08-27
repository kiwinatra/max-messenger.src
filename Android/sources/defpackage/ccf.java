package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.RenderScript;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.math.MathKt;

/* renamed from: ccf  reason: default package */
public final class ccf implements wp0 {
    public final Paint a;
    public final Lazy b;

    public ccf(Context context) {
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setAntiAlias(true);
        this.a = paint;
        this.b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new a1b(context, 28));
    }

    public final void c() {
        Lazy lazy = ((u87) this.b.getValue()).a;
        if (lazy.isInitialized()) {
            ((RenderScript) lazy.getValue()).destroy();
        }
    }

    public final void d(int i) {
        this.a.setAlpha(i);
    }

    public final void k(Canvas canvas, Bitmap bitmap) {
        canvas.drawBitmap(bitmap, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, this.a);
    }

    public final void m(Bitmap bitmap, float f) {
        ((u87) this.b.getValue()).a(bitmap, MathKt.roundToInt(f));
    }
}
