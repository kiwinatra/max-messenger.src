package defpackage;

/* renamed from: rr4  reason: default package */
public final class rr4 {
    public final ht4 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final gt4 h;

    /* JADX WARNING: type inference failed for: r11v0, types: [gt4, java.lang.Object] */
    public rr4(ht4 ht4, int i, long j, long j2, int i2) {
        this(ht4, i, j, j2, -1, i2, 0, new Object());
    }

    public rr4(ht4 ht4, int i, long j, long j2, long j3, int i2, int i3, gt4 gt4) {
        gt4.getClass();
        boolean z = false;
        n79.g((i3 == 0) == (i != 4));
        if (i2 != 0) {
            if (!(i == 2 || i == 0)) {
                z = true;
            }
            n79.g(z);
        }
        this.a = ht4;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i2;
        this.g = i3;
        this.h = gt4;
    }
}
