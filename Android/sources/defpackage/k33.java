package defpackage;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;

/* renamed from: k33  reason: default package */
public final class k33 extends cc6 {
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public k33(jkf jkf, long j, long j2) {
        super(jkf);
        boolean z = false;
        if (jkf.i() == 1) {
            hkf n = jkf.n(0, new hkf(), 0);
            long max = Math.max(0, j);
            if (n.k || max == 0 || n.h) {
                long max2 = j2 == Long.MIN_VALUE ? n.m : Math.max(0, j2);
                long j3 = n.m;
                if (j3 != -9223372036854775807L) {
                    max2 = max2 > j3 ? j3 : max2;
                    if (max > max2) {
                        throw new ClippingMediaSource$IllegalClippingException(2);
                    }
                }
                this.f = max;
                this.g = max2;
                int i2 = (max2 > -9223372036854775807L ? 1 : (max2 == -9223372036854775807L ? 0 : -1));
                this.h = i2 == 0 ? -9223372036854775807L : max2 - max;
                if (n.i && (i2 == 0 || (j3 != -9223372036854775807L && max2 == j3))) {
                    z = true;
                }
                this.i = z;
                return;
            }
            throw new ClippingMediaSource$IllegalClippingException(1);
        }
        throw new ClippingMediaSource$IllegalClippingException(0);
    }

    public final ekf g(int i2, ekf ekf, boolean z) {
        this.e.g(0, ekf, z);
        long j = ekf.e - this.f;
        long j2 = this.h;
        ekf.j(ekf.a, ekf.b, 0, j2 == -9223372036854775807L ? -9223372036854775807L : j2 - j, j, q9.g, false);
        return ekf;
    }

    public final hkf n(int i2, hkf hkf, long j) {
        this.e.n(0, hkf, 0);
        long j2 = hkf.p;
        long j3 = this.f;
        hkf.p = j2 + j3;
        hkf.m = this.h;
        hkf.i = this.i;
        long j4 = hkf.l;
        if (j4 != -9223372036854775807L) {
            long max = Math.max(j4, j3);
            hkf.l = max;
            long j5 = this.g;
            if (j5 != -9223372036854775807L) {
                max = Math.min(max, j5);
            }
            hkf.l = max - j3;
        }
        long h0 = v0g.h0(j3);
        long j6 = hkf.e;
        if (j6 != -9223372036854775807L) {
            hkf.e = j6 + h0;
        }
        long j7 = hkf.f;
        if (j7 != -9223372036854775807L) {
            hkf.f = j7 + h0;
        }
        return hkf;
    }
}
