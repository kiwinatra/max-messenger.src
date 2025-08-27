package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* renamed from: id0  reason: default package */
public final class id0 extends hk0 {
    public final y33 a(Bitmap bitmap, ynb ynb) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        ynb.getClass();
        y33 c = ynb.c(width, height, Bitmap.Config.ARGB_8888);
        go0 go0 = t4e.a;
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        Canvas canvas = new Canvas((Bitmap) c.e0());
        canvas.drawBitmap(bitmap, t4e.b, (Paint) null);
        int min = Math.min(width2, height2) / 2;
        Path b = t4e.b(4.0d, min);
        Matrix matrix = new Matrix();
        float f = (float) min;
        matrix.postTranslate((((float) width2) / 2.0f) - f, (((float) height2) / 2.0f) - f);
        b.transform(matrix);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        b.setFillType(Path.FillType.INVERSE_WINDING);
        canvas.drawPath(b, paint);
        return c;
    }

    public final qx0 b() {
        return new uae("AvatarAsSquirclePostProcessor");
    }
}
