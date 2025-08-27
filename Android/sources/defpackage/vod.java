package defpackage;

/* renamed from: vod  reason: default package */
public final class vod implements ay0 {
    public final kt4 a;
    public final long b;
    public final int c;
    public long o;
    public int v;

    public vod(kt4 kt4, long j, int i, long j2, int i2) {
        this.a = kt4;
        this.b = j;
        this.c = i;
        this.o = j2;
        this.v = i2;
    }

    public final float a() {
        float f;
        float f2;
        long j = this.b;
        if (j == -1 || j == 0) {
            int i = this.c;
            if (i == 0) {
                return -1.0f;
            }
            f = ((float) this.v) * 100.0f;
            f2 = (float) i;
        } else {
            f = ((float) this.o) * 100.0f;
            f2 = (float) j;
        }
        return f / f2;
    }

    public final void b(long j, long j2, long j3) {
        long j4 = this.o + j3;
        this.o = j4;
        ((dt4) this.a).b(a(), this.b, j4);
    }
}
