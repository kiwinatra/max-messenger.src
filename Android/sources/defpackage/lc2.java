package defpackage;

import kotlin.ranges.RangesKt;

/* renamed from: lc2  reason: default package */
public final class lc2 {
    public long a;
    public long b;
    public long c;

    public double a(long j, long j2) {
        double d;
        this.c = RangesKt.coerceAtLeast(j - this.a, 0);
        long coerceAtLeast = RangesKt.coerceAtLeast(j2 - this.b, 0);
        if (coerceAtLeast == 0 && this.c == 0) {
            d = 0.0d;
        } else {
            long j3 = this.c;
            d = ((double) j3) / ((double) (coerceAtLeast + j3));
        }
        this.a = j;
        this.b = j2;
        return d;
    }
}
