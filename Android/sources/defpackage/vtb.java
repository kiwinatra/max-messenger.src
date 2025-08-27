package defpackage;

import android.graphics.Matrix;

/* renamed from: vtb  reason: default package */
public final class vtb implements hh8 {
    public final int a;
    public final int b;
    public float c = -1.0f;
    public final int d = 0;
    public float e = -1.0f;
    public float f = -1.0f;
    public Matrix g = new Matrix();

    public vtb(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static vtb e(int i, int i2) {
        boolean z = false;
        n79.f("width " + i + " must be positive", i > 0);
        if (i2 > 0) {
            z = true;
        }
        n79.f("height " + i2 + " must be positive", z);
        return new vtb(i, i2);
    }

    public final Matrix a() {
        Matrix matrix = this.g;
        n79.p(matrix, "configure must be called first");
        return matrix;
    }

    public final boolean c(int i, int i2) {
        d(i, i2);
        Matrix matrix = this.g;
        n79.o(matrix);
        return matrix.isIdentity() && i == Math.round(this.e) && i2 == Math.round(this.f);
    }

    public final ode d(int i, int i2) {
        boolean z = false;
        n79.f("inputWidth must be positive", i > 0);
        if (i2 > 0) {
            z = true;
        }
        n79.f("inputHeight must be positive", z);
        Matrix matrix = new Matrix();
        this.g = matrix;
        float f2 = (float) i;
        this.e = f2;
        float f3 = (float) i2;
        this.f = f3;
        int i3 = this.b;
        int i4 = this.a;
        if (!(i4 == -1 || i3 == -1)) {
            this.c = ((float) i4) / ((float) i3);
        }
        float f4 = this.c;
        if (f4 != -1.0f) {
            float f5 = f2 / f3;
            int i5 = this.d;
            if (i5 == 0) {
                if (f4 > f5) {
                    matrix.setScale(f5 / f4, 1.0f);
                    this.e = this.f * this.c;
                } else {
                    matrix.setScale(1.0f, f4 / f5);
                    this.f = this.e / this.c;
                }
            } else if (i5 == 1) {
                if (f4 > f5) {
                    matrix.setScale(1.0f, f4 / f5);
                    this.f = this.e / this.c;
                } else {
                    matrix.setScale(f5 / f4, 1.0f);
                    this.e = this.f * this.c;
                }
            } else if (i5 == 2) {
                if (f4 > f5) {
                    this.e = f3 * f4;
                } else {
                    this.f = f2 / f4;
                }
            }
        }
        if (i3 != -1) {
            if (i4 != -1) {
                this.e = (float) i4;
            } else {
                this.e = (((float) i3) * this.e) / this.f;
            }
            this.f = (float) i3;
        }
        return new ode(Math.round(this.e), Math.round(this.f));
    }
}
