package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;

/* renamed from: wdd  reason: default package */
public final class wdd implements xdd {
    public final xdd a;
    public final xdd b;
    public final Rect c;
    public final Rect d;
    public final PointF e;
    public final PointF f;
    public final float[] g = new float[9];
    public final float[] h = new float[9];
    public final float[] i = new float[9];
    public float j;

    public wdd(m58 m58, m58 m582, Rect rect, Rect rect2) {
        this.a = m58;
        this.b = m582;
        this.c = rect;
        this.d = rect2;
        this.e = null;
        this.f = null;
    }

    public final Matrix a(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3) {
        Matrix matrix2 = matrix;
        Rect rect2 = this.c;
        Rect rect3 = rect2 != null ? rect2 : rect;
        Rect rect4 = this.d;
        Rect rect5 = rect4 != null ? rect4 : rect;
        PointF pointF = this.e;
        this.a.a(matrix, rect3, i2, i3, pointF == null ? f2 : pointF.x, pointF == null ? f3 : pointF.y);
        float[] fArr = this.g;
        matrix.getValues(fArr);
        PointF pointF2 = this.f;
        this.b.a(matrix, rect5, i2, i3, pointF2 == null ? f2 : pointF2.x, pointF2 == null ? f3 : pointF2.y);
        float[] fArr2 = this.h;
        matrix.getValues(fArr2);
        int i4 = 0;
        while (true) {
            float[] fArr3 = this.i;
            if (i4 < 9) {
                float f4 = fArr[i4];
                float f5 = this.j;
                fArr3[i4] = (fArr2[i4] * f5) + ((1.0f - f5) * f4);
                i4++;
            } else {
                matrix.setValues(fArr3);
                return matrix2;
            }
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.b);
        String valueOf4 = String.valueOf(this.f);
        StringBuilder r = rae.r("InterpolatingScaleType(", valueOf, " (", valueOf2, ") -> ");
        r.append(valueOf3);
        r.append(" (");
        r.append(valueOf4);
        r.append("))");
        return r.toString();
    }
}
