package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;

/* renamed from: t4e  reason: default package */
public abstract class t4e {
    public static final go0 a = new go0(10, 3);
    public static final Matrix b = new Matrix();

    public static final void a(Path path, Rect rect) {
        if (rect == null || rect.isEmpty()) {
            path.reset();
            return;
        }
        Matrix matrix = new Matrix();
        int min = Math.min(rect.width(), rect.height()) / 2;
        Path path2 = (Path) a.c(new uhe(min));
        if (path2 == null) {
            path2 = b(4.0d, min);
        }
        path.set(path2);
        float f = (float) min;
        matrix.setTranslate(((float) rect.left) + ((((float) rect.width()) / 2.0f) - f), ((float) rect.top) + ((((float) rect.height()) / 2.0f) - f));
        path.transform(matrix);
    }

    public static final Path b(double d, int i) {
        double d2;
        double d3;
        double d4 = d;
        int i2 = i;
        Path path = new Path();
        if (i2 <= 0) {
            return path;
        }
        double d5 = (double) i2;
        double pow = Math.pow(d5, d4);
        float f = (float) i2;
        path.moveTo(-f, c44.DEFAULT_ASPECT_RATIO);
        double d6 = -d5;
        double d7 = d6;
        boolean z = false;
        while (true) {
            double pow2 = pow - Math.pow(Math.abs(d6), d4);
            d2 = 1.0d / d4;
            double pow3 = Math.pow(Math.abs(pow2), d2) * Math.signum(pow2);
            d3 = d5;
            double d8 = d6;
            path.lineTo((float) d8, (float) pow3);
            if (z) {
                break;
            }
            d6 = RangesKt___RangesKt.coerceIn(d3 / ((double) 80), 0.2d, 1.0d) + d8;
            if (d6 >= d3) {
                d5 = d3;
                d6 = d5;
                z = true;
            } else {
                d5 = d3;
            }
        }
        double d9 = d3;
        boolean z2 = false;
        while (true) {
            double pow4 = pow - Math.pow(Math.abs(d9), d4);
            path.lineTo((float) d9, (float) (Math.pow(Math.abs(pow4), d2) * (-Math.signum(pow4))));
            if (z2) {
                path.close();
                path.offset(f, f);
                return path;
            }
            d9 -= RangesKt___RangesKt.coerceIn(d3 / ((double) 80), 0.2d, 1.0d);
            if (d9 <= ((double) (-i2))) {
                d9 = d7;
                z2 = true;
            }
        }
    }
}
