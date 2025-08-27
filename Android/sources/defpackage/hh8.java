package defpackage;

import android.graphics.Matrix;

/* renamed from: hh8  reason: default package */
public interface hh8 {
    Matrix a();

    float[] b(long j) {
        float[] fArr = new float[9];
        a().getValues(fArr);
        float[] fArr2 = new float[16];
        fArr2[10] = 1.0f;
        int i = 0;
        while (i < 3) {
            int i2 = 0;
            while (i2 < 3) {
                fArr2[((i == 2 ? 3 : i) * 4) + (i2 == 2 ? 3 : i2)] = fArr[(i * 3) + i2];
                i2++;
            }
            i++;
        }
        float[] fArr3 = new float[16];
        android.opengl.Matrix.transposeM(fArr3, 0, fArr2, 0);
        return fArr3;
    }

    boolean c(int i, int i2) {
        return false;
    }

    ode d(int i, int i2) {
        return new ode(i, i2);
    }
}
