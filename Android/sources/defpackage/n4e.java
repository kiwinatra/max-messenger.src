package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* renamed from: n4e  reason: default package */
public final class n4e extends r4e {
    public final p4e c;
    public final float d;
    public final float e;

    public n4e(p4e p4e, float f, float f2) {
        this.c = p4e;
        this.d = f;
        this.e = f2;
    }

    public final void a(Matrix matrix, h4e h4e, int i, Canvas canvas) {
        h4e h4e2 = h4e;
        int i2 = i;
        Canvas canvas2 = canvas;
        p4e p4e = this.c;
        float f = p4e.c;
        float f2 = this.e;
        float f3 = p4e.b;
        float f4 = this.d;
        RectF rectF = new RectF(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) Math.hypot((double) (f - f2), (double) (f3 - f4)), c44.DEFAULT_ASPECT_RATIO);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        h4e.getClass();
        rectF.bottom += (float) i2;
        rectF.offset(c44.DEFAULT_ASPECT_RATIO, (float) (-i2));
        int[] iArr = h4e.i;
        iArr[0] = h4e2.f;
        iArr[1] = h4e2.e;
        iArr[2] = h4e2.d;
        Paint paint = h4e2.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, h4e.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas2.concat(matrix2);
        canvas2.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        p4e p4e = this.c;
        return (float) Math.toDegrees(Math.atan((double) ((p4e.c - this.e) / (p4e.b - this.d))));
    }
}
