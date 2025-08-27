package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* renamed from: m4e  reason: default package */
public final class m4e extends r4e {
    public final o4e c;

    public m4e(o4e o4e) {
        this.c = o4e;
    }

    public final void a(Matrix matrix, h4e h4e, int i, Canvas canvas) {
        h4e h4e2 = h4e;
        int i2 = i;
        Canvas canvas2 = canvas;
        o4e o4e = this.c;
        float f = o4e.f;
        float f2 = o4e.g;
        RectF rectF = new RectF(o4e.b, o4e.c, o4e.d, o4e.e);
        h4e.getClass();
        boolean z = f2 < c44.DEFAULT_ASPECT_RATIO;
        Path path = h4e2.g;
        int[] iArr = h4e.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = h4e2.f;
            iArr[2] = h4e2.e;
            iArr[3] = h4e2.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = (float) (-i2);
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = h4e2.d;
            iArr[2] = h4e2.e;
            iArr[3] = h4e2.f;
        }
        float width = rectF.width() / 2.0f;
        if (width > c44.DEFAULT_ASPECT_RATIO) {
            float f4 = 1.0f - (((float) i2) / width);
            float[] fArr = h4e.l;
            fArr[1] = f4;
            fArr[2] = ((1.0f - f4) / 2.0f) + f4;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint = h4e2.b;
            paint.setShader(radialGradient);
            canvas.save();
            canvas2.concat(matrix);
            canvas2.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, h4e2.h);
            }
            canvas.drawArc(rectF, f, f2, true, paint);
            canvas.restore();
        }
    }
}
