package defpackage;

/* renamed from: t90  reason: default package */
public final class t90 {
    public int a;
    public int b;
    public float c;
    public float d;
    public long e;
    public long f;
    public long g;
    public float h;
    public int i;

    public final float a(long j) {
        long j2 = this.e;
        if (j < j2) {
            return c44.DEFAULT_ASPECT_RATIO;
        }
        long j3 = this.g;
        if (j3 < 0 || j < j3) {
            return wz7.b(((float) (j - j2)) / ((float) this.a), c44.DEFAULT_ASPECT_RATIO, 1.0f) * 0.5f;
        }
        float f2 = this.h;
        return (wz7.b(((float) (j - j3)) / ((float) this.i), c44.DEFAULT_ASPECT_RATIO, 1.0f) * f2) + (1.0f - f2);
    }
}
