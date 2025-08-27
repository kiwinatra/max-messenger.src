package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: o4e  reason: default package */
public final class o4e extends q4e {
    public static final RectF h = new RectF();
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public float f;
    public float g;

    public o4e(float f2, float f3, float f4, float f5) {
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = h;
        rectF.set(this.b, this.c, this.d, this.e);
        path.arcTo(rectF, this.f, this.g, false);
        path.transform(matrix);
    }
}
