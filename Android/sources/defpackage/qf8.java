package defpackage;

/* renamed from: qf8  reason: default package */
public final class qf8 extends mz4 {
    public final float z;

    public qf8(float f) {
        this.z = f - 0.001f;
    }

    public final void u(float f, float f2, float f3, s4e s4e) {
        double d = (double) this.z;
        float sqrt = (float) ((Math.sqrt(2.0d) * d) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(d, 2.0d) - Math.pow((double) sqrt, 2.0d));
        s4e.d(f2 - sqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + sqrt2, 270.0f, c44.DEFAULT_ASPECT_RATIO);
        s4e.c(f2, (float) (-((Math.sqrt(2.0d) * d) - d)));
        s4e.c(f2 + sqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + sqrt2);
    }
}
