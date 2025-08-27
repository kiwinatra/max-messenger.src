package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.util.Locale;

/* renamed from: grf  reason: default package */
public abstract class grf {
    public static final RectF a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static Matrix a(RectF rectF, RectF rectF2, int i, boolean z) {
        Matrix matrix = new Matrix();
        RectF rectF3 = a;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix.setRectToRect(rectF, rectF3, scaleToFit);
        matrix.postRotate((float) i);
        if (z) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF3, rectF2, scaleToFit);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public static boolean b(Rect rect, Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    public static boolean c(int i) {
        if (i == 90 || i == 270) {
            return true;
        }
        if (i == 0 || i == 180) {
            return false;
        }
        throw new IllegalArgumentException(wj6.h(i, "Invalid rotation degrees: "));
    }

    public static boolean d(Size size, boolean z, Size size2) {
        float f;
        float f2;
        if (z) {
            f = ((float) size.getWidth()) / ((float) size.getHeight());
            f2 = f;
        } else {
            f = (((float) size.getWidth()) + 1.0f) / (((float) size.getHeight()) - 1.0f);
            f2 = (((float) size.getWidth()) - 1.0f) / (((float) size.getHeight()) + 1.0f);
        }
        return f >= (((float) size2.getWidth()) - 1.0f) / (((float) size2.getHeight()) + 1.0f) && (((float) size2.getWidth()) + 1.0f) / (((float) size2.getHeight()) - 1.0f) >= f2;
    }

    public static Size e(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static String f(Rect rect) {
        Locale locale = Locale.US;
        int width = rect.width();
        int height = rect.height();
        return rect + "(" + width + "x" + height + ")";
    }

    public static Size g(Size size, int i) {
        boolean z = i % 90 == 0;
        bs0.m("Invalid rotation degrees: " + i, z);
        return c(h(i)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public static int h(int i) {
        return ((i % 360) + 360) % 360;
    }
}
