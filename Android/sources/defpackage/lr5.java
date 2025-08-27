package defpackage;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: lr5  reason: default package */
public final class lr5 implements TypeEvaluator {
    public final float[] a = new float[9];
    public final float[] b = new float[9];
    public final Matrix c = new Matrix();
    public final /* synthetic */ qr5 d;

    public lr5(qr5 qr5) {
        this.d = qr5;
    }

    public final Object evaluate(float f, Object obj, Object obj2) {
        this.d.p = f;
        float[] fArr = this.a;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.b;
        ((Matrix) obj2).getValues(fArr2);
        for (int i = 0; i < 9; i++) {
            float f2 = fArr2[i];
            float f3 = fArr[i];
            fArr2[i] = i2a.f(f2, f3, f, f3);
        }
        Matrix matrix = this.c;
        matrix.setValues(fArr2);
        return matrix;
    }
}
