package defpackage;

/* renamed from: yi3  reason: default package */
public final class yi3 implements skf {
    public final float a;
    public final double b;
    public final int c;
    public final long o;
    public final long v;
    public int w;

    public yi3(float f, long j, long j2) {
        boolean z = false;
        n79.g(j2 > 0);
        n79.g(f > c44.DEFAULT_ASPECT_RATIO);
        if (0 <= j && j < j2) {
            z = true;
        }
        n79.g(z);
        this.o = j;
        this.v = j2;
        this.a = f;
        this.c = Math.round((((float) (j2 - j)) / 1000000.0f) * f);
        this.b = (double) (1000000.0f / f);
    }

    public final skf a() {
        return new yi3(this.a, this.o, this.v);
    }

    public final boolean hasNext() {
        return this.w < this.c;
    }

    public final long next() {
        n79.n(hasNext());
        int i = this.w;
        this.w = i + 1;
        long round = Math.round(this.b * ((double) i)) + this.o;
        n79.n(round >= 0);
        return round;
    }
}
