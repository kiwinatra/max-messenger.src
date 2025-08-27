package defpackage;

/* renamed from: l60  reason: default package */
public final class l60 {
    public static final float[] d = new float[3];
    public final long[] a = new long[3];
    public float b;
    public float c;

    static {
        float f = c44.DEFAULT_ASPECT_RATIO;
        float f2 = 0.0f;
        for (int i = 0; i < 3; i++) {
            float[] fArr = d;
            float exp = (float) Math.exp((double) i);
            fArr[i] = exp;
            f2 += exp;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            float[] fArr2 = d;
            float f3 = fArr2[i2] / f2;
            fArr2[i2] = f3;
            f += f3;
        }
        d[2] = 1.0f - f;
    }

    public final void a(long j) {
        float f = (float) j;
        this.c = f;
        this.b = c44.DEFAULT_ASPECT_RATIO;
        int i = 0;
        while (true) {
            long[] jArr = this.a;
            int length = jArr.length - 1;
            float[] fArr = d;
            if (i < length) {
                int i2 = i + 1;
                long j2 = jArr[i2];
                jArr[i] = j2;
                this.b = (fArr[i] * ((float) j2)) + this.b;
                i = i2;
            } else {
                jArr[jArr.length - 1] = j;
                this.b = (fArr[jArr.length - 1] * f) + this.b;
                return;
            }
        }
    }
}
