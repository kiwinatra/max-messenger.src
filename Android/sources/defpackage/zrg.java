package defpackage;

/* renamed from: zrg  reason: default package */
public final class zrg implements yrg {
    public float a;
    public final float b;
    public final float c;
    public float d;

    public zrg(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public final float a() {
        return this.b;
    }

    public final float b() {
        return this.c;
    }

    public final float c() {
        return this.a;
    }

    public final float d() {
        return this.d;
    }

    public final void e(float f) {
        if (f > 1.0f || f < c44.DEFAULT_ASPECT_RATIO) {
            throw new IllegalArgumentException("Requested linearZoom " + f + " is not within valid range [0..1]");
        }
        this.d = f;
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        float f2 = this.b;
        if (i != 0) {
            int i2 = (f > c44.DEFAULT_ASPECT_RATIO ? 1 : (f == c44.DEFAULT_ASPECT_RATIO ? 0 : -1));
            float f3 = this.c;
            if (i2 == 0) {
                f2 = f3;
            } else {
                double d2 = (double) (1.0f / f3);
                double d3 = 1.0d / (((((double) (1.0f / f2)) - d2) * ((double) f)) + d2);
                double d4 = (double) f3;
                double d5 = (double) f2;
                if (d3 < d4) {
                    d3 = d4;
                } else if (d3 > d5) {
                    d3 = d5;
                }
                f2 = (float) d3;
            }
        }
        this.a = f2;
    }

    public final void f(float f) {
        float f2 = this.b;
        int i = (f > f2 ? 1 : (f == f2 ? 0 : -1));
        float f3 = this.c;
        if (i > 0 || f < f3) {
            throw new IllegalArgumentException("Requested zoomRatio " + f + " is not within valid range [" + f3 + " , " + f2 + "]");
        }
        this.a = f;
        int i2 = (f2 > f3 ? 1 : (f2 == f3 ? 0 : -1));
        float f4 = c44.DEFAULT_ASPECT_RATIO;
        if (i2 != 0) {
            if (f == f2) {
                f4 = 1.0f;
            } else if (f != f3) {
                float f5 = 1.0f / f3;
                f4 = ((1.0f / f) - f5) / ((1.0f / f2) - f5);
            }
        }
        this.d = f4;
    }
}
