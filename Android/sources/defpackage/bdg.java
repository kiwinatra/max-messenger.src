package defpackage;

/* renamed from: bdg  reason: default package */
public final class bdg {
    public static final bdg k;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;

    static {
        float[] fArr = hi7.e;
        float j0 = (float) ((((double) hi7.j0()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = hi7.c;
        float f2 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f3 = fArr[1];
        float f4 = (fArr3[1] * f3) + (fArr3[0] * f2);
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4;
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f2);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f2 * fArr5[0]);
        float f9 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp((double) (((-j0) - 42.0f) / 92.0f))) * 0.2777778f)) * 1.0f;
        double d2 = (double) exp;
        if (d2 > 1.0d) {
            exp = 1.0f;
        } else if (d2 < 0.0d) {
            exp = c44.DEFAULT_ASPECT_RATIO;
        }
        float[] fArr6 = {(((100.0f / f6) * exp) + 1.0f) - exp, (((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp};
        float f10 = 1.0f / ((5.0f * j0) + 1.0f);
        float f11 = f10 * f10 * f10 * f10;
        float f12 = 1.0f - f11;
        float cbrt = (0.1f * f12 * f12 * ((float) Math.cbrt(((double) j0) * 5.0d))) + (f11 * j0);
        float j02 = hi7.j0() / fArr[1];
        double d3 = (double) j02;
        float sqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d3, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * cbrt) * f6)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * cbrt) * f7)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * cbrt) * f8)) / 100.0d, 0.42d)};
        float f13 = fArr7[0];
        float f14 = (f13 * 400.0f) / (f13 + 27.13f);
        float f15 = fArr7[1];
        float f16 = (f15 * 400.0f) / (f15 + 27.13f);
        float f17 = fArr7[2];
        float[] fArr8 = {f14, f16, (400.0f * f17) / (f17 + 27.13f)};
        k = new bdg(j02, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * pow, pow, pow, f9, 1.0f, fArr6, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    public bdg(float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr, float f8, float f9, float f10) {
        this.f = f2;
        this.a = f3;
        this.b = f4;
        this.c = f5;
        this.d = f6;
        this.e = f7;
        this.g = fArr;
        this.h = f8;
        this.i = f9;
        this.j = f10;
    }
}
